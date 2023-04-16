/**
 */
package hu.metadom.hls.ssamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ssa Return</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.metadom.hls.ssamodel.SsaReturn#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaReturn()
 * @model
 * @generated
 */
public interface SsaReturn extends SsaNode {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' reference.
	 * @see #setExpression(SsaNode)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaReturn_Expression()
	 * @model
	 * @generated
	 */
	SsaNode getExpression();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.SsaReturn#getExpression <em>Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(SsaNode value);

} // SsaReturn
