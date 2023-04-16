/**
 */
package hu.metadom.hls.ssamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ssa Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.metadom.hls.ssamodel.SsaArgument#getParam <em>Param</em>}</li>
 * </ul>
 *
 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaArgument()
 * @model
 * @generated
 */
public interface SsaArgument extends SsaNodeRef {
	/**
	 * Returns the value of the '<em><b>Param</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param</em>' reference.
	 * @see #setParam(SsaParam)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaArgument_Param()
	 * @model
	 * @generated
	 */
	SsaParam getParam();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.SsaArgument#getParam <em>Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param</em>' reference.
	 * @see #getParam()
	 * @generated
	 */
	void setParam(SsaParam value);

} // SsaArgument
