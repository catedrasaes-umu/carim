package org.mmi.events.listeners.userinput;

import java.util.LinkedList;

import org.apache.log4j.Logger;
import org.mmi.events.DeletedConceptsEvent;
import org.mmi.events.DeletedSentencesEvent;
import org.mmi.events.DeletedWordsEvent;
import org.mmi.events.Event;
import org.mmi.events.InsertedConceptsEvent;
import org.mmi.events.InsertedSentencesEvent;
import org.mmi.events.InsertedWordsEvent;
import org.mmi.events.OverallConceptsEvent;
import org.mmi.events.OverallSentencesEvent;
import org.mmi.events.OverallWordsEvent;
import org.mmi.events.SubstitutedConceptsEvent;
import org.mmi.events.SubstitutedSentencesEvent;
import org.mmi.events.SubstitutedWordsEvent;
import org.mmi.events.event_t;
import org.mmi.events.factory.MmiEventsFactory;
import org.mmi.events.listeners.UserTurnPushingListener;
import org.mmi.events.pool.EventPool;
import org.carim.model.ParsingResultT;
import org.mmi.model.instantiator.CarimModelInstantiator;
import org.mmi.model.instantiator.detail.SpeechInputInstantiator;
import org.mmi.model.instantiator.detail.TurnContentInstantiator;

/**
 * Listener used to collect speech-input-related events and set
 * the corresponding data into the model instance using the 
 * corresponding instantiator.
 * 
 * @author mateo-navarro.pedro
 *
 */
public class SpeechInputListener extends UserTurnPushingListener {
	
	private final static Logger LOG = Logger.getLogger(SpeechInputListener.class);

	public SpeechInputListener(EventPool epool, MmiEventsFactory efact,
			CarimModelInstantiator inst) {
		super(epool, efact, inst);
		//
		_resetCounters();
		//
		speechInputInstantiator = inst.speechInput;
		turnContentInstantiator = inst.turnContent;
	}
	

	@Override
	public void reset() {
		// do nothing
		_resetCounters();
	}
	
	private SpeechInputInstantiator speechInputInstantiator;
	private TurnContentInstantiator turnContentInstantiator;
	
	/**
	 * counters
	 */
	private int overallWordsNumber;
	private int substitutedWordsNumber;
	private int deletedWordsNumber;
	private int insertedWordsNumber;
	private int overallSentencesNumber;
	private int substitutedSentencesNumber;
	private int deletedSentencesNumber;
	private int insertedSentencesNumber;
	private int overallConceptsNumber;
	private int substitutedConceptsNumber;
	private int deletedConceptsNumber;
	private int insertedConceptsNumber;
	
	private void _resetCounters(){
		overallWordsNumber = substitutedWordsNumber = deletedWordsNumber = insertedWordsNumber = overallSentencesNumber =
			substitutedSentencesNumber = deletedSentencesNumber = insertedSentencesNumber = overallConceptsNumber =
				substitutedConceptsNumber = deletedConceptsNumber = insertedConceptsNumber = 0;
	}

