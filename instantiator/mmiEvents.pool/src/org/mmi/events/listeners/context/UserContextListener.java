package org.mmi.events.listeners.context;

import java.util.LinkedList;

import org.apache.log4j.Logger;
import org.mmi.events.Event;
import org.mmi.events.UserAttitudeUpdateEvent;
import org.mmi.events.UserDataUpdateEvent;
import org.mmi.events.UserMoodUpdateEvent;
import org.mmi.events.UserRatingsUpdateEvent;
import org.mmi.events.event_t;
import org.mmi.events.factory.MmiEventsFactory;
import org.mmi.events.listeners.EventPoolListener;
import org.mmi.events.listeners.metacomm.MetacommListener;
import org.mmi.events.pool.EventPool;
import org.mmi.model.instantiator.CarimModelInstantiator;
import org.mmi.model.instantiator.detail.UserContextInstantiator;

public class UserContextListener extends EventPoolListener {

	private final static Logger LOG = Logger.getLogger(MetacommListener.class); 

	public UserContextListener(EventPool epool,
			MmiEventsFactory efact, CarimModelInstantiator inst) {
		super(epool, efact, inst);
		
		_ucinst = inst.userContext;
	}
	
	@Override
	public void reset() {
		// do nothing
	}

	private UserContextInstantiator _ucinst;

	@Override
	public void onEvent(int type, Event e) {
		///
		/// user update events
		///

		// USERDATAUPDATE_VALUE = 811;
		// USERRATINGSUPDATE_VALUE = 812;
		// USERATTITUDEUPDATE_VALUE = 813;
		// USERMOODUPDATE_VALUE = 814;

		if (e.getType() == event_t.USERDATAUPDATE_VALUE){
			LOG.debug(e.getTimestamp() + "\t>> L1 USERDATAUPDATE");
			UserDataUpdateEvent ce = (UserDataUpdateEvent)e;
			_ucinst.updateUserData(ce.getAge(), ce.getGender(), 
					ce.getEducationLevel(), ce.getPreviousExperience());
		}
		//
		else if (e.getType() == event_t.USERRATINGSUPDATE_VALUE){
			LOG.debug(e.getTimestamp() + "\t>> L1 USERRATINGSUPDATE");
			UserRatingsUpdateEvent ce = (UserRatingsUpdateEvent)e;
			_ucinst.updateUserRatings(ce.getPractical(), ce.getPredictable(),
					ce.getClearlyStructured(), ce.getSimple(), ce.getStylish(),
					ce.getPremium(), ce.getCreative(), ce.getCaptivating(),
					ce.getBeautiful(), ce.getGood());
		}
		//
		else if (e.getType() == event_t.USERATTITUDEUPDATE_VALUE){
			LOG.debug(e.getTimestamp() + "\t>> L1 USERATTITUDEUPDATE");
			UserAttitudeUpdateEvent ce = (UserAttitudeUpdateEvent)e;
			_ucinst.updateUserAttitude(ce.getUsefulness(), ce.getPleasantness(),
					ce.getIntegration(), ce.getSelfEfficacy(), ce.getComfort());
		}
		//
		else if (e.getType() == event_t.USERMOODUPDATE_VALUE){
			LOG.debug(e.getTimestamp() + "\t>> L1 USERMOODUPDATE");
			UserMoodUpdateEvent ce = (UserMoodUpdateEvent)e;
			_ucinst.updateUserMood(ce.getMood());
		}
	}

	@Override
	public LinkedList<Integer> registerTypes() {
		// USERDATAUPDATE_VALUE = 811;
		// USERRATINGSUPDATE_VALUE = 812;
		// USERATTITUDEUPDATE_VALUE = 813;
		// USERMOODUPDATE_VALUE = 814;
		LinkedList<Integer> auxl = new java.util.LinkedList<Integer>();
		auxl.add(event_t.USERDATAUPDATE_VALUE);
		auxl.add(event_t.USERRATINGSUPDATE_VALUE);
		auxl.add(event_t.USERATTITUDEUPDATE_VALUE);
		auxl.add(event_t.USERMOODUPDATE_VALUE);

		return auxl;
	}

}
