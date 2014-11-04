package org.pedromateo.umulandertest2;


import java.util.Calendar;
import java.util.Date;

import org.carim.instantiation.CarimInstantiationFramework;
import org.carim.model.Dialogue;
import org.carim.model.Trial;
import org.mmi.android.instrumentation.ContextDescription;
import org.mmi.android.instrumentation.ContextDescription.Communication.WirelessAccessType;
import org.mmi.android.instrumentation.ContextDescription.Device.DeviceType;
import org.mmi.android.instrumentation.ContextDescription.Device.ScreenOrientation;
import org.mmi.android.instrumentation.ContextDescription.Device.ScreenResolution;
import org.mmi.android.instrumentation.ContextDescription.Device.ScreenSize;
import org.mmi.android.instrumentation.MmiFacade;
import org.mmi.android.instrumentation.ContextDescription.SocialContext.SocialArena;
import org.mmi.android.instrumentation.ContextDescription.SocialContext.SocialCompany;
import org.mmi.android.instrumentation.ContextDescription.User.EducationLevel;
import org.mmi.android.instrumentation.ContextDescription.User.Gender;
import org.mmi.android.instrumentation.ContextDescription.User.PreviousExperience;
import org.mmi.events.Event;
import org.mmi.events.factory.MmiEventsFactory;
import org.mmi.events.pool.EventPool;

import android.location.Location;
import android.util.Log;

public class AHE16Facade implements MmiFacade {

	///
	/// variables
	private CarimInstantiationFramework _instantiator;
	private EventPool _pool;
	private MmiEventsFactory _factory;

	/**
	 * Constructor
	 */
	public AHE16Facade(CarimInstantiationFramework cif) {
		//TODO
		_instantiator = cif;
		_pool = _instantiator.pool;
		_factory = _instantiator.factory;
	}

	/**
	 * Dumps the current dialogue to a XML file.
	 * @param filename the file name
	 */
	public void saveTrial(String filename){
		_instantiator.saveTrial(filename);
	}

	/**
	 * Returns the current --or already recorded-- dialogue instance.
	 * @return the dialogue object
	 */
	public Dialogue getCurrentDialogue(){
		return _instantiator.getCurrentDialogue();
	}

	/**
	 * Returns the current --or already recorded-- document-root
	 * object useful to manage XML features.
	 * @return the document-root object
	 */
	public Trial getCurrentTrial(){
		return _instantiator.getCurrentTrial();
	}


	///
	/// ////////////////////////////////////////////
	///
	/// application timing methods 
	/// (ignored in this project because these events
	///  are created automatically by internal listeners)
	///
	/// ////////////////////////////////////////////
	///

	///
	/// dialogue
	///

	/**
	 * Method called to notify interaction start.
	 * @param ms milliseconds (set 0 to use factory timestamps)
	 */
	public void interactionStarts(long ms) {
		//create appStart event
		//_pool.postEvent(_factory.createAppStartEvent(), -1); // -1 uses factory timestamp
	}

	/**
	 * Method called to notify interaction end.
	 * @param ms milliseconds (set 0 to use factory timestamps)
	 */
	public void interactionEnds(long ms) {
		//_pool.postEvent(_factory.createAppEndEvent(), -1); // -1 uses factory timestamp
	}

	///
	/// system turn
	///

	/**
	 * Method called to notify system turn start.
	 * @param ms milliseconds (set 0 to use factory timestamps)
	 */
	public void systemTurnStarts(long ms){
		//_pool.postEvent(_factory.createStartSystemTurnEvent(), -1); // -1 uses factory timestamp
	}

	/**
	 * Method called to notify system feedback start.
	 * @param ms milliseconds (set 0 to use factory timestamps)
	 */
	public void systemFeedbackStarts(long ms){
		//_pool.postEvent(_factory.createSystemFeedbackStartEvent(), -1); // -1 uses factory timestamp
	}

	/**
	 * Method called to notify system action start.
	 * @param ms milliseconds (set 0 to use factory timestamps)
	 */
	public void systemActionStarts(long ms){
		//_pool.postEvent(_factory.createSystemActionStartEvent(), -1); // -1 uses factory timestamp
	}

	/**
	 * Method called to notify system action end.
	 * @param ms milliseconds (set 0 to use factory timestamps)
	 */
	public void systemActionEnds(long ms){
		//_pool.postEvent(_factory.createSystemActionEndEvent(), -1); // -1 uses factory timestamp
	}

