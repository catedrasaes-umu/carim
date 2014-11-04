/**
 */
package org.mmi.events;

import org.carim.model.SocialArenaT;
import org.carim.model.SocialCompanyT;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Social Update Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mmi.events.SocialUpdateEvent#getSocialCompany <em>Social Company</em>}</li>
 *   <li>{@link org.mmi.events.SocialUpdateEvent#getSocialArena <em>Social Arena</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mmi.events.EventsPackage#getSocialUpdateEvent()
 * @model
 * @generated
 */
public interface SocialUpdateEvent extends SocialContextEvent {
	/**
	 * Returns the value of the '<em><b>Social Company</b></em>' attribute.
	 * The literals are from the enumeration {@link org.carim.model.SocialCompanyT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Social Company</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Social Company</em>' attribute.
	 * @see org.carim.model.SocialCompanyT
	 * @see #setSocialCompany(SocialCompanyT)
	 * @see org.mmi.events.EventsPackage#getSocialUpdateEvent_SocialCompany()
	 * @model
	 * @generated
	 */
	SocialCompanyT getSocialCompany();

	/**
	 * Sets the value of the '{@link org.mmi.events.SocialUpdateEvent#getSocialCompany <em>Social Company</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Social Company</em>' attribute.
	 * @see org.carim.model.SocialCompanyT
	 * @see #getSocialCompany()
	 * @generated
	 */
	void setSocialCompany(SocialCompanyT value);

	/**
	 * Returns the value of the '<em><b>Social Arena</b></em>' attribute.
	 * The literals are from the enumeration {@link org.carim.model.SocialArenaT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Social Arena</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Social Arena</em>' attribute.
	 * @see org.carim.model.SocialArenaT
	 * @see #setSocialArena(SocialArenaT)
	 * @see org.mmi.events.EventsPackage#getSocialUpdateEvent_SocialArena()
	 * @model
	 * @generated
	 */
	SocialArenaT getSocialArena();

	/**
	 * Sets the value of the '{@link org.mmi.events.SocialUpdateEvent#getSocialArena <em>Social Arena</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Social Arena</em>' attribute.
	 * @see org.carim.model.SocialArenaT
	 * @see #getSocialArena()
	 * @generated
	 */
	void setSocialArena(SocialArenaT value);

} // SocialUpdateEvent
