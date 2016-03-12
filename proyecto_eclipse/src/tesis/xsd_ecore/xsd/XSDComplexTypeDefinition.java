/**
 */
package tesis.xsd_ecore.xsd;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XSD Complex Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#getDerivationMethod <em>Derivation Method</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#getFinal <em>Final</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#getContentTypeCategory <em>Content Type Category</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#getProhibitedSubstitutions <em>Prohibited Substitutions</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#getLexicalFinal <em>Lexical Final</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#getBlock <em>Block</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#isMixed <em>Mixed</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#getContentAnnotation <em>Content Annotation</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#getBaseTypeDefinition <em>Base Type Definition</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#getContent <em>Content</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#getContentType <em>Content Type</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#getAttributeUses <em>Attribute Uses</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#getAttributeContents <em>Attribute Contents</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#getAttributeWildcard <em>Attribute Wildcard</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#getAttributeWildcardContent <em>Attribute Wildcard Content</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#getRootTypeDefinition <em>Root Type Definition</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#getSyntheticParticle <em>Synthetic Particle</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#getSyntheticWildcard <em>Synthetic Wildcard</em>}</li>
 * </ul>
 *
 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDComplexTypeDefinition()
 * @model
 * @generated
 */
public interface XSDComplexTypeDefinition extends XSDTypeDefinition, XSDScope {
	/**
	 * Returns the value of the '<em><b>Derivation Method</b></em>' attribute.
	 * The default value is <code>"restriction"</code>.
	 * The literals are from the enumeration {@link tesis.xsd_ecore.xsd.XSDDerivationMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derivation Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derivation Method</em>' attribute.
	 * @see tesis.xsd_ecore.xsd.XSDDerivationMethod
	 * @see #isSetDerivationMethod()
	 * @see #unsetDerivationMethod()
	 * @see #setDerivationMethod(XSDDerivationMethod)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDComplexTypeDefinition_DerivationMethod()
	 * @model default="restriction" unsettable="true"
	 * @generated
	 */
	XSDDerivationMethod getDerivationMethod();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#getDerivationMethod <em>Derivation Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derivation Method</em>' attribute.
	 * @see tesis.xsd_ecore.xsd.XSDDerivationMethod
	 * @see #isSetDerivationMethod()
	 * @see #unsetDerivationMethod()
	 * @see #getDerivationMethod()
	 * @generated
	 */
	void setDerivationMethod(XSDDerivationMethod value);

	/**
	 * Unsets the value of the '{@link tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#getDerivationMethod <em>Derivation Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDerivationMethod()
	 * @see #getDerivationMethod()
	 * @see #setDerivationMethod(XSDDerivationMethod)
	 * @generated
	 */
	void unsetDerivationMethod();

	/**
	 * Returns whether the value of the '{@link tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#getDerivationMethod <em>Derivation Method</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Derivation Method</em>' attribute is set.
	 * @see #unsetDerivationMethod()
	 * @see #getDerivationMethod()
	 * @see #setDerivationMethod(XSDDerivationMethod)
	 * @generated
	 */
	boolean isSetDerivationMethod();

	/**
	 * Returns the value of the '<em><b>Final</b></em>' attribute list.
	 * The list contents are of type {@link tesis.xsd_ecore.xsd.XSDComplexFinal}.
	 * The literals are from the enumeration {@link tesis.xsd_ecore.xsd.XSDComplexFinal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final</em>' attribute list.
	 * @see tesis.xsd_ecore.xsd.XSDComplexFinal
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDComplexTypeDefinition_Final()
	 * @model
	 * @generated
	 */
	EList<XSDComplexFinal> getFinal();

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
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDComplexTypeDefinition_Abstract()
	 * @model unsettable="true"
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#isAbstract <em>Abstract</em>}' attribute.
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
	 * Unsets the value of the '{@link tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAbstract()
	 * @see #isAbstract()
	 * @see #setAbstract(boolean)
	 * @generated
	 */
	void unsetAbstract();

	/**
	 * Returns whether the value of the '{@link tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#isAbstract <em>Abstract</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Content Type Category</b></em>' attribute.
	 * The literals are from the enumeration {@link tesis.xsd_ecore.xsd.XSDContentTypeCategory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Type Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Type Category</em>' attribute.
	 * @see tesis.xsd_ecore.xsd.XSDContentTypeCategory
	 * @see #setContentTypeCategory(XSDContentTypeCategory)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDComplexTypeDefinition_ContentTypeCategory()
	 * @model
	 * @generated
	 */
	XSDContentTypeCategory getContentTypeCategory();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#getContentTypeCategory <em>Content Type Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Type Category</em>' attribute.
	 * @see tesis.xsd_ecore.xsd.XSDContentTypeCategory
	 * @see #getContentTypeCategory()
	 * @generated
	 */
	void setContentTypeCategory(XSDContentTypeCategory value);

