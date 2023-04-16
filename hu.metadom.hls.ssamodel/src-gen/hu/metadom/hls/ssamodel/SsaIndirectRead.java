/**
 */
package hu.metadom.hls.ssamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ssa Indirect Read</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.metadom.hls.ssamodel.SsaIndirectRead#getPointer <em>Pointer</em>}</li>
 * </ul>
 *
 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaIndirectRead()
 * @model
 * @generated
 */
public interface SsaIndirectRead extends SsaNode {
	/**
	 * Returns the value of the '<em><b>Pointer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pointer</em>' reference.
	 * @see #setPointer(SsaNode)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaIndirectRead_Pointer()
	 * @model
	 * @generated
	 */
	SsaNode getPointer();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.SsaIndirectRead#getPointer <em>Pointer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pointer</em>' reference.
	 * @see #getPointer()
	 * @generated
	 */
	void setPointer(SsaNode value);

} // SsaIndirectRead
