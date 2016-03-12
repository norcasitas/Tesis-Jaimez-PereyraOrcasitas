/**
 */
package tesis.wsdl_ecore.wsdl;

import javax.wsdl.extensions.schema.Schema;

import tesis.xsd_ecore.xsd.XSDSchema;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XSD Schema Extensibility Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tesis.wsdl_ecore.wsdl.XSDSchemaExtensibilityElement#getDocumentBaseURI <em>Document Base URI</em>}</li>
 *   <li>{@link tesis.wsdl_ecore.wsdl.XSDSchemaExtensibilityElement#getSchema <em>Schema</em>}</li>
 * </ul>
 *
 * @see tesis.wsdl_ecore.wsdl.WsdlPackage#getXSDSchemaExtensibilityElement()
 * @model superTypes="tesis.wsdl_ecore.wsdl.ExtensibilityElement tesis.wsdl_ecore.wsdl.ISchema"
 * @generated
 */
public interface XSDSchemaExtensibilityElement extends ExtensibilityElement, Schema {
	/**
	 * Returns the value of the '<em><b>Document Base URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Base URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Base URI</em>' attribute.
	 * @see #setDocumentBaseURI(String)
	 * @see tesis.wsdl_ecore.wsdl.WsdlPackage#getXSDSchemaExtensibilityElement_DocumentBaseURI()
	 * @model
	 * @generated
	 */
	String getDocumentBaseURI();

	/**
	 * Sets the value of the '{@link tesis.wsdl_ecore.wsdl.XSDSchemaExtensibilityElement#getDocumentBaseURI <em>Document Base URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Base URI</em>' attribute.
	 * @see #getDocumentBaseURI()
	 * @generated
	 */
	void setDocumentBaseURI(String value);

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' containment reference.
	 * @see #setSchema(XSDSchema)
	 * @see tesis.wsdl_ecore.wsdl.WsdlPackage#getXSDSchemaExtensibilityElement_Schema()
	 * @model containment="true"
	 * @generated
	 */
	XSDSchema getSchema();

	/**
	 * Sets the value of the '{@link tesis.wsdl_ecore.wsdl.XSDSchemaExtensibilityElement#getSchema <em>Schema</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema</em>' containment reference.
	 * @see #getSchema()
	 * @generated
	 */
	void setSchema(XSDSchema value);

} // XSDSchemaExtensibilityElement
