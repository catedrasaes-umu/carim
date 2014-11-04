package org.mmi.events.listeners.timing;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import org.apache.log4j.Logger;
import org.mmi.events.Event;
import org.mmi.events.event_t;
import org.mmi.events.factory.MmiEventsFactory;
import org.mmi.events.listeners.EventPoolListener;
import org.mmi.events.pool.EventPool;
import org.mmi.model.instantiator.CarimModelInstantiator;
import org.mmi.utils.GenericFSM.FSMIntegrityException;
import org.mmi.utils.GenericFSM.FSMInvalidTransitionException;

/**
 * 
 * This listener generates turn control events according
 * to the execution of feedback and transferring actions
 * by both the system and the user. This listener also
 * calculates some metrics as the delay, feedback, and
 * action times.
 * 
 * The following events describe dialogue and turn steps:
 * - dialogue start = concrete event
 * - dialogue end = concrete event
 * - system turn starts = new content in the window, new words, etc. (user turn ends)
 * - system feedback starts = feedback elements appear
 * - system action starts = no-feedback elements appear
 * - user turn starts = GUI elements or words stop appearing (system turn ends)
 * - user feedback starts = user exploring actions
 * - user action starts = user transferring actions
 * 
 * @author mateo-navarro.pedro
 *
 */
public class PreTurnTimingListener extends EventPoolListener {

	private final static Logger LOG = Logger.getLogger(PreTurnTimingListener.class);

	/**
	 * FSM
	 */
	private PreTurnTimingFSM state;

	/**
	 * event sets
	 */
	private Set<Integer> systemFeedbackEvents;
	private Set<Integer> systemActionEvents;
	private Set<Integer> systemOtherEvents;
	private Set<Integer> userFeedbackEvents;
	private Set<Integer> userActionEvents;
	private Set<Integer> userOtherEvents;
	private Set<Integer> dialogueStartEvents;
	private Set<Integer> dialogueEndEvents;
	private Set<Integer> appStartEvents;
	private Set<Integer> appEndEvents;

	

	public PreTurnTimingListener(EventPool epool, MmiEventsFactory efact, CarimModelInstantiator inst) {
		super(epool, efact, inst);

		//state control
		try {
			state = new PreTurnTimingFSM();
		} catch (FSMIntegrityException e) {
			LOG.error(e);
		}

		///
		/// initialize event sets
		///

		///
		/// system feedback
		//
		systemFeedbackEvents = new HashSet<Integer>();
		//guis
		systemFeedbackEvents.add(event_t.GUIFEEDBACK_VALUE);
		//speech
		systemFeedbackEvents.add(event_t.SPEECHFEEDBACK_VALUE);

		///
		/// system actions
		//
		systemActionEvents = new HashSet<Integer>();
		//guis
		systemActionEvents.add(event_t.GUIELEMENTS_VALUE);
		systemActionEvents.add(event_t.GUINOISE_VALUE);
		systemActionEvents.add(event_t.GUICONCEPTS_VALUE);
		systemActionEvents.add(event_t.GUIQUESTIONS_VALUE);
		//speech
		systemActionEvents.add(event_t.SPEECHELEMENTS_VALUE);
		systemActionEvents.add(event_t.SPEECHNOISE_VALUE);
		systemActionEvents.add(event_t.SPEECHCONCEPTS_VALUE);
		systemActionEvents.add(event_t.SPEECHQUESTIONS_VALUE);
		systemActionEvents.add(event_t.OPENPROMPT_VALUE);
		systemActionEvents.add(event_t.HALFOPENPROMPT_VALUE);
		systemActionEvents.add(event_t.CLOSEDPROMPT_VALUE);
		systemActionEvents.add(event_t.NOQUESTIONPROMPT_VALUE);

		///
		/// system other actions
		//
		systemOtherEvents = new HashSet<Integer>();
		//guis
		//systemOtherEvents.add(event_t.);

		///
		/// user feedback
		//
		userFeedbackEvents = new HashSet<Integer>();

		// general
		userFeedbackEvents.add(event_t.USERFEEDBACKSTART_VALUE);
		//guis
		userFeedbackEvents.add(event_t.NAVIGATIONMOVE_VALUE);
		userFeedbackEvents.add(event_t.NAVIGATIONEXPLORE_VALUE);
		userFeedbackEvents.add(event_t.TEXTEXPLORE_VALUE);
		//speech

		///
		/// user actions
		//
		userActionEvents = new HashSet<Integer>();
		//guis
		userActionEvents.add(event_t.NAVIGATIONACTION_VALUE);
		userActionEvents.add(event_t.TEXTWORD_VALUE);
		userActionEvents.add(event_t.TEXTCOMMAND_VALUE);
		//speech
		userActionEvents.add(event_t.OVERALLWORDS_VALUE);
		userActionEvents.add(event_t.OVERALLSENTENCES_VALUE);
		userActionEvents.add(event_t.OVERALLCONCEPTS_VALUE);
		userActionEvents.add(event_t.CORRECTLYPARSEDUTTERANCE_VALUE);
		userActionEvents.add(event_t.PARTIALLYPARSEDUTTERANCE_VALUE);
		userActionEvents.add(event_t.INCORRECTLYPARSEDUTTERANCE_VALUE);

		///
		/// user other actions
		//
		userOtherEvents = new HashSet<Integer>();
		//userOtherEvents.add(event_t.);

		///
		///dialogue start and end events
		///
		dialogueStartEvents = new HashSet<Integer>();
		dialogueStartEvents.add(event_t.STARTDIALOGUE_VALUE);
		dialogueEndEvents = new HashSet<Integer>();
		dialogueEndEvents.add(event_t.ENDDIALOGUE_VALUE);

		///
		///app start and end events
		///
		appStartEvents = new HashSet<Integer>();
		//appStartEvents.add(event_t.APPSTART_VALUE); -- ignored
		appEndEvents = new HashSet<Integer>();
		//appEndEvents.add(event_t.APPEND_VALUE); -- ignore
	}


