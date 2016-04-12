/**
 */
package tesis.wsdl_ecore.wsdl.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.wsdl.BindingFault;
import javax.wsdl.BindingInput;
import javax.wsdl.BindingOperation;
import javax.wsdl.BindingOutput;
import javax.wsdl.Fault;
import javax.wsdl.Input;
import javax.wsdl.Operation;
import javax.wsdl.Output;
import javax.wsdl.Part;
import javax.wsdl.Port;
import javax.wsdl.extensions.ExtensibilityElement;
import javax.wsdl.extensions.ExtensionRegistry;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3c.dom.Document;

import tesis.wsdl_ecore.wsdl.Binding;
import tesis.wsdl_ecore.wsdl.Definition;
import tesis.wsdl_ecore.wsdl.Import;
import tesis.wsdl_ecore.wsdl.Message;
import tesis.wsdl_ecore.wsdl.Namespace;
import tesis.wsdl_ecore.wsdl.PortType;
import tesis.wsdl_ecore.wsdl.Service;
import tesis.wsdl_ecore.wsdl.Types;
import tesis.wsdl_ecore.wsdl.WsdlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tesis.wsdl_ecore.wsdl.impl.DefinitionImpl#getTargetNamespace <em>Target Namespace</em>}</li>
 *   <li>{@link tesis.wsdl_ecore.wsdl.impl.DefinitionImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link tesis.wsdl_ecore.wsdl.impl.DefinitionImpl#getQName <em>QName</em>}</li>
 *   <li>{@link tesis.wsdl_ecore.wsdl.impl.DefinitionImpl#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link tesis.wsdl_ecore.wsdl.impl.DefinitionImpl#getEImports <em>EImports</em>}</li>
 *   <li>{@link tesis.wsdl_ecore.wsdl.impl.DefinitionImpl#getETypes <em>ETypes</em>}</li>
 *   <li>{@link tesis.wsdl_ecore.wsdl.impl.DefinitionImpl#getEMessages <em>EMessages</em>}</li>
 *   <li>{@link tesis.wsdl_ecore.wsdl.impl.DefinitionImpl#getEPortTypes <em>EPort Types</em>}</li>
 *   <li>{@link tesis.wsdl_ecore.wsdl.impl.DefinitionImpl#getEBindings <em>EBindings</em>}</li>
 *   <li>{@link tesis.wsdl_ecore.wsdl.impl.DefinitionImpl#getEServices <em>EServices</em>}</li>
 *   <li>{@link tesis.wsdl_ecore.wsdl.impl.DefinitionImpl#getENamespaces <em>ENamespaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefinitionImpl extends ExtensibleElementImpl implements Definition {
	/**
	 * The default value of the '{@link #getTargetNamespace() <em>Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetNamespace() <em>Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetNamespace()
	 * @generated
	 * @ordered
	 */
	protected String targetNamespace = TARGET_NAMESPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getQName() <em>QName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQName()
	 * @generated
	 * @ordered
	 */
	protected static final QName QNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQName() <em>QName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQName()
	 * @generated
	 * @ordered
	 */
	protected QName qName = QNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEncoding() <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncoding()
	 * @generated
	 * @ordered
	 */
	protected static final String ENCODING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEncoding() <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncoding()
	 * @generated
	 * @ordered
	 */
	protected String encoding = ENCODING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEImports() <em>EImports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEImports()
	 * @generated
	 * @ordered
	 */
	protected EList<Import> eImports;

	/**
	 * The cached value of the '{@link #getETypes() <em>ETypes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getETypes()
	 * @generated
	 * @ordered
	 */
	protected Types eTypes;

	/**
	 * The cached value of the '{@link #getEMessages() <em>EMessages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEMessages()
	 * @generated
	 * @ordered
	 */
	protected EList<Message> eMessages;

	/**
	 * The cached value of the '{@link #getEPortTypes() <em>EPort Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEPortTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<PortType> ePortTypes;

	/**
	 * The cached value of the '{@link #getEBindings() <em>EBindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<Binding> eBindings;

	/**
	 * The cached value of the '{@link #getEServices() <em>EServices</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> eServices;

	/**
	 * The cached value of the '{@link #getENamespaces() <em>ENamespaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getENamespaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Namespace> eNamespaces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WsdlPackage.Literals.DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetNamespace() {
		return targetNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetNamespace(String newTargetNamespace) {
		String oldTargetNamespace = targetNamespace;
		targetNamespace = newTargetNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WsdlPackage.DEFINITION__TARGET_NAMESPACE, oldTargetNamespace, targetNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WsdlPackage.DEFINITION__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName getQName() {
		return qName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQName(QName newQName) {
		QName oldQName = qName;
		qName = newQName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WsdlPackage.DEFINITION__QNAME, oldQName, qName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEncoding() {
		return encoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncoding(String newEncoding) {
		String oldEncoding = encoding;
		encoding = newEncoding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WsdlPackage.DEFINITION__ENCODING, oldEncoding, encoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Import> getEImports() {
		if (eImports == null) {
			eImports = new EObjectContainmentEList<Import>(Import.class, this, WsdlPackage.DEFINITION__EIMPORTS);
		}
		return eImports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Types getETypes() {
		return eTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetETypes(Types newETypes, NotificationChain msgs) {
		Types oldETypes = eTypes;
		eTypes = newETypes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WsdlPackage.DEFINITION__ETYPES, oldETypes, newETypes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setETypes(Types newETypes) {
		if (newETypes != eTypes) {
			NotificationChain msgs = null;
			if (eTypes != null)
				msgs = ((InternalEObject)eTypes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WsdlPackage.DEFINITION__ETYPES, null, msgs);
			if (newETypes != null)
				msgs = ((InternalEObject)newETypes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WsdlPackage.DEFINITION__ETYPES, null, msgs);
			msgs = basicSetETypes(newETypes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WsdlPackage.DEFINITION__ETYPES, newETypes, newETypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Message> getEMessages() {
		if (eMessages == null) {
			eMessages = new EObjectContainmentEList<Message>(Message.class, this, WsdlPackage.DEFINITION__EMESSAGES);
		}
		return eMessages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortType> getEPortTypes() {
		if (ePortTypes == null) {
			ePortTypes = new EObjectContainmentEList<PortType>(PortType.class, this, WsdlPackage.DEFINITION__EPORT_TYPES);
		}
		return ePortTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Binding> getEBindings() {
		if (eBindings == null) {
			eBindings = new EObjectContainmentEList<Binding>(Binding.class, this, WsdlPackage.DEFINITION__EBINDINGS);
		}
		return eBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getEServices() {
		if (eServices == null) {
			eServices = new EObjectContainmentEList<Service>(Service.class, this, WsdlPackage.DEFINITION__ESERVICES);
		}
		return eServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Namespace> getENamespaces() {
		if (eNamespaces == null) {
			eNamespaces = new EObjectContainmentEList<Namespace>(Namespace.class, this, WsdlPackage.DEFINITION__ENAMESPACES);
		}
		return eNamespaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Document getDocument() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocument(Document document) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addBinding(javax.wsdl.Binding binding) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addImport(javax.wsdl.Import importDef) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addMessage(javax.wsdl.Message message) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addNamespace(String prefix, String namespaceURI) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addPortType(javax.wsdl.PortType portType) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addService(javax.wsdl.Service service) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingFault createBindingFault() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingInput createBindingInput() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingOutput createBindingOutput() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingOperation createBindingOperation() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public javax.wsdl.Binding createBinding() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fault createFault() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public javax.wsdl.Import createImport() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input createInput() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public javax.wsdl.Message createMessage() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Output createOutput() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Part createPart() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port createPort() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public javax.wsdl.PortType createPortType() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public javax.wsdl.Service createService() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public javax.wsdl.Binding getBinding(QName name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map getBindings() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map getImports() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getImports(String namespaceURI) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public javax.wsdl.Message getMessage(QName name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map getMessages() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNamespace(String prefix) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map getNamespaces() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public javax.wsdl.PortType getPortType(QName name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map getPortTypes() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrefix(String namespaceURI) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public javax.wsdl.Service getService(QName name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map getServices() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionRegistry getExtensionRegistry() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtensionRegistry(ExtensionRegistry extensionRegistry) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocumentBaseURI() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentBaseURI(String documentBase) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public javax.wsdl.Types createTypes() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public javax.wsdl.Service removeService(QName name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public javax.wsdl.Binding removeBinding(QName name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public javax.wsdl.PortType removePortType(QName name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public javax.wsdl.Message removeMessage(QName name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public javax.wsdl.Types getTypes() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypes(javax.wsdl.Types types) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WsdlPackage.DEFINITION__EIMPORTS:
				return ((InternalEList<?>)getEImports()).basicRemove(otherEnd, msgs);
			case WsdlPackage.DEFINITION__ETYPES:
				return basicSetETypes(null, msgs);
			case WsdlPackage.DEFINITION__EMESSAGES:
				return ((InternalEList<?>)getEMessages()).basicRemove(otherEnd, msgs);
			case WsdlPackage.DEFINITION__EPORT_TYPES:
				return ((InternalEList<?>)getEPortTypes()).basicRemove(otherEnd, msgs);
			case WsdlPackage.DEFINITION__EBINDINGS:
				return ((InternalEList<?>)getEBindings()).basicRemove(otherEnd, msgs);
			case WsdlPackage.DEFINITION__ESERVICES:
				return ((InternalEList<?>)getEServices()).basicRemove(otherEnd, msgs);
			case WsdlPackage.DEFINITION__ENAMESPACES:
				return ((InternalEList<?>)getENamespaces()).basicRemove(otherEnd, msgs);
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
			case WsdlPackage.DEFINITION__TARGET_NAMESPACE:
				return getTargetNamespace();
			case WsdlPackage.DEFINITION__LOCATION:
				return getLocation();
			case WsdlPackage.DEFINITION__QNAME:
				return getQName();
			case WsdlPackage.DEFINITION__ENCODING:
				return getEncoding();
			case WsdlPackage.DEFINITION__EIMPORTS:
				return getEImports();
			case WsdlPackage.DEFINITION__ETYPES:
				return getETypes();
			case WsdlPackage.DEFINITION__EMESSAGES:
				return getEMessages();
			case WsdlPackage.DEFINITION__EPORT_TYPES:
				return getEPortTypes();
			case WsdlPackage.DEFINITION__EBINDINGS:
				return getEBindings();
			case WsdlPackage.DEFINITION__ESERVICES:
				return getEServices();
			case WsdlPackage.DEFINITION__ENAMESPACES:
				return getENamespaces();
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
			case WsdlPackage.DEFINITION__TARGET_NAMESPACE:
				setTargetNamespace((String)newValue);
				return;
			case WsdlPackage.DEFINITION__LOCATION:
				setLocation((String)newValue);
				return;
			case WsdlPackage.DEFINITION__QNAME:
				setQName((QName)newValue);
				return;
			case WsdlPackage.DEFINITION__ENCODING:
				setEncoding((String)newValue);
				return;
			case WsdlPackage.DEFINITION__EIMPORTS:
				getEImports().clear();
				getEImports().addAll((Collection<? extends Import>)newValue);
				return;
			case WsdlPackage.DEFINITION__ETYPES:
				setETypes((Types)newValue);
				return;
			case WsdlPackage.DEFINITION__EMESSAGES:
				getEMessages().clear();
				getEMessages().addAll((Collection<? extends Message>)newValue);
				return;
			case WsdlPackage.DEFINITION__EPORT_TYPES:
				getEPortTypes().clear();
				getEPortTypes().addAll((Collection<? extends PortType>)newValue);
				return;
			case WsdlPackage.DEFINITION__EBINDINGS:
				getEBindings().clear();
				getEBindings().addAll((Collection<? extends Binding>)newValue);
				return;
			case WsdlPackage.DEFINITION__ESERVICES:
				getEServices().clear();
				getEServices().addAll((Collection<? extends Service>)newValue);
				return;
			case WsdlPackage.DEFINITION__ENAMESPACES:
				getENamespaces().clear();
				getENamespaces().addAll((Collection<? extends Namespace>)newValue);
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
			case WsdlPackage.DEFINITION__TARGET_NAMESPACE:
				setTargetNamespace(TARGET_NAMESPACE_EDEFAULT);
				return;
			case WsdlPackage.DEFINITION__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case WsdlPackage.DEFINITION__QNAME:
				setQName(QNAME_EDEFAULT);
				return;
			case WsdlPackage.DEFINITION__ENCODING:
				setEncoding(ENCODING_EDEFAULT);
				return;
			case WsdlPackage.DEFINITION__EIMPORTS:
				getEImports().clear();
				return;
			case WsdlPackage.DEFINITION__ETYPES:
				setETypes((Types)null);
				return;
			case WsdlPackage.DEFINITION__EMESSAGES:
				getEMessages().clear();
				return;
			case WsdlPackage.DEFINITION__EPORT_TYPES:
				getEPortTypes().clear();
				return;
			case WsdlPackage.DEFINITION__EBINDINGS:
				getEBindings().clear();
				return;
			case WsdlPackage.DEFINITION__ESERVICES:
				getEServices().clear();
				return;
			case WsdlPackage.DEFINITION__ENAMESPACES:
				getENamespaces().clear();
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
			case WsdlPackage.DEFINITION__TARGET_NAMESPACE:
				return TARGET_NAMESPACE_EDEFAULT == null ? targetNamespace != null : !TARGET_NAMESPACE_EDEFAULT.equals(targetNamespace);
			case WsdlPackage.DEFINITION__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case WsdlPackage.DEFINITION__QNAME:
				return QNAME_EDEFAULT == null ? qName != null : !QNAME_EDEFAULT.equals(qName);
			case WsdlPackage.DEFINITION__ENCODING:
				return ENCODING_EDEFAULT == null ? encoding != null : !ENCODING_EDEFAULT.equals(encoding);
			case WsdlPackage.DEFINITION__EIMPORTS:
				return eImports != null && !eImports.isEmpty();
			case WsdlPackage.DEFINITION__ETYPES:
				return eTypes != null;
			case WsdlPackage.DEFINITION__EMESSAGES:
				return eMessages != null && !eMessages.isEmpty();
			case WsdlPackage.DEFINITION__EPORT_TYPES:
				return ePortTypes != null && !ePortTypes.isEmpty();
			case WsdlPackage.DEFINITION__EBINDINGS:
				return eBindings != null && !eBindings.isEmpty();
			case WsdlPackage.DEFINITION__ESERVICES:
				return eServices != null && !eServices.isEmpty();
			case WsdlPackage.DEFINITION__ENAMESPACES:
				return eNamespaces != null && !eNamespaces.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == javax.wsdl.Definition.class) {
			switch (baseOperationID) {
				case WsdlPackage.IDEFINITION___ADD_BINDING__BINDING: return WsdlPackage.DEFINITION___ADD_BINDING__BINDING;
				case WsdlPackage.IDEFINITION___ADD_IMPORT__IMPORT: return WsdlPackage.DEFINITION___ADD_IMPORT__IMPORT;
				case WsdlPackage.IDEFINITION___ADD_MESSAGE__MESSAGE: return WsdlPackage.DEFINITION___ADD_MESSAGE__MESSAGE;
				case WsdlPackage.IDEFINITION___ADD_NAMESPACE__STRING_STRING: return WsdlPackage.DEFINITION___ADD_NAMESPACE__STRING_STRING;
				case WsdlPackage.IDEFINITION___ADD_PORT_TYPE__PORTTYPE: return WsdlPackage.DEFINITION___ADD_PORT_TYPE__PORTTYPE;
				case WsdlPackage.IDEFINITION___ADD_SERVICE__SERVICE: return WsdlPackage.DEFINITION___ADD_SERVICE__SERVICE;
				case WsdlPackage.IDEFINITION___CREATE_BINDING_FAULT: return WsdlPackage.DEFINITION___CREATE_BINDING_FAULT;
				case WsdlPackage.IDEFINITION___CREATE_BINDING_INPUT: return WsdlPackage.DEFINITION___CREATE_BINDING_INPUT;
				case WsdlPackage.IDEFINITION___CREATE_BINDING_OUTPUT: return WsdlPackage.DEFINITION___CREATE_BINDING_OUTPUT;
				case WsdlPackage.IDEFINITION___CREATE_BINDING_OPERATION: return WsdlPackage.DEFINITION___CREATE_BINDING_OPERATION;
				case WsdlPackage.IDEFINITION___CREATE_BINDING: return WsdlPackage.DEFINITION___CREATE_BINDING;
				case WsdlPackage.IDEFINITION___CREATE_FAULT: return WsdlPackage.DEFINITION___CREATE_FAULT;
				case WsdlPackage.IDEFINITION___CREATE_IMPORT: return WsdlPackage.DEFINITION___CREATE_IMPORT;
				case WsdlPackage.IDEFINITION___CREATE_INPUT: return WsdlPackage.DEFINITION___CREATE_INPUT;
				case WsdlPackage.IDEFINITION___CREATE_MESSAGE: return WsdlPackage.DEFINITION___CREATE_MESSAGE;
				case WsdlPackage.IDEFINITION___CREATE_OPERATION: return WsdlPackage.DEFINITION___CREATE_OPERATION;
				case WsdlPackage.IDEFINITION___CREATE_OUTPUT: return WsdlPackage.DEFINITION___CREATE_OUTPUT;
				case WsdlPackage.IDEFINITION___CREATE_PART: return WsdlPackage.DEFINITION___CREATE_PART;
				case WsdlPackage.IDEFINITION___CREATE_PORT: return WsdlPackage.DEFINITION___CREATE_PORT;
				case WsdlPackage.IDEFINITION___CREATE_PORT_TYPE: return WsdlPackage.DEFINITION___CREATE_PORT_TYPE;
				case WsdlPackage.IDEFINITION___CREATE_SERVICE: return WsdlPackage.DEFINITION___CREATE_SERVICE;
				case WsdlPackage.IDEFINITION___GET_BINDING__QNAME: return WsdlPackage.DEFINITION___GET_BINDING__QNAME;
				case WsdlPackage.IDEFINITION___GET_BINDINGS: return WsdlPackage.DEFINITION___GET_BINDINGS;
				case WsdlPackage.IDEFINITION___GET_IMPORTS: return WsdlPackage.DEFINITION___GET_IMPORTS;
				case WsdlPackage.IDEFINITION___GET_IMPORTS__STRING: return WsdlPackage.DEFINITION___GET_IMPORTS__STRING;
				case WsdlPackage.IDEFINITION___GET_MESSAGE__QNAME: return WsdlPackage.DEFINITION___GET_MESSAGE__QNAME;
				case WsdlPackage.IDEFINITION___GET_MESSAGES: return WsdlPackage.DEFINITION___GET_MESSAGES;
				case WsdlPackage.IDEFINITION___GET_NAMESPACE__STRING: return WsdlPackage.DEFINITION___GET_NAMESPACE__STRING;
				case WsdlPackage.IDEFINITION___GET_NAMESPACES: return WsdlPackage.DEFINITION___GET_NAMESPACES;
				case WsdlPackage.IDEFINITION___GET_PORT_TYPE__QNAME: return WsdlPackage.DEFINITION___GET_PORT_TYPE__QNAME;
				case WsdlPackage.IDEFINITION___GET_PORT_TYPES: return WsdlPackage.DEFINITION___GET_PORT_TYPES;
				case WsdlPackage.IDEFINITION___GET_PREFIX__STRING: return WsdlPackage.DEFINITION___GET_PREFIX__STRING;
				case WsdlPackage.IDEFINITION___GET_SERVICE__QNAME: return WsdlPackage.DEFINITION___GET_SERVICE__QNAME;
				case WsdlPackage.IDEFINITION___GET_SERVICES: return WsdlPackage.DEFINITION___GET_SERVICES;
				case WsdlPackage.IDEFINITION___GET_EXTENSION_REGISTRY: return WsdlPackage.DEFINITION___GET_EXTENSION_REGISTRY;
				case WsdlPackage.IDEFINITION___SET_EXTENSION_REGISTRY__EXTENSIONREGISTRY: return WsdlPackage.DEFINITION___SET_EXTENSION_REGISTRY__EXTENSIONREGISTRY;
				case WsdlPackage.IDEFINITION___GET_DOCUMENT_BASE_URI: return WsdlPackage.DEFINITION___GET_DOCUMENT_BASE_URI;
				case WsdlPackage.IDEFINITION___SET_DOCUMENT_BASE_URI__STRING: return WsdlPackage.DEFINITION___SET_DOCUMENT_BASE_URI__STRING;
				case WsdlPackage.IDEFINITION___CREATE_TYPES: return WsdlPackage.DEFINITION___CREATE_TYPES;
				case WsdlPackage.IDEFINITION___REMOVE_SERVICE__QNAME: return WsdlPackage.DEFINITION___REMOVE_SERVICE__QNAME;
				case WsdlPackage.IDEFINITION___REMOVE_BINDING__QNAME: return WsdlPackage.DEFINITION___REMOVE_BINDING__QNAME;
				case WsdlPackage.IDEFINITION___REMOVE_PORT_TYPE__QNAME: return WsdlPackage.DEFINITION___REMOVE_PORT_TYPE__QNAME;
				case WsdlPackage.IDEFINITION___REMOVE_MESSAGE__QNAME: return WsdlPackage.DEFINITION___REMOVE_MESSAGE__QNAME;
				case WsdlPackage.IDEFINITION___GET_TYPES: return WsdlPackage.DEFINITION___GET_TYPES;
				case WsdlPackage.IDEFINITION___SET_TYPES__TYPES: return WsdlPackage.DEFINITION___SET_TYPES__TYPES;
				case WsdlPackage.IDEFINITION___TO_STRING: return WsdlPackage.DEFINITION___TO_STRING;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case WsdlPackage.DEFINITION___GET_DOCUMENT:
				return getDocument();
			case WsdlPackage.DEFINITION___SET_DOCUMENT__DOCUMENT:
				setDocument((Document)arguments.get(0));
				return null;
			case WsdlPackage.DEFINITION___ADD_BINDING__BINDING:
				addBinding((javax.wsdl.Binding)arguments.get(0));
				return null;
			case WsdlPackage.DEFINITION___ADD_IMPORT__IMPORT:
				addImport((javax.wsdl.Import)arguments.get(0));
				return null;
			case WsdlPackage.DEFINITION___ADD_MESSAGE__MESSAGE:
				addMessage((javax.wsdl.Message)arguments.get(0));
				return null;
			case WsdlPackage.DEFINITION___ADD_NAMESPACE__STRING_STRING:
				addNamespace((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case WsdlPackage.DEFINITION___ADD_PORT_TYPE__PORTTYPE:
				addPortType((javax.wsdl.PortType)arguments.get(0));
				return null;
			case WsdlPackage.DEFINITION___ADD_SERVICE__SERVICE:
				addService((javax.wsdl.Service)arguments.get(0));
				return null;
			case WsdlPackage.DEFINITION___CREATE_BINDING_FAULT:
				return createBindingFault();
			case WsdlPackage.DEFINITION___CREATE_BINDING_INPUT:
				return createBindingInput();
			case WsdlPackage.DEFINITION___CREATE_BINDING_OUTPUT:
				return createBindingOutput();
			case WsdlPackage.DEFINITION___CREATE_BINDING_OPERATION:
				return createBindingOperation();
			case WsdlPackage.DEFINITION___CREATE_BINDING:
				return createBinding();
			case WsdlPackage.DEFINITION___CREATE_FAULT:
				return createFault();
			case WsdlPackage.DEFINITION___CREATE_IMPORT:
				return createImport();
			case WsdlPackage.DEFINITION___CREATE_INPUT:
				return createInput();
			case WsdlPackage.DEFINITION___CREATE_MESSAGE:
				return createMessage();
			case WsdlPackage.DEFINITION___CREATE_OPERATION:
				return createOperation();
			case WsdlPackage.DEFINITION___CREATE_OUTPUT:
				return createOutput();
			case WsdlPackage.DEFINITION___CREATE_PART:
				return createPart();
			case WsdlPackage.DEFINITION___CREATE_PORT:
				return createPort();
			case WsdlPackage.DEFINITION___CREATE_PORT_TYPE:
				return createPortType();
			case WsdlPackage.DEFINITION___CREATE_SERVICE:
				return createService();
			case WsdlPackage.DEFINITION___GET_BINDING__QNAME:
				return getBinding((QName)arguments.get(0));
			case WsdlPackage.DEFINITION___GET_BINDINGS:
				return getBindings();
			case WsdlPackage.DEFINITION___GET_IMPORTS:
				return getImports();
			case WsdlPackage.DEFINITION___GET_IMPORTS__STRING:
				return getImports((String)arguments.get(0));
			case WsdlPackage.DEFINITION___GET_MESSAGE__QNAME:
				return getMessage((QName)arguments.get(0));
			case WsdlPackage.DEFINITION___GET_MESSAGES:
				return getMessages();
			case WsdlPackage.DEFINITION___GET_NAMESPACE__STRING:
				return getNamespace((String)arguments.get(0));
			case WsdlPackage.DEFINITION___GET_NAMESPACES:
				return getNamespaces();
			case WsdlPackage.DEFINITION___GET_PORT_TYPE__QNAME:
				return getPortType((QName)arguments.get(0));
			case WsdlPackage.DEFINITION___GET_PORT_TYPES:
				return getPortTypes();
			case WsdlPackage.DEFINITION___GET_PREFIX__STRING:
				return getPrefix((String)arguments.get(0));
			case WsdlPackage.DEFINITION___GET_SERVICE__QNAME:
				return getService((QName)arguments.get(0));
			case WsdlPackage.DEFINITION___GET_SERVICES:
				return getServices();
			case WsdlPackage.DEFINITION___GET_EXTENSION_REGISTRY:
				return getExtensionRegistry();
			case WsdlPackage.DEFINITION___SET_EXTENSION_REGISTRY__EXTENSIONREGISTRY:
				setExtensionRegistry((ExtensionRegistry)arguments.get(0));
				return null;
			case WsdlPackage.DEFINITION___GET_DOCUMENT_BASE_URI:
				return getDocumentBaseURI();
			case WsdlPackage.DEFINITION___SET_DOCUMENT_BASE_URI__STRING:
				setDocumentBaseURI((String)arguments.get(0));
				return null;
			case WsdlPackage.DEFINITION___CREATE_TYPES:
				return createTypes();
			case WsdlPackage.DEFINITION___REMOVE_SERVICE__QNAME:
				return removeService((QName)arguments.get(0));
			case WsdlPackage.DEFINITION___REMOVE_BINDING__QNAME:
				return removeBinding((QName)arguments.get(0));
			case WsdlPackage.DEFINITION___REMOVE_PORT_TYPE__QNAME:
				return removePortType((QName)arguments.get(0));
			case WsdlPackage.DEFINITION___REMOVE_MESSAGE__QNAME:
				return removeMessage((QName)arguments.get(0));
			case WsdlPackage.DEFINITION___GET_TYPES:
				return getTypes();
			case WsdlPackage.DEFINITION___SET_TYPES__TYPES:
				setTypes((javax.wsdl.Types)arguments.get(0));
				return null;
			case WsdlPackage.DEFINITION___TO_STRING:
				return toString();
		}
		return super.eInvoke(operationID, arguments);
	}

	public ExtensibilityElement removeExtensibilityElement(ExtensibilityElement arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public Map getAllBindings() {
		// TODO Auto-generated method stub
		return null;
	}

	public Map getAllPortTypes() {
		// TODO Auto-generated method stub
		return null;
	}

	public Map getAllServices() {
		// TODO Auto-generated method stub
		return null;
	}

	public javax.wsdl.Import removeImport(javax.wsdl.Import arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public String removeNamespace(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}


} //DefinitionImpl
