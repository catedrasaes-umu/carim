package org.carim.instantiation;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.carim.model.Dialogue;
import org.carim.model.Trial;
import org.mmi.events.factory.MmiEventsFactory;
import org.mmi.events.listeners.context.DynamicContextListener;
import org.mmi.events.listeners.context.UserContextListener;
import org.mmi.events.listeners.metacomm.MetacommListener;
import org.mmi.events.listeners.modalitycontrol.ModalityUsageListener;
import org.mmi.events.listeners.systemoutput.OutputContentListener;
import org.mmi.events.listeners.systemoutput.SpeechOutputListener;
import org.mmi.events.listeners.timing.PreTurnTimingListener;
import org.mmi.events.listeners.timing.TurnTimingListener;
import org.mmi.events.listeners.userinput.ExploringTransferringListener;
import org.mmi.events.listeners.userinput.GuiNavigationAbstractorListener;
import org.mmi.events.listeners.userinput.GuiTextAbstractorListener;
import org.mmi.events.listeners.userinput.MotionInputListener;
import org.mmi.events.listeners.userinput.NavigationTextMetricsListener;
import org.mmi.events.listeners.userinput.SpeechInputListener;
import org.mmi.events.pool.EventPool;
import org.mmi.model.instantiator.CarimModelInstantiator;



public class CarimInstantiationFramework {



	public CarimInstantiationFramework() {
		instantiator = new CarimModelInstantiator();
		factory = new MmiEventsFactory();
		pool = new EventPool();

		_initializeFramework();
	}

	///
	/// public variables

	public CarimModelInstantiator instantiator;
	public MmiEventsFactory factory;
	public EventPool pool;

	///
	/// private variables

	///
	/// public methods
	///

	/**
	 * Dumps the current dialogue to a XML file.
	 * @param filename the file name
	 */
	public void saveTrial(String filename){
		instantiator.saveTrial(filename);
	}

	/**
	 * Returns the current --or already recorded-- dialogue instance.
	 * @return the dialogue object
	 */
	public Trial getCurrentTrial(){
		return instantiator.icontext_.getTrial();
	}

	/**
	 * Returns the current --or already recorded-- dialogue instance.
	 * @return the dialogue object
	 */
	public Dialogue getCurrentDialogue(){
		return instantiator.icontext_.getCurrentDialogue();
	}

	/**
	 * Resets event pool and instantiator
	 */
	public void reset(){
		instantiator.reset();
		pool.reset();
	}

	///
	/// private methods
	///

	private void _initializeFramework(){

		///timing
		//L1
		PreTurnTimingListener gttl = new PreTurnTimingListener(pool, factory, instantiator);
		pool.addListener(gttl.registerTypes(), gttl);
		//L2
		TurnTimingListener turnl = new TurnTimingListener(pool, factory, instantiator);
		pool.addListener(turnl.registerTypes(), turnl);

		///metacomm
		//L1
		MetacommListener mcl = new MetacommListener(pool, factory, instantiator);
		pool.addListener(mcl.registerTypes(), mcl);

		///modality
		//L1
		ModalityUsageListener mul = new ModalityUsageListener(pool, factory, instantiator);
		pool.addListener(mul.registerTypes(), mul);

		///GUI input
		//L0
		GuiNavigationAbstractorListener gnavl = new GuiNavigationAbstractorListener(pool, factory, instantiator);
		pool.addListener(gnavl.registerTypes(), gnavl);
		GuiTextAbstractorListener gtextl = new GuiTextAbstractorListener(pool, factory, instantiator);
		pool.addListener(gtextl.registerTypes(), gtextl);
		//L1
		NavigationTextMetricsListener ntml = new NavigationTextMetricsListener(pool, factory, instantiator);
		pool.addListener(ntml.registerTypes(), ntml);
		ExploringTransferringListener extl = new ExploringTransferringListener(pool, factory, instantiator);
		pool.addListener(extl.registerTypes(), extl);

		///Motion input
		//L1
		MotionInputListener minl = new MotionInputListener(pool, factory, instantiator);
		pool.addListener(minl.registerTypes(), minl);

		///Speech input
		//L1
		SpeechInputListener sinl = new SpeechInputListener(pool, factory, instantiator);
		pool.addListener(sinl.registerTypes(), sinl);

		///Speech output
		//L1
		SpeechOutputListener soutl = new SpeechOutputListener(pool, factory, instantiator);
		pool.addListener(soutl.registerTypes(), soutl);

		///System output
		//L2
		OutputContentListener tcl = new OutputContentListener(pool, factory, instantiator);
		pool.addListener(tcl.registerTypes(), tcl);

		///User context
		UserContextListener ucl = new UserContextListener(pool, factory, instantiator);
		pool.addListener(ucl.registerTypes(), ucl);

		///Dynamic context
		DynamicContextListener dcl = new DynamicContextListener(pool, factory, instantiator);
		pool.addListener(dcl.registerTypes(), dcl);
	}

	///
	/// log configuration
	///

	private static final Logger LOG = Logger.getLogger(CarimInstantiationFramework.class);

	static
	{
		Logger rootLogger = Logger.getRootLogger();
		rootLogger.setLevel(Level.INFO);
		String pattern = "%-4r %-5p | %m%n";
		//String pattern = "%-4r [%t] %-5p %c %x | %m%n";
		//String pattern = "%%-6r [%p] %c - %m%n";
		rootLogger.addAppender(new ConsoleAppender(
				new PatternLayout(pattern)));
	}

}
