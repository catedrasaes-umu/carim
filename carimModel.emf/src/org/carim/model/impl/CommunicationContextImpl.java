/**
 */
package org.carim.model.impl;

import org.carim.model.CommunicationContext;
import org.carim.model.WirelessAccessTypeT;
import org.carim.model.carimModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.carim.model.impl.CommunicationContextImpl#getWirelessAccessType <em>Wireless Access Type</em>}</li>
 *   <li>{@link org.carim.model.impl.CommunicationContextImpl#getAccessPointName <em>Access Point Name</em>}</li>
 *   <li>{@link org.carim.model.impl.CommunicationContextImpl#getSignalStrength <em>Signal Strength</em>}</li>
 *   <li>{@link org.carim.model.impl.CommunicationContextImpl#getReceivedDataThroughput <em>Received Data Throughput</em>}</li>
 *   <li>{@link org.carim.model.impl.CommunicationContextImpl#getSentDataThroughput <em>Sent Data Throughput</em>}</li>
 *   <li>{@link org.carim.model.impl.CommunicationContextImpl#getRtt <em>Rtt</em>}</li>
 *   <li>{@link org.carim.model.impl.CommunicationContextImpl#getSrt <em>Srt</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommunicationContextImpl extends EObjectImpl implements CommunicationContext {
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
	 * This is true if the Wireless Access Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean wirelessAccessTypeESet;

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
	 * This is true if the Signal Strength attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean signalStrengthESet;

	/**
	 * The default value of the '{@link #getReceivedDataThroughput() <em>Received Data Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivedDataThroughput()
	 * @generated
	 * @ordered
	 */
	protected static final double RECEIVED_DATA_THROUGHPUT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getReceivedDataThroughput() <em>Received Data Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivedDataThroughput()
	 * @generated
	 * @ordered
	 */
	protected double receivedDataThroughput = RECEIVED_DATA_THROUGHPUT_EDEFAULT;

	/**
	 * This is true if the Received Data Throughput attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean receivedDataThroughputESet;

	/**
	 * The default value of the '{@link #getSentDataThroughput() <em>Sent Data Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSentDataThroughput()
	 * @generated
	 * @ordered
	 */
	protected static final double SENT_DATA_THROUGHPUT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSentDataThroughput() <em>Sent Data Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSentDataThroughput()
	 * @generated
	 * @ordered
	 */
	protected double sentDataThroughput = SENT_DATA_THROUGHPUT_EDEFAULT;

	/**
	 * This is true if the Sent Data Throughput attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sentDataThroughputESet;

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
	 * This is true if the Rtt attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rttESet;

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
	 * This is true if the Srt attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean srtESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return carimModelPackage.Literals.COMMUNICATION_CONTEXT;
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
		boolean oldWirelessAccessTypeESet = wirelessAccessTypeESet;
		wirelessAccessTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.COMMUNICATION_CONTEXT__WIRELESS_ACCESS_TYPE, oldWirelessAccessType, wirelessAccessType, !oldWirelessAccessTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWirelessAccessType() {
		WirelessAccessTypeT oldWirelessAccessType = wirelessAccessType;
		boolean oldWirelessAccessTypeESet = wirelessAccessTypeESet;
		wirelessAccessType = WIRELESS_ACCESS_TYPE_EDEFAULT;
		wirelessAccessTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, carimModelPackage.COMMUNICATION_CONTEXT__WIRELESS_ACCESS_TYPE, oldWirelessAccessType, WIRELESS_ACCESS_TYPE_EDEFAULT, oldWirelessAccessTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWirelessAccessType() {
		return wirelessAccessTypeESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.COMMUNICATION_CONTEXT__ACCESS_POINT_NAME, oldAccessPointName, accessPointName));
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
		boolean oldSignalStrengthESet = signalStrengthESet;
		signalStrengthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.COMMUNICATION_CONTEXT__SIGNAL_STRENGTH, oldSignalStrength, signalStrength, !oldSignalStrengthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSignalStrength() {
		int oldSignalStrength = signalStrength;
		boolean oldSignalStrengthESet = signalStrengthESet;
		signalStrength = SIGNAL_STRENGTH_EDEFAULT;
		signalStrengthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, carimModelPackage.COMMUNICATION_CONTEXT__SIGNAL_STRENGTH, oldSignalStrength, SIGNAL_STRENGTH_EDEFAULT, oldSignalStrengthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSignalStrength() {
		return signalStrengthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getReceivedDataThroughput() {
		return receivedDataThroughput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceivedDataThroughput(double newReceivedDataThroughput) {
		double oldReceivedDataThroughput = receivedDataThroughput;
		receivedDataThroughput = newReceivedDataThroughput;
		boolean oldReceivedDataThroughputESet = receivedDataThroughputESet;
		receivedDataThroughputESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.COMMUNICATION_CONTEXT__RECEIVED_DATA_THROUGHPUT, oldReceivedDataThroughput, receivedDataThroughput, !oldReceivedDataThroughputESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReceivedDataThroughput() {
		double oldReceivedDataThroughput = receivedDataThroughput;
		boolean oldReceivedDataThroughputESet = receivedDataThroughputESet;
		receivedDataThroughput = RECEIVED_DATA_THROUGHPUT_EDEFAULT;
		receivedDataThroughputESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, carimModelPackage.COMMUNICATION_CONTEXT__RECEIVED_DATA_THROUGHPUT, oldReceivedDataThroughput, RECEIVED_DATA_THROUGHPUT_EDEFAULT, oldReceivedDataThroughputESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReceivedDataThroughput() {
		return receivedDataThroughputESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSentDataThroughput() {
		return sentDataThroughput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSentDataThroughput(double newSentDataThroughput) {
		double oldSentDataThroughput = sentDataThroughput;
		sentDataThroughput = newSentDataThroughput;
		boolean oldSentDataThroughputESet = sentDataThroughputESet;
		sentDataThroughputESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.COMMUNICATION_CONTEXT__SENT_DATA_THROUGHPUT, oldSentDataThroughput, sentDataThroughput, !oldSentDataThroughputESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSentDataThroughput() {
		double oldSentDataThroughput = sentDataThroughput;
		boolean oldSentDataThroughputESet = sentDataThroughputESet;
		sentDataThroughput = SENT_DATA_THROUGHPUT_EDEFAULT;
		sentDataThroughputESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, carimModelPackage.COMMUNICATION_CONTEXT__SENT_DATA_THROUGHPUT, oldSentDataThroughput, SENT_DATA_THROUGHPUT_EDEFAULT, oldSentDataThroughputESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSentDataThroughput() {
		return sentDataThroughputESet;
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
		boolean oldRttESet = rttESet;
		rttESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.COMMUNICATION_CONTEXT__RTT, oldRtt, rtt, !oldRttESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRtt() {
		int oldRtt = rtt;
		boolean oldRttESet = rttESet;
		rtt = RTT_EDEFAULT;
		rttESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, carimModelPackage.COMMUNICATION_CONTEXT__RTT, oldRtt, RTT_EDEFAULT, oldRttESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRtt() {
		return rttESet;
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
		boolean oldSrtESet = srtESet;
		srtESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.COMMUNICATION_CONTEXT__SRT, oldSrt, srt, !oldSrtESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSrt() {
		int oldSrt = srt;
		boolean oldSrtESet = srtESet;
		srt = SRT_EDEFAULT;
		srtESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, carimModelPackage.COMMUNICATION_CONTEXT__SRT, oldSrt, SRT_EDEFAULT, oldSrtESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSrt() {
		return srtESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case carimModelPackage.COMMUNICATION_CONTEXT__WIRELESS_ACCESS_TYPE:
				return getWirelessAccessType();
			case carimModelPackage.COMMUNICATION_CONTEXT__ACCESS_POINT_NAME:
				return getAccessPointName();
			case carimModelPackage.COMMUNICATION_CONTEXT__SIGNAL_STRENGTH:
				return getSignalStrength();
			case carimModelPackage.COMMUNICATION_CONTEXT__RECEIVED_DATA_THROUGHPUT:
				return getReceivedDataThroughput();
			case carimModelPackage.COMMUNICATION_CONTEXT__SENT_DATA_THROUGHPUT:
				return getSentDataThroughput();
			case carimModelPackage.COMMUNICATION_CONTEXT__RTT:
				return getRtt();
			case carimModelPackage.COMMUNICATION_CONTEXT__SRT:
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
			case carimModelPackage.COMMUNICATION_CONTEXT__WIRELESS_ACCESS_TYPE:
				setWirelessAccessType((WirelessAccessTypeT)newValue);
				return;
			case carimModelPackage.COMMUNICATION_CONTEXT__ACCESS_POINT_NAME:
				setAccessPointName((String)newValue);
				return;
			case carimModelPackage.COMMUNICATION_CONTEXT__SIGNAL_STRENGTH:
				setSignalStrength((Integer)newValue);
				return;
			case carimModelPackage.COMMUNICATION_CONTEXT__RECEIVED_DATA_THROUGHPUT:
				setReceivedDataThroughput((Double)newValue);
				return;
			case carimModelPackage.COMMUNICATION_CONTEXT__SENT_DATA_THROUGHPUT:
				setSentDataThroughput((Double)newValue);
				return;
			case carimModelPackage.COMMUNICATION_CONTEXT__RTT:
				setRtt((Integer)newValue);
				return;
			case carimModelPackage.COMMUNICATION_CONTEXT__SRT:
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
			case carimModelPackage.COMMUNICATION_CONTEXT__WIRELESS_ACCESS_TYPE:
				unsetWirelessAccessType();
				return;
			case carimModelPackage.COMMUNICATION_CONTEXT__ACCESS_POINT_NAME:
				setAccessPointName(ACCESS_POINT_NAME_EDEFAULT);
				return;
			case carimModelPackage.COMMUNICATION_CONTEXT__SIGNAL_STRENGTH:
				unsetSignalStrength();
				return;
			case carimModelPackage.COMMUNICATION_CONTEXT__RECEIVED_DATA_THROUGHPUT:
				unsetReceivedDataThroughput();
				return;
			case carimModelPackage.COMMUNICATION_CONTEXT__SENT_DATA_THROUGHPUT:
				unsetSentDataThroughput();
				return;
			case carimModelPackage.COMMUNICATION_CONTEXT__RTT:
				unsetRtt();
				return;
			case carimModelPackage.COMMUNICATION_CONTEXT__SRT:
				unsetSrt();
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
			case carimModelPackage.COMMUNICATION_CONTEXT__WIRELESS_ACCESS_TYPE:
				return isSetWirelessAccessType();
			case carimModelPackage.COMMUNICATION_CONTEXT__ACCESS_POINT_NAME:
				return ACCESS_POINT_NAME_EDEFAULT == null ? accessPointName != null : !ACCESS_POINT_NAME_EDEFAULT.equals(accessPointName);
			case carimModelPackage.COMMUNICATION_CONTEXT__SIGNAL_STRENGTH:
				return isSetSignalStrength();
			case carimModelPackage.COMMUNICATION_CONTEXT__RECEIVED_DATA_THROUGHPUT:
				return isSetReceivedDataThroughput();
			case carimModelPackage.COMMUNICATION_CONTEXT__SENT_DATA_THROUGHPUT:
				return isSetSentDataThroughput();
			case carimModelPackage.COMMUNICATION_CONTEXT__RTT:
				return isSetRtt();
			case carimModelPackage.COMMUNICATION_CONTEXT__SRT:
				return isSetSrt();
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
		if (wirelessAccessTypeESet) result.append(wirelessAccessType); else result.append("<unset>");
		result.append(", accessPointName: ");
		result.append(accessPointName);
		result.append(", signalStrength: ");
		if (signalStrengthESet) result.append(signalStrength); else result.append("<unset>");
		result.append(", receivedDataThroughput: ");
		if (receivedDataThroughputESet) result.append(receivedDataThroughput); else result.append("<unset>");
		result.append(", sentDataThroughput: ");
		if (sentDataThroughputESet) result.append(sentDataThroughput); else result.append("<unset>");
		result.append(", rtt: ");
		if (rttESet) result.append(rtt); else result.append("<unset>");
		result.append(", srt: ");
		if (srtESet) result.append(srt); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CommunicationContextImpl
