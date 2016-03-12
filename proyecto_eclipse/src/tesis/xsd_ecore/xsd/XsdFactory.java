/**
 */
package tesis.xsd_ecore.xsd;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see tesis.xsd_ecore.xsd.XsdPackage
 * @generated
 */
public interface XsdFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XsdFactory eINSTANCE = tesis.xsd_ecore.xsd.impl.XsdFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>XSD Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XSD Annotation</em>'.
	 * @generated
	 */
	XSDAnnotation createXSDAnnotation();

	/**
	 * Returns a new object of class '<em>XSD Attribute Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XSD Attribute Declaration</em>'.
	 * @generated
	 */
	XSDAttributeDeclaration createXSDAttributeDeclaration();

	/**
	 * Returns a new object of class '<em>XSD Attribute Group Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XSD Attribute Group Definition</em>'.
	 * @generated
	 */
	XSDAttributeGroupDefinition createXSDAttributeGroupDefinition();

	/**
	 * Returns a new object of class '<em>XSD Attribute Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XSD Attribute Use</em>'.
	 * @generated
	 */
	XSDAttributeUse createXSDAttributeUse();

	/**
	 * Returns a new object of class '<em>XSD Bounded Facet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XSD Bounded Facet</em>'.
	 * @generated
	 */
	XSDBoundedFacet createXSDBoundedFacet();

	/**
	 * Returns a new object of class '<em>XSD Cardinality Facet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XSD Cardinality Facet</em>'.
	 * @generated
	 */
	XSDCardinalityFacet createXSDCardinalityFacet();

	/**
	 * Returns a new object of class '<em>XSD Complex Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XSD Complex Type Definition</em>'.
	 * @generated
	 */
	XSDComplexTypeDefinition createXSDComplexTypeDefinition();

	/**
	 * Returns a new object of class '<em>XSD Diagnostic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XSD Diagnostic</em>'.
	 * @generated
	 */
	XSDDiagnostic createXSDDiagnostic();

	/**
	 * Returns a new object of class '<em>XSD Element Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XSD Element Declaration</em>'.
	 * @generated
	 */
	XSDElementDeclaration createXSDElementDeclaration();

	/**
	 * Returns a new object of class '<em>XSD Enumeration Facet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XSD Enumeration Facet</em>'.
	 * @generated
	 */
	XSDEnumerationFacet createXSDEnumerationFacet();

	/**
	 * Returns a new object of class '<em>XSD Fraction Digits Facet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XSD Fraction Digits Facet</em>'.
	 * @generated
	 */
	XSDFractionDigitsFacet createXSDFractionDigitsFacet();

	/**
	 * Returns a new object of class '<em>XSD Identity Constraint Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XSD Identity Constraint Definition</em>'.
	 * @generated
	 */
	XSDIdentityConstraintDefinition createXSDIdentityConstraintDefinition();

	/**
	 * Returns a new object of class '<em>XSD Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XSD Import</em>'.
	 * @generated
	 */
	XSDImport createXSDImport();

	/**
	 * Returns a new object of class '<em>XSD Include</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XSD Include</em>'.
	 * @generated
	 */
	XSDInclude createXSDInclude();

	/**
	 * Returns a new object of class '<em>XSD Length Facet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XSD Length Facet</em>'.
	 * @generated
	 */
	XSDLengthFacet createXSDLengthFacet();

	/**
	 * Returns a new object of class '<em>XSD Max Exclusive Facet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XSD Max Exclusive Facet</em>'.
	 * @generated
	 */
	XSDMaxExclusiveFacet createXSDMaxExclusiveFacet();

	/**
	 * Returns a new object of class '<em>XSD Max Inclusive Facet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XSD Max Inclusive Facet</em>'.
	 * @generated
	 */
	XSDMaxInclusiveFacet createXSDMaxInclusiveFacet();

	/**
	 * Returns a new object of class '<em>XSD Max Length Facet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XSD Max Length Facet</em>'.
	 * @generated
	 */
	XSDMaxLengthFacet createXSDMaxLengthFacet();

	/**
	 * Returns a new object of class '<em>XSD Min Exclusive Facet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XSD Min Exclusive Facet</em>'.
	 * @generated
	 */
	XSDMinExclusiveFacet createXSDMinExclusiveFacet();

	/**
	 * Returns a new object of class '<em>XSD Min Inclusive Facet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XSD Min Inclusive Facet</em>'.
	 * @generated
	 */
	XSDMinInclusiveFacet createXSDMinInclusiveFacet();

	/**
	 * Returns a new object of class '<em>XSD Min Length Facet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XSD Min Length Facet</em>'.
	 * @generated
	 */
	XSDMinLengthFacet createXSDMinLengthFacet();

	/**
	 * Returns a new object of class '<em>XSD Model Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XSD Model Group</em>'.
	 * @generated
	 */
	XSDModelGroup createXSDModelGroup();

	/**
	 * Returns a new object of class '<em>XSD Model Group Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XSD Model Group Definition</em>'.
	 * @generated
	 */
	XSDModelGroupDefinition createXSDModelGroupDefinition();

	/**
	 * Returns a new object of class '<em>XSD Notation Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XSD Notation Declaration</em>'.
	 * @generated
	 */
	XSDNotationDeclaration createXSDNotationDeclaration();

	/**
	 * Returns a new object of class '<em>XSD Numeric Facet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XSD Numeric Facet</em>'.
	 * @generated
	 */
	XSDNumericFacet createXSDNumericFacet();

	/**
	 * Returns a new object of class '<em>XSD Ordered Facet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XSD Ordered Facet</em>'.
	 * @generated
	 */
	XSDOrderedFacet createXSDOrderedFacet();

	/**
	 * Returns a new object of class '<em>XSD Particle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XSD Particle</em>'.
	 * @generated
	 */
	XSDParticle createXSDParticle();

	/**
	 * Returns a new object of class '<em>XSD Pattern Facet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XSD Pattern Facet</em>'.
	 * @generated
	 */
	XSDPatternFacet createXSDPatternFacet();

	/**
	 * Returns a new object of class '<em>XSD Redefine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XSD Redefine</em>'.
	 * @generated
	 */
	XSDRedefine createXSDRedefine();

	/**
	 * Returns a new object of class '<em>XSD Schema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XSD Schema</em>'.
	 * @generated
	 */
	XSDSchema createXSDSchema();

	/**
	 * Returns a new object of class '<em>XSD Simple Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XSD Simple Type Definition</em>'.
	 * @generated
	 */
	XSDSimpleTypeDefinition createXSDSimpleTypeDefinition();

	/**
	 * Returns a new object of class '<em>XSD Total Digits Facet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XSD Total Digits Facet</em>'.
	 * @generated
	 */
	XSDTotalDigitsFacet createXSDTotalDigitsFacet();

	/**
	 * Returns a new object of class '<em>XSD White Space Facet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XSD White Space Facet</em>'.
	 * @generated
	 */
	XSDWhiteSpaceFacet createXSDWhiteSpaceFacet();

	/**
	 * Returns a new object of class '<em>XSD Wildcard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XSD Wildcard</em>'.
	 * @generated
	 */
	XSDWildcard createXSDWildcard();

	/**
	 * Returns a new object of class '<em>XSDX Path Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XSDX Path Definition</em>'.
	 * @generated
	 */
	XSDXPathDefinition createXSDXPathDefinition();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	XsdPackage getXsdPackage();

} //XsdFactory
