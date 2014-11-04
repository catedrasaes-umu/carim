/**
 */
package org.carim.model.impl;

import org.carim.model.DateTimeT;
import org.carim.model.carimModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Date Time T</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.carim.model.impl.DateTimeTImpl#getDDay <em>DDay</em>}</li>
 *   <li>{@link org.carim.model.impl.DateTimeTImpl#getDMonth <em>DMonth</em>}</li>
 *   <li>{@link org.carim.model.impl.DateTimeTImpl#getDYear <em>DYear</em>}</li>
 *   <li>{@link org.carim.model.impl.DateTimeTImpl#getTHours <em>THours</em>}</li>
 *   <li>{@link org.carim.model.impl.DateTimeTImpl#getTMins <em>TMins</em>}</li>
 *   <li>{@link org.carim.model.impl.DateTimeTImpl#getTSecs <em>TSecs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DateTimeTImpl extends EObjectImpl implements DateTimeT {
	/**
	 * The default value of the '{@link #getDDay() <em>DDay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDDay()
	 * @generated
	 * @ordered
	 */
	protected static final int DDAY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDDay() <em>DDay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDDay()
	 * @generated
	 * @ordered
	 */
	protected int dDay = DDAY_EDEFAULT;

	/**
	 * This is true if the DDay attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dDayESet;

	/**
	 * The default value of the '{@link #getDMonth() <em>DMonth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDMonth()
	 * @generated
	 * @ordered
	 */
	protected static final int DMONTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDMonth() <em>DMonth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDMonth()
	 * @generated
	 * @ordered
	 */
	protected int dMonth = DMONTH_EDEFAULT;

	/**
	 * This is true if the DMonth attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dMonthESet;

	/**
	 * The default value of the '{@link #getDYear() <em>DYear</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDYear()
	 * @generated
	 * @ordered
	 */
	protected static final int DYEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDYear() <em>DYear</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDYear()
	 * @generated
	 * @ordered
	 */
	protected int dYear = DYEAR_EDEFAULT;

	/**
	 * This is true if the DYear attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dYearESet;

	/**
	 * The default value of the '{@link #getTHours() <em>THours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTHours()
	 * @generated
	 * @ordered
	 */
	protected static final int THOURS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTHours() <em>THours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTHours()
	 * @generated
	 * @ordered
	 */
	protected int tHours = THOURS_EDEFAULT;

	/**
	 * This is true if the THours attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tHoursESet;

	/**
	 * The default value of the '{@link #getTMins() <em>TMins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTMins()
	 * @generated
	 * @ordered
	 */
	protected static final int TMINS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTMins() <em>TMins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTMins()
	 * @generated
	 * @ordered
	 */
	protected int tMins = TMINS_EDEFAULT;

	/**
	 * This is true if the TMins attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tMinsESet;

	/**
	 * The default value of the '{@link #getTSecs() <em>TSecs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTSecs()
	 * @generated
	 * @ordered
	 */
	protected static final int TSECS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTSecs() <em>TSecs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTSecs()
	 * @generated
	 * @ordered
	 */
	protected int tSecs = TSECS_EDEFAULT;

	/**
	 * This is true if the TSecs attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tSecsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DateTimeTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return carimModelPackage.Literals.DATE_TIME_T;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDDay() {
		return dDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDDay(int newDDay) {
		int oldDDay = dDay;
		dDay = newDDay;
		boolean oldDDayESet = dDayESet;
		dDayESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.DATE_TIME_T__DDAY, oldDDay, dDay, !oldDDayESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDDay() {
		int oldDDay = dDay;
		boolean oldDDayESet = dDayESet;
		dDay = DDAY_EDEFAULT;
		dDayESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, carimModelPackage.DATE_TIME_T__DDAY, oldDDay, DDAY_EDEFAULT, oldDDayESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDDay() {
		return dDayESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDMonth() {
		return dMonth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDMonth(int newDMonth) {
		int oldDMonth = dMonth;
		dMonth = newDMonth;
		boolean oldDMonthESet = dMonthESet;
		dMonthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.DATE_TIME_T__DMONTH, oldDMonth, dMonth, !oldDMonthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDMonth() {
		int oldDMonth = dMonth;
		boolean oldDMonthESet = dMonthESet;
		dMonth = DMONTH_EDEFAULT;
		dMonthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, carimModelPackage.DATE_TIME_T__DMONTH, oldDMonth, DMONTH_EDEFAULT, oldDMonthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDMonth() {
		return dMonthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDYear() {
		return dYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDYear(int newDYear) {
		int oldDYear = dYear;
		dYear = newDYear;
		boolean oldDYearESet = dYearESet;
		dYearESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.DATE_TIME_T__DYEAR, oldDYear, dYear, !oldDYearESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDYear() {
		int oldDYear = dYear;
		boolean oldDYearESet = dYearESet;
		dYear = DYEAR_EDEFAULT;
		dYearESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, carimModelPackage.DATE_TIME_T__DYEAR, oldDYear, DYEAR_EDEFAULT, oldDYearESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDYear() {
		return dYearESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTHours() {
		return tHours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTHours(int newTHours) {
		int oldTHours = tHours;
		tHours = newTHours;
		boolean oldTHoursESet = tHoursESet;
		tHoursESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.DATE_TIME_T__THOURS, oldTHours, tHours, !oldTHoursESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTHours() {
		int oldTHours = tHours;
		boolean oldTHoursESet = tHoursESet;
		tHours = THOURS_EDEFAULT;
		tHoursESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, carimModelPackage.DATE_TIME_T__THOURS, oldTHours, THOURS_EDEFAULT, oldTHoursESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTHours() {
		return tHoursESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTMins() {
		return tMins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTMins(int newTMins) {
		int oldTMins = tMins;
		tMins = newTMins;
		boolean oldTMinsESet = tMinsESet;
		tMinsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.DATE_TIME_T__TMINS, oldTMins, tMins, !oldTMinsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTMins() {
		int oldTMins = tMins;
		boolean oldTMinsESet = tMinsESet;
		tMins = TMINS_EDEFAULT;
		tMinsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, carimModelPackage.DATE_TIME_T__TMINS, oldTMins, TMINS_EDEFAULT, oldTMinsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTMins() {
		return tMinsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTSecs() {
		return tSecs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTSecs(int newTSecs) {
		int oldTSecs = tSecs;
		tSecs = newTSecs;
		boolean oldTSecsESet = tSecsESet;
		tSecsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.DATE_TIME_T__TSECS, oldTSecs, tSecs, !oldTSecsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTSecs() {
		int oldTSecs = tSecs;
		boolean oldTSecsESet = tSecsESet;
		tSecs = TSECS_EDEFAULT;
		tSecsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, carimModelPackage.DATE_TIME_T__TSECS, oldTSecs, TSECS_EDEFAULT, oldTSecsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTSecs() {
		return tSecsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case carimModelPackage.DATE_TIME_T__DDAY:
				return getDDay();
			case carimModelPackage.DATE_TIME_T__DMONTH:
				return getDMonth();
			case carimModelPackage.DATE_TIME_T__DYEAR:
				return getDYear();
			case carimModelPackage.DATE_TIME_T__THOURS:
				return getTHours();
			case carimModelPackage.DATE_TIME_T__TMINS:
				return getTMins();
			case carimModelPackage.DATE_TIME_T__TSECS:
				return getTSecs();
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
			case carimModelPackage.DATE_TIME_T__DDAY:
				setDDay((Integer)newValue);
				return;
			case carimModelPackage.DATE_TIME_T__DMONTH:
				setDMonth((Integer)newValue);
				return;
			case carimModelPackage.DATE_TIME_T__DYEAR:
				setDYear((Integer)newValue);
				return;
			case carimModelPackage.DATE_TIME_T__THOURS:
				setTHours((Integer)newValue);
				return;
			case carimModelPackage.DATE_TIME_T__TMINS:
				setTMins((Integer)newValue);
				return;
			case carimModelPackage.DATE_TIME_T__TSECS:
				setTSecs((Integer)newValue);
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
			case carimModelPackage.DATE_TIME_T__DDAY:
				unsetDDay();
				return;
			case carimModelPackage.DATE_TIME_T__DMONTH:
				unsetDMonth();
				return;
			case carimModelPackage.DATE_TIME_T__DYEAR:
				unsetDYear();
				return;
			case carimModelPackage.DATE_TIME_T__THOURS:
				unsetTHours();
				return;
			case carimModelPackage.DATE_TIME_T__TMINS:
				unsetTMins();
				return;
			case carimModelPackage.DATE_TIME_T__TSECS:
				unsetTSecs();
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
			case carimModelPackage.DATE_TIME_T__DDAY:
				return isSetDDay();
			case carimModelPackage.DATE_TIME_T__DMONTH:
				return isSetDMonth();
			case carimModelPackage.DATE_TIME_T__DYEAR:
				return isSetDYear();
			case carimModelPackage.DATE_TIME_T__THOURS:
				return isSetTHours();
			case carimModelPackage.DATE_TIME_T__TMINS:
				return isSetTMins();
			case carimModelPackage.DATE_TIME_T__TSECS:
				return isSetTSecs();
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
		result.append(" (dDay: ");
		if (dDayESet) result.append(dDay); else result.append("<unset>");
		result.append(", dMonth: ");
		if (dMonthESet) result.append(dMonth); else result.append("<unset>");
		result.append(", dYear: ");
		if (dYearESet) result.append(dYear); else result.append("<unset>");
		result.append(", tHours: ");
		if (tHoursESet) result.append(tHours); else result.append("<unset>");
		result.append(", tMins: ");
		if (tMinsESet) result.append(tMins); else result.append("<unset>");
		result.append(", tSecs: ");
		if (tSecsESet) result.append(tSecs); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DateTimeTImpl
