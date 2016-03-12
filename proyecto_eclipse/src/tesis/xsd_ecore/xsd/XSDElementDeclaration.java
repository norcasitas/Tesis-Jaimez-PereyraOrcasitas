/**
 */
package tesis.xsd_ecore.xsd;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XSD Element Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDElementDeclaration#isNillable <em>Nillable</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDElementDeclaration#getDisallowedSubstitutions <em>Disallowed Substitutions</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDElementDeclaration#getSubstitutionGroupExclusions <em>Substitution Group Exclusions</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDElementDeclaration#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDElementDeclaration#getLexicalFinal <em>Lexical Final</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDElementDeclaration#getBlock <em>Block</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDElementDeclaration#isElementDeclarationReference <em>Element Declaration Reference</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDElementDeclaration#isCircular <em>Circular</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDElementDeclaration#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDElementDeclaration#getAnonymousTypeDefinition <em>Anonymous Type Definition</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDElementDeclaration#getTypeDefinition <em>Type Definition</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDElementDeclaration#getIdentityConstraintDefinitions <em>Identity Constraint Definitions</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDElementDeclaration#getResolvedElementDeclaration <em>Resolved Element Declaration</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDElementDeclaration#getSubstitutionGroupAffiliation <em>Substitution Group Affiliation</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDElementDeclaration#getSubstitutionGroup <em>Substitution Group</em>}</li>
 * </ul>
 *
 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDElementDeclaration()
 * @model
 * @generated
 */
public interface XSDElementDeclaration extends XSDFeature, XSDSchemaContent, XSDTerm {
	/**
	 * Returns the value of the '<em><b>Nillable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nillable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nillable</em>' attribute.
	 * @see #isSetNillable()
	 * @see #unsetNillable()
	 * @see #setNillable(boolean)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDElementDeclaration_Nillable()
	 * @model unsettable="true"
	 * @generated
	 */
	boolean isNillable();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDElementDeclaration#isNillable <em>Nillable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nillable</em>' attribute.
	 * @see #isSetNillable()
	 * @see #unsetNillable()
	 * @see #isNillable()
	 * @generated
	 */
	void setNillable(boolean value);

	/**
	 * Unsets the value of the '{@link tesis.xsd_ecore.xsd.XSDElementDeclaration#isNillable <em>Nillable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNillable()
	 * @see #isNillable()
	 * @see #setNillable(boolean)
	 * @generated
	 */
	void unsetNillable();

	/**
	 * Returns whether the value of the '{@link tesis.xsd_ecore.xsd.XSDElementDeclaration#isNillable <em>Nillable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nillable</em>' attribute is set.
	 * @see #unsetNillable()
	 * @see #isNillable()
	 * @see #setNillable(boolean)
	 * @generated
	 */
	boolean isSetNillable();

	/**
	 * Returns the value of the '<em><b>Disallowed Substitutions</b></em>' attribute list.
	 * The list contents are of type {@link tesis.xsd_ecore.xsd.XSDDisallowedSubstitutions}.
	 * The literals are from the enumeration {@link tesis.xsd_ecore.xsd.XSDDisallowedSubstitutions}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disallowed Substitutions</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disallowed Substitutions</em>' attribute list.
	 * @see tesis.xsd_ecore.xsd.XSDDisallowedSubstitutions
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDElementDeclaration_DisallowedSubstitutions()
	 * @model
	 * @generated
	 */
	EList<XSDDisallowedSubstitutions> getDisallowedSubstitutions();

	/**
	 * Returns the value of the '<em><b>Substitution Group Exclusions</b></em>' attribute list.
	 * The list contents are of type {@link tesis.xsd_ecore.xsd.XSDSubstitutionGroupExclusions}.
	 * The literals are from the enumeration {@link tesis.xsd_ecore.xsd.XSDSubstitutionGroupExclusions}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Substitution Group Exclusions</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substitution Group Exclusions</em>' attribute list.
	 * @see tesis.xsd_ecore.xsd.XSDSubstitutionGroupExclusions
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDElementDeclaration_SubstitutionGroupExclusions()
	 * @model
	 * @generated
	 */
	EList<XSDSubstitutionGroupExclusions> getSubstitutionGroupExclusions();

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #isSetAbstract()
	 * @see #unsetAbstract()
	 * @see #setAbstract(boolean)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDElementDeclaration_Abstract()
	 * @model unsettable="true"
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDElementDeclaration#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #isSetAbstract()
	 * @see #unsetAbstract()
	 * @see #isAbstract()
	 * @generated
	 */
	void setAbstract(boolean value);

