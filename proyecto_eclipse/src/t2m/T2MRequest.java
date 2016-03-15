package t2m;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.xml.sax.SAXException;

import tesis.request_model.RequestModel.Method;
import tesis.request_model.RequestModel.Parameter;
import tesis.request_model.RequestModel.RequestModel;
import tesis.request_model.RequestModel.RequestModelFactory;
import tesis.request_model.RequestModel.RequestModelPackage;
import tesis.request_model.RequestModel.impl.RequestModelFactoryImpl;



public class T2MRequest {

	public RequestModel loadFromXMI(String path) throws IOException{
		RequestModelFactory fac= RequestModelFactory.eINSTANCE;
		RequestModelPackage pack=RequestModelPackage.eINSTANCE;
		EPackage packag=pack.getEFactoryInstance().getEPackage();
		// Register the XMI resource factory for the  extnsion
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());
		   // Obtain a new resource set
	    ResourceSet resSet = new ResourceSetImpl();
	    resSet.getPackageRegistry().put(packag.getNsURI(), packag);
	    // Get the resource	    
	    Resource resource = resSet.getResource(URI.createURI(path+".xmi"), true);
	    // Get the first model element and cast it to the right type, in my
	    // example everything is hierarchical included in this first node
	    RequestModel request = (RequestModel) resource.getContents().get(0);
	    return request;
	}
	
	
	  public static void main(String[] args) throws FileNotFoundException, SAXException, IOException, ParserConfigurationException {
		 T2MRequest t2mRequest = new T2MRequest();
		 RequestModel request = t2mRequest.loadFromXMI("output");
		 System.out.println(request.getName());
		 System.out.println(request.getMethods().get(0).getName());
	  }
	
}
