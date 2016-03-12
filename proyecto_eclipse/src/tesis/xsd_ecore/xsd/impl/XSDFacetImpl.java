/**
 */
package tesis.xsd_ecore.xsd.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tesis.xsd_ecore.xsd.XSDAnnotation;
import tesis.xsd_ecore.xsd.XSDFacet;
import tesis.xsd_ecore.xsd.XSDSimpleTypeDefinition;
import tesis.xsd_ecore.xsd.XsdPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XSD Facet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDFacetImpl#getLexicalValue <em>Lexical Value</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDFacetImpl#getFacetName <em>Facet Name</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDFacetImpl#getEffectiveValue <em>Effective Value</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDFacetImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDFacetImpl#getSimpleTypeDefinition <em>Simple Type Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class XSDFacetImpl extends XSDComponentImpl implements XSDFacet {
	/**
	 * The default value of the '{@link #getLexicalValue() <em>Lexical Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLexicalValue()
	 * @generated
	 * @ordered
	 */
	protected static final String LEXICAL_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLexicalValue() <em>Lexical Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLexicalValue()
	 * @generated
	 * @ordered
	 */
	protected String lexicalValue = LEXICAL_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFacetName() <em>Facet Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacetName()
	 * @generated
	 * @ordered
	 */
	protected static final String FACET_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getEffectiveValue() <em>Effective Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveValue()
	 * @generated
	 * @ordered
	 */
	protected static final Object EFFECTIVE_VALUE_EDEFAULT = null;

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
	protected XSDFacetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XsdPackage.Literals.XSD_FACET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLexicalValue() {
		return lexicalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLexicalValue(String newLexicalValue) {
		String oldLexicalValue = lexicalValue;
		lexicalValue = newLexicalValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_FACET__LEXICAL_VALUE, oldLexicalValue, lexicalValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFacetName() {
		// TODO: implement this method to return the 'Facet Name' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getEffectiveValue() {
		// TODO: implement this method to return the 'Effective Value' attribute
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_FACET__ANNOTATION, oldAnnotation, newAnnotation);
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
				msgs = ((InternalEObject)annotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XsdPackage.XSD_FACET__ANNOTATION, null, msgs);
			if (newAnnotation != null)
				msgs = ((InternalEObject)newAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XsdPackage.XSD_FACET__ANNOTATION, null, msgs);
			msgs = basicSetAnnotation(newAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_FACET__ANNOTATION, newAnnotation, newAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDSimpleTypeDefinition getSimpleTypeDefinition() {
		// TODO: implement this method to return the 'Simple Type Definition' reference
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
			case XsdPackage.XSD_FACET__ANNOTATION:
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
			case XsdPackage.XSD_FACET__LEXICAL_VALUE:
				return getLexicalValue();
			case XsdPackage.XSD_FACET__FACET_NAME:
				return getFacetName();
			case XsdPackage.XSD_FACET__EFFECTIVE_VALUE:
				return getEffectiveValue();
			case XsdPackage.XSD_FACET__ANNOTATION:
				return getAnnotation();
			case XsdPackage.XSD_FACET__SIMPLE_TYPE_DEFINITION:
				return getSimpleTypeDefinition();
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
			case XsdPackage.XSD_FACET__LEXICAL_VALUE:
				setLexicalValue((String)newValue);
				return;
			case XsdPackage.XSD_FACET__ANNOTATION:
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
			case XsdPackage.XSD_FACET__LEXICAL_VALUE:
				setLexicalValue(LEXICAL_VALUE_EDEFAULT);
				return;
			case XsdPackage.XSD_FACET__ANNOTATION:
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
			case XsdPackage.XSD_FACET__LEXICAL_VALUE:
				return LEXICAL_VALUE_EDEFAULT == null ? lexicalValue != null : !LEXICAL_VALUE_EDEFAULT.equals(lexicalValue);
			case XsdPackage.XSD_FACET__FACET_NAME:
				return FACET_NAME_EDEFAULT == null ? getFacetName() != null : !FACET_NAME_EDEFAULT.equals(getFacetName());
			case XsdPackage.XSD_FACET__EFFECTIVE_VALUE:
				return EFFECTIVE_VALUE_EDEFAULT == null ? getEffectiveValue() != null : !EFFECTIVE_VALUE_EDEFAULT.equals(getEffectiveValue());
			case XsdPackage.XSD_FACET__ANNOTATION:
				return annotation != null;
			case XsdPackage.XSD_FACET__SIMPLE_TYPE_DEFINITION:
				return getSimpleTypeDefinition() != null;
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
		result.append(" (lexicalValue: ");
		result.append(lexicalValue);
		result.append(')');
		return result.toString();
	}

} //XSDFacetImpl
