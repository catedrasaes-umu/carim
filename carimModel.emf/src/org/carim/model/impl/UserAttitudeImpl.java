/**
 */
package org.carim.model.impl;

import org.carim.model.UserAttitude;
import org.carim.model.carimModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Attitude</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.carim.model.impl.UserAttitudeImpl#getUsefulness <em>Usefulness</em>}</li>
 *   <li>{@link org.carim.model.impl.UserAttitudeImpl#getPleasantness <em>Pleasantness</em>}</li>
 *   <li>{@link org.carim.model.impl.UserAttitudeImpl#getIntegration <em>Integration</em>}</li>
 *   <li>{@link org.carim.model.impl.UserAttitudeImpl#getSelfEfficacy <em>Self Efficacy</em>}</li>
 *   <li>{@link org.carim.model.impl.UserAttitudeImpl#getComfort <em>Comfort</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserAttitudeImpl extends EObjectImpl implements UserAttitude {
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
	 * This is true if the Usefulness attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean usefulnessESet;

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
	 * This is true if the Pleasantness attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pleasantnessESet;

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
	 * This is true if the Integration attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean integrationESet;

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
	 * This is true if the Self Efficacy attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean selfEfficacyESet;

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
	 * This is true if the Comfort attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean comfortESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserAttitudeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return carimModelPackage.Literals.USER_ATTITUDE;
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
		boolean oldUsefulnessESet = usefulnessESet;
		usefulnessESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.USER_ATTITUDE__USEFULNESS, oldUsefulness, usefulness, !oldUsefulnessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUsefulness() {
		float oldUsefulness = usefulness;
		boolean oldUsefulnessESet = usefulnessESet;
		usefulness = USEFULNESS_EDEFAULT;
		usefulnessESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, carimModelPackage.USER_ATTITUDE__USEFULNESS, oldUsefulness, USEFULNESS_EDEFAULT, oldUsefulnessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUsefulness() {
		return usefulnessESet;
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
		boolean oldPleasantnessESet = pleasantnessESet;
		pleasantnessESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.USER_ATTITUDE__PLEASANTNESS, oldPleasantness, pleasantness, !oldPleasantnessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPleasantness() {
		float oldPleasantness = pleasantness;
		boolean oldPleasantnessESet = pleasantnessESet;
		pleasantness = PLEASANTNESS_EDEFAULT;
		pleasantnessESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, carimModelPackage.USER_ATTITUDE__PLEASANTNESS, oldPleasantness, PLEASANTNESS_EDEFAULT, oldPleasantnessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPleasantness() {
		return pleasantnessESet;
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
		boolean oldIntegrationESet = integrationESet;
		integrationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.USER_ATTITUDE__INTEGRATION, oldIntegration, integration, !oldIntegrationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIntegration() {
		float oldIntegration = integration;
		boolean oldIntegrationESet = integrationESet;
		integration = INTEGRATION_EDEFAULT;
		integrationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, carimModelPackage.USER_ATTITUDE__INTEGRATION, oldIntegration, INTEGRATION_EDEFAULT, oldIntegrationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIntegration() {
		return integrationESet;
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
		boolean oldSelfEfficacyESet = selfEfficacyESet;
		selfEfficacyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.USER_ATTITUDE__SELF_EFFICACY, oldSelfEfficacy, selfEfficacy, !oldSelfEfficacyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSelfEfficacy() {
		float oldSelfEfficacy = selfEfficacy;
		boolean oldSelfEfficacyESet = selfEfficacyESet;
		selfEfficacy = SELF_EFFICACY_EDEFAULT;
		selfEfficacyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, carimModelPackage.USER_ATTITUDE__SELF_EFFICACY, oldSelfEfficacy, SELF_EFFICACY_EDEFAULT, oldSelfEfficacyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSelfEfficacy() {
		return selfEfficacyESet;
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
		boolean oldComfortESet = comfortESet;
		comfortESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.USER_ATTITUDE__COMFORT, oldComfort, comfort, !oldComfortESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetComfort() {
		float oldComfort = comfort;
		boolean oldComfortESet = comfortESet;
		comfort = COMFORT_EDEFAULT;
		comfortESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, carimModelPackage.USER_ATTITUDE__COMFORT, oldComfort, COMFORT_EDEFAULT, oldComfortESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetComfort() {
		return comfortESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case carimModelPackage.USER_ATTITUDE__USEFULNESS:
				return getUsefulness();
			case carimModelPackage.USER_ATTITUDE__PLEASANTNESS:
				return getPleasantness();
			case carimModelPackage.USER_ATTITUDE__INTEGRATION:
				return getIntegration();
			case carimModelPackage.USER_ATTITUDE__SELF_EFFICACY:
				return getSelfEfficacy();
			case carimModelPackage.USER_ATTITUDE__COMFORT:
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
			case carimModelPackage.USER_ATTITUDE__USEFULNESS:
				setUsefulness((Float)newValue);
				return;
			case carimModelPackage.USER_ATTITUDE__PLEASANTNESS:
				setPleasantness((Float)newValue);
				return;
			case carimModelPackage.USER_ATTITUDE__INTEGRATION:
				setIntegration((Float)newValue);
				return;
			case carimModelPackage.USER_ATTITUDE__SELF_EFFICACY:
				setSelfEfficacy((Float)newValue);
				return;
			case carimModelPackage.USER_ATTITUDE__COMFORT:
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
			case carimModelPackage.USER_ATTITUDE__USEFULNESS:
				unsetUsefulness();
				return;
			case carimModelPackage.USER_ATTITUDE__PLEASANTNESS:
				unsetPleasantness();
				return;
			case carimModelPackage.USER_ATTITUDE__INTEGRATION:
				unsetIntegration();
				return;
			case carimModelPackage.USER_ATTITUDE__SELF_EFFICACY:
				unsetSelfEfficacy();
				return;
			case carimModelPackage.USER_ATTITUDE__COMFORT:
				unsetComfort();
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
			case carimModelPackage.USER_ATTITUDE__USEFULNESS:
				return isSetUsefulness();
			case carimModelPackage.USER_ATTITUDE__PLEASANTNESS:
				return isSetPleasantness();
			case carimModelPackage.USER_ATTITUDE__INTEGRATION:
				return isSetIntegration();
			case carimModelPackage.USER_ATTITUDE__SELF_EFFICACY:
				return isSetSelfEfficacy();
			case carimModelPackage.USER_ATTITUDE__COMFORT:
				return isSetComfort();
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
		if (usefulnessESet) result.append(usefulness); else result.append("<unset>");
		result.append(", pleasantness: ");
		if (pleasantnessESet) result.append(pleasantness); else result.append("<unset>");
		result.append(", integration: ");
		if (integrationESet) result.append(integration); else result.append("<unset>");
		result.append(", selfEfficacy: ");
		if (selfEfficacyESet) result.append(selfEfficacy); else result.append("<unset>");
		result.append(", comfort: ");
		if (comfortESet) result.append(comfort); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //UserAttitudeImpl
