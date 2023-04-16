/**
 */
package hu.metadom.hls.ssamodeltrace;

import hu.metadom.hls.ssamodel.SsaFunction;
import hu.metadom.hls.ssamodel.SsaVar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function To Localize Variables</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.metadom.hls.ssamodeltrace.FunctionToLocalizeVariables#getFunction <em>Function</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodeltrace.FunctionToLocalizeVariables#getVars <em>Vars</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodeltrace.FunctionToLocalizeVariables#getFuncCalls <em>Func Calls</em>}</li>
 * </ul>
 *
 * @see hu.metadom.hls.ssamodeltrace.SsaModelTracePackage#getFunctionToLocalizeVariables()
 * @model
 * @generated
 */
public interface FunctionToLocalizeVariables extends EObject {
	/**
	 * Returns the value of the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' reference.
	 * @see #setFunction(SsaFunction)
	 * @see hu.metadom.hls.ssamodeltrace.SsaModelTracePackage#getFunctionToLocalizeVariables_Function()
	 * @model
	 * @generated
	 */
	SsaFunction getFunction();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodeltrace.FunctionToLocalizeVariables#getFunction <em>Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(SsaFunction value);

	/**
	 * Returns the value of the '<em><b>Vars</b></em>' reference list.
	 * The list contents are of type {@link hu.metadom.hls.ssamodel.SsaVar}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vars</em>' reference list.
	 * @see hu.metadom.hls.ssamodeltrace.SsaModelTracePackage#getFunctionToLocalizeVariables_Vars()
	 * @model
	 * @generated
	 */
	EList<SsaVar> getVars();

	/**
	 * Returns the value of the '<em><b>Func Calls</b></em>' containment reference list.
	 * The list contents are of type {@link hu.metadom.hls.ssamodeltrace.FunctionCall}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Func Calls</em>' containment reference list.
	 * @see hu.metadom.hls.ssamodeltrace.SsaModelTracePackage#getFunctionToLocalizeVariables_FuncCalls()
	 * @model containment="true"
	 * @generated
	 */
	EList<FunctionCall> getFuncCalls();

} // FunctionToLocalizeVariables
