/**
 */
package org.mmi.events;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key Explore Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mmi.events.KeyExploreEvent#getCode <em>Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mmi.events.EventsPackage#getKeyExploreEvent()
 * @model
 * @generated
 */
public interface KeyExploreEvent extends TextEvent {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(int)
	 * @see org.mmi.events.EventsPackage#getKeyExploreEvent_Code()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getCode();

	/**
	 * Sets the value of the '{@link org.mmi.events.KeyExploreEvent#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(int value);

} // KeyExploreEvent
