/**
 */
package fr.steph.foot.matchs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Possession Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.steph.foot.matchs.MatchsPackage#getPossessionType()
 * @model
 * @generated
 */
public enum PossessionType implements Enumerator {
	/**
	 * The '<em><b>Dribble</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DRIBBLE_VALUE
	 * @generated
	 * @ordered
	 */
	DRIBBLE(0, "Dribble", "Dribble"),

	/**
	 * The '<em><b>Ballon porté</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BALLON_PORTÉ_VALUE
	 * @generated
	 * @ordered
	 */
	BALLON_PORTÉ(1, "Ballon_porté", "Ballon_port\u00e9"),

	/**
	 * The '<em><b>Duel gagné</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DUEL_GAGNÉ_VALUE
	 * @generated
	 * @ordered
	 */
	DUEL_GAGNÉ(2, "Duel_gagné", "Duel_gagn\u00e9");

	/**
	 * The '<em><b>Dribble</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dribble</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DRIBBLE
	 * @model name="Dribble"
	 * @generated
	 * @ordered
	 */
	public static final int DRIBBLE_VALUE = 0;

	/**
	 * The '<em><b>Ballon porté</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ballon porté</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BALLON_PORTÉ
	 * @model name="Ballon_porté"
	 * @generated
	 * @ordered
	 */
	public static final int BALLON_PORTÉ_VALUE = 1;

	/**
	 * The '<em><b>Duel gagné</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Duel gagné</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DUEL_GAGNÉ
	 * @model name="Duel_gagné"
	 * @generated
	 * @ordered
	 */
	public static final int DUEL_GAGNÉ_VALUE = 2;

	/**
	 * An array of all the '<em><b>Possession Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PossessionType[] VALUES_ARRAY =
		new PossessionType[] {
			DRIBBLE,
			BALLON_PORTÉ,
			DUEL_GAGNÉ,
		};

	/**
	 * A public read-only list of all the '<em><b>Possession Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PossessionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Possession Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PossessionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PossessionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Possession Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PossessionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PossessionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Possession Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PossessionType get(int value) {
		switch (value) {
			case DRIBBLE_VALUE: return DRIBBLE;
			case BALLON_PORTÉ_VALUE: return BALLON_PORTÉ;
			case DUEL_GAGNÉ_VALUE: return DUEL_GAGNÉ;
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
	private PossessionType(int value, String name, String literal) {
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
	
} //PossessionType
