/**
 */
package tesis.wsdl_ecore.wsdl;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Types</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a WSDL types element. The types element encloses data type definitions that are relevant for the exchanged messages.
 * <!-- end-model-doc -->
 *
 *
 * @see tesis.wsdl_ecore.wsdl.WsdlPackage#getTypes()
 * @model superTypes="tesis.wsdl_ecore.wsdl.ExtensibleElement tesis.wsdl_ecore.wsdl.ITypes"
 * @generated
 */
public interface Types extends ExtensibleElement, javax.wsdl.Types {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" type="tesis.wsdl_ecore.wsdl.IList" many="false"
	 * @generated
	 */
	List getSchemas();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="tesis.wsdl_ecore.wsdl.IList" many="false"
	 * @generated
	 */
	List getSchemas(String namespaceURI);

} // Types
