/**
 */
package org.carim.model;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location Time Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.carim.model.LocationTimeContext#getLocation <em>Location</em>}</li>
 *   <li>{@link org.carim.model.LocationTimeContext#getGeoLatitude <em>Geo Latitude</em>}</li>
 *   <li>{@link org.carim.model.LocationTimeContext#getGeoLongitude <em>Geo Longitude</em>}</li>
 *   <li>{@link org.carim.model.LocationTimeContext#getMobilityLevel <em>Mobility Level</em>}</li>
 *   <li>{@link org.carim.model.LocationTimeContext#getTime <em>Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.carim.model.carimModelPackage#getLocationTimeContext()
 * @model extendedMetaData="name='LocationTimeContext' kind='elementOnly'"
 * @generated
 */
public interface LocationTimeContext extends EObject {
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
	 * @see #isSetLocation()
	 * @see #unsetLocation()
	 * @see #setLocation(LocationT)
	 * @see org.carim.model.carimModelPackage#getLocationTimeContext_Location()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='location' namespace='##targetNamespace'"
	 * @generated
	 */
	LocationT getLocation();

	/**
	 * Sets the value of the '{@link org.carim.model.LocationTimeContext#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see org.carim.model.LocationT
	 * @see #isSetLocation()
	 * @see #unsetLocation()
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(LocationT value);

	/**
	 * Unsets the value of the '{@link org.carim.model.LocationTimeContext#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLocation()
	 * @see #getLocation()
	 * @see #setLocation(LocationT)
	 * @generated
	 */
	void unsetLocation();

	/**
	 * Returns whether the value of the '{@link org.carim.model.LocationTimeContext#getLocation <em>Location</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Location</em>' attribute is set.
	 * @see #unsetLocation()
	 * @see #getLocation()
	 * @see #setLocation(LocationT)
	 * @generated
	 */
	boolean isSetLocation();

	/**
	 * Returns the value of the '<em><b>Geo Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geo Latitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geo Latitude</em>' attribute.
	 * @see #isSetGeoLatitude()
	 * @see #unsetGeoLatitude()
	 * @see #setGeoLatitude(double)
	 * @see org.carim.model.carimModelPackage#getLocationTimeContext_GeoLatitude()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='element' name='geo_latitude' namespace='##targetNamespace'"
	 * @generated
	 */
	double getGeoLatitude();

	/**
	 * Sets the value of the '{@link org.carim.model.LocationTimeContext#getGeoLatitude <em>Geo Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geo Latitude</em>' attribute.
	 * @see #isSetGeoLatitude()
	 * @see #unsetGeoLatitude()
	 * @see #getGeoLatitude()
	 * @generated
	 */
	void setGeoLatitude(double value);

	/**
	 * Unsets the value of the '{@link org.carim.model.LocationTimeContext#getGeoLatitude <em>Geo Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGeoLatitude()
	 * @see #getGeoLatitude()
	 * @see #setGeoLatitude(double)
	 * @generated
	 */
	void unsetGeoLatitude();

	/**
	 * Returns whether the value of the '{@link org.carim.model.LocationTimeContext#getGeoLatitude <em>Geo Latitude</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Geo Latitude</em>' attribute is set.
	 * @see #unsetGeoLatitude()
	 * @see #getGeoLatitude()
	 * @see #setGeoLatitude(double)
	 * @generated
	 */
	boolean isSetGeoLatitude();

	/**
	 * Returns the value of the '<em><b>Geo Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geo Longitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geo Longitude</em>' attribute.
	 * @see #isSetGeoLongitude()
	 * @see #unsetGeoLongitude()
	 * @see #setGeoLongitude(double)
	 * @see org.carim.model.carimModelPackage#getLocationTimeContext_GeoLongitude()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='element' name='geo_longitude' namespace='##targetNamespace'"
	 * @generated
	 */
	double getGeoLongitude();

	/**
	 * Sets the value of the '{@link org.carim.model.LocationTimeContext#getGeoLongitude <em>Geo Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geo Longitude</em>' attribute.
	 * @see #isSetGeoLongitude()
	 * @see #unsetGeoLongitude()
	 * @see #getGeoLongitude()
	 * @generated
	 */
	void setGeoLongitude(double value);

	/**
	 * Unsets the value of the '{@link org.carim.model.LocationTimeContext#getGeoLongitude <em>Geo Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGeoLongitude()
	 * @see #getGeoLongitude()
	 * @see #setGeoLongitude(double)
	 * @generated
	 */
	void unsetGeoLongitude();

	/**
	 * Returns whether the value of the '{@link org.carim.model.LocationTimeContext#getGeoLongitude <em>Geo Longitude</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Geo Longitude</em>' attribute is set.
	 * @see #unsetGeoLongitude()
	 * @see #getGeoLongitude()
	 * @see #setGeoLongitude(double)
	 * @generated
	 */
	boolean isSetGeoLongitude();

	/**
	 * Returns the value of the '<em><b>Mobility Level</b></em>' attribute.
	 * The literals are from the enumeration {@link org.carim.model.MobilityLevelT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mobility Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mobility Level</em>' attribute.
	 * @see org.carim.model.MobilityLevelT
	 * @see #isSetMobilityLevel()
	 * @see #unsetMobilityLevel()
	 * @see #setMobilityLevel(MobilityLevelT)
	 * @see org.carim.model.carimModelPackage#getLocationTimeContext_MobilityLevel()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='mobilityLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	MobilityLevelT getMobilityLevel();

	/**
	 * Sets the value of the '{@link org.carim.model.LocationTimeContext#getMobilityLevel <em>Mobility Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mobility Level</em>' attribute.
	 * @see org.carim.model.MobilityLevelT
	 * @see #isSetMobilityLevel()
	 * @see #unsetMobilityLevel()
	 * @see #getMobilityLevel()
	 * @generated
	 */
	void setMobilityLevel(MobilityLevelT value);

	/**
	 * Unsets the value of the '{@link org.carim.model.LocationTimeContext#getMobilityLevel <em>Mobility Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMobilityLevel()
	 * @see #getMobilityLevel()
	 * @see #setMobilityLevel(MobilityLevelT)
	 * @generated
	 */
	void unsetMobilityLevel();

	/**
	 * Returns whether the value of the '{@link org.carim.model.LocationTimeContext#getMobilityLevel <em>Mobility Level</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mobility Level</em>' attribute is set.
	 * @see #unsetMobilityLevel()
	 * @see #getMobilityLevel()
	 * @see #setMobilityLevel(MobilityLevelT)
	 * @generated
	 */
	boolean isSetMobilityLevel();

	/**
	 * Returns the value of the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' containment reference.
	 * @see #setTime(DateTimeT)
	 * @see org.carim.model.carimModelPackage#getLocationTimeContext_Time()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='time' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTimeT getTime();

	/**
	 * Sets the value of the '{@link org.carim.model.LocationTimeContext#getTime <em>Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' containment reference.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(DateTimeT value);

} // LocationTimeContext
