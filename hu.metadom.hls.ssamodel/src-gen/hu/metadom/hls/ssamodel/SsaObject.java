/**
 */
package hu.metadom.hls.ssamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ssa Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.metadom.hls.ssamodel.SsaObject#getName <em>Name</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.SsaObject#getComment <em>Comment</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.SsaObject#getFileposition <em>Fileposition</em>}</li>
 * </ul>
 *
 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaObject()
 * @model abstract="true"
 * @generated
 */
public interface SsaObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaObject_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.SsaObject#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaObject_Comment()
	 * @model unique="false"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.SsaObject#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Fileposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fileposition</em>' containment reference.
	 * @see #setFileposition(FilePosition)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaObject_Fileposition()
	 * @model containment="true"
	 * @generated
	 */
	FilePosition getFileposition();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.SsaObject#getFileposition <em>Fileposition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fileposition</em>' containment reference.
	 * @see #getFileposition()
	 * @generated
	 */
	void setFileposition(FilePosition value);

} // SsaObject
