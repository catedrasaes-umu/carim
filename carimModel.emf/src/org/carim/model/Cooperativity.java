/**
 */
package org.carim.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cooperativity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.carim.model.Cooperativity#getContextualAppropriateness <em>Contextual Appropriateness</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.carim.model.carimModelPackage#getCooperativity()
 * @model extendedMetaData="name='Cooperativity' kind='elementOnly'"
 * @generated
 */
public interface Cooperativity extends EObject {
	/**
	 * Returns the value of the '<em><b>Contextual Appropriateness</b></em>' attribute.
	 * The literals are from the enumeration {@link org.carim.model.ContextualAppropriatenessT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contextual Appropriateness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contextual Appropriateness</em>' attribute.
	 * @see org.carim.model.ContextualAppropriatenessT
	 * @see #isSetContextualAppropriateness()
	 * @see #unsetContextualAppropriateness()
	 * @see #setContextualAppropriateness(ContextualAppropriatenessT)
	 * @see org.carim.model.carimModelPackage#getCooperativity_ContextualAppropriateness()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='contextualAppropriateness' namespace='##targetNamespace'"
	 * @generated
	 */
	ContextualAppropriatenessT getContextualAppropriateness();

	/**
	 * Sets the value of the '{@link org.carim.model.Cooperativity#getContextualAppropriateness <em>Contextual Appropriateness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contextual Appropriateness</em>' attribute.
	 * @see org.carim.model.ContextualAppropriatenessT
	 * @see #isSetContextualAppropriateness()
	 * @see #unsetContextualAppropriateness()
	 * @see #getContextualAppropriateness()
	 * @generated
	 */
	void setContextualAppropriateness(ContextualAppropriatenessT value);

	/**
	 * Unsets the value of the '{@link org.carim.model.Cooperativity#getContextualAppropriateness <em>Contextual Appropriateness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetContextualAppropriateness()
	 * @see #getContextualAppropriateness()
	 * @see #setContextualAppropriateness(ContextualAppropriatenessT)
	 * @generated
	 */
	void unsetContextualAppropriateness();

	/**
	 * Returns whether the value of the '{@link org.carim.model.Cooperativity#getContextualAppropriateness <em>Contextual Appropriateness</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Contextual Appropriateness</em>' attribute is set.
	 * @see #unsetContextualAppropriateness()
	 * @see #getContextualAppropriateness()
	 * @see #setContextualAppropriateness(ContextualAppropriatenessT)
	 * @generated
	 */
	boolean isSetContextualAppropriateness();

} // Cooperativity
