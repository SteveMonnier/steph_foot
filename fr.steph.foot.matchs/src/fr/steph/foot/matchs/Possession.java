/**
 */
package fr.steph.foot.matchs;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Possession</b></em>'.
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
 *   <li>{@link fr.steph.foot.matchs.Possession#getName <em>Name</em>}</li>
 *   <li>{@link fr.steph.foot.matchs.Possession#getOwner <em>Owner</em>}</li>
 *   <li>{@link fr.steph.foot.matchs.Possession#getStart <em>Start</em>}</li>
 *   <li>{@link fr.steph.foot.matchs.Possession#getEnd <em>End</em>}</li>
 *   <li>{@link fr.steph.foot.matchs.Possession#getPossessionType <em>Possession Type</em>}</li>
 *   <li>{@link fr.steph.foot.matchs.Possession#getPossessions <em>Possessions</em>}</li>
 * </ul>
 *
 * @see fr.steph.foot.matchs.MatchsPackage#getPossession()
 * @model
 * @generated
 */
public interface Possession extends EObject {
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
	 * @see fr.steph.foot.matchs.MatchsPackage#getPossession_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.steph.foot.matchs.Possession#getName <em>Name</em>}' attribute.
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
	 * @see fr.steph.foot.matchs.MatchsPackage#getPossession_Owner()
	 * @model required="true"
	 * @generated
	 */
	Participant getOwner();

	/**
	 * Sets the value of the '{@link fr.steph.foot.matchs.Possession#getOwner <em>Owner</em>}' reference.
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
	 * @see #setStart(PossessionEnd)
	 * @see fr.steph.foot.matchs.MatchsPackage#getPossession_Start()
	 * @model required="true"
	 * @generated
	 */
	PossessionEnd getStart();

	/**
	 * Sets the value of the '{@link fr.steph.foot.matchs.Possession#getStart <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(PossessionEnd value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' reference.
	 * @see #setEnd(PossessionEnd)
	 * @see fr.steph.foot.matchs.MatchsPackage#getPossession_End()
	 * @model required="true"
	 * @generated
	 */
	PossessionEnd getEnd();

	/**
	 * Sets the value of the '{@link fr.steph.foot.matchs.Possession#getEnd <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(PossessionEnd value);

	/**
	 * Returns the value of the '<em><b>Possession Type</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.steph.foot.matchs.PossessionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Possession Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Possession Type</em>' attribute.
	 * @see fr.steph.foot.matchs.PossessionType
	 * @see #setPossessionType(PossessionType)
	 * @see fr.steph.foot.matchs.MatchsPackage#getPossession_PossessionType()
	 * @model
	 * @generated
	 */
	PossessionType getPossessionType();

	/**
	 * Sets the value of the '{@link fr.steph.foot.matchs.Possession#getPossessionType <em>Possession Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Possession Type</em>' attribute.
	 * @see fr.steph.foot.matchs.PossessionType
	 * @see #getPossessionType()
	 * @generated
	 */
	void setPossessionType(PossessionType value);

	/**
	 * Returns the value of the '<em><b>Possessions</b></em>' containment reference list.
	 * The list contents are of type {@link fr.steph.foot.matchs.Possession}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Possessions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Possessions</em>' containment reference list.
	 * @see fr.steph.foot.matchs.MatchsPackage#getPossession_Possessions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Possession> getPossessions();

} // Possession
