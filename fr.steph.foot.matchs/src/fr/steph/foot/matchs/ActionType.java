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
	 * The '<em><b>Passe r�ussi</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PASSE_R�USSI_VALUE
	 * @generated
	 * @ordered
	 */
	PASSE_R�USSI(0, "Passe_r�ussi", "Passe_r\u00e9ussi"),

	/**
	 * The '<em><b>Passe d�cisive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PASSE_D�CISIVE_VALUE
	 * @generated
	 * @ordered
	 */
	PASSE_D�CISIVE(1, "Passe_d�cisive", "Passe_d\u00e9cisive"),

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
	 * The '<em><b>Centre r�ussi</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CENTRE_R�USSI_VALUE
	 * @generated
	 * @ordered
	 */
	CENTRE_R�USSI(7, "Centre_r�ussi", "Centre_r\u00e9ussi"),

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
	 * The '<em><b>Tir cadr�</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIR_CADR�_VALUE
	 * @generated
	 * @ordered
	 */
	TIR_CADR�(7, "Tir_cadr�", "Tir_cadr\u00e9"),

	/**
	 * The '<em><b>Tir non cadr�</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIR_NON_CADR�_VALUE
	 * @generated
	 * @ordered
	 */
	TIR_NON_CADR�(7, "Tir_non_cadr�", "Tir_non_cadr\u00e9"),

	/**
	 * The '<em><b>Tir contr�</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIR_CONTR�_VALUE
	 * @generated
	 * @ordered
	 */
	TIR_CONTR�(12, "Tir_contr�", "Tir_contr\u00e9"),

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
	 * The '<em><b>Passe r�ussi</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Passe r�ussi</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PASSE_R�USSI
	 * @model name="Passe_r�ussi"
	 * @generated
	 * @ordered
	 */
	public static final int PASSE_R�USSI_VALUE = 0;

	/**
	 * The '<em><b>Passe d�cisive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Passe d�cisive</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PASSE_D�CISIVE
	 * @model name="Passe_d�cisive"
	 * @generated
	 * @ordered
	 */
	public static final int PASSE_D�CISIVE_VALUE = 1;

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
	 * The '<em><b>Centre r�ussi</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Centre r�ussi</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CENTRE_R�USSI
	 * @model name="Centre_r�ussi"
	 * @generated
	 * @ordered
	 */
	public static final int CENTRE_R�USSI_VALUE = 7;

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
	 * The '<em><b>Tir cadr�</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tir cadr�</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIR_CADR�
	 * @model name="Tir_cadr�"
	 * @generated
	 * @ordered
	 */
	public static final int TIR_CADR�_VALUE = 7;

	/**
	 * The '<em><b>Tir non cadr�</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tir non cadr�</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIR_NON_CADR�
	 * @model name="Tir_non_cadr�"
	 * @generated
	 * @ordered
	 */
	public static final int TIR_NON_CADR�_VALUE = 7;

	/**
	 * The '<em><b>Tir contr�</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tir contr�</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIR_CONTR�
	 * @model name="Tir_contr�"
	 * @generated
	 * @ordered
	 */
	public static final int TIR_CONTR�_VALUE = 12;

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
			PASSE_R�USSI,
			PASSE_D�CISIVE,
			PASSE_NEUTRE,
			PASSE_OUT,
			PASSE_ADVERSAIRE,
			BALLON_PERDU,
			DRIBBLE_PERDU,
			CENTRE_R�USSI,
			CENTRE_OUT,
			CENTRE_ADVERSAIRE,
			TIR_CADR�,
			TIR_NON_CADR�,
			TIR_CONTR�,
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
			case PASSE_R�USSI_VALUE: return PASSE_R�USSI;
			case PASSE_D�CISIVE_VALUE: return PASSE_D�CISIVE;
			case PASSE_NEUTRE_VALUE: return PASSE_NEUTRE;
			case PASSE_OUT_VALUE: return PASSE_OUT;
			case PASSE_ADVERSAIRE_VALUE: return PASSE_ADVERSAIRE;
			case BALLON_PERDU_VALUE: return BALLON_PERDU;
			case DRIBBLE_PERDU_VALUE: return DRIBBLE_PERDU;
			case CENTRE_R�USSI_VALUE: return CENTRE_R�USSI;
			case TIR_CONTR�_VALUE: return TIR_CONTR�;
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
