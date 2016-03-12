/**
 */
package tesis.xsd_ecore.xsd;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XSD Simple Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getVariety <em>Variety</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getFinal <em>Final</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getLexicalFinal <em>Lexical Final</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getValidFacets <em>Valid Facets</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getContents <em>Contents</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getFacetContents <em>Facet Contents</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getFacets <em>Facets</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getMemberTypeDefinitions <em>Member Type Definitions</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getFundamentalFacets <em>Fundamental Facets</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getBaseTypeDefinition <em>Base Type Definition</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getPrimitiveTypeDefinition <em>Primitive Type Definition</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getItemTypeDefinition <em>Item Type Definition</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getRootTypeDefinition <em>Root Type Definition</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getMinFacet <em>Min Facet</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getMaxFacet <em>Max Facet</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getMaxInclusiveFacet <em>Max Inclusive Facet</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getMinInclusiveFacet <em>Min Inclusive Facet</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getMinExclusiveFacet <em>Min Exclusive Facet</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getMaxExclusiveFacet <em>Max Exclusive Facet</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getLengthFacet <em>Length Facet</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getWhiteSpaceFacet <em>White Space Facet</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getEnumerationFacets <em>Enumeration Facets</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getPatternFacets <em>Pattern Facets</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getCardinalityFacet <em>Cardinality Facet</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getNumericFacet <em>Numeric Facet</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getMaxLengthFacet <em>Max Length Facet</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getMinLengthFacet <em>Min Length Facet</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getTotalDigitsFacet <em>Total Digits Facet</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getFractionDigitsFacet <em>Fraction Digits Facet</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getOrderedFacet <em>Ordered Facet</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getBoundedFacet <em>Bounded Facet</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getEffectiveMaxFacet <em>Effective Max Facet</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getEffectiveWhiteSpaceFacet <em>Effective White Space Facet</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getEffectiveMaxLengthFacet <em>Effective Max Length Facet</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getEffectiveFractionDigitsFacet <em>Effective Fraction Digits Facet</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getEffectivePatternFacet <em>Effective Pattern Facet</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getEffectiveEnumerationFacet <em>Effective Enumeration Facet</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getEffectiveTotalDigitsFacet <em>Effective Total Digits Facet</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getEffectiveMinLengthFacet <em>Effective Min Length Facet</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getEffectiveLengthFacet <em>Effective Length Facet</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getEffectiveMinFacet <em>Effective Min Facet</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getSyntheticFacets <em>Synthetic Facets</em>}</li>
 * </ul>
 *
 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSimpleTypeDefinition()
 * @model
 * @generated
 */
public interface XSDSimpleTypeDefinition extends XSDTypeDefinition, XSDComplexTypeContent {
	/**
	 * Returns the value of the '<em><b>Variety</b></em>' attribute.
	 * The literals are from the enumeration {@link tesis.xsd_ecore.xsd.XSDVariety}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variety</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variety</em>' attribute.
	 * @see tesis.xsd_ecore.xsd.XSDVariety
	 * @see #isSetVariety()
	 * @see #unsetVariety()
	 * @see #setVariety(XSDVariety)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSimpleTypeDefinition_Variety()
	 * @model unsettable="true"
	 * @generated
	 */
	XSDVariety getVariety();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getVariety <em>Variety</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variety</em>' attribute.
	 * @see tesis.xsd_ecore.xsd.XSDVariety
	 * @see #isSetVariety()
	 * @see #unsetVariety()
	 * @see #getVariety()
	 * @generated
	 */
	void setVariety(XSDVariety value);

	/**
	 * Unsets the value of the '{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getVariety <em>Variety</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVariety()
	 * @see #getVariety()
	 * @see #setVariety(XSDVariety)
	 * @generated
	 */
	void unsetVariety();

	/**
	 * Returns whether the value of the '{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getVariety <em>Variety</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Variety</em>' attribute is set.
	 * @see #unsetVariety()
	 * @see #getVariety()
	 * @see #setVariety(XSDVariety)
	 * @generated
	 */
	boolean isSetVariety();

	/**
	 * Returns the value of the '<em><b>Final</b></em>' attribute list.
	 * The list contents are of type {@link tesis.xsd_ecore.xsd.XSDSimpleFinal}.
	 * The literals are from the enumeration {@link tesis.xsd_ecore.xsd.XSDSimpleFinal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final</em>' attribute list.
	 * @see tesis.xsd_ecore.xsd.XSDSimpleFinal
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSimpleTypeDefinition_Final()
	 * @model
	 * @generated
	 */
	EList<XSDSimpleFinal> getFinal();

