/**
 */
package hu.metadom.hls.ssamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ssa Goto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.metadom.hls.ssamodel.SsaGoto#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaGoto()
 * @model
 * @generated
 */
public interface SsaGoto extends SsaNode {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' reference.
	 * @see #setLabel(SsaLabel)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaGoto_Label()
	 * @model
	 * @generated
	 */
	SsaLabel getLabel();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.SsaGoto#getLabel <em>Label</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(SsaLabel value);

} // SsaGoto
