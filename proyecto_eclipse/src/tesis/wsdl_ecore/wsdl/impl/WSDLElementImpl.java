/**
 */
package tesis.wsdl_ecore.wsdl.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.w3c.dom.Element;

import tesis.wsdl_ecore.wsdl.Definition;
import tesis.wsdl_ecore.wsdl.WSDLElement;
import tesis.wsdl_ecore.wsdl.WsdlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>WSDL Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tesis.wsdl_ecore.wsdl.impl.WSDLElementImpl#getDocumentationElement <em>Documentation Element</em>}</li>
 *   <li>{@link tesis.wsdl_ecore.wsdl.impl.WSDLElementImpl#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class WSDLElementImpl extends MinimalEObjectImpl.Container implements WSDLElement {
	/**
	 * The default value of the '{@link #getDocumentationElement() <em>Documentation Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentationElement()
	 * @generated
	 * @ordered
	 */
	protected static final Element DOCUMENTATION_ELEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentationElement() <em>Documentation Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentationElement()
	 * @generated
	 * @ordered
	 */
	protected Element documentationElement = DOCUMENTATION_ELEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getElement() <em>Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected static final Element ELEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected Element element = ELEMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WSDLElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WsdlPackage.Literals.WSDL_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getDocumentationElement() {
		return documentationElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentationElement(Element newDocumentationElement) {
		Element oldDocumentationElement = documentationElement;
		documentationElement = newDocumentationElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WsdlPackage.WSDL_ELEMENT__DOCUMENTATION_ELEMENT, oldDocumentationElement, documentationElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getElement() {
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement(Element newElement) {
		Element oldElement = element;
		element = newElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WsdlPackage.WSDL_ELEMENT__ELEMENT, oldElement, element));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Definition getEnclosingDefinition() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnclosingDefinition(Definition definition) {
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
			case WsdlPackage.WSDL_ELEMENT__DOCUMENTATION_ELEMENT:
				return getDocumentationElement();
			case WsdlPackage.WSDL_ELEMENT__ELEMENT:
				return getElement();
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
			case WsdlPackage.WSDL_ELEMENT__DOCUMENTATION_ELEMENT:
				setDocumentationElement((Element)newValue);
				return;
			case WsdlPackage.WSDL_ELEMENT__ELEMENT:
				setElement((Element)newValue);
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
			case WsdlPackage.WSDL_ELEMENT__DOCUMENTATION_ELEMENT:
				setDocumentationElement(DOCUMENTATION_ELEMENT_EDEFAULT);
				return;
			case WsdlPackage.WSDL_ELEMENT__ELEMENT:
				setElement(ELEMENT_EDEFAULT);
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
			case WsdlPackage.WSDL_ELEMENT__DOCUMENTATION_ELEMENT:
				return DOCUMENTATION_ELEMENT_EDEFAULT == null ? documentationElement != null : !DOCUMENTATION_ELEMENT_EDEFAULT.equals(documentationElement);
			case WsdlPackage.WSDL_ELEMENT__ELEMENT:
				return ELEMENT_EDEFAULT == null ? element != null : !ELEMENT_EDEFAULT.equals(element);
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
			case WsdlPackage.WSDL_ELEMENT___GET_ENCLOSING_DEFINITION:
				return getEnclosingDefinition();
			case WsdlPackage.WSDL_ELEMENT___SET_ENCLOSING_DEFINITION__DEFINITION:
				setEnclosingDefinition((Definition)arguments.get(0));
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
		result.append(" (documentationElement: ");
		result.append(documentationElement);
		result.append(", element: ");
		result.append(element);
		result.append(')');
		return result.toString();
	}

} //WSDLElementImpl
