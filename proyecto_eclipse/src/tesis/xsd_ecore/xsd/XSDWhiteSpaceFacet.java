/**
 */
package tesis.xsd_ecore.xsd;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XSD White Space Facet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDWhiteSpaceFacet#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDWhiteSpaceFacet()
 * @model
 * @generated
 */
public interface XSDWhiteSpaceFacet extends XSDFixedFacet {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link tesis.xsd_ecore.xsd.XSDWhiteSpace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see tesis.xsd_ecore.xsd.XSDWhiteSpace
	 * @see #setValue(XSDWhiteSpace)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDWhiteSpaceFacet_Value()
	 * @model
	 * @generated
	 */
	XSDWhiteSpace getValue();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDWhiteSpaceFacet#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see tesis.xsd_ecore.xsd.XSDWhiteSpace
	 * @see #getValue()
	 * @generated
	 */
	void setValue(XSDWhiteSpace value);

} // XSDWhiteSpaceFacet
