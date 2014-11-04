/**
 */
package org.mmi.events;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Throughput Update Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mmi.events.ThroughputUpdateEvent#getReceivedData <em>Received Data</em>}</li>
 *   <li>{@link org.mmi.events.ThroughputUpdateEvent#getSentData <em>Sent Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mmi.events.EventsPackage#getThroughputUpdateEvent()
 * @model
 * @generated
 */
public interface ThroughputUpdateEvent extends CommunicationContextEvent {
	/**
	 * Returns the value of the '<em><b>Received Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Received Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Received Data</em>' attribute.
	 * @see #setReceivedData(int)
	 * @see org.mmi.events.EventsPackage#getThroughputUpdateEvent_ReceivedData()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getReceivedData();

	/**
	 * Sets the value of the '{@link org.mmi.events.ThroughputUpdateEvent#getReceivedData <em>Received Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Received Data</em>' attribute.
	 * @see #getReceivedData()
	 * @generated
	 */
	void setReceivedData(int value);

	/**
	 * Returns the value of the '<em><b>Sent Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sent Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sent Data</em>' attribute.
	 * @see #setSentData(int)
	 * @see org.mmi.events.EventsPackage#getThroughputUpdateEvent_SentData()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getSentData();

	/**
	 * Sets the value of the '{@link org.mmi.events.ThroughputUpdateEvent#getSentData <em>Sent Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sent Data</em>' attribute.
	 * @see #getSentData()
	 * @generated
	 */
	void setSentData(int value);

} // ThroughputUpdateEvent
