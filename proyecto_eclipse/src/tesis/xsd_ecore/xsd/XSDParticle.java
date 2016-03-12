/**
 */
package tesis.xsd_ecore.xsd;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XSD Particle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDParticle#getMinOccurs <em>Min Occurs</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDParticle#getMaxOccurs <em>Max Occurs</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDParticle#getContent <em>Content</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDParticle#getTerm <em>Term</em>}</li>
 * </ul>
 *
 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDParticle()
 * @model
 * @generated
 */
public interface XSDParticle extends XSDComplexTypeContent {
	/**
	 * Returns the value of the '<em><b>Min Occurs</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Occurs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Occurs</em>' attribute.
	 * @see #isSetMinOccurs()
	 * @see #unsetMinOccurs()
	 * @see #setMinOccurs(int)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDParticle_MinOccurs()
	 * @model default="1" unsettable="true"
	 * @generated
	 */
	int getMinOccurs();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDParticle#getMinOccurs <em>Min Occurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Occurs</em>' attribute.
	 * @see #isSetMinOccurs()
	 * @see #unsetMinOccurs()
	 * @see #getMinOccurs()
	 * @generated
	 */
	void setMinOccurs(int value);

	/**
	 * Unsets the value of the '{@link tesis.xsd_ecore.xsd.XSDParticle#getMinOccurs <em>Min Occurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinOccurs()
	 * @see #getMinOccurs()
	 * @see #setMinOccurs(int)
	 * @generated
	 */
	void unsetMinOccurs();

	/**
	 * Returns whether the value of the '{@link tesis.xsd_ecore.xsd.XSDParticle#getMinOccurs <em>Min Occurs</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min Occurs</em>' attribute is set.
	 * @see #unsetMinOccurs()
	 * @see #getMinOccurs()
	 * @see #setMinOccurs(int)
	 * @generated
	 */
	boolean isSetMinOccurs();

	/**
	 * Returns the value of the '<em><b>Max Occurs</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Occurs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Occurs</em>' attribute.
	 * @see #isSetMaxOccurs()
	 * @see #unsetMaxOccurs()
	 * @see #setMaxOccurs(int)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDParticle_MaxOccurs()
	 * @model default="1" unsettable="true"
	 * @generated
	 */
	int getMaxOccurs();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDParticle#getMaxOccurs <em>Max Occurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Occurs</em>' attribute.
	 * @see #isSetMaxOccurs()
	 * @see #unsetMaxOccurs()
	 * @see #getMaxOccurs()
	 * @generated
	 */
	void setMaxOccurs(int value);

	/**
	 * Unsets the value of the '{@link tesis.xsd_ecore.xsd.XSDParticle#getMaxOccurs <em>Max Occurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxOccurs()
	 * @see #getMaxOccurs()
	 * @see #setMaxOccurs(int)
	 * @generated
	 */
	void unsetMaxOccurs();

	/**
	 * Returns whether the value of the '{@link tesis.xsd_ecore.xsd.XSDParticle#getMaxOccurs <em>Max Occurs</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Occurs</em>' attribute is set.
	 * @see #unsetMaxOccurs()
	 * @see #getMaxOccurs()
	 * @see #setMaxOccurs(int)
	 * @generated
	 */
	boolean isSetMaxOccurs();

	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference.
	 * @see #setContent(XSDParticleContent)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDParticle_Content()
	 * @model containment="true" required="true"
	 * @generated
	 */
	XSDParticleContent getContent();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDParticle#getContent <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' containment reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(XSDParticleContent value);

	/**
	 * Returns the value of the '<em><b>Term</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Term</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Term</em>' reference.
	 * @see #setTerm(XSDTerm)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDParticle_Term()
	 * @model resolveProxies="false" required="true"
	 * @generated
	 */
	XSDTerm getTerm();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDParticle#getTerm <em>Term</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term</em>' reference.
	 * @see #getTerm()
	 * @generated
	 */
	void setTerm(XSDTerm value);

} // XSDParticle
