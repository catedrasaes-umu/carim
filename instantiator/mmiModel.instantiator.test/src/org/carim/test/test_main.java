package org.carim.test;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.carim.instantiation.CarimInstantiationFramework;
import org.carim.model.DeviceTypeT;
import org.carim.model.EducationLevelT;
import org.carim.model.GenderT;
import org.carim.model.LocationT;
import org.carim.model.PreviousExperienceT;
import org.carim.model.ScreenOrientationT;
import org.carim.model.ScreenResolutionT;
import org.carim.model.ScreenSizeT;
import org.carim.model.SocialArenaT;
import org.carim.model.SocialCompanyT;
import org.carim.model.WeatherT;
import org.carim.model.WirelessAccessTypeT;
import org.mmi.events.factory.MmiEventsFactory;
import org.mmi.events.pool.EventPool;


public class test_main {

	public test_main() {
		// TODO Auto-generated constructor stub
	}

	///
	/// simulation parameters
	static final int DIALOGUES_TO_SIMULATE = 2;
	static final int MAX_DIALOGUE_STEPS = 20;
	static final boolean SIMULATE_TIMED_TURNS = true;
	static final boolean RANDOM_PROBABILITY_VALUES = false;
	static final boolean MORE_THAN_ONE_TRIAL = false;
	static final int MORE_THAN_ONE_TRIAL_PROB = 33;
	///
	///

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		_log("STARTING CARIM_INSTANTIATION TEST");

		CarimInstantiationFramework instantiator = new CarimInstantiationFramework();
		EventPool pool = instantiator.pool;
		MmiEventsFactory factory = instantiator.factory;

		_log("Instantiation framework initialized. Starting dialogues simulation...");

		for (int i=0; i < DIALOGUES_TO_SIMULATE; i++){
			_log("Starting interaction: DIALOGUE #" + i);

			if (MORE_THAN_ONE_TRIAL && _prob(MORE_THAN_ONE_TRIAL_PROB)){
				// end app
				pool.postEvent(factory.createAppEndEvent(), 0);
				_saveTrialRandom(instantiator);
				// reset instantiator
				instantiator.reset();
				_log("\n%%%\n%%%\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% TRIAL START %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\n%%%\n%%%\n");
				// start app
				pool.postEvent(factory.createAppStartEvent(), 0);
			}

			// set random probability if necessary
			if (RANDOM_PROBABILITY_VALUES){
				prob_feedback = _random(100);
				prob_action = _random(100);
				prob_metacomm = _random(100);
				prob_context = _random(100);
			}

			// reset event times
			factory.resetTimestamp();

			// start dialogue
			pool.postEvent(factory.createStartDialogueEvent(), 1);

			// simulate some random dialogue steps
			int nsteps = 6;//_random(MAX_DIALOGUE_STEPS);
			_log("Simulating " + nsteps + " steps...");
			for (int j=0; j < nsteps; j++){
				if (SIMULATE_TIMED_TURNS){
					_doTimedSystemTurn(pool, factory);
					_doTimedUserTurn(pool, factory);
				}
				else{
					_doRandomSystemTurn(pool, factory);
					_doRandomUserTurn(pool, factory);
				}
			}

			// end dialogue
			pool.postEvent(factory.createEndDialogueEvent(), 1);

			_log("Ending interaction: DIALOGUE #" + i);
		}

		// save trial to a file
		_saveTrialRandom(instantiator);


