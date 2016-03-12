/**
 */
package tesis.xsd_ecore.xsd.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3c.dom.Element;

import tesis.xsd_ecore.xsd.XSDConcreteComponent;
import tesis.xsd_ecore.xsd.XSDDiagnostic;
import tesis.xsd_ecore.xsd.XSDSchema;
import tesis.xsd_ecore.xsd.XsdPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XSD Concrete Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDConcreteComponentImpl#getElement <em>Element</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDConcreteComponentImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDConcreteComponentImpl#getRootContainer <em>Root Container</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDConcreteComponentImpl#getSchema <em>Schema</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDConcreteComponentImpl#getDiagnostics <em>Diagnostics</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class XSDConcreteComponentImpl extends MinimalEObjectImpl.Container implements XSDConcreteComponent {
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
	 * The cached value of the '{@link #getDiagnostics() <em>Diagnostics</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnostics()
	 * @generated
	 * @ordered
	 */
	protected EList<XSDDiagnostic> diagnostics;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XSDConcreteComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XsdPackage.Literals.XSD_CONCRETE_COMPONENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_CONCRETE_COMPONENT__ELEMENT, oldElement, element));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDConcreteComponent getContainer() {
		// TODO: implement this method to return the 'Container' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDConcreteComponent getRootContainer() {
		// TODO: implement this method to return the 'Root Container' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDSchema getSchema() {
		// TODO: implement this method to return the 'Schema' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XSDDiagnostic> getDiagnostics() {
		if (diagnostics == null) {
			diagnostics = new EObjectContainmentEList<XSDDiagnostic>(XSDDiagnostic.class, this, XsdPackage.XSD_CONCRETE_COMPONENT__DIAGNOSTICS);
		}
		return diagnostics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XsdPackage.XSD_CONCRETE_COMPONENT__DIAGNOSTICS:
				return ((InternalEList<?>)getDiagnostics()).basicRemove(otherEnd, msgs);
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
			case XsdPackage.XSD_CONCRETE_COMPONENT__ELEMENT:
				return getElement();
			case XsdPackage.XSD_CONCRETE_COMPONENT__CONTAINER:
				return getContainer();
			case XsdPackage.XSD_CONCRETE_COMPONENT__ROOT_CONTAINER:
				return getRootContainer();
			case XsdPackage.XSD_CONCRETE_COMPONENT__SCHEMA:
				return getSchema();
			case XsdPackage.XSD_CONCRETE_COMPONENT__DIAGNOSTICS:
				return getDiagnostics();
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
			case XsdPackage.XSD_CONCRETE_COMPONENT__ELEMENT:
				setElement((Element)newValue);
				return;
			case XsdPackage.XSD_CONCRETE_COMPONENT__DIAGNOSTICS:
				getDiagnostics().clear();
				getDiagnostics().addAll((Collection<? extends XSDDiagnostic>)newValue);
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
			case XsdPackage.XSD_CONCRETE_COMPONENT__ELEMENT:
				setElement(ELEMENT_EDEFAULT);
				return;
			case XsdPackage.XSD_CONCRETE_COMPONENT__DIAGNOSTICS:
				getDiagnostics().clear();
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
			case XsdPackage.XSD_CONCRETE_COMPONENT__ELEMENT:
				return ELEMENT_EDEFAULT == null ? element != null : !ELEMENT_EDEFAULT.equals(element);
			case XsdPackage.XSD_CONCRETE_COMPONENT__CONTAINER:
				return getContainer() != null;
			case XsdPackage.XSD_CONCRETE_COMPONENT__ROOT_CONTAINER:
				return getRootContainer() != null;
			case XsdPackage.XSD_CONCRETE_COMPONENT__SCHEMA:
				return getSchema() != null;
			case XsdPackage.XSD_CONCRETE_COMPONENT__DIAGNOSTICS:
				return diagnostics != null && !diagnostics.isEmpty();
		}
		return super.eIsSet(featureID);
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
		result.append(" (element: ");
		result.append(element);
		result.append(')');
		return result.toString();
	}

} //XSDConcreteComponentImpl
