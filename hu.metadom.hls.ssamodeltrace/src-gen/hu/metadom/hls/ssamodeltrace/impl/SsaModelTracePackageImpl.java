/**
 */
package hu.metadom.hls.ssamodeltrace.impl;

import hu.metadom.hls.ssamodel.SsaModelPackage;

import hu.metadom.hls.ssamodeltrace.FunctionCall;
import hu.metadom.hls.ssamodeltrace.FunctionToDepointerParams;
import hu.metadom.hls.ssamodeltrace.FunctionToLocalizeVariables;
import hu.metadom.hls.ssamodeltrace.PointerParameter;
import hu.metadom.hls.ssamodeltrace.SsaModelTraceFactory;
import hu.metadom.hls.ssamodeltrace.SsaModelTracePackage;
import hu.metadom.hls.ssamodeltrace.Trace;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SsaModelTracePackageImpl extends EPackageImpl implements SsaModelTracePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionToLocalizeVariablesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionToDepointerParamsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointerParameterEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see hu.metadom.hls.ssamodeltrace.SsaModelTracePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SsaModelTracePackageImpl() {
		super(eNS_URI, SsaModelTraceFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SsaModelTracePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SsaModelTracePackage init() {
		if (isInited) return (SsaModelTracePackage)EPackage.Registry.INSTANCE.getEPackage(SsaModelTracePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSsaModelTracePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SsaModelTracePackageImpl theSsaModelTracePackage = registeredSsaModelTracePackage instanceof SsaModelTracePackageImpl ? (SsaModelTracePackageImpl)registeredSsaModelTracePackage : new SsaModelTracePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		SsaModelPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSsaModelTracePackage.createPackageContents();

		// Initialize created meta-data
		theSsaModelTracePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSsaModelTracePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SsaModelTracePackage.eNS_URI, theSsaModelTracePackage);
		return theSsaModelTracePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFunctionToLocalizeVariables() {
		return functionToLocalizeVariablesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunctionToLocalizeVariables_Function() {
		return (EReference)functionToLocalizeVariablesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunctionToLocalizeVariables_Vars() {
		return (EReference)functionToLocalizeVariablesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunctionToLocalizeVariables_FuncCalls() {
		return (EReference)functionToLocalizeVariablesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTrace() {
		return traceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTrace_Functions() {
		return (EReference)traceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTrace_Container() {
		return (EReference)traceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTrace_Pointers() {
		return (EReference)traceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFunctionCall() {
		return functionCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunctionCall_SsaCall() {
		return (EReference)functionCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunctionCall_FunctionTrace() {
		return (EReference)functionCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFunctionToDepointerParams() {
		return functionToDepointerParamsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunctionToDepointerParams_Function() {
		return (EReference)functionToDepointerParamsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunctionToDepointerParams_PointerParameter() {
		return (EReference)functionToDepointerParamsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPointerParameter() {
		return pointerParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPointerParameter_PointerParam() {
		return (EReference)pointerParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPointerParameter_IndirectReadList() {
		return (EReference)pointerParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPointerParameter_IndirectWriteList() {
		return (EReference)pointerParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointerParameter_IsInput() {
		return (EAttribute)pointerParameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointerParameter_IsOutput() {
		return (EAttribute)pointerParameterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SsaModelTraceFactory getSsaModelTraceFactory() {
		return (SsaModelTraceFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		functionToLocalizeVariablesEClass = createEClass(FUNCTION_TO_LOCALIZE_VARIABLES);
		createEReference(functionToLocalizeVariablesEClass, FUNCTION_TO_LOCALIZE_VARIABLES__FUNCTION);
		createEReference(functionToLocalizeVariablesEClass, FUNCTION_TO_LOCALIZE_VARIABLES__VARS);
		createEReference(functionToLocalizeVariablesEClass, FUNCTION_TO_LOCALIZE_VARIABLES__FUNC_CALLS);

		traceEClass = createEClass(TRACE);
		createEReference(traceEClass, TRACE__FUNCTIONS);
		createEReference(traceEClass, TRACE__CONTAINER);
		createEReference(traceEClass, TRACE__POINTERS);

		functionCallEClass = createEClass(FUNCTION_CALL);
		createEReference(functionCallEClass, FUNCTION_CALL__SSA_CALL);
		createEReference(functionCallEClass, FUNCTION_CALL__FUNCTION_TRACE);

		functionToDepointerParamsEClass = createEClass(FUNCTION_TO_DEPOINTER_PARAMS);
		createEReference(functionToDepointerParamsEClass, FUNCTION_TO_DEPOINTER_PARAMS__FUNCTION);
		createEReference(functionToDepointerParamsEClass, FUNCTION_TO_DEPOINTER_PARAMS__POINTER_PARAMETER);

		pointerParameterEClass = createEClass(POINTER_PARAMETER);
		createEReference(pointerParameterEClass, POINTER_PARAMETER__POINTER_PARAM);
		createEReference(pointerParameterEClass, POINTER_PARAMETER__INDIRECT_READ_LIST);
		createEReference(pointerParameterEClass, POINTER_PARAMETER__INDIRECT_WRITE_LIST);
		createEAttribute(pointerParameterEClass, POINTER_PARAMETER__IS_INPUT);
		createEAttribute(pointerParameterEClass, POINTER_PARAMETER__IS_OUTPUT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		SsaModelPackage theSsaModelPackage = (SsaModelPackage)EPackage.Registry.INSTANCE.getEPackage(SsaModelPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(functionToLocalizeVariablesEClass, FunctionToLocalizeVariables.class, "FunctionToLocalizeVariables", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionToLocalizeVariables_Function(), theSsaModelPackage.getSsaFunction(), null, "function", null, 0, 1, FunctionToLocalizeVariables.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionToLocalizeVariables_Vars(), theSsaModelPackage.getSsaVar(), null, "vars", null, 0, -1, FunctionToLocalizeVariables.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionToLocalizeVariables_FuncCalls(), this.getFunctionCall(), null, "funcCalls", null, 0, -1, FunctionToLocalizeVariables.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(traceEClass, Trace.class, "Trace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrace_Functions(), this.getFunctionToLocalizeVariables(), null, "functions", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrace_Container(), theSsaModelPackage.getContainer(), null, "container", null, 0, 1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrace_Pointers(), this.getFunctionToDepointerParams(), null, "pointers", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionCallEClass, FunctionCall.class, "FunctionCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionCall_SsaCall(), theSsaModelPackage.getSsaCall(), null, "ssaCall", null, 0, 1, FunctionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionCall_FunctionTrace(), this.getFunctionToLocalizeVariables(), null, "functionTrace", null, 0, 1, FunctionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionToDepointerParamsEClass, FunctionToDepointerParams.class, "FunctionToDepointerParams", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionToDepointerParams_Function(), theSsaModelPackage.getSsaFunction(), null, "function", null, 0, 1, FunctionToDepointerParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionToDepointerParams_PointerParameter(), this.getPointerParameter(), null, "pointerParameter", null, 0, -1, FunctionToDepointerParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pointerParameterEClass, PointerParameter.class, "PointerParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPointerParameter_PointerParam(), theSsaModelPackage.getSsaParam(), null, "pointerParam", null, 0, 1, PointerParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPointerParameter_IndirectReadList(), theSsaModelPackage.getSsaIndirectRead(), null, "indirectReadList", null, 0, -1, PointerParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPointerParameter_IndirectWriteList(), theSsaModelPackage.getSsaIndirectWrite(), null, "indirectWriteList", null, 0, -1, PointerParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPointerParameter_IsInput(), theEcorePackage.getEBoolean(), "isInput", null, 0, 1, PointerParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPointerParameter_IsOutput(), theEcorePackage.getEBoolean(), "isOutput", "false", 0, 1, PointerParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SsaModelTracePackageImpl
