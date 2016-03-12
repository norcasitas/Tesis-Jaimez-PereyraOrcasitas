/**
 */
package tesis.xsd_ecore.xsd;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XSD Enumeration Facet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDEnumerationFacet#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDEnumerationFacet()
 * @model
 * @generated
 */
public interface XSDEnumerationFacet extends XSDRepeatableFacet {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute list.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDEnumerationFacet_Value()
	 * @model dataType="tesis.xsd_ecore.xsd.Value"
	 * @generated
	 */
	EList<Object> getValue();

} // XSDEnumerationFacet
