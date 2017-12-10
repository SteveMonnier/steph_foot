/**
 */
package fr.steph.foot.matchs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A message sent from a participant to another (or itself).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.steph.foot.matchs.Action#getName <em>Name</em>}</li>
 *   <li>{@link fr.steph.foot.matchs.Action#getSendingEnd <em>Sending End</em>}</li>
 *   <li>{@link fr.steph.foot.matchs.Action#getReceivingEnd <em>Receiving End</em>}</li>
 *   <li>{@link fr.steph.foot.matchs.Action#getActionType <em>Action Type</em>}</li>
 * </ul>
 *
 * @see fr.steph.foot.matchs.MatchsPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends TimedEvent {
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
	 * @see fr.steph.foot.matchs.MatchsPackage#getAction_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.steph.foot.matchs.Action#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Sending End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sending End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sending End</em>' reference.
	 * @see #setSendingEnd(ActionEnd)
	 * @see fr.steph.foot.matchs.MatchsPackage#getAction_SendingEnd()
	 * @model required="true"
	 * @generated
	 */
	ActionEnd getSendingEnd();

	/**
	 * Sets the value of the '{@link fr.steph.foot.matchs.Action#getSendingEnd <em>Sending End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sending End</em>' reference.
	 * @see #getSendingEnd()
	 * @generated
	 */
	void setSendingEnd(ActionEnd value);

	/**
	 * Returns the value of the '<em><b>Receiving End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receiving End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receiving End</em>' reference.
	 * @see #setReceivingEnd(ActionEnd)
	 * @see fr.steph.foot.matchs.MatchsPackage#getAction_ReceivingEnd()
	 * @model required="true"
	 * @generated
	 */
	ActionEnd getReceivingEnd();

	/**
	 * Sets the value of the '{@link fr.steph.foot.matchs.Action#getReceivingEnd <em>Receiving End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiving End</em>' reference.
	 * @see #getReceivingEnd()
	 * @generated
	 */
	void setReceivingEnd(ActionEnd value);

	/**
	 * Returns the value of the '<em><b>Action Type</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.steph.foot.matchs.ActionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Type</em>' attribute.
	 * @see fr.steph.foot.matchs.ActionType
	 * @see #setActionType(ActionType)
	 * @see fr.steph.foot.matchs.MatchsPackage#getAction_ActionType()
	 * @model
	 * @generated
	 */
	ActionType getActionType();

	/**
	 * Sets the value of the '{@link fr.steph.foot.matchs.Action#getActionType <em>Action Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Type</em>' attribute.
	 * @see fr.steph.foot.matchs.ActionType
	 * @see #getActionType()
	 * @generated
	 */
	void setActionType(ActionType value);

} // Action
