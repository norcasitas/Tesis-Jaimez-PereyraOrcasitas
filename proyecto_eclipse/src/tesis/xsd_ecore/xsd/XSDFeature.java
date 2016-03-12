/**
 */
package tesis.xsd_ecore.xsd;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XSD Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDFeature#getValue <em>Value</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDFeature#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDFeature#getForm <em>Form</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDFeature#getLexicalValue <em>Lexical Value</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDFeature#isGlobal <em>Global</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDFeature#isFeatureReference <em>Feature Reference</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDFeature#getScope <em>Scope</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDFeature#getResolvedFeature <em>Resolved Feature</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDFeature#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDFeature()
 * @model abstract="true"
 * @generated
 */
public interface XSDFeature extends XSDNamedComponent {
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
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDFeature_Value()
	 * @model dataType="tesis.xsd_ecore.xsd.Value"
	 * @generated
	 */
	Object getValue();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDFeature#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Object value);

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' attribute.
	 * The literals are from the enumeration {@link tesis.xsd_ecore.xsd.XSDConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' attribute.
	 * @see tesis.xsd_ecore.xsd.XSDConstraint
	 * @see #isSetConstraint()
	 * @see #unsetConstraint()
	 * @see #setConstraint(XSDConstraint)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDFeature_Constraint()
	 * @model unsettable="true"
	 * @generated
	 */
	XSDConstraint getConstraint();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDFeature#getConstraint <em>Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint</em>' attribute.
	 * @see tesis.xsd_ecore.xsd.XSDConstraint
	 * @see #isSetConstraint()
	 * @see #unsetConstraint()
	 * @see #getConstraint()
	 * @generated
	 */
	void setConstraint(XSDConstraint value);

	/**
	 * Unsets the value of the '{@link tesis.xsd_ecore.xsd.XSDFeature#getConstraint <em>Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConstraint()
	 * @see #getConstraint()
	 * @see #setConstraint(XSDConstraint)
	 * @generated
	 */
	void unsetConstraint();

	/**
	 * Returns whether the value of the '{@link tesis.xsd_ecore.xsd.XSDFeature#getConstraint <em>Constraint</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Constraint</em>' attribute is set.
	 * @see #unsetConstraint()
	 * @see #getConstraint()
	 * @see #setConstraint(XSDConstraint)
	 * @generated
	 */
	boolean isSetConstraint();

	/**
	 * Returns the value of the '<em><b>Form</b></em>' attribute.
	 * The literals are from the enumeration {@link tesis.xsd_ecore.xsd.XSDForm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Form</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form</em>' attribute.
	 * @see tesis.xsd_ecore.xsd.XSDForm
	 * @see #isSetForm()
	 * @see #unsetForm()
	 * @see #setForm(XSDForm)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDFeature_Form()
	 * @model unsettable="true"
	 * @generated
	 */
	XSDForm getForm();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDFeature#getForm <em>Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form</em>' attribute.
	 * @see tesis.xsd_ecore.xsd.XSDForm
	 * @see #isSetForm()
	 * @see #unsetForm()
	 * @see #getForm()
	 * @generated
	 */
	void setForm(XSDForm value);

	/**
	 * Unsets the value of the '{@link tesis.xsd_ecore.xsd.XSDFeature#getForm <em>Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetForm()
	 * @see #getForm()
	 * @see #setForm(XSDForm)
	 * @generated
	 */
	void unsetForm();

	/**
	 * Returns whether the value of the '{@link tesis.xsd_ecore.xsd.XSDFeature#getForm <em>Form</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Form</em>' attribute is set.
	 * @see #unsetForm()
	 * @see #getForm()
	 * @see #setForm(XSDForm)
	 * @generated
	 */
	boolean isSetForm();

	/**
	 * Returns the value of the '<em><b>Lexical Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lexical Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lexical Value</em>' attribute.
	 * @see #setLexicalValue(String)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDFeature_LexicalValue()
	 * @model
	 * @generated
	 */
	String getLexicalValue();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDFeature#getLexicalValue <em>Lexical Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lexical Value</em>' attribute.
	 * @see #getLexicalValue()
	 * @generated
	 */
	void setLexicalValue(String value);

	/**
	 * Returns the value of the '<em><b>Global</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global</em>' attribute.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDFeature_Global()
	 * @model changeable="false" volatile="true"
	 * @generated
	 */
	boolean isGlobal();

	/**
	 * Returns the value of the '<em><b>Feature Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Reference</em>' attribute.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDFeature_FeatureReference()
	 * @model changeable="false" volatile="true"
	 * @generated
	 */
	boolean isFeatureReference();

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' reference.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDFeature_Scope()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	XSDScope getScope();

	/**
	 * Returns the value of the '<em><b>Resolved Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolved Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolved Feature</em>' reference.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDFeature_ResolvedFeature()
	 * @model resolveProxies="false" required="true" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	XSDFeature getResolvedFeature();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDFeature_Type()
	 * @model resolveProxies="false" required="true" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	XSDTypeDefinition getType();

} // XSDFeature
