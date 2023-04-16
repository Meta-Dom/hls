/**
 */
package hu.metadom.hls.ssamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Struct Bitfield Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.metadom.hls.ssamodel.StructBitfieldMember#getBitfieldValue <em>Bitfield Value</em>}</li>
 * </ul>
 *
 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getStructBitfieldMember()
 * @model
 * @generated
 */
public interface StructBitfieldMember extends StructMember {
	/**
	 * Returns the value of the '<em><b>Bitfield Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bitfield Value</em>' containment reference.
	 * @see #setBitfieldValue(CompileTimeExpression)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getStructBitfieldMember_BitfieldValue()
	 * @model containment="true"
	 * @generated
	 */
	CompileTimeExpression getBitfieldValue();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.StructBitfieldMember#getBitfieldValue <em>Bitfield Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bitfield Value</em>' containment reference.
	 * @see #getBitfieldValue()
	 * @generated
	 */
	void setBitfieldValue(CompileTimeExpression value);

} // StructBitfieldMember
