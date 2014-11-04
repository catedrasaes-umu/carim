package org.mmi.model.instantiator.detail;


import org.carim.model.GuiInput;
import org.carim.model.MotionInput;
import org.mmi.model.instantiator.InstantiationContext;
import org.mmi.model.instantiator.InstantiatorBase;

/**
 * Instantiator for Motion input information.
 * It is used by the corresponding listeners to set this
 * information into the model instances
 * 
 * @author mateo-navarro.pedro
 *
 */
public class MotionInputInstantiator extends InstantiatorBase {

	/**
	 * Constructor
	 * @param c instantiation context
	 */
	public MotionInputInstantiator(InstantiationContext c) {
		super(c); 
	}
	
	private MotionInput _cinput(){
		return icontext_.getCurrentUserTurn().getMotionInput();
	} 
	
	/**
	 * to set tilt movements
	 * @param elements
	 */
	public void setTiltElements(int nmoves){
		_cinput().setTiltMovements(nmoves);
	}
	
	/**
	 * to set twist movements
	 * @param elements
	 */
	public void setTwistElements(int nmoves){
		_cinput().setTwistMovements(nmoves);
	}
	
	/**
	 * to set shake movements
	 * @param elements
	 */
	public void setShakeElements(int nmoves){
		_cinput().setShakeMovements(nmoves);
	}

}
