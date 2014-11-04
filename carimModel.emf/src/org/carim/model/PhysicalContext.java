/**
 */
package org.carim.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physical Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.carim.model.PhysicalContext#getTemperature <em>Temperature</em>}</li>
 *   <li>{@link org.carim.model.PhysicalContext#getWeather <em>Weather</em>}</li>
 *   <li>{@link org.carim.model.PhysicalContext#getNoise <em>Noise</em>}</li>
 *   <li>{@link org.carim.model.PhysicalContext#getLight <em>Light</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.carim.model.carimModelPackage#getPhysicalContext()
 * @model extendedMetaData="name='PhysicalContext' kind='elementOnly'"
 * @generated
 */
public interface PhysicalContext extends EObject {
	/**
	 * Returns the value of the '<em><b>Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temperature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temperature</em>' attribute.
	 * @see #isSetTemperature()
	 * @see #unsetTemperature()
	 * @see #setTemperature(int)
	 * @see org.carim.model.carimModelPackage#getPhysicalContext_Temperature()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='temperature' namespace='##targetNamespace'"
	 * @generated
	 */
	int getTemperature();

	/**
	 * Sets the value of the '{@link org.carim.model.PhysicalContext#getTemperature <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperature</em>' attribute.
	 * @see #isSetTemperature()
	 * @see #unsetTemperature()
	 * @see #getTemperature()
	 * @generated
	 */
	void setTemperature(int value);

	/**
	 * Unsets the value of the '{@link org.carim.model.PhysicalContext#getTemperature <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTemperature()
	 * @see #getTemperature()
	 * @see #setTemperature(int)
	 * @generated
	 */
	void unsetTemperature();

	/**
	 * Returns whether the value of the '{@link org.carim.model.PhysicalContext#getTemperature <em>Temperature</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Temperature</em>' attribute is set.
	 * @see #unsetTemperature()
	 * @see #getTemperature()
	 * @see #setTemperature(int)
	 * @generated
	 */
	boolean isSetTemperature();

	/**
	 * Returns the value of the '<em><b>Weather</b></em>' attribute.
	 * The literals are from the enumeration {@link org.carim.model.WeatherT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weather</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weather</em>' attribute.
	 * @see org.carim.model.WeatherT
	 * @see #isSetWeather()
	 * @see #unsetWeather()
	 * @see #setWeather(WeatherT)
	 * @see org.carim.model.carimModelPackage#getPhysicalContext_Weather()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='weather' namespace='##targetNamespace'"
	 * @generated
	 */
	WeatherT getWeather();

	/**
	 * Sets the value of the '{@link org.carim.model.PhysicalContext#getWeather <em>Weather</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weather</em>' attribute.
	 * @see org.carim.model.WeatherT
	 * @see #isSetWeather()
	 * @see #unsetWeather()
	 * @see #getWeather()
	 * @generated
	 */
	void setWeather(WeatherT value);

	/**
	 * Unsets the value of the '{@link org.carim.model.PhysicalContext#getWeather <em>Weather</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWeather()
	 * @see #getWeather()
	 * @see #setWeather(WeatherT)
	 * @generated
	 */
	void unsetWeather();

	/**
	 * Returns whether the value of the '{@link org.carim.model.PhysicalContext#getWeather <em>Weather</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Weather</em>' attribute is set.
	 * @see #unsetWeather()
	 * @see #getWeather()
	 * @see #setWeather(WeatherT)
	 * @generated
	 */
	boolean isSetWeather();

	/**
	 * Returns the value of the '<em><b>Noise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Noise</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Noise</em>' attribute.
	 * @see #isSetNoise()
	 * @see #unsetNoise()
	 * @see #setNoise(int)
	 * @see org.carim.model.carimModelPackage#getPhysicalContext_Noise()
	 * @model unsettable="true" dataType="org.carim.model.PercentageT" required="true"
	 *        extendedMetaData="kind='element' name='noise' namespace='##targetNamespace'"
	 * @generated
	 */
	int getNoise();

	/**
	 * Sets the value of the '{@link org.carim.model.PhysicalContext#getNoise <em>Noise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Noise</em>' attribute.
	 * @see #isSetNoise()
	 * @see #unsetNoise()
	 * @see #getNoise()
	 * @generated
	 */
	void setNoise(int value);

	/**
	 * Unsets the value of the '{@link org.carim.model.PhysicalContext#getNoise <em>Noise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNoise()
	 * @see #getNoise()
	 * @see #setNoise(int)
	 * @generated
	 */
	void unsetNoise();

	/**
	 * Returns whether the value of the '{@link org.carim.model.PhysicalContext#getNoise <em>Noise</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Noise</em>' attribute is set.
	 * @see #unsetNoise()
	 * @see #getNoise()
	 * @see #setNoise(int)
	 * @generated
	 */
	boolean isSetNoise();

	/**
	 * Returns the value of the '<em><b>Light</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Light</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Light</em>' attribute.
	 * @see #isSetLight()
	 * @see #unsetLight()
	 * @see #setLight(int)
	 * @see org.carim.model.carimModelPackage#getPhysicalContext_Light()
	 * @model unsettable="true" dataType="org.carim.model.PercentageT" required="true"
	 *        extendedMetaData="kind='element' name='light' namespace='##targetNamespace'"
	 * @generated
	 */
	int getLight();

	/**
	 * Sets the value of the '{@link org.carim.model.PhysicalContext#getLight <em>Light</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Light</em>' attribute.
	 * @see #isSetLight()
	 * @see #unsetLight()
	 * @see #getLight()
	 * @generated
	 */
	void setLight(int value);

	/**
	 * Unsets the value of the '{@link org.carim.model.PhysicalContext#getLight <em>Light</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLight()
	 * @see #getLight()
	 * @see #setLight(int)
	 * @generated
	 */
	void unsetLight();

	/**
	 * Returns whether the value of the '{@link org.carim.model.PhysicalContext#getLight <em>Light</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Light</em>' attribute is set.
	 * @see #unsetLight()
	 * @see #getLight()
	 * @see #setLight(int)
	 * @generated
	 */
	boolean isSetLight();

} // PhysicalContext
