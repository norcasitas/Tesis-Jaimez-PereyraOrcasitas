/**
 */
package tesis.xsd_ecore.xsd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>XSD Substitution Group Exclusions</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDSubstitutionGroupExclusions()
 * @model
 * @generated
 */
public enum XSDSubstitutionGroupExclusions implements Enumerator {
	/**
	 * The '<em><b>Extension</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTENSION_VALUE
	 * @generated
	 * @ordered
	 */
	EXTENSION(0, "extension", "extension"),

	/**
	 * The '<em><b>Restriction</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESTRICTION_VALUE
	 * @generated
	 * @ordered
	 */
	RESTRICTION(1, "restriction", "restriction");

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
	public static final int EXTENSION_VALUE = 0;

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
	public static final int RESTRICTION_VALUE = 1;

	/**
	 * An array of all the '<em><b>XSD Substitution Group Exclusions</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final XSDSubstitutionGroupExclusions[] VALUES_ARRAY =
		new XSDSubstitutionGroupExclusions[] {
			EXTENSION,
			RESTRICTION,
		};

	/**
	 * A public read-only list of all the '<em><b>XSD Substitution Group Exclusions</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<XSDSubstitutionGroupExclusions> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>XSD Substitution Group Exclusions</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static XSDSubstitutionGroupExclusions get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			XSDSubstitutionGroupExclusions result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>XSD Substitution Group Exclusions</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static XSDSubstitutionGroupExclusions getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			XSDSubstitutionGroupExclusions result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>XSD Substitution Group Exclusions</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static XSDSubstitutionGroupExclusions get(int value) {
		switch (value) {
			case EXTENSION_VALUE: return EXTENSION;
			case RESTRICTION_VALUE: return RESTRICTION;
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
	private XSDSubstitutionGroupExclusions(int value, String name, String literal) {
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
	
} //XSDSubstitutionGroupExclusions
