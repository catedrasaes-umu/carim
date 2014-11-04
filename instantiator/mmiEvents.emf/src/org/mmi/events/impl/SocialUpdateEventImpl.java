/**
 */
package org.mmi.events.impl;

import org.carim.model.SocialArenaT;
import org.carim.model.SocialCompanyT;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.mmi.events.EventsPackage;
import org.mmi.events.SocialUpdateEvent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Social Update Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mmi.events.impl.SocialUpdateEventImpl#getSocialCompany <em>Social Company</em>}</li>
 *   <li>{@link org.mmi.events.impl.SocialUpdateEventImpl#getSocialArena <em>Social Arena</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SocialUpdateEventImpl extends SocialContextEventImpl implements SocialUpdateEvent {
	/**
	 * The default value of the '{@link #getSocialCompany() <em>Social Company</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialCompany()
	 * @generated
	 * @ordered
	 */
	protected static final SocialCompanyT SOCIAL_COMPANY_EDEFAULT = SocialCompanyT.NONE;

	/**
	 * The cached value of the '{@link #getSocialCompany() <em>Social Company</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialCompany()
	 * @generated
	 * @ordered
	 */
	protected SocialCompanyT socialCompany = SOCIAL_COMPANY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSocialArena() <em>Social Arena</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialArena()
	 * @generated
	 * @ordered
	 */
	protected static final SocialArenaT SOCIAL_ARENA_EDEFAULT = SocialArenaT.NONE;

	/**
	 * The cached value of the '{@link #getSocialArena() <em>Social Arena</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialArena()
	 * @generated
	 * @ordered
	 */
	protected SocialArenaT socialArena = SOCIAL_ARENA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SocialUpdateEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EventsPackage.Literals.SOCIAL_UPDATE_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialCompanyT getSocialCompany() {
		return socialCompany;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSocialCompany(SocialCompanyT newSocialCompany) {
		SocialCompanyT oldSocialCompany = socialCompany;
		socialCompany = newSocialCompany == null ? SOCIAL_COMPANY_EDEFAULT : newSocialCompany;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.SOCIAL_UPDATE_EVENT__SOCIAL_COMPANY, oldSocialCompany, socialCompany));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialArenaT getSocialArena() {
		return socialArena;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSocialArena(SocialArenaT newSocialArena) {
		SocialArenaT oldSocialArena = socialArena;
		socialArena = newSocialArena == null ? SOCIAL_ARENA_EDEFAULT : newSocialArena;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.SOCIAL_UPDATE_EVENT__SOCIAL_ARENA, oldSocialArena, socialArena));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EventsPackage.SOCIAL_UPDATE_EVENT__SOCIAL_COMPANY:
				return getSocialCompany();
			case EventsPackage.SOCIAL_UPDATE_EVENT__SOCIAL_ARENA:
				return getSocialArena();
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
			case EventsPackage.SOCIAL_UPDATE_EVENT__SOCIAL_COMPANY:
				setSocialCompany((SocialCompanyT)newValue);
				return;
			case EventsPackage.SOCIAL_UPDATE_EVENT__SOCIAL_ARENA:
				setSocialArena((SocialArenaT)newValue);
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
			case EventsPackage.SOCIAL_UPDATE_EVENT__SOCIAL_COMPANY:
				setSocialCompany(SOCIAL_COMPANY_EDEFAULT);
				return;
			case EventsPackage.SOCIAL_UPDATE_EVENT__SOCIAL_ARENA:
				setSocialArena(SOCIAL_ARENA_EDEFAULT);
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
			case EventsPackage.SOCIAL_UPDATE_EVENT__SOCIAL_COMPANY:
				return socialCompany != SOCIAL_COMPANY_EDEFAULT;
			case EventsPackage.SOCIAL_UPDATE_EVENT__SOCIAL_ARENA:
				return socialArena != SOCIAL_ARENA_EDEFAULT;
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
		result.append(" (socialCompany: ");
		result.append(socialCompany);
		result.append(", socialArena: ");
		result.append(socialArena);
		result.append(')');
		return result.toString();
	}

} //SocialUpdateEventImpl
