/**
 */
package tesis.xsd_ecore.xsd.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.w3c.dom.Attr;
import org.w3c.dom.Element;

import tesis.xsd_ecore.xsd.XSDAnnotation;
import tesis.xsd_ecore.xsd.XsdPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XSD Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDAnnotationImpl#getApplicationInformation <em>Application Information</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDAnnotationImpl#getUserInformation <em>User Information</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDAnnotationImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XSDAnnotationImpl extends XSDComponentImpl implements XSDAnnotation {
	/**
	 * The cached value of the '{@link #getApplicationInformation() <em>Application Information</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationInformation()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> applicationInformation;

	/**
	 * The cached value of the '{@link #getUserInformation() <em>User Information</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserInformation()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> userInformation;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attr> attributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XSDAnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XsdPackage.Literals.XSD_ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getApplicationInformation() {
		if (applicationInformation == null) {
			applicationInformation = new EDataTypeUniqueEList<Element>(Element.class, this, XsdPackage.XSD_ANNOTATION__APPLICATION_INFORMATION);
		}
		return applicationInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getUserInformation() {
		if (userInformation == null) {
			userInformation = new EDataTypeUniqueEList<Element>(Element.class, this, XsdPackage.XSD_ANNOTATION__USER_INFORMATION);
		}
		return userInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attr> getAttributes() {
		if (attributes == null) {
			attributes = new EDataTypeUniqueEList<Attr>(Attr.class, this, XsdPackage.XSD_ANNOTATION__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XsdPackage.XSD_ANNOTATION__APPLICATION_INFORMATION:
				return getApplicationInformation();
			case XsdPackage.XSD_ANNOTATION__USER_INFORMATION:
				return getUserInformation();
			case XsdPackage.XSD_ANNOTATION__ATTRIBUTES:
				return getAttributes();
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
			case XsdPackage.XSD_ANNOTATION__APPLICATION_INFORMATION:
				getApplicationInformation().clear();
				getApplicationInformation().addAll((Collection<? extends Element>)newValue);
				return;
			case XsdPackage.XSD_ANNOTATION__USER_INFORMATION:
				getUserInformation().clear();
				getUserInformation().addAll((Collection<? extends Element>)newValue);
				return;
			case XsdPackage.XSD_ANNOTATION__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attr>)newValue);
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
			case XsdPackage.XSD_ANNOTATION__APPLICATION_INFORMATION:
				getApplicationInformation().clear();
				return;
			case XsdPackage.XSD_ANNOTATION__USER_INFORMATION:
				getUserInformation().clear();
				return;
			case XsdPackage.XSD_ANNOTATION__ATTRIBUTES:
				getAttributes().clear();
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
			case XsdPackage.XSD_ANNOTATION__APPLICATION_INFORMATION:
				return applicationInformation != null && !applicationInformation.isEmpty();
			case XsdPackage.XSD_ANNOTATION__USER_INFORMATION:
				return userInformation != null && !userInformation.isEmpty();
			case XsdPackage.XSD_ANNOTATION__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
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
		result.append(" (applicationInformation: ");
		result.append(applicationInformation);
		result.append(", userInformation: ");
		result.append(userInformation);
		result.append(", attributes: ");
		result.append(attributes);
		result.append(')');
		return result.toString();
	}

} //XSDAnnotationImpl
