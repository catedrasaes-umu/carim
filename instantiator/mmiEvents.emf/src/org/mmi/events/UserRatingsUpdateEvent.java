/**
 */
package org.mmi.events;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Ratings Update Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mmi.events.UserRatingsUpdateEvent#getPractical <em>Practical</em>}</li>
 *   <li>{@link org.mmi.events.UserRatingsUpdateEvent#getPredictable <em>Predictable</em>}</li>
 *   <li>{@link org.mmi.events.UserRatingsUpdateEvent#getClearlyStructured <em>Clearly Structured</em>}</li>
 *   <li>{@link org.mmi.events.UserRatingsUpdateEvent#getSimple <em>Simple</em>}</li>
 *   <li>{@link org.mmi.events.UserRatingsUpdateEvent#getStylish <em>Stylish</em>}</li>
 *   <li>{@link org.mmi.events.UserRatingsUpdateEvent#getPremium <em>Premium</em>}</li>
 *   <li>{@link org.mmi.events.UserRatingsUpdateEvent#getCreative <em>Creative</em>}</li>
 *   <li>{@link org.mmi.events.UserRatingsUpdateEvent#getCaptivating <em>Captivating</em>}</li>
 *   <li>{@link org.mmi.events.UserRatingsUpdateEvent#getBeautiful <em>Beautiful</em>}</li>
 *   <li>{@link org.mmi.events.UserRatingsUpdateEvent#getGood <em>Good</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mmi.events.EventsPackage#getUserRatingsUpdateEvent()
 * @model
 * @generated
 */
public interface UserRatingsUpdateEvent extends UserContextEvent {
	/**
	 * Returns the value of the '<em><b>Practical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Practical</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Practical</em>' attribute.
	 * @see #setPractical(float)
	 * @see org.mmi.events.EventsPackage#getUserRatingsUpdateEvent_Practical()
	 * @model dataType="org.carim.model.Likert7Value"
	 * @generated
	 */
	float getPractical();

	/**
	 * Sets the value of the '{@link org.mmi.events.UserRatingsUpdateEvent#getPractical <em>Practical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Practical</em>' attribute.
	 * @see #getPractical()
	 * @generated
	 */
	void setPractical(float value);

	/**
	 * Returns the value of the '<em><b>Predictable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predictable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predictable</em>' attribute.
	 * @see #setPredictable(float)
	 * @see org.mmi.events.EventsPackage#getUserRatingsUpdateEvent_Predictable()
	 * @model dataType="org.carim.model.Likert7Value"
	 * @generated
	 */
	float getPredictable();

	/**
	 * Sets the value of the '{@link org.mmi.events.UserRatingsUpdateEvent#getPredictable <em>Predictable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predictable</em>' attribute.
	 * @see #getPredictable()
	 * @generated
	 */
	void setPredictable(float value);

	/**
	 * Returns the value of the '<em><b>Clearly Structured</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clearly Structured</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clearly Structured</em>' attribute.
	 * @see #setClearlyStructured(float)
	 * @see org.mmi.events.EventsPackage#getUserRatingsUpdateEvent_ClearlyStructured()
	 * @model dataType="org.carim.model.Likert7Value"
	 * @generated
	 */
	float getClearlyStructured();

	/**
	 * Sets the value of the '{@link org.mmi.events.UserRatingsUpdateEvent#getClearlyStructured <em>Clearly Structured</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clearly Structured</em>' attribute.
	 * @see #getClearlyStructured()
	 * @generated
	 */
	void setClearlyStructured(float value);

	/**
	 * Returns the value of the '<em><b>Simple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple</em>' attribute.
	 * @see #setSimple(float)
	 * @see org.mmi.events.EventsPackage#getUserRatingsUpdateEvent_Simple()
	 * @model dataType="org.carim.model.Likert7Value"
	 * @generated
	 */
	float getSimple();

	/**
	 * Sets the value of the '{@link org.mmi.events.UserRatingsUpdateEvent#getSimple <em>Simple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple</em>' attribute.
	 * @see #getSimple()
	 * @generated
	 */
	void setSimple(float value);

	/**
	 * Returns the value of the '<em><b>Stylish</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stylish</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stylish</em>' attribute.
	 * @see #setStylish(float)
	 * @see org.mmi.events.EventsPackage#getUserRatingsUpdateEvent_Stylish()
	 * @model dataType="org.carim.model.Likert7Value"
	 * @generated
	 */
	float getStylish();

	/**
	 * Sets the value of the '{@link org.mmi.events.UserRatingsUpdateEvent#getStylish <em>Stylish</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stylish</em>' attribute.
	 * @see #getStylish()
	 * @generated
	 */
	void setStylish(float value);

	/**
	 * Returns the value of the '<em><b>Premium</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Premium</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Premium</em>' attribute.
	 * @see #setPremium(float)
	 * @see org.mmi.events.EventsPackage#getUserRatingsUpdateEvent_Premium()
	 * @model dataType="org.carim.model.Likert7Value"
	 * @generated
	 */
	float getPremium();

	/**
	 * Sets the value of the '{@link org.mmi.events.UserRatingsUpdateEvent#getPremium <em>Premium</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Premium</em>' attribute.
	 * @see #getPremium()
	 * @generated
	 */
	void setPremium(float value);

	/**
	 * Returns the value of the '<em><b>Creative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creative</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creative</em>' attribute.
	 * @see #setCreative(float)
	 * @see org.mmi.events.EventsPackage#getUserRatingsUpdateEvent_Creative()
	 * @model dataType="org.carim.model.Likert7Value"
	 * @generated
	 */
	float getCreative();

	/**
	 * Sets the value of the '{@link org.mmi.events.UserRatingsUpdateEvent#getCreative <em>Creative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creative</em>' attribute.
	 * @see #getCreative()
	 * @generated
	 */
	void setCreative(float value);

	/**
	 * Returns the value of the '<em><b>Captivating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Captivating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Captivating</em>' attribute.
	 * @see #setCaptivating(float)
	 * @see org.mmi.events.EventsPackage#getUserRatingsUpdateEvent_Captivating()
	 * @model dataType="org.carim.model.Likert7Value"
	 * @generated
	 */
	float getCaptivating();

	/**
	 * Sets the value of the '{@link org.mmi.events.UserRatingsUpdateEvent#getCaptivating <em>Captivating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Captivating</em>' attribute.
	 * @see #getCaptivating()
	 * @generated
	 */
	void setCaptivating(float value);

	/**
	 * Returns the value of the '<em><b>Beautiful</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Beautiful</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beautiful</em>' attribute.
	 * @see #setBeautiful(float)
	 * @see org.mmi.events.EventsPackage#getUserRatingsUpdateEvent_Beautiful()
	 * @model dataType="org.carim.model.Likert7Value"
	 * @generated
	 */
	float getBeautiful();

	/**
	 * Sets the value of the '{@link org.mmi.events.UserRatingsUpdateEvent#getBeautiful <em>Beautiful</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beautiful</em>' attribute.
	 * @see #getBeautiful()
	 * @generated
	 */
	void setBeautiful(float value);

	/**
	 * Returns the value of the '<em><b>Good</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Good</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Good</em>' attribute.
	 * @see #setGood(float)
	 * @see org.mmi.events.EventsPackage#getUserRatingsUpdateEvent_Good()
	 * @model dataType="org.carim.model.Likert7Value"
	 * @generated
	 */
	float getGood();

	/**
	 * Sets the value of the '{@link org.mmi.events.UserRatingsUpdateEvent#getGood <em>Good</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Good</em>' attribute.
	 * @see #getGood()
	 * @generated
	 */
	void setGood(float value);

} // UserRatingsUpdateEvent
