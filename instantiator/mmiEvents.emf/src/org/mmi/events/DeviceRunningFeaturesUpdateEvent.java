/**
 */
package org.mmi.events;

import org.carim.model.ScreenOrientationT;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Running Features Update Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mmi.events.DeviceRunningFeaturesUpdateEvent#getScreenOrientation <em>Screen Orientation</em>}</li>
 *   <li>{@link org.mmi.events.DeviceRunningFeaturesUpdateEvent#getBrightness <em>Brightness</em>}</li>
 *   <li>{@link org.mmi.events.DeviceRunningFeaturesUpdateEvent#getVolume <em>Volume</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mmi.events.EventsPackage#getDeviceRunningFeaturesUpdateEvent()
 * @model
 * @generated
 */
public interface DeviceRunningFeaturesUpdateEvent extends DeviceContextEvent {
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
	 * @see #setScreenOrientation(ScreenOrientationT)
	 * @see org.mmi.events.EventsPackage#getDeviceRunningFeaturesUpdateEvent_ScreenOrientation()
	 * @model
	 * @generated
	 */
	ScreenOrientationT getScreenOrientation();

	/**
	 * Sets the value of the '{@link org.mmi.events.DeviceRunningFeaturesUpdateEvent#getScreenOrientation <em>Screen Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Screen Orientation</em>' attribute.
	 * @see org.carim.model.ScreenOrientationT
	 * @see #getScreenOrientation()
	 * @generated
	 */
	void setScreenOrientation(ScreenOrientationT value);

	/**
	 * Returns the value of the '<em><b>Brightness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Brightness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Brightness</em>' attribute.
	 * @see #setBrightness(int)
	 * @see org.mmi.events.EventsPackage#getDeviceRunningFeaturesUpdateEvent_Brightness()
	 * @model dataType="org.carim.model.PercentageT"
	 * @generated
	 */
	int getBrightness();

	/**
	 * Sets the value of the '{@link org.mmi.events.DeviceRunningFeaturesUpdateEvent#getBrightness <em>Brightness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Brightness</em>' attribute.
	 * @see #getBrightness()
	 * @generated
	 */
	void setBrightness(int value);

	/**
	 * Returns the value of the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volume</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volume</em>' attribute.
	 * @see #setVolume(int)
	 * @see org.mmi.events.EventsPackage#getDeviceRunningFeaturesUpdateEvent_Volume()
	 * @model dataType="org.carim.model.PercentageT"
	 * @generated
	 */
	int getVolume();

	/**
	 * Sets the value of the '{@link org.mmi.events.DeviceRunningFeaturesUpdateEvent#getVolume <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume</em>' attribute.
	 * @see #getVolume()
	 * @generated
	 */
	void setVolume(int value);

} // DeviceRunningFeaturesUpdateEvent
