/**
 */
package tesis.xsd_ecore.xsd.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3c.dom.Document;

import tesis.xsd_ecore.xsd.XSDAnnotation;
import tesis.xsd_ecore.xsd.XSDAttributeDeclaration;
import tesis.xsd_ecore.xsd.XSDAttributeGroupDefinition;
import tesis.xsd_ecore.xsd.XSDDiagnostic;
import tesis.xsd_ecore.xsd.XSDDisallowedSubstitutions;
import tesis.xsd_ecore.xsd.XSDElementDeclaration;
import tesis.xsd_ecore.xsd.XSDForm;
import tesis.xsd_ecore.xsd.XSDIdentityConstraintDefinition;
import tesis.xsd_ecore.xsd.XSDModelGroupDefinition;
import tesis.xsd_ecore.xsd.XSDNotationDeclaration;
import tesis.xsd_ecore.xsd.XSDProhibitedSubstitutions;
import tesis.xsd_ecore.xsd.XSDSchema;
import tesis.xsd_ecore.xsd.XSDSchemaContent;
import tesis.xsd_ecore.xsd.XSDSchemaDirective;
import tesis.xsd_ecore.xsd.XSDTypeDefinition;
import tesis.xsd_ecore.xsd.XsdPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XSD Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDSchemaImpl#getDocument <em>Document</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDSchemaImpl#getSchemaLocation <em>Schema Location</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDSchemaImpl#getTargetNamespace <em>Target Namespace</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDSchemaImpl#getAttributeFormDefault <em>Attribute Form Default</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDSchemaImpl#getElementFormDefault <em>Element Form Default</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDSchemaImpl#getFinalDefault <em>Final Default</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDSchemaImpl#getBlockDefault <em>Block Default</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDSchemaImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDSchemaImpl#getContents <em>Contents</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDSchemaImpl#getElementDeclarations <em>Element Declarations</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDSchemaImpl#getAttributeDeclarations <em>Attribute Declarations</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDSchemaImpl#getAttributeGroupDefinitions <em>Attribute Group Definitions</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDSchemaImpl#getTypeDefinitions <em>Type Definitions</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDSchemaImpl#getModelGroupDefinitions <em>Model Group Definitions</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDSchemaImpl#getIdentityConstraintDefinitions <em>Identity Constraint Definitions</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDSchemaImpl#getNotationDeclarations <em>Notation Declarations</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDSchemaImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDSchemaImpl#getAllDiagnostics <em>All Diagnostics</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDSchemaImpl#getReferencingDirectives <em>Referencing Directives</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDSchemaImpl#getRootVersion <em>Root Version</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDSchemaImpl#getOriginalVersion <em>Original Version</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDSchemaImpl#getIncorporatedVersions <em>Incorporated Versions</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDSchemaImpl#getSchemaForSchema <em>Schema For Schema</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XSDSchemaImpl extends XSDScopeImpl implements XSDSchema {
	/**
	 * The default value of the '{@link #getDocument() <em>Document</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocument()
	 * @generated
	 * @ordered
	 */
	protected static final Document DOCUMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocument() <em>Document</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocument()
	 * @generated
	 * @ordered
	 */
	protected Document document = DOCUMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSchemaLocation() <em>Schema Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEMA_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchemaLocation() <em>Schema Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected String schemaLocation = SCHEMA_LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetNamespace() <em>Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetNamespace() <em>Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetNamespace()
	 * @generated
	 * @ordered
	 */
	protected String targetNamespace = TARGET_NAMESPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttributeFormDefault() <em>Attribute Form Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeFormDefault()
	 * @generated
	 * @ordered
	 */
	protected static final XSDForm ATTRIBUTE_FORM_DEFAULT_EDEFAULT = XSDForm.UNQUALIFIED;

	/**
	 * The cached value of the '{@link #getAttributeFormDefault() <em>Attribute Form Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeFormDefault()
	 * @generated
	 * @ordered
	 */
	protected XSDForm attributeFormDefault = ATTRIBUTE_FORM_DEFAULT_EDEFAULT;

	/**
	 * This is true if the Attribute Form Default attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean attributeFormDefaultESet;

	/**
	 * The default value of the '{@link #getElementFormDefault() <em>Element Form Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementFormDefault()
	 * @generated
	 * @ordered
	 */
	protected static final XSDForm ELEMENT_FORM_DEFAULT_EDEFAULT = XSDForm.UNQUALIFIED;

	/**
	 * The cached value of the '{@link #getElementFormDefault() <em>Element Form Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementFormDefault()
	 * @generated
	 * @ordered
	 */
	protected XSDForm elementFormDefault = ELEMENT_FORM_DEFAULT_EDEFAULT;

	/**
	 * This is true if the Element Form Default attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean elementFormDefaultESet;

	/**
	 * The cached value of the '{@link #getFinalDefault() <em>Final Default</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalDefault()
	 * @generated
	 * @ordered
	 */
	protected EList<XSDProhibitedSubstitutions> finalDefault;

	/**
	 * The cached value of the '{@link #getBlockDefault() <em>Block Default</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockDefault()
	 * @generated
	 * @ordered
	 */
	protected EList<XSDDisallowedSubstitutions> blockDefault;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContents() <em>Contents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContents()
	 * @generated
	 * @ordered
	 */
	protected EList<XSDSchemaContent> contents;

	/**
	 * The cached value of the '{@link #getElementDeclarations() <em>Element Declarations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<XSDElementDeclaration> elementDeclarations;

	/**
	 * The cached value of the '{@link #getAttributeDeclarations() <em>Attribute Declarations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<XSDAttributeDeclaration> attributeDeclarations;

	/**
	 * The cached value of the '{@link #getAttributeGroupDefinitions() <em>Attribute Group Definitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeGroupDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<XSDAttributeGroupDefinition> attributeGroupDefinitions;

	/**
	 * The cached value of the '{@link #getTypeDefinitions() <em>Type Definitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<XSDTypeDefinition> typeDefinitions;

	/**
	 * The cached value of the '{@link #getModelGroupDefinitions() <em>Model Group Definitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelGroupDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<XSDModelGroupDefinition> modelGroupDefinitions;

	/**
	 * The cached value of the '{@link #getIdentityConstraintDefinitions() <em>Identity Constraint Definitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentityConstraintDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<XSDIdentityConstraintDefinition> identityConstraintDefinitions;

	/**
	 * The cached value of the '{@link #getNotationDeclarations() <em>Notation Declarations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotationDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<XSDNotationDeclaration> notationDeclarations;

	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<XSDAnnotation> annotations;

	/**
	 * The cached value of the '{@link #getAllDiagnostics() <em>All Diagnostics</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllDiagnostics()
	 * @generated
	 * @ordered
	 */
	protected EList<XSDDiagnostic> allDiagnostics;

	/**
	 * The cached value of the '{@link #getReferencingDirectives() <em>Referencing Directives</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencingDirectives()
	 * @generated
	 * @ordered
	 */
	protected EList<XSDSchemaDirective> referencingDirectives;

	/**
	 * The cached value of the '{@link #getIncorporatedVersions() <em>Incorporated Versions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncorporatedVersions()
	 * @generated
	 * @ordered
	 */
	protected EList<XSDSchema> incorporatedVersions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XSDSchemaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XsdPackage.Literals.XSD_SCHEMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Document getDocument() {
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocument(Document newDocument) {
		Document oldDocument = document;
		document = newDocument;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_SCHEMA__DOCUMENT, oldDocument, document));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSchemaLocation() {
		return schemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchemaLocation(String newSchemaLocation) {
		String oldSchemaLocation = schemaLocation;
		schemaLocation = newSchemaLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_SCHEMA__SCHEMA_LOCATION, oldSchemaLocation, schemaLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetNamespace() {
		return targetNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetNamespace(String newTargetNamespace) {
		String oldTargetNamespace = targetNamespace;
		targetNamespace = newTargetNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_SCHEMA__TARGET_NAMESPACE, oldTargetNamespace, targetNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDForm getAttributeFormDefault() {
		return attributeFormDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeFormDefault(XSDForm newAttributeFormDefault) {
		XSDForm oldAttributeFormDefault = attributeFormDefault;
		attributeFormDefault = newAttributeFormDefault == null ? ATTRIBUTE_FORM_DEFAULT_EDEFAULT : newAttributeFormDefault;
		boolean oldAttributeFormDefaultESet = attributeFormDefaultESet;
		attributeFormDefaultESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_SCHEMA__ATTRIBUTE_FORM_DEFAULT, oldAttributeFormDefault, attributeFormDefault, !oldAttributeFormDefaultESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAttributeFormDefault() {
		XSDForm oldAttributeFormDefault = attributeFormDefault;
		boolean oldAttributeFormDefaultESet = attributeFormDefaultESet;
		attributeFormDefault = ATTRIBUTE_FORM_DEFAULT_EDEFAULT;
		attributeFormDefaultESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XsdPackage.XSD_SCHEMA__ATTRIBUTE_FORM_DEFAULT, oldAttributeFormDefault, ATTRIBUTE_FORM_DEFAULT_EDEFAULT, oldAttributeFormDefaultESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAttributeFormDefault() {
		return attributeFormDefaultESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDForm getElementFormDefault() {
		return elementFormDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementFormDefault(XSDForm newElementFormDefault) {
		XSDForm oldElementFormDefault = elementFormDefault;
		elementFormDefault = newElementFormDefault == null ? ELEMENT_FORM_DEFAULT_EDEFAULT : newElementFormDefault;
		boolean oldElementFormDefaultESet = elementFormDefaultESet;
		elementFormDefaultESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_SCHEMA__ELEMENT_FORM_DEFAULT, oldElementFormDefault, elementFormDefault, !oldElementFormDefaultESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetElementFormDefault() {
		XSDForm oldElementFormDefault = elementFormDefault;
		boolean oldElementFormDefaultESet = elementFormDefaultESet;
		elementFormDefault = ELEMENT_FORM_DEFAULT_EDEFAULT;
		elementFormDefaultESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XsdPackage.XSD_SCHEMA__ELEMENT_FORM_DEFAULT, oldElementFormDefault, ELEMENT_FORM_DEFAULT_EDEFAULT, oldElementFormDefaultESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetElementFormDefault() {
		return elementFormDefaultESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XSDProhibitedSubstitutions> getFinalDefault() {
		if (finalDefault == null) {
			finalDefault = new EDataTypeUniqueEList.Unsettable<XSDProhibitedSubstitutions>(XSDProhibitedSubstitutions.class, this, XsdPackage.XSD_SCHEMA__FINAL_DEFAULT);
		}
		return finalDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFinalDefault() {
		if (finalDefault != null) ((InternalEList.Unsettable<?>)finalDefault).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFinalDefault() {
		return finalDefault != null && ((InternalEList.Unsettable<?>)finalDefault).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XSDDisallowedSubstitutions> getBlockDefault() {
		if (blockDefault == null) {
			blockDefault = new EDataTypeUniqueEList.Unsettable<XSDDisallowedSubstitutions>(XSDDisallowedSubstitutions.class, this, XsdPackage.XSD_SCHEMA__BLOCK_DEFAULT);
		}
		return blockDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBlockDefault() {
		if (blockDefault != null) ((InternalEList.Unsettable<?>)blockDefault).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBlockDefault() {
		return blockDefault != null && ((InternalEList.Unsettable<?>)blockDefault).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_SCHEMA__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XSDSchemaContent> getContents() {
		if (contents == null) {
			contents = new EObjectContainmentEList<XSDSchemaContent>(XSDSchemaContent.class, this, XsdPackage.XSD_SCHEMA__CONTENTS);
		}
		return contents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XSDElementDeclaration> getElementDeclarations() {
		if (elementDeclarations == null) {
			elementDeclarations = new EObjectEList<XSDElementDeclaration>(XSDElementDeclaration.class, this, XsdPackage.XSD_SCHEMA__ELEMENT_DECLARATIONS);
		}
		return elementDeclarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XSDAttributeDeclaration> getAttributeDeclarations() {
		if (attributeDeclarations == null) {
			attributeDeclarations = new EObjectEList<XSDAttributeDeclaration>(XSDAttributeDeclaration.class, this, XsdPackage.XSD_SCHEMA__ATTRIBUTE_DECLARATIONS);
		}
		return attributeDeclarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XSDAttributeGroupDefinition> getAttributeGroupDefinitions() {
		if (attributeGroupDefinitions == null) {
			attributeGroupDefinitions = new EObjectEList<XSDAttributeGroupDefinition>(XSDAttributeGroupDefinition.class, this, XsdPackage.XSD_SCHEMA__ATTRIBUTE_GROUP_DEFINITIONS);
		}
		return attributeGroupDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XSDTypeDefinition> getTypeDefinitions() {
		if (typeDefinitions == null) {
			typeDefinitions = new EObjectEList<XSDTypeDefinition>(XSDTypeDefinition.class, this, XsdPackage.XSD_SCHEMA__TYPE_DEFINITIONS);
		}
		return typeDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XSDModelGroupDefinition> getModelGroupDefinitions() {
		if (modelGroupDefinitions == null) {
			modelGroupDefinitions = new EObjectEList<XSDModelGroupDefinition>(XSDModelGroupDefinition.class, this, XsdPackage.XSD_SCHEMA__MODEL_GROUP_DEFINITIONS);
		}
		return modelGroupDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XSDIdentityConstraintDefinition> getIdentityConstraintDefinitions() {
		if (identityConstraintDefinitions == null) {
			identityConstraintDefinitions = new EObjectEList<XSDIdentityConstraintDefinition>(XSDIdentityConstraintDefinition.class, this, XsdPackage.XSD_SCHEMA__IDENTITY_CONSTRAINT_DEFINITIONS);
		}
		return identityConstraintDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XSDNotationDeclaration> getNotationDeclarations() {
		if (notationDeclarations == null) {
			notationDeclarations = new EObjectEList<XSDNotationDeclaration>(XSDNotationDeclaration.class, this, XsdPackage.XSD_SCHEMA__NOTATION_DECLARATIONS);
		}
		return notationDeclarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XSDAnnotation> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectEList<XSDAnnotation>(XSDAnnotation.class, this, XsdPackage.XSD_SCHEMA__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XSDDiagnostic> getAllDiagnostics() {
		if (allDiagnostics == null) {
			allDiagnostics = new EObjectEList<XSDDiagnostic>(XSDDiagnostic.class, this, XsdPackage.XSD_SCHEMA__ALL_DIAGNOSTICS);
		}
		return allDiagnostics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XSDSchemaDirective> getReferencingDirectives() {
		if (referencingDirectives == null) {
			referencingDirectives = new EObjectEList<XSDSchemaDirective>(XSDSchemaDirective.class, this, XsdPackage.XSD_SCHEMA__REFERENCING_DIRECTIVES);
		}
		return referencingDirectives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDSchema getRootVersion() {
		// TODO: implement this method to return the 'Root Version' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDSchema getOriginalVersion() {
		// TODO: implement this method to return the 'Original Version' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XSDSchema> getIncorporatedVersions() {
		if (incorporatedVersions == null) {
			incorporatedVersions = new EObjectContainmentEList<XSDSchema>(XSDSchema.class, this, XsdPackage.XSD_SCHEMA__INCORPORATED_VERSIONS);
		}
		return incorporatedVersions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDSchema getSchemaForSchema() {
		// TODO: implement this method to return the 'Schema For Schema' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XsdPackage.XSD_SCHEMA__CONTENTS:
				return ((InternalEList<?>)getContents()).basicRemove(otherEnd, msgs);
			case XsdPackage.XSD_SCHEMA__INCORPORATED_VERSIONS:
				return ((InternalEList<?>)getIncorporatedVersions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XsdPackage.XSD_SCHEMA__DOCUMENT:
				return getDocument();
			case XsdPackage.XSD_SCHEMA__SCHEMA_LOCATION:
				return getSchemaLocation();
			case XsdPackage.XSD_SCHEMA__TARGET_NAMESPACE:
				return getTargetNamespace();
			case XsdPackage.XSD_SCHEMA__ATTRIBUTE_FORM_DEFAULT:
				return getAttributeFormDefault();
			case XsdPackage.XSD_SCHEMA__ELEMENT_FORM_DEFAULT:
				return getElementFormDefault();
			case XsdPackage.XSD_SCHEMA__FINAL_DEFAULT:
				return getFinalDefault();
			case XsdPackage.XSD_SCHEMA__BLOCK_DEFAULT:
				return getBlockDefault();
			case XsdPackage.XSD_SCHEMA__VERSION:
				return getVersion();
			case XsdPackage.XSD_SCHEMA__CONTENTS:
				return getContents();
			case XsdPackage.XSD_SCHEMA__ELEMENT_DECLARATIONS:
				return getElementDeclarations();
			case XsdPackage.XSD_SCHEMA__ATTRIBUTE_DECLARATIONS:
				return getAttributeDeclarations();
			case XsdPackage.XSD_SCHEMA__ATTRIBUTE_GROUP_DEFINITIONS:
				return getAttributeGroupDefinitions();
			case XsdPackage.XSD_SCHEMA__TYPE_DEFINITIONS:
				return getTypeDefinitions();
			case XsdPackage.XSD_SCHEMA__MODEL_GROUP_DEFINITIONS:
				return getModelGroupDefinitions();
			case XsdPackage.XSD_SCHEMA__IDENTITY_CONSTRAINT_DEFINITIONS:
				return getIdentityConstraintDefinitions();
			case XsdPackage.XSD_SCHEMA__NOTATION_DECLARATIONS:
				return getNotationDeclarations();
			case XsdPackage.XSD_SCHEMA__ANNOTATIONS:
				return getAnnotations();
			case XsdPackage.XSD_SCHEMA__ALL_DIAGNOSTICS:
				return getAllDiagnostics();
			case XsdPackage.XSD_SCHEMA__REFERENCING_DIRECTIVES:
				return getReferencingDirectives();
			case XsdPackage.XSD_SCHEMA__ROOT_VERSION:
				return getRootVersion();
			case XsdPackage.XSD_SCHEMA__ORIGINAL_VERSION:
				return getOriginalVersion();
			case XsdPackage.XSD_SCHEMA__INCORPORATED_VERSIONS:
				return getIncorporatedVersions();
			case XsdPackage.XSD_SCHEMA__SCHEMA_FOR_SCHEMA:
				return getSchemaForSchema();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XsdPackage.XSD_SCHEMA__DOCUMENT:
				setDocument((Document)newValue);
				return;
			case XsdPackage.XSD_SCHEMA__SCHEMA_LOCATION:
				setSchemaLocation((String)newValue);
				return;
			case XsdPackage.XSD_SCHEMA__TARGET_NAMESPACE:
				setTargetNamespace((String)newValue);
				return;
			case XsdPackage.XSD_SCHEMA__ATTRIBUTE_FORM_DEFAULT:
				setAttributeFormDefault((XSDForm)newValue);
				return;
			case XsdPackage.XSD_SCHEMA__ELEMENT_FORM_DEFAULT:
				setElementFormDefault((XSDForm)newValue);
				return;
			case XsdPackage.XSD_SCHEMA__FINAL_DEFAULT:
				getFinalDefault().clear();
				getFinalDefault().addAll((Collection<? extends XSDProhibitedSubstitutions>)newValue);
				return;
			case XsdPackage.XSD_SCHEMA__BLOCK_DEFAULT:
				getBlockDefault().clear();
				getBlockDefault().addAll((Collection<? extends XSDDisallowedSubstitutions>)newValue);
				return;
			case XsdPackage.XSD_SCHEMA__VERSION:
				setVersion((String)newValue);
				return;
			case XsdPackage.XSD_SCHEMA__CONTENTS:
				getContents().clear();
				getContents().addAll((Collection<? extends XSDSchemaContent>)newValue);
				return;
			case XsdPackage.XSD_SCHEMA__ELEMENT_DECLARATIONS:
				getElementDeclarations().clear();
				getElementDeclarations().addAll((Collection<? extends XSDElementDeclaration>)newValue);
				return;
			case XsdPackage.XSD_SCHEMA__ATTRIBUTE_DECLARATIONS:
				getAttributeDeclarations().clear();
				getAttributeDeclarations().addAll((Collection<? extends XSDAttributeDeclaration>)newValue);
				return;
			case XsdPackage.XSD_SCHEMA__ATTRIBUTE_GROUP_DEFINITIONS:
				getAttributeGroupDefinitions().clear();
				getAttributeGroupDefinitions().addAll((Collection<? extends XSDAttributeGroupDefinition>)newValue);
				return;
			case XsdPackage.XSD_SCHEMA__TYPE_DEFINITIONS:
				getTypeDefinitions().clear();
				getTypeDefinitions().addAll((Collection<? extends XSDTypeDefinition>)newValue);
				return;
			case XsdPackage.XSD_SCHEMA__MODEL_GROUP_DEFINITIONS:
				getModelGroupDefinitions().clear();
				getModelGroupDefinitions().addAll((Collection<? extends XSDModelGroupDefinition>)newValue);
				return;
			case XsdPackage.XSD_SCHEMA__IDENTITY_CONSTRAINT_DEFINITIONS:
				getIdentityConstraintDefinitions().clear();
				getIdentityConstraintDefinitions().addAll((Collection<? extends XSDIdentityConstraintDefinition>)newValue);
				return;
			case XsdPackage.XSD_SCHEMA__NOTATION_DECLARATIONS:
				getNotationDeclarations().clear();
				getNotationDeclarations().addAll((Collection<? extends XSDNotationDeclaration>)newValue);
				return;
			case XsdPackage.XSD_SCHEMA__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends XSDAnnotation>)newValue);
				return;
			case XsdPackage.XSD_SCHEMA__ALL_DIAGNOSTICS:
				getAllDiagnostics().clear();
				getAllDiagnostics().addAll((Collection<? extends XSDDiagnostic>)newValue);
				return;
			case XsdPackage.XSD_SCHEMA__REFERENCING_DIRECTIVES:
				getReferencingDirectives().clear();
				getReferencingDirectives().addAll((Collection<? extends XSDSchemaDirective>)newValue);
				return;
			case XsdPackage.XSD_SCHEMA__INCORPORATED_VERSIONS:
				getIncorporatedVersions().clear();
				getIncorporatedVersions().addAll((Collection<? extends XSDSchema>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case XsdPackage.XSD_SCHEMA__DOCUMENT:
				setDocument(DOCUMENT_EDEFAULT);
				return;
			case XsdPackage.XSD_SCHEMA__SCHEMA_LOCATION:
				setSchemaLocation(SCHEMA_LOCATION_EDEFAULT);
				return;
			case XsdPackage.XSD_SCHEMA__TARGET_NAMESPACE:
				setTargetNamespace(TARGET_NAMESPACE_EDEFAULT);
				return;
			case XsdPackage.XSD_SCHEMA__ATTRIBUTE_FORM_DEFAULT:
				unsetAttributeFormDefault();
				return;
			case XsdPackage.XSD_SCHEMA__ELEMENT_FORM_DEFAULT:
				unsetElementFormDefault();
				return;
			case XsdPackage.XSD_SCHEMA__FINAL_DEFAULT:
				unsetFinalDefault();
				return;
			case XsdPackage.XSD_SCHEMA__BLOCK_DEFAULT:
				unsetBlockDefault();
				return;
			case XsdPackage.XSD_SCHEMA__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case XsdPackage.XSD_SCHEMA__CONTENTS:
				getContents().clear();
				return;
			case XsdPackage.XSD_SCHEMA__ELEMENT_DECLARATIONS:
				getElementDeclarations().clear();
				return;
			case XsdPackage.XSD_SCHEMA__ATTRIBUTE_DECLARATIONS:
				getAttributeDeclarations().clear();
				return;
			case XsdPackage.XSD_SCHEMA__ATTRIBUTE_GROUP_DEFINITIONS:
				getAttributeGroupDefinitions().clear();
				return;
			case XsdPackage.XSD_SCHEMA__TYPE_DEFINITIONS:
				getTypeDefinitions().clear();
				return;
			case XsdPackage.XSD_SCHEMA__MODEL_GROUP_DEFINITIONS:
				getModelGroupDefinitions().clear();
				return;
			case XsdPackage.XSD_SCHEMA__IDENTITY_CONSTRAINT_DEFINITIONS:
				getIdentityConstraintDefinitions().clear();
				return;
			case XsdPackage.XSD_SCHEMA__NOTATION_DECLARATIONS:
				getNotationDeclarations().clear();
				return;
			case XsdPackage.XSD_SCHEMA__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case XsdPackage.XSD_SCHEMA__ALL_DIAGNOSTICS:
				getAllDiagnostics().clear();
				return;
			case XsdPackage.XSD_SCHEMA__REFERENCING_DIRECTIVES:
				getReferencingDirectives().clear();
				return;
			case XsdPackage.XSD_SCHEMA__INCORPORATED_VERSIONS:
				getIncorporatedVersions().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case XsdPackage.XSD_SCHEMA__DOCUMENT:
				return DOCUMENT_EDEFAULT == null ? document != null : !DOCUMENT_EDEFAULT.equals(document);
			case XsdPackage.XSD_SCHEMA__SCHEMA_LOCATION:
				return SCHEMA_LOCATION_EDEFAULT == null ? schemaLocation != null : !SCHEMA_LOCATION_EDEFAULT.equals(schemaLocation);
			case XsdPackage.XSD_SCHEMA__TARGET_NAMESPACE:
				return TARGET_NAMESPACE_EDEFAULT == null ? targetNamespace != null : !TARGET_NAMESPACE_EDEFAULT.equals(targetNamespace);
			case XsdPackage.XSD_SCHEMA__ATTRIBUTE_FORM_DEFAULT:
				return isSetAttributeFormDefault();
			case XsdPackage.XSD_SCHEMA__ELEMENT_FORM_DEFAULT:
				return isSetElementFormDefault();
			case XsdPackage.XSD_SCHEMA__FINAL_DEFAULT:
				return isSetFinalDefault();
			case XsdPackage.XSD_SCHEMA__BLOCK_DEFAULT:
				return isSetBlockDefault();
			case XsdPackage.XSD_SCHEMA__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case XsdPackage.XSD_SCHEMA__CONTENTS:
				return contents != null && !contents.isEmpty();
			case XsdPackage.XSD_SCHEMA__ELEMENT_DECLARATIONS:
				return elementDeclarations != null && !elementDeclarations.isEmpty();
			case XsdPackage.XSD_SCHEMA__ATTRIBUTE_DECLARATIONS:
				return attributeDeclarations != null && !attributeDeclarations.isEmpty();
			case XsdPackage.XSD_SCHEMA__ATTRIBUTE_GROUP_DEFINITIONS:
				return attributeGroupDefinitions != null && !attributeGroupDefinitions.isEmpty();
			case XsdPackage.XSD_SCHEMA__TYPE_DEFINITIONS:
				return typeDefinitions != null && !typeDefinitions.isEmpty();
			case XsdPackage.XSD_SCHEMA__MODEL_GROUP_DEFINITIONS:
				return modelGroupDefinitions != null && !modelGroupDefinitions.isEmpty();
			case XsdPackage.XSD_SCHEMA__IDENTITY_CONSTRAINT_DEFINITIONS:
				return identityConstraintDefinitions != null && !identityConstraintDefinitions.isEmpty();
			case XsdPackage.XSD_SCHEMA__NOTATION_DECLARATIONS:
				return notationDeclarations != null && !notationDeclarations.isEmpty();
			case XsdPackage.XSD_SCHEMA__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case XsdPackage.XSD_SCHEMA__ALL_DIAGNOSTICS:
				return allDiagnostics != null && !allDiagnostics.isEmpty();
			case XsdPackage.XSD_SCHEMA__REFERENCING_DIRECTIVES:
				return referencingDirectives != null && !referencingDirectives.isEmpty();
			case XsdPackage.XSD_SCHEMA__ROOT_VERSION:
				return getRootVersion() != null;
			case XsdPackage.XSD_SCHEMA__ORIGINAL_VERSION:
				return getOriginalVersion() != null;
			case XsdPackage.XSD_SCHEMA__INCORPORATED_VERSIONS:
				return incorporatedVersions != null && !incorporatedVersions.isEmpty();
			case XsdPackage.XSD_SCHEMA__SCHEMA_FOR_SCHEMA:
				return getSchemaForSchema() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (document: ");
		result.append(document);
		result.append(", schemaLocation: ");
		result.append(schemaLocation);
		result.append(", targetNamespace: ");
		result.append(targetNamespace);
		result.append(", attributeFormDefault: ");
		if (attributeFormDefaultESet) result.append(attributeFormDefault); else result.append("<unset>");
		result.append(", elementFormDefault: ");
		if (elementFormDefaultESet) result.append(elementFormDefault); else result.append("<unset>");
		result.append(", finalDefault: ");
		result.append(finalDefault);
		result.append(", blockDefault: ");
		result.append(blockDefault);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //XSDSchemaImpl
