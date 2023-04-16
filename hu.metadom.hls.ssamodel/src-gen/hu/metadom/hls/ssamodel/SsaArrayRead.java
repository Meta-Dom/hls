/**
 */
package hu.metadom.hls.ssamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ssa Array Read</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.metadom.hls.ssamodel.SsaArrayRead#getArray <em>Array</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.SsaArrayRead#getIndices <em>Indices</em>}</li>
 * </ul>
 *
 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaArrayRead()
 * @model
 * @generated
 */
public interface SsaArrayRead extends SsaNode {
	/**
	 * Returns the value of the '<em><b>Array</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array</em>' reference.
	 * @see #setArray(SsaNode)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaArrayRead_Array()
	 * @model
	 * @generated
	 */
	SsaNode getArray();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.SsaArrayRead#getArray <em>Array</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Array</em>' reference.
	 * @see #getArray()
	 * @generated
	 */
	void setArray(SsaNode value);

	/**
	 * Returns the value of the '<em><b>Indices</b></em>' containment reference list.
	 * The list contents are of type {@link hu.metadom.hls.ssamodel.SsaNodeRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indices</em>' containment reference list.
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaArrayRead_Indices()
	 * @model containment="true"
	 * @generated
	 */
	EList<SsaNodeRef> getIndices();

} // SsaArrayRead
