/**
 */
package org.carim.model.impl;

import org.carim.model.Attitude;
import org.carim.model.Avm;
import org.carim.model.CommunicationContext;
import org.carim.model.ContextualAppropriatenessT;
import org.carim.model.Cooperativity;
import org.carim.model.DateTimeT;
import org.carim.model.DeviceContext;
import org.carim.model.DeviceTypeT;
import org.carim.model.Dialogue;
import org.carim.model.DialogueStepT;
import org.carim.model.DocumentRoot;
import org.carim.model.DynamicContext;
import org.carim.model.EducationLevelT;
import org.carim.model.GenderT;
import org.carim.model.GuiInput;
import org.carim.model.LocationT;
import org.carim.model.LocationTimeContext;
import org.carim.model.McReasonT;
import org.carim.model.Metacomm;
import org.carim.model.MmiTypeT;
import org.carim.model.MobilityLevelT;
import org.carim.model.ModAppropT;
import org.carim.model.ModTypeT;
import org.carim.model.ModalityAppropriateness;
import org.carim.model.ModalityChange;
import org.carim.model.ModalityInfo;
import org.carim.model.ModalitySynchroni;
import org.carim.model.MotionInput;
import org.carim.model.ParsingResultT;
import org.carim.model.PhysicalContext;
import org.carim.model.PreviousExperienceT;
import org.carim.model.PromptTypeT;
import org.carim.model.RoleT;
import org.carim.model.ScreenOrientationT;
import org.carim.model.ScreenResolutionT;
import org.carim.model.ScreenSizeT;
import org.carim.model.SocialArenaT;
import org.carim.model.SocialCompanyT;
import org.carim.model.SocialContext;
import org.carim.model.SpeechInput;
import org.carim.model.SpeechOutput;
import org.carim.model.SystemMetacomm;
import org.carim.model.SystemTurn;
import org.carim.model.Task;
import org.carim.model.TaskSuccessT;
import org.carim.model.Trial;
import org.carim.model.Turn;
import org.carim.model.UserAttitude;
import org.carim.model.UserData;
import org.carim.model.UserMetacomm;
import org.carim.model.UserRatings;
import org.carim.model.UserTurn;
import org.carim.model.WeatherT;
import org.carim.model.WirelessAccessTypeT;
import org.carim.model.carimModelFactory;
import org.carim.model.carimModelPackage;

