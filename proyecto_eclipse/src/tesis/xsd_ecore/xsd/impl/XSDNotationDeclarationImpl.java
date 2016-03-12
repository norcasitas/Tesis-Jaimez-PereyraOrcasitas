/**
 */
package tesis.xsd_ecore.xsd.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tesis.xsd_ecore.xsd.XSDAnnotation;
import tesis.xsd_ecore.xsd.XSDNotationDeclaration;
import tesis.xsd_ecore.xsd.XsdPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XSD Notation Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDNotationDeclarationImpl#getSystemIdentifier <em>System Identifier</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDNotationDeclarationImpl#getPublicIdentifier <em>Public Identifier</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDNotationDeclarationImpl#getAnnotation <em>Annotation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XSDNotationDeclarationImpl extends XSDNamedComponentImpl implements XSDNotationDeclaration {
	/**
	 * The default value of the '{@link #getSystemIdentifier() <em>System Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemIdentifier() <em>System Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String systemIdentifier = SYSTEM_IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPublicIdentifier() <em>Public Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLIC_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublicIdentifier() <em>Public Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String publicIdentifier = PUBLIC_IDENTIFIER_EDEFAULT;

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
	protected XSDNotationDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XsdPackage.Literals.XSD_NOTATION_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSystemIdentifier() {
		return systemIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemIdentifier(String newSystemIdentifier) {
		String oldSystemIdentifier = systemIdentifier;
		systemIdentifier = newSystemIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_NOTATION_DECLARATION__SYSTEM_IDENTIFIER, oldSystemIdentifier, systemIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPublicIdentifier() {
		return publicIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublicIdentifier(String newPublicIdentifier) {
		String oldPublicIdentifier = publicIdentifier;
		publicIdentifier = newPublicIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_NOTATION_DECLARATION__PUBLIC_IDENTIFIER, oldPublicIdentifier, publicIdentifier));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_NOTATION_DECLARATION__ANNOTATION, oldAnnotation, newAnnotation);
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
				msgs = ((InternalEObject)annotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XsdPackage.XSD_NOTATION_DECLARATION__ANNOTATION, null, msgs);
			if (newAnnotation != null)
				msgs = ((InternalEObject)newAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XsdPackage.XSD_NOTATION_DECLARATION__ANNOTATION, null, msgs);
			msgs = basicSetAnnotation(newAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_NOTATION_DECLARATION__ANNOTATION, newAnnotation, newAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XsdPackage.XSD_NOTATION_DECLARATION__ANNOTATION:
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
			case XsdPackage.XSD_NOTATION_DECLARATION__SYSTEM_IDENTIFIER:
				return getSystemIdentifier();
			case XsdPackage.XSD_NOTATION_DECLARATION__PUBLIC_IDENTIFIER:
				return getPublicIdentifier();
			case XsdPackage.XSD_NOTATION_DECLARATION__ANNOTATION:
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
			case XsdPackage.XSD_NOTATION_DECLARATION__SYSTEM_IDENTIFIER:
				setSystemIdentifier((String)newValue);
				return;
			case XsdPackage.XSD_NOTATION_DECLARATION__PUBLIC_IDENTIFIER:
				setPublicIdentifier((String)newValue);
				return;
			case XsdPackage.XSD_NOTATION_DECLARATION__ANNOTATION:
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
			case XsdPackage.XSD_NOTATION_DECLARATION__SYSTEM_IDENTIFIER:
				setSystemIdentifier(SYSTEM_IDENTIFIER_EDEFAULT);
				return;
			case XsdPackage.XSD_NOTATION_DECLARATION__PUBLIC_IDENTIFIER:
				setPublicIdentifier(PUBLIC_IDENTIFIER_EDEFAULT);
				return;
			case XsdPackage.XSD_NOTATION_DECLARATION__ANNOTATION:
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
			case XsdPackage.XSD_NOTATION_DECLARATION__SYSTEM_IDENTIFIER:
				return SYSTEM_IDENTIFIER_EDEFAULT == null ? systemIdentifier != null : !SYSTEM_IDENTIFIER_EDEFAULT.equals(systemIdentifier);
			case XsdPackage.XSD_NOTATION_DECLARATION__PUBLIC_IDENTIFIER:
				return PUBLIC_IDENTIFIER_EDEFAULT == null ? publicIdentifier != null : !PUBLIC_IDENTIFIER_EDEFAULT.equals(publicIdentifier);
			case XsdPackage.XSD_NOTATION_DECLARATION__ANNOTATION:
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
		result.append(" (systemIdentifier: ");
		result.append(systemIdentifier);
		result.append(", publicIdentifier: ");
		result.append(publicIdentifier);
		result.append(')');
		return result.toString();
	}

} //XSDNotationDeclarationImpl
