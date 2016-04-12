/**
 */
package tesis.wsdl_ecore.wsdl.impl;

import javax.wsdl.extensions.ExtensibilityElement;
import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tesis.wsdl_ecore.wsdl.Message;
import tesis.wsdl_ecore.wsdl.Part;
import tesis.wsdl_ecore.wsdl.WsdlPackage;

import tesis.xsd_ecore.xsd.XSDElementDeclaration;
import tesis.xsd_ecore.xsd.XSDTypeDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tesis.wsdl_ecore.wsdl.impl.PartImpl#getName <em>Name</em>}</li>
 *   <li>{@link tesis.wsdl_ecore.wsdl.impl.PartImpl#getElementName <em>Element Name</em>}</li>
 *   <li>{@link tesis.wsdl_ecore.wsdl.impl.PartImpl#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link tesis.wsdl_ecore.wsdl.impl.PartImpl#getTypeDefinition <em>Type Definition</em>}</li>
 *   <li>{@link tesis.wsdl_ecore.wsdl.impl.PartImpl#getElementDeclaration <em>Element Declaration</em>}</li>
 *   <li>{@link tesis.wsdl_ecore.wsdl.impl.PartImpl#getEMessage <em>EMessage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartImpl extends ExtensibleElementImpl implements Part {
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
	 * The default value of the '{@link #getElementName() <em>Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementName()
	 * @generated
	 * @ordered
	 */
	protected static final QName ELEMENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElementName() <em>Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementName()
	 * @generated
	 * @ordered
	 */
	protected QName elementName = ELEMENT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final QName TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeName()
	 * @generated
	 * @ordered
	 */
	protected QName typeName = TYPE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTypeDefinition() <em>Type Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDefinition()
	 * @generated
	 * @ordered
	 */
	protected XSDTypeDefinition typeDefinition;

	/**
	 * The cached value of the '{@link #getElementDeclaration() <em>Element Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementDeclaration()
	 * @generated
	 * @ordered
	 */
	protected XSDElementDeclaration elementDeclaration;

	/**
	 * The cached value of the '{@link #getEMessage() <em>EMessage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEMessage()
	 * @generated
	 * @ordered
	 */
	protected Message eMessage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WsdlPackage.Literals.PART;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WsdlPackage.PART__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName getElementName() {
		return elementName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementName(QName newElementName) {
		QName oldElementName = elementName;
		elementName = newElementName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WsdlPackage.PART__ELEMENT_NAME, oldElementName, elementName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName getTypeName() {
		return typeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeName(QName newTypeName) {
		QName oldTypeName = typeName;
		typeName = newTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WsdlPackage.PART__TYPE_NAME, oldTypeName, typeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDTypeDefinition getTypeDefinition() {
		if (typeDefinition != null && typeDefinition.eIsProxy()) {
			InternalEObject oldTypeDefinition = (InternalEObject)typeDefinition;
			typeDefinition = (XSDTypeDefinition)eResolveProxy(oldTypeDefinition);
			if (typeDefinition != oldTypeDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WsdlPackage.PART__TYPE_DEFINITION, oldTypeDefinition, typeDefinition));
			}
		}
		return typeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDTypeDefinition basicGetTypeDefinition() {
		return typeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeDefinition(XSDTypeDefinition newTypeDefinition) {
		XSDTypeDefinition oldTypeDefinition = typeDefinition;
		typeDefinition = newTypeDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WsdlPackage.PART__TYPE_DEFINITION, oldTypeDefinition, typeDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDElementDeclaration getElementDeclaration() {
		if (elementDeclaration != null && elementDeclaration.eIsProxy()) {
			InternalEObject oldElementDeclaration = (InternalEObject)elementDeclaration;
			elementDeclaration = (XSDElementDeclaration)eResolveProxy(oldElementDeclaration);
			if (elementDeclaration != oldElementDeclaration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WsdlPackage.PART__ELEMENT_DECLARATION, oldElementDeclaration, elementDeclaration));
			}
		}
		return elementDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDElementDeclaration basicGetElementDeclaration() {
		return elementDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementDeclaration(XSDElementDeclaration newElementDeclaration) {
		XSDElementDeclaration oldElementDeclaration = elementDeclaration;
		elementDeclaration = newElementDeclaration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WsdlPackage.PART__ELEMENT_DECLARATION, oldElementDeclaration, elementDeclaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message getEMessage() {
		if (eMessage != null && eMessage.eIsProxy()) {
			InternalEObject oldEMessage = (InternalEObject)eMessage;
			eMessage = (Message)eResolveProxy(oldEMessage);
			if (eMessage != oldEMessage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WsdlPackage.PART__EMESSAGE, oldEMessage, eMessage));
			}
		}
		return eMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message basicGetEMessage() {
		return eMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEMessage(Message newEMessage) {
		Message oldEMessage = eMessage;
		eMessage = newEMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WsdlPackage.PART__EMESSAGE, oldEMessage, eMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WsdlPackage.PART__NAME:
				return getName();
			case WsdlPackage.PART__ELEMENT_NAME:
				return getElementName();
			case WsdlPackage.PART__TYPE_NAME:
				return getTypeName();
			case WsdlPackage.PART__TYPE_DEFINITION:
				if (resolve) return getTypeDefinition();
				return basicGetTypeDefinition();
			case WsdlPackage.PART__ELEMENT_DECLARATION:
				if (resolve) return getElementDeclaration();
				return basicGetElementDeclaration();
			case WsdlPackage.PART__EMESSAGE:
				if (resolve) return getEMessage();
				return basicGetEMessage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WsdlPackage.PART__NAME:
				setName((String)newValue);
				return;
			case WsdlPackage.PART__ELEMENT_NAME:
				setElementName((QName)newValue);
				return;
			case WsdlPackage.PART__TYPE_NAME:
				setTypeName((QName)newValue);
				return;
			case WsdlPackage.PART__TYPE_DEFINITION:
				setTypeDefinition((XSDTypeDefinition)newValue);
				return;
			case WsdlPackage.PART__ELEMENT_DECLARATION:
				setElementDeclaration((XSDElementDeclaration)newValue);
				return;
			case WsdlPackage.PART__EMESSAGE:
				setEMessage((Message)newValue);
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
			case WsdlPackage.PART__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WsdlPackage.PART__ELEMENT_NAME:
				setElementName(ELEMENT_NAME_EDEFAULT);
				return;
			case WsdlPackage.PART__TYPE_NAME:
				setTypeName(TYPE_NAME_EDEFAULT);
				return;
			case WsdlPackage.PART__TYPE_DEFINITION:
				setTypeDefinition((XSDTypeDefinition)null);
				return;
			case WsdlPackage.PART__ELEMENT_DECLARATION:
				setElementDeclaration((XSDElementDeclaration)null);
				return;
			case WsdlPackage.PART__EMESSAGE:
				setEMessage((Message)null);
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
			case WsdlPackage.PART__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WsdlPackage.PART__ELEMENT_NAME:
				return ELEMENT_NAME_EDEFAULT == null ? elementName != null : !ELEMENT_NAME_EDEFAULT.equals(elementName);
			case WsdlPackage.PART__TYPE_NAME:
				return TYPE_NAME_EDEFAULT == null ? typeName != null : !TYPE_NAME_EDEFAULT.equals(typeName);
			case WsdlPackage.PART__TYPE_DEFINITION:
				return typeDefinition != null;
			case WsdlPackage.PART__ELEMENT_DECLARATION:
				return elementDeclaration != null;
			case WsdlPackage.PART__EMESSAGE:
				return eMessage != null;
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
		result.append(", elementName: ");
		result.append(elementName);
		result.append(", typeName: ");
		result.append(typeName);
		result.append(')');
		return result.toString();
	}

	public ExtensibilityElement removeExtensibilityElement(ExtensibilityElement arg0) {
		// TODO Auto-generated method stub
		return null;
	}


} //PartImpl
