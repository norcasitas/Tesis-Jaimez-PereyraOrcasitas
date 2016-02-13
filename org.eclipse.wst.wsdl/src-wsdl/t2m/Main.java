package t2m;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.util.Collections;
import java.util.Map;

import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import tesis.unrc.wsdl.wsdl.Definition;
import tesis.unrc.wsdl.wsdl.Message;
import tesis.unrc.wsdl.wsdl.Part;
import tesis.unrc.wsdl.wsdl.WSDLFactory;
import tesis.unrc.wsdl.wsdl.WSDLPackage;
import com.predic8.wsdl.*;

public class Main {

	
		  public static void main(String[] args) throws FileNotFoundException, SAXException, IOException, ParserConfigurationException {
			 WSDLPackage f= WSDLPackage.eINSTANCE;

		    // Retrieve the default factory singleton
		    WSDLFactory factory = WSDLFactory.eINSTANCE;
		    // create an instance of myWeb
		    Definition myWSDL = factory.createDefinition();

			  
		    WSDLParser parser = new WSDLParser();
		    
		    Definitions defs = parser
		        .parse("helloService.wsdl");
		    
		    //obtengo los definitions
		    for(Definitions df: defs.getAllWSDLs()){
		    	System.out.println("name:" +df.getName());
		    	myWSDL.setQName(QName.valueOf(df.getName()));
		    	System.out.println("targetnameSpace: "+df.getTargetNamespace());
		    	myWSDL.setTargetNamespace(df.getTargetNamespace());
		    	System.out.println("xmlns: "+df.getNamespaceContext());
		    	//obtengo messages
		    	for(com.predic8.wsdl.Message msg: df.getMessages()){
		    		System.out.println("	message name: "+msg.getName());
				    Message msgRequest = factory.createMessage();				    
				    myWSDL.getEMessages().add(msgRequest);
		    		for(com.predic8.wsdl.Part part: msg.getParts()){
		    			System.out.println("		part name: " +part.getName() +" type: "+ part.getTypePN() );
		    			Part partRequest = factory.createPart();
					    partRequest.setName(part.getName());
					    partRequest.setTypeName(QName.valueOf(part.getTypePN().toString()));
					    msgRequest.getEParts().add(partRequest);

		    		}
				    msgRequest.setQName(QName.valueOf(msg.getName()));

		    	}
		    	for(PortType portType:df.getPortTypes()){
		    		System.out.println("portType name:"+ portType.getName());
		    		tesis.unrc.wsdl.wsdl.PortType pt = factory.createPortType();
		    		pt.setQName(QName.valueOf(portType.getName()));
				      for (Operation op : portType.getOperations()) {
				    	  	tesis.unrc.wsdl.wsdl.Operation operation=factory.createOperation();
				    	  	operation.setName(op.getName());
					        System.out.println("	op name: " + op.getName());
					        pt.getEOperations().add(operation);
					  }
				      myWSDL.getEPortTypes().add(pt);
				      
				      
		    	}
		    }
		 
		  //PARA PODER EXPORTAR EL MODELO A XMI
		    
		    
		    // Register the XMI resource factory for the .website extension

		    Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		    Map<String, Object> m = reg.getExtensionToFactoryMap();
		    m.put("xmi", new XMIResourceFactoryImpl());

		    // Obtain a new resource set
		    ResourceSet resSet = new ResourceSetImpl();

		    // create a resource
		    Resource resource = resSet.createResource(org.eclipse.emf.common.util.URI.createURI("wsdl.xmi"));
		    // Get the first model element and cast it to the right type, in my
		    // example everything is hierarchical included in this first node
		    resource.getContents().add(myWSDL);

		    // now save the content.
		    try {
		      resource.save(Collections.EMPTY_MAP);
		    } catch (IOException e) {
		      // TODO Auto-generated catch block
		      e.printStackTrace();
		    }
		    
		    
		  }
		    
		  

		  
}
