/**
 */
package org.carim.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamic Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.carim.model.DynamicContext#getPhysicalContext <em>Physical Context</em>}</li>
 *   <li>{@link org.carim.model.DynamicContext#getSocialContext <em>Social Context</em>}</li>
 *   <li>{@link org.carim.model.DynamicContext#getLocationTimeContext <em>Location Time Context</em>}</li>
 *   <li>{@link org.carim.model.DynamicContext#getDeviceContext <em>Device Context</em>}</li>
 *   <li>{@link org.carim.model.DynamicContext#getCommunicationContext <em>Communication Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.carim.model.carimModelPackage#getDynamicContext()
 * @model extendedMetaData="name='DynamicContext' kind='elementOnly'"
 * @generated
 */
public interface DynamicContext extends EObject {
	/**
	 * Returns the value of the '<em><b>Physical Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Physical Context</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physical Context</em>' containment reference.
	 * @see #setPhysicalContext(PhysicalContext)
	 * @see org.carim.model.carimModelPackage#getDynamicContext_PhysicalContext()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='physicalContext' namespace='##targetNamespace'"
	 * @generated
	 */
	PhysicalContext getPhysicalContext();

	/**
	 * Sets the value of the '{@link org.carim.model.DynamicContext#getPhysicalContext <em>Physical Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical Context</em>' containment reference.
	 * @see #getPhysicalContext()
	 * @generated
	 */
	void setPhysicalContext(PhysicalContext value);

	/**
	 * Returns the value of the '<em><b>Social Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Social Context</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Social Context</em>' containment reference.
	 * @see #setSocialContext(SocialContext)
	 * @see org.carim.model.carimModelPackage#getDynamicContext_SocialContext()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='socialContext' namespace='##targetNamespace'"
	 * @generated
	 */
	SocialContext getSocialContext();

	/**
	 * Sets the value of the '{@link org.carim.model.DynamicContext#getSocialContext <em>Social Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Social Context</em>' containment reference.
	 * @see #getSocialContext()
	 * @generated
	 */
	void setSocialContext(SocialContext value);

	/**
	 * Returns the value of the '<em><b>Location Time Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location Time Context</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location Time Context</em>' containment reference.
	 * @see #setLocationTimeContext(LocationTimeContext)
	 * @see org.carim.model.carimModelPackage#getDynamicContext_LocationTimeContext()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='locationTimeContext' namespace='##targetNamespace'"
	 * @generated
	 */
	LocationTimeContext getLocationTimeContext();

	/**
	 * Sets the value of the '{@link org.carim.model.DynamicContext#getLocationTimeContext <em>Location Time Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Time Context</em>' containment reference.
	 * @see #getLocationTimeContext()
	 * @generated
	 */
	void setLocationTimeContext(LocationTimeContext value);

	/**
	 * Returns the value of the '<em><b>Device Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device Context</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Context</em>' containment reference.
	 * @see #setDeviceContext(DeviceContext)
	 * @see org.carim.model.carimModelPackage#getDynamicContext_DeviceContext()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='deviceContext' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceContext getDeviceContext();

	/**
	 * Sets the value of the '{@link org.carim.model.DynamicContext#getDeviceContext <em>Device Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Context</em>' containment reference.
	 * @see #getDeviceContext()
	 * @generated
	 */
	void setDeviceContext(DeviceContext value);

	/**
	 * Returns the value of the '<em><b>Communication Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication Context</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Context</em>' containment reference.
	 * @see #setCommunicationContext(CommunicationContext)
	 * @see org.carim.model.carimModelPackage#getDynamicContext_CommunicationContext()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='communicationContext' namespace='##targetNamespace'"
	 * @generated
	 */
	CommunicationContext getCommunicationContext();

	/**
	 * Sets the value of the '{@link org.carim.model.DynamicContext#getCommunicationContext <em>Communication Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication Context</em>' containment reference.
	 * @see #getCommunicationContext()
	 * @generated
	 */
	void setCommunicationContext(CommunicationContext value);

} // DynamicContext
