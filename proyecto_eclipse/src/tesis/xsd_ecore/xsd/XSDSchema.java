/**
 */
package tesis.xsd_ecore.xsd;

import org.eclipse.emf.common.util.EList;

import org.w3c.dom.Document;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XSD Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDSchema#getDocument <em>Document</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDSchema#getSchemaLocation <em>Schema Location</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDSchema#getTargetNamespace <em>Target Namespace</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDSchema#getAttributeFormDefault <em>Attribute Form Default</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDSchema#getElementFormDefault <em>Element Form Default</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDSchema#getFinalDefault <em>Final Default</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDSchema#getBlockDefault <em>Block Default</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDSchema#getVersion <em>Version</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDSchema#getContents <em>Contents</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDSchema#getElementDeclarations <em>Element Declarations</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDSchema#getAttributeDeclarations <em>Attribute Declarations</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDSchema#getAttributeGroupDefinitions <em>Attribute Group Definitions</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDSchema#getTypeDefinitions <em>Type Definitions</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDSchema#getModelGroupDefinitions <em>Model Group Definitions</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDSchema#getIdentityConstraintDefinitions <em>Identity Constraint Definitions</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDSchema#getNotationDeclarations <em>Notation Declarations</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDSchema#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDSchema#getAllDiagnostics <em>All Diagnostics</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDSchema#getReferencingDirectives <em>Referencing Directives</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDSchema#getRootVersion <em>Root Version</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDSchema#getOriginalVersion <em>Original Version</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDSchema#getIncorporatedVersions <em>Incorporated Versions</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.XSDSchema#getSchemaForSchema <em>Schema For Schema</em>}</li>
 * </ul>
 *
 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSchema()
 * @model
 * @generated
 */
public interface XSDSchema extends XSDScope {
	/**
	 * Returns the value of the '<em><b>Document</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document</em>' attribute.
	 * @see #setDocument(Document)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSchema_Document()
	 * @model dataType="tesis.xsd_ecore.xsd.DOMDocument"
	 * @generated
	 */
	Document getDocument();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDSchema#getDocument <em>Document</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document</em>' attribute.
	 * @see #getDocument()
	 * @generated
	 */
	void setDocument(Document value);

