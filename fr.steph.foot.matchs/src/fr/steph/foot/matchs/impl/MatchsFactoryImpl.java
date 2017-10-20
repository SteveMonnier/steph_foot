/**
 */
package fr.steph.foot.matchs.impl;

import fr.steph.foot.matchs.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MatchsFactoryImpl extends EFactoryImpl implements MatchsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MatchsFactory init() {
		try {
			MatchsFactory theMatchsFactory = (MatchsFactory)EPackage.Registry.INSTANCE.getEFactory(MatchsPackage.eNS_URI);
			if (theMatchsFactory != null) {
				return theMatchsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MatchsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MatchsPackage.SAISON: return createSaison();
			case MatchsPackage.MATCH: return createMatch();
			case MatchsPackage.JOUEUR: return createJoueur();
			case MatchsPackage.PASSE: return createPasse();
			case MatchsPackage.REMPLACEMENT: return createRemplacement();
			case MatchsPackage.EXECUTION: return createExecution();
			case MatchsPackage.BUT: return createBut();
			case MatchsPackage.INTERACTION_USE: return createInteractionUse();
			case MatchsPackage.ACTION_END: return createActionEnd();
			case MatchsPackage.EXECUTION_END: return createExecutionEnd();
			case MatchsPackage.BUT_END: return createButEnd();
			case MatchsPackage.INTERACTION_USE_END: return createInteractionUseEnd();
			case MatchsPackage.PARTICIPANT: return createParticipant();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Saison createSaison() {
		SaisonImpl saison = new SaisonImpl();
		return saison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Match createMatch() {
		MatchImpl match = new MatchImpl();
		return match;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Joueur createJoueur() {
		JoueurImpl joueur = new JoueurImpl();
		return joueur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Passe createPasse() {
		PasseImpl passe = new PasseImpl();
		return passe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Remplacement createRemplacement() {
		RemplacementImpl remplacement = new RemplacementImpl();
		return remplacement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Execution createExecution() {
		ExecutionImpl execution = new ExecutionImpl();
		return execution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public But createBut() {
		ButImpl but = new ButImpl();
		return but;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionUse createInteractionUse() {
		InteractionUseImpl interactionUse = new InteractionUseImpl();
		return interactionUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionEnd createActionEnd() {
		ActionEndImpl actionEnd = new ActionEndImpl();
		return actionEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionEnd createExecutionEnd() {
		ExecutionEndImpl executionEnd = new ExecutionEndImpl();
		return executionEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ButEnd createButEnd() {
		ButEndImpl butEnd = new ButEndImpl();
		return butEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionUseEnd createInteractionUseEnd() {
		InteractionUseEndImpl interactionUseEnd = new InteractionUseEndImpl();
		return interactionUseEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant createParticipant() {
		ParticipantImpl participant = new ParticipantImpl();
		return participant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchsPackage getMatchsPackage() {
		return (MatchsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MatchsPackage getPackage() {
		return MatchsPackage.eINSTANCE;
	}

} //MatchsFactoryImpl
