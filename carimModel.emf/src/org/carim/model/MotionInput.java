/**
 */
package org.carim.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Motion Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.carim.model.MotionInput#getTiltMovements <em>Tilt Movements</em>}</li>
 *   <li>{@link org.carim.model.MotionInput#getTwistMovements <em>Twist Movements</em>}</li>
 *   <li>{@link org.carim.model.MotionInput#getShakeMovements <em>Shake Movements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.carim.model.carimModelPackage#getMotionInput()
 * @model extendedMetaData="name='MotionInput' kind='elementOnly'"
 * @generated
 */
public interface MotionInput extends EObject {
	/**
	 * Returns the value of the '<em><b>Tilt Movements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tilt Movements</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tilt Movements</em>' attribute.
	 * @see #isSetTiltMovements()
	 * @see #unsetTiltMovements()
	 * @see #setTiltMovements(long)
	 * @see org.carim.model.carimModelPackage#getMotionInput_TiltMovements()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long" required="true"
	 *        extendedMetaData="kind='element' name='tiltMovements' namespace='##targetNamespace'"
	 * @generated
	 */
	long getTiltMovements();

	/**
	 * Sets the value of the '{@link org.carim.model.MotionInput#getTiltMovements <em>Tilt Movements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tilt Movements</em>' attribute.
	 * @see #isSetTiltMovements()
	 * @see #unsetTiltMovements()
	 * @see #getTiltMovements()
	 * @generated
	 */
	void setTiltMovements(long value);

	/**
	 * Unsets the value of the '{@link org.carim.model.MotionInput#getTiltMovements <em>Tilt Movements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTiltMovements()
	 * @see #getTiltMovements()
	 * @see #setTiltMovements(long)
	 * @generated
	 */
	void unsetTiltMovements();

	/**
	 * Returns whether the value of the '{@link org.carim.model.MotionInput#getTiltMovements <em>Tilt Movements</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tilt Movements</em>' attribute is set.
	 * @see #unsetTiltMovements()
	 * @see #getTiltMovements()
	 * @see #setTiltMovements(long)
	 * @generated
	 */
	boolean isSetTiltMovements();

	/**
	 * Returns the value of the '<em><b>Twist Movements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Twist Movements</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Twist Movements</em>' attribute.
	 * @see #isSetTwistMovements()
	 * @see #unsetTwistMovements()
	 * @see #setTwistMovements(long)
	 * @see org.carim.model.carimModelPackage#getMotionInput_TwistMovements()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long" required="true"
	 *        extendedMetaData="kind='element' name='twistMovements' namespace='##targetNamespace'"
	 * @generated
	 */
	long getTwistMovements();

	/**
	 * Sets the value of the '{@link org.carim.model.MotionInput#getTwistMovements <em>Twist Movements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Twist Movements</em>' attribute.
	 * @see #isSetTwistMovements()
	 * @see #unsetTwistMovements()
	 * @see #getTwistMovements()
	 * @generated
	 */
	void setTwistMovements(long value);

	/**
	 * Unsets the value of the '{@link org.carim.model.MotionInput#getTwistMovements <em>Twist Movements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTwistMovements()
	 * @see #getTwistMovements()
	 * @see #setTwistMovements(long)
	 * @generated
	 */
	void unsetTwistMovements();

	/**
	 * Returns whether the value of the '{@link org.carim.model.MotionInput#getTwistMovements <em>Twist Movements</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Twist Movements</em>' attribute is set.
	 * @see #unsetTwistMovements()
	 * @see #getTwistMovements()
	 * @see #setTwistMovements(long)
	 * @generated
	 */
	boolean isSetTwistMovements();

	/**
	 * Returns the value of the '<em><b>Shake Movements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shake Movements</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shake Movements</em>' attribute.
	 * @see #isSetShakeMovements()
	 * @see #unsetShakeMovements()
	 * @see #setShakeMovements(long)
	 * @see org.carim.model.carimModelPackage#getMotionInput_ShakeMovements()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long" required="true"
	 *        extendedMetaData="kind='element' name='shakeMovements' namespace='##targetNamespace'"
	 * @generated
	 */
	long getShakeMovements();

	/**
	 * Sets the value of the '{@link org.carim.model.MotionInput#getShakeMovements <em>Shake Movements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shake Movements</em>' attribute.
	 * @see #isSetShakeMovements()
	 * @see #unsetShakeMovements()
	 * @see #getShakeMovements()
	 * @generated
	 */
	void setShakeMovements(long value);

	/**
	 * Unsets the value of the '{@link org.carim.model.MotionInput#getShakeMovements <em>Shake Movements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShakeMovements()
	 * @see #getShakeMovements()
	 * @see #setShakeMovements(long)
	 * @generated
	 */
	void unsetShakeMovements();

	/**
	 * Returns whether the value of the '{@link org.carim.model.MotionInput#getShakeMovements <em>Shake Movements</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Shake Movements</em>' attribute is set.
	 * @see #unsetShakeMovements()
	 * @see #getShakeMovements()
	 * @see #setShakeMovements(long)
	 * @generated
	 */
	boolean isSetShakeMovements();

} // MotionInput
