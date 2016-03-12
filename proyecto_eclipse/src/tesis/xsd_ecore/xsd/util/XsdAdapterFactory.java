/**
 */
package tesis.xsd_ecore.xsd.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import tesis.xsd_ecore.xsd.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see tesis.xsd_ecore.xsd.XsdPackage
 * @generated
 */
public class XsdAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XsdPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsdAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = XsdPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XsdSwitch<Adapter> modelSwitch =
		new XsdSwitch<Adapter>() {
			@Override
			public Adapter caseXSDAnnotation(XSDAnnotation object) {
				return createXSDAnnotationAdapter();
			}
			@Override
			public Adapter caseXSDAttributeDeclaration(XSDAttributeDeclaration object) {
				return createXSDAttributeDeclarationAdapter();
			}
			@Override
			public Adapter caseXSDAttributeGroupContent(XSDAttributeGroupContent object) {
				return createXSDAttributeGroupContentAdapter();
			}
			@Override
			public Adapter caseXSDAttributeGroupDefinition(XSDAttributeGroupDefinition object) {
				return createXSDAttributeGroupDefinitionAdapter();
			}
			@Override
			public Adapter caseXSDAttributeUse(XSDAttributeUse object) {
				return createXSDAttributeUseAdapter();
			}
			@Override
			public Adapter caseXSDBoundedFacet(XSDBoundedFacet object) {
				return createXSDBoundedFacetAdapter();
			}
			@Override
			public Adapter caseXSDCardinalityFacet(XSDCardinalityFacet object) {
				return createXSDCardinalityFacetAdapter();
			}
			@Override
			public Adapter caseXSDComplexTypeContent(XSDComplexTypeContent object) {
				return createXSDComplexTypeContentAdapter();
			}
			@Override
			public Adapter caseXSDComplexTypeDefinition(XSDComplexTypeDefinition object) {
				return createXSDComplexTypeDefinitionAdapter();
			}
			@Override
			public Adapter caseXSDComponent(XSDComponent object) {
				return createXSDComponentAdapter();
			}
			@Override
			public Adapter caseXSDConcreteComponent(XSDConcreteComponent object) {
				return createXSDConcreteComponentAdapter();
			}
			@Override
			public Adapter caseXSDConstrainingFacet(XSDConstrainingFacet object) {
				return createXSDConstrainingFacetAdapter();
			}
			@Override
			public Adapter caseXSDDiagnostic(XSDDiagnostic object) {
				return createXSDDiagnosticAdapter();
			}
			@Override
			public Adapter caseXSDElementDeclaration(XSDElementDeclaration object) {
				return createXSDElementDeclarationAdapter();
			}
			@Override
			public Adapter caseXSDEnumerationFacet(XSDEnumerationFacet object) {
				return createXSDEnumerationFacetAdapter();
			}
			@Override
			public Adapter caseXSDFacet(XSDFacet object) {
				return createXSDFacetAdapter();
			}
			@Override
			public Adapter caseXSDFeature(XSDFeature object) {
				return createXSDFeatureAdapter();
			}
			@Override
			public Adapter caseXSDFixedFacet(XSDFixedFacet object) {
				return createXSDFixedFacetAdapter();
			}
			@Override
			public Adapter caseXSDFractionDigitsFacet(XSDFractionDigitsFacet object) {
				return createXSDFractionDigitsFacetAdapter();
			}
			@Override
			public Adapter caseXSDFundamentalFacet(XSDFundamentalFacet object) {
				return createXSDFundamentalFacetAdapter();
			}
			@Override
			public Adapter caseXSDIdentityConstraintDefinition(XSDIdentityConstraintDefinition object) {
				return createXSDIdentityConstraintDefinitionAdapter();
			}
			@Override
			public Adapter caseXSDImport(XSDImport object) {
				return createXSDImportAdapter();
			}
			@Override
			public Adapter caseXSDInclude(XSDInclude object) {
				return createXSDIncludeAdapter();
			}
			@Override
			public Adapter caseXSDLengthFacet(XSDLengthFacet object) {
				return createXSDLengthFacetAdapter();
			}
			@Override
			public Adapter caseXSDMaxExclusiveFacet(XSDMaxExclusiveFacet object) {
				return createXSDMaxExclusiveFacetAdapter();
			}
			@Override
			public Adapter caseXSDMaxFacet(XSDMaxFacet object) {
				return createXSDMaxFacetAdapter();
			}
			@Override
			public Adapter caseXSDMaxInclusiveFacet(XSDMaxInclusiveFacet object) {
				return createXSDMaxInclusiveFacetAdapter();
			}
			@Override
			public Adapter caseXSDMaxLengthFacet(XSDMaxLengthFacet object) {
				return createXSDMaxLengthFacetAdapter();
			}
			@Override
			public Adapter caseXSDMinExclusiveFacet(XSDMinExclusiveFacet object) {
				return createXSDMinExclusiveFacetAdapter();
			}
			@Override
			public Adapter caseXSDMinFacet(XSDMinFacet object) {
				return createXSDMinFacetAdapter();
			}
			@Override
			public Adapter caseXSDMinInclusiveFacet(XSDMinInclusiveFacet object) {
				return createXSDMinInclusiveFacetAdapter();
			}
			@Override
			public Adapter caseXSDMinLengthFacet(XSDMinLengthFacet object) {
				return createXSDMinLengthFacetAdapter();
			}
			@Override
			public Adapter caseXSDModelGroup(XSDModelGroup object) {
				return createXSDModelGroupAdapter();
			}
			@Override
			public Adapter caseXSDModelGroupDefinition(XSDModelGroupDefinition object) {
				return createXSDModelGroupDefinitionAdapter();
			}
			@Override
			public Adapter caseXSDNamedComponent(XSDNamedComponent object) {
				return createXSDNamedComponentAdapter();
			}
			@Override
			public Adapter caseXSDNotationDeclaration(XSDNotationDeclaration object) {
				return createXSDNotationDeclarationAdapter();
			}
			@Override
			public Adapter caseXSDNumericFacet(XSDNumericFacet object) {
				return createXSDNumericFacetAdapter();
			}
			@Override
			public Adapter caseXSDOrderedFacet(XSDOrderedFacet object) {
				return createXSDOrderedFacetAdapter();
			}
			@Override
			public Adapter caseXSDParticle(XSDParticle object) {
				return createXSDParticleAdapter();
			}
			@Override
			public Adapter caseXSDParticleContent(XSDParticleContent object) {
				return createXSDParticleContentAdapter();
			}
			@Override
			public Adapter caseXSDPatternFacet(XSDPatternFacet object) {
				return createXSDPatternFacetAdapter();
			}
			@Override
			public Adapter caseXSDRedefinableComponent(XSDRedefinableComponent object) {
				return createXSDRedefinableComponentAdapter();
			}
			@Override
			public Adapter caseXSDRedefineContent(XSDRedefineContent object) {
				return createXSDRedefineContentAdapter();
			}
			@Override
			public Adapter caseXSDRedefine(XSDRedefine object) {
				return createXSDRedefineAdapter();
			}
			@Override
			public Adapter caseXSDRepeatableFacet(XSDRepeatableFacet object) {
				return createXSDRepeatableFacetAdapter();
			}
			@Override
			public Adapter caseXSDSchema(XSDSchema object) {
				return createXSDSchemaAdapter();
			}
			@Override
			public Adapter caseXSDSchemaCompositor(XSDSchemaCompositor object) {
				return createXSDSchemaCompositorAdapter();
			}
			@Override
			public Adapter caseXSDSchemaContent(XSDSchemaContent object) {
				return createXSDSchemaContentAdapter();
			}
			@Override
			public Adapter caseXSDSchemaDirective(XSDSchemaDirective object) {
				return createXSDSchemaDirectiveAdapter();
			}
			@Override
			public Adapter caseXSDScope(XSDScope object) {
				return createXSDScopeAdapter();
			}
			@Override
			public Adapter caseXSDSimpleTypeDefinition(XSDSimpleTypeDefinition object) {
				return createXSDSimpleTypeDefinitionAdapter();
			}
			@Override
			public Adapter caseXSDTerm(XSDTerm object) {
				return createXSDTermAdapter();
			}
			@Override
			public Adapter caseXSDTotalDigitsFacet(XSDTotalDigitsFacet object) {
				return createXSDTotalDigitsFacetAdapter();
			}
			@Override
			public Adapter caseXSDTypeDefinition(XSDTypeDefinition object) {
				return createXSDTypeDefinitionAdapter();
			}
			@Override
			public Adapter caseXSDWhiteSpaceFacet(XSDWhiteSpaceFacet object) {
				return createXSDWhiteSpaceFacetAdapter();
			}
			@Override
			public Adapter caseXSDWildcard(XSDWildcard object) {
				return createXSDWildcardAdapter();
			}
			@Override
			public Adapter caseXSDXPathDefinition(XSDXPathDefinition object) {
				return createXSDXPathDefinitionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link tesis.xsd_ecore.xsd.XSDAnnotation <em>XSD Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.xsd_ecore.xsd.XSDAnnotation
	 * @generated
	 */
	public Adapter createXSDAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.xsd_ecore.xsd.XSDAttributeDeclaration <em>XSD Attribute Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.xsd_ecore.xsd.XSDAttributeDeclaration
	 * @generated
	 */
	public Adapter createXSDAttributeDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.xsd_ecore.xsd.XSDAttributeGroupContent <em>XSD Attribute Group Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.xsd_ecore.xsd.XSDAttributeGroupContent
	 * @generated
	 */
	public Adapter createXSDAttributeGroupContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.xsd_ecore.xsd.XSDAttributeGroupDefinition <em>XSD Attribute Group Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.xsd_ecore.xsd.XSDAttributeGroupDefinition
	 * @generated
	 */
	public Adapter createXSDAttributeGroupDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.xsd_ecore.xsd.XSDAttributeUse <em>XSD Attribute Use</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.xsd_ecore.xsd.XSDAttributeUse
	 * @generated
	 */
	public Adapter createXSDAttributeUseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.xsd_ecore.xsd.XSDBoundedFacet <em>XSD Bounded Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.xsd_ecore.xsd.XSDBoundedFacet
	 * @generated
	 */
	public Adapter createXSDBoundedFacetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.xsd_ecore.xsd.XSDCardinalityFacet <em>XSD Cardinality Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.xsd_ecore.xsd.XSDCardinalityFacet
	 * @generated
	 */
	public Adapter createXSDCardinalityFacetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.xsd_ecore.xsd.XSDComplexTypeContent <em>XSD Complex Type Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.xsd_ecore.xsd.XSDComplexTypeContent
	 * @generated
	 */
	public Adapter createXSDComplexTypeContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.xsd_ecore.xsd.XSDComplexTypeDefinition <em>XSD Complex Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.xsd_ecore.xsd.XSDComplexTypeDefinition
	 * @generated
	 */
	public Adapter createXSDComplexTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.xsd_ecore.xsd.XSDComponent <em>XSD Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.xsd_ecore.xsd.XSDComponent
	 * @generated
	 */
	public Adapter createXSDComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.xsd_ecore.xsd.XSDConcreteComponent <em>XSD Concrete Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.xsd_ecore.xsd.XSDConcreteComponent
	 * @generated
	 */
	public Adapter createXSDConcreteComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.xsd_ecore.xsd.XSDConstrainingFacet <em>XSD Constraining Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.xsd_ecore.xsd.XSDConstrainingFacet
	 * @generated
	 */
	public Adapter createXSDConstrainingFacetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.xsd_ecore.xsd.XSDDiagnostic <em>XSD Diagnostic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.xsd_ecore.xsd.XSDDiagnostic
	 * @generated
	 */
	public Adapter createXSDDiagnosticAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.xsd_ecore.xsd.XSDElementDeclaration <em>XSD Element Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.xsd_ecore.xsd.XSDElementDeclaration
	 * @generated
	 */
	public Adapter createXSDElementDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.xsd_ecore.xsd.XSDEnumerationFacet <em>XSD Enumeration Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.xsd_ecore.xsd.XSDEnumerationFacet
	 * @generated
	 */
	public Adapter createXSDEnumerationFacetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.xsd_ecore.xsd.XSDFacet <em>XSD Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.xsd_ecore.xsd.XSDFacet
	 * @generated
	 */
	public Adapter createXSDFacetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.xsd_ecore.xsd.XSDFeature <em>XSD Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.xsd_ecore.xsd.XSDFeature
	 * @generated
	 */
	public Adapter createXSDFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.xsd_ecore.xsd.XSDFixedFacet <em>XSD Fixed Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.xsd_ecore.xsd.XSDFixedFacet
	 * @generated
	 */
	public Adapter createXSDFixedFacetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.xsd_ecore.xsd.XSDFractionDigitsFacet <em>XSD Fraction Digits Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.xsd_ecore.xsd.XSDFractionDigitsFacet
	 * @generated
	 */
	public Adapter createXSDFractionDigitsFacetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.xsd_ecore.xsd.XSDFundamentalFacet <em>XSD Fundamental Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.xsd_ecore.xsd.XSDFundamentalFacet
	 * @generated
	 */
	public Adapter createXSDFundamentalFacetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.xsd_ecore.xsd.XSDIdentityConstraintDefinition <em>XSD Identity Constraint Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.xsd_ecore.xsd.XSDIdentityConstraintDefinition
	 * @generated
	 */
	public Adapter createXSDIdentityConstraintDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.xsd_ecore.xsd.XSDImport <em>XSD Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.xsd_ecore.xsd.XSDImport
	 * @generated
	 */
	public Adapter createXSDImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.xsd_ecore.xsd.XSDInclude <em>XSD Include</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.xsd_ecore.xsd.XSDInclude
	 * @generated
	 */
	public Adapter createXSDIncludeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.xsd_ecore.xsd.XSDLengthFacet <em>XSD Length Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.xsd_ecore.xsd.XSDLengthFacet
	 * @generated
	 */
	public Adapter createXSDLengthFacetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.xsd_ecore.xsd.XSDMaxExclusiveFacet <em>XSD Max Exclusive Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.xsd_ecore.xsd.XSDMaxExclusiveFacet
	 * @generated
	 */
	public Adapter createXSDMaxExclusiveFacetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.xsd_ecore.xsd.XSDMaxFacet <em>XSD Max Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.xsd_ecore.xsd.XSDMaxFacet
	 * @generated
	 */
	public Adapter createXSDMaxFacetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.xsd_ecore.xsd.XSDMaxInclusiveFacet <em>XSD Max Inclusive Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.xsd_ecore.xsd.XSDMaxInclusiveFacet
	 * @generated
	 */
	public Adapter createXSDMaxInclusiveFacetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.xsd_ecore.xsd.XSDMaxLengthFacet <em>XSD Max Length Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.xsd_ecore.xsd.XSDMaxLengthFacet
	 * @generated
	 */
	public Adapter createXSDMaxLengthFacetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.xsd_ecore.xsd.XSDMinExclusiveFacet <em>XSD Min Exclusive Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.xsd_ecore.xsd.XSDMinExclusiveFacet
	 * @generated
	 */
	public Adapter createXSDMinExclusiveFacetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.xsd_ecore.xsd.XSDMinFacet <em>XSD Min Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.xsd_ecore.xsd.XSDMinFacet
	 * @generated
	 */
	public Adapter createXSDMinFacetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.xsd_ecore.xsd.XSDMinInclusiveFacet <em>XSD Min Inclusive Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.xsd_ecore.xsd.XSDMinInclusiveFacet
	 * @generated
	 */
	public Adapter createXSDMinInclusiveFacetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.xsd_ecore.xsd.XSDMinLengthFacet <em>XSD Min Length Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.xsd_ecore.xsd.XSDMinLengthFacet
	 * @generated
	 */
	public Adapter createXSDMinLengthFacetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.xsd_ecore.xsd.XSDModelGroup <em>XSD Model Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.xsd_ecore.xsd.XSDModelGroup
	 * @generated
	 */
	public Adapter createXSDModelGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.xsd_ecore.xsd.XSDModelGroupDefinition <em>XSD Model Group Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.xsd_ecore.xsd.XSDModelGroupDefinition
	 * @generated
	 */
	public Adapter createXSDModelGroupDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.xsd_ecore.xsd.XSDNamedComponent <em>XSD Named Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.xsd_ecore.xsd.XSDNamedComponent
	 * @generated
	 */
	public Adapter createXSDNamedComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.xsd_ecore.xsd.XSDNotationDeclaration <em>XSD Notation Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.xsd_ecore.xsd.XSDNotationDeclaration
	 * @generated
	 */
	public Adapter createXSDNotationDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.xsd_ecore.xsd.XSDNumericFacet <em>XSD Numeric Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.xsd_ecore.xsd.XSDNumericFacet
	 * @generated
	 */
	public Adapter createXSDNumericFacetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.xsd_ecore.xsd.XSDOrderedFacet <em>XSD Ordered Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.xsd_ecore.xsd.XSDOrderedFacet
	 * @generated
	 */
	public Adapter createXSDOrderedFacetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.xsd_ecore.xsd.XSDParticle <em>XSD Particle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.xsd_ecore.xsd.XSDParticle
	 * @generated
	 */
	public Adapter createXSDParticleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.xsd_ecore.xsd.XSDParticleContent <em>XSD Particle Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.xsd_ecore.xsd.XSDParticleContent
	 * @generated
	 */
	public Adapter createXSDParticleContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.xsd_ecore.xsd.XSDPatternFacet <em>XSD Pattern Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.xsd_ecore.xsd.XSDPatternFacet
	 * @generated
	 */
	public Adapter createXSDPatternFacetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.xsd_ecore.xsd.XSDRedefinableComponent <em>XSD Redefinable Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.xsd_ecore.xsd.XSDRedefinableComponent
	 * @generated
	 */
	public Adapter createXSDRedefinableComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.xsd_ecore.xsd.XSDRedefineContent <em>XSD Redefine Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.xsd_ecore.xsd.XSDRedefineContent
	 * @generated
	 */
	public Adapter createXSDRedefineContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.xsd_ecore.xsd.XSDRedefine <em>XSD Redefine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.xsd_ecore.xsd.XSDRedefine
	 * @generated
	 */
	public Adapter createXSDRedefineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.xsd_ecore.xsd.XSDRepeatableFacet <em>XSD Repeatable Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.xsd_ecore.xsd.XSDRepeatableFacet
	 * @generated
	 */
	public Adapter createXSDRepeatableFacetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.xsd_ecore.xsd.XSDSchema <em>XSD Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.xsd_ecore.xsd.XSDSchema
	 * @generated
	 */
	public Adapter createXSDSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.xsd_ecore.xsd.XSDSchemaCompositor <em>XSD Schema Compositor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.xsd_ecore.xsd.XSDSchemaCompositor
	 * @generated
	 */
	public Adapter createXSDSchemaCompositorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.xsd_ecore.xsd.XSDSchemaContent <em>XSD Schema Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.xsd_ecore.xsd.XSDSchemaContent
	 * @generated
	 */
	public Adapter createXSDSchemaContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.xsd_ecore.xsd.XSDSchemaDirective <em>XSD Schema Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.xsd_ecore.xsd.XSDSchemaDirective
	 * @generated
	 */
	public Adapter createXSDSchemaDirectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.xsd_ecore.xsd.XSDScope <em>XSD Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.xsd_ecore.xsd.XSDScope
	 * @generated
	 */
	public Adapter createXSDScopeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition <em>XSD Simple Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition
	 * @generated
	 */
	public Adapter createXSDSimpleTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.xsd_ecore.xsd.XSDTerm <em>XSD Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.xsd_ecore.xsd.XSDTerm
	 * @generated
	 */
	public Adapter createXSDTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.xsd_ecore.xsd.XSDTotalDigitsFacet <em>XSD Total Digits Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.xsd_ecore.xsd.XSDTotalDigitsFacet
	 * @generated
	 */
	public Adapter createXSDTotalDigitsFacetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.xsd_ecore.xsd.XSDTypeDefinition <em>XSD Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.xsd_ecore.xsd.XSDTypeDefinition
	 * @generated
	 */
	public Adapter createXSDTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.xsd_ecore.xsd.XSDWhiteSpaceFacet <em>XSD White Space Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.xsd_ecore.xsd.XSDWhiteSpaceFacet
	 * @generated
	 */
	public Adapter createXSDWhiteSpaceFacetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.xsd_ecore.xsd.XSDWildcard <em>XSD Wildcard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.xsd_ecore.xsd.XSDWildcard
	 * @generated
	 */
	public Adapter createXSDWildcardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tesis.xsd_ecore.xsd.XSDXPathDefinition <em>XSDX Path Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tesis.xsd_ecore.xsd.XSDXPathDefinition
	 * @generated
	 */
	public Adapter createXSDXPathDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //XsdAdapterFactory
