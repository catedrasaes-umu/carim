/**
 */
package org.mmi.events;

import org.carim.model.WeatherT;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Weather Update Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mmi.events.WeatherUpdateEvent#getTemperature <em>Temperature</em>}</li>
 *   <li>{@link org.mmi.events.WeatherUpdateEvent#getWeather <em>Weather</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mmi.events.EventsPackage#getWeatherUpdateEvent()
 * @model
 * @generated
 */
public interface WeatherUpdateEvent extends PhysicalEnvironmentContextEvent {
	/**
	 * Returns the value of the '<em><b>Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temperature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temperature</em>' attribute.
	 * @see #setTemperature(int)
	 * @see org.mmi.events.EventsPackage#getWeatherUpdateEvent_Temperature()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getTemperature();

	/**
	 * Sets the value of the '{@link org.mmi.events.WeatherUpdateEvent#getTemperature <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperature</em>' attribute.
	 * @see #getTemperature()
	 * @generated
	 */
	void setTemperature(int value);

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
	 * @see #setWeather(WeatherT)
	 * @see org.mmi.events.EventsPackage#getWeatherUpdateEvent_Weather()
	 * @model
	 * @generated
	 */
	WeatherT getWeather();

	/**
	 * Sets the value of the '{@link org.mmi.events.WeatherUpdateEvent#getWeather <em>Weather</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weather</em>' attribute.
	 * @see org.carim.model.WeatherT
	 * @see #getWeather()
	 * @generated
	 */
	void setWeather(WeatherT value);

} // WeatherUpdateEvent
