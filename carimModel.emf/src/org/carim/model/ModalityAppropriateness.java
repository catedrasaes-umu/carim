/**
 */
package org.carim.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modality Appropriateness</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.carim.model.ModalityAppropriateness#getAppropriateness <em>Appropriateness</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.carim.model.carimModelPackage#getModalityAppropriateness()
 * @model extendedMetaData="name='ModalityAppropriateness' kind='elementOnly'"
 * @generated
 */
public interface ModalityAppropriateness extends EObject {
	/**
	 * Returns the value of the '<em><b>Appropriateness</b></em>' attribute.
	 * The literals are from the enumeration {@link org.carim.model.ModAppropT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Appropriateness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appropriateness</em>' attribute.
	 * @see org.carim.model.ModAppropT
	 * @see #isSetAppropriateness()
	 * @see #unsetAppropriateness()
	 * @see #setAppropriateness(ModAppropT)
	 * @see org.carim.model.carimModelPackage#getModalityAppropriateness_Appropriateness()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='appropriateness' namespace='##targetNamespace'"
	 * @generated
	 */
	ModAppropT getAppropriateness();

	/**
	 * Sets the value of the '{@link org.carim.model.ModalityAppropriateness#getAppropriateness <em>Appropriateness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Appropriateness</em>' attribute.
	 * @see org.carim.model.ModAppropT
	 * @see #isSetAppropriateness()
	 * @see #unsetAppropriateness()
	 * @see #getAppropriateness()
	 * @generated
	 */
	void setAppropriateness(ModAppropT value);

	/**
	 * Unsets the value of the '{@link org.carim.model.ModalityAppropriateness#getAppropriateness <em>Appropriateness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAppropriateness()
	 * @see #getAppropriateness()
	 * @see #setAppropriateness(ModAppropT)
	 * @generated
	 */
	void unsetAppropriateness();

	/**
	 * Returns whether the value of the '{@link org.carim.model.ModalityAppropriateness#getAppropriateness <em>Appropriateness</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Appropriateness</em>' attribute is set.
	 * @see #unsetAppropriateness()
	 * @see #getAppropriateness()
	 * @see #setAppropriateness(ModAppropT)
	 * @generated
	 */
	boolean isSetAppropriateness();

} // ModalityAppropriateness
