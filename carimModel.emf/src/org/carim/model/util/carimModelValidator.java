/**
 */
package org.carim.model.util;

import java.util.Map;

import org.carim.model.*;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.carim.model.carimModelPackage
 * @generated
 */
public class carimModelValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final carimModelValidator INSTANCE = new carimModelValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.carim.model";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public carimModelValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return carimModelPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case carimModelPackage.ATTITUDE:
				return validateAttitude((Attitude)value, diagnostics, context);
			case carimModelPackage.AVM:
				return validateAvm((Avm)value, diagnostics, context);
			case carimModelPackage.COMMUNICATION_CONTEXT:
				return validateCommunicationContext((CommunicationContext)value, diagnostics, context);
			case carimModelPackage.COOPERATIVITY:
				return validateCooperativity((Cooperativity)value, diagnostics, context);
			case carimModelPackage.DATE_TIME_T:
				return validateDateTimeT((DateTimeT)value, diagnostics, context);
			case carimModelPackage.DEVICE_CONTEXT:
				return validateDeviceContext((DeviceContext)value, diagnostics, context);
			case carimModelPackage.DIALOGUE:
				return validateDialogue((Dialogue)value, diagnostics, context);
			case carimModelPackage.DIALOGUE_STEP_T:
				return validateDialogueStepT((DialogueStepT)value, diagnostics, context);
			case carimModelPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case carimModelPackage.DYNAMIC_CONTEXT:
				return validateDynamicContext((DynamicContext)value, diagnostics, context);
			case carimModelPackage.GUI_INPUT:
				return validateGuiInput((GuiInput)value, diagnostics, context);
			case carimModelPackage.LOCATION_TIME_CONTEXT:
				return validateLocationTimeContext((LocationTimeContext)value, diagnostics, context);
			case carimModelPackage.METACOMM:
				return validateMetacomm((Metacomm)value, diagnostics, context);
			case carimModelPackage.MODALITY_APPROPRIATENESS:
				return validateModalityAppropriateness((ModalityAppropriateness)value, diagnostics, context);
			case carimModelPackage.MODALITY_CHANGE:
				return validateModalityChange((ModalityChange)value, diagnostics, context);
			case carimModelPackage.MODALITY_INFO:
				return validateModalityInfo((ModalityInfo)value, diagnostics, context);
			case carimModelPackage.MODALITY_SYNCHRONI:
				return validateModalitySynchroni((ModalitySynchroni)value, diagnostics, context);
			case carimModelPackage.MOTION_INPUT:
				return validateMotionInput((MotionInput)value, diagnostics, context);
			case carimModelPackage.PHYSICAL_CONTEXT:
				return validatePhysicalContext((PhysicalContext)value, diagnostics, context);
			case carimModelPackage.SOCIAL_CONTEXT:
				return validateSocialContext((SocialContext)value, diagnostics, context);
			case carimModelPackage.SPEECH_INPUT:
				return validateSpeechInput((SpeechInput)value, diagnostics, context);
			case carimModelPackage.SPEECH_OUTPUT:
				return validateSpeechOutput((SpeechOutput)value, diagnostics, context);
			case carimModelPackage.SYSTEM_METACOMM:
				return validateSystemMetacomm((SystemMetacomm)value, diagnostics, context);
			case carimModelPackage.SYSTEM_TURN:
				return validateSystemTurn((SystemTurn)value, diagnostics, context);
			case carimModelPackage.TASK:
				return validateTask((Task)value, diagnostics, context);
			case carimModelPackage.TRIAL:
				return validateTrial((Trial)value, diagnostics, context);
			case carimModelPackage.TURN:
				return validateTurn((Turn)value, diagnostics, context);
			case carimModelPackage.USER_ATTITUDE:
				return validateUserAttitude((UserAttitude)value, diagnostics, context);
			case carimModelPackage.USER_DATA:
				return validateUserData((UserData)value, diagnostics, context);
			case carimModelPackage.USER_METACOMM:
				return validateUserMetacomm((UserMetacomm)value, diagnostics, context);
			case carimModelPackage.USER_RATINGS:
				return validateUserRatings((UserRatings)value, diagnostics, context);
			case carimModelPackage.USER_TURN:
				return validateUserTurn((UserTurn)value, diagnostics, context);
			case carimModelPackage.CONTEXTUAL_APPROPRIATENESS_T:
				return validateContextualAppropriatenessT((ContextualAppropriatenessT)value, diagnostics, context);
			case carimModelPackage.DEVICE_TYPE_T:
				return validateDeviceTypeT((DeviceTypeT)value, diagnostics, context);
			case carimModelPackage.EDUCATION_LEVEL_T:
				return validateEducationLevelT((EducationLevelT)value, diagnostics, context);
			case carimModelPackage.GENDER_T:
				return validateGenderT((GenderT)value, diagnostics, context);
			case carimModelPackage.LOCATION_T:
				return validateLocationT((LocationT)value, diagnostics, context);
			case carimModelPackage.MC_REASON_T:
				return validateMcReasonT((McReasonT)value, diagnostics, context);
			case carimModelPackage.MMI_TYPE_T:
				return validateMmiTypeT((MmiTypeT)value, diagnostics, context);
			case carimModelPackage.MOBILITY_LEVEL_T:
				return validateMobilityLevelT((MobilityLevelT)value, diagnostics, context);
			case carimModelPackage.MOD_APPROP_T:
				return validateModAppropT((ModAppropT)value, diagnostics, context);
			case carimModelPackage.MOD_TYPE_T:
				return validateModTypeT((ModTypeT)value, diagnostics, context);
			case carimModelPackage.PARSING_RESULT_T:
				return validateParsingResultT((ParsingResultT)value, diagnostics, context);
			case carimModelPackage.PREVIOUS_EXPERIENCE_T:
				return validatePreviousExperienceT((PreviousExperienceT)value, diagnostics, context);
			case carimModelPackage.PROMPT_TYPE_T:
				return validatePromptTypeT((PromptTypeT)value, diagnostics, context);
			case carimModelPackage.ROLE_T:
				return validateRoleT((RoleT)value, diagnostics, context);
			case carimModelPackage.SCREEN_ORIENTATION_T:
				return validateScreenOrientationT((ScreenOrientationT)value, diagnostics, context);
			case carimModelPackage.SCREEN_RESOLUTION_T:
				return validateScreenResolutionT((ScreenResolutionT)value, diagnostics, context);
			case carimModelPackage.SCREEN_SIZE_T:
				return validateScreenSizeT((ScreenSizeT)value, diagnostics, context);
			case carimModelPackage.SOCIAL_ARENA_T:
				return validateSocialArenaT((SocialArenaT)value, diagnostics, context);
			case carimModelPackage.SOCIAL_COMPANY_T:
				return validateSocialCompanyT((SocialCompanyT)value, diagnostics, context);
			case carimModelPackage.TASK_SUCCESS_T:
				return validateTaskSuccessT((TaskSuccessT)value, diagnostics, context);
			case carimModelPackage.WEATHER_T:
				return validateWeatherT((WeatherT)value, diagnostics, context);
			case carimModelPackage.WIRELESS_ACCESS_TYPE_T:
				return validateWirelessAccessTypeT((WirelessAccessTypeT)value, diagnostics, context);
			case carimModelPackage.CONTEXTUAL_APPROPRIATENESS_TOBJECT:
				return validateContextualAppropriatenessTObject((ContextualAppropriatenessT)value, diagnostics, context);
			case carimModelPackage.DDAY_TYPE:
				return validateDDayType((Integer)value, diagnostics, context);
			case carimModelPackage.DDAY_TYPE_OBJECT:
				return validateDDayTypeObject((Integer)value, diagnostics, context);
			case carimModelPackage.DEVICE_TYPE_TOBJECT:
				return validateDeviceTypeTObject((DeviceTypeT)value, diagnostics, context);
			case carimModelPackage.DMONTH_TYPE:
				return validateDMonthType((Integer)value, diagnostics, context);
			case carimModelPackage.DMONTH_TYPE_OBJECT:
				return validateDMonthTypeObject((Integer)value, diagnostics, context);
			case carimModelPackage.DYEAR_TYPE:
				return validateDYearType((Integer)value, diagnostics, context);
			case carimModelPackage.DYEAR_TYPE_OBJECT:
				return validateDYearTypeObject((Integer)value, diagnostics, context);
			case carimModelPackage.EDUCATION_LEVEL_TOBJECT:
				return validateEducationLevelTObject((EducationLevelT)value, diagnostics, context);
			case carimModelPackage.GENDER_TOBJECT:
				return validateGenderTObject((GenderT)value, diagnostics, context);
			case carimModelPackage.LIKERT5_VALUE:
				return validateLikert5Value((Float)value, diagnostics, context);
			case carimModelPackage.LIKERT5_VALUE_OBJECT:
				return validateLikert5ValueObject((Float)value, diagnostics, context);
			case carimModelPackage.LIKERT7_VALUE:
				return validateLikert7Value((Float)value, diagnostics, context);
			case carimModelPackage.LIKERT7_VALUE_OBJECT:
				return validateLikert7ValueObject((Float)value, diagnostics, context);
			case carimModelPackage.LOCATION_TOBJECT:
				return validateLocationTObject((LocationT)value, diagnostics, context);
			case carimModelPackage.MC_REASON_TOBJECT:
				return validateMcReasonTObject((McReasonT)value, diagnostics, context);
			case carimModelPackage.MMI_TYPE_TOBJECT:
				return validateMmiTypeTObject((MmiTypeT)value, diagnostics, context);
			case carimModelPackage.MOBILITY_LEVEL_TOBJECT:
				return validateMobilityLevelTObject((MobilityLevelT)value, diagnostics, context);
			case carimModelPackage.MOD_APPROP_TOBJECT:
				return validateModAppropTObject((ModAppropT)value, diagnostics, context);
			case carimModelPackage.MOD_TYPE_TOBJECT:
				return validateModTypeTObject((ModTypeT)value, diagnostics, context);
			case carimModelPackage.PARSING_RESULT_TOBJECT:
				return validateParsingResultTObject((ParsingResultT)value, diagnostics, context);
			case carimModelPackage.PERCENTAGE_T:
				return validatePercentageT((Integer)value, diagnostics, context);
			case carimModelPackage.PERCENTAGE_TOBJECT:
				return validatePercentageTObject((Integer)value, diagnostics, context);
			case carimModelPackage.PREVIOUS_EXPERIENCE_TOBJECT:
				return validatePreviousExperienceTObject((PreviousExperienceT)value, diagnostics, context);
			case carimModelPackage.PROMPT_TYPE_TOBJECT:
				return validatePromptTypeTObject((PromptTypeT)value, diagnostics, context);
			case carimModelPackage.ROLE_TOBJECT:
				return validateRoleTObject((RoleT)value, diagnostics, context);
			case carimModelPackage.SCREEN_ORIENTATION_TOBJECT:
				return validateScreenOrientationTObject((ScreenOrientationT)value, diagnostics, context);
			case carimModelPackage.SCREEN_RESOLUTION_TOBJECT:
				return validateScreenResolutionTObject((ScreenResolutionT)value, diagnostics, context);
			case carimModelPackage.SCREEN_SIZE_TOBJECT:
				return validateScreenSizeTObject((ScreenSizeT)value, diagnostics, context);
			case carimModelPackage.SOCIAL_ARENA_TOBJECT:
				return validateSocialArenaTObject((SocialArenaT)value, diagnostics, context);
			case carimModelPackage.SOCIAL_COMPANY_TOBJECT:
				return validateSocialCompanyTObject((SocialCompanyT)value, diagnostics, context);
			case carimModelPackage.TASK_SUCCESS_TOBJECT:
				return validateTaskSuccessTObject((TaskSuccessT)value, diagnostics, context);
			case carimModelPackage.THOURS_TYPE:
				return validateTHoursType((Integer)value, diagnostics, context);
			case carimModelPackage.THOURS_TYPE_OBJECT:
				return validateTHoursTypeObject((Integer)value, diagnostics, context);
			case carimModelPackage.TMINS_TYPE:
				return validateTMinsType((Integer)value, diagnostics, context);
			case carimModelPackage.TMINS_TYPE_OBJECT:
				return validateTMinsTypeObject((Integer)value, diagnostics, context);
			case carimModelPackage.TSECS_TYPE:
				return validateTSecsType((Integer)value, diagnostics, context);
			case carimModelPackage.TSECS_TYPE_OBJECT:
				return validateTSecsTypeObject((Integer)value, diagnostics, context);
			case carimModelPackage.WEATHER_TOBJECT:
				return validateWeatherTObject((WeatherT)value, diagnostics, context);
			case carimModelPackage.WIRELESS_ACCESS_TYPE_TOBJECT:
				return validateWirelessAccessTypeTObject((WirelessAccessTypeT)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttitude(Attitude attitude, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attitude, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAvm(Avm avm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(avm, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunicationContext(CommunicationContext communicationContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(communicationContext, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCooperativity(Cooperativity cooperativity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cooperativity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTimeT(DateTimeT dateTimeT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dateTimeT, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceContext(DeviceContext deviceContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceContext, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDialogue(Dialogue dialogue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dialogue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDialogueStepT(DialogueStepT dialogueStepT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dialogueStepT, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDynamicContext(DynamicContext dynamicContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dynamicContext, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGuiInput(GuiInput guiInput, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(guiInput, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationTimeContext(LocationTimeContext locationTimeContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(locationTimeContext, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetacomm(Metacomm metacomm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(metacomm, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModalityAppropriateness(ModalityAppropriateness modalityAppropriateness, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modalityAppropriateness, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModalityChange(ModalityChange modalityChange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modalityChange, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModalityInfo(ModalityInfo modalityInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modalityInfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModalitySynchroni(ModalitySynchroni modalitySynchroni, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modalitySynchroni, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMotionInput(MotionInput motionInput, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(motionInput, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalContext(PhysicalContext physicalContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(physicalContext, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialContext(SocialContext socialContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(socialContext, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpeechInput(SpeechInput speechInput, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(speechInput, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpeechOutput(SpeechOutput speechOutput, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(speechOutput, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemMetacomm(SystemMetacomm systemMetacomm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(systemMetacomm, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemTurn(SystemTurn systemTurn, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(systemTurn, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(task, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrial(Trial trial, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trial, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTurn(Turn turn, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(turn, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUserAttitude(UserAttitude userAttitude, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(userAttitude, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUserData(UserData userData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(userData, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUserMetacomm(UserMetacomm userMetacomm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(userMetacomm, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUserRatings(UserRatings userRatings, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(userRatings, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUserTurn(UserTurn userTurn, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(userTurn, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContextualAppropriatenessT(ContextualAppropriatenessT contextualAppropriatenessT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceTypeT(DeviceTypeT deviceTypeT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEducationLevelT(EducationLevelT educationLevelT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenderT(GenderT genderT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationT(LocationT locationT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMcReasonT(McReasonT mcReasonT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMmiTypeT(MmiTypeT mmiTypeT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMobilityLevelT(MobilityLevelT mobilityLevelT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModAppropT(ModAppropT modAppropT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModTypeT(ModTypeT modTypeT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParsingResultT(ParsingResultT parsingResultT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePreviousExperienceT(PreviousExperienceT previousExperienceT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePromptTypeT(PromptTypeT promptTypeT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleT(RoleT roleT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScreenOrientationT(ScreenOrientationT screenOrientationT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScreenResolutionT(ScreenResolutionT screenResolutionT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScreenSizeT(ScreenSizeT screenSizeT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialArenaT(SocialArenaT socialArenaT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialCompanyT(SocialCompanyT socialCompanyT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskSuccessT(TaskSuccessT taskSuccessT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWeatherT(WeatherT weatherT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWirelessAccessTypeT(WirelessAccessTypeT wirelessAccessTypeT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContextualAppropriatenessTObject(ContextualAppropriatenessT contextualAppropriatenessTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDDayType(int dDayType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDDayType_Min(dDayType, diagnostics, context);
		if (result || diagnostics != null) result &= validateDDayType_Max(dDayType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDDayType_Min
	 */
	public static final int DDAY_TYPE__MIN__VALUE = 1;

	/**
	 * Validates the Min constraint of '<em>DDay Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDDayType_Min(int dDayType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = dDayType >= DDAY_TYPE__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(carimModelPackage.Literals.DDAY_TYPE, dDayType, DDAY_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDDayType_Max
	 */
	public static final int DDAY_TYPE__MAX__VALUE = 31;

	/**
	 * Validates the Max constraint of '<em>DDay Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDDayType_Max(int dDayType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = dDayType <= DDAY_TYPE__MAX__VALUE;
		if (!result && diagnostics != null)
			reportMaxViolation(carimModelPackage.Literals.DDAY_TYPE, dDayType, DDAY_TYPE__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDDayTypeObject(Integer dDayTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDDayType_Min(dDayTypeObject, diagnostics, context);
		if (result || diagnostics != null) result &= validateDDayType_Max(dDayTypeObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceTypeTObject(DeviceTypeT deviceTypeTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDMonthType(int dMonthType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDMonthType_Min(dMonthType, diagnostics, context);
		if (result || diagnostics != null) result &= validateDMonthType_Max(dMonthType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDMonthType_Min
	 */
	public static final int DMONTH_TYPE__MIN__VALUE = 1;

	/**
	 * Validates the Min constraint of '<em>DMonth Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDMonthType_Min(int dMonthType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = dMonthType >= DMONTH_TYPE__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(carimModelPackage.Literals.DMONTH_TYPE, dMonthType, DMONTH_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDMonthType_Max
	 */
	public static final int DMONTH_TYPE__MAX__VALUE = 12;

	/**
	 * Validates the Max constraint of '<em>DMonth Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDMonthType_Max(int dMonthType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = dMonthType <= DMONTH_TYPE__MAX__VALUE;
		if (!result && diagnostics != null)
			reportMaxViolation(carimModelPackage.Literals.DMONTH_TYPE, dMonthType, DMONTH_TYPE__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDMonthTypeObject(Integer dMonthTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDMonthType_Min(dMonthTypeObject, diagnostics, context);
		if (result || diagnostics != null) result &= validateDMonthType_Max(dMonthTypeObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDYearType(int dYearType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDYearType_Min(dYearType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDYearType_Min
	 */
	public static final int DYEAR_TYPE__MIN__VALUE = 1980;

	/**
	 * Validates the Min constraint of '<em>DYear Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDYearType_Min(int dYearType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = dYearType >= DYEAR_TYPE__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(carimModelPackage.Literals.DYEAR_TYPE, dYearType, DYEAR_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDYearTypeObject(Integer dYearTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDYearType_Min(dYearTypeObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEducationLevelTObject(EducationLevelT educationLevelTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenderTObject(GenderT genderTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLikert5Value(float likert5Value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLikert5Value_Min(likert5Value, diagnostics, context);
		if (result || diagnostics != null) result &= validateLikert5Value_Max(likert5Value, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateLikert5Value_Min
	 */
	public static final float LIKERT5_VALUE__MIN__VALUE = 0.0F;

	/**
	 * Validates the Min constraint of '<em>Likert5 Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLikert5Value_Min(float likert5Value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = likert5Value >= LIKERT5_VALUE__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(carimModelPackage.Literals.LIKERT5_VALUE, likert5Value, LIKERT5_VALUE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateLikert5Value_Max
	 */
	public static final float LIKERT5_VALUE__MAX__VALUE = 4.0F;

	/**
	 * Validates the Max constraint of '<em>Likert5 Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLikert5Value_Max(float likert5Value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = likert5Value <= LIKERT5_VALUE__MAX__VALUE;
		if (!result && diagnostics != null)
			reportMaxViolation(carimModelPackage.Literals.LIKERT5_VALUE, likert5Value, LIKERT5_VALUE__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLikert5ValueObject(Float likert5ValueObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLikert5Value_Min(likert5ValueObject, diagnostics, context);
		if (result || diagnostics != null) result &= validateLikert5Value_Max(likert5ValueObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLikert7Value(float likert7Value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLikert7Value_Min(likert7Value, diagnostics, context);
		if (result || diagnostics != null) result &= validateLikert7Value_Max(likert7Value, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateLikert7Value_Min
	 */
	public static final float LIKERT7_VALUE__MIN__VALUE = 0.0F;

	/**
	 * Validates the Min constraint of '<em>Likert7 Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLikert7Value_Min(float likert7Value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = likert7Value >= LIKERT7_VALUE__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(carimModelPackage.Literals.LIKERT7_VALUE, likert7Value, LIKERT7_VALUE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateLikert7Value_Max
	 */
	public static final float LIKERT7_VALUE__MAX__VALUE = 6.0F;

	/**
	 * Validates the Max constraint of '<em>Likert7 Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLikert7Value_Max(float likert7Value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = likert7Value <= LIKERT7_VALUE__MAX__VALUE;
		if (!result && diagnostics != null)
			reportMaxViolation(carimModelPackage.Literals.LIKERT7_VALUE, likert7Value, LIKERT7_VALUE__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLikert7ValueObject(Float likert7ValueObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLikert7Value_Min(likert7ValueObject, diagnostics, context);
		if (result || diagnostics != null) result &= validateLikert7Value_Max(likert7ValueObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationTObject(LocationT locationTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMcReasonTObject(McReasonT mcReasonTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMmiTypeTObject(MmiTypeT mmiTypeTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMobilityLevelTObject(MobilityLevelT mobilityLevelTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModAppropTObject(ModAppropT modAppropTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModTypeTObject(ModTypeT modTypeTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParsingResultTObject(ParsingResultT parsingResultTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePercentageT(int percentageT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePercentageT_Min(percentageT, diagnostics, context);
		if (result || diagnostics != null) result &= validatePercentageT_Max(percentageT, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePercentageT_Min
	 */
	public static final int PERCENTAGE_T__MIN__VALUE = 0;

	/**
	 * Validates the Min constraint of '<em>Percentage T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePercentageT_Min(int percentageT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = percentageT >= PERCENTAGE_T__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(carimModelPackage.Literals.PERCENTAGE_T, percentageT, PERCENTAGE_T__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePercentageT_Max
	 */
	public static final int PERCENTAGE_T__MAX__VALUE = 100;

	/**
	 * Validates the Max constraint of '<em>Percentage T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePercentageT_Max(int percentageT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = percentageT <= PERCENTAGE_T__MAX__VALUE;
		if (!result && diagnostics != null)
			reportMaxViolation(carimModelPackage.Literals.PERCENTAGE_T, percentageT, PERCENTAGE_T__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePercentageTObject(Integer percentageTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePercentageT_Min(percentageTObject, diagnostics, context);
		if (result || diagnostics != null) result &= validatePercentageT_Max(percentageTObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePreviousExperienceTObject(PreviousExperienceT previousExperienceTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePromptTypeTObject(PromptTypeT promptTypeTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleTObject(RoleT roleTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScreenOrientationTObject(ScreenOrientationT screenOrientationTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScreenResolutionTObject(ScreenResolutionT screenResolutionTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScreenSizeTObject(ScreenSizeT screenSizeTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialArenaTObject(SocialArenaT socialArenaTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialCompanyTObject(SocialCompanyT socialCompanyTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskSuccessTObject(TaskSuccessT taskSuccessTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTHoursType(int tHoursType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTHoursType_Min(tHoursType, diagnostics, context);
		if (result || diagnostics != null) result &= validateTHoursType_Max(tHoursType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTHoursType_Min
	 */
	public static final int THOURS_TYPE__MIN__VALUE = 0;

	/**
	 * Validates the Min constraint of '<em>THours Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTHoursType_Min(int tHoursType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = tHoursType >= THOURS_TYPE__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(carimModelPackage.Literals.THOURS_TYPE, tHoursType, THOURS_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTHoursType_Max
	 */
	public static final int THOURS_TYPE__MAX__VALUE = 24;

	/**
	 * Validates the Max constraint of '<em>THours Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTHoursType_Max(int tHoursType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = tHoursType < THOURS_TYPE__MAX__VALUE;
		if (!result && diagnostics != null)
			reportMaxViolation(carimModelPackage.Literals.THOURS_TYPE, tHoursType, THOURS_TYPE__MAX__VALUE, false, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTHoursTypeObject(Integer tHoursTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTHoursType_Min(tHoursTypeObject, diagnostics, context);
		if (result || diagnostics != null) result &= validateTHoursType_Max(tHoursTypeObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTMinsType(int tMinsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTMinsType_Min(tMinsType, diagnostics, context);
		if (result || diagnostics != null) result &= validateTMinsType_Max(tMinsType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTMinsType_Min
	 */
	public static final int TMINS_TYPE__MIN__VALUE = 0;

	/**
	 * Validates the Min constraint of '<em>TMins Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTMinsType_Min(int tMinsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = tMinsType >= TMINS_TYPE__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(carimModelPackage.Literals.TMINS_TYPE, tMinsType, TMINS_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTMinsType_Max
	 */
	public static final int TMINS_TYPE__MAX__VALUE = 60;

	/**
	 * Validates the Max constraint of '<em>TMins Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTMinsType_Max(int tMinsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = tMinsType < TMINS_TYPE__MAX__VALUE;
		if (!result && diagnostics != null)
			reportMaxViolation(carimModelPackage.Literals.TMINS_TYPE, tMinsType, TMINS_TYPE__MAX__VALUE, false, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTMinsTypeObject(Integer tMinsTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTMinsType_Min(tMinsTypeObject, diagnostics, context);
		if (result || diagnostics != null) result &= validateTMinsType_Max(tMinsTypeObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTSecsType(int tSecsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTSecsType_Min(tSecsType, diagnostics, context);
		if (result || diagnostics != null) result &= validateTSecsType_Max(tSecsType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTSecsType_Min
	 */
	public static final int TSECS_TYPE__MIN__VALUE = 0;

	/**
	 * Validates the Min constraint of '<em>TSecs Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTSecsType_Min(int tSecsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = tSecsType >= TSECS_TYPE__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(carimModelPackage.Literals.TSECS_TYPE, tSecsType, TSECS_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTSecsType_Max
	 */
	public static final int TSECS_TYPE__MAX__VALUE = 60;

	/**
	 * Validates the Max constraint of '<em>TSecs Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTSecsType_Max(int tSecsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = tSecsType < TSECS_TYPE__MAX__VALUE;
		if (!result && diagnostics != null)
			reportMaxViolation(carimModelPackage.Literals.TSECS_TYPE, tSecsType, TSECS_TYPE__MAX__VALUE, false, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTSecsTypeObject(Integer tSecsTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTSecsType_Min(tSecsTypeObject, diagnostics, context);
		if (result || diagnostics != null) result &= validateTSecsType_Max(tSecsTypeObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWeatherTObject(WeatherT weatherTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWirelessAccessTypeTObject(WirelessAccessTypeT wirelessAccessTypeTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //carimModelValidator
