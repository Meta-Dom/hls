/**
 */
package hu.metadom.hls.ssamodeltrace;

import hu.metadom.hls.ssamodel.SsaIndirectRead;
import hu.metadom.hls.ssamodel.SsaIndirectWrite;
import hu.metadom.hls.ssamodel.SsaParam;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pointer Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.metadom.hls.ssamodeltrace.PointerParameter#getPointerParam <em>Pointer Param</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodeltrace.PointerParameter#getIndirectReadList <em>Indirect Read List</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodeltrace.PointerParameter#getIndirectWriteList <em>Indirect Write List</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodeltrace.PointerParameter#isIsInput <em>Is Input</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodeltrace.PointerParameter#isIsOutput <em>Is Output</em>}</li>
 * </ul>
 *
 * @see hu.metadom.hls.ssamodeltrace.SsaModelTracePackage#getPointerParameter()
 * @model
 * @generated
 */
public interface PointerParameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Pointer Param</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pointer Param</em>' reference.
	 * @see #setPointerParam(SsaParam)
	 * @see hu.metadom.hls.ssamodeltrace.SsaModelTracePackage#getPointerParameter_PointerParam()
	 * @model
	 * @generated
	 */
	SsaParam getPointerParam();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodeltrace.PointerParameter#getPointerParam <em>Pointer Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pointer Param</em>' reference.
	 * @see #getPointerParam()
	 * @generated
	 */
	void setPointerParam(SsaParam value);

	/**
	 * Returns the value of the '<em><b>Indirect Read List</b></em>' reference list.
	 * The list contents are of type {@link hu.metadom.hls.ssamodel.SsaIndirectRead}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indirect Read List</em>' reference list.
	 * @see hu.metadom.hls.ssamodeltrace.SsaModelTracePackage#getPointerParameter_IndirectReadList()
	 * @model
	 * @generated
	 */
	EList<SsaIndirectRead> getIndirectReadList();

	/**
	 * Returns the value of the '<em><b>Indirect Write List</b></em>' reference list.
	 * The list contents are of type {@link hu.metadom.hls.ssamodel.SsaIndirectWrite}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indirect Write List</em>' reference list.
	 * @see hu.metadom.hls.ssamodeltrace.SsaModelTracePackage#getPointerParameter_IndirectWriteList()
	 * @model
	 * @generated
	 */
	EList<SsaIndirectWrite> getIndirectWriteList();

	/**
	 * Returns the value of the '<em><b>Is Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Input</em>' attribute.
	 * @see #setIsInput(boolean)
	 * @see hu.metadom.hls.ssamodeltrace.SsaModelTracePackage#getPointerParameter_IsInput()
	 * @model unique="false"
	 * @generated
	 */
	boolean isIsInput();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodeltrace.PointerParameter#isIsInput <em>Is Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Input</em>' attribute.
	 * @see #isIsInput()
	 * @generated
	 */
	void setIsInput(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Output</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Output</em>' attribute.
	 * @see #setIsOutput(boolean)
	 * @see hu.metadom.hls.ssamodeltrace.SsaModelTracePackage#getPointerParameter_IsOutput()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isIsOutput();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodeltrace.PointerParameter#isIsOutput <em>Is Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Output</em>' attribute.
	 * @see #isIsOutput()
	 * @generated
	 */
	void setIsOutput(boolean value);

} // PointerParameter
