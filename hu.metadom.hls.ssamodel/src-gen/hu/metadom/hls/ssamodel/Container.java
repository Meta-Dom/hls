/**
 */
package hu.metadom.hls.ssamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.metadom.hls.ssamodel.Container#getChildContainers <em>Child Containers</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.Container#getName <em>Name</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.Container#getFunctions <em>Functions</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.Container#getType <em>Type</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.Container#getGlobalBlock <em>Global Block</em>}</li>
 * </ul>
 *
 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getContainer()
 * @model
 * @generated
 */
public interface Container extends EObject {
	/**
	 * Returns the value of the '<em><b>Child Containers</b></em>' containment reference list.
	 * The list contents are of type {@link hu.metadom.hls.ssamodel.Container}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Containers</em>' containment reference list.
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getContainer_ChildContainers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Container> getChildContainers();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getContainer_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.Container#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
	 * The list contents are of type {@link hu.metadom.hls.ssamodel.SsaFunction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functions</em>' containment reference list.
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getContainer_Functions()
	 * @model containment="true"
	 * @generated
	 */
	EList<SsaFunction> getFunctions();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"CUSTOM"</code>.
	 * The literals are from the enumeration {@link hu.metadom.hls.ssamodel.ContainerType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see hu.metadom.hls.ssamodel.ContainerType
	 * @see #setType(ContainerType)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getContainer_Type()
	 * @model default="CUSTOM" unique="false"
	 * @generated
	 */
	ContainerType getType();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.Container#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see hu.metadom.hls.ssamodel.ContainerType
	 * @see #getType()
	 * @generated
	 */
	void setType(ContainerType value);

	/**
	 * Returns the value of the '<em><b>Global Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Block</em>' containment reference.
	 * @see #setGlobalBlock(SsaBlock)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getContainer_GlobalBlock()
	 * @model containment="true"
	 * @generated
	 */
	SsaBlock getGlobalBlock();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.Container#getGlobalBlock <em>Global Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Block</em>' containment reference.
	 * @see #getGlobalBlock()
	 * @generated
	 */
	void setGlobalBlock(SsaBlock value);

} // Container
