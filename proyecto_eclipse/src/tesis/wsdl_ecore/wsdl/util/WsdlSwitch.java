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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import tesis.wsdl_ecore.wsdl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see tesis.wsdl_ecore.wsdl.WsdlPackage
 * @generated
 */
public class WsdlSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WsdlPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WsdlSwitch() {
		if (modelPackage == null) {
			modelPackage = WsdlPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case WsdlPackage.WSDL_ELEMENT: {
				WSDLElement wsdlElement = (WSDLElement)theEObject;
				T result = caseWSDLElement(wsdlElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WsdlPackage.PORT_TYPE: {
				PortType portType = (PortType)theEObject;
				T result = casePortType(portType);
				if (result == null) result = caseExtensibleElement(portType);
				if (result == null) result = caseIPortType(portType);
				if (result == null) result = caseWSDLElement(portType);
				if (result == null) result = caseIElementExtensible(portType);
				if (result == null) result = caseIAttributeExtensible(portType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WsdlPackage.OPERATION: {
				Operation operation = (Operation)theEObject;
				T result = caseOperation(operation);
				if (result == null) result = caseExtensibleElement(operation);
				if (result == null) result = caseIOperation(operation);
				if (result == null) result = caseWSDLElement(operation);
				if (result == null) result = caseIElementExtensible(operation);
				if (result == null) result = caseIAttributeExtensible(operation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WsdlPackage.MESSAGE: {
				Message message = (Message)theEObject;
				T result = caseMessage(message);
				if (result == null) result = caseExtensibleElement(message);
				if (result == null) result = caseIMessage(message);
				if (result == null) result = caseWSDLElement(message);
				if (result == null) result = caseIElementExtensible(message);
				if (result == null) result = caseIAttributeExtensible(message);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WsdlPackage.PART: {
				Part part = (Part)theEObject;
				T result = casePart(part);
				if (result == null) result = caseExtensibleElement(part);
				if (result == null) result = caseIPart(part);
				if (result == null) result = caseWSDLElement(part);
				if (result == null) result = caseIElementExtensible(part);
				if (result == null) result = caseIAttributeExtensible(part);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WsdlPackage.BINDING: {
				Binding binding = (Binding)theEObject;
				T result = caseBinding(binding);
				if (result == null) result = caseExtensibleElement(binding);
				if (result == null) result = caseIBinding(binding);
				if (result == null) result = caseWSDLElement(binding);
				if (result == null) result = caseIElementExtensible(binding);
				if (result == null) result = caseIAttributeExtensible(binding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WsdlPackage.BINDING_OPERATION: {
				BindingOperation bindingOperation = (BindingOperation)theEObject;
				T result = caseBindingOperation(bindingOperation);
				if (result == null) result = caseExtensibleElement(bindingOperation);
				if (result == null) result = caseIBindingOperation(bindingOperation);
				if (result == null) result = caseWSDLElement(bindingOperation);
				if (result == null) result = caseIElementExtensible(bindingOperation);
				if (result == null) result = caseIAttributeExtensible(bindingOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WsdlPackage.SERVICE: {
				Service service = (Service)theEObject;
				T result = caseService(service);
				if (result == null) result = caseExtensibleElement(service);
				if (result == null) result = caseIService(service);
				if (result == null) result = caseWSDLElement(service);
				if (result == null) result = caseIElementExtensible(service);
				if (result == null) result = caseIAttributeExtensible(service);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WsdlPackage.PORT: {
				Port port = (Port)theEObject;
				T result = casePort(port);
				if (result == null) result = caseExtensibleElement(port);
				if (result == null) result = caseIPort(port);
				if (result == null) result = caseWSDLElement(port);
				if (result == null) result = caseIElementExtensible(port);
				if (result == null) result = caseIAttributeExtensible(port);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WsdlPackage.EXTENSIBILITY_ELEMENT: {
				ExtensibilityElement extensibilityElement = (ExtensibilityElement)theEObject;
				T result = caseExtensibilityElement(extensibilityElement);
				if (result == null) result = caseWSDLElement(extensibilityElement);
				if (result == null) result = caseIExtensibilityElement(extensibilityElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WsdlPackage.DEFINITION: {
				Definition definition = (Definition)theEObject;
				T result = caseDefinition(definition);
				if (result == null) result = caseExtensibleElement(definition);
				if (result == null) result = caseIDefinition(definition);
				if (result == null) result = caseWSDLElement(definition);
				if (result == null) result = caseIElementExtensible(definition);
				if (result == null) result = caseIAttributeExtensible(definition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WsdlPackage.IMPORT: {
				Import import_ = (Import)theEObject;
				T result = caseImport(import_);
				if (result == null) result = caseExtensibleElement(import_);
				if (result == null) result = caseIImport(import_);
				if (result == null) result = caseWSDLElement(import_);
				if (result == null) result = caseIElementExtensible(import_);
				if (result == null) result = caseIAttributeExtensible(import_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WsdlPackage.EXTENSIBLE_ELEMENT: {
				ExtensibleElement extensibleElement = (ExtensibleElement)theEObject;
				T result = caseExtensibleElement(extensibleElement);
				if (result == null) result = caseWSDLElement(extensibleElement);
				if (result == null) result = caseIElementExtensible(extensibleElement);
				if (result == null) result = caseIAttributeExtensible(extensibleElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WsdlPackage.INPUT: {
				Input input = (Input)theEObject;
				T result = caseInput(input);
				if (result == null) result = caseMessageReference(input);
				if (result == null) result = caseIInput(input);
				if (result == null) result = caseExtensibleElement(input);
				if (result == null) result = caseWSDLElement(input);
				if (result == null) result = caseIElementExtensible(input);
				if (result == null) result = caseIAttributeExtensible(input);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WsdlPackage.OUTPUT: {
				Output output = (Output)theEObject;
				T result = caseOutput(output);
				if (result == null) result = caseMessageReference(output);
				if (result == null) result = caseIOutput(output);
				if (result == null) result = caseExtensibleElement(output);
				if (result == null) result = caseWSDLElement(output);
				if (result == null) result = caseIElementExtensible(output);
				if (result == null) result = caseIAttributeExtensible(output);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WsdlPackage.FAULT: {
				Fault fault = (Fault)theEObject;
				T result = caseFault(fault);
				if (result == null) result = caseMessageReference(fault);
				if (result == null) result = caseIFault(fault);
				if (result == null) result = caseExtensibleElement(fault);
				if (result == null) result = caseWSDLElement(fault);
				if (result == null) result = caseIElementExtensible(fault);
				if (result == null) result = caseIAttributeExtensible(fault);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WsdlPackage.BINDING_INPUT: {
				BindingInput bindingInput = (BindingInput)theEObject;
				T result = caseBindingInput(bindingInput);
				if (result == null) result = caseExtensibleElement(bindingInput);
				if (result == null) result = caseIBindingInput(bindingInput);
				if (result == null) result = caseWSDLElement(bindingInput);
				if (result == null) result = caseIElementExtensible(bindingInput);
				if (result == null) result = caseIAttributeExtensible(bindingInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WsdlPackage.BINDING_OUTPUT: {
				BindingOutput bindingOutput = (BindingOutput)theEObject;
				T result = caseBindingOutput(bindingOutput);
				if (result == null) result = caseExtensibleElement(bindingOutput);
				if (result == null) result = caseIBindingOutput(bindingOutput);
				if (result == null) result = caseWSDLElement(bindingOutput);
				if (result == null) result = caseIElementExtensible(bindingOutput);
				if (result == null) result = caseIAttributeExtensible(bindingOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WsdlPackage.BINDING_FAULT: {
				BindingFault bindingFault = (BindingFault)theEObject;
				T result = caseBindingFault(bindingFault);
				if (result == null) result = caseExtensibleElement(bindingFault);
				if (result == null) result = caseIBindingFault(bindingFault);
				if (result == null) result = caseWSDLElement(bindingFault);
				if (result == null) result = caseIElementExtensible(bindingFault);
				if (result == null) result = caseIAttributeExtensible(bindingFault);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WsdlPackage.NAMESPACE: {
				Namespace namespace = (Namespace)theEObject;
				T result = caseNamespace(namespace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WsdlPackage.IPORT_TYPE: {
				javax.wsdl.PortType iPortType = (javax.wsdl.PortType)theEObject;
				T result = caseIPortType(iPortType);
				if (result == null) result = caseIAttributeExtensible(iPortType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WsdlPackage.IOPERATION: {
				javax.wsdl.Operation iOperation = (javax.wsdl.Operation)theEObject;
				T result = caseIOperation(iOperation);
				if (result == null) result = caseIElementExtensible(iOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WsdlPackage.IINPUT: {
				javax.wsdl.Input iInput = (javax.wsdl.Input)theEObject;
				T result = caseIInput(iInput);
				if (result == null) result = caseIAttributeExtensible(iInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WsdlPackage.IOUTPUT: {
				javax.wsdl.Output iOutput = (javax.wsdl.Output)theEObject;
				T result = caseIOutput(iOutput);
				if (result == null) result = caseIAttributeExtensible(iOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WsdlPackage.IFAULT: {
				javax.wsdl.Fault iFault = (javax.wsdl.Fault)theEObject;
				T result = caseIFault(iFault);
				if (result == null) result = caseIAttributeExtensible(iFault);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WsdlPackage.IMESSAGE: {
				javax.wsdl.Message iMessage = (javax.wsdl.Message)theEObject;
				T result = caseIMessage(iMessage);
				if (result == null) result = caseIElementExtensible(iMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WsdlPackage.IPART: {
				javax.wsdl.Part iPart = (javax.wsdl.Part)theEObject;
				T result = caseIPart(iPart);
				if (result == null) result = caseIAttributeExtensible(iPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WsdlPackage.ISERVICE: {
				javax.wsdl.Service iService = (javax.wsdl.Service)theEObject;
				T result = caseIService(iService);
				if (result == null) result = caseIElementExtensible(iService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WsdlPackage.IPORT: {
				javax.wsdl.Port iPort = (javax.wsdl.Port)theEObject;
				T result = caseIPort(iPort);
				if (result == null) result = caseIElementExtensible(iPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WsdlPackage.IBINDING: {
				javax.wsdl.Binding iBinding = (javax.wsdl.Binding)theEObject;
				T result = caseIBinding(iBinding);
				if (result == null) result = caseIElementExtensible(iBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WsdlPackage.IBINDING_OPERATION: {
				javax.wsdl.BindingOperation iBindingOperation = (javax.wsdl.BindingOperation)theEObject;
				T result = caseIBindingOperation(iBindingOperation);
				if (result == null) result = caseIElementExtensible(iBindingOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WsdlPackage.IBINDING_INPUT: {
				javax.wsdl.BindingInput iBindingInput = (javax.wsdl.BindingInput)theEObject;
				T result = caseIBindingInput(iBindingInput);
				if (result == null) result = caseIElementExtensible(iBindingInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WsdlPackage.IBINDING_OUTPUT: {
				javax.wsdl.BindingOutput iBindingOutput = (javax.wsdl.BindingOutput)theEObject;
				T result = caseIBindingOutput(iBindingOutput);
				if (result == null) result = caseIElementExtensible(iBindingOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WsdlPackage.IBINDING_FAULT: {
				javax.wsdl.BindingFault iBindingFault = (javax.wsdl.BindingFault)theEObject;
				T result = caseIBindingFault(iBindingFault);
				if (result == null) result = caseIElementExtensible(iBindingFault);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WsdlPackage.IEXTENSIBILITY_ELEMENT: {
				javax.wsdl.extensions.ExtensibilityElement iExtensibilityElement = (javax.wsdl.extensions.ExtensibilityElement)theEObject;
				T result = caseIExtensibilityElement(iExtensibilityElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WsdlPackage.IDEFINITION: {
				javax.wsdl.Definition iDefinition = (javax.wsdl.Definition)theEObject;
				T result = caseIDefinition(iDefinition);
				if (result == null) result = caseIElementExtensible(iDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WsdlPackage.IIMPORT: {
				javax.wsdl.Import iImport = (javax.wsdl.Import)theEObject;
				T result = caseIImport(iImport);
				if (result == null) result = caseIAttributeExtensible(iImport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WsdlPackage.ILIST: {
				List iList = (List)theEObject;
				T result = caseIList(iList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WsdlPackage.IMAP: {
				Map iMap = (Map)theEObject;
				T result = caseIMap(iMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WsdlPackage.IEXTENSION_REGISTRY: {
				ExtensionRegistry iExtensionRegistry = (ExtensionRegistry)theEObject;
				T result = caseIExtensionRegistry(iExtensionRegistry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WsdlPackage.TYPES: {
				Types types = (Types)theEObject;
				T result = caseTypes(types);
				if (result == null) result = caseExtensibleElement(types);
				if (result == null) result = caseITypes(types);
				if (result == null) result = caseWSDLElement(types);
				if (result == null) result = caseIElementExtensible(types);
				if (result == null) result = caseIAttributeExtensible(types);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WsdlPackage.IITERATOR: {
				Iterator iIterator = (Iterator)theEObject;
				T result = caseIIterator(iIterator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WsdlPackage.ITYPES: {
				javax.wsdl.Types iTypes = (javax.wsdl.Types)theEObject;
				T result = caseITypes(iTypes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WsdlPackage.UNKNOWN_EXTENSIBILITY_ELEMENT: {
				UnknownExtensibilityElement unknownExtensibilityElement = (UnknownExtensibilityElement)theEObject;
				T result = caseUnknownExtensibilityElement(unknownExtensibilityElement);
				if (result == null) result = caseExtensibilityElement(unknownExtensibilityElement);
				if (result == null) result = caseWSDLElement(unknownExtensibilityElement);
				if (result == null) result = caseIExtensibilityElement(unknownExtensibilityElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WsdlPackage.XSD_SCHEMA_EXTENSIBILITY_ELEMENT: {
				XSDSchemaExtensibilityElement xsdSchemaExtensibilityElement = (XSDSchemaExtensibilityElement)theEObject;
				T result = caseXSDSchemaExtensibilityElement(xsdSchemaExtensibilityElement);
				if (result == null) result = caseExtensibilityElement(xsdSchemaExtensibilityElement);
				if (result == null) result = caseISchema(xsdSchemaExtensibilityElement);
				if (result == null) result = caseWSDLElement(xsdSchemaExtensibilityElement);
				if (result == null) result = caseIExtensibilityElement(xsdSchemaExtensibilityElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WsdlPackage.MESSAGE_REFERENCE: {
				MessageReference messageReference = (MessageReference)theEObject;
				T result = caseMessageReference(messageReference);
				if (result == null) result = caseExtensibleElement(messageReference);
				if (result == null) result = caseWSDLElement(messageReference);
				if (result == null) result = caseIElementExtensible(messageReference);
				if (result == null) result = caseIAttributeExtensible(messageReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WsdlPackage.IELEMENT_EXTENSIBLE: {
				ElementExtensible iElementExtensible = (ElementExtensible)theEObject;
				T result = caseIElementExtensible(iElementExtensible);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WsdlPackage.IATTRIBUTE_EXTENSIBLE: {
				AttributeExtensible iAttributeExtensible = (AttributeExtensible)theEObject;
				T result = caseIAttributeExtensible(iAttributeExtensible);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WsdlPackage.IOBJECT: {
				Object iObject = (Object)theEObject;
				T result = caseIObject(iObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WsdlPackage.ISCHEMA: {
				Schema iSchema = (Schema)theEObject;
				T result = caseISchema(iSchema);
				if (result == null) result = caseIExtensibilityElement(iSchema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WSDL Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WSDL Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWSDLElement(WSDLElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortType(PortType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation(Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessage(Message object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePart(Part object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinding(Binding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindingOperation(BindingOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseService(Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort(Port object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extensibility Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extensibility Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtensibilityElement(ExtensibilityElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefinition(Definition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImport(Import object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extensible Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extensible Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtensibleElement(ExtensibleElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInput(Input object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutput(Output object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fault</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fault</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFault(Fault object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindingInput(BindingInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindingOutput(BindingOutput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding Fault</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding Fault</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindingFault(BindingFault object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Namespace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamespace(Namespace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IPort Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IPort Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIPortType(javax.wsdl.PortType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IOperation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IOperation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIOperation(javax.wsdl.Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IInput</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IInput</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIInput(javax.wsdl.Input object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IOutput</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IOutput</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIOutput(javax.wsdl.Output object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IFault</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IFault</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIFault(javax.wsdl.Fault object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IMessage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IMessage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIMessage(javax.wsdl.Message object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IPart</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IPart</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIPart(javax.wsdl.Part object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IService</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IService</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIService(javax.wsdl.Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IPort</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IPort</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIPort(javax.wsdl.Port object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IBinding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IBinding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIBinding(javax.wsdl.Binding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IBinding Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IBinding Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIBindingOperation(javax.wsdl.BindingOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IBinding Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IBinding Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIBindingInput(javax.wsdl.BindingInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IBinding Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IBinding Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIBindingOutput(javax.wsdl.BindingOutput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IBinding Fault</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IBinding Fault</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIBindingFault(javax.wsdl.BindingFault object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IExtensibility Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IExtensibility Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIExtensibilityElement(javax.wsdl.extensions.ExtensibilityElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IDefinition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IDefinition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIDefinition(javax.wsdl.Definition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IImport</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IImport</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIImport(javax.wsdl.Import object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IList</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IList</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIList(List object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IMap</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IMap</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIMap(Map object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IURL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IURL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIURL(URL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IExtension Registry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IExtension Registry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIExtensionRegistry(ExtensionRegistry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Types</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Types</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypes(Types object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IIterator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IIterator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIIterator(Iterator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ITypes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ITypes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseITypes(javax.wsdl.Types object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unknown Extensibility Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unknown Extensibility Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnknownExtensibilityElement(UnknownExtensibilityElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XSD Schema Extensibility Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XSD Schema Extensibility Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXSDSchemaExtensibilityElement(XSDSchemaExtensibilityElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageReference(MessageReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IElement Extensible</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IElement Extensible</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIElementExtensible(ElementExtensible object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IAttribute Extensible</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IAttribute Extensible</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIAttributeExtensible(AttributeExtensible object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIObject(Object object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISchema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISchema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISchema(Schema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //WsdlSwitch
