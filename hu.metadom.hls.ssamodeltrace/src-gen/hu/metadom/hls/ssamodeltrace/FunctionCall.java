/**
 */
package hu.metadom.hls.ssamodeltrace;

import hu.metadom.hls.ssamodel.SsaCall;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.metadom.hls.ssamodeltrace.FunctionCall#getSsaCall <em>Ssa Call</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodeltrace.FunctionCall#getFunctionTrace <em>Function Trace</em>}</li>
 * </ul>
 *
 * @see hu.metadom.hls.ssamodeltrace.SsaModelTracePackage#getFunctionCall()
 * @model
 * @generated
 */
public interface FunctionCall extends EObject {
	/**
	 * Returns the value of the '<em><b>Ssa Call</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ssa Call</em>' reference.
	 * @see #setSsaCall(SsaCall)
	 * @see hu.metadom.hls.ssamodeltrace.SsaModelTracePackage#getFunctionCall_SsaCall()
	 * @model
	 * @generated
	 */
	SsaCall getSsaCall();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodeltrace.FunctionCall#getSsaCall <em>Ssa Call</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ssa Call</em>' reference.
	 * @see #getSsaCall()
	 * @generated
	 */
	void setSsaCall(SsaCall value);

	/**
	 * Returns the value of the '<em><b>Function Trace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Trace</em>' reference.
	 * @see #setFunctionTrace(FunctionToLocalizeVariables)
	 * @see hu.metadom.hls.ssamodeltrace.SsaModelTracePackage#getFunctionCall_FunctionTrace()
	 * @model
	 * @generated
	 */
	FunctionToLocalizeVariables getFunctionTrace();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodeltrace.FunctionCall#getFunctionTrace <em>Function Trace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Trace</em>' reference.
	 * @see #getFunctionTrace()
	 * @generated
	 */
	void setFunctionTrace(FunctionToLocalizeVariables value);

} // FunctionCall
