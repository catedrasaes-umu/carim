/**
 */
package org.carim.model.impl;

import java.util.Collection;

import org.carim.model.Dialogue;
import org.carim.model.DialogueStepT;
import org.carim.model.Task;
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
 * An implementation of the model object '<em><b>Dialogue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.carim.model.impl.DialogueImpl#getBaseTimestamp <em>Base Timestamp</em>}</li>
 *   <li>{@link org.carim.model.impl.DialogueImpl#getTask <em>Task</em>}</li>
 *   <li>{@link org.carim.model.impl.DialogueImpl#getStep <em>Step</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DialogueImpl extends EObjectImpl implements Dialogue {
	/**
	 * The default value of the '{@link #getBaseTimestamp() <em>Base Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final long BASE_TIMESTAMP_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getBaseTimestamp() <em>Base Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseTimestamp()
	 * @generated
	 * @ordered
	 */
	protected long baseTimestamp = BASE_TIMESTAMP_EDEFAULT;

	/**
	 * This is true if the Base Timestamp attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean baseTimestampESet;

	/**
	 * The cached value of the '{@link #getTask() <em>Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask()
	 * @generated
	 * @ordered
	 */
	protected Task task;

	/**
	 * The cached value of the '{@link #getStep() <em>Step</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected EList<DialogueStepT> step;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DialogueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return carimModelPackage.Literals.DIALOGUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getBaseTimestamp() {
		return baseTimestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseTimestamp(long newBaseTimestamp) {
		long oldBaseTimestamp = baseTimestamp;
		baseTimestamp = newBaseTimestamp;
		boolean oldBaseTimestampESet = baseTimestampESet;
		baseTimestampESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.DIALOGUE__BASE_TIMESTAMP, oldBaseTimestamp, baseTimestamp, !oldBaseTimestampESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBaseTimestamp() {
		long oldBaseTimestamp = baseTimestamp;
		boolean oldBaseTimestampESet = baseTimestampESet;
		baseTimestamp = BASE_TIMESTAMP_EDEFAULT;
		baseTimestampESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, carimModelPackage.DIALOGUE__BASE_TIMESTAMP, oldBaseTimestamp, BASE_TIMESTAMP_EDEFAULT, oldBaseTimestampESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBaseTimestamp() {
		return baseTimestampESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getTask() {
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTask(Task newTask, NotificationChain msgs) {
		Task oldTask = task;
		task = newTask;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, carimModelPackage.DIALOGUE__TASK, oldTask, newTask);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTask(Task newTask) {
		if (newTask != task) {
			NotificationChain msgs = null;
			if (task != null)
				msgs = ((InternalEObject)task).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - carimModelPackage.DIALOGUE__TASK, null, msgs);
			if (newTask != null)
				msgs = ((InternalEObject)newTask).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - carimModelPackage.DIALOGUE__TASK, null, msgs);
			msgs = basicSetTask(newTask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.DIALOGUE__TASK, newTask, newTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DialogueStepT> getStep() {
		if (step == null) {
			step = new EObjectContainmentEList<DialogueStepT>(DialogueStepT.class, this, carimModelPackage.DIALOGUE__STEP);
		}
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case carimModelPackage.DIALOGUE__TASK:
				return basicSetTask(null, msgs);
			case carimModelPackage.DIALOGUE__STEP:
				return ((InternalEList<?>)getStep()).basicRemove(otherEnd, msgs);
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
			case carimModelPackage.DIALOGUE__BASE_TIMESTAMP:
				return getBaseTimestamp();
			case carimModelPackage.DIALOGUE__TASK:
				return getTask();
			case carimModelPackage.DIALOGUE__STEP:
				return getStep();
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
			case carimModelPackage.DIALOGUE__BASE_TIMESTAMP:
				setBaseTimestamp((Long)newValue);
				return;
			case carimModelPackage.DIALOGUE__TASK:
				setTask((Task)newValue);
				return;
			case carimModelPackage.DIALOGUE__STEP:
				getStep().clear();
				getStep().addAll((Collection<? extends DialogueStepT>)newValue);
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
			case carimModelPackage.DIALOGUE__BASE_TIMESTAMP:
				unsetBaseTimestamp();
				return;
			case carimModelPackage.DIALOGUE__TASK:
				setTask((Task)null);
				return;
			case carimModelPackage.DIALOGUE__STEP:
				getStep().clear();
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
			case carimModelPackage.DIALOGUE__BASE_TIMESTAMP:
				return isSetBaseTimestamp();
			case carimModelPackage.DIALOGUE__TASK:
				return task != null;
			case carimModelPackage.DIALOGUE__STEP:
				return step != null && !step.isEmpty();
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
		result.append(" (baseTimestamp: ");
		if (baseTimestampESet) result.append(baseTimestamp); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DialogueImpl
