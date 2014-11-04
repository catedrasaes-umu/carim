package org.mmi.model.instantiator.detail;


import org.carim.model.CommunicationContext;
import org.carim.model.DateTimeT;
import org.carim.model.DeviceContext;
import org.carim.model.DeviceTypeT;
import org.carim.model.DynamicContext;
import org.carim.model.LocationT;
import org.carim.model.LocationTimeContext;
import org.carim.model.MobilityLevelT;
import org.carim.model.PhysicalContext;
import org.carim.model.ScreenOrientationT;
import org.carim.model.ScreenResolutionT;
import org.carim.model.ScreenSizeT;
import org.carim.model.SocialArenaT;
import org.carim.model.SocialCompanyT;
import org.carim.model.SocialContext;
import org.carim.model.WeatherT;
import org.carim.model.WirelessAccessTypeT;
import org.mmi.model.instantiator.InstantiationContext;
import org.mmi.model.instantiator.InstantiatorBase;
import org.apache.log4j.Logger;


public class DynamicContextInstantiator extends InstantiatorBase{

	public DynamicContextInstantiator(InstantiationContext c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	final Logger LOG = Logger.getLogger(DynamicContextInstantiator.class);

	// WEATHERUPDATE_VALUE = 801;
	public void updateWeather(int temperature, WeatherT weather){
		try{
			// create a new object if needed (already created)
			// fill the object
			_physicalContext().setTemperature(temperature);
			_physicalContext().setWeather(weather);
		}
		catch (NullPointerException e){
			// current turn may be null, support it here
			_storeUpdateWeather(temperature,weather);
		}
	}

	// AMBIENTUPDATE_VALUE = 802;
	public void updateAmbient(int noise, int light){
		try{
			// create a new object if needed (already created)
			// fill the object
			_physicalContext().setNoise(noise);
			_physicalContext().setLight(light);
		}
		catch (NullPointerException e){
			// current turn may be null, support it here
			_storeUpdateAmbient(noise, light);
		}
	}

	// SOCIALUPDATE_VALUE = 821;
	public void updateSocial(SocialCompanyT socialCompany,
			SocialArenaT socialArena){
		try{
			// create a new object if needed (already created)
			// fill the object
			_socialContext().setCompany(socialCompany);
			_socialContext().setArena(socialArena);
		}
		catch (NullPointerException e){
			// current turn may be null, support it here
			_storeUpdateSocial(socialCompany, socialArena);
		}
	}

	// LOCATIONUPDATE_VALUE = 831;
	public void updateLocation(LocationT userLocation,
			double geo_latitude, double geo_longitude){
		try{
			// create a new object if needed (already created)
			// fill the object
			_locationTimeContext().setLocation(userLocation);
			_locationTimeContext().setGeoLatitude(geo_latitude);
			_locationTimeContext().setGeoLongitude(geo_longitude);
		}
		catch (NullPointerException e){
			// current turn may be null, support it here
			_storeUpdateLocation(userLocation, geo_latitude, geo_longitude);
		}
	}

	// MOBILITYUPDATE_VALUE = 832;
	public void updateMobility(MobilityLevelT mobilityLevel){
		try{
			// create a new object if needed (already created)
			// fill the object
			_locationTimeContext().setMobilityLevel(mobilityLevel);
		}
		catch (NullPointerException e){
			// current turn may be null, support it here
			_storeUpdateMobility(mobilityLevel);
		}
	}

	// TIMEUPDATE_VALUE = 833;
	public void updateTime(int year, int month, int day,
			int hours, int mins, int secs){
		try{
			DateTimeT currentTime = icontext_.mfact.createDateTimeT();
			currentTime.setDYear(year);
			currentTime.setDMonth(month);
			currentTime.setDDay(day);
			currentTime.setTHours(hours);
			currentTime.setTMins(mins);
			currentTime.setTSecs(secs);
			// create a new object if needed (already created)
			// fill the object
			_locationTimeContext().setTime(currentTime);
		}
		catch (NullPointerException e){
			// current turn may be null, support it here
			_storeUpdateTime(year, month, day, hours, mins, secs);
		}
	}

	// DEVICEFEATURESUPDATE_VALUE = 841;
	public void updateDeviceFeatures(DeviceTypeT deviceType,
			ScreenSizeT screenSize, ScreenResolutionT screenResolution){
		try{
			// create a new object if needed (already created)
			// fill the object
			_deviceContext().setDeviceType(deviceType);
			_deviceContext().setScreenSize(screenSize);
			_deviceContext().setScreenResolution(screenResolution);
		}
		catch (NullPointerException e){
			// current turn may be null, support it here
			_storeUpdateDeviceFeatures(deviceType, screenSize, screenResolution);
		}
	}

	// DEVICERUNNINGFEATURESUPDATE_VALUE = 842;
	public void updateDeviceRunningFeatures(ScreenOrientationT screenOrientation,
			int screenBrightnessLevel, int volumeLevel){
		try{
			// create a new object if needed (already created)
			// fill the object
			_deviceContext().setScreenOrientation(screenOrientation);
			_deviceContext().setScreenBrightnessLevel(screenBrightnessLevel);
			_deviceContext().setVolumeLevel(volumeLevel);
		}
		catch (NullPointerException e){
			// current turn may be null, support it here
			_storeUpdateDeviceRunningFeatures(screenOrientation, screenBrightnessLevel, volumeLevel);
		}
	}

	// DEVICEWORKLOADUPDATE_VALUE = 843;
	public void updateDeviceWorkload(int memoryLoad, int cpuLoad){
		try{
			// create a new object if needed (already created)
			// fill the object
			_deviceContext().setMemoryUsage(memoryLoad);
			_deviceContext().setCpuUsage(cpuLoad);
		}
		catch (NullPointerException e){
			// current turn may be null, support it here
			_storeUpdateDeviceWorkload(memoryLoad, cpuLoad);
		}
	}

	// SIGNALUPDATE_VALUE = 851;
	public void updateSignal(WirelessAccessTypeT wirelessAccessType,
			String accessPointName,int signalStrength){
		try{
			// create a new object if needed (already created)
			// fill the object
			_communicationContext().setWirelessAccessType(wirelessAccessType);
			_communicationContext().setAccessPointName(accessPointName);
			_communicationContext().setSignalStrength(signalStrength);
		}
		catch (NullPointerException e){
			// current turn may be null, support it here
			_storeUpdateSignal(wirelessAccessType, accessPointName, signalStrength);
		}
	}

	// THROUGHPUTUPDATE_VALUE = 852;
	public void updateThroughput(int receivedDataThroughput,
			int sentDataThroughput){
		try{
			// create a new object if needed (already created)
			// fill the object
			_communicationContext().setReceivedDataThroughput(receivedDataThroughput);
			_communicationContext().setSentDataThroughput(sentDataThroughput);
		}
		catch (NullPointerException e){
			// current turn may be null, support it here
			_storeUpdateThroughput(receivedDataThroughput, sentDataThroughput);
		}
	}

	// SERVERRESPONSEUPDATE_VALUE = 853;
	public void updateServerResponse(int rtt,int srt){
		try{
			// create a new object if needed (already created)
			// fill the object
			_communicationContext().setRtt(rtt);
			_communicationContext().setSrt(srt);
		}
		catch (NullPointerException e){
			// current turn may be null, support it here
			_storeUpdateServerResponse(rtt, srt);
		}
	}

	///
	/// null dialogue control support
	///
	///
	///
	///

	// ///////////////
	private boolean _innull_updateWeather = false;
	private int _innull_temperature;
	private WeatherT _innull_weather;

	private void _storeUpdateWeather(int temperature, WeatherT weather){
		_innull_updateWeather = true;
		_innull_temperature = temperature;
		_innull_weather = weather;

		LOG.debug("(DynamicContextInstantiator) pedro _storeUpdateWeather" );
	}

	private void _pushUpdateWeather(){
		if (_innull_updateWeather){
			_innull_updateWeather = false;
			updateWeather(_innull_temperature, _innull_weather);

			LOG.debug("(DynamicContextInstantiator) pedro _pushUpdateWeather");
		}
	}



	// ///////////////
	private boolean _innull_updateAmbient = false;
	private int _innull_noise;
	private int _innull_light;

	private void _storeUpdateAmbient(int noise, int light){
		_innull_updateAmbient = true;
		_innull_noise = noise;
		_innull_light = light;

		LOG.debug("(DynamicContextInstantiator) pedro _storeUpdateAmbient" );
	}

	private void _pushUpdateAmbient(){
		if (_innull_updateAmbient){
			_innull_updateAmbient = false;
			updateAmbient(_innull_noise, _innull_light);

			LOG.debug("(DynamicContextInstantiator) pedro _pushUpdateAmbient" );
		}
	}


	// ///////////////
	private boolean _innull_updateSocial = false;
	private SocialCompanyT _innull_socialCompany;
	private SocialArenaT _innull_socialArena;

	private void _storeUpdateSocial(SocialCompanyT socialCompany, SocialArenaT socialArena){
		_innull_updateSocial = true;
		_innull_socialCompany = socialCompany;
		_innull_socialArena = socialArena;

		LOG.debug("(DynamicContextInstantiator) pedro _storeUpdateSocial" );
	}

	private void _pushUpdateSocial(){
		if (_innull_updateSocial){
			_innull_updateSocial = false;
			updateSocial(_innull_socialCompany, _innull_socialArena);

			LOG.debug("(DynamicContextInstantiator) pedro _pushUpdateSocial" );
		}
	}


	// ///////////////
	private boolean _innull_updateLocation = false;
	private LocationT _innull_userLocation;
	private double _innull_geo_latitude;
	private double _innull_geo_longitude;

	private void _storeUpdateLocation(LocationT userLocation, double geo_latitude, double geo_longitude){
		_innull_updateLocation = true;
		_innull_userLocation = userLocation;
		_innull_geo_latitude = geo_latitude;
		_innull_geo_longitude = geo_longitude;

		LOG.debug("(DynamicContextInstantiator) pedro _storeUpdateLocation" );
	}

	private void _pushUpdateLocation(){
		if (_innull_updateLocation){
			_innull_updateLocation = false;
			updateLocation(_innull_userLocation, _innull_geo_latitude, _innull_geo_longitude);

			LOG.debug("(DynamicContextInstantiator) pedro _pushUpdateLocation" );
		}
	}


	// ///////////////
	private boolean _innull_updateMobility = false;
	private MobilityLevelT _innull_mobilityLevel;

	private void _storeUpdateMobility(MobilityLevelT mobilityLevel){
		_innull_updateMobility = true;
		_innull_mobilityLevel = mobilityLevel;

		LOG.debug("(DynamicContextInstantiator) pedro _storeUpdateMobility" );
	}

	private void _pushUpdateMobility(){
		if (_innull_updateMobility){
			_innull_updateMobility = false;
			updateMobility(_innull_mobilityLevel);

			LOG.debug("(DynamicContextInstantiator) pedro _pushUpdateMobility" );
		}
	}


	// ///////////////
	private boolean _innull_updateTime = false;
	private int _innull_year; 
	private int _innull_month; 
	private int _innull_day;
	private int _innull_hours; 
	private int _innull_mins; 
	private int _innull_secs;

	private void _storeUpdateTime(int year, int month, int day,
			int hours, int mins, int secs){
		_innull_updateTime = true;
		_innull_year = year;
		_innull_month = month;
		_innull_day = day;
		_innull_hours = hours;
		_innull_mins = mins;
		_innull_secs = secs;

		LOG.debug("(DynamicContextInstantiator) pedro _storeUpdateTime" );
	}

	private void _pushUpdateTime(){
		if (_innull_updateTime){
			_innull_updateTime = false;
			updateTime(_innull_year, _innull_month, _innull_day, _innull_hours, _innull_mins, _innull_secs);

			LOG.debug("(DynamicContextInstantiator) pedro _pushUpdateTime" );
		}
	}


	// ///////////////
	private boolean _innull_updateDeviceFeatures = false;
	private DeviceTypeT _innull_deviceType;
	private ScreenSizeT _innull_screenSize;
	private ScreenResolutionT _innull_screenResolution;

	private void _storeUpdateDeviceFeatures(DeviceTypeT deviceType, ScreenSizeT screenSize,
			ScreenResolutionT screenResolution){
		_innull_updateDeviceFeatures = true;
		_innull_deviceType = deviceType;
		_innull_screenSize = screenSize;
		_innull_screenResolution = screenResolution;

		LOG.debug("(DynamicContextInstantiator) pedro _storeUpdateDeviceFeatures" );
	}

	private void _pushUpdateDeviceFeatures(){
		if (_innull_updateDeviceFeatures){
			_innull_updateDeviceFeatures = false;
			updateDeviceFeatures(_innull_deviceType, _innull_screenSize, _innull_screenResolution);
			LOG.debug("(DynamicContextInstantiator) pedro _pushUpdateDeviceFeatures" );
		}

	}


	// ///////////////
	private boolean _innull_updateDeviceRunningFeatures = false;
	private ScreenOrientationT _innull_screenOrientation;
	private int _innull_screenBrightnessLevel;
	private int _innull_volumeLevel;

	private void _storeUpdateDeviceRunningFeatures(ScreenOrientationT screenOrientation,
			int screenBrightnessLevel, int volumeLevel){
		_innull_updateDeviceRunningFeatures = true;
		_innull_screenOrientation = screenOrientation;
		_innull_screenBrightnessLevel = screenBrightnessLevel;
		_innull_volumeLevel = volumeLevel;

		LOG.debug("(DynamicContextInstantiator) pedro _storeUpdateDeviceRunningFeatures" );
	}

	private void _pushUpdateDeviceRunningFeatures(){
		if (_innull_updateDeviceRunningFeatures){
			_innull_updateDeviceRunningFeatures = false;
			updateDeviceRunningFeatures(_innull_screenOrientation, _innull_screenBrightnessLevel, _innull_volumeLevel);

			LOG.debug("(DynamicContextInstantiator) pedro _pushUpdateDeviceRunningFeatures" );
		}
	}


	// ///////////////
	private boolean _innull_updateDeviceWorkload = false;
	private int _innull_memoryLoad;
	private int _innull_cpuLoad;

	private void _storeUpdateDeviceWorkload(int memoryLoad, int cpuLoad){
		_innull_updateDeviceWorkload = true;
		_innull_memoryLoad = memoryLoad;
		_innull_cpuLoad = cpuLoad;

		LOG.debug("(DynamicContextInstantiator) pedro _storeUpdateDeviceWorkload" );
	}

	private void _pushUpdateDeviceWorkload(){
		if (_innull_updateDeviceWorkload){
			_innull_updateDeviceWorkload = false;
			updateDeviceWorkload(_innull_memoryLoad, _innull_cpuLoad);

			LOG.debug("(DynamicContextInstantiator) pedro _pushUpdateDeviceWorkload" );
		}
	}


	// ///////////////
	private boolean _innull_updateSignal = false;
	private WirelessAccessTypeT _innull_wirelessAccessType;
	private String _innull_accessPointName;
	private int _innull_signalStrength;

	private void _storeUpdateSignal(WirelessAccessTypeT wirelessAccessType, String accessPointName, int signalStrength){
		_innull_updateSignal = true;
		_innull_wirelessAccessType = wirelessAccessType;
		_innull_accessPointName = accessPointName;
		_innull_signalStrength = signalStrength;

		LOG.debug("(DynamicContextInstantiator) pedro _storeUpdateSignal" );
	}

	private void _pushUpdateSignal(){
		if (_innull_updateSignal){
			_innull_updateSignal = false;
			updateSignal(_innull_wirelessAccessType, _innull_accessPointName, _innull_signalStrength);

			LOG.debug("(DynamicContextInstantiator) pedro _pushUpdateSignal" );
		}
	}


	// ///////////////
	private boolean _innull_updateThroughput = false;
	private int _innull_receivedDataThroughput;
	private int _innull_sentDataThroughput;

	private void _storeUpdateThroughput(int receivedDataThroughput, int sentDataThroughput){
		_innull_updateThroughput = true;
		_innull_receivedDataThroughput = receivedDataThroughput;
		_innull_sentDataThroughput = sentDataThroughput;

		LOG.debug("(DynamicContextInstantiator) pedro _storeUpdateThroughput" );
	}

	private void _pushUpdateThroughput(){
		if (_innull_updateThroughput){
			_innull_updateThroughput = false;
			updateThroughput(_innull_receivedDataThroughput, _innull_sentDataThroughput);
			LOG.debug("(DynamicContextInstantiator) pedro _pushUpdateThroughput" );
		}
	}


	// ///////////////
	private boolean _innull_updateServerResponse = false;
	private int _innull_rtt;
	private int _innull_srt;

	private void _storeUpdateServerResponse(int rtt, int srt){
		_innull_updateServerResponse = true;
		_innull_rtt = rtt;
		_innull_srt = srt;

		LOG.debug("(DynamicContextInstantiator) pedro _storeUpdateServerResponse" );
	}

	private void _pushUpdateServerResponse(){
		if (_innull_updateServerResponse){
			_innull_updateServerResponse = false;
			updateServerResponse(_innull_rtt, _innull_srt);

			LOG.debug("(DynamicContextInstantiator) pedro _pushUpdateServerResponse" );
		}
	}

	// /////////////////

	private boolean _updatesRemaining(){
		return _innull_updateAmbient || _innull_updateDeviceFeatures || 
				_innull_updateDeviceRunningFeatures || _innull_updateDeviceWorkload ||
				_innull_updateLocation || _innull_updateMobility || 
				_innull_updateServerResponse || _innull_updateSignal || 
				_innull_updateSocial || _innull_updateThroughput || 
				_innull_updateTime || _innull_updateWeather; 
	}

	private void _doInjectStoredValues(){
		if (_updatesRemaining()){
			_pushUpdateWeather();
			_pushUpdateAmbient();
			_pushUpdateSocial();
			_pushUpdateLocation();
			_pushUpdateMobility();
			_pushUpdateTime();
			_pushUpdateDeviceFeatures();
			_pushUpdateDeviceRunningFeatures();
			_pushUpdateDeviceWorkload();
			_pushUpdateSignal();
			_pushUpdateThroughput();
			_pushUpdateServerResponse();
		}
	}


	///
	/// supporting methods
	///

	private DynamicContext _getCurrentContext(){
		try{
			DynamicContext dc = icontext_.getCurrentTurn().getContext();

			_doInjectStoredValues();

			return dc;
		}
		catch (NullPointerException e){
			// current turn may be null, support it here
			return null;
		}
	}

	private PhysicalContext _physicalContext(){
		return _getCurrentContext().getPhysicalContext();
	}

	private SocialContext _socialContext(){
		return _getCurrentContext().getSocialContext();
	}

	private LocationTimeContext _locationTimeContext(){
		return _getCurrentContext().getLocationTimeContext();
	}

	private DeviceContext _deviceContext(){
		return _getCurrentContext().getDeviceContext();
	}

	private CommunicationContext _communicationContext(){
		return _getCurrentContext().getCommunicationContext();
	}

}
