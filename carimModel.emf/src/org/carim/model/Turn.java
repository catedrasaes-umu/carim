/**
 */
package org.carim.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Turn</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.carim.model.Turn#getFeedbackDelay <em>Feedback Delay</em>}</li>
 *   <li>{@link org.carim.model.Turn#getFeedbackDuration <em>Feedback Duration</em>}</li>
 *   <li>{@link org.carim.model.Turn#getActionDuration <em>Action Duration</em>}</li>
 *   <li>{@link org.carim.model.Turn#getElements <em>Elements</em>}</li>
 *   <li>{@link org.carim.model.Turn#getFeedback <em>Feedback</em>}</li>
 *   <li>{@link org.carim.model.Turn#getConcepts <em>Concepts</em>}</li>
 *   <li>{@link org.carim.model.Turn#getNoise <em>Noise</em>}</li>
 *   <li>{@link org.carim.model.Turn#getQuestions <em>Questions</em>}</li>
 *   <li>{@link org.carim.model.Turn#getModality <em>Modality</em>}</li>
 *   <li>{@link org.carim.model.Turn#getContext <em>Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.carim.model.carimModelPackage#getTurn()
 * @model abstract="true"
 *        extendedMetaData="name='Turn' kind='elementOnly'"
 * @generated
 */
public interface Turn extends EObject {
	/**
	 * Returns the value of the '<em><b>Feedback Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feedback Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feedback Delay</em>' attribute.
	 * @see #isSetFeedbackDelay()
	 * @see #unsetFeedbackDelay()
	 * @see #setFeedbackDelay(long)
	 * @see org.carim.model.carimModelPackage#getTurn_FeedbackDelay()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long" required="true"
	 *        extendedMetaData="kind='element' name='feedbackDelay' namespace='##targetNamespace'"
	 * @generated
	 */
	long getFeedbackDelay();

	/**
	 * Sets the value of the '{@link org.carim.model.Turn#getFeedbackDelay <em>Feedback Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feedback Delay</em>' attribute.
	 * @see #isSetFeedbackDelay()
	 * @see #unsetFeedbackDelay()
	 * @see #getFeedbackDelay()
	 * @generated
	 */
	void setFeedbackDelay(long value);

	/**
	 * Unsets the value of the '{@link org.carim.model.Turn#getFeedbackDelay <em>Feedback Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFeedbackDelay()
	 * @see #getFeedbackDelay()
	 * @see #setFeedbackDelay(long)
	 * @generated
	 */
	void unsetFeedbackDelay();

	/**
	 * Returns whether the value of the '{@link org.carim.model.Turn#getFeedbackDelay <em>Feedback Delay</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Feedback Delay</em>' attribute is set.
	 * @see #unsetFeedbackDelay()
	 * @see #getFeedbackDelay()
	 * @see #setFeedbackDelay(long)
	 * @generated
	 */
	boolean isSetFeedbackDelay();

	/**
	 * Returns the value of the '<em><b>Feedback Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feedback Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feedback Duration</em>' attribute.
	 * @see #isSetFeedbackDuration()
	 * @see #unsetFeedbackDuration()
	 * @see #setFeedbackDuration(long)
	 * @see org.carim.model.carimModelPackage#getTurn_FeedbackDuration()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long" required="true"
	 *        extendedMetaData="kind='element' name='feedbackDuration' namespace='##targetNamespace'"
	 * @generated
	 */
	long getFeedbackDuration();

	/**
	 * Sets the value of the '{@link org.carim.model.Turn#getFeedbackDuration <em>Feedback Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feedback Duration</em>' attribute.
	 * @see #isSetFeedbackDuration()
	 * @see #unsetFeedbackDuration()
	 * @see #getFeedbackDuration()
	 * @generated
	 */
	void setFeedbackDuration(long value);

	/**
	 * Unsets the value of the '{@link org.carim.model.Turn#getFeedbackDuration <em>Feedback Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFeedbackDuration()
	 * @see #getFeedbackDuration()
	 * @see #setFeedbackDuration(long)
	 * @generated
	 */
	void unsetFeedbackDuration();

	/**
	 * Returns whether the value of the '{@link org.carim.model.Turn#getFeedbackDuration <em>Feedback Duration</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Feedback Duration</em>' attribute is set.
	 * @see #unsetFeedbackDuration()
	 * @see #getFeedbackDuration()
	 * @see #setFeedbackDuration(long)
	 * @generated
	 */
	boolean isSetFeedbackDuration();

	/**
	 * Returns the value of the '<em><b>Action Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Duration</em>' attribute.
	 * @see #isSetActionDuration()
	 * @see #unsetActionDuration()
	 * @see #setActionDuration(long)
	 * @see org.carim.model.carimModelPackage#getTurn_ActionDuration()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long" required="true"
	 *        extendedMetaData="kind='element' name='actionDuration' namespace='##targetNamespace'"
	 * @generated
	 */
	long getActionDuration();

	/**
	 * Sets the value of the '{@link org.carim.model.Turn#getActionDuration <em>Action Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Duration</em>' attribute.
	 * @see #isSetActionDuration()
	 * @see #unsetActionDuration()
	 * @see #getActionDuration()
	 * @generated
	 */
	void setActionDuration(long value);

	/**
	 * Unsets the value of the '{@link org.carim.model.Turn#getActionDuration <em>Action Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActionDuration()
	 * @see #getActionDuration()
	 * @see #setActionDuration(long)
	 * @generated
	 */
	void unsetActionDuration();

	/**
	 * Returns whether the value of the '{@link org.carim.model.Turn#getActionDuration <em>Action Duration</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Action Duration</em>' attribute is set.
	 * @see #unsetActionDuration()
	 * @see #getActionDuration()
	 * @see #setActionDuration(long)
	 * @generated
	 */
	boolean isSetActionDuration();

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' attribute.
	 * @see #isSetElements()
	 * @see #unsetElements()
	 * @see #setElements(long)
	 * @see org.carim.model.carimModelPackage#getTurn_Elements()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long" required="true"
	 *        extendedMetaData="kind='element' name='elements' namespace='##targetNamespace'"
	 * @generated
	 */
	long getElements();

	/**
	 * Sets the value of the '{@link org.carim.model.Turn#getElements <em>Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elements</em>' attribute.
	 * @see #isSetElements()
	 * @see #unsetElements()
	 * @see #getElements()
	 * @generated
	 */
	void setElements(long value);

	/**
	 * Unsets the value of the '{@link org.carim.model.Turn#getElements <em>Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetElements()
	 * @see #getElements()
	 * @see #setElements(long)
	 * @generated
	 */
	void unsetElements();

	/**
	 * Returns whether the value of the '{@link org.carim.model.Turn#getElements <em>Elements</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Elements</em>' attribute is set.
	 * @see #unsetElements()
	 * @see #getElements()
	 * @see #setElements(long)
	 * @generated
	 */
	boolean isSetElements();

	/**
	 * Returns the value of the '<em><b>Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feedback</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feedback</em>' attribute.
	 * @see #isSetFeedback()
	 * @see #unsetFeedback()
	 * @see #setFeedback(long)
	 * @see org.carim.model.carimModelPackage#getTurn_Feedback()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long" required="true"
	 *        extendedMetaData="kind='element' name='feedback' namespace='##targetNamespace'"
	 * @generated
	 */
	long getFeedback();

	/**
	 * Sets the value of the '{@link org.carim.model.Turn#getFeedback <em>Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feedback</em>' attribute.
	 * @see #isSetFeedback()
	 * @see #unsetFeedback()
	 * @see #getFeedback()
	 * @generated
	 */
	void setFeedback(long value);

	/**
	 * Unsets the value of the '{@link org.carim.model.Turn#getFeedback <em>Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFeedback()
	 * @see #getFeedback()
	 * @see #setFeedback(long)
	 * @generated
	 */
	void unsetFeedback();

	/**
	 * Returns whether the value of the '{@link org.carim.model.Turn#getFeedback <em>Feedback</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Feedback</em>' attribute is set.
	 * @see #unsetFeedback()
	 * @see #getFeedback()
	 * @see #setFeedback(long)
	 * @generated
	 */
	boolean isSetFeedback();

	/**
	 * Returns the value of the '<em><b>Concepts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concepts</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concepts</em>' attribute.
	 * @see #isSetConcepts()
	 * @see #unsetConcepts()
	 * @see #setConcepts(long)
	 * @see org.carim.model.carimModelPackage#getTurn_Concepts()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long" required="true"
	 *        extendedMetaData="kind='element' name='concepts' namespace='##targetNamespace'"
	 * @generated
	 */
	long getConcepts();

	/**
	 * Sets the value of the '{@link org.carim.model.Turn#getConcepts <em>Concepts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concepts</em>' attribute.
	 * @see #isSetConcepts()
	 * @see #unsetConcepts()
	 * @see #getConcepts()
	 * @generated
	 */
	void setConcepts(long value);

	/**
	 * Unsets the value of the '{@link org.carim.model.Turn#getConcepts <em>Concepts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConcepts()
	 * @see #getConcepts()
	 * @see #setConcepts(long)
	 * @generated
	 */
	void unsetConcepts();

	/**
	 * Returns whether the value of the '{@link org.carim.model.Turn#getConcepts <em>Concepts</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Concepts</em>' attribute is set.
	 * @see #unsetConcepts()
	 * @see #getConcepts()
	 * @see #setConcepts(long)
	 * @generated
	 */
	boolean isSetConcepts();

	/**
	 * Returns the value of the '<em><b>Noise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Noise</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Noise</em>' attribute.
	 * @see #isSetNoise()
	 * @see #unsetNoise()
	 * @see #setNoise(long)
	 * @see org.carim.model.carimModelPackage#getTurn_Noise()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long" required="true"
	 *        extendedMetaData="kind='element' name='noise' namespace='##targetNamespace'"
	 * @generated
	 */
	long getNoise();

	/**
	 * Sets the value of the '{@link org.carim.model.Turn#getNoise <em>Noise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Noise</em>' attribute.
	 * @see #isSetNoise()
	 * @see #unsetNoise()
	 * @see #getNoise()
	 * @generated
	 */
	void setNoise(long value);

	/**
	 * Unsets the value of the '{@link org.carim.model.Turn#getNoise <em>Noise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNoise()
	 * @see #getNoise()
	 * @see #setNoise(long)
	 * @generated
	 */
	void unsetNoise();

	/**
	 * Returns whether the value of the '{@link org.carim.model.Turn#getNoise <em>Noise</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Noise</em>' attribute is set.
	 * @see #unsetNoise()
	 * @see #getNoise()
	 * @see #setNoise(long)
	 * @generated
	 */
	boolean isSetNoise();

	/**
	 * Returns the value of the '<em><b>Questions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Questions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Questions</em>' attribute.
	 * @see #isSetQuestions()
	 * @see #unsetQuestions()
	 * @see #setQuestions(long)
	 * @see org.carim.model.carimModelPackage#getTurn_Questions()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long" required="true"
	 *        extendedMetaData="kind='element' name='questions' namespace='##targetNamespace'"
	 * @generated
	 */
	long getQuestions();

	/**
	 * Sets the value of the '{@link org.carim.model.Turn#getQuestions <em>Questions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Questions</em>' attribute.
	 * @see #isSetQuestions()
	 * @see #unsetQuestions()
	 * @see #getQuestions()
	 * @generated
	 */
	void setQuestions(long value);

	/**
	 * Unsets the value of the '{@link org.carim.model.Turn#getQuestions <em>Questions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQuestions()
	 * @see #getQuestions()
	 * @see #setQuestions(long)
	 * @generated
	 */
	void unsetQuestions();

	/**
	 * Returns whether the value of the '{@link org.carim.model.Turn#getQuestions <em>Questions</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Questions</em>' attribute is set.
	 * @see #unsetQuestions()
	 * @see #getQuestions()
	 * @see #setQuestions(long)
	 * @generated
	 */
	boolean isSetQuestions();

	/**
	 * Returns the value of the '<em><b>Modality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modality</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modality</em>' containment reference.
	 * @see #setModality(ModalityInfo)
	 * @see org.carim.model.carimModelPackage#getTurn_Modality()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='modality' namespace='##targetNamespace'"
	 * @generated
	 */
	ModalityInfo getModality();

	/**
	 * Sets the value of the '{@link org.carim.model.Turn#getModality <em>Modality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modality</em>' containment reference.
	 * @see #getModality()
	 * @generated
	 */
	void setModality(ModalityInfo value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' containment reference.
	 * @see #setContext(DynamicContext)
	 * @see org.carim.model.carimModelPackage#getTurn_Context()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='context' namespace='##targetNamespace'"
	 * @generated
	 */
	DynamicContext getContext();

	/**
	 * Sets the value of the '{@link org.carim.model.Turn#getContext <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' containment reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(DynamicContext value);

} // Turn
