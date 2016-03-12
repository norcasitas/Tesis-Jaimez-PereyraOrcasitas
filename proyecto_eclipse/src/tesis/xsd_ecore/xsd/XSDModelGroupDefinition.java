/**
 */
package tesis.xsd_ecore.xsd;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XSD Model Group Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDModelGroupDefinition#isModelGroupDefinitionReference <em>Model Group Definition Reference</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDModelGroupDefinition#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDModelGroupDefinition#getModelGroup <em>Model Group</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDModelGroupDefinition#getResolvedModelGroupDefinition <em>Resolved Model Group Definition</em>}</li>
 * </ul>
 *
 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDModelGroupDefinition()
 * @model
 * @generated
 */
public interface XSDModelGroupDefinition extends XSDRedefinableComponent, XSDParticleContent, XSDRedefineContent {
	/**
	 * Returns the value of the '<em><b>Model Group Definition Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Group Definition Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Group Definition Reference</em>' attribute.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDModelGroupDefinition_ModelGroupDefinitionReference()
	 * @model changeable="false" volatile="true"
	 * @generated
	 */
	boolean isModelGroupDefinitionReference();

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
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDModelGroupDefinition_Annotation()
	 * @model containment="true"
	 * @generated
	 */
	XSDAnnotation getAnnotation();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDModelGroupDefinition#getAnnotation <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation</em>' containment reference.
	 * @see #getAnnotation()
	 * @generated
	 */
	void setAnnotation(XSDAnnotation value);

	/**
	 * Returns the value of the '<em><b>Model Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Group</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Group</em>' containment reference.
	 * @see #setModelGroup(XSDModelGroup)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDModelGroupDefinition_ModelGroup()
	 * @model containment="true" required="true"
	 * @generated
	 */
	XSDModelGroup getModelGroup();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDModelGroupDefinition#getModelGroup <em>Model Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Group</em>' containment reference.
	 * @see #getModelGroup()
	 * @generated
	 */
	void setModelGroup(XSDModelGroup value);

	/**
	 * Returns the value of the '<em><b>Resolved Model Group Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolved Model Group Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolved Model Group Definition</em>' reference.
	 * @see #setResolvedModelGroupDefinition(XSDModelGroupDefinition)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDModelGroupDefinition_ResolvedModelGroupDefinition()
	 * @model resolveProxies="false" required="true"
	 * @generated
	 */
	XSDModelGroupDefinition getResolvedModelGroupDefinition();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDModelGroupDefinition#getResolvedModelGroupDefinition <em>Resolved Model Group Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolved Model Group Definition</em>' reference.
	 * @see #getResolvedModelGroupDefinition()
	 * @generated
	 */
	void setResolvedModelGroupDefinition(XSDModelGroupDefinition value);

} // XSDModelGroupDefinition
