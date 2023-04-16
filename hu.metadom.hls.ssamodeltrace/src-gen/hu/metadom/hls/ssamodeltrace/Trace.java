/**
 */
package hu.metadom.hls.ssamodeltrace;

import hu.metadom.hls.ssamodel.Container;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.metadom.hls.ssamodeltrace.Trace#getFunctions <em>Functions</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodeltrace.Trace#getContainer <em>Container</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodeltrace.Trace#getPointers <em>Pointers</em>}</li>
 * </ul>
 *
 * @see hu.metadom.hls.ssamodeltrace.SsaModelTracePackage#getTrace()
 * @model
 * @generated
 */
public interface Trace extends EObject {
	/**
	 * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
	 * The list contents are of type {@link hu.metadom.hls.ssamodeltrace.FunctionToLocalizeVariables}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functions</em>' containment reference list.
	 * @see hu.metadom.hls.ssamodeltrace.SsaModelTracePackage#getTrace_Functions()
	 * @model containment="true"
	 * @generated
	 */
	EList<FunctionToLocalizeVariables> getFunctions();

	/**
	 * Returns the value of the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' reference.
	 * @see #setContainer(Container)
	 * @see hu.metadom.hls.ssamodeltrace.SsaModelTracePackage#getTrace_Container()
	 * @model
	 * @generated
	 */
	Container getContainer();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodeltrace.Trace#getContainer <em>Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(Container value);

	/**
	 * Returns the value of the '<em><b>Pointers</b></em>' containment reference list.
	 * The list contents are of type {@link hu.metadom.hls.ssamodeltrace.FunctionToDepointerParams}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pointers</em>' containment reference list.
	 * @see hu.metadom.hls.ssamodeltrace.SsaModelTracePackage#getTrace_Pointers()
	 * @model containment="true"
	 * @generated
	 */
	EList<FunctionToDepointerParams> getPointers();

} // Trace
