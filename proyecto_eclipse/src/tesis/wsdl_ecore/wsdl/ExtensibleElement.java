/**
 */
package tesis.wsdl_ecore.wsdl;

import javax.wsdl.extensions.AttributeExtensible;
import javax.wsdl.extensions.ElementExtensible;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extensible Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  WSDL allows elements representing a specific technology (referred to here as extensibility elements) under various elements defined by WSDL. This class represents a WSDL point of extensibility.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tesis.wsdl_ecore.wsdl.ExtensibleElement#getEExtensibilityElements <em>EExtensibility Elements</em>}</li>
 * </ul>
 *
 * @see tesis.wsdl_ecore.wsdl.WsdlPackage#getExtensibleElement()
 * @model abstract="true" superTypes="tesis.wsdl_ecore.wsdl.WSDLElement tesis.wsdl_ecore.wsdl.IElementExtensible tesis.wsdl_ecore.wsdl.IAttributeExtensible"
 * @generated
 */
public interface ExtensibleElement extends WSDLElement, ElementExtensible, AttributeExtensible {
	/**
	 * Returns the value of the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * The list contents are of type {@link tesis.wsdl_ecore.wsdl.ExtensibilityElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EExtensibility Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EExtensibility Elements</em>' containment reference list.
	 * @see tesis.wsdl_ecore.wsdl.WsdlPackage#getExtensibleElement_EExtensibilityElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExtensibilityElement> getEExtensibilityElements();

} // ExtensibleElement
