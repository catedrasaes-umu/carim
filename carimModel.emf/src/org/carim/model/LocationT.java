/**
 */
package org.carim.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Location T</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.carim.model.carimModelPackage#getLocationT()
 * @model extendedMetaData="name='location_t'"
 * @generated
 */
public enum LocationT implements Enumerator {
	/**
	 * The '<em><b>NONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "NONE", "NONE"), /**
	 * The '<em><b>HOME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOME_VALUE
	 * @generated
	 * @ordered
	 */
	HOME(1, "HOME", "HOME"),

	/**
	 * The '<em><b>OFFICESCHOOL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OFFICESCHOOL_VALUE
	 * @generated
	 * @ordered
	 */
	OFFICESCHOOL(2, "OFFICESCHOOL", "OFFICE/SCHOOL"),

	/**
	 * The '<em><b>STREET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STREET_VALUE
	 * @generated
	 * @ordered
	 */
	STREET(3, "STREET", "STREET"),

	/**
	 * The '<em><b>OTHERINDOOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHERINDOOR_VALUE
	 * @generated
	 * @ordered
	 */
	OTHERINDOOR(4, "OTHERINDOOR", "OTHER_INDOOR"),

	/**
	 * The '<em><b>OTHEROUTDOOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHEROUTDOOR_VALUE
	 * @generated
	 * @ordered
	 */
	OTHEROUTDOOR(5, "OTHEROUTDOOR", "OTHER_OUTDOOR");

	/**
	 * The '<em><b>NONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NONE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 0;

	/**
	 * The '<em><b>HOME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HOME</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HOME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HOME_VALUE = 1;

	/**
	 * The '<em><b>OFFICESCHOOL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OFFICESCHOOL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OFFICESCHOOL
	 * @model literal="OFFICE/SCHOOL"
	 * @generated
	 * @ordered
	 */
	public static final int OFFICESCHOOL_VALUE = 2;

	/**
	 * The '<em><b>STREET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STREET</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STREET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STREET_VALUE = 3;

	/**
	 * The '<em><b>OTHERINDOOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OTHERINDOOR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTHERINDOOR
	 * @model literal="OTHER_INDOOR"
	 * @generated
	 * @ordered
	 */
	public static final int OTHERINDOOR_VALUE = 4;

	/**
	 * The '<em><b>OTHEROUTDOOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OTHEROUTDOOR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTHEROUTDOOR
	 * @model literal="OTHER_OUTDOOR"
	 * @generated
	 * @ordered
	 */
	public static final int OTHEROUTDOOR_VALUE = 5;

	/**
	 * An array of all the '<em><b>Location T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LocationT[] VALUES_ARRAY =
		new LocationT[] {
			NONE,
			HOME,
			OFFICESCHOOL,
			STREET,
			OTHERINDOOR,
			OTHEROUTDOOR,
		};

	/**
	 * A public read-only list of all the '<em><b>Location T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LocationT> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Location T</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LocationT get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LocationT result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Location T</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LocationT getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LocationT result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Location T</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LocationT get(int value) {
		switch (value) {
			case NONE_VALUE: return NONE;
			case HOME_VALUE: return HOME;
			case OFFICESCHOOL_VALUE: return OFFICESCHOOL;
			case STREET_VALUE: return STREET;
			case OTHERINDOOR_VALUE: return OTHERINDOOR;
			case OTHEROUTDOOR_VALUE: return OTHEROUTDOOR;
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
	private LocationT(int value, String name, String literal) {
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
	
} //LocationT
