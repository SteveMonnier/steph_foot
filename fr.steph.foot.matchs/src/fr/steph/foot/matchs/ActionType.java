/**
 */
package fr.steph.foot.matchs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Action Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.steph.foot.matchs.MatchsPackage#getActionType()
 * @model
 * @generated
 */
public enum ActionType implements Enumerator {
	/**
	 * The '<em><b>Passe réussi</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PASSE_RÉUSSI_VALUE
	 * @generated
	 * @ordered
	 */
	PASSE_RÉUSSI(0, "Passe_réussi", "Passe_r\u00e9ussi"),

	/**
	 * The '<em><b>Passe décisive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PASSE_DÉCISIVE_VALUE
	 * @generated
	 * @ordered
	 */
	PASSE_DÉCISIVE(1, "Passe_décisive", "Passe_d\u00e9cisive"),

	/**
	 * The '<em><b>Passe neutre</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PASSE_NEUTRE_VALUE
	 * @generated
	 * @ordered
	 */
	PASSE_NEUTRE(2, "Passe_neutre", "Passe_neutre"),

	/**
	 * The '<em><b>Passe out</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PASSE_OUT_VALUE
	 * @generated
	 * @ordered
	 */
	PASSE_OUT(3, "Passe_out", "Passe_out"),

	/**
	 * The '<em><b>Passe adversaire</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PASSE_ADVERSAIRE_VALUE
	 * @generated
	 * @ordered
	 */
	PASSE_ADVERSAIRE(4, "Passe_adversaire", "Passe_adversaire"),

	/**
	 * The '<em><b>Ballon perdu</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BALLON_PERDU_VALUE
	 * @generated
	 * @ordered
	 */
	BALLON_PERDU(5, "Ballon_perdu", "Ballon_perdu"),

	/**
	 * The '<em><b>Dribble perdu</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DRIBBLE_PERDU_VALUE
	 * @generated
	 * @ordered
	 */
	DRIBBLE_PERDU(6, "Dribble_perdu", "Dribble_perdu"),

	/**
	 * The '<em><b>Centre réussi</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CENTRE_RÉUSSI_VALUE
	 * @generated
	 * @ordered
	 */
	CENTRE_RÉUSSI(7, "Centre_réussi", "Centre_r\u00e9ussi"),

	/**
	 * The '<em><b>Centre out</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CENTRE_OUT_VALUE
	 * @generated
	 * @ordered
	 */
	CENTRE_OUT(7, "Centre_out", "Centre_out"),

	/**
	 * The '<em><b>Centre adversaire</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CENTRE_ADVERSAIRE_VALUE
	 * @generated
	 * @ordered
	 */
	CENTRE_ADVERSAIRE(7, "Centre_adversaire", "Centre_adversaire"),

	/**
	 * The '<em><b>Tir cadré</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIR_CADRÉ_VALUE
	 * @generated
	 * @ordered
	 */
	TIR_CADRÉ(7, "Tir_cadré", "Tir_cadr\u00e9"),

	/**
	 * The '<em><b>Tir non cadré</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIR_NON_CADRÉ_VALUE
	 * @generated
	 * @ordered
	 */
	TIR_NON_CADRÉ(7, "Tir_non_cadré", "Tir_non_cadr\u00e9"),

	/**
	 * The '<em><b>Tir contré</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIR_CONTRÉ_VALUE
	 * @generated
	 * @ordered
	 */
	TIR_CONTRÉ(12, "Tir_contré", "Tir_contr\u00e9"),

	/**
	 * The '<em><b>Corner</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CORNER_VALUE
	 * @generated
	 * @ordered
	 */
	CORNER(13, "Corner", "Corner"),

	/**
	 * The '<em><b>Touche</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOUCHE_VALUE
	 * @generated
	 * @ordered
	 */
	TOUCHE(14, "Touche", "Touche"),

	/**
	 * The '<em><b>Coup franc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COUP_FRANC_VALUE
	 * @generated
	 * @ordered
	 */
	COUP_FRANC(15, "Coup_franc", "Coup_franc");

	/**
	 * The '<em><b>Passe réussi</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Passe réussi</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PASSE_RÉUSSI
	 * @model name="Passe_réussi"
	 * @generated
	 * @ordered
	 */
	public static final int PASSE_RÉUSSI_VALUE = 0;

	/**
	 * The '<em><b>Passe décisive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Passe décisive</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PASSE_DÉCISIVE
	 * @model name="Passe_décisive"
	 * @generated
	 * @ordered
	 */
	public static final int PASSE_DÉCISIVE_VALUE = 1;

	/**
	 * The '<em><b>Passe neutre</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Passe neutre</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PASSE_NEUTRE
	 * @model name="Passe_neutre"
	 * @generated
	 * @ordered
	 */
	public static final int PASSE_NEUTRE_VALUE = 2;

