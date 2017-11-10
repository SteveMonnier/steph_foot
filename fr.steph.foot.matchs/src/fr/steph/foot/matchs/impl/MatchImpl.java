/**
 */
package fr.steph.foot.matchs.impl;

import fr.steph.foot.matchs.AbstractEnd;
import fr.steph.foot.matchs.Action;
import fr.steph.foot.matchs.But;
import fr.steph.foot.matchs.InteractionUse;
import fr.steph.foot.matchs.Match;
import fr.steph.foot.matchs.MatchsPackage;
import fr.steph.foot.matchs.Participant;
import fr.steph.foot.matchs.Possession;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Match</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.steph.foot.matchs.impl.MatchImpl#getEquipeAdverse <em>Equipe Adverse</em>}</li>
 *   <li>{@link fr.steph.foot.matchs.impl.MatchImpl#getParticipants <em>Participants</em>}</li>
 *   <li>{@link fr.steph.foot.matchs.impl.MatchImpl#getMessages <em>Messages</em>}</li>
 *   <li>{@link fr.steph.foot.matchs.impl.MatchImpl#getExecutions <em>Executions</em>}</li>
 *   <li>{@link fr.steph.foot.matchs.impl.MatchImpl#getStates <em>States</em>}</li>
 *   <li>{@link fr.steph.foot.matchs.impl.MatchImpl#getInteractionUses <em>Interaction Uses</em>}</li>
 *   <li>{@link fr.steph.foot.matchs.impl.MatchImpl#getEnds <em>Ends</em>}</li>
 *   <li>{@link fr.steph.foot.matchs.impl.MatchImpl#getVideoUrl <em>Video Url</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MatchImpl extends MinimalEObjectImpl.Container implements Match {
	/**
	 * The default value of the '{@link #getEquipeAdverse() <em>Equipe Adverse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquipeAdverse()
	 * @generated
	 * @ordered
	 */
	protected static final String EQUIPE_ADVERSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEquipeAdverse() <em>Equipe Adverse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquipeAdverse()
	 * @generated
	 * @ordered
	 */
	protected String equipeAdverse = EQUIPE_ADVERSE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParticipants() <em>Participants</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipants()
	 * @generated
	 * @ordered
	 */
	protected EList<Participant> participants;

	/**
	 * The cached value of the '{@link #getMessages() <em>Messages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessages()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> messages;

	/**
	 * The cached value of the '{@link #getExecutions() <em>Executions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutions()
	 * @generated
	 * @ordered
	 */
	protected EList<Possession> executions;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<But> states;

	/**
	 * The cached value of the '{@link #getInteractionUses() <em>Interaction Uses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractionUses()
	 * @generated
	 * @ordered
	 */
	protected EList<InteractionUse> interactionUses;

	/**
	 * The cached value of the '{@link #getEnds() <em>Ends</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnds()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractEnd> ends;

	/**
	 * The default value of the '{@link #getVideoUrl() <em>Video Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideoUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String VIDEO_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVideoUrl() <em>Video Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideoUrl()
	 * @generated
	 * @ordered
	 */
	protected String videoUrl = VIDEO_URL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MatchsPackage.Literals.MATCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEquipeAdverse() {
		return equipeAdverse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEquipeAdverse(String newEquipeAdverse) {
		String oldEquipeAdverse = equipeAdverse;
		equipeAdverse = newEquipeAdverse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatchsPackage.MATCH__EQUIPE_ADVERSE, oldEquipeAdverse, equipeAdverse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Participant> getParticipants() {
		if (participants == null) {
			participants = new EObjectContainmentEList<Participant>(Participant.class, this, MatchsPackage.MATCH__PARTICIPANTS);
		}
		return participants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getMessages() {
		if (messages == null) {
			messages = new EObjectContainmentEList<Action>(Action.class, this, MatchsPackage.MATCH__MESSAGES);
		}
		return messages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Possession> getExecutions() {
		if (executions == null) {
			executions = new EObjectContainmentEList<Possession>(Possession.class, this, MatchsPackage.MATCH__EXECUTIONS);
		}
		return executions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<But> getStates() {
		if (states == null) {
			states = new EObjectContainmentEList<But>(But.class, this, MatchsPackage.MATCH__STATES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InteractionUse> getInteractionUses() {
		if (interactionUses == null) {
			interactionUses = new EObjectContainmentEList<InteractionUse>(InteractionUse.class, this, MatchsPackage.MATCH__INTERACTION_USES);
		}
		return interactionUses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractEnd> getEnds() {
		if (ends == null) {
			ends = new EObjectContainmentEList<AbstractEnd>(AbstractEnd.class, this, MatchsPackage.MATCH__ENDS);
		}
		return ends;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVideoUrl() {
		return videoUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVideoUrl(String newVideoUrl) {
		String oldVideoUrl = videoUrl;
		videoUrl = newVideoUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatchsPackage.MATCH__VIDEO_URL, oldVideoUrl, videoUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MatchsPackage.MATCH__PARTICIPANTS:
				return ((InternalEList<?>)getParticipants()).basicRemove(otherEnd, msgs);
			case MatchsPackage.MATCH__MESSAGES:
				return ((InternalEList<?>)getMessages()).basicRemove(otherEnd, msgs);
			case MatchsPackage.MATCH__EXECUTIONS:
				return ((InternalEList<?>)getExecutions()).basicRemove(otherEnd, msgs);
			case MatchsPackage.MATCH__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
			case MatchsPackage.MATCH__INTERACTION_USES:
				return ((InternalEList<?>)getInteractionUses()).basicRemove(otherEnd, msgs);
			case MatchsPackage.MATCH__ENDS:
				return ((InternalEList<?>)getEnds()).basicRemove(otherEnd, msgs);
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
			case MatchsPackage.MATCH__EQUIPE_ADVERSE:
				return getEquipeAdverse();
			case MatchsPackage.MATCH__PARTICIPANTS:
				return getParticipants();
			case MatchsPackage.MATCH__MESSAGES:
				return getMessages();
			case MatchsPackage.MATCH__EXECUTIONS:
				return getExecutions();
			case MatchsPackage.MATCH__STATES:
				return getStates();
			case MatchsPackage.MATCH__INTERACTION_USES:
				return getInteractionUses();
			case MatchsPackage.MATCH__ENDS:
				return getEnds();
			case MatchsPackage.MATCH__VIDEO_URL:
				return getVideoUrl();
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
			case MatchsPackage.MATCH__EQUIPE_ADVERSE:
				setEquipeAdverse((String)newValue);
				return;
			case MatchsPackage.MATCH__PARTICIPANTS:
				getParticipants().clear();
				getParticipants().addAll((Collection<? extends Participant>)newValue);
				return;
			case MatchsPackage.MATCH__MESSAGES:
				getMessages().clear();
				getMessages().addAll((Collection<? extends Action>)newValue);
				return;
			case MatchsPackage.MATCH__EXECUTIONS:
				getExecutions().clear();
				getExecutions().addAll((Collection<? extends Possession>)newValue);
				return;
			case MatchsPackage.MATCH__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends But>)newValue);
				return;
			case MatchsPackage.MATCH__INTERACTION_USES:
				getInteractionUses().clear();
				getInteractionUses().addAll((Collection<? extends InteractionUse>)newValue);
				return;
			case MatchsPackage.MATCH__ENDS:
				getEnds().clear();
				getEnds().addAll((Collection<? extends AbstractEnd>)newValue);
				return;
			case MatchsPackage.MATCH__VIDEO_URL:
				setVideoUrl((String)newValue);
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
			case MatchsPackage.MATCH__EQUIPE_ADVERSE:
				setEquipeAdverse(EQUIPE_ADVERSE_EDEFAULT);
				return;
			case MatchsPackage.MATCH__PARTICIPANTS:
				getParticipants().clear();
				return;
			case MatchsPackage.MATCH__MESSAGES:
				getMessages().clear();
				return;
			case MatchsPackage.MATCH__EXECUTIONS:
				getExecutions().clear();
				return;
			case MatchsPackage.MATCH__STATES:
				getStates().clear();
				return;
			case MatchsPackage.MATCH__INTERACTION_USES:
				getInteractionUses().clear();
				return;
			case MatchsPackage.MATCH__ENDS:
				getEnds().clear();
				return;
			case MatchsPackage.MATCH__VIDEO_URL:
				setVideoUrl(VIDEO_URL_EDEFAULT);
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
			case MatchsPackage.MATCH__EQUIPE_ADVERSE:
				return EQUIPE_ADVERSE_EDEFAULT == null ? equipeAdverse != null : !EQUIPE_ADVERSE_EDEFAULT.equals(equipeAdverse);
			case MatchsPackage.MATCH__PARTICIPANTS:
				return participants != null && !participants.isEmpty();
			case MatchsPackage.MATCH__MESSAGES:
				return messages != null && !messages.isEmpty();
			case MatchsPackage.MATCH__EXECUTIONS:
				return executions != null && !executions.isEmpty();
			case MatchsPackage.MATCH__STATES:
				return states != null && !states.isEmpty();
			case MatchsPackage.MATCH__INTERACTION_USES:
				return interactionUses != null && !interactionUses.isEmpty();
			case MatchsPackage.MATCH__ENDS:
				return ends != null && !ends.isEmpty();
			case MatchsPackage.MATCH__VIDEO_URL:
				return VIDEO_URL_EDEFAULT == null ? videoUrl != null : !VIDEO_URL_EDEFAULT.equals(videoUrl);
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
		result.append(" (equipeAdverse: ");
		result.append(equipeAdverse);
		result.append(", videoUrl: ");
		result.append(videoUrl);
		result.append(')');
		return result.toString();
	}

} //MatchImpl