	/**
	 * Unsets the value of the '{@link tesis.xsd_ecore.xsd.XSDElementDeclaration#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAbstract()
	 * @see #isAbstract()
	 * @see #setAbstract(boolean)
	 * @generated
	 */
	void unsetAbstract();

	/**
	 * Returns whether the value of the '{@link tesis.xsd_ecore.xsd.XSDElementDeclaration#isAbstract <em>Abstract</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Abstract</em>' attribute is set.
	 * @see #unsetAbstract()
	 * @see #isAbstract()
	 * @see #setAbstract(boolean)
	 * @generated
	 */
	boolean isSetAbstract();

	/**
	 * Returns the value of the '<em><b>Lexical Final</b></em>' attribute list.
	 * The list contents are of type {@link tesis.xsd_ecore.xsd.XSDProhibitedSubstitutions}.
	 * The literals are from the enumeration {@link tesis.xsd_ecore.xsd.XSDProhibitedSubstitutions}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lexical Final</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lexical Final</em>' attribute list.
	 * @see tesis.xsd_ecore.xsd.XSDProhibitedSubstitutions
	 * @see #isSetLexicalFinal()
	 * @see #unsetLexicalFinal()
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDElementDeclaration_LexicalFinal()
	 * @model unsettable="true"
	 * @generated
	 */
	EList<XSDProhibitedSubstitutions> getLexicalFinal();

	/**
	 * Unsets the value of the '{@link tesis.xsd_ecore.xsd.XSDElementDeclaration#getLexicalFinal <em>Lexical Final</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLexicalFinal()
	 * @see #getLexicalFinal()
	 * @generated
	 */
	void unsetLexicalFinal();

	/**
	 * Returns whether the value of the '{@link tesis.xsd_ecore.xsd.XSDElementDeclaration#getLexicalFinal <em>Lexical Final</em>}' attribute list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lexical Final</em>' attribute list is set.
	 * @see #unsetLexicalFinal()
	 * @see #getLexicalFinal()
	 * @generated
	 */
	boolean isSetLexicalFinal();

	/**
	 * Returns the value of the '<em><b>Block</b></em>' attribute list.
	 * The list contents are of type {@link tesis.xsd_ecore.xsd.XSDDisallowedSubstitutions}.
	 * The literals are from the enumeration {@link tesis.xsd_ecore.xsd.XSDDisallowedSubstitutions}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block</em>' attribute list.
	 * @see tesis.xsd_ecore.xsd.XSDDisallowedSubstitutions
	 * @see #isSetBlock()
	 * @see #unsetBlock()
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDElementDeclaration_Block()
	 * @model unsettable="true"
	 * @generated
	 */
	EList<XSDDisallowedSubstitutions> getBlock();

	/**
	 * Unsets the value of the '{@link tesis.xsd_ecore.xsd.XSDElementDeclaration#getBlock <em>Block</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBlock()
	 * @see #getBlock()
	 * @generated
	 */
	void unsetBlock();

	/**
	 * Returns whether the value of the '{@link tesis.xsd_ecore.xsd.XSDElementDeclaration#getBlock <em>Block</em>}' attribute list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Block</em>' attribute list is set.
	 * @see #unsetBlock()
	 * @see #getBlock()
	 * @generated
	 */
	boolean isSetBlock();

	/**
	 * Returns the value of the '<em><b>Element Declaration Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Declaration Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Declaration Reference</em>' attribute.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDElementDeclaration_ElementDeclarationReference()
	 * @model changeable="false" volatile="true"
	 * @generated
	 */
	boolean isElementDeclarationReference();

