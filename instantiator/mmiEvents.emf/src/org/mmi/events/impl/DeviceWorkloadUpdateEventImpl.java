/**
 */
package org.mmi.events.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.mmi.events.DeviceWorkloadUpdateEvent;
import org.mmi.events.EventsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Workload Update Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mmi.events.impl.DeviceWorkloadUpdateEventImpl#getMemoryUsage <em>Memory Usage</em>}</li>
 *   <li>{@link org.mmi.events.impl.DeviceWorkloadUpdateEventImpl#getCpuUsage <em>Cpu Usage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeviceWorkloadUpdateEventImpl extends DeviceContextEventImpl implements DeviceWorkloadUpdateEvent {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceWorkloadUpdateEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EventsPackage.Literals.DEVICE_WORKLOAD_UPDATE_EVENT;
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.DEVICE_WORKLOAD_UPDATE_EVENT__MEMORY_USAGE, oldMemoryUsage, memoryUsage));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.DEVICE_WORKLOAD_UPDATE_EVENT__CPU_USAGE, oldCpuUsage, cpuUsage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EventsPackage.DEVICE_WORKLOAD_UPDATE_EVENT__MEMORY_USAGE:
				return getMemoryUsage();
			case EventsPackage.DEVICE_WORKLOAD_UPDATE_EVENT__CPU_USAGE:
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
			case EventsPackage.DEVICE_WORKLOAD_UPDATE_EVENT__MEMORY_USAGE:
				setMemoryUsage((Integer)newValue);
				return;
			case EventsPackage.DEVICE_WORKLOAD_UPDATE_EVENT__CPU_USAGE:
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
			case EventsPackage.DEVICE_WORKLOAD_UPDATE_EVENT__MEMORY_USAGE:
				setMemoryUsage(MEMORY_USAGE_EDEFAULT);
				return;
			case EventsPackage.DEVICE_WORKLOAD_UPDATE_EVENT__CPU_USAGE:
				setCpuUsage(CPU_USAGE_EDEFAULT);
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
			case EventsPackage.DEVICE_WORKLOAD_UPDATE_EVENT__MEMORY_USAGE:
				return memoryUsage != MEMORY_USAGE_EDEFAULT;
			case EventsPackage.DEVICE_WORKLOAD_UPDATE_EVENT__CPU_USAGE:
				return cpuUsage != CPU_USAGE_EDEFAULT;
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
		result.append(" (memoryUsage: ");
		result.append(memoryUsage);
		result.append(", cpuUsage: ");
		result.append(cpuUsage);
		result.append(')');
		return result.toString();
	}

} //DeviceWorkloadUpdateEventImpl
