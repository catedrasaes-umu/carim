package org.mmi.events.listeners.context;

import java.util.LinkedList;

import org.apache.log4j.Logger;
import org.carim.model.DateTimeT;
import org.carim.model.impl.DateTimeTImpl;
import org.mmi.events.AmbientUpdateEvent;
import org.mmi.events.DeviceFeaturesUpdateEvent;
import org.mmi.events.DeviceRunningFeaturesUpdateEvent;
import org.mmi.events.DeviceWorkloadUpdateEvent;
import org.mmi.events.Event;
import org.mmi.events.LocationUpdateEvent;
import org.mmi.events.MobilityUpdateEvent;
import org.mmi.events.ServerResponseUpdateEvent;
import org.mmi.events.SignalUpdateEvent;
import org.mmi.events.SocialUpdateEvent;
import org.mmi.events.ThroughputUpdateEvent;
import org.mmi.events.TimeUpdateEvent;
import org.mmi.events.UserDataUpdateEvent;
import org.mmi.events.WeatherUpdateEvent;
import org.mmi.events.event_t;
import org.mmi.events.factory.MmiEventsFactory;
import org.mmi.events.listeners.EventPoolListener;
import org.mmi.events.listeners.metacomm.MetacommListener;
import org.mmi.events.pool.EventPool;
import org.mmi.model.instantiator.CarimModelInstantiator;
import org.mmi.model.instantiator.detail.DynamicContextInstantiator;

public class DynamicContextListener extends EventPoolListener {

	private final static Logger LOG = Logger.getLogger(MetacommListener.class); 

	public DynamicContextListener(EventPool epool, MmiEventsFactory efact,
			CarimModelInstantiator inst) {
		super(epool, efact, inst);
		
		_dcinst = inst.dynamicContext;
	}
	
	@Override
	public void reset() {
		// do nothing
	}

	private DynamicContextInstantiator _dcinst;

