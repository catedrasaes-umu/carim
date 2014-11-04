/**
 */
package org.mmi.events.impl;

import org.eclipse.emf.ecore.EClass;

import org.mmi.events.EventsPackage;
import org.mmi.events.ShakeEvent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shake Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ShakeEventImpl extends MotionEventImpl implements ShakeEvent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShakeEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EventsPackage.Literals.SHAKE_EVENT;
	}

} //ShakeEventImpl
