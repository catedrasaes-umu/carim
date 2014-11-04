/**
 */
package org.carim.model.impl;

import org.carim.model.CommunicationContext;
import org.carim.model.DeviceContext;
import org.carim.model.DynamicContext;
import org.carim.model.LocationTimeContext;
import org.carim.model.PhysicalContext;
import org.carim.model.SocialContext;
import org.carim.model.carimModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dynamic Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.carim.model.impl.DynamicContextImpl#getPhysicalContext <em>Physical Context</em>}</li>
 *   <li>{@link org.carim.model.impl.DynamicContextImpl#getSocialContext <em>Social Context</em>}</li>
 *   <li>{@link org.carim.model.impl.DynamicContextImpl#getLocationTimeContext <em>Location Time Context</em>}</li>
 *   <li>{@link org.carim.model.impl.DynamicContextImpl#getDeviceContext <em>Device Context</em>}</li>
 *   <li>{@link org.carim.model.impl.DynamicContextImpl#getCommunicationContext <em>Communication Context</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DynamicContextImpl extends EObjectImpl implements DynamicContext {
	/**
	 * The cached value of the '{@link #getPhysicalContext() <em>Physical Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalContext()
	 * @generated
	 * @ordered
	 */
	protected PhysicalContext physicalContext;

	/**
	 * The cached value of the '{@link #getSocialContext() <em>Social Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialContext()
	 * @generated
	 * @ordered
	 */
	protected SocialContext socialContext;

	/**
	 * The cached value of the '{@link #getLocationTimeContext() <em>Location Time Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationTimeContext()
	 * @generated
	 * @ordered
	 */
	protected LocationTimeContext locationTimeContext;

	/**
	 * The cached value of the '{@link #getDeviceContext() <em>Device Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceContext()
	 * @generated
	 * @ordered
	 */
	protected DeviceContext deviceContext;

	/**
	 * The cached value of the '{@link #getCommunicationContext() <em>Communication Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationContext()
	 * @generated
	 * @ordered
	 */
	protected CommunicationContext communicationContext;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return carimModelPackage.Literals.DYNAMIC_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalContext getPhysicalContext() {
		return physicalContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhysicalContext(PhysicalContext newPhysicalContext, NotificationChain msgs) {
		PhysicalContext oldPhysicalContext = physicalContext;
		physicalContext = newPhysicalContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, carimModelPackage.DYNAMIC_CONTEXT__PHYSICAL_CONTEXT, oldPhysicalContext, newPhysicalContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhysicalContext(PhysicalContext newPhysicalContext) {
		if (newPhysicalContext != physicalContext) {
			NotificationChain msgs = null;
			if (physicalContext != null)
				msgs = ((InternalEObject)physicalContext).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - carimModelPackage.DYNAMIC_CONTEXT__PHYSICAL_CONTEXT, null, msgs);
			if (newPhysicalContext != null)
				msgs = ((InternalEObject)newPhysicalContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - carimModelPackage.DYNAMIC_CONTEXT__PHYSICAL_CONTEXT, null, msgs);
			msgs = basicSetPhysicalContext(newPhysicalContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.DYNAMIC_CONTEXT__PHYSICAL_CONTEXT, newPhysicalContext, newPhysicalContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialContext getSocialContext() {
		return socialContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSocialContext(SocialContext newSocialContext, NotificationChain msgs) {
		SocialContext oldSocialContext = socialContext;
		socialContext = newSocialContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, carimModelPackage.DYNAMIC_CONTEXT__SOCIAL_CONTEXT, oldSocialContext, newSocialContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSocialContext(SocialContext newSocialContext) {
		if (newSocialContext != socialContext) {
			NotificationChain msgs = null;
			if (socialContext != null)
				msgs = ((InternalEObject)socialContext).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - carimModelPackage.DYNAMIC_CONTEXT__SOCIAL_CONTEXT, null, msgs);
			if (newSocialContext != null)
				msgs = ((InternalEObject)newSocialContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - carimModelPackage.DYNAMIC_CONTEXT__SOCIAL_CONTEXT, null, msgs);
			msgs = basicSetSocialContext(newSocialContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.DYNAMIC_CONTEXT__SOCIAL_CONTEXT, newSocialContext, newSocialContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationTimeContext getLocationTimeContext() {
		return locationTimeContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocationTimeContext(LocationTimeContext newLocationTimeContext, NotificationChain msgs) {
		LocationTimeContext oldLocationTimeContext = locationTimeContext;
		locationTimeContext = newLocationTimeContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, carimModelPackage.DYNAMIC_CONTEXT__LOCATION_TIME_CONTEXT, oldLocationTimeContext, newLocationTimeContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocationTimeContext(LocationTimeContext newLocationTimeContext) {
		if (newLocationTimeContext != locationTimeContext) {
			NotificationChain msgs = null;
			if (locationTimeContext != null)
				msgs = ((InternalEObject)locationTimeContext).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - carimModelPackage.DYNAMIC_CONTEXT__LOCATION_TIME_CONTEXT, null, msgs);
			if (newLocationTimeContext != null)
				msgs = ((InternalEObject)newLocationTimeContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - carimModelPackage.DYNAMIC_CONTEXT__LOCATION_TIME_CONTEXT, null, msgs);
			msgs = basicSetLocationTimeContext(newLocationTimeContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.DYNAMIC_CONTEXT__LOCATION_TIME_CONTEXT, newLocationTimeContext, newLocationTimeContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceContext getDeviceContext() {
		return deviceContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviceContext(DeviceContext newDeviceContext, NotificationChain msgs) {
		DeviceContext oldDeviceContext = deviceContext;
		deviceContext = newDeviceContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, carimModelPackage.DYNAMIC_CONTEXT__DEVICE_CONTEXT, oldDeviceContext, newDeviceContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviceContext(DeviceContext newDeviceContext) {
		if (newDeviceContext != deviceContext) {
			NotificationChain msgs = null;
			if (deviceContext != null)
				msgs = ((InternalEObject)deviceContext).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - carimModelPackage.DYNAMIC_CONTEXT__DEVICE_CONTEXT, null, msgs);
			if (newDeviceContext != null)
				msgs = ((InternalEObject)newDeviceContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - carimModelPackage.DYNAMIC_CONTEXT__DEVICE_CONTEXT, null, msgs);
			msgs = basicSetDeviceContext(newDeviceContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.DYNAMIC_CONTEXT__DEVICE_CONTEXT, newDeviceContext, newDeviceContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationContext getCommunicationContext() {
		return communicationContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommunicationContext(CommunicationContext newCommunicationContext, NotificationChain msgs) {
		CommunicationContext oldCommunicationContext = communicationContext;
		communicationContext = newCommunicationContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, carimModelPackage.DYNAMIC_CONTEXT__COMMUNICATION_CONTEXT, oldCommunicationContext, newCommunicationContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommunicationContext(CommunicationContext newCommunicationContext) {
		if (newCommunicationContext != communicationContext) {
			NotificationChain msgs = null;
			if (communicationContext != null)
				msgs = ((InternalEObject)communicationContext).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - carimModelPackage.DYNAMIC_CONTEXT__COMMUNICATION_CONTEXT, null, msgs);
			if (newCommunicationContext != null)
				msgs = ((InternalEObject)newCommunicationContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - carimModelPackage.DYNAMIC_CONTEXT__COMMUNICATION_CONTEXT, null, msgs);
			msgs = basicSetCommunicationContext(newCommunicationContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, carimModelPackage.DYNAMIC_CONTEXT__COMMUNICATION_CONTEXT, newCommunicationContext, newCommunicationContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case carimModelPackage.DYNAMIC_CONTEXT__PHYSICAL_CONTEXT:
				return basicSetPhysicalContext(null, msgs);
			case carimModelPackage.DYNAMIC_CONTEXT__SOCIAL_CONTEXT:
				return basicSetSocialContext(null, msgs);
			case carimModelPackage.DYNAMIC_CONTEXT__LOCATION_TIME_CONTEXT:
				return basicSetLocationTimeContext(null, msgs);
			case carimModelPackage.DYNAMIC_CONTEXT__DEVICE_CONTEXT:
				return basicSetDeviceContext(null, msgs);
			case carimModelPackage.DYNAMIC_CONTEXT__COMMUNICATION_CONTEXT:
				return basicSetCommunicationContext(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case carimModelPackage.DYNAMIC_CONTEXT__PHYSICAL_CONTEXT:
				return getPhysicalContext();
			case carimModelPackage.DYNAMIC_CONTEXT__SOCIAL_CONTEXT:
				return getSocialContext();
			case carimModelPackage.DYNAMIC_CONTEXT__LOCATION_TIME_CONTEXT:
				return getLocationTimeContext();
			case carimModelPackage.DYNAMIC_CONTEXT__DEVICE_CONTEXT:
				return getDeviceContext();
			case carimModelPackage.DYNAMIC_CONTEXT__COMMUNICATION_CONTEXT:
				return getCommunicationContext();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case carimModelPackage.DYNAMIC_CONTEXT__PHYSICAL_CONTEXT:
				setPhysicalContext((PhysicalContext)newValue);
				return;
			case carimModelPackage.DYNAMIC_CONTEXT__SOCIAL_CONTEXT:
				setSocialContext((SocialContext)newValue);
				return;
			case carimModelPackage.DYNAMIC_CONTEXT__LOCATION_TIME_CONTEXT:
				setLocationTimeContext((LocationTimeContext)newValue);
				return;
			case carimModelPackage.DYNAMIC_CONTEXT__DEVICE_CONTEXT:
				setDeviceContext((DeviceContext)newValue);
				return;
			case carimModelPackage.DYNAMIC_CONTEXT__COMMUNICATION_CONTEXT:
				setCommunicationContext((CommunicationContext)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case carimModelPackage.DYNAMIC_CONTEXT__PHYSICAL_CONTEXT:
				setPhysicalContext((PhysicalContext)null);
				return;
			case carimModelPackage.DYNAMIC_CONTEXT__SOCIAL_CONTEXT:
				setSocialContext((SocialContext)null);
				return;
			case carimModelPackage.DYNAMIC_CONTEXT__LOCATION_TIME_CONTEXT:
				setLocationTimeContext((LocationTimeContext)null);
				return;
			case carimModelPackage.DYNAMIC_CONTEXT__DEVICE_CONTEXT:
				setDeviceContext((DeviceContext)null);
				return;
			case carimModelPackage.DYNAMIC_CONTEXT__COMMUNICATION_CONTEXT:
				setCommunicationContext((CommunicationContext)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case carimModelPackage.DYNAMIC_CONTEXT__PHYSICAL_CONTEXT:
				return physicalContext != null;
			case carimModelPackage.DYNAMIC_CONTEXT__SOCIAL_CONTEXT:
				return socialContext != null;
			case carimModelPackage.DYNAMIC_CONTEXT__LOCATION_TIME_CONTEXT:
				return locationTimeContext != null;
			case carimModelPackage.DYNAMIC_CONTEXT__DEVICE_CONTEXT:
				return deviceContext != null;
			case carimModelPackage.DYNAMIC_CONTEXT__COMMUNICATION_CONTEXT:
				return communicationContext != null;
		}
		return super.eIsSet(featureID);
	}

} //DynamicContextImpl
