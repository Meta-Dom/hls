/**
 */
package hu.metadom.hls.ssamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ssa Struct Read</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.metadom.hls.ssamodel.SsaStructRead#getStruct <em>Struct</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.SsaStructRead#getField <em>Field</em>}</li>
 * </ul>
 *
 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaStructRead()
 * @model
 * @generated
 */
public interface SsaStructRead extends SsaNode {
	/**
	 * Returns the value of the '<em><b>Struct</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Struct</em>' reference.
	 * @see #setStruct(SsaNode)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaStructRead_Struct()
	 * @model
	 * @generated
	 */
	SsaNode getStruct();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.SsaStructRead#getStruct <em>Struct</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Struct</em>' reference.
	 * @see #getStruct()
	 * @generated
	 */
	void setStruct(SsaNode value);

	/**
	 * Returns the value of the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' reference.
	 * @see #setField(StructMember)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaStructRead_Field()
	 * @model
	 * @generated
	 */
	StructMember getField();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.SsaStructRead#getField <em>Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' reference.
	 * @see #getField()
	 * @generated
	 */
	void setField(StructMember value);

} // SsaStructRead
