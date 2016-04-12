/**
 */
package tesis.wsdl_ecore.wsdl.impl;

import java.util.List;
import java.util.Map;

import javax.wsdl.extensions.schema.SchemaImport;
import javax.wsdl.extensions.schema.SchemaReference;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tesis.wsdl_ecore.wsdl.WsdlPackage;
import tesis.wsdl_ecore.wsdl.XSDSchemaExtensibilityElement;

import tesis.xsd_ecore.xsd.XSDSchema;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XSD Schema Extensibility Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tesis.wsdl_ecore.wsdl.impl.XSDSchemaExtensibilityElementImpl#getDocumentBaseURI <em>Document Base URI</em>}</li>
 *   <li>{@link tesis.wsdl_ecore.wsdl.impl.XSDSchemaExtensibilityElementImpl#getSchema <em>Schema</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XSDSchemaExtensibilityElementImpl extends ExtensibilityElementImpl implements XSDSchemaExtensibilityElement {
	/**
	 * The default value of the '{@link #getDocumentBaseURI() <em>Document Base URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentBaseURI()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENT_BASE_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentBaseURI() <em>Document Base URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentBaseURI()
	 * @generated
	 * @ordered
	 */
	protected String documentBaseURI = DOCUMENT_BASE_URI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSchema() <em>Schema</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchema()
	 * @generated
	 * @ordered
	 */
	protected XSDSchema schema;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XSDSchemaExtensibilityElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WsdlPackage.Literals.XSD_SCHEMA_EXTENSIBILITY_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocumentBaseURI() {
		return documentBaseURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentBaseURI(String newDocumentBaseURI) {
		String oldDocumentBaseURI = documentBaseURI;
		documentBaseURI = newDocumentBaseURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WsdlPackage.XSD_SCHEMA_EXTENSIBILITY_ELEMENT__DOCUMENT_BASE_URI, oldDocumentBaseURI, documentBaseURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDSchema getSchema() {
		return schema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchema(XSDSchema newSchema, NotificationChain msgs) {
		XSDSchema oldSchema = schema;
		schema = newSchema;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WsdlPackage.XSD_SCHEMA_EXTENSIBILITY_ELEMENT__SCHEMA, oldSchema, newSchema);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchema(XSDSchema newSchema) {
		if (newSchema != schema) {
			NotificationChain msgs = null;
			if (schema != null)
				msgs = ((InternalEObject)schema).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WsdlPackage.XSD_SCHEMA_EXTENSIBILITY_ELEMENT__SCHEMA, null, msgs);
			if (newSchema != null)
				msgs = ((InternalEObject)newSchema).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WsdlPackage.XSD_SCHEMA_EXTENSIBILITY_ELEMENT__SCHEMA, null, msgs);
			msgs = basicSetSchema(newSchema, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WsdlPackage.XSD_SCHEMA_EXTENSIBILITY_ELEMENT__SCHEMA, newSchema, newSchema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WsdlPackage.XSD_SCHEMA_EXTENSIBILITY_ELEMENT__SCHEMA:
				return basicSetSchema(null, msgs);
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
			case WsdlPackage.XSD_SCHEMA_EXTENSIBILITY_ELEMENT__DOCUMENT_BASE_URI:
				return getDocumentBaseURI();
			case WsdlPackage.XSD_SCHEMA_EXTENSIBILITY_ELEMENT__SCHEMA:
				return getSchema();
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
			case WsdlPackage.XSD_SCHEMA_EXTENSIBILITY_ELEMENT__DOCUMENT_BASE_URI:
				setDocumentBaseURI((String)newValue);
				return;
			case WsdlPackage.XSD_SCHEMA_EXTENSIBILITY_ELEMENT__SCHEMA:
				setSchema((XSDSchema)newValue);
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
			case WsdlPackage.XSD_SCHEMA_EXTENSIBILITY_ELEMENT__DOCUMENT_BASE_URI:
				setDocumentBaseURI(DOCUMENT_BASE_URI_EDEFAULT);
				return;
			case WsdlPackage.XSD_SCHEMA_EXTENSIBILITY_ELEMENT__SCHEMA:
				setSchema((XSDSchema)null);
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
			case WsdlPackage.XSD_SCHEMA_EXTENSIBILITY_ELEMENT__DOCUMENT_BASE_URI:
				return DOCUMENT_BASE_URI_EDEFAULT == null ? documentBaseURI != null : !DOCUMENT_BASE_URI_EDEFAULT.equals(documentBaseURI);
			case WsdlPackage.XSD_SCHEMA_EXTENSIBILITY_ELEMENT__SCHEMA:
				return schema != null;
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
		result.append(" (documentBaseURI: ");
		result.append(documentBaseURI);
		result.append(')');
		return result.toString();
	}

	public void addImport(SchemaImport arg0) {
		// TODO Auto-generated method stub
		
	}

	public void addInclude(SchemaReference arg0) {
		// TODO Auto-generated method stub
		
	}

	public void addRedefine(SchemaReference arg0) {
		// TODO Auto-generated method stub
		
	}

	public SchemaImport createImport() {
		// TODO Auto-generated method stub
		return null;
	}

	public SchemaReference createInclude() {
		// TODO Auto-generated method stub
		return null;
	}

	public SchemaReference createRedefine() {
		// TODO Auto-generated method stub
		return null;
	}

	public Map getImports() {
		// TODO Auto-generated method stub
		return null;
	}

	public List getIncludes() {
		// TODO Auto-generated method stub
		return null;
	}

	public List getRedefines() {
		// TODO Auto-generated method stub
		return null;
	}

	

} //XSDSchemaExtensibilityElementImpl
