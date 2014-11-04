/**
 */
package org.carim.model.impl;

import org.carim.model.GuiInput;
import org.carim.model.MotionInput;
import org.carim.model.SpeechInput;
import org.carim.model.UserMetacomm;
import org.carim.model.UserTurn;
import org.carim.model.carimModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Turn</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.carim.model.impl.UserTurnImpl#getMetacomm <em>Metacomm</em>}</li>
 *   <li>{@link org.carim.model.impl.UserTurnImpl#getSpeechInput <em>Speech Input</em>}</li>
 *   <li>{@link org.carim.model.impl.UserTurnImpl#getGuiInput <em>Gui Input</em>}</li>
 *   <li>{@link org.carim.model.impl.UserTurnImpl#getMotionInput <em>Motion Input</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserTurnImpl extends TurnImpl implements UserTurn {
	/**
	 * The cached value of the '{@link #getMetacomm() <em>Metacomm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetacomm()
	 * @generated
	 * @ordered
	 */
	protected UserMetacomm metacomm;

	/**
	 * The cached value of the '{@link #getSpeechInput() <em>Speech Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeechInput()
	 * @generated
	 * @ordered
	 */
	protected SpeechInput speechInput;

	/**
	 * The cached value of the '{@link #getGuiInput() <em>Gui Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuiInput()
	 * @generated
	 * @ordered
	 */
	protected GuiInput guiInput;

	/**
	 * The cached value of the '{@link #getMotionInput() <em>Motion Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotionInput()
	 * @generated
	 * @ordered
	 */
	protected MotionInput motionInput;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserTurnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return carimModelPackage.Literals.USER_TURN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserMetacomm getMetacomm() {
		return metacomm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetacomm(UserMetacomm newMetacomm, NotificationChain msgs) {
		UserMetacomm oldMetacomm = metacomm;
		metacomm = newMetacomm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, carimModelPackage.USER_TURN__METACOMM, oldMetacomm, newMetacomm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetacomm(UserMetacomm newMetacomm) {
		if (newMetacomm != metacomm) {
			NotificationChain msgs = null;
			if (metacomm != null)
				msgs = ((InternalEObject)metacomm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - carimModelPackage.USER_TURN__METACOMM, null, msgs);
			if (newMetacomm != null)
				msgs = ((InternalEObject)newMetacomm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - carimModelPackage.USER_TURN__METACOMM, null, msgs);
			msgs = basicSetMetacomm(newMetacomm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.USER_TURN__METACOMM, newMetacomm, newMetacomm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpeechInput getSpeechInput() {
		return speechInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpeechInput(SpeechInput newSpeechInput, NotificationChain msgs) {
		SpeechInput oldSpeechInput = speechInput;
		speechInput = newSpeechInput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, carimModelPackage.USER_TURN__SPEECH_INPUT, oldSpeechInput, newSpeechInput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpeechInput(SpeechInput newSpeechInput) {
		if (newSpeechInput != speechInput) {
			NotificationChain msgs = null;
			if (speechInput != null)
				msgs = ((InternalEObject)speechInput).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - carimModelPackage.USER_TURN__SPEECH_INPUT, null, msgs);
			if (newSpeechInput != null)
				msgs = ((InternalEObject)newSpeechInput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - carimModelPackage.USER_TURN__SPEECH_INPUT, null, msgs);
			msgs = basicSetSpeechInput(newSpeechInput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.USER_TURN__SPEECH_INPUT, newSpeechInput, newSpeechInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiInput getGuiInput() {
		return guiInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuiInput(GuiInput newGuiInput, NotificationChain msgs) {
		GuiInput oldGuiInput = guiInput;
		guiInput = newGuiInput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, carimModelPackage.USER_TURN__GUI_INPUT, oldGuiInput, newGuiInput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuiInput(GuiInput newGuiInput) {
		if (newGuiInput != guiInput) {
			NotificationChain msgs = null;
			if (guiInput != null)
				msgs = ((InternalEObject)guiInput).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - carimModelPackage.USER_TURN__GUI_INPUT, null, msgs);
			if (newGuiInput != null)
				msgs = ((InternalEObject)newGuiInput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - carimModelPackage.USER_TURN__GUI_INPUT, null, msgs);
			msgs = basicSetGuiInput(newGuiInput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.USER_TURN__GUI_INPUT, newGuiInput, newGuiInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MotionInput getMotionInput() {
		return motionInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMotionInput(MotionInput newMotionInput, NotificationChain msgs) {
		MotionInput oldMotionInput = motionInput;
		motionInput = newMotionInput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, carimModelPackage.USER_TURN__MOTION_INPUT, oldMotionInput, newMotionInput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMotionInput(MotionInput newMotionInput) {
		if (newMotionInput != motionInput) {
			NotificationChain msgs = null;
			if (motionInput != null)
				msgs = ((InternalEObject)motionInput).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - carimModelPackage.USER_TURN__MOTION_INPUT, null, msgs);
			if (newMotionInput != null)
				msgs = ((InternalEObject)newMotionInput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - carimModelPackage.USER_TURN__MOTION_INPUT, null, msgs);
			msgs = basicSetMotionInput(newMotionInput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.USER_TURN__MOTION_INPUT, newMotionInput, newMotionInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case carimModelPackage.USER_TURN__METACOMM:
				return basicSetMetacomm(null, msgs);
			case carimModelPackage.USER_TURN__SPEECH_INPUT:
				return basicSetSpeechInput(null, msgs);
			case carimModelPackage.USER_TURN__GUI_INPUT:
				return basicSetGuiInput(null, msgs);
			case carimModelPackage.USER_TURN__MOTION_INPUT:
				return basicSetMotionInput(null, msgs);
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
			case carimModelPackage.USER_TURN__METACOMM:
				return getMetacomm();
			case carimModelPackage.USER_TURN__SPEECH_INPUT:
				return getSpeechInput();
			case carimModelPackage.USER_TURN__GUI_INPUT:
				return getGuiInput();
			case carimModelPackage.USER_TURN__MOTION_INPUT:
				return getMotionInput();
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
			case carimModelPackage.USER_TURN__METACOMM:
				setMetacomm((UserMetacomm)newValue);
				return;
			case carimModelPackage.USER_TURN__SPEECH_INPUT:
				setSpeechInput((SpeechInput)newValue);
				return;
			case carimModelPackage.USER_TURN__GUI_INPUT:
				setGuiInput((GuiInput)newValue);
				return;
			case carimModelPackage.USER_TURN__MOTION_INPUT:
				setMotionInput((MotionInput)newValue);
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
			case carimModelPackage.USER_TURN__METACOMM:
				setMetacomm((UserMetacomm)null);
				return;
			case carimModelPackage.USER_TURN__SPEECH_INPUT:
				setSpeechInput((SpeechInput)null);
				return;
			case carimModelPackage.USER_TURN__GUI_INPUT:
				setGuiInput((GuiInput)null);
				return;
			case carimModelPackage.USER_TURN__MOTION_INPUT:
				setMotionInput((MotionInput)null);
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
			case carimModelPackage.USER_TURN__METACOMM:
				return metacomm != null;
			case carimModelPackage.USER_TURN__SPEECH_INPUT:
				return speechInput != null;
			case carimModelPackage.USER_TURN__GUI_INPUT:
				return guiInput != null;
			case carimModelPackage.USER_TURN__MOTION_INPUT:
				return motionInput != null;
		}
		return super.eIsSet(featureID);
	}

} //UserTurnImpl
