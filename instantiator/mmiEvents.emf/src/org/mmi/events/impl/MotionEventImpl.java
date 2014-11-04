/**
 */
package org.mmi.events.impl;

import org.eclipse.emf.ecore.EClass;

import org.mmi.events.EventsPackage;
import org.mmi.events.MotionEvent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Motion Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class MotionEventImpl extends InputEventImpl implements MotionEvent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MotionEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EventsPackage.Literals.MOTION_EVENT;
	}

} //MotionEventImpl
