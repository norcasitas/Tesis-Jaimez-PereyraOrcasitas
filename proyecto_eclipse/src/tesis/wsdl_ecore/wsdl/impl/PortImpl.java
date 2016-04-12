/**
 */
package tesis.wsdl_ecore.wsdl.impl;

import java.lang.reflect.InvocationTargetException;

import javax.wsdl.extensions.ExtensibilityElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tesis.wsdl_ecore.wsdl.Binding;
import tesis.wsdl_ecore.wsdl.Port;
import tesis.wsdl_ecore.wsdl.WsdlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tesis.wsdl_ecore.wsdl.impl.PortImpl#getName <em>Name</em>}</li>
 *   <li>{@link tesis.wsdl_ecore.wsdl.impl.PortImpl#getEBinding <em>EBinding</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortImpl extends ExtensibleElementImpl implements Port {
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
	 * The cached value of the '{@link #getEBinding() <em>EBinding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEBinding()
	 * @generated
	 * @ordered
	 */
	protected Binding eBinding;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WsdlPackage.Literals.PORT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WsdlPackage.PORT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binding getEBinding() {
		if (eBinding != null && eBinding.eIsProxy()) {
			InternalEObject oldEBinding = (InternalEObject)eBinding;
			eBinding = (Binding)eResolveProxy(oldEBinding);
			if (eBinding != oldEBinding) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WsdlPackage.PORT__EBINDING, oldEBinding, eBinding));
			}
		}
		return eBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binding basicGetEBinding() {
		return eBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEBinding(Binding newEBinding) {
		Binding oldEBinding = eBinding;
		eBinding = newEBinding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WsdlPackage.PORT__EBINDING, oldEBinding, eBinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public javax.wsdl.Binding getBinding() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinding(javax.wsdl.Binding binding) {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WsdlPackage.PORT__NAME:
				return getName();
			case WsdlPackage.PORT__EBINDING:
				if (resolve) return getEBinding();
				return basicGetEBinding();
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
			case WsdlPackage.PORT__NAME:
				setName((String)newValue);
				return;
			case WsdlPackage.PORT__EBINDING:
				setEBinding((Binding)newValue);
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
			case WsdlPackage.PORT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WsdlPackage.PORT__EBINDING:
				setEBinding((Binding)null);
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
			case WsdlPackage.PORT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WsdlPackage.PORT__EBINDING:
				return eBinding != null;
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
		if (baseClass == javax.wsdl.Port.class) {
			switch (baseOperationID) {
				case WsdlPackage.IPORT___GET_BINDING: return WsdlPackage.PORT___GET_BINDING;
				case WsdlPackage.IPORT___SET_BINDING__BINDING: return WsdlPackage.PORT___SET_BINDING__BINDING;
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
			case WsdlPackage.PORT___GET_BINDING:
				return getBinding();
			case WsdlPackage.PORT___SET_BINDING__BINDING:
				setBinding((javax.wsdl.Binding)arguments.get(0));
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

	public ExtensibilityElement removeExtensibilityElement(ExtensibilityElement arg0) {
		// TODO Auto-generated method stub
		return null;
	}



} //PortImpl
