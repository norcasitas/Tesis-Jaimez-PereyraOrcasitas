/**
 */
package tesis.wsdl_ecore.wsdl.util;

import java.net.URL;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.wsdl.extensions.AttributeExtensible;
import javax.wsdl.extensions.ElementExtensible;
import javax.wsdl.extensions.ExtensionRegistry;

import javax.wsdl.extensions.schema.Schema;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import tesis.wsdl_ecore.wsdl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see tesis.wsdl_ecore.wsdl.WsdlPackage
 * @generated
 */
public class WsdlAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WsdlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WsdlAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = WsdlPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WsdlSwitch<Adapter> modelSwitch =
		new WsdlSwitch<Adapter>() {
			@Override
			public Adapter caseWSDLElement(WSDLElement object) {
				return createWSDLElementAdapter();
			}
			@Override
			public Adapter casePortType(PortType object) {
				return createPortTypeAdapter();
			}
			@Override
			public Adapter caseOperation(Operation object) {
				return createOperationAdapter();
			}
			@Override
			public Adapter caseMessage(Message object) {
				return createMessageAdapter();
			}
			@Override
			public Adapter casePart(Part object) {
				return createPartAdapter();
			}
			@Override
			public Adapter caseBinding(Binding object) {
				return createBindingAdapter();
			}
			@Override
			public Adapter caseBindingOperation(BindingOperation object) {
				return createBindingOperationAdapter();
			}
			@Override
			public Adapter caseService(Service object) {
				return createServiceAdapter();
			}
			@Override
			public Adapter casePort(Port object) {
				return createPortAdapter();
			}
			@Override
			public Adapter caseExtensibilityElement(ExtensibilityElement object) {
				return createExtensibilityElementAdapter();
			}
			@Override
			public Adapter caseDefinition(Definition object) {
				return createDefinitionAdapter();
			}
			@Override
			public Adapter caseImport(Import object) {
				return createImportAdapter();
			}
			@Override
			public Adapter caseExtensibleElement(ExtensibleElement object) {
				return createExtensibleElementAdapter();
			}
			@Override
			public Adapter caseInput(Input object) {
				return createInputAdapter();
			}
			@Override
			public Adapter caseOutput(Output object) {
				return createOutputAdapter();
			}
			@Override
			public Adapter caseFault(Fault object) {
				return createFaultAdapter();
			}
			@Override
			public Adapter caseBindingInput(BindingInput object) {
				return createBindingInputAdapter();
			}
			@Override
			public Adapter caseBindingOutput(BindingOutput object) {
				return createBindingOutputAdapter();
			}
			@Override
			public Adapter caseBindingFault(BindingFault object) {
				return createBindingFaultAdapter();
			}
			@Override
			public Adapter caseNamespace(Namespace object) {
				return createNamespaceAdapter();
			}
			@Override
			public Adapter caseIPortType(javax.wsdl.PortType object) {
				return createIPortTypeAdapter();
			}
			@Override
			public Adapter caseIOperation(javax.wsdl.Operation object) {
				return createIOperationAdapter();
			}
			@Override
			public Adapter caseIInput(javax.wsdl.Input object) {
				return createIInputAdapter();
			}
			@Override
			public Adapter caseIOutput(javax.wsdl.Output object) {
				return createIOutputAdapter();
			}
			@Override
			public Adapter caseIFault(javax.wsdl.Fault object) {
				return createIFaultAdapter();
			}
			@Override
			public Adapter caseIMessage(javax.wsdl.Message object) {
				return createIMessageAdapter();
			}
			@Override
			public Adapter caseIPart(javax.wsdl.Part object) {
				return createIPartAdapter();
			}
			@Override
			public Adapter caseIService(javax.wsdl.Service object) {
				return createIServiceAdapter();
			}
			@Override
			public Adapter caseIPort(javax.wsdl.Port object) {
				return createIPortAdapter();
			}
			@Override
			public Adapter caseIBinding(javax.wsdl.Binding object) {
				return createIBindingAdapter();
			}
			@Override
			public Adapter caseIBindingOperation(javax.wsdl.BindingOperation object) {
				return createIBindingOperationAdapter();
			}
			@Override
			public Adapter caseIBindingInput(javax.wsdl.BindingInput object) {
				return createIBindingInputAdapter();
			}
			@Override
			public Adapter caseIBindingOutput(javax.wsdl.BindingOutput object) {
				return createIBindingOutputAdapter();
			}
			@Override
			public Adapter caseIBindingFault(javax.wsdl.BindingFault object) {
				return createIBindingFaultAdapter();
			}
			@Override
			public Adapter caseIExtensibilityElement(javax.wsdl.extensions.ExtensibilityElement object) {
				return createIExtensibilityElementAdapter();
			}
			@Override
			public Adapter caseIDefinition(javax.wsdl.Definition object) {
				return createIDefinitionAdapter();
			}
			@Override
			public Adapter caseIImport(javax.wsdl.Import object) {
				return createIImportAdapter();
			}
			@Override
			public Adapter caseIList(List object) {
				return createIListAdapter();
			}
			@Override
			public Adapter caseIMap(Map object) {
				return createIMapAdapter();
			}
			@Override
			public Adapter caseIURL(URL object) {
				return createIURLAdapter();
			}
			@Override
			public Adapter caseIExtensionRegistry(ExtensionRegistry object) {
				return createIExtensionRegistryAdapter();
			}
			@Override
			public Adapter caseTypes(Types object) {
				return createTypesAdapter();
			}
			@Override
			public Adapter caseIIterator(Iterator object) {
				return createIIteratorAdapter();
			}
			@Override
			public Adapter caseITypes(javax.wsdl.Types object) {
				return createITypesAdapter();
			}
			@Override
			public Adapter caseUnknownExtensibilityElement(UnknownExtensibilityElement object) {
				return createUnknownExtensibilityElementAdapter();
			}
			@Override
			public Adapter caseXSDSchemaExtensibilityElement(XSDSchemaExtensibilityElement object) {
				return createXSDSchemaExtensibilityElementAdapter();
			}
			@Override
			public Adapter caseMessageReference(MessageReference object) {
				return createMessageReferenceAdapter();
			}
			@Override
			public Adapter caseIElementExtensible(ElementExtensible object) {
				return createIElementExtensibleAdapter();
			}
			@Override
			public Adapter caseIAttributeExtensible(AttributeExtensible object) {
				return createIAttributeExtensibleAdapter();
			}
			@Override
			public Adapter caseIObject(Object object) {
				return createIObjectAdapter();
			}
			@Override
			public Adapter caseISchema(Schema object) {
				return createISchemaAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link tesis.wsdl_ecore.wsdl.WSDLElement <em>WSDL Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.wsdl_ecore.wsdl.WSDLElement
	 * @generated
	 */
	public Adapter createWSDLElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.wsdl_ecore.wsdl.PortType <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.wsdl_ecore.wsdl.PortType
	 * @generated
	 */
	public Adapter createPortTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.wsdl_ecore.wsdl.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.wsdl_ecore.wsdl.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.wsdl_ecore.wsdl.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.wsdl_ecore.wsdl.Message
	 * @generated
	 */
	public Adapter createMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.wsdl_ecore.wsdl.Part <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.wsdl_ecore.wsdl.Part
	 * @generated
	 */
	public Adapter createPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.wsdl_ecore.wsdl.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.wsdl_ecore.wsdl.Binding
	 * @generated
	 */
	public Adapter createBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.wsdl_ecore.wsdl.BindingOperation <em>Binding Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.wsdl_ecore.wsdl.BindingOperation
	 * @generated
	 */
	public Adapter createBindingOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.wsdl_ecore.wsdl.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.wsdl_ecore.wsdl.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.wsdl_ecore.wsdl.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.wsdl_ecore.wsdl.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.wsdl_ecore.wsdl.ExtensibilityElement <em>Extensibility Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.wsdl_ecore.wsdl.ExtensibilityElement
	 * @generated
	 */
	public Adapter createExtensibilityElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.wsdl_ecore.wsdl.Definition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.wsdl_ecore.wsdl.Definition
	 * @generated
	 */
	public Adapter createDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.wsdl_ecore.wsdl.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.wsdl_ecore.wsdl.Import
	 * @generated
	 */
	public Adapter createImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.wsdl_ecore.wsdl.ExtensibleElement <em>Extensible Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.wsdl_ecore.wsdl.ExtensibleElement
	 * @generated
	 */
	public Adapter createExtensibleElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.wsdl_ecore.wsdl.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.wsdl_ecore.wsdl.Input
	 * @generated
	 */
	public Adapter createInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.wsdl_ecore.wsdl.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.wsdl_ecore.wsdl.Output
	 * @generated
	 */
	public Adapter createOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.wsdl_ecore.wsdl.Fault <em>Fault</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.wsdl_ecore.wsdl.Fault
	 * @generated
	 */
	public Adapter createFaultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.wsdl_ecore.wsdl.BindingInput <em>Binding Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.wsdl_ecore.wsdl.BindingInput
	 * @generated
	 */
	public Adapter createBindingInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.wsdl_ecore.wsdl.BindingOutput <em>Binding Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.wsdl_ecore.wsdl.BindingOutput
	 * @generated
	 */
	public Adapter createBindingOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.wsdl_ecore.wsdl.BindingFault <em>Binding Fault</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.wsdl_ecore.wsdl.BindingFault
	 * @generated
	 */
	public Adapter createBindingFaultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.wsdl_ecore.wsdl.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.wsdl_ecore.wsdl.Namespace
	 * @generated
	 */
	public Adapter createNamespaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javax.wsdl.PortType <em>IPort Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javax.wsdl.PortType
	 * @generated
	 */
	public Adapter createIPortTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javax.wsdl.Operation <em>IOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javax.wsdl.Operation
	 * @generated
	 */
	public Adapter createIOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javax.wsdl.Input <em>IInput</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javax.wsdl.Input
	 * @generated
	 */
	public Adapter createIInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javax.wsdl.Output <em>IOutput</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javax.wsdl.Output
	 * @generated
	 */
	public Adapter createIOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javax.wsdl.Fault <em>IFault</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javax.wsdl.Fault
	 * @generated
	 */
	public Adapter createIFaultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javax.wsdl.Message <em>IMessage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javax.wsdl.Message
	 * @generated
	 */
	public Adapter createIMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javax.wsdl.Part <em>IPart</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javax.wsdl.Part
	 * @generated
	 */
	public Adapter createIPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javax.wsdl.Service <em>IService</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javax.wsdl.Service
	 * @generated
	 */
	public Adapter createIServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javax.wsdl.Port <em>IPort</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javax.wsdl.Port
	 * @generated
	 */
	public Adapter createIPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javax.wsdl.Binding <em>IBinding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javax.wsdl.Binding
	 * @generated
	 */
	public Adapter createIBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javax.wsdl.BindingOperation <em>IBinding Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javax.wsdl.BindingOperation
	 * @generated
	 */
	public Adapter createIBindingOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javax.wsdl.BindingInput <em>IBinding Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javax.wsdl.BindingInput
	 * @generated
	 */
	public Adapter createIBindingInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javax.wsdl.BindingOutput <em>IBinding Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javax.wsdl.BindingOutput
	 * @generated
	 */
	public Adapter createIBindingOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javax.wsdl.BindingFault <em>IBinding Fault</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javax.wsdl.BindingFault
	 * @generated
	 */
	public Adapter createIBindingFaultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javax.wsdl.extensions.ExtensibilityElement <em>IExtensibility Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javax.wsdl.extensions.ExtensibilityElement
	 * @generated
	 */
	public Adapter createIExtensibilityElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javax.wsdl.Definition <em>IDefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javax.wsdl.Definition
	 * @generated
	 */
	public Adapter createIDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javax.wsdl.Import <em>IImport</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javax.wsdl.Import
	 * @generated
	 */
	public Adapter createIImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.List <em>IList</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.List
	 * @generated
	 */
	public Adapter createIListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map <em>IMap</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map
	 * @generated
	 */
	public Adapter createIMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.net.URL <em>IURL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.net.URL
	 * @generated
	 */
	public Adapter createIURLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javax.wsdl.extensions.ExtensionRegistry <em>IExtension Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javax.wsdl.extensions.ExtensionRegistry
	 * @generated
	 */
	public Adapter createIExtensionRegistryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.wsdl_ecore.wsdl.Types <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.wsdl_ecore.wsdl.Types
	 * @generated
	 */
	public Adapter createTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Iterator <em>IIterator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Iterator
	 * @generated
	 */
	public Adapter createIIteratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javax.wsdl.Types <em>ITypes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javax.wsdl.Types
	 * @generated
	 */
	public Adapter createITypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.wsdl_ecore.wsdl.UnknownExtensibilityElement <em>Unknown Extensibility Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.wsdl_ecore.wsdl.UnknownExtensibilityElement
	 * @generated
	 */
	public Adapter createUnknownExtensibilityElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.wsdl_ecore.wsdl.XSDSchemaExtensibilityElement <em>XSD Schema Extensibility Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.wsdl_ecore.wsdl.XSDSchemaExtensibilityElement
	 * @generated
	 */
	public Adapter createXSDSchemaExtensibilityElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.wsdl_ecore.wsdl.MessageReference <em>Message Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.wsdl_ecore.wsdl.MessageReference
	 * @generated
	 */
	public Adapter createMessageReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javax.wsdl.extensions.ElementExtensible <em>IElement Extensible</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javax.wsdl.extensions.ElementExtensible
	 * @generated
	 */
	public Adapter createIElementExtensibleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javax.wsdl.extensions.AttributeExtensible <em>IAttribute Extensible</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javax.wsdl.extensions.AttributeExtensible
	 * @generated
	 */
	public Adapter createIAttributeExtensibleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.lang.Object <em>IObject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.lang.Object
	 * @generated
	 */
	public Adapter createIObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javax.wsdl.extensions.schema.Schema <em>ISchema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javax.wsdl.extensions.schema.Schema
	 * @generated
	 */
	public Adapter createISchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //WsdlAdapterFactory
