/**
 */
package org.mmi.events;

import org.carim.model.DeviceTypeT;
import org.carim.model.ScreenResolutionT;
import org.carim.model.ScreenSizeT;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Features Update Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mmi.events.DeviceFeaturesUpdateEvent#getDeviceType <em>Device Type</em>}</li>
 *   <li>{@link org.mmi.events.DeviceFeaturesUpdateEvent#getScreenSize <em>Screen Size</em>}</li>
 *   <li>{@link org.mmi.events.DeviceFeaturesUpdateEvent#getScreenResolution <em>Screen Resolution</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mmi.events.EventsPackage#getDeviceFeaturesUpdateEvent()
 * @model
 * @generated
 */
public interface DeviceFeaturesUpdateEvent extends DeviceContextEvent {
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
	 * @see #setDeviceType(DeviceTypeT)
	 * @see org.mmi.events.EventsPackage#getDeviceFeaturesUpdateEvent_DeviceType()
	 * @model
	 * @generated
	 */
	DeviceTypeT getDeviceType();

	/**
	 * Sets the value of the '{@link org.mmi.events.DeviceFeaturesUpdateEvent#getDeviceType <em>Device Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Type</em>' attribute.
	 * @see org.carim.model.DeviceTypeT
	 * @see #getDeviceType()
	 * @generated
	 */
	void setDeviceType(DeviceTypeT value);

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
	 * @see #setScreenSize(ScreenSizeT)
	 * @see org.mmi.events.EventsPackage#getDeviceFeaturesUpdateEvent_ScreenSize()
	 * @model
	 * @generated
	 */
	ScreenSizeT getScreenSize();

	/**
	 * Sets the value of the '{@link org.mmi.events.DeviceFeaturesUpdateEvent#getScreenSize <em>Screen Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Screen Size</em>' attribute.
	 * @see org.carim.model.ScreenSizeT
	 * @see #getScreenSize()
	 * @generated
	 */
	void setScreenSize(ScreenSizeT value);

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
	 * @see #setScreenResolution(ScreenResolutionT)
	 * @see org.mmi.events.EventsPackage#getDeviceFeaturesUpdateEvent_ScreenResolution()
	 * @model
	 * @generated
	 */
	ScreenResolutionT getScreenResolution();

	/**
	 * Sets the value of the '{@link org.mmi.events.DeviceFeaturesUpdateEvent#getScreenResolution <em>Screen Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Screen Resolution</em>' attribute.
	 * @see org.carim.model.ScreenResolutionT
	 * @see #getScreenResolution()
	 * @generated
	 */
	void setScreenResolution(ScreenResolutionT value);

} // DeviceFeaturesUpdateEvent
