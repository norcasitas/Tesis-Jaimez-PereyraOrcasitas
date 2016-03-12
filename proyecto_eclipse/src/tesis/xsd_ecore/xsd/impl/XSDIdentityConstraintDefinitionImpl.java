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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tesis.xsd_ecore.xsd.XSDAnnotation;
import tesis.xsd_ecore.xsd.XSDIdentityConstraintCategory;
import tesis.xsd_ecore.xsd.XSDIdentityConstraintDefinition;
import tesis.xsd_ecore.xsd.XSDXPathDefinition;
import tesis.xsd_ecore.xsd.XsdPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XSD Identity Constraint Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDIdentityConstraintDefinitionImpl#getIdentityConstraintCategory <em>Identity Constraint Category</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDIdentityConstraintDefinitionImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDIdentityConstraintDefinitionImpl#getReferencedKey <em>Referenced Key</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDIdentityConstraintDefinitionImpl#getSelector <em>Selector</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDIdentityConstraintDefinitionImpl#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XSDIdentityConstraintDefinitionImpl extends XSDNamedComponentImpl implements XSDIdentityConstraintDefinition {
	/**
	 * The default value of the '{@link #getIdentityConstraintCategory() <em>Identity Constraint Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentityConstraintCategory()
	 * @generated
	 * @ordered
	 */
	protected static final XSDIdentityConstraintCategory IDENTITY_CONSTRAINT_CATEGORY_EDEFAULT = XSDIdentityConstraintCategory.KEY;

	/**
	 * The cached value of the '{@link #getIdentityConstraintCategory() <em>Identity Constraint Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentityConstraintCategory()
	 * @generated
	 * @ordered
	 */
	protected XSDIdentityConstraintCategory identityConstraintCategory = IDENTITY_CONSTRAINT_CATEGORY_EDEFAULT;

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
	 * The cached value of the '{@link #getReferencedKey() <em>Referenced Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedKey()
	 * @generated
	 * @ordered
	 */
	protected XSDIdentityConstraintDefinition referencedKey;

	/**
	 * The cached value of the '{@link #getSelector() <em>Selector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelector()
	 * @generated
	 * @ordered
	 */
	protected XSDXPathDefinition selector;

	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<XSDXPathDefinition> fields;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XSDIdentityConstraintDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XsdPackage.Literals.XSD_IDENTITY_CONSTRAINT_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDIdentityConstraintCategory getIdentityConstraintCategory() {
		return identityConstraintCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentityConstraintCategory(XSDIdentityConstraintCategory newIdentityConstraintCategory) {
		XSDIdentityConstraintCategory oldIdentityConstraintCategory = identityConstraintCategory;
		identityConstraintCategory = newIdentityConstraintCategory == null ? IDENTITY_CONSTRAINT_CATEGORY_EDEFAULT : newIdentityConstraintCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_IDENTITY_CONSTRAINT_DEFINITION__IDENTITY_CONSTRAINT_CATEGORY, oldIdentityConstraintCategory, identityConstraintCategory));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_IDENTITY_CONSTRAINT_DEFINITION__ANNOTATION, oldAnnotation, newAnnotation);
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
				msgs = ((InternalEObject)annotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XsdPackage.XSD_IDENTITY_CONSTRAINT_DEFINITION__ANNOTATION, null, msgs);
			if (newAnnotation != null)
				msgs = ((InternalEObject)newAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XsdPackage.XSD_IDENTITY_CONSTRAINT_DEFINITION__ANNOTATION, null, msgs);
			msgs = basicSetAnnotation(newAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_IDENTITY_CONSTRAINT_DEFINITION__ANNOTATION, newAnnotation, newAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDIdentityConstraintDefinition getReferencedKey() {
		return referencedKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedKey(XSDIdentityConstraintDefinition newReferencedKey) {
		XSDIdentityConstraintDefinition oldReferencedKey = referencedKey;
		referencedKey = newReferencedKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_IDENTITY_CONSTRAINT_DEFINITION__REFERENCED_KEY, oldReferencedKey, referencedKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDXPathDefinition getSelector() {
		return selector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelector(XSDXPathDefinition newSelector, NotificationChain msgs) {
		XSDXPathDefinition oldSelector = selector;
		selector = newSelector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_IDENTITY_CONSTRAINT_DEFINITION__SELECTOR, oldSelector, newSelector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelector(XSDXPathDefinition newSelector) {
		if (newSelector != selector) {
			NotificationChain msgs = null;
			if (selector != null)
				msgs = ((InternalEObject)selector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XsdPackage.XSD_IDENTITY_CONSTRAINT_DEFINITION__SELECTOR, null, msgs);
			if (newSelector != null)
				msgs = ((InternalEObject)newSelector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XsdPackage.XSD_IDENTITY_CONSTRAINT_DEFINITION__SELECTOR, null, msgs);
			msgs = basicSetSelector(newSelector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_IDENTITY_CONSTRAINT_DEFINITION__SELECTOR, newSelector, newSelector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XSDXPathDefinition> getFields() {
		if (fields == null) {
			fields = new EObjectContainmentEList<XSDXPathDefinition>(XSDXPathDefinition.class, this, XsdPackage.XSD_IDENTITY_CONSTRAINT_DEFINITION__FIELDS);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XsdPackage.XSD_IDENTITY_CONSTRAINT_DEFINITION__ANNOTATION:
				return basicSetAnnotation(null, msgs);
			case XsdPackage.XSD_IDENTITY_CONSTRAINT_DEFINITION__SELECTOR:
				return basicSetSelector(null, msgs);
			case XsdPackage.XSD_IDENTITY_CONSTRAINT_DEFINITION__FIELDS:
				return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
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
			case XsdPackage.XSD_IDENTITY_CONSTRAINT_DEFINITION__IDENTITY_CONSTRAINT_CATEGORY:
				return getIdentityConstraintCategory();
			case XsdPackage.XSD_IDENTITY_CONSTRAINT_DEFINITION__ANNOTATION:
				return getAnnotation();
			case XsdPackage.XSD_IDENTITY_CONSTRAINT_DEFINITION__REFERENCED_KEY:
				return getReferencedKey();
			case XsdPackage.XSD_IDENTITY_CONSTRAINT_DEFINITION__SELECTOR:
				return getSelector();
			case XsdPackage.XSD_IDENTITY_CONSTRAINT_DEFINITION__FIELDS:
				return getFields();
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
			case XsdPackage.XSD_IDENTITY_CONSTRAINT_DEFINITION__IDENTITY_CONSTRAINT_CATEGORY:
				setIdentityConstraintCategory((XSDIdentityConstraintCategory)newValue);
				return;
			case XsdPackage.XSD_IDENTITY_CONSTRAINT_DEFINITION__ANNOTATION:
				setAnnotation((XSDAnnotation)newValue);
				return;
			case XsdPackage.XSD_IDENTITY_CONSTRAINT_DEFINITION__REFERENCED_KEY:
				setReferencedKey((XSDIdentityConstraintDefinition)newValue);
				return;
			case XsdPackage.XSD_IDENTITY_CONSTRAINT_DEFINITION__SELECTOR:
				setSelector((XSDXPathDefinition)newValue);
				return;
			case XsdPackage.XSD_IDENTITY_CONSTRAINT_DEFINITION__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends XSDXPathDefinition>)newValue);
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
			case XsdPackage.XSD_IDENTITY_CONSTRAINT_DEFINITION__IDENTITY_CONSTRAINT_CATEGORY:
				setIdentityConstraintCategory(IDENTITY_CONSTRAINT_CATEGORY_EDEFAULT);
				return;
			case XsdPackage.XSD_IDENTITY_CONSTRAINT_DEFINITION__ANNOTATION:
				setAnnotation((XSDAnnotation)null);
				return;
			case XsdPackage.XSD_IDENTITY_CONSTRAINT_DEFINITION__REFERENCED_KEY:
				setReferencedKey((XSDIdentityConstraintDefinition)null);
				return;
			case XsdPackage.XSD_IDENTITY_CONSTRAINT_DEFINITION__SELECTOR:
				setSelector((XSDXPathDefinition)null);
				return;
			case XsdPackage.XSD_IDENTITY_CONSTRAINT_DEFINITION__FIELDS:
				getFields().clear();
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
			case XsdPackage.XSD_IDENTITY_CONSTRAINT_DEFINITION__IDENTITY_CONSTRAINT_CATEGORY:
				return identityConstraintCategory != IDENTITY_CONSTRAINT_CATEGORY_EDEFAULT;
			case XsdPackage.XSD_IDENTITY_CONSTRAINT_DEFINITION__ANNOTATION:
				return annotation != null;
			case XsdPackage.XSD_IDENTITY_CONSTRAINT_DEFINITION__REFERENCED_KEY:
				return referencedKey != null;
			case XsdPackage.XSD_IDENTITY_CONSTRAINT_DEFINITION__SELECTOR:
				return selector != null;
			case XsdPackage.XSD_IDENTITY_CONSTRAINT_DEFINITION__FIELDS:
				return fields != null && !fields.isEmpty();
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
		result.append(" (identityConstraintCategory: ");
		result.append(identityConstraintCategory);
		result.append(')');
		return result.toString();
	}

} //XSDIdentityConstraintDefinitionImpl
