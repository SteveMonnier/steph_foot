/**
 */
package fr.steph.foot.matchs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.steph.foot.matchs.ExecutionEnd#getExecution <em>Execution</em>}</li>
 * </ul>
 *
 * @see fr.steph.foot.matchs.MatchsPackage#getExecutionEnd()
 * @model
 * @generated
 */
public interface ExecutionEnd extends AbstractEnd {
	/**
	 * Returns the value of the '<em><b>Execution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution</em>' reference.
	 * @see #setExecution(Execution)
	 * @see fr.steph.foot.matchs.MatchsPackage#getExecutionEnd_Execution()
	 * @model required="true"
	 * @generated
	 */
	Execution getExecution();

	/**
	 * Sets the value of the '{@link fr.steph.foot.matchs.ExecutionEnd#getExecution <em>Execution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution</em>' reference.
	 * @see #getExecution()
	 * @generated
	 */
	void setExecution(Execution value);

} // ExecutionEnd
