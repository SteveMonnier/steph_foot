/**
 */
package fr.steph.foot.matchs.impl;

import fr.steph.foot.matchs.Joueur;
import fr.steph.foot.matchs.MatchsPackage;
import fr.steph.foot.matchs.Participant;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Participant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.steph.foot.matchs.impl.ParticipantImpl#getEst <em>Est</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParticipantImpl extends MinimalEObjectImpl.Container implements Participant {
	/**
	 * The cached value of the '{@link #getEst() <em>Est</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEst()
	 * @generated
	 * @ordered
	 */
	protected Joueur est;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParticipantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MatchsPackage.Literals.PARTICIPANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Joueur getEst() {
		if (est != null && est.eIsProxy()) {
			InternalEObject oldEst = (InternalEObject)est;
			est = (Joueur)eResolveProxy(oldEst);
			if (est != oldEst) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MatchsPackage.PARTICIPANT__EST, oldEst, est));
			}
		}
		return est;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Joueur basicGetEst() {
		return est;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEst(Joueur newEst, NotificationChain msgs) {
		Joueur oldEst = est;
		est = newEst;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MatchsPackage.PARTICIPANT__EST, oldEst, newEst);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEst(Joueur newEst) {
		if (newEst != est) {
			NotificationChain msgs = null;
			if (est != null)
				msgs = ((InternalEObject)est).eInverseRemove(this, MatchsPackage.JOUEUR__PARTICIPE_A, Joueur.class, msgs);
			if (newEst != null)
				msgs = ((InternalEObject)newEst).eInverseAdd(this, MatchsPackage.JOUEUR__PARTICIPE_A, Joueur.class, msgs);
			msgs = basicSetEst(newEst, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatchsPackage.PARTICIPANT__EST, newEst, newEst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MatchsPackage.PARTICIPANT__EST:
				if (est != null)
					msgs = ((InternalEObject)est).eInverseRemove(this, MatchsPackage.JOUEUR__PARTICIPE_A, Joueur.class, msgs);
				return basicSetEst((Joueur)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MatchsPackage.PARTICIPANT__EST:
				return basicSetEst(null, msgs);
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
			case MatchsPackage.PARTICIPANT__EST:
				if (resolve) return getEst();
				return basicGetEst();
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
			case MatchsPackage.PARTICIPANT__EST:
				setEst((Joueur)newValue);
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
			case MatchsPackage.PARTICIPANT__EST:
				setEst((Joueur)null);
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
			case MatchsPackage.PARTICIPANT__EST:
				return est != null;
		}
		return super.eIsSet(featureID);
	}

} //ParticipantImpl
