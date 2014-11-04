/**
 */
package org.carim.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Mobility Level T</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.carim.model.carimModelPackage#getMobilityLevelT()
 * @model extendedMetaData="name='mobility_level_t'"
 * @generated
 */
public enum MobilityLevelT implements Enumerator {
	/**
	 * The '<em><b>NONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "NONE", "NONE"), /**
	 * The '<em><b>SITTING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SITTING_VALUE
	 * @generated
	 * @ordered
	 */
	SITTING(1, "SITTING", "SITTING"),

	/**
	 * The '<em><b>STANDING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STANDING_VALUE
	 * @generated
	 * @ordered
	 */
	STANDING(2, "STANDING", "STANDING"),

	/**
	 * The '<em><b>WALKING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WALKING_VALUE
	 * @generated
	 * @ordered
	 */
	WALKING(3, "WALKING", "WALKING"),

	/**
	 * The '<em><b>SPORTING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPORTING_VALUE
	 * @generated
	 * @ordered
	 */
	SPORTING(4, "SPORTING", "SPORTING"),

	/**
	 * The '<em><b>DRIVING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DRIVING_VALUE
	 * @generated
	 * @ordered
	 */
	DRIVING(5, "DRIVING", "DRIVING"),

	/**
	 * The '<em><b>OTHER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(6, "OTHER", "OTHER");

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
	 * The '<em><b>SITTING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SITTING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SITTING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SITTING_VALUE = 1;

	/**
	 * The '<em><b>STANDING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STANDING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STANDING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STANDING_VALUE = 2;

	/**
	 * The '<em><b>WALKING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WALKING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WALKING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WALKING_VALUE = 3;

	/**
	 * The '<em><b>SPORTING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SPORTING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPORTING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SPORTING_VALUE = 4;

	/**
	 * The '<em><b>DRIVING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DRIVING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DRIVING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DRIVING_VALUE = 5;

	/**
	 * The '<em><b>OTHER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OTHER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 6;

	/**
	 * An array of all the '<em><b>Mobility Level T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MobilityLevelT[] VALUES_ARRAY =
		new MobilityLevelT[] {
			NONE,
			SITTING,
			STANDING,
			WALKING,
			SPORTING,
			DRIVING,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Mobility Level T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MobilityLevelT> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Mobility Level T</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MobilityLevelT get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MobilityLevelT result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mobility Level T</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MobilityLevelT getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MobilityLevelT result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mobility Level T</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MobilityLevelT get(int value) {
		switch (value) {
			case NONE_VALUE: return NONE;
			case SITTING_VALUE: return SITTING;
			case STANDING_VALUE: return STANDING;
			case WALKING_VALUE: return WALKING;
			case SPORTING_VALUE: return SPORTING;
			case DRIVING_VALUE: return DRIVING;
			case OTHER_VALUE: return OTHER;
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
	private MobilityLevelT(int value, String name, String literal) {
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
	
} //MobilityLevelT
