/**
 */
package tesis.wsdl_ecore.wsdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unknown Extensibility Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tesis.wsdl_ecore.wsdl.UnknownExtensibilityElement#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see tesis.wsdl_ecore.wsdl.WsdlPackage#getUnknownExtensibilityElement()
 * @model
 * @generated
 */
public interface UnknownExtensibilityElement extends ExtensibilityElement {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link tesis.wsdl_ecore.wsdl.UnknownExtensibilityElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see tesis.wsdl_ecore.wsdl.WsdlPackage#getUnknownExtensibilityElement_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<UnknownExtensibilityElement> getChildren();

} // UnknownExtensibilityElement
