/**
 */
package tesis.unrc.wsdl.wsdl;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.util.EList;

import org.w3c.dom.Document;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a WSDL definitions element. The WSDL definitions element is the root element of a WSDL document.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tesis.unrc.wsdl.wsdl.Definition#getTargetNamespace <em>Target Namespace</em>}</li>
 *   <li>{@link tesis.unrc.wsdl.wsdl.Definition#getLocation <em>Location</em>}</li>
 *   <li>{@link tesis.unrc.wsdl.wsdl.Definition#getQName <em>QName</em>}</li>
 *   <li>{@link tesis.unrc.wsdl.wsdl.Definition#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link tesis.unrc.wsdl.wsdl.Definition#getEImports <em>EImports</em>}</li>
 *   <li>{@link tesis.unrc.wsdl.wsdl.Definition#getETypes <em>ETypes</em>}</li>
 *   <li>{@link tesis.unrc.wsdl.wsdl.Definition#getEMessages <em>EMessages</em>}</li>
 *   <li>{@link tesis.unrc.wsdl.wsdl.Definition#getEPortTypes <em>EPort Types</em>}</li>
 *   <li>{@link tesis.unrc.wsdl.wsdl.Definition#getEBindings <em>EBindings</em>}</li>
 *   <li>{@link tesis.unrc.wsdl.wsdl.Definition#getEServices <em>EServices</em>}</li>
 *   <li>{@link tesis.unrc.wsdl.wsdl.Definition#getENamespaces <em>ENamespaces</em>}</li>
 * </ul>
 *
 * @see tesis.unrc.wsdl.wsdl.WSDLPackage#getDefinition()
 * @model superTypes="tesis.unrc.wsdl.wsdl.ExtensibleElement tesis.unrc.wsdl.wsdl.IDefinition"
 * @generated
 */
public interface Definition extends ExtensibleElement, javax.wsdl.Definition {
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
	 * @see tesis.unrc.wsdl.wsdl.WSDLPackage#getDefinition_TargetNamespace()
	 * @model
	 * @generated
	 */
	String getTargetNamespace();

	/**
	 * Sets the value of the '{@link tesis.unrc.wsdl.wsdl.Definition#getTargetNamespace <em>Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Namespace</em>' attribute.
	 * @see #getTargetNamespace()
	 * @generated
	 */
	void setTargetNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see tesis.unrc.wsdl.wsdl.WSDLPackage#getDefinition_Location()
	 * @model
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link tesis.unrc.wsdl.wsdl.Definition#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>QName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>QName</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QName</em>' attribute.
	 * @see #setQName(QName)
	 * @see tesis.unrc.wsdl.wsdl.WSDLPackage#getDefinition_QName()
	 * @model dataType="tesis.unrc.wsdl.wsdl.QName"
	 * @generated
	 */
	QName getQName();

	/**
	 * Sets the value of the '{@link tesis.unrc.wsdl.wsdl.Definition#getQName <em>QName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>QName</em>' attribute.
	 * @see #getQName()
	 * @generated
	 */
	void setQName(QName value);

	/**
	 * Returns the value of the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encoding</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encoding</em>' attribute.
	 * @see #setEncoding(String)
	 * @see tesis.unrc.wsdl.wsdl.WSDLPackage#getDefinition_Encoding()
	 * @model
	 * @generated
	 */
	String getEncoding();

	/**
	 * Sets the value of the '{@link tesis.unrc.wsdl.wsdl.Definition#getEncoding <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encoding</em>' attribute.
	 * @see #getEncoding()
	 * @generated
	 */
	void setEncoding(String value);

	/**
	 * Returns the value of the '<em><b>EImports</b></em>' containment reference list.
	 * The list contents are of type {@link tesis.unrc.wsdl.wsdl.Import}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EImports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EImports</em>' containment reference list.
	 * @see tesis.unrc.wsdl.wsdl.WSDLPackage#getDefinition_EImports()
	 * @model type="tesis.unrc.wsdl.wsdl.Import" containment="true"
	 * @generated
	 */
	EList getEImports();

	/**
	 * Returns the value of the '<em><b>ETypes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ETypes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ETypes</em>' containment reference.
	 * @see #setETypes(Types)
	 * @see tesis.unrc.wsdl.wsdl.WSDLPackage#getDefinition_ETypes()
	 * @model containment="true"
	 * @generated
	 */
	Types getETypes();

	/**
	 * Sets the value of the '{@link tesis.unrc.wsdl.wsdl.Definition#getETypes <em>ETypes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ETypes</em>' containment reference.
	 * @see #getETypes()
	 * @generated
	 */
	void setETypes(Types value);

	/**
	 * Returns the value of the '<em><b>EMessages</b></em>' containment reference list.
	 * The list contents are of type {@link tesis.unrc.wsdl.wsdl.Message}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EMessages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EMessages</em>' containment reference list.
	 * @see tesis.unrc.wsdl.wsdl.WSDLPackage#getDefinition_EMessages()
	 * @model type="tesis.unrc.wsdl.wsdl.Message" containment="true"
	 * @generated
	 */
	EList getEMessages();

	/**
	 * Returns the value of the '<em><b>EPort Types</b></em>' containment reference list.
	 * The list contents are of type {@link tesis.unrc.wsdl.wsdl.PortType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EPort Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EPort Types</em>' containment reference list.
	 * @see tesis.unrc.wsdl.wsdl.WSDLPackage#getDefinition_EPortTypes()
	 * @model type="tesis.unrc.wsdl.wsdl.PortType" containment="true"
	 * @generated
	 */
	EList getEPortTypes();

	/**
	 * Returns the value of the '<em><b>EBindings</b></em>' containment reference list.
	 * The list contents are of type {@link tesis.unrc.wsdl.wsdl.Binding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EBindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EBindings</em>' containment reference list.
	 * @see tesis.unrc.wsdl.wsdl.WSDLPackage#getDefinition_EBindings()
	 * @model type="tesis.unrc.wsdl.wsdl.Binding" containment="true"
	 * @generated
	 */
	EList getEBindings();

	/**
	 * Returns the value of the '<em><b>EServices</b></em>' containment reference list.
	 * The list contents are of type {@link tesis.unrc.wsdl.wsdl.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EServices</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EServices</em>' containment reference list.
	 * @see tesis.unrc.wsdl.wsdl.WSDLPackage#getDefinition_EServices()
	 * @model type="tesis.unrc.wsdl.wsdl.Service" containment="true"
	 * @generated
	 */
	EList getEServices();

	/**
	 * Returns the value of the '<em><b>ENamespaces</b></em>' containment reference list.
	 * The list contents are of type {@link tesis.unrc.wsdl.wsdl.Namespace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ENamespaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ENamespaces</em>' containment reference list.
	 * @see tesis.unrc.wsdl.wsdl.WSDLPackage#getDefinition_ENamespaces()
	 * @model type="tesis.unrc.wsdl.wsdl.Namespace" containment="true"
	 * @generated
	 */
	EList getENamespaces();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="tesis.unrc.wsdl.wsdl.DOMDocument"
	 * @generated
	 */
	Document getDocument();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model documentDataType="tesis.unrc.wsdl.wsdl.DOMDocument"
	 * @generated
	 */
	void setDocument(Document document);

} // Definition
