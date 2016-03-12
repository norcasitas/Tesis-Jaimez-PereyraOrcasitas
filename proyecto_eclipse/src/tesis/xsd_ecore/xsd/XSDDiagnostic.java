/**
 */
package tesis.xsd_ecore.xsd;

import org.eclipse.emf.common.util.EList;

import org.w3c.dom.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XSD Diagnostic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDDiagnostic#getSeverity <em>Severity</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDDiagnostic#getMessage <em>Message</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDDiagnostic#getLocationURI <em>Location URI</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDDiagnostic#getLine <em>Line</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDDiagnostic#getColumn <em>Column</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDDiagnostic#getNode <em>Node</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDDiagnostic#getAnnotationURI <em>Annotation URI</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDDiagnostic#getKey <em>Key</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDDiagnostic#getSubstitutions <em>Substitutions</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDDiagnostic#getComponents <em>Components</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDDiagnostic#getPrimaryComponent <em>Primary Component</em>}</li>
 * </ul>
 *
 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDDiagnostic()
 * @model
 * @generated
 */
public interface XSDDiagnostic extends XSDConcreteComponent {
	/**
	 * Returns the value of the '<em><b>Severity</b></em>' attribute.
	 * The literals are from the enumeration {@link tesis.xsd_ecore.xsd.XSDDiagnosticSeverity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Severity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severity</em>' attribute.
	 * @see tesis.xsd_ecore.xsd.XSDDiagnosticSeverity
	 * @see #setSeverity(XSDDiagnosticSeverity)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDDiagnostic_Severity()
	 * @model
	 * @generated
	 */
	XSDDiagnosticSeverity getSeverity();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDDiagnostic#getSeverity <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' attribute.
	 * @see tesis.xsd_ecore.xsd.XSDDiagnosticSeverity
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(XSDDiagnosticSeverity value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDDiagnostic_Message()
	 * @model
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDDiagnostic#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

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
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDDiagnostic_LocationURI()
	 * @model
	 * @generated
	 */
	String getLocationURI();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDDiagnostic#getLocationURI <em>Location URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location URI</em>' attribute.
	 * @see #getLocationURI()
	 * @generated
	 */
	void setLocationURI(String value);

	/**
	 * Returns the value of the '<em><b>Line</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line</em>' attribute.
	 * @see #setLine(int)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDDiagnostic_Line()
	 * @model default="1"
	 * @generated
	 */
	int getLine();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDDiagnostic#getLine <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line</em>' attribute.
	 * @see #getLine()
	 * @generated
	 */
	void setLine(int value);

	/**
	 * Returns the value of the '<em><b>Column</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' attribute.
	 * @see #setColumn(int)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDDiagnostic_Column()
	 * @model default="1"
	 * @generated
	 */
	int getColumn();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDDiagnostic#getColumn <em>Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column</em>' attribute.
	 * @see #getColumn()
	 * @generated
	 */
	void setColumn(int value);

	/**
	 * Returns the value of the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' attribute.
	 * @see #setNode(Node)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDDiagnostic_Node()
	 * @model dataType="tesis.xsd_ecore.xsd.DOMNode"
	 * @generated
	 */
	Node getNode();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDDiagnostic#getNode <em>Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' attribute.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(Node value);

	/**
	 * Returns the value of the '<em><b>Annotation URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotation URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation URI</em>' attribute.
	 * @see #setAnnotationURI(String)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDDiagnostic_AnnotationURI()
	 * @model
	 * @generated
	 */
	String getAnnotationURI();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDDiagnostic#getAnnotationURI <em>Annotation URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation URI</em>' attribute.
	 * @see #getAnnotationURI()
	 * @generated
	 */
	void setAnnotationURI(String value);

	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDDiagnostic_Key()
	 * @model
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDDiagnostic#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Substitutions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Substitutions</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substitutions</em>' attribute list.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDDiagnostic_Substitutions()
	 * @model
	 * @generated
	 */
	EList<String> getSubstitutions();

	/**
	 * Returns the value of the '<em><b>Components</b></em>' reference list.
	 * The list contents are of type {@link tesis.xsd_ecore.xsd.XSDConcreteComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' reference list.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDDiagnostic_Components()
	 * @model resolveProxies="false" required="true"
	 * @generated
	 */
	EList<XSDConcreteComponent> getComponents();

	/**
	 * Returns the value of the '<em><b>Primary Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Component</em>' reference.
	 * @see #setPrimaryComponent(XSDConcreteComponent)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDDiagnostic_PrimaryComponent()
	 * @model resolveProxies="false" required="true" transient="true" volatile="true"
	 * @generated
	 */
	XSDConcreteComponent getPrimaryComponent();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDDiagnostic#getPrimaryComponent <em>Primary Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Component</em>' reference.
	 * @see #getPrimaryComponent()
	 * @generated
	 */
	void setPrimaryComponent(XSDConcreteComponent value);

} // XSDDiagnostic
