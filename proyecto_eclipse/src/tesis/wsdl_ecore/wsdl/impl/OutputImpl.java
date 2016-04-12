/**
 */
package tesis.wsdl_ecore.wsdl.impl;

import java.lang.reflect.InvocationTargetException;

import javax.wsdl.Message;
import javax.wsdl.extensions.ExtensibilityElement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import tesis.wsdl_ecore.wsdl.Output;
import tesis.wsdl_ecore.wsdl.WsdlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class OutputImpl extends MessageReferenceImpl implements Output {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WsdlPackage.Literals.OUTPUT;
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
		if (baseClass == javax.wsdl.Output.class) {
			switch (baseOperationID) {
				case WsdlPackage.IOUTPUT___GET_MESSAGE: return WsdlPackage.OUTPUT___GET_MESSAGE;
				case WsdlPackage.IOUTPUT___SET_MESSAGE__MESSAGE: return WsdlPackage.OUTPUT___SET_MESSAGE__MESSAGE;
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
			case WsdlPackage.OUTPUT___GET_MESSAGE:
				return getMessage();
			case WsdlPackage.OUTPUT___SET_MESSAGE__MESSAGE:
				setMessage((Message)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	public ExtensibilityElement removeExtensibilityElement(ExtensibilityElement arg0) {
		// TODO Auto-generated method stub
		return null;
	}



} //OutputImpl
