/**
 */
package fr.steph.foot.matchs;

import org.eclipse.emf.ecore.EOperation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Passe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.steph.foot.matchs.Passe#getOperation <em>Operation</em>}</li>
 *   <li>{@link fr.steph.foot.matchs.Passe#isRéussi <em>Réussi</em>}</li>
 * </ul>
 *
 * @see fr.steph.foot.matchs.MatchsPackage#getPasse()
 * @model
 * @generated
 */
public interface Passe extends Action {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' reference.
	 * @see #setOperation(EOperation)
	 * @see fr.steph.foot.matchs.MatchsPackage#getPasse_Operation()
	 * @model required="true"
	 * @generated
	 */
	EOperation getOperation();

	/**
	 * Sets the value of the '{@link fr.steph.foot.matchs.Passe#getOperation <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(EOperation value);

	/**
	 * Returns the value of the '<em><b>Réussi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Réussi</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Réussi</em>' attribute.
	 * @see #setRéussi(boolean)
	 * @see fr.steph.foot.matchs.MatchsPackage#getPasse_Réussi()
	 * @model
	 * @generated
	 */
	boolean isRéussi();

	/**
	 * Sets the value of the '{@link fr.steph.foot.matchs.Passe#isRéussi <em>Réussi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Réussi</em>' attribute.
	 * @see #isRéussi()
	 * @generated
	 */
	void setRéussi(boolean value);

} // Passe
