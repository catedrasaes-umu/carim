/**
 */
package org.carim.model.impl;

import org.carim.model.DeviceContext;
import org.carim.model.DeviceTypeT;
import org.carim.model.ScreenOrientationT;
import org.carim.model.ScreenResolutionT;
import org.carim.model.ScreenSizeT;
import org.carim.model.carimModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.carim.model.impl.DeviceContextImpl#getDeviceType <em>Device Type</em>}</li>
 *   <li>{@link org.carim.model.impl.DeviceContextImpl#getScreenSize <em>Screen Size</em>}</li>
 *   <li>{@link org.carim.model.impl.DeviceContextImpl#getScreenResolution <em>Screen Resolution</em>}</li>
 *   <li>{@link org.carim.model.impl.DeviceContextImpl#getScreenOrientation <em>Screen Orientation</em>}</li>
 *   <li>{@link org.carim.model.impl.DeviceContextImpl#getScreenBrightnessLevel <em>Screen Brightness Level</em>}</li>
 *   <li>{@link org.carim.model.impl.DeviceContextImpl#getVolumeLevel <em>Volume Level</em>}</li>
 *   <li>{@link org.carim.model.impl.DeviceContextImpl#getMemoryUsage <em>Memory Usage</em>}</li>
 *   <li>{@link org.carim.model.impl.DeviceContextImpl#getCpuUsage <em>Cpu Usage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeviceContextImpl extends EObjectImpl implements DeviceContext {
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
	 * This is true if the Device Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean deviceTypeESet;

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
	 * This is true if the Screen Size attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean screenSizeESet;

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
	 * This is true if the Screen Resolution attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean screenResolutionESet;

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
	 * This is true if the Screen Orientation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean screenOrientationESet;

	/**
	 * The default value of the '{@link #getScreenBrightnessLevel() <em>Screen Brightness Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScreenBrightnessLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int SCREEN_BRIGHTNESS_LEVEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getScreenBrightnessLevel() <em>Screen Brightness Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScreenBrightnessLevel()
	 * @generated
	 * @ordered
	 */
	protected int screenBrightnessLevel = SCREEN_BRIGHTNESS_LEVEL_EDEFAULT;

	/**
	 * This is true if the Screen Brightness Level attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean screenBrightnessLevelESet;

	/**
	 * The default value of the '{@link #getVolumeLevel() <em>Volume Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumeLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int VOLUME_LEVEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVolumeLevel() <em>Volume Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumeLevel()
	 * @generated
	 * @ordered
	 */
	protected int volumeLevel = VOLUME_LEVEL_EDEFAULT;

	/**
	 * This is true if the Volume Level attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean volumeLevelESet;

	/**
	 * The default value of the '{@link #getMemoryUsage() <em>Memory Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryUsage()
	 * @generated
	 * @ordered
	 */
	protected static final int MEMORY_USAGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMemoryUsage() <em>Memory Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryUsage()
	 * @generated
	 * @ordered
	 */
	protected int memoryUsage = MEMORY_USAGE_EDEFAULT;

	/**
	 * This is true if the Memory Usage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean memoryUsageESet;

	/**
	 * The default value of the '{@link #getCpuUsage() <em>Cpu Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpuUsage()
	 * @generated
	 * @ordered
	 */
	protected static final int CPU_USAGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCpuUsage() <em>Cpu Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpuUsage()
	 * @generated
	 * @ordered
	 */
	protected int cpuUsage = CPU_USAGE_EDEFAULT;

	/**
	 * This is true if the Cpu Usage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cpuUsageESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return carimModelPackage.Literals.DEVICE_CONTEXT;
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
		boolean oldDeviceTypeESet = deviceTypeESet;
		deviceTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.DEVICE_CONTEXT__DEVICE_TYPE, oldDeviceType, deviceType, !oldDeviceTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDeviceType() {
		DeviceTypeT oldDeviceType = deviceType;
		boolean oldDeviceTypeESet = deviceTypeESet;
		deviceType = DEVICE_TYPE_EDEFAULT;
		deviceTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, carimModelPackage.DEVICE_CONTEXT__DEVICE_TYPE, oldDeviceType, DEVICE_TYPE_EDEFAULT, oldDeviceTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDeviceType() {
		return deviceTypeESet;
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
		boolean oldScreenSizeESet = screenSizeESet;
		screenSizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.DEVICE_CONTEXT__SCREEN_SIZE, oldScreenSize, screenSize, !oldScreenSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetScreenSize() {
		ScreenSizeT oldScreenSize = screenSize;
		boolean oldScreenSizeESet = screenSizeESet;
		screenSize = SCREEN_SIZE_EDEFAULT;
		screenSizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, carimModelPackage.DEVICE_CONTEXT__SCREEN_SIZE, oldScreenSize, SCREEN_SIZE_EDEFAULT, oldScreenSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetScreenSize() {
		return screenSizeESet;
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
		boolean oldScreenResolutionESet = screenResolutionESet;
		screenResolutionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.DEVICE_CONTEXT__SCREEN_RESOLUTION, oldScreenResolution, screenResolution, !oldScreenResolutionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetScreenResolution() {
		ScreenResolutionT oldScreenResolution = screenResolution;
		boolean oldScreenResolutionESet = screenResolutionESet;
		screenResolution = SCREEN_RESOLUTION_EDEFAULT;
		screenResolutionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, carimModelPackage.DEVICE_CONTEXT__SCREEN_RESOLUTION, oldScreenResolution, SCREEN_RESOLUTION_EDEFAULT, oldScreenResolutionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetScreenResolution() {
		return screenResolutionESet;
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
		boolean oldScreenOrientationESet = screenOrientationESet;
		screenOrientationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.DEVICE_CONTEXT__SCREEN_ORIENTATION, oldScreenOrientation, screenOrientation, !oldScreenOrientationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetScreenOrientation() {
		ScreenOrientationT oldScreenOrientation = screenOrientation;
		boolean oldScreenOrientationESet = screenOrientationESet;
		screenOrientation = SCREEN_ORIENTATION_EDEFAULT;
		screenOrientationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, carimModelPackage.DEVICE_CONTEXT__SCREEN_ORIENTATION, oldScreenOrientation, SCREEN_ORIENTATION_EDEFAULT, oldScreenOrientationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetScreenOrientation() {
		return screenOrientationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getScreenBrightnessLevel() {
		return screenBrightnessLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScreenBrightnessLevel(int newScreenBrightnessLevel) {
		int oldScreenBrightnessLevel = screenBrightnessLevel;
		screenBrightnessLevel = newScreenBrightnessLevel;
		boolean oldScreenBrightnessLevelESet = screenBrightnessLevelESet;
		screenBrightnessLevelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.DEVICE_CONTEXT__SCREEN_BRIGHTNESS_LEVEL, oldScreenBrightnessLevel, screenBrightnessLevel, !oldScreenBrightnessLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetScreenBrightnessLevel() {
		int oldScreenBrightnessLevel = screenBrightnessLevel;
		boolean oldScreenBrightnessLevelESet = screenBrightnessLevelESet;
		screenBrightnessLevel = SCREEN_BRIGHTNESS_LEVEL_EDEFAULT;
		screenBrightnessLevelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, carimModelPackage.DEVICE_CONTEXT__SCREEN_BRIGHTNESS_LEVEL, oldScreenBrightnessLevel, SCREEN_BRIGHTNESS_LEVEL_EDEFAULT, oldScreenBrightnessLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetScreenBrightnessLevel() {
		return screenBrightnessLevelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVolumeLevel() {
		return volumeLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolumeLevel(int newVolumeLevel) {
		int oldVolumeLevel = volumeLevel;
		volumeLevel = newVolumeLevel;
		boolean oldVolumeLevelESet = volumeLevelESet;
		volumeLevelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.DEVICE_CONTEXT__VOLUME_LEVEL, oldVolumeLevel, volumeLevel, !oldVolumeLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVolumeLevel() {
		int oldVolumeLevel = volumeLevel;
		boolean oldVolumeLevelESet = volumeLevelESet;
		volumeLevel = VOLUME_LEVEL_EDEFAULT;
		volumeLevelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, carimModelPackage.DEVICE_CONTEXT__VOLUME_LEVEL, oldVolumeLevel, VOLUME_LEVEL_EDEFAULT, oldVolumeLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVolumeLevel() {
		return volumeLevelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMemoryUsage() {
		return memoryUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemoryUsage(int newMemoryUsage) {
		int oldMemoryUsage = memoryUsage;
		memoryUsage = newMemoryUsage;
		boolean oldMemoryUsageESet = memoryUsageESet;
		memoryUsageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.DEVICE_CONTEXT__MEMORY_USAGE, oldMemoryUsage, memoryUsage, !oldMemoryUsageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMemoryUsage() {
		int oldMemoryUsage = memoryUsage;
		boolean oldMemoryUsageESet = memoryUsageESet;
		memoryUsage = MEMORY_USAGE_EDEFAULT;
		memoryUsageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, carimModelPackage.DEVICE_CONTEXT__MEMORY_USAGE, oldMemoryUsage, MEMORY_USAGE_EDEFAULT, oldMemoryUsageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMemoryUsage() {
		return memoryUsageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCpuUsage() {
		return cpuUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCpuUsage(int newCpuUsage) {
		int oldCpuUsage = cpuUsage;
		cpuUsage = newCpuUsage;
		boolean oldCpuUsageESet = cpuUsageESet;
		cpuUsageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.DEVICE_CONTEXT__CPU_USAGE, oldCpuUsage, cpuUsage, !oldCpuUsageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCpuUsage() {
		int oldCpuUsage = cpuUsage;
		boolean oldCpuUsageESet = cpuUsageESet;
		cpuUsage = CPU_USAGE_EDEFAULT;
		cpuUsageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, carimModelPackage.DEVICE_CONTEXT__CPU_USAGE, oldCpuUsage, CPU_USAGE_EDEFAULT, oldCpuUsageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCpuUsage() {
		return cpuUsageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case carimModelPackage.DEVICE_CONTEXT__DEVICE_TYPE:
				return getDeviceType();
			case carimModelPackage.DEVICE_CONTEXT__SCREEN_SIZE:
				return getScreenSize();
			case carimModelPackage.DEVICE_CONTEXT__SCREEN_RESOLUTION:
				return getScreenResolution();
			case carimModelPackage.DEVICE_CONTEXT__SCREEN_ORIENTATION:
				return getScreenOrientation();
			case carimModelPackage.DEVICE_CONTEXT__SCREEN_BRIGHTNESS_LEVEL:
				return getScreenBrightnessLevel();
			case carimModelPackage.DEVICE_CONTEXT__VOLUME_LEVEL:
				return getVolumeLevel();
			case carimModelPackage.DEVICE_CONTEXT__MEMORY_USAGE:
				return getMemoryUsage();
			case carimModelPackage.DEVICE_CONTEXT__CPU_USAGE:
				return getCpuUsage();
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
			case carimModelPackage.DEVICE_CONTEXT__DEVICE_TYPE:
				setDeviceType((DeviceTypeT)newValue);
				return;
			case carimModelPackage.DEVICE_CONTEXT__SCREEN_SIZE:
				setScreenSize((ScreenSizeT)newValue);
				return;
			case carimModelPackage.DEVICE_CONTEXT__SCREEN_RESOLUTION:
				setScreenResolution((ScreenResolutionT)newValue);
				return;
			case carimModelPackage.DEVICE_CONTEXT__SCREEN_ORIENTATION:
				setScreenOrientation((ScreenOrientationT)newValue);
				return;
			case carimModelPackage.DEVICE_CONTEXT__SCREEN_BRIGHTNESS_LEVEL:
				setScreenBrightnessLevel((Integer)newValue);
				return;
			case carimModelPackage.DEVICE_CONTEXT__VOLUME_LEVEL:
				setVolumeLevel((Integer)newValue);
				return;
			case carimModelPackage.DEVICE_CONTEXT__MEMORY_USAGE:
				setMemoryUsage((Integer)newValue);
				return;
			case carimModelPackage.DEVICE_CONTEXT__CPU_USAGE:
				setCpuUsage((Integer)newValue);
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
			case carimModelPackage.DEVICE_CONTEXT__DEVICE_TYPE:
				unsetDeviceType();
				return;
			case carimModelPackage.DEVICE_CONTEXT__SCREEN_SIZE:
				unsetScreenSize();
				return;
			case carimModelPackage.DEVICE_CONTEXT__SCREEN_RESOLUTION:
				unsetScreenResolution();
				return;
			case carimModelPackage.DEVICE_CONTEXT__SCREEN_ORIENTATION:
				unsetScreenOrientation();
				return;
			case carimModelPackage.DEVICE_CONTEXT__SCREEN_BRIGHTNESS_LEVEL:
				unsetScreenBrightnessLevel();
				return;
			case carimModelPackage.DEVICE_CONTEXT__VOLUME_LEVEL:
				unsetVolumeLevel();
				return;
			case carimModelPackage.DEVICE_CONTEXT__MEMORY_USAGE:
				unsetMemoryUsage();
				return;
			case carimModelPackage.DEVICE_CONTEXT__CPU_USAGE:
				unsetCpuUsage();
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
			case carimModelPackage.DEVICE_CONTEXT__DEVICE_TYPE:
				return isSetDeviceType();
			case carimModelPackage.DEVICE_CONTEXT__SCREEN_SIZE:
				return isSetScreenSize();
			case carimModelPackage.DEVICE_CONTEXT__SCREEN_RESOLUTION:
				return isSetScreenResolution();
			case carimModelPackage.DEVICE_CONTEXT__SCREEN_ORIENTATION:
				return isSetScreenOrientation();
			case carimModelPackage.DEVICE_CONTEXT__SCREEN_BRIGHTNESS_LEVEL:
				return isSetScreenBrightnessLevel();
			case carimModelPackage.DEVICE_CONTEXT__VOLUME_LEVEL:
				return isSetVolumeLevel();
			case carimModelPackage.DEVICE_CONTEXT__MEMORY_USAGE:
				return isSetMemoryUsage();
			case carimModelPackage.DEVICE_CONTEXT__CPU_USAGE:
				return isSetCpuUsage();
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
		if (deviceTypeESet) result.append(deviceType); else result.append("<unset>");
		result.append(", screenSize: ");
		if (screenSizeESet) result.append(screenSize); else result.append("<unset>");
		result.append(", screenResolution: ");
		if (screenResolutionESet) result.append(screenResolution); else result.append("<unset>");
		result.append(", screenOrientation: ");
		if (screenOrientationESet) result.append(screenOrientation); else result.append("<unset>");
		result.append(", screenBrightnessLevel: ");
		if (screenBrightnessLevelESet) result.append(screenBrightnessLevel); else result.append("<unset>");
		result.append(", volumeLevel: ");
		if (volumeLevelESet) result.append(volumeLevel); else result.append("<unset>");
		result.append(", memoryUsage: ");
		if (memoryUsageESet) result.append(memoryUsage); else result.append("<unset>");
		result.append(", cpuUsage: ");
		if (cpuUsageESet) result.append(cpuUsage); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DeviceContextImpl
