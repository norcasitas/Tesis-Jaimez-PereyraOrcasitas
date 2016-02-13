/**
 */
package tesis.unrc.wsdl.wsdl.internal.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.w3c.dom.Element;

import tesis.unrc.wsdl.wsdl.Definition;
import tesis.unrc.wsdl.wsdl.WSDLElement;
import tesis.unrc.wsdl.wsdl.WSDLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tesis.unrc.wsdl.wsdl.internal.impl.WSDLElementImpl#getDocumentationElement <em>Documentation Element</em>}</li>
 *   <li>{@link tesis.unrc.wsdl.wsdl.internal.impl.WSDLElementImpl#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class WSDLElementImpl extends EObjectImpl implements WSDLElement {
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
	protected EClass eStaticClass() {
		return WSDLPackage.Literals.WSDL_ELEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WSDLPackage.WSDL_ELEMENT__DOCUMENTATION_ELEMENT,
					oldDocumentationElement, documentationElement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WSDLPackage.WSDL_ELEMENT__ELEMENT, oldElement,
					element));
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WSDLPackage.WSDL_ELEMENT__DOCUMENTATION_ELEMENT:
			return getDocumentationElement();
		case WSDLPackage.WSDL_ELEMENT__ELEMENT:
			return getElement();
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
		case WSDLPackage.WSDL_ELEMENT__DOCUMENTATION_ELEMENT:
			setDocumentationElement((Element) newValue);
			return;
		case WSDLPackage.WSDL_ELEMENT__ELEMENT:
			setElement((Element) newValue);
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
		case WSDLPackage.WSDL_ELEMENT__DOCUMENTATION_ELEMENT:
			setDocumentationElement(DOCUMENTATION_ELEMENT_EDEFAULT);
			return;
		case WSDLPackage.WSDL_ELEMENT__ELEMENT:
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case WSDLPackage.WSDL_ELEMENT__DOCUMENTATION_ELEMENT:
			return DOCUMENTATION_ELEMENT_EDEFAULT == null ? documentationElement != null
					: !DOCUMENTATION_ELEMENT_EDEFAULT.equals(documentationElement);
		case WSDLPackage.WSDL_ELEMENT__ELEMENT:
			return ELEMENT_EDEFAULT == null ? element != null : !ELEMENT_EDEFAULT.equals(element);
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
		result.append(" (documentationElement: "); //$NON-NLS-1$
		result.append(documentationElement);
		result.append(", element: "); //$NON-NLS-1$
		result.append(element);
		result.append(')');
		return result.toString();
	}

} //WSDLElementImpl
