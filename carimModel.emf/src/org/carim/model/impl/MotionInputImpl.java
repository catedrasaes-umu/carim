/**
 */
package org.carim.model.impl;

import org.carim.model.MotionInput;
import org.carim.model.carimModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Motion Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.carim.model.impl.MotionInputImpl#getTiltMovements <em>Tilt Movements</em>}</li>
 *   <li>{@link org.carim.model.impl.MotionInputImpl#getTwistMovements <em>Twist Movements</em>}</li>
 *   <li>{@link org.carim.model.impl.MotionInputImpl#getShakeMovements <em>Shake Movements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MotionInputImpl extends EObjectImpl implements MotionInput {
	/**
	 * The default value of the '{@link #getTiltMovements() <em>Tilt Movements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTiltMovements()
	 * @generated
	 * @ordered
	 */
	protected static final long TILT_MOVEMENTS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTiltMovements() <em>Tilt Movements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTiltMovements()
	 * @generated
	 * @ordered
	 */
	protected long tiltMovements = TILT_MOVEMENTS_EDEFAULT;

	/**
	 * This is true if the Tilt Movements attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tiltMovementsESet;

	/**
	 * The default value of the '{@link #getTwistMovements() <em>Twist Movements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTwistMovements()
	 * @generated
	 * @ordered
	 */
	protected static final long TWIST_MOVEMENTS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTwistMovements() <em>Twist Movements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTwistMovements()
	 * @generated
	 * @ordered
	 */
	protected long twistMovements = TWIST_MOVEMENTS_EDEFAULT;

	/**
	 * This is true if the Twist Movements attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean twistMovementsESet;

	/**
	 * The default value of the '{@link #getShakeMovements() <em>Shake Movements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShakeMovements()
	 * @generated
	 * @ordered
	 */
	protected static final long SHAKE_MOVEMENTS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getShakeMovements() <em>Shake Movements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShakeMovements()
	 * @generated
	 * @ordered
	 */
	protected long shakeMovements = SHAKE_MOVEMENTS_EDEFAULT;

	/**
	 * This is true if the Shake Movements attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean shakeMovementsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MotionInputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return carimModelPackage.Literals.MOTION_INPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTiltMovements() {
		return tiltMovements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTiltMovements(long newTiltMovements) {
		long oldTiltMovements = tiltMovements;
		tiltMovements = newTiltMovements;
		boolean oldTiltMovementsESet = tiltMovementsESet;
		tiltMovementsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.MOTION_INPUT__TILT_MOVEMENTS, oldTiltMovements, tiltMovements, !oldTiltMovementsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTiltMovements() {
		long oldTiltMovements = tiltMovements;
		boolean oldTiltMovementsESet = tiltMovementsESet;
		tiltMovements = TILT_MOVEMENTS_EDEFAULT;
		tiltMovementsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, carimModelPackage.MOTION_INPUT__TILT_MOVEMENTS, oldTiltMovements, TILT_MOVEMENTS_EDEFAULT, oldTiltMovementsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTiltMovements() {
		return tiltMovementsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTwistMovements() {
		return twistMovements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTwistMovements(long newTwistMovements) {
		long oldTwistMovements = twistMovements;
		twistMovements = newTwistMovements;
		boolean oldTwistMovementsESet = twistMovementsESet;
		twistMovementsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.MOTION_INPUT__TWIST_MOVEMENTS, oldTwistMovements, twistMovements, !oldTwistMovementsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTwistMovements() {
		long oldTwistMovements = twistMovements;
		boolean oldTwistMovementsESet = twistMovementsESet;
		twistMovements = TWIST_MOVEMENTS_EDEFAULT;
		twistMovementsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, carimModelPackage.MOTION_INPUT__TWIST_MOVEMENTS, oldTwistMovements, TWIST_MOVEMENTS_EDEFAULT, oldTwistMovementsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTwistMovements() {
		return twistMovementsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getShakeMovements() {
		return shakeMovements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShakeMovements(long newShakeMovements) {
		long oldShakeMovements = shakeMovements;
		shakeMovements = newShakeMovements;
		boolean oldShakeMovementsESet = shakeMovementsESet;
		shakeMovementsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.MOTION_INPUT__SHAKE_MOVEMENTS, oldShakeMovements, shakeMovements, !oldShakeMovementsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetShakeMovements() {
		long oldShakeMovements = shakeMovements;
		boolean oldShakeMovementsESet = shakeMovementsESet;
		shakeMovements = SHAKE_MOVEMENTS_EDEFAULT;
		shakeMovementsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, carimModelPackage.MOTION_INPUT__SHAKE_MOVEMENTS, oldShakeMovements, SHAKE_MOVEMENTS_EDEFAULT, oldShakeMovementsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetShakeMovements() {
		return shakeMovementsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case carimModelPackage.MOTION_INPUT__TILT_MOVEMENTS:
				return getTiltMovements();
			case carimModelPackage.MOTION_INPUT__TWIST_MOVEMENTS:
				return getTwistMovements();
			case carimModelPackage.MOTION_INPUT__SHAKE_MOVEMENTS:
				return getShakeMovements();
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
			case carimModelPackage.MOTION_INPUT__TILT_MOVEMENTS:
				setTiltMovements((Long)newValue);
				return;
			case carimModelPackage.MOTION_INPUT__TWIST_MOVEMENTS:
				setTwistMovements((Long)newValue);
				return;
			case carimModelPackage.MOTION_INPUT__SHAKE_MOVEMENTS:
				setShakeMovements((Long)newValue);
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
			case carimModelPackage.MOTION_INPUT__TILT_MOVEMENTS:
				unsetTiltMovements();
				return;
			case carimModelPackage.MOTION_INPUT__TWIST_MOVEMENTS:
				unsetTwistMovements();
				return;
			case carimModelPackage.MOTION_INPUT__SHAKE_MOVEMENTS:
				unsetShakeMovements();
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
			case carimModelPackage.MOTION_INPUT__TILT_MOVEMENTS:
				return isSetTiltMovements();
			case carimModelPackage.MOTION_INPUT__TWIST_MOVEMENTS:
				return isSetTwistMovements();
			case carimModelPackage.MOTION_INPUT__SHAKE_MOVEMENTS:
				return isSetShakeMovements();
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
		result.append(" (tiltMovements: ");
		if (tiltMovementsESet) result.append(tiltMovements); else result.append("<unset>");
		result.append(", twistMovements: ");
		if (twistMovementsESet) result.append(twistMovements); else result.append("<unset>");
		result.append(", shakeMovements: ");
		if (shakeMovementsESet) result.append(shakeMovements); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //MotionInputImpl