	/**
	 * Returns the value of the '<em><b>Lexical Final</b></em>' attribute list.
	 * The list contents are of type {@link tesis.xsd_ecore.xsd.XSDSimpleFinal}.
	 * The literals are from the enumeration {@link tesis.xsd_ecore.xsd.XSDSimpleFinal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lexical Final</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lexical Final</em>' attribute list.
	 * @see tesis.xsd_ecore.xsd.XSDSimpleFinal
	 * @see #isSetLexicalFinal()
	 * @see #unsetLexicalFinal()
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSimpleTypeDefinition_LexicalFinal()
	 * @model unsettable="true"
	 * @generated
	 */
	EList<XSDSimpleFinal> getLexicalFinal();

	/**
	 * Unsets the value of the '{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getLexicalFinal <em>Lexical Final</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLexicalFinal()
	 * @see #getLexicalFinal()
	 * @generated
	 */
	void unsetLexicalFinal();

	/**
	 * Returns whether the value of the '{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getLexicalFinal <em>Lexical Final</em>}' attribute list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lexical Final</em>' attribute list is set.
	 * @see #unsetLexicalFinal()
	 * @see #getLexicalFinal()
	 * @generated
	 */
	boolean isSetLexicalFinal();

	/**
	 * Returns the value of the '<em><b>Valid Facets</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valid Facets</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid Facets</em>' attribute list.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSimpleTypeDefinition_ValidFacets()
	 * @model
	 * @generated
	 */
	EList<String> getValidFacets();

	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
	 * The list contents are of type {@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' containment reference list.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSimpleTypeDefinition_Contents()
	 * @model containment="true"
	 * @generated
	 */
	EList<XSDSimpleTypeDefinition> getContents();

	/**
	 * Returns the value of the '<em><b>Facet Contents</b></em>' containment reference list.
	 * The list contents are of type {@link tesis.xsd_ecore.xsd.XSDConstrainingFacet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facet Contents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facet Contents</em>' containment reference list.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSimpleTypeDefinition_FacetContents()
	 * @model containment="true"
	 * @generated
	 */
	EList<XSDConstrainingFacet> getFacetContents();

	/**
	 * Returns the value of the '<em><b>Facets</b></em>' reference list.
	 * The list contents are of type {@link tesis.xsd_ecore.xsd.XSDConstrainingFacet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facets</em>' reference list.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSimpleTypeDefinition_Facets()
	 * @model resolveProxies="false"
	 * @generated
	 */
	EList<XSDConstrainingFacet> getFacets();

	/**
	 * Returns the value of the '<em><b>Member Type Definitions</b></em>' reference list.
	 * The list contents are of type {@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member Type Definitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Type Definitions</em>' reference list.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSimpleTypeDefinition_MemberTypeDefinitions()
	 * @model resolveProxies="false"
	 * @generated
	 */
	EList<XSDSimpleTypeDefinition> getMemberTypeDefinitions();

	/**
	 * Returns the value of the '<em><b>Fundamental Facets</b></em>' containment reference list.
	 * The list contents are of type {@link tesis.xsd_ecore.xsd.XSDFundamentalFacet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fundamental Facets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fundamental Facets</em>' containment reference list.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSimpleTypeDefinition_FundamentalFacets()
	 * @model containment="true" required="true" transient="true"
	 * @generated
	 */
	EList<XSDFundamentalFacet> getFundamentalFacets();

	/**
	 * Returns the value of the '<em><b>Base Type Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Type Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Type Definition</em>' reference.
	 * @see #setBaseTypeDefinition(XSDSimpleTypeDefinition)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSimpleTypeDefinition_BaseTypeDefinition()
	 * @model resolveProxies="false" required="true"
	 * @generated
	 */
	XSDSimpleTypeDefinition getBaseTypeDefinition();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getBaseTypeDefinition <em>Base Type Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Type Definition</em>' reference.
	 * @see #getBaseTypeDefinition()
	 * @generated
	 */
	void setBaseTypeDefinition(XSDSimpleTypeDefinition value);

	/**
	 * Returns the value of the '<em><b>Primitive Type Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primitive Type Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitive Type Definition</em>' reference.
	 * @see #setPrimitiveTypeDefinition(XSDSimpleTypeDefinition)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSimpleTypeDefinition_PrimitiveTypeDefinition()
	 * @model resolveProxies="false"
	 * @generated
	 */
	XSDSimpleTypeDefinition getPrimitiveTypeDefinition();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getPrimitiveTypeDefinition <em>Primitive Type Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primitive Type Definition</em>' reference.
	 * @see #getPrimitiveTypeDefinition()
	 * @generated
	 */
	void setPrimitiveTypeDefinition(XSDSimpleTypeDefinition value);

	/**
	 * Returns the value of the '<em><b>Item Type Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Type Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Type Definition</em>' reference.
	 * @see #setItemTypeDefinition(XSDSimpleTypeDefinition)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSimpleTypeDefinition_ItemTypeDefinition()
	 * @model resolveProxies="false"
	 * @generated
	 */
	XSDSimpleTypeDefinition getItemTypeDefinition();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition#getItemTypeDefinition <em>Item Type Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Type Definition</em>' reference.
	 * @see #getItemTypeDefinition()
	 * @generated
	 */
	void setItemTypeDefinition(XSDSimpleTypeDefinition value);

	/**
	 * Returns the value of the '<em><b>Root Type Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Type Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Type Definition</em>' reference.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSimpleTypeDefinition_RootTypeDefinition()
	 * @model resolveProxies="false" required="true" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	XSDSimpleTypeDefinition getRootTypeDefinition();

	/**
	 * Returns the value of the '<em><b>Min Facet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Facet</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Facet</em>' reference.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSimpleTypeDefinition_MinFacet()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	XSDMinFacet getMinFacet();

	/**
	 * Returns the value of the '<em><b>Max Facet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Facet</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Facet</em>' reference.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSimpleTypeDefinition_MaxFacet()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	XSDMaxFacet getMaxFacet();

	/**
	 * Returns the value of the '<em><b>Max Inclusive Facet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Inclusive Facet</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Inclusive Facet</em>' reference.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSimpleTypeDefinition_MaxInclusiveFacet()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	XSDMaxInclusiveFacet getMaxInclusiveFacet();

	/**
	 * Returns the value of the '<em><b>Min Inclusive Facet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Inclusive Facet</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Inclusive Facet</em>' reference.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSimpleTypeDefinition_MinInclusiveFacet()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	XSDMinInclusiveFacet getMinInclusiveFacet();

	/**
	 * Returns the value of the '<em><b>Min Exclusive Facet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Exclusive Facet</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Exclusive Facet</em>' reference.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSimpleTypeDefinition_MinExclusiveFacet()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	XSDMinExclusiveFacet getMinExclusiveFacet();

	/**
	 * Returns the value of the '<em><b>Max Exclusive Facet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Exclusive Facet</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Exclusive Facet</em>' reference.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSimpleTypeDefinition_MaxExclusiveFacet()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	XSDMaxExclusiveFacet getMaxExclusiveFacet();

	/**
	 * Returns the value of the '<em><b>Length Facet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length Facet</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length Facet</em>' reference.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSimpleTypeDefinition_LengthFacet()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	XSDLengthFacet getLengthFacet();

	/**
	 * Returns the value of the '<em><b>White Space Facet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>White Space Facet</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>White Space Facet</em>' reference.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSimpleTypeDefinition_WhiteSpaceFacet()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	XSDWhiteSpaceFacet getWhiteSpaceFacet();

	/**
	 * Returns the value of the '<em><b>Enumeration Facets</b></em>' reference list.
	 * The list contents are of type {@link tesis.xsd_ecore.xsd.XSDEnumerationFacet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumeration Facets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumeration Facets</em>' reference list.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSimpleTypeDefinition_EnumerationFacets()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	EList<XSDEnumerationFacet> getEnumerationFacets();

	/**
	 * Returns the value of the '<em><b>Pattern Facets</b></em>' reference list.
	 * The list contents are of type {@link tesis.xsd_ecore.xsd.XSDPatternFacet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern Facets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Facets</em>' reference list.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSimpleTypeDefinition_PatternFacets()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	EList<XSDPatternFacet> getPatternFacets();

	/**
	 * Returns the value of the '<em><b>Cardinality Facet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality Facet</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality Facet</em>' reference.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSimpleTypeDefinition_CardinalityFacet()
	 * @model resolveProxies="false" required="true" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	XSDCardinalityFacet getCardinalityFacet();

	/**
	 * Returns the value of the '<em><b>Numeric Facet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numeric Facet</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numeric Facet</em>' reference.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSimpleTypeDefinition_NumericFacet()
	 * @model resolveProxies="false" required="true" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	XSDNumericFacet getNumericFacet();

	/**
	 * Returns the value of the '<em><b>Max Length Facet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Length Facet</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Length Facet</em>' reference.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSimpleTypeDefinition_MaxLengthFacet()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	XSDMaxLengthFacet getMaxLengthFacet();

	/**
	 * Returns the value of the '<em><b>Min Length Facet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Length Facet</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Length Facet</em>' reference.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSimpleTypeDefinition_MinLengthFacet()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	XSDMinLengthFacet getMinLengthFacet();

	/**
	 * Returns the value of the '<em><b>Total Digits Facet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Digits Facet</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Digits Facet</em>' reference.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSimpleTypeDefinition_TotalDigitsFacet()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	XSDTotalDigitsFacet getTotalDigitsFacet();

	/**
	 * Returns the value of the '<em><b>Fraction Digits Facet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fraction Digits Facet</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fraction Digits Facet</em>' reference.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSimpleTypeDefinition_FractionDigitsFacet()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	XSDFractionDigitsFacet getFractionDigitsFacet();

	/**
	 * Returns the value of the '<em><b>Ordered Facet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ordered Facet</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordered Facet</em>' reference.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSimpleTypeDefinition_OrderedFacet()
	 * @model resolveProxies="false" required="true" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	XSDOrderedFacet getOrderedFacet();

	/**
	 * Returns the value of the '<em><b>Bounded Facet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bounded Facet</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bounded Facet</em>' reference.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSimpleTypeDefinition_BoundedFacet()
	 * @model resolveProxies="false" required="true" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	XSDBoundedFacet getBoundedFacet();

	/**
	 * Returns the value of the '<em><b>Effective Max Facet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effective Max Facet</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effective Max Facet</em>' reference.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSimpleTypeDefinition_EffectiveMaxFacet()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	XSDMaxFacet getEffectiveMaxFacet();

	/**
	 * Returns the value of the '<em><b>Effective White Space Facet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effective White Space Facet</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effective White Space Facet</em>' reference.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSimpleTypeDefinition_EffectiveWhiteSpaceFacet()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	XSDWhiteSpaceFacet getEffectiveWhiteSpaceFacet();

	/**
	 * Returns the value of the '<em><b>Effective Max Length Facet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effective Max Length Facet</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effective Max Length Facet</em>' reference.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSimpleTypeDefinition_EffectiveMaxLengthFacet()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	XSDMaxLengthFacet getEffectiveMaxLengthFacet();

	/**
	 * Returns the value of the '<em><b>Effective Fraction Digits Facet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effective Fraction Digits Facet</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effective Fraction Digits Facet</em>' reference.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSimpleTypeDefinition_EffectiveFractionDigitsFacet()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	XSDFractionDigitsFacet getEffectiveFractionDigitsFacet();

	/**
	 * Returns the value of the '<em><b>Effective Pattern Facet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effective Pattern Facet</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effective Pattern Facet</em>' reference.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSimpleTypeDefinition_EffectivePatternFacet()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	XSDPatternFacet getEffectivePatternFacet();

	/**
	 * Returns the value of the '<em><b>Effective Enumeration Facet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effective Enumeration Facet</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effective Enumeration Facet</em>' reference.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSimpleTypeDefinition_EffectiveEnumerationFacet()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	XSDEnumerationFacet getEffectiveEnumerationFacet();

	/**
	 * Returns the value of the '<em><b>Effective Total Digits Facet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effective Total Digits Facet</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effective Total Digits Facet</em>' reference.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSimpleTypeDefinition_EffectiveTotalDigitsFacet()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	XSDTotalDigitsFacet getEffectiveTotalDigitsFacet();

	/**
	 * Returns the value of the '<em><b>Effective Min Length Facet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effective Min Length Facet</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effective Min Length Facet</em>' reference.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSimpleTypeDefinition_EffectiveMinLengthFacet()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	XSDMinLengthFacet getEffectiveMinLengthFacet();

	/**
	 * Returns the value of the '<em><b>Effective Length Facet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effective Length Facet</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effective Length Facet</em>' reference.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSimpleTypeDefinition_EffectiveLengthFacet()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	XSDLengthFacet getEffectiveLengthFacet();

	/**
	 * Returns the value of the '<em><b>Effective Min Facet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effective Min Facet</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effective Min Facet</em>' reference.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSimpleTypeDefinition_EffectiveMinFacet()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	XSDMinFacet getEffectiveMinFacet();

	/**
	 * Returns the value of the '<em><b>Synthetic Facets</b></em>' containment reference list.
	 * The list contents are of type {@link tesis.xsd_ecore.xsd.XSDFacet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synthetic Facets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synthetic Facets</em>' containment reference list.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSimpleTypeDefinition_SyntheticFacets()
	 * @model containment="true" transient="true"
	 * @generated
	 */
	EList<XSDFacet> getSyntheticFacets();

} // XSDSimpleTypeDefinition
