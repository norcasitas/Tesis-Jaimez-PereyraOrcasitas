/**
 */
package tesis.unrc.wsdl.wsdl.internal.impl;

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

import tesis.unrc.wsdl.wsdl.Binding;
import tesis.unrc.wsdl.wsdl.Definition;
import tesis.unrc.wsdl.wsdl.Import;
import tesis.unrc.wsdl.wsdl.Message;
import tesis.unrc.wsdl.wsdl.Namespace;
import tesis.unrc.wsdl.wsdl.PortType;
import tesis.unrc.wsdl.wsdl.Service;
import tesis.unrc.wsdl.wsdl.Types;
import tesis.unrc.wsdl.wsdl.WSDLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tesis.unrc.wsdl.wsdl.internal.impl.DefinitionImpl#getTargetNamespace <em>Target Namespace</em>}</li>
 *   <li>{@link tesis.unrc.wsdl.wsdl.internal.impl.DefinitionImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link tesis.unrc.wsdl.wsdl.internal.impl.DefinitionImpl#getQName <em>QName</em>}</li>
 *   <li>{@link tesis.unrc.wsdl.wsdl.internal.impl.DefinitionImpl#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link tesis.unrc.wsdl.wsdl.internal.impl.DefinitionImpl#getEImports <em>EImports</em>}</li>
 *   <li>{@link tesis.unrc.wsdl.wsdl.internal.impl.DefinitionImpl#getETypes <em>ETypes</em>}</li>
 *   <li>{@link tesis.unrc.wsdl.wsdl.internal.impl.DefinitionImpl#getEMessages <em>EMessages</em>}</li>
 *   <li>{@link tesis.unrc.wsdl.wsdl.internal.impl.DefinitionImpl#getEPortTypes <em>EPort Types</em>}</li>
 *   <li>{@link tesis.unrc.wsdl.wsdl.internal.impl.DefinitionImpl#getEBindings <em>EBindings</em>}</li>
 *   <li>{@link tesis.unrc.wsdl.wsdl.internal.impl.DefinitionImpl#getEServices <em>EServices</em>}</li>
 *   <li>{@link tesis.unrc.wsdl.wsdl.internal.impl.DefinitionImpl#getENamespaces <em>ENamespaces</em>}</li>
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
	protected EList eImports;

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
	protected EList eMessages;

	/**
	 * The cached value of the '{@link #getEPortTypes() <em>EPort Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEPortTypes()
	 * @generated
	 * @ordered
	 */
	protected EList ePortTypes;

	/**
	 * The cached value of the '{@link #getEBindings() <em>EBindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEBindings()
	 * @generated
	 * @ordered
	 */
	protected EList eBindings;

	/**
	 * The cached value of the '{@link #getEServices() <em>EServices</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEServices()
	 * @generated
	 * @ordered
	 */
	protected EList eServices;

	/**
	 * The cached value of the '{@link #getENamespaces() <em>ENamespaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getENamespaces()
	 * @generated
	 * @ordered
	 */
	protected EList eNamespaces;

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
	protected EClass eStaticClass() {
		return WSDLPackage.Literals.DEFINITION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WSDLPackage.DEFINITION__TARGET_NAMESPACE,
					oldTargetNamespace, targetNamespace));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WSDLPackage.DEFINITION__LOCATION, oldLocation,
					location));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WSDLPackage.DEFINITION__QNAME, oldQName, qName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WSDLPackage.DEFINITION__ENCODING, oldEncoding,
					encoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEImports() {
		if (eImports == null) {
			eImports = new EObjectContainmentEList(Import.class, this, WSDLPackage.DEFINITION__EIMPORTS);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					WSDLPackage.DEFINITION__ETYPES, oldETypes, newETypes);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
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
				msgs = ((InternalEObject) eTypes).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - WSDLPackage.DEFINITION__ETYPES, null, msgs);
			if (newETypes != null)
				msgs = ((InternalEObject) newETypes).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - WSDLPackage.DEFINITION__ETYPES, null, msgs);
			msgs = basicSetETypes(newETypes, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDLPackage.DEFINITION__ETYPES, newETypes,
					newETypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEMessages() {
		if (eMessages == null) {
			eMessages = new EObjectContainmentEList(Message.class, this, WSDLPackage.DEFINITION__EMESSAGES);
		}
		return eMessages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEPortTypes() {
		if (ePortTypes == null) {
			ePortTypes = new EObjectContainmentEList(PortType.class, this, WSDLPackage.DEFINITION__EPORT_TYPES);
		}
		return ePortTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEBindings() {
		if (eBindings == null) {
			eBindings = new EObjectContainmentEList(Binding.class, this, WSDLPackage.DEFINITION__EBINDINGS);
		}
		return eBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEServices() {
		if (eServices == null) {
			eServices = new EObjectContainmentEList(Service.class, this, WSDLPackage.DEFINITION__ESERVICES);
		}
		return eServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getENamespaces() {
		if (eNamespaces == null) {
			eNamespaces = new EObjectContainmentEList(Namespace.class, this, WSDLPackage.DEFINITION__ENAMESPACES);
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WSDLPackage.DEFINITION__EIMPORTS:
			return ((InternalEList) getEImports()).basicRemove(otherEnd, msgs);
		case WSDLPackage.DEFINITION__ETYPES:
			return basicSetETypes(null, msgs);
		case WSDLPackage.DEFINITION__EMESSAGES:
			return ((InternalEList) getEMessages()).basicRemove(otherEnd, msgs);
		case WSDLPackage.DEFINITION__EPORT_TYPES:
			return ((InternalEList) getEPortTypes()).basicRemove(otherEnd, msgs);
		case WSDLPackage.DEFINITION__EBINDINGS:
			return ((InternalEList) getEBindings()).basicRemove(otherEnd, msgs);
		case WSDLPackage.DEFINITION__ESERVICES:
			return ((InternalEList) getEServices()).basicRemove(otherEnd, msgs);
		case WSDLPackage.DEFINITION__ENAMESPACES:
			return ((InternalEList) getENamespaces()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WSDLPackage.DEFINITION__TARGET_NAMESPACE:
			return getTargetNamespace();
		case WSDLPackage.DEFINITION__LOCATION:
			return getLocation();
		case WSDLPackage.DEFINITION__QNAME:
			return getQName();
		case WSDLPackage.DEFINITION__ENCODING:
			return getEncoding();
		case WSDLPackage.DEFINITION__EIMPORTS:
			return getEImports();
		case WSDLPackage.DEFINITION__ETYPES:
			return getETypes();
		case WSDLPackage.DEFINITION__EMESSAGES:
			return getEMessages();
		case WSDLPackage.DEFINITION__EPORT_TYPES:
			return getEPortTypes();
		case WSDLPackage.DEFINITION__EBINDINGS:
			return getEBindings();
		case WSDLPackage.DEFINITION__ESERVICES:
			return getEServices();
		case WSDLPackage.DEFINITION__ENAMESPACES:
			return getENamespaces();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case WSDLPackage.DEFINITION__TARGET_NAMESPACE:
			setTargetNamespace((String) newValue);
			return;
		case WSDLPackage.DEFINITION__LOCATION:
			setLocation((String) newValue);
			return;
		case WSDLPackage.DEFINITION__QNAME:
			setQName((QName) newValue);
			return;
		case WSDLPackage.DEFINITION__ENCODING:
			setEncoding((String) newValue);
			return;
		case WSDLPackage.DEFINITION__EIMPORTS:
			getEImports().clear();
			getEImports().addAll((Collection) newValue);
			return;
		case WSDLPackage.DEFINITION__ETYPES:
			setETypes((Types) newValue);
			return;
		case WSDLPackage.DEFINITION__EMESSAGES:
			getEMessages().clear();
			getEMessages().addAll((Collection) newValue);
			return;
		case WSDLPackage.DEFINITION__EPORT_TYPES:
			getEPortTypes().clear();
			getEPortTypes().addAll((Collection) newValue);
			return;
		case WSDLPackage.DEFINITION__EBINDINGS:
			getEBindings().clear();
			getEBindings().addAll((Collection) newValue);
			return;
		case WSDLPackage.DEFINITION__ESERVICES:
			getEServices().clear();
			getEServices().addAll((Collection) newValue);
			return;
		case WSDLPackage.DEFINITION__ENAMESPACES:
			getENamespaces().clear();
			getENamespaces().addAll((Collection) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
		case WSDLPackage.DEFINITION__TARGET_NAMESPACE:
			setTargetNamespace(TARGET_NAMESPACE_EDEFAULT);
			return;
		case WSDLPackage.DEFINITION__LOCATION:
			setLocation(LOCATION_EDEFAULT);
			return;
		case WSDLPackage.DEFINITION__QNAME:
			setQName(QNAME_EDEFAULT);
			return;
		case WSDLPackage.DEFINITION__ENCODING:
			setEncoding(ENCODING_EDEFAULT);
			return;
		case WSDLPackage.DEFINITION__EIMPORTS:
			getEImports().clear();
			return;
		case WSDLPackage.DEFINITION__ETYPES:
			setETypes((Types) null);
			return;
		case WSDLPackage.DEFINITION__EMESSAGES:
			getEMessages().clear();
			return;
		case WSDLPackage.DEFINITION__EPORT_TYPES:
			getEPortTypes().clear();
			return;
		case WSDLPackage.DEFINITION__EBINDINGS:
			getEBindings().clear();
			return;
		case WSDLPackage.DEFINITION__ESERVICES:
			getEServices().clear();
			return;
		case WSDLPackage.DEFINITION__ENAMESPACES:
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case WSDLPackage.DEFINITION__TARGET_NAMESPACE:
			return TARGET_NAMESPACE_EDEFAULT == null ? targetNamespace != null
					: !TARGET_NAMESPACE_EDEFAULT.equals(targetNamespace);
		case WSDLPackage.DEFINITION__LOCATION:
			return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
		case WSDLPackage.DEFINITION__QNAME:
			return QNAME_EDEFAULT == null ? qName != null : !QNAME_EDEFAULT.equals(qName);
		case WSDLPackage.DEFINITION__ENCODING:
			return ENCODING_EDEFAULT == null ? encoding != null : !ENCODING_EDEFAULT.equals(encoding);
		case WSDLPackage.DEFINITION__EIMPORTS:
			return eImports != null && !eImports.isEmpty();
		case WSDLPackage.DEFINITION__ETYPES:
			return eTypes != null;
		case WSDLPackage.DEFINITION__EMESSAGES:
			return eMessages != null && !eMessages.isEmpty();
		case WSDLPackage.DEFINITION__EPORT_TYPES:
			return ePortTypes != null && !ePortTypes.isEmpty();
		case WSDLPackage.DEFINITION__EBINDINGS:
			return eBindings != null && !eBindings.isEmpty();
		case WSDLPackage.DEFINITION__ESERVICES:
			return eServices != null && !eServices.isEmpty();
		case WSDLPackage.DEFINITION__ENAMESPACES:
			return eNamespaces != null && !eNamespaces.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (targetNamespace: "); //$NON-NLS-1$
		result.append(targetNamespace);
		result.append(", location: "); //$NON-NLS-1$
		result.append(location);
		result.append(", qName: "); //$NON-NLS-1$
		result.append(qName);
		result.append(", encoding: "); //$NON-NLS-1$
		result.append(encoding);
		result.append(')');
		return result.toString();
	}

	@Override
	public ExtensibilityElement removeExtensibilityElement(ExtensibilityElement arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map getAllBindings() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map getAllPortTypes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map getAllServices() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public javax.wsdl.Import removeImport(javax.wsdl.Import arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String removeNamespace(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

} //DefinitionImpl
