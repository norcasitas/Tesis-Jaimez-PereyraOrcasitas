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

import tesis.wsdl_ecore.wsdl.BindingInput;
import tesis.wsdl_ecore.wsdl.Input;
import tesis.wsdl_ecore.wsdl.WsdlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tesis.wsdl_ecore.wsdl.impl.BindingInputImpl#getName <em>Name</em>}</li>
 *   <li>{@link tesis.wsdl_ecore.wsdl.impl.BindingInputImpl#getEInput <em>EInput</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BindingInputImpl extends ExtensibleElementImpl implements BindingInput {
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
	 * The cached value of the '{@link #getEInput() <em>EInput</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEInput()
	 * @generated
	 * @ordered
	 */
	protected Input eInput;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingInputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WsdlPackage.Literals.BINDING_INPUT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WsdlPackage.BINDING_INPUT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input getEInput() {
		if (eInput != null && eInput.eIsProxy()) {
			InternalEObject oldEInput = (InternalEObject)eInput;
			eInput = (Input)eResolveProxy(oldEInput);
			if (eInput != oldEInput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WsdlPackage.BINDING_INPUT__EINPUT, oldEInput, eInput));
			}
		}
		return eInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input basicGetEInput() {
		return eInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEInput(Input newEInput) {
		Input oldEInput = eInput;
		eInput = newEInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WsdlPackage.BINDING_INPUT__EINPUT, oldEInput, eInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public javax.wsdl.Input getInput() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput(javax.wsdl.Input input) {
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
			case WsdlPackage.BINDING_INPUT__NAME:
				return getName();
			case WsdlPackage.BINDING_INPUT__EINPUT:
				if (resolve) return getEInput();
				return basicGetEInput();
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
			case WsdlPackage.BINDING_INPUT__NAME:
				setName((String)newValue);
				return;
			case WsdlPackage.BINDING_INPUT__EINPUT:
				setEInput((Input)newValue);
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
			case WsdlPackage.BINDING_INPUT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WsdlPackage.BINDING_INPUT__EINPUT:
				setEInput((Input)null);
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
			case WsdlPackage.BINDING_INPUT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WsdlPackage.BINDING_INPUT__EINPUT:
				return eInput != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case WsdlPackage.BINDING_INPUT___GET_INPUT:
				return getInput();
			case WsdlPackage.BINDING_INPUT___SET_INPUT__INPUT:
				setInput((javax.wsdl.Input)arguments.get(0));
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

	

} //BindingInputImpl