	/**
	 * Method called to notify system turn end.
	 * @param ms milliseconds (set 0 to use factory timestamps)
	 */
	public void systemTurnEnds(long ms){
		//_pool.postEvent(_factory.createEndSystemTurnEvent(), -1); // -1 uses factory timestamp
	}

	///
	/// user turn
	///

	/**
	 * Method called to notify user turn start.
	 * @param ms milliseconds (set 0 to use factory timestamps)
	 */
	public void userTurnStarts(long ms){
		//_pool.postEvent(_factory.createStartUserTurnEvent(), -1); // -1 uses factory timestamp
	}

	/**
	 * Method called to notify user feedback start.
	 * @param ms milliseconds (set 0 to use factory timestamps)
	 */
	public void userFeedbackStarts(long ms){
		//_pool.postEvent(_factory.createUserFeedbackStartEvent(), -1); // -1 uses factory timestamp
	}

	/**
	 * Method called to notify user action start.
	 * @param ms milliseconds (set 0 to use factory timestamps)
	 */
	public void userActionStarts(long ms){
		//_pool.postEvent(_factory.createUserActionStartEvent(), -1); // -1 uses factory timestamp
	}

	/**
	 * Method called to notify user action end.
	 * @param ms milliseconds (set 0 to use factory timestamps)
	 */
	public void userActionEnds(long ms){
		//_pool.postEvent(_factory.createUserActionEndEvent(), -1); // -1 uses factory timestamp
	}

	/**
	 * Method called to notify user turn end.
	 * @param ms milliseconds (set 0 to use factory timestamps)
	 */
	public void userTurnEnds(long ms){
		//_pool.postEvent(_factory.createEndUserTurnEvent(), -1); // -1 uses factory timestamp
	}


	///
	/// ////////////////////////////////////////////
	///
	/// gui input methods
	///
	/// ////////////////////////////////////////////
	///

	/**
	 * This method should be called on touch event
	 * @param ms timestamp
	 */
	public void touch(long ms) {
		_pool.postEvent(_factory.createTouchEvent(), -1); // -1 uses factory timestamp
	}

	/**
	 * This method should be called on click event
	 * @param ms timestamp
	 */
	public void click(long ms) {
		_pool.postEvent(_factory.createClickEvent(), -1); // -1 uses factory timestamp
	}

	/**
	 * This method should be called on scroll event
	 * @param ms timestamp
	 */
	public void scroll(long ms) {
		_pool.postEvent(_factory.createScrollEvent(), -1); // -1 uses factory timestamp
	}

	/**
	 * This method should be called on key-text (e.g. the "a"
	 * character) event
	 * @param ms timestamp
	 */
	public void keytext(long ms) {
		_pool.postEvent(_factory.createKeyTextEvent(0), -1); // -1 uses factory timestamp
	}

	/**
	 * This method should be called on key-command (e.g. the
	 * "return" key) event
	 * @param ms timestamp
	 */
	public void keycommand(long ms) {
		_pool.postEvent(_factory.createKeyCommandEvent(0), -1); // -1 uses factory timestamp
	}

	/**
	 * This method should be called on key-explore (e.g. down
	 * arrow) event
	 * @param ms timestamp
	 */
	public void keyexplore(long ms) {
		_pool.postEvent(_factory.createKeyExploreEvent(0), -1); // -1 uses factory timestamp
	}

	///
	/// ////////////////////////////////////////////
	///
	/// speech input methods
	///
	/// ////////////////////////////////////////////
	///


	/// words

	/**
	 * Method called when user speech input. This method is used
	 * for words.
	 * @param ms timestamp
	 * @param n number of elements
	 */
	public void overallWords(long ms, int n) {
		_pool.postEvent(_factory.createOverallWordsEvent(n), -1); // -1 uses factory timestamp
	}

	/**
	 * Method called when user speech input. This method is used
	 * for words.
	 * @param ms timestamp
	 * @param n number of elements
	 */
	public void substitutedWords(long ms, int n) {
		_pool.postEvent(_factory.createSubstitutedWordsEvent(n), -1); // -1 uses factory timestamp
	}

	/**
	 * Method called when user speech input. This method is used
	 * for words.
	 * @param ms timestamp
	 * @param n number of elements
	 */
	public void deletedWords(long ms, int n) {
		_pool.postEvent(_factory.createDeletedWordsEvent(n), -1); // -1 uses factory timestamp
	}