	/**
	 * Returns the value of the '<em><b>Prohibited Substitutions</b></em>' attribute list.
	 * The list contents are of type {@link tesis.xsd_ecore.xsd.XSDProhibitedSubstitutions}.
	 * The literals are from the enumeration {@link tesis.xsd_ecore.xsd.XSDProhibitedSubstitutions}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prohibited Substitutions</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prohibited Substitutions</em>' attribute list.
	 * @see tesis.xsd_ecore.xsd.XSDProhibitedSubstitutions
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDComplexTypeDefinition_ProhibitedSubstitutions()
	 * @model
	 * @generated
	 */
	EList<XSDProhibitedSubstitutions> getProhibitedSubstitutions();

	/**
	 * Returns the value of the '<em><b>Lexical Final</b></em>' attribute list.
	 * The list contents are of type {@link tesis.xsd_ecore.xsd.XSDComplexFinal}.
	 * The literals are from the enumeration {@link tesis.xsd_ecore.xsd.XSDComplexFinal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lexical Final</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lexical Final</em>' attribute list.
	 * @see tesis.xsd_ecore.xsd.XSDComplexFinal
	 * @see #isSetLexicalFinal()
	 * @see #unsetLexicalFinal()
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDComplexTypeDefinition_LexicalFinal()
	 * @model unsettable="true"
	 * @generated
	 */
	EList<XSDComplexFinal> getLexicalFinal();

	/**
	 * Unsets the value of the '{@link tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#getLexicalFinal <em>Lexical Final</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLexicalFinal()
	 * @see #getLexicalFinal()
	 * @generated
	 */
	void unsetLexicalFinal();

	/**
	 * Returns whether the value of the '{@link tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#getLexicalFinal <em>Lexical Final</em>}' attribute list is set.
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
	 * The list contents are of type {@link tesis.xsd_ecore.xsd.XSDProhibitedSubstitutions}.
	 * The literals are from the enumeration {@link tesis.xsd_ecore.xsd.XSDProhibitedSubstitutions}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block</em>' attribute list.
	 * @see tesis.xsd_ecore.xsd.XSDProhibitedSubstitutions
	 * @see #isSetBlock()
	 * @see #unsetBlock()
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDComplexTypeDefinition_Block()
	 * @model unsettable="true"
	 * @generated
	 */
	EList<XSDProhibitedSubstitutions> getBlock();

	/**
	 * Unsets the value of the '{@link tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#getBlock <em>Block</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBlock()
	 * @see #getBlock()
	 * @generated
	 */
	void unsetBlock();

	/**
	 * Returns whether the value of the '{@link tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#getBlock <em>Block</em>}' attribute list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Block</em>' attribute list is set.
	 * @see #unsetBlock()
	 * @see #getBlock()
	 * @generated
	 */
	boolean isSetBlock();

	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute.
	 * @see #isSetMixed()
	 * @see #unsetMixed()
	 * @see #setMixed(boolean)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDComplexTypeDefinition_Mixed()
	 * @model unsettable="true"
	 * @generated
	 */
	boolean isMixed();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#isMixed <em>Mixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mixed</em>' attribute.
	 * @see #isSetMixed()
	 * @see #unsetMixed()
	 * @see #isMixed()
	 * @generated
	 */
	void setMixed(boolean value);

	/**
	 * Unsets the value of the '{@link tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#isMixed <em>Mixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMixed()
	 * @see #isMixed()
	 * @see #setMixed(boolean)
	 * @generated
	 */
	void unsetMixed();

	/**
	 * Returns whether the value of the '{@link tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#isMixed <em>Mixed</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mixed</em>' attribute is set.
	 * @see #unsetMixed()
	 * @see #isMixed()
	 * @see #setMixed(boolean)
	 * @generated
	 */
	boolean isSetMixed();

