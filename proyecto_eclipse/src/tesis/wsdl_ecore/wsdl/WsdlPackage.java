/**
 */
package tesis.wsdl_ecore.wsdl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The WSDL model contains classes for the Web Services Description Language (WSDL).
 * 
 * WSDL describes network services as sets of endpoints operating on messages. The operations and messages are described abstractly, and then bound to a concrete network protocol and message format to define an endpoint.
 * 
 * WSDL describes the formats of the messages exchanged by the services, and supports the XML Schemas specification as its canonical type system. This package uses an XML Schema Infoset model package (see the XSD package) to describe the abstract message formats.
 * 
 * The model contains the following diagrams, named after the corresponding chapters in the WSDL 1.1 specification (http://www.w3.org/TR/2001/NOTE-wsdl-20010315)
 * - 2.1 Definition, shows the WSDL definition element and the WSDL document structure
 * - 2.1.1 Naming and Linking, shows the namespace and import mechanism
 * - 2.1.3 Extensibility, shows the WSDL extensibility mechanism
 * - 2.2 Types, shows the use of XML Schema types in WSDL
 * - 2.3 Messages, 2.4 PortTypes, 2.5 Bindings and 2.7 Services, show the major WSDL elements and their relations.
 * 
 * The WSDL classes extend the javax.wsdl interfaces defined by JSR 110. Classes with interface and datatype stereotypes are used to represent these non-MOF interfaces.
 * <!-- end-model-doc -->
 * @see tesis.wsdl_ecore.wsdl.WsdlFactory
 * @model kind="package"
 * @generated
 */
public interface WsdlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "wsdl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/wsdl/2003/WSDL";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "wsdl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WsdlPackage eINSTANCE = tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl.init();

	/**
	 * The meta object id for the '{@link tesis.wsdl_ecore.wsdl.impl.WSDLElementImpl <em>WSDL Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.wsdl_ecore.wsdl.impl.WSDLElementImpl
	 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getWSDLElement()
	 * @generated
	 */
	int WSDL_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_ELEMENT__DOCUMENTATION_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_ELEMENT__ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>WSDL Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Get Enclosing Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_ELEMENT___GET_ENCLOSING_DEFINITION = 0;

	/**
	 * The operation id for the '<em>Set Enclosing Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_ELEMENT___SET_ENCLOSING_DEFINITION__DEFINITION = 1;

	/**
	 * The number of operations of the '<em>WSDL Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_ELEMENT_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link tesis.wsdl_ecore.wsdl.impl.ExtensibleElementImpl <em>Extensible Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.wsdl_ecore.wsdl.impl.ExtensibleElementImpl
	 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getExtensibleElement()
	 * @generated
	 */
	int EXTENSIBLE_ELEMENT = 12;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIBLE_ELEMENT__DOCUMENTATION_ELEMENT = WSDL_ELEMENT__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIBLE_ELEMENT__ELEMENT = WSDL_ELEMENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIBLE_ELEMENT__EEXTENSIBILITY_ELEMENTS = WSDL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Extensible Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIBLE_ELEMENT_FEATURE_COUNT = WSDL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Enclosing Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIBLE_ELEMENT___GET_ENCLOSING_DEFINITION = WSDL_ELEMENT___GET_ENCLOSING_DEFINITION;

	/**
	 * The operation id for the '<em>Set Enclosing Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIBLE_ELEMENT___SET_ENCLOSING_DEFINITION__DEFINITION = WSDL_ELEMENT___SET_ENCLOSING_DEFINITION__DEFINITION;

	/**
	 * The operation id for the '<em>Get Extensibility Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIBLE_ELEMENT___GET_EXTENSIBILITY_ELEMENTS = WSDL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Extensibility Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIBLE_ELEMENT___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT = WSDL_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Extension Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIBLE_ELEMENT___GET_EXTENSION_ATTRIBUTE__QNAME = WSDL_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Set Extension Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIBLE_ELEMENT___SET_EXTENSION_ATTRIBUTE__QNAME_OBJECT = WSDL_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Extension Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIBLE_ELEMENT___GET_EXTENSION_ATTRIBUTES = WSDL_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Native Attribute Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIBLE_ELEMENT___GET_NATIVE_ATTRIBUTE_NAMES = WSDL_ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Extensible Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIBLE_ELEMENT_OPERATION_COUNT = WSDL_ELEMENT_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link tesis.wsdl_ecore.wsdl.impl.PortTypeImpl <em>Port Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.wsdl_ecore.wsdl.impl.PortTypeImpl
	 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getPortType()
	 * @generated
	 */
	int PORT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE__DOCUMENTATION_ELEMENT = EXTENSIBLE_ELEMENT__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE__ELEMENT = EXTENSIBLE_ELEMENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE__EEXTENSIBILITY_ELEMENTS = EXTENSIBLE_ELEMENT__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>QName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE__QNAME = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Undefined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE__UNDEFINED = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>EOperations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE__EOPERATIONS = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Port Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE_FEATURE_COUNT = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Enclosing Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE___GET_ENCLOSING_DEFINITION = EXTENSIBLE_ELEMENT___GET_ENCLOSING_DEFINITION;

	/**
	 * The operation id for the '<em>Set Enclosing Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE___SET_ENCLOSING_DEFINITION__DEFINITION = EXTENSIBLE_ELEMENT___SET_ENCLOSING_DEFINITION__DEFINITION;

	/**
	 * The operation id for the '<em>Get Extensibility Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE___GET_EXTENSIBILITY_ELEMENTS = EXTENSIBLE_ELEMENT___GET_EXTENSIBILITY_ELEMENTS;

	/**
	 * The operation id for the '<em>Add Extensibility Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT = EXTENSIBLE_ELEMENT___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT;

	/**
	 * The operation id for the '<em>Get Extension Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE___GET_EXTENSION_ATTRIBUTE__QNAME = EXTENSIBLE_ELEMENT___GET_EXTENSION_ATTRIBUTE__QNAME;

	/**
	 * The operation id for the '<em>Set Extension Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE___SET_EXTENSION_ATTRIBUTE__QNAME_OBJECT = EXTENSIBLE_ELEMENT___SET_EXTENSION_ATTRIBUTE__QNAME_OBJECT;

	/**
	 * The operation id for the '<em>Get Extension Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE___GET_EXTENSION_ATTRIBUTES = EXTENSIBLE_ELEMENT___GET_EXTENSION_ATTRIBUTES;

	/**
	 * The operation id for the '<em>Get Native Attribute Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE___GET_NATIVE_ATTRIBUTE_NAMES = EXTENSIBLE_ELEMENT___GET_NATIVE_ATTRIBUTE_NAMES;

	/**
	 * The operation id for the '<em>Add Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE___ADD_OPERATION__OPERATION = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE___GET_OPERATION__STRING_STRING_STRING = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Operations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE___GET_OPERATIONS = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Port Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE_OPERATION_COUNT = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link tesis.wsdl_ecore.wsdl.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.wsdl_ecore.wsdl.impl.OperationImpl
	 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 2;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__DOCUMENTATION_ELEMENT = EXTENSIBLE_ELEMENT__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__ELEMENT = EXTENSIBLE_ELEMENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__EEXTENSIBILITY_ELEMENTS = EXTENSIBLE_ELEMENT__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__STYLE = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Undefined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__UNDEFINED = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>EInput</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__EINPUT = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>EOutput</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__EOUTPUT = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>EFaults</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__EFAULTS = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>EParameter Ordering</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__EPARAMETER_ORDERING = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Enclosing Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___GET_ENCLOSING_DEFINITION = EXTENSIBLE_ELEMENT___GET_ENCLOSING_DEFINITION;

	/**
	 * The operation id for the '<em>Set Enclosing Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___SET_ENCLOSING_DEFINITION__DEFINITION = EXTENSIBLE_ELEMENT___SET_ENCLOSING_DEFINITION__DEFINITION;

	/**
	 * The operation id for the '<em>Get Extensibility Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___GET_EXTENSIBILITY_ELEMENTS = EXTENSIBLE_ELEMENT___GET_EXTENSIBILITY_ELEMENTS;

	/**
	 * The operation id for the '<em>Add Extensibility Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT = EXTENSIBLE_ELEMENT___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT;

	/**
	 * The operation id for the '<em>Get Extension Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___GET_EXTENSION_ATTRIBUTE__QNAME = EXTENSIBLE_ELEMENT___GET_EXTENSION_ATTRIBUTE__QNAME;

	/**
	 * The operation id for the '<em>Set Extension Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___SET_EXTENSION_ATTRIBUTE__QNAME_OBJECT = EXTENSIBLE_ELEMENT___SET_EXTENSION_ATTRIBUTE__QNAME_OBJECT;

	/**
	 * The operation id for the '<em>Get Extension Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___GET_EXTENSION_ATTRIBUTES = EXTENSIBLE_ELEMENT___GET_EXTENSION_ATTRIBUTES;

	/**
	 * The operation id for the '<em>Get Native Attribute Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___GET_NATIVE_ATTRIBUTE_NAMES = EXTENSIBLE_ELEMENT___GET_NATIVE_ATTRIBUTE_NAMES;

	/**
	 * The operation id for the '<em>Add Fault</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___ADD_FAULT__FAULT = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Fault</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___GET_FAULT__STRING = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Faults</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___GET_FAULTS = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Parameter Ordering</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___GET_PARAMETER_ORDERING = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Set Parameter Ordering</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___SET_PARAMETER_ORDERING__LIST = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Input</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___GET_INPUT = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Set Input</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___SET_INPUT__INPUT = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Output</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___GET_OUTPUT = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Set Output</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___SET_OUTPUT__OUTPUT = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 8;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 9;

	/**
	 * The meta object id for the '{@link tesis.wsdl_ecore.wsdl.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.wsdl_ecore.wsdl.impl.MessageImpl
	 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 3;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__DOCUMENTATION_ELEMENT = EXTENSIBLE_ELEMENT__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__ELEMENT = EXTENSIBLE_ELEMENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__EEXTENSIBILITY_ELEMENTS = EXTENSIBLE_ELEMENT__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>QName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__QNAME = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Undefined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__UNDEFINED = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>EParts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__EPARTS = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Enclosing Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___GET_ENCLOSING_DEFINITION = EXTENSIBLE_ELEMENT___GET_ENCLOSING_DEFINITION;

	/**
	 * The operation id for the '<em>Set Enclosing Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___SET_ENCLOSING_DEFINITION__DEFINITION = EXTENSIBLE_ELEMENT___SET_ENCLOSING_DEFINITION__DEFINITION;

	/**
	 * The operation id for the '<em>Get Extensibility Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___GET_EXTENSIBILITY_ELEMENTS = EXTENSIBLE_ELEMENT___GET_EXTENSIBILITY_ELEMENTS;

	/**
	 * The operation id for the '<em>Add Extensibility Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT = EXTENSIBLE_ELEMENT___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT;

	/**
	 * The operation id for the '<em>Get Extension Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___GET_EXTENSION_ATTRIBUTE__QNAME = EXTENSIBLE_ELEMENT___GET_EXTENSION_ATTRIBUTE__QNAME;

	/**
	 * The operation id for the '<em>Set Extension Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___SET_EXTENSION_ATTRIBUTE__QNAME_OBJECT = EXTENSIBLE_ELEMENT___SET_EXTENSION_ATTRIBUTE__QNAME_OBJECT;

	/**
	 * The operation id for the '<em>Get Extension Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___GET_EXTENSION_ATTRIBUTES = EXTENSIBLE_ELEMENT___GET_EXTENSION_ATTRIBUTES;

	/**
	 * The operation id for the '<em>Get Native Attribute Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___GET_NATIVE_ATTRIBUTE_NAMES = EXTENSIBLE_ELEMENT___GET_NATIVE_ATTRIBUTE_NAMES;

	/**
	 * The operation id for the '<em>Add Part</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___ADD_PART__PART = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Part</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___GET_PART__STRING = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___GET_PARTS = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Ordered Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___GET_ORDERED_PARTS__LIST = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OPERATION_COUNT = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link tesis.wsdl_ecore.wsdl.impl.PartImpl <em>Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.wsdl_ecore.wsdl.impl.PartImpl
	 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getPart()
	 * @generated
	 */
	int PART = 4;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__DOCUMENTATION_ELEMENT = EXTENSIBLE_ELEMENT__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__ELEMENT = EXTENSIBLE_ELEMENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__EEXTENSIBILITY_ELEMENTS = EXTENSIBLE_ELEMENT__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__NAME = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__ELEMENT_NAME = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__TYPE_NAME = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__TYPE_DEFINITION = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Element Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__ELEMENT_DECLARATION = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>EMessage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__EMESSAGE = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_FEATURE_COUNT = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Enclosing Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART___GET_ENCLOSING_DEFINITION = EXTENSIBLE_ELEMENT___GET_ENCLOSING_DEFINITION;

	/**
	 * The operation id for the '<em>Set Enclosing Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART___SET_ENCLOSING_DEFINITION__DEFINITION = EXTENSIBLE_ELEMENT___SET_ENCLOSING_DEFINITION__DEFINITION;

	/**
	 * The operation id for the '<em>Get Extensibility Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART___GET_EXTENSIBILITY_ELEMENTS = EXTENSIBLE_ELEMENT___GET_EXTENSIBILITY_ELEMENTS;

	/**
	 * The operation id for the '<em>Add Extensibility Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT = EXTENSIBLE_ELEMENT___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT;

	/**
	 * The operation id for the '<em>Get Extension Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART___GET_EXTENSION_ATTRIBUTE__QNAME = EXTENSIBLE_ELEMENT___GET_EXTENSION_ATTRIBUTE__QNAME;

	/**
	 * The operation id for the '<em>Set Extension Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART___SET_EXTENSION_ATTRIBUTE__QNAME_OBJECT = EXTENSIBLE_ELEMENT___SET_EXTENSION_ATTRIBUTE__QNAME_OBJECT;

	/**
	 * The operation id for the '<em>Get Extension Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART___GET_EXTENSION_ATTRIBUTES = EXTENSIBLE_ELEMENT___GET_EXTENSION_ATTRIBUTES;

	/**
	 * The operation id for the '<em>Get Native Attribute Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART___GET_NATIVE_ATTRIBUTE_NAMES = EXTENSIBLE_ELEMENT___GET_NATIVE_ATTRIBUTE_NAMES;

	/**
	 * The number of operations of the '<em>Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_OPERATION_COUNT = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tesis.wsdl_ecore.wsdl.impl.BindingImpl <em>Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.wsdl_ecore.wsdl.impl.BindingImpl
	 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getBinding()
	 * @generated
	 */
	int BINDING = 5;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__DOCUMENTATION_ELEMENT = EXTENSIBLE_ELEMENT__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__ELEMENT = EXTENSIBLE_ELEMENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__EEXTENSIBILITY_ELEMENTS = EXTENSIBLE_ELEMENT__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>QName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__QNAME = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Undefined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__UNDEFINED = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>EPort Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__EPORT_TYPE = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>EBinding Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__EBINDING_OPERATIONS = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FEATURE_COUNT = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Enclosing Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING___GET_ENCLOSING_DEFINITION = EXTENSIBLE_ELEMENT___GET_ENCLOSING_DEFINITION;

	/**
	 * The operation id for the '<em>Set Enclosing Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING___SET_ENCLOSING_DEFINITION__DEFINITION = EXTENSIBLE_ELEMENT___SET_ENCLOSING_DEFINITION__DEFINITION;

	/**
	 * The operation id for the '<em>Get Extensibility Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING___GET_EXTENSIBILITY_ELEMENTS = EXTENSIBLE_ELEMENT___GET_EXTENSIBILITY_ELEMENTS;

	/**
	 * The operation id for the '<em>Add Extensibility Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT = EXTENSIBLE_ELEMENT___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT;

	/**
	 * The operation id for the '<em>Get Extension Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING___GET_EXTENSION_ATTRIBUTE__QNAME = EXTENSIBLE_ELEMENT___GET_EXTENSION_ATTRIBUTE__QNAME;

	/**
	 * The operation id for the '<em>Set Extension Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING___SET_EXTENSION_ATTRIBUTE__QNAME_OBJECT = EXTENSIBLE_ELEMENT___SET_EXTENSION_ATTRIBUTE__QNAME_OBJECT;

	/**
	 * The operation id for the '<em>Get Extension Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING___GET_EXTENSION_ATTRIBUTES = EXTENSIBLE_ELEMENT___GET_EXTENSION_ATTRIBUTES;

	/**
	 * The operation id for the '<em>Get Native Attribute Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING___GET_NATIVE_ATTRIBUTE_NAMES = EXTENSIBLE_ELEMENT___GET_NATIVE_ATTRIBUTE_NAMES;

	/**
	 * The operation id for the '<em>Add Binding Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING___ADD_BINDING_OPERATION__BINDINGOPERATION = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Binding Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING___GET_BINDING_OPERATION__STRING_STRING_STRING = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Binding Operations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING___GET_BINDING_OPERATIONS = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Port Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING___GET_PORT_TYPE = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Set Port Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING___SET_PORT_TYPE__PORTTYPE = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION_COUNT = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link tesis.wsdl_ecore.wsdl.impl.BindingOperationImpl <em>Binding Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.wsdl_ecore.wsdl.impl.BindingOperationImpl
	 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getBindingOperation()
	 * @generated
	 */
	int BINDING_OPERATION = 6;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION__DOCUMENTATION_ELEMENT = EXTENSIBLE_ELEMENT__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION__ELEMENT = EXTENSIBLE_ELEMENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION__EEXTENSIBILITY_ELEMENTS = EXTENSIBLE_ELEMENT__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION__NAME = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EOperation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION__EOPERATION = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>EBinding Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION__EBINDING_INPUT = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>EBinding Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION__EBINDING_OUTPUT = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>EBinding Faults</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION__EBINDING_FAULTS = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Binding Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION_FEATURE_COUNT = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Enclosing Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION___GET_ENCLOSING_DEFINITION = EXTENSIBLE_ELEMENT___GET_ENCLOSING_DEFINITION;

	/**
	 * The operation id for the '<em>Set Enclosing Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION___SET_ENCLOSING_DEFINITION__DEFINITION = EXTENSIBLE_ELEMENT___SET_ENCLOSING_DEFINITION__DEFINITION;

	/**
	 * The operation id for the '<em>Get Extensibility Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION___GET_EXTENSIBILITY_ELEMENTS = EXTENSIBLE_ELEMENT___GET_EXTENSIBILITY_ELEMENTS;

	/**
	 * The operation id for the '<em>Add Extensibility Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT = EXTENSIBLE_ELEMENT___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT;

	/**
	 * The operation id for the '<em>Get Extension Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION___GET_EXTENSION_ATTRIBUTE__QNAME = EXTENSIBLE_ELEMENT___GET_EXTENSION_ATTRIBUTE__QNAME;

	/**
	 * The operation id for the '<em>Set Extension Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION___SET_EXTENSION_ATTRIBUTE__QNAME_OBJECT = EXTENSIBLE_ELEMENT___SET_EXTENSION_ATTRIBUTE__QNAME_OBJECT;

	/**
	 * The operation id for the '<em>Get Extension Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION___GET_EXTENSION_ATTRIBUTES = EXTENSIBLE_ELEMENT___GET_EXTENSION_ATTRIBUTES;

	/**
	 * The operation id for the '<em>Get Native Attribute Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION___GET_NATIVE_ATTRIBUTE_NAMES = EXTENSIBLE_ELEMENT___GET_NATIVE_ATTRIBUTE_NAMES;

	/**
	 * The operation id for the '<em>Add Binding Fault</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION___ADD_BINDING_FAULT__BINDINGFAULT = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Binding Fault</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION___GET_BINDING_FAULT__STRING = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Binding Faults</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION___GET_BINDING_FAULTS = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION___GET_OPERATION = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Set Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION___SET_OPERATION__OPERATION = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Binding Input</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION___GET_BINDING_INPUT = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Set Binding Input</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION___SET_BINDING_INPUT__BINDINGINPUT = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Binding Output</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION___GET_BINDING_OUTPUT = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Set Binding Output</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION___SET_BINDING_OUTPUT__BINDINGOUTPUT = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 8;

	/**
	 * The number of operations of the '<em>Binding Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION_OPERATION_COUNT = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 9;

	/**
	 * The meta object id for the '{@link tesis.wsdl_ecore.wsdl.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.wsdl_ecore.wsdl.impl.ServiceImpl
	 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 7;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__DOCUMENTATION_ELEMENT = EXTENSIBLE_ELEMENT__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__ELEMENT = EXTENSIBLE_ELEMENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__EEXTENSIBILITY_ELEMENTS = EXTENSIBLE_ELEMENT__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>QName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__QNAME = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Undefined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__UNDEFINED = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>EPorts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__EPORTS = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Enclosing Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE___GET_ENCLOSING_DEFINITION = EXTENSIBLE_ELEMENT___GET_ENCLOSING_DEFINITION;

	/**
	 * The operation id for the '<em>Set Enclosing Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE___SET_ENCLOSING_DEFINITION__DEFINITION = EXTENSIBLE_ELEMENT___SET_ENCLOSING_DEFINITION__DEFINITION;

	/**
	 * The operation id for the '<em>Get Extensibility Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE___GET_EXTENSIBILITY_ELEMENTS = EXTENSIBLE_ELEMENT___GET_EXTENSIBILITY_ELEMENTS;

	/**
	 * The operation id for the '<em>Add Extensibility Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT = EXTENSIBLE_ELEMENT___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT;

	/**
	 * The operation id for the '<em>Get Extension Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE___GET_EXTENSION_ATTRIBUTE__QNAME = EXTENSIBLE_ELEMENT___GET_EXTENSION_ATTRIBUTE__QNAME;

	/**
	 * The operation id for the '<em>Set Extension Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE___SET_EXTENSION_ATTRIBUTE__QNAME_OBJECT = EXTENSIBLE_ELEMENT___SET_EXTENSION_ATTRIBUTE__QNAME_OBJECT;

	/**
	 * The operation id for the '<em>Get Extension Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE___GET_EXTENSION_ATTRIBUTES = EXTENSIBLE_ELEMENT___GET_EXTENSION_ATTRIBUTES;

	/**
	 * The operation id for the '<em>Get Native Attribute Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE___GET_NATIVE_ATTRIBUTE_NAMES = EXTENSIBLE_ELEMENT___GET_NATIVE_ATTRIBUTE_NAMES;

	/**
	 * The operation id for the '<em>Add Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE___ADD_PORT__PORT = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Ports</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE___GET_PORTS = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE___GET_PORT__STRING = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link tesis.wsdl_ecore.wsdl.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.wsdl_ecore.wsdl.impl.PortImpl
	 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 8;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__DOCUMENTATION_ELEMENT = EXTENSIBLE_ELEMENT__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__ELEMENT = EXTENSIBLE_ELEMENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__EEXTENSIBILITY_ELEMENTS = EXTENSIBLE_ELEMENT__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EBinding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__EBINDING = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Enclosing Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT___GET_ENCLOSING_DEFINITION = EXTENSIBLE_ELEMENT___GET_ENCLOSING_DEFINITION;

	/**
	 * The operation id for the '<em>Set Enclosing Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT___SET_ENCLOSING_DEFINITION__DEFINITION = EXTENSIBLE_ELEMENT___SET_ENCLOSING_DEFINITION__DEFINITION;

	/**
	 * The operation id for the '<em>Get Extensibility Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT___GET_EXTENSIBILITY_ELEMENTS = EXTENSIBLE_ELEMENT___GET_EXTENSIBILITY_ELEMENTS;

	/**
	 * The operation id for the '<em>Add Extensibility Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT = EXTENSIBLE_ELEMENT___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT;

	/**
	 * The operation id for the '<em>Get Extension Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT___GET_EXTENSION_ATTRIBUTE__QNAME = EXTENSIBLE_ELEMENT___GET_EXTENSION_ATTRIBUTE__QNAME;

	/**
	 * The operation id for the '<em>Set Extension Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT___SET_EXTENSION_ATTRIBUTE__QNAME_OBJECT = EXTENSIBLE_ELEMENT___SET_EXTENSION_ATTRIBUTE__QNAME_OBJECT;

	/**
	 * The operation id for the '<em>Get Extension Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT___GET_EXTENSION_ATTRIBUTES = EXTENSIBLE_ELEMENT___GET_EXTENSION_ATTRIBUTES;

	/**
	 * The operation id for the '<em>Get Native Attribute Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT___GET_NATIVE_ATTRIBUTE_NAMES = EXTENSIBLE_ELEMENT___GET_NATIVE_ATTRIBUTE_NAMES;

	/**
	 * The operation id for the '<em>Get Binding</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT___GET_BINDING = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Binding</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT___SET_BINDING__BINDING = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link tesis.wsdl_ecore.wsdl.impl.ExtensibilityElementImpl <em>Extensibility Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.wsdl_ecore.wsdl.impl.ExtensibilityElementImpl
	 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getExtensibilityElement()
	 * @generated
	 */
	int EXTENSIBILITY_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIBILITY_ELEMENT__DOCUMENTATION_ELEMENT = WSDL_ELEMENT__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIBILITY_ELEMENT__ELEMENT = WSDL_ELEMENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIBILITY_ELEMENT__REQUIRED = WSDL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIBILITY_ELEMENT__ELEMENT_TYPE = WSDL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Extensibility Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIBILITY_ELEMENT_FEATURE_COUNT = WSDL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Enclosing Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIBILITY_ELEMENT___GET_ENCLOSING_DEFINITION = WSDL_ELEMENT___GET_ENCLOSING_DEFINITION;

	/**
	 * The operation id for the '<em>Set Enclosing Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIBILITY_ELEMENT___SET_ENCLOSING_DEFINITION__DEFINITION = WSDL_ELEMENT___SET_ENCLOSING_DEFINITION__DEFINITION;

	/**
	 * The number of operations of the '<em>Extensibility Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIBILITY_ELEMENT_OPERATION_COUNT = WSDL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tesis.wsdl_ecore.wsdl.impl.DefinitionImpl <em>Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.wsdl_ecore.wsdl.impl.DefinitionImpl
	 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getDefinition()
	 * @generated
	 */
	int DEFINITION = 10;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__DOCUMENTATION_ELEMENT = EXTENSIBLE_ELEMENT__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__ELEMENT = EXTENSIBLE_ELEMENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__EEXTENSIBILITY_ELEMENTS = EXTENSIBLE_ELEMENT__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__TARGET_NAMESPACE = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__LOCATION = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>QName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__QNAME = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__ENCODING = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>EImports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__EIMPORTS = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>ETypes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__ETYPES = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>EMessages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__EMESSAGES = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>EPort Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__EPORT_TYPES = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>EBindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__EBINDINGS = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>EServices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__ESERVICES = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>ENamespaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__ENAMESPACES = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_FEATURE_COUNT = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The operation id for the '<em>Get Enclosing Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION___GET_ENCLOSING_DEFINITION = EXTENSIBLE_ELEMENT___GET_ENCLOSING_DEFINITION;

	/**
	 * The operation id for the '<em>Set Enclosing Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION___SET_ENCLOSING_DEFINITION__DEFINITION = EXTENSIBLE_ELEMENT___SET_ENCLOSING_DEFINITION__DEFINITION;

	/**
	 * The operation id for the '<em>Get Extensibility Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION___GET_EXTENSIBILITY_ELEMENTS = EXTENSIBLE_ELEMENT___GET_EXTENSIBILITY_ELEMENTS;

	/**
	 * The operation id for the '<em>Add Extensibility Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT = EXTENSIBLE_ELEMENT___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT;

	/**
	 * The operation id for the '<em>Get Extension Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION___GET_EXTENSION_ATTRIBUTE__QNAME = EXTENSIBLE_ELEMENT___GET_EXTENSION_ATTRIBUTE__QNAME;

	/**
	 * The operation id for the '<em>Set Extension Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION___SET_EXTENSION_ATTRIBUTE__QNAME_OBJECT = EXTENSIBLE_ELEMENT___SET_EXTENSION_ATTRIBUTE__QNAME_OBJECT;

	/**
	 * The operation id for the '<em>Get Extension Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION___GET_EXTENSION_ATTRIBUTES = EXTENSIBLE_ELEMENT___GET_EXTENSION_ATTRIBUTES;

	/**
	 * The operation id for the '<em>Get Native Attribute Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION___GET_NATIVE_ATTRIBUTE_NAMES = EXTENSIBLE_ELEMENT___GET_NATIVE_ATTRIBUTE_NAMES;

	/**
	 * The operation id for the '<em>Add Binding</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION___ADD_BINDING__BINDING = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Import</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION___ADD_IMPORT__IMPORT = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION___ADD_MESSAGE__MESSAGE = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Add Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION___ADD_NAMESPACE__STRING_STRING = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Add Port Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION___ADD_PORT_TYPE__PORTTYPE = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Add Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION___ADD_SERVICE__SERVICE = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Create Binding Fault</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION___CREATE_BINDING_FAULT = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Create Binding Input</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION___CREATE_BINDING_INPUT = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Create Binding Output</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION___CREATE_BINDING_OUTPUT = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Create Binding Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION___CREATE_BINDING_OPERATION = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Create Binding</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION___CREATE_BINDING = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Create Fault</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION___CREATE_FAULT = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Create Import</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION___CREATE_IMPORT = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Create Input</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION___CREATE_INPUT = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Create Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION___CREATE_MESSAGE = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Create Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION___CREATE_OPERATION = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Create Output</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION___CREATE_OUTPUT = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Create Part</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION___CREATE_PART = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Create Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION___CREATE_PORT = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Create Port Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION___CREATE_PORT_TYPE = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Create Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION___CREATE_SERVICE = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Get Binding</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION___GET_BINDING__QNAME = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION___GET_BINDINGS = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Get Imports</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION___GET_IMPORTS = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Get Imports</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION___GET_IMPORTS__STRING = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Get Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION___GET_MESSAGE__QNAME = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Get Messages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION___GET_MESSAGES = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION___GET_NAMESPACE__STRING = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Get Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION___GET_NAMESPACES = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Get Port Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION___GET_PORT_TYPE__QNAME = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Get Port Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION___GET_PORT_TYPES = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Get Prefix</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION___GET_PREFIX__STRING = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Get Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION___GET_SERVICE__QNAME = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>Get Services</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION___GET_SERVICES = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 33;

	/**
	 * The operation id for the '<em>Get Extension Registry</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION___GET_EXTENSION_REGISTRY = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 34;

	/**
	 * The operation id for the '<em>Set Extension Registry</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION___SET_EXTENSION_REGISTRY__EXTENSIONREGISTRY = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 35;

	/**
	 * The operation id for the '<em>Get Document Base URI</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION___GET_DOCUMENT_BASE_URI = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 36;

	/**
	 * The operation id for the '<em>Set Document Base URI</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION___SET_DOCUMENT_BASE_URI__STRING = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 37;

	/**
	 * The operation id for the '<em>Create Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION___CREATE_TYPES = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 38;

	/**
	 * The operation id for the '<em>Remove Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION___REMOVE_SERVICE__QNAME = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 39;

	/**
	 * The operation id for the '<em>Remove Binding</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION___REMOVE_BINDING__QNAME = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 40;

	/**
	 * The operation id for the '<em>Remove Port Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION___REMOVE_PORT_TYPE__QNAME = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 41;

	/**
	 * The operation id for the '<em>Remove Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION___REMOVE_MESSAGE__QNAME = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 42;

	/**
	 * The operation id for the '<em>Get Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION___GET_TYPES = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 43;

	/**
	 * The operation id for the '<em>Set Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION___SET_TYPES__TYPES = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 44;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION___TO_STRING = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 45;

	/**
	 * The operation id for the '<em>Get Document</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION___GET_DOCUMENT = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 46;

	/**
	 * The operation id for the '<em>Set Document</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION___SET_DOCUMENT__DOCUMENT = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 47;

	/**
	 * The number of operations of the '<em>Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_OPERATION_COUNT = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 48;

	/**
	 * The meta object id for the '{@link tesis.wsdl_ecore.wsdl.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.wsdl_ecore.wsdl.impl.ImportImpl
	 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 11;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__DOCUMENTATION_ELEMENT = EXTENSIBLE_ELEMENT__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__ELEMENT = EXTENSIBLE_ELEMENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__EEXTENSIBILITY_ELEMENTS = EXTENSIBLE_ELEMENT__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Namespace URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__NAMESPACE_URI = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__LOCATION_URI = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>EDefinition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__EDEFINITION = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>ESchema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__ESCHEMA = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Enclosing Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT___GET_ENCLOSING_DEFINITION = EXTENSIBLE_ELEMENT___GET_ENCLOSING_DEFINITION;

	/**
	 * The operation id for the '<em>Set Enclosing Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT___SET_ENCLOSING_DEFINITION__DEFINITION = EXTENSIBLE_ELEMENT___SET_ENCLOSING_DEFINITION__DEFINITION;

	/**
	 * The operation id for the '<em>Get Extensibility Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT___GET_EXTENSIBILITY_ELEMENTS = EXTENSIBLE_ELEMENT___GET_EXTENSIBILITY_ELEMENTS;

	/**
	 * The operation id for the '<em>Add Extensibility Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT = EXTENSIBLE_ELEMENT___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT;

	/**
	 * The operation id for the '<em>Get Extension Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT___GET_EXTENSION_ATTRIBUTE__QNAME = EXTENSIBLE_ELEMENT___GET_EXTENSION_ATTRIBUTE__QNAME;

	/**
	 * The operation id for the '<em>Set Extension Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT___SET_EXTENSION_ATTRIBUTE__QNAME_OBJECT = EXTENSIBLE_ELEMENT___SET_EXTENSION_ATTRIBUTE__QNAME_OBJECT;

	/**
	 * The operation id for the '<em>Get Extension Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT___GET_EXTENSION_ATTRIBUTES = EXTENSIBLE_ELEMENT___GET_EXTENSION_ATTRIBUTES;

	/**
	 * The operation id for the '<em>Get Native Attribute Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT___GET_NATIVE_ATTRIBUTE_NAMES = EXTENSIBLE_ELEMENT___GET_NATIVE_ATTRIBUTE_NAMES;

	/**
	 * The operation id for the '<em>Get Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT___GET_SCHEMA = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT___SET_SCHEMA__XSDSCHEMA = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_OPERATION_COUNT = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link tesis.wsdl_ecore.wsdl.impl.MessageReferenceImpl <em>Message Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.wsdl_ecore.wsdl.impl.MessageReferenceImpl
	 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getMessageReference()
	 * @generated
	 */
	int MESSAGE_REFERENCE = 46;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_REFERENCE__DOCUMENTATION_ELEMENT = EXTENSIBLE_ELEMENT__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_REFERENCE__ELEMENT = EXTENSIBLE_ELEMENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_REFERENCE__EEXTENSIBILITY_ELEMENTS = EXTENSIBLE_ELEMENT__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_REFERENCE__NAME = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EMessage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_REFERENCE__EMESSAGE = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Message Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_REFERENCE_FEATURE_COUNT = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Enclosing Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_REFERENCE___GET_ENCLOSING_DEFINITION = EXTENSIBLE_ELEMENT___GET_ENCLOSING_DEFINITION;

	/**
	 * The operation id for the '<em>Set Enclosing Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_REFERENCE___SET_ENCLOSING_DEFINITION__DEFINITION = EXTENSIBLE_ELEMENT___SET_ENCLOSING_DEFINITION__DEFINITION;

	/**
	 * The operation id for the '<em>Get Extensibility Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_REFERENCE___GET_EXTENSIBILITY_ELEMENTS = EXTENSIBLE_ELEMENT___GET_EXTENSIBILITY_ELEMENTS;

	/**
	 * The operation id for the '<em>Add Extensibility Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_REFERENCE___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT = EXTENSIBLE_ELEMENT___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT;

	/**
	 * The operation id for the '<em>Get Extension Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_REFERENCE___GET_EXTENSION_ATTRIBUTE__QNAME = EXTENSIBLE_ELEMENT___GET_EXTENSION_ATTRIBUTE__QNAME;

	/**
	 * The operation id for the '<em>Set Extension Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_REFERENCE___SET_EXTENSION_ATTRIBUTE__QNAME_OBJECT = EXTENSIBLE_ELEMENT___SET_EXTENSION_ATTRIBUTE__QNAME_OBJECT;

	/**
	 * The operation id for the '<em>Get Extension Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_REFERENCE___GET_EXTENSION_ATTRIBUTES = EXTENSIBLE_ELEMENT___GET_EXTENSION_ATTRIBUTES;

	/**
	 * The operation id for the '<em>Get Native Attribute Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_REFERENCE___GET_NATIVE_ATTRIBUTE_NAMES = EXTENSIBLE_ELEMENT___GET_NATIVE_ATTRIBUTE_NAMES;

	/**
	 * The number of operations of the '<em>Message Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_REFERENCE_OPERATION_COUNT = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tesis.wsdl_ecore.wsdl.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.wsdl_ecore.wsdl.impl.InputImpl
	 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 13;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__DOCUMENTATION_ELEMENT = MESSAGE_REFERENCE__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__ELEMENT = MESSAGE_REFERENCE__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__EEXTENSIBILITY_ELEMENTS = MESSAGE_REFERENCE__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__NAME = MESSAGE_REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>EMessage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__EMESSAGE = MESSAGE_REFERENCE__EMESSAGE;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = MESSAGE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Enclosing Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT___GET_ENCLOSING_DEFINITION = MESSAGE_REFERENCE___GET_ENCLOSING_DEFINITION;

	/**
	 * The operation id for the '<em>Set Enclosing Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT___SET_ENCLOSING_DEFINITION__DEFINITION = MESSAGE_REFERENCE___SET_ENCLOSING_DEFINITION__DEFINITION;

	/**
	 * The operation id for the '<em>Get Extensibility Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT___GET_EXTENSIBILITY_ELEMENTS = MESSAGE_REFERENCE___GET_EXTENSIBILITY_ELEMENTS;

	/**
	 * The operation id for the '<em>Add Extensibility Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT = MESSAGE_REFERENCE___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT;

	/**
	 * The operation id for the '<em>Get Extension Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT___GET_EXTENSION_ATTRIBUTE__QNAME = MESSAGE_REFERENCE___GET_EXTENSION_ATTRIBUTE__QNAME;

	/**
	 * The operation id for the '<em>Set Extension Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT___SET_EXTENSION_ATTRIBUTE__QNAME_OBJECT = MESSAGE_REFERENCE___SET_EXTENSION_ATTRIBUTE__QNAME_OBJECT;

	/**
	 * The operation id for the '<em>Get Extension Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT___GET_EXTENSION_ATTRIBUTES = MESSAGE_REFERENCE___GET_EXTENSION_ATTRIBUTES;

	/**
	 * The operation id for the '<em>Get Native Attribute Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT___GET_NATIVE_ATTRIBUTE_NAMES = MESSAGE_REFERENCE___GET_NATIVE_ATTRIBUTE_NAMES;

	/**
	 * The operation id for the '<em>Get Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT___GET_MESSAGE = MESSAGE_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT___SET_MESSAGE__MESSAGE = MESSAGE_REFERENCE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OPERATION_COUNT = MESSAGE_REFERENCE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link tesis.wsdl_ecore.wsdl.impl.OutputImpl <em>Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.wsdl_ecore.wsdl.impl.OutputImpl
	 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getOutput()
	 * @generated
	 */
	int OUTPUT = 14;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__DOCUMENTATION_ELEMENT = MESSAGE_REFERENCE__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__ELEMENT = MESSAGE_REFERENCE__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__EEXTENSIBILITY_ELEMENTS = MESSAGE_REFERENCE__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__NAME = MESSAGE_REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>EMessage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__EMESSAGE = MESSAGE_REFERENCE__EMESSAGE;

	/**
	 * The number of structural features of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FEATURE_COUNT = MESSAGE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Enclosing Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT___GET_ENCLOSING_DEFINITION = MESSAGE_REFERENCE___GET_ENCLOSING_DEFINITION;

	/**
	 * The operation id for the '<em>Set Enclosing Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT___SET_ENCLOSING_DEFINITION__DEFINITION = MESSAGE_REFERENCE___SET_ENCLOSING_DEFINITION__DEFINITION;

	/**
	 * The operation id for the '<em>Get Extensibility Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT___GET_EXTENSIBILITY_ELEMENTS = MESSAGE_REFERENCE___GET_EXTENSIBILITY_ELEMENTS;

	/**
	 * The operation id for the '<em>Add Extensibility Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT = MESSAGE_REFERENCE___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT;

	/**
	 * The operation id for the '<em>Get Extension Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT___GET_EXTENSION_ATTRIBUTE__QNAME = MESSAGE_REFERENCE___GET_EXTENSION_ATTRIBUTE__QNAME;

	/**
	 * The operation id for the '<em>Set Extension Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT___SET_EXTENSION_ATTRIBUTE__QNAME_OBJECT = MESSAGE_REFERENCE___SET_EXTENSION_ATTRIBUTE__QNAME_OBJECT;

	/**
	 * The operation id for the '<em>Get Extension Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT___GET_EXTENSION_ATTRIBUTES = MESSAGE_REFERENCE___GET_EXTENSION_ATTRIBUTES;

	/**
	 * The operation id for the '<em>Get Native Attribute Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT___GET_NATIVE_ATTRIBUTE_NAMES = MESSAGE_REFERENCE___GET_NATIVE_ATTRIBUTE_NAMES;

	/**
	 * The operation id for the '<em>Get Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT___GET_MESSAGE = MESSAGE_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT___SET_MESSAGE__MESSAGE = MESSAGE_REFERENCE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_OPERATION_COUNT = MESSAGE_REFERENCE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link tesis.wsdl_ecore.wsdl.impl.FaultImpl <em>Fault</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.wsdl_ecore.wsdl.impl.FaultImpl
	 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getFault()
	 * @generated
	 */
	int FAULT = 15;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT__DOCUMENTATION_ELEMENT = MESSAGE_REFERENCE__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT__ELEMENT = MESSAGE_REFERENCE__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT__EEXTENSIBILITY_ELEMENTS = MESSAGE_REFERENCE__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT__NAME = MESSAGE_REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>EMessage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT__EMESSAGE = MESSAGE_REFERENCE__EMESSAGE;

	/**
	 * The number of structural features of the '<em>Fault</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_FEATURE_COUNT = MESSAGE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Enclosing Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT___GET_ENCLOSING_DEFINITION = MESSAGE_REFERENCE___GET_ENCLOSING_DEFINITION;

	/**
	 * The operation id for the '<em>Set Enclosing Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT___SET_ENCLOSING_DEFINITION__DEFINITION = MESSAGE_REFERENCE___SET_ENCLOSING_DEFINITION__DEFINITION;

	/**
	 * The operation id for the '<em>Get Extensibility Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT___GET_EXTENSIBILITY_ELEMENTS = MESSAGE_REFERENCE___GET_EXTENSIBILITY_ELEMENTS;

	/**
	 * The operation id for the '<em>Add Extensibility Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT = MESSAGE_REFERENCE___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT;

	/**
	 * The operation id for the '<em>Get Extension Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT___GET_EXTENSION_ATTRIBUTE__QNAME = MESSAGE_REFERENCE___GET_EXTENSION_ATTRIBUTE__QNAME;

	/**
	 * The operation id for the '<em>Set Extension Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT___SET_EXTENSION_ATTRIBUTE__QNAME_OBJECT = MESSAGE_REFERENCE___SET_EXTENSION_ATTRIBUTE__QNAME_OBJECT;

	/**
	 * The operation id for the '<em>Get Extension Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT___GET_EXTENSION_ATTRIBUTES = MESSAGE_REFERENCE___GET_EXTENSION_ATTRIBUTES;

	/**
	 * The operation id for the '<em>Get Native Attribute Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT___GET_NATIVE_ATTRIBUTE_NAMES = MESSAGE_REFERENCE___GET_NATIVE_ATTRIBUTE_NAMES;

	/**
	 * The operation id for the '<em>Get Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT___GET_MESSAGE = MESSAGE_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT___SET_MESSAGE__MESSAGE = MESSAGE_REFERENCE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Fault</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_OPERATION_COUNT = MESSAGE_REFERENCE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link tesis.wsdl_ecore.wsdl.impl.BindingInputImpl <em>Binding Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.wsdl_ecore.wsdl.impl.BindingInputImpl
	 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getBindingInput()
	 * @generated
	 */
	int BINDING_INPUT = 16;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_INPUT__DOCUMENTATION_ELEMENT = EXTENSIBLE_ELEMENT__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_INPUT__ELEMENT = EXTENSIBLE_ELEMENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_INPUT__EEXTENSIBILITY_ELEMENTS = EXTENSIBLE_ELEMENT__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_INPUT__NAME = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EInput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_INPUT__EINPUT = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binding Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_INPUT_FEATURE_COUNT = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Enclosing Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_INPUT___GET_ENCLOSING_DEFINITION = EXTENSIBLE_ELEMENT___GET_ENCLOSING_DEFINITION;

	/**
	 * The operation id for the '<em>Set Enclosing Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_INPUT___SET_ENCLOSING_DEFINITION__DEFINITION = EXTENSIBLE_ELEMENT___SET_ENCLOSING_DEFINITION__DEFINITION;

	/**
	 * The operation id for the '<em>Get Extensibility Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_INPUT___GET_EXTENSIBILITY_ELEMENTS = EXTENSIBLE_ELEMENT___GET_EXTENSIBILITY_ELEMENTS;

	/**
	 * The operation id for the '<em>Add Extensibility Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_INPUT___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT = EXTENSIBLE_ELEMENT___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT;

	/**
	 * The operation id for the '<em>Get Extension Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_INPUT___GET_EXTENSION_ATTRIBUTE__QNAME = EXTENSIBLE_ELEMENT___GET_EXTENSION_ATTRIBUTE__QNAME;

	/**
	 * The operation id for the '<em>Set Extension Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_INPUT___SET_EXTENSION_ATTRIBUTE__QNAME_OBJECT = EXTENSIBLE_ELEMENT___SET_EXTENSION_ATTRIBUTE__QNAME_OBJECT;

	/**
	 * The operation id for the '<em>Get Extension Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_INPUT___GET_EXTENSION_ATTRIBUTES = EXTENSIBLE_ELEMENT___GET_EXTENSION_ATTRIBUTES;

	/**
	 * The operation id for the '<em>Get Native Attribute Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_INPUT___GET_NATIVE_ATTRIBUTE_NAMES = EXTENSIBLE_ELEMENT___GET_NATIVE_ATTRIBUTE_NAMES;

	/**
	 * The operation id for the '<em>Get Input</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_INPUT___GET_INPUT = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Input</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_INPUT___SET_INPUT__INPUT = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Binding Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_INPUT_OPERATION_COUNT = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link tesis.wsdl_ecore.wsdl.impl.BindingOutputImpl <em>Binding Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.wsdl_ecore.wsdl.impl.BindingOutputImpl
	 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getBindingOutput()
	 * @generated
	 */
	int BINDING_OUTPUT = 17;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OUTPUT__DOCUMENTATION_ELEMENT = EXTENSIBLE_ELEMENT__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OUTPUT__ELEMENT = EXTENSIBLE_ELEMENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OUTPUT__EEXTENSIBILITY_ELEMENTS = EXTENSIBLE_ELEMENT__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OUTPUT__NAME = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EOutput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OUTPUT__EOUTPUT = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binding Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OUTPUT_FEATURE_COUNT = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Enclosing Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OUTPUT___GET_ENCLOSING_DEFINITION = EXTENSIBLE_ELEMENT___GET_ENCLOSING_DEFINITION;

	/**
	 * The operation id for the '<em>Set Enclosing Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OUTPUT___SET_ENCLOSING_DEFINITION__DEFINITION = EXTENSIBLE_ELEMENT___SET_ENCLOSING_DEFINITION__DEFINITION;

	/**
	 * The operation id for the '<em>Get Extensibility Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OUTPUT___GET_EXTENSIBILITY_ELEMENTS = EXTENSIBLE_ELEMENT___GET_EXTENSIBILITY_ELEMENTS;

	/**
	 * The operation id for the '<em>Add Extensibility Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OUTPUT___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT = EXTENSIBLE_ELEMENT___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT;

	/**
	 * The operation id for the '<em>Get Extension Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OUTPUT___GET_EXTENSION_ATTRIBUTE__QNAME = EXTENSIBLE_ELEMENT___GET_EXTENSION_ATTRIBUTE__QNAME;

	/**
	 * The operation id for the '<em>Set Extension Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OUTPUT___SET_EXTENSION_ATTRIBUTE__QNAME_OBJECT = EXTENSIBLE_ELEMENT___SET_EXTENSION_ATTRIBUTE__QNAME_OBJECT;

	/**
	 * The operation id for the '<em>Get Extension Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OUTPUT___GET_EXTENSION_ATTRIBUTES = EXTENSIBLE_ELEMENT___GET_EXTENSION_ATTRIBUTES;

	/**
	 * The operation id for the '<em>Get Native Attribute Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OUTPUT___GET_NATIVE_ATTRIBUTE_NAMES = EXTENSIBLE_ELEMENT___GET_NATIVE_ATTRIBUTE_NAMES;

	/**
	 * The operation id for the '<em>Get Output</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OUTPUT___GET_OUTPUT = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Output</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OUTPUT___SET_OUTPUT__OUTPUT = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Binding Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OUTPUT_OPERATION_COUNT = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link tesis.wsdl_ecore.wsdl.impl.BindingFaultImpl <em>Binding Fault</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.wsdl_ecore.wsdl.impl.BindingFaultImpl
	 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getBindingFault()
	 * @generated
	 */
	int BINDING_FAULT = 18;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FAULT__DOCUMENTATION_ELEMENT = EXTENSIBLE_ELEMENT__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FAULT__ELEMENT = EXTENSIBLE_ELEMENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FAULT__EEXTENSIBILITY_ELEMENTS = EXTENSIBLE_ELEMENT__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FAULT__NAME = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EFault</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FAULT__EFAULT = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binding Fault</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FAULT_FEATURE_COUNT = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Enclosing Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FAULT___GET_ENCLOSING_DEFINITION = EXTENSIBLE_ELEMENT___GET_ENCLOSING_DEFINITION;

	/**
	 * The operation id for the '<em>Set Enclosing Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FAULT___SET_ENCLOSING_DEFINITION__DEFINITION = EXTENSIBLE_ELEMENT___SET_ENCLOSING_DEFINITION__DEFINITION;

	/**
	 * The operation id for the '<em>Get Extensibility Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FAULT___GET_EXTENSIBILITY_ELEMENTS = EXTENSIBLE_ELEMENT___GET_EXTENSIBILITY_ELEMENTS;

	/**
	 * The operation id for the '<em>Add Extensibility Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FAULT___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT = EXTENSIBLE_ELEMENT___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT;

	/**
	 * The operation id for the '<em>Get Extension Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FAULT___GET_EXTENSION_ATTRIBUTE__QNAME = EXTENSIBLE_ELEMENT___GET_EXTENSION_ATTRIBUTE__QNAME;

	/**
	 * The operation id for the '<em>Set Extension Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FAULT___SET_EXTENSION_ATTRIBUTE__QNAME_OBJECT = EXTENSIBLE_ELEMENT___SET_EXTENSION_ATTRIBUTE__QNAME_OBJECT;

	/**
	 * The operation id for the '<em>Get Extension Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FAULT___GET_EXTENSION_ATTRIBUTES = EXTENSIBLE_ELEMENT___GET_EXTENSION_ATTRIBUTES;

	/**
	 * The operation id for the '<em>Get Native Attribute Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FAULT___GET_NATIVE_ATTRIBUTE_NAMES = EXTENSIBLE_ELEMENT___GET_NATIVE_ATTRIBUTE_NAMES;

	/**
	 * The operation id for the '<em>Get Fault</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FAULT___GET_FAULT = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Fault</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FAULT___SET_FAULT__FAULT = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Binding Fault</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FAULT_OPERATION_COUNT = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link tesis.wsdl_ecore.wsdl.impl.NamespaceImpl <em>Namespace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.wsdl_ecore.wsdl.impl.NamespaceImpl
	 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getNamespace()
	 * @generated
	 */
	int NAMESPACE = 19;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__URI = 0;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__PREFIX = 1;

	/**
	 * The number of structural features of the '<em>Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link javax.wsdl.extensions.AttributeExtensible <em>IAttribute Extensible</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.wsdl.extensions.AttributeExtensible
	 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getIAttributeExtensible()
	 * @generated
	 */
	int IATTRIBUTE_EXTENSIBLE = 48;

	/**
	 * The number of structural features of the '<em>IAttribute Extensible</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IATTRIBUTE_EXTENSIBLE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Extension Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IATTRIBUTE_EXTENSIBLE___GET_EXTENSION_ATTRIBUTE__QNAME = 0;

	/**
	 * The operation id for the '<em>Set Extension Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IATTRIBUTE_EXTENSIBLE___SET_EXTENSION_ATTRIBUTE__QNAME_OBJECT = 1;

	/**
	 * The operation id for the '<em>Get Extension Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IATTRIBUTE_EXTENSIBLE___GET_EXTENSION_ATTRIBUTES = 2;

	/**
	 * The operation id for the '<em>Get Native Attribute Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IATTRIBUTE_EXTENSIBLE___GET_NATIVE_ATTRIBUTE_NAMES = 3;

	/**
	 * The number of operations of the '<em>IAttribute Extensible</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IATTRIBUTE_EXTENSIBLE_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link javax.wsdl.PortType <em>IPort Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.wsdl.PortType
	 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getIPortType()
	 * @generated
	 */
	int IPORT_TYPE = 20;

	/**
	 * The number of structural features of the '<em>IPort Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPORT_TYPE_FEATURE_COUNT = IATTRIBUTE_EXTENSIBLE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Extension Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPORT_TYPE___GET_EXTENSION_ATTRIBUTE__QNAME = IATTRIBUTE_EXTENSIBLE___GET_EXTENSION_ATTRIBUTE__QNAME;

	/**
	 * The operation id for the '<em>Set Extension Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPORT_TYPE___SET_EXTENSION_ATTRIBUTE__QNAME_OBJECT = IATTRIBUTE_EXTENSIBLE___SET_EXTENSION_ATTRIBUTE__QNAME_OBJECT;

	/**
	 * The operation id for the '<em>Get Extension Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPORT_TYPE___GET_EXTENSION_ATTRIBUTES = IATTRIBUTE_EXTENSIBLE___GET_EXTENSION_ATTRIBUTES;

	/**
	 * The operation id for the '<em>Get Native Attribute Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPORT_TYPE___GET_NATIVE_ATTRIBUTE_NAMES = IATTRIBUTE_EXTENSIBLE___GET_NATIVE_ATTRIBUTE_NAMES;

	/**
	 * The operation id for the '<em>Add Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPORT_TYPE___ADD_OPERATION__OPERATION = IATTRIBUTE_EXTENSIBLE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPORT_TYPE___GET_OPERATION__STRING_STRING_STRING = IATTRIBUTE_EXTENSIBLE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Operations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPORT_TYPE___GET_OPERATIONS = IATTRIBUTE_EXTENSIBLE_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>IPort Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPORT_TYPE_OPERATION_COUNT = IATTRIBUTE_EXTENSIBLE_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link javax.wsdl.extensions.ElementExtensible <em>IElement Extensible</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.wsdl.extensions.ElementExtensible
	 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getIElementExtensible()
	 * @generated
	 */
	int IELEMENT_EXTENSIBLE = 47;

	/**
	 * The number of structural features of the '<em>IElement Extensible</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IELEMENT_EXTENSIBLE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Extensibility Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IELEMENT_EXTENSIBLE___GET_EXTENSIBILITY_ELEMENTS = 0;

	/**
	 * The operation id for the '<em>Add Extensibility Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IELEMENT_EXTENSIBLE___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT = 1;

	/**
	 * The number of operations of the '<em>IElement Extensible</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IELEMENT_EXTENSIBLE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link javax.wsdl.Operation <em>IOperation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.wsdl.Operation
	 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getIOperation()
	 * @generated
	 */
	int IOPERATION = 21;

	/**
	 * The number of structural features of the '<em>IOperation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOPERATION_FEATURE_COUNT = IELEMENT_EXTENSIBLE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Extensibility Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOPERATION___GET_EXTENSIBILITY_ELEMENTS = IELEMENT_EXTENSIBLE___GET_EXTENSIBILITY_ELEMENTS;

	/**
	 * The operation id for the '<em>Add Extensibility Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOPERATION___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT = IELEMENT_EXTENSIBLE___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT;

	/**
	 * The operation id for the '<em>Add Fault</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOPERATION___ADD_FAULT__FAULT = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Fault</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOPERATION___GET_FAULT__STRING = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Faults</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOPERATION___GET_FAULTS = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Parameter Ordering</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOPERATION___GET_PARAMETER_ORDERING = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Set Parameter Ordering</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOPERATION___SET_PARAMETER_ORDERING__LIST = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Input</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOPERATION___GET_INPUT = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Set Input</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOPERATION___SET_INPUT__INPUT = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Output</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOPERATION___GET_OUTPUT = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Set Output</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOPERATION___SET_OUTPUT__OUTPUT = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 8;

	/**
	 * The number of operations of the '<em>IOperation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOPERATION_OPERATION_COUNT = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 9;

	/**
	 * The meta object id for the '{@link javax.wsdl.Input <em>IInput</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.wsdl.Input
	 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getIInput()
	 * @generated
	 */
	int IINPUT = 22;

	/**
	 * The number of structural features of the '<em>IInput</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IINPUT_FEATURE_COUNT = IATTRIBUTE_EXTENSIBLE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Extension Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IINPUT___GET_EXTENSION_ATTRIBUTE__QNAME = IATTRIBUTE_EXTENSIBLE___GET_EXTENSION_ATTRIBUTE__QNAME;

	/**
	 * The operation id for the '<em>Set Extension Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IINPUT___SET_EXTENSION_ATTRIBUTE__QNAME_OBJECT = IATTRIBUTE_EXTENSIBLE___SET_EXTENSION_ATTRIBUTE__QNAME_OBJECT;

	/**
	 * The operation id for the '<em>Get Extension Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IINPUT___GET_EXTENSION_ATTRIBUTES = IATTRIBUTE_EXTENSIBLE___GET_EXTENSION_ATTRIBUTES;

	/**
	 * The operation id for the '<em>Get Native Attribute Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IINPUT___GET_NATIVE_ATTRIBUTE_NAMES = IATTRIBUTE_EXTENSIBLE___GET_NATIVE_ATTRIBUTE_NAMES;

	/**
	 * The operation id for the '<em>Get Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IINPUT___GET_MESSAGE = IATTRIBUTE_EXTENSIBLE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IINPUT___SET_MESSAGE__MESSAGE = IATTRIBUTE_EXTENSIBLE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>IInput</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IINPUT_OPERATION_COUNT = IATTRIBUTE_EXTENSIBLE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link javax.wsdl.Output <em>IOutput</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.wsdl.Output
	 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getIOutput()
	 * @generated
	 */
	int IOUTPUT = 23;

	/**
	 * The number of structural features of the '<em>IOutput</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOUTPUT_FEATURE_COUNT = IATTRIBUTE_EXTENSIBLE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Extension Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOUTPUT___GET_EXTENSION_ATTRIBUTE__QNAME = IATTRIBUTE_EXTENSIBLE___GET_EXTENSION_ATTRIBUTE__QNAME;

	/**
	 * The operation id for the '<em>Set Extension Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOUTPUT___SET_EXTENSION_ATTRIBUTE__QNAME_OBJECT = IATTRIBUTE_EXTENSIBLE___SET_EXTENSION_ATTRIBUTE__QNAME_OBJECT;

	/**
	 * The operation id for the '<em>Get Extension Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOUTPUT___GET_EXTENSION_ATTRIBUTES = IATTRIBUTE_EXTENSIBLE___GET_EXTENSION_ATTRIBUTES;

	/**
	 * The operation id for the '<em>Get Native Attribute Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOUTPUT___GET_NATIVE_ATTRIBUTE_NAMES = IATTRIBUTE_EXTENSIBLE___GET_NATIVE_ATTRIBUTE_NAMES;

	/**
	 * The operation id for the '<em>Get Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOUTPUT___GET_MESSAGE = IATTRIBUTE_EXTENSIBLE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOUTPUT___SET_MESSAGE__MESSAGE = IATTRIBUTE_EXTENSIBLE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>IOutput</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOUTPUT_OPERATION_COUNT = IATTRIBUTE_EXTENSIBLE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link javax.wsdl.Fault <em>IFault</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.wsdl.Fault
	 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getIFault()
	 * @generated
	 */
	int IFAULT = 24;

	/**
	 * The number of structural features of the '<em>IFault</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFAULT_FEATURE_COUNT = IATTRIBUTE_EXTENSIBLE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Extension Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFAULT___GET_EXTENSION_ATTRIBUTE__QNAME = IATTRIBUTE_EXTENSIBLE___GET_EXTENSION_ATTRIBUTE__QNAME;

	/**
	 * The operation id for the '<em>Set Extension Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFAULT___SET_EXTENSION_ATTRIBUTE__QNAME_OBJECT = IATTRIBUTE_EXTENSIBLE___SET_EXTENSION_ATTRIBUTE__QNAME_OBJECT;

	/**
	 * The operation id for the '<em>Get Extension Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFAULT___GET_EXTENSION_ATTRIBUTES = IATTRIBUTE_EXTENSIBLE___GET_EXTENSION_ATTRIBUTES;

	/**
	 * The operation id for the '<em>Get Native Attribute Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFAULT___GET_NATIVE_ATTRIBUTE_NAMES = IATTRIBUTE_EXTENSIBLE___GET_NATIVE_ATTRIBUTE_NAMES;

	/**
	 * The operation id for the '<em>Get Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFAULT___GET_MESSAGE = IATTRIBUTE_EXTENSIBLE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFAULT___SET_MESSAGE__MESSAGE = IATTRIBUTE_EXTENSIBLE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>IFault</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFAULT_OPERATION_COUNT = IATTRIBUTE_EXTENSIBLE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link javax.wsdl.Message <em>IMessage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.wsdl.Message
	 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getIMessage()
	 * @generated
	 */
	int IMESSAGE = 25;

	/**
	 * The number of structural features of the '<em>IMessage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMESSAGE_FEATURE_COUNT = IELEMENT_EXTENSIBLE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Extensibility Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMESSAGE___GET_EXTENSIBILITY_ELEMENTS = IELEMENT_EXTENSIBLE___GET_EXTENSIBILITY_ELEMENTS;

	/**
	 * The operation id for the '<em>Add Extensibility Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMESSAGE___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT = IELEMENT_EXTENSIBLE___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT;

	/**
	 * The operation id for the '<em>Add Part</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMESSAGE___ADD_PART__PART = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Part</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMESSAGE___GET_PART__STRING = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMESSAGE___GET_PARTS = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Ordered Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMESSAGE___GET_ORDERED_PARTS__LIST = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>IMessage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMESSAGE_OPERATION_COUNT = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link javax.wsdl.Part <em>IPart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.wsdl.Part
	 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getIPart()
	 * @generated
	 */
	int IPART = 26;

	/**
	 * The number of structural features of the '<em>IPart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPART_FEATURE_COUNT = IATTRIBUTE_EXTENSIBLE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Extension Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPART___GET_EXTENSION_ATTRIBUTE__QNAME = IATTRIBUTE_EXTENSIBLE___GET_EXTENSION_ATTRIBUTE__QNAME;

	/**
	 * The operation id for the '<em>Set Extension Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPART___SET_EXTENSION_ATTRIBUTE__QNAME_OBJECT = IATTRIBUTE_EXTENSIBLE___SET_EXTENSION_ATTRIBUTE__QNAME_OBJECT;

	/**
	 * The operation id for the '<em>Get Extension Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPART___GET_EXTENSION_ATTRIBUTES = IATTRIBUTE_EXTENSIBLE___GET_EXTENSION_ATTRIBUTES;

	/**
	 * The operation id for the '<em>Get Native Attribute Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPART___GET_NATIVE_ATTRIBUTE_NAMES = IATTRIBUTE_EXTENSIBLE___GET_NATIVE_ATTRIBUTE_NAMES;

	/**
	 * The number of operations of the '<em>IPart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPART_OPERATION_COUNT = IATTRIBUTE_EXTENSIBLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link javax.wsdl.Service <em>IService</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.wsdl.Service
	 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getIService()
	 * @generated
	 */
	int ISERVICE = 27;

	/**
	 * The number of structural features of the '<em>IService</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICE_FEATURE_COUNT = IELEMENT_EXTENSIBLE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Extensibility Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICE___GET_EXTENSIBILITY_ELEMENTS = IELEMENT_EXTENSIBLE___GET_EXTENSIBILITY_ELEMENTS;

	/**
	 * The operation id for the '<em>Add Extensibility Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICE___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT = IELEMENT_EXTENSIBLE___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT;

	/**
	 * The operation id for the '<em>Add Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICE___ADD_PORT__PORT = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Ports</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICE___GET_PORTS = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICE___GET_PORT__STRING = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>IService</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICE_OPERATION_COUNT = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link javax.wsdl.Port <em>IPort</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.wsdl.Port
	 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getIPort()
	 * @generated
	 */
	int IPORT = 28;

	/**
	 * The number of structural features of the '<em>IPort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPORT_FEATURE_COUNT = IELEMENT_EXTENSIBLE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Extensibility Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPORT___GET_EXTENSIBILITY_ELEMENTS = IELEMENT_EXTENSIBLE___GET_EXTENSIBILITY_ELEMENTS;

	/**
	 * The operation id for the '<em>Add Extensibility Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPORT___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT = IELEMENT_EXTENSIBLE___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT;

	/**
	 * The operation id for the '<em>Get Binding</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPORT___GET_BINDING = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Binding</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPORT___SET_BINDING__BINDING = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>IPort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPORT_OPERATION_COUNT = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link javax.wsdl.Binding <em>IBinding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.wsdl.Binding
	 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getIBinding()
	 * @generated
	 */
	int IBINDING = 29;

	/**
	 * The number of structural features of the '<em>IBinding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBINDING_FEATURE_COUNT = IELEMENT_EXTENSIBLE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Extensibility Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBINDING___GET_EXTENSIBILITY_ELEMENTS = IELEMENT_EXTENSIBLE___GET_EXTENSIBILITY_ELEMENTS;

	/**
	 * The operation id for the '<em>Add Extensibility Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBINDING___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT = IELEMENT_EXTENSIBLE___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT;

	/**
	 * The operation id for the '<em>Add Binding Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBINDING___ADD_BINDING_OPERATION__BINDINGOPERATION = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Binding Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBINDING___GET_BINDING_OPERATION__STRING_STRING_STRING = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Binding Operations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBINDING___GET_BINDING_OPERATIONS = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Port Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBINDING___GET_PORT_TYPE = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Set Port Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBINDING___SET_PORT_TYPE__PORTTYPE = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>IBinding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBINDING_OPERATION_COUNT = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link javax.wsdl.BindingOperation <em>IBinding Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.wsdl.BindingOperation
	 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getIBindingOperation()
	 * @generated
	 */
	int IBINDING_OPERATION = 30;

	/**
	 * The number of structural features of the '<em>IBinding Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBINDING_OPERATION_FEATURE_COUNT = IELEMENT_EXTENSIBLE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Extensibility Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBINDING_OPERATION___GET_EXTENSIBILITY_ELEMENTS = IELEMENT_EXTENSIBLE___GET_EXTENSIBILITY_ELEMENTS;

	/**
	 * The operation id for the '<em>Add Extensibility Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBINDING_OPERATION___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT = IELEMENT_EXTENSIBLE___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT;

	/**
	 * The operation id for the '<em>Add Binding Fault</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBINDING_OPERATION___ADD_BINDING_FAULT__BINDINGFAULT = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Binding Fault</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBINDING_OPERATION___GET_BINDING_FAULT__STRING = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Binding Faults</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBINDING_OPERATION___GET_BINDING_FAULTS = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBINDING_OPERATION___GET_OPERATION = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Set Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBINDING_OPERATION___SET_OPERATION__OPERATION = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Binding Input</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBINDING_OPERATION___GET_BINDING_INPUT = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Set Binding Input</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBINDING_OPERATION___SET_BINDING_INPUT__BINDINGINPUT = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Binding Output</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBINDING_OPERATION___GET_BINDING_OUTPUT = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Set Binding Output</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBINDING_OPERATION___SET_BINDING_OUTPUT__BINDINGOUTPUT = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 8;

	/**
	 * The number of operations of the '<em>IBinding Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBINDING_OPERATION_OPERATION_COUNT = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 9;

	/**
	 * The meta object id for the '{@link javax.wsdl.BindingInput <em>IBinding Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.wsdl.BindingInput
	 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getIBindingInput()
	 * @generated
	 */
	int IBINDING_INPUT = 31;

	/**
	 * The number of structural features of the '<em>IBinding Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBINDING_INPUT_FEATURE_COUNT = IELEMENT_EXTENSIBLE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Extensibility Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBINDING_INPUT___GET_EXTENSIBILITY_ELEMENTS = IELEMENT_EXTENSIBLE___GET_EXTENSIBILITY_ELEMENTS;

	/**
	 * The operation id for the '<em>Add Extensibility Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBINDING_INPUT___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT = IELEMENT_EXTENSIBLE___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT;

	/**
	 * The number of operations of the '<em>IBinding Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBINDING_INPUT_OPERATION_COUNT = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link javax.wsdl.BindingOutput <em>IBinding Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.wsdl.BindingOutput
	 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getIBindingOutput()
	 * @generated
	 */
	int IBINDING_OUTPUT = 32;

	/**
	 * The number of structural features of the '<em>IBinding Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBINDING_OUTPUT_FEATURE_COUNT = IELEMENT_EXTENSIBLE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Extensibility Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBINDING_OUTPUT___GET_EXTENSIBILITY_ELEMENTS = IELEMENT_EXTENSIBLE___GET_EXTENSIBILITY_ELEMENTS;

	/**
	 * The operation id for the '<em>Add Extensibility Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBINDING_OUTPUT___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT = IELEMENT_EXTENSIBLE___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT;

	/**
	 * The number of operations of the '<em>IBinding Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBINDING_OUTPUT_OPERATION_COUNT = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link javax.wsdl.BindingFault <em>IBinding Fault</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.wsdl.BindingFault
	 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getIBindingFault()
	 * @generated
	 */
	int IBINDING_FAULT = 33;

	/**
	 * The number of structural features of the '<em>IBinding Fault</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBINDING_FAULT_FEATURE_COUNT = IELEMENT_EXTENSIBLE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Extensibility Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBINDING_FAULT___GET_EXTENSIBILITY_ELEMENTS = IELEMENT_EXTENSIBLE___GET_EXTENSIBILITY_ELEMENTS;

	/**
	 * The operation id for the '<em>Add Extensibility Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBINDING_FAULT___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT = IELEMENT_EXTENSIBLE___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT;

	/**
	 * The number of operations of the '<em>IBinding Fault</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBINDING_FAULT_OPERATION_COUNT = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link javax.wsdl.extensions.ExtensibilityElement <em>IExtensibility Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.wsdl.extensions.ExtensibilityElement
	 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getIExtensibilityElement()
	 * @generated
	 */
	int IEXTENSIBILITY_ELEMENT = 34;

	/**
	 * The number of structural features of the '<em>IExtensibility Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEXTENSIBILITY_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>IExtensibility Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEXTENSIBILITY_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link javax.wsdl.Definition <em>IDefinition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.wsdl.Definition
	 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getIDefinition()
	 * @generated
	 */
	int IDEFINITION = 35;

	/**
	 * The number of structural features of the '<em>IDefinition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEFINITION_FEATURE_COUNT = IELEMENT_EXTENSIBLE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Extensibility Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEFINITION___GET_EXTENSIBILITY_ELEMENTS = IELEMENT_EXTENSIBLE___GET_EXTENSIBILITY_ELEMENTS;

	/**
	 * The operation id for the '<em>Add Extensibility Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEFINITION___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT = IELEMENT_EXTENSIBLE___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT;

	/**
	 * The operation id for the '<em>Add Binding</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEFINITION___ADD_BINDING__BINDING = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Import</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEFINITION___ADD_IMPORT__IMPORT = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEFINITION___ADD_MESSAGE__MESSAGE = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Add Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEFINITION___ADD_NAMESPACE__STRING_STRING = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Add Port Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEFINITION___ADD_PORT_TYPE__PORTTYPE = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Add Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEFINITION___ADD_SERVICE__SERVICE = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Create Binding Fault</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEFINITION___CREATE_BINDING_FAULT = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Create Binding Input</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEFINITION___CREATE_BINDING_INPUT = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Create Binding Output</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEFINITION___CREATE_BINDING_OUTPUT = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Create Binding Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEFINITION___CREATE_BINDING_OPERATION = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Create Binding</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEFINITION___CREATE_BINDING = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Create Fault</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEFINITION___CREATE_FAULT = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Create Import</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEFINITION___CREATE_IMPORT = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Create Input</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEFINITION___CREATE_INPUT = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Create Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEFINITION___CREATE_MESSAGE = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Create Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEFINITION___CREATE_OPERATION = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Create Output</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEFINITION___CREATE_OUTPUT = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Create Part</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEFINITION___CREATE_PART = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Create Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEFINITION___CREATE_PORT = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Create Port Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEFINITION___CREATE_PORT_TYPE = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Create Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEFINITION___CREATE_SERVICE = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Get Binding</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEFINITION___GET_BINDING__QNAME = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Get Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEFINITION___GET_BINDINGS = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Get Imports</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEFINITION___GET_IMPORTS = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Get Imports</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEFINITION___GET_IMPORTS__STRING = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Get Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEFINITION___GET_MESSAGE__QNAME = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Get Messages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEFINITION___GET_MESSAGES = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEFINITION___GET_NAMESPACE__STRING = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Get Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEFINITION___GET_NAMESPACES = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Get Port Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEFINITION___GET_PORT_TYPE__QNAME = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Get Port Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEFINITION___GET_PORT_TYPES = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Get Prefix</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEFINITION___GET_PREFIX__STRING = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Get Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEFINITION___GET_SERVICE__QNAME = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>Get Services</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEFINITION___GET_SERVICES = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 33;

	/**
	 * The operation id for the '<em>Get Extension Registry</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEFINITION___GET_EXTENSION_REGISTRY = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 34;

	/**
	 * The operation id for the '<em>Set Extension Registry</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEFINITION___SET_EXTENSION_REGISTRY__EXTENSIONREGISTRY = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 35;

	/**
	 * The operation id for the '<em>Get Document Base URI</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEFINITION___GET_DOCUMENT_BASE_URI = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 36;

	/**
	 * The operation id for the '<em>Set Document Base URI</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEFINITION___SET_DOCUMENT_BASE_URI__STRING = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 37;

	/**
	 * The operation id for the '<em>Create Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEFINITION___CREATE_TYPES = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 38;

	/**
	 * The operation id for the '<em>Remove Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEFINITION___REMOVE_SERVICE__QNAME = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 39;

	/**
	 * The operation id for the '<em>Remove Binding</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEFINITION___REMOVE_BINDING__QNAME = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 40;

	/**
	 * The operation id for the '<em>Remove Port Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEFINITION___REMOVE_PORT_TYPE__QNAME = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 41;

	/**
	 * The operation id for the '<em>Remove Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEFINITION___REMOVE_MESSAGE__QNAME = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 42;

	/**
	 * The operation id for the '<em>Get Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEFINITION___GET_TYPES = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 43;

	/**
	 * The operation id for the '<em>Set Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEFINITION___SET_TYPES__TYPES = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 44;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEFINITION___TO_STRING = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 45;

	/**
	 * The number of operations of the '<em>IDefinition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEFINITION_OPERATION_COUNT = IELEMENT_EXTENSIBLE_OPERATION_COUNT + 46;

	/**
	 * The meta object id for the '{@link javax.wsdl.Import <em>IImport</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.wsdl.Import
	 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getIImport()
	 * @generated
	 */
	int IIMPORT = 36;

	/**
	 * The number of structural features of the '<em>IImport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IIMPORT_FEATURE_COUNT = IATTRIBUTE_EXTENSIBLE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Extension Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IIMPORT___GET_EXTENSION_ATTRIBUTE__QNAME = IATTRIBUTE_EXTENSIBLE___GET_EXTENSION_ATTRIBUTE__QNAME;

	/**
	 * The operation id for the '<em>Set Extension Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IIMPORT___SET_EXTENSION_ATTRIBUTE__QNAME_OBJECT = IATTRIBUTE_EXTENSIBLE___SET_EXTENSION_ATTRIBUTE__QNAME_OBJECT;

	/**
	 * The operation id for the '<em>Get Extension Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IIMPORT___GET_EXTENSION_ATTRIBUTES = IATTRIBUTE_EXTENSIBLE___GET_EXTENSION_ATTRIBUTES;

	/**
	 * The operation id for the '<em>Get Native Attribute Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IIMPORT___GET_NATIVE_ATTRIBUTE_NAMES = IATTRIBUTE_EXTENSIBLE___GET_NATIVE_ATTRIBUTE_NAMES;

	/**
	 * The number of operations of the '<em>IImport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IIMPORT_OPERATION_COUNT = IATTRIBUTE_EXTENSIBLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java.util.List <em>IList</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getIList()
	 * @generated
	 */
	int ILIST = 37;

	/**
	 * The number of structural features of the '<em>IList</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ILIST_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>IList</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ILIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link java.util.Map <em>IMap</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Map
	 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getIMap()
	 * @generated
	 */
	int IMAP = 38;

	/**
	 * The number of structural features of the '<em>IMap</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>IMap</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link java.net.URL <em>IURL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.net.URL
	 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getIURL()
	 * @generated
	 */
	int IURL = 39;

	/**
	 * The number of structural features of the '<em>IURL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IURL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>IURL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IURL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link javax.wsdl.extensions.ExtensionRegistry <em>IExtension Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.wsdl.extensions.ExtensionRegistry
	 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getIExtensionRegistry()
	 * @generated
	 */
	int IEXTENSION_REGISTRY = 40;

	/**
	 * The number of structural features of the '<em>IExtension Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEXTENSION_REGISTRY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>IExtension Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEXTENSION_REGISTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tesis.wsdl_ecore.wsdl.impl.TypesImpl <em>Types</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.wsdl_ecore.wsdl.impl.TypesImpl
	 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getTypes()
	 * @generated
	 */
	int TYPES = 41;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES__DOCUMENTATION_ELEMENT = EXTENSIBLE_ELEMENT__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES__ELEMENT = EXTENSIBLE_ELEMENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES__EEXTENSIBILITY_ELEMENTS = EXTENSIBLE_ELEMENT__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_FEATURE_COUNT = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Enclosing Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES___GET_ENCLOSING_DEFINITION = EXTENSIBLE_ELEMENT___GET_ENCLOSING_DEFINITION;

	/**
	 * The operation id for the '<em>Set Enclosing Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES___SET_ENCLOSING_DEFINITION__DEFINITION = EXTENSIBLE_ELEMENT___SET_ENCLOSING_DEFINITION__DEFINITION;

	/**
	 * The operation id for the '<em>Get Extensibility Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES___GET_EXTENSIBILITY_ELEMENTS = EXTENSIBLE_ELEMENT___GET_EXTENSIBILITY_ELEMENTS;

	/**
	 * The operation id for the '<em>Add Extensibility Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT = EXTENSIBLE_ELEMENT___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT;

	/**
	 * The operation id for the '<em>Get Extension Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES___GET_EXTENSION_ATTRIBUTE__QNAME = EXTENSIBLE_ELEMENT___GET_EXTENSION_ATTRIBUTE__QNAME;

	/**
	 * The operation id for the '<em>Set Extension Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES___SET_EXTENSION_ATTRIBUTE__QNAME_OBJECT = EXTENSIBLE_ELEMENT___SET_EXTENSION_ATTRIBUTE__QNAME_OBJECT;

	/**
	 * The operation id for the '<em>Get Extension Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES___GET_EXTENSION_ATTRIBUTES = EXTENSIBLE_ELEMENT___GET_EXTENSION_ATTRIBUTES;

	/**
	 * The operation id for the '<em>Get Native Attribute Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES___GET_NATIVE_ATTRIBUTE_NAMES = EXTENSIBLE_ELEMENT___GET_NATIVE_ATTRIBUTE_NAMES;

	/**
	 * The operation id for the '<em>Get Schemas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES___GET_SCHEMAS = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Schemas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES___GET_SCHEMAS__STRING = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_OPERATION_COUNT = EXTENSIBLE_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link java.util.Iterator <em>IIterator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Iterator
	 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getIIterator()
	 * @generated
	 */
	int IITERATOR = 42;

	/**
	 * The number of structural features of the '<em>IIterator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IITERATOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>IIterator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IITERATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link javax.wsdl.Types <em>ITypes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.wsdl.Types
	 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getITypes()
	 * @generated
	 */
	int ITYPES = 43;

	/**
	 * The number of structural features of the '<em>ITypes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPES_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>ITypes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tesis.wsdl_ecore.wsdl.impl.UnknownExtensibilityElementImpl <em>Unknown Extensibility Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.wsdl_ecore.wsdl.impl.UnknownExtensibilityElementImpl
	 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getUnknownExtensibilityElement()
	 * @generated
	 */
	int UNKNOWN_EXTENSIBILITY_ELEMENT = 44;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_EXTENSIBILITY_ELEMENT__DOCUMENTATION_ELEMENT = EXTENSIBILITY_ELEMENT__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_EXTENSIBILITY_ELEMENT__ELEMENT = EXTENSIBILITY_ELEMENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_EXTENSIBILITY_ELEMENT__REQUIRED = EXTENSIBILITY_ELEMENT__REQUIRED;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_EXTENSIBILITY_ELEMENT__ELEMENT_TYPE = EXTENSIBILITY_ELEMENT__ELEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_EXTENSIBILITY_ELEMENT__CHILDREN = EXTENSIBILITY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unknown Extensibility Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_EXTENSIBILITY_ELEMENT_FEATURE_COUNT = EXTENSIBILITY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Enclosing Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_EXTENSIBILITY_ELEMENT___GET_ENCLOSING_DEFINITION = EXTENSIBILITY_ELEMENT___GET_ENCLOSING_DEFINITION;

	/**
	 * The operation id for the '<em>Set Enclosing Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_EXTENSIBILITY_ELEMENT___SET_ENCLOSING_DEFINITION__DEFINITION = EXTENSIBILITY_ELEMENT___SET_ENCLOSING_DEFINITION__DEFINITION;

	/**
	 * The number of operations of the '<em>Unknown Extensibility Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_EXTENSIBILITY_ELEMENT_OPERATION_COUNT = EXTENSIBILITY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tesis.wsdl_ecore.wsdl.impl.XSDSchemaExtensibilityElementImpl <em>XSD Schema Extensibility Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.wsdl_ecore.wsdl.impl.XSDSchemaExtensibilityElementImpl
	 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getXSDSchemaExtensibilityElement()
	 * @generated
	 */
	int XSD_SCHEMA_EXTENSIBILITY_ELEMENT = 45;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCHEMA_EXTENSIBILITY_ELEMENT__DOCUMENTATION_ELEMENT = EXTENSIBILITY_ELEMENT__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCHEMA_EXTENSIBILITY_ELEMENT__ELEMENT = EXTENSIBILITY_ELEMENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCHEMA_EXTENSIBILITY_ELEMENT__REQUIRED = EXTENSIBILITY_ELEMENT__REQUIRED;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCHEMA_EXTENSIBILITY_ELEMENT__ELEMENT_TYPE = EXTENSIBILITY_ELEMENT__ELEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Document Base URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCHEMA_EXTENSIBILITY_ELEMENT__DOCUMENT_BASE_URI = EXTENSIBILITY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCHEMA_EXTENSIBILITY_ELEMENT__SCHEMA = EXTENSIBILITY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>XSD Schema Extensibility Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCHEMA_EXTENSIBILITY_ELEMENT_FEATURE_COUNT = EXTENSIBILITY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Enclosing Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCHEMA_EXTENSIBILITY_ELEMENT___GET_ENCLOSING_DEFINITION = EXTENSIBILITY_ELEMENT___GET_ENCLOSING_DEFINITION;

	/**
	 * The operation id for the '<em>Set Enclosing Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCHEMA_EXTENSIBILITY_ELEMENT___SET_ENCLOSING_DEFINITION__DEFINITION = EXTENSIBILITY_ELEMENT___SET_ENCLOSING_DEFINITION__DEFINITION;

	/**
	 * The number of operations of the '<em>XSD Schema Extensibility Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCHEMA_EXTENSIBILITY_ELEMENT_OPERATION_COUNT = EXTENSIBILITY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java.lang.Object <em>IObject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getIObject()
	 * @generated
	 */
	int IOBJECT = 49;

	/**
	 * The number of structural features of the '<em>IObject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOBJECT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>IObject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link javax.wsdl.extensions.schema.Schema <em>ISchema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.wsdl.extensions.schema.Schema
	 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getISchema()
	 * @generated
	 */
	int ISCHEMA = 50;

	/**
	 * The number of structural features of the '<em>ISchema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISCHEMA_FEATURE_COUNT = IEXTENSIBILITY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISchema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISCHEMA_OPERATION_COUNT = IEXTENSIBILITY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>QName</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.namespace.QName
	 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getQName()
	 * @generated
	 */
	int QNAME = 51;

	/**
	 * The meta object id for the '<em>Operation Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.wsdl.OperationType
	 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getOperationType()
	 * @generated
	 */
	int OPERATION_TYPE = 52;

	/**
	 * The meta object id for the '<em>DOM Element</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.dom.Element
	 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getDOMElement()
	 * @generated
	 */
	int DOM_ELEMENT = 53;

	/**
	 * The meta object id for the '<em>WSDL Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.wsdl.WSDLException
	 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getWSDLException()
	 * @generated
	 */
	int WSDL_EXCEPTION = 54;

	/**
	 * The meta object id for the '<em>DOM Document</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.dom.Document
	 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getDOMDocument()
	 * @generated
	 */
	int DOM_DOCUMENT = 55;


	/**
	 * Returns the meta object for class '{@link tesis.wsdl_ecore.wsdl.WSDLElement <em>WSDL Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WSDL Element</em>'.
	 * @see tesis.wsdl_ecore.wsdl.WSDLElement
	 * @generated
	 */
	EClass getWSDLElement();

	/**
	 * Returns the meta object for the attribute '{@link tesis.wsdl_ecore.wsdl.WSDLElement#getDocumentationElement <em>Documentation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation Element</em>'.
	 * @see tesis.wsdl_ecore.wsdl.WSDLElement#getDocumentationElement()
	 * @see #getWSDLElement()
	 * @generated
	 */
	EAttribute getWSDLElement_DocumentationElement();

	/**
	 * Returns the meta object for the attribute '{@link tesis.wsdl_ecore.wsdl.WSDLElement#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element</em>'.
	 * @see tesis.wsdl_ecore.wsdl.WSDLElement#getElement()
	 * @see #getWSDLElement()
	 * @generated
	 */
	EAttribute getWSDLElement_Element();

	/**
	 * Returns the meta object for the '{@link tesis.wsdl_ecore.wsdl.WSDLElement#getEnclosingDefinition() <em>Get Enclosing Definition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Enclosing Definition</em>' operation.
	 * @see tesis.wsdl_ecore.wsdl.WSDLElement#getEnclosingDefinition()
	 * @generated
	 */
	EOperation getWSDLElement__GetEnclosingDefinition();

	/**
	 * Returns the meta object for the '{@link tesis.wsdl_ecore.wsdl.WSDLElement#setEnclosingDefinition(tesis.wsdl_ecore.wsdl.Definition) <em>Set Enclosing Definition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Enclosing Definition</em>' operation.
	 * @see tesis.wsdl_ecore.wsdl.WSDLElement#setEnclosingDefinition(tesis.wsdl_ecore.wsdl.Definition)
	 * @generated
	 */
	EOperation getWSDLElement__SetEnclosingDefinition__Definition();

	/**
	 * Returns the meta object for class '{@link tesis.wsdl_ecore.wsdl.PortType <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Type</em>'.
	 * @see tesis.wsdl_ecore.wsdl.PortType
	 * @generated
	 */
	EClass getPortType();

	/**
	 * Returns the meta object for the attribute '{@link tesis.wsdl_ecore.wsdl.PortType#getQName <em>QName</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>QName</em>'.
	 * @see tesis.wsdl_ecore.wsdl.PortType#getQName()
	 * @see #getPortType()
	 * @generated
	 */
	EAttribute getPortType_QName();

	/**
	 * Returns the meta object for the attribute '{@link tesis.wsdl_ecore.wsdl.PortType#isUndefined <em>Undefined</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Undefined</em>'.
	 * @see tesis.wsdl_ecore.wsdl.PortType#isUndefined()
	 * @see #getPortType()
	 * @generated
	 */
	EAttribute getPortType_Undefined();

	/**
	 * Returns the meta object for the containment reference list '{@link tesis.wsdl_ecore.wsdl.PortType#getEOperations <em>EOperations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EOperations</em>'.
	 * @see tesis.wsdl_ecore.wsdl.PortType#getEOperations()
	 * @see #getPortType()
	 * @generated
	 */
	EReference getPortType_EOperations();

	/**
	 * Returns the meta object for class '{@link tesis.wsdl_ecore.wsdl.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see tesis.wsdl_ecore.wsdl.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link tesis.wsdl_ecore.wsdl.Operation#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see tesis.wsdl_ecore.wsdl.Operation#getStyle()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Style();

	/**
	 * Returns the meta object for the attribute '{@link tesis.wsdl_ecore.wsdl.Operation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tesis.wsdl_ecore.wsdl.Operation#getName()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Name();

	/**
	 * Returns the meta object for the attribute '{@link tesis.wsdl_ecore.wsdl.Operation#isUndefined <em>Undefined</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Undefined</em>'.
	 * @see tesis.wsdl_ecore.wsdl.Operation#isUndefined()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Undefined();

	/**
	 * Returns the meta object for the containment reference '{@link tesis.wsdl_ecore.wsdl.Operation#getEInput <em>EInput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EInput</em>'.
	 * @see tesis.wsdl_ecore.wsdl.Operation#getEInput()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_EInput();

	/**
	 * Returns the meta object for the containment reference '{@link tesis.wsdl_ecore.wsdl.Operation#getEOutput <em>EOutput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EOutput</em>'.
	 * @see tesis.wsdl_ecore.wsdl.Operation#getEOutput()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_EOutput();

	/**
	 * Returns the meta object for the containment reference list '{@link tesis.wsdl_ecore.wsdl.Operation#getEFaults <em>EFaults</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EFaults</em>'.
	 * @see tesis.wsdl_ecore.wsdl.Operation#getEFaults()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_EFaults();

	/**
	 * Returns the meta object for the reference list '{@link tesis.wsdl_ecore.wsdl.Operation#getEParameterOrdering <em>EParameter Ordering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EParameter Ordering</em>'.
	 * @see tesis.wsdl_ecore.wsdl.Operation#getEParameterOrdering()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_EParameterOrdering();

	/**
	 * Returns the meta object for class '{@link tesis.wsdl_ecore.wsdl.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see tesis.wsdl_ecore.wsdl.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the attribute '{@link tesis.wsdl_ecore.wsdl.Message#getQName <em>QName</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>QName</em>'.
	 * @see tesis.wsdl_ecore.wsdl.Message#getQName()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_QName();

	/**
	 * Returns the meta object for the attribute '{@link tesis.wsdl_ecore.wsdl.Message#isUndefined <em>Undefined</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Undefined</em>'.
	 * @see tesis.wsdl_ecore.wsdl.Message#isUndefined()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Undefined();

	/**
	 * Returns the meta object for the containment reference list '{@link tesis.wsdl_ecore.wsdl.Message#getEParts <em>EParts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EParts</em>'.
	 * @see tesis.wsdl_ecore.wsdl.Message#getEParts()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_EParts();

	/**
	 * Returns the meta object for class '{@link tesis.wsdl_ecore.wsdl.Part <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part</em>'.
	 * @see tesis.wsdl_ecore.wsdl.Part
	 * @generated
	 */
	EClass getPart();

	/**
	 * Returns the meta object for the attribute '{@link tesis.wsdl_ecore.wsdl.Part#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tesis.wsdl_ecore.wsdl.Part#getName()
	 * @see #getPart()
	 * @generated
	 */
	EAttribute getPart_Name();

	/**
	 * Returns the meta object for the attribute '{@link tesis.wsdl_ecore.wsdl.Part#getElementName <em>Element Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Name</em>'.
	 * @see tesis.wsdl_ecore.wsdl.Part#getElementName()
	 * @see #getPart()
	 * @generated
	 */
	EAttribute getPart_ElementName();

	/**
	 * Returns the meta object for the attribute '{@link tesis.wsdl_ecore.wsdl.Part#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see tesis.wsdl_ecore.wsdl.Part#getTypeName()
	 * @see #getPart()
	 * @generated
	 */
	EAttribute getPart_TypeName();

	/**
	 * Returns the meta object for the reference '{@link tesis.wsdl_ecore.wsdl.Part#getTypeDefinition <em>Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Definition</em>'.
	 * @see tesis.wsdl_ecore.wsdl.Part#getTypeDefinition()
	 * @see #getPart()
	 * @generated
	 */
	EReference getPart_TypeDefinition();

	/**
	 * Returns the meta object for the reference '{@link tesis.wsdl_ecore.wsdl.Part#getElementDeclaration <em>Element Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element Declaration</em>'.
	 * @see tesis.wsdl_ecore.wsdl.Part#getElementDeclaration()
	 * @see #getPart()
	 * @generated
	 */
	EReference getPart_ElementDeclaration();

	/**
	 * Returns the meta object for the reference '{@link tesis.wsdl_ecore.wsdl.Part#getEMessage <em>EMessage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EMessage</em>'.
	 * @see tesis.wsdl_ecore.wsdl.Part#getEMessage()
	 * @see #getPart()
	 * @generated
	 */
	EReference getPart_EMessage();

	/**
	 * Returns the meta object for class '{@link tesis.wsdl_ecore.wsdl.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding</em>'.
	 * @see tesis.wsdl_ecore.wsdl.Binding
	 * @generated
	 */
	EClass getBinding();

	/**
	 * Returns the meta object for the attribute '{@link tesis.wsdl_ecore.wsdl.Binding#getQName <em>QName</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>QName</em>'.
	 * @see tesis.wsdl_ecore.wsdl.Binding#getQName()
	 * @see #getBinding()
	 * @generated
	 */
	EAttribute getBinding_QName();

	/**
	 * Returns the meta object for the attribute '{@link tesis.wsdl_ecore.wsdl.Binding#isUndefined <em>Undefined</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Undefined</em>'.
	 * @see tesis.wsdl_ecore.wsdl.Binding#isUndefined()
	 * @see #getBinding()
	 * @generated
	 */
	EAttribute getBinding_Undefined();

	/**
	 * Returns the meta object for the reference '{@link tesis.wsdl_ecore.wsdl.Binding#getEPortType <em>EPort Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EPort Type</em>'.
	 * @see tesis.wsdl_ecore.wsdl.Binding#getEPortType()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_EPortType();

	/**
	 * Returns the meta object for the containment reference list '{@link tesis.wsdl_ecore.wsdl.Binding#getEBindingOperations <em>EBinding Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EBinding Operations</em>'.
	 * @see tesis.wsdl_ecore.wsdl.Binding#getEBindingOperations()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_EBindingOperations();

	/**
	 * Returns the meta object for class '{@link tesis.wsdl_ecore.wsdl.BindingOperation <em>Binding Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Operation</em>'.
	 * @see tesis.wsdl_ecore.wsdl.BindingOperation
	 * @generated
	 */
	EClass getBindingOperation();

	/**
	 * Returns the meta object for the attribute '{@link tesis.wsdl_ecore.wsdl.BindingOperation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tesis.wsdl_ecore.wsdl.BindingOperation#getName()
	 * @see #getBindingOperation()
	 * @generated
	 */
	EAttribute getBindingOperation_Name();

	/**
	 * Returns the meta object for the reference '{@link tesis.wsdl_ecore.wsdl.BindingOperation#getEOperation <em>EOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EOperation</em>'.
	 * @see tesis.wsdl_ecore.wsdl.BindingOperation#getEOperation()
	 * @see #getBindingOperation()
	 * @generated
	 */
	EReference getBindingOperation_EOperation();

	/**
	 * Returns the meta object for the containment reference '{@link tesis.wsdl_ecore.wsdl.BindingOperation#getEBindingInput <em>EBinding Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EBinding Input</em>'.
	 * @see tesis.wsdl_ecore.wsdl.BindingOperation#getEBindingInput()
	 * @see #getBindingOperation()
	 * @generated
	 */
	EReference getBindingOperation_EBindingInput();

	/**
	 * Returns the meta object for the containment reference '{@link tesis.wsdl_ecore.wsdl.BindingOperation#getEBindingOutput <em>EBinding Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EBinding Output</em>'.
	 * @see tesis.wsdl_ecore.wsdl.BindingOperation#getEBindingOutput()
	 * @see #getBindingOperation()
	 * @generated
	 */
	EReference getBindingOperation_EBindingOutput();

	/**
	 * Returns the meta object for the containment reference list '{@link tesis.wsdl_ecore.wsdl.BindingOperation#getEBindingFaults <em>EBinding Faults</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EBinding Faults</em>'.
	 * @see tesis.wsdl_ecore.wsdl.BindingOperation#getEBindingFaults()
	 * @see #getBindingOperation()
	 * @generated
	 */
	EReference getBindingOperation_EBindingFaults();

	/**
	 * Returns the meta object for class '{@link tesis.wsdl_ecore.wsdl.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see tesis.wsdl_ecore.wsdl.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the attribute '{@link tesis.wsdl_ecore.wsdl.Service#getQName <em>QName</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>QName</em>'.
	 * @see tesis.wsdl_ecore.wsdl.Service#getQName()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_QName();

	/**
	 * Returns the meta object for the attribute '{@link tesis.wsdl_ecore.wsdl.Service#isUndefined <em>Undefined</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Undefined</em>'.
	 * @see tesis.wsdl_ecore.wsdl.Service#isUndefined()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Undefined();

	/**
	 * Returns the meta object for the containment reference list '{@link tesis.wsdl_ecore.wsdl.Service#getEPorts <em>EPorts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EPorts</em>'.
	 * @see tesis.wsdl_ecore.wsdl.Service#getEPorts()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_EPorts();

	/**
	 * Returns the meta object for class '{@link tesis.wsdl_ecore.wsdl.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see tesis.wsdl_ecore.wsdl.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the attribute '{@link tesis.wsdl_ecore.wsdl.Port#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tesis.wsdl_ecore.wsdl.Port#getName()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Name();

	/**
	 * Returns the meta object for the reference '{@link tesis.wsdl_ecore.wsdl.Port#getEBinding <em>EBinding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EBinding</em>'.
	 * @see tesis.wsdl_ecore.wsdl.Port#getEBinding()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_EBinding();

	/**
	 * Returns the meta object for class '{@link tesis.wsdl_ecore.wsdl.ExtensibilityElement <em>Extensibility Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extensibility Element</em>'.
	 * @see tesis.wsdl_ecore.wsdl.ExtensibilityElement
	 * @generated
	 */
	EClass getExtensibilityElement();

	/**
	 * Returns the meta object for the attribute '{@link tesis.wsdl_ecore.wsdl.ExtensibilityElement#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see tesis.wsdl_ecore.wsdl.ExtensibilityElement#isRequired()
	 * @see #getExtensibilityElement()
	 * @generated
	 */
	EAttribute getExtensibilityElement_Required();

	/**
	 * Returns the meta object for the attribute '{@link tesis.wsdl_ecore.wsdl.ExtensibilityElement#getElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Type</em>'.
	 * @see tesis.wsdl_ecore.wsdl.ExtensibilityElement#getElementType()
	 * @see #getExtensibilityElement()
	 * @generated
	 */
	EAttribute getExtensibilityElement_ElementType();

	/**
	 * Returns the meta object for class '{@link tesis.wsdl_ecore.wsdl.Definition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition</em>'.
	 * @see tesis.wsdl_ecore.wsdl.Definition
	 * @generated
	 */
	EClass getDefinition();

	/**
	 * Returns the meta object for the attribute '{@link tesis.wsdl_ecore.wsdl.Definition#getTargetNamespace <em>Target Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Namespace</em>'.
	 * @see tesis.wsdl_ecore.wsdl.Definition#getTargetNamespace()
	 * @see #getDefinition()
	 * @generated
	 */
	EAttribute getDefinition_TargetNamespace();

	/**
	 * Returns the meta object for the attribute '{@link tesis.wsdl_ecore.wsdl.Definition#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see tesis.wsdl_ecore.wsdl.Definition#getLocation()
	 * @see #getDefinition()
	 * @generated
	 */
	EAttribute getDefinition_Location();

	/**
	 * Returns the meta object for the attribute '{@link tesis.wsdl_ecore.wsdl.Definition#getQName <em>QName</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>QName</em>'.
	 * @see tesis.wsdl_ecore.wsdl.Definition#getQName()
	 * @see #getDefinition()
	 * @generated
	 */
	EAttribute getDefinition_QName();

	/**
	 * Returns the meta object for the attribute '{@link tesis.wsdl_ecore.wsdl.Definition#getEncoding <em>Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encoding</em>'.
	 * @see tesis.wsdl_ecore.wsdl.Definition#getEncoding()
	 * @see #getDefinition()
	 * @generated
	 */
	EAttribute getDefinition_Encoding();

	/**
	 * Returns the meta object for the containment reference list '{@link tesis.wsdl_ecore.wsdl.Definition#getEImports <em>EImports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EImports</em>'.
	 * @see tesis.wsdl_ecore.wsdl.Definition#getEImports()
	 * @see #getDefinition()
	 * @generated
	 */
	EReference getDefinition_EImports();

	/**
	 * Returns the meta object for the containment reference '{@link tesis.wsdl_ecore.wsdl.Definition#getETypes <em>ETypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ETypes</em>'.
	 * @see tesis.wsdl_ecore.wsdl.Definition#getETypes()
	 * @see #getDefinition()
	 * @generated
	 */
	EReference getDefinition_ETypes();

	/**
	 * Returns the meta object for the containment reference list '{@link tesis.wsdl_ecore.wsdl.Definition#getEMessages <em>EMessages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EMessages</em>'.
	 * @see tesis.wsdl_ecore.wsdl.Definition#getEMessages()
	 * @see #getDefinition()
	 * @generated
	 */
	EReference getDefinition_EMessages();

	/**
	 * Returns the meta object for the containment reference list '{@link tesis.wsdl_ecore.wsdl.Definition#getEPortTypes <em>EPort Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EPort Types</em>'.
	 * @see tesis.wsdl_ecore.wsdl.Definition#getEPortTypes()
	 * @see #getDefinition()
	 * @generated
	 */
	EReference getDefinition_EPortTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link tesis.wsdl_ecore.wsdl.Definition#getEBindings <em>EBindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EBindings</em>'.
	 * @see tesis.wsdl_ecore.wsdl.Definition#getEBindings()
	 * @see #getDefinition()
	 * @generated
	 */
	EReference getDefinition_EBindings();

	/**
	 * Returns the meta object for the containment reference list '{@link tesis.wsdl_ecore.wsdl.Definition#getEServices <em>EServices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EServices</em>'.
	 * @see tesis.wsdl_ecore.wsdl.Definition#getEServices()
	 * @see #getDefinition()
	 * @generated
	 */
	EReference getDefinition_EServices();

	/**
	 * Returns the meta object for the containment reference list '{@link tesis.wsdl_ecore.wsdl.Definition#getENamespaces <em>ENamespaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ENamespaces</em>'.
	 * @see tesis.wsdl_ecore.wsdl.Definition#getENamespaces()
	 * @see #getDefinition()
	 * @generated
	 */
	EReference getDefinition_ENamespaces();

	/**
	 * Returns the meta object for the '{@link tesis.wsdl_ecore.wsdl.Definition#getDocument() <em>Get Document</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Document</em>' operation.
	 * @see tesis.wsdl_ecore.wsdl.Definition#getDocument()
	 * @generated
	 */
	EOperation getDefinition__GetDocument();

	/**
	 * Returns the meta object for the '{@link tesis.wsdl_ecore.wsdl.Definition#setDocument(org.w3c.dom.Document) <em>Set Document</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Document</em>' operation.
	 * @see tesis.wsdl_ecore.wsdl.Definition#setDocument(org.w3c.dom.Document)
	 * @generated
	 */
	EOperation getDefinition__SetDocument__Document();

	/**
	 * Returns the meta object for class '{@link tesis.wsdl_ecore.wsdl.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see tesis.wsdl_ecore.wsdl.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the attribute '{@link tesis.wsdl_ecore.wsdl.Import#getNamespaceURI <em>Namespace URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace URI</em>'.
	 * @see tesis.wsdl_ecore.wsdl.Import#getNamespaceURI()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_NamespaceURI();

	/**
	 * Returns the meta object for the attribute '{@link tesis.wsdl_ecore.wsdl.Import#getLocationURI <em>Location URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location URI</em>'.
	 * @see tesis.wsdl_ecore.wsdl.Import#getLocationURI()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_LocationURI();

	/**
	 * Returns the meta object for the reference '{@link tesis.wsdl_ecore.wsdl.Import#getEDefinition <em>EDefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EDefinition</em>'.
	 * @see tesis.wsdl_ecore.wsdl.Import#getEDefinition()
	 * @see #getImport()
	 * @generated
	 */
	EReference getImport_EDefinition();

	/**
	 * Returns the meta object for the reference '{@link tesis.wsdl_ecore.wsdl.Import#getESchema <em>ESchema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>ESchema</em>'.
	 * @see tesis.wsdl_ecore.wsdl.Import#getESchema()
	 * @see #getImport()
	 * @generated
	 */
	EReference getImport_ESchema();

	/**
	 * Returns the meta object for the '{@link tesis.wsdl_ecore.wsdl.Import#getSchema() <em>Get Schema</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Schema</em>' operation.
	 * @see tesis.wsdl_ecore.wsdl.Import#getSchema()
	 * @generated
	 */
	EOperation getImport__GetSchema();

	/**
	 * Returns the meta object for the '{@link tesis.wsdl_ecore.wsdl.Import#setSchema(tesis.xsd_ecore.xsd.XSDSchema) <em>Set Schema</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Schema</em>' operation.
	 * @see tesis.wsdl_ecore.wsdl.Import#setSchema(tesis.xsd_ecore.xsd.XSDSchema)
	 * @generated
	 */
	EOperation getImport__SetSchema__XSDSchema();

	/**
	 * Returns the meta object for class '{@link tesis.wsdl_ecore.wsdl.ExtensibleElement <em>Extensible Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extensible Element</em>'.
	 * @see tesis.wsdl_ecore.wsdl.ExtensibleElement
	 * @generated
	 */
	EClass getExtensibleElement();

	/**
	 * Returns the meta object for the containment reference list '{@link tesis.wsdl_ecore.wsdl.ExtensibleElement#getEExtensibilityElements <em>EExtensibility Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EExtensibility Elements</em>'.
	 * @see tesis.wsdl_ecore.wsdl.ExtensibleElement#getEExtensibilityElements()
	 * @see #getExtensibleElement()
	 * @generated
	 */
	EReference getExtensibleElement_EExtensibilityElements();

	/**
	 * Returns the meta object for class '{@link tesis.wsdl_ecore.wsdl.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see tesis.wsdl_ecore.wsdl.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for class '{@link tesis.wsdl_ecore.wsdl.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output</em>'.
	 * @see tesis.wsdl_ecore.wsdl.Output
	 * @generated
	 */
	EClass getOutput();

	/**
	 * Returns the meta object for class '{@link tesis.wsdl_ecore.wsdl.Fault <em>Fault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fault</em>'.
	 * @see tesis.wsdl_ecore.wsdl.Fault
	 * @generated
	 */
	EClass getFault();

	/**
	 * Returns the meta object for class '{@link tesis.wsdl_ecore.wsdl.BindingInput <em>Binding Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Input</em>'.
	 * @see tesis.wsdl_ecore.wsdl.BindingInput
	 * @generated
	 */
	EClass getBindingInput();

	/**
	 * Returns the meta object for the attribute '{@link tesis.wsdl_ecore.wsdl.BindingInput#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tesis.wsdl_ecore.wsdl.BindingInput#getName()
	 * @see #getBindingInput()
	 * @generated
	 */
	EAttribute getBindingInput_Name();

	/**
	 * Returns the meta object for the reference '{@link tesis.wsdl_ecore.wsdl.BindingInput#getEInput <em>EInput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EInput</em>'.
	 * @see tesis.wsdl_ecore.wsdl.BindingInput#getEInput()
	 * @see #getBindingInput()
	 * @generated
	 */
	EReference getBindingInput_EInput();

	/**
	 * Returns the meta object for the '{@link tesis.wsdl_ecore.wsdl.BindingInput#getInput() <em>Get Input</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Input</em>' operation.
	 * @see tesis.wsdl_ecore.wsdl.BindingInput#getInput()
	 * @generated
	 */
	EOperation getBindingInput__GetInput();

	/**
	 * Returns the meta object for the '{@link tesis.wsdl_ecore.wsdl.BindingInput#setInput(javax.wsdl.Input) <em>Set Input</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Input</em>' operation.
	 * @see tesis.wsdl_ecore.wsdl.BindingInput#setInput(javax.wsdl.Input)
	 * @generated
	 */
	EOperation getBindingInput__SetInput__Input();

	/**
	 * Returns the meta object for class '{@link tesis.wsdl_ecore.wsdl.BindingOutput <em>Binding Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Output</em>'.
	 * @see tesis.wsdl_ecore.wsdl.BindingOutput
	 * @generated
	 */
	EClass getBindingOutput();

	/**
	 * Returns the meta object for the attribute '{@link tesis.wsdl_ecore.wsdl.BindingOutput#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tesis.wsdl_ecore.wsdl.BindingOutput#getName()
	 * @see #getBindingOutput()
	 * @generated
	 */
	EAttribute getBindingOutput_Name();

	/**
	 * Returns the meta object for the reference '{@link tesis.wsdl_ecore.wsdl.BindingOutput#getEOutput <em>EOutput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EOutput</em>'.
	 * @see tesis.wsdl_ecore.wsdl.BindingOutput#getEOutput()
	 * @see #getBindingOutput()
	 * @generated
	 */
	EReference getBindingOutput_EOutput();

	/**
	 * Returns the meta object for the '{@link tesis.wsdl_ecore.wsdl.BindingOutput#getOutput() <em>Get Output</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Output</em>' operation.
	 * @see tesis.wsdl_ecore.wsdl.BindingOutput#getOutput()
	 * @generated
	 */
	EOperation getBindingOutput__GetOutput();

	/**
	 * Returns the meta object for the '{@link tesis.wsdl_ecore.wsdl.BindingOutput#setOutput(javax.wsdl.Output) <em>Set Output</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Output</em>' operation.
	 * @see tesis.wsdl_ecore.wsdl.BindingOutput#setOutput(javax.wsdl.Output)
	 * @generated
	 */
	EOperation getBindingOutput__SetOutput__Output();

	/**
	 * Returns the meta object for class '{@link tesis.wsdl_ecore.wsdl.BindingFault <em>Binding Fault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Fault</em>'.
	 * @see tesis.wsdl_ecore.wsdl.BindingFault
	 * @generated
	 */
	EClass getBindingFault();

	/**
	 * Returns the meta object for the attribute '{@link tesis.wsdl_ecore.wsdl.BindingFault#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tesis.wsdl_ecore.wsdl.BindingFault#getName()
	 * @see #getBindingFault()
	 * @generated
	 */
	EAttribute getBindingFault_Name();

	/**
	 * Returns the meta object for the reference '{@link tesis.wsdl_ecore.wsdl.BindingFault#getEFault <em>EFault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EFault</em>'.
	 * @see tesis.wsdl_ecore.wsdl.BindingFault#getEFault()
	 * @see #getBindingFault()
	 * @generated
	 */
	EReference getBindingFault_EFault();

	/**
	 * Returns the meta object for the '{@link tesis.wsdl_ecore.wsdl.BindingFault#getFault() <em>Get Fault</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Fault</em>' operation.
	 * @see tesis.wsdl_ecore.wsdl.BindingFault#getFault()
	 * @generated
	 */
	EOperation getBindingFault__GetFault();

	/**
	 * Returns the meta object for the '{@link tesis.wsdl_ecore.wsdl.BindingFault#setFault(javax.wsdl.Fault) <em>Set Fault</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Fault</em>' operation.
	 * @see tesis.wsdl_ecore.wsdl.BindingFault#setFault(javax.wsdl.Fault)
	 * @generated
	 */
	EOperation getBindingFault__SetFault__Fault();

	/**
	 * Returns the meta object for class '{@link tesis.wsdl_ecore.wsdl.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Namespace</em>'.
	 * @see tesis.wsdl_ecore.wsdl.Namespace
	 * @generated
	 */
	EClass getNamespace();

	/**
	 * Returns the meta object for the attribute '{@link tesis.wsdl_ecore.wsdl.Namespace#getURI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URI</em>'.
	 * @see tesis.wsdl_ecore.wsdl.Namespace#getURI()
	 * @see #getNamespace()
	 * @generated
	 */
	EAttribute getNamespace_URI();

	/**
	 * Returns the meta object for the attribute '{@link tesis.wsdl_ecore.wsdl.Namespace#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see tesis.wsdl_ecore.wsdl.Namespace#getPrefix()
	 * @see #getNamespace()
	 * @generated
	 */
	EAttribute getNamespace_Prefix();

	/**
	 * Returns the meta object for class '{@link javax.wsdl.PortType <em>IPort Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IPort Type</em>'.
	 * @see javax.wsdl.PortType
	 * @model instanceClass="javax.wsdl.PortType" superTypes="tesis.wsdl_ecore.wsdl.IAttributeExtensible"
	 * @generated
	 */
	EClass getIPortType();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.PortType#addOperation(javax.wsdl.Operation) <em>Add Operation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Operation</em>' operation.
	 * @see javax.wsdl.PortType#addOperation(javax.wsdl.Operation)
	 * @generated
	 */
	EOperation getIPortType__AddOperation__Operation();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.PortType#getOperation(java.lang.String, java.lang.String, java.lang.String) <em>Get Operation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Operation</em>' operation.
	 * @see javax.wsdl.PortType#getOperation(java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIPortType__GetOperation__String_String_String();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.PortType#getOperations() <em>Get Operations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Operations</em>' operation.
	 * @see javax.wsdl.PortType#getOperations()
	 * @generated
	 */
	EOperation getIPortType__GetOperations();

	/**
	 * Returns the meta object for class '{@link javax.wsdl.Operation <em>IOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IOperation</em>'.
	 * @see javax.wsdl.Operation
	 * @model instanceClass="javax.wsdl.Operation" superTypes="tesis.wsdl_ecore.wsdl.IElementExtensible"
	 * @generated
	 */
	EClass getIOperation();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Operation#addFault(javax.wsdl.Fault) <em>Add Fault</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Fault</em>' operation.
	 * @see javax.wsdl.Operation#addFault(javax.wsdl.Fault)
	 * @generated
	 */
	EOperation getIOperation__AddFault__Fault();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Operation#getFault(java.lang.String) <em>Get Fault</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Fault</em>' operation.
	 * @see javax.wsdl.Operation#getFault(java.lang.String)
	 * @generated
	 */
	EOperation getIOperation__GetFault__String();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Operation#getFaults() <em>Get Faults</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Faults</em>' operation.
	 * @see javax.wsdl.Operation#getFaults()
	 * @generated
	 */
	EOperation getIOperation__GetFaults();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Operation#getParameterOrdering() <em>Get Parameter Ordering</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Parameter Ordering</em>' operation.
	 * @see javax.wsdl.Operation#getParameterOrdering()
	 * @generated
	 */
	EOperation getIOperation__GetParameterOrdering();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Operation#setParameterOrdering(java.util.List) <em>Set Parameter Ordering</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Parameter Ordering</em>' operation.
	 * @see javax.wsdl.Operation#setParameterOrdering(java.util.List)
	 * @generated
	 */
	EOperation getIOperation__SetParameterOrdering__List();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Operation#getInput() <em>Get Input</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Input</em>' operation.
	 * @see javax.wsdl.Operation#getInput()
	 * @generated
	 */
	EOperation getIOperation__GetInput();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Operation#setInput(javax.wsdl.Input) <em>Set Input</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Input</em>' operation.
	 * @see javax.wsdl.Operation#setInput(javax.wsdl.Input)
	 * @generated
	 */
	EOperation getIOperation__SetInput__Input();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Operation#getOutput() <em>Get Output</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Output</em>' operation.
	 * @see javax.wsdl.Operation#getOutput()
	 * @generated
	 */
	EOperation getIOperation__GetOutput();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Operation#setOutput(javax.wsdl.Output) <em>Set Output</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Output</em>' operation.
	 * @see javax.wsdl.Operation#setOutput(javax.wsdl.Output)
	 * @generated
	 */
	EOperation getIOperation__SetOutput__Output();

	/**
	 * Returns the meta object for class '{@link javax.wsdl.Input <em>IInput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IInput</em>'.
	 * @see javax.wsdl.Input
	 * @model instanceClass="javax.wsdl.Input" superTypes="tesis.wsdl_ecore.wsdl.IAttributeExtensible"
	 * @generated
	 */
	EClass getIInput();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Input#getMessage() <em>Get Message</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Message</em>' operation.
	 * @see javax.wsdl.Input#getMessage()
	 * @generated
	 */
	EOperation getIInput__GetMessage();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Input#setMessage(javax.wsdl.Message) <em>Set Message</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Message</em>' operation.
	 * @see javax.wsdl.Input#setMessage(javax.wsdl.Message)
	 * @generated
	 */
	EOperation getIInput__SetMessage__Message();

	/**
	 * Returns the meta object for class '{@link javax.wsdl.Output <em>IOutput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IOutput</em>'.
	 * @see javax.wsdl.Output
	 * @model instanceClass="javax.wsdl.Output" superTypes="tesis.wsdl_ecore.wsdl.IAttributeExtensible"
	 * @generated
	 */
	EClass getIOutput();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Output#getMessage() <em>Get Message</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Message</em>' operation.
	 * @see javax.wsdl.Output#getMessage()
	 * @generated
	 */
	EOperation getIOutput__GetMessage();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Output#setMessage(javax.wsdl.Message) <em>Set Message</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Message</em>' operation.
	 * @see javax.wsdl.Output#setMessage(javax.wsdl.Message)
	 * @generated
	 */
	EOperation getIOutput__SetMessage__Message();

	/**
	 * Returns the meta object for class '{@link javax.wsdl.Fault <em>IFault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IFault</em>'.
	 * @see javax.wsdl.Fault
	 * @model instanceClass="javax.wsdl.Fault" superTypes="tesis.wsdl_ecore.wsdl.IAttributeExtensible"
	 * @generated
	 */
	EClass getIFault();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Fault#getMessage() <em>Get Message</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Message</em>' operation.
	 * @see javax.wsdl.Fault#getMessage()
	 * @generated
	 */
	EOperation getIFault__GetMessage();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Fault#setMessage(javax.wsdl.Message) <em>Set Message</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Message</em>' operation.
	 * @see javax.wsdl.Fault#setMessage(javax.wsdl.Message)
	 * @generated
	 */
	EOperation getIFault__SetMessage__Message();

	/**
	 * Returns the meta object for class '{@link javax.wsdl.Message <em>IMessage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IMessage</em>'.
	 * @see javax.wsdl.Message
	 * @model instanceClass="javax.wsdl.Message" superTypes="tesis.wsdl_ecore.wsdl.IElementExtensible"
	 * @generated
	 */
	EClass getIMessage();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Message#addPart(javax.wsdl.Part) <em>Add Part</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Part</em>' operation.
	 * @see javax.wsdl.Message#addPart(javax.wsdl.Part)
	 * @generated
	 */
	EOperation getIMessage__AddPart__Part();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Message#getPart(java.lang.String) <em>Get Part</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Part</em>' operation.
	 * @see javax.wsdl.Message#getPart(java.lang.String)
	 * @generated
	 */
	EOperation getIMessage__GetPart__String();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Message#getParts() <em>Get Parts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Parts</em>' operation.
	 * @see javax.wsdl.Message#getParts()
	 * @generated
	 */
	EOperation getIMessage__GetParts();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Message#getOrderedParts(java.util.List) <em>Get Ordered Parts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Ordered Parts</em>' operation.
	 * @see javax.wsdl.Message#getOrderedParts(java.util.List)
	 * @generated
	 */
	EOperation getIMessage__GetOrderedParts__List();

	/**
	 * Returns the meta object for class '{@link javax.wsdl.Part <em>IPart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IPart</em>'.
	 * @see javax.wsdl.Part
	 * @model instanceClass="javax.wsdl.Part" superTypes="tesis.wsdl_ecore.wsdl.IAttributeExtensible"
	 * @generated
	 */
	EClass getIPart();

	/**
	 * Returns the meta object for class '{@link javax.wsdl.Service <em>IService</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IService</em>'.
	 * @see javax.wsdl.Service
	 * @model instanceClass="javax.wsdl.Service" superTypes="tesis.wsdl_ecore.wsdl.IElementExtensible"
	 * @generated
	 */
	EClass getIService();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Service#addPort(javax.wsdl.Port) <em>Add Port</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Port</em>' operation.
	 * @see javax.wsdl.Service#addPort(javax.wsdl.Port)
	 * @generated
	 */
	EOperation getIService__AddPort__Port();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Service#getPorts() <em>Get Ports</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Ports</em>' operation.
	 * @see javax.wsdl.Service#getPorts()
	 * @generated
	 */
	EOperation getIService__GetPorts();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Service#getPort(java.lang.String) <em>Get Port</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Port</em>' operation.
	 * @see javax.wsdl.Service#getPort(java.lang.String)
	 * @generated
	 */
	EOperation getIService__GetPort__String();

	/**
	 * Returns the meta object for class '{@link javax.wsdl.Port <em>IPort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IPort</em>'.
	 * @see javax.wsdl.Port
	 * @model instanceClass="javax.wsdl.Port" superTypes="tesis.wsdl_ecore.wsdl.IElementExtensible"
	 * @generated
	 */
	EClass getIPort();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Port#getBinding() <em>Get Binding</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Binding</em>' operation.
	 * @see javax.wsdl.Port#getBinding()
	 * @generated
	 */
	EOperation getIPort__GetBinding();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Port#setBinding(javax.wsdl.Binding) <em>Set Binding</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Binding</em>' operation.
	 * @see javax.wsdl.Port#setBinding(javax.wsdl.Binding)
	 * @generated
	 */
	EOperation getIPort__SetBinding__Binding();

	/**
	 * Returns the meta object for class '{@link javax.wsdl.Binding <em>IBinding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBinding</em>'.
	 * @see javax.wsdl.Binding
	 * @model instanceClass="javax.wsdl.Binding" superTypes="tesis.wsdl_ecore.wsdl.IElementExtensible"
	 * @generated
	 */
	EClass getIBinding();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Binding#addBindingOperation(javax.wsdl.BindingOperation) <em>Add Binding Operation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Binding Operation</em>' operation.
	 * @see javax.wsdl.Binding#addBindingOperation(javax.wsdl.BindingOperation)
	 * @generated
	 */
	EOperation getIBinding__AddBindingOperation__BindingOperation();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Binding#getBindingOperation(java.lang.String, java.lang.String, java.lang.String) <em>Get Binding Operation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Binding Operation</em>' operation.
	 * @see javax.wsdl.Binding#getBindingOperation(java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIBinding__GetBindingOperation__String_String_String();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Binding#getBindingOperations() <em>Get Binding Operations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Binding Operations</em>' operation.
	 * @see javax.wsdl.Binding#getBindingOperations()
	 * @generated
	 */
	EOperation getIBinding__GetBindingOperations();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Binding#getPortType() <em>Get Port Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Port Type</em>' operation.
	 * @see javax.wsdl.Binding#getPortType()
	 * @generated
	 */
	EOperation getIBinding__GetPortType();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Binding#setPortType(javax.wsdl.PortType) <em>Set Port Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Port Type</em>' operation.
	 * @see javax.wsdl.Binding#setPortType(javax.wsdl.PortType)
	 * @generated
	 */
	EOperation getIBinding__SetPortType__PortType();

	/**
	 * Returns the meta object for class '{@link javax.wsdl.BindingOperation <em>IBinding Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBinding Operation</em>'.
	 * @see javax.wsdl.BindingOperation
	 * @model instanceClass="javax.wsdl.BindingOperation" superTypes="tesis.wsdl_ecore.wsdl.IElementExtensible"
	 * @generated
	 */
	EClass getIBindingOperation();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.BindingOperation#addBindingFault(javax.wsdl.BindingFault) <em>Add Binding Fault</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Binding Fault</em>' operation.
	 * @see javax.wsdl.BindingOperation#addBindingFault(javax.wsdl.BindingFault)
	 * @generated
	 */
	EOperation getIBindingOperation__AddBindingFault__BindingFault();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.BindingOperation#getBindingFault(java.lang.String) <em>Get Binding Fault</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Binding Fault</em>' operation.
	 * @see javax.wsdl.BindingOperation#getBindingFault(java.lang.String)
	 * @generated
	 */
	EOperation getIBindingOperation__GetBindingFault__String();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.BindingOperation#getBindingFaults() <em>Get Binding Faults</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Binding Faults</em>' operation.
	 * @see javax.wsdl.BindingOperation#getBindingFaults()
	 * @generated
	 */
	EOperation getIBindingOperation__GetBindingFaults();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.BindingOperation#getOperation() <em>Get Operation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Operation</em>' operation.
	 * @see javax.wsdl.BindingOperation#getOperation()
	 * @generated
	 */
	EOperation getIBindingOperation__GetOperation();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.BindingOperation#setOperation(javax.wsdl.Operation) <em>Set Operation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Operation</em>' operation.
	 * @see javax.wsdl.BindingOperation#setOperation(javax.wsdl.Operation)
	 * @generated
	 */
	EOperation getIBindingOperation__SetOperation__Operation();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.BindingOperation#getBindingInput() <em>Get Binding Input</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Binding Input</em>' operation.
	 * @see javax.wsdl.BindingOperation#getBindingInput()
	 * @generated
	 */
	EOperation getIBindingOperation__GetBindingInput();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.BindingOperation#setBindingInput(javax.wsdl.BindingInput) <em>Set Binding Input</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Binding Input</em>' operation.
	 * @see javax.wsdl.BindingOperation#setBindingInput(javax.wsdl.BindingInput)
	 * @generated
	 */
	EOperation getIBindingOperation__SetBindingInput__BindingInput();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.BindingOperation#getBindingOutput() <em>Get Binding Output</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Binding Output</em>' operation.
	 * @see javax.wsdl.BindingOperation#getBindingOutput()
	 * @generated
	 */
	EOperation getIBindingOperation__GetBindingOutput();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.BindingOperation#setBindingOutput(javax.wsdl.BindingOutput) <em>Set Binding Output</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Binding Output</em>' operation.
	 * @see javax.wsdl.BindingOperation#setBindingOutput(javax.wsdl.BindingOutput)
	 * @generated
	 */
	EOperation getIBindingOperation__SetBindingOutput__BindingOutput();

	/**
	 * Returns the meta object for class '{@link javax.wsdl.BindingInput <em>IBinding Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBinding Input</em>'.
	 * @see javax.wsdl.BindingInput
	 * @model instanceClass="javax.wsdl.BindingInput" superTypes="tesis.wsdl_ecore.wsdl.IElementExtensible"
	 * @generated
	 */
	EClass getIBindingInput();

	/**
	 * Returns the meta object for class '{@link javax.wsdl.BindingOutput <em>IBinding Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBinding Output</em>'.
	 * @see javax.wsdl.BindingOutput
	 * @model instanceClass="javax.wsdl.BindingOutput" superTypes="tesis.wsdl_ecore.wsdl.IElementExtensible"
	 * @generated
	 */
	EClass getIBindingOutput();

	/**
	 * Returns the meta object for class '{@link javax.wsdl.BindingFault <em>IBinding Fault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBinding Fault</em>'.
	 * @see javax.wsdl.BindingFault
	 * @model instanceClass="javax.wsdl.BindingFault" superTypes="tesis.wsdl_ecore.wsdl.IElementExtensible"
	 * @generated
	 */
	EClass getIBindingFault();

	/**
	 * Returns the meta object for class '{@link javax.wsdl.extensions.ExtensibilityElement <em>IExtensibility Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IExtensibility Element</em>'.
	 * @see javax.wsdl.extensions.ExtensibilityElement
	 * @model instanceClass="javax.wsdl.extensions.ExtensibilityElement"
	 * @generated
	 */
	EClass getIExtensibilityElement();

	/**
	 * Returns the meta object for class '{@link javax.wsdl.Definition <em>IDefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IDefinition</em>'.
	 * @see javax.wsdl.Definition
	 * @model instanceClass="javax.wsdl.Definition" superTypes="tesis.wsdl_ecore.wsdl.IElementExtensible"
	 * @generated
	 */
	EClass getIDefinition();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Definition#addBinding(javax.wsdl.Binding) <em>Add Binding</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Binding</em>' operation.
	 * @see javax.wsdl.Definition#addBinding(javax.wsdl.Binding)
	 * @generated
	 */
	EOperation getIDefinition__AddBinding__Binding();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Definition#addImport(javax.wsdl.Import) <em>Add Import</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Import</em>' operation.
	 * @see javax.wsdl.Definition#addImport(javax.wsdl.Import)
	 * @generated
	 */
	EOperation getIDefinition__AddImport__Import();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Definition#addMessage(javax.wsdl.Message) <em>Add Message</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Message</em>' operation.
	 * @see javax.wsdl.Definition#addMessage(javax.wsdl.Message)
	 * @generated
	 */
	EOperation getIDefinition__AddMessage__Message();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Definition#addNamespace(java.lang.String, java.lang.String) <em>Add Namespace</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Namespace</em>' operation.
	 * @see javax.wsdl.Definition#addNamespace(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIDefinition__AddNamespace__String_String();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Definition#addPortType(javax.wsdl.PortType) <em>Add Port Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Port Type</em>' operation.
	 * @see javax.wsdl.Definition#addPortType(javax.wsdl.PortType)
	 * @generated
	 */
	EOperation getIDefinition__AddPortType__PortType();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Definition#addService(javax.wsdl.Service) <em>Add Service</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Service</em>' operation.
	 * @see javax.wsdl.Definition#addService(javax.wsdl.Service)
	 * @generated
	 */
	EOperation getIDefinition__AddService__Service();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Definition#createBindingFault() <em>Create Binding Fault</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Binding Fault</em>' operation.
	 * @see javax.wsdl.Definition#createBindingFault()
	 * @generated
	 */
	EOperation getIDefinition__CreateBindingFault();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Definition#createBindingInput() <em>Create Binding Input</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Binding Input</em>' operation.
	 * @see javax.wsdl.Definition#createBindingInput()
	 * @generated
	 */
	EOperation getIDefinition__CreateBindingInput();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Definition#createBindingOutput() <em>Create Binding Output</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Binding Output</em>' operation.
	 * @see javax.wsdl.Definition#createBindingOutput()
	 * @generated
	 */
	EOperation getIDefinition__CreateBindingOutput();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Definition#createBindingOperation() <em>Create Binding Operation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Binding Operation</em>' operation.
	 * @see javax.wsdl.Definition#createBindingOperation()
	 * @generated
	 */
	EOperation getIDefinition__CreateBindingOperation();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Definition#createBinding() <em>Create Binding</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Binding</em>' operation.
	 * @see javax.wsdl.Definition#createBinding()
	 * @generated
	 */
	EOperation getIDefinition__CreateBinding();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Definition#createFault() <em>Create Fault</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Fault</em>' operation.
	 * @see javax.wsdl.Definition#createFault()
	 * @generated
	 */
	EOperation getIDefinition__CreateFault();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Definition#createImport() <em>Create Import</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Import</em>' operation.
	 * @see javax.wsdl.Definition#createImport()
	 * @generated
	 */
	EOperation getIDefinition__CreateImport();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Definition#createInput() <em>Create Input</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Input</em>' operation.
	 * @see javax.wsdl.Definition#createInput()
	 * @generated
	 */
	EOperation getIDefinition__CreateInput();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Definition#createMessage() <em>Create Message</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Message</em>' operation.
	 * @see javax.wsdl.Definition#createMessage()
	 * @generated
	 */
	EOperation getIDefinition__CreateMessage();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Definition#createOperation() <em>Create Operation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Operation</em>' operation.
	 * @see javax.wsdl.Definition#createOperation()
	 * @generated
	 */
	EOperation getIDefinition__CreateOperation();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Definition#createOutput() <em>Create Output</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Output</em>' operation.
	 * @see javax.wsdl.Definition#createOutput()
	 * @generated
	 */
	EOperation getIDefinition__CreateOutput();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Definition#createPart() <em>Create Part</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Part</em>' operation.
	 * @see javax.wsdl.Definition#createPart()
	 * @generated
	 */
	EOperation getIDefinition__CreatePart();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Definition#createPort() <em>Create Port</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Port</em>' operation.
	 * @see javax.wsdl.Definition#createPort()
	 * @generated
	 */
	EOperation getIDefinition__CreatePort();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Definition#createPortType() <em>Create Port Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Port Type</em>' operation.
	 * @see javax.wsdl.Definition#createPortType()
	 * @generated
	 */
	EOperation getIDefinition__CreatePortType();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Definition#createService() <em>Create Service</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Service</em>' operation.
	 * @see javax.wsdl.Definition#createService()
	 * @generated
	 */
	EOperation getIDefinition__CreateService();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Definition#getBinding(javax.xml.namespace.QName) <em>Get Binding</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Binding</em>' operation.
	 * @see javax.wsdl.Definition#getBinding(javax.xml.namespace.QName)
	 * @generated
	 */
	EOperation getIDefinition__GetBinding__QName();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Definition#getBindings() <em>Get Bindings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Bindings</em>' operation.
	 * @see javax.wsdl.Definition#getBindings()
	 * @generated
	 */
	EOperation getIDefinition__GetBindings();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Definition#getImports() <em>Get Imports</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Imports</em>' operation.
	 * @see javax.wsdl.Definition#getImports()
	 * @generated
	 */
	EOperation getIDefinition__GetImports();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Definition#getImports(java.lang.String) <em>Get Imports</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Imports</em>' operation.
	 * @see javax.wsdl.Definition#getImports(java.lang.String)
	 * @generated
	 */
	EOperation getIDefinition__GetImports__String();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Definition#getMessage(javax.xml.namespace.QName) <em>Get Message</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Message</em>' operation.
	 * @see javax.wsdl.Definition#getMessage(javax.xml.namespace.QName)
	 * @generated
	 */
	EOperation getIDefinition__GetMessage__QName();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Definition#getMessages() <em>Get Messages</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Messages</em>' operation.
	 * @see javax.wsdl.Definition#getMessages()
	 * @generated
	 */
	EOperation getIDefinition__GetMessages();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Definition#getNamespace(java.lang.String) <em>Get Namespace</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Namespace</em>' operation.
	 * @see javax.wsdl.Definition#getNamespace(java.lang.String)
	 * @generated
	 */
	EOperation getIDefinition__GetNamespace__String();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Definition#getNamespaces() <em>Get Namespaces</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Namespaces</em>' operation.
	 * @see javax.wsdl.Definition#getNamespaces()
	 * @generated
	 */
	EOperation getIDefinition__GetNamespaces();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Definition#getPortType(javax.xml.namespace.QName) <em>Get Port Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Port Type</em>' operation.
	 * @see javax.wsdl.Definition#getPortType(javax.xml.namespace.QName)
	 * @generated
	 */
	EOperation getIDefinition__GetPortType__QName();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Definition#getPortTypes() <em>Get Port Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Port Types</em>' operation.
	 * @see javax.wsdl.Definition#getPortTypes()
	 * @generated
	 */
	EOperation getIDefinition__GetPortTypes();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Definition#getPrefix(java.lang.String) <em>Get Prefix</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Prefix</em>' operation.
	 * @see javax.wsdl.Definition#getPrefix(java.lang.String)
	 * @generated
	 */
	EOperation getIDefinition__GetPrefix__String();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Definition#getService(javax.xml.namespace.QName) <em>Get Service</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Service</em>' operation.
	 * @see javax.wsdl.Definition#getService(javax.xml.namespace.QName)
	 * @generated
	 */
	EOperation getIDefinition__GetService__QName();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Definition#getServices() <em>Get Services</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Services</em>' operation.
	 * @see javax.wsdl.Definition#getServices()
	 * @generated
	 */
	EOperation getIDefinition__GetServices();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Definition#getExtensionRegistry() <em>Get Extension Registry</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Extension Registry</em>' operation.
	 * @see javax.wsdl.Definition#getExtensionRegistry()
	 * @generated
	 */
	EOperation getIDefinition__GetExtensionRegistry();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Definition#setExtensionRegistry(javax.wsdl.extensions.ExtensionRegistry) <em>Set Extension Registry</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Extension Registry</em>' operation.
	 * @see javax.wsdl.Definition#setExtensionRegistry(javax.wsdl.extensions.ExtensionRegistry)
	 * @generated
	 */
	EOperation getIDefinition__SetExtensionRegistry__ExtensionRegistry();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Definition#getDocumentBaseURI() <em>Get Document Base URI</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Document Base URI</em>' operation.
	 * @see javax.wsdl.Definition#getDocumentBaseURI()
	 * @generated
	 */
	EOperation getIDefinition__GetDocumentBaseURI();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Definition#setDocumentBaseURI(java.lang.String) <em>Set Document Base URI</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Document Base URI</em>' operation.
	 * @see javax.wsdl.Definition#setDocumentBaseURI(java.lang.String)
	 * @generated
	 */
	EOperation getIDefinition__SetDocumentBaseURI__String();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Definition#createTypes() <em>Create Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Types</em>' operation.
	 * @see javax.wsdl.Definition#createTypes()
	 * @generated
	 */
	EOperation getIDefinition__CreateTypes();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Definition#removeService(javax.xml.namespace.QName) <em>Remove Service</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Service</em>' operation.
	 * @see javax.wsdl.Definition#removeService(javax.xml.namespace.QName)
	 * @generated
	 */
	EOperation getIDefinition__RemoveService__QName();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Definition#removeBinding(javax.xml.namespace.QName) <em>Remove Binding</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Binding</em>' operation.
	 * @see javax.wsdl.Definition#removeBinding(javax.xml.namespace.QName)
	 * @generated
	 */
	EOperation getIDefinition__RemoveBinding__QName();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Definition#removePortType(javax.xml.namespace.QName) <em>Remove Port Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Port Type</em>' operation.
	 * @see javax.wsdl.Definition#removePortType(javax.xml.namespace.QName)
	 * @generated
	 */
	EOperation getIDefinition__RemovePortType__QName();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Definition#removeMessage(javax.xml.namespace.QName) <em>Remove Message</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Message</em>' operation.
	 * @see javax.wsdl.Definition#removeMessage(javax.xml.namespace.QName)
	 * @generated
	 */
	EOperation getIDefinition__RemoveMessage__QName();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Definition#getTypes() <em>Get Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Types</em>' operation.
	 * @see javax.wsdl.Definition#getTypes()
	 * @generated
	 */
	EOperation getIDefinition__GetTypes();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Definition#setTypes(javax.wsdl.Types) <em>Set Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Types</em>' operation.
	 * @see javax.wsdl.Definition#setTypes(javax.wsdl.Types)
	 * @generated
	 */
	EOperation getIDefinition__SetTypes__Types();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.Definition#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see javax.wsdl.Definition#toString()
	 * @generated
	 */
	EOperation getIDefinition__ToString();

	/**
	 * Returns the meta object for class '{@link javax.wsdl.Import <em>IImport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IImport</em>'.
	 * @see javax.wsdl.Import
	 * @model instanceClass="javax.wsdl.Import" superTypes="tesis.wsdl_ecore.wsdl.IAttributeExtensible"
	 * @generated
	 */
	EClass getIImport();

	/**
	 * Returns the meta object for class '{@link java.util.List <em>IList</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IList</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 * @generated
	 */
	EClass getIList();

	/**
	 * Returns the meta object for class '{@link java.util.Map <em>IMap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IMap</em>'.
	 * @see java.util.Map
	 * @model instanceClass="java.util.Map"
	 * @generated
	 */
	EClass getIMap();

	/**
	 * Returns the meta object for class '{@link java.net.URL <em>IURL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IURL</em>'.
	 * @see java.net.URL
	 * @model instanceClass="java.net.URL"
	 * @generated
	 */
	EClass getIURL();

	/**
	 * Returns the meta object for class '{@link javax.wsdl.extensions.ExtensionRegistry <em>IExtension Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IExtension Registry</em>'.
	 * @see javax.wsdl.extensions.ExtensionRegistry
	 * @model instanceClass="javax.wsdl.extensions.ExtensionRegistry"
	 * @generated
	 */
	EClass getIExtensionRegistry();

	/**
	 * Returns the meta object for class '{@link tesis.wsdl_ecore.wsdl.Types <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Types</em>'.
	 * @see tesis.wsdl_ecore.wsdl.Types
	 * @generated
	 */
	EClass getTypes();

	/**
	 * Returns the meta object for the '{@link tesis.wsdl_ecore.wsdl.Types#getSchemas() <em>Get Schemas</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Schemas</em>' operation.
	 * @see tesis.wsdl_ecore.wsdl.Types#getSchemas()
	 * @generated
	 */
	EOperation getTypes__GetSchemas();

	/**
	 * Returns the meta object for the '{@link tesis.wsdl_ecore.wsdl.Types#getSchemas(java.lang.String) <em>Get Schemas</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Schemas</em>' operation.
	 * @see tesis.wsdl_ecore.wsdl.Types#getSchemas(java.lang.String)
	 * @generated
	 */
	EOperation getTypes__GetSchemas__String();

	/**
	 * Returns the meta object for class '{@link java.util.Iterator <em>IIterator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IIterator</em>'.
	 * @see java.util.Iterator
	 * @model instanceClass="java.util.Iterator"
	 * @generated
	 */
	EClass getIIterator();

	/**
	 * Returns the meta object for class '{@link javax.wsdl.Types <em>ITypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ITypes</em>'.
	 * @see javax.wsdl.Types
	 * @model instanceClass="javax.wsdl.Types"
	 * @generated
	 */
	EClass getITypes();

	/**
	 * Returns the meta object for class '{@link tesis.wsdl_ecore.wsdl.UnknownExtensibilityElement <em>Unknown Extensibility Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unknown Extensibility Element</em>'.
	 * @see tesis.wsdl_ecore.wsdl.UnknownExtensibilityElement
	 * @generated
	 */
	EClass getUnknownExtensibilityElement();

	/**
	 * Returns the meta object for the containment reference list '{@link tesis.wsdl_ecore.wsdl.UnknownExtensibilityElement#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see tesis.wsdl_ecore.wsdl.UnknownExtensibilityElement#getChildren()
	 * @see #getUnknownExtensibilityElement()
	 * @generated
	 */
	EReference getUnknownExtensibilityElement_Children();

	/**
	 * Returns the meta object for class '{@link tesis.wsdl_ecore.wsdl.XSDSchemaExtensibilityElement <em>XSD Schema Extensibility Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSD Schema Extensibility Element</em>'.
	 * @see tesis.wsdl_ecore.wsdl.XSDSchemaExtensibilityElement
	 * @generated
	 */
	EClass getXSDSchemaExtensibilityElement();

	/**
	 * Returns the meta object for the attribute '{@link tesis.wsdl_ecore.wsdl.XSDSchemaExtensibilityElement#getDocumentBaseURI <em>Document Base URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Document Base URI</em>'.
	 * @see tesis.wsdl_ecore.wsdl.XSDSchemaExtensibilityElement#getDocumentBaseURI()
	 * @see #getXSDSchemaExtensibilityElement()
	 * @generated
	 */
	EAttribute getXSDSchemaExtensibilityElement_DocumentBaseURI();

	/**
	 * Returns the meta object for the containment reference '{@link tesis.wsdl_ecore.wsdl.XSDSchemaExtensibilityElement#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schema</em>'.
	 * @see tesis.wsdl_ecore.wsdl.XSDSchemaExtensibilityElement#getSchema()
	 * @see #getXSDSchemaExtensibilityElement()
	 * @generated
	 */
	EReference getXSDSchemaExtensibilityElement_Schema();

	/**
	 * Returns the meta object for class '{@link tesis.wsdl_ecore.wsdl.MessageReference <em>Message Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Reference</em>'.
	 * @see tesis.wsdl_ecore.wsdl.MessageReference
	 * @generated
	 */
	EClass getMessageReference();

	/**
	 * Returns the meta object for the attribute '{@link tesis.wsdl_ecore.wsdl.MessageReference#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tesis.wsdl_ecore.wsdl.MessageReference#getName()
	 * @see #getMessageReference()
	 * @generated
	 */
	EAttribute getMessageReference_Name();

	/**
	 * Returns the meta object for the reference '{@link tesis.wsdl_ecore.wsdl.MessageReference#getEMessage <em>EMessage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EMessage</em>'.
	 * @see tesis.wsdl_ecore.wsdl.MessageReference#getEMessage()
	 * @see #getMessageReference()
	 * @generated
	 */
	EReference getMessageReference_EMessage();

	/**
	 * Returns the meta object for class '{@link javax.wsdl.extensions.ElementExtensible <em>IElement Extensible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IElement Extensible</em>'.
	 * @see javax.wsdl.extensions.ElementExtensible
	 * @model instanceClass="javax.wsdl.extensions.ElementExtensible"
	 * @generated
	 */
	EClass getIElementExtensible();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.extensions.ElementExtensible#getExtensibilityElements() <em>Get Extensibility Elements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Extensibility Elements</em>' operation.
	 * @see javax.wsdl.extensions.ElementExtensible#getExtensibilityElements()
	 * @generated
	 */
	EOperation getIElementExtensible__GetExtensibilityElements();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.extensions.ElementExtensible#addExtensibilityElement(javax.wsdl.extensions.ExtensibilityElement) <em>Add Extensibility Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Extensibility Element</em>' operation.
	 * @see javax.wsdl.extensions.ElementExtensible#addExtensibilityElement(javax.wsdl.extensions.ExtensibilityElement)
	 * @generated
	 */
	EOperation getIElementExtensible__AddExtensibilityElement__ExtensibilityElement();

	/**
	 * Returns the meta object for class '{@link javax.wsdl.extensions.AttributeExtensible <em>IAttribute Extensible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IAttribute Extensible</em>'.
	 * @see javax.wsdl.extensions.AttributeExtensible
	 * @model instanceClass="javax.wsdl.extensions.AttributeExtensible"
	 * @generated
	 */
	EClass getIAttributeExtensible();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.extensions.AttributeExtensible#getExtensionAttribute(javax.xml.namespace.QName) <em>Get Extension Attribute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Extension Attribute</em>' operation.
	 * @see javax.wsdl.extensions.AttributeExtensible#getExtensionAttribute(javax.xml.namespace.QName)
	 * @generated
	 */
	EOperation getIAttributeExtensible__GetExtensionAttribute__QName();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.extensions.AttributeExtensible#setExtensionAttribute(javax.xml.namespace.QName, java.lang.Object) <em>Set Extension Attribute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Extension Attribute</em>' operation.
	 * @see javax.wsdl.extensions.AttributeExtensible#setExtensionAttribute(javax.xml.namespace.QName, java.lang.Object)
	 * @generated
	 */
	EOperation getIAttributeExtensible__SetExtensionAttribute__QName_Object();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.extensions.AttributeExtensible#getExtensionAttributes() <em>Get Extension Attributes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Extension Attributes</em>' operation.
	 * @see javax.wsdl.extensions.AttributeExtensible#getExtensionAttributes()
	 * @generated
	 */
	EOperation getIAttributeExtensible__GetExtensionAttributes();

	/**
	 * Returns the meta object for the '{@link javax.wsdl.extensions.AttributeExtensible#getNativeAttributeNames() <em>Get Native Attribute Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Native Attribute Names</em>' operation.
	 * @see javax.wsdl.extensions.AttributeExtensible#getNativeAttributeNames()
	 * @generated
	 */
	EOperation getIAttributeExtensible__GetNativeAttributeNames();

	/**
	 * Returns the meta object for class '{@link java.lang.Object <em>IObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IObject</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EClass getIObject();

	/**
	 * Returns the meta object for class '{@link javax.wsdl.extensions.schema.Schema <em>ISchema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISchema</em>'.
	 * @see javax.wsdl.extensions.schema.Schema
	 * @model instanceClass="javax.wsdl.extensions.schema.Schema" superTypes="tesis.wsdl_ecore.wsdl.IExtensibilityElement"
	 * @generated
	 */
	EClass getISchema();

	/**
	 * Returns the meta object for data type '{@link javax.xml.namespace.QName <em>QName</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>QName</em>'.
	 * @see javax.xml.namespace.QName
	 * @model instanceClass="javax.xml.namespace.QName"
	 * @generated
	 */
	EDataType getQName();

	/**
	 * Returns the meta object for data type '{@link javax.wsdl.OperationType <em>Operation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Operation Type</em>'.
	 * @see javax.wsdl.OperationType
	 * @model instanceClass="javax.wsdl.OperationType"
	 * @generated
	 */
	EDataType getOperationType();

	/**
	 * Returns the meta object for data type '{@link org.w3c.dom.Element <em>DOM Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>DOM Element</em>'.
	 * @see org.w3c.dom.Element
	 * @model instanceClass="org.w3c.dom.Element"
	 * @generated
	 */
	EDataType getDOMElement();

	/**
	 * Returns the meta object for data type '{@link javax.wsdl.WSDLException <em>WSDL Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>WSDL Exception</em>'.
	 * @see javax.wsdl.WSDLException
	 * @model instanceClass="javax.wsdl.WSDLException"
	 * @generated
	 */
	EDataType getWSDLException();

	/**
	 * Returns the meta object for data type '{@link org.w3c.dom.Document <em>DOM Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>DOM Document</em>'.
	 * @see org.w3c.dom.Document
	 * @model instanceClass="org.w3c.dom.Document"
	 * @generated
	 */
	EDataType getDOMDocument();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WsdlFactory getWsdlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link tesis.wsdl_ecore.wsdl.impl.WSDLElementImpl <em>WSDL Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.wsdl_ecore.wsdl.impl.WSDLElementImpl
		 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getWSDLElement()
		 * @generated
		 */
		EClass WSDL_ELEMENT = eINSTANCE.getWSDLElement();

		/**
		 * The meta object literal for the '<em><b>Documentation Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WSDL_ELEMENT__DOCUMENTATION_ELEMENT = eINSTANCE.getWSDLElement_DocumentationElement();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WSDL_ELEMENT__ELEMENT = eINSTANCE.getWSDLElement_Element();

		/**
		 * The meta object literal for the '<em><b>Get Enclosing Definition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WSDL_ELEMENT___GET_ENCLOSING_DEFINITION = eINSTANCE.getWSDLElement__GetEnclosingDefinition();

		/**
		 * The meta object literal for the '<em><b>Set Enclosing Definition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WSDL_ELEMENT___SET_ENCLOSING_DEFINITION__DEFINITION = eINSTANCE.getWSDLElement__SetEnclosingDefinition__Definition();

		/**
		 * The meta object literal for the '{@link tesis.wsdl_ecore.wsdl.impl.PortTypeImpl <em>Port Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.wsdl_ecore.wsdl.impl.PortTypeImpl
		 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getPortType()
		 * @generated
		 */
		EClass PORT_TYPE = eINSTANCE.getPortType();

		/**
		 * The meta object literal for the '<em><b>QName</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_TYPE__QNAME = eINSTANCE.getPortType_QName();

		/**
		 * The meta object literal for the '<em><b>Undefined</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_TYPE__UNDEFINED = eINSTANCE.getPortType_Undefined();

		/**
		 * The meta object literal for the '<em><b>EOperations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_TYPE__EOPERATIONS = eINSTANCE.getPortType_EOperations();

		/**
		 * The meta object literal for the '{@link tesis.wsdl_ecore.wsdl.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.wsdl_ecore.wsdl.impl.OperationImpl
		 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__STYLE = eINSTANCE.getOperation_Style();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__NAME = eINSTANCE.getOperation_Name();

		/**
		 * The meta object literal for the '<em><b>Undefined</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__UNDEFINED = eINSTANCE.getOperation_Undefined();

		/**
		 * The meta object literal for the '<em><b>EInput</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__EINPUT = eINSTANCE.getOperation_EInput();

		/**
		 * The meta object literal for the '<em><b>EOutput</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__EOUTPUT = eINSTANCE.getOperation_EOutput();

		/**
		 * The meta object literal for the '<em><b>EFaults</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__EFAULTS = eINSTANCE.getOperation_EFaults();

		/**
		 * The meta object literal for the '<em><b>EParameter Ordering</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__EPARAMETER_ORDERING = eINSTANCE.getOperation_EParameterOrdering();

		/**
		 * The meta object literal for the '{@link tesis.wsdl_ecore.wsdl.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.wsdl_ecore.wsdl.impl.MessageImpl
		 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>QName</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__QNAME = eINSTANCE.getMessage_QName();

		/**
		 * The meta object literal for the '<em><b>Undefined</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__UNDEFINED = eINSTANCE.getMessage_Undefined();

		/**
		 * The meta object literal for the '<em><b>EParts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__EPARTS = eINSTANCE.getMessage_EParts();

		/**
		 * The meta object literal for the '{@link tesis.wsdl_ecore.wsdl.impl.PartImpl <em>Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.wsdl_ecore.wsdl.impl.PartImpl
		 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getPart()
		 * @generated
		 */
		EClass PART = eINSTANCE.getPart();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PART__NAME = eINSTANCE.getPart_Name();

		/**
		 * The meta object literal for the '<em><b>Element Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PART__ELEMENT_NAME = eINSTANCE.getPart_ElementName();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PART__TYPE_NAME = eINSTANCE.getPart_TypeName();

		/**
		 * The meta object literal for the '<em><b>Type Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PART__TYPE_DEFINITION = eINSTANCE.getPart_TypeDefinition();

		/**
		 * The meta object literal for the '<em><b>Element Declaration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PART__ELEMENT_DECLARATION = eINSTANCE.getPart_ElementDeclaration();

		/**
		 * The meta object literal for the '<em><b>EMessage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PART__EMESSAGE = eINSTANCE.getPart_EMessage();

		/**
		 * The meta object literal for the '{@link tesis.wsdl_ecore.wsdl.impl.BindingImpl <em>Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.wsdl_ecore.wsdl.impl.BindingImpl
		 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getBinding()
		 * @generated
		 */
		EClass BINDING = eINSTANCE.getBinding();

		/**
		 * The meta object literal for the '<em><b>QName</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING__QNAME = eINSTANCE.getBinding_QName();

		/**
		 * The meta object literal for the '<em><b>Undefined</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING__UNDEFINED = eINSTANCE.getBinding_Undefined();

		/**
		 * The meta object literal for the '<em><b>EPort Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING__EPORT_TYPE = eINSTANCE.getBinding_EPortType();

		/**
		 * The meta object literal for the '<em><b>EBinding Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING__EBINDING_OPERATIONS = eINSTANCE.getBinding_EBindingOperations();

		/**
		 * The meta object literal for the '{@link tesis.wsdl_ecore.wsdl.impl.BindingOperationImpl <em>Binding Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.wsdl_ecore.wsdl.impl.BindingOperationImpl
		 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getBindingOperation()
		 * @generated
		 */
		EClass BINDING_OPERATION = eINSTANCE.getBindingOperation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING_OPERATION__NAME = eINSTANCE.getBindingOperation_Name();

		/**
		 * The meta object literal for the '<em><b>EOperation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_OPERATION__EOPERATION = eINSTANCE.getBindingOperation_EOperation();

		/**
		 * The meta object literal for the '<em><b>EBinding Input</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_OPERATION__EBINDING_INPUT = eINSTANCE.getBindingOperation_EBindingInput();

		/**
		 * The meta object literal for the '<em><b>EBinding Output</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_OPERATION__EBINDING_OUTPUT = eINSTANCE.getBindingOperation_EBindingOutput();

		/**
		 * The meta object literal for the '<em><b>EBinding Faults</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_OPERATION__EBINDING_FAULTS = eINSTANCE.getBindingOperation_EBindingFaults();

		/**
		 * The meta object literal for the '{@link tesis.wsdl_ecore.wsdl.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.wsdl_ecore.wsdl.impl.ServiceImpl
		 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>QName</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__QNAME = eINSTANCE.getService_QName();

		/**
		 * The meta object literal for the '<em><b>Undefined</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__UNDEFINED = eINSTANCE.getService_Undefined();

		/**
		 * The meta object literal for the '<em><b>EPorts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__EPORTS = eINSTANCE.getService_EPorts();

		/**
		 * The meta object literal for the '{@link tesis.wsdl_ecore.wsdl.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.wsdl_ecore.wsdl.impl.PortImpl
		 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__NAME = eINSTANCE.getPort_Name();

		/**
		 * The meta object literal for the '<em><b>EBinding</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__EBINDING = eINSTANCE.getPort_EBinding();

		/**
		 * The meta object literal for the '{@link tesis.wsdl_ecore.wsdl.impl.ExtensibilityElementImpl <em>Extensibility Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.wsdl_ecore.wsdl.impl.ExtensibilityElementImpl
		 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getExtensibilityElement()
		 * @generated
		 */
		EClass EXTENSIBILITY_ELEMENT = eINSTANCE.getExtensibilityElement();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSIBILITY_ELEMENT__REQUIRED = eINSTANCE.getExtensibilityElement_Required();

		/**
		 * The meta object literal for the '<em><b>Element Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSIBILITY_ELEMENT__ELEMENT_TYPE = eINSTANCE.getExtensibilityElement_ElementType();

		/**
		 * The meta object literal for the '{@link tesis.wsdl_ecore.wsdl.impl.DefinitionImpl <em>Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.wsdl_ecore.wsdl.impl.DefinitionImpl
		 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getDefinition()
		 * @generated
		 */
		EClass DEFINITION = eINSTANCE.getDefinition();

		/**
		 * The meta object literal for the '<em><b>Target Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFINITION__TARGET_NAMESPACE = eINSTANCE.getDefinition_TargetNamespace();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFINITION__LOCATION = eINSTANCE.getDefinition_Location();

		/**
		 * The meta object literal for the '<em><b>QName</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFINITION__QNAME = eINSTANCE.getDefinition_QName();

		/**
		 * The meta object literal for the '<em><b>Encoding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFINITION__ENCODING = eINSTANCE.getDefinition_Encoding();

		/**
		 * The meta object literal for the '<em><b>EImports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITION__EIMPORTS = eINSTANCE.getDefinition_EImports();

		/**
		 * The meta object literal for the '<em><b>ETypes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITION__ETYPES = eINSTANCE.getDefinition_ETypes();

		/**
		 * The meta object literal for the '<em><b>EMessages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITION__EMESSAGES = eINSTANCE.getDefinition_EMessages();

		/**
		 * The meta object literal for the '<em><b>EPort Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITION__EPORT_TYPES = eINSTANCE.getDefinition_EPortTypes();

		/**
		 * The meta object literal for the '<em><b>EBindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITION__EBINDINGS = eINSTANCE.getDefinition_EBindings();

		/**
		 * The meta object literal for the '<em><b>EServices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITION__ESERVICES = eINSTANCE.getDefinition_EServices();

		/**
		 * The meta object literal for the '<em><b>ENamespaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITION__ENAMESPACES = eINSTANCE.getDefinition_ENamespaces();

		/**
		 * The meta object literal for the '<em><b>Get Document</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEFINITION___GET_DOCUMENT = eINSTANCE.getDefinition__GetDocument();

		/**
		 * The meta object literal for the '<em><b>Set Document</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEFINITION___SET_DOCUMENT__DOCUMENT = eINSTANCE.getDefinition__SetDocument__Document();

		/**
		 * The meta object literal for the '{@link tesis.wsdl_ecore.wsdl.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.wsdl_ecore.wsdl.impl.ImportImpl
		 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getImport()
		 * @generated
		 */
		EClass IMPORT = eINSTANCE.getImport();

		/**
		 * The meta object literal for the '<em><b>Namespace URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__NAMESPACE_URI = eINSTANCE.getImport_NamespaceURI();

		/**
		 * The meta object literal for the '<em><b>Location URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__LOCATION_URI = eINSTANCE.getImport_LocationURI();

		/**
		 * The meta object literal for the '<em><b>EDefinition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORT__EDEFINITION = eINSTANCE.getImport_EDefinition();

		/**
		 * The meta object literal for the '<em><b>ESchema</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORT__ESCHEMA = eINSTANCE.getImport_ESchema();

		/**
		 * The meta object literal for the '<em><b>Get Schema</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMPORT___GET_SCHEMA = eINSTANCE.getImport__GetSchema();

		/**
		 * The meta object literal for the '<em><b>Set Schema</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMPORT___SET_SCHEMA__XSDSCHEMA = eINSTANCE.getImport__SetSchema__XSDSchema();

		/**
		 * The meta object literal for the '{@link tesis.wsdl_ecore.wsdl.impl.ExtensibleElementImpl <em>Extensible Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.wsdl_ecore.wsdl.impl.ExtensibleElementImpl
		 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getExtensibleElement()
		 * @generated
		 */
		EClass EXTENSIBLE_ELEMENT = eINSTANCE.getExtensibleElement();

		/**
		 * The meta object literal for the '<em><b>EExtensibility Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSIBLE_ELEMENT__EEXTENSIBILITY_ELEMENTS = eINSTANCE.getExtensibleElement_EExtensibilityElements();

		/**
		 * The meta object literal for the '{@link tesis.wsdl_ecore.wsdl.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.wsdl_ecore.wsdl.impl.InputImpl
		 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '{@link tesis.wsdl_ecore.wsdl.impl.OutputImpl <em>Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.wsdl_ecore.wsdl.impl.OutputImpl
		 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getOutput()
		 * @generated
		 */
		EClass OUTPUT = eINSTANCE.getOutput();

		/**
		 * The meta object literal for the '{@link tesis.wsdl_ecore.wsdl.impl.FaultImpl <em>Fault</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.wsdl_ecore.wsdl.impl.FaultImpl
		 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getFault()
		 * @generated
		 */
		EClass FAULT = eINSTANCE.getFault();

		/**
		 * The meta object literal for the '{@link tesis.wsdl_ecore.wsdl.impl.BindingInputImpl <em>Binding Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.wsdl_ecore.wsdl.impl.BindingInputImpl
		 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getBindingInput()
		 * @generated
		 */
		EClass BINDING_INPUT = eINSTANCE.getBindingInput();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING_INPUT__NAME = eINSTANCE.getBindingInput_Name();

		/**
		 * The meta object literal for the '<em><b>EInput</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_INPUT__EINPUT = eINSTANCE.getBindingInput_EInput();

		/**
		 * The meta object literal for the '<em><b>Get Input</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BINDING_INPUT___GET_INPUT = eINSTANCE.getBindingInput__GetInput();

		/**
		 * The meta object literal for the '<em><b>Set Input</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BINDING_INPUT___SET_INPUT__INPUT = eINSTANCE.getBindingInput__SetInput__Input();

		/**
		 * The meta object literal for the '{@link tesis.wsdl_ecore.wsdl.impl.BindingOutputImpl <em>Binding Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.wsdl_ecore.wsdl.impl.BindingOutputImpl
		 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getBindingOutput()
		 * @generated
		 */
		EClass BINDING_OUTPUT = eINSTANCE.getBindingOutput();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING_OUTPUT__NAME = eINSTANCE.getBindingOutput_Name();

		/**
		 * The meta object literal for the '<em><b>EOutput</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_OUTPUT__EOUTPUT = eINSTANCE.getBindingOutput_EOutput();

		/**
		 * The meta object literal for the '<em><b>Get Output</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BINDING_OUTPUT___GET_OUTPUT = eINSTANCE.getBindingOutput__GetOutput();

		/**
		 * The meta object literal for the '<em><b>Set Output</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BINDING_OUTPUT___SET_OUTPUT__OUTPUT = eINSTANCE.getBindingOutput__SetOutput__Output();

		/**
		 * The meta object literal for the '{@link tesis.wsdl_ecore.wsdl.impl.BindingFaultImpl <em>Binding Fault</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.wsdl_ecore.wsdl.impl.BindingFaultImpl
		 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getBindingFault()
		 * @generated
		 */
		EClass BINDING_FAULT = eINSTANCE.getBindingFault();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING_FAULT__NAME = eINSTANCE.getBindingFault_Name();

		/**
		 * The meta object literal for the '<em><b>EFault</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_FAULT__EFAULT = eINSTANCE.getBindingFault_EFault();

		/**
		 * The meta object literal for the '<em><b>Get Fault</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BINDING_FAULT___GET_FAULT = eINSTANCE.getBindingFault__GetFault();

		/**
		 * The meta object literal for the '<em><b>Set Fault</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BINDING_FAULT___SET_FAULT__FAULT = eINSTANCE.getBindingFault__SetFault__Fault();

		/**
		 * The meta object literal for the '{@link tesis.wsdl_ecore.wsdl.impl.NamespaceImpl <em>Namespace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.wsdl_ecore.wsdl.impl.NamespaceImpl
		 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getNamespace()
		 * @generated
		 */
		EClass NAMESPACE = eINSTANCE.getNamespace();

		/**
		 * The meta object literal for the '<em><b>URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMESPACE__URI = eINSTANCE.getNamespace_URI();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMESPACE__PREFIX = eINSTANCE.getNamespace_Prefix();

		/**
		 * The meta object literal for the '{@link javax.wsdl.PortType <em>IPort Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.wsdl.PortType
		 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getIPortType()
		 * @generated
		 */
		EClass IPORT_TYPE = eINSTANCE.getIPortType();

		/**
		 * The meta object literal for the '<em><b>Add Operation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPORT_TYPE___ADD_OPERATION__OPERATION = eINSTANCE.getIPortType__AddOperation__Operation();

		/**
		 * The meta object literal for the '<em><b>Get Operation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPORT_TYPE___GET_OPERATION__STRING_STRING_STRING = eINSTANCE.getIPortType__GetOperation__String_String_String();

		/**
		 * The meta object literal for the '<em><b>Get Operations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPORT_TYPE___GET_OPERATIONS = eINSTANCE.getIPortType__GetOperations();

		/**
		 * The meta object literal for the '{@link javax.wsdl.Operation <em>IOperation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.wsdl.Operation
		 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getIOperation()
		 * @generated
		 */
		EClass IOPERATION = eINSTANCE.getIOperation();

		/**
		 * The meta object literal for the '<em><b>Add Fault</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IOPERATION___ADD_FAULT__FAULT = eINSTANCE.getIOperation__AddFault__Fault();

		/**
		 * The meta object literal for the '<em><b>Get Fault</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IOPERATION___GET_FAULT__STRING = eINSTANCE.getIOperation__GetFault__String();

		/**
		 * The meta object literal for the '<em><b>Get Faults</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IOPERATION___GET_FAULTS = eINSTANCE.getIOperation__GetFaults();

		/**
		 * The meta object literal for the '<em><b>Get Parameter Ordering</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IOPERATION___GET_PARAMETER_ORDERING = eINSTANCE.getIOperation__GetParameterOrdering();

		/**
		 * The meta object literal for the '<em><b>Set Parameter Ordering</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IOPERATION___SET_PARAMETER_ORDERING__LIST = eINSTANCE.getIOperation__SetParameterOrdering__List();

		/**
		 * The meta object literal for the '<em><b>Get Input</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IOPERATION___GET_INPUT = eINSTANCE.getIOperation__GetInput();

		/**
		 * The meta object literal for the '<em><b>Set Input</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IOPERATION___SET_INPUT__INPUT = eINSTANCE.getIOperation__SetInput__Input();

		/**
		 * The meta object literal for the '<em><b>Get Output</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IOPERATION___GET_OUTPUT = eINSTANCE.getIOperation__GetOutput();

		/**
		 * The meta object literal for the '<em><b>Set Output</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IOPERATION___SET_OUTPUT__OUTPUT = eINSTANCE.getIOperation__SetOutput__Output();

		/**
		 * The meta object literal for the '{@link javax.wsdl.Input <em>IInput</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.wsdl.Input
		 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getIInput()
		 * @generated
		 */
		EClass IINPUT = eINSTANCE.getIInput();

		/**
		 * The meta object literal for the '<em><b>Get Message</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IINPUT___GET_MESSAGE = eINSTANCE.getIInput__GetMessage();

		/**
		 * The meta object literal for the '<em><b>Set Message</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IINPUT___SET_MESSAGE__MESSAGE = eINSTANCE.getIInput__SetMessage__Message();

		/**
		 * The meta object literal for the '{@link javax.wsdl.Output <em>IOutput</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.wsdl.Output
		 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getIOutput()
		 * @generated
		 */
		EClass IOUTPUT = eINSTANCE.getIOutput();

		/**
		 * The meta object literal for the '<em><b>Get Message</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IOUTPUT___GET_MESSAGE = eINSTANCE.getIOutput__GetMessage();

		/**
		 * The meta object literal for the '<em><b>Set Message</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IOUTPUT___SET_MESSAGE__MESSAGE = eINSTANCE.getIOutput__SetMessage__Message();

		/**
		 * The meta object literal for the '{@link javax.wsdl.Fault <em>IFault</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.wsdl.Fault
		 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getIFault()
		 * @generated
		 */
		EClass IFAULT = eINSTANCE.getIFault();

		/**
		 * The meta object literal for the '<em><b>Get Message</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IFAULT___GET_MESSAGE = eINSTANCE.getIFault__GetMessage();

		/**
		 * The meta object literal for the '<em><b>Set Message</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IFAULT___SET_MESSAGE__MESSAGE = eINSTANCE.getIFault__SetMessage__Message();

		/**
		 * The meta object literal for the '{@link javax.wsdl.Message <em>IMessage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.wsdl.Message
		 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getIMessage()
		 * @generated
		 */
		EClass IMESSAGE = eINSTANCE.getIMessage();

		/**
		 * The meta object literal for the '<em><b>Add Part</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMESSAGE___ADD_PART__PART = eINSTANCE.getIMessage__AddPart__Part();

		/**
		 * The meta object literal for the '<em><b>Get Part</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMESSAGE___GET_PART__STRING = eINSTANCE.getIMessage__GetPart__String();

		/**
		 * The meta object literal for the '<em><b>Get Parts</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMESSAGE___GET_PARTS = eINSTANCE.getIMessage__GetParts();

		/**
		 * The meta object literal for the '<em><b>Get Ordered Parts</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMESSAGE___GET_ORDERED_PARTS__LIST = eINSTANCE.getIMessage__GetOrderedParts__List();

		/**
		 * The meta object literal for the '{@link javax.wsdl.Part <em>IPart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.wsdl.Part
		 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getIPart()
		 * @generated
		 */
		EClass IPART = eINSTANCE.getIPart();

		/**
		 * The meta object literal for the '{@link javax.wsdl.Service <em>IService</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.wsdl.Service
		 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getIService()
		 * @generated
		 */
		EClass ISERVICE = eINSTANCE.getIService();

		/**
		 * The meta object literal for the '<em><b>Add Port</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISERVICE___ADD_PORT__PORT = eINSTANCE.getIService__AddPort__Port();

		/**
		 * The meta object literal for the '<em><b>Get Ports</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISERVICE___GET_PORTS = eINSTANCE.getIService__GetPorts();

		/**
		 * The meta object literal for the '<em><b>Get Port</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISERVICE___GET_PORT__STRING = eINSTANCE.getIService__GetPort__String();

		/**
		 * The meta object literal for the '{@link javax.wsdl.Port <em>IPort</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.wsdl.Port
		 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getIPort()
		 * @generated
		 */
		EClass IPORT = eINSTANCE.getIPort();

		/**
		 * The meta object literal for the '<em><b>Get Binding</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPORT___GET_BINDING = eINSTANCE.getIPort__GetBinding();

		/**
		 * The meta object literal for the '<em><b>Set Binding</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPORT___SET_BINDING__BINDING = eINSTANCE.getIPort__SetBinding__Binding();

		/**
		 * The meta object literal for the '{@link javax.wsdl.Binding <em>IBinding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.wsdl.Binding
		 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getIBinding()
		 * @generated
		 */
		EClass IBINDING = eINSTANCE.getIBinding();

		/**
		 * The meta object literal for the '<em><b>Add Binding Operation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBINDING___ADD_BINDING_OPERATION__BINDINGOPERATION = eINSTANCE.getIBinding__AddBindingOperation__BindingOperation();

		/**
		 * The meta object literal for the '<em><b>Get Binding Operation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBINDING___GET_BINDING_OPERATION__STRING_STRING_STRING = eINSTANCE.getIBinding__GetBindingOperation__String_String_String();

		/**
		 * The meta object literal for the '<em><b>Get Binding Operations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBINDING___GET_BINDING_OPERATIONS = eINSTANCE.getIBinding__GetBindingOperations();

		/**
		 * The meta object literal for the '<em><b>Get Port Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBINDING___GET_PORT_TYPE = eINSTANCE.getIBinding__GetPortType();

		/**
		 * The meta object literal for the '<em><b>Set Port Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBINDING___SET_PORT_TYPE__PORTTYPE = eINSTANCE.getIBinding__SetPortType__PortType();

		/**
		 * The meta object literal for the '{@link javax.wsdl.BindingOperation <em>IBinding Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.wsdl.BindingOperation
		 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getIBindingOperation()
		 * @generated
		 */
		EClass IBINDING_OPERATION = eINSTANCE.getIBindingOperation();

		/**
		 * The meta object literal for the '<em><b>Add Binding Fault</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBINDING_OPERATION___ADD_BINDING_FAULT__BINDINGFAULT = eINSTANCE.getIBindingOperation__AddBindingFault__BindingFault();

		/**
		 * The meta object literal for the '<em><b>Get Binding Fault</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBINDING_OPERATION___GET_BINDING_FAULT__STRING = eINSTANCE.getIBindingOperation__GetBindingFault__String();

		/**
		 * The meta object literal for the '<em><b>Get Binding Faults</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBINDING_OPERATION___GET_BINDING_FAULTS = eINSTANCE.getIBindingOperation__GetBindingFaults();

		/**
		 * The meta object literal for the '<em><b>Get Operation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBINDING_OPERATION___GET_OPERATION = eINSTANCE.getIBindingOperation__GetOperation();

		/**
		 * The meta object literal for the '<em><b>Set Operation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBINDING_OPERATION___SET_OPERATION__OPERATION = eINSTANCE.getIBindingOperation__SetOperation__Operation();

		/**
		 * The meta object literal for the '<em><b>Get Binding Input</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBINDING_OPERATION___GET_BINDING_INPUT = eINSTANCE.getIBindingOperation__GetBindingInput();

		/**
		 * The meta object literal for the '<em><b>Set Binding Input</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBINDING_OPERATION___SET_BINDING_INPUT__BINDINGINPUT = eINSTANCE.getIBindingOperation__SetBindingInput__BindingInput();

		/**
		 * The meta object literal for the '<em><b>Get Binding Output</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBINDING_OPERATION___GET_BINDING_OUTPUT = eINSTANCE.getIBindingOperation__GetBindingOutput();

		/**
		 * The meta object literal for the '<em><b>Set Binding Output</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBINDING_OPERATION___SET_BINDING_OUTPUT__BINDINGOUTPUT = eINSTANCE.getIBindingOperation__SetBindingOutput__BindingOutput();

		/**
		 * The meta object literal for the '{@link javax.wsdl.BindingInput <em>IBinding Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.wsdl.BindingInput
		 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getIBindingInput()
		 * @generated
		 */
		EClass IBINDING_INPUT = eINSTANCE.getIBindingInput();

		/**
		 * The meta object literal for the '{@link javax.wsdl.BindingOutput <em>IBinding Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.wsdl.BindingOutput
		 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getIBindingOutput()
		 * @generated
		 */
		EClass IBINDING_OUTPUT = eINSTANCE.getIBindingOutput();

		/**
		 * The meta object literal for the '{@link javax.wsdl.BindingFault <em>IBinding Fault</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.wsdl.BindingFault
		 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getIBindingFault()
		 * @generated
		 */
		EClass IBINDING_FAULT = eINSTANCE.getIBindingFault();

		/**
		 * The meta object literal for the '{@link javax.wsdl.extensions.ExtensibilityElement <em>IExtensibility Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.wsdl.extensions.ExtensibilityElement
		 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getIExtensibilityElement()
		 * @generated
		 */
		EClass IEXTENSIBILITY_ELEMENT = eINSTANCE.getIExtensibilityElement();

		/**
		 * The meta object literal for the '{@link javax.wsdl.Definition <em>IDefinition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.wsdl.Definition
		 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getIDefinition()
		 * @generated
		 */
		EClass IDEFINITION = eINSTANCE.getIDefinition();

		/**
		 * The meta object literal for the '<em><b>Add Binding</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IDEFINITION___ADD_BINDING__BINDING = eINSTANCE.getIDefinition__AddBinding__Binding();

		/**
		 * The meta object literal for the '<em><b>Add Import</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IDEFINITION___ADD_IMPORT__IMPORT = eINSTANCE.getIDefinition__AddImport__Import();

		/**
		 * The meta object literal for the '<em><b>Add Message</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IDEFINITION___ADD_MESSAGE__MESSAGE = eINSTANCE.getIDefinition__AddMessage__Message();

		/**
		 * The meta object literal for the '<em><b>Add Namespace</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IDEFINITION___ADD_NAMESPACE__STRING_STRING = eINSTANCE.getIDefinition__AddNamespace__String_String();

		/**
		 * The meta object literal for the '<em><b>Add Port Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IDEFINITION___ADD_PORT_TYPE__PORTTYPE = eINSTANCE.getIDefinition__AddPortType__PortType();

		/**
		 * The meta object literal for the '<em><b>Add Service</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IDEFINITION___ADD_SERVICE__SERVICE = eINSTANCE.getIDefinition__AddService__Service();

		/**
		 * The meta object literal for the '<em><b>Create Binding Fault</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IDEFINITION___CREATE_BINDING_FAULT = eINSTANCE.getIDefinition__CreateBindingFault();

		/**
		 * The meta object literal for the '<em><b>Create Binding Input</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IDEFINITION___CREATE_BINDING_INPUT = eINSTANCE.getIDefinition__CreateBindingInput();

		/**
		 * The meta object literal for the '<em><b>Create Binding Output</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IDEFINITION___CREATE_BINDING_OUTPUT = eINSTANCE.getIDefinition__CreateBindingOutput();

		/**
		 * The meta object literal for the '<em><b>Create Binding Operation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IDEFINITION___CREATE_BINDING_OPERATION = eINSTANCE.getIDefinition__CreateBindingOperation();

		/**
		 * The meta object literal for the '<em><b>Create Binding</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IDEFINITION___CREATE_BINDING = eINSTANCE.getIDefinition__CreateBinding();

		/**
		 * The meta object literal for the '<em><b>Create Fault</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IDEFINITION___CREATE_FAULT = eINSTANCE.getIDefinition__CreateFault();

		/**
		 * The meta object literal for the '<em><b>Create Import</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IDEFINITION___CREATE_IMPORT = eINSTANCE.getIDefinition__CreateImport();

		/**
		 * The meta object literal for the '<em><b>Create Input</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IDEFINITION___CREATE_INPUT = eINSTANCE.getIDefinition__CreateInput();

		/**
		 * The meta object literal for the '<em><b>Create Message</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IDEFINITION___CREATE_MESSAGE = eINSTANCE.getIDefinition__CreateMessage();

		/**
		 * The meta object literal for the '<em><b>Create Operation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IDEFINITION___CREATE_OPERATION = eINSTANCE.getIDefinition__CreateOperation();

		/**
		 * The meta object literal for the '<em><b>Create Output</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IDEFINITION___CREATE_OUTPUT = eINSTANCE.getIDefinition__CreateOutput();

		/**
		 * The meta object literal for the '<em><b>Create Part</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IDEFINITION___CREATE_PART = eINSTANCE.getIDefinition__CreatePart();

		/**
		 * The meta object literal for the '<em><b>Create Port</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IDEFINITION___CREATE_PORT = eINSTANCE.getIDefinition__CreatePort();

		/**
		 * The meta object literal for the '<em><b>Create Port Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IDEFINITION___CREATE_PORT_TYPE = eINSTANCE.getIDefinition__CreatePortType();

		/**
		 * The meta object literal for the '<em><b>Create Service</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IDEFINITION___CREATE_SERVICE = eINSTANCE.getIDefinition__CreateService();

		/**
		 * The meta object literal for the '<em><b>Get Binding</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IDEFINITION___GET_BINDING__QNAME = eINSTANCE.getIDefinition__GetBinding__QName();

		/**
		 * The meta object literal for the '<em><b>Get Bindings</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IDEFINITION___GET_BINDINGS = eINSTANCE.getIDefinition__GetBindings();

		/**
		 * The meta object literal for the '<em><b>Get Imports</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IDEFINITION___GET_IMPORTS = eINSTANCE.getIDefinition__GetImports();

		/**
		 * The meta object literal for the '<em><b>Get Imports</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IDEFINITION___GET_IMPORTS__STRING = eINSTANCE.getIDefinition__GetImports__String();

		/**
		 * The meta object literal for the '<em><b>Get Message</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IDEFINITION___GET_MESSAGE__QNAME = eINSTANCE.getIDefinition__GetMessage__QName();

		/**
		 * The meta object literal for the '<em><b>Get Messages</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IDEFINITION___GET_MESSAGES = eINSTANCE.getIDefinition__GetMessages();

		/**
		 * The meta object literal for the '<em><b>Get Namespace</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IDEFINITION___GET_NAMESPACE__STRING = eINSTANCE.getIDefinition__GetNamespace__String();

		/**
		 * The meta object literal for the '<em><b>Get Namespaces</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IDEFINITION___GET_NAMESPACES = eINSTANCE.getIDefinition__GetNamespaces();

		/**
		 * The meta object literal for the '<em><b>Get Port Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IDEFINITION___GET_PORT_TYPE__QNAME = eINSTANCE.getIDefinition__GetPortType__QName();

		/**
		 * The meta object literal for the '<em><b>Get Port Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IDEFINITION___GET_PORT_TYPES = eINSTANCE.getIDefinition__GetPortTypes();

		/**
		 * The meta object literal for the '<em><b>Get Prefix</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IDEFINITION___GET_PREFIX__STRING = eINSTANCE.getIDefinition__GetPrefix__String();

		/**
		 * The meta object literal for the '<em><b>Get Service</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IDEFINITION___GET_SERVICE__QNAME = eINSTANCE.getIDefinition__GetService__QName();

		/**
		 * The meta object literal for the '<em><b>Get Services</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IDEFINITION___GET_SERVICES = eINSTANCE.getIDefinition__GetServices();

		/**
		 * The meta object literal for the '<em><b>Get Extension Registry</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IDEFINITION___GET_EXTENSION_REGISTRY = eINSTANCE.getIDefinition__GetExtensionRegistry();

		/**
		 * The meta object literal for the '<em><b>Set Extension Registry</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IDEFINITION___SET_EXTENSION_REGISTRY__EXTENSIONREGISTRY = eINSTANCE.getIDefinition__SetExtensionRegistry__ExtensionRegistry();

		/**
		 * The meta object literal for the '<em><b>Get Document Base URI</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IDEFINITION___GET_DOCUMENT_BASE_URI = eINSTANCE.getIDefinition__GetDocumentBaseURI();

		/**
		 * The meta object literal for the '<em><b>Set Document Base URI</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IDEFINITION___SET_DOCUMENT_BASE_URI__STRING = eINSTANCE.getIDefinition__SetDocumentBaseURI__String();

		/**
		 * The meta object literal for the '<em><b>Create Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IDEFINITION___CREATE_TYPES = eINSTANCE.getIDefinition__CreateTypes();

		/**
		 * The meta object literal for the '<em><b>Remove Service</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IDEFINITION___REMOVE_SERVICE__QNAME = eINSTANCE.getIDefinition__RemoveService__QName();

		/**
		 * The meta object literal for the '<em><b>Remove Binding</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IDEFINITION___REMOVE_BINDING__QNAME = eINSTANCE.getIDefinition__RemoveBinding__QName();

		/**
		 * The meta object literal for the '<em><b>Remove Port Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IDEFINITION___REMOVE_PORT_TYPE__QNAME = eINSTANCE.getIDefinition__RemovePortType__QName();

		/**
		 * The meta object literal for the '<em><b>Remove Message</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IDEFINITION___REMOVE_MESSAGE__QNAME = eINSTANCE.getIDefinition__RemoveMessage__QName();

		/**
		 * The meta object literal for the '<em><b>Get Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IDEFINITION___GET_TYPES = eINSTANCE.getIDefinition__GetTypes();

		/**
		 * The meta object literal for the '<em><b>Set Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IDEFINITION___SET_TYPES__TYPES = eINSTANCE.getIDefinition__SetTypes__Types();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IDEFINITION___TO_STRING = eINSTANCE.getIDefinition__ToString();

		/**
		 * The meta object literal for the '{@link javax.wsdl.Import <em>IImport</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.wsdl.Import
		 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getIImport()
		 * @generated
		 */
		EClass IIMPORT = eINSTANCE.getIImport();

		/**
		 * The meta object literal for the '{@link java.util.List <em>IList</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getIList()
		 * @generated
		 */
		EClass ILIST = eINSTANCE.getIList();

		/**
		 * The meta object literal for the '{@link java.util.Map <em>IMap</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Map
		 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getIMap()
		 * @generated
		 */
		EClass IMAP = eINSTANCE.getIMap();

		/**
		 * The meta object literal for the '{@link java.net.URL <em>IURL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.net.URL
		 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getIURL()
		 * @generated
		 */
		EClass IURL = eINSTANCE.getIURL();

		/**
		 * The meta object literal for the '{@link javax.wsdl.extensions.ExtensionRegistry <em>IExtension Registry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.wsdl.extensions.ExtensionRegistry
		 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getIExtensionRegistry()
		 * @generated
		 */
		EClass IEXTENSION_REGISTRY = eINSTANCE.getIExtensionRegistry();

		/**
		 * The meta object literal for the '{@link tesis.wsdl_ecore.wsdl.impl.TypesImpl <em>Types</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.wsdl_ecore.wsdl.impl.TypesImpl
		 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getTypes()
		 * @generated
		 */
		EClass TYPES = eINSTANCE.getTypes();

		/**
		 * The meta object literal for the '<em><b>Get Schemas</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TYPES___GET_SCHEMAS = eINSTANCE.getTypes__GetSchemas();

		/**
		 * The meta object literal for the '<em><b>Get Schemas</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TYPES___GET_SCHEMAS__STRING = eINSTANCE.getTypes__GetSchemas__String();

		/**
		 * The meta object literal for the '{@link java.util.Iterator <em>IIterator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Iterator
		 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getIIterator()
		 * @generated
		 */
		EClass IITERATOR = eINSTANCE.getIIterator();

		/**
		 * The meta object literal for the '{@link javax.wsdl.Types <em>ITypes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.wsdl.Types
		 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getITypes()
		 * @generated
		 */
		EClass ITYPES = eINSTANCE.getITypes();

		/**
		 * The meta object literal for the '{@link tesis.wsdl_ecore.wsdl.impl.UnknownExtensibilityElementImpl <em>Unknown Extensibility Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.wsdl_ecore.wsdl.impl.UnknownExtensibilityElementImpl
		 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getUnknownExtensibilityElement()
		 * @generated
		 */
		EClass UNKNOWN_EXTENSIBILITY_ELEMENT = eINSTANCE.getUnknownExtensibilityElement();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNKNOWN_EXTENSIBILITY_ELEMENT__CHILDREN = eINSTANCE.getUnknownExtensibilityElement_Children();

		/**
		 * The meta object literal for the '{@link tesis.wsdl_ecore.wsdl.impl.XSDSchemaExtensibilityElementImpl <em>XSD Schema Extensibility Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.wsdl_ecore.wsdl.impl.XSDSchemaExtensibilityElementImpl
		 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getXSDSchemaExtensibilityElement()
		 * @generated
		 */
		EClass XSD_SCHEMA_EXTENSIBILITY_ELEMENT = eINSTANCE.getXSDSchemaExtensibilityElement();

		/**
		 * The meta object literal for the '<em><b>Document Base URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_SCHEMA_EXTENSIBILITY_ELEMENT__DOCUMENT_BASE_URI = eINSTANCE.getXSDSchemaExtensibilityElement_DocumentBaseURI();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_SCHEMA_EXTENSIBILITY_ELEMENT__SCHEMA = eINSTANCE.getXSDSchemaExtensibilityElement_Schema();

		/**
		 * The meta object literal for the '{@link tesis.wsdl_ecore.wsdl.impl.MessageReferenceImpl <em>Message Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.wsdl_ecore.wsdl.impl.MessageReferenceImpl
		 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getMessageReference()
		 * @generated
		 */
		EClass MESSAGE_REFERENCE = eINSTANCE.getMessageReference();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_REFERENCE__NAME = eINSTANCE.getMessageReference_Name();

		/**
		 * The meta object literal for the '<em><b>EMessage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_REFERENCE__EMESSAGE = eINSTANCE.getMessageReference_EMessage();

		/**
		 * The meta object literal for the '{@link javax.wsdl.extensions.ElementExtensible <em>IElement Extensible</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.wsdl.extensions.ElementExtensible
		 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getIElementExtensible()
		 * @generated
		 */
		EClass IELEMENT_EXTENSIBLE = eINSTANCE.getIElementExtensible();

		/**
		 * The meta object literal for the '<em><b>Get Extensibility Elements</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IELEMENT_EXTENSIBLE___GET_EXTENSIBILITY_ELEMENTS = eINSTANCE.getIElementExtensible__GetExtensibilityElements();

		/**
		 * The meta object literal for the '<em><b>Add Extensibility Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IELEMENT_EXTENSIBLE___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT = eINSTANCE.getIElementExtensible__AddExtensibilityElement__ExtensibilityElement();

		/**
		 * The meta object literal for the '{@link javax.wsdl.extensions.AttributeExtensible <em>IAttribute Extensible</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.wsdl.extensions.AttributeExtensible
		 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getIAttributeExtensible()
		 * @generated
		 */
		EClass IATTRIBUTE_EXTENSIBLE = eINSTANCE.getIAttributeExtensible();

		/**
		 * The meta object literal for the '<em><b>Get Extension Attribute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IATTRIBUTE_EXTENSIBLE___GET_EXTENSION_ATTRIBUTE__QNAME = eINSTANCE.getIAttributeExtensible__GetExtensionAttribute__QName();

		/**
		 * The meta object literal for the '<em><b>Set Extension Attribute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IATTRIBUTE_EXTENSIBLE___SET_EXTENSION_ATTRIBUTE__QNAME_OBJECT = eINSTANCE.getIAttributeExtensible__SetExtensionAttribute__QName_Object();

		/**
		 * The meta object literal for the '<em><b>Get Extension Attributes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IATTRIBUTE_EXTENSIBLE___GET_EXTENSION_ATTRIBUTES = eINSTANCE.getIAttributeExtensible__GetExtensionAttributes();

		/**
		 * The meta object literal for the '<em><b>Get Native Attribute Names</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IATTRIBUTE_EXTENSIBLE___GET_NATIVE_ATTRIBUTE_NAMES = eINSTANCE.getIAttributeExtensible__GetNativeAttributeNames();

		/**
		 * The meta object literal for the '{@link java.lang.Object <em>IObject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getIObject()
		 * @generated
		 */
		EClass IOBJECT = eINSTANCE.getIObject();

		/**
		 * The meta object literal for the '{@link javax.wsdl.extensions.schema.Schema <em>ISchema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.wsdl.extensions.schema.Schema
		 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getISchema()
		 * @generated
		 */
		EClass ISCHEMA = eINSTANCE.getISchema();

		/**
		 * The meta object literal for the '<em>QName</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.xml.namespace.QName
		 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getQName()
		 * @generated
		 */
		EDataType QNAME = eINSTANCE.getQName();

		/**
		 * The meta object literal for the '<em>Operation Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.wsdl.OperationType
		 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getOperationType()
		 * @generated
		 */
		EDataType OPERATION_TYPE = eINSTANCE.getOperationType();

		/**
		 * The meta object literal for the '<em>DOM Element</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.dom.Element
		 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getDOMElement()
		 * @generated
		 */
		EDataType DOM_ELEMENT = eINSTANCE.getDOMElement();

		/**
		 * The meta object literal for the '<em>WSDL Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.wsdl.WSDLException
		 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getWSDLException()
		 * @generated
		 */
		EDataType WSDL_EXCEPTION = eINSTANCE.getWSDLException();

		/**
		 * The meta object literal for the '<em>DOM Document</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.dom.Document
		 * @see tesis.wsdl_ecore.wsdl.impl.WsdlPackageImpl#getDOMDocument()
		 * @generated
		 */
		EDataType DOM_DOCUMENT = eINSTANCE.getDOMDocument();

	}

} //WsdlPackage