	/**
	 * Method called when user speech input. This method is used
	 * for words.
	 * @param ms timestamp
	 * @param n number of elements
	 */
	public void insertedWords(long ms, int n) {
		_pool.postEvent(_factory.createInsertedWordsEvent(n), -1); // -1 uses factory timestamp
	}

	/// sentences

	/**
	 * Method called when user speech input. This method is used
	 * for sentences.
	 * @param ms timestamp
	 * @param n number of elements
	 */
	public void overallSentences(long ms, int n) {
		_pool.postEvent(_factory.createOverallSentencesEvent(n), -1); // -1 uses factory timestamp
	}

	/**
	 * Method called when user speech input. This method is used
	 * for sentences.
	 * @param ms timestamp
	 * @param n number of elements
	 */
	public void substitutedSentences(long ms, int n) {
		_pool.postEvent(_factory.createSubstitutedSentencesEvent(n), -1); // -1 uses factory timestamp
	}

	/**
	 * Method called when user speech input. This method is used
	 * for sentences.
	 * @param ms timestamp
	 * @param n number of elements
	 */
	public void deletedSentences(long ms, int n) {
		_pool.postEvent(_factory.createDeletedSentencesEvent(n), -1); // -1 uses factory timestamp
	}

	/**
	 * Method called when user speech input. This method is used
	 * for sentences.
	 * @param ms timestamp
	 * @param n number of elements
	 */
	public void insertedSentences(long ms, int n) {
		_pool.postEvent(_factory.createInsertedSentencesEvent(n), -1); // -1 uses factory timestamp
	}

	/// concepts

	/**
	 * Method called when user speech input. This method is used
	 * for concepts.
	 * @param ms timestamp
	 * @param n number of elements
	 */
	public void overallConcepts(long ms, int n) {
		_pool.postEvent(_factory.createOverallConceptsEvent(n), -1); // -1 uses factory timestamp
	}

	/**
	 * Method called when user speech input. This method is used
	 * for concepts.
	 * @param ms timestamp
	 * @param n number of elements
	 */
	public void substitutedConcepts(long ms, int n) {
		_pool.postEvent(_factory.createSubstitutedConceptsEvent(n), -1); // -1 uses factory timestamp
	}

	/**
	 * Method called when user speech input. This method is used
	 * for concepts.
	 * @param ms timestamp
	 * @param n number of elements
	 */
	public void deletedConcepts(long ms, int n) {
		_pool.postEvent(_factory.createDeletedConceptsEvent(n), -1); // -1 uses factory timestamp
	}

	/**
	 * Method called when user speech input. This method is used
	 * for concepts.
	 * @param ms timestamp
	 * @param n number of elements
	 */
	public void insertedConcepts(long ms, int n) {
		_pool.postEvent(_factory.createInsertedConceptsEvent(n), -1); // -1 uses factory timestamp
	}

	///
	/// parsing results
	///

	/**
	 * Method called when user speech input to indicate a
	 * parsing result.
	 * @param ms timestamp
	 */
	public void correctlyParsedUtterance(long ms) {
		_pool.postEvent(_factory.createCorrectlyParsedUtteranceEvent(), -1); // -1 uses factory timestamp
	}

	/**
	 * Method called when user speech input to indicate a
	 * parsing result.
	 * @param ms timestamp
	 */
	public void partiallyParsedUtterance(long ms) {
		_pool.postEvent(_factory.createPartiallyParsedUtteranceEvent(), -1); // -1 uses factory timestamp
	}

	/**
	 * Method called when user speech input to indicate a
	 * parsing result.
	 * @param ms timestamp
	 */
	public void incorrectlyParsedUtterance(long ms) {
		_pool.postEvent(_factory.createIncorrectlyParsedUtteranceEvent(), -1); // -1 uses factory timestamp
	}

	///
	/// ////////////////////////////////////////////
	///
	/// motion input methods
	///
	/// ////////////////////////////////////////////
	///

	/**
	 * Method called when user do a motion-tilt.
	 * @param ms timestamp
	 */
	public void tilt(long ms){
		_pool.postEvent(_factory.createTiltEvent(), -1); // -1 uses factory timestamp
	}

	/**
	 * Method called when user do a motion-twist.
	 * @param ms timestamp
	 */
	public void twist(long ms){
		_pool.postEvent(_factory.createTwistEvent(), -1); // -1 uses factory timestamp
	}

	/**
	 * Method called when user do a motion-shake.
	 * @param ms timestamp
	 */
	public void shake(long ms){
		_pool.postEvent(_factory.createShakeEvent(), -1); // -1 uses factory timestamp
	}

