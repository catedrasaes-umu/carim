/**
 */
package org.mmi.events;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dialogue Content Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mmi.events.DialogueContentEvent#getNitems <em>Nitems</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mmi.events.EventsPackage#getDialogueContentEvent()
 * @model abstract="true"
 * @generated
 */
public interface DialogueContentEvent extends Event {
	/**
	 * Returns the value of the '<em><b>Nitems</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nitems</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nitems</em>' attribute.
	 * @see #setNitems(int)
	 * @see org.mmi.events.EventsPackage#getDialogueContentEvent_Nitems()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getNitems();

	/**
	 * Sets the value of the '{@link org.mmi.events.DialogueContentEvent#getNitems <em>Nitems</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nitems</em>' attribute.
	 * @see #getNitems()
	 * @generated
	 */
	void setNitems(int value);

} // DialogueContentEvent
