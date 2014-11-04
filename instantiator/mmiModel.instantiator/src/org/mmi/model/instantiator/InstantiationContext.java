package org.mmi.model.instantiator;

import org.carim.model.Dialogue;
import org.carim.model.DialogueStepT;
import org.carim.model.DocumentRoot;
import org.carim.model.SystemTurn;
import org.carim.model.Trial;
import org.carim.model.Turn;
import org.carim.model.UserTurn;
import org.carim.model.carimModelFactory;
import org.mmi.utils.GenericFSM.FSMIntegrityException;

/**
 * This class represents the instantiation context in
 * which the model instances are created.
 * 
 * @author mateo-navarro.pedro
 *
 */
public class InstantiationContext {

	/**
	 * model classes factory
	 */
	public carimModelFactory mfact;

	/**
	 * root element of a model instance
	 */
	protected DocumentRoot droot;

	/**
	 * trial object
	 */
	protected Trial trial;

	/**
	 * dialogue object
	 */
	protected Dialogue dialogue;

	/**
	 * dialogue step object
	 */
	protected DialogueStepT dstep;

	/**
	 * current turn during the instantiation process
	 */
	protected Turn cturn;

	/**
	 * current system turn during the instantiation process
	 */
	protected SystemTurn sturn;

	/**
	 * current user turn during the instantiation process
	 */
	protected UserTurn uturn;

	/**
	 * instantiation state FSM
	 */
	protected InstantiationFSM state;

	///
	/// constructor
	///

	public InstantiationContext(){
		mfact = carimModelFactory.eINSTANCE;
		// initialize the trial and the first dialogue step
		reset();
	}

	///
	/// initialization methods
	///

	public void reset(){
		droot = mfact.createDocumentRoot();
		trial = mfact.createTrial();
		// trial values
		trial.setDescription("Trial description here"); //TODO fix description problem
		droot.setTrial(trial);
		// user data
		trial.setUserData(mfact.createUserData());

		dialogue = null;
		dstep = null;
		cturn = null;
		sturn = null;
		uturn = null;

		try {
			state = new InstantiationFSM();
		} catch (FSMIntegrityException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Initializes Dialogue object
	 */
	public void addNewDialogue(int baseTimestamp){
		// first check if trial exists
		if (trial == null)
			throw new NullPointerException("trial is null in (addNewDialogue)");

		// add a new dialogue and save it into the trial
		dialogue = mfact.createDialogue();
		dialogue.setBaseTimestamp(baseTimestamp);
		trial.getDialogues().add(dialogue);
		//add task information
		dialogue.setTask(mfact.createTask());
		dialogue.getTask().setAvm(mfact.createAvm());
	}

	/**
	 * Initializes DialogueStep object
	 */
	public void addNewDialogueStep(){

		// first check if dialogue exists
		if (dialogue == null)
			throw new NullPointerException("dialogue is null in (addNewDialogueStep)");

		// create step and add to the current dialogue
		dstep = mfact.createDialogueStepT();
		dialogue.getStep().add(dstep);

		///
		/// system turn
		///
		sturn = mfact.createSystemTurn();
		dstep.setSystemTurn(sturn);
		//add a metacomm object to the system turn
		sturn.setMetacomm(mfact.createSystemMetacomm());
		//add a modality object to the system turn
		sturn.setModality(mfact.createModalityInfo());
		sturn.getModality().setSynchroni(mfact.createModalitySynchroni());
		sturn.getModality().setAppropriateness(mfact.createModalityAppropriateness());
		sturn.getModality().setChange(mfact.createModalityChange());
		//add speech output and cooperativity objects
		sturn.setSpeechOutput(mfact.createSpeechOutput());
		sturn.setCooperativity(mfact.createCooperativity());
		//add dynamic context
		sturn.setContext(mfact.createDynamicContext());
		sturn.getContext().setPhysicalContext(mfact.createPhysicalContext());
		sturn.getContext().setSocialContext(mfact.createSocialContext());
		sturn.getContext().setLocationTimeContext(mfact.createLocationTimeContext());
		sturn.getContext().setDeviceContext(mfact.createDeviceContext());
		sturn.getContext().setCommunicationContext(mfact.createCommunicationContext());
		///
		/// user turn
		///
		uturn = mfact.createUserTurn();
		dstep.setUserTurn(uturn);
		//add a metacomm object to the user turn
		uturn.setMetacomm(mfact.createUserMetacomm());
		//add a modality object to the system turn
		uturn.setModality(mfact.createModalityInfo());
		uturn.getModality().setSynchroni(mfact.createModalitySynchroni());
		uturn.getModality().setAppropriateness(mfact.createModalityAppropriateness());
		uturn.getModality().setChange(mfact.createModalityChange());
		//add speech, GUI and Motion input objects
		uturn.setGuiInput(mfact.createGuiInput());
		uturn.setMotionInput(mfact.createMotionInput());
		uturn.setSpeechInput(mfact.createSpeechInput());
		//add dynamic context
		uturn.setContext(mfact.createDynamicContext());
		uturn.getContext().setPhysicalContext(mfact.createPhysicalContext());
		uturn.getContext().setSocialContext(mfact.createSocialContext());
		uturn.getContext().setLocationTimeContext(mfact.createLocationTimeContext());
		uturn.getContext().setDeviceContext(mfact.createDeviceContext());
		uturn.getContext().setCommunicationContext(mfact.createCommunicationContext());

		// set system turn as current
		setSystemTurnAsCurrentTurn();
	}

	public void setSystemTurnAsCurrentTurn(){
		cturn = sturn;
	}

	public void setUserTurnAsCurrentTurn(){
		cturn = uturn;
	}

	public void addStepToDialogue(){
		if (dialogue == null)
			throw new NullPointerException("dialogue is null in (addStepToDialogue)");
		//add the dialogue step to the current dialogue
		dialogue.getStep().add(dstep);
	}

	public Turn getCurrentTurn(){
		// initialize dialogue step if not done yet
		if (cturn == null)
			throw new NullPointerException("cturn is null in (getCurrentTurn)");
		return cturn;
	}

	public SystemTurn getCurrentSystemTurn(){
		// initialize dialogue step if not done yet
		if (sturn == null)
			throw new NullPointerException("sturn is null in (getCurrentSystemTurn)");
		return sturn;
	}

	public UserTurn getCurrentUserTurn(){
		// initialize dialogue step if not done yet
		if (uturn == null)
			throw new NullPointerException("uturn is null in (getCurrentUserTurn)");
		return uturn;
	}

	public Trial getTrial(){
		if (trial == null)
			throw new NullPointerException("trial is null in (getTrial)");
		return trial;
	}

	/**
	 * Returns the current dialogue.
	 * May return null
	 * @return
	 */
	public Dialogue getCurrentDialogue(){
		return dialogue;
	}

	public InstantiationFSM getState(){
		return state;
	}

}