	///
	/// ////////////////////////////////////////////
	///
	/// gui output
	///
	/// ////////////////////////////////////////////
	///

	/**
	 * Method called when system GUI output.
	 * @param ms timestamp
	 * @param n elements
	 */
	public void newGuiElements(long ms, int n)  {
		_pool.postEvent(_factory.createGuiElementsEvent(n), -1); // -1 uses factory timestamp
	}

	/**
	 * Method called when system GUI output.
	 * @param ms timestamp
	 * @param n elements
	 */
	public void newGuiFeedback(long ms, int n)  {
		_pool.postEvent(_factory.createGuiFeedbackEvent(n), -1); // -1 uses factory timestamp
	}

	/**
	 * Method called when system GUI output.
	 * @param ms timestamp
	 * @param n elements
	 */
	public void newGuiNoise(long ms, int n)  {
		_pool.postEvent(_factory.createGuiNoiseEvent(n), -1); // -1 uses factory timestamp
	}

	/**
	 * Method called when system GUI output.
	 * @param ms timestamp
	 * @param n elements
	 */
	public void newGuiQuestions(long ms, int n)  {
		_pool.postEvent(_factory.createGuiQuestionsEvent(n), -1); // -1 uses factory timestamp
	}

	/**
	 * Method called when system GUI output.
	 * @param ms timestamp
	 * @param n elements
	 */
	public void newGuiConcepts(long ms, int n)  {
		_pool.postEvent(_factory.createGuiConceptsEvent(n), -1); // -1 uses factory timestamp
	}



	///
	/// ////////////////////////////////////////////
	///
	/// speech output
	///
	/// ////////////////////////////////////////////
	///

	/**
	 * Method called when system speech output.
	 * @param ms timestamp
	 * @param n elements
	 */
	public void newSpeechElements(long ms, int n)  {
		_pool.postEvent(_factory.createSpeechElementsEvent(n), -1); // -1 uses factory timestamp
	}

	/**
	 * Method called when system speech output.
	 * @param ms timestamp
	 * @param n elements
	 */
	public void newSpeechFeedback(long ms, int n)  {
		_pool.postEvent(_factory.createSpeechFeedbackEvent(n), -1); // -1 uses factory timestamp
	}

	/**
	 * Method called when system speech output.
	 * @param ms timestamp
	 * @param n elements
	 */
	public void newSpeechNoise(long ms, int n)  {
		_pool.postEvent(_factory.createSpeechNoiseEvent(n), -1); // -1 uses factory timestamp
	}

	/**
	 * Method called when system speech output.
	 * @param ms timestamp
	 * @param n elements
	 */
	public void newSpeechQuestions(long ms, int n)  {
		_pool.postEvent(_factory.createSpeechQuestionsEvent(n), -1); // -1 uses factory timestamp
	}

	/**
	 * Method called to denote the prompt type
	 * @param ms timestamp
	 * @param type prompt type
	 */
	public void newPromptType(long ms, PromptType type) {

		Event promptEvent = null;
		switch(type) {
		case PROMPT_CLOSED:
			promptEvent = _factory.createClosedPromptEvent();
			break;
		case PROMPT_HALFOPEN:
			promptEvent = _factory.createHalfOpenPromptEvent();
			break;
		case PROMPT_NOQUESTION:
			promptEvent = _factory.createNoQuestionPromptEvent();
			break;
		case PROMPT_OPEN:
			promptEvent = _factory.createOpenPromptEvent();
			break;
		default:
			//do nothing, leave promptEvent null because there is no default type for prompt
			break;
		}

		_pool.postEvent(promptEvent, -1); // -1 uses factory timestamp
	}

	/**
	 * Method called when system speech output.
	 * @param ms timestamp
	 * @param n elements
	 */
	public void newSpeechConcepts(long ms, int n)  {
		_pool.postEvent(_factory.createSpeechConceptsEvent(n), -1); // -1 uses factory timestamp
	}

	///
	/// ////////////////////////////////////////////
	///
	/// metacomm
	///
	/// ////////////////////////////////////////////
	///

	///
	/// general
	///

	/**
	 * Method called when metacommunication data is
	 * collected. This one is called when a help turn.
	 * @param ms timestamp
	 */
	public void isHelpTurn(long ms)  {
		_pool.postEvent(_factory.createHelpTurnEvent(), -1); // -1 uses factory timestamp
	}

	/**
	 * Method called when metacommunication data is
	 * collected. This one is called when a correction turn.
	 * @param ms timestamp
	 */
	public void isCorrectionTurn(long ms)  {
		_pool.postEvent(_factory.createCorrectionTurnEvent(), -1); // -1 uses factory timestamp
	}

