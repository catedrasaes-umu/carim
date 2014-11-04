/**
 */
package org.mmi.events.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.mmi.events.EventsPackage;
import org.mmi.events.UserRatingsUpdateEvent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Ratings Update Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mmi.events.impl.UserRatingsUpdateEventImpl#getPractical <em>Practical</em>}</li>
 *   <li>{@link org.mmi.events.impl.UserRatingsUpdateEventImpl#getPredictable <em>Predictable</em>}</li>
 *   <li>{@link org.mmi.events.impl.UserRatingsUpdateEventImpl#getClearlyStructured <em>Clearly Structured</em>}</li>
 *   <li>{@link org.mmi.events.impl.UserRatingsUpdateEventImpl#getSimple <em>Simple</em>}</li>
 *   <li>{@link org.mmi.events.impl.UserRatingsUpdateEventImpl#getStylish <em>Stylish</em>}</li>
 *   <li>{@link org.mmi.events.impl.UserRatingsUpdateEventImpl#getPremium <em>Premium</em>}</li>
 *   <li>{@link org.mmi.events.impl.UserRatingsUpdateEventImpl#getCreative <em>Creative</em>}</li>
 *   <li>{@link org.mmi.events.impl.UserRatingsUpdateEventImpl#getCaptivating <em>Captivating</em>}</li>
 *   <li>{@link org.mmi.events.impl.UserRatingsUpdateEventImpl#getBeautiful <em>Beautiful</em>}</li>
 *   <li>{@link org.mmi.events.impl.UserRatingsUpdateEventImpl#getGood <em>Good</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserRatingsUpdateEventImpl extends UserContextEventImpl implements UserRatingsUpdateEvent {
	/**
	 * The default value of the '{@link #getPractical() <em>Practical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPractical()
	 * @generated
	 * @ordered
	 */
	protected static final float PRACTICAL_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPractical() <em>Practical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPractical()
	 * @generated
	 * @ordered
	 */
	protected float practical = PRACTICAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPredictable() <em>Predictable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredictable()
	 * @generated
	 * @ordered
	 */
	protected static final float PREDICTABLE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPredictable() <em>Predictable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredictable()
	 * @generated
	 * @ordered
	 */
	protected float predictable = PREDICTABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getClearlyStructured() <em>Clearly Structured</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClearlyStructured()
	 * @generated
	 * @ordered
	 */
	protected static final float CLEARLY_STRUCTURED_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getClearlyStructured() <em>Clearly Structured</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClearlyStructured()
	 * @generated
	 * @ordered
	 */
	protected float clearlyStructured = CLEARLY_STRUCTURED_EDEFAULT;

	/**
	 * The default value of the '{@link #getSimple() <em>Simple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimple()
	 * @generated
	 * @ordered
	 */
	protected static final float SIMPLE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSimple() <em>Simple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimple()
	 * @generated
	 * @ordered
	 */
	protected float simple = SIMPLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStylish() <em>Stylish</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStylish()
	 * @generated
	 * @ordered
	 */
	protected static final float STYLISH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getStylish() <em>Stylish</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStylish()
	 * @generated
	 * @ordered
	 */
	protected float stylish = STYLISH_EDEFAULT;

	/**
	 * The default value of the '{@link #getPremium() <em>Premium</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPremium()
	 * @generated
	 * @ordered
	 */
	protected static final float PREMIUM_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPremium() <em>Premium</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPremium()
	 * @generated
	 * @ordered
	 */
	protected float premium = PREMIUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreative() <em>Creative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreative()
	 * @generated
	 * @ordered
	 */
	protected static final float CREATIVE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCreative() <em>Creative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreative()
	 * @generated
	 * @ordered
	 */
	protected float creative = CREATIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCaptivating() <em>Captivating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaptivating()
	 * @generated
	 * @ordered
	 */
	protected static final float CAPTIVATING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCaptivating() <em>Captivating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaptivating()
	 * @generated
	 * @ordered
	 */
	protected float captivating = CAPTIVATING_EDEFAULT;

	/**
	 * The default value of the '{@link #getBeautiful() <em>Beautiful</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeautiful()
	 * @generated
	 * @ordered
	 */
	protected static final float BEAUTIFUL_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getBeautiful() <em>Beautiful</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeautiful()
	 * @generated
	 * @ordered
	 */
	protected float beautiful = BEAUTIFUL_EDEFAULT;

	/**
	 * The default value of the '{@link #getGood() <em>Good</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGood()
	 * @generated
	 * @ordered
	 */
	protected static final float GOOD_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getGood() <em>Good</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGood()
	 * @generated
	 * @ordered
	 */
	protected float good = GOOD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserRatingsUpdateEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EventsPackage.Literals.USER_RATINGS_UPDATE_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPractical() {
		return practical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPractical(float newPractical) {
		float oldPractical = practical;
		practical = newPractical;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.USER_RATINGS_UPDATE_EVENT__PRACTICAL, oldPractical, practical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPredictable() {
		return predictable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredictable(float newPredictable) {
		float oldPredictable = predictable;
		predictable = newPredictable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.USER_RATINGS_UPDATE_EVENT__PREDICTABLE, oldPredictable, predictable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getClearlyStructured() {
		return clearlyStructured;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClearlyStructured(float newClearlyStructured) {
		float oldClearlyStructured = clearlyStructured;
		clearlyStructured = newClearlyStructured;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.USER_RATINGS_UPDATE_EVENT__CLEARLY_STRUCTURED, oldClearlyStructured, clearlyStructured));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSimple() {
		return simple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimple(float newSimple) {
		float oldSimple = simple;
		simple = newSimple;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.USER_RATINGS_UPDATE_EVENT__SIMPLE, oldSimple, simple));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getStylish() {
		return stylish;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStylish(float newStylish) {
		float oldStylish = stylish;
		stylish = newStylish;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.USER_RATINGS_UPDATE_EVENT__STYLISH, oldStylish, stylish));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPremium() {
		return premium;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPremium(float newPremium) {
		float oldPremium = premium;
		premium = newPremium;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.USER_RATINGS_UPDATE_EVENT__PREMIUM, oldPremium, premium));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCreative() {
		return creative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreative(float newCreative) {
		float oldCreative = creative;
		creative = newCreative;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.USER_RATINGS_UPDATE_EVENT__CREATIVE, oldCreative, creative));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCaptivating() {
		return captivating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaptivating(float newCaptivating) {
		float oldCaptivating = captivating;
		captivating = newCaptivating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.USER_RATINGS_UPDATE_EVENT__CAPTIVATING, oldCaptivating, captivating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getBeautiful() {
		return beautiful;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeautiful(float newBeautiful) {
		float oldBeautiful = beautiful;
		beautiful = newBeautiful;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.USER_RATINGS_UPDATE_EVENT__BEAUTIFUL, oldBeautiful, beautiful));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getGood() {
		return good;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGood(float newGood) {
		float oldGood = good;
		good = newGood;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.USER_RATINGS_UPDATE_EVENT__GOOD, oldGood, good));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EventsPackage.USER_RATINGS_UPDATE_EVENT__PRACTICAL:
				return getPractical();
			case EventsPackage.USER_RATINGS_UPDATE_EVENT__PREDICTABLE:
				return getPredictable();
			case EventsPackage.USER_RATINGS_UPDATE_EVENT__CLEARLY_STRUCTURED:
				return getClearlyStructured();
			case EventsPackage.USER_RATINGS_UPDATE_EVENT__SIMPLE:
				return getSimple();
			case EventsPackage.USER_RATINGS_UPDATE_EVENT__STYLISH:
				return getStylish();
			case EventsPackage.USER_RATINGS_UPDATE_EVENT__PREMIUM:
				return getPremium();
			case EventsPackage.USER_RATINGS_UPDATE_EVENT__CREATIVE:
				return getCreative();
			case EventsPackage.USER_RATINGS_UPDATE_EVENT__CAPTIVATING:
				return getCaptivating();
			case EventsPackage.USER_RATINGS_UPDATE_EVENT__BEAUTIFUL:
				return getBeautiful();
			case EventsPackage.USER_RATINGS_UPDATE_EVENT__GOOD:
				return getGood();
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
			case EventsPackage.USER_RATINGS_UPDATE_EVENT__PRACTICAL:
				setPractical((Float)newValue);
				return;
			case EventsPackage.USER_RATINGS_UPDATE_EVENT__PREDICTABLE:
				setPredictable((Float)newValue);
				return;
			case EventsPackage.USER_RATINGS_UPDATE_EVENT__CLEARLY_STRUCTURED:
				setClearlyStructured((Float)newValue);
				return;
			case EventsPackage.USER_RATINGS_UPDATE_EVENT__SIMPLE:
				setSimple((Float)newValue);
				return;
			case EventsPackage.USER_RATINGS_UPDATE_EVENT__STYLISH:
				setStylish((Float)newValue);
				return;
			case EventsPackage.USER_RATINGS_UPDATE_EVENT__PREMIUM:
				setPremium((Float)newValue);
				return;
			case EventsPackage.USER_RATINGS_UPDATE_EVENT__CREATIVE:
				setCreative((Float)newValue);
				return;
			case EventsPackage.USER_RATINGS_UPDATE_EVENT__CAPTIVATING:
				setCaptivating((Float)newValue);
				return;
			case EventsPackage.USER_RATINGS_UPDATE_EVENT__BEAUTIFUL:
				setBeautiful((Float)newValue);
				return;
			case EventsPackage.USER_RATINGS_UPDATE_EVENT__GOOD:
				setGood((Float)newValue);
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
			case EventsPackage.USER_RATINGS_UPDATE_EVENT__PRACTICAL:
				setPractical(PRACTICAL_EDEFAULT);
				return;
			case EventsPackage.USER_RATINGS_UPDATE_EVENT__PREDICTABLE:
				setPredictable(PREDICTABLE_EDEFAULT);
				return;
			case EventsPackage.USER_RATINGS_UPDATE_EVENT__CLEARLY_STRUCTURED:
				setClearlyStructured(CLEARLY_STRUCTURED_EDEFAULT);
				return;
			case EventsPackage.USER_RATINGS_UPDATE_EVENT__SIMPLE:
				setSimple(SIMPLE_EDEFAULT);
				return;
			case EventsPackage.USER_RATINGS_UPDATE_EVENT__STYLISH:
				setStylish(STYLISH_EDEFAULT);
				return;
			case EventsPackage.USER_RATINGS_UPDATE_EVENT__PREMIUM:
				setPremium(PREMIUM_EDEFAULT);
				return;
			case EventsPackage.USER_RATINGS_UPDATE_EVENT__CREATIVE:
				setCreative(CREATIVE_EDEFAULT);
				return;
			case EventsPackage.USER_RATINGS_UPDATE_EVENT__CAPTIVATING:
				setCaptivating(CAPTIVATING_EDEFAULT);
				return;
			case EventsPackage.USER_RATINGS_UPDATE_EVENT__BEAUTIFUL:
				setBeautiful(BEAUTIFUL_EDEFAULT);
				return;
			case EventsPackage.USER_RATINGS_UPDATE_EVENT__GOOD:
				setGood(GOOD_EDEFAULT);
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
			case EventsPackage.USER_RATINGS_UPDATE_EVENT__PRACTICAL:
				return practical != PRACTICAL_EDEFAULT;
			case EventsPackage.USER_RATINGS_UPDATE_EVENT__PREDICTABLE:
				return predictable != PREDICTABLE_EDEFAULT;
			case EventsPackage.USER_RATINGS_UPDATE_EVENT__CLEARLY_STRUCTURED:
				return clearlyStructured != CLEARLY_STRUCTURED_EDEFAULT;
			case EventsPackage.USER_RATINGS_UPDATE_EVENT__SIMPLE:
				return simple != SIMPLE_EDEFAULT;
			case EventsPackage.USER_RATINGS_UPDATE_EVENT__STYLISH:
				return stylish != STYLISH_EDEFAULT;
			case EventsPackage.USER_RATINGS_UPDATE_EVENT__PREMIUM:
				return premium != PREMIUM_EDEFAULT;
			case EventsPackage.USER_RATINGS_UPDATE_EVENT__CREATIVE:
				return creative != CREATIVE_EDEFAULT;
			case EventsPackage.USER_RATINGS_UPDATE_EVENT__CAPTIVATING:
				return captivating != CAPTIVATING_EDEFAULT;
			case EventsPackage.USER_RATINGS_UPDATE_EVENT__BEAUTIFUL:
				return beautiful != BEAUTIFUL_EDEFAULT;
			case EventsPackage.USER_RATINGS_UPDATE_EVENT__GOOD:
				return good != GOOD_EDEFAULT;
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
		result.append(" (practical: ");
		result.append(practical);
		result.append(", predictable: ");
		result.append(predictable);
		result.append(", clearlyStructured: ");
		result.append(clearlyStructured);
		result.append(", simple: ");
		result.append(simple);
		result.append(", stylish: ");
		result.append(stylish);
		result.append(", premium: ");
		result.append(premium);
		result.append(", creative: ");
		result.append(creative);
		result.append(", captivating: ");
		result.append(captivating);
		result.append(", beautiful: ");
		result.append(beautiful);
		result.append(", good: ");
		result.append(good);
		result.append(')');
		return result.toString();
	}

} //UserRatingsUpdateEventImpl
