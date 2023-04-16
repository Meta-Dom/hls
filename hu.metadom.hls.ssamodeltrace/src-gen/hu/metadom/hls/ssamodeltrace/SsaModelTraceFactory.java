/**
 */
package hu.metadom.hls.ssamodeltrace;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.metadom.hls.ssamodeltrace.SsaModelTracePackage
 * @generated
 */
public interface SsaModelTraceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SsaModelTraceFactory eINSTANCE = hu.metadom.hls.ssamodeltrace.impl.SsaModelTraceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Function To Localize Variables</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function To Localize Variables</em>'.
	 * @generated
	 */
	FunctionToLocalizeVariables createFunctionToLocalizeVariables();

	/**
	 * Returns a new object of class '<em>Trace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trace</em>'.
	 * @generated
	 */
	Trace createTrace();

	/**
	 * Returns a new object of class '<em>Function Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Call</em>'.
	 * @generated
	 */
	FunctionCall createFunctionCall();

	/**
	 * Returns a new object of class '<em>Function To Depointer Params</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function To Depointer Params</em>'.
	 * @generated
	 */
	FunctionToDepointerParams createFunctionToDepointerParams();

	/**
	 * Returns a new object of class '<em>Pointer Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pointer Parameter</em>'.
	 * @generated
	 */
	PointerParameter createPointerParameter();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SsaModelTracePackage getSsaModelTracePackage();

} //SsaModelTraceFactory
