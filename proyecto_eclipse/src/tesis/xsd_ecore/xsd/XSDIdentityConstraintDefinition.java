/**
 */
package tesis.xsd_ecore.xsd;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XSD Identity Constraint Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDIdentityConstraintDefinition#getIdentityConstraintCategory <em>Identity Constraint Category</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDIdentityConstraintDefinition#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDIdentityConstraintDefinition#getReferencedKey <em>Referenced Key</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDIdentityConstraintDefinition#getSelector <em>Selector</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDIdentityConstraintDefinition#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDIdentityConstraintDefinition()
 * @model
 * @generated
 */
public interface XSDIdentityConstraintDefinition extends XSDNamedComponent {
	/**
	 * Returns the value of the '<em><b>Identity Constraint Category</b></em>' attribute.
	 * The literals are from the enumeration {@link tesis.xsd_ecore.xsd.XSDIdentityConstraintCategory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identity Constraint Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identity Constraint Category</em>' attribute.
	 * @see tesis.xsd_ecore.xsd.XSDIdentityConstraintCategory
	 * @see #setIdentityConstraintCategory(XSDIdentityConstraintCategory)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDIdentityConstraintDefinition_IdentityConstraintCategory()
	 * @model
	 * @generated
	 */
	XSDIdentityConstraintCategory getIdentityConstraintCategory();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDIdentityConstraintDefinition#getIdentityConstraintCategory <em>Identity Constraint Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identity Constraint Category</em>' attribute.
	 * @see tesis.xsd_ecore.xsd.XSDIdentityConstraintCategory
	 * @see #getIdentityConstraintCategory()
	 * @generated
	 */
	void setIdentityConstraintCategory(XSDIdentityConstraintCategory value);

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
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDIdentityConstraintDefinition_Annotation()
	 * @model containment="true"
	 * @generated
	 */
	XSDAnnotation getAnnotation();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDIdentityConstraintDefinition#getAnnotation <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation</em>' containment reference.
	 * @see #getAnnotation()
	 * @generated
	 */
	void setAnnotation(XSDAnnotation value);

	/**
	 * Returns the value of the '<em><b>Referenced Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Key</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Key</em>' reference.
	 * @see #setReferencedKey(XSDIdentityConstraintDefinition)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDIdentityConstraintDefinition_ReferencedKey()
	 * @model resolveProxies="false"
	 * @generated
	 */
	XSDIdentityConstraintDefinition getReferencedKey();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDIdentityConstraintDefinition#getReferencedKey <em>Referenced Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Key</em>' reference.
	 * @see #getReferencedKey()
	 * @generated
	 */
	void setReferencedKey(XSDIdentityConstraintDefinition value);

	/**
	 * Returns the value of the '<em><b>Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selector</em>' containment reference.
	 * @see #setSelector(XSDXPathDefinition)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDIdentityConstraintDefinition_Selector()
	 * @model containment="true" required="true"
	 * @generated
	 */
	XSDXPathDefinition getSelector();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDIdentityConstraintDefinition#getSelector <em>Selector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selector</em>' containment reference.
	 * @see #getSelector()
	 * @generated
	 */
	void setSelector(XSDXPathDefinition value);

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link tesis.xsd_ecore.xsd.XSDXPathDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDIdentityConstraintDefinition_Fields()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<XSDXPathDefinition> getFields();

} // XSDIdentityConstraintDefinition
