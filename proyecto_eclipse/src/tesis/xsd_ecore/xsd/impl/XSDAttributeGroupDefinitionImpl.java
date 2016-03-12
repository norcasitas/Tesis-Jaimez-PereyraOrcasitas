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
import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tesis.xsd_ecore.xsd.XSDAnnotation;
import tesis.xsd_ecore.xsd.XSDAttributeGroupContent;
import tesis.xsd_ecore.xsd.XSDAttributeGroupDefinition;
import tesis.xsd_ecore.xsd.XSDAttributeUse;
import tesis.xsd_ecore.xsd.XSDWildcard;
import tesis.xsd_ecore.xsd.XsdPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XSD Attribute Group Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDAttributeGroupDefinitionImpl#isAttributeGroupDefinitionReference <em>Attribute Group Definition Reference</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDAttributeGroupDefinitionImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDAttributeGroupDefinitionImpl#getContents <em>Contents</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDAttributeGroupDefinitionImpl#getAttributeUses <em>Attribute Uses</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDAttributeGroupDefinitionImpl#getAttributeWildcardContent <em>Attribute Wildcard Content</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDAttributeGroupDefinitionImpl#getAttributeWildcard <em>Attribute Wildcard</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDAttributeGroupDefinitionImpl#getResolvedAttributeGroupDefinition <em>Resolved Attribute Group Definition</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDAttributeGroupDefinitionImpl#getSyntheticWildcard <em>Synthetic Wildcard</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XSDAttributeGroupDefinitionImpl extends XSDRedefinableComponentImpl implements XSDAttributeGroupDefinition {
	/**
	 * The default value of the '{@link #isAttributeGroupDefinitionReference() <em>Attribute Group Definition Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAttributeGroupDefinitionReference()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ATTRIBUTE_GROUP_DEFINITION_REFERENCE_EDEFAULT = false;

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
	 * The cached value of the '{@link #getContents() <em>Contents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContents()
	 * @generated
	 * @ordered
	 */
	protected EList<XSDAttributeGroupContent> contents;

	/**
	 * The cached value of the '{@link #getAttributeUses() <em>Attribute Uses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeUses()
	 * @generated
	 * @ordered
	 */
	protected EList<XSDAttributeUse> attributeUses;

	/**
	 * The cached value of the '{@link #getAttributeWildcardContent() <em>Attribute Wildcard Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeWildcardContent()
	 * @generated
	 * @ordered
	 */
	protected XSDWildcard attributeWildcardContent;

	/**
	 * The cached value of the '{@link #getAttributeWildcard() <em>Attribute Wildcard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeWildcard()
	 * @generated
	 * @ordered
	 */
	protected XSDWildcard attributeWildcard;

	/**
	 * The cached value of the '{@link #getResolvedAttributeGroupDefinition() <em>Resolved Attribute Group Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolvedAttributeGroupDefinition()
	 * @generated
	 * @ordered
	 */
	protected XSDAttributeGroupDefinition resolvedAttributeGroupDefinition;

	/**
	 * The cached value of the '{@link #getSyntheticWildcard() <em>Synthetic Wildcard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyntheticWildcard()
	 * @generated
	 * @ordered
	 */
	protected XSDWildcard syntheticWildcard;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XSDAttributeGroupDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XsdPackage.Literals.XSD_ATTRIBUTE_GROUP_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAttributeGroupDefinitionReference() {
		// TODO: implement this method to return the 'Attribute Group Definition Reference' attribute
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_ATTRIBUTE_GROUP_DEFINITION__ANNOTATION, oldAnnotation, newAnnotation);
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
				msgs = ((InternalEObject)annotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XsdPackage.XSD_ATTRIBUTE_GROUP_DEFINITION__ANNOTATION, null, msgs);
			if (newAnnotation != null)
				msgs = ((InternalEObject)newAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XsdPackage.XSD_ATTRIBUTE_GROUP_DEFINITION__ANNOTATION, null, msgs);
			msgs = basicSetAnnotation(newAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_ATTRIBUTE_GROUP_DEFINITION__ANNOTATION, newAnnotation, newAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XSDAttributeGroupContent> getContents() {
		if (contents == null) {
			contents = new EObjectContainmentEList<XSDAttributeGroupContent>(XSDAttributeGroupContent.class, this, XsdPackage.XSD_ATTRIBUTE_GROUP_DEFINITION__CONTENTS);
		}
		return contents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XSDAttributeUse> getAttributeUses() {
		if (attributeUses == null) {
			attributeUses = new EObjectEList<XSDAttributeUse>(XSDAttributeUse.class, this, XsdPackage.XSD_ATTRIBUTE_GROUP_DEFINITION__ATTRIBUTE_USES);
		}
		return attributeUses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDWildcard getAttributeWildcardContent() {
		return attributeWildcardContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributeWildcardContent(XSDWildcard newAttributeWildcardContent, NotificationChain msgs) {
		XSDWildcard oldAttributeWildcardContent = attributeWildcardContent;
		attributeWildcardContent = newAttributeWildcardContent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_ATTRIBUTE_GROUP_DEFINITION__ATTRIBUTE_WILDCARD_CONTENT, oldAttributeWildcardContent, newAttributeWildcardContent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeWildcardContent(XSDWildcard newAttributeWildcardContent) {
		if (newAttributeWildcardContent != attributeWildcardContent) {
			NotificationChain msgs = null;
			if (attributeWildcardContent != null)
				msgs = ((InternalEObject)attributeWildcardContent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XsdPackage.XSD_ATTRIBUTE_GROUP_DEFINITION__ATTRIBUTE_WILDCARD_CONTENT, null, msgs);
			if (newAttributeWildcardContent != null)
				msgs = ((InternalEObject)newAttributeWildcardContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XsdPackage.XSD_ATTRIBUTE_GROUP_DEFINITION__ATTRIBUTE_WILDCARD_CONTENT, null, msgs);
			msgs = basicSetAttributeWildcardContent(newAttributeWildcardContent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_ATTRIBUTE_GROUP_DEFINITION__ATTRIBUTE_WILDCARD_CONTENT, newAttributeWildcardContent, newAttributeWildcardContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDWildcard getAttributeWildcard() {
		return attributeWildcard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeWildcard(XSDWildcard newAttributeWildcard) {
		XSDWildcard oldAttributeWildcard = attributeWildcard;
		attributeWildcard = newAttributeWildcard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_ATTRIBUTE_GROUP_DEFINITION__ATTRIBUTE_WILDCARD, oldAttributeWildcard, attributeWildcard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDAttributeGroupDefinition getResolvedAttributeGroupDefinition() {
		return resolvedAttributeGroupDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolvedAttributeGroupDefinition(XSDAttributeGroupDefinition newResolvedAttributeGroupDefinition) {
		XSDAttributeGroupDefinition oldResolvedAttributeGroupDefinition = resolvedAttributeGroupDefinition;
		resolvedAttributeGroupDefinition = newResolvedAttributeGroupDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_ATTRIBUTE_GROUP_DEFINITION__RESOLVED_ATTRIBUTE_GROUP_DEFINITION, oldResolvedAttributeGroupDefinition, resolvedAttributeGroupDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDWildcard getSyntheticWildcard() {
		return syntheticWildcard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSyntheticWildcard(XSDWildcard newSyntheticWildcard, NotificationChain msgs) {
		XSDWildcard oldSyntheticWildcard = syntheticWildcard;
		syntheticWildcard = newSyntheticWildcard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_ATTRIBUTE_GROUP_DEFINITION__SYNTHETIC_WILDCARD, oldSyntheticWildcard, newSyntheticWildcard);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSyntheticWildcard(XSDWildcard newSyntheticWildcard) {
		if (newSyntheticWildcard != syntheticWildcard) {
			NotificationChain msgs = null;
			if (syntheticWildcard != null)
				msgs = ((InternalEObject)syntheticWildcard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XsdPackage.XSD_ATTRIBUTE_GROUP_DEFINITION__SYNTHETIC_WILDCARD, null, msgs);
			if (newSyntheticWildcard != null)
				msgs = ((InternalEObject)newSyntheticWildcard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XsdPackage.XSD_ATTRIBUTE_GROUP_DEFINITION__SYNTHETIC_WILDCARD, null, msgs);
			msgs = basicSetSyntheticWildcard(newSyntheticWildcard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_ATTRIBUTE_GROUP_DEFINITION__SYNTHETIC_WILDCARD, newSyntheticWildcard, newSyntheticWildcard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XsdPackage.XSD_ATTRIBUTE_GROUP_DEFINITION__ANNOTATION:
				return basicSetAnnotation(null, msgs);
			case XsdPackage.XSD_ATTRIBUTE_GROUP_DEFINITION__CONTENTS:
				return ((InternalEList<?>)getContents()).basicRemove(otherEnd, msgs);
			case XsdPackage.XSD_ATTRIBUTE_GROUP_DEFINITION__ATTRIBUTE_WILDCARD_CONTENT:
				return basicSetAttributeWildcardContent(null, msgs);
			case XsdPackage.XSD_ATTRIBUTE_GROUP_DEFINITION__SYNTHETIC_WILDCARD:
				return basicSetSyntheticWildcard(null, msgs);
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
			case XsdPackage.XSD_ATTRIBUTE_GROUP_DEFINITION__ATTRIBUTE_GROUP_DEFINITION_REFERENCE:
				return isAttributeGroupDefinitionReference();
			case XsdPackage.XSD_ATTRIBUTE_GROUP_DEFINITION__ANNOTATION:
				return getAnnotation();
			case XsdPackage.XSD_ATTRIBUTE_GROUP_DEFINITION__CONTENTS:
				return getContents();
			case XsdPackage.XSD_ATTRIBUTE_GROUP_DEFINITION__ATTRIBUTE_USES:
				return getAttributeUses();
			case XsdPackage.XSD_ATTRIBUTE_GROUP_DEFINITION__ATTRIBUTE_WILDCARD_CONTENT:
				return getAttributeWildcardContent();
			case XsdPackage.XSD_ATTRIBUTE_GROUP_DEFINITION__ATTRIBUTE_WILDCARD:
				return getAttributeWildcard();
			case XsdPackage.XSD_ATTRIBUTE_GROUP_DEFINITION__RESOLVED_ATTRIBUTE_GROUP_DEFINITION:
				return getResolvedAttributeGroupDefinition();
			case XsdPackage.XSD_ATTRIBUTE_GROUP_DEFINITION__SYNTHETIC_WILDCARD:
				return getSyntheticWildcard();
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
			case XsdPackage.XSD_ATTRIBUTE_GROUP_DEFINITION__ANNOTATION:
				setAnnotation((XSDAnnotation)newValue);
				return;
			case XsdPackage.XSD_ATTRIBUTE_GROUP_DEFINITION__CONTENTS:
				getContents().clear();
				getContents().addAll((Collection<? extends XSDAttributeGroupContent>)newValue);
				return;
			case XsdPackage.XSD_ATTRIBUTE_GROUP_DEFINITION__ATTRIBUTE_USES:
				getAttributeUses().clear();
				getAttributeUses().addAll((Collection<? extends XSDAttributeUse>)newValue);
				return;
			case XsdPackage.XSD_ATTRIBUTE_GROUP_DEFINITION__ATTRIBUTE_WILDCARD_CONTENT:
				setAttributeWildcardContent((XSDWildcard)newValue);
				return;
			case XsdPackage.XSD_ATTRIBUTE_GROUP_DEFINITION__ATTRIBUTE_WILDCARD:
				setAttributeWildcard((XSDWildcard)newValue);
				return;
			case XsdPackage.XSD_ATTRIBUTE_GROUP_DEFINITION__RESOLVED_ATTRIBUTE_GROUP_DEFINITION:
				setResolvedAttributeGroupDefinition((XSDAttributeGroupDefinition)newValue);
				return;
			case XsdPackage.XSD_ATTRIBUTE_GROUP_DEFINITION__SYNTHETIC_WILDCARD:
				setSyntheticWildcard((XSDWildcard)newValue);
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
			case XsdPackage.XSD_ATTRIBUTE_GROUP_DEFINITION__ANNOTATION:
				setAnnotation((XSDAnnotation)null);
				return;
			case XsdPackage.XSD_ATTRIBUTE_GROUP_DEFINITION__CONTENTS:
				getContents().clear();
				return;
			case XsdPackage.XSD_ATTRIBUTE_GROUP_DEFINITION__ATTRIBUTE_USES:
				getAttributeUses().clear();
				return;
			case XsdPackage.XSD_ATTRIBUTE_GROUP_DEFINITION__ATTRIBUTE_WILDCARD_CONTENT:
				setAttributeWildcardContent((XSDWildcard)null);
				return;
			case XsdPackage.XSD_ATTRIBUTE_GROUP_DEFINITION__ATTRIBUTE_WILDCARD:
				setAttributeWildcard((XSDWildcard)null);
				return;
			case XsdPackage.XSD_ATTRIBUTE_GROUP_DEFINITION__RESOLVED_ATTRIBUTE_GROUP_DEFINITION:
				setResolvedAttributeGroupDefinition((XSDAttributeGroupDefinition)null);
				return;
			case XsdPackage.XSD_ATTRIBUTE_GROUP_DEFINITION__SYNTHETIC_WILDCARD:
				setSyntheticWildcard((XSDWildcard)null);
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
			case XsdPackage.XSD_ATTRIBUTE_GROUP_DEFINITION__ATTRIBUTE_GROUP_DEFINITION_REFERENCE:
				return isAttributeGroupDefinitionReference() != ATTRIBUTE_GROUP_DEFINITION_REFERENCE_EDEFAULT;
			case XsdPackage.XSD_ATTRIBUTE_GROUP_DEFINITION__ANNOTATION:
				return annotation != null;
			case XsdPackage.XSD_ATTRIBUTE_GROUP_DEFINITION__CONTENTS:
				return contents != null && !contents.isEmpty();
			case XsdPackage.XSD_ATTRIBUTE_GROUP_DEFINITION__ATTRIBUTE_USES:
				return attributeUses != null && !attributeUses.isEmpty();
			case XsdPackage.XSD_ATTRIBUTE_GROUP_DEFINITION__ATTRIBUTE_WILDCARD_CONTENT:
				return attributeWildcardContent != null;
			case XsdPackage.XSD_ATTRIBUTE_GROUP_DEFINITION__ATTRIBUTE_WILDCARD:
				return attributeWildcard != null;
			case XsdPackage.XSD_ATTRIBUTE_GROUP_DEFINITION__RESOLVED_ATTRIBUTE_GROUP_DEFINITION:
				return resolvedAttributeGroupDefinition != null;
			case XsdPackage.XSD_ATTRIBUTE_GROUP_DEFINITION__SYNTHETIC_WILDCARD:
				return syntheticWildcard != null;
		}
		return super.eIsSet(featureID);
	}

} //XSDAttributeGroupDefinitionImpl
