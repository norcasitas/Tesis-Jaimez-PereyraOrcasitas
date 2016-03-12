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

import org.eclipse.emf.ecore.util.EObjectEList;

import tesis.xsd_ecore.xsd.XSDAnnotation;
import tesis.xsd_ecore.xsd.XSDParticle;
import tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition;
import tesis.xsd_ecore.xsd.XSDTypeDefinition;
import tesis.xsd_ecore.xsd.XsdPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XSD Type Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDTypeDefinitionImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDTypeDefinitionImpl#getDerivationAnnotation <em>Derivation Annotation</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDTypeDefinitionImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDTypeDefinitionImpl#getRootType <em>Root Type</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDTypeDefinitionImpl#getBaseType <em>Base Type</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDTypeDefinitionImpl#getSimpleType <em>Simple Type</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDTypeDefinitionImpl#getComplexType <em>Complex Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class XSDTypeDefinitionImpl extends XSDRedefinableComponentImpl implements XSDTypeDefinition {
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
	 * The cached value of the '{@link #getDerivationAnnotation() <em>Derivation Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivationAnnotation()
	 * @generated
	 * @ordered
	 */
	protected XSDAnnotation derivationAnnotation;

	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<XSDAnnotation> annotations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XSDTypeDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XsdPackage.Literals.XSD_TYPE_DEFINITION;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_TYPE_DEFINITION__ANNOTATION, oldAnnotation, newAnnotation);
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
				msgs = ((InternalEObject)annotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XsdPackage.XSD_TYPE_DEFINITION__ANNOTATION, null, msgs);
			if (newAnnotation != null)
				msgs = ((InternalEObject)newAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XsdPackage.XSD_TYPE_DEFINITION__ANNOTATION, null, msgs);
			msgs = basicSetAnnotation(newAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_TYPE_DEFINITION__ANNOTATION, newAnnotation, newAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDAnnotation getDerivationAnnotation() {
		return derivationAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDerivationAnnotation(XSDAnnotation newDerivationAnnotation, NotificationChain msgs) {
		XSDAnnotation oldDerivationAnnotation = derivationAnnotation;
		derivationAnnotation = newDerivationAnnotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_TYPE_DEFINITION__DERIVATION_ANNOTATION, oldDerivationAnnotation, newDerivationAnnotation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDerivationAnnotation(XSDAnnotation newDerivationAnnotation) {
		if (newDerivationAnnotation != derivationAnnotation) {
			NotificationChain msgs = null;
			if (derivationAnnotation != null)
				msgs = ((InternalEObject)derivationAnnotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XsdPackage.XSD_TYPE_DEFINITION__DERIVATION_ANNOTATION, null, msgs);
			if (newDerivationAnnotation != null)
				msgs = ((InternalEObject)newDerivationAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XsdPackage.XSD_TYPE_DEFINITION__DERIVATION_ANNOTATION, null, msgs);
			msgs = basicSetDerivationAnnotation(newDerivationAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_TYPE_DEFINITION__DERIVATION_ANNOTATION, newDerivationAnnotation, newDerivationAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XSDAnnotation> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectEList<XSDAnnotation>(XSDAnnotation.class, this, XsdPackage.XSD_TYPE_DEFINITION__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDTypeDefinition getRootType() {
		// TODO: implement this method to return the 'Root Type' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDTypeDefinition getBaseType() {
		// TODO: implement this method to return the 'Base Type' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDSimpleTypeDefinition getSimpleType() {
		// TODO: implement this method to return the 'Simple Type' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDParticle getComplexType() {
		// TODO: implement this method to return the 'Complex Type' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XsdPackage.XSD_TYPE_DEFINITION__ANNOTATION:
				return basicSetAnnotation(null, msgs);
			case XsdPackage.XSD_TYPE_DEFINITION__DERIVATION_ANNOTATION:
				return basicSetDerivationAnnotation(null, msgs);
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
			case XsdPackage.XSD_TYPE_DEFINITION__ANNOTATION:
				return getAnnotation();
			case XsdPackage.XSD_TYPE_DEFINITION__DERIVATION_ANNOTATION:
				return getDerivationAnnotation();
			case XsdPackage.XSD_TYPE_DEFINITION__ANNOTATIONS:
				return getAnnotations();
			case XsdPackage.XSD_TYPE_DEFINITION__ROOT_TYPE:
				return getRootType();
			case XsdPackage.XSD_TYPE_DEFINITION__BASE_TYPE:
				return getBaseType();
			case XsdPackage.XSD_TYPE_DEFINITION__SIMPLE_TYPE:
				return getSimpleType();
			case XsdPackage.XSD_TYPE_DEFINITION__COMPLEX_TYPE:
				return getComplexType();
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
			case XsdPackage.XSD_TYPE_DEFINITION__ANNOTATION:
				setAnnotation((XSDAnnotation)newValue);
				return;
			case XsdPackage.XSD_TYPE_DEFINITION__DERIVATION_ANNOTATION:
				setDerivationAnnotation((XSDAnnotation)newValue);
				return;
			case XsdPackage.XSD_TYPE_DEFINITION__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends XSDAnnotation>)newValue);
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
			case XsdPackage.XSD_TYPE_DEFINITION__ANNOTATION:
				setAnnotation((XSDAnnotation)null);
				return;
			case XsdPackage.XSD_TYPE_DEFINITION__DERIVATION_ANNOTATION:
				setDerivationAnnotation((XSDAnnotation)null);
				return;
			case XsdPackage.XSD_TYPE_DEFINITION__ANNOTATIONS:
				getAnnotations().clear();
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
			case XsdPackage.XSD_TYPE_DEFINITION__ANNOTATION:
				return annotation != null;
			case XsdPackage.XSD_TYPE_DEFINITION__DERIVATION_ANNOTATION:
				return derivationAnnotation != null;
			case XsdPackage.XSD_TYPE_DEFINITION__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case XsdPackage.XSD_TYPE_DEFINITION__ROOT_TYPE:
				return getRootType() != null;
			case XsdPackage.XSD_TYPE_DEFINITION__BASE_TYPE:
				return getBaseType() != null;
			case XsdPackage.XSD_TYPE_DEFINITION__SIMPLE_TYPE:
				return getSimpleType() != null;
			case XsdPackage.XSD_TYPE_DEFINITION__COMPLEX_TYPE:
				return getComplexType() != null;
		}
		return super.eIsSet(featureID);
	}

} //XSDTypeDefinitionImpl
