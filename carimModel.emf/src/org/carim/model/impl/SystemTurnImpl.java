/**
 */
package org.carim.model.impl;

import org.carim.model.Cooperativity;
import org.carim.model.SpeechOutput;
import org.carim.model.SystemMetacomm;
import org.carim.model.SystemTurn;
import org.carim.model.carimModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Turn</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.carim.model.impl.SystemTurnImpl#getMetacomm <em>Metacomm</em>}</li>
 *   <li>{@link org.carim.model.impl.SystemTurnImpl#getSpeechOutput <em>Speech Output</em>}</li>
 *   <li>{@link org.carim.model.impl.SystemTurnImpl#getCooperativity <em>Cooperativity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SystemTurnImpl extends TurnImpl implements SystemTurn {
	/**
	 * The cached value of the '{@link #getMetacomm() <em>Metacomm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetacomm()
	 * @generated
	 * @ordered
	 */
	protected SystemMetacomm metacomm;

	/**
	 * The cached value of the '{@link #getSpeechOutput() <em>Speech Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeechOutput()
	 * @generated
	 * @ordered
	 */
	protected SpeechOutput speechOutput;

	/**
	 * The cached value of the '{@link #getCooperativity() <em>Cooperativity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCooperativity()
	 * @generated
	 * @ordered
	 */
	protected Cooperativity cooperativity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemTurnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return carimModelPackage.Literals.SYSTEM_TURN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemMetacomm getMetacomm() {
		return metacomm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetacomm(SystemMetacomm newMetacomm, NotificationChain msgs) {
		SystemMetacomm oldMetacomm = metacomm;
		metacomm = newMetacomm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, carimModelPackage.SYSTEM_TURN__METACOMM, oldMetacomm, newMetacomm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetacomm(SystemMetacomm newMetacomm) {
		if (newMetacomm != metacomm) {
			NotificationChain msgs = null;
			if (metacomm != null)
				msgs = ((InternalEObject)metacomm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - carimModelPackage.SYSTEM_TURN__METACOMM, null, msgs);
			if (newMetacomm != null)
				msgs = ((InternalEObject)newMetacomm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - carimModelPackage.SYSTEM_TURN__METACOMM, null, msgs);
			msgs = basicSetMetacomm(newMetacomm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.SYSTEM_TURN__METACOMM, newMetacomm, newMetacomm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpeechOutput getSpeechOutput() {
		return speechOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpeechOutput(SpeechOutput newSpeechOutput, NotificationChain msgs) {
		SpeechOutput oldSpeechOutput = speechOutput;
		speechOutput = newSpeechOutput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, carimModelPackage.SYSTEM_TURN__SPEECH_OUTPUT, oldSpeechOutput, newSpeechOutput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpeechOutput(SpeechOutput newSpeechOutput) {
		if (newSpeechOutput != speechOutput) {
			NotificationChain msgs = null;
			if (speechOutput != null)
				msgs = ((InternalEObject)speechOutput).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - carimModelPackage.SYSTEM_TURN__SPEECH_OUTPUT, null, msgs);
			if (newSpeechOutput != null)
				msgs = ((InternalEObject)newSpeechOutput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - carimModelPackage.SYSTEM_TURN__SPEECH_OUTPUT, null, msgs);
			msgs = basicSetSpeechOutput(newSpeechOutput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.SYSTEM_TURN__SPEECH_OUTPUT, newSpeechOutput, newSpeechOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cooperativity getCooperativity() {
		return cooperativity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCooperativity(Cooperativity newCooperativity, NotificationChain msgs) {
		Cooperativity oldCooperativity = cooperativity;
		cooperativity = newCooperativity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, carimModelPackage.SYSTEM_TURN__COOPERATIVITY, oldCooperativity, newCooperativity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCooperativity(Cooperativity newCooperativity) {
		if (newCooperativity != cooperativity) {
			NotificationChain msgs = null;
			if (cooperativity != null)
				msgs = ((InternalEObject)cooperativity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - carimModelPackage.SYSTEM_TURN__COOPERATIVITY, null, msgs);
			if (newCooperativity != null)
				msgs = ((InternalEObject)newCooperativity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - carimModelPackage.SYSTEM_TURN__COOPERATIVITY, null, msgs);
			msgs = basicSetCooperativity(newCooperativity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.SYSTEM_TURN__COOPERATIVITY, newCooperativity, newCooperativity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case carimModelPackage.SYSTEM_TURN__METACOMM:
				return basicSetMetacomm(null, msgs);
			case carimModelPackage.SYSTEM_TURN__SPEECH_OUTPUT:
				return basicSetSpeechOutput(null, msgs);
			case carimModelPackage.SYSTEM_TURN__COOPERATIVITY:
				return basicSetCooperativity(null, msgs);
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
			case carimModelPackage.SYSTEM_TURN__METACOMM:
				return getMetacomm();
			case carimModelPackage.SYSTEM_TURN__SPEECH_OUTPUT:
				return getSpeechOutput();
			case carimModelPackage.SYSTEM_TURN__COOPERATIVITY:
				return getCooperativity();
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
			case carimModelPackage.SYSTEM_TURN__METACOMM:
				setMetacomm((SystemMetacomm)newValue);
				return;
			case carimModelPackage.SYSTEM_TURN__SPEECH_OUTPUT:
				setSpeechOutput((SpeechOutput)newValue);
				return;
			case carimModelPackage.SYSTEM_TURN__COOPERATIVITY:
				setCooperativity((Cooperativity)newValue);
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
			case carimModelPackage.SYSTEM_TURN__METACOMM:
				setMetacomm((SystemMetacomm)null);
				return;
			case carimModelPackage.SYSTEM_TURN__SPEECH_OUTPUT:
				setSpeechOutput((SpeechOutput)null);
				return;
			case carimModelPackage.SYSTEM_TURN__COOPERATIVITY:
				setCooperativity((Cooperativity)null);
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
			case carimModelPackage.SYSTEM_TURN__METACOMM:
				return metacomm != null;
			case carimModelPackage.SYSTEM_TURN__SPEECH_OUTPUT:
				return speechOutput != null;
			case carimModelPackage.SYSTEM_TURN__COOPERATIVITY:
				return cooperativity != null;
		}
		return super.eIsSet(featureID);
	}

} //SystemTurnImpl
