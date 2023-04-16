/**
 */
package hu.metadom.hls.ssamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ssa Phi</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.metadom.hls.ssamodel.SsaPhi#getPrevious <em>Previous</em>}</li>
 * </ul>
 *
 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaPhi()
 * @model
 * @generated
 */
public interface SsaPhi extends SsaNode {
	/**
	 * Returns the value of the '<em><b>Previous</b></em>' containment reference list.
	 * The list contents are of type {@link hu.metadom.hls.ssamodel.SsaNodeRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous</em>' containment reference list.
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaPhi_Previous()
	 * @model containment="true"
	 * @generated
	 */
	EList<SsaNodeRef> getPrevious();

} // SsaPhi
