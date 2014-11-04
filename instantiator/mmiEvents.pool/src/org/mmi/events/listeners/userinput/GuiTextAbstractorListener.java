package org.mmi.events.listeners.userinput;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import org.apache.log4j.Logger;
import org.mmi.events.Event;
import org.mmi.events.event_t;
import org.mmi.events.factory.MmiEventsFactory;
import org.mmi.events.listeners.UserTurnPushingListener;
import org.mmi.events.pool.EventPool;
import org.mmi.model.instantiator.CarimModelInstantiator;

/**
 * Listener to abstract all the GUI text actions into
 * more simple events.
 * It uses low-level events to create more general ones.
 * 
 * @author mateo-navarro.pedro
 *
 */
public class GuiTextAbstractorListener extends UserTurnPushingListener  {

	public GuiTextAbstractorListener(EventPool epool, MmiEventsFactory efact, CarimModelInstantiator inst) {
		super(epool, efact, inst);
		//
		_initializeSets();
		//
		_wordLength = 0;
	}

	@Override
	public void reset() {
		// reset variables
		_wordLength = 0;
	}
	
	private final static Logger LOG = Logger.getLogger(GuiTextAbstractorListener.class);

	/**
	 * variables
	 */
	private int _wordLength;

	/**
	 * Event sets
	 */
	private Set<Integer> otherActions_;

	private void _initializeSets(){
		///
		/// other GUI input actions that are not text
		otherActions_ = new HashSet<Integer>();
		otherActions_.add(event_t.NAVIGATIONMOVE_VALUE);
		otherActions_.add(event_t.NAVIGATIONLENGTH_VALUE);
		otherActions_.add(event_t.NAVIGATIONACTION_VALUE);
		otherActions_.add(event_t.NAVIGATIONEXPLORE_VALUE);
		///
		/// other events indicating
	}

	@Override
	public void onEvent(int type, Event e) {
		if (type == event_t.KEYTEXT_VALUE){
			LOG.debug(e.getTimestamp() + "\t>> L0 KEYTEXT");
			_wordLength++;
		}
		else if (type == event_t.KEYEXPLORE_VALUE){
			LOG.debug(e.getTimestamp() + "\t>> L0 KEYEXPLORE");
			//create a word if necessary
			_createWord(e);
			//create a second level event for exploring keys
			LOG.debug(e.getTimestamp() + "\t   L0 << TextExplore (GuiTextAbstractorL)");
			epool_.postEvent(efact_.createTextExploreEvent(), e.getTimestamp());
		}
		else if (type == event_t.KEYCOMMAND_VALUE){
			LOG.debug(e.getTimestamp() + "\t>> L0 KEYCOMMAND");
			//create a word if necessary
			_createWord(e);
			//create a second level event for command keys
			LOG.debug(e.getTimestamp() + "\t   L0 << TextCommand (GuiTextAbstractorL)");
			epool_.postEvent(efact_.createTextCommandEvent(), e.getTimestamp());
		}
		//if the event is "other action" event
		else{
			LOG.debug(e.getTimestamp() + "\t>> L0 NOT KEY, any action");
			//create a word if necessary
			_createWord(e);
		}
	}
	
	private void _createWord(Event e){
		//create a new WORD event if length > 0
		if (_wordLength > 0){
			LOG.debug(e.getTimestamp() + "\t   L0 << TextWord (GuiTextAbstractorL)");
			epool_.postEvent(efact_.createTextWordEvent(), e.getTimestamp());
			//reset word length
			_wordLength = 0;
		}
		
	}
	
	@Override
	public void doWork(Event e) {
		LOG.debug(e.getTimestamp() + "\t   L1 :: GuiTextAbstractorL: Working...");
		//create a word if necessary
		_createWord(e);
		LOG.debug(e.getTimestamp() + "\t   L1 :: GuiTextAbstractorL: Work done.");
	}

	@Override
	public LinkedList<Integer> registerTypes() {
		LinkedList<Integer> auxl = new java.util.LinkedList<Integer>();
		//add key text
		//"KEYTEXT" value="201"/>
		//"KEYEXPLORE" value="202" />
		//"KEYCOMMAND" value="203" />
		auxl.add(event_t.KEYTEXT_VALUE);
		auxl.add(event_t.KEYEXPLORE_VALUE);
		auxl.add(event_t.KEYCOMMAND_VALUE);
	
		//add other not-key actions
		for (int n : otherActions_){
			auxl.add(n);
		}
		
		return auxl;
	}

}