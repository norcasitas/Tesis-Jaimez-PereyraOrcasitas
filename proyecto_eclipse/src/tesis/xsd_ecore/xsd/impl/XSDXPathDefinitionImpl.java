/**
 */
package tesis.xsd_ecore.xsd.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tesis.xsd_ecore.xsd.XSDAnnotation;
import tesis.xsd_ecore.xsd.XSDXPathDefinition;
import tesis.xsd_ecore.xsd.XSDXPathVariety;
import tesis.xsd_ecore.xsd.XsdPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XSDX Path Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDXPathDefinitionImpl#getVariety <em>Variety</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDXPathDefinitionImpl#getValue <em>Value</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDXPathDefinitionImpl#getAnnotation <em>Annotation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XSDXPathDefinitionImpl extends XSDComponentImpl implements XSDXPathDefinition {
	/**
	 * The default value of the '{@link #getVariety() <em>Variety</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariety()
	 * @generated
	 * @ordered
	 */
	protected static final XSDXPathVariety VARIETY_EDEFAULT = XSDXPathVariety.SELECTOR;

	/**
	 * The cached value of the '{@link #getVariety() <em>Variety</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariety()
	 * @generated
	 * @ordered
	 */
	protected XSDXPathVariety variety = VARIETY_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XSDXPathDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XsdPackage.Literals.XSDX_PATH_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDXPathVariety getVariety() {
		return variety;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariety(XSDXPathVariety newVariety) {
		XSDXPathVariety oldVariety = variety;
		variety = newVariety == null ? VARIETY_EDEFAULT : newVariety;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSDX_PATH_DEFINITION__VARIETY, oldVariety, variety));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSDX_PATH_DEFINITION__VALUE, oldValue, value));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XsdPackage.XSDX_PATH_DEFINITION__ANNOTATION, oldAnnotation, newAnnotation);
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
				msgs = ((InternalEObject)annotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XsdPackage.XSDX_PATH_DEFINITION__ANNOTATION, null, msgs);
			if (newAnnotation != null)
				msgs = ((InternalEObject)newAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XsdPackage.XSDX_PATH_DEFINITION__ANNOTATION, null, msgs);
			msgs = basicSetAnnotation(newAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSDX_PATH_DEFINITION__ANNOTATION, newAnnotation, newAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XsdPackage.XSDX_PATH_DEFINITION__ANNOTATION:
				return basicSetAnnotation(null, msgs);
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
			case XsdPackage.XSDX_PATH_DEFINITION__VARIETY:
				return getVariety();
			case XsdPackage.XSDX_PATH_DEFINITION__VALUE:
				return getValue();
			case XsdPackage.XSDX_PATH_DEFINITION__ANNOTATION:
				return getAnnotation();
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
			case XsdPackage.XSDX_PATH_DEFINITION__VARIETY:
				setVariety((XSDXPathVariety)newValue);
				return;
			case XsdPackage.XSDX_PATH_DEFINITION__VALUE:
				setValue((String)newValue);
				return;
			case XsdPackage.XSDX_PATH_DEFINITION__ANNOTATION:
				setAnnotation((XSDAnnotation)newValue);
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
			case XsdPackage.XSDX_PATH_DEFINITION__VARIETY:
				setVariety(VARIETY_EDEFAULT);
				return;
			case XsdPackage.XSDX_PATH_DEFINITION__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case XsdPackage.XSDX_PATH_DEFINITION__ANNOTATION:
				setAnnotation((XSDAnnotation)null);
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
			case XsdPackage.XSDX_PATH_DEFINITION__VARIETY:
				return variety != VARIETY_EDEFAULT;
			case XsdPackage.XSDX_PATH_DEFINITION__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case XsdPackage.XSDX_PATH_DEFINITION__ANNOTATION:
				return annotation != null;
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
		result.append(" (variety: ");
		result.append(variety);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //XSDXPathDefinitionImpl
