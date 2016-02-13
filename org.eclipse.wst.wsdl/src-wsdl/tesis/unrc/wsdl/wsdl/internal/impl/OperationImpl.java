/**
 */
package tesis.unrc.wsdl.wsdl.internal.impl;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.wsdl.OperationType;
import javax.wsdl.extensions.ExtensibilityElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tesis.unrc.wsdl.wsdl.Fault;
import tesis.unrc.wsdl.wsdl.Input;
import tesis.unrc.wsdl.wsdl.Operation;
import tesis.unrc.wsdl.wsdl.Output;
import tesis.unrc.wsdl.wsdl.Part;
import tesis.unrc.wsdl.wsdl.WSDLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tesis.unrc.wsdl.wsdl.internal.impl.OperationImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link tesis.unrc.wsdl.wsdl.internal.impl.OperationImpl#getName <em>Name</em>}</li>
 *   <li>{@link tesis.unrc.wsdl.wsdl.internal.impl.OperationImpl#isUndefined <em>Undefined</em>}</li>
 *   <li>{@link tesis.unrc.wsdl.wsdl.internal.impl.OperationImpl#getEInput <em>EInput</em>}</li>
 *   <li>{@link tesis.unrc.wsdl.wsdl.internal.impl.OperationImpl#getEOutput <em>EOutput</em>}</li>
 *   <li>{@link tesis.unrc.wsdl.wsdl.internal.impl.OperationImpl#getEFaults <em>EFaults</em>}</li>
 *   <li>{@link tesis.unrc.wsdl.wsdl.internal.impl.OperationImpl#getEParameterOrdering <em>EParameter Ordering</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationImpl extends ExtensibleElementImpl implements Operation {
	/**
	 * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected static final OperationType STYLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected OperationType style = STYLE_EDEFAULT;

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
	 * The cached value of the '{@link #getEInput() <em>EInput</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEInput()
	 * @generated
	 * @ordered
	 */
	protected Input eInput;

	/**
	 * The cached value of the '{@link #getEOutput() <em>EOutput</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEOutput()
	 * @generated
	 * @ordered
	 */
	protected Output eOutput;

	/**
	 * The cached value of the '{@link #getEFaults() <em>EFaults</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEFaults()
	 * @generated
	 * @ordered
	 */
	protected EList eFaults;

	/**
	 * The cached value of the '{@link #getEParameterOrdering() <em>EParameter Ordering</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEParameterOrdering()
	 * @generated
	 * @ordered
	 */
	protected EList eParameterOrdering;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return WSDLPackage.Literals.OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationType getStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyle(OperationType newStyle) {
		OperationType oldStyle = style;
		style = newStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDLPackage.OPERATION__STYLE, oldStyle, style));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WSDLPackage.OPERATION__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WSDLPackage.OPERATION__UNDEFINED, oldUndefined,
					undefined));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input getEInput() {
		return eInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEInput(Input newEInput, NotificationChain msgs) {
		Input oldEInput = eInput;
		eInput = newEInput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					WSDLPackage.OPERATION__EINPUT, oldEInput, newEInput);
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
	public void setEInput(Input newEInput) {
		if (newEInput != eInput) {
			NotificationChain msgs = null;
			if (eInput != null)
				msgs = ((InternalEObject) eInput).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - WSDLPackage.OPERATION__EINPUT, null, msgs);
			if (newEInput != null)
				msgs = ((InternalEObject) newEInput).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - WSDLPackage.OPERATION__EINPUT, null, msgs);
			msgs = basicSetEInput(newEInput, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDLPackage.OPERATION__EINPUT, newEInput, newEInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Output getEOutput() {
		return eOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEOutput(Output newEOutput, NotificationChain msgs) {
		Output oldEOutput = eOutput;
		eOutput = newEOutput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					WSDLPackage.OPERATION__EOUTPUT, oldEOutput, newEOutput);
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
	public void setEOutput(Output newEOutput) {
		if (newEOutput != eOutput) {
			NotificationChain msgs = null;
			if (eOutput != null)
				msgs = ((InternalEObject) eOutput).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - WSDLPackage.OPERATION__EOUTPUT, null, msgs);
			if (newEOutput != null)
				msgs = ((InternalEObject) newEOutput).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - WSDLPackage.OPERATION__EOUTPUT, null, msgs);
			msgs = basicSetEOutput(newEOutput, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDLPackage.OPERATION__EOUTPUT, newEOutput,
					newEOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEFaults() {
		if (eFaults == null) {
			eFaults = new EObjectContainmentEList(Fault.class, this, WSDLPackage.OPERATION__EFAULTS);
		}
		return eFaults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEParameterOrdering() {
		if (eParameterOrdering == null) {
			eParameterOrdering = new EObjectResolvingEList(Part.class, this,
					WSDLPackage.OPERATION__EPARAMETER_ORDERING);
		}
		return eParameterOrdering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addFault(javax.wsdl.Fault fault) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public javax.wsdl.Fault getFault(String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map getFaults() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getParameterOrdering() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterOrdering(List parameterOrder) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WSDLPackage.OPERATION__EINPUT:
			return basicSetEInput(null, msgs);
		case WSDLPackage.OPERATION__EOUTPUT:
			return basicSetEOutput(null, msgs);
		case WSDLPackage.OPERATION__EFAULTS:
			return ((InternalEList) getEFaults()).basicRemove(otherEnd, msgs);
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
		case WSDLPackage.OPERATION__STYLE:
			return getStyle();
		case WSDLPackage.OPERATION__NAME:
			return getName();
		case WSDLPackage.OPERATION__UNDEFINED:
			return isUndefined() ? Boolean.TRUE : Boolean.FALSE;
		case WSDLPackage.OPERATION__EINPUT:
			return getEInput();
		case WSDLPackage.OPERATION__EOUTPUT:
			return getEOutput();
		case WSDLPackage.OPERATION__EFAULTS:
			return getEFaults();
		case WSDLPackage.OPERATION__EPARAMETER_ORDERING:
			return getEParameterOrdering();
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
		case WSDLPackage.OPERATION__STYLE:
			setStyle((OperationType) newValue);
			return;
		case WSDLPackage.OPERATION__NAME:
			setName((String) newValue);
			return;
		case WSDLPackage.OPERATION__UNDEFINED:
			setUndefined(((Boolean) newValue).booleanValue());
			return;
		case WSDLPackage.OPERATION__EINPUT:
			setEInput((Input) newValue);
			return;
		case WSDLPackage.OPERATION__EOUTPUT:
			setEOutput((Output) newValue);
			return;
		case WSDLPackage.OPERATION__EFAULTS:
			getEFaults().clear();
			getEFaults().addAll((Collection) newValue);
			return;
		case WSDLPackage.OPERATION__EPARAMETER_ORDERING:
			getEParameterOrdering().clear();
			getEParameterOrdering().addAll((Collection) newValue);
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
		case WSDLPackage.OPERATION__STYLE:
			setStyle(STYLE_EDEFAULT);
			return;
		case WSDLPackage.OPERATION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case WSDLPackage.OPERATION__UNDEFINED:
			setUndefined(UNDEFINED_EDEFAULT);
			return;
		case WSDLPackage.OPERATION__EINPUT:
			setEInput((Input) null);
			return;
		case WSDLPackage.OPERATION__EOUTPUT:
			setEOutput((Output) null);
			return;
		case WSDLPackage.OPERATION__EFAULTS:
			getEFaults().clear();
			return;
		case WSDLPackage.OPERATION__EPARAMETER_ORDERING:
			getEParameterOrdering().clear();
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
		case WSDLPackage.OPERATION__STYLE:
			return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
		case WSDLPackage.OPERATION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case WSDLPackage.OPERATION__UNDEFINED:
			return undefined != UNDEFINED_EDEFAULT;
		case WSDLPackage.OPERATION__EINPUT:
			return eInput != null;
		case WSDLPackage.OPERATION__EOUTPUT:
			return eOutput != null;
		case WSDLPackage.OPERATION__EFAULTS:
			return eFaults != null && !eFaults.isEmpty();
		case WSDLPackage.OPERATION__EPARAMETER_ORDERING:
			return eParameterOrdering != null && !eParameterOrdering.isEmpty();
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
		result.append(" (style: "); //$NON-NLS-1$
		result.append(style);
		result.append(", name: "); //$NON-NLS-1$
		result.append(name);
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
	public javax.wsdl.Fault removeFault(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

} //OperationImpl