	/**
	 * 
	 */
	@Override
	public void onEvent(int type, Event e) {
		//"OVERALLWORDS" value="7001" />
		if (type == event_t.OVERALLWORDS_VALUE){
			LOG.debug(e.getTimestamp() + "\t>> L1 OVERALLWORDS");
			overallWordsNumber = overallWordsNumber + ((OverallWordsEvent)e).getNwords();
		}
		//"SUBSTITUTEDWORDS" value="7002" />
		else if (type == event_t.SUBSTITUTEDWORDS_VALUE){
			LOG.debug(e.getTimestamp() + "\t>> L1 SUBSTITUTEDWORDS");
			substitutedWordsNumber = substitutedWordsNumber + ((SubstitutedWordsEvent)e).getNwords();
		}
		//"DELETEDWORDS" value="7003" />
		else if (type == event_t.DELETEDWORDS_VALUE){
			LOG.debug(e.getTimestamp() + "\t>> L1 DELETEDWORDS");
			deletedWordsNumber = deletedWordsNumber + ((DeletedWordsEvent)e).getNwords();
		}
		//"INSERTEDWORDS" value="7004" />
		else if (type == event_t.INSERTEDWORDS_VALUE){
			LOG.debug(e.getTimestamp() + "\t>> L1 INSERTEDWORDS");
			insertedWordsNumber = insertedWordsNumber + ((InsertedWordsEvent)e).getNwords();
		}
		//"OVERALLSENTENCES" value="7005" />
		else if (type == event_t.OVERALLSENTENCES_VALUE){
			LOG.debug(e.getTimestamp() + "\t>> L1 OVERALLSENTENCES");
			overallSentencesNumber = overallSentencesNumber + ((OverallSentencesEvent)e).getNsentences();
		}
		//"SUBSTITUTEDSENTENCES" value="7006" />
		else if (type == event_t.SUBSTITUTEDSENTENCES_VALUE){
			LOG.debug(e.getTimestamp() + "\t>> L1 SUBSTITUTEDSENTENCES");
			substitutedSentencesNumber = substitutedSentencesNumber + ((SubstitutedSentencesEvent)e).getNsentences();
		}
		//"DELETEDSENTENCES" value="7007" />
		else if (type == event_t.DELETEDSENTENCES_VALUE){
			LOG.debug(e.getTimestamp() + "\t>> L1 DELETEDSENTENCES");
			deletedSentencesNumber = deletedSentencesNumber + ((DeletedSentencesEvent)e).getNsentences();
		}
		//"INSERTEDSENTENCES" value="7008" />
		else if (type == event_t.INSERTEDSENTENCES_VALUE){
			LOG.debug(e.getTimestamp() + "\t>> L1 INSERTEDSENTENCES");
			insertedSentencesNumber = insertedSentencesNumber + ((InsertedSentencesEvent)e).getNsentences();
		}
		//"OVERALLCONCEPTS" value="7009" />
		else if (type == event_t.OVERALLCONCEPTS_VALUE){
			LOG.debug(e.getTimestamp() + "\t>> L1 OVERALLCONCEPTS");
			overallConceptsNumber = overallConceptsNumber + ((OverallConceptsEvent)e).getNconcepts();
		}
		//"SUBSTITUTEDCONCEPTS" value="7010" />
		else if (type == event_t.SUBSTITUTEDCONCEPTS_VALUE){
			LOG.debug(e.getTimestamp() + "\t>> L1 SUBSTITUTEDCONCEPTS");
			substitutedConceptsNumber = substitutedConceptsNumber + ((SubstitutedConceptsEvent)e).getNconcepts();
		}
		//"DELETEDCONCEPTS" value="7011" />
		else if (type == event_t.DELETEDCONCEPTS_VALUE){
			LOG.debug(e.getTimestamp() + "\t>> L1 DELETEDCONCEPTS");
			deletedConceptsNumber = deletedConceptsNumber + ((DeletedConceptsEvent)e).getNconcepts();
		}
		//"INSERTEDCONCEPTS" value="7012" />
		else if (type == event_t.INSERTEDCONCEPTS_VALUE){
			LOG.debug(e.getTimestamp() + "\t>> L1 INSERTEDCONCEPTS");
			insertedConceptsNumber = insertedConceptsNumber + ((InsertedConceptsEvent)e).getNconcepts();
		}

		//"CORRECTLYPARSEDUTTERANCE" value="7013" />
		else if (type == event_t.CORRECTLYPARSEDUTTERANCE_VALUE){
			LOG.debug(e.getTimestamp() + "\t>> L1 CORRECTLYPARSEDUTTERANCE");
			speechInputInstantiator.setParsingResult(ParsingResultT.CORRECTLYUNDERSTOOD);
		}
		//"PARTIALLYPARSEDUTTERANCE" value="7014" />
		else if (type == event_t.PARTIALLYPARSEDUTTERANCE_VALUE){
			LOG.debug(e.getTimestamp() + "\t>> L1 PARTIALLYPARSEDUTTERANCE");
			speechInputInstantiator.setParsingResult(ParsingResultT.PARTIALLYUNDERSTOOD);
		}
		//"INCORRECTLYPARSEDUTTERANCE" value="7015" />
		else if (type == event_t.INCORRECTLYPARSEDUTTERANCE_VALUE){
			LOG.debug(e.getTimestamp() + "\t>> L1 INCORRECTLYPARSEDUTTERANCE");
			speechInputInstantiator.setParsingResult(ParsingResultT.NOTHINGUNDERSTOOD);
		}

		//call parent method
		super.onEvent(type, e);
	}

