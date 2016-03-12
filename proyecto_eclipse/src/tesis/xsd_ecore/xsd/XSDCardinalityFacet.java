/**
 */
package tesis.xsd_ecore.xsd;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XSD Cardinality Facet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDCardinalityFacet#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDCardinalityFacet()
 * @model
 * @generated
 */
public interface XSDCardinalityFacet extends XSDFundamentalFacet {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link tesis.xsd_ecore.xsd.XSDCardinality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see tesis.xsd_ecore.xsd.XSDCardinality
	 * @see #setValue(XSDCardinality)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDCardinalityFacet_Value()
	 * @model
	 * @generated
	 */
	XSDCardinality getValue();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDCardinalityFacet#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see tesis.xsd_ecore.xsd.XSDCardinality
	 * @see #getValue()
	 * @generated
	 */
	void setValue(XSDCardinality value);

} // XSDCardinalityFacet
