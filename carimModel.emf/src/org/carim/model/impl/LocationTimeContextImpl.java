/**
 */
package org.carim.model.impl;

import org.carim.model.DateTimeT;
import javax.xml.datatype.XMLGregorianCalendar;

import org.carim.model.LocationT;
import org.carim.model.LocationTimeContext;
import org.carim.model.MobilityLevelT;
import org.carim.model.carimModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location Time Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.carim.model.impl.LocationTimeContextImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.carim.model.impl.LocationTimeContextImpl#getGeoLatitude <em>Geo Latitude</em>}</li>
 *   <li>{@link org.carim.model.impl.LocationTimeContextImpl#getGeoLongitude <em>Geo Longitude</em>}</li>
 *   <li>{@link org.carim.model.impl.LocationTimeContextImpl#getMobilityLevel <em>Mobility Level</em>}</li>
 *   <li>{@link org.carim.model.impl.LocationTimeContextImpl#getTime <em>Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocationTimeContextImpl extends EObjectImpl implements LocationTimeContext {
	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final LocationT LOCATION_EDEFAULT = LocationT.NONE;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected LocationT location = LOCATION_EDEFAULT;

	/**
	 * This is true if the Location attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean locationESet;

	/**
	 * The default value of the '{@link #getGeoLatitude() <em>Geo Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeoLatitude()
	 * @generated
	 * @ordered
	 */
	protected static final double GEO_LATITUDE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getGeoLatitude() <em>Geo Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeoLatitude()
	 * @generated
	 * @ordered
	 */
	protected double geoLatitude = GEO_LATITUDE_EDEFAULT;

	/**
	 * This is true if the Geo Latitude attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean geoLatitudeESet;

	/**
	 * The default value of the '{@link #getGeoLongitude() <em>Geo Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeoLongitude()
	 * @generated
	 * @ordered
	 */
	protected static final double GEO_LONGITUDE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getGeoLongitude() <em>Geo Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeoLongitude()
	 * @generated
	 * @ordered
	 */
	protected double geoLongitude = GEO_LONGITUDE_EDEFAULT;

	/**
	 * This is true if the Geo Longitude attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean geoLongitudeESet;

	/**
	 * The default value of the '{@link #getMobilityLevel() <em>Mobility Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMobilityLevel()
	 * @generated
	 * @ordered
	 */
	protected static final MobilityLevelT MOBILITY_LEVEL_EDEFAULT = MobilityLevelT.NONE;

	/**
	 * The cached value of the '{@link #getMobilityLevel() <em>Mobility Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMobilityLevel()
	 * @generated
	 * @ordered
	 */
	protected MobilityLevelT mobilityLevel = MOBILITY_LEVEL_EDEFAULT;

	/**
	 * This is true if the Mobility Level attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mobilityLevelESet;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected DateTimeT time;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationTimeContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return carimModelPackage.Literals.LOCATION_TIME_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationT getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(LocationT newLocation) {
		LocationT oldLocation = location;
		location = newLocation == null ? LOCATION_EDEFAULT : newLocation;
		boolean oldLocationESet = locationESet;
		locationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.LOCATION_TIME_CONTEXT__LOCATION, oldLocation, location, !oldLocationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLocation() {
		LocationT oldLocation = location;
		boolean oldLocationESet = locationESet;
		location = LOCATION_EDEFAULT;
		locationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, carimModelPackage.LOCATION_TIME_CONTEXT__LOCATION, oldLocation, LOCATION_EDEFAULT, oldLocationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLocation() {
		return locationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getGeoLatitude() {
		return geoLatitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeoLatitude(double newGeoLatitude) {
		double oldGeoLatitude = geoLatitude;
		geoLatitude = newGeoLatitude;
		boolean oldGeoLatitudeESet = geoLatitudeESet;
		geoLatitudeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.LOCATION_TIME_CONTEXT__GEO_LATITUDE, oldGeoLatitude, geoLatitude, !oldGeoLatitudeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGeoLatitude() {
		double oldGeoLatitude = geoLatitude;
		boolean oldGeoLatitudeESet = geoLatitudeESet;
		geoLatitude = GEO_LATITUDE_EDEFAULT;
		geoLatitudeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, carimModelPackage.LOCATION_TIME_CONTEXT__GEO_LATITUDE, oldGeoLatitude, GEO_LATITUDE_EDEFAULT, oldGeoLatitudeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGeoLatitude() {
		return geoLatitudeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getGeoLongitude() {
		return geoLongitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeoLongitude(double newGeoLongitude) {
		double oldGeoLongitude = geoLongitude;
		geoLongitude = newGeoLongitude;
		boolean oldGeoLongitudeESet = geoLongitudeESet;
		geoLongitudeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.LOCATION_TIME_CONTEXT__GEO_LONGITUDE, oldGeoLongitude, geoLongitude, !oldGeoLongitudeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGeoLongitude() {
		double oldGeoLongitude = geoLongitude;
		boolean oldGeoLongitudeESet = geoLongitudeESet;
		geoLongitude = GEO_LONGITUDE_EDEFAULT;
		geoLongitudeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, carimModelPackage.LOCATION_TIME_CONTEXT__GEO_LONGITUDE, oldGeoLongitude, GEO_LONGITUDE_EDEFAULT, oldGeoLongitudeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGeoLongitude() {
		return geoLongitudeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobilityLevelT getMobilityLevel() {
		return mobilityLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMobilityLevel(MobilityLevelT newMobilityLevel) {
		MobilityLevelT oldMobilityLevel = mobilityLevel;
		mobilityLevel = newMobilityLevel == null ? MOBILITY_LEVEL_EDEFAULT : newMobilityLevel;
		boolean oldMobilityLevelESet = mobilityLevelESet;
		mobilityLevelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.LOCATION_TIME_CONTEXT__MOBILITY_LEVEL, oldMobilityLevel, mobilityLevel, !oldMobilityLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMobilityLevel() {
		MobilityLevelT oldMobilityLevel = mobilityLevel;
		boolean oldMobilityLevelESet = mobilityLevelESet;
		mobilityLevel = MOBILITY_LEVEL_EDEFAULT;
		mobilityLevelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, carimModelPackage.LOCATION_TIME_CONTEXT__MOBILITY_LEVEL, oldMobilityLevel, MOBILITY_LEVEL_EDEFAULT, oldMobilityLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMobilityLevel() {
		return mobilityLevelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeT getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTime(DateTimeT newTime, NotificationChain msgs) {
		DateTimeT oldTime = time;
		time = newTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, carimModelPackage.LOCATION_TIME_CONTEXT__TIME, oldTime, newTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(DateTimeT newTime) {
		if (newTime != time) {
			NotificationChain msgs = null;
			if (time != null)
				msgs = ((InternalEObject)time).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - carimModelPackage.LOCATION_TIME_CONTEXT__TIME, null, msgs);
			if (newTime != null)
				msgs = ((InternalEObject)newTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - carimModelPackage.LOCATION_TIME_CONTEXT__TIME, null, msgs);
			msgs = basicSetTime(newTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.LOCATION_TIME_CONTEXT__TIME, newTime, newTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case carimModelPackage.LOCATION_TIME_CONTEXT__TIME:
				return basicSetTime(null, msgs);
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
			case carimModelPackage.LOCATION_TIME_CONTEXT__LOCATION:
				return getLocation();
			case carimModelPackage.LOCATION_TIME_CONTEXT__GEO_LATITUDE:
				return getGeoLatitude();
			case carimModelPackage.LOCATION_TIME_CONTEXT__GEO_LONGITUDE:
				return getGeoLongitude();
			case carimModelPackage.LOCATION_TIME_CONTEXT__MOBILITY_LEVEL:
				return getMobilityLevel();
			case carimModelPackage.LOCATION_TIME_CONTEXT__TIME:
				return getTime();
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
			case carimModelPackage.LOCATION_TIME_CONTEXT__LOCATION:
				setLocation((LocationT)newValue);
				return;
			case carimModelPackage.LOCATION_TIME_CONTEXT__GEO_LATITUDE:
				setGeoLatitude((Double)newValue);
				return;
			case carimModelPackage.LOCATION_TIME_CONTEXT__GEO_LONGITUDE:
				setGeoLongitude((Double)newValue);
				return;
			case carimModelPackage.LOCATION_TIME_CONTEXT__MOBILITY_LEVEL:
				setMobilityLevel((MobilityLevelT)newValue);
				return;
			case carimModelPackage.LOCATION_TIME_CONTEXT__TIME:
				setTime((DateTimeT)newValue);
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
			case carimModelPackage.LOCATION_TIME_CONTEXT__LOCATION:
				unsetLocation();
				return;
			case carimModelPackage.LOCATION_TIME_CONTEXT__GEO_LATITUDE:
				unsetGeoLatitude();
				return;
			case carimModelPackage.LOCATION_TIME_CONTEXT__GEO_LONGITUDE:
				unsetGeoLongitude();
				return;
			case carimModelPackage.LOCATION_TIME_CONTEXT__MOBILITY_LEVEL:
				unsetMobilityLevel();
				return;
			case carimModelPackage.LOCATION_TIME_CONTEXT__TIME:
				setTime((DateTimeT)null);
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
			case carimModelPackage.LOCATION_TIME_CONTEXT__LOCATION:
				return isSetLocation();
			case carimModelPackage.LOCATION_TIME_CONTEXT__GEO_LATITUDE:
				return isSetGeoLatitude();
			case carimModelPackage.LOCATION_TIME_CONTEXT__GEO_LONGITUDE:
				return isSetGeoLongitude();
			case carimModelPackage.LOCATION_TIME_CONTEXT__MOBILITY_LEVEL:
				return isSetMobilityLevel();
			case carimModelPackage.LOCATION_TIME_CONTEXT__TIME:
				return time != null;
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
		result.append(" (location: ");
		if (locationESet) result.append(location); else result.append("<unset>");
		result.append(", geoLatitude: ");
		if (geoLatitudeESet) result.append(geoLatitude); else result.append("<unset>");
		result.append(", geoLongitude: ");
		if (geoLongitudeESet) result.append(geoLongitude); else result.append("<unset>");
		result.append(", mobilityLevel: ");
		if (mobilityLevelESet) result.append(mobilityLevel); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //LocationTimeContextImpl
