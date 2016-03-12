/**
 */
package tesis.xsd_ecore.xsd.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tesis.xsd_ecore.xsd.XSDAnnotation;
import tesis.xsd_ecore.xsd.XSDAttributeDeclaration;
import tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition;
import tesis.xsd_ecore.xsd.XsdPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XSD Attribute Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDAttributeDeclarationImpl#isAttributeDeclarationReference <em>Attribute Declaration Reference</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDAttributeDeclarationImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDAttributeDeclarationImpl#getAnonymousTypeDefinition <em>Anonymous Type Definition</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDAttributeDeclarationImpl#getTypeDefinition <em>Type Definition</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDAttributeDeclarationImpl#getResolvedAttributeDeclaration <em>Resolved Attribute Declaration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XSDAttributeDeclarationImpl extends XSDFeatureImpl implements XSDAttributeDeclaration {
	/**
	 * The default value of the '{@link #isAttributeDeclarationReference() <em>Attribute Declaration Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAttributeDeclarationReference()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ATTRIBUTE_DECLARATION_REFERENCE_EDEFAULT = false;

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
	protected XSDSimpleTypeDefinition anonymousTypeDefinition;

	/**
	 * The cached value of the '{@link #getTypeDefinition() <em>Type Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDefinition()
	 * @generated
	 * @ordered
	 */
	protected XSDSimpleTypeDefinition typeDefinition;

	/**
	 * The cached value of the '{@link #getResolvedAttributeDeclaration() <em>Resolved Attribute Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolvedAttributeDeclaration()
	 * @generated
	 * @ordered
	 */
	protected XSDAttributeDeclaration resolvedAttributeDeclaration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XSDAttributeDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XsdPackage.Literals.XSD_ATTRIBUTE_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAttributeDeclarationReference() {
		// TODO: implement this method to return the 'Attribute Declaration Reference' attribute
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_ATTRIBUTE_DECLARATION__ANNOTATION, oldAnnotation, newAnnotation);
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
				msgs = ((InternalEObject)annotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XsdPackage.XSD_ATTRIBUTE_DECLARATION__ANNOTATION, null, msgs);
			if (newAnnotation != null)
				msgs = ((InternalEObject)newAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XsdPackage.XSD_ATTRIBUTE_DECLARATION__ANNOTATION, null, msgs);
			msgs = basicSetAnnotation(newAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_ATTRIBUTE_DECLARATION__ANNOTATION, newAnnotation, newAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDSimpleTypeDefinition getAnonymousTypeDefinition() {
		return anonymousTypeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnonymousTypeDefinition(XSDSimpleTypeDefinition newAnonymousTypeDefinition, NotificationChain msgs) {
		XSDSimpleTypeDefinition oldAnonymousTypeDefinition = anonymousTypeDefinition;
		anonymousTypeDefinition = newAnonymousTypeDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_ATTRIBUTE_DECLARATION__ANONYMOUS_TYPE_DEFINITION, oldAnonymousTypeDefinition, newAnonymousTypeDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnonymousTypeDefinition(XSDSimpleTypeDefinition newAnonymousTypeDefinition) {
		if (newAnonymousTypeDefinition != anonymousTypeDefinition) {
			NotificationChain msgs = null;
			if (anonymousTypeDefinition != null)
				msgs = ((InternalEObject)anonymousTypeDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XsdPackage.XSD_ATTRIBUTE_DECLARATION__ANONYMOUS_TYPE_DEFINITION, null, msgs);
			if (newAnonymousTypeDefinition != null)
				msgs = ((InternalEObject)newAnonymousTypeDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XsdPackage.XSD_ATTRIBUTE_DECLARATION__ANONYMOUS_TYPE_DEFINITION, null, msgs);
			msgs = basicSetAnonymousTypeDefinition(newAnonymousTypeDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_ATTRIBUTE_DECLARATION__ANONYMOUS_TYPE_DEFINITION, newAnonymousTypeDefinition, newAnonymousTypeDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDSimpleTypeDefinition getTypeDefinition() {
		return typeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeDefinition(XSDSimpleTypeDefinition newTypeDefinition) {
		XSDSimpleTypeDefinition oldTypeDefinition = typeDefinition;
		typeDefinition = newTypeDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_ATTRIBUTE_DECLARATION__TYPE_DEFINITION, oldTypeDefinition, typeDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDAttributeDeclaration getResolvedAttributeDeclaration() {
		return resolvedAttributeDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolvedAttributeDeclaration(XSDAttributeDeclaration newResolvedAttributeDeclaration) {
		XSDAttributeDeclaration oldResolvedAttributeDeclaration = resolvedAttributeDeclaration;
		resolvedAttributeDeclaration = newResolvedAttributeDeclaration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_ATTRIBUTE_DECLARATION__RESOLVED_ATTRIBUTE_DECLARATION, oldResolvedAttributeDeclaration, resolvedAttributeDeclaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XsdPackage.XSD_ATTRIBUTE_DECLARATION__ANNOTATION:
				return basicSetAnnotation(null, msgs);
			case XsdPackage.XSD_ATTRIBUTE_DECLARATION__ANONYMOUS_TYPE_DEFINITION:
				return basicSetAnonymousTypeDefinition(null, msgs);
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
			case XsdPackage.XSD_ATTRIBUTE_DECLARATION__ATTRIBUTE_DECLARATION_REFERENCE:
				return isAttributeDeclarationReference();
			case XsdPackage.XSD_ATTRIBUTE_DECLARATION__ANNOTATION:
				return getAnnotation();
			case XsdPackage.XSD_ATTRIBUTE_DECLARATION__ANONYMOUS_TYPE_DEFINITION:
				return getAnonymousTypeDefinition();
			case XsdPackage.XSD_ATTRIBUTE_DECLARATION__TYPE_DEFINITION:
				return getTypeDefinition();
			case XsdPackage.XSD_ATTRIBUTE_DECLARATION__RESOLVED_ATTRIBUTE_DECLARATION:
				return getResolvedAttributeDeclaration();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XsdPackage.XSD_ATTRIBUTE_DECLARATION__ANNOTATION:
				setAnnotation((XSDAnnotation)newValue);
				return;
			case XsdPackage.XSD_ATTRIBUTE_DECLARATION__ANONYMOUS_TYPE_DEFINITION:
				setAnonymousTypeDefinition((XSDSimpleTypeDefinition)newValue);
				return;
			case XsdPackage.XSD_ATTRIBUTE_DECLARATION__TYPE_DEFINITION:
				setTypeDefinition((XSDSimpleTypeDefinition)newValue);
				return;
			case XsdPackage.XSD_ATTRIBUTE_DECLARATION__RESOLVED_ATTRIBUTE_DECLARATION:
				setResolvedAttributeDeclaration((XSDAttributeDeclaration)newValue);
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
			case XsdPackage.XSD_ATTRIBUTE_DECLARATION__ANNOTATION:
				setAnnotation((XSDAnnotation)null);
				return;
			case XsdPackage.XSD_ATTRIBUTE_DECLARATION__ANONYMOUS_TYPE_DEFINITION:
				setAnonymousTypeDefinition((XSDSimpleTypeDefinition)null);
				return;
			case XsdPackage.XSD_ATTRIBUTE_DECLARATION__TYPE_DEFINITION:
				setTypeDefinition((XSDSimpleTypeDefinition)null);
				return;
			case XsdPackage.XSD_ATTRIBUTE_DECLARATION__RESOLVED_ATTRIBUTE_DECLARATION:
				setResolvedAttributeDeclaration((XSDAttributeDeclaration)null);
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
			case XsdPackage.XSD_ATTRIBUTE_DECLARATION__ATTRIBUTE_DECLARATION_REFERENCE:
				return isAttributeDeclarationReference() != ATTRIBUTE_DECLARATION_REFERENCE_EDEFAULT;
			case XsdPackage.XSD_ATTRIBUTE_DECLARATION__ANNOTATION:
				return annotation != null;
			case XsdPackage.XSD_ATTRIBUTE_DECLARATION__ANONYMOUS_TYPE_DEFINITION:
				return anonymousTypeDefinition != null;
			case XsdPackage.XSD_ATTRIBUTE_DECLARATION__TYPE_DEFINITION:
				return typeDefinition != null;
			case XsdPackage.XSD_ATTRIBUTE_DECLARATION__RESOLVED_ATTRIBUTE_DECLARATION:
				return resolvedAttributeDeclaration != null;
		}
		return super.eIsSet(featureID);
	}

} //XSDAttributeDeclarationImpl
