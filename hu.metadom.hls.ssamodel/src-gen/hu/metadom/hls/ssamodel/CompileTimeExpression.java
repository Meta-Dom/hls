/**
 */
package hu.metadom.hls.ssamodel;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compile Time Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.metadom.hls.ssamodel.CompileTimeExpression#getValue <em>Value</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.CompileTimeExpression#getNode <em>Node</em>}</li>
 * </ul>
 *
 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getCompileTimeExpression()
 * @model
 * @generated
 */
public interface CompileTimeExpression extends SsaObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(BigInteger)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getCompileTimeExpression_Value()
	 * @model unique="false"
	 * @generated
	 */
	BigInteger getValue();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.CompileTimeExpression#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' containment reference.
	 * @see #setNode(SsaNode)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getCompileTimeExpression_Node()
	 * @model containment="true"
	 * @generated
	 */
	SsaNode getNode();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.CompileTimeExpression#getNode <em>Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' containment reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(SsaNode value);

} // CompileTimeExpression
