/**
 */
package hu.metadom.hls.ssamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ssa Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.metadom.hls.ssamodel.SsaCall#getArguments <em>Arguments</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.SsaCall#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaCall()
 * @model
 * @generated
 */
public interface SsaCall extends SsaNode {
	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link hu.metadom.hls.ssamodel.SsaArgument}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaCall_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<SsaArgument> getArguments();

	/**
	 * Returns the value of the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' reference.
	 * @see #setFunction(SsaNode)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaCall_Function()
	 * @model
	 * @generated
	 */
	SsaNode getFunction();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.SsaCall#getFunction <em>Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(SsaNode value);

} // SsaCall
