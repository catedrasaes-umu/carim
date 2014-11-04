package org.mmi.model.instantiator.detail;

import org.mmi.model.instantiator.InstantiationContext;
import org.mmi.model.instantiator.InstantiatorBase;

/**
 * Instantiator for turn content information.
 * It is used by the corresponding listeners to set this
 * information into the model instances
 * 
 * @author mateo-navarro.pedro
 *
 */
public class TurnContentInstantiator extends InstantiatorBase {

	/**
	 * Constructor
	 * @param c instantiation context
	 */
	public TurnContentInstantiator(InstantiationContext c) {
		super(c);
	}

	/**
	 * to set elements
	 * @param n elements
	 */
	public void setElements(int n){
		icontext_.getCurrentTurn().setElements(n);
	}

	/**
	 * to add new elements
	 * @param n elements
	 */
	public void addElements(int n){
		icontext_.getCurrentTurn().setElements(icontext_.getCurrentTurn().getElements() + n);
	}

	/**
	 * to set feedback elements
	 * @param n elements
	 */
	public void setFeedbacks(int n){
		icontext_.getCurrentTurn().setFeedback(n);
	}

	/**
	 * to add new feedback elements
	 * @param n elements
	 */
	public void addFeedback(int n){
		icontext_.getCurrentTurn().setFeedback(icontext_.getCurrentTurn().getFeedback() + n);
	}

	/**
	 * to set concepts
	 * @param n concepts
	 */
	public void setConcepts(int n){
		icontext_.getCurrentTurn().setConcepts(n);
	}

	/**
	 * to add new concepts
	 * @param n concepts
	 */
	public void addConcepts(int n){
		icontext_.getCurrentTurn().setConcepts(icontext_.getCurrentTurn().getConcepts() + n);
	}

	/**
	 * to set noise elements
	 * @param n elements
	 */
	public void setNoise(int n){
		icontext_.getCurrentTurn().setNoise(n);
	}

	/**
	 * to add new noise elements
	 * @param n elements
	 */
	public void addNoise(int n){
		icontext_.getCurrentTurn().setNoise(icontext_.getCurrentTurn().getNoise() + n);
	}

	/**
	 * to set number of questions
	 * @param n questions
	 */
	public void setQuestions(int n){
		icontext_.getCurrentTurn().setQuestions(n);
	}

	/**
	 * to add new questions
	 * @param n questions
	 */
	public void addQuestions(int n){
		icontext_.getCurrentTurn().setQuestions(icontext_.getCurrentTurn().getQuestions() + n);
	}

}