import org.carim.model.util.carimModelValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class carimModelPackageImpl extends EPackageImpl implements carimModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attitudeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass avmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cooperativityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTimeTEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dialogueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dialogueStepTEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dynamicContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guiInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationTimeContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metacommEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modalityAppropriatenessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modalityChangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modalityInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modalitySynchroniEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass motionInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass socialContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass speechInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass speechOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemMetacommEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemTurnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trialEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass turnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userAttitudeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userMetacommEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userRatingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userTurnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contextualAppropriatenessTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum deviceTypeTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum educationLevelTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum genderTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum locationTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mcReasonTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mmiTypeTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mobilityLevelTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modAppropTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modTypeTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum parsingResultTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum previousExperienceTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum promptTypeTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum roleTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum screenOrientationTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum screenResolutionTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum screenSizeTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum socialArenaTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum socialCompanyTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum taskSuccessTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum weatherTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum wirelessAccessTypeTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType contextualAppropriatenessTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dDayTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dDayTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType deviceTypeTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dMonthTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dMonthTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dYearTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dYearTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType educationLevelTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType genderTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType likert5ValueEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType likert5ValueObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType likert7ValueEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType likert7ValueObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType locationTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mcReasonTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mmiTypeTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mobilityLevelTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType modAppropTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType modTypeTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType parsingResultTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType percentageTEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType percentageTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType previousExperienceTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType promptTypeTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType roleTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType screenOrientationTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType screenResolutionTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType screenSizeTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType socialArenaTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType socialCompanyTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType taskSuccessTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tHoursTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tHoursTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tMinsTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tMinsTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tSecsTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tSecsTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType weatherTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType wirelessAccessTypeTObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.carim.model.carimModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private carimModelPackageImpl() {
		super(eNS_URI, carimModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link carimModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static carimModelPackage init() {
		if (isInited) return (carimModelPackage)EPackage.Registry.INSTANCE.getEPackage(carimModelPackage.eNS_URI);

		// Obtain or create and register package
		carimModelPackageImpl thecarimModelPackage = (carimModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof carimModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new carimModelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thecarimModelPackage.createPackageContents();

		// Initialize created meta-data
		thecarimModelPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(thecarimModelPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return carimModelValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		thecarimModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(carimModelPackage.eNS_URI, thecarimModelPackage);
		return thecarimModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttitude() {
		return attitudeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAvm() {
		return avmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationContext() {
		return communicationContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommunicationContext_WirelessAccessType() {
		return (EAttribute)communicationContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommunicationContext_AccessPointName() {
		return (EAttribute)communicationContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommunicationContext_SignalStrength() {
		return (EAttribute)communicationContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommunicationContext_ReceivedDataThroughput() {
		return (EAttribute)communicationContextEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommunicationContext_SentDataThroughput() {
		return (EAttribute)communicationContextEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommunicationContext_Rtt() {
		return (EAttribute)communicationContextEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommunicationContext_Srt() {
		return (EAttribute)communicationContextEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCooperativity() {
		return cooperativityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCooperativity_ContextualAppropriateness() {
		return (EAttribute)cooperativityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateTimeT() {
		return dateTimeTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateTimeT_DDay() {
		return (EAttribute)dateTimeTEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateTimeT_DMonth() {
		return (EAttribute)dateTimeTEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateTimeT_DYear() {
		return (EAttribute)dateTimeTEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateTimeT_THours() {
		return (EAttribute)dateTimeTEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateTimeT_TMins() {
		return (EAttribute)dateTimeTEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateTimeT_TSecs() {
		return (EAttribute)dateTimeTEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceContext() {
		return deviceContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceContext_DeviceType() {
		return (EAttribute)deviceContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceContext_ScreenSize() {
		return (EAttribute)deviceContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceContext_ScreenResolution() {
		return (EAttribute)deviceContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceContext_ScreenOrientation() {
		return (EAttribute)deviceContextEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceContext_ScreenBrightnessLevel() {
		return (EAttribute)deviceContextEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceContext_VolumeLevel() {
		return (EAttribute)deviceContextEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceContext_MemoryUsage() {
		return (EAttribute)deviceContextEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceContext_CpuUsage() {
		return (EAttribute)deviceContextEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDialogue() {
		return dialogueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDialogue_BaseTimestamp() {
		return (EAttribute)dialogueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDialogue_Task() {
		return (EReference)dialogueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDialogue_Step() {
		return (EReference)dialogueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDialogueStepT() {
		return dialogueStepTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDialogueStepT_SystemTurn() {
		return (EReference)dialogueStepTEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDialogueStepT_UserTurn() {
		return (EReference)dialogueStepTEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Trial() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDynamicContext() {
		return dynamicContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDynamicContext_PhysicalContext() {
		return (EReference)dynamicContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDynamicContext_SocialContext() {
		return (EReference)dynamicContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDynamicContext_LocationTimeContext() {
		return (EReference)dynamicContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDynamicContext_DeviceContext() {
		return (EReference)dynamicContextEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDynamicContext_CommunicationContext() {
		return (EReference)dynamicContextEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuiInput() {
		return guiInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuiInput_TextElements() {
		return (EAttribute)guiInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuiInput_NavigationActions() {
		return (EAttribute)guiInputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuiInput_NavigationMoves() {
		return (EAttribute)guiInputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuiInput_NavigationLength() {
		return (EAttribute)guiInputEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuiInput_ExploringActions() {
		return (EAttribute)guiInputEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuiInput_TransferringActions() {
		return (EAttribute)guiInputEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocationTimeContext() {
		return locationTimeContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationTimeContext_Location() {
		return (EAttribute)locationTimeContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationTimeContext_GeoLatitude() {
		return (EAttribute)locationTimeContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationTimeContext_GeoLongitude() {
		return (EAttribute)locationTimeContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationTimeContext_MobilityLevel() {
		return (EAttribute)locationTimeContextEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationTimeContext_Time() {
		return (EReference)locationTimeContextEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetacomm() {
		return metacommEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetacomm_IsHelp() {
		return (EAttribute)metacommEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetacomm_IsCorrection() {
		return (EAttribute)metacommEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModalityAppropriateness() {
		return modalityAppropriatenessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModalityAppropriateness_Appropriateness() {
		return (EAttribute)modalityAppropriatenessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModalityChange() {
		return modalityChangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModalityChange_Origin() {
		return (EAttribute)modalityChangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModalityChange_Reason() {
		return (EAttribute)modalityChangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModalityInfo() {
		return modalityInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModalityInfo_ModalityType() {
		return (EAttribute)modalityInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModalityInfo_MminteractionType() {
		return (EAttribute)modalityInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModalityInfo_Appropriateness() {
		return (EReference)modalityInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModalityInfo_Synchroni() {
		return (EReference)modalityInfoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModalityInfo_Change() {
		return (EReference)modalityInfoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModalitySynchroni() {
		return modalitySynchroniEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModalitySynchroni_Nlags() {
		return (EAttribute)modalitySynchroniEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModalitySynchroni_Lagtime() {
		return (EAttribute)modalitySynchroniEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModalitySynchroni_Nevents() {
		return (EAttribute)modalitySynchroniEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMotionInput() {
		return motionInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMotionInput_TiltMovements() {
		return (EAttribute)motionInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMotionInput_TwistMovements() {
		return (EAttribute)motionInputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMotionInput_ShakeMovements() {
		return (EAttribute)motionInputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalContext() {
		return physicalContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalContext_Temperature() {
		return (EAttribute)physicalContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalContext_Weather() {
		return (EAttribute)physicalContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalContext_Noise() {
		return (EAttribute)physicalContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalContext_Light() {
		return (EAttribute)physicalContextEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSocialContext() {
		return socialContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSocialContext_Company() {
		return (EAttribute)socialContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSocialContext_Arena() {
		return (EAttribute)socialContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpeechInput() {
		return speechInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeechInput_OverallWords() {
		return (EAttribute)speechInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeechInput_SubstitutedWords() {
		return (EAttribute)speechInputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeechInput_DeletedWords() {
		return (EAttribute)speechInputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeechInput_InsertedWords() {
		return (EAttribute)speechInputEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeechInput_OverallSentences() {
		return (EAttribute)speechInputEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeechInput_SubstitutedSentences() {
		return (EAttribute)speechInputEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeechInput_DeletedSentences() {
		return (EAttribute)speechInputEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeechInput_InsertedSentences() {
		return (EAttribute)speechInputEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeechInput_OverallConcepts() {
		return (EAttribute)speechInputEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeechInput_SubstitutedConcepts() {
		return (EAttribute)speechInputEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeechInput_DeletedConcepts() {
		return (EAttribute)speechInputEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeechInput_InsertedConcepts() {
		return (EAttribute)speechInputEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeechInput_ParsingResult() {
		return (EAttribute)speechInputEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpeechOutput() {
		return speechOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeechOutput_ANCO() {
		return (EAttribute)speechOutputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeechOutput_ANIN() {
		return (EAttribute)speechOutputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeechOutput_ANPA() {
		return (EAttribute)speechOutputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeechOutput_ANFA() {
		return (EAttribute)speechOutputEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeechOutput_PromptType() {
		return (EAttribute)speechOutputEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemMetacomm() {
		return systemMetacommEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemMetacomm_IsASRReject() {
		return (EAttribute)systemMetacommEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemMetacomm_IsDIVReject() {
		return (EAttribute)systemMetacommEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemMetacomm_IsGRReject() {
		return (EAttribute)systemMetacommEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemTurn() {
		return systemTurnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemTurn_Metacomm() {
		return (EReference)systemTurnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemTurn_SpeechOutput() {
		return (EReference)systemTurnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemTurn_Cooperativity() {
		return (EReference)systemTurnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Success() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Reason() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Avm() {
		return (EReference)taskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrial() {
		return trialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrial_Description() {
		return (EAttribute)trialEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrial_UserData() {
		return (EReference)trialEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrial_Dialogues() {
		return (EReference)trialEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTurn() {
		return turnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurn_FeedbackDelay() {
		return (EAttribute)turnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurn_FeedbackDuration() {
		return (EAttribute)turnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurn_ActionDuration() {
		return (EAttribute)turnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurn_Elements() {
		return (EAttribute)turnEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurn_Feedback() {
		return (EAttribute)turnEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurn_Concepts() {
		return (EAttribute)turnEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurn_Noise() {
		return (EAttribute)turnEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurn_Questions() {
		return (EAttribute)turnEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTurn_Modality() {
		return (EReference)turnEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTurn_Context() {
		return (EReference)turnEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserAttitude() {
		return userAttitudeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserAttitude_Usefulness() {
		return (EAttribute)userAttitudeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserAttitude_Pleasantness() {
		return (EAttribute)userAttitudeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserAttitude_Integration() {
		return (EAttribute)userAttitudeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserAttitude_SelfEfficacy() {
		return (EAttribute)userAttitudeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserAttitude_Comfort() {
		return (EAttribute)userAttitudeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserData() {
		return userDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserData_UserRatings() {
		return (EReference)userDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserData_UserMood() {
		return (EAttribute)userDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserData_UserAttitude() {
		return (EReference)userDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserData_Age() {
		return (EAttribute)userDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserData_Gender() {
		return (EAttribute)userDataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserData_EducationLevel() {
		return (EAttribute)userDataEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserData_PreviousExperience() {
		return (EAttribute)userDataEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserMetacomm() {
		return userMetacommEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserMetacomm_IsTimeOut() {
		return (EAttribute)userMetacommEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserMetacomm_IsCancel() {
		return (EAttribute)userMetacommEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserMetacomm_IsRestart() {
		return (EAttribute)userMetacommEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserMetacomm_IsBargein() {
		return (EAttribute)userMetacommEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserMetacomm_IsSuccessfulBargein() {
		return (EAttribute)userMetacommEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserRatings() {
		return userRatingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserRatings_Practical() {
		return (EAttribute)userRatingsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserRatings_Predictable() {
		return (EAttribute)userRatingsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserRatings_ClearlyStructured() {
		return (EAttribute)userRatingsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserRatings_Simple() {
		return (EAttribute)userRatingsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserRatings_Stylish() {
		return (EAttribute)userRatingsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserRatings_Premium() {
		return (EAttribute)userRatingsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserRatings_Creative() {
		return (EAttribute)userRatingsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserRatings_Captivating() {
		return (EAttribute)userRatingsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserRatings_Beautiful() {
		return (EAttribute)userRatingsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserRatings_Good() {
		return (EAttribute)userRatingsEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserTurn() {
		return userTurnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserTurn_Metacomm() {
		return (EReference)userTurnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserTurn_SpeechInput() {
		return (EReference)userTurnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserTurn_GuiInput() {
		return (EReference)userTurnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserTurn_MotionInput() {
		return (EReference)userTurnEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getContextualAppropriatenessT() {
		return contextualAppropriatenessTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDeviceTypeT() {
		return deviceTypeTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEducationLevelT() {
		return educationLevelTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGenderT() {
		return genderTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLocationT() {
		return locationTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMcReasonT() {
		return mcReasonTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMmiTypeT() {
		return mmiTypeTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMobilityLevelT() {
		return mobilityLevelTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getModAppropT() {
		return modAppropTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getModTypeT() {
		return modTypeTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParsingResultT() {
		return parsingResultTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPreviousExperienceT() {
		return previousExperienceTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPromptTypeT() {
		return promptTypeTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRoleT() {
		return roleTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getScreenOrientationT() {
		return screenOrientationTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getScreenResolutionT() {
		return screenResolutionTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getScreenSizeT() {
		return screenSizeTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSocialArenaT() {
		return socialArenaTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSocialCompanyT() {
		return socialCompanyTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTaskSuccessT() {
		return taskSuccessTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWeatherT() {
		return weatherTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWirelessAccessTypeT() {
		return wirelessAccessTypeTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getContextualAppropriatenessTObject() {
		return contextualAppropriatenessTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDDayType() {
		return dDayTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDDayTypeObject() {
		return dDayTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDeviceTypeTObject() {
		return deviceTypeTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDMonthType() {
		return dMonthTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDMonthTypeObject() {
		return dMonthTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDYearType() {
		return dYearTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDYearTypeObject() {
		return dYearTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEducationLevelTObject() {
		return educationLevelTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGenderTObject() {
		return genderTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLikert5Value() {
		return likert5ValueEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLikert5ValueObject() {
		return likert5ValueObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLikert7Value() {
		return likert7ValueEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLikert7ValueObject() {
		return likert7ValueObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLocationTObject() {
		return locationTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMcReasonTObject() {
		return mcReasonTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMmiTypeTObject() {
		return mmiTypeTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMobilityLevelTObject() {
		return mobilityLevelTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getModAppropTObject() {
		return modAppropTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getModTypeTObject() {
		return modTypeTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getParsingResultTObject() {
		return parsingResultTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPercentageT() {
		return percentageTEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPercentageTObject() {
		return percentageTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPreviousExperienceTObject() {
		return previousExperienceTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPromptTypeTObject() {
		return promptTypeTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRoleTObject() {
		return roleTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getScreenOrientationTObject() {
		return screenOrientationTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getScreenResolutionTObject() {
		return screenResolutionTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getScreenSizeTObject() {
		return screenSizeTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSocialArenaTObject() {
		return socialArenaTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSocialCompanyTObject() {
		return socialCompanyTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTaskSuccessTObject() {
		return taskSuccessTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTHoursType() {
		return tHoursTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTHoursTypeObject() {
		return tHoursTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTMinsType() {
		return tMinsTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTMinsTypeObject() {
		return tMinsTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTSecsType() {
		return tSecsTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTSecsTypeObject() {
		return tSecsTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getWeatherTObject() {
		return weatherTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getWirelessAccessTypeTObject() {
		return wirelessAccessTypeTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public carimModelFactory getcarimModelFactory() {
		return (carimModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		attitudeEClass = createEClass(ATTITUDE);

		avmEClass = createEClass(AVM);

		communicationContextEClass = createEClass(COMMUNICATION_CONTEXT);
		createEAttribute(communicationContextEClass, COMMUNICATION_CONTEXT__WIRELESS_ACCESS_TYPE);
		createEAttribute(communicationContextEClass, COMMUNICATION_CONTEXT__ACCESS_POINT_NAME);
		createEAttribute(communicationContextEClass, COMMUNICATION_CONTEXT__SIGNAL_STRENGTH);
		createEAttribute(communicationContextEClass, COMMUNICATION_CONTEXT__RECEIVED_DATA_THROUGHPUT);
		createEAttribute(communicationContextEClass, COMMUNICATION_CONTEXT__SENT_DATA_THROUGHPUT);
		createEAttribute(communicationContextEClass, COMMUNICATION_CONTEXT__RTT);
		createEAttribute(communicationContextEClass, COMMUNICATION_CONTEXT__SRT);

		cooperativityEClass = createEClass(COOPERATIVITY);
		createEAttribute(cooperativityEClass, COOPERATIVITY__CONTEXTUAL_APPROPRIATENESS);

		dateTimeTEClass = createEClass(DATE_TIME_T);
		createEAttribute(dateTimeTEClass, DATE_TIME_T__DDAY);
		createEAttribute(dateTimeTEClass, DATE_TIME_T__DMONTH);
		createEAttribute(dateTimeTEClass, DATE_TIME_T__DYEAR);
		createEAttribute(dateTimeTEClass, DATE_TIME_T__THOURS);
		createEAttribute(dateTimeTEClass, DATE_TIME_T__TMINS);
		createEAttribute(dateTimeTEClass, DATE_TIME_T__TSECS);

		deviceContextEClass = createEClass(DEVICE_CONTEXT);
		createEAttribute(deviceContextEClass, DEVICE_CONTEXT__DEVICE_TYPE);
		createEAttribute(deviceContextEClass, DEVICE_CONTEXT__SCREEN_SIZE);
		createEAttribute(deviceContextEClass, DEVICE_CONTEXT__SCREEN_RESOLUTION);
		createEAttribute(deviceContextEClass, DEVICE_CONTEXT__SCREEN_ORIENTATION);
		createEAttribute(deviceContextEClass, DEVICE_CONTEXT__SCREEN_BRIGHTNESS_LEVEL);
		createEAttribute(deviceContextEClass, DEVICE_CONTEXT__VOLUME_LEVEL);
		createEAttribute(deviceContextEClass, DEVICE_CONTEXT__MEMORY_USAGE);
		createEAttribute(deviceContextEClass, DEVICE_CONTEXT__CPU_USAGE);

		dialogueEClass = createEClass(DIALOGUE);
		createEAttribute(dialogueEClass, DIALOGUE__BASE_TIMESTAMP);
		createEReference(dialogueEClass, DIALOGUE__TASK);
		createEReference(dialogueEClass, DIALOGUE__STEP);

		dialogueStepTEClass = createEClass(DIALOGUE_STEP_T);
		createEReference(dialogueStepTEClass, DIALOGUE_STEP_T__SYSTEM_TURN);
		createEReference(dialogueStepTEClass, DIALOGUE_STEP_T__USER_TURN);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TRIAL);

		dynamicContextEClass = createEClass(DYNAMIC_CONTEXT);
		createEReference(dynamicContextEClass, DYNAMIC_CONTEXT__PHYSICAL_CONTEXT);
		createEReference(dynamicContextEClass, DYNAMIC_CONTEXT__SOCIAL_CONTEXT);
		createEReference(dynamicContextEClass, DYNAMIC_CONTEXT__LOCATION_TIME_CONTEXT);
		createEReference(dynamicContextEClass, DYNAMIC_CONTEXT__DEVICE_CONTEXT);
		createEReference(dynamicContextEClass, DYNAMIC_CONTEXT__COMMUNICATION_CONTEXT);

		guiInputEClass = createEClass(GUI_INPUT);
		createEAttribute(guiInputEClass, GUI_INPUT__TEXT_ELEMENTS);
		createEAttribute(guiInputEClass, GUI_INPUT__NAVIGATION_ACTIONS);
		createEAttribute(guiInputEClass, GUI_INPUT__NAVIGATION_MOVES);
		createEAttribute(guiInputEClass, GUI_INPUT__NAVIGATION_LENGTH);
		createEAttribute(guiInputEClass, GUI_INPUT__EXPLORING_ACTIONS);
		createEAttribute(guiInputEClass, GUI_INPUT__TRANSFERRING_ACTIONS);

		locationTimeContextEClass = createEClass(LOCATION_TIME_CONTEXT);
		createEAttribute(locationTimeContextEClass, LOCATION_TIME_CONTEXT__LOCATION);
		createEAttribute(locationTimeContextEClass, LOCATION_TIME_CONTEXT__GEO_LATITUDE);
		createEAttribute(locationTimeContextEClass, LOCATION_TIME_CONTEXT__GEO_LONGITUDE);
		createEAttribute(locationTimeContextEClass, LOCATION_TIME_CONTEXT__MOBILITY_LEVEL);
		createEReference(locationTimeContextEClass, LOCATION_TIME_CONTEXT__TIME);

		metacommEClass = createEClass(METACOMM);
		createEAttribute(metacommEClass, METACOMM__IS_HELP);
		createEAttribute(metacommEClass, METACOMM__IS_CORRECTION);

		modalityAppropriatenessEClass = createEClass(MODALITY_APPROPRIATENESS);
		createEAttribute(modalityAppropriatenessEClass, MODALITY_APPROPRIATENESS__APPROPRIATENESS);

		modalityChangeEClass = createEClass(MODALITY_CHANGE);
		createEAttribute(modalityChangeEClass, MODALITY_CHANGE__ORIGIN);
		createEAttribute(modalityChangeEClass, MODALITY_CHANGE__REASON);

		modalityInfoEClass = createEClass(MODALITY_INFO);
		createEAttribute(modalityInfoEClass, MODALITY_INFO__MODALITY_TYPE);
		createEAttribute(modalityInfoEClass, MODALITY_INFO__MMINTERACTION_TYPE);
		createEReference(modalityInfoEClass, MODALITY_INFO__APPROPRIATENESS);
		createEReference(modalityInfoEClass, MODALITY_INFO__SYNCHRONI);
		createEReference(modalityInfoEClass, MODALITY_INFO__CHANGE);

		modalitySynchroniEClass = createEClass(MODALITY_SYNCHRONI);
		createEAttribute(modalitySynchroniEClass, MODALITY_SYNCHRONI__NLAGS);
		createEAttribute(modalitySynchroniEClass, MODALITY_SYNCHRONI__LAGTIME);
		createEAttribute(modalitySynchroniEClass, MODALITY_SYNCHRONI__NEVENTS);

		motionInputEClass = createEClass(MOTION_INPUT);
		createEAttribute(motionInputEClass, MOTION_INPUT__TILT_MOVEMENTS);
		createEAttribute(motionInputEClass, MOTION_INPUT__TWIST_MOVEMENTS);
		createEAttribute(motionInputEClass, MOTION_INPUT__SHAKE_MOVEMENTS);

		physicalContextEClass = createEClass(PHYSICAL_CONTEXT);
		createEAttribute(physicalContextEClass, PHYSICAL_CONTEXT__TEMPERATURE);
		createEAttribute(physicalContextEClass, PHYSICAL_CONTEXT__WEATHER);
		createEAttribute(physicalContextEClass, PHYSICAL_CONTEXT__NOISE);
		createEAttribute(physicalContextEClass, PHYSICAL_CONTEXT__LIGHT);

		socialContextEClass = createEClass(SOCIAL_CONTEXT);
		createEAttribute(socialContextEClass, SOCIAL_CONTEXT__COMPANY);
		createEAttribute(socialContextEClass, SOCIAL_CONTEXT__ARENA);

		speechInputEClass = createEClass(SPEECH_INPUT);
		createEAttribute(speechInputEClass, SPEECH_INPUT__OVERALL_WORDS);
		createEAttribute(speechInputEClass, SPEECH_INPUT__SUBSTITUTED_WORDS);
		createEAttribute(speechInputEClass, SPEECH_INPUT__DELETED_WORDS);
		createEAttribute(speechInputEClass, SPEECH_INPUT__INSERTED_WORDS);
		createEAttribute(speechInputEClass, SPEECH_INPUT__OVERALL_SENTENCES);
		createEAttribute(speechInputEClass, SPEECH_INPUT__SUBSTITUTED_SENTENCES);
		createEAttribute(speechInputEClass, SPEECH_INPUT__DELETED_SENTENCES);
		createEAttribute(speechInputEClass, SPEECH_INPUT__INSERTED_SENTENCES);
		createEAttribute(speechInputEClass, SPEECH_INPUT__OVERALL_CONCEPTS);
		createEAttribute(speechInputEClass, SPEECH_INPUT__SUBSTITUTED_CONCEPTS);
		createEAttribute(speechInputEClass, SPEECH_INPUT__DELETED_CONCEPTS);
		createEAttribute(speechInputEClass, SPEECH_INPUT__INSERTED_CONCEPTS);
		createEAttribute(speechInputEClass, SPEECH_INPUT__PARSING_RESULT);

		speechOutputEClass = createEClass(SPEECH_OUTPUT);
		createEAttribute(speechOutputEClass, SPEECH_OUTPUT__ANCO);
		createEAttribute(speechOutputEClass, SPEECH_OUTPUT__ANIN);
		createEAttribute(speechOutputEClass, SPEECH_OUTPUT__ANPA);
		createEAttribute(speechOutputEClass, SPEECH_OUTPUT__ANFA);
		createEAttribute(speechOutputEClass, SPEECH_OUTPUT__PROMPT_TYPE);

		systemMetacommEClass = createEClass(SYSTEM_METACOMM);
		createEAttribute(systemMetacommEClass, SYSTEM_METACOMM__IS_ASR_REJECT);
		createEAttribute(systemMetacommEClass, SYSTEM_METACOMM__IS_DIV_REJECT);
		createEAttribute(systemMetacommEClass, SYSTEM_METACOMM__IS_GR_REJECT);

		systemTurnEClass = createEClass(SYSTEM_TURN);
		createEReference(systemTurnEClass, SYSTEM_TURN__METACOMM);
		createEReference(systemTurnEClass, SYSTEM_TURN__SPEECH_OUTPUT);
		createEReference(systemTurnEClass, SYSTEM_TURN__COOPERATIVITY);

		taskEClass = createEClass(TASK);
		createEAttribute(taskEClass, TASK__SUCCESS);
		createEAttribute(taskEClass, TASK__REASON);
		createEReference(taskEClass, TASK__AVM);

		trialEClass = createEClass(TRIAL);
		createEAttribute(trialEClass, TRIAL__DESCRIPTION);
		createEReference(trialEClass, TRIAL__USER_DATA);
		createEReference(trialEClass, TRIAL__DIALOGUES);

		turnEClass = createEClass(TURN);
		createEAttribute(turnEClass, TURN__FEEDBACK_DELAY);
		createEAttribute(turnEClass, TURN__FEEDBACK_DURATION);
		createEAttribute(turnEClass, TURN__ACTION_DURATION);
		createEAttribute(turnEClass, TURN__ELEMENTS);
		createEAttribute(turnEClass, TURN__FEEDBACK);
		createEAttribute(turnEClass, TURN__CONCEPTS);
		createEAttribute(turnEClass, TURN__NOISE);
		createEAttribute(turnEClass, TURN__QUESTIONS);
		createEReference(turnEClass, TURN__MODALITY);
		createEReference(turnEClass, TURN__CONTEXT);

		userAttitudeEClass = createEClass(USER_ATTITUDE);
		createEAttribute(userAttitudeEClass, USER_ATTITUDE__USEFULNESS);
		createEAttribute(userAttitudeEClass, USER_ATTITUDE__PLEASANTNESS);
		createEAttribute(userAttitudeEClass, USER_ATTITUDE__INTEGRATION);
		createEAttribute(userAttitudeEClass, USER_ATTITUDE__SELF_EFFICACY);
		createEAttribute(userAttitudeEClass, USER_ATTITUDE__COMFORT);

		userDataEClass = createEClass(USER_DATA);
		createEReference(userDataEClass, USER_DATA__USER_RATINGS);
		createEAttribute(userDataEClass, USER_DATA__USER_MOOD);
		createEReference(userDataEClass, USER_DATA__USER_ATTITUDE);
		createEAttribute(userDataEClass, USER_DATA__AGE);
		createEAttribute(userDataEClass, USER_DATA__GENDER);
		createEAttribute(userDataEClass, USER_DATA__EDUCATION_LEVEL);
		createEAttribute(userDataEClass, USER_DATA__PREVIOUS_EXPERIENCE);

		userMetacommEClass = createEClass(USER_METACOMM);
		createEAttribute(userMetacommEClass, USER_METACOMM__IS_TIME_OUT);
		createEAttribute(userMetacommEClass, USER_METACOMM__IS_CANCEL);
		createEAttribute(userMetacommEClass, USER_METACOMM__IS_RESTART);
		createEAttribute(userMetacommEClass, USER_METACOMM__IS_BARGEIN);
		createEAttribute(userMetacommEClass, USER_METACOMM__IS_SUCCESSFUL_BARGEIN);

		userRatingsEClass = createEClass(USER_RATINGS);
		createEAttribute(userRatingsEClass, USER_RATINGS__PRACTICAL);
		createEAttribute(userRatingsEClass, USER_RATINGS__PREDICTABLE);
		createEAttribute(userRatingsEClass, USER_RATINGS__CLEARLY_STRUCTURED);
		createEAttribute(userRatingsEClass, USER_RATINGS__SIMPLE);
		createEAttribute(userRatingsEClass, USER_RATINGS__STYLISH);
		createEAttribute(userRatingsEClass, USER_RATINGS__PREMIUM);
		createEAttribute(userRatingsEClass, USER_RATINGS__CREATIVE);
		createEAttribute(userRatingsEClass, USER_RATINGS__CAPTIVATING);
		createEAttribute(userRatingsEClass, USER_RATINGS__BEAUTIFUL);
		createEAttribute(userRatingsEClass, USER_RATINGS__GOOD);

		userTurnEClass = createEClass(USER_TURN);
		createEReference(userTurnEClass, USER_TURN__METACOMM);
		createEReference(userTurnEClass, USER_TURN__SPEECH_INPUT);
		createEReference(userTurnEClass, USER_TURN__GUI_INPUT);
		createEReference(userTurnEClass, USER_TURN__MOTION_INPUT);

		// Create enums
		contextualAppropriatenessTEEnum = createEEnum(CONTEXTUAL_APPROPRIATENESS_T);
		deviceTypeTEEnum = createEEnum(DEVICE_TYPE_T);
		educationLevelTEEnum = createEEnum(EDUCATION_LEVEL_T);
		genderTEEnum = createEEnum(GENDER_T);
		locationTEEnum = createEEnum(LOCATION_T);
		mcReasonTEEnum = createEEnum(MC_REASON_T);
		mmiTypeTEEnum = createEEnum(MMI_TYPE_T);
		mobilityLevelTEEnum = createEEnum(MOBILITY_LEVEL_T);
		modAppropTEEnum = createEEnum(MOD_APPROP_T);
		modTypeTEEnum = createEEnum(MOD_TYPE_T);
		parsingResultTEEnum = createEEnum(PARSING_RESULT_T);
		previousExperienceTEEnum = createEEnum(PREVIOUS_EXPERIENCE_T);
		promptTypeTEEnum = createEEnum(PROMPT_TYPE_T);
		roleTEEnum = createEEnum(ROLE_T);
		screenOrientationTEEnum = createEEnum(SCREEN_ORIENTATION_T);
		screenResolutionTEEnum = createEEnum(SCREEN_RESOLUTION_T);
		screenSizeTEEnum = createEEnum(SCREEN_SIZE_T);
		socialArenaTEEnum = createEEnum(SOCIAL_ARENA_T);
		socialCompanyTEEnum = createEEnum(SOCIAL_COMPANY_T);
		taskSuccessTEEnum = createEEnum(TASK_SUCCESS_T);
		weatherTEEnum = createEEnum(WEATHER_T);
		wirelessAccessTypeTEEnum = createEEnum(WIRELESS_ACCESS_TYPE_T);

		// Create data types
		contextualAppropriatenessTObjectEDataType = createEDataType(CONTEXTUAL_APPROPRIATENESS_TOBJECT);
		dDayTypeEDataType = createEDataType(DDAY_TYPE);
		dDayTypeObjectEDataType = createEDataType(DDAY_TYPE_OBJECT);
		deviceTypeTObjectEDataType = createEDataType(DEVICE_TYPE_TOBJECT);
		dMonthTypeEDataType = createEDataType(DMONTH_TYPE);
		dMonthTypeObjectEDataType = createEDataType(DMONTH_TYPE_OBJECT);
		dYearTypeEDataType = createEDataType(DYEAR_TYPE);
		dYearTypeObjectEDataType = createEDataType(DYEAR_TYPE_OBJECT);
		educationLevelTObjectEDataType = createEDataType(EDUCATION_LEVEL_TOBJECT);
		genderTObjectEDataType = createEDataType(GENDER_TOBJECT);
		likert5ValueEDataType = createEDataType(LIKERT5_VALUE);
		likert5ValueObjectEDataType = createEDataType(LIKERT5_VALUE_OBJECT);
		likert7ValueEDataType = createEDataType(LIKERT7_VALUE);
		likert7ValueObjectEDataType = createEDataType(LIKERT7_VALUE_OBJECT);
		locationTObjectEDataType = createEDataType(LOCATION_TOBJECT);
		mcReasonTObjectEDataType = createEDataType(MC_REASON_TOBJECT);
		mmiTypeTObjectEDataType = createEDataType(MMI_TYPE_TOBJECT);
		mobilityLevelTObjectEDataType = createEDataType(MOBILITY_LEVEL_TOBJECT);
		modAppropTObjectEDataType = createEDataType(MOD_APPROP_TOBJECT);
		modTypeTObjectEDataType = createEDataType(MOD_TYPE_TOBJECT);
		parsingResultTObjectEDataType = createEDataType(PARSING_RESULT_TOBJECT);
		percentageTEDataType = createEDataType(PERCENTAGE_T);
		percentageTObjectEDataType = createEDataType(PERCENTAGE_TOBJECT);
		previousExperienceTObjectEDataType = createEDataType(PREVIOUS_EXPERIENCE_TOBJECT);
		promptTypeTObjectEDataType = createEDataType(PROMPT_TYPE_TOBJECT);
		roleTObjectEDataType = createEDataType(ROLE_TOBJECT);
		screenOrientationTObjectEDataType = createEDataType(SCREEN_ORIENTATION_TOBJECT);
		screenResolutionTObjectEDataType = createEDataType(SCREEN_RESOLUTION_TOBJECT);
		screenSizeTObjectEDataType = createEDataType(SCREEN_SIZE_TOBJECT);
		socialArenaTObjectEDataType = createEDataType(SOCIAL_ARENA_TOBJECT);
		socialCompanyTObjectEDataType = createEDataType(SOCIAL_COMPANY_TOBJECT);
		taskSuccessTObjectEDataType = createEDataType(TASK_SUCCESS_TOBJECT);
		tHoursTypeEDataType = createEDataType(THOURS_TYPE);
		tHoursTypeObjectEDataType = createEDataType(THOURS_TYPE_OBJECT);
		tMinsTypeEDataType = createEDataType(TMINS_TYPE);
		tMinsTypeObjectEDataType = createEDataType(TMINS_TYPE_OBJECT);
		tSecsTypeEDataType = createEDataType(TSECS_TYPE);
		tSecsTypeObjectEDataType = createEDataType(TSECS_TYPE_OBJECT);
		weatherTObjectEDataType = createEDataType(WEATHER_TOBJECT);
		wirelessAccessTypeTObjectEDataType = createEDataType(WIRELESS_ACCESS_TYPE_TOBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		systemMetacommEClass.getESuperTypes().add(this.getMetacomm());
		systemTurnEClass.getESuperTypes().add(this.getTurn());
		userMetacommEClass.getESuperTypes().add(this.getMetacomm());
		userTurnEClass.getESuperTypes().add(this.getTurn());

		// Initialize classes and features; add operations and parameters
		initEClass(attitudeEClass, Attitude.class, "Attitude", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(avmEClass, Avm.class, "Avm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(communicationContextEClass, CommunicationContext.class, "CommunicationContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommunicationContext_WirelessAccessType(), this.getWirelessAccessTypeT(), "wirelessAccessType", null, 1, 1, CommunicationContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommunicationContext_AccessPointName(), theXMLTypePackage.getString(), "accessPointName", null, 1, 1, CommunicationContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommunicationContext_SignalStrength(), this.getPercentageT(), "signalStrength", null, 1, 1, CommunicationContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommunicationContext_ReceivedDataThroughput(), theXMLTypePackage.getDouble(), "receivedDataThroughput", null, 1, 1, CommunicationContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommunicationContext_SentDataThroughput(), theXMLTypePackage.getDouble(), "sentDataThroughput", null, 1, 1, CommunicationContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommunicationContext_Rtt(), theXMLTypePackage.getInt(), "rtt", null, 1, 1, CommunicationContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommunicationContext_Srt(), theXMLTypePackage.getInt(), "srt", null, 1, 1, CommunicationContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cooperativityEClass, Cooperativity.class, "Cooperativity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCooperativity_ContextualAppropriateness(), this.getContextualAppropriatenessT(), "contextualAppropriateness", null, 1, 1, Cooperativity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateTimeTEClass, DateTimeT.class, "DateTimeT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateTimeT_DDay(), this.getDDayType(), "dDay", null, 0, 1, DateTimeT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateTimeT_DMonth(), this.getDMonthType(), "dMonth", null, 0, 1, DateTimeT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateTimeT_DYear(), this.getDYearType(), "dYear", null, 0, 1, DateTimeT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateTimeT_THours(), this.getTHoursType(), "tHours", null, 0, 1, DateTimeT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateTimeT_TMins(), this.getTMinsType(), "tMins", null, 0, 1, DateTimeT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateTimeT_TSecs(), this.getTSecsType(), "tSecs", null, 0, 1, DateTimeT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceContextEClass, DeviceContext.class, "DeviceContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeviceContext_DeviceType(), this.getDeviceTypeT(), "deviceType", null, 1, 1, DeviceContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceContext_ScreenSize(), this.getScreenSizeT(), "screenSize", null, 1, 1, DeviceContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceContext_ScreenResolution(), this.getScreenResolutionT(), "screenResolution", null, 1, 1, DeviceContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceContext_ScreenOrientation(), this.getScreenOrientationT(), "screenOrientation", null, 1, 1, DeviceContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceContext_ScreenBrightnessLevel(), this.getPercentageT(), "screenBrightnessLevel", null, 1, 1, DeviceContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceContext_VolumeLevel(), this.getPercentageT(), "volumeLevel", null, 1, 1, DeviceContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceContext_MemoryUsage(), this.getPercentageT(), "memoryUsage", null, 1, 1, DeviceContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceContext_CpuUsage(), this.getPercentageT(), "cpuUsage", null, 1, 1, DeviceContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dialogueEClass, Dialogue.class, "Dialogue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDialogue_BaseTimestamp(), theXMLTypePackage.getLong(), "baseTimestamp", null, 1, 1, Dialogue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDialogue_Task(), this.getTask(), null, "task", null, 0, 1, Dialogue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDialogue_Step(), this.getDialogueStepT(), null, "step", null, 0, -1, Dialogue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dialogueStepTEClass, DialogueStepT.class, "DialogueStepT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDialogueStepT_SystemTurn(), this.getSystemTurn(), null, "systemTurn", null, 1, 1, DialogueStepT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDialogueStepT_UserTurn(), this.getUserTurn(), null, "userTurn", null, 1, 1, DialogueStepT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Trial(), this.getTrial(), null, "trial", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(dynamicContextEClass, DynamicContext.class, "DynamicContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDynamicContext_PhysicalContext(), this.getPhysicalContext(), null, "physicalContext", null, 1, 1, DynamicContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDynamicContext_SocialContext(), this.getSocialContext(), null, "socialContext", null, 1, 1, DynamicContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDynamicContext_LocationTimeContext(), this.getLocationTimeContext(), null, "locationTimeContext", null, 1, 1, DynamicContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDynamicContext_DeviceContext(), this.getDeviceContext(), null, "deviceContext", null, 1, 1, DynamicContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDynamicContext_CommunicationContext(), this.getCommunicationContext(), null, "communicationContext", null, 1, 1, DynamicContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guiInputEClass, GuiInput.class, "GuiInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGuiInput_TextElements(), theXMLTypePackage.getLong(), "textElements", null, 1, 1, GuiInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGuiInput_NavigationActions(), theXMLTypePackage.getLong(), "navigationActions", null, 1, 1, GuiInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGuiInput_NavigationMoves(), theXMLTypePackage.getLong(), "navigationMoves", null, 1, 1, GuiInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGuiInput_NavigationLength(), theXMLTypePackage.getLong(), "navigationLength", null, 1, 1, GuiInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGuiInput_ExploringActions(), theXMLTypePackage.getLong(), "exploringActions", null, 1, 1, GuiInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGuiInput_TransferringActions(), theXMLTypePackage.getLong(), "transferringActions", null, 1, 1, GuiInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationTimeContextEClass, LocationTimeContext.class, "LocationTimeContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocationTimeContext_Location(), this.getLocationT(), "location", null, 1, 1, LocationTimeContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocationTimeContext_GeoLatitude(), theXMLTypePackage.getDouble(), "geoLatitude", null, 1, 1, LocationTimeContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocationTimeContext_GeoLongitude(), theXMLTypePackage.getDouble(), "geoLongitude", null, 1, 1, LocationTimeContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocationTimeContext_MobilityLevel(), this.getMobilityLevelT(), "mobilityLevel", null, 1, 1, LocationTimeContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocationTimeContext_Time(), this.getDateTimeT(), null, "time", null, 1, 1, LocationTimeContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metacommEClass, Metacomm.class, "Metacomm", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetacomm_IsHelp(), theXMLTypePackage.getBoolean(), "isHelp", null, 1, 1, Metacomm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetacomm_IsCorrection(), theXMLTypePackage.getBoolean(), "isCorrection", null, 1, 1, Metacomm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modalityAppropriatenessEClass, ModalityAppropriateness.class, "ModalityAppropriateness", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModalityAppropriateness_Appropriateness(), this.getModAppropT(), "appropriateness", null, 1, 1, ModalityAppropriateness.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modalityChangeEClass, ModalityChange.class, "ModalityChange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModalityChange_Origin(), this.getRoleT(), "origin", null, 1, 1, ModalityChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModalityChange_Reason(), this.getMcReasonT(), "reason", null, 1, 1, ModalityChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modalityInfoEClass, ModalityInfo.class, "ModalityInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModalityInfo_ModalityType(), this.getModTypeT(), "modalityType", null, 1, -1, ModalityInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModalityInfo_MminteractionType(), this.getMmiTypeT(), "mminteractionType", null, 1, 1, ModalityInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModalityInfo_Appropriateness(), this.getModalityAppropriateness(), null, "appropriateness", null, 0, 1, ModalityInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModalityInfo_Synchroni(), this.getModalitySynchroni(), null, "synchroni", null, 0, 1, ModalityInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModalityInfo_Change(), this.getModalityChange(), null, "change", null, 0, 1, ModalityInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modalitySynchroniEClass, ModalitySynchroni.class, "ModalitySynchroni", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModalitySynchroni_Nlags(), theXMLTypePackage.getLong(), "nlags", null, 1, 1, ModalitySynchroni.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModalitySynchroni_Lagtime(), theXMLTypePackage.getLong(), "lagtime", null, 1, 1, ModalitySynchroni.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModalitySynchroni_Nevents(), theXMLTypePackage.getLong(), "nevents", null, 1, 1, ModalitySynchroni.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(motionInputEClass, MotionInput.class, "MotionInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMotionInput_TiltMovements(), theXMLTypePackage.getLong(), "tiltMovements", null, 1, 1, MotionInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMotionInput_TwistMovements(), theXMLTypePackage.getLong(), "twistMovements", null, 1, 1, MotionInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMotionInput_ShakeMovements(), theXMLTypePackage.getLong(), "shakeMovements", null, 1, 1, MotionInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(physicalContextEClass, PhysicalContext.class, "PhysicalContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPhysicalContext_Temperature(), theXMLTypePackage.getInt(), "temperature", null, 1, 1, PhysicalContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalContext_Weather(), this.getWeatherT(), "weather", null, 1, 1, PhysicalContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalContext_Noise(), this.getPercentageT(), "noise", null, 1, 1, PhysicalContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalContext_Light(), this.getPercentageT(), "light", null, 1, 1, PhysicalContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(socialContextEClass, SocialContext.class, "SocialContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSocialContext_Company(), this.getSocialCompanyT(), "company", null, 1, 1, SocialContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSocialContext_Arena(), this.getSocialArenaT(), "arena", null, 1, 1, SocialContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(speechInputEClass, SpeechInput.class, "SpeechInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpeechInput_OverallWords(), theXMLTypePackage.getLong(), "overallWords", null, 1, 1, SpeechInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeechInput_SubstitutedWords(), theXMLTypePackage.getLong(), "substitutedWords", null, 1, 1, SpeechInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeechInput_DeletedWords(), theXMLTypePackage.getLong(), "deletedWords", null, 1, 1, SpeechInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeechInput_InsertedWords(), theXMLTypePackage.getLong(), "insertedWords", null, 1, 1, SpeechInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeechInput_OverallSentences(), theXMLTypePackage.getLong(), "overallSentences", null, 1, 1, SpeechInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeechInput_SubstitutedSentences(), theXMLTypePackage.getLong(), "substitutedSentences", null, 1, 1, SpeechInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeechInput_DeletedSentences(), theXMLTypePackage.getLong(), "deletedSentences", null, 1, 1, SpeechInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeechInput_InsertedSentences(), theXMLTypePackage.getLong(), "insertedSentences", null, 1, 1, SpeechInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeechInput_OverallConcepts(), theXMLTypePackage.getLong(), "overallConcepts", null, 1, 1, SpeechInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeechInput_SubstitutedConcepts(), theXMLTypePackage.getLong(), "substitutedConcepts", null, 1, 1, SpeechInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeechInput_DeletedConcepts(), theXMLTypePackage.getLong(), "deletedConcepts", null, 1, 1, SpeechInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeechInput_InsertedConcepts(), theXMLTypePackage.getLong(), "insertedConcepts", null, 1, 1, SpeechInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeechInput_ParsingResult(), this.getParsingResultT(), "parsingResult", null, 1, 1, SpeechInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(speechOutputEClass, SpeechOutput.class, "SpeechOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpeechOutput_ANCO(), theXMLTypePackage.getLong(), "aNCO", null, 1, 1, SpeechOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeechOutput_ANIN(), theXMLTypePackage.getLong(), "aNIN", null, 1, 1, SpeechOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeechOutput_ANPA(), theXMLTypePackage.getLong(), "aNPA", null, 1, 1, SpeechOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeechOutput_ANFA(), theXMLTypePackage.getLong(), "aNFA", null, 1, 1, SpeechOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeechOutput_PromptType(), this.getPromptTypeT(), "promptType", null, 1, 1, SpeechOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemMetacommEClass, SystemMetacomm.class, "SystemMetacomm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSystemMetacomm_IsASRReject(), theXMLTypePackage.getBoolean(), "isASRReject", null, 1, 1, SystemMetacomm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemMetacomm_IsDIVReject(), theXMLTypePackage.getBoolean(), "isDIVReject", null, 1, 1, SystemMetacomm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemMetacomm_IsGRReject(), theXMLTypePackage.getBoolean(), "isGRReject", null, 1, 1, SystemMetacomm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemTurnEClass, SystemTurn.class, "SystemTurn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemTurn_Metacomm(), this.getSystemMetacomm(), null, "metacomm", null, 1, 1, SystemTurn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemTurn_SpeechOutput(), this.getSpeechOutput(), null, "speechOutput", null, 0, 1, SystemTurn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemTurn_Cooperativity(), this.getCooperativity(), null, "cooperativity", null, 0, 1, SystemTurn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTask_Success(), this.getTaskSuccessT(), "success", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Reason(), theXMLTypePackage.getString(), "reason", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Avm(), this.getAvm(), null, "avm", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trialEClass, Trial.class, "Trial", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrial_Description(), theXMLTypePackage.getString(), "description", null, 1, 1, Trial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrial_UserData(), this.getUserData(), null, "userData", null, 1, 1, Trial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrial_Dialogues(), this.getDialogue(), null, "dialogues", null, 1, -1, Trial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(turnEClass, Turn.class, "Turn", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTurn_FeedbackDelay(), theXMLTypePackage.getLong(), "feedbackDelay", null, 1, 1, Turn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTurn_FeedbackDuration(), theXMLTypePackage.getLong(), "feedbackDuration", null, 1, 1, Turn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTurn_ActionDuration(), theXMLTypePackage.getLong(), "actionDuration", null, 1, 1, Turn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTurn_Elements(), theXMLTypePackage.getLong(), "elements", null, 1, 1, Turn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTurn_Feedback(), theXMLTypePackage.getLong(), "feedback", null, 1, 1, Turn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTurn_Concepts(), theXMLTypePackage.getLong(), "concepts", null, 1, 1, Turn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTurn_Noise(), theXMLTypePackage.getLong(), "noise", null, 1, 1, Turn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTurn_Questions(), theXMLTypePackage.getLong(), "questions", null, 1, 1, Turn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTurn_Modality(), this.getModalityInfo(), null, "modality", null, 0, 1, Turn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTurn_Context(), this.getDynamicContext(), null, "context", null, 0, 1, Turn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userAttitudeEClass, UserAttitude.class, "UserAttitude", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUserAttitude_Usefulness(), this.getLikert5Value(), "usefulness", null, 1, 1, UserAttitude.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserAttitude_Pleasantness(), this.getLikert5Value(), "pleasantness", null, 1, 1, UserAttitude.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserAttitude_Integration(), this.getLikert5Value(), "integration", null, 1, 1, UserAttitude.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserAttitude_SelfEfficacy(), this.getLikert5Value(), "selfEfficacy", null, 1, 1, UserAttitude.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserAttitude_Comfort(), this.getLikert5Value(), "comfort", null, 1, 1, UserAttitude.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userDataEClass, UserData.class, "UserData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUserData_UserRatings(), this.getUserRatings(), null, "userRatings", null, 0, -1, UserData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserData_UserMood(), this.getLikert5Value(), "userMood", null, 0, -1, UserData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserData_UserAttitude(), this.getUserAttitude(), null, "userAttitude", null, 1, 1, UserData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserData_Age(), theXMLTypePackage.getInt(), "age", null, 1, 1, UserData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserData_Gender(), this.getGenderT(), "gender", null, 1, 1, UserData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserData_EducationLevel(), this.getEducationLevelT(), "educationLevel", null, 1, 1, UserData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserData_PreviousExperience(), this.getPreviousExperienceT(), "previousExperience", null, 1, 1, UserData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userMetacommEClass, UserMetacomm.class, "UserMetacomm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUserMetacomm_IsTimeOut(), theXMLTypePackage.getBoolean(), "isTimeOut", null, 1, 1, UserMetacomm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserMetacomm_IsCancel(), theXMLTypePackage.getBoolean(), "isCancel", null, 1, 1, UserMetacomm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserMetacomm_IsRestart(), theXMLTypePackage.getBoolean(), "isRestart", null, 1, 1, UserMetacomm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserMetacomm_IsBargein(), theXMLTypePackage.getBoolean(), "isBargein", null, 1, 1, UserMetacomm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserMetacomm_IsSuccessfulBargein(), theXMLTypePackage.getBoolean(), "isSuccessfulBargein", null, 1, 1, UserMetacomm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userRatingsEClass, UserRatings.class, "UserRatings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUserRatings_Practical(), this.getLikert7Value(), "practical", null, 1, 1, UserRatings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserRatings_Predictable(), this.getLikert7Value(), "predictable", null, 1, 1, UserRatings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserRatings_ClearlyStructured(), this.getLikert7Value(), "clearlyStructured", null, 1, 1, UserRatings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserRatings_Simple(), this.getLikert7Value(), "simple", null, 1, 1, UserRatings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserRatings_Stylish(), this.getLikert7Value(), "stylish", null, 1, 1, UserRatings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserRatings_Premium(), this.getLikert7Value(), "premium", null, 1, 1, UserRatings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserRatings_Creative(), this.getLikert7Value(), "creative", null, 1, 1, UserRatings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserRatings_Captivating(), this.getLikert7Value(), "captivating", null, 1, 1, UserRatings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserRatings_Beautiful(), this.getLikert7Value(), "beautiful", null, 1, 1, UserRatings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserRatings_Good(), this.getLikert7Value(), "good", null, 1, 1, UserRatings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userTurnEClass, UserTurn.class, "UserTurn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUserTurn_Metacomm(), this.getUserMetacomm(), null, "metacomm", null, 1, 1, UserTurn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserTurn_SpeechInput(), this.getSpeechInput(), null, "speechInput", null, 0, 1, UserTurn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserTurn_GuiInput(), this.getGuiInput(), null, "guiInput", null, 0, 1, UserTurn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserTurn_MotionInput(), this.getMotionInput(), null, "motionInput", null, 0, 1, UserTurn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(contextualAppropriatenessTEEnum, ContextualAppropriatenessT.class, "ContextualAppropriatenessT");
		addEEnumLiteral(contextualAppropriatenessTEEnum, ContextualAppropriatenessT.APPROPRIATE);
		addEEnumLiteral(contextualAppropriatenessTEEnum, ContextualAppropriatenessT.INAPPROPRIATE);
		addEEnumLiteral(contextualAppropriatenessTEEnum, ContextualAppropriatenessT.TOTALFAILURE);
		addEEnumLiteral(contextualAppropriatenessTEEnum, ContextualAppropriatenessT.INCOMPREHENSIBLE);

		initEEnum(deviceTypeTEEnum, DeviceTypeT.class, "DeviceTypeT");
		addEEnumLiteral(deviceTypeTEEnum, DeviceTypeT.NONE);
		addEEnumLiteral(deviceTypeTEEnum, DeviceTypeT.LAPTOP);
		addEEnumLiteral(deviceTypeTEEnum, DeviceTypeT.TABLET);
		addEEnumLiteral(deviceTypeTEEnum, DeviceTypeT.SMARTPHONE);
		addEEnumLiteral(deviceTypeTEEnum, DeviceTypeT.MMPLAYER);
		addEEnumLiteral(deviceTypeTEEnum, DeviceTypeT.OTHER);

		initEEnum(educationLevelTEEnum, EducationLevelT.class, "EducationLevelT");
		addEEnumLiteral(educationLevelTEEnum, EducationLevelT.NONE);
		addEEnumLiteral(educationLevelTEEnum, EducationLevelT.HIGHSCHOOL);
		addEEnumLiteral(educationLevelTEEnum, EducationLevelT.PROFESSIONAL);
		addEEnumLiteral(educationLevelTEEnum, EducationLevelT.COLLEGE);
		addEEnumLiteral(educationLevelTEEnum, EducationLevelT.NOTAPPLICABLE);

		initEEnum(genderTEEnum, GenderT.class, "GenderT");
		addEEnumLiteral(genderTEEnum, GenderT.NONE);
		addEEnumLiteral(genderTEEnum, GenderT.MALE);
		addEEnumLiteral(genderTEEnum, GenderT.FEMALE);
		addEEnumLiteral(genderTEEnum, GenderT.OTHER);

		initEEnum(locationTEEnum, LocationT.class, "LocationT");
		addEEnumLiteral(locationTEEnum, LocationT.NONE);
		addEEnumLiteral(locationTEEnum, LocationT.HOME);
		addEEnumLiteral(locationTEEnum, LocationT.OFFICESCHOOL);
		addEEnumLiteral(locationTEEnum, LocationT.STREET);
		addEEnumLiteral(locationTEEnum, LocationT.OTHERINDOOR);
		addEEnumLiteral(locationTEEnum, LocationT.OTHEROUTDOOR);

		initEEnum(mcReasonTEEnum, McReasonT.class, "McReasonT");
		addEEnumLiteral(mcReasonTEEnum, McReasonT.RECOGNITIONERROR);
		addEEnumLiteral(mcReasonTEEnum, McReasonT.ENVIRONMENTCHANGE);
		addEEnumLiteral(mcReasonTEEnum, McReasonT.LOWMODAPPROPRIATENESS);
		addEEnumLiteral(mcReasonTEEnum, McReasonT.USERDECISION);
		addEEnumLiteral(mcReasonTEEnum, McReasonT.SYSTEMDECISION);
		addEEnumLiteral(mcReasonTEEnum, McReasonT.INTERFACEADAPTATION);
		addEEnumLiteral(mcReasonTEEnum, McReasonT.OTHER);

		initEEnum(mmiTypeTEEnum, MmiTypeT.class, "MmiTypeT");
		addEEnumLiteral(mmiTypeTEEnum, MmiTypeT.UNIMODAL);
		addEEnumLiteral(mmiTypeTEEnum, MmiTypeT.EQUIVALENT);
		addEEnumLiteral(mmiTypeTEEnum, MmiTypeT.ASSIGNED);
		addEEnumLiteral(mmiTypeTEEnum, MmiTypeT.REDUNDANT);
		addEEnumLiteral(mmiTypeTEEnum, MmiTypeT.COMPLEMENTARY);

		initEEnum(mobilityLevelTEEnum, MobilityLevelT.class, "MobilityLevelT");
		addEEnumLiteral(mobilityLevelTEEnum, MobilityLevelT.NONE);
		addEEnumLiteral(mobilityLevelTEEnum, MobilityLevelT.SITTING);
		addEEnumLiteral(mobilityLevelTEEnum, MobilityLevelT.STANDING);
		addEEnumLiteral(mobilityLevelTEEnum, MobilityLevelT.WALKING);
		addEEnumLiteral(mobilityLevelTEEnum, MobilityLevelT.SPORTING);
		addEEnumLiteral(mobilityLevelTEEnum, MobilityLevelT.DRIVING);
		addEEnumLiteral(mobilityLevelTEEnum, MobilityLevelT.OTHER);

		initEEnum(modAppropTEEnum, ModAppropT.class, "ModAppropT");
		addEEnumLiteral(modAppropTEEnum, ModAppropT.APPROPRIATE);
		addEEnumLiteral(modAppropTEEnum, ModAppropT.PARTIALLY);
		addEEnumLiteral(modAppropTEEnum, ModAppropT.INAPPROPRIATE);

		initEEnum(modTypeTEEnum, ModTypeT.class, "ModTypeT");
		addEEnumLiteral(modTypeTEEnum, ModTypeT.S);
		addEEnumLiteral(modTypeTEEnum, ModTypeT.V);
		addEEnumLiteral(modTypeTEEnum, ModTypeT.G);
		addEEnumLiteral(modTypeTEEnum, ModTypeT.M);

		initEEnum(parsingResultTEEnum, ParsingResultT.class, "ParsingResultT");
		addEEnumLiteral(parsingResultTEEnum, ParsingResultT.CORRECTLYUNDERSTOOD);
		addEEnumLiteral(parsingResultTEEnum, ParsingResultT.PARTIALLYUNDERSTOOD);
		addEEnumLiteral(parsingResultTEEnum, ParsingResultT.NOTHINGUNDERSTOOD);

		initEEnum(previousExperienceTEEnum, PreviousExperienceT.class, "PreviousExperienceT");
		addEEnumLiteral(previousExperienceTEEnum, PreviousExperienceT.NONE);
		addEEnumLiteral(previousExperienceTEEnum, PreviousExperienceT.LOW);
		addEEnumLiteral(previousExperienceTEEnum, PreviousExperienceT.MEDIUM);
		addEEnumLiteral(previousExperienceTEEnum, PreviousExperienceT.HIGH);
		addEEnumLiteral(previousExperienceTEEnum, PreviousExperienceT.EXPERT);

		initEEnum(promptTypeTEEnum, PromptTypeT.class, "PromptTypeT");
		addEEnumLiteral(promptTypeTEEnum, PromptTypeT.OPEN);
		addEEnumLiteral(promptTypeTEEnum, PromptTypeT.HALFOPEN);
		addEEnumLiteral(promptTypeTEEnum, PromptTypeT.CLOSED);
		addEEnumLiteral(promptTypeTEEnum, PromptTypeT.NOQUESTION);

		initEEnum(roleTEEnum, RoleT.class, "RoleT");
		addEEnumLiteral(roleTEEnum, RoleT.SYSTEM);
		addEEnumLiteral(roleTEEnum, RoleT.USER);

		initEEnum(screenOrientationTEEnum, ScreenOrientationT.class, "ScreenOrientationT");
		addEEnumLiteral(screenOrientationTEEnum, ScreenOrientationT.NONE);
		addEEnumLiteral(screenOrientationTEEnum, ScreenOrientationT.LANDSCAPE);
		addEEnumLiteral(screenOrientationTEEnum, ScreenOrientationT.PORTRAIT);

		initEEnum(screenResolutionTEEnum, ScreenResolutionT.class, "ScreenResolutionT");
		addEEnumLiteral(screenResolutionTEEnum, ScreenResolutionT.NONE);
		addEEnumLiteral(screenResolutionTEEnum, ScreenResolutionT.SMALL_LET480X800);
		addEEnumLiteral(screenResolutionTEEnum, ScreenResolutionT.MEDIUM_BT480X8001280X800);
		addEEnumLiteral(screenResolutionTEEnum, ScreenResolutionT.LARGE_GET1280X800);

		initEEnum(screenSizeTEEnum, ScreenSizeT.class, "ScreenSizeT");
		addEEnumLiteral(screenSizeTEEnum, ScreenSizeT.NONE);
		addEEnumLiteral(screenSizeTEEnum, ScreenSizeT.SMALL_LET4IN);
		addEEnumLiteral(screenSizeTEEnum, ScreenSizeT.MEDIUM_BT4IN10IN);
		addEEnumLiteral(screenSizeTEEnum, ScreenSizeT.LARGE_GET10IN);

		initEEnum(socialArenaTEEnum, SocialArenaT.class, "SocialArenaT");
		addEEnumLiteral(socialArenaTEEnum, SocialArenaT.NONE);
		addEEnumLiteral(socialArenaTEEnum, SocialArenaT.DOMESTIC);
		addEEnumLiteral(socialArenaTEEnum, SocialArenaT.WORK);
		addEEnumLiteral(socialArenaTEEnum, SocialArenaT.EDUCATIONAL);
		addEEnumLiteral(socialArenaTEEnum, SocialArenaT.LEISURE);

		initEEnum(socialCompanyTEEnum, SocialCompanyT.class, "SocialCompanyT");
		addEEnumLiteral(socialCompanyTEEnum, SocialCompanyT.NONE);
		addEEnumLiteral(socialCompanyTEEnum, SocialCompanyT.ALONE);
		addEEnumLiteral(socialCompanyTEEnum, SocialCompanyT.WITHAPERSON);
		addEEnumLiteral(socialCompanyTEEnum, SocialCompanyT.WITHAGROUP);

		initEEnum(taskSuccessTEEnum, TaskSuccessT.class, "TaskSuccessT");
		addEEnumLiteral(taskSuccessTEEnum, TaskSuccessT.SUCCEEDED);
		addEEnumLiteral(taskSuccessTEEnum, TaskSuccessT.SUCCONSTRAINTRELAXATIONSYSTEM);
		addEEnumLiteral(taskSuccessTEEnum, TaskSuccessT.SUCCONSTRAINTRELAXATIONUSER);
		addEEnumLiteral(taskSuccessTEEnum, TaskSuccessT.SUCCONSTRAINTRELAXATIONBOTH);
		addEEnumLiteral(taskSuccessTEEnum, TaskSuccessT.SUCNOSOLUTION);
		addEEnumLiteral(taskSuccessTEEnum, TaskSuccessT.FAILEDSYSTEM);
		addEEnumLiteral(taskSuccessTEEnum, TaskSuccessT.FAILEDUSER);

		initEEnum(weatherTEEnum, WeatherT.class, "WeatherT");
		addEEnumLiteral(weatherTEEnum, WeatherT.NONE);
		addEEnumLiteral(weatherTEEnum, WeatherT.SUNNY);
		addEEnumLiteral(weatherTEEnum, WeatherT.CLOUDY);
		addEEnumLiteral(weatherTEEnum, WeatherT.WINDY);
		addEEnumLiteral(weatherTEEnum, WeatherT.RAINY);
		addEEnumLiteral(weatherTEEnum, WeatherT.SNOWY);

		initEEnum(wirelessAccessTypeTEEnum, WirelessAccessTypeT.class, "WirelessAccessTypeT");
		addEEnumLiteral(wirelessAccessTypeTEEnum, WirelessAccessTypeT.NOACCESS);
		addEEnumLiteral(wirelessAccessTypeTEEnum, WirelessAccessTypeT.MOBILE);
		addEEnumLiteral(wirelessAccessTypeTEEnum, WirelessAccessTypeT.WIFI);
		addEEnumLiteral(wirelessAccessTypeTEEnum, WirelessAccessTypeT.BLUETOOTH);
		addEEnumLiteral(wirelessAccessTypeTEEnum, WirelessAccessTypeT.OTHER);

		// Initialize data types
		initEDataType(contextualAppropriatenessTObjectEDataType, ContextualAppropriatenessT.class, "ContextualAppropriatenessTObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dDayTypeEDataType, int.class, "DDayType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dDayTypeObjectEDataType, Integer.class, "DDayTypeObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(deviceTypeTObjectEDataType, DeviceTypeT.class, "DeviceTypeTObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dMonthTypeEDataType, int.class, "DMonthType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dMonthTypeObjectEDataType, Integer.class, "DMonthTypeObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dYearTypeEDataType, int.class, "DYearType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dYearTypeObjectEDataType, Integer.class, "DYearTypeObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(educationLevelTObjectEDataType, EducationLevelT.class, "EducationLevelTObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(genderTObjectEDataType, GenderT.class, "GenderTObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(likert5ValueEDataType, float.class, "Likert5Value", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(likert5ValueObjectEDataType, Float.class, "Likert5ValueObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(likert7ValueEDataType, float.class, "Likert7Value", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(likert7ValueObjectEDataType, Float.class, "Likert7ValueObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(locationTObjectEDataType, LocationT.class, "LocationTObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(mcReasonTObjectEDataType, McReasonT.class, "McReasonTObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(mmiTypeTObjectEDataType, MmiTypeT.class, "MmiTypeTObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(mobilityLevelTObjectEDataType, MobilityLevelT.class, "MobilityLevelTObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(modAppropTObjectEDataType, ModAppropT.class, "ModAppropTObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(modTypeTObjectEDataType, ModTypeT.class, "ModTypeTObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(parsingResultTObjectEDataType, ParsingResultT.class, "ParsingResultTObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(percentageTEDataType, int.class, "PercentageT", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(percentageTObjectEDataType, Integer.class, "PercentageTObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(previousExperienceTObjectEDataType, PreviousExperienceT.class, "PreviousExperienceTObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(promptTypeTObjectEDataType, PromptTypeT.class, "PromptTypeTObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(roleTObjectEDataType, RoleT.class, "RoleTObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(screenOrientationTObjectEDataType, ScreenOrientationT.class, "ScreenOrientationTObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(screenResolutionTObjectEDataType, ScreenResolutionT.class, "ScreenResolutionTObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(screenSizeTObjectEDataType, ScreenSizeT.class, "ScreenSizeTObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(socialArenaTObjectEDataType, SocialArenaT.class, "SocialArenaTObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(socialCompanyTObjectEDataType, SocialCompanyT.class, "SocialCompanyTObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(taskSuccessTObjectEDataType, TaskSuccessT.class, "TaskSuccessTObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(tHoursTypeEDataType, int.class, "THoursType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(tHoursTypeObjectEDataType, Integer.class, "THoursTypeObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(tMinsTypeEDataType, int.class, "TMinsType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(tMinsTypeObjectEDataType, Integer.class, "TMinsTypeObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(tSecsTypeEDataType, int.class, "TSecsType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(tSecsTypeObjectEDataType, Integer.class, "TSecsTypeObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(weatherTObjectEDataType, WeatherT.class, "WeatherTObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(wirelessAccessTypeTObjectEDataType, WirelessAccessTypeT.class, "WirelessAccessTypeTObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
		addAnnotation
		  (attitudeEClass, 
		   source, 
		   new String[] {
			 "name", "Attitude",
			 "kind", "empty"
		   });		
		addAnnotation
		  (avmEClass, 
		   source, 
		   new String[] {
			 "name", "Avm",
			 "kind", "empty"
		   });		
		addAnnotation
		  (communicationContextEClass, 
		   source, 
		   new String[] {
			 "name", "CommunicationContext",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getCommunicationContext_WirelessAccessType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "wirelessAccessType",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCommunicationContext_AccessPointName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "accessPointName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCommunicationContext_SignalStrength(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "signalStrength",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCommunicationContext_ReceivedDataThroughput(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "receivedDataThroughput",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCommunicationContext_SentDataThroughput(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sentDataThroughput",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCommunicationContext_Rtt(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rtt",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCommunicationContext_Srt(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "srt",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (contextualAppropriatenessTEEnum, 
		   source, 
		   new String[] {
			 "name", "contextual_appropriateness_t"
		   });		
		addAnnotation
		  (contextualAppropriatenessTObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "contextual_appropriateness_t:Object",
			 "baseType", "contextual_appropriateness_t"
		   });		
		addAnnotation
		  (cooperativityEClass, 
		   source, 
		   new String[] {
			 "name", "Cooperativity",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getCooperativity_ContextualAppropriateness(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "contextualAppropriateness",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (dateTimeTEClass, 
		   source, 
		   new String[] {
			 "name", "date_time_t",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getDateTimeT_DDay(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "d_day"
		   });		
		addAnnotation
		  (getDateTimeT_DMonth(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "d_month"
		   });		
		addAnnotation
		  (getDateTimeT_DYear(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "d_year"
		   });		
		addAnnotation
		  (getDateTimeT_THours(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "t_hours"
		   });		
		addAnnotation
		  (getDateTimeT_TMins(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "t_mins"
		   });		
		addAnnotation
		  (getDateTimeT_TSecs(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "t_secs"
		   });		
		addAnnotation
		  (dDayTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "d_day_._type",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#int",
			 "minInclusive", "1",
			 "maxInclusive", "31"
		   });		
		addAnnotation
		  (dDayTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "d_day_._type:Object",
			 "baseType", "d_day_._type"
		   });		
		addAnnotation
		  (deviceContextEClass, 
		   source, 
		   new String[] {
			 "name", "DeviceContext",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDeviceContext_DeviceType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "deviceType",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDeviceContext_ScreenSize(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "screenSize",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDeviceContext_ScreenResolution(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "screenResolution",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDeviceContext_ScreenOrientation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "screenOrientation",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDeviceContext_ScreenBrightnessLevel(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "screenBrightnessLevel",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDeviceContext_VolumeLevel(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "volumeLevel",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDeviceContext_MemoryUsage(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "memoryUsage",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDeviceContext_CpuUsage(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cpuUsage",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (deviceTypeTEEnum, 
		   source, 
		   new String[] {
			 "name", "device_type_t"
		   });		
		addAnnotation
		  (deviceTypeTObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "device_type_t:Object",
			 "baseType", "device_type_t"
		   });		
		addAnnotation
		  (dialogueEClass, 
		   source, 
		   new String[] {
			 "name", "Dialogue",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDialogue_BaseTimestamp(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "baseTimestamp",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDialogue_Task(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "task",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDialogue_Step(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "step",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (dialogueStepTEClass, 
		   source, 
		   new String[] {
			 "name", "dialogue_step_t",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDialogueStepT_SystemTurn(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "systemTurn",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDialogueStepT_UserTurn(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "userTurn",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (dMonthTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "d_month_._type",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#int",
			 "minInclusive", "1",
			 "maxInclusive", "12"
		   });		
		addAnnotation
		  (dMonthTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "d_month_._type:Object",
			 "baseType", "d_month_._type"
		   });		
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });		
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });			
		addAnnotation
		  (getDocumentRoot_Trial(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Trial",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (dYearTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "d_year_._type",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#int",
			 "minInclusive", "1980"
		   });		
		addAnnotation
		  (dYearTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "d_year_._type:Object",
			 "baseType", "d_year_._type"
		   });		
		addAnnotation
		  (dynamicContextEClass, 
		   source, 
		   new String[] {
			 "name", "DynamicContext",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDynamicContext_PhysicalContext(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "physicalContext",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDynamicContext_SocialContext(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "socialContext",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDynamicContext_LocationTimeContext(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "locationTimeContext",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDynamicContext_DeviceContext(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "deviceContext",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDynamicContext_CommunicationContext(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "communicationContext",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (educationLevelTEEnum, 
		   source, 
		   new String[] {
			 "name", "education_level_t"
		   });		
		addAnnotation
		  (educationLevelTObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "education_level_t:Object",
			 "baseType", "education_level_t"
		   });		
		addAnnotation
		  (genderTEEnum, 
		   source, 
		   new String[] {
			 "name", "gender_t"
		   });		
		addAnnotation
		  (genderTObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "gender_t:Object",
			 "baseType", "gender_t"
		   });		
		addAnnotation
		  (guiInputEClass, 
		   source, 
		   new String[] {
			 "name", "GuiInput",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getGuiInput_TextElements(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "textElements",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getGuiInput_NavigationActions(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "navigationActions",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getGuiInput_NavigationMoves(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "navigationMoves",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getGuiInput_NavigationLength(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "navigationLength",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getGuiInput_ExploringActions(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "exploringActions",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getGuiInput_TransferringActions(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "transferringActions",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (likert5ValueEDataType, 
		   source, 
		   new String[] {
			 "name", "likert5_value",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#float",
			 "minInclusive", "0",
			 "maxInclusive", "4"
		   });		
		addAnnotation
		  (likert5ValueObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "likert5_value:Object",
			 "baseType", "likert5_value"
		   });		
		addAnnotation
		  (likert7ValueEDataType, 
		   source, 
		   new String[] {
			 "name", "likert7_value",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#float",
			 "minInclusive", "0",
			 "maxInclusive", "6"
		   });		
		addAnnotation
		  (likert7ValueObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "likert7_value:Object",
			 "baseType", "likert7_value"
		   });		
		addAnnotation
		  (locationTEEnum, 
		   source, 
		   new String[] {
			 "name", "location_t"
		   });		
		addAnnotation
		  (locationTimeContextEClass, 
		   source, 
		   new String[] {
			 "name", "LocationTimeContext",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getLocationTimeContext_Location(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "location",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLocationTimeContext_GeoLatitude(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "geo_latitude",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLocationTimeContext_GeoLongitude(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "geo_longitude",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLocationTimeContext_MobilityLevel(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "mobilityLevel",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLocationTimeContext_Time(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "time",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (locationTObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "location_t:Object",
			 "baseType", "location_t"
		   });		
		addAnnotation
		  (mcReasonTEEnum, 
		   source, 
		   new String[] {
			 "name", "mc_reason_t"
		   });		
		addAnnotation
		  (mcReasonTObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "mc_reason_t:Object",
			 "baseType", "mc_reason_t"
		   });		
		addAnnotation
		  (metacommEClass, 
		   source, 
		   new String[] {
			 "name", "Metacomm",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getMetacomm_IsHelp(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "isHelp",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getMetacomm_IsCorrection(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "isCorrection",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (mmiTypeTEEnum, 
		   source, 
		   new String[] {
			 "name", "mmi_type_t"
		   });		
		addAnnotation
		  (mmiTypeTObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "mmi_type_t:Object",
			 "baseType", "mmi_type_t"
		   });		
		addAnnotation
		  (mobilityLevelTEEnum, 
		   source, 
		   new String[] {
			 "name", "mobility_level_t"
		   });		
		addAnnotation
		  (mobilityLevelTObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "mobility_level_t:Object",
			 "baseType", "mobility_level_t"
		   });		
		addAnnotation
		  (modalityAppropriatenessEClass, 
		   source, 
		   new String[] {
			 "name", "ModalityAppropriateness",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getModalityAppropriateness_Appropriateness(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "appropriateness",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (modalityChangeEClass, 
		   source, 
		   new String[] {
			 "name", "ModalityChange",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getModalityChange_Origin(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "origin",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getModalityChange_Reason(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "reason",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (modalityInfoEClass, 
		   source, 
		   new String[] {
			 "name", "ModalityInfo",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getModalityInfo_ModalityType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "modalityType",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getModalityInfo_MminteractionType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "mminteractionType",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getModalityInfo_Appropriateness(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "appropriateness",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getModalityInfo_Synchroni(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "synchroni",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getModalityInfo_Change(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "change",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (modalitySynchroniEClass, 
		   source, 
		   new String[] {
			 "name", "ModalitySynchroni",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getModalitySynchroni_Nlags(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "nlags",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getModalitySynchroni_Lagtime(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lagtime",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getModalitySynchroni_Nevents(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "nevents",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (modAppropTEEnum, 
		   source, 
		   new String[] {
			 "name", "mod_approp_t"
		   });		
		addAnnotation
		  (modAppropTObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "mod_approp_t:Object",
			 "baseType", "mod_approp_t"
		   });		
		addAnnotation
		  (modTypeTEEnum, 
		   source, 
		   new String[] {
			 "name", "mod_type_t"
		   });		
		addAnnotation
		  (modTypeTObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "mod_type_t:Object",
			 "baseType", "mod_type_t"
		   });		
		addAnnotation
		  (motionInputEClass, 
		   source, 
		   new String[] {
			 "name", "MotionInput",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getMotionInput_TiltMovements(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tiltMovements",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getMotionInput_TwistMovements(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "twistMovements",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getMotionInput_ShakeMovements(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "shakeMovements",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (parsingResultTEEnum, 
		   source, 
		   new String[] {
			 "name", "parsing_result_t"
		   });		
		addAnnotation
		  (parsingResultTObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "parsing_result_t:Object",
			 "baseType", "parsing_result_t"
		   });		
		addAnnotation
		  (percentageTEDataType, 
		   source, 
		   new String[] {
			 "name", "percentage_t",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#int",
			 "minInclusive", "0",
			 "maxInclusive", "100"
		   });		
		addAnnotation
		  (percentageTObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "percentage_t:Object",
			 "baseType", "percentage_t"
		   });		
		addAnnotation
		  (physicalContextEClass, 
		   source, 
		   new String[] {
			 "name", "PhysicalContext",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPhysicalContext_Temperature(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "temperature",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPhysicalContext_Weather(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "weather",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPhysicalContext_Noise(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "noise",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPhysicalContext_Light(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "light",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (previousExperienceTEEnum, 
		   source, 
		   new String[] {
			 "name", "previous_experience_t"
		   });		
		addAnnotation
		  (previousExperienceTObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "previous_experience_t:Object",
			 "baseType", "previous_experience_t"
		   });		
		addAnnotation
		  (promptTypeTEEnum, 
		   source, 
		   new String[] {
			 "name", "prompt_type_t"
		   });		
		addAnnotation
		  (promptTypeTObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "prompt_type_t:Object",
			 "baseType", "prompt_type_t"
		   });		
		addAnnotation
		  (roleTEEnum, 
		   source, 
		   new String[] {
			 "name", "role_t"
		   });		
		addAnnotation
		  (roleTObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "role_t:Object",
			 "baseType", "role_t"
		   });		
		addAnnotation
		  (screenOrientationTEEnum, 
		   source, 
		   new String[] {
			 "name", "screen_orientation_t"
		   });		
		addAnnotation
		  (screenOrientationTObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "screen_orientation_t:Object",
			 "baseType", "screen_orientation_t"
		   });		
		addAnnotation
		  (screenResolutionTEEnum, 
		   source, 
		   new String[] {
			 "name", "screen_resolution_t"
		   });		
		addAnnotation
		  (screenResolutionTObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "screen_resolution_t:Object",
			 "baseType", "screen_resolution_t"
		   });		
		addAnnotation
		  (screenSizeTEEnum, 
		   source, 
		   new String[] {
			 "name", "screen_size_t"
		   });		
		addAnnotation
		  (screenSizeTObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "screen_size_t:Object",
			 "baseType", "screen_size_t"
		   });		
		addAnnotation
		  (socialArenaTEEnum, 
		   source, 
		   new String[] {
			 "name", "social_arena_t"
		   });		
		addAnnotation
		  (socialArenaTObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "social_arena_t:Object",
			 "baseType", "social_arena_t"
		   });		
		addAnnotation
		  (socialCompanyTEEnum, 
		   source, 
		   new String[] {
			 "name", "social_company_t"
		   });		
		addAnnotation
		  (socialCompanyTObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "social_company_t:Object",
			 "baseType", "social_company_t"
		   });		
		addAnnotation
		  (socialContextEClass, 
		   source, 
		   new String[] {
			 "name", "SocialContext",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSocialContext_Company(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "company",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSocialContext_Arena(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "arena",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (speechInputEClass, 
		   source, 
		   new String[] {
			 "name", "SpeechInput",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSpeechInput_OverallWords(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "overallWords",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSpeechInput_SubstitutedWords(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "substitutedWords",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSpeechInput_DeletedWords(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "deletedWords",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSpeechInput_InsertedWords(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "insertedWords",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSpeechInput_OverallSentences(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "overallSentences",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSpeechInput_SubstitutedSentences(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "substitutedSentences",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSpeechInput_DeletedSentences(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "deletedSentences",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSpeechInput_InsertedSentences(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "insertedSentences",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSpeechInput_OverallConcepts(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "overallConcepts",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSpeechInput_SubstitutedConcepts(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "substitutedConcepts",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSpeechInput_DeletedConcepts(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "deletedConcepts",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSpeechInput_InsertedConcepts(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "insertedConcepts",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSpeechInput_ParsingResult(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "parsingResult",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (speechOutputEClass, 
		   source, 
		   new String[] {
			 "name", "SpeechOutput",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSpeechOutput_ANCO(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AN_CO",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSpeechOutput_ANIN(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AN_IN",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSpeechOutput_ANPA(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AN_PA",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSpeechOutput_ANFA(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AN_FA",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSpeechOutput_PromptType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "promptType",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (systemMetacommEClass, 
		   source, 
		   new String[] {
			 "name", "SystemMetacomm",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSystemMetacomm_IsASRReject(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "isASRReject",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSystemMetacomm_IsDIVReject(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "isDIVReject",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSystemMetacomm_IsGRReject(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "isGRReject",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (systemTurnEClass, 
		   source, 
		   new String[] {
			 "name", "SystemTurn",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSystemTurn_Metacomm(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "metacomm",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSystemTurn_SpeechOutput(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "speechOutput",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSystemTurn_Cooperativity(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cooperativity",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (taskEClass, 
		   source, 
		   new String[] {
			 "name", "Task",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTask_Success(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "success",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTask_Reason(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "reason",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTask_Avm(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "avm",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (taskSuccessTEEnum, 
		   source, 
		   new String[] {
			 "name", "task_success_t"
		   });		
		addAnnotation
		  (taskSuccessTObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "task_success_t:Object",
			 "baseType", "task_success_t"
		   });		
		addAnnotation
		  (tHoursTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "t_hours_._type",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#int",
			 "minInclusive", "0",
			 "maxExclusive", "24"
		   });		
		addAnnotation
		  (tHoursTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "t_hours_._type:Object",
			 "baseType", "t_hours_._type"
		   });		
		addAnnotation
		  (tMinsTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "t_mins_._type",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#int",
			 "minInclusive", "0",
			 "maxExclusive", "60"
		   });		
		addAnnotation
		  (tMinsTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "t_mins_._type:Object",
			 "baseType", "t_mins_._type"
		   });		
		addAnnotation
		  (trialEClass, 
		   source, 
		   new String[] {
			 "name", "Trial",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTrial_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTrial_UserData(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "userData",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTrial_Dialogues(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "dialogues",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (tSecsTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "t_secs_._type",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#int",
			 "minInclusive", "0",
			 "maxExclusive", "60"
		   });		
		addAnnotation
		  (tSecsTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "t_secs_._type:Object",
			 "baseType", "t_secs_._type"
		   });		
		addAnnotation
		  (turnEClass, 
		   source, 
		   new String[] {
			 "name", "Turn",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTurn_FeedbackDelay(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "feedbackDelay",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTurn_FeedbackDuration(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "feedbackDuration",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTurn_ActionDuration(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "actionDuration",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTurn_Elements(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "elements",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTurn_Feedback(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "feedback",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTurn_Concepts(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "concepts",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTurn_Noise(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "noise",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTurn_Questions(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "questions",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTurn_Modality(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "modality",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTurn_Context(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "context",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (userAttitudeEClass, 
		   source, 
		   new String[] {
			 "name", "UserAttitude",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getUserAttitude_Usefulness(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "usefulness",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUserAttitude_Pleasantness(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "pleasantness",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUserAttitude_Integration(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "integration",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUserAttitude_SelfEfficacy(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "selfEfficacy",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUserAttitude_Comfort(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "comfort",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (userDataEClass, 
		   source, 
		   new String[] {
			 "name", "UserData",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getUserData_UserRatings(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "userRatings",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUserData_UserMood(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "userMood",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUserData_UserAttitude(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "userAttitude",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUserData_Age(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "age",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUserData_Gender(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "gender",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUserData_EducationLevel(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "educationLevel",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUserData_PreviousExperience(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "previousExperience",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (userMetacommEClass, 
		   source, 
		   new String[] {
			 "name", "UserMetacomm",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getUserMetacomm_IsTimeOut(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "isTimeOut",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUserMetacomm_IsCancel(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "isCancel",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUserMetacomm_IsRestart(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "isRestart",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUserMetacomm_IsBargein(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "isBargein",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUserMetacomm_IsSuccessfulBargein(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "isSuccessfulBargein",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (userRatingsEClass, 
		   source, 
		   new String[] {
			 "name", "UserRatings",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getUserRatings_Practical(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "practical",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUserRatings_Predictable(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "predictable",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUserRatings_ClearlyStructured(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "clearlyStructured",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUserRatings_Simple(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "simple",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUserRatings_Stylish(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "stylish",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUserRatings_Premium(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "premium",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUserRatings_Creative(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "creative",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUserRatings_Captivating(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "captivating",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUserRatings_Beautiful(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "beautiful",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUserRatings_Good(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "good",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (userTurnEClass, 
		   source, 
		   new String[] {
			 "name", "UserTurn",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getUserTurn_Metacomm(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "metacomm",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUserTurn_SpeechInput(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "speechInput",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUserTurn_GuiInput(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "guiInput",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUserTurn_MotionInput(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "motionInput",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (weatherTEEnum, 
		   source, 
		   new String[] {
			 "name", "weather_t"
		   });		
		addAnnotation
		  (weatherTObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "weather_t:Object",
			 "baseType", "weather_t"
		   });		
		addAnnotation
		  (wirelessAccessTypeTEEnum, 
		   source, 
		   new String[] {
			 "name", "wireless_access_type_t"
		   });		
		addAnnotation
		  (wirelessAccessTypeTObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "wireless_access_type_t:Object",
			 "baseType", "wireless_access_type_t"
		   });
	}

} //carimModelPackageImpl
