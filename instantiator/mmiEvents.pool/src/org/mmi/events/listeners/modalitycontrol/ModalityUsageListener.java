package org.mmi.events.listeners.modalitycontrol;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import org.apache.log4j.Logger;
import org.mmi.events.Event;
import org.mmi.events.event_t;
import org.mmi.events.factory.MmiEventsFactory;
import org.mmi.events.listeners.EndTurnPushingListener;
import org.mmi.events.listeners.metacomm.MetacommListener;
import org.mmi.events.pool.EventPool;
import org.carim.model.McReasonT;
import org.carim.model.MmiTypeT;
import org.carim.model.ModTypeT;
import org.carim.model.RoleT;
import org.mmi.model.instantiator.CarimModelInstantiator;
import org.mmi.model.instantiator.detail.ModalityInstantiator;

/**
 * Listener used to collect different modality events and set
 * the corresponding modality meta-info into the model instance
 * using the corresponding instantiator.
 * 
 * @author mateo-navarro.pedro
 *
 */
public class ModalityUsageListener extends EndTurnPushingListener {

	private final static Logger LOG = Logger.getLogger(MetacommListener.class); 

	private ModalityInstantiator moinst_;

	//
	// Event registers
	//
	private Set<Integer> speechInSet;
	private Set<Integer> visualInSet;
	private Set<Integer> motionInSet;
	private Set<Integer> gestureInSet;

	private Set<Integer> speechOutSet;
	private Set<Integer> visualOutSet;
	private Set<Integer> motionOutSet;
	private Set<Integer> gestureOutSet;

	/**
	 * Events leading to a reset of the modality usage flags
	 */
	private Set<Integer> resetEvents;

	///
	/// event handling - control modality changes
	///

	private LinkedList<ModTypeT> lastUserMods_;
	private LinkedList<ModTypeT> lastSystemMods_;
	private boolean lastUserModSet_;
	private boolean lastSystemModSet_;

	private boolean speechUsed_;
	private boolean visualUsed_;
	private boolean motionUsed_;
	private boolean gestureUsed_;

	private boolean onUserTurn;
	private boolean onSystemTurn;



	public ModalityUsageListener(EventPool epool, MmiEventsFactory efact, CarimModelInstantiator inst) {
		super(epool, efact, inst);
		//
		_initializeSets();
		//
		reset();
		//
		moinst_ = inst.modality;
	}

	@Override
	public void reset() {
		lastUserModSet_ = false;
		lastSystemModSet_ = false;
		// reset flags
		_resetFlags();
	}

	public void _resetFlags() {
		// reset flags
		speechUsed_ = false;
		visualUsed_ = false;
		motionUsed_ = false;
		gestureUsed_ = false;

		onUserTurn = false;
		onSystemTurn = false;
	}

	@Override
	public void onEvent(int type, Event e) {
		//do my work


		/*
		 *  When system turn or user turn starts reset the  modality usage flags. Modality
		 *  usage is logged on system turn end user turn level. Thus, there is no need to set 
		 *  an already enabled modality to false during a system turn or user turn. The logical
		 *  conclusion is to reset the flags at the start OR end of system/user turn. 
		 *  We do it at the beginning, in order to decouple system and user turn. 
		 */
		//
		if(resetEvents.contains(e.getType())) {
			_resetFlags();
		}

		// input -> on user turn...
		if (speechInSet.contains(e.getType())){
			speechUsed_ = true;
			onUserTurn = true;
		}
		else if (visualInSet.contains(e.getType())){
			visualUsed_ = true;
			onUserTurn = true;
		}
		else if (motionInSet.contains(e.getType())){
			motionUsed_ = true;
			onUserTurn = true;
		}
		else if (gestureInSet.contains(e.getType())){
			gestureUsed_ = true;
			onUserTurn = true;
		}

		/// output
		else if (speechOutSet.contains(e.getType())){
			speechUsed_ = true;
			onSystemTurn = true;
		}
		else if (visualOutSet.contains(e.getType())){
			visualUsed_ = true;
			onSystemTurn = true;
		}
		else if (motionOutSet.contains(e.getType())){
			motionUsed_ = true;
			onSystemTurn = true;
		}
		else if (gestureOutSet.contains(e.getType())){
			gestureUsed_ = true;
			onSystemTurn = true;
		}

		//call parent method
		super.onEvent(type, e);
	}

