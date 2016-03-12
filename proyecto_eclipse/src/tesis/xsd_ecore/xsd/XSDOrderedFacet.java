/**
 */
package tesis.xsd_ecore.xsd;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XSD Ordered Facet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDOrderedFacet#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDOrderedFacet()
 * @model
 * @generated
 */
public interface XSDOrderedFacet extends XSDFundamentalFacet {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link tesis.xsd_ecore.xsd.XSDOrdered}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see tesis.xsd_ecore.xsd.XSDOrdered
	 * @see #setValue(XSDOrdered)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDOrderedFacet_Value()
	 * @model
	 * @generated
	 */
	XSDOrdered getValue();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDOrderedFacet#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see tesis.xsd_ecore.xsd.XSDOrdered
	 * @see #getValue()
	 * @generated
	 */
	void setValue(XSDOrdered value);

} // XSDOrderedFacet
