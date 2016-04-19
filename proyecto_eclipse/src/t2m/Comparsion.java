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
import utils.Utils;


public class Comparsion {
	
	private RequestModel requestModelWSDL;
	private RequestModel requestModelClient;



	
	public ArrayList<String> getMachOperations(RequestModel requestClient){
		this.requestModelClient = requestClient;
		ArrayList<String> ret = new ArrayList<String>();
		for(Method method : requestModelWSDL.getMethods()){
			if(method.getName().toLowerCase().equals(requestClient.getMethods().get(0).getName().toLowerCase())){
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
	
	/*public static void main(String[] args) throws IOException {
		Comparsion comparsion = new Comparsion();
		 comparsion.setRequestModelWSDL((RequestModel)Utils.getFromXMI("/home/nico/Universidad/Tesis/Tesis-Jaimez-PereyraOrcasitas/QVTWSInvoker/folder_outputs/globalweather.xmi").get(0));
		 ArrayList<String> operation =comparsion.getMachOperations((RequestModel)Utils.getFromXMI("/home/nico/Universidad/Tesis/Tesis-Jaimez-PereyraOrcasitas/QVTWSInvoker/folder_outputs/GetWeather.xmi").get(0));
		 System.out.println(operation);
	}*/

}
