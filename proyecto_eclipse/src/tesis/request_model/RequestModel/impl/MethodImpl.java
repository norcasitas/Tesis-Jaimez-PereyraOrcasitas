/**
 */
package tesis.request_model.RequestModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tesis.request_model.RequestModel.Method;
import tesis.request_model.RequestModel.Parameter;
import tesis.request_model.RequestModel.RequestModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tesis.request_model.RequestModel.impl.MethodImpl#getInParameters <em>In Parameters</em>}</li>
 *   <li>{@link tesis.request_model.RequestModel.impl.MethodImpl#getName <em>Name</em>}</li>
 *   <li>{@link tesis.request_model.RequestModel.impl.MethodImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link tesis.request_model.RequestModel.impl.MethodImpl#getOutParameters <em>Out Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodImpl extends MinimalEObjectImpl.Container implements Method {
	/**
	 * The cached value of the '{@link #getInParameters() <em>In Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> inParameters;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOutParameters() <em>Out Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> outParameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequestModelPackage.Literals.METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getInParameters() {
		if (inParameters == null) {
			inParameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, RequestModelPackage.METHOD__IN_PARAMETERS);
		}
		return inParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequestModelPackage.METHOD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequestModelPackage.METHOD__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getOutParameters() {
		if (outParameters == null) {
			outParameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, RequestModelPackage.METHOD__OUT_PARAMETERS);
		}
		return outParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RequestModelPackage.METHOD__IN_PARAMETERS:
				return ((InternalEList<?>)getInParameters()).basicRemove(otherEnd, msgs);
			case RequestModelPackage.METHOD__OUT_PARAMETERS:
				return ((InternalEList<?>)getOutParameters()).basicRemove(otherEnd, msgs);
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
			case RequestModelPackage.METHOD__IN_PARAMETERS:
				return getInParameters();
			case RequestModelPackage.METHOD__NAME:
				return getName();
			case RequestModelPackage.METHOD__DESCRIPTION:
				return getDescription();
			case RequestModelPackage.METHOD__OUT_PARAMETERS:
				return getOutParameters();
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
			case RequestModelPackage.METHOD__IN_PARAMETERS:
				getInParameters().clear();
				getInParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case RequestModelPackage.METHOD__NAME:
				setName((String)newValue);
				return;
			case RequestModelPackage.METHOD__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case RequestModelPackage.METHOD__OUT_PARAMETERS:
				getOutParameters().clear();
				getOutParameters().addAll((Collection<? extends Parameter>)newValue);
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
			case RequestModelPackage.METHOD__IN_PARAMETERS:
				getInParameters().clear();
				return;
			case RequestModelPackage.METHOD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RequestModelPackage.METHOD__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case RequestModelPackage.METHOD__OUT_PARAMETERS:
				getOutParameters().clear();
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
			case RequestModelPackage.METHOD__IN_PARAMETERS:
				return inParameters != null && !inParameters.isEmpty();
			case RequestModelPackage.METHOD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RequestModelPackage.METHOD__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case RequestModelPackage.METHOD__OUT_PARAMETERS:
				return outParameters != null && !outParameters.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //MethodImpl
