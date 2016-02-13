/**
 */
package tesis.unrc.wsdl.wsdl;

import javax.xml.namespace.QName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extensibility Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a WSDL extensibility element. WSDL allows extensibility elements representing a specific technology under various elements defined by WSDL.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tesis.unrc.wsdl.wsdl.ExtensibilityElement#isRequired <em>Required</em>}</li>
 *   <li>{@link tesis.unrc.wsdl.wsdl.ExtensibilityElement#getElementType <em>Element Type</em>}</li>
 * </ul>
 *
 * @see tesis.unrc.wsdl.wsdl.WSDLPackage#getExtensibilityElement()
 * @model superTypes="tesis.unrc.wsdl.wsdl.WSDLElement tesis.unrc.wsdl.wsdl.IExtensibilityElement"
 * @generated
 */
public interface ExtensibilityElement extends WSDLElement, javax.wsdl.extensions.ExtensibilityElement {
	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #setRequired(boolean)
	 * @see tesis.unrc.wsdl.wsdl.WSDLPackage#getExtensibilityElement_Required()
	 * @model
	 * @generated
	 */
	boolean isRequired();

	/**
	 * Sets the value of the '{@link tesis.unrc.wsdl.wsdl.ExtensibilityElement#isRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #isRequired()
	 * @generated
	 */
	void setRequired(boolean value);

	/**
	 * Returns the value of the '<em><b>Element Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Type</em>' attribute.
	 * @see #setElementType(QName)
	 * @see tesis.unrc.wsdl.wsdl.WSDLPackage#getExtensibilityElement_ElementType()
	 * @model dataType="tesis.unrc.wsdl.wsdl.QName" transient="true"
	 * @generated
	 */
	QName getElementType();

	/**
	 * Sets the value of the '{@link tesis.unrc.wsdl.wsdl.ExtensibilityElement#getElementType <em>Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Type</em>' attribute.
	 * @see #getElementType()
	 * @generated
	 */
	void setElementType(QName value);

} // ExtensibilityElement
