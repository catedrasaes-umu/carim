/**
 */
package org.carim.model.impl;

import org.carim.model.SocialArenaT;
import org.carim.model.SocialCompanyT;
import org.carim.model.SocialContext;
import org.carim.model.carimModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Social Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.carim.model.impl.SocialContextImpl#getCompany <em>Company</em>}</li>
 *   <li>{@link org.carim.model.impl.SocialContextImpl#getArena <em>Arena</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SocialContextImpl extends EObjectImpl implements SocialContext {
	/**
	 * The default value of the '{@link #getCompany() <em>Company</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompany()
	 * @generated
	 * @ordered
	 */
	protected static final SocialCompanyT COMPANY_EDEFAULT = SocialCompanyT.NONE;

	/**
	 * The cached value of the '{@link #getCompany() <em>Company</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompany()
	 * @generated
	 * @ordered
	 */
	protected SocialCompanyT company = COMPANY_EDEFAULT;

	/**
	 * This is true if the Company attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean companyESet;

	/**
	 * The default value of the '{@link #getArena() <em>Arena</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArena()
	 * @generated
	 * @ordered
	 */
	protected static final SocialArenaT ARENA_EDEFAULT = SocialArenaT.NONE;

	/**
	 * The cached value of the '{@link #getArena() <em>Arena</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArena()
	 * @generated
	 * @ordered
	 */
	protected SocialArenaT arena = ARENA_EDEFAULT;

	/**
	 * This is true if the Arena attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean arenaESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SocialContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return carimModelPackage.Literals.SOCIAL_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialCompanyT getCompany() {
		return company;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompany(SocialCompanyT newCompany) {
		SocialCompanyT oldCompany = company;
		company = newCompany == null ? COMPANY_EDEFAULT : newCompany;
		boolean oldCompanyESet = companyESet;
		companyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.SOCIAL_CONTEXT__COMPANY, oldCompany, company, !oldCompanyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCompany() {
		SocialCompanyT oldCompany = company;
		boolean oldCompanyESet = companyESet;
		company = COMPANY_EDEFAULT;
		companyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, carimModelPackage.SOCIAL_CONTEXT__COMPANY, oldCompany, COMPANY_EDEFAULT, oldCompanyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCompany() {
		return companyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialArenaT getArena() {
		return arena;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArena(SocialArenaT newArena) {
		SocialArenaT oldArena = arena;
		arena = newArena == null ? ARENA_EDEFAULT : newArena;
		boolean oldArenaESet = arenaESet;
		arenaESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.SOCIAL_CONTEXT__ARENA, oldArena, arena, !oldArenaESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetArena() {
		SocialArenaT oldArena = arena;
		boolean oldArenaESet = arenaESet;
		arena = ARENA_EDEFAULT;
		arenaESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, carimModelPackage.SOCIAL_CONTEXT__ARENA, oldArena, ARENA_EDEFAULT, oldArenaESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetArena() {
		return arenaESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case carimModelPackage.SOCIAL_CONTEXT__COMPANY:
				return getCompany();
			case carimModelPackage.SOCIAL_CONTEXT__ARENA:
				return getArena();
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
			case carimModelPackage.SOCIAL_CONTEXT__COMPANY:
				setCompany((SocialCompanyT)newValue);
				return;
			case carimModelPackage.SOCIAL_CONTEXT__ARENA:
				setArena((SocialArenaT)newValue);
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
			case carimModelPackage.SOCIAL_CONTEXT__COMPANY:
				unsetCompany();
				return;
			case carimModelPackage.SOCIAL_CONTEXT__ARENA:
				unsetArena();
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
			case carimModelPackage.SOCIAL_CONTEXT__COMPANY:
				return isSetCompany();
			case carimModelPackage.SOCIAL_CONTEXT__ARENA:
				return isSetArena();
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
		result.append(" (company: ");
		if (companyESet) result.append(company); else result.append("<unset>");
		result.append(", arena: ");
		if (arenaESet) result.append(arena); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SocialContextImpl
