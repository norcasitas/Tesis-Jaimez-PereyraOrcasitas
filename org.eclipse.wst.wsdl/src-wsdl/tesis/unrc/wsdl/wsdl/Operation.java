/**
 */
package tesis.unrc.wsdl.wsdl;

import javax.wsdl.OperationType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a WSDL operation element. A WSDL operation is an abstract description of an action supported by a service.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tesis.unrc.wsdl.wsdl.Operation#getStyle <em>Style</em>}</li>
 *   <li>{@link tesis.unrc.wsdl.wsdl.Operation#getName <em>Name</em>}</li>
 *   <li>{@link tesis.unrc.wsdl.wsdl.Operation#isUndefined <em>Undefined</em>}</li>
 *   <li>{@link tesis.unrc.wsdl.wsdl.Operation#getEInput <em>EInput</em>}</li>
 *   <li>{@link tesis.unrc.wsdl.wsdl.Operation#getEOutput <em>EOutput</em>}</li>
 *   <li>{@link tesis.unrc.wsdl.wsdl.Operation#getEFaults <em>EFaults</em>}</li>
 *   <li>{@link tesis.unrc.wsdl.wsdl.Operation#getEParameterOrdering <em>EParameter Ordering</em>}</li>
 * </ul>
 *
 * @see tesis.unrc.wsdl.wsdl.WSDLPackage#getOperation()
 * @model superTypes="tesis.unrc.wsdl.wsdl.ExtensibleElement tesis.unrc.wsdl.wsdl.IOperation"
 * @generated
 */
public interface Operation extends ExtensibleElement, javax.wsdl.Operation {
	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see #setStyle(OperationType)
	 * @see tesis.unrc.wsdl.wsdl.WSDLPackage#getOperation_Style()
	 * @model dataType="tesis.unrc.wsdl.wsdl.OperationType"
	 * @generated
	 */
	OperationType getStyle();

	/**
	 * Sets the value of the '{@link tesis.unrc.wsdl.wsdl.Operation#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(OperationType value);

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
	 * @see tesis.unrc.wsdl.wsdl.WSDLPackage#getOperation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tesis.unrc.wsdl.wsdl.Operation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see tesis.unrc.wsdl.wsdl.WSDLPackage#getOperation_Undefined()
	 * @model
	 * @generated
	 */
	boolean isUndefined();

	/**
	 * Sets the value of the '{@link tesis.unrc.wsdl.wsdl.Operation#isUndefined <em>Undefined</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Undefined</em>' attribute.
	 * @see #isUndefined()
	 * @generated
	 */
	void setUndefined(boolean value);

	/**
	 * Returns the value of the '<em><b>EInput</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EInput</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EInput</em>' containment reference.
	 * @see #setEInput(Input)
	 * @see tesis.unrc.wsdl.wsdl.WSDLPackage#getOperation_EInput()
	 * @model containment="true"
	 * @generated
	 */
	Input getEInput();

	/**
	 * Sets the value of the '{@link tesis.unrc.wsdl.wsdl.Operation#getEInput <em>EInput</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EInput</em>' containment reference.
	 * @see #getEInput()
	 * @generated
	 */
	void setEInput(Input value);

	/**
	 * Returns the value of the '<em><b>EOutput</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EOutput</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EOutput</em>' containment reference.
	 * @see #setEOutput(Output)
	 * @see tesis.unrc.wsdl.wsdl.WSDLPackage#getOperation_EOutput()
	 * @model containment="true"
	 * @generated
	 */
	Output getEOutput();

	/**
	 * Sets the value of the '{@link tesis.unrc.wsdl.wsdl.Operation#getEOutput <em>EOutput</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EOutput</em>' containment reference.
	 * @see #getEOutput()
	 * @generated
	 */
	void setEOutput(Output value);

	/**
	 * Returns the value of the '<em><b>EFaults</b></em>' containment reference list.
	 * The list contents are of type {@link tesis.unrc.wsdl.wsdl.Fault}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EFaults</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EFaults</em>' containment reference list.
	 * @see tesis.unrc.wsdl.wsdl.WSDLPackage#getOperation_EFaults()
	 * @model type="tesis.unrc.wsdl.wsdl.Fault" containment="true"
	 * @generated
	 */
	EList getEFaults();

	/**
	 * Returns the value of the '<em><b>EParameter Ordering</b></em>' reference list.
	 * The list contents are of type {@link tesis.unrc.wsdl.wsdl.Part}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EParameter Ordering</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EParameter Ordering</em>' reference list.
	 * @see tesis.unrc.wsdl.wsdl.WSDLPackage#getOperation_EParameterOrdering()
	 * @model type="tesis.unrc.wsdl.wsdl.Part"
	 * @generated
	 */
	EList getEParameterOrdering();

} // Operation
