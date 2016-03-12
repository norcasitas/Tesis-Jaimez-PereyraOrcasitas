/**
 */
package tesis.xsd_ecore.xsd;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XSD Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDTypeDefinition#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDTypeDefinition#getDerivationAnnotation <em>Derivation Annotation</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDTypeDefinition#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDTypeDefinition#getRootType <em>Root Type</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDTypeDefinition#getBaseType <em>Base Type</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDTypeDefinition#getSimpleType <em>Simple Type</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDTypeDefinition#getComplexType <em>Complex Type</em>}</li>
 * </ul>
 *
 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDTypeDefinition()
 * @model abstract="true"
 * @generated
 */
public interface XSDTypeDefinition extends XSDRedefinableComponent, XSDRedefineContent {
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
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDTypeDefinition_Annotation()
	 * @model containment="true"
	 * @generated
	 */
	XSDAnnotation getAnnotation();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDTypeDefinition#getAnnotation <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation</em>' containment reference.
	 * @see #getAnnotation()
	 * @generated
	 */
	void setAnnotation(XSDAnnotation value);

	/**
	 * Returns the value of the '<em><b>Derivation Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derivation Annotation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derivation Annotation</em>' containment reference.
	 * @see #setDerivationAnnotation(XSDAnnotation)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDTypeDefinition_DerivationAnnotation()
	 * @model containment="true"
	 * @generated
	 */
	XSDAnnotation getDerivationAnnotation();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDTypeDefinition#getDerivationAnnotation <em>Derivation Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derivation Annotation</em>' containment reference.
	 * @see #getDerivationAnnotation()
	 * @generated
	 */
	void setDerivationAnnotation(XSDAnnotation value);

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
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDTypeDefinition_Annotations()
	 * @model resolveProxies="false"
	 * @generated
	 */
	EList<XSDAnnotation> getAnnotations();

	/**
	 * Returns the value of the '<em><b>Root Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Type</em>' reference.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDTypeDefinition_RootType()
	 * @model resolveProxies="false" required="true" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	XSDTypeDefinition getRootType();

	/**
	 * Returns the value of the '<em><b>Base Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Type</em>' reference.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDTypeDefinition_BaseType()
	 * @model resolveProxies="false" required="true" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	XSDTypeDefinition getBaseType();

	/**
	 * Returns the value of the '<em><b>Simple Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Type</em>' reference.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDTypeDefinition_SimpleType()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	XSDSimpleTypeDefinition getSimpleType();

	/**
	 * Returns the value of the '<em><b>Complex Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complex Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complex Type</em>' reference.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDTypeDefinition_ComplexType()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	XSDParticle getComplexType();

} // XSDTypeDefinition
