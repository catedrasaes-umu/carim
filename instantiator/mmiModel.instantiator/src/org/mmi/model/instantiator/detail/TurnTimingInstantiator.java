package org.mmi.model.instantiator.detail;


import java.util.LinkedList;

import org.apache.log4j.Logger;
import org.carim.model.DialogueStepT;
import org.carim.model.Turn;
import org.mmi.model.instantiator.InstantiationContext;
import org.mmi.model.instantiator.InstantiationFSM;
import org.mmi.model.instantiator.InstantiatorBase;
import org.mmi.utils.GenericFSM.FSMInvalidTransitionException;

/**
 * Instantiator for turn timing information.
 * It is used by the corresponding listeners to set this
 * information into the model instances
 * 
 * @author mateo-navarro.pedro
 *
 */
public class TurnTimingInstantiator extends InstantiatorBase {

	/**
	 * Constructor
	 * @param c instantiation context
	 */
	public TurnTimingInstantiator(InstantiationContext c) {
		super(c);
	}

	final Logger LOG = Logger.getLogger(TurnTimingInstantiator.class);

	///
	/// Dialogue and turn timing 
	///

	// variables
	private long _turnStart;
	private long _feedbackStart;
	private long _actionStart;
	private long _actionEnd;

	///
	/// methods
	///

	/**
	 * method used to indicate that the dialogue has started
	 * @param timestamp time in which this action is performed
	 */
	public void startDialogue(long timestamp){
		try {
			//change state in the FSM
			icontext_.getState().doTransition(InstantiationFSM.event_t.START_DIALOGUE.value);
			//Trial is already created within InstantiationContext, so...
			//create a new dialogue 
			icontext_.addNewDialogue((int)timestamp);//TODO basetimestamp always 0?
		} catch (FSMInvalidTransitionException e) {
			e.printStackTrace();
		}
	}

	/**
	 * method used to indicate that the dialogue has ended
	 * @param timestamp time in which this action is performed
	 */
	public void endDialogue(long timestamp){
		try {
			//change state in the FSM
			icontext_.getState().doTransition(InstantiationFSM.event_t.END_DIALOGUE.value);
			//do nothing
		} catch (FSMInvalidTransitionException e) {
			e.printStackTrace();
		}
	}

	/**
	 * method used to indicate that the system turn has started
	 * @param timestamp time in which this action is performed
	 */
	public void startSystemTurn(long timestamp){
		try {
			//change state in the FSM
			icontext_.getState().doTransition(InstantiationFSM.event_t.TO_SYSTEM_TURN.value);

			//add a new dialogue step: system turn + user turn
			icontext_.addNewDialogueStep();

			///
			///set system turn as the current turn
			icontext_.setSystemTurnAsCurrentTurn();

			///
			//set base time to turn
			_turnStart = timestamp;
			_feedbackStart = _actionStart = _actionEnd = _turnStart;
			_timesAssert();

		} catch (FSMInvalidTransitionException e) {
			e.printStackTrace();
		}
	}

	/**
	 * method used to indicate that the system turn has ended
	 * @param timestamp time in which this action is performed
	 */
	public void endSystemTurn(long timestamp){
		if (icontext_.getState().inState(InstantiationFSM.state_t.SYSTEM_TURN.value)){
			_timesAssert();
			//set system turn times
			_setTurnTimes(icontext_.getCurrentSystemTurn());
		}
		else{
			throw new IllegalStateException("Illegal state when attempting system turn (endSystemTurn)");
		}
	}

	/**
	 * method used to indicate that the user turn has started
	 * @param timestamp time in which this action is performed
	 */
	public void startUserTurn(long timestamp){
		try {
			//change state in the FSM
			icontext_.getState().doTransition(InstantiationFSM.event_t.TO_USER_TURN.value);
			//Note that the user turn object was created earlier!!!

			//set user turn as the current turn
			icontext_.setUserTurnAsCurrentTurn();

			///
			//set base time to turn
			_turnStart = timestamp;
			_feedbackStart = _actionStart = _actionEnd = _turnStart;
			_timesAssert();
		} catch (FSMInvalidTransitionException e) {
			e.printStackTrace();
		}
	}

