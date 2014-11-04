/**
 */
package org.mmi.events.impl;

import org.carim.model.ScreenOrientationT;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.mmi.events.DeviceRunningFeaturesUpdateEvent;
import org.mmi.events.EventsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Running Features Update Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mmi.events.impl.DeviceRunningFeaturesUpdateEventImpl#getScreenOrientation <em>Screen Orientation</em>}</li>
 *   <li>{@link org.mmi.events.impl.DeviceRunningFeaturesUpdateEventImpl#getBrightness <em>Brightness</em>}</li>
 *   <li>{@link org.mmi.events.impl.DeviceRunningFeaturesUpdateEventImpl#getVolume <em>Volume</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeviceRunningFeaturesUpdateEventImpl extends DeviceContextEventImpl implements DeviceRunningFeaturesUpdateEvent {
	/**
	 * The default value of the '{@link #getScreenOrientation() <em>Screen Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScreenOrientation()
	 * @generated
	 * @ordered
	 */
	protected static final ScreenOrientationT SCREEN_ORIENTATION_EDEFAULT = ScreenOrientationT.NONE;

	/**
	 * The cached value of the '{@link #getScreenOrientation() <em>Screen Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScreenOrientation()
	 * @generated
	 * @ordered
	 */
	protected ScreenOrientationT screenOrientation = SCREEN_ORIENTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getBrightness() <em>Brightness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrightness()
	 * @generated
	 * @ordered
	 */
	protected static final int BRIGHTNESS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBrightness() <em>Brightness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrightness()
	 * @generated
	 * @ordered
	 */
	protected int brightness = BRIGHTNESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getVolume() <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolume()
	 * @generated
	 * @ordered
	 */
	protected static final int VOLUME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVolume() <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolume()
	 * @generated
	 * @ordered
	 */
	protected int volume = VOLUME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceRunningFeaturesUpdateEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EventsPackage.Literals.DEVICE_RUNNING_FEATURES_UPDATE_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScreenOrientationT getScreenOrientation() {
		return screenOrientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScreenOrientation(ScreenOrientationT newScreenOrientation) {
		ScreenOrientationT oldScreenOrientation = screenOrientation;
		screenOrientation = newScreenOrientation == null ? SCREEN_ORIENTATION_EDEFAULT : newScreenOrientation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.DEVICE_RUNNING_FEATURES_UPDATE_EVENT__SCREEN_ORIENTATION, oldScreenOrientation, screenOrientation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBrightness() {
		return brightness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBrightness(int newBrightness) {
		int oldBrightness = brightness;
		brightness = newBrightness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.DEVICE_RUNNING_FEATURES_UPDATE_EVENT__BRIGHTNESS, oldBrightness, brightness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVolume() {
		return volume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolume(int newVolume) {
		int oldVolume = volume;
		volume = newVolume;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.DEVICE_RUNNING_FEATURES_UPDATE_EVENT__VOLUME, oldVolume, volume));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EventsPackage.DEVICE_RUNNING_FEATURES_UPDATE_EVENT__SCREEN_ORIENTATION:
				return getScreenOrientation();
			case EventsPackage.DEVICE_RUNNING_FEATURES_UPDATE_EVENT__BRIGHTNESS:
				return getBrightness();
			case EventsPackage.DEVICE_RUNNING_FEATURES_UPDATE_EVENT__VOLUME:
				return getVolume();
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
			case EventsPackage.DEVICE_RUNNING_FEATURES_UPDATE_EVENT__SCREEN_ORIENTATION:
				setScreenOrientation((ScreenOrientationT)newValue);
				return;
			case EventsPackage.DEVICE_RUNNING_FEATURES_UPDATE_EVENT__BRIGHTNESS:
				setBrightness((Integer)newValue);
				return;
			case EventsPackage.DEVICE_RUNNING_FEATURES_UPDATE_EVENT__VOLUME:
				setVolume((Integer)newValue);
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
			case EventsPackage.DEVICE_RUNNING_FEATURES_UPDATE_EVENT__SCREEN_ORIENTATION:
				setScreenOrientation(SCREEN_ORIENTATION_EDEFAULT);
				return;
			case EventsPackage.DEVICE_RUNNING_FEATURES_UPDATE_EVENT__BRIGHTNESS:
				setBrightness(BRIGHTNESS_EDEFAULT);
				return;
			case EventsPackage.DEVICE_RUNNING_FEATURES_UPDATE_EVENT__VOLUME:
				setVolume(VOLUME_EDEFAULT);
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
			case EventsPackage.DEVICE_RUNNING_FEATURES_UPDATE_EVENT__SCREEN_ORIENTATION:
				return screenOrientation != SCREEN_ORIENTATION_EDEFAULT;
			case EventsPackage.DEVICE_RUNNING_FEATURES_UPDATE_EVENT__BRIGHTNESS:
				return brightness != BRIGHTNESS_EDEFAULT;
			case EventsPackage.DEVICE_RUNNING_FEATURES_UPDATE_EVENT__VOLUME:
				return volume != VOLUME_EDEFAULT;
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
		result.append(" (screenOrientation: ");
		result.append(screenOrientation);
		result.append(", brightness: ");
		result.append(brightness);
		result.append(", volume: ");
		result.append(volume);
		result.append(')');
		return result.toString();
	}

} //DeviceRunningFeaturesUpdateEventImpl
