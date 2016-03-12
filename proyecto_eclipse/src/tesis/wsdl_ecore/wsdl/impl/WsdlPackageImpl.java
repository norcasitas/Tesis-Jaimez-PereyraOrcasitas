/**
 */
package tesis.wsdl_ecore.wsdl.impl;

import java.net.URL;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.wsdl.OperationType;
import javax.wsdl.WSDLException;

import javax.wsdl.extensions.AttributeExtensible;
import javax.wsdl.extensions.ElementExtensible;
import javax.wsdl.extensions.ExtensionRegistry;

import javax.wsdl.extensions.schema.Schema;

import javax.xml.namespace.QName;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import tesis.wsdl_ecore.wsdl.Binding;
import tesis.wsdl_ecore.wsdl.BindingFault;
import tesis.wsdl_ecore.wsdl.BindingInput;
import tesis.wsdl_ecore.wsdl.BindingOperation;
import tesis.wsdl_ecore.wsdl.BindingOutput;
import tesis.wsdl_ecore.wsdl.Definition;
import tesis.wsdl_ecore.wsdl.ExtensibilityElement;
import tesis.wsdl_ecore.wsdl.ExtensibleElement;
import tesis.wsdl_ecore.wsdl.Fault;
import tesis.wsdl_ecore.wsdl.Import;
import tesis.wsdl_ecore.wsdl.Input;
import tesis.wsdl_ecore.wsdl.Message;
import tesis.wsdl_ecore.wsdl.MessageReference;
import tesis.wsdl_ecore.wsdl.Namespace;
import tesis.wsdl_ecore.wsdl.Operation;
import tesis.wsdl_ecore.wsdl.Output;
import tesis.wsdl_ecore.wsdl.Part;
import tesis.wsdl_ecore.wsdl.Port;
import tesis.wsdl_ecore.wsdl.PortType;
import tesis.wsdl_ecore.wsdl.Service;
import tesis.wsdl_ecore.wsdl.Types;
import tesis.wsdl_ecore.wsdl.UnknownExtensibilityElement;
import tesis.wsdl_ecore.wsdl.WSDLElement;
import tesis.wsdl_ecore.wsdl.WsdlFactory;
import tesis.wsdl_ecore.wsdl.WsdlPackage;
import tesis.wsdl_ecore.wsdl.XSDSchemaExtensibilityElement;

import tesis.xsd_ecore.xsd.XsdPackage;

