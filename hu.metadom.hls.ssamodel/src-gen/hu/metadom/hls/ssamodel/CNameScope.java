/**
 */
package hu.metadom.hls.ssamodel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CName Scope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.metadom.hls.ssamodel.CNameScope#getParent <em>Parent</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.CNameScope#getNames <em>Names</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.CNameScope#getVars <em>Vars</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.CNameScope#getTypes <em>Types</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.CNameScope#getConstants <em>Constants</em>}</li>
 * </ul>
 *
 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getCNameScope()
 * @model
 * @generated
 */
public interface CNameScope extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(CNameScope)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getCNameScope_Parent()
	 * @model
	 * @generated
	 */
	CNameScope getParent();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.CNameScope#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(CNameScope value);

	/**
	 * Returns the value of the '<em><b>Names</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link hu.metadom.hls.ssamodel.SsaVar},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Names</em>' map.
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getCNameScope_Names()
	 * @model mapType="hu.metadom.hls.ssamodel.StringToCNameMap&lt;org.eclipse.emf.ecore.EString, hu.metadom.hls.ssamodel.SsaVar&gt;"
	 * @generated
	 */
	EMap<String, SsaVar> getNames();

	/**
	 * Returns the value of the '<em><b>Vars</b></em>' containment reference list.
	 * The list contents are of type {@link hu.metadom.hls.ssamodel.SsaVar}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vars</em>' containment reference list.
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getCNameScope_Vars()
	 * @model containment="true"
	 * @generated
	 */
	EList<SsaVar> getVars();

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link hu.metadom.hls.ssamodel.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getCNameScope_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<Type> getTypes();

	/**
	 * Returns the value of the '<em><b>Constants</b></em>' containment reference list.
	 * The list contents are of type {@link hu.metadom.hls.ssamodel.SsaConst}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constants</em>' containment reference list.
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getCNameScope_Constants()
	 * @model containment="true"
	 * @generated
	 */
	EList<SsaConst> getConstants();

} // CNameScope
