/**
 */
package org.mmi.events.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.mmi.events.EventsPackage;
import org.mmi.events.UserAttitudeUpdateEvent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Attitude Update Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mmi.events.impl.UserAttitudeUpdateEventImpl#getUsefulness <em>Usefulness</em>}</li>
 *   <li>{@link org.mmi.events.impl.UserAttitudeUpdateEventImpl#getPleasantness <em>Pleasantness</em>}</li>
 *   <li>{@link org.mmi.events.impl.UserAttitudeUpdateEventImpl#getIntegration <em>Integration</em>}</li>
 *   <li>{@link org.mmi.events.impl.UserAttitudeUpdateEventImpl#getSelfEfficacy <em>Self Efficacy</em>}</li>
 *   <li>{@link org.mmi.events.impl.UserAttitudeUpdateEventImpl#getComfort <em>Comfort</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserAttitudeUpdateEventImpl extends UserContextEventImpl implements UserAttitudeUpdateEvent {
	/**
	 * The default value of the '{@link #getUsefulness() <em>Usefulness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsefulness()
	 * @generated
	 * @ordered
	 */
	protected static final float USEFULNESS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getUsefulness() <em>Usefulness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsefulness()
	 * @generated
	 * @ordered
	 */
	protected float usefulness = USEFULNESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPleasantness() <em>Pleasantness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPleasantness()
	 * @generated
	 * @ordered
	 */
	protected static final float PLEASANTNESS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPleasantness() <em>Pleasantness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPleasantness()
	 * @generated
	 * @ordered
	 */
	protected float pleasantness = PLEASANTNESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getIntegration() <em>Integration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegration()
	 * @generated
	 * @ordered
	 */
	protected static final float INTEGRATION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getIntegration() <em>Integration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegration()
	 * @generated
	 * @ordered
	 */
	protected float integration = INTEGRATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSelfEfficacy() <em>Self Efficacy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelfEfficacy()
	 * @generated
	 * @ordered
	 */
	protected static final float SELF_EFFICACY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSelfEfficacy() <em>Self Efficacy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelfEfficacy()
	 * @generated
	 * @ordered
	 */
	protected float selfEfficacy = SELF_EFFICACY_EDEFAULT;

	/**
	 * The default value of the '{@link #getComfort() <em>Comfort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComfort()
	 * @generated
	 * @ordered
	 */
	protected static final float COMFORT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getComfort() <em>Comfort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComfort()
	 * @generated
	 * @ordered
	 */
	protected float comfort = COMFORT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserAttitudeUpdateEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EventsPackage.Literals.USER_ATTITUDE_UPDATE_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getUsefulness() {
		return usefulness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsefulness(float newUsefulness) {
		float oldUsefulness = usefulness;
		usefulness = newUsefulness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.USER_ATTITUDE_UPDATE_EVENT__USEFULNESS, oldUsefulness, usefulness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPleasantness() {
		return pleasantness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPleasantness(float newPleasantness) {
		float oldPleasantness = pleasantness;
		pleasantness = newPleasantness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.USER_ATTITUDE_UPDATE_EVENT__PLEASANTNESS, oldPleasantness, pleasantness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getIntegration() {
		return integration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntegration(float newIntegration) {
		float oldIntegration = integration;
		integration = newIntegration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.USER_ATTITUDE_UPDATE_EVENT__INTEGRATION, oldIntegration, integration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSelfEfficacy() {
		return selfEfficacy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelfEfficacy(float newSelfEfficacy) {
		float oldSelfEfficacy = selfEfficacy;
		selfEfficacy = newSelfEfficacy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.USER_ATTITUDE_UPDATE_EVENT__SELF_EFFICACY, oldSelfEfficacy, selfEfficacy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getComfort() {
		return comfort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComfort(float newComfort) {
		float oldComfort = comfort;
		comfort = newComfort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.USER_ATTITUDE_UPDATE_EVENT__COMFORT, oldComfort, comfort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EventsPackage.USER_ATTITUDE_UPDATE_EVENT__USEFULNESS:
				return getUsefulness();
			case EventsPackage.USER_ATTITUDE_UPDATE_EVENT__PLEASANTNESS:
				return getPleasantness();
			case EventsPackage.USER_ATTITUDE_UPDATE_EVENT__INTEGRATION:
				return getIntegration();
			case EventsPackage.USER_ATTITUDE_UPDATE_EVENT__SELF_EFFICACY:
				return getSelfEfficacy();
			case EventsPackage.USER_ATTITUDE_UPDATE_EVENT__COMFORT:
				return getComfort();
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
			case EventsPackage.USER_ATTITUDE_UPDATE_EVENT__USEFULNESS:
				setUsefulness((Float)newValue);
				return;
			case EventsPackage.USER_ATTITUDE_UPDATE_EVENT__PLEASANTNESS:
				setPleasantness((Float)newValue);
				return;
			case EventsPackage.USER_ATTITUDE_UPDATE_EVENT__INTEGRATION:
				setIntegration((Float)newValue);
				return;
			case EventsPackage.USER_ATTITUDE_UPDATE_EVENT__SELF_EFFICACY:
				setSelfEfficacy((Float)newValue);
				return;
			case EventsPackage.USER_ATTITUDE_UPDATE_EVENT__COMFORT:
				setComfort((Float)newValue);
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
			case EventsPackage.USER_ATTITUDE_UPDATE_EVENT__USEFULNESS:
				setUsefulness(USEFULNESS_EDEFAULT);
				return;
			case EventsPackage.USER_ATTITUDE_UPDATE_EVENT__PLEASANTNESS:
				setPleasantness(PLEASANTNESS_EDEFAULT);
				return;
			case EventsPackage.USER_ATTITUDE_UPDATE_EVENT__INTEGRATION:
				setIntegration(INTEGRATION_EDEFAULT);
				return;
			case EventsPackage.USER_ATTITUDE_UPDATE_EVENT__SELF_EFFICACY:
				setSelfEfficacy(SELF_EFFICACY_EDEFAULT);
				return;
			case EventsPackage.USER_ATTITUDE_UPDATE_EVENT__COMFORT:
				setComfort(COMFORT_EDEFAULT);
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
			case EventsPackage.USER_ATTITUDE_UPDATE_EVENT__USEFULNESS:
				return usefulness != USEFULNESS_EDEFAULT;
			case EventsPackage.USER_ATTITUDE_UPDATE_EVENT__PLEASANTNESS:
				return pleasantness != PLEASANTNESS_EDEFAULT;
			case EventsPackage.USER_ATTITUDE_UPDATE_EVENT__INTEGRATION:
				return integration != INTEGRATION_EDEFAULT;
			case EventsPackage.USER_ATTITUDE_UPDATE_EVENT__SELF_EFFICACY:
				return selfEfficacy != SELF_EFFICACY_EDEFAULT;
			case EventsPackage.USER_ATTITUDE_UPDATE_EVENT__COMFORT:
				return comfort != COMFORT_EDEFAULT;
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
		result.append(" (usefulness: ");
		result.append(usefulness);
		result.append(", pleasantness: ");
		result.append(pleasantness);
		result.append(", integration: ");
		result.append(integration);
		result.append(", selfEfficacy: ");
		result.append(selfEfficacy);
		result.append(", comfort: ");
		result.append(comfort);
		result.append(')');
		return result.toString();
	}

} //UserAttitudeUpdateEventImpl
