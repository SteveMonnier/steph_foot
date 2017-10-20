/**
 */
package fr.steph.foot.matchs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * All the atomic events (sending of a message, start and finish of an execution...) are represented by AbstractEnds and stored in chronological order in the interaction. The ordering must be total.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.steph.foot.matchs.AbstractEnd#getName <em>Name</em>}</li>
 *   <li>{@link fr.steph.foot.matchs.AbstractEnd#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @see fr.steph.foot.matchs.MatchsPackage#getAbstractEnd()
 * @model abstract="true"
 * @generated
 */
public interface AbstractEnd extends EObject {
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
	 * @see fr.steph.foot.matchs.MatchsPackage#getAbstractEnd_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.steph.foot.matchs.AbstractEnd#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(Joueur)
	 * @see fr.steph.foot.matchs.MatchsPackage#getAbstractEnd_Context()
	 * @model
	 * @generated
	 */
	Joueur getContext();

	/**
	 * Sets the value of the '{@link fr.steph.foot.matchs.AbstractEnd#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Joueur value);

} // AbstractEnd
