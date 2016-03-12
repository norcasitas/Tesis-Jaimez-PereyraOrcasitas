/**
 */
package tesis.xsd_ecore.xsd;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XSD Repeatable Facet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDRepeatableFacet#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDRepeatableFacet()
 * @model abstract="true"
 * @generated
 */
public interface XSDRepeatableFacet extends XSDConstrainingFacet {
	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' reference list.
	 * The list contents are of type {@link tesis.xsd_ecore.xsd.XSDAnnotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' reference list.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDRepeatableFacet_Annotations()
	 * @model resolveProxies="false"
	 * @generated
	 */
	EList<XSDAnnotation> getAnnotations();

} // XSDRepeatableFacet
