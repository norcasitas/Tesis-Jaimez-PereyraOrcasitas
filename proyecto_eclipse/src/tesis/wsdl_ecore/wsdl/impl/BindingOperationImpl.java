/**
 */
package tesis.wsdl_ecore.wsdl.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import javax.wsdl.extensions.ExtensibilityElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tesis.wsdl_ecore.wsdl.BindingFault;
import tesis.wsdl_ecore.wsdl.BindingInput;
import tesis.wsdl_ecore.wsdl.BindingOperation;
import tesis.wsdl_ecore.wsdl.BindingOutput;
import tesis.wsdl_ecore.wsdl.Operation;
import tesis.wsdl_ecore.wsdl.WsdlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tesis.wsdl_ecore.wsdl.impl.BindingOperationImpl#getName <em>Name</em>}</li>
 *   <li>{@link tesis.wsdl_ecore.wsdl.impl.BindingOperationImpl#getEOperation <em>EOperation</em>}</li>
 *   <li>{@link tesis.wsdl_ecore.wsdl.impl.BindingOperationImpl#getEBindingInput <em>EBinding Input</em>}</li>
 *   <li>{@link tesis.wsdl_ecore.wsdl.impl.BindingOperationImpl#getEBindingOutput <em>EBinding Output</em>}</li>
 *   <li>{@link tesis.wsdl_ecore.wsdl.impl.BindingOperationImpl#getEBindingFaults <em>EBinding Faults</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BindingOperationImpl extends ExtensibleElementImpl implements BindingOperation {
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
	 * The cached value of the '{@link #getEOperation() <em>EOperation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEOperation()
	 * @generated
	 * @ordered
	 */
	protected Operation eOperation;

	/**
	 * The cached value of the '{@link #getEBindingInput() <em>EBinding Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEBindingInput()
	 * @generated
	 * @ordered
	 */
	protected BindingInput eBindingInput;

	/**
	 * The cached value of the '{@link #getEBindingOutput() <em>EBinding Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEBindingOutput()
	 * @generated
	 * @ordered
	 */
	protected BindingOutput eBindingOutput;

	/**
	 * The cached value of the '{@link #getEBindingFaults() <em>EBinding Faults</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEBindingFaults()
	 * @generated
	 * @ordered
	 */
	protected EList<BindingFault> eBindingFaults;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WsdlPackage.Literals.BINDING_OPERATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WsdlPackage.BINDING_OPERATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getEOperation() {
		if (eOperation != null && eOperation.eIsProxy()) {
			InternalEObject oldEOperation = (InternalEObject)eOperation;
			eOperation = (Operation)eResolveProxy(oldEOperation);
			if (eOperation != oldEOperation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WsdlPackage.BINDING_OPERATION__EOPERATION, oldEOperation, eOperation));
			}
		}
		return eOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetEOperation() {
		return eOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEOperation(Operation newEOperation) {
		Operation oldEOperation = eOperation;
		eOperation = newEOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WsdlPackage.BINDING_OPERATION__EOPERATION, oldEOperation, eOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingInput getEBindingInput() {
		return eBindingInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEBindingInput(BindingInput newEBindingInput, NotificationChain msgs) {
		BindingInput oldEBindingInput = eBindingInput;
		eBindingInput = newEBindingInput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WsdlPackage.BINDING_OPERATION__EBINDING_INPUT, oldEBindingInput, newEBindingInput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEBindingInput(BindingInput newEBindingInput) {
		if (newEBindingInput != eBindingInput) {
			NotificationChain msgs = null;
			if (eBindingInput != null)
				msgs = ((InternalEObject)eBindingInput).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WsdlPackage.BINDING_OPERATION__EBINDING_INPUT, null, msgs);
			if (newEBindingInput != null)
				msgs = ((InternalEObject)newEBindingInput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WsdlPackage.BINDING_OPERATION__EBINDING_INPUT, null, msgs);
			msgs = basicSetEBindingInput(newEBindingInput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WsdlPackage.BINDING_OPERATION__EBINDING_INPUT, newEBindingInput, newEBindingInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingOutput getEBindingOutput() {
		return eBindingOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEBindingOutput(BindingOutput newEBindingOutput, NotificationChain msgs) {
		BindingOutput oldEBindingOutput = eBindingOutput;
		eBindingOutput = newEBindingOutput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WsdlPackage.BINDING_OPERATION__EBINDING_OUTPUT, oldEBindingOutput, newEBindingOutput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEBindingOutput(BindingOutput newEBindingOutput) {
		if (newEBindingOutput != eBindingOutput) {
			NotificationChain msgs = null;
			if (eBindingOutput != null)
				msgs = ((InternalEObject)eBindingOutput).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WsdlPackage.BINDING_OPERATION__EBINDING_OUTPUT, null, msgs);
			if (newEBindingOutput != null)
				msgs = ((InternalEObject)newEBindingOutput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WsdlPackage.BINDING_OPERATION__EBINDING_OUTPUT, null, msgs);
			msgs = basicSetEBindingOutput(newEBindingOutput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WsdlPackage.BINDING_OPERATION__EBINDING_OUTPUT, newEBindingOutput, newEBindingOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BindingFault> getEBindingFaults() {
		if (eBindingFaults == null) {
			eBindingFaults = new EObjectContainmentEList<BindingFault>(BindingFault.class, this, WsdlPackage.BINDING_OPERATION__EBINDING_FAULTS);
		}
		return eBindingFaults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addBindingFault(javax.wsdl.BindingFault bindingFault) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public javax.wsdl.BindingFault getBindingFault(String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map getBindingFaults() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public javax.wsdl.Operation getOperation() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperation(javax.wsdl.Operation operation) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public javax.wsdl.BindingInput getBindingInput() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBindingInput(javax.wsdl.BindingInput bindingInput) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public javax.wsdl.BindingOutput getBindingOutput() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBindingOutput(javax.wsdl.BindingOutput bindingOutput) {
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
			case WsdlPackage.BINDING_OPERATION__EBINDING_INPUT:
				return basicSetEBindingInput(null, msgs);
			case WsdlPackage.BINDING_OPERATION__EBINDING_OUTPUT:
				return basicSetEBindingOutput(null, msgs);
			case WsdlPackage.BINDING_OPERATION__EBINDING_FAULTS:
				return ((InternalEList<?>)getEBindingFaults()).basicRemove(otherEnd, msgs);
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
			case WsdlPackage.BINDING_OPERATION__NAME:
				return getName();
			case WsdlPackage.BINDING_OPERATION__EOPERATION:
				if (resolve) return getEOperation();
				return basicGetEOperation();
			case WsdlPackage.BINDING_OPERATION__EBINDING_INPUT:
				return getEBindingInput();
			case WsdlPackage.BINDING_OPERATION__EBINDING_OUTPUT:
				return getEBindingOutput();
			case WsdlPackage.BINDING_OPERATION__EBINDING_FAULTS:
				return getEBindingFaults();
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
			case WsdlPackage.BINDING_OPERATION__NAME:
				setName((String)newValue);
				return;
			case WsdlPackage.BINDING_OPERATION__EOPERATION:
				setEOperation((Operation)newValue);
				return;
			case WsdlPackage.BINDING_OPERATION__EBINDING_INPUT:
				setEBindingInput((BindingInput)newValue);
				return;
			case WsdlPackage.BINDING_OPERATION__EBINDING_OUTPUT:
				setEBindingOutput((BindingOutput)newValue);
				return;
			case WsdlPackage.BINDING_OPERATION__EBINDING_FAULTS:
				getEBindingFaults().clear();
				getEBindingFaults().addAll((Collection<? extends BindingFault>)newValue);
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
			case WsdlPackage.BINDING_OPERATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WsdlPackage.BINDING_OPERATION__EOPERATION:
				setEOperation((Operation)null);
				return;
			case WsdlPackage.BINDING_OPERATION__EBINDING_INPUT:
				setEBindingInput((BindingInput)null);
				return;
			case WsdlPackage.BINDING_OPERATION__EBINDING_OUTPUT:
				setEBindingOutput((BindingOutput)null);
				return;
			case WsdlPackage.BINDING_OPERATION__EBINDING_FAULTS:
				getEBindingFaults().clear();
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
			case WsdlPackage.BINDING_OPERATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WsdlPackage.BINDING_OPERATION__EOPERATION:
				return eOperation != null;
			case WsdlPackage.BINDING_OPERATION__EBINDING_INPUT:
				return eBindingInput != null;
			case WsdlPackage.BINDING_OPERATION__EBINDING_OUTPUT:
				return eBindingOutput != null;
			case WsdlPackage.BINDING_OPERATION__EBINDING_FAULTS:
				return eBindingFaults != null && !eBindingFaults.isEmpty();
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
		if (baseClass == javax.wsdl.BindingOperation.class) {
			switch (baseOperationID) {
				case WsdlPackage.IBINDING_OPERATION___ADD_BINDING_FAULT__BINDINGFAULT: return WsdlPackage.BINDING_OPERATION___ADD_BINDING_FAULT__BINDINGFAULT;
				case WsdlPackage.IBINDING_OPERATION___GET_BINDING_FAULT__STRING: return WsdlPackage.BINDING_OPERATION___GET_BINDING_FAULT__STRING;
				case WsdlPackage.IBINDING_OPERATION___GET_BINDING_FAULTS: return WsdlPackage.BINDING_OPERATION___GET_BINDING_FAULTS;
				case WsdlPackage.IBINDING_OPERATION___GET_OPERATION: return WsdlPackage.BINDING_OPERATION___GET_OPERATION;
				case WsdlPackage.IBINDING_OPERATION___SET_OPERATION__OPERATION: return WsdlPackage.BINDING_OPERATION___SET_OPERATION__OPERATION;
				case WsdlPackage.IBINDING_OPERATION___GET_BINDING_INPUT: return WsdlPackage.BINDING_OPERATION___GET_BINDING_INPUT;
				case WsdlPackage.IBINDING_OPERATION___SET_BINDING_INPUT__BINDINGINPUT: return WsdlPackage.BINDING_OPERATION___SET_BINDING_INPUT__BINDINGINPUT;
				case WsdlPackage.IBINDING_OPERATION___GET_BINDING_OUTPUT: return WsdlPackage.BINDING_OPERATION___GET_BINDING_OUTPUT;
				case WsdlPackage.IBINDING_OPERATION___SET_BINDING_OUTPUT__BINDINGOUTPUT: return WsdlPackage.BINDING_OPERATION___SET_BINDING_OUTPUT__BINDINGOUTPUT;
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
			case WsdlPackage.BINDING_OPERATION___ADD_BINDING_FAULT__BINDINGFAULT:
				addBindingFault((javax.wsdl.BindingFault)arguments.get(0));
				return null;
			case WsdlPackage.BINDING_OPERATION___GET_BINDING_FAULT__STRING:
				return getBindingFault((String)arguments.get(0));
			case WsdlPackage.BINDING_OPERATION___GET_BINDING_FAULTS:
				return getBindingFaults();
			case WsdlPackage.BINDING_OPERATION___GET_OPERATION:
				return getOperation();
			case WsdlPackage.BINDING_OPERATION___SET_OPERATION__OPERATION:
				setOperation((javax.wsdl.Operation)arguments.get(0));
				return null;
			case WsdlPackage.BINDING_OPERATION___GET_BINDING_INPUT:
				return getBindingInput();
			case WsdlPackage.BINDING_OPERATION___SET_BINDING_INPUT__BINDINGINPUT:
				setBindingInput((javax.wsdl.BindingInput)arguments.get(0));
				return null;
			case WsdlPackage.BINDING_OPERATION___GET_BINDING_OUTPUT:
				return getBindingOutput();
			case WsdlPackage.BINDING_OPERATION___SET_BINDING_OUTPUT__BINDINGOUTPUT:
				setBindingOutput((javax.wsdl.BindingOutput)arguments.get(0));
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

	public javax.wsdl.BindingFault removeBindingFault(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}


} //BindingOperationImpl
