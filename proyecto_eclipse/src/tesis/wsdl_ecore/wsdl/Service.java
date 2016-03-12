/**
 */
package tesis.wsdl_ecore.wsdl;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a WSDL service element. A service groups a set of related ports together.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tesis.wsdl_ecore.wsdl.Service#getQName <em>QName</em>}</li>
 *   <li>{@link tesis.wsdl_ecore.wsdl.Service#isUndefined <em>Undefined</em>}</li>
 *   <li>{@link tesis.wsdl_ecore.wsdl.Service#getEPorts <em>EPorts</em>}</li>
 * </ul>
 *
 * @see tesis.wsdl_ecore.wsdl.WsdlPackage#getService()
 * @model superTypes="tesis.wsdl_ecore.wsdl.ExtensibleElement tesis.wsdl_ecore.wsdl.IService"
 * @generated
 */
public interface Service extends ExtensibleElement, javax.wsdl.Service {
	/**
	 * Returns the value of the '<em><b>QName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>QName</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QName</em>' attribute.
	 * @see #setQName(QName)
	 * @see tesis.wsdl_ecore.wsdl.WsdlPackage#getService_QName()
	 * @model dataType="tesis.wsdl_ecore.wsdl.QName"
	 * @generated
	 */
	QName getQName();

	/**
	 * Sets the value of the '{@link tesis.wsdl_ecore.wsdl.Service#getQName <em>QName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>QName</em>' attribute.
	 * @see #getQName()
	 * @generated
	 */
	void setQName(QName value);

	/**
	 * Returns the value of the '<em><b>Undefined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Undefined</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Undefined</em>' attribute.
	 * @see #setUndefined(boolean)
	 * @see tesis.wsdl_ecore.wsdl.WsdlPackage#getService_Undefined()
	 * @model
	 * @generated
	 */
	boolean isUndefined();

	/**
	 * Sets the value of the '{@link tesis.wsdl_ecore.wsdl.Service#isUndefined <em>Undefined</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Undefined</em>' attribute.
	 * @see #isUndefined()
	 * @generated
	 */
	void setUndefined(boolean value);

	/**
	 * Returns the value of the '<em><b>EPorts</b></em>' containment reference list.
	 * The list contents are of type {@link tesis.wsdl_ecore.wsdl.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EPorts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EPorts</em>' containment reference list.
	 * @see tesis.wsdl_ecore.wsdl.WsdlPackage#getService_EPorts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port> getEPorts();

} // Service
