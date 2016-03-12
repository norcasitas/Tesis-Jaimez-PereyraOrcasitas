/**
 */
package tesis.xsd_ecore.xsd.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectEList;

import org.w3c.dom.Node;

import tesis.xsd_ecore.xsd.XSDConcreteComponent;
import tesis.xsd_ecore.xsd.XSDDiagnostic;
import tesis.xsd_ecore.xsd.XSDDiagnosticSeverity;
import tesis.xsd_ecore.xsd.XsdPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XSD Diagnostic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDDiagnosticImpl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDDiagnosticImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDDiagnosticImpl#getLocationURI <em>Location URI</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDDiagnosticImpl#getLine <em>Line</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDDiagnosticImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDDiagnosticImpl#getNode <em>Node</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDDiagnosticImpl#getAnnotationURI <em>Annotation URI</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDDiagnosticImpl#getKey <em>Key</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDDiagnosticImpl#getSubstitutions <em>Substitutions</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDDiagnosticImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link tesis.xsd_ecore.xsd.impl.XSDDiagnosticImpl#getPrimaryComponent <em>Primary Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XSDDiagnosticImpl extends XSDConcreteComponentImpl implements XSDDiagnostic {
	/**
	 * The default value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected static final XSDDiagnosticSeverity SEVERITY_EDEFAULT = XSDDiagnosticSeverity.FATAL;

	/**
	 * The cached value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected XSDDiagnosticSeverity severity = SEVERITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected String message = MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocationURI() <em>Location URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationURI()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocationURI() <em>Location URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationURI()
	 * @generated
	 * @ordered
	 */
	protected String locationURI = LOCATION_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getLine() <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected static final int LINE_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getLine() <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected int line = LINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumn() <em>Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected static final int COLUMN_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getColumn() <em>Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected int column = COLUMN_EDEFAULT;

	/**
	 * The default value of the '{@link #getNode() <em>Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected static final Node NODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNode() <em>Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected Node node = NODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAnnotationURI() <em>Annotation URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotationURI()
	 * @generated
	 * @ordered
	 */
	protected static final String ANNOTATION_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnnotationURI() <em>Annotation URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotationURI()
	 * @generated
	 * @ordered
	 */
	protected String annotationURI = ANNOTATION_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected String key = KEY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubstitutions() <em>Substitutions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstitutions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> substitutions;

	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<XSDConcreteComponent> components;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XSDDiagnosticImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XsdPackage.Literals.XSD_DIAGNOSTIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDDiagnosticSeverity getSeverity() {
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeverity(XSDDiagnosticSeverity newSeverity) {
		XSDDiagnosticSeverity oldSeverity = severity;
		severity = newSeverity == null ? SEVERITY_EDEFAULT : newSeverity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_DIAGNOSTIC__SEVERITY, oldSeverity, severity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessage(String newMessage) {
		String oldMessage = message;
		message = newMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_DIAGNOSTIC__MESSAGE, oldMessage, message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocationURI() {
		return locationURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocationURI(String newLocationURI) {
		String oldLocationURI = locationURI;
		locationURI = newLocationURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_DIAGNOSTIC__LOCATION_URI, oldLocationURI, locationURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLine() {
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLine(int newLine) {
		int oldLine = line;
		line = newLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_DIAGNOSTIC__LINE, oldLine, line));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getColumn() {
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumn(int newColumn) {
		int oldColumn = column;
		column = newColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_DIAGNOSTIC__COLUMN, oldColumn, column));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getNode() {
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNode(Node newNode) {
		Node oldNode = node;
		node = newNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_DIAGNOSTIC__NODE, oldNode, node));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAnnotationURI() {
		return annotationURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotationURI(String newAnnotationURI) {
		String oldAnnotationURI = annotationURI;
		annotationURI = newAnnotationURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_DIAGNOSTIC__ANNOTATION_URI, oldAnnotationURI, annotationURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(String newKey) {
		String oldKey = key;
		key = newKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XsdPackage.XSD_DIAGNOSTIC__KEY, oldKey, key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSubstitutions() {
		if (substitutions == null) {
			substitutions = new EDataTypeUniqueEList<String>(String.class, this, XsdPackage.XSD_DIAGNOSTIC__SUBSTITUTIONS);
		}
		return substitutions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XSDConcreteComponent> getComponents() {
		if (components == null) {
			components = new EObjectEList<XSDConcreteComponent>(XSDConcreteComponent.class, this, XsdPackage.XSD_DIAGNOSTIC__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDConcreteComponent getPrimaryComponent() {
		// TODO: implement this method to return the 'Primary Component' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimaryComponent(XSDConcreteComponent newPrimaryComponent) {
		// TODO: implement this method to set the 'Primary Component' reference
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
			case XsdPackage.XSD_DIAGNOSTIC__SEVERITY:
				return getSeverity();
			case XsdPackage.XSD_DIAGNOSTIC__MESSAGE:
				return getMessage();
			case XsdPackage.XSD_DIAGNOSTIC__LOCATION_URI:
				return getLocationURI();
			case XsdPackage.XSD_DIAGNOSTIC__LINE:
				return getLine();
			case XsdPackage.XSD_DIAGNOSTIC__COLUMN:
				return getColumn();
			case XsdPackage.XSD_DIAGNOSTIC__NODE:
				return getNode();
			case XsdPackage.XSD_DIAGNOSTIC__ANNOTATION_URI:
				return getAnnotationURI();
			case XsdPackage.XSD_DIAGNOSTIC__KEY:
				return getKey();
			case XsdPackage.XSD_DIAGNOSTIC__SUBSTITUTIONS:
				return getSubstitutions();
			case XsdPackage.XSD_DIAGNOSTIC__COMPONENTS:
				return getComponents();
			case XsdPackage.XSD_DIAGNOSTIC__PRIMARY_COMPONENT:
				return getPrimaryComponent();
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
			case XsdPackage.XSD_DIAGNOSTIC__SEVERITY:
				setSeverity((XSDDiagnosticSeverity)newValue);
				return;
			case XsdPackage.XSD_DIAGNOSTIC__MESSAGE:
				setMessage((String)newValue);
				return;
			case XsdPackage.XSD_DIAGNOSTIC__LOCATION_URI:
				setLocationURI((String)newValue);
				return;
			case XsdPackage.XSD_DIAGNOSTIC__LINE:
				setLine((Integer)newValue);
				return;
			case XsdPackage.XSD_DIAGNOSTIC__COLUMN:
				setColumn((Integer)newValue);
				return;
			case XsdPackage.XSD_DIAGNOSTIC__NODE:
				setNode((Node)newValue);
				return;
			case XsdPackage.XSD_DIAGNOSTIC__ANNOTATION_URI:
				setAnnotationURI((String)newValue);
				return;
			case XsdPackage.XSD_DIAGNOSTIC__KEY:
				setKey((String)newValue);
				return;
			case XsdPackage.XSD_DIAGNOSTIC__SUBSTITUTIONS:
				getSubstitutions().clear();
				getSubstitutions().addAll((Collection<? extends String>)newValue);
				return;
			case XsdPackage.XSD_DIAGNOSTIC__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends XSDConcreteComponent>)newValue);
				return;
			case XsdPackage.XSD_DIAGNOSTIC__PRIMARY_COMPONENT:
				setPrimaryComponent((XSDConcreteComponent)newValue);
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
			case XsdPackage.XSD_DIAGNOSTIC__SEVERITY:
				setSeverity(SEVERITY_EDEFAULT);
				return;
			case XsdPackage.XSD_DIAGNOSTIC__MESSAGE:
				setMessage(MESSAGE_EDEFAULT);
				return;
			case XsdPackage.XSD_DIAGNOSTIC__LOCATION_URI:
				setLocationURI(LOCATION_URI_EDEFAULT);
				return;
			case XsdPackage.XSD_DIAGNOSTIC__LINE:
				setLine(LINE_EDEFAULT);
				return;
			case XsdPackage.XSD_DIAGNOSTIC__COLUMN:
				setColumn(COLUMN_EDEFAULT);
				return;
			case XsdPackage.XSD_DIAGNOSTIC__NODE:
				setNode(NODE_EDEFAULT);
				return;
			case XsdPackage.XSD_DIAGNOSTIC__ANNOTATION_URI:
				setAnnotationURI(ANNOTATION_URI_EDEFAULT);
				return;
			case XsdPackage.XSD_DIAGNOSTIC__KEY:
				setKey(KEY_EDEFAULT);
				return;
			case XsdPackage.XSD_DIAGNOSTIC__SUBSTITUTIONS:
				getSubstitutions().clear();
				return;
			case XsdPackage.XSD_DIAGNOSTIC__COMPONENTS:
				getComponents().clear();
				return;
			case XsdPackage.XSD_DIAGNOSTIC__PRIMARY_COMPONENT:
				setPrimaryComponent((XSDConcreteComponent)null);
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
			case XsdPackage.XSD_DIAGNOSTIC__SEVERITY:
				return severity != SEVERITY_EDEFAULT;
			case XsdPackage.XSD_DIAGNOSTIC__MESSAGE:
				return MESSAGE_EDEFAULT == null ? message != null : !MESSAGE_EDEFAULT.equals(message);
			case XsdPackage.XSD_DIAGNOSTIC__LOCATION_URI:
				return LOCATION_URI_EDEFAULT == null ? locationURI != null : !LOCATION_URI_EDEFAULT.equals(locationURI);
			case XsdPackage.XSD_DIAGNOSTIC__LINE:
				return line != LINE_EDEFAULT;
			case XsdPackage.XSD_DIAGNOSTIC__COLUMN:
				return column != COLUMN_EDEFAULT;
			case XsdPackage.XSD_DIAGNOSTIC__NODE:
				return NODE_EDEFAULT == null ? node != null : !NODE_EDEFAULT.equals(node);
			case XsdPackage.XSD_DIAGNOSTIC__ANNOTATION_URI:
				return ANNOTATION_URI_EDEFAULT == null ? annotationURI != null : !ANNOTATION_URI_EDEFAULT.equals(annotationURI);
			case XsdPackage.XSD_DIAGNOSTIC__KEY:
				return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
			case XsdPackage.XSD_DIAGNOSTIC__SUBSTITUTIONS:
				return substitutions != null && !substitutions.isEmpty();
			case XsdPackage.XSD_DIAGNOSTIC__COMPONENTS:
				return components != null && !components.isEmpty();
			case XsdPackage.XSD_DIAGNOSTIC__PRIMARY_COMPONENT:
				return getPrimaryComponent() != null;
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
		result.append(" (severity: ");
		result.append(severity);
		result.append(", message: ");
		result.append(message);
		result.append(", locationURI: ");
		result.append(locationURI);
		result.append(", line: ");
		result.append(line);
		result.append(", column: ");
		result.append(column);
		result.append(", node: ");
		result.append(node);
		result.append(", annotationURI: ");
		result.append(annotationURI);
		result.append(", key: ");
		result.append(key);
		result.append(", substitutions: ");
		result.append(substitutions);
		result.append(')');
		return result.toString();
	}

} //XSDDiagnosticImpl
