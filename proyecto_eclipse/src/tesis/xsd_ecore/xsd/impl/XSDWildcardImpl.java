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
import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tesis.xsd_ecore.xsd.XSDAnnotation;
import tesis.xsd_ecore.xsd.XSDNamespaceConstraintCategory;
import tesis.xsd_ecore.xsd.XSDProcessContents;
import tesis.xsd_ecore.xsd.XSDWildcard;
import tesis.xsd_ecore.xsd.XsdPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XSD Wildcard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDWildcardImpl#getNamespaceConstraintCategory <em>Namespace Constraint Category</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDWildcardImpl#getNamespaceConstraint <em>Namespace Constraint</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDWildcardImpl#getProcessContents <em>Process Contents</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDWildcardImpl#getLexicalNamespaceConstraint <em>Lexical Namespace Constraint</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDWildcardImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDWildcardImpl#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XSDWildcardImpl extends XSDTermImpl implements XSDWildcard {
	/**
	 * The default value of the '{@link #getNamespaceConstraintCategory() <em>Namespace Constraint Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespaceConstraintCategory()
	 * @generated
	 * @ordered
	 */
	protected static final XSDNamespaceConstraintCategory NAMESPACE_CONSTRAINT_CATEGORY_EDEFAULT = XSDNamespaceConstraintCategory.ANY;

	/**
	 * The cached value of the '{@link #getNamespaceConstraintCategory() <em>Namespace Constraint Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespaceConstraintCategory()
	 * @generated
	 * @ordered
	 */
	protected XSDNamespaceConstraintCategory namespaceConstraintCategory = NAMESPACE_CONSTRAINT_CATEGORY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNamespaceConstraint() <em>Namespace Constraint</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespaceConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<String> namespaceConstraint;

	/**
	 * The default value of the '{@link #getProcessContents() <em>Process Contents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessContents()
	 * @generated
	 * @ordered
	 */
	protected static final XSDProcessContents PROCESS_CONTENTS_EDEFAULT = XSDProcessContents.STRICT;

	/**
	 * The cached value of the '{@link #getProcessContents() <em>Process Contents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessContents()
	 * @generated
	 * @ordered
	 */
	protected XSDProcessContents processContents = PROCESS_CONTENTS_EDEFAULT;

	/**
	 * This is true if the Process Contents attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean processContentsESet;

	/**
	 * The cached value of the '{@link #getLexicalNamespaceConstraint() <em>Lexical Namespace Constraint</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLexicalNamespaceConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<String> lexicalNamespaceConstraint;

	/**
	 * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotation()
	 * @generated
	 * @ordered
	 */
	protected XSDAnnotation annotation;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XSDWildcardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XsdPackage.Literals.XSD_WILDCARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDNamespaceConstraintCategory getNamespaceConstraintCategory() {
		return namespaceConstraintCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespaceConstraintCategory(XSDNamespaceConstraintCategory newNamespaceConstraintCategory) {
		XSDNamespaceConstraintCategory oldNamespaceConstraintCategory = namespaceConstraintCategory;
		namespaceConstraintCategory = newNamespaceConstraintCategory == null ? NAMESPACE_CONSTRAINT_CATEGORY_EDEFAULT : newNamespaceConstraintCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_WILDCARD__NAMESPACE_CONSTRAINT_CATEGORY, oldNamespaceConstraintCategory, namespaceConstraintCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getNamespaceConstraint() {
		if (namespaceConstraint == null) {
			namespaceConstraint = new EDataTypeUniqueEList<String>(String.class, this, XsdPackage.XSD_WILDCARD__NAMESPACE_CONSTRAINT);
		}
		return namespaceConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDProcessContents getProcessContents() {
		return processContents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessContents(XSDProcessContents newProcessContents) {
		XSDProcessContents oldProcessContents = processContents;
		processContents = newProcessContents == null ? PROCESS_CONTENTS_EDEFAULT : newProcessContents;
		boolean oldProcessContentsESet = processContentsESet;
		processContentsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_WILDCARD__PROCESS_CONTENTS, oldProcessContents, processContents, !oldProcessContentsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProcessContents() {
		XSDProcessContents oldProcessContents = processContents;
		boolean oldProcessContentsESet = processContentsESet;
		processContents = PROCESS_CONTENTS_EDEFAULT;
		processContentsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XsdPackage.XSD_WILDCARD__PROCESS_CONTENTS, oldProcessContents, PROCESS_CONTENTS_EDEFAULT, oldProcessContentsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProcessContents() {
		return processContentsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getLexicalNamespaceConstraint() {
		if (lexicalNamespaceConstraint == null) {
			lexicalNamespaceConstraint = new EDataTypeUniqueEList.Unsettable<String>(String.class, this, XsdPackage.XSD_WILDCARD__LEXICAL_NAMESPACE_CONSTRAINT);
		}
		return lexicalNamespaceConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLexicalNamespaceConstraint() {
		if (lexicalNamespaceConstraint != null) ((InternalEList.Unsettable<?>)lexicalNamespaceConstraint).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLexicalNamespaceConstraint() {
		return lexicalNamespaceConstraint != null && ((InternalEList.Unsettable<?>)lexicalNamespaceConstraint).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDAnnotation getAnnotation() {
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotation(XSDAnnotation newAnnotation, NotificationChain msgs) {
		XSDAnnotation oldAnnotation = annotation;
		annotation = newAnnotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_WILDCARD__ANNOTATION, oldAnnotation, newAnnotation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotation(XSDAnnotation newAnnotation) {
		if (newAnnotation != annotation) {
			NotificationChain msgs = null;
			if (annotation != null)
				msgs = ((InternalEObject)annotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XsdPackage.XSD_WILDCARD__ANNOTATION, null, msgs);
			if (newAnnotation != null)
				msgs = ((InternalEObject)newAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XsdPackage.XSD_WILDCARD__ANNOTATION, null, msgs);
			msgs = basicSetAnnotation(newAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_WILDCARD__ANNOTATION, newAnnotation, newAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XSDAnnotation> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectEList<XSDAnnotation>(XSDAnnotation.class, this, XsdPackage.XSD_WILDCARD__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XsdPackage.XSD_WILDCARD__ANNOTATION:
				return basicSetAnnotation(null, msgs);
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
			case XsdPackage.XSD_WILDCARD__NAMESPACE_CONSTRAINT_CATEGORY:
				return getNamespaceConstraintCategory();
			case XsdPackage.XSD_WILDCARD__NAMESPACE_CONSTRAINT:
				return getNamespaceConstraint();
			case XsdPackage.XSD_WILDCARD__PROCESS_CONTENTS:
				return getProcessContents();
			case XsdPackage.XSD_WILDCARD__LEXICAL_NAMESPACE_CONSTRAINT:
				return getLexicalNamespaceConstraint();
			case XsdPackage.XSD_WILDCARD__ANNOTATION:
				return getAnnotation();
			case XsdPackage.XSD_WILDCARD__ANNOTATIONS:
				return getAnnotations();
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
			case XsdPackage.XSD_WILDCARD__NAMESPACE_CONSTRAINT_CATEGORY:
				setNamespaceConstraintCategory((XSDNamespaceConstraintCategory)newValue);
				return;
			case XsdPackage.XSD_WILDCARD__NAMESPACE_CONSTRAINT:
				getNamespaceConstraint().clear();
				getNamespaceConstraint().addAll((Collection<? extends String>)newValue);
				return;
			case XsdPackage.XSD_WILDCARD__PROCESS_CONTENTS:
				setProcessContents((XSDProcessContents)newValue);
				return;
			case XsdPackage.XSD_WILDCARD__LEXICAL_NAMESPACE_CONSTRAINT:
				getLexicalNamespaceConstraint().clear();
				getLexicalNamespaceConstraint().addAll((Collection<? extends String>)newValue);
				return;
			case XsdPackage.XSD_WILDCARD__ANNOTATION:
				setAnnotation((XSDAnnotation)newValue);
				return;
			case XsdPackage.XSD_WILDCARD__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends XSDAnnotation>)newValue);
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
			case XsdPackage.XSD_WILDCARD__NAMESPACE_CONSTRAINT_CATEGORY:
				setNamespaceConstraintCategory(NAMESPACE_CONSTRAINT_CATEGORY_EDEFAULT);
				return;
			case XsdPackage.XSD_WILDCARD__NAMESPACE_CONSTRAINT:
				getNamespaceConstraint().clear();
				return;
			case XsdPackage.XSD_WILDCARD__PROCESS_CONTENTS:
				unsetProcessContents();
				return;
			case XsdPackage.XSD_WILDCARD__LEXICAL_NAMESPACE_CONSTRAINT:
				unsetLexicalNamespaceConstraint();
				return;
			case XsdPackage.XSD_WILDCARD__ANNOTATION:
				setAnnotation((XSDAnnotation)null);
				return;
			case XsdPackage.XSD_WILDCARD__ANNOTATIONS:
				getAnnotations().clear();
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
			case XsdPackage.XSD_WILDCARD__NAMESPACE_CONSTRAINT_CATEGORY:
				return namespaceConstraintCategory != NAMESPACE_CONSTRAINT_CATEGORY_EDEFAULT;
			case XsdPackage.XSD_WILDCARD__NAMESPACE_CONSTRAINT:
				return namespaceConstraint != null && !namespaceConstraint.isEmpty();
			case XsdPackage.XSD_WILDCARD__PROCESS_CONTENTS:
				return isSetProcessContents();
			case XsdPackage.XSD_WILDCARD__LEXICAL_NAMESPACE_CONSTRAINT:
				return isSetLexicalNamespaceConstraint();
			case XsdPackage.XSD_WILDCARD__ANNOTATION:
				return annotation != null;
			case XsdPackage.XSD_WILDCARD__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
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
		result.append(" (namespaceConstraintCategory: ");
		result.append(namespaceConstraintCategory);
		result.append(", namespaceConstraint: ");
		result.append(namespaceConstraint);
		result.append(", processContents: ");
		if (processContentsESet) result.append(processContents); else result.append("<unset>");
		result.append(", lexicalNamespaceConstraint: ");
		result.append(lexicalNamespaceConstraint);
		result.append(')');
		return result.toString();
	}

} //XSDWildcardImpl
