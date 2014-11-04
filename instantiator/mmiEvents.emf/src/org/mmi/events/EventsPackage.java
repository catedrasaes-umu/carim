/**
 */
package org.mmi.events;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.mmi.events.EventsFactory
 * @model kind="package"
 * @generated
 */
public interface EventsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "events";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org/mmiEventsModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "events";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EventsPackage eINSTANCE = org.mmi.events.impl.EventsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.EventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__TIMESTAMP = 1;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.InputEventImpl <em>Input Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.InputEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getInputEvent()
	 * @generated
	 */
	int INPUT_EVENT = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_EVENT__TYPE = EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_EVENT__TIMESTAMP = EVENT__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>Input Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.OutputEventImpl <em>Output Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.OutputEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getOutputEvent()
	 * @generated
	 */
	int OUTPUT_EVENT = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_EVENT__TYPE = EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_EVENT__TIMESTAMP = EVENT__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>Output Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.DialogueContentEventImpl <em>Dialogue Content Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.DialogueContentEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getDialogueContentEvent()
	 * @generated
	 */
	int DIALOGUE_CONTENT_EVENT = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOGUE_CONTENT_EVENT__TYPE = EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOGUE_CONTENT_EVENT__TIMESTAMP = EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Nitems</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOGUE_CONTENT_EVENT__NITEMS = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dialogue Content Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOGUE_CONTENT_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.MetacommEventImpl <em>Metacomm Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.MetacommEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getMetacommEvent()
	 * @generated
	 */
	int METACOMM_EVENT = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METACOMM_EVENT__TYPE = EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METACOMM_EVENT__TIMESTAMP = EVENT__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>Metacomm Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METACOMM_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.TurnControlEventImpl <em>Turn Control Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.TurnControlEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getTurnControlEvent()
	 * @generated
	 */
	int TURN_CONTROL_EVENT = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_CONTROL_EVENT__TYPE = EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_CONTROL_EVENT__TIMESTAMP = EVENT__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>Turn Control Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_CONTROL_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.TurnTimingEventImpl <em>Turn Timing Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.TurnTimingEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getTurnTimingEvent()
	 * @generated
	 */
	int TURN_TIMING_EVENT = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_TIMING_EVENT__TYPE = EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_TIMING_EVENT__TIMESTAMP = EVENT__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>Turn Timing Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_TIMING_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.ContextEventImpl <em>Context Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.ContextEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getContextEvent()
	 * @generated
	 */
	int CONTEXT_EVENT = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_EVENT__TYPE = EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_EVENT__TIMESTAMP = EVENT__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>Context Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.PhysicalEnvironmentContextEventImpl <em>Physical Environment Context Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.PhysicalEnvironmentContextEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getPhysicalEnvironmentContextEvent()
	 * @generated
	 */
	int PHYSICAL_ENVIRONMENT_CONTEXT_EVENT = 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ENVIRONMENT_CONTEXT_EVENT__TYPE = CONTEXT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ENVIRONMENT_CONTEXT_EVENT__TIMESTAMP = CONTEXT_EVENT__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>Physical Environment Context Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ENVIRONMENT_CONTEXT_EVENT_FEATURE_COUNT = CONTEXT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.WeatherUpdateEventImpl <em>Weather Update Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.WeatherUpdateEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getWeatherUpdateEvent()
	 * @generated
	 */
	int WEATHER_UPDATE_EVENT = 9;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_UPDATE_EVENT__TYPE = PHYSICAL_ENVIRONMENT_CONTEXT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_UPDATE_EVENT__TIMESTAMP = PHYSICAL_ENVIRONMENT_CONTEXT_EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_UPDATE_EVENT__TEMPERATURE = PHYSICAL_ENVIRONMENT_CONTEXT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Weather</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_UPDATE_EVENT__WEATHER = PHYSICAL_ENVIRONMENT_CONTEXT_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Weather Update Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_UPDATE_EVENT_FEATURE_COUNT = PHYSICAL_ENVIRONMENT_CONTEXT_EVENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.AmbientUpdateEventImpl <em>Ambient Update Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.AmbientUpdateEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getAmbientUpdateEvent()
	 * @generated
	 */
	int AMBIENT_UPDATE_EVENT = 10;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMBIENT_UPDATE_EVENT__TYPE = PHYSICAL_ENVIRONMENT_CONTEXT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMBIENT_UPDATE_EVENT__TIMESTAMP = PHYSICAL_ENVIRONMENT_CONTEXT_EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Noise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMBIENT_UPDATE_EVENT__NOISE = PHYSICAL_ENVIRONMENT_CONTEXT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Light</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMBIENT_UPDATE_EVENT__LIGHT = PHYSICAL_ENVIRONMENT_CONTEXT_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ambient Update Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMBIENT_UPDATE_EVENT_FEATURE_COUNT = PHYSICAL_ENVIRONMENT_CONTEXT_EVENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.UserContextEventImpl <em>User Context Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.UserContextEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getUserContextEvent()
	 * @generated
	 */
	int USER_CONTEXT_EVENT = 11;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_CONTEXT_EVENT__TYPE = CONTEXT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_CONTEXT_EVENT__TIMESTAMP = CONTEXT_EVENT__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>User Context Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_CONTEXT_EVENT_FEATURE_COUNT = CONTEXT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.UserDataUpdateEventImpl <em>User Data Update Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.UserDataUpdateEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getUserDataUpdateEvent()
	 * @generated
	 */
	int USER_DATA_UPDATE_EVENT = 12;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DATA_UPDATE_EVENT__TYPE = USER_CONTEXT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DATA_UPDATE_EVENT__TIMESTAMP = USER_CONTEXT_EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DATA_UPDATE_EVENT__AGE = USER_CONTEXT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DATA_UPDATE_EVENT__GENDER = USER_CONTEXT_EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Education Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DATA_UPDATE_EVENT__EDUCATION_LEVEL = USER_CONTEXT_EVENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Previous Experience</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DATA_UPDATE_EVENT__PREVIOUS_EXPERIENCE = USER_CONTEXT_EVENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>User Data Update Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DATA_UPDATE_EVENT_FEATURE_COUNT = USER_CONTEXT_EVENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.UserRatingsUpdateEventImpl <em>User Ratings Update Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.UserRatingsUpdateEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getUserRatingsUpdateEvent()
	 * @generated
	 */
	int USER_RATINGS_UPDATE_EVENT = 13;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_RATINGS_UPDATE_EVENT__TYPE = USER_CONTEXT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_RATINGS_UPDATE_EVENT__TIMESTAMP = USER_CONTEXT_EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Practical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_RATINGS_UPDATE_EVENT__PRACTICAL = USER_CONTEXT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Predictable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_RATINGS_UPDATE_EVENT__PREDICTABLE = USER_CONTEXT_EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Clearly Structured</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_RATINGS_UPDATE_EVENT__CLEARLY_STRUCTURED = USER_CONTEXT_EVENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Simple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_RATINGS_UPDATE_EVENT__SIMPLE = USER_CONTEXT_EVENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Stylish</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_RATINGS_UPDATE_EVENT__STYLISH = USER_CONTEXT_EVENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Premium</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_RATINGS_UPDATE_EVENT__PREMIUM = USER_CONTEXT_EVENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Creative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_RATINGS_UPDATE_EVENT__CREATIVE = USER_CONTEXT_EVENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Captivating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_RATINGS_UPDATE_EVENT__CAPTIVATING = USER_CONTEXT_EVENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Beautiful</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_RATINGS_UPDATE_EVENT__BEAUTIFUL = USER_CONTEXT_EVENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Good</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_RATINGS_UPDATE_EVENT__GOOD = USER_CONTEXT_EVENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>User Ratings Update Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_RATINGS_UPDATE_EVENT_FEATURE_COUNT = USER_CONTEXT_EVENT_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.UserAttitudeUpdateEventImpl <em>User Attitude Update Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.UserAttitudeUpdateEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getUserAttitudeUpdateEvent()
	 * @generated
	 */
	int USER_ATTITUDE_UPDATE_EVENT = 14;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTITUDE_UPDATE_EVENT__TYPE = USER_CONTEXT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTITUDE_UPDATE_EVENT__TIMESTAMP = USER_CONTEXT_EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Usefulness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTITUDE_UPDATE_EVENT__USEFULNESS = USER_CONTEXT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pleasantness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTITUDE_UPDATE_EVENT__PLEASANTNESS = USER_CONTEXT_EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Integration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTITUDE_UPDATE_EVENT__INTEGRATION = USER_CONTEXT_EVENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Self Efficacy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTITUDE_UPDATE_EVENT__SELF_EFFICACY = USER_CONTEXT_EVENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Comfort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTITUDE_UPDATE_EVENT__COMFORT = USER_CONTEXT_EVENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>User Attitude Update Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTITUDE_UPDATE_EVENT_FEATURE_COUNT = USER_CONTEXT_EVENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.UserMoodUpdateEventImpl <em>User Mood Update Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.UserMoodUpdateEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getUserMoodUpdateEvent()
	 * @generated
	 */
	int USER_MOOD_UPDATE_EVENT = 15;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_MOOD_UPDATE_EVENT__TYPE = USER_CONTEXT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_MOOD_UPDATE_EVENT__TIMESTAMP = USER_CONTEXT_EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Mood</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_MOOD_UPDATE_EVENT__MOOD = USER_CONTEXT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>User Mood Update Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_MOOD_UPDATE_EVENT_FEATURE_COUNT = USER_CONTEXT_EVENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.SocialContextEventImpl <em>Social Context Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.SocialContextEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getSocialContextEvent()
	 * @generated
	 */
	int SOCIAL_CONTEXT_EVENT = 16;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_CONTEXT_EVENT__TYPE = CONTEXT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_CONTEXT_EVENT__TIMESTAMP = CONTEXT_EVENT__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>Social Context Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_CONTEXT_EVENT_FEATURE_COUNT = CONTEXT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.SocialUpdateEventImpl <em>Social Update Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.SocialUpdateEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getSocialUpdateEvent()
	 * @generated
	 */
	int SOCIAL_UPDATE_EVENT = 17;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_UPDATE_EVENT__TYPE = SOCIAL_CONTEXT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_UPDATE_EVENT__TIMESTAMP = SOCIAL_CONTEXT_EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Social Company</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_UPDATE_EVENT__SOCIAL_COMPANY = SOCIAL_CONTEXT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Social Arena</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_UPDATE_EVENT__SOCIAL_ARENA = SOCIAL_CONTEXT_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Social Update Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_UPDATE_EVENT_FEATURE_COUNT = SOCIAL_CONTEXT_EVENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.LocationTimeContextEventImpl <em>Location Time Context Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.LocationTimeContextEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getLocationTimeContextEvent()
	 * @generated
	 */
	int LOCATION_TIME_CONTEXT_EVENT = 18;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TIME_CONTEXT_EVENT__TYPE = CONTEXT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TIME_CONTEXT_EVENT__TIMESTAMP = CONTEXT_EVENT__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>Location Time Context Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TIME_CONTEXT_EVENT_FEATURE_COUNT = CONTEXT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.LocationUpdateEventImpl <em>Location Update Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.LocationUpdateEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getLocationUpdateEvent()
	 * @generated
	 */
	int LOCATION_UPDATE_EVENT = 19;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_UPDATE_EVENT__TYPE = LOCATION_TIME_CONTEXT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_UPDATE_EVENT__TIMESTAMP = LOCATION_TIME_CONTEXT_EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_UPDATE_EVENT__LOCATION = LOCATION_TIME_CONTEXT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Geo latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_UPDATE_EVENT__GEO_LATITUDE = LOCATION_TIME_CONTEXT_EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Geo longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_UPDATE_EVENT__GEO_LONGITUDE = LOCATION_TIME_CONTEXT_EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Location Update Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_UPDATE_EVENT_FEATURE_COUNT = LOCATION_TIME_CONTEXT_EVENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.MobilityUpdateEventImpl <em>Mobility Update Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.MobilityUpdateEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getMobilityUpdateEvent()
	 * @generated
	 */
	int MOBILITY_UPDATE_EVENT = 20;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILITY_UPDATE_EVENT__TYPE = LOCATION_TIME_CONTEXT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILITY_UPDATE_EVENT__TIMESTAMP = LOCATION_TIME_CONTEXT_EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Mobility Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILITY_UPDATE_EVENT__MOBILITY_LEVEL = LOCATION_TIME_CONTEXT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mobility Update Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILITY_UPDATE_EVENT_FEATURE_COUNT = LOCATION_TIME_CONTEXT_EVENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.TimeUpdateEventImpl <em>Time Update Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.TimeUpdateEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getTimeUpdateEvent()
	 * @generated
	 */
	int TIME_UPDATE_EVENT = 21;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_UPDATE_EVENT__TYPE = LOCATION_TIME_CONTEXT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_UPDATE_EVENT__TIMESTAMP = LOCATION_TIME_CONTEXT_EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Dyear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_UPDATE_EVENT__DYEAR = LOCATION_TIME_CONTEXT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dmonth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_UPDATE_EVENT__DMONTH = LOCATION_TIME_CONTEXT_EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dday</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_UPDATE_EVENT__DDAY = LOCATION_TIME_CONTEXT_EVENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Thours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_UPDATE_EVENT__THOURS = LOCATION_TIME_CONTEXT_EVENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Tmins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_UPDATE_EVENT__TMINS = LOCATION_TIME_CONTEXT_EVENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Tsecs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_UPDATE_EVENT__TSECS = LOCATION_TIME_CONTEXT_EVENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Time Update Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_UPDATE_EVENT_FEATURE_COUNT = LOCATION_TIME_CONTEXT_EVENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.DeviceContextEventImpl <em>Device Context Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.DeviceContextEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getDeviceContextEvent()
	 * @generated
	 */
	int DEVICE_CONTEXT_EVENT = 22;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_CONTEXT_EVENT__TYPE = CONTEXT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_CONTEXT_EVENT__TIMESTAMP = CONTEXT_EVENT__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>Device Context Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_CONTEXT_EVENT_FEATURE_COUNT = CONTEXT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.DeviceFeaturesUpdateEventImpl <em>Device Features Update Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.DeviceFeaturesUpdateEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getDeviceFeaturesUpdateEvent()
	 * @generated
	 */
	int DEVICE_FEATURES_UPDATE_EVENT = 23;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FEATURES_UPDATE_EVENT__TYPE = DEVICE_CONTEXT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FEATURES_UPDATE_EVENT__TIMESTAMP = DEVICE_CONTEXT_EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Device Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FEATURES_UPDATE_EVENT__DEVICE_TYPE = DEVICE_CONTEXT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Screen Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FEATURES_UPDATE_EVENT__SCREEN_SIZE = DEVICE_CONTEXT_EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Screen Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FEATURES_UPDATE_EVENT__SCREEN_RESOLUTION = DEVICE_CONTEXT_EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Device Features Update Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FEATURES_UPDATE_EVENT_FEATURE_COUNT = DEVICE_CONTEXT_EVENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.DeviceRunningFeaturesUpdateEventImpl <em>Device Running Features Update Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.DeviceRunningFeaturesUpdateEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getDeviceRunningFeaturesUpdateEvent()
	 * @generated
	 */
	int DEVICE_RUNNING_FEATURES_UPDATE_EVENT = 24;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_RUNNING_FEATURES_UPDATE_EVENT__TYPE = DEVICE_CONTEXT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_RUNNING_FEATURES_UPDATE_EVENT__TIMESTAMP = DEVICE_CONTEXT_EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Screen Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_RUNNING_FEATURES_UPDATE_EVENT__SCREEN_ORIENTATION = DEVICE_CONTEXT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Brightness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_RUNNING_FEATURES_UPDATE_EVENT__BRIGHTNESS = DEVICE_CONTEXT_EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_RUNNING_FEATURES_UPDATE_EVENT__VOLUME = DEVICE_CONTEXT_EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Device Running Features Update Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_RUNNING_FEATURES_UPDATE_EVENT_FEATURE_COUNT = DEVICE_CONTEXT_EVENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.DeviceWorkloadUpdateEventImpl <em>Device Workload Update Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.DeviceWorkloadUpdateEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getDeviceWorkloadUpdateEvent()
	 * @generated
	 */
	int DEVICE_WORKLOAD_UPDATE_EVENT = 25;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_WORKLOAD_UPDATE_EVENT__TYPE = DEVICE_CONTEXT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_WORKLOAD_UPDATE_EVENT__TIMESTAMP = DEVICE_CONTEXT_EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Memory Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_WORKLOAD_UPDATE_EVENT__MEMORY_USAGE = DEVICE_CONTEXT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cpu Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_WORKLOAD_UPDATE_EVENT__CPU_USAGE = DEVICE_CONTEXT_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Device Workload Update Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_WORKLOAD_UPDATE_EVENT_FEATURE_COUNT = DEVICE_CONTEXT_EVENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.CommunicationContextEventImpl <em>Communication Context Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.CommunicationContextEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getCommunicationContextEvent()
	 * @generated
	 */
	int COMMUNICATION_CONTEXT_EVENT = 26;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_CONTEXT_EVENT__TYPE = CONTEXT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_CONTEXT_EVENT__TIMESTAMP = CONTEXT_EVENT__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>Communication Context Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_CONTEXT_EVENT_FEATURE_COUNT = CONTEXT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.SignalUpdateEventImpl <em>Signal Update Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.SignalUpdateEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getSignalUpdateEvent()
	 * @generated
	 */
	int SIGNAL_UPDATE_EVENT = 27;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_UPDATE_EVENT__TYPE = COMMUNICATION_CONTEXT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_UPDATE_EVENT__TIMESTAMP = COMMUNICATION_CONTEXT_EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Wireless Access Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_UPDATE_EVENT__WIRELESS_ACCESS_TYPE = COMMUNICATION_CONTEXT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Access Point Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_UPDATE_EVENT__ACCESS_POINT_NAME = COMMUNICATION_CONTEXT_EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Signal Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_UPDATE_EVENT__SIGNAL_STRENGTH = COMMUNICATION_CONTEXT_EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Signal Update Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_UPDATE_EVENT_FEATURE_COUNT = COMMUNICATION_CONTEXT_EVENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.ThroughputUpdateEventImpl <em>Throughput Update Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.ThroughputUpdateEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getThroughputUpdateEvent()
	 * @generated
	 */
	int THROUGHPUT_UPDATE_EVENT = 28;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROUGHPUT_UPDATE_EVENT__TYPE = COMMUNICATION_CONTEXT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROUGHPUT_UPDATE_EVENT__TIMESTAMP = COMMUNICATION_CONTEXT_EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Received Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROUGHPUT_UPDATE_EVENT__RECEIVED_DATA = COMMUNICATION_CONTEXT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sent Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROUGHPUT_UPDATE_EVENT__SENT_DATA = COMMUNICATION_CONTEXT_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Throughput Update Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROUGHPUT_UPDATE_EVENT_FEATURE_COUNT = COMMUNICATION_CONTEXT_EVENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.ServerResponseUpdateEventImpl <em>Server Response Update Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.ServerResponseUpdateEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getServerResponseUpdateEvent()
	 * @generated
	 */
	int SERVER_RESPONSE_UPDATE_EVENT = 29;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_RESPONSE_UPDATE_EVENT__TYPE = COMMUNICATION_CONTEXT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_RESPONSE_UPDATE_EVENT__TIMESTAMP = COMMUNICATION_CONTEXT_EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Rtt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_RESPONSE_UPDATE_EVENT__RTT = COMMUNICATION_CONTEXT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Srt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_RESPONSE_UPDATE_EVENT__SRT = COMMUNICATION_CONTEXT_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Server Response Update Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_RESPONSE_UPDATE_EVENT_FEATURE_COUNT = COMMUNICATION_CONTEXT_EVENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.NavigationEventImpl <em>Navigation Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.NavigationEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getNavigationEvent()
	 * @generated
	 */
	int NAVIGATION_EVENT = 30;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_EVENT__TYPE = INPUT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_EVENT__TIMESTAMP = INPUT_EVENT__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>Navigation Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_EVENT_FEATURE_COUNT = INPUT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.MotionEventImpl <em>Motion Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.MotionEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getMotionEvent()
	 * @generated
	 */
	int MOTION_EVENT = 31;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION_EVENT__TYPE = INPUT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION_EVENT__TIMESTAMP = INPUT_EVENT__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>Motion Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION_EVENT_FEATURE_COUNT = INPUT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.TextEventImpl <em>Text Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.TextEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getTextEvent()
	 * @generated
	 */
	int TEXT_EVENT = 32;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_EVENT__TYPE = INPUT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_EVENT__TIMESTAMP = INPUT_EVENT__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>Text Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_EVENT_FEATURE_COUNT = INPUT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.SpeechInputEventImpl <em>Speech Input Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.SpeechInputEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getSpeechInputEvent()
	 * @generated
	 */
	int SPEECH_INPUT_EVENT = 33;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_INPUT_EVENT__TYPE = INPUT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_INPUT_EVENT__TIMESTAMP = INPUT_EVENT__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>Speech Input Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_INPUT_EVENT_FEATURE_COUNT = INPUT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.ScreenEventImpl <em>Screen Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.ScreenEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getScreenEvent()
	 * @generated
	 */
	int SCREEN_EVENT = 34;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_EVENT__TYPE = OUTPUT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_EVENT__TIMESTAMP = OUTPUT_EVENT__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>Screen Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_EVENT_FEATURE_COUNT = OUTPUT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.ScreenContentEventImpl <em>Screen Content Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.ScreenContentEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getScreenContentEvent()
	 * @generated
	 */
	int SCREEN_CONTENT_EVENT = 35;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_CONTENT_EVENT__TYPE = SCREEN_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_CONTENT_EVENT__TIMESTAMP = SCREEN_EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Nitems</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_CONTENT_EVENT__NITEMS = SCREEN_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Screen Content Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_CONTENT_EVENT_FEATURE_COUNT = SCREEN_EVENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.SpeechOutputEventImpl <em>Speech Output Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.SpeechOutputEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getSpeechOutputEvent()
	 * @generated
	 */
	int SPEECH_OUTPUT_EVENT = 36;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_OUTPUT_EVENT__TYPE = OUTPUT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_OUTPUT_EVENT__TIMESTAMP = OUTPUT_EVENT__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>Speech Output Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_OUTPUT_EVENT_FEATURE_COUNT = OUTPUT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.SpeechOutputContentEventImpl <em>Speech Output Content Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.SpeechOutputContentEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getSpeechOutputContentEvent()
	 * @generated
	 */
	int SPEECH_OUTPUT_CONTENT_EVENT = 37;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_OUTPUT_CONTENT_EVENT__TYPE = SPEECH_OUTPUT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_OUTPUT_CONTENT_EVENT__TIMESTAMP = SPEECH_OUTPUT_EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Nitems</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_OUTPUT_CONTENT_EVENT__NITEMS = SPEECH_OUTPUT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Speech Output Content Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_OUTPUT_CONTENT_EVENT_FEATURE_COUNT = SPEECH_OUTPUT_EVENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.TouchEventImpl <em>Touch Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.TouchEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getTouchEvent()
	 * @generated
	 */
	int TOUCH_EVENT = 38;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_EVENT__TYPE = NAVIGATION_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_EVENT__TIMESTAMP = NAVIGATION_EVENT__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>Touch Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_EVENT_FEATURE_COUNT = NAVIGATION_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.ClickEventImpl <em>Click Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.ClickEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getClickEvent()
	 * @generated
	 */
	int CLICK_EVENT = 39;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLICK_EVENT__TYPE = NAVIGATION_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLICK_EVENT__TIMESTAMP = NAVIGATION_EVENT__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>Click Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLICK_EVENT_FEATURE_COUNT = NAVIGATION_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.LongClickEventImpl <em>Long Click Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.LongClickEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getLongClickEvent()
	 * @generated
	 */
	int LONG_CLICK_EVENT = 40;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_CLICK_EVENT__TYPE = NAVIGATION_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_CLICK_EVENT__TIMESTAMP = NAVIGATION_EVENT__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>Long Click Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_CLICK_EVENT_FEATURE_COUNT = NAVIGATION_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.ScrollEventImpl <em>Scroll Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.ScrollEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getScrollEvent()
	 * @generated
	 */
	int SCROLL_EVENT = 41;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_EVENT__TYPE = NAVIGATION_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_EVENT__TIMESTAMP = NAVIGATION_EVENT__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>Scroll Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_EVENT_FEATURE_COUNT = NAVIGATION_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.MoveEventImpl <em>Move Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.MoveEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getMoveEvent()
	 * @generated
	 */
	int MOVE_EVENT = 42;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_EVENT__TYPE = NAVIGATION_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_EVENT__TIMESTAMP = NAVIGATION_EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_EVENT__LENGTH = NAVIGATION_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Move Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_EVENT_FEATURE_COUNT = NAVIGATION_EVENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.NavigationMoveEventImpl <em>Navigation Move Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.NavigationMoveEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getNavigationMoveEvent()
	 * @generated
	 */
	int NAVIGATION_MOVE_EVENT = 43;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_MOVE_EVENT__TYPE = NAVIGATION_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_MOVE_EVENT__TIMESTAMP = NAVIGATION_EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_MOVE_EVENT__LENGTH = NAVIGATION_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Navigation Move Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_MOVE_EVENT_FEATURE_COUNT = NAVIGATION_EVENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.NavigationActionEventImpl <em>Navigation Action Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.NavigationActionEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getNavigationActionEvent()
	 * @generated
	 */
	int NAVIGATION_ACTION_EVENT = 44;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_ACTION_EVENT__TYPE = NAVIGATION_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_ACTION_EVENT__TIMESTAMP = NAVIGATION_EVENT__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>Navigation Action Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_ACTION_EVENT_FEATURE_COUNT = NAVIGATION_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.NavigationExploreEventImpl <em>Navigation Explore Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.NavigationExploreEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getNavigationExploreEvent()
	 * @generated
	 */
	int NAVIGATION_EXPLORE_EVENT = 45;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_EXPLORE_EVENT__TYPE = NAVIGATION_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_EXPLORE_EVENT__TIMESTAMP = NAVIGATION_EVENT__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>Navigation Explore Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_EXPLORE_EVENT_FEATURE_COUNT = NAVIGATION_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.TiltEventImpl <em>Tilt Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.TiltEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getTiltEvent()
	 * @generated
	 */
	int TILT_EVENT = 46;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILT_EVENT__TYPE = MOTION_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILT_EVENT__TIMESTAMP = MOTION_EVENT__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>Tilt Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILT_EVENT_FEATURE_COUNT = MOTION_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.TwistEventImpl <em>Twist Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.TwistEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getTwistEvent()
	 * @generated
	 */
	int TWIST_EVENT = 47;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWIST_EVENT__TYPE = MOTION_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWIST_EVENT__TIMESTAMP = MOTION_EVENT__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>Twist Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWIST_EVENT_FEATURE_COUNT = MOTION_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.ShakeEventImpl <em>Shake Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.ShakeEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getShakeEvent()
	 * @generated
	 */
	int SHAKE_EVENT = 48;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAKE_EVENT__TYPE = MOTION_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAKE_EVENT__TIMESTAMP = MOTION_EVENT__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>Shake Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAKE_EVENT_FEATURE_COUNT = MOTION_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.MotionActionEventImpl <em>Motion Action Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.MotionActionEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getMotionActionEvent()
	 * @generated
	 */
	int MOTION_ACTION_EVENT = 49;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION_ACTION_EVENT__TYPE = MOTION_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION_ACTION_EVENT__TIMESTAMP = MOTION_EVENT__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>Motion Action Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION_ACTION_EVENT_FEATURE_COUNT = MOTION_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.KeyTextEventImpl <em>Key Text Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.KeyTextEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getKeyTextEvent()
	 * @generated
	 */
	int KEY_TEXT_EVENT = 50;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_TEXT_EVENT__TYPE = TEXT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_TEXT_EVENT__TIMESTAMP = TEXT_EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_TEXT_EVENT__CODE = TEXT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Key Text Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_TEXT_EVENT_FEATURE_COUNT = TEXT_EVENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.KeyExploreEventImpl <em>Key Explore Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.KeyExploreEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getKeyExploreEvent()
	 * @generated
	 */
	int KEY_EXPLORE_EVENT = 51;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_EXPLORE_EVENT__TYPE = TEXT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_EXPLORE_EVENT__TIMESTAMP = TEXT_EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_EXPLORE_EVENT__CODE = TEXT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Key Explore Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_EXPLORE_EVENT_FEATURE_COUNT = TEXT_EVENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.KeyCommandEventImpl <em>Key Command Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.KeyCommandEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getKeyCommandEvent()
	 * @generated
	 */
	int KEY_COMMAND_EVENT = 52;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_COMMAND_EVENT__TYPE = TEXT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_COMMAND_EVENT__TIMESTAMP = TEXT_EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_COMMAND_EVENT__CODE = TEXT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Key Command Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_COMMAND_EVENT_FEATURE_COUNT = TEXT_EVENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.TextWordEventImpl <em>Text Word Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.TextWordEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getTextWordEvent()
	 * @generated
	 */
	int TEXT_WORD_EVENT = 53;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_WORD_EVENT__TYPE = TEXT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_WORD_EVENT__TIMESTAMP = TEXT_EVENT__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>Text Word Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_WORD_EVENT_FEATURE_COUNT = TEXT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.TextExploreEventImpl <em>Text Explore Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.TextExploreEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getTextExploreEvent()
	 * @generated
	 */
	int TEXT_EXPLORE_EVENT = 54;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_EXPLORE_EVENT__TYPE = TEXT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_EXPLORE_EVENT__TIMESTAMP = TEXT_EVENT__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>Text Explore Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_EXPLORE_EVENT_FEATURE_COUNT = TEXT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.TextCommandEventImpl <em>Text Command Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.TextCommandEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getTextCommandEvent()
	 * @generated
	 */
	int TEXT_COMMAND_EVENT = 55;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_COMMAND_EVENT__TYPE = TEXT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_COMMAND_EVENT__TIMESTAMP = TEXT_EVENT__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>Text Command Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_COMMAND_EVENT_FEATURE_COUNT = TEXT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.GuiElementsEventImpl <em>Gui Elements Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.GuiElementsEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getGuiElementsEvent()
	 * @generated
	 */
	int GUI_ELEMENTS_EVENT = 56;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_ELEMENTS_EVENT__TYPE = SCREEN_CONTENT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_ELEMENTS_EVENT__TIMESTAMP = SCREEN_CONTENT_EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Nitems</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_ELEMENTS_EVENT__NITEMS = SCREEN_CONTENT_EVENT__NITEMS;

	/**
	 * The number of structural features of the '<em>Gui Elements Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_ELEMENTS_EVENT_FEATURE_COUNT = SCREEN_CONTENT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.GuiFeedbackEventImpl <em>Gui Feedback Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.GuiFeedbackEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getGuiFeedbackEvent()
	 * @generated
	 */
	int GUI_FEEDBACK_EVENT = 57;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_FEEDBACK_EVENT__TYPE = SCREEN_CONTENT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_FEEDBACK_EVENT__TIMESTAMP = SCREEN_CONTENT_EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Nitems</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_FEEDBACK_EVENT__NITEMS = SCREEN_CONTENT_EVENT__NITEMS;

	/**
	 * The number of structural features of the '<em>Gui Feedback Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_FEEDBACK_EVENT_FEATURE_COUNT = SCREEN_CONTENT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.GuiConceptsEventImpl <em>Gui Concepts Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.GuiConceptsEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getGuiConceptsEvent()
	 * @generated
	 */
	int GUI_CONCEPTS_EVENT = 58;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_CONCEPTS_EVENT__TYPE = SCREEN_CONTENT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_CONCEPTS_EVENT__TIMESTAMP = SCREEN_CONTENT_EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Nitems</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_CONCEPTS_EVENT__NITEMS = SCREEN_CONTENT_EVENT__NITEMS;

	/**
	 * The number of structural features of the '<em>Gui Concepts Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_CONCEPTS_EVENT_FEATURE_COUNT = SCREEN_CONTENT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.GuiNoiseEventImpl <em>Gui Noise Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.GuiNoiseEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getGuiNoiseEvent()
	 * @generated
	 */
	int GUI_NOISE_EVENT = 59;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_NOISE_EVENT__TYPE = SCREEN_CONTENT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_NOISE_EVENT__TIMESTAMP = SCREEN_CONTENT_EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Nitems</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_NOISE_EVENT__NITEMS = SCREEN_CONTENT_EVENT__NITEMS;

	/**
	 * The number of structural features of the '<em>Gui Noise Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_NOISE_EVENT_FEATURE_COUNT = SCREEN_CONTENT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.GuiQuestionsEventImpl <em>Gui Questions Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.GuiQuestionsEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getGuiQuestionsEvent()
	 * @generated
	 */
	int GUI_QUESTIONS_EVENT = 60;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_QUESTIONS_EVENT__TYPE = SCREEN_CONTENT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_QUESTIONS_EVENT__TIMESTAMP = SCREEN_CONTENT_EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Nitems</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_QUESTIONS_EVENT__NITEMS = SCREEN_CONTENT_EVENT__NITEMS;

	/**
	 * The number of structural features of the '<em>Gui Questions Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_QUESTIONS_EVENT_FEATURE_COUNT = SCREEN_CONTENT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.SpeechElementsEventImpl <em>Speech Elements Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.SpeechElementsEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getSpeechElementsEvent()
	 * @generated
	 */
	int SPEECH_ELEMENTS_EVENT = 61;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_ELEMENTS_EVENT__TYPE = SPEECH_OUTPUT_CONTENT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_ELEMENTS_EVENT__TIMESTAMP = SPEECH_OUTPUT_CONTENT_EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Nitems</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_ELEMENTS_EVENT__NITEMS = SPEECH_OUTPUT_CONTENT_EVENT__NITEMS;

	/**
	 * The number of structural features of the '<em>Speech Elements Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_ELEMENTS_EVENT_FEATURE_COUNT = SPEECH_OUTPUT_CONTENT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.SpeechFeedbackEventImpl <em>Speech Feedback Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.SpeechFeedbackEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getSpeechFeedbackEvent()
	 * @generated
	 */
	int SPEECH_FEEDBACK_EVENT = 62;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_FEEDBACK_EVENT__TYPE = SPEECH_OUTPUT_CONTENT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_FEEDBACK_EVENT__TIMESTAMP = SPEECH_OUTPUT_CONTENT_EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Nitems</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_FEEDBACK_EVENT__NITEMS = SPEECH_OUTPUT_CONTENT_EVENT__NITEMS;

	/**
	 * The number of structural features of the '<em>Speech Feedback Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_FEEDBACK_EVENT_FEATURE_COUNT = SPEECH_OUTPUT_CONTENT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.SpeechConceptsEventImpl <em>Speech Concepts Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.SpeechConceptsEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getSpeechConceptsEvent()
	 * @generated
	 */
	int SPEECH_CONCEPTS_EVENT = 63;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_CONCEPTS_EVENT__TYPE = SPEECH_OUTPUT_CONTENT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_CONCEPTS_EVENT__TIMESTAMP = SPEECH_OUTPUT_CONTENT_EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Nitems</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_CONCEPTS_EVENT__NITEMS = SPEECH_OUTPUT_CONTENT_EVENT__NITEMS;

	/**
	 * The number of structural features of the '<em>Speech Concepts Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_CONCEPTS_EVENT_FEATURE_COUNT = SPEECH_OUTPUT_CONTENT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.SpeechNoiseEventImpl <em>Speech Noise Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.SpeechNoiseEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getSpeechNoiseEvent()
	 * @generated
	 */
	int SPEECH_NOISE_EVENT = 64;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_NOISE_EVENT__TYPE = SPEECH_OUTPUT_CONTENT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_NOISE_EVENT__TIMESTAMP = SPEECH_OUTPUT_CONTENT_EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Nitems</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_NOISE_EVENT__NITEMS = SPEECH_OUTPUT_CONTENT_EVENT__NITEMS;

	/**
	 * The number of structural features of the '<em>Speech Noise Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_NOISE_EVENT_FEATURE_COUNT = SPEECH_OUTPUT_CONTENT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.SpeechQuestionsEventImpl <em>Speech Questions Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.SpeechQuestionsEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getSpeechQuestionsEvent()
	 * @generated
	 */
	int SPEECH_QUESTIONS_EVENT = 65;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_QUESTIONS_EVENT__TYPE = SPEECH_OUTPUT_CONTENT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_QUESTIONS_EVENT__TIMESTAMP = SPEECH_OUTPUT_CONTENT_EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Nitems</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_QUESTIONS_EVENT__NITEMS = SPEECH_OUTPUT_CONTENT_EVENT__NITEMS;

	/**
	 * The number of structural features of the '<em>Speech Questions Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_QUESTIONS_EVENT_FEATURE_COUNT = SPEECH_OUTPUT_CONTENT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.CorrectAnswerEventImpl <em>Correct Answer Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.CorrectAnswerEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getCorrectAnswerEvent()
	 * @generated
	 */
	int CORRECT_ANSWER_EVENT = 66;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRECT_ANSWER_EVENT__TYPE = SPEECH_OUTPUT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRECT_ANSWER_EVENT__TIMESTAMP = SPEECH_OUTPUT_EVENT__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>Correct Answer Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRECT_ANSWER_EVENT_FEATURE_COUNT = SPEECH_OUTPUT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.IncorrectAnswerEventImpl <em>Incorrect Answer Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.IncorrectAnswerEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getIncorrectAnswerEvent()
	 * @generated
	 */
	int INCORRECT_ANSWER_EVENT = 67;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCORRECT_ANSWER_EVENT__TYPE = SPEECH_OUTPUT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCORRECT_ANSWER_EVENT__TIMESTAMP = SPEECH_OUTPUT_EVENT__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>Incorrect Answer Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCORRECT_ANSWER_EVENT_FEATURE_COUNT = SPEECH_OUTPUT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.PartiallyCorrectAnswerEventImpl <em>Partially Correct Answer Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.PartiallyCorrectAnswerEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getPartiallyCorrectAnswerEvent()
	 * @generated
	 */
	int PARTIALLY_CORRECT_ANSWER_EVENT = 68;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIALLY_CORRECT_ANSWER_EVENT__TYPE = SPEECH_OUTPUT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIALLY_CORRECT_ANSWER_EVENT__TIMESTAMP = SPEECH_OUTPUT_EVENT__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>Partially Correct Answer Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIALLY_CORRECT_ANSWER_EVENT_FEATURE_COUNT = SPEECH_OUTPUT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.NotAnswerEventImpl <em>Not Answer Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.NotAnswerEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getNotAnswerEvent()
	 * @generated
	 */
	int NOT_ANSWER_EVENT = 69;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_ANSWER_EVENT__TYPE = SPEECH_OUTPUT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_ANSWER_EVENT__TIMESTAMP = SPEECH_OUTPUT_EVENT__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>Not Answer Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_ANSWER_EVENT_FEATURE_COUNT = SPEECH_OUTPUT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.OpenPromptEventImpl <em>Open Prompt Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.OpenPromptEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getOpenPromptEvent()
	 * @generated
	 */
	int OPEN_PROMPT_EVENT = 70;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_PROMPT_EVENT__TYPE = SPEECH_OUTPUT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_PROMPT_EVENT__TIMESTAMP = SPEECH_OUTPUT_EVENT__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>Open Prompt Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_PROMPT_EVENT_FEATURE_COUNT = SPEECH_OUTPUT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.HalfOpenPromptEventImpl <em>Half Open Prompt Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.HalfOpenPromptEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getHalfOpenPromptEvent()
	 * @generated
	 */
	int HALF_OPEN_PROMPT_EVENT = 71;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALF_OPEN_PROMPT_EVENT__TYPE = SPEECH_OUTPUT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALF_OPEN_PROMPT_EVENT__TIMESTAMP = SPEECH_OUTPUT_EVENT__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>Half Open Prompt Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALF_OPEN_PROMPT_EVENT_FEATURE_COUNT = SPEECH_OUTPUT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.ClosedPromptEventImpl <em>Closed Prompt Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.ClosedPromptEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getClosedPromptEvent()
	 * @generated
	 */
	int CLOSED_PROMPT_EVENT = 72;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSED_PROMPT_EVENT__TYPE = SPEECH_OUTPUT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSED_PROMPT_EVENT__TIMESTAMP = SPEECH_OUTPUT_EVENT__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>Closed Prompt Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSED_PROMPT_EVENT_FEATURE_COUNT = SPEECH_OUTPUT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.NoQuestionPromptEventImpl <em>No Question Prompt Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.NoQuestionPromptEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getNoQuestionPromptEvent()
	 * @generated
	 */
	int NO_QUESTION_PROMPT_EVENT = 73;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_QUESTION_PROMPT_EVENT__TYPE = SPEECH_OUTPUT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_QUESTION_PROMPT_EVENT__TIMESTAMP = SPEECH_OUTPUT_EVENT__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>No Question Prompt Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_QUESTION_PROMPT_EVENT_FEATURE_COUNT = SPEECH_OUTPUT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.OverallWordsEventImpl <em>Overall Words Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.OverallWordsEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getOverallWordsEvent()
	 * @generated
	 */
	int OVERALL_WORDS_EVENT = 74;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERALL_WORDS_EVENT__TYPE = SPEECH_INPUT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERALL_WORDS_EVENT__TIMESTAMP = SPEECH_INPUT_EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Nwords</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERALL_WORDS_EVENT__NWORDS = SPEECH_INPUT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Overall Words Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERALL_WORDS_EVENT_FEATURE_COUNT = SPEECH_INPUT_EVENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.SubstitutedWordsEventImpl <em>Substituted Words Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.SubstitutedWordsEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getSubstitutedWordsEvent()
	 * @generated
	 */
	int SUBSTITUTED_WORDS_EVENT = 75;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTED_WORDS_EVENT__TYPE = SPEECH_INPUT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTED_WORDS_EVENT__TIMESTAMP = SPEECH_INPUT_EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Nwords</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTED_WORDS_EVENT__NWORDS = SPEECH_INPUT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Substituted Words Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTED_WORDS_EVENT_FEATURE_COUNT = SPEECH_INPUT_EVENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.DeletedWordsEventImpl <em>Deleted Words Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.DeletedWordsEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getDeletedWordsEvent()
	 * @generated
	 */
	int DELETED_WORDS_EVENT = 76;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETED_WORDS_EVENT__TYPE = SPEECH_INPUT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETED_WORDS_EVENT__TIMESTAMP = SPEECH_INPUT_EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Nwords</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETED_WORDS_EVENT__NWORDS = SPEECH_INPUT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Deleted Words Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETED_WORDS_EVENT_FEATURE_COUNT = SPEECH_INPUT_EVENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.InsertedWordsEventImpl <em>Inserted Words Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.InsertedWordsEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getInsertedWordsEvent()
	 * @generated
	 */
	int INSERTED_WORDS_EVENT = 77;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTED_WORDS_EVENT__TYPE = SPEECH_INPUT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTED_WORDS_EVENT__TIMESTAMP = SPEECH_INPUT_EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Nwords</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTED_WORDS_EVENT__NWORDS = SPEECH_INPUT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Inserted Words Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTED_WORDS_EVENT_FEATURE_COUNT = SPEECH_INPUT_EVENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.OverallSentencesEventImpl <em>Overall Sentences Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.OverallSentencesEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getOverallSentencesEvent()
	 * @generated
	 */
	int OVERALL_SENTENCES_EVENT = 78;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERALL_SENTENCES_EVENT__TYPE = SPEECH_INPUT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERALL_SENTENCES_EVENT__TIMESTAMP = SPEECH_INPUT_EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Nsentences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERALL_SENTENCES_EVENT__NSENTENCES = SPEECH_INPUT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Overall Sentences Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERALL_SENTENCES_EVENT_FEATURE_COUNT = SPEECH_INPUT_EVENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.SubstitutedSentencesEventImpl <em>Substituted Sentences Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.SubstitutedSentencesEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getSubstitutedSentencesEvent()
	 * @generated
	 */
	int SUBSTITUTED_SENTENCES_EVENT = 79;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTED_SENTENCES_EVENT__TYPE = SPEECH_INPUT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTED_SENTENCES_EVENT__TIMESTAMP = SPEECH_INPUT_EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Nsentences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTED_SENTENCES_EVENT__NSENTENCES = SPEECH_INPUT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Substituted Sentences Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTED_SENTENCES_EVENT_FEATURE_COUNT = SPEECH_INPUT_EVENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.DeletedSentencesEventImpl <em>Deleted Sentences Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.DeletedSentencesEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getDeletedSentencesEvent()
	 * @generated
	 */
	int DELETED_SENTENCES_EVENT = 80;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETED_SENTENCES_EVENT__TYPE = SPEECH_INPUT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETED_SENTENCES_EVENT__TIMESTAMP = SPEECH_INPUT_EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Nsentences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETED_SENTENCES_EVENT__NSENTENCES = SPEECH_INPUT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Deleted Sentences Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETED_SENTENCES_EVENT_FEATURE_COUNT = SPEECH_INPUT_EVENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.InsertedSentencesEventImpl <em>Inserted Sentences Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.InsertedSentencesEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getInsertedSentencesEvent()
	 * @generated
	 */
	int INSERTED_SENTENCES_EVENT = 81;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTED_SENTENCES_EVENT__TYPE = SPEECH_INPUT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTED_SENTENCES_EVENT__TIMESTAMP = SPEECH_INPUT_EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Nsentences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTED_SENTENCES_EVENT__NSENTENCES = SPEECH_INPUT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Inserted Sentences Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTED_SENTENCES_EVENT_FEATURE_COUNT = SPEECH_INPUT_EVENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.OverallConceptsEventImpl <em>Overall Concepts Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.OverallConceptsEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getOverallConceptsEvent()
	 * @generated
	 */
	int OVERALL_CONCEPTS_EVENT = 82;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERALL_CONCEPTS_EVENT__TYPE = SPEECH_INPUT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERALL_CONCEPTS_EVENT__TIMESTAMP = SPEECH_INPUT_EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Nconcepts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERALL_CONCEPTS_EVENT__NCONCEPTS = SPEECH_INPUT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Overall Concepts Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERALL_CONCEPTS_EVENT_FEATURE_COUNT = SPEECH_INPUT_EVENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.SubstitutedConceptsEventImpl <em>Substituted Concepts Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.SubstitutedConceptsEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getSubstitutedConceptsEvent()
	 * @generated
	 */
	int SUBSTITUTED_CONCEPTS_EVENT = 83;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTED_CONCEPTS_EVENT__TYPE = SPEECH_INPUT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTED_CONCEPTS_EVENT__TIMESTAMP = SPEECH_INPUT_EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Nconcepts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTED_CONCEPTS_EVENT__NCONCEPTS = SPEECH_INPUT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Substituted Concepts Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTED_CONCEPTS_EVENT_FEATURE_COUNT = SPEECH_INPUT_EVENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.DeletedConceptsEventImpl <em>Deleted Concepts Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.DeletedConceptsEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getDeletedConceptsEvent()
	 * @generated
	 */
	int DELETED_CONCEPTS_EVENT = 84;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETED_CONCEPTS_EVENT__TYPE = SPEECH_INPUT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETED_CONCEPTS_EVENT__TIMESTAMP = SPEECH_INPUT_EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Nconcepts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETED_CONCEPTS_EVENT__NCONCEPTS = SPEECH_INPUT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Deleted Concepts Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETED_CONCEPTS_EVENT_FEATURE_COUNT = SPEECH_INPUT_EVENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.InsertedConceptsEventImpl <em>Inserted Concepts Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.InsertedConceptsEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getInsertedConceptsEvent()
	 * @generated
	 */
	int INSERTED_CONCEPTS_EVENT = 85;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTED_CONCEPTS_EVENT__TYPE = SPEECH_INPUT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTED_CONCEPTS_EVENT__TIMESTAMP = SPEECH_INPUT_EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Nconcepts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTED_CONCEPTS_EVENT__NCONCEPTS = SPEECH_INPUT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Inserted Concepts Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTED_CONCEPTS_EVENT_FEATURE_COUNT = SPEECH_INPUT_EVENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.CorrectlyParsedUtteranceEventImpl <em>Correctly Parsed Utterance Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.CorrectlyParsedUtteranceEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getCorrectlyParsedUtteranceEvent()
	 * @generated
	 */
	int CORRECTLY_PARSED_UTTERANCE_EVENT = 86;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRECTLY_PARSED_UTTERANCE_EVENT__TYPE = SPEECH_INPUT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRECTLY_PARSED_UTTERANCE_EVENT__TIMESTAMP = SPEECH_INPUT_EVENT__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>Correctly Parsed Utterance Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRECTLY_PARSED_UTTERANCE_EVENT_FEATURE_COUNT = SPEECH_INPUT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.PartiallyParsedUtteranceEventImpl <em>Partially Parsed Utterance Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.PartiallyParsedUtteranceEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getPartiallyParsedUtteranceEvent()
	 * @generated
	 */
	int PARTIALLY_PARSED_UTTERANCE_EVENT = 87;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIALLY_PARSED_UTTERANCE_EVENT__TYPE = SPEECH_INPUT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIALLY_PARSED_UTTERANCE_EVENT__TIMESTAMP = SPEECH_INPUT_EVENT__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>Partially Parsed Utterance Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIALLY_PARSED_UTTERANCE_EVENT_FEATURE_COUNT = SPEECH_INPUT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.IncorrectlyParsedUtteranceEventImpl <em>Incorrectly Parsed Utterance Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.IncorrectlyParsedUtteranceEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getIncorrectlyParsedUtteranceEvent()
	 * @generated
	 */
	int INCORRECTLY_PARSED_UTTERANCE_EVENT = 88;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCORRECTLY_PARSED_UTTERANCE_EVENT__TYPE = SPEECH_INPUT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCORRECTLY_PARSED_UTTERANCE_EVENT__TIMESTAMP = SPEECH_INPUT_EVENT__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>Incorrectly Parsed Utterance Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCORRECTLY_PARSED_UTTERANCE_EVENT_FEATURE_COUNT = SPEECH_INPUT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.NewElementsEventImpl <em>New Elements Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.NewElementsEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getNewElementsEvent()
	 * @generated
	 */
	int NEW_ELEMENTS_EVENT = 89;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_ELEMENTS_EVENT__TYPE = DIALOGUE_CONTENT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_ELEMENTS_EVENT__TIMESTAMP = DIALOGUE_CONTENT_EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Nitems</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_ELEMENTS_EVENT__NITEMS = DIALOGUE_CONTENT_EVENT__NITEMS;

	/**
	 * The number of structural features of the '<em>New Elements Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_ELEMENTS_EVENT_FEATURE_COUNT = DIALOGUE_CONTENT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.NewFeedbackElementsEventImpl <em>New Feedback Elements Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.NewFeedbackElementsEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getNewFeedbackElementsEvent()
	 * @generated
	 */
	int NEW_FEEDBACK_ELEMENTS_EVENT = 90;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_FEEDBACK_ELEMENTS_EVENT__TYPE = DIALOGUE_CONTENT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_FEEDBACK_ELEMENTS_EVENT__TIMESTAMP = DIALOGUE_CONTENT_EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Nitems</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_FEEDBACK_ELEMENTS_EVENT__NITEMS = DIALOGUE_CONTENT_EVENT__NITEMS;

	/**
	 * The number of structural features of the '<em>New Feedback Elements Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_FEEDBACK_ELEMENTS_EVENT_FEATURE_COUNT = DIALOGUE_CONTENT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.NewConceptsEventImpl <em>New Concepts Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.NewConceptsEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getNewConceptsEvent()
	 * @generated
	 */
	int NEW_CONCEPTS_EVENT = 91;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_CONCEPTS_EVENT__TYPE = DIALOGUE_CONTENT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_CONCEPTS_EVENT__TIMESTAMP = DIALOGUE_CONTENT_EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Nitems</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_CONCEPTS_EVENT__NITEMS = DIALOGUE_CONTENT_EVENT__NITEMS;

	/**
	 * The number of structural features of the '<em>New Concepts Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_CONCEPTS_EVENT_FEATURE_COUNT = DIALOGUE_CONTENT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.NewNoiseEventImpl <em>New Noise Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.NewNoiseEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getNewNoiseEvent()
	 * @generated
	 */
	int NEW_NOISE_EVENT = 92;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_NOISE_EVENT__TYPE = DIALOGUE_CONTENT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_NOISE_EVENT__TIMESTAMP = DIALOGUE_CONTENT_EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Nitems</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_NOISE_EVENT__NITEMS = DIALOGUE_CONTENT_EVENT__NITEMS;

	/**
	 * The number of structural features of the '<em>New Noise Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_NOISE_EVENT_FEATURE_COUNT = DIALOGUE_CONTENT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.NewQuestionsEventImpl <em>New Questions Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.NewQuestionsEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getNewQuestionsEvent()
	 * @generated
	 */
	int NEW_QUESTIONS_EVENT = 93;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_QUESTIONS_EVENT__TYPE = DIALOGUE_CONTENT_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_QUESTIONS_EVENT__TIMESTAMP = DIALOGUE_CONTENT_EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Nitems</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_QUESTIONS_EVENT__NITEMS = DIALOGUE_CONTENT_EVENT__NITEMS;

	/**
	 * The number of structural features of the '<em>New Questions Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_QUESTIONS_EVENT_FEATURE_COUNT = DIALOGUE_CONTENT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.HelpTurnEventImpl <em>Help Turn Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.HelpTurnEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getHelpTurnEvent()
	 * @generated
	 */
	int HELP_TURN_EVENT = 94;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELP_TURN_EVENT__TYPE = METACOMM_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELP_TURN_EVENT__TIMESTAMP = METACOMM_EVENT__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>Help Turn Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELP_TURN_EVENT_FEATURE_COUNT = METACOMM_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.CorrectionTurnEventImpl <em>Correction Turn Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.CorrectionTurnEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getCorrectionTurnEvent()
	 * @generated
	 */
	int CORRECTION_TURN_EVENT = 95;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRECTION_TURN_EVENT__TYPE = METACOMM_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRECTION_TURN_EVENT__TIMESTAMP = METACOMM_EVENT__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>Correction Turn Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRECTION_TURN_EVENT_FEATURE_COUNT = METACOMM_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.CancelTurnEventImpl <em>Cancel Turn Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.CancelTurnEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getCancelTurnEvent()
	 * @generated
	 */
	int CANCEL_TURN_EVENT = 96;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL_TURN_EVENT__TYPE = METACOMM_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL_TURN_EVENT__TIMESTAMP = METACOMM_EVENT__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>Cancel Turn Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL_TURN_EVENT_FEATURE_COUNT = METACOMM_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.RestartTurnEventImpl <em>Restart Turn Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.RestartTurnEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getRestartTurnEvent()
	 * @generated
	 */
	int RESTART_TURN_EVENT = 97;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTART_TURN_EVENT__TYPE = METACOMM_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTART_TURN_EVENT__TIMESTAMP = METACOMM_EVENT__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>Restart Turn Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTART_TURN_EVENT_FEATURE_COUNT = METACOMM_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.BargeinEventImpl <em>Bargein Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.BargeinEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getBargeinEvent()
	 * @generated
	 */
	int BARGEIN_EVENT = 98;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARGEIN_EVENT__TYPE = METACOMM_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARGEIN_EVENT__TIMESTAMP = METACOMM_EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Successful</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARGEIN_EVENT__SUCCESSFUL = METACOMM_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bargein Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARGEIN_EVENT_FEATURE_COUNT = METACOMM_EVENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.DIVRejectionEventImpl <em>DIV Rejection Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.DIVRejectionEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getDIVRejectionEvent()
	 * @generated
	 */
	int DIV_REJECTION_EVENT = 99;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_REJECTION_EVENT__TYPE = METACOMM_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_REJECTION_EVENT__TIMESTAMP = METACOMM_EVENT__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>DIV Rejection Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_REJECTION_EVENT_FEATURE_COUNT = METACOMM_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.ASRRejectionEventImpl <em>ASR Rejection Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.ASRRejectionEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getASRRejectionEvent()
	 * @generated
	 */
	int ASR_REJECTION_EVENT = 100;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASR_REJECTION_EVENT__TYPE = METACOMM_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASR_REJECTION_EVENT__TIMESTAMP = METACOMM_EVENT__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>ASR Rejection Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASR_REJECTION_EVENT_FEATURE_COUNT = METACOMM_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.GRRejectionEventImpl <em>GR Rejection Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.GRRejectionEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getGRRejectionEvent()
	 * @generated
	 */
	int GR_REJECTION_EVENT = 101;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GR_REJECTION_EVENT__TYPE = METACOMM_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GR_REJECTION_EVENT__TIMESTAMP = METACOMM_EVENT__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>GR Rejection Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GR_REJECTION_EVENT_FEATURE_COUNT = METACOMM_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.TimeoutEventImpl <em>Timeout Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.TimeoutEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getTimeoutEvent()
	 * @generated
	 */
	int TIMEOUT_EVENT = 102;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_EVENT__TYPE = METACOMM_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_EVENT__TIMESTAMP = METACOMM_EVENT__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>Timeout Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_EVENT_FEATURE_COUNT = METACOMM_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.AppStartEventImpl <em>App Start Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.AppStartEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getAppStartEvent()
	 * @generated
	 */
	int APP_START_EVENT = 103;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_START_EVENT__TYPE = TURN_CONTROL_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_START_EVENT__TIMESTAMP = TURN_CONTROL_EVENT__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>App Start Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_START_EVENT_FEATURE_COUNT = TURN_CONTROL_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.AppEndEventImpl <em>App End Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.AppEndEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getAppEndEvent()
	 * @generated
	 */
	int APP_END_EVENT = 104;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_END_EVENT__TYPE = TURN_CONTROL_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_END_EVENT__TIMESTAMP = TURN_CONTROL_EVENT__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>App End Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_END_EVENT_FEATURE_COUNT = TURN_CONTROL_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.StartDialogueEventImpl <em>Start Dialogue Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.StartDialogueEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getStartDialogueEvent()
	 * @generated
	 */
	int START_DIALOGUE_EVENT = 105;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_DIALOGUE_EVENT__TYPE = TURN_CONTROL_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_DIALOGUE_EVENT__TIMESTAMP = TURN_CONTROL_EVENT__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>Start Dialogue Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_DIALOGUE_EVENT_FEATURE_COUNT = TURN_CONTROL_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.EndDialogueEventImpl <em>End Dialogue Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.EndDialogueEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getEndDialogueEvent()
	 * @generated
	 */
	int END_DIALOGUE_EVENT = 106;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DIALOGUE_EVENT__TYPE = TURN_CONTROL_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DIALOGUE_EVENT__TIMESTAMP = TURN_CONTROL_EVENT__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>End Dialogue Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_DIALOGUE_EVENT_FEATURE_COUNT = TURN_CONTROL_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.StartSystemTurnEventImpl <em>Start System Turn Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.StartSystemTurnEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getStartSystemTurnEvent()
	 * @generated
	 */
	int START_SYSTEM_TURN_EVENT = 107;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_SYSTEM_TURN_EVENT__TYPE = TURN_CONTROL_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_SYSTEM_TURN_EVENT__TIMESTAMP = TURN_CONTROL_EVENT__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>Start System Turn Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_SYSTEM_TURN_EVENT_FEATURE_COUNT = TURN_CONTROL_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.EndSystemTurnEventImpl <em>End System Turn Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.EndSystemTurnEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getEndSystemTurnEvent()
	 * @generated
	 */
	int END_SYSTEM_TURN_EVENT = 108;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_SYSTEM_TURN_EVENT__TYPE = TURN_CONTROL_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_SYSTEM_TURN_EVENT__TIMESTAMP = TURN_CONTROL_EVENT__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>End System Turn Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_SYSTEM_TURN_EVENT_FEATURE_COUNT = TURN_CONTROL_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.StartUserTurnEventImpl <em>Start User Turn Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.StartUserTurnEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getStartUserTurnEvent()
	 * @generated
	 */
	int START_USER_TURN_EVENT = 109;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_USER_TURN_EVENT__TYPE = TURN_CONTROL_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_USER_TURN_EVENT__TIMESTAMP = TURN_CONTROL_EVENT__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>Start User Turn Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_USER_TURN_EVENT_FEATURE_COUNT = TURN_CONTROL_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.EndUserTurnEventImpl <em>End User Turn Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.EndUserTurnEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getEndUserTurnEvent()
	 * @generated
	 */
	int END_USER_TURN_EVENT = 110;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_USER_TURN_EVENT__TYPE = TURN_CONTROL_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_USER_TURN_EVENT__TIMESTAMP = TURN_CONTROL_EVENT__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>End User Turn Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_USER_TURN_EVENT_FEATURE_COUNT = TURN_CONTROL_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.SystemFeedbackStartEventImpl <em>System Feedback Start Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.SystemFeedbackStartEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getSystemFeedbackStartEvent()
	 * @generated
	 */
	int SYSTEM_FEEDBACK_START_EVENT = 111;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEEDBACK_START_EVENT__TYPE = TURN_TIMING_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEEDBACK_START_EVENT__TIMESTAMP = TURN_TIMING_EVENT__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>System Feedback Start Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEEDBACK_START_EVENT_FEATURE_COUNT = TURN_TIMING_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.SystemActionStartEventImpl <em>System Action Start Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.SystemActionStartEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getSystemActionStartEvent()
	 * @generated
	 */
	int SYSTEM_ACTION_START_EVENT = 112;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ACTION_START_EVENT__TYPE = TURN_TIMING_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ACTION_START_EVENT__TIMESTAMP = TURN_TIMING_EVENT__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>System Action Start Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ACTION_START_EVENT_FEATURE_COUNT = TURN_TIMING_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.SystemActionEndEventImpl <em>System Action End Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.SystemActionEndEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getSystemActionEndEvent()
	 * @generated
	 */
	int SYSTEM_ACTION_END_EVENT = 113;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ACTION_END_EVENT__TYPE = TURN_TIMING_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ACTION_END_EVENT__TIMESTAMP = TURN_TIMING_EVENT__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>System Action End Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ACTION_END_EVENT_FEATURE_COUNT = TURN_TIMING_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.UserFeedbackStartEventImpl <em>User Feedback Start Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.UserFeedbackStartEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getUserFeedbackStartEvent()
	 * @generated
	 */
	int USER_FEEDBACK_START_EVENT = 114;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEEDBACK_START_EVENT__TYPE = TURN_TIMING_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEEDBACK_START_EVENT__TIMESTAMP = TURN_TIMING_EVENT__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>User Feedback Start Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEEDBACK_START_EVENT_FEATURE_COUNT = TURN_TIMING_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.UserActionStartEventImpl <em>User Action Start Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.UserActionStartEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getUserActionStartEvent()
	 * @generated
	 */
	int USER_ACTION_START_EVENT = 115;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACTION_START_EVENT__TYPE = TURN_TIMING_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACTION_START_EVENT__TIMESTAMP = TURN_TIMING_EVENT__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>User Action Start Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACTION_START_EVENT_FEATURE_COUNT = TURN_TIMING_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.impl.UserActionEndEventImpl <em>User Action End Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.impl.UserActionEndEventImpl
	 * @see org.mmi.events.impl.EventsPackageImpl#getUserActionEndEvent()
	 * @generated
	 */
	int USER_ACTION_END_EVENT = 116;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACTION_END_EVENT__TYPE = TURN_TIMING_EVENT__TYPE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACTION_END_EVENT__TIMESTAMP = TURN_TIMING_EVENT__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>User Action End Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACTION_END_EVENT_FEATURE_COUNT = TURN_TIMING_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mmi.events.event_t <em>event t</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.events.event_t
	 * @see org.mmi.events.impl.EventsPackageImpl#getevent_t()
	 * @generated
	 */
	int EVENT_T = 117;


	/**
	 * Returns the meta object for class '{@link org.mmi.events.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see org.mmi.events.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.Event#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.mmi.events.Event#getType()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.Event#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see org.mmi.events.Event#getTimestamp()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Timestamp();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.InputEvent <em>Input Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Event</em>'.
	 * @see org.mmi.events.InputEvent
	 * @generated
	 */
	EClass getInputEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.OutputEvent <em>Output Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Event</em>'.
	 * @see org.mmi.events.OutputEvent
	 * @generated
	 */
	EClass getOutputEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.DialogueContentEvent <em>Dialogue Content Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dialogue Content Event</em>'.
	 * @see org.mmi.events.DialogueContentEvent
	 * @generated
	 */
	EClass getDialogueContentEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.DialogueContentEvent#getNitems <em>Nitems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nitems</em>'.
	 * @see org.mmi.events.DialogueContentEvent#getNitems()
	 * @see #getDialogueContentEvent()
	 * @generated
	 */
	EAttribute getDialogueContentEvent_Nitems();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.MetacommEvent <em>Metacomm Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metacomm Event</em>'.
	 * @see org.mmi.events.MetacommEvent
	 * @generated
	 */
	EClass getMetacommEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.TurnControlEvent <em>Turn Control Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turn Control Event</em>'.
	 * @see org.mmi.events.TurnControlEvent
	 * @generated
	 */
	EClass getTurnControlEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.TurnTimingEvent <em>Turn Timing Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turn Timing Event</em>'.
	 * @see org.mmi.events.TurnTimingEvent
	 * @generated
	 */
	EClass getTurnTimingEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.ContextEvent <em>Context Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Event</em>'.
	 * @see org.mmi.events.ContextEvent
	 * @generated
	 */
	EClass getContextEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.PhysicalEnvironmentContextEvent <em>Physical Environment Context Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Environment Context Event</em>'.
	 * @see org.mmi.events.PhysicalEnvironmentContextEvent
	 * @generated
	 */
	EClass getPhysicalEnvironmentContextEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.WeatherUpdateEvent <em>Weather Update Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weather Update Event</em>'.
	 * @see org.mmi.events.WeatherUpdateEvent
	 * @generated
	 */
	EClass getWeatherUpdateEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.WeatherUpdateEvent#getTemperature <em>Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temperature</em>'.
	 * @see org.mmi.events.WeatherUpdateEvent#getTemperature()
	 * @see #getWeatherUpdateEvent()
	 * @generated
	 */
	EAttribute getWeatherUpdateEvent_Temperature();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.WeatherUpdateEvent#getWeather <em>Weather</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weather</em>'.
	 * @see org.mmi.events.WeatherUpdateEvent#getWeather()
	 * @see #getWeatherUpdateEvent()
	 * @generated
	 */
	EAttribute getWeatherUpdateEvent_Weather();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.AmbientUpdateEvent <em>Ambient Update Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ambient Update Event</em>'.
	 * @see org.mmi.events.AmbientUpdateEvent
	 * @generated
	 */
	EClass getAmbientUpdateEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.AmbientUpdateEvent#getNoise <em>Noise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Noise</em>'.
	 * @see org.mmi.events.AmbientUpdateEvent#getNoise()
	 * @see #getAmbientUpdateEvent()
	 * @generated
	 */
	EAttribute getAmbientUpdateEvent_Noise();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.AmbientUpdateEvent#getLight <em>Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Light</em>'.
	 * @see org.mmi.events.AmbientUpdateEvent#getLight()
	 * @see #getAmbientUpdateEvent()
	 * @generated
	 */
	EAttribute getAmbientUpdateEvent_Light();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.UserContextEvent <em>User Context Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Context Event</em>'.
	 * @see org.mmi.events.UserContextEvent
	 * @generated
	 */
	EClass getUserContextEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.UserDataUpdateEvent <em>User Data Update Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Data Update Event</em>'.
	 * @see org.mmi.events.UserDataUpdateEvent
	 * @generated
	 */
	EClass getUserDataUpdateEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.UserDataUpdateEvent#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age</em>'.
	 * @see org.mmi.events.UserDataUpdateEvent#getAge()
	 * @see #getUserDataUpdateEvent()
	 * @generated
	 */
	EAttribute getUserDataUpdateEvent_Age();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.UserDataUpdateEvent#getGender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gender</em>'.
	 * @see org.mmi.events.UserDataUpdateEvent#getGender()
	 * @see #getUserDataUpdateEvent()
	 * @generated
	 */
	EAttribute getUserDataUpdateEvent_Gender();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.UserDataUpdateEvent#getEducationLevel <em>Education Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Education Level</em>'.
	 * @see org.mmi.events.UserDataUpdateEvent#getEducationLevel()
	 * @see #getUserDataUpdateEvent()
	 * @generated
	 */
	EAttribute getUserDataUpdateEvent_EducationLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.UserDataUpdateEvent#getPreviousExperience <em>Previous Experience</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Previous Experience</em>'.
	 * @see org.mmi.events.UserDataUpdateEvent#getPreviousExperience()
	 * @see #getUserDataUpdateEvent()
	 * @generated
	 */
	EAttribute getUserDataUpdateEvent_PreviousExperience();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.UserRatingsUpdateEvent <em>User Ratings Update Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Ratings Update Event</em>'.
	 * @see org.mmi.events.UserRatingsUpdateEvent
	 * @generated
	 */
	EClass getUserRatingsUpdateEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.UserRatingsUpdateEvent#getPractical <em>Practical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Practical</em>'.
	 * @see org.mmi.events.UserRatingsUpdateEvent#getPractical()
	 * @see #getUserRatingsUpdateEvent()
	 * @generated
	 */
	EAttribute getUserRatingsUpdateEvent_Practical();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.UserRatingsUpdateEvent#getPredictable <em>Predictable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Predictable</em>'.
	 * @see org.mmi.events.UserRatingsUpdateEvent#getPredictable()
	 * @see #getUserRatingsUpdateEvent()
	 * @generated
	 */
	EAttribute getUserRatingsUpdateEvent_Predictable();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.UserRatingsUpdateEvent#getClearlyStructured <em>Clearly Structured</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clearly Structured</em>'.
	 * @see org.mmi.events.UserRatingsUpdateEvent#getClearlyStructured()
	 * @see #getUserRatingsUpdateEvent()
	 * @generated
	 */
	EAttribute getUserRatingsUpdateEvent_ClearlyStructured();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.UserRatingsUpdateEvent#getSimple <em>Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Simple</em>'.
	 * @see org.mmi.events.UserRatingsUpdateEvent#getSimple()
	 * @see #getUserRatingsUpdateEvent()
	 * @generated
	 */
	EAttribute getUserRatingsUpdateEvent_Simple();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.UserRatingsUpdateEvent#getStylish <em>Stylish</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stylish</em>'.
	 * @see org.mmi.events.UserRatingsUpdateEvent#getStylish()
	 * @see #getUserRatingsUpdateEvent()
	 * @generated
	 */
	EAttribute getUserRatingsUpdateEvent_Stylish();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.UserRatingsUpdateEvent#getPremium <em>Premium</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Premium</em>'.
	 * @see org.mmi.events.UserRatingsUpdateEvent#getPremium()
	 * @see #getUserRatingsUpdateEvent()
	 * @generated
	 */
	EAttribute getUserRatingsUpdateEvent_Premium();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.UserRatingsUpdateEvent#getCreative <em>Creative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creative</em>'.
	 * @see org.mmi.events.UserRatingsUpdateEvent#getCreative()
	 * @see #getUserRatingsUpdateEvent()
	 * @generated
	 */
	EAttribute getUserRatingsUpdateEvent_Creative();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.UserRatingsUpdateEvent#getCaptivating <em>Captivating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Captivating</em>'.
	 * @see org.mmi.events.UserRatingsUpdateEvent#getCaptivating()
	 * @see #getUserRatingsUpdateEvent()
	 * @generated
	 */
	EAttribute getUserRatingsUpdateEvent_Captivating();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.UserRatingsUpdateEvent#getBeautiful <em>Beautiful</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beautiful</em>'.
	 * @see org.mmi.events.UserRatingsUpdateEvent#getBeautiful()
	 * @see #getUserRatingsUpdateEvent()
	 * @generated
	 */
	EAttribute getUserRatingsUpdateEvent_Beautiful();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.UserRatingsUpdateEvent#getGood <em>Good</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Good</em>'.
	 * @see org.mmi.events.UserRatingsUpdateEvent#getGood()
	 * @see #getUserRatingsUpdateEvent()
	 * @generated
	 */
	EAttribute getUserRatingsUpdateEvent_Good();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.UserAttitudeUpdateEvent <em>User Attitude Update Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Attitude Update Event</em>'.
	 * @see org.mmi.events.UserAttitudeUpdateEvent
	 * @generated
	 */
	EClass getUserAttitudeUpdateEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.UserAttitudeUpdateEvent#getUsefulness <em>Usefulness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usefulness</em>'.
	 * @see org.mmi.events.UserAttitudeUpdateEvent#getUsefulness()
	 * @see #getUserAttitudeUpdateEvent()
	 * @generated
	 */
	EAttribute getUserAttitudeUpdateEvent_Usefulness();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.UserAttitudeUpdateEvent#getPleasantness <em>Pleasantness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pleasantness</em>'.
	 * @see org.mmi.events.UserAttitudeUpdateEvent#getPleasantness()
	 * @see #getUserAttitudeUpdateEvent()
	 * @generated
	 */
	EAttribute getUserAttitudeUpdateEvent_Pleasantness();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.UserAttitudeUpdateEvent#getIntegration <em>Integration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Integration</em>'.
	 * @see org.mmi.events.UserAttitudeUpdateEvent#getIntegration()
	 * @see #getUserAttitudeUpdateEvent()
	 * @generated
	 */
	EAttribute getUserAttitudeUpdateEvent_Integration();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.UserAttitudeUpdateEvent#getSelfEfficacy <em>Self Efficacy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Self Efficacy</em>'.
	 * @see org.mmi.events.UserAttitudeUpdateEvent#getSelfEfficacy()
	 * @see #getUserAttitudeUpdateEvent()
	 * @generated
	 */
	EAttribute getUserAttitudeUpdateEvent_SelfEfficacy();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.UserAttitudeUpdateEvent#getComfort <em>Comfort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comfort</em>'.
	 * @see org.mmi.events.UserAttitudeUpdateEvent#getComfort()
	 * @see #getUserAttitudeUpdateEvent()
	 * @generated
	 */
	EAttribute getUserAttitudeUpdateEvent_Comfort();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.UserMoodUpdateEvent <em>User Mood Update Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Mood Update Event</em>'.
	 * @see org.mmi.events.UserMoodUpdateEvent
	 * @generated
	 */
	EClass getUserMoodUpdateEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.UserMoodUpdateEvent#getMood <em>Mood</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mood</em>'.
	 * @see org.mmi.events.UserMoodUpdateEvent#getMood()
	 * @see #getUserMoodUpdateEvent()
	 * @generated
	 */
	EAttribute getUserMoodUpdateEvent_Mood();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.SocialContextEvent <em>Social Context Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Social Context Event</em>'.
	 * @see org.mmi.events.SocialContextEvent
	 * @generated
	 */
	EClass getSocialContextEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.SocialUpdateEvent <em>Social Update Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Social Update Event</em>'.
	 * @see org.mmi.events.SocialUpdateEvent
	 * @generated
	 */
	EClass getSocialUpdateEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.SocialUpdateEvent#getSocialCompany <em>Social Company</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Social Company</em>'.
	 * @see org.mmi.events.SocialUpdateEvent#getSocialCompany()
	 * @see #getSocialUpdateEvent()
	 * @generated
	 */
	EAttribute getSocialUpdateEvent_SocialCompany();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.SocialUpdateEvent#getSocialArena <em>Social Arena</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Social Arena</em>'.
	 * @see org.mmi.events.SocialUpdateEvent#getSocialArena()
	 * @see #getSocialUpdateEvent()
	 * @generated
	 */
	EAttribute getSocialUpdateEvent_SocialArena();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.LocationTimeContextEvent <em>Location Time Context Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location Time Context Event</em>'.
	 * @see org.mmi.events.LocationTimeContextEvent
	 * @generated
	 */
	EClass getLocationTimeContextEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.LocationUpdateEvent <em>Location Update Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location Update Event</em>'.
	 * @see org.mmi.events.LocationUpdateEvent
	 * @generated
	 */
	EClass getLocationUpdateEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.LocationUpdateEvent#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.mmi.events.LocationUpdateEvent#getLocation()
	 * @see #getLocationUpdateEvent()
	 * @generated
	 */
	EAttribute getLocationUpdateEvent_Location();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.LocationUpdateEvent#getGeo_latitude <em>Geo latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geo latitude</em>'.
	 * @see org.mmi.events.LocationUpdateEvent#getGeo_latitude()
	 * @see #getLocationUpdateEvent()
	 * @generated
	 */
	EAttribute getLocationUpdateEvent_Geo_latitude();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.LocationUpdateEvent#getGeo_longitude <em>Geo longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geo longitude</em>'.
	 * @see org.mmi.events.LocationUpdateEvent#getGeo_longitude()
	 * @see #getLocationUpdateEvent()
	 * @generated
	 */
	EAttribute getLocationUpdateEvent_Geo_longitude();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.MobilityUpdateEvent <em>Mobility Update Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mobility Update Event</em>'.
	 * @see org.mmi.events.MobilityUpdateEvent
	 * @generated
	 */
	EClass getMobilityUpdateEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.MobilityUpdateEvent#getMobilityLevel <em>Mobility Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mobility Level</em>'.
	 * @see org.mmi.events.MobilityUpdateEvent#getMobilityLevel()
	 * @see #getMobilityUpdateEvent()
	 * @generated
	 */
	EAttribute getMobilityUpdateEvent_MobilityLevel();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.TimeUpdateEvent <em>Time Update Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Update Event</em>'.
	 * @see org.mmi.events.TimeUpdateEvent
	 * @generated
	 */
	EClass getTimeUpdateEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.TimeUpdateEvent#getT_hours <em>Thours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thours</em>'.
	 * @see org.mmi.events.TimeUpdateEvent#getT_hours()
	 * @see #getTimeUpdateEvent()
	 * @generated
	 */
	EAttribute getTimeUpdateEvent_T_hours();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.TimeUpdateEvent#getT_mins <em>Tmins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tmins</em>'.
	 * @see org.mmi.events.TimeUpdateEvent#getT_mins()
	 * @see #getTimeUpdateEvent()
	 * @generated
	 */
	EAttribute getTimeUpdateEvent_T_mins();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.TimeUpdateEvent#getT_secs <em>Tsecs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tsecs</em>'.
	 * @see org.mmi.events.TimeUpdateEvent#getT_secs()
	 * @see #getTimeUpdateEvent()
	 * @generated
	 */
	EAttribute getTimeUpdateEvent_T_secs();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.TimeUpdateEvent#getD_year <em>Dyear</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dyear</em>'.
	 * @see org.mmi.events.TimeUpdateEvent#getD_year()
	 * @see #getTimeUpdateEvent()
	 * @generated
	 */
	EAttribute getTimeUpdateEvent_D_year();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.TimeUpdateEvent#getD_month <em>Dmonth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dmonth</em>'.
	 * @see org.mmi.events.TimeUpdateEvent#getD_month()
	 * @see #getTimeUpdateEvent()
	 * @generated
	 */
	EAttribute getTimeUpdateEvent_D_month();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.TimeUpdateEvent#getD_day <em>Dday</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dday</em>'.
	 * @see org.mmi.events.TimeUpdateEvent#getD_day()
	 * @see #getTimeUpdateEvent()
	 * @generated
	 */
	EAttribute getTimeUpdateEvent_D_day();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.DeviceContextEvent <em>Device Context Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Context Event</em>'.
	 * @see org.mmi.events.DeviceContextEvent
	 * @generated
	 */
	EClass getDeviceContextEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.DeviceFeaturesUpdateEvent <em>Device Features Update Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Features Update Event</em>'.
	 * @see org.mmi.events.DeviceFeaturesUpdateEvent
	 * @generated
	 */
	EClass getDeviceFeaturesUpdateEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.DeviceFeaturesUpdateEvent#getDeviceType <em>Device Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device Type</em>'.
	 * @see org.mmi.events.DeviceFeaturesUpdateEvent#getDeviceType()
	 * @see #getDeviceFeaturesUpdateEvent()
	 * @generated
	 */
	EAttribute getDeviceFeaturesUpdateEvent_DeviceType();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.DeviceFeaturesUpdateEvent#getScreenSize <em>Screen Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Screen Size</em>'.
	 * @see org.mmi.events.DeviceFeaturesUpdateEvent#getScreenSize()
	 * @see #getDeviceFeaturesUpdateEvent()
	 * @generated
	 */
	EAttribute getDeviceFeaturesUpdateEvent_ScreenSize();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.DeviceFeaturesUpdateEvent#getScreenResolution <em>Screen Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Screen Resolution</em>'.
	 * @see org.mmi.events.DeviceFeaturesUpdateEvent#getScreenResolution()
	 * @see #getDeviceFeaturesUpdateEvent()
	 * @generated
	 */
	EAttribute getDeviceFeaturesUpdateEvent_ScreenResolution();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.DeviceRunningFeaturesUpdateEvent <em>Device Running Features Update Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Running Features Update Event</em>'.
	 * @see org.mmi.events.DeviceRunningFeaturesUpdateEvent
	 * @generated
	 */
	EClass getDeviceRunningFeaturesUpdateEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.DeviceRunningFeaturesUpdateEvent#getScreenOrientation <em>Screen Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Screen Orientation</em>'.
	 * @see org.mmi.events.DeviceRunningFeaturesUpdateEvent#getScreenOrientation()
	 * @see #getDeviceRunningFeaturesUpdateEvent()
	 * @generated
	 */
	EAttribute getDeviceRunningFeaturesUpdateEvent_ScreenOrientation();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.DeviceRunningFeaturesUpdateEvent#getBrightness <em>Brightness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Brightness</em>'.
	 * @see org.mmi.events.DeviceRunningFeaturesUpdateEvent#getBrightness()
	 * @see #getDeviceRunningFeaturesUpdateEvent()
	 * @generated
	 */
	EAttribute getDeviceRunningFeaturesUpdateEvent_Brightness();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.DeviceRunningFeaturesUpdateEvent#getVolume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume</em>'.
	 * @see org.mmi.events.DeviceRunningFeaturesUpdateEvent#getVolume()
	 * @see #getDeviceRunningFeaturesUpdateEvent()
	 * @generated
	 */
	EAttribute getDeviceRunningFeaturesUpdateEvent_Volume();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.DeviceWorkloadUpdateEvent <em>Device Workload Update Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Workload Update Event</em>'.
	 * @see org.mmi.events.DeviceWorkloadUpdateEvent
	 * @generated
	 */
	EClass getDeviceWorkloadUpdateEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.DeviceWorkloadUpdateEvent#getMemoryUsage <em>Memory Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory Usage</em>'.
	 * @see org.mmi.events.DeviceWorkloadUpdateEvent#getMemoryUsage()
	 * @see #getDeviceWorkloadUpdateEvent()
	 * @generated
	 */
	EAttribute getDeviceWorkloadUpdateEvent_MemoryUsage();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.DeviceWorkloadUpdateEvent#getCpuUsage <em>Cpu Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cpu Usage</em>'.
	 * @see org.mmi.events.DeviceWorkloadUpdateEvent#getCpuUsage()
	 * @see #getDeviceWorkloadUpdateEvent()
	 * @generated
	 */
	EAttribute getDeviceWorkloadUpdateEvent_CpuUsage();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.CommunicationContextEvent <em>Communication Context Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Context Event</em>'.
	 * @see org.mmi.events.CommunicationContextEvent
	 * @generated
	 */
	EClass getCommunicationContextEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.SignalUpdateEvent <em>Signal Update Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Update Event</em>'.
	 * @see org.mmi.events.SignalUpdateEvent
	 * @generated
	 */
	EClass getSignalUpdateEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.SignalUpdateEvent#getWirelessAccessType <em>Wireless Access Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wireless Access Type</em>'.
	 * @see org.mmi.events.SignalUpdateEvent#getWirelessAccessType()
	 * @see #getSignalUpdateEvent()
	 * @generated
	 */
	EAttribute getSignalUpdateEvent_WirelessAccessType();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.SignalUpdateEvent#getAccessPointName <em>Access Point Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Point Name</em>'.
	 * @see org.mmi.events.SignalUpdateEvent#getAccessPointName()
	 * @see #getSignalUpdateEvent()
	 * @generated
	 */
	EAttribute getSignalUpdateEvent_AccessPointName();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.SignalUpdateEvent#getSignalStrength <em>Signal Strength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signal Strength</em>'.
	 * @see org.mmi.events.SignalUpdateEvent#getSignalStrength()
	 * @see #getSignalUpdateEvent()
	 * @generated
	 */
	EAttribute getSignalUpdateEvent_SignalStrength();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.ThroughputUpdateEvent <em>Throughput Update Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Throughput Update Event</em>'.
	 * @see org.mmi.events.ThroughputUpdateEvent
	 * @generated
	 */
	EClass getThroughputUpdateEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.ThroughputUpdateEvent#getReceivedData <em>Received Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Received Data</em>'.
	 * @see org.mmi.events.ThroughputUpdateEvent#getReceivedData()
	 * @see #getThroughputUpdateEvent()
	 * @generated
	 */
	EAttribute getThroughputUpdateEvent_ReceivedData();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.ThroughputUpdateEvent#getSentData <em>Sent Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sent Data</em>'.
	 * @see org.mmi.events.ThroughputUpdateEvent#getSentData()
	 * @see #getThroughputUpdateEvent()
	 * @generated
	 */
	EAttribute getThroughputUpdateEvent_SentData();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.ServerResponseUpdateEvent <em>Server Response Update Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server Response Update Event</em>'.
	 * @see org.mmi.events.ServerResponseUpdateEvent
	 * @generated
	 */
	EClass getServerResponseUpdateEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.ServerResponseUpdateEvent#getRtt <em>Rtt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rtt</em>'.
	 * @see org.mmi.events.ServerResponseUpdateEvent#getRtt()
	 * @see #getServerResponseUpdateEvent()
	 * @generated
	 */
	EAttribute getServerResponseUpdateEvent_Rtt();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.ServerResponseUpdateEvent#getSrt <em>Srt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Srt</em>'.
	 * @see org.mmi.events.ServerResponseUpdateEvent#getSrt()
	 * @see #getServerResponseUpdateEvent()
	 * @generated
	 */
	EAttribute getServerResponseUpdateEvent_Srt();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.NavigationEvent <em>Navigation Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Navigation Event</em>'.
	 * @see org.mmi.events.NavigationEvent
	 * @generated
	 */
	EClass getNavigationEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.MotionEvent <em>Motion Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Motion Event</em>'.
	 * @see org.mmi.events.MotionEvent
	 * @generated
	 */
	EClass getMotionEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.TextEvent <em>Text Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Event</em>'.
	 * @see org.mmi.events.TextEvent
	 * @generated
	 */
	EClass getTextEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.SpeechInputEvent <em>Speech Input Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Speech Input Event</em>'.
	 * @see org.mmi.events.SpeechInputEvent
	 * @generated
	 */
	EClass getSpeechInputEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.ScreenEvent <em>Screen Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Screen Event</em>'.
	 * @see org.mmi.events.ScreenEvent
	 * @generated
	 */
	EClass getScreenEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.ScreenContentEvent <em>Screen Content Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Screen Content Event</em>'.
	 * @see org.mmi.events.ScreenContentEvent
	 * @generated
	 */
	EClass getScreenContentEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.ScreenContentEvent#getNitems <em>Nitems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nitems</em>'.
	 * @see org.mmi.events.ScreenContentEvent#getNitems()
	 * @see #getScreenContentEvent()
	 * @generated
	 */
	EAttribute getScreenContentEvent_Nitems();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.SpeechOutputEvent <em>Speech Output Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Speech Output Event</em>'.
	 * @see org.mmi.events.SpeechOutputEvent
	 * @generated
	 */
	EClass getSpeechOutputEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.SpeechOutputContentEvent <em>Speech Output Content Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Speech Output Content Event</em>'.
	 * @see org.mmi.events.SpeechOutputContentEvent
	 * @generated
	 */
	EClass getSpeechOutputContentEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.SpeechOutputContentEvent#getNitems <em>Nitems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nitems</em>'.
	 * @see org.mmi.events.SpeechOutputContentEvent#getNitems()
	 * @see #getSpeechOutputContentEvent()
	 * @generated
	 */
	EAttribute getSpeechOutputContentEvent_Nitems();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.TouchEvent <em>Touch Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Touch Event</em>'.
	 * @see org.mmi.events.TouchEvent
	 * @generated
	 */
	EClass getTouchEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.ClickEvent <em>Click Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Click Event</em>'.
	 * @see org.mmi.events.ClickEvent
	 * @generated
	 */
	EClass getClickEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.LongClickEvent <em>Long Click Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Long Click Event</em>'.
	 * @see org.mmi.events.LongClickEvent
	 * @generated
	 */
	EClass getLongClickEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.ScrollEvent <em>Scroll Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scroll Event</em>'.
	 * @see org.mmi.events.ScrollEvent
	 * @generated
	 */
	EClass getScrollEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.MoveEvent <em>Move Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move Event</em>'.
	 * @see org.mmi.events.MoveEvent
	 * @generated
	 */
	EClass getMoveEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.MoveEvent#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.mmi.events.MoveEvent#getLength()
	 * @see #getMoveEvent()
	 * @generated
	 */
	EAttribute getMoveEvent_Length();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.NavigationMoveEvent <em>Navigation Move Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Navigation Move Event</em>'.
	 * @see org.mmi.events.NavigationMoveEvent
	 * @generated
	 */
	EClass getNavigationMoveEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.NavigationMoveEvent#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.mmi.events.NavigationMoveEvent#getLength()
	 * @see #getNavigationMoveEvent()
	 * @generated
	 */
	EAttribute getNavigationMoveEvent_Length();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.NavigationActionEvent <em>Navigation Action Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Navigation Action Event</em>'.
	 * @see org.mmi.events.NavigationActionEvent
	 * @generated
	 */
	EClass getNavigationActionEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.NavigationExploreEvent <em>Navigation Explore Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Navigation Explore Event</em>'.
	 * @see org.mmi.events.NavigationExploreEvent
	 * @generated
	 */
	EClass getNavigationExploreEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.TiltEvent <em>Tilt Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tilt Event</em>'.
	 * @see org.mmi.events.TiltEvent
	 * @generated
	 */
	EClass getTiltEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.TwistEvent <em>Twist Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Twist Event</em>'.
	 * @see org.mmi.events.TwistEvent
	 * @generated
	 */
	EClass getTwistEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.ShakeEvent <em>Shake Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shake Event</em>'.
	 * @see org.mmi.events.ShakeEvent
	 * @generated
	 */
	EClass getShakeEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.MotionActionEvent <em>Motion Action Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Motion Action Event</em>'.
	 * @see org.mmi.events.MotionActionEvent
	 * @generated
	 */
	EClass getMotionActionEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.KeyTextEvent <em>Key Text Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Text Event</em>'.
	 * @see org.mmi.events.KeyTextEvent
	 * @generated
	 */
	EClass getKeyTextEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.KeyTextEvent#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.mmi.events.KeyTextEvent#getCode()
	 * @see #getKeyTextEvent()
	 * @generated
	 */
	EAttribute getKeyTextEvent_Code();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.KeyExploreEvent <em>Key Explore Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Explore Event</em>'.
	 * @see org.mmi.events.KeyExploreEvent
	 * @generated
	 */
	EClass getKeyExploreEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.KeyExploreEvent#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.mmi.events.KeyExploreEvent#getCode()
	 * @see #getKeyExploreEvent()
	 * @generated
	 */
	EAttribute getKeyExploreEvent_Code();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.KeyCommandEvent <em>Key Command Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Command Event</em>'.
	 * @see org.mmi.events.KeyCommandEvent
	 * @generated
	 */
	EClass getKeyCommandEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.KeyCommandEvent#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.mmi.events.KeyCommandEvent#getCode()
	 * @see #getKeyCommandEvent()
	 * @generated
	 */
	EAttribute getKeyCommandEvent_Code();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.TextWordEvent <em>Text Word Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Word Event</em>'.
	 * @see org.mmi.events.TextWordEvent
	 * @generated
	 */
	EClass getTextWordEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.TextExploreEvent <em>Text Explore Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Explore Event</em>'.
	 * @see org.mmi.events.TextExploreEvent
	 * @generated
	 */
	EClass getTextExploreEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.TextCommandEvent <em>Text Command Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Command Event</em>'.
	 * @see org.mmi.events.TextCommandEvent
	 * @generated
	 */
	EClass getTextCommandEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.GuiElementsEvent <em>Gui Elements Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gui Elements Event</em>'.
	 * @see org.mmi.events.GuiElementsEvent
	 * @generated
	 */
	EClass getGuiElementsEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.GuiFeedbackEvent <em>Gui Feedback Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gui Feedback Event</em>'.
	 * @see org.mmi.events.GuiFeedbackEvent
	 * @generated
	 */
	EClass getGuiFeedbackEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.GuiConceptsEvent <em>Gui Concepts Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gui Concepts Event</em>'.
	 * @see org.mmi.events.GuiConceptsEvent
	 * @generated
	 */
	EClass getGuiConceptsEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.GuiNoiseEvent <em>Gui Noise Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gui Noise Event</em>'.
	 * @see org.mmi.events.GuiNoiseEvent
	 * @generated
	 */
	EClass getGuiNoiseEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.GuiQuestionsEvent <em>Gui Questions Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gui Questions Event</em>'.
	 * @see org.mmi.events.GuiQuestionsEvent
	 * @generated
	 */
	EClass getGuiQuestionsEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.SpeechElementsEvent <em>Speech Elements Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Speech Elements Event</em>'.
	 * @see org.mmi.events.SpeechElementsEvent
	 * @generated
	 */
	EClass getSpeechElementsEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.SpeechFeedbackEvent <em>Speech Feedback Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Speech Feedback Event</em>'.
	 * @see org.mmi.events.SpeechFeedbackEvent
	 * @generated
	 */
	EClass getSpeechFeedbackEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.SpeechConceptsEvent <em>Speech Concepts Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Speech Concepts Event</em>'.
	 * @see org.mmi.events.SpeechConceptsEvent
	 * @generated
	 */
	EClass getSpeechConceptsEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.SpeechNoiseEvent <em>Speech Noise Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Speech Noise Event</em>'.
	 * @see org.mmi.events.SpeechNoiseEvent
	 * @generated
	 */
	EClass getSpeechNoiseEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.SpeechQuestionsEvent <em>Speech Questions Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Speech Questions Event</em>'.
	 * @see org.mmi.events.SpeechQuestionsEvent
	 * @generated
	 */
	EClass getSpeechQuestionsEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.CorrectAnswerEvent <em>Correct Answer Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Correct Answer Event</em>'.
	 * @see org.mmi.events.CorrectAnswerEvent
	 * @generated
	 */
	EClass getCorrectAnswerEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.IncorrectAnswerEvent <em>Incorrect Answer Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Incorrect Answer Event</em>'.
	 * @see org.mmi.events.IncorrectAnswerEvent
	 * @generated
	 */
	EClass getIncorrectAnswerEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.PartiallyCorrectAnswerEvent <em>Partially Correct Answer Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partially Correct Answer Event</em>'.
	 * @see org.mmi.events.PartiallyCorrectAnswerEvent
	 * @generated
	 */
	EClass getPartiallyCorrectAnswerEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.NotAnswerEvent <em>Not Answer Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Answer Event</em>'.
	 * @see org.mmi.events.NotAnswerEvent
	 * @generated
	 */
	EClass getNotAnswerEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.OpenPromptEvent <em>Open Prompt Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open Prompt Event</em>'.
	 * @see org.mmi.events.OpenPromptEvent
	 * @generated
	 */
	EClass getOpenPromptEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.HalfOpenPromptEvent <em>Half Open Prompt Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Half Open Prompt Event</em>'.
	 * @see org.mmi.events.HalfOpenPromptEvent
	 * @generated
	 */
	EClass getHalfOpenPromptEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.ClosedPromptEvent <em>Closed Prompt Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Closed Prompt Event</em>'.
	 * @see org.mmi.events.ClosedPromptEvent
	 * @generated
	 */
	EClass getClosedPromptEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.NoQuestionPromptEvent <em>No Question Prompt Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>No Question Prompt Event</em>'.
	 * @see org.mmi.events.NoQuestionPromptEvent
	 * @generated
	 */
	EClass getNoQuestionPromptEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.OverallWordsEvent <em>Overall Words Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Overall Words Event</em>'.
	 * @see org.mmi.events.OverallWordsEvent
	 * @generated
	 */
	EClass getOverallWordsEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.OverallWordsEvent#getNwords <em>Nwords</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nwords</em>'.
	 * @see org.mmi.events.OverallWordsEvent#getNwords()
	 * @see #getOverallWordsEvent()
	 * @generated
	 */
	EAttribute getOverallWordsEvent_Nwords();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.SubstitutedWordsEvent <em>Substituted Words Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Substituted Words Event</em>'.
	 * @see org.mmi.events.SubstitutedWordsEvent
	 * @generated
	 */
	EClass getSubstitutedWordsEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.SubstitutedWordsEvent#getNwords <em>Nwords</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nwords</em>'.
	 * @see org.mmi.events.SubstitutedWordsEvent#getNwords()
	 * @see #getSubstitutedWordsEvent()
	 * @generated
	 */
	EAttribute getSubstitutedWordsEvent_Nwords();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.DeletedWordsEvent <em>Deleted Words Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deleted Words Event</em>'.
	 * @see org.mmi.events.DeletedWordsEvent
	 * @generated
	 */
	EClass getDeletedWordsEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.DeletedWordsEvent#getNwords <em>Nwords</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nwords</em>'.
	 * @see org.mmi.events.DeletedWordsEvent#getNwords()
	 * @see #getDeletedWordsEvent()
	 * @generated
	 */
	EAttribute getDeletedWordsEvent_Nwords();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.InsertedWordsEvent <em>Inserted Words Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inserted Words Event</em>'.
	 * @see org.mmi.events.InsertedWordsEvent
	 * @generated
	 */
	EClass getInsertedWordsEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.InsertedWordsEvent#getNwords <em>Nwords</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nwords</em>'.
	 * @see org.mmi.events.InsertedWordsEvent#getNwords()
	 * @see #getInsertedWordsEvent()
	 * @generated
	 */
	EAttribute getInsertedWordsEvent_Nwords();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.OverallSentencesEvent <em>Overall Sentences Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Overall Sentences Event</em>'.
	 * @see org.mmi.events.OverallSentencesEvent
	 * @generated
	 */
	EClass getOverallSentencesEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.OverallSentencesEvent#getNsentences <em>Nsentences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nsentences</em>'.
	 * @see org.mmi.events.OverallSentencesEvent#getNsentences()
	 * @see #getOverallSentencesEvent()
	 * @generated
	 */
	EAttribute getOverallSentencesEvent_Nsentences();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.SubstitutedSentencesEvent <em>Substituted Sentences Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Substituted Sentences Event</em>'.
	 * @see org.mmi.events.SubstitutedSentencesEvent
	 * @generated
	 */
	EClass getSubstitutedSentencesEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.SubstitutedSentencesEvent#getNsentences <em>Nsentences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nsentences</em>'.
	 * @see org.mmi.events.SubstitutedSentencesEvent#getNsentences()
	 * @see #getSubstitutedSentencesEvent()
	 * @generated
	 */
	EAttribute getSubstitutedSentencesEvent_Nsentences();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.DeletedSentencesEvent <em>Deleted Sentences Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deleted Sentences Event</em>'.
	 * @see org.mmi.events.DeletedSentencesEvent
	 * @generated
	 */
	EClass getDeletedSentencesEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.DeletedSentencesEvent#getNsentences <em>Nsentences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nsentences</em>'.
	 * @see org.mmi.events.DeletedSentencesEvent#getNsentences()
	 * @see #getDeletedSentencesEvent()
	 * @generated
	 */
	EAttribute getDeletedSentencesEvent_Nsentences();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.InsertedSentencesEvent <em>Inserted Sentences Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inserted Sentences Event</em>'.
	 * @see org.mmi.events.InsertedSentencesEvent
	 * @generated
	 */
	EClass getInsertedSentencesEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.InsertedSentencesEvent#getNsentences <em>Nsentences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nsentences</em>'.
	 * @see org.mmi.events.InsertedSentencesEvent#getNsentences()
	 * @see #getInsertedSentencesEvent()
	 * @generated
	 */
	EAttribute getInsertedSentencesEvent_Nsentences();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.OverallConceptsEvent <em>Overall Concepts Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Overall Concepts Event</em>'.
	 * @see org.mmi.events.OverallConceptsEvent
	 * @generated
	 */
	EClass getOverallConceptsEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.OverallConceptsEvent#getNconcepts <em>Nconcepts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nconcepts</em>'.
	 * @see org.mmi.events.OverallConceptsEvent#getNconcepts()
	 * @see #getOverallConceptsEvent()
	 * @generated
	 */
	EAttribute getOverallConceptsEvent_Nconcepts();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.SubstitutedConceptsEvent <em>Substituted Concepts Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Substituted Concepts Event</em>'.
	 * @see org.mmi.events.SubstitutedConceptsEvent
	 * @generated
	 */
	EClass getSubstitutedConceptsEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.SubstitutedConceptsEvent#getNconcepts <em>Nconcepts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nconcepts</em>'.
	 * @see org.mmi.events.SubstitutedConceptsEvent#getNconcepts()
	 * @see #getSubstitutedConceptsEvent()
	 * @generated
	 */
	EAttribute getSubstitutedConceptsEvent_Nconcepts();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.DeletedConceptsEvent <em>Deleted Concepts Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deleted Concepts Event</em>'.
	 * @see org.mmi.events.DeletedConceptsEvent
	 * @generated
	 */
	EClass getDeletedConceptsEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.DeletedConceptsEvent#getNconcepts <em>Nconcepts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nconcepts</em>'.
	 * @see org.mmi.events.DeletedConceptsEvent#getNconcepts()
	 * @see #getDeletedConceptsEvent()
	 * @generated
	 */
	EAttribute getDeletedConceptsEvent_Nconcepts();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.InsertedConceptsEvent <em>Inserted Concepts Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inserted Concepts Event</em>'.
	 * @see org.mmi.events.InsertedConceptsEvent
	 * @generated
	 */
	EClass getInsertedConceptsEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.InsertedConceptsEvent#getNconcepts <em>Nconcepts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nconcepts</em>'.
	 * @see org.mmi.events.InsertedConceptsEvent#getNconcepts()
	 * @see #getInsertedConceptsEvent()
	 * @generated
	 */
	EAttribute getInsertedConceptsEvent_Nconcepts();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.CorrectlyParsedUtteranceEvent <em>Correctly Parsed Utterance Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Correctly Parsed Utterance Event</em>'.
	 * @see org.mmi.events.CorrectlyParsedUtteranceEvent
	 * @generated
	 */
	EClass getCorrectlyParsedUtteranceEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.PartiallyParsedUtteranceEvent <em>Partially Parsed Utterance Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partially Parsed Utterance Event</em>'.
	 * @see org.mmi.events.PartiallyParsedUtteranceEvent
	 * @generated
	 */
	EClass getPartiallyParsedUtteranceEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.IncorrectlyParsedUtteranceEvent <em>Incorrectly Parsed Utterance Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Incorrectly Parsed Utterance Event</em>'.
	 * @see org.mmi.events.IncorrectlyParsedUtteranceEvent
	 * @generated
	 */
	EClass getIncorrectlyParsedUtteranceEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.NewElementsEvent <em>New Elements Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>New Elements Event</em>'.
	 * @see org.mmi.events.NewElementsEvent
	 * @generated
	 */
	EClass getNewElementsEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.NewFeedbackElementsEvent <em>New Feedback Elements Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>New Feedback Elements Event</em>'.
	 * @see org.mmi.events.NewFeedbackElementsEvent
	 * @generated
	 */
	EClass getNewFeedbackElementsEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.NewConceptsEvent <em>New Concepts Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>New Concepts Event</em>'.
	 * @see org.mmi.events.NewConceptsEvent
	 * @generated
	 */
	EClass getNewConceptsEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.NewNoiseEvent <em>New Noise Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>New Noise Event</em>'.
	 * @see org.mmi.events.NewNoiseEvent
	 * @generated
	 */
	EClass getNewNoiseEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.NewQuestionsEvent <em>New Questions Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>New Questions Event</em>'.
	 * @see org.mmi.events.NewQuestionsEvent
	 * @generated
	 */
	EClass getNewQuestionsEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.HelpTurnEvent <em>Help Turn Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Help Turn Event</em>'.
	 * @see org.mmi.events.HelpTurnEvent
	 * @generated
	 */
	EClass getHelpTurnEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.CorrectionTurnEvent <em>Correction Turn Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Correction Turn Event</em>'.
	 * @see org.mmi.events.CorrectionTurnEvent
	 * @generated
	 */
	EClass getCorrectionTurnEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.CancelTurnEvent <em>Cancel Turn Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cancel Turn Event</em>'.
	 * @see org.mmi.events.CancelTurnEvent
	 * @generated
	 */
	EClass getCancelTurnEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.RestartTurnEvent <em>Restart Turn Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Restart Turn Event</em>'.
	 * @see org.mmi.events.RestartTurnEvent
	 * @generated
	 */
	EClass getRestartTurnEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.BargeinEvent <em>Bargein Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bargein Event</em>'.
	 * @see org.mmi.events.BargeinEvent
	 * @generated
	 */
	EClass getBargeinEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.events.BargeinEvent#isSuccessful <em>Successful</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Successful</em>'.
	 * @see org.mmi.events.BargeinEvent#isSuccessful()
	 * @see #getBargeinEvent()
	 * @generated
	 */
	EAttribute getBargeinEvent_Successful();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.DIVRejectionEvent <em>DIV Rejection Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DIV Rejection Event</em>'.
	 * @see org.mmi.events.DIVRejectionEvent
	 * @generated
	 */
	EClass getDIVRejectionEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.ASRRejectionEvent <em>ASR Rejection Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ASR Rejection Event</em>'.
	 * @see org.mmi.events.ASRRejectionEvent
	 * @generated
	 */
	EClass getASRRejectionEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.GRRejectionEvent <em>GR Rejection Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GR Rejection Event</em>'.
	 * @see org.mmi.events.GRRejectionEvent
	 * @generated
	 */
	EClass getGRRejectionEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.TimeoutEvent <em>Timeout Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timeout Event</em>'.
	 * @see org.mmi.events.TimeoutEvent
	 * @generated
	 */
	EClass getTimeoutEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.AppStartEvent <em>App Start Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App Start Event</em>'.
	 * @see org.mmi.events.AppStartEvent
	 * @generated
	 */
	EClass getAppStartEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.AppEndEvent <em>App End Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App End Event</em>'.
	 * @see org.mmi.events.AppEndEvent
	 * @generated
	 */
	EClass getAppEndEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.StartDialogueEvent <em>Start Dialogue Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Dialogue Event</em>'.
	 * @see org.mmi.events.StartDialogueEvent
	 * @generated
	 */
	EClass getStartDialogueEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.EndDialogueEvent <em>End Dialogue Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Dialogue Event</em>'.
	 * @see org.mmi.events.EndDialogueEvent
	 * @generated
	 */
	EClass getEndDialogueEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.StartSystemTurnEvent <em>Start System Turn Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start System Turn Event</em>'.
	 * @see org.mmi.events.StartSystemTurnEvent
	 * @generated
	 */
	EClass getStartSystemTurnEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.EndSystemTurnEvent <em>End System Turn Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End System Turn Event</em>'.
	 * @see org.mmi.events.EndSystemTurnEvent
	 * @generated
	 */
	EClass getEndSystemTurnEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.StartUserTurnEvent <em>Start User Turn Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start User Turn Event</em>'.
	 * @see org.mmi.events.StartUserTurnEvent
	 * @generated
	 */
	EClass getStartUserTurnEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.EndUserTurnEvent <em>End User Turn Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End User Turn Event</em>'.
	 * @see org.mmi.events.EndUserTurnEvent
	 * @generated
	 */
	EClass getEndUserTurnEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.SystemFeedbackStartEvent <em>System Feedback Start Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Feedback Start Event</em>'.
	 * @see org.mmi.events.SystemFeedbackStartEvent
	 * @generated
	 */
	EClass getSystemFeedbackStartEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.SystemActionStartEvent <em>System Action Start Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Action Start Event</em>'.
	 * @see org.mmi.events.SystemActionStartEvent
	 * @generated
	 */
	EClass getSystemActionStartEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.SystemActionEndEvent <em>System Action End Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Action End Event</em>'.
	 * @see org.mmi.events.SystemActionEndEvent
	 * @generated
	 */
	EClass getSystemActionEndEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.UserFeedbackStartEvent <em>User Feedback Start Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Feedback Start Event</em>'.
	 * @see org.mmi.events.UserFeedbackStartEvent
	 * @generated
	 */
	EClass getUserFeedbackStartEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.UserActionStartEvent <em>User Action Start Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Action Start Event</em>'.
	 * @see org.mmi.events.UserActionStartEvent
	 * @generated
	 */
	EClass getUserActionStartEvent();

	/**
	 * Returns the meta object for class '{@link org.mmi.events.UserActionEndEvent <em>User Action End Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Action End Event</em>'.
	 * @see org.mmi.events.UserActionEndEvent
	 * @generated
	 */
	EClass getUserActionEndEvent();

	/**
	 * Returns the meta object for enum '{@link org.mmi.events.event_t <em>event t</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>event t</em>'.
	 * @see org.mmi.events.event_t
	 * @generated
	 */
	EEnum getevent_t();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EventsFactory getEventsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.EventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__TYPE = eINSTANCE.getEvent_Type();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__TIMESTAMP = eINSTANCE.getEvent_Timestamp();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.InputEventImpl <em>Input Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.InputEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getInputEvent()
		 * @generated
		 */
		EClass INPUT_EVENT = eINSTANCE.getInputEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.OutputEventImpl <em>Output Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.OutputEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getOutputEvent()
		 * @generated
		 */
		EClass OUTPUT_EVENT = eINSTANCE.getOutputEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.DialogueContentEventImpl <em>Dialogue Content Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.DialogueContentEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getDialogueContentEvent()
		 * @generated
		 */
		EClass DIALOGUE_CONTENT_EVENT = eINSTANCE.getDialogueContentEvent();

		/**
		 * The meta object literal for the '<em><b>Nitems</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIALOGUE_CONTENT_EVENT__NITEMS = eINSTANCE.getDialogueContentEvent_Nitems();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.MetacommEventImpl <em>Metacomm Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.MetacommEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getMetacommEvent()
		 * @generated
		 */
		EClass METACOMM_EVENT = eINSTANCE.getMetacommEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.TurnControlEventImpl <em>Turn Control Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.TurnControlEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getTurnControlEvent()
		 * @generated
		 */
		EClass TURN_CONTROL_EVENT = eINSTANCE.getTurnControlEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.TurnTimingEventImpl <em>Turn Timing Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.TurnTimingEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getTurnTimingEvent()
		 * @generated
		 */
		EClass TURN_TIMING_EVENT = eINSTANCE.getTurnTimingEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.ContextEventImpl <em>Context Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.ContextEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getContextEvent()
		 * @generated
		 */
		EClass CONTEXT_EVENT = eINSTANCE.getContextEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.PhysicalEnvironmentContextEventImpl <em>Physical Environment Context Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.PhysicalEnvironmentContextEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getPhysicalEnvironmentContextEvent()
		 * @generated
		 */
		EClass PHYSICAL_ENVIRONMENT_CONTEXT_EVENT = eINSTANCE.getPhysicalEnvironmentContextEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.WeatherUpdateEventImpl <em>Weather Update Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.WeatherUpdateEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getWeatherUpdateEvent()
		 * @generated
		 */
		EClass WEATHER_UPDATE_EVENT = eINSTANCE.getWeatherUpdateEvent();

		/**
		 * The meta object literal for the '<em><b>Temperature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEATHER_UPDATE_EVENT__TEMPERATURE = eINSTANCE.getWeatherUpdateEvent_Temperature();

		/**
		 * The meta object literal for the '<em><b>Weather</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEATHER_UPDATE_EVENT__WEATHER = eINSTANCE.getWeatherUpdateEvent_Weather();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.AmbientUpdateEventImpl <em>Ambient Update Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.AmbientUpdateEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getAmbientUpdateEvent()
		 * @generated
		 */
		EClass AMBIENT_UPDATE_EVENT = eINSTANCE.getAmbientUpdateEvent();

		/**
		 * The meta object literal for the '<em><b>Noise</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AMBIENT_UPDATE_EVENT__NOISE = eINSTANCE.getAmbientUpdateEvent_Noise();

		/**
		 * The meta object literal for the '<em><b>Light</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AMBIENT_UPDATE_EVENT__LIGHT = eINSTANCE.getAmbientUpdateEvent_Light();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.UserContextEventImpl <em>User Context Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.UserContextEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getUserContextEvent()
		 * @generated
		 */
		EClass USER_CONTEXT_EVENT = eINSTANCE.getUserContextEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.UserDataUpdateEventImpl <em>User Data Update Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.UserDataUpdateEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getUserDataUpdateEvent()
		 * @generated
		 */
		EClass USER_DATA_UPDATE_EVENT = eINSTANCE.getUserDataUpdateEvent();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_DATA_UPDATE_EVENT__AGE = eINSTANCE.getUserDataUpdateEvent_Age();

		/**
		 * The meta object literal for the '<em><b>Gender</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_DATA_UPDATE_EVENT__GENDER = eINSTANCE.getUserDataUpdateEvent_Gender();

		/**
		 * The meta object literal for the '<em><b>Education Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_DATA_UPDATE_EVENT__EDUCATION_LEVEL = eINSTANCE.getUserDataUpdateEvent_EducationLevel();

		/**
		 * The meta object literal for the '<em><b>Previous Experience</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_DATA_UPDATE_EVENT__PREVIOUS_EXPERIENCE = eINSTANCE.getUserDataUpdateEvent_PreviousExperience();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.UserRatingsUpdateEventImpl <em>User Ratings Update Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.UserRatingsUpdateEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getUserRatingsUpdateEvent()
		 * @generated
		 */
		EClass USER_RATINGS_UPDATE_EVENT = eINSTANCE.getUserRatingsUpdateEvent();

		/**
		 * The meta object literal for the '<em><b>Practical</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_RATINGS_UPDATE_EVENT__PRACTICAL = eINSTANCE.getUserRatingsUpdateEvent_Practical();

		/**
		 * The meta object literal for the '<em><b>Predictable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_RATINGS_UPDATE_EVENT__PREDICTABLE = eINSTANCE.getUserRatingsUpdateEvent_Predictable();

		/**
		 * The meta object literal for the '<em><b>Clearly Structured</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_RATINGS_UPDATE_EVENT__CLEARLY_STRUCTURED = eINSTANCE.getUserRatingsUpdateEvent_ClearlyStructured();

		/**
		 * The meta object literal for the '<em><b>Simple</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_RATINGS_UPDATE_EVENT__SIMPLE = eINSTANCE.getUserRatingsUpdateEvent_Simple();

		/**
		 * The meta object literal for the '<em><b>Stylish</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_RATINGS_UPDATE_EVENT__STYLISH = eINSTANCE.getUserRatingsUpdateEvent_Stylish();

		/**
		 * The meta object literal for the '<em><b>Premium</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_RATINGS_UPDATE_EVENT__PREMIUM = eINSTANCE.getUserRatingsUpdateEvent_Premium();

		/**
		 * The meta object literal for the '<em><b>Creative</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_RATINGS_UPDATE_EVENT__CREATIVE = eINSTANCE.getUserRatingsUpdateEvent_Creative();

		/**
		 * The meta object literal for the '<em><b>Captivating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_RATINGS_UPDATE_EVENT__CAPTIVATING = eINSTANCE.getUserRatingsUpdateEvent_Captivating();

		/**
		 * The meta object literal for the '<em><b>Beautiful</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_RATINGS_UPDATE_EVENT__BEAUTIFUL = eINSTANCE.getUserRatingsUpdateEvent_Beautiful();

		/**
		 * The meta object literal for the '<em><b>Good</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_RATINGS_UPDATE_EVENT__GOOD = eINSTANCE.getUserRatingsUpdateEvent_Good();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.UserAttitudeUpdateEventImpl <em>User Attitude Update Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.UserAttitudeUpdateEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getUserAttitudeUpdateEvent()
		 * @generated
		 */
		EClass USER_ATTITUDE_UPDATE_EVENT = eINSTANCE.getUserAttitudeUpdateEvent();

		/**
		 * The meta object literal for the '<em><b>Usefulness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_ATTITUDE_UPDATE_EVENT__USEFULNESS = eINSTANCE.getUserAttitudeUpdateEvent_Usefulness();

		/**
		 * The meta object literal for the '<em><b>Pleasantness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_ATTITUDE_UPDATE_EVENT__PLEASANTNESS = eINSTANCE.getUserAttitudeUpdateEvent_Pleasantness();

		/**
		 * The meta object literal for the '<em><b>Integration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_ATTITUDE_UPDATE_EVENT__INTEGRATION = eINSTANCE.getUserAttitudeUpdateEvent_Integration();

		/**
		 * The meta object literal for the '<em><b>Self Efficacy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_ATTITUDE_UPDATE_EVENT__SELF_EFFICACY = eINSTANCE.getUserAttitudeUpdateEvent_SelfEfficacy();

		/**
		 * The meta object literal for the '<em><b>Comfort</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_ATTITUDE_UPDATE_EVENT__COMFORT = eINSTANCE.getUserAttitudeUpdateEvent_Comfort();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.UserMoodUpdateEventImpl <em>User Mood Update Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.UserMoodUpdateEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getUserMoodUpdateEvent()
		 * @generated
		 */
		EClass USER_MOOD_UPDATE_EVENT = eINSTANCE.getUserMoodUpdateEvent();

		/**
		 * The meta object literal for the '<em><b>Mood</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_MOOD_UPDATE_EVENT__MOOD = eINSTANCE.getUserMoodUpdateEvent_Mood();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.SocialContextEventImpl <em>Social Context Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.SocialContextEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getSocialContextEvent()
		 * @generated
		 */
		EClass SOCIAL_CONTEXT_EVENT = eINSTANCE.getSocialContextEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.SocialUpdateEventImpl <em>Social Update Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.SocialUpdateEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getSocialUpdateEvent()
		 * @generated
		 */
		EClass SOCIAL_UPDATE_EVENT = eINSTANCE.getSocialUpdateEvent();

		/**
		 * The meta object literal for the '<em><b>Social Company</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOCIAL_UPDATE_EVENT__SOCIAL_COMPANY = eINSTANCE.getSocialUpdateEvent_SocialCompany();

		/**
		 * The meta object literal for the '<em><b>Social Arena</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOCIAL_UPDATE_EVENT__SOCIAL_ARENA = eINSTANCE.getSocialUpdateEvent_SocialArena();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.LocationTimeContextEventImpl <em>Location Time Context Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.LocationTimeContextEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getLocationTimeContextEvent()
		 * @generated
		 */
		EClass LOCATION_TIME_CONTEXT_EVENT = eINSTANCE.getLocationTimeContextEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.LocationUpdateEventImpl <em>Location Update Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.LocationUpdateEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getLocationUpdateEvent()
		 * @generated
		 */
		EClass LOCATION_UPDATE_EVENT = eINSTANCE.getLocationUpdateEvent();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_UPDATE_EVENT__LOCATION = eINSTANCE.getLocationUpdateEvent_Location();

		/**
		 * The meta object literal for the '<em><b>Geo latitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_UPDATE_EVENT__GEO_LATITUDE = eINSTANCE.getLocationUpdateEvent_Geo_latitude();

		/**
		 * The meta object literal for the '<em><b>Geo longitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_UPDATE_EVENT__GEO_LONGITUDE = eINSTANCE.getLocationUpdateEvent_Geo_longitude();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.MobilityUpdateEventImpl <em>Mobility Update Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.MobilityUpdateEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getMobilityUpdateEvent()
		 * @generated
		 */
		EClass MOBILITY_UPDATE_EVENT = eINSTANCE.getMobilityUpdateEvent();

		/**
		 * The meta object literal for the '<em><b>Mobility Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBILITY_UPDATE_EVENT__MOBILITY_LEVEL = eINSTANCE.getMobilityUpdateEvent_MobilityLevel();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.TimeUpdateEventImpl <em>Time Update Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.TimeUpdateEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getTimeUpdateEvent()
		 * @generated
		 */
		EClass TIME_UPDATE_EVENT = eINSTANCE.getTimeUpdateEvent();

		/**
		 * The meta object literal for the '<em><b>Thours</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_UPDATE_EVENT__THOURS = eINSTANCE.getTimeUpdateEvent_T_hours();

		/**
		 * The meta object literal for the '<em><b>Tmins</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_UPDATE_EVENT__TMINS = eINSTANCE.getTimeUpdateEvent_T_mins();

		/**
		 * The meta object literal for the '<em><b>Tsecs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_UPDATE_EVENT__TSECS = eINSTANCE.getTimeUpdateEvent_T_secs();

		/**
		 * The meta object literal for the '<em><b>Dyear</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_UPDATE_EVENT__DYEAR = eINSTANCE.getTimeUpdateEvent_D_year();

		/**
		 * The meta object literal for the '<em><b>Dmonth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_UPDATE_EVENT__DMONTH = eINSTANCE.getTimeUpdateEvent_D_month();

		/**
		 * The meta object literal for the '<em><b>Dday</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_UPDATE_EVENT__DDAY = eINSTANCE.getTimeUpdateEvent_D_day();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.DeviceContextEventImpl <em>Device Context Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.DeviceContextEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getDeviceContextEvent()
		 * @generated
		 */
		EClass DEVICE_CONTEXT_EVENT = eINSTANCE.getDeviceContextEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.DeviceFeaturesUpdateEventImpl <em>Device Features Update Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.DeviceFeaturesUpdateEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getDeviceFeaturesUpdateEvent()
		 * @generated
		 */
		EClass DEVICE_FEATURES_UPDATE_EVENT = eINSTANCE.getDeviceFeaturesUpdateEvent();

		/**
		 * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_FEATURES_UPDATE_EVENT__DEVICE_TYPE = eINSTANCE.getDeviceFeaturesUpdateEvent_DeviceType();

		/**
		 * The meta object literal for the '<em><b>Screen Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_FEATURES_UPDATE_EVENT__SCREEN_SIZE = eINSTANCE.getDeviceFeaturesUpdateEvent_ScreenSize();

		/**
		 * The meta object literal for the '<em><b>Screen Resolution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_FEATURES_UPDATE_EVENT__SCREEN_RESOLUTION = eINSTANCE.getDeviceFeaturesUpdateEvent_ScreenResolution();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.DeviceRunningFeaturesUpdateEventImpl <em>Device Running Features Update Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.DeviceRunningFeaturesUpdateEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getDeviceRunningFeaturesUpdateEvent()
		 * @generated
		 */
		EClass DEVICE_RUNNING_FEATURES_UPDATE_EVENT = eINSTANCE.getDeviceRunningFeaturesUpdateEvent();

		/**
		 * The meta object literal for the '<em><b>Screen Orientation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_RUNNING_FEATURES_UPDATE_EVENT__SCREEN_ORIENTATION = eINSTANCE.getDeviceRunningFeaturesUpdateEvent_ScreenOrientation();

		/**
		 * The meta object literal for the '<em><b>Brightness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_RUNNING_FEATURES_UPDATE_EVENT__BRIGHTNESS = eINSTANCE.getDeviceRunningFeaturesUpdateEvent_Brightness();

		/**
		 * The meta object literal for the '<em><b>Volume</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_RUNNING_FEATURES_UPDATE_EVENT__VOLUME = eINSTANCE.getDeviceRunningFeaturesUpdateEvent_Volume();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.DeviceWorkloadUpdateEventImpl <em>Device Workload Update Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.DeviceWorkloadUpdateEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getDeviceWorkloadUpdateEvent()
		 * @generated
		 */
		EClass DEVICE_WORKLOAD_UPDATE_EVENT = eINSTANCE.getDeviceWorkloadUpdateEvent();

		/**
		 * The meta object literal for the '<em><b>Memory Usage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_WORKLOAD_UPDATE_EVENT__MEMORY_USAGE = eINSTANCE.getDeviceWorkloadUpdateEvent_MemoryUsage();

		/**
		 * The meta object literal for the '<em><b>Cpu Usage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_WORKLOAD_UPDATE_EVENT__CPU_USAGE = eINSTANCE.getDeviceWorkloadUpdateEvent_CpuUsage();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.CommunicationContextEventImpl <em>Communication Context Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.CommunicationContextEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getCommunicationContextEvent()
		 * @generated
		 */
		EClass COMMUNICATION_CONTEXT_EVENT = eINSTANCE.getCommunicationContextEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.SignalUpdateEventImpl <em>Signal Update Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.SignalUpdateEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getSignalUpdateEvent()
		 * @generated
		 */
		EClass SIGNAL_UPDATE_EVENT = eINSTANCE.getSignalUpdateEvent();

		/**
		 * The meta object literal for the '<em><b>Wireless Access Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNAL_UPDATE_EVENT__WIRELESS_ACCESS_TYPE = eINSTANCE.getSignalUpdateEvent_WirelessAccessType();

		/**
		 * The meta object literal for the '<em><b>Access Point Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNAL_UPDATE_EVENT__ACCESS_POINT_NAME = eINSTANCE.getSignalUpdateEvent_AccessPointName();

		/**
		 * The meta object literal for the '<em><b>Signal Strength</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNAL_UPDATE_EVENT__SIGNAL_STRENGTH = eINSTANCE.getSignalUpdateEvent_SignalStrength();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.ThroughputUpdateEventImpl <em>Throughput Update Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.ThroughputUpdateEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getThroughputUpdateEvent()
		 * @generated
		 */
		EClass THROUGHPUT_UPDATE_EVENT = eINSTANCE.getThroughputUpdateEvent();

		/**
		 * The meta object literal for the '<em><b>Received Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THROUGHPUT_UPDATE_EVENT__RECEIVED_DATA = eINSTANCE.getThroughputUpdateEvent_ReceivedData();

		/**
		 * The meta object literal for the '<em><b>Sent Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THROUGHPUT_UPDATE_EVENT__SENT_DATA = eINSTANCE.getThroughputUpdateEvent_SentData();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.ServerResponseUpdateEventImpl <em>Server Response Update Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.ServerResponseUpdateEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getServerResponseUpdateEvent()
		 * @generated
		 */
		EClass SERVER_RESPONSE_UPDATE_EVENT = eINSTANCE.getServerResponseUpdateEvent();

		/**
		 * The meta object literal for the '<em><b>Rtt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER_RESPONSE_UPDATE_EVENT__RTT = eINSTANCE.getServerResponseUpdateEvent_Rtt();

		/**
		 * The meta object literal for the '<em><b>Srt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER_RESPONSE_UPDATE_EVENT__SRT = eINSTANCE.getServerResponseUpdateEvent_Srt();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.NavigationEventImpl <em>Navigation Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.NavigationEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getNavigationEvent()
		 * @generated
		 */
		EClass NAVIGATION_EVENT = eINSTANCE.getNavigationEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.MotionEventImpl <em>Motion Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.MotionEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getMotionEvent()
		 * @generated
		 */
		EClass MOTION_EVENT = eINSTANCE.getMotionEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.TextEventImpl <em>Text Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.TextEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getTextEvent()
		 * @generated
		 */
		EClass TEXT_EVENT = eINSTANCE.getTextEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.SpeechInputEventImpl <em>Speech Input Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.SpeechInputEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getSpeechInputEvent()
		 * @generated
		 */
		EClass SPEECH_INPUT_EVENT = eINSTANCE.getSpeechInputEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.ScreenEventImpl <em>Screen Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.ScreenEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getScreenEvent()
		 * @generated
		 */
		EClass SCREEN_EVENT = eINSTANCE.getScreenEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.ScreenContentEventImpl <em>Screen Content Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.ScreenContentEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getScreenContentEvent()
		 * @generated
		 */
		EClass SCREEN_CONTENT_EVENT = eINSTANCE.getScreenContentEvent();

		/**
		 * The meta object literal for the '<em><b>Nitems</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCREEN_CONTENT_EVENT__NITEMS = eINSTANCE.getScreenContentEvent_Nitems();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.SpeechOutputEventImpl <em>Speech Output Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.SpeechOutputEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getSpeechOutputEvent()
		 * @generated
		 */
		EClass SPEECH_OUTPUT_EVENT = eINSTANCE.getSpeechOutputEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.SpeechOutputContentEventImpl <em>Speech Output Content Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.SpeechOutputContentEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getSpeechOutputContentEvent()
		 * @generated
		 */
		EClass SPEECH_OUTPUT_CONTENT_EVENT = eINSTANCE.getSpeechOutputContentEvent();

		/**
		 * The meta object literal for the '<em><b>Nitems</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEECH_OUTPUT_CONTENT_EVENT__NITEMS = eINSTANCE.getSpeechOutputContentEvent_Nitems();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.TouchEventImpl <em>Touch Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.TouchEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getTouchEvent()
		 * @generated
		 */
		EClass TOUCH_EVENT = eINSTANCE.getTouchEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.ClickEventImpl <em>Click Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.ClickEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getClickEvent()
		 * @generated
		 */
		EClass CLICK_EVENT = eINSTANCE.getClickEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.LongClickEventImpl <em>Long Click Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.LongClickEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getLongClickEvent()
		 * @generated
		 */
		EClass LONG_CLICK_EVENT = eINSTANCE.getLongClickEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.ScrollEventImpl <em>Scroll Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.ScrollEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getScrollEvent()
		 * @generated
		 */
		EClass SCROLL_EVENT = eINSTANCE.getScrollEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.MoveEventImpl <em>Move Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.MoveEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getMoveEvent()
		 * @generated
		 */
		EClass MOVE_EVENT = eINSTANCE.getMoveEvent();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE_EVENT__LENGTH = eINSTANCE.getMoveEvent_Length();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.NavigationMoveEventImpl <em>Navigation Move Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.NavigationMoveEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getNavigationMoveEvent()
		 * @generated
		 */
		EClass NAVIGATION_MOVE_EVENT = eINSTANCE.getNavigationMoveEvent();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAVIGATION_MOVE_EVENT__LENGTH = eINSTANCE.getNavigationMoveEvent_Length();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.NavigationActionEventImpl <em>Navigation Action Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.NavigationActionEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getNavigationActionEvent()
		 * @generated
		 */
		EClass NAVIGATION_ACTION_EVENT = eINSTANCE.getNavigationActionEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.NavigationExploreEventImpl <em>Navigation Explore Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.NavigationExploreEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getNavigationExploreEvent()
		 * @generated
		 */
		EClass NAVIGATION_EXPLORE_EVENT = eINSTANCE.getNavigationExploreEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.TiltEventImpl <em>Tilt Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.TiltEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getTiltEvent()
		 * @generated
		 */
		EClass TILT_EVENT = eINSTANCE.getTiltEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.TwistEventImpl <em>Twist Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.TwistEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getTwistEvent()
		 * @generated
		 */
		EClass TWIST_EVENT = eINSTANCE.getTwistEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.ShakeEventImpl <em>Shake Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.ShakeEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getShakeEvent()
		 * @generated
		 */
		EClass SHAKE_EVENT = eINSTANCE.getShakeEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.MotionActionEventImpl <em>Motion Action Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.MotionActionEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getMotionActionEvent()
		 * @generated
		 */
		EClass MOTION_ACTION_EVENT = eINSTANCE.getMotionActionEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.KeyTextEventImpl <em>Key Text Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.KeyTextEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getKeyTextEvent()
		 * @generated
		 */
		EClass KEY_TEXT_EVENT = eINSTANCE.getKeyTextEvent();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_TEXT_EVENT__CODE = eINSTANCE.getKeyTextEvent_Code();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.KeyExploreEventImpl <em>Key Explore Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.KeyExploreEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getKeyExploreEvent()
		 * @generated
		 */
		EClass KEY_EXPLORE_EVENT = eINSTANCE.getKeyExploreEvent();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_EXPLORE_EVENT__CODE = eINSTANCE.getKeyExploreEvent_Code();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.KeyCommandEventImpl <em>Key Command Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.KeyCommandEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getKeyCommandEvent()
		 * @generated
		 */
		EClass KEY_COMMAND_EVENT = eINSTANCE.getKeyCommandEvent();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_COMMAND_EVENT__CODE = eINSTANCE.getKeyCommandEvent_Code();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.TextWordEventImpl <em>Text Word Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.TextWordEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getTextWordEvent()
		 * @generated
		 */
		EClass TEXT_WORD_EVENT = eINSTANCE.getTextWordEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.TextExploreEventImpl <em>Text Explore Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.TextExploreEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getTextExploreEvent()
		 * @generated
		 */
		EClass TEXT_EXPLORE_EVENT = eINSTANCE.getTextExploreEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.TextCommandEventImpl <em>Text Command Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.TextCommandEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getTextCommandEvent()
		 * @generated
		 */
		EClass TEXT_COMMAND_EVENT = eINSTANCE.getTextCommandEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.GuiElementsEventImpl <em>Gui Elements Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.GuiElementsEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getGuiElementsEvent()
		 * @generated
		 */
		EClass GUI_ELEMENTS_EVENT = eINSTANCE.getGuiElementsEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.GuiFeedbackEventImpl <em>Gui Feedback Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.GuiFeedbackEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getGuiFeedbackEvent()
		 * @generated
		 */
		EClass GUI_FEEDBACK_EVENT = eINSTANCE.getGuiFeedbackEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.GuiConceptsEventImpl <em>Gui Concepts Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.GuiConceptsEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getGuiConceptsEvent()
		 * @generated
		 */
		EClass GUI_CONCEPTS_EVENT = eINSTANCE.getGuiConceptsEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.GuiNoiseEventImpl <em>Gui Noise Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.GuiNoiseEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getGuiNoiseEvent()
		 * @generated
		 */
		EClass GUI_NOISE_EVENT = eINSTANCE.getGuiNoiseEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.GuiQuestionsEventImpl <em>Gui Questions Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.GuiQuestionsEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getGuiQuestionsEvent()
		 * @generated
		 */
		EClass GUI_QUESTIONS_EVENT = eINSTANCE.getGuiQuestionsEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.SpeechElementsEventImpl <em>Speech Elements Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.SpeechElementsEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getSpeechElementsEvent()
		 * @generated
		 */
		EClass SPEECH_ELEMENTS_EVENT = eINSTANCE.getSpeechElementsEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.SpeechFeedbackEventImpl <em>Speech Feedback Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.SpeechFeedbackEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getSpeechFeedbackEvent()
		 * @generated
		 */
		EClass SPEECH_FEEDBACK_EVENT = eINSTANCE.getSpeechFeedbackEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.SpeechConceptsEventImpl <em>Speech Concepts Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.SpeechConceptsEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getSpeechConceptsEvent()
		 * @generated
		 */
		EClass SPEECH_CONCEPTS_EVENT = eINSTANCE.getSpeechConceptsEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.SpeechNoiseEventImpl <em>Speech Noise Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.SpeechNoiseEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getSpeechNoiseEvent()
		 * @generated
		 */
		EClass SPEECH_NOISE_EVENT = eINSTANCE.getSpeechNoiseEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.SpeechQuestionsEventImpl <em>Speech Questions Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.SpeechQuestionsEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getSpeechQuestionsEvent()
		 * @generated
		 */
		EClass SPEECH_QUESTIONS_EVENT = eINSTANCE.getSpeechQuestionsEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.CorrectAnswerEventImpl <em>Correct Answer Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.CorrectAnswerEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getCorrectAnswerEvent()
		 * @generated
		 */
		EClass CORRECT_ANSWER_EVENT = eINSTANCE.getCorrectAnswerEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.IncorrectAnswerEventImpl <em>Incorrect Answer Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.IncorrectAnswerEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getIncorrectAnswerEvent()
		 * @generated
		 */
		EClass INCORRECT_ANSWER_EVENT = eINSTANCE.getIncorrectAnswerEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.PartiallyCorrectAnswerEventImpl <em>Partially Correct Answer Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.PartiallyCorrectAnswerEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getPartiallyCorrectAnswerEvent()
		 * @generated
		 */
		EClass PARTIALLY_CORRECT_ANSWER_EVENT = eINSTANCE.getPartiallyCorrectAnswerEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.NotAnswerEventImpl <em>Not Answer Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.NotAnswerEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getNotAnswerEvent()
		 * @generated
		 */
		EClass NOT_ANSWER_EVENT = eINSTANCE.getNotAnswerEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.OpenPromptEventImpl <em>Open Prompt Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.OpenPromptEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getOpenPromptEvent()
		 * @generated
		 */
		EClass OPEN_PROMPT_EVENT = eINSTANCE.getOpenPromptEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.HalfOpenPromptEventImpl <em>Half Open Prompt Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.HalfOpenPromptEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getHalfOpenPromptEvent()
		 * @generated
		 */
		EClass HALF_OPEN_PROMPT_EVENT = eINSTANCE.getHalfOpenPromptEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.ClosedPromptEventImpl <em>Closed Prompt Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.ClosedPromptEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getClosedPromptEvent()
		 * @generated
		 */
		EClass CLOSED_PROMPT_EVENT = eINSTANCE.getClosedPromptEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.NoQuestionPromptEventImpl <em>No Question Prompt Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.NoQuestionPromptEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getNoQuestionPromptEvent()
		 * @generated
		 */
		EClass NO_QUESTION_PROMPT_EVENT = eINSTANCE.getNoQuestionPromptEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.OverallWordsEventImpl <em>Overall Words Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.OverallWordsEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getOverallWordsEvent()
		 * @generated
		 */
		EClass OVERALL_WORDS_EVENT = eINSTANCE.getOverallWordsEvent();

		/**
		 * The meta object literal for the '<em><b>Nwords</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OVERALL_WORDS_EVENT__NWORDS = eINSTANCE.getOverallWordsEvent_Nwords();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.SubstitutedWordsEventImpl <em>Substituted Words Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.SubstitutedWordsEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getSubstitutedWordsEvent()
		 * @generated
		 */
		EClass SUBSTITUTED_WORDS_EVENT = eINSTANCE.getSubstitutedWordsEvent();

		/**
		 * The meta object literal for the '<em><b>Nwords</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSTITUTED_WORDS_EVENT__NWORDS = eINSTANCE.getSubstitutedWordsEvent_Nwords();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.DeletedWordsEventImpl <em>Deleted Words Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.DeletedWordsEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getDeletedWordsEvent()
		 * @generated
		 */
		EClass DELETED_WORDS_EVENT = eINSTANCE.getDeletedWordsEvent();

		/**
		 * The meta object literal for the '<em><b>Nwords</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELETED_WORDS_EVENT__NWORDS = eINSTANCE.getDeletedWordsEvent_Nwords();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.InsertedWordsEventImpl <em>Inserted Words Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.InsertedWordsEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getInsertedWordsEvent()
		 * @generated
		 */
		EClass INSERTED_WORDS_EVENT = eINSTANCE.getInsertedWordsEvent();

		/**
		 * The meta object literal for the '<em><b>Nwords</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERTED_WORDS_EVENT__NWORDS = eINSTANCE.getInsertedWordsEvent_Nwords();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.OverallSentencesEventImpl <em>Overall Sentences Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.OverallSentencesEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getOverallSentencesEvent()
		 * @generated
		 */
		EClass OVERALL_SENTENCES_EVENT = eINSTANCE.getOverallSentencesEvent();

		/**
		 * The meta object literal for the '<em><b>Nsentences</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OVERALL_SENTENCES_EVENT__NSENTENCES = eINSTANCE.getOverallSentencesEvent_Nsentences();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.SubstitutedSentencesEventImpl <em>Substituted Sentences Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.SubstitutedSentencesEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getSubstitutedSentencesEvent()
		 * @generated
		 */
		EClass SUBSTITUTED_SENTENCES_EVENT = eINSTANCE.getSubstitutedSentencesEvent();

		/**
		 * The meta object literal for the '<em><b>Nsentences</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSTITUTED_SENTENCES_EVENT__NSENTENCES = eINSTANCE.getSubstitutedSentencesEvent_Nsentences();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.DeletedSentencesEventImpl <em>Deleted Sentences Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.DeletedSentencesEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getDeletedSentencesEvent()
		 * @generated
		 */
		EClass DELETED_SENTENCES_EVENT = eINSTANCE.getDeletedSentencesEvent();

		/**
		 * The meta object literal for the '<em><b>Nsentences</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELETED_SENTENCES_EVENT__NSENTENCES = eINSTANCE.getDeletedSentencesEvent_Nsentences();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.InsertedSentencesEventImpl <em>Inserted Sentences Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.InsertedSentencesEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getInsertedSentencesEvent()
		 * @generated
		 */
		EClass INSERTED_SENTENCES_EVENT = eINSTANCE.getInsertedSentencesEvent();

		/**
		 * The meta object literal for the '<em><b>Nsentences</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERTED_SENTENCES_EVENT__NSENTENCES = eINSTANCE.getInsertedSentencesEvent_Nsentences();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.OverallConceptsEventImpl <em>Overall Concepts Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.OverallConceptsEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getOverallConceptsEvent()
		 * @generated
		 */
		EClass OVERALL_CONCEPTS_EVENT = eINSTANCE.getOverallConceptsEvent();

		/**
		 * The meta object literal for the '<em><b>Nconcepts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OVERALL_CONCEPTS_EVENT__NCONCEPTS = eINSTANCE.getOverallConceptsEvent_Nconcepts();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.SubstitutedConceptsEventImpl <em>Substituted Concepts Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.SubstitutedConceptsEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getSubstitutedConceptsEvent()
		 * @generated
		 */
		EClass SUBSTITUTED_CONCEPTS_EVENT = eINSTANCE.getSubstitutedConceptsEvent();

		/**
		 * The meta object literal for the '<em><b>Nconcepts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSTITUTED_CONCEPTS_EVENT__NCONCEPTS = eINSTANCE.getSubstitutedConceptsEvent_Nconcepts();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.DeletedConceptsEventImpl <em>Deleted Concepts Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.DeletedConceptsEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getDeletedConceptsEvent()
		 * @generated
		 */
		EClass DELETED_CONCEPTS_EVENT = eINSTANCE.getDeletedConceptsEvent();

		/**
		 * The meta object literal for the '<em><b>Nconcepts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELETED_CONCEPTS_EVENT__NCONCEPTS = eINSTANCE.getDeletedConceptsEvent_Nconcepts();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.InsertedConceptsEventImpl <em>Inserted Concepts Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.InsertedConceptsEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getInsertedConceptsEvent()
		 * @generated
		 */
		EClass INSERTED_CONCEPTS_EVENT = eINSTANCE.getInsertedConceptsEvent();

		/**
		 * The meta object literal for the '<em><b>Nconcepts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERTED_CONCEPTS_EVENT__NCONCEPTS = eINSTANCE.getInsertedConceptsEvent_Nconcepts();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.CorrectlyParsedUtteranceEventImpl <em>Correctly Parsed Utterance Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.CorrectlyParsedUtteranceEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getCorrectlyParsedUtteranceEvent()
		 * @generated
		 */
		EClass CORRECTLY_PARSED_UTTERANCE_EVENT = eINSTANCE.getCorrectlyParsedUtteranceEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.PartiallyParsedUtteranceEventImpl <em>Partially Parsed Utterance Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.PartiallyParsedUtteranceEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getPartiallyParsedUtteranceEvent()
		 * @generated
		 */
		EClass PARTIALLY_PARSED_UTTERANCE_EVENT = eINSTANCE.getPartiallyParsedUtteranceEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.IncorrectlyParsedUtteranceEventImpl <em>Incorrectly Parsed Utterance Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.IncorrectlyParsedUtteranceEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getIncorrectlyParsedUtteranceEvent()
		 * @generated
		 */
		EClass INCORRECTLY_PARSED_UTTERANCE_EVENT = eINSTANCE.getIncorrectlyParsedUtteranceEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.NewElementsEventImpl <em>New Elements Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.NewElementsEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getNewElementsEvent()
		 * @generated
		 */
		EClass NEW_ELEMENTS_EVENT = eINSTANCE.getNewElementsEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.NewFeedbackElementsEventImpl <em>New Feedback Elements Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.NewFeedbackElementsEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getNewFeedbackElementsEvent()
		 * @generated
		 */
		EClass NEW_FEEDBACK_ELEMENTS_EVENT = eINSTANCE.getNewFeedbackElementsEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.NewConceptsEventImpl <em>New Concepts Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.NewConceptsEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getNewConceptsEvent()
		 * @generated
		 */
		EClass NEW_CONCEPTS_EVENT = eINSTANCE.getNewConceptsEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.NewNoiseEventImpl <em>New Noise Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.NewNoiseEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getNewNoiseEvent()
		 * @generated
		 */
		EClass NEW_NOISE_EVENT = eINSTANCE.getNewNoiseEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.NewQuestionsEventImpl <em>New Questions Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.NewQuestionsEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getNewQuestionsEvent()
		 * @generated
		 */
		EClass NEW_QUESTIONS_EVENT = eINSTANCE.getNewQuestionsEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.HelpTurnEventImpl <em>Help Turn Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.HelpTurnEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getHelpTurnEvent()
		 * @generated
		 */
		EClass HELP_TURN_EVENT = eINSTANCE.getHelpTurnEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.CorrectionTurnEventImpl <em>Correction Turn Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.CorrectionTurnEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getCorrectionTurnEvent()
		 * @generated
		 */
		EClass CORRECTION_TURN_EVENT = eINSTANCE.getCorrectionTurnEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.CancelTurnEventImpl <em>Cancel Turn Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.CancelTurnEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getCancelTurnEvent()
		 * @generated
		 */
		EClass CANCEL_TURN_EVENT = eINSTANCE.getCancelTurnEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.RestartTurnEventImpl <em>Restart Turn Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.RestartTurnEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getRestartTurnEvent()
		 * @generated
		 */
		EClass RESTART_TURN_EVENT = eINSTANCE.getRestartTurnEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.BargeinEventImpl <em>Bargein Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.BargeinEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getBargeinEvent()
		 * @generated
		 */
		EClass BARGEIN_EVENT = eINSTANCE.getBargeinEvent();

		/**
		 * The meta object literal for the '<em><b>Successful</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BARGEIN_EVENT__SUCCESSFUL = eINSTANCE.getBargeinEvent_Successful();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.DIVRejectionEventImpl <em>DIV Rejection Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.DIVRejectionEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getDIVRejectionEvent()
		 * @generated
		 */
		EClass DIV_REJECTION_EVENT = eINSTANCE.getDIVRejectionEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.ASRRejectionEventImpl <em>ASR Rejection Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.ASRRejectionEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getASRRejectionEvent()
		 * @generated
		 */
		EClass ASR_REJECTION_EVENT = eINSTANCE.getASRRejectionEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.GRRejectionEventImpl <em>GR Rejection Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.GRRejectionEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getGRRejectionEvent()
		 * @generated
		 */
		EClass GR_REJECTION_EVENT = eINSTANCE.getGRRejectionEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.TimeoutEventImpl <em>Timeout Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.TimeoutEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getTimeoutEvent()
		 * @generated
		 */
		EClass TIMEOUT_EVENT = eINSTANCE.getTimeoutEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.AppStartEventImpl <em>App Start Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.AppStartEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getAppStartEvent()
		 * @generated
		 */
		EClass APP_START_EVENT = eINSTANCE.getAppStartEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.AppEndEventImpl <em>App End Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.AppEndEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getAppEndEvent()
		 * @generated
		 */
		EClass APP_END_EVENT = eINSTANCE.getAppEndEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.StartDialogueEventImpl <em>Start Dialogue Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.StartDialogueEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getStartDialogueEvent()
		 * @generated
		 */
		EClass START_DIALOGUE_EVENT = eINSTANCE.getStartDialogueEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.EndDialogueEventImpl <em>End Dialogue Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.EndDialogueEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getEndDialogueEvent()
		 * @generated
		 */
		EClass END_DIALOGUE_EVENT = eINSTANCE.getEndDialogueEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.StartSystemTurnEventImpl <em>Start System Turn Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.StartSystemTurnEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getStartSystemTurnEvent()
		 * @generated
		 */
		EClass START_SYSTEM_TURN_EVENT = eINSTANCE.getStartSystemTurnEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.EndSystemTurnEventImpl <em>End System Turn Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.EndSystemTurnEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getEndSystemTurnEvent()
		 * @generated
		 */
		EClass END_SYSTEM_TURN_EVENT = eINSTANCE.getEndSystemTurnEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.StartUserTurnEventImpl <em>Start User Turn Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.StartUserTurnEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getStartUserTurnEvent()
		 * @generated
		 */
		EClass START_USER_TURN_EVENT = eINSTANCE.getStartUserTurnEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.EndUserTurnEventImpl <em>End User Turn Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.EndUserTurnEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getEndUserTurnEvent()
		 * @generated
		 */
		EClass END_USER_TURN_EVENT = eINSTANCE.getEndUserTurnEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.SystemFeedbackStartEventImpl <em>System Feedback Start Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.SystemFeedbackStartEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getSystemFeedbackStartEvent()
		 * @generated
		 */
		EClass SYSTEM_FEEDBACK_START_EVENT = eINSTANCE.getSystemFeedbackStartEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.SystemActionStartEventImpl <em>System Action Start Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.SystemActionStartEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getSystemActionStartEvent()
		 * @generated
		 */
		EClass SYSTEM_ACTION_START_EVENT = eINSTANCE.getSystemActionStartEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.SystemActionEndEventImpl <em>System Action End Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.SystemActionEndEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getSystemActionEndEvent()
		 * @generated
		 */
		EClass SYSTEM_ACTION_END_EVENT = eINSTANCE.getSystemActionEndEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.UserFeedbackStartEventImpl <em>User Feedback Start Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.UserFeedbackStartEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getUserFeedbackStartEvent()
		 * @generated
		 */
		EClass USER_FEEDBACK_START_EVENT = eINSTANCE.getUserFeedbackStartEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.UserActionStartEventImpl <em>User Action Start Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.UserActionStartEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getUserActionStartEvent()
		 * @generated
		 */
		EClass USER_ACTION_START_EVENT = eINSTANCE.getUserActionStartEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.impl.UserActionEndEventImpl <em>User Action End Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.impl.UserActionEndEventImpl
		 * @see org.mmi.events.impl.EventsPackageImpl#getUserActionEndEvent()
		 * @generated
		 */
		EClass USER_ACTION_END_EVENT = eINSTANCE.getUserActionEndEvent();

		/**
		 * The meta object literal for the '{@link org.mmi.events.event_t <em>event t</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.events.event_t
		 * @see org.mmi.events.impl.EventsPackageImpl#getevent_t()
		 * @generated
		 */
		EEnum EVENT_T = eINSTANCE.getevent_t();

	}

} //EventsPackage
