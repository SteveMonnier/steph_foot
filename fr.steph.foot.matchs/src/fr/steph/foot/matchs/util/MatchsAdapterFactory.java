/**
 */
package fr.steph.foot.matchs.util;

import fr.steph.foot.matchs.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.steph.foot.matchs.MatchsPackage
 * @generated
 */
public class MatchsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MatchsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MatchsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatchsSwitch<Adapter> modelSwitch =
		new MatchsSwitch<Adapter>() {
			@Override
			public Adapter caseSaison(Saison object) {
				return createSaisonAdapter();
			}
			@Override
			public Adapter caseMatch(Match object) {
				return createMatchAdapter();
			}
			@Override
			public Adapter caseJoueur(Joueur object) {
				return createJoueurAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter casePasse(Passe object) {
				return createPasseAdapter();
			}
			@Override
			public Adapter caseRemplacement(Remplacement object) {
				return createRemplacementAdapter();
			}
			@Override
			public Adapter caseExecution(Execution object) {
				return createExecutionAdapter();
			}
			@Override
			public Adapter caseBut(But object) {
				return createButAdapter();
			}
			@Override
			public Adapter caseInteractionUse(InteractionUse object) {
				return createInteractionUseAdapter();
			}
			@Override
			public Adapter caseAbstractEnd(AbstractEnd object) {
				return createAbstractEndAdapter();
			}
			@Override
			public Adapter caseActionEnd(ActionEnd object) {
				return createActionEndAdapter();
			}
			@Override
			public Adapter caseExecutionEnd(ExecutionEnd object) {
				return createExecutionEndAdapter();
			}
			@Override
			public Adapter caseButEnd(ButEnd object) {
				return createButEndAdapter();
			}
			@Override
			public Adapter caseInteractionUseEnd(InteractionUseEnd object) {
				return createInteractionUseEndAdapter();
			}
			@Override
			public Adapter caseParticipant(Participant object) {
				return createParticipantAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link fr.steph.foot.matchs.Saison <em>Saison</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.steph.foot.matchs.Saison
	 * @generated
	 */
	public Adapter createSaisonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.steph.foot.matchs.Match <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.steph.foot.matchs.Match
	 * @generated
	 */
	public Adapter createMatchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.steph.foot.matchs.Joueur <em>Joueur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.steph.foot.matchs.Joueur
	 * @generated
	 */
	public Adapter createJoueurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.steph.foot.matchs.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.steph.foot.matchs.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.steph.foot.matchs.Passe <em>Passe</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.steph.foot.matchs.Passe
	 * @generated
	 */
	public Adapter createPasseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.steph.foot.matchs.Remplacement <em>Remplacement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.steph.foot.matchs.Remplacement
	 * @generated
	 */
	public Adapter createRemplacementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.steph.foot.matchs.Execution <em>Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.steph.foot.matchs.Execution
	 * @generated
	 */
	public Adapter createExecutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.steph.foot.matchs.But <em>But</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.steph.foot.matchs.But
	 * @generated
	 */
	public Adapter createButAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.steph.foot.matchs.InteractionUse <em>Interaction Use</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.steph.foot.matchs.InteractionUse
	 * @generated
	 */
	public Adapter createInteractionUseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.steph.foot.matchs.AbstractEnd <em>Abstract End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.steph.foot.matchs.AbstractEnd
	 * @generated
	 */
	public Adapter createAbstractEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.steph.foot.matchs.ActionEnd <em>Action End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.steph.foot.matchs.ActionEnd
	 * @generated
	 */
	public Adapter createActionEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.steph.foot.matchs.ExecutionEnd <em>Execution End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.steph.foot.matchs.ExecutionEnd
	 * @generated
	 */
	public Adapter createExecutionEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.steph.foot.matchs.ButEnd <em>But End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.steph.foot.matchs.ButEnd
	 * @generated
	 */
	public Adapter createButEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.steph.foot.matchs.InteractionUseEnd <em>Interaction Use End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.steph.foot.matchs.InteractionUseEnd
	 * @generated
	 */
	public Adapter createInteractionUseEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.steph.foot.matchs.Participant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.steph.foot.matchs.Participant
	 * @generated
	 */
	public Adapter createParticipantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MatchsAdapterFactory
