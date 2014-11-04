package org.mmi.events.listeners.userinput;



import java.util.LinkedList;

import org.apache.log4j.Logger;
import org.mmi.events.Event;
import org.mmi.events.event_t;
import org.mmi.events.factory.MmiEventsFactory;
import org.mmi.events.listeners.UserTurnPushingListener;
import org.mmi.events.pool.EventPool;
import org.mmi.model.instantiator.CarimModelInstantiator;
import org.mmi.model.instantiator.detail.MotionInputInstantiator;
import org.mmi.model.instantiator.detail.TurnContentInstantiator;

/**
 * Listener used to collect speech-input-related events and set
 * the corresponding data into the model instance using the 
 * corresponding instantiator.
 * 
 * @author mateo-navarro.pedro
 *
 */
public class MotionInputListener extends UserTurnPushingListener {
	
	private final static Logger LOG = Logger.getLogger(MotionInputListener.class);

	public MotionInputListener(EventPool epool, MmiEventsFactory efact,
			CarimModelInstantiator inst) {
		super(epool, efact, inst);
		//
		_resetCounters();
		//
		motionInputInstantiator = inst.motionInput;
		turnContentInstantiator = inst.turnContent;
	}
	

	@Override
	public void reset() {
		// do nothing
		_resetCounters();
	}
	
	private MotionInputInstantiator motionInputInstantiator;
	private TurnContentInstantiator turnContentInstantiator;
	
	/**
	 * counters
	 */
	
	int _overallTiltsNumber;
	int _overallTwistsNumber;
	int _overallShakesNumber;

	
	private void _resetCounters(){
		_overallTiltsNumber = _overallTwistsNumber = _overallShakesNumber = 0;
	}

	/**
	 * 
	 */
	@Override
	public void onEvent(int type, Event e) {
		//
		if (type == event_t.TILT_VALUE){
			LOG.debug(e.getTimestamp() + "\t>> L1 TILT");
			_overallTiltsNumber++;
		}
		//
		else if (type == event_t.TWIST_VALUE){
			LOG.debug(e.getTimestamp() + "\t>> L1 TWIST");
			_overallTwistsNumber++;
		}
		//
		else if (type == event_t.SHAKE_VALUE){
			LOG.debug(e.getTimestamp() + "\t>> L1 SHAKE");
			_overallShakesNumber++;
		}
		
		//call parent method
		super.onEvent(type, e);
	}

	@Override
	public void doWork(Event e) {
		//commit data for Speech input
		motionInputInstantiator.setTiltElements(_overallTiltsNumber);
		motionInputInstantiator.setTwistElements(_overallTwistsNumber);
		motionInputInstantiator.setShakeElements(_overallShakesNumber);
		
		//commit data for Turn content
		turnContentInstantiator.addElements(_overallTiltsNumber + 
				_overallTwistsNumber + _overallShakesNumber);
		
		LOG.debug(e.getTimestamp() + "\t   L1 :: MotionInputL: Work done.");

		//and reset counters
		_resetCounters();
	}

	@Override
	public LinkedList<Integer> registerTypes() {

		LinkedList<Integer> auxl = new java.util.LinkedList<Integer>();
		//add own events
		auxl.add(event_t.TILT_VALUE);
		auxl.add(event_t.TWIST_VALUE);
		auxl.add(event_t.SHAKE_VALUE);

		//add pushing events
		auxl.addAll(getPushingEvents());

		return auxl;
	}

}

