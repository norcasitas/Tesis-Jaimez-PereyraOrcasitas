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
import tesis.xsd_ecore.xsd.XSDCompositor;
import tesis.xsd_ecore.xsd.XSDModelGroup;
import tesis.xsd_ecore.xsd.XSDParticle;
import tesis.xsd_ecore.xsd.XsdPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XSD Model Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDModelGroupImpl#getCompositor <em>Compositor</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDModelGroupImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDModelGroupImpl#getContents <em>Contents</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDModelGroupImpl#getParticles <em>Particles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XSDModelGroupImpl extends XSDTermImpl implements XSDModelGroup {
	/**
	 * The default value of the '{@link #getCompositor() <em>Compositor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositor()
	 * @generated
	 * @ordered
	 */
	protected static final XSDCompositor COMPOSITOR_EDEFAULT = XSDCompositor.ALL;

	/**
	 * The cached value of the '{@link #getCompositor() <em>Compositor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositor()
	 * @generated
	 * @ordered
	 */
	protected XSDCompositor compositor = COMPOSITOR_EDEFAULT;

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
	protected EList<XSDParticle> contents;

	/**
	 * The cached value of the '{@link #getParticles() <em>Particles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticles()
	 * @generated
	 * @ordered
	 */
	protected EList<XSDParticle> particles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XSDModelGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XsdPackage.Literals.XSD_MODEL_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDCompositor getCompositor() {
		return compositor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompositor(XSDCompositor newCompositor) {
		XSDCompositor oldCompositor = compositor;
		compositor = newCompositor == null ? COMPOSITOR_EDEFAULT : newCompositor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_MODEL_GROUP__COMPOSITOR, oldCompositor, compositor));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_MODEL_GROUP__ANNOTATION, oldAnnotation, newAnnotation);
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
				msgs = ((InternalEObject)annotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XsdPackage.XSD_MODEL_GROUP__ANNOTATION, null, msgs);
			if (newAnnotation != null)
				msgs = ((InternalEObject)newAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XsdPackage.XSD_MODEL_GROUP__ANNOTATION, null, msgs);
			msgs = basicSetAnnotation(newAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_MODEL_GROUP__ANNOTATION, newAnnotation, newAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XSDParticle> getContents() {
		if (contents == null) {
			contents = new EObjectContainmentEList<XSDParticle>(XSDParticle.class, this, XsdPackage.XSD_MODEL_GROUP__CONTENTS);
		}
		return contents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XSDParticle> getParticles() {
		if (particles == null) {
			particles = new EObjectEList<XSDParticle>(XSDParticle.class, this, XsdPackage.XSD_MODEL_GROUP__PARTICLES);
		}
		return particles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XsdPackage.XSD_MODEL_GROUP__ANNOTATION:
				return basicSetAnnotation(null, msgs);
			case XsdPackage.XSD_MODEL_GROUP__CONTENTS:
				return ((InternalEList<?>)getContents()).basicRemove(otherEnd, msgs);
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
			case XsdPackage.XSD_MODEL_GROUP__COMPOSITOR:
				return getCompositor();
			case XsdPackage.XSD_MODEL_GROUP__ANNOTATION:
				return getAnnotation();
			case XsdPackage.XSD_MODEL_GROUP__CONTENTS:
				return getContents();
			case XsdPackage.XSD_MODEL_GROUP__PARTICLES:
				return getParticles();
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
			case XsdPackage.XSD_MODEL_GROUP__COMPOSITOR:
				setCompositor((XSDCompositor)newValue);
				return;
			case XsdPackage.XSD_MODEL_GROUP__ANNOTATION:
				setAnnotation((XSDAnnotation)newValue);
				return;
			case XsdPackage.XSD_MODEL_GROUP__CONTENTS:
				getContents().clear();
				getContents().addAll((Collection<? extends XSDParticle>)newValue);
				return;
			case XsdPackage.XSD_MODEL_GROUP__PARTICLES:
				getParticles().clear();
				getParticles().addAll((Collection<? extends XSDParticle>)newValue);
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
			case XsdPackage.XSD_MODEL_GROUP__COMPOSITOR:
				setCompositor(COMPOSITOR_EDEFAULT);
				return;
			case XsdPackage.XSD_MODEL_GROUP__ANNOTATION:
				setAnnotation((XSDAnnotation)null);
				return;
			case XsdPackage.XSD_MODEL_GROUP__CONTENTS:
				getContents().clear();
				return;
			case XsdPackage.XSD_MODEL_GROUP__PARTICLES:
				getParticles().clear();
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
			case XsdPackage.XSD_MODEL_GROUP__COMPOSITOR:
				return compositor != COMPOSITOR_EDEFAULT;
			case XsdPackage.XSD_MODEL_GROUP__ANNOTATION:
				return annotation != null;
			case XsdPackage.XSD_MODEL_GROUP__CONTENTS:
				return contents != null && !contents.isEmpty();
			case XsdPackage.XSD_MODEL_GROUP__PARTICLES:
				return particles != null && !particles.isEmpty();
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
		result.append(" (compositor: ");
		result.append(compositor);
		result.append(')');
		return result.toString();
	}

} //XSDModelGroupImpl
