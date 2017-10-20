/**
 */
package fr.steph.foot.matchs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Participant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.steph.foot.matchs.Participant#getEst <em>Est</em>}</li>
 * </ul>
 *
 * @see fr.steph.foot.matchs.MatchsPackage#getParticipant()
 * @model
 * @generated
 */
public interface Participant extends EObject {
	/**
	 * Returns the value of the '<em><b>Est</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.steph.foot.matchs.Joueur#getParticipeA <em>Participe A</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est</em>' reference.
	 * @see #setEst(Joueur)
	 * @see fr.steph.foot.matchs.MatchsPackage#getParticipant_Est()
	 * @see fr.steph.foot.matchs.Joueur#getParticipeA
	 * @model opposite="participeA" required="true"
	 * @generated
	 */
	Joueur getEst();

	/**
	 * Sets the value of the '{@link fr.steph.foot.matchs.Participant#getEst <em>Est</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est</em>' reference.
	 * @see #getEst()
	 * @generated
	 */
	void setEst(Joueur value);

} // Participant
