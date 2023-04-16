/**
 */
package hu.metadom.hls.ssamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Struct</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.metadom.hls.ssamodel.Struct#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getStruct()
 * @model
 * @generated
 */
public interface Struct extends Type {
	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link hu.metadom.hls.ssamodel.StructMember}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getStruct_Members()
	 * @model containment="true"
	 * @generated
	 */
	EList<StructMember> getMembers();

} // Struct
