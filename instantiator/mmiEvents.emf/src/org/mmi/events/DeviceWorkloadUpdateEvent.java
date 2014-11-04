/**
 */
package org.mmi.events;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Workload Update Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mmi.events.DeviceWorkloadUpdateEvent#getMemoryUsage <em>Memory Usage</em>}</li>
 *   <li>{@link org.mmi.events.DeviceWorkloadUpdateEvent#getCpuUsage <em>Cpu Usage</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mmi.events.EventsPackage#getDeviceWorkloadUpdateEvent()
 * @model
 * @generated
 */
public interface DeviceWorkloadUpdateEvent extends DeviceContextEvent {
	/**
	 * Returns the value of the '<em><b>Memory Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory Usage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Usage</em>' attribute.
	 * @see #setMemoryUsage(int)
	 * @see org.mmi.events.EventsPackage#getDeviceWorkloadUpdateEvent_MemoryUsage()
	 * @model dataType="org.carim.model.PercentageT"
	 * @generated
	 */
	int getMemoryUsage();

	/**
	 * Sets the value of the '{@link org.mmi.events.DeviceWorkloadUpdateEvent#getMemoryUsage <em>Memory Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Usage</em>' attribute.
	 * @see #getMemoryUsage()
	 * @generated
	 */
	void setMemoryUsage(int value);

	/**
	 * Returns the value of the '<em><b>Cpu Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cpu Usage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpu Usage</em>' attribute.
	 * @see #setCpuUsage(int)
	 * @see org.mmi.events.EventsPackage#getDeviceWorkloadUpdateEvent_CpuUsage()
	 * @model dataType="org.carim.model.PercentageT"
	 * @generated
	 */
	int getCpuUsage();

	/**
	 * Sets the value of the '{@link org.mmi.events.DeviceWorkloadUpdateEvent#getCpuUsage <em>Cpu Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpu Usage</em>' attribute.
	 * @see #getCpuUsage()
	 * @generated
	 */
	void setCpuUsage(int value);

} // DeviceWorkloadUpdateEvent
