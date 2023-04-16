/**
 */
package hu.metadom.hls.ssamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.metadom.hls.ssamodel.ArrayType#getLength <em>Length</em>}</li>
 * </ul>
 *
 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getArrayType()
 * @model
 * @generated
 */
public interface ArrayType extends ReferenceType {
	/**
	 * Returns the value of the '<em><b>Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' containment reference.
	 * @see #setLength(CompileTimeExpression)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getArrayType_Length()
	 * @model containment="true"
	 * @generated
	 */
	CompileTimeExpression getLength();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.ArrayType#getLength <em>Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' containment reference.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(CompileTimeExpression value);

} // ArrayType
