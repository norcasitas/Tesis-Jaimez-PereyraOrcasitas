/**
 */
package tesis.xsd_ecore.xsd.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tesis.xsd_ecore.xsd.XSDAttributeDeclaration;
import tesis.xsd_ecore.xsd.XSDAttributeUse;
import tesis.xsd_ecore.xsd.XSDAttributeUseCategory;
import tesis.xsd_ecore.xsd.XSDConstraint;
import tesis.xsd_ecore.xsd.XsdPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XSD Attribute Use</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDAttributeUseImpl#isRequired <em>Required</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDAttributeUseImpl#getValue <em>Value</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDAttributeUseImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDAttributeUseImpl#getUse <em>Use</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDAttributeUseImpl#getLexicalValue <em>Lexical Value</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDAttributeUseImpl#getAttributeDeclaration <em>Attribute Declaration</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDAttributeUseImpl#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XSDAttributeUseImpl extends XSDComponentImpl implements XSDAttributeUse {
	/**
	 * The default value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected boolean required = REQUIRED_EDEFAULT;

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
	 * The default value of the '{@link #getUse() <em>Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUse()
	 * @generated
	 * @ordered
	 */
	protected static final XSDAttributeUseCategory USE_EDEFAULT = XSDAttributeUseCategory.OPTIONAL;

	/**
	 * The cached value of the '{@link #getUse() <em>Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUse()
	 * @generated
	 * @ordered
	 */
	protected XSDAttributeUseCategory use = USE_EDEFAULT;

	/**
	 * This is true if the Use attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean useESet;

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
	 * The cached value of the '{@link #getAttributeDeclaration() <em>Attribute Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeDeclaration()
	 * @generated
	 * @ordered
	 */
	protected XSDAttributeDeclaration attributeDeclaration;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected XSDAttributeDeclaration content;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XSDAttributeUseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XsdPackage.Literals.XSD_ATTRIBUTE_USE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRequired() {
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequired(boolean newRequired) {
		boolean oldRequired = required;
		required = newRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_ATTRIBUTE_USE__REQUIRED, oldRequired, required));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_ATTRIBUTE_USE__VALUE, oldValue, value));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_ATTRIBUTE_USE__CONSTRAINT, oldConstraint, constraint, !oldConstraintESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, XsdPackage.XSD_ATTRIBUTE_USE__CONSTRAINT, oldConstraint, CONSTRAINT_EDEFAULT, oldConstraintESet));
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
	public XSDAttributeUseCategory getUse() {
		return use;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUse(XSDAttributeUseCategory newUse) {
		XSDAttributeUseCategory oldUse = use;
		use = newUse == null ? USE_EDEFAULT : newUse;
		boolean oldUseESet = useESet;
		useESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_ATTRIBUTE_USE__USE, oldUse, use, !oldUseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUse() {
		XSDAttributeUseCategory oldUse = use;
		boolean oldUseESet = useESet;
		use = USE_EDEFAULT;
		useESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XsdPackage.XSD_ATTRIBUTE_USE__USE, oldUse, USE_EDEFAULT, oldUseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUse() {
		return useESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_ATTRIBUTE_USE__LEXICAL_VALUE, oldLexicalValue, lexicalValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDAttributeDeclaration getAttributeDeclaration() {
		return attributeDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeDeclaration(XSDAttributeDeclaration newAttributeDeclaration) {
		XSDAttributeDeclaration oldAttributeDeclaration = attributeDeclaration;
		attributeDeclaration = newAttributeDeclaration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_ATTRIBUTE_USE__ATTRIBUTE_DECLARATION, oldAttributeDeclaration, attributeDeclaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDAttributeDeclaration getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContent(XSDAttributeDeclaration newContent, NotificationChain msgs) {
		XSDAttributeDeclaration oldContent = content;
		content = newContent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_ATTRIBUTE_USE__CONTENT, oldContent, newContent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(XSDAttributeDeclaration newContent) {
		if (newContent != content) {
			NotificationChain msgs = null;
			if (content != null)
				msgs = ((InternalEObject)content).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XsdPackage.XSD_ATTRIBUTE_USE__CONTENT, null, msgs);
			if (newContent != null)
				msgs = ((InternalEObject)newContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XsdPackage.XSD_ATTRIBUTE_USE__CONTENT, null, msgs);
			msgs = basicSetContent(newContent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_ATTRIBUTE_USE__CONTENT, newContent, newContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XsdPackage.XSD_ATTRIBUTE_USE__CONTENT:
				return basicSetContent(null, msgs);
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
			case XsdPackage.XSD_ATTRIBUTE_USE__REQUIRED:
				return isRequired();
			case XsdPackage.XSD_ATTRIBUTE_USE__VALUE:
				return getValue();
			case XsdPackage.XSD_ATTRIBUTE_USE__CONSTRAINT:
				return getConstraint();
			case XsdPackage.XSD_ATTRIBUTE_USE__USE:
				return getUse();
			case XsdPackage.XSD_ATTRIBUTE_USE__LEXICAL_VALUE:
				return getLexicalValue();
			case XsdPackage.XSD_ATTRIBUTE_USE__ATTRIBUTE_DECLARATION:
				return getAttributeDeclaration();
			case XsdPackage.XSD_ATTRIBUTE_USE__CONTENT:
				return getContent();
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
			case XsdPackage.XSD_ATTRIBUTE_USE__REQUIRED:
				setRequired((Boolean)newValue);
				return;
			case XsdPackage.XSD_ATTRIBUTE_USE__VALUE:
				setValue(newValue);
				return;
			case XsdPackage.XSD_ATTRIBUTE_USE__CONSTRAINT:
				setConstraint((XSDConstraint)newValue);
				return;
			case XsdPackage.XSD_ATTRIBUTE_USE__USE:
				setUse((XSDAttributeUseCategory)newValue);
				return;
			case XsdPackage.XSD_ATTRIBUTE_USE__LEXICAL_VALUE:
				setLexicalValue((String)newValue);
				return;
			case XsdPackage.XSD_ATTRIBUTE_USE__ATTRIBUTE_DECLARATION:
				setAttributeDeclaration((XSDAttributeDeclaration)newValue);
				return;
			case XsdPackage.XSD_ATTRIBUTE_USE__CONTENT:
				setContent((XSDAttributeDeclaration)newValue);
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
			case XsdPackage.XSD_ATTRIBUTE_USE__REQUIRED:
				setRequired(REQUIRED_EDEFAULT);
				return;
			case XsdPackage.XSD_ATTRIBUTE_USE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case XsdPackage.XSD_ATTRIBUTE_USE__CONSTRAINT:
				unsetConstraint();
				return;
			case XsdPackage.XSD_ATTRIBUTE_USE__USE:
				unsetUse();
				return;
			case XsdPackage.XSD_ATTRIBUTE_USE__LEXICAL_VALUE:
				setLexicalValue(LEXICAL_VALUE_EDEFAULT);
				return;
			case XsdPackage.XSD_ATTRIBUTE_USE__ATTRIBUTE_DECLARATION:
				setAttributeDeclaration((XSDAttributeDeclaration)null);
				return;
			case XsdPackage.XSD_ATTRIBUTE_USE__CONTENT:
				setContent((XSDAttributeDeclaration)null);
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
			case XsdPackage.XSD_ATTRIBUTE_USE__REQUIRED:
				return required != REQUIRED_EDEFAULT;
			case XsdPackage.XSD_ATTRIBUTE_USE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case XsdPackage.XSD_ATTRIBUTE_USE__CONSTRAINT:
				return isSetConstraint();
			case XsdPackage.XSD_ATTRIBUTE_USE__USE:
				return isSetUse();
			case XsdPackage.XSD_ATTRIBUTE_USE__LEXICAL_VALUE:
				return LEXICAL_VALUE_EDEFAULT == null ? lexicalValue != null : !LEXICAL_VALUE_EDEFAULT.equals(lexicalValue);
			case XsdPackage.XSD_ATTRIBUTE_USE__ATTRIBUTE_DECLARATION:
				return attributeDeclaration != null;
			case XsdPackage.XSD_ATTRIBUTE_USE__CONTENT:
				return content != null;
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
		result.append(" (required: ");
		result.append(required);
		result.append(", value: ");
		result.append(value);
		result.append(", constraint: ");
		if (constraintESet) result.append(constraint); else result.append("<unset>");
		result.append(", use: ");
		if (useESet) result.append(use); else result.append("<unset>");
		result.append(", lexicalValue: ");
		result.append(lexicalValue);
		result.append(')');
		return result.toString();
	}

} //XSDAttributeUseImpl
