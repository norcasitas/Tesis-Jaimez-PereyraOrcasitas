/**
 */
package tesis.xsd_ecore.xsd.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tesis.xsd_ecore.xsd.XSDSchema;
import tesis.xsd_ecore.xsd.XSDSchemaDirective;
import tesis.xsd_ecore.xsd.XsdPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XSD Schema Directive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDSchemaDirectiveImpl#getSchemaLocation <em>Schema Location</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDSchemaDirectiveImpl#getResolvedSchema <em>Resolved Schema</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class XSDSchemaDirectiveImpl extends XSDSchemaContentImpl implements XSDSchemaDirective {
	/**
	 * The default value of the '{@link #getSchemaLocation() <em>Schema Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEMA_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchemaLocation() <em>Schema Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected String schemaLocation = SCHEMA_LOCATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResolvedSchema() <em>Resolved Schema</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolvedSchema()
	 * @generated
	 * @ordered
	 */
	protected XSDSchema resolvedSchema;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XSDSchemaDirectiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XsdPackage.Literals.XSD_SCHEMA_DIRECTIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSchemaLocation() {
		return schemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchemaLocation(String newSchemaLocation) {
		String oldSchemaLocation = schemaLocation;
		schemaLocation = newSchemaLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_SCHEMA_DIRECTIVE__SCHEMA_LOCATION, oldSchemaLocation, schemaLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDSchema getResolvedSchema() {
		return resolvedSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolvedSchema(XSDSchema newResolvedSchema) {
		XSDSchema oldResolvedSchema = resolvedSchema;
		resolvedSchema = newResolvedSchema;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_SCHEMA_DIRECTIVE__RESOLVED_SCHEMA, oldResolvedSchema, resolvedSchema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XsdPackage.XSD_SCHEMA_DIRECTIVE__SCHEMA_LOCATION:
				return getSchemaLocation();
			case XsdPackage.XSD_SCHEMA_DIRECTIVE__RESOLVED_SCHEMA:
				return getResolvedSchema();
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
			case XsdPackage.XSD_SCHEMA_DIRECTIVE__SCHEMA_LOCATION:
				setSchemaLocation((String)newValue);
				return;
			case XsdPackage.XSD_SCHEMA_DIRECTIVE__RESOLVED_SCHEMA:
				setResolvedSchema((XSDSchema)newValue);
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
			case XsdPackage.XSD_SCHEMA_DIRECTIVE__SCHEMA_LOCATION:
				setSchemaLocation(SCHEMA_LOCATION_EDEFAULT);
				return;
			case XsdPackage.XSD_SCHEMA_DIRECTIVE__RESOLVED_SCHEMA:
				setResolvedSchema((XSDSchema)null);
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
			case XsdPackage.XSD_SCHEMA_DIRECTIVE__SCHEMA_LOCATION:
				return SCHEMA_LOCATION_EDEFAULT == null ? schemaLocation != null : !SCHEMA_LOCATION_EDEFAULT.equals(schemaLocation);
			case XsdPackage.XSD_SCHEMA_DIRECTIVE__RESOLVED_SCHEMA:
				return resolvedSchema != null;
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
		result.append(" (schemaLocation: ");
		result.append(schemaLocation);
		result.append(')');
		return result.toString();
	}

} //XSDSchemaDirectiveImpl
