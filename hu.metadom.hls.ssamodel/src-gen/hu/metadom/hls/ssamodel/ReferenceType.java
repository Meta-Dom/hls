/**
 */
package hu.metadom.hls.ssamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.metadom.hls.ssamodel.ReferenceType#getReferencedType <em>Referenced Type</em>}</li>
 * </ul>
 *
 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getReferenceType()
 * @model
 * @generated
 */
public interface ReferenceType extends Type {
	/**
	 * Returns the value of the '<em><b>Referenced Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Type</em>' reference.
	 * @see #setReferencedType(Type)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getReferenceType_ReferencedType()
	 * @model required="true"
	 * @generated
	 */
	Type getReferencedType();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.ReferenceType#getReferencedType <em>Referenced Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Type</em>' reference.
	 * @see #getReferencedType()
	 * @generated
	 */
	void setReferencedType(Type value);

} // ReferenceType
