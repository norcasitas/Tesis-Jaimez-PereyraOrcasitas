/**
 */
package tesis.wsdl_ecore.wsdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a WSDL operation element within a binding. An operation element within a binding specifies binding information for the operation with the same name within the binding's portType. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tesis.wsdl_ecore.wsdl.BindingOperation#getName <em>Name</em>}</li>
 *   <li>{@link tesis.wsdl_ecore.wsdl.BindingOperation#getEOperation <em>EOperation</em>}</li>
 *   <li>{@link tesis.wsdl_ecore.wsdl.BindingOperation#getEBindingInput <em>EBinding Input</em>}</li>
 *   <li>{@link tesis.wsdl_ecore.wsdl.BindingOperation#getEBindingOutput <em>EBinding Output</em>}</li>
 *   <li>{@link tesis.wsdl_ecore.wsdl.BindingOperation#getEBindingFaults <em>EBinding Faults</em>}</li>
 * </ul>
 *
 * @see tesis.wsdl_ecore.wsdl.WsdlPackage#getBindingOperation()
 * @model superTypes="tesis.wsdl_ecore.wsdl.ExtensibleElement tesis.wsdl_ecore.wsdl.IBindingOperation"
 * @generated
 */
public interface BindingOperation extends ExtensibleElement, javax.wsdl.BindingOperation {
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
	 * @see tesis.wsdl_ecore.wsdl.WsdlPackage#getBindingOperation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tesis.wsdl_ecore.wsdl.BindingOperation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>EOperation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EOperation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EOperation</em>' reference.
	 * @see #setEOperation(Operation)
	 * @see tesis.wsdl_ecore.wsdl.WsdlPackage#getBindingOperation_EOperation()
	 * @model required="true"
	 * @generated
	 */
	Operation getEOperation();

	/**
	 * Sets the value of the '{@link tesis.wsdl_ecore.wsdl.BindingOperation#getEOperation <em>EOperation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EOperation</em>' reference.
	 * @see #getEOperation()
	 * @generated
	 */
	void setEOperation(Operation value);

	/**
	 * Returns the value of the '<em><b>EBinding Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EBinding Input</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EBinding Input</em>' containment reference.
	 * @see #setEBindingInput(BindingInput)
	 * @see tesis.wsdl_ecore.wsdl.WsdlPackage#getBindingOperation_EBindingInput()
	 * @model containment="true"
	 * @generated
	 */
	BindingInput getEBindingInput();

	/**
	 * Sets the value of the '{@link tesis.wsdl_ecore.wsdl.BindingOperation#getEBindingInput <em>EBinding Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EBinding Input</em>' containment reference.
	 * @see #getEBindingInput()
	 * @generated
	 */
	void setEBindingInput(BindingInput value);

	/**
	 * Returns the value of the '<em><b>EBinding Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EBinding Output</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EBinding Output</em>' containment reference.
	 * @see #setEBindingOutput(BindingOutput)
	 * @see tesis.wsdl_ecore.wsdl.WsdlPackage#getBindingOperation_EBindingOutput()
	 * @model containment="true"
	 * @generated
	 */
	BindingOutput getEBindingOutput();

	/**
	 * Sets the value of the '{@link tesis.wsdl_ecore.wsdl.BindingOperation#getEBindingOutput <em>EBinding Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EBinding Output</em>' containment reference.
	 * @see #getEBindingOutput()
	 * @generated
	 */
	void setEBindingOutput(BindingOutput value);

	/**
	 * Returns the value of the '<em><b>EBinding Faults</b></em>' containment reference list.
	 * The list contents are of type {@link tesis.wsdl_ecore.wsdl.BindingFault}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EBinding Faults</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EBinding Faults</em>' containment reference list.
	 * @see tesis.wsdl_ecore.wsdl.WsdlPackage#getBindingOperation_EBindingFaults()
	 * @model containment="true"
	 * @generated
	 */
	EList<BindingFault> getEBindingFaults();

} // BindingOperation
