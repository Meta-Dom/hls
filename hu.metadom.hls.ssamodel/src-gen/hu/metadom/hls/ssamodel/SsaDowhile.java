/**
 */
package hu.metadom.hls.ssamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ssa Dowhile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.metadom.hls.ssamodel.SsaDowhile#getBody <em>Body</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.SsaDowhile#getCond <em>Cond</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.SsaDowhile#getMerge <em>Merge</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.SsaDowhile#getLoopType <em>Loop Type</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.SsaDowhile#getCondNode <em>Cond Node</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.SsaDowhile#getDowhileType <em>Dowhile Type</em>}</li>
 * </ul>
 *
 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaDowhile()
 * @model
 * @generated
 */
public interface SsaDowhile extends SsaNode {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(SsaNode)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaDowhile_Body()
	 * @model containment="true"
	 * @generated
	 */
	SsaNode getBody();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.SsaDowhile#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(SsaNode value);

	/**
	 * Returns the value of the '<em><b>Cond</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cond</em>' containment reference.
	 * @see #setCond(SsaNode)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaDowhile_Cond()
	 * @model containment="true"
	 * @generated
	 */
	SsaNode getCond();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.SsaDowhile#getCond <em>Cond</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cond</em>' containment reference.
	 * @see #getCond()
	 * @generated
	 */
	void setCond(SsaNode value);

	/**
	 * Returns the value of the '<em><b>Merge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Merge</em>' containment reference.
	 * @see #setMerge(SsaNode)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaDowhile_Merge()
	 * @model containment="true"
	 * @generated
	 */
	SsaNode getMerge();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.SsaDowhile#getMerge <em>Merge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merge</em>' containment reference.
	 * @see #getMerge()
	 * @generated
	 */
	void setMerge(SsaNode value);

	/**
	 * Returns the value of the '<em><b>Loop Type</b></em>' attribute.
	 * The default value is <code>"TOPTEST"</code>.
	 * The literals are from the enumeration {@link hu.metadom.hls.ssamodel.LoopType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Type</em>' attribute.
	 * @see hu.metadom.hls.ssamodel.LoopType
	 * @see #setLoopType(LoopType)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaDowhile_LoopType()
	 * @model default="TOPTEST" unique="false"
	 * @generated
	 */
	LoopType getLoopType();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.SsaDowhile#getLoopType <em>Loop Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop Type</em>' attribute.
	 * @see hu.metadom.hls.ssamodel.LoopType
	 * @see #getLoopType()
	 * @generated
	 */
	void setLoopType(LoopType value);

	/**
	 * Returns the value of the '<em><b>Cond Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cond Node</em>' reference.
	 * @see #setCondNode(SsaNode)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaDowhile_CondNode()
	 * @model
	 * @generated
	 */
	SsaNode getCondNode();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.SsaDowhile#getCondNode <em>Cond Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cond Node</em>' reference.
	 * @see #getCondNode()
	 * @generated
	 */
	void setCondNode(SsaNode value);

	/**
	 * Returns the value of the '<em><b>Dowhile Type</b></em>' attribute.
	 * The default value is <code>"WHILE"</code>.
	 * The literals are from the enumeration {@link hu.metadom.hls.ssamodel.DowhileType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dowhile Type</em>' attribute.
	 * @see hu.metadom.hls.ssamodel.DowhileType
	 * @see #setDowhileType(DowhileType)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaDowhile_DowhileType()
	 * @model default="WHILE" unique="false"
	 * @generated
	 */
	DowhileType getDowhileType();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.SsaDowhile#getDowhileType <em>Dowhile Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dowhile Type</em>' attribute.
	 * @see hu.metadom.hls.ssamodel.DowhileType
	 * @see #getDowhileType()
	 * @generated
	 */
	void setDowhileType(DowhileType value);

} // SsaDowhile
