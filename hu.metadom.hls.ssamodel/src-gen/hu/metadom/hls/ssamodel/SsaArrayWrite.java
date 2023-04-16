/**
 */
package hu.metadom.hls.ssamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ssa Array Write</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.metadom.hls.ssamodel.SsaArrayWrite#getArray <em>Array</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.SsaArrayWrite#getIndices <em>Indices</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.SsaArrayWrite#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaArrayWrite()
 * @model
 * @generated
 */
public interface SsaArrayWrite extends SsaNode {
	/**
	 * Returns the value of the '<em><b>Array</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array</em>' reference.
	 * @see #setArray(SsaNode)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaArrayWrite_Array()
	 * @model
	 * @generated
	 */
	SsaNode getArray();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.SsaArrayWrite#getArray <em>Array</em>}' reference.
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
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaArrayWrite_Indices()
	 * @model containment="true"
	 * @generated
	 */
	EList<SsaNodeRef> getIndices();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(SsaNode)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaArrayWrite_Value()
	 * @model
	 * @generated
	 */
	SsaNode getValue();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.SsaArrayWrite#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(SsaNode value);

} // SsaArrayWrite
