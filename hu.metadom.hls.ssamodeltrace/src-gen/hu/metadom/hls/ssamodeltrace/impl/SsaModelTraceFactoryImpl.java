/**
 */
package hu.metadom.hls.ssamodeltrace.impl;

import hu.metadom.hls.ssamodeltrace.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SsaModelTraceFactoryImpl extends EFactoryImpl implements SsaModelTraceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SsaModelTraceFactory init() {
		try {
			SsaModelTraceFactory theSsaModelTraceFactory = (SsaModelTraceFactory)EPackage.Registry.INSTANCE.getEFactory(SsaModelTracePackage.eNS_URI);
			if (theSsaModelTraceFactory != null) {
				return theSsaModelTraceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SsaModelTraceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaModelTraceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SsaModelTracePackage.FUNCTION_TO_LOCALIZE_VARIABLES: return createFunctionToLocalizeVariables();
			case SsaModelTracePackage.TRACE: return createTrace();
			case SsaModelTracePackage.FUNCTION_CALL: return createFunctionCall();
			case SsaModelTracePackage.FUNCTION_TO_DEPOINTER_PARAMS: return createFunctionToDepointerParams();
			case SsaModelTracePackage.POINTER_PARAMETER: return createPointerParameter();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionToLocalizeVariables createFunctionToLocalizeVariables() {
		FunctionToLocalizeVariablesImpl functionToLocalizeVariables = new FunctionToLocalizeVariablesImpl();
		return functionToLocalizeVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Trace createTrace() {
		TraceImpl trace = new TraceImpl();
		return trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionCall createFunctionCall() {
		FunctionCallImpl functionCall = new FunctionCallImpl();
		return functionCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionToDepointerParams createFunctionToDepointerParams() {
		FunctionToDepointerParamsImpl functionToDepointerParams = new FunctionToDepointerParamsImpl();
		return functionToDepointerParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointerParameter createPointerParameter() {
		PointerParameterImpl pointerParameter = new PointerParameterImpl();
		return pointerParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SsaModelTracePackage getSsaModelTracePackage() {
		return (SsaModelTracePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SsaModelTracePackage getPackage() {
		return SsaModelTracePackage.eINSTANCE;
	}

} //SsaModelTraceFactoryImpl
