/**
 */
package org.carim.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Education Level T</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.carim.model.carimModelPackage#getEducationLevelT()
 * @model extendedMetaData="name='education_level_t'"
 * @generated
 */
public enum EducationLevelT implements Enumerator {
	/**
	 * The '<em><b>NONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "NONE", "NONE"), /**
	 * The '<em><b>HIGHSCHOOL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIGHSCHOOL_VALUE
	 * @generated
	 * @ordered
	 */
	HIGHSCHOOL(1, "HIGHSCHOOL", "HIGH_SCHOOL"),

	/**
	 * The '<em><b>PROFESSIONAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROFESSIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	PROFESSIONAL(2, "PROFESSIONAL", "PROFESSIONAL"),

	/**
	 * The '<em><b>COLLEGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLEGE_VALUE
	 * @generated
	 * @ordered
	 */
	COLLEGE(3, "COLLEGE", "COLLEGE"),

	/**
	 * The '<em><b>NOTAPPLICABLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTAPPLICABLE_VALUE
	 * @generated
	 * @ordered
	 */
	NOTAPPLICABLE(4, "NOTAPPLICABLE", "NOT_APPLICABLE");

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
	 * The '<em><b>HIGHSCHOOL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HIGHSCHOOL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HIGHSCHOOL
	 * @model literal="HIGH_SCHOOL"
	 * @generated
	 * @ordered
	 */
	public static final int HIGHSCHOOL_VALUE = 1;

	/**
	 * The '<em><b>PROFESSIONAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PROFESSIONAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROFESSIONAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PROFESSIONAL_VALUE = 2;

	/**
	 * The '<em><b>COLLEGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COLLEGE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLLEGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COLLEGE_VALUE = 3;

	/**
	 * The '<em><b>NOTAPPLICABLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOTAPPLICABLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOTAPPLICABLE
	 * @model literal="NOT_APPLICABLE"
	 * @generated
	 * @ordered
	 */
	public static final int NOTAPPLICABLE_VALUE = 4;

	/**
	 * An array of all the '<em><b>Education Level T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EducationLevelT[] VALUES_ARRAY =
		new EducationLevelT[] {
			NONE,
			HIGHSCHOOL,
			PROFESSIONAL,
			COLLEGE,
			NOTAPPLICABLE,
		};

	/**
	 * A public read-only list of all the '<em><b>Education Level T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EducationLevelT> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Education Level T</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EducationLevelT get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EducationLevelT result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Education Level T</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EducationLevelT getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EducationLevelT result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Education Level T</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EducationLevelT get(int value) {
		switch (value) {
			case NONE_VALUE: return NONE;
			case HIGHSCHOOL_VALUE: return HIGHSCHOOL;
			case PROFESSIONAL_VALUE: return PROFESSIONAL;
			case COLLEGE_VALUE: return COLLEGE;
			case NOTAPPLICABLE_VALUE: return NOTAPPLICABLE;
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
	private EducationLevelT(int value, String name, String literal) {
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
	
} //EducationLevelT
