/**
 */
package tesis.xsd_ecore.xsd.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tesis.xsd_ecore.xsd.XSDSchema;
import tesis.xsd_ecore.xsd.XSDSchemaCompositor;
import tesis.xsd_ecore.xsd.XsdPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XSD Schema Compositor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDSchemaCompositorImpl#getIncorporatedSchema <em>Incorporated Schema</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class XSDSchemaCompositorImpl extends XSDSchemaDirectiveImpl implements XSDSchemaCompositor {
	/**
	 * The cached value of the '{@link #getIncorporatedSchema() <em>Incorporated Schema</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncorporatedSchema()
	 * @generated
	 * @ordered
	 */
	protected XSDSchema incorporatedSchema;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XSDSchemaCompositorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XsdPackage.Literals.XSD_SCHEMA_COMPOSITOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDSchema getIncorporatedSchema() {
		return incorporatedSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncorporatedSchema(XSDSchema newIncorporatedSchema) {
		XSDSchema oldIncorporatedSchema = incorporatedSchema;
		incorporatedSchema = newIncorporatedSchema;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_SCHEMA_COMPOSITOR__INCORPORATED_SCHEMA, oldIncorporatedSchema, incorporatedSchema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XsdPackage.XSD_SCHEMA_COMPOSITOR__INCORPORATED_SCHEMA:
				return getIncorporatedSchema();
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
			case XsdPackage.XSD_SCHEMA_COMPOSITOR__INCORPORATED_SCHEMA:
				setIncorporatedSchema((XSDSchema)newValue);
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
			case XsdPackage.XSD_SCHEMA_COMPOSITOR__INCORPORATED_SCHEMA:
				setIncorporatedSchema((XSDSchema)null);
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
			case XsdPackage.XSD_SCHEMA_COMPOSITOR__INCORPORATED_SCHEMA:
				return incorporatedSchema != null;
		}
		return super.eIsSet(featureID);
	}

} //XSDSchemaCompositorImpl