	/**
	 * Returns the value of the '<em><b>Content Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Annotation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Annotation</em>' containment reference.
	 * @see #setContentAnnotation(XSDAnnotation)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDComplexTypeDefinition_ContentAnnotation()
	 * @model containment="true"
	 * @generated
	 */
	XSDAnnotation getContentAnnotation();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#getContentAnnotation <em>Content Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Annotation</em>' containment reference.
	 * @see #getContentAnnotation()
	 * @generated
	 */
	void setContentAnnotation(XSDAnnotation value);

	/**
	 * Returns the value of the '<em><b>Base Type Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Type Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Type Definition</em>' reference.
	 * @see #setBaseTypeDefinition(XSDTypeDefinition)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDComplexTypeDefinition_BaseTypeDefinition()
	 * @model resolveProxies="false" required="true"
	 * @generated
	 */
	XSDTypeDefinition getBaseTypeDefinition();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#getBaseTypeDefinition <em>Base Type Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Type Definition</em>' reference.
	 * @see #getBaseTypeDefinition()
	 * @generated
	 */
	void setBaseTypeDefinition(XSDTypeDefinition value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference.
	 * @see #setContent(XSDComplexTypeContent)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDComplexTypeDefinition_Content()
	 * @model containment="true"
	 * @generated
	 */
	XSDComplexTypeContent getContent();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#getContent <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' containment reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(XSDComplexTypeContent value);

	/**
	 * Returns the value of the '<em><b>Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Type</em>' reference.
	 * @see #setContentType(XSDComplexTypeContent)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDComplexTypeDefinition_ContentType()
	 * @model resolveProxies="false"
	 * @generated
	 */
	XSDComplexTypeContent getContentType();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#getContentType <em>Content Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Type</em>' reference.
	 * @see #getContentType()
	 * @generated
	 */
	void setContentType(XSDComplexTypeContent value);

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
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDComplexTypeDefinition_AttributeUses()
	 * @model resolveProxies="false"
	 * @generated
	 */
	EList<XSDAttributeUse> getAttributeUses();

	/**
	 * Returns the value of the '<em><b>Attribute Contents</b></em>' containment reference list.
	 * The list contents are of type {@link tesis.xsd_ecore.xsd.XSDAttributeGroupContent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Contents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Contents</em>' containment reference list.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDComplexTypeDefinition_AttributeContents()
	 * @model containment="true"
	 * @generated
	 */
	EList<XSDAttributeGroupContent> getAttributeContents();

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
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDComplexTypeDefinition_AttributeWildcard()
	 * @model resolveProxies="false"
	 * @generated
	 */
	XSDWildcard getAttributeWildcard();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#getAttributeWildcard <em>Attribute Wildcard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Wildcard</em>' reference.
	 * @see #getAttributeWildcard()
	 * @generated
	 */
	void setAttributeWildcard(XSDWildcard value);

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
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDComplexTypeDefinition_AttributeWildcardContent()
	 * @model containment="true"
	 * @generated
	 */
	XSDWildcard getAttributeWildcardContent();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#getAttributeWildcardContent <em>Attribute Wildcard Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Wildcard Content</em>' containment reference.
	 * @see #getAttributeWildcardContent()
	 * @generated
	 */
	void setAttributeWildcardContent(XSDWildcard value);

	/**
	 * Returns the value of the '<em><b>Root Type Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Type Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Type Definition</em>' reference.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDComplexTypeDefinition_RootTypeDefinition()
	 * @model resolveProxies="false" required="true" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	XSDTypeDefinition getRootTypeDefinition();

	/**
	 * Returns the value of the '<em><b>Synthetic Particle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synthetic Particle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synthetic Particle</em>' containment reference.
	 * @see #setSyntheticParticle(XSDParticle)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDComplexTypeDefinition_SyntheticParticle()
	 * @model containment="true" transient="true"
	 * @generated
	 */
	XSDParticle getSyntheticParticle();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#getSyntheticParticle <em>Synthetic Particle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synthetic Particle</em>' containment reference.
	 * @see #getSyntheticParticle()
	 * @generated
	 */
	void setSyntheticParticle(XSDParticle value);

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
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDComplexTypeDefinition_SyntheticWildcard()
	 * @model containment="true" transient="true"
	 * @generated
	 */
	XSDWildcard getSyntheticWildcard();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDComplexTypeDefinition#getSyntheticWildcard <em>Synthetic Wildcard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synthetic Wildcard</em>' containment reference.
	 * @see #getSyntheticWildcard()
	 * @generated
	 */
	void setSyntheticWildcard(XSDWildcard value);

} // XSDComplexTypeDefinition
