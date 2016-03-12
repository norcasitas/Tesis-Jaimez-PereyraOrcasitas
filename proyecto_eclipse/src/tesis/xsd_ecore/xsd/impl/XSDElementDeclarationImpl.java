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

import tesis.xsd_ecore.xsd.XSDAnnotation;
import tesis.xsd_ecore.xsd.XSDDisallowedSubstitutions;
import tesis.xsd_ecore.xsd.XSDElementDeclaration;
import tesis.xsd_ecore.xsd.XSDIdentityConstraintDefinition;
import tesis.xsd_ecore.xsd.XSDProhibitedSubstitutions;
import tesis.xsd_ecore.xsd.XSDSubstitutionGroupExclusions;
import tesis.xsd_ecore.xsd.XSDTypeDefinition;
import tesis.xsd_ecore.xsd.XsdPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XSD Element Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDElementDeclarationImpl#isNillable <em>Nillable</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDElementDeclarationImpl#getDisallowedSubstitutions <em>Disallowed Substitutions</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDElementDeclarationImpl#getSubstitutionGroupExclusions <em>Substitution Group Exclusions</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDElementDeclarationImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDElementDeclarationImpl#getLexicalFinal <em>Lexical Final</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDElementDeclarationImpl#getBlock <em>Block</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDElementDeclarationImpl#isElementDeclarationReference <em>Element Declaration Reference</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDElementDeclarationImpl#isCircular <em>Circular</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDElementDeclarationImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDElementDeclarationImpl#getAnonymousTypeDefinition <em>Anonymous Type Definition</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDElementDeclarationImpl#getTypeDefinition <em>Type Definition</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDElementDeclarationImpl#getIdentityConstraintDefinitions <em>Identity Constraint Definitions</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDElementDeclarationImpl#getResolvedElementDeclaration <em>Resolved Element Declaration</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDElementDeclarationImpl#getSubstitutionGroupAffiliation <em>Substitution Group Affiliation</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDElementDeclarationImpl#getSubstitutionGroup <em>Substitution Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XSDElementDeclarationImpl extends XSDFeatureImpl implements XSDElementDeclaration {
	/**
	 * The default value of the '{@link #isNillable() <em>Nillable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNillable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NILLABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNillable() <em>Nillable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNillable()
	 * @generated
	 * @ordered
	 */
	protected boolean nillable = NILLABLE_EDEFAULT;

	/**
	 * This is true if the Nillable attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nillableESet;

	/**
	 * The cached value of the '{@link #getDisallowedSubstitutions() <em>Disallowed Substitutions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisallowedSubstitutions()
	 * @generated
	 * @ordered
	 */
	protected EList<XSDDisallowedSubstitutions> disallowedSubstitutions;

	/**
	 * The cached value of the '{@link #getSubstitutionGroupExclusions() <em>Substitution Group Exclusions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstitutionGroupExclusions()
	 * @generated
	 * @ordered
	 */
	protected EList<XSDSubstitutionGroupExclusions> substitutionGroupExclusions;

	/**
	 * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean abstract_ = ABSTRACT_EDEFAULT;

	/**
	 * This is true if the Abstract attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean abstractESet;

	/**
	 * The cached value of the '{@link #getLexicalFinal() <em>Lexical Final</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLexicalFinal()
	 * @generated
	 * @ordered
	 */
	protected EList<XSDProhibitedSubstitutions> lexicalFinal;

	/**
	 * The cached value of the '{@link #getBlock() <em>Block</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlock()
	 * @generated
	 * @ordered
	 */
	protected EList<XSDDisallowedSubstitutions> block;

	/**
	 * The default value of the '{@link #isElementDeclarationReference() <em>Element Declaration Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isElementDeclarationReference()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ELEMENT_DECLARATION_REFERENCE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isCircular() <em>Circular</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCircular()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CIRCULAR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotation()
	 * @generated
	 * @ordered
	 */
	protected XSDAnnotation annotation;

	/**
	 * The cached value of the '{@link #getAnonymousTypeDefinition() <em>Anonymous Type Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnonymousTypeDefinition()
	 * @generated
	 * @ordered
	 */
	protected XSDTypeDefinition anonymousTypeDefinition;

	/**
	 * The cached value of the '{@link #getTypeDefinition() <em>Type Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDefinition()
	 * @generated
	 * @ordered
	 */
	protected XSDTypeDefinition typeDefinition;

	/**
	 * The cached value of the '{@link #getIdentityConstraintDefinitions() <em>Identity Constraint Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentityConstraintDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<XSDIdentityConstraintDefinition> identityConstraintDefinitions;

	/**
	 * The cached value of the '{@link #getResolvedElementDeclaration() <em>Resolved Element Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolvedElementDeclaration()
	 * @generated
	 * @ordered
	 */
	protected XSDElementDeclaration resolvedElementDeclaration;

	/**
	 * The cached value of the '{@link #getSubstitutionGroupAffiliation() <em>Substitution Group Affiliation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstitutionGroupAffiliation()
	 * @generated
	 * @ordered
	 */
	protected XSDElementDeclaration substitutionGroupAffiliation;

	/**
	 * The cached value of the '{@link #getSubstitutionGroup() <em>Substitution Group</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstitutionGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<XSDElementDeclaration> substitutionGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XSDElementDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XsdPackage.Literals.XSD_ELEMENT_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNillable() {
		return nillable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNillable(boolean newNillable) {
		boolean oldNillable = nillable;
		nillable = newNillable;
		boolean oldNillableESet = nillableESet;
		nillableESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_ELEMENT_DECLARATION__NILLABLE, oldNillable, nillable, !oldNillableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNillable() {
		boolean oldNillable = nillable;
		boolean oldNillableESet = nillableESet;
		nillable = NILLABLE_EDEFAULT;
		nillableESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XsdPackage.XSD_ELEMENT_DECLARATION__NILLABLE, oldNillable, NILLABLE_EDEFAULT, oldNillableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNillable() {
		return nillableESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XSDDisallowedSubstitutions> getDisallowedSubstitutions() {
		if (disallowedSubstitutions == null) {
			disallowedSubstitutions = new EDataTypeUniqueEList<XSDDisallowedSubstitutions>(XSDDisallowedSubstitutions.class, this, XsdPackage.XSD_ELEMENT_DECLARATION__DISALLOWED_SUBSTITUTIONS);
		}
		return disallowedSubstitutions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XSDSubstitutionGroupExclusions> getSubstitutionGroupExclusions() {
		if (substitutionGroupExclusions == null) {
			substitutionGroupExclusions = new EDataTypeUniqueEList<XSDSubstitutionGroupExclusions>(XSDSubstitutionGroupExclusions.class, this, XsdPackage.XSD_ELEMENT_DECLARATION__SUBSTITUTION_GROUP_EXCLUSIONS);
		}
		return substitutionGroupExclusions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(boolean newAbstract) {
		boolean oldAbstract = abstract_;
		abstract_ = newAbstract;
		boolean oldAbstractESet = abstractESet;
		abstractESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_ELEMENT_DECLARATION__ABSTRACT, oldAbstract, abstract_, !oldAbstractESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAbstract() {
		boolean oldAbstract = abstract_;
		boolean oldAbstractESet = abstractESet;
		abstract_ = ABSTRACT_EDEFAULT;
		abstractESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XsdPackage.XSD_ELEMENT_DECLARATION__ABSTRACT, oldAbstract, ABSTRACT_EDEFAULT, oldAbstractESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAbstract() {
		return abstractESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XSDProhibitedSubstitutions> getLexicalFinal() {
		if (lexicalFinal == null) {
			lexicalFinal = new EDataTypeUniqueEList.Unsettable<XSDProhibitedSubstitutions>(XSDProhibitedSubstitutions.class, this, XsdPackage.XSD_ELEMENT_DECLARATION__LEXICAL_FINAL);
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
	public EList<XSDDisallowedSubstitutions> getBlock() {
		if (block == null) {
			block = new EDataTypeUniqueEList.Unsettable<XSDDisallowedSubstitutions>(XSDDisallowedSubstitutions.class, this, XsdPackage.XSD_ELEMENT_DECLARATION__BLOCK);
		}
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBlock() {
		if (block != null) ((InternalEList.Unsettable<?>)block).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBlock() {
		return block != null && ((InternalEList.Unsettable<?>)block).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isElementDeclarationReference() {
		// TODO: implement this method to return the 'Element Declaration Reference' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCircular() {
		// TODO: implement this method to return the 'Circular' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDAnnotation getAnnotation() {
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotation(XSDAnnotation newAnnotation, NotificationChain msgs) {
		XSDAnnotation oldAnnotation = annotation;
		annotation = newAnnotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_ELEMENT_DECLARATION__ANNOTATION, oldAnnotation, newAnnotation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotation(XSDAnnotation newAnnotation) {
		if (newAnnotation != annotation) {
			NotificationChain msgs = null;
			if (annotation != null)
				msgs = ((InternalEObject)annotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XsdPackage.XSD_ELEMENT_DECLARATION__ANNOTATION, null, msgs);
			if (newAnnotation != null)
				msgs = ((InternalEObject)newAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XsdPackage.XSD_ELEMENT_DECLARATION__ANNOTATION, null, msgs);
			msgs = basicSetAnnotation(newAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_ELEMENT_DECLARATION__ANNOTATION, newAnnotation, newAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDTypeDefinition getAnonymousTypeDefinition() {
		return anonymousTypeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnonymousTypeDefinition(XSDTypeDefinition newAnonymousTypeDefinition, NotificationChain msgs) {
		XSDTypeDefinition oldAnonymousTypeDefinition = anonymousTypeDefinition;
		anonymousTypeDefinition = newAnonymousTypeDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_ELEMENT_DECLARATION__ANONYMOUS_TYPE_DEFINITION, oldAnonymousTypeDefinition, newAnonymousTypeDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnonymousTypeDefinition(XSDTypeDefinition newAnonymousTypeDefinition) {
		if (newAnonymousTypeDefinition != anonymousTypeDefinition) {
			NotificationChain msgs = null;
			if (anonymousTypeDefinition != null)
				msgs = ((InternalEObject)anonymousTypeDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XsdPackage.XSD_ELEMENT_DECLARATION__ANONYMOUS_TYPE_DEFINITION, null, msgs);
			if (newAnonymousTypeDefinition != null)
				msgs = ((InternalEObject)newAnonymousTypeDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XsdPackage.XSD_ELEMENT_DECLARATION__ANONYMOUS_TYPE_DEFINITION, null, msgs);
			msgs = basicSetAnonymousTypeDefinition(newAnonymousTypeDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_ELEMENT_DECLARATION__ANONYMOUS_TYPE_DEFINITION, newAnonymousTypeDefinition, newAnonymousTypeDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDTypeDefinition getTypeDefinition() {
		return typeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeDefinition(XSDTypeDefinition newTypeDefinition) {
		XSDTypeDefinition oldTypeDefinition = typeDefinition;
		typeDefinition = newTypeDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_ELEMENT_DECLARATION__TYPE_DEFINITION, oldTypeDefinition, typeDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XSDIdentityConstraintDefinition> getIdentityConstraintDefinitions() {
		if (identityConstraintDefinitions == null) {
			identityConstraintDefinitions = new EObjectContainmentEList<XSDIdentityConstraintDefinition>(XSDIdentityConstraintDefinition.class, this, XsdPackage.XSD_ELEMENT_DECLARATION__IDENTITY_CONSTRAINT_DEFINITIONS);
		}
		return identityConstraintDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDElementDeclaration getResolvedElementDeclaration() {
		return resolvedElementDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolvedElementDeclaration(XSDElementDeclaration newResolvedElementDeclaration) {
		XSDElementDeclaration oldResolvedElementDeclaration = resolvedElementDeclaration;
		resolvedElementDeclaration = newResolvedElementDeclaration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_ELEMENT_DECLARATION__RESOLVED_ELEMENT_DECLARATION, oldResolvedElementDeclaration, resolvedElementDeclaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDElementDeclaration getSubstitutionGroupAffiliation() {
		return substitutionGroupAffiliation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubstitutionGroupAffiliation(XSDElementDeclaration newSubstitutionGroupAffiliation) {
		XSDElementDeclaration oldSubstitutionGroupAffiliation = substitutionGroupAffiliation;
		substitutionGroupAffiliation = newSubstitutionGroupAffiliation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_ELEMENT_DECLARATION__SUBSTITUTION_GROUP_AFFILIATION, oldSubstitutionGroupAffiliation, substitutionGroupAffiliation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XSDElementDeclaration> getSubstitutionGroup() {
		if (substitutionGroup == null) {
			substitutionGroup = new EObjectEList<XSDElementDeclaration>(XSDElementDeclaration.class, this, XsdPackage.XSD_ELEMENT_DECLARATION__SUBSTITUTION_GROUP);
		}
		return substitutionGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XsdPackage.XSD_ELEMENT_DECLARATION__ANNOTATION:
				return basicSetAnnotation(null, msgs);
			case XsdPackage.XSD_ELEMENT_DECLARATION__ANONYMOUS_TYPE_DEFINITION:
				return basicSetAnonymousTypeDefinition(null, msgs);
			case XsdPackage.XSD_ELEMENT_DECLARATION__IDENTITY_CONSTRAINT_DEFINITIONS:
				return ((InternalEList<?>)getIdentityConstraintDefinitions()).basicRemove(otherEnd, msgs);
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
			case XsdPackage.XSD_ELEMENT_DECLARATION__NILLABLE:
				return isNillable();
			case XsdPackage.XSD_ELEMENT_DECLARATION__DISALLOWED_SUBSTITUTIONS:
				return getDisallowedSubstitutions();
			case XsdPackage.XSD_ELEMENT_DECLARATION__SUBSTITUTION_GROUP_EXCLUSIONS:
				return getSubstitutionGroupExclusions();
			case XsdPackage.XSD_ELEMENT_DECLARATION__ABSTRACT:
				return isAbstract();
			case XsdPackage.XSD_ELEMENT_DECLARATION__LEXICAL_FINAL:
				return getLexicalFinal();
			case XsdPackage.XSD_ELEMENT_DECLARATION__BLOCK:
				return getBlock();
			case XsdPackage.XSD_ELEMENT_DECLARATION__ELEMENT_DECLARATION_REFERENCE:
				return isElementDeclarationReference();
			case XsdPackage.XSD_ELEMENT_DECLARATION__CIRCULAR:
				return isCircular();
			case XsdPackage.XSD_ELEMENT_DECLARATION__ANNOTATION:
				return getAnnotation();
			case XsdPackage.XSD_ELEMENT_DECLARATION__ANONYMOUS_TYPE_DEFINITION:
				return getAnonymousTypeDefinition();
			case XsdPackage.XSD_ELEMENT_DECLARATION__TYPE_DEFINITION:
				return getTypeDefinition();
			case XsdPackage.XSD_ELEMENT_DECLARATION__IDENTITY_CONSTRAINT_DEFINITIONS:
				return getIdentityConstraintDefinitions();
			case XsdPackage.XSD_ELEMENT_DECLARATION__RESOLVED_ELEMENT_DECLARATION:
				return getResolvedElementDeclaration();
			case XsdPackage.XSD_ELEMENT_DECLARATION__SUBSTITUTION_GROUP_AFFILIATION:
				return getSubstitutionGroupAffiliation();
			case XsdPackage.XSD_ELEMENT_DECLARATION__SUBSTITUTION_GROUP:
				return getSubstitutionGroup();
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
			case XsdPackage.XSD_ELEMENT_DECLARATION__NILLABLE:
				setNillable((Boolean)newValue);
				return;
			case XsdPackage.XSD_ELEMENT_DECLARATION__DISALLOWED_SUBSTITUTIONS:
				getDisallowedSubstitutions().clear();
				getDisallowedSubstitutions().addAll((Collection<? extends XSDDisallowedSubstitutions>)newValue);
				return;
			case XsdPackage.XSD_ELEMENT_DECLARATION__SUBSTITUTION_GROUP_EXCLUSIONS:
				getSubstitutionGroupExclusions().clear();
				getSubstitutionGroupExclusions().addAll((Collection<? extends XSDSubstitutionGroupExclusions>)newValue);
				return;
			case XsdPackage.XSD_ELEMENT_DECLARATION__ABSTRACT:
				setAbstract((Boolean)newValue);
				return;
			case XsdPackage.XSD_ELEMENT_DECLARATION__LEXICAL_FINAL:
				getLexicalFinal().clear();
				getLexicalFinal().addAll((Collection<? extends XSDProhibitedSubstitutions>)newValue);
				return;
			case XsdPackage.XSD_ELEMENT_DECLARATION__BLOCK:
				getBlock().clear();
				getBlock().addAll((Collection<? extends XSDDisallowedSubstitutions>)newValue);
				return;
			case XsdPackage.XSD_ELEMENT_DECLARATION__ANNOTATION:
				setAnnotation((XSDAnnotation)newValue);
				return;
			case XsdPackage.XSD_ELEMENT_DECLARATION__ANONYMOUS_TYPE_DEFINITION:
				setAnonymousTypeDefinition((XSDTypeDefinition)newValue);
				return;
			case XsdPackage.XSD_ELEMENT_DECLARATION__TYPE_DEFINITION:
				setTypeDefinition((XSDTypeDefinition)newValue);
				return;
			case XsdPackage.XSD_ELEMENT_DECLARATION__IDENTITY_CONSTRAINT_DEFINITIONS:
				getIdentityConstraintDefinitions().clear();
				getIdentityConstraintDefinitions().addAll((Collection<? extends XSDIdentityConstraintDefinition>)newValue);
				return;
			case XsdPackage.XSD_ELEMENT_DECLARATION__RESOLVED_ELEMENT_DECLARATION:
				setResolvedElementDeclaration((XSDElementDeclaration)newValue);
				return;
			case XsdPackage.XSD_ELEMENT_DECLARATION__SUBSTITUTION_GROUP_AFFILIATION:
				setSubstitutionGroupAffiliation((XSDElementDeclaration)newValue);
				return;
			case XsdPackage.XSD_ELEMENT_DECLARATION__SUBSTITUTION_GROUP:
				getSubstitutionGroup().clear();
				getSubstitutionGroup().addAll((Collection<? extends XSDElementDeclaration>)newValue);
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
			case XsdPackage.XSD_ELEMENT_DECLARATION__NILLABLE:
				unsetNillable();
				return;
			case XsdPackage.XSD_ELEMENT_DECLARATION__DISALLOWED_SUBSTITUTIONS:
				getDisallowedSubstitutions().clear();
				return;
			case XsdPackage.XSD_ELEMENT_DECLARATION__SUBSTITUTION_GROUP_EXCLUSIONS:
				getSubstitutionGroupExclusions().clear();
				return;
			case XsdPackage.XSD_ELEMENT_DECLARATION__ABSTRACT:
				unsetAbstract();
				return;
			case XsdPackage.XSD_ELEMENT_DECLARATION__LEXICAL_FINAL:
				unsetLexicalFinal();
				return;
			case XsdPackage.XSD_ELEMENT_DECLARATION__BLOCK:
				unsetBlock();
				return;
			case XsdPackage.XSD_ELEMENT_DECLARATION__ANNOTATION:
				setAnnotation((XSDAnnotation)null);
				return;
			case XsdPackage.XSD_ELEMENT_DECLARATION__ANONYMOUS_TYPE_DEFINITION:
				setAnonymousTypeDefinition((XSDTypeDefinition)null);
				return;
			case XsdPackage.XSD_ELEMENT_DECLARATION__TYPE_DEFINITION:
				setTypeDefinition((XSDTypeDefinition)null);
				return;
			case XsdPackage.XSD_ELEMENT_DECLARATION__IDENTITY_CONSTRAINT_DEFINITIONS:
				getIdentityConstraintDefinitions().clear();
				return;
			case XsdPackage.XSD_ELEMENT_DECLARATION__RESOLVED_ELEMENT_DECLARATION:
				setResolvedElementDeclaration((XSDElementDeclaration)null);
				return;
			case XsdPackage.XSD_ELEMENT_DECLARATION__SUBSTITUTION_GROUP_AFFILIATION:
				setSubstitutionGroupAffiliation((XSDElementDeclaration)null);
				return;
			case XsdPackage.XSD_ELEMENT_DECLARATION__SUBSTITUTION_GROUP:
				getSubstitutionGroup().clear();
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
			case XsdPackage.XSD_ELEMENT_DECLARATION__NILLABLE:
				return isSetNillable();
			case XsdPackage.XSD_ELEMENT_DECLARATION__DISALLOWED_SUBSTITUTIONS:
				return disallowedSubstitutions != null && !disallowedSubstitutions.isEmpty();
			case XsdPackage.XSD_ELEMENT_DECLARATION__SUBSTITUTION_GROUP_EXCLUSIONS:
				return substitutionGroupExclusions != null && !substitutionGroupExclusions.isEmpty();
			case XsdPackage.XSD_ELEMENT_DECLARATION__ABSTRACT:
				return isSetAbstract();
			case XsdPackage.XSD_ELEMENT_DECLARATION__LEXICAL_FINAL:
				return isSetLexicalFinal();
			case XsdPackage.XSD_ELEMENT_DECLARATION__BLOCK:
				return isSetBlock();
			case XsdPackage.XSD_ELEMENT_DECLARATION__ELEMENT_DECLARATION_REFERENCE:
				return isElementDeclarationReference() != ELEMENT_DECLARATION_REFERENCE_EDEFAULT;
			case XsdPackage.XSD_ELEMENT_DECLARATION__CIRCULAR:
				return isCircular() != CIRCULAR_EDEFAULT;
			case XsdPackage.XSD_ELEMENT_DECLARATION__ANNOTATION:
				return annotation != null;
			case XsdPackage.XSD_ELEMENT_DECLARATION__ANONYMOUS_TYPE_DEFINITION:
				return anonymousTypeDefinition != null;
			case XsdPackage.XSD_ELEMENT_DECLARATION__TYPE_DEFINITION:
				return typeDefinition != null;
			case XsdPackage.XSD_ELEMENT_DECLARATION__IDENTITY_CONSTRAINT_DEFINITIONS:
				return identityConstraintDefinitions != null && !identityConstraintDefinitions.isEmpty();
			case XsdPackage.XSD_ELEMENT_DECLARATION__RESOLVED_ELEMENT_DECLARATION:
				return resolvedElementDeclaration != null;
			case XsdPackage.XSD_ELEMENT_DECLARATION__SUBSTITUTION_GROUP_AFFILIATION:
				return substitutionGroupAffiliation != null;
			case XsdPackage.XSD_ELEMENT_DECLARATION__SUBSTITUTION_GROUP:
				return substitutionGroup != null && !substitutionGroup.isEmpty();
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
		result.append(" (nillable: ");
		if (nillableESet) result.append(nillable); else result.append("<unset>");
		result.append(", disallowedSubstitutions: ");
		result.append(disallowedSubstitutions);
		result.append(", substitutionGroupExclusions: ");
		result.append(substitutionGroupExclusions);
		result.append(", abstract: ");
		if (abstractESet) result.append(abstract_); else result.append("<unset>");
		result.append(", lexicalFinal: ");
		result.append(lexicalFinal);
		result.append(", block: ");
		result.append(block);
		result.append(')');
		return result.toString();
	}

} //XSDElementDeclarationImpl
