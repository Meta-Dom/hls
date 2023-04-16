/**
 */
package hu.metadom.hls.ssamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.metadom.hls.ssamodel.EnumMember#getConst <em>Const</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.EnumMember#getValueNode <em>Value Node</em>}</li>
 * </ul>
 *
 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getEnumMember()
 * @model
 * @generated
 */
public interface EnumMember extends Member {
	/**
	 * Returns the value of the '<em><b>Const</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Const</em>' containment reference.
	 * @see #setConst(SsaConst)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getEnumMember_Const()
	 * @model containment="true"
	 * @generated
	 */
	SsaConst getConst();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.EnumMember#getConst <em>Const</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Const</em>' containment reference.
	 * @see #getConst()
	 * @generated
	 */
	void setConst(SsaConst value);

	/**
	 * Returns the value of the '<em><b>Value Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Node</em>' containment reference.
	 * @see #setValueNode(SsaNode)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getEnumMember_ValueNode()
	 * @model containment="true"
	 * @generated
	 */
	SsaNode getValueNode();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.EnumMember#getValueNode <em>Value Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Node</em>' containment reference.
	 * @see #getValueNode()
	 * @generated
	 */
	void setValueNode(SsaNode value);

} // EnumMember
