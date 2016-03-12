/**
 */
package tesis.xsd_ecore.xsd;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XSD Named Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDNamedComponent#getName <em>Name</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDNamedComponent#getTargetNamespace <em>Target Namespace</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDNamedComponent#getAliasName <em>Alias Name</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDNamedComponent#getURI <em>URI</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDNamedComponent#getAliasURI <em>Alias URI</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDNamedComponent#getQName <em>QName</em>}</li>
 * </ul>
 *
 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDNamedComponent()
 * @model abstract="true"
 * @generated
 */
public interface XSDNamedComponent extends XSDComponent {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDNamedComponent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDNamedComponent#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Namespace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Namespace</em>' attribute.
	 * @see #setTargetNamespace(String)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDNamedComponent_TargetNamespace()
	 * @model
	 * @generated
	 */
	String getTargetNamespace();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDNamedComponent#getTargetNamespace <em>Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Namespace</em>' attribute.
	 * @see #getTargetNamespace()
	 * @generated
	 */
	void setTargetNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alias Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias Name</em>' attribute.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDNamedComponent_AliasName()
	 * @model changeable="false" volatile="true"
	 * @generated
	 */
	String getAliasName();

	/**
	 * Returns the value of the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>URI</em>' attribute.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDNamedComponent_URI()
	 * @model changeable="false" volatile="true"
	 * @generated
	 */
	String getURI();

	/**
	 * Returns the value of the '<em><b>Alias URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alias URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias URI</em>' attribute.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDNamedComponent_AliasURI()
	 * @model changeable="false" volatile="true"
	 * @generated
	 */
	String getAliasURI();

	/**
	 * Returns the value of the '<em><b>QName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>QName</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QName</em>' attribute.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDNamedComponent_QName()
	 * @model changeable="false" volatile="true"
	 * @generated
	 */
	String getQName();

} // XSDNamedComponent
