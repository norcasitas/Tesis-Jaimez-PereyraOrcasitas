/**
 */
package tesis.unrc.wsdl.wsdl.internal.impl;

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

import tesis.unrc.wsdl.wsdl.BindingFault;
import tesis.unrc.wsdl.wsdl.BindingInput;
import tesis.unrc.wsdl.wsdl.BindingOperation;
import tesis.unrc.wsdl.wsdl.BindingOutput;
import tesis.unrc.wsdl.wsdl.Operation;
import tesis.unrc.wsdl.wsdl.WSDLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tesis.unrc.wsdl.wsdl.internal.impl.BindingOperationImpl#getName <em>Name</em>}</li>
 *   <li>{@link tesis.unrc.wsdl.wsdl.internal.impl.BindingOperationImpl#getEOperation <em>EOperation</em>}</li>
 *   <li>{@link tesis.unrc.wsdl.wsdl.internal.impl.BindingOperationImpl#getEBindingInput <em>EBinding Input</em>}</li>
 *   <li>{@link tesis.unrc.wsdl.wsdl.internal.impl.BindingOperationImpl#getEBindingOutput <em>EBinding Output</em>}</li>
 *   <li>{@link tesis.unrc.wsdl.wsdl.internal.impl.BindingOperationImpl#getEBindingFaults <em>EBinding Faults</em>}</li>
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
	protected EList eBindingFaults;

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
	protected EClass eStaticClass() {
		return WSDLPackage.Literals.BINDING_OPERATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WSDLPackage.BINDING_OPERATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getEOperation() {
		if (eOperation != null && eOperation.eIsProxy()) {
			InternalEObject oldEOperation = (InternalEObject) eOperation;
			eOperation = (Operation) eResolveProxy(oldEOperation);
			if (eOperation != oldEOperation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WSDLPackage.BINDING_OPERATION__EOPERATION,
							oldEOperation, eOperation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WSDLPackage.BINDING_OPERATION__EOPERATION,
					oldEOperation, eOperation));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					WSDLPackage.BINDING_OPERATION__EBINDING_INPUT, oldEBindingInput, newEBindingInput);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
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
				msgs = ((InternalEObject) eBindingInput).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - WSDLPackage.BINDING_OPERATION__EBINDING_INPUT, null, msgs);
			if (newEBindingInput != null)
				msgs = ((InternalEObject) newEBindingInput).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - WSDLPackage.BINDING_OPERATION__EBINDING_INPUT, null, msgs);
			msgs = basicSetEBindingInput(newEBindingInput, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDLPackage.BINDING_OPERATION__EBINDING_INPUT,
					newEBindingInput, newEBindingInput));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					WSDLPackage.BINDING_OPERATION__EBINDING_OUTPUT, oldEBindingOutput, newEBindingOutput);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
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
				msgs = ((InternalEObject) eBindingOutput).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - WSDLPackage.BINDING_OPERATION__EBINDING_OUTPUT, null, msgs);
			if (newEBindingOutput != null)
				msgs = ((InternalEObject) newEBindingOutput).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - WSDLPackage.BINDING_OPERATION__EBINDING_OUTPUT, null, msgs);
			msgs = basicSetEBindingOutput(newEBindingOutput, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDLPackage.BINDING_OPERATION__EBINDING_OUTPUT,
					newEBindingOutput, newEBindingOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEBindingFaults() {
		if (eBindingFaults == null) {
			eBindingFaults = new EObjectContainmentEList(BindingFault.class, this,
					WSDLPackage.BINDING_OPERATION__EBINDING_FAULTS);
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WSDLPackage.BINDING_OPERATION__EBINDING_INPUT:
			return basicSetEBindingInput(null, msgs);
		case WSDLPackage.BINDING_OPERATION__EBINDING_OUTPUT:
			return basicSetEBindingOutput(null, msgs);
		case WSDLPackage.BINDING_OPERATION__EBINDING_FAULTS:
			return ((InternalEList) getEBindingFaults()).basicRemove(otherEnd, msgs);
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
		case WSDLPackage.BINDING_OPERATION__NAME:
			return getName();
		case WSDLPackage.BINDING_OPERATION__EOPERATION:
			if (resolve)
				return getEOperation();
			return basicGetEOperation();
		case WSDLPackage.BINDING_OPERATION__EBINDING_INPUT:
			return getEBindingInput();
		case WSDLPackage.BINDING_OPERATION__EBINDING_OUTPUT:
			return getEBindingOutput();
		case WSDLPackage.BINDING_OPERATION__EBINDING_FAULTS:
			return getEBindingFaults();
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
		case WSDLPackage.BINDING_OPERATION__NAME:
			setName((String) newValue);
			return;
		case WSDLPackage.BINDING_OPERATION__EOPERATION:
			setEOperation((Operation) newValue);
			return;
		case WSDLPackage.BINDING_OPERATION__EBINDING_INPUT:
			setEBindingInput((BindingInput) newValue);
			return;
		case WSDLPackage.BINDING_OPERATION__EBINDING_OUTPUT:
			setEBindingOutput((BindingOutput) newValue);
			return;
		case WSDLPackage.BINDING_OPERATION__EBINDING_FAULTS:
			getEBindingFaults().clear();
			getEBindingFaults().addAll((Collection) newValue);
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
		case WSDLPackage.BINDING_OPERATION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case WSDLPackage.BINDING_OPERATION__EOPERATION:
			setEOperation((Operation) null);
			return;
		case WSDLPackage.BINDING_OPERATION__EBINDING_INPUT:
			setEBindingInput((BindingInput) null);
			return;
		case WSDLPackage.BINDING_OPERATION__EBINDING_OUTPUT:
			setEBindingOutput((BindingOutput) null);
			return;
		case WSDLPackage.BINDING_OPERATION__EBINDING_FAULTS:
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case WSDLPackage.BINDING_OPERATION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case WSDLPackage.BINDING_OPERATION__EOPERATION:
			return eOperation != null;
		case WSDLPackage.BINDING_OPERATION__EBINDING_INPUT:
			return eBindingInput != null;
		case WSDLPackage.BINDING_OPERATION__EBINDING_OUTPUT:
			return eBindingOutput != null;
		case WSDLPackage.BINDING_OPERATION__EBINDING_FAULTS:
			return eBindingFaults != null && !eBindingFaults.isEmpty();
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
		result.append(" (name: "); //$NON-NLS-1$
		result.append(name);
		result.append(')');
		return result.toString();
	}

	@Override
	public ExtensibilityElement removeExtensibilityElement(ExtensibilityElement arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public javax.wsdl.BindingFault removeBindingFault(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

} //BindingOperationImpl