	/**
	 * method used to indicate that the user turn has ended
	 * @param timestamp time in which this action is performed
	 */
	public void endUserTurn(long timestamp){
		if (icontext_.getState().inState(InstantiationFSM.state_t.USER_TURN.value)){
			//set user turn times
			_setTurnTimes(icontext_.getCurrentUserTurn());
		}
		else{
			throw new IllegalStateException("Illegal state when attempting user turn (endUserTurn)");
		}
	}

	/**
	 * method used to indicate that the feedback has started
	 * @param timestamp time in which this action is performed
	 */
	public void feedbackStart(long timestamp){
		_feedbackStart = timestamp;
		_actionStart = _actionEnd = _feedbackStart;
		_timesAssert();
	}

	/**
	 * method used to indicate that the action has started
	 * @param timestamp time in which this action is performed
	 */
	public void actionStart(long timestamp){
		_actionStart = timestamp;
		_actionEnd = _actionStart;
		_timesAssert();
	}

	/**
	 * method used to indicate that the action has ended
	 * @param timestamp time in which this action is performed
	 */
	public void actionEnd(long timestamp){
		_actionEnd = timestamp;
		_timesAssert();
	}

	private void _setTurnTimes(Turn turn){
		long delay = 0;
		long f_duration = 0;
		long a_duration = 0;

		LOG.info("TURN START " + _turnStart);
		LOG.info("FEED START " + _feedbackStart);
		LOG.info("ACTI START " + _actionStart);
		LOG.info("ACTI END " + _actionEnd);

		//if feedback and action
		if (_feedbackStart > _turnStart && _actionStart > _feedbackStart){
			delay = _feedbackStart - _turnStart;
			f_duration = _actionStart - _feedbackStart;
			a_duration = _actionEnd - _actionStart;
		}
		//if only feedback
		else if (_feedbackStart > _turnStart && _actionStart <= _feedbackStart){
			delay = _feedbackStart - _turnStart;
			f_duration = _actionEnd - _feedbackStart;
			a_duration = 0;
		}
		//if only action
		else if (_feedbackStart <= _turnStart && _actionStart > _turnStart){
			delay = _actionStart - _turnStart;
			f_duration = 0;
			a_duration = _actionEnd - _actionStart;
		}
		//if empty turn (e.g. when interaction ends with system turn)
		else if (_feedbackStart == _turnStart && _actionStart == _turnStart){
			delay = 0;
			f_duration = 0;
			a_duration = 0;
		}
		//error
		else{
			throw new IllegalStateException("Illegal times in (_setTurnTimes)");
		}

		//set times into current system turn
		turn.setFeedbackDelay(delay);
		turn.setFeedbackDuration(f_duration);
		turn.setActionDuration(a_duration);
	}

	private void _printTimes(String message, long timestamp){
		LOG.debug("\t=====================================");
		LOG.debug("\t@ " + message);
		LOG.debug("\t| base = " + _turnStart);
		LOG.debug("\t| current = " + timestamp);
		LOG.debug("\t| f.delay =" + icontext_.getCurrentTurn().getFeedbackDelay());
		LOG.debug("\t| f.duration =" + icontext_.getCurrentTurn().getFeedbackDuration());
		LOG.debug("\t| a.duration =" + icontext_.getCurrentTurn().getActionDuration());
		LOG.debug("\t=====================================");
	}

	private void _timesAssert(){
		LOG.error("TURN START " + _turnStart);
		LOG.error("FEED START " + _feedbackStart);
		LOG.error("ACTI START " + _actionStart);
		LOG.error("ACTI END " + _actionEnd);

		if (!(_feedbackStart >= _turnStart)) throw new IllegalStateException("Times assert 1");
		if (!(_actionStart >= _feedbackStart)) throw new IllegalStateException("Times assert 2");
		if (!(_actionEnd >= _actionStart)) throw new IllegalStateException("Times assert 3");
	}
}
