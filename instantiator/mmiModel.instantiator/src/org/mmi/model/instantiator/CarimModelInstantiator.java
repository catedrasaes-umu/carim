package org.mmi.model.instantiator;


import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.carim.model.carimModelFactory;
import org.carim.model.impl.carimModelPackageImpl;
import org.mmi.model.instantiator.detail.DynamicContextInstantiator;
import org.mmi.model.instantiator.detail.GuiInputInstantiator;
import org.mmi.model.instantiator.detail.MetacommInstantiator;
import org.mmi.model.instantiator.detail.ModalityInstantiator;
import org.mmi.model.instantiator.detail.MotionInputInstantiator;
import org.mmi.model.instantiator.detail.SpeechInputInstantiator;
import org.mmi.model.instantiator.detail.SpeechOutputInstantiator;
import org.mmi.model.instantiator.detail.TurnContentInstantiator;
import org.mmi.model.instantiator.detail.TurnTimingInstantiator;
import org.mmi.model.instantiator.detail.UserContextInstantiator;
import org.mmi.model.instantiator.utils.XMLMarshal;
import org.mmi.utils.GenericFSM.FSMIntegrityException;


/**
 * Class used to create mmi model instances. This class includes
 * other instantiation classes
 * 
 * @author mateo-navarro.pedro
 *
 */
public class CarimModelInstantiator {

	private static final Logger LOG = Logger.getLogger(CarimModelInstantiator.class);

	/**
	 * Instantiation context
	 */
	public InstantiationContext icontext_;

	///
	/// sub-instantiators
	///

	/**
	 * turn timing instantiator
	 */
	public TurnTimingInstantiator turnTiming;

	/**
	 * turn content instantiator
	 */
	public TurnContentInstantiator turnContent;

	/**
	 * gui input instantiator
	 */
	public GuiInputInstantiator guiInput;

	/**
	 * motion input instantiator
	 */
	public MotionInputInstantiator motionInput;

	/**
	 * speech input instantiator
	 */
	public SpeechInputInstantiator speechInput;

	/**
	 * speech output instantiator
	 */
	public SpeechOutputInstantiator speechOutput;

	/**
	 * metacommunication instantiator
	 */
	public MetacommInstantiator metaComm;

	/**
	 * modality usage instantiator
	 */
	public ModalityInstantiator modality;

	/**
	 * user context instantiator
	 */
	public UserContextInstantiator userContext;

	/**
	 * dynamic context instantiator
	 */
	public DynamicContextInstantiator dynamicContext;


	/**
	 * Constructor
	 */
	public CarimModelInstantiator(){
		//initialize package
		carimModelPackageImpl.init();

		//create and initialize context
		icontext_ = new InstantiationContext();

		//create and initialize sub-Instantiators
		turnTiming = new TurnTimingInstantiator(icontext_);
		turnContent = new TurnContentInstantiator(icontext_);
		guiInput = new GuiInputInstantiator(icontext_);
		motionInput = new MotionInputInstantiator(icontext_);
		metaComm = new MetacommInstantiator(icontext_);
		speechOutput = new SpeechOutputInstantiator(icontext_);
		speechInput = new SpeechInputInstantiator(icontext_);
		modality = new ModalityInstantiator(icontext_);
		userContext = new UserContextInstantiator(icontext_);
		dynamicContext = new DynamicContextInstantiator(icontext_);

		LOG.info("MmiModelInstantiator initialized.");
	}
	
	/**
	 * reset method
	 */
	public void reset(){
		icontext_.reset();
	}

	/**
	 * Dialogue managing methods
	 */
	public void saveTrial(String URI){
		if (icontext_ != null && icontext_.droot != null)
			XMLMarshal.SaveModelToFile(icontext_.droot, URI);
	}

}
