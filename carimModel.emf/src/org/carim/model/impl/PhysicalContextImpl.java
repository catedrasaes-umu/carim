/**
 */
package org.carim.model.impl;

import org.carim.model.PhysicalContext;
import org.carim.model.WeatherT;
import org.carim.model.carimModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.carim.model.impl.PhysicalContextImpl#getTemperature <em>Temperature</em>}</li>
 *   <li>{@link org.carim.model.impl.PhysicalContextImpl#getWeather <em>Weather</em>}</li>
 *   <li>{@link org.carim.model.impl.PhysicalContextImpl#getNoise <em>Noise</em>}</li>
 *   <li>{@link org.carim.model.impl.PhysicalContextImpl#getLight <em>Light</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhysicalContextImpl extends EObjectImpl implements PhysicalContext {
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
	 * This is true if the Temperature attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean temperatureESet;

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
	 * This is true if the Weather attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean weatherESet;

	/**
	 * The default value of the '{@link #getNoise() <em>Noise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoise()
	 * @generated
	 * @ordered
	 */
	protected static final int NOISE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNoise() <em>Noise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoise()
	 * @generated
	 * @ordered
	 */
	protected int noise = NOISE_EDEFAULT;

	/**
	 * This is true if the Noise attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean noiseESet;

	/**
	 * The default value of the '{@link #getLight() <em>Light</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLight()
	 * @generated
	 * @ordered
	 */
	protected static final int LIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLight() <em>Light</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLight()
	 * @generated
	 * @ordered
	 */
	protected int light = LIGHT_EDEFAULT;

	/**
	 * This is true if the Light attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lightESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return carimModelPackage.Literals.PHYSICAL_CONTEXT;
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
		boolean oldTemperatureESet = temperatureESet;
		temperatureESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.PHYSICAL_CONTEXT__TEMPERATURE, oldTemperature, temperature, !oldTemperatureESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTemperature() {
		int oldTemperature = temperature;
		boolean oldTemperatureESet = temperatureESet;
		temperature = TEMPERATURE_EDEFAULT;
		temperatureESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, carimModelPackage.PHYSICAL_CONTEXT__TEMPERATURE, oldTemperature, TEMPERATURE_EDEFAULT, oldTemperatureESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTemperature() {
		return temperatureESet;
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
		boolean oldWeatherESet = weatherESet;
		weatherESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.PHYSICAL_CONTEXT__WEATHER, oldWeather, weather, !oldWeatherESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWeather() {
		WeatherT oldWeather = weather;
		boolean oldWeatherESet = weatherESet;
		weather = WEATHER_EDEFAULT;
		weatherESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, carimModelPackage.PHYSICAL_CONTEXT__WEATHER, oldWeather, WEATHER_EDEFAULT, oldWeatherESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWeather() {
		return weatherESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNoise() {
		return noise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoise(int newNoise) {
		int oldNoise = noise;
		noise = newNoise;
		boolean oldNoiseESet = noiseESet;
		noiseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.PHYSICAL_CONTEXT__NOISE, oldNoise, noise, !oldNoiseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNoise() {
		int oldNoise = noise;
		boolean oldNoiseESet = noiseESet;
		noise = NOISE_EDEFAULT;
		noiseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, carimModelPackage.PHYSICAL_CONTEXT__NOISE, oldNoise, NOISE_EDEFAULT, oldNoiseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNoise() {
		return noiseESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLight() {
		return light;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLight(int newLight) {
		int oldLight = light;
		light = newLight;
		boolean oldLightESet = lightESet;
		lightESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.PHYSICAL_CONTEXT__LIGHT, oldLight, light, !oldLightESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLight() {
		int oldLight = light;
		boolean oldLightESet = lightESet;
		light = LIGHT_EDEFAULT;
		lightESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, carimModelPackage.PHYSICAL_CONTEXT__LIGHT, oldLight, LIGHT_EDEFAULT, oldLightESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLight() {
		return lightESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case carimModelPackage.PHYSICAL_CONTEXT__TEMPERATURE:
				return getTemperature();
			case carimModelPackage.PHYSICAL_CONTEXT__WEATHER:
				return getWeather();
			case carimModelPackage.PHYSICAL_CONTEXT__NOISE:
				return getNoise();
			case carimModelPackage.PHYSICAL_CONTEXT__LIGHT:
				return getLight();
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
			case carimModelPackage.PHYSICAL_CONTEXT__TEMPERATURE:
				setTemperature((Integer)newValue);
				return;
			case carimModelPackage.PHYSICAL_CONTEXT__WEATHER:
				setWeather((WeatherT)newValue);
				return;
			case carimModelPackage.PHYSICAL_CONTEXT__NOISE:
				setNoise((Integer)newValue);
				return;
			case carimModelPackage.PHYSICAL_CONTEXT__LIGHT:
				setLight((Integer)newValue);
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
			case carimModelPackage.PHYSICAL_CONTEXT__TEMPERATURE:
				unsetTemperature();
				return;
			case carimModelPackage.PHYSICAL_CONTEXT__WEATHER:
				unsetWeather();
				return;
			case carimModelPackage.PHYSICAL_CONTEXT__NOISE:
				unsetNoise();
				return;
			case carimModelPackage.PHYSICAL_CONTEXT__LIGHT:
				unsetLight();
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
			case carimModelPackage.PHYSICAL_CONTEXT__TEMPERATURE:
				return isSetTemperature();
			case carimModelPackage.PHYSICAL_CONTEXT__WEATHER:
				return isSetWeather();
			case carimModelPackage.PHYSICAL_CONTEXT__NOISE:
				return isSetNoise();
			case carimModelPackage.PHYSICAL_CONTEXT__LIGHT:
				return isSetLight();
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
		if (temperatureESet) result.append(temperature); else result.append("<unset>");
		result.append(", weather: ");
		if (weatherESet) result.append(weather); else result.append("<unset>");
		result.append(", noise: ");
		if (noiseESet) result.append(noise); else result.append("<unset>");
		result.append(", light: ");
		if (lightESet) result.append(light); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //PhysicalContextImpl
