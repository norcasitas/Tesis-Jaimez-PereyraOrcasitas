/**
 */
package tesis.unrc.wsdl.wsdl;

import javax.wsdl.extensions.schema.Schema;

import org.eclipse.xsd.XSDSchema;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XSD Schema Extensibility Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tesis.unrc.wsdl.wsdl.XSDSchemaExtensibilityElement#getDocumentBaseURI <em>Document Base URI</em>}</li>
 *   <li>{@link tesis.unrc.wsdl.wsdl.XSDSchemaExtensibilityElement#getSchema <em>Schema</em>}</li>
 * </ul>
 *
 * @see tesis.unrc.wsdl.wsdl.WSDLPackage#getXSDSchemaExtensibilityElement()
 * @model superTypes="tesis.unrc.wsdl.wsdl.ExtensibilityElement tesis.unrc.wsdl.wsdl.ISchema"
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
	 * @see tesis.unrc.wsdl.wsdl.WSDLPackage#getXSDSchemaExtensibilityElement_DocumentBaseURI()
	 * @model
	 * @generated
	 */
	String getDocumentBaseURI();

	/**
	 * Sets the value of the '{@link tesis.unrc.wsdl.wsdl.XSDSchemaExtensibilityElement#getDocumentBaseURI <em>Document Base URI</em>}' attribute.
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
	 * @see tesis.unrc.wsdl.wsdl.WSDLPackage#getXSDSchemaExtensibilityElement_Schema()
	 * @model containment="true"
	 * @generated
	 */
	XSDSchema getSchema();

	/**
	 * Sets the value of the '{@link tesis.unrc.wsdl.wsdl.XSDSchemaExtensibilityElement#getSchema <em>Schema</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema</em>' containment reference.
	 * @see #getSchema()
	 * @generated
	 */
	void setSchema(XSDSchema value);

} // XSDSchemaExtensibilityElement
