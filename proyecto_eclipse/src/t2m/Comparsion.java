package t2m;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import tesis.request_model.RequestModel.Method;
import tesis.request_model.RequestModel.Parameter;
import tesis.request_model.RequestModel.RequestModel;
import tesis.request_model.RequestModel.RequestModelPackage;


public class Comparsion {
	
	private RequestModel requestModelWSDL;
	private RequestModel requestModelClient;

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

	
	public ArrayList<String> getMachOperations(RequestModel requestClient){
		this.requestModelClient = requestClient;
		ArrayList<String> ret = new ArrayList<>();
		for(Method method : requestModelWSDL.getMethods()){
			if(method.getName().equals(requestClient.getMethods().get(0).getName())){
				if(matchInputParams(method.getInParameters())){
					ret.add(method.getName());
				}
			}
		}
		return ret;
	}
	
	private boolean matchInputParams(List<Parameter> inputParams){
		List<Parameter> paramsRequest= requestModelClient.getMethods().get(0).getInParameters();
		boolean ret = false;
		//si la cantidad de parametros del metodo es igual a la cantidad de parametros de la request
		if(inputParams.size() == paramsRequest.size()){
			ret = true;
			int i =0;
			//corroboro los tipos
			for(Parameter param: paramsRequest){
				//si los tipos son distintos, salgo
				if(!param.getType().equals(inputParams.get(i).getType())){
					return false;
				}
				i++;
			}
		}
		return ret;
	}
	
	public void setRequestModelWSDL(RequestModel requestModelWSDL) {
		this.requestModelWSDL = requestModelWSDL;
	}
	
	public static void main(String[] args) throws IOException {
		Comparsion comparsion = new Comparsion();
		 comparsion.setRequestModelWSDL(comparsion.loadFromXMI("output"));
		 String operation =comparsion.getMachOperations(comparsion.loadFromXMI("FService")).get(0);
		 System.out.println(operation);
	}

}
