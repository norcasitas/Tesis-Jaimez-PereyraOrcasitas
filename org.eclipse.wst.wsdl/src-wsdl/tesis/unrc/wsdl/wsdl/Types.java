/**
 */
package tesis.unrc.wsdl.wsdl;

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
 * @see tesis.unrc.wsdl.wsdl.WSDLPackage#getTypes()
 * @model superTypes="tesis.unrc.wsdl.wsdl.ExtensibleElement tesis.unrc.wsdl.wsdl.ITypes"
 * @generated
 */
public interface Types extends ExtensibleElement, javax.wsdl.Types {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" type="tesis.unrc.wsdl.wsdl.IList" many="false"
	 * @generated
	 */
	List getSchemas();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="tesis.unrc.wsdl.wsdl.IList" many="false"
	 * @generated
	 */
	List getSchemas(String namespaceURI);

} // Types
