/**
 */
package fr.steph.foot.matchs;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.steph.foot.matchs.MatchsFactory
 * @model kind="package"
 * @generated
 */
public interface MatchsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "matchs";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.steph.org/foot/matchs";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "matchs";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MatchsPackage eINSTANCE = fr.steph.foot.matchs.impl.MatchsPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.steph.foot.matchs.impl.SaisonImpl <em>Saison</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.steph.foot.matchs.impl.SaisonImpl
	 * @see fr.steph.foot.matchs.impl.MatchsPackageImpl#getSaison()
	 * @generated
	 */
	int SAISON = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAISON__NAME = 0;

	/**
	 * The feature id for the '<em><b>Owned Interactions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAISON__OWNED_INTERACTIONS = 1;

	/**
	 * The feature id for the '<em><b>Joueurs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAISON__JOUEURS = 2;

	/**
	 * The feature id for the '<em><b>Annee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAISON__ANNEE = 3;

	/**
	 * The feature id for the '<em><b>Nom Equipe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAISON__NOM_EQUIPE = 4;

	/**
	 * The number of structural features of the '<em>Saison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAISON_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Saison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAISON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.steph.foot.matchs.impl.MatchImpl <em>Match</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.steph.foot.matchs.impl.MatchImpl
	 * @see fr.steph.foot.matchs.impl.MatchsPackageImpl#getMatch()
	 * @generated
	 */
	int MATCH = 1;

	/**
	 * The feature id for the '<em><b>Equipe Adverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__EQUIPE_ADVERSE = 0;

	/**
	 * The feature id for the '<em><b>Participants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__PARTICIPANTS = 1;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__MESSAGES = 2;

	/**
	 * The feature id for the '<em><b>Executions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__EXECUTIONS = 3;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__STATES = 4;

	/**
	 * The feature id for the '<em><b>Interaction Uses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__INTERACTION_USES = 5;

	/**
	 * The feature id for the '<em><b>Ends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__ENDS = 6;

	/**
	 * The feature id for the '<em><b>Video Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__VIDEO_URL = 7;

	/**
	 * The number of structural features of the '<em>Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.steph.foot.matchs.impl.JoueurImpl <em>Joueur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.steph.foot.matchs.impl.JoueurImpl
	 * @see fr.steph.foot.matchs.impl.MatchsPackageImpl#getJoueur()
	 * @generated
	 */
	int JOUEUR = 2;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOUEUR__NOM = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOUEUR__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Numéro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOUEUR__NUMÉRO = 2;

	/**
	 * The feature id for the '<em><b>Participe A</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOUEUR__PARTICIPE_A = 3;

	/**
	 * The number of structural features of the '<em>Joueur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOUEUR_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Joueur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOUEUR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.steph.foot.matchs.impl.TimedEventImpl <em>Timed Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.steph.foot.matchs.impl.TimedEventImpl
	 * @see fr.steph.foot.matchs.impl.MatchsPackageImpl#getTimedEvent()
	 * @generated
	 */
	int TIMED_EVENT = 14;

	/**
	 * The feature id for the '<em><b>Temps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_EVENT__TEMPS = 0;

	/**
	 * The number of structural features of the '<em>Timed Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_EVENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Timed Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.steph.foot.matchs.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.steph.foot.matchs.impl.ActionImpl
	 * @see fr.steph.foot.matchs.impl.MatchsPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 3;

	/**
	 * The feature id for the '<em><b>Temps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__TEMPS = TIMED_EVENT__TEMPS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = TIMED_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sending End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__SENDING_END = TIMED_EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Receiving End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__RECEIVING_END = TIMED_EVENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Action Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ACTION_TYPE = TIMED_EVENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = TIMED_EVENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = TIMED_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.steph.foot.matchs.impl.RemplacementImpl <em>Remplacement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.steph.foot.matchs.impl.RemplacementImpl
	 * @see fr.steph.foot.matchs.impl.MatchsPackageImpl#getRemplacement()
	 * @generated
	 */
	int REMPLACEMENT = 4;

	/**
	 * The feature id for the '<em><b>Temps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMPLACEMENT__TEMPS = TIMED_EVENT__TEMPS;

	/**
	 * The number of structural features of the '<em>Remplacement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMPLACEMENT_FEATURE_COUNT = TIMED_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Remplacement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMPLACEMENT_OPERATION_COUNT = TIMED_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.steph.foot.matchs.impl.PossessionImpl <em>Possession</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.steph.foot.matchs.impl.PossessionImpl
	 * @see fr.steph.foot.matchs.impl.MatchsPackageImpl#getPossession()
	 * @generated
	 */
	int POSSESSION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSESSION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSESSION__OWNER = 1;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSESSION__START = 2;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSESSION__END = 3;

	/**
	 * The feature id for the '<em><b>Possession Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSESSION__POSSESSION_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Possessions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSESSION__POSSESSIONS = 5;

	/**
	 * The number of structural features of the '<em>Possession</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSESSION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Possession</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.steph.foot.matchs.impl.ButImpl <em>But</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.steph.foot.matchs.impl.ButImpl
	 * @see fr.steph.foot.matchs.impl.MatchsPackageImpl#getBut()
	 * @generated
	 */
	int BUT = 6;

	/**
	 * The feature id for the '<em><b>Temps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUT__TEMPS = TIMED_EVENT__TEMPS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUT__NAME = TIMED_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUT__OWNER = TIMED_EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUT__START = TIMED_EVENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUT__END = TIMED_EVENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>But</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUT_FEATURE_COUNT = TIMED_EVENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>But</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUT_OPERATION_COUNT = TIMED_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.steph.foot.matchs.impl.InteractionUseImpl <em>Interaction Use</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.steph.foot.matchs.impl.InteractionUseImpl
	 * @see fr.steph.foot.matchs.impl.MatchsPackageImpl#getInteractionUse()
	 * @generated
	 */
	int INTERACTION_USE = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_USE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Interaction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_USE__INTERACTION = 1;

	/**
	 * The feature id for the '<em><b>Covered Participants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_USE__COVERED_PARTICIPANTS = 2;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_USE__START = 3;

	/**
	 * The feature id for the '<em><b>Finish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_USE__FINISH = 4;

	/**
	 * The number of structural features of the '<em>Interaction Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_USE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Interaction Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_USE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.steph.foot.matchs.impl.AbstractEndImpl <em>Abstract End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.steph.foot.matchs.impl.AbstractEndImpl
	 * @see fr.steph.foot.matchs.impl.MatchsPackageImpl#getAbstractEnd()
	 * @generated
	 */
	int ABSTRACT_END = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_END__NAME = 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_END__CONTEXT = 1;

	/**
	 * The feature id for the '<em><b>Temps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_END__TEMPS = 2;

	/**
	 * The number of structural features of the '<em>Abstract End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_END_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Abstract End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_END_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.steph.foot.matchs.impl.ActionEndImpl <em>Action End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.steph.foot.matchs.impl.ActionEndImpl
	 * @see fr.steph.foot.matchs.impl.MatchsPackageImpl#getActionEnd()
	 * @generated
	 */
	int ACTION_END = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_END__NAME = ABSTRACT_END__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_END__CONTEXT = ABSTRACT_END__CONTEXT;

	/**
	 * The feature id for the '<em><b>Temps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_END__TEMPS = ABSTRACT_END__TEMPS;

	/**
	 * The feature id for the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_END__MESSAGE = ABSTRACT_END_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_END_FEATURE_COUNT = ABSTRACT_END_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Action End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_END_OPERATION_COUNT = ABSTRACT_END_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.steph.foot.matchs.impl.PossessionEndImpl <em>Possession End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.steph.foot.matchs.impl.PossessionEndImpl
	 * @see fr.steph.foot.matchs.impl.MatchsPackageImpl#getPossessionEnd()
	 * @generated
	 */
	int POSSESSION_END = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSESSION_END__NAME = ABSTRACT_END__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSESSION_END__CONTEXT = ABSTRACT_END__CONTEXT;

	/**
	 * The feature id for the '<em><b>Temps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSESSION_END__TEMPS = ABSTRACT_END__TEMPS;

	/**
	 * The feature id for the '<em><b>Execution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSESSION_END__EXECUTION = ABSTRACT_END_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Possession End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSESSION_END_FEATURE_COUNT = ABSTRACT_END_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Possession End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSESSION_END_OPERATION_COUNT = ABSTRACT_END_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.steph.foot.matchs.impl.ButEndImpl <em>But End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.steph.foot.matchs.impl.ButEndImpl
	 * @see fr.steph.foot.matchs.impl.MatchsPackageImpl#getButEnd()
	 * @generated
	 */
	int BUT_END = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUT_END__NAME = ABSTRACT_END__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUT_END__CONTEXT = ABSTRACT_END__CONTEXT;

	/**
	 * The feature id for the '<em><b>Temps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUT_END__TEMPS = ABSTRACT_END__TEMPS;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUT_END__STATE = ABSTRACT_END_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>But End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUT_END_FEATURE_COUNT = ABSTRACT_END_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>But End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUT_END_OPERATION_COUNT = ABSTRACT_END_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.steph.foot.matchs.impl.InteractionUseEndImpl <em>Interaction Use End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.steph.foot.matchs.impl.InteractionUseEndImpl
	 * @see fr.steph.foot.matchs.impl.MatchsPackageImpl#getInteractionUseEnd()
	 * @generated
	 */
	int INTERACTION_USE_END = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_USE_END__NAME = ABSTRACT_END__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_USE_END__CONTEXT = ABSTRACT_END__CONTEXT;

	/**
	 * The feature id for the '<em><b>Temps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_USE_END__TEMPS = ABSTRACT_END__TEMPS;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_USE_END__OWNER = ABSTRACT_END_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interaction Use End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_USE_END_FEATURE_COUNT = ABSTRACT_END_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Interaction Use End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_USE_END_OPERATION_COUNT = ABSTRACT_END_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.steph.foot.matchs.impl.ParticipantImpl <em>Participant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.steph.foot.matchs.impl.ParticipantImpl
	 * @see fr.steph.foot.matchs.impl.MatchsPackageImpl#getParticipant()
	 * @generated
	 */
	int PARTICIPANT = 13;

	/**
	 * The feature id for the '<em><b>Est</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__EST = 0;

	/**
	 * The number of structural features of the '<em>Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link fr.steph.foot.matchs.impl.MixEndImpl <em>Mix End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.steph.foot.matchs.impl.MixEndImpl
	 * @see fr.steph.foot.matchs.impl.MatchsPackageImpl#getMixEnd()
	 * @generated
	 */
	int MIX_END = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIX_END__NAME = ACTION_END__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIX_END__CONTEXT = ACTION_END__CONTEXT;

	/**
	 * The feature id for the '<em><b>Temps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIX_END__TEMPS = ACTION_END__TEMPS;

	/**
	 * The feature id for the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIX_END__MESSAGE = ACTION_END__MESSAGE;

	/**
	 * The feature id for the '<em><b>Execution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIX_END__EXECUTION = ACTION_END_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mix End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIX_END_FEATURE_COUNT = ACTION_END_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Mix End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIX_END_OPERATION_COUNT = ACTION_END_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link fr.steph.foot.matchs.ActionType <em>Action Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.steph.foot.matchs.ActionType
	 * @see fr.steph.foot.matchs.impl.MatchsPackageImpl#getActionType()
	 * @generated
	 */
	int ACTION_TYPE = 16;

	/**
	 * The meta object id for the '{@link fr.steph.foot.matchs.PossessionType <em>Possession Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.steph.foot.matchs.PossessionType
	 * @see fr.steph.foot.matchs.impl.MatchsPackageImpl#getPossessionType()
	 * @generated
	 */
	int POSSESSION_TYPE = 17;


	/**
	 * Returns the meta object for class '{@link fr.steph.foot.matchs.Saison <em>Saison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Saison</em>'.
	 * @see fr.steph.foot.matchs.Saison
	 * @generated
	 */
	EClass getSaison();

	/**
	 * Returns the meta object for the attribute '{@link fr.steph.foot.matchs.Saison#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.steph.foot.matchs.Saison#getName()
	 * @see #getSaison()
	 * @generated
	 */
	EAttribute getSaison_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.steph.foot.matchs.Saison#getOwnedInteractions <em>Owned Interactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Interactions</em>'.
	 * @see fr.steph.foot.matchs.Saison#getOwnedInteractions()
	 * @see #getSaison()
	 * @generated
	 */
	EReference getSaison_OwnedInteractions();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.steph.foot.matchs.Saison#getJoueurs <em>Joueurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Joueurs</em>'.
	 * @see fr.steph.foot.matchs.Saison#getJoueurs()
	 * @see #getSaison()
	 * @generated
	 */
	EReference getSaison_Joueurs();

	/**
	 * Returns the meta object for the attribute '{@link fr.steph.foot.matchs.Saison#getAnnee <em>Annee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Annee</em>'.
	 * @see fr.steph.foot.matchs.Saison#getAnnee()
	 * @see #getSaison()
	 * @generated
	 */
	EAttribute getSaison_Annee();

	/**
	 * Returns the meta object for the attribute '{@link fr.steph.foot.matchs.Saison#getNomEquipe <em>Nom Equipe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom Equipe</em>'.
	 * @see fr.steph.foot.matchs.Saison#getNomEquipe()
	 * @see #getSaison()
	 * @generated
	 */
	EAttribute getSaison_NomEquipe();

	/**
	 * Returns the meta object for class '{@link fr.steph.foot.matchs.Match <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Match</em>'.
	 * @see fr.steph.foot.matchs.Match
	 * @generated
	 */
	EClass getMatch();

	/**
	 * Returns the meta object for the attribute '{@link fr.steph.foot.matchs.Match#getEquipeAdverse <em>Equipe Adverse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Equipe Adverse</em>'.
	 * @see fr.steph.foot.matchs.Match#getEquipeAdverse()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_EquipeAdverse();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.steph.foot.matchs.Match#getParticipants <em>Participants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Participants</em>'.
	 * @see fr.steph.foot.matchs.Match#getParticipants()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_Participants();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.steph.foot.matchs.Match#getMessages <em>Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Messages</em>'.
	 * @see fr.steph.foot.matchs.Match#getMessages()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_Messages();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.steph.foot.matchs.Match#getExecutions <em>Executions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Executions</em>'.
	 * @see fr.steph.foot.matchs.Match#getExecutions()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_Executions();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.steph.foot.matchs.Match#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see fr.steph.foot.matchs.Match#getStates()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_States();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.steph.foot.matchs.Match#getInteractionUses <em>Interaction Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interaction Uses</em>'.
	 * @see fr.steph.foot.matchs.Match#getInteractionUses()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_InteractionUses();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.steph.foot.matchs.Match#getEnds <em>Ends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ends</em>'.
	 * @see fr.steph.foot.matchs.Match#getEnds()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_Ends();

	/**
	 * Returns the meta object for the attribute '{@link fr.steph.foot.matchs.Match#getVideoUrl <em>Video Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Video Url</em>'.
	 * @see fr.steph.foot.matchs.Match#getVideoUrl()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_VideoUrl();

	/**
	 * Returns the meta object for class '{@link fr.steph.foot.matchs.Joueur <em>Joueur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Joueur</em>'.
	 * @see fr.steph.foot.matchs.Joueur
	 * @generated
	 */
	EClass getJoueur();

	/**
	 * Returns the meta object for the attribute '{@link fr.steph.foot.matchs.Joueur#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see fr.steph.foot.matchs.Joueur#getNom()
	 * @see #getJoueur()
	 * @generated
	 */
	EAttribute getJoueur_Nom();

	/**
	 * Returns the meta object for the reference '{@link fr.steph.foot.matchs.Joueur#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see fr.steph.foot.matchs.Joueur#getType()
	 * @see #getJoueur()
	 * @generated
	 */
	EReference getJoueur_Type();

	/**
	 * Returns the meta object for the attribute '{@link fr.steph.foot.matchs.Joueur#getNuméro <em>Numéro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numéro</em>'.
	 * @see fr.steph.foot.matchs.Joueur#getNuméro()
	 * @see #getJoueur()
	 * @generated
	 */
	EAttribute getJoueur_Numéro();

	/**
	 * Returns the meta object for the reference list '{@link fr.steph.foot.matchs.Joueur#getParticipeA <em>Participe A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Participe A</em>'.
	 * @see fr.steph.foot.matchs.Joueur#getParticipeA()
	 * @see #getJoueur()
	 * @generated
	 */
	EReference getJoueur_ParticipeA();

	/**
	 * Returns the meta object for class '{@link fr.steph.foot.matchs.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see fr.steph.foot.matchs.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link fr.steph.foot.matchs.Action#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.steph.foot.matchs.Action#getName()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Name();

	/**
	 * Returns the meta object for the reference '{@link fr.steph.foot.matchs.Action#getSendingEnd <em>Sending End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sending End</em>'.
	 * @see fr.steph.foot.matchs.Action#getSendingEnd()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_SendingEnd();

	/**
	 * Returns the meta object for the reference '{@link fr.steph.foot.matchs.Action#getReceivingEnd <em>Receiving End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receiving End</em>'.
	 * @see fr.steph.foot.matchs.Action#getReceivingEnd()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_ReceivingEnd();

	/**
	 * Returns the meta object for the attribute '{@link fr.steph.foot.matchs.Action#getActionType <em>Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Type</em>'.
	 * @see fr.steph.foot.matchs.Action#getActionType()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_ActionType();

	/**
	 * Returns the meta object for class '{@link fr.steph.foot.matchs.Remplacement <em>Remplacement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remplacement</em>'.
	 * @see fr.steph.foot.matchs.Remplacement
	 * @generated
	 */
	EClass getRemplacement();

	/**
	 * Returns the meta object for class '{@link fr.steph.foot.matchs.Possession <em>Possession</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Possession</em>'.
	 * @see fr.steph.foot.matchs.Possession
	 * @generated
	 */
	EClass getPossession();

	/**
	 * Returns the meta object for the attribute '{@link fr.steph.foot.matchs.Possession#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.steph.foot.matchs.Possession#getName()
	 * @see #getPossession()
	 * @generated
	 */
	EAttribute getPossession_Name();

	/**
	 * Returns the meta object for the reference '{@link fr.steph.foot.matchs.Possession#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see fr.steph.foot.matchs.Possession#getOwner()
	 * @see #getPossession()
	 * @generated
	 */
	EReference getPossession_Owner();

	/**
	 * Returns the meta object for the reference '{@link fr.steph.foot.matchs.Possession#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see fr.steph.foot.matchs.Possession#getStart()
	 * @see #getPossession()
	 * @generated
	 */
	EReference getPossession_Start();

	/**
	 * Returns the meta object for the reference '{@link fr.steph.foot.matchs.Possession#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see fr.steph.foot.matchs.Possession#getEnd()
	 * @see #getPossession()
	 * @generated
	 */
	EReference getPossession_End();

	/**
	 * Returns the meta object for the attribute '{@link fr.steph.foot.matchs.Possession#getPossessionType <em>Possession Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Possession Type</em>'.
	 * @see fr.steph.foot.matchs.Possession#getPossessionType()
	 * @see #getPossession()
	 * @generated
	 */
	EAttribute getPossession_PossessionType();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.steph.foot.matchs.Possession#getPossessions <em>Possessions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Possessions</em>'.
	 * @see fr.steph.foot.matchs.Possession#getPossessions()
	 * @see #getPossession()
	 * @generated
	 */
	EReference getPossession_Possessions();

	/**
	 * Returns the meta object for class '{@link fr.steph.foot.matchs.But <em>But</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>But</em>'.
	 * @see fr.steph.foot.matchs.But
	 * @generated
	 */
	EClass getBut();

	/**
	 * Returns the meta object for the attribute '{@link fr.steph.foot.matchs.But#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.steph.foot.matchs.But#getName()
	 * @see #getBut()
	 * @generated
	 */
	EAttribute getBut_Name();

	/**
	 * Returns the meta object for the reference '{@link fr.steph.foot.matchs.But#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see fr.steph.foot.matchs.But#getOwner()
	 * @see #getBut()
	 * @generated
	 */
	EReference getBut_Owner();

	/**
	 * Returns the meta object for the reference '{@link fr.steph.foot.matchs.But#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see fr.steph.foot.matchs.But#getStart()
	 * @see #getBut()
	 * @generated
	 */
	EReference getBut_Start();

	/**
	 * Returns the meta object for the reference '{@link fr.steph.foot.matchs.But#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see fr.steph.foot.matchs.But#getEnd()
	 * @see #getBut()
	 * @generated
	 */
	EReference getBut_End();

	/**
	 * Returns the meta object for class '{@link fr.steph.foot.matchs.InteractionUse <em>Interaction Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction Use</em>'.
	 * @see fr.steph.foot.matchs.InteractionUse
	 * @generated
	 */
	EClass getInteractionUse();

	/**
	 * Returns the meta object for the attribute '{@link fr.steph.foot.matchs.InteractionUse#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see fr.steph.foot.matchs.InteractionUse#getType()
	 * @see #getInteractionUse()
	 * @generated
	 */
	EAttribute getInteractionUse_Type();

	/**
	 * Returns the meta object for the reference '{@link fr.steph.foot.matchs.InteractionUse#getInteraction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interaction</em>'.
	 * @see fr.steph.foot.matchs.InteractionUse#getInteraction()
	 * @see #getInteractionUse()
	 * @generated
	 */
	EReference getInteractionUse_Interaction();

	/**
	 * Returns the meta object for the reference list '{@link fr.steph.foot.matchs.InteractionUse#getCoveredParticipants <em>Covered Participants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Covered Participants</em>'.
	 * @see fr.steph.foot.matchs.InteractionUse#getCoveredParticipants()
	 * @see #getInteractionUse()
	 * @generated
	 */
	EReference getInteractionUse_CoveredParticipants();

	/**
	 * Returns the meta object for the reference '{@link fr.steph.foot.matchs.InteractionUse#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see fr.steph.foot.matchs.InteractionUse#getStart()
	 * @see #getInteractionUse()
	 * @generated
	 */
	EReference getInteractionUse_Start();

	/**
	 * Returns the meta object for the reference '{@link fr.steph.foot.matchs.InteractionUse#getFinish <em>Finish</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Finish</em>'.
	 * @see fr.steph.foot.matchs.InteractionUse#getFinish()
	 * @see #getInteractionUse()
	 * @generated
	 */
	EReference getInteractionUse_Finish();

	/**
	 * Returns the meta object for class '{@link fr.steph.foot.matchs.AbstractEnd <em>Abstract End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract End</em>'.
	 * @see fr.steph.foot.matchs.AbstractEnd
	 * @generated
	 */
	EClass getAbstractEnd();

	/**
	 * Returns the meta object for the attribute '{@link fr.steph.foot.matchs.AbstractEnd#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.steph.foot.matchs.AbstractEnd#getName()
	 * @see #getAbstractEnd()
	 * @generated
	 */
	EAttribute getAbstractEnd_Name();

	/**
	 * Returns the meta object for the reference '{@link fr.steph.foot.matchs.AbstractEnd#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see fr.steph.foot.matchs.AbstractEnd#getContext()
	 * @see #getAbstractEnd()
	 * @generated
	 */
	EReference getAbstractEnd_Context();

	/**
	 * Returns the meta object for the attribute '{@link fr.steph.foot.matchs.AbstractEnd#getTemps <em>Temps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temps</em>'.
	 * @see fr.steph.foot.matchs.AbstractEnd#getTemps()
	 * @see #getAbstractEnd()
	 * @generated
	 */
	EAttribute getAbstractEnd_Temps();

	/**
	 * Returns the meta object for class '{@link fr.steph.foot.matchs.ActionEnd <em>Action End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action End</em>'.
	 * @see fr.steph.foot.matchs.ActionEnd
	 * @generated
	 */
	EClass getActionEnd();

	/**
	 * Returns the meta object for the reference '{@link fr.steph.foot.matchs.ActionEnd#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message</em>'.
	 * @see fr.steph.foot.matchs.ActionEnd#getMessage()
	 * @see #getActionEnd()
	 * @generated
	 */
	EReference getActionEnd_Message();

	/**
	 * Returns the meta object for class '{@link fr.steph.foot.matchs.PossessionEnd <em>Possession End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Possession End</em>'.
	 * @see fr.steph.foot.matchs.PossessionEnd
	 * @generated
	 */
	EClass getPossessionEnd();

	/**
	 * Returns the meta object for the reference '{@link fr.steph.foot.matchs.PossessionEnd#getExecution <em>Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Execution</em>'.
	 * @see fr.steph.foot.matchs.PossessionEnd#getExecution()
	 * @see #getPossessionEnd()
	 * @generated
	 */
	EReference getPossessionEnd_Execution();

	/**
	 * Returns the meta object for class '{@link fr.steph.foot.matchs.ButEnd <em>But End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>But End</em>'.
	 * @see fr.steph.foot.matchs.ButEnd
	 * @generated
	 */
	EClass getButEnd();

	/**
	 * Returns the meta object for the reference '{@link fr.steph.foot.matchs.ButEnd#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State</em>'.
	 * @see fr.steph.foot.matchs.ButEnd#getState()
	 * @see #getButEnd()
	 * @generated
	 */
	EReference getButEnd_State();

	/**
	 * Returns the meta object for class '{@link fr.steph.foot.matchs.InteractionUseEnd <em>Interaction Use End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction Use End</em>'.
	 * @see fr.steph.foot.matchs.InteractionUseEnd
	 * @generated
	 */
	EClass getInteractionUseEnd();

	/**
	 * Returns the meta object for the reference '{@link fr.steph.foot.matchs.InteractionUseEnd#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see fr.steph.foot.matchs.InteractionUseEnd#getOwner()
	 * @see #getInteractionUseEnd()
	 * @generated
	 */
	EReference getInteractionUseEnd_Owner();

	/**
	 * Returns the meta object for class '{@link fr.steph.foot.matchs.Participant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Participant</em>'.
	 * @see fr.steph.foot.matchs.Participant
	 * @generated
	 */
	EClass getParticipant();

	/**
	 * Returns the meta object for the reference '{@link fr.steph.foot.matchs.Participant#getEst <em>Est</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Est</em>'.
	 * @see fr.steph.foot.matchs.Participant#getEst()
	 * @see #getParticipant()
	 * @generated
	 */
	EReference getParticipant_Est();

	/**
	 * Returns the meta object for class '{@link fr.steph.foot.matchs.TimedEvent <em>Timed Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timed Event</em>'.
	 * @see fr.steph.foot.matchs.TimedEvent
	 * @generated
	 */
	EClass getTimedEvent();

	/**
	 * Returns the meta object for the attribute '{@link fr.steph.foot.matchs.TimedEvent#getTemps <em>Temps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temps</em>'.
	 * @see fr.steph.foot.matchs.TimedEvent#getTemps()
	 * @see #getTimedEvent()
	 * @generated
	 */
	EAttribute getTimedEvent_Temps();

	/**
	 * Returns the meta object for class '{@link fr.steph.foot.matchs.MixEnd <em>Mix End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mix End</em>'.
	 * @see fr.steph.foot.matchs.MixEnd
	 * @generated
	 */
	EClass getMixEnd();

	/**
	 * Returns the meta object for enum '{@link fr.steph.foot.matchs.ActionType <em>Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action Type</em>'.
	 * @see fr.steph.foot.matchs.ActionType
	 * @generated
	 */
	EEnum getActionType();

	/**
	 * Returns the meta object for enum '{@link fr.steph.foot.matchs.PossessionType <em>Possession Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Possession Type</em>'.
	 * @see fr.steph.foot.matchs.PossessionType
	 * @generated
	 */
	EEnum getPossessionType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MatchsFactory getMatchsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.steph.foot.matchs.impl.SaisonImpl <em>Saison</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.steph.foot.matchs.impl.SaisonImpl
		 * @see fr.steph.foot.matchs.impl.MatchsPackageImpl#getSaison()
		 * @generated
		 */
		EClass SAISON = eINSTANCE.getSaison();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAISON__NAME = eINSTANCE.getSaison_Name();

		/**
		 * The meta object literal for the '<em><b>Owned Interactions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAISON__OWNED_INTERACTIONS = eINSTANCE.getSaison_OwnedInteractions();

		/**
		 * The meta object literal for the '<em><b>Joueurs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAISON__JOUEURS = eINSTANCE.getSaison_Joueurs();

		/**
		 * The meta object literal for the '<em><b>Annee</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAISON__ANNEE = eINSTANCE.getSaison_Annee();

		/**
		 * The meta object literal for the '<em><b>Nom Equipe</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAISON__NOM_EQUIPE = eINSTANCE.getSaison_NomEquipe();

		/**
		 * The meta object literal for the '{@link fr.steph.foot.matchs.impl.MatchImpl <em>Match</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.steph.foot.matchs.impl.MatchImpl
		 * @see fr.steph.foot.matchs.impl.MatchsPackageImpl#getMatch()
		 * @generated
		 */
		EClass MATCH = eINSTANCE.getMatch();

		/**
		 * The meta object literal for the '<em><b>Equipe Adverse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__EQUIPE_ADVERSE = eINSTANCE.getMatch_EquipeAdverse();

		/**
		 * The meta object literal for the '<em><b>Participants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__PARTICIPANTS = eINSTANCE.getMatch_Participants();

		/**
		 * The meta object literal for the '<em><b>Messages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__MESSAGES = eINSTANCE.getMatch_Messages();

		/**
		 * The meta object literal for the '<em><b>Executions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__EXECUTIONS = eINSTANCE.getMatch_Executions();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__STATES = eINSTANCE.getMatch_States();

		/**
		 * The meta object literal for the '<em><b>Interaction Uses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__INTERACTION_USES = eINSTANCE.getMatch_InteractionUses();

		/**
		 * The meta object literal for the '<em><b>Ends</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__ENDS = eINSTANCE.getMatch_Ends();

		/**
		 * The meta object literal for the '<em><b>Video Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__VIDEO_URL = eINSTANCE.getMatch_VideoUrl();

		/**
		 * The meta object literal for the '{@link fr.steph.foot.matchs.impl.JoueurImpl <em>Joueur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.steph.foot.matchs.impl.JoueurImpl
		 * @see fr.steph.foot.matchs.impl.MatchsPackageImpl#getJoueur()
		 * @generated
		 */
		EClass JOUEUR = eINSTANCE.getJoueur();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOUEUR__NOM = eINSTANCE.getJoueur_Nom();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOUEUR__TYPE = eINSTANCE.getJoueur_Type();

		/**
		 * The meta object literal for the '<em><b>Numéro</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOUEUR__NUMÉRO = eINSTANCE.getJoueur_Numéro();

		/**
		 * The meta object literal for the '<em><b>Participe A</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOUEUR__PARTICIPE_A = eINSTANCE.getJoueur_ParticipeA();

		/**
		 * The meta object literal for the '{@link fr.steph.foot.matchs.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.steph.foot.matchs.impl.ActionImpl
		 * @see fr.steph.foot.matchs.impl.MatchsPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__NAME = eINSTANCE.getAction_Name();

		/**
		 * The meta object literal for the '<em><b>Sending End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__SENDING_END = eINSTANCE.getAction_SendingEnd();

		/**
		 * The meta object literal for the '<em><b>Receiving End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__RECEIVING_END = eINSTANCE.getAction_ReceivingEnd();

		/**
		 * The meta object literal for the '<em><b>Action Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__ACTION_TYPE = eINSTANCE.getAction_ActionType();

		/**
		 * The meta object literal for the '{@link fr.steph.foot.matchs.impl.RemplacementImpl <em>Remplacement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.steph.foot.matchs.impl.RemplacementImpl
		 * @see fr.steph.foot.matchs.impl.MatchsPackageImpl#getRemplacement()
		 * @generated
		 */
		EClass REMPLACEMENT = eINSTANCE.getRemplacement();

		/**
		 * The meta object literal for the '{@link fr.steph.foot.matchs.impl.PossessionImpl <em>Possession</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.steph.foot.matchs.impl.PossessionImpl
		 * @see fr.steph.foot.matchs.impl.MatchsPackageImpl#getPossession()
		 * @generated
		 */
		EClass POSSESSION = eINSTANCE.getPossession();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSSESSION__NAME = eINSTANCE.getPossession_Name();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSSESSION__OWNER = eINSTANCE.getPossession_Owner();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSSESSION__START = eINSTANCE.getPossession_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSSESSION__END = eINSTANCE.getPossession_End();

		/**
		 * The meta object literal for the '<em><b>Possession Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSSESSION__POSSESSION_TYPE = eINSTANCE.getPossession_PossessionType();

		/**
		 * The meta object literal for the '<em><b>Possessions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSSESSION__POSSESSIONS = eINSTANCE.getPossession_Possessions();

		/**
		 * The meta object literal for the '{@link fr.steph.foot.matchs.impl.ButImpl <em>But</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.steph.foot.matchs.impl.ButImpl
		 * @see fr.steph.foot.matchs.impl.MatchsPackageImpl#getBut()
		 * @generated
		 */
		EClass BUT = eINSTANCE.getBut();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUT__NAME = eINSTANCE.getBut_Name();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUT__OWNER = eINSTANCE.getBut_Owner();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUT__START = eINSTANCE.getBut_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUT__END = eINSTANCE.getBut_End();

		/**
		 * The meta object literal for the '{@link fr.steph.foot.matchs.impl.InteractionUseImpl <em>Interaction Use</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.steph.foot.matchs.impl.InteractionUseImpl
		 * @see fr.steph.foot.matchs.impl.MatchsPackageImpl#getInteractionUse()
		 * @generated
		 */
		EClass INTERACTION_USE = eINSTANCE.getInteractionUse();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION_USE__TYPE = eINSTANCE.getInteractionUse_Type();

		/**
		 * The meta object literal for the '<em><b>Interaction</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_USE__INTERACTION = eINSTANCE.getInteractionUse_Interaction();

		/**
		 * The meta object literal for the '<em><b>Covered Participants</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_USE__COVERED_PARTICIPANTS = eINSTANCE.getInteractionUse_CoveredParticipants();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_USE__START = eINSTANCE.getInteractionUse_Start();

		/**
		 * The meta object literal for the '<em><b>Finish</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_USE__FINISH = eINSTANCE.getInteractionUse_Finish();

		/**
		 * The meta object literal for the '{@link fr.steph.foot.matchs.impl.AbstractEndImpl <em>Abstract End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.steph.foot.matchs.impl.AbstractEndImpl
		 * @see fr.steph.foot.matchs.impl.MatchsPackageImpl#getAbstractEnd()
		 * @generated
		 */
		EClass ABSTRACT_END = eINSTANCE.getAbstractEnd();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_END__NAME = eINSTANCE.getAbstractEnd_Name();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_END__CONTEXT = eINSTANCE.getAbstractEnd_Context();

		/**
		 * The meta object literal for the '<em><b>Temps</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_END__TEMPS = eINSTANCE.getAbstractEnd_Temps();

		/**
		 * The meta object literal for the '{@link fr.steph.foot.matchs.impl.ActionEndImpl <em>Action End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.steph.foot.matchs.impl.ActionEndImpl
		 * @see fr.steph.foot.matchs.impl.MatchsPackageImpl#getActionEnd()
		 * @generated
		 */
		EClass ACTION_END = eINSTANCE.getActionEnd();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_END__MESSAGE = eINSTANCE.getActionEnd_Message();

		/**
		 * The meta object literal for the '{@link fr.steph.foot.matchs.impl.PossessionEndImpl <em>Possession End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.steph.foot.matchs.impl.PossessionEndImpl
		 * @see fr.steph.foot.matchs.impl.MatchsPackageImpl#getPossessionEnd()
		 * @generated
		 */
		EClass POSSESSION_END = eINSTANCE.getPossessionEnd();

		/**
		 * The meta object literal for the '<em><b>Execution</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSSESSION_END__EXECUTION = eINSTANCE.getPossessionEnd_Execution();

		/**
		 * The meta object literal for the '{@link fr.steph.foot.matchs.impl.ButEndImpl <em>But End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.steph.foot.matchs.impl.ButEndImpl
		 * @see fr.steph.foot.matchs.impl.MatchsPackageImpl#getButEnd()
		 * @generated
		 */
		EClass BUT_END = eINSTANCE.getButEnd();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUT_END__STATE = eINSTANCE.getButEnd_State();

		/**
		 * The meta object literal for the '{@link fr.steph.foot.matchs.impl.InteractionUseEndImpl <em>Interaction Use End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.steph.foot.matchs.impl.InteractionUseEndImpl
		 * @see fr.steph.foot.matchs.impl.MatchsPackageImpl#getInteractionUseEnd()
		 * @generated
		 */
		EClass INTERACTION_USE_END = eINSTANCE.getInteractionUseEnd();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_USE_END__OWNER = eINSTANCE.getInteractionUseEnd_Owner();

		/**
		 * The meta object literal for the '{@link fr.steph.foot.matchs.impl.ParticipantImpl <em>Participant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.steph.foot.matchs.impl.ParticipantImpl
		 * @see fr.steph.foot.matchs.impl.MatchsPackageImpl#getParticipant()
		 * @generated
		 */
		EClass PARTICIPANT = eINSTANCE.getParticipant();

		/**
		 * The meta object literal for the '<em><b>Est</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTICIPANT__EST = eINSTANCE.getParticipant_Est();

		/**
		 * The meta object literal for the '{@link fr.steph.foot.matchs.impl.TimedEventImpl <em>Timed Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.steph.foot.matchs.impl.TimedEventImpl
		 * @see fr.steph.foot.matchs.impl.MatchsPackageImpl#getTimedEvent()
		 * @generated
		 */
		EClass TIMED_EVENT = eINSTANCE.getTimedEvent();

		/**
		 * The meta object literal for the '<em><b>Temps</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMED_EVENT__TEMPS = eINSTANCE.getTimedEvent_Temps();

		/**
		 * The meta object literal for the '{@link fr.steph.foot.matchs.impl.MixEndImpl <em>Mix End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.steph.foot.matchs.impl.MixEndImpl
		 * @see fr.steph.foot.matchs.impl.MatchsPackageImpl#getMixEnd()
		 * @generated
		 */
		EClass MIX_END = eINSTANCE.getMixEnd();

		/**
		 * The meta object literal for the '{@link fr.steph.foot.matchs.ActionType <em>Action Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.steph.foot.matchs.ActionType
		 * @see fr.steph.foot.matchs.impl.MatchsPackageImpl#getActionType()
		 * @generated
		 */
		EEnum ACTION_TYPE = eINSTANCE.getActionType();

		/**
		 * The meta object literal for the '{@link fr.steph.foot.matchs.PossessionType <em>Possession Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.steph.foot.matchs.PossessionType
		 * @see fr.steph.foot.matchs.impl.MatchsPackageImpl#getPossessionType()
		 * @generated
		 */
		EEnum POSSESSION_TYPE = eINSTANCE.getPossessionType();

	}

} //MatchsPackage
