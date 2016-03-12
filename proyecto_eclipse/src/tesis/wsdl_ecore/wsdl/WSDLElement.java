/**
 */
package tesis.wsdl_ecore.wsdl;

import org.eclipse.emf.ecore.EObject;

import org.w3c.dom.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WSDL Element</b></em>'.
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
 *   <li>{@link tesis.wsdl_ecore.wsdl.WSDLElement#getDocumentationElement <em>Documentation Element</em>}</li>
 *   <li>{@link tesis.wsdl_ecore.wsdl.WSDLElement#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see tesis.wsdl_ecore.wsdl.WsdlPackage#getWSDLElement()
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
	 * @see tesis.wsdl_ecore.wsdl.WsdlPackage#getWSDLElement_DocumentationElement()
	 * @model dataType="tesis.wsdl_ecore.wsdl.DOMElement"
	 * @generated
	 */
	Element getDocumentationElement();

	/**
	 * Sets the value of the '{@link tesis.wsdl_ecore.wsdl.WSDLElement#getDocumentationElement <em>Documentation Element</em>}' attribute.
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
	 * @see tesis.wsdl_ecore.wsdl.WsdlPackage#getWSDLElement_Element()
	 * @model dataType="tesis.wsdl_ecore.wsdl.DOMElement" transient="true"
	 * @generated
	 */
	Element getElement();

	/**
	 * Sets the value of the '{@link tesis.wsdl_ecore.wsdl.WSDLElement#getElement <em>Element</em>}' attribute.
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
