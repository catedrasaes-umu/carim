/**
 */
package org.mmi.events;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Mood Update Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mmi.events.UserMoodUpdateEvent#getMood <em>Mood</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mmi.events.EventsPackage#getUserMoodUpdateEvent()
 * @model
 * @generated
 */
public interface UserMoodUpdateEvent extends UserContextEvent {
	/**
	 * Returns the value of the '<em><b>Mood</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mood</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mood</em>' attribute.
	 * @see #setMood(float)
	 * @see org.mmi.events.EventsPackage#getUserMoodUpdateEvent_Mood()
	 * @model dataType="org.carim.model.Likert5Value"
	 * @generated
	 */
	float getMood();

	/**
	 * Sets the value of the '{@link org.mmi.events.UserMoodUpdateEvent#getMood <em>Mood</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mood</em>' attribute.
	 * @see #getMood()
	 * @generated
	 */
	void setMood(float value);

} // UserMoodUpdateEvent