	/**
	 * The '<em><b>Passe out</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Passe out</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PASSE_OUT
	 * @model name="Passe_out"
	 * @generated
	 * @ordered
	 */
	public static final int PASSE_OUT_VALUE = 3;

	/**
	 * The '<em><b>Passe adversaire</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Passe adversaire</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PASSE_ADVERSAIRE
	 * @model name="Passe_adversaire"
	 * @generated
	 * @ordered
	 */
	public static final int PASSE_ADVERSAIRE_VALUE = 4;

	/**
	 * The '<em><b>Ballon perdu</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ballon perdu</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BALLON_PERDU
	 * @model name="Ballon_perdu"
	 * @generated
	 * @ordered
	 */
	public static final int BALLON_PERDU_VALUE = 5;

	/**
	 * The '<em><b>Dribble perdu</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dribble perdu</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DRIBBLE_PERDU
	 * @model name="Dribble_perdu"
	 * @generated
	 * @ordered
	 */
	public static final int DRIBBLE_PERDU_VALUE = 6;

	/**
	 * The '<em><b>Centre réussi</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Centre réussi</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CENTRE_RÉUSSI
	 * @model name="Centre_réussi"
	 * @generated
	 * @ordered
	 */
	public static final int CENTRE_RÉUSSI_VALUE = 7;

	/**
	 * The '<em><b>Centre out</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Centre out</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CENTRE_OUT
	 * @model name="Centre_out"
	 * @generated
	 * @ordered
	 */
	public static final int CENTRE_OUT_VALUE = 7;

	/**
	 * The '<em><b>Centre adversaire</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Centre adversaire</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CENTRE_ADVERSAIRE
	 * @model name="Centre_adversaire"
	 * @generated
	 * @ordered
	 */
	public static final int CENTRE_ADVERSAIRE_VALUE = 7;

	/**
	 * The '<em><b>Tir cadré</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tir cadré</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIR_CADRÉ
	 * @model name="Tir_cadré"
	 * @generated
	 * @ordered
	 */
	public static final int TIR_CADRÉ_VALUE = 7;

	/**
	 * The '<em><b>Tir non cadré</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tir non cadré</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIR_NON_CADRÉ
	 * @model name="Tir_non_cadré"
	 * @generated
	 * @ordered
	 */
	public static final int TIR_NON_CADRÉ_VALUE = 7;

	/**
	 * The '<em><b>Tir contré</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tir contré</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIR_CONTRÉ
	 * @model name="Tir_contré"
	 * @generated
	 * @ordered
	 */
	public static final int TIR_CONTRÉ_VALUE = 12;

	/**
	 * The '<em><b>Corner</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Corner</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CORNER
	 * @model name="Corner"
	 * @generated
	 * @ordered
	 */
	public static final int CORNER_VALUE = 13;

	/**
	 * The '<em><b>Touche</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Touche</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOUCHE
	 * @model name="Touche"
	 * @generated
	 * @ordered
	 */
	public static final int TOUCHE_VALUE = 14;

	/**
	 * The '<em><b>Coup franc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Coup franc</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COUP_FRANC
	 * @model name="Coup_franc"
	 * @generated
	 * @ordered
	 */
	public static final int COUP_FRANC_VALUE = 15;

	/**
	 * An array of all the '<em><b>Action Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ActionType[] VALUES_ARRAY =
		new ActionType[] {
			PASSE_RÉUSSI,
			PASSE_DÉCISIVE,
			PASSE_NEUTRE,
			PASSE_OUT,
			PASSE_ADVERSAIRE,
			BALLON_PERDU,
			DRIBBLE_PERDU,
			CENTRE_RÉUSSI,
			CENTRE_OUT,
			CENTRE_ADVERSAIRE,
			TIR_CADRÉ,
			TIR_NON_CADRÉ,
			TIR_CONTRÉ,
			CORNER,
			TOUCHE,
			COUP_FRANC,
		};

	/**
	 * A public read-only list of all the '<em><b>Action Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ActionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Action Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ActionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Action Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ActionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Action Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ActionType get(int value) {
		switch (value) {
			case PASSE_RÉUSSI_VALUE: return PASSE_RÉUSSI;
			case PASSE_DÉCISIVE_VALUE: return PASSE_DÉCISIVE;
			case PASSE_NEUTRE_VALUE: return PASSE_NEUTRE;
			case PASSE_OUT_VALUE: return PASSE_OUT;
			case PASSE_ADVERSAIRE_VALUE: return PASSE_ADVERSAIRE;
			case BALLON_PERDU_VALUE: return BALLON_PERDU;
			case DRIBBLE_PERDU_VALUE: return DRIBBLE_PERDU;
			case CENTRE_RÉUSSI_VALUE: return CENTRE_RÉUSSI;
			case TIR_CONTRÉ_VALUE: return TIR_CONTRÉ;
			case CORNER_VALUE: return CORNER;
			case TOUCHE_VALUE: return TOUCHE;
			case COUP_FRANC_VALUE: return COUP_FRANC;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ActionType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ActionType
