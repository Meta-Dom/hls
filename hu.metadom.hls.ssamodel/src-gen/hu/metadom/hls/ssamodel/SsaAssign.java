/**
 */
package hu.metadom.hls.ssamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ssa Assign</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.metadom.hls.ssamodel.SsaAssign#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaAssign()
 * @model
 * @generated
 */
public interface SsaAssign extends SsaNode {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(SsaNode)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaAssign_Value()
	 * @model
	 * @generated
	 */
	SsaNode getValue();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.SsaAssign#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(SsaNode value);

} // SsaAssign
