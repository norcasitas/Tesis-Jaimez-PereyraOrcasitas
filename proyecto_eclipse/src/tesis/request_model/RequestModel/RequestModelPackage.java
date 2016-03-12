/**
 */
package tesis.request_model.RequestModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see tesis.request_model.RequestModel.RequestModelFactory
 * @model kind="package"
 * @generated
 */
public interface RequestModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "RequestModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "RequestModelURI";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "RequestModelPrefix";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RequestModelPackage eINSTANCE = tesis.request_model.RequestModel.impl.RequestModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link tesis.request_model.RequestModel.impl.RequestModelImpl <em>Request Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.request_model.RequestModel.impl.RequestModelImpl
	 * @see tesis.request_model.RequestModel.impl.RequestModelPackageImpl#getRequestModel()
	 * @generated
	 */
	int REQUEST_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_MODEL__METHODS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_MODEL__NAME = 1;

	/**
	 * The number of structural features of the '<em>Request Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Request Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tesis.request_model.RequestModel.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.request_model.RequestModel.impl.MethodImpl
	 * @see tesis.request_model.RequestModel.impl.RequestModelPackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 1;

	/**
	 * The feature id for the '<em><b>In Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__IN_PARAMETERS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Out Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__OUT_PARAMETERS = 3;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tesis.request_model.RequestModel.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesis.request_model.RequestModel.impl.ParameterImpl
	 * @see tesis.request_model.RequestModel.impl.RequestModelPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link tesis.request_model.RequestModel.RequestModel <em>Request Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request Model</em>'.
	 * @see tesis.request_model.RequestModel.RequestModel
	 * @generated
	 */
	EClass getRequestModel();

	/**
	 * Returns the meta object for the containment reference list '{@link tesis.request_model.RequestModel.RequestModel#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see tesis.request_model.RequestModel.RequestModel#getMethods()
	 * @see #getRequestModel()
	 * @generated
	 */
	EReference getRequestModel_Methods();

	/**
	 * Returns the meta object for the attribute '{@link tesis.request_model.RequestModel.RequestModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tesis.request_model.RequestModel.RequestModel#getName()
	 * @see #getRequestModel()
	 * @generated
	 */
	EAttribute getRequestModel_Name();

	/**
	 * Returns the meta object for class '{@link tesis.request_model.RequestModel.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see tesis.request_model.RequestModel.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for the containment reference list '{@link tesis.request_model.RequestModel.Method#getInParameters <em>In Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>In Parameters</em>'.
	 * @see tesis.request_model.RequestModel.Method#getInParameters()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_InParameters();

	/**
	 * Returns the meta object for the attribute '{@link tesis.request_model.RequestModel.Method#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tesis.request_model.RequestModel.Method#getName()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Name();

	/**
	 * Returns the meta object for the attribute '{@link tesis.request_model.RequestModel.Method#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see tesis.request_model.RequestModel.Method#getDescription()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link tesis.request_model.RequestModel.Method#getOutParameters <em>Out Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Out Parameters</em>'.
	 * @see tesis.request_model.RequestModel.Method#getOutParameters()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_OutParameters();

	/**
	 * Returns the meta object for class '{@link tesis.request_model.RequestModel.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see tesis.request_model.RequestModel.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link tesis.request_model.RequestModel.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see tesis.request_model.RequestModel.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Type();

	/**
	 * Returns the meta object for the attribute '{@link tesis.request_model.RequestModel.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tesis.request_model.RequestModel.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RequestModelFactory getRequestModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link tesis.request_model.RequestModel.impl.RequestModelImpl <em>Request Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.request_model.RequestModel.impl.RequestModelImpl
		 * @see tesis.request_model.RequestModel.impl.RequestModelPackageImpl#getRequestModel()
		 * @generated
		 */
		EClass REQUEST_MODEL = eINSTANCE.getRequestModel();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST_MODEL__METHODS = eINSTANCE.getRequestModel_Methods();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST_MODEL__NAME = eINSTANCE.getRequestModel_Name();

		/**
		 * The meta object literal for the '{@link tesis.request_model.RequestModel.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.request_model.RequestModel.impl.MethodImpl
		 * @see tesis.request_model.RequestModel.impl.RequestModelPackageImpl#getMethod()
		 * @generated
		 */
		EClass METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '<em><b>In Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__IN_PARAMETERS = eINSTANCE.getMethod_InParameters();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__NAME = eINSTANCE.getMethod_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__DESCRIPTION = eINSTANCE.getMethod_Description();

		/**
		 * The meta object literal for the '<em><b>Out Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__OUT_PARAMETERS = eINSTANCE.getMethod_OutParameters();

		/**
		 * The meta object literal for the '{@link tesis.request_model.RequestModel.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesis.request_model.RequestModel.impl.ParameterImpl
		 * @see tesis.request_model.RequestModel.impl.RequestModelPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

	}

} //RequestModelPackage
