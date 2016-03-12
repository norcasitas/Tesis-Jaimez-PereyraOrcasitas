/**
 */
package tesis.xsd_ecore.xsd;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XSD Schema Directive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDSchemaDirective#getSchemaLocation <em>Schema Location</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDSchemaDirective#getResolvedSchema <em>Resolved Schema</em>}</li>
 * </ul>
 *
 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSchemaDirective()
 * @model abstract="true"
 * @generated
 */
public interface XSDSchemaDirective extends XSDSchemaContent {
	/**
	 * Returns the value of the '<em><b>Schema Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema Location</em>' attribute.
	 * @see #setSchemaLocation(String)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSchemaDirective_SchemaLocation()
	 * @model
	 * @generated
	 */
	String getSchemaLocation();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDSchemaDirective#getSchemaLocation <em>Schema Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema Location</em>' attribute.
	 * @see #getSchemaLocation()
	 * @generated
	 */
	void setSchemaLocation(String value);

	/**
	 * Returns the value of the '<em><b>Resolved Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolved Schema</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolved Schema</em>' reference.
	 * @see #setResolvedSchema(XSDSchema)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSchemaDirective_ResolvedSchema()
	 * @model resolveProxies="false"
	 * @generated
	 */
	XSDSchema getResolvedSchema();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDSchemaDirective#getResolvedSchema <em>Resolved Schema</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolved Schema</em>' reference.
	 * @see #getResolvedSchema()
	 * @generated
	 */
	void setResolvedSchema(XSDSchema value);

} // XSDSchemaDirective
