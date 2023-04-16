/**
 */
package hu.metadom.hls.ssamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Ssa Binary Operator Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaBinaryOperatorKind()
 * @model
 * @generated
 */
public enum SsaBinaryOperatorKind implements Enumerator {
	/**
	 * The '<em><b>MULTIPLY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPLY_VALUE
	 * @generated
	 * @ordered
	 */
	MULTIPLY(0, "MULTIPLY", "MULTIPLY"),

	/**
	 * The '<em><b>DIVIDE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIVIDE_VALUE
	 * @generated
	 * @ordered
	 */
	DIVIDE(1, "DIVIDE", "DIVIDE"),

	/**
	 * The '<em><b>MODULO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODULO_VALUE
	 * @generated
	 * @ordered
	 */
	MODULO(2, "MODULO", "MODULO"),

	/**
	 * The '<em><b>ADD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADD_VALUE
	 * @generated
	 * @ordered
	 */
	ADD(3, "ADD", "ADD"),

	/**
	 * The '<em><b>SUBTRACT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBTRACT_VALUE
	 * @generated
	 * @ordered
	 */
	SUBTRACT(4, "SUBTRACT", "SUBTRACT"),

	/**
	 * The '<em><b>LEFT SHIFT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEFT_SHIFT_VALUE
	 * @generated
	 * @ordered
	 */
	LEFT_SHIFT(5, "LEFT_SHIFT", "LEFT_SHIFT"),

	/**
	 * The '<em><b>RIGHT SHIFT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RIGHT_SHIFT_VALUE
	 * @generated
	 * @ordered
	 */
	RIGHT_SHIFT(6, "RIGHT_SHIFT", "RIGHT_SHIFT"),

	/**
	 * The '<em><b>LESS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESS_VALUE
	 * @generated
	 * @ordered
	 */
	LESS(7, "LESS", "LESS"),

	/**
	 * The '<em><b>GREATER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATER_VALUE
	 * @generated
	 * @ordered
	 */
	GREATER(8, "GREATER", "GREATER"),

	/**
	 * The '<em><b>LESS EQUAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESS_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	LESS_EQUAL(9, "LESS_EQUAL", "LESS_EQUAL"),

	/**
	 * The '<em><b>GREATER EQUAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATER_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	GREATER_EQUAL(10, "GREATER_EQUAL", "GREATER_EQUAL"),

	/**
	 * The '<em><b>EQUAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	EQUAL(11, "EQUAL", "EQUAL"),

	/**
	 * The '<em><b>NOT EQUAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_EQUAL(12, "NOT_EQUAL", "NOT_EQUAL"),

	/**
	 * The '<em><b>BIT AND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIT_AND_VALUE
	 * @generated
	 * @ordered
	 */
	BIT_AND(13, "BIT_AND", "BIT_AND"),

	/**
	 * The '<em><b>BIT XOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIT_XOR_VALUE
	 * @generated
	 * @ordered
	 */
	BIT_XOR(14, "BIT_XOR", "BIT_XOR"),

	/**
	 * The '<em><b>BIT OR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIT_OR_VALUE
	 * @generated
	 * @ordered
	 */
	BIT_OR(15, "BIT_OR", "BIT_OR"),

	/**
	 * The '<em><b>LOGIC AND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGIC_AND_VALUE
	 * @generated
	 * @ordered
	 */
	LOGIC_AND(16, "LOGIC_AND", "LOGIC_AND"),

	/**
	 * The '<em><b>LOGIC OR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGIC_OR_VALUE
	 * @generated
	 * @ordered
	 */
	LOGIC_OR(17, "LOGIC_OR", "LOGIC_OR");