	@Override
	public void doWork(Event e) {
		//commit data for Speech input
		speechInputInstantiator.setOverallWords(overallWordsNumber);
		speechInputInstantiator.setSubstitutedWords(substitutedWordsNumber);
		speechInputInstantiator.setDeletedWords(deletedWordsNumber);
		speechInputInstantiator.setInsertedWords(insertedWordsNumber);
		speechInputInstantiator.setOverallSentences(overallSentencesNumber);
		speechInputInstantiator.setSubstitutedSentences(substitutedSentencesNumber);
		speechInputInstantiator.setDeletedSentences(deletedSentencesNumber);
		speechInputInstantiator.setInsertedSentences(insertedSentencesNumber);
		speechInputInstantiator.setOverallConcepts(overallConceptsNumber);
		speechInputInstantiator.setSubstitutedConcepts(substitutedConceptsNumber);
		speechInputInstantiator.setDeletedConcepts(deletedConceptsNumber);
		speechInputInstantiator.setInsertedConcepts(insertedConceptsNumber);
		
		//commit data for Turn content
		turnContentInstantiator.addElements(overallWordsNumber);
		turnContentInstantiator.addConcepts(overallConceptsNumber);
		
		LOG.debug(e.getTimestamp() + "\t   L1 :: SpeechInputL: Work done.");

		//and reset counters
		_resetCounters();
	}

	@Override
	public LinkedList<Integer> registerTypes() {
		//"OVERALLWORDS" value="7001" />
		//"SUBSTITUTEDWORDS" value="7002" />
		//"DELETEDWORDS" value="7003" />
		//"INSERTEDWORDS" value="7004" />
		//"OVERALLSENTENCES" value="7005" />
		//"SUBSTITUTEDSENTENCES" value="7006" />
		//"DELETEDSENTENCES" value="7007" />
		//"INSERTEDSENTENCES" value="7008" />
		//"OVERALLCONCEPTS" value="7009" />
		//"SUBSTITUTEDCONCEPTS" value="7010" />
		//"DELETEDCONCEPTS" value="7011" />
		//"INSERTEDCONCEPTS" value="7012" />

		//"CORRECTLYPARSEDUTTERANCE" value="7013" />
		//"PARTIALLYPARSEDUTTERANCE" value="7014" />
		//"INCORRECTLYPARSEDUTTERANCE" value="7015" />

		LinkedList<Integer> auxl = new java.util.LinkedList<Integer>();
		//add own events
		auxl.add(event_t.OVERALLWORDS_VALUE);
		auxl.add(event_t.SUBSTITUTEDWORDS_VALUE);
		auxl.add(event_t.DELETEDWORDS_VALUE);
		auxl.add(event_t.INSERTEDWORDS_VALUE);
		auxl.add(event_t.OVERALLSENTENCES_VALUE);
		auxl.add(event_t.SUBSTITUTEDSENTENCES_VALUE);
		auxl.add(event_t.DELETEDSENTENCES_VALUE);
		auxl.add(event_t.INSERTEDSENTENCES_VALUE);
		auxl.add(event_t.OVERALLCONCEPTS_VALUE);
		auxl.add(event_t.SUBSTITUTEDCONCEPTS_VALUE);
		auxl.add(event_t.DELETEDCONCEPTS_VALUE);
		auxl.add(event_t.INSERTEDCONCEPTS_VALUE);

		auxl.add(event_t.CORRECTLYPARSEDUTTERANCE_VALUE);
		auxl.add(event_t.PARTIALLYPARSEDUTTERANCE_VALUE);
		auxl.add(event_t.INCORRECTLYPARSEDUTTERANCE_VALUE);

		//add pushing events
		auxl.addAll(getPushingEvents());

		return auxl;
	}

}
