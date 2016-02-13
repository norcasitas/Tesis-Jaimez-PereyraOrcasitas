/**
 */
package tesis.unrc.wsdl.wsdl.internal.impl;

import java.util.Collection;
import java.util.List;

import javax.wsdl.extensions.ExtensibilityElement;
import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tesis.unrc.wsdl.wsdl.Binding;
import tesis.unrc.wsdl.wsdl.BindingOperation;
import tesis.unrc.wsdl.wsdl.PortType;
import tesis.unrc.wsdl.wsdl.WSDLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tesis.unrc.wsdl.wsdl.internal.impl.BindingImpl#getQName <em>QName</em>}</li>
 *   <li>{@link tesis.unrc.wsdl.wsdl.internal.impl.BindingImpl#isUndefined <em>Undefined</em>}</li>
 *   <li>{@link tesis.unrc.wsdl.wsdl.internal.impl.BindingImpl#getEPortType <em>EPort Type</em>}</li>
 *   <li>{@link tesis.unrc.wsdl.wsdl.internal.impl.BindingImpl#getEBindingOperations <em>EBinding Operations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BindingImpl extends ExtensibleElementImpl implements Binding {
	/**
	 * The default value of the '{@link #getQName() <em>QName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQName()
	 * @generated
	 * @ordered
	 */
	protected static final QName QNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQName() <em>QName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQName()
	 * @generated
	 * @ordered
	 */
	protected QName qName = QNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isUndefined() <em>Undefined</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUndefined()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNDEFINED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUndefined() <em>Undefined</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUndefined()
	 * @generated
	 * @ordered
	 */
	protected boolean undefined = UNDEFINED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEPortType() <em>EPort Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEPortType()
	 * @generated
	 * @ordered
	 */
	protected PortType ePortType;

	/**
	 * The cached value of the '{@link #getEBindingOperations() <em>EBinding Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEBindingOperations()
	 * @generated
	 * @ordered
	 */
	protected EList eBindingOperations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return WSDLPackage.Literals.BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName getQName() {
		return qName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQName(QName newQName) {
		QName oldQName = qName;
		qName = newQName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDLPackage.BINDING__QNAME, oldQName, qName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUndefined() {
		return undefined;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUndefined(boolean newUndefined) {
		boolean oldUndefined = undefined;
		undefined = newUndefined;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDLPackage.BINDING__UNDEFINED, oldUndefined,
					undefined));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortType getEPortType() {
		if (ePortType != null && ePortType.eIsProxy()) {
			InternalEObject oldEPortType = (InternalEObject) ePortType;
			ePortType = (PortType) eResolveProxy(oldEPortType);
			if (ePortType != oldEPortType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WSDLPackage.BINDING__EPORT_TYPE,
							oldEPortType, ePortType));
			}
		}
		return ePortType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortType basicGetEPortType() {
		return ePortType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEPortType(PortType newEPortType) {
		PortType oldEPortType = ePortType;
		ePortType = newEPortType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDLPackage.BINDING__EPORT_TYPE, oldEPortType,
					ePortType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEBindingOperations() {
		if (eBindingOperations == null) {
			eBindingOperations = new EObjectContainmentEList(BindingOperation.class, this,
					WSDLPackage.BINDING__EBINDING_OPERATIONS);
		}
		return eBindingOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addBindingOperation(javax.wsdl.BindingOperation bindingOperation) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public javax.wsdl.BindingOperation getBindingOperation(String name, String inputName, String outputName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getBindingOperations() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public javax.wsdl.PortType getPortType() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortType(javax.wsdl.PortType portType) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WSDLPackage.BINDING__EBINDING_OPERATIONS:
			return ((InternalEList) getEBindingOperations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WSDLPackage.BINDING__QNAME:
			return getQName();
		case WSDLPackage.BINDING__UNDEFINED:
			return isUndefined() ? Boolean.TRUE : Boolean.FALSE;
		case WSDLPackage.BINDING__EPORT_TYPE:
			if (resolve)
				return getEPortType();
			return basicGetEPortType();
		case WSDLPackage.BINDING__EBINDING_OPERATIONS:
			return getEBindingOperations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case WSDLPackage.BINDING__QNAME:
			setQName((QName) newValue);
			return;
		case WSDLPackage.BINDING__UNDEFINED:
			setUndefined(((Boolean) newValue).booleanValue());
			return;
		case WSDLPackage.BINDING__EPORT_TYPE:
			setEPortType((PortType) newValue);
			return;
		case WSDLPackage.BINDING__EBINDING_OPERATIONS:
			getEBindingOperations().clear();
			getEBindingOperations().addAll((Collection) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
		case WSDLPackage.BINDING__QNAME:
			setQName(QNAME_EDEFAULT);
			return;
		case WSDLPackage.BINDING__UNDEFINED:
			setUndefined(UNDEFINED_EDEFAULT);
			return;
		case WSDLPackage.BINDING__EPORT_TYPE:
			setEPortType((PortType) null);
			return;
		case WSDLPackage.BINDING__EBINDING_OPERATIONS:
			getEBindingOperations().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case WSDLPackage.BINDING__QNAME:
			return QNAME_EDEFAULT == null ? qName != null : !QNAME_EDEFAULT.equals(qName);
		case WSDLPackage.BINDING__UNDEFINED:
			return undefined != UNDEFINED_EDEFAULT;
		case WSDLPackage.BINDING__EPORT_TYPE:
			return ePortType != null;
		case WSDLPackage.BINDING__EBINDING_OPERATIONS:
			return eBindingOperations != null && !eBindingOperations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (qName: "); //$NON-NLS-1$
		result.append(qName);
		result.append(", undefined: "); //$NON-NLS-1$
		result.append(undefined);
		result.append(')');
		return result.toString();
	}

	@Override
	public ExtensibilityElement removeExtensibilityElement(ExtensibilityElement arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public javax.wsdl.BindingOperation removeBindingOperation(String arg0, String arg1, String arg2) {
		// TODO Auto-generated method stub
		return null;
	}

} //BindingImpl
