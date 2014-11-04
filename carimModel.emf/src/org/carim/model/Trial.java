/**
 */
package org.carim.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trial</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.carim.model.Trial#getDescription <em>Description</em>}</li>
 *   <li>{@link org.carim.model.Trial#getUserData <em>User Data</em>}</li>
 *   <li>{@link org.carim.model.Trial#getDialogues <em>Dialogues</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.carim.model.carimModelPackage#getTrial()
 * @model extendedMetaData="name='Trial' kind='elementOnly'"
 * @generated
 */
public interface Trial extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.carim.model.carimModelPackage#getTrial_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.carim.model.Trial#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>User Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Data</em>' containment reference.
	 * @see #setUserData(UserData)
	 * @see org.carim.model.carimModelPackage#getTrial_UserData()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='userData' namespace='##targetNamespace'"
	 * @generated
	 */
	UserData getUserData();

	/**
	 * Sets the value of the '{@link org.carim.model.Trial#getUserData <em>User Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Data</em>' containment reference.
	 * @see #getUserData()
	 * @generated
	 */
	void setUserData(UserData value);

	/**
	 * Returns the value of the '<em><b>Dialogues</b></em>' containment reference list.
	 * The list contents are of type {@link org.carim.model.Dialogue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dialogues</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dialogues</em>' containment reference list.
	 * @see org.carim.model.carimModelPackage#getTrial_Dialogues()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='dialogues' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Dialogue> getDialogues();

} // Trial
