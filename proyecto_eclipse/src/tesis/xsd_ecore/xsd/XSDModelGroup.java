/**
 */
package tesis.xsd_ecore.xsd;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XSD Model Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDModelGroup#getCompositor <em>Compositor</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDModelGroup#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDModelGroup#getContents <em>Contents</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDModelGroup#getParticles <em>Particles</em>}</li>
 * </ul>
 *
 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDModelGroup()
 * @model
 * @generated
 */
public interface XSDModelGroup extends XSDTerm {
	/**
	 * Returns the value of the '<em><b>Compositor</b></em>' attribute.
	 * The literals are from the enumeration {@link tesis.xsd_ecore.xsd.XSDCompositor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compositor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compositor</em>' attribute.
	 * @see tesis.xsd_ecore.xsd.XSDCompositor
	 * @see #setCompositor(XSDCompositor)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDModelGroup_Compositor()
	 * @model
	 * @generated
	 */
	XSDCompositor getCompositor();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDModelGroup#getCompositor <em>Compositor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compositor</em>' attribute.
	 * @see tesis.xsd_ecore.xsd.XSDCompositor
	 * @see #getCompositor()
	 * @generated
	 */
	void setCompositor(XSDCompositor value);

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference.
	 * @see #setAnnotation(XSDAnnotation)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDModelGroup_Annotation()
	 * @model containment="true"
	 * @generated
	 */
	XSDAnnotation getAnnotation();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDModelGroup#getAnnotation <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation</em>' containment reference.
	 * @see #getAnnotation()
	 * @generated
	 */
	void setAnnotation(XSDAnnotation value);

	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
	 * The list contents are of type {@link tesis.xsd_ecore.xsd.XSDParticle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' containment reference list.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDModelGroup_Contents()
	 * @model containment="true"
	 * @generated
	 */
	EList<XSDParticle> getContents();

	/**
	 * Returns the value of the '<em><b>Particles</b></em>' reference list.
	 * The list contents are of type {@link tesis.xsd_ecore.xsd.XSDParticle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Particles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Particles</em>' reference list.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDModelGroup_Particles()
	 * @model resolveProxies="false" required="true"
	 * @generated
	 */
	EList<XSDParticle> getParticles();

} // XSDModelGroup
