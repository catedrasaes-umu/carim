/**
 */
package org.mmi.events;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server Response Update Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mmi.events.ServerResponseUpdateEvent#getRtt <em>Rtt</em>}</li>
 *   <li>{@link org.mmi.events.ServerResponseUpdateEvent#getSrt <em>Srt</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mmi.events.EventsPackage#getServerResponseUpdateEvent()
 * @model
 * @generated
 */
public interface ServerResponseUpdateEvent extends CommunicationContextEvent {
	/**
	 * Returns the value of the '<em><b>Rtt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rtt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rtt</em>' attribute.
	 * @see #setRtt(int)
	 * @see org.mmi.events.EventsPackage#getServerResponseUpdateEvent_Rtt()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getRtt();

	/**
	 * Sets the value of the '{@link org.mmi.events.ServerResponseUpdateEvent#getRtt <em>Rtt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rtt</em>' attribute.
	 * @see #getRtt()
	 * @generated
	 */
	void setRtt(int value);

	/**
	 * Returns the value of the '<em><b>Srt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Srt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Srt</em>' attribute.
	 * @see #setSrt(int)
	 * @see org.mmi.events.EventsPackage#getServerResponseUpdateEvent_Srt()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getSrt();

	/**
	 * Sets the value of the '{@link org.mmi.events.ServerResponseUpdateEvent#getSrt <em>Srt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Srt</em>' attribute.
	 * @see #getSrt()
	 * @generated
	 */
	void setSrt(int value);

} // ServerResponseUpdateEvent
