/**
 */
package org.carim.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.carim.model.carimModelFactory
 * @model kind="package"
 * @generated
 */
public interface carimModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org/carimModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	carimModelPackage eINSTANCE = org.carim.model.impl.carimModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.carim.model.impl.AttitudeImpl <em>Attitude</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.impl.AttitudeImpl
	 * @see org.carim.model.impl.carimModelPackageImpl#getAttitude()
	 * @generated
	 */
	int ATTITUDE = 0;

	/**
	 * The number of structural features of the '<em>Attitude</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTITUDE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.carim.model.impl.AvmImpl <em>Avm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.impl.AvmImpl
	 * @see org.carim.model.impl.carimModelPackageImpl#getAvm()
	 * @generated
	 */
	int AVM = 1;

	/**
	 * The number of structural features of the '<em>Avm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVM_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.carim.model.impl.CommunicationContextImpl <em>Communication Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.impl.CommunicationContextImpl
	 * @see org.carim.model.impl.carimModelPackageImpl#getCommunicationContext()
	 * @generated
	 */
	int COMMUNICATION_CONTEXT = 2;

	/**
	 * The feature id for the '<em><b>Wireless Access Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_CONTEXT__WIRELESS_ACCESS_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Access Point Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_CONTEXT__ACCESS_POINT_NAME = 1;

	/**
	 * The feature id for the '<em><b>Signal Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_CONTEXT__SIGNAL_STRENGTH = 2;

	/**
	 * The feature id for the '<em><b>Received Data Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_CONTEXT__RECEIVED_DATA_THROUGHPUT = 3;

	/**
	 * The feature id for the '<em><b>Sent Data Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_CONTEXT__SENT_DATA_THROUGHPUT = 4;

	/**
	 * The feature id for the '<em><b>Rtt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_CONTEXT__RTT = 5;

	/**
	 * The feature id for the '<em><b>Srt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_CONTEXT__SRT = 6;

	/**
	 * The number of structural features of the '<em>Communication Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_CONTEXT_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.carim.model.impl.CooperativityImpl <em>Cooperativity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.impl.CooperativityImpl
	 * @see org.carim.model.impl.carimModelPackageImpl#getCooperativity()
	 * @generated
	 */
	int COOPERATIVITY = 3;

	/**
	 * The feature id for the '<em><b>Contextual Appropriateness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOPERATIVITY__CONTEXTUAL_APPROPRIATENESS = 0;

	/**
	 * The number of structural features of the '<em>Cooperativity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOPERATIVITY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.carim.model.impl.DateTimeTImpl <em>Date Time T</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.impl.DateTimeTImpl
	 * @see org.carim.model.impl.carimModelPackageImpl#getDateTimeT()
	 * @generated
	 */
	int DATE_TIME_T = 4;

	/**
	 * The feature id for the '<em><b>DDay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_T__DDAY = 0;

	/**
	 * The feature id for the '<em><b>DMonth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_T__DMONTH = 1;

	/**
	 * The feature id for the '<em><b>DYear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_T__DYEAR = 2;

	/**
	 * The feature id for the '<em><b>THours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_T__THOURS = 3;

	/**
	 * The feature id for the '<em><b>TMins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_T__TMINS = 4;

	/**
	 * The feature id for the '<em><b>TSecs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_T__TSECS = 5;

	/**
	 * The number of structural features of the '<em>Date Time T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_T_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.carim.model.impl.DeviceContextImpl <em>Device Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.impl.DeviceContextImpl
	 * @see org.carim.model.impl.carimModelPackageImpl#getDeviceContext()
	 * @generated
	 */
	int DEVICE_CONTEXT = 5;

	/**
	 * The feature id for the '<em><b>Device Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_CONTEXT__DEVICE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Screen Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_CONTEXT__SCREEN_SIZE = 1;

	/**
	 * The feature id for the '<em><b>Screen Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_CONTEXT__SCREEN_RESOLUTION = 2;

	/**
	 * The feature id for the '<em><b>Screen Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_CONTEXT__SCREEN_ORIENTATION = 3;

	/**
	 * The feature id for the '<em><b>Screen Brightness Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_CONTEXT__SCREEN_BRIGHTNESS_LEVEL = 4;

	/**
	 * The feature id for the '<em><b>Volume Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_CONTEXT__VOLUME_LEVEL = 5;

	/**
	 * The feature id for the '<em><b>Memory Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_CONTEXT__MEMORY_USAGE = 6;

	/**
	 * The feature id for the '<em><b>Cpu Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_CONTEXT__CPU_USAGE = 7;

	/**
	 * The number of structural features of the '<em>Device Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_CONTEXT_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.carim.model.impl.DialogueImpl <em>Dialogue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.impl.DialogueImpl
	 * @see org.carim.model.impl.carimModelPackageImpl#getDialogue()
	 * @generated
	 */
	int DIALOGUE = 6;

	/**
	 * The feature id for the '<em><b>Base Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOGUE__BASE_TIMESTAMP = 0;

	/**
	 * The feature id for the '<em><b>Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOGUE__TASK = 1;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOGUE__STEP = 2;

	/**
	 * The number of structural features of the '<em>Dialogue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOGUE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.carim.model.impl.DialogueStepTImpl <em>Dialogue Step T</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.impl.DialogueStepTImpl
	 * @see org.carim.model.impl.carimModelPackageImpl#getDialogueStepT()
	 * @generated
	 */
	int DIALOGUE_STEP_T = 7;

	/**
	 * The feature id for the '<em><b>System Turn</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOGUE_STEP_T__SYSTEM_TURN = 0;

	/**
	 * The feature id for the '<em><b>User Turn</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOGUE_STEP_T__USER_TURN = 1;

	/**
	 * The number of structural features of the '<em>Dialogue Step T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOGUE_STEP_T_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.carim.model.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.impl.DocumentRootImpl
	 * @see org.carim.model.impl.carimModelPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 8;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Trial</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRIAL = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.carim.model.impl.DynamicContextImpl <em>Dynamic Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.impl.DynamicContextImpl
	 * @see org.carim.model.impl.carimModelPackageImpl#getDynamicContext()
	 * @generated
	 */
	int DYNAMIC_CONTEXT = 9;

	/**
	 * The feature id for the '<em><b>Physical Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_CONTEXT__PHYSICAL_CONTEXT = 0;

	/**
	 * The feature id for the '<em><b>Social Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_CONTEXT__SOCIAL_CONTEXT = 1;

	/**
	 * The feature id for the '<em><b>Location Time Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_CONTEXT__LOCATION_TIME_CONTEXT = 2;

	/**
	 * The feature id for the '<em><b>Device Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_CONTEXT__DEVICE_CONTEXT = 3;

	/**
	 * The feature id for the '<em><b>Communication Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_CONTEXT__COMMUNICATION_CONTEXT = 4;

	/**
	 * The number of structural features of the '<em>Dynamic Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_CONTEXT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.carim.model.impl.GuiInputImpl <em>Gui Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.impl.GuiInputImpl
	 * @see org.carim.model.impl.carimModelPackageImpl#getGuiInput()
	 * @generated
	 */
	int GUI_INPUT = 10;

	/**
	 * The feature id for the '<em><b>Text Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_INPUT__TEXT_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Navigation Actions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_INPUT__NAVIGATION_ACTIONS = 1;

	/**
	 * The feature id for the '<em><b>Navigation Moves</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_INPUT__NAVIGATION_MOVES = 2;

	/**
	 * The feature id for the '<em><b>Navigation Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_INPUT__NAVIGATION_LENGTH = 3;

	/**
	 * The feature id for the '<em><b>Exploring Actions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_INPUT__EXPLORING_ACTIONS = 4;

	/**
	 * The feature id for the '<em><b>Transferring Actions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_INPUT__TRANSFERRING_ACTIONS = 5;

	/**
	 * The number of structural features of the '<em>Gui Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_INPUT_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.carim.model.impl.LocationTimeContextImpl <em>Location Time Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.impl.LocationTimeContextImpl
	 * @see org.carim.model.impl.carimModelPackageImpl#getLocationTimeContext()
	 * @generated
	 */
	int LOCATION_TIME_CONTEXT = 11;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TIME_CONTEXT__LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Geo Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TIME_CONTEXT__GEO_LATITUDE = 1;

	/**
	 * The feature id for the '<em><b>Geo Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TIME_CONTEXT__GEO_LONGITUDE = 2;

	/**
	 * The feature id for the '<em><b>Mobility Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TIME_CONTEXT__MOBILITY_LEVEL = 3;

	/**
	 * The feature id for the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TIME_CONTEXT__TIME = 4;

	/**
	 * The number of structural features of the '<em>Location Time Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TIME_CONTEXT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.carim.model.impl.MetacommImpl <em>Metacomm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.impl.MetacommImpl
	 * @see org.carim.model.impl.carimModelPackageImpl#getMetacomm()
	 * @generated
	 */
	int METACOMM = 12;

	/**
	 * The feature id for the '<em><b>Is Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METACOMM__IS_HELP = 0;

	/**
	 * The feature id for the '<em><b>Is Correction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METACOMM__IS_CORRECTION = 1;

	/**
	 * The number of structural features of the '<em>Metacomm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METACOMM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.carim.model.impl.ModalityAppropriatenessImpl <em>Modality Appropriateness</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.impl.ModalityAppropriatenessImpl
	 * @see org.carim.model.impl.carimModelPackageImpl#getModalityAppropriateness()
	 * @generated
	 */
	int MODALITY_APPROPRIATENESS = 13;

	/**
	 * The feature id for the '<em><b>Appropriateness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODALITY_APPROPRIATENESS__APPROPRIATENESS = 0;

	/**
	 * The number of structural features of the '<em>Modality Appropriateness</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODALITY_APPROPRIATENESS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.carim.model.impl.ModalityChangeImpl <em>Modality Change</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.impl.ModalityChangeImpl
	 * @see org.carim.model.impl.carimModelPackageImpl#getModalityChange()
	 * @generated
	 */
	int MODALITY_CHANGE = 14;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODALITY_CHANGE__ORIGIN = 0;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODALITY_CHANGE__REASON = 1;

	/**
	 * The number of structural features of the '<em>Modality Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODALITY_CHANGE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.carim.model.impl.ModalityInfoImpl <em>Modality Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.impl.ModalityInfoImpl
	 * @see org.carim.model.impl.carimModelPackageImpl#getModalityInfo()
	 * @generated
	 */
	int MODALITY_INFO = 15;

	/**
	 * The feature id for the '<em><b>Modality Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODALITY_INFO__MODALITY_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Mminteraction Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODALITY_INFO__MMINTERACTION_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Appropriateness</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODALITY_INFO__APPROPRIATENESS = 2;

	/**
	 * The feature id for the '<em><b>Synchroni</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODALITY_INFO__SYNCHRONI = 3;

	/**
	 * The feature id for the '<em><b>Change</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODALITY_INFO__CHANGE = 4;

	/**
	 * The number of structural features of the '<em>Modality Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODALITY_INFO_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.carim.model.impl.ModalitySynchroniImpl <em>Modality Synchroni</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.impl.ModalitySynchroniImpl
	 * @see org.carim.model.impl.carimModelPackageImpl#getModalitySynchroni()
	 * @generated
	 */
	int MODALITY_SYNCHRONI = 16;

	/**
	 * The feature id for the '<em><b>Nlags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODALITY_SYNCHRONI__NLAGS = 0;

	/**
	 * The feature id for the '<em><b>Lagtime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODALITY_SYNCHRONI__LAGTIME = 1;

	/**
	 * The feature id for the '<em><b>Nevents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODALITY_SYNCHRONI__NEVENTS = 2;

	/**
	 * The number of structural features of the '<em>Modality Synchroni</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODALITY_SYNCHRONI_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.carim.model.impl.MotionInputImpl <em>Motion Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.impl.MotionInputImpl
	 * @see org.carim.model.impl.carimModelPackageImpl#getMotionInput()
	 * @generated
	 */
	int MOTION_INPUT = 17;

	/**
	 * The feature id for the '<em><b>Tilt Movements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION_INPUT__TILT_MOVEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Twist Movements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION_INPUT__TWIST_MOVEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Shake Movements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION_INPUT__SHAKE_MOVEMENTS = 2;

	/**
	 * The number of structural features of the '<em>Motion Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION_INPUT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.carim.model.impl.PhysicalContextImpl <em>Physical Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.impl.PhysicalContextImpl
	 * @see org.carim.model.impl.carimModelPackageImpl#getPhysicalContext()
	 * @generated
	 */
	int PHYSICAL_CONTEXT = 18;

	/**
	 * The feature id for the '<em><b>Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONTEXT__TEMPERATURE = 0;

	/**
	 * The feature id for the '<em><b>Weather</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONTEXT__WEATHER = 1;

	/**
	 * The feature id for the '<em><b>Noise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONTEXT__NOISE = 2;

	/**
	 * The feature id for the '<em><b>Light</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONTEXT__LIGHT = 3;

	/**
	 * The number of structural features of the '<em>Physical Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONTEXT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.carim.model.impl.SocialContextImpl <em>Social Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.impl.SocialContextImpl
	 * @see org.carim.model.impl.carimModelPackageImpl#getSocialContext()
	 * @generated
	 */
	int SOCIAL_CONTEXT = 19;

	/**
	 * The feature id for the '<em><b>Company</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_CONTEXT__COMPANY = 0;

	/**
	 * The feature id for the '<em><b>Arena</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_CONTEXT__ARENA = 1;

	/**
	 * The number of structural features of the '<em>Social Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_CONTEXT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.carim.model.impl.SpeechInputImpl <em>Speech Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.impl.SpeechInputImpl
	 * @see org.carim.model.impl.carimModelPackageImpl#getSpeechInput()
	 * @generated
	 */
	int SPEECH_INPUT = 20;

	/**
	 * The feature id for the '<em><b>Overall Words</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_INPUT__OVERALL_WORDS = 0;

	/**
	 * The feature id for the '<em><b>Substituted Words</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_INPUT__SUBSTITUTED_WORDS = 1;

	/**
	 * The feature id for the '<em><b>Deleted Words</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_INPUT__DELETED_WORDS = 2;

	/**
	 * The feature id for the '<em><b>Inserted Words</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_INPUT__INSERTED_WORDS = 3;

	/**
	 * The feature id for the '<em><b>Overall Sentences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_INPUT__OVERALL_SENTENCES = 4;

	/**
	 * The feature id for the '<em><b>Substituted Sentences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_INPUT__SUBSTITUTED_SENTENCES = 5;

	/**
	 * The feature id for the '<em><b>Deleted Sentences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_INPUT__DELETED_SENTENCES = 6;

	/**
	 * The feature id for the '<em><b>Inserted Sentences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_INPUT__INSERTED_SENTENCES = 7;

	/**
	 * The feature id for the '<em><b>Overall Concepts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_INPUT__OVERALL_CONCEPTS = 8;

	/**
	 * The feature id for the '<em><b>Substituted Concepts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_INPUT__SUBSTITUTED_CONCEPTS = 9;

	/**
	 * The feature id for the '<em><b>Deleted Concepts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_INPUT__DELETED_CONCEPTS = 10;

	/**
	 * The feature id for the '<em><b>Inserted Concepts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_INPUT__INSERTED_CONCEPTS = 11;

	/**
	 * The feature id for the '<em><b>Parsing Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_INPUT__PARSING_RESULT = 12;

	/**
	 * The number of structural features of the '<em>Speech Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_INPUT_FEATURE_COUNT = 13;

	/**
	 * The meta object id for the '{@link org.carim.model.impl.SpeechOutputImpl <em>Speech Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.impl.SpeechOutputImpl
	 * @see org.carim.model.impl.carimModelPackageImpl#getSpeechOutput()
	 * @generated
	 */
	int SPEECH_OUTPUT = 21;

	/**
	 * The feature id for the '<em><b>ANCO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_OUTPUT__ANCO = 0;

	/**
	 * The feature id for the '<em><b>ANIN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_OUTPUT__ANIN = 1;

	/**
	 * The feature id for the '<em><b>ANPA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_OUTPUT__ANPA = 2;

	/**
	 * The feature id for the '<em><b>ANFA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_OUTPUT__ANFA = 3;

	/**
	 * The feature id for the '<em><b>Prompt Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_OUTPUT__PROMPT_TYPE = 4;

	/**
	 * The number of structural features of the '<em>Speech Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_OUTPUT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.carim.model.impl.SystemMetacommImpl <em>System Metacomm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.impl.SystemMetacommImpl
	 * @see org.carim.model.impl.carimModelPackageImpl#getSystemMetacomm()
	 * @generated
	 */
	int SYSTEM_METACOMM = 22;

	/**
	 * The feature id for the '<em><b>Is Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_METACOMM__IS_HELP = METACOMM__IS_HELP;

	/**
	 * The feature id for the '<em><b>Is Correction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_METACOMM__IS_CORRECTION = METACOMM__IS_CORRECTION;

	/**
	 * The feature id for the '<em><b>Is ASR Reject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_METACOMM__IS_ASR_REJECT = METACOMM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is DIV Reject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_METACOMM__IS_DIV_REJECT = METACOMM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is GR Reject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_METACOMM__IS_GR_REJECT = METACOMM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>System Metacomm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_METACOMM_FEATURE_COUNT = METACOMM_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.carim.model.impl.TurnImpl <em>Turn</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.impl.TurnImpl
	 * @see org.carim.model.impl.carimModelPackageImpl#getTurn()
	 * @generated
	 */
	int TURN = 26;

	/**
	 * The feature id for the '<em><b>Feedback Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN__FEEDBACK_DELAY = 0;

	/**
	 * The feature id for the '<em><b>Feedback Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN__FEEDBACK_DURATION = 1;

	/**
	 * The feature id for the '<em><b>Action Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN__ACTION_DURATION = 2;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN__ELEMENTS = 3;

	/**
	 * The feature id for the '<em><b>Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN__FEEDBACK = 4;

	/**
	 * The feature id for the '<em><b>Concepts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN__CONCEPTS = 5;

	/**
	 * The feature id for the '<em><b>Noise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN__NOISE = 6;

	/**
	 * The feature id for the '<em><b>Questions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN__QUESTIONS = 7;

	/**
	 * The feature id for the '<em><b>Modality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN__MODALITY = 8;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN__CONTEXT = 9;

	/**
	 * The number of structural features of the '<em>Turn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.carim.model.impl.SystemTurnImpl <em>System Turn</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.impl.SystemTurnImpl
	 * @see org.carim.model.impl.carimModelPackageImpl#getSystemTurn()
	 * @generated
	 */
	int SYSTEM_TURN = 23;

	/**
	 * The feature id for the '<em><b>Feedback Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TURN__FEEDBACK_DELAY = TURN__FEEDBACK_DELAY;

	/**
	 * The feature id for the '<em><b>Feedback Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TURN__FEEDBACK_DURATION = TURN__FEEDBACK_DURATION;

	/**
	 * The feature id for the '<em><b>Action Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TURN__ACTION_DURATION = TURN__ACTION_DURATION;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TURN__ELEMENTS = TURN__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TURN__FEEDBACK = TURN__FEEDBACK;

	/**
	 * The feature id for the '<em><b>Concepts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TURN__CONCEPTS = TURN__CONCEPTS;

	/**
	 * The feature id for the '<em><b>Noise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TURN__NOISE = TURN__NOISE;

	/**
	 * The feature id for the '<em><b>Questions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TURN__QUESTIONS = TURN__QUESTIONS;

	/**
	 * The feature id for the '<em><b>Modality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TURN__MODALITY = TURN__MODALITY;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TURN__CONTEXT = TURN__CONTEXT;

	/**
	 * The feature id for the '<em><b>Metacomm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TURN__METACOMM = TURN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Speech Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TURN__SPEECH_OUTPUT = TURN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cooperativity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TURN__COOPERATIVITY = TURN_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>System Turn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TURN_FEATURE_COUNT = TURN_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.carim.model.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.impl.TaskImpl
	 * @see org.carim.model.impl.carimModelPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 24;

	/**
	 * The feature id for the '<em><b>Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__SUCCESS = 0;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__REASON = 1;

	/**
	 * The feature id for the '<em><b>Avm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__AVM = 2;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.carim.model.impl.TrialImpl <em>Trial</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.impl.TrialImpl
	 * @see org.carim.model.impl.carimModelPackageImpl#getTrial()
	 * @generated
	 */
	int TRIAL = 25;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIAL__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>User Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIAL__USER_DATA = 1;

	/**
	 * The feature id for the '<em><b>Dialogues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIAL__DIALOGUES = 2;

	/**
	 * The number of structural features of the '<em>Trial</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIAL_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.carim.model.impl.UserAttitudeImpl <em>User Attitude</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.impl.UserAttitudeImpl
	 * @see org.carim.model.impl.carimModelPackageImpl#getUserAttitude()
	 * @generated
	 */
	int USER_ATTITUDE = 27;

	/**
	 * The feature id for the '<em><b>Usefulness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTITUDE__USEFULNESS = 0;

	/**
	 * The feature id for the '<em><b>Pleasantness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTITUDE__PLEASANTNESS = 1;

	/**
	 * The feature id for the '<em><b>Integration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTITUDE__INTEGRATION = 2;

	/**
	 * The feature id for the '<em><b>Self Efficacy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTITUDE__SELF_EFFICACY = 3;

	/**
	 * The feature id for the '<em><b>Comfort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTITUDE__COMFORT = 4;

	/**
	 * The number of structural features of the '<em>User Attitude</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTITUDE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.carim.model.impl.UserDataImpl <em>User Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.impl.UserDataImpl
	 * @see org.carim.model.impl.carimModelPackageImpl#getUserData()
	 * @generated
	 */
	int USER_DATA = 28;

	/**
	 * The feature id for the '<em><b>User Ratings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DATA__USER_RATINGS = 0;

	/**
	 * The feature id for the '<em><b>User Mood</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DATA__USER_MOOD = 1;

	/**
	 * The feature id for the '<em><b>User Attitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DATA__USER_ATTITUDE = 2;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DATA__AGE = 3;

	/**
	 * The feature id for the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DATA__GENDER = 4;

	/**
	 * The feature id for the '<em><b>Education Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DATA__EDUCATION_LEVEL = 5;

	/**
	 * The feature id for the '<em><b>Previous Experience</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DATA__PREVIOUS_EXPERIENCE = 6;

	/**
	 * The number of structural features of the '<em>User Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DATA_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.carim.model.impl.UserMetacommImpl <em>User Metacomm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.impl.UserMetacommImpl
	 * @see org.carim.model.impl.carimModelPackageImpl#getUserMetacomm()
	 * @generated
	 */
	int USER_METACOMM = 29;

	/**
	 * The feature id for the '<em><b>Is Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_METACOMM__IS_HELP = METACOMM__IS_HELP;

	/**
	 * The feature id for the '<em><b>Is Correction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_METACOMM__IS_CORRECTION = METACOMM__IS_CORRECTION;

	/**
	 * The feature id for the '<em><b>Is Time Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_METACOMM__IS_TIME_OUT = METACOMM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Cancel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_METACOMM__IS_CANCEL = METACOMM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Restart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_METACOMM__IS_RESTART = METACOMM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Bargein</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_METACOMM__IS_BARGEIN = METACOMM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Successful Bargein</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_METACOMM__IS_SUCCESSFUL_BARGEIN = METACOMM_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>User Metacomm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_METACOMM_FEATURE_COUNT = METACOMM_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.carim.model.impl.UserRatingsImpl <em>User Ratings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.impl.UserRatingsImpl
	 * @see org.carim.model.impl.carimModelPackageImpl#getUserRatings()
	 * @generated
	 */
	int USER_RATINGS = 30;

	/**
	 * The feature id for the '<em><b>Practical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_RATINGS__PRACTICAL = 0;

	/**
	 * The feature id for the '<em><b>Predictable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_RATINGS__PREDICTABLE = 1;

	/**
	 * The feature id for the '<em><b>Clearly Structured</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_RATINGS__CLEARLY_STRUCTURED = 2;

	/**
	 * The feature id for the '<em><b>Simple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_RATINGS__SIMPLE = 3;

	/**
	 * The feature id for the '<em><b>Stylish</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_RATINGS__STYLISH = 4;

	/**
	 * The feature id for the '<em><b>Premium</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_RATINGS__PREMIUM = 5;

	/**
	 * The feature id for the '<em><b>Creative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_RATINGS__CREATIVE = 6;

	/**
	 * The feature id for the '<em><b>Captivating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_RATINGS__CAPTIVATING = 7;

	/**
	 * The feature id for the '<em><b>Beautiful</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_RATINGS__BEAUTIFUL = 8;

	/**
	 * The feature id for the '<em><b>Good</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_RATINGS__GOOD = 9;

	/**
	 * The number of structural features of the '<em>User Ratings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_RATINGS_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.carim.model.impl.UserTurnImpl <em>User Turn</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.impl.UserTurnImpl
	 * @see org.carim.model.impl.carimModelPackageImpl#getUserTurn()
	 * @generated
	 */
	int USER_TURN = 31;

	/**
	 * The feature id for the '<em><b>Feedback Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TURN__FEEDBACK_DELAY = TURN__FEEDBACK_DELAY;

	/**
	 * The feature id for the '<em><b>Feedback Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TURN__FEEDBACK_DURATION = TURN__FEEDBACK_DURATION;

	/**
	 * The feature id for the '<em><b>Action Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TURN__ACTION_DURATION = TURN__ACTION_DURATION;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TURN__ELEMENTS = TURN__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TURN__FEEDBACK = TURN__FEEDBACK;

	/**
	 * The feature id for the '<em><b>Concepts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TURN__CONCEPTS = TURN__CONCEPTS;

	/**
	 * The feature id for the '<em><b>Noise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TURN__NOISE = TURN__NOISE;

	/**
	 * The feature id for the '<em><b>Questions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TURN__QUESTIONS = TURN__QUESTIONS;

	/**
	 * The feature id for the '<em><b>Modality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TURN__MODALITY = TURN__MODALITY;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TURN__CONTEXT = TURN__CONTEXT;

	/**
	 * The feature id for the '<em><b>Metacomm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TURN__METACOMM = TURN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Speech Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TURN__SPEECH_INPUT = TURN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gui Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TURN__GUI_INPUT = TURN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Motion Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TURN__MOTION_INPUT = TURN_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>User Turn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TURN_FEATURE_COUNT = TURN_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.carim.model.ContextualAppropriatenessT <em>Contextual Appropriateness T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.ContextualAppropriatenessT
	 * @see org.carim.model.impl.carimModelPackageImpl#getContextualAppropriatenessT()
	 * @generated
	 */
	int CONTEXTUAL_APPROPRIATENESS_T = 32;

	/**
	 * The meta object id for the '{@link org.carim.model.DeviceTypeT <em>Device Type T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.DeviceTypeT
	 * @see org.carim.model.impl.carimModelPackageImpl#getDeviceTypeT()
	 * @generated
	 */
	int DEVICE_TYPE_T = 33;

	/**
	 * The meta object id for the '{@link org.carim.model.EducationLevelT <em>Education Level T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.EducationLevelT
	 * @see org.carim.model.impl.carimModelPackageImpl#getEducationLevelT()
	 * @generated
	 */
	int EDUCATION_LEVEL_T = 34;

	/**
	 * The meta object id for the '{@link org.carim.model.GenderT <em>Gender T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.GenderT
	 * @see org.carim.model.impl.carimModelPackageImpl#getGenderT()
	 * @generated
	 */
	int GENDER_T = 35;

	/**
	 * The meta object id for the '{@link org.carim.model.LocationT <em>Location T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.LocationT
	 * @see org.carim.model.impl.carimModelPackageImpl#getLocationT()
	 * @generated
	 */
	int LOCATION_T = 36;

	/**
	 * The meta object id for the '{@link org.carim.model.McReasonT <em>Mc Reason T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.McReasonT
	 * @see org.carim.model.impl.carimModelPackageImpl#getMcReasonT()
	 * @generated
	 */
	int MC_REASON_T = 37;

	/**
	 * The meta object id for the '{@link org.carim.model.MmiTypeT <em>Mmi Type T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.MmiTypeT
	 * @see org.carim.model.impl.carimModelPackageImpl#getMmiTypeT()
	 * @generated
	 */
	int MMI_TYPE_T = 38;

	/**
	 * The meta object id for the '{@link org.carim.model.MobilityLevelT <em>Mobility Level T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.MobilityLevelT
	 * @see org.carim.model.impl.carimModelPackageImpl#getMobilityLevelT()
	 * @generated
	 */
	int MOBILITY_LEVEL_T = 39;

	/**
	 * The meta object id for the '{@link org.carim.model.ModAppropT <em>Mod Approp T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.ModAppropT
	 * @see org.carim.model.impl.carimModelPackageImpl#getModAppropT()
	 * @generated
	 */
	int MOD_APPROP_T = 40;

	/**
	 * The meta object id for the '{@link org.carim.model.ModTypeT <em>Mod Type T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.ModTypeT
	 * @see org.carim.model.impl.carimModelPackageImpl#getModTypeT()
	 * @generated
	 */
	int MOD_TYPE_T = 41;

	/**
	 * The meta object id for the '{@link org.carim.model.ParsingResultT <em>Parsing Result T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.ParsingResultT
	 * @see org.carim.model.impl.carimModelPackageImpl#getParsingResultT()
	 * @generated
	 */
	int PARSING_RESULT_T = 42;

	/**
	 * The meta object id for the '{@link org.carim.model.PreviousExperienceT <em>Previous Experience T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.PreviousExperienceT
	 * @see org.carim.model.impl.carimModelPackageImpl#getPreviousExperienceT()
	 * @generated
	 */
	int PREVIOUS_EXPERIENCE_T = 43;

	/**
	 * The meta object id for the '{@link org.carim.model.PromptTypeT <em>Prompt Type T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.PromptTypeT
	 * @see org.carim.model.impl.carimModelPackageImpl#getPromptTypeT()
	 * @generated
	 */
	int PROMPT_TYPE_T = 44;

	/**
	 * The meta object id for the '{@link org.carim.model.RoleT <em>Role T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.RoleT
	 * @see org.carim.model.impl.carimModelPackageImpl#getRoleT()
	 * @generated
	 */
	int ROLE_T = 45;

	/**
	 * The meta object id for the '{@link org.carim.model.ScreenOrientationT <em>Screen Orientation T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.ScreenOrientationT
	 * @see org.carim.model.impl.carimModelPackageImpl#getScreenOrientationT()
	 * @generated
	 */
	int SCREEN_ORIENTATION_T = 46;

	/**
	 * The meta object id for the '{@link org.carim.model.ScreenResolutionT <em>Screen Resolution T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.ScreenResolutionT
	 * @see org.carim.model.impl.carimModelPackageImpl#getScreenResolutionT()
	 * @generated
	 */
	int SCREEN_RESOLUTION_T = 47;

	/**
	 * The meta object id for the '{@link org.carim.model.ScreenSizeT <em>Screen Size T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.ScreenSizeT
	 * @see org.carim.model.impl.carimModelPackageImpl#getScreenSizeT()
	 * @generated
	 */
	int SCREEN_SIZE_T = 48;

	/**
	 * The meta object id for the '{@link org.carim.model.SocialArenaT <em>Social Arena T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.SocialArenaT
	 * @see org.carim.model.impl.carimModelPackageImpl#getSocialArenaT()
	 * @generated
	 */
	int SOCIAL_ARENA_T = 49;

	/**
	 * The meta object id for the '{@link org.carim.model.SocialCompanyT <em>Social Company T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.SocialCompanyT
	 * @see org.carim.model.impl.carimModelPackageImpl#getSocialCompanyT()
	 * @generated
	 */
	int SOCIAL_COMPANY_T = 50;

	/**
	 * The meta object id for the '{@link org.carim.model.TaskSuccessT <em>Task Success T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.TaskSuccessT
	 * @see org.carim.model.impl.carimModelPackageImpl#getTaskSuccessT()
	 * @generated
	 */
	int TASK_SUCCESS_T = 51;

	/**
	 * The meta object id for the '{@link org.carim.model.WeatherT <em>Weather T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.WeatherT
	 * @see org.carim.model.impl.carimModelPackageImpl#getWeatherT()
	 * @generated
	 */
	int WEATHER_T = 52;

	/**
	 * The meta object id for the '{@link org.carim.model.WirelessAccessTypeT <em>Wireless Access Type T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.WirelessAccessTypeT
	 * @see org.carim.model.impl.carimModelPackageImpl#getWirelessAccessTypeT()
	 * @generated
	 */
	int WIRELESS_ACCESS_TYPE_T = 53;

	/**
	 * The meta object id for the '<em>Contextual Appropriateness TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.ContextualAppropriatenessT
	 * @see org.carim.model.impl.carimModelPackageImpl#getContextualAppropriatenessTObject()
	 * @generated
	 */
	int CONTEXTUAL_APPROPRIATENESS_TOBJECT = 54;

	/**
	 * The meta object id for the '<em>DDay Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.impl.carimModelPackageImpl#getDDayType()
	 * @generated
	 */
	int DDAY_TYPE = 55;

	/**
	 * The meta object id for the '<em>DDay Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see org.carim.model.impl.carimModelPackageImpl#getDDayTypeObject()
	 * @generated
	 */
	int DDAY_TYPE_OBJECT = 56;

	/**
	 * The meta object id for the '<em>Device Type TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.DeviceTypeT
	 * @see org.carim.model.impl.carimModelPackageImpl#getDeviceTypeTObject()
	 * @generated
	 */
	int DEVICE_TYPE_TOBJECT = 57;

	/**
	 * The meta object id for the '<em>DMonth Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.impl.carimModelPackageImpl#getDMonthType()
	 * @generated
	 */
	int DMONTH_TYPE = 58;

	/**
	 * The meta object id for the '<em>DMonth Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see org.carim.model.impl.carimModelPackageImpl#getDMonthTypeObject()
	 * @generated
	 */
	int DMONTH_TYPE_OBJECT = 59;

	/**
	 * The meta object id for the '<em>DYear Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.impl.carimModelPackageImpl#getDYearType()
	 * @generated
	 */
	int DYEAR_TYPE = 60;

	/**
	 * The meta object id for the '<em>DYear Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see org.carim.model.impl.carimModelPackageImpl#getDYearTypeObject()
	 * @generated
	 */
	int DYEAR_TYPE_OBJECT = 61;

	/**
	 * The meta object id for the '<em>Education Level TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.EducationLevelT
	 * @see org.carim.model.impl.carimModelPackageImpl#getEducationLevelTObject()
	 * @generated
	 */
	int EDUCATION_LEVEL_TOBJECT = 62;

	/**
	 * The meta object id for the '<em>Gender TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.GenderT
	 * @see org.carim.model.impl.carimModelPackageImpl#getGenderTObject()
	 * @generated
	 */
	int GENDER_TOBJECT = 63;

	/**
	 * The meta object id for the '<em>Likert5 Value</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.impl.carimModelPackageImpl#getLikert5Value()
	 * @generated
	 */
	int LIKERT5_VALUE = 64;

	/**
	 * The meta object id for the '<em>Likert5 Value Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Float
	 * @see org.carim.model.impl.carimModelPackageImpl#getLikert5ValueObject()
	 * @generated
	 */
	int LIKERT5_VALUE_OBJECT = 65;

	/**
	 * The meta object id for the '<em>Likert7 Value</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.impl.carimModelPackageImpl#getLikert7Value()
	 * @generated
	 */
	int LIKERT7_VALUE = 66;

	/**
	 * The meta object id for the '<em>Likert7 Value Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Float
	 * @see org.carim.model.impl.carimModelPackageImpl#getLikert7ValueObject()
	 * @generated
	 */
	int LIKERT7_VALUE_OBJECT = 67;

	/**
	 * The meta object id for the '<em>Location TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.LocationT
	 * @see org.carim.model.impl.carimModelPackageImpl#getLocationTObject()
	 * @generated
	 */
	int LOCATION_TOBJECT = 68;

	/**
	 * The meta object id for the '<em>Mc Reason TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.McReasonT
	 * @see org.carim.model.impl.carimModelPackageImpl#getMcReasonTObject()
	 * @generated
	 */
	int MC_REASON_TOBJECT = 69;

	/**
	 * The meta object id for the '<em>Mmi Type TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.MmiTypeT
	 * @see org.carim.model.impl.carimModelPackageImpl#getMmiTypeTObject()
	 * @generated
	 */
	int MMI_TYPE_TOBJECT = 70;

	/**
	 * The meta object id for the '<em>Mobility Level TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.MobilityLevelT
	 * @see org.carim.model.impl.carimModelPackageImpl#getMobilityLevelTObject()
	 * @generated
	 */
	int MOBILITY_LEVEL_TOBJECT = 71;

	/**
	 * The meta object id for the '<em>Mod Approp TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.ModAppropT
	 * @see org.carim.model.impl.carimModelPackageImpl#getModAppropTObject()
	 * @generated
	 */
	int MOD_APPROP_TOBJECT = 72;

	/**
	 * The meta object id for the '<em>Mod Type TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.ModTypeT
	 * @see org.carim.model.impl.carimModelPackageImpl#getModTypeTObject()
	 * @generated
	 */
	int MOD_TYPE_TOBJECT = 73;

	/**
	 * The meta object id for the '<em>Parsing Result TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.ParsingResultT
	 * @see org.carim.model.impl.carimModelPackageImpl#getParsingResultTObject()
	 * @generated
	 */
	int PARSING_RESULT_TOBJECT = 74;

	/**
	 * The meta object id for the '<em>Percentage T</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.impl.carimModelPackageImpl#getPercentageT()
	 * @generated
	 */
	int PERCENTAGE_T = 75;

	/**
	 * The meta object id for the '<em>Percentage TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see org.carim.model.impl.carimModelPackageImpl#getPercentageTObject()
	 * @generated
	 */
	int PERCENTAGE_TOBJECT = 76;

	/**
	 * The meta object id for the '<em>Previous Experience TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.PreviousExperienceT
	 * @see org.carim.model.impl.carimModelPackageImpl#getPreviousExperienceTObject()
	 * @generated
	 */
	int PREVIOUS_EXPERIENCE_TOBJECT = 77;

	/**
	 * The meta object id for the '<em>Prompt Type TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.PromptTypeT
	 * @see org.carim.model.impl.carimModelPackageImpl#getPromptTypeTObject()
	 * @generated
	 */
	int PROMPT_TYPE_TOBJECT = 78;

	/**
	 * The meta object id for the '<em>Role TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.RoleT
	 * @see org.carim.model.impl.carimModelPackageImpl#getRoleTObject()
	 * @generated
	 */
	int ROLE_TOBJECT = 79;

	/**
	 * The meta object id for the '<em>Screen Orientation TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.ScreenOrientationT
	 * @see org.carim.model.impl.carimModelPackageImpl#getScreenOrientationTObject()
	 * @generated
	 */
	int SCREEN_ORIENTATION_TOBJECT = 80;

	/**
	 * The meta object id for the '<em>Screen Resolution TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.ScreenResolutionT
	 * @see org.carim.model.impl.carimModelPackageImpl#getScreenResolutionTObject()
	 * @generated
	 */
	int SCREEN_RESOLUTION_TOBJECT = 81;

	/**
	 * The meta object id for the '<em>Screen Size TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.ScreenSizeT
	 * @see org.carim.model.impl.carimModelPackageImpl#getScreenSizeTObject()
	 * @generated
	 */
	int SCREEN_SIZE_TOBJECT = 82;

	/**
	 * The meta object id for the '<em>Social Arena TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.SocialArenaT
	 * @see org.carim.model.impl.carimModelPackageImpl#getSocialArenaTObject()
	 * @generated
	 */
	int SOCIAL_ARENA_TOBJECT = 83;

	/**
	 * The meta object id for the '<em>Social Company TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.SocialCompanyT
	 * @see org.carim.model.impl.carimModelPackageImpl#getSocialCompanyTObject()
	 * @generated
	 */
	int SOCIAL_COMPANY_TOBJECT = 84;

	/**
	 * The meta object id for the '<em>Task Success TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.TaskSuccessT
	 * @see org.carim.model.impl.carimModelPackageImpl#getTaskSuccessTObject()
	 * @generated
	 */
	int TASK_SUCCESS_TOBJECT = 85;

	/**
	 * The meta object id for the '<em>THours Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.impl.carimModelPackageImpl#getTHoursType()
	 * @generated
	 */
	int THOURS_TYPE = 86;

	/**
	 * The meta object id for the '<em>THours Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see org.carim.model.impl.carimModelPackageImpl#getTHoursTypeObject()
	 * @generated
	 */
	int THOURS_TYPE_OBJECT = 87;

	/**
	 * The meta object id for the '<em>TMins Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.impl.carimModelPackageImpl#getTMinsType()
	 * @generated
	 */
	int TMINS_TYPE = 88;

	/**
	 * The meta object id for the '<em>TMins Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see org.carim.model.impl.carimModelPackageImpl#getTMinsTypeObject()
	 * @generated
	 */
	int TMINS_TYPE_OBJECT = 89;

	/**
	 * The meta object id for the '<em>TSecs Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.impl.carimModelPackageImpl#getTSecsType()
	 * @generated
	 */
	int TSECS_TYPE = 90;

	/**
	 * The meta object id for the '<em>TSecs Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see org.carim.model.impl.carimModelPackageImpl#getTSecsTypeObject()
	 * @generated
	 */
	int TSECS_TYPE_OBJECT = 91;

	/**
	 * The meta object id for the '<em>Weather TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.WeatherT
	 * @see org.carim.model.impl.carimModelPackageImpl#getWeatherTObject()
	 * @generated
	 */
	int WEATHER_TOBJECT = 92;

	/**
	 * The meta object id for the '<em>Wireless Access Type TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.carim.model.WirelessAccessTypeT
	 * @see org.carim.model.impl.carimModelPackageImpl#getWirelessAccessTypeTObject()
	 * @generated
	 */
	int WIRELESS_ACCESS_TYPE_TOBJECT = 93;


	/**
	 * Returns the meta object for class '{@link org.carim.model.Attitude <em>Attitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attitude</em>'.
	 * @see org.carim.model.Attitude
	 * @generated
	 */
	EClass getAttitude();

	/**
	 * Returns the meta object for class '{@link org.carim.model.Avm <em>Avm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Avm</em>'.
	 * @see org.carim.model.Avm
	 * @generated
	 */
	EClass getAvm();

	/**
	 * Returns the meta object for class '{@link org.carim.model.CommunicationContext <em>Communication Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Context</em>'.
	 * @see org.carim.model.CommunicationContext
	 * @generated
	 */
	EClass getCommunicationContext();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.CommunicationContext#getWirelessAccessType <em>Wireless Access Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wireless Access Type</em>'.
	 * @see org.carim.model.CommunicationContext#getWirelessAccessType()
	 * @see #getCommunicationContext()
	 * @generated
	 */
	EAttribute getCommunicationContext_WirelessAccessType();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.CommunicationContext#getAccessPointName <em>Access Point Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Point Name</em>'.
	 * @see org.carim.model.CommunicationContext#getAccessPointName()
	 * @see #getCommunicationContext()
	 * @generated
	 */
	EAttribute getCommunicationContext_AccessPointName();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.CommunicationContext#getSignalStrength <em>Signal Strength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signal Strength</em>'.
	 * @see org.carim.model.CommunicationContext#getSignalStrength()
	 * @see #getCommunicationContext()
	 * @generated
	 */
	EAttribute getCommunicationContext_SignalStrength();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.CommunicationContext#getReceivedDataThroughput <em>Received Data Throughput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Received Data Throughput</em>'.
	 * @see org.carim.model.CommunicationContext#getReceivedDataThroughput()
	 * @see #getCommunicationContext()
	 * @generated
	 */
	EAttribute getCommunicationContext_ReceivedDataThroughput();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.CommunicationContext#getSentDataThroughput <em>Sent Data Throughput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sent Data Throughput</em>'.
	 * @see org.carim.model.CommunicationContext#getSentDataThroughput()
	 * @see #getCommunicationContext()
	 * @generated
	 */
	EAttribute getCommunicationContext_SentDataThroughput();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.CommunicationContext#getRtt <em>Rtt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rtt</em>'.
	 * @see org.carim.model.CommunicationContext#getRtt()
	 * @see #getCommunicationContext()
	 * @generated
	 */
	EAttribute getCommunicationContext_Rtt();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.CommunicationContext#getSrt <em>Srt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Srt</em>'.
	 * @see org.carim.model.CommunicationContext#getSrt()
	 * @see #getCommunicationContext()
	 * @generated
	 */
	EAttribute getCommunicationContext_Srt();

	/**
	 * Returns the meta object for class '{@link org.carim.model.Cooperativity <em>Cooperativity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cooperativity</em>'.
	 * @see org.carim.model.Cooperativity
	 * @generated
	 */
	EClass getCooperativity();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.Cooperativity#getContextualAppropriateness <em>Contextual Appropriateness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contextual Appropriateness</em>'.
	 * @see org.carim.model.Cooperativity#getContextualAppropriateness()
	 * @see #getCooperativity()
	 * @generated
	 */
	EAttribute getCooperativity_ContextualAppropriateness();

	/**
	 * Returns the meta object for class '{@link org.carim.model.DateTimeT <em>Date Time T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Time T</em>'.
	 * @see org.carim.model.DateTimeT
	 * @generated
	 */
	EClass getDateTimeT();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.DateTimeT#getDDay <em>DDay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DDay</em>'.
	 * @see org.carim.model.DateTimeT#getDDay()
	 * @see #getDateTimeT()
	 * @generated
	 */
	EAttribute getDateTimeT_DDay();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.DateTimeT#getDMonth <em>DMonth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DMonth</em>'.
	 * @see org.carim.model.DateTimeT#getDMonth()
	 * @see #getDateTimeT()
	 * @generated
	 */
	EAttribute getDateTimeT_DMonth();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.DateTimeT#getDYear <em>DYear</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DYear</em>'.
	 * @see org.carim.model.DateTimeT#getDYear()
	 * @see #getDateTimeT()
	 * @generated
	 */
	EAttribute getDateTimeT_DYear();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.DateTimeT#getTHours <em>THours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>THours</em>'.
	 * @see org.carim.model.DateTimeT#getTHours()
	 * @see #getDateTimeT()
	 * @generated
	 */
	EAttribute getDateTimeT_THours();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.DateTimeT#getTMins <em>TMins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TMins</em>'.
	 * @see org.carim.model.DateTimeT#getTMins()
	 * @see #getDateTimeT()
	 * @generated
	 */
	EAttribute getDateTimeT_TMins();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.DateTimeT#getTSecs <em>TSecs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TSecs</em>'.
	 * @see org.carim.model.DateTimeT#getTSecs()
	 * @see #getDateTimeT()
	 * @generated
	 */
	EAttribute getDateTimeT_TSecs();

	/**
	 * Returns the meta object for class '{@link org.carim.model.DeviceContext <em>Device Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Context</em>'.
	 * @see org.carim.model.DeviceContext
	 * @generated
	 */
	EClass getDeviceContext();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.DeviceContext#getDeviceType <em>Device Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device Type</em>'.
	 * @see org.carim.model.DeviceContext#getDeviceType()
	 * @see #getDeviceContext()
	 * @generated
	 */
	EAttribute getDeviceContext_DeviceType();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.DeviceContext#getScreenSize <em>Screen Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Screen Size</em>'.
	 * @see org.carim.model.DeviceContext#getScreenSize()
	 * @see #getDeviceContext()
	 * @generated
	 */
	EAttribute getDeviceContext_ScreenSize();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.DeviceContext#getScreenResolution <em>Screen Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Screen Resolution</em>'.
	 * @see org.carim.model.DeviceContext#getScreenResolution()
	 * @see #getDeviceContext()
	 * @generated
	 */
	EAttribute getDeviceContext_ScreenResolution();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.DeviceContext#getScreenOrientation <em>Screen Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Screen Orientation</em>'.
	 * @see org.carim.model.DeviceContext#getScreenOrientation()
	 * @see #getDeviceContext()
	 * @generated
	 */
	EAttribute getDeviceContext_ScreenOrientation();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.DeviceContext#getScreenBrightnessLevel <em>Screen Brightness Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Screen Brightness Level</em>'.
	 * @see org.carim.model.DeviceContext#getScreenBrightnessLevel()
	 * @see #getDeviceContext()
	 * @generated
	 */
	EAttribute getDeviceContext_ScreenBrightnessLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.DeviceContext#getVolumeLevel <em>Volume Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume Level</em>'.
	 * @see org.carim.model.DeviceContext#getVolumeLevel()
	 * @see #getDeviceContext()
	 * @generated
	 */
	EAttribute getDeviceContext_VolumeLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.DeviceContext#getMemoryUsage <em>Memory Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory Usage</em>'.
	 * @see org.carim.model.DeviceContext#getMemoryUsage()
	 * @see #getDeviceContext()
	 * @generated
	 */
	EAttribute getDeviceContext_MemoryUsage();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.DeviceContext#getCpuUsage <em>Cpu Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cpu Usage</em>'.
	 * @see org.carim.model.DeviceContext#getCpuUsage()
	 * @see #getDeviceContext()
	 * @generated
	 */
	EAttribute getDeviceContext_CpuUsage();

	/**
	 * Returns the meta object for class '{@link org.carim.model.Dialogue <em>Dialogue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dialogue</em>'.
	 * @see org.carim.model.Dialogue
	 * @generated
	 */
	EClass getDialogue();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.Dialogue#getBaseTimestamp <em>Base Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Timestamp</em>'.
	 * @see org.carim.model.Dialogue#getBaseTimestamp()
	 * @see #getDialogue()
	 * @generated
	 */
	EAttribute getDialogue_BaseTimestamp();

	/**
	 * Returns the meta object for the containment reference '{@link org.carim.model.Dialogue#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Task</em>'.
	 * @see org.carim.model.Dialogue#getTask()
	 * @see #getDialogue()
	 * @generated
	 */
	EReference getDialogue_Task();

	/**
	 * Returns the meta object for the containment reference list '{@link org.carim.model.Dialogue#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Step</em>'.
	 * @see org.carim.model.Dialogue#getStep()
	 * @see #getDialogue()
	 * @generated
	 */
	EReference getDialogue_Step();

	/**
	 * Returns the meta object for class '{@link org.carim.model.DialogueStepT <em>Dialogue Step T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dialogue Step T</em>'.
	 * @see org.carim.model.DialogueStepT
	 * @generated
	 */
	EClass getDialogueStepT();

	/**
	 * Returns the meta object for the containment reference '{@link org.carim.model.DialogueStepT#getSystemTurn <em>System Turn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>System Turn</em>'.
	 * @see org.carim.model.DialogueStepT#getSystemTurn()
	 * @see #getDialogueStepT()
	 * @generated
	 */
	EReference getDialogueStepT_SystemTurn();

	/**
	 * Returns the meta object for the containment reference '{@link org.carim.model.DialogueStepT#getUserTurn <em>User Turn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User Turn</em>'.
	 * @see org.carim.model.DialogueStepT#getUserTurn()
	 * @see #getDialogueStepT()
	 * @generated
	 */
	EReference getDialogueStepT_UserTurn();

	/**
	 * Returns the meta object for class '{@link org.carim.model.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.carim.model.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.carim.model.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.carim.model.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.carim.model.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.carim.model.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.carim.model.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.carim.model.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.carim.model.DocumentRoot#getTrial <em>Trial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trial</em>'.
	 * @see org.carim.model.DocumentRoot#getTrial()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Trial();

	/**
	 * Returns the meta object for class '{@link org.carim.model.DynamicContext <em>Dynamic Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Context</em>'.
	 * @see org.carim.model.DynamicContext
	 * @generated
	 */
	EClass getDynamicContext();

	/**
	 * Returns the meta object for the containment reference '{@link org.carim.model.DynamicContext#getPhysicalContext <em>Physical Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Physical Context</em>'.
	 * @see org.carim.model.DynamicContext#getPhysicalContext()
	 * @see #getDynamicContext()
	 * @generated
	 */
	EReference getDynamicContext_PhysicalContext();

	/**
	 * Returns the meta object for the containment reference '{@link org.carim.model.DynamicContext#getSocialContext <em>Social Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Social Context</em>'.
	 * @see org.carim.model.DynamicContext#getSocialContext()
	 * @see #getDynamicContext()
	 * @generated
	 */
	EReference getDynamicContext_SocialContext();

	/**
	 * Returns the meta object for the containment reference '{@link org.carim.model.DynamicContext#getLocationTimeContext <em>Location Time Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location Time Context</em>'.
	 * @see org.carim.model.DynamicContext#getLocationTimeContext()
	 * @see #getDynamicContext()
	 * @generated
	 */
	EReference getDynamicContext_LocationTimeContext();

	/**
	 * Returns the meta object for the containment reference '{@link org.carim.model.DynamicContext#getDeviceContext <em>Device Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device Context</em>'.
	 * @see org.carim.model.DynamicContext#getDeviceContext()
	 * @see #getDynamicContext()
	 * @generated
	 */
	EReference getDynamicContext_DeviceContext();

	/**
	 * Returns the meta object for the containment reference '{@link org.carim.model.DynamicContext#getCommunicationContext <em>Communication Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Communication Context</em>'.
	 * @see org.carim.model.DynamicContext#getCommunicationContext()
	 * @see #getDynamicContext()
	 * @generated
	 */
	EReference getDynamicContext_CommunicationContext();

	/**
	 * Returns the meta object for class '{@link org.carim.model.GuiInput <em>Gui Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gui Input</em>'.
	 * @see org.carim.model.GuiInput
	 * @generated
	 */
	EClass getGuiInput();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.GuiInput#getTextElements <em>Text Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Elements</em>'.
	 * @see org.carim.model.GuiInput#getTextElements()
	 * @see #getGuiInput()
	 * @generated
	 */
	EAttribute getGuiInput_TextElements();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.GuiInput#getNavigationActions <em>Navigation Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Navigation Actions</em>'.
	 * @see org.carim.model.GuiInput#getNavigationActions()
	 * @see #getGuiInput()
	 * @generated
	 */
	EAttribute getGuiInput_NavigationActions();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.GuiInput#getNavigationMoves <em>Navigation Moves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Navigation Moves</em>'.
	 * @see org.carim.model.GuiInput#getNavigationMoves()
	 * @see #getGuiInput()
	 * @generated
	 */
	EAttribute getGuiInput_NavigationMoves();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.GuiInput#getNavigationLength <em>Navigation Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Navigation Length</em>'.
	 * @see org.carim.model.GuiInput#getNavigationLength()
	 * @see #getGuiInput()
	 * @generated
	 */
	EAttribute getGuiInput_NavigationLength();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.GuiInput#getExploringActions <em>Exploring Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exploring Actions</em>'.
	 * @see org.carim.model.GuiInput#getExploringActions()
	 * @see #getGuiInput()
	 * @generated
	 */
	EAttribute getGuiInput_ExploringActions();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.GuiInput#getTransferringActions <em>Transferring Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transferring Actions</em>'.
	 * @see org.carim.model.GuiInput#getTransferringActions()
	 * @see #getGuiInput()
	 * @generated
	 */
	EAttribute getGuiInput_TransferringActions();

	/**
	 * Returns the meta object for class '{@link org.carim.model.LocationTimeContext <em>Location Time Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location Time Context</em>'.
	 * @see org.carim.model.LocationTimeContext
	 * @generated
	 */
	EClass getLocationTimeContext();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.LocationTimeContext#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.carim.model.LocationTimeContext#getLocation()
	 * @see #getLocationTimeContext()
	 * @generated
	 */
	EAttribute getLocationTimeContext_Location();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.LocationTimeContext#getGeoLatitude <em>Geo Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geo Latitude</em>'.
	 * @see org.carim.model.LocationTimeContext#getGeoLatitude()
	 * @see #getLocationTimeContext()
	 * @generated
	 */
	EAttribute getLocationTimeContext_GeoLatitude();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.LocationTimeContext#getGeoLongitude <em>Geo Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geo Longitude</em>'.
	 * @see org.carim.model.LocationTimeContext#getGeoLongitude()
	 * @see #getLocationTimeContext()
	 * @generated
	 */
	EAttribute getLocationTimeContext_GeoLongitude();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.LocationTimeContext#getMobilityLevel <em>Mobility Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mobility Level</em>'.
	 * @see org.carim.model.LocationTimeContext#getMobilityLevel()
	 * @see #getLocationTimeContext()
	 * @generated
	 */
	EAttribute getLocationTimeContext_MobilityLevel();

	/**
	 * Returns the meta object for the containment reference '{@link org.carim.model.LocationTimeContext#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time</em>'.
	 * @see org.carim.model.LocationTimeContext#getTime()
	 * @see #getLocationTimeContext()
	 * @generated
	 */
	EReference getLocationTimeContext_Time();

	/**
	 * Returns the meta object for class '{@link org.carim.model.Metacomm <em>Metacomm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metacomm</em>'.
	 * @see org.carim.model.Metacomm
	 * @generated
	 */
	EClass getMetacomm();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.Metacomm#isIsHelp <em>Is Help</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Help</em>'.
	 * @see org.carim.model.Metacomm#isIsHelp()
	 * @see #getMetacomm()
	 * @generated
	 */
	EAttribute getMetacomm_IsHelp();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.Metacomm#isIsCorrection <em>Is Correction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Correction</em>'.
	 * @see org.carim.model.Metacomm#isIsCorrection()
	 * @see #getMetacomm()
	 * @generated
	 */
	EAttribute getMetacomm_IsCorrection();

	/**
	 * Returns the meta object for class '{@link org.carim.model.ModalityAppropriateness <em>Modality Appropriateness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modality Appropriateness</em>'.
	 * @see org.carim.model.ModalityAppropriateness
	 * @generated
	 */
	EClass getModalityAppropriateness();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.ModalityAppropriateness#getAppropriateness <em>Appropriateness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Appropriateness</em>'.
	 * @see org.carim.model.ModalityAppropriateness#getAppropriateness()
	 * @see #getModalityAppropriateness()
	 * @generated
	 */
	EAttribute getModalityAppropriateness_Appropriateness();

	/**
	 * Returns the meta object for class '{@link org.carim.model.ModalityChange <em>Modality Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modality Change</em>'.
	 * @see org.carim.model.ModalityChange
	 * @generated
	 */
	EClass getModalityChange();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.ModalityChange#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origin</em>'.
	 * @see org.carim.model.ModalityChange#getOrigin()
	 * @see #getModalityChange()
	 * @generated
	 */
	EAttribute getModalityChange_Origin();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.ModalityChange#getReason <em>Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reason</em>'.
	 * @see org.carim.model.ModalityChange#getReason()
	 * @see #getModalityChange()
	 * @generated
	 */
	EAttribute getModalityChange_Reason();

	/**
	 * Returns the meta object for class '{@link org.carim.model.ModalityInfo <em>Modality Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modality Info</em>'.
	 * @see org.carim.model.ModalityInfo
	 * @generated
	 */
	EClass getModalityInfo();

	/**
	 * Returns the meta object for the attribute list '{@link org.carim.model.ModalityInfo#getModalityType <em>Modality Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Modality Type</em>'.
	 * @see org.carim.model.ModalityInfo#getModalityType()
	 * @see #getModalityInfo()
	 * @generated
	 */
	EAttribute getModalityInfo_ModalityType();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.ModalityInfo#getMminteractionType <em>Mminteraction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mminteraction Type</em>'.
	 * @see org.carim.model.ModalityInfo#getMminteractionType()
	 * @see #getModalityInfo()
	 * @generated
	 */
	EAttribute getModalityInfo_MminteractionType();

	/**
	 * Returns the meta object for the containment reference '{@link org.carim.model.ModalityInfo#getAppropriateness <em>Appropriateness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Appropriateness</em>'.
	 * @see org.carim.model.ModalityInfo#getAppropriateness()
	 * @see #getModalityInfo()
	 * @generated
	 */
	EReference getModalityInfo_Appropriateness();

	/**
	 * Returns the meta object for the containment reference '{@link org.carim.model.ModalityInfo#getSynchroni <em>Synchroni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Synchroni</em>'.
	 * @see org.carim.model.ModalityInfo#getSynchroni()
	 * @see #getModalityInfo()
	 * @generated
	 */
	EReference getModalityInfo_Synchroni();

	/**
	 * Returns the meta object for the containment reference '{@link org.carim.model.ModalityInfo#getChange <em>Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Change</em>'.
	 * @see org.carim.model.ModalityInfo#getChange()
	 * @see #getModalityInfo()
	 * @generated
	 */
	EReference getModalityInfo_Change();

	/**
	 * Returns the meta object for class '{@link org.carim.model.ModalitySynchroni <em>Modality Synchroni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modality Synchroni</em>'.
	 * @see org.carim.model.ModalitySynchroni
	 * @generated
	 */
	EClass getModalitySynchroni();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.ModalitySynchroni#getNlags <em>Nlags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nlags</em>'.
	 * @see org.carim.model.ModalitySynchroni#getNlags()
	 * @see #getModalitySynchroni()
	 * @generated
	 */
	EAttribute getModalitySynchroni_Nlags();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.ModalitySynchroni#getLagtime <em>Lagtime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lagtime</em>'.
	 * @see org.carim.model.ModalitySynchroni#getLagtime()
	 * @see #getModalitySynchroni()
	 * @generated
	 */
	EAttribute getModalitySynchroni_Lagtime();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.ModalitySynchroni#getNevents <em>Nevents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nevents</em>'.
	 * @see org.carim.model.ModalitySynchroni#getNevents()
	 * @see #getModalitySynchroni()
	 * @generated
	 */
	EAttribute getModalitySynchroni_Nevents();

	/**
	 * Returns the meta object for class '{@link org.carim.model.MotionInput <em>Motion Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Motion Input</em>'.
	 * @see org.carim.model.MotionInput
	 * @generated
	 */
	EClass getMotionInput();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.MotionInput#getTiltMovements <em>Tilt Movements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tilt Movements</em>'.
	 * @see org.carim.model.MotionInput#getTiltMovements()
	 * @see #getMotionInput()
	 * @generated
	 */
	EAttribute getMotionInput_TiltMovements();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.MotionInput#getTwistMovements <em>Twist Movements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Twist Movements</em>'.
	 * @see org.carim.model.MotionInput#getTwistMovements()
	 * @see #getMotionInput()
	 * @generated
	 */
	EAttribute getMotionInput_TwistMovements();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.MotionInput#getShakeMovements <em>Shake Movements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shake Movements</em>'.
	 * @see org.carim.model.MotionInput#getShakeMovements()
	 * @see #getMotionInput()
	 * @generated
	 */
	EAttribute getMotionInput_ShakeMovements();

	/**
	 * Returns the meta object for class '{@link org.carim.model.PhysicalContext <em>Physical Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Context</em>'.
	 * @see org.carim.model.PhysicalContext
	 * @generated
	 */
	EClass getPhysicalContext();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.PhysicalContext#getTemperature <em>Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temperature</em>'.
	 * @see org.carim.model.PhysicalContext#getTemperature()
	 * @see #getPhysicalContext()
	 * @generated
	 */
	EAttribute getPhysicalContext_Temperature();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.PhysicalContext#getWeather <em>Weather</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weather</em>'.
	 * @see org.carim.model.PhysicalContext#getWeather()
	 * @see #getPhysicalContext()
	 * @generated
	 */
	EAttribute getPhysicalContext_Weather();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.PhysicalContext#getNoise <em>Noise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Noise</em>'.
	 * @see org.carim.model.PhysicalContext#getNoise()
	 * @see #getPhysicalContext()
	 * @generated
	 */
	EAttribute getPhysicalContext_Noise();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.PhysicalContext#getLight <em>Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Light</em>'.
	 * @see org.carim.model.PhysicalContext#getLight()
	 * @see #getPhysicalContext()
	 * @generated
	 */
	EAttribute getPhysicalContext_Light();

	/**
	 * Returns the meta object for class '{@link org.carim.model.SocialContext <em>Social Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Social Context</em>'.
	 * @see org.carim.model.SocialContext
	 * @generated
	 */
	EClass getSocialContext();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.SocialContext#getCompany <em>Company</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Company</em>'.
	 * @see org.carim.model.SocialContext#getCompany()
	 * @see #getSocialContext()
	 * @generated
	 */
	EAttribute getSocialContext_Company();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.SocialContext#getArena <em>Arena</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arena</em>'.
	 * @see org.carim.model.SocialContext#getArena()
	 * @see #getSocialContext()
	 * @generated
	 */
	EAttribute getSocialContext_Arena();

	/**
	 * Returns the meta object for class '{@link org.carim.model.SpeechInput <em>Speech Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Speech Input</em>'.
	 * @see org.carim.model.SpeechInput
	 * @generated
	 */
	EClass getSpeechInput();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.SpeechInput#getOverallWords <em>Overall Words</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overall Words</em>'.
	 * @see org.carim.model.SpeechInput#getOverallWords()
	 * @see #getSpeechInput()
	 * @generated
	 */
	EAttribute getSpeechInput_OverallWords();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.SpeechInput#getSubstitutedWords <em>Substituted Words</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Substituted Words</em>'.
	 * @see org.carim.model.SpeechInput#getSubstitutedWords()
	 * @see #getSpeechInput()
	 * @generated
	 */
	EAttribute getSpeechInput_SubstitutedWords();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.SpeechInput#getDeletedWords <em>Deleted Words</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deleted Words</em>'.
	 * @see org.carim.model.SpeechInput#getDeletedWords()
	 * @see #getSpeechInput()
	 * @generated
	 */
	EAttribute getSpeechInput_DeletedWords();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.SpeechInput#getInsertedWords <em>Inserted Words</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inserted Words</em>'.
	 * @see org.carim.model.SpeechInput#getInsertedWords()
	 * @see #getSpeechInput()
	 * @generated
	 */
	EAttribute getSpeechInput_InsertedWords();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.SpeechInput#getOverallSentences <em>Overall Sentences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overall Sentences</em>'.
	 * @see org.carim.model.SpeechInput#getOverallSentences()
	 * @see #getSpeechInput()
	 * @generated
	 */
	EAttribute getSpeechInput_OverallSentences();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.SpeechInput#getSubstitutedSentences <em>Substituted Sentences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Substituted Sentences</em>'.
	 * @see org.carim.model.SpeechInput#getSubstitutedSentences()
	 * @see #getSpeechInput()
	 * @generated
	 */
	EAttribute getSpeechInput_SubstitutedSentences();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.SpeechInput#getDeletedSentences <em>Deleted Sentences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deleted Sentences</em>'.
	 * @see org.carim.model.SpeechInput#getDeletedSentences()
	 * @see #getSpeechInput()
	 * @generated
	 */
	EAttribute getSpeechInput_DeletedSentences();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.SpeechInput#getInsertedSentences <em>Inserted Sentences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inserted Sentences</em>'.
	 * @see org.carim.model.SpeechInput#getInsertedSentences()
	 * @see #getSpeechInput()
	 * @generated
	 */
	EAttribute getSpeechInput_InsertedSentences();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.SpeechInput#getOverallConcepts <em>Overall Concepts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overall Concepts</em>'.
	 * @see org.carim.model.SpeechInput#getOverallConcepts()
	 * @see #getSpeechInput()
	 * @generated
	 */
	EAttribute getSpeechInput_OverallConcepts();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.SpeechInput#getSubstitutedConcepts <em>Substituted Concepts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Substituted Concepts</em>'.
	 * @see org.carim.model.SpeechInput#getSubstitutedConcepts()
	 * @see #getSpeechInput()
	 * @generated
	 */
	EAttribute getSpeechInput_SubstitutedConcepts();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.SpeechInput#getDeletedConcepts <em>Deleted Concepts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deleted Concepts</em>'.
	 * @see org.carim.model.SpeechInput#getDeletedConcepts()
	 * @see #getSpeechInput()
	 * @generated
	 */
	EAttribute getSpeechInput_DeletedConcepts();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.SpeechInput#getInsertedConcepts <em>Inserted Concepts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inserted Concepts</em>'.
	 * @see org.carim.model.SpeechInput#getInsertedConcepts()
	 * @see #getSpeechInput()
	 * @generated
	 */
	EAttribute getSpeechInput_InsertedConcepts();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.SpeechInput#getParsingResult <em>Parsing Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parsing Result</em>'.
	 * @see org.carim.model.SpeechInput#getParsingResult()
	 * @see #getSpeechInput()
	 * @generated
	 */
	EAttribute getSpeechInput_ParsingResult();

	/**
	 * Returns the meta object for class '{@link org.carim.model.SpeechOutput <em>Speech Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Speech Output</em>'.
	 * @see org.carim.model.SpeechOutput
	 * @generated
	 */
	EClass getSpeechOutput();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.SpeechOutput#getANCO <em>ANCO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ANCO</em>'.
	 * @see org.carim.model.SpeechOutput#getANCO()
	 * @see #getSpeechOutput()
	 * @generated
	 */
	EAttribute getSpeechOutput_ANCO();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.SpeechOutput#getANIN <em>ANIN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ANIN</em>'.
	 * @see org.carim.model.SpeechOutput#getANIN()
	 * @see #getSpeechOutput()
	 * @generated
	 */
	EAttribute getSpeechOutput_ANIN();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.SpeechOutput#getANPA <em>ANPA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ANPA</em>'.
	 * @see org.carim.model.SpeechOutput#getANPA()
	 * @see #getSpeechOutput()
	 * @generated
	 */
	EAttribute getSpeechOutput_ANPA();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.SpeechOutput#getANFA <em>ANFA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ANFA</em>'.
	 * @see org.carim.model.SpeechOutput#getANFA()
	 * @see #getSpeechOutput()
	 * @generated
	 */
	EAttribute getSpeechOutput_ANFA();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.SpeechOutput#getPromptType <em>Prompt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prompt Type</em>'.
	 * @see org.carim.model.SpeechOutput#getPromptType()
	 * @see #getSpeechOutput()
	 * @generated
	 */
	EAttribute getSpeechOutput_PromptType();

	/**
	 * Returns the meta object for class '{@link org.carim.model.SystemMetacomm <em>System Metacomm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Metacomm</em>'.
	 * @see org.carim.model.SystemMetacomm
	 * @generated
	 */
	EClass getSystemMetacomm();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.SystemMetacomm#isIsASRReject <em>Is ASR Reject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is ASR Reject</em>'.
	 * @see org.carim.model.SystemMetacomm#isIsASRReject()
	 * @see #getSystemMetacomm()
	 * @generated
	 */
	EAttribute getSystemMetacomm_IsASRReject();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.SystemMetacomm#isIsDIVReject <em>Is DIV Reject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is DIV Reject</em>'.
	 * @see org.carim.model.SystemMetacomm#isIsDIVReject()
	 * @see #getSystemMetacomm()
	 * @generated
	 */
	EAttribute getSystemMetacomm_IsDIVReject();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.SystemMetacomm#isIsGRReject <em>Is GR Reject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is GR Reject</em>'.
	 * @see org.carim.model.SystemMetacomm#isIsGRReject()
	 * @see #getSystemMetacomm()
	 * @generated
	 */
	EAttribute getSystemMetacomm_IsGRReject();

	/**
	 * Returns the meta object for class '{@link org.carim.model.SystemTurn <em>System Turn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Turn</em>'.
	 * @see org.carim.model.SystemTurn
	 * @generated
	 */
	EClass getSystemTurn();

	/**
	 * Returns the meta object for the containment reference '{@link org.carim.model.SystemTurn#getMetacomm <em>Metacomm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metacomm</em>'.
	 * @see org.carim.model.SystemTurn#getMetacomm()
	 * @see #getSystemTurn()
	 * @generated
	 */
	EReference getSystemTurn_Metacomm();

	/**
	 * Returns the meta object for the containment reference '{@link org.carim.model.SystemTurn#getSpeechOutput <em>Speech Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Speech Output</em>'.
	 * @see org.carim.model.SystemTurn#getSpeechOutput()
	 * @see #getSystemTurn()
	 * @generated
	 */
	EReference getSystemTurn_SpeechOutput();

	/**
	 * Returns the meta object for the containment reference '{@link org.carim.model.SystemTurn#getCooperativity <em>Cooperativity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cooperativity</em>'.
	 * @see org.carim.model.SystemTurn#getCooperativity()
	 * @see #getSystemTurn()
	 * @generated
	 */
	EReference getSystemTurn_Cooperativity();

	/**
	 * Returns the meta object for class '{@link org.carim.model.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see org.carim.model.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.Task#getSuccess <em>Success</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Success</em>'.
	 * @see org.carim.model.Task#getSuccess()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Success();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.Task#getReason <em>Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reason</em>'.
	 * @see org.carim.model.Task#getReason()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Reason();

	/**
	 * Returns the meta object for the containment reference '{@link org.carim.model.Task#getAvm <em>Avm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Avm</em>'.
	 * @see org.carim.model.Task#getAvm()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Avm();

	/**
	 * Returns the meta object for class '{@link org.carim.model.Trial <em>Trial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trial</em>'.
	 * @see org.carim.model.Trial
	 * @generated
	 */
	EClass getTrial();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.Trial#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.carim.model.Trial#getDescription()
	 * @see #getTrial()
	 * @generated
	 */
	EAttribute getTrial_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.carim.model.Trial#getUserData <em>User Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User Data</em>'.
	 * @see org.carim.model.Trial#getUserData()
	 * @see #getTrial()
	 * @generated
	 */
	EReference getTrial_UserData();

	/**
	 * Returns the meta object for the containment reference list '{@link org.carim.model.Trial#getDialogues <em>Dialogues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dialogues</em>'.
	 * @see org.carim.model.Trial#getDialogues()
	 * @see #getTrial()
	 * @generated
	 */
	EReference getTrial_Dialogues();

	/**
	 * Returns the meta object for class '{@link org.carim.model.Turn <em>Turn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turn</em>'.
	 * @see org.carim.model.Turn
	 * @generated
	 */
	EClass getTurn();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.Turn#getFeedbackDelay <em>Feedback Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feedback Delay</em>'.
	 * @see org.carim.model.Turn#getFeedbackDelay()
	 * @see #getTurn()
	 * @generated
	 */
	EAttribute getTurn_FeedbackDelay();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.Turn#getFeedbackDuration <em>Feedback Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feedback Duration</em>'.
	 * @see org.carim.model.Turn#getFeedbackDuration()
	 * @see #getTurn()
	 * @generated
	 */
	EAttribute getTurn_FeedbackDuration();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.Turn#getActionDuration <em>Action Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Duration</em>'.
	 * @see org.carim.model.Turn#getActionDuration()
	 * @see #getTurn()
	 * @generated
	 */
	EAttribute getTurn_ActionDuration();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.Turn#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elements</em>'.
	 * @see org.carim.model.Turn#getElements()
	 * @see #getTurn()
	 * @generated
	 */
	EAttribute getTurn_Elements();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.Turn#getFeedback <em>Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feedback</em>'.
	 * @see org.carim.model.Turn#getFeedback()
	 * @see #getTurn()
	 * @generated
	 */
	EAttribute getTurn_Feedback();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.Turn#getConcepts <em>Concepts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Concepts</em>'.
	 * @see org.carim.model.Turn#getConcepts()
	 * @see #getTurn()
	 * @generated
	 */
	EAttribute getTurn_Concepts();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.Turn#getNoise <em>Noise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Noise</em>'.
	 * @see org.carim.model.Turn#getNoise()
	 * @see #getTurn()
	 * @generated
	 */
	EAttribute getTurn_Noise();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.Turn#getQuestions <em>Questions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Questions</em>'.
	 * @see org.carim.model.Turn#getQuestions()
	 * @see #getTurn()
	 * @generated
	 */
	EAttribute getTurn_Questions();

	/**
	 * Returns the meta object for the containment reference '{@link org.carim.model.Turn#getModality <em>Modality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Modality</em>'.
	 * @see org.carim.model.Turn#getModality()
	 * @see #getTurn()
	 * @generated
	 */
	EReference getTurn_Modality();

	/**
	 * Returns the meta object for the containment reference '{@link org.carim.model.Turn#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context</em>'.
	 * @see org.carim.model.Turn#getContext()
	 * @see #getTurn()
	 * @generated
	 */
	EReference getTurn_Context();

	/**
	 * Returns the meta object for class '{@link org.carim.model.UserAttitude <em>User Attitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Attitude</em>'.
	 * @see org.carim.model.UserAttitude
	 * @generated
	 */
	EClass getUserAttitude();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.UserAttitude#getUsefulness <em>Usefulness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usefulness</em>'.
	 * @see org.carim.model.UserAttitude#getUsefulness()
	 * @see #getUserAttitude()
	 * @generated
	 */
	EAttribute getUserAttitude_Usefulness();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.UserAttitude#getPleasantness <em>Pleasantness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pleasantness</em>'.
	 * @see org.carim.model.UserAttitude#getPleasantness()
	 * @see #getUserAttitude()
	 * @generated
	 */
	EAttribute getUserAttitude_Pleasantness();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.UserAttitude#getIntegration <em>Integration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Integration</em>'.
	 * @see org.carim.model.UserAttitude#getIntegration()
	 * @see #getUserAttitude()
	 * @generated
	 */
	EAttribute getUserAttitude_Integration();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.UserAttitude#getSelfEfficacy <em>Self Efficacy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Self Efficacy</em>'.
	 * @see org.carim.model.UserAttitude#getSelfEfficacy()
	 * @see #getUserAttitude()
	 * @generated
	 */
	EAttribute getUserAttitude_SelfEfficacy();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.UserAttitude#getComfort <em>Comfort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comfort</em>'.
	 * @see org.carim.model.UserAttitude#getComfort()
	 * @see #getUserAttitude()
	 * @generated
	 */
	EAttribute getUserAttitude_Comfort();

	/**
	 * Returns the meta object for class '{@link org.carim.model.UserData <em>User Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Data</em>'.
	 * @see org.carim.model.UserData
	 * @generated
	 */
	EClass getUserData();

	/**
	 * Returns the meta object for the containment reference list '{@link org.carim.model.UserData#getUserRatings <em>User Ratings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>User Ratings</em>'.
	 * @see org.carim.model.UserData#getUserRatings()
	 * @see #getUserData()
	 * @generated
	 */
	EReference getUserData_UserRatings();

	/**
	 * Returns the meta object for the attribute list '{@link org.carim.model.UserData#getUserMood <em>User Mood</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>User Mood</em>'.
	 * @see org.carim.model.UserData#getUserMood()
	 * @see #getUserData()
	 * @generated
	 */
	EAttribute getUserData_UserMood();

	/**
	 * Returns the meta object for the containment reference '{@link org.carim.model.UserData#getUserAttitude <em>User Attitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User Attitude</em>'.
	 * @see org.carim.model.UserData#getUserAttitude()
	 * @see #getUserData()
	 * @generated
	 */
	EReference getUserData_UserAttitude();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.UserData#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age</em>'.
	 * @see org.carim.model.UserData#getAge()
	 * @see #getUserData()
	 * @generated
	 */
	EAttribute getUserData_Age();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.UserData#getGender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gender</em>'.
	 * @see org.carim.model.UserData#getGender()
	 * @see #getUserData()
	 * @generated
	 */
	EAttribute getUserData_Gender();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.UserData#getEducationLevel <em>Education Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Education Level</em>'.
	 * @see org.carim.model.UserData#getEducationLevel()
	 * @see #getUserData()
	 * @generated
	 */
	EAttribute getUserData_EducationLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.UserData#getPreviousExperience <em>Previous Experience</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Previous Experience</em>'.
	 * @see org.carim.model.UserData#getPreviousExperience()
	 * @see #getUserData()
	 * @generated
	 */
	EAttribute getUserData_PreviousExperience();

	/**
	 * Returns the meta object for class '{@link org.carim.model.UserMetacomm <em>User Metacomm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Metacomm</em>'.
	 * @see org.carim.model.UserMetacomm
	 * @generated
	 */
	EClass getUserMetacomm();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.UserMetacomm#isIsTimeOut <em>Is Time Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Time Out</em>'.
	 * @see org.carim.model.UserMetacomm#isIsTimeOut()
	 * @see #getUserMetacomm()
	 * @generated
	 */
	EAttribute getUserMetacomm_IsTimeOut();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.UserMetacomm#isIsCancel <em>Is Cancel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Cancel</em>'.
	 * @see org.carim.model.UserMetacomm#isIsCancel()
	 * @see #getUserMetacomm()
	 * @generated
	 */
	EAttribute getUserMetacomm_IsCancel();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.UserMetacomm#isIsRestart <em>Is Restart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Restart</em>'.
	 * @see org.carim.model.UserMetacomm#isIsRestart()
	 * @see #getUserMetacomm()
	 * @generated
	 */
	EAttribute getUserMetacomm_IsRestart();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.UserMetacomm#isIsBargein <em>Is Bargein</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Bargein</em>'.
	 * @see org.carim.model.UserMetacomm#isIsBargein()
	 * @see #getUserMetacomm()
	 * @generated
	 */
	EAttribute getUserMetacomm_IsBargein();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.UserMetacomm#isIsSuccessfulBargein <em>Is Successful Bargein</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Successful Bargein</em>'.
	 * @see org.carim.model.UserMetacomm#isIsSuccessfulBargein()
	 * @see #getUserMetacomm()
	 * @generated
	 */
	EAttribute getUserMetacomm_IsSuccessfulBargein();

	/**
	 * Returns the meta object for class '{@link org.carim.model.UserRatings <em>User Ratings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Ratings</em>'.
	 * @see org.carim.model.UserRatings
	 * @generated
	 */
	EClass getUserRatings();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.UserRatings#getPractical <em>Practical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Practical</em>'.
	 * @see org.carim.model.UserRatings#getPractical()
	 * @see #getUserRatings()
	 * @generated
	 */
	EAttribute getUserRatings_Practical();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.UserRatings#getPredictable <em>Predictable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Predictable</em>'.
	 * @see org.carim.model.UserRatings#getPredictable()
	 * @see #getUserRatings()
	 * @generated
	 */
	EAttribute getUserRatings_Predictable();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.UserRatings#getClearlyStructured <em>Clearly Structured</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clearly Structured</em>'.
	 * @see org.carim.model.UserRatings#getClearlyStructured()
	 * @see #getUserRatings()
	 * @generated
	 */
	EAttribute getUserRatings_ClearlyStructured();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.UserRatings#getSimple <em>Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Simple</em>'.
	 * @see org.carim.model.UserRatings#getSimple()
	 * @see #getUserRatings()
	 * @generated
	 */
	EAttribute getUserRatings_Simple();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.UserRatings#getStylish <em>Stylish</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stylish</em>'.
	 * @see org.carim.model.UserRatings#getStylish()
	 * @see #getUserRatings()
	 * @generated
	 */
	EAttribute getUserRatings_Stylish();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.UserRatings#getPremium <em>Premium</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Premium</em>'.
	 * @see org.carim.model.UserRatings#getPremium()
	 * @see #getUserRatings()
	 * @generated
	 */
	EAttribute getUserRatings_Premium();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.UserRatings#getCreative <em>Creative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creative</em>'.
	 * @see org.carim.model.UserRatings#getCreative()
	 * @see #getUserRatings()
	 * @generated
	 */
	EAttribute getUserRatings_Creative();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.UserRatings#getCaptivating <em>Captivating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Captivating</em>'.
	 * @see org.carim.model.UserRatings#getCaptivating()
	 * @see #getUserRatings()
	 * @generated
	 */
	EAttribute getUserRatings_Captivating();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.UserRatings#getBeautiful <em>Beautiful</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beautiful</em>'.
	 * @see org.carim.model.UserRatings#getBeautiful()
	 * @see #getUserRatings()
	 * @generated
	 */
	EAttribute getUserRatings_Beautiful();

	/**
	 * Returns the meta object for the attribute '{@link org.carim.model.UserRatings#getGood <em>Good</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Good</em>'.
	 * @see org.carim.model.UserRatings#getGood()
	 * @see #getUserRatings()
	 * @generated
	 */
	EAttribute getUserRatings_Good();

	/**
	 * Returns the meta object for class '{@link org.carim.model.UserTurn <em>User Turn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Turn</em>'.
	 * @see org.carim.model.UserTurn
	 * @generated
	 */
	EClass getUserTurn();

	/**
	 * Returns the meta object for the containment reference '{@link org.carim.model.UserTurn#getMetacomm <em>Metacomm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metacomm</em>'.
	 * @see org.carim.model.UserTurn#getMetacomm()
	 * @see #getUserTurn()
	 * @generated
	 */
	EReference getUserTurn_Metacomm();

	/**
	 * Returns the meta object for the containment reference '{@link org.carim.model.UserTurn#getSpeechInput <em>Speech Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Speech Input</em>'.
	 * @see org.carim.model.UserTurn#getSpeechInput()
	 * @see #getUserTurn()
	 * @generated
	 */
	EReference getUserTurn_SpeechInput();

	/**
	 * Returns the meta object for the containment reference '{@link org.carim.model.UserTurn#getGuiInput <em>Gui Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gui Input</em>'.
	 * @see org.carim.model.UserTurn#getGuiInput()
	 * @see #getUserTurn()
	 * @generated
	 */
	EReference getUserTurn_GuiInput();

	/**
	 * Returns the meta object for the containment reference '{@link org.carim.model.UserTurn#getMotionInput <em>Motion Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Motion Input</em>'.
	 * @see org.carim.model.UserTurn#getMotionInput()
	 * @see #getUserTurn()
	 * @generated
	 */
	EReference getUserTurn_MotionInput();

	/**
	 * Returns the meta object for enum '{@link org.carim.model.ContextualAppropriatenessT <em>Contextual Appropriateness T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contextual Appropriateness T</em>'.
	 * @see org.carim.model.ContextualAppropriatenessT
	 * @generated
	 */
	EEnum getContextualAppropriatenessT();

	/**
	 * Returns the meta object for enum '{@link org.carim.model.DeviceTypeT <em>Device Type T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Device Type T</em>'.
	 * @see org.carim.model.DeviceTypeT
	 * @generated
	 */
	EEnum getDeviceTypeT();

	/**
	 * Returns the meta object for enum '{@link org.carim.model.EducationLevelT <em>Education Level T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Education Level T</em>'.
	 * @see org.carim.model.EducationLevelT
	 * @generated
	 */
	EEnum getEducationLevelT();

	/**
	 * Returns the meta object for enum '{@link org.carim.model.GenderT <em>Gender T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gender T</em>'.
	 * @see org.carim.model.GenderT
	 * @generated
	 */
	EEnum getGenderT();

	/**
	 * Returns the meta object for enum '{@link org.carim.model.LocationT <em>Location T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Location T</em>'.
	 * @see org.carim.model.LocationT
	 * @generated
	 */
	EEnum getLocationT();

	/**
	 * Returns the meta object for enum '{@link org.carim.model.McReasonT <em>Mc Reason T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mc Reason T</em>'.
	 * @see org.carim.model.McReasonT
	 * @generated
	 */
	EEnum getMcReasonT();

	/**
	 * Returns the meta object for enum '{@link org.carim.model.MmiTypeT <em>Mmi Type T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mmi Type T</em>'.
	 * @see org.carim.model.MmiTypeT
	 * @generated
	 */
	EEnum getMmiTypeT();

	/**
	 * Returns the meta object for enum '{@link org.carim.model.MobilityLevelT <em>Mobility Level T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mobility Level T</em>'.
	 * @see org.carim.model.MobilityLevelT
	 * @generated
	 */
	EEnum getMobilityLevelT();

	/**
	 * Returns the meta object for enum '{@link org.carim.model.ModAppropT <em>Mod Approp T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mod Approp T</em>'.
	 * @see org.carim.model.ModAppropT
	 * @generated
	 */
	EEnum getModAppropT();

	/**
	 * Returns the meta object for enum '{@link org.carim.model.ModTypeT <em>Mod Type T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mod Type T</em>'.
	 * @see org.carim.model.ModTypeT
	 * @generated
	 */
	EEnum getModTypeT();

	/**
	 * Returns the meta object for enum '{@link org.carim.model.ParsingResultT <em>Parsing Result T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parsing Result T</em>'.
	 * @see org.carim.model.ParsingResultT
	 * @generated
	 */
	EEnum getParsingResultT();

	/**
	 * Returns the meta object for enum '{@link org.carim.model.PreviousExperienceT <em>Previous Experience T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Previous Experience T</em>'.
	 * @see org.carim.model.PreviousExperienceT
	 * @generated
	 */
	EEnum getPreviousExperienceT();

	/**
	 * Returns the meta object for enum '{@link org.carim.model.PromptTypeT <em>Prompt Type T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Prompt Type T</em>'.
	 * @see org.carim.model.PromptTypeT
	 * @generated
	 */
	EEnum getPromptTypeT();

	/**
	 * Returns the meta object for enum '{@link org.carim.model.RoleT <em>Role T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Role T</em>'.
	 * @see org.carim.model.RoleT
	 * @generated
	 */
	EEnum getRoleT();

	/**
	 * Returns the meta object for enum '{@link org.carim.model.ScreenOrientationT <em>Screen Orientation T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Screen Orientation T</em>'.
	 * @see org.carim.model.ScreenOrientationT
	 * @generated
	 */
	EEnum getScreenOrientationT();

	/**
	 * Returns the meta object for enum '{@link org.carim.model.ScreenResolutionT <em>Screen Resolution T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Screen Resolution T</em>'.
	 * @see org.carim.model.ScreenResolutionT
	 * @generated
	 */
	EEnum getScreenResolutionT();

	/**
	 * Returns the meta object for enum '{@link org.carim.model.ScreenSizeT <em>Screen Size T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Screen Size T</em>'.
	 * @see org.carim.model.ScreenSizeT
	 * @generated
	 */
	EEnum getScreenSizeT();

	/**
	 * Returns the meta object for enum '{@link org.carim.model.SocialArenaT <em>Social Arena T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Social Arena T</em>'.
	 * @see org.carim.model.SocialArenaT
	 * @generated
	 */
	EEnum getSocialArenaT();

	/**
	 * Returns the meta object for enum '{@link org.carim.model.SocialCompanyT <em>Social Company T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Social Company T</em>'.
	 * @see org.carim.model.SocialCompanyT
	 * @generated
	 */
	EEnum getSocialCompanyT();

	/**
	 * Returns the meta object for enum '{@link org.carim.model.TaskSuccessT <em>Task Success T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Task Success T</em>'.
	 * @see org.carim.model.TaskSuccessT
	 * @generated
	 */
	EEnum getTaskSuccessT();

	/**
	 * Returns the meta object for enum '{@link org.carim.model.WeatherT <em>Weather T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Weather T</em>'.
	 * @see org.carim.model.WeatherT
	 * @generated
	 */
	EEnum getWeatherT();

	/**
	 * Returns the meta object for enum '{@link org.carim.model.WirelessAccessTypeT <em>Wireless Access Type T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Wireless Access Type T</em>'.
	 * @see org.carim.model.WirelessAccessTypeT
	 * @generated
	 */
	EEnum getWirelessAccessTypeT();

	/**
	 * Returns the meta object for data type '{@link org.carim.model.ContextualAppropriatenessT <em>Contextual Appropriateness TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Contextual Appropriateness TObject</em>'.
	 * @see org.carim.model.ContextualAppropriatenessT
	 * @model instanceClass="org.carim.model.ContextualAppropriatenessT"
	 *        extendedMetaData="name='contextual_appropriateness_t:Object' baseType='contextual_appropriateness_t'"
	 * @generated
	 */
	EDataType getContextualAppropriatenessTObject();

	/**
	 * Returns the meta object for data type '<em>DDay Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>DDay Type</em>'.
	 * @model instanceClass="int"
	 *        extendedMetaData="name='d_day_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#int' minInclusive='1' maxInclusive='31'"
	 * @generated
	 */
	EDataType getDDayType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>DDay Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>DDay Type Object</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 *        extendedMetaData="name='d_day_._type:Object' baseType='d_day_._type'"
	 * @generated
	 */
	EDataType getDDayTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.carim.model.DeviceTypeT <em>Device Type TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Device Type TObject</em>'.
	 * @see org.carim.model.DeviceTypeT
	 * @model instanceClass="org.carim.model.DeviceTypeT"
	 *        extendedMetaData="name='device_type_t:Object' baseType='device_type_t'"
	 * @generated
	 */
	EDataType getDeviceTypeTObject();

	/**
	 * Returns the meta object for data type '<em>DMonth Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>DMonth Type</em>'.
	 * @model instanceClass="int"
	 *        extendedMetaData="name='d_month_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#int' minInclusive='1' maxInclusive='12'"
	 * @generated
	 */
	EDataType getDMonthType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>DMonth Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>DMonth Type Object</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 *        extendedMetaData="name='d_month_._type:Object' baseType='d_month_._type'"
	 * @generated
	 */
	EDataType getDMonthTypeObject();

	/**
	 * Returns the meta object for data type '<em>DYear Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>DYear Type</em>'.
	 * @model instanceClass="int"
	 *        extendedMetaData="name='d_year_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#int' minInclusive='1980'"
	 * @generated
	 */
	EDataType getDYearType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>DYear Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>DYear Type Object</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 *        extendedMetaData="name='d_year_._type:Object' baseType='d_year_._type'"
	 * @generated
	 */
	EDataType getDYearTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.carim.model.EducationLevelT <em>Education Level TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Education Level TObject</em>'.
	 * @see org.carim.model.EducationLevelT
	 * @model instanceClass="org.carim.model.EducationLevelT"
	 *        extendedMetaData="name='education_level_t:Object' baseType='education_level_t'"
	 * @generated
	 */
	EDataType getEducationLevelTObject();

	/**
	 * Returns the meta object for data type '{@link org.carim.model.GenderT <em>Gender TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Gender TObject</em>'.
	 * @see org.carim.model.GenderT
	 * @model instanceClass="org.carim.model.GenderT"
	 *        extendedMetaData="name='gender_t:Object' baseType='gender_t'"
	 * @generated
	 */
	EDataType getGenderTObject();

	/**
	 * Returns the meta object for data type '<em>Likert5 Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Likert5 Value</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="name='likert5_value' baseType='http://www.eclipse.org/emf/2003/XMLType#float' minInclusive='0' maxInclusive='4'"
	 * @generated
	 */
	EDataType getLikert5Value();

	/**
	 * Returns the meta object for data type '{@link java.lang.Float <em>Likert5 Value Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Likert5 Value Object</em>'.
	 * @see java.lang.Float
	 * @model instanceClass="java.lang.Float"
	 *        extendedMetaData="name='likert5_value:Object' baseType='likert5_value'"
	 * @generated
	 */
	EDataType getLikert5ValueObject();

	/**
	 * Returns the meta object for data type '<em>Likert7 Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Likert7 Value</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="name='likert7_value' baseType='http://www.eclipse.org/emf/2003/XMLType#float' minInclusive='0' maxInclusive='6'"
	 * @generated
	 */
	EDataType getLikert7Value();

	/**
	 * Returns the meta object for data type '{@link java.lang.Float <em>Likert7 Value Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Likert7 Value Object</em>'.
	 * @see java.lang.Float
	 * @model instanceClass="java.lang.Float"
	 *        extendedMetaData="name='likert7_value:Object' baseType='likert7_value'"
	 * @generated
	 */
	EDataType getLikert7ValueObject();

	/**
	 * Returns the meta object for data type '{@link org.carim.model.LocationT <em>Location TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Location TObject</em>'.
	 * @see org.carim.model.LocationT
	 * @model instanceClass="org.carim.model.LocationT"
	 *        extendedMetaData="name='location_t:Object' baseType='location_t'"
	 * @generated
	 */
	EDataType getLocationTObject();

	/**
	 * Returns the meta object for data type '{@link org.carim.model.McReasonT <em>Mc Reason TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Mc Reason TObject</em>'.
	 * @see org.carim.model.McReasonT
	 * @model instanceClass="org.carim.model.McReasonT"
	 *        extendedMetaData="name='mc_reason_t:Object' baseType='mc_reason_t'"
	 * @generated
	 */
	EDataType getMcReasonTObject();

	/**
	 * Returns the meta object for data type '{@link org.carim.model.MmiTypeT <em>Mmi Type TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Mmi Type TObject</em>'.
	 * @see org.carim.model.MmiTypeT
	 * @model instanceClass="org.carim.model.MmiTypeT"
	 *        extendedMetaData="name='mmi_type_t:Object' baseType='mmi_type_t'"
	 * @generated
	 */
	EDataType getMmiTypeTObject();

	/**
	 * Returns the meta object for data type '{@link org.carim.model.MobilityLevelT <em>Mobility Level TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Mobility Level TObject</em>'.
	 * @see org.carim.model.MobilityLevelT
	 * @model instanceClass="org.carim.model.MobilityLevelT"
	 *        extendedMetaData="name='mobility_level_t:Object' baseType='mobility_level_t'"
	 * @generated
	 */
	EDataType getMobilityLevelTObject();

	/**
	 * Returns the meta object for data type '{@link org.carim.model.ModAppropT <em>Mod Approp TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Mod Approp TObject</em>'.
	 * @see org.carim.model.ModAppropT
	 * @model instanceClass="org.carim.model.ModAppropT"
	 *        extendedMetaData="name='mod_approp_t:Object' baseType='mod_approp_t'"
	 * @generated
	 */
	EDataType getModAppropTObject();

	/**
	 * Returns the meta object for data type '{@link org.carim.model.ModTypeT <em>Mod Type TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Mod Type TObject</em>'.
	 * @see org.carim.model.ModTypeT
	 * @model instanceClass="org.carim.model.ModTypeT"
	 *        extendedMetaData="name='mod_type_t:Object' baseType='mod_type_t'"
	 * @generated
	 */
	EDataType getModTypeTObject();

	/**
	 * Returns the meta object for data type '{@link org.carim.model.ParsingResultT <em>Parsing Result TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Parsing Result TObject</em>'.
	 * @see org.carim.model.ParsingResultT
	 * @model instanceClass="org.carim.model.ParsingResultT"
	 *        extendedMetaData="name='parsing_result_t:Object' baseType='parsing_result_t'"
	 * @generated
	 */
	EDataType getParsingResultTObject();

	/**
	 * Returns the meta object for data type '<em>Percentage T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Percentage T</em>'.
	 * @model instanceClass="int"
	 *        extendedMetaData="name='percentage_t' baseType='http://www.eclipse.org/emf/2003/XMLType#int' minInclusive='0' maxInclusive='100'"
	 * @generated
	 */
	EDataType getPercentageT();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>Percentage TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Percentage TObject</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 *        extendedMetaData="name='percentage_t:Object' baseType='percentage_t'"
	 * @generated
	 */
	EDataType getPercentageTObject();

	/**
	 * Returns the meta object for data type '{@link org.carim.model.PreviousExperienceT <em>Previous Experience TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Previous Experience TObject</em>'.
	 * @see org.carim.model.PreviousExperienceT
	 * @model instanceClass="org.carim.model.PreviousExperienceT"
	 *        extendedMetaData="name='previous_experience_t:Object' baseType='previous_experience_t'"
	 * @generated
	 */
	EDataType getPreviousExperienceTObject();

	/**
	 * Returns the meta object for data type '{@link org.carim.model.PromptTypeT <em>Prompt Type TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Prompt Type TObject</em>'.
	 * @see org.carim.model.PromptTypeT
	 * @model instanceClass="org.carim.model.PromptTypeT"
	 *        extendedMetaData="name='prompt_type_t:Object' baseType='prompt_type_t'"
	 * @generated
	 */
	EDataType getPromptTypeTObject();

	/**
	 * Returns the meta object for data type '{@link org.carim.model.RoleT <em>Role TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Role TObject</em>'.
	 * @see org.carim.model.RoleT
	 * @model instanceClass="org.carim.model.RoleT"
	 *        extendedMetaData="name='role_t:Object' baseType='role_t'"
	 * @generated
	 */
	EDataType getRoleTObject();

	/**
	 * Returns the meta object for data type '{@link org.carim.model.ScreenOrientationT <em>Screen Orientation TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Screen Orientation TObject</em>'.
	 * @see org.carim.model.ScreenOrientationT
	 * @model instanceClass="org.carim.model.ScreenOrientationT"
	 *        extendedMetaData="name='screen_orientation_t:Object' baseType='screen_orientation_t'"
	 * @generated
	 */
	EDataType getScreenOrientationTObject();

	/**
	 * Returns the meta object for data type '{@link org.carim.model.ScreenResolutionT <em>Screen Resolution TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Screen Resolution TObject</em>'.
	 * @see org.carim.model.ScreenResolutionT
	 * @model instanceClass="org.carim.model.ScreenResolutionT"
	 *        extendedMetaData="name='screen_resolution_t:Object' baseType='screen_resolution_t'"
	 * @generated
	 */
	EDataType getScreenResolutionTObject();

	/**
	 * Returns the meta object for data type '{@link org.carim.model.ScreenSizeT <em>Screen Size TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Screen Size TObject</em>'.
	 * @see org.carim.model.ScreenSizeT
	 * @model instanceClass="org.carim.model.ScreenSizeT"
	 *        extendedMetaData="name='screen_size_t:Object' baseType='screen_size_t'"
	 * @generated
	 */
	EDataType getScreenSizeTObject();

	/**
	 * Returns the meta object for data type '{@link org.carim.model.SocialArenaT <em>Social Arena TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Social Arena TObject</em>'.
	 * @see org.carim.model.SocialArenaT
	 * @model instanceClass="org.carim.model.SocialArenaT"
	 *        extendedMetaData="name='social_arena_t:Object' baseType='social_arena_t'"
	 * @generated
	 */
	EDataType getSocialArenaTObject();

	/**
	 * Returns the meta object for data type '{@link org.carim.model.SocialCompanyT <em>Social Company TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Social Company TObject</em>'.
	 * @see org.carim.model.SocialCompanyT
	 * @model instanceClass="org.carim.model.SocialCompanyT"
	 *        extendedMetaData="name='social_company_t:Object' baseType='social_company_t'"
	 * @generated
	 */
	EDataType getSocialCompanyTObject();

	/**
	 * Returns the meta object for data type '{@link org.carim.model.TaskSuccessT <em>Task Success TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Task Success TObject</em>'.
	 * @see org.carim.model.TaskSuccessT
	 * @model instanceClass="org.carim.model.TaskSuccessT"
	 *        extendedMetaData="name='task_success_t:Object' baseType='task_success_t'"
	 * @generated
	 */
	EDataType getTaskSuccessTObject();

	/**
	 * Returns the meta object for data type '<em>THours Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>THours Type</em>'.
	 * @model instanceClass="int"
	 *        extendedMetaData="name='t_hours_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#int' minInclusive='0' maxExclusive='24'"
	 * @generated
	 */
	EDataType getTHoursType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>THours Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>THours Type Object</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 *        extendedMetaData="name='t_hours_._type:Object' baseType='t_hours_._type'"
	 * @generated
	 */
	EDataType getTHoursTypeObject();

	/**
	 * Returns the meta object for data type '<em>TMins Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TMins Type</em>'.
	 * @model instanceClass="int"
	 *        extendedMetaData="name='t_mins_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#int' minInclusive='0' maxExclusive='60'"
	 * @generated
	 */
	EDataType getTMinsType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>TMins Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TMins Type Object</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 *        extendedMetaData="name='t_mins_._type:Object' baseType='t_mins_._type'"
	 * @generated
	 */
	EDataType getTMinsTypeObject();

	/**
	 * Returns the meta object for data type '<em>TSecs Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TSecs Type</em>'.
	 * @model instanceClass="int"
	 *        extendedMetaData="name='t_secs_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#int' minInclusive='0' maxExclusive='60'"
	 * @generated
	 */
	EDataType getTSecsType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>TSecs Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TSecs Type Object</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 *        extendedMetaData="name='t_secs_._type:Object' baseType='t_secs_._type'"
	 * @generated
	 */
	EDataType getTSecsTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.carim.model.WeatherT <em>Weather TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Weather TObject</em>'.
	 * @see org.carim.model.WeatherT
	 * @model instanceClass="org.carim.model.WeatherT"
	 *        extendedMetaData="name='weather_t:Object' baseType='weather_t'"
	 * @generated
	 */
	EDataType getWeatherTObject();

	/**
	 * Returns the meta object for data type '{@link org.carim.model.WirelessAccessTypeT <em>Wireless Access Type TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Wireless Access Type TObject</em>'.
	 * @see org.carim.model.WirelessAccessTypeT
	 * @model instanceClass="org.carim.model.WirelessAccessTypeT"
	 *        extendedMetaData="name='wireless_access_type_t:Object' baseType='wireless_access_type_t'"
	 * @generated
	 */
	EDataType getWirelessAccessTypeTObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	carimModelFactory getcarimModelFactory();

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
		 * The meta object literal for the '{@link org.carim.model.impl.AttitudeImpl <em>Attitude</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.impl.AttitudeImpl
		 * @see org.carim.model.impl.carimModelPackageImpl#getAttitude()
		 * @generated
		 */
		EClass ATTITUDE = eINSTANCE.getAttitude();

		/**
		 * The meta object literal for the '{@link org.carim.model.impl.AvmImpl <em>Avm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.impl.AvmImpl
		 * @see org.carim.model.impl.carimModelPackageImpl#getAvm()
		 * @generated
		 */
		EClass AVM = eINSTANCE.getAvm();

		/**
		 * The meta object literal for the '{@link org.carim.model.impl.CommunicationContextImpl <em>Communication Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.impl.CommunicationContextImpl
		 * @see org.carim.model.impl.carimModelPackageImpl#getCommunicationContext()
		 * @generated
		 */
		EClass COMMUNICATION_CONTEXT = eINSTANCE.getCommunicationContext();

		/**
		 * The meta object literal for the '<em><b>Wireless Access Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_CONTEXT__WIRELESS_ACCESS_TYPE = eINSTANCE.getCommunicationContext_WirelessAccessType();

		/**
		 * The meta object literal for the '<em><b>Access Point Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_CONTEXT__ACCESS_POINT_NAME = eINSTANCE.getCommunicationContext_AccessPointName();

		/**
		 * The meta object literal for the '<em><b>Signal Strength</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_CONTEXT__SIGNAL_STRENGTH = eINSTANCE.getCommunicationContext_SignalStrength();

		/**
		 * The meta object literal for the '<em><b>Received Data Throughput</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_CONTEXT__RECEIVED_DATA_THROUGHPUT = eINSTANCE.getCommunicationContext_ReceivedDataThroughput();

		/**
		 * The meta object literal for the '<em><b>Sent Data Throughput</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_CONTEXT__SENT_DATA_THROUGHPUT = eINSTANCE.getCommunicationContext_SentDataThroughput();

		/**
		 * The meta object literal for the '<em><b>Rtt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_CONTEXT__RTT = eINSTANCE.getCommunicationContext_Rtt();

		/**
		 * The meta object literal for the '<em><b>Srt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_CONTEXT__SRT = eINSTANCE.getCommunicationContext_Srt();

		/**
		 * The meta object literal for the '{@link org.carim.model.impl.CooperativityImpl <em>Cooperativity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.impl.CooperativityImpl
		 * @see org.carim.model.impl.carimModelPackageImpl#getCooperativity()
		 * @generated
		 */
		EClass COOPERATIVITY = eINSTANCE.getCooperativity();

		/**
		 * The meta object literal for the '<em><b>Contextual Appropriateness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COOPERATIVITY__CONTEXTUAL_APPROPRIATENESS = eINSTANCE.getCooperativity_ContextualAppropriateness();

		/**
		 * The meta object literal for the '{@link org.carim.model.impl.DateTimeTImpl <em>Date Time T</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.impl.DateTimeTImpl
		 * @see org.carim.model.impl.carimModelPackageImpl#getDateTimeT()
		 * @generated
		 */
		EClass DATE_TIME_T = eINSTANCE.getDateTimeT();

		/**
		 * The meta object literal for the '<em><b>DDay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TIME_T__DDAY = eINSTANCE.getDateTimeT_DDay();

		/**
		 * The meta object literal for the '<em><b>DMonth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TIME_T__DMONTH = eINSTANCE.getDateTimeT_DMonth();

		/**
		 * The meta object literal for the '<em><b>DYear</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TIME_T__DYEAR = eINSTANCE.getDateTimeT_DYear();

		/**
		 * The meta object literal for the '<em><b>THours</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TIME_T__THOURS = eINSTANCE.getDateTimeT_THours();

		/**
		 * The meta object literal for the '<em><b>TMins</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TIME_T__TMINS = eINSTANCE.getDateTimeT_TMins();

		/**
		 * The meta object literal for the '<em><b>TSecs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TIME_T__TSECS = eINSTANCE.getDateTimeT_TSecs();

		/**
		 * The meta object literal for the '{@link org.carim.model.impl.DeviceContextImpl <em>Device Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.impl.DeviceContextImpl
		 * @see org.carim.model.impl.carimModelPackageImpl#getDeviceContext()
		 * @generated
		 */
		EClass DEVICE_CONTEXT = eINSTANCE.getDeviceContext();

		/**
		 * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_CONTEXT__DEVICE_TYPE = eINSTANCE.getDeviceContext_DeviceType();

		/**
		 * The meta object literal for the '<em><b>Screen Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_CONTEXT__SCREEN_SIZE = eINSTANCE.getDeviceContext_ScreenSize();

		/**
		 * The meta object literal for the '<em><b>Screen Resolution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_CONTEXT__SCREEN_RESOLUTION = eINSTANCE.getDeviceContext_ScreenResolution();

		/**
		 * The meta object literal for the '<em><b>Screen Orientation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_CONTEXT__SCREEN_ORIENTATION = eINSTANCE.getDeviceContext_ScreenOrientation();

		/**
		 * The meta object literal for the '<em><b>Screen Brightness Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_CONTEXT__SCREEN_BRIGHTNESS_LEVEL = eINSTANCE.getDeviceContext_ScreenBrightnessLevel();

		/**
		 * The meta object literal for the '<em><b>Volume Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_CONTEXT__VOLUME_LEVEL = eINSTANCE.getDeviceContext_VolumeLevel();

		/**
		 * The meta object literal for the '<em><b>Memory Usage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_CONTEXT__MEMORY_USAGE = eINSTANCE.getDeviceContext_MemoryUsage();

		/**
		 * The meta object literal for the '<em><b>Cpu Usage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_CONTEXT__CPU_USAGE = eINSTANCE.getDeviceContext_CpuUsage();

		/**
		 * The meta object literal for the '{@link org.carim.model.impl.DialogueImpl <em>Dialogue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.impl.DialogueImpl
		 * @see org.carim.model.impl.carimModelPackageImpl#getDialogue()
		 * @generated
		 */
		EClass DIALOGUE = eINSTANCE.getDialogue();

		/**
		 * The meta object literal for the '<em><b>Base Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIALOGUE__BASE_TIMESTAMP = eINSTANCE.getDialogue_BaseTimestamp();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIALOGUE__TASK = eINSTANCE.getDialogue_Task();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIALOGUE__STEP = eINSTANCE.getDialogue_Step();

		/**
		 * The meta object literal for the '{@link org.carim.model.impl.DialogueStepTImpl <em>Dialogue Step T</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.impl.DialogueStepTImpl
		 * @see org.carim.model.impl.carimModelPackageImpl#getDialogueStepT()
		 * @generated
		 */
		EClass DIALOGUE_STEP_T = eINSTANCE.getDialogueStepT();

		/**
		 * The meta object literal for the '<em><b>System Turn</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIALOGUE_STEP_T__SYSTEM_TURN = eINSTANCE.getDialogueStepT_SystemTurn();

		/**
		 * The meta object literal for the '<em><b>User Turn</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIALOGUE_STEP_T__USER_TURN = eINSTANCE.getDialogueStepT_UserTurn();

		/**
		 * The meta object literal for the '{@link org.carim.model.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.impl.DocumentRootImpl
		 * @see org.carim.model.impl.carimModelPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Trial</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TRIAL = eINSTANCE.getDocumentRoot_Trial();

		/**
		 * The meta object literal for the '{@link org.carim.model.impl.DynamicContextImpl <em>Dynamic Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.impl.DynamicContextImpl
		 * @see org.carim.model.impl.carimModelPackageImpl#getDynamicContext()
		 * @generated
		 */
		EClass DYNAMIC_CONTEXT = eINSTANCE.getDynamicContext();

		/**
		 * The meta object literal for the '<em><b>Physical Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_CONTEXT__PHYSICAL_CONTEXT = eINSTANCE.getDynamicContext_PhysicalContext();

		/**
		 * The meta object literal for the '<em><b>Social Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_CONTEXT__SOCIAL_CONTEXT = eINSTANCE.getDynamicContext_SocialContext();

		/**
		 * The meta object literal for the '<em><b>Location Time Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_CONTEXT__LOCATION_TIME_CONTEXT = eINSTANCE.getDynamicContext_LocationTimeContext();

		/**
		 * The meta object literal for the '<em><b>Device Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_CONTEXT__DEVICE_CONTEXT = eINSTANCE.getDynamicContext_DeviceContext();

		/**
		 * The meta object literal for the '<em><b>Communication Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_CONTEXT__COMMUNICATION_CONTEXT = eINSTANCE.getDynamicContext_CommunicationContext();

		/**
		 * The meta object literal for the '{@link org.carim.model.impl.GuiInputImpl <em>Gui Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.impl.GuiInputImpl
		 * @see org.carim.model.impl.carimModelPackageImpl#getGuiInput()
		 * @generated
		 */
		EClass GUI_INPUT = eINSTANCE.getGuiInput();

		/**
		 * The meta object literal for the '<em><b>Text Elements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_INPUT__TEXT_ELEMENTS = eINSTANCE.getGuiInput_TextElements();

		/**
		 * The meta object literal for the '<em><b>Navigation Actions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_INPUT__NAVIGATION_ACTIONS = eINSTANCE.getGuiInput_NavigationActions();

		/**
		 * The meta object literal for the '<em><b>Navigation Moves</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_INPUT__NAVIGATION_MOVES = eINSTANCE.getGuiInput_NavigationMoves();

		/**
		 * The meta object literal for the '<em><b>Navigation Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_INPUT__NAVIGATION_LENGTH = eINSTANCE.getGuiInput_NavigationLength();

		/**
		 * The meta object literal for the '<em><b>Exploring Actions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_INPUT__EXPLORING_ACTIONS = eINSTANCE.getGuiInput_ExploringActions();

		/**
		 * The meta object literal for the '<em><b>Transferring Actions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_INPUT__TRANSFERRING_ACTIONS = eINSTANCE.getGuiInput_TransferringActions();

		/**
		 * The meta object literal for the '{@link org.carim.model.impl.LocationTimeContextImpl <em>Location Time Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.impl.LocationTimeContextImpl
		 * @see org.carim.model.impl.carimModelPackageImpl#getLocationTimeContext()
		 * @generated
		 */
		EClass LOCATION_TIME_CONTEXT = eINSTANCE.getLocationTimeContext();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_TIME_CONTEXT__LOCATION = eINSTANCE.getLocationTimeContext_Location();

		/**
		 * The meta object literal for the '<em><b>Geo Latitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_TIME_CONTEXT__GEO_LATITUDE = eINSTANCE.getLocationTimeContext_GeoLatitude();

		/**
		 * The meta object literal for the '<em><b>Geo Longitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_TIME_CONTEXT__GEO_LONGITUDE = eINSTANCE.getLocationTimeContext_GeoLongitude();

		/**
		 * The meta object literal for the '<em><b>Mobility Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_TIME_CONTEXT__MOBILITY_LEVEL = eINSTANCE.getLocationTimeContext_MobilityLevel();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION_TIME_CONTEXT__TIME = eINSTANCE.getLocationTimeContext_Time();

		/**
		 * The meta object literal for the '{@link org.carim.model.impl.MetacommImpl <em>Metacomm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.impl.MetacommImpl
		 * @see org.carim.model.impl.carimModelPackageImpl#getMetacomm()
		 * @generated
		 */
		EClass METACOMM = eINSTANCE.getMetacomm();

		/**
		 * The meta object literal for the '<em><b>Is Help</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METACOMM__IS_HELP = eINSTANCE.getMetacomm_IsHelp();

		/**
		 * The meta object literal for the '<em><b>Is Correction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METACOMM__IS_CORRECTION = eINSTANCE.getMetacomm_IsCorrection();

		/**
		 * The meta object literal for the '{@link org.carim.model.impl.ModalityAppropriatenessImpl <em>Modality Appropriateness</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.impl.ModalityAppropriatenessImpl
		 * @see org.carim.model.impl.carimModelPackageImpl#getModalityAppropriateness()
		 * @generated
		 */
		EClass MODALITY_APPROPRIATENESS = eINSTANCE.getModalityAppropriateness();

		/**
		 * The meta object literal for the '<em><b>Appropriateness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODALITY_APPROPRIATENESS__APPROPRIATENESS = eINSTANCE.getModalityAppropriateness_Appropriateness();

		/**
		 * The meta object literal for the '{@link org.carim.model.impl.ModalityChangeImpl <em>Modality Change</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.impl.ModalityChangeImpl
		 * @see org.carim.model.impl.carimModelPackageImpl#getModalityChange()
		 * @generated
		 */
		EClass MODALITY_CHANGE = eINSTANCE.getModalityChange();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODALITY_CHANGE__ORIGIN = eINSTANCE.getModalityChange_Origin();

		/**
		 * The meta object literal for the '<em><b>Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODALITY_CHANGE__REASON = eINSTANCE.getModalityChange_Reason();

		/**
		 * The meta object literal for the '{@link org.carim.model.impl.ModalityInfoImpl <em>Modality Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.impl.ModalityInfoImpl
		 * @see org.carim.model.impl.carimModelPackageImpl#getModalityInfo()
		 * @generated
		 */
		EClass MODALITY_INFO = eINSTANCE.getModalityInfo();

		/**
		 * The meta object literal for the '<em><b>Modality Type</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODALITY_INFO__MODALITY_TYPE = eINSTANCE.getModalityInfo_ModalityType();

		/**
		 * The meta object literal for the '<em><b>Mminteraction Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODALITY_INFO__MMINTERACTION_TYPE = eINSTANCE.getModalityInfo_MminteractionType();

		/**
		 * The meta object literal for the '<em><b>Appropriateness</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODALITY_INFO__APPROPRIATENESS = eINSTANCE.getModalityInfo_Appropriateness();

		/**
		 * The meta object literal for the '<em><b>Synchroni</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODALITY_INFO__SYNCHRONI = eINSTANCE.getModalityInfo_Synchroni();

		/**
		 * The meta object literal for the '<em><b>Change</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODALITY_INFO__CHANGE = eINSTANCE.getModalityInfo_Change();

		/**
		 * The meta object literal for the '{@link org.carim.model.impl.ModalitySynchroniImpl <em>Modality Synchroni</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.impl.ModalitySynchroniImpl
		 * @see org.carim.model.impl.carimModelPackageImpl#getModalitySynchroni()
		 * @generated
		 */
		EClass MODALITY_SYNCHRONI = eINSTANCE.getModalitySynchroni();

		/**
		 * The meta object literal for the '<em><b>Nlags</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODALITY_SYNCHRONI__NLAGS = eINSTANCE.getModalitySynchroni_Nlags();

		/**
		 * The meta object literal for the '<em><b>Lagtime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODALITY_SYNCHRONI__LAGTIME = eINSTANCE.getModalitySynchroni_Lagtime();

		/**
		 * The meta object literal for the '<em><b>Nevents</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODALITY_SYNCHRONI__NEVENTS = eINSTANCE.getModalitySynchroni_Nevents();

		/**
		 * The meta object literal for the '{@link org.carim.model.impl.MotionInputImpl <em>Motion Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.impl.MotionInputImpl
		 * @see org.carim.model.impl.carimModelPackageImpl#getMotionInput()
		 * @generated
		 */
		EClass MOTION_INPUT = eINSTANCE.getMotionInput();

		/**
		 * The meta object literal for the '<em><b>Tilt Movements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOTION_INPUT__TILT_MOVEMENTS = eINSTANCE.getMotionInput_TiltMovements();

		/**
		 * The meta object literal for the '<em><b>Twist Movements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOTION_INPUT__TWIST_MOVEMENTS = eINSTANCE.getMotionInput_TwistMovements();

		/**
		 * The meta object literal for the '<em><b>Shake Movements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOTION_INPUT__SHAKE_MOVEMENTS = eINSTANCE.getMotionInput_ShakeMovements();

		/**
		 * The meta object literal for the '{@link org.carim.model.impl.PhysicalContextImpl <em>Physical Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.impl.PhysicalContextImpl
		 * @see org.carim.model.impl.carimModelPackageImpl#getPhysicalContext()
		 * @generated
		 */
		EClass PHYSICAL_CONTEXT = eINSTANCE.getPhysicalContext();

		/**
		 * The meta object literal for the '<em><b>Temperature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_CONTEXT__TEMPERATURE = eINSTANCE.getPhysicalContext_Temperature();

		/**
		 * The meta object literal for the '<em><b>Weather</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_CONTEXT__WEATHER = eINSTANCE.getPhysicalContext_Weather();

		/**
		 * The meta object literal for the '<em><b>Noise</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_CONTEXT__NOISE = eINSTANCE.getPhysicalContext_Noise();

		/**
		 * The meta object literal for the '<em><b>Light</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_CONTEXT__LIGHT = eINSTANCE.getPhysicalContext_Light();

		/**
		 * The meta object literal for the '{@link org.carim.model.impl.SocialContextImpl <em>Social Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.impl.SocialContextImpl
		 * @see org.carim.model.impl.carimModelPackageImpl#getSocialContext()
		 * @generated
		 */
		EClass SOCIAL_CONTEXT = eINSTANCE.getSocialContext();

		/**
		 * The meta object literal for the '<em><b>Company</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOCIAL_CONTEXT__COMPANY = eINSTANCE.getSocialContext_Company();

		/**
		 * The meta object literal for the '<em><b>Arena</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOCIAL_CONTEXT__ARENA = eINSTANCE.getSocialContext_Arena();

		/**
		 * The meta object literal for the '{@link org.carim.model.impl.SpeechInputImpl <em>Speech Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.impl.SpeechInputImpl
		 * @see org.carim.model.impl.carimModelPackageImpl#getSpeechInput()
		 * @generated
		 */
		EClass SPEECH_INPUT = eINSTANCE.getSpeechInput();

		/**
		 * The meta object literal for the '<em><b>Overall Words</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEECH_INPUT__OVERALL_WORDS = eINSTANCE.getSpeechInput_OverallWords();

		/**
		 * The meta object literal for the '<em><b>Substituted Words</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEECH_INPUT__SUBSTITUTED_WORDS = eINSTANCE.getSpeechInput_SubstitutedWords();

		/**
		 * The meta object literal for the '<em><b>Deleted Words</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEECH_INPUT__DELETED_WORDS = eINSTANCE.getSpeechInput_DeletedWords();

		/**
		 * The meta object literal for the '<em><b>Inserted Words</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEECH_INPUT__INSERTED_WORDS = eINSTANCE.getSpeechInput_InsertedWords();

		/**
		 * The meta object literal for the '<em><b>Overall Sentences</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEECH_INPUT__OVERALL_SENTENCES = eINSTANCE.getSpeechInput_OverallSentences();

		/**
		 * The meta object literal for the '<em><b>Substituted Sentences</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEECH_INPUT__SUBSTITUTED_SENTENCES = eINSTANCE.getSpeechInput_SubstitutedSentences();

		/**
		 * The meta object literal for the '<em><b>Deleted Sentences</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEECH_INPUT__DELETED_SENTENCES = eINSTANCE.getSpeechInput_DeletedSentences();

		/**
		 * The meta object literal for the '<em><b>Inserted Sentences</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEECH_INPUT__INSERTED_SENTENCES = eINSTANCE.getSpeechInput_InsertedSentences();

		/**
		 * The meta object literal for the '<em><b>Overall Concepts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEECH_INPUT__OVERALL_CONCEPTS = eINSTANCE.getSpeechInput_OverallConcepts();

		/**
		 * The meta object literal for the '<em><b>Substituted Concepts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEECH_INPUT__SUBSTITUTED_CONCEPTS = eINSTANCE.getSpeechInput_SubstitutedConcepts();

		/**
		 * The meta object literal for the '<em><b>Deleted Concepts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEECH_INPUT__DELETED_CONCEPTS = eINSTANCE.getSpeechInput_DeletedConcepts();

		/**
		 * The meta object literal for the '<em><b>Inserted Concepts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEECH_INPUT__INSERTED_CONCEPTS = eINSTANCE.getSpeechInput_InsertedConcepts();

		/**
		 * The meta object literal for the '<em><b>Parsing Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEECH_INPUT__PARSING_RESULT = eINSTANCE.getSpeechInput_ParsingResult();

		/**
		 * The meta object literal for the '{@link org.carim.model.impl.SpeechOutputImpl <em>Speech Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.impl.SpeechOutputImpl
		 * @see org.carim.model.impl.carimModelPackageImpl#getSpeechOutput()
		 * @generated
		 */
		EClass SPEECH_OUTPUT = eINSTANCE.getSpeechOutput();

		/**
		 * The meta object literal for the '<em><b>ANCO</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEECH_OUTPUT__ANCO = eINSTANCE.getSpeechOutput_ANCO();

		/**
		 * The meta object literal for the '<em><b>ANIN</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEECH_OUTPUT__ANIN = eINSTANCE.getSpeechOutput_ANIN();

		/**
		 * The meta object literal for the '<em><b>ANPA</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEECH_OUTPUT__ANPA = eINSTANCE.getSpeechOutput_ANPA();

		/**
		 * The meta object literal for the '<em><b>ANFA</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEECH_OUTPUT__ANFA = eINSTANCE.getSpeechOutput_ANFA();

		/**
		 * The meta object literal for the '<em><b>Prompt Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEECH_OUTPUT__PROMPT_TYPE = eINSTANCE.getSpeechOutput_PromptType();

		/**
		 * The meta object literal for the '{@link org.carim.model.impl.SystemMetacommImpl <em>System Metacomm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.impl.SystemMetacommImpl
		 * @see org.carim.model.impl.carimModelPackageImpl#getSystemMetacomm()
		 * @generated
		 */
		EClass SYSTEM_METACOMM = eINSTANCE.getSystemMetacomm();

		/**
		 * The meta object literal for the '<em><b>Is ASR Reject</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_METACOMM__IS_ASR_REJECT = eINSTANCE.getSystemMetacomm_IsASRReject();

		/**
		 * The meta object literal for the '<em><b>Is DIV Reject</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_METACOMM__IS_DIV_REJECT = eINSTANCE.getSystemMetacomm_IsDIVReject();

		/**
		 * The meta object literal for the '<em><b>Is GR Reject</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_METACOMM__IS_GR_REJECT = eINSTANCE.getSystemMetacomm_IsGRReject();

		/**
		 * The meta object literal for the '{@link org.carim.model.impl.SystemTurnImpl <em>System Turn</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.impl.SystemTurnImpl
		 * @see org.carim.model.impl.carimModelPackageImpl#getSystemTurn()
		 * @generated
		 */
		EClass SYSTEM_TURN = eINSTANCE.getSystemTurn();

		/**
		 * The meta object literal for the '<em><b>Metacomm</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_TURN__METACOMM = eINSTANCE.getSystemTurn_Metacomm();

		/**
		 * The meta object literal for the '<em><b>Speech Output</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_TURN__SPEECH_OUTPUT = eINSTANCE.getSystemTurn_SpeechOutput();

		/**
		 * The meta object literal for the '<em><b>Cooperativity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_TURN__COOPERATIVITY = eINSTANCE.getSystemTurn_Cooperativity();

		/**
		 * The meta object literal for the '{@link org.carim.model.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.impl.TaskImpl
		 * @see org.carim.model.impl.carimModelPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Success</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__SUCCESS = eINSTANCE.getTask_Success();

		/**
		 * The meta object literal for the '<em><b>Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__REASON = eINSTANCE.getTask_Reason();

		/**
		 * The meta object literal for the '<em><b>Avm</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__AVM = eINSTANCE.getTask_Avm();

		/**
		 * The meta object literal for the '{@link org.carim.model.impl.TrialImpl <em>Trial</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.impl.TrialImpl
		 * @see org.carim.model.impl.carimModelPackageImpl#getTrial()
		 * @generated
		 */
		EClass TRIAL = eINSTANCE.getTrial();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIAL__DESCRIPTION = eINSTANCE.getTrial_Description();

		/**
		 * The meta object literal for the '<em><b>User Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIAL__USER_DATA = eINSTANCE.getTrial_UserData();

		/**
		 * The meta object literal for the '<em><b>Dialogues</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIAL__DIALOGUES = eINSTANCE.getTrial_Dialogues();

		/**
		 * The meta object literal for the '{@link org.carim.model.impl.TurnImpl <em>Turn</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.impl.TurnImpl
		 * @see org.carim.model.impl.carimModelPackageImpl#getTurn()
		 * @generated
		 */
		EClass TURN = eINSTANCE.getTurn();

		/**
		 * The meta object literal for the '<em><b>Feedback Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TURN__FEEDBACK_DELAY = eINSTANCE.getTurn_FeedbackDelay();

		/**
		 * The meta object literal for the '<em><b>Feedback Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TURN__FEEDBACK_DURATION = eINSTANCE.getTurn_FeedbackDuration();

		/**
		 * The meta object literal for the '<em><b>Action Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TURN__ACTION_DURATION = eINSTANCE.getTurn_ActionDuration();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TURN__ELEMENTS = eINSTANCE.getTurn_Elements();

		/**
		 * The meta object literal for the '<em><b>Feedback</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TURN__FEEDBACK = eINSTANCE.getTurn_Feedback();

		/**
		 * The meta object literal for the '<em><b>Concepts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TURN__CONCEPTS = eINSTANCE.getTurn_Concepts();

		/**
		 * The meta object literal for the '<em><b>Noise</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TURN__NOISE = eINSTANCE.getTurn_Noise();

		/**
		 * The meta object literal for the '<em><b>Questions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TURN__QUESTIONS = eINSTANCE.getTurn_Questions();

		/**
		 * The meta object literal for the '<em><b>Modality</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURN__MODALITY = eINSTANCE.getTurn_Modality();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURN__CONTEXT = eINSTANCE.getTurn_Context();

		/**
		 * The meta object literal for the '{@link org.carim.model.impl.UserAttitudeImpl <em>User Attitude</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.impl.UserAttitudeImpl
		 * @see org.carim.model.impl.carimModelPackageImpl#getUserAttitude()
		 * @generated
		 */
		EClass USER_ATTITUDE = eINSTANCE.getUserAttitude();

		/**
		 * The meta object literal for the '<em><b>Usefulness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_ATTITUDE__USEFULNESS = eINSTANCE.getUserAttitude_Usefulness();

		/**
		 * The meta object literal for the '<em><b>Pleasantness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_ATTITUDE__PLEASANTNESS = eINSTANCE.getUserAttitude_Pleasantness();

		/**
		 * The meta object literal for the '<em><b>Integration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_ATTITUDE__INTEGRATION = eINSTANCE.getUserAttitude_Integration();

		/**
		 * The meta object literal for the '<em><b>Self Efficacy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_ATTITUDE__SELF_EFFICACY = eINSTANCE.getUserAttitude_SelfEfficacy();

		/**
		 * The meta object literal for the '<em><b>Comfort</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_ATTITUDE__COMFORT = eINSTANCE.getUserAttitude_Comfort();

		/**
		 * The meta object literal for the '{@link org.carim.model.impl.UserDataImpl <em>User Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.impl.UserDataImpl
		 * @see org.carim.model.impl.carimModelPackageImpl#getUserData()
		 * @generated
		 */
		EClass USER_DATA = eINSTANCE.getUserData();

		/**
		 * The meta object literal for the '<em><b>User Ratings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_DATA__USER_RATINGS = eINSTANCE.getUserData_UserRatings();

		/**
		 * The meta object literal for the '<em><b>User Mood</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_DATA__USER_MOOD = eINSTANCE.getUserData_UserMood();

		/**
		 * The meta object literal for the '<em><b>User Attitude</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_DATA__USER_ATTITUDE = eINSTANCE.getUserData_UserAttitude();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_DATA__AGE = eINSTANCE.getUserData_Age();

		/**
		 * The meta object literal for the '<em><b>Gender</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_DATA__GENDER = eINSTANCE.getUserData_Gender();

		/**
		 * The meta object literal for the '<em><b>Education Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_DATA__EDUCATION_LEVEL = eINSTANCE.getUserData_EducationLevel();

		/**
		 * The meta object literal for the '<em><b>Previous Experience</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_DATA__PREVIOUS_EXPERIENCE = eINSTANCE.getUserData_PreviousExperience();

		/**
		 * The meta object literal for the '{@link org.carim.model.impl.UserMetacommImpl <em>User Metacomm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.impl.UserMetacommImpl
		 * @see org.carim.model.impl.carimModelPackageImpl#getUserMetacomm()
		 * @generated
		 */
		EClass USER_METACOMM = eINSTANCE.getUserMetacomm();

		/**
		 * The meta object literal for the '<em><b>Is Time Out</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_METACOMM__IS_TIME_OUT = eINSTANCE.getUserMetacomm_IsTimeOut();

		/**
		 * The meta object literal for the '<em><b>Is Cancel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_METACOMM__IS_CANCEL = eINSTANCE.getUserMetacomm_IsCancel();

		/**
		 * The meta object literal for the '<em><b>Is Restart</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_METACOMM__IS_RESTART = eINSTANCE.getUserMetacomm_IsRestart();

		/**
		 * The meta object literal for the '<em><b>Is Bargein</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_METACOMM__IS_BARGEIN = eINSTANCE.getUserMetacomm_IsBargein();

		/**
		 * The meta object literal for the '<em><b>Is Successful Bargein</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_METACOMM__IS_SUCCESSFUL_BARGEIN = eINSTANCE.getUserMetacomm_IsSuccessfulBargein();

		/**
		 * The meta object literal for the '{@link org.carim.model.impl.UserRatingsImpl <em>User Ratings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.impl.UserRatingsImpl
		 * @see org.carim.model.impl.carimModelPackageImpl#getUserRatings()
		 * @generated
		 */
		EClass USER_RATINGS = eINSTANCE.getUserRatings();

		/**
		 * The meta object literal for the '<em><b>Practical</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_RATINGS__PRACTICAL = eINSTANCE.getUserRatings_Practical();

		/**
		 * The meta object literal for the '<em><b>Predictable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_RATINGS__PREDICTABLE = eINSTANCE.getUserRatings_Predictable();

		/**
		 * The meta object literal for the '<em><b>Clearly Structured</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_RATINGS__CLEARLY_STRUCTURED = eINSTANCE.getUserRatings_ClearlyStructured();

		/**
		 * The meta object literal for the '<em><b>Simple</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_RATINGS__SIMPLE = eINSTANCE.getUserRatings_Simple();

		/**
		 * The meta object literal for the '<em><b>Stylish</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_RATINGS__STYLISH = eINSTANCE.getUserRatings_Stylish();

		/**
		 * The meta object literal for the '<em><b>Premium</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_RATINGS__PREMIUM = eINSTANCE.getUserRatings_Premium();

		/**
		 * The meta object literal for the '<em><b>Creative</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_RATINGS__CREATIVE = eINSTANCE.getUserRatings_Creative();

		/**
		 * The meta object literal for the '<em><b>Captivating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_RATINGS__CAPTIVATING = eINSTANCE.getUserRatings_Captivating();

		/**
		 * The meta object literal for the '<em><b>Beautiful</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_RATINGS__BEAUTIFUL = eINSTANCE.getUserRatings_Beautiful();

		/**
		 * The meta object literal for the '<em><b>Good</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_RATINGS__GOOD = eINSTANCE.getUserRatings_Good();

		/**
		 * The meta object literal for the '{@link org.carim.model.impl.UserTurnImpl <em>User Turn</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.impl.UserTurnImpl
		 * @see org.carim.model.impl.carimModelPackageImpl#getUserTurn()
		 * @generated
		 */
		EClass USER_TURN = eINSTANCE.getUserTurn();

		/**
		 * The meta object literal for the '<em><b>Metacomm</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_TURN__METACOMM = eINSTANCE.getUserTurn_Metacomm();

		/**
		 * The meta object literal for the '<em><b>Speech Input</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_TURN__SPEECH_INPUT = eINSTANCE.getUserTurn_SpeechInput();

		/**
		 * The meta object literal for the '<em><b>Gui Input</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_TURN__GUI_INPUT = eINSTANCE.getUserTurn_GuiInput();

		/**
		 * The meta object literal for the '<em><b>Motion Input</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_TURN__MOTION_INPUT = eINSTANCE.getUserTurn_MotionInput();

		/**
		 * The meta object literal for the '{@link org.carim.model.ContextualAppropriatenessT <em>Contextual Appropriateness T</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.ContextualAppropriatenessT
		 * @see org.carim.model.impl.carimModelPackageImpl#getContextualAppropriatenessT()
		 * @generated
		 */
		EEnum CONTEXTUAL_APPROPRIATENESS_T = eINSTANCE.getContextualAppropriatenessT();

		/**
		 * The meta object literal for the '{@link org.carim.model.DeviceTypeT <em>Device Type T</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.DeviceTypeT
		 * @see org.carim.model.impl.carimModelPackageImpl#getDeviceTypeT()
		 * @generated
		 */
		EEnum DEVICE_TYPE_T = eINSTANCE.getDeviceTypeT();

		/**
		 * The meta object literal for the '{@link org.carim.model.EducationLevelT <em>Education Level T</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.EducationLevelT
		 * @see org.carim.model.impl.carimModelPackageImpl#getEducationLevelT()
		 * @generated
		 */
		EEnum EDUCATION_LEVEL_T = eINSTANCE.getEducationLevelT();

		/**
		 * The meta object literal for the '{@link org.carim.model.GenderT <em>Gender T</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.GenderT
		 * @see org.carim.model.impl.carimModelPackageImpl#getGenderT()
		 * @generated
		 */
		EEnum GENDER_T = eINSTANCE.getGenderT();

		/**
		 * The meta object literal for the '{@link org.carim.model.LocationT <em>Location T</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.LocationT
		 * @see org.carim.model.impl.carimModelPackageImpl#getLocationT()
		 * @generated
		 */
		EEnum LOCATION_T = eINSTANCE.getLocationT();

		/**
		 * The meta object literal for the '{@link org.carim.model.McReasonT <em>Mc Reason T</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.McReasonT
		 * @see org.carim.model.impl.carimModelPackageImpl#getMcReasonT()
		 * @generated
		 */
		EEnum MC_REASON_T = eINSTANCE.getMcReasonT();

		/**
		 * The meta object literal for the '{@link org.carim.model.MmiTypeT <em>Mmi Type T</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.MmiTypeT
		 * @see org.carim.model.impl.carimModelPackageImpl#getMmiTypeT()
		 * @generated
		 */
		EEnum MMI_TYPE_T = eINSTANCE.getMmiTypeT();

		/**
		 * The meta object literal for the '{@link org.carim.model.MobilityLevelT <em>Mobility Level T</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.MobilityLevelT
		 * @see org.carim.model.impl.carimModelPackageImpl#getMobilityLevelT()
		 * @generated
		 */
		EEnum MOBILITY_LEVEL_T = eINSTANCE.getMobilityLevelT();

		/**
		 * The meta object literal for the '{@link org.carim.model.ModAppropT <em>Mod Approp T</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.ModAppropT
		 * @see org.carim.model.impl.carimModelPackageImpl#getModAppropT()
		 * @generated
		 */
		EEnum MOD_APPROP_T = eINSTANCE.getModAppropT();

		/**
		 * The meta object literal for the '{@link org.carim.model.ModTypeT <em>Mod Type T</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.ModTypeT
		 * @see org.carim.model.impl.carimModelPackageImpl#getModTypeT()
		 * @generated
		 */
		EEnum MOD_TYPE_T = eINSTANCE.getModTypeT();

		/**
		 * The meta object literal for the '{@link org.carim.model.ParsingResultT <em>Parsing Result T</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.ParsingResultT
		 * @see org.carim.model.impl.carimModelPackageImpl#getParsingResultT()
		 * @generated
		 */
		EEnum PARSING_RESULT_T = eINSTANCE.getParsingResultT();

		/**
		 * The meta object literal for the '{@link org.carim.model.PreviousExperienceT <em>Previous Experience T</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.PreviousExperienceT
		 * @see org.carim.model.impl.carimModelPackageImpl#getPreviousExperienceT()
		 * @generated
		 */
		EEnum PREVIOUS_EXPERIENCE_T = eINSTANCE.getPreviousExperienceT();

		/**
		 * The meta object literal for the '{@link org.carim.model.PromptTypeT <em>Prompt Type T</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.PromptTypeT
		 * @see org.carim.model.impl.carimModelPackageImpl#getPromptTypeT()
		 * @generated
		 */
		EEnum PROMPT_TYPE_T = eINSTANCE.getPromptTypeT();

		/**
		 * The meta object literal for the '{@link org.carim.model.RoleT <em>Role T</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.RoleT
		 * @see org.carim.model.impl.carimModelPackageImpl#getRoleT()
		 * @generated
		 */
		EEnum ROLE_T = eINSTANCE.getRoleT();

		/**
		 * The meta object literal for the '{@link org.carim.model.ScreenOrientationT <em>Screen Orientation T</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.ScreenOrientationT
		 * @see org.carim.model.impl.carimModelPackageImpl#getScreenOrientationT()
		 * @generated
		 */
		EEnum SCREEN_ORIENTATION_T = eINSTANCE.getScreenOrientationT();

		/**
		 * The meta object literal for the '{@link org.carim.model.ScreenResolutionT <em>Screen Resolution T</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.ScreenResolutionT
		 * @see org.carim.model.impl.carimModelPackageImpl#getScreenResolutionT()
		 * @generated
		 */
		EEnum SCREEN_RESOLUTION_T = eINSTANCE.getScreenResolutionT();

		/**
		 * The meta object literal for the '{@link org.carim.model.ScreenSizeT <em>Screen Size T</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.ScreenSizeT
		 * @see org.carim.model.impl.carimModelPackageImpl#getScreenSizeT()
		 * @generated
		 */
		EEnum SCREEN_SIZE_T = eINSTANCE.getScreenSizeT();

		/**
		 * The meta object literal for the '{@link org.carim.model.SocialArenaT <em>Social Arena T</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.SocialArenaT
		 * @see org.carim.model.impl.carimModelPackageImpl#getSocialArenaT()
		 * @generated
		 */
		EEnum SOCIAL_ARENA_T = eINSTANCE.getSocialArenaT();

		/**
		 * The meta object literal for the '{@link org.carim.model.SocialCompanyT <em>Social Company T</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.SocialCompanyT
		 * @see org.carim.model.impl.carimModelPackageImpl#getSocialCompanyT()
		 * @generated
		 */
		EEnum SOCIAL_COMPANY_T = eINSTANCE.getSocialCompanyT();

		/**
		 * The meta object literal for the '{@link org.carim.model.TaskSuccessT <em>Task Success T</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.TaskSuccessT
		 * @see org.carim.model.impl.carimModelPackageImpl#getTaskSuccessT()
		 * @generated
		 */
		EEnum TASK_SUCCESS_T = eINSTANCE.getTaskSuccessT();

		/**
		 * The meta object literal for the '{@link org.carim.model.WeatherT <em>Weather T</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.WeatherT
		 * @see org.carim.model.impl.carimModelPackageImpl#getWeatherT()
		 * @generated
		 */
		EEnum WEATHER_T = eINSTANCE.getWeatherT();

		/**
		 * The meta object literal for the '{@link org.carim.model.WirelessAccessTypeT <em>Wireless Access Type T</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.WirelessAccessTypeT
		 * @see org.carim.model.impl.carimModelPackageImpl#getWirelessAccessTypeT()
		 * @generated
		 */
		EEnum WIRELESS_ACCESS_TYPE_T = eINSTANCE.getWirelessAccessTypeT();

		/**
		 * The meta object literal for the '<em>Contextual Appropriateness TObject</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.ContextualAppropriatenessT
		 * @see org.carim.model.impl.carimModelPackageImpl#getContextualAppropriatenessTObject()
		 * @generated
		 */
		EDataType CONTEXTUAL_APPROPRIATENESS_TOBJECT = eINSTANCE.getContextualAppropriatenessTObject();

		/**
		 * The meta object literal for the '<em>DDay Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.impl.carimModelPackageImpl#getDDayType()
		 * @generated
		 */
		EDataType DDAY_TYPE = eINSTANCE.getDDayType();

		/**
		 * The meta object literal for the '<em>DDay Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see org.carim.model.impl.carimModelPackageImpl#getDDayTypeObject()
		 * @generated
		 */
		EDataType DDAY_TYPE_OBJECT = eINSTANCE.getDDayTypeObject();

		/**
		 * The meta object literal for the '<em>Device Type TObject</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.DeviceTypeT
		 * @see org.carim.model.impl.carimModelPackageImpl#getDeviceTypeTObject()
		 * @generated
		 */
		EDataType DEVICE_TYPE_TOBJECT = eINSTANCE.getDeviceTypeTObject();

		/**
		 * The meta object literal for the '<em>DMonth Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.impl.carimModelPackageImpl#getDMonthType()
		 * @generated
		 */
		EDataType DMONTH_TYPE = eINSTANCE.getDMonthType();

		/**
		 * The meta object literal for the '<em>DMonth Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see org.carim.model.impl.carimModelPackageImpl#getDMonthTypeObject()
		 * @generated
		 */
		EDataType DMONTH_TYPE_OBJECT = eINSTANCE.getDMonthTypeObject();

		/**
		 * The meta object literal for the '<em>DYear Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.impl.carimModelPackageImpl#getDYearType()
		 * @generated
		 */
		EDataType DYEAR_TYPE = eINSTANCE.getDYearType();

		/**
		 * The meta object literal for the '<em>DYear Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see org.carim.model.impl.carimModelPackageImpl#getDYearTypeObject()
		 * @generated
		 */
		EDataType DYEAR_TYPE_OBJECT = eINSTANCE.getDYearTypeObject();

		/**
		 * The meta object literal for the '<em>Education Level TObject</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.EducationLevelT
		 * @see org.carim.model.impl.carimModelPackageImpl#getEducationLevelTObject()
		 * @generated
		 */
		EDataType EDUCATION_LEVEL_TOBJECT = eINSTANCE.getEducationLevelTObject();

		/**
		 * The meta object literal for the '<em>Gender TObject</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.GenderT
		 * @see org.carim.model.impl.carimModelPackageImpl#getGenderTObject()
		 * @generated
		 */
		EDataType GENDER_TOBJECT = eINSTANCE.getGenderTObject();

		/**
		 * The meta object literal for the '<em>Likert5 Value</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.impl.carimModelPackageImpl#getLikert5Value()
		 * @generated
		 */
		EDataType LIKERT5_VALUE = eINSTANCE.getLikert5Value();

		/**
		 * The meta object literal for the '<em>Likert5 Value Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Float
		 * @see org.carim.model.impl.carimModelPackageImpl#getLikert5ValueObject()
		 * @generated
		 */
		EDataType LIKERT5_VALUE_OBJECT = eINSTANCE.getLikert5ValueObject();

		/**
		 * The meta object literal for the '<em>Likert7 Value</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.impl.carimModelPackageImpl#getLikert7Value()
		 * @generated
		 */
		EDataType LIKERT7_VALUE = eINSTANCE.getLikert7Value();

		/**
		 * The meta object literal for the '<em>Likert7 Value Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Float
		 * @see org.carim.model.impl.carimModelPackageImpl#getLikert7ValueObject()
		 * @generated
		 */
		EDataType LIKERT7_VALUE_OBJECT = eINSTANCE.getLikert7ValueObject();

		/**
		 * The meta object literal for the '<em>Location TObject</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.LocationT
		 * @see org.carim.model.impl.carimModelPackageImpl#getLocationTObject()
		 * @generated
		 */
		EDataType LOCATION_TOBJECT = eINSTANCE.getLocationTObject();

		/**
		 * The meta object literal for the '<em>Mc Reason TObject</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.McReasonT
		 * @see org.carim.model.impl.carimModelPackageImpl#getMcReasonTObject()
		 * @generated
		 */
		EDataType MC_REASON_TOBJECT = eINSTANCE.getMcReasonTObject();

		/**
		 * The meta object literal for the '<em>Mmi Type TObject</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.MmiTypeT
		 * @see org.carim.model.impl.carimModelPackageImpl#getMmiTypeTObject()
		 * @generated
		 */
		EDataType MMI_TYPE_TOBJECT = eINSTANCE.getMmiTypeTObject();

		/**
		 * The meta object literal for the '<em>Mobility Level TObject</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.MobilityLevelT
		 * @see org.carim.model.impl.carimModelPackageImpl#getMobilityLevelTObject()
		 * @generated
		 */
		EDataType MOBILITY_LEVEL_TOBJECT = eINSTANCE.getMobilityLevelTObject();

		/**
		 * The meta object literal for the '<em>Mod Approp TObject</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.ModAppropT
		 * @see org.carim.model.impl.carimModelPackageImpl#getModAppropTObject()
		 * @generated
		 */
		EDataType MOD_APPROP_TOBJECT = eINSTANCE.getModAppropTObject();

		/**
		 * The meta object literal for the '<em>Mod Type TObject</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.ModTypeT
		 * @see org.carim.model.impl.carimModelPackageImpl#getModTypeTObject()
		 * @generated
		 */
		EDataType MOD_TYPE_TOBJECT = eINSTANCE.getModTypeTObject();

		/**
		 * The meta object literal for the '<em>Parsing Result TObject</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.ParsingResultT
		 * @see org.carim.model.impl.carimModelPackageImpl#getParsingResultTObject()
		 * @generated
		 */
		EDataType PARSING_RESULT_TOBJECT = eINSTANCE.getParsingResultTObject();

		/**
		 * The meta object literal for the '<em>Percentage T</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.impl.carimModelPackageImpl#getPercentageT()
		 * @generated
		 */
		EDataType PERCENTAGE_T = eINSTANCE.getPercentageT();

		/**
		 * The meta object literal for the '<em>Percentage TObject</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see org.carim.model.impl.carimModelPackageImpl#getPercentageTObject()
		 * @generated
		 */
		EDataType PERCENTAGE_TOBJECT = eINSTANCE.getPercentageTObject();

		/**
		 * The meta object literal for the '<em>Previous Experience TObject</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.PreviousExperienceT
		 * @see org.carim.model.impl.carimModelPackageImpl#getPreviousExperienceTObject()
		 * @generated
		 */
		EDataType PREVIOUS_EXPERIENCE_TOBJECT = eINSTANCE.getPreviousExperienceTObject();

		/**
		 * The meta object literal for the '<em>Prompt Type TObject</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.PromptTypeT
		 * @see org.carim.model.impl.carimModelPackageImpl#getPromptTypeTObject()
		 * @generated
		 */
		EDataType PROMPT_TYPE_TOBJECT = eINSTANCE.getPromptTypeTObject();

		/**
		 * The meta object literal for the '<em>Role TObject</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.RoleT
		 * @see org.carim.model.impl.carimModelPackageImpl#getRoleTObject()
		 * @generated
		 */
		EDataType ROLE_TOBJECT = eINSTANCE.getRoleTObject();

		/**
		 * The meta object literal for the '<em>Screen Orientation TObject</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.ScreenOrientationT
		 * @see org.carim.model.impl.carimModelPackageImpl#getScreenOrientationTObject()
		 * @generated
		 */
		EDataType SCREEN_ORIENTATION_TOBJECT = eINSTANCE.getScreenOrientationTObject();

		/**
		 * The meta object literal for the '<em>Screen Resolution TObject</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.ScreenResolutionT
		 * @see org.carim.model.impl.carimModelPackageImpl#getScreenResolutionTObject()
		 * @generated
		 */
		EDataType SCREEN_RESOLUTION_TOBJECT = eINSTANCE.getScreenResolutionTObject();

		/**
		 * The meta object literal for the '<em>Screen Size TObject</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.ScreenSizeT
		 * @see org.carim.model.impl.carimModelPackageImpl#getScreenSizeTObject()
		 * @generated
		 */
		EDataType SCREEN_SIZE_TOBJECT = eINSTANCE.getScreenSizeTObject();

		/**
		 * The meta object literal for the '<em>Social Arena TObject</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.SocialArenaT
		 * @see org.carim.model.impl.carimModelPackageImpl#getSocialArenaTObject()
		 * @generated
		 */
		EDataType SOCIAL_ARENA_TOBJECT = eINSTANCE.getSocialArenaTObject();

		/**
		 * The meta object literal for the '<em>Social Company TObject</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.SocialCompanyT
		 * @see org.carim.model.impl.carimModelPackageImpl#getSocialCompanyTObject()
		 * @generated
		 */
		EDataType SOCIAL_COMPANY_TOBJECT = eINSTANCE.getSocialCompanyTObject();

		/**
		 * The meta object literal for the '<em>Task Success TObject</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.TaskSuccessT
		 * @see org.carim.model.impl.carimModelPackageImpl#getTaskSuccessTObject()
		 * @generated
		 */
		EDataType TASK_SUCCESS_TOBJECT = eINSTANCE.getTaskSuccessTObject();

		/**
		 * The meta object literal for the '<em>THours Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.impl.carimModelPackageImpl#getTHoursType()
		 * @generated
		 */
		EDataType THOURS_TYPE = eINSTANCE.getTHoursType();

		/**
		 * The meta object literal for the '<em>THours Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see org.carim.model.impl.carimModelPackageImpl#getTHoursTypeObject()
		 * @generated
		 */
		EDataType THOURS_TYPE_OBJECT = eINSTANCE.getTHoursTypeObject();

		/**
		 * The meta object literal for the '<em>TMins Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.impl.carimModelPackageImpl#getTMinsType()
		 * @generated
		 */
		EDataType TMINS_TYPE = eINSTANCE.getTMinsType();

		/**
		 * The meta object literal for the '<em>TMins Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see org.carim.model.impl.carimModelPackageImpl#getTMinsTypeObject()
		 * @generated
		 */
		EDataType TMINS_TYPE_OBJECT = eINSTANCE.getTMinsTypeObject();

		/**
		 * The meta object literal for the '<em>TSecs Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.impl.carimModelPackageImpl#getTSecsType()
		 * @generated
		 */
		EDataType TSECS_TYPE = eINSTANCE.getTSecsType();

		/**
		 * The meta object literal for the '<em>TSecs Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see org.carim.model.impl.carimModelPackageImpl#getTSecsTypeObject()
		 * @generated
		 */
		EDataType TSECS_TYPE_OBJECT = eINSTANCE.getTSecsTypeObject();

		/**
		 * The meta object literal for the '<em>Weather TObject</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.WeatherT
		 * @see org.carim.model.impl.carimModelPackageImpl#getWeatherTObject()
		 * @generated
		 */
		EDataType WEATHER_TOBJECT = eINSTANCE.getWeatherTObject();

		/**
		 * The meta object literal for the '<em>Wireless Access Type TObject</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.carim.model.WirelessAccessTypeT
		 * @see org.carim.model.impl.carimModelPackageImpl#getWirelessAccessTypeTObject()
		 * @generated
		 */
		EDataType WIRELESS_ACCESS_TYPE_TOBJECT = eINSTANCE.getWirelessAccessTypeTObject();

	}

} //carimModelPackage
