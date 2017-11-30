/**
 */
package fr.steph.foot.matchs.util;

import fr.steph.foot.matchs.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.steph.foot.matchs.MatchsPackage
 * @generated
 */
public class MatchsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MatchsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchsSwitch() {
		if (modelPackage == null) {
			modelPackage = MatchsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MatchsPackage.SAISON: {
				Saison saison = (Saison)theEObject;
				T result = caseSaison(saison);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MatchsPackage.MATCH: {
				Match match = (Match)theEObject;
				T result = caseMatch(match);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MatchsPackage.JOUEUR: {
				Joueur joueur = (Joueur)theEObject;
				T result = caseJoueur(joueur);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MatchsPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = caseTimedEvent(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MatchsPackage.PASSE: {
				Passe passe = (Passe)theEObject;
				T result = casePasse(passe);
				if (result == null) result = caseAction(passe);
				if (result == null) result = caseTimedEvent(passe);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MatchsPackage.REMPLACEMENT: {
				Remplacement remplacement = (Remplacement)theEObject;
				T result = caseRemplacement(remplacement);
				if (result == null) result = caseAction(remplacement);
				if (result == null) result = caseTimedEvent(remplacement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MatchsPackage.POSSESSION: {
				Possession possession = (Possession)theEObject;
				T result = casePossession(possession);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MatchsPackage.BUT: {
				But but = (But)theEObject;
				T result = caseBut(but);
				if (result == null) result = caseTimedEvent(but);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MatchsPackage.INTERACTION_USE: {
				InteractionUse interactionUse = (InteractionUse)theEObject;
				T result = caseInteractionUse(interactionUse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MatchsPackage.ABSTRACT_END: {
				AbstractEnd abstractEnd = (AbstractEnd)theEObject;
				T result = caseAbstractEnd(abstractEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MatchsPackage.ACTION_END: {
				ActionEnd actionEnd = (ActionEnd)theEObject;
				T result = caseActionEnd(actionEnd);
				if (result == null) result = caseAbstractEnd(actionEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MatchsPackage.POSSESSION_END: {
				PossessionEnd possessionEnd = (PossessionEnd)theEObject;
				T result = casePossessionEnd(possessionEnd);
				if (result == null) result = caseAbstractEnd(possessionEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MatchsPackage.BUT_END: {
				ButEnd butEnd = (ButEnd)theEObject;
				T result = caseButEnd(butEnd);
				if (result == null) result = caseAbstractEnd(butEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MatchsPackage.INTERACTION_USE_END: {
				InteractionUseEnd interactionUseEnd = (InteractionUseEnd)theEObject;
				T result = caseInteractionUseEnd(interactionUseEnd);
				if (result == null) result = caseAbstractEnd(interactionUseEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MatchsPackage.PARTICIPANT: {
				Participant participant = (Participant)theEObject;
				T result = caseParticipant(participant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MatchsPackage.TIMED_EVENT: {
				TimedEvent timedEvent = (TimedEvent)theEObject;
				T result = caseTimedEvent(timedEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MatchsPackage.MIX_END: {
				MixEnd mixEnd = (MixEnd)theEObject;
				T result = caseMixEnd(mixEnd);
				if (result == null) result = caseActionEnd(mixEnd);
				if (result == null) result = casePossessionEnd(mixEnd);
				if (result == null) result = caseAbstractEnd(mixEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Saison</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Saison</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSaison(Saison object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Match</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Match</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatch(Match object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Joueur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Joueur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJoueur(Joueur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Passe</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Passe</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePasse(Passe object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remplacement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remplacement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemplacement(Remplacement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Possession</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Possession</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePossession(Possession object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>But</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>But</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBut(But object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Use</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Use</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionUse(InteractionUse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractEnd(AbstractEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionEnd(ActionEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Possession End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Possession End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePossessionEnd(PossessionEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>But End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>But End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseButEnd(ButEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Use End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Use End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionUseEnd(InteractionUseEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Participant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Participant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParticipant(Participant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timed Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timed Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimedEvent(TimedEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mix End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mix End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMixEnd(MixEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MatchsSwitch
