/**
 */
package org.carim.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Time T</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.carim.model.DateTimeT#getDDay <em>DDay</em>}</li>
 *   <li>{@link org.carim.model.DateTimeT#getDMonth <em>DMonth</em>}</li>
 *   <li>{@link org.carim.model.DateTimeT#getDYear <em>DYear</em>}</li>
 *   <li>{@link org.carim.model.DateTimeT#getTHours <em>THours</em>}</li>
 *   <li>{@link org.carim.model.DateTimeT#getTMins <em>TMins</em>}</li>
 *   <li>{@link org.carim.model.DateTimeT#getTSecs <em>TSecs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.carim.model.carimModelPackage#getDateTimeT()
 * @model extendedMetaData="name='date_time_t' kind='empty'"
 * @generated
 */
public interface DateTimeT extends EObject {
	/**
	 * Returns the value of the '<em><b>DDay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DDay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DDay</em>' attribute.
	 * @see #isSetDDay()
	 * @see #unsetDDay()
	 * @see #setDDay(int)
	 * @see org.carim.model.carimModelPackage#getDateTimeT_DDay()
	 * @model unsettable="true" dataType="org.carim.model.DDayType"
	 *        extendedMetaData="kind='attribute' name='d_day'"
	 * @generated
	 */
	int getDDay();

	/**
	 * Sets the value of the '{@link org.carim.model.DateTimeT#getDDay <em>DDay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DDay</em>' attribute.
	 * @see #isSetDDay()
	 * @see #unsetDDay()
	 * @see #getDDay()
	 * @generated
	 */
	void setDDay(int value);

	/**
	 * Unsets the value of the '{@link org.carim.model.DateTimeT#getDDay <em>DDay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDDay()
	 * @see #getDDay()
	 * @see #setDDay(int)
	 * @generated
	 */
	void unsetDDay();

	/**
	 * Returns whether the value of the '{@link org.carim.model.DateTimeT#getDDay <em>DDay</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>DDay</em>' attribute is set.
	 * @see #unsetDDay()
	 * @see #getDDay()
	 * @see #setDDay(int)
	 * @generated
	 */
	boolean isSetDDay();

	/**
	 * Returns the value of the '<em><b>DMonth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DMonth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DMonth</em>' attribute.
	 * @see #isSetDMonth()
	 * @see #unsetDMonth()
	 * @see #setDMonth(int)
	 * @see org.carim.model.carimModelPackage#getDateTimeT_DMonth()
	 * @model unsettable="true" dataType="org.carim.model.DMonthType"
	 *        extendedMetaData="kind='attribute' name='d_month'"
	 * @generated
	 */
	int getDMonth();

	/**
	 * Sets the value of the '{@link org.carim.model.DateTimeT#getDMonth <em>DMonth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DMonth</em>' attribute.
	 * @see #isSetDMonth()
	 * @see #unsetDMonth()
	 * @see #getDMonth()
	 * @generated
	 */
	void setDMonth(int value);

	/**
	 * Unsets the value of the '{@link org.carim.model.DateTimeT#getDMonth <em>DMonth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDMonth()
	 * @see #getDMonth()
	 * @see #setDMonth(int)
	 * @generated
	 */
	void unsetDMonth();

	/**
	 * Returns whether the value of the '{@link org.carim.model.DateTimeT#getDMonth <em>DMonth</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>DMonth</em>' attribute is set.
	 * @see #unsetDMonth()
	 * @see #getDMonth()
	 * @see #setDMonth(int)
	 * @generated
	 */
	boolean isSetDMonth();

	/**
	 * Returns the value of the '<em><b>DYear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DYear</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DYear</em>' attribute.
	 * @see #isSetDYear()
	 * @see #unsetDYear()
	 * @see #setDYear(int)
	 * @see org.carim.model.carimModelPackage#getDateTimeT_DYear()
	 * @model unsettable="true" dataType="org.carim.model.DYearType"
	 *        extendedMetaData="kind='attribute' name='d_year'"
	 * @generated
	 */
	int getDYear();

	/**
	 * Sets the value of the '{@link org.carim.model.DateTimeT#getDYear <em>DYear</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DYear</em>' attribute.
	 * @see #isSetDYear()
	 * @see #unsetDYear()
	 * @see #getDYear()
	 * @generated
	 */
	void setDYear(int value);

	/**
	 * Unsets the value of the '{@link org.carim.model.DateTimeT#getDYear <em>DYear</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDYear()
	 * @see #getDYear()
	 * @see #setDYear(int)
	 * @generated
	 */
	void unsetDYear();

	/**
	 * Returns whether the value of the '{@link org.carim.model.DateTimeT#getDYear <em>DYear</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>DYear</em>' attribute is set.
	 * @see #unsetDYear()
	 * @see #getDYear()
	 * @see #setDYear(int)
	 * @generated
	 */
	boolean isSetDYear();

	/**
	 * Returns the value of the '<em><b>THours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>THours</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>THours</em>' attribute.
	 * @see #isSetTHours()
	 * @see #unsetTHours()
	 * @see #setTHours(int)
	 * @see org.carim.model.carimModelPackage#getDateTimeT_THours()
	 * @model unsettable="true" dataType="org.carim.model.THoursType"
	 *        extendedMetaData="kind='attribute' name='t_hours'"
	 * @generated
	 */
	int getTHours();

	/**
	 * Sets the value of the '{@link org.carim.model.DateTimeT#getTHours <em>THours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>THours</em>' attribute.
	 * @see #isSetTHours()
	 * @see #unsetTHours()
	 * @see #getTHours()
	 * @generated
	 */
	void setTHours(int value);

	/**
	 * Unsets the value of the '{@link org.carim.model.DateTimeT#getTHours <em>THours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTHours()
	 * @see #getTHours()
	 * @see #setTHours(int)
	 * @generated
	 */
	void unsetTHours();

	/**
	 * Returns whether the value of the '{@link org.carim.model.DateTimeT#getTHours <em>THours</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>THours</em>' attribute is set.
	 * @see #unsetTHours()
	 * @see #getTHours()
	 * @see #setTHours(int)
	 * @generated
	 */
	boolean isSetTHours();

	/**
	 * Returns the value of the '<em><b>TMins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TMins</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TMins</em>' attribute.
	 * @see #isSetTMins()
	 * @see #unsetTMins()
	 * @see #setTMins(int)
	 * @see org.carim.model.carimModelPackage#getDateTimeT_TMins()
	 * @model unsettable="true" dataType="org.carim.model.TMinsType"
	 *        extendedMetaData="kind='attribute' name='t_mins'"
	 * @generated
	 */
	int getTMins();

	/**
	 * Sets the value of the '{@link org.carim.model.DateTimeT#getTMins <em>TMins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TMins</em>' attribute.
	 * @see #isSetTMins()
	 * @see #unsetTMins()
	 * @see #getTMins()
	 * @generated
	 */
	void setTMins(int value);

	/**
	 * Unsets the value of the '{@link org.carim.model.DateTimeT#getTMins <em>TMins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTMins()
	 * @see #getTMins()
	 * @see #setTMins(int)
	 * @generated
	 */
	void unsetTMins();

	/**
	 * Returns whether the value of the '{@link org.carim.model.DateTimeT#getTMins <em>TMins</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>TMins</em>' attribute is set.
	 * @see #unsetTMins()
	 * @see #getTMins()
	 * @see #setTMins(int)
	 * @generated
	 */
	boolean isSetTMins();

	/**
	 * Returns the value of the '<em><b>TSecs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TSecs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TSecs</em>' attribute.
	 * @see #isSetTSecs()
	 * @see #unsetTSecs()
	 * @see #setTSecs(int)
	 * @see org.carim.model.carimModelPackage#getDateTimeT_TSecs()
	 * @model unsettable="true" dataType="org.carim.model.TSecsType"
	 *        extendedMetaData="kind='attribute' name='t_secs'"
	 * @generated
	 */
	int getTSecs();

	/**
	 * Sets the value of the '{@link org.carim.model.DateTimeT#getTSecs <em>TSecs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TSecs</em>' attribute.
	 * @see #isSetTSecs()
	 * @see #unsetTSecs()
	 * @see #getTSecs()
	 * @generated
	 */
	void setTSecs(int value);

	/**
	 * Unsets the value of the '{@link org.carim.model.DateTimeT#getTSecs <em>TSecs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTSecs()
	 * @see #getTSecs()
	 * @see #setTSecs(int)
	 * @generated
	 */
	void unsetTSecs();

	/**
	 * Returns whether the value of the '{@link org.carim.model.DateTimeT#getTSecs <em>TSecs</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>TSecs</em>' attribute is set.
	 * @see #unsetTSecs()
	 * @see #getTSecs()
	 * @see #setTSecs(int)
	 * @generated
	 */
	boolean isSetTSecs();

} // DateTimeT
