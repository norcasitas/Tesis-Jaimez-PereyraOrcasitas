package t2m;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import javax.xml.namespace.QName;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.xml.sax.SAXException;

import com.predic8.wsdl.Binding;
import com.predic8.wsdl.BindingOperation;
import com.predic8.wsdl.Definitions;
import com.predic8.wsdl.Operation;
import com.predic8.wsdl.PortType;
import com.predic8.wsdl.WSDLParser;

import tesis.wsdl_ecore.wsdl.Definition;
import tesis.wsdl_ecore.wsdl.Input;
import tesis.wsdl_ecore.wsdl.Message;
import tesis.wsdl_ecore.wsdl.Part;
import tesis.wsdl_ecore.wsdl.WsdlFactory;


public class T2Mwsdl {


		
		  public static void main(String[] args) throws FileNotFoundException, SAXException, IOException, ParserConfigurationException {
		    // Retrieve the default factory singleton
		    WsdlFactory factory = WsdlFactory.eINSTANCE;
		    // create an instance of myWeb
		    Definition myWSDL = factory.createDefinition();

			  
		    WSDLParser parser = new WSDLParser();
		    
		    Definitions defs = parser
		        .parse("helloService.wsdl");
		    
		    //obtengo los definitions
		    for(Definitions df: defs.getAllWSDLs()){
		    	if(df.getName()!=null){
			    	System.out.println("name:" +df.getName());
			    	myWSDL.setQName(QName.valueOf(df.getName()));
		    	}
		    	System.out.println("targetnameSpace: "+df.getTargetNamespace());
		    	myWSDL.setTargetNamespace(df.getTargetNamespace());
		    	System.out.println("xmlns: "+df.getNamespaceContext());
		    	//obtengo messages
		    	for(com.predic8.wsdl.Message msg: df.getMessages()){
		    		System.out.println("	message name: "+msg.getName());
				    Message msgFactory = factory.createMessage();		
				    myWSDL.getEMessages().add(msgFactory);
		    		for(com.predic8.wsdl.Part part: msg.getParts()){
		    			System.out.println("		part name: " +part.getName() +" type: "+ part.getTypePN() );
					    System.out.println("ppp"+part.getElementPN()+"sss");

		    			Part partFactory = factory.createPart();
		    			partFactory.setName(part.getName());
					    if(part.getTypePN()!=null )
					    	partFactory.setTypeName(QName.valueOf(part.getTypePN().toString()));
					    msgFactory.getEParts().add(partFactory);

		    		}
		    		msgFactory.setQName(QName.valueOf(msg.getName()));

		    	}
		    	for(PortType portType:df.getPortTypes()){
		    		System.out.println("portType name:"+ portType.getName());
		    		tesis.wsdl_ecore.wsdl.PortType pt = factory.createPortType();
		    		pt.setQName(QName.valueOf(portType.getName()));
				      for (Operation op : portType.getOperations()) {
				    	  tesis.wsdl_ecore.wsdl.Operation operation=factory.createOperation();
				    	  	operation.setName(op.getName());
					        System.out.println("	op name: " + op.getName());
					        System.out.println(op.getInput().getMessage().getName());
					        Message msg=factory.createMessage();
					        //msg.setQName(QName.valueOf("tns:SayHelloRequest"));
					        Input input = factory.createInput();
					        System.out.println(myWSDL.getEMessages().get(0).getQName());
					        msg = myWSDL.getEMessages().get(0);
					        input.setEMessage(msg);
					        operation.setEInput(input);
					        pt.getEOperations().add(operation);
					  }
				      myWSDL.getEPortTypes().add(pt);
				      
				      
		    	}
		    	tesis.wsdl_ecore.wsdl.Binding bindingFactory =factory.createBinding();
		    	for(Binding binding: defs.getLocalBindings()){
		    		bindingFactory.setQName(QName.valueOf(binding.getName()));
		    		for(BindingOperation bindingOp:binding.getOperations()){
		    			tesis.wsdl_ecore.wsdl.BindingOperation bindingOpFactory =factory.createBindingOperation();
			    		bindingOpFactory.setName(bindingOp.getName());

			    		tesis.wsdl_ecore.wsdl.BindingInput bindingOpInputFactory =factory.createBindingInput();
			    		tesis.wsdl_ecore.wsdl.BindingOutput bindingOpOutputFactory =factory.createBindingOutput();
		    			bindingOpFactory.setEBindingInput(bindingOpInputFactory);
		    			bindingOpFactory.setEBindingOutput(bindingOpOutputFactory);

			    		bindingFactory.getEBindingOperations().add(bindingOpFactory);

		    		}

		    	}
		    	myWSDL.getEBindings().add(bindingFactory);
		    	
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

