/**
 */
package tesis.wsdl_ecore.wsdl.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.List;
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

import tesis.wsdl_ecore.wsdl.Message;
import tesis.wsdl_ecore.wsdl.Part;
import tesis.wsdl_ecore.wsdl.WsdlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tesis.wsdl_ecore.wsdl.impl.MessageImpl#getQName <em>QName</em>}</li>
 *   <li>{@link tesis.wsdl_ecore.wsdl.impl.MessageImpl#isUndefined <em>Undefined</em>}</li>
 *   <li>{@link tesis.wsdl_ecore.wsdl.impl.MessageImpl#getEParts <em>EParts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageImpl extends ExtensibleElementImpl implements Message {
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
	 * The cached value of the '{@link #getEParts() <em>EParts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEParts()
	 * @generated
	 * @ordered
	 */
	protected EList<Part> eParts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WsdlPackage.Literals.MESSAGE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WsdlPackage.MESSAGE__QNAME, oldQName, qName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WsdlPackage.MESSAGE__UNDEFINED, oldUndefined, undefined));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Part> getEParts() {
		if (eParts == null) {
			eParts = new EObjectContainmentEList<Part>(Part.class, this, WsdlPackage.MESSAGE__EPARTS);
		}
		return eParts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addPart(javax.wsdl.Part part) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public javax.wsdl.Part getPart(String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map getParts() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOrderedParts(List partOrder) {
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
			case WsdlPackage.MESSAGE__EPARTS:
				return ((InternalEList<?>)getEParts()).basicRemove(otherEnd, msgs);
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
			case WsdlPackage.MESSAGE__QNAME:
				return getQName();
			case WsdlPackage.MESSAGE__UNDEFINED:
				return isUndefined();
			case WsdlPackage.MESSAGE__EPARTS:
				return getEParts();
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
			case WsdlPackage.MESSAGE__QNAME:
				setQName((QName)newValue);
				return;
			case WsdlPackage.MESSAGE__UNDEFINED:
				setUndefined((Boolean)newValue);
				return;
			case WsdlPackage.MESSAGE__EPARTS:
				getEParts().clear();
				getEParts().addAll((Collection<? extends Part>)newValue);
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
			case WsdlPackage.MESSAGE__QNAME:
				setQName(QNAME_EDEFAULT);
				return;
			case WsdlPackage.MESSAGE__UNDEFINED:
				setUndefined(UNDEFINED_EDEFAULT);
				return;
			case WsdlPackage.MESSAGE__EPARTS:
				getEParts().clear();
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
			case WsdlPackage.MESSAGE__QNAME:
				return QNAME_EDEFAULT == null ? qName != null : !QNAME_EDEFAULT.equals(qName);
			case WsdlPackage.MESSAGE__UNDEFINED:
				return undefined != UNDEFINED_EDEFAULT;
			case WsdlPackage.MESSAGE__EPARTS:
				return eParts != null && !eParts.isEmpty();
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
		if (baseClass == javax.wsdl.Message.class) {
			switch (baseOperationID) {
				case WsdlPackage.IMESSAGE___ADD_PART__PART: return WsdlPackage.MESSAGE___ADD_PART__PART;
				case WsdlPackage.IMESSAGE___GET_PART__STRING: return WsdlPackage.MESSAGE___GET_PART__STRING;
				case WsdlPackage.IMESSAGE___GET_PARTS: return WsdlPackage.MESSAGE___GET_PARTS;
				case WsdlPackage.IMESSAGE___GET_ORDERED_PARTS__LIST: return WsdlPackage.MESSAGE___GET_ORDERED_PARTS__LIST;
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
			case WsdlPackage.MESSAGE___ADD_PART__PART:
				addPart((javax.wsdl.Part)arguments.get(0));
				return null;
			case WsdlPackage.MESSAGE___GET_PART__STRING:
				return getPart((String)arguments.get(0));
			case WsdlPackage.MESSAGE___GET_PARTS:
				return getParts();
			case WsdlPackage.MESSAGE___GET_ORDERED_PARTS__LIST:
				return getOrderedParts((List)arguments.get(0));
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
	public javax.wsdl.Part removePart(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

} //MessageImpl
