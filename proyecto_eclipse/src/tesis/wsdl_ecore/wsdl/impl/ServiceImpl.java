/**
 */
package tesis.wsdl_ecore.wsdl.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

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

import tesis.wsdl_ecore.wsdl.Port;
import tesis.wsdl_ecore.wsdl.Service;
import tesis.wsdl_ecore.wsdl.WsdlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tesis.wsdl_ecore.wsdl.impl.ServiceImpl#getQName <em>QName</em>}</li>
 *   <li>{@link tesis.wsdl_ecore.wsdl.impl.ServiceImpl#isUndefined <em>Undefined</em>}</li>
 *   <li>{@link tesis.wsdl_ecore.wsdl.impl.ServiceImpl#getEPorts <em>EPorts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceImpl extends ExtensibleElementImpl implements Service {
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
	 * The cached value of the '{@link #getEPorts() <em>EPorts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> ePorts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WsdlPackage.Literals.SERVICE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WsdlPackage.SERVICE__QNAME, oldQName, qName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WsdlPackage.SERVICE__UNDEFINED, oldUndefined, undefined));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getEPorts() {
		if (ePorts == null) {
			ePorts = new EObjectContainmentEList<Port>(Port.class, this, WsdlPackage.SERVICE__EPORTS);
		}
		return ePorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addPort(javax.wsdl.Port port) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map getPorts() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public javax.wsdl.Port getPort(String name) {
		// TODO: implement this method
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
			case WsdlPackage.SERVICE__EPORTS:
				return ((InternalEList<?>)getEPorts()).basicRemove(otherEnd, msgs);
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
			case WsdlPackage.SERVICE__QNAME:
				return getQName();
			case WsdlPackage.SERVICE__UNDEFINED:
				return isUndefined();
			case WsdlPackage.SERVICE__EPORTS:
				return getEPorts();
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
			case WsdlPackage.SERVICE__QNAME:
				setQName((QName)newValue);
				return;
			case WsdlPackage.SERVICE__UNDEFINED:
				setUndefined((Boolean)newValue);
				return;
			case WsdlPackage.SERVICE__EPORTS:
				getEPorts().clear();
				getEPorts().addAll((Collection<? extends Port>)newValue);
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
			case WsdlPackage.SERVICE__QNAME:
				setQName(QNAME_EDEFAULT);
				return;
			case WsdlPackage.SERVICE__UNDEFINED:
				setUndefined(UNDEFINED_EDEFAULT);
				return;
			case WsdlPackage.SERVICE__EPORTS:
				getEPorts().clear();
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
			case WsdlPackage.SERVICE__QNAME:
				return QNAME_EDEFAULT == null ? qName != null : !QNAME_EDEFAULT.equals(qName);
			case WsdlPackage.SERVICE__UNDEFINED:
				return undefined != UNDEFINED_EDEFAULT;
			case WsdlPackage.SERVICE__EPORTS:
				return ePorts != null && !ePorts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == javax.wsdl.Service.class) {
			switch (baseOperationID) {
				case WsdlPackage.ISERVICE___ADD_PORT__PORT: return WsdlPackage.SERVICE___ADD_PORT__PORT;
				case WsdlPackage.ISERVICE___GET_PORTS: return WsdlPackage.SERVICE___GET_PORTS;
				case WsdlPackage.ISERVICE___GET_PORT__STRING: return WsdlPackage.SERVICE___GET_PORT__STRING;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case WsdlPackage.SERVICE___ADD_PORT__PORT:
				addPort((javax.wsdl.Port)arguments.get(0));
				return null;
			case WsdlPackage.SERVICE___GET_PORTS:
				return getPorts();
			case WsdlPackage.SERVICE___GET_PORT__STRING:
				return getPort((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (qName: ");
		result.append(qName);
		result.append(", undefined: ");
		result.append(undefined);
		result.append(')');
		return result.toString();
	}

	public ExtensibilityElement removeExtensibilityElement(ExtensibilityElement arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public javax.wsdl.Port removePort(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}



} //ServiceImpl
