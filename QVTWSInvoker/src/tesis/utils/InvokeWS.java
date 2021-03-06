
package tesis.utils;

import com.predic8.wsdl.Binding;
import com.predic8.wsdl.BindingOperation;
import com.predic8.wsdl.Definitions;
import com.predic8.wsdl.Operation;
import com.predic8.wsdl.PortType;
import com.predic8.wsdl.WSDLParser;
import com.predic8.wsdl.soap11.SOAPBinding;
import com.predic8.wstool.creator.RequestTemplateCreator;
import com.predic8.wstool.creator.SOARequestCreator;
import groovy.xml.MarkupBuilder;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.MimeHeaders;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import tesis.crud.WsdlCRUD;
import tesis.models.Wsdl;

public class InvokeWS {

    /**
     * generate a soapMessage from a string
     *
     * @param xml
     * @return
     * @throws SOAPException
     * @throws IOException
     */
    private SOAPMessage getSoapMessageFromString(String xml) throws SOAPException, IOException {
        MessageFactory factory = MessageFactory.newInstance();
        SOAPMessage message = factory.createMessage(new MimeHeaders(), new ByteArrayInputStream(xml.getBytes(Charset.forName("UTF-8"))));
        return message;
    }

    /**
     * Invokes a method of a ws
     *
     * @param defs
     * @param portType
     * @param operation
     * @param binding
     * @param url
     * @param parameters
     * @return
     */
    private String callWS(Definitions defs, String portType, String operation, String binding, String url, ArrayList<Object> parameters) {
        String result;
        StringWriter writer = new StringWriter();
        SOARequestCreator creator = new SOARequestCreator(defs, new RequestTemplateCreator(), new MarkupBuilder(writer));
        creator.setBuilder(new MarkupBuilder(writer));
        creator.createRequest(portType, operation, binding);
        String s = writer.toString();
        String pattern = "\\?.*\\?";
        // replaces default value 
        for (Object param : parameters) {
            s = s.replaceFirst(pattern, param.toString());
        }
        // replaces all remaining parameters for empty strings
        s = s.replaceAll(pattern, "");
        try {
            // Create SOAP Connection
            SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
            SOAPConnection soapConnection = soapConnectionFactory.createConnection();
            // Send SOAP Message to SOAP Server
            SOAPMessage soapResponse = soapConnection.call(getSoapMessageFromString(s), url);
            result = printSOAPResponse(soapResponse);
            // Process the SOAP Response
            soapConnection.close();
        } catch (Exception e) {
            System.err.println("Error occurred while sending SOAP Request to Server");
            e.printStackTrace();
            result = "Error occurred while sending SOAP Request to Server";
        }
        return result;
    }

    /**
     *  invoke the wsdl only with the url, name and parameters
     *
     * @param url
     * @param name
     * @param parameters
     * @return
     */
    public String obtainDataAndCallWS(String url, String name, ArrayList<Object> parameters) {
        WSDLParser parser = new WSDLParser();
        Definitions defs = parser.parse(url);
        List<Binding> bindings = defs.getBindings();
        for (Binding binding : bindings) {
            //SOAP V 1.1 O V 1.2 protocol
            if (binding.getBinding() instanceof SOAPBinding || binding.getBinding() instanceof com.predic8.wsdl.soap12.SOAPBinding) {
                PortType portType = defs.getPortType(binding.getType());
                Operation operation = portType.getOperation(name);
                return callWS(defs, portType.getName(), operation.getName(), binding.getName(), url, parameters);
            }
        }
        return "Error occurred, not found the operation";
    }

    /**
     * Method used to print the SOAP Response
     */
    private String printSOAPResponse(SOAPMessage soapResponse) throws Exception {
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        Source sourceContent = soapResponse.getSOAPPart().getContent();
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        StreamResult result = new StreamResult(out);
        transformer.transform(sourceContent, result);
        return new String(out.toByteArray());
    }

    /**
     *  invoke all wsdl and check its qos
     */
    public void qoSStatistics() {
        WSDLParser parser = new WSDLParser();
        WsdlCRUD wsdlCRUD = new WsdlCRUD();
        for (Wsdl w : wsdlCRUD.findAll()) {
            try {
                Definitions defs = parser.parse(w.getString("url"));
                InvokeWS i = new InvokeWS();
                List<Binding> bindings = defs.getBindings();
                long totalTime = 0;
                int quantity = 1;
                for (Binding binding : bindings) {
                    // SOAP V 1.1 O V 1.2 protocol
                    if (binding.getBinding() instanceof SOAPBinding || binding.getBinding() instanceof com.predic8.wsdl.soap12.SOAPBinding) {
                        List<BindingOperation> operations = binding.getOperations();
                        for (BindingOperation bindingOperation : operations) {
                            quantity++;
                            PortType portType = defs.getPortType(binding.getType());
                            Operation operation = portType.getOperation(bindingOperation.getName());
                            long startTime = System.nanoTime();
                            i.callWS(defs, portType.getName(), operation.getName(), binding.getName(), w.getString("url"), new ArrayList<>());
                            long endTime = System.nanoTime();
                            totalTime += (endTime - startTime);
                        }
                    }
                }
                totalTime += w.getLong("response");
                w.setLong("response", totalTime / quantity);
                w.setLong("availability", (w.getLong("availability") + 1) / 2);
                wsdlCRUD.editStatistics(w);
            } catch (Exception e) {
                if (w.getLong("availability") > 1) {
                    w.setLong("availability", (w.getLong("availability") - 1) / 2);
                } else {
                    w.setLong("availability", 0);
                }

            }
        }

    }

}
