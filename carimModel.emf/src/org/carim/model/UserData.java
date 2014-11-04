/**
 */
package org.carim.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.carim.model.UserData#getUserRatings <em>User Ratings</em>}</li>
 *   <li>{@link org.carim.model.UserData#getUserMood <em>User Mood</em>}</li>
 *   <li>{@link org.carim.model.UserData#getUserAttitude <em>User Attitude</em>}</li>
 *   <li>{@link org.carim.model.UserData#getAge <em>Age</em>}</li>
 *   <li>{@link org.carim.model.UserData#getGender <em>Gender</em>}</li>
 *   <li>{@link org.carim.model.UserData#getEducationLevel <em>Education Level</em>}</li>
 *   <li>{@link org.carim.model.UserData#getPreviousExperience <em>Previous Experience</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.carim.model.carimModelPackage#getUserData()
 * @model extendedMetaData="name='UserData' kind='elementOnly'"
 * @generated
 */
public interface UserData extends EObject {
	/**
	 * Returns the value of the '<em><b>User Ratings</b></em>' containment reference list.
	 * The list contents are of type {@link org.carim.model.UserRatings}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Ratings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Ratings</em>' containment reference list.
	 * @see org.carim.model.carimModelPackage#getUserData_UserRatings()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='userRatings' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<UserRatings> getUserRatings();

	/**
	 * Returns the value of the '<em><b>User Mood</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Float}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Mood</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Mood</em>' attribute list.
	 * @see org.carim.model.carimModelPackage#getUserData_UserMood()
	 * @model unique="false" dataType="org.carim.model.Likert5Value"
	 *        extendedMetaData="kind='element' name='userMood' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Float> getUserMood();

	/**
	 * Returns the value of the '<em><b>User Attitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Attitude</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Attitude</em>' containment reference.
	 * @see #setUserAttitude(UserAttitude)
	 * @see org.carim.model.carimModelPackage#getUserData_UserAttitude()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='userAttitude' namespace='##targetNamespace'"
	 * @generated
	 */
	UserAttitude getUserAttitude();

	/**
	 * Sets the value of the '{@link org.carim.model.UserData#getUserAttitude <em>User Attitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Attitude</em>' containment reference.
	 * @see #getUserAttitude()
	 * @generated
	 */
	void setUserAttitude(UserAttitude value);

	/**
	 * Returns the value of the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Age</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age</em>' attribute.
	 * @see #isSetAge()
	 * @see #unsetAge()
	 * @see #setAge(int)
	 * @see org.carim.model.carimModelPackage#getUserData_Age()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='age' namespace='##targetNamespace'"
	 * @generated
	 */
	int getAge();

	/**
	 * Sets the value of the '{@link org.carim.model.UserData#getAge <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age</em>' attribute.
	 * @see #isSetAge()
	 * @see #unsetAge()
	 * @see #getAge()
	 * @generated
	 */
	void setAge(int value);

	/**
	 * Unsets the value of the '{@link org.carim.model.UserData#getAge <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAge()
	 * @see #getAge()
	 * @see #setAge(int)
	 * @generated
	 */
	void unsetAge();

	/**
	 * Returns whether the value of the '{@link org.carim.model.UserData#getAge <em>Age</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Age</em>' attribute is set.
	 * @see #unsetAge()
	 * @see #getAge()
	 * @see #setAge(int)
	 * @generated
	 */
	boolean isSetAge();

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
	 * @see #isSetGender()
	 * @see #unsetGender()
	 * @see #setGender(GenderT)
	 * @see org.carim.model.carimModelPackage#getUserData_Gender()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='gender' namespace='##targetNamespace'"
	 * @generated
	 */
	GenderT getGender();

	/**
	 * Sets the value of the '{@link org.carim.model.UserData#getGender <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gender</em>' attribute.
	 * @see org.carim.model.GenderT
	 * @see #isSetGender()
	 * @see #unsetGender()
	 * @see #getGender()
	 * @generated
	 */
	void setGender(GenderT value);

	/**
	 * Unsets the value of the '{@link org.carim.model.UserData#getGender <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGender()
	 * @see #getGender()
	 * @see #setGender(GenderT)
	 * @generated
	 */
	void unsetGender();

	/**
	 * Returns whether the value of the '{@link org.carim.model.UserData#getGender <em>Gender</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Gender</em>' attribute is set.
	 * @see #unsetGender()
	 * @see #getGender()
	 * @see #setGender(GenderT)
	 * @generated
	 */
	boolean isSetGender();

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
	 * @see #isSetEducationLevel()
	 * @see #unsetEducationLevel()
	 * @see #setEducationLevel(EducationLevelT)
	 * @see org.carim.model.carimModelPackage#getUserData_EducationLevel()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='educationLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	EducationLevelT getEducationLevel();

	/**
	 * Sets the value of the '{@link org.carim.model.UserData#getEducationLevel <em>Education Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Education Level</em>' attribute.
	 * @see org.carim.model.EducationLevelT
	 * @see #isSetEducationLevel()
	 * @see #unsetEducationLevel()
	 * @see #getEducationLevel()
	 * @generated
	 */
	void setEducationLevel(EducationLevelT value);

	/**
	 * Unsets the value of the '{@link org.carim.model.UserData#getEducationLevel <em>Education Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEducationLevel()
	 * @see #getEducationLevel()
	 * @see #setEducationLevel(EducationLevelT)
	 * @generated
	 */
	void unsetEducationLevel();

	/**
	 * Returns whether the value of the '{@link org.carim.model.UserData#getEducationLevel <em>Education Level</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Education Level</em>' attribute is set.
	 * @see #unsetEducationLevel()
	 * @see #getEducationLevel()
	 * @see #setEducationLevel(EducationLevelT)
	 * @generated
	 */
	boolean isSetEducationLevel();

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
	 * @see #isSetPreviousExperience()
	 * @see #unsetPreviousExperience()
	 * @see #setPreviousExperience(PreviousExperienceT)
	 * @see org.carim.model.carimModelPackage#getUserData_PreviousExperience()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='previousExperience' namespace='##targetNamespace'"
	 * @generated
	 */
	PreviousExperienceT getPreviousExperience();

	/**
	 * Sets the value of the '{@link org.carim.model.UserData#getPreviousExperience <em>Previous Experience</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous Experience</em>' attribute.
	 * @see org.carim.model.PreviousExperienceT
	 * @see #isSetPreviousExperience()
	 * @see #unsetPreviousExperience()
	 * @see #getPreviousExperience()
	 * @generated
	 */
	void setPreviousExperience(PreviousExperienceT value);

	/**
	 * Unsets the value of the '{@link org.carim.model.UserData#getPreviousExperience <em>Previous Experience</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPreviousExperience()
	 * @see #getPreviousExperience()
	 * @see #setPreviousExperience(PreviousExperienceT)
	 * @generated
	 */
	void unsetPreviousExperience();

	/**
	 * Returns whether the value of the '{@link org.carim.model.UserData#getPreviousExperience <em>Previous Experience</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Previous Experience</em>' attribute is set.
	 * @see #unsetPreviousExperience()
	 * @see #getPreviousExperience()
	 * @see #setPreviousExperience(PreviousExperienceT)
	 * @generated
	 */
	boolean isSetPreviousExperience();

} // UserData
