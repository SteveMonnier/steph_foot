/**
 */
package fr.steph.foot.matchs;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Joueur</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A named and typed instance which particpates in the interaction.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.steph.foot.matchs.Joueur#getNom <em>Nom</em>}</li>
 *   <li>{@link fr.steph.foot.matchs.Joueur#getType <em>Type</em>}</li>
 *   <li>{@link fr.steph.foot.matchs.Joueur#getNuméro <em>Numéro</em>}</li>
 *   <li>{@link fr.steph.foot.matchs.Joueur#getParticipeA <em>Participe A</em>}</li>
 * </ul>
 *
 * @see fr.steph.foot.matchs.MatchsPackage#getJoueur()
 * @model
 * @generated
 */
public interface Joueur extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see fr.steph.foot.matchs.MatchsPackage#getJoueur_Nom()
	 * @model required="true"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link fr.steph.foot.matchs.Joueur#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(EClass)
	 * @see fr.steph.foot.matchs.MatchsPackage#getJoueur_Type()
	 * @model required="true"
	 * @generated
	 */
	EClass getType();

	/**
	 * Sets the value of the '{@link fr.steph.foot.matchs.Joueur#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(EClass value);

	/**
	 * Returns the value of the '<em><b>Numéro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numéro</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numéro</em>' attribute.
	 * @see #setNuméro(int)
	 * @see fr.steph.foot.matchs.MatchsPackage#getJoueur_Numéro()
	 * @model
	 * @generated
	 */
	int getNuméro();

	/**
	 * Sets the value of the '{@link fr.steph.foot.matchs.Joueur#getNuméro <em>Numéro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numéro</em>' attribute.
	 * @see #getNuméro()
	 * @generated
	 */
	void setNuméro(int value);

	/**
	 * Returns the value of the '<em><b>Participe A</b></em>' reference list.
	 * The list contents are of type {@link fr.steph.foot.matchs.Participant}.
	 * It is bidirectional and its opposite is '{@link fr.steph.foot.matchs.Participant#getEst <em>Est</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participe A</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participe A</em>' reference list.
	 * @see fr.steph.foot.matchs.MatchsPackage#getJoueur_ParticipeA()
	 * @see fr.steph.foot.matchs.Participant#getEst
	 * @model opposite="est"
	 * @generated
	 */
	EList<Participant> getParticipeA();

} // Joueur
