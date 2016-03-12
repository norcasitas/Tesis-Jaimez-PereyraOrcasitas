/**
 */
package tesis.xsd_ecore.xsd;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XSD Attribute Use</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDAttributeUse#isRequired <em>Required</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDAttributeUse#getValue <em>Value</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDAttributeUse#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDAttributeUse#getUse <em>Use</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDAttributeUse#getLexicalValue <em>Lexical Value</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDAttributeUse#getAttributeDeclaration <em>Attribute Declaration</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDAttributeUse#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDAttributeUse()
 * @model
 * @generated
 */
public interface XSDAttributeUse extends XSDComponent, XSDAttributeGroupContent {
	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #setRequired(boolean)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDAttributeUse_Required()
	 * @model
	 * @generated
	 */
	boolean isRequired();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDAttributeUse#isRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #isRequired()
	 * @generated
	 */
	void setRequired(boolean value);

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
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDAttributeUse_Value()
	 * @model dataType="tesis.xsd_ecore.xsd.Value"
	 * @generated
	 */
	Object getValue();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDAttributeUse#getValue <em>Value</em>}' attribute.
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
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDAttributeUse_Constraint()
	 * @model unsettable="true"
	 * @generated
	 */
	XSDConstraint getConstraint();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDAttributeUse#getConstraint <em>Constraint</em>}' attribute.
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
	 * Unsets the value of the '{@link tesis.xsd_ecore.xsd.XSDAttributeUse#getConstraint <em>Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConstraint()
	 * @see #getConstraint()
	 * @see #setConstraint(XSDConstraint)
	 * @generated
	 */
	void unsetConstraint();

	/**
	 * Returns whether the value of the '{@link tesis.xsd_ecore.xsd.XSDAttributeUse#getConstraint <em>Constraint</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Use</b></em>' attribute.
	 * The literals are from the enumeration {@link tesis.xsd_ecore.xsd.XSDAttributeUseCategory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use</em>' attribute.
	 * @see tesis.xsd_ecore.xsd.XSDAttributeUseCategory
	 * @see #isSetUse()
	 * @see #unsetUse()
	 * @see #setUse(XSDAttributeUseCategory)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDAttributeUse_Use()
	 * @model unsettable="true"
	 * @generated
	 */
	XSDAttributeUseCategory getUse();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDAttributeUse#getUse <em>Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use</em>' attribute.
	 * @see tesis.xsd_ecore.xsd.XSDAttributeUseCategory
	 * @see #isSetUse()
	 * @see #unsetUse()
	 * @see #getUse()
	 * @generated
	 */
	void setUse(XSDAttributeUseCategory value);

	/**
	 * Unsets the value of the '{@link tesis.xsd_ecore.xsd.XSDAttributeUse#getUse <em>Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUse()
	 * @see #getUse()
	 * @see #setUse(XSDAttributeUseCategory)
	 * @generated
	 */
	void unsetUse();

	/**
	 * Returns whether the value of the '{@link tesis.xsd_ecore.xsd.XSDAttributeUse#getUse <em>Use</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Use</em>' attribute is set.
	 * @see #unsetUse()
	 * @see #getUse()
	 * @see #setUse(XSDAttributeUseCategory)
	 * @generated
	 */
	boolean isSetUse();

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
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDAttributeUse_LexicalValue()
	 * @model
	 * @generated
	 */
	String getLexicalValue();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDAttributeUse#getLexicalValue <em>Lexical Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lexical Value</em>' attribute.
	 * @see #getLexicalValue()
	 * @generated
	 */
	void setLexicalValue(String value);

	/**
	 * Returns the value of the '<em><b>Attribute Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Declaration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Declaration</em>' reference.
	 * @see #setAttributeDeclaration(XSDAttributeDeclaration)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDAttributeUse_AttributeDeclaration()
	 * @model resolveProxies="false" required="true"
	 * @generated
	 */
	XSDAttributeDeclaration getAttributeDeclaration();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDAttributeUse#getAttributeDeclaration <em>Attribute Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Declaration</em>' reference.
	 * @see #getAttributeDeclaration()
	 * @generated
	 */
	void setAttributeDeclaration(XSDAttributeDeclaration value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference.
	 * @see #setContent(XSDAttributeDeclaration)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDAttributeUse_Content()
	 * @model containment="true" required="true"
	 * @generated
	 */
	XSDAttributeDeclaration getContent();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDAttributeUse#getContent <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' containment reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(XSDAttributeDeclaration value);

} // XSDAttributeUse
