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
 *   <li>{@link fr.steph.foot.matchs.Passe#isR�ussi <em>R�ussi</em>}</li>
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
	 * Returns the value of the '<em><b>R�ussi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>R�ussi</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>R�ussi</em>' attribute.
	 * @see #setR�ussi(boolean)
	 * @see fr.steph.foot.matchs.MatchsPackage#getPasse_R�ussi()
	 * @model
	 * @generated
	 */
	boolean isR�ussi();

	/**
	 * Sets the value of the '{@link fr.steph.foot.matchs.Passe#isR�ussi <em>R�ussi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>R�ussi</em>' attribute.
	 * @see #isR�ussi()
	 * @generated
	 */
	void setR�ussi(boolean value);

} // Passe
