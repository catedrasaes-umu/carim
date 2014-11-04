/**
 */
package org.carim.model.impl;

import java.util.Collection;

import org.carim.model.Dialogue;
import org.carim.model.Trial;
import org.carim.model.UserData;
import org.carim.model.carimModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trial</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.carim.model.impl.TrialImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.carim.model.impl.TrialImpl#getUserData <em>User Data</em>}</li>
 *   <li>{@link org.carim.model.impl.TrialImpl#getDialogues <em>Dialogues</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TrialImpl extends EObjectImpl implements Trial {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUserData() <em>User Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserData()
	 * @generated
	 * @ordered
	 */
	protected UserData userData;

	/**
	 * The cached value of the '{@link #getDialogues() <em>Dialogues</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDialogues()
	 * @generated
	 * @ordered
	 */
	protected EList<Dialogue> dialogues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrialImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return carimModelPackage.Literals.TRIAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.TRIAL__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserData getUserData() {
		return userData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserData(UserData newUserData, NotificationChain msgs) {
		UserData oldUserData = userData;
		userData = newUserData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, carimModelPackage.TRIAL__USER_DATA, oldUserData, newUserData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserData(UserData newUserData) {
		if (newUserData != userData) {
			NotificationChain msgs = null;
			if (userData != null)
				msgs = ((InternalEObject)userData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - carimModelPackage.TRIAL__USER_DATA, null, msgs);
			if (newUserData != null)
				msgs = ((InternalEObject)newUserData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - carimModelPackage.TRIAL__USER_DATA, null, msgs);
			msgs = basicSetUserData(newUserData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.TRIAL__USER_DATA, newUserData, newUserData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dialogue> getDialogues() {
		if (dialogues == null) {
			dialogues = new EObjectContainmentEList<Dialogue>(Dialogue.class, this, carimModelPackage.TRIAL__DIALOGUES);
		}
		return dialogues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case carimModelPackage.TRIAL__USER_DATA:
				return basicSetUserData(null, msgs);
			case carimModelPackage.TRIAL__DIALOGUES:
				return ((InternalEList<?>)getDialogues()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case carimModelPackage.TRIAL__DESCRIPTION:
				return getDescription();
			case carimModelPackage.TRIAL__USER_DATA:
				return getUserData();
			case carimModelPackage.TRIAL__DIALOGUES:
				return getDialogues();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case carimModelPackage.TRIAL__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case carimModelPackage.TRIAL__USER_DATA:
				setUserData((UserData)newValue);
				return;
			case carimModelPackage.TRIAL__DIALOGUES:
				getDialogues().clear();
				getDialogues().addAll((Collection<? extends Dialogue>)newValue);
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
			case carimModelPackage.TRIAL__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case carimModelPackage.TRIAL__USER_DATA:
				setUserData((UserData)null);
				return;
			case carimModelPackage.TRIAL__DIALOGUES:
				getDialogues().clear();
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
			case carimModelPackage.TRIAL__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case carimModelPackage.TRIAL__USER_DATA:
				return userData != null;
			case carimModelPackage.TRIAL__DIALOGUES:
				return dialogues != null && !dialogues.isEmpty();
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
		result.append(" (description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //TrialImpl
