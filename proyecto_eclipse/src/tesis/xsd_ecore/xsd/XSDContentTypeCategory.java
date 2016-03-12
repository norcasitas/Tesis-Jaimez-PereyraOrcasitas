/**
 */
package tesis.xsd_ecore.xsd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>XSD Content Type Category</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see tesis.xsd_ecore.xsd.XsdPackage#getXSDContentTypeCategory()
 * @model
 * @generated
 */
public enum XSDContentTypeCategory implements Enumerator {
	/**
	 * The '<em><b>Empty</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMPTY_VALUE
	 * @generated
	 * @ordered
	 */
	EMPTY(0, "empty", "empty"),

	/**
	 * The '<em><b>Simple</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIMPLE_VALUE
	 * @generated
	 * @ordered
	 */
	SIMPLE(1, "simple", "simple"),

	/**
	 * The '<em><b>Mixed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIXED_VALUE
	 * @generated
	 * @ordered
	 */
	MIXED(2, "mixed", "mixed"),

	/**
	 * The '<em><b>Element Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELEMENT_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	ELEMENT_ONLY(3, "elementOnly", "elementOnly");

	/**
	 * The '<em><b>Empty</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Empty</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EMPTY
	 * @model name="empty"
	 * @generated
	 * @ordered
	 */
	public static final int EMPTY_VALUE = 0;

	/**
	 * The '<em><b>Simple</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Simple</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SIMPLE
	 * @model name="simple"
	 * @generated
	 * @ordered
	 */
	public static final int SIMPLE_VALUE = 1;

	/**
	 * The '<em><b>Mixed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mixed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MIXED
	 * @model name="mixed"
	 * @generated
	 * @ordered
	 */
	public static final int MIXED_VALUE = 2;

	/**
	 * The '<em><b>Element Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Element Only</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ELEMENT_ONLY
	 * @model name="elementOnly"
	 * @generated
	 * @ordered
	 */
	public static final int ELEMENT_ONLY_VALUE = 3;

	/**
	 * An array of all the '<em><b>XSD Content Type Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final XSDContentTypeCategory[] VALUES_ARRAY =
		new XSDContentTypeCategory[] {
			EMPTY,
			SIMPLE,
			MIXED,
			ELEMENT_ONLY,
		};

	/**
	 * A public read-only list of all the '<em><b>XSD Content Type Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<XSDContentTypeCategory> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>XSD Content Type Category</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static XSDContentTypeCategory get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			XSDContentTypeCategory result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>XSD Content Type Category</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static XSDContentTypeCategory getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			XSDContentTypeCategory result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>XSD Content Type Category</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static XSDContentTypeCategory get(int value) {
		switch (value) {
			case EMPTY_VALUE: return EMPTY;
			case SIMPLE_VALUE: return SIMPLE;
			case MIXED_VALUE: return MIXED;
			case ELEMENT_ONLY_VALUE: return ELEMENT_ONLY;
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
	private XSDContentTypeCategory(int value, String name, String literal) {
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
	
} //XSDContentTypeCategory
