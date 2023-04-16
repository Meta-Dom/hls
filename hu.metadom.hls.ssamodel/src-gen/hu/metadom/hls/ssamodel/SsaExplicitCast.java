/**
 */
package hu.metadom.hls.ssamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ssa Explicit Cast</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.metadom.hls.ssamodel.SsaExplicitCast#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaExplicitCast()
 * @model
 * @generated
 */
public interface SsaExplicitCast extends SsaCast {
	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Type)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaExplicitCast_To()
	 * @model
	 * @generated
	 */
	Type getTo();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.SsaExplicitCast#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Type value);

} // SsaExplicitCast
