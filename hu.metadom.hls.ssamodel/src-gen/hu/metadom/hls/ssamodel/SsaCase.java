/**
 */
package hu.metadom.hls.ssamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ssa Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.metadom.hls.ssamodel.SsaCase#getNode <em>Node</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.SsaCase#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaCase()
 * @model
 * @generated
 */
public interface SsaCase extends SsaObject {
	/**
	 * Returns the value of the '<em><b>Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' containment reference.
	 * @see #setNode(SsaNode)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaCase_Node()
	 * @model containment="true"
	 * @generated
	 */
	SsaNode getNode();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.SsaCase#getNode <em>Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' containment reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(SsaNode value);

	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link hu.metadom.hls.ssamodel.CompileTimeExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaCase_Values()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompileTimeExpression> getValues();

} // SsaCase
