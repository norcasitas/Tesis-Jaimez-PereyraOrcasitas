/**
 */
package tesis.unrc.wsdl.wsdl;

import org.eclipse.emf.ecore.EObject;

import org.w3c.dom.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a WSDL language element.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tesis.unrc.wsdl.wsdl.WSDLElement#getDocumentationElement <em>Documentation Element</em>}</li>
 *   <li>{@link tesis.unrc.wsdl.wsdl.WSDLElement#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see tesis.unrc.wsdl.wsdl.WSDLPackage#getWSDLElement()
 * @model abstract="true"
 * @generated
 */
public interface WSDLElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentation Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation Element</em>' attribute.
	 * @see #setDocumentationElement(Element)
	 * @see tesis.unrc.wsdl.wsdl.WSDLPackage#getWSDLElement_DocumentationElement()
	 * @model dataType="tesis.unrc.wsdl.wsdl.DOMElement"
	 * @generated
	 */
	Element getDocumentationElement();

	/**
	 * Sets the value of the '{@link tesis.unrc.wsdl.wsdl.WSDLElement#getDocumentationElement <em>Documentation Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation Element</em>' attribute.
	 * @see #getDocumentationElement()
	 * @generated
	 */
	void setDocumentationElement(Element value);

	/**
	 * Returns the value of the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' attribute.
	 * @see #setElement(Element)
	 * @see tesis.unrc.wsdl.wsdl.WSDLPackage#getWSDLElement_Element()
	 * @model dataType="tesis.unrc.wsdl.wsdl.DOMElement" transient="true"
	 * @generated
	 */
	Element getElement();

	/**
	 * Sets the value of the '{@link tesis.unrc.wsdl.wsdl.WSDLElement#getElement <em>Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' attribute.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(Element value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Definition getEnclosingDefinition();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setEnclosingDefinition(Definition definition);

} // WSDLElement
