/**
 */
package fr.steph.foot.matchs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Possession End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.steph.foot.matchs.PossessionEnd#getExecution <em>Execution</em>}</li>
 * </ul>
 *
 * @see fr.steph.foot.matchs.MatchsPackage#getPossessionEnd()
 * @model
 * @generated
 */
public interface PossessionEnd extends AbstractEnd {
	/**
	 * Returns the value of the '<em><b>Execution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution</em>' reference.
	 * @see #setExecution(Possession)
	 * @see fr.steph.foot.matchs.MatchsPackage#getPossessionEnd_Execution()
	 * @model required="true"
	 * @generated
	 */
	Possession getExecution();

	/**
	 * Sets the value of the '{@link fr.steph.foot.matchs.PossessionEnd#getExecution <em>Execution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution</em>' reference.
	 * @see #getExecution()
	 * @generated
	 */
	void setExecution(Possession value);

} // PossessionEnd
