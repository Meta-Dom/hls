/**
 */
package hu.metadom.hls.ssamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ssa Node Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.metadom.hls.ssamodel.SsaNodeRef#getNode <em>Node</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.SsaNodeRef#getFileposition <em>Fileposition</em>}</li>
 * </ul>
 *
 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaNodeRef()
 * @model
 * @generated
 */
public interface SsaNodeRef extends EObject {
	/**
	 * Returns the value of the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' reference.
	 * @see #setNode(SsaNode)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaNodeRef_Node()
	 * @model
	 * @generated
	 */
	SsaNode getNode();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.SsaNodeRef#getNode <em>Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(SsaNode value);

	/**
	 * Returns the value of the '<em><b>Fileposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fileposition</em>' containment reference.
	 * @see #setFileposition(FilePosition)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaNodeRef_Fileposition()
	 * @model containment="true"
	 * @generated
	 */
	FilePosition getFileposition();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.SsaNodeRef#getFileposition <em>Fileposition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fileposition</em>' containment reference.
	 * @see #getFileposition()
	 * @generated
	 */
	void setFileposition(FilePosition value);

} // SsaNodeRef
