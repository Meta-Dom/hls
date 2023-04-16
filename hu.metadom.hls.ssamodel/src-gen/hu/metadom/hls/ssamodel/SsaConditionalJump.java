/**
 */
package hu.metadom.hls.ssamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ssa Conditional Jump</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.metadom.hls.ssamodel.SsaConditionalJump#getCondition <em>Condition</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.SsaConditionalJump#getThenBlock <em>Then Block</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.SsaConditionalJump#getElseBlock <em>Else Block</em>}</li>
 * </ul>
 *
 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaConditionalJump()
 * @model
 * @generated
 */
public interface SsaConditionalJump extends SsaNode {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' reference.
	 * @see #setCondition(SsaNode)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaConditionalJump_Condition()
	 * @model
	 * @generated
	 */
	SsaNode getCondition();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.SsaConditionalJump#getCondition <em>Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(SsaNode value);

	/**
	 * Returns the value of the '<em><b>Then Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then Block</em>' reference.
	 * @see #setThenBlock(SsaBlock)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaConditionalJump_ThenBlock()
	 * @model
	 * @generated
	 */
	SsaBlock getThenBlock();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.SsaConditionalJump#getThenBlock <em>Then Block</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then Block</em>' reference.
	 * @see #getThenBlock()
	 * @generated
	 */
	void setThenBlock(SsaBlock value);

	/**
	 * Returns the value of the '<em><b>Else Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Block</em>' reference.
	 * @see #setElseBlock(SsaBlock)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaConditionalJump_ElseBlock()
	 * @model
	 * @generated
	 */
	SsaBlock getElseBlock();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.SsaConditionalJump#getElseBlock <em>Else Block</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Block</em>' reference.
	 * @see #getElseBlock()
	 * @generated
	 */
	void setElseBlock(SsaBlock value);

} // SsaConditionalJump
