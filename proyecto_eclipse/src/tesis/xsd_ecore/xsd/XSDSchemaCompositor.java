/**
 */
package tesis.xsd_ecore.xsd;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XSD Schema Compositor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDSchemaCompositor#getIncorporatedSchema <em>Incorporated Schema</em>}</li>
 * </ul>
 *
 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSchemaCompositor()
 * @model abstract="true"
 * @generated
 */
public interface XSDSchemaCompositor extends XSDSchemaDirective {
	/**
	 * Returns the value of the '<em><b>Incorporated Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incorporated Schema</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incorporated Schema</em>' reference.
	 * @see #setIncorporatedSchema(XSDSchema)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSchemaCompositor_IncorporatedSchema()
	 * @model resolveProxies="false"
	 * @generated
	 */
	XSDSchema getIncorporatedSchema();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDSchemaCompositor#getIncorporatedSchema <em>Incorporated Schema</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incorporated Schema</em>' reference.
	 * @see #getIncorporatedSchema()
	 * @generated
	 */
	void setIncorporatedSchema(XSDSchema value);

} // XSDSchemaCompositor
