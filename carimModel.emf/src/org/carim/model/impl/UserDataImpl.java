/**
 */
package org.carim.model.impl;

import java.util.Collection;

import org.carim.model.EducationLevelT;
import org.carim.model.GenderT;
import org.carim.model.PreviousExperienceT;
import org.carim.model.UserAttitude;
import org.carim.model.UserData;
import org.carim.model.UserRatings;
import org.carim.model.carimModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.carim.model.impl.UserDataImpl#getUserRatings <em>User Ratings</em>}</li>
 *   <li>{@link org.carim.model.impl.UserDataImpl#getUserMood <em>User Mood</em>}</li>
 *   <li>{@link org.carim.model.impl.UserDataImpl#getUserAttitude <em>User Attitude</em>}</li>
 *   <li>{@link org.carim.model.impl.UserDataImpl#getAge <em>Age</em>}</li>
 *   <li>{@link org.carim.model.impl.UserDataImpl#getGender <em>Gender</em>}</li>
 *   <li>{@link org.carim.model.impl.UserDataImpl#getEducationLevel <em>Education Level</em>}</li>
 *   <li>{@link org.carim.model.impl.UserDataImpl#getPreviousExperience <em>Previous Experience</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserDataImpl extends EObjectImpl implements UserData {
	/**
	 * The cached value of the '{@link #getUserRatings() <em>User Ratings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserRatings()
	 * @generated
	 * @ordered
	 */
	protected EList<UserRatings> userRatings;

	/**
	 * The cached value of the '{@link #getUserMood() <em>User Mood</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserMood()
	 * @generated
	 * @ordered
	 */
	protected EList<Float> userMood;

	/**
	 * The cached value of the '{@link #getUserAttitude() <em>User Attitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserAttitude()
	 * @generated
	 * @ordered
	 */
	protected UserAttitude userAttitude;

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
	 * This is true if the Age attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ageESet;

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
	 * This is true if the Gender attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean genderESet;

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
	 * This is true if the Education Level attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean educationLevelESet;

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
	 * This is true if the Previous Experience attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean previousExperienceESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return carimModelPackage.Literals.USER_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserRatings> getUserRatings() {
		if (userRatings == null) {
			userRatings = new EObjectContainmentEList<UserRatings>(UserRatings.class, this, carimModelPackage.USER_DATA__USER_RATINGS);
		}
		return userRatings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Float> getUserMood() {
		if (userMood == null) {
			userMood = new EDataTypeEList<Float>(Float.class, this, carimModelPackage.USER_DATA__USER_MOOD);
		}
		return userMood;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserAttitude getUserAttitude() {
		return userAttitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserAttitude(UserAttitude newUserAttitude, NotificationChain msgs) {
		UserAttitude oldUserAttitude = userAttitude;
		userAttitude = newUserAttitude;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, carimModelPackage.USER_DATA__USER_ATTITUDE, oldUserAttitude, newUserAttitude);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserAttitude(UserAttitude newUserAttitude) {
		if (newUserAttitude != userAttitude) {
			NotificationChain msgs = null;
			if (userAttitude != null)
				msgs = ((InternalEObject)userAttitude).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - carimModelPackage.USER_DATA__USER_ATTITUDE, null, msgs);
			if (newUserAttitude != null)
				msgs = ((InternalEObject)newUserAttitude).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - carimModelPackage.USER_DATA__USER_ATTITUDE, null, msgs);
			msgs = basicSetUserAttitude(newUserAttitude, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.USER_DATA__USER_ATTITUDE, newUserAttitude, newUserAttitude));
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
		boolean oldAgeESet = ageESet;
		ageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.USER_DATA__AGE, oldAge, age, !oldAgeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAge() {
		int oldAge = age;
		boolean oldAgeESet = ageESet;
		age = AGE_EDEFAULT;
		ageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, carimModelPackage.USER_DATA__AGE, oldAge, AGE_EDEFAULT, oldAgeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAge() {
		return ageESet;
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
		boolean oldGenderESet = genderESet;
		genderESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.USER_DATA__GENDER, oldGender, gender, !oldGenderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGender() {
		GenderT oldGender = gender;
		boolean oldGenderESet = genderESet;
		gender = GENDER_EDEFAULT;
		genderESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, carimModelPackage.USER_DATA__GENDER, oldGender, GENDER_EDEFAULT, oldGenderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGender() {
		return genderESet;
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
		boolean oldEducationLevelESet = educationLevelESet;
		educationLevelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.USER_DATA__EDUCATION_LEVEL, oldEducationLevel, educationLevel, !oldEducationLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEducationLevel() {
		EducationLevelT oldEducationLevel = educationLevel;
		boolean oldEducationLevelESet = educationLevelESet;
		educationLevel = EDUCATION_LEVEL_EDEFAULT;
		educationLevelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, carimModelPackage.USER_DATA__EDUCATION_LEVEL, oldEducationLevel, EDUCATION_LEVEL_EDEFAULT, oldEducationLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEducationLevel() {
		return educationLevelESet;
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
		boolean oldPreviousExperienceESet = previousExperienceESet;
		previousExperienceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.USER_DATA__PREVIOUS_EXPERIENCE, oldPreviousExperience, previousExperience, !oldPreviousExperienceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPreviousExperience() {
		PreviousExperienceT oldPreviousExperience = previousExperience;
		boolean oldPreviousExperienceESet = previousExperienceESet;
		previousExperience = PREVIOUS_EXPERIENCE_EDEFAULT;
		previousExperienceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, carimModelPackage.USER_DATA__PREVIOUS_EXPERIENCE, oldPreviousExperience, PREVIOUS_EXPERIENCE_EDEFAULT, oldPreviousExperienceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPreviousExperience() {
		return previousExperienceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case carimModelPackage.USER_DATA__USER_RATINGS:
				return ((InternalEList<?>)getUserRatings()).basicRemove(otherEnd, msgs);
			case carimModelPackage.USER_DATA__USER_ATTITUDE:
				return basicSetUserAttitude(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case carimModelPackage.USER_DATA__USER_RATINGS:
				return getUserRatings();
			case carimModelPackage.USER_DATA__USER_MOOD:
				return getUserMood();
			case carimModelPackage.USER_DATA__USER_ATTITUDE:
				return getUserAttitude();
			case carimModelPackage.USER_DATA__AGE:
				return getAge();
			case carimModelPackage.USER_DATA__GENDER:
				return getGender();
			case carimModelPackage.USER_DATA__EDUCATION_LEVEL:
				return getEducationLevel();
			case carimModelPackage.USER_DATA__PREVIOUS_EXPERIENCE:
				return getPreviousExperience();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case carimModelPackage.USER_DATA__USER_RATINGS:
				getUserRatings().clear();
				getUserRatings().addAll((Collection<? extends UserRatings>)newValue);
				return;
			case carimModelPackage.USER_DATA__USER_MOOD:
				getUserMood().clear();
				getUserMood().addAll((Collection<? extends Float>)newValue);
				return;
			case carimModelPackage.USER_DATA__USER_ATTITUDE:
				setUserAttitude((UserAttitude)newValue);
				return;
			case carimModelPackage.USER_DATA__AGE:
				setAge((Integer)newValue);
				return;
			case carimModelPackage.USER_DATA__GENDER:
				setGender((GenderT)newValue);
				return;
			case carimModelPackage.USER_DATA__EDUCATION_LEVEL:
				setEducationLevel((EducationLevelT)newValue);
				return;
			case carimModelPackage.USER_DATA__PREVIOUS_EXPERIENCE:
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
			case carimModelPackage.USER_DATA__USER_RATINGS:
				getUserRatings().clear();
				return;
			case carimModelPackage.USER_DATA__USER_MOOD:
				getUserMood().clear();
				return;
			case carimModelPackage.USER_DATA__USER_ATTITUDE:
				setUserAttitude((UserAttitude)null);
				return;
			case carimModelPackage.USER_DATA__AGE:
				unsetAge();
				return;
			case carimModelPackage.USER_DATA__GENDER:
				unsetGender();
				return;
			case carimModelPackage.USER_DATA__EDUCATION_LEVEL:
				unsetEducationLevel();
				return;
			case carimModelPackage.USER_DATA__PREVIOUS_EXPERIENCE:
				unsetPreviousExperience();
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
			case carimModelPackage.USER_DATA__USER_RATINGS:
				return userRatings != null && !userRatings.isEmpty();
			case carimModelPackage.USER_DATA__USER_MOOD:
				return userMood != null && !userMood.isEmpty();
			case carimModelPackage.USER_DATA__USER_ATTITUDE:
				return userAttitude != null;
			case carimModelPackage.USER_DATA__AGE:
				return isSetAge();
			case carimModelPackage.USER_DATA__GENDER:
				return isSetGender();
			case carimModelPackage.USER_DATA__EDUCATION_LEVEL:
				return isSetEducationLevel();
			case carimModelPackage.USER_DATA__PREVIOUS_EXPERIENCE:
				return isSetPreviousExperience();
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
		result.append(" (userMood: ");
		result.append(userMood);
		result.append(", age: ");
		if (ageESet) result.append(age); else result.append("<unset>");
		result.append(", gender: ");
		if (genderESet) result.append(gender); else result.append("<unset>");
		result.append(", educationLevel: ");
		if (educationLevelESet) result.append(educationLevel); else result.append("<unset>");
		result.append(", previousExperience: ");
		if (previousExperienceESet) result.append(previousExperience); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //UserDataImpl
