/**
 */
package hu.metadom.hls.ssamodel.util;

import hu.metadom.hls.ssamodel.ArrayType;
import hu.metadom.hls.ssamodel.CNameScope;
import hu.metadom.hls.ssamodel.CompileTimeExpression;
import hu.metadom.hls.ssamodel.Container;
import hu.metadom.hls.ssamodel.EnumMember;
import hu.metadom.hls.ssamodel.FilePosition;
import hu.metadom.hls.ssamodel.FunctionType;
import hu.metadom.hls.ssamodel.Member;
import hu.metadom.hls.ssamodel.PointerType;
import hu.metadom.hls.ssamodel.PrimitiveType;
import hu.metadom.hls.ssamodel.ReferenceType;
import hu.metadom.hls.ssamodel.SsaAbstractInit;
import hu.metadom.hls.ssamodel.SsaArgument;
import hu.metadom.hls.ssamodel.SsaArrayRead;
import hu.metadom.hls.ssamodel.SsaArrayWrite;
import hu.metadom.hls.ssamodel.SsaAssign;
import hu.metadom.hls.ssamodel.SsaBinaryOperator;
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
import hu.metadom.hls.ssamodel.SsaVar;
import hu.metadom.hls.ssamodel.Struct;
import hu.metadom.hls.ssamodel.StructBitfieldMember;
import hu.metadom.hls.ssamodel.StructMember;
import hu.metadom.hls.ssamodel.Type;
import hu.metadom.hls.ssamodel.Union;

import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see hu.metadom.hls.ssamodel.SsaModelPackage
 * @generated
 */
public class SsaModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SsaModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SsaModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SsaModelSwitch<Adapter> modelSwitch = new SsaModelSwitch<Adapter>() {
		@Override
		public Adapter caseType(Type object) {
			return createTypeAdapter();
		}

		@Override
		public Adapter casePrimitiveType(PrimitiveType object) {
			return createPrimitiveTypeAdapter();
		}

		@Override
		public Adapter caseEnum(hu.metadom.hls.ssamodel.Enum object) {
			return createEnumAdapter();
		}

		@Override
		public Adapter caseStruct(Struct object) {
			return createStructAdapter();
		}

		@Override
		public Adapter caseUnion(Union object) {
			return createUnionAdapter();
		}

		@Override
		public Adapter caseReferenceType(ReferenceType object) {
			return createReferenceTypeAdapter();
		}

		@Override
		public Adapter caseContainer(Container object) {
			return createContainerAdapter();
		}

		@Override
		public Adapter caseEnumMember(EnumMember object) {
			return createEnumMemberAdapter();
		}

		@Override
		public Adapter caseStructMember(StructMember object) {
			return createStructMemberAdapter();
		}

		@Override
		public Adapter caseStructBitfieldMember(StructBitfieldMember object) {
			return createStructBitfieldMemberAdapter();
		}

		@Override
		public Adapter casePointerType(PointerType object) {
			return createPointerTypeAdapter();
		}

		@Override
		public Adapter caseArrayType(ArrayType object) {
			return createArrayTypeAdapter();
		}

		@Override
		public Adapter caseSsaNode(SsaNode object) {
			return createSsaNodeAdapter();
		}

		@Override
		public Adapter caseSsaAssign(SsaAssign object) {
			return createSsaAssignAdapter();
		}

		@Override
		public Adapter caseSsaConst(SsaConst object) {
			return createSsaConstAdapter();
		}

		@Override
		public Adapter caseSsaBinaryOperator(SsaBinaryOperator object) {
			return createSsaBinaryOperatorAdapter();
		}

		@Override
		public Adapter caseSsaUnaryOperator(SsaUnaryOperator object) {
			return createSsaUnaryOperatorAdapter();
		}

		@Override
		public Adapter caseSsaCall(SsaCall object) {
			return createSsaCallAdapter();
		}

