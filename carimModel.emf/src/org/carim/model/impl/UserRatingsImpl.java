/**
 */
package org.carim.model.impl;

import org.carim.model.UserRatings;
import org.carim.model.carimModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Ratings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.carim.model.impl.UserRatingsImpl#getPractical <em>Practical</em>}</li>
 *   <li>{@link org.carim.model.impl.UserRatingsImpl#getPredictable <em>Predictable</em>}</li>
 *   <li>{@link org.carim.model.impl.UserRatingsImpl#getClearlyStructured <em>Clearly Structured</em>}</li>
 *   <li>{@link org.carim.model.impl.UserRatingsImpl#getSimple <em>Simple</em>}</li>
 *   <li>{@link org.carim.model.impl.UserRatingsImpl#getStylish <em>Stylish</em>}</li>
 *   <li>{@link org.carim.model.impl.UserRatingsImpl#getPremium <em>Premium</em>}</li>
 *   <li>{@link org.carim.model.impl.UserRatingsImpl#getCreative <em>Creative</em>}</li>
 *   <li>{@link org.carim.model.impl.UserRatingsImpl#getCaptivating <em>Captivating</em>}</li>
 *   <li>{@link org.carim.model.impl.UserRatingsImpl#getBeautiful <em>Beautiful</em>}</li>
 *   <li>{@link org.carim.model.impl.UserRatingsImpl#getGood <em>Good</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserRatingsImpl extends EObjectImpl implements UserRatings {
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
	 * This is true if the Practical attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean practicalESet;

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
	 * This is true if the Predictable attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean predictableESet;

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
	 * This is true if the Clearly Structured attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean clearlyStructuredESet;

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
	 * This is true if the Simple attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean simpleESet;

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
	 * This is true if the Stylish attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean stylishESet;

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
	 * This is true if the Premium attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean premiumESet;

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
	 * This is true if the Creative attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean creativeESet;

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
	 * This is true if the Captivating attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean captivatingESet;

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
	 * This is true if the Beautiful attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean beautifulESet;

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
	 * This is true if the Good attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean goodESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserRatingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return carimModelPackage.Literals.USER_RATINGS;
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
		boolean oldPracticalESet = practicalESet;
		practicalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.USER_RATINGS__PRACTICAL, oldPractical, practical, !oldPracticalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPractical() {
		float oldPractical = practical;
		boolean oldPracticalESet = practicalESet;
		practical = PRACTICAL_EDEFAULT;
		practicalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, carimModelPackage.USER_RATINGS__PRACTICAL, oldPractical, PRACTICAL_EDEFAULT, oldPracticalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPractical() {
		return practicalESet;
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
		boolean oldPredictableESet = predictableESet;
		predictableESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.USER_RATINGS__PREDICTABLE, oldPredictable, predictable, !oldPredictableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPredictable() {
		float oldPredictable = predictable;
		boolean oldPredictableESet = predictableESet;
		predictable = PREDICTABLE_EDEFAULT;
		predictableESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, carimModelPackage.USER_RATINGS__PREDICTABLE, oldPredictable, PREDICTABLE_EDEFAULT, oldPredictableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPredictable() {
		return predictableESet;
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
		boolean oldClearlyStructuredESet = clearlyStructuredESet;
		clearlyStructuredESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.USER_RATINGS__CLEARLY_STRUCTURED, oldClearlyStructured, clearlyStructured, !oldClearlyStructuredESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClearlyStructured() {
		float oldClearlyStructured = clearlyStructured;
		boolean oldClearlyStructuredESet = clearlyStructuredESet;
		clearlyStructured = CLEARLY_STRUCTURED_EDEFAULT;
		clearlyStructuredESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, carimModelPackage.USER_RATINGS__CLEARLY_STRUCTURED, oldClearlyStructured, CLEARLY_STRUCTURED_EDEFAULT, oldClearlyStructuredESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetClearlyStructured() {
		return clearlyStructuredESet;
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
		boolean oldSimpleESet = simpleESet;
		simpleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.USER_RATINGS__SIMPLE, oldSimple, simple, !oldSimpleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSimple() {
		float oldSimple = simple;
		boolean oldSimpleESet = simpleESet;
		simple = SIMPLE_EDEFAULT;
		simpleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, carimModelPackage.USER_RATINGS__SIMPLE, oldSimple, SIMPLE_EDEFAULT, oldSimpleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSimple() {
		return simpleESet;
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
		boolean oldStylishESet = stylishESet;
		stylishESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.USER_RATINGS__STYLISH, oldStylish, stylish, !oldStylishESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStylish() {
		float oldStylish = stylish;
		boolean oldStylishESet = stylishESet;
		stylish = STYLISH_EDEFAULT;
		stylishESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, carimModelPackage.USER_RATINGS__STYLISH, oldStylish, STYLISH_EDEFAULT, oldStylishESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStylish() {
		return stylishESet;
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
		boolean oldPremiumESet = premiumESet;
		premiumESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.USER_RATINGS__PREMIUM, oldPremium, premium, !oldPremiumESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPremium() {
		float oldPremium = premium;
		boolean oldPremiumESet = premiumESet;
		premium = PREMIUM_EDEFAULT;
		premiumESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, carimModelPackage.USER_RATINGS__PREMIUM, oldPremium, PREMIUM_EDEFAULT, oldPremiumESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPremium() {
		return premiumESet;
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
		boolean oldCreativeESet = creativeESet;
		creativeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.USER_RATINGS__CREATIVE, oldCreative, creative, !oldCreativeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCreative() {
		float oldCreative = creative;
		boolean oldCreativeESet = creativeESet;
		creative = CREATIVE_EDEFAULT;
		creativeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, carimModelPackage.USER_RATINGS__CREATIVE, oldCreative, CREATIVE_EDEFAULT, oldCreativeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCreative() {
		return creativeESet;
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
		boolean oldCaptivatingESet = captivatingESet;
		captivatingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.USER_RATINGS__CAPTIVATING, oldCaptivating, captivating, !oldCaptivatingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCaptivating() {
		float oldCaptivating = captivating;
		boolean oldCaptivatingESet = captivatingESet;
		captivating = CAPTIVATING_EDEFAULT;
		captivatingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, carimModelPackage.USER_RATINGS__CAPTIVATING, oldCaptivating, CAPTIVATING_EDEFAULT, oldCaptivatingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCaptivating() {
		return captivatingESet;
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
		boolean oldBeautifulESet = beautifulESet;
		beautifulESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.USER_RATINGS__BEAUTIFUL, oldBeautiful, beautiful, !oldBeautifulESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBeautiful() {
		float oldBeautiful = beautiful;
		boolean oldBeautifulESet = beautifulESet;
		beautiful = BEAUTIFUL_EDEFAULT;
		beautifulESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, carimModelPackage.USER_RATINGS__BEAUTIFUL, oldBeautiful, BEAUTIFUL_EDEFAULT, oldBeautifulESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBeautiful() {
		return beautifulESet;
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
		boolean oldGoodESet = goodESet;
		goodESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.USER_RATINGS__GOOD, oldGood, good, !oldGoodESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGood() {
		float oldGood = good;
		boolean oldGoodESet = goodESet;
		good = GOOD_EDEFAULT;
		goodESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, carimModelPackage.USER_RATINGS__GOOD, oldGood, GOOD_EDEFAULT, oldGoodESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGood() {
		return goodESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case carimModelPackage.USER_RATINGS__PRACTICAL:
				return getPractical();
			case carimModelPackage.USER_RATINGS__PREDICTABLE:
				return getPredictable();
			case carimModelPackage.USER_RATINGS__CLEARLY_STRUCTURED:
				return getClearlyStructured();
			case carimModelPackage.USER_RATINGS__SIMPLE:
				return getSimple();
			case carimModelPackage.USER_RATINGS__STYLISH:
				return getStylish();
			case carimModelPackage.USER_RATINGS__PREMIUM:
				return getPremium();
			case carimModelPackage.USER_RATINGS__CREATIVE:
				return getCreative();
			case carimModelPackage.USER_RATINGS__CAPTIVATING:
				return getCaptivating();
			case carimModelPackage.USER_RATINGS__BEAUTIFUL:
				return getBeautiful();
			case carimModelPackage.USER_RATINGS__GOOD:
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
			case carimModelPackage.USER_RATINGS__PRACTICAL:
				setPractical((Float)newValue);
				return;
			case carimModelPackage.USER_RATINGS__PREDICTABLE:
				setPredictable((Float)newValue);
				return;
			case carimModelPackage.USER_RATINGS__CLEARLY_STRUCTURED:
				setClearlyStructured((Float)newValue);
				return;
			case carimModelPackage.USER_RATINGS__SIMPLE:
				setSimple((Float)newValue);
				return;
			case carimModelPackage.USER_RATINGS__STYLISH:
				setStylish((Float)newValue);
				return;
			case carimModelPackage.USER_RATINGS__PREMIUM:
				setPremium((Float)newValue);
				return;
			case carimModelPackage.USER_RATINGS__CREATIVE:
				setCreative((Float)newValue);
				return;
			case carimModelPackage.USER_RATINGS__CAPTIVATING:
				setCaptivating((Float)newValue);
				return;
			case carimModelPackage.USER_RATINGS__BEAUTIFUL:
				setBeautiful((Float)newValue);
				return;
			case carimModelPackage.USER_RATINGS__GOOD:
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
			case carimModelPackage.USER_RATINGS__PRACTICAL:
				unsetPractical();
				return;
			case carimModelPackage.USER_RATINGS__PREDICTABLE:
				unsetPredictable();
				return;
			case carimModelPackage.USER_RATINGS__CLEARLY_STRUCTURED:
				unsetClearlyStructured();
				return;
			case carimModelPackage.USER_RATINGS__SIMPLE:
				unsetSimple();
				return;
			case carimModelPackage.USER_RATINGS__STYLISH:
				unsetStylish();
				return;
			case carimModelPackage.USER_RATINGS__PREMIUM:
				unsetPremium();
				return;
			case carimModelPackage.USER_RATINGS__CREATIVE:
				unsetCreative();
				return;
			case carimModelPackage.USER_RATINGS__CAPTIVATING:
				unsetCaptivating();
				return;
			case carimModelPackage.USER_RATINGS__BEAUTIFUL:
				unsetBeautiful();
				return;
			case carimModelPackage.USER_RATINGS__GOOD:
				unsetGood();
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
			case carimModelPackage.USER_RATINGS__PRACTICAL:
				return isSetPractical();
			case carimModelPackage.USER_RATINGS__PREDICTABLE:
				return isSetPredictable();
			case carimModelPackage.USER_RATINGS__CLEARLY_STRUCTURED:
				return isSetClearlyStructured();
			case carimModelPackage.USER_RATINGS__SIMPLE:
				return isSetSimple();
			case carimModelPackage.USER_RATINGS__STYLISH:
				return isSetStylish();
			case carimModelPackage.USER_RATINGS__PREMIUM:
				return isSetPremium();
			case carimModelPackage.USER_RATINGS__CREATIVE:
				return isSetCreative();
			case carimModelPackage.USER_RATINGS__CAPTIVATING:
				return isSetCaptivating();
			case carimModelPackage.USER_RATINGS__BEAUTIFUL:
				return isSetBeautiful();
			case carimModelPackage.USER_RATINGS__GOOD:
				return isSetGood();
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
		if (practicalESet) result.append(practical); else result.append("<unset>");
		result.append(", predictable: ");
		if (predictableESet) result.append(predictable); else result.append("<unset>");
		result.append(", clearlyStructured: ");
		if (clearlyStructuredESet) result.append(clearlyStructured); else result.append("<unset>");
		result.append(", simple: ");
		if (simpleESet) result.append(simple); else result.append("<unset>");
		result.append(", stylish: ");
		if (stylishESet) result.append(stylish); else result.append("<unset>");
		result.append(", premium: ");
		if (premiumESet) result.append(premium); else result.append("<unset>");
		result.append(", creative: ");
		if (creativeESet) result.append(creative); else result.append("<unset>");
		result.append(", captivating: ");
		if (captivatingESet) result.append(captivating); else result.append("<unset>");
		result.append(", beautiful: ");
		if (beautifulESet) result.append(beautiful); else result.append("<unset>");
		result.append(", good: ");
		if (goodESet) result.append(good); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //UserRatingsImpl
