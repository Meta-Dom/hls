/**
 */
package hu.metadom.hls.ssamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Switch Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSwitchType()
 * @model
 * @generated
 */
public enum SwitchType implements Enumerator {
	/**
	 * The '<em><b>IF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IF_VALUE
	 * @generated
	 * @ordered
	 */
	IF(0, "IF", "IF"),

	/**
	 * The '<em><b>SWITCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SWITCH_VALUE
	 * @generated
	 * @ordered
	 */
	SWITCH(1, "SWITCH", "SWITCH"),

	/**
	 * The '<em><b>CONDOP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONDOP_VALUE
	 * @generated
	 * @ordered
	 */
	CONDOP(2, "CONDOP", "CONDOP"),

	/**
	 * The '<em><b>LOGICAND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGICAND_VALUE
	 * @generated
	 * @ordered
	 */
	LOGICAND(3, "LOGICAND", "LOGICAND"),

	/**
	 * The '<em><b>LOGICOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGICOR_VALUE
	 * @generated
	 * @ordered
	 */
	LOGICOR(4, "LOGICOR", "LOGICOR");

	/**
	 * The '<em><b>IF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IF_VALUE = 0;

	/**
	 * The '<em><b>SWITCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SWITCH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH_VALUE = 1;

	/**
	 * The '<em><b>CONDOP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONDOP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONDOP_VALUE = 2;

	/**
	 * The '<em><b>LOGICAND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGICAND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOGICAND_VALUE = 3;

	/**
	 * The '<em><b>LOGICOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGICOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOGICOR_VALUE = 4;

	/**
	 * An array of all the '<em><b>Switch Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SwitchType[] VALUES_ARRAY = new SwitchType[] { IF, SWITCH, CONDOP, LOGICAND, LOGICOR, };

	/**
	 * A public read-only list of all the '<em><b>Switch Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SwitchType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Switch Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SwitchType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SwitchType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Switch Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SwitchType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SwitchType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Switch Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SwitchType get(int value) {
		switch (value) {
		case IF_VALUE:
			return IF;
		case SWITCH_VALUE:
			return SWITCH;
		case CONDOP_VALUE:
			return CONDOP;
		case LOGICAND_VALUE:
			return LOGICAND;
		case LOGICOR_VALUE:
			return LOGICOR;
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
	private SwitchType(int value, String name, String literal) {
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

} //SwitchType
