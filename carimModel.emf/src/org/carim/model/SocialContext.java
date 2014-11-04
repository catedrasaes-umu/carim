/**
 */
package org.carim.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Social Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.carim.model.SocialContext#getCompany <em>Company</em>}</li>
 *   <li>{@link org.carim.model.SocialContext#getArena <em>Arena</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.carim.model.carimModelPackage#getSocialContext()
 * @model extendedMetaData="name='SocialContext' kind='elementOnly'"
 * @generated
 */
public interface SocialContext extends EObject {
	/**
	 * Returns the value of the '<em><b>Company</b></em>' attribute.
	 * The literals are from the enumeration {@link org.carim.model.SocialCompanyT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Company</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Company</em>' attribute.
	 * @see org.carim.model.SocialCompanyT
	 * @see #isSetCompany()
	 * @see #unsetCompany()
	 * @see #setCompany(SocialCompanyT)
	 * @see org.carim.model.carimModelPackage#getSocialContext_Company()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='company' namespace='##targetNamespace'"
	 * @generated
	 */
	SocialCompanyT getCompany();

	/**
	 * Sets the value of the '{@link org.carim.model.SocialContext#getCompany <em>Company</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Company</em>' attribute.
	 * @see org.carim.model.SocialCompanyT
	 * @see #isSetCompany()
	 * @see #unsetCompany()
	 * @see #getCompany()
	 * @generated
	 */
	void setCompany(SocialCompanyT value);

	/**
	 * Unsets the value of the '{@link org.carim.model.SocialContext#getCompany <em>Company</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCompany()
	 * @see #getCompany()
	 * @see #setCompany(SocialCompanyT)
	 * @generated
	 */
	void unsetCompany();

	/**
	 * Returns whether the value of the '{@link org.carim.model.SocialContext#getCompany <em>Company</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Company</em>' attribute is set.
	 * @see #unsetCompany()
	 * @see #getCompany()
	 * @see #setCompany(SocialCompanyT)
	 * @generated
	 */
	boolean isSetCompany();

	/**
	 * Returns the value of the '<em><b>Arena</b></em>' attribute.
	 * The literals are from the enumeration {@link org.carim.model.SocialArenaT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arena</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arena</em>' attribute.
	 * @see org.carim.model.SocialArenaT
	 * @see #isSetArena()
	 * @see #unsetArena()
	 * @see #setArena(SocialArenaT)
	 * @see org.carim.model.carimModelPackage#getSocialContext_Arena()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='arena' namespace='##targetNamespace'"
	 * @generated
	 */
	SocialArenaT getArena();

	/**
	 * Sets the value of the '{@link org.carim.model.SocialContext#getArena <em>Arena</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arena</em>' attribute.
	 * @see org.carim.model.SocialArenaT
	 * @see #isSetArena()
	 * @see #unsetArena()
	 * @see #getArena()
	 * @generated
	 */
	void setArena(SocialArenaT value);

	/**
	 * Unsets the value of the '{@link org.carim.model.SocialContext#getArena <em>Arena</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetArena()
	 * @see #getArena()
	 * @see #setArena(SocialArenaT)
	 * @generated
	 */
	void unsetArena();

	/**
	 * Returns whether the value of the '{@link org.carim.model.SocialContext#getArena <em>Arena</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Arena</em>' attribute is set.
	 * @see #unsetArena()
	 * @see #getArena()
	 * @see #setArena(SocialArenaT)
	 * @generated
	 */
	boolean isSetArena();

} // SocialContext
