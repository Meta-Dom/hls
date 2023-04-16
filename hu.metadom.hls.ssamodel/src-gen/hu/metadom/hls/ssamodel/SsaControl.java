/**
 */
package hu.metadom.hls.ssamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ssa Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.metadom.hls.ssamodel.SsaControl#getControlType <em>Control Type</em>}</li>
 * </ul>
 *
 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaControl()
 * @model
 * @generated
 */
public interface SsaControl extends SsaNode {
	/**
	 * Returns the value of the '<em><b>Control Type</b></em>' attribute.
	 * The literals are from the enumeration {@link hu.metadom.hls.ssamodel.ControlType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Type</em>' attribute.
	 * @see hu.metadom.hls.ssamodel.ControlType
	 * @see #setControlType(ControlType)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaControl_ControlType()
	 * @model unique="false"
	 * @generated
	 */
	ControlType getControlType();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.SsaControl#getControlType <em>Control Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Type</em>' attribute.
	 * @see hu.metadom.hls.ssamodel.ControlType
	 * @see #getControlType()
	 * @generated
	 */
	void setControlType(ControlType value);

} // SsaControl
