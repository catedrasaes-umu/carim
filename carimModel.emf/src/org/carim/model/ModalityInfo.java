/**
 */
package org.carim.model;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modality Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.carim.model.ModalityInfo#getModalityType <em>Modality Type</em>}</li>
 *   <li>{@link org.carim.model.ModalityInfo#getMminteractionType <em>Mminteraction Type</em>}</li>
 *   <li>{@link org.carim.model.ModalityInfo#getAppropriateness <em>Appropriateness</em>}</li>
 *   <li>{@link org.carim.model.ModalityInfo#getSynchroni <em>Synchroni</em>}</li>
 *   <li>{@link org.carim.model.ModalityInfo#getChange <em>Change</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.carim.model.carimModelPackage#getModalityInfo()
 * @model extendedMetaData="name='ModalityInfo' kind='elementOnly'"
 * @generated
 */
public interface ModalityInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Modality Type</b></em>' attribute list.
	 * The list contents are of type {@link org.carim.model.ModTypeT}.
	 * The literals are from the enumeration {@link org.carim.model.ModTypeT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modality Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modality Type</em>' attribute list.
	 * @see org.carim.model.ModTypeT
	 * @see org.carim.model.carimModelPackage#getModalityInfo_ModalityType()
	 * @model unique="false" required="true"
	 *        extendedMetaData="kind='element' name='modalityType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ModTypeT> getModalityType();

	/**
	 * Returns the value of the '<em><b>Mminteraction Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.carim.model.MmiTypeT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mminteraction Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mminteraction Type</em>' attribute.
	 * @see org.carim.model.MmiTypeT
	 * @see #isSetMminteractionType()
	 * @see #unsetMminteractionType()
	 * @see #setMminteractionType(MmiTypeT)
	 * @see org.carim.model.carimModelPackage#getModalityInfo_MminteractionType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='mminteractionType' namespace='##targetNamespace'"
	 * @generated
	 */
	MmiTypeT getMminteractionType();

	/**
	 * Sets the value of the '{@link org.carim.model.ModalityInfo#getMminteractionType <em>Mminteraction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mminteraction Type</em>' attribute.
	 * @see org.carim.model.MmiTypeT
	 * @see #isSetMminteractionType()
	 * @see #unsetMminteractionType()
	 * @see #getMminteractionType()
	 * @generated
	 */
	void setMminteractionType(MmiTypeT value);

	/**
	 * Unsets the value of the '{@link org.carim.model.ModalityInfo#getMminteractionType <em>Mminteraction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMminteractionType()
	 * @see #getMminteractionType()
	 * @see #setMminteractionType(MmiTypeT)
	 * @generated
	 */
	void unsetMminteractionType();

	/**
	 * Returns whether the value of the '{@link org.carim.model.ModalityInfo#getMminteractionType <em>Mminteraction Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mminteraction Type</em>' attribute is set.
	 * @see #unsetMminteractionType()
	 * @see #getMminteractionType()
	 * @see #setMminteractionType(MmiTypeT)
	 * @generated
	 */
	boolean isSetMminteractionType();

	/**
	 * Returns the value of the '<em><b>Appropriateness</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Appropriateness</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appropriateness</em>' containment reference.
	 * @see #setAppropriateness(ModalityAppropriateness)
	 * @see org.carim.model.carimModelPackage#getModalityInfo_Appropriateness()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='appropriateness' namespace='##targetNamespace'"
	 * @generated
	 */
	ModalityAppropriateness getAppropriateness();

	/**
	 * Sets the value of the '{@link org.carim.model.ModalityInfo#getAppropriateness <em>Appropriateness</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Appropriateness</em>' containment reference.
	 * @see #getAppropriateness()
	 * @generated
	 */
	void setAppropriateness(ModalityAppropriateness value);

	/**
	 * Returns the value of the '<em><b>Synchroni</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synchroni</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synchroni</em>' containment reference.
	 * @see #setSynchroni(ModalitySynchroni)
	 * @see org.carim.model.carimModelPackage#getModalityInfo_Synchroni()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='synchroni' namespace='##targetNamespace'"
	 * @generated
	 */
	ModalitySynchroni getSynchroni();

	/**
	 * Sets the value of the '{@link org.carim.model.ModalityInfo#getSynchroni <em>Synchroni</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synchroni</em>' containment reference.
	 * @see #getSynchroni()
	 * @generated
	 */
	void setSynchroni(ModalitySynchroni value);

	/**
	 * Returns the value of the '<em><b>Change</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change</em>' containment reference.
	 * @see #setChange(ModalityChange)
	 * @see org.carim.model.carimModelPackage#getModalityInfo_Change()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='change' namespace='##targetNamespace'"
	 * @generated
	 */
	ModalityChange getChange();

	/**
	 * Sets the value of the '{@link org.carim.model.ModalityInfo#getChange <em>Change</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change</em>' containment reference.
	 * @see #getChange()
	 * @generated
	 */
	void setChange(ModalityChange value);

} // ModalityInfo
