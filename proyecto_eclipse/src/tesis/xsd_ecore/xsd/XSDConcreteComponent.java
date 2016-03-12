/**
 */
package tesis.xsd_ecore.xsd;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.w3c.dom.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XSD Concrete Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDConcreteComponent#getElement <em>Element</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDConcreteComponent#getContainer <em>Container</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDConcreteComponent#getRootContainer <em>Root Container</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDConcreteComponent#getSchema <em>Schema</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDConcreteComponent#getDiagnostics <em>Diagnostics</em>}</li>
 * </ul>
 *
 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDConcreteComponent()
 * @model abstract="true"
 * @generated
 */
public interface XSDConcreteComponent extends EObject {
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
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDConcreteComponent_Element()
	 * @model dataType="tesis.xsd_ecore.xsd.DOMElement"
	 * @generated
	 */
	Element getElement();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDConcreteComponent#getElement <em>Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' attribute.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(Element value);

	/**
	 * Returns the value of the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' reference.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDConcreteComponent_Container()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	XSDConcreteComponent getContainer();

	/**
	 * Returns the value of the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Container</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Container</em>' reference.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDConcreteComponent_RootContainer()
	 * @model resolveProxies="false" required="true" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	XSDConcreteComponent getRootContainer();

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' reference.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDConcreteComponent_Schema()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	XSDSchema getSchema();

	/**
	 * Returns the value of the '<em><b>Diagnostics</b></em>' containment reference list.
	 * The list contents are of type {@link tesis.xsd_ecore.xsd.XSDDiagnostic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagnostics</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagnostics</em>' containment reference list.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDConcreteComponent_Diagnostics()
	 * @model containment="true" transient="true"
	 * @generated
	 */
	EList<XSDDiagnostic> getDiagnostics();

} // XSDConcreteComponent
