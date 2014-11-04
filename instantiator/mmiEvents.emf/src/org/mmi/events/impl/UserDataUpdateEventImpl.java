/**
 */
package org.mmi.events.impl;

import org.carim.model.EducationLevelT;
import org.carim.model.GenderT;
import org.carim.model.PreviousExperienceT;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.mmi.events.EventsPackage;
import org.mmi.events.UserDataUpdateEvent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Data Update Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mmi.events.impl.UserDataUpdateEventImpl#getAge <em>Age</em>}</li>
 *   <li>{@link org.mmi.events.impl.UserDataUpdateEventImpl#getGender <em>Gender</em>}</li>
 *   <li>{@link org.mmi.events.impl.UserDataUpdateEventImpl#getEducationLevel <em>Education Level</em>}</li>
 *   <li>{@link org.mmi.events.impl.UserDataUpdateEventImpl#getPreviousExperience <em>Previous Experience</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserDataUpdateEventImpl extends UserContextEventImpl implements UserDataUpdateEvent {
	/**
	 * The default value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected static final int AGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected int age = AGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGender() <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected static final GenderT GENDER_EDEFAULT = GenderT.NONE;

	/**
	 * The cached value of the '{@link #getGender() <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected GenderT gender = GENDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getEducationLevel() <em>Education Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEducationLevel()
	 * @generated
	 * @ordered
	 */
	protected static final EducationLevelT EDUCATION_LEVEL_EDEFAULT = EducationLevelT.NONE;

	/**
	 * The cached value of the '{@link #getEducationLevel() <em>Education Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEducationLevel()
	 * @generated
	 * @ordered
	 */
	protected EducationLevelT educationLevel = EDUCATION_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPreviousExperience() <em>Previous Experience</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousExperience()
	 * @generated
	 * @ordered
	 */
	protected static final PreviousExperienceT PREVIOUS_EXPERIENCE_EDEFAULT = PreviousExperienceT.NONE;

	/**
	 * The cached value of the '{@link #getPreviousExperience() <em>Previous Experience</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousExperience()
	 * @generated
	 * @ordered
	 */
	protected PreviousExperienceT previousExperience = PREVIOUS_EXPERIENCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserDataUpdateEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EventsPackage.Literals.USER_DATA_UPDATE_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAge() {
		return age;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAge(int newAge) {
		int oldAge = age;
		age = newAge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.USER_DATA_UPDATE_EVENT__AGE, oldAge, age));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenderT getGender() {
		return gender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGender(GenderT newGender) {
		GenderT oldGender = gender;
		gender = newGender == null ? GENDER_EDEFAULT : newGender;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.USER_DATA_UPDATE_EVENT__GENDER, oldGender, gender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EducationLevelT getEducationLevel() {
		return educationLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEducationLevel(EducationLevelT newEducationLevel) {
		EducationLevelT oldEducationLevel = educationLevel;
		educationLevel = newEducationLevel == null ? EDUCATION_LEVEL_EDEFAULT : newEducationLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.USER_DATA_UPDATE_EVENT__EDUCATION_LEVEL, oldEducationLevel, educationLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreviousExperienceT getPreviousExperience() {
		return previousExperience;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreviousExperience(PreviousExperienceT newPreviousExperience) {
		PreviousExperienceT oldPreviousExperience = previousExperience;
		previousExperience = newPreviousExperience == null ? PREVIOUS_EXPERIENCE_EDEFAULT : newPreviousExperience;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.USER_DATA_UPDATE_EVENT__PREVIOUS_EXPERIENCE, oldPreviousExperience, previousExperience));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EventsPackage.USER_DATA_UPDATE_EVENT__AGE:
				return getAge();
			case EventsPackage.USER_DATA_UPDATE_EVENT__GENDER:
				return getGender();
			case EventsPackage.USER_DATA_UPDATE_EVENT__EDUCATION_LEVEL:
				return getEducationLevel();
			case EventsPackage.USER_DATA_UPDATE_EVENT__PREVIOUS_EXPERIENCE:
				return getPreviousExperience();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EventsPackage.USER_DATA_UPDATE_EVENT__AGE:
				setAge((Integer)newValue);
				return;
			case EventsPackage.USER_DATA_UPDATE_EVENT__GENDER:
				setGender((GenderT)newValue);
				return;
			case EventsPackage.USER_DATA_UPDATE_EVENT__EDUCATION_LEVEL:
				setEducationLevel((EducationLevelT)newValue);
				return;
			case EventsPackage.USER_DATA_UPDATE_EVENT__PREVIOUS_EXPERIENCE:
				setPreviousExperience((PreviousExperienceT)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EventsPackage.USER_DATA_UPDATE_EVENT__AGE:
				setAge(AGE_EDEFAULT);
				return;
			case EventsPackage.USER_DATA_UPDATE_EVENT__GENDER:
				setGender(GENDER_EDEFAULT);
				return;
			case EventsPackage.USER_DATA_UPDATE_EVENT__EDUCATION_LEVEL:
				setEducationLevel(EDUCATION_LEVEL_EDEFAULT);
				return;
			case EventsPackage.USER_DATA_UPDATE_EVENT__PREVIOUS_EXPERIENCE:
				setPreviousExperience(PREVIOUS_EXPERIENCE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EventsPackage.USER_DATA_UPDATE_EVENT__AGE:
				return age != AGE_EDEFAULT;
			case EventsPackage.USER_DATA_UPDATE_EVENT__GENDER:
				return gender != GENDER_EDEFAULT;
			case EventsPackage.USER_DATA_UPDATE_EVENT__EDUCATION_LEVEL:
				return educationLevel != EDUCATION_LEVEL_EDEFAULT;
			case EventsPackage.USER_DATA_UPDATE_EVENT__PREVIOUS_EXPERIENCE:
				return previousExperience != PREVIOUS_EXPERIENCE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (age: ");
		result.append(age);
		result.append(", gender: ");
		result.append(gender);
		result.append(", educationLevel: ");
		result.append(educationLevel);
		result.append(", previousExperience: ");
		result.append(previousExperience);
		result.append(')');
		return result.toString();
	}

} //UserDataUpdateEventImpl