		_log("END CARIM_INSTANTIATION TEST");
	}

	///
	///
	///
	///
	///
	///
	///
	///
	///
	///

	private static Random randomGenerator = new Random();
	private static int prob_feedback = 30;
	private static int prob_action = 90;
	private static int prob_metacomm = 5;
	private static int prob_context = 10;

	private static void _doRandomSystemTurn(EventPool pool, MmiEventsFactory factory){

		///
		/// 1. feedback
		if (_prob(prob_feedback)){
			// feedback elements
			pool.postEvent(factory.createGuiFeedbackEvent(_random(10)), _stepTimestamp());
		}

		_log("______________________________sf");

		///
		/// 2. action
		if (_prob(prob_action)){
			// gui content elements
			pool.postEvent(factory.createGuiElementsEvent(_random(50) + 1), _stepTimestamp());
			pool.postEvent(factory.createGuiQuestionsEvent(_random(5)), _stepTimestamp());
			//pool.postEvent(factory.createGuiNoiseEvent(n), _stepTimestamp());
			//pool.postEvent(factory.createGuiConceptsEvent(n), _stepTimestamp());
		}
		else{
			// at least one action
			pool.postEvent(factory.createGuiElementsEvent(1+_random(50)), _stepTimestamp());
		}

		_log("______________________________sa");

		///
		/// 3. system metacomm
		if (_prob(prob_metacomm)) pool.postEvent(factory.createHelpTurnEvent(), _stepTimestamp());
		else if (_prob(prob_metacomm*2)) pool.postEvent(factory.createCorrectionTurnEvent(), _stepTimestamp());
		//if (_percent()) pool.postEvent(factory.createDIVRejectionEvent(), _stepTimestamp());
		//if (_percent()) pool.postEvent(factory.createASRRejectionEvent(), _stepTimestamp());
		//if (_percent()) pool.postEvent(factory.createGRRejectionEvent(), _stepTimestamp());

		// speech content
		//pool.postEvent(factory.createSpeechElementsEvent(n), _random());
		//pool.postEvent(factory.createSpeechFeedbackEvent(n), _random());
		//pool.postEvent(factory.createSpeechNoiseEvent(n), _random());
		//pool.postEvent(factory.createSpeechQuestionsEvent(n), _random());
		//pool.postEvent(promptEvent, _random());
		//pool.postEvent(factory.createSpeechConceptsEvent(n), _random());
	}

	private static void _doRandomUserTurn(EventPool pool, MmiEventsFactory factory){

		///
		/// 1. feedback
		if (_prob(prob_feedback)){
			// feedback gui input
			if (_prob(50)) pool.postEvent(factory.createScrollEvent(), _stepTimestamp());
			else pool.postEvent(factory.createKeyExploreEvent(0), _stepTimestamp());
		}

		_log("______________________________uf");

		///
		/// 2. action
		if (_prob(prob_action)){
			// gui input elements
			for (int i=0; i < _random(5); i++){
				if (_prob(70)) 
					pool.postEvent(factory.createTouchEvent(), _stepTimestamp());
				else 
					pool.postEvent(factory.createScrollEvent(), _stepTimestamp());
			}

			for (int i=0; i < _random(30); i++){
				if (_prob(45)) pool.postEvent(factory.createKeyTextEvent(0), _stepTimestamp());
				else if (_prob(90)) 
					pool.postEvent(factory.createKeyExploreEvent(0), _stepTimestamp());
				else
					pool.postEvent(factory.createKeyCommandEvent(0), _stepTimestamp());
			}

			for (int i=0; i < _random(5) + 1; i++){
				if (_prob(70)) 
					pool.postEvent(factory.createTouchEvent(), _stepTimestamp());
				else 
					pool.postEvent(factory.createScrollEvent(), _stepTimestamp());
			}
			//pool.postEvent(factory.createClickEvent(), _random());
		}
		else{
			// at least one action
			pool.postEvent(factory.createTouchEvent(), _stepTimestamp());
		}

		_log("______________________________ua");

		///
		/// 3. user metacomm
		if (_prob(prob_metacomm)) pool.postEvent(factory.createHelpTurnEvent(), _stepTimestamp());
		else if (_prob(prob_metacomm*2)) pool.postEvent(factory.createCorrectionTurnEvent(), _stepTimestamp());
		else if (_prob(prob_metacomm*4)) pool.postEvent(factory.createTimeoutEvent(), _stepTimestamp());
		else if (_prob(prob_metacomm*8)) pool.postEvent(factory.createCancelTurnEvent(), _stepTimestamp());
		else if (_prob(prob_metacomm*16)) pool.postEvent(factory.createRestartTurnEvent(), _stepTimestamp());
		else if (_prob(prob_metacomm*16)) pool.postEvent(factory.createBargeinEvent(_randomBool()), _stepTimestamp());


		_log("______________________________um");

		///
		/// 4. context

		// user
		if (_prob(prob_context)) pool.postEvent(factory.createUserDataUpdateEvent(16 + _random(50), 
				GenderT.MALE , EducationLevelT.COLLEGE, PreviousExperienceT.HIGH), 
				_stepTimestamp());
		// physical
		if (_prob(prob_context)){
			pool.postEvent(factory.createWeatherUpdateEvent(_random(40), WeatherT.CLOUDY), 
					_stepTimestamp());
			pool.postEvent(factory.createAmbientUpdateEvent(_random(100),_random(100)), 
					_stepTimestamp());
		}
		// social
		if (_prob(prob_context)){
			pool.postEvent(factory.createSocialUpdateEvent(SocialCompanyT.WITHAPERSON, SocialArenaT.WORK), 
					_stepTimestamp());
		}
		// location/time
		if (_prob(prob_context)){
			pool.postEvent(factory.createLocationUpdateEvent(LocationT.OFFICESCHOOL, 
					(double)_randomSign(_random(90)), (double)_randomSign(_random(180))), 
					_stepTimestamp());
			pool.postEvent(factory.createTimeUpdateEvent(
					_getCalendar().getYear(),_getCalendar().getMonth(),_getCalendar().getDay(),
					_getCalendar().getHour(),_getCalendar().getMinute(),_getCalendar().getSecond()), 
					_stepTimestamp());
		}
		// device
		if (_prob(prob_context)){
			pool.postEvent(factory.createDeviceFeaturesUpdateEvent(DeviceTypeT.SMARTPHONE,
					ScreenSizeT.SMALL_LET4IN, ScreenResolutionT.SMALL_LET480X800), 
					_stepTimestamp());
			pool.postEvent(factory.createDeviceRunningFeaturesUpdateEvent(ScreenOrientationT.LANDSCAPE,
					_random(100), _random(100)),
					_stepTimestamp());
			pool.postEvent(factory.createDeviceWorkloadUpdateEvent(_random(100), _random(100)),
					_stepTimestamp());
		}
		// communication
		if (_prob(prob_context)){ 
			pool.postEvent(factory.createSignalUpdateEvent(WirelessAccessTypeT.MOBILE,
					"accessPointName", _random(100)), 
					_stepTimestamp());
			pool.postEvent(factory.createThroughputUpdateEvent(_random(1000), _random(300)), 
					_stepTimestamp());
			pool.postEvent(factory.createServerResponseUpdateEvent(_random(3000), _random(3000)), 
					_stepTimestamp());
		}

		// speech input
		//pool.postEvent(factory.createOverallWordsEvent(n), _random());
		//pool.postEvent(factory.createSubstitutedWordsEvent(n), _random());
		//pool.postEvent(factory.createDeletedWordsEvent(n), _random());
		//pool.postEvent(factory.createInsertedWordsEvent(n), _random());
		//pool.postEvent(factory.createOverallSentencesEvent(n), _random());
		//pool.postEvent(factory.createSubstitutedSentencesEvent(n), _random());
		//pool.postEvent(factory.createDeletedSentencesEvent(n), _random());
		//pool.postEvent(factory.createInsertedSentencesEvent(n), _random());
		//pool.postEvent(factory.createOverallConceptsEvent(n), _random());
		//pool.postEvent(factory.createSubstitutedConceptsEvent(n), _random());
		//pool.postEvent(factory.createDeletedConceptsEvent(n), _random());
		//pool.postEvent(factory.createInsertedConceptsEvent(n), _random());
	}

	private static void _doTimedSystemTurn(EventPool pool, MmiEventsFactory factory){

		///
		/// duration: 1000 ms
		///  - response: 200
		///  - feedback: 300 / 10 elements
		///  - action: 500 / 20 elements


		_sleep(200);
		
		///
		/// 1. feedback
		pool.postEvent(factory.createGuiFeedbackEvent(10));
		_sleep(300);
		
		///
		/// 2. action
		pool.postEvent(factory.createGuiElementsEvent(10));
		_sleep(500);
		pool.postEvent(factory.createGuiElementsEvent(10));
		

	}

	private static void _doTimedUserTurn(EventPool pool, MmiEventsFactory factory){

		///
		/// duration: 2000 ms
		///  - response: 400
		///  - feedback: 600 / 1 element
		///  - action: 1000 / 5 elements

		_sleep(400);
		
		///
		/// 1. feedback
		pool.postEvent(factory.createScrollEvent());
		_sleep(600);
		pool.postEvent(factory.createKeyExploreEvent(0));

		///
		/// 2. action
		pool.postEvent(factory.createTouchEvent());
		pool.postEvent(factory.createScrollEvent());
		pool.postEvent(factory.createKeyTextEvent(0));
		pool.postEvent(factory.createKeyExploreEvent(0));
		pool.postEvent(factory.createKeyCommandEvent(0));
		_sleep(1000);
		pool.postEvent(factory.createTouchEvent());
	}

	private static void _log(String s){
		System.out.println(s);
	}

	private static int _random(int range){
		return randomGenerator.nextInt(range);
	}

	private static int timestamp_ms = 0;
	private static int _nextTimestamp(){
		return timestamp_ms += randomGenerator.nextInt(5000);
	}

	private static int _stepTimestamp(){
		return timestamp_ms += randomGenerator.nextInt(100);
	}

	private static int _sameTimestamp(){
		return timestamp_ms;
	}

	private static boolean _prob(int prob){
		return randomGenerator.nextInt(100) < prob;
	}

	private static boolean _randomBool(){
		return randomGenerator.nextBoolean();
	}

	private static int _randomSign(int value){
		if (_prob(50)) return value * -1;
		return value;
	}

	private static XMLGregorianCalendar _getCalendar(){
		GregorianCalendar gCalendar = new GregorianCalendar();
		gCalendar.setTime(new Date());
		XMLGregorianCalendar xmlCalendar = null;
		try {
			xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(gCalendar);
		} catch (DatatypeConfigurationException ex) {
			ex.printStackTrace();
		}
		return xmlCalendar;
	}

	////////
	////////

	private static void _sleep(int ms){
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void _saveTrialRandom(CarimInstantiationFramework ifram){

		_log("");
		_log("Trial saved:");
		_log(" - simulated dialogues: " + DIALOGUES_TO_SIMULATE);
		int total_dialogues = ifram.instantiator.icontext_.getTrial().getDialogues().size();
		_log(" - infile dialogues: " + total_dialogues);
		for (int i = 0; i < total_dialogues; i++){
			_log("    - dialogue " + i + " - steps = " + 
					ifram.instantiator.icontext_.getTrial().getDialogues().get(i).getStep().size());
		}
		_log("");
		_log("");
		_log("");

		ifram.saveTrial("/tmp/aa_trial");// + _random(10));
	}


}
