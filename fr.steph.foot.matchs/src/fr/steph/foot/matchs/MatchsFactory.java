/**
 */
package fr.steph.foot.matchs;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.steph.foot.matchs.MatchsPackage
 * @generated
 */
public interface MatchsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MatchsFactory eINSTANCE = fr.steph.foot.matchs.impl.MatchsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Saison</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Saison</em>'.
	 * @generated
	 */
	Saison createSaison();

	/**
	 * Returns a new object of class '<em>Match</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Match</em>'.
	 * @generated
	 */
	Match createMatch();

	/**
	 * Returns a new object of class '<em>Joueur</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Joueur</em>'.
	 * @generated
	 */
	Joueur createJoueur();

	/**
	 * Returns a new object of class '<em>Passe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Passe</em>'.
	 * @generated
	 */
	Passe createPasse();

	/**
	 * Returns a new object of class '<em>Remplacement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remplacement</em>'.
	 * @generated
	 */
	Remplacement createRemplacement();

	/**
	 * Returns a new object of class '<em>Execution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Execution</em>'.
	 * @generated
	 */
	Execution createExecution();

	/**
	 * Returns a new object of class '<em>But</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>But</em>'.
	 * @generated
	 */
	But createBut();

	/**
	 * Returns a new object of class '<em>Interaction Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interaction Use</em>'.
	 * @generated
	 */
	InteractionUse createInteractionUse();

	/**
	 * Returns a new object of class '<em>Action End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action End</em>'.
	 * @generated
	 */
	ActionEnd createActionEnd();

	/**
	 * Returns a new object of class '<em>Execution End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Execution End</em>'.
	 * @generated
	 */
	ExecutionEnd createExecutionEnd();

	/**
	 * Returns a new object of class '<em>But End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>But End</em>'.
	 * @generated
	 */
	ButEnd createButEnd();

	/**
	 * Returns a new object of class '<em>Interaction Use End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interaction Use End</em>'.
	 * @generated
	 */
	InteractionUseEnd createInteractionUseEnd();

	/**
	 * Returns a new object of class '<em>Participant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Participant</em>'.
	 * @generated
	 */
	Participant createParticipant();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MatchsPackage getMatchsPackage();

} //MatchsFactory
