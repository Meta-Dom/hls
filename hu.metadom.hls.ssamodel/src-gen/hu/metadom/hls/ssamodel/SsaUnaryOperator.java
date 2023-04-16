/**
 */
package hu.metadom.hls.ssamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ssa Unary Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.metadom.hls.ssamodel.SsaUnaryOperator#getOperatorKind <em>Operator Kind</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.SsaUnaryOperator#getOperand <em>Operand</em>}</li>
 * </ul>
 *
 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaUnaryOperator()
 * @model
 * @generated
 */
public interface SsaUnaryOperator extends SsaNode {
	/**
	 * Returns the value of the '<em><b>Operator Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link hu.metadom.hls.ssamodel.SsaUnaryOperatorKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator Kind</em>' attribute.
	 * @see hu.metadom.hls.ssamodel.SsaUnaryOperatorKind
	 * @see #setOperatorKind(SsaUnaryOperatorKind)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaUnaryOperator_OperatorKind()
	 * @model unique="false"
	 * @generated
	 */
	SsaUnaryOperatorKind getOperatorKind();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.SsaUnaryOperator#getOperatorKind <em>Operator Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator Kind</em>' attribute.
	 * @see hu.metadom.hls.ssamodel.SsaUnaryOperatorKind
	 * @see #getOperatorKind()
	 * @generated
	 */
	void setOperatorKind(SsaUnaryOperatorKind value);

	/**
	 * Returns the value of the '<em><b>Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand</em>' reference.
	 * @see #setOperand(SsaNode)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaUnaryOperator_Operand()
	 * @model
	 * @generated
	 */
	SsaNode getOperand();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.SsaUnaryOperator#getOperand <em>Operand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand</em>' reference.
	 * @see #getOperand()
	 * @generated
	 */
	void setOperand(SsaNode value);

} // SsaUnaryOperator
