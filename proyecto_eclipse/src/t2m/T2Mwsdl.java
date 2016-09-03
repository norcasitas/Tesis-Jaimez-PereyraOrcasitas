package t2m;

import java.io.File;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.namespace.QName;
import com.predic8.schema.ComplexType;
import com.predic8.schema.Element;
import com.predic8.schema.Sequence;
import com.predic8.schema.TypeDefinition;
import com.predic8.wsdl.Binding;
import com.predic8.wsdl.Definitions;
import com.predic8.wsdl.Operation;
import com.predic8.wsdl.PortType;
import com.predic8.wsdl.WSDLParser;
import com.predic8.wsdl.soap11.SOAPBinding;

import tesis.wsdl_ecore.wsdl.Definition;
import tesis.wsdl_ecore.wsdl.Input;
import tesis.wsdl_ecore.wsdl.Message;
import tesis.wsdl_ecore.wsdl.Output;
import tesis.wsdl_ecore.wsdl.Part;
import tesis.wsdl_ecore.wsdl.WsdlFactory;
import utils.Pair;
import utils.Utils;

public class T2Mwsdl {

	private WsdlFactory factory;
	private Definition definition;
	private Definitions defs;

	public T2Mwsdl() {
		factory = WsdlFactory.eINSTANCE;
	}

	/**
	 * (*+)Parsea un archivo o ruta wsdl y retorna un Definition
	 * 
	 * @param url
	 * @return
	 */
	public Definition parser(String url) {
		definition = factory.createDefinition();
		WSDLParser parser = new WSDLParser();
		defs = parser.parse(url);
		if (defs.getName() == null) {
			// (*+) Si la definition no tiene nombre, le seteo el nombre de la
			// url
			definition.setQName(QName.valueOf(new File(url).getName().split("\\.")[0]));
		} else {
			definition.setQName(org.eclipse.emf.ecore.xml.type.internal.QName.valueOf(defs.getName()));
		}
		List<Binding> bindings = defs.getBindings();
		for (Binding binding : bindings) {
			// (*+)es protocolo SOAP V 1.1 O V 1.2
			if (binding.getBinding() instanceof SOAPBinding
					|| binding.getBinding() instanceof com.predic8.wsdl.soap12.SOAPBinding) {
				PortType portType = defs.getPortType(binding.getType());
				if (!existsEPortType(portType.getQName().getLocalPart())) {
					definition.getEPortTypes().add(parserPortType(portType));
				}
			}
		}
		return definition;
	}

