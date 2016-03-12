/**
 */
package tesis.xsd_ecore.xsd.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tesis.xsd_ecore.xsd.XSDConstraint;
import tesis.xsd_ecore.xsd.XSDFeature;
import tesis.xsd_ecore.xsd.XSDForm;
import tesis.xsd_ecore.xsd.XSDScope;
import tesis.xsd_ecore.xsd.XSDTypeDefinition;
import tesis.xsd_ecore.xsd.XsdPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XSD Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDFeatureImpl#getValue <em>Value</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDFeatureImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDFeatureImpl#getForm <em>Form</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDFeatureImpl#getLexicalValue <em>Lexical Value</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDFeatureImpl#isGlobal <em>Global</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDFeatureImpl#isFeatureReference <em>Feature Reference</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDFeatureImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDFeatureImpl#getResolvedFeature <em>Resolved Feature</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDFeatureImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class XSDFeatureImpl extends XSDNamedComponentImpl implements XSDFeature {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final Object VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Object value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstraint() <em>Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected static final XSDConstraint CONSTRAINT_EDEFAULT = XSDConstraint.DEFAULT;

	/**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected XSDConstraint constraint = CONSTRAINT_EDEFAULT;

	/**
	 * This is true if the Constraint attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean constraintESet;

	/**
	 * The default value of the '{@link #getForm() <em>Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForm()
	 * @generated
	 * @ordered
	 */
	protected static final XSDForm FORM_EDEFAULT = XSDForm.QUALIFIED;

	/**
	 * The cached value of the '{@link #getForm() <em>Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForm()
	 * @generated
	 * @ordered
	 */
	protected XSDForm form = FORM_EDEFAULT;

	/**
	 * This is true if the Form attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean formESet;

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
	 * The default value of the '{@link #isGlobal() <em>Global</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGlobal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GLOBAL_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isFeatureReference() <em>Feature Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFeatureReference()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FEATURE_REFERENCE_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XSDFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XsdPackage.Literals.XSD_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Object newValue) {
		Object oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_FEATURE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDConstraint getConstraint() {
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraint(XSDConstraint newConstraint) {
		XSDConstraint oldConstraint = constraint;
		constraint = newConstraint == null ? CONSTRAINT_EDEFAULT : newConstraint;
		boolean oldConstraintESet = constraintESet;
		constraintESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_FEATURE__CONSTRAINT, oldConstraint, constraint, !oldConstraintESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConstraint() {
		XSDConstraint oldConstraint = constraint;
		boolean oldConstraintESet = constraintESet;
		constraint = CONSTRAINT_EDEFAULT;
		constraintESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XsdPackage.XSD_FEATURE__CONSTRAINT, oldConstraint, CONSTRAINT_EDEFAULT, oldConstraintESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConstraint() {
		return constraintESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDForm getForm() {
		return form;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForm(XSDForm newForm) {
		XSDForm oldForm = form;
		form = newForm == null ? FORM_EDEFAULT : newForm;
		boolean oldFormESet = formESet;
		formESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_FEATURE__FORM, oldForm, form, !oldFormESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetForm() {
		XSDForm oldForm = form;
		boolean oldFormESet = formESet;
		form = FORM_EDEFAULT;
		formESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XsdPackage.XSD_FEATURE__FORM, oldForm, FORM_EDEFAULT, oldFormESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetForm() {
		return formESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_FEATURE__LEXICAL_VALUE, oldLexicalValue, lexicalValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGlobal() {
		// TODO: implement this method to return the 'Global' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFeatureReference() {
		// TODO: implement this method to return the 'Feature Reference' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDScope getScope() {
		// TODO: implement this method to return the 'Scope' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDFeature getResolvedFeature() {
		// TODO: implement this method to return the 'Resolved Feature' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDTypeDefinition getType() {
		// TODO: implement this method to return the 'Type' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XsdPackage.XSD_FEATURE__VALUE:
				return getValue();
			case XsdPackage.XSD_FEATURE__CONSTRAINT:
				return getConstraint();
			case XsdPackage.XSD_FEATURE__FORM:
				return getForm();
			case XsdPackage.XSD_FEATURE__LEXICAL_VALUE:
				return getLexicalValue();
			case XsdPackage.XSD_FEATURE__GLOBAL:
				return isGlobal();
			case XsdPackage.XSD_FEATURE__FEATURE_REFERENCE:
				return isFeatureReference();
			case XsdPackage.XSD_FEATURE__SCOPE:
				return getScope();
			case XsdPackage.XSD_FEATURE__RESOLVED_FEATURE:
				return getResolvedFeature();
			case XsdPackage.XSD_FEATURE__TYPE:
				return getType();
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
			case XsdPackage.XSD_FEATURE__VALUE:
				setValue(newValue);
				return;
			case XsdPackage.XSD_FEATURE__CONSTRAINT:
				setConstraint((XSDConstraint)newValue);
				return;
			case XsdPackage.XSD_FEATURE__FORM:
				setForm((XSDForm)newValue);
				return;
			case XsdPackage.XSD_FEATURE__LEXICAL_VALUE:
				setLexicalValue((String)newValue);
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
			case XsdPackage.XSD_FEATURE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case XsdPackage.XSD_FEATURE__CONSTRAINT:
				unsetConstraint();
				return;
			case XsdPackage.XSD_FEATURE__FORM:
				unsetForm();
				return;
			case XsdPackage.XSD_FEATURE__LEXICAL_VALUE:
				setLexicalValue(LEXICAL_VALUE_EDEFAULT);
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
			case XsdPackage.XSD_FEATURE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case XsdPackage.XSD_FEATURE__CONSTRAINT:
				return isSetConstraint();
			case XsdPackage.XSD_FEATURE__FORM:
				return isSetForm();
			case XsdPackage.XSD_FEATURE__LEXICAL_VALUE:
				return LEXICAL_VALUE_EDEFAULT == null ? lexicalValue != null : !LEXICAL_VALUE_EDEFAULT.equals(lexicalValue);
			case XsdPackage.XSD_FEATURE__GLOBAL:
				return isGlobal() != GLOBAL_EDEFAULT;
			case XsdPackage.XSD_FEATURE__FEATURE_REFERENCE:
				return isFeatureReference() != FEATURE_REFERENCE_EDEFAULT;
			case XsdPackage.XSD_FEATURE__SCOPE:
				return getScope() != null;
			case XsdPackage.XSD_FEATURE__RESOLVED_FEATURE:
				return getResolvedFeature() != null;
			case XsdPackage.XSD_FEATURE__TYPE:
				return getType() != null;
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
		result.append(" (value: ");
		result.append(value);
		result.append(", constraint: ");
		if (constraintESet) result.append(constraint); else result.append("<unset>");
		result.append(", form: ");
		if (formESet) result.append(form); else result.append("<unset>");
		result.append(", lexicalValue: ");
		result.append(lexicalValue);
		result.append(')');
		return result.toString();
	}

} //XSDFeatureImpl
