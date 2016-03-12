/**
 */
package tesis.xsd_ecore.xsd;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see tesis.xsd_ecore.xsd.XsdFactory
 * @model kind="package"
 * @generated
 */
public interface XsdPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "xsd";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/xsd/2002/XSD";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "xsd";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XsdPackage eINSTANCE = tesis.xsd_ecore.xsd.impl.XsdPackageImpl.init();

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.impl.XSDConcreteComponentImpl <em>XSD Concrete Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.impl.XSDConcreteComponentImpl
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDConcreteComponent()
	 * @generated
	 */
	int XSD_CONCRETE_COMPONENT = 10;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_CONCRETE_COMPONENT__ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_CONCRETE_COMPONENT__CONTAINER = 1;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_CONCRETE_COMPONENT__ROOT_CONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_CONCRETE_COMPONENT__SCHEMA = 3;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_CONCRETE_COMPONENT__DIAGNOSTICS = 4;

	/**
	 * The number of structural features of the '<em>XSD Concrete Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_CONCRETE_COMPONENT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>XSD Concrete Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_CONCRETE_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.impl.XSDComponentImpl <em>XSD Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.impl.XSDComponentImpl
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDComponent()
	 * @generated
	 */
	int XSD_COMPONENT = 9;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_COMPONENT__ELEMENT = XSD_CONCRETE_COMPONENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_COMPONENT__CONTAINER = XSD_CONCRETE_COMPONENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_COMPONENT__ROOT_CONTAINER = XSD_CONCRETE_COMPONENT__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_COMPONENT__SCHEMA = XSD_CONCRETE_COMPONENT__SCHEMA;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_COMPONENT__DIAGNOSTICS = XSD_CONCRETE_COMPONENT__DIAGNOSTICS;

	/**
	 * The number of structural features of the '<em>XSD Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_COMPONENT_FEATURE_COUNT = XSD_CONCRETE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>XSD Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_COMPONENT_OPERATION_COUNT = XSD_CONCRETE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.impl.XSDAnnotationImpl <em>XSD Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.impl.XSDAnnotationImpl
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDAnnotation()
	 * @generated
	 */
	int XSD_ANNOTATION = 0;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ANNOTATION__ELEMENT = XSD_COMPONENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ANNOTATION__CONTAINER = XSD_COMPONENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ANNOTATION__ROOT_CONTAINER = XSD_COMPONENT__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ANNOTATION__SCHEMA = XSD_COMPONENT__SCHEMA;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ANNOTATION__DIAGNOSTICS = XSD_COMPONENT__DIAGNOSTICS;

	/**
	 * The feature id for the '<em><b>Application Information</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ANNOTATION__APPLICATION_INFORMATION = XSD_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>User Information</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ANNOTATION__USER_INFORMATION = XSD_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ANNOTATION__ATTRIBUTES = XSD_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>XSD Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ANNOTATION_FEATURE_COUNT = XSD_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>XSD Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ANNOTATION_OPERATION_COUNT = XSD_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.impl.XSDNamedComponentImpl <em>XSD Named Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.impl.XSDNamedComponentImpl
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDNamedComponent()
	 * @generated
	 */
	int XSD_NAMED_COMPONENT = 34;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_NAMED_COMPONENT__ELEMENT = XSD_COMPONENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_NAMED_COMPONENT__CONTAINER = XSD_COMPONENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_NAMED_COMPONENT__ROOT_CONTAINER = XSD_COMPONENT__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_NAMED_COMPONENT__SCHEMA = XSD_COMPONENT__SCHEMA;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_NAMED_COMPONENT__DIAGNOSTICS = XSD_COMPONENT__DIAGNOSTICS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_NAMED_COMPONENT__NAME = XSD_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_NAMED_COMPONENT__TARGET_NAMESPACE = XSD_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_NAMED_COMPONENT__ALIAS_NAME = XSD_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_NAMED_COMPONENT__URI = XSD_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Alias URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_NAMED_COMPONENT__ALIAS_URI = XSD_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>QName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_NAMED_COMPONENT__QNAME = XSD_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>XSD Named Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_NAMED_COMPONENT_FEATURE_COUNT = XSD_COMPONENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>XSD Named Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_NAMED_COMPONENT_OPERATION_COUNT = XSD_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.impl.XSDFeatureImpl <em>XSD Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.impl.XSDFeatureImpl
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDFeature()
	 * @generated
	 */
	int XSD_FEATURE = 16;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FEATURE__ELEMENT = XSD_NAMED_COMPONENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FEATURE__CONTAINER = XSD_NAMED_COMPONENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FEATURE__ROOT_CONTAINER = XSD_NAMED_COMPONENT__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FEATURE__SCHEMA = XSD_NAMED_COMPONENT__SCHEMA;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FEATURE__DIAGNOSTICS = XSD_NAMED_COMPONENT__DIAGNOSTICS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FEATURE__NAME = XSD_NAMED_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FEATURE__TARGET_NAMESPACE = XSD_NAMED_COMPONENT__TARGET_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FEATURE__ALIAS_NAME = XSD_NAMED_COMPONENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FEATURE__URI = XSD_NAMED_COMPONENT__URI;

	/**
	 * The feature id for the '<em><b>Alias URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FEATURE__ALIAS_URI = XSD_NAMED_COMPONENT__ALIAS_URI;

	/**
	 * The feature id for the '<em><b>QName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FEATURE__QNAME = XSD_NAMED_COMPONENT__QNAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FEATURE__VALUE = XSD_NAMED_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FEATURE__CONSTRAINT = XSD_NAMED_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FEATURE__FORM = XSD_NAMED_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lexical Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FEATURE__LEXICAL_VALUE = XSD_NAMED_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Global</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FEATURE__GLOBAL = XSD_NAMED_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Feature Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FEATURE__FEATURE_REFERENCE = XSD_NAMED_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FEATURE__SCOPE = XSD_NAMED_COMPONENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Resolved Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FEATURE__RESOLVED_FEATURE = XSD_NAMED_COMPONENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FEATURE__TYPE = XSD_NAMED_COMPONENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>XSD Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FEATURE_FEATURE_COUNT = XSD_NAMED_COMPONENT_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>XSD Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FEATURE_OPERATION_COUNT = XSD_NAMED_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.impl.XSDAttributeDeclarationImpl <em>XSD Attribute Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.impl.XSDAttributeDeclarationImpl
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDAttributeDeclaration()
	 * @generated
	 */
	int XSD_ATTRIBUTE_DECLARATION = 1;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ATTRIBUTE_DECLARATION__ELEMENT = XSD_FEATURE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ATTRIBUTE_DECLARATION__CONTAINER = XSD_FEATURE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ATTRIBUTE_DECLARATION__ROOT_CONTAINER = XSD_FEATURE__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ATTRIBUTE_DECLARATION__SCHEMA = XSD_FEATURE__SCHEMA;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ATTRIBUTE_DECLARATION__DIAGNOSTICS = XSD_FEATURE__DIAGNOSTICS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ATTRIBUTE_DECLARATION__NAME = XSD_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ATTRIBUTE_DECLARATION__TARGET_NAMESPACE = XSD_FEATURE__TARGET_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ATTRIBUTE_DECLARATION__ALIAS_NAME = XSD_FEATURE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ATTRIBUTE_DECLARATION__URI = XSD_FEATURE__URI;

	/**
	 * The feature id for the '<em><b>Alias URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ATTRIBUTE_DECLARATION__ALIAS_URI = XSD_FEATURE__ALIAS_URI;

	/**
	 * The feature id for the '<em><b>QName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ATTRIBUTE_DECLARATION__QNAME = XSD_FEATURE__QNAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ATTRIBUTE_DECLARATION__VALUE = XSD_FEATURE__VALUE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ATTRIBUTE_DECLARATION__CONSTRAINT = XSD_FEATURE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ATTRIBUTE_DECLARATION__FORM = XSD_FEATURE__FORM;

	/**
	 * The feature id for the '<em><b>Lexical Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ATTRIBUTE_DECLARATION__LEXICAL_VALUE = XSD_FEATURE__LEXICAL_VALUE;

	/**
	 * The feature id for the '<em><b>Global</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ATTRIBUTE_DECLARATION__GLOBAL = XSD_FEATURE__GLOBAL;

	/**
	 * The feature id for the '<em><b>Feature Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ATTRIBUTE_DECLARATION__FEATURE_REFERENCE = XSD_FEATURE__FEATURE_REFERENCE;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ATTRIBUTE_DECLARATION__SCOPE = XSD_FEATURE__SCOPE;

	/**
	 * The feature id for the '<em><b>Resolved Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ATTRIBUTE_DECLARATION__RESOLVED_FEATURE = XSD_FEATURE__RESOLVED_FEATURE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ATTRIBUTE_DECLARATION__TYPE = XSD_FEATURE__TYPE;

	/**
	 * The feature id for the '<em><b>Attribute Declaration Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ATTRIBUTE_DECLARATION__ATTRIBUTE_DECLARATION_REFERENCE = XSD_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ATTRIBUTE_DECLARATION__ANNOTATION = XSD_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Anonymous Type Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ATTRIBUTE_DECLARATION__ANONYMOUS_TYPE_DEFINITION = XSD_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ATTRIBUTE_DECLARATION__TYPE_DEFINITION = XSD_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Resolved Attribute Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ATTRIBUTE_DECLARATION__RESOLVED_ATTRIBUTE_DECLARATION = XSD_FEATURE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>XSD Attribute Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ATTRIBUTE_DECLARATION_FEATURE_COUNT = XSD_FEATURE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>XSD Attribute Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ATTRIBUTE_DECLARATION_OPERATION_COUNT = XSD_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.impl.XSDAttributeGroupContentImpl <em>XSD Attribute Group Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.impl.XSDAttributeGroupContentImpl
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDAttributeGroupContent()
	 * @generated
	 */
	int XSD_ATTRIBUTE_GROUP_CONTENT = 2;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ATTRIBUTE_GROUP_CONTENT__ELEMENT = XSD_CONCRETE_COMPONENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ATTRIBUTE_GROUP_CONTENT__CONTAINER = XSD_CONCRETE_COMPONENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ATTRIBUTE_GROUP_CONTENT__ROOT_CONTAINER = XSD_CONCRETE_COMPONENT__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ATTRIBUTE_GROUP_CONTENT__SCHEMA = XSD_CONCRETE_COMPONENT__SCHEMA;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ATTRIBUTE_GROUP_CONTENT__DIAGNOSTICS = XSD_CONCRETE_COMPONENT__DIAGNOSTICS;

	/**
	 * The number of structural features of the '<em>XSD Attribute Group Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ATTRIBUTE_GROUP_CONTENT_FEATURE_COUNT = XSD_CONCRETE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>XSD Attribute Group Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ATTRIBUTE_GROUP_CONTENT_OPERATION_COUNT = XSD_CONCRETE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.impl.XSDRedefinableComponentImpl <em>XSD Redefinable Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.impl.XSDRedefinableComponentImpl
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDRedefinableComponent()
	 * @generated
	 */
	int XSD_REDEFINABLE_COMPONENT = 41;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_REDEFINABLE_COMPONENT__ELEMENT = XSD_NAMED_COMPONENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_REDEFINABLE_COMPONENT__CONTAINER = XSD_NAMED_COMPONENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_REDEFINABLE_COMPONENT__ROOT_CONTAINER = XSD_NAMED_COMPONENT__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_REDEFINABLE_COMPONENT__SCHEMA = XSD_NAMED_COMPONENT__SCHEMA;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_REDEFINABLE_COMPONENT__DIAGNOSTICS = XSD_NAMED_COMPONENT__DIAGNOSTICS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_REDEFINABLE_COMPONENT__NAME = XSD_NAMED_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_REDEFINABLE_COMPONENT__TARGET_NAMESPACE = XSD_NAMED_COMPONENT__TARGET_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_REDEFINABLE_COMPONENT__ALIAS_NAME = XSD_NAMED_COMPONENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_REDEFINABLE_COMPONENT__URI = XSD_NAMED_COMPONENT__URI;

	/**
	 * The feature id for the '<em><b>Alias URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_REDEFINABLE_COMPONENT__ALIAS_URI = XSD_NAMED_COMPONENT__ALIAS_URI;

	/**
	 * The feature id for the '<em><b>QName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_REDEFINABLE_COMPONENT__QNAME = XSD_NAMED_COMPONENT__QNAME;

	/**
	 * The feature id for the '<em><b>Circular</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_REDEFINABLE_COMPONENT__CIRCULAR = XSD_NAMED_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XSD Redefinable Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_REDEFINABLE_COMPONENT_FEATURE_COUNT = XSD_NAMED_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>XSD Redefinable Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_REDEFINABLE_COMPONENT_OPERATION_COUNT = XSD_NAMED_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.impl.XSDAttributeGroupDefinitionImpl <em>XSD Attribute Group Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.impl.XSDAttributeGroupDefinitionImpl
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDAttributeGroupDefinition()
	 * @generated
	 */
	int XSD_ATTRIBUTE_GROUP_DEFINITION = 3;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ATTRIBUTE_GROUP_DEFINITION__ELEMENT = XSD_REDEFINABLE_COMPONENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ATTRIBUTE_GROUP_DEFINITION__CONTAINER = XSD_REDEFINABLE_COMPONENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ATTRIBUTE_GROUP_DEFINITION__ROOT_CONTAINER = XSD_REDEFINABLE_COMPONENT__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ATTRIBUTE_GROUP_DEFINITION__SCHEMA = XSD_REDEFINABLE_COMPONENT__SCHEMA;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ATTRIBUTE_GROUP_DEFINITION__DIAGNOSTICS = XSD_REDEFINABLE_COMPONENT__DIAGNOSTICS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ATTRIBUTE_GROUP_DEFINITION__NAME = XSD_REDEFINABLE_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ATTRIBUTE_GROUP_DEFINITION__TARGET_NAMESPACE = XSD_REDEFINABLE_COMPONENT__TARGET_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ATTRIBUTE_GROUP_DEFINITION__ALIAS_NAME = XSD_REDEFINABLE_COMPONENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ATTRIBUTE_GROUP_DEFINITION__URI = XSD_REDEFINABLE_COMPONENT__URI;

	/**
	 * The feature id for the '<em><b>Alias URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ATTRIBUTE_GROUP_DEFINITION__ALIAS_URI = XSD_REDEFINABLE_COMPONENT__ALIAS_URI;

	/**
	 * The feature id for the '<em><b>QName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ATTRIBUTE_GROUP_DEFINITION__QNAME = XSD_REDEFINABLE_COMPONENT__QNAME;

	/**
	 * The feature id for the '<em><b>Circular</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ATTRIBUTE_GROUP_DEFINITION__CIRCULAR = XSD_REDEFINABLE_COMPONENT__CIRCULAR;

	/**
	 * The feature id for the '<em><b>Attribute Group Definition Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ATTRIBUTE_GROUP_DEFINITION__ATTRIBUTE_GROUP_DEFINITION_REFERENCE = XSD_REDEFINABLE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ATTRIBUTE_GROUP_DEFINITION__ANNOTATION = XSD_REDEFINABLE_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ATTRIBUTE_GROUP_DEFINITION__CONTENTS = XSD_REDEFINABLE_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attribute Uses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ATTRIBUTE_GROUP_DEFINITION__ATTRIBUTE_USES = XSD_REDEFINABLE_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Attribute Wildcard Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ATTRIBUTE_GROUP_DEFINITION__ATTRIBUTE_WILDCARD_CONTENT = XSD_REDEFINABLE_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attribute Wildcard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ATTRIBUTE_GROUP_DEFINITION__ATTRIBUTE_WILDCARD = XSD_REDEFINABLE_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Resolved Attribute Group Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ATTRIBUTE_GROUP_DEFINITION__RESOLVED_ATTRIBUTE_GROUP_DEFINITION = XSD_REDEFINABLE_COMPONENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Synthetic Wildcard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ATTRIBUTE_GROUP_DEFINITION__SYNTHETIC_WILDCARD = XSD_REDEFINABLE_COMPONENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>XSD Attribute Group Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ATTRIBUTE_GROUP_DEFINITION_FEATURE_COUNT = XSD_REDEFINABLE_COMPONENT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>XSD Attribute Group Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ATTRIBUTE_GROUP_DEFINITION_OPERATION_COUNT = XSD_REDEFINABLE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.impl.XSDAttributeUseImpl <em>XSD Attribute Use</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.impl.XSDAttributeUseImpl
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDAttributeUse()
	 * @generated
	 */
	int XSD_ATTRIBUTE_USE = 4;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ATTRIBUTE_USE__ELEMENT = XSD_COMPONENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ATTRIBUTE_USE__CONTAINER = XSD_COMPONENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ATTRIBUTE_USE__ROOT_CONTAINER = XSD_COMPONENT__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ATTRIBUTE_USE__SCHEMA = XSD_COMPONENT__SCHEMA;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ATTRIBUTE_USE__DIAGNOSTICS = XSD_COMPONENT__DIAGNOSTICS;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ATTRIBUTE_USE__REQUIRED = XSD_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ATTRIBUTE_USE__VALUE = XSD_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ATTRIBUTE_USE__CONSTRAINT = XSD_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ATTRIBUTE_USE__USE = XSD_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lexical Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ATTRIBUTE_USE__LEXICAL_VALUE = XSD_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attribute Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ATTRIBUTE_USE__ATTRIBUTE_DECLARATION = XSD_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ATTRIBUTE_USE__CONTENT = XSD_COMPONENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>XSD Attribute Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ATTRIBUTE_USE_FEATURE_COUNT = XSD_COMPONENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>XSD Attribute Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ATTRIBUTE_USE_OPERATION_COUNT = XSD_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.impl.XSDFacetImpl <em>XSD Facet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.impl.XSDFacetImpl
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDFacet()
	 * @generated
	 */
	int XSD_FACET = 15;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FACET__ELEMENT = XSD_COMPONENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FACET__CONTAINER = XSD_COMPONENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FACET__ROOT_CONTAINER = XSD_COMPONENT__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FACET__SCHEMA = XSD_COMPONENT__SCHEMA;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FACET__DIAGNOSTICS = XSD_COMPONENT__DIAGNOSTICS;

	/**
	 * The feature id for the '<em><b>Lexical Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FACET__LEXICAL_VALUE = XSD_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Facet Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FACET__FACET_NAME = XSD_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Effective Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FACET__EFFECTIVE_VALUE = XSD_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FACET__ANNOTATION = XSD_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Simple Type Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FACET__SIMPLE_TYPE_DEFINITION = XSD_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>XSD Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FACET_FEATURE_COUNT = XSD_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>XSD Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FACET_OPERATION_COUNT = XSD_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.impl.XSDFundamentalFacetImpl <em>XSD Fundamental Facet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.impl.XSDFundamentalFacetImpl
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDFundamentalFacet()
	 * @generated
	 */
	int XSD_FUNDAMENTAL_FACET = 19;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FUNDAMENTAL_FACET__ELEMENT = XSD_FACET__ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FUNDAMENTAL_FACET__CONTAINER = XSD_FACET__CONTAINER;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FUNDAMENTAL_FACET__ROOT_CONTAINER = XSD_FACET__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FUNDAMENTAL_FACET__SCHEMA = XSD_FACET__SCHEMA;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FUNDAMENTAL_FACET__DIAGNOSTICS = XSD_FACET__DIAGNOSTICS;

	/**
	 * The feature id for the '<em><b>Lexical Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FUNDAMENTAL_FACET__LEXICAL_VALUE = XSD_FACET__LEXICAL_VALUE;

	/**
	 * The feature id for the '<em><b>Facet Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FUNDAMENTAL_FACET__FACET_NAME = XSD_FACET__FACET_NAME;

	/**
	 * The feature id for the '<em><b>Effective Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FUNDAMENTAL_FACET__EFFECTIVE_VALUE = XSD_FACET__EFFECTIVE_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FUNDAMENTAL_FACET__ANNOTATION = XSD_FACET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Simple Type Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FUNDAMENTAL_FACET__SIMPLE_TYPE_DEFINITION = XSD_FACET__SIMPLE_TYPE_DEFINITION;

	/**
	 * The number of structural features of the '<em>XSD Fundamental Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FUNDAMENTAL_FACET_FEATURE_COUNT = XSD_FACET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>XSD Fundamental Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FUNDAMENTAL_FACET_OPERATION_COUNT = XSD_FACET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.impl.XSDBoundedFacetImpl <em>XSD Bounded Facet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.impl.XSDBoundedFacetImpl
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDBoundedFacet()
	 * @generated
	 */
	int XSD_BOUNDED_FACET = 5;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_BOUNDED_FACET__ELEMENT = XSD_FUNDAMENTAL_FACET__ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_BOUNDED_FACET__CONTAINER = XSD_FUNDAMENTAL_FACET__CONTAINER;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_BOUNDED_FACET__ROOT_CONTAINER = XSD_FUNDAMENTAL_FACET__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_BOUNDED_FACET__SCHEMA = XSD_FUNDAMENTAL_FACET__SCHEMA;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_BOUNDED_FACET__DIAGNOSTICS = XSD_FUNDAMENTAL_FACET__DIAGNOSTICS;

	/**
	 * The feature id for the '<em><b>Lexical Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_BOUNDED_FACET__LEXICAL_VALUE = XSD_FUNDAMENTAL_FACET__LEXICAL_VALUE;

	/**
	 * The feature id for the '<em><b>Facet Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_BOUNDED_FACET__FACET_NAME = XSD_FUNDAMENTAL_FACET__FACET_NAME;

	/**
	 * The feature id for the '<em><b>Effective Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_BOUNDED_FACET__EFFECTIVE_VALUE = XSD_FUNDAMENTAL_FACET__EFFECTIVE_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_BOUNDED_FACET__ANNOTATION = XSD_FUNDAMENTAL_FACET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Simple Type Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_BOUNDED_FACET__SIMPLE_TYPE_DEFINITION = XSD_FUNDAMENTAL_FACET__SIMPLE_TYPE_DEFINITION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_BOUNDED_FACET__VALUE = XSD_FUNDAMENTAL_FACET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XSD Bounded Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_BOUNDED_FACET_FEATURE_COUNT = XSD_FUNDAMENTAL_FACET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>XSD Bounded Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_BOUNDED_FACET_OPERATION_COUNT = XSD_FUNDAMENTAL_FACET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.impl.XSDCardinalityFacetImpl <em>XSD Cardinality Facet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.impl.XSDCardinalityFacetImpl
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDCardinalityFacet()
	 * @generated
	 */
	int XSD_CARDINALITY_FACET = 6;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_CARDINALITY_FACET__ELEMENT = XSD_FUNDAMENTAL_FACET__ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_CARDINALITY_FACET__CONTAINER = XSD_FUNDAMENTAL_FACET__CONTAINER;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_CARDINALITY_FACET__ROOT_CONTAINER = XSD_FUNDAMENTAL_FACET__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_CARDINALITY_FACET__SCHEMA = XSD_FUNDAMENTAL_FACET__SCHEMA;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_CARDINALITY_FACET__DIAGNOSTICS = XSD_FUNDAMENTAL_FACET__DIAGNOSTICS;

	/**
	 * The feature id for the '<em><b>Lexical Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_CARDINALITY_FACET__LEXICAL_VALUE = XSD_FUNDAMENTAL_FACET__LEXICAL_VALUE;

	/**
	 * The feature id for the '<em><b>Facet Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_CARDINALITY_FACET__FACET_NAME = XSD_FUNDAMENTAL_FACET__FACET_NAME;

	/**
	 * The feature id for the '<em><b>Effective Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_CARDINALITY_FACET__EFFECTIVE_VALUE = XSD_FUNDAMENTAL_FACET__EFFECTIVE_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_CARDINALITY_FACET__ANNOTATION = XSD_FUNDAMENTAL_FACET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Simple Type Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_CARDINALITY_FACET__SIMPLE_TYPE_DEFINITION = XSD_FUNDAMENTAL_FACET__SIMPLE_TYPE_DEFINITION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_CARDINALITY_FACET__VALUE = XSD_FUNDAMENTAL_FACET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XSD Cardinality Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_CARDINALITY_FACET_FEATURE_COUNT = XSD_FUNDAMENTAL_FACET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>XSD Cardinality Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_CARDINALITY_FACET_OPERATION_COUNT = XSD_FUNDAMENTAL_FACET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.impl.XSDComplexTypeContentImpl <em>XSD Complex Type Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.impl.XSDComplexTypeContentImpl
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDComplexTypeContent()
	 * @generated
	 */
	int XSD_COMPLEX_TYPE_CONTENT = 7;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_COMPLEX_TYPE_CONTENT__ELEMENT = XSD_COMPONENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_COMPLEX_TYPE_CONTENT__CONTAINER = XSD_COMPONENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_COMPLEX_TYPE_CONTENT__ROOT_CONTAINER = XSD_COMPONENT__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_COMPLEX_TYPE_CONTENT__SCHEMA = XSD_COMPONENT__SCHEMA;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_COMPLEX_TYPE_CONTENT__DIAGNOSTICS = XSD_COMPONENT__DIAGNOSTICS;

	/**
	 * The number of structural features of the '<em>XSD Complex Type Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_COMPLEX_TYPE_CONTENT_FEATURE_COUNT = XSD_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>XSD Complex Type Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_COMPLEX_TYPE_CONTENT_OPERATION_COUNT = XSD_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.impl.XSDTypeDefinitionImpl <em>XSD Type Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.impl.XSDTypeDefinitionImpl
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDTypeDefinition()
	 * @generated
	 */
	int XSD_TYPE_DEFINITION = 53;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_TYPE_DEFINITION__ELEMENT = XSD_REDEFINABLE_COMPONENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_TYPE_DEFINITION__CONTAINER = XSD_REDEFINABLE_COMPONENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_TYPE_DEFINITION__ROOT_CONTAINER = XSD_REDEFINABLE_COMPONENT__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_TYPE_DEFINITION__SCHEMA = XSD_REDEFINABLE_COMPONENT__SCHEMA;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_TYPE_DEFINITION__DIAGNOSTICS = XSD_REDEFINABLE_COMPONENT__DIAGNOSTICS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_TYPE_DEFINITION__NAME = XSD_REDEFINABLE_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_TYPE_DEFINITION__TARGET_NAMESPACE = XSD_REDEFINABLE_COMPONENT__TARGET_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_TYPE_DEFINITION__ALIAS_NAME = XSD_REDEFINABLE_COMPONENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_TYPE_DEFINITION__URI = XSD_REDEFINABLE_COMPONENT__URI;

	/**
	 * The feature id for the '<em><b>Alias URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_TYPE_DEFINITION__ALIAS_URI = XSD_REDEFINABLE_COMPONENT__ALIAS_URI;

	/**
	 * The feature id for the '<em><b>QName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_TYPE_DEFINITION__QNAME = XSD_REDEFINABLE_COMPONENT__QNAME;

	/**
	 * The feature id for the '<em><b>Circular</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_TYPE_DEFINITION__CIRCULAR = XSD_REDEFINABLE_COMPONENT__CIRCULAR;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_TYPE_DEFINITION__ANNOTATION = XSD_REDEFINABLE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Derivation Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_TYPE_DEFINITION__DERIVATION_ANNOTATION = XSD_REDEFINABLE_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_TYPE_DEFINITION__ANNOTATIONS = XSD_REDEFINABLE_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Root Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_TYPE_DEFINITION__ROOT_TYPE = XSD_REDEFINABLE_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Base Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_TYPE_DEFINITION__BASE_TYPE = XSD_REDEFINABLE_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Simple Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_TYPE_DEFINITION__SIMPLE_TYPE = XSD_REDEFINABLE_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Complex Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_TYPE_DEFINITION__COMPLEX_TYPE = XSD_REDEFINABLE_COMPONENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>XSD Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_TYPE_DEFINITION_FEATURE_COUNT = XSD_REDEFINABLE_COMPONENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>XSD Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_TYPE_DEFINITION_OPERATION_COUNT = XSD_REDEFINABLE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.impl.XSDComplexTypeDefinitionImpl <em>XSD Complex Type Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.impl.XSDComplexTypeDefinitionImpl
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDComplexTypeDefinition()
	 * @generated
	 */
	int XSD_COMPLEX_TYPE_DEFINITION = 8;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_COMPLEX_TYPE_DEFINITION__ELEMENT = XSD_TYPE_DEFINITION__ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_COMPLEX_TYPE_DEFINITION__CONTAINER = XSD_TYPE_DEFINITION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_COMPLEX_TYPE_DEFINITION__ROOT_CONTAINER = XSD_TYPE_DEFINITION__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_COMPLEX_TYPE_DEFINITION__SCHEMA = XSD_TYPE_DEFINITION__SCHEMA;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_COMPLEX_TYPE_DEFINITION__DIAGNOSTICS = XSD_TYPE_DEFINITION__DIAGNOSTICS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_COMPLEX_TYPE_DEFINITION__NAME = XSD_TYPE_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_COMPLEX_TYPE_DEFINITION__TARGET_NAMESPACE = XSD_TYPE_DEFINITION__TARGET_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_COMPLEX_TYPE_DEFINITION__ALIAS_NAME = XSD_TYPE_DEFINITION__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_COMPLEX_TYPE_DEFINITION__URI = XSD_TYPE_DEFINITION__URI;

	/**
	 * The feature id for the '<em><b>Alias URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_COMPLEX_TYPE_DEFINITION__ALIAS_URI = XSD_TYPE_DEFINITION__ALIAS_URI;

	/**
	 * The feature id for the '<em><b>QName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_COMPLEX_TYPE_DEFINITION__QNAME = XSD_TYPE_DEFINITION__QNAME;

	/**
	 * The feature id for the '<em><b>Circular</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_COMPLEX_TYPE_DEFINITION__CIRCULAR = XSD_TYPE_DEFINITION__CIRCULAR;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_COMPLEX_TYPE_DEFINITION__ANNOTATION = XSD_TYPE_DEFINITION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Derivation Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_COMPLEX_TYPE_DEFINITION__DERIVATION_ANNOTATION = XSD_TYPE_DEFINITION__DERIVATION_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_COMPLEX_TYPE_DEFINITION__ANNOTATIONS = XSD_TYPE_DEFINITION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Root Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_COMPLEX_TYPE_DEFINITION__ROOT_TYPE = XSD_TYPE_DEFINITION__ROOT_TYPE;

	/**
	 * The feature id for the '<em><b>Base Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_COMPLEX_TYPE_DEFINITION__BASE_TYPE = XSD_TYPE_DEFINITION__BASE_TYPE;

	/**
	 * The feature id for the '<em><b>Simple Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_COMPLEX_TYPE_DEFINITION__SIMPLE_TYPE = XSD_TYPE_DEFINITION__SIMPLE_TYPE;

	/**
	 * The feature id for the '<em><b>Complex Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_COMPLEX_TYPE_DEFINITION__COMPLEX_TYPE = XSD_TYPE_DEFINITION__COMPLEX_TYPE;

	/**
	 * The feature id for the '<em><b>Derivation Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_COMPLEX_TYPE_DEFINITION__DERIVATION_METHOD = XSD_TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_COMPLEX_TYPE_DEFINITION__FINAL = XSD_TYPE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_COMPLEX_TYPE_DEFINITION__ABSTRACT = XSD_TYPE_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Content Type Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_COMPLEX_TYPE_DEFINITION__CONTENT_TYPE_CATEGORY = XSD_TYPE_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Prohibited Substitutions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_COMPLEX_TYPE_DEFINITION__PROHIBITED_SUBSTITUTIONS = XSD_TYPE_DEFINITION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Lexical Final</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_COMPLEX_TYPE_DEFINITION__LEXICAL_FINAL = XSD_TYPE_DEFINITION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Block</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_COMPLEX_TYPE_DEFINITION__BLOCK = XSD_TYPE_DEFINITION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_COMPLEX_TYPE_DEFINITION__MIXED = XSD_TYPE_DEFINITION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Content Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_COMPLEX_TYPE_DEFINITION__CONTENT_ANNOTATION = XSD_TYPE_DEFINITION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Base Type Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_COMPLEX_TYPE_DEFINITION__BASE_TYPE_DEFINITION = XSD_TYPE_DEFINITION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_COMPLEX_TYPE_DEFINITION__CONTENT = XSD_TYPE_DEFINITION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_COMPLEX_TYPE_DEFINITION__CONTENT_TYPE = XSD_TYPE_DEFINITION_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Attribute Uses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_COMPLEX_TYPE_DEFINITION__ATTRIBUTE_USES = XSD_TYPE_DEFINITION_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Attribute Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_COMPLEX_TYPE_DEFINITION__ATTRIBUTE_CONTENTS = XSD_TYPE_DEFINITION_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Attribute Wildcard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_COMPLEX_TYPE_DEFINITION__ATTRIBUTE_WILDCARD = XSD_TYPE_DEFINITION_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Attribute Wildcard Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_COMPLEX_TYPE_DEFINITION__ATTRIBUTE_WILDCARD_CONTENT = XSD_TYPE_DEFINITION_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Root Type Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_COMPLEX_TYPE_DEFINITION__ROOT_TYPE_DEFINITION = XSD_TYPE_DEFINITION_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Synthetic Particle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_COMPLEX_TYPE_DEFINITION__SYNTHETIC_PARTICLE = XSD_TYPE_DEFINITION_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Synthetic Wildcard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_COMPLEX_TYPE_DEFINITION__SYNTHETIC_WILDCARD = XSD_TYPE_DEFINITION_FEATURE_COUNT + 18;

	/**
	 * The number of structural features of the '<em>XSD Complex Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_COMPLEX_TYPE_DEFINITION_FEATURE_COUNT = XSD_TYPE_DEFINITION_FEATURE_COUNT + 19;

	/**
	 * The number of operations of the '<em>XSD Complex Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_COMPLEX_TYPE_DEFINITION_OPERATION_COUNT = XSD_TYPE_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.impl.XSDConstrainingFacetImpl <em>XSD Constraining Facet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.impl.XSDConstrainingFacetImpl
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDConstrainingFacet()
	 * @generated
	 */
	int XSD_CONSTRAINING_FACET = 11;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_CONSTRAINING_FACET__ELEMENT = XSD_FACET__ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_CONSTRAINING_FACET__CONTAINER = XSD_FACET__CONTAINER;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_CONSTRAINING_FACET__ROOT_CONTAINER = XSD_FACET__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_CONSTRAINING_FACET__SCHEMA = XSD_FACET__SCHEMA;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_CONSTRAINING_FACET__DIAGNOSTICS = XSD_FACET__DIAGNOSTICS;

	/**
	 * The feature id for the '<em><b>Lexical Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_CONSTRAINING_FACET__LEXICAL_VALUE = XSD_FACET__LEXICAL_VALUE;

	/**
	 * The feature id for the '<em><b>Facet Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_CONSTRAINING_FACET__FACET_NAME = XSD_FACET__FACET_NAME;

	/**
	 * The feature id for the '<em><b>Effective Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_CONSTRAINING_FACET__EFFECTIVE_VALUE = XSD_FACET__EFFECTIVE_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_CONSTRAINING_FACET__ANNOTATION = XSD_FACET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Simple Type Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_CONSTRAINING_FACET__SIMPLE_TYPE_DEFINITION = XSD_FACET__SIMPLE_TYPE_DEFINITION;

	/**
	 * The number of structural features of the '<em>XSD Constraining Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_CONSTRAINING_FACET_FEATURE_COUNT = XSD_FACET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>XSD Constraining Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_CONSTRAINING_FACET_OPERATION_COUNT = XSD_FACET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.impl.XSDDiagnosticImpl <em>XSD Diagnostic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.impl.XSDDiagnosticImpl
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDDiagnostic()
	 * @generated
	 */
	int XSD_DIAGNOSTIC = 12;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_DIAGNOSTIC__ELEMENT = XSD_CONCRETE_COMPONENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_DIAGNOSTIC__CONTAINER = XSD_CONCRETE_COMPONENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_DIAGNOSTIC__ROOT_CONTAINER = XSD_CONCRETE_COMPONENT__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_DIAGNOSTIC__SCHEMA = XSD_CONCRETE_COMPONENT__SCHEMA;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_DIAGNOSTIC__DIAGNOSTICS = XSD_CONCRETE_COMPONENT__DIAGNOSTICS;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_DIAGNOSTIC__SEVERITY = XSD_CONCRETE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_DIAGNOSTIC__MESSAGE = XSD_CONCRETE_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Location URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_DIAGNOSTIC__LOCATION_URI = XSD_CONCRETE_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_DIAGNOSTIC__LINE = XSD_CONCRETE_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_DIAGNOSTIC__COLUMN = XSD_CONCRETE_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_DIAGNOSTIC__NODE = XSD_CONCRETE_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Annotation URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_DIAGNOSTIC__ANNOTATION_URI = XSD_CONCRETE_COMPONENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_DIAGNOSTIC__KEY = XSD_CONCRETE_COMPONENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Substitutions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_DIAGNOSTIC__SUBSTITUTIONS = XSD_CONCRETE_COMPONENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_DIAGNOSTIC__COMPONENTS = XSD_CONCRETE_COMPONENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Primary Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_DIAGNOSTIC__PRIMARY_COMPONENT = XSD_CONCRETE_COMPONENT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>XSD Diagnostic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_DIAGNOSTIC_FEATURE_COUNT = XSD_CONCRETE_COMPONENT_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>XSD Diagnostic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_DIAGNOSTIC_OPERATION_COUNT = XSD_CONCRETE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.impl.XSDElementDeclarationImpl <em>XSD Element Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.impl.XSDElementDeclarationImpl
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDElementDeclaration()
	 * @generated
	 */
	int XSD_ELEMENT_DECLARATION = 13;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ELEMENT_DECLARATION__ELEMENT = XSD_FEATURE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ELEMENT_DECLARATION__CONTAINER = XSD_FEATURE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ELEMENT_DECLARATION__ROOT_CONTAINER = XSD_FEATURE__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ELEMENT_DECLARATION__SCHEMA = XSD_FEATURE__SCHEMA;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ELEMENT_DECLARATION__DIAGNOSTICS = XSD_FEATURE__DIAGNOSTICS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ELEMENT_DECLARATION__NAME = XSD_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ELEMENT_DECLARATION__TARGET_NAMESPACE = XSD_FEATURE__TARGET_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ELEMENT_DECLARATION__ALIAS_NAME = XSD_FEATURE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ELEMENT_DECLARATION__URI = XSD_FEATURE__URI;

	/**
	 * The feature id for the '<em><b>Alias URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ELEMENT_DECLARATION__ALIAS_URI = XSD_FEATURE__ALIAS_URI;

	/**
	 * The feature id for the '<em><b>QName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ELEMENT_DECLARATION__QNAME = XSD_FEATURE__QNAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ELEMENT_DECLARATION__VALUE = XSD_FEATURE__VALUE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ELEMENT_DECLARATION__CONSTRAINT = XSD_FEATURE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ELEMENT_DECLARATION__FORM = XSD_FEATURE__FORM;

	/**
	 * The feature id for the '<em><b>Lexical Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ELEMENT_DECLARATION__LEXICAL_VALUE = XSD_FEATURE__LEXICAL_VALUE;

	/**
	 * The feature id for the '<em><b>Global</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ELEMENT_DECLARATION__GLOBAL = XSD_FEATURE__GLOBAL;

	/**
	 * The feature id for the '<em><b>Feature Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ELEMENT_DECLARATION__FEATURE_REFERENCE = XSD_FEATURE__FEATURE_REFERENCE;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ELEMENT_DECLARATION__SCOPE = XSD_FEATURE__SCOPE;

	/**
	 * The feature id for the '<em><b>Resolved Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ELEMENT_DECLARATION__RESOLVED_FEATURE = XSD_FEATURE__RESOLVED_FEATURE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ELEMENT_DECLARATION__TYPE = XSD_FEATURE__TYPE;

	/**
	 * The feature id for the '<em><b>Nillable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ELEMENT_DECLARATION__NILLABLE = XSD_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Disallowed Substitutions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ELEMENT_DECLARATION__DISALLOWED_SUBSTITUTIONS = XSD_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Substitution Group Exclusions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ELEMENT_DECLARATION__SUBSTITUTION_GROUP_EXCLUSIONS = XSD_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ELEMENT_DECLARATION__ABSTRACT = XSD_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lexical Final</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ELEMENT_DECLARATION__LEXICAL_FINAL = XSD_FEATURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Block</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ELEMENT_DECLARATION__BLOCK = XSD_FEATURE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Element Declaration Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ELEMENT_DECLARATION__ELEMENT_DECLARATION_REFERENCE = XSD_FEATURE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Circular</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ELEMENT_DECLARATION__CIRCULAR = XSD_FEATURE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ELEMENT_DECLARATION__ANNOTATION = XSD_FEATURE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Anonymous Type Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ELEMENT_DECLARATION__ANONYMOUS_TYPE_DEFINITION = XSD_FEATURE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Type Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ELEMENT_DECLARATION__TYPE_DEFINITION = XSD_FEATURE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Identity Constraint Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ELEMENT_DECLARATION__IDENTITY_CONSTRAINT_DEFINITIONS = XSD_FEATURE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Resolved Element Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ELEMENT_DECLARATION__RESOLVED_ELEMENT_DECLARATION = XSD_FEATURE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Substitution Group Affiliation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ELEMENT_DECLARATION__SUBSTITUTION_GROUP_AFFILIATION = XSD_FEATURE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Substitution Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ELEMENT_DECLARATION__SUBSTITUTION_GROUP = XSD_FEATURE_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>XSD Element Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ELEMENT_DECLARATION_FEATURE_COUNT = XSD_FEATURE_FEATURE_COUNT + 15;

	/**
	 * The number of operations of the '<em>XSD Element Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ELEMENT_DECLARATION_OPERATION_COUNT = XSD_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.impl.XSDRepeatableFacetImpl <em>XSD Repeatable Facet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.impl.XSDRepeatableFacetImpl
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDRepeatableFacet()
	 * @generated
	 */
	int XSD_REPEATABLE_FACET = 44;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_REPEATABLE_FACET__ELEMENT = XSD_CONSTRAINING_FACET__ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_REPEATABLE_FACET__CONTAINER = XSD_CONSTRAINING_FACET__CONTAINER;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_REPEATABLE_FACET__ROOT_CONTAINER = XSD_CONSTRAINING_FACET__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_REPEATABLE_FACET__SCHEMA = XSD_CONSTRAINING_FACET__SCHEMA;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_REPEATABLE_FACET__DIAGNOSTICS = XSD_CONSTRAINING_FACET__DIAGNOSTICS;

	/**
	 * The feature id for the '<em><b>Lexical Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_REPEATABLE_FACET__LEXICAL_VALUE = XSD_CONSTRAINING_FACET__LEXICAL_VALUE;

	/**
	 * The feature id for the '<em><b>Facet Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_REPEATABLE_FACET__FACET_NAME = XSD_CONSTRAINING_FACET__FACET_NAME;

	/**
	 * The feature id for the '<em><b>Effective Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_REPEATABLE_FACET__EFFECTIVE_VALUE = XSD_CONSTRAINING_FACET__EFFECTIVE_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_REPEATABLE_FACET__ANNOTATION = XSD_CONSTRAINING_FACET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Simple Type Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_REPEATABLE_FACET__SIMPLE_TYPE_DEFINITION = XSD_CONSTRAINING_FACET__SIMPLE_TYPE_DEFINITION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_REPEATABLE_FACET__ANNOTATIONS = XSD_CONSTRAINING_FACET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XSD Repeatable Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_REPEATABLE_FACET_FEATURE_COUNT = XSD_CONSTRAINING_FACET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>XSD Repeatable Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_REPEATABLE_FACET_OPERATION_COUNT = XSD_CONSTRAINING_FACET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.impl.XSDEnumerationFacetImpl <em>XSD Enumeration Facet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.impl.XSDEnumerationFacetImpl
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDEnumerationFacet()
	 * @generated
	 */
	int XSD_ENUMERATION_FACET = 14;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ENUMERATION_FACET__ELEMENT = XSD_REPEATABLE_FACET__ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ENUMERATION_FACET__CONTAINER = XSD_REPEATABLE_FACET__CONTAINER;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ENUMERATION_FACET__ROOT_CONTAINER = XSD_REPEATABLE_FACET__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ENUMERATION_FACET__SCHEMA = XSD_REPEATABLE_FACET__SCHEMA;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ENUMERATION_FACET__DIAGNOSTICS = XSD_REPEATABLE_FACET__DIAGNOSTICS;

	/**
	 * The feature id for the '<em><b>Lexical Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ENUMERATION_FACET__LEXICAL_VALUE = XSD_REPEATABLE_FACET__LEXICAL_VALUE;

	/**
	 * The feature id for the '<em><b>Facet Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ENUMERATION_FACET__FACET_NAME = XSD_REPEATABLE_FACET__FACET_NAME;

	/**
	 * The feature id for the '<em><b>Effective Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ENUMERATION_FACET__EFFECTIVE_VALUE = XSD_REPEATABLE_FACET__EFFECTIVE_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ENUMERATION_FACET__ANNOTATION = XSD_REPEATABLE_FACET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Simple Type Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ENUMERATION_FACET__SIMPLE_TYPE_DEFINITION = XSD_REPEATABLE_FACET__SIMPLE_TYPE_DEFINITION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ENUMERATION_FACET__ANNOTATIONS = XSD_REPEATABLE_FACET__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ENUMERATION_FACET__VALUE = XSD_REPEATABLE_FACET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XSD Enumeration Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ENUMERATION_FACET_FEATURE_COUNT = XSD_REPEATABLE_FACET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>XSD Enumeration Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ENUMERATION_FACET_OPERATION_COUNT = XSD_REPEATABLE_FACET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.impl.XSDFixedFacetImpl <em>XSD Fixed Facet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.impl.XSDFixedFacetImpl
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDFixedFacet()
	 * @generated
	 */
	int XSD_FIXED_FACET = 17;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FIXED_FACET__ELEMENT = XSD_CONSTRAINING_FACET__ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FIXED_FACET__CONTAINER = XSD_CONSTRAINING_FACET__CONTAINER;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FIXED_FACET__ROOT_CONTAINER = XSD_CONSTRAINING_FACET__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FIXED_FACET__SCHEMA = XSD_CONSTRAINING_FACET__SCHEMA;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FIXED_FACET__DIAGNOSTICS = XSD_CONSTRAINING_FACET__DIAGNOSTICS;

	/**
	 * The feature id for the '<em><b>Lexical Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FIXED_FACET__LEXICAL_VALUE = XSD_CONSTRAINING_FACET__LEXICAL_VALUE;

	/**
	 * The feature id for the '<em><b>Facet Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FIXED_FACET__FACET_NAME = XSD_CONSTRAINING_FACET__FACET_NAME;

	/**
	 * The feature id for the '<em><b>Effective Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FIXED_FACET__EFFECTIVE_VALUE = XSD_CONSTRAINING_FACET__EFFECTIVE_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FIXED_FACET__ANNOTATION = XSD_CONSTRAINING_FACET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Simple Type Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FIXED_FACET__SIMPLE_TYPE_DEFINITION = XSD_CONSTRAINING_FACET__SIMPLE_TYPE_DEFINITION;

	/**
	 * The feature id for the '<em><b>Fixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FIXED_FACET__FIXED = XSD_CONSTRAINING_FACET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XSD Fixed Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FIXED_FACET_FEATURE_COUNT = XSD_CONSTRAINING_FACET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>XSD Fixed Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FIXED_FACET_OPERATION_COUNT = XSD_CONSTRAINING_FACET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.impl.XSDFractionDigitsFacetImpl <em>XSD Fraction Digits Facet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.impl.XSDFractionDigitsFacetImpl
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDFractionDigitsFacet()
	 * @generated
	 */
	int XSD_FRACTION_DIGITS_FACET = 18;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FRACTION_DIGITS_FACET__ELEMENT = XSD_FIXED_FACET__ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FRACTION_DIGITS_FACET__CONTAINER = XSD_FIXED_FACET__CONTAINER;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FRACTION_DIGITS_FACET__ROOT_CONTAINER = XSD_FIXED_FACET__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FRACTION_DIGITS_FACET__SCHEMA = XSD_FIXED_FACET__SCHEMA;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FRACTION_DIGITS_FACET__DIAGNOSTICS = XSD_FIXED_FACET__DIAGNOSTICS;

	/**
	 * The feature id for the '<em><b>Lexical Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FRACTION_DIGITS_FACET__LEXICAL_VALUE = XSD_FIXED_FACET__LEXICAL_VALUE;

	/**
	 * The feature id for the '<em><b>Facet Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FRACTION_DIGITS_FACET__FACET_NAME = XSD_FIXED_FACET__FACET_NAME;

	/**
	 * The feature id for the '<em><b>Effective Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FRACTION_DIGITS_FACET__EFFECTIVE_VALUE = XSD_FIXED_FACET__EFFECTIVE_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FRACTION_DIGITS_FACET__ANNOTATION = XSD_FIXED_FACET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Simple Type Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FRACTION_DIGITS_FACET__SIMPLE_TYPE_DEFINITION = XSD_FIXED_FACET__SIMPLE_TYPE_DEFINITION;

	/**
	 * The feature id for the '<em><b>Fixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FRACTION_DIGITS_FACET__FIXED = XSD_FIXED_FACET__FIXED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FRACTION_DIGITS_FACET__VALUE = XSD_FIXED_FACET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XSD Fraction Digits Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FRACTION_DIGITS_FACET_FEATURE_COUNT = XSD_FIXED_FACET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>XSD Fraction Digits Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_FRACTION_DIGITS_FACET_OPERATION_COUNT = XSD_FIXED_FACET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.impl.XSDIdentityConstraintDefinitionImpl <em>XSD Identity Constraint Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.impl.XSDIdentityConstraintDefinitionImpl
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDIdentityConstraintDefinition()
	 * @generated
	 */
	int XSD_IDENTITY_CONSTRAINT_DEFINITION = 20;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_IDENTITY_CONSTRAINT_DEFINITION__ELEMENT = XSD_NAMED_COMPONENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_IDENTITY_CONSTRAINT_DEFINITION__CONTAINER = XSD_NAMED_COMPONENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_IDENTITY_CONSTRAINT_DEFINITION__ROOT_CONTAINER = XSD_NAMED_COMPONENT__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_IDENTITY_CONSTRAINT_DEFINITION__SCHEMA = XSD_NAMED_COMPONENT__SCHEMA;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_IDENTITY_CONSTRAINT_DEFINITION__DIAGNOSTICS = XSD_NAMED_COMPONENT__DIAGNOSTICS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_IDENTITY_CONSTRAINT_DEFINITION__NAME = XSD_NAMED_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_IDENTITY_CONSTRAINT_DEFINITION__TARGET_NAMESPACE = XSD_NAMED_COMPONENT__TARGET_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_IDENTITY_CONSTRAINT_DEFINITION__ALIAS_NAME = XSD_NAMED_COMPONENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_IDENTITY_CONSTRAINT_DEFINITION__URI = XSD_NAMED_COMPONENT__URI;

	/**
	 * The feature id for the '<em><b>Alias URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_IDENTITY_CONSTRAINT_DEFINITION__ALIAS_URI = XSD_NAMED_COMPONENT__ALIAS_URI;

	/**
	 * The feature id for the '<em><b>QName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_IDENTITY_CONSTRAINT_DEFINITION__QNAME = XSD_NAMED_COMPONENT__QNAME;

	/**
	 * The feature id for the '<em><b>Identity Constraint Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_IDENTITY_CONSTRAINT_DEFINITION__IDENTITY_CONSTRAINT_CATEGORY = XSD_NAMED_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_IDENTITY_CONSTRAINT_DEFINITION__ANNOTATION = XSD_NAMED_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Referenced Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_IDENTITY_CONSTRAINT_DEFINITION__REFERENCED_KEY = XSD_NAMED_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_IDENTITY_CONSTRAINT_DEFINITION__SELECTOR = XSD_NAMED_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_IDENTITY_CONSTRAINT_DEFINITION__FIELDS = XSD_NAMED_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>XSD Identity Constraint Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_IDENTITY_CONSTRAINT_DEFINITION_FEATURE_COUNT = XSD_NAMED_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>XSD Identity Constraint Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_IDENTITY_CONSTRAINT_DEFINITION_OPERATION_COUNT = XSD_NAMED_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.impl.XSDSchemaContentImpl <em>XSD Schema Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.impl.XSDSchemaContentImpl
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDSchemaContent()
	 * @generated
	 */
	int XSD_SCHEMA_CONTENT = 47;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCHEMA_CONTENT__ELEMENT = XSD_CONCRETE_COMPONENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCHEMA_CONTENT__CONTAINER = XSD_CONCRETE_COMPONENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCHEMA_CONTENT__ROOT_CONTAINER = XSD_CONCRETE_COMPONENT__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCHEMA_CONTENT__SCHEMA = XSD_CONCRETE_COMPONENT__SCHEMA;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCHEMA_CONTENT__DIAGNOSTICS = XSD_CONCRETE_COMPONENT__DIAGNOSTICS;

	/**
	 * The number of structural features of the '<em>XSD Schema Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCHEMA_CONTENT_FEATURE_COUNT = XSD_CONCRETE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>XSD Schema Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCHEMA_CONTENT_OPERATION_COUNT = XSD_CONCRETE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.impl.XSDSchemaDirectiveImpl <em>XSD Schema Directive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.impl.XSDSchemaDirectiveImpl
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDSchemaDirective()
	 * @generated
	 */
	int XSD_SCHEMA_DIRECTIVE = 48;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCHEMA_DIRECTIVE__ELEMENT = XSD_SCHEMA_CONTENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCHEMA_DIRECTIVE__CONTAINER = XSD_SCHEMA_CONTENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCHEMA_DIRECTIVE__ROOT_CONTAINER = XSD_SCHEMA_CONTENT__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCHEMA_DIRECTIVE__SCHEMA = XSD_SCHEMA_CONTENT__SCHEMA;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCHEMA_DIRECTIVE__DIAGNOSTICS = XSD_SCHEMA_CONTENT__DIAGNOSTICS;

	/**
	 * The feature id for the '<em><b>Schema Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCHEMA_DIRECTIVE__SCHEMA_LOCATION = XSD_SCHEMA_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resolved Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCHEMA_DIRECTIVE__RESOLVED_SCHEMA = XSD_SCHEMA_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>XSD Schema Directive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCHEMA_DIRECTIVE_FEATURE_COUNT = XSD_SCHEMA_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>XSD Schema Directive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCHEMA_DIRECTIVE_OPERATION_COUNT = XSD_SCHEMA_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.impl.XSDImportImpl <em>XSD Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.impl.XSDImportImpl
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDImport()
	 * @generated
	 */
	int XSD_IMPORT = 21;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_IMPORT__ELEMENT = XSD_SCHEMA_DIRECTIVE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_IMPORT__CONTAINER = XSD_SCHEMA_DIRECTIVE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_IMPORT__ROOT_CONTAINER = XSD_SCHEMA_DIRECTIVE__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_IMPORT__SCHEMA = XSD_SCHEMA_DIRECTIVE__SCHEMA;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_IMPORT__DIAGNOSTICS = XSD_SCHEMA_DIRECTIVE__DIAGNOSTICS;

	/**
	 * The feature id for the '<em><b>Schema Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_IMPORT__SCHEMA_LOCATION = XSD_SCHEMA_DIRECTIVE__SCHEMA_LOCATION;

	/**
	 * The feature id for the '<em><b>Resolved Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_IMPORT__RESOLVED_SCHEMA = XSD_SCHEMA_DIRECTIVE__RESOLVED_SCHEMA;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_IMPORT__NAMESPACE = XSD_SCHEMA_DIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_IMPORT__ANNOTATION = XSD_SCHEMA_DIRECTIVE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>XSD Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_IMPORT_FEATURE_COUNT = XSD_SCHEMA_DIRECTIVE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>XSD Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_IMPORT_OPERATION_COUNT = XSD_SCHEMA_DIRECTIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.impl.XSDSchemaCompositorImpl <em>XSD Schema Compositor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.impl.XSDSchemaCompositorImpl
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDSchemaCompositor()
	 * @generated
	 */
	int XSD_SCHEMA_COMPOSITOR = 46;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCHEMA_COMPOSITOR__ELEMENT = XSD_SCHEMA_DIRECTIVE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCHEMA_COMPOSITOR__CONTAINER = XSD_SCHEMA_DIRECTIVE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCHEMA_COMPOSITOR__ROOT_CONTAINER = XSD_SCHEMA_DIRECTIVE__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCHEMA_COMPOSITOR__SCHEMA = XSD_SCHEMA_DIRECTIVE__SCHEMA;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCHEMA_COMPOSITOR__DIAGNOSTICS = XSD_SCHEMA_DIRECTIVE__DIAGNOSTICS;

	/**
	 * The feature id for the '<em><b>Schema Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCHEMA_COMPOSITOR__SCHEMA_LOCATION = XSD_SCHEMA_DIRECTIVE__SCHEMA_LOCATION;

	/**
	 * The feature id for the '<em><b>Resolved Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCHEMA_COMPOSITOR__RESOLVED_SCHEMA = XSD_SCHEMA_DIRECTIVE__RESOLVED_SCHEMA;

	/**
	 * The feature id for the '<em><b>Incorporated Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCHEMA_COMPOSITOR__INCORPORATED_SCHEMA = XSD_SCHEMA_DIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XSD Schema Compositor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCHEMA_COMPOSITOR_FEATURE_COUNT = XSD_SCHEMA_DIRECTIVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>XSD Schema Compositor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCHEMA_COMPOSITOR_OPERATION_COUNT = XSD_SCHEMA_DIRECTIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.impl.XSDIncludeImpl <em>XSD Include</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.impl.XSDIncludeImpl
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDInclude()
	 * @generated
	 */
	int XSD_INCLUDE = 22;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_INCLUDE__ELEMENT = XSD_SCHEMA_COMPOSITOR__ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_INCLUDE__CONTAINER = XSD_SCHEMA_COMPOSITOR__CONTAINER;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_INCLUDE__ROOT_CONTAINER = XSD_SCHEMA_COMPOSITOR__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_INCLUDE__SCHEMA = XSD_SCHEMA_COMPOSITOR__SCHEMA;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_INCLUDE__DIAGNOSTICS = XSD_SCHEMA_COMPOSITOR__DIAGNOSTICS;

	/**
	 * The feature id for the '<em><b>Schema Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_INCLUDE__SCHEMA_LOCATION = XSD_SCHEMA_COMPOSITOR__SCHEMA_LOCATION;

	/**
	 * The feature id for the '<em><b>Resolved Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_INCLUDE__RESOLVED_SCHEMA = XSD_SCHEMA_COMPOSITOR__RESOLVED_SCHEMA;

	/**
	 * The feature id for the '<em><b>Incorporated Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_INCLUDE__INCORPORATED_SCHEMA = XSD_SCHEMA_COMPOSITOR__INCORPORATED_SCHEMA;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_INCLUDE__ANNOTATION = XSD_SCHEMA_COMPOSITOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XSD Include</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_INCLUDE_FEATURE_COUNT = XSD_SCHEMA_COMPOSITOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>XSD Include</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_INCLUDE_OPERATION_COUNT = XSD_SCHEMA_COMPOSITOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.impl.XSDLengthFacetImpl <em>XSD Length Facet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.impl.XSDLengthFacetImpl
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDLengthFacet()
	 * @generated
	 */
	int XSD_LENGTH_FACET = 23;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_LENGTH_FACET__ELEMENT = XSD_FIXED_FACET__ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_LENGTH_FACET__CONTAINER = XSD_FIXED_FACET__CONTAINER;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_LENGTH_FACET__ROOT_CONTAINER = XSD_FIXED_FACET__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_LENGTH_FACET__SCHEMA = XSD_FIXED_FACET__SCHEMA;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_LENGTH_FACET__DIAGNOSTICS = XSD_FIXED_FACET__DIAGNOSTICS;

	/**
	 * The feature id for the '<em><b>Lexical Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_LENGTH_FACET__LEXICAL_VALUE = XSD_FIXED_FACET__LEXICAL_VALUE;

	/**
	 * The feature id for the '<em><b>Facet Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_LENGTH_FACET__FACET_NAME = XSD_FIXED_FACET__FACET_NAME;

	/**
	 * The feature id for the '<em><b>Effective Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_LENGTH_FACET__EFFECTIVE_VALUE = XSD_FIXED_FACET__EFFECTIVE_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_LENGTH_FACET__ANNOTATION = XSD_FIXED_FACET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Simple Type Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_LENGTH_FACET__SIMPLE_TYPE_DEFINITION = XSD_FIXED_FACET__SIMPLE_TYPE_DEFINITION;

	/**
	 * The feature id for the '<em><b>Fixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_LENGTH_FACET__FIXED = XSD_FIXED_FACET__FIXED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_LENGTH_FACET__VALUE = XSD_FIXED_FACET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XSD Length Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_LENGTH_FACET_FEATURE_COUNT = XSD_FIXED_FACET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>XSD Length Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_LENGTH_FACET_OPERATION_COUNT = XSD_FIXED_FACET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.impl.XSDMaxFacetImpl <em>XSD Max Facet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.impl.XSDMaxFacetImpl
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDMaxFacet()
	 * @generated
	 */
	int XSD_MAX_FACET = 25;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MAX_FACET__ELEMENT = XSD_FIXED_FACET__ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MAX_FACET__CONTAINER = XSD_FIXED_FACET__CONTAINER;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MAX_FACET__ROOT_CONTAINER = XSD_FIXED_FACET__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MAX_FACET__SCHEMA = XSD_FIXED_FACET__SCHEMA;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MAX_FACET__DIAGNOSTICS = XSD_FIXED_FACET__DIAGNOSTICS;

	/**
	 * The feature id for the '<em><b>Lexical Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MAX_FACET__LEXICAL_VALUE = XSD_FIXED_FACET__LEXICAL_VALUE;

	/**
	 * The feature id for the '<em><b>Facet Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MAX_FACET__FACET_NAME = XSD_FIXED_FACET__FACET_NAME;

	/**
	 * The feature id for the '<em><b>Effective Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MAX_FACET__EFFECTIVE_VALUE = XSD_FIXED_FACET__EFFECTIVE_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MAX_FACET__ANNOTATION = XSD_FIXED_FACET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Simple Type Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MAX_FACET__SIMPLE_TYPE_DEFINITION = XSD_FIXED_FACET__SIMPLE_TYPE_DEFINITION;

	/**
	 * The feature id for the '<em><b>Fixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MAX_FACET__FIXED = XSD_FIXED_FACET__FIXED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MAX_FACET__VALUE = XSD_FIXED_FACET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MAX_FACET__INCLUSIVE = XSD_FIXED_FACET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MAX_FACET__EXCLUSIVE = XSD_FIXED_FACET_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>XSD Max Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MAX_FACET_FEATURE_COUNT = XSD_FIXED_FACET_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>XSD Max Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MAX_FACET_OPERATION_COUNT = XSD_FIXED_FACET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.impl.XSDMaxExclusiveFacetImpl <em>XSD Max Exclusive Facet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.impl.XSDMaxExclusiveFacetImpl
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDMaxExclusiveFacet()
	 * @generated
	 */
	int XSD_MAX_EXCLUSIVE_FACET = 24;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MAX_EXCLUSIVE_FACET__ELEMENT = XSD_MAX_FACET__ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MAX_EXCLUSIVE_FACET__CONTAINER = XSD_MAX_FACET__CONTAINER;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MAX_EXCLUSIVE_FACET__ROOT_CONTAINER = XSD_MAX_FACET__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MAX_EXCLUSIVE_FACET__SCHEMA = XSD_MAX_FACET__SCHEMA;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MAX_EXCLUSIVE_FACET__DIAGNOSTICS = XSD_MAX_FACET__DIAGNOSTICS;

	/**
	 * The feature id for the '<em><b>Lexical Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MAX_EXCLUSIVE_FACET__LEXICAL_VALUE = XSD_MAX_FACET__LEXICAL_VALUE;

	/**
	 * The feature id for the '<em><b>Facet Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MAX_EXCLUSIVE_FACET__FACET_NAME = XSD_MAX_FACET__FACET_NAME;

	/**
	 * The feature id for the '<em><b>Effective Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MAX_EXCLUSIVE_FACET__EFFECTIVE_VALUE = XSD_MAX_FACET__EFFECTIVE_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MAX_EXCLUSIVE_FACET__ANNOTATION = XSD_MAX_FACET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Simple Type Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MAX_EXCLUSIVE_FACET__SIMPLE_TYPE_DEFINITION = XSD_MAX_FACET__SIMPLE_TYPE_DEFINITION;

	/**
	 * The feature id for the '<em><b>Fixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MAX_EXCLUSIVE_FACET__FIXED = XSD_MAX_FACET__FIXED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MAX_EXCLUSIVE_FACET__VALUE = XSD_MAX_FACET__VALUE;

	/**
	 * The feature id for the '<em><b>Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MAX_EXCLUSIVE_FACET__INCLUSIVE = XSD_MAX_FACET__INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MAX_EXCLUSIVE_FACET__EXCLUSIVE = XSD_MAX_FACET__EXCLUSIVE;

	/**
	 * The number of structural features of the '<em>XSD Max Exclusive Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MAX_EXCLUSIVE_FACET_FEATURE_COUNT = XSD_MAX_FACET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>XSD Max Exclusive Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MAX_EXCLUSIVE_FACET_OPERATION_COUNT = XSD_MAX_FACET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.impl.XSDMaxInclusiveFacetImpl <em>XSD Max Inclusive Facet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.impl.XSDMaxInclusiveFacetImpl
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDMaxInclusiveFacet()
	 * @generated
	 */
	int XSD_MAX_INCLUSIVE_FACET = 26;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MAX_INCLUSIVE_FACET__ELEMENT = XSD_MAX_FACET__ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MAX_INCLUSIVE_FACET__CONTAINER = XSD_MAX_FACET__CONTAINER;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MAX_INCLUSIVE_FACET__ROOT_CONTAINER = XSD_MAX_FACET__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MAX_INCLUSIVE_FACET__SCHEMA = XSD_MAX_FACET__SCHEMA;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MAX_INCLUSIVE_FACET__DIAGNOSTICS = XSD_MAX_FACET__DIAGNOSTICS;

	/**
	 * The feature id for the '<em><b>Lexical Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MAX_INCLUSIVE_FACET__LEXICAL_VALUE = XSD_MAX_FACET__LEXICAL_VALUE;

	/**
	 * The feature id for the '<em><b>Facet Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MAX_INCLUSIVE_FACET__FACET_NAME = XSD_MAX_FACET__FACET_NAME;

	/**
	 * The feature id for the '<em><b>Effective Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MAX_INCLUSIVE_FACET__EFFECTIVE_VALUE = XSD_MAX_FACET__EFFECTIVE_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MAX_INCLUSIVE_FACET__ANNOTATION = XSD_MAX_FACET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Simple Type Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MAX_INCLUSIVE_FACET__SIMPLE_TYPE_DEFINITION = XSD_MAX_FACET__SIMPLE_TYPE_DEFINITION;

	/**
	 * The feature id for the '<em><b>Fixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MAX_INCLUSIVE_FACET__FIXED = XSD_MAX_FACET__FIXED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MAX_INCLUSIVE_FACET__VALUE = XSD_MAX_FACET__VALUE;

	/**
	 * The feature id for the '<em><b>Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MAX_INCLUSIVE_FACET__INCLUSIVE = XSD_MAX_FACET__INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MAX_INCLUSIVE_FACET__EXCLUSIVE = XSD_MAX_FACET__EXCLUSIVE;

	/**
	 * The number of structural features of the '<em>XSD Max Inclusive Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MAX_INCLUSIVE_FACET_FEATURE_COUNT = XSD_MAX_FACET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>XSD Max Inclusive Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MAX_INCLUSIVE_FACET_OPERATION_COUNT = XSD_MAX_FACET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.impl.XSDMaxLengthFacetImpl <em>XSD Max Length Facet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.impl.XSDMaxLengthFacetImpl
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDMaxLengthFacet()
	 * @generated
	 */
	int XSD_MAX_LENGTH_FACET = 27;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MAX_LENGTH_FACET__ELEMENT = XSD_FIXED_FACET__ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MAX_LENGTH_FACET__CONTAINER = XSD_FIXED_FACET__CONTAINER;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MAX_LENGTH_FACET__ROOT_CONTAINER = XSD_FIXED_FACET__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MAX_LENGTH_FACET__SCHEMA = XSD_FIXED_FACET__SCHEMA;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MAX_LENGTH_FACET__DIAGNOSTICS = XSD_FIXED_FACET__DIAGNOSTICS;

	/**
	 * The feature id for the '<em><b>Lexical Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MAX_LENGTH_FACET__LEXICAL_VALUE = XSD_FIXED_FACET__LEXICAL_VALUE;

	/**
	 * The feature id for the '<em><b>Facet Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MAX_LENGTH_FACET__FACET_NAME = XSD_FIXED_FACET__FACET_NAME;

	/**
	 * The feature id for the '<em><b>Effective Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MAX_LENGTH_FACET__EFFECTIVE_VALUE = XSD_FIXED_FACET__EFFECTIVE_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MAX_LENGTH_FACET__ANNOTATION = XSD_FIXED_FACET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Simple Type Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MAX_LENGTH_FACET__SIMPLE_TYPE_DEFINITION = XSD_FIXED_FACET__SIMPLE_TYPE_DEFINITION;

	/**
	 * The feature id for the '<em><b>Fixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MAX_LENGTH_FACET__FIXED = XSD_FIXED_FACET__FIXED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MAX_LENGTH_FACET__VALUE = XSD_FIXED_FACET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XSD Max Length Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MAX_LENGTH_FACET_FEATURE_COUNT = XSD_FIXED_FACET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>XSD Max Length Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MAX_LENGTH_FACET_OPERATION_COUNT = XSD_FIXED_FACET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.impl.XSDMinFacetImpl <em>XSD Min Facet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.impl.XSDMinFacetImpl
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDMinFacet()
	 * @generated
	 */
	int XSD_MIN_FACET = 29;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MIN_FACET__ELEMENT = XSD_FIXED_FACET__ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MIN_FACET__CONTAINER = XSD_FIXED_FACET__CONTAINER;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MIN_FACET__ROOT_CONTAINER = XSD_FIXED_FACET__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MIN_FACET__SCHEMA = XSD_FIXED_FACET__SCHEMA;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MIN_FACET__DIAGNOSTICS = XSD_FIXED_FACET__DIAGNOSTICS;

	/**
	 * The feature id for the '<em><b>Lexical Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MIN_FACET__LEXICAL_VALUE = XSD_FIXED_FACET__LEXICAL_VALUE;

	/**
	 * The feature id for the '<em><b>Facet Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MIN_FACET__FACET_NAME = XSD_FIXED_FACET__FACET_NAME;

	/**
	 * The feature id for the '<em><b>Effective Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MIN_FACET__EFFECTIVE_VALUE = XSD_FIXED_FACET__EFFECTIVE_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MIN_FACET__ANNOTATION = XSD_FIXED_FACET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Simple Type Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MIN_FACET__SIMPLE_TYPE_DEFINITION = XSD_FIXED_FACET__SIMPLE_TYPE_DEFINITION;

	/**
	 * The feature id for the '<em><b>Fixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MIN_FACET__FIXED = XSD_FIXED_FACET__FIXED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MIN_FACET__VALUE = XSD_FIXED_FACET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MIN_FACET__INCLUSIVE = XSD_FIXED_FACET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MIN_FACET__EXCLUSIVE = XSD_FIXED_FACET_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>XSD Min Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MIN_FACET_FEATURE_COUNT = XSD_FIXED_FACET_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>XSD Min Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MIN_FACET_OPERATION_COUNT = XSD_FIXED_FACET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.impl.XSDMinExclusiveFacetImpl <em>XSD Min Exclusive Facet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.impl.XSDMinExclusiveFacetImpl
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDMinExclusiveFacet()
	 * @generated
	 */
	int XSD_MIN_EXCLUSIVE_FACET = 28;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MIN_EXCLUSIVE_FACET__ELEMENT = XSD_MIN_FACET__ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MIN_EXCLUSIVE_FACET__CONTAINER = XSD_MIN_FACET__CONTAINER;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MIN_EXCLUSIVE_FACET__ROOT_CONTAINER = XSD_MIN_FACET__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MIN_EXCLUSIVE_FACET__SCHEMA = XSD_MIN_FACET__SCHEMA;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MIN_EXCLUSIVE_FACET__DIAGNOSTICS = XSD_MIN_FACET__DIAGNOSTICS;

	/**
	 * The feature id for the '<em><b>Lexical Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MIN_EXCLUSIVE_FACET__LEXICAL_VALUE = XSD_MIN_FACET__LEXICAL_VALUE;

	/**
	 * The feature id for the '<em><b>Facet Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MIN_EXCLUSIVE_FACET__FACET_NAME = XSD_MIN_FACET__FACET_NAME;

	/**
	 * The feature id for the '<em><b>Effective Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MIN_EXCLUSIVE_FACET__EFFECTIVE_VALUE = XSD_MIN_FACET__EFFECTIVE_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MIN_EXCLUSIVE_FACET__ANNOTATION = XSD_MIN_FACET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Simple Type Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MIN_EXCLUSIVE_FACET__SIMPLE_TYPE_DEFINITION = XSD_MIN_FACET__SIMPLE_TYPE_DEFINITION;

	/**
	 * The feature id for the '<em><b>Fixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MIN_EXCLUSIVE_FACET__FIXED = XSD_MIN_FACET__FIXED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MIN_EXCLUSIVE_FACET__VALUE = XSD_MIN_FACET__VALUE;

	/**
	 * The feature id for the '<em><b>Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MIN_EXCLUSIVE_FACET__INCLUSIVE = XSD_MIN_FACET__INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MIN_EXCLUSIVE_FACET__EXCLUSIVE = XSD_MIN_FACET__EXCLUSIVE;

	/**
	 * The number of structural features of the '<em>XSD Min Exclusive Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MIN_EXCLUSIVE_FACET_FEATURE_COUNT = XSD_MIN_FACET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>XSD Min Exclusive Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MIN_EXCLUSIVE_FACET_OPERATION_COUNT = XSD_MIN_FACET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.impl.XSDMinInclusiveFacetImpl <em>XSD Min Inclusive Facet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.impl.XSDMinInclusiveFacetImpl
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDMinInclusiveFacet()
	 * @generated
	 */
	int XSD_MIN_INCLUSIVE_FACET = 30;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MIN_INCLUSIVE_FACET__ELEMENT = XSD_MIN_FACET__ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MIN_INCLUSIVE_FACET__CONTAINER = XSD_MIN_FACET__CONTAINER;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MIN_INCLUSIVE_FACET__ROOT_CONTAINER = XSD_MIN_FACET__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MIN_INCLUSIVE_FACET__SCHEMA = XSD_MIN_FACET__SCHEMA;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MIN_INCLUSIVE_FACET__DIAGNOSTICS = XSD_MIN_FACET__DIAGNOSTICS;

	/**
	 * The feature id for the '<em><b>Lexical Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MIN_INCLUSIVE_FACET__LEXICAL_VALUE = XSD_MIN_FACET__LEXICAL_VALUE;

	/**
	 * The feature id for the '<em><b>Facet Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MIN_INCLUSIVE_FACET__FACET_NAME = XSD_MIN_FACET__FACET_NAME;

	/**
	 * The feature id for the '<em><b>Effective Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MIN_INCLUSIVE_FACET__EFFECTIVE_VALUE = XSD_MIN_FACET__EFFECTIVE_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MIN_INCLUSIVE_FACET__ANNOTATION = XSD_MIN_FACET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Simple Type Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MIN_INCLUSIVE_FACET__SIMPLE_TYPE_DEFINITION = XSD_MIN_FACET__SIMPLE_TYPE_DEFINITION;

	/**
	 * The feature id for the '<em><b>Fixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MIN_INCLUSIVE_FACET__FIXED = XSD_MIN_FACET__FIXED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MIN_INCLUSIVE_FACET__VALUE = XSD_MIN_FACET__VALUE;

	/**
	 * The feature id for the '<em><b>Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MIN_INCLUSIVE_FACET__INCLUSIVE = XSD_MIN_FACET__INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MIN_INCLUSIVE_FACET__EXCLUSIVE = XSD_MIN_FACET__EXCLUSIVE;

	/**
	 * The number of structural features of the '<em>XSD Min Inclusive Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MIN_INCLUSIVE_FACET_FEATURE_COUNT = XSD_MIN_FACET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>XSD Min Inclusive Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MIN_INCLUSIVE_FACET_OPERATION_COUNT = XSD_MIN_FACET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.impl.XSDMinLengthFacetImpl <em>XSD Min Length Facet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.impl.XSDMinLengthFacetImpl
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDMinLengthFacet()
	 * @generated
	 */
	int XSD_MIN_LENGTH_FACET = 31;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MIN_LENGTH_FACET__ELEMENT = XSD_FIXED_FACET__ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MIN_LENGTH_FACET__CONTAINER = XSD_FIXED_FACET__CONTAINER;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MIN_LENGTH_FACET__ROOT_CONTAINER = XSD_FIXED_FACET__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MIN_LENGTH_FACET__SCHEMA = XSD_FIXED_FACET__SCHEMA;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MIN_LENGTH_FACET__DIAGNOSTICS = XSD_FIXED_FACET__DIAGNOSTICS;

	/**
	 * The feature id for the '<em><b>Lexical Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MIN_LENGTH_FACET__LEXICAL_VALUE = XSD_FIXED_FACET__LEXICAL_VALUE;

	/**
	 * The feature id for the '<em><b>Facet Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MIN_LENGTH_FACET__FACET_NAME = XSD_FIXED_FACET__FACET_NAME;

	/**
	 * The feature id for the '<em><b>Effective Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MIN_LENGTH_FACET__EFFECTIVE_VALUE = XSD_FIXED_FACET__EFFECTIVE_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MIN_LENGTH_FACET__ANNOTATION = XSD_FIXED_FACET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Simple Type Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MIN_LENGTH_FACET__SIMPLE_TYPE_DEFINITION = XSD_FIXED_FACET__SIMPLE_TYPE_DEFINITION;

	/**
	 * The feature id for the '<em><b>Fixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MIN_LENGTH_FACET__FIXED = XSD_FIXED_FACET__FIXED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MIN_LENGTH_FACET__VALUE = XSD_FIXED_FACET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XSD Min Length Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MIN_LENGTH_FACET_FEATURE_COUNT = XSD_FIXED_FACET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>XSD Min Length Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MIN_LENGTH_FACET_OPERATION_COUNT = XSD_FIXED_FACET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.impl.XSDTermImpl <em>XSD Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.impl.XSDTermImpl
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDTerm()
	 * @generated
	 */
	int XSD_TERM = 51;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_TERM__ELEMENT = XSD_COMPONENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_TERM__CONTAINER = XSD_COMPONENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_TERM__ROOT_CONTAINER = XSD_COMPONENT__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_TERM__SCHEMA = XSD_COMPONENT__SCHEMA;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_TERM__DIAGNOSTICS = XSD_COMPONENT__DIAGNOSTICS;

	/**
	 * The number of structural features of the '<em>XSD Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_TERM_FEATURE_COUNT = XSD_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>XSD Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_TERM_OPERATION_COUNT = XSD_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.impl.XSDModelGroupImpl <em>XSD Model Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.impl.XSDModelGroupImpl
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDModelGroup()
	 * @generated
	 */
	int XSD_MODEL_GROUP = 32;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MODEL_GROUP__ELEMENT = XSD_TERM__ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MODEL_GROUP__CONTAINER = XSD_TERM__CONTAINER;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MODEL_GROUP__ROOT_CONTAINER = XSD_TERM__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MODEL_GROUP__SCHEMA = XSD_TERM__SCHEMA;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MODEL_GROUP__DIAGNOSTICS = XSD_TERM__DIAGNOSTICS;

	/**
	 * The feature id for the '<em><b>Compositor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MODEL_GROUP__COMPOSITOR = XSD_TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MODEL_GROUP__ANNOTATION = XSD_TERM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MODEL_GROUP__CONTENTS = XSD_TERM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Particles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MODEL_GROUP__PARTICLES = XSD_TERM_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>XSD Model Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MODEL_GROUP_FEATURE_COUNT = XSD_TERM_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>XSD Model Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MODEL_GROUP_OPERATION_COUNT = XSD_TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.impl.XSDModelGroupDefinitionImpl <em>XSD Model Group Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.impl.XSDModelGroupDefinitionImpl
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDModelGroupDefinition()
	 * @generated
	 */
	int XSD_MODEL_GROUP_DEFINITION = 33;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MODEL_GROUP_DEFINITION__ELEMENT = XSD_REDEFINABLE_COMPONENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MODEL_GROUP_DEFINITION__CONTAINER = XSD_REDEFINABLE_COMPONENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MODEL_GROUP_DEFINITION__ROOT_CONTAINER = XSD_REDEFINABLE_COMPONENT__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MODEL_GROUP_DEFINITION__SCHEMA = XSD_REDEFINABLE_COMPONENT__SCHEMA;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MODEL_GROUP_DEFINITION__DIAGNOSTICS = XSD_REDEFINABLE_COMPONENT__DIAGNOSTICS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MODEL_GROUP_DEFINITION__NAME = XSD_REDEFINABLE_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MODEL_GROUP_DEFINITION__TARGET_NAMESPACE = XSD_REDEFINABLE_COMPONENT__TARGET_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MODEL_GROUP_DEFINITION__ALIAS_NAME = XSD_REDEFINABLE_COMPONENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MODEL_GROUP_DEFINITION__URI = XSD_REDEFINABLE_COMPONENT__URI;

	/**
	 * The feature id for the '<em><b>Alias URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MODEL_GROUP_DEFINITION__ALIAS_URI = XSD_REDEFINABLE_COMPONENT__ALIAS_URI;

	/**
	 * The feature id for the '<em><b>QName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MODEL_GROUP_DEFINITION__QNAME = XSD_REDEFINABLE_COMPONENT__QNAME;

	/**
	 * The feature id for the '<em><b>Circular</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MODEL_GROUP_DEFINITION__CIRCULAR = XSD_REDEFINABLE_COMPONENT__CIRCULAR;

	/**
	 * The feature id for the '<em><b>Model Group Definition Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MODEL_GROUP_DEFINITION__MODEL_GROUP_DEFINITION_REFERENCE = XSD_REDEFINABLE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MODEL_GROUP_DEFINITION__ANNOTATION = XSD_REDEFINABLE_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Model Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MODEL_GROUP_DEFINITION__MODEL_GROUP = XSD_REDEFINABLE_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Resolved Model Group Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MODEL_GROUP_DEFINITION__RESOLVED_MODEL_GROUP_DEFINITION = XSD_REDEFINABLE_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>XSD Model Group Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MODEL_GROUP_DEFINITION_FEATURE_COUNT = XSD_REDEFINABLE_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>XSD Model Group Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_MODEL_GROUP_DEFINITION_OPERATION_COUNT = XSD_REDEFINABLE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.impl.XSDNotationDeclarationImpl <em>XSD Notation Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.impl.XSDNotationDeclarationImpl
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDNotationDeclaration()
	 * @generated
	 */
	int XSD_NOTATION_DECLARATION = 35;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_NOTATION_DECLARATION__ELEMENT = XSD_NAMED_COMPONENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_NOTATION_DECLARATION__CONTAINER = XSD_NAMED_COMPONENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_NOTATION_DECLARATION__ROOT_CONTAINER = XSD_NAMED_COMPONENT__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_NOTATION_DECLARATION__SCHEMA = XSD_NAMED_COMPONENT__SCHEMA;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_NOTATION_DECLARATION__DIAGNOSTICS = XSD_NAMED_COMPONENT__DIAGNOSTICS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_NOTATION_DECLARATION__NAME = XSD_NAMED_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_NOTATION_DECLARATION__TARGET_NAMESPACE = XSD_NAMED_COMPONENT__TARGET_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_NOTATION_DECLARATION__ALIAS_NAME = XSD_NAMED_COMPONENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_NOTATION_DECLARATION__URI = XSD_NAMED_COMPONENT__URI;

	/**
	 * The feature id for the '<em><b>Alias URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_NOTATION_DECLARATION__ALIAS_URI = XSD_NAMED_COMPONENT__ALIAS_URI;

	/**
	 * The feature id for the '<em><b>QName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_NOTATION_DECLARATION__QNAME = XSD_NAMED_COMPONENT__QNAME;

	/**
	 * The feature id for the '<em><b>System Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_NOTATION_DECLARATION__SYSTEM_IDENTIFIER = XSD_NAMED_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Public Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_NOTATION_DECLARATION__PUBLIC_IDENTIFIER = XSD_NAMED_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_NOTATION_DECLARATION__ANNOTATION = XSD_NAMED_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>XSD Notation Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_NOTATION_DECLARATION_FEATURE_COUNT = XSD_NAMED_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>XSD Notation Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_NOTATION_DECLARATION_OPERATION_COUNT = XSD_NAMED_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.impl.XSDNumericFacetImpl <em>XSD Numeric Facet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.impl.XSDNumericFacetImpl
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDNumericFacet()
	 * @generated
	 */
	int XSD_NUMERIC_FACET = 36;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_NUMERIC_FACET__ELEMENT = XSD_FUNDAMENTAL_FACET__ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_NUMERIC_FACET__CONTAINER = XSD_FUNDAMENTAL_FACET__CONTAINER;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_NUMERIC_FACET__ROOT_CONTAINER = XSD_FUNDAMENTAL_FACET__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_NUMERIC_FACET__SCHEMA = XSD_FUNDAMENTAL_FACET__SCHEMA;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_NUMERIC_FACET__DIAGNOSTICS = XSD_FUNDAMENTAL_FACET__DIAGNOSTICS;

	/**
	 * The feature id for the '<em><b>Lexical Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_NUMERIC_FACET__LEXICAL_VALUE = XSD_FUNDAMENTAL_FACET__LEXICAL_VALUE;

	/**
	 * The feature id for the '<em><b>Facet Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_NUMERIC_FACET__FACET_NAME = XSD_FUNDAMENTAL_FACET__FACET_NAME;

	/**
	 * The feature id for the '<em><b>Effective Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_NUMERIC_FACET__EFFECTIVE_VALUE = XSD_FUNDAMENTAL_FACET__EFFECTIVE_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_NUMERIC_FACET__ANNOTATION = XSD_FUNDAMENTAL_FACET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Simple Type Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_NUMERIC_FACET__SIMPLE_TYPE_DEFINITION = XSD_FUNDAMENTAL_FACET__SIMPLE_TYPE_DEFINITION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_NUMERIC_FACET__VALUE = XSD_FUNDAMENTAL_FACET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XSD Numeric Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_NUMERIC_FACET_FEATURE_COUNT = XSD_FUNDAMENTAL_FACET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>XSD Numeric Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_NUMERIC_FACET_OPERATION_COUNT = XSD_FUNDAMENTAL_FACET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.impl.XSDOrderedFacetImpl <em>XSD Ordered Facet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.impl.XSDOrderedFacetImpl
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDOrderedFacet()
	 * @generated
	 */
	int XSD_ORDERED_FACET = 37;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ORDERED_FACET__ELEMENT = XSD_FUNDAMENTAL_FACET__ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ORDERED_FACET__CONTAINER = XSD_FUNDAMENTAL_FACET__CONTAINER;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ORDERED_FACET__ROOT_CONTAINER = XSD_FUNDAMENTAL_FACET__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ORDERED_FACET__SCHEMA = XSD_FUNDAMENTAL_FACET__SCHEMA;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ORDERED_FACET__DIAGNOSTICS = XSD_FUNDAMENTAL_FACET__DIAGNOSTICS;

	/**
	 * The feature id for the '<em><b>Lexical Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ORDERED_FACET__LEXICAL_VALUE = XSD_FUNDAMENTAL_FACET__LEXICAL_VALUE;

	/**
	 * The feature id for the '<em><b>Facet Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ORDERED_FACET__FACET_NAME = XSD_FUNDAMENTAL_FACET__FACET_NAME;

	/**
	 * The feature id for the '<em><b>Effective Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ORDERED_FACET__EFFECTIVE_VALUE = XSD_FUNDAMENTAL_FACET__EFFECTIVE_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ORDERED_FACET__ANNOTATION = XSD_FUNDAMENTAL_FACET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Simple Type Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ORDERED_FACET__SIMPLE_TYPE_DEFINITION = XSD_FUNDAMENTAL_FACET__SIMPLE_TYPE_DEFINITION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ORDERED_FACET__VALUE = XSD_FUNDAMENTAL_FACET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XSD Ordered Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ORDERED_FACET_FEATURE_COUNT = XSD_FUNDAMENTAL_FACET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>XSD Ordered Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_ORDERED_FACET_OPERATION_COUNT = XSD_FUNDAMENTAL_FACET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.impl.XSDParticleImpl <em>XSD Particle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.impl.XSDParticleImpl
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDParticle()
	 * @generated
	 */
	int XSD_PARTICLE = 38;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_PARTICLE__ELEMENT = XSD_COMPLEX_TYPE_CONTENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_PARTICLE__CONTAINER = XSD_COMPLEX_TYPE_CONTENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_PARTICLE__ROOT_CONTAINER = XSD_COMPLEX_TYPE_CONTENT__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_PARTICLE__SCHEMA = XSD_COMPLEX_TYPE_CONTENT__SCHEMA;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_PARTICLE__DIAGNOSTICS = XSD_COMPLEX_TYPE_CONTENT__DIAGNOSTICS;

	/**
	 * The feature id for the '<em><b>Min Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_PARTICLE__MIN_OCCURS = XSD_COMPLEX_TYPE_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_PARTICLE__MAX_OCCURS = XSD_COMPLEX_TYPE_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_PARTICLE__CONTENT = XSD_COMPLEX_TYPE_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Term</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_PARTICLE__TERM = XSD_COMPLEX_TYPE_CONTENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>XSD Particle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_PARTICLE_FEATURE_COUNT = XSD_COMPLEX_TYPE_CONTENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>XSD Particle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_PARTICLE_OPERATION_COUNT = XSD_COMPLEX_TYPE_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.impl.XSDParticleContentImpl <em>XSD Particle Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.impl.XSDParticleContentImpl
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDParticleContent()
	 * @generated
	 */
	int XSD_PARTICLE_CONTENT = 39;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_PARTICLE_CONTENT__ELEMENT = XSD_CONCRETE_COMPONENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_PARTICLE_CONTENT__CONTAINER = XSD_CONCRETE_COMPONENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_PARTICLE_CONTENT__ROOT_CONTAINER = XSD_CONCRETE_COMPONENT__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_PARTICLE_CONTENT__SCHEMA = XSD_CONCRETE_COMPONENT__SCHEMA;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_PARTICLE_CONTENT__DIAGNOSTICS = XSD_CONCRETE_COMPONENT__DIAGNOSTICS;

	/**
	 * The number of structural features of the '<em>XSD Particle Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_PARTICLE_CONTENT_FEATURE_COUNT = XSD_CONCRETE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>XSD Particle Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_PARTICLE_CONTENT_OPERATION_COUNT = XSD_CONCRETE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.impl.XSDPatternFacetImpl <em>XSD Pattern Facet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.impl.XSDPatternFacetImpl
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDPatternFacet()
	 * @generated
	 */
	int XSD_PATTERN_FACET = 40;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_PATTERN_FACET__ELEMENT = XSD_REPEATABLE_FACET__ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_PATTERN_FACET__CONTAINER = XSD_REPEATABLE_FACET__CONTAINER;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_PATTERN_FACET__ROOT_CONTAINER = XSD_REPEATABLE_FACET__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_PATTERN_FACET__SCHEMA = XSD_REPEATABLE_FACET__SCHEMA;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_PATTERN_FACET__DIAGNOSTICS = XSD_REPEATABLE_FACET__DIAGNOSTICS;

	/**
	 * The feature id for the '<em><b>Lexical Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_PATTERN_FACET__LEXICAL_VALUE = XSD_REPEATABLE_FACET__LEXICAL_VALUE;

	/**
	 * The feature id for the '<em><b>Facet Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_PATTERN_FACET__FACET_NAME = XSD_REPEATABLE_FACET__FACET_NAME;

	/**
	 * The feature id for the '<em><b>Effective Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_PATTERN_FACET__EFFECTIVE_VALUE = XSD_REPEATABLE_FACET__EFFECTIVE_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_PATTERN_FACET__ANNOTATION = XSD_REPEATABLE_FACET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Simple Type Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_PATTERN_FACET__SIMPLE_TYPE_DEFINITION = XSD_REPEATABLE_FACET__SIMPLE_TYPE_DEFINITION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_PATTERN_FACET__ANNOTATIONS = XSD_REPEATABLE_FACET__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_PATTERN_FACET__VALUE = XSD_REPEATABLE_FACET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XSD Pattern Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_PATTERN_FACET_FEATURE_COUNT = XSD_REPEATABLE_FACET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>XSD Pattern Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_PATTERN_FACET_OPERATION_COUNT = XSD_REPEATABLE_FACET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.impl.XSDRedefineContentImpl <em>XSD Redefine Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.impl.XSDRedefineContentImpl
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDRedefineContent()
	 * @generated
	 */
	int XSD_REDEFINE_CONTENT = 42;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_REDEFINE_CONTENT__ELEMENT = XSD_SCHEMA_CONTENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_REDEFINE_CONTENT__CONTAINER = XSD_SCHEMA_CONTENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_REDEFINE_CONTENT__ROOT_CONTAINER = XSD_SCHEMA_CONTENT__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_REDEFINE_CONTENT__SCHEMA = XSD_SCHEMA_CONTENT__SCHEMA;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_REDEFINE_CONTENT__DIAGNOSTICS = XSD_SCHEMA_CONTENT__DIAGNOSTICS;

	/**
	 * The number of structural features of the '<em>XSD Redefine Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_REDEFINE_CONTENT_FEATURE_COUNT = XSD_SCHEMA_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>XSD Redefine Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_REDEFINE_CONTENT_OPERATION_COUNT = XSD_SCHEMA_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.impl.XSDRedefineImpl <em>XSD Redefine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.impl.XSDRedefineImpl
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDRedefine()
	 * @generated
	 */
	int XSD_REDEFINE = 43;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_REDEFINE__ELEMENT = XSD_SCHEMA_COMPOSITOR__ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_REDEFINE__CONTAINER = XSD_SCHEMA_COMPOSITOR__CONTAINER;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_REDEFINE__ROOT_CONTAINER = XSD_SCHEMA_COMPOSITOR__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_REDEFINE__SCHEMA = XSD_SCHEMA_COMPOSITOR__SCHEMA;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_REDEFINE__DIAGNOSTICS = XSD_SCHEMA_COMPOSITOR__DIAGNOSTICS;

	/**
	 * The feature id for the '<em><b>Schema Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_REDEFINE__SCHEMA_LOCATION = XSD_SCHEMA_COMPOSITOR__SCHEMA_LOCATION;

	/**
	 * The feature id for the '<em><b>Resolved Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_REDEFINE__RESOLVED_SCHEMA = XSD_SCHEMA_COMPOSITOR__RESOLVED_SCHEMA;

	/**
	 * The feature id for the '<em><b>Incorporated Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_REDEFINE__INCORPORATED_SCHEMA = XSD_SCHEMA_COMPOSITOR__INCORPORATED_SCHEMA;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_REDEFINE__ANNOTATIONS = XSD_SCHEMA_COMPOSITOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_REDEFINE__CONTENTS = XSD_SCHEMA_COMPOSITOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>XSD Redefine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_REDEFINE_FEATURE_COUNT = XSD_SCHEMA_COMPOSITOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>XSD Redefine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_REDEFINE_OPERATION_COUNT = XSD_SCHEMA_COMPOSITOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.impl.XSDScopeImpl <em>XSD Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.impl.XSDScopeImpl
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDScope()
	 * @generated
	 */
	int XSD_SCOPE = 49;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCOPE__ELEMENT = XSD_COMPONENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCOPE__CONTAINER = XSD_COMPONENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCOPE__ROOT_CONTAINER = XSD_COMPONENT__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCOPE__SCHEMA = XSD_COMPONENT__SCHEMA;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCOPE__DIAGNOSTICS = XSD_COMPONENT__DIAGNOSTICS;

	/**
	 * The number of structural features of the '<em>XSD Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCOPE_FEATURE_COUNT = XSD_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>XSD Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCOPE_OPERATION_COUNT = XSD_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.impl.XSDSchemaImpl <em>XSD Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.impl.XSDSchemaImpl
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDSchema()
	 * @generated
	 */
	int XSD_SCHEMA = 45;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCHEMA__ELEMENT = XSD_SCOPE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCHEMA__CONTAINER = XSD_SCOPE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCHEMA__ROOT_CONTAINER = XSD_SCOPE__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCHEMA__SCHEMA = XSD_SCOPE__SCHEMA;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCHEMA__DIAGNOSTICS = XSD_SCOPE__DIAGNOSTICS;

	/**
	 * The feature id for the '<em><b>Document</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCHEMA__DOCUMENT = XSD_SCOPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Schema Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCHEMA__SCHEMA_LOCATION = XSD_SCOPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCHEMA__TARGET_NAMESPACE = XSD_SCOPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attribute Form Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCHEMA__ATTRIBUTE_FORM_DEFAULT = XSD_SCOPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Element Form Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCHEMA__ELEMENT_FORM_DEFAULT = XSD_SCOPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Final Default</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCHEMA__FINAL_DEFAULT = XSD_SCOPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Block Default</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCHEMA__BLOCK_DEFAULT = XSD_SCOPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCHEMA__VERSION = XSD_SCOPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCHEMA__CONTENTS = XSD_SCOPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Element Declarations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCHEMA__ELEMENT_DECLARATIONS = XSD_SCOPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Attribute Declarations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCHEMA__ATTRIBUTE_DECLARATIONS = XSD_SCOPE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Attribute Group Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCHEMA__ATTRIBUTE_GROUP_DEFINITIONS = XSD_SCOPE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Type Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCHEMA__TYPE_DEFINITIONS = XSD_SCOPE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Model Group Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCHEMA__MODEL_GROUP_DEFINITIONS = XSD_SCOPE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Identity Constraint Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCHEMA__IDENTITY_CONSTRAINT_DEFINITIONS = XSD_SCOPE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Notation Declarations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCHEMA__NOTATION_DECLARATIONS = XSD_SCOPE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCHEMA__ANNOTATIONS = XSD_SCOPE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>All Diagnostics</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCHEMA__ALL_DIAGNOSTICS = XSD_SCOPE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Referencing Directives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCHEMA__REFERENCING_DIRECTIVES = XSD_SCOPE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Root Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCHEMA__ROOT_VERSION = XSD_SCOPE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Original Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCHEMA__ORIGINAL_VERSION = XSD_SCOPE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Incorporated Versions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCHEMA__INCORPORATED_VERSIONS = XSD_SCOPE_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Schema For Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCHEMA__SCHEMA_FOR_SCHEMA = XSD_SCOPE_FEATURE_COUNT + 22;

	/**
	 * The number of structural features of the '<em>XSD Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCHEMA_FEATURE_COUNT = XSD_SCOPE_FEATURE_COUNT + 23;

	/**
	 * The number of operations of the '<em>XSD Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SCHEMA_OPERATION_COUNT = XSD_SCOPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.impl.XSDSimpleTypeDefinitionImpl <em>XSD Simple Type Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.impl.XSDSimpleTypeDefinitionImpl
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDSimpleTypeDefinition()
	 * @generated
	 */
	int XSD_SIMPLE_TYPE_DEFINITION = 50;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SIMPLE_TYPE_DEFINITION__ELEMENT = XSD_TYPE_DEFINITION__ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SIMPLE_TYPE_DEFINITION__CONTAINER = XSD_TYPE_DEFINITION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SIMPLE_TYPE_DEFINITION__ROOT_CONTAINER = XSD_TYPE_DEFINITION__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SIMPLE_TYPE_DEFINITION__SCHEMA = XSD_TYPE_DEFINITION__SCHEMA;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SIMPLE_TYPE_DEFINITION__DIAGNOSTICS = XSD_TYPE_DEFINITION__DIAGNOSTICS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SIMPLE_TYPE_DEFINITION__NAME = XSD_TYPE_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SIMPLE_TYPE_DEFINITION__TARGET_NAMESPACE = XSD_TYPE_DEFINITION__TARGET_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SIMPLE_TYPE_DEFINITION__ALIAS_NAME = XSD_TYPE_DEFINITION__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SIMPLE_TYPE_DEFINITION__URI = XSD_TYPE_DEFINITION__URI;

	/**
	 * The feature id for the '<em><b>Alias URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SIMPLE_TYPE_DEFINITION__ALIAS_URI = XSD_TYPE_DEFINITION__ALIAS_URI;

	/**
	 * The feature id for the '<em><b>QName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SIMPLE_TYPE_DEFINITION__QNAME = XSD_TYPE_DEFINITION__QNAME;

	/**
	 * The feature id for the '<em><b>Circular</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SIMPLE_TYPE_DEFINITION__CIRCULAR = XSD_TYPE_DEFINITION__CIRCULAR;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SIMPLE_TYPE_DEFINITION__ANNOTATION = XSD_TYPE_DEFINITION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Derivation Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SIMPLE_TYPE_DEFINITION__DERIVATION_ANNOTATION = XSD_TYPE_DEFINITION__DERIVATION_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SIMPLE_TYPE_DEFINITION__ANNOTATIONS = XSD_TYPE_DEFINITION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Root Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SIMPLE_TYPE_DEFINITION__ROOT_TYPE = XSD_TYPE_DEFINITION__ROOT_TYPE;

	/**
	 * The feature id for the '<em><b>Base Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SIMPLE_TYPE_DEFINITION__BASE_TYPE = XSD_TYPE_DEFINITION__BASE_TYPE;

	/**
	 * The feature id for the '<em><b>Simple Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SIMPLE_TYPE_DEFINITION__SIMPLE_TYPE = XSD_TYPE_DEFINITION__SIMPLE_TYPE;

	/**
	 * The feature id for the '<em><b>Complex Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SIMPLE_TYPE_DEFINITION__COMPLEX_TYPE = XSD_TYPE_DEFINITION__COMPLEX_TYPE;

	/**
	 * The feature id for the '<em><b>Variety</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SIMPLE_TYPE_DEFINITION__VARIETY = XSD_TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SIMPLE_TYPE_DEFINITION__FINAL = XSD_TYPE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lexical Final</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SIMPLE_TYPE_DEFINITION__LEXICAL_FINAL = XSD_TYPE_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Valid Facets</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SIMPLE_TYPE_DEFINITION__VALID_FACETS = XSD_TYPE_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SIMPLE_TYPE_DEFINITION__CONTENTS = XSD_TYPE_DEFINITION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Facet Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SIMPLE_TYPE_DEFINITION__FACET_CONTENTS = XSD_TYPE_DEFINITION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SIMPLE_TYPE_DEFINITION__FACETS = XSD_TYPE_DEFINITION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Member Type Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SIMPLE_TYPE_DEFINITION__MEMBER_TYPE_DEFINITIONS = XSD_TYPE_DEFINITION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Fundamental Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SIMPLE_TYPE_DEFINITION__FUNDAMENTAL_FACETS = XSD_TYPE_DEFINITION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Base Type Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SIMPLE_TYPE_DEFINITION__BASE_TYPE_DEFINITION = XSD_TYPE_DEFINITION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Primitive Type Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SIMPLE_TYPE_DEFINITION__PRIMITIVE_TYPE_DEFINITION = XSD_TYPE_DEFINITION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Item Type Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SIMPLE_TYPE_DEFINITION__ITEM_TYPE_DEFINITION = XSD_TYPE_DEFINITION_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Root Type Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SIMPLE_TYPE_DEFINITION__ROOT_TYPE_DEFINITION = XSD_TYPE_DEFINITION_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Min Facet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SIMPLE_TYPE_DEFINITION__MIN_FACET = XSD_TYPE_DEFINITION_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Max Facet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SIMPLE_TYPE_DEFINITION__MAX_FACET = XSD_TYPE_DEFINITION_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Max Inclusive Facet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SIMPLE_TYPE_DEFINITION__MAX_INCLUSIVE_FACET = XSD_TYPE_DEFINITION_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Min Inclusive Facet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SIMPLE_TYPE_DEFINITION__MIN_INCLUSIVE_FACET = XSD_TYPE_DEFINITION_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Min Exclusive Facet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SIMPLE_TYPE_DEFINITION__MIN_EXCLUSIVE_FACET = XSD_TYPE_DEFINITION_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Max Exclusive Facet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SIMPLE_TYPE_DEFINITION__MAX_EXCLUSIVE_FACET = XSD_TYPE_DEFINITION_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Length Facet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SIMPLE_TYPE_DEFINITION__LENGTH_FACET = XSD_TYPE_DEFINITION_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>White Space Facet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SIMPLE_TYPE_DEFINITION__WHITE_SPACE_FACET = XSD_TYPE_DEFINITION_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Enumeration Facets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SIMPLE_TYPE_DEFINITION__ENUMERATION_FACETS = XSD_TYPE_DEFINITION_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Pattern Facets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SIMPLE_TYPE_DEFINITION__PATTERN_FACETS = XSD_TYPE_DEFINITION_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Cardinality Facet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SIMPLE_TYPE_DEFINITION__CARDINALITY_FACET = XSD_TYPE_DEFINITION_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Numeric Facet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SIMPLE_TYPE_DEFINITION__NUMERIC_FACET = XSD_TYPE_DEFINITION_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Max Length Facet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SIMPLE_TYPE_DEFINITION__MAX_LENGTH_FACET = XSD_TYPE_DEFINITION_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Min Length Facet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SIMPLE_TYPE_DEFINITION__MIN_LENGTH_FACET = XSD_TYPE_DEFINITION_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Total Digits Facet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SIMPLE_TYPE_DEFINITION__TOTAL_DIGITS_FACET = XSD_TYPE_DEFINITION_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Fraction Digits Facet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SIMPLE_TYPE_DEFINITION__FRACTION_DIGITS_FACET = XSD_TYPE_DEFINITION_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Ordered Facet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SIMPLE_TYPE_DEFINITION__ORDERED_FACET = XSD_TYPE_DEFINITION_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Bounded Facet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SIMPLE_TYPE_DEFINITION__BOUNDED_FACET = XSD_TYPE_DEFINITION_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Effective Max Facet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SIMPLE_TYPE_DEFINITION__EFFECTIVE_MAX_FACET = XSD_TYPE_DEFINITION_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Effective White Space Facet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SIMPLE_TYPE_DEFINITION__EFFECTIVE_WHITE_SPACE_FACET = XSD_TYPE_DEFINITION_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Effective Max Length Facet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SIMPLE_TYPE_DEFINITION__EFFECTIVE_MAX_LENGTH_FACET = XSD_TYPE_DEFINITION_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>Effective Fraction Digits Facet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SIMPLE_TYPE_DEFINITION__EFFECTIVE_FRACTION_DIGITS_FACET = XSD_TYPE_DEFINITION_FEATURE_COUNT + 34;

	/**
	 * The feature id for the '<em><b>Effective Pattern Facet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SIMPLE_TYPE_DEFINITION__EFFECTIVE_PATTERN_FACET = XSD_TYPE_DEFINITION_FEATURE_COUNT + 35;

	/**
	 * The feature id for the '<em><b>Effective Enumeration Facet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SIMPLE_TYPE_DEFINITION__EFFECTIVE_ENUMERATION_FACET = XSD_TYPE_DEFINITION_FEATURE_COUNT + 36;

	/**
	 * The feature id for the '<em><b>Effective Total Digits Facet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SIMPLE_TYPE_DEFINITION__EFFECTIVE_TOTAL_DIGITS_FACET = XSD_TYPE_DEFINITION_FEATURE_COUNT + 37;

	/**
	 * The feature id for the '<em><b>Effective Min Length Facet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SIMPLE_TYPE_DEFINITION__EFFECTIVE_MIN_LENGTH_FACET = XSD_TYPE_DEFINITION_FEATURE_COUNT + 38;

	/**
	 * The feature id for the '<em><b>Effective Length Facet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SIMPLE_TYPE_DEFINITION__EFFECTIVE_LENGTH_FACET = XSD_TYPE_DEFINITION_FEATURE_COUNT + 39;

	/**
	 * The feature id for the '<em><b>Effective Min Facet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SIMPLE_TYPE_DEFINITION__EFFECTIVE_MIN_FACET = XSD_TYPE_DEFINITION_FEATURE_COUNT + 40;

	/**
	 * The feature id for the '<em><b>Synthetic Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SIMPLE_TYPE_DEFINITION__SYNTHETIC_FACETS = XSD_TYPE_DEFINITION_FEATURE_COUNT + 41;

	/**
	 * The number of structural features of the '<em>XSD Simple Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SIMPLE_TYPE_DEFINITION_FEATURE_COUNT = XSD_TYPE_DEFINITION_FEATURE_COUNT + 42;

	/**
	 * The number of operations of the '<em>XSD Simple Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_SIMPLE_TYPE_DEFINITION_OPERATION_COUNT = XSD_TYPE_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.impl.XSDTotalDigitsFacetImpl <em>XSD Total Digits Facet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.impl.XSDTotalDigitsFacetImpl
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDTotalDigitsFacet()
	 * @generated
	 */
	int XSD_TOTAL_DIGITS_FACET = 52;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_TOTAL_DIGITS_FACET__ELEMENT = XSD_FIXED_FACET__ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_TOTAL_DIGITS_FACET__CONTAINER = XSD_FIXED_FACET__CONTAINER;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_TOTAL_DIGITS_FACET__ROOT_CONTAINER = XSD_FIXED_FACET__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_TOTAL_DIGITS_FACET__SCHEMA = XSD_FIXED_FACET__SCHEMA;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_TOTAL_DIGITS_FACET__DIAGNOSTICS = XSD_FIXED_FACET__DIAGNOSTICS;

	/**
	 * The feature id for the '<em><b>Lexical Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_TOTAL_DIGITS_FACET__LEXICAL_VALUE = XSD_FIXED_FACET__LEXICAL_VALUE;

	/**
	 * The feature id for the '<em><b>Facet Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_TOTAL_DIGITS_FACET__FACET_NAME = XSD_FIXED_FACET__FACET_NAME;

	/**
	 * The feature id for the '<em><b>Effective Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_TOTAL_DIGITS_FACET__EFFECTIVE_VALUE = XSD_FIXED_FACET__EFFECTIVE_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_TOTAL_DIGITS_FACET__ANNOTATION = XSD_FIXED_FACET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Simple Type Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_TOTAL_DIGITS_FACET__SIMPLE_TYPE_DEFINITION = XSD_FIXED_FACET__SIMPLE_TYPE_DEFINITION;

	/**
	 * The feature id for the '<em><b>Fixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_TOTAL_DIGITS_FACET__FIXED = XSD_FIXED_FACET__FIXED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_TOTAL_DIGITS_FACET__VALUE = XSD_FIXED_FACET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XSD Total Digits Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_TOTAL_DIGITS_FACET_FEATURE_COUNT = XSD_FIXED_FACET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>XSD Total Digits Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_TOTAL_DIGITS_FACET_OPERATION_COUNT = XSD_FIXED_FACET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.impl.XSDWhiteSpaceFacetImpl <em>XSD White Space Facet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.impl.XSDWhiteSpaceFacetImpl
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDWhiteSpaceFacet()
	 * @generated
	 */
	int XSD_WHITE_SPACE_FACET = 54;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_WHITE_SPACE_FACET__ELEMENT = XSD_FIXED_FACET__ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_WHITE_SPACE_FACET__CONTAINER = XSD_FIXED_FACET__CONTAINER;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_WHITE_SPACE_FACET__ROOT_CONTAINER = XSD_FIXED_FACET__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_WHITE_SPACE_FACET__SCHEMA = XSD_FIXED_FACET__SCHEMA;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_WHITE_SPACE_FACET__DIAGNOSTICS = XSD_FIXED_FACET__DIAGNOSTICS;

	/**
	 * The feature id for the '<em><b>Lexical Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_WHITE_SPACE_FACET__LEXICAL_VALUE = XSD_FIXED_FACET__LEXICAL_VALUE;

	/**
	 * The feature id for the '<em><b>Facet Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_WHITE_SPACE_FACET__FACET_NAME = XSD_FIXED_FACET__FACET_NAME;

	/**
	 * The feature id for the '<em><b>Effective Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_WHITE_SPACE_FACET__EFFECTIVE_VALUE = XSD_FIXED_FACET__EFFECTIVE_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_WHITE_SPACE_FACET__ANNOTATION = XSD_FIXED_FACET__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Simple Type Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_WHITE_SPACE_FACET__SIMPLE_TYPE_DEFINITION = XSD_FIXED_FACET__SIMPLE_TYPE_DEFINITION;

	/**
	 * The feature id for the '<em><b>Fixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_WHITE_SPACE_FACET__FIXED = XSD_FIXED_FACET__FIXED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_WHITE_SPACE_FACET__VALUE = XSD_FIXED_FACET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XSD White Space Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_WHITE_SPACE_FACET_FEATURE_COUNT = XSD_FIXED_FACET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>XSD White Space Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_WHITE_SPACE_FACET_OPERATION_COUNT = XSD_FIXED_FACET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.impl.XSDWildcardImpl <em>XSD Wildcard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.impl.XSDWildcardImpl
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDWildcard()
	 * @generated
	 */
	int XSD_WILDCARD = 55;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_WILDCARD__ELEMENT = XSD_TERM__ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_WILDCARD__CONTAINER = XSD_TERM__CONTAINER;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_WILDCARD__ROOT_CONTAINER = XSD_TERM__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_WILDCARD__SCHEMA = XSD_TERM__SCHEMA;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_WILDCARD__DIAGNOSTICS = XSD_TERM__DIAGNOSTICS;

	/**
	 * The feature id for the '<em><b>Namespace Constraint Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_WILDCARD__NAMESPACE_CONSTRAINT_CATEGORY = XSD_TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Namespace Constraint</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_WILDCARD__NAMESPACE_CONSTRAINT = XSD_TERM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Process Contents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_WILDCARD__PROCESS_CONTENTS = XSD_TERM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lexical Namespace Constraint</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_WILDCARD__LEXICAL_NAMESPACE_CONSTRAINT = XSD_TERM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_WILDCARD__ANNOTATION = XSD_TERM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_WILDCARD__ANNOTATIONS = XSD_TERM_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>XSD Wildcard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_WILDCARD_FEATURE_COUNT = XSD_TERM_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>XSD Wildcard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSD_WILDCARD_OPERATION_COUNT = XSD_TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.impl.XSDXPathDefinitionImpl <em>XSDX Path Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.impl.XSDXPathDefinitionImpl
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDXPathDefinition()
	 * @generated
	 */
	int XSDX_PATH_DEFINITION = 56;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSDX_PATH_DEFINITION__ELEMENT = XSD_COMPONENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSDX_PATH_DEFINITION__CONTAINER = XSD_COMPONENT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSDX_PATH_DEFINITION__ROOT_CONTAINER = XSD_COMPONENT__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSDX_PATH_DEFINITION__SCHEMA = XSD_COMPONENT__SCHEMA;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSDX_PATH_DEFINITION__DIAGNOSTICS = XSD_COMPONENT__DIAGNOSTICS;

	/**
	 * The feature id for the '<em><b>Variety</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSDX_PATH_DEFINITION__VARIETY = XSD_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSDX_PATH_DEFINITION__VALUE = XSD_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSDX_PATH_DEFINITION__ANNOTATION = XSD_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>XSDX Path Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSDX_PATH_DEFINITION_FEATURE_COUNT = XSD_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>XSDX Path Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSDX_PATH_DEFINITION_OPERATION_COUNT = XSD_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.XSDAttributeUseCategory <em>XSD Attribute Use Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.XSDAttributeUseCategory
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDAttributeUseCategory()
	 * @generated
	 */
	int XSD_ATTRIBUTE_USE_CATEGORY = 57;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.XSDCardinality <em>XSD Cardinality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.XSDCardinality
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDCardinality()
	 * @generated
	 */
	int XSD_CARDINALITY = 58;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.XSDComplexFinal <em>XSD Complex Final</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.XSDComplexFinal
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDComplexFinal()
	 * @generated
	 */
	int XSD_COMPLEX_FINAL = 59;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.XSDCompositor <em>XSD Compositor</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.XSDCompositor
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDCompositor()
	 * @generated
	 */
	int XSD_COMPOSITOR = 60;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.XSDConstraint <em>XSD Constraint</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.XSDConstraint
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDConstraint()
	 * @generated
	 */
	int XSD_CONSTRAINT = 61;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.XSDContentTypeCategory <em>XSD Content Type Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.XSDContentTypeCategory
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDContentTypeCategory()
	 * @generated
	 */
	int XSD_CONTENT_TYPE_CATEGORY = 62;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.XSDDerivationMethod <em>XSD Derivation Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.XSDDerivationMethod
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDDerivationMethod()
	 * @generated
	 */
	int XSD_DERIVATION_METHOD = 63;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.XSDDiagnosticSeverity <em>XSD Diagnostic Severity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.XSDDiagnosticSeverity
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDDiagnosticSeverity()
	 * @generated
	 */
	int XSD_DIAGNOSTIC_SEVERITY = 64;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.XSDDisallowedSubstitutions <em>XSD Disallowed Substitutions</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.XSDDisallowedSubstitutions
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDDisallowedSubstitutions()
	 * @generated
	 */
	int XSD_DISALLOWED_SUBSTITUTIONS = 65;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.XSDForm <em>XSD Form</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.XSDForm
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDForm()
	 * @generated
	 */
	int XSD_FORM = 66;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.XSDIdentityConstraintCategory <em>XSD Identity Constraint Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.XSDIdentityConstraintCategory
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDIdentityConstraintCategory()
	 * @generated
	 */
	int XSD_IDENTITY_CONSTRAINT_CATEGORY = 67;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.XSDNamespaceConstraintCategory <em>XSD Namespace Constraint Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.XSDNamespaceConstraintCategory
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDNamespaceConstraintCategory()
	 * @generated
	 */
	int XSD_NAMESPACE_CONSTRAINT_CATEGORY = 68;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.XSDOrdered <em>XSD Ordered</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.XSDOrdered
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDOrdered()
	 * @generated
	 */
	int XSD_ORDERED = 69;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.XSDProcessContents <em>XSD Process Contents</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.XSDProcessContents
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDProcessContents()
	 * @generated
	 */
	int XSD_PROCESS_CONTENTS = 70;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.XSDProhibitedSubstitutions <em>XSD Prohibited Substitutions</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.XSDProhibitedSubstitutions
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDProhibitedSubstitutions()
	 * @generated
	 */
	int XSD_PROHIBITED_SUBSTITUTIONS = 71;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.XSDSimpleFinal <em>XSD Simple Final</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.XSDSimpleFinal
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDSimpleFinal()
	 * @generated
	 */
	int XSD_SIMPLE_FINAL = 72;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.XSDSubstitutionGroupExclusions <em>XSD Substitution Group Exclusions</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.XSDSubstitutionGroupExclusions
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDSubstitutionGroupExclusions()
	 * @generated
	 */
	int XSD_SUBSTITUTION_GROUP_EXCLUSIONS = 73;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.XSDVariety <em>XSD Variety</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.XSDVariety
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDVariety()
	 * @generated
	 */
	int XSD_VARIETY = 74;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.XSDWhiteSpace <em>XSD White Space</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.XSDWhiteSpace
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDWhiteSpace()
	 * @generated
	 */
	int XSD_WHITE_SPACE = 75;

	/**
	 * The meta object id for the '{@link tesis.xsd_ecore.xsd.XSDXPathVariety <em>XSDX Path Variety</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.xsd_ecore.xsd.XSDXPathVariety
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDXPathVariety()
	 * @generated
	 */
	int XSDX_PATH_VARIETY = 76;

	/**
	 * The meta object id for the '<em>DOM Attr</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.dom.Attr
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getDOMAttr()
	 * @generated
	 */
	int DOM_ATTR = 77;

	/**
	 * The meta object id for the '<em>DOM Document</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.dom.Document
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getDOMDocument()
	 * @generated
	 */
	int DOM_DOCUMENT = 78;

	/**
	 * The meta object id for the '<em>DOM Element</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.dom.Element
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getDOMElement()
	 * @generated
	 */
	int DOM_ELEMENT = 79;

	/**
	 * The meta object id for the '<em>DOM Node</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.dom.Node
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getDOMNode()
	 * @generated
	 */
	int DOM_NODE = 80;

	/**
	 * The meta object id for the '<em>Value</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 81;


	/**
	 * Returns the meta object for class '{@link tesis.xsd_ecore.xsd.XSDAnnotation <em>XSD Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSD Annotation</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDAnnotation
	 * @generated
	 */
	EClass getXSDAnnotation();

	/**
	 * Returns the meta object for the attribute list '{@link tesis.xsd_ecore.xsd.XSDAnnotation#getApplicationInformation <em>Application Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Application Information</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDAnnotation#getApplicationInformation()
	 * @see #getXSDAnnotation()
	 * @generated
	 */
	EAttribute getXSDAnnotation_ApplicationInformation();

	/**
	 * Returns the meta object for the attribute list '{@link tesis.xsd_ecore.xsd.XSDAnnotation#getUserInformation <em>User Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>User Information</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDAnnotation#getUserInformation()
	 * @see #getXSDAnnotation()
	 * @generated
	 */
	EAttribute getXSDAnnotation_UserInformation();

	/**
	 * Returns the meta object for the attribute list '{@link tesis.xsd_ecore.xsd.XSDAnnotation#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Attributes</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDAnnotation#getAttributes()
	 * @see #getXSDAnnotation()
	 * @generated
	 */
	EAttribute getXSDAnnotation_Attributes();

	/**
	 * Returns the meta object for class '{@link tesis.xsd_ecore.xsd.XSDAttributeDeclaration <em>XSD Attribute Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSD Attribute Declaration</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDAttributeDeclaration
	 * @generated
	 */
	EClass getXSDAttributeDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDAttributeDeclaration#isAttributeDeclarationReference <em>Attribute Declaration Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute Declaration Reference</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDAttributeDeclaration#isAttributeDeclarationReference()
	 * @see #getXSDAttributeDeclaration()
	 * @generated
	 */
	EAttribute getXSDAttributeDeclaration_AttributeDeclarationReference();

	/**
	 * Returns the meta object for the containment reference '{@link tesis.xsd_ecore.xsd.XSDAttributeDeclaration#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDAttributeDeclaration#getAnnotation()
	 * @see #getXSDAttributeDeclaration()
	 * @generated
	 */
	EReference getXSDAttributeDeclaration_Annotation();

	/**
	 * Returns the meta object for the containment reference '{@link tesis.xsd_ecore.xsd.XSDAttributeDeclaration#getAnonymousTypeDefinition <em>Anonymous Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anonymous Type Definition</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDAttributeDeclaration#getAnonymousTypeDefinition()
	 * @see #getXSDAttributeDeclaration()
	 * @generated
	 */
	EReference getXSDAttributeDeclaration_AnonymousTypeDefinition();

	/**
	 * Returns the meta object for the reference '{@link tesis.xsd_ecore.xsd.XSDAttributeDeclaration#getTypeDefinition <em>Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Definition</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDAttributeDeclaration#getTypeDefinition()
	 * @see #getXSDAttributeDeclaration()
	 * @generated
	 */
	EReference getXSDAttributeDeclaration_TypeDefinition();

	/**
	 * Returns the meta object for the reference '{@link tesis.xsd_ecore.xsd.XSDAttributeDeclaration#getResolvedAttributeDeclaration <em>Resolved Attribute Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resolved Attribute Declaration</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDAttributeDeclaration#getResolvedAttributeDeclaration()
	 * @see #getXSDAttributeDeclaration()
	 * @generated
	 */
	EReference getXSDAttributeDeclaration_ResolvedAttributeDeclaration();

	/**
	 * Returns the meta object for class '{@link tesis.xsd_ecore.xsd.XSDAttributeGroupContent <em>XSD Attribute Group Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSD Attribute Group Content</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDAttributeGroupContent
	 * @generated
	 */
	EClass getXSDAttributeGroupContent();

	/**
	 * Returns the meta object for class '{@link tesis.xsd_ecore.xsd.XSDAttributeGroupDefinition <em>XSD Attribute Group Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSD Attribute Group Definition</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDAttributeGroupDefinition
	 * @generated
	 */
	EClass getXSDAttributeGroupDefinition();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDAttributeGroupDefinition#isAttributeGroupDefinitionReference <em>Attribute Group Definition Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute Group Definition Reference</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDAttributeGroupDefinition#isAttributeGroupDefinitionReference()
	 * @see #getXSDAttributeGroupDefinition()
	 * @generated
	 */
	EAttribute getXSDAttributeGroupDefinition_AttributeGroupDefinitionReference();

	/**
	 * Returns the meta object for the containment reference '{@link tesis.xsd_ecore.xsd.XSDAttributeGroupDefinition#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDAttributeGroupDefinition#getAnnotation()
	 * @see #getXSDAttributeGroupDefinition()
	 * @generated
	 */
	EReference getXSDAttributeGroupDefinition_Annotation();

	/**
	 * Returns the meta object for the containment reference list '{@link tesis.xsd_ecore.xsd.XSDAttributeGroupDefinition#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDAttributeGroupDefinition#getContents()
	 * @see #getXSDAttributeGroupDefinition()
	 * @generated
	 */
	EReference getXSDAttributeGroupDefinition_Contents();

	/**
	 * Returns the meta object for the reference list '{@link tesis.xsd_ecore.xsd.XSDAttributeGroupDefinition#getAttributeUses <em>Attribute Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attribute Uses</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDAttributeGroupDefinition#getAttributeUses()
	 * @see #getXSDAttributeGroupDefinition()
	 * @generated
	 */
	EReference getXSDAttributeGroupDefinition_AttributeUses();

	/**
	 * Returns the meta object for the containment reference '{@link tesis.xsd_ecore.xsd.XSDAttributeGroupDefinition#getAttributeWildcardContent <em>Attribute Wildcard Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attribute Wildcard Content</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDAttributeGroupDefinition#getAttributeWildcardContent()
	 * @see #getXSDAttributeGroupDefinition()
	 * @generated
	 */
	EReference getXSDAttributeGroupDefinition_AttributeWildcardContent();

	/**
	 * Returns the meta object for the reference '{@link tesis.xsd_ecore.xsd.XSDAttributeGroupDefinition#getAttributeWildcard <em>Attribute Wildcard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute Wildcard</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDAttributeGroupDefinition#getAttributeWildcard()
	 * @see #getXSDAttributeGroupDefinition()
	 * @generated
	 */
	EReference getXSDAttributeGroupDefinition_AttributeWildcard();

	/**
	 * Returns the meta object for the reference '{@link tesis.xsd_ecore.xsd.XSDAttributeGroupDefinition#getResolvedAttributeGroupDefinition <em>Resolved Attribute Group Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resolved Attribute Group Definition</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDAttributeGroupDefinition#getResolvedAttributeGroupDefinition()
	 * @see #getXSDAttributeGroupDefinition()
	 * @generated
	 */
	EReference getXSDAttributeGroupDefinition_ResolvedAttributeGroupDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link tesis.xsd_ecore.xsd.XSDAttributeGroupDefinition#getSyntheticWildcard <em>Synthetic Wildcard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Synthetic Wildcard</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDAttributeGroupDefinition#getSyntheticWildcard()
	 * @see #getXSDAttributeGroupDefinition()
	 * @generated
	 */
	EReference getXSDAttributeGroupDefinition_SyntheticWildcard();

	/**
	 * Returns the meta object for class '{@link tesis.xsd_ecore.xsd.XSDAttributeUse <em>XSD Attribute Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSD Attribute Use</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDAttributeUse
	 * @generated
	 */
	EClass getXSDAttributeUse();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDAttributeUse#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDAttributeUse#isRequired()
	 * @see #getXSDAttributeUse()
	 * @generated
	 */
	EAttribute getXSDAttributeUse_Required();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDAttributeUse#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDAttributeUse#getValue()
	 * @see #getXSDAttributeUse()
	 * @generated
	 */
	EAttribute getXSDAttributeUse_Value();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDAttributeUse#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDAttributeUse#getConstraint()
	 * @see #getXSDAttributeUse()
	 * @generated
	 */
	EAttribute getXSDAttributeUse_Constraint();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDAttributeUse#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDAttributeUse#getUse()
	 * @see #getXSDAttributeUse()
	 * @generated
	 */
	EAttribute getXSDAttributeUse_Use();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDAttributeUse#getLexicalValue <em>Lexical Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lexical Value</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDAttributeUse#getLexicalValue()
	 * @see #getXSDAttributeUse()
	 * @generated
	 */
	EAttribute getXSDAttributeUse_LexicalValue();

	/**
	 * Returns the meta object for the reference '{@link tesis.xsd_ecore.xsd.XSDAttributeUse#getAttributeDeclaration <em>Attribute Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute Declaration</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDAttributeUse#getAttributeDeclaration()
	 * @see #getXSDAttributeUse()
	 * @generated
	 */
	EReference getXSDAttributeUse_AttributeDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link tesis.xsd_ecore.xsd.XSDAttributeUse#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDAttributeUse#getContent()
	 * @see #getXSDAttributeUse()
	 * @generated
	 */
	EReference getXSDAttributeUse_Content();

	/**
	 * Returns the meta object for class '{@link tesis.xsd_ecore.xsd.XSDBoundedFacet <em>XSD Bounded Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSD Bounded Facet</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDBoundedFacet
	 * @generated
	 */
	EClass getXSDBoundedFacet();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDBoundedFacet#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDBoundedFacet#isValue()
	 * @see #getXSDBoundedFacet()
	 * @generated
	 */
	EAttribute getXSDBoundedFacet_Value();

	/**
	 * Returns the meta object for class '{@link tesis.xsd_ecore.xsd.XSDCardinalityFacet <em>XSD Cardinality Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSD Cardinality Facet</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDCardinalityFacet
	 * @generated
	 */
	EClass getXSDCardinalityFacet();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDCardinalityFacet#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDCardinalityFacet#getValue()
	 * @see #getXSDCardinalityFacet()
	 * @generated
	 */
	EAttribute getXSDCardinalityFacet_Value();

	/**
	 * Returns the meta object for class '{@link tesis.xsd_ecore.xsd.XSDComplexTypeContent <em>XSD Complex Type Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSD Complex Type Content</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDComplexTypeContent
	 * @generated
	 */
	EClass getXSDComplexTypeContent();

	/**
	 * Returns the meta object for class '{@link tesis.xsd_ecore.xsd.XSDComplexTypeDefinition <em>XSD Complex Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSD Complex Type Definition</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDComplexTypeDefinition
	 * @generated
	 */
	EClass getXSDComplexTypeDefinition();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#getDerivationMethod <em>Derivation Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Derivation Method</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#getDerivationMethod()
	 * @see #getXSDComplexTypeDefinition()
	 * @generated
	 */
	EAttribute getXSDComplexTypeDefinition_DerivationMethod();

	/**
	 * Returns the meta object for the attribute list '{@link tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#getFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Final</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#getFinal()
	 * @see #getXSDComplexTypeDefinition()
	 * @generated
	 */
	EAttribute getXSDComplexTypeDefinition_Final();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#isAbstract()
	 * @see #getXSDComplexTypeDefinition()
	 * @generated
	 */
	EAttribute getXSDComplexTypeDefinition_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#getContentTypeCategory <em>Content Type Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Type Category</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#getContentTypeCategory()
	 * @see #getXSDComplexTypeDefinition()
	 * @generated
	 */
	EAttribute getXSDComplexTypeDefinition_ContentTypeCategory();

	/**
	 * Returns the meta object for the attribute list '{@link tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#getProhibitedSubstitutions <em>Prohibited Substitutions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Prohibited Substitutions</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#getProhibitedSubstitutions()
	 * @see #getXSDComplexTypeDefinition()
	 * @generated
	 */
	EAttribute getXSDComplexTypeDefinition_ProhibitedSubstitutions();

	/**
	 * Returns the meta object for the attribute list '{@link tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#getLexicalFinal <em>Lexical Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Lexical Final</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#getLexicalFinal()
	 * @see #getXSDComplexTypeDefinition()
	 * @generated
	 */
	EAttribute getXSDComplexTypeDefinition_LexicalFinal();

	/**
	 * Returns the meta object for the attribute list '{@link tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Block</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#getBlock()
	 * @see #getXSDComplexTypeDefinition()
	 * @generated
	 */
	EAttribute getXSDComplexTypeDefinition_Block();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#isMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mixed</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#isMixed()
	 * @see #getXSDComplexTypeDefinition()
	 * @generated
	 */
	EAttribute getXSDComplexTypeDefinition_Mixed();

	/**
	 * Returns the meta object for the containment reference '{@link tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#getContentAnnotation <em>Content Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content Annotation</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#getContentAnnotation()
	 * @see #getXSDComplexTypeDefinition()
	 * @generated
	 */
	EReference getXSDComplexTypeDefinition_ContentAnnotation();

	/**
	 * Returns the meta object for the reference '{@link tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#getBaseTypeDefinition <em>Base Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Type Definition</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#getBaseTypeDefinition()
	 * @see #getXSDComplexTypeDefinition()
	 * @generated
	 */
	EReference getXSDComplexTypeDefinition_BaseTypeDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#getContent()
	 * @see #getXSDComplexTypeDefinition()
	 * @generated
	 */
	EReference getXSDComplexTypeDefinition_Content();

	/**
	 * Returns the meta object for the reference '{@link tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#getContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content Type</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#getContentType()
	 * @see #getXSDComplexTypeDefinition()
	 * @generated
	 */
	EReference getXSDComplexTypeDefinition_ContentType();

	/**
	 * Returns the meta object for the reference list '{@link tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#getAttributeUses <em>Attribute Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attribute Uses</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#getAttributeUses()
	 * @see #getXSDComplexTypeDefinition()
	 * @generated
	 */
	EReference getXSDComplexTypeDefinition_AttributeUses();

	/**
	 * Returns the meta object for the containment reference list '{@link tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#getAttributeContents <em>Attribute Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute Contents</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#getAttributeContents()
	 * @see #getXSDComplexTypeDefinition()
	 * @generated
	 */
	EReference getXSDComplexTypeDefinition_AttributeContents();

	/**
	 * Returns the meta object for the reference '{@link tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#getAttributeWildcard <em>Attribute Wildcard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute Wildcard</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#getAttributeWildcard()
	 * @see #getXSDComplexTypeDefinition()
	 * @generated
	 */
	EReference getXSDComplexTypeDefinition_AttributeWildcard();

	/**
	 * Returns the meta object for the containment reference '{@link tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#getAttributeWildcardContent <em>Attribute Wildcard Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attribute Wildcard Content</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#getAttributeWildcardContent()
	 * @see #getXSDComplexTypeDefinition()
	 * @generated
	 */
	EReference getXSDComplexTypeDefinition_AttributeWildcardContent();

	/**
	 * Returns the meta object for the reference '{@link tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#getRootTypeDefinition <em>Root Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root Type Definition</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#getRootTypeDefinition()
	 * @see #getXSDComplexTypeDefinition()
	 * @generated
	 */
	EReference getXSDComplexTypeDefinition_RootTypeDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#getSyntheticParticle <em>Synthetic Particle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Synthetic Particle</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#getSyntheticParticle()
	 * @see #getXSDComplexTypeDefinition()
	 * @generated
	 */
	EReference getXSDComplexTypeDefinition_SyntheticParticle();

	/**
	 * Returns the meta object for the containment reference '{@link tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#getSyntheticWildcard <em>Synthetic Wildcard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Synthetic Wildcard</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#getSyntheticWildcard()
	 * @see #getXSDComplexTypeDefinition()
	 * @generated
	 */
	EReference getXSDComplexTypeDefinition_SyntheticWildcard();

	/**
	 * Returns the meta object for class '{@link tesis.xsd_ecore.xsd.XSDComponent <em>XSD Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSD Component</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDComponent
	 * @generated
	 */
	EClass getXSDComponent();

	/**
	 * Returns the meta object for class '{@link tesis.xsd_ecore.xsd.XSDConcreteComponent <em>XSD Concrete Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSD Concrete Component</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDConcreteComponent
	 * @generated
	 */
	EClass getXSDConcreteComponent();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDConcreteComponent#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDConcreteComponent#getElement()
	 * @see #getXSDConcreteComponent()
	 * @generated
	 */
	EAttribute getXSDConcreteComponent_Element();

	/**
	 * Returns the meta object for the reference '{@link tesis.xsd_ecore.xsd.XSDConcreteComponent#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Container</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDConcreteComponent#getContainer()
	 * @see #getXSDConcreteComponent()
	 * @generated
	 */
	EReference getXSDConcreteComponent_Container();

	/**
	 * Returns the meta object for the reference '{@link tesis.xsd_ecore.xsd.XSDConcreteComponent#getRootContainer <em>Root Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root Container</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDConcreteComponent#getRootContainer()
	 * @see #getXSDConcreteComponent()
	 * @generated
	 */
	EReference getXSDConcreteComponent_RootContainer();

	/**
	 * Returns the meta object for the reference '{@link tesis.xsd_ecore.xsd.XSDConcreteComponent#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Schema</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDConcreteComponent#getSchema()
	 * @see #getXSDConcreteComponent()
	 * @generated
	 */
	EReference getXSDConcreteComponent_Schema();

	/**
	 * Returns the meta object for the containment reference list '{@link tesis.xsd_ecore.xsd.XSDConcreteComponent#getDiagnostics <em>Diagnostics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diagnostics</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDConcreteComponent#getDiagnostics()
	 * @see #getXSDConcreteComponent()
	 * @generated
	 */
	EReference getXSDConcreteComponent_Diagnostics();

	/**
	 * Returns the meta object for class '{@link tesis.xsd_ecore.xsd.XSDConstrainingFacet <em>XSD Constraining Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSD Constraining Facet</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDConstrainingFacet
	 * @generated
	 */
	EClass getXSDConstrainingFacet();

	/**
	 * Returns the meta object for class '{@link tesis.xsd_ecore.xsd.XSDDiagnostic <em>XSD Diagnostic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSD Diagnostic</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDDiagnostic
	 * @generated
	 */
	EClass getXSDDiagnostic();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDDiagnostic#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDDiagnostic#getSeverity()
	 * @see #getXSDDiagnostic()
	 * @generated
	 */
	EAttribute getXSDDiagnostic_Severity();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDDiagnostic#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDDiagnostic#getMessage()
	 * @see #getXSDDiagnostic()
	 * @generated
	 */
	EAttribute getXSDDiagnostic_Message();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDDiagnostic#getLocationURI <em>Location URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location URI</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDDiagnostic#getLocationURI()
	 * @see #getXSDDiagnostic()
	 * @generated
	 */
	EAttribute getXSDDiagnostic_LocationURI();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDDiagnostic#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDDiagnostic#getLine()
	 * @see #getXSDDiagnostic()
	 * @generated
	 */
	EAttribute getXSDDiagnostic_Line();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDDiagnostic#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDDiagnostic#getColumn()
	 * @see #getXSDDiagnostic()
	 * @generated
	 */
	EAttribute getXSDDiagnostic_Column();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDDiagnostic#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDDiagnostic#getNode()
	 * @see #getXSDDiagnostic()
	 * @generated
	 */
	EAttribute getXSDDiagnostic_Node();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDDiagnostic#getAnnotationURI <em>Annotation URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Annotation URI</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDDiagnostic#getAnnotationURI()
	 * @see #getXSDDiagnostic()
	 * @generated
	 */
	EAttribute getXSDDiagnostic_AnnotationURI();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDDiagnostic#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDDiagnostic#getKey()
	 * @see #getXSDDiagnostic()
	 * @generated
	 */
	EAttribute getXSDDiagnostic_Key();

	/**
	 * Returns the meta object for the attribute list '{@link tesis.xsd_ecore.xsd.XSDDiagnostic#getSubstitutions <em>Substitutions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Substitutions</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDDiagnostic#getSubstitutions()
	 * @see #getXSDDiagnostic()
	 * @generated
	 */
	EAttribute getXSDDiagnostic_Substitutions();

	/**
	 * Returns the meta object for the reference list '{@link tesis.xsd_ecore.xsd.XSDDiagnostic#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Components</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDDiagnostic#getComponents()
	 * @see #getXSDDiagnostic()
	 * @generated
	 */
	EReference getXSDDiagnostic_Components();

	/**
	 * Returns the meta object for the reference '{@link tesis.xsd_ecore.xsd.XSDDiagnostic#getPrimaryComponent <em>Primary Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Primary Component</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDDiagnostic#getPrimaryComponent()
	 * @see #getXSDDiagnostic()
	 * @generated
	 */
	EReference getXSDDiagnostic_PrimaryComponent();

	/**
	 * Returns the meta object for class '{@link tesis.xsd_ecore.xsd.XSDElementDeclaration <em>XSD Element Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSD Element Declaration</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDElementDeclaration
	 * @generated
	 */
	EClass getXSDElementDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDElementDeclaration#isNillable <em>Nillable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nillable</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDElementDeclaration#isNillable()
	 * @see #getXSDElementDeclaration()
	 * @generated
	 */
	EAttribute getXSDElementDeclaration_Nillable();

	/**
	 * Returns the meta object for the attribute list '{@link tesis.xsd_ecore.xsd.XSDElementDeclaration#getDisallowedSubstitutions <em>Disallowed Substitutions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Disallowed Substitutions</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDElementDeclaration#getDisallowedSubstitutions()
	 * @see #getXSDElementDeclaration()
	 * @generated
	 */
	EAttribute getXSDElementDeclaration_DisallowedSubstitutions();

	/**
	 * Returns the meta object for the attribute list '{@link tesis.xsd_ecore.xsd.XSDElementDeclaration#getSubstitutionGroupExclusions <em>Substitution Group Exclusions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Substitution Group Exclusions</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDElementDeclaration#getSubstitutionGroupExclusions()
	 * @see #getXSDElementDeclaration()
	 * @generated
	 */
	EAttribute getXSDElementDeclaration_SubstitutionGroupExclusions();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDElementDeclaration#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDElementDeclaration#isAbstract()
	 * @see #getXSDElementDeclaration()
	 * @generated
	 */
	EAttribute getXSDElementDeclaration_Abstract();

	/**
	 * Returns the meta object for the attribute list '{@link tesis.xsd_ecore.xsd.XSDElementDeclaration#getLexicalFinal <em>Lexical Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Lexical Final</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDElementDeclaration#getLexicalFinal()
	 * @see #getXSDElementDeclaration()
	 * @generated
	 */
	EAttribute getXSDElementDeclaration_LexicalFinal();

	/**
	 * Returns the meta object for the attribute list '{@link tesis.xsd_ecore.xsd.XSDElementDeclaration#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Block</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDElementDeclaration#getBlock()
	 * @see #getXSDElementDeclaration()
	 * @generated
	 */
	EAttribute getXSDElementDeclaration_Block();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDElementDeclaration#isElementDeclarationReference <em>Element Declaration Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Declaration Reference</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDElementDeclaration#isElementDeclarationReference()
	 * @see #getXSDElementDeclaration()
	 * @generated
	 */
	EAttribute getXSDElementDeclaration_ElementDeclarationReference();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDElementDeclaration#isCircular <em>Circular</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Circular</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDElementDeclaration#isCircular()
	 * @see #getXSDElementDeclaration()
	 * @generated
	 */
	EAttribute getXSDElementDeclaration_Circular();

	/**
	 * Returns the meta object for the containment reference '{@link tesis.xsd_ecore.xsd.XSDElementDeclaration#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDElementDeclaration#getAnnotation()
	 * @see #getXSDElementDeclaration()
	 * @generated
	 */
	EReference getXSDElementDeclaration_Annotation();

	/**
	 * Returns the meta object for the containment reference '{@link tesis.xsd_ecore.xsd.XSDElementDeclaration#getAnonymousTypeDefinition <em>Anonymous Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anonymous Type Definition</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDElementDeclaration#getAnonymousTypeDefinition()
	 * @see #getXSDElementDeclaration()
	 * @generated
	 */
	EReference getXSDElementDeclaration_AnonymousTypeDefinition();

	/**
	 * Returns the meta object for the reference '{@link tesis.xsd_ecore.xsd.XSDElementDeclaration#getTypeDefinition <em>Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Definition</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDElementDeclaration#getTypeDefinition()
	 * @see #getXSDElementDeclaration()
	 * @generated
	 */
	EReference getXSDElementDeclaration_TypeDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link tesis.xsd_ecore.xsd.XSDElementDeclaration#getIdentityConstraintDefinitions <em>Identity Constraint Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Identity Constraint Definitions</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDElementDeclaration#getIdentityConstraintDefinitions()
	 * @see #getXSDElementDeclaration()
	 * @generated
	 */
	EReference getXSDElementDeclaration_IdentityConstraintDefinitions();

	/**
	 * Returns the meta object for the reference '{@link tesis.xsd_ecore.xsd.XSDElementDeclaration#getResolvedElementDeclaration <em>Resolved Element Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resolved Element Declaration</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDElementDeclaration#getResolvedElementDeclaration()
	 * @see #getXSDElementDeclaration()
	 * @generated
	 */
	EReference getXSDElementDeclaration_ResolvedElementDeclaration();

	/**
	 * Returns the meta object for the reference '{@link tesis.xsd_ecore.xsd.XSDElementDeclaration#getSubstitutionGroupAffiliation <em>Substitution Group Affiliation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Substitution Group Affiliation</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDElementDeclaration#getSubstitutionGroupAffiliation()
	 * @see #getXSDElementDeclaration()
	 * @generated
	 */
	EReference getXSDElementDeclaration_SubstitutionGroupAffiliation();

	/**
	 * Returns the meta object for the reference list '{@link tesis.xsd_ecore.xsd.XSDElementDeclaration#getSubstitutionGroup <em>Substitution Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Substitution Group</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDElementDeclaration#getSubstitutionGroup()
	 * @see #getXSDElementDeclaration()
	 * @generated
	 */
	EReference getXSDElementDeclaration_SubstitutionGroup();

	/**
	 * Returns the meta object for class '{@link tesis.xsd_ecore.xsd.XSDEnumerationFacet <em>XSD Enumeration Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSD Enumeration Facet</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDEnumerationFacet
	 * @generated
	 */
	EClass getXSDEnumerationFacet();

	/**
	 * Returns the meta object for the attribute list '{@link tesis.xsd_ecore.xsd.XSDEnumerationFacet#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDEnumerationFacet#getValue()
	 * @see #getXSDEnumerationFacet()
	 * @generated
	 */
	EAttribute getXSDEnumerationFacet_Value();

	/**
	 * Returns the meta object for class '{@link tesis.xsd_ecore.xsd.XSDFacet <em>XSD Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSD Facet</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDFacet
	 * @generated
	 */
	EClass getXSDFacet();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDFacet#getLexicalValue <em>Lexical Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lexical Value</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDFacet#getLexicalValue()
	 * @see #getXSDFacet()
	 * @generated
	 */
	EAttribute getXSDFacet_LexicalValue();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDFacet#getFacetName <em>Facet Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Facet Name</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDFacet#getFacetName()
	 * @see #getXSDFacet()
	 * @generated
	 */
	EAttribute getXSDFacet_FacetName();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDFacet#getEffectiveValue <em>Effective Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effective Value</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDFacet#getEffectiveValue()
	 * @see #getXSDFacet()
	 * @generated
	 */
	EAttribute getXSDFacet_EffectiveValue();

	/**
	 * Returns the meta object for the containment reference '{@link tesis.xsd_ecore.xsd.XSDFacet#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDFacet#getAnnotation()
	 * @see #getXSDFacet()
	 * @generated
	 */
	EReference getXSDFacet_Annotation();

	/**
	 * Returns the meta object for the reference '{@link tesis.xsd_ecore.xsd.XSDFacet#getSimpleTypeDefinition <em>Simple Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Simple Type Definition</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDFacet#getSimpleTypeDefinition()
	 * @see #getXSDFacet()
	 * @generated
	 */
	EReference getXSDFacet_SimpleTypeDefinition();

	/**
	 * Returns the meta object for class '{@link tesis.xsd_ecore.xsd.XSDFeature <em>XSD Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSD Feature</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDFeature
	 * @generated
	 */
	EClass getXSDFeature();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDFeature#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDFeature#getValue()
	 * @see #getXSDFeature()
	 * @generated
	 */
	EAttribute getXSDFeature_Value();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDFeature#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDFeature#getConstraint()
	 * @see #getXSDFeature()
	 * @generated
	 */
	EAttribute getXSDFeature_Constraint();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDFeature#getForm <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Form</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDFeature#getForm()
	 * @see #getXSDFeature()
	 * @generated
	 */
	EAttribute getXSDFeature_Form();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDFeature#getLexicalValue <em>Lexical Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lexical Value</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDFeature#getLexicalValue()
	 * @see #getXSDFeature()
	 * @generated
	 */
	EAttribute getXSDFeature_LexicalValue();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDFeature#isGlobal <em>Global</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Global</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDFeature#isGlobal()
	 * @see #getXSDFeature()
	 * @generated
	 */
	EAttribute getXSDFeature_Global();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDFeature#isFeatureReference <em>Feature Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Reference</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDFeature#isFeatureReference()
	 * @see #getXSDFeature()
	 * @generated
	 */
	EAttribute getXSDFeature_FeatureReference();

	/**
	 * Returns the meta object for the reference '{@link tesis.xsd_ecore.xsd.XSDFeature#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scope</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDFeature#getScope()
	 * @see #getXSDFeature()
	 * @generated
	 */
	EReference getXSDFeature_Scope();

	/**
	 * Returns the meta object for the reference '{@link tesis.xsd_ecore.xsd.XSDFeature#getResolvedFeature <em>Resolved Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resolved Feature</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDFeature#getResolvedFeature()
	 * @see #getXSDFeature()
	 * @generated
	 */
	EReference getXSDFeature_ResolvedFeature();

	/**
	 * Returns the meta object for the reference '{@link tesis.xsd_ecore.xsd.XSDFeature#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDFeature#getType()
	 * @see #getXSDFeature()
	 * @generated
	 */
	EReference getXSDFeature_Type();

	/**
	 * Returns the meta object for class '{@link tesis.xsd_ecore.xsd.XSDFixedFacet <em>XSD Fixed Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSD Fixed Facet</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDFixedFacet
	 * @generated
	 */
	EClass getXSDFixedFacet();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDFixedFacet#isFixed <em>Fixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDFixedFacet#isFixed()
	 * @see #getXSDFixedFacet()
	 * @generated
	 */
	EAttribute getXSDFixedFacet_Fixed();

	/**
	 * Returns the meta object for class '{@link tesis.xsd_ecore.xsd.XSDFractionDigitsFacet <em>XSD Fraction Digits Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSD Fraction Digits Facet</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDFractionDigitsFacet
	 * @generated
	 */
	EClass getXSDFractionDigitsFacet();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDFractionDigitsFacet#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDFractionDigitsFacet#getValue()
	 * @see #getXSDFractionDigitsFacet()
	 * @generated
	 */
	EAttribute getXSDFractionDigitsFacet_Value();

	/**
	 * Returns the meta object for class '{@link tesis.xsd_ecore.xsd.XSDFundamentalFacet <em>XSD Fundamental Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSD Fundamental Facet</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDFundamentalFacet
	 * @generated
	 */
	EClass getXSDFundamentalFacet();

	/**
	 * Returns the meta object for class '{@link tesis.xsd_ecore.xsd.XSDIdentityConstraintDefinition <em>XSD Identity Constraint Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSD Identity Constraint Definition</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDIdentityConstraintDefinition
	 * @generated
	 */
	EClass getXSDIdentityConstraintDefinition();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDIdentityConstraintDefinition#getIdentityConstraintCategory <em>Identity Constraint Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identity Constraint Category</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDIdentityConstraintDefinition#getIdentityConstraintCategory()
	 * @see #getXSDIdentityConstraintDefinition()
	 * @generated
	 */
	EAttribute getXSDIdentityConstraintDefinition_IdentityConstraintCategory();

	/**
	 * Returns the meta object for the containment reference '{@link tesis.xsd_ecore.xsd.XSDIdentityConstraintDefinition#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDIdentityConstraintDefinition#getAnnotation()
	 * @see #getXSDIdentityConstraintDefinition()
	 * @generated
	 */
	EReference getXSDIdentityConstraintDefinition_Annotation();

	/**
	 * Returns the meta object for the reference '{@link tesis.xsd_ecore.xsd.XSDIdentityConstraintDefinition#getReferencedKey <em>Referenced Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Key</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDIdentityConstraintDefinition#getReferencedKey()
	 * @see #getXSDIdentityConstraintDefinition()
	 * @generated
	 */
	EReference getXSDIdentityConstraintDefinition_ReferencedKey();

	/**
	 * Returns the meta object for the containment reference '{@link tesis.xsd_ecore.xsd.XSDIdentityConstraintDefinition#getSelector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Selector</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDIdentityConstraintDefinition#getSelector()
	 * @see #getXSDIdentityConstraintDefinition()
	 * @generated
	 */
	EReference getXSDIdentityConstraintDefinition_Selector();

	/**
	 * Returns the meta object for the containment reference list '{@link tesis.xsd_ecore.xsd.XSDIdentityConstraintDefinition#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDIdentityConstraintDefinition#getFields()
	 * @see #getXSDIdentityConstraintDefinition()
	 * @generated
	 */
	EReference getXSDIdentityConstraintDefinition_Fields();

	/**
	 * Returns the meta object for class '{@link tesis.xsd_ecore.xsd.XSDImport <em>XSD Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSD Import</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDImport
	 * @generated
	 */
	EClass getXSDImport();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDImport#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDImport#getNamespace()
	 * @see #getXSDImport()
	 * @generated
	 */
	EAttribute getXSDImport_Namespace();

	/**
	 * Returns the meta object for the containment reference '{@link tesis.xsd_ecore.xsd.XSDImport#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDImport#getAnnotation()
	 * @see #getXSDImport()
	 * @generated
	 */
	EReference getXSDImport_Annotation();

	/**
	 * Returns the meta object for class '{@link tesis.xsd_ecore.xsd.XSDInclude <em>XSD Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSD Include</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDInclude
	 * @generated
	 */
	EClass getXSDInclude();

	/**
	 * Returns the meta object for the containment reference '{@link tesis.xsd_ecore.xsd.XSDInclude#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDInclude#getAnnotation()
	 * @see #getXSDInclude()
	 * @generated
	 */
	EReference getXSDInclude_Annotation();

	/**
	 * Returns the meta object for class '{@link tesis.xsd_ecore.xsd.XSDLengthFacet <em>XSD Length Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSD Length Facet</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDLengthFacet
	 * @generated
	 */
	EClass getXSDLengthFacet();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDLengthFacet#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDLengthFacet#getValue()
	 * @see #getXSDLengthFacet()
	 * @generated
	 */
	EAttribute getXSDLengthFacet_Value();

	/**
	 * Returns the meta object for class '{@link tesis.xsd_ecore.xsd.XSDMaxExclusiveFacet <em>XSD Max Exclusive Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSD Max Exclusive Facet</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDMaxExclusiveFacet
	 * @generated
	 */
	EClass getXSDMaxExclusiveFacet();

	/**
	 * Returns the meta object for class '{@link tesis.xsd_ecore.xsd.XSDMaxFacet <em>XSD Max Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSD Max Facet</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDMaxFacet
	 * @generated
	 */
	EClass getXSDMaxFacet();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDMaxFacet#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDMaxFacet#getValue()
	 * @see #getXSDMaxFacet()
	 * @generated
	 */
	EAttribute getXSDMaxFacet_Value();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDMaxFacet#isInclusive <em>Inclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inclusive</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDMaxFacet#isInclusive()
	 * @see #getXSDMaxFacet()
	 * @generated
	 */
	EAttribute getXSDMaxFacet_Inclusive();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDMaxFacet#isExclusive <em>Exclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exclusive</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDMaxFacet#isExclusive()
	 * @see #getXSDMaxFacet()
	 * @generated
	 */
	EAttribute getXSDMaxFacet_Exclusive();

	/**
	 * Returns the meta object for class '{@link tesis.xsd_ecore.xsd.XSDMaxInclusiveFacet <em>XSD Max Inclusive Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSD Max Inclusive Facet</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDMaxInclusiveFacet
	 * @generated
	 */
	EClass getXSDMaxInclusiveFacet();

	/**
	 * Returns the meta object for class '{@link tesis.xsd_ecore.xsd.XSDMaxLengthFacet <em>XSD Max Length Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSD Max Length Facet</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDMaxLengthFacet
	 * @generated
	 */
	EClass getXSDMaxLengthFacet();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDMaxLengthFacet#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDMaxLengthFacet#getValue()
	 * @see #getXSDMaxLengthFacet()
	 * @generated
	 */
	EAttribute getXSDMaxLengthFacet_Value();

	/**
	 * Returns the meta object for class '{@link tesis.xsd_ecore.xsd.XSDMinExclusiveFacet <em>XSD Min Exclusive Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSD Min Exclusive Facet</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDMinExclusiveFacet
	 * @generated
	 */
	EClass getXSDMinExclusiveFacet();

	/**
	 * Returns the meta object for class '{@link tesis.xsd_ecore.xsd.XSDMinFacet <em>XSD Min Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSD Min Facet</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDMinFacet
	 * @generated
	 */
	EClass getXSDMinFacet();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDMinFacet#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDMinFacet#getValue()
	 * @see #getXSDMinFacet()
	 * @generated
	 */
	EAttribute getXSDMinFacet_Value();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDMinFacet#isInclusive <em>Inclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inclusive</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDMinFacet#isInclusive()
	 * @see #getXSDMinFacet()
	 * @generated
	 */
	EAttribute getXSDMinFacet_Inclusive();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDMinFacet#isExclusive <em>Exclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exclusive</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDMinFacet#isExclusive()
	 * @see #getXSDMinFacet()
	 * @generated
	 */
	EAttribute getXSDMinFacet_Exclusive();

	/**
	 * Returns the meta object for class '{@link tesis.xsd_ecore.xsd.XSDMinInclusiveFacet <em>XSD Min Inclusive Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSD Min Inclusive Facet</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDMinInclusiveFacet
	 * @generated
	 */
	EClass getXSDMinInclusiveFacet();

	/**
	 * Returns the meta object for class '{@link tesis.xsd_ecore.xsd.XSDMinLengthFacet <em>XSD Min Length Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSD Min Length Facet</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDMinLengthFacet
	 * @generated
	 */
	EClass getXSDMinLengthFacet();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDMinLengthFacet#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDMinLengthFacet#getValue()
	 * @see #getXSDMinLengthFacet()
	 * @generated
	 */
	EAttribute getXSDMinLengthFacet_Value();

	/**
	 * Returns the meta object for class '{@link tesis.xsd_ecore.xsd.XSDModelGroup <em>XSD Model Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSD Model Group</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDModelGroup
	 * @generated
	 */
	EClass getXSDModelGroup();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDModelGroup#getCompositor <em>Compositor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compositor</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDModelGroup#getCompositor()
	 * @see #getXSDModelGroup()
	 * @generated
	 */
	EAttribute getXSDModelGroup_Compositor();

	/**
	 * Returns the meta object for the containment reference '{@link tesis.xsd_ecore.xsd.XSDModelGroup#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDModelGroup#getAnnotation()
	 * @see #getXSDModelGroup()
	 * @generated
	 */
	EReference getXSDModelGroup_Annotation();

	/**
	 * Returns the meta object for the containment reference list '{@link tesis.xsd_ecore.xsd.XSDModelGroup#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDModelGroup#getContents()
	 * @see #getXSDModelGroup()
	 * @generated
	 */
	EReference getXSDModelGroup_Contents();

	/**
	 * Returns the meta object for the reference list '{@link tesis.xsd_ecore.xsd.XSDModelGroup#getParticles <em>Particles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Particles</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDModelGroup#getParticles()
	 * @see #getXSDModelGroup()
	 * @generated
	 */
	EReference getXSDModelGroup_Particles();

	/**
	 * Returns the meta object for class '{@link tesis.xsd_ecore.xsd.XSDModelGroupDefinition <em>XSD Model Group Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSD Model Group Definition</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDModelGroupDefinition
	 * @generated
	 */
	EClass getXSDModelGroupDefinition();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDModelGroupDefinition#isModelGroupDefinitionReference <em>Model Group Definition Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Group Definition Reference</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDModelGroupDefinition#isModelGroupDefinitionReference()
	 * @see #getXSDModelGroupDefinition()
	 * @generated
	 */
	EAttribute getXSDModelGroupDefinition_ModelGroupDefinitionReference();

	/**
	 * Returns the meta object for the containment reference '{@link tesis.xsd_ecore.xsd.XSDModelGroupDefinition#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDModelGroupDefinition#getAnnotation()
	 * @see #getXSDModelGroupDefinition()
	 * @generated
	 */
	EReference getXSDModelGroupDefinition_Annotation();

	/**
	 * Returns the meta object for the containment reference '{@link tesis.xsd_ecore.xsd.XSDModelGroupDefinition#getModelGroup <em>Model Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Model Group</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDModelGroupDefinition#getModelGroup()
	 * @see #getXSDModelGroupDefinition()
	 * @generated
	 */
	EReference getXSDModelGroupDefinition_ModelGroup();

	/**
	 * Returns the meta object for the reference '{@link tesis.xsd_ecore.xsd.XSDModelGroupDefinition#getResolvedModelGroupDefinition <em>Resolved Model Group Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resolved Model Group Definition</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDModelGroupDefinition#getResolvedModelGroupDefinition()
	 * @see #getXSDModelGroupDefinition()
	 * @generated
	 */
	EReference getXSDModelGroupDefinition_ResolvedModelGroupDefinition();

	/**
	 * Returns the meta object for class '{@link tesis.xsd_ecore.xsd.XSDNamedComponent <em>XSD Named Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSD Named Component</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDNamedComponent
	 * @generated
	 */
	EClass getXSDNamedComponent();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDNamedComponent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDNamedComponent#getName()
	 * @see #getXSDNamedComponent()
	 * @generated
	 */
	EAttribute getXSDNamedComponent_Name();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDNamedComponent#getTargetNamespace <em>Target Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Namespace</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDNamedComponent#getTargetNamespace()
	 * @see #getXSDNamedComponent()
	 * @generated
	 */
	EAttribute getXSDNamedComponent_TargetNamespace();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDNamedComponent#getAliasName <em>Alias Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias Name</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDNamedComponent#getAliasName()
	 * @see #getXSDNamedComponent()
	 * @generated
	 */
	EAttribute getXSDNamedComponent_AliasName();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDNamedComponent#getURI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URI</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDNamedComponent#getURI()
	 * @see #getXSDNamedComponent()
	 * @generated
	 */
	EAttribute getXSDNamedComponent_URI();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDNamedComponent#getAliasURI <em>Alias URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias URI</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDNamedComponent#getAliasURI()
	 * @see #getXSDNamedComponent()
	 * @generated
	 */
	EAttribute getXSDNamedComponent_AliasURI();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDNamedComponent#getQName <em>QName</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>QName</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDNamedComponent#getQName()
	 * @see #getXSDNamedComponent()
	 * @generated
	 */
	EAttribute getXSDNamedComponent_QName();

	/**
	 * Returns the meta object for class '{@link tesis.xsd_ecore.xsd.XSDNotationDeclaration <em>XSD Notation Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSD Notation Declaration</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDNotationDeclaration
	 * @generated
	 */
	EClass getXSDNotationDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDNotationDeclaration#getSystemIdentifier <em>System Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Identifier</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDNotationDeclaration#getSystemIdentifier()
	 * @see #getXSDNotationDeclaration()
	 * @generated
	 */
	EAttribute getXSDNotationDeclaration_SystemIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDNotationDeclaration#getPublicIdentifier <em>Public Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Public Identifier</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDNotationDeclaration#getPublicIdentifier()
	 * @see #getXSDNotationDeclaration()
	 * @generated
	 */
	EAttribute getXSDNotationDeclaration_PublicIdentifier();

	/**
	 * Returns the meta object for the containment reference '{@link tesis.xsd_ecore.xsd.XSDNotationDeclaration#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDNotationDeclaration#getAnnotation()
	 * @see #getXSDNotationDeclaration()
	 * @generated
	 */
	EReference getXSDNotationDeclaration_Annotation();

	/**
	 * Returns the meta object for class '{@link tesis.xsd_ecore.xsd.XSDNumericFacet <em>XSD Numeric Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSD Numeric Facet</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDNumericFacet
	 * @generated
	 */
	EClass getXSDNumericFacet();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDNumericFacet#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDNumericFacet#isValue()
	 * @see #getXSDNumericFacet()
	 * @generated
	 */
	EAttribute getXSDNumericFacet_Value();

	/**
	 * Returns the meta object for class '{@link tesis.xsd_ecore.xsd.XSDOrderedFacet <em>XSD Ordered Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSD Ordered Facet</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDOrderedFacet
	 * @generated
	 */
	EClass getXSDOrderedFacet();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDOrderedFacet#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDOrderedFacet#getValue()
	 * @see #getXSDOrderedFacet()
	 * @generated
	 */
	EAttribute getXSDOrderedFacet_Value();

	/**
	 * Returns the meta object for class '{@link tesis.xsd_ecore.xsd.XSDParticle <em>XSD Particle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSD Particle</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDParticle
	 * @generated
	 */
	EClass getXSDParticle();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDParticle#getMinOccurs <em>Min Occurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Occurs</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDParticle#getMinOccurs()
	 * @see #getXSDParticle()
	 * @generated
	 */
	EAttribute getXSDParticle_MinOccurs();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDParticle#getMaxOccurs <em>Max Occurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Occurs</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDParticle#getMaxOccurs()
	 * @see #getXSDParticle()
	 * @generated
	 */
	EAttribute getXSDParticle_MaxOccurs();

	/**
	 * Returns the meta object for the containment reference '{@link tesis.xsd_ecore.xsd.XSDParticle#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDParticle#getContent()
	 * @see #getXSDParticle()
	 * @generated
	 */
	EReference getXSDParticle_Content();

	/**
	 * Returns the meta object for the reference '{@link tesis.xsd_ecore.xsd.XSDParticle#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Term</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDParticle#getTerm()
	 * @see #getXSDParticle()
	 * @generated
	 */
	EReference getXSDParticle_Term();

	/**
	 * Returns the meta object for class '{@link tesis.xsd_ecore.xsd.XSDParticleContent <em>XSD Particle Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSD Particle Content</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDParticleContent
	 * @generated
	 */
	EClass getXSDParticleContent();

	/**
	 * Returns the meta object for class '{@link tesis.xsd_ecore.xsd.XSDPatternFacet <em>XSD Pattern Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSD Pattern Facet</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDPatternFacet
	 * @generated
	 */
	EClass getXSDPatternFacet();

	/**
	 * Returns the meta object for the attribute list '{@link tesis.xsd_ecore.xsd.XSDPatternFacet#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDPatternFacet#getValue()
	 * @see #getXSDPatternFacet()
	 * @generated
	 */
	EAttribute getXSDPatternFacet_Value();

	/**
	 * Returns the meta object for class '{@link tesis.xsd_ecore.xsd.XSDRedefinableComponent <em>XSD Redefinable Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSD Redefinable Component</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDRedefinableComponent
	 * @generated
	 */
	EClass getXSDRedefinableComponent();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDRedefinableComponent#isCircular <em>Circular</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Circular</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDRedefinableComponent#isCircular()
	 * @see #getXSDRedefinableComponent()
	 * @generated
	 */
	EAttribute getXSDRedefinableComponent_Circular();

	/**
	 * Returns the meta object for class '{@link tesis.xsd_ecore.xsd.XSDRedefineContent <em>XSD Redefine Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSD Redefine Content</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDRedefineContent
	 * @generated
	 */
	EClass getXSDRedefineContent();

	/**
	 * Returns the meta object for class '{@link tesis.xsd_ecore.xsd.XSDRedefine <em>XSD Redefine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSD Redefine</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDRedefine
	 * @generated
	 */
	EClass getXSDRedefine();

	/**
	 * Returns the meta object for the reference list '{@link tesis.xsd_ecore.xsd.XSDRedefine#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Annotations</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDRedefine#getAnnotations()
	 * @see #getXSDRedefine()
	 * @generated
	 */
	EReference getXSDRedefine_Annotations();

	/**
	 * Returns the meta object for the containment reference list '{@link tesis.xsd_ecore.xsd.XSDRedefine#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDRedefine#getContents()
	 * @see #getXSDRedefine()
	 * @generated
	 */
	EReference getXSDRedefine_Contents();

	/**
	 * Returns the meta object for class '{@link tesis.xsd_ecore.xsd.XSDRepeatableFacet <em>XSD Repeatable Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSD Repeatable Facet</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDRepeatableFacet
	 * @generated
	 */
	EClass getXSDRepeatableFacet();

	/**
	 * Returns the meta object for the reference list '{@link tesis.xsd_ecore.xsd.XSDRepeatableFacet#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Annotations</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDRepeatableFacet#getAnnotations()
	 * @see #getXSDRepeatableFacet()
	 * @generated
	 */
	EReference getXSDRepeatableFacet_Annotations();

	/**
	 * Returns the meta object for class '{@link tesis.xsd_ecore.xsd.XSDSchema <em>XSD Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSD Schema</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSchema
	 * @generated
	 */
	EClass getXSDSchema();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDSchema#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Document</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSchema#getDocument()
	 * @see #getXSDSchema()
	 * @generated
	 */
	EAttribute getXSDSchema_Document();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDSchema#getSchemaLocation <em>Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Location</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSchema#getSchemaLocation()
	 * @see #getXSDSchema()
	 * @generated
	 */
	EAttribute getXSDSchema_SchemaLocation();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDSchema#getTargetNamespace <em>Target Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Namespace</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSchema#getTargetNamespace()
	 * @see #getXSDSchema()
	 * @generated
	 */
	EAttribute getXSDSchema_TargetNamespace();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDSchema#getAttributeFormDefault <em>Attribute Form Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute Form Default</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSchema#getAttributeFormDefault()
	 * @see #getXSDSchema()
	 * @generated
	 */
	EAttribute getXSDSchema_AttributeFormDefault();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDSchema#getElementFormDefault <em>Element Form Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Form Default</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSchema#getElementFormDefault()
	 * @see #getXSDSchema()
	 * @generated
	 */
	EAttribute getXSDSchema_ElementFormDefault();

	/**
	 * Returns the meta object for the attribute list '{@link tesis.xsd_ecore.xsd.XSDSchema#getFinalDefault <em>Final Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Final Default</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSchema#getFinalDefault()
	 * @see #getXSDSchema()
	 * @generated
	 */
	EAttribute getXSDSchema_FinalDefault();

	/**
	 * Returns the meta object for the attribute list '{@link tesis.xsd_ecore.xsd.XSDSchema#getBlockDefault <em>Block Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Block Default</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSchema#getBlockDefault()
	 * @see #getXSDSchema()
	 * @generated
	 */
	EAttribute getXSDSchema_BlockDefault();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDSchema#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSchema#getVersion()
	 * @see #getXSDSchema()
	 * @generated
	 */
	EAttribute getXSDSchema_Version();

	/**
	 * Returns the meta object for the containment reference list '{@link tesis.xsd_ecore.xsd.XSDSchema#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSchema#getContents()
	 * @see #getXSDSchema()
	 * @generated
	 */
	EReference getXSDSchema_Contents();

	/**
	 * Returns the meta object for the reference list '{@link tesis.xsd_ecore.xsd.XSDSchema#getElementDeclarations <em>Element Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Element Declarations</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSchema#getElementDeclarations()
	 * @see #getXSDSchema()
	 * @generated
	 */
	EReference getXSDSchema_ElementDeclarations();

	/**
	 * Returns the meta object for the reference list '{@link tesis.xsd_ecore.xsd.XSDSchema#getAttributeDeclarations <em>Attribute Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attribute Declarations</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSchema#getAttributeDeclarations()
	 * @see #getXSDSchema()
	 * @generated
	 */
	EReference getXSDSchema_AttributeDeclarations();

	/**
	 * Returns the meta object for the reference list '{@link tesis.xsd_ecore.xsd.XSDSchema#getAttributeGroupDefinitions <em>Attribute Group Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attribute Group Definitions</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSchema#getAttributeGroupDefinitions()
	 * @see #getXSDSchema()
	 * @generated
	 */
	EReference getXSDSchema_AttributeGroupDefinitions();

	/**
	 * Returns the meta object for the reference list '{@link tesis.xsd_ecore.xsd.XSDSchema#getTypeDefinitions <em>Type Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Type Definitions</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSchema#getTypeDefinitions()
	 * @see #getXSDSchema()
	 * @generated
	 */
	EReference getXSDSchema_TypeDefinitions();

	/**
	 * Returns the meta object for the reference list '{@link tesis.xsd_ecore.xsd.XSDSchema#getModelGroupDefinitions <em>Model Group Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Model Group Definitions</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSchema#getModelGroupDefinitions()
	 * @see #getXSDSchema()
	 * @generated
	 */
	EReference getXSDSchema_ModelGroupDefinitions();

	/**
	 * Returns the meta object for the reference list '{@link tesis.xsd_ecore.xsd.XSDSchema#getIdentityConstraintDefinitions <em>Identity Constraint Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Identity Constraint Definitions</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSchema#getIdentityConstraintDefinitions()
	 * @see #getXSDSchema()
	 * @generated
	 */
	EReference getXSDSchema_IdentityConstraintDefinitions();

	/**
	 * Returns the meta object for the reference list '{@link tesis.xsd_ecore.xsd.XSDSchema#getNotationDeclarations <em>Notation Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Notation Declarations</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSchema#getNotationDeclarations()
	 * @see #getXSDSchema()
	 * @generated
	 */
	EReference getXSDSchema_NotationDeclarations();

	/**
	 * Returns the meta object for the reference list '{@link tesis.xsd_ecore.xsd.XSDSchema#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Annotations</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSchema#getAnnotations()
	 * @see #getXSDSchema()
	 * @generated
	 */
	EReference getXSDSchema_Annotations();

	/**
	 * Returns the meta object for the reference list '{@link tesis.xsd_ecore.xsd.XSDSchema#getAllDiagnostics <em>All Diagnostics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Diagnostics</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSchema#getAllDiagnostics()
	 * @see #getXSDSchema()
	 * @generated
	 */
	EReference getXSDSchema_AllDiagnostics();

	/**
	 * Returns the meta object for the reference list '{@link tesis.xsd_ecore.xsd.XSDSchema#getReferencingDirectives <em>Referencing Directives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referencing Directives</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSchema#getReferencingDirectives()
	 * @see #getXSDSchema()
	 * @generated
	 */
	EReference getXSDSchema_ReferencingDirectives();

	/**
	 * Returns the meta object for the reference '{@link tesis.xsd_ecore.xsd.XSDSchema#getRootVersion <em>Root Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root Version</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSchema#getRootVersion()
	 * @see #getXSDSchema()
	 * @generated
	 */
	EReference getXSDSchema_RootVersion();

	/**
	 * Returns the meta object for the reference '{@link tesis.xsd_ecore.xsd.XSDSchema#getOriginalVersion <em>Original Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Version</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSchema#getOriginalVersion()
	 * @see #getXSDSchema()
	 * @generated
	 */
	EReference getXSDSchema_OriginalVersion();

	/**
	 * Returns the meta object for the containment reference list '{@link tesis.xsd_ecore.xsd.XSDSchema#getIncorporatedVersions <em>Incorporated Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Incorporated Versions</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSchema#getIncorporatedVersions()
	 * @see #getXSDSchema()
	 * @generated
	 */
	EReference getXSDSchema_IncorporatedVersions();

	/**
	 * Returns the meta object for the reference '{@link tesis.xsd_ecore.xsd.XSDSchema#getSchemaForSchema <em>Schema For Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Schema For Schema</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSchema#getSchemaForSchema()
	 * @see #getXSDSchema()
	 * @generated
	 */
	EReference getXSDSchema_SchemaForSchema();

	/**
	 * Returns the meta object for class '{@link tesis.xsd_ecore.xsd.XSDSchemaCompositor <em>XSD Schema Compositor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSD Schema Compositor</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSchemaCompositor
	 * @generated
	 */
	EClass getXSDSchemaCompositor();

	/**
	 * Returns the meta object for the reference '{@link tesis.xsd_ecore.xsd.XSDSchemaCompositor#getIncorporatedSchema <em>Incorporated Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Incorporated Schema</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSchemaCompositor#getIncorporatedSchema()
	 * @see #getXSDSchemaCompositor()
	 * @generated
	 */
	EReference getXSDSchemaCompositor_IncorporatedSchema();

	/**
	 * Returns the meta object for class '{@link tesis.xsd_ecore.xsd.XSDSchemaContent <em>XSD Schema Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSD Schema Content</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSchemaContent
	 * @generated
	 */
	EClass getXSDSchemaContent();

	/**
	 * Returns the meta object for class '{@link tesis.xsd_ecore.xsd.XSDSchemaDirective <em>XSD Schema Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSD Schema Directive</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSchemaDirective
	 * @generated
	 */
	EClass getXSDSchemaDirective();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDSchemaDirective#getSchemaLocation <em>Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Location</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSchemaDirective#getSchemaLocation()
	 * @see #getXSDSchemaDirective()
	 * @generated
	 */
	EAttribute getXSDSchemaDirective_SchemaLocation();

	/**
	 * Returns the meta object for the reference '{@link tesis.xsd_ecore.xsd.XSDSchemaDirective#getResolvedSchema <em>Resolved Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resolved Schema</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSchemaDirective#getResolvedSchema()
	 * @see #getXSDSchemaDirective()
	 * @generated
	 */
	EReference getXSDSchemaDirective_ResolvedSchema();

	/**
	 * Returns the meta object for class '{@link tesis.xsd_ecore.xsd.XSDScope <em>XSD Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSD Scope</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDScope
	 * @generated
	 */
	EClass getXSDScope();

	/**
	 * Returns the meta object for class '{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition <em>XSD Simple Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSD Simple Type Definition</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition
	 * @generated
	 */
	EClass getXSDSimpleTypeDefinition();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getVariety <em>Variety</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variety</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getVariety()
	 * @see #getXSDSimpleTypeDefinition()
	 * @generated
	 */
	EAttribute getXSDSimpleTypeDefinition_Variety();

	/**
	 * Returns the meta object for the attribute list '{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Final</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getFinal()
	 * @see #getXSDSimpleTypeDefinition()
	 * @generated
	 */
	EAttribute getXSDSimpleTypeDefinition_Final();

	/**
	 * Returns the meta object for the attribute list '{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getLexicalFinal <em>Lexical Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Lexical Final</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getLexicalFinal()
	 * @see #getXSDSimpleTypeDefinition()
	 * @generated
	 */
	EAttribute getXSDSimpleTypeDefinition_LexicalFinal();

	/**
	 * Returns the meta object for the attribute list '{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getValidFacets <em>Valid Facets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Valid Facets</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getValidFacets()
	 * @see #getXSDSimpleTypeDefinition()
	 * @generated
	 */
	EAttribute getXSDSimpleTypeDefinition_ValidFacets();

	/**
	 * Returns the meta object for the containment reference list '{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getContents()
	 * @see #getXSDSimpleTypeDefinition()
	 * @generated
	 */
	EReference getXSDSimpleTypeDefinition_Contents();

	/**
	 * Returns the meta object for the containment reference list '{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getFacetContents <em>Facet Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Facet Contents</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getFacetContents()
	 * @see #getXSDSimpleTypeDefinition()
	 * @generated
	 */
	EReference getXSDSimpleTypeDefinition_FacetContents();

	/**
	 * Returns the meta object for the reference list '{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getFacets <em>Facets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Facets</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getFacets()
	 * @see #getXSDSimpleTypeDefinition()
	 * @generated
	 */
	EReference getXSDSimpleTypeDefinition_Facets();

	/**
	 * Returns the meta object for the reference list '{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getMemberTypeDefinitions <em>Member Type Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Member Type Definitions</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getMemberTypeDefinitions()
	 * @see #getXSDSimpleTypeDefinition()
	 * @generated
	 */
	EReference getXSDSimpleTypeDefinition_MemberTypeDefinitions();

	/**
	 * Returns the meta object for the containment reference list '{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getFundamentalFacets <em>Fundamental Facets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fundamental Facets</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getFundamentalFacets()
	 * @see #getXSDSimpleTypeDefinition()
	 * @generated
	 */
	EReference getXSDSimpleTypeDefinition_FundamentalFacets();

	/**
	 * Returns the meta object for the reference '{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getBaseTypeDefinition <em>Base Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Type Definition</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getBaseTypeDefinition()
	 * @see #getXSDSimpleTypeDefinition()
	 * @generated
	 */
	EReference getXSDSimpleTypeDefinition_BaseTypeDefinition();

	/**
	 * Returns the meta object for the reference '{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getPrimitiveTypeDefinition <em>Primitive Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Primitive Type Definition</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getPrimitiveTypeDefinition()
	 * @see #getXSDSimpleTypeDefinition()
	 * @generated
	 */
	EReference getXSDSimpleTypeDefinition_PrimitiveTypeDefinition();

	/**
	 * Returns the meta object for the reference '{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getItemTypeDefinition <em>Item Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Item Type Definition</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getItemTypeDefinition()
	 * @see #getXSDSimpleTypeDefinition()
	 * @generated
	 */
	EReference getXSDSimpleTypeDefinition_ItemTypeDefinition();

	/**
	 * Returns the meta object for the reference '{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getRootTypeDefinition <em>Root Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root Type Definition</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getRootTypeDefinition()
	 * @see #getXSDSimpleTypeDefinition()
	 * @generated
	 */
	EReference getXSDSimpleTypeDefinition_RootTypeDefinition();

	/**
	 * Returns the meta object for the reference '{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getMinFacet <em>Min Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Min Facet</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getMinFacet()
	 * @see #getXSDSimpleTypeDefinition()
	 * @generated
	 */
	EReference getXSDSimpleTypeDefinition_MinFacet();

	/**
	 * Returns the meta object for the reference '{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getMaxFacet <em>Max Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Max Facet</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getMaxFacet()
	 * @see #getXSDSimpleTypeDefinition()
	 * @generated
	 */
	EReference getXSDSimpleTypeDefinition_MaxFacet();

	/**
	 * Returns the meta object for the reference '{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getMaxInclusiveFacet <em>Max Inclusive Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Max Inclusive Facet</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getMaxInclusiveFacet()
	 * @see #getXSDSimpleTypeDefinition()
	 * @generated
	 */
	EReference getXSDSimpleTypeDefinition_MaxInclusiveFacet();

	/**
	 * Returns the meta object for the reference '{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getMinInclusiveFacet <em>Min Inclusive Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Min Inclusive Facet</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getMinInclusiveFacet()
	 * @see #getXSDSimpleTypeDefinition()
	 * @generated
	 */
	EReference getXSDSimpleTypeDefinition_MinInclusiveFacet();

	/**
	 * Returns the meta object for the reference '{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getMinExclusiveFacet <em>Min Exclusive Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Min Exclusive Facet</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getMinExclusiveFacet()
	 * @see #getXSDSimpleTypeDefinition()
	 * @generated
	 */
	EReference getXSDSimpleTypeDefinition_MinExclusiveFacet();

	/**
	 * Returns the meta object for the reference '{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getMaxExclusiveFacet <em>Max Exclusive Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Max Exclusive Facet</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getMaxExclusiveFacet()
	 * @see #getXSDSimpleTypeDefinition()
	 * @generated
	 */
	EReference getXSDSimpleTypeDefinition_MaxExclusiveFacet();

	/**
	 * Returns the meta object for the reference '{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getLengthFacet <em>Length Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Length Facet</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getLengthFacet()
	 * @see #getXSDSimpleTypeDefinition()
	 * @generated
	 */
	EReference getXSDSimpleTypeDefinition_LengthFacet();

	/**
	 * Returns the meta object for the reference '{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getWhiteSpaceFacet <em>White Space Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>White Space Facet</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getWhiteSpaceFacet()
	 * @see #getXSDSimpleTypeDefinition()
	 * @generated
	 */
	EReference getXSDSimpleTypeDefinition_WhiteSpaceFacet();

	/**
	 * Returns the meta object for the reference list '{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getEnumerationFacets <em>Enumeration Facets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Enumeration Facets</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getEnumerationFacets()
	 * @see #getXSDSimpleTypeDefinition()
	 * @generated
	 */
	EReference getXSDSimpleTypeDefinition_EnumerationFacets();

	/**
	 * Returns the meta object for the reference list '{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getPatternFacets <em>Pattern Facets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pattern Facets</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getPatternFacets()
	 * @see #getXSDSimpleTypeDefinition()
	 * @generated
	 */
	EReference getXSDSimpleTypeDefinition_PatternFacets();

	/**
	 * Returns the meta object for the reference '{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getCardinalityFacet <em>Cardinality Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cardinality Facet</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getCardinalityFacet()
	 * @see #getXSDSimpleTypeDefinition()
	 * @generated
	 */
	EReference getXSDSimpleTypeDefinition_CardinalityFacet();

	/**
	 * Returns the meta object for the reference '{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getNumericFacet <em>Numeric Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Numeric Facet</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getNumericFacet()
	 * @see #getXSDSimpleTypeDefinition()
	 * @generated
	 */
	EReference getXSDSimpleTypeDefinition_NumericFacet();

	/**
	 * Returns the meta object for the reference '{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getMaxLengthFacet <em>Max Length Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Max Length Facet</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getMaxLengthFacet()
	 * @see #getXSDSimpleTypeDefinition()
	 * @generated
	 */
	EReference getXSDSimpleTypeDefinition_MaxLengthFacet();

	/**
	 * Returns the meta object for the reference '{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getMinLengthFacet <em>Min Length Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Min Length Facet</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getMinLengthFacet()
	 * @see #getXSDSimpleTypeDefinition()
	 * @generated
	 */
	EReference getXSDSimpleTypeDefinition_MinLengthFacet();

	/**
	 * Returns the meta object for the reference '{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getTotalDigitsFacet <em>Total Digits Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Total Digits Facet</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getTotalDigitsFacet()
	 * @see #getXSDSimpleTypeDefinition()
	 * @generated
	 */
	EReference getXSDSimpleTypeDefinition_TotalDigitsFacet();

	/**
	 * Returns the meta object for the reference '{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getFractionDigitsFacet <em>Fraction Digits Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fraction Digits Facet</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getFractionDigitsFacet()
	 * @see #getXSDSimpleTypeDefinition()
	 * @generated
	 */
	EReference getXSDSimpleTypeDefinition_FractionDigitsFacet();

	/**
	 * Returns the meta object for the reference '{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getOrderedFacet <em>Ordered Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ordered Facet</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getOrderedFacet()
	 * @see #getXSDSimpleTypeDefinition()
	 * @generated
	 */
	EReference getXSDSimpleTypeDefinition_OrderedFacet();

	/**
	 * Returns the meta object for the reference '{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getBoundedFacet <em>Bounded Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bounded Facet</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getBoundedFacet()
	 * @see #getXSDSimpleTypeDefinition()
	 * @generated
	 */
	EReference getXSDSimpleTypeDefinition_BoundedFacet();

	/**
	 * Returns the meta object for the reference '{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getEffectiveMaxFacet <em>Effective Max Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Effective Max Facet</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getEffectiveMaxFacet()
	 * @see #getXSDSimpleTypeDefinition()
	 * @generated
	 */
	EReference getXSDSimpleTypeDefinition_EffectiveMaxFacet();

	/**
	 * Returns the meta object for the reference '{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getEffectiveWhiteSpaceFacet <em>Effective White Space Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Effective White Space Facet</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getEffectiveWhiteSpaceFacet()
	 * @see #getXSDSimpleTypeDefinition()
	 * @generated
	 */
	EReference getXSDSimpleTypeDefinition_EffectiveWhiteSpaceFacet();

	/**
	 * Returns the meta object for the reference '{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getEffectiveMaxLengthFacet <em>Effective Max Length Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Effective Max Length Facet</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getEffectiveMaxLengthFacet()
	 * @see #getXSDSimpleTypeDefinition()
	 * @generated
	 */
	EReference getXSDSimpleTypeDefinition_EffectiveMaxLengthFacet();

	/**
	 * Returns the meta object for the reference '{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getEffectiveFractionDigitsFacet <em>Effective Fraction Digits Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Effective Fraction Digits Facet</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getEffectiveFractionDigitsFacet()
	 * @see #getXSDSimpleTypeDefinition()
	 * @generated
	 */
	EReference getXSDSimpleTypeDefinition_EffectiveFractionDigitsFacet();

	/**
	 * Returns the meta object for the reference '{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getEffectivePatternFacet <em>Effective Pattern Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Effective Pattern Facet</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getEffectivePatternFacet()
	 * @see #getXSDSimpleTypeDefinition()
	 * @generated
	 */
	EReference getXSDSimpleTypeDefinition_EffectivePatternFacet();

	/**
	 * Returns the meta object for the reference '{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getEffectiveEnumerationFacet <em>Effective Enumeration Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Effective Enumeration Facet</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getEffectiveEnumerationFacet()
	 * @see #getXSDSimpleTypeDefinition()
	 * @generated
	 */
	EReference getXSDSimpleTypeDefinition_EffectiveEnumerationFacet();

	/**
	 * Returns the meta object for the reference '{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getEffectiveTotalDigitsFacet <em>Effective Total Digits Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Effective Total Digits Facet</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getEffectiveTotalDigitsFacet()
	 * @see #getXSDSimpleTypeDefinition()
	 * @generated
	 */
	EReference getXSDSimpleTypeDefinition_EffectiveTotalDigitsFacet();

	/**
	 * Returns the meta object for the reference '{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getEffectiveMinLengthFacet <em>Effective Min Length Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Effective Min Length Facet</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getEffectiveMinLengthFacet()
	 * @see #getXSDSimpleTypeDefinition()
	 * @generated
	 */
	EReference getXSDSimpleTypeDefinition_EffectiveMinLengthFacet();

	/**
	 * Returns the meta object for the reference '{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getEffectiveLengthFacet <em>Effective Length Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Effective Length Facet</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getEffectiveLengthFacet()
	 * @see #getXSDSimpleTypeDefinition()
	 * @generated
	 */
	EReference getXSDSimpleTypeDefinition_EffectiveLengthFacet();

	/**
	 * Returns the meta object for the reference '{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getEffectiveMinFacet <em>Effective Min Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Effective Min Facet</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getEffectiveMinFacet()
	 * @see #getXSDSimpleTypeDefinition()
	 * @generated
	 */
	EReference getXSDSimpleTypeDefinition_EffectiveMinFacet();

	/**
	 * Returns the meta object for the containment reference list '{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getSyntheticFacets <em>Synthetic Facets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Synthetic Facets</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getSyntheticFacets()
	 * @see #getXSDSimpleTypeDefinition()
	 * @generated
	 */
	EReference getXSDSimpleTypeDefinition_SyntheticFacets();

	/**
	 * Returns the meta object for class '{@link tesis.xsd_ecore.xsd.XSDTerm <em>XSD Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSD Term</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDTerm
	 * @generated
	 */
	EClass getXSDTerm();

	/**
	 * Returns the meta object for class '{@link tesis.xsd_ecore.xsd.XSDTotalDigitsFacet <em>XSD Total Digits Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSD Total Digits Facet</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDTotalDigitsFacet
	 * @generated
	 */
	EClass getXSDTotalDigitsFacet();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDTotalDigitsFacet#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDTotalDigitsFacet#getValue()
	 * @see #getXSDTotalDigitsFacet()
	 * @generated
	 */
	EAttribute getXSDTotalDigitsFacet_Value();

	/**
	 * Returns the meta object for class '{@link tesis.xsd_ecore.xsd.XSDTypeDefinition <em>XSD Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSD Type Definition</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDTypeDefinition
	 * @generated
	 */
	EClass getXSDTypeDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link tesis.xsd_ecore.xsd.XSDTypeDefinition#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDTypeDefinition#getAnnotation()
	 * @see #getXSDTypeDefinition()
	 * @generated
	 */
	EReference getXSDTypeDefinition_Annotation();

	/**
	 * Returns the meta object for the containment reference '{@link tesis.xsd_ecore.xsd.XSDTypeDefinition#getDerivationAnnotation <em>Derivation Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Derivation Annotation</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDTypeDefinition#getDerivationAnnotation()
	 * @see #getXSDTypeDefinition()
	 * @generated
	 */
	EReference getXSDTypeDefinition_DerivationAnnotation();

	/**
	 * Returns the meta object for the reference list '{@link tesis.xsd_ecore.xsd.XSDTypeDefinition#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Annotations</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDTypeDefinition#getAnnotations()
	 * @see #getXSDTypeDefinition()
	 * @generated
	 */
	EReference getXSDTypeDefinition_Annotations();

	/**
	 * Returns the meta object for the reference '{@link tesis.xsd_ecore.xsd.XSDTypeDefinition#getRootType <em>Root Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root Type</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDTypeDefinition#getRootType()
	 * @see #getXSDTypeDefinition()
	 * @generated
	 */
	EReference getXSDTypeDefinition_RootType();

	/**
	 * Returns the meta object for the reference '{@link tesis.xsd_ecore.xsd.XSDTypeDefinition#getBaseType <em>Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Type</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDTypeDefinition#getBaseType()
	 * @see #getXSDTypeDefinition()
	 * @generated
	 */
	EReference getXSDTypeDefinition_BaseType();

	/**
	 * Returns the meta object for the reference '{@link tesis.xsd_ecore.xsd.XSDTypeDefinition#getSimpleType <em>Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Simple Type</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDTypeDefinition#getSimpleType()
	 * @see #getXSDTypeDefinition()
	 * @generated
	 */
	EReference getXSDTypeDefinition_SimpleType();

	/**
	 * Returns the meta object for the reference '{@link tesis.xsd_ecore.xsd.XSDTypeDefinition#getComplexType <em>Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Complex Type</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDTypeDefinition#getComplexType()
	 * @see #getXSDTypeDefinition()
	 * @generated
	 */
	EReference getXSDTypeDefinition_ComplexType();

	/**
	 * Returns the meta object for class '{@link tesis.xsd_ecore.xsd.XSDWhiteSpaceFacet <em>XSD White Space Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSD White Space Facet</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDWhiteSpaceFacet
	 * @generated
	 */
	EClass getXSDWhiteSpaceFacet();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDWhiteSpaceFacet#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDWhiteSpaceFacet#getValue()
	 * @see #getXSDWhiteSpaceFacet()
	 * @generated
	 */
	EAttribute getXSDWhiteSpaceFacet_Value();

	/**
	 * Returns the meta object for class '{@link tesis.xsd_ecore.xsd.XSDWildcard <em>XSD Wildcard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSD Wildcard</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDWildcard
	 * @generated
	 */
	EClass getXSDWildcard();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDWildcard#getNamespaceConstraintCategory <em>Namespace Constraint Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace Constraint Category</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDWildcard#getNamespaceConstraintCategory()
	 * @see #getXSDWildcard()
	 * @generated
	 */
	EAttribute getXSDWildcard_NamespaceConstraintCategory();

	/**
	 * Returns the meta object for the attribute list '{@link tesis.xsd_ecore.xsd.XSDWildcard#getNamespaceConstraint <em>Namespace Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Namespace Constraint</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDWildcard#getNamespaceConstraint()
	 * @see #getXSDWildcard()
	 * @generated
	 */
	EAttribute getXSDWildcard_NamespaceConstraint();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDWildcard#getProcessContents <em>Process Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Process Contents</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDWildcard#getProcessContents()
	 * @see #getXSDWildcard()
	 * @generated
	 */
	EAttribute getXSDWildcard_ProcessContents();

	/**
	 * Returns the meta object for the attribute list '{@link tesis.xsd_ecore.xsd.XSDWildcard#getLexicalNamespaceConstraint <em>Lexical Namespace Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Lexical Namespace Constraint</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDWildcard#getLexicalNamespaceConstraint()
	 * @see #getXSDWildcard()
	 * @generated
	 */
	EAttribute getXSDWildcard_LexicalNamespaceConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link tesis.xsd_ecore.xsd.XSDWildcard#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDWildcard#getAnnotation()
	 * @see #getXSDWildcard()
	 * @generated
	 */
	EReference getXSDWildcard_Annotation();

	/**
	 * Returns the meta object for the reference list '{@link tesis.xsd_ecore.xsd.XSDWildcard#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Annotations</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDWildcard#getAnnotations()
	 * @see #getXSDWildcard()
	 * @generated
	 */
	EReference getXSDWildcard_Annotations();

	/**
	 * Returns the meta object for class '{@link tesis.xsd_ecore.xsd.XSDXPathDefinition <em>XSDX Path Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSDX Path Definition</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDXPathDefinition
	 * @generated
	 */
	EClass getXSDXPathDefinition();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDXPathDefinition#getVariety <em>Variety</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variety</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDXPathDefinition#getVariety()
	 * @see #getXSDXPathDefinition()
	 * @generated
	 */
	EAttribute getXSDXPathDefinition_Variety();

	/**
	 * Returns the meta object for the attribute '{@link tesis.xsd_ecore.xsd.XSDXPathDefinition#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDXPathDefinition#getValue()
	 * @see #getXSDXPathDefinition()
	 * @generated
	 */
	EAttribute getXSDXPathDefinition_Value();

	/**
	 * Returns the meta object for the containment reference '{@link tesis.xsd_ecore.xsd.XSDXPathDefinition#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDXPathDefinition#getAnnotation()
	 * @see #getXSDXPathDefinition()
	 * @generated
	 */
	EReference getXSDXPathDefinition_Annotation();

	/**
	 * Returns the meta object for enum '{@link tesis.xsd_ecore.xsd.XSDAttributeUseCategory <em>XSD Attribute Use Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>XSD Attribute Use Category</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDAttributeUseCategory
	 * @generated
	 */
	EEnum getXSDAttributeUseCategory();

	/**
	 * Returns the meta object for enum '{@link tesis.xsd_ecore.xsd.XSDCardinality <em>XSD Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>XSD Cardinality</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDCardinality
	 * @generated
	 */
	EEnum getXSDCardinality();

	/**
	 * Returns the meta object for enum '{@link tesis.xsd_ecore.xsd.XSDComplexFinal <em>XSD Complex Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>XSD Complex Final</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDComplexFinal
	 * @generated
	 */
	EEnum getXSDComplexFinal();

	/**
	 * Returns the meta object for enum '{@link tesis.xsd_ecore.xsd.XSDCompositor <em>XSD Compositor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>XSD Compositor</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDCompositor
	 * @generated
	 */
	EEnum getXSDCompositor();

	/**
	 * Returns the meta object for enum '{@link tesis.xsd_ecore.xsd.XSDConstraint <em>XSD Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>XSD Constraint</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDConstraint
	 * @generated
	 */
	EEnum getXSDConstraint();

	/**
	 * Returns the meta object for enum '{@link tesis.xsd_ecore.xsd.XSDContentTypeCategory <em>XSD Content Type Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>XSD Content Type Category</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDContentTypeCategory
	 * @generated
	 */
	EEnum getXSDContentTypeCategory();

	/**
	 * Returns the meta object for enum '{@link tesis.xsd_ecore.xsd.XSDDerivationMethod <em>XSD Derivation Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>XSD Derivation Method</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDDerivationMethod
	 * @generated
	 */
	EEnum getXSDDerivationMethod();

	/**
	 * Returns the meta object for enum '{@link tesis.xsd_ecore.xsd.XSDDiagnosticSeverity <em>XSD Diagnostic Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>XSD Diagnostic Severity</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDDiagnosticSeverity
	 * @generated
	 */
	EEnum getXSDDiagnosticSeverity();

	/**
	 * Returns the meta object for enum '{@link tesis.xsd_ecore.xsd.XSDDisallowedSubstitutions <em>XSD Disallowed Substitutions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>XSD Disallowed Substitutions</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDDisallowedSubstitutions
	 * @generated
	 */
	EEnum getXSDDisallowedSubstitutions();

	/**
	 * Returns the meta object for enum '{@link tesis.xsd_ecore.xsd.XSDForm <em>XSD Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>XSD Form</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDForm
	 * @generated
	 */
	EEnum getXSDForm();

	/**
	 * Returns the meta object for enum '{@link tesis.xsd_ecore.xsd.XSDIdentityConstraintCategory <em>XSD Identity Constraint Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>XSD Identity Constraint Category</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDIdentityConstraintCategory
	 * @generated
	 */
	EEnum getXSDIdentityConstraintCategory();

	/**
	 * Returns the meta object for enum '{@link tesis.xsd_ecore.xsd.XSDNamespaceConstraintCategory <em>XSD Namespace Constraint Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>XSD Namespace Constraint Category</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDNamespaceConstraintCategory
	 * @generated
	 */
	EEnum getXSDNamespaceConstraintCategory();

	/**
	 * Returns the meta object for enum '{@link tesis.xsd_ecore.xsd.XSDOrdered <em>XSD Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>XSD Ordered</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDOrdered
	 * @generated
	 */
	EEnum getXSDOrdered();

	/**
	 * Returns the meta object for enum '{@link tesis.xsd_ecore.xsd.XSDProcessContents <em>XSD Process Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>XSD Process Contents</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDProcessContents
	 * @generated
	 */
	EEnum getXSDProcessContents();

	/**
	 * Returns the meta object for enum '{@link tesis.xsd_ecore.xsd.XSDProhibitedSubstitutions <em>XSD Prohibited Substitutions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>XSD Prohibited Substitutions</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDProhibitedSubstitutions
	 * @generated
	 */
	EEnum getXSDProhibitedSubstitutions();

	/**
	 * Returns the meta object for enum '{@link tesis.xsd_ecore.xsd.XSDSimpleFinal <em>XSD Simple Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>XSD Simple Final</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSimpleFinal
	 * @generated
	 */
	EEnum getXSDSimpleFinal();

	/**
	 * Returns the meta object for enum '{@link tesis.xsd_ecore.xsd.XSDSubstitutionGroupExclusions <em>XSD Substitution Group Exclusions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>XSD Substitution Group Exclusions</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDSubstitutionGroupExclusions
	 * @generated
	 */
	EEnum getXSDSubstitutionGroupExclusions();

	/**
	 * Returns the meta object for enum '{@link tesis.xsd_ecore.xsd.XSDVariety <em>XSD Variety</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>XSD Variety</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDVariety
	 * @generated
	 */
	EEnum getXSDVariety();

	/**
	 * Returns the meta object for enum '{@link tesis.xsd_ecore.xsd.XSDWhiteSpace <em>XSD White Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>XSD White Space</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDWhiteSpace
	 * @generated
	 */
	EEnum getXSDWhiteSpace();

	/**
	 * Returns the meta object for enum '{@link tesis.xsd_ecore.xsd.XSDXPathVariety <em>XSDX Path Variety</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>XSDX Path Variety</em>'.
	 * @see tesis.xsd_ecore.xsd.XSDXPathVariety
	 * @generated
	 */
	EEnum getXSDXPathVariety();

	/**
	 * Returns the meta object for data type '{@link org.w3c.dom.Attr <em>DOM Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>DOM Attr</em>'.
	 * @see org.w3c.dom.Attr
	 * @model instanceClass="org.w3c.dom.Attr"
	 * @generated
	 */
	EDataType getDOMAttr();

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
	 * Returns the meta object for data type '{@link org.w3c.dom.Node <em>DOM Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>DOM Node</em>'.
	 * @see org.w3c.dom.Node
	 * @model instanceClass="org.w3c.dom.Node"
	 * @generated
	 */
	EDataType getDOMNode();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Value</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getValue();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XsdFactory getXsdFactory();

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
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.impl.XSDAnnotationImpl <em>XSD Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.impl.XSDAnnotationImpl
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDAnnotation()
		 * @generated
		 */
		EClass XSD_ANNOTATION = eINSTANCE.getXSDAnnotation();

		/**
		 * The meta object literal for the '<em><b>Application Information</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_ANNOTATION__APPLICATION_INFORMATION = eINSTANCE.getXSDAnnotation_ApplicationInformation();

		/**
		 * The meta object literal for the '<em><b>User Information</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_ANNOTATION__USER_INFORMATION = eINSTANCE.getXSDAnnotation_UserInformation();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_ANNOTATION__ATTRIBUTES = eINSTANCE.getXSDAnnotation_Attributes();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.impl.XSDAttributeDeclarationImpl <em>XSD Attribute Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.impl.XSDAttributeDeclarationImpl
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDAttributeDeclaration()
		 * @generated
		 */
		EClass XSD_ATTRIBUTE_DECLARATION = eINSTANCE.getXSDAttributeDeclaration();

		/**
		 * The meta object literal for the '<em><b>Attribute Declaration Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_ATTRIBUTE_DECLARATION__ATTRIBUTE_DECLARATION_REFERENCE = eINSTANCE.getXSDAttributeDeclaration_AttributeDeclarationReference();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_ATTRIBUTE_DECLARATION__ANNOTATION = eINSTANCE.getXSDAttributeDeclaration_Annotation();

		/**
		 * The meta object literal for the '<em><b>Anonymous Type Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_ATTRIBUTE_DECLARATION__ANONYMOUS_TYPE_DEFINITION = eINSTANCE.getXSDAttributeDeclaration_AnonymousTypeDefinition();

		/**
		 * The meta object literal for the '<em><b>Type Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_ATTRIBUTE_DECLARATION__TYPE_DEFINITION = eINSTANCE.getXSDAttributeDeclaration_TypeDefinition();

		/**
		 * The meta object literal for the '<em><b>Resolved Attribute Declaration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_ATTRIBUTE_DECLARATION__RESOLVED_ATTRIBUTE_DECLARATION = eINSTANCE.getXSDAttributeDeclaration_ResolvedAttributeDeclaration();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.impl.XSDAttributeGroupContentImpl <em>XSD Attribute Group Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.impl.XSDAttributeGroupContentImpl
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDAttributeGroupContent()
		 * @generated
		 */
		EClass XSD_ATTRIBUTE_GROUP_CONTENT = eINSTANCE.getXSDAttributeGroupContent();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.impl.XSDAttributeGroupDefinitionImpl <em>XSD Attribute Group Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.impl.XSDAttributeGroupDefinitionImpl
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDAttributeGroupDefinition()
		 * @generated
		 */
		EClass XSD_ATTRIBUTE_GROUP_DEFINITION = eINSTANCE.getXSDAttributeGroupDefinition();

		/**
		 * The meta object literal for the '<em><b>Attribute Group Definition Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_ATTRIBUTE_GROUP_DEFINITION__ATTRIBUTE_GROUP_DEFINITION_REFERENCE = eINSTANCE.getXSDAttributeGroupDefinition_AttributeGroupDefinitionReference();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_ATTRIBUTE_GROUP_DEFINITION__ANNOTATION = eINSTANCE.getXSDAttributeGroupDefinition_Annotation();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_ATTRIBUTE_GROUP_DEFINITION__CONTENTS = eINSTANCE.getXSDAttributeGroupDefinition_Contents();

		/**
		 * The meta object literal for the '<em><b>Attribute Uses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_ATTRIBUTE_GROUP_DEFINITION__ATTRIBUTE_USES = eINSTANCE.getXSDAttributeGroupDefinition_AttributeUses();

		/**
		 * The meta object literal for the '<em><b>Attribute Wildcard Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_ATTRIBUTE_GROUP_DEFINITION__ATTRIBUTE_WILDCARD_CONTENT = eINSTANCE.getXSDAttributeGroupDefinition_AttributeWildcardContent();

		/**
		 * The meta object literal for the '<em><b>Attribute Wildcard</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_ATTRIBUTE_GROUP_DEFINITION__ATTRIBUTE_WILDCARD = eINSTANCE.getXSDAttributeGroupDefinition_AttributeWildcard();

		/**
		 * The meta object literal for the '<em><b>Resolved Attribute Group Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_ATTRIBUTE_GROUP_DEFINITION__RESOLVED_ATTRIBUTE_GROUP_DEFINITION = eINSTANCE.getXSDAttributeGroupDefinition_ResolvedAttributeGroupDefinition();

		/**
		 * The meta object literal for the '<em><b>Synthetic Wildcard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_ATTRIBUTE_GROUP_DEFINITION__SYNTHETIC_WILDCARD = eINSTANCE.getXSDAttributeGroupDefinition_SyntheticWildcard();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.impl.XSDAttributeUseImpl <em>XSD Attribute Use</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.impl.XSDAttributeUseImpl
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDAttributeUse()
		 * @generated
		 */
		EClass XSD_ATTRIBUTE_USE = eINSTANCE.getXSDAttributeUse();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_ATTRIBUTE_USE__REQUIRED = eINSTANCE.getXSDAttributeUse_Required();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_ATTRIBUTE_USE__VALUE = eINSTANCE.getXSDAttributeUse_Value();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_ATTRIBUTE_USE__CONSTRAINT = eINSTANCE.getXSDAttributeUse_Constraint();

		/**
		 * The meta object literal for the '<em><b>Use</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_ATTRIBUTE_USE__USE = eINSTANCE.getXSDAttributeUse_Use();

		/**
		 * The meta object literal for the '<em><b>Lexical Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_ATTRIBUTE_USE__LEXICAL_VALUE = eINSTANCE.getXSDAttributeUse_LexicalValue();

		/**
		 * The meta object literal for the '<em><b>Attribute Declaration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_ATTRIBUTE_USE__ATTRIBUTE_DECLARATION = eINSTANCE.getXSDAttributeUse_AttributeDeclaration();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_ATTRIBUTE_USE__CONTENT = eINSTANCE.getXSDAttributeUse_Content();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.impl.XSDBoundedFacetImpl <em>XSD Bounded Facet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.impl.XSDBoundedFacetImpl
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDBoundedFacet()
		 * @generated
		 */
		EClass XSD_BOUNDED_FACET = eINSTANCE.getXSDBoundedFacet();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_BOUNDED_FACET__VALUE = eINSTANCE.getXSDBoundedFacet_Value();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.impl.XSDCardinalityFacetImpl <em>XSD Cardinality Facet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.impl.XSDCardinalityFacetImpl
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDCardinalityFacet()
		 * @generated
		 */
		EClass XSD_CARDINALITY_FACET = eINSTANCE.getXSDCardinalityFacet();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_CARDINALITY_FACET__VALUE = eINSTANCE.getXSDCardinalityFacet_Value();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.impl.XSDComplexTypeContentImpl <em>XSD Complex Type Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.impl.XSDComplexTypeContentImpl
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDComplexTypeContent()
		 * @generated
		 */
		EClass XSD_COMPLEX_TYPE_CONTENT = eINSTANCE.getXSDComplexTypeContent();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.impl.XSDComplexTypeDefinitionImpl <em>XSD Complex Type Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.impl.XSDComplexTypeDefinitionImpl
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDComplexTypeDefinition()
		 * @generated
		 */
		EClass XSD_COMPLEX_TYPE_DEFINITION = eINSTANCE.getXSDComplexTypeDefinition();

		/**
		 * The meta object literal for the '<em><b>Derivation Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_COMPLEX_TYPE_DEFINITION__DERIVATION_METHOD = eINSTANCE.getXSDComplexTypeDefinition_DerivationMethod();

		/**
		 * The meta object literal for the '<em><b>Final</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_COMPLEX_TYPE_DEFINITION__FINAL = eINSTANCE.getXSDComplexTypeDefinition_Final();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_COMPLEX_TYPE_DEFINITION__ABSTRACT = eINSTANCE.getXSDComplexTypeDefinition_Abstract();

		/**
		 * The meta object literal for the '<em><b>Content Type Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_COMPLEX_TYPE_DEFINITION__CONTENT_TYPE_CATEGORY = eINSTANCE.getXSDComplexTypeDefinition_ContentTypeCategory();

		/**
		 * The meta object literal for the '<em><b>Prohibited Substitutions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_COMPLEX_TYPE_DEFINITION__PROHIBITED_SUBSTITUTIONS = eINSTANCE.getXSDComplexTypeDefinition_ProhibitedSubstitutions();

		/**
		 * The meta object literal for the '<em><b>Lexical Final</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_COMPLEX_TYPE_DEFINITION__LEXICAL_FINAL = eINSTANCE.getXSDComplexTypeDefinition_LexicalFinal();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_COMPLEX_TYPE_DEFINITION__BLOCK = eINSTANCE.getXSDComplexTypeDefinition_Block();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_COMPLEX_TYPE_DEFINITION__MIXED = eINSTANCE.getXSDComplexTypeDefinition_Mixed();

		/**
		 * The meta object literal for the '<em><b>Content Annotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_COMPLEX_TYPE_DEFINITION__CONTENT_ANNOTATION = eINSTANCE.getXSDComplexTypeDefinition_ContentAnnotation();

		/**
		 * The meta object literal for the '<em><b>Base Type Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_COMPLEX_TYPE_DEFINITION__BASE_TYPE_DEFINITION = eINSTANCE.getXSDComplexTypeDefinition_BaseTypeDefinition();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_COMPLEX_TYPE_DEFINITION__CONTENT = eINSTANCE.getXSDComplexTypeDefinition_Content();

		/**
		 * The meta object literal for the '<em><b>Content Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_COMPLEX_TYPE_DEFINITION__CONTENT_TYPE = eINSTANCE.getXSDComplexTypeDefinition_ContentType();

		/**
		 * The meta object literal for the '<em><b>Attribute Uses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_COMPLEX_TYPE_DEFINITION__ATTRIBUTE_USES = eINSTANCE.getXSDComplexTypeDefinition_AttributeUses();

		/**
		 * The meta object literal for the '<em><b>Attribute Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_COMPLEX_TYPE_DEFINITION__ATTRIBUTE_CONTENTS = eINSTANCE.getXSDComplexTypeDefinition_AttributeContents();

		/**
		 * The meta object literal for the '<em><b>Attribute Wildcard</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_COMPLEX_TYPE_DEFINITION__ATTRIBUTE_WILDCARD = eINSTANCE.getXSDComplexTypeDefinition_AttributeWildcard();

		/**
		 * The meta object literal for the '<em><b>Attribute Wildcard Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_COMPLEX_TYPE_DEFINITION__ATTRIBUTE_WILDCARD_CONTENT = eINSTANCE.getXSDComplexTypeDefinition_AttributeWildcardContent();

		/**
		 * The meta object literal for the '<em><b>Root Type Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_COMPLEX_TYPE_DEFINITION__ROOT_TYPE_DEFINITION = eINSTANCE.getXSDComplexTypeDefinition_RootTypeDefinition();

		/**
		 * The meta object literal for the '<em><b>Synthetic Particle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_COMPLEX_TYPE_DEFINITION__SYNTHETIC_PARTICLE = eINSTANCE.getXSDComplexTypeDefinition_SyntheticParticle();

		/**
		 * The meta object literal for the '<em><b>Synthetic Wildcard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_COMPLEX_TYPE_DEFINITION__SYNTHETIC_WILDCARD = eINSTANCE.getXSDComplexTypeDefinition_SyntheticWildcard();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.impl.XSDComponentImpl <em>XSD Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.impl.XSDComponentImpl
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDComponent()
		 * @generated
		 */
		EClass XSD_COMPONENT = eINSTANCE.getXSDComponent();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.impl.XSDConcreteComponentImpl <em>XSD Concrete Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.impl.XSDConcreteComponentImpl
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDConcreteComponent()
		 * @generated
		 */
		EClass XSD_CONCRETE_COMPONENT = eINSTANCE.getXSDConcreteComponent();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_CONCRETE_COMPONENT__ELEMENT = eINSTANCE.getXSDConcreteComponent_Element();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_CONCRETE_COMPONENT__CONTAINER = eINSTANCE.getXSDConcreteComponent_Container();

		/**
		 * The meta object literal for the '<em><b>Root Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_CONCRETE_COMPONENT__ROOT_CONTAINER = eINSTANCE.getXSDConcreteComponent_RootContainer();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_CONCRETE_COMPONENT__SCHEMA = eINSTANCE.getXSDConcreteComponent_Schema();

		/**
		 * The meta object literal for the '<em><b>Diagnostics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_CONCRETE_COMPONENT__DIAGNOSTICS = eINSTANCE.getXSDConcreteComponent_Diagnostics();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.impl.XSDConstrainingFacetImpl <em>XSD Constraining Facet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.impl.XSDConstrainingFacetImpl
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDConstrainingFacet()
		 * @generated
		 */
		EClass XSD_CONSTRAINING_FACET = eINSTANCE.getXSDConstrainingFacet();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.impl.XSDDiagnosticImpl <em>XSD Diagnostic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.impl.XSDDiagnosticImpl
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDDiagnostic()
		 * @generated
		 */
		EClass XSD_DIAGNOSTIC = eINSTANCE.getXSDDiagnostic();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_DIAGNOSTIC__SEVERITY = eINSTANCE.getXSDDiagnostic_Severity();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_DIAGNOSTIC__MESSAGE = eINSTANCE.getXSDDiagnostic_Message();

		/**
		 * The meta object literal for the '<em><b>Location URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_DIAGNOSTIC__LOCATION_URI = eINSTANCE.getXSDDiagnostic_LocationURI();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_DIAGNOSTIC__LINE = eINSTANCE.getXSDDiagnostic_Line();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_DIAGNOSTIC__COLUMN = eINSTANCE.getXSDDiagnostic_Column();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_DIAGNOSTIC__NODE = eINSTANCE.getXSDDiagnostic_Node();

		/**
		 * The meta object literal for the '<em><b>Annotation URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_DIAGNOSTIC__ANNOTATION_URI = eINSTANCE.getXSDDiagnostic_AnnotationURI();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_DIAGNOSTIC__KEY = eINSTANCE.getXSDDiagnostic_Key();

		/**
		 * The meta object literal for the '<em><b>Substitutions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_DIAGNOSTIC__SUBSTITUTIONS = eINSTANCE.getXSDDiagnostic_Substitutions();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_DIAGNOSTIC__COMPONENTS = eINSTANCE.getXSDDiagnostic_Components();

		/**
		 * The meta object literal for the '<em><b>Primary Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_DIAGNOSTIC__PRIMARY_COMPONENT = eINSTANCE.getXSDDiagnostic_PrimaryComponent();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.impl.XSDElementDeclarationImpl <em>XSD Element Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.impl.XSDElementDeclarationImpl
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDElementDeclaration()
		 * @generated
		 */
		EClass XSD_ELEMENT_DECLARATION = eINSTANCE.getXSDElementDeclaration();

		/**
		 * The meta object literal for the '<em><b>Nillable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_ELEMENT_DECLARATION__NILLABLE = eINSTANCE.getXSDElementDeclaration_Nillable();

		/**
		 * The meta object literal for the '<em><b>Disallowed Substitutions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_ELEMENT_DECLARATION__DISALLOWED_SUBSTITUTIONS = eINSTANCE.getXSDElementDeclaration_DisallowedSubstitutions();

		/**
		 * The meta object literal for the '<em><b>Substitution Group Exclusions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_ELEMENT_DECLARATION__SUBSTITUTION_GROUP_EXCLUSIONS = eINSTANCE.getXSDElementDeclaration_SubstitutionGroupExclusions();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_ELEMENT_DECLARATION__ABSTRACT = eINSTANCE.getXSDElementDeclaration_Abstract();

		/**
		 * The meta object literal for the '<em><b>Lexical Final</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_ELEMENT_DECLARATION__LEXICAL_FINAL = eINSTANCE.getXSDElementDeclaration_LexicalFinal();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_ELEMENT_DECLARATION__BLOCK = eINSTANCE.getXSDElementDeclaration_Block();

		/**
		 * The meta object literal for the '<em><b>Element Declaration Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_ELEMENT_DECLARATION__ELEMENT_DECLARATION_REFERENCE = eINSTANCE.getXSDElementDeclaration_ElementDeclarationReference();

		/**
		 * The meta object literal for the '<em><b>Circular</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_ELEMENT_DECLARATION__CIRCULAR = eINSTANCE.getXSDElementDeclaration_Circular();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_ELEMENT_DECLARATION__ANNOTATION = eINSTANCE.getXSDElementDeclaration_Annotation();

		/**
		 * The meta object literal for the '<em><b>Anonymous Type Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_ELEMENT_DECLARATION__ANONYMOUS_TYPE_DEFINITION = eINSTANCE.getXSDElementDeclaration_AnonymousTypeDefinition();

		/**
		 * The meta object literal for the '<em><b>Type Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_ELEMENT_DECLARATION__TYPE_DEFINITION = eINSTANCE.getXSDElementDeclaration_TypeDefinition();

		/**
		 * The meta object literal for the '<em><b>Identity Constraint Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_ELEMENT_DECLARATION__IDENTITY_CONSTRAINT_DEFINITIONS = eINSTANCE.getXSDElementDeclaration_IdentityConstraintDefinitions();

		/**
		 * The meta object literal for the '<em><b>Resolved Element Declaration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_ELEMENT_DECLARATION__RESOLVED_ELEMENT_DECLARATION = eINSTANCE.getXSDElementDeclaration_ResolvedElementDeclaration();

		/**
		 * The meta object literal for the '<em><b>Substitution Group Affiliation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_ELEMENT_DECLARATION__SUBSTITUTION_GROUP_AFFILIATION = eINSTANCE.getXSDElementDeclaration_SubstitutionGroupAffiliation();

		/**
		 * The meta object literal for the '<em><b>Substitution Group</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_ELEMENT_DECLARATION__SUBSTITUTION_GROUP = eINSTANCE.getXSDElementDeclaration_SubstitutionGroup();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.impl.XSDEnumerationFacetImpl <em>XSD Enumeration Facet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.impl.XSDEnumerationFacetImpl
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDEnumerationFacet()
		 * @generated
		 */
		EClass XSD_ENUMERATION_FACET = eINSTANCE.getXSDEnumerationFacet();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_ENUMERATION_FACET__VALUE = eINSTANCE.getXSDEnumerationFacet_Value();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.impl.XSDFacetImpl <em>XSD Facet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.impl.XSDFacetImpl
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDFacet()
		 * @generated
		 */
		EClass XSD_FACET = eINSTANCE.getXSDFacet();

		/**
		 * The meta object literal for the '<em><b>Lexical Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_FACET__LEXICAL_VALUE = eINSTANCE.getXSDFacet_LexicalValue();

		/**
		 * The meta object literal for the '<em><b>Facet Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_FACET__FACET_NAME = eINSTANCE.getXSDFacet_FacetName();

		/**
		 * The meta object literal for the '<em><b>Effective Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_FACET__EFFECTIVE_VALUE = eINSTANCE.getXSDFacet_EffectiveValue();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_FACET__ANNOTATION = eINSTANCE.getXSDFacet_Annotation();

		/**
		 * The meta object literal for the '<em><b>Simple Type Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_FACET__SIMPLE_TYPE_DEFINITION = eINSTANCE.getXSDFacet_SimpleTypeDefinition();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.impl.XSDFeatureImpl <em>XSD Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.impl.XSDFeatureImpl
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDFeature()
		 * @generated
		 */
		EClass XSD_FEATURE = eINSTANCE.getXSDFeature();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_FEATURE__VALUE = eINSTANCE.getXSDFeature_Value();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_FEATURE__CONSTRAINT = eINSTANCE.getXSDFeature_Constraint();

		/**
		 * The meta object literal for the '<em><b>Form</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_FEATURE__FORM = eINSTANCE.getXSDFeature_Form();

		/**
		 * The meta object literal for the '<em><b>Lexical Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_FEATURE__LEXICAL_VALUE = eINSTANCE.getXSDFeature_LexicalValue();

		/**
		 * The meta object literal for the '<em><b>Global</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_FEATURE__GLOBAL = eINSTANCE.getXSDFeature_Global();

		/**
		 * The meta object literal for the '<em><b>Feature Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_FEATURE__FEATURE_REFERENCE = eINSTANCE.getXSDFeature_FeatureReference();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_FEATURE__SCOPE = eINSTANCE.getXSDFeature_Scope();

		/**
		 * The meta object literal for the '<em><b>Resolved Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_FEATURE__RESOLVED_FEATURE = eINSTANCE.getXSDFeature_ResolvedFeature();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_FEATURE__TYPE = eINSTANCE.getXSDFeature_Type();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.impl.XSDFixedFacetImpl <em>XSD Fixed Facet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.impl.XSDFixedFacetImpl
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDFixedFacet()
		 * @generated
		 */
		EClass XSD_FIXED_FACET = eINSTANCE.getXSDFixedFacet();

		/**
		 * The meta object literal for the '<em><b>Fixed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_FIXED_FACET__FIXED = eINSTANCE.getXSDFixedFacet_Fixed();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.impl.XSDFractionDigitsFacetImpl <em>XSD Fraction Digits Facet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.impl.XSDFractionDigitsFacetImpl
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDFractionDigitsFacet()
		 * @generated
		 */
		EClass XSD_FRACTION_DIGITS_FACET = eINSTANCE.getXSDFractionDigitsFacet();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_FRACTION_DIGITS_FACET__VALUE = eINSTANCE.getXSDFractionDigitsFacet_Value();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.impl.XSDFundamentalFacetImpl <em>XSD Fundamental Facet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.impl.XSDFundamentalFacetImpl
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDFundamentalFacet()
		 * @generated
		 */
		EClass XSD_FUNDAMENTAL_FACET = eINSTANCE.getXSDFundamentalFacet();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.impl.XSDIdentityConstraintDefinitionImpl <em>XSD Identity Constraint Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.impl.XSDIdentityConstraintDefinitionImpl
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDIdentityConstraintDefinition()
		 * @generated
		 */
		EClass XSD_IDENTITY_CONSTRAINT_DEFINITION = eINSTANCE.getXSDIdentityConstraintDefinition();

		/**
		 * The meta object literal for the '<em><b>Identity Constraint Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_IDENTITY_CONSTRAINT_DEFINITION__IDENTITY_CONSTRAINT_CATEGORY = eINSTANCE.getXSDIdentityConstraintDefinition_IdentityConstraintCategory();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_IDENTITY_CONSTRAINT_DEFINITION__ANNOTATION = eINSTANCE.getXSDIdentityConstraintDefinition_Annotation();

		/**
		 * The meta object literal for the '<em><b>Referenced Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_IDENTITY_CONSTRAINT_DEFINITION__REFERENCED_KEY = eINSTANCE.getXSDIdentityConstraintDefinition_ReferencedKey();

		/**
		 * The meta object literal for the '<em><b>Selector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_IDENTITY_CONSTRAINT_DEFINITION__SELECTOR = eINSTANCE.getXSDIdentityConstraintDefinition_Selector();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_IDENTITY_CONSTRAINT_DEFINITION__FIELDS = eINSTANCE.getXSDIdentityConstraintDefinition_Fields();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.impl.XSDImportImpl <em>XSD Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.impl.XSDImportImpl
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDImport()
		 * @generated
		 */
		EClass XSD_IMPORT = eINSTANCE.getXSDImport();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_IMPORT__NAMESPACE = eINSTANCE.getXSDImport_Namespace();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_IMPORT__ANNOTATION = eINSTANCE.getXSDImport_Annotation();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.impl.XSDIncludeImpl <em>XSD Include</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.impl.XSDIncludeImpl
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDInclude()
		 * @generated
		 */
		EClass XSD_INCLUDE = eINSTANCE.getXSDInclude();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_INCLUDE__ANNOTATION = eINSTANCE.getXSDInclude_Annotation();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.impl.XSDLengthFacetImpl <em>XSD Length Facet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.impl.XSDLengthFacetImpl
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDLengthFacet()
		 * @generated
		 */
		EClass XSD_LENGTH_FACET = eINSTANCE.getXSDLengthFacet();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_LENGTH_FACET__VALUE = eINSTANCE.getXSDLengthFacet_Value();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.impl.XSDMaxExclusiveFacetImpl <em>XSD Max Exclusive Facet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.impl.XSDMaxExclusiveFacetImpl
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDMaxExclusiveFacet()
		 * @generated
		 */
		EClass XSD_MAX_EXCLUSIVE_FACET = eINSTANCE.getXSDMaxExclusiveFacet();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.impl.XSDMaxFacetImpl <em>XSD Max Facet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.impl.XSDMaxFacetImpl
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDMaxFacet()
		 * @generated
		 */
		EClass XSD_MAX_FACET = eINSTANCE.getXSDMaxFacet();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_MAX_FACET__VALUE = eINSTANCE.getXSDMaxFacet_Value();

		/**
		 * The meta object literal for the '<em><b>Inclusive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_MAX_FACET__INCLUSIVE = eINSTANCE.getXSDMaxFacet_Inclusive();

		/**
		 * The meta object literal for the '<em><b>Exclusive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_MAX_FACET__EXCLUSIVE = eINSTANCE.getXSDMaxFacet_Exclusive();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.impl.XSDMaxInclusiveFacetImpl <em>XSD Max Inclusive Facet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.impl.XSDMaxInclusiveFacetImpl
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDMaxInclusiveFacet()
		 * @generated
		 */
		EClass XSD_MAX_INCLUSIVE_FACET = eINSTANCE.getXSDMaxInclusiveFacet();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.impl.XSDMaxLengthFacetImpl <em>XSD Max Length Facet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.impl.XSDMaxLengthFacetImpl
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDMaxLengthFacet()
		 * @generated
		 */
		EClass XSD_MAX_LENGTH_FACET = eINSTANCE.getXSDMaxLengthFacet();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_MAX_LENGTH_FACET__VALUE = eINSTANCE.getXSDMaxLengthFacet_Value();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.impl.XSDMinExclusiveFacetImpl <em>XSD Min Exclusive Facet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.impl.XSDMinExclusiveFacetImpl
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDMinExclusiveFacet()
		 * @generated
		 */
		EClass XSD_MIN_EXCLUSIVE_FACET = eINSTANCE.getXSDMinExclusiveFacet();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.impl.XSDMinFacetImpl <em>XSD Min Facet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.impl.XSDMinFacetImpl
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDMinFacet()
		 * @generated
		 */
		EClass XSD_MIN_FACET = eINSTANCE.getXSDMinFacet();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_MIN_FACET__VALUE = eINSTANCE.getXSDMinFacet_Value();

		/**
		 * The meta object literal for the '<em><b>Inclusive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_MIN_FACET__INCLUSIVE = eINSTANCE.getXSDMinFacet_Inclusive();

		/**
		 * The meta object literal for the '<em><b>Exclusive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_MIN_FACET__EXCLUSIVE = eINSTANCE.getXSDMinFacet_Exclusive();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.impl.XSDMinInclusiveFacetImpl <em>XSD Min Inclusive Facet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.impl.XSDMinInclusiveFacetImpl
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDMinInclusiveFacet()
		 * @generated
		 */
		EClass XSD_MIN_INCLUSIVE_FACET = eINSTANCE.getXSDMinInclusiveFacet();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.impl.XSDMinLengthFacetImpl <em>XSD Min Length Facet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.impl.XSDMinLengthFacetImpl
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDMinLengthFacet()
		 * @generated
		 */
		EClass XSD_MIN_LENGTH_FACET = eINSTANCE.getXSDMinLengthFacet();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_MIN_LENGTH_FACET__VALUE = eINSTANCE.getXSDMinLengthFacet_Value();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.impl.XSDModelGroupImpl <em>XSD Model Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.impl.XSDModelGroupImpl
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDModelGroup()
		 * @generated
		 */
		EClass XSD_MODEL_GROUP = eINSTANCE.getXSDModelGroup();

		/**
		 * The meta object literal for the '<em><b>Compositor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_MODEL_GROUP__COMPOSITOR = eINSTANCE.getXSDModelGroup_Compositor();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_MODEL_GROUP__ANNOTATION = eINSTANCE.getXSDModelGroup_Annotation();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_MODEL_GROUP__CONTENTS = eINSTANCE.getXSDModelGroup_Contents();

		/**
		 * The meta object literal for the '<em><b>Particles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_MODEL_GROUP__PARTICLES = eINSTANCE.getXSDModelGroup_Particles();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.impl.XSDModelGroupDefinitionImpl <em>XSD Model Group Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.impl.XSDModelGroupDefinitionImpl
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDModelGroupDefinition()
		 * @generated
		 */
		EClass XSD_MODEL_GROUP_DEFINITION = eINSTANCE.getXSDModelGroupDefinition();

		/**
		 * The meta object literal for the '<em><b>Model Group Definition Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_MODEL_GROUP_DEFINITION__MODEL_GROUP_DEFINITION_REFERENCE = eINSTANCE.getXSDModelGroupDefinition_ModelGroupDefinitionReference();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_MODEL_GROUP_DEFINITION__ANNOTATION = eINSTANCE.getXSDModelGroupDefinition_Annotation();

		/**
		 * The meta object literal for the '<em><b>Model Group</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_MODEL_GROUP_DEFINITION__MODEL_GROUP = eINSTANCE.getXSDModelGroupDefinition_ModelGroup();

		/**
		 * The meta object literal for the '<em><b>Resolved Model Group Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_MODEL_GROUP_DEFINITION__RESOLVED_MODEL_GROUP_DEFINITION = eINSTANCE.getXSDModelGroupDefinition_ResolvedModelGroupDefinition();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.impl.XSDNamedComponentImpl <em>XSD Named Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.impl.XSDNamedComponentImpl
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDNamedComponent()
		 * @generated
		 */
		EClass XSD_NAMED_COMPONENT = eINSTANCE.getXSDNamedComponent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_NAMED_COMPONENT__NAME = eINSTANCE.getXSDNamedComponent_Name();

		/**
		 * The meta object literal for the '<em><b>Target Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_NAMED_COMPONENT__TARGET_NAMESPACE = eINSTANCE.getXSDNamedComponent_TargetNamespace();

		/**
		 * The meta object literal for the '<em><b>Alias Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_NAMED_COMPONENT__ALIAS_NAME = eINSTANCE.getXSDNamedComponent_AliasName();

		/**
		 * The meta object literal for the '<em><b>URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_NAMED_COMPONENT__URI = eINSTANCE.getXSDNamedComponent_URI();

		/**
		 * The meta object literal for the '<em><b>Alias URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_NAMED_COMPONENT__ALIAS_URI = eINSTANCE.getXSDNamedComponent_AliasURI();

		/**
		 * The meta object literal for the '<em><b>QName</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_NAMED_COMPONENT__QNAME = eINSTANCE.getXSDNamedComponent_QName();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.impl.XSDNotationDeclarationImpl <em>XSD Notation Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.impl.XSDNotationDeclarationImpl
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDNotationDeclaration()
		 * @generated
		 */
		EClass XSD_NOTATION_DECLARATION = eINSTANCE.getXSDNotationDeclaration();

		/**
		 * The meta object literal for the '<em><b>System Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_NOTATION_DECLARATION__SYSTEM_IDENTIFIER = eINSTANCE.getXSDNotationDeclaration_SystemIdentifier();

		/**
		 * The meta object literal for the '<em><b>Public Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_NOTATION_DECLARATION__PUBLIC_IDENTIFIER = eINSTANCE.getXSDNotationDeclaration_PublicIdentifier();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_NOTATION_DECLARATION__ANNOTATION = eINSTANCE.getXSDNotationDeclaration_Annotation();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.impl.XSDNumericFacetImpl <em>XSD Numeric Facet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.impl.XSDNumericFacetImpl
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDNumericFacet()
		 * @generated
		 */
		EClass XSD_NUMERIC_FACET = eINSTANCE.getXSDNumericFacet();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_NUMERIC_FACET__VALUE = eINSTANCE.getXSDNumericFacet_Value();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.impl.XSDOrderedFacetImpl <em>XSD Ordered Facet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.impl.XSDOrderedFacetImpl
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDOrderedFacet()
		 * @generated
		 */
		EClass XSD_ORDERED_FACET = eINSTANCE.getXSDOrderedFacet();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_ORDERED_FACET__VALUE = eINSTANCE.getXSDOrderedFacet_Value();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.impl.XSDParticleImpl <em>XSD Particle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.impl.XSDParticleImpl
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDParticle()
		 * @generated
		 */
		EClass XSD_PARTICLE = eINSTANCE.getXSDParticle();

		/**
		 * The meta object literal for the '<em><b>Min Occurs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_PARTICLE__MIN_OCCURS = eINSTANCE.getXSDParticle_MinOccurs();

		/**
		 * The meta object literal for the '<em><b>Max Occurs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_PARTICLE__MAX_OCCURS = eINSTANCE.getXSDParticle_MaxOccurs();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_PARTICLE__CONTENT = eINSTANCE.getXSDParticle_Content();

		/**
		 * The meta object literal for the '<em><b>Term</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_PARTICLE__TERM = eINSTANCE.getXSDParticle_Term();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.impl.XSDParticleContentImpl <em>XSD Particle Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.impl.XSDParticleContentImpl
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDParticleContent()
		 * @generated
		 */
		EClass XSD_PARTICLE_CONTENT = eINSTANCE.getXSDParticleContent();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.impl.XSDPatternFacetImpl <em>XSD Pattern Facet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.impl.XSDPatternFacetImpl
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDPatternFacet()
		 * @generated
		 */
		EClass XSD_PATTERN_FACET = eINSTANCE.getXSDPatternFacet();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_PATTERN_FACET__VALUE = eINSTANCE.getXSDPatternFacet_Value();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.impl.XSDRedefinableComponentImpl <em>XSD Redefinable Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.impl.XSDRedefinableComponentImpl
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDRedefinableComponent()
		 * @generated
		 */
		EClass XSD_REDEFINABLE_COMPONENT = eINSTANCE.getXSDRedefinableComponent();

		/**
		 * The meta object literal for the '<em><b>Circular</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_REDEFINABLE_COMPONENT__CIRCULAR = eINSTANCE.getXSDRedefinableComponent_Circular();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.impl.XSDRedefineContentImpl <em>XSD Redefine Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.impl.XSDRedefineContentImpl
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDRedefineContent()
		 * @generated
		 */
		EClass XSD_REDEFINE_CONTENT = eINSTANCE.getXSDRedefineContent();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.impl.XSDRedefineImpl <em>XSD Redefine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.impl.XSDRedefineImpl
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDRedefine()
		 * @generated
		 */
		EClass XSD_REDEFINE = eINSTANCE.getXSDRedefine();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_REDEFINE__ANNOTATIONS = eINSTANCE.getXSDRedefine_Annotations();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_REDEFINE__CONTENTS = eINSTANCE.getXSDRedefine_Contents();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.impl.XSDRepeatableFacetImpl <em>XSD Repeatable Facet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.impl.XSDRepeatableFacetImpl
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDRepeatableFacet()
		 * @generated
		 */
		EClass XSD_REPEATABLE_FACET = eINSTANCE.getXSDRepeatableFacet();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_REPEATABLE_FACET__ANNOTATIONS = eINSTANCE.getXSDRepeatableFacet_Annotations();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.impl.XSDSchemaImpl <em>XSD Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.impl.XSDSchemaImpl
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDSchema()
		 * @generated
		 */
		EClass XSD_SCHEMA = eINSTANCE.getXSDSchema();

		/**
		 * The meta object literal for the '<em><b>Document</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_SCHEMA__DOCUMENT = eINSTANCE.getXSDSchema_Document();

		/**
		 * The meta object literal for the '<em><b>Schema Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_SCHEMA__SCHEMA_LOCATION = eINSTANCE.getXSDSchema_SchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Target Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_SCHEMA__TARGET_NAMESPACE = eINSTANCE.getXSDSchema_TargetNamespace();

		/**
		 * The meta object literal for the '<em><b>Attribute Form Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_SCHEMA__ATTRIBUTE_FORM_DEFAULT = eINSTANCE.getXSDSchema_AttributeFormDefault();

		/**
		 * The meta object literal for the '<em><b>Element Form Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_SCHEMA__ELEMENT_FORM_DEFAULT = eINSTANCE.getXSDSchema_ElementFormDefault();

		/**
		 * The meta object literal for the '<em><b>Final Default</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_SCHEMA__FINAL_DEFAULT = eINSTANCE.getXSDSchema_FinalDefault();

		/**
		 * The meta object literal for the '<em><b>Block Default</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_SCHEMA__BLOCK_DEFAULT = eINSTANCE.getXSDSchema_BlockDefault();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_SCHEMA__VERSION = eINSTANCE.getXSDSchema_Version();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_SCHEMA__CONTENTS = eINSTANCE.getXSDSchema_Contents();

		/**
		 * The meta object literal for the '<em><b>Element Declarations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_SCHEMA__ELEMENT_DECLARATIONS = eINSTANCE.getXSDSchema_ElementDeclarations();

		/**
		 * The meta object literal for the '<em><b>Attribute Declarations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_SCHEMA__ATTRIBUTE_DECLARATIONS = eINSTANCE.getXSDSchema_AttributeDeclarations();

		/**
		 * The meta object literal for the '<em><b>Attribute Group Definitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_SCHEMA__ATTRIBUTE_GROUP_DEFINITIONS = eINSTANCE.getXSDSchema_AttributeGroupDefinitions();

		/**
		 * The meta object literal for the '<em><b>Type Definitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_SCHEMA__TYPE_DEFINITIONS = eINSTANCE.getXSDSchema_TypeDefinitions();

		/**
		 * The meta object literal for the '<em><b>Model Group Definitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_SCHEMA__MODEL_GROUP_DEFINITIONS = eINSTANCE.getXSDSchema_ModelGroupDefinitions();

		/**
		 * The meta object literal for the '<em><b>Identity Constraint Definitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_SCHEMA__IDENTITY_CONSTRAINT_DEFINITIONS = eINSTANCE.getXSDSchema_IdentityConstraintDefinitions();

		/**
		 * The meta object literal for the '<em><b>Notation Declarations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_SCHEMA__NOTATION_DECLARATIONS = eINSTANCE.getXSDSchema_NotationDeclarations();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_SCHEMA__ANNOTATIONS = eINSTANCE.getXSDSchema_Annotations();

		/**
		 * The meta object literal for the '<em><b>All Diagnostics</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_SCHEMA__ALL_DIAGNOSTICS = eINSTANCE.getXSDSchema_AllDiagnostics();

		/**
		 * The meta object literal for the '<em><b>Referencing Directives</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_SCHEMA__REFERENCING_DIRECTIVES = eINSTANCE.getXSDSchema_ReferencingDirectives();

		/**
		 * The meta object literal for the '<em><b>Root Version</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_SCHEMA__ROOT_VERSION = eINSTANCE.getXSDSchema_RootVersion();

		/**
		 * The meta object literal for the '<em><b>Original Version</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_SCHEMA__ORIGINAL_VERSION = eINSTANCE.getXSDSchema_OriginalVersion();

		/**
		 * The meta object literal for the '<em><b>Incorporated Versions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_SCHEMA__INCORPORATED_VERSIONS = eINSTANCE.getXSDSchema_IncorporatedVersions();

		/**
		 * The meta object literal for the '<em><b>Schema For Schema</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_SCHEMA__SCHEMA_FOR_SCHEMA = eINSTANCE.getXSDSchema_SchemaForSchema();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.impl.XSDSchemaCompositorImpl <em>XSD Schema Compositor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.impl.XSDSchemaCompositorImpl
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDSchemaCompositor()
		 * @generated
		 */
		EClass XSD_SCHEMA_COMPOSITOR = eINSTANCE.getXSDSchemaCompositor();

		/**
		 * The meta object literal for the '<em><b>Incorporated Schema</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_SCHEMA_COMPOSITOR__INCORPORATED_SCHEMA = eINSTANCE.getXSDSchemaCompositor_IncorporatedSchema();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.impl.XSDSchemaContentImpl <em>XSD Schema Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.impl.XSDSchemaContentImpl
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDSchemaContent()
		 * @generated
		 */
		EClass XSD_SCHEMA_CONTENT = eINSTANCE.getXSDSchemaContent();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.impl.XSDSchemaDirectiveImpl <em>XSD Schema Directive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.impl.XSDSchemaDirectiveImpl
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDSchemaDirective()
		 * @generated
		 */
		EClass XSD_SCHEMA_DIRECTIVE = eINSTANCE.getXSDSchemaDirective();

		/**
		 * The meta object literal for the '<em><b>Schema Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_SCHEMA_DIRECTIVE__SCHEMA_LOCATION = eINSTANCE.getXSDSchemaDirective_SchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Resolved Schema</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_SCHEMA_DIRECTIVE__RESOLVED_SCHEMA = eINSTANCE.getXSDSchemaDirective_ResolvedSchema();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.impl.XSDScopeImpl <em>XSD Scope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.impl.XSDScopeImpl
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDScope()
		 * @generated
		 */
		EClass XSD_SCOPE = eINSTANCE.getXSDScope();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.impl.XSDSimpleTypeDefinitionImpl <em>XSD Simple Type Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.impl.XSDSimpleTypeDefinitionImpl
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDSimpleTypeDefinition()
		 * @generated
		 */
		EClass XSD_SIMPLE_TYPE_DEFINITION = eINSTANCE.getXSDSimpleTypeDefinition();

		/**
		 * The meta object literal for the '<em><b>Variety</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_SIMPLE_TYPE_DEFINITION__VARIETY = eINSTANCE.getXSDSimpleTypeDefinition_Variety();

		/**
		 * The meta object literal for the '<em><b>Final</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_SIMPLE_TYPE_DEFINITION__FINAL = eINSTANCE.getXSDSimpleTypeDefinition_Final();

		/**
		 * The meta object literal for the '<em><b>Lexical Final</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_SIMPLE_TYPE_DEFINITION__LEXICAL_FINAL = eINSTANCE.getXSDSimpleTypeDefinition_LexicalFinal();

		/**
		 * The meta object literal for the '<em><b>Valid Facets</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_SIMPLE_TYPE_DEFINITION__VALID_FACETS = eINSTANCE.getXSDSimpleTypeDefinition_ValidFacets();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_SIMPLE_TYPE_DEFINITION__CONTENTS = eINSTANCE.getXSDSimpleTypeDefinition_Contents();

		/**
		 * The meta object literal for the '<em><b>Facet Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_SIMPLE_TYPE_DEFINITION__FACET_CONTENTS = eINSTANCE.getXSDSimpleTypeDefinition_FacetContents();

		/**
		 * The meta object literal for the '<em><b>Facets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_SIMPLE_TYPE_DEFINITION__FACETS = eINSTANCE.getXSDSimpleTypeDefinition_Facets();

		/**
		 * The meta object literal for the '<em><b>Member Type Definitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_SIMPLE_TYPE_DEFINITION__MEMBER_TYPE_DEFINITIONS = eINSTANCE.getXSDSimpleTypeDefinition_MemberTypeDefinitions();

		/**
		 * The meta object literal for the '<em><b>Fundamental Facets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_SIMPLE_TYPE_DEFINITION__FUNDAMENTAL_FACETS = eINSTANCE.getXSDSimpleTypeDefinition_FundamentalFacets();

		/**
		 * The meta object literal for the '<em><b>Base Type Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_SIMPLE_TYPE_DEFINITION__BASE_TYPE_DEFINITION = eINSTANCE.getXSDSimpleTypeDefinition_BaseTypeDefinition();

		/**
		 * The meta object literal for the '<em><b>Primitive Type Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_SIMPLE_TYPE_DEFINITION__PRIMITIVE_TYPE_DEFINITION = eINSTANCE.getXSDSimpleTypeDefinition_PrimitiveTypeDefinition();

		/**
		 * The meta object literal for the '<em><b>Item Type Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_SIMPLE_TYPE_DEFINITION__ITEM_TYPE_DEFINITION = eINSTANCE.getXSDSimpleTypeDefinition_ItemTypeDefinition();

		/**
		 * The meta object literal for the '<em><b>Root Type Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_SIMPLE_TYPE_DEFINITION__ROOT_TYPE_DEFINITION = eINSTANCE.getXSDSimpleTypeDefinition_RootTypeDefinition();

		/**
		 * The meta object literal for the '<em><b>Min Facet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_SIMPLE_TYPE_DEFINITION__MIN_FACET = eINSTANCE.getXSDSimpleTypeDefinition_MinFacet();

		/**
		 * The meta object literal for the '<em><b>Max Facet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_SIMPLE_TYPE_DEFINITION__MAX_FACET = eINSTANCE.getXSDSimpleTypeDefinition_MaxFacet();

		/**
		 * The meta object literal for the '<em><b>Max Inclusive Facet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_SIMPLE_TYPE_DEFINITION__MAX_INCLUSIVE_FACET = eINSTANCE.getXSDSimpleTypeDefinition_MaxInclusiveFacet();

		/**
		 * The meta object literal for the '<em><b>Min Inclusive Facet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_SIMPLE_TYPE_DEFINITION__MIN_INCLUSIVE_FACET = eINSTANCE.getXSDSimpleTypeDefinition_MinInclusiveFacet();

		/**
		 * The meta object literal for the '<em><b>Min Exclusive Facet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_SIMPLE_TYPE_DEFINITION__MIN_EXCLUSIVE_FACET = eINSTANCE.getXSDSimpleTypeDefinition_MinExclusiveFacet();

		/**
		 * The meta object literal for the '<em><b>Max Exclusive Facet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_SIMPLE_TYPE_DEFINITION__MAX_EXCLUSIVE_FACET = eINSTANCE.getXSDSimpleTypeDefinition_MaxExclusiveFacet();

		/**
		 * The meta object literal for the '<em><b>Length Facet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_SIMPLE_TYPE_DEFINITION__LENGTH_FACET = eINSTANCE.getXSDSimpleTypeDefinition_LengthFacet();

		/**
		 * The meta object literal for the '<em><b>White Space Facet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_SIMPLE_TYPE_DEFINITION__WHITE_SPACE_FACET = eINSTANCE.getXSDSimpleTypeDefinition_WhiteSpaceFacet();

		/**
		 * The meta object literal for the '<em><b>Enumeration Facets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_SIMPLE_TYPE_DEFINITION__ENUMERATION_FACETS = eINSTANCE.getXSDSimpleTypeDefinition_EnumerationFacets();

		/**
		 * The meta object literal for the '<em><b>Pattern Facets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_SIMPLE_TYPE_DEFINITION__PATTERN_FACETS = eINSTANCE.getXSDSimpleTypeDefinition_PatternFacets();

		/**
		 * The meta object literal for the '<em><b>Cardinality Facet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_SIMPLE_TYPE_DEFINITION__CARDINALITY_FACET = eINSTANCE.getXSDSimpleTypeDefinition_CardinalityFacet();

		/**
		 * The meta object literal for the '<em><b>Numeric Facet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_SIMPLE_TYPE_DEFINITION__NUMERIC_FACET = eINSTANCE.getXSDSimpleTypeDefinition_NumericFacet();

		/**
		 * The meta object literal for the '<em><b>Max Length Facet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_SIMPLE_TYPE_DEFINITION__MAX_LENGTH_FACET = eINSTANCE.getXSDSimpleTypeDefinition_MaxLengthFacet();

		/**
		 * The meta object literal for the '<em><b>Min Length Facet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_SIMPLE_TYPE_DEFINITION__MIN_LENGTH_FACET = eINSTANCE.getXSDSimpleTypeDefinition_MinLengthFacet();

		/**
		 * The meta object literal for the '<em><b>Total Digits Facet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_SIMPLE_TYPE_DEFINITION__TOTAL_DIGITS_FACET = eINSTANCE.getXSDSimpleTypeDefinition_TotalDigitsFacet();

		/**
		 * The meta object literal for the '<em><b>Fraction Digits Facet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_SIMPLE_TYPE_DEFINITION__FRACTION_DIGITS_FACET = eINSTANCE.getXSDSimpleTypeDefinition_FractionDigitsFacet();

		/**
		 * The meta object literal for the '<em><b>Ordered Facet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_SIMPLE_TYPE_DEFINITION__ORDERED_FACET = eINSTANCE.getXSDSimpleTypeDefinition_OrderedFacet();

		/**
		 * The meta object literal for the '<em><b>Bounded Facet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_SIMPLE_TYPE_DEFINITION__BOUNDED_FACET = eINSTANCE.getXSDSimpleTypeDefinition_BoundedFacet();

		/**
		 * The meta object literal for the '<em><b>Effective Max Facet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_SIMPLE_TYPE_DEFINITION__EFFECTIVE_MAX_FACET = eINSTANCE.getXSDSimpleTypeDefinition_EffectiveMaxFacet();

		/**
		 * The meta object literal for the '<em><b>Effective White Space Facet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_SIMPLE_TYPE_DEFINITION__EFFECTIVE_WHITE_SPACE_FACET = eINSTANCE.getXSDSimpleTypeDefinition_EffectiveWhiteSpaceFacet();

		/**
		 * The meta object literal for the '<em><b>Effective Max Length Facet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_SIMPLE_TYPE_DEFINITION__EFFECTIVE_MAX_LENGTH_FACET = eINSTANCE.getXSDSimpleTypeDefinition_EffectiveMaxLengthFacet();

		/**
		 * The meta object literal for the '<em><b>Effective Fraction Digits Facet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_SIMPLE_TYPE_DEFINITION__EFFECTIVE_FRACTION_DIGITS_FACET = eINSTANCE.getXSDSimpleTypeDefinition_EffectiveFractionDigitsFacet();

		/**
		 * The meta object literal for the '<em><b>Effective Pattern Facet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_SIMPLE_TYPE_DEFINITION__EFFECTIVE_PATTERN_FACET = eINSTANCE.getXSDSimpleTypeDefinition_EffectivePatternFacet();

		/**
		 * The meta object literal for the '<em><b>Effective Enumeration Facet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_SIMPLE_TYPE_DEFINITION__EFFECTIVE_ENUMERATION_FACET = eINSTANCE.getXSDSimpleTypeDefinition_EffectiveEnumerationFacet();

		/**
		 * The meta object literal for the '<em><b>Effective Total Digits Facet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_SIMPLE_TYPE_DEFINITION__EFFECTIVE_TOTAL_DIGITS_FACET = eINSTANCE.getXSDSimpleTypeDefinition_EffectiveTotalDigitsFacet();

		/**
		 * The meta object literal for the '<em><b>Effective Min Length Facet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_SIMPLE_TYPE_DEFINITION__EFFECTIVE_MIN_LENGTH_FACET = eINSTANCE.getXSDSimpleTypeDefinition_EffectiveMinLengthFacet();

		/**
		 * The meta object literal for the '<em><b>Effective Length Facet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_SIMPLE_TYPE_DEFINITION__EFFECTIVE_LENGTH_FACET = eINSTANCE.getXSDSimpleTypeDefinition_EffectiveLengthFacet();

		/**
		 * The meta object literal for the '<em><b>Effective Min Facet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_SIMPLE_TYPE_DEFINITION__EFFECTIVE_MIN_FACET = eINSTANCE.getXSDSimpleTypeDefinition_EffectiveMinFacet();

		/**
		 * The meta object literal for the '<em><b>Synthetic Facets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_SIMPLE_TYPE_DEFINITION__SYNTHETIC_FACETS = eINSTANCE.getXSDSimpleTypeDefinition_SyntheticFacets();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.impl.XSDTermImpl <em>XSD Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.impl.XSDTermImpl
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDTerm()
		 * @generated
		 */
		EClass XSD_TERM = eINSTANCE.getXSDTerm();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.impl.XSDTotalDigitsFacetImpl <em>XSD Total Digits Facet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.impl.XSDTotalDigitsFacetImpl
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDTotalDigitsFacet()
		 * @generated
		 */
		EClass XSD_TOTAL_DIGITS_FACET = eINSTANCE.getXSDTotalDigitsFacet();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_TOTAL_DIGITS_FACET__VALUE = eINSTANCE.getXSDTotalDigitsFacet_Value();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.impl.XSDTypeDefinitionImpl <em>XSD Type Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.impl.XSDTypeDefinitionImpl
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDTypeDefinition()
		 * @generated
		 */
		EClass XSD_TYPE_DEFINITION = eINSTANCE.getXSDTypeDefinition();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_TYPE_DEFINITION__ANNOTATION = eINSTANCE.getXSDTypeDefinition_Annotation();

		/**
		 * The meta object literal for the '<em><b>Derivation Annotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_TYPE_DEFINITION__DERIVATION_ANNOTATION = eINSTANCE.getXSDTypeDefinition_DerivationAnnotation();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_TYPE_DEFINITION__ANNOTATIONS = eINSTANCE.getXSDTypeDefinition_Annotations();

		/**
		 * The meta object literal for the '<em><b>Root Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_TYPE_DEFINITION__ROOT_TYPE = eINSTANCE.getXSDTypeDefinition_RootType();

		/**
		 * The meta object literal for the '<em><b>Base Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_TYPE_DEFINITION__BASE_TYPE = eINSTANCE.getXSDTypeDefinition_BaseType();

		/**
		 * The meta object literal for the '<em><b>Simple Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_TYPE_DEFINITION__SIMPLE_TYPE = eINSTANCE.getXSDTypeDefinition_SimpleType();

		/**
		 * The meta object literal for the '<em><b>Complex Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_TYPE_DEFINITION__COMPLEX_TYPE = eINSTANCE.getXSDTypeDefinition_ComplexType();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.impl.XSDWhiteSpaceFacetImpl <em>XSD White Space Facet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.impl.XSDWhiteSpaceFacetImpl
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDWhiteSpaceFacet()
		 * @generated
		 */
		EClass XSD_WHITE_SPACE_FACET = eINSTANCE.getXSDWhiteSpaceFacet();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_WHITE_SPACE_FACET__VALUE = eINSTANCE.getXSDWhiteSpaceFacet_Value();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.impl.XSDWildcardImpl <em>XSD Wildcard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.impl.XSDWildcardImpl
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDWildcard()
		 * @generated
		 */
		EClass XSD_WILDCARD = eINSTANCE.getXSDWildcard();

		/**
		 * The meta object literal for the '<em><b>Namespace Constraint Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_WILDCARD__NAMESPACE_CONSTRAINT_CATEGORY = eINSTANCE.getXSDWildcard_NamespaceConstraintCategory();

		/**
		 * The meta object literal for the '<em><b>Namespace Constraint</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_WILDCARD__NAMESPACE_CONSTRAINT = eINSTANCE.getXSDWildcard_NamespaceConstraint();

		/**
		 * The meta object literal for the '<em><b>Process Contents</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_WILDCARD__PROCESS_CONTENTS = eINSTANCE.getXSDWildcard_ProcessContents();

		/**
		 * The meta object literal for the '<em><b>Lexical Namespace Constraint</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSD_WILDCARD__LEXICAL_NAMESPACE_CONSTRAINT = eINSTANCE.getXSDWildcard_LexicalNamespaceConstraint();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_WILDCARD__ANNOTATION = eINSTANCE.getXSDWildcard_Annotation();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSD_WILDCARD__ANNOTATIONS = eINSTANCE.getXSDWildcard_Annotations();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.impl.XSDXPathDefinitionImpl <em>XSDX Path Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.impl.XSDXPathDefinitionImpl
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDXPathDefinition()
		 * @generated
		 */
		EClass XSDX_PATH_DEFINITION = eINSTANCE.getXSDXPathDefinition();

		/**
		 * The meta object literal for the '<em><b>Variety</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSDX_PATH_DEFINITION__VARIETY = eINSTANCE.getXSDXPathDefinition_Variety();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XSDX_PATH_DEFINITION__VALUE = eINSTANCE.getXSDXPathDefinition_Value();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSDX_PATH_DEFINITION__ANNOTATION = eINSTANCE.getXSDXPathDefinition_Annotation();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.XSDAttributeUseCategory <em>XSD Attribute Use Category</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.XSDAttributeUseCategory
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDAttributeUseCategory()
		 * @generated
		 */
		EEnum XSD_ATTRIBUTE_USE_CATEGORY = eINSTANCE.getXSDAttributeUseCategory();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.XSDCardinality <em>XSD Cardinality</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.XSDCardinality
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDCardinality()
		 * @generated
		 */
		EEnum XSD_CARDINALITY = eINSTANCE.getXSDCardinality();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.XSDComplexFinal <em>XSD Complex Final</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.XSDComplexFinal
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDComplexFinal()
		 * @generated
		 */
		EEnum XSD_COMPLEX_FINAL = eINSTANCE.getXSDComplexFinal();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.XSDCompositor <em>XSD Compositor</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.XSDCompositor
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDCompositor()
		 * @generated
		 */
		EEnum XSD_COMPOSITOR = eINSTANCE.getXSDCompositor();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.XSDConstraint <em>XSD Constraint</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.XSDConstraint
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDConstraint()
		 * @generated
		 */
		EEnum XSD_CONSTRAINT = eINSTANCE.getXSDConstraint();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.XSDContentTypeCategory <em>XSD Content Type Category</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.XSDContentTypeCategory
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDContentTypeCategory()
		 * @generated
		 */
		EEnum XSD_CONTENT_TYPE_CATEGORY = eINSTANCE.getXSDContentTypeCategory();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.XSDDerivationMethod <em>XSD Derivation Method</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.XSDDerivationMethod
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDDerivationMethod()
		 * @generated
		 */
		EEnum XSD_DERIVATION_METHOD = eINSTANCE.getXSDDerivationMethod();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.XSDDiagnosticSeverity <em>XSD Diagnostic Severity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.XSDDiagnosticSeverity
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDDiagnosticSeverity()
		 * @generated
		 */
		EEnum XSD_DIAGNOSTIC_SEVERITY = eINSTANCE.getXSDDiagnosticSeverity();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.XSDDisallowedSubstitutions <em>XSD Disallowed Substitutions</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.XSDDisallowedSubstitutions
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDDisallowedSubstitutions()
		 * @generated
		 */
		EEnum XSD_DISALLOWED_SUBSTITUTIONS = eINSTANCE.getXSDDisallowedSubstitutions();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.XSDForm <em>XSD Form</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.XSDForm
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDForm()
		 * @generated
		 */
		EEnum XSD_FORM = eINSTANCE.getXSDForm();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.XSDIdentityConstraintCategory <em>XSD Identity Constraint Category</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.XSDIdentityConstraintCategory
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDIdentityConstraintCategory()
		 * @generated
		 */
		EEnum XSD_IDENTITY_CONSTRAINT_CATEGORY = eINSTANCE.getXSDIdentityConstraintCategory();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.XSDNamespaceConstraintCategory <em>XSD Namespace Constraint Category</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.XSDNamespaceConstraintCategory
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDNamespaceConstraintCategory()
		 * @generated
		 */
		EEnum XSD_NAMESPACE_CONSTRAINT_CATEGORY = eINSTANCE.getXSDNamespaceConstraintCategory();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.XSDOrdered <em>XSD Ordered</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.XSDOrdered
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDOrdered()
		 * @generated
		 */
		EEnum XSD_ORDERED = eINSTANCE.getXSDOrdered();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.XSDProcessContents <em>XSD Process Contents</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.XSDProcessContents
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDProcessContents()
		 * @generated
		 */
		EEnum XSD_PROCESS_CONTENTS = eINSTANCE.getXSDProcessContents();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.XSDProhibitedSubstitutions <em>XSD Prohibited Substitutions</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.XSDProhibitedSubstitutions
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDProhibitedSubstitutions()
		 * @generated
		 */
		EEnum XSD_PROHIBITED_SUBSTITUTIONS = eINSTANCE.getXSDProhibitedSubstitutions();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.XSDSimpleFinal <em>XSD Simple Final</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.XSDSimpleFinal
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDSimpleFinal()
		 * @generated
		 */
		EEnum XSD_SIMPLE_FINAL = eINSTANCE.getXSDSimpleFinal();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.XSDSubstitutionGroupExclusions <em>XSD Substitution Group Exclusions</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.XSDSubstitutionGroupExclusions
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDSubstitutionGroupExclusions()
		 * @generated
		 */
		EEnum XSD_SUBSTITUTION_GROUP_EXCLUSIONS = eINSTANCE.getXSDSubstitutionGroupExclusions();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.XSDVariety <em>XSD Variety</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.XSDVariety
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDVariety()
		 * @generated
		 */
		EEnum XSD_VARIETY = eINSTANCE.getXSDVariety();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.XSDWhiteSpace <em>XSD White Space</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.XSDWhiteSpace
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDWhiteSpace()
		 * @generated
		 */
		EEnum XSD_WHITE_SPACE = eINSTANCE.getXSDWhiteSpace();

		/**
		 * The meta object literal for the '{@link tesis.xsd_ecore.xsd.XSDXPathVariety <em>XSDX Path Variety</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.xsd_ecore.xsd.XSDXPathVariety
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getXSDXPathVariety()
		 * @generated
		 */
		EEnum XSDX_PATH_VARIETY = eINSTANCE.getXSDXPathVariety();

		/**
		 * The meta object literal for the '<em>DOM Attr</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.dom.Attr
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getDOMAttr()
		 * @generated
		 */
		EDataType DOM_ATTR = eINSTANCE.getDOMAttr();

		/**
		 * The meta object literal for the '<em>DOM Document</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.dom.Document
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getDOMDocument()
		 * @generated
		 */
		EDataType DOM_DOCUMENT = eINSTANCE.getDOMDocument();

		/**
		 * The meta object literal for the '<em>DOM Element</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.dom.Element
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getDOMElement()
		 * @generated
		 */
		EDataType DOM_ELEMENT = eINSTANCE.getDOMElement();

		/**
		 * The meta object literal for the '<em>DOM Node</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.dom.Node
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getDOMNode()
		 * @generated
		 */
		EDataType DOM_NODE = eINSTANCE.getDOMNode();

		/**
		 * The meta object literal for the '<em>Value</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see tesis.xsd_ecore.xsd.impl.XsdPackageImpl#getValue()
		 * @generated
		 */
		EDataType VALUE = eINSTANCE.getValue();

	}

} //XsdPackage
