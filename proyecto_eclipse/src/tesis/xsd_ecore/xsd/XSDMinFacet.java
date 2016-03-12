/**
 */
package tesis.xsd_ecore.xsd;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XSD Min Facet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDMinFacet#getValue <em>Value</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDMinFacet#isInclusive <em>Inclusive</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDMinFacet#isExclusive <em>Exclusive</em>}</li>
 * </ul>
 *
 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDMinFacet()
 * @model abstract="true"
 * @generated
 */
public interface XSDMinFacet extends XSDFixedFacet {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Object)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDMinFacet_Value()
	 * @model dataType="tesis.xsd_ecore.xsd.Value"
	 * @generated
	 */
	Object getValue();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDMinFacet#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Object value);

	/**
	 * Returns the value of the '<em><b>Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inclusive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inclusive</em>' attribute.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDMinFacet_Inclusive()
	 * @model changeable="false" volatile="true"
	 * @generated
	 */
	boolean isInclusive();

	/**
	 * Returns the value of the '<em><b>Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exclusive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclusive</em>' attribute.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDMinFacet_Exclusive()
	 * @model changeable="false" volatile="true"
	 * @generated
	 */
	boolean isExclusive();

} // XSDMinFacet