	///
	/// end turn work
	///

	@Override
	public void doWork(Event e) {

		//decide used modalities and multimodal interaction type
		LinkedList<ModTypeT> currentMods = new LinkedList<ModTypeT>();
		MmiTypeT mmiType = MmiTypeT.COMPLEMENTARY;
		boolean used = false;

		if (speechUsed_){ 
			currentMods.add(ModTypeT.S);
			mmiType = MmiTypeT.COMPLEMENTARY;//TODO
			LOG.debug(e.getTimestamp() + "\t   L1 :: ModalityUsageL: S modality.");
			used = true;
		}

		if (visualUsed_){ 
			currentMods.add(ModTypeT.V);
			mmiType = MmiTypeT.COMPLEMENTARY;//TODO
			LOG.debug(e.getTimestamp() + "\t   L1 :: ModalityUsageL: V modality.");
			used = true;
		}

		if (motionUsed_){ 
			currentMods.add(ModTypeT.M);
			mmiType = MmiTypeT.COMPLEMENTARY;//TODO
			LOG.debug(e.getTimestamp() + "\t   L1 :: ModalityUsageL: M modality.");
			used = true;
		}

		if (gestureUsed_){ 
			currentMods.add(ModTypeT.G);
			mmiType = MmiTypeT.COMPLEMENTARY;//TODO
			LOG.debug(e.getTimestamp() + "\t   L1 :: ModalityUsageL: G modality.");
			used = true;
		}

		if (!used){
			try {
				throw new Exception("ModalityUsageListener :: No modality selected.");
			} catch (Exception ex) {
				ex.printStackTrace();
				reset();
				return;
			}
		}

		//error if information from two turns was received
		if (onSystemTurn && onUserTurn) {
			try {
				throw new Exception("ModalityUsageListener :: input and output data were collected in the same turn.");
			} catch (Exception ex) {
				LOG.error(ex);
				reset();
				return;
			}
		}

		///
		/// if not error, set information in the model instance

		//input/output type
		moinst_.setModalityType(currentMods);
		//mmi type
		moinst_.setMultimodalInteractionType(mmiType);//TODO

		//check if modality change
		if (onSystemTurn && lastSystemModSet_ 
				&& (!_equalMods(currentMods,lastSystemMods_))){
			moinst_.setModalityChange(RoleT.SYSTEM, McReasonT.SYSTEMDECISION);
			LOG.info(e.getTimestamp() + "\t   L1 :: ModalityUsageL: Modality change in the System turn.");
		}
		else if (onUserTurn && lastUserModSet_ 
				&& (!_equalMods(currentMods,lastUserMods_))){
			moinst_.setModalityChange(RoleT.USER, McReasonT.USERDECISION);
			LOG.info(e.getTimestamp() + "\t   L1 :: ModalityUsageL: Modality change in the User turn.");
		}


		//update some data for the next time
		if (onSystemTurn){
			lastSystemMods_ = currentMods;
			lastSystemModSet_ = true;
		} else if (onUserTurn) {
			lastUserMods_ = currentMods;
			lastUserModSet_ = true;
		}

		LOG.debug(e.getTimestamp() + "\t   L1 :: ModalityUsageL: Work done.");
	}
	
	/**
	 * Compares if there is any difference between two modalities lists
	 * @param ma
	 * @param mb
	 * @return
	 */
	private boolean _equalMods(LinkedList<ModTypeT> ma, LinkedList<ModTypeT> mb){
		if (ma.size() != mb.size())
			return false;
		
		for (int i = 0; i < ma.size(); i++){
			if (ma.get(i).getValue() != mb.get(i).getValue())
				return false;
		}
		
		return true;
	}

