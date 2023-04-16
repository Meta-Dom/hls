/**
 */
package hu.metadom.hls.ssamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ssa Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.metadom.hls.ssamodel.SsaParam#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaParam()
 * @model
 * @generated
 */
public interface SsaParam extends SsaNode {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The default value is <code>"NONE"</code>.
	 * The literals are from the enumeration {@link hu.metadom.hls.ssamodel.ParamDirection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see hu.metadom.hls.ssamodel.ParamDirection
	 * @see #setDirection(ParamDirection)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaParam_Direction()
	 * @model default="NONE" unique="false"
	 * @generated
	 */
	ParamDirection getDirection();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.SsaParam#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see hu.metadom.hls.ssamodel.ParamDirection
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(ParamDirection value);

} // SsaParam