import tesis.xsd_ecore.xsd.impl.XsdPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WsdlPackageImpl extends EPackageImpl implements WsdlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wsdlElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensibilityElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensibleElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass faultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingFaultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namespaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iPortTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iFaultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iBindingOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iBindingInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iBindingOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iBindingFaultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iExtensibilityElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iImportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iurlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iExtensionRegistryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iIteratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iTypesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unknownExtensibilityElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xsdSchemaExtensibilityElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iElementExtensibleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iAttributeExtensibleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType qNameEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType operationTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType domElementEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType wsdlExceptionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType domDocumentEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see tesis.wsdl_ecore.wsdl.WsdlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WsdlPackageImpl() {
		super(eNS_URI, WsdlFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link WsdlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WsdlPackage init() {
		if (isInited) return (WsdlPackage)EPackage.Registry.INSTANCE.getEPackage(WsdlPackage.eNS_URI);

		// Obtain or create and register package
		WsdlPackageImpl theWsdlPackage = (WsdlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof WsdlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new WsdlPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		XsdPackageImpl theXsdPackage = (XsdPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XsdPackage.eNS_URI) instanceof XsdPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XsdPackage.eNS_URI) : XsdPackage.eINSTANCE);

		// Create package meta-data objects
		theWsdlPackage.createPackageContents();
		theXsdPackage.createPackageContents();

		// Initialize created meta-data
		theWsdlPackage.initializePackageContents();
		theXsdPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theWsdlPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WsdlPackage.eNS_URI, theWsdlPackage);
		return theWsdlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWSDLElement() {
		return wsdlElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWSDLElement_DocumentationElement() {
		return (EAttribute)wsdlElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWSDLElement_Element() {
		return (EAttribute)wsdlElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWSDLElement__GetEnclosingDefinition() {
		return wsdlElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWSDLElement__SetEnclosingDefinition__Definition() {
		return wsdlElementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortType() {
		return portTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortType_QName() {
		return (EAttribute)portTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortType_Undefined() {
		return (EAttribute)portTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortType_EOperations() {
		return (EReference)portTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_Style() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_Name() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_Undefined() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_EInput() {
		return (EReference)operationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_EOutput() {
		return (EReference)operationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_EFaults() {
		return (EReference)operationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_EParameterOrdering() {
		return (EReference)operationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessage() {
		return messageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_QName() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_Undefined() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_EParts() {
		return (EReference)messageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPart() {
		return partEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPart_Name() {
		return (EAttribute)partEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPart_ElementName() {
		return (EAttribute)partEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPart_TypeName() {
		return (EAttribute)partEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPart_TypeDefinition() {
		return (EReference)partEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPart_ElementDeclaration() {
		return (EReference)partEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPart_EMessage() {
		return (EReference)partEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinding() {
		return bindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinding_QName() {
		return (EAttribute)bindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinding_Undefined() {
		return (EAttribute)bindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinding_EPortType() {
		return (EReference)bindingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinding_EBindingOperations() {
		return (EReference)bindingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBindingOperation() {
		return bindingOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindingOperation_Name() {
		return (EAttribute)bindingOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindingOperation_EOperation() {
		return (EReference)bindingOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindingOperation_EBindingInput() {
		return (EReference)bindingOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindingOperation_EBindingOutput() {
		return (EReference)bindingOperationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindingOperation_EBindingFaults() {
		return (EReference)bindingOperationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_QName() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_Undefined() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_EPorts() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort() {
		return portEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_Name() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_EBinding() {
		return (EReference)portEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtensibilityElement() {
		return extensibilityElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtensibilityElement_Required() {
		return (EAttribute)extensibilityElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtensibilityElement_ElementType() {
		return (EAttribute)extensibilityElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefinition() {
		return definitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefinition_TargetNamespace() {
		return (EAttribute)definitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefinition_Location() {
		return (EAttribute)definitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefinition_QName() {
		return (EAttribute)definitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefinition_Encoding() {
		return (EAttribute)definitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinition_EImports() {
		return (EReference)definitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinition_ETypes() {
		return (EReference)definitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinition_EMessages() {
		return (EReference)definitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinition_EPortTypes() {
		return (EReference)definitionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinition_EBindings() {
		return (EReference)definitionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinition_EServices() {
		return (EReference)definitionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinition_ENamespaces() {
		return (EReference)definitionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDefinition__GetDocument() {
		return definitionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDefinition__SetDocument__Document() {
		return definitionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImport() {
		return importEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImport_NamespaceURI() {
		return (EAttribute)importEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImport_LocationURI() {
		return (EAttribute)importEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImport_EDefinition() {
		return (EReference)importEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImport_ESchema() {
		return (EReference)importEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImport__GetSchema() {
		return importEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImport__SetSchema__XSDSchema() {
		return importEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtensibleElement() {
		return extensibleElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtensibleElement_EExtensibilityElements() {
		return (EReference)extensibleElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInput() {
		return inputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutput() {
		return outputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFault() {
		return faultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBindingInput() {
		return bindingInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindingInput_Name() {
		return (EAttribute)bindingInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindingInput_EInput() {
		return (EReference)bindingInputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBindingInput__GetInput() {
		return bindingInputEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBindingInput__SetInput__Input() {
		return bindingInputEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBindingOutput() {
		return bindingOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindingOutput_Name() {
		return (EAttribute)bindingOutputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindingOutput_EOutput() {
		return (EReference)bindingOutputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBindingOutput__GetOutput() {
		return bindingOutputEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBindingOutput__SetOutput__Output() {
		return bindingOutputEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBindingFault() {
		return bindingFaultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindingFault_Name() {
		return (EAttribute)bindingFaultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindingFault_EFault() {
		return (EReference)bindingFaultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBindingFault__GetFault() {
		return bindingFaultEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBindingFault__SetFault__Fault() {
		return bindingFaultEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamespace() {
		return namespaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamespace_URI() {
		return (EAttribute)namespaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamespace_Prefix() {
		return (EAttribute)namespaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIPortType() {
		return iPortTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIPortType__AddOperation__Operation() {
		return iPortTypeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIPortType__GetOperation__String_String_String() {
		return iPortTypeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIPortType__GetOperations() {
		return iPortTypeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIOperation() {
		return iOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIOperation__AddFault__Fault() {
		return iOperationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIOperation__GetFault__String() {
		return iOperationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIOperation__GetFaults() {
		return iOperationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIOperation__GetParameterOrdering() {
		return iOperationEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIOperation__SetParameterOrdering__List() {
		return iOperationEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIOperation__GetInput() {
		return iOperationEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIOperation__SetInput__Input() {
		return iOperationEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIOperation__GetOutput() {
		return iOperationEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIOperation__SetOutput__Output() {
		return iOperationEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIInput() {
		return iInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIInput__GetMessage() {
		return iInputEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIInput__SetMessage__Message() {
		return iInputEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIOutput() {
		return iOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIOutput__GetMessage() {
		return iOutputEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIOutput__SetMessage__Message() {
		return iOutputEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIFault() {
		return iFaultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIFault__GetMessage() {
		return iFaultEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIFault__SetMessage__Message() {
		return iFaultEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIMessage() {
		return iMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIMessage__AddPart__Part() {
		return iMessageEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIMessage__GetPart__String() {
		return iMessageEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIMessage__GetParts() {
		return iMessageEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIMessage__GetOrderedParts__List() {
		return iMessageEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIPart() {
		return iPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIService() {
		return iServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIService__AddPort__Port() {
		return iServiceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIService__GetPorts() {
		return iServiceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIService__GetPort__String() {
		return iServiceEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIPort() {
		return iPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIPort__GetBinding() {
		return iPortEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIPort__SetBinding__Binding() {
		return iPortEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIBinding() {
		return iBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBinding__AddBindingOperation__BindingOperation() {
		return iBindingEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBinding__GetBindingOperation__String_String_String() {
		return iBindingEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBinding__GetBindingOperations() {
		return iBindingEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBinding__GetPortType() {
		return iBindingEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBinding__SetPortType__PortType() {
		return iBindingEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIBindingOperation() {
		return iBindingOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBindingOperation__AddBindingFault__BindingFault() {
		return iBindingOperationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBindingOperation__GetBindingFault__String() {
		return iBindingOperationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBindingOperation__GetBindingFaults() {
		return iBindingOperationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBindingOperation__GetOperation() {
		return iBindingOperationEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBindingOperation__SetOperation__Operation() {
		return iBindingOperationEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBindingOperation__GetBindingInput() {
		return iBindingOperationEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBindingOperation__SetBindingInput__BindingInput() {
		return iBindingOperationEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBindingOperation__GetBindingOutput() {
		return iBindingOperationEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBindingOperation__SetBindingOutput__BindingOutput() {
		return iBindingOperationEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIBindingInput() {
		return iBindingInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIBindingOutput() {
		return iBindingOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIBindingFault() {
		return iBindingFaultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIExtensibilityElement() {
		return iExtensibilityElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIDefinition() {
		return iDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIDefinition__AddBinding__Binding() {
		return iDefinitionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIDefinition__AddImport__Import() {
		return iDefinitionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIDefinition__AddMessage__Message() {
		return iDefinitionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIDefinition__AddNamespace__String_String() {
		return iDefinitionEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIDefinition__AddPortType__PortType() {
		return iDefinitionEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIDefinition__AddService__Service() {
		return iDefinitionEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIDefinition__CreateBindingFault() {
		return iDefinitionEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIDefinition__CreateBindingInput() {
		return iDefinitionEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIDefinition__CreateBindingOutput() {
		return iDefinitionEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIDefinition__CreateBindingOperation() {
		return iDefinitionEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIDefinition__CreateBinding() {
		return iDefinitionEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIDefinition__CreateFault() {
		return iDefinitionEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIDefinition__CreateImport() {
		return iDefinitionEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIDefinition__CreateInput() {
		return iDefinitionEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIDefinition__CreateMessage() {
		return iDefinitionEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIDefinition__CreateOperation() {
		return iDefinitionEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIDefinition__CreateOutput() {
		return iDefinitionEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIDefinition__CreatePart() {
		return iDefinitionEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIDefinition__CreatePort() {
		return iDefinitionEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIDefinition__CreatePortType() {
		return iDefinitionEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIDefinition__CreateService() {
		return iDefinitionEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIDefinition__GetBinding__QName() {
		return iDefinitionEClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIDefinition__GetBindings() {
		return iDefinitionEClass.getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIDefinition__GetImports() {
		return iDefinitionEClass.getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIDefinition__GetImports__String() {
		return iDefinitionEClass.getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIDefinition__GetMessage__QName() {
		return iDefinitionEClass.getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIDefinition__GetMessages() {
		return iDefinitionEClass.getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIDefinition__GetNamespace__String() {
		return iDefinitionEClass.getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIDefinition__GetNamespaces() {
		return iDefinitionEClass.getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIDefinition__GetPortType__QName() {
		return iDefinitionEClass.getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIDefinition__GetPortTypes() {
		return iDefinitionEClass.getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIDefinition__GetPrefix__String() {
		return iDefinitionEClass.getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIDefinition__GetService__QName() {
		return iDefinitionEClass.getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIDefinition__GetServices() {
		return iDefinitionEClass.getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIDefinition__GetExtensionRegistry() {
		return iDefinitionEClass.getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIDefinition__SetExtensionRegistry__ExtensionRegistry() {
		return iDefinitionEClass.getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIDefinition__GetDocumentBaseURI() {
		return iDefinitionEClass.getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIDefinition__SetDocumentBaseURI__String() {
		return iDefinitionEClass.getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIDefinition__CreateTypes() {
		return iDefinitionEClass.getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIDefinition__RemoveService__QName() {
		return iDefinitionEClass.getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIDefinition__RemoveBinding__QName() {
		return iDefinitionEClass.getEOperations().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIDefinition__RemovePortType__QName() {
		return iDefinitionEClass.getEOperations().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIDefinition__RemoveMessage__QName() {
		return iDefinitionEClass.getEOperations().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIDefinition__GetTypes() {
		return iDefinitionEClass.getEOperations().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIDefinition__SetTypes__Types() {
		return iDefinitionEClass.getEOperations().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIDefinition__ToString() {
		return iDefinitionEClass.getEOperations().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIImport() {
		return iImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIList() {
		return iListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIMap() {
		return iMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIURL() {
		return iurlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIExtensionRegistry() {
		return iExtensionRegistryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypes() {
		return typesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTypes__GetSchemas() {
		return typesEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTypes__GetSchemas__String() {
		return typesEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIIterator() {
		return iIteratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getITypes() {
		return iTypesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnknownExtensibilityElement() {
		return unknownExtensibilityElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnknownExtensibilityElement_Children() {
		return (EReference)unknownExtensibilityElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXSDSchemaExtensibilityElement() {
		return xsdSchemaExtensibilityElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXSDSchemaExtensibilityElement_DocumentBaseURI() {
		return (EAttribute)xsdSchemaExtensibilityElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXSDSchemaExtensibilityElement_Schema() {
		return (EReference)xsdSchemaExtensibilityElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageReference() {
		return messageReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageReference_Name() {
		return (EAttribute)messageReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageReference_EMessage() {
		return (EReference)messageReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIElementExtensible() {
		return iElementExtensibleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIElementExtensible__GetExtensibilityElements() {
		return iElementExtensibleEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIElementExtensible__AddExtensibilityElement__ExtensibilityElement() {
		return iElementExtensibleEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIAttributeExtensible() {
		return iAttributeExtensibleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIAttributeExtensible__GetExtensionAttribute__QName() {
		return iAttributeExtensibleEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIAttributeExtensible__SetExtensionAttribute__QName_Object() {
		return iAttributeExtensibleEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIAttributeExtensible__GetExtensionAttributes() {
		return iAttributeExtensibleEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIAttributeExtensible__GetNativeAttributeNames() {
		return iAttributeExtensibleEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIObject() {
		return iObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISchema() {
		return iSchemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getQName() {
		return qNameEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOperationType() {
		return operationTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDOMElement() {
		return domElementEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getWSDLException() {
		return wsdlExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDOMDocument() {
		return domDocumentEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WsdlFactory getWsdlFactory() {
		return (WsdlFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		wsdlElementEClass = createEClass(WSDL_ELEMENT);
		createEAttribute(wsdlElementEClass, WSDL_ELEMENT__DOCUMENTATION_ELEMENT);
		createEAttribute(wsdlElementEClass, WSDL_ELEMENT__ELEMENT);
		createEOperation(wsdlElementEClass, WSDL_ELEMENT___GET_ENCLOSING_DEFINITION);
		createEOperation(wsdlElementEClass, WSDL_ELEMENT___SET_ENCLOSING_DEFINITION__DEFINITION);

		portTypeEClass = createEClass(PORT_TYPE);
		createEAttribute(portTypeEClass, PORT_TYPE__QNAME);
		createEAttribute(portTypeEClass, PORT_TYPE__UNDEFINED);
		createEReference(portTypeEClass, PORT_TYPE__EOPERATIONS);

		operationEClass = createEClass(OPERATION);
		createEAttribute(operationEClass, OPERATION__STYLE);
		createEAttribute(operationEClass, OPERATION__NAME);
		createEAttribute(operationEClass, OPERATION__UNDEFINED);
		createEReference(operationEClass, OPERATION__EINPUT);
		createEReference(operationEClass, OPERATION__EOUTPUT);
		createEReference(operationEClass, OPERATION__EFAULTS);
		createEReference(operationEClass, OPERATION__EPARAMETER_ORDERING);

		messageEClass = createEClass(MESSAGE);
		createEAttribute(messageEClass, MESSAGE__QNAME);
		createEAttribute(messageEClass, MESSAGE__UNDEFINED);
		createEReference(messageEClass, MESSAGE__EPARTS);

		partEClass = createEClass(PART);
		createEAttribute(partEClass, PART__NAME);
		createEAttribute(partEClass, PART__ELEMENT_NAME);
		createEAttribute(partEClass, PART__TYPE_NAME);
		createEReference(partEClass, PART__TYPE_DEFINITION);
		createEReference(partEClass, PART__ELEMENT_DECLARATION);
		createEReference(partEClass, PART__EMESSAGE);

		bindingEClass = createEClass(BINDING);
		createEAttribute(bindingEClass, BINDING__QNAME);
		createEAttribute(bindingEClass, BINDING__UNDEFINED);
		createEReference(bindingEClass, BINDING__EPORT_TYPE);
		createEReference(bindingEClass, BINDING__EBINDING_OPERATIONS);

		bindingOperationEClass = createEClass(BINDING_OPERATION);
		createEAttribute(bindingOperationEClass, BINDING_OPERATION__NAME);
		createEReference(bindingOperationEClass, BINDING_OPERATION__EOPERATION);
		createEReference(bindingOperationEClass, BINDING_OPERATION__EBINDING_INPUT);
		createEReference(bindingOperationEClass, BINDING_OPERATION__EBINDING_OUTPUT);
		createEReference(bindingOperationEClass, BINDING_OPERATION__EBINDING_FAULTS);

		serviceEClass = createEClass(SERVICE);
		createEAttribute(serviceEClass, SERVICE__QNAME);
		createEAttribute(serviceEClass, SERVICE__UNDEFINED);
		createEReference(serviceEClass, SERVICE__EPORTS);

		portEClass = createEClass(PORT);
		createEAttribute(portEClass, PORT__NAME);
		createEReference(portEClass, PORT__EBINDING);

		extensibilityElementEClass = createEClass(EXTENSIBILITY_ELEMENT);
		createEAttribute(extensibilityElementEClass, EXTENSIBILITY_ELEMENT__REQUIRED);
		createEAttribute(extensibilityElementEClass, EXTENSIBILITY_ELEMENT__ELEMENT_TYPE);

		definitionEClass = createEClass(DEFINITION);
		createEAttribute(definitionEClass, DEFINITION__TARGET_NAMESPACE);
		createEAttribute(definitionEClass, DEFINITION__LOCATION);
		createEAttribute(definitionEClass, DEFINITION__QNAME);
		createEAttribute(definitionEClass, DEFINITION__ENCODING);
		createEReference(definitionEClass, DEFINITION__EIMPORTS);
		createEReference(definitionEClass, DEFINITION__ETYPES);
		createEReference(definitionEClass, DEFINITION__EMESSAGES);
		createEReference(definitionEClass, DEFINITION__EPORT_TYPES);
		createEReference(definitionEClass, DEFINITION__EBINDINGS);
		createEReference(definitionEClass, DEFINITION__ESERVICES);
		createEReference(definitionEClass, DEFINITION__ENAMESPACES);
		createEOperation(definitionEClass, DEFINITION___GET_DOCUMENT);
		createEOperation(definitionEClass, DEFINITION___SET_DOCUMENT__DOCUMENT);

		importEClass = createEClass(IMPORT);
		createEAttribute(importEClass, IMPORT__NAMESPACE_URI);
		createEAttribute(importEClass, IMPORT__LOCATION_URI);
		createEReference(importEClass, IMPORT__EDEFINITION);
		createEReference(importEClass, IMPORT__ESCHEMA);
		createEOperation(importEClass, IMPORT___GET_SCHEMA);
		createEOperation(importEClass, IMPORT___SET_SCHEMA__XSDSCHEMA);

		extensibleElementEClass = createEClass(EXTENSIBLE_ELEMENT);
		createEReference(extensibleElementEClass, EXTENSIBLE_ELEMENT__EEXTENSIBILITY_ELEMENTS);

		inputEClass = createEClass(INPUT);

		outputEClass = createEClass(OUTPUT);

		faultEClass = createEClass(FAULT);

		bindingInputEClass = createEClass(BINDING_INPUT);
		createEAttribute(bindingInputEClass, BINDING_INPUT__NAME);
		createEReference(bindingInputEClass, BINDING_INPUT__EINPUT);
		createEOperation(bindingInputEClass, BINDING_INPUT___GET_INPUT);
		createEOperation(bindingInputEClass, BINDING_INPUT___SET_INPUT__INPUT);

		bindingOutputEClass = createEClass(BINDING_OUTPUT);
		createEAttribute(bindingOutputEClass, BINDING_OUTPUT__NAME);
		createEReference(bindingOutputEClass, BINDING_OUTPUT__EOUTPUT);
		createEOperation(bindingOutputEClass, BINDING_OUTPUT___GET_OUTPUT);
		createEOperation(bindingOutputEClass, BINDING_OUTPUT___SET_OUTPUT__OUTPUT);

		bindingFaultEClass = createEClass(BINDING_FAULT);
		createEAttribute(bindingFaultEClass, BINDING_FAULT__NAME);
		createEReference(bindingFaultEClass, BINDING_FAULT__EFAULT);
		createEOperation(bindingFaultEClass, BINDING_FAULT___GET_FAULT);
		createEOperation(bindingFaultEClass, BINDING_FAULT___SET_FAULT__FAULT);

		namespaceEClass = createEClass(NAMESPACE);
		createEAttribute(namespaceEClass, NAMESPACE__URI);
		createEAttribute(namespaceEClass, NAMESPACE__PREFIX);

		iPortTypeEClass = createEClass(IPORT_TYPE);
		createEOperation(iPortTypeEClass, IPORT_TYPE___ADD_OPERATION__OPERATION);
		createEOperation(iPortTypeEClass, IPORT_TYPE___GET_OPERATION__STRING_STRING_STRING);
		createEOperation(iPortTypeEClass, IPORT_TYPE___GET_OPERATIONS);

		iOperationEClass = createEClass(IOPERATION);
		createEOperation(iOperationEClass, IOPERATION___ADD_FAULT__FAULT);
		createEOperation(iOperationEClass, IOPERATION___GET_FAULT__STRING);
		createEOperation(iOperationEClass, IOPERATION___GET_FAULTS);
		createEOperation(iOperationEClass, IOPERATION___GET_PARAMETER_ORDERING);
		createEOperation(iOperationEClass, IOPERATION___SET_PARAMETER_ORDERING__LIST);
		createEOperation(iOperationEClass, IOPERATION___GET_INPUT);
		createEOperation(iOperationEClass, IOPERATION___SET_INPUT__INPUT);
		createEOperation(iOperationEClass, IOPERATION___GET_OUTPUT);
		createEOperation(iOperationEClass, IOPERATION___SET_OUTPUT__OUTPUT);

		iInputEClass = createEClass(IINPUT);
		createEOperation(iInputEClass, IINPUT___GET_MESSAGE);
		createEOperation(iInputEClass, IINPUT___SET_MESSAGE__MESSAGE);

		iOutputEClass = createEClass(IOUTPUT);
		createEOperation(iOutputEClass, IOUTPUT___GET_MESSAGE);
		createEOperation(iOutputEClass, IOUTPUT___SET_MESSAGE__MESSAGE);

		iFaultEClass = createEClass(IFAULT);
		createEOperation(iFaultEClass, IFAULT___GET_MESSAGE);
		createEOperation(iFaultEClass, IFAULT___SET_MESSAGE__MESSAGE);

		iMessageEClass = createEClass(IMESSAGE);
		createEOperation(iMessageEClass, IMESSAGE___ADD_PART__PART);
		createEOperation(iMessageEClass, IMESSAGE___GET_PART__STRING);
		createEOperation(iMessageEClass, IMESSAGE___GET_PARTS);
		createEOperation(iMessageEClass, IMESSAGE___GET_ORDERED_PARTS__LIST);

		iPartEClass = createEClass(IPART);

		iServiceEClass = createEClass(ISERVICE);
		createEOperation(iServiceEClass, ISERVICE___ADD_PORT__PORT);
		createEOperation(iServiceEClass, ISERVICE___GET_PORTS);
		createEOperation(iServiceEClass, ISERVICE___GET_PORT__STRING);

		iPortEClass = createEClass(IPORT);
		createEOperation(iPortEClass, IPORT___GET_BINDING);
		createEOperation(iPortEClass, IPORT___SET_BINDING__BINDING);

		iBindingEClass = createEClass(IBINDING);
		createEOperation(iBindingEClass, IBINDING___ADD_BINDING_OPERATION__BINDINGOPERATION);
		createEOperation(iBindingEClass, IBINDING___GET_BINDING_OPERATION__STRING_STRING_STRING);
		createEOperation(iBindingEClass, IBINDING___GET_BINDING_OPERATIONS);
		createEOperation(iBindingEClass, IBINDING___GET_PORT_TYPE);
		createEOperation(iBindingEClass, IBINDING___SET_PORT_TYPE__PORTTYPE);

		iBindingOperationEClass = createEClass(IBINDING_OPERATION);
		createEOperation(iBindingOperationEClass, IBINDING_OPERATION___ADD_BINDING_FAULT__BINDINGFAULT);
		createEOperation(iBindingOperationEClass, IBINDING_OPERATION___GET_BINDING_FAULT__STRING);
		createEOperation(iBindingOperationEClass, IBINDING_OPERATION___GET_BINDING_FAULTS);
		createEOperation(iBindingOperationEClass, IBINDING_OPERATION___GET_OPERATION);
		createEOperation(iBindingOperationEClass, IBINDING_OPERATION___SET_OPERATION__OPERATION);
		createEOperation(iBindingOperationEClass, IBINDING_OPERATION___GET_BINDING_INPUT);
		createEOperation(iBindingOperationEClass, IBINDING_OPERATION___SET_BINDING_INPUT__BINDINGINPUT);
		createEOperation(iBindingOperationEClass, IBINDING_OPERATION___GET_BINDING_OUTPUT);
		createEOperation(iBindingOperationEClass, IBINDING_OPERATION___SET_BINDING_OUTPUT__BINDINGOUTPUT);

		iBindingInputEClass = createEClass(IBINDING_INPUT);

		iBindingOutputEClass = createEClass(IBINDING_OUTPUT);

		iBindingFaultEClass = createEClass(IBINDING_FAULT);

		iExtensibilityElementEClass = createEClass(IEXTENSIBILITY_ELEMENT);

		iDefinitionEClass = createEClass(IDEFINITION);
		createEOperation(iDefinitionEClass, IDEFINITION___ADD_BINDING__BINDING);
		createEOperation(iDefinitionEClass, IDEFINITION___ADD_IMPORT__IMPORT);
		createEOperation(iDefinitionEClass, IDEFINITION___ADD_MESSAGE__MESSAGE);
		createEOperation(iDefinitionEClass, IDEFINITION___ADD_NAMESPACE__STRING_STRING);
		createEOperation(iDefinitionEClass, IDEFINITION___ADD_PORT_TYPE__PORTTYPE);
		createEOperation(iDefinitionEClass, IDEFINITION___ADD_SERVICE__SERVICE);
		createEOperation(iDefinitionEClass, IDEFINITION___CREATE_BINDING_FAULT);
		createEOperation(iDefinitionEClass, IDEFINITION___CREATE_BINDING_INPUT);
		createEOperation(iDefinitionEClass, IDEFINITION___CREATE_BINDING_OUTPUT);
		createEOperation(iDefinitionEClass, IDEFINITION___CREATE_BINDING_OPERATION);
		createEOperation(iDefinitionEClass, IDEFINITION___CREATE_BINDING);
		createEOperation(iDefinitionEClass, IDEFINITION___CREATE_FAULT);
		createEOperation(iDefinitionEClass, IDEFINITION___CREATE_IMPORT);
		createEOperation(iDefinitionEClass, IDEFINITION___CREATE_INPUT);
		createEOperation(iDefinitionEClass, IDEFINITION___CREATE_MESSAGE);
		createEOperation(iDefinitionEClass, IDEFINITION___CREATE_OPERATION);
		createEOperation(iDefinitionEClass, IDEFINITION___CREATE_OUTPUT);
		createEOperation(iDefinitionEClass, IDEFINITION___CREATE_PART);
		createEOperation(iDefinitionEClass, IDEFINITION___CREATE_PORT);
		createEOperation(iDefinitionEClass, IDEFINITION___CREATE_PORT_TYPE);
		createEOperation(iDefinitionEClass, IDEFINITION___CREATE_SERVICE);
		createEOperation(iDefinitionEClass, IDEFINITION___GET_BINDING__QNAME);
		createEOperation(iDefinitionEClass, IDEFINITION___GET_BINDINGS);
		createEOperation(iDefinitionEClass, IDEFINITION___GET_IMPORTS);
		createEOperation(iDefinitionEClass, IDEFINITION___GET_IMPORTS__STRING);
		createEOperation(iDefinitionEClass, IDEFINITION___GET_MESSAGE__QNAME);
		createEOperation(iDefinitionEClass, IDEFINITION___GET_MESSAGES);
		createEOperation(iDefinitionEClass, IDEFINITION___GET_NAMESPACE__STRING);
		createEOperation(iDefinitionEClass, IDEFINITION___GET_NAMESPACES);
		createEOperation(iDefinitionEClass, IDEFINITION___GET_PORT_TYPE__QNAME);
		createEOperation(iDefinitionEClass, IDEFINITION___GET_PORT_TYPES);
		createEOperation(iDefinitionEClass, IDEFINITION___GET_PREFIX__STRING);
		createEOperation(iDefinitionEClass, IDEFINITION___GET_SERVICE__QNAME);
		createEOperation(iDefinitionEClass, IDEFINITION___GET_SERVICES);
		createEOperation(iDefinitionEClass, IDEFINITION___GET_EXTENSION_REGISTRY);
		createEOperation(iDefinitionEClass, IDEFINITION___SET_EXTENSION_REGISTRY__EXTENSIONREGISTRY);
		createEOperation(iDefinitionEClass, IDEFINITION___GET_DOCUMENT_BASE_URI);
		createEOperation(iDefinitionEClass, IDEFINITION___SET_DOCUMENT_BASE_URI__STRING);
		createEOperation(iDefinitionEClass, IDEFINITION___CREATE_TYPES);
		createEOperation(iDefinitionEClass, IDEFINITION___REMOVE_SERVICE__QNAME);
		createEOperation(iDefinitionEClass, IDEFINITION___REMOVE_BINDING__QNAME);
		createEOperation(iDefinitionEClass, IDEFINITION___REMOVE_PORT_TYPE__QNAME);
		createEOperation(iDefinitionEClass, IDEFINITION___REMOVE_MESSAGE__QNAME);
		createEOperation(iDefinitionEClass, IDEFINITION___GET_TYPES);
		createEOperation(iDefinitionEClass, IDEFINITION___SET_TYPES__TYPES);
		createEOperation(iDefinitionEClass, IDEFINITION___TO_STRING);

		iImportEClass = createEClass(IIMPORT);

		iListEClass = createEClass(ILIST);

		iMapEClass = createEClass(IMAP);

		iurlEClass = createEClass(IURL);

		iExtensionRegistryEClass = createEClass(IEXTENSION_REGISTRY);

		typesEClass = createEClass(TYPES);
		createEOperation(typesEClass, TYPES___GET_SCHEMAS);
		createEOperation(typesEClass, TYPES___GET_SCHEMAS__STRING);

		iIteratorEClass = createEClass(IITERATOR);

		iTypesEClass = createEClass(ITYPES);

		unknownExtensibilityElementEClass = createEClass(UNKNOWN_EXTENSIBILITY_ELEMENT);
		createEReference(unknownExtensibilityElementEClass, UNKNOWN_EXTENSIBILITY_ELEMENT__CHILDREN);

		xsdSchemaExtensibilityElementEClass = createEClass(XSD_SCHEMA_EXTENSIBILITY_ELEMENT);
		createEAttribute(xsdSchemaExtensibilityElementEClass, XSD_SCHEMA_EXTENSIBILITY_ELEMENT__DOCUMENT_BASE_URI);
		createEReference(xsdSchemaExtensibilityElementEClass, XSD_SCHEMA_EXTENSIBILITY_ELEMENT__SCHEMA);

		messageReferenceEClass = createEClass(MESSAGE_REFERENCE);
		createEAttribute(messageReferenceEClass, MESSAGE_REFERENCE__NAME);
		createEReference(messageReferenceEClass, MESSAGE_REFERENCE__EMESSAGE);

		iElementExtensibleEClass = createEClass(IELEMENT_EXTENSIBLE);
		createEOperation(iElementExtensibleEClass, IELEMENT_EXTENSIBLE___GET_EXTENSIBILITY_ELEMENTS);
		createEOperation(iElementExtensibleEClass, IELEMENT_EXTENSIBLE___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT);

		iAttributeExtensibleEClass = createEClass(IATTRIBUTE_EXTENSIBLE);
		createEOperation(iAttributeExtensibleEClass, IATTRIBUTE_EXTENSIBLE___GET_EXTENSION_ATTRIBUTE__QNAME);
		createEOperation(iAttributeExtensibleEClass, IATTRIBUTE_EXTENSIBLE___SET_EXTENSION_ATTRIBUTE__QNAME_OBJECT);
		createEOperation(iAttributeExtensibleEClass, IATTRIBUTE_EXTENSIBLE___GET_EXTENSION_ATTRIBUTES);
		createEOperation(iAttributeExtensibleEClass, IATTRIBUTE_EXTENSIBLE___GET_NATIVE_ATTRIBUTE_NAMES);

		iObjectEClass = createEClass(IOBJECT);

		iSchemaEClass = createEClass(ISCHEMA);

		// Create data types
		qNameEDataType = createEDataType(QNAME);
		operationTypeEDataType = createEDataType(OPERATION_TYPE);
		domElementEDataType = createEDataType(DOM_ELEMENT);
		wsdlExceptionEDataType = createEDataType(WSDL_EXCEPTION);
		domDocumentEDataType = createEDataType(DOM_DOCUMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XsdPackage theXsdPackage = (XsdPackage)EPackage.Registry.INSTANCE.getEPackage(XsdPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		portTypeEClass.getESuperTypes().add(this.getExtensibleElement());
		portTypeEClass.getESuperTypes().add(this.getIPortType());
		operationEClass.getESuperTypes().add(this.getExtensibleElement());
		operationEClass.getESuperTypes().add(this.getIOperation());
		messageEClass.getESuperTypes().add(this.getExtensibleElement());
		messageEClass.getESuperTypes().add(this.getIMessage());
		partEClass.getESuperTypes().add(this.getExtensibleElement());
		partEClass.getESuperTypes().add(this.getIPart());
		bindingEClass.getESuperTypes().add(this.getExtensibleElement());
		bindingEClass.getESuperTypes().add(this.getIBinding());
		bindingOperationEClass.getESuperTypes().add(this.getExtensibleElement());
		bindingOperationEClass.getESuperTypes().add(this.getIBindingOperation());
		serviceEClass.getESuperTypes().add(this.getExtensibleElement());
		serviceEClass.getESuperTypes().add(this.getIService());
		portEClass.getESuperTypes().add(this.getExtensibleElement());
		portEClass.getESuperTypes().add(this.getIPort());
		extensibilityElementEClass.getESuperTypes().add(this.getWSDLElement());
		extensibilityElementEClass.getESuperTypes().add(this.getIExtensibilityElement());
		definitionEClass.getESuperTypes().add(this.getExtensibleElement());
		definitionEClass.getESuperTypes().add(this.getIDefinition());
		importEClass.getESuperTypes().add(this.getExtensibleElement());
		importEClass.getESuperTypes().add(this.getIImport());
		extensibleElementEClass.getESuperTypes().add(this.getWSDLElement());
		extensibleElementEClass.getESuperTypes().add(this.getIElementExtensible());
		extensibleElementEClass.getESuperTypes().add(this.getIAttributeExtensible());
		inputEClass.getESuperTypes().add(this.getMessageReference());
		inputEClass.getESuperTypes().add(this.getIInput());
		outputEClass.getESuperTypes().add(this.getMessageReference());
		outputEClass.getESuperTypes().add(this.getIOutput());
		faultEClass.getESuperTypes().add(this.getMessageReference());
		faultEClass.getESuperTypes().add(this.getIFault());
		bindingInputEClass.getESuperTypes().add(this.getExtensibleElement());
		bindingInputEClass.getESuperTypes().add(this.getIBindingInput());
		bindingOutputEClass.getESuperTypes().add(this.getExtensibleElement());
		bindingOutputEClass.getESuperTypes().add(this.getIBindingOutput());
		bindingFaultEClass.getESuperTypes().add(this.getExtensibleElement());
		bindingFaultEClass.getESuperTypes().add(this.getIBindingFault());
		iPortTypeEClass.getESuperTypes().add(this.getIAttributeExtensible());
		iOperationEClass.getESuperTypes().add(this.getIElementExtensible());
		iInputEClass.getESuperTypes().add(this.getIAttributeExtensible());
		iOutputEClass.getESuperTypes().add(this.getIAttributeExtensible());
		iFaultEClass.getESuperTypes().add(this.getIAttributeExtensible());
		iMessageEClass.getESuperTypes().add(this.getIElementExtensible());
		iPartEClass.getESuperTypes().add(this.getIAttributeExtensible());
		iServiceEClass.getESuperTypes().add(this.getIElementExtensible());
		iPortEClass.getESuperTypes().add(this.getIElementExtensible());
		iBindingEClass.getESuperTypes().add(this.getIElementExtensible());
		iBindingOperationEClass.getESuperTypes().add(this.getIElementExtensible());
		iBindingInputEClass.getESuperTypes().add(this.getIElementExtensible());
		iBindingOutputEClass.getESuperTypes().add(this.getIElementExtensible());
		iBindingFaultEClass.getESuperTypes().add(this.getIElementExtensible());
		iDefinitionEClass.getESuperTypes().add(this.getIElementExtensible());
		iImportEClass.getESuperTypes().add(this.getIAttributeExtensible());
		typesEClass.getESuperTypes().add(this.getExtensibleElement());
		typesEClass.getESuperTypes().add(this.getITypes());
		unknownExtensibilityElementEClass.getESuperTypes().add(this.getExtensibilityElement());
		xsdSchemaExtensibilityElementEClass.getESuperTypes().add(this.getExtensibilityElement());
		xsdSchemaExtensibilityElementEClass.getESuperTypes().add(this.getISchema());
		messageReferenceEClass.getESuperTypes().add(this.getExtensibleElement());
		iSchemaEClass.getESuperTypes().add(this.getIExtensibilityElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(wsdlElementEClass, WSDLElement.class, "WSDLElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWSDLElement_DocumentationElement(), this.getDOMElement(), "documentationElement", null, 0, 1, WSDLElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWSDLElement_Element(), this.getDOMElement(), "element", null, 0, 1, WSDLElement.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getWSDLElement__GetEnclosingDefinition(), this.getDefinition(), "getEnclosingDefinition", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getWSDLElement__SetEnclosingDefinition__Definition(), null, "setEnclosingDefinition", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDefinition(), "definition", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(portTypeEClass, PortType.class, "PortType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPortType_QName(), this.getQName(), "qName", null, 0, 1, PortType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPortType_Undefined(), ecorePackage.getEBoolean(), "undefined", null, 0, 1, PortType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPortType_EOperations(), this.getOperation(), null, "eOperations", null, 0, -1, PortType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperation_Style(), this.getOperationType(), "style", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_Name(), ecorePackage.getEString(), "name", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_Undefined(), ecorePackage.getEBoolean(), "undefined", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_EInput(), this.getInput(), null, "eInput", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_EOutput(), this.getOutput(), null, "eOutput", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_EFaults(), this.getFault(), null, "eFaults", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_EParameterOrdering(), this.getPart(), null, "eParameterOrdering", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageEClass, Message.class, "Message", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessage_QName(), this.getQName(), "qName", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_Undefined(), ecorePackage.getEBoolean(), "undefined", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessage_EParts(), this.getPart(), null, "eParts", null, 0, -1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partEClass, Part.class, "Part", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPart_Name(), ecorePackage.getEString(), "name", null, 0, 1, Part.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPart_ElementName(), this.getQName(), "elementName", null, 0, 1, Part.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPart_TypeName(), this.getQName(), "typeName", null, 0, 1, Part.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPart_TypeDefinition(), theXsdPackage.getXSDTypeDefinition(), null, "typeDefinition", null, 0, 1, Part.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPart_ElementDeclaration(), theXsdPackage.getXSDElementDeclaration(), null, "elementDeclaration", null, 0, 1, Part.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPart_EMessage(), this.getMessage(), null, "eMessage", null, 0, 1, Part.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bindingEClass, Binding.class, "Binding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBinding_QName(), this.getQName(), "qName", null, 0, 1, Binding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinding_Undefined(), ecorePackage.getEBoolean(), "undefined", null, 0, 1, Binding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinding_EPortType(), this.getPortType(), null, "ePortType", null, 1, 1, Binding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinding_EBindingOperations(), this.getBindingOperation(), null, "eBindingOperations", null, 0, -1, Binding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bindingOperationEClass, BindingOperation.class, "BindingOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBindingOperation_Name(), ecorePackage.getEString(), "name", null, 0, 1, BindingOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBindingOperation_EOperation(), this.getOperation(), null, "eOperation", null, 1, 1, BindingOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBindingOperation_EBindingInput(), this.getBindingInput(), null, "eBindingInput", null, 0, 1, BindingOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBindingOperation_EBindingOutput(), this.getBindingOutput(), null, "eBindingOutput", null, 0, 1, BindingOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBindingOperation_EBindingFaults(), this.getBindingFault(), null, "eBindingFaults", null, 0, -1, BindingOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getService_QName(), this.getQName(), "qName", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_Undefined(), ecorePackage.getEBoolean(), "undefined", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_EPorts(), this.getPort(), null, "ePorts", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portEClass, Port.class, "Port", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPort_Name(), ecorePackage.getEString(), "name", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPort_EBinding(), this.getBinding(), null, "eBinding", null, 1, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extensibilityElementEClass, ExtensibilityElement.class, "ExtensibilityElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExtensibilityElement_Required(), ecorePackage.getEBoolean(), "required", null, 0, 1, ExtensibilityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtensibilityElement_ElementType(), this.getQName(), "elementType", null, 0, 1, ExtensibilityElement.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(definitionEClass, Definition.class, "Definition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDefinition_TargetNamespace(), ecorePackage.getEString(), "targetNamespace", null, 0, 1, Definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefinition_Location(), ecorePackage.getEString(), "location", null, 0, 1, Definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefinition_QName(), this.getQName(), "qName", null, 0, 1, Definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefinition_Encoding(), ecorePackage.getEString(), "encoding", null, 0, 1, Definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDefinition_EImports(), this.getImport(), null, "eImports", null, 0, -1, Definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDefinition_ETypes(), this.getTypes(), null, "eTypes", null, 0, 1, Definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDefinition_EMessages(), this.getMessage(), null, "eMessages", null, 0, -1, Definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDefinition_EPortTypes(), this.getPortType(), null, "ePortTypes", null, 0, -1, Definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDefinition_EBindings(), this.getBinding(), null, "eBindings", null, 0, -1, Definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDefinition_EServices(), this.getService(), null, "eServices", null, 0, -1, Definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDefinition_ENamespaces(), this.getNamespace(), null, "eNamespaces", null, 0, -1, Definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDefinition__GetDocument(), this.getDOMDocument(), "getDocument", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDefinition__SetDocument__Document(), null, "setDocument", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDOMDocument(), "document", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImport_NamespaceURI(), ecorePackage.getEString(), "namespaceURI", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImport_LocationURI(), ecorePackage.getEString(), "locationURI", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImport_EDefinition(), this.getDefinition(), null, "eDefinition", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImport_ESchema(), theXsdPackage.getXSDSchema(), null, "eSchema", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getImport__GetSchema(), theXsdPackage.getXSDSchema(), "getSchema", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getImport__SetSchema__XSDSchema(), null, "setSchema", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXsdPackage.getXSDSchema(), "schema", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(extensibleElementEClass, ExtensibleElement.class, "ExtensibleElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtensibleElement_EExtensibilityElements(), this.getExtensibilityElement(), null, "eExtensibilityElements", null, 0, -1, ExtensibleElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputEClass, Input.class, "Input", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(outputEClass, Output.class, "Output", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(faultEClass, Fault.class, "Fault", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bindingInputEClass, BindingInput.class, "BindingInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBindingInput_Name(), ecorePackage.getEString(), "name", null, 0, 1, BindingInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBindingInput_EInput(), this.getInput(), null, "eInput", null, 1, 1, BindingInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getBindingInput__GetInput(), this.getIInput(), "getInput", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getBindingInput__SetInput__Input(), null, "setInput", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIInput(), "input", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(bindingOutputEClass, BindingOutput.class, "BindingOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBindingOutput_Name(), ecorePackage.getEString(), "name", null, 0, 1, BindingOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBindingOutput_EOutput(), this.getOutput(), null, "eOutput", null, 1, 1, BindingOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getBindingOutput__GetOutput(), this.getIOutput(), "getOutput", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getBindingOutput__SetOutput__Output(), null, "setOutput", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIOutput(), "output", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(bindingFaultEClass, BindingFault.class, "BindingFault", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBindingFault_Name(), ecorePackage.getEString(), "name", null, 0, 1, BindingFault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBindingFault_EFault(), this.getFault(), null, "eFault", null, 1, 1, BindingFault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getBindingFault__GetFault(), this.getIFault(), "getFault", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getBindingFault__SetFault__Fault(), null, "setFault", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIFault(), "fault", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(namespaceEClass, Namespace.class, "Namespace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamespace_URI(), ecorePackage.getEString(), "URI", null, 0, 1, Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNamespace_Prefix(), ecorePackage.getEString(), "prefix", null, 0, 1, Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iPortTypeEClass, javax.wsdl.PortType.class, "IPortType", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIPortType__AddOperation__Operation(), null, "addOperation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIOperation(), "operation", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIPortType__GetOperation__String_String_String(), this.getIOperation(), "getOperation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "inputName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "outputName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIPortType__GetOperations(), this.getIList(), "getOperations", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(iOperationEClass, javax.wsdl.Operation.class, "IOperation", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIOperation__AddFault__Fault(), null, "addFault", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIFault(), "fault", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIOperation__GetFault__String(), this.getIFault(), "getFault", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIOperation__GetFaults(), this.getIMap(), "getFaults", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIOperation__GetParameterOrdering(), this.getIList(), "getParameterOrdering", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIOperation__SetParameterOrdering__List(), null, "setParameterOrdering", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIList(), "parameterOrder", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIOperation__GetInput(), this.getIInput(), "getInput", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIOperation__SetInput__Input(), null, "setInput", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIInput(), "input", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIOperation__GetOutput(), this.getIOutput(), "getOutput", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIOperation__SetOutput__Output(), null, "setOutput", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIOutput(), "output", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(iInputEClass, javax.wsdl.Input.class, "IInput", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIInput__GetMessage(), this.getIMessage(), "getMessage", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIInput__SetMessage__Message(), null, "setMessage", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIMessage(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(iOutputEClass, javax.wsdl.Output.class, "IOutput", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIOutput__GetMessage(), this.getIMessage(), "getMessage", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIOutput__SetMessage__Message(), null, "setMessage", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIMessage(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(iFaultEClass, javax.wsdl.Fault.class, "IFault", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIFault__GetMessage(), this.getIMessage(), "getMessage", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIFault__SetMessage__Message(), null, "setMessage", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIMessage(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(iMessageEClass, javax.wsdl.Message.class, "IMessage", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIMessage__AddPart__Part(), null, "addPart", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIPart(), "part", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIMessage__GetPart__String(), this.getIPart(), "getPart", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIMessage__GetParts(), this.getIMap(), "getParts", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIMessage__GetOrderedParts__List(), this.getIList(), "getOrderedParts", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIList(), "partOrder", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(iPartEClass, javax.wsdl.Part.class, "IPart", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iServiceEClass, javax.wsdl.Service.class, "IService", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIService__AddPort__Port(), null, "addPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIPort(), "port", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIService__GetPorts(), this.getIMap(), "getPorts", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIService__GetPort__String(), this.getIPort(), "getPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(iPortEClass, javax.wsdl.Port.class, "IPort", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIPort__GetBinding(), this.getIBinding(), "getBinding", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIPort__SetBinding__Binding(), null, "setBinding", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIBinding(), "binding", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(iBindingEClass, javax.wsdl.Binding.class, "IBinding", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIBinding__AddBindingOperation__BindingOperation(), null, "addBindingOperation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIBindingOperation(), "bindingOperation", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIBinding__GetBindingOperation__String_String_String(), this.getIBindingOperation(), "getBindingOperation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "inputName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "outputName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIBinding__GetBindingOperations(), this.getIList(), "getBindingOperations", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIBinding__GetPortType(), this.getIPortType(), "getPortType", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIBinding__SetPortType__PortType(), null, "setPortType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIPortType(), "portType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(iBindingOperationEClass, javax.wsdl.BindingOperation.class, "IBindingOperation", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIBindingOperation__AddBindingFault__BindingFault(), null, "addBindingFault", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIBindingFault(), "bindingFault", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIBindingOperation__GetBindingFault__String(), this.getIBindingFault(), "getBindingFault", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIBindingOperation__GetBindingFaults(), this.getIMap(), "getBindingFaults", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIBindingOperation__GetOperation(), this.getIOperation(), "getOperation", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIBindingOperation__SetOperation__Operation(), null, "setOperation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIOperation(), "operation", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIBindingOperation__GetBindingInput(), this.getIBindingInput(), "getBindingInput", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIBindingOperation__SetBindingInput__BindingInput(), null, "setBindingInput", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIBindingInput(), "bindingInput", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIBindingOperation__GetBindingOutput(), this.getIBindingOutput(), "getBindingOutput", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIBindingOperation__SetBindingOutput__BindingOutput(), null, "setBindingOutput", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIBindingOutput(), "bindingOutput", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(iBindingInputEClass, javax.wsdl.BindingInput.class, "IBindingInput", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iBindingOutputEClass, javax.wsdl.BindingOutput.class, "IBindingOutput", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iBindingFaultEClass, javax.wsdl.BindingFault.class, "IBindingFault", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iExtensibilityElementEClass, javax.wsdl.extensions.ExtensibilityElement.class, "IExtensibilityElement", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iDefinitionEClass, javax.wsdl.Definition.class, "IDefinition", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIDefinition__AddBinding__Binding(), null, "addBinding", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIBinding(), "binding", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIDefinition__AddImport__Import(), null, "addImport", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIImport(), "importDef", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIDefinition__AddMessage__Message(), null, "addMessage", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIMessage(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIDefinition__AddNamespace__String_String(), null, "addNamespace", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "prefix", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "namespaceURI", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIDefinition__AddPortType__PortType(), null, "addPortType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIPortType(), "portType", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIDefinition__AddService__Service(), null, "addService", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIService(), "service", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIDefinition__CreateBindingFault(), this.getIBindingFault(), "createBindingFault", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIDefinition__CreateBindingInput(), this.getIBindingInput(), "createBindingInput", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIDefinition__CreateBindingOutput(), this.getIBindingOutput(), "createBindingOutput", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIDefinition__CreateBindingOperation(), this.getIBindingOperation(), "createBindingOperation", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIDefinition__CreateBinding(), this.getIBinding(), "createBinding", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIDefinition__CreateFault(), this.getIFault(), "createFault", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIDefinition__CreateImport(), this.getIImport(), "createImport", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIDefinition__CreateInput(), this.getIInput(), "createInput", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIDefinition__CreateMessage(), this.getIMessage(), "createMessage", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIDefinition__CreateOperation(), this.getIOperation(), "createOperation", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIDefinition__CreateOutput(), this.getIOutput(), "createOutput", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIDefinition__CreatePart(), this.getIPart(), "createPart", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIDefinition__CreatePort(), this.getIPort(), "createPort", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIDefinition__CreatePortType(), this.getIPortType(), "createPortType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIDefinition__CreateService(), this.getIService(), "createService", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIDefinition__GetBinding__QName(), this.getIBinding(), "getBinding", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getQName(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIDefinition__GetBindings(), this.getIMap(), "getBindings", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIDefinition__GetImports(), this.getIMap(), "getImports", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIDefinition__GetImports__String(), this.getIList(), "getImports", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "namespaceURI", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIDefinition__GetMessage__QName(), this.getIMessage(), "getMessage", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getQName(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIDefinition__GetMessages(), this.getIMap(), "getMessages", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIDefinition__GetNamespace__String(), ecorePackage.getEString(), "getNamespace", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "prefix", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIDefinition__GetNamespaces(), this.getIMap(), "getNamespaces", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIDefinition__GetPortType__QName(), this.getIPortType(), "getPortType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getQName(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIDefinition__GetPortTypes(), this.getIMap(), "getPortTypes", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIDefinition__GetPrefix__String(), ecorePackage.getEString(), "getPrefix", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "namespaceURI", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIDefinition__GetService__QName(), this.getIService(), "getService", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getQName(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIDefinition__GetServices(), this.getIMap(), "getServices", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIDefinition__GetExtensionRegistry(), this.getIExtensionRegistry(), "getExtensionRegistry", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIDefinition__SetExtensionRegistry__ExtensionRegistry(), null, "setExtensionRegistry", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIExtensionRegistry(), "extensionRegistry", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIDefinition__GetDocumentBaseURI(), ecorePackage.getEString(), "getDocumentBaseURI", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIDefinition__SetDocumentBaseURI__String(), null, "setDocumentBaseURI", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "documentBase", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIDefinition__CreateTypes(), this.getITypes(), "createTypes", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIDefinition__RemoveService__QName(), this.getIService(), "removeService", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getQName(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIDefinition__RemoveBinding__QName(), this.getIBinding(), "removeBinding", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getQName(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIDefinition__RemovePortType__QName(), this.getIPortType(), "removePortType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getQName(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIDefinition__RemoveMessage__QName(), this.getIMessage(), "removeMessage", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getQName(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIDefinition__GetTypes(), this.getITypes(), "getTypes", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIDefinition__SetTypes__Types(), null, "setTypes", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getITypes(), "types", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIDefinition__ToString(), ecorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(iImportEClass, javax.wsdl.Import.class, "IImport", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iListEClass, List.class, "IList", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iMapEClass, Map.class, "IMap", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iurlEClass, URL.class, "IURL", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iExtensionRegistryEClass, ExtensionRegistry.class, "IExtensionRegistry", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(typesEClass, Types.class, "Types", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getTypes__GetSchemas(), this.getIList(), "getSchemas", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTypes__GetSchemas__String(), this.getIList(), "getSchemas", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "namespaceURI", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(iIteratorEClass, Iterator.class, "IIterator", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iTypesEClass, javax.wsdl.Types.class, "ITypes", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(unknownExtensibilityElementEClass, UnknownExtensibilityElement.class, "UnknownExtensibilityElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnknownExtensibilityElement_Children(), this.getUnknownExtensibilityElement(), null, "children", null, 0, -1, UnknownExtensibilityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xsdSchemaExtensibilityElementEClass, XSDSchemaExtensibilityElement.class, "XSDSchemaExtensibilityElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXSDSchemaExtensibilityElement_DocumentBaseURI(), ecorePackage.getEString(), "documentBaseURI", null, 0, 1, XSDSchemaExtensibilityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXSDSchemaExtensibilityElement_Schema(), theXsdPackage.getXSDSchema(), null, "schema", null, 0, 1, XSDSchemaExtensibilityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageReferenceEClass, MessageReference.class, "MessageReference", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessageReference_Name(), ecorePackage.getEString(), "name", null, 0, 1, MessageReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessageReference_EMessage(), this.getMessage(), null, "eMessage", null, 1, 1, MessageReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iElementExtensibleEClass, ElementExtensible.class, "IElementExtensible", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIElementExtensible__GetExtensibilityElements(), this.getIList(), "getExtensibilityElements", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIElementExtensible__AddExtensibilityElement__ExtensibilityElement(), null, "addExtensibilityElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIExtensibilityElement(), "extElement", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(iAttributeExtensibleEClass, AttributeExtensible.class, "IAttributeExtensible", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIAttributeExtensible__GetExtensionAttribute__QName(), this.getIObject(), "getExtensionAttribute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getQName(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIAttributeExtensible__SetExtensionAttribute__QName_Object(), null, "setExtensionAttribute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getQName(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIObject(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIAttributeExtensible__GetExtensionAttributes(), this.getIMap(), "getExtensionAttributes", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIAttributeExtensible__GetNativeAttributeNames(), this.getIList(), "getNativeAttributeNames", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(iObjectEClass, Object.class, "IObject", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSchemaEClass, Schema.class, "ISchema", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		// Initialize data types
		initEDataType(qNameEDataType, QName.class, "QName", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(operationTypeEDataType, OperationType.class, "OperationType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(domElementEDataType, Element.class, "DOMElement", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(wsdlExceptionEDataType, WSDLException.class, "WSDLException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(domDocumentEDataType, Document.class, "DOMDocument", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //WsdlPackageImpl
