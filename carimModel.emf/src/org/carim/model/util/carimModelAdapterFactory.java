/**
 */
package org.carim.model.util;

import org.carim.model.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.carim.model.carimModelPackage
 * @generated
 */
public class carimModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static carimModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public carimModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = carimModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected carimModelSwitch<Adapter> modelSwitch =
		new carimModelSwitch<Adapter>() {
			@Override
			public Adapter caseAttitude(Attitude object) {
				return createAttitudeAdapter();
			}
			@Override
			public Adapter caseAvm(Avm object) {
				return createAvmAdapter();
			}
			@Override
			public Adapter caseCommunicationContext(CommunicationContext object) {
				return createCommunicationContextAdapter();
			}
			@Override
			public Adapter caseCooperativity(Cooperativity object) {
				return createCooperativityAdapter();
			}
			@Override
			public Adapter caseDateTimeT(DateTimeT object) {
				return createDateTimeTAdapter();
			}
			@Override
			public Adapter caseDeviceContext(DeviceContext object) {
				return createDeviceContextAdapter();
			}
			@Override
			public Adapter caseDialogue(Dialogue object) {
				return createDialogueAdapter();
			}
			@Override
			public Adapter caseDialogueStepT(DialogueStepT object) {
				return createDialogueStepTAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseDynamicContext(DynamicContext object) {
				return createDynamicContextAdapter();
			}
			@Override
			public Adapter caseGuiInput(GuiInput object) {
				return createGuiInputAdapter();
			}
			@Override
			public Adapter caseLocationTimeContext(LocationTimeContext object) {
				return createLocationTimeContextAdapter();
			}
			@Override
			public Adapter caseMetacomm(Metacomm object) {
				return createMetacommAdapter();
			}
			@Override
			public Adapter caseModalityAppropriateness(ModalityAppropriateness object) {
				return createModalityAppropriatenessAdapter();
			}
			@Override
			public Adapter caseModalityChange(ModalityChange object) {
				return createModalityChangeAdapter();
			}
			@Override
			public Adapter caseModalityInfo(ModalityInfo object) {
				return createModalityInfoAdapter();
			}
			@Override
			public Adapter caseModalitySynchroni(ModalitySynchroni object) {
				return createModalitySynchroniAdapter();
			}
			@Override
			public Adapter caseMotionInput(MotionInput object) {
				return createMotionInputAdapter();
			}
			@Override
			public Adapter casePhysicalContext(PhysicalContext object) {
				return createPhysicalContextAdapter();
			}
			@Override
			public Adapter caseSocialContext(SocialContext object) {
				return createSocialContextAdapter();
			}
			@Override
			public Adapter caseSpeechInput(SpeechInput object) {
				return createSpeechInputAdapter();
			}
			@Override
			public Adapter caseSpeechOutput(SpeechOutput object) {
				return createSpeechOutputAdapter();
			}
			@Override
			public Adapter caseSystemMetacomm(SystemMetacomm object) {
				return createSystemMetacommAdapter();
			}
			@Override
			public Adapter caseSystemTurn(SystemTurn object) {
				return createSystemTurnAdapter();
			}
			@Override
			public Adapter caseTask(Task object) {
				return createTaskAdapter();
			}
			@Override
			public Adapter caseTrial(Trial object) {
				return createTrialAdapter();
			}
			@Override
			public Adapter caseTurn(Turn object) {
				return createTurnAdapter();
			}
			@Override
			public Adapter caseUserAttitude(UserAttitude object) {
				return createUserAttitudeAdapter();
			}
			@Override
			public Adapter caseUserData(UserData object) {
				return createUserDataAdapter();
			}
			@Override
			public Adapter caseUserMetacomm(UserMetacomm object) {
				return createUserMetacommAdapter();
			}
			@Override
			public Adapter caseUserRatings(UserRatings object) {
				return createUserRatingsAdapter();
			}
			@Override
			public Adapter caseUserTurn(UserTurn object) {
				return createUserTurnAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.carim.model.Attitude <em>Attitude</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.carim.model.Attitude
	 * @generated
	 */
	public Adapter createAttitudeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.carim.model.Avm <em>Avm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.carim.model.Avm
	 * @generated
	 */
	public Adapter createAvmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.carim.model.CommunicationContext <em>Communication Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.carim.model.CommunicationContext
	 * @generated
	 */
	public Adapter createCommunicationContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.carim.model.Cooperativity <em>Cooperativity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.carim.model.Cooperativity
	 * @generated
	 */
	public Adapter createCooperativityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.carim.model.DateTimeT <em>Date Time T</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.carim.model.DateTimeT
	 * @generated
	 */
	public Adapter createDateTimeTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.carim.model.DeviceContext <em>Device Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.carim.model.DeviceContext
	 * @generated
	 */
	public Adapter createDeviceContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.carim.model.Dialogue <em>Dialogue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.carim.model.Dialogue
	 * @generated
	 */
	public Adapter createDialogueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.carim.model.DialogueStepT <em>Dialogue Step T</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.carim.model.DialogueStepT
	 * @generated
	 */
	public Adapter createDialogueStepTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.carim.model.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.carim.model.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.carim.model.DynamicContext <em>Dynamic Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.carim.model.DynamicContext
	 * @generated
	 */
	public Adapter createDynamicContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.carim.model.GuiInput <em>Gui Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.carim.model.GuiInput
	 * @generated
	 */
	public Adapter createGuiInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.carim.model.LocationTimeContext <em>Location Time Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.carim.model.LocationTimeContext
	 * @generated
	 */
	public Adapter createLocationTimeContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.carim.model.Metacomm <em>Metacomm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.carim.model.Metacomm
	 * @generated
	 */
	public Adapter createMetacommAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.carim.model.ModalityAppropriateness <em>Modality Appropriateness</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.carim.model.ModalityAppropriateness
	 * @generated
	 */
	public Adapter createModalityAppropriatenessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.carim.model.ModalityChange <em>Modality Change</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.carim.model.ModalityChange
	 * @generated
	 */
	public Adapter createModalityChangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.carim.model.ModalityInfo <em>Modality Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.carim.model.ModalityInfo
	 * @generated
	 */
	public Adapter createModalityInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.carim.model.ModalitySynchroni <em>Modality Synchroni</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.carim.model.ModalitySynchroni
	 * @generated
	 */
	public Adapter createModalitySynchroniAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.carim.model.MotionInput <em>Motion Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.carim.model.MotionInput
	 * @generated
	 */
	public Adapter createMotionInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.carim.model.PhysicalContext <em>Physical Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.carim.model.PhysicalContext
	 * @generated
	 */
	public Adapter createPhysicalContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.carim.model.SocialContext <em>Social Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.carim.model.SocialContext
	 * @generated
	 */
	public Adapter createSocialContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.carim.model.SpeechInput <em>Speech Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.carim.model.SpeechInput
	 * @generated
	 */
	public Adapter createSpeechInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.carim.model.SpeechOutput <em>Speech Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.carim.model.SpeechOutput
	 * @generated
	 */
	public Adapter createSpeechOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.carim.model.SystemMetacomm <em>System Metacomm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.carim.model.SystemMetacomm
	 * @generated
	 */
	public Adapter createSystemMetacommAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.carim.model.SystemTurn <em>System Turn</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.carim.model.SystemTurn
	 * @generated
	 */
	public Adapter createSystemTurnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.carim.model.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.carim.model.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.carim.model.Trial <em>Trial</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.carim.model.Trial
	 * @generated
	 */
	public Adapter createTrialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.carim.model.Turn <em>Turn</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.carim.model.Turn
	 * @generated
	 */
	public Adapter createTurnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.carim.model.UserAttitude <em>User Attitude</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.carim.model.UserAttitude
	 * @generated
	 */
	public Adapter createUserAttitudeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.carim.model.UserData <em>User Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.carim.model.UserData
	 * @generated
	 */
	public Adapter createUserDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.carim.model.UserMetacomm <em>User Metacomm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.carim.model.UserMetacomm
	 * @generated
	 */
	public Adapter createUserMetacommAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.carim.model.UserRatings <em>User Ratings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.carim.model.UserRatings
	 * @generated
	 */
	public Adapter createUserRatingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.carim.model.UserTurn <em>User Turn</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.carim.model.UserTurn
	 * @generated
	 */
	public Adapter createUserTurnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //carimModelAdapterFactory
