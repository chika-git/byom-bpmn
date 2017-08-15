/**
 */
package model.impl;

import model.AbstractActivity;
import model.DocumentRoot;
import model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.DocumentRootImpl#getAbstractActivity <em>Abstract Activity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getAbstractActivity() <em>Abstract Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractActivity()
	 * @generated
	 * @ordered
	 */
	protected AbstractActivity abstractActivity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractActivity getAbstractActivity() {
		return abstractActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractActivity(AbstractActivity newAbstractActivity, NotificationChain msgs) {
		AbstractActivity oldAbstractActivity = abstractActivity;
		abstractActivity = newAbstractActivity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.DOCUMENT_ROOT__ABSTRACT_ACTIVITY, oldAbstractActivity, newAbstractActivity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstractActivity(AbstractActivity newAbstractActivity) {
		if (newAbstractActivity != abstractActivity) {
			NotificationChain msgs = null;
			if (abstractActivity != null)
				msgs = ((InternalEObject)abstractActivity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.DOCUMENT_ROOT__ABSTRACT_ACTIVITY, null, msgs);
			if (newAbstractActivity != null)
				msgs = ((InternalEObject)newAbstractActivity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.DOCUMENT_ROOT__ABSTRACT_ACTIVITY, null, msgs);
			msgs = basicSetAbstractActivity(newAbstractActivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DOCUMENT_ROOT__ABSTRACT_ACTIVITY, newAbstractActivity, newAbstractActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.DOCUMENT_ROOT__ABSTRACT_ACTIVITY:
				return basicSetAbstractActivity(null, msgs);
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
			case ModelPackage.DOCUMENT_ROOT__ABSTRACT_ACTIVITY:
				return getAbstractActivity();
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
			case ModelPackage.DOCUMENT_ROOT__ABSTRACT_ACTIVITY:
				setAbstractActivity((AbstractActivity)newValue);
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
			case ModelPackage.DOCUMENT_ROOT__ABSTRACT_ACTIVITY:
				setAbstractActivity((AbstractActivity)null);
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
			case ModelPackage.DOCUMENT_ROOT__ABSTRACT_ACTIVITY:
				return abstractActivity != null;
		}
		return super.eIsSet(featureID);
	}

} //DocumentRootImpl
