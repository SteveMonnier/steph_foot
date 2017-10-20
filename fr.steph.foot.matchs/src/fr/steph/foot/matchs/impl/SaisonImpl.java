/**
 */
package fr.steph.foot.matchs.impl;

import fr.steph.foot.matchs.Joueur;
import fr.steph.foot.matchs.Match;
import fr.steph.foot.matchs.MatchsPackage;
import fr.steph.foot.matchs.Saison;

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
 * An implementation of the model object '<em><b>Saison</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.steph.foot.matchs.impl.SaisonImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.steph.foot.matchs.impl.SaisonImpl#getOwnedInteractions <em>Owned Interactions</em>}</li>
 *   <li>{@link fr.steph.foot.matchs.impl.SaisonImpl#getJoueurs <em>Joueurs</em>}</li>
 *   <li>{@link fr.steph.foot.matchs.impl.SaisonImpl#getAnnee <em>Annee</em>}</li>
 *   <li>{@link fr.steph.foot.matchs.impl.SaisonImpl#getNomEquipe <em>Nom Equipe</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SaisonImpl extends MinimalEObjectImpl.Container implements Saison {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedInteractions() <em>Owned Interactions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedInteractions()
	 * @generated
	 * @ordered
	 */
	protected EList<Match> ownedInteractions;

	/**
	 * The cached value of the '{@link #getJoueurs() <em>Joueurs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoueurs()
	 * @generated
	 * @ordered
	 */
	protected EList<Joueur> joueurs;

	/**
	 * The default value of the '{@link #getAnnee() <em>Annee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnee()
	 * @generated
	 * @ordered
	 */
	protected static final String ANNEE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnnee() <em>Annee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnee()
	 * @generated
	 * @ordered
	 */
	protected String annee = ANNEE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNomEquipe() <em>Nom Equipe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomEquipe()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EQUIPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNomEquipe() <em>Nom Equipe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomEquipe()
	 * @generated
	 * @ordered
	 */
	protected String nomEquipe = NOM_EQUIPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SaisonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MatchsPackage.Literals.SAISON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatchsPackage.SAISON__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Match> getOwnedInteractions() {
		if (ownedInteractions == null) {
			ownedInteractions = new EObjectContainmentEList<Match>(Match.class, this, MatchsPackage.SAISON__OWNED_INTERACTIONS);
		}
		return ownedInteractions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Joueur> getJoueurs() {
		if (joueurs == null) {
			joueurs = new EObjectContainmentEList<Joueur>(Joueur.class, this, MatchsPackage.SAISON__JOUEURS);
		}
		return joueurs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAnnee() {
		return annee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnee(String newAnnee) {
		String oldAnnee = annee;
		annee = newAnnee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatchsPackage.SAISON__ANNEE, oldAnnee, annee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNomEquipe() {
		return nomEquipe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNomEquipe(String newNomEquipe) {
		String oldNomEquipe = nomEquipe;
		nomEquipe = newNomEquipe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatchsPackage.SAISON__NOM_EQUIPE, oldNomEquipe, nomEquipe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MatchsPackage.SAISON__OWNED_INTERACTIONS:
				return ((InternalEList<?>)getOwnedInteractions()).basicRemove(otherEnd, msgs);
			case MatchsPackage.SAISON__JOUEURS:
				return ((InternalEList<?>)getJoueurs()).basicRemove(otherEnd, msgs);
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
			case MatchsPackage.SAISON__NAME:
				return getName();
			case MatchsPackage.SAISON__OWNED_INTERACTIONS:
				return getOwnedInteractions();
			case MatchsPackage.SAISON__JOUEURS:
				return getJoueurs();
			case MatchsPackage.SAISON__ANNEE:
				return getAnnee();
			case MatchsPackage.SAISON__NOM_EQUIPE:
				return getNomEquipe();
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
			case MatchsPackage.SAISON__NAME:
				setName((String)newValue);
				return;
			case MatchsPackage.SAISON__OWNED_INTERACTIONS:
				getOwnedInteractions().clear();
				getOwnedInteractions().addAll((Collection<? extends Match>)newValue);
				return;
			case MatchsPackage.SAISON__JOUEURS:
				getJoueurs().clear();
				getJoueurs().addAll((Collection<? extends Joueur>)newValue);
				return;
			case MatchsPackage.SAISON__ANNEE:
				setAnnee((String)newValue);
				return;
			case MatchsPackage.SAISON__NOM_EQUIPE:
				setNomEquipe((String)newValue);
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
			case MatchsPackage.SAISON__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MatchsPackage.SAISON__OWNED_INTERACTIONS:
				getOwnedInteractions().clear();
				return;
			case MatchsPackage.SAISON__JOUEURS:
				getJoueurs().clear();
				return;
			case MatchsPackage.SAISON__ANNEE:
				setAnnee(ANNEE_EDEFAULT);
				return;
			case MatchsPackage.SAISON__NOM_EQUIPE:
				setNomEquipe(NOM_EQUIPE_EDEFAULT);
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
			case MatchsPackage.SAISON__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MatchsPackage.SAISON__OWNED_INTERACTIONS:
				return ownedInteractions != null && !ownedInteractions.isEmpty();
			case MatchsPackage.SAISON__JOUEURS:
				return joueurs != null && !joueurs.isEmpty();
			case MatchsPackage.SAISON__ANNEE:
				return ANNEE_EDEFAULT == null ? annee != null : !ANNEE_EDEFAULT.equals(annee);
			case MatchsPackage.SAISON__NOM_EQUIPE:
				return NOM_EQUIPE_EDEFAULT == null ? nomEquipe != null : !NOM_EQUIPE_EDEFAULT.equals(nomEquipe);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", annee: ");
		result.append(annee);
		result.append(", nomEquipe: ");
		result.append(nomEquipe);
		result.append(')');
		return result.toString();
	}

} //SaisonImpl