	/**
	 * Returns the value of the '<em><b>Schema Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema Location</em>' attribute.
	 * @see #setSchemaLocation(String)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSchema_SchemaLocation()
	 * @model
	 * @generated
	 */
	String getSchemaLocation();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDSchema#getSchemaLocation <em>Schema Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema Location</em>' attribute.
	 * @see #getSchemaLocation()
	 * @generated
	 */
	void setSchemaLocation(String value);

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
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSchema_TargetNamespace()
	 * @model
	 * @generated
	 */
	String getTargetNamespace();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDSchema#getTargetNamespace <em>Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Namespace</em>' attribute.
	 * @see #getTargetNamespace()
	 * @generated
	 */
	void setTargetNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Attribute Form Default</b></em>' attribute.
	 * The default value is <code>"unqualified"</code>.
	 * The literals are from the enumeration {@link tesis.xsd_ecore.xsd.XSDForm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Form Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Form Default</em>' attribute.
	 * @see tesis.xsd_ecore.xsd.XSDForm
	 * @see #isSetAttributeFormDefault()
	 * @see #unsetAttributeFormDefault()
	 * @see #setAttributeFormDefault(XSDForm)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSchema_AttributeFormDefault()
	 * @model default="unqualified" unsettable="true"
	 * @generated
	 */
	XSDForm getAttributeFormDefault();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDSchema#getAttributeFormDefault <em>Attribute Form Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Form Default</em>' attribute.
	 * @see tesis.xsd_ecore.xsd.XSDForm
	 * @see #isSetAttributeFormDefault()
	 * @see #unsetAttributeFormDefault()
	 * @see #getAttributeFormDefault()
	 * @generated
	 */
	void setAttributeFormDefault(XSDForm value);

	/**
	 * Unsets the value of the '{@link tesis.xsd_ecore.xsd.XSDSchema#getAttributeFormDefault <em>Attribute Form Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAttributeFormDefault()
	 * @see #getAttributeFormDefault()
	 * @see #setAttributeFormDefault(XSDForm)
	 * @generated
	 */
	void unsetAttributeFormDefault();

	/**
	 * Returns whether the value of the '{@link tesis.xsd_ecore.xsd.XSDSchema#getAttributeFormDefault <em>Attribute Form Default</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Attribute Form Default</em>' attribute is set.
	 * @see #unsetAttributeFormDefault()
	 * @see #getAttributeFormDefault()
	 * @see #setAttributeFormDefault(XSDForm)
	 * @generated
	 */
	boolean isSetAttributeFormDefault();

	/**
	 * Returns the value of the '<em><b>Element Form Default</b></em>' attribute.
	 * The default value is <code>"unqualified"</code>.
	 * The literals are from the enumeration {@link tesis.xsd_ecore.xsd.XSDForm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Form Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Form Default</em>' attribute.
	 * @see tesis.xsd_ecore.xsd.XSDForm
	 * @see #isSetElementFormDefault()
	 * @see #unsetElementFormDefault()
	 * @see #setElementFormDefault(XSDForm)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSchema_ElementFormDefault()
	 * @model default="unqualified" unsettable="true"
	 * @generated
	 */
	XSDForm getElementFormDefault();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDSchema#getElementFormDefault <em>Element Form Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Form Default</em>' attribute.
	 * @see tesis.xsd_ecore.xsd.XSDForm
	 * @see #isSetElementFormDefault()
	 * @see #unsetElementFormDefault()
	 * @see #getElementFormDefault()
	 * @generated
	 */
	void setElementFormDefault(XSDForm value);

	/**
	 * Unsets the value of the '{@link tesis.xsd_ecore.xsd.XSDSchema#getElementFormDefault <em>Element Form Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetElementFormDefault()
	 * @see #getElementFormDefault()
	 * @see #setElementFormDefault(XSDForm)
	 * @generated
	 */
	void unsetElementFormDefault();

	/**
	 * Returns whether the value of the '{@link tesis.xsd_ecore.xsd.XSDSchema#getElementFormDefault <em>Element Form Default</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Element Form Default</em>' attribute is set.
	 * @see #unsetElementFormDefault()
	 * @see #getElementFormDefault()
	 * @see #setElementFormDefault(XSDForm)
	 * @generated
	 */
	boolean isSetElementFormDefault();

	/**
	 * Returns the value of the '<em><b>Final Default</b></em>' attribute list.
	 * The list contents are of type {@link tesis.xsd_ecore.xsd.XSDProhibitedSubstitutions}.
	 * The literals are from the enumeration {@link tesis.xsd_ecore.xsd.XSDProhibitedSubstitutions}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final Default</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Default</em>' attribute list.
	 * @see tesis.xsd_ecore.xsd.XSDProhibitedSubstitutions
	 * @see #isSetFinalDefault()
	 * @see #unsetFinalDefault()
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSchema_FinalDefault()
	 * @model unsettable="true"
	 * @generated
	 */
	EList<XSDProhibitedSubstitutions> getFinalDefault();

	/**
	 * Unsets the value of the '{@link tesis.xsd_ecore.xsd.XSDSchema#getFinalDefault <em>Final Default</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFinalDefault()
	 * @see #getFinalDefault()
	 * @generated
	 */
	void unsetFinalDefault();

	/**
	 * Returns whether the value of the '{@link tesis.xsd_ecore.xsd.XSDSchema#getFinalDefault <em>Final Default</em>}' attribute list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Final Default</em>' attribute list is set.
	 * @see #unsetFinalDefault()
	 * @see #getFinalDefault()
	 * @generated
	 */
	boolean isSetFinalDefault();

	/**
	 * Returns the value of the '<em><b>Block Default</b></em>' attribute list.
	 * The list contents are of type {@link tesis.xsd_ecore.xsd.XSDDisallowedSubstitutions}.
	 * The literals are from the enumeration {@link tesis.xsd_ecore.xsd.XSDDisallowedSubstitutions}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block Default</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block Default</em>' attribute list.
	 * @see tesis.xsd_ecore.xsd.XSDDisallowedSubstitutions
	 * @see #isSetBlockDefault()
	 * @see #unsetBlockDefault()
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSchema_BlockDefault()
	 * @model unsettable="true"
	 * @generated
	 */
	EList<XSDDisallowedSubstitutions> getBlockDefault();

	/**
	 * Unsets the value of the '{@link tesis.xsd_ecore.xsd.XSDSchema#getBlockDefault <em>Block Default</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBlockDefault()
	 * @see #getBlockDefault()
	 * @generated
	 */
	void unsetBlockDefault();

	/**
	 * Returns whether the value of the '{@link tesis.xsd_ecore.xsd.XSDSchema#getBlockDefault <em>Block Default</em>}' attribute list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Block Default</em>' attribute list is set.
	 * @see #unsetBlockDefault()
	 * @see #getBlockDefault()
	 * @generated
	 */
	boolean isSetBlockDefault();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSchema_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link tesis.xsd_ecore.xsd.XSDSchema#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
	 * The list contents are of type {@link tesis.xsd_ecore.xsd.XSDSchemaContent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' containment reference list.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSchema_Contents()
	 * @model containment="true"
	 * @generated
	 */
	EList<XSDSchemaContent> getContents();

	/**
	 * Returns the value of the '<em><b>Element Declarations</b></em>' reference list.
	 * The list contents are of type {@link tesis.xsd_ecore.xsd.XSDElementDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Declarations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Declarations</em>' reference list.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSchema_ElementDeclarations()
	 * @model resolveProxies="false"
	 * @generated
	 */
	EList<XSDElementDeclaration> getElementDeclarations();

	/**
	 * Returns the value of the '<em><b>Attribute Declarations</b></em>' reference list.
	 * The list contents are of type {@link tesis.xsd_ecore.xsd.XSDAttributeDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Declarations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Declarations</em>' reference list.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSchema_AttributeDeclarations()
	 * @model resolveProxies="false"
	 * @generated
	 */
	EList<XSDAttributeDeclaration> getAttributeDeclarations();

	/**
	 * Returns the value of the '<em><b>Attribute Group Definitions</b></em>' reference list.
	 * The list contents are of type {@link tesis.xsd_ecore.xsd.XSDAttributeGroupDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Group Definitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Group Definitions</em>' reference list.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSchema_AttributeGroupDefinitions()
	 * @model resolveProxies="false"
	 * @generated
	 */
	EList<XSDAttributeGroupDefinition> getAttributeGroupDefinitions();

	/**
	 * Returns the value of the '<em><b>Type Definitions</b></em>' reference list.
	 * The list contents are of type {@link tesis.xsd_ecore.xsd.XSDTypeDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Definitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Definitions</em>' reference list.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSchema_TypeDefinitions()
	 * @model resolveProxies="false"
	 * @generated
	 */
	EList<XSDTypeDefinition> getTypeDefinitions();

	/**
	 * Returns the value of the '<em><b>Model Group Definitions</b></em>' reference list.
	 * The list contents are of type {@link tesis.xsd_ecore.xsd.XSDModelGroupDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Group Definitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Group Definitions</em>' reference list.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSchema_ModelGroupDefinitions()
	 * @model resolveProxies="false"
	 * @generated
	 */
	EList<XSDModelGroupDefinition> getModelGroupDefinitions();

	/**
	 * Returns the value of the '<em><b>Identity Constraint Definitions</b></em>' reference list.
	 * The list contents are of type {@link tesis.xsd_ecore.xsd.XSDIdentityConstraintDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identity Constraint Definitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identity Constraint Definitions</em>' reference list.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSchema_IdentityConstraintDefinitions()
	 * @model resolveProxies="false"
	 * @generated
	 */
	EList<XSDIdentityConstraintDefinition> getIdentityConstraintDefinitions();

	/**
	 * Returns the value of the '<em><b>Notation Declarations</b></em>' reference list.
	 * The list contents are of type {@link tesis.xsd_ecore.xsd.XSDNotationDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notation Declarations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notation Declarations</em>' reference list.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSchema_NotationDeclarations()
	 * @model resolveProxies="false"
	 * @generated
	 */
	EList<XSDNotationDeclaration> getNotationDeclarations();

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
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSchema_Annotations()
	 * @model resolveProxies="false"
	 * @generated
	 */
	EList<XSDAnnotation> getAnnotations();

	/**
	 * Returns the value of the '<em><b>All Diagnostics</b></em>' reference list.
	 * The list contents are of type {@link tesis.xsd_ecore.xsd.XSDDiagnostic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Diagnostics</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Diagnostics</em>' reference list.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSchema_AllDiagnostics()
	 * @model resolveProxies="false"
	 * @generated
	 */
	EList<XSDDiagnostic> getAllDiagnostics();

	/**
	 * Returns the value of the '<em><b>Referencing Directives</b></em>' reference list.
	 * The list contents are of type {@link tesis.xsd_ecore.xsd.XSDSchemaDirective}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referencing Directives</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referencing Directives</em>' reference list.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSchema_ReferencingDirectives()
	 * @model resolveProxies="false"
	 * @generated
	 */
	EList<XSDSchemaDirective> getReferencingDirectives();

	/**
	 * Returns the value of the '<em><b>Root Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Version</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Version</em>' reference.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSchema_RootVersion()
	 * @model resolveProxies="false" required="true" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	XSDSchema getRootVersion();

	/**
	 * Returns the value of the '<em><b>Original Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Version</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Version</em>' reference.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSchema_OriginalVersion()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	XSDSchema getOriginalVersion();

	/**
	 * Returns the value of the '<em><b>Incorporated Versions</b></em>' containment reference list.
	 * The list contents are of type {@link tesis.xsd_ecore.xsd.XSDSchema}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incorporated Versions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incorporated Versions</em>' containment reference list.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSchema_IncorporatedVersions()
	 * @model containment="true" transient="true"
	 * @generated
	 */
	EList<XSDSchema> getIncorporatedVersions();

	/**
	 * Returns the value of the '<em><b>Schema For Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema For Schema</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema For Schema</em>' reference.
	 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSchema_SchemaForSchema()
	 * @model resolveProxies="false" required="true" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	XSDSchema getSchemaForSchema();

} // XSDSchema