	@Override
	public void reset() {
		// reset state
		try {
			state.doTransition(PreTurnTimingFSM.event_t.RESET.value);
		} 
		catch (FSMInvalidTransitionException e) {
			LOG.error(e);
		}

		//reset times
		_resetTimes();
	}
	
	///
	/// time delimiters
	///
	
	private long _firstSystemFeedback;
	private long _firstSystemAction;
	private long _lastSystemAction;
	
	private long _firstUserFeedback;
	private long _firstUserAction;
	private long _lastUserAction;
	
	private boolean onSystemTurn;
	private boolean onUserTurn;
	
	
	private void _resetTimes(){
		_firstSystemFeedback = 0;
		_firstSystemAction = 0;
		_lastSystemAction = 0;
		
		_firstUserFeedback = 0;
		_firstUserAction = 0;
		_lastUserAction = 0;
		
		onSystemTurn = false;
		onUserTurn = false;
	}
	
	///
	/// public methods
	///

	@Override
	public void onEvent(int type, Event e) {
		try {
			///
			/// system feedback
			//
			if (systemFeedbackEvents.contains(e.getType())){
				//if state transition can be performed...
				if (state.checkTransition(PreTurnTimingFSM.event_t.SYSTEM_FEEDBACK.value)){
					LOG.debug(e.getTimestamp() + "\t>> L1 :: (PTTL) transition to SYSTEM_FEEDBACK");

					//end user turn if necessary
					if (onUserTurn) 
						_endUserTurn();

					//do transition
					state.doTransition(PreTurnTimingFSM.event_t.SYSTEM_FEEDBACK.value);

					//start system turn if necessary
					if (!onSystemTurn) {
						_startSystemTurn();
					}
					
					//update times
					_firstSystemFeedback = _firstSystemAction = _lastSystemAction = e.getTimestamp();
					
					//start system feedback
					_startSystemFeedback();
				} else {
					LOG.debug(e.getTimestamp() + "\t>> L1 :: (PTTL) NO transition to SYSTEM_FEEDBACK :: e = " + e.getType());
				}

				//log event
				LOG.debug(e.getTimestamp() + "\t>> L1 :: (SYSTEM FEEDBACK EVENT)(PTTL)");
			}

			///
			/// system actions
			///
			else if (systemActionEvents.contains(e.getType())){
				//if state transition can be performed...
				if (state.checkTransition(PreTurnTimingFSM.event_t.SYSTEM_ACTION.value)){
					LOG.debug(e.getTimestamp() + "\t>> L1 :: (PTTL) transition to SYSTEM_ACTION");

					//end user turn if necessary
					if (onUserTurn) 
						_endUserTurn();

					//do transition
					state.doTransition(PreTurnTimingFSM.event_t.SYSTEM_ACTION.value);

					//start system turn (if not started)
					if (!onSystemTurn) 
						_startSystemTurn();
					
					//update times
					_firstSystemAction = _lastSystemAction = e.getTimestamp();

					//start system action
					_startSystemAction();

					LOG.debug(e.getTimestamp() + "\t>> L1 :: (PTTL) End transition to SYSTEM_ACTION");
				}
				else{
					// update times
					_lastSystemAction = e.getTimestamp();
					
					LOG.debug(e.getTimestamp() + "\t>> L1 :: (PTTL) NO transition to SYSTEM_ACTION :: e = " 
							+ e.getType());
				}

				//log event
				LOG.debug(e.getTimestamp() + "\t>> L1 :: (SYSTEM ACTION EVENT)(PTTL)");
			}

			/// ////////////////////////////////////////////////////////////////////
			///
			/// user feedback
			///
			else if (userFeedbackEvents.contains(e.getType())){
				//if state transition can be performed...
				if (state.checkTransition(PreTurnTimingFSM.event_t.USER_FEEDBACK.value)){
					LOG.debug(e.getTimestamp() + "\t>> L1 :: (PTTL) transition to USER_FEEDBACK");

					//end system turn
					if (onSystemTurn) {
						_endSystemTurn();
					}

					//do transition
					state.doTransition(PreTurnTimingFSM.event_t.USER_FEEDBACK.value);

					//start user turn if necessary...
					if (!onUserTurn) {
						_startUserTurn();
					}
					
					//update times
					_firstUserFeedback = _firstUserAction = _lastUserAction = e.getTimestamp();
					
					// ... and generate feedback start event, if e is not the feedback start event
					if( !e.equals(event_t.USERFEEDBACKSTART)) {
						_startUserFeedback();
					}
				}
				else{
					LOG.debug(e.getTimestamp() + "\t>> L1 :: (PTTL) NO transition to USER_FEEDBACK :: e = "	+ e.getType());
				}

				//log event
				LOG.debug(e.getTimestamp() + "\t>> L1 :: (USER FEEDBACK EVENT)(PTTL)");
			}

			///
			/// user actions
			///
			else if (userActionEvents.contains(e.getType())){
				//if state transition can be performed...
				if (state.checkTransition(PreTurnTimingFSM.event_t.USER_ACTION.value)){
					LOG.debug(e.getTimestamp() + "\t>> L1 :: (PTTL) transition to USER_ACTION");

					//end system turn (if necessary)
					if (onSystemTurn) {
						_endSystemTurn();
					}

					//do transition
					state.doTransition(PreTurnTimingFSM.event_t.USER_ACTION.value);

					//start user turn (if not started yet)
					if (!onUserTurn) {
						_startUserTurn();
					}
					
					//update times
					_firstUserAction = _lastUserAction = e.getTimestamp();

					//start user action
					_startUserAction();
				} else {
					//update times
					_lastUserAction = e.getTimestamp();
					
					LOG.debug(e.getTimestamp() + "\t>> L1 :: (PTTL) NO transition to USER_ACTION :: e = " + e.getType());
				}
				
				//log event
				LOG.debug(e.getTimestamp() + "\t>> L1 :: (USER ACTION EVENT)(PTTL) " + e.getType());
			}

			/// ////////////////////////////////////////////////////////////////////
			///
			/// dialogue start
			else if (dialogueStartEvents.contains(e.getType())){
				LOG.debug(e.getTimestamp() + "\t>> L2 :: (DIALOGUE START EVENT)(PTTL)");

				//if not done yet, post a STARTDIALOGUE event
				if (state.doTransition(PreTurnTimingFSM.event_t.START_DIALOGUE.value)) {
					LOG.debug(e.getTimestamp() + "\t>> L1 :: (PTTL) state transition to START_DIALOGUE");
					LOG.info("\n%%%\n %%%%%%%%%%%%%%%%%%% START DIALOGUE \n\n");
					// the event is also handled in TurnTimingListener
					
					//reset times
					_resetTimes();
				} else {
					LOG.debug(e.getTimestamp() + "\t>> L1 :: (PTTL) NO transition to START_DIALOGUE :: e = " + e.getType());
				}
			}

			///
			/// dialogue end
			else if (dialogueEndEvents.contains(e.getType())){
				LOG.debug(e.getTimestamp() + "\t>> L2 :: (DIALOGUE END EVENT)(PTTL)");

				//if state transition takes place...
				if (state.doTransition(PreTurnTimingFSM.event_t.END_DIALOGUE.value)) {
					LOG.debug(e.getTimestamp() + "\t>> L1 :: (PTTL) state transition to END_DIALOGUE");
					
					//finish the user turn and dialogue
					_endDialogue();
					
					//finish the dialogue
					LOG.info("\n\n %%%%%%%%%%%%%%%%%%% END DIALOGUE \n %%%\n");
				} else {
					LOG.debug(e.getTimestamp() + "\t>> L1 :: (PTTL) NO transition to END_DIALOGUE :: e = " + e.getType());
				}
			}

			/// ////////////////////////////////////////////////////////////////////
			///
			/// app start
			else if (appStartEvents.contains(e.getType())){
				LOG.debug(e.getTimestamp() + "\t>> L2 :: (APP START EVENT)(PTTL)");

				//do nothing
			}

			///
			/// app end
			else if (appEndEvents.contains(e.getType())){
				LOG.debug(e.getTimestamp() + "\t>> L2 :: (APP END EVENT)(PTTL)");

				//do nothing
			}
		} catch (FSMInvalidTransitionException e1) {
			LOG.error(e1);
		}
	}
	
