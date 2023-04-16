/**
 */
package hu.metadom.hls.ssamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ssa Var</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.metadom.hls.ssamodel.SsaVar#getType <em>Type</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.SsaVar#getInitNode <em>Init Node</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.SsaVar#getOrigin <em>Origin</em>}</li>
 * </ul>
 *
 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaVar()
 * @model
 * @generated
 */
public interface SsaVar extends SsaObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Type)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaVar_Type()
	 * @model
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.SsaVar#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * Returns the value of the '<em><b>Init Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Node</em>' reference.
	 * @see #setInitNode(SsaNode)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaVar_InitNode()
	 * @model
	 * @generated
	 */
	SsaNode getInitNode();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.SsaVar#getInitNode <em>Init Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Node</em>' reference.
	 * @see #getInitNode()
	 * @generated
	 */
	void setInitNode(SsaNode value);

	/**
	 * Returns the value of the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' attribute.
	 * @see #setOrigin(String)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaVar_Origin()
	 * @model unique="false"
	 * @generated
	 */
	String getOrigin();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.SsaVar#getOrigin <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' attribute.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(String value);

} // SsaVar
