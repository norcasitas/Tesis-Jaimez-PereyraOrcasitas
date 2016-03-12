/**
 */
package tesis.wsdl_ecore.wsdl.impl;

import java.lang.reflect.InvocationTargetException;

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

import tesis.wsdl_ecore.wsdl.Binding;
import tesis.wsdl_ecore.wsdl.BindingOperation;
import tesis.wsdl_ecore.wsdl.PortType;
import tesis.wsdl_ecore.wsdl.WsdlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tesis.wsdl_ecore.wsdl.impl.BindingImpl#getQName <em>QName</em>}</li>
 *   <li>{@link tesis.wsdl_ecore.wsdl.impl.BindingImpl#isUndefined <em>Undefined</em>}</li>
 *   <li>{@link tesis.wsdl_ecore.wsdl.impl.BindingImpl#getEPortType <em>EPort Type</em>}</li>
 *   <li>{@link tesis.wsdl_ecore.wsdl.impl.BindingImpl#getEBindingOperations <em>EBinding Operations</em>}</li>
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
	protected EList<BindingOperation> eBindingOperations;

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
	@Override
	protected EClass eStaticClass() {
		return WsdlPackage.Literals.BINDING;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WsdlPackage.BINDING__QNAME, oldQName, qName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WsdlPackage.BINDING__UNDEFINED, oldUndefined, undefined));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortType getEPortType() {
		if (ePortType != null && ePortType.eIsProxy()) {
			InternalEObject oldEPortType = (InternalEObject)ePortType;
			ePortType = (PortType)eResolveProxy(oldEPortType);
			if (ePortType != oldEPortType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WsdlPackage.BINDING__EPORT_TYPE, oldEPortType, ePortType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WsdlPackage.BINDING__EPORT_TYPE, oldEPortType, ePortType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BindingOperation> getEBindingOperations() {
		if (eBindingOperations == null) {
			eBindingOperations = new EObjectContainmentEList<BindingOperation>(BindingOperation.class, this, WsdlPackage.BINDING__EBINDING_OPERATIONS);
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WsdlPackage.BINDING__EBINDING_OPERATIONS:
				return ((InternalEList<?>)getEBindingOperations()).basicRemove(otherEnd, msgs);
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
			case WsdlPackage.BINDING__QNAME:
				return getQName();
			case WsdlPackage.BINDING__UNDEFINED:
				return isUndefined();
			case WsdlPackage.BINDING__EPORT_TYPE:
				if (resolve) return getEPortType();
				return basicGetEPortType();
			case WsdlPackage.BINDING__EBINDING_OPERATIONS:
				return getEBindingOperations();
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
			case WsdlPackage.BINDING__QNAME:
				setQName((QName)newValue);
				return;
			case WsdlPackage.BINDING__UNDEFINED:
				setUndefined((Boolean)newValue);
				return;
			case WsdlPackage.BINDING__EPORT_TYPE:
				setEPortType((PortType)newValue);
				return;
			case WsdlPackage.BINDING__EBINDING_OPERATIONS:
				getEBindingOperations().clear();
				getEBindingOperations().addAll((Collection<? extends BindingOperation>)newValue);
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
			case WsdlPackage.BINDING__QNAME:
				setQName(QNAME_EDEFAULT);
				return;
			case WsdlPackage.BINDING__UNDEFINED:
				setUndefined(UNDEFINED_EDEFAULT);
				return;
			case WsdlPackage.BINDING__EPORT_TYPE:
				setEPortType((PortType)null);
				return;
			case WsdlPackage.BINDING__EBINDING_OPERATIONS:
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
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WsdlPackage.BINDING__QNAME:
				return QNAME_EDEFAULT == null ? qName != null : !QNAME_EDEFAULT.equals(qName);
			case WsdlPackage.BINDING__UNDEFINED:
				return undefined != UNDEFINED_EDEFAULT;
			case WsdlPackage.BINDING__EPORT_TYPE:
				return ePortType != null;
			case WsdlPackage.BINDING__EBINDING_OPERATIONS:
				return eBindingOperations != null && !eBindingOperations.isEmpty();
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
		if (baseClass == javax.wsdl.Binding.class) {
			switch (baseOperationID) {
				case WsdlPackage.IBINDING___ADD_BINDING_OPERATION__BINDINGOPERATION: return WsdlPackage.BINDING___ADD_BINDING_OPERATION__BINDINGOPERATION;
				case WsdlPackage.IBINDING___GET_BINDING_OPERATION__STRING_STRING_STRING: return WsdlPackage.BINDING___GET_BINDING_OPERATION__STRING_STRING_STRING;
				case WsdlPackage.IBINDING___GET_BINDING_OPERATIONS: return WsdlPackage.BINDING___GET_BINDING_OPERATIONS;
				case WsdlPackage.IBINDING___GET_PORT_TYPE: return WsdlPackage.BINDING___GET_PORT_TYPE;
				case WsdlPackage.IBINDING___SET_PORT_TYPE__PORTTYPE: return WsdlPackage.BINDING___SET_PORT_TYPE__PORTTYPE;
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
			case WsdlPackage.BINDING___ADD_BINDING_OPERATION__BINDINGOPERATION:
				addBindingOperation((javax.wsdl.BindingOperation)arguments.get(0));
				return null;
			case WsdlPackage.BINDING___GET_BINDING_OPERATION__STRING_STRING_STRING:
				return getBindingOperation((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case WsdlPackage.BINDING___GET_BINDING_OPERATIONS:
				return getBindingOperations();
			case WsdlPackage.BINDING___GET_PORT_TYPE:
				return getPortType();
			case WsdlPackage.BINDING___SET_PORT_TYPE__PORTTYPE:
				setPortType((javax.wsdl.PortType)arguments.get(0));
				return null;
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
