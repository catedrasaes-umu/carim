/**
 */
package org.carim.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Weather T</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.carim.model.carimModelPackage#getWeatherT()
 * @model extendedMetaData="name='weather_t'"
 * @generated
 */
public enum WeatherT implements Enumerator {
	/**
	 * The '<em><b>NONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "NONE", "NONE"), /**
	 * The '<em><b>SUNNY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUNNY_VALUE
	 * @generated
	 * @ordered
	 */
	SUNNY(1, "SUNNY", "SUNNY"),

	/**
	 * The '<em><b>CLOUDY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOUDY_VALUE
	 * @generated
	 * @ordered
	 */
	CLOUDY(2, "CLOUDY", "CLOUDY"),

	/**
	 * The '<em><b>WINDY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WINDY_VALUE
	 * @generated
	 * @ordered
	 */
	WINDY(3, "WINDY", "WINDY"),

	/**
	 * The '<em><b>RAINY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RAINY_VALUE
	 * @generated
	 * @ordered
	 */
	RAINY(4, "RAINY", "RAINY"),

	/**
	 * The '<em><b>SNOWY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SNOWY_VALUE
	 * @generated
	 * @ordered
	 */
	SNOWY(5, "SNOWY", "SNOWY");

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
	 * The '<em><b>SUNNY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SUNNY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUNNY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SUNNY_VALUE = 1;

	/**
	 * The '<em><b>CLOUDY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CLOUDY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLOUDY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CLOUDY_VALUE = 2;

	/**
	 * The '<em><b>WINDY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WINDY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WINDY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WINDY_VALUE = 3;

	/**
	 * The '<em><b>RAINY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RAINY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RAINY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RAINY_VALUE = 4;

	/**
	 * The '<em><b>SNOWY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SNOWY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SNOWY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SNOWY_VALUE = 5;

	/**
	 * An array of all the '<em><b>Weather T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final WeatherT[] VALUES_ARRAY =
		new WeatherT[] {
			NONE,
			SUNNY,
			CLOUDY,
			WINDY,
			RAINY,
			SNOWY,
		};

	/**
	 * A public read-only list of all the '<em><b>Weather T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<WeatherT> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Weather T</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WeatherT get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WeatherT result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Weather T</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WeatherT getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WeatherT result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Weather T</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WeatherT get(int value) {
		switch (value) {
			case NONE_VALUE: return NONE;
			case SUNNY_VALUE: return SUNNY;
			case CLOUDY_VALUE: return CLOUDY;
			case WINDY_VALUE: return WINDY;
			case RAINY_VALUE: return RAINY;
			case SNOWY_VALUE: return SNOWY;
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
	private WeatherT(int value, String name, String literal) {
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
	
} //WeatherT
