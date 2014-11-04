/**
 */
package org.mmi.events;

import org.carim.model.LocationT;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location Update Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mmi.events.LocationUpdateEvent#getLocation <em>Location</em>}</li>
 *   <li>{@link org.mmi.events.LocationUpdateEvent#getGeo_latitude <em>Geo latitude</em>}</li>
 *   <li>{@link org.mmi.events.LocationUpdateEvent#getGeo_longitude <em>Geo longitude</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mmi.events.EventsPackage#getLocationUpdateEvent()
 * @model
 * @generated
 */
public interface LocationUpdateEvent extends LocationTimeContextEvent {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * The literals are from the enumeration {@link org.carim.model.LocationT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see org.carim.model.LocationT
	 * @see #setLocation(LocationT)
	 * @see org.mmi.events.EventsPackage#getLocationUpdateEvent_Location()
	 * @model
	 * @generated
	 */
	LocationT getLocation();

	/**
	 * Sets the value of the '{@link org.mmi.events.LocationUpdateEvent#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see org.carim.model.LocationT
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(LocationT value);

	/**
	 * Returns the value of the '<em><b>Geo latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geo latitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geo latitude</em>' attribute.
	 * @see #setGeo_latitude(double)
	 * @see org.mmi.events.EventsPackage#getLocationUpdateEvent_Geo_latitude()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double"
	 * @generated
	 */
	double getGeo_latitude();

	/**
	 * Sets the value of the '{@link org.mmi.events.LocationUpdateEvent#getGeo_latitude <em>Geo latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geo latitude</em>' attribute.
	 * @see #getGeo_latitude()
	 * @generated
	 */
	void setGeo_latitude(double value);

	/**
	 * Returns the value of the '<em><b>Geo longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geo longitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geo longitude</em>' attribute.
	 * @see #setGeo_longitude(double)
	 * @see org.mmi.events.EventsPackage#getLocationUpdateEvent_Geo_longitude()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double"
	 * @generated
	 */
	double getGeo_longitude();

	/**
	 * Sets the value of the '{@link org.mmi.events.LocationUpdateEvent#getGeo_longitude <em>Geo longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geo longitude</em>' attribute.
	 * @see #getGeo_longitude()
	 * @generated
	 */
	void setGeo_longitude(double value);

} // LocationUpdateEvent
