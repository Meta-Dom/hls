/**
 */
package hu.metadom.hls.ssamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ssa Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.metadom.hls.ssamodel.SsaBlock#getNodes <em>Nodes</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.SsaBlock#getNameScope <em>Name Scope</em>}</li>
 * </ul>
 *
 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaBlock()
 * @model
 * @generated
 */
public interface SsaBlock extends SsaNode {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link hu.metadom.hls.ssamodel.SsaNode}.
	 * It is bidirectional and its opposite is '{@link hu.metadom.hls.ssamodel.SsaNode#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaBlock_Nodes()
	 * @see hu.metadom.hls.ssamodel.SsaNode#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<SsaNode> getNodes();

	/**
	 * Returns the value of the '<em><b>Name Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Scope</em>' containment reference.
	 * @see #setNameScope(CNameScope)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaBlock_NameScope()
	 * @model containment="true"
	 * @generated
	 */
	CNameScope getNameScope();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.SsaBlock#getNameScope <em>Name Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Scope</em>' containment reference.
	 * @see #getNameScope()
	 * @generated
	 */
	void setNameScope(CNameScope value);

} // SsaBlock
