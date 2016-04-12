/**
 */
package tesis.wsdl_ecore.wsdl.impl;

import java.lang.reflect.InvocationTargetException;

import javax.wsdl.Message;
import javax.wsdl.extensions.ExtensibilityElement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import tesis.wsdl_ecore.wsdl.Fault;
import tesis.wsdl_ecore.wsdl.WsdlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fault</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class FaultImpl extends MessageReferenceImpl implements Fault {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FaultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WsdlPackage.Literals.FAULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message getMessage() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessage(Message message) {
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
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == javax.wsdl.Fault.class) {
			switch (baseOperationID) {
				case WsdlPackage.IFAULT___GET_MESSAGE: return WsdlPackage.FAULT___GET_MESSAGE;
				case WsdlPackage.IFAULT___SET_MESSAGE__MESSAGE: return WsdlPackage.FAULT___SET_MESSAGE__MESSAGE;
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
			case WsdlPackage.FAULT___GET_MESSAGE:
				return getMessage();
			case WsdlPackage.FAULT___SET_MESSAGE__MESSAGE:
				setMessage((Message)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	public ExtensibilityElement removeExtensibilityElement(ExtensibilityElement arg0) {
		// TODO Auto-generated method stub
		return null;
	}


} //FaultImpl
