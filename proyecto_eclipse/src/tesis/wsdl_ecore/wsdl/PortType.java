/**
 */
package tesis.wsdl_ecore.wsdl;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a WSDL portType element of the WSDL specification version 1.1 and an Interface component of the WSDL specification version 1.2. A port type or Interface is a named set of abstract operations and the abstract messages involved.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tesis.wsdl_ecore.wsdl.PortType#getQName <em>QName</em>}</li>
 *   <li>{@link tesis.wsdl_ecore.wsdl.PortType#isUndefined <em>Undefined</em>}</li>
 *   <li>{@link tesis.wsdl_ecore.wsdl.PortType#getEOperations <em>EOperations</em>}</li>
 * </ul>
 *
 * @see tesis.wsdl_ecore.wsdl.WsdlPackage#getPortType()
 * @model superTypes="tesis.wsdl_ecore.wsdl.ExtensibleElement tesis.wsdl_ecore.wsdl.IPortType"
 * @generated
 */
public interface PortType extends ExtensibleElement, javax.wsdl.PortType {
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
	 * @see tesis.wsdl_ecore.wsdl.WsdlPackage#getPortType_QName()
	 * @model dataType="tesis.wsdl_ecore.wsdl.QName"
	 * @generated
	 */
	QName getQName();

	/**
	 * Sets the value of the '{@link tesis.wsdl_ecore.wsdl.PortType#getQName <em>QName</em>}' attribute.
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
	 * @see tesis.wsdl_ecore.wsdl.WsdlPackage#getPortType_Undefined()
	 * @model
	 * @generated
	 */
	boolean isUndefined();

	/**
	 * Sets the value of the '{@link tesis.wsdl_ecore.wsdl.PortType#isUndefined <em>Undefined</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Undefined</em>' attribute.
	 * @see #isUndefined()
	 * @generated
	 */
	void setUndefined(boolean value);

	/**
	 * Returns the value of the '<em><b>EOperations</b></em>' containment reference list.
	 * The list contents are of type {@link tesis.wsdl_ecore.wsdl.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EOperations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EOperations</em>' containment reference list.
	 * @see tesis.wsdl_ecore.wsdl.WsdlPackage#getPortType_EOperations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operation> getEOperations();

} // PortType