	/**
	 * The '<em><b>MULTIPLY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPLY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MULTIPLY_VALUE = 0;

	/**
	 * The '<em><b>DIVIDE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIVIDE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DIVIDE_VALUE = 1;

	/**
	 * The '<em><b>MODULO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODULO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MODULO_VALUE = 2;

	/**
	 * The '<em><b>ADD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ADD_VALUE = 3;

	/**
	 * The '<em><b>SUBTRACT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBTRACT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SUBTRACT_VALUE = 4;

	/**
	 * The '<em><b>LEFT SHIFT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEFT_SHIFT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LEFT_SHIFT_VALUE = 5;

	/**
	 * The '<em><b>RIGHT SHIFT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RIGHT_SHIFT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RIGHT_SHIFT_VALUE = 6;

	/**
	 * The '<em><b>LESS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LESS_VALUE = 7;

	/**
	 * The '<em><b>GREATER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GREATER_VALUE = 8;

	/**
	 * The '<em><b>LESS EQUAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESS_EQUAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LESS_EQUAL_VALUE = 9;

	/**
	 * The '<em><b>GREATER EQUAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATER_EQUAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GREATER_EQUAL_VALUE = 10;

	/**
	 * The '<em><b>EQUAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EQUAL_VALUE = 11;

	/**
	 * The '<em><b>NOT EQUAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_EQUAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOT_EQUAL_VALUE = 12;

	/**
	 * The '<em><b>BIT AND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIT_AND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BIT_AND_VALUE = 13;

	/**
	 * The '<em><b>BIT XOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIT_XOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BIT_XOR_VALUE = 14;

	/**
	 * The '<em><b>BIT OR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIT_OR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BIT_OR_VALUE = 15;

	/**
	 * The '<em><b>LOGIC AND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGIC_AND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOGIC_AND_VALUE = 16;

	/**
	 * The '<em><b>LOGIC OR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGIC_OR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOGIC_OR_VALUE = 17;

	/**
	 * An array of all the '<em><b>Ssa Binary Operator Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SsaBinaryOperatorKind[] VALUES_ARRAY = new SsaBinaryOperatorKind[] { MULTIPLY, DIVIDE, MODULO,
			ADD, SUBTRACT, LEFT_SHIFT, RIGHT_SHIFT, LESS, GREATER, LESS_EQUAL, GREATER_EQUAL, EQUAL, NOT_EQUAL, BIT_AND,
			BIT_XOR, BIT_OR, LOGIC_AND, LOGIC_OR, };

	/**
	 * A public read-only list of all the '<em><b>Ssa Binary Operator Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SsaBinaryOperatorKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ssa Binary Operator Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SsaBinaryOperatorKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SsaBinaryOperatorKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ssa Binary Operator Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SsaBinaryOperatorKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SsaBinaryOperatorKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ssa Binary Operator Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SsaBinaryOperatorKind get(int value) {
		switch (value) {
		case MULTIPLY_VALUE:
			return MULTIPLY;
		case DIVIDE_VALUE:
			return DIVIDE;
		case MODULO_VALUE:
			return MODULO;
		case ADD_VALUE:
			return ADD;
		case SUBTRACT_VALUE:
			return SUBTRACT;
		case LEFT_SHIFT_VALUE:
			return LEFT_SHIFT;
		case RIGHT_SHIFT_VALUE:
			return RIGHT_SHIFT;
		case LESS_VALUE:
			return LESS;
		case GREATER_VALUE:
			return GREATER;
		case LESS_EQUAL_VALUE:
			return LESS_EQUAL;
		case GREATER_EQUAL_VALUE:
			return GREATER_EQUAL;
		case EQUAL_VALUE:
			return EQUAL;
		case NOT_EQUAL_VALUE:
			return NOT_EQUAL;
		case BIT_AND_VALUE:
			return BIT_AND;
		case BIT_XOR_VALUE:
			return BIT_XOR;
		case BIT_OR_VALUE:
			return BIT_OR;
		case LOGIC_AND_VALUE:
			return LOGIC_AND;
		case LOGIC_OR_VALUE:
			return LOGIC_OR;
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
	private SsaBinaryOperatorKind(int value, String name, String literal) {
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

} //SsaBinaryOperatorKind
