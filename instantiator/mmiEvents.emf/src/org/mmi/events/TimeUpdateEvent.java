/**
 */
package org.mmi.events;

import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Update Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mmi.events.TimeUpdateEvent#getD_year <em>Dyear</em>}</li>
 *   <li>{@link org.mmi.events.TimeUpdateEvent#getD_month <em>Dmonth</em>}</li>
 *   <li>{@link org.mmi.events.TimeUpdateEvent#getD_day <em>Dday</em>}</li>
 *   <li>{@link org.mmi.events.TimeUpdateEvent#getT_hours <em>Thours</em>}</li>
 *   <li>{@link org.mmi.events.TimeUpdateEvent#getT_mins <em>Tmins</em>}</li>
 *   <li>{@link org.mmi.events.TimeUpdateEvent#getT_secs <em>Tsecs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mmi.events.EventsPackage#getTimeUpdateEvent()
 * @model
 * @generated
 */
public interface TimeUpdateEvent extends LocationTimeContextEvent {
	/**
	 * Returns the value of the '<em><b>Thours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thours</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thours</em>' attribute.
	 * @see #setT_hours(int)
	 * @see org.mmi.events.EventsPackage#getTimeUpdateEvent_T_hours()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getT_hours();

	/**
	 * Sets the value of the '{@link org.mmi.events.TimeUpdateEvent#getT_hours <em>Thours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thours</em>' attribute.
	 * @see #getT_hours()
	 * @generated
	 */
	void setT_hours(int value);

	/**
	 * Returns the value of the '<em><b>Tmins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tmins</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tmins</em>' attribute.
	 * @see #setT_mins(int)
	 * @see org.mmi.events.EventsPackage#getTimeUpdateEvent_T_mins()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getT_mins();

	/**
	 * Sets the value of the '{@link org.mmi.events.TimeUpdateEvent#getT_mins <em>Tmins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tmins</em>' attribute.
	 * @see #getT_mins()
	 * @generated
	 */
	void setT_mins(int value);

	/**
	 * Returns the value of the '<em><b>Tsecs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tsecs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tsecs</em>' attribute.
	 * @see #setT_secs(int)
	 * @see org.mmi.events.EventsPackage#getTimeUpdateEvent_T_secs()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getT_secs();

	/**
	 * Sets the value of the '{@link org.mmi.events.TimeUpdateEvent#getT_secs <em>Tsecs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tsecs</em>' attribute.
	 * @see #getT_secs()
	 * @generated
	 */
	void setT_secs(int value);

	/**
	 * Returns the value of the '<em><b>Dyear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dyear</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dyear</em>' attribute.
	 * @see #setD_year(int)
	 * @see org.mmi.events.EventsPackage#getTimeUpdateEvent_D_year()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getD_year();

	/**
	 * Sets the value of the '{@link org.mmi.events.TimeUpdateEvent#getD_year <em>Dyear</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dyear</em>' attribute.
	 * @see #getD_year()
	 * @generated
	 */
	void setD_year(int value);

	/**
	 * Returns the value of the '<em><b>Dmonth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dmonth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dmonth</em>' attribute.
	 * @see #setD_month(int)
	 * @see org.mmi.events.EventsPackage#getTimeUpdateEvent_D_month()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getD_month();

	/**
	 * Sets the value of the '{@link org.mmi.events.TimeUpdateEvent#getD_month <em>Dmonth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dmonth</em>' attribute.
	 * @see #getD_month()
	 * @generated
	 */
	void setD_month(int value);

	/**
	 * Returns the value of the '<em><b>Dday</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dday</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dday</em>' attribute.
	 * @see #setD_day(int)
	 * @see org.mmi.events.EventsPackage#getTimeUpdateEvent_D_day()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getD_day();

	/**
	 * Sets the value of the '{@link org.mmi.events.TimeUpdateEvent#getD_day <em>Dday</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dday</em>' attribute.
	 * @see #getD_day()
	 * @generated
	 */
	void setD_day(int value);

} // TimeUpdateEvent