	///
	/// turn timing methods
	///

	private void _startSystemTurn(){
		onSystemTurn = true;
		LOG.info("\n\n >>>\n >>>>>>>>>>>>>>>>>> START SYSTEM TURN \n\n");

		epool_.postEvent(efact_.createStartSystemTurnEvent(), _lastUserAction);
	}

	private void _startSystemFeedback(){
		onSystemTurn = true;
		epool_.postEvent(efact_.createSystemFeedbackStartEvent(), _firstSystemFeedback);
	}

	private void _startSystemAction(){
		onSystemTurn = true;
		epool_.postEvent(efact_.createSystemActionStartEvent(), _firstSystemAction);
	}

	private void _endSystemTurn(){
		//end action
		LOG.debug(_lastSystemAction + "\t   L1 :: GuiTurnTimingL: Sending End SystemAction");
		epool_.postEvent(efact_.createSystemActionEndEvent(), _lastSystemAction);

		//end turn
		onSystemTurn = false;
		LOG.debug((_lastSystemAction + 1) + "\t   L1 :: GuiTurnTimingL: Sending End SystemTurn");
		epool_.postEvent(efact_.createEndSystemTurnEvent(), _lastSystemAction + 1);
		LOG.info("\n\n <<<<<<<<<<<<<<<<<< END SYSTEM TURN \n <<<\n");
	}

