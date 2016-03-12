/**
 */
package tesis.xsd_ecore.xsd.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import tesis.xsd_ecore.xsd.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XsdFactoryImpl extends EFactoryImpl implements XsdFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XsdFactory init() {
		try {
			XsdFactory theXsdFactory = (XsdFactory)EPackage.Registry.INSTANCE.getEFactory(XsdPackage.eNS_URI);
			if (theXsdFactory != null) {
				return theXsdFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new XsdFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsdFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case XsdPackage.XSD_ANNOTATION: return createXSDAnnotation();
			case XsdPackage.XSD_ATTRIBUTE_DECLARATION: return createXSDAttributeDeclaration();
			case XsdPackage.XSD_ATTRIBUTE_GROUP_DEFINITION: return createXSDAttributeGroupDefinition();
			case XsdPackage.XSD_ATTRIBUTE_USE: return createXSDAttributeUse();
			case XsdPackage.XSD_BOUNDED_FACET: return createXSDBoundedFacet();
			case XsdPackage.XSD_CARDINALITY_FACET: return createXSDCardinalityFacet();
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION: return createXSDComplexTypeDefinition();
			case XsdPackage.XSD_DIAGNOSTIC: return createXSDDiagnostic();
			case XsdPackage.XSD_ELEMENT_DECLARATION: return createXSDElementDeclaration();
			case XsdPackage.XSD_ENUMERATION_FACET: return createXSDEnumerationFacet();
			case XsdPackage.XSD_FRACTION_DIGITS_FACET: return createXSDFractionDigitsFacet();
			case XsdPackage.XSD_IDENTITY_CONSTRAINT_DEFINITION: return createXSDIdentityConstraintDefinition();
			case XsdPackage.XSD_IMPORT: return createXSDImport();
			case XsdPackage.XSD_INCLUDE: return createXSDInclude();
			case XsdPackage.XSD_LENGTH_FACET: return createXSDLengthFacet();
			case XsdPackage.XSD_MAX_EXCLUSIVE_FACET: return createXSDMaxExclusiveFacet();
			case XsdPackage.XSD_MAX_INCLUSIVE_FACET: return createXSDMaxInclusiveFacet();
			case XsdPackage.XSD_MAX_LENGTH_FACET: return createXSDMaxLengthFacet();
			case XsdPackage.XSD_MIN_EXCLUSIVE_FACET: return createXSDMinExclusiveFacet();
			case XsdPackage.XSD_MIN_INCLUSIVE_FACET: return createXSDMinInclusiveFacet();
			case XsdPackage.XSD_MIN_LENGTH_FACET: return createXSDMinLengthFacet();
			case XsdPackage.XSD_MODEL_GROUP: return createXSDModelGroup();
			case XsdPackage.XSD_MODEL_GROUP_DEFINITION: return createXSDModelGroupDefinition();
			case XsdPackage.XSD_NOTATION_DECLARATION: return createXSDNotationDeclaration();
			case XsdPackage.XSD_NUMERIC_FACET: return createXSDNumericFacet();
			case XsdPackage.XSD_ORDERED_FACET: return createXSDOrderedFacet();
			case XsdPackage.XSD_PARTICLE: return createXSDParticle();
			case XsdPackage.XSD_PATTERN_FACET: return createXSDPatternFacet();
			case XsdPackage.XSD_REDEFINE: return createXSDRedefine();
			case XsdPackage.XSD_SCHEMA: return createXSDSchema();
			case XsdPackage.XSD_SIMPLE_TYPE_DEFINITION: return createXSDSimpleTypeDefinition();
			case XsdPackage.XSD_TOTAL_DIGITS_FACET: return createXSDTotalDigitsFacet();
			case XsdPackage.XSD_WHITE_SPACE_FACET: return createXSDWhiteSpaceFacet();
			case XsdPackage.XSD_WILDCARD: return createXSDWildcard();
			case XsdPackage.XSDX_PATH_DEFINITION: return createXSDXPathDefinition();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case XsdPackage.XSD_ATTRIBUTE_USE_CATEGORY:
				return createXSDAttributeUseCategoryFromString(eDataType, initialValue);
			case XsdPackage.XSD_CARDINALITY:
				return createXSDCardinalityFromString(eDataType, initialValue);
			case XsdPackage.XSD_COMPLEX_FINAL:
				return createXSDComplexFinalFromString(eDataType, initialValue);
			case XsdPackage.XSD_COMPOSITOR:
				return createXSDCompositorFromString(eDataType, initialValue);
			case XsdPackage.XSD_CONSTRAINT:
				return createXSDConstraintFromString(eDataType, initialValue);
			case XsdPackage.XSD_CONTENT_TYPE_CATEGORY:
				return createXSDContentTypeCategoryFromString(eDataType, initialValue);
			case XsdPackage.XSD_DERIVATION_METHOD:
				return createXSDDerivationMethodFromString(eDataType, initialValue);
			case XsdPackage.XSD_DIAGNOSTIC_SEVERITY:
				return createXSDDiagnosticSeverityFromString(eDataType, initialValue);
			case XsdPackage.XSD_DISALLOWED_SUBSTITUTIONS:
				return createXSDDisallowedSubstitutionsFromString(eDataType, initialValue);
			case XsdPackage.XSD_FORM:
				return createXSDFormFromString(eDataType, initialValue);
			case XsdPackage.XSD_IDENTITY_CONSTRAINT_CATEGORY:
				return createXSDIdentityConstraintCategoryFromString(eDataType, initialValue);
			case XsdPackage.XSD_NAMESPACE_CONSTRAINT_CATEGORY:
				return createXSDNamespaceConstraintCategoryFromString(eDataType, initialValue);
			case XsdPackage.XSD_ORDERED:
				return createXSDOrderedFromString(eDataType, initialValue);
			case XsdPackage.XSD_PROCESS_CONTENTS:
				return createXSDProcessContentsFromString(eDataType, initialValue);
			case XsdPackage.XSD_PROHIBITED_SUBSTITUTIONS:
				return createXSDProhibitedSubstitutionsFromString(eDataType, initialValue);
			case XsdPackage.XSD_SIMPLE_FINAL:
				return createXSDSimpleFinalFromString(eDataType, initialValue);
			case XsdPackage.XSD_SUBSTITUTION_GROUP_EXCLUSIONS:
				return createXSDSubstitutionGroupExclusionsFromString(eDataType, initialValue);
			case XsdPackage.XSD_VARIETY:
				return createXSDVarietyFromString(eDataType, initialValue);
			case XsdPackage.XSD_WHITE_SPACE:
				return createXSDWhiteSpaceFromString(eDataType, initialValue);
			case XsdPackage.XSDX_PATH_VARIETY:
				return createXSDXPathVarietyFromString(eDataType, initialValue);
			case XsdPackage.DOM_ATTR:
				return createDOMAttrFromString(eDataType, initialValue);
			case XsdPackage.DOM_DOCUMENT:
				return createDOMDocumentFromString(eDataType, initialValue);
			case XsdPackage.DOM_ELEMENT:
				return createDOMElementFromString(eDataType, initialValue);
			case XsdPackage.DOM_NODE:
				return createDOMNodeFromString(eDataType, initialValue);
			case XsdPackage.VALUE:
				return createValueFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case XsdPackage.XSD_ATTRIBUTE_USE_CATEGORY:
				return convertXSDAttributeUseCategoryToString(eDataType, instanceValue);
			case XsdPackage.XSD_CARDINALITY:
				return convertXSDCardinalityToString(eDataType, instanceValue);
			case XsdPackage.XSD_COMPLEX_FINAL:
				return convertXSDComplexFinalToString(eDataType, instanceValue);
			case XsdPackage.XSD_COMPOSITOR:
				return convertXSDCompositorToString(eDataType, instanceValue);
			case XsdPackage.XSD_CONSTRAINT:
				return convertXSDConstraintToString(eDataType, instanceValue);
			case XsdPackage.XSD_CONTENT_TYPE_CATEGORY:
				return convertXSDContentTypeCategoryToString(eDataType, instanceValue);
			case XsdPackage.XSD_DERIVATION_METHOD:
				return convertXSDDerivationMethodToString(eDataType, instanceValue);
			case XsdPackage.XSD_DIAGNOSTIC_SEVERITY:
				return convertXSDDiagnosticSeverityToString(eDataType, instanceValue);
			case XsdPackage.XSD_DISALLOWED_SUBSTITUTIONS:
				return convertXSDDisallowedSubstitutionsToString(eDataType, instanceValue);
			case XsdPackage.XSD_FORM:
				return convertXSDFormToString(eDataType, instanceValue);
			case XsdPackage.XSD_IDENTITY_CONSTRAINT_CATEGORY:
				return convertXSDIdentityConstraintCategoryToString(eDataType, instanceValue);
			case XsdPackage.XSD_NAMESPACE_CONSTRAINT_CATEGORY:
				return convertXSDNamespaceConstraintCategoryToString(eDataType, instanceValue);
			case XsdPackage.XSD_ORDERED:
				return convertXSDOrderedToString(eDataType, instanceValue);
			case XsdPackage.XSD_PROCESS_CONTENTS:
				return convertXSDProcessContentsToString(eDataType, instanceValue);
			case XsdPackage.XSD_PROHIBITED_SUBSTITUTIONS:
				return convertXSDProhibitedSubstitutionsToString(eDataType, instanceValue);
			case XsdPackage.XSD_SIMPLE_FINAL:
				return convertXSDSimpleFinalToString(eDataType, instanceValue);
			case XsdPackage.XSD_SUBSTITUTION_GROUP_EXCLUSIONS:
				return convertXSDSubstitutionGroupExclusionsToString(eDataType, instanceValue);
			case XsdPackage.XSD_VARIETY:
				return convertXSDVarietyToString(eDataType, instanceValue);
			case XsdPackage.XSD_WHITE_SPACE:
				return convertXSDWhiteSpaceToString(eDataType, instanceValue);
			case XsdPackage.XSDX_PATH_VARIETY:
				return convertXSDXPathVarietyToString(eDataType, instanceValue);
			case XsdPackage.DOM_ATTR:
				return convertDOMAttrToString(eDataType, instanceValue);
			case XsdPackage.DOM_DOCUMENT:
				return convertDOMDocumentToString(eDataType, instanceValue);
			case XsdPackage.DOM_ELEMENT:
				return convertDOMElementToString(eDataType, instanceValue);
			case XsdPackage.DOM_NODE:
				return convertDOMNodeToString(eDataType, instanceValue);
			case XsdPackage.VALUE:
				return convertValueToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDAnnotation createXSDAnnotation() {
		XSDAnnotationImpl xsdAnnotation = new XSDAnnotationImpl();
		return xsdAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDAttributeDeclaration createXSDAttributeDeclaration() {
		XSDAttributeDeclarationImpl xsdAttributeDeclaration = new XSDAttributeDeclarationImpl();
		return xsdAttributeDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDAttributeGroupDefinition createXSDAttributeGroupDefinition() {
		XSDAttributeGroupDefinitionImpl xsdAttributeGroupDefinition = new XSDAttributeGroupDefinitionImpl();
		return xsdAttributeGroupDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDAttributeUse createXSDAttributeUse() {
		XSDAttributeUseImpl xsdAttributeUse = new XSDAttributeUseImpl();
		return xsdAttributeUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDBoundedFacet createXSDBoundedFacet() {
		XSDBoundedFacetImpl xsdBoundedFacet = new XSDBoundedFacetImpl();
		return xsdBoundedFacet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDCardinalityFacet createXSDCardinalityFacet() {
		XSDCardinalityFacetImpl xsdCardinalityFacet = new XSDCardinalityFacetImpl();
		return xsdCardinalityFacet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDComplexTypeDefinition createXSDComplexTypeDefinition() {
		XSDComplexTypeDefinitionImpl xsdComplexTypeDefinition = new XSDComplexTypeDefinitionImpl();
		return xsdComplexTypeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDDiagnostic createXSDDiagnostic() {
		XSDDiagnosticImpl xsdDiagnostic = new XSDDiagnosticImpl();
		return xsdDiagnostic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDElementDeclaration createXSDElementDeclaration() {
		XSDElementDeclarationImpl xsdElementDeclaration = new XSDElementDeclarationImpl();
		return xsdElementDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDEnumerationFacet createXSDEnumerationFacet() {
		XSDEnumerationFacetImpl xsdEnumerationFacet = new XSDEnumerationFacetImpl();
		return xsdEnumerationFacet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDFractionDigitsFacet createXSDFractionDigitsFacet() {
		XSDFractionDigitsFacetImpl xsdFractionDigitsFacet = new XSDFractionDigitsFacetImpl();
		return xsdFractionDigitsFacet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDIdentityConstraintDefinition createXSDIdentityConstraintDefinition() {
		XSDIdentityConstraintDefinitionImpl xsdIdentityConstraintDefinition = new XSDIdentityConstraintDefinitionImpl();
		return xsdIdentityConstraintDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDImport createXSDImport() {
		XSDImportImpl xsdImport = new XSDImportImpl();
		return xsdImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDInclude createXSDInclude() {
		XSDIncludeImpl xsdInclude = new XSDIncludeImpl();
		return xsdInclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDLengthFacet createXSDLengthFacet() {
		XSDLengthFacetImpl xsdLengthFacet = new XSDLengthFacetImpl();
		return xsdLengthFacet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDMaxExclusiveFacet createXSDMaxExclusiveFacet() {
		XSDMaxExclusiveFacetImpl xsdMaxExclusiveFacet = new XSDMaxExclusiveFacetImpl();
		return xsdMaxExclusiveFacet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDMaxInclusiveFacet createXSDMaxInclusiveFacet() {
		XSDMaxInclusiveFacetImpl xsdMaxInclusiveFacet = new XSDMaxInclusiveFacetImpl();
		return xsdMaxInclusiveFacet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDMaxLengthFacet createXSDMaxLengthFacet() {
		XSDMaxLengthFacetImpl xsdMaxLengthFacet = new XSDMaxLengthFacetImpl();
		return xsdMaxLengthFacet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDMinExclusiveFacet createXSDMinExclusiveFacet() {
		XSDMinExclusiveFacetImpl xsdMinExclusiveFacet = new XSDMinExclusiveFacetImpl();
		return xsdMinExclusiveFacet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDMinInclusiveFacet createXSDMinInclusiveFacet() {
		XSDMinInclusiveFacetImpl xsdMinInclusiveFacet = new XSDMinInclusiveFacetImpl();
		return xsdMinInclusiveFacet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDMinLengthFacet createXSDMinLengthFacet() {
		XSDMinLengthFacetImpl xsdMinLengthFacet = new XSDMinLengthFacetImpl();
		return xsdMinLengthFacet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDModelGroup createXSDModelGroup() {
		XSDModelGroupImpl xsdModelGroup = new XSDModelGroupImpl();
		return xsdModelGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDModelGroupDefinition createXSDModelGroupDefinition() {
		XSDModelGroupDefinitionImpl xsdModelGroupDefinition = new XSDModelGroupDefinitionImpl();
		return xsdModelGroupDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDNotationDeclaration createXSDNotationDeclaration() {
		XSDNotationDeclarationImpl xsdNotationDeclaration = new XSDNotationDeclarationImpl();
		return xsdNotationDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDNumericFacet createXSDNumericFacet() {
		XSDNumericFacetImpl xsdNumericFacet = new XSDNumericFacetImpl();
		return xsdNumericFacet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDOrderedFacet createXSDOrderedFacet() {
		XSDOrderedFacetImpl xsdOrderedFacet = new XSDOrderedFacetImpl();
		return xsdOrderedFacet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDParticle createXSDParticle() {
		XSDParticleImpl xsdParticle = new XSDParticleImpl();
		return xsdParticle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDPatternFacet createXSDPatternFacet() {
		XSDPatternFacetImpl xsdPatternFacet = new XSDPatternFacetImpl();
		return xsdPatternFacet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDRedefine createXSDRedefine() {
		XSDRedefineImpl xsdRedefine = new XSDRedefineImpl();
		return xsdRedefine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDSchema createXSDSchema() {
		XSDSchemaImpl xsdSchema = new XSDSchemaImpl();
		return xsdSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDSimpleTypeDefinition createXSDSimpleTypeDefinition() {
		XSDSimpleTypeDefinitionImpl xsdSimpleTypeDefinition = new XSDSimpleTypeDefinitionImpl();
		return xsdSimpleTypeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDTotalDigitsFacet createXSDTotalDigitsFacet() {
		XSDTotalDigitsFacetImpl xsdTotalDigitsFacet = new XSDTotalDigitsFacetImpl();
		return xsdTotalDigitsFacet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDWhiteSpaceFacet createXSDWhiteSpaceFacet() {
		XSDWhiteSpaceFacetImpl xsdWhiteSpaceFacet = new XSDWhiteSpaceFacetImpl();
		return xsdWhiteSpaceFacet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDWildcard createXSDWildcard() {
		XSDWildcardImpl xsdWildcard = new XSDWildcardImpl();
		return xsdWildcard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDXPathDefinition createXSDXPathDefinition() {
		XSDXPathDefinitionImpl xsdxPathDefinition = new XSDXPathDefinitionImpl();
		return xsdxPathDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDAttributeUseCategory createXSDAttributeUseCategoryFromString(EDataType eDataType, String initialValue) {
		XSDAttributeUseCategory result = XSDAttributeUseCategory.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXSDAttributeUseCategoryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDCardinality createXSDCardinalityFromString(EDataType eDataType, String initialValue) {
		XSDCardinality result = XSDCardinality.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXSDCardinalityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDComplexFinal createXSDComplexFinalFromString(EDataType eDataType, String initialValue) {
		XSDComplexFinal result = XSDComplexFinal.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXSDComplexFinalToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDCompositor createXSDCompositorFromString(EDataType eDataType, String initialValue) {
		XSDCompositor result = XSDCompositor.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXSDCompositorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDConstraint createXSDConstraintFromString(EDataType eDataType, String initialValue) {
		XSDConstraint result = XSDConstraint.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXSDConstraintToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDContentTypeCategory createXSDContentTypeCategoryFromString(EDataType eDataType, String initialValue) {
		XSDContentTypeCategory result = XSDContentTypeCategory.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXSDContentTypeCategoryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDDerivationMethod createXSDDerivationMethodFromString(EDataType eDataType, String initialValue) {
		XSDDerivationMethod result = XSDDerivationMethod.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXSDDerivationMethodToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDDiagnosticSeverity createXSDDiagnosticSeverityFromString(EDataType eDataType, String initialValue) {
		XSDDiagnosticSeverity result = XSDDiagnosticSeverity.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXSDDiagnosticSeverityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDDisallowedSubstitutions createXSDDisallowedSubstitutionsFromString(EDataType eDataType, String initialValue) {
		XSDDisallowedSubstitutions result = XSDDisallowedSubstitutions.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXSDDisallowedSubstitutionsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDForm createXSDFormFromString(EDataType eDataType, String initialValue) {
		XSDForm result = XSDForm.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXSDFormToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDIdentityConstraintCategory createXSDIdentityConstraintCategoryFromString(EDataType eDataType, String initialValue) {
		XSDIdentityConstraintCategory result = XSDIdentityConstraintCategory.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXSDIdentityConstraintCategoryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDNamespaceConstraintCategory createXSDNamespaceConstraintCategoryFromString(EDataType eDataType, String initialValue) {
		XSDNamespaceConstraintCategory result = XSDNamespaceConstraintCategory.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXSDNamespaceConstraintCategoryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDOrdered createXSDOrderedFromString(EDataType eDataType, String initialValue) {
		XSDOrdered result = XSDOrdered.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXSDOrderedToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDProcessContents createXSDProcessContentsFromString(EDataType eDataType, String initialValue) {
		XSDProcessContents result = XSDProcessContents.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXSDProcessContentsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDProhibitedSubstitutions createXSDProhibitedSubstitutionsFromString(EDataType eDataType, String initialValue) {
		XSDProhibitedSubstitutions result = XSDProhibitedSubstitutions.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXSDProhibitedSubstitutionsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDSimpleFinal createXSDSimpleFinalFromString(EDataType eDataType, String initialValue) {
		XSDSimpleFinal result = XSDSimpleFinal.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXSDSimpleFinalToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDSubstitutionGroupExclusions createXSDSubstitutionGroupExclusionsFromString(EDataType eDataType, String initialValue) {
		XSDSubstitutionGroupExclusions result = XSDSubstitutionGroupExclusions.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXSDSubstitutionGroupExclusionsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDVariety createXSDVarietyFromString(EDataType eDataType, String initialValue) {
		XSDVariety result = XSDVariety.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXSDVarietyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDWhiteSpace createXSDWhiteSpaceFromString(EDataType eDataType, String initialValue) {
		XSDWhiteSpace result = XSDWhiteSpace.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXSDWhiteSpaceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDXPathVariety createXSDXPathVarietyFromString(EDataType eDataType, String initialValue) {
		XSDXPathVariety result = XSDXPathVariety.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXSDXPathVarietyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attr createDOMAttrFromString(EDataType eDataType, String initialValue) {
		return (Attr)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDOMAttrToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Document createDOMDocumentFromString(EDataType eDataType, String initialValue) {
		return (Document)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDOMDocumentToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element createDOMElementFromString(EDataType eDataType, String initialValue) {
		return (Element)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDOMElementToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createDOMNodeFromString(EDataType eDataType, String initialValue) {
		return (Node)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDOMNodeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createValueFromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValueToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsdPackage getXsdPackage() {
		return (XsdPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static XsdPackage getPackage() {
		return XsdPackage.eINSTANCE;
	}

} //XsdFactoryImpl
