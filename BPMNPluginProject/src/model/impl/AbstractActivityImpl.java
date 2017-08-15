/**
 */
package model.impl;

import model.AbstractActivity;
import model.ModelPackage;

import org.eclipse.bpmn2.impl.ServiceTaskImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.AbstractActivityImpl#getAID <em>AID</em>}</li>
 *   <li>{@link model.impl.AbstractActivityImpl#getAName <em>AName</em>}</li>
 *   <li>{@link model.impl.AbstractActivityImpl#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractActivityImpl extends ServiceTaskImpl implements AbstractActivity {
	/**
	 * The default value of the '{@link #getAID() <em>AID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAID()
	 * @generated
	 * @ordered
	 */
	protected static final String AID_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getAID() <em>AID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAID()
	 * @generated
	 * @ordered
	 */
	protected String aID = AID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAName() <em>AName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAName()
	 * @generated
	 * @ordered
	 */
	protected static final String ANAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAName() <em>AName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAName()
	 * @generated
	 * @ordered
	 */
	protected String aName = ANAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> context;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ABSTRACT_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAID() {
		return aID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAID(String newAID) {
		String oldAID = aID;
		aID = newAID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ABSTRACT_ACTIVITY__AID, oldAID, aID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAName() {
		return aName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAName(String newAName) {
		String oldAName = aName;
		aName = newAName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ABSTRACT_ACTIVITY__ANAME, oldAName, aName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getContext() {
		if (context == null) {
			context = new EcoreEMap<String,String>(ModelPackage.Literals.CONTEXT, ContextImpl.class, this, ModelPackage.ABSTRACT_ACTIVITY__CONTEXT);
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.ABSTRACT_ACTIVITY__CONTEXT:
				return ((InternalEList<?>)getContext()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.ABSTRACT_ACTIVITY__AID:
				return getAID();
			case ModelPackage.ABSTRACT_ACTIVITY__ANAME:
				return getAName();
			case ModelPackage.ABSTRACT_ACTIVITY__CONTEXT:
				if (coreType) return getContext();
				else return getContext().map();
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
			case ModelPackage.ABSTRACT_ACTIVITY__AID:
				setAID((String)newValue);
				return;
			case ModelPackage.ABSTRACT_ACTIVITY__ANAME:
				setAName((String)newValue);
				return;
			case ModelPackage.ABSTRACT_ACTIVITY__CONTEXT:
				((EStructuralFeature.Setting)getContext()).set(newValue);
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
			case ModelPackage.ABSTRACT_ACTIVITY__AID:
				setAID(AID_EDEFAULT);
				return;
			case ModelPackage.ABSTRACT_ACTIVITY__ANAME:
				setAName(ANAME_EDEFAULT);
				return;
			case ModelPackage.ABSTRACT_ACTIVITY__CONTEXT:
				getContext().clear();
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
			case ModelPackage.ABSTRACT_ACTIVITY__AID:
				return AID_EDEFAULT == null ? aID != null : !AID_EDEFAULT.equals(aID);
			case ModelPackage.ABSTRACT_ACTIVITY__ANAME:
				return ANAME_EDEFAULT == null ? aName != null : !ANAME_EDEFAULT.equals(aName);
			case ModelPackage.ABSTRACT_ACTIVITY__CONTEXT:
				return context != null && !context.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (aID: ");
		result.append(aID);
		result.append(", aName: ");
		result.append(aName);
		result.append(')');
		return result.toString();
	}

} //AbstractActivityImpl
