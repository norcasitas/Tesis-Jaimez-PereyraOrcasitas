/**
 */
package tesis.xsd_ecore.xsd;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XSD Attribute Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDAttributeDeclaration#isAttributeDeclarationReference <em>Attribute Declaration Reference</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDAttributeDeclaration#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDAttributeDeclaration#getAnonymousTypeDefinition <em>Anonymous Type Definition</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDAttributeDeclaration#getTypeDefinition <em>Type Definition</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDAttributeDeclaration#getResolvedAttributeDeclaration <em>Resolved Attribute Declaration</em>}</li>
 * </ul>
 *
 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDAttributeDeclaration()
 * @model
 * @generated
 */
public interface XSDAttributeDeclaration extends XSDFeature, XSDSchemaContent {
	/**
	 * Returns the value of the '<em><b>Attribute Declaration Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Declaration Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Declaration Reference</em>' attribute.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDAttributeDeclaration_AttributeDeclarationReference()
	 * @model changeable="false" volatile="true"
	 * @generated
	 */
	boolean isAttributeDeclarationReference();

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
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDAttributeDeclaration_Annotation()
	 * @model containment="true"
	 * @generated
	 */
	XSDAnnotation getAnnotation();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDAttributeDeclaration#getAnnotation <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation</em>' containment reference.
	 * @see #getAnnotation()
	 * @generated
	 */
	void setAnnotation(XSDAnnotation value);

	/**
	 * Returns the value of the '<em><b>Anonymous Type Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anonymous Type Definition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anonymous Type Definition</em>' containment reference.
	 * @see #setAnonymousTypeDefinition(XSDSimpleTypeDefinition)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDAttributeDeclaration_AnonymousTypeDefinition()
	 * @model containment="true"
	 * @generated
	 */
	XSDSimpleTypeDefinition getAnonymousTypeDefinition();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDAttributeDeclaration#getAnonymousTypeDefinition <em>Anonymous Type Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anonymous Type Definition</em>' containment reference.
	 * @see #getAnonymousTypeDefinition()
	 * @generated
	 */
	void setAnonymousTypeDefinition(XSDSimpleTypeDefinition value);

	/**
	 * Returns the value of the '<em><b>Type Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Definition</em>' reference.
	 * @see #setTypeDefinition(XSDSimpleTypeDefinition)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDAttributeDeclaration_TypeDefinition()
	 * @model resolveProxies="false" required="true"
	 * @generated
	 */
	XSDSimpleTypeDefinition getTypeDefinition();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDAttributeDeclaration#getTypeDefinition <em>Type Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Definition</em>' reference.
	 * @see #getTypeDefinition()
	 * @generated
	 */
	void setTypeDefinition(XSDSimpleTypeDefinition value);

	/**
	 * Returns the value of the '<em><b>Resolved Attribute Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolved Attribute Declaration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolved Attribute Declaration</em>' reference.
	 * @see #setResolvedAttributeDeclaration(XSDAttributeDeclaration)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDAttributeDeclaration_ResolvedAttributeDeclaration()
	 * @model resolveProxies="false" required="true"
	 * @generated
	 */
	XSDAttributeDeclaration getResolvedAttributeDeclaration();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDAttributeDeclaration#getResolvedAttributeDeclaration <em>Resolved Attribute Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolved Attribute Declaration</em>' reference.
	 * @see #getResolvedAttributeDeclaration()
	 * @generated
	 */
	void setResolvedAttributeDeclaration(XSDAttributeDeclaration value);

} // XSDAttributeDeclaration
