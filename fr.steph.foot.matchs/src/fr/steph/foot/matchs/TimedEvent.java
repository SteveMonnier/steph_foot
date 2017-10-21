/**
 */
package fr.steph.foot.matchs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timed Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.steph.foot.matchs.TimedEvent#getTemps <em>Temps</em>}</li>
 * </ul>
 *
 * @see fr.steph.foot.matchs.MatchsPackage#getTimedEvent()
 * @model abstract="true"
 * @generated
 */
public interface TimedEvent extends EObject {
	/**
	 * Returns the value of the '<em><b>Temps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temps</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temps</em>' attribute.
	 * @see #setTemps(String)
	 * @see fr.steph.foot.matchs.MatchsPackage#getTimedEvent_Temps()
	 * @model
	 * @generated
	 */
	String getTemps();

	/**
	 * Sets the value of the '{@link fr.steph.foot.matchs.TimedEvent#getTemps <em>Temps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temps</em>' attribute.
	 * @see #getTemps()
	 * @generated
	 */
	void setTemps(String value);

} // TimedEvent
