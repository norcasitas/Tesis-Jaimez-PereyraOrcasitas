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

import tesis.xsd_ecore.xsd.XSDAnnotation;
import tesis.xsd_ecore.xsd.XSDAttributeGroupContent;
import tesis.xsd_ecore.xsd.XSDAttributeUse;
import tesis.xsd_ecore.xsd.XSDComplexFinal;
import tesis.xsd_ecore.xsd.XSDComplexTypeContent;
import tesis.xsd_ecore.xsd.XSDComplexTypeDefinition;
import tesis.xsd_ecore.xsd.XSDContentTypeCategory;
import tesis.xsd_ecore.xsd.XSDDerivationMethod;
import tesis.xsd_ecore.xsd.XSDParticle;
import tesis.xsd_ecore.xsd.XSDProhibitedSubstitutions;
import tesis.xsd_ecore.xsd.XSDTypeDefinition;
import tesis.xsd_ecore.xsd.XSDWildcard;
import tesis.xsd_ecore.xsd.XsdPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XSD Complex Type Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDComplexTypeDefinitionImpl#getDerivationMethod <em>Derivation Method</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDComplexTypeDefinitionImpl#getFinal <em>Final</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDComplexTypeDefinitionImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDComplexTypeDefinitionImpl#getContentTypeCategory <em>Content Type Category</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDComplexTypeDefinitionImpl#getProhibitedSubstitutions <em>Prohibited Substitutions</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDComplexTypeDefinitionImpl#getLexicalFinal <em>Lexical Final</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDComplexTypeDefinitionImpl#getBlock <em>Block</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDComplexTypeDefinitionImpl#isMixed <em>Mixed</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDComplexTypeDefinitionImpl#getContentAnnotation <em>Content Annotation</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDComplexTypeDefinitionImpl#getBaseTypeDefinition <em>Base Type Definition</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDComplexTypeDefinitionImpl#getContent <em>Content</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDComplexTypeDefinitionImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDComplexTypeDefinitionImpl#getAttributeUses <em>Attribute Uses</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDComplexTypeDefinitionImpl#getAttributeContents <em>Attribute Contents</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDComplexTypeDefinitionImpl#getAttributeWildcard <em>Attribute Wildcard</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDComplexTypeDefinitionImpl#getAttributeWildcardContent <em>Attribute Wildcard Content</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDComplexTypeDefinitionImpl#getRootTypeDefinition <em>Root Type Definition</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDComplexTypeDefinitionImpl#getSyntheticParticle <em>Synthetic Particle</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDComplexTypeDefinitionImpl#getSyntheticWildcard <em>Synthetic Wildcard</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XSDComplexTypeDefinitionImpl extends XSDTypeDefinitionImpl implements XSDComplexTypeDefinition {
	/**
	 * The default value of the '{@link #getDerivationMethod() <em>Derivation Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivationMethod()
	 * @generated
	 * @ordered
	 */
	protected static final XSDDerivationMethod DERIVATION_METHOD_EDEFAULT = XSDDerivationMethod.RESTRICTION;

	/**
	 * The cached value of the '{@link #getDerivationMethod() <em>Derivation Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivationMethod()
	 * @generated
	 * @ordered
	 */
	protected XSDDerivationMethod derivationMethod = DERIVATION_METHOD_EDEFAULT;

	/**
	 * This is true if the Derivation Method attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean derivationMethodESet;

	/**
	 * The cached value of the '{@link #getFinal() <em>Final</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinal()
	 * @generated
	 * @ordered
	 */
	protected EList<XSDComplexFinal> final_;

	/**
	 * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean abstract_ = ABSTRACT_EDEFAULT;

	/**
	 * This is true if the Abstract attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean abstractESet;

	/**
	 * The default value of the '{@link #getContentTypeCategory() <em>Content Type Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentTypeCategory()
	 * @generated
	 * @ordered
	 */
	protected static final XSDContentTypeCategory CONTENT_TYPE_CATEGORY_EDEFAULT = XSDContentTypeCategory.EMPTY;

	/**
	 * The cached value of the '{@link #getContentTypeCategory() <em>Content Type Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentTypeCategory()
	 * @generated
	 * @ordered
	 */
	protected XSDContentTypeCategory contentTypeCategory = CONTENT_TYPE_CATEGORY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProhibitedSubstitutions() <em>Prohibited Substitutions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProhibitedSubstitutions()
	 * @generated
	 * @ordered
	 */
	protected EList<XSDProhibitedSubstitutions> prohibitedSubstitutions;

	/**
	 * The cached value of the '{@link #getLexicalFinal() <em>Lexical Final</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLexicalFinal()
	 * @generated
	 * @ordered
	 */
	protected EList<XSDComplexFinal> lexicalFinal;

	/**
	 * The cached value of the '{@link #getBlock() <em>Block</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlock()
	 * @generated
	 * @ordered
	 */
	protected EList<XSDProhibitedSubstitutions> block;

	/**
	 * The default value of the '{@link #isMixed() <em>Mixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMixed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MIXED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMixed() <em>Mixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMixed()
	 * @generated
	 * @ordered
	 */
	protected boolean mixed = MIXED_EDEFAULT;

	/**
	 * This is true if the Mixed attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mixedESet;

	/**
	 * The cached value of the '{@link #getContentAnnotation() <em>Content Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentAnnotation()
	 * @generated
	 * @ordered
	 */
	protected XSDAnnotation contentAnnotation;

	/**
	 * The cached value of the '{@link #getBaseTypeDefinition() <em>Base Type Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseTypeDefinition()
	 * @generated
	 * @ordered
	 */
	protected XSDTypeDefinition baseTypeDefinition;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected XSDComplexTypeContent content;

	/**
	 * The cached value of the '{@link #getContentType() <em>Content Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentType()
	 * @generated
	 * @ordered
	 */
	protected XSDComplexTypeContent contentType;

	/**
	 * The cached value of the '{@link #getAttributeUses() <em>Attribute Uses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeUses()
	 * @generated
	 * @ordered
	 */
	protected EList<XSDAttributeUse> attributeUses;

	/**
	 * The cached value of the '{@link #getAttributeContents() <em>Attribute Contents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeContents()
	 * @generated
	 * @ordered
	 */
	protected EList<XSDAttributeGroupContent> attributeContents;

	/**
	 * The cached value of the '{@link #getAttributeWildcard() <em>Attribute Wildcard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeWildcard()
	 * @generated
	 * @ordered
	 */
	protected XSDWildcard attributeWildcard;

	/**
	 * The cached value of the '{@link #getAttributeWildcardContent() <em>Attribute Wildcard Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeWildcardContent()
	 * @generated
	 * @ordered
	 */
	protected XSDWildcard attributeWildcardContent;

	/**
	 * The cached value of the '{@link #getSyntheticParticle() <em>Synthetic Particle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyntheticParticle()
	 * @generated
	 * @ordered
	 */
	protected XSDParticle syntheticParticle;

	/**
	 * The cached value of the '{@link #getSyntheticWildcard() <em>Synthetic Wildcard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyntheticWildcard()
	 * @generated
	 * @ordered
	 */
	protected XSDWildcard syntheticWildcard;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XSDComplexTypeDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XsdPackage.Literals.XSD_COMPLEX_TYPE_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDDerivationMethod getDerivationMethod() {
		return derivationMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDerivationMethod(XSDDerivationMethod newDerivationMethod) {
		XSDDerivationMethod oldDerivationMethod = derivationMethod;
		derivationMethod = newDerivationMethod == null ? DERIVATION_METHOD_EDEFAULT : newDerivationMethod;
		boolean oldDerivationMethodESet = derivationMethodESet;
		derivationMethodESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__DERIVATION_METHOD, oldDerivationMethod, derivationMethod, !oldDerivationMethodESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDerivationMethod() {
		XSDDerivationMethod oldDerivationMethod = derivationMethod;
		boolean oldDerivationMethodESet = derivationMethodESet;
		derivationMethod = DERIVATION_METHOD_EDEFAULT;
		derivationMethodESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__DERIVATION_METHOD, oldDerivationMethod, DERIVATION_METHOD_EDEFAULT, oldDerivationMethodESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDerivationMethod() {
		return derivationMethodESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XSDComplexFinal> getFinal() {
		if (final_ == null) {
			final_ = new EDataTypeUniqueEList<XSDComplexFinal>(XSDComplexFinal.class, this, XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__FINAL);
		}
		return final_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(boolean newAbstract) {
		boolean oldAbstract = abstract_;
		abstract_ = newAbstract;
		boolean oldAbstractESet = abstractESet;
		abstractESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__ABSTRACT, oldAbstract, abstract_, !oldAbstractESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAbstract() {
		boolean oldAbstract = abstract_;
		boolean oldAbstractESet = abstractESet;
		abstract_ = ABSTRACT_EDEFAULT;
		abstractESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__ABSTRACT, oldAbstract, ABSTRACT_EDEFAULT, oldAbstractESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAbstract() {
		return abstractESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDContentTypeCategory getContentTypeCategory() {
		return contentTypeCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentTypeCategory(XSDContentTypeCategory newContentTypeCategory) {
		XSDContentTypeCategory oldContentTypeCategory = contentTypeCategory;
		contentTypeCategory = newContentTypeCategory == null ? CONTENT_TYPE_CATEGORY_EDEFAULT : newContentTypeCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__CONTENT_TYPE_CATEGORY, oldContentTypeCategory, contentTypeCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XSDProhibitedSubstitutions> getProhibitedSubstitutions() {
		if (prohibitedSubstitutions == null) {
			prohibitedSubstitutions = new EDataTypeUniqueEList<XSDProhibitedSubstitutions>(XSDProhibitedSubstitutions.class, this, XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__PROHIBITED_SUBSTITUTIONS);
		}
		return prohibitedSubstitutions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XSDComplexFinal> getLexicalFinal() {
		if (lexicalFinal == null) {
			lexicalFinal = new EDataTypeUniqueEList.Unsettable<XSDComplexFinal>(XSDComplexFinal.class, this, XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__LEXICAL_FINAL);
		}
		return lexicalFinal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLexicalFinal() {
		if (lexicalFinal != null) ((InternalEList.Unsettable<?>)lexicalFinal).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLexicalFinal() {
		return lexicalFinal != null && ((InternalEList.Unsettable<?>)lexicalFinal).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XSDProhibitedSubstitutions> getBlock() {
		if (block == null) {
			block = new EDataTypeUniqueEList.Unsettable<XSDProhibitedSubstitutions>(XSDProhibitedSubstitutions.class, this, XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__BLOCK);
		}
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBlock() {
		if (block != null) ((InternalEList.Unsettable<?>)block).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBlock() {
		return block != null && ((InternalEList.Unsettable<?>)block).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMixed() {
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMixed(boolean newMixed) {
		boolean oldMixed = mixed;
		mixed = newMixed;
		boolean oldMixedESet = mixedESet;
		mixedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__MIXED, oldMixed, mixed, !oldMixedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMixed() {
		boolean oldMixed = mixed;
		boolean oldMixedESet = mixedESet;
		mixed = MIXED_EDEFAULT;
		mixedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__MIXED, oldMixed, MIXED_EDEFAULT, oldMixedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMixed() {
		return mixedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDAnnotation getContentAnnotation() {
		return contentAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContentAnnotation(XSDAnnotation newContentAnnotation, NotificationChain msgs) {
		XSDAnnotation oldContentAnnotation = contentAnnotation;
		contentAnnotation = newContentAnnotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__CONTENT_ANNOTATION, oldContentAnnotation, newContentAnnotation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentAnnotation(XSDAnnotation newContentAnnotation) {
		if (newContentAnnotation != contentAnnotation) {
			NotificationChain msgs = null;
			if (contentAnnotation != null)
				msgs = ((InternalEObject)contentAnnotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__CONTENT_ANNOTATION, null, msgs);
			if (newContentAnnotation != null)
				msgs = ((InternalEObject)newContentAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__CONTENT_ANNOTATION, null, msgs);
			msgs = basicSetContentAnnotation(newContentAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__CONTENT_ANNOTATION, newContentAnnotation, newContentAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDTypeDefinition getBaseTypeDefinition() {
		return baseTypeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseTypeDefinition(XSDTypeDefinition newBaseTypeDefinition) {
		XSDTypeDefinition oldBaseTypeDefinition = baseTypeDefinition;
		baseTypeDefinition = newBaseTypeDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__BASE_TYPE_DEFINITION, oldBaseTypeDefinition, baseTypeDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDComplexTypeContent getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContent(XSDComplexTypeContent newContent, NotificationChain msgs) {
		XSDComplexTypeContent oldContent = content;
		content = newContent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__CONTENT, oldContent, newContent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(XSDComplexTypeContent newContent) {
		if (newContent != content) {
			NotificationChain msgs = null;
			if (content != null)
				msgs = ((InternalEObject)content).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__CONTENT, null, msgs);
			if (newContent != null)
				msgs = ((InternalEObject)newContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__CONTENT, null, msgs);
			msgs = basicSetContent(newContent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__CONTENT, newContent, newContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDComplexTypeContent getContentType() {
		return contentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentType(XSDComplexTypeContent newContentType) {
		XSDComplexTypeContent oldContentType = contentType;
		contentType = newContentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__CONTENT_TYPE, oldContentType, contentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XSDAttributeUse> getAttributeUses() {
		if (attributeUses == null) {
			attributeUses = new EObjectEList<XSDAttributeUse>(XSDAttributeUse.class, this, XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__ATTRIBUTE_USES);
		}
		return attributeUses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XSDAttributeGroupContent> getAttributeContents() {
		if (attributeContents == null) {
			attributeContents = new EObjectContainmentEList<XSDAttributeGroupContent>(XSDAttributeGroupContent.class, this, XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__ATTRIBUTE_CONTENTS);
		}
		return attributeContents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDWildcard getAttributeWildcard() {
		return attributeWildcard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeWildcard(XSDWildcard newAttributeWildcard) {
		XSDWildcard oldAttributeWildcard = attributeWildcard;
		attributeWildcard = newAttributeWildcard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__ATTRIBUTE_WILDCARD, oldAttributeWildcard, attributeWildcard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDWildcard getAttributeWildcardContent() {
		return attributeWildcardContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributeWildcardContent(XSDWildcard newAttributeWildcardContent, NotificationChain msgs) {
		XSDWildcard oldAttributeWildcardContent = attributeWildcardContent;
		attributeWildcardContent = newAttributeWildcardContent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__ATTRIBUTE_WILDCARD_CONTENT, oldAttributeWildcardContent, newAttributeWildcardContent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeWildcardContent(XSDWildcard newAttributeWildcardContent) {
		if (newAttributeWildcardContent != attributeWildcardContent) {
			NotificationChain msgs = null;
			if (attributeWildcardContent != null)
				msgs = ((InternalEObject)attributeWildcardContent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__ATTRIBUTE_WILDCARD_CONTENT, null, msgs);
			if (newAttributeWildcardContent != null)
				msgs = ((InternalEObject)newAttributeWildcardContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__ATTRIBUTE_WILDCARD_CONTENT, null, msgs);
			msgs = basicSetAttributeWildcardContent(newAttributeWildcardContent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__ATTRIBUTE_WILDCARD_CONTENT, newAttributeWildcardContent, newAttributeWildcardContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDTypeDefinition getRootTypeDefinition() {
		// TODO: implement this method to return the 'Root Type Definition' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDParticle getSyntheticParticle() {
		return syntheticParticle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSyntheticParticle(XSDParticle newSyntheticParticle, NotificationChain msgs) {
		XSDParticle oldSyntheticParticle = syntheticParticle;
		syntheticParticle = newSyntheticParticle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__SYNTHETIC_PARTICLE, oldSyntheticParticle, newSyntheticParticle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSyntheticParticle(XSDParticle newSyntheticParticle) {
		if (newSyntheticParticle != syntheticParticle) {
			NotificationChain msgs = null;
			if (syntheticParticle != null)
				msgs = ((InternalEObject)syntheticParticle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__SYNTHETIC_PARTICLE, null, msgs);
			if (newSyntheticParticle != null)
				msgs = ((InternalEObject)newSyntheticParticle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__SYNTHETIC_PARTICLE, null, msgs);
			msgs = basicSetSyntheticParticle(newSyntheticParticle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__SYNTHETIC_PARTICLE, newSyntheticParticle, newSyntheticParticle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDWildcard getSyntheticWildcard() {
		return syntheticWildcard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSyntheticWildcard(XSDWildcard newSyntheticWildcard, NotificationChain msgs) {
		XSDWildcard oldSyntheticWildcard = syntheticWildcard;
		syntheticWildcard = newSyntheticWildcard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__SYNTHETIC_WILDCARD, oldSyntheticWildcard, newSyntheticWildcard);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSyntheticWildcard(XSDWildcard newSyntheticWildcard) {
		if (newSyntheticWildcard != syntheticWildcard) {
			NotificationChain msgs = null;
			if (syntheticWildcard != null)
				msgs = ((InternalEObject)syntheticWildcard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__SYNTHETIC_WILDCARD, null, msgs);
			if (newSyntheticWildcard != null)
				msgs = ((InternalEObject)newSyntheticWildcard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__SYNTHETIC_WILDCARD, null, msgs);
			msgs = basicSetSyntheticWildcard(newSyntheticWildcard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__SYNTHETIC_WILDCARD, newSyntheticWildcard, newSyntheticWildcard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__CONTENT_ANNOTATION:
				return basicSetContentAnnotation(null, msgs);
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__CONTENT:
				return basicSetContent(null, msgs);
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__ATTRIBUTE_CONTENTS:
				return ((InternalEList<?>)getAttributeContents()).basicRemove(otherEnd, msgs);
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__ATTRIBUTE_WILDCARD_CONTENT:
				return basicSetAttributeWildcardContent(null, msgs);
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__SYNTHETIC_PARTICLE:
				return basicSetSyntheticParticle(null, msgs);
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__SYNTHETIC_WILDCARD:
				return basicSetSyntheticWildcard(null, msgs);
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
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__DERIVATION_METHOD:
				return getDerivationMethod();
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__FINAL:
				return getFinal();
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__ABSTRACT:
				return isAbstract();
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__CONTENT_TYPE_CATEGORY:
				return getContentTypeCategory();
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__PROHIBITED_SUBSTITUTIONS:
				return getProhibitedSubstitutions();
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__LEXICAL_FINAL:
				return getLexicalFinal();
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__BLOCK:
				return getBlock();
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__MIXED:
				return isMixed();
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__CONTENT_ANNOTATION:
				return getContentAnnotation();
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__BASE_TYPE_DEFINITION:
				return getBaseTypeDefinition();
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__CONTENT:
				return getContent();
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__CONTENT_TYPE:
				return getContentType();
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__ATTRIBUTE_USES:
				return getAttributeUses();
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__ATTRIBUTE_CONTENTS:
				return getAttributeContents();
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__ATTRIBUTE_WILDCARD:
				return getAttributeWildcard();
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__ATTRIBUTE_WILDCARD_CONTENT:
				return getAttributeWildcardContent();
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__ROOT_TYPE_DEFINITION:
				return getRootTypeDefinition();
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__SYNTHETIC_PARTICLE:
				return getSyntheticParticle();
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__SYNTHETIC_WILDCARD:
				return getSyntheticWildcard();
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
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__DERIVATION_METHOD:
				setDerivationMethod((XSDDerivationMethod)newValue);
				return;
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__FINAL:
				getFinal().clear();
				getFinal().addAll((Collection<? extends XSDComplexFinal>)newValue);
				return;
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__ABSTRACT:
				setAbstract((Boolean)newValue);
				return;
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__CONTENT_TYPE_CATEGORY:
				setContentTypeCategory((XSDContentTypeCategory)newValue);
				return;
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__PROHIBITED_SUBSTITUTIONS:
				getProhibitedSubstitutions().clear();
				getProhibitedSubstitutions().addAll((Collection<? extends XSDProhibitedSubstitutions>)newValue);
				return;
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__LEXICAL_FINAL:
				getLexicalFinal().clear();
				getLexicalFinal().addAll((Collection<? extends XSDComplexFinal>)newValue);
				return;
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__BLOCK:
				getBlock().clear();
				getBlock().addAll((Collection<? extends XSDProhibitedSubstitutions>)newValue);
				return;
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__MIXED:
				setMixed((Boolean)newValue);
				return;
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__CONTENT_ANNOTATION:
				setContentAnnotation((XSDAnnotation)newValue);
				return;
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__BASE_TYPE_DEFINITION:
				setBaseTypeDefinition((XSDTypeDefinition)newValue);
				return;
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__CONTENT:
				setContent((XSDComplexTypeContent)newValue);
				return;
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__CONTENT_TYPE:
				setContentType((XSDComplexTypeContent)newValue);
				return;
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__ATTRIBUTE_USES:
				getAttributeUses().clear();
				getAttributeUses().addAll((Collection<? extends XSDAttributeUse>)newValue);
				return;
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__ATTRIBUTE_CONTENTS:
				getAttributeContents().clear();
				getAttributeContents().addAll((Collection<? extends XSDAttributeGroupContent>)newValue);
				return;
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__ATTRIBUTE_WILDCARD:
				setAttributeWildcard((XSDWildcard)newValue);
				return;
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__ATTRIBUTE_WILDCARD_CONTENT:
				setAttributeWildcardContent((XSDWildcard)newValue);
				return;
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__SYNTHETIC_PARTICLE:
				setSyntheticParticle((XSDParticle)newValue);
				return;
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__SYNTHETIC_WILDCARD:
				setSyntheticWildcard((XSDWildcard)newValue);
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
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__DERIVATION_METHOD:
				unsetDerivationMethod();
				return;
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__FINAL:
				getFinal().clear();
				return;
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__ABSTRACT:
				unsetAbstract();
				return;
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__CONTENT_TYPE_CATEGORY:
				setContentTypeCategory(CONTENT_TYPE_CATEGORY_EDEFAULT);
				return;
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__PROHIBITED_SUBSTITUTIONS:
				getProhibitedSubstitutions().clear();
				return;
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__LEXICAL_FINAL:
				unsetLexicalFinal();
				return;
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__BLOCK:
				unsetBlock();
				return;
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__MIXED:
				unsetMixed();
				return;
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__CONTENT_ANNOTATION:
				setContentAnnotation((XSDAnnotation)null);
				return;
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__BASE_TYPE_DEFINITION:
				setBaseTypeDefinition((XSDTypeDefinition)null);
				return;
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__CONTENT:
				setContent((XSDComplexTypeContent)null);
				return;
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__CONTENT_TYPE:
				setContentType((XSDComplexTypeContent)null);
				return;
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__ATTRIBUTE_USES:
				getAttributeUses().clear();
				return;
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__ATTRIBUTE_CONTENTS:
				getAttributeContents().clear();
				return;
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__ATTRIBUTE_WILDCARD:
				setAttributeWildcard((XSDWildcard)null);
				return;
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__ATTRIBUTE_WILDCARD_CONTENT:
				setAttributeWildcardContent((XSDWildcard)null);
				return;
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__SYNTHETIC_PARTICLE:
				setSyntheticParticle((XSDParticle)null);
				return;
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__SYNTHETIC_WILDCARD:
				setSyntheticWildcard((XSDWildcard)null);
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
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__DERIVATION_METHOD:
				return isSetDerivationMethod();
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__FINAL:
				return final_ != null && !final_.isEmpty();
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__ABSTRACT:
				return isSetAbstract();
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__CONTENT_TYPE_CATEGORY:
				return contentTypeCategory != CONTENT_TYPE_CATEGORY_EDEFAULT;
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__PROHIBITED_SUBSTITUTIONS:
				return prohibitedSubstitutions != null && !prohibitedSubstitutions.isEmpty();
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__LEXICAL_FINAL:
				return isSetLexicalFinal();
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__BLOCK:
				return isSetBlock();
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__MIXED:
				return isSetMixed();
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__CONTENT_ANNOTATION:
				return contentAnnotation != null;
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__BASE_TYPE_DEFINITION:
				return baseTypeDefinition != null;
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__CONTENT:
				return content != null;
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__CONTENT_TYPE:
				return contentType != null;
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__ATTRIBUTE_USES:
				return attributeUses != null && !attributeUses.isEmpty();
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__ATTRIBUTE_CONTENTS:
				return attributeContents != null && !attributeContents.isEmpty();
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__ATTRIBUTE_WILDCARD:
				return attributeWildcard != null;
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__ATTRIBUTE_WILDCARD_CONTENT:
				return attributeWildcardContent != null;
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__ROOT_TYPE_DEFINITION:
				return getRootTypeDefinition() != null;
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__SYNTHETIC_PARTICLE:
				return syntheticParticle != null;
			case XsdPackage.XSD_COMPLEX_TYPE_DEFINITION__SYNTHETIC_WILDCARD:
				return syntheticWildcard != null;
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
		result.append(" (derivationMethod: ");
		if (derivationMethodESet) result.append(derivationMethod); else result.append("<unset>");
		result.append(", final: ");
		result.append(final_);
		result.append(", abstract: ");
		if (abstractESet) result.append(abstract_); else result.append("<unset>");
		result.append(", contentTypeCategory: ");
		result.append(contentTypeCategory);
		result.append(", prohibitedSubstitutions: ");
		result.append(prohibitedSubstitutions);
		result.append(", lexicalFinal: ");
		result.append(lexicalFinal);
		result.append(", block: ");
		result.append(block);
		result.append(", mixed: ");
		if (mixedESet) result.append(mixed); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //XSDComplexTypeDefinitionImpl
