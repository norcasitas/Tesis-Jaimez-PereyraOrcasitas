/**
 */
package tesis.xsd_ecore.xsd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>XSD Attribute Use Category</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDAttributeUseCategory()
 * @model
 * @generated
 */
public enum XSDAttributeUseCategory implements Enumerator {
	/**
	 * The '<em><b>Optional</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPTIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	OPTIONAL(0, "optional", "optional"),

	/**
	 * The '<em><b>Prohibited</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROHIBITED_VALUE
	 * @generated
	 * @ordered
	 */
	PROHIBITED(1, "prohibited", "prohibited"),

	/**
	 * The '<em><b>Required</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUIRED_VALUE
	 * @generated
	 * @ordered
	 */
	REQUIRED(2, "required", "required");

	/**
	 * The '<em><b>Optional</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Optional</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPTIONAL
	 * @model name="optional"
	 * @generated
	 * @ordered
	 */
	public static final int OPTIONAL_VALUE = 0;

	/**
	 * The '<em><b>Prohibited</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Prohibited</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROHIBITED
	 * @model name="prohibited"
	 * @generated
	 * @ordered
	 */
	public static final int PROHIBITED_VALUE = 1;

	/**
	 * The '<em><b>Required</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Required</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REQUIRED
	 * @model name="required"
	 * @generated
	 * @ordered
	 */
	public static final int REQUIRED_VALUE = 2;

	/**
	 * An array of all the '<em><b>XSD Attribute Use Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final XSDAttributeUseCategory[] VALUES_ARRAY =
		new XSDAttributeUseCategory[] {
			OPTIONAL,
			PROHIBITED,
			REQUIRED,
		};

	/**
	 * A public read-only list of all the '<em><b>XSD Attribute Use Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<XSDAttributeUseCategory> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>XSD Attribute Use Category</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static XSDAttributeUseCategory get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			XSDAttributeUseCategory result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>XSD Attribute Use Category</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static XSDAttributeUseCategory getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			XSDAttributeUseCategory result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>XSD Attribute Use Category</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static XSDAttributeUseCategory get(int value) {
		switch (value) {
			case OPTIONAL_VALUE: return OPTIONAL;
			case PROHIBITED_VALUE: return PROHIBITED;
			case REQUIRED_VALUE: return REQUIRED;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private XSDAttributeUseCategory(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //XSDAttributeUseCategory
