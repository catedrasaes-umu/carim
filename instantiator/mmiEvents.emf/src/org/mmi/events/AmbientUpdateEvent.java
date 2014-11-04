/**
 */
package org.mmi.events;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ambient Update Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mmi.events.AmbientUpdateEvent#getNoise <em>Noise</em>}</li>
 *   <li>{@link org.mmi.events.AmbientUpdateEvent#getLight <em>Light</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mmi.events.EventsPackage#getAmbientUpdateEvent()
 * @model
 * @generated
 */
public interface AmbientUpdateEvent extends PhysicalEnvironmentContextEvent {
	/**
	 * Returns the value of the '<em><b>Noise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Noise</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Noise</em>' attribute.
	 * @see #setNoise(int)
	 * @see org.mmi.events.EventsPackage#getAmbientUpdateEvent_Noise()
	 * @model dataType="org.carim.model.PercentageT"
	 * @generated
	 */
	int getNoise();

	/**
	 * Sets the value of the '{@link org.mmi.events.AmbientUpdateEvent#getNoise <em>Noise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Noise</em>' attribute.
	 * @see #getNoise()
	 * @generated
	 */
	void setNoise(int value);

	/**
	 * Returns the value of the '<em><b>Light</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Light</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Light</em>' attribute.
	 * @see #setLight(int)
	 * @see org.mmi.events.EventsPackage#getAmbientUpdateEvent_Light()
	 * @model dataType="org.carim.model.PercentageT"
	 * @generated
	 */
	int getLight();

	/**
	 * Sets the value of the '{@link org.mmi.events.AmbientUpdateEvent#getLight <em>Light</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Light</em>' attribute.
	 * @see #getLight()
	 * @generated
	 */
	void setLight(int value);

} // AmbientUpdateEvent
