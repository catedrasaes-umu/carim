/**
 */
package org.carim.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Attitude</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.carim.model.UserAttitude#getUsefulness <em>Usefulness</em>}</li>
 *   <li>{@link org.carim.model.UserAttitude#getPleasantness <em>Pleasantness</em>}</li>
 *   <li>{@link org.carim.model.UserAttitude#getIntegration <em>Integration</em>}</li>
 *   <li>{@link org.carim.model.UserAttitude#getSelfEfficacy <em>Self Efficacy</em>}</li>
 *   <li>{@link org.carim.model.UserAttitude#getComfort <em>Comfort</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.carim.model.carimModelPackage#getUserAttitude()
 * @model extendedMetaData="name='UserAttitude' kind='elementOnly'"
 * @generated
 */
public interface UserAttitude extends EObject {
	/**
	 * Returns the value of the '<em><b>Usefulness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usefulness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usefulness</em>' attribute.
	 * @see #isSetUsefulness()
	 * @see #unsetUsefulness()
	 * @see #setUsefulness(float)
	 * @see org.carim.model.carimModelPackage#getUserAttitude_Usefulness()
	 * @model unsettable="true" dataType="org.carim.model.Likert5Value" required="true"
	 *        extendedMetaData="kind='element' name='usefulness' namespace='##targetNamespace'"
	 * @generated
	 */
	float getUsefulness();

	/**
	 * Sets the value of the '{@link org.carim.model.UserAttitude#getUsefulness <em>Usefulness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usefulness</em>' attribute.
	 * @see #isSetUsefulness()
	 * @see #unsetUsefulness()
	 * @see #getUsefulness()
	 * @generated
	 */
	void setUsefulness(float value);

	/**
	 * Unsets the value of the '{@link org.carim.model.UserAttitude#getUsefulness <em>Usefulness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUsefulness()
	 * @see #getUsefulness()
	 * @see #setUsefulness(float)
	 * @generated
	 */
	void unsetUsefulness();

	/**
	 * Returns whether the value of the '{@link org.carim.model.UserAttitude#getUsefulness <em>Usefulness</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Usefulness</em>' attribute is set.
	 * @see #unsetUsefulness()
	 * @see #getUsefulness()
	 * @see #setUsefulness(float)
	 * @generated
	 */
	boolean isSetUsefulness();

	/**
	 * Returns the value of the '<em><b>Pleasantness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pleasantness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pleasantness</em>' attribute.
	 * @see #isSetPleasantness()
	 * @see #unsetPleasantness()
	 * @see #setPleasantness(float)
	 * @see org.carim.model.carimModelPackage#getUserAttitude_Pleasantness()
	 * @model unsettable="true" dataType="org.carim.model.Likert5Value" required="true"
	 *        extendedMetaData="kind='element' name='pleasantness' namespace='##targetNamespace'"
	 * @generated
	 */
	float getPleasantness();

	/**
	 * Sets the value of the '{@link org.carim.model.UserAttitude#getPleasantness <em>Pleasantness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pleasantness</em>' attribute.
	 * @see #isSetPleasantness()
	 * @see #unsetPleasantness()
	 * @see #getPleasantness()
	 * @generated
	 */
	void setPleasantness(float value);

	/**
	 * Unsets the value of the '{@link org.carim.model.UserAttitude#getPleasantness <em>Pleasantness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPleasantness()
	 * @see #getPleasantness()
	 * @see #setPleasantness(float)
	 * @generated
	 */
	void unsetPleasantness();

	/**
	 * Returns whether the value of the '{@link org.carim.model.UserAttitude#getPleasantness <em>Pleasantness</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pleasantness</em>' attribute is set.
	 * @see #unsetPleasantness()
	 * @see #getPleasantness()
	 * @see #setPleasantness(float)
	 * @generated
	 */
	boolean isSetPleasantness();

	/**
	 * Returns the value of the '<em><b>Integration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integration</em>' attribute.
	 * @see #isSetIntegration()
	 * @see #unsetIntegration()
	 * @see #setIntegration(float)
	 * @see org.carim.model.carimModelPackage#getUserAttitude_Integration()
	 * @model unsettable="true" dataType="org.carim.model.Likert5Value" required="true"
	 *        extendedMetaData="kind='element' name='integration' namespace='##targetNamespace'"
	 * @generated
	 */
	float getIntegration();

	/**
	 * Sets the value of the '{@link org.carim.model.UserAttitude#getIntegration <em>Integration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integration</em>' attribute.
	 * @see #isSetIntegration()
	 * @see #unsetIntegration()
	 * @see #getIntegration()
	 * @generated
	 */
	void setIntegration(float value);

	/**
	 * Unsets the value of the '{@link org.carim.model.UserAttitude#getIntegration <em>Integration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIntegration()
	 * @see #getIntegration()
	 * @see #setIntegration(float)
	 * @generated
	 */
	void unsetIntegration();

	/**
	 * Returns whether the value of the '{@link org.carim.model.UserAttitude#getIntegration <em>Integration</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Integration</em>' attribute is set.
	 * @see #unsetIntegration()
	 * @see #getIntegration()
	 * @see #setIntegration(float)
	 * @generated
	 */
	boolean isSetIntegration();

	/**
	 * Returns the value of the '<em><b>Self Efficacy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Self Efficacy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Self Efficacy</em>' attribute.
	 * @see #isSetSelfEfficacy()
	 * @see #unsetSelfEfficacy()
	 * @see #setSelfEfficacy(float)
	 * @see org.carim.model.carimModelPackage#getUserAttitude_SelfEfficacy()
	 * @model unsettable="true" dataType="org.carim.model.Likert5Value" required="true"
	 *        extendedMetaData="kind='element' name='selfEfficacy' namespace='##targetNamespace'"
	 * @generated
	 */
	float getSelfEfficacy();

	/**
	 * Sets the value of the '{@link org.carim.model.UserAttitude#getSelfEfficacy <em>Self Efficacy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Self Efficacy</em>' attribute.
	 * @see #isSetSelfEfficacy()
	 * @see #unsetSelfEfficacy()
	 * @see #getSelfEfficacy()
	 * @generated
	 */
	void setSelfEfficacy(float value);

	/**
	 * Unsets the value of the '{@link org.carim.model.UserAttitude#getSelfEfficacy <em>Self Efficacy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSelfEfficacy()
	 * @see #getSelfEfficacy()
	 * @see #setSelfEfficacy(float)
	 * @generated
	 */
	void unsetSelfEfficacy();

	/**
	 * Returns whether the value of the '{@link org.carim.model.UserAttitude#getSelfEfficacy <em>Self Efficacy</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Self Efficacy</em>' attribute is set.
	 * @see #unsetSelfEfficacy()
	 * @see #getSelfEfficacy()
	 * @see #setSelfEfficacy(float)
	 * @generated
	 */
	boolean isSetSelfEfficacy();

	/**
	 * Returns the value of the '<em><b>Comfort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comfort</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comfort</em>' attribute.
	 * @see #isSetComfort()
	 * @see #unsetComfort()
	 * @see #setComfort(float)
	 * @see org.carim.model.carimModelPackage#getUserAttitude_Comfort()
	 * @model unsettable="true" dataType="org.carim.model.Likert5Value" required="true"
	 *        extendedMetaData="kind='element' name='comfort' namespace='##targetNamespace'"
	 * @generated
	 */
	float getComfort();

	/**
	 * Sets the value of the '{@link org.carim.model.UserAttitude#getComfort <em>Comfort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comfort</em>' attribute.
	 * @see #isSetComfort()
	 * @see #unsetComfort()
	 * @see #getComfort()
	 * @generated
	 */
	void setComfort(float value);

	/**
	 * Unsets the value of the '{@link org.carim.model.UserAttitude#getComfort <em>Comfort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetComfort()
	 * @see #getComfort()
	 * @see #setComfort(float)
	 * @generated
	 */
	void unsetComfort();

	/**
	 * Returns whether the value of the '{@link org.carim.model.UserAttitude#getComfort <em>Comfort</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Comfort</em>' attribute is set.
	 * @see #unsetComfort()
	 * @see #getComfort()
	 * @see #setComfort(float)
	 * @generated
	 */
	boolean isSetComfort();

} // UserAttitude
