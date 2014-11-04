/**
 */
package org.carim.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.carim.model.DeviceContext#getDeviceType <em>Device Type</em>}</li>
 *   <li>{@link org.carim.model.DeviceContext#getScreenSize <em>Screen Size</em>}</li>
 *   <li>{@link org.carim.model.DeviceContext#getScreenResolution <em>Screen Resolution</em>}</li>
 *   <li>{@link org.carim.model.DeviceContext#getScreenOrientation <em>Screen Orientation</em>}</li>
 *   <li>{@link org.carim.model.DeviceContext#getScreenBrightnessLevel <em>Screen Brightness Level</em>}</li>
 *   <li>{@link org.carim.model.DeviceContext#getVolumeLevel <em>Volume Level</em>}</li>
 *   <li>{@link org.carim.model.DeviceContext#getMemoryUsage <em>Memory Usage</em>}</li>
 *   <li>{@link org.carim.model.DeviceContext#getCpuUsage <em>Cpu Usage</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.carim.model.carimModelPackage#getDeviceContext()
 * @model extendedMetaData="name='DeviceContext' kind='elementOnly'"
 * @generated
 */
public interface DeviceContext extends EObject {
	/**
	 * Returns the value of the '<em><b>Device Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.carim.model.DeviceTypeT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Type</em>' attribute.
	 * @see org.carim.model.DeviceTypeT
	 * @see #isSetDeviceType()
	 * @see #unsetDeviceType()
	 * @see #setDeviceType(DeviceTypeT)
	 * @see org.carim.model.carimModelPackage#getDeviceContext_DeviceType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='deviceType' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceTypeT getDeviceType();

	/**
	 * Sets the value of the '{@link org.carim.model.DeviceContext#getDeviceType <em>Device Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Type</em>' attribute.
	 * @see org.carim.model.DeviceTypeT
	 * @see #isSetDeviceType()
	 * @see #unsetDeviceType()
	 * @see #getDeviceType()
	 * @generated
	 */
	void setDeviceType(DeviceTypeT value);

	/**
	 * Unsets the value of the '{@link org.carim.model.DeviceContext#getDeviceType <em>Device Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDeviceType()
	 * @see #getDeviceType()
	 * @see #setDeviceType(DeviceTypeT)
	 * @generated
	 */
	void unsetDeviceType();

	/**
	 * Returns whether the value of the '{@link org.carim.model.DeviceContext#getDeviceType <em>Device Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Device Type</em>' attribute is set.
	 * @see #unsetDeviceType()
	 * @see #getDeviceType()
	 * @see #setDeviceType(DeviceTypeT)
	 * @generated
	 */
	boolean isSetDeviceType();

	/**
	 * Returns the value of the '<em><b>Screen Size</b></em>' attribute.
	 * The literals are from the enumeration {@link org.carim.model.ScreenSizeT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Screen Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screen Size</em>' attribute.
	 * @see org.carim.model.ScreenSizeT
	 * @see #isSetScreenSize()
	 * @see #unsetScreenSize()
	 * @see #setScreenSize(ScreenSizeT)
	 * @see org.carim.model.carimModelPackage#getDeviceContext_ScreenSize()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='screenSize' namespace='##targetNamespace'"
	 * @generated
	 */
	ScreenSizeT getScreenSize();

	/**
	 * Sets the value of the '{@link org.carim.model.DeviceContext#getScreenSize <em>Screen Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Screen Size</em>' attribute.
	 * @see org.carim.model.ScreenSizeT
	 * @see #isSetScreenSize()
	 * @see #unsetScreenSize()
	 * @see #getScreenSize()
	 * @generated
	 */
	void setScreenSize(ScreenSizeT value);

	/**
	 * Unsets the value of the '{@link org.carim.model.DeviceContext#getScreenSize <em>Screen Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetScreenSize()
	 * @see #getScreenSize()
	 * @see #setScreenSize(ScreenSizeT)
	 * @generated
	 */
	void unsetScreenSize();

	/**
	 * Returns whether the value of the '{@link org.carim.model.DeviceContext#getScreenSize <em>Screen Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Screen Size</em>' attribute is set.
	 * @see #unsetScreenSize()
	 * @see #getScreenSize()
	 * @see #setScreenSize(ScreenSizeT)
	 * @generated
	 */
	boolean isSetScreenSize();

	/**
	 * Returns the value of the '<em><b>Screen Resolution</b></em>' attribute.
	 * The literals are from the enumeration {@link org.carim.model.ScreenResolutionT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Screen Resolution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screen Resolution</em>' attribute.
	 * @see org.carim.model.ScreenResolutionT
	 * @see #isSetScreenResolution()
	 * @see #unsetScreenResolution()
	 * @see #setScreenResolution(ScreenResolutionT)
	 * @see org.carim.model.carimModelPackage#getDeviceContext_ScreenResolution()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='screenResolution' namespace='##targetNamespace'"
	 * @generated
	 */
	ScreenResolutionT getScreenResolution();

	/**
	 * Sets the value of the '{@link org.carim.model.DeviceContext#getScreenResolution <em>Screen Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Screen Resolution</em>' attribute.
	 * @see org.carim.model.ScreenResolutionT
	 * @see #isSetScreenResolution()
	 * @see #unsetScreenResolution()
	 * @see #getScreenResolution()
	 * @generated
	 */
	void setScreenResolution(ScreenResolutionT value);

	/**
	 * Unsets the value of the '{@link org.carim.model.DeviceContext#getScreenResolution <em>Screen Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetScreenResolution()
	 * @see #getScreenResolution()
	 * @see #setScreenResolution(ScreenResolutionT)
	 * @generated
	 */
	void unsetScreenResolution();

	/**
	 * Returns whether the value of the '{@link org.carim.model.DeviceContext#getScreenResolution <em>Screen Resolution</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Screen Resolution</em>' attribute is set.
	 * @see #unsetScreenResolution()
	 * @see #getScreenResolution()
	 * @see #setScreenResolution(ScreenResolutionT)
	 * @generated
	 */
	boolean isSetScreenResolution();

	/**
	 * Returns the value of the '<em><b>Screen Orientation</b></em>' attribute.
	 * The literals are from the enumeration {@link org.carim.model.ScreenOrientationT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Screen Orientation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screen Orientation</em>' attribute.
	 * @see org.carim.model.ScreenOrientationT
	 * @see #isSetScreenOrientation()
	 * @see #unsetScreenOrientation()
	 * @see #setScreenOrientation(ScreenOrientationT)
	 * @see org.carim.model.carimModelPackage#getDeviceContext_ScreenOrientation()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='screenOrientation' namespace='##targetNamespace'"
	 * @generated
	 */
	ScreenOrientationT getScreenOrientation();

	/**
	 * Sets the value of the '{@link org.carim.model.DeviceContext#getScreenOrientation <em>Screen Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Screen Orientation</em>' attribute.
	 * @see org.carim.model.ScreenOrientationT
	 * @see #isSetScreenOrientation()
	 * @see #unsetScreenOrientation()
	 * @see #getScreenOrientation()
	 * @generated
	 */
	void setScreenOrientation(ScreenOrientationT value);

	/**
	 * Unsets the value of the '{@link org.carim.model.DeviceContext#getScreenOrientation <em>Screen Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetScreenOrientation()
	 * @see #getScreenOrientation()
	 * @see #setScreenOrientation(ScreenOrientationT)
	 * @generated
	 */
	void unsetScreenOrientation();

	/**
	 * Returns whether the value of the '{@link org.carim.model.DeviceContext#getScreenOrientation <em>Screen Orientation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Screen Orientation</em>' attribute is set.
	 * @see #unsetScreenOrientation()
	 * @see #getScreenOrientation()
	 * @see #setScreenOrientation(ScreenOrientationT)
	 * @generated
	 */
	boolean isSetScreenOrientation();

	/**
	 * Returns the value of the '<em><b>Screen Brightness Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Screen Brightness Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screen Brightness Level</em>' attribute.
	 * @see #isSetScreenBrightnessLevel()
	 * @see #unsetScreenBrightnessLevel()
	 * @see #setScreenBrightnessLevel(int)
	 * @see org.carim.model.carimModelPackage#getDeviceContext_ScreenBrightnessLevel()
	 * @model unsettable="true" dataType="org.carim.model.PercentageT" required="true"
	 *        extendedMetaData="kind='element' name='screenBrightnessLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	int getScreenBrightnessLevel();

	/**
	 * Sets the value of the '{@link org.carim.model.DeviceContext#getScreenBrightnessLevel <em>Screen Brightness Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Screen Brightness Level</em>' attribute.
	 * @see #isSetScreenBrightnessLevel()
	 * @see #unsetScreenBrightnessLevel()
	 * @see #getScreenBrightnessLevel()
	 * @generated
	 */
	void setScreenBrightnessLevel(int value);

	/**
	 * Unsets the value of the '{@link org.carim.model.DeviceContext#getScreenBrightnessLevel <em>Screen Brightness Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetScreenBrightnessLevel()
	 * @see #getScreenBrightnessLevel()
	 * @see #setScreenBrightnessLevel(int)
	 * @generated
	 */
	void unsetScreenBrightnessLevel();

	/**
	 * Returns whether the value of the '{@link org.carim.model.DeviceContext#getScreenBrightnessLevel <em>Screen Brightness Level</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Screen Brightness Level</em>' attribute is set.
	 * @see #unsetScreenBrightnessLevel()
	 * @see #getScreenBrightnessLevel()
	 * @see #setScreenBrightnessLevel(int)
	 * @generated
	 */
	boolean isSetScreenBrightnessLevel();

	/**
	 * Returns the value of the '<em><b>Volume Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volume Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volume Level</em>' attribute.
	 * @see #isSetVolumeLevel()
	 * @see #unsetVolumeLevel()
	 * @see #setVolumeLevel(int)
	 * @see org.carim.model.carimModelPackage#getDeviceContext_VolumeLevel()
	 * @model unsettable="true" dataType="org.carim.model.PercentageT" required="true"
	 *        extendedMetaData="kind='element' name='volumeLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	int getVolumeLevel();

	/**
	 * Sets the value of the '{@link org.carim.model.DeviceContext#getVolumeLevel <em>Volume Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume Level</em>' attribute.
	 * @see #isSetVolumeLevel()
	 * @see #unsetVolumeLevel()
	 * @see #getVolumeLevel()
	 * @generated
	 */
	void setVolumeLevel(int value);

	/**
	 * Unsets the value of the '{@link org.carim.model.DeviceContext#getVolumeLevel <em>Volume Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVolumeLevel()
	 * @see #getVolumeLevel()
	 * @see #setVolumeLevel(int)
	 * @generated
	 */
	void unsetVolumeLevel();

	/**
	 * Returns whether the value of the '{@link org.carim.model.DeviceContext#getVolumeLevel <em>Volume Level</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Volume Level</em>' attribute is set.
	 * @see #unsetVolumeLevel()
	 * @see #getVolumeLevel()
	 * @see #setVolumeLevel(int)
	 * @generated
	 */
	boolean isSetVolumeLevel();

	/**
	 * Returns the value of the '<em><b>Memory Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory Usage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Usage</em>' attribute.
	 * @see #isSetMemoryUsage()
	 * @see #unsetMemoryUsage()
	 * @see #setMemoryUsage(int)
	 * @see org.carim.model.carimModelPackage#getDeviceContext_MemoryUsage()
	 * @model unsettable="true" dataType="org.carim.model.PercentageT" required="true"
	 *        extendedMetaData="kind='element' name='memoryUsage' namespace='##targetNamespace'"
	 * @generated
	 */
	int getMemoryUsage();

	/**
	 * Sets the value of the '{@link org.carim.model.DeviceContext#getMemoryUsage <em>Memory Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Usage</em>' attribute.
	 * @see #isSetMemoryUsage()
	 * @see #unsetMemoryUsage()
	 * @see #getMemoryUsage()
	 * @generated
	 */
	void setMemoryUsage(int value);

	/**
	 * Unsets the value of the '{@link org.carim.model.DeviceContext#getMemoryUsage <em>Memory Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMemoryUsage()
	 * @see #getMemoryUsage()
	 * @see #setMemoryUsage(int)
	 * @generated
	 */
	void unsetMemoryUsage();

	/**
	 * Returns whether the value of the '{@link org.carim.model.DeviceContext#getMemoryUsage <em>Memory Usage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Memory Usage</em>' attribute is set.
	 * @see #unsetMemoryUsage()
	 * @see #getMemoryUsage()
	 * @see #setMemoryUsage(int)
	 * @generated
	 */
	boolean isSetMemoryUsage();

	/**
	 * Returns the value of the '<em><b>Cpu Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cpu Usage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpu Usage</em>' attribute.
	 * @see #isSetCpuUsage()
	 * @see #unsetCpuUsage()
	 * @see #setCpuUsage(int)
	 * @see org.carim.model.carimModelPackage#getDeviceContext_CpuUsage()
	 * @model unsettable="true" dataType="org.carim.model.PercentageT" required="true"
	 *        extendedMetaData="kind='element' name='cpuUsage' namespace='##targetNamespace'"
	 * @generated
	 */
	int getCpuUsage();

	/**
	 * Sets the value of the '{@link org.carim.model.DeviceContext#getCpuUsage <em>Cpu Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpu Usage</em>' attribute.
	 * @see #isSetCpuUsage()
	 * @see #unsetCpuUsage()
	 * @see #getCpuUsage()
	 * @generated
	 */
	void setCpuUsage(int value);

	/**
	 * Unsets the value of the '{@link org.carim.model.DeviceContext#getCpuUsage <em>Cpu Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCpuUsage()
	 * @see #getCpuUsage()
	 * @see #setCpuUsage(int)
	 * @generated
	 */
	void unsetCpuUsage();

	/**
	 * Returns whether the value of the '{@link org.carim.model.DeviceContext#getCpuUsage <em>Cpu Usage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cpu Usage</em>' attribute is set.
	 * @see #unsetCpuUsage()
	 * @see #getCpuUsage()
	 * @see #setCpuUsage(int)
	 * @generated
	 */
	boolean isSetCpuUsage();

} // DeviceContext
