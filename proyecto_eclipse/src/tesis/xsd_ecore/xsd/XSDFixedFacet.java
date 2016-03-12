/**
 */
package tesis.xsd_ecore.xsd;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XSD Fixed Facet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDFixedFacet#isFixed <em>Fixed</em>}</li>
 * </ul>
 *
 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDFixedFacet()
 * @model abstract="true"
 * @generated
 */
public interface XSDFixedFacet extends XSDConstrainingFacet {
	/**
	 * Returns the value of the '<em><b>Fixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed</em>' attribute.
	 * @see #isSetFixed()
	 * @see #unsetFixed()
	 * @see #setFixed(boolean)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDFixedFacet_Fixed()
	 * @model unsettable="true"
	 * @generated
	 */
	boolean isFixed();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDFixedFacet#isFixed <em>Fixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed</em>' attribute.
	 * @see #isSetFixed()
	 * @see #unsetFixed()
	 * @see #isFixed()
	 * @generated
	 */
	void setFixed(boolean value);

	/**
	 * Unsets the value of the '{@link tesis.xsd_ecore.xsd.XSDFixedFacet#isFixed <em>Fixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFixed()
	 * @see #isFixed()
	 * @see #setFixed(boolean)
	 * @generated
	 */
	void unsetFixed();

	/**
	 * Returns whether the value of the '{@link tesis.xsd_ecore.xsd.XSDFixedFacet#isFixed <em>Fixed</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fixed</em>' attribute is set.
	 * @see #unsetFixed()
	 * @see #isFixed()
	 * @see #setFixed(boolean)
	 * @generated
	 */
	boolean isSetFixed();

} // XSDFixedFacet
