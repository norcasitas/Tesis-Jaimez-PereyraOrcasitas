/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import java.io.Writer;
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
import tesis.controllers.Main;

/**
 *
 * @author nico
 */
public class InvokeWS {

    private SOAPMessage getSoapMessageFromString(String xml) throws SOAPException, IOException {
        MessageFactory factory = MessageFactory.newInstance();
        SOAPMessage message = factory.createMessage(new MimeHeaders(), new ByteArrayInputStream(xml.getBytes(Charset.forName("UTF-8"))));
        return message;
    }

    private String callWS(Definitions defs, String portType, String operation, String binding, String url, ArrayList<Object> parameters) {
        String result = "";
        StringWriter writer = new StringWriter();
        SOARequestCreator creator = new SOARequestCreator(defs, new RequestTemplateCreator(), new MarkupBuilder(writer));
        creator.setBuilder(new MarkupBuilder(writer));
        //creator.createRequest(PortType name, Operation name, Binding name);
        creator.createRequest(portType, operation, binding);
        String s = writer.toString();
        String pattern = "\\?.*\\?";
        for (Object param : parameters) {
            s = s.replaceFirst(pattern, param.toString());
        }
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

    public String obtainDataAndCallWS(String url, String name, ArrayList<Object> parameters) {
        WSDLParser parser = new WSDLParser();
        Definitions defs = parser.parse(url);
        List<Binding> bindings = defs.getBindings();
        //System.out.println(defs.getPortTypes().get(0).getOperation("GetWeather"));
        for (Binding binding : bindings) {
            //es protocolo SOAP V 1.1 O V 1.2
            if (binding.getBinding() instanceof SOAPBinding || binding.getBinding() instanceof com.predic8.wsdl.soap12.SOAPBinding) {
                PortType portType = defs.getPortType(binding.getType());
                Operation operation = portType.getOperation(name);
                //parameters.add("Argentina");
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

    public static void main(String[] args) {
        WSDLParser parser = new WSDLParser();
        try {
            Definitions defs = parser.parse("http://localhost:8080/WebApplication1/NewWebService?WSDL");
            InvokeWS i = new InvokeWS();
            List<Binding> bindings = defs.getBindings();
            int j = 0;
            for (Binding binding : bindings) {
                //es protocolo SOAP V 1.1 O V 1.2
                if (binding.getBinding() instanceof SOAPBinding || binding.getBinding() instanceof com.predic8.wsdl.soap12.SOAPBinding) {
                    List<BindingOperation> operations = binding.getOperations();
                    for (BindingOperation bindingOperation : operations) {
                        PortType portType = defs.getPortType(binding.getType());
                        Operation operation = portType.getOperation(bindingOperation.getName());
                        System.out.println(j + i.callWS(defs, portType.getName(), operation.getName(), binding.getName(), "http://localhost:8080/WebApplication1/NewWebService?WSDL", new ArrayList<>()));
                    j++;
                    }      
                }

            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
