/**
 */
package fr.steph.foot.matchs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Match</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes the interactions between several participants over time.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.steph.foot.matchs.Match#getEquipeAdverse <em>Equipe Adverse</em>}</li>
 *   <li>{@link fr.steph.foot.matchs.Match#getParticipants <em>Participants</em>}</li>
 *   <li>{@link fr.steph.foot.matchs.Match#getMessages <em>Messages</em>}</li>
 *   <li>{@link fr.steph.foot.matchs.Match#getExecutions <em>Executions</em>}</li>
 *   <li>{@link fr.steph.foot.matchs.Match#getStates <em>States</em>}</li>
 *   <li>{@link fr.steph.foot.matchs.Match#getInteractionUses <em>Interaction Uses</em>}</li>
 *   <li>{@link fr.steph.foot.matchs.Match#getEnds <em>Ends</em>}</li>
 * </ul>
 *
 * @see fr.steph.foot.matchs.MatchsPackage#getMatch()
 * @model
 * @generated
 */
public interface Match extends EObject {
	/**
	 * Returns the value of the '<em><b>Equipe Adverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equipe Adverse</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equipe Adverse</em>' attribute.
	 * @see #setEquipeAdverse(String)
	 * @see fr.steph.foot.matchs.MatchsPackage#getMatch_EquipeAdverse()
	 * @model
	 * @generated
	 */
	String getEquipeAdverse();

	/**
	 * Sets the value of the '{@link fr.steph.foot.matchs.Match#getEquipeAdverse <em>Equipe Adverse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Equipe Adverse</em>' attribute.
	 * @see #getEquipeAdverse()
	 * @generated
	 */
	void setEquipeAdverse(String value);

	/**
	 * Returns the value of the '<em><b>Participants</b></em>' containment reference list.
	 * The list contents are of type {@link fr.steph.foot.matchs.Participant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participants</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participants</em>' containment reference list.
	 * @see fr.steph.foot.matchs.MatchsPackage#getMatch_Participants()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Participant> getParticipants();

	/**
	 * Returns the value of the '<em><b>Messages</b></em>' containment reference list.
	 * The list contents are of type {@link fr.steph.foot.matchs.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Messages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Messages</em>' containment reference list.
	 * @see fr.steph.foot.matchs.MatchsPackage#getMatch_Messages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getMessages();

	/**
	 * Returns the value of the '<em><b>Executions</b></em>' containment reference list.
	 * The list contents are of type {@link fr.steph.foot.matchs.Execution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executions</em>' containment reference list.
	 * @see fr.steph.foot.matchs.MatchsPackage#getMatch_Executions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Execution> getExecutions();

	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link fr.steph.foot.matchs.But}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see fr.steph.foot.matchs.MatchsPackage#getMatch_States()
	 * @model containment="true"
	 * @generated
	 */
	EList<But> getStates();

	/**
	 * Returns the value of the '<em><b>Interaction Uses</b></em>' containment reference list.
	 * The list contents are of type {@link fr.steph.foot.matchs.InteractionUse}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interaction Uses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction Uses</em>' containment reference list.
	 * @see fr.steph.foot.matchs.MatchsPackage#getMatch_InteractionUses()
	 * @model containment="true"
	 * @generated
	 */
	EList<InteractionUse> getInteractionUses();

	/**
	 * Returns the value of the '<em><b>Ends</b></em>' containment reference list.
	 * The list contents are of type {@link fr.steph.foot.matchs.AbstractEnd}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ends</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ends</em>' containment reference list.
	 * @see fr.steph.foot.matchs.MatchsPackage#getMatch_Ends()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractEnd> getEnds();

} // Match
