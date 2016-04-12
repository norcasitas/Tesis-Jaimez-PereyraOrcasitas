/**
 */
package tesis.wsdl_ecore.wsdl.impl;

import java.lang.reflect.InvocationTargetException;

import javax.wsdl.extensions.ExtensibilityElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tesis.wsdl_ecore.wsdl.Definition;
import tesis.wsdl_ecore.wsdl.Import;
import tesis.wsdl_ecore.wsdl.WsdlPackage;

import tesis.xsd_ecore.xsd.XSDSchema;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tesis.wsdl_ecore.wsdl.impl.ImportImpl#getNamespaceURI <em>Namespace URI</em>}</li>
 *   <li>{@link tesis.wsdl_ecore.wsdl.impl.ImportImpl#getLocationURI <em>Location URI</em>}</li>
 *   <li>{@link tesis.wsdl_ecore.wsdl.impl.ImportImpl#getEDefinition <em>EDefinition</em>}</li>
 *   <li>{@link tesis.wsdl_ecore.wsdl.impl.ImportImpl#getESchema <em>ESchema</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImportImpl extends ExtensibleElementImpl implements Import {
	/**
	 * The default value of the '{@link #getNamespaceURI() <em>Namespace URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespaceURI()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMESPACE_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNamespaceURI() <em>Namespace URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespaceURI()
	 * @generated
	 * @ordered
	 */
	protected String namespaceURI = NAMESPACE_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocationURI() <em>Location URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationURI()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocationURI() <em>Location URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationURI()
	 * @generated
	 * @ordered
	 */
	protected String locationURI = LOCATION_URI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEDefinition() <em>EDefinition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEDefinition()
	 * @generated
	 * @ordered
	 */
	protected Definition eDefinition;

	/**
	 * The cached value of the '{@link #getESchema() <em>ESchema</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getESchema()
	 * @generated
	 * @ordered
	 */
	protected XSDSchema eSchema;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WsdlPackage.Literals.IMPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNamespaceURI() {
		return namespaceURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespaceURI(String newNamespaceURI) {
		String oldNamespaceURI = namespaceURI;
		namespaceURI = newNamespaceURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WsdlPackage.IMPORT__NAMESPACE_URI, oldNamespaceURI, namespaceURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocationURI() {
		return locationURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocationURI(String newLocationURI) {
		String oldLocationURI = locationURI;
		locationURI = newLocationURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WsdlPackage.IMPORT__LOCATION_URI, oldLocationURI, locationURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Definition getEDefinition() {
		if (eDefinition != null && eDefinition.eIsProxy()) {
			InternalEObject oldEDefinition = (InternalEObject)eDefinition;
			eDefinition = (Definition)eResolveProxy(oldEDefinition);
			if (eDefinition != oldEDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WsdlPackage.IMPORT__EDEFINITION, oldEDefinition, eDefinition));
			}
		}
		return eDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Definition basicGetEDefinition() {
		return eDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEDefinition(Definition newEDefinition) {
		Definition oldEDefinition = eDefinition;
		eDefinition = newEDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WsdlPackage.IMPORT__EDEFINITION, oldEDefinition, eDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDSchema getESchema() {
		if (eSchema != null && eSchema.eIsProxy()) {
			InternalEObject oldESchema = (InternalEObject)eSchema;
			eSchema = (XSDSchema)eResolveProxy(oldESchema);
			if (eSchema != oldESchema) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WsdlPackage.IMPORT__ESCHEMA, oldESchema, eSchema));
			}
		}
		return eSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDSchema basicGetESchema() {
		return eSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setESchema(XSDSchema newESchema) {
		XSDSchema oldESchema = eSchema;
		eSchema = newESchema;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WsdlPackage.IMPORT__ESCHEMA, oldESchema, eSchema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDSchema getSchema() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchema(XSDSchema schema) {
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
			case WsdlPackage.IMPORT__NAMESPACE_URI:
				return getNamespaceURI();
			case WsdlPackage.IMPORT__LOCATION_URI:
				return getLocationURI();
			case WsdlPackage.IMPORT__EDEFINITION:
				if (resolve) return getEDefinition();
				return basicGetEDefinition();
			case WsdlPackage.IMPORT__ESCHEMA:
				if (resolve) return getESchema();
				return basicGetESchema();
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
			case WsdlPackage.IMPORT__NAMESPACE_URI:
				setNamespaceURI((String)newValue);
				return;
			case WsdlPackage.IMPORT__LOCATION_URI:
				setLocationURI((String)newValue);
				return;
			case WsdlPackage.IMPORT__EDEFINITION:
				setEDefinition((Definition)newValue);
				return;
			case WsdlPackage.IMPORT__ESCHEMA:
				setESchema((XSDSchema)newValue);
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
			case WsdlPackage.IMPORT__NAMESPACE_URI:
				setNamespaceURI(NAMESPACE_URI_EDEFAULT);
				return;
			case WsdlPackage.IMPORT__LOCATION_URI:
				setLocationURI(LOCATION_URI_EDEFAULT);
				return;
			case WsdlPackage.IMPORT__EDEFINITION:
				setEDefinition((Definition)null);
				return;
			case WsdlPackage.IMPORT__ESCHEMA:
				setESchema((XSDSchema)null);
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
			case WsdlPackage.IMPORT__NAMESPACE_URI:
				return NAMESPACE_URI_EDEFAULT == null ? namespaceURI != null : !NAMESPACE_URI_EDEFAULT.equals(namespaceURI);
			case WsdlPackage.IMPORT__LOCATION_URI:
				return LOCATION_URI_EDEFAULT == null ? locationURI != null : !LOCATION_URI_EDEFAULT.equals(locationURI);
			case WsdlPackage.IMPORT__EDEFINITION:
				return eDefinition != null;
			case WsdlPackage.IMPORT__ESCHEMA:
				return eSchema != null;
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
			case WsdlPackage.IMPORT___GET_SCHEMA:
				return getSchema();
			case WsdlPackage.IMPORT___SET_SCHEMA__XSDSCHEMA:
				setSchema((XSDSchema)arguments.get(0));
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
		result.append(" (namespaceURI: ");
		result.append(namespaceURI);
		result.append(", locationURI: ");
		result.append(locationURI);
		result.append(')');
		return result.toString();
	}

	public ExtensibilityElement removeExtensibilityElement(ExtensibilityElement arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public javax.wsdl.Definition getDefinition() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setDefinition(javax.wsdl.Definition arg0) {
		// TODO Auto-generated method stub
		
	}



} //ImportImpl
