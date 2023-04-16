/**
 */
package hu.metadom.hls.ssamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ssa Pass By Ref Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.metadom.hls.ssamodel.SsaPassByRefParam#getOutNode <em>Out Node</em>}</li>
 * </ul>
 *
 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaPassByRefParam()
 * @model
 * @generated
 */
public interface SsaPassByRefParam extends SsaParam {
	/**
	 * Returns the value of the '<em><b>Out Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Node</em>' reference.
	 * @see #setOutNode(SsaNode)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaPassByRefParam_OutNode()
	 * @model
	 * @generated
	 */
	SsaNode getOutNode();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.SsaPassByRefParam#getOutNode <em>Out Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Node</em>' reference.
	 * @see #getOutNode()
	 * @generated
	 */
	void setOutNode(SsaNode value);

} // SsaPassByRefParam
