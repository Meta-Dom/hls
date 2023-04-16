/**
 */
package hu.metadom.hls.ssamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ssa Binary Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.metadom.hls.ssamodel.SsaBinaryOperator#getOperatorKind <em>Operator Kind</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.SsaBinaryOperator#getLeft <em>Left</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.SsaBinaryOperator#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaBinaryOperator()
 * @model
 * @generated
 */
public interface SsaBinaryOperator extends SsaNode {
	/**
	 * Returns the value of the '<em><b>Operator Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link hu.metadom.hls.ssamodel.SsaBinaryOperatorKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator Kind</em>' attribute.
	 * @see hu.metadom.hls.ssamodel.SsaBinaryOperatorKind
	 * @see #setOperatorKind(SsaBinaryOperatorKind)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaBinaryOperator_OperatorKind()
	 * @model unique="false"
	 * @generated
	 */
	SsaBinaryOperatorKind getOperatorKind();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.SsaBinaryOperator#getOperatorKind <em>Operator Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator Kind</em>' attribute.
	 * @see hu.metadom.hls.ssamodel.SsaBinaryOperatorKind
	 * @see #getOperatorKind()
	 * @generated
	 */
	void setOperatorKind(SsaBinaryOperatorKind value);

	/**
	 * Returns the value of the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' reference.
	 * @see #setLeft(SsaNode)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaBinaryOperator_Left()
	 * @model
	 * @generated
	 */
	SsaNode getLeft();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.SsaBinaryOperator#getLeft <em>Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(SsaNode value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' reference.
	 * @see #setRight(SsaNode)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaBinaryOperator_Right()
	 * @model
	 * @generated
	 */
	SsaNode getRight();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.SsaBinaryOperator#getRight <em>Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(SsaNode value);

} // SsaBinaryOperator