		@Override
		public Adapter caseSsaPhi(SsaPhi object) {
			return createSsaPhiAdapter();
		}

		@Override
		public Adapter caseSsaParam(SsaParam object) {
			return createSsaParamAdapter();
		}

		@Override
		public Adapter caseSsaReturn(SsaReturn object) {
			return createSsaReturnAdapter();
		}

		@Override
		public Adapter caseSsaCast(SsaCast object) {
			return createSsaCastAdapter();
		}

		@Override
		public Adapter caseSsaConditionalJump(SsaConditionalJump object) {
			return createSsaConditionalJumpAdapter();
		}

		@Override
		public Adapter caseSsaFunction(SsaFunction object) {
			return createSsaFunctionAdapter();
		}

		@Override
		public Adapter caseSsaBlock(SsaBlock object) {
			return createSsaBlockAdapter();
		}

		@Override
		public Adapter caseSsaStructRead(SsaStructRead object) {
			return createSsaStructReadAdapter();
		}

		@Override
		public Adapter caseSsaStructWrite(SsaStructWrite object) {
			return createSsaStructWriteAdapter();
		}

		@Override
		public Adapter caseSsaArrayRead(SsaArrayRead object) {
			return createSsaArrayReadAdapter();
		}

		@Override
		public Adapter caseSsaArrayWrite(SsaArrayWrite object) {
			return createSsaArrayWriteAdapter();
		}

		@Override
		public Adapter caseFilePosition(FilePosition object) {
			return createFilePositionAdapter();
		}

		@Override
		public Adapter caseSsaVar(SsaVar object) {
			return createSsaVarAdapter();
		}

		@Override
		public Adapter caseCNameScope(CNameScope object) {
			return createCNameScopeAdapter();
		}

		@Override
		public Adapter caseStringToCNameMap(Map.Entry<String, SsaVar> object) {
			return createStringToCNameMapAdapter();
		}

		@Override
		public Adapter caseSsaExplicitCast(SsaExplicitCast object) {
			return createSsaExplicitCastAdapter();
		}

		@Override
		public Adapter caseMember(Member object) {
			return createMemberAdapter();
		}

		@Override
		public Adapter caseSsaDowhile(SsaDowhile object) {
			return createSsaDowhileAdapter();
		}

		@Override
		public Adapter caseSsaSwitch(SsaSwitch object) {
			return createSsaSwitchAdapter();
		}

		@Override
		public Adapter caseSsaCase(SsaCase object) {
			return createSsaCaseAdapter();
		}

		@Override
		public Adapter caseSsaControl(SsaControl object) {
			return createSsaControlAdapter();
		}

		@Override
		public Adapter caseSsaAbstractInit(SsaAbstractInit object) {
			return createSsaAbstractInitAdapter();
		}

		@Override
		public Adapter caseSsaInitList(SsaInitList object) {
			return createSsaInitListAdapter();
		}

		@Override
		public Adapter caseSsaInit(SsaInit object) {
			return createSsaInitAdapter();
		}

		@Override
		public Adapter caseFunctionType(FunctionType object) {
			return createFunctionTypeAdapter();
		}

		@Override
		public Adapter caseSsaIndirectWrite(SsaIndirectWrite object) {
			return createSsaIndirectWriteAdapter();
		}

		@Override
		public Adapter caseSsaIndirectRead(SsaIndirectRead object) {
			return createSsaIndirectReadAdapter();
		}

		@Override
		public Adapter caseSsaNodeRef(SsaNodeRef object) {
			return createSsaNodeRefAdapter();
		}

		@Override
		public Adapter caseSsaGoto(SsaGoto object) {
			return createSsaGotoAdapter();
		}

		@Override
		public Adapter caseSsaLabel(SsaLabel object) {
			return createSsaLabelAdapter();
		}

		@Override
		public Adapter caseSsaPassByRefArgument(SsaPassByRefArgument object) {
			return createSsaPassByRefArgumentAdapter();
		}

