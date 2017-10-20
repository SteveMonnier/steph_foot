/**
 */
package fr.steph.foot.matchs.impl;

import fr.steph.foot.matchs.Action;
import fr.steph.foot.matchs.ActionEnd;
import fr.steph.foot.matchs.MatchsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.steph.foot.matchs.impl.ActionImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.steph.foot.matchs.impl.ActionImpl#getSendingEnd <em>Sending End</em>}</li>
 *   <li>{@link fr.steph.foot.matchs.impl.ActionImpl#getReceivingEnd <em>Receiving End</em>}</li>
 *   <li>{@link fr.steph.foot.matchs.impl.ActionImpl#getTemps <em>Temps</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ActionImpl extends MinimalEObjectImpl.Container implements Action {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSendingEnd() <em>Sending End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendingEnd()
	 * @generated
	 * @ordered
	 */
	protected ActionEnd sendingEnd;

	/**
	 * The cached value of the '{@link #getReceivingEnd() <em>Receiving End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivingEnd()
	 * @generated
	 * @ordered
	 */
	protected ActionEnd receivingEnd;

	/**
	 * The default value of the '{@link #getTemps() <em>Temps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemps()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMPS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTemps() <em>Temps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemps()
	 * @generated
	 * @ordered
	 */
	protected String temps = TEMPS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MatchsPackage.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatchsPackage.ACTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionEnd getSendingEnd() {
		if (sendingEnd != null && sendingEnd.eIsProxy()) {
			InternalEObject oldSendingEnd = (InternalEObject)sendingEnd;
			sendingEnd = (ActionEnd)eResolveProxy(oldSendingEnd);
			if (sendingEnd != oldSendingEnd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MatchsPackage.ACTION__SENDING_END, oldSendingEnd, sendingEnd));
			}
		}
		return sendingEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionEnd basicGetSendingEnd() {
		return sendingEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSendingEnd(ActionEnd newSendingEnd) {
		ActionEnd oldSendingEnd = sendingEnd;
		sendingEnd = newSendingEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatchsPackage.ACTION__SENDING_END, oldSendingEnd, sendingEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionEnd getReceivingEnd() {
		if (receivingEnd != null && receivingEnd.eIsProxy()) {
			InternalEObject oldReceivingEnd = (InternalEObject)receivingEnd;
			receivingEnd = (ActionEnd)eResolveProxy(oldReceivingEnd);
			if (receivingEnd != oldReceivingEnd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MatchsPackage.ACTION__RECEIVING_END, oldReceivingEnd, receivingEnd));
			}
		}
		return receivingEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionEnd basicGetReceivingEnd() {
		return receivingEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceivingEnd(ActionEnd newReceivingEnd) {
		ActionEnd oldReceivingEnd = receivingEnd;
		receivingEnd = newReceivingEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatchsPackage.ACTION__RECEIVING_END, oldReceivingEnd, receivingEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTemps() {
		return temps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemps(String newTemps) {
		String oldTemps = temps;
		temps = newTemps;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatchsPackage.ACTION__TEMPS, oldTemps, temps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MatchsPackage.ACTION__NAME:
				return getName();
			case MatchsPackage.ACTION__SENDING_END:
				if (resolve) return getSendingEnd();
				return basicGetSendingEnd();
			case MatchsPackage.ACTION__RECEIVING_END:
				if (resolve) return getReceivingEnd();
				return basicGetReceivingEnd();
			case MatchsPackage.ACTION__TEMPS:
				return getTemps();
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
			case MatchsPackage.ACTION__NAME:
				setName((String)newValue);
				return;
			case MatchsPackage.ACTION__SENDING_END:
				setSendingEnd((ActionEnd)newValue);
				return;
			case MatchsPackage.ACTION__RECEIVING_END:
				setReceivingEnd((ActionEnd)newValue);
				return;
			case MatchsPackage.ACTION__TEMPS:
				setTemps((String)newValue);
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
			case MatchsPackage.ACTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MatchsPackage.ACTION__SENDING_END:
				setSendingEnd((ActionEnd)null);
				return;
			case MatchsPackage.ACTION__RECEIVING_END:
				setReceivingEnd((ActionEnd)null);
				return;
			case MatchsPackage.ACTION__TEMPS:
				setTemps(TEMPS_EDEFAULT);
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
			case MatchsPackage.ACTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MatchsPackage.ACTION__SENDING_END:
				return sendingEnd != null;
			case MatchsPackage.ACTION__RECEIVING_END:
				return receivingEnd != null;
			case MatchsPackage.ACTION__TEMPS:
				return TEMPS_EDEFAULT == null ? temps != null : !TEMPS_EDEFAULT.equals(temps);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", temps: ");
		result.append(temps);
		result.append(')');
		return result.toString();
	}

} //ActionImpl
