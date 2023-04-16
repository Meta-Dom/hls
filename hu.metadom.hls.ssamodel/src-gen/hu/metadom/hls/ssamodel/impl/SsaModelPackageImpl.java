/**
 */
package hu.metadom.hls.ssamodel.impl;

import hu.metadom.hls.ssamodel.ArrayType;
import hu.metadom.hls.ssamodel.CNameScope;
import hu.metadom.hls.ssamodel.CompileTimeExpression;
import hu.metadom.hls.ssamodel.ContainerType;
import hu.metadom.hls.ssamodel.ControlType;
import hu.metadom.hls.ssamodel.DowhileType;
import hu.metadom.hls.ssamodel.EnumMember;
import hu.metadom.hls.ssamodel.FilePosition;
import hu.metadom.hls.ssamodel.FunctionType;
import hu.metadom.hls.ssamodel.LoopType;
import hu.metadom.hls.ssamodel.Member;
import hu.metadom.hls.ssamodel.ParamDirection;
import hu.metadom.hls.ssamodel.PointerType;
import hu.metadom.hls.ssamodel.PrimitiveType;
import hu.metadom.hls.ssamodel.ReferenceType;
import hu.metadom.hls.ssamodel.SsaAbstractInit;
import hu.metadom.hls.ssamodel.SsaArgument;
import hu.metadom.hls.ssamodel.SsaArrayRead;
import hu.metadom.hls.ssamodel.SsaArrayWrite;
import hu.metadom.hls.ssamodel.SsaAssign;
import hu.metadom.hls.ssamodel.SsaBinaryOperator;
import hu.metadom.hls.ssamodel.SsaBinaryOperatorKind;
import hu.metadom.hls.ssamodel.SsaBlock;
import hu.metadom.hls.ssamodel.SsaCall;
import hu.metadom.hls.ssamodel.SsaCase;
import hu.metadom.hls.ssamodel.SsaCast;
import hu.metadom.hls.ssamodel.SsaConditionalJump;
import hu.metadom.hls.ssamodel.SsaConst;
import hu.metadom.hls.ssamodel.SsaControl;
import hu.metadom.hls.ssamodel.SsaDowhile;
import hu.metadom.hls.ssamodel.SsaExplicitCast;
import hu.metadom.hls.ssamodel.SsaFunction;
import hu.metadom.hls.ssamodel.SsaGoto;
import hu.metadom.hls.ssamodel.SsaIndirectRead;
import hu.metadom.hls.ssamodel.SsaIndirectWrite;
import hu.metadom.hls.ssamodel.SsaInit;
import hu.metadom.hls.ssamodel.SsaInitList;
import hu.metadom.hls.ssamodel.SsaLabel;
import hu.metadom.hls.ssamodel.SsaModelFactory;
import hu.metadom.hls.ssamodel.SsaModelPackage;
import hu.metadom.hls.ssamodel.SsaNode;
import hu.metadom.hls.ssamodel.SsaNodeRef;
import hu.metadom.hls.ssamodel.SsaObject;
import hu.metadom.hls.ssamodel.SsaOutputArgument;
import hu.metadom.hls.ssamodel.SsaParam;
import hu.metadom.hls.ssamodel.SsaPassByRefArgument;
import hu.metadom.hls.ssamodel.SsaPassByRefParam;
import hu.metadom.hls.ssamodel.SsaPhi;
import hu.metadom.hls.ssamodel.SsaReturn;
import hu.metadom.hls.ssamodel.SsaSizeof;
import hu.metadom.hls.ssamodel.SsaSizeofType;
import hu.metadom.hls.ssamodel.SsaSizeofVar;
import hu.metadom.hls.ssamodel.SsaStructRead;
import hu.metadom.hls.ssamodel.SsaStructWrite;
import hu.metadom.hls.ssamodel.SsaSwitch;
import hu.metadom.hls.ssamodel.SsaUnaryOperator;
import hu.metadom.hls.ssamodel.SsaUnaryOperatorKind;
import hu.metadom.hls.ssamodel.SsaVar;
import hu.metadom.hls.ssamodel.Struct;
import hu.metadom.hls.ssamodel.StructBitfieldMember;
import hu.metadom.hls.ssamodel.StructMember;
import hu.metadom.hls.ssamodel.SwitchType;
import hu.metadom.hls.ssamodel.Type;
import hu.metadom.hls.ssamodel.Union;

