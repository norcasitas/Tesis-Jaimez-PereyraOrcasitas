/**
 */
package tesis.unrc.wsdl.wsdl;

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
 *   <li>{@link tesis.unrc.wsdl.wsdl.ExtensibleElement#getEExtensibilityElements <em>EExtensibility Elements</em>}</li>
 * </ul>
 *
 * @see tesis.unrc.wsdl.wsdl.WSDLPackage#getExtensibleElement()
 * @model abstract="true" superTypes="tesis.unrc.wsdl.wsdl.WSDLElement tesis.unrc.wsdl.wsdl.IElementExtensible tesis.unrc.wsdl.wsdl.IAttributeExtensible"
 * @generated
 */
public interface ExtensibleElement extends WSDLElement, ElementExtensible, AttributeExtensible {
	/**
	 * Returns the value of the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * The list contents are of type {@link tesis.unrc.wsdl.wsdl.ExtensibilityElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EExtensibility Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EExtensibility Elements</em>' containment reference list.
	 * @see tesis.unrc.wsdl.wsdl.WSDLPackage#getExtensibleElement_EExtensibilityElements()
	 * @model type="tesis.unrc.wsdl.wsdl.ExtensibilityElement" containment="true"
	 * @generated
	 */
	EList getEExtensibilityElements();

} // ExtensibleElement
