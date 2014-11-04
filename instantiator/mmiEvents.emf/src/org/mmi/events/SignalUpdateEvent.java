/**
 */
package org.mmi.events;

import org.carim.model.WirelessAccessTypeT;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Update Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mmi.events.SignalUpdateEvent#getWirelessAccessType <em>Wireless Access Type</em>}</li>
 *   <li>{@link org.mmi.events.SignalUpdateEvent#getAccessPointName <em>Access Point Name</em>}</li>
 *   <li>{@link org.mmi.events.SignalUpdateEvent#getSignalStrength <em>Signal Strength</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mmi.events.EventsPackage#getSignalUpdateEvent()
 * @model
 * @generated
 */
public interface SignalUpdateEvent extends CommunicationContextEvent {
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
	 * @see #setWirelessAccessType(WirelessAccessTypeT)
	 * @see org.mmi.events.EventsPackage#getSignalUpdateEvent_WirelessAccessType()
	 * @model
	 * @generated
	 */
	WirelessAccessTypeT getWirelessAccessType();

	/**
	 * Sets the value of the '{@link org.mmi.events.SignalUpdateEvent#getWirelessAccessType <em>Wireless Access Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wireless Access Type</em>' attribute.
	 * @see org.carim.model.WirelessAccessTypeT
	 * @see #getWirelessAccessType()
	 * @generated
	 */
	void setWirelessAccessType(WirelessAccessTypeT value);

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
	 * @see org.mmi.events.EventsPackage#getSignalUpdateEvent_AccessPointName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getAccessPointName();

	/**
	 * Sets the value of the '{@link org.mmi.events.SignalUpdateEvent#getAccessPointName <em>Access Point Name</em>}' attribute.
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
	 * @see #setSignalStrength(int)
	 * @see org.mmi.events.EventsPackage#getSignalUpdateEvent_SignalStrength()
	 * @model dataType="org.carim.model.PercentageT"
	 * @generated
	 */
	int getSignalStrength();

	/**
	 * Sets the value of the '{@link org.mmi.events.SignalUpdateEvent#getSignalStrength <em>Signal Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal Strength</em>' attribute.
	 * @see #getSignalStrength()
	 * @generated
	 */
	void setSignalStrength(int value);

} // SignalUpdateEvent
