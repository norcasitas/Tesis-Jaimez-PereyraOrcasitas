/**
 */
package tesis.unrc.wsdl.wsdl.internal.impl;

import java.util.List;
import java.util.Map;

import javax.wsdl.extensions.schema.SchemaImport;
import javax.wsdl.extensions.schema.SchemaReference;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xsd.XSDSchema;

import tesis.unrc.wsdl.wsdl.WSDLPackage;
import tesis.unrc.wsdl.wsdl.XSDSchemaExtensibilityElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XSD Schema Extensibility Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tesis.unrc.wsdl.wsdl.internal.impl.XSDSchemaExtensibilityElementImpl#getDocumentBaseURI <em>Document Base URI</em>}</li>
 *   <li>{@link tesis.unrc.wsdl.wsdl.internal.impl.XSDSchemaExtensibilityElementImpl#getSchema <em>Schema</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XSDSchemaExtensibilityElementImpl extends ExtensibilityElementImpl
		implements XSDSchemaExtensibilityElement {
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
	protected EClass eStaticClass() {
		return WSDLPackage.Literals.XSD_SCHEMA_EXTENSIBILITY_ELEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					WSDLPackage.XSD_SCHEMA_EXTENSIBILITY_ELEMENT__DOCUMENT_BASE_URI, oldDocumentBaseURI,
					documentBaseURI));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					WSDLPackage.XSD_SCHEMA_EXTENSIBILITY_ELEMENT__SCHEMA, oldSchema, newSchema);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
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
				msgs = ((InternalEObject) schema).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - WSDLPackage.XSD_SCHEMA_EXTENSIBILITY_ELEMENT__SCHEMA, null, msgs);
			if (newSchema != null)
				msgs = ((InternalEObject) newSchema).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - WSDLPackage.XSD_SCHEMA_EXTENSIBILITY_ELEMENT__SCHEMA, null, msgs);
			msgs = basicSetSchema(newSchema, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDLPackage.XSD_SCHEMA_EXTENSIBILITY_ELEMENT__SCHEMA,
					newSchema, newSchema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WSDLPackage.XSD_SCHEMA_EXTENSIBILITY_ELEMENT__SCHEMA:
			return basicSetSchema(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WSDLPackage.XSD_SCHEMA_EXTENSIBILITY_ELEMENT__DOCUMENT_BASE_URI:
			return getDocumentBaseURI();
		case WSDLPackage.XSD_SCHEMA_EXTENSIBILITY_ELEMENT__SCHEMA:
			return getSchema();
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
		case WSDLPackage.XSD_SCHEMA_EXTENSIBILITY_ELEMENT__DOCUMENT_BASE_URI:
			setDocumentBaseURI((String) newValue);
			return;
		case WSDLPackage.XSD_SCHEMA_EXTENSIBILITY_ELEMENT__SCHEMA:
			setSchema((XSDSchema) newValue);
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
		case WSDLPackage.XSD_SCHEMA_EXTENSIBILITY_ELEMENT__DOCUMENT_BASE_URI:
			setDocumentBaseURI(DOCUMENT_BASE_URI_EDEFAULT);
			return;
		case WSDLPackage.XSD_SCHEMA_EXTENSIBILITY_ELEMENT__SCHEMA:
			setSchema((XSDSchema) null);
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
		case WSDLPackage.XSD_SCHEMA_EXTENSIBILITY_ELEMENT__DOCUMENT_BASE_URI:
			return DOCUMENT_BASE_URI_EDEFAULT == null ? documentBaseURI != null
					: !DOCUMENT_BASE_URI_EDEFAULT.equals(documentBaseURI);
		case WSDLPackage.XSD_SCHEMA_EXTENSIBILITY_ELEMENT__SCHEMA:
			return schema != null;
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
		result.append(" (documentBaseURI: "); //$NON-NLS-1$
		result.append(documentBaseURI);
		result.append(')');
		return result.toString();
	}

	@Override
	public void addImport(SchemaImport arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addInclude(SchemaReference arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addRedefine(SchemaReference arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public SchemaImport createImport() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SchemaReference createInclude() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SchemaReference createRedefine() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map getImports() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List getIncludes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List getRedefines() {
		// TODO Auto-generated method stub
		return null;
	}

} //XSDSchemaExtensibilityElementImpl
