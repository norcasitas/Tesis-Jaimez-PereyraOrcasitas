/**
 */
package tesis.xsd_ecore.xsd.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tesis.xsd_ecore.xsd.XSDAnnotation;
import tesis.xsd_ecore.xsd.XSDModelGroup;
import tesis.xsd_ecore.xsd.XSDModelGroupDefinition;
import tesis.xsd_ecore.xsd.XsdPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XSD Model Group Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDModelGroupDefinitionImpl#isModelGroupDefinitionReference <em>Model Group Definition Reference</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDModelGroupDefinitionImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDModelGroupDefinitionImpl#getModelGroup <em>Model Group</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDModelGroupDefinitionImpl#getResolvedModelGroupDefinition <em>Resolved Model Group Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XSDModelGroupDefinitionImpl extends XSDRedefinableComponentImpl implements XSDModelGroupDefinition {
	/**
	 * The default value of the '{@link #isModelGroupDefinitionReference() <em>Model Group Definition Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isModelGroupDefinitionReference()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MODEL_GROUP_DEFINITION_REFERENCE_EDEFAULT = false;

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
	 * The cached value of the '{@link #getModelGroup() <em>Model Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelGroup()
	 * @generated
	 * @ordered
	 */
	protected XSDModelGroup modelGroup;

	/**
	 * The cached value of the '{@link #getResolvedModelGroupDefinition() <em>Resolved Model Group Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolvedModelGroupDefinition()
	 * @generated
	 * @ordered
	 */
	protected XSDModelGroupDefinition resolvedModelGroupDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XSDModelGroupDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XsdPackage.Literals.XSD_MODEL_GROUP_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isModelGroupDefinitionReference() {
		// TODO: implement this method to return the 'Model Group Definition Reference' attribute
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_MODEL_GROUP_DEFINITION__ANNOTATION, oldAnnotation, newAnnotation);
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
				msgs = ((InternalEObject)annotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XsdPackage.XSD_MODEL_GROUP_DEFINITION__ANNOTATION, null, msgs);
			if (newAnnotation != null)
				msgs = ((InternalEObject)newAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XsdPackage.XSD_MODEL_GROUP_DEFINITION__ANNOTATION, null, msgs);
			msgs = basicSetAnnotation(newAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_MODEL_GROUP_DEFINITION__ANNOTATION, newAnnotation, newAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDModelGroup getModelGroup() {
		return modelGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModelGroup(XSDModelGroup newModelGroup, NotificationChain msgs) {
		XSDModelGroup oldModelGroup = modelGroup;
		modelGroup = newModelGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_MODEL_GROUP_DEFINITION__MODEL_GROUP, oldModelGroup, newModelGroup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelGroup(XSDModelGroup newModelGroup) {
		if (newModelGroup != modelGroup) {
			NotificationChain msgs = null;
			if (modelGroup != null)
				msgs = ((InternalEObject)modelGroup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XsdPackage.XSD_MODEL_GROUP_DEFINITION__MODEL_GROUP, null, msgs);
			if (newModelGroup != null)
				msgs = ((InternalEObject)newModelGroup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XsdPackage.XSD_MODEL_GROUP_DEFINITION__MODEL_GROUP, null, msgs);
			msgs = basicSetModelGroup(newModelGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_MODEL_GROUP_DEFINITION__MODEL_GROUP, newModelGroup, newModelGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDModelGroupDefinition getResolvedModelGroupDefinition() {
		return resolvedModelGroupDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolvedModelGroupDefinition(XSDModelGroupDefinition newResolvedModelGroupDefinition) {
		XSDModelGroupDefinition oldResolvedModelGroupDefinition = resolvedModelGroupDefinition;
		resolvedModelGroupDefinition = newResolvedModelGroupDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_MODEL_GROUP_DEFINITION__RESOLVED_MODEL_GROUP_DEFINITION, oldResolvedModelGroupDefinition, resolvedModelGroupDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XsdPackage.XSD_MODEL_GROUP_DEFINITION__ANNOTATION:
				return basicSetAnnotation(null, msgs);
			case XsdPackage.XSD_MODEL_GROUP_DEFINITION__MODEL_GROUP:
				return basicSetModelGroup(null, msgs);
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
			case XsdPackage.XSD_MODEL_GROUP_DEFINITION__MODEL_GROUP_DEFINITION_REFERENCE:
				return isModelGroupDefinitionReference();
			case XsdPackage.XSD_MODEL_GROUP_DEFINITION__ANNOTATION:
				return getAnnotation();
			case XsdPackage.XSD_MODEL_GROUP_DEFINITION__MODEL_GROUP:
				return getModelGroup();
			case XsdPackage.XSD_MODEL_GROUP_DEFINITION__RESOLVED_MODEL_GROUP_DEFINITION:
				return getResolvedModelGroupDefinition();
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
			case XsdPackage.XSD_MODEL_GROUP_DEFINITION__ANNOTATION:
				setAnnotation((XSDAnnotation)newValue);
				return;
			case XsdPackage.XSD_MODEL_GROUP_DEFINITION__MODEL_GROUP:
				setModelGroup((XSDModelGroup)newValue);
				return;
			case XsdPackage.XSD_MODEL_GROUP_DEFINITION__RESOLVED_MODEL_GROUP_DEFINITION:
				setResolvedModelGroupDefinition((XSDModelGroupDefinition)newValue);
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
			case XsdPackage.XSD_MODEL_GROUP_DEFINITION__ANNOTATION:
				setAnnotation((XSDAnnotation)null);
				return;
			case XsdPackage.XSD_MODEL_GROUP_DEFINITION__MODEL_GROUP:
				setModelGroup((XSDModelGroup)null);
				return;
			case XsdPackage.XSD_MODEL_GROUP_DEFINITION__RESOLVED_MODEL_GROUP_DEFINITION:
				setResolvedModelGroupDefinition((XSDModelGroupDefinition)null);
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
			case XsdPackage.XSD_MODEL_GROUP_DEFINITION__MODEL_GROUP_DEFINITION_REFERENCE:
				return isModelGroupDefinitionReference() != MODEL_GROUP_DEFINITION_REFERENCE_EDEFAULT;
			case XsdPackage.XSD_MODEL_GROUP_DEFINITION__ANNOTATION:
				return annotation != null;
			case XsdPackage.XSD_MODEL_GROUP_DEFINITION__MODEL_GROUP:
				return modelGroup != null;
			case XsdPackage.XSD_MODEL_GROUP_DEFINITION__RESOLVED_MODEL_GROUP_DEFINITION:
				return resolvedModelGroupDefinition != null;
		}
		return super.eIsSet(featureID);
	}

} //XSDModelGroupDefinitionImpl