	///
	/// event registration
	///

	private void _initializeSets(){
		///
		/// speech events
		///
		//input
		speechInSet = new HashSet<Integer>();
		speechInSet.add(event_t.OVERALLWORDS_VALUE);
		speechInSet.add(event_t.SUBSTITUTEDWORDS_VALUE);
		speechInSet.add(event_t.DELETEDWORDS_VALUE);
		speechInSet.add(event_t.INSERTEDWORDS_VALUE);
		speechInSet.add(event_t.OVERALLSENTENCES_VALUE);
		speechInSet.add(event_t.SUBSTITUTEDSENTENCES_VALUE);
		speechInSet.add(event_t.DELETEDSENTENCES_VALUE);
		speechInSet.add(event_t.INSERTEDSENTENCES_VALUE);
		speechInSet.add(event_t.OVERALLCONCEPTS_VALUE);
		speechInSet.add(event_t.SUBSTITUTEDCONCEPTS_VALUE);
		speechInSet.add(event_t.DELETEDCONCEPTS_VALUE);
		speechInSet.add(event_t.INSERTEDCONCEPTS_VALUE);
		//output
		speechOutSet = new HashSet<Integer>();
		speechOutSet.add(event_t.SPEECHELEMENTS_VALUE);
		speechOutSet.add(event_t.SPEECHFEEDBACK_VALUE);
		speechOutSet.add(event_t.SPEECHCONCEPTS_VALUE);
		speechOutSet.add(event_t.SPEECHNOISE_VALUE);
		speechOutSet.add(event_t.SPEECHQUESTIONS_VALUE);

		///
		/// visual events
		///
		//input
		visualInSet = new HashSet<Integer>();
		visualInSet.add(event_t.NAVIGATIONMOVE_VALUE);
		visualInSet.add(event_t.NAVIGATIONLENGTH_VALUE);
		visualInSet.add(event_t.NAVIGATIONACTION_VALUE);
		visualInSet.add(event_t.NAVIGATIONEXPLORE_VALUE);
		visualInSet.add(event_t.TEXTWORD_VALUE);
		visualInSet.add(event_t.TEXTCOMMAND_VALUE);
		visualInSet.add(event_t.TEXTEXPLORE_VALUE);
		//output
		visualOutSet = new HashSet<Integer>();
		visualOutSet.add(event_t.GUIELEMENTS_VALUE);
		visualOutSet.add(event_t.GUIFEEDBACK_VALUE);

		///
		/// motion events
		///
		//input
		motionInSet = new HashSet<Integer>();
		motionInSet.add(event_t.MOTIONACTION_VALUE);
		//motionInSet.add(event_t.);
		//motionInSet.add(event_t.);
		//motionInSet.add(event_t.);
		//output
		motionOutSet = new HashSet<Integer>();

		///
		/// gesture events
		///
		//input
		gestureInSet = new HashSet<Integer>();
		//output
		gestureOutSet = new HashSet<Integer>();

		//
		// reset flags events
		//
		resetEvents = new HashSet<Integer>();
		resetEvents.add(event_t.STARTUSERTURN_VALUE);
		resetEvents.add(event_t.STARTSYSTEMTURN_VALUE);

	}

	@Override
	public LinkedList<Integer> registerTypes() {

		LinkedList<Integer> auxl = new LinkedList<Integer>();

		//add events in sets
		auxl.addAll(speechInSet);
		auxl.addAll(speechOutSet);
		auxl.addAll(visualInSet);
		auxl.addAll(visualOutSet);
		auxl.addAll(motionInSet);
		auxl.addAll(motionOutSet);
		auxl.addAll(gestureInSet);
		auxl.addAll(gestureOutSet);
		auxl.addAll(resetEvents);

		//add pushing events
		auxl.addAll(getPushingEvents());

		return auxl;
	}

}
