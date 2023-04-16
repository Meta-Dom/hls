/**
 */
package hu.metadom.hls.ssamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ssa Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.metadom.hls.ssamodel.SsaSwitch#getSelector <em>Selector</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.SsaSwitch#getCases <em>Cases</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.SsaSwitch#getMerge <em>Merge</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.SsaSwitch#getDefault <em>Default</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.SsaSwitch#getSwitchType <em>Switch Type</em>}</li>
 * </ul>
 *
 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaSwitch()
 * @model
 * @generated
 */
public interface SsaSwitch extends SsaNode {
	/**
	 * Returns the value of the '<em><b>Selector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selector</em>' reference.
	 * @see #setSelector(SsaNode)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaSwitch_Selector()
	 * @model
	 * @generated
	 */
	SsaNode getSelector();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.SsaSwitch#getSelector <em>Selector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selector</em>' reference.
	 * @see #getSelector()
	 * @generated
	 */
	void setSelector(SsaNode value);

	/**
	 * Returns the value of the '<em><b>Cases</b></em>' containment reference list.
	 * The list contents are of type {@link hu.metadom.hls.ssamodel.SsaCase}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cases</em>' containment reference list.
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaSwitch_Cases()
	 * @model containment="true"
	 * @generated
	 */
	EList<SsaCase> getCases();

	/**
	 * Returns the value of the '<em><b>Merge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Merge</em>' containment reference.
	 * @see #setMerge(SsaNode)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaSwitch_Merge()
	 * @model containment="true"
	 * @generated
	 */
	SsaNode getMerge();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.SsaSwitch#getMerge <em>Merge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merge</em>' containment reference.
	 * @see #getMerge()
	 * @generated
	 */
	void setMerge(SsaNode value);

	/**
	 * Returns the value of the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' containment reference.
	 * @see #setDefault(SsaNode)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaSwitch_Default()
	 * @model containment="true"
	 * @generated
	 */
	SsaNode getDefault();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.SsaSwitch#getDefault <em>Default</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' containment reference.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(SsaNode value);

	/**
	 * Returns the value of the '<em><b>Switch Type</b></em>' attribute.
	 * The default value is <code>"SWITCH"</code>.
	 * The literals are from the enumeration {@link hu.metadom.hls.ssamodel.SwitchType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switch Type</em>' attribute.
	 * @see hu.metadom.hls.ssamodel.SwitchType
	 * @see #setSwitchType(SwitchType)
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#getSsaSwitch_SwitchType()
	 * @model default="SWITCH" unique="false"
	 * @generated
	 */
	SwitchType getSwitchType();

	/**
	 * Sets the value of the '{@link hu.metadom.hls.ssamodel.SsaSwitch#getSwitchType <em>Switch Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Switch Type</em>' attribute.
	 * @see hu.metadom.hls.ssamodel.SwitchType
	 * @see #getSwitchType()
	 * @generated
	 */
	void setSwitchType(SwitchType value);

} // SsaSwitch
