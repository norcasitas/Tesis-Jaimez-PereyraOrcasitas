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

import tesis.wsdl_ecore.wsdl.BindingOutput;
import tesis.wsdl_ecore.wsdl.Output;
import tesis.wsdl_ecore.wsdl.WsdlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tesis.wsdl_ecore.wsdl.impl.BindingOutputImpl#getName <em>Name</em>}</li>
 *   <li>{@link tesis.wsdl_ecore.wsdl.impl.BindingOutputImpl#getEOutput <em>EOutput</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BindingOutputImpl extends ExtensibleElementImpl implements BindingOutput {
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
	 * The cached value of the '{@link #getEOutput() <em>EOutput</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEOutput()
	 * @generated
	 * @ordered
	 */
	protected Output eOutput;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingOutputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WsdlPackage.Literals.BINDING_OUTPUT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WsdlPackage.BINDING_OUTPUT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Output getEOutput() {
		if (eOutput != null && eOutput.eIsProxy()) {
			InternalEObject oldEOutput = (InternalEObject)eOutput;
			eOutput = (Output)eResolveProxy(oldEOutput);
			if (eOutput != oldEOutput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WsdlPackage.BINDING_OUTPUT__EOUTPUT, oldEOutput, eOutput));
			}
		}
		return eOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Output basicGetEOutput() {
		return eOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEOutput(Output newEOutput) {
		Output oldEOutput = eOutput;
		eOutput = newEOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WsdlPackage.BINDING_OUTPUT__EOUTPUT, oldEOutput, eOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public javax.wsdl.Output getOutput() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput(javax.wsdl.Output output) {
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
			case WsdlPackage.BINDING_OUTPUT__NAME:
				return getName();
			case WsdlPackage.BINDING_OUTPUT__EOUTPUT:
				if (resolve) return getEOutput();
				return basicGetEOutput();
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
			case WsdlPackage.BINDING_OUTPUT__NAME:
				setName((String)newValue);
				return;
			case WsdlPackage.BINDING_OUTPUT__EOUTPUT:
				setEOutput((Output)newValue);
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
			case WsdlPackage.BINDING_OUTPUT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WsdlPackage.BINDING_OUTPUT__EOUTPUT:
				setEOutput((Output)null);
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
			case WsdlPackage.BINDING_OUTPUT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WsdlPackage.BINDING_OUTPUT__EOUTPUT:
				return eOutput != null;
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
			case WsdlPackage.BINDING_OUTPUT___GET_OUTPUT:
				return getOutput();
			case WsdlPackage.BINDING_OUTPUT___SET_OUTPUT__OUTPUT:
				setOutput((javax.wsdl.Output)arguments.get(0));
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



} //BindingOutputImpl
