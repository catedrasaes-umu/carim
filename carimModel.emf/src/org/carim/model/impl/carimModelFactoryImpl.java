/**
 */
package org.carim.model.impl;

import org.carim.model.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class carimModelFactoryImpl extends EFactoryImpl implements carimModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static carimModelFactory init() {
		try {
			carimModelFactory thecarimModelFactory = (carimModelFactory)EPackage.Registry.INSTANCE.getEFactory("org/carimModel"); 
			if (thecarimModelFactory != null) {
				return thecarimModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new carimModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public carimModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case carimModelPackage.ATTITUDE: return createAttitude();
			case carimModelPackage.AVM: return createAvm();
			case carimModelPackage.COMMUNICATION_CONTEXT: return createCommunicationContext();
			case carimModelPackage.COOPERATIVITY: return createCooperativity();
			case carimModelPackage.DATE_TIME_T: return createDateTimeT();
			case carimModelPackage.DEVICE_CONTEXT: return createDeviceContext();
			case carimModelPackage.DIALOGUE: return createDialogue();
			case carimModelPackage.DIALOGUE_STEP_T: return createDialogueStepT();
			case carimModelPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case carimModelPackage.DYNAMIC_CONTEXT: return createDynamicContext();
			case carimModelPackage.GUI_INPUT: return createGuiInput();
			case carimModelPackage.LOCATION_TIME_CONTEXT: return createLocationTimeContext();
			case carimModelPackage.MODALITY_APPROPRIATENESS: return createModalityAppropriateness();
			case carimModelPackage.MODALITY_CHANGE: return createModalityChange();
			case carimModelPackage.MODALITY_INFO: return createModalityInfo();
			case carimModelPackage.MODALITY_SYNCHRONI: return createModalitySynchroni();
			case carimModelPackage.MOTION_INPUT: return createMotionInput();
			case carimModelPackage.PHYSICAL_CONTEXT: return createPhysicalContext();
			case carimModelPackage.SOCIAL_CONTEXT: return createSocialContext();
			case carimModelPackage.SPEECH_INPUT: return createSpeechInput();
			case carimModelPackage.SPEECH_OUTPUT: return createSpeechOutput();
			case carimModelPackage.SYSTEM_METACOMM: return createSystemMetacomm();
			case carimModelPackage.SYSTEM_TURN: return createSystemTurn();
			case carimModelPackage.TASK: return createTask();
			case carimModelPackage.TRIAL: return createTrial();
			case carimModelPackage.USER_ATTITUDE: return createUserAttitude();
			case carimModelPackage.USER_DATA: return createUserData();
			case carimModelPackage.USER_METACOMM: return createUserMetacomm();
			case carimModelPackage.USER_RATINGS: return createUserRatings();
			case carimModelPackage.USER_TURN: return createUserTurn();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case carimModelPackage.CONTEXTUAL_APPROPRIATENESS_T:
				return createContextualAppropriatenessTFromString(eDataType, initialValue);
			case carimModelPackage.DEVICE_TYPE_T:
				return createDeviceTypeTFromString(eDataType, initialValue);
			case carimModelPackage.EDUCATION_LEVEL_T:
				return createEducationLevelTFromString(eDataType, initialValue);
			case carimModelPackage.GENDER_T:
				return createGenderTFromString(eDataType, initialValue);
			case carimModelPackage.LOCATION_T:
				return createLocationTFromString(eDataType, initialValue);
			case carimModelPackage.MC_REASON_T:
				return createMcReasonTFromString(eDataType, initialValue);
			case carimModelPackage.MMI_TYPE_T:
				return createMmiTypeTFromString(eDataType, initialValue);
			case carimModelPackage.MOBILITY_LEVEL_T:
				return createMobilityLevelTFromString(eDataType, initialValue);
			case carimModelPackage.MOD_APPROP_T:
				return createModAppropTFromString(eDataType, initialValue);
			case carimModelPackage.MOD_TYPE_T:
				return createModTypeTFromString(eDataType, initialValue);
			case carimModelPackage.PARSING_RESULT_T:
				return createParsingResultTFromString(eDataType, initialValue);
			case carimModelPackage.PREVIOUS_EXPERIENCE_T:
				return createPreviousExperienceTFromString(eDataType, initialValue);
			case carimModelPackage.PROMPT_TYPE_T:
				return createPromptTypeTFromString(eDataType, initialValue);
			case carimModelPackage.ROLE_T:
				return createRoleTFromString(eDataType, initialValue);
			case carimModelPackage.SCREEN_ORIENTATION_T:
				return createScreenOrientationTFromString(eDataType, initialValue);
			case carimModelPackage.SCREEN_RESOLUTION_T:
				return createScreenResolutionTFromString(eDataType, initialValue);
			case carimModelPackage.SCREEN_SIZE_T:
				return createScreenSizeTFromString(eDataType, initialValue);
			case carimModelPackage.SOCIAL_ARENA_T:
				return createSocialArenaTFromString(eDataType, initialValue);
			case carimModelPackage.SOCIAL_COMPANY_T:
				return createSocialCompanyTFromString(eDataType, initialValue);
			case carimModelPackage.TASK_SUCCESS_T:
				return createTaskSuccessTFromString(eDataType, initialValue);
			case carimModelPackage.WEATHER_T:
				return createWeatherTFromString(eDataType, initialValue);
			case carimModelPackage.WIRELESS_ACCESS_TYPE_T:
				return createWirelessAccessTypeTFromString(eDataType, initialValue);
			case carimModelPackage.CONTEXTUAL_APPROPRIATENESS_TOBJECT:
				return createContextualAppropriatenessTObjectFromString(eDataType, initialValue);
			case carimModelPackage.DDAY_TYPE:
				return createDDayTypeFromString(eDataType, initialValue);
			case carimModelPackage.DDAY_TYPE_OBJECT:
				return createDDayTypeObjectFromString(eDataType, initialValue);
			case carimModelPackage.DEVICE_TYPE_TOBJECT:
				return createDeviceTypeTObjectFromString(eDataType, initialValue);
			case carimModelPackage.DMONTH_TYPE:
				return createDMonthTypeFromString(eDataType, initialValue);
			case carimModelPackage.DMONTH_TYPE_OBJECT:
				return createDMonthTypeObjectFromString(eDataType, initialValue);
			case carimModelPackage.DYEAR_TYPE:
				return createDYearTypeFromString(eDataType, initialValue);
			case carimModelPackage.DYEAR_TYPE_OBJECT:
				return createDYearTypeObjectFromString(eDataType, initialValue);
			case carimModelPackage.EDUCATION_LEVEL_TOBJECT:
				return createEducationLevelTObjectFromString(eDataType, initialValue);
			case carimModelPackage.GENDER_TOBJECT:
				return createGenderTObjectFromString(eDataType, initialValue);
			case carimModelPackage.LIKERT5_VALUE:
				return createLikert5ValueFromString(eDataType, initialValue);
			case carimModelPackage.LIKERT5_VALUE_OBJECT:
				return createLikert5ValueObjectFromString(eDataType, initialValue);
			case carimModelPackage.LIKERT7_VALUE:
				return createLikert7ValueFromString(eDataType, initialValue);
			case carimModelPackage.LIKERT7_VALUE_OBJECT:
				return createLikert7ValueObjectFromString(eDataType, initialValue);
			case carimModelPackage.LOCATION_TOBJECT:
				return createLocationTObjectFromString(eDataType, initialValue);
			case carimModelPackage.MC_REASON_TOBJECT:
				return createMcReasonTObjectFromString(eDataType, initialValue);
			case carimModelPackage.MMI_TYPE_TOBJECT:
				return createMmiTypeTObjectFromString(eDataType, initialValue);
			case carimModelPackage.MOBILITY_LEVEL_TOBJECT:
				return createMobilityLevelTObjectFromString(eDataType, initialValue);
			case carimModelPackage.MOD_APPROP_TOBJECT:
				return createModAppropTObjectFromString(eDataType, initialValue);
			case carimModelPackage.MOD_TYPE_TOBJECT:
				return createModTypeTObjectFromString(eDataType, initialValue);
			case carimModelPackage.PARSING_RESULT_TOBJECT:
				return createParsingResultTObjectFromString(eDataType, initialValue);
			case carimModelPackage.PERCENTAGE_T:
				return createPercentageTFromString(eDataType, initialValue);
			case carimModelPackage.PERCENTAGE_TOBJECT:
				return createPercentageTObjectFromString(eDataType, initialValue);
			case carimModelPackage.PREVIOUS_EXPERIENCE_TOBJECT:
				return createPreviousExperienceTObjectFromString(eDataType, initialValue);
			case carimModelPackage.PROMPT_TYPE_TOBJECT:
				return createPromptTypeTObjectFromString(eDataType, initialValue);
			case carimModelPackage.ROLE_TOBJECT:
				return createRoleTObjectFromString(eDataType, initialValue);
			case carimModelPackage.SCREEN_ORIENTATION_TOBJECT:
				return createScreenOrientationTObjectFromString(eDataType, initialValue);
			case carimModelPackage.SCREEN_RESOLUTION_TOBJECT:
				return createScreenResolutionTObjectFromString(eDataType, initialValue);
			case carimModelPackage.SCREEN_SIZE_TOBJECT:
				return createScreenSizeTObjectFromString(eDataType, initialValue);
			case carimModelPackage.SOCIAL_ARENA_TOBJECT:
				return createSocialArenaTObjectFromString(eDataType, initialValue);
			case carimModelPackage.SOCIAL_COMPANY_TOBJECT:
				return createSocialCompanyTObjectFromString(eDataType, initialValue);
			case carimModelPackage.TASK_SUCCESS_TOBJECT:
				return createTaskSuccessTObjectFromString(eDataType, initialValue);
			case carimModelPackage.THOURS_TYPE:
				return createTHoursTypeFromString(eDataType, initialValue);
			case carimModelPackage.THOURS_TYPE_OBJECT:
				return createTHoursTypeObjectFromString(eDataType, initialValue);
			case carimModelPackage.TMINS_TYPE:
				return createTMinsTypeFromString(eDataType, initialValue);
			case carimModelPackage.TMINS_TYPE_OBJECT:
				return createTMinsTypeObjectFromString(eDataType, initialValue);
			case carimModelPackage.TSECS_TYPE:
				return createTSecsTypeFromString(eDataType, initialValue);
			case carimModelPackage.TSECS_TYPE_OBJECT:
				return createTSecsTypeObjectFromString(eDataType, initialValue);
			case carimModelPackage.WEATHER_TOBJECT:
				return createWeatherTObjectFromString(eDataType, initialValue);
			case carimModelPackage.WIRELESS_ACCESS_TYPE_TOBJECT:
				return createWirelessAccessTypeTObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case carimModelPackage.CONTEXTUAL_APPROPRIATENESS_T:
				return convertContextualAppropriatenessTToString(eDataType, instanceValue);
			case carimModelPackage.DEVICE_TYPE_T:
				return convertDeviceTypeTToString(eDataType, instanceValue);
			case carimModelPackage.EDUCATION_LEVEL_T:
				return convertEducationLevelTToString(eDataType, instanceValue);
			case carimModelPackage.GENDER_T:
				return convertGenderTToString(eDataType, instanceValue);
			case carimModelPackage.LOCATION_T:
				return convertLocationTToString(eDataType, instanceValue);
			case carimModelPackage.MC_REASON_T:
				return convertMcReasonTToString(eDataType, instanceValue);
			case carimModelPackage.MMI_TYPE_T:
				return convertMmiTypeTToString(eDataType, instanceValue);
			case carimModelPackage.MOBILITY_LEVEL_T:
				return convertMobilityLevelTToString(eDataType, instanceValue);
			case carimModelPackage.MOD_APPROP_T:
				return convertModAppropTToString(eDataType, instanceValue);
			case carimModelPackage.MOD_TYPE_T:
				return convertModTypeTToString(eDataType, instanceValue);
			case carimModelPackage.PARSING_RESULT_T:
				return convertParsingResultTToString(eDataType, instanceValue);
			case carimModelPackage.PREVIOUS_EXPERIENCE_T:
				return convertPreviousExperienceTToString(eDataType, instanceValue);
			case carimModelPackage.PROMPT_TYPE_T:
				return convertPromptTypeTToString(eDataType, instanceValue);
			case carimModelPackage.ROLE_T:
				return convertRoleTToString(eDataType, instanceValue);
			case carimModelPackage.SCREEN_ORIENTATION_T:
				return convertScreenOrientationTToString(eDataType, instanceValue);
			case carimModelPackage.SCREEN_RESOLUTION_T:
				return convertScreenResolutionTToString(eDataType, instanceValue);
			case carimModelPackage.SCREEN_SIZE_T:
				return convertScreenSizeTToString(eDataType, instanceValue);
			case carimModelPackage.SOCIAL_ARENA_T:
				return convertSocialArenaTToString(eDataType, instanceValue);
			case carimModelPackage.SOCIAL_COMPANY_T:
				return convertSocialCompanyTToString(eDataType, instanceValue);
			case carimModelPackage.TASK_SUCCESS_T:
				return convertTaskSuccessTToString(eDataType, instanceValue);
			case carimModelPackage.WEATHER_T:
				return convertWeatherTToString(eDataType, instanceValue);
			case carimModelPackage.WIRELESS_ACCESS_TYPE_T:
				return convertWirelessAccessTypeTToString(eDataType, instanceValue);
			case carimModelPackage.CONTEXTUAL_APPROPRIATENESS_TOBJECT:
				return convertContextualAppropriatenessTObjectToString(eDataType, instanceValue);
			case carimModelPackage.DDAY_TYPE:
				return convertDDayTypeToString(eDataType, instanceValue);
			case carimModelPackage.DDAY_TYPE_OBJECT:
				return convertDDayTypeObjectToString(eDataType, instanceValue);
			case carimModelPackage.DEVICE_TYPE_TOBJECT:
				return convertDeviceTypeTObjectToString(eDataType, instanceValue);
			case carimModelPackage.DMONTH_TYPE:
				return convertDMonthTypeToString(eDataType, instanceValue);
			case carimModelPackage.DMONTH_TYPE_OBJECT:
				return convertDMonthTypeObjectToString(eDataType, instanceValue);
			case carimModelPackage.DYEAR_TYPE:
				return convertDYearTypeToString(eDataType, instanceValue);
			case carimModelPackage.DYEAR_TYPE_OBJECT:
				return convertDYearTypeObjectToString(eDataType, instanceValue);
			case carimModelPackage.EDUCATION_LEVEL_TOBJECT:
				return convertEducationLevelTObjectToString(eDataType, instanceValue);
			case carimModelPackage.GENDER_TOBJECT:
				return convertGenderTObjectToString(eDataType, instanceValue);
			case carimModelPackage.LIKERT5_VALUE:
				return convertLikert5ValueToString(eDataType, instanceValue);
			case carimModelPackage.LIKERT5_VALUE_OBJECT:
				return convertLikert5ValueObjectToString(eDataType, instanceValue);
			case carimModelPackage.LIKERT7_VALUE:
				return convertLikert7ValueToString(eDataType, instanceValue);
			case carimModelPackage.LIKERT7_VALUE_OBJECT:
				return convertLikert7ValueObjectToString(eDataType, instanceValue);
			case carimModelPackage.LOCATION_TOBJECT:
				return convertLocationTObjectToString(eDataType, instanceValue);
			case carimModelPackage.MC_REASON_TOBJECT:
				return convertMcReasonTObjectToString(eDataType, instanceValue);
			case carimModelPackage.MMI_TYPE_TOBJECT:
				return convertMmiTypeTObjectToString(eDataType, instanceValue);
			case carimModelPackage.MOBILITY_LEVEL_TOBJECT:
				return convertMobilityLevelTObjectToString(eDataType, instanceValue);
			case carimModelPackage.MOD_APPROP_TOBJECT:
				return convertModAppropTObjectToString(eDataType, instanceValue);
			case carimModelPackage.MOD_TYPE_TOBJECT:
				return convertModTypeTObjectToString(eDataType, instanceValue);
			case carimModelPackage.PARSING_RESULT_TOBJECT:
				return convertParsingResultTObjectToString(eDataType, instanceValue);
			case carimModelPackage.PERCENTAGE_T:
				return convertPercentageTToString(eDataType, instanceValue);
			case carimModelPackage.PERCENTAGE_TOBJECT:
				return convertPercentageTObjectToString(eDataType, instanceValue);
			case carimModelPackage.PREVIOUS_EXPERIENCE_TOBJECT:
				return convertPreviousExperienceTObjectToString(eDataType, instanceValue);
			case carimModelPackage.PROMPT_TYPE_TOBJECT:
				return convertPromptTypeTObjectToString(eDataType, instanceValue);
			case carimModelPackage.ROLE_TOBJECT:
				return convertRoleTObjectToString(eDataType, instanceValue);
			case carimModelPackage.SCREEN_ORIENTATION_TOBJECT:
				return convertScreenOrientationTObjectToString(eDataType, instanceValue);
			case carimModelPackage.SCREEN_RESOLUTION_TOBJECT:
				return convertScreenResolutionTObjectToString(eDataType, instanceValue);
			case carimModelPackage.SCREEN_SIZE_TOBJECT:
				return convertScreenSizeTObjectToString(eDataType, instanceValue);
			case carimModelPackage.SOCIAL_ARENA_TOBJECT:
				return convertSocialArenaTObjectToString(eDataType, instanceValue);
			case carimModelPackage.SOCIAL_COMPANY_TOBJECT:
				return convertSocialCompanyTObjectToString(eDataType, instanceValue);
			case carimModelPackage.TASK_SUCCESS_TOBJECT:
				return convertTaskSuccessTObjectToString(eDataType, instanceValue);
			case carimModelPackage.THOURS_TYPE:
				return convertTHoursTypeToString(eDataType, instanceValue);
			case carimModelPackage.THOURS_TYPE_OBJECT:
				return convertTHoursTypeObjectToString(eDataType, instanceValue);
			case carimModelPackage.TMINS_TYPE:
				return convertTMinsTypeToString(eDataType, instanceValue);
			case carimModelPackage.TMINS_TYPE_OBJECT:
				return convertTMinsTypeObjectToString(eDataType, instanceValue);
			case carimModelPackage.TSECS_TYPE:
				return convertTSecsTypeToString(eDataType, instanceValue);
			case carimModelPackage.TSECS_TYPE_OBJECT:
				return convertTSecsTypeObjectToString(eDataType, instanceValue);
			case carimModelPackage.WEATHER_TOBJECT:
				return convertWeatherTObjectToString(eDataType, instanceValue);
			case carimModelPackage.WIRELESS_ACCESS_TYPE_TOBJECT:
				return convertWirelessAccessTypeTObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attitude createAttitude() {
		AttitudeImpl attitude = new AttitudeImpl();
		return attitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Avm createAvm() {
		AvmImpl avm = new AvmImpl();
		return avm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationContext createCommunicationContext() {
		CommunicationContextImpl communicationContext = new CommunicationContextImpl();
		return communicationContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cooperativity createCooperativity() {
		CooperativityImpl cooperativity = new CooperativityImpl();
		return cooperativity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeT createDateTimeT() {
		DateTimeTImpl dateTimeT = new DateTimeTImpl();
		return dateTimeT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceContext createDeviceContext() {
		DeviceContextImpl deviceContext = new DeviceContextImpl();
		return deviceContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dialogue createDialogue() {
		DialogueImpl dialogue = new DialogueImpl();
		return dialogue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DialogueStepT createDialogueStepT() {
		DialogueStepTImpl dialogueStepT = new DialogueStepTImpl();
		return dialogueStepT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicContext createDynamicContext() {
		DynamicContextImpl dynamicContext = new DynamicContextImpl();
		return dynamicContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiInput createGuiInput() {
		GuiInputImpl guiInput = new GuiInputImpl();
		return guiInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationTimeContext createLocationTimeContext() {
		LocationTimeContextImpl locationTimeContext = new LocationTimeContextImpl();
		return locationTimeContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModalityAppropriateness createModalityAppropriateness() {
		ModalityAppropriatenessImpl modalityAppropriateness = new ModalityAppropriatenessImpl();
		return modalityAppropriateness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModalityChange createModalityChange() {
		ModalityChangeImpl modalityChange = new ModalityChangeImpl();
		return modalityChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModalityInfo createModalityInfo() {
		ModalityInfoImpl modalityInfo = new ModalityInfoImpl();
		return modalityInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModalitySynchroni createModalitySynchroni() {
		ModalitySynchroniImpl modalitySynchroni = new ModalitySynchroniImpl();
		return modalitySynchroni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MotionInput createMotionInput() {
		MotionInputImpl motionInput = new MotionInputImpl();
		return motionInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalContext createPhysicalContext() {
		PhysicalContextImpl physicalContext = new PhysicalContextImpl();
		return physicalContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialContext createSocialContext() {
		SocialContextImpl socialContext = new SocialContextImpl();
		return socialContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpeechInput createSpeechInput() {
		SpeechInputImpl speechInput = new SpeechInputImpl();
		return speechInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpeechOutput createSpeechOutput() {
		SpeechOutputImpl speechOutput = new SpeechOutputImpl();
		return speechOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemMetacomm createSystemMetacomm() {
		SystemMetacommImpl systemMetacomm = new SystemMetacommImpl();
		return systemMetacomm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemTurn createSystemTurn() {
		SystemTurnImpl systemTurn = new SystemTurnImpl();
		return systemTurn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trial createTrial() {
		TrialImpl trial = new TrialImpl();
		return trial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserAttitude createUserAttitude() {
		UserAttitudeImpl userAttitude = new UserAttitudeImpl();
		return userAttitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserData createUserData() {
		UserDataImpl userData = new UserDataImpl();
		return userData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserMetacomm createUserMetacomm() {
		UserMetacommImpl userMetacomm = new UserMetacommImpl();
		return userMetacomm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserRatings createUserRatings() {
		UserRatingsImpl userRatings = new UserRatingsImpl();
		return userRatings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserTurn createUserTurn() {
		UserTurnImpl userTurn = new UserTurnImpl();
		return userTurn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextualAppropriatenessT createContextualAppropriatenessTFromString(EDataType eDataType, String initialValue) {
		ContextualAppropriatenessT result = ContextualAppropriatenessT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContextualAppropriatenessTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceTypeT createDeviceTypeTFromString(EDataType eDataType, String initialValue) {
		DeviceTypeT result = DeviceTypeT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceTypeTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EducationLevelT createEducationLevelTFromString(EDataType eDataType, String initialValue) {
		EducationLevelT result = EducationLevelT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEducationLevelTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenderT createGenderTFromString(EDataType eDataType, String initialValue) {
		GenderT result = GenderT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGenderTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationT createLocationTFromString(EDataType eDataType, String initialValue) {
		LocationT result = LocationT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocationTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public McReasonT createMcReasonTFromString(EDataType eDataType, String initialValue) {
		McReasonT result = McReasonT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMcReasonTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MmiTypeT createMmiTypeTFromString(EDataType eDataType, String initialValue) {
		MmiTypeT result = MmiTypeT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMmiTypeTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobilityLevelT createMobilityLevelTFromString(EDataType eDataType, String initialValue) {
		MobilityLevelT result = MobilityLevelT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMobilityLevelTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModAppropT createModAppropTFromString(EDataType eDataType, String initialValue) {
		ModAppropT result = ModAppropT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModAppropTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModTypeT createModTypeTFromString(EDataType eDataType, String initialValue) {
		ModTypeT result = ModTypeT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModTypeTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParsingResultT createParsingResultTFromString(EDataType eDataType, String initialValue) {
		ParsingResultT result = ParsingResultT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParsingResultTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreviousExperienceT createPreviousExperienceTFromString(EDataType eDataType, String initialValue) {
		PreviousExperienceT result = PreviousExperienceT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPreviousExperienceTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PromptTypeT createPromptTypeTFromString(EDataType eDataType, String initialValue) {
		PromptTypeT result = PromptTypeT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPromptTypeTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleT createRoleTFromString(EDataType eDataType, String initialValue) {
		RoleT result = RoleT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRoleTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScreenOrientationT createScreenOrientationTFromString(EDataType eDataType, String initialValue) {
		ScreenOrientationT result = ScreenOrientationT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScreenOrientationTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScreenResolutionT createScreenResolutionTFromString(EDataType eDataType, String initialValue) {
		ScreenResolutionT result = ScreenResolutionT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScreenResolutionTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScreenSizeT createScreenSizeTFromString(EDataType eDataType, String initialValue) {
		ScreenSizeT result = ScreenSizeT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScreenSizeTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialArenaT createSocialArenaTFromString(EDataType eDataType, String initialValue) {
		SocialArenaT result = SocialArenaT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSocialArenaTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialCompanyT createSocialCompanyTFromString(EDataType eDataType, String initialValue) {
		SocialCompanyT result = SocialCompanyT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSocialCompanyTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskSuccessT createTaskSuccessTFromString(EDataType eDataType, String initialValue) {
		TaskSuccessT result = TaskSuccessT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTaskSuccessTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeatherT createWeatherTFromString(EDataType eDataType, String initialValue) {
		WeatherT result = WeatherT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWeatherTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WirelessAccessTypeT createWirelessAccessTypeTFromString(EDataType eDataType, String initialValue) {
		WirelessAccessTypeT result = WirelessAccessTypeT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWirelessAccessTypeTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextualAppropriatenessT createContextualAppropriatenessTObjectFromString(EDataType eDataType, String initialValue) {
		return createContextualAppropriatenessTFromString(carimModelPackage.Literals.CONTEXTUAL_APPROPRIATENESS_T, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContextualAppropriatenessTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertContextualAppropriatenessTToString(carimModelPackage.Literals.CONTEXTUAL_APPROPRIATENESS_T, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createDDayTypeFromString(EDataType eDataType, String initialValue) {
		return (Integer)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDDayTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createDDayTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDDayTypeFromString(carimModelPackage.Literals.DDAY_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDDayTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDDayTypeToString(carimModelPackage.Literals.DDAY_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceTypeT createDeviceTypeTObjectFromString(EDataType eDataType, String initialValue) {
		return createDeviceTypeTFromString(carimModelPackage.Literals.DEVICE_TYPE_T, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceTypeTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDeviceTypeTToString(carimModelPackage.Literals.DEVICE_TYPE_T, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createDMonthTypeFromString(EDataType eDataType, String initialValue) {
		return (Integer)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDMonthTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createDMonthTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDMonthTypeFromString(carimModelPackage.Literals.DMONTH_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDMonthTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDMonthTypeToString(carimModelPackage.Literals.DMONTH_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createDYearTypeFromString(EDataType eDataType, String initialValue) {
		return (Integer)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDYearTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createDYearTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDYearTypeFromString(carimModelPackage.Literals.DYEAR_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDYearTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDYearTypeToString(carimModelPackage.Literals.DYEAR_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EducationLevelT createEducationLevelTObjectFromString(EDataType eDataType, String initialValue) {
		return createEducationLevelTFromString(carimModelPackage.Literals.EDUCATION_LEVEL_T, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEducationLevelTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEducationLevelTToString(carimModelPackage.Literals.EDUCATION_LEVEL_T, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenderT createGenderTObjectFromString(EDataType eDataType, String initialValue) {
		return createGenderTFromString(carimModelPackage.Literals.GENDER_T, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGenderTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGenderTToString(carimModelPackage.Literals.GENDER_T, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createLikert5ValueFromString(EDataType eDataType, String initialValue) {
		return (Float)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.FLOAT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLikert5ValueToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.FLOAT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createLikert5ValueObjectFromString(EDataType eDataType, String initialValue) {
		return createLikert5ValueFromString(carimModelPackage.Literals.LIKERT5_VALUE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLikert5ValueObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLikert5ValueToString(carimModelPackage.Literals.LIKERT5_VALUE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createLikert7ValueFromString(EDataType eDataType, String initialValue) {
		return (Float)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.FLOAT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLikert7ValueToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.FLOAT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createLikert7ValueObjectFromString(EDataType eDataType, String initialValue) {
		return createLikert7ValueFromString(carimModelPackage.Literals.LIKERT7_VALUE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLikert7ValueObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLikert7ValueToString(carimModelPackage.Literals.LIKERT7_VALUE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationT createLocationTObjectFromString(EDataType eDataType, String initialValue) {
		return createLocationTFromString(carimModelPackage.Literals.LOCATION_T, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocationTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLocationTToString(carimModelPackage.Literals.LOCATION_T, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public McReasonT createMcReasonTObjectFromString(EDataType eDataType, String initialValue) {
		return createMcReasonTFromString(carimModelPackage.Literals.MC_REASON_T, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMcReasonTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMcReasonTToString(carimModelPackage.Literals.MC_REASON_T, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MmiTypeT createMmiTypeTObjectFromString(EDataType eDataType, String initialValue) {
		return createMmiTypeTFromString(carimModelPackage.Literals.MMI_TYPE_T, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMmiTypeTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMmiTypeTToString(carimModelPackage.Literals.MMI_TYPE_T, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobilityLevelT createMobilityLevelTObjectFromString(EDataType eDataType, String initialValue) {
		return createMobilityLevelTFromString(carimModelPackage.Literals.MOBILITY_LEVEL_T, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMobilityLevelTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMobilityLevelTToString(carimModelPackage.Literals.MOBILITY_LEVEL_T, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModAppropT createModAppropTObjectFromString(EDataType eDataType, String initialValue) {
		return createModAppropTFromString(carimModelPackage.Literals.MOD_APPROP_T, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModAppropTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertModAppropTToString(carimModelPackage.Literals.MOD_APPROP_T, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModTypeT createModTypeTObjectFromString(EDataType eDataType, String initialValue) {
		return createModTypeTFromString(carimModelPackage.Literals.MOD_TYPE_T, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModTypeTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertModTypeTToString(carimModelPackage.Literals.MOD_TYPE_T, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParsingResultT createParsingResultTObjectFromString(EDataType eDataType, String initialValue) {
		return createParsingResultTFromString(carimModelPackage.Literals.PARSING_RESULT_T, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParsingResultTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertParsingResultTToString(carimModelPackage.Literals.PARSING_RESULT_T, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createPercentageTFromString(EDataType eDataType, String initialValue) {
		return (Integer)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPercentageTToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createPercentageTObjectFromString(EDataType eDataType, String initialValue) {
		return createPercentageTFromString(carimModelPackage.Literals.PERCENTAGE_T, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPercentageTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPercentageTToString(carimModelPackage.Literals.PERCENTAGE_T, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreviousExperienceT createPreviousExperienceTObjectFromString(EDataType eDataType, String initialValue) {
		return createPreviousExperienceTFromString(carimModelPackage.Literals.PREVIOUS_EXPERIENCE_T, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPreviousExperienceTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPreviousExperienceTToString(carimModelPackage.Literals.PREVIOUS_EXPERIENCE_T, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PromptTypeT createPromptTypeTObjectFromString(EDataType eDataType, String initialValue) {
		return createPromptTypeTFromString(carimModelPackage.Literals.PROMPT_TYPE_T, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPromptTypeTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPromptTypeTToString(carimModelPackage.Literals.PROMPT_TYPE_T, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleT createRoleTObjectFromString(EDataType eDataType, String initialValue) {
		return createRoleTFromString(carimModelPackage.Literals.ROLE_T, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRoleTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRoleTToString(carimModelPackage.Literals.ROLE_T, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScreenOrientationT createScreenOrientationTObjectFromString(EDataType eDataType, String initialValue) {
		return createScreenOrientationTFromString(carimModelPackage.Literals.SCREEN_ORIENTATION_T, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScreenOrientationTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertScreenOrientationTToString(carimModelPackage.Literals.SCREEN_ORIENTATION_T, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScreenResolutionT createScreenResolutionTObjectFromString(EDataType eDataType, String initialValue) {
		return createScreenResolutionTFromString(carimModelPackage.Literals.SCREEN_RESOLUTION_T, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScreenResolutionTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertScreenResolutionTToString(carimModelPackage.Literals.SCREEN_RESOLUTION_T, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScreenSizeT createScreenSizeTObjectFromString(EDataType eDataType, String initialValue) {
		return createScreenSizeTFromString(carimModelPackage.Literals.SCREEN_SIZE_T, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScreenSizeTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertScreenSizeTToString(carimModelPackage.Literals.SCREEN_SIZE_T, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialArenaT createSocialArenaTObjectFromString(EDataType eDataType, String initialValue) {
		return createSocialArenaTFromString(carimModelPackage.Literals.SOCIAL_ARENA_T, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSocialArenaTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSocialArenaTToString(carimModelPackage.Literals.SOCIAL_ARENA_T, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialCompanyT createSocialCompanyTObjectFromString(EDataType eDataType, String initialValue) {
		return createSocialCompanyTFromString(carimModelPackage.Literals.SOCIAL_COMPANY_T, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSocialCompanyTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSocialCompanyTToString(carimModelPackage.Literals.SOCIAL_COMPANY_T, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskSuccessT createTaskSuccessTObjectFromString(EDataType eDataType, String initialValue) {
		return createTaskSuccessTFromString(carimModelPackage.Literals.TASK_SUCCESS_T, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTaskSuccessTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTaskSuccessTToString(carimModelPackage.Literals.TASK_SUCCESS_T, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createTHoursTypeFromString(EDataType eDataType, String initialValue) {
		return (Integer)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTHoursTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createTHoursTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTHoursTypeFromString(carimModelPackage.Literals.THOURS_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTHoursTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTHoursTypeToString(carimModelPackage.Literals.THOURS_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createTMinsTypeFromString(EDataType eDataType, String initialValue) {
		return (Integer)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTMinsTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createTMinsTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTMinsTypeFromString(carimModelPackage.Literals.TMINS_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTMinsTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTMinsTypeToString(carimModelPackage.Literals.TMINS_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createTSecsTypeFromString(EDataType eDataType, String initialValue) {
		return (Integer)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTSecsTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createTSecsTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTSecsTypeFromString(carimModelPackage.Literals.TSECS_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTSecsTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTSecsTypeToString(carimModelPackage.Literals.TSECS_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeatherT createWeatherTObjectFromString(EDataType eDataType, String initialValue) {
		return createWeatherTFromString(carimModelPackage.Literals.WEATHER_T, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWeatherTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertWeatherTToString(carimModelPackage.Literals.WEATHER_T, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WirelessAccessTypeT createWirelessAccessTypeTObjectFromString(EDataType eDataType, String initialValue) {
		return createWirelessAccessTypeTFromString(carimModelPackage.Literals.WIRELESS_ACCESS_TYPE_T, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWirelessAccessTypeTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertWirelessAccessTypeTToString(carimModelPackage.Literals.WIRELESS_ACCESS_TYPE_T, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public carimModelPackage getcarimModelPackage() {
		return (carimModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static carimModelPackage getPackage() {
		return carimModelPackage.eINSTANCE;
	}

} //carimModelFactoryImpl
