package org.mmi.events.pool;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.mmi.events.Event;
import org.mmi.events.TiltEvent;
import org.mmi.events.event_t;
import org.mmi.events.listeners.EventPoolListener;
import org.mmi.events.listeners.userinput.SpeechInputListener;

/**
 * Event pool object. It is used to post new events and
 * distribute them to the interested listeners.
 * 
 * @author mateo-navarro.pedro
 *
 */
public class EventPool {

	private final static Logger LOG = Logger.getLogger(EventPool.class);

	/**
	 * Listeners map
	 */
	private Map<Integer, List<EventPoolListener>> _registeredListeners;
	private List<EventPoolListener> _listeners;

	/**
	 * Constructor
	 */
	public EventPool(){
		//initialize variables
		_registeredListeners = new HashMap<Integer, List<EventPoolListener>>();
		_listeners = new LinkedList<EventPoolListener>();
	}

	/**
	 * Reset method
	 */
	public void reset(){
		// reset listeners
		for (EventPoolListener l : _listeners)
			l.reset();
	}

	/**
	 * Method used to add new listeners
	 * @param eventType type of the event to subscribe
	 * @param l listener
	 */
	public void addListener(int eventType, EventPoolListener l){
		///
		/// register listener for event type

		//in case there is no previous listeners for this event
		//create the list for this event
		if (!_registeredListeners.containsKey(eventType))
		{
			_registeredListeners.put(eventType, new LinkedList<EventPoolListener>());
		}
		//get this list
		List<EventPoolListener> auxl = _registeredListeners.get(eventType);
		//add the listener at the end
		auxl.add(l);
	}

	/**
	 * Another subscription method, but using a list of event types
	 * instead a single type
	 * @param eventTypes list of event types
	 * @param l listener
	 */
	public void addListener(LinkedList<Integer> eventTypes, EventPoolListener l){

		///
		/// add listener to listeners list if not previously added
		if (!_listeners.contains(l))
			_listeners.add(l);

		///
		/// register listener for its event types
		for (int type : eventTypes){
			addListener(type, l);
		}
	}

	public void removeListener()
	{
		//TODO
	}

	/**
	 * Method used to post new events and send them to the
	 * listeners
	 * @param e event object
	 */
	public void postEvent(Event e)
	{
		int etype = e.getType();
		if (etype < 100)
			LOG.info("" + event_t.get(etype).toString());
		else if (etype < 1000)
			LOG.info("   - " + event_t.get(etype).toString());
		else 
			LOG.info("      >> " + event_t.get(etype).toString());

		List<EventPoolListener> auxl = _registeredListeners.get(e.getType());
		if (auxl != null) {
			for (EventPoolListener l : auxl) {
				l.onEvent(e.getType(), e);
			}
		}
	}

	/**
	 * Method used to post new events and send them to the
	 * listeners, but using a customized timestamp
	 * @param e event object
	 * @param timestamp customized timestamp
	 */
	public void postEvent(Event e, long timestamp)
	{
		//modify timestamp
		if (timestamp >= 0) {
			e.setTimestamp(timestamp);
		}
		//post event
		postEvent(e);
	}
}