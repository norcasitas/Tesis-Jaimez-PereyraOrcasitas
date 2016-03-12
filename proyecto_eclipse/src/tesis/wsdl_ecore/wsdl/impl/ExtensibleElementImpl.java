/**
 */
package tesis.wsdl_ecore.wsdl.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.wsdl.extensions.AttributeExtensible;
import javax.wsdl.extensions.ElementExtensible;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tesis.wsdl_ecore.wsdl.ExtensibilityElement;
import tesis.wsdl_ecore.wsdl.ExtensibleElement;
import tesis.wsdl_ecore.wsdl.WsdlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extensible Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tesis.wsdl_ecore.wsdl.impl.ExtensibleElementImpl#getEExtensibilityElements <em>EExtensibility Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ExtensibleElementImpl extends WSDLElementImpl implements ExtensibleElement {
	/**
	 * The cached value of the '{@link #getEExtensibilityElements() <em>EExtensibility Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEExtensibilityElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ExtensibilityElement> eExtensibilityElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtensibleElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WsdlPackage.Literals.EXTENSIBLE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExtensibilityElement> getEExtensibilityElements() {
		if (eExtensibilityElements == null) {
			eExtensibilityElements = new EObjectContainmentEList<ExtensibilityElement>(ExtensibilityElement.class, this, WsdlPackage.EXTENSIBLE_ELEMENT__EEXTENSIBILITY_ELEMENTS);
		}
		return eExtensibilityElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getExtensionAttribute(QName name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtensionAttribute(QName name, Object value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map getExtensionAttributes() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getNativeAttributeNames() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getExtensibilityElements() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addExtensibilityElement(javax.wsdl.extensions.ExtensibilityElement extElement) {
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
			case WsdlPackage.EXTENSIBLE_ELEMENT__EEXTENSIBILITY_ELEMENTS:
				return ((InternalEList<?>)getEExtensibilityElements()).basicRemove(otherEnd, msgs);
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
			case WsdlPackage.EXTENSIBLE_ELEMENT__EEXTENSIBILITY_ELEMENTS:
				return getEExtensibilityElements();
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
			case WsdlPackage.EXTENSIBLE_ELEMENT__EEXTENSIBILITY_ELEMENTS:
				getEExtensibilityElements().clear();
				getEExtensibilityElements().addAll((Collection<? extends ExtensibilityElement>)newValue);
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
			case WsdlPackage.EXTENSIBLE_ELEMENT__EEXTENSIBILITY_ELEMENTS:
				getEExtensibilityElements().clear();
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
			case WsdlPackage.EXTENSIBLE_ELEMENT__EEXTENSIBILITY_ELEMENTS:
				return eExtensibilityElements != null && !eExtensibilityElements.isEmpty();
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
		if (baseClass == ElementExtensible.class) {
			switch (baseOperationID) {
				case WsdlPackage.IELEMENT_EXTENSIBLE___GET_EXTENSIBILITY_ELEMENTS: return WsdlPackage.EXTENSIBLE_ELEMENT___GET_EXTENSIBILITY_ELEMENTS;
				case WsdlPackage.IELEMENT_EXTENSIBLE___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT: return WsdlPackage.EXTENSIBLE_ELEMENT___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT;
				default: return -1;
			}
		}
		if (baseClass == AttributeExtensible.class) {
			switch (baseOperationID) {
				case WsdlPackage.IATTRIBUTE_EXTENSIBLE___GET_EXTENSION_ATTRIBUTE__QNAME: return WsdlPackage.EXTENSIBLE_ELEMENT___GET_EXTENSION_ATTRIBUTE__QNAME;
				case WsdlPackage.IATTRIBUTE_EXTENSIBLE___SET_EXTENSION_ATTRIBUTE__QNAME_OBJECT: return WsdlPackage.EXTENSIBLE_ELEMENT___SET_EXTENSION_ATTRIBUTE__QNAME_OBJECT;
				case WsdlPackage.IATTRIBUTE_EXTENSIBLE___GET_EXTENSION_ATTRIBUTES: return WsdlPackage.EXTENSIBLE_ELEMENT___GET_EXTENSION_ATTRIBUTES;
				case WsdlPackage.IATTRIBUTE_EXTENSIBLE___GET_NATIVE_ATTRIBUTE_NAMES: return WsdlPackage.EXTENSIBLE_ELEMENT___GET_NATIVE_ATTRIBUTE_NAMES;
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
			case WsdlPackage.EXTENSIBLE_ELEMENT___GET_EXTENSION_ATTRIBUTE__QNAME:
				return getExtensionAttribute((QName)arguments.get(0));
			case WsdlPackage.EXTENSIBLE_ELEMENT___SET_EXTENSION_ATTRIBUTE__QNAME_OBJECT:
				setExtensionAttribute((QName)arguments.get(0), (Object)arguments.get(1));
				return null;
			case WsdlPackage.EXTENSIBLE_ELEMENT___GET_EXTENSION_ATTRIBUTES:
				return getExtensionAttributes();
			case WsdlPackage.EXTENSIBLE_ELEMENT___GET_NATIVE_ATTRIBUTE_NAMES:
				return getNativeAttributeNames();
			case WsdlPackage.EXTENSIBLE_ELEMENT___GET_EXTENSIBILITY_ELEMENTS:
				return getExtensibilityElements();
			case WsdlPackage.EXTENSIBLE_ELEMENT___ADD_EXTENSIBILITY_ELEMENT__EXTENSIBILITYELEMENT:
				addExtensibilityElement((javax.wsdl.extensions.ExtensibilityElement)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ExtensibleElementImpl
