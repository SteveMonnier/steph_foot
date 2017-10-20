/**
 */
package fr.steph.foot.matchs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>But End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.steph.foot.matchs.ButEnd#getState <em>State</em>}</li>
 * </ul>
 *
 * @see fr.steph.foot.matchs.MatchsPackage#getButEnd()
 * @model
 * @generated
 */
public interface ButEnd extends AbstractEnd {
	/**
	 * Returns the value of the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' reference.
	 * @see #setState(But)
	 * @see fr.steph.foot.matchs.MatchsPackage#getButEnd_State()
	 * @model required="true"
	 * @generated
	 */
	But getState();

	/**
	 * Sets the value of the '{@link fr.steph.foot.matchs.ButEnd#getState <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(But value);

} // ButEnd
