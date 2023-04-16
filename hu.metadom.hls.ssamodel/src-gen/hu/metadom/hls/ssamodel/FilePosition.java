/**
 */
package hu.metadom.hls.ssamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.metadom.hls.ssamodel.FilePosition#getName <em>Name</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.FilePosition#getLine <em>Line</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.FilePosition#getStartPositionInLine <em>Start Position In Line</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.FilePosition#getEndPositionInLine <em>End Position In Line</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.FilePosition#getStartPosition <em>Start Position</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.FilePosition#getEndPosition <em>End Position</em>}</li>
 * </ul>
 *
 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getFilePosition()
 * @model
 * @generated
 */
public interface FilePosition extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getFilePosition_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.FilePosition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line</em>' attribute.
	 * @see #setLine(int)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getFilePosition_Line()
	 * @model unique="false"
	 * @generated
	 */
	int getLine();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.FilePosition#getLine <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line</em>' attribute.
	 * @see #getLine()
	 * @generated
	 */
	void setLine(int value);

	/**
	 * Returns the value of the '<em><b>Start Position In Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Position In Line</em>' attribute.
	 * @see #setStartPositionInLine(int)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getFilePosition_StartPositionInLine()
	 * @model unique="false"
	 * @generated
	 */
	int getStartPositionInLine();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.FilePosition#getStartPositionInLine <em>Start Position In Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Position In Line</em>' attribute.
	 * @see #getStartPositionInLine()
	 * @generated
	 */
	void setStartPositionInLine(int value);

	/**
	 * Returns the value of the '<em><b>End Position In Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Position In Line</em>' attribute.
	 * @see #setEndPositionInLine(int)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getFilePosition_EndPositionInLine()
	 * @model unique="false"
	 * @generated
	 */
	int getEndPositionInLine();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.FilePosition#getEndPositionInLine <em>End Position In Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Position In Line</em>' attribute.
	 * @see #getEndPositionInLine()
	 * @generated
	 */
	void setEndPositionInLine(int value);

	/**
	 * Returns the value of the '<em><b>Start Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The absolute start position in the file.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Position</em>' attribute.
	 * @see #setStartPosition(int)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getFilePosition_StartPosition()
	 * @model unique="false"
	 * @generated
	 */
	int getStartPosition();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.FilePosition#getStartPosition <em>Start Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Position</em>' attribute.
	 * @see #getStartPosition()
	 * @generated
	 */
	void setStartPosition(int value);

	/**
	 * Returns the value of the '<em><b>End Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The absolute end position in the file.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Position</em>' attribute.
	 * @see #setEndPosition(int)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getFilePosition_EndPosition()
	 * @model unique="false"
	 * @generated
	 */
	int getEndPosition();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.FilePosition#getEndPosition <em>End Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Position</em>' attribute.
	 * @see #getEndPosition()
	 * @generated
	 */
	void setEndPosition(int value);

} // FilePosition
