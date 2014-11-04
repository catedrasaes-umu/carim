/**
 */
package org.mmi.events.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.mmi.events.EventsPackage;
import org.mmi.events.UserMoodUpdateEvent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Mood Update Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mmi.events.impl.UserMoodUpdateEventImpl#getMood <em>Mood</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserMoodUpdateEventImpl extends UserContextEventImpl implements UserMoodUpdateEvent {
	/**
	 * The default value of the '{@link #getMood() <em>Mood</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMood()
	 * @generated
	 * @ordered
	 */
	protected static final float MOOD_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMood() <em>Mood</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMood()
	 * @generated
	 * @ordered
	 */
	protected float mood = MOOD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserMoodUpdateEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EventsPackage.Literals.USER_MOOD_UPDATE_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMood() {
		return mood;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMood(float newMood) {
		float oldMood = mood;
		mood = newMood;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.USER_MOOD_UPDATE_EVENT__MOOD, oldMood, mood));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EventsPackage.USER_MOOD_UPDATE_EVENT__MOOD:
				return getMood();
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
			case EventsPackage.USER_MOOD_UPDATE_EVENT__MOOD:
				setMood((Float)newValue);
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
			case EventsPackage.USER_MOOD_UPDATE_EVENT__MOOD:
				setMood(MOOD_EDEFAULT);
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
			case EventsPackage.USER_MOOD_UPDATE_EVENT__MOOD:
				return mood != MOOD_EDEFAULT;
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
		result.append(" (mood: ");
		result.append(mood);
		result.append(')');
		return result.toString();
	}

} //UserMoodUpdateEventImpl
