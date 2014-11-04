/**
 */
package org.carim.model.impl;

import java.util.Collection;
import org.carim.model.MmiTypeT;
import org.carim.model.ModTypeT;
import org.carim.model.ModalityAppropriateness;
import org.carim.model.ModalityChange;
import org.carim.model.ModalityInfo;
import org.carim.model.ModalitySynchroni;
import org.carim.model.carimModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modality Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.carim.model.impl.ModalityInfoImpl#getModalityType <em>Modality Type</em>}</li>
 *   <li>{@link org.carim.model.impl.ModalityInfoImpl#getMminteractionType <em>Mminteraction Type</em>}</li>
 *   <li>{@link org.carim.model.impl.ModalityInfoImpl#getAppropriateness <em>Appropriateness</em>}</li>
 *   <li>{@link org.carim.model.impl.ModalityInfoImpl#getSynchroni <em>Synchroni</em>}</li>
 *   <li>{@link org.carim.model.impl.ModalityInfoImpl#getChange <em>Change</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModalityInfoImpl extends EObjectImpl implements ModalityInfo {
	/**
	 * The cached value of the '{@link #getModalityType() <em>Modality Type</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModalityType()
	 * @generated
	 * @ordered
	 */
	protected EList<ModTypeT> modalityType;

	/**
	 * The default value of the '{@link #getMminteractionType() <em>Mminteraction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMminteractionType()
	 * @generated
	 * @ordered
	 */
	protected static final MmiTypeT MMINTERACTION_TYPE_EDEFAULT = MmiTypeT.UNIMODAL;

	/**
	 * The cached value of the '{@link #getMminteractionType() <em>Mminteraction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMminteractionType()
	 * @generated
	 * @ordered
	 */
	protected MmiTypeT mminteractionType = MMINTERACTION_TYPE_EDEFAULT;

	/**
	 * This is true if the Mminteraction Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mminteractionTypeESet;

	/**
	 * The cached value of the '{@link #getAppropriateness() <em>Appropriateness</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppropriateness()
	 * @generated
	 * @ordered
	 */
	protected ModalityAppropriateness appropriateness;

	/**
	 * The cached value of the '{@link #getSynchroni() <em>Synchroni</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynchroni()
	 * @generated
	 * @ordered
	 */
	protected ModalitySynchroni synchroni;

	/**
	 * The cached value of the '{@link #getChange() <em>Change</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChange()
	 * @generated
	 * @ordered
	 */
	protected ModalityChange change;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModalityInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return carimModelPackage.Literals.MODALITY_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModTypeT> getModalityType() {
		if (modalityType == null) {
			modalityType = new EDataTypeEList<ModTypeT>(ModTypeT.class, this, carimModelPackage.MODALITY_INFO__MODALITY_TYPE);
		}
		return modalityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MmiTypeT getMminteractionType() {
		return mminteractionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMminteractionType(MmiTypeT newMminteractionType) {
		MmiTypeT oldMminteractionType = mminteractionType;
		mminteractionType = newMminteractionType == null ? MMINTERACTION_TYPE_EDEFAULT : newMminteractionType;
		boolean oldMminteractionTypeESet = mminteractionTypeESet;
		mminteractionTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.MODALITY_INFO__MMINTERACTION_TYPE, oldMminteractionType, mminteractionType, !oldMminteractionTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMminteractionType() {
		MmiTypeT oldMminteractionType = mminteractionType;
		boolean oldMminteractionTypeESet = mminteractionTypeESet;
		mminteractionType = MMINTERACTION_TYPE_EDEFAULT;
		mminteractionTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, carimModelPackage.MODALITY_INFO__MMINTERACTION_TYPE, oldMminteractionType, MMINTERACTION_TYPE_EDEFAULT, oldMminteractionTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMminteractionType() {
		return mminteractionTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModalityAppropriateness getAppropriateness() {
		return appropriateness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAppropriateness(ModalityAppropriateness newAppropriateness, NotificationChain msgs) {
		ModalityAppropriateness oldAppropriateness = appropriateness;
		appropriateness = newAppropriateness;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, carimModelPackage.MODALITY_INFO__APPROPRIATENESS, oldAppropriateness, newAppropriateness);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppropriateness(ModalityAppropriateness newAppropriateness) {
		if (newAppropriateness != appropriateness) {
			NotificationChain msgs = null;
			if (appropriateness != null)
				msgs = ((InternalEObject)appropriateness).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - carimModelPackage.MODALITY_INFO__APPROPRIATENESS, null, msgs);
			if (newAppropriateness != null)
				msgs = ((InternalEObject)newAppropriateness).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - carimModelPackage.MODALITY_INFO__APPROPRIATENESS, null, msgs);
			msgs = basicSetAppropriateness(newAppropriateness, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.MODALITY_INFO__APPROPRIATENESS, newAppropriateness, newAppropriateness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModalitySynchroni getSynchroni() {
		return synchroni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSynchroni(ModalitySynchroni newSynchroni, NotificationChain msgs) {
		ModalitySynchroni oldSynchroni = synchroni;
		synchroni = newSynchroni;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, carimModelPackage.MODALITY_INFO__SYNCHRONI, oldSynchroni, newSynchroni);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSynchroni(ModalitySynchroni newSynchroni) {
		if (newSynchroni != synchroni) {
			NotificationChain msgs = null;
			if (synchroni != null)
				msgs = ((InternalEObject)synchroni).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - carimModelPackage.MODALITY_INFO__SYNCHRONI, null, msgs);
			if (newSynchroni != null)
				msgs = ((InternalEObject)newSynchroni).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - carimModelPackage.MODALITY_INFO__SYNCHRONI, null, msgs);
			msgs = basicSetSynchroni(newSynchroni, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.MODALITY_INFO__SYNCHRONI, newSynchroni, newSynchroni));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModalityChange getChange() {
		return change;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChange(ModalityChange newChange, NotificationChain msgs) {
		ModalityChange oldChange = change;
		change = newChange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, carimModelPackage.MODALITY_INFO__CHANGE, oldChange, newChange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChange(ModalityChange newChange) {
		if (newChange != change) {
			NotificationChain msgs = null;
			if (change != null)
				msgs = ((InternalEObject)change).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - carimModelPackage.MODALITY_INFO__CHANGE, null, msgs);
			if (newChange != null)
				msgs = ((InternalEObject)newChange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - carimModelPackage.MODALITY_INFO__CHANGE, null, msgs);
			msgs = basicSetChange(newChange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.MODALITY_INFO__CHANGE, newChange, newChange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case carimModelPackage.MODALITY_INFO__APPROPRIATENESS:
				return basicSetAppropriateness(null, msgs);
			case carimModelPackage.MODALITY_INFO__SYNCHRONI:
				return basicSetSynchroni(null, msgs);
			case carimModelPackage.MODALITY_INFO__CHANGE:
				return basicSetChange(null, msgs);
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
			case carimModelPackage.MODALITY_INFO__MODALITY_TYPE:
				return getModalityType();
			case carimModelPackage.MODALITY_INFO__MMINTERACTION_TYPE:
				return getMminteractionType();
			case carimModelPackage.MODALITY_INFO__APPROPRIATENESS:
				return getAppropriateness();
			case carimModelPackage.MODALITY_INFO__SYNCHRONI:
				return getSynchroni();
			case carimModelPackage.MODALITY_INFO__CHANGE:
				return getChange();
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
			case carimModelPackage.MODALITY_INFO__MODALITY_TYPE:
				getModalityType().clear();
				getModalityType().addAll((Collection<? extends ModTypeT>)newValue);
				return;
			case carimModelPackage.MODALITY_INFO__MMINTERACTION_TYPE:
				setMminteractionType((MmiTypeT)newValue);
				return;
			case carimModelPackage.MODALITY_INFO__APPROPRIATENESS:
				setAppropriateness((ModalityAppropriateness)newValue);
				return;
			case carimModelPackage.MODALITY_INFO__SYNCHRONI:
				setSynchroni((ModalitySynchroni)newValue);
				return;
			case carimModelPackage.MODALITY_INFO__CHANGE:
				setChange((ModalityChange)newValue);
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
			case carimModelPackage.MODALITY_INFO__MODALITY_TYPE:
				getModalityType().clear();
				return;
			case carimModelPackage.MODALITY_INFO__MMINTERACTION_TYPE:
				unsetMminteractionType();
				return;
			case carimModelPackage.MODALITY_INFO__APPROPRIATENESS:
				setAppropriateness((ModalityAppropriateness)null);
				return;
			case carimModelPackage.MODALITY_INFO__SYNCHRONI:
				setSynchroni((ModalitySynchroni)null);
				return;
			case carimModelPackage.MODALITY_INFO__CHANGE:
				setChange((ModalityChange)null);
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
			case carimModelPackage.MODALITY_INFO__MODALITY_TYPE:
				return modalityType != null && !modalityType.isEmpty();
			case carimModelPackage.MODALITY_INFO__MMINTERACTION_TYPE:
				return isSetMminteractionType();
			case carimModelPackage.MODALITY_INFO__APPROPRIATENESS:
				return appropriateness != null;
			case carimModelPackage.MODALITY_INFO__SYNCHRONI:
				return synchroni != null;
			case carimModelPackage.MODALITY_INFO__CHANGE:
				return change != null;
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
		result.append(" (modalityType: ");
		result.append(modalityType);
		result.append(", mminteractionType: ");
		if (mminteractionTypeESet) result.append(mminteractionType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ModalityInfoImpl
