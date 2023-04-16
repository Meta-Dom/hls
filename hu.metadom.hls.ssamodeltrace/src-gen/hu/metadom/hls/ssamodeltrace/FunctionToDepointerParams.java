/**
 */
package hu.metadom.hls.ssamodeltrace;

import hu.metadom.hls.ssamodel.SsaFunction;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function To Depointer Params</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.metadom.hls.ssamodeltrace.FunctionToDepointerParams#getFunction <em>Function</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodeltrace.FunctionToDepointerParams#getPointerParameter <em>Pointer Parameter</em>}</li>
 * </ul>
 *
 * @see hu.metadom.hls.ssamodeltrace.SsaModelTracePackage#getFunctionToDepointerParams()
 * @model
 * @generated
 */
public interface FunctionToDepointerParams extends EObject {
	/**
	 * Returns the value of the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' reference.
	 * @see #setFunction(SsaFunction)
	 * @see hu.metadom.hls.ssamodeltrace.SsaModelTracePackage#getFunctionToDepointerParams_Function()
	 * @model
	 * @generated
	 */
	SsaFunction getFunction();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodeltrace.FunctionToDepointerParams#getFunction <em>Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(SsaFunction value);

	/**
	 * Returns the value of the '<em><b>Pointer Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link hu.metadom.hls.ssamodeltrace.PointerParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pointer Parameter</em>' containment reference list.
	 * @see hu.metadom.hls.ssamodeltrace.SsaModelTracePackage#getFunctionToDepointerParams_PointerParameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<PointerParameter> getPointerParameter();

} // FunctionToDepointerParams