	///
	/// system
	///

	/**
	 * Method called when system metacommunication data is
	 * collected. This one is called when an ASR rejection.
	 * @param ms timestamp
	 */
	public void isASRRejection(long ms)  {
		_pool.postEvent(_factory.createASRRejectionEvent(), -1); // -1 uses factory timestamp
	}

	/**
	 * Method called when system metacommunication data is
	 * collected. This one is called when a DIV rejection.
	 * @param ms timestamp
	 */
	public void isDIVRejection(long ms)  {
		_pool.postEvent(_factory.createDIVRejectionEvent(), -1); // -1 uses factory timestamp
	}

	/**
	 * Method called when system metacommunication data is
	 * collected. This one is called when a GR rejection.
	 * @param ms timestamp
	 */
	public void isGRRejection(long ms)  {
		_pool.postEvent(_factory.createGRRejectionEvent(), -1); // -1 uses factory timestamp
	}

	///
	/// user
	///

	/**
	 * Method called when user metacommunication data is
	 * collected. This one is called when a timeout.
	 * @param ms timestamp
	 */
	public void isTimeout(long ms)  {
		_pool.postEvent(_factory.createTimeoutEvent(), -1); // -1 uses factory timestamp
	}

	/**
	 * Method called when user metacommunication data is
	 * collected. This one is called when a cancel intent.
	 * @param ms timestamp
	 */
	public void isCancel(long ms)  {
		_pool.postEvent(_factory.createCancelTurnEvent(), -1); // -1 uses factory timestamp
	}

	/**
	 * Method called when user metacommunication data is
	 * collected. This one is called when a restart intent.
	 * @param ms timestamp
	 */
	public void isRestart(long ms)  {
		_pool.postEvent(_factory.createRestartTurnEvent(), -1); // -1 uses factory timestamp
	}

	/**
	 * Method called when user metacommunication data is
	 * collected. This one is called when a bargein.
	 * @param ms timestamp
	 * @param success result of bargein
	 */
	public void isBargein(long ms, boolean success)  {
		_pool.postEvent(_factory.createBargeinEvent(success), -1); // -1 uses factory timestamp
	}

	///
	/// ////////////////////////////////////////////
	///
	/// context update methods
	///
	/// ////////////////////////////////////////////
	///


	/**
	 * This method should be called on physical context change
	 * @param temperature
	 * @param weather
	 * @param noise
	 * @param light
	 */
	public void physicalContextChange(long ms, 
			int temperature, 
			ContextDescription.PhysicalEnvironment.Weather weather, 
			int noise, 
			int light){

		_pool.postEvent(_factory.createWeatherUpdateEvent(temperature, 
				AHE16ToCarimConverter.convert(weather)), -1); // -1 uses factory timestamp
		_pool.postEvent(_factory.createAmbientUpdateEvent(noise, light), -1); // -1 uses factory timestamp

		//_log("Physical Context update:");
		//_log(" - temperature - " + temperature);
		//_log(" - weather - " + weather.toString());
		//_log(" - noise - " + noise);
		//_log(" - light - " + light);
	}

	/**
	 * This method should be called on user context change
	 * @param age
	 * @param gender
	 * @param educationLevel
	 * @param previousExperience
	 */
	public void userContextChange(long ms, 
			int age, 
			Gender gender,
			EducationLevel educationLevel,
			PreviousExperience previousExperience){

		_pool.postEvent(_factory.createUserDataUpdateEvent(age, 
				AHE16ToCarimConverter.convert(gender), 
				AHE16ToCarimConverter.convert(educationLevel), 
				AHE16ToCarimConverter.convert(previousExperience)), -1); // -1 uses factory timestamp

		//_log("User Context update:");
		//_log(" - age - " + age);
		//_log(" - gender - " + gender.toString());
		//_log(" - education level - " + educationLevel.toString());
		//_log(" - previous experience - " + previousExperience.toString());
	}

	/**
	 * This method should be called on social context change
	 * @param company
	 * @param arena
	 */
	public void socialContextChange(long ms, 
			SocialCompany company,
			SocialArena arena){

		_pool.postEvent(_factory.createSocialUpdateEvent(
				AHE16ToCarimConverter.convert(company), 
				AHE16ToCarimConverter.convert(arena)), 
				-1); // -1 uses factory timestamp

		//_log("Social Context update:");
		//_log(" - company - " + company.toString());
		//_log(" - arena - " + arena.toString());
	}


