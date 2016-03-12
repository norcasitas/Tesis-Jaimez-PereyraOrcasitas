/**
 */
package tesis.xsd_ecore.xsd;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XSD Facet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDFacet#getLexicalValue <em>Lexical Value</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDFacet#getFacetName <em>Facet Name</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDFacet#getEffectiveValue <em>Effective Value</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDFacet#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDFacet#getSimpleTypeDefinition <em>Simple Type Definition</em>}</li>
 * </ul>
 *
 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDFacet()
 * @model abstract="true"
 * @generated
 */
public interface XSDFacet extends XSDComponent {
	/**
	 * Returns the value of the '<em><b>Lexical Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lexical Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lexical Value</em>' attribute.
	 * @see #setLexicalValue(String)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDFacet_LexicalValue()
	 * @model
	 * @generated
	 */
	String getLexicalValue();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDFacet#getLexicalValue <em>Lexical Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lexical Value</em>' attribute.
	 * @see #getLexicalValue()
	 * @generated
	 */
	void setLexicalValue(String value);

	/**
	 * Returns the value of the '<em><b>Facet Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facet Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facet Name</em>' attribute.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDFacet_FacetName()
	 * @model changeable="false" volatile="true"
	 * @generated
	 */
	String getFacetName();

	/**
	 * Returns the value of the '<em><b>Effective Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effective Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effective Value</em>' attribute.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDFacet_EffectiveValue()
	 * @model dataType="tesis.xsd_ecore.xsd.Value" changeable="false" volatile="true"
	 * @generated
	 */
	Object getEffectiveValue();

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
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDFacet_Annotation()
	 * @model containment="true"
	 * @generated
	 */
	XSDAnnotation getAnnotation();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDFacet#getAnnotation <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation</em>' containment reference.
	 * @see #getAnnotation()
	 * @generated
	 */
	void setAnnotation(XSDAnnotation value);

	/**
	 * Returns the value of the '<em><b>Simple Type Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple Type Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Type Definition</em>' reference.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDFacet_SimpleTypeDefinition()
	 * @model resolveProxies="false" changeable="false" volatile="true"
	 * @generated
	 */
	XSDSimpleTypeDefinition getSimpleTypeDefinition();

} // XSDFacet
