/**
 */
package hu.metadom.hls.ssamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ssa Indirect Write</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.metadom.hls.ssamodel.SsaIndirectWrite#getPointer <em>Pointer</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.SsaIndirectWrite#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaIndirectWrite()
 * @model
 * @generated
 */
public interface SsaIndirectWrite extends SsaNode {
	/**
	 * Returns the value of the '<em><b>Pointer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pointer</em>' reference.
	 * @see #setPointer(SsaNode)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaIndirectWrite_Pointer()
	 * @model
	 * @generated
	 */
	SsaNode getPointer();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.SsaIndirectWrite#getPointer <em>Pointer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pointer</em>' reference.
	 * @see #getPointer()
	 * @generated
	 */
	void setPointer(SsaNode value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(SsaNode)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaIndirectWrite_Value()
	 * @model
	 * @generated
	 */
	SsaNode getValue();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.SsaIndirectWrite#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(SsaNode value);

} // SsaIndirectWrite
