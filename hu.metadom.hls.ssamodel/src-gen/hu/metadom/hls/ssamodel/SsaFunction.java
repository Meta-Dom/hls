/**
 */
package hu.metadom.hls.ssamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ssa Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.metadom.hls.ssamodel.SsaFunction#getParameters <em>Parameters</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.SsaFunction#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.SsaFunction#isVarArg <em>Var Arg</em>}</li>
 * </ul>
 *
 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaFunction()
 * @model
 * @generated
 */
public interface SsaFunction extends SsaBlock {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link hu.metadom.hls.ssamodel.SsaParam}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaFunction_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<SsaParam> getParameters();

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' reference.
	 * @see #setReturnType(Type)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaFunction_ReturnType()
	 * @model
	 * @generated
	 */
	Type getReturnType();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.SsaFunction#getReturnType <em>Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(Type value);

	/**
	 * Returns the value of the '<em><b>Var Arg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Arg</em>' attribute.
	 * @see #setVarArg(boolean)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaFunction_VarArg()
	 * @model unique="false"
	 * @generated
	 */
	boolean isVarArg();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.SsaFunction#isVarArg <em>Var Arg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var Arg</em>' attribute.
	 * @see #isVarArg()
	 * @generated
	 */
	void setVarArg(boolean value);

} // SsaFunction
