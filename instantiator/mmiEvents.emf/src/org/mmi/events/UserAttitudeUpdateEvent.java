/**
 */
package org.mmi.events;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Attitude Update Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mmi.events.UserAttitudeUpdateEvent#getUsefulness <em>Usefulness</em>}</li>
 *   <li>{@link org.mmi.events.UserAttitudeUpdateEvent#getPleasantness <em>Pleasantness</em>}</li>
 *   <li>{@link org.mmi.events.UserAttitudeUpdateEvent#getIntegration <em>Integration</em>}</li>
 *   <li>{@link org.mmi.events.UserAttitudeUpdateEvent#getSelfEfficacy <em>Self Efficacy</em>}</li>
 *   <li>{@link org.mmi.events.UserAttitudeUpdateEvent#getComfort <em>Comfort</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mmi.events.EventsPackage#getUserAttitudeUpdateEvent()
 * @model
 * @generated
 */
public interface UserAttitudeUpdateEvent extends UserContextEvent {
	/**
	 * Returns the value of the '<em><b>Usefulness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usefulness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usefulness</em>' attribute.
	 * @see #setUsefulness(float)
	 * @see org.mmi.events.EventsPackage#getUserAttitudeUpdateEvent_Usefulness()
	 * @model dataType="org.carim.model.Likert5Value"
	 * @generated
	 */
	float getUsefulness();

	/**
	 * Sets the value of the '{@link org.mmi.events.UserAttitudeUpdateEvent#getUsefulness <em>Usefulness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usefulness</em>' attribute.
	 * @see #getUsefulness()
	 * @generated
	 */
	void setUsefulness(float value);

	/**
	 * Returns the value of the '<em><b>Pleasantness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pleasantness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pleasantness</em>' attribute.
	 * @see #setPleasantness(float)
	 * @see org.mmi.events.EventsPackage#getUserAttitudeUpdateEvent_Pleasantness()
	 * @model dataType="org.carim.model.Likert5Value"
	 * @generated
	 */
	float getPleasantness();

	/**
	 * Sets the value of the '{@link org.mmi.events.UserAttitudeUpdateEvent#getPleasantness <em>Pleasantness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pleasantness</em>' attribute.
	 * @see #getPleasantness()
	 * @generated
	 */
	void setPleasantness(float value);

	/**
	 * Returns the value of the '<em><b>Integration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integration</em>' attribute.
	 * @see #setIntegration(float)
	 * @see org.mmi.events.EventsPackage#getUserAttitudeUpdateEvent_Integration()
	 * @model dataType="org.carim.model.Likert5Value"
	 * @generated
	 */
	float getIntegration();

	/**
	 * Sets the value of the '{@link org.mmi.events.UserAttitudeUpdateEvent#getIntegration <em>Integration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integration</em>' attribute.
	 * @see #getIntegration()
	 * @generated
	 */
	void setIntegration(float value);

	/**
	 * Returns the value of the '<em><b>Self Efficacy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Self Efficacy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Self Efficacy</em>' attribute.
	 * @see #setSelfEfficacy(float)
	 * @see org.mmi.events.EventsPackage#getUserAttitudeUpdateEvent_SelfEfficacy()
	 * @model dataType="org.carim.model.Likert5Value"
	 * @generated
	 */
	float getSelfEfficacy();

	/**
	 * Sets the value of the '{@link org.mmi.events.UserAttitudeUpdateEvent#getSelfEfficacy <em>Self Efficacy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Self Efficacy</em>' attribute.
	 * @see #getSelfEfficacy()
	 * @generated
	 */
	void setSelfEfficacy(float value);

	/**
	 * Returns the value of the '<em><b>Comfort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comfort</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comfort</em>' attribute.
	 * @see #setComfort(float)
	 * @see org.mmi.events.EventsPackage#getUserAttitudeUpdateEvent_Comfort()
	 * @model dataType="org.carim.model.Likert5Value"
	 * @generated
	 */
	float getComfort();

	/**
	 * Sets the value of the '{@link org.mmi.events.UserAttitudeUpdateEvent#getComfort <em>Comfort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comfort</em>' attribute.
	 * @see #getComfort()
	 * @generated
	 */
	void setComfort(float value);

} // UserAttitudeUpdateEvent