	private void _startUserTurn(){
		onUserTurn = true;
		LOG.info("\n\n >>>\n >>>>>>>>>>>>>>>>>> START USER TURN \n\n");

		epool_.postEvent(efact_.createStartUserTurnEvent(), _lastSystemAction);
	}

	private void _startUserFeedback(){
		onUserTurn = true;
		epool_.postEvent(efact_.createUserFeedbackStartEvent(), _firstUserFeedback);
	}

	private void _startUserAction(){
		onUserTurn = true;
		epool_.postEvent(efact_.createUserActionStartEvent(), _firstUserAction);
	}

	private void _endUserTurn(){
		//finish user action
		LOG.info(_lastUserAction + "\t   L1 :: GuiTurnTimingL: Sending End UserAction");
		epool_.postEvent(efact_.createUserActionEndEvent(), _lastUserAction);

		//finish user turn
		onUserTurn = false;
		LOG.debug((_lastUserAction + 1) + "\t   L1 :: GuiTurnTimingL: Sending End UserTurn");
		epool_.postEvent(efact_.createEndUserTurnEvent(), _lastUserAction + 1);
		LOG.info("\n\n <<<<<<<<<<<<<<<<<< END USER TURN \n <<<\n");
	}
	
	private void _endDialogue(){
		
		// dialogue may end on System turn, 
		// therefore simulate the rest of the dialogue
		// to fullfill the state machine
		if (onSystemTurn){
			// end system turn
			_endSystemTurn();
			
			// start user turn
			_startUserTurn();
			
			//update turn times
			_firstUserFeedback = _firstUserAction = _lastUserAction = _lastSystemAction;
			
			// start user action
			_startUserAction();
		}
		
		//end user turn
		_endUserTurn();
		
		//end dialogue
		// do not send the event, it is also handled in TurnTimingListener
	}

	@Override
	public LinkedList<Integer> registerTypes() {
		LinkedList<Integer> auxl = new java.util.LinkedList<Integer>();

		///register all the events included in the sets
		auxl.addAll(systemFeedbackEvents);
		auxl.addAll(systemActionEvents);
		auxl.addAll(systemOtherEvents);
		auxl.addAll(userFeedbackEvents);
		auxl.addAll(userActionEvents);
		auxl.addAll(userOtherEvents);
		auxl.addAll(dialogueStartEvents);
		auxl.addAll(dialogueEndEvents);

		return auxl;
	}

}
