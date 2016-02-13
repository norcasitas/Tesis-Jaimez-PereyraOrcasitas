/**
 */
package tesis.unrc.wsdl.wsdl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a WSDL input element within a operation within a binding. An input element within an operation within a binding specifies binding information for the input of the operation. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tesis.unrc.wsdl.wsdl.BindingInput#getName <em>Name</em>}</li>
 *   <li>{@link tesis.unrc.wsdl.wsdl.BindingInput#getEInput <em>EInput</em>}</li>
 * </ul>
 *
 * @see tesis.unrc.wsdl.wsdl.WSDLPackage#getBindingInput()
 * @model superTypes="tesis.unrc.wsdl.wsdl.ExtensibleElement tesis.unrc.wsdl.wsdl.IBindingInput"
 * @generated
 */
public interface BindingInput extends ExtensibleElement, javax.wsdl.BindingInput {
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
	 * @see tesis.unrc.wsdl.wsdl.WSDLPackage#getBindingInput_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tesis.unrc.wsdl.wsdl.BindingInput#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>EInput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EInput</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EInput</em>' reference.
	 * @see #setEInput(Input)
	 * @see tesis.unrc.wsdl.wsdl.WSDLPackage#getBindingInput_EInput()
	 * @model required="true"
	 * @generated
	 */
	Input getEInput();

	/**
	 * Sets the value of the '{@link tesis.unrc.wsdl.wsdl.BindingInput#getEInput <em>EInput</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EInput</em>' reference.
	 * @see #getEInput()
	 * @generated
	 */
	void setEInput(Input value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" type="tesis.unrc.wsdl.wsdl.IInput"
	 * @generated
	 */
	javax.wsdl.Input getInput();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model inputType="tesis.unrc.wsdl.wsdl.IInput"
	 * @generated
	 */
	void setInput(javax.wsdl.Input input);

} // BindingInput
