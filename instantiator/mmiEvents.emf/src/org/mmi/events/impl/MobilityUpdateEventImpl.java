/**
 */
package org.mmi.events.impl;

import org.carim.model.MobilityLevelT;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.mmi.events.EventsPackage;
import org.mmi.events.MobilityUpdateEvent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mobility Update Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mmi.events.impl.MobilityUpdateEventImpl#getMobilityLevel <em>Mobility Level</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MobilityUpdateEventImpl extends LocationTimeContextEventImpl implements MobilityUpdateEvent {
	/**
	 * The default value of the '{@link #getMobilityLevel() <em>Mobility Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMobilityLevel()
	 * @generated
	 * @ordered
	 */
	protected static final MobilityLevelT MOBILITY_LEVEL_EDEFAULT = MobilityLevelT.NONE;

	/**
	 * The cached value of the '{@link #getMobilityLevel() <em>Mobility Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMobilityLevel()
	 * @generated
	 * @ordered
	 */
	protected MobilityLevelT mobilityLevel = MOBILITY_LEVEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobilityUpdateEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EventsPackage.Literals.MOBILITY_UPDATE_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobilityLevelT getMobilityLevel() {
		return mobilityLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMobilityLevel(MobilityLevelT newMobilityLevel) {
		MobilityLevelT oldMobilityLevel = mobilityLevel;
		mobilityLevel = newMobilityLevel == null ? MOBILITY_LEVEL_EDEFAULT : newMobilityLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.MOBILITY_UPDATE_EVENT__MOBILITY_LEVEL, oldMobilityLevel, mobilityLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EventsPackage.MOBILITY_UPDATE_EVENT__MOBILITY_LEVEL:
				return getMobilityLevel();
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
			case EventsPackage.MOBILITY_UPDATE_EVENT__MOBILITY_LEVEL:
				setMobilityLevel((MobilityLevelT)newValue);
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
			case EventsPackage.MOBILITY_UPDATE_EVENT__MOBILITY_LEVEL:
				setMobilityLevel(MOBILITY_LEVEL_EDEFAULT);
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
			case EventsPackage.MOBILITY_UPDATE_EVENT__MOBILITY_LEVEL:
				return mobilityLevel != MOBILITY_LEVEL_EDEFAULT;
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
		result.append(" (mobilityLevel: ");
		result.append(mobilityLevel);
		result.append(')');
		return result.toString();
	}

} //MobilityUpdateEventImpl
