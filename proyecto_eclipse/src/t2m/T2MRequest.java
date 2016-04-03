package t2m;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.xml.sax.SAXException;

import tesis.request_model.RequestModel.Method;
import tesis.request_model.RequestModel.Parameter;
import tesis.request_model.RequestModel.RequestModel;
import tesis.request_model.RequestModel.RequestModelFactory;
import tesis.request_model.RequestModel.RequestModelPackage;
import tesis.request_model.RequestModel.impl.RequestModelFactoryImpl;
import tesis.wsdl_ecore.wsdl.WsdlFactory;


public class T2MRequest {

	EPackage requestModelEPackage;
	
	
	public RequestModel loadFromXMI(String path) throws IOException{
		 RequestModelPackage.eINSTANCE.eClass();  
		 RequestModelPackage packageInstance = RequestModelPackage.eINSTANCE;
		    Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		    Map<String, Object> m = reg.getExtensionToFactoryMap();
		    m.put("*", new XMIResourceFactoryImpl());
		    // Obtain a new resource set
		    ResourceSet resSet = new ResourceSetImpl();
		    resSet.setResourceFactoryRegistry(reg);
		    resSet.getPackageRegistry().put(RequestModelPackage.eNS_URI,RequestModelPackage.eINSTANCE);
		    resSet.getPackageRegistry().put(null,RequestModelPackage.eINSTANCE);
		    URI uri= URI.createURI(path+".xmi");
		    Resource resource = resSet.getResource(uri, true);
		    RequestModel r = (RequestModel) resource.getContents().get(0);
	    return r;
	}
	

	
	  public static void main(String[] args) throws FileNotFoundException, SAXException, IOException, ParserConfigurationException {
		 T2MRequest t2mRequest = new T2MRequest();
		 RequestModel request = t2mRequest.loadFromXMI("output");
		 System.out.println(request.getName());
		 System.out.println(request.getMethods().get(0).getName());
		 
	  }
	  
	  
	
}
