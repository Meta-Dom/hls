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
import hu.metadom.hls.ssamodel.ParamDirection;
import hu.metadom.hls.ssamodel.PointerType;
import hu.metadom.hls.ssamodel.PrimitiveType;
import hu.metadom.hls.ssamodel.ReferenceType;
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
import hu.metadom.hls.ssamodel.SsaNodeRef;
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
import hu.metadom.hls.ssamodel.Union;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class SsaModelFactoryImpl extends EFactoryImpl implements SsaModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SsaModelFactory init() {
		try {
			SsaModelFactory theSsaModelFactory = (SsaModelFactory) EPackage.Registry.INSTANCE
					.getEFactory(SsaModelPackage.eNS_URI);
			if (theSsaModelFactory != null) {
				return theSsaModelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SsaModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaModelFactoryImpl() {
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
		case SsaModelPackage.PRIMITIVE_TYPE:
			return createPrimitiveType();
		case SsaModelPackage.ENUM:
			return createEnum();
		case SsaModelPackage.STRUCT:
			return createStruct();
		case SsaModelPackage.UNION:
			return createUnion();
		case SsaModelPackage.REFERENCE_TYPE:
			return createReferenceType();
		case SsaModelPackage.CONTAINER:
			return createContainer();
		case SsaModelPackage.ENUM_MEMBER:
			return createEnumMember();
		case SsaModelPackage.STRUCT_MEMBER:
			return createStructMember();
		case SsaModelPackage.STRUCT_BITFIELD_MEMBER:
			return createStructBitfieldMember();
		case SsaModelPackage.POINTER_TYPE:
			return createPointerType();
		case SsaModelPackage.ARRAY_TYPE:
			return createArrayType();
		case SsaModelPackage.SSA_ASSIGN:
			return createSsaAssign();
		case SsaModelPackage.SSA_CONST:
			return createSsaConst();
		case SsaModelPackage.SSA_BINARY_OPERATOR:
			return createSsaBinaryOperator();
		case SsaModelPackage.SSA_UNARY_OPERATOR:
			return createSsaUnaryOperator();
		case SsaModelPackage.SSA_CALL:
			return createSsaCall();
		case SsaModelPackage.SSA_PHI:
			return createSsaPhi();
		case SsaModelPackage.SSA_PARAM:
			return createSsaParam();
		case SsaModelPackage.SSA_RETURN:
			return createSsaReturn();
		case SsaModelPackage.SSA_CAST:
			return createSsaCast();
		case SsaModelPackage.SSA_CONDITIONAL_JUMP:
			return createSsaConditionalJump();
		case SsaModelPackage.SSA_FUNCTION:
			return createSsaFunction();
		case SsaModelPackage.SSA_BLOCK:
			return createSsaBlock();
		case SsaModelPackage.SSA_STRUCT_READ:
			return createSsaStructRead();
		case SsaModelPackage.SSA_STRUCT_WRITE:
			return createSsaStructWrite();
		case SsaModelPackage.SSA_ARRAY_READ:
			return createSsaArrayRead();
		case SsaModelPackage.SSA_ARRAY_WRITE:
			return createSsaArrayWrite();
		case SsaModelPackage.FILE_POSITION:
			return createFilePosition();
		case SsaModelPackage.SSA_VAR:
			return createSsaVar();
		case SsaModelPackage.CNAME_SCOPE:
			return createCNameScope();
		case SsaModelPackage.STRING_TO_CNAME_MAP:
			return (EObject) createStringToCNameMap();
		case SsaModelPackage.SSA_EXPLICIT_CAST:
			return createSsaExplicitCast();
		case SsaModelPackage.SSA_DOWHILE:
			return createSsaDowhile();
		case SsaModelPackage.SSA_SWITCH:
			return createSsaSwitch();
		case SsaModelPackage.SSA_CASE:
			return createSsaCase();
		case SsaModelPackage.SSA_CONTROL:
			return createSsaControl();
		case SsaModelPackage.SSA_INIT_LIST:
			return createSsaInitList();
		case SsaModelPackage.SSA_INIT:
			return createSsaInit();
		case SsaModelPackage.FUNCTION_TYPE:
			return createFunctionType();
		case SsaModelPackage.SSA_INDIRECT_WRITE:
			return createSsaIndirectWrite();
		case SsaModelPackage.SSA_INDIRECT_READ:
			return createSsaIndirectRead();
		case SsaModelPackage.SSA_NODE_REF:
			return createSsaNodeRef();
		case SsaModelPackage.SSA_GOTO:
			return createSsaGoto();
		case SsaModelPackage.SSA_LABEL:
			return createSsaLabel();
		case SsaModelPackage.SSA_PASS_BY_REF_ARGUMENT:
			return createSsaPassByRefArgument();
		case SsaModelPackage.SSA_ARGUMENT:
			return createSsaArgument();
		case SsaModelPackage.SSA_PASS_BY_REF_PARAM:
			return createSsaPassByRefParam();
		case SsaModelPackage.SSA_OUTPUT_ARGUMENT:
			return createSsaOutputArgument();
		case SsaModelPackage.SSA_SIZEOF:
			return createSsaSizeof();
		case SsaModelPackage.SSA_SIZEOF_TYPE:
			return createSsaSizeofType();
		case SsaModelPackage.SSA_SIZEOF_VAR:
			return createSsaSizeofVar();
		case SsaModelPackage.COMPILE_TIME_EXPRESSION:
			return createCompileTimeExpression();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case SsaModelPackage.SSA_BINARY_OPERATOR_KIND:
			return createSsaBinaryOperatorKindFromString(eDataType, initialValue);
		case SsaModelPackage.SSA_UNARY_OPERATOR_KIND:
			return createSsaUnaryOperatorKindFromString(eDataType, initialValue);
		case SsaModelPackage.CONTAINER_TYPE:
			return createContainerTypeFromString(eDataType, initialValue);
		case SsaModelPackage.LOOP_TYPE:
			return createLoopTypeFromString(eDataType, initialValue);
		case SsaModelPackage.CONTROL_TYPE:
			return createControlTypeFromString(eDataType, initialValue);
		case SsaModelPackage.PARAM_DIRECTION:
			return createParamDirectionFromString(eDataType, initialValue);
		case SsaModelPackage.SWITCH_TYPE:
			return createSwitchTypeFromString(eDataType, initialValue);
		case SsaModelPackage.DOWHILE_TYPE:
			return createDowhileTypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case SsaModelPackage.SSA_BINARY_OPERATOR_KIND:
			return convertSsaBinaryOperatorKindToString(eDataType, instanceValue);
		case SsaModelPackage.SSA_UNARY_OPERATOR_KIND:
			return convertSsaUnaryOperatorKindToString(eDataType, instanceValue);
		case SsaModelPackage.CONTAINER_TYPE:
			return convertContainerTypeToString(eDataType, instanceValue);
		case SsaModelPackage.LOOP_TYPE:
			return convertLoopTypeToString(eDataType, instanceValue);
		case SsaModelPackage.CONTROL_TYPE:
			return convertControlTypeToString(eDataType, instanceValue);
		case SsaModelPackage.PARAM_DIRECTION:
			return convertParamDirectionToString(eDataType, instanceValue);
		case SsaModelPackage.SWITCH_TYPE:
			return convertSwitchTypeToString(eDataType, instanceValue);
		case SsaModelPackage.DOWHILE_TYPE:
			return convertDowhileTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveType createPrimitiveType() {
		PrimitiveTypeImpl primitiveType = new PrimitiveTypeImpl();
		return primitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public hu.metadom.hls.ssamodel.Enum createEnum() {
		EnumImpl enum_ = new EnumImpl();
		return enum_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Struct createStruct() {
		StructImpl struct = new StructImpl();
		return struct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Union createUnion() {
		UnionImpl union = new UnionImpl();
		return union;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceType createReferenceType() {
		ReferenceTypeImpl referenceType = new ReferenceTypeImpl();
		return referenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public hu.metadom.hls.ssamodel.Container createContainer() {
		ContainerImpl container = new ContainerImpl();
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumMember createEnumMember() {
		EnumMemberImpl enumMember = new EnumMemberImpl();
		return enumMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructMember createStructMember() {
		StructMemberImpl structMember = new StructMemberImpl();
		return structMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructBitfieldMember createStructBitfieldMember() {
		StructBitfieldMemberImpl structBitfieldMember = new StructBitfieldMemberImpl();
		return structBitfieldMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointerType createPointerType() {
		PointerTypeImpl pointerType = new PointerTypeImpl();
		return pointerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayType createArrayType() {
		ArrayTypeImpl arrayType = new ArrayTypeImpl();
		return arrayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaAssign createSsaAssign() {
		SsaAssignImpl ssaAssign = new SsaAssignImpl();
		return ssaAssign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaConst createSsaConst() {
		SsaConstImpl ssaConst = new SsaConstImpl();
		return ssaConst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaBinaryOperator createSsaBinaryOperator() {
		SsaBinaryOperatorImpl ssaBinaryOperator = new SsaBinaryOperatorImpl();
		return ssaBinaryOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaUnaryOperator createSsaUnaryOperator() {
		SsaUnaryOperatorImpl ssaUnaryOperator = new SsaUnaryOperatorImpl();
		return ssaUnaryOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaCall createSsaCall() {
		SsaCallImpl ssaCall = new SsaCallImpl();
		return ssaCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaPhi createSsaPhi() {
		SsaPhiImpl ssaPhi = new SsaPhiImpl();
		return ssaPhi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaParam createSsaParam() {
		SsaParamImpl ssaParam = new SsaParamImpl();
		return ssaParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaReturn createSsaReturn() {
		SsaReturnImpl ssaReturn = new SsaReturnImpl();
		return ssaReturn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaCast createSsaCast() {
		SsaCastImpl ssaCast = new SsaCastImpl();
		return ssaCast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaConditionalJump createSsaConditionalJump() {
		SsaConditionalJumpImpl ssaConditionalJump = new SsaConditionalJumpImpl();
		return ssaConditionalJump;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaFunction createSsaFunction() {
		SsaFunctionImpl ssaFunction = new SsaFunctionImpl();
		return ssaFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaBlock createSsaBlock() {
		SsaBlockImpl ssaBlock = new SsaBlockImpl();
		return ssaBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaStructRead createSsaStructRead() {
		SsaStructReadImpl ssaStructRead = new SsaStructReadImpl();
		return ssaStructRead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaStructWrite createSsaStructWrite() {
		SsaStructWriteImpl ssaStructWrite = new SsaStructWriteImpl();
		return ssaStructWrite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaArrayRead createSsaArrayRead() {
		SsaArrayReadImpl ssaArrayRead = new SsaArrayReadImpl();
		return ssaArrayRead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaArrayWrite createSsaArrayWrite() {
		SsaArrayWriteImpl ssaArrayWrite = new SsaArrayWriteImpl();
		return ssaArrayWrite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilePosition createFilePosition() {
		FilePositionImpl filePosition = new FilePositionImpl();
		return filePosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaVar createSsaVar() {
		SsaVarImpl ssaVar = new SsaVarImpl();
		return ssaVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CNameScope createCNameScope() {
		CNameScopeImpl cNameScope = new CNameScopeImpl();
		return cNameScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, SsaVar> createStringToCNameMap() {
		StringToCNameMapImpl stringToCNameMap = new StringToCNameMapImpl();
		return stringToCNameMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaExplicitCast createSsaExplicitCast() {
		SsaExplicitCastImpl ssaExplicitCast = new SsaExplicitCastImpl();
		return ssaExplicitCast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaDowhile createSsaDowhile() {
		SsaDowhileImpl ssaDowhile = new SsaDowhileImpl();
		return ssaDowhile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaSwitch createSsaSwitch() {
		SsaSwitchImpl ssaSwitch = new SsaSwitchImpl();
		return ssaSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaCase createSsaCase() {
		SsaCaseImpl ssaCase = new SsaCaseImpl();
		return ssaCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaControl createSsaControl() {
		SsaControlImpl ssaControl = new SsaControlImpl();
		return ssaControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaInitList createSsaInitList() {
		SsaInitListImpl ssaInitList = new SsaInitListImpl();
		return ssaInitList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaInit createSsaInit() {
		SsaInitImpl ssaInit = new SsaInitImpl();
		return ssaInit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionType createFunctionType() {
		FunctionTypeImpl functionType = new FunctionTypeImpl();
		return functionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaIndirectWrite createSsaIndirectWrite() {
		SsaIndirectWriteImpl ssaIndirectWrite = new SsaIndirectWriteImpl();
		return ssaIndirectWrite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaIndirectRead createSsaIndirectRead() {
		SsaIndirectReadImpl ssaIndirectRead = new SsaIndirectReadImpl();
		return ssaIndirectRead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaNodeRef createSsaNodeRef() {
		SsaNodeRefImpl ssaNodeRef = new SsaNodeRefImpl();
		return ssaNodeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaGoto createSsaGoto() {
		SsaGotoImpl ssaGoto = new SsaGotoImpl();
		return ssaGoto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaLabel createSsaLabel() {
		SsaLabelImpl ssaLabel = new SsaLabelImpl();
		return ssaLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaPassByRefArgument createSsaPassByRefArgument() {
		SsaPassByRefArgumentImpl ssaPassByRefArgument = new SsaPassByRefArgumentImpl();
		return ssaPassByRefArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaArgument createSsaArgument() {
		SsaArgumentImpl ssaArgument = new SsaArgumentImpl();
		return ssaArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaPassByRefParam createSsaPassByRefParam() {
		SsaPassByRefParamImpl ssaPassByRefParam = new SsaPassByRefParamImpl();
		return ssaPassByRefParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaOutputArgument createSsaOutputArgument() {
		SsaOutputArgumentImpl ssaOutputArgument = new SsaOutputArgumentImpl();
		return ssaOutputArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaSizeof createSsaSizeof() {
		SsaSizeofImpl ssaSizeof = new SsaSizeofImpl();
		return ssaSizeof;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaSizeofType createSsaSizeofType() {
		SsaSizeofTypeImpl ssaSizeofType = new SsaSizeofTypeImpl();
		return ssaSizeofType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaSizeofVar createSsaSizeofVar() {
		SsaSizeofVarImpl ssaSizeofVar = new SsaSizeofVarImpl();
		return ssaSizeofVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompileTimeExpression createCompileTimeExpression() {
		CompileTimeExpressionImpl compileTimeExpression = new CompileTimeExpressionImpl();
		return compileTimeExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaBinaryOperatorKind createSsaBinaryOperatorKindFromString(EDataType eDataType, String initialValue) {
		SsaBinaryOperatorKind result = SsaBinaryOperatorKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSsaBinaryOperatorKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaUnaryOperatorKind createSsaUnaryOperatorKindFromString(EDataType eDataType, String initialValue) {
		SsaUnaryOperatorKind result = SsaUnaryOperatorKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSsaUnaryOperatorKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerType createContainerTypeFromString(EDataType eDataType, String initialValue) {
		ContainerType result = ContainerType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContainerTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopType createLoopTypeFromString(EDataType eDataType, String initialValue) {
		LoopType result = LoopType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLoopTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlType createControlTypeFromString(EDataType eDataType, String initialValue) {
		ControlType result = ControlType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertControlTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParamDirection createParamDirectionFromString(EDataType eDataType, String initialValue) {
		ParamDirection result = ParamDirection.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParamDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchType createSwitchTypeFromString(EDataType eDataType, String initialValue) {
		SwitchType result = SwitchType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSwitchTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DowhileType createDowhileTypeFromString(EDataType eDataType, String initialValue) {
		DowhileType result = DowhileType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDowhileTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaModelPackage getSsaModelPackage() {
		return (SsaModelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SsaModelPackage getPackage() {
		return SsaModelPackage.eINSTANCE;
	}

} //SsaModelFactoryImpl
