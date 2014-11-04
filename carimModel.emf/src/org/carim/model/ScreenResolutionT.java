/**
 */
package org.carim.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Screen Resolution T</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.carim.model.carimModelPackage#getScreenResolutionT()
 * @model extendedMetaData="name='screen_resolution_t'"
 * @generated
 */
public enum ScreenResolutionT implements Enumerator {
	/**
	 * The '<em><b>NONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "NONE", "NONE"), /**
	 * The '<em><b>SMALL Let480x800</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMALL_LET480X800_VALUE
	 * @generated
	 * @ordered
	 */
	SMALL_LET480X800(1, "SMALLLet480x800", "SMALL_let_480x800"),

	/**
	 * The '<em><b>MEDIUM Bt480x8001280x800</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDIUM_BT480X8001280X800_VALUE
	 * @generated
	 * @ordered
	 */
	MEDIUM_BT480X8001280X800(2, "MEDIUMBt480x8001280x800", "MEDIUM_bt_480x800_1280x800"),

	/**
	 * The '<em><b>LARGE Get1280x800</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LARGE_GET1280X800_VALUE
	 * @generated
	 * @ordered
	 */
	LARGE_GET1280X800(3, "LARGEGet1280x800", "LARGE_get_1280x800");

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
	 * The '<em><b>SMALL Let480x800</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SMALL Let480x800</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SMALL_LET480X800
	 * @model name="SMALLLet480x800" literal="SMALL_let_480x800"
	 * @generated
	 * @ordered
	 */
	public static final int SMALL_LET480X800_VALUE = 1;

	/**
	 * The '<em><b>MEDIUM Bt480x8001280x800</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MEDIUM Bt480x8001280x800</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEDIUM_BT480X8001280X800
	 * @model name="MEDIUMBt480x8001280x800" literal="MEDIUM_bt_480x800_1280x800"
	 * @generated
	 * @ordered
	 */
	public static final int MEDIUM_BT480X8001280X800_VALUE = 2;

	/**
	 * The '<em><b>LARGE Get1280x800</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LARGE Get1280x800</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LARGE_GET1280X800
	 * @model name="LARGEGet1280x800" literal="LARGE_get_1280x800"
	 * @generated
	 * @ordered
	 */
	public static final int LARGE_GET1280X800_VALUE = 3;

	/**
	 * An array of all the '<em><b>Screen Resolution T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ScreenResolutionT[] VALUES_ARRAY =
		new ScreenResolutionT[] {
			NONE,
			SMALL_LET480X800,
			MEDIUM_BT480X8001280X800,
			LARGE_GET1280X800,
		};

	/**
	 * A public read-only list of all the '<em><b>Screen Resolution T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ScreenResolutionT> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Screen Resolution T</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ScreenResolutionT get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ScreenResolutionT result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Screen Resolution T</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ScreenResolutionT getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ScreenResolutionT result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Screen Resolution T</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ScreenResolutionT get(int value) {
		switch (value) {
			case NONE_VALUE: return NONE;
			case SMALL_LET480X800_VALUE: return SMALL_LET480X800;
			case MEDIUM_BT480X8001280X800_VALUE: return MEDIUM_BT480X8001280X800;
			case LARGE_GET1280X800_VALUE: return LARGE_GET1280X800;
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
	private ScreenResolutionT(int value, String name, String literal) {
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
	
} //ScreenResolutionT
