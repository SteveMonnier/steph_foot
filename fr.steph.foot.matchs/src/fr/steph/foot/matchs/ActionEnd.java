/**
 */
package fr.steph.foot.matchs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.steph.foot.matchs.ActionEnd#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @see fr.steph.foot.matchs.MatchsPackage#getActionEnd()
 * @model
 * @generated
 */
public interface ActionEnd extends AbstractEnd {
	/**
	 * Returns the value of the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' reference.
	 * @see #setMessage(Action)
	 * @see fr.steph.foot.matchs.MatchsPackage#getActionEnd_Message()
	 * @model required="true"
	 * @generated
	 */
	Action getMessage();

	/**
	 * Sets the value of the '{@link fr.steph.foot.matchs.ActionEnd#getMessage <em>Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' reference.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(Action value);

} // ActionEnd
