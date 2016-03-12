/**
 */
package tesis.xsd_ecore.xsd;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XSD Notation Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDNotationDeclaration#getSystemIdentifier <em>System Identifier</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDNotationDeclaration#getPublicIdentifier <em>Public Identifier</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDNotationDeclaration#getAnnotation <em>Annotation</em>}</li>
 * </ul>
 *
 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDNotationDeclaration()
 * @model
 * @generated
 */
public interface XSDNotationDeclaration extends XSDNamedComponent, XSDSchemaContent {
	/**
	 * Returns the value of the '<em><b>System Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Identifier</em>' attribute.
	 * @see #setSystemIdentifier(String)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDNotationDeclaration_SystemIdentifier()
	 * @model
	 * @generated
	 */
	String getSystemIdentifier();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDNotationDeclaration#getSystemIdentifier <em>System Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Identifier</em>' attribute.
	 * @see #getSystemIdentifier()
	 * @generated
	 */
	void setSystemIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Public Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Public Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Public Identifier</em>' attribute.
	 * @see #setPublicIdentifier(String)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDNotationDeclaration_PublicIdentifier()
	 * @model
	 * @generated
	 */
	String getPublicIdentifier();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDNotationDeclaration#getPublicIdentifier <em>Public Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Public Identifier</em>' attribute.
	 * @see #getPublicIdentifier()
	 * @generated
	 */
	void setPublicIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference.
	 * @see #setAnnotation(XSDAnnotation)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDNotationDeclaration_Annotation()
	 * @model containment="true"
	 * @generated
	 */
	XSDAnnotation getAnnotation();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDNotationDeclaration#getAnnotation <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation</em>' containment reference.
	 * @see #getAnnotation()
	 * @generated
	 */
	void setAnnotation(XSDAnnotation value);

} // XSDNotationDeclaration
