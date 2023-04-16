/**
 */
package hu.metadom.hls.ssamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ssa Pass By Ref Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.metadom.hls.ssamodel.SsaPassByRefArgument#getOutNode <em>Out Node</em>}</li>
 * </ul>
 *
 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaPassByRefArgument()
 * @model
 * @generated
 */
public interface SsaPassByRefArgument extends SsaArgument {
	/**
	 * Returns the value of the '<em><b>Out Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Node</em>' containment reference.
	 * @see #setOutNode(SsaOutputArgument)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaPassByRefArgument_OutNode()
	 * @model containment="true"
	 * @generated
	 */
	SsaOutputArgument getOutNode();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.SsaPassByRefArgument#getOutNode <em>Out Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Node</em>' containment reference.
	 * @see #getOutNode()
	 * @generated
	 */
	void setOutNode(SsaOutputArgument value);

} // SsaPassByRefArgument