		@Override
		public Adapter caseSsaArgument(SsaArgument object) {
			return createSsaArgumentAdapter();
		}

		@Override
		public Adapter caseSsaPassByRefParam(SsaPassByRefParam object) {
			return createSsaPassByRefParamAdapter();
		}

		@Override
		public Adapter caseSsaOutputArgument(SsaOutputArgument object) {
			return createSsaOutputArgumentAdapter();
		}

		@Override
		public Adapter caseSsaObject(SsaObject object) {
			return createSsaObjectAdapter();
		}

		@Override
		public Adapter caseSsaSizeof(SsaSizeof object) {
			return createSsaSizeofAdapter();
		}

		@Override
		public Adapter caseSsaSizeofType(SsaSizeofType object) {
			return createSsaSizeofTypeAdapter();
		}

		@Override
		public Adapter caseSsaSizeofVar(SsaSizeofVar object) {
			return createSsaSizeofVarAdapter();
		}

		@Override
		public Adapter caseCompileTimeExpression(CompileTimeExpression object) {
			return createCompileTimeExpressionAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.metadom.hls.ssamodel.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.metadom.hls.ssamodel.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.metadom.hls.ssamodel.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.metadom.hls.ssamodel.PrimitiveType
	 * @generated
	 */
	public Adapter createPrimitiveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.metadom.hls.ssamodel.Enum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.metadom.hls.ssamodel.Enum
	 * @generated
	 */
	public Adapter createEnumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.metadom.hls.ssamodel.Struct <em>Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.metadom.hls.ssamodel.Struct
	 * @generated
	 */
	public Adapter createStructAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.metadom.hls.ssamodel.Union <em>Union</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.metadom.hls.ssamodel.Union
	 * @generated
	 */
	public Adapter createUnionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.metadom.hls.ssamodel.ReferenceType <em>Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.metadom.hls.ssamodel.ReferenceType
	 * @generated
	 */
	public Adapter createReferenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.metadom.hls.ssamodel.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.metadom.hls.ssamodel.Container
	 * @generated
	 */
	public Adapter createContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.metadom.hls.ssamodel.EnumMember <em>Enum Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.metadom.hls.ssamodel.EnumMember
	 * @generated
	 */
	public Adapter createEnumMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.metadom.hls.ssamodel.StructMember <em>Struct Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.metadom.hls.ssamodel.StructMember
	 * @generated
	 */
	public Adapter createStructMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.metadom.hls.ssamodel.StructBitfieldMember <em>Struct Bitfield Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.metadom.hls.ssamodel.StructBitfieldMember
	 * @generated
	 */
	public Adapter createStructBitfieldMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.metadom.hls.ssamodel.PointerType <em>Pointer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.metadom.hls.ssamodel.PointerType
	 * @generated
	 */
	public Adapter createPointerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.metadom.hls.ssamodel.ArrayType <em>Array Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.metadom.hls.ssamodel.ArrayType
	 * @generated
	 */
	public Adapter createArrayTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.metadom.hls.ssamodel.SsaNode <em>Ssa Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.metadom.hls.ssamodel.SsaNode
	 * @generated
	 */
	public Adapter createSsaNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.metadom.hls.ssamodel.SsaAssign <em>Ssa Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.metadom.hls.ssamodel.SsaAssign
	 * @generated
	 */
	public Adapter createSsaAssignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.metadom.hls.ssamodel.SsaConst <em>Ssa Const</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.metadom.hls.ssamodel.SsaConst
	 * @generated
	 */
	public Adapter createSsaConstAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.metadom.hls.ssamodel.SsaBinaryOperator <em>Ssa Binary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.metadom.hls.ssamodel.SsaBinaryOperator
	 * @generated
	 */
	public Adapter createSsaBinaryOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.metadom.hls.ssamodel.SsaUnaryOperator <em>Ssa Unary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.metadom.hls.ssamodel.SsaUnaryOperator
	 * @generated
	 */
	public Adapter createSsaUnaryOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.metadom.hls.ssamodel.SsaCall <em>Ssa Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.metadom.hls.ssamodel.SsaCall
	 * @generated
	 */
	public Adapter createSsaCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.metadom.hls.ssamodel.SsaPhi <em>Ssa Phi</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.metadom.hls.ssamodel.SsaPhi
	 * @generated
	 */
	public Adapter createSsaPhiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.metadom.hls.ssamodel.SsaParam <em>Ssa Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.metadom.hls.ssamodel.SsaParam
	 * @generated
	 */
	public Adapter createSsaParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.metadom.hls.ssamodel.SsaReturn <em>Ssa Return</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.metadom.hls.ssamodel.SsaReturn
	 * @generated
	 */
	public Adapter createSsaReturnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.metadom.hls.ssamodel.SsaCast <em>Ssa Cast</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.metadom.hls.ssamodel.SsaCast
	 * @generated
	 */
	public Adapter createSsaCastAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.metadom.hls.ssamodel.SsaConditionalJump <em>Ssa Conditional Jump</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.metadom.hls.ssamodel.SsaConditionalJump
	 * @generated
	 */
	public Adapter createSsaConditionalJumpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.metadom.hls.ssamodel.SsaFunction <em>Ssa Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.metadom.hls.ssamodel.SsaFunction
	 * @generated
	 */
	public Adapter createSsaFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.metadom.hls.ssamodel.SsaBlock <em>Ssa Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.metadom.hls.ssamodel.SsaBlock
	 * @generated
	 */
	public Adapter createSsaBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.metadom.hls.ssamodel.SsaStructRead <em>Ssa Struct Read</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.metadom.hls.ssamodel.SsaStructRead
	 * @generated
	 */
	public Adapter createSsaStructReadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.metadom.hls.ssamodel.SsaStructWrite <em>Ssa Struct Write</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.metadom.hls.ssamodel.SsaStructWrite
	 * @generated
	 */
	public Adapter createSsaStructWriteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.metadom.hls.ssamodel.SsaArrayRead <em>Ssa Array Read</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.metadom.hls.ssamodel.SsaArrayRead
	 * @generated
	 */
	public Adapter createSsaArrayReadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.metadom.hls.ssamodel.SsaArrayWrite <em>Ssa Array Write</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.metadom.hls.ssamodel.SsaArrayWrite
	 * @generated
	 */
	public Adapter createSsaArrayWriteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.metadom.hls.ssamodel.FilePosition <em>File Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.metadom.hls.ssamodel.FilePosition
	 * @generated
	 */
	public Adapter createFilePositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.metadom.hls.ssamodel.SsaVar <em>Ssa Var</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.metadom.hls.ssamodel.SsaVar
	 * @generated
	 */
	public Adapter createSsaVarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.metadom.hls.ssamodel.CNameScope <em>CName Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.metadom.hls.ssamodel.CNameScope
	 * @generated
	 */
	public Adapter createCNameScopeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>String To CName Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createStringToCNameMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.metadom.hls.ssamodel.SsaExplicitCast <em>Ssa Explicit Cast</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.metadom.hls.ssamodel.SsaExplicitCast
	 * @generated
	 */
	public Adapter createSsaExplicitCastAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.metadom.hls.ssamodel.Member <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.metadom.hls.ssamodel.Member
	 * @generated
	 */
	public Adapter createMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.metadom.hls.ssamodel.SsaDowhile <em>Ssa Dowhile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.metadom.hls.ssamodel.SsaDowhile
	 * @generated
	 */
	public Adapter createSsaDowhileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.metadom.hls.ssamodel.SsaSwitch <em>Ssa Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.metadom.hls.ssamodel.SsaSwitch
	 * @generated
	 */
	public Adapter createSsaSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.metadom.hls.ssamodel.SsaCase <em>Ssa Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.metadom.hls.ssamodel.SsaCase
	 * @generated
	 */
	public Adapter createSsaCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.metadom.hls.ssamodel.SsaControl <em>Ssa Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.metadom.hls.ssamodel.SsaControl
	 * @generated
	 */
	public Adapter createSsaControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.metadom.hls.ssamodel.SsaAbstractInit <em>Ssa Abstract Init</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.metadom.hls.ssamodel.SsaAbstractInit
	 * @generated
	 */
	public Adapter createSsaAbstractInitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.metadom.hls.ssamodel.SsaInitList <em>Ssa Init List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.metadom.hls.ssamodel.SsaInitList
	 * @generated
	 */
	public Adapter createSsaInitListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.metadom.hls.ssamodel.SsaInit <em>Ssa Init</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.metadom.hls.ssamodel.SsaInit
	 * @generated
	 */
	public Adapter createSsaInitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.metadom.hls.ssamodel.FunctionType <em>Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.metadom.hls.ssamodel.FunctionType
	 * @generated
	 */
	public Adapter createFunctionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.metadom.hls.ssamodel.SsaIndirectWrite <em>Ssa Indirect Write</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.metadom.hls.ssamodel.SsaIndirectWrite
	 * @generated
	 */
	public Adapter createSsaIndirectWriteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.metadom.hls.ssamodel.SsaIndirectRead <em>Ssa Indirect Read</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.metadom.hls.ssamodel.SsaIndirectRead
	 * @generated
	 */
	public Adapter createSsaIndirectReadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.metadom.hls.ssamodel.SsaNodeRef <em>Ssa Node Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.metadom.hls.ssamodel.SsaNodeRef
	 * @generated
	 */
	public Adapter createSsaNodeRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.metadom.hls.ssamodel.SsaGoto <em>Ssa Goto</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.metadom.hls.ssamodel.SsaGoto
	 * @generated
	 */
	public Adapter createSsaGotoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.metadom.hls.ssamodel.SsaLabel <em>Ssa Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.metadom.hls.ssamodel.SsaLabel
	 * @generated
	 */
	public Adapter createSsaLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.metadom.hls.ssamodel.SsaPassByRefArgument <em>Ssa Pass By Ref Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.metadom.hls.ssamodel.SsaPassByRefArgument
	 * @generated
	 */
	public Adapter createSsaPassByRefArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.metadom.hls.ssamodel.SsaArgument <em>Ssa Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.metadom.hls.ssamodel.SsaArgument
	 * @generated
	 */
	public Adapter createSsaArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.metadom.hls.ssamodel.SsaPassByRefParam <em>Ssa Pass By Ref Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.metadom.hls.ssamodel.SsaPassByRefParam
	 * @generated
	 */
	public Adapter createSsaPassByRefParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.metadom.hls.ssamodel.SsaOutputArgument <em>Ssa Output Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.metadom.hls.ssamodel.SsaOutputArgument
	 * @generated
	 */
	public Adapter createSsaOutputArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.metadom.hls.ssamodel.SsaObject <em>Ssa Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.metadom.hls.ssamodel.SsaObject
	 * @generated
	 */
	public Adapter createSsaObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.metadom.hls.ssamodel.SsaSizeof <em>Ssa Sizeof</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.metadom.hls.ssamodel.SsaSizeof
	 * @generated
	 */
	public Adapter createSsaSizeofAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.metadom.hls.ssamodel.SsaSizeofType <em>Ssa Sizeof Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.metadom.hls.ssamodel.SsaSizeofType
	 * @generated
	 */
	public Adapter createSsaSizeofTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.metadom.hls.ssamodel.SsaSizeofVar <em>Ssa Sizeof Var</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.metadom.hls.ssamodel.SsaSizeofVar
	 * @generated
	 */
	public Adapter createSsaSizeofVarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.metadom.hls.ssamodel.CompileTimeExpression <em>Compile Time Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.metadom.hls.ssamodel.CompileTimeExpression
	 * @generated
	 */
	public Adapter createCompileTimeExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SsaModelAdapterFactory
