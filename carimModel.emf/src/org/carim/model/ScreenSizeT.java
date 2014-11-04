/**
 */
package org.carim.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Screen Size T</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.carim.model.carimModelPackage#getScreenSizeT()
 * @model extendedMetaData="name='screen_size_t'"
 * @generated
 */
public enum ScreenSizeT implements Enumerator {
	/**
	 * The '<em><b>NONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "NONE", "NONE"), /**
	 * The '<em><b>SMALL Let4in</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMALL_LET4IN_VALUE
	 * @generated
	 * @ordered
	 */
	SMALL_LET4IN(1, "SMALLLet4in", "SMALL_let_4in"),

	/**
	 * The '<em><b>MEDIUM Bt4in10in</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDIUM_BT4IN10IN_VALUE
	 * @generated
	 * @ordered
	 */
	MEDIUM_BT4IN10IN(2, "MEDIUMBt4in10in", "MEDIUM_bt_4in_10in"),

	/**
	 * The '<em><b>LARGE Get10in</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LARGE_GET10IN_VALUE
	 * @generated
	 * @ordered
	 */
	LARGE_GET10IN(3, "LARGEGet10in", "LARGE_get_10in");

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
	 * The '<em><b>SMALL Let4in</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SMALL Let4in</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SMALL_LET4IN
	 * @model name="SMALLLet4in" literal="SMALL_let_4in"
	 * @generated
	 * @ordered
	 */
	public static final int SMALL_LET4IN_VALUE = 1;

	/**
	 * The '<em><b>MEDIUM Bt4in10in</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MEDIUM Bt4in10in</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEDIUM_BT4IN10IN
	 * @model name="MEDIUMBt4in10in" literal="MEDIUM_bt_4in_10in"
	 * @generated
	 * @ordered
	 */
	public static final int MEDIUM_BT4IN10IN_VALUE = 2;

	/**
	 * The '<em><b>LARGE Get10in</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LARGE Get10in</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LARGE_GET10IN
	 * @model name="LARGEGet10in" literal="LARGE_get_10in"
	 * @generated
	 * @ordered
	 */
	public static final int LARGE_GET10IN_VALUE = 3;

	/**
	 * An array of all the '<em><b>Screen Size T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ScreenSizeT[] VALUES_ARRAY =
		new ScreenSizeT[] {
			NONE,
			SMALL_LET4IN,
			MEDIUM_BT4IN10IN,
			LARGE_GET10IN,
		};

	/**
	 * A public read-only list of all the '<em><b>Screen Size T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ScreenSizeT> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Screen Size T</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ScreenSizeT get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ScreenSizeT result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Screen Size T</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ScreenSizeT getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ScreenSizeT result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Screen Size T</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ScreenSizeT get(int value) {
		switch (value) {
			case NONE_VALUE: return NONE;
			case SMALL_LET4IN_VALUE: return SMALL_LET4IN;
			case MEDIUM_BT4IN10IN_VALUE: return MEDIUM_BT4IN10IN;
			case LARGE_GET10IN_VALUE: return LARGE_GET10IN;
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
	private ScreenSizeT(int value, String name, String literal) {
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
	
} //ScreenSizeT
