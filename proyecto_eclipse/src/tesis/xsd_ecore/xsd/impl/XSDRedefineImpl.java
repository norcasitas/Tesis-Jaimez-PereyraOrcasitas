/**
 */
package tesis.xsd_ecore.xsd.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tesis.xsd_ecore.xsd.XSDAnnotation;
import tesis.xsd_ecore.xsd.XSDRedefine;
import tesis.xsd_ecore.xsd.XSDRedefineContent;
import tesis.xsd_ecore.xsd.XsdPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XSD Redefine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDRedefineImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDRedefineImpl#getContents <em>Contents</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XSDRedefineImpl extends XSDSchemaCompositorImpl implements XSDRedefine {
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
	 * The cached value of the '{@link #getContents() <em>Contents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContents()
	 * @generated
	 * @ordered
	 */
	protected EList<XSDRedefineContent> contents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XSDRedefineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XsdPackage.Literals.XSD_REDEFINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XSDAnnotation> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectEList<XSDAnnotation>(XSDAnnotation.class, this, XsdPackage.XSD_REDEFINE__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XSDRedefineContent> getContents() {
		if (contents == null) {
			contents = new EObjectContainmentEList<XSDRedefineContent>(XSDRedefineContent.class, this, XsdPackage.XSD_REDEFINE__CONTENTS);
		}
		return contents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XsdPackage.XSD_REDEFINE__CONTENTS:
				return ((InternalEList<?>)getContents()).basicRemove(otherEnd, msgs);
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
			case XsdPackage.XSD_REDEFINE__ANNOTATIONS:
				return getAnnotations();
			case XsdPackage.XSD_REDEFINE__CONTENTS:
				return getContents();
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
			case XsdPackage.XSD_REDEFINE__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends XSDAnnotation>)newValue);
				return;
			case XsdPackage.XSD_REDEFINE__CONTENTS:
				getContents().clear();
				getContents().addAll((Collection<? extends XSDRedefineContent>)newValue);
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
			case XsdPackage.XSD_REDEFINE__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case XsdPackage.XSD_REDEFINE__CONTENTS:
				getContents().clear();
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
			case XsdPackage.XSD_REDEFINE__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case XsdPackage.XSD_REDEFINE__CONTENTS:
				return contents != null && !contents.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //XSDRedefineImpl
