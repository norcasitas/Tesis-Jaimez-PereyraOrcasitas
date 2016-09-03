package t2m;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import tesis.request_model.RequestModel.Method;
import tesis.request_model.RequestModel.Parameter;
import tesis.request_model.RequestModel.RequestModel;

public class Comparsion {

	private RequestModel requestModelWSDL;
	private RequestModel requestModelClient;

	/**
	 * (*+) Retorna los nombres de los métodos que machean con el wsdl y la
	 * request
	 * 
	 * @param requestClient
	 * @return
	 */
	public ArrayList<String> getMachOperations(RequestModel requestClient) {
		this.requestModelClient = requestClient;
		ArrayList<String> ret = new ArrayList<String>();
		for (Method method : requestModelWSDL.getMethods()) {
			if (method.getName().toLowerCase().equals(requestClient.getMethods().get(0)
				.getName().toLowerCase())) {
				if (matchInputParams(method.getInParameters())) {
					ret.add(method.getName());
				}
			}
		}
		return ret;
	}

	/**
	 * (*+)Retorna true si machean los parametros
	 * 
	 * @param inputParams
	 * @return
	 */
	private boolean matchInputParams(List<Parameter> inputParams) {
		List<Parameter> paramsRequest = requestModelClient.getMethods().get(0).getInParameters();
		boolean ret = false;
		// (*+) si la cantidad de parametros del metodo es igual a la cantidad
		// de
		// (*+) parametros de la request
		if (inputParams.size() == paramsRequest.size()) {
			ret = true;
			int i = 0;
			// (*+)corroboro los tipos
			ArrayList<Parameter> inputParamsOrdered = toArrayListOrdered(inputParams);
			ArrayList<Parameter> paramsRequestOrdered = toArrayListOrdered(paramsRequest);
			for (Parameter param : paramsRequestOrdered) {
				// (*+)si los tipos son distintos, salgo
				if (!param.getType().equals(inputParamsOrdered.get(i).getType())) {
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

	/**
	 * (*+)Ordena los parametros, ya que el parseo de M2M lo genera no
	 * deterministicamente
	 * 
	 * @param parameters
	 * @return
	 */
	private ArrayList<Parameter> toArrayListOrdered(List<Parameter> parameters) {
		ArrayList<Parameter> arrayListParameters = new ArrayList<Parameter>();
		for (Parameter p : parameters) {
			arrayListParameters.add(p);
		}
		arrayListParameters.sort(new Comparator<Parameter>() {
			public int compare(Parameter o1, Parameter o2) {
				return o1.getType().compareTo(o2.getType()) <= 0 ? -1 : 0;
			}
		});
		return arrayListParameters;
	}
}