	/**
	 * Returns the value of the '<em><b>Circular</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Circular</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Circular</em>' attribute.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDElementDeclaration_Circular()
	 * @model changeable="false" volatile="true"
	 * @generated
	 */
	boolean isCircular();

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
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDElementDeclaration_Annotation()
	 * @model containment="true"
	 * @generated
	 */
	XSDAnnotation getAnnotation();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDElementDeclaration#getAnnotation <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation</em>' containment reference.
	 * @see #getAnnotation()
	 * @generated
	 */
	void setAnnotation(XSDAnnotation value);

	/**
	 * Returns the value of the '<em><b>Anonymous Type Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anonymous Type Definition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anonymous Type Definition</em>' containment reference.
	 * @see #setAnonymousTypeDefinition(XSDTypeDefinition)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDElementDeclaration_AnonymousTypeDefinition()
	 * @model containment="true"
	 * @generated
	 */
	XSDTypeDefinition getAnonymousTypeDefinition();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDElementDeclaration#getAnonymousTypeDefinition <em>Anonymous Type Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anonymous Type Definition</em>' containment reference.
	 * @see #getAnonymousTypeDefinition()
	 * @generated
	 */
	void setAnonymousTypeDefinition(XSDTypeDefinition value);

	/**
	 * Returns the value of the '<em><b>Type Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Definition</em>' reference.
	 * @see #setTypeDefinition(XSDTypeDefinition)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDElementDeclaration_TypeDefinition()
	 * @model resolveProxies="false" required="true"
	 * @generated
	 */
	XSDTypeDefinition getTypeDefinition();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDElementDeclaration#getTypeDefinition <em>Type Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Definition</em>' reference.
	 * @see #getTypeDefinition()
	 * @generated
	 */
	void setTypeDefinition(XSDTypeDefinition value);

	/**
	 * Returns the value of the '<em><b>Identity Constraint Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link tesis.xsd_ecore.xsd.XSDIdentityConstraintDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identity Constraint Definitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identity Constraint Definitions</em>' containment reference list.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDElementDeclaration_IdentityConstraintDefinitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<XSDIdentityConstraintDefinition> getIdentityConstraintDefinitions();

	/**
	 * Returns the value of the '<em><b>Resolved Element Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolved Element Declaration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolved Element Declaration</em>' reference.
	 * @see #setResolvedElementDeclaration(XSDElementDeclaration)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDElementDeclaration_ResolvedElementDeclaration()
	 * @model resolveProxies="false" required="true"
	 * @generated
	 */
	XSDElementDeclaration getResolvedElementDeclaration();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDElementDeclaration#getResolvedElementDeclaration <em>Resolved Element Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolved Element Declaration</em>' reference.
	 * @see #getResolvedElementDeclaration()
	 * @generated
	 */
	void setResolvedElementDeclaration(XSDElementDeclaration value);

	/**
	 * Returns the value of the '<em><b>Substitution Group Affiliation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Substitution Group Affiliation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substitution Group Affiliation</em>' reference.
	 * @see #setSubstitutionGroupAffiliation(XSDElementDeclaration)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDElementDeclaration_SubstitutionGroupAffiliation()
	 * @model resolveProxies="false"
	 * @generated
	 */
	XSDElementDeclaration getSubstitutionGroupAffiliation();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDElementDeclaration#getSubstitutionGroupAffiliation <em>Substitution Group Affiliation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substitution Group Affiliation</em>' reference.
	 * @see #getSubstitutionGroupAffiliation()
	 * @generated
	 */
	void setSubstitutionGroupAffiliation(XSDElementDeclaration value);

	/**
	 * Returns the value of the '<em><b>Substitution Group</b></em>' reference list.
	 * The list contents are of type {@link tesis.xsd_ecore.xsd.XSDElementDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Substitution Group</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substitution Group</em>' reference list.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDElementDeclaration_SubstitutionGroup()
	 * @model resolveProxies="false"
	 * @generated
	 */
	EList<XSDElementDeclaration> getSubstitutionGroup();

} // XSDElementDeclaration
