/**
 */
package tesis.wsdl_ecore.wsdl;

import tesis.xsd_ecore.xsd.XSDSchema;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents WSDL import element. WSDL allows associating a namespace with a document location using an import element.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tesis.wsdl_ecore.wsdl.Import#getNamespaceURI <em>Namespace URI</em>}</li>
 *   <li>{@link tesis.wsdl_ecore.wsdl.Import#getLocationURI <em>Location URI</em>}</li>
 *   <li>{@link tesis.wsdl_ecore.wsdl.Import#getEDefinition <em>EDefinition</em>}</li>
 *   <li>{@link tesis.wsdl_ecore.wsdl.Import#getESchema <em>ESchema</em>}</li>
 * </ul>
 *
 * @see tesis.wsdl_ecore.wsdl.WsdlPackage#getImport()
 * @model superTypes="tesis.wsdl_ecore.wsdl.ExtensibleElement tesis.wsdl_ecore.wsdl.IImport"
 * @generated
 */
public interface Import extends ExtensibleElement, javax.wsdl.Import {
	/**
	 * Returns the value of the '<em><b>Namespace URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespace URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace URI</em>' attribute.
	 * @see #setNamespaceURI(String)
	 * @see tesis.wsdl_ecore.wsdl.WsdlPackage#getImport_NamespaceURI()
	 * @model
	 * @generated
	 */
	String getNamespaceURI();

	/**
	 * Sets the value of the '{@link tesis.wsdl_ecore.wsdl.Import#getNamespaceURI <em>Namespace URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace URI</em>' attribute.
	 * @see #getNamespaceURI()
	 * @generated
	 */
	void setNamespaceURI(String value);

	/**
	 * Returns the value of the '<em><b>Location URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location URI</em>' attribute.
	 * @see #setLocationURI(String)
	 * @see tesis.wsdl_ecore.wsdl.WsdlPackage#getImport_LocationURI()
	 * @model
	 * @generated
	 */
	String getLocationURI();

	/**
	 * Sets the value of the '{@link tesis.wsdl_ecore.wsdl.Import#getLocationURI <em>Location URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location URI</em>' attribute.
	 * @see #getLocationURI()
	 * @generated
	 */
	void setLocationURI(String value);

	/**
	 * Returns the value of the '<em><b>EDefinition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EDefinition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EDefinition</em>' reference.
	 * @see #setEDefinition(Definition)
	 * @see tesis.wsdl_ecore.wsdl.WsdlPackage#getImport_EDefinition()
	 * @model
	 * @generated
	 */
	Definition getEDefinition();

	/**
	 * Sets the value of the '{@link tesis.wsdl_ecore.wsdl.Import#getEDefinition <em>EDefinition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EDefinition</em>' reference.
	 * @see #getEDefinition()
	 * @generated
	 */
	void setEDefinition(Definition value);

	/**
	 * Returns the value of the '<em><b>ESchema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ESchema</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ESchema</em>' reference.
	 * @see #setESchema(XSDSchema)
	 * @see tesis.wsdl_ecore.wsdl.WsdlPackage#getImport_ESchema()
	 * @model
	 * @generated
	 */
	XSDSchema getESchema();

	/**
	 * Sets the value of the '{@link tesis.wsdl_ecore.wsdl.Import#getESchema <em>ESchema</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ESchema</em>' reference.
	 * @see #getESchema()
	 * @generated
	 */
	void setESchema(XSDSchema value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	XSDSchema getSchema();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setSchema(XSDSchema schema);

} // Import