import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
public class SsaModelPackageImpl extends EPackageImpl implements SsaModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structBitfieldMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ssaNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ssaAssignEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ssaConstEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ssaBinaryOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ssaUnaryOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ssaCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ssaPhiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ssaParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ssaReturnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ssaCastEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ssaConditionalJumpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ssaFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ssaBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ssaStructReadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ssaStructWriteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ssaArrayReadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ssaArrayWriteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filePositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ssaVarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cNameScopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringToCNameMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ssaExplicitCastEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ssaDowhileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ssaSwitchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ssaCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ssaControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ssaAbstractInitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ssaInitListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ssaInitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ssaIndirectWriteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ssaIndirectReadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ssaNodeRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ssaGotoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ssaLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ssaPassByRefArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ssaArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ssaPassByRefParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ssaOutputArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ssaObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ssaSizeofEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ssaSizeofTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ssaSizeofVarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compileTimeExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ssaBinaryOperatorKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ssaUnaryOperatorKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum containerTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum loopTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum controlTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum paramDirectionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum switchTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dowhileTypeEEnum = null;

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
	 * @see hu.metadom.hls.ssamodel.SsaModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SsaModelPackageImpl() {
		super(eNS_URI, SsaModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SsaModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SsaModelPackage init() {
		if (isInited)
			return (SsaModelPackage) EPackage.Registry.INSTANCE.getEPackage(SsaModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSsaModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SsaModelPackageImpl theSsaModelPackage = registeredSsaModelPackage instanceof SsaModelPackageImpl
				? (SsaModelPackageImpl) registeredSsaModelPackage
				: new SsaModelPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSsaModelPackage.createPackageContents();

		// Initialize created meta-data
		theSsaModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSsaModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SsaModelPackage.eNS_URI, theSsaModelPackage);
		return theSsaModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getType_Size() {
		return (EAttribute) typeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveType() {
		return primitiveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnum() {
		return enumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnum_Members() {
		return (EReference) enumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStruct() {
		return structEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStruct_Members() {
		return (EReference) structEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnion() {
		return unionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceType() {
		return referenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceType_ReferencedType() {
		return (EReference) referenceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainer() {
		return containerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainer_ChildContainers() {
		return (EReference) containerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Name() {
		return (EAttribute) containerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainer_Functions() {
		return (EReference) containerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Type() {
		return (EAttribute) containerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainer_GlobalBlock() {
		return (EReference) containerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumMember() {
		return enumMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumMember_Const() {
		return (EReference) enumMemberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumMember_ValueNode() {
		return (EReference) enumMemberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructMember() {
		return structMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructMember_Type() {
		return (EReference) structMemberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructBitfieldMember() {
		return structBitfieldMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructBitfieldMember_BitfieldValue() {
		return (EReference) structBitfieldMemberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPointerType() {
		return pointerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayType() {
		return arrayTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayType_Length() {
		return (EReference) arrayTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSsaNode() {
		return ssaNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSsaNode_Type() {
		return (EReference) ssaNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSsaNode_Parent() {
		return (EReference) ssaNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSsaNode_Var() {
		return (EReference) ssaNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSsaNode_SsaIndex() {
		return (EAttribute) ssaNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSsaNode_Origin() {
		return (EAttribute) ssaNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSsaNode_Gid() {
		return (EAttribute) ssaNodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSsaAssign() {
		return ssaAssignEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSsaAssign_Value() {
		return (EReference) ssaAssignEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSsaConst() {
		return ssaConstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSsaConst_Value() {
		return (EAttribute) ssaConstEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSsaBinaryOperator() {
		return ssaBinaryOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSsaBinaryOperator_OperatorKind() {
		return (EAttribute) ssaBinaryOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSsaBinaryOperator_Left() {
		return (EReference) ssaBinaryOperatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSsaBinaryOperator_Right() {
		return (EReference) ssaBinaryOperatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSsaUnaryOperator() {
		return ssaUnaryOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSsaUnaryOperator_OperatorKind() {
		return (EAttribute) ssaUnaryOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSsaUnaryOperator_Operand() {
		return (EReference) ssaUnaryOperatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSsaCall() {
		return ssaCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSsaCall_Arguments() {
		return (EReference) ssaCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSsaCall_Function() {
		return (EReference) ssaCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSsaPhi() {
		return ssaPhiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSsaPhi_Previous() {
		return (EReference) ssaPhiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSsaParam() {
		return ssaParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSsaParam_Direction() {
		return (EAttribute) ssaParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSsaReturn() {
		return ssaReturnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSsaReturn_Expression() {
		return (EReference) ssaReturnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSsaCast() {
		return ssaCastEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSsaCast_From() {
		return (EReference) ssaCastEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSsaConditionalJump() {
		return ssaConditionalJumpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSsaConditionalJump_Condition() {
		return (EReference) ssaConditionalJumpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSsaConditionalJump_ThenBlock() {
		return (EReference) ssaConditionalJumpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSsaConditionalJump_ElseBlock() {
		return (EReference) ssaConditionalJumpEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSsaFunction() {
		return ssaFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSsaFunction_Parameters() {
		return (EReference) ssaFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSsaFunction_ReturnType() {
		return (EReference) ssaFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSsaFunction_VarArg() {
		return (EAttribute) ssaFunctionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSsaBlock() {
		return ssaBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSsaBlock_Nodes() {
		return (EReference) ssaBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSsaBlock_NameScope() {
		return (EReference) ssaBlockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSsaStructRead() {
		return ssaStructReadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSsaStructRead_Struct() {
		return (EReference) ssaStructReadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSsaStructRead_Field() {
		return (EReference) ssaStructReadEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSsaStructWrite() {
		return ssaStructWriteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSsaStructWrite_Struct() {
		return (EReference) ssaStructWriteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSsaStructWrite_Value() {
		return (EReference) ssaStructWriteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSsaStructWrite_Field() {
		return (EReference) ssaStructWriteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSsaArrayRead() {
		return ssaArrayReadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSsaArrayRead_Array() {
		return (EReference) ssaArrayReadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSsaArrayRead_Indices() {
		return (EReference) ssaArrayReadEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSsaArrayWrite() {
		return ssaArrayWriteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSsaArrayWrite_Array() {
		return (EReference) ssaArrayWriteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSsaArrayWrite_Indices() {
		return (EReference) ssaArrayWriteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSsaArrayWrite_Value() {
		return (EReference) ssaArrayWriteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilePosition() {
		return filePositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilePosition_Name() {
		return (EAttribute) filePositionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilePosition_Line() {
		return (EAttribute) filePositionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilePosition_StartPositionInLine() {
		return (EAttribute) filePositionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilePosition_EndPositionInLine() {
		return (EAttribute) filePositionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilePosition_StartPosition() {
		return (EAttribute) filePositionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilePosition_EndPosition() {
		return (EAttribute) filePositionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSsaVar() {
		return ssaVarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSsaVar_Type() {
		return (EReference) ssaVarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSsaVar_InitNode() {
		return (EReference) ssaVarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSsaVar_Origin() {
		return (EAttribute) ssaVarEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCNameScope() {
		return cNameScopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCNameScope_Parent() {
		return (EReference) cNameScopeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCNameScope_Names() {
		return (EReference) cNameScopeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCNameScope_Vars() {
		return (EReference) cNameScopeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCNameScope_Types() {
		return (EReference) cNameScopeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCNameScope_Constants() {
		return (EReference) cNameScopeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringToCNameMap() {
		return stringToCNameMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringToCNameMap_Key() {
		return (EAttribute) stringToCNameMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringToCNameMap_Value() {
		return (EReference) stringToCNameMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSsaExplicitCast() {
		return ssaExplicitCastEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSsaExplicitCast_To() {
		return (EReference) ssaExplicitCastEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMember() {
		return memberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSsaDowhile() {
		return ssaDowhileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSsaDowhile_Body() {
		return (EReference) ssaDowhileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSsaDowhile_Cond() {
		return (EReference) ssaDowhileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSsaDowhile_Merge() {
		return (EReference) ssaDowhileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSsaDowhile_LoopType() {
		return (EAttribute) ssaDowhileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSsaDowhile_CondNode() {
		return (EReference) ssaDowhileEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSsaDowhile_DowhileType() {
		return (EAttribute) ssaDowhileEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSsaSwitch() {
		return ssaSwitchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSsaSwitch_Selector() {
		return (EReference) ssaSwitchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSsaSwitch_Cases() {
		return (EReference) ssaSwitchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSsaSwitch_Merge() {
		return (EReference) ssaSwitchEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSsaSwitch_Default() {
		return (EReference) ssaSwitchEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSsaSwitch_SwitchType() {
		return (EAttribute) ssaSwitchEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSsaCase() {
		return ssaCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSsaCase_Node() {
		return (EReference) ssaCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSsaCase_Values() {
		return (EReference) ssaCaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSsaControl() {
		return ssaControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSsaControl_ControlType() {
		return (EAttribute) ssaControlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSsaAbstractInit() {
		return ssaAbstractInitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSsaInitList() {
		return ssaInitListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSsaInitList_Inits() {
		return (EReference) ssaInitListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSsaInit() {
		return ssaInitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSsaInit_Value() {
		return (EReference) ssaInitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionType() {
		return functionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionType_ReturnType() {
		return (EReference) functionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionType_ParamTypes() {
		return (EReference) functionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSsaIndirectWrite() {
		return ssaIndirectWriteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSsaIndirectWrite_Pointer() {
		return (EReference) ssaIndirectWriteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSsaIndirectWrite_Value() {
		return (EReference) ssaIndirectWriteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSsaIndirectRead() {
		return ssaIndirectReadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSsaIndirectRead_Pointer() {
		return (EReference) ssaIndirectReadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSsaNodeRef() {
		return ssaNodeRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSsaNodeRef_Node() {
		return (EReference) ssaNodeRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSsaNodeRef_Fileposition() {
		return (EReference) ssaNodeRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSsaGoto() {
		return ssaGotoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSsaGoto_Label() {
		return (EReference) ssaGotoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSsaLabel() {
		return ssaLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSsaPassByRefArgument() {
		return ssaPassByRefArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSsaPassByRefArgument_OutNode() {
		return (EReference) ssaPassByRefArgumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSsaArgument() {
		return ssaArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSsaArgument_Param() {
		return (EReference) ssaArgumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSsaPassByRefParam() {
		return ssaPassByRefParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSsaPassByRefParam_OutNode() {
		return (EReference) ssaPassByRefParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSsaOutputArgument() {
		return ssaOutputArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSsaObject() {
		return ssaObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSsaObject_Name() {
		return (EAttribute) ssaObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSsaObject_Comment() {
		return (EAttribute) ssaObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSsaObject_Fileposition() {
		return (EReference) ssaObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSsaSizeof() {
		return ssaSizeofEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSsaSizeofType() {
		return ssaSizeofTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSsaSizeofType_SizeofType() {
		return (EReference) ssaSizeofTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSsaSizeofVar() {
		return ssaSizeofVarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSsaSizeofVar_SizeofExpr() {
		return (EReference) ssaSizeofVarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompileTimeExpression() {
		return compileTimeExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompileTimeExpression_Value() {
		return (EAttribute) compileTimeExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompileTimeExpression_Node() {
		return (EReference) compileTimeExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSsaBinaryOperatorKind() {
		return ssaBinaryOperatorKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSsaUnaryOperatorKind() {
		return ssaUnaryOperatorKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getContainerType() {
		return containerTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLoopType() {
		return loopTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getControlType() {
		return controlTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParamDirection() {
		return paramDirectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSwitchType() {
		return switchTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDowhileType() {
		return dowhileTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaModelFactory getSsaModelFactory() {
		return (SsaModelFactory) getEFactoryInstance();
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
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		typeEClass = createEClass(TYPE);
		createEAttribute(typeEClass, TYPE__SIZE);

		primitiveTypeEClass = createEClass(PRIMITIVE_TYPE);

		enumEClass = createEClass(ENUM);
		createEReference(enumEClass, ENUM__MEMBERS);

		structEClass = createEClass(STRUCT);
		createEReference(structEClass, STRUCT__MEMBERS);

		unionEClass = createEClass(UNION);

		referenceTypeEClass = createEClass(REFERENCE_TYPE);
		createEReference(referenceTypeEClass, REFERENCE_TYPE__REFERENCED_TYPE);

		containerEClass = createEClass(CONTAINER);
		createEReference(containerEClass, CONTAINER__CHILD_CONTAINERS);
		createEAttribute(containerEClass, CONTAINER__NAME);
		createEReference(containerEClass, CONTAINER__FUNCTIONS);
		createEAttribute(containerEClass, CONTAINER__TYPE);
		createEReference(containerEClass, CONTAINER__GLOBAL_BLOCK);

		enumMemberEClass = createEClass(ENUM_MEMBER);
		createEReference(enumMemberEClass, ENUM_MEMBER__CONST);
		createEReference(enumMemberEClass, ENUM_MEMBER__VALUE_NODE);

		structMemberEClass = createEClass(STRUCT_MEMBER);
		createEReference(structMemberEClass, STRUCT_MEMBER__TYPE);

		structBitfieldMemberEClass = createEClass(STRUCT_BITFIELD_MEMBER);
		createEReference(structBitfieldMemberEClass, STRUCT_BITFIELD_MEMBER__BITFIELD_VALUE);

		pointerTypeEClass = createEClass(POINTER_TYPE);

		arrayTypeEClass = createEClass(ARRAY_TYPE);
		createEReference(arrayTypeEClass, ARRAY_TYPE__LENGTH);

		ssaNodeEClass = createEClass(SSA_NODE);
		createEReference(ssaNodeEClass, SSA_NODE__TYPE);
		createEReference(ssaNodeEClass, SSA_NODE__PARENT);
		createEReference(ssaNodeEClass, SSA_NODE__VAR);
		createEAttribute(ssaNodeEClass, SSA_NODE__SSA_INDEX);
		createEAttribute(ssaNodeEClass, SSA_NODE__ORIGIN);
		createEAttribute(ssaNodeEClass, SSA_NODE__GID);

		ssaAssignEClass = createEClass(SSA_ASSIGN);
		createEReference(ssaAssignEClass, SSA_ASSIGN__VALUE);

		ssaConstEClass = createEClass(SSA_CONST);
		createEAttribute(ssaConstEClass, SSA_CONST__VALUE);

		ssaBinaryOperatorEClass = createEClass(SSA_BINARY_OPERATOR);
		createEAttribute(ssaBinaryOperatorEClass, SSA_BINARY_OPERATOR__OPERATOR_KIND);
		createEReference(ssaBinaryOperatorEClass, SSA_BINARY_OPERATOR__LEFT);
		createEReference(ssaBinaryOperatorEClass, SSA_BINARY_OPERATOR__RIGHT);

		ssaUnaryOperatorEClass = createEClass(SSA_UNARY_OPERATOR);
		createEAttribute(ssaUnaryOperatorEClass, SSA_UNARY_OPERATOR__OPERATOR_KIND);
		createEReference(ssaUnaryOperatorEClass, SSA_UNARY_OPERATOR__OPERAND);

		ssaCallEClass = createEClass(SSA_CALL);
		createEReference(ssaCallEClass, SSA_CALL__ARGUMENTS);
		createEReference(ssaCallEClass, SSA_CALL__FUNCTION);

		ssaPhiEClass = createEClass(SSA_PHI);
		createEReference(ssaPhiEClass, SSA_PHI__PREVIOUS);

		ssaParamEClass = createEClass(SSA_PARAM);
		createEAttribute(ssaParamEClass, SSA_PARAM__DIRECTION);

		ssaReturnEClass = createEClass(SSA_RETURN);
		createEReference(ssaReturnEClass, SSA_RETURN__EXPRESSION);

		ssaCastEClass = createEClass(SSA_CAST);
		createEReference(ssaCastEClass, SSA_CAST__FROM);

		ssaConditionalJumpEClass = createEClass(SSA_CONDITIONAL_JUMP);
		createEReference(ssaConditionalJumpEClass, SSA_CONDITIONAL_JUMP__CONDITION);
		createEReference(ssaConditionalJumpEClass, SSA_CONDITIONAL_JUMP__THEN_BLOCK);
		createEReference(ssaConditionalJumpEClass, SSA_CONDITIONAL_JUMP__ELSE_BLOCK);

		ssaFunctionEClass = createEClass(SSA_FUNCTION);
		createEReference(ssaFunctionEClass, SSA_FUNCTION__PARAMETERS);
		createEReference(ssaFunctionEClass, SSA_FUNCTION__RETURN_TYPE);
		createEAttribute(ssaFunctionEClass, SSA_FUNCTION__VAR_ARG);

		ssaBlockEClass = createEClass(SSA_BLOCK);
		createEReference(ssaBlockEClass, SSA_BLOCK__NODES);
		createEReference(ssaBlockEClass, SSA_BLOCK__NAME_SCOPE);

		ssaStructReadEClass = createEClass(SSA_STRUCT_READ);
		createEReference(ssaStructReadEClass, SSA_STRUCT_READ__STRUCT);
		createEReference(ssaStructReadEClass, SSA_STRUCT_READ__FIELD);

		ssaStructWriteEClass = createEClass(SSA_STRUCT_WRITE);
		createEReference(ssaStructWriteEClass, SSA_STRUCT_WRITE__STRUCT);
		createEReference(ssaStructWriteEClass, SSA_STRUCT_WRITE__VALUE);
		createEReference(ssaStructWriteEClass, SSA_STRUCT_WRITE__FIELD);

		ssaArrayReadEClass = createEClass(SSA_ARRAY_READ);
		createEReference(ssaArrayReadEClass, SSA_ARRAY_READ__ARRAY);
		createEReference(ssaArrayReadEClass, SSA_ARRAY_READ__INDICES);

		ssaArrayWriteEClass = createEClass(SSA_ARRAY_WRITE);
		createEReference(ssaArrayWriteEClass, SSA_ARRAY_WRITE__ARRAY);
		createEReference(ssaArrayWriteEClass, SSA_ARRAY_WRITE__INDICES);
		createEReference(ssaArrayWriteEClass, SSA_ARRAY_WRITE__VALUE);

		filePositionEClass = createEClass(FILE_POSITION);
		createEAttribute(filePositionEClass, FILE_POSITION__NAME);
		createEAttribute(filePositionEClass, FILE_POSITION__LINE);
		createEAttribute(filePositionEClass, FILE_POSITION__START_POSITION_IN_LINE);
		createEAttribute(filePositionEClass, FILE_POSITION__END_POSITION_IN_LINE);
		createEAttribute(filePositionEClass, FILE_POSITION__START_POSITION);
		createEAttribute(filePositionEClass, FILE_POSITION__END_POSITION);

		ssaVarEClass = createEClass(SSA_VAR);
		createEReference(ssaVarEClass, SSA_VAR__TYPE);
		createEReference(ssaVarEClass, SSA_VAR__INIT_NODE);
		createEAttribute(ssaVarEClass, SSA_VAR__ORIGIN);

		cNameScopeEClass = createEClass(CNAME_SCOPE);
		createEReference(cNameScopeEClass, CNAME_SCOPE__PARENT);
		createEReference(cNameScopeEClass, CNAME_SCOPE__NAMES);
		createEReference(cNameScopeEClass, CNAME_SCOPE__VARS);
		createEReference(cNameScopeEClass, CNAME_SCOPE__TYPES);
		createEReference(cNameScopeEClass, CNAME_SCOPE__CONSTANTS);

		stringToCNameMapEClass = createEClass(STRING_TO_CNAME_MAP);
		createEAttribute(stringToCNameMapEClass, STRING_TO_CNAME_MAP__KEY);
		createEReference(stringToCNameMapEClass, STRING_TO_CNAME_MAP__VALUE);

		ssaExplicitCastEClass = createEClass(SSA_EXPLICIT_CAST);
		createEReference(ssaExplicitCastEClass, SSA_EXPLICIT_CAST__TO);

		memberEClass = createEClass(MEMBER);

		ssaDowhileEClass = createEClass(SSA_DOWHILE);
		createEReference(ssaDowhileEClass, SSA_DOWHILE__BODY);
		createEReference(ssaDowhileEClass, SSA_DOWHILE__COND);
		createEReference(ssaDowhileEClass, SSA_DOWHILE__MERGE);
		createEAttribute(ssaDowhileEClass, SSA_DOWHILE__LOOP_TYPE);
		createEReference(ssaDowhileEClass, SSA_DOWHILE__COND_NODE);
		createEAttribute(ssaDowhileEClass, SSA_DOWHILE__DOWHILE_TYPE);

		ssaSwitchEClass = createEClass(SSA_SWITCH);
		createEReference(ssaSwitchEClass, SSA_SWITCH__SELECTOR);
		createEReference(ssaSwitchEClass, SSA_SWITCH__CASES);
		createEReference(ssaSwitchEClass, SSA_SWITCH__MERGE);
		createEReference(ssaSwitchEClass, SSA_SWITCH__DEFAULT);
		createEAttribute(ssaSwitchEClass, SSA_SWITCH__SWITCH_TYPE);

		ssaCaseEClass = createEClass(SSA_CASE);
		createEReference(ssaCaseEClass, SSA_CASE__NODE);
		createEReference(ssaCaseEClass, SSA_CASE__VALUES);

		ssaControlEClass = createEClass(SSA_CONTROL);
		createEAttribute(ssaControlEClass, SSA_CONTROL__CONTROL_TYPE);

		ssaAbstractInitEClass = createEClass(SSA_ABSTRACT_INIT);

		ssaInitListEClass = createEClass(SSA_INIT_LIST);
		createEReference(ssaInitListEClass, SSA_INIT_LIST__INITS);

		ssaInitEClass = createEClass(SSA_INIT);
		createEReference(ssaInitEClass, SSA_INIT__VALUE);

		functionTypeEClass = createEClass(FUNCTION_TYPE);
		createEReference(functionTypeEClass, FUNCTION_TYPE__RETURN_TYPE);
		createEReference(functionTypeEClass, FUNCTION_TYPE__PARAM_TYPES);

		ssaIndirectWriteEClass = createEClass(SSA_INDIRECT_WRITE);
		createEReference(ssaIndirectWriteEClass, SSA_INDIRECT_WRITE__POINTER);
		createEReference(ssaIndirectWriteEClass, SSA_INDIRECT_WRITE__VALUE);

		ssaIndirectReadEClass = createEClass(SSA_INDIRECT_READ);
		createEReference(ssaIndirectReadEClass, SSA_INDIRECT_READ__POINTER);

		ssaNodeRefEClass = createEClass(SSA_NODE_REF);
		createEReference(ssaNodeRefEClass, SSA_NODE_REF__NODE);
		createEReference(ssaNodeRefEClass, SSA_NODE_REF__FILEPOSITION);

		ssaGotoEClass = createEClass(SSA_GOTO);
		createEReference(ssaGotoEClass, SSA_GOTO__LABEL);

		ssaLabelEClass = createEClass(SSA_LABEL);

		ssaPassByRefArgumentEClass = createEClass(SSA_PASS_BY_REF_ARGUMENT);
		createEReference(ssaPassByRefArgumentEClass, SSA_PASS_BY_REF_ARGUMENT__OUT_NODE);

		ssaArgumentEClass = createEClass(SSA_ARGUMENT);
		createEReference(ssaArgumentEClass, SSA_ARGUMENT__PARAM);

		ssaPassByRefParamEClass = createEClass(SSA_PASS_BY_REF_PARAM);
		createEReference(ssaPassByRefParamEClass, SSA_PASS_BY_REF_PARAM__OUT_NODE);

		ssaOutputArgumentEClass = createEClass(SSA_OUTPUT_ARGUMENT);

		ssaObjectEClass = createEClass(SSA_OBJECT);
		createEAttribute(ssaObjectEClass, SSA_OBJECT__NAME);
		createEAttribute(ssaObjectEClass, SSA_OBJECT__COMMENT);
		createEReference(ssaObjectEClass, SSA_OBJECT__FILEPOSITION);

		ssaSizeofEClass = createEClass(SSA_SIZEOF);

		ssaSizeofTypeEClass = createEClass(SSA_SIZEOF_TYPE);
		createEReference(ssaSizeofTypeEClass, SSA_SIZEOF_TYPE__SIZEOF_TYPE);

		ssaSizeofVarEClass = createEClass(SSA_SIZEOF_VAR);
		createEReference(ssaSizeofVarEClass, SSA_SIZEOF_VAR__SIZEOF_EXPR);

		compileTimeExpressionEClass = createEClass(COMPILE_TIME_EXPRESSION);
		createEAttribute(compileTimeExpressionEClass, COMPILE_TIME_EXPRESSION__VALUE);
		createEReference(compileTimeExpressionEClass, COMPILE_TIME_EXPRESSION__NODE);

		// Create enums
		ssaBinaryOperatorKindEEnum = createEEnum(SSA_BINARY_OPERATOR_KIND);
		ssaUnaryOperatorKindEEnum = createEEnum(SSA_UNARY_OPERATOR_KIND);
		containerTypeEEnum = createEEnum(CONTAINER_TYPE);
		loopTypeEEnum = createEEnum(LOOP_TYPE);
		controlTypeEEnum = createEEnum(CONTROL_TYPE);
		paramDirectionEEnum = createEEnum(PARAM_DIRECTION);
		switchTypeEEnum = createEEnum(SWITCH_TYPE);
		dowhileTypeEEnum = createEEnum(DOWHILE_TYPE);
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
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		typeEClass.getESuperTypes().add(this.getSsaObject());
		primitiveTypeEClass.getESuperTypes().add(this.getType());
		enumEClass.getESuperTypes().add(this.getType());
		structEClass.getESuperTypes().add(this.getType());
		unionEClass.getESuperTypes().add(this.getStruct());
		referenceTypeEClass.getESuperTypes().add(this.getType());
		enumMemberEClass.getESuperTypes().add(this.getMember());
		structMemberEClass.getESuperTypes().add(this.getMember());
		structBitfieldMemberEClass.getESuperTypes().add(this.getStructMember());
		pointerTypeEClass.getESuperTypes().add(this.getReferenceType());
		arrayTypeEClass.getESuperTypes().add(this.getReferenceType());
		ssaNodeEClass.getESuperTypes().add(this.getSsaObject());
		ssaAssignEClass.getESuperTypes().add(this.getSsaNode());
		ssaConstEClass.getESuperTypes().add(this.getSsaNode());
		ssaBinaryOperatorEClass.getESuperTypes().add(this.getSsaNode());
		ssaUnaryOperatorEClass.getESuperTypes().add(this.getSsaNode());
		ssaCallEClass.getESuperTypes().add(this.getSsaNode());
		ssaPhiEClass.getESuperTypes().add(this.getSsaNode());
		ssaParamEClass.getESuperTypes().add(this.getSsaNode());
		ssaReturnEClass.getESuperTypes().add(this.getSsaNode());
		ssaCastEClass.getESuperTypes().add(this.getSsaNode());
		ssaConditionalJumpEClass.getESuperTypes().add(this.getSsaNode());
		ssaFunctionEClass.getESuperTypes().add(this.getSsaBlock());
		ssaBlockEClass.getESuperTypes().add(this.getSsaNode());
		ssaStructReadEClass.getESuperTypes().add(this.getSsaNode());
		ssaStructWriteEClass.getESuperTypes().add(this.getSsaNode());
		ssaArrayReadEClass.getESuperTypes().add(this.getSsaNode());
		ssaArrayWriteEClass.getESuperTypes().add(this.getSsaNode());
		ssaVarEClass.getESuperTypes().add(this.getSsaObject());
		ssaExplicitCastEClass.getESuperTypes().add(this.getSsaCast());
		memberEClass.getESuperTypes().add(this.getSsaObject());
		ssaDowhileEClass.getESuperTypes().add(this.getSsaNode());
		ssaSwitchEClass.getESuperTypes().add(this.getSsaNode());
		ssaCaseEClass.getESuperTypes().add(this.getSsaObject());
		ssaControlEClass.getESuperTypes().add(this.getSsaNode());
		ssaAbstractInitEClass.getESuperTypes().add(this.getSsaNode());
		ssaInitListEClass.getESuperTypes().add(this.getSsaAbstractInit());
		ssaInitEClass.getESuperTypes().add(this.getSsaAbstractInit());
		functionTypeEClass.getESuperTypes().add(this.getType());
		ssaIndirectWriteEClass.getESuperTypes().add(this.getSsaNode());
		ssaIndirectReadEClass.getESuperTypes().add(this.getSsaNode());
		ssaGotoEClass.getESuperTypes().add(this.getSsaNode());
		ssaLabelEClass.getESuperTypes().add(this.getSsaNode());
		ssaPassByRefArgumentEClass.getESuperTypes().add(this.getSsaArgument());
		ssaArgumentEClass.getESuperTypes().add(this.getSsaNodeRef());
		ssaPassByRefParamEClass.getESuperTypes().add(this.getSsaParam());
		ssaOutputArgumentEClass.getESuperTypes().add(this.getSsaNode());
		ssaSizeofEClass.getESuperTypes().add(this.getSsaNode());
		ssaSizeofTypeEClass.getESuperTypes().add(this.getSsaSizeof());
		ssaSizeofVarEClass.getESuperTypes().add(this.getSsaSizeof());
		compileTimeExpressionEClass.getESuperTypes().add(this.getSsaObject());

		// Initialize classes, features, and operations; add parameters
		initEClass(typeEClass, Type.class, "Type", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getType_Size(), theEcorePackage.getEInt(), "size", null, 0, 1, Type.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primitiveTypeEClass, PrimitiveType.class, "PrimitiveType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(enumEClass, hu.metadom.hls.ssamodel.Enum.class, "Enum", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnum_Members(), this.getEnumMember(), null, "members", null, 0, -1,
				hu.metadom.hls.ssamodel.Enum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structEClass, Struct.class, "Struct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStruct_Members(), this.getStructMember(), null, "members", null, 0, -1, Struct.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unionEClass, Union.class, "Union", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(referenceTypeEClass, ReferenceType.class, "ReferenceType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferenceType_ReferencedType(), this.getType(), null, "referencedType", null, 1, 1,
				ReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerEClass, hu.metadom.hls.ssamodel.Container.class, "Container", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainer_ChildContainers(), this.getContainer(), null, "childContainers", null, 0, -1,
				hu.metadom.hls.ssamodel.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Name(), theEcorePackage.getEString(), "name", null, 0, 1,
				hu.metadom.hls.ssamodel.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainer_Functions(), this.getSsaFunction(), null, "functions", null, 0, -1,
				hu.metadom.hls.ssamodel.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Type(), this.getContainerType(), "type", "CUSTOM", 0, 1,
				hu.metadom.hls.ssamodel.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainer_GlobalBlock(), this.getSsaBlock(), null, "globalBlock", null, 0, 1,
				hu.metadom.hls.ssamodel.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumMemberEClass, EnumMember.class, "EnumMember", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumMember_Const(), this.getSsaConst(), null, "const", null, 0, 1, EnumMember.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnumMember_ValueNode(), this.getSsaNode(), null, "valueNode", null, 0, 1, EnumMember.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structMemberEClass, StructMember.class, "StructMember", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructMember_Type(), this.getType(), null, "type", null, 1, 1, StructMember.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structBitfieldMemberEClass, StructBitfieldMember.class, "StructBitfieldMember", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructBitfieldMember_BitfieldValue(), this.getCompileTimeExpression(), null, "bitfieldValue",
				null, 0, 1, StructBitfieldMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pointerTypeEClass, PointerType.class, "PointerType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(arrayTypeEClass, ArrayType.class, "ArrayType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArrayType_Length(), this.getCompileTimeExpression(), null, "length", null, 0, 1,
				ArrayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ssaNodeEClass, SsaNode.class, "SsaNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSsaNode_Type(), this.getType(), null, "type", null, 0, 1, SsaNode.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getSsaNode_Parent(), this.getSsaBlock(), this.getSsaBlock_Nodes(), "parent", null, 0, 1,
				SsaNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSsaNode_Var(), this.getSsaVar(), null, "var", null, 0, 1, SsaNode.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getSsaNode_SsaIndex(), theEcorePackage.getEInt(), "ssaIndex", null, 0, 1, SsaNode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getSsaNode_Origin(), theEcorePackage.getEString(), "origin", null, 0, 1, SsaNode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getSsaNode_Gid(), theEcorePackage.getEInt(), "gid", null, 0, 1, SsaNode.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ssaAssignEClass, SsaAssign.class, "SsaAssign", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSsaAssign_Value(), this.getSsaNode(), null, "value", null, 0, 1, SsaAssign.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ssaConstEClass, SsaConst.class, "SsaConst", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSsaConst_Value(), theEcorePackage.getEString(), "value", null, 0, 1, SsaConst.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(ssaBinaryOperatorEClass, SsaBinaryOperator.class, "SsaBinaryOperator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSsaBinaryOperator_OperatorKind(), this.getSsaBinaryOperatorKind(), "operatorKind", null, 0, 1,
				SsaBinaryOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getSsaBinaryOperator_Left(), this.getSsaNode(), null, "left", null, 0, 1,
				SsaBinaryOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSsaBinaryOperator_Right(), this.getSsaNode(), null, "right", null, 0, 1,
				SsaBinaryOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ssaUnaryOperatorEClass, SsaUnaryOperator.class, "SsaUnaryOperator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSsaUnaryOperator_OperatorKind(), this.getSsaUnaryOperatorKind(), "operatorKind", null, 0, 1,
				SsaUnaryOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getSsaUnaryOperator_Operand(), this.getSsaNode(), null, "operand", null, 0, 1,
				SsaUnaryOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ssaCallEClass, SsaCall.class, "SsaCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSsaCall_Arguments(), this.getSsaArgument(), null, "arguments", null, 0, -1, SsaCall.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSsaCall_Function(), this.getSsaNode(), null, "function", null, 0, 1, SsaCall.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ssaPhiEClass, SsaPhi.class, "SsaPhi", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSsaPhi_Previous(), this.getSsaNodeRef(), null, "previous", null, 0, -1, SsaPhi.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ssaParamEClass, SsaParam.class, "SsaParam", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSsaParam_Direction(), this.getParamDirection(), "direction", "NONE", 0, 1, SsaParam.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(ssaReturnEClass, SsaReturn.class, "SsaReturn", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSsaReturn_Expression(), this.getSsaNode(), null, "expression", null, 0, 1, SsaReturn.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ssaCastEClass, SsaCast.class, "SsaCast", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSsaCast_From(), this.getSsaNode(), null, "from", null, 0, 1, SsaCast.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(ssaConditionalJumpEClass, SsaConditionalJump.class, "SsaConditionalJump", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSsaConditionalJump_Condition(), this.getSsaNode(), null, "condition", null, 0, 1,
				SsaConditionalJump.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSsaConditionalJump_ThenBlock(), this.getSsaBlock(), null, "thenBlock", null, 0, 1,
				SsaConditionalJump.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSsaConditionalJump_ElseBlock(), this.getSsaBlock(), null, "elseBlock", null, 0, 1,
				SsaConditionalJump.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ssaFunctionEClass, SsaFunction.class, "SsaFunction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSsaFunction_Parameters(), this.getSsaParam(), null, "parameters", null, 0, -1,
				SsaFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSsaFunction_ReturnType(), this.getType(), null, "returnType", null, 0, 1, SsaFunction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSsaFunction_VarArg(), theEcorePackage.getEBoolean(), "varArg", null, 0, 1, SsaFunction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(ssaBlockEClass, SsaBlock.class, "SsaBlock", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSsaBlock_Nodes(), this.getSsaNode(), this.getSsaNode_Parent(), "nodes", null, 0, -1,
				SsaBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSsaBlock_NameScope(), this.getCNameScope(), null, "nameScope", null, 0, 1, SsaBlock.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ssaStructReadEClass, SsaStructRead.class, "SsaStructRead", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSsaStructRead_Struct(), this.getSsaNode(), null, "struct", null, 0, 1, SsaStructRead.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSsaStructRead_Field(), this.getStructMember(), null, "field", null, 0, 1, SsaStructRead.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ssaStructWriteEClass, SsaStructWrite.class, "SsaStructWrite", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSsaStructWrite_Struct(), this.getSsaNode(), null, "struct", null, 0, 1, SsaStructWrite.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSsaStructWrite_Value(), this.getSsaNode(), null, "value", null, 0, 1, SsaStructWrite.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSsaStructWrite_Field(), this.getStructMember(), null, "field", null, 0, 1,
				SsaStructWrite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ssaArrayReadEClass, SsaArrayRead.class, "SsaArrayRead", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSsaArrayRead_Array(), this.getSsaNode(), null, "array", null, 0, 1, SsaArrayRead.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSsaArrayRead_Indices(), this.getSsaNodeRef(), null, "indices", null, 0, -1,
				SsaArrayRead.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ssaArrayWriteEClass, SsaArrayWrite.class, "SsaArrayWrite", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSsaArrayWrite_Array(), this.getSsaNode(), null, "array", null, 0, 1, SsaArrayWrite.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSsaArrayWrite_Indices(), this.getSsaNodeRef(), null, "indices", null, 0, -1,
				SsaArrayWrite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSsaArrayWrite_Value(), this.getSsaNode(), null, "value", null, 0, 1, SsaArrayWrite.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(filePositionEClass, FilePosition.class, "FilePosition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFilePosition_Name(), theEcorePackage.getEString(), "name", null, 0, 1, FilePosition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getFilePosition_Line(), theEcorePackage.getEInt(), "line", null, 0, 1, FilePosition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getFilePosition_StartPositionInLine(), theEcorePackage.getEInt(), "startPositionInLine", null, 0,
				1, FilePosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getFilePosition_EndPositionInLine(), theEcorePackage.getEInt(), "endPositionInLine", null, 0, 1,
				FilePosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getFilePosition_StartPosition(), theEcorePackage.getEInt(), "startPosition", null, 0, 1,
				FilePosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getFilePosition_EndPosition(), theEcorePackage.getEInt(), "endPosition", null, 0, 1,
				FilePosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(ssaVarEClass, SsaVar.class, "SsaVar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSsaVar_Type(), this.getType(), null, "type", null, 0, 1, SsaVar.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getSsaVar_InitNode(), this.getSsaNode(), null, "initNode", null, 0, 1, SsaVar.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSsaVar_Origin(), theEcorePackage.getEString(), "origin", null, 0, 1, SsaVar.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(cNameScopeEClass, CNameScope.class, "CNameScope", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCNameScope_Parent(), this.getCNameScope(), null, "parent", null, 0, 1, CNameScope.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCNameScope_Names(), this.getStringToCNameMap(), null, "names", null, 0, -1, CNameScope.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCNameScope_Vars(), this.getSsaVar(), null, "vars", null, 0, -1, CNameScope.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCNameScope_Types(), this.getType(), null, "types", null, 0, -1, CNameScope.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCNameScope_Constants(), this.getSsaConst(), null, "constants", null, 0, -1, CNameScope.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringToCNameMapEClass, Map.Entry.class, "StringToCNameMap", !IS_ABSTRACT, !IS_INTERFACE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringToCNameMap_Key(), theEcorePackage.getEString(), "key", null, 0, 1, Map.Entry.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getStringToCNameMap_Value(), this.getSsaVar(), null, "value", null, 0, 1, Map.Entry.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ssaExplicitCastEClass, SsaExplicitCast.class, "SsaExplicitCast", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSsaExplicitCast_To(), this.getType(), null, "to", null, 0, 1, SsaExplicitCast.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memberEClass, Member.class, "Member", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ssaDowhileEClass, SsaDowhile.class, "SsaDowhile", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSsaDowhile_Body(), this.getSsaNode(), null, "body", null, 0, 1, SsaDowhile.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSsaDowhile_Cond(), this.getSsaNode(), null, "cond", null, 0, 1, SsaDowhile.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSsaDowhile_Merge(), this.getSsaNode(), null, "merge", null, 0, 1, SsaDowhile.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSsaDowhile_LoopType(), this.getLoopType(), "loopType", "TOPTEST", 0, 1, SsaDowhile.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getSsaDowhile_CondNode(), this.getSsaNode(), null, "condNode", null, 0, 1, SsaDowhile.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSsaDowhile_DowhileType(), this.getDowhileType(), "dowhileType", "WHILE", 0, 1,
				SsaDowhile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(ssaSwitchEClass, SsaSwitch.class, "SsaSwitch", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSsaSwitch_Selector(), this.getSsaNode(), null, "selector", null, 0, 1, SsaSwitch.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSsaSwitch_Cases(), this.getSsaCase(), null, "cases", null, 0, -1, SsaSwitch.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSsaSwitch_Merge(), this.getSsaNode(), null, "merge", null, 0, 1, SsaSwitch.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSsaSwitch_Default(), this.getSsaNode(), null, "default", null, 0, 1, SsaSwitch.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSsaSwitch_SwitchType(), this.getSwitchType(), "switchType", "SWITCH", 0, 1, SsaSwitch.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(ssaCaseEClass, SsaCase.class, "SsaCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSsaCase_Node(), this.getSsaNode(), null, "node", null, 0, 1, SsaCase.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getSsaCase_Values(), this.getCompileTimeExpression(), null, "values", null, 0, -1, SsaCase.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ssaControlEClass, SsaControl.class, "SsaControl", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSsaControl_ControlType(), this.getControlType(), "controlType", null, 0, 1, SsaControl.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(ssaAbstractInitEClass, SsaAbstractInit.class, "SsaAbstractInit", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(ssaInitListEClass, SsaInitList.class, "SsaInitList", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSsaInitList_Inits(), this.getSsaAbstractInit(), null, "inits", null, 0, -1, SsaInitList.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ssaInitEClass, SsaInit.class, "SsaInit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSsaInit_Value(), this.getSsaNode(), null, "value", null, 0, 1, SsaInit.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(functionTypeEClass, FunctionType.class, "FunctionType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionType_ReturnType(), this.getType(), null, "returnType", null, 0, 1, FunctionType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionType_ParamTypes(), this.getType(), null, "paramTypes", null, 0, -1,
				FunctionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ssaIndirectWriteEClass, SsaIndirectWrite.class, "SsaIndirectWrite", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSsaIndirectWrite_Pointer(), this.getSsaNode(), null, "pointer", null, 0, 1,
				SsaIndirectWrite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSsaIndirectWrite_Value(), this.getSsaNode(), null, "value", null, 0, 1,
				SsaIndirectWrite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ssaIndirectReadEClass, SsaIndirectRead.class, "SsaIndirectRead", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSsaIndirectRead_Pointer(), this.getSsaNode(), null, "pointer", null, 0, 1,
				SsaIndirectRead.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ssaNodeRefEClass, SsaNodeRef.class, "SsaNodeRef", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSsaNodeRef_Node(), this.getSsaNode(), null, "node", null, 0, 1, SsaNodeRef.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSsaNodeRef_Fileposition(), this.getFilePosition(), null, "fileposition", null, 0, 1,
				SsaNodeRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ssaGotoEClass, SsaGoto.class, "SsaGoto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSsaGoto_Label(), this.getSsaLabel(), null, "label", null, 0, 1, SsaGoto.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(ssaLabelEClass, SsaLabel.class, "SsaLabel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(ssaPassByRefArgumentEClass, SsaPassByRefArgument.class, "SsaPassByRefArgument", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSsaPassByRefArgument_OutNode(), this.getSsaOutputArgument(), null, "outNode", null, 0, 1,
				SsaPassByRefArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ssaArgumentEClass, SsaArgument.class, "SsaArgument", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSsaArgument_Param(), this.getSsaParam(), null, "param", null, 0, 1, SsaArgument.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ssaPassByRefParamEClass, SsaPassByRefParam.class, "SsaPassByRefParam", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSsaPassByRefParam_OutNode(), this.getSsaNode(), null, "outNode", null, 0, 1,
				SsaPassByRefParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ssaOutputArgumentEClass, SsaOutputArgument.class, "SsaOutputArgument", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(ssaObjectEClass, SsaObject.class, "SsaObject", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSsaObject_Name(), theEcorePackage.getEString(), "name", null, 0, 1, SsaObject.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getSsaObject_Comment(), theEcorePackage.getEString(), "comment", null, 0, 1, SsaObject.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getSsaObject_Fileposition(), this.getFilePosition(), null, "fileposition", null, 0, 1,
				SsaObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ssaSizeofEClass, SsaSizeof.class, "SsaSizeof", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(ssaSizeofTypeEClass, SsaSizeofType.class, "SsaSizeofType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSsaSizeofType_SizeofType(), this.getType(), null, "sizeofType", null, 0, 1,
				SsaSizeofType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ssaSizeofVarEClass, SsaSizeofVar.class, "SsaSizeofVar", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSsaSizeofVar_SizeofExpr(), this.getSsaNode(), null, "sizeofExpr", null, 0, 1,
				SsaSizeofVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compileTimeExpressionEClass, CompileTimeExpression.class, "CompileTimeExpression", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompileTimeExpression_Value(), theEcorePackage.getEBigInteger(), "value", null, 0, 1,
				CompileTimeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				!IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompileTimeExpression_Node(), this.getSsaNode(), null, "node", null, 0, 1,
				CompileTimeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(ssaBinaryOperatorKindEEnum, SsaBinaryOperatorKind.class, "SsaBinaryOperatorKind");
		addEEnumLiteral(ssaBinaryOperatorKindEEnum, SsaBinaryOperatorKind.MULTIPLY);
		addEEnumLiteral(ssaBinaryOperatorKindEEnum, SsaBinaryOperatorKind.DIVIDE);
		addEEnumLiteral(ssaBinaryOperatorKindEEnum, SsaBinaryOperatorKind.MODULO);
		addEEnumLiteral(ssaBinaryOperatorKindEEnum, SsaBinaryOperatorKind.ADD);
		addEEnumLiteral(ssaBinaryOperatorKindEEnum, SsaBinaryOperatorKind.SUBTRACT);
		addEEnumLiteral(ssaBinaryOperatorKindEEnum, SsaBinaryOperatorKind.LEFT_SHIFT);
		addEEnumLiteral(ssaBinaryOperatorKindEEnum, SsaBinaryOperatorKind.RIGHT_SHIFT);
		addEEnumLiteral(ssaBinaryOperatorKindEEnum, SsaBinaryOperatorKind.LESS);
		addEEnumLiteral(ssaBinaryOperatorKindEEnum, SsaBinaryOperatorKind.GREATER);
		addEEnumLiteral(ssaBinaryOperatorKindEEnum, SsaBinaryOperatorKind.LESS_EQUAL);
		addEEnumLiteral(ssaBinaryOperatorKindEEnum, SsaBinaryOperatorKind.GREATER_EQUAL);
		addEEnumLiteral(ssaBinaryOperatorKindEEnum, SsaBinaryOperatorKind.EQUAL);
		addEEnumLiteral(ssaBinaryOperatorKindEEnum, SsaBinaryOperatorKind.NOT_EQUAL);
		addEEnumLiteral(ssaBinaryOperatorKindEEnum, SsaBinaryOperatorKind.BIT_AND);
		addEEnumLiteral(ssaBinaryOperatorKindEEnum, SsaBinaryOperatorKind.BIT_XOR);
		addEEnumLiteral(ssaBinaryOperatorKindEEnum, SsaBinaryOperatorKind.BIT_OR);
		addEEnumLiteral(ssaBinaryOperatorKindEEnum, SsaBinaryOperatorKind.LOGIC_AND);
		addEEnumLiteral(ssaBinaryOperatorKindEEnum, SsaBinaryOperatorKind.LOGIC_OR);

		initEEnum(ssaUnaryOperatorKindEEnum, SsaUnaryOperatorKind.class, "SsaUnaryOperatorKind");
		addEEnumLiteral(ssaUnaryOperatorKindEEnum, SsaUnaryOperatorKind.ADDRESS);
		addEEnumLiteral(ssaUnaryOperatorKindEEnum, SsaUnaryOperatorKind.INDIRECTION);
		addEEnumLiteral(ssaUnaryOperatorKindEEnum, SsaUnaryOperatorKind.POSITIVE);
		addEEnumLiteral(ssaUnaryOperatorKindEEnum, SsaUnaryOperatorKind.NEGATIVE);
		addEEnumLiteral(ssaUnaryOperatorKindEEnum, SsaUnaryOperatorKind.COMPLEMENT);
		addEEnumLiteral(ssaUnaryOperatorKindEEnum, SsaUnaryOperatorKind.NEGATION);

		initEEnum(containerTypeEEnum, ContainerType.class, "ContainerType");
		addEEnumLiteral(containerTypeEEnum, ContainerType.DIRECTORY);
		addEEnumLiteral(containerTypeEEnum, ContainerType.FILE);
		addEEnumLiteral(containerTypeEEnum, ContainerType.NAMESPACE);
		addEEnumLiteral(containerTypeEEnum, ContainerType.CUSTOM);

		initEEnum(loopTypeEEnum, LoopType.class, "LoopType");
		addEEnumLiteral(loopTypeEEnum, LoopType.TOPTEST);
		addEEnumLiteral(loopTypeEEnum, LoopType.BOTTOMTEST);

		initEEnum(controlTypeEEnum, ControlType.class, "ControlType");
		addEEnumLiteral(controlTypeEEnum, ControlType.BREAK);
		addEEnumLiteral(controlTypeEEnum, ControlType.CONTINUE);

		initEEnum(paramDirectionEEnum, ParamDirection.class, "ParamDirection");
		addEEnumLiteral(paramDirectionEEnum, ParamDirection.IN);
		addEEnumLiteral(paramDirectionEEnum, ParamDirection.OUT);
		addEEnumLiteral(paramDirectionEEnum, ParamDirection.INOUT);
		addEEnumLiteral(paramDirectionEEnum, ParamDirection.NONE);

		initEEnum(switchTypeEEnum, SwitchType.class, "SwitchType");
		addEEnumLiteral(switchTypeEEnum, SwitchType.IF);
		addEEnumLiteral(switchTypeEEnum, SwitchType.SWITCH);
		addEEnumLiteral(switchTypeEEnum, SwitchType.CONDOP);
		addEEnumLiteral(switchTypeEEnum, SwitchType.LOGICAND);
		addEEnumLiteral(switchTypeEEnum, SwitchType.LOGICOR);

		initEEnum(dowhileTypeEEnum, DowhileType.class, "DowhileType");
		addEEnumLiteral(dowhileTypeEEnum, DowhileType.WHILE);
		addEEnumLiteral(dowhileTypeEEnum, DowhileType.DOWHILE);
		addEEnumLiteral(dowhileTypeEEnum, DowhileType.FOR);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2011/Xcore
		createXcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";
		addAnnotation(this, source, new String[] { "ecore", "http://www.eclipse.org/emf/2002/Ecore" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2011/Xcore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createXcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2011/Xcore";
		addAnnotation(this, source, new String[] { "Import", "http://www.eclipse.org/OCL/Import" });
	}

} //SsaModelPackageImpl
