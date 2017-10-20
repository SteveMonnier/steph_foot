/**
 */
package fr.steph.foot.matchs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Saison</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A simple container for Interactions, so that one can put several interactions inside the same resource.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.steph.foot.matchs.Saison#getName <em>Name</em>}</li>
 *   <li>{@link fr.steph.foot.matchs.Saison#getOwnedInteractions <em>Owned Interactions</em>}</li>
 *   <li>{@link fr.steph.foot.matchs.Saison#getJoueurs <em>Joueurs</em>}</li>
 *   <li>{@link fr.steph.foot.matchs.Saison#getAnnee <em>Annee</em>}</li>
 *   <li>{@link fr.steph.foot.matchs.Saison#getNomEquipe <em>Nom Equipe</em>}</li>
 * </ul>
 *
 * @see fr.steph.foot.matchs.MatchsPackage#getSaison()
 * @model
 * @generated
 */
public interface Saison extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.steph.foot.matchs.MatchsPackage#getSaison_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.steph.foot.matchs.Saison#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Owned Interactions</b></em>' containment reference list.
	 * The list contents are of type {@link fr.steph.foot.matchs.Match}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Interactions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Interactions</em>' containment reference list.
	 * @see fr.steph.foot.matchs.MatchsPackage#getSaison_OwnedInteractions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Match> getOwnedInteractions();

	/**
	 * Returns the value of the '<em><b>Joueurs</b></em>' containment reference list.
	 * The list contents are of type {@link fr.steph.foot.matchs.Joueur}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Joueurs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Joueurs</em>' containment reference list.
	 * @see fr.steph.foot.matchs.MatchsPackage#getSaison_Joueurs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Joueur> getJoueurs();

	/**
	 * Returns the value of the '<em><b>Annee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annee</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annee</em>' attribute.
	 * @see #setAnnee(String)
	 * @see fr.steph.foot.matchs.MatchsPackage#getSaison_Annee()
	 * @model
	 * @generated
	 */
	String getAnnee();

	/**
	 * Sets the value of the '{@link fr.steph.foot.matchs.Saison#getAnnee <em>Annee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annee</em>' attribute.
	 * @see #getAnnee()
	 * @generated
	 */
	void setAnnee(String value);

	/**
	 * Returns the value of the '<em><b>Nom Equipe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom Equipe</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom Equipe</em>' attribute.
	 * @see #setNomEquipe(String)
	 * @see fr.steph.foot.matchs.MatchsPackage#getSaison_NomEquipe()
	 * @model
	 * @generated
	 */
	String getNomEquipe();

	/**
	 * Sets the value of the '{@link fr.steph.foot.matchs.Saison#getNomEquipe <em>Nom Equipe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom Equipe</em>' attribute.
	 * @see #getNomEquipe()
	 * @generated
	 */
	void setNomEquipe(String value);

} // Saison
