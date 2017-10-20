/**
 */
package fr.steph.foot.matchs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Use End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.steph.foot.matchs.InteractionUseEnd#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see fr.steph.foot.matchs.MatchsPackage#getInteractionUseEnd()
 * @model
 * @generated
 */
public interface InteractionUseEnd extends AbstractEnd {
	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(InteractionUse)
	 * @see fr.steph.foot.matchs.MatchsPackage#getInteractionUseEnd_Owner()
	 * @model required="true"
	 * @generated
	 */
	InteractionUse getOwner();

	/**
	 * Sets the value of the '{@link fr.steph.foot.matchs.InteractionUseEnd#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(InteractionUse value);

} // InteractionUseEnd
