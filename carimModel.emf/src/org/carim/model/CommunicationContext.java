/**
 */
package org.carim.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.carim.model.CommunicationContext#getWirelessAccessType <em>Wireless Access Type</em>}</li>
 *   <li>{@link org.carim.model.CommunicationContext#getAccessPointName <em>Access Point Name</em>}</li>
 *   <li>{@link org.carim.model.CommunicationContext#getSignalStrength <em>Signal Strength</em>}</li>
 *   <li>{@link org.carim.model.CommunicationContext#getReceivedDataThroughput <em>Received Data Throughput</em>}</li>
 *   <li>{@link org.carim.model.CommunicationContext#getSentDataThroughput <em>Sent Data Throughput</em>}</li>
 *   <li>{@link org.carim.model.CommunicationContext#getRtt <em>Rtt</em>}</li>
 *   <li>{@link org.carim.model.CommunicationContext#getSrt <em>Srt</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.carim.model.carimModelPackage#getCommunicationContext()
 * @model extendedMetaData="name='CommunicationContext' kind='elementOnly'"
 * @generated
 */
public interface CommunicationContext extends EObject {
	/**
	 * Returns the value of the '<em><b>Wireless Access Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.carim.model.WirelessAccessTypeT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wireless Access Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wireless Access Type</em>' attribute.
	 * @see org.carim.model.WirelessAccessTypeT
	 * @see #isSetWirelessAccessType()
	 * @see #unsetWirelessAccessType()
	 * @see #setWirelessAccessType(WirelessAccessTypeT)
	 * @see org.carim.model.carimModelPackage#getCommunicationContext_WirelessAccessType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='wirelessAccessType' namespace='##targetNamespace'"
	 * @generated
	 */
	WirelessAccessTypeT getWirelessAccessType();

	/**
	 * Sets the value of the '{@link org.carim.model.CommunicationContext#getWirelessAccessType <em>Wireless Access Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wireless Access Type</em>' attribute.
	 * @see org.carim.model.WirelessAccessTypeT
	 * @see #isSetWirelessAccessType()
	 * @see #unsetWirelessAccessType()
	 * @see #getWirelessAccessType()
	 * @generated
	 */
	void setWirelessAccessType(WirelessAccessTypeT value);

	/**
	 * Unsets the value of the '{@link org.carim.model.CommunicationContext#getWirelessAccessType <em>Wireless Access Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWirelessAccessType()
	 * @see #getWirelessAccessType()
	 * @see #setWirelessAccessType(WirelessAccessTypeT)
	 * @generated
	 */
	void unsetWirelessAccessType();

	/**
	 * Returns whether the value of the '{@link org.carim.model.CommunicationContext#getWirelessAccessType <em>Wireless Access Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wireless Access Type</em>' attribute is set.
	 * @see #unsetWirelessAccessType()
	 * @see #getWirelessAccessType()
	 * @see #setWirelessAccessType(WirelessAccessTypeT)
	 * @generated
	 */
	boolean isSetWirelessAccessType();

	/**
	 * Returns the value of the '<em><b>Access Point Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Point Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Point Name</em>' attribute.
	 * @see #setAccessPointName(String)
	 * @see org.carim.model.carimModelPackage#getCommunicationContext_AccessPointName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='accessPointName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAccessPointName();

	/**
	 * Sets the value of the '{@link org.carim.model.CommunicationContext#getAccessPointName <em>Access Point Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Point Name</em>' attribute.
	 * @see #getAccessPointName()
	 * @generated
	 */
	void setAccessPointName(String value);

	/**
	 * Returns the value of the '<em><b>Signal Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signal Strength</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal Strength</em>' attribute.
	 * @see #isSetSignalStrength()
	 * @see #unsetSignalStrength()
	 * @see #setSignalStrength(int)
	 * @see org.carim.model.carimModelPackage#getCommunicationContext_SignalStrength()
	 * @model unsettable="true" dataType="org.carim.model.PercentageT" required="true"
	 *        extendedMetaData="kind='element' name='signalStrength' namespace='##targetNamespace'"
	 * @generated
	 */
	int getSignalStrength();

	/**
	 * Sets the value of the '{@link org.carim.model.CommunicationContext#getSignalStrength <em>Signal Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal Strength</em>' attribute.
	 * @see #isSetSignalStrength()
	 * @see #unsetSignalStrength()
	 * @see #getSignalStrength()
	 * @generated
	 */
	void setSignalStrength(int value);

	/**
	 * Unsets the value of the '{@link org.carim.model.CommunicationContext#getSignalStrength <em>Signal Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSignalStrength()
	 * @see #getSignalStrength()
	 * @see #setSignalStrength(int)
	 * @generated
	 */
	void unsetSignalStrength();

	/**
	 * Returns whether the value of the '{@link org.carim.model.CommunicationContext#getSignalStrength <em>Signal Strength</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Signal Strength</em>' attribute is set.
	 * @see #unsetSignalStrength()
	 * @see #getSignalStrength()
	 * @see #setSignalStrength(int)
	 * @generated
	 */
	boolean isSetSignalStrength();

	/**
	 * Returns the value of the '<em><b>Received Data Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Received Data Throughput</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Received Data Throughput</em>' attribute.
	 * @see #isSetReceivedDataThroughput()
	 * @see #unsetReceivedDataThroughput()
	 * @see #setReceivedDataThroughput(double)
	 * @see org.carim.model.carimModelPackage#getCommunicationContext_ReceivedDataThroughput()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='element' name='receivedDataThroughput' namespace='##targetNamespace'"
	 * @generated
	 */
	double getReceivedDataThroughput();

	/**
	 * Sets the value of the '{@link org.carim.model.CommunicationContext#getReceivedDataThroughput <em>Received Data Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Received Data Throughput</em>' attribute.
	 * @see #isSetReceivedDataThroughput()
	 * @see #unsetReceivedDataThroughput()
	 * @see #getReceivedDataThroughput()
	 * @generated
	 */
	void setReceivedDataThroughput(double value);

	/**
	 * Unsets the value of the '{@link org.carim.model.CommunicationContext#getReceivedDataThroughput <em>Received Data Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReceivedDataThroughput()
	 * @see #getReceivedDataThroughput()
	 * @see #setReceivedDataThroughput(double)
	 * @generated
	 */
	void unsetReceivedDataThroughput();

	/**
	 * Returns whether the value of the '{@link org.carim.model.CommunicationContext#getReceivedDataThroughput <em>Received Data Throughput</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Received Data Throughput</em>' attribute is set.
	 * @see #unsetReceivedDataThroughput()
	 * @see #getReceivedDataThroughput()
	 * @see #setReceivedDataThroughput(double)
	 * @generated
	 */
	boolean isSetReceivedDataThroughput();

	/**
	 * Returns the value of the '<em><b>Sent Data Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sent Data Throughput</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sent Data Throughput</em>' attribute.
	 * @see #isSetSentDataThroughput()
	 * @see #unsetSentDataThroughput()
	 * @see #setSentDataThroughput(double)
	 * @see org.carim.model.carimModelPackage#getCommunicationContext_SentDataThroughput()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='element' name='sentDataThroughput' namespace='##targetNamespace'"
	 * @generated
	 */
	double getSentDataThroughput();

	/**
	 * Sets the value of the '{@link org.carim.model.CommunicationContext#getSentDataThroughput <em>Sent Data Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sent Data Throughput</em>' attribute.
	 * @see #isSetSentDataThroughput()
	 * @see #unsetSentDataThroughput()
	 * @see #getSentDataThroughput()
	 * @generated
	 */
	void setSentDataThroughput(double value);

	/**
	 * Unsets the value of the '{@link org.carim.model.CommunicationContext#getSentDataThroughput <em>Sent Data Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSentDataThroughput()
	 * @see #getSentDataThroughput()
	 * @see #setSentDataThroughput(double)
	 * @generated
	 */
	void unsetSentDataThroughput();

	/**
	 * Returns whether the value of the '{@link org.carim.model.CommunicationContext#getSentDataThroughput <em>Sent Data Throughput</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sent Data Throughput</em>' attribute is set.
	 * @see #unsetSentDataThroughput()
	 * @see #getSentDataThroughput()
	 * @see #setSentDataThroughput(double)
	 * @generated
	 */
	boolean isSetSentDataThroughput();

	/**
	 * Returns the value of the '<em><b>Rtt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rtt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rtt</em>' attribute.
	 * @see #isSetRtt()
	 * @see #unsetRtt()
	 * @see #setRtt(int)
	 * @see org.carim.model.carimModelPackage#getCommunicationContext_Rtt()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='rtt' namespace='##targetNamespace'"
	 * @generated
	 */
	int getRtt();

	/**
	 * Sets the value of the '{@link org.carim.model.CommunicationContext#getRtt <em>Rtt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rtt</em>' attribute.
	 * @see #isSetRtt()
	 * @see #unsetRtt()
	 * @see #getRtt()
	 * @generated
	 */
	void setRtt(int value);

	/**
	 * Unsets the value of the '{@link org.carim.model.CommunicationContext#getRtt <em>Rtt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRtt()
	 * @see #getRtt()
	 * @see #setRtt(int)
	 * @generated
	 */
	void unsetRtt();

	/**
	 * Returns whether the value of the '{@link org.carim.model.CommunicationContext#getRtt <em>Rtt</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rtt</em>' attribute is set.
	 * @see #unsetRtt()
	 * @see #getRtt()
	 * @see #setRtt(int)
	 * @generated
	 */
	boolean isSetRtt();

	/**
	 * Returns the value of the '<em><b>Srt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Srt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Srt</em>' attribute.
	 * @see #isSetSrt()
	 * @see #unsetSrt()
	 * @see #setSrt(int)
	 * @see org.carim.model.carimModelPackage#getCommunicationContext_Srt()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='srt' namespace='##targetNamespace'"
	 * @generated
	 */
	int getSrt();

	/**
	 * Sets the value of the '{@link org.carim.model.CommunicationContext#getSrt <em>Srt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Srt</em>' attribute.
	 * @see #isSetSrt()
	 * @see #unsetSrt()
	 * @see #getSrt()
	 * @generated
	 */
	void setSrt(int value);

	/**
	 * Unsets the value of the '{@link org.carim.model.CommunicationContext#getSrt <em>Srt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSrt()
	 * @see #getSrt()
	 * @see #setSrt(int)
	 * @generated
	 */
	void unsetSrt();

	/**
	 * Returns whether the value of the '{@link org.carim.model.CommunicationContext#getSrt <em>Srt</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Srt</em>' attribute is set.
	 * @see #unsetSrt()
	 * @see #getSrt()
	 * @see #setSrt(int)
	 * @generated
	 */
	boolean isSetSrt();

} // CommunicationContext
