/**
 */
package org.mmi.events.impl;

import org.carim.model.WeatherT;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.mmi.events.EventsPackage;
import org.mmi.events.WeatherUpdateEvent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Weather Update Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mmi.events.impl.WeatherUpdateEventImpl#getTemperature <em>Temperature</em>}</li>
 *   <li>{@link org.mmi.events.impl.WeatherUpdateEventImpl#getWeather <em>Weather</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WeatherUpdateEventImpl extends PhysicalEnvironmentContextEventImpl implements WeatherUpdateEvent {
	/**
	 * The default value of the '{@link #getTemperature() <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperature()
	 * @generated
	 * @ordered
	 */
	protected static final int TEMPERATURE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTemperature() <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperature()
	 * @generated
	 * @ordered
	 */
	protected int temperature = TEMPERATURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWeather() <em>Weather</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeather()
	 * @generated
	 * @ordered
	 */
	protected static final WeatherT WEATHER_EDEFAULT = WeatherT.NONE;

	/**
	 * The cached value of the '{@link #getWeather() <em>Weather</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeather()
	 * @generated
	 * @ordered
	 */
	protected WeatherT weather = WEATHER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WeatherUpdateEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EventsPackage.Literals.WEATHER_UPDATE_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTemperature() {
		return temperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemperature(int newTemperature) {
		int oldTemperature = temperature;
		temperature = newTemperature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.WEATHER_UPDATE_EVENT__TEMPERATURE, oldTemperature, temperature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeatherT getWeather() {
		return weather;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeather(WeatherT newWeather) {
		WeatherT oldWeather = weather;
		weather = newWeather == null ? WEATHER_EDEFAULT : newWeather;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.WEATHER_UPDATE_EVENT__WEATHER, oldWeather, weather));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EventsPackage.WEATHER_UPDATE_EVENT__TEMPERATURE:
				return getTemperature();
			case EventsPackage.WEATHER_UPDATE_EVENT__WEATHER:
				return getWeather();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EventsPackage.WEATHER_UPDATE_EVENT__TEMPERATURE:
				setTemperature((Integer)newValue);
				return;
			case EventsPackage.WEATHER_UPDATE_EVENT__WEATHER:
				setWeather((WeatherT)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EventsPackage.WEATHER_UPDATE_EVENT__TEMPERATURE:
				setTemperature(TEMPERATURE_EDEFAULT);
				return;
			case EventsPackage.WEATHER_UPDATE_EVENT__WEATHER:
				setWeather(WEATHER_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EventsPackage.WEATHER_UPDATE_EVENT__TEMPERATURE:
				return temperature != TEMPERATURE_EDEFAULT;
			case EventsPackage.WEATHER_UPDATE_EVENT__WEATHER:
				return weather != WEATHER_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (temperature: ");
		result.append(temperature);
		result.append(", weather: ");
		result.append(weather);
		result.append(')');
		return result.toString();
	}

} //WeatherUpdateEventImpl
