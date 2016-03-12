/**
 */
package tesis.xsd_ecore.xsd;

import org.eclipse.emf.common.util.EList;

import org.w3c.dom.Attr;
import org.w3c.dom.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XSD Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDAnnotation#getApplicationInformation <em>Application Information</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDAnnotation#getUserInformation <em>User Information</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDAnnotation#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDAnnotation()
 * @model
 * @generated
 */
public interface XSDAnnotation extends XSDComponent, XSDRedefineContent {
	/**
	 * Returns the value of the '<em><b>Application Information</b></em>' attribute list.
	 * The list contents are of type {@link org.w3c.dom.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application Information</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Information</em>' attribute list.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDAnnotation_ApplicationInformation()
	 * @model dataType="tesis.xsd_ecore.xsd.DOMElement"
	 * @generated
	 */
	EList<Element> getApplicationInformation();

	/**
	 * Returns the value of the '<em><b>User Information</b></em>' attribute list.
	 * The list contents are of type {@link org.w3c.dom.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Information</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Information</em>' attribute list.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDAnnotation_UserInformation()
	 * @model dataType="tesis.xsd_ecore.xsd.DOMElement"
	 * @generated
	 */
	EList<Element> getUserInformation();

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' attribute list.
	 * The list contents are of type {@link org.w3c.dom.Attr}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' attribute list.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDAnnotation_Attributes()
	 * @model dataType="tesis.xsd_ecore.xsd.DOMAttr"
	 * @generated
	 */
	EList<Attr> getAttributes();

} // XSDAnnotation
