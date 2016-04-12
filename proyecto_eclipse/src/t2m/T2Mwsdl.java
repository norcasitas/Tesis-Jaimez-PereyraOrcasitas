package t2m;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

import javax.xml.namespace.QName;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.omg.CORBA.OMGVMCID;
import org.xml.sax.SAXException;

import com.predic8.wsdl.Definitions;
import com.predic8.wsdl.Operation;
import com.predic8.wsdl.PortType;
import com.predic8.wsdl.WSDLParser;

import tesis.wsdl_ecore.wsdl.Definition;
import tesis.wsdl_ecore.wsdl.Input;
import tesis.wsdl_ecore.wsdl.Message;
import tesis.wsdl_ecore.wsdl.Output;
import tesis.wsdl_ecore.wsdl.Part;
import tesis.wsdl_ecore.wsdl.WsdlFactory;


public class T2Mwsdl {

	private WsdlFactory factory;
	private Definition definition;
	
	public T2Mwsdl(){
	    factory = WsdlFactory.eINSTANCE;
	}
	
	/**
	 * Parsea una Definition de un achivo wsdl y retorna una Definition
	 * del modelo wsdl.ecore
	 * @param df
	 * @return
	 */
	private Definition getDefinitions(Definitions df){
		definition =  factory.createDefinition();
		if(df.getName()!=null) //set the name of wsdl
			definition.setQName(QName.valueOf(df.getName()));
		for(com.predic8.wsdl.Message msg: df.getMessages()){
			definition.getEMessages().add(parserMessage(msg));
		}
		for(PortType portType: df.getPortTypes()){
			definition.getEPortTypes().add(parserPortType(portType));
		}
		return definition;
	}

	/**
	 * Parsea un message de un archivo wsdl y retorna un Message 
	 * de un modelo wsdl.ecore
	 * @param msg
	 * @return
	 */
	private Message parserMessage(com.predic8.wsdl.Message msg){
	    Message msgFactory = factory.createMessage();		
		msgFactory.setQName(QName.valueOf(msg.getName()));
		for(com.predic8.wsdl.Part part: msg.getParts()){
		    msgFactory.getEParts().add(parserPart(part));
		}
		return msgFactory;
		
	}
	
	/**
	 * Parsea un Part de un archivo wsdl y retorna un Part 
	 * de un modelo wsdl.ecore
	 * @param part
	 * @return
	 */
	private Part parserPart(com.predic8.wsdl.Part part){
		Part partFactory = factory.createPart();
		partFactory.setName(part.getName());
		if(part.getTypePN()!=null )
	    	partFactory.setTypeName(QName.valueOf(part.getTypePN().toString()));
		return partFactory;
	}

	/**
	 * Parsea un PortType de un archivo wsdl y retorna un PortType 
	 * de un modelo wsdl.ecore
	 * @param portType
	 * @return
	 */
	private tesis.wsdl_ecore.wsdl.PortType parserPortType(PortType portType){
		tesis.wsdl_ecore.wsdl.PortType portTypeFactory = factory.createPortType();
		portTypeFactory.setQName(QName.valueOf(portType.getName()));
		for(Operation operation: portType.getOperations()){
			portTypeFactory.getEOperations().add(parserOperation(operation));

		}
		return portTypeFactory;

	}
	
	/**
	 * Parsea una Operation de un archivo wsdl y retorna una Operation 
	 * de un modelo wsdl.ecore
	 * @param operation
	 * @return
	 */
	private tesis.wsdl_ecore.wsdl.Operation parserOperation(Operation operation){
		tesis.wsdl_ecore.wsdl.Operation operationFactory=factory.createOperation();
		operationFactory.setName(operation.getName());
		operationFactory.setEInput(parserInput(operation.getInput()));
		operationFactory.setEOutput(parserOutput(operation.getOutput()));
		if(operation.getDocumentation()!=null)
			operationFactory.setDocumentation(operation.getDocumentation().getContent());
		return operationFactory;
	}
	
	/**
	 * Parsea un Input de un archivo wsdl y retorna un Input 
	 * de un modelo wsdl.ecore
	 * @param input
	 * @return
	 */
	private Input parserInput(com.predic8.wsdl.Input input){
        Input inputFactory = factory.createInput();
        inputFactory.setEMessage(findMessage(input.getMessage().getName()));
		return inputFactory;
	}
	
	/**
	 * Parsea un Output de un archivo wsdl y retorna un Output 
	 * de un modelo wsdl.ecore
	 * @param output
	 * @return
	 */
	private Output parserOutput(com.predic8.wsdl.Output output){
        Output outputFactory = factory.createOutput();
        outputFactory.setEMessage(findMessage(output.getMessage().getName()));
        return outputFactory;
	}
	

	/**
	 * Dado el nombre de un message, lo busca en la lista de messages de Definition
	 * y lo retorna, en caso de no existir, retorna null
	 * @param name
	 * @return
	 */
	private Message findMessage(String name){
		Iterator<Message> it=definition.getEMessages().iterator();
		while(it.hasNext()){
			Message msg= it.next();
			if(msg.getQName().toString()== name){
				return msg;
			}
		}
		return null;
	}
	
	public ArrayList<String> transformT2M(String inputFile){
		T2Mwsdl t2Model = new T2Mwsdl();
		WSDLParser parser = new WSDLParser();	    
		Definitions defs = parser.parse(inputFile);
		ArrayList<String> namesOfDefinitions = new ArrayList<String>();
		//obtengo los definitions
		for(Definitions df: defs.getAllWSDLs()){
			Definition definition = t2Model.getDefinitions(df);
			Utils.exportWSDLtoXMI(definition);
			namesOfDefinitions.add(definition.getQName().toString());
		}
		return namesOfDefinitions;
	}
		  
}

