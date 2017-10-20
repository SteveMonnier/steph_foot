/**
 */
package fr.steph.foot.matchs.impl;

import fr.steph.foot.matchs.Joueur;
import fr.steph.foot.matchs.MatchsPackage;

import fr.steph.foot.matchs.Participant;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Joueur</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.steph.foot.matchs.impl.JoueurImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link fr.steph.foot.matchs.impl.JoueurImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.steph.foot.matchs.impl.JoueurImpl#getNuméro <em>Numéro</em>}</li>
 *   <li>{@link fr.steph.foot.matchs.impl.JoueurImpl#getParticipeA <em>Participe A</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JoueurImpl extends MinimalEObjectImpl.Container implements Joueur {
	/**
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected String nom = NOM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EClass type;

	/**
	 * The default value of the '{@link #getNuméro() <em>Numéro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNuméro()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMÉRO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNuméro() <em>Numéro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNuméro()
	 * @generated
	 * @ordered
	 */
	protected int numéro = NUMÉRO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParticipeA() <em>Participe A</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipeA()
	 * @generated
	 * @ordered
	 */
	protected EList<Participant> participeA;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JoueurImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MatchsPackage.Literals.JOUEUR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNom(String newNom) {
		String oldNom = nom;
		nom = newNom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatchsPackage.JOUEUR__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (EClass)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MatchsPackage.JOUEUR__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(EClass newType) {
		EClass oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatchsPackage.JOUEUR__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNuméro() {
		return numéro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNuméro(int newNuméro) {
		int oldNuméro = numéro;
		numéro = newNuméro;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatchsPackage.JOUEUR__NUMÉRO, oldNuméro, numéro));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Participant> getParticipeA() {
		if (participeA == null) {
			participeA = new EObjectWithInverseResolvingEList<Participant>(Participant.class, this, MatchsPackage.JOUEUR__PARTICIPE_A, MatchsPackage.PARTICIPANT__EST);
		}
		return participeA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MatchsPackage.JOUEUR__PARTICIPE_A:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParticipeA()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MatchsPackage.JOUEUR__PARTICIPE_A:
				return ((InternalEList<?>)getParticipeA()).basicRemove(otherEnd, msgs);
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
			case MatchsPackage.JOUEUR__NOM:
				return getNom();
			case MatchsPackage.JOUEUR__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case MatchsPackage.JOUEUR__NUMÉRO:
				return getNuméro();
			case MatchsPackage.JOUEUR__PARTICIPE_A:
				return getParticipeA();
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
			case MatchsPackage.JOUEUR__NOM:
				setNom((String)newValue);
				return;
			case MatchsPackage.JOUEUR__TYPE:
				setType((EClass)newValue);
				return;
			case MatchsPackage.JOUEUR__NUMÉRO:
				setNuméro((Integer)newValue);
				return;
			case MatchsPackage.JOUEUR__PARTICIPE_A:
				getParticipeA().clear();
				getParticipeA().addAll((Collection<? extends Participant>)newValue);
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
			case MatchsPackage.JOUEUR__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case MatchsPackage.JOUEUR__TYPE:
				setType((EClass)null);
				return;
			case MatchsPackage.JOUEUR__NUMÉRO:
				setNuméro(NUMÉRO_EDEFAULT);
				return;
			case MatchsPackage.JOUEUR__PARTICIPE_A:
				getParticipeA().clear();
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
			case MatchsPackage.JOUEUR__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case MatchsPackage.JOUEUR__TYPE:
				return type != null;
			case MatchsPackage.JOUEUR__NUMÉRO:
				return numéro != NUMÉRO_EDEFAULT;
			case MatchsPackage.JOUEUR__PARTICIPE_A:
				return participeA != null && !participeA.isEmpty();
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
		result.append(" (nom: ");
		result.append(nom);
		result.append(", numéro: ");
		result.append(numéro);
		result.append(')');
		return result.toString();
	}

} //JoueurImpl
