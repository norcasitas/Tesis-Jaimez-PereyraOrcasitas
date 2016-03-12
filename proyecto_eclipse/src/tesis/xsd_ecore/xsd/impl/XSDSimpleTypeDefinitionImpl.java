/**
 */
package tesis.xsd_ecore.xsd.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tesis.xsd_ecore.xsd.XSDBoundedFacet;
import tesis.xsd_ecore.xsd.XSDCardinalityFacet;
import tesis.xsd_ecore.xsd.XSDConstrainingFacet;
import tesis.xsd_ecore.xsd.XSDEnumerationFacet;
import tesis.xsd_ecore.xsd.XSDFacet;
import tesis.xsd_ecore.xsd.XSDFractionDigitsFacet;
import tesis.xsd_ecore.xsd.XSDFundamentalFacet;
import tesis.xsd_ecore.xsd.XSDLengthFacet;
import tesis.xsd_ecore.xsd.XSDMaxExclusiveFacet;
import tesis.xsd_ecore.xsd.XSDMaxFacet;
import tesis.xsd_ecore.xsd.XSDMaxInclusiveFacet;
import tesis.xsd_ecore.xsd.XSDMaxLengthFacet;
import tesis.xsd_ecore.xsd.XSDMinExclusiveFacet;
import tesis.xsd_ecore.xsd.XSDMinFacet;
import tesis.xsd_ecore.xsd.XSDMinInclusiveFacet;
import tesis.xsd_ecore.xsd.XSDMinLengthFacet;
import tesis.xsd_ecore.xsd.XSDNumericFacet;
import tesis.xsd_ecore.xsd.XSDOrderedFacet;
import tesis.xsd_ecore.xsd.XSDPatternFacet;
import tesis.xsd_ecore.xsd.XSDSimpleFinal;
import tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition;
import tesis.xsd_ecore.xsd.XSDTotalDigitsFacet;
import tesis.xsd_ecore.xsd.XSDVariety;
import tesis.xsd_ecore.xsd.XSDWhiteSpaceFacet;
import tesis.xsd_ecore.xsd.XsdPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XSD Simple Type Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDSimpleTypeDefinitionImpl#getVariety <em>Variety</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDSimpleTypeDefinitionImpl#getFinal <em>Final</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDSimpleTypeDefinitionImpl#getLexicalFinal <em>Lexical Final</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDSimpleTypeDefinitionImpl#getValidFacets <em>Valid Facets</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDSimpleTypeDefinitionImpl#getContents <em>Contents</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDSimpleTypeDefinitionImpl#getFacetContents <em>Facet Contents</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDSimpleTypeDefinitionImpl#getFacets <em>Facets</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDSimpleTypeDefinitionImpl#getMemberTypeDefinitions <em>Member Type Definitions</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDSimpleTypeDefinitionImpl#getFundamentalFacets <em>Fundamental Facets</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDSimpleTypeDefinitionImpl#getBaseTypeDefinition <em>Base Type Definition</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDSimpleTypeDefinitionImpl#getPrimitiveTypeDefinition <em>Primitive Type Definition</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDSimpleTypeDefinitionImpl#getItemTypeDefinition <em>Item Type Definition</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDSimpleTypeDefinitionImpl#getRootTypeDefinition <em>Root Type Definition</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDSimpleTypeDefinitionImpl#getMinFacet <em>Min Facet</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDSimpleTypeDefinitionImpl#getMaxFacet <em>Max Facet</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDSimpleTypeDefinitionImpl#getMaxInclusiveFacet <em>Max Inclusive Facet</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDSimpleTypeDefinitionImpl#getMinInclusiveFacet <em>Min Inclusive Facet</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDSimpleTypeDefinitionImpl#getMinExclusiveFacet <em>Min Exclusive Facet</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDSimpleTypeDefinitionImpl#getMaxExclusiveFacet <em>Max Exclusive Facet</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDSimpleTypeDefinitionImpl#getLengthFacet <em>Length Facet</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDSimpleTypeDefinitionImpl#getWhiteSpaceFacet <em>White Space Facet</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDSimpleTypeDefinitionImpl#getEnumerationFacets <em>Enumeration Facets</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDSimpleTypeDefinitionImpl#getPatternFacets <em>Pattern Facets</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDSimpleTypeDefinitionImpl#getCardinalityFacet <em>Cardinality Facet</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDSimpleTypeDefinitionImpl#getNumericFacet <em>Numeric Facet</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDSimpleTypeDefinitionImpl#getMaxLengthFacet <em>Max Length Facet</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDSimpleTypeDefinitionImpl#getMinLengthFacet <em>Min Length Facet</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDSimpleTypeDefinitionImpl#getTotalDigitsFacet <em>Total Digits Facet</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDSimpleTypeDefinitionImpl#getFractionDigitsFacet <em>Fraction Digits Facet</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDSimpleTypeDefinitionImpl#getOrderedFacet <em>Ordered Facet</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDSimpleTypeDefinitionImpl#getBoundedFacet <em>Bounded Facet</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDSimpleTypeDefinitionImpl#getEffectiveMaxFacet <em>Effective Max Facet</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDSimpleTypeDefinitionImpl#getEffectiveWhiteSpaceFacet <em>Effective White Space Facet</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDSimpleTypeDefinitionImpl#getEffectiveMaxLengthFacet <em>Effective Max Length Facet</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDSimpleTypeDefinitionImpl#getEffectiveFractionDigitsFacet <em>Effective Fraction Digits Facet</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDSimpleTypeDefinitionImpl#getEffectivePatternFacet <em>Effective Pattern Facet</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDSimpleTypeDefinitionImpl#getEffectiveEnumerationFacet <em>Effective Enumeration Facet</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDSimpleTypeDefinitionImpl#getEffectiveTotalDigitsFacet <em>Effective Total Digits Facet</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDSimpleTypeDefinitionImpl#getEffectiveMinLengthFacet <em>Effective Min Length Facet</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDSimpleTypeDefinitionImpl#getEffectiveLengthFacet <em>Effective Length Facet</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDSimpleTypeDefinitionImpl#getEffectiveMinFacet <em>Effective Min Facet</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDSimpleTypeDefinitionImpl#getSyntheticFacets <em>Synthetic Facets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XSDSimpleTypeDefinitionImpl extends XSDTypeDefinitionImpl implements XSDSimpleTypeDefinition {
	/**
	 * The default value of the '{@link #getVariety() <em>Variety</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariety()
	 * @generated
	 * @ordered
	 */
	protected static final XSDVariety VARIETY_EDEFAULT = XSDVariety.ATOMIC;

	/**
	 * The cached value of the '{@link #getVariety() <em>Variety</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariety()
	 * @generated
	 * @ordered
	 */
	protected XSDVariety variety = VARIETY_EDEFAULT;

	/**
	 * This is true if the Variety attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean varietyESet;

	/**
	 * The cached value of the '{@link #getFinal() <em>Final</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinal()
	 * @generated
	 * @ordered
	 */
	protected EList<XSDSimpleFinal> final_;

	/**
	 * The cached value of the '{@link #getLexicalFinal() <em>Lexical Final</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLexicalFinal()
	 * @generated
	 * @ordered
	 */
	protected EList<XSDSimpleFinal> lexicalFinal;

	/**
	 * The cached value of the '{@link #getValidFacets() <em>Valid Facets</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidFacets()
	 * @generated
	 * @ordered
	 */
	protected EList<String> validFacets;

	/**
	 * The cached value of the '{@link #getContents() <em>Contents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContents()
	 * @generated
	 * @ordered
	 */
	protected EList<XSDSimpleTypeDefinition> contents;

	/**
	 * The cached value of the '{@link #getFacetContents() <em>Facet Contents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacetContents()
	 * @generated
	 * @ordered
	 */
	protected EList<XSDConstrainingFacet> facetContents;

	/**
	 * The cached value of the '{@link #getFacets() <em>Facets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacets()
	 * @generated
	 * @ordered
	 */
	protected EList<XSDConstrainingFacet> facets;

	/**
	 * The cached value of the '{@link #getMemberTypeDefinitions() <em>Member Type Definitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberTypeDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<XSDSimpleTypeDefinition> memberTypeDefinitions;

	/**
	 * The cached value of the '{@link #getFundamentalFacets() <em>Fundamental Facets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFundamentalFacets()
	 * @generated
	 * @ordered
	 */
	protected EList<XSDFundamentalFacet> fundamentalFacets;

	/**
	 * The cached value of the '{@link #getBaseTypeDefinition() <em>Base Type Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseTypeDefinition()
	 * @generated
	 * @ordered
	 */
	protected XSDSimpleTypeDefinition baseTypeDefinition;

	/**
	 * The cached value of the '{@link #getPrimitiveTypeDefinition() <em>Primitive Type Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitiveTypeDefinition()
	 * @generated
	 * @ordered
	 */
	protected XSDSimpleTypeDefinition primitiveTypeDefinition;

	/**
	 * The cached value of the '{@link #getItemTypeDefinition() <em>Item Type Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemTypeDefinition()
	 * @generated
	 * @ordered
	 */
	protected XSDSimpleTypeDefinition itemTypeDefinition;

	/**
	 * The cached value of the '{@link #getSyntheticFacets() <em>Synthetic Facets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyntheticFacets()
	 * @generated
	 * @ordered
	 */
	protected EList<XSDFacet> syntheticFacets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XSDSimpleTypeDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XsdPackage.Literals.XSD_SIMPLE_TYPE_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDVariety getVariety() {
		return variety;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariety(XSDVariety newVariety) {
		XSDVariety oldVariety = variety;
		variety = newVariety == null ? VARIETY_EDEFAULT : newVariety;
		boolean oldVarietyESet = varietyESet;
		varietyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__VARIETY, oldVariety, variety, !oldVarietyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVariety() {
		XSDVariety oldVariety = variety;
		boolean oldVarietyESet = varietyESet;
		variety = VARIETY_EDEFAULT;
		varietyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__VARIETY, oldVariety, VARIETY_EDEFAULT, oldVarietyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVariety() {
		return varietyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XSDSimpleFinal> getFinal() {
		if (final_ == null) {
			final_ = new EDataTypeUniqueEList<XSDSimpleFinal>(XSDSimpleFinal.class, this, XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__FINAL);
		}
		return final_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XSDSimpleFinal> getLexicalFinal() {
		if (lexicalFinal == null) {
			lexicalFinal = new EDataTypeUniqueEList.Unsettable<XSDSimpleFinal>(XSDSimpleFinal.class, this, XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__LEXICAL_FINAL);
		}
		return lexicalFinal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLexicalFinal() {
		if (lexicalFinal != null) ((InternalEList.Unsettable<?>)lexicalFinal).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLexicalFinal() {
		return lexicalFinal != null && ((InternalEList.Unsettable<?>)lexicalFinal).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getValidFacets() {
		if (validFacets == null) {
			validFacets = new EDataTypeUniqueEList<String>(String.class, this, XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__VALID_FACETS);
		}
		return validFacets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XSDSimpleTypeDefinition> getContents() {
		if (contents == null) {
			contents = new EObjectContainmentEList<XSDSimpleTypeDefinition>(XSDSimpleTypeDefinition.class, this, XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__CONTENTS);
		}
		return contents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XSDConstrainingFacet> getFacetContents() {
		if (facetContents == null) {
			facetContents = new EObjectContainmentEList<XSDConstrainingFacet>(XSDConstrainingFacet.class, this, XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__FACET_CONTENTS);
		}
		return facetContents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XSDConstrainingFacet> getFacets() {
		if (facets == null) {
			facets = new EObjectEList<XSDConstrainingFacet>(XSDConstrainingFacet.class, this, XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__FACETS);
		}
		return facets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XSDSimpleTypeDefinition> getMemberTypeDefinitions() {
		if (memberTypeDefinitions == null) {
			memberTypeDefinitions = new EObjectEList<XSDSimpleTypeDefinition>(XSDSimpleTypeDefinition.class, this, XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__MEMBER_TYPE_DEFINITIONS);
		}
		return memberTypeDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XSDFundamentalFacet> getFundamentalFacets() {
		if (fundamentalFacets == null) {
			fundamentalFacets = new EObjectContainmentEList<XSDFundamentalFacet>(XSDFundamentalFacet.class, this, XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__FUNDAMENTAL_FACETS);
		}
		return fundamentalFacets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDSimpleTypeDefinition getBaseTypeDefinition() {
		return baseTypeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseTypeDefinition(XSDSimpleTypeDefinition newBaseTypeDefinition) {
		XSDSimpleTypeDefinition oldBaseTypeDefinition = baseTypeDefinition;
		baseTypeDefinition = newBaseTypeDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__BASE_TYPE_DEFINITION, oldBaseTypeDefinition, baseTypeDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDSimpleTypeDefinition getPrimitiveTypeDefinition() {
		return primitiveTypeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimitiveTypeDefinition(XSDSimpleTypeDefinition newPrimitiveTypeDefinition) {
		XSDSimpleTypeDefinition oldPrimitiveTypeDefinition = primitiveTypeDefinition;
		primitiveTypeDefinition = newPrimitiveTypeDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__PRIMITIVE_TYPE_DEFINITION, oldPrimitiveTypeDefinition, primitiveTypeDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDSimpleTypeDefinition getItemTypeDefinition() {
		return itemTypeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemTypeDefinition(XSDSimpleTypeDefinition newItemTypeDefinition) {
		XSDSimpleTypeDefinition oldItemTypeDefinition = itemTypeDefinition;
		itemTypeDefinition = newItemTypeDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__ITEM_TYPE_DEFINITION, oldItemTypeDefinition, itemTypeDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDSimpleTypeDefinition getRootTypeDefinition() {
		// TODO: implement this method to return the 'Root Type Definition' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDMinFacet getMinFacet() {
		// TODO: implement this method to return the 'Min Facet' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDMaxFacet getMaxFacet() {
		// TODO: implement this method to return the 'Max Facet' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDMaxInclusiveFacet getMaxInclusiveFacet() {
		// TODO: implement this method to return the 'Max Inclusive Facet' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDMinInclusiveFacet getMinInclusiveFacet() {
		// TODO: implement this method to return the 'Min Inclusive Facet' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDMinExclusiveFacet getMinExclusiveFacet() {
		// TODO: implement this method to return the 'Min Exclusive Facet' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDMaxExclusiveFacet getMaxExclusiveFacet() {
		// TODO: implement this method to return the 'Max Exclusive Facet' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDLengthFacet getLengthFacet() {
		// TODO: implement this method to return the 'Length Facet' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDWhiteSpaceFacet getWhiteSpaceFacet() {
		// TODO: implement this method to return the 'White Space Facet' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XSDEnumerationFacet> getEnumerationFacets() {
		// TODO: implement this method to return the 'Enumeration Facets' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XSDPatternFacet> getPatternFacets() {
		// TODO: implement this method to return the 'Pattern Facets' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDCardinalityFacet getCardinalityFacet() {
		// TODO: implement this method to return the 'Cardinality Facet' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDNumericFacet getNumericFacet() {
		// TODO: implement this method to return the 'Numeric Facet' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDMaxLengthFacet getMaxLengthFacet() {
		// TODO: implement this method to return the 'Max Length Facet' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDMinLengthFacet getMinLengthFacet() {
		// TODO: implement this method to return the 'Min Length Facet' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDTotalDigitsFacet getTotalDigitsFacet() {
		// TODO: implement this method to return the 'Total Digits Facet' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDFractionDigitsFacet getFractionDigitsFacet() {
		// TODO: implement this method to return the 'Fraction Digits Facet' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDOrderedFacet getOrderedFacet() {
		// TODO: implement this method to return the 'Ordered Facet' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDBoundedFacet getBoundedFacet() {
		// TODO: implement this method to return the 'Bounded Facet' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDMaxFacet getEffectiveMaxFacet() {
		// TODO: implement this method to return the 'Effective Max Facet' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDWhiteSpaceFacet getEffectiveWhiteSpaceFacet() {
		// TODO: implement this method to return the 'Effective White Space Facet' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDMaxLengthFacet getEffectiveMaxLengthFacet() {
		// TODO: implement this method to return the 'Effective Max Length Facet' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDFractionDigitsFacet getEffectiveFractionDigitsFacet() {
		// TODO: implement this method to return the 'Effective Fraction Digits Facet' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDPatternFacet getEffectivePatternFacet() {
		// TODO: implement this method to return the 'Effective Pattern Facet' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDEnumerationFacet getEffectiveEnumerationFacet() {
		// TODO: implement this method to return the 'Effective Enumeration Facet' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDTotalDigitsFacet getEffectiveTotalDigitsFacet() {
		// TODO: implement this method to return the 'Effective Total Digits Facet' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDMinLengthFacet getEffectiveMinLengthFacet() {
		// TODO: implement this method to return the 'Effective Min Length Facet' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDLengthFacet getEffectiveLengthFacet() {
		// TODO: implement this method to return the 'Effective Length Facet' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDMinFacet getEffectiveMinFacet() {
		// TODO: implement this method to return the 'Effective Min Facet' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XSDFacet> getSyntheticFacets() {
		if (syntheticFacets == null) {
			syntheticFacets = new EObjectContainmentEList<XSDFacet>(XSDFacet.class, this, XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__SYNTHETIC_FACETS);
		}
		return syntheticFacets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__CONTENTS:
				return ((InternalEList<?>)getContents()).basicRemove(otherEnd, msgs);
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__FACET_CONTENTS:
				return ((InternalEList<?>)getFacetContents()).basicRemove(otherEnd, msgs);
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__FUNDAMENTAL_FACETS:
				return ((InternalEList<?>)getFundamentalFacets()).basicRemove(otherEnd, msgs);
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__SYNTHETIC_FACETS:
				return ((InternalEList<?>)getSyntheticFacets()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__VARIETY:
				return getVariety();
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__FINAL:
				return getFinal();
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__LEXICAL_FINAL:
				return getLexicalFinal();
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__VALID_FACETS:
				return getValidFacets();
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__CONTENTS:
				return getContents();
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__FACET_CONTENTS:
				return getFacetContents();
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__FACETS:
				return getFacets();
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__MEMBER_TYPE_DEFINITIONS:
				return getMemberTypeDefinitions();
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__FUNDAMENTAL_FACETS:
				return getFundamentalFacets();
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__BASE_TYPE_DEFINITION:
				return getBaseTypeDefinition();
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__PRIMITIVE_TYPE_DEFINITION:
				return getPrimitiveTypeDefinition();
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__ITEM_TYPE_DEFINITION:
				return getItemTypeDefinition();
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__ROOT_TYPE_DEFINITION:
				return getRootTypeDefinition();
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__MIN_FACET:
				return getMinFacet();
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__MAX_FACET:
				return getMaxFacet();
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__MAX_INCLUSIVE_FACET:
				return getMaxInclusiveFacet();
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__MIN_INCLUSIVE_FACET:
				return getMinInclusiveFacet();
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__MIN_EXCLUSIVE_FACET:
				return getMinExclusiveFacet();
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__MAX_EXCLUSIVE_FACET:
				return getMaxExclusiveFacet();
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__LENGTH_FACET:
				return getLengthFacet();
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__WHITE_SPACE_FACET:
				return getWhiteSpaceFacet();
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__ENUMERATION_FACETS:
				return getEnumerationFacets();
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__PATTERN_FACETS:
				return getPatternFacets();
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__CARDINALITY_FACET:
				return getCardinalityFacet();
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__NUMERIC_FACET:
				return getNumericFacet();
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__MAX_LENGTH_FACET:
				return getMaxLengthFacet();
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__MIN_LENGTH_FACET:
				return getMinLengthFacet();
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__TOTAL_DIGITS_FACET:
				return getTotalDigitsFacet();
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__FRACTION_DIGITS_FACET:
				return getFractionDigitsFacet();
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__ORDERED_FACET:
				return getOrderedFacet();
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__BOUNDED_FACET:
				return getBoundedFacet();
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__EFFECTIVE_MAX_FACET:
				return getEffectiveMaxFacet();
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__EFFECTIVE_WHITE_SPACE_FACET:
				return getEffectiveWhiteSpaceFacet();
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__EFFECTIVE_MAX_LENGTH_FACET:
				return getEffectiveMaxLengthFacet();
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__EFFECTIVE_FRACTION_DIGITS_FACET:
				return getEffectiveFractionDigitsFacet();
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__EFFECTIVE_PATTERN_FACET:
				return getEffectivePatternFacet();
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__EFFECTIVE_ENUMERATION_FACET:
				return getEffectiveEnumerationFacet();
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__EFFECTIVE_TOTAL_DIGITS_FACET:
				return getEffectiveTotalDigitsFacet();
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__EFFECTIVE_MIN_LENGTH_FACET:
				return getEffectiveMinLengthFacet();
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__EFFECTIVE_LENGTH_FACET:
				return getEffectiveLengthFacet();
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__EFFECTIVE_MIN_FACET:
				return getEffectiveMinFacet();
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__SYNTHETIC_FACETS:
				return getSyntheticFacets();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__VARIETY:
				setVariety((XSDVariety)newValue);
				return;
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__FINAL:
				getFinal().clear();
				getFinal().addAll((Collection<? extends XSDSimpleFinal>)newValue);
				return;
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__LEXICAL_FINAL:
				getLexicalFinal().clear();
				getLexicalFinal().addAll((Collection<? extends XSDSimpleFinal>)newValue);
				return;
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__VALID_FACETS:
				getValidFacets().clear();
				getValidFacets().addAll((Collection<? extends String>)newValue);
				return;
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__CONTENTS:
				getContents().clear();
				getContents().addAll((Collection<? extends XSDSimpleTypeDefinition>)newValue);
				return;
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__FACET_CONTENTS:
				getFacetContents().clear();
				getFacetContents().addAll((Collection<? extends XSDConstrainingFacet>)newValue);
				return;
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__FACETS:
				getFacets().clear();
				getFacets().addAll((Collection<? extends XSDConstrainingFacet>)newValue);
				return;
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__MEMBER_TYPE_DEFINITIONS:
				getMemberTypeDefinitions().clear();
				getMemberTypeDefinitions().addAll((Collection<? extends XSDSimpleTypeDefinition>)newValue);
				return;
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__FUNDAMENTAL_FACETS:
				getFundamentalFacets().clear();
				getFundamentalFacets().addAll((Collection<? extends XSDFundamentalFacet>)newValue);
				return;
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__BASE_TYPE_DEFINITION:
				setBaseTypeDefinition((XSDSimpleTypeDefinition)newValue);
				return;
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__PRIMITIVE_TYPE_DEFINITION:
				setPrimitiveTypeDefinition((XSDSimpleTypeDefinition)newValue);
				return;
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__ITEM_TYPE_DEFINITION:
				setItemTypeDefinition((XSDSimpleTypeDefinition)newValue);
				return;
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__SYNTHETIC_FACETS:
				getSyntheticFacets().clear();
				getSyntheticFacets().addAll((Collection<? extends XSDFacet>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__VARIETY:
				unsetVariety();
				return;
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__FINAL:
				getFinal().clear();
				return;
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__LEXICAL_FINAL:
				unsetLexicalFinal();
				return;
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__VALID_FACETS:
				getValidFacets().clear();
				return;
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__CONTENTS:
				getContents().clear();
				return;
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__FACET_CONTENTS:
				getFacetContents().clear();
				return;
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__FACETS:
				getFacets().clear();
				return;
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__MEMBER_TYPE_DEFINITIONS:
				getMemberTypeDefinitions().clear();
				return;
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__FUNDAMENTAL_FACETS:
				getFundamentalFacets().clear();
				return;
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__BASE_TYPE_DEFINITION:
				setBaseTypeDefinition((XSDSimpleTypeDefinition)null);
				return;
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__PRIMITIVE_TYPE_DEFINITION:
				setPrimitiveTypeDefinition((XSDSimpleTypeDefinition)null);
				return;
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__ITEM_TYPE_DEFINITION:
				setItemTypeDefinition((XSDSimpleTypeDefinition)null);
				return;
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__SYNTHETIC_FACETS:
				getSyntheticFacets().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__VARIETY:
				return isSetVariety();
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__FINAL:
				return final_ != null && !final_.isEmpty();
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__LEXICAL_FINAL:
				return isSetLexicalFinal();
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__VALID_FACETS:
				return validFacets != null && !validFacets.isEmpty();
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__CONTENTS:
				return contents != null && !contents.isEmpty();
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__FACET_CONTENTS:
				return facetContents != null && !facetContents.isEmpty();
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__FACETS:
				return facets != null && !facets.isEmpty();
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__MEMBER_TYPE_DEFINITIONS:
				return memberTypeDefinitions != null && !memberTypeDefinitions.isEmpty();
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__FUNDAMENTAL_FACETS:
				return fundamentalFacets != null && !fundamentalFacets.isEmpty();
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__BASE_TYPE_DEFINITION:
				return baseTypeDefinition != null;
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__PRIMITIVE_TYPE_DEFINITION:
				return primitiveTypeDefinition != null;
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__ITEM_TYPE_DEFINITION:
				return itemTypeDefinition != null;
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__ROOT_TYPE_DEFINITION:
				return getRootTypeDefinition() != null;
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__MIN_FACET:
				return getMinFacet() != null;
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__MAX_FACET:
				return getMaxFacet() != null;
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__MAX_INCLUSIVE_FACET:
				return getMaxInclusiveFacet() != null;
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__MIN_INCLUSIVE_FACET:
				return getMinInclusiveFacet() != null;
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__MIN_EXCLUSIVE_FACET:
				return getMinExclusiveFacet() != null;
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__MAX_EXCLUSIVE_FACET:
				return getMaxExclusiveFacet() != null;
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__LENGTH_FACET:
				return getLengthFacet() != null;
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__WHITE_SPACE_FACET:
				return getWhiteSpaceFacet() != null;
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__ENUMERATION_FACETS:
				return !getEnumerationFacets().isEmpty();
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__PATTERN_FACETS:
				return !getPatternFacets().isEmpty();
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__CARDINALITY_FACET:
				return getCardinalityFacet() != null;
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__NUMERIC_FACET:
				return getNumericFacet() != null;
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__MAX_LENGTH_FACET:
				return getMaxLengthFacet() != null;
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__MIN_LENGTH_FACET:
				return getMinLengthFacet() != null;
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__TOTAL_DIGITS_FACET:
				return getTotalDigitsFacet() != null;
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__FRACTION_DIGITS_FACET:
				return getFractionDigitsFacet() != null;
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__ORDERED_FACET:
				return getOrderedFacet() != null;
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__BOUNDED_FACET:
				return getBoundedFacet() != null;
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__EFFECTIVE_MAX_FACET:
				return getEffectiveMaxFacet() != null;
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__EFFECTIVE_WHITE_SPACE_FACET:
				return getEffectiveWhiteSpaceFacet() != null;
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__EFFECTIVE_MAX_LENGTH_FACET:
				return getEffectiveMaxLengthFacet() != null;
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__EFFECTIVE_FRACTION_DIGITS_FACET:
				return getEffectiveFractionDigitsFacet() != null;
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__EFFECTIVE_PATTERN_FACET:
				return getEffectivePatternFacet() != null;
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__EFFECTIVE_ENUMERATION_FACET:
				return getEffectiveEnumerationFacet() != null;
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__EFFECTIVE_TOTAL_DIGITS_FACET:
				return getEffectiveTotalDigitsFacet() != null;
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__EFFECTIVE_MIN_LENGTH_FACET:
				return getEffectiveMinLengthFacet() != null;
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__EFFECTIVE_LENGTH_FACET:
				return getEffectiveLengthFacet() != null;
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__EFFECTIVE_MIN_FACET:
				return getEffectiveMinFacet() != null;
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION__SYNTHETIC_FACETS:
				return syntheticFacets != null && !syntheticFacets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (variety: ");
		if (varietyESet) result.append(variety); else result.append("<unset>");
		result.append(", final: ");
		result.append(final_);
		result.append(", lexicalFinal: ");
		result.append(lexicalFinal);
		result.append(", validFacets: ");
		result.append(validFacets);
		result.append(')');
		return result.toString();
	}

} //XSDSimpleTypeDefinitionImpl
