/**
 */
package org.mmi.events.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.mmi.events.EventsPackage;
import org.mmi.events.ThroughputUpdateEvent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Throughput Update Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mmi.events.impl.ThroughputUpdateEventImpl#getReceivedData <em>Received Data</em>}</li>
 *   <li>{@link org.mmi.events.impl.ThroughputUpdateEventImpl#getSentData <em>Sent Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ThroughputUpdateEventImpl extends CommunicationContextEventImpl implements ThroughputUpdateEvent {
	/**
	 * The default value of the '{@link #getReceivedData() <em>Received Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivedData()
	 * @generated
	 * @ordered
	 */
	protected static final int RECEIVED_DATA_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getReceivedData() <em>Received Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivedData()
	 * @generated
	 * @ordered
	 */
	protected int receivedData = RECEIVED_DATA_EDEFAULT;

	/**
	 * The default value of the '{@link #getSentData() <em>Sent Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSentData()
	 * @generated
	 * @ordered
	 */
	protected static final int SENT_DATA_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSentData() <em>Sent Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSentData()
	 * @generated
	 * @ordered
	 */
	protected int sentData = SENT_DATA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThroughputUpdateEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EventsPackage.Literals.THROUGHPUT_UPDATE_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getReceivedData() {
		return receivedData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceivedData(int newReceivedData) {
		int oldReceivedData = receivedData;
		receivedData = newReceivedData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.THROUGHPUT_UPDATE_EVENT__RECEIVED_DATA, oldReceivedData, receivedData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSentData() {
		return sentData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSentData(int newSentData) {
		int oldSentData = sentData;
		sentData = newSentData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.THROUGHPUT_UPDATE_EVENT__SENT_DATA, oldSentData, sentData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EventsPackage.THROUGHPUT_UPDATE_EVENT__RECEIVED_DATA:
				return getReceivedData();
			case EventsPackage.THROUGHPUT_UPDATE_EVENT__SENT_DATA:
				return getSentData();
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
			case EventsPackage.THROUGHPUT_UPDATE_EVENT__RECEIVED_DATA:
				setReceivedData((Integer)newValue);
				return;
			case EventsPackage.THROUGHPUT_UPDATE_EVENT__SENT_DATA:
				setSentData((Integer)newValue);
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
			case EventsPackage.THROUGHPUT_UPDATE_EVENT__RECEIVED_DATA:
				setReceivedData(RECEIVED_DATA_EDEFAULT);
				return;
			case EventsPackage.THROUGHPUT_UPDATE_EVENT__SENT_DATA:
				setSentData(SENT_DATA_EDEFAULT);
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
			case EventsPackage.THROUGHPUT_UPDATE_EVENT__RECEIVED_DATA:
				return receivedData != RECEIVED_DATA_EDEFAULT;
			case EventsPackage.THROUGHPUT_UPDATE_EVENT__SENT_DATA:
				return sentData != SENT_DATA_EDEFAULT;
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
		result.append(" (receivedData: ");
		result.append(receivedData);
		result.append(", sentData: ");
		result.append(sentData);
		result.append(')');
		return result.toString();
	}

} //ThroughputUpdateEventImpl
