/**
 */
package fr.steph.foot.matchs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Use</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A reference to  or invocation of another interaction defined elsewhere.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.steph.foot.matchs.InteractionUse#getType <em>Type</em>}</li>
 *   <li>{@link fr.steph.foot.matchs.InteractionUse#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link fr.steph.foot.matchs.InteractionUse#getCoveredParticipants <em>Covered Participants</em>}</li>
 *   <li>{@link fr.steph.foot.matchs.InteractionUse#getStart <em>Start</em>}</li>
 *   <li>{@link fr.steph.foot.matchs.InteractionUse#getFinish <em>Finish</em>}</li>
 * </ul>
 *
 * @see fr.steph.foot.matchs.MatchsPackage#getInteractionUse()
 * @model
 * @generated
 */
public interface InteractionUse extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"\"ref\""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see fr.steph.foot.matchs.MatchsPackage#getInteractionUse_Type()
	 * @model default="\"ref\"" required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link fr.steph.foot.matchs.InteractionUse#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Interaction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interaction</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction</em>' reference.
	 * @see #setInteraction(Match)
	 * @see fr.steph.foot.matchs.MatchsPackage#getInteractionUse_Interaction()
	 * @model required="true"
	 * @generated
	 */
	Match getInteraction();

	/**
	 * Sets the value of the '{@link fr.steph.foot.matchs.InteractionUse#getInteraction <em>Interaction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interaction</em>' reference.
	 * @see #getInteraction()
	 * @generated
	 */
	void setInteraction(Match value);

	/**
	 * Returns the value of the '<em><b>Covered Participants</b></em>' reference list.
	 * The list contents are of type {@link fr.steph.foot.matchs.Joueur}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Covered Participants</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Covered Participants</em>' reference list.
	 * @see fr.steph.foot.matchs.MatchsPackage#getInteractionUse_CoveredParticipants()
	 * @model required="true"
	 * @generated
	 */
	EList<Joueur> getCoveredParticipants();

	/**
	 * Returns the value of the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' reference.
	 * @see #setStart(InteractionUseEnd)
	 * @see fr.steph.foot.matchs.MatchsPackage#getInteractionUse_Start()
	 * @model required="true"
	 * @generated
	 */
	InteractionUseEnd getStart();

	/**
	 * Sets the value of the '{@link fr.steph.foot.matchs.InteractionUse#getStart <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(InteractionUseEnd value);

	/**
	 * Returns the value of the '<em><b>Finish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finish</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finish</em>' reference.
	 * @see #setFinish(InteractionUseEnd)
	 * @see fr.steph.foot.matchs.MatchsPackage#getInteractionUse_Finish()
	 * @model required="true"
	 * @generated
	 */
	InteractionUseEnd getFinish();

	/**
	 * Sets the value of the '{@link fr.steph.foot.matchs.InteractionUse#getFinish <em>Finish</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finish</em>' reference.
	 * @see #getFinish()
	 * @generated
	 */
	void setFinish(InteractionUseEnd value);

} // InteractionUse
