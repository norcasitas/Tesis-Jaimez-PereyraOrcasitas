/**
 */
package tesis.xsd_ecore.xsd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>XSD Disallowed Substitutions</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDDisallowedSubstitutions()
 * @model
 * @generated
 */
public enum XSDDisallowedSubstitutions implements Enumerator {
	/**
	 * The '<em><b>Substitution</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBSTITUTION_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSTITUTION(0, "substitution", "substitution"),

	/**
	 * The '<em><b>Extension</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTENSION_VALUE
	 * @generated
	 * @ordered
	 */
	EXTENSION(1, "extension", "extension"),

	/**
	 * The '<em><b>Restriction</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESTRICTION_VALUE
	 * @generated
	 * @ordered
	 */
	RESTRICTION(2, "restriction", "restriction"),

	/**
	 * The '<em><b>All</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL_VALUE
	 * @generated
	 * @ordered
	 */
	ALL(3, "all", "all");

	/**
	 * The '<em><b>Substitution</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Substitution</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBSTITUTION
	 * @model name="substitution"
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTITUTION_VALUE = 0;

	/**
	 * The '<em><b>Extension</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Extension</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXTENSION
	 * @model name="extension"
	 * @generated
	 * @ordered
	 */
	public static final int EXTENSION_VALUE = 1;

	/**
	 * The '<em><b>Restriction</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Restriction</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESTRICTION
	 * @model name="restriction"
	 * @generated
	 * @ordered
	 */
	public static final int RESTRICTION_VALUE = 2;

	/**
	 * The '<em><b>All</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>All</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALL
	 * @model name="all"
	 * @generated
	 * @ordered
	 */
	public static final int ALL_VALUE = 3;

	/**
	 * An array of all the '<em><b>XSD Disallowed Substitutions</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final XSDDisallowedSubstitutions[] VALUES_ARRAY =
		new XSDDisallowedSubstitutions[] {
			SUBSTITUTION,
			EXTENSION,
			RESTRICTION,
			ALL,
		};

	/**
	 * A public read-only list of all the '<em><b>XSD Disallowed Substitutions</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<XSDDisallowedSubstitutions> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>XSD Disallowed Substitutions</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static XSDDisallowedSubstitutions get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			XSDDisallowedSubstitutions result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>XSD Disallowed Substitutions</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static XSDDisallowedSubstitutions getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			XSDDisallowedSubstitutions result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>XSD Disallowed Substitutions</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static XSDDisallowedSubstitutions get(int value) {
		switch (value) {
			case SUBSTITUTION_VALUE: return SUBSTITUTION;
			case EXTENSION_VALUE: return EXTENSION;
			case RESTRICTION_VALUE: return RESTRICTION;
			case ALL_VALUE: return ALL;
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
	private XSDDisallowedSubstitutions(int value, String name, String literal) {
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
	
} //XSDDisallowedSubstitutions
