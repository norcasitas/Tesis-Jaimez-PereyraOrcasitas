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

import tesis.wsdl_ecore.wsdl.Operation;
import tesis.wsdl_ecore.wsdl.PortType;
import tesis.wsdl_ecore.wsdl.WsdlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tesis.wsdl_ecore.wsdl.impl.PortTypeImpl#getQName <em>QName</em>}</li>
 *   <li>{@link tesis.wsdl_ecore.wsdl.impl.PortTypeImpl#isUndefined <em>Undefined</em>}</li>
 *   <li>{@link tesis.wsdl_ecore.wsdl.impl.PortTypeImpl#getEOperations <em>EOperations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortTypeImpl extends ExtensibleElementImpl implements PortType {
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
	 * The cached value of the '{@link #getEOperations() <em>EOperations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> eOperations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WsdlPackage.Literals.PORT_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WsdlPackage.PORT_TYPE__QNAME, oldQName, qName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WsdlPackage.PORT_TYPE__UNDEFINED, oldUndefined, undefined));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getEOperations() {
		if (eOperations == null) {
			eOperations = new EObjectContainmentEList<Operation>(Operation.class, this, WsdlPackage.PORT_TYPE__EOPERATIONS);
		}
		return eOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addOperation(javax.wsdl.Operation operation) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public javax.wsdl.Operation getOperation(String name, String inputName, String outputName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOperations() {
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
			case WsdlPackage.PORT_TYPE__EOPERATIONS:
				return ((InternalEList<?>)getEOperations()).basicRemove(otherEnd, msgs);
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
			case WsdlPackage.PORT_TYPE__QNAME:
				return getQName();
			case WsdlPackage.PORT_TYPE__UNDEFINED:
				return isUndefined();
			case WsdlPackage.PORT_TYPE__EOPERATIONS:
				return getEOperations();
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
			case WsdlPackage.PORT_TYPE__QNAME:
				setQName((QName)newValue);
				return;
			case WsdlPackage.PORT_TYPE__UNDEFINED:
				setUndefined((Boolean)newValue);
				return;
			case WsdlPackage.PORT_TYPE__EOPERATIONS:
				getEOperations().clear();
				getEOperations().addAll((Collection<? extends Operation>)newValue);
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
			case WsdlPackage.PORT_TYPE__QNAME:
				setQName(QNAME_EDEFAULT);
				return;
			case WsdlPackage.PORT_TYPE__UNDEFINED:
				setUndefined(UNDEFINED_EDEFAULT);
				return;
			case WsdlPackage.PORT_TYPE__EOPERATIONS:
				getEOperations().clear();
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
			case WsdlPackage.PORT_TYPE__QNAME:
				return QNAME_EDEFAULT == null ? qName != null : !QNAME_EDEFAULT.equals(qName);
			case WsdlPackage.PORT_TYPE__UNDEFINED:
				return undefined != UNDEFINED_EDEFAULT;
			case WsdlPackage.PORT_TYPE__EOPERATIONS:
				return eOperations != null && !eOperations.isEmpty();
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
		if (baseClass == javax.wsdl.PortType.class) {
			switch (baseOperationID) {
				case WsdlPackage.IPORT_TYPE___ADD_OPERATION__OPERATION: return WsdlPackage.PORT_TYPE___ADD_OPERATION__OPERATION;
				case WsdlPackage.IPORT_TYPE___GET_OPERATION__STRING_STRING_STRING: return WsdlPackage.PORT_TYPE___GET_OPERATION__STRING_STRING_STRING;
				case WsdlPackage.IPORT_TYPE___GET_OPERATIONS: return WsdlPackage.PORT_TYPE___GET_OPERATIONS;
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
			case WsdlPackage.PORT_TYPE___ADD_OPERATION__OPERATION:
				addOperation((javax.wsdl.Operation)arguments.get(0));
				return null;
			case WsdlPackage.PORT_TYPE___GET_OPERATION__STRING_STRING_STRING:
				return getOperation((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case WsdlPackage.PORT_TYPE___GET_OPERATIONS:
				return getOperations();
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

	public javax.wsdl.Operation removeOperation(String arg0, String arg1, String arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	

} //PortTypeImpl
