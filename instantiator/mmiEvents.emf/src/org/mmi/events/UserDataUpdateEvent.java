/**
 */
package org.mmi.events;

import org.carim.model.EducationLevelT;
import org.carim.model.GenderT;
import org.carim.model.PreviousExperienceT;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Data Update Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mmi.events.UserDataUpdateEvent#getAge <em>Age</em>}</li>
 *   <li>{@link org.mmi.events.UserDataUpdateEvent#getGender <em>Gender</em>}</li>
 *   <li>{@link org.mmi.events.UserDataUpdateEvent#getEducationLevel <em>Education Level</em>}</li>
 *   <li>{@link org.mmi.events.UserDataUpdateEvent#getPreviousExperience <em>Previous Experience</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mmi.events.EventsPackage#getUserDataUpdateEvent()
 * @model
 * @generated
 */
public interface UserDataUpdateEvent extends UserContextEvent {
	/**
	 * Returns the value of the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Age</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age</em>' attribute.
	 * @see #setAge(int)
	 * @see org.mmi.events.EventsPackage#getUserDataUpdateEvent_Age()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getAge();

	/**
	 * Sets the value of the '{@link org.mmi.events.UserDataUpdateEvent#getAge <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age</em>' attribute.
	 * @see #getAge()
	 * @generated
	 */
	void setAge(int value);

	/**
	 * Returns the value of the '<em><b>Gender</b></em>' attribute.
	 * The literals are from the enumeration {@link org.carim.model.GenderT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gender</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gender</em>' attribute.
	 * @see org.carim.model.GenderT
	 * @see #setGender(GenderT)
	 * @see org.mmi.events.EventsPackage#getUserDataUpdateEvent_Gender()
	 * @model
	 * @generated
	 */
	GenderT getGender();

	/**
	 * Sets the value of the '{@link org.mmi.events.UserDataUpdateEvent#getGender <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gender</em>' attribute.
	 * @see org.carim.model.GenderT
	 * @see #getGender()
	 * @generated
	 */
	void setGender(GenderT value);

	/**
	 * Returns the value of the '<em><b>Education Level</b></em>' attribute.
	 * The literals are from the enumeration {@link org.carim.model.EducationLevelT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Education Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Education Level</em>' attribute.
	 * @see org.carim.model.EducationLevelT
	 * @see #setEducationLevel(EducationLevelT)
	 * @see org.mmi.events.EventsPackage#getUserDataUpdateEvent_EducationLevel()
	 * @model
	 * @generated
	 */
	EducationLevelT getEducationLevel();

	/**
	 * Sets the value of the '{@link org.mmi.events.UserDataUpdateEvent#getEducationLevel <em>Education Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Education Level</em>' attribute.
	 * @see org.carim.model.EducationLevelT
	 * @see #getEducationLevel()
	 * @generated
	 */
	void setEducationLevel(EducationLevelT value);

	/**
	 * Returns the value of the '<em><b>Previous Experience</b></em>' attribute.
	 * The literals are from the enumeration {@link org.carim.model.PreviousExperienceT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous Experience</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous Experience</em>' attribute.
	 * @see org.carim.model.PreviousExperienceT
	 * @see #setPreviousExperience(PreviousExperienceT)
	 * @see org.mmi.events.EventsPackage#getUserDataUpdateEvent_PreviousExperience()
	 * @model
	 * @generated
	 */
	PreviousExperienceT getPreviousExperience();

	/**
	 * Sets the value of the '{@link org.mmi.events.UserDataUpdateEvent#getPreviousExperience <em>Previous Experience</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous Experience</em>' attribute.
	 * @see org.carim.model.PreviousExperienceT
	 * @see #getPreviousExperience()
	 * @generated
	 */
	void setPreviousExperience(PreviousExperienceT value);

} // UserDataUpdateEvent
