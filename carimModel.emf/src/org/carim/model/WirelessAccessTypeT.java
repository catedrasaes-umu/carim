/**
 */
package org.carim.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Wireless Access Type T</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.carim.model.carimModelPackage#getWirelessAccessTypeT()
 * @model extendedMetaData="name='wireless_access_type_t'"
 * @generated
 */
public enum WirelessAccessTypeT implements Enumerator {
	/**
	 * The '<em><b>NOACCESS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOACCESS_VALUE
	 * @generated
	 * @ordered
	 */
	NOACCESS(0, "NOACCESS", "NO_ACCESS"), /**
	 * The '<em><b>MOBILE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOBILE_VALUE
	 * @generated
	 * @ordered
	 */
	MOBILE(1, "MOBILE", "MOBILE"), /**
	 * The '<em><b>WIFI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIFI_VALUE
	 * @generated
	 * @ordered
	 */
	WIFI(2, "WIFI", "WIFI"), /**
	 * The '<em><b>BLUETOOTH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLUETOOTH_VALUE
	 * @generated
	 * @ordered
	 */
	BLUETOOTH(3, "BLUETOOTH", "BLUETOOTH"), /**
	 * The '<em><b>OTHER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(4, "OTHER", "OTHER");

	/**
	 * The '<em><b>NOACCESS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOACCESS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOACCESS
	 * @model literal="NO_ACCESS"
	 * @generated
	 * @ordered
	 */
	public static final int NOACCESS_VALUE = 0;

	/**
	 * The '<em><b>MOBILE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MOBILE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOBILE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOBILE_VALUE = 1;

	/**
	 * The '<em><b>WIFI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WIFI</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WIFI
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WIFI_VALUE = 2;

	/**
	 * The '<em><b>BLUETOOTH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BLUETOOTH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BLUETOOTH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BLUETOOTH_VALUE = 3;

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
	public static final int OTHER_VALUE = 4;

	/**
	 * An array of all the '<em><b>Wireless Access Type T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final WirelessAccessTypeT[] VALUES_ARRAY =
		new WirelessAccessTypeT[] {
			NOACCESS,
			MOBILE,
			WIFI,
			BLUETOOTH,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Wireless Access Type T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<WirelessAccessTypeT> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Wireless Access Type T</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WirelessAccessTypeT get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WirelessAccessTypeT result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Wireless Access Type T</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WirelessAccessTypeT getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WirelessAccessTypeT result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Wireless Access Type T</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WirelessAccessTypeT get(int value) {
		switch (value) {
			case NOACCESS_VALUE: return NOACCESS;
			case MOBILE_VALUE: return MOBILE;
			case WIFI_VALUE: return WIFI;
			case BLUETOOTH_VALUE: return BLUETOOTH;
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
	private WirelessAccessTypeT(int value, String name, String literal) {
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
	
} //WirelessAccessTypeT
