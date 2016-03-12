/**
 */
package tesis.xsd_ecore.xsd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>XSD Identity Constraint Category</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDIdentityConstraintCategory()
 * @model
 * @generated
 */
public enum XSDIdentityConstraintCategory implements Enumerator {
	/**
	 * The '<em><b>Key</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEY_VALUE
	 * @generated
	 * @ordered
	 */
	KEY(0, "key", "key"),

	/**
	 * The '<em><b>Keyref</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEYREF_VALUE
	 * @generated
	 * @ordered
	 */
	KEYREF(1, "keyref", "keyref"),

	/**
	 * The '<em><b>Unique</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIQUE_VALUE
	 * @generated
	 * @ordered
	 */
	UNIQUE(2, "unique", "unique");

	/**
	 * The '<em><b>Key</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Key</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KEY
	 * @model name="key"
	 * @generated
	 * @ordered
	 */
	public static final int KEY_VALUE = 0;

	/**
	 * The '<em><b>Keyref</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Keyref</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KEYREF
	 * @model name="keyref"
	 * @generated
	 * @ordered
	 */
	public static final int KEYREF_VALUE = 1;

	/**
	 * The '<em><b>Unique</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unique</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNIQUE
	 * @model name="unique"
	 * @generated
	 * @ordered
	 */
	public static final int UNIQUE_VALUE = 2;

	/**
	 * An array of all the '<em><b>XSD Identity Constraint Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final XSDIdentityConstraintCategory[] VALUES_ARRAY =
		new XSDIdentityConstraintCategory[] {
			KEY,
			KEYREF,
			UNIQUE,
		};

	/**
	 * A public read-only list of all the '<em><b>XSD Identity Constraint Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<XSDIdentityConstraintCategory> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>XSD Identity Constraint Category</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static XSDIdentityConstraintCategory get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			XSDIdentityConstraintCategory result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>XSD Identity Constraint Category</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static XSDIdentityConstraintCategory getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			XSDIdentityConstraintCategory result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>XSD Identity Constraint Category</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static XSDIdentityConstraintCategory get(int value) {
		switch (value) {
			case KEY_VALUE: return KEY;
			case KEYREF_VALUE: return KEYREF;
			case UNIQUE_VALUE: return UNIQUE;
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
	private XSDIdentityConstraintCategory(int value, String name, String literal) {
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
	
} //XSDIdentityConstraintCategory
