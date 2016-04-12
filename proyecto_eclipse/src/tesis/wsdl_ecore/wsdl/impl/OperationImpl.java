/**
 */
package tesis.wsdl_ecore.wsdl.impl;

import java.lang.reflect.InvocationTargetException;

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

import tesis.wsdl_ecore.wsdl.Fault;
import tesis.wsdl_ecore.wsdl.Input;
import tesis.wsdl_ecore.wsdl.Operation;
import tesis.wsdl_ecore.wsdl.Output;
import tesis.wsdl_ecore.wsdl.Part;
import tesis.wsdl_ecore.wsdl.WsdlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tesis.wsdl_ecore.wsdl.impl.OperationImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link tesis.wsdl_ecore.wsdl.impl.OperationImpl#getName <em>Name</em>}</li>
 *   <li>{@link tesis.wsdl_ecore.wsdl.impl.OperationImpl#isUndefined <em>Undefined</em>}</li>
 *   <li>{@link tesis.wsdl_ecore.wsdl.impl.OperationImpl#getEInput <em>EInput</em>}</li>
 *   <li>{@link tesis.wsdl_ecore.wsdl.impl.OperationImpl#getEOutput <em>EOutput</em>}</li>
 *   <li>{@link tesis.wsdl_ecore.wsdl.impl.OperationImpl#getEFaults <em>EFaults</em>}</li>
 *   <li>{@link tesis.wsdl_ecore.wsdl.impl.OperationImpl#getEParameterOrdering <em>EParameter Ordering</em>}</li>
 *   <li>{@link tesis.wsdl_ecore.wsdl.impl.OperationImpl#getDocumentation <em>Documentation</em>}</li>
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
	protected EList<Fault> eFaults;

	/**
	 * The cached value of the '{@link #getEParameterOrdering() <em>EParameter Ordering</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEParameterOrdering()
	 * @generated
	 * @ordered
	 */
	protected EList<Part> eParameterOrdering;

	/**
	 * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected String documentation = DOCUMENTATION_EDEFAULT;

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
	@Override
	protected EClass eStaticClass() {
		return WsdlPackage.Literals.OPERATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WsdlPackage.OPERATION__STYLE, oldStyle, style));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WsdlPackage.OPERATION__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WsdlPackage.OPERATION__UNDEFINED, oldUndefined, undefined));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WsdlPackage.OPERATION__EINPUT, oldEInput, newEInput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
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
				msgs = ((InternalEObject)eInput).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WsdlPackage.OPERATION__EINPUT, null, msgs);
			if (newEInput != null)
				msgs = ((InternalEObject)newEInput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WsdlPackage.OPERATION__EINPUT, null, msgs);
			msgs = basicSetEInput(newEInput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WsdlPackage.OPERATION__EINPUT, newEInput, newEInput));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WsdlPackage.OPERATION__EOUTPUT, oldEOutput, newEOutput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
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
				msgs = ((InternalEObject)eOutput).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WsdlPackage.OPERATION__EOUTPUT, null, msgs);
			if (newEOutput != null)
				msgs = ((InternalEObject)newEOutput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WsdlPackage.OPERATION__EOUTPUT, null, msgs);
			msgs = basicSetEOutput(newEOutput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WsdlPackage.OPERATION__EOUTPUT, newEOutput, newEOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Fault> getEFaults() {
		if (eFaults == null) {
			eFaults = new EObjectContainmentEList<Fault>(Fault.class, this, WsdlPackage.OPERATION__EFAULTS);
		}
		return eFaults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Part> getEParameterOrdering() {
		if (eParameterOrdering == null) {
			eParameterOrdering = new EObjectResolvingEList<Part>(Part.class, this, WsdlPackage.OPERATION__EPARAMETER_ORDERING);
		}
		return eParameterOrdering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentation(String newDocumentation) {
		String oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WsdlPackage.OPERATION__DOCUMENTATION, oldDocumentation, documentation));
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WsdlPackage.OPERATION__EINPUT:
				return basicSetEInput(null, msgs);
			case WsdlPackage.OPERATION__EOUTPUT:
				return basicSetEOutput(null, msgs);
			case WsdlPackage.OPERATION__EFAULTS:
				return ((InternalEList<?>)getEFaults()).basicRemove(otherEnd, msgs);
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
			case WsdlPackage.OPERATION__STYLE:
				return getStyle();
			case WsdlPackage.OPERATION__NAME:
				return getName();
			case WsdlPackage.OPERATION__UNDEFINED:
				return isUndefined();
			case WsdlPackage.OPERATION__EINPUT:
				return getEInput();
			case WsdlPackage.OPERATION__EOUTPUT:
				return getEOutput();
			case WsdlPackage.OPERATION__EFAULTS:
				return getEFaults();
			case WsdlPackage.OPERATION__EPARAMETER_ORDERING:
				return getEParameterOrdering();
			case WsdlPackage.OPERATION__DOCUMENTATION:
				return getDocumentation();
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
			case WsdlPackage.OPERATION__STYLE:
				setStyle((OperationType)newValue);
				return;
			case WsdlPackage.OPERATION__NAME:
				setName((String)newValue);
				return;
			case WsdlPackage.OPERATION__UNDEFINED:
				setUndefined((Boolean)newValue);
				return;
			case WsdlPackage.OPERATION__EINPUT:
				setEInput((Input)newValue);
				return;
			case WsdlPackage.OPERATION__EOUTPUT:
				setEOutput((Output)newValue);
				return;
			case WsdlPackage.OPERATION__EFAULTS:
				getEFaults().clear();
				getEFaults().addAll((Collection<? extends Fault>)newValue);
				return;
			case WsdlPackage.OPERATION__EPARAMETER_ORDERING:
				getEParameterOrdering().clear();
				getEParameterOrdering().addAll((Collection<? extends Part>)newValue);
				return;
			case WsdlPackage.OPERATION__DOCUMENTATION:
				setDocumentation((String)newValue);
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
			case WsdlPackage.OPERATION__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case WsdlPackage.OPERATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WsdlPackage.OPERATION__UNDEFINED:
				setUndefined(UNDEFINED_EDEFAULT);
				return;
			case WsdlPackage.OPERATION__EINPUT:
				setEInput((Input)null);
				return;
			case WsdlPackage.OPERATION__EOUTPUT:
				setEOutput((Output)null);
				return;
			case WsdlPackage.OPERATION__EFAULTS:
				getEFaults().clear();
				return;
			case WsdlPackage.OPERATION__EPARAMETER_ORDERING:
				getEParameterOrdering().clear();
				return;
			case WsdlPackage.OPERATION__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
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
			case WsdlPackage.OPERATION__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case WsdlPackage.OPERATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WsdlPackage.OPERATION__UNDEFINED:
				return undefined != UNDEFINED_EDEFAULT;
			case WsdlPackage.OPERATION__EINPUT:
				return eInput != null;
			case WsdlPackage.OPERATION__EOUTPUT:
				return eOutput != null;
			case WsdlPackage.OPERATION__EFAULTS:
				return eFaults != null && !eFaults.isEmpty();
			case WsdlPackage.OPERATION__EPARAMETER_ORDERING:
				return eParameterOrdering != null && !eParameterOrdering.isEmpty();
			case WsdlPackage.OPERATION__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
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
		if (baseClass == javax.wsdl.Operation.class) {
			switch (baseOperationID) {
				case WsdlPackage.IOPERATION___ADD_FAULT__FAULT: return WsdlPackage.OPERATION___ADD_FAULT__FAULT;
				case WsdlPackage.IOPERATION___GET_FAULT__STRING: return WsdlPackage.OPERATION___GET_FAULT__STRING;
				case WsdlPackage.IOPERATION___GET_FAULTS: return WsdlPackage.OPERATION___GET_FAULTS;
				case WsdlPackage.IOPERATION___GET_PARAMETER_ORDERING: return WsdlPackage.OPERATION___GET_PARAMETER_ORDERING;
				case WsdlPackage.IOPERATION___SET_PARAMETER_ORDERING__LIST: return WsdlPackage.OPERATION___SET_PARAMETER_ORDERING__LIST;
				case WsdlPackage.IOPERATION___GET_INPUT: return WsdlPackage.OPERATION___GET_INPUT;
				case WsdlPackage.IOPERATION___SET_INPUT__INPUT: return WsdlPackage.OPERATION___SET_INPUT__INPUT;
				case WsdlPackage.IOPERATION___GET_OUTPUT: return WsdlPackage.OPERATION___GET_OUTPUT;
				case WsdlPackage.IOPERATION___SET_OUTPUT__OUTPUT: return WsdlPackage.OPERATION___SET_OUTPUT__OUTPUT;
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
			case WsdlPackage.OPERATION___ADD_FAULT__FAULT:
				addFault((javax.wsdl.Fault)arguments.get(0));
				return null;
			case WsdlPackage.OPERATION___GET_FAULT__STRING:
				return getFault((String)arguments.get(0));
			case WsdlPackage.OPERATION___GET_FAULTS:
				return getFaults();
			case WsdlPackage.OPERATION___GET_PARAMETER_ORDERING:
				return getParameterOrdering();
			case WsdlPackage.OPERATION___SET_PARAMETER_ORDERING__LIST:
				setParameterOrdering((List)arguments.get(0));
				return null;
			case WsdlPackage.OPERATION___GET_INPUT:
				return getInput();
			case WsdlPackage.OPERATION___SET_INPUT__INPUT:
				setInput((javax.wsdl.Input)arguments.get(0));
				return null;
			case WsdlPackage.OPERATION___GET_OUTPUT:
				return getOutput();
			case WsdlPackage.OPERATION___SET_OUTPUT__OUTPUT:
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
		result.append(" (style: ");
		result.append(style);
		result.append(", name: ");
		result.append(name);
		result.append(", undefined: ");
		result.append(undefined);
		result.append(", documentation: ");
		result.append(documentation);
		result.append(')');
		return result.toString();
	}

	public ExtensibilityElement removeExtensibilityElement(ExtensibilityElement arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public javax.wsdl.Fault removeFault(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}


} //OperationImpl