	/**
	 * This method should be called on time context change
	 * @param currentTime
	 */
	public void timeContextChange(long ms, 
			Calendar currentTime){
		_pool.postEvent(_factory.createTimeUpdateEvent(
				currentTime.get(Calendar.YEAR),currentTime.get(Calendar.MONTH) + 1,currentTime.get(Calendar.DAY_OF_MONTH),
				currentTime.get(Calendar.HOUR_OF_DAY),currentTime.get(Calendar.MINUTE),currentTime.get(Calendar.SECOND)), -1); // -1 uses factory timestamp

		//_log(" - currentTime - " + currentTime);
	}
	
	/**
	 * This method should be called on location context change
	 * @param location
	 * @param geoLocation
	 * @param mobilityLevel
	 */
	public void locationContextChange(long ms, 
			ContextDescription.LocationTime.UserLocation location,
			Location geoLocation,
			ContextDescription.LocationTime.MobilityLevel mobilityLevel){

		_pool.postEvent(_factory.createLocationUpdateEvent(
				AHE16ToCarimConverter.convert(location), 
				geoLocation.getLatitude(), geoLocation.getLongitude()), 
				-1); // -1 uses factory timestamp
		_pool.postEvent(_factory.createMobilityUpdateEvent(
				AHE16ToCarimConverter.convert(mobilityLevel)), -1); // -1 uses factory timestamp
	
		//_log("Location/time Context update:");
		//_log(" - location - " + location.toString());
		//_log(" - geoLocation - " + geoLocation);
		//_log(" - mobilityLevel - " + mobilityLevel.toString());
	}


	@Override
	public void deviceContextChange(long ms, DeviceType deviceType,
			ScreenSize screenSize, ScreenResolution screenResolution,
			ScreenOrientation screenOrientation, int screenBrightnessLevel,
			int volumeLevel, int memoryLoad, int cpuLoad) {

		_pool.postEvent(_factory.createDeviceFeaturesUpdateEvent(
				AHE16ToCarimConverter.convert(deviceType), 
				AHE16ToCarimConverter.convert(screenSize), 
				AHE16ToCarimConverter.convert(screenResolution)), 
				-1); // -1 uses factory timestamp
		_pool.postEvent(_factory.createDeviceRunningFeaturesUpdateEvent(
				AHE16ToCarimConverter.convert(screenOrientation), 
				screenBrightnessLevel, volumeLevel), -1); // -1 uses factory timestamp
		_pool.postEvent(_factory.createDeviceWorkloadUpdateEvent(memoryLoad, cpuLoad), -1); // -1 uses factory timestamp

		//_log("Device Context update:");
		//_log(" - deviceType - " + deviceType.toString());
		//_log(" - screenSize - " + screenSize.toString());
		//_log(" - screenResolution - " + screenResolution.toString());
		//_log(" - screenOrientation - " + screenOrientation.toString());
		//_log(" - screenBrightnessLevel (%) - " + screenBrightnessLevel);
		//_log(" - volumeLevel (%) - " + volumeLevel);
		//_log(" - memoryLoad (%) - " + memoryLoad);
		//_log(" - cpuLoad (%) - " + cpuLoad);
	}


	@Override
	public void communicationContextChange(long ms, 
			WirelessAccessType wirelessAccessType, String accessPointName,
			int signalStrength, int receivedDataThroughput,
			int sentDataThroughput, int rtt, int srt) {

		_pool.postEvent(_factory.createSignalUpdateEvent(
				AHE16ToCarimConverter.convert(wirelessAccessType), 
				accessPointName, signalStrength), -1); // -1 uses factory timestamp
		_pool.postEvent(_factory.createThroughputUpdateEvent(receivedDataThroughput, sentDataThroughput), -1); // -1 uses factory timestamp
		_pool.postEvent(_factory.createServerResponseUpdateEvent(rtt, srt), -1); // -1 uses factory timestamp

		//_log("Communication Context update:");
		//_log(" - wirelessAccessType - " + wirelessAccessType.toString());
		//_log(" - accessPointName - " + accessPointName);
		//_log(" - signalStrength - " + signalStrength);
		//_log(" - receivedDataThroughput - " + receivedDataThroughput);
		//_log(" - sentDataThroughput - " + sentDataThroughput);
		//_log(" - rtt - " + rtt);
		//_log(" - srt - " + srt);

	}


	private void _log(String s){
		System.out.println(s);
	}

}
