/**
 */
package org.mmi.events.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.mmi.events.EventsPackage;
import org.mmi.events.TimeUpdateEvent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Update Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mmi.events.impl.TimeUpdateEventImpl#getD_year <em>Dyear</em>}</li>
 *   <li>{@link org.mmi.events.impl.TimeUpdateEventImpl#getD_month <em>Dmonth</em>}</li>
 *   <li>{@link org.mmi.events.impl.TimeUpdateEventImpl#getD_day <em>Dday</em>}</li>
 *   <li>{@link org.mmi.events.impl.TimeUpdateEventImpl#getT_hours <em>Thours</em>}</li>
 *   <li>{@link org.mmi.events.impl.TimeUpdateEventImpl#getT_mins <em>Tmins</em>}</li>
 *   <li>{@link org.mmi.events.impl.TimeUpdateEventImpl#getT_secs <em>Tsecs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimeUpdateEventImpl extends LocationTimeContextEventImpl implements TimeUpdateEvent {
	/**
	 * The default value of the '{@link #getD_year() <em>Dyear</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getD_year()
	 * @generated
	 * @ordered
	 */
	protected static final int DYEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getD_year() <em>Dyear</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getD_year()
	 * @generated
	 * @ordered
	 */
	protected int d_year = DYEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getD_month() <em>Dmonth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getD_month()
	 * @generated
	 * @ordered
	 */
	protected static final int DMONTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getD_month() <em>Dmonth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getD_month()
	 * @generated
	 * @ordered
	 */
	protected int d_month = DMONTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getD_day() <em>Dday</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getD_day()
	 * @generated
	 * @ordered
	 */
	protected static final int DDAY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getD_day() <em>Dday</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getD_day()
	 * @generated
	 * @ordered
	 */
	protected int d_day = DDAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getT_hours() <em>Thours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getT_hours()
	 * @generated
	 * @ordered
	 */
	protected static final int THOURS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getT_hours() <em>Thours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getT_hours()
	 * @generated
	 * @ordered
	 */
	protected int t_hours = THOURS_EDEFAULT;

	/**
	 * The default value of the '{@link #getT_mins() <em>Tmins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getT_mins()
	 * @generated
	 * @ordered
	 */
	protected static final int TMINS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getT_mins() <em>Tmins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getT_mins()
	 * @generated
	 * @ordered
	 */
	protected int t_mins = TMINS_EDEFAULT;

	/**
	 * The default value of the '{@link #getT_secs() <em>Tsecs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getT_secs()
	 * @generated
	 * @ordered
	 */
	protected static final int TSECS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getT_secs() <em>Tsecs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getT_secs()
	 * @generated
	 * @ordered
	 */
	protected int t_secs = TSECS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeUpdateEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EventsPackage.Literals.TIME_UPDATE_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getT_hours() {
		return t_hours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setT_hours(int newT_hours) {
		int oldT_hours = t_hours;
		t_hours = newT_hours;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.TIME_UPDATE_EVENT__THOURS, oldT_hours, t_hours));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getT_mins() {
		return t_mins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setT_mins(int newT_mins) {
		int oldT_mins = t_mins;
		t_mins = newT_mins;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.TIME_UPDATE_EVENT__TMINS, oldT_mins, t_mins));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getT_secs() {
		return t_secs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setT_secs(int newT_secs) {
		int oldT_secs = t_secs;
		t_secs = newT_secs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.TIME_UPDATE_EVENT__TSECS, oldT_secs, t_secs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getD_year() {
		return d_year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setD_year(int newD_year) {
		int oldD_year = d_year;
		d_year = newD_year;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.TIME_UPDATE_EVENT__DYEAR, oldD_year, d_year));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getD_month() {
		return d_month;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setD_month(int newD_month) {
		int oldD_month = d_month;
		d_month = newD_month;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.TIME_UPDATE_EVENT__DMONTH, oldD_month, d_month));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getD_day() {
		return d_day;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setD_day(int newD_day) {
		int oldD_day = d_day;
		d_day = newD_day;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.TIME_UPDATE_EVENT__DDAY, oldD_day, d_day));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EventsPackage.TIME_UPDATE_EVENT__DYEAR:
				return getD_year();
			case EventsPackage.TIME_UPDATE_EVENT__DMONTH:
				return getD_month();
			case EventsPackage.TIME_UPDATE_EVENT__DDAY:
				return getD_day();
			case EventsPackage.TIME_UPDATE_EVENT__THOURS:
				return getT_hours();
			case EventsPackage.TIME_UPDATE_EVENT__TMINS:
				return getT_mins();
			case EventsPackage.TIME_UPDATE_EVENT__TSECS:
				return getT_secs();
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
			case EventsPackage.TIME_UPDATE_EVENT__DYEAR:
				setD_year((Integer)newValue);
				return;
			case EventsPackage.TIME_UPDATE_EVENT__DMONTH:
				setD_month((Integer)newValue);
				return;
			case EventsPackage.TIME_UPDATE_EVENT__DDAY:
				setD_day((Integer)newValue);
				return;
			case EventsPackage.TIME_UPDATE_EVENT__THOURS:
				setT_hours((Integer)newValue);
				return;
			case EventsPackage.TIME_UPDATE_EVENT__TMINS:
				setT_mins((Integer)newValue);
				return;
			case EventsPackage.TIME_UPDATE_EVENT__TSECS:
				setT_secs((Integer)newValue);
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
			case EventsPackage.TIME_UPDATE_EVENT__DYEAR:
				setD_year(DYEAR_EDEFAULT);
				return;
			case EventsPackage.TIME_UPDATE_EVENT__DMONTH:
				setD_month(DMONTH_EDEFAULT);
				return;
			case EventsPackage.TIME_UPDATE_EVENT__DDAY:
				setD_day(DDAY_EDEFAULT);
				return;
			case EventsPackage.TIME_UPDATE_EVENT__THOURS:
				setT_hours(THOURS_EDEFAULT);
				return;
			case EventsPackage.TIME_UPDATE_EVENT__TMINS:
				setT_mins(TMINS_EDEFAULT);
				return;
			case EventsPackage.TIME_UPDATE_EVENT__TSECS:
				setT_secs(TSECS_EDEFAULT);
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
			case EventsPackage.TIME_UPDATE_EVENT__DYEAR:
				return d_year != DYEAR_EDEFAULT;
			case EventsPackage.TIME_UPDATE_EVENT__DMONTH:
				return d_month != DMONTH_EDEFAULT;
			case EventsPackage.TIME_UPDATE_EVENT__DDAY:
				return d_day != DDAY_EDEFAULT;
			case EventsPackage.TIME_UPDATE_EVENT__THOURS:
				return t_hours != THOURS_EDEFAULT;
			case EventsPackage.TIME_UPDATE_EVENT__TMINS:
				return t_mins != TMINS_EDEFAULT;
			case EventsPackage.TIME_UPDATE_EVENT__TSECS:
				return t_secs != TSECS_EDEFAULT;
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
		result.append(" (d_year: ");
		result.append(d_year);
		result.append(", d_month: ");
		result.append(d_month);
		result.append(", d_day: ");
		result.append(d_day);
		result.append(", t_hours: ");
		result.append(t_hours);
		result.append(", t_mins: ");
		result.append(t_mins);
		result.append(", t_secs: ");
		result.append(t_secs);
		result.append(')');
		return result.toString();
	}

} //TimeUpdateEventImpl
