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
		    myWSDL.setQName(QName.valueOf("HelloService"));
		    myWSDL.setTargetNamespace("http://www.examples.com/wsdl/HelloService.wsdl");
		    
		    Message msgReq = factory.createMessage();
		    msgReq.setQName(QName.valueOf("SayHelloRequest"));
		    
		    Part partReq = factory.createPart();
		    partReq.setName("firstName");
		    partReq.setTypeName(QName.valueOf("xsd:string"));
		    
		    msgReq.getEParts().add(partReq);
		    myWSDL.getEMessages().add(msgReq);
		    
		    
		    Message msgRes = factory.createMessage();
		    msgRes.setQName(QName.valueOf("SayHelloResponse"));
		    
		    Part partRes = factory.createPart();
		    partRes.setName("greeting");
		    partRes.setTypeName(QName.valueOf("xsd:string"));
		    
		    msgRes.getEParts().add(partRes);
		    myWSDL.getEMessages().add(msgRes);

		   // System.out.println(myWSDL.toString());
		   // System.out.println(myWSDL.getEMessages());
		    
		    /*
		    
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
		    */
			  
		    WSDLParser parser = new WSDLParser();
		    
		    Definitions defs = parser
		        .parse("helloService.wsdl");
		    
		    //obtengo los definitions
		    for(Definitions df: defs.getAllWSDLs()){
		    	System.out.println("name:" +df.getName());
		    	System.out.println("targetnameSpace: "+df.getTargetNamespace());
		    	System.out.println("xmlns: "+df.getNamespaceContext());
		    	//obtengo messages
		    	for(com.predic8.wsdl.Message msg: df.getMessages()){
		    		System.out.println("	message name: "+msg.getName());
		    		for(com.predic8.wsdl.Part part: msg.getParts()){
		    			System.out.println("		part name: " +part.getName() +" type: "+ part.getTypePN() );
		    		}
		    	}
		    	for(PortType portType:df.getPortTypes()){
		    		System.out.println("portType name:"+ portType.getName());
				      for (Operation op : portType.getOperations()) {
					        System.out.println("	op name: " + op.getName());
					      }
		    	}
		    }
		 
		    /*for (PortType pt : defs.getPortTypes()) {
		      System.out.println(pt.getName());
		      for (Operation op : pt.getOperations()) {
		        System.out.println(" -" + op.getName());
		      }
		    }*/
		    
		  }
		    
		  

		  
}
