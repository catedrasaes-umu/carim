package org.mmi.model.instantiator.detail;

import java.util.LinkedList;

import org.carim.model.McReasonT;
import org.carim.model.MmiTypeT;
import org.carim.model.ModAppropT;
import org.carim.model.ModTypeT;
import org.carim.model.RoleT;
import org.mmi.model.instantiator.InstantiationContext;
import org.mmi.model.instantiator.InstantiatorBase;

/**
 * Instantiator for modality meta-information.
 * It is used by the corresponding listeners to set this
 * information into the model instances.
 * 
 * @author mateo-navarro.pedro
 *
 */
public class ModalityInstantiator extends InstantiatorBase {

	public ModalityInstantiator(InstantiationContext c) {
		super(c);
	}

	///
	/// modality info
	///

	/**
	 * sets the modality type
	 * @param t
	 */
	public void setModalityType(LinkedList<ModTypeT> l){
		if (l.size() == 0)
			throw new IllegalArgumentException();
		for (ModTypeT t : l)
			icontext_.getCurrentTurn().getModality().getModalityType().add(t);
	}

	/**
	 * sets the multimodal interaction type
	 * @param t
	 */
	public void setMultimodalInteractionType(MmiTypeT t){
		icontext_.getCurrentTurn().getModality().setMminteractionType(t);
	}

	///
	/// modality changes
	///

	/**
	 * sets that a modality change happened
	 * @param origin the origin of the change
	 * @param reason the reason of the change
	 */
	public void setModalityChange(RoleT origin, McReasonT reason){
		icontext_.getCurrentTurn().getModality().getChange().setOrigin(origin);
		icontext_.getCurrentTurn().getModality().getChange().setReason(reason);
	}

	///
	/// asynchronous info
	///

	/**
	 * sets the number of lags detected
	 * @param n lags count
	 */
	public void setLags(int n){
		icontext_.getCurrentTurn().getModality().getSynchroni().setNlags(n);
	}

	/**
	 * sets the cumulative time for the lags
	 * @param n lag time
	 */
	public void setLagTime(long n){
		icontext_.getCurrentTurn().getModality().getSynchroni().setLagtime(n);
	}

	/**
	 * set the number of asynchronous events
	 * @param n events count
	 */
	public void setEvents(int n){
		icontext_.getCurrentTurn().getModality().getSynchroni().setNevents(n);
	}

	///
	/// modality appropriateness
	///

	/**
	 * sets modality appropriateness
	 * @param a appropriateness level
	 */
	public void setAppropiateness(ModAppropT a){
		icontext_.getCurrentTurn().getModality().getAppropriateness().setAppropriateness(a);
	}
}
