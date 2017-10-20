/**
 */
package fr.steph.foot.matchs.impl;

import fr.steph.foot.matchs.InteractionUse;
import fr.steph.foot.matchs.InteractionUseEnd;
import fr.steph.foot.matchs.Match;
import fr.steph.foot.matchs.MatchsPackage;
import fr.steph.foot.matchs.Participant;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Use</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.steph.foot.matchs.impl.InteractionUseImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.steph.foot.matchs.impl.InteractionUseImpl#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link fr.steph.foot.matchs.impl.InteractionUseImpl#getCoveredParticipants <em>Covered Participants</em>}</li>
 *   <li>{@link fr.steph.foot.matchs.impl.InteractionUseImpl#getStart <em>Start</em>}</li>
 *   <li>{@link fr.steph.foot.matchs.impl.InteractionUseImpl#getFinish <em>Finish</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InteractionUseImpl extends MinimalEObjectImpl.Container implements InteractionUse {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = "\"ref\"";

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInteraction() <em>Interaction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteraction()
	 * @generated
	 * @ordered
	 */
	protected Match interaction;

	/**
	 * The cached value of the '{@link #getCoveredParticipants() <em>Covered Participants</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoveredParticipants()
	 * @generated
	 * @ordered
	 */
	protected EList<Participant> coveredParticipants;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected InteractionUseEnd start;

	/**
	 * The cached value of the '{@link #getFinish() <em>Finish</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinish()
	 * @generated
	 * @ordered
	 */
	protected InteractionUseEnd finish;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionUseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MatchsPackage.Literals.INTERACTION_USE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatchsPackage.INTERACTION_USE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Match getInteraction() {
		if (interaction != null && interaction.eIsProxy()) {
			InternalEObject oldInteraction = (InternalEObject)interaction;
			interaction = (Match)eResolveProxy(oldInteraction);
			if (interaction != oldInteraction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MatchsPackage.INTERACTION_USE__INTERACTION, oldInteraction, interaction));
			}
		}
		return interaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Match basicGetInteraction() {
		return interaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteraction(Match newInteraction) {
		Match oldInteraction = interaction;
		interaction = newInteraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatchsPackage.INTERACTION_USE__INTERACTION, oldInteraction, interaction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Participant> getCoveredParticipants() {
		if (coveredParticipants == null) {
			coveredParticipants = new EObjectResolvingEList<Participant>(Participant.class, this, MatchsPackage.INTERACTION_USE__COVERED_PARTICIPANTS);
		}
		return coveredParticipants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionUseEnd getStart() {
		if (start != null && start.eIsProxy()) {
			InternalEObject oldStart = (InternalEObject)start;
			start = (InteractionUseEnd)eResolveProxy(oldStart);
			if (start != oldStart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MatchsPackage.INTERACTION_USE__START, oldStart, start));
			}
		}
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionUseEnd basicGetStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(InteractionUseEnd newStart) {
		InteractionUseEnd oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatchsPackage.INTERACTION_USE__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionUseEnd getFinish() {
		if (finish != null && finish.eIsProxy()) {
			InternalEObject oldFinish = (InternalEObject)finish;
			finish = (InteractionUseEnd)eResolveProxy(oldFinish);
			if (finish != oldFinish) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MatchsPackage.INTERACTION_USE__FINISH, oldFinish, finish));
			}
		}
		return finish;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionUseEnd basicGetFinish() {
		return finish;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinish(InteractionUseEnd newFinish) {
		InteractionUseEnd oldFinish = finish;
		finish = newFinish;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatchsPackage.INTERACTION_USE__FINISH, oldFinish, finish));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MatchsPackage.INTERACTION_USE__TYPE:
				return getType();
			case MatchsPackage.INTERACTION_USE__INTERACTION:
				if (resolve) return getInteraction();
				return basicGetInteraction();
			case MatchsPackage.INTERACTION_USE__COVERED_PARTICIPANTS:
				return getCoveredParticipants();
			case MatchsPackage.INTERACTION_USE__START:
				if (resolve) return getStart();
				return basicGetStart();
			case MatchsPackage.INTERACTION_USE__FINISH:
				if (resolve) return getFinish();
				return basicGetFinish();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MatchsPackage.INTERACTION_USE__TYPE:
				setType((String)newValue);
				return;
			case MatchsPackage.INTERACTION_USE__INTERACTION:
				setInteraction((Match)newValue);
				return;
			case MatchsPackage.INTERACTION_USE__COVERED_PARTICIPANTS:
				getCoveredParticipants().clear();
				getCoveredParticipants().addAll((Collection<? extends Participant>)newValue);
				return;
			case MatchsPackage.INTERACTION_USE__START:
				setStart((InteractionUseEnd)newValue);
				return;
			case MatchsPackage.INTERACTION_USE__FINISH:
				setFinish((InteractionUseEnd)newValue);
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
			case MatchsPackage.INTERACTION_USE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case MatchsPackage.INTERACTION_USE__INTERACTION:
				setInteraction((Match)null);
				return;
			case MatchsPackage.INTERACTION_USE__COVERED_PARTICIPANTS:
				getCoveredParticipants().clear();
				return;
			case MatchsPackage.INTERACTION_USE__START:
				setStart((InteractionUseEnd)null);
				return;
			case MatchsPackage.INTERACTION_USE__FINISH:
				setFinish((InteractionUseEnd)null);
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
			case MatchsPackage.INTERACTION_USE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case MatchsPackage.INTERACTION_USE__INTERACTION:
				return interaction != null;
			case MatchsPackage.INTERACTION_USE__COVERED_PARTICIPANTS:
				return coveredParticipants != null && !coveredParticipants.isEmpty();
			case MatchsPackage.INTERACTION_USE__START:
				return start != null;
			case MatchsPackage.INTERACTION_USE__FINISH:
				return finish != null;
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //InteractionUseImpl
