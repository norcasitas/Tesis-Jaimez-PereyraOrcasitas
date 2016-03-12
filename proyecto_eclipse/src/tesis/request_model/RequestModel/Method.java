/**
 */
package tesis.request_model.RequestModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tesis.request_model.RequestModel.Method#getInParameters <em>In Parameters</em>}</li>
 *   <li>{@link tesis.request_model.RequestModel.Method#getName <em>Name</em>}</li>
 *   <li>{@link tesis.request_model.RequestModel.Method#getDescription <em>Description</em>}</li>
 *   <li>{@link tesis.request_model.RequestModel.Method#getOutParameters <em>Out Parameters</em>}</li>
 * </ul>
 *
 * @see tesis.request_model.RequestModel.RequestModelPackage#getMethod()
 * @model
 * @generated
 */
public interface Method extends EObject {
	/**
	 * Returns the value of the '<em><b>In Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link tesis.request_model.RequestModel.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Parameters</em>' containment reference list.
	 * @see tesis.request_model.RequestModel.RequestModelPackage#getMethod_InParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getInParameters();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tesis.request_model.RequestModel.RequestModelPackage#getMethod_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tesis.request_model.RequestModel.Method#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see tesis.request_model.RequestModel.RequestModelPackage#getMethod_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link tesis.request_model.RequestModel.Method#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Out Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link tesis.request_model.RequestModel.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Parameters</em>' containment reference list.
	 * @see tesis.request_model.RequestModel.RequestModelPackage#getMethod_OutParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getOutParameters();

} // Method
