package utils;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import tesis.request_model.RequestModel.RequestModel;
import tesis.request_model.RequestModel.RequestModelPackage;
import tesis.wsdl_ecore.wsdl.Definition;
import tesis.wsdl_ecore.wsdl.WsdlPackage;

public class Utils {

	
	public static EList<EObject> getFromXMI(String path) throws IOException{
		 	RequestModelPackage.eINSTANCE.eClass();  
		    Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		    Map<String, Object> m = reg.getExtensionToFactoryMap();
		    m.put("*", new XMIResourceFactoryImpl());
		    // Obtain a new resource set
		    ResourceSet resSet = new ResourceSetImpl();
		    resSet.setResourceFactoryRegistry(reg);
		    resSet.getPackageRegistry().put(RequestModelPackage.eNS_URI,RequestModelPackage.eINSTANCE);
		    resSet.getPackageRegistry().put(WsdlPackage.eNS_URI,WsdlPackage.eINSTANCE);
		    URI uri= URI.createURI(path);
		    Resource resource = resSet.getResource(uri, true);
		    return resource.getContents();
	}
	
	/**
	 * Exporta una Definition de un modelo ecore a un archivo de texto con extensión .xmi
	 * @param definition
	 */
	public static void exportWSDLtoXMI(Definition definition){
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	    Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("xmi", new XMIResourceFactoryImpl());
	    // Obtain a new resource set
	    ResourceSet resSet = new ResourceSetImpl();
	    // create a resource
	    Resource resource = resSet.createResource(org.eclipse.emf.common.util.URI.createURI(getAbsolutePathRunning()+"/folder_outputs/"+definition.getQName() +".xmi"));
	    // Get the first model element and cast it to the right type, in my
	    // example everything is hierarchical included in this first node
	    resource.getContents().add(definition);
	    // now save the content.
	    try {
	      resource.save(Collections.EMPTY_MAP);
	    } catch (IOException e) {
	      // TODO Auto-generated catch block
	      e.printStackTrace();
	    }
	}
	
	
	
	/**
	 * Exporta una Definition de un modelo ecore a un archivo de texto con extensión .xmi
	 * @param definition
	 */
	public static void exportRequestModeltoXMI(RequestModel requestModel){
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	    Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("xmi", new XMIResourceFactoryImpl());
	    // Obtain a new resource set
	    ResourceSet resSet = new ResourceSetImpl();
	    // create a resource
	    Resource resource = resSet.createResource(org.eclipse.emf.common.util.URI.createURI(getAbsolutePathRunning()+"/folder_outputs/"+requestModel.getName() +".xmi"));
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
	/**
	 * retorna la path absoluta donde se está corriendo el jar
	 * @return
	 */
	public static String getAbsolutePathRunning(){
		return new File(System.getProperty("user.dir")).getAbsolutePath();
	}
	
}
