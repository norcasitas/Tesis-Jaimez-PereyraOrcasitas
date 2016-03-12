/**
 */
package tesis.xsd_ecore.xsd;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XSD Wildcard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDWildcard#getNamespaceConstraintCategory <em>Namespace Constraint Category</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDWildcard#getNamespaceConstraint <em>Namespace Constraint</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDWildcard#getProcessContents <em>Process Contents</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDWildcard#getLexicalNamespaceConstraint <em>Lexical Namespace Constraint</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDWildcard#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDWildcard#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDWildcard()
 * @model
 * @generated
 */
public interface XSDWildcard extends XSDTerm {
	/**
	 * Returns the value of the '<em><b>Namespace Constraint Category</b></em>' attribute.
	 * The literals are from the enumeration {@link tesis.xsd_ecore.xsd.XSDNamespaceConstraintCategory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespace Constraint Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace Constraint Category</em>' attribute.
	 * @see tesis.xsd_ecore.xsd.XSDNamespaceConstraintCategory
	 * @see #setNamespaceConstraintCategory(XSDNamespaceConstraintCategory)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDWildcard_NamespaceConstraintCategory()
	 * @model
	 * @generated
	 */
	XSDNamespaceConstraintCategory getNamespaceConstraintCategory();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDWildcard#getNamespaceConstraintCategory <em>Namespace Constraint Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace Constraint Category</em>' attribute.
	 * @see tesis.xsd_ecore.xsd.XSDNamespaceConstraintCategory
	 * @see #getNamespaceConstraintCategory()
	 * @generated
	 */
	void setNamespaceConstraintCategory(XSDNamespaceConstraintCategory value);

	/**
	 * Returns the value of the '<em><b>Namespace Constraint</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespace Constraint</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace Constraint</em>' attribute list.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDWildcard_NamespaceConstraint()
	 * @model
	 * @generated
	 */
	EList<String> getNamespaceConstraint();

	/**
	 * Returns the value of the '<em><b>Process Contents</b></em>' attribute.
	 * The literals are from the enumeration {@link tesis.xsd_ecore.xsd.XSDProcessContents}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Contents</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Contents</em>' attribute.
	 * @see tesis.xsd_ecore.xsd.XSDProcessContents
	 * @see #isSetProcessContents()
	 * @see #unsetProcessContents()
	 * @see #setProcessContents(XSDProcessContents)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDWildcard_ProcessContents()
	 * @model unsettable="true"
	 * @generated
	 */
	XSDProcessContents getProcessContents();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDWildcard#getProcessContents <em>Process Contents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Contents</em>' attribute.
	 * @see tesis.xsd_ecore.xsd.XSDProcessContents
	 * @see #isSetProcessContents()
	 * @see #unsetProcessContents()
	 * @see #getProcessContents()
	 * @generated
	 */
	void setProcessContents(XSDProcessContents value);

	/**
	 * Unsets the value of the '{@link tesis.xsd_ecore.xsd.XSDWildcard#getProcessContents <em>Process Contents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProcessContents()
	 * @see #getProcessContents()
	 * @see #setProcessContents(XSDProcessContents)
	 * @generated
	 */
	void unsetProcessContents();

	/**
	 * Returns whether the value of the '{@link tesis.xsd_ecore.xsd.XSDWildcard#getProcessContents <em>Process Contents</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Process Contents</em>' attribute is set.
	 * @see #unsetProcessContents()
	 * @see #getProcessContents()
	 * @see #setProcessContents(XSDProcessContents)
	 * @generated
	 */
	boolean isSetProcessContents();

	/**
	 * Returns the value of the '<em><b>Lexical Namespace Constraint</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lexical Namespace Constraint</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lexical Namespace Constraint</em>' attribute list.
	 * @see #isSetLexicalNamespaceConstraint()
	 * @see #unsetLexicalNamespaceConstraint()
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDWildcard_LexicalNamespaceConstraint()
	 * @model unsettable="true"
	 * @generated
	 */
	EList<String> getLexicalNamespaceConstraint();

	/**
	 * Unsets the value of the '{@link tesis.xsd_ecore.xsd.XSDWildcard#getLexicalNamespaceConstraint <em>Lexical Namespace Constraint</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLexicalNamespaceConstraint()
	 * @see #getLexicalNamespaceConstraint()
	 * @generated
	 */
	void unsetLexicalNamespaceConstraint();

	/**
	 * Returns whether the value of the '{@link tesis.xsd_ecore.xsd.XSDWildcard#getLexicalNamespaceConstraint <em>Lexical Namespace Constraint</em>}' attribute list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lexical Namespace Constraint</em>' attribute list is set.
	 * @see #unsetLexicalNamespaceConstraint()
	 * @see #getLexicalNamespaceConstraint()
	 * @generated
	 */
	boolean isSetLexicalNamespaceConstraint();

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
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDWildcard_Annotation()
	 * @model containment="true"
	 * @generated
	 */
	XSDAnnotation getAnnotation();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDWildcard#getAnnotation <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation</em>' containment reference.
	 * @see #getAnnotation()
	 * @generated
	 */
	void setAnnotation(XSDAnnotation value);

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' reference list.
	 * The list contents are of type {@link tesis.xsd_ecore.xsd.XSDAnnotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' reference list.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDWildcard_Annotations()
	 * @model resolveProxies="false"
	 * @generated
	 */
	EList<XSDAnnotation> getAnnotations();

} // XSDWildcard
