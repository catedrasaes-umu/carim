/**
 */
package org.mmi.events.impl;

import org.carim.model.DeviceTypeT;
import org.carim.model.ScreenResolutionT;
import org.carim.model.ScreenSizeT;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.mmi.events.DeviceFeaturesUpdateEvent;
import org.mmi.events.EventsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Features Update Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mmi.events.impl.DeviceFeaturesUpdateEventImpl#getDeviceType <em>Device Type</em>}</li>
 *   <li>{@link org.mmi.events.impl.DeviceFeaturesUpdateEventImpl#getScreenSize <em>Screen Size</em>}</li>
 *   <li>{@link org.mmi.events.impl.DeviceFeaturesUpdateEventImpl#getScreenResolution <em>Screen Resolution</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeviceFeaturesUpdateEventImpl extends DeviceContextEventImpl implements DeviceFeaturesUpdateEvent {
	/**
	 * The default value of the '{@link #getDeviceType() <em>Device Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceType()
	 * @generated
	 * @ordered
	 */
	protected static final DeviceTypeT DEVICE_TYPE_EDEFAULT = DeviceTypeT.NONE;

	/**
	 * The cached value of the '{@link #getDeviceType() <em>Device Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceType()
	 * @generated
	 * @ordered
	 */
	protected DeviceTypeT deviceType = DEVICE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getScreenSize() <em>Screen Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScreenSize()
	 * @generated
	 * @ordered
	 */
	protected static final ScreenSizeT SCREEN_SIZE_EDEFAULT = ScreenSizeT.NONE;

	/**
	 * The cached value of the '{@link #getScreenSize() <em>Screen Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScreenSize()
	 * @generated
	 * @ordered
	 */
	protected ScreenSizeT screenSize = SCREEN_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getScreenResolution() <em>Screen Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScreenResolution()
	 * @generated
	 * @ordered
	 */
	protected static final ScreenResolutionT SCREEN_RESOLUTION_EDEFAULT = ScreenResolutionT.NONE;

	/**
	 * The cached value of the '{@link #getScreenResolution() <em>Screen Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScreenResolution()
	 * @generated
	 * @ordered
	 */
	protected ScreenResolutionT screenResolution = SCREEN_RESOLUTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceFeaturesUpdateEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EventsPackage.Literals.DEVICE_FEATURES_UPDATE_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceTypeT getDeviceType() {
		return deviceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviceType(DeviceTypeT newDeviceType) {
		DeviceTypeT oldDeviceType = deviceType;
		deviceType = newDeviceType == null ? DEVICE_TYPE_EDEFAULT : newDeviceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.DEVICE_FEATURES_UPDATE_EVENT__DEVICE_TYPE, oldDeviceType, deviceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScreenSizeT getScreenSize() {
		return screenSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScreenSize(ScreenSizeT newScreenSize) {
		ScreenSizeT oldScreenSize = screenSize;
		screenSize = newScreenSize == null ? SCREEN_SIZE_EDEFAULT : newScreenSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.DEVICE_FEATURES_UPDATE_EVENT__SCREEN_SIZE, oldScreenSize, screenSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScreenResolutionT getScreenResolution() {
		return screenResolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScreenResolution(ScreenResolutionT newScreenResolution) {
		ScreenResolutionT oldScreenResolution = screenResolution;
		screenResolution = newScreenResolution == null ? SCREEN_RESOLUTION_EDEFAULT : newScreenResolution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.DEVICE_FEATURES_UPDATE_EVENT__SCREEN_RESOLUTION, oldScreenResolution, screenResolution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EventsPackage.DEVICE_FEATURES_UPDATE_EVENT__DEVICE_TYPE:
				return getDeviceType();
			case EventsPackage.DEVICE_FEATURES_UPDATE_EVENT__SCREEN_SIZE:
				return getScreenSize();
			case EventsPackage.DEVICE_FEATURES_UPDATE_EVENT__SCREEN_RESOLUTION:
				return getScreenResolution();
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
			case EventsPackage.DEVICE_FEATURES_UPDATE_EVENT__DEVICE_TYPE:
				setDeviceType((DeviceTypeT)newValue);
				return;
			case EventsPackage.DEVICE_FEATURES_UPDATE_EVENT__SCREEN_SIZE:
				setScreenSize((ScreenSizeT)newValue);
				return;
			case EventsPackage.DEVICE_FEATURES_UPDATE_EVENT__SCREEN_RESOLUTION:
				setScreenResolution((ScreenResolutionT)newValue);
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
			case EventsPackage.DEVICE_FEATURES_UPDATE_EVENT__DEVICE_TYPE:
				setDeviceType(DEVICE_TYPE_EDEFAULT);
				return;
			case EventsPackage.DEVICE_FEATURES_UPDATE_EVENT__SCREEN_SIZE:
				setScreenSize(SCREEN_SIZE_EDEFAULT);
				return;
			case EventsPackage.DEVICE_FEATURES_UPDATE_EVENT__SCREEN_RESOLUTION:
				setScreenResolution(SCREEN_RESOLUTION_EDEFAULT);
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
			case EventsPackage.DEVICE_FEATURES_UPDATE_EVENT__DEVICE_TYPE:
				return deviceType != DEVICE_TYPE_EDEFAULT;
			case EventsPackage.DEVICE_FEATURES_UPDATE_EVENT__SCREEN_SIZE:
				return screenSize != SCREEN_SIZE_EDEFAULT;
			case EventsPackage.DEVICE_FEATURES_UPDATE_EVENT__SCREEN_RESOLUTION:
				return screenResolution != SCREEN_RESOLUTION_EDEFAULT;
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
		result.append(" (deviceType: ");
		result.append(deviceType);
		result.append(", screenSize: ");
		result.append(screenSize);
		result.append(", screenResolution: ");
		result.append(screenResolution);
		result.append(')');
		return result.toString();
	}

} //DeviceFeaturesUpdateEventImpl
