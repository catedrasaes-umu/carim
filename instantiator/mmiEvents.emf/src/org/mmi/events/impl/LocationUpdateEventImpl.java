/**
 */
package org.mmi.events.impl;

import org.carim.model.LocationT;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.mmi.events.EventsPackage;
import org.mmi.events.LocationUpdateEvent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location Update Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mmi.events.impl.LocationUpdateEventImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.mmi.events.impl.LocationUpdateEventImpl#getGeo_latitude <em>Geo latitude</em>}</li>
 *   <li>{@link org.mmi.events.impl.LocationUpdateEventImpl#getGeo_longitude <em>Geo longitude</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocationUpdateEventImpl extends LocationTimeContextEventImpl implements LocationUpdateEvent {
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
	 * The default value of the '{@link #getGeo_latitude() <em>Geo latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeo_latitude()
	 * @generated
	 * @ordered
	 */
	protected static final double GEO_LATITUDE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getGeo_latitude() <em>Geo latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeo_latitude()
	 * @generated
	 * @ordered
	 */
	protected double geo_latitude = GEO_LATITUDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeo_longitude() <em>Geo longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeo_longitude()
	 * @generated
	 * @ordered
	 */
	protected static final double GEO_LONGITUDE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getGeo_longitude() <em>Geo longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeo_longitude()
	 * @generated
	 * @ordered
	 */
	protected double geo_longitude = GEO_LONGITUDE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationUpdateEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EventsPackage.Literals.LOCATION_UPDATE_EVENT;
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.LOCATION_UPDATE_EVENT__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getGeo_latitude() {
		return geo_latitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeo_latitude(double newGeo_latitude) {
		double oldGeo_latitude = geo_latitude;
		geo_latitude = newGeo_latitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.LOCATION_UPDATE_EVENT__GEO_LATITUDE, oldGeo_latitude, geo_latitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getGeo_longitude() {
		return geo_longitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeo_longitude(double newGeo_longitude) {
		double oldGeo_longitude = geo_longitude;
		geo_longitude = newGeo_longitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.LOCATION_UPDATE_EVENT__GEO_LONGITUDE, oldGeo_longitude, geo_longitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EventsPackage.LOCATION_UPDATE_EVENT__LOCATION:
				return getLocation();
			case EventsPackage.LOCATION_UPDATE_EVENT__GEO_LATITUDE:
				return getGeo_latitude();
			case EventsPackage.LOCATION_UPDATE_EVENT__GEO_LONGITUDE:
				return getGeo_longitude();
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
			case EventsPackage.LOCATION_UPDATE_EVENT__LOCATION:
				setLocation((LocationT)newValue);
				return;
			case EventsPackage.LOCATION_UPDATE_EVENT__GEO_LATITUDE:
				setGeo_latitude((Double)newValue);
				return;
			case EventsPackage.LOCATION_UPDATE_EVENT__GEO_LONGITUDE:
				setGeo_longitude((Double)newValue);
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
			case EventsPackage.LOCATION_UPDATE_EVENT__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case EventsPackage.LOCATION_UPDATE_EVENT__GEO_LATITUDE:
				setGeo_latitude(GEO_LATITUDE_EDEFAULT);
				return;
			case EventsPackage.LOCATION_UPDATE_EVENT__GEO_LONGITUDE:
				setGeo_longitude(GEO_LONGITUDE_EDEFAULT);
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
			case EventsPackage.LOCATION_UPDATE_EVENT__LOCATION:
				return location != LOCATION_EDEFAULT;
			case EventsPackage.LOCATION_UPDATE_EVENT__GEO_LATITUDE:
				return geo_latitude != GEO_LATITUDE_EDEFAULT;
			case EventsPackage.LOCATION_UPDATE_EVENT__GEO_LONGITUDE:
				return geo_longitude != GEO_LONGITUDE_EDEFAULT;
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
		result.append(location);
		result.append(", geo_latitude: ");
		result.append(geo_latitude);
		result.append(", geo_longitude: ");
		result.append(geo_longitude);
		result.append(')');
		return result.toString();
	}

} //LocationUpdateEventImpl
