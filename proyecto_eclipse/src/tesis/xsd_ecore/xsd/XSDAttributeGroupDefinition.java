/**
 */
package tesis.xsd_ecore.xsd;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XSD Attribute Group Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDAttributeGroupDefinition#isAttributeGroupDefinitionReference <em>Attribute Group Definition Reference</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDAttributeGroupDefinition#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDAttributeGroupDefinition#getContents <em>Contents</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDAttributeGroupDefinition#getAttributeUses <em>Attribute Uses</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDAttributeGroupDefinition#getAttributeWildcardContent <em>Attribute Wildcard Content</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDAttributeGroupDefinition#getAttributeWildcard <em>Attribute Wildcard</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDAttributeGroupDefinition#getResolvedAttributeGroupDefinition <em>Resolved Attribute Group Definition</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDAttributeGroupDefinition#getSyntheticWildcard <em>Synthetic Wildcard</em>}</li>
 * </ul>
 *
 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDAttributeGroupDefinition()
 * @model
 * @generated
 */
public interface XSDAttributeGroupDefinition extends XSDRedefinableComponent, XSDAttributeGroupContent, XSDRedefineContent {
	/**
	 * Returns the value of the '<em><b>Attribute Group Definition Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Group Definition Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Group Definition Reference</em>' attribute.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDAttributeGroupDefinition_AttributeGroupDefinitionReference()
	 * @model changeable="false" volatile="true"
	 * @generated
	 */
	boolean isAttributeGroupDefinitionReference();

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
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDAttributeGroupDefinition_Annotation()
	 * @model containment="true"
	 * @generated
	 */
	XSDAnnotation getAnnotation();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDAttributeGroupDefinition#getAnnotation <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation</em>' containment reference.
	 * @see #getAnnotation()
	 * @generated
	 */
	void setAnnotation(XSDAnnotation value);

	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
	 * The list contents are of type {@link tesis.xsd_ecore.xsd.XSDAttributeGroupContent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' containment reference list.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDAttributeGroupDefinition_Contents()
	 * @model containment="true"
	 * @generated
	 */
	EList<XSDAttributeGroupContent> getContents();

	/**
	 * Returns the value of the '<em><b>Attribute Uses</b></em>' reference list.
	 * The list contents are of type {@link tesis.xsd_ecore.xsd.XSDAttributeUse}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Uses</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Uses</em>' reference list.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDAttributeGroupDefinition_AttributeUses()
	 * @model resolveProxies="false"
	 * @generated
	 */
	EList<XSDAttributeUse> getAttributeUses();

	/**
	 * Returns the value of the '<em><b>Attribute Wildcard Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Wildcard Content</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Wildcard Content</em>' containment reference.
	 * @see #setAttributeWildcardContent(XSDWildcard)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDAttributeGroupDefinition_AttributeWildcardContent()
	 * @model containment="true"
	 * @generated
	 */
	XSDWildcard getAttributeWildcardContent();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDAttributeGroupDefinition#getAttributeWildcardContent <em>Attribute Wildcard Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Wildcard Content</em>' containment reference.
	 * @see #getAttributeWildcardContent()
	 * @generated
	 */
	void setAttributeWildcardContent(XSDWildcard value);

	/**
	 * Returns the value of the '<em><b>Attribute Wildcard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Wildcard</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Wildcard</em>' reference.
	 * @see #setAttributeWildcard(XSDWildcard)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDAttributeGroupDefinition_AttributeWildcard()
	 * @model resolveProxies="false"
	 * @generated
	 */
	XSDWildcard getAttributeWildcard();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDAttributeGroupDefinition#getAttributeWildcard <em>Attribute Wildcard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Wildcard</em>' reference.
	 * @see #getAttributeWildcard()
	 * @generated
	 */
	void setAttributeWildcard(XSDWildcard value);

	/**
	 * Returns the value of the '<em><b>Resolved Attribute Group Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolved Attribute Group Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolved Attribute Group Definition</em>' reference.
	 * @see #setResolvedAttributeGroupDefinition(XSDAttributeGroupDefinition)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDAttributeGroupDefinition_ResolvedAttributeGroupDefinition()
	 * @model resolveProxies="false" required="true"
	 * @generated
	 */
	XSDAttributeGroupDefinition getResolvedAttributeGroupDefinition();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDAttributeGroupDefinition#getResolvedAttributeGroupDefinition <em>Resolved Attribute Group Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolved Attribute Group Definition</em>' reference.
	 * @see #getResolvedAttributeGroupDefinition()
	 * @generated
	 */
	void setResolvedAttributeGroupDefinition(XSDAttributeGroupDefinition value);

	/**
	 * Returns the value of the '<em><b>Synthetic Wildcard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synthetic Wildcard</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synthetic Wildcard</em>' containment reference.
	 * @see #setSyntheticWildcard(XSDWildcard)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDAttributeGroupDefinition_SyntheticWildcard()
	 * @model containment="true" transient="true"
	 * @generated
	 */
	XSDWildcard getSyntheticWildcard();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDAttributeGroupDefinition#getSyntheticWildcard <em>Synthetic Wildcard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synthetic Wildcard</em>' containment reference.
	 * @see #getSyntheticWildcard()
	 * @generated
	 */
	void setSyntheticWildcard(XSDWildcard value);

} // XSDAttributeGroupDefinition
