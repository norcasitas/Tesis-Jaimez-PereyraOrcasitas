/**
 */
package tesis.xsd_ecore.xsd.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tesis.xsd_ecore.xsd.XSDNamedComponent;
import tesis.xsd_ecore.xsd.XsdPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XSD Named Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDNamedComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDNamedComponentImpl#getTargetNamespace <em>Target Namespace</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDNamedComponentImpl#getAliasName <em>Alias Name</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDNamedComponentImpl#getURI <em>URI</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDNamedComponentImpl#getAliasURI <em>Alias URI</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDNamedComponentImpl#getQName <em>QName</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class XSDNamedComponentImpl extends XSDComponentImpl implements XSDNamedComponent {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetNamespace() <em>Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetNamespace() <em>Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetNamespace()
	 * @generated
	 * @ordered
	 */
	protected String targetNamespace = TARGET_NAMESPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAliasName() <em>Alias Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAliasName()
	 * @generated
	 * @ordered
	 */
	protected static final String ALIAS_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getURI() <em>URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURI()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAliasURI() <em>Alias URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAliasURI()
	 * @generated
	 * @ordered
	 */
	protected static final String ALIAS_URI_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getQName() <em>QName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQName()
	 * @generated
	 * @ordered
	 */
	protected static final String QNAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XSDNamedComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XsdPackage.Literals.XSD_NAMED_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_NAMED_COMPONENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetNamespace() {
		return targetNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetNamespace(String newTargetNamespace) {
		String oldTargetNamespace = targetNamespace;
		targetNamespace = newTargetNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_NAMED_COMPONENT__TARGET_NAMESPACE, oldTargetNamespace, targetNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAliasName() {
		// TODO: implement this method to return the 'Alias Name' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getURI() {
		// TODO: implement this method to return the 'URI' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAliasURI() {
		// TODO: implement this method to return the 'Alias URI' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQName() {
		// TODO: implement this method to return the 'QName' attribute
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
			case XsdPackage.XSD_NAMED_COMPONENT__NAME:
				return getName();
			case XsdPackage.XSD_NAMED_COMPONENT__TARGET_NAMESPACE:
				return getTargetNamespace();
			case XsdPackage.XSD_NAMED_COMPONENT__ALIAS_NAME:
				return getAliasName();
			case XsdPackage.XSD_NAMED_COMPONENT__URI:
				return getURI();
			case XsdPackage.XSD_NAMED_COMPONENT__ALIAS_URI:
				return getAliasURI();
			case XsdPackage.XSD_NAMED_COMPONENT__QNAME:
				return getQName();
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
			case XsdPackage.XSD_NAMED_COMPONENT__NAME:
				setName((String)newValue);
				return;
			case XsdPackage.XSD_NAMED_COMPONENT__TARGET_NAMESPACE:
				setTargetNamespace((String)newValue);
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
			case XsdPackage.XSD_NAMED_COMPONENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XsdPackage.XSD_NAMED_COMPONENT__TARGET_NAMESPACE:
				setTargetNamespace(TARGET_NAMESPACE_EDEFAULT);
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
			case XsdPackage.XSD_NAMED_COMPONENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XsdPackage.XSD_NAMED_COMPONENT__TARGET_NAMESPACE:
				return TARGET_NAMESPACE_EDEFAULT == null ? targetNamespace != null : !TARGET_NAMESPACE_EDEFAULT.equals(targetNamespace);
			case XsdPackage.XSD_NAMED_COMPONENT__ALIAS_NAME:
				return ALIAS_NAME_EDEFAULT == null ? getAliasName() != null : !ALIAS_NAME_EDEFAULT.equals(getAliasName());
			case XsdPackage.XSD_NAMED_COMPONENT__URI:
				return URI_EDEFAULT == null ? getURI() != null : !URI_EDEFAULT.equals(getURI());
			case XsdPackage.XSD_NAMED_COMPONENT__ALIAS_URI:
				return ALIAS_URI_EDEFAULT == null ? getAliasURI() != null : !ALIAS_URI_EDEFAULT.equals(getAliasURI());
			case XsdPackage.XSD_NAMED_COMPONENT__QNAME:
				return QNAME_EDEFAULT == null ? getQName() != null : !QNAME_EDEFAULT.equals(getQName());
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
		result.append(" (name: ");
		result.append(name);
		result.append(", targetNamespace: ");
		result.append(targetNamespace);
		result.append(')');
		return result.toString();
	}

} //XSDNamedComponentImpl
