/**
 */
package tesis.xsd_ecore.xsd;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XSD Redefinable Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDRedefinableComponent#isCircular <em>Circular</em>}</li>
 * </ul>
 *
 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDRedefinableComponent()
 * @model abstract="true"
 * @generated
 */
public interface XSDRedefinableComponent extends XSDNamedComponent, XSDRedefineContent {
	/**
	 * Returns the value of the '<em><b>Circular</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Circular</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Circular</em>' attribute.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDRedefinableComponent_Circular()
	 * @model changeable="false" volatile="true"
	 * @generated
	 */
	boolean isCircular();

} // XSDRedefinableComponent
