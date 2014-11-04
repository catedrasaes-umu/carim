/**
 */
package org.mmi.events.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.mmi.events.AmbientUpdateEvent;
import org.mmi.events.EventsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ambient Update Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mmi.events.impl.AmbientUpdateEventImpl#getNoise <em>Noise</em>}</li>
 *   <li>{@link org.mmi.events.impl.AmbientUpdateEventImpl#getLight <em>Light</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AmbientUpdateEventImpl extends PhysicalEnvironmentContextEventImpl implements AmbientUpdateEvent {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AmbientUpdateEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EventsPackage.Literals.AMBIENT_UPDATE_EVENT;
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.AMBIENT_UPDATE_EVENT__NOISE, oldNoise, noise));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.AMBIENT_UPDATE_EVENT__LIGHT, oldLight, light));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EventsPackage.AMBIENT_UPDATE_EVENT__NOISE:
				return getNoise();
			case EventsPackage.AMBIENT_UPDATE_EVENT__LIGHT:
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
			case EventsPackage.AMBIENT_UPDATE_EVENT__NOISE:
				setNoise((Integer)newValue);
				return;
			case EventsPackage.AMBIENT_UPDATE_EVENT__LIGHT:
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
			case EventsPackage.AMBIENT_UPDATE_EVENT__NOISE:
				setNoise(NOISE_EDEFAULT);
				return;
			case EventsPackage.AMBIENT_UPDATE_EVENT__LIGHT:
				setLight(LIGHT_EDEFAULT);
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
			case EventsPackage.AMBIENT_UPDATE_EVENT__NOISE:
				return noise != NOISE_EDEFAULT;
			case EventsPackage.AMBIENT_UPDATE_EVENT__LIGHT:
				return light != LIGHT_EDEFAULT;
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
		result.append(" (noise: ");
		result.append(noise);
		result.append(", light: ");
		result.append(light);
		result.append(')');
		return result.toString();
	}

} //AmbientUpdateEventImpl
