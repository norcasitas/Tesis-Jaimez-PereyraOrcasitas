/**
 */
package tesis.xsd_ecore.xsd;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XSDX Path Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDXPathDefinition#getVariety <em>Variety</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDXPathDefinition#getValue <em>Value</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDXPathDefinition#getAnnotation <em>Annotation</em>}</li>
 * </ul>
 *
 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDXPathDefinition()
 * @model
 * @generated
 */
public interface XSDXPathDefinition extends XSDComponent {
	/**
	 * Returns the value of the '<em><b>Variety</b></em>' attribute.
	 * The literals are from the enumeration {@link tesis.xsd_ecore.xsd.XSDXPathVariety}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variety</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variety</em>' attribute.
	 * @see tesis.xsd_ecore.xsd.XSDXPathVariety
	 * @see #setVariety(XSDXPathVariety)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDXPathDefinition_Variety()
	 * @model
	 * @generated
	 */
	XSDXPathVariety getVariety();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDXPathDefinition#getVariety <em>Variety</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variety</em>' attribute.
	 * @see tesis.xsd_ecore.xsd.XSDXPathVariety
	 * @see #getVariety()
	 * @generated
	 */
	void setVariety(XSDXPathVariety value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDXPathDefinition_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDXPathDefinition#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

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
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDXPathDefinition_Annotation()
	 * @model containment="true"
	 * @generated
	 */
	XSDAnnotation getAnnotation();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDXPathDefinition#getAnnotation <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation</em>' containment reference.
	 * @see #getAnnotation()
	 * @generated
	 */
	void setAnnotation(XSDAnnotation value);

} // XSDXPathDefinition
