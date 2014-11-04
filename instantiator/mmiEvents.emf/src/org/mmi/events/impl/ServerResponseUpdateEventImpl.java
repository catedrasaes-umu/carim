/**
 */
package org.mmi.events.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.mmi.events.EventsPackage;
import org.mmi.events.ServerResponseUpdateEvent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Server Response Update Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mmi.events.impl.ServerResponseUpdateEventImpl#getRtt <em>Rtt</em>}</li>
 *   <li>{@link org.mmi.events.impl.ServerResponseUpdateEventImpl#getSrt <em>Srt</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServerResponseUpdateEventImpl extends CommunicationContextEventImpl implements ServerResponseUpdateEvent {
	/**
	 * The default value of the '{@link #getRtt() <em>Rtt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtt()
	 * @generated
	 * @ordered
	 */
	protected static final int RTT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRtt() <em>Rtt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtt()
	 * @generated
	 * @ordered
	 */
	protected int rtt = RTT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSrt() <em>Srt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrt()
	 * @generated
	 * @ordered
	 */
	protected static final int SRT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSrt() <em>Srt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrt()
	 * @generated
	 * @ordered
	 */
	protected int srt = SRT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServerResponseUpdateEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EventsPackage.Literals.SERVER_RESPONSE_UPDATE_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRtt() {
		return rtt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRtt(int newRtt) {
		int oldRtt = rtt;
		rtt = newRtt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.SERVER_RESPONSE_UPDATE_EVENT__RTT, oldRtt, rtt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSrt() {
		return srt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrt(int newSrt) {
		int oldSrt = srt;
		srt = newSrt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.SERVER_RESPONSE_UPDATE_EVENT__SRT, oldSrt, srt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EventsPackage.SERVER_RESPONSE_UPDATE_EVENT__RTT:
				return getRtt();
			case EventsPackage.SERVER_RESPONSE_UPDATE_EVENT__SRT:
				return getSrt();
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
			case EventsPackage.SERVER_RESPONSE_UPDATE_EVENT__RTT:
				setRtt((Integer)newValue);
				return;
			case EventsPackage.SERVER_RESPONSE_UPDATE_EVENT__SRT:
				setSrt((Integer)newValue);
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
			case EventsPackage.SERVER_RESPONSE_UPDATE_EVENT__RTT:
				setRtt(RTT_EDEFAULT);
				return;
			case EventsPackage.SERVER_RESPONSE_UPDATE_EVENT__SRT:
				setSrt(SRT_EDEFAULT);
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
			case EventsPackage.SERVER_RESPONSE_UPDATE_EVENT__RTT:
				return rtt != RTT_EDEFAULT;
			case EventsPackage.SERVER_RESPONSE_UPDATE_EVENT__SRT:
				return srt != SRT_EDEFAULT;
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
		result.append(" (rtt: ");
		result.append(rtt);
		result.append(", srt: ");
		result.append(srt);
		result.append(')');
		return result.toString();
	}

} //ServerResponseUpdateEventImpl
