/**
 */
package org.mmi.events.impl;

import org.carim.model.WirelessAccessTypeT;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.mmi.events.EventsPackage;
import org.mmi.events.SignalUpdateEvent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signal Update Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mmi.events.impl.SignalUpdateEventImpl#getWirelessAccessType <em>Wireless Access Type</em>}</li>
 *   <li>{@link org.mmi.events.impl.SignalUpdateEventImpl#getAccessPointName <em>Access Point Name</em>}</li>
 *   <li>{@link org.mmi.events.impl.SignalUpdateEventImpl#getSignalStrength <em>Signal Strength</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SignalUpdateEventImpl extends CommunicationContextEventImpl implements SignalUpdateEvent {
	/**
	 * The default value of the '{@link #getWirelessAccessType() <em>Wireless Access Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWirelessAccessType()
	 * @generated
	 * @ordered
	 */
	protected static final WirelessAccessTypeT WIRELESS_ACCESS_TYPE_EDEFAULT = WirelessAccessTypeT.NOACCESS;

	/**
	 * The cached value of the '{@link #getWirelessAccessType() <em>Wireless Access Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWirelessAccessType()
	 * @generated
	 * @ordered
	 */
	protected WirelessAccessTypeT wirelessAccessType = WIRELESS_ACCESS_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccessPointName() <em>Access Point Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessPointName()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESS_POINT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessPointName() <em>Access Point Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessPointName()
	 * @generated
	 * @ordered
	 */
	protected String accessPointName = ACCESS_POINT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSignalStrength() <em>Signal Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalStrength()
	 * @generated
	 * @ordered
	 */
	protected static final int SIGNAL_STRENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSignalStrength() <em>Signal Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalStrength()
	 * @generated
	 * @ordered
	 */
	protected int signalStrength = SIGNAL_STRENGTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignalUpdateEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EventsPackage.Literals.SIGNAL_UPDATE_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WirelessAccessTypeT getWirelessAccessType() {
		return wirelessAccessType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWirelessAccessType(WirelessAccessTypeT newWirelessAccessType) {
		WirelessAccessTypeT oldWirelessAccessType = wirelessAccessType;
		wirelessAccessType = newWirelessAccessType == null ? WIRELESS_ACCESS_TYPE_EDEFAULT : newWirelessAccessType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.SIGNAL_UPDATE_EVENT__WIRELESS_ACCESS_TYPE, oldWirelessAccessType, wirelessAccessType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccessPointName() {
		return accessPointName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessPointName(String newAccessPointName) {
		String oldAccessPointName = accessPointName;
		accessPointName = newAccessPointName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.SIGNAL_UPDATE_EVENT__ACCESS_POINT_NAME, oldAccessPointName, accessPointName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSignalStrength() {
		return signalStrength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignalStrength(int newSignalStrength) {
		int oldSignalStrength = signalStrength;
		signalStrength = newSignalStrength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.SIGNAL_UPDATE_EVENT__SIGNAL_STRENGTH, oldSignalStrength, signalStrength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EventsPackage.SIGNAL_UPDATE_EVENT__WIRELESS_ACCESS_TYPE:
				return getWirelessAccessType();
			case EventsPackage.SIGNAL_UPDATE_EVENT__ACCESS_POINT_NAME:
				return getAccessPointName();
			case EventsPackage.SIGNAL_UPDATE_EVENT__SIGNAL_STRENGTH:
				return getSignalStrength();
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
			case EventsPackage.SIGNAL_UPDATE_EVENT__WIRELESS_ACCESS_TYPE:
				setWirelessAccessType((WirelessAccessTypeT)newValue);
				return;
			case EventsPackage.SIGNAL_UPDATE_EVENT__ACCESS_POINT_NAME:
				setAccessPointName((String)newValue);
				return;
			case EventsPackage.SIGNAL_UPDATE_EVENT__SIGNAL_STRENGTH:
				setSignalStrength((Integer)newValue);
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
			case EventsPackage.SIGNAL_UPDATE_EVENT__WIRELESS_ACCESS_TYPE:
				setWirelessAccessType(WIRELESS_ACCESS_TYPE_EDEFAULT);
				return;
			case EventsPackage.SIGNAL_UPDATE_EVENT__ACCESS_POINT_NAME:
				setAccessPointName(ACCESS_POINT_NAME_EDEFAULT);
				return;
			case EventsPackage.SIGNAL_UPDATE_EVENT__SIGNAL_STRENGTH:
				setSignalStrength(SIGNAL_STRENGTH_EDEFAULT);
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
			case EventsPackage.SIGNAL_UPDATE_EVENT__WIRELESS_ACCESS_TYPE:
				return wirelessAccessType != WIRELESS_ACCESS_TYPE_EDEFAULT;
			case EventsPackage.SIGNAL_UPDATE_EVENT__ACCESS_POINT_NAME:
				return ACCESS_POINT_NAME_EDEFAULT == null ? accessPointName != null : !ACCESS_POINT_NAME_EDEFAULT.equals(accessPointName);
			case EventsPackage.SIGNAL_UPDATE_EVENT__SIGNAL_STRENGTH:
				return signalStrength != SIGNAL_STRENGTH_EDEFAULT;
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
		result.append(" (wirelessAccessType: ");
		result.append(wirelessAccessType);
		result.append(", accessPointName: ");
		result.append(accessPointName);
		result.append(", signalStrength: ");
		result.append(signalStrength);
		result.append(')');
		return result.toString();
	}

} //SignalUpdateEventImpl