	/**
	 * (*+)Retorna true si existe un PortType con el nombre pasado por parametro
	 * 
	 * @param name
	 * @return
	 */
	public boolean existsEPortType(String name) {
		for (tesis.wsdl_ecore.wsdl.PortType pt : definition.getEPortTypes()) {
			if (pt.getQName().toString().equals(name)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * (*+)Parsea un Part de un archivo wsdl y retorna un Part de un modelo
	 * wsdl.ecore
	 * 
	 * @param part
	 * @return
	 */
	private Part parserPart(Pair<String, String> part) {
		Part partFactory = factory.createPart();
		partFactory.setName(part.fst());
		partFactory.setTypeName(QName.valueOf(part.snd().toString()));
		return partFactory;
	}

	/**
	 * (*+)Parsea un PortType de un archivo wsdl y retorna un PortType de un
	 * modelo wsdl.ecore
	 * 
	 * @param portType
	 * @return
	 */
	private tesis.wsdl_ecore.wsdl.PortType parserPortType(PortType pt) {
		tesis.wsdl_ecore.wsdl.PortType portTypeFactory = factory.createPortType();
		portTypeFactory.setQName(QName.valueOf(pt.getName()));
		for (Operation op : pt.getOperations()) {
			tesis.wsdl_ecore.wsdl.Operation operationFac = parserOperation(op);
			portTypeFactory.getEOperations().add(operationFac);
		}
		return portTypeFactory;

	}

	/**
	 * (*+)Parsea una Operation de un archivo wsdl y retorna una Operation de un
	 * modelo wsdl.ecore
	 * 
	 * @param operation
	 * @return
	 */
	private tesis.wsdl_ecore.wsdl.Operation parserOperation(Operation op) {
		tesis.wsdl_ecore.wsdl.Operation operationFactory = factory.createOperation();
		operationFactory.setName(op.getName());
		operationFactory.setEInput(parserInputOperation(op.getInput()));
		operationFactory.setEOutput(parserOutputOperation(op.getOutput()));
		if (op.getDocumentation() != null)
			operationFactory.setDocumentation(op.getDocumentation().getContent());
		return operationFactory;
	}

	/**
	 * (*+)Parsea un Input de un archivo wsdl y retorna un Input de un modelo
	 * wsdl.ecore
	 * 
	 * @param input
	 * @return
	 */
	private Input parserInputOperation(com.predic8.wsdl.Input input) {
		Input inputFactory = factory.createInput();
		Message message = findMessage(input.getMessage().getName());
		if (message != null)
			inputFactory.setEMessage(message);
		else {
			message = parserMessage(input.getMessage());
			definition.getEMessages().add(message);
			inputFactory.setEMessage(message);
		}

		return inputFactory;
	}

	/**
	 * (*+)Parsea un Output de un archivo wsdl y retorna un Output de un modelo
	 * wsdl.ecore
	 * 
	 * @param output
	 * @return
	 */
	private Output parserOutputOperation(com.predic8.wsdl.Output output) {
		Output outFactory = factory.createOutput();
		Message message = findMessage(output.getMessage().getName());
		if (message != null)
			outFactory.setEMessage(message);
		else {
			message = parserMessage(output.getMessage());
			definition.getEMessages().add(message);
			outFactory.setEMessage(message);
		}
		return outFactory;
	}

	/**
	 * (*+)Dado el nombre de un message, lo busca en la lista de messages de
	 * Definition y lo retorna, en caso de no existir, retorna null
	 * 
	 * @param name
	 * @return
	 */
	private Message findMessage(String name) {
		Iterator<Message> it = definition.getEMessages().iterator();
		while (it.hasNext()) {
			Message msg = it.next();
			if (msg.getQName().toString() == name) {
				return msg;
			}
		}
		return null;
	}

	/**
	 * (*+)Parsea un message de un archivo wsdl y retorna un Message de un
	 * modelo wsdl.ecore
	 * 
	 * @param msg
	 * @return
	 */
	private Message parserMessage(com.predic8.wsdl.Message msg) {
		Message msgFactory = factory.createMessage();
		msgFactory.setQName(QName.valueOf(msg.getName()));
		for (com.predic8.wsdl.Part part : msg.getParts()) {
			if (part.getElement() != null) { //(*+) es un parametro de tipo embebido
				Element element = part.getElement();
				//(*+) debo "desenvolver" el tipo embebido en varios simples
				ArrayList<Pair<String, String>> parameters = parserEmbebedType(element);
				for (Pair<String, String> param : parameters) {
					msgFactory.getEParts().add(parserPart(param));
				}
			} else { //(*+) es un parametro de tipo simple
				msgFactory.getEParts().add(parserPart(new Pair<String, String>(part.getName(),
						((com.predic8.schema.BuiltInSchemaType) part.getType()).getQname().getLocalPart())));
			}
		}
		return msgFactory;
	}

	/**
	 * (*+)Metodo que parsea un Element, si este es de un complexType lo
	 * convierte a un arraylist que contiene el nombre y tipo del parametro
	 * 
	 * @param element
	 * @return
	 */
	private ArrayList<Pair<String, String>> parserEmbebedType(Element element) {
		TypeDefinition typeDefinition = element.getEmbeddedType();
		ArrayList<Pair<String, String>> ret = new ArrayList<Pair<String, String>>();
		//(*+) es un tipo complejo definido en el mismo esquema, o se encuentra en otro esquema
		if (typeDefinition != null || defs.getSchemaType(element.getType()) instanceof ComplexType) {
			Sequence model;
			if (typeDefinition != null) //(*+) el tipo está en el mismo esquema, obteno el modelo
				model = ((Sequence) ((ComplexType) typeDefinition).getModel());
			else//(*+)  el tipo se encuentra en otro esquema, obtengo el modelo desde ese esquema
				model = ((Sequence) ((ComplexType) defs.getSchemaType(element.getType())).getModel());
			for (Element elementAux : model.getElements()) {
				/*(*+) para cada parametro de este tipo, llamo recursivamente por si 
				 * está definido como tipo embebido
				 */
				ret.addAll(parserEmbebedType(elementAux));
			}
		} else {
			ret.add(new Pair<String, String>(element.getQname().getLocalPart(), element.getBuildInTypeName()));
		}
		return ret;
	}

	/**
	 * (*+)Transforma un wsdl y retorna el nombre con el cual se almaceno en
	 * disco
	 * 
	 * @param inputFile
	 * @return
	 * @throws MalformedURLException
	 */
	public String transformT2M(String inputFile) throws MalformedURLException {
		T2Mwsdl t2Model = new T2Mwsdl();
		Definition def = t2Model.parser(inputFile);
		Utils.exportWSDLtoXMI(def);
		return def.getQName().toString();
	}

}
