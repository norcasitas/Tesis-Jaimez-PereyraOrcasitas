package t2m;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.xml.sax.SAXException;

import tesis.request_model.RequestModel.Method;
import tesis.request_model.RequestModel.Parameter;
import tesis.request_model.RequestModel.RequestModel;
import tesis.request_model.RequestModel.RequestModelFactory;



public class T2MRequest {

	
	  public static void main(String[] args) throws FileNotFoundException, SAXException, IOException, ParserConfigurationException {
		 
		  RequestModelFactory factory = RequestModelFactory.eINSTANCE;		
		  RequestModel requestModel = factory.createRequestModel();
		  requestModel.setName("helloService.wsdl");
		  
		  Method method1 = factory.createMethod();
		  method1.setName("getClimaCelsius");
		  method1.setDescription("retorna el clima en celsius");
		  Parameter inParameter1 = factory.createParameter();
		  inParameter1.setName("ciudad");
		  inParameter1.setType("String");
		  method1.getInParameters().add(inParameter1);
		  Parameter outParameter1 = factory.createParameter();
		  outParameter1.setName("temperatura");
		  outParameter1.setType("Int");
		  method1.getOutParameters().add(outParameter1);
		  
		  Method method2 = factory.createMethod();
		  method2.setName("getClimaFarangheit");
		  method2.setDescription("retorna el clima en farangheit");
		  Parameter inParameter2 = factory.createParameter();
		  inParameter2.setName("ciudad");
		  inParameter2.setType("String");
		  method2.getInParameters().add(inParameter2);
		  Parameter outParameter2 = factory.createParameter();
		  outParameter2.setName("temperatura");
		  outParameter2.setType("Int");
		  method2.getOutParameters().add(outParameter2);


		  requestModel.getMethods().add(method1);
		  requestModel.getMethods().add(method2);
		    
//PARA PODER EXPORTAR EL MODELO A XMI
		    
		    
		    // Register the XMI resource factory for the .website extension

		    Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		    Map<String, Object> m = reg.getExtensionToFactoryMap();
		    m.put("xmi", new XMIResourceFactoryImpl());

		    // Obtain a new resource set
		    ResourceSet resSet = new ResourceSetImpl();

		    // create a resource
		    Resource resource = resSet.createResource(org.eclipse.emf.common.util.URI.createURI("requestModel.xmi"));
		    // Get the first model element and cast it to the right type, in my
		    // example everything is hierarchical included in this first node
		    resource.getContents().add(requestModel);

		    // now save the content.
		    try {
		      resource.save(Collections.EMPTY_MAP);
		    } catch (IOException e) {
		      // TODO Auto-generated catch block
		      e.printStackTrace();
		    }
	  }
	
}
