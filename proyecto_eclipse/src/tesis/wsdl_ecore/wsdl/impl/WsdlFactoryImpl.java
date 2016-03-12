/**
 */
package tesis.wsdl_ecore.wsdl.impl;

import javax.wsdl.OperationType;
import javax.wsdl.WSDLException;

import javax.xml.namespace.QName;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import tesis.wsdl_ecore.wsdl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WsdlFactoryImpl extends EFactoryImpl implements WsdlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WsdlFactory init() {
		try {
			WsdlFactory theWsdlFactory = (WsdlFactory)EPackage.Registry.INSTANCE.getEFactory(WsdlPackage.eNS_URI);
			if (theWsdlFactory != null) {
				return theWsdlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WsdlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WsdlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case WsdlPackage.PORT_TYPE: return createPortType();
			case WsdlPackage.OPERATION: return createOperation();
			case WsdlPackage.MESSAGE: return createMessage();
			case WsdlPackage.PART: return createPart();
			case WsdlPackage.BINDING: return createBinding();
			case WsdlPackage.BINDING_OPERATION: return createBindingOperation();
			case WsdlPackage.SERVICE: return createService();
			case WsdlPackage.PORT: return createPort();
			case WsdlPackage.EXTENSIBILITY_ELEMENT: return createExtensibilityElement();
			case WsdlPackage.DEFINITION: return createDefinition();
			case WsdlPackage.IMPORT: return createImport();
			case WsdlPackage.INPUT: return createInput();
			case WsdlPackage.OUTPUT: return createOutput();
			case WsdlPackage.FAULT: return createFault();
			case WsdlPackage.BINDING_INPUT: return createBindingInput();
			case WsdlPackage.BINDING_OUTPUT: return createBindingOutput();
			case WsdlPackage.BINDING_FAULT: return createBindingFault();
			case WsdlPackage.NAMESPACE: return createNamespace();
			case WsdlPackage.TYPES: return createTypes();
			case WsdlPackage.UNKNOWN_EXTENSIBILITY_ELEMENT: return createUnknownExtensibilityElement();
			case WsdlPackage.XSD_SCHEMA_EXTENSIBILITY_ELEMENT: return createXSDSchemaExtensibilityElement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case WsdlPackage.QNAME:
				return createQNameFromString(eDataType, initialValue);
			case WsdlPackage.OPERATION_TYPE:
				return createOperationTypeFromString(eDataType, initialValue);
			case WsdlPackage.DOM_ELEMENT:
				return createDOMElementFromString(eDataType, initialValue);
			case WsdlPackage.WSDL_EXCEPTION:
				return createWSDLExceptionFromString(eDataType, initialValue);
			case WsdlPackage.DOM_DOCUMENT:
				return createDOMDocumentFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case WsdlPackage.QNAME:
				return convertQNameToString(eDataType, instanceValue);
			case WsdlPackage.OPERATION_TYPE:
				return convertOperationTypeToString(eDataType, instanceValue);
			case WsdlPackage.DOM_ELEMENT:
				return convertDOMElementToString(eDataType, instanceValue);
			case WsdlPackage.WSDL_EXCEPTION:
				return convertWSDLExceptionToString(eDataType, instanceValue);
			case WsdlPackage.DOM_DOCUMENT:
				return convertDOMDocumentToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortType createPortType() {
		PortTypeImpl portType = new PortTypeImpl();
		return portType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message createMessage() {
		MessageImpl message = new MessageImpl();
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Part createPart() {
		PartImpl part = new PartImpl();
		return part;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binding createBinding() {
		BindingImpl binding = new BindingImpl();
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingOperation createBindingOperation() {
		BindingOperationImpl bindingOperation = new BindingOperationImpl();
		return bindingOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port createPort() {
		PortImpl port = new PortImpl();
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensibilityElement createExtensibilityElement() {
		ExtensibilityElementImpl extensibilityElement = new ExtensibilityElementImpl();
		return extensibilityElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Definition createDefinition() {
		DefinitionImpl definition = new DefinitionImpl();
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Import createImport() {
		ImportImpl import_ = new ImportImpl();
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input createInput() {
		InputImpl input = new InputImpl();
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Output createOutput() {
		OutputImpl output = new OutputImpl();
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fault createFault() {
		FaultImpl fault = new FaultImpl();
		return fault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingInput createBindingInput() {
		BindingInputImpl bindingInput = new BindingInputImpl();
		return bindingInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingOutput createBindingOutput() {
		BindingOutputImpl bindingOutput = new BindingOutputImpl();
		return bindingOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingFault createBindingFault() {
		BindingFaultImpl bindingFault = new BindingFaultImpl();
		return bindingFault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace createNamespace() {
		NamespaceImpl namespace = new NamespaceImpl();
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Types createTypes() {
		TypesImpl types = new TypesImpl();
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnknownExtensibilityElement createUnknownExtensibilityElement() {
		UnknownExtensibilityElementImpl unknownExtensibilityElement = new UnknownExtensibilityElementImpl();
		return unknownExtensibilityElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDSchemaExtensibilityElement createXSDSchemaExtensibilityElement() {
		XSDSchemaExtensibilityElementImpl xsdSchemaExtensibilityElement = new XSDSchemaExtensibilityElementImpl();
		return xsdSchemaExtensibilityElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName createQNameFromString(EDataType eDataType, String initialValue) {
		return (QName)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQNameToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationType createOperationTypeFromString(EDataType eDataType, String initialValue) {
		return (OperationType)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element createDOMElementFromString(EDataType eDataType, String initialValue) {
		return (Element)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDOMElementToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WSDLException createWSDLExceptionFromString(EDataType eDataType, String initialValue) {
		return (WSDLException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWSDLExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Document createDOMDocumentFromString(EDataType eDataType, String initialValue) {
		return (Document)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDOMDocumentToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WsdlPackage getWsdlPackage() {
		return (WsdlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WsdlPackage getPackage() {
		return WsdlPackage.eINSTANCE;
	}

} //WsdlFactoryImpl
