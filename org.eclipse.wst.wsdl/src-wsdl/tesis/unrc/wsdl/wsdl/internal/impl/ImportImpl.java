/**
 */
package tesis.unrc.wsdl.wsdl.internal.impl;

import javax.wsdl.extensions.ExtensibilityElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xsd.XSDSchema;

import tesis.unrc.wsdl.wsdl.Definition;
import tesis.unrc.wsdl.wsdl.Import;
import tesis.unrc.wsdl.wsdl.WSDLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tesis.unrc.wsdl.wsdl.internal.impl.ImportImpl#getNamespaceURI <em>Namespace URI</em>}</li>
 *   <li>{@link tesis.unrc.wsdl.wsdl.internal.impl.ImportImpl#getLocationURI <em>Location URI</em>}</li>
 *   <li>{@link tesis.unrc.wsdl.wsdl.internal.impl.ImportImpl#getEDefinition <em>EDefinition</em>}</li>
 *   <li>{@link tesis.unrc.wsdl.wsdl.internal.impl.ImportImpl#getESchema <em>ESchema</em>}</li>
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
	protected EClass eStaticClass() {
		return WSDLPackage.Literals.IMPORT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WSDLPackage.IMPORT__NAMESPACE_URI, oldNamespaceURI,
					namespaceURI));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WSDLPackage.IMPORT__LOCATION_URI, oldLocationURI,
					locationURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Definition getEDefinition() {
		if (eDefinition != null && eDefinition.eIsProxy()) {
			InternalEObject oldEDefinition = (InternalEObject) eDefinition;
			eDefinition = (Definition) eResolveProxy(oldEDefinition);
			if (eDefinition != oldEDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WSDLPackage.IMPORT__EDEFINITION,
							oldEDefinition, eDefinition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WSDLPackage.IMPORT__EDEFINITION, oldEDefinition,
					eDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDSchema getESchema() {
		if (eSchema != null && eSchema.eIsProxy()) {
			InternalEObject oldESchema = (InternalEObject) eSchema;
			eSchema = (XSDSchema) eResolveProxy(oldESchema);
			if (eSchema != oldESchema) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WSDLPackage.IMPORT__ESCHEMA, oldESchema,
							eSchema));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WSDLPackage.IMPORT__ESCHEMA, oldESchema, eSchema));
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WSDLPackage.IMPORT__NAMESPACE_URI:
			return getNamespaceURI();
		case WSDLPackage.IMPORT__LOCATION_URI:
			return getLocationURI();
		case WSDLPackage.IMPORT__EDEFINITION:
			if (resolve)
				return getEDefinition();
			return basicGetEDefinition();
		case WSDLPackage.IMPORT__ESCHEMA:
			if (resolve)
				return getESchema();
			return basicGetESchema();
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
		case WSDLPackage.IMPORT__NAMESPACE_URI:
			setNamespaceURI((String) newValue);
			return;
		case WSDLPackage.IMPORT__LOCATION_URI:
			setLocationURI((String) newValue);
			return;
		case WSDLPackage.IMPORT__EDEFINITION:
			setEDefinition((Definition) newValue);
			return;
		case WSDLPackage.IMPORT__ESCHEMA:
			setESchema((XSDSchema) newValue);
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
		case WSDLPackage.IMPORT__NAMESPACE_URI:
			setNamespaceURI(NAMESPACE_URI_EDEFAULT);
			return;
		case WSDLPackage.IMPORT__LOCATION_URI:
			setLocationURI(LOCATION_URI_EDEFAULT);
			return;
		case WSDLPackage.IMPORT__EDEFINITION:
			setEDefinition((Definition) null);
			return;
		case WSDLPackage.IMPORT__ESCHEMA:
			setESchema((XSDSchema) null);
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
		case WSDLPackage.IMPORT__NAMESPACE_URI:
			return NAMESPACE_URI_EDEFAULT == null ? namespaceURI != null : !NAMESPACE_URI_EDEFAULT.equals(namespaceURI);
		case WSDLPackage.IMPORT__LOCATION_URI:
			return LOCATION_URI_EDEFAULT == null ? locationURI != null : !LOCATION_URI_EDEFAULT.equals(locationURI);
		case WSDLPackage.IMPORT__EDEFINITION:
			return eDefinition != null;
		case WSDLPackage.IMPORT__ESCHEMA:
			return eSchema != null;
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
		result.append(" (namespaceURI: "); //$NON-NLS-1$
		result.append(namespaceURI);
		result.append(", locationURI: "); //$NON-NLS-1$
		result.append(locationURI);
		result.append(')');
		return result.toString();
	}

	@Override
	public ExtensibilityElement removeExtensibilityElement(ExtensibilityElement arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public javax.wsdl.Definition getDefinition() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDefinition(javax.wsdl.Definition arg0) {
		// TODO Auto-generated method stub
		
	}

} //ImportImpl
