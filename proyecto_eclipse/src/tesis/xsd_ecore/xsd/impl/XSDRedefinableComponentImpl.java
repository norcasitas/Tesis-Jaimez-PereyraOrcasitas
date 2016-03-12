/**
 */
package tesis.xsd_ecore.xsd.impl;

import org.eclipse.emf.ecore.EClass;

import tesis.xsd_ecore.xsd.XSDRedefinableComponent;
import tesis.xsd_ecore.xsd.XsdPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XSD Redefinable Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDRedefinableComponentImpl#isCircular <em>Circular</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class XSDRedefinableComponentImpl extends XSDNamedComponentImpl implements XSDRedefinableComponent {
	/**
	 * The default value of the '{@link #isCircular() <em>Circular</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCircular()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CIRCULAR_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XSDRedefinableComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XsdPackage.Literals.XSD_REDEFINABLE_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCircular() {
		// TODO: implement this method to return the 'Circular' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XsdPackage.XSD_REDEFINABLE_COMPONENT__CIRCULAR:
				return isCircular();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case XsdPackage.XSD_REDEFINABLE_COMPONENT__CIRCULAR:
				return isCircular() != CIRCULAR_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //XSDRedefinableComponentImpl
