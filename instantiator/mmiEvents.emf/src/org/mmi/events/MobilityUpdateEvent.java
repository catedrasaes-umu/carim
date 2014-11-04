/**
 */
package org.mmi.events;

import org.carim.model.MobilityLevelT;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mobility Update Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mmi.events.MobilityUpdateEvent#getMobilityLevel <em>Mobility Level</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mmi.events.EventsPackage#getMobilityUpdateEvent()
 * @model
 * @generated
 */
public interface MobilityUpdateEvent extends LocationTimeContextEvent {
	/**
	 * Returns the value of the '<em><b>Mobility Level</b></em>' attribute.
	 * The literals are from the enumeration {@link org.carim.model.MobilityLevelT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mobility Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mobility Level</em>' attribute.
	 * @see org.carim.model.MobilityLevelT
	 * @see #setMobilityLevel(MobilityLevelT)
	 * @see org.mmi.events.EventsPackage#getMobilityUpdateEvent_MobilityLevel()
	 * @model
	 * @generated
	 */
	MobilityLevelT getMobilityLevel();

	/**
	 * Sets the value of the '{@link org.mmi.events.MobilityUpdateEvent#getMobilityLevel <em>Mobility Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mobility Level</em>' attribute.
	 * @see org.carim.model.MobilityLevelT
	 * @see #getMobilityLevel()
	 * @generated
	 */
	void setMobilityLevel(MobilityLevelT value);

} // MobilityUpdateEvent
