/**
 */
package hu.metadom.hls.ssamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ssa Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.metadom.hls.ssamodel.SsaNode#getType <em>Type</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.SsaNode#getParent <em>Parent</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.SsaNode#getVar <em>Var</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.SsaNode#getSsaIndex <em>Ssa Index</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.SsaNode#getOrigin <em>Origin</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.SsaNode#getGid <em>Gid</em>}</li>
 * </ul>
 *
 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaNode()
 * @model abstract="true"
 * @generated
 */
public interface SsaNode extends SsaObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Type)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaNode_Type()
	 * @model
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.SsaNode#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hu.metadom.hls.ssamodel.SsaBlock#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(SsaBlock)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaNode_Parent()
	 * @see hu.metadom.hls.ssamodel.SsaBlock#getNodes
	 * @model opposite="nodes" transient="false"
	 * @generated
	 */
	SsaBlock getParent();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.SsaNode#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(SsaBlock value);

	/**
	 * Returns the value of the '<em><b>Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var</em>' reference.
	 * @see #setVar(SsaVar)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaNode_Var()
	 * @model
	 * @generated
	 */
	SsaVar getVar();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.SsaNode#getVar <em>Var</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var</em>' reference.
	 * @see #getVar()
	 * @generated
	 */
	void setVar(SsaVar value);

	/**
	 * Returns the value of the '<em><b>Ssa Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ssa Index</em>' attribute.
	 * @see #setSsaIndex(int)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaNode_SsaIndex()
	 * @model unique="false"
	 * @generated
	 */
	int getSsaIndex();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.SsaNode#getSsaIndex <em>Ssa Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ssa Index</em>' attribute.
	 * @see #getSsaIndex()
	 * @generated
	 */
	void setSsaIndex(int value);

	/**
	 * Returns the value of the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' attribute.
	 * @see #setOrigin(String)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaNode_Origin()
	 * @model unique="false"
	 * @generated
	 */
	String getOrigin();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.SsaNode#getOrigin <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' attribute.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(String value);

	/**
	 * Returns the value of the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gid</em>' attribute.
	 * @see #setGid(int)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaNode_Gid()
	 * @model unique="false"
	 * @generated
	 */
	int getGid();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.SsaNode#getGid <em>Gid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gid</em>' attribute.
	 * @see #getGid()
	 * @generated
	 */
	void setGid(int value);

} // SsaNode