	@Override
	public void onEvent(int type, Event e) {
		///
		/// physical environment 
		///

		// WEATHERUPDATE_VALUE = 801;
		// AMBIENTUPDATE_VALUE = 802;

		if (e.getType() == event_t.WEATHERUPDATE_VALUE){
			LOG.debug(e.getTimestamp() + "\t>> L1 WeatherUpdateEvent");
			WeatherUpdateEvent ce = (WeatherUpdateEvent)e;
			_dcinst.updateWeather(ce.getTemperature(),
					ce.getWeather());
		}
		//
		else if (e.getType() == event_t.AMBIENTUPDATE_VALUE){
			LOG.debug(e.getTimestamp() + "\t>> L1 AmbientUpdateEvent");
			AmbientUpdateEvent ce = (AmbientUpdateEvent)e;
			_dcinst.updateAmbient(ce.getNoise(),
					ce.getLight());
		}

		///
		/// social context 
		///

		// SOCIALUPDATE_VALUE = 821;

		else if (e.getType() == event_t.SOCIALUPDATE_VALUE){
			LOG.debug(e.getTimestamp() + "\t>> L1 SocialUpdateEvent");
			SocialUpdateEvent ce = (SocialUpdateEvent)e;
			_dcinst.updateSocial(ce.getSocialCompany(),
					ce.getSocialArena());
		}

		///
		/// location/time
		///

		// LOCATIONUPDATE_VALUE = 831;
		// MOBILITYUPDATE_VALUE = 832;
		// TIMEUPDATE_VALUE = 833;

		else if (e.getType() == event_t.LOCATIONUPDATE_VALUE){
			LOG.debug(e.getTimestamp() + "\t>> L1 LocationUpdateEvent");
			LocationUpdateEvent ce = (LocationUpdateEvent)e;
			_dcinst.updateLocation(ce.getLocation(), ce.getGeo_latitude(), ce.getGeo_longitude());
		}
		//
		else if (e.getType() == event_t.MOBILITYUPDATE_VALUE){
			LOG.debug(e.getTimestamp() + "\t>> L1 MobilityUpdateEvent");
			MobilityUpdateEvent ce = (MobilityUpdateEvent)e;
			_dcinst.updateMobility(ce.getMobilityLevel());
		}
		//
		else if (e.getType() == event_t.TIMEUPDATE_VALUE){
			LOG.debug(e.getTimestamp() + "\t>> L1 TimeUpdateEvent");
			TimeUpdateEvent ce = (TimeUpdateEvent)e;
			_dcinst.updateTime(ce.getD_year(),ce.getD_month(),ce.getD_day(),
					ce.getT_hours(),ce.getT_mins(),ce.getT_secs());
		}

		///
		/// device
		///

		// DEVICEFEATURESUPDATE_VALUE = 841;
		// DEVICERUNNINGFEATURESUPDATE_VALUE = 842;
		// DEVICEWORKLOADUPDATE_VALUE = 843;

		else if (e.getType() == event_t.DEVICEFEATURESUPDATE_VALUE){
			LOG.debug(e.getTimestamp() + "\t>> L1 DeviceFeaturesUpdateEvent");
			DeviceFeaturesUpdateEvent ce = (DeviceFeaturesUpdateEvent)e;
			_dcinst.updateDeviceFeatures(ce.getDeviceType(), ce.getScreenSize(),
					ce.getScreenResolution());
		}
		//
		else if (e.getType() == event_t.DEVICERUNNINGFEATURESUPDATE_VALUE){
			LOG.debug(e.getTimestamp() + "\t>> L1 DeviceRunningFeaturesUpdateEvent");
			DeviceRunningFeaturesUpdateEvent ce = (DeviceRunningFeaturesUpdateEvent)e;
			_dcinst.updateDeviceRunningFeatures(ce.getScreenOrientation(),
					ce.getBrightness(), ce.getVolume());
		}
		//
		else if (e.getType() == event_t.DEVICEWORKLOADUPDATE_VALUE){
			LOG.debug(e.getTimestamp() + "\t>> L1 DeviceWorkloadUpdateEvent");
			DeviceWorkloadUpdateEvent ce = (DeviceWorkloadUpdateEvent)e;
			_dcinst.updateDeviceWorkload(ce.getMemoryUsage(),
					ce.getCpuUsage());
		}

		///
		/// communication
		///

		// SIGNALUPDATE_VALUE = 851;
		// THROUGHPUTUPDATE_VALUE = 852;
		// SERVERRESPONSEUPDATE_VALUE = 853;

		else if (e.getType() == event_t.SIGNALUPDATE_VALUE){
			LOG.debug(e.getTimestamp() + "\t>> L1 SignalUpdateEvent");
			SignalUpdateEvent ce = (SignalUpdateEvent)e;
			_dcinst.updateSignal(ce.getWirelessAccessType(),
					ce.getAccessPointName(), ce.getSignalStrength());
		}
		//
		else if (e.getType() == event_t.THROUGHPUTUPDATE_VALUE){
			LOG.debug(e.getTimestamp() + "\t>> L1 ThroughputUpdateEvent");
			ThroughputUpdateEvent ce = (ThroughputUpdateEvent)e;
			_dcinst.updateThroughput(ce.getReceivedData(),
					ce.getSentData());
		}
		//
		else if (e.getType() == event_t.SERVERRESPONSEUPDATE_VALUE){
			LOG.debug(e.getTimestamp() + "\t>> L1 ServerResponseUpdateEvent");
			ServerResponseUpdateEvent ce = (ServerResponseUpdateEvent)e;
			_dcinst.updateServerResponse(ce.getRtt(),
					ce.getSrt());
		}


	}

	@Override
	public LinkedList<Integer> registerTypes() {
		// WEATHERUPDATE_VALUE = 801;
		// AMBIENTUPDATE_VALUE = 802;
		// SOCIALUPDATE_VALUE = 821;
		// LOCATIONUPDATE_VALUE = 831;
		// MOBILITYUPDATE_VALUE = 832;
		// TIMEUPDATE_VALUE = 833;
		// DEVICEFEATURESUPDATE_VALUE = 841;
		// DEVICERUNNINGFEATURESUPDATE_VALUE = 842;
		// DEVICEWORKLOADUPDATE_VALUE = 843;
		// SIGNALUPDATE_VALUE = 851;
		// THROUGHPUTUPDATE_VALUE = 852;
		// SERVERRESPONSEUPDATE_VALUE = 853;

		LinkedList<Integer> auxl = new java.util.LinkedList<Integer>();
		auxl.add(event_t.WEATHERUPDATE_VALUE);
		auxl.add(event_t.AMBIENTUPDATE_VALUE);
		auxl.add(event_t.SOCIALUPDATE_VALUE);
		auxl.add(event_t.LOCATIONUPDATE_VALUE);
		auxl.add(event_t.MOBILITYUPDATE_VALUE);
		auxl.add(event_t.TIMEUPDATE_VALUE);
		auxl.add(event_t.DEVICEFEATURESUPDATE_VALUE);
		auxl.add(event_t.DEVICERUNNINGFEATURESUPDATE_VALUE);
		auxl.add(event_t.DEVICEWORKLOADUPDATE_VALUE);
		auxl.add(event_t.SIGNALUPDATE_VALUE);
		auxl.add(event_t.THROUGHPUTUPDATE_VALUE);
		auxl.add(event_t.SERVERRESPONSEUPDATE_VALUE);

		return auxl;
	}
}
