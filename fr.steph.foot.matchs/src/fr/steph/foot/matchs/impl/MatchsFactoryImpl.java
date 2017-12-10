/**
 */
package fr.steph.foot.matchs.impl;

import fr.steph.foot.matchs.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
			case MatchsPackage.ACTION: return createAction();
			case MatchsPackage.REMPLACEMENT: return createRemplacement();
			case MatchsPackage.POSSESSION: return createPossession();
			case MatchsPackage.BUT: return createBut();
			case MatchsPackage.INTERACTION_USE: return createInteractionUse();
			case MatchsPackage.ACTION_END: return createActionEnd();
			case MatchsPackage.POSSESSION_END: return createPossessionEnd();
			case MatchsPackage.BUT_END: return createButEnd();
			case MatchsPackage.INTERACTION_USE_END: return createInteractionUseEnd();
			case MatchsPackage.PARTICIPANT: return createParticipant();
			case MatchsPackage.MIX_END: return createMixEnd();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case MatchsPackage.ACTION_TYPE:
				return createActionTypeFromString(eDataType, initialValue);
			case MatchsPackage.POSSESSION_TYPE:
				return createPossessionTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case MatchsPackage.ACTION_TYPE:
				return convertActionTypeToString(eDataType, instanceValue);
			case MatchsPackage.POSSESSION_TYPE:
				return convertPossessionTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
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
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
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
	public Possession createPossession() {
		PossessionImpl possession = new PossessionImpl();
		return possession;
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
	public PossessionEnd createPossessionEnd() {
		PossessionEndImpl possessionEnd = new PossessionEndImpl();
		return possessionEnd;
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
	public MixEnd createMixEnd() {
		MixEndImpl mixEnd = new MixEndImpl();
		return mixEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionType createActionTypeFromString(EDataType eDataType, String initialValue) {
		ActionType result = ActionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PossessionType createPossessionTypeFromString(EDataType eDataType, String initialValue) {
		PossessionType result = PossessionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPossessionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
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
