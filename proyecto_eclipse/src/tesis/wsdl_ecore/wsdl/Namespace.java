/**
 */
package tesis.wsdl_ecore.wsdl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a namespace and the corresponding namespace prefix used in a WSDL document.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tesis.wsdl_ecore.wsdl.Namespace#getURI <em>URI</em>}</li>
 *   <li>{@link tesis.wsdl_ecore.wsdl.Namespace#getPrefix <em>Prefix</em>}</li>
 * </ul>
 *
 * @see tesis.wsdl_ecore.wsdl.WsdlPackage#getNamespace()
 * @model
 * @generated
 */
public interface Namespace extends EObject {
	/**
	 * Returns the value of the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>URI</em>' attribute.
	 * @see #setURI(String)
	 * @see tesis.wsdl_ecore.wsdl.WsdlPackage#getNamespace_URI()
	 * @model
	 * @generated
	 */
	String getURI();

	/**
	 * Sets the value of the '{@link tesis.wsdl_ecore.wsdl.Namespace#getURI <em>URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>URI</em>' attribute.
	 * @see #getURI()
	 * @generated
	 */
	void setURI(String value);

	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' attribute.
	 * @see #setPrefix(String)
	 * @see tesis.wsdl_ecore.wsdl.WsdlPackage#getNamespace_Prefix()
	 * @model
	 * @generated
	 */
	String getPrefix();

	/**
	 * Sets the value of the '{@link tesis.wsdl_ecore.wsdl.Namespace#getPrefix <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' attribute.
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(String value);

} // Namespace
