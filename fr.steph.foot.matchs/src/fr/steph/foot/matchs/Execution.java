/**
 */
package fr.steph.foot.matchs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents an interval of time in which a particapant is active executing some code.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.steph.foot.matchs.Execution#getName <em>Name</em>}</li>
 *   <li>{@link fr.steph.foot.matchs.Execution#getOwner <em>Owner</em>}</li>
 *   <li>{@link fr.steph.foot.matchs.Execution#getStart <em>Start</em>}</li>
 *   <li>{@link fr.steph.foot.matchs.Execution#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @see fr.steph.foot.matchs.MatchsPackage#getExecution()
 * @model
 * @generated
 */
public interface Execution extends EObject {
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
	 * @see fr.steph.foot.matchs.MatchsPackage#getExecution_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.steph.foot.matchs.Execution#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(Participant)
	 * @see fr.steph.foot.matchs.MatchsPackage#getExecution_Owner()
	 * @model required="true"
	 * @generated
	 */
	Participant getOwner();

	/**
	 * Sets the value of the '{@link fr.steph.foot.matchs.Execution#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Participant value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' reference.
	 * @see #setStart(ExecutionEnd)
	 * @see fr.steph.foot.matchs.MatchsPackage#getExecution_Start()
	 * @model required="true"
	 * @generated
	 */
	ExecutionEnd getStart();

	/**
	 * Sets the value of the '{@link fr.steph.foot.matchs.Execution#getStart <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(ExecutionEnd value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' reference.
	 * @see #setEnd(ExecutionEnd)
	 * @see fr.steph.foot.matchs.MatchsPackage#getExecution_End()
	 * @model required="true"
	 * @generated
	 */
	ExecutionEnd getEnd();

	/**
	 * Sets the value of the '{@link fr.steph.foot.matchs.Execution#getEnd <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(ExecutionEnd value);

} // Execution
