/**
 */
package hu.metadom.hls.ssamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ssa Sizeof Var</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.metadom.hls.ssamodel.SsaSizeofVar#getSizeofExpr <em>Sizeof Expr</em>}</li>
 * </ul>
 *
 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaSizeofVar()
 * @model
 * @generated
 */
public interface SsaSizeofVar extends SsaSizeof {
	/**
	 * Returns the value of the '<em><b>Sizeof Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sizeof Expr</em>' containment reference.
	 * @see #setSizeofExpr(SsaNode)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaSizeofVar_SizeofExpr()
	 * @model containment="true"
	 * @generated
	 */
	SsaNode getSizeofExpr();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.SsaSizeofVar#getSizeofExpr <em>Sizeof Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sizeof Expr</em>' containment reference.
	 * @see #getSizeofExpr()
	 * @generated
	 */
	void setSizeofExpr(SsaNode value);

} // SsaSizeofVar
