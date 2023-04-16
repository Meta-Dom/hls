/**
 */
package hu.metadom.hls.ssamodeltrace;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hu.metadom.hls.ssamodeltrace.SsaModelTraceFactory
 * @model kind="package"
 * @generated
 */
public interface SsaModelTracePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ssamodeltrace";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://hls.metadom.hu/ssaModelTrace";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ssamodeltrace";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SsaModelTracePackage eINSTANCE = hu.metadom.hls.ssamodeltrace.impl.SsaModelTracePackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.metadom.hls.ssamodeltrace.impl.FunctionToLocalizeVariablesImpl <em>Function To Localize Variables</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.metadom.hls.ssamodeltrace.impl.FunctionToLocalizeVariablesImpl
	 * @see hu.metadom.hls.ssamodeltrace.impl.SsaModelTracePackageImpl#getFunctionToLocalizeVariables()
	 * @generated
	 */
	int FUNCTION_TO_LOCALIZE_VARIABLES = 0;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TO_LOCALIZE_VARIABLES__FUNCTION = 0;

	/**
	 * The feature id for the '<em><b>Vars</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TO_LOCALIZE_VARIABLES__VARS = 1;

	/**
	 * The feature id for the '<em><b>Func Calls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TO_LOCALIZE_VARIABLES__FUNC_CALLS = 2;

	/**
	 * The number of structural features of the '<em>Function To Localize Variables</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TO_LOCALIZE_VARIABLES_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Function To Localize Variables</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TO_LOCALIZE_VARIABLES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.metadom.hls.ssamodeltrace.impl.TraceImpl <em>Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.metadom.hls.ssamodeltrace.impl.TraceImpl
	 * @see hu.metadom.hls.ssamodeltrace.impl.SsaModelTracePackageImpl#getTrace()
	 * @generated
	 */
	int TRACE = 1;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__FUNCTIONS = 0;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__CONTAINER = 1;

	/**
	 * The feature id for the '<em><b>Pointers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__POINTERS = 2;

	/**
	 * The number of structural features of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.metadom.hls.ssamodeltrace.impl.FunctionCallImpl <em>Function Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.metadom.hls.ssamodeltrace.impl.FunctionCallImpl
	 * @see hu.metadom.hls.ssamodeltrace.impl.SsaModelTracePackageImpl#getFunctionCall()
	 * @generated
	 */
	int FUNCTION_CALL = 2;

	/**
	 * The feature id for the '<em><b>Ssa Call</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__SSA_CALL = 0;

	/**
	 * The feature id for the '<em><b>Function Trace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__FUNCTION_TRACE = 1;

	/**
	 * The number of structural features of the '<em>Function Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Function Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.metadom.hls.ssamodeltrace.impl.FunctionToDepointerParamsImpl <em>Function To Depointer Params</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.metadom.hls.ssamodeltrace.impl.FunctionToDepointerParamsImpl
	 * @see hu.metadom.hls.ssamodeltrace.impl.SsaModelTracePackageImpl#getFunctionToDepointerParams()
	 * @generated
	 */
	int FUNCTION_TO_DEPOINTER_PARAMS = 3;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TO_DEPOINTER_PARAMS__FUNCTION = 0;

	/**
	 * The feature id for the '<em><b>Pointer Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TO_DEPOINTER_PARAMS__POINTER_PARAMETER = 1;

	/**
	 * The number of structural features of the '<em>Function To Depointer Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TO_DEPOINTER_PARAMS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Function To Depointer Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TO_DEPOINTER_PARAMS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.metadom.hls.ssamodeltrace.impl.PointerParameterImpl <em>Pointer Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.metadom.hls.ssamodeltrace.impl.PointerParameterImpl
	 * @see hu.metadom.hls.ssamodeltrace.impl.SsaModelTracePackageImpl#getPointerParameter()
	 * @generated
	 */
	int POINTER_PARAMETER = 4;

	/**
	 * The feature id for the '<em><b>Pointer Param</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_PARAMETER__POINTER_PARAM = 0;

	/**
	 * The feature id for the '<em><b>Indirect Read List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_PARAMETER__INDIRECT_READ_LIST = 1;

	/**
	 * The feature id for the '<em><b>Indirect Write List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_PARAMETER__INDIRECT_WRITE_LIST = 2;

	/**
	 * The feature id for the '<em><b>Is Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_PARAMETER__IS_INPUT = 3;

	/**
	 * The feature id for the '<em><b>Is Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_PARAMETER__IS_OUTPUT = 4;

	/**
	 * The number of structural features of the '<em>Pointer Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_PARAMETER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Pointer Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_PARAMETER_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link hu.metadom.hls.ssamodeltrace.FunctionToLocalizeVariables <em>Function To Localize Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function To Localize Variables</em>'.
	 * @see hu.metadom.hls.ssamodeltrace.FunctionToLocalizeVariables
	 * @generated
	 */
	EClass getFunctionToLocalizeVariables();

	/**
	 * Returns the meta object for the reference '{@link hu.metadom.hls.ssamodeltrace.FunctionToLocalizeVariables#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Function</em>'.
	 * @see hu.metadom.hls.ssamodeltrace.FunctionToLocalizeVariables#getFunction()
	 * @see #getFunctionToLocalizeVariables()
	 * @generated
	 */
	EReference getFunctionToLocalizeVariables_Function();

	/**
	 * Returns the meta object for the reference list '{@link hu.metadom.hls.ssamodeltrace.FunctionToLocalizeVariables#getVars <em>Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Vars</em>'.
	 * @see hu.metadom.hls.ssamodeltrace.FunctionToLocalizeVariables#getVars()
	 * @see #getFunctionToLocalizeVariables()
	 * @generated
	 */
	EReference getFunctionToLocalizeVariables_Vars();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.metadom.hls.ssamodeltrace.FunctionToLocalizeVariables#getFuncCalls <em>Func Calls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Func Calls</em>'.
	 * @see hu.metadom.hls.ssamodeltrace.FunctionToLocalizeVariables#getFuncCalls()
	 * @see #getFunctionToLocalizeVariables()
	 * @generated
	 */
	EReference getFunctionToLocalizeVariables_FuncCalls();

	/**
	 * Returns the meta object for class '{@link hu.metadom.hls.ssamodeltrace.Trace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace</em>'.
	 * @see hu.metadom.hls.ssamodeltrace.Trace
	 * @generated
	 */
	EClass getTrace();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.metadom.hls.ssamodeltrace.Trace#getFunctions <em>Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Functions</em>'.
	 * @see hu.metadom.hls.ssamodeltrace.Trace#getFunctions()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Functions();

	/**
	 * Returns the meta object for the reference '{@link hu.metadom.hls.ssamodeltrace.Trace#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Container</em>'.
	 * @see hu.metadom.hls.ssamodeltrace.Trace#getContainer()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Container();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.metadom.hls.ssamodeltrace.Trace#getPointers <em>Pointers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pointers</em>'.
	 * @see hu.metadom.hls.ssamodeltrace.Trace#getPointers()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Pointers();

	/**
	 * Returns the meta object for class '{@link hu.metadom.hls.ssamodeltrace.FunctionCall <em>Function Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Call</em>'.
	 * @see hu.metadom.hls.ssamodeltrace.FunctionCall
	 * @generated
	 */
	EClass getFunctionCall();

	/**
	 * Returns the meta object for the reference '{@link hu.metadom.hls.ssamodeltrace.FunctionCall#getSsaCall <em>Ssa Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ssa Call</em>'.
	 * @see hu.metadom.hls.ssamodeltrace.FunctionCall#getSsaCall()
	 * @see #getFunctionCall()
	 * @generated
	 */
	EReference getFunctionCall_SsaCall();

	/**
	 * Returns the meta object for the reference '{@link hu.metadom.hls.ssamodeltrace.FunctionCall#getFunctionTrace <em>Function Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Function Trace</em>'.
	 * @see hu.metadom.hls.ssamodeltrace.FunctionCall#getFunctionTrace()
	 * @see #getFunctionCall()
	 * @generated
	 */
	EReference getFunctionCall_FunctionTrace();

	/**
	 * Returns the meta object for class '{@link hu.metadom.hls.ssamodeltrace.FunctionToDepointerParams <em>Function To Depointer Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function To Depointer Params</em>'.
	 * @see hu.metadom.hls.ssamodeltrace.FunctionToDepointerParams
	 * @generated
	 */
	EClass getFunctionToDepointerParams();

	/**
	 * Returns the meta object for the reference '{@link hu.metadom.hls.ssamodeltrace.FunctionToDepointerParams#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Function</em>'.
	 * @see hu.metadom.hls.ssamodeltrace.FunctionToDepointerParams#getFunction()
	 * @see #getFunctionToDepointerParams()
	 * @generated
	 */
	EReference getFunctionToDepointerParams_Function();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.metadom.hls.ssamodeltrace.FunctionToDepointerParams#getPointerParameter <em>Pointer Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pointer Parameter</em>'.
	 * @see hu.metadom.hls.ssamodeltrace.FunctionToDepointerParams#getPointerParameter()
	 * @see #getFunctionToDepointerParams()
	 * @generated
	 */
	EReference getFunctionToDepointerParams_PointerParameter();

	/**
	 * Returns the meta object for class '{@link hu.metadom.hls.ssamodeltrace.PointerParameter <em>Pointer Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pointer Parameter</em>'.
	 * @see hu.metadom.hls.ssamodeltrace.PointerParameter
	 * @generated
	 */
	EClass getPointerParameter();

	/**
	 * Returns the meta object for the reference '{@link hu.metadom.hls.ssamodeltrace.PointerParameter#getPointerParam <em>Pointer Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pointer Param</em>'.
	 * @see hu.metadom.hls.ssamodeltrace.PointerParameter#getPointerParam()
	 * @see #getPointerParameter()
	 * @generated
	 */
	EReference getPointerParameter_PointerParam();

	/**
	 * Returns the meta object for the reference list '{@link hu.metadom.hls.ssamodeltrace.PointerParameter#getIndirectReadList <em>Indirect Read List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Indirect Read List</em>'.
	 * @see hu.metadom.hls.ssamodeltrace.PointerParameter#getIndirectReadList()
	 * @see #getPointerParameter()
	 * @generated
	 */
	EReference getPointerParameter_IndirectReadList();

	/**
	 * Returns the meta object for the reference list '{@link hu.metadom.hls.ssamodeltrace.PointerParameter#getIndirectWriteList <em>Indirect Write List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Indirect Write List</em>'.
	 * @see hu.metadom.hls.ssamodeltrace.PointerParameter#getIndirectWriteList()
	 * @see #getPointerParameter()
	 * @generated
	 */
	EReference getPointerParameter_IndirectWriteList();

	/**
	 * Returns the meta object for the attribute '{@link hu.metadom.hls.ssamodeltrace.PointerParameter#isIsInput <em>Is Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Input</em>'.
	 * @see hu.metadom.hls.ssamodeltrace.PointerParameter#isIsInput()
	 * @see #getPointerParameter()
	 * @generated
	 */
	EAttribute getPointerParameter_IsInput();

	/**
	 * Returns the meta object for the attribute '{@link hu.metadom.hls.ssamodeltrace.PointerParameter#isIsOutput <em>Is Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Output</em>'.
	 * @see hu.metadom.hls.ssamodeltrace.PointerParameter#isIsOutput()
	 * @see #getPointerParameter()
	 * @generated
	 */
	EAttribute getPointerParameter_IsOutput();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SsaModelTraceFactory getSsaModelTraceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link hu.metadom.hls.ssamodeltrace.impl.FunctionToLocalizeVariablesImpl <em>Function To Localize Variables</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.metadom.hls.ssamodeltrace.impl.FunctionToLocalizeVariablesImpl
		 * @see hu.metadom.hls.ssamodeltrace.impl.SsaModelTracePackageImpl#getFunctionToLocalizeVariables()
		 * @generated
		 */
		EClass FUNCTION_TO_LOCALIZE_VARIABLES = eINSTANCE.getFunctionToLocalizeVariables();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_TO_LOCALIZE_VARIABLES__FUNCTION = eINSTANCE.getFunctionToLocalizeVariables_Function();

		/**
		 * The meta object literal for the '<em><b>Vars</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_TO_LOCALIZE_VARIABLES__VARS = eINSTANCE.getFunctionToLocalizeVariables_Vars();

		/**
		 * The meta object literal for the '<em><b>Func Calls</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_TO_LOCALIZE_VARIABLES__FUNC_CALLS = eINSTANCE.getFunctionToLocalizeVariables_FuncCalls();

		/**
		 * The meta object literal for the '{@link hu.metadom.hls.ssamodeltrace.impl.TraceImpl <em>Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.metadom.hls.ssamodeltrace.impl.TraceImpl
		 * @see hu.metadom.hls.ssamodeltrace.impl.SsaModelTracePackageImpl#getTrace()
		 * @generated
		 */
		EClass TRACE = eINSTANCE.getTrace();

		/**
		 * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__FUNCTIONS = eINSTANCE.getTrace_Functions();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__CONTAINER = eINSTANCE.getTrace_Container();

		/**
		 * The meta object literal for the '<em><b>Pointers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__POINTERS = eINSTANCE.getTrace_Pointers();

		/**
		 * The meta object literal for the '{@link hu.metadom.hls.ssamodeltrace.impl.FunctionCallImpl <em>Function Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.metadom.hls.ssamodeltrace.impl.FunctionCallImpl
		 * @see hu.metadom.hls.ssamodeltrace.impl.SsaModelTracePackageImpl#getFunctionCall()
		 * @generated
		 */
		EClass FUNCTION_CALL = eINSTANCE.getFunctionCall();

		/**
		 * The meta object literal for the '<em><b>Ssa Call</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_CALL__SSA_CALL = eINSTANCE.getFunctionCall_SsaCall();

		/**
		 * The meta object literal for the '<em><b>Function Trace</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_CALL__FUNCTION_TRACE = eINSTANCE.getFunctionCall_FunctionTrace();

		/**
		 * The meta object literal for the '{@link hu.metadom.hls.ssamodeltrace.impl.FunctionToDepointerParamsImpl <em>Function To Depointer Params</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.metadom.hls.ssamodeltrace.impl.FunctionToDepointerParamsImpl
		 * @see hu.metadom.hls.ssamodeltrace.impl.SsaModelTracePackageImpl#getFunctionToDepointerParams()
		 * @generated
		 */
		EClass FUNCTION_TO_DEPOINTER_PARAMS = eINSTANCE.getFunctionToDepointerParams();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_TO_DEPOINTER_PARAMS__FUNCTION = eINSTANCE.getFunctionToDepointerParams_Function();

		/**
		 * The meta object literal for the '<em><b>Pointer Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_TO_DEPOINTER_PARAMS__POINTER_PARAMETER = eINSTANCE.getFunctionToDepointerParams_PointerParameter();

		/**
		 * The meta object literal for the '{@link hu.metadom.hls.ssamodeltrace.impl.PointerParameterImpl <em>Pointer Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.metadom.hls.ssamodeltrace.impl.PointerParameterImpl
		 * @see hu.metadom.hls.ssamodeltrace.impl.SsaModelTracePackageImpl#getPointerParameter()
		 * @generated
		 */
		EClass POINTER_PARAMETER = eINSTANCE.getPointerParameter();

		/**
		 * The meta object literal for the '<em><b>Pointer Param</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINTER_PARAMETER__POINTER_PARAM = eINSTANCE.getPointerParameter_PointerParam();

		/**
		 * The meta object literal for the '<em><b>Indirect Read List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINTER_PARAMETER__INDIRECT_READ_LIST = eINSTANCE.getPointerParameter_IndirectReadList();

		/**
		 * The meta object literal for the '<em><b>Indirect Write List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINTER_PARAMETER__INDIRECT_WRITE_LIST = eINSTANCE.getPointerParameter_IndirectWriteList();

		/**
		 * The meta object literal for the '<em><b>Is Input</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINTER_PARAMETER__IS_INPUT = eINSTANCE.getPointerParameter_IsInput();

		/**
		 * The meta object literal for the '<em><b>Is Output</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINTER_PARAMETER__IS_OUTPUT = eINSTANCE.getPointerParameter_IsOutput();

	}

} //SsaModelTracePackage
