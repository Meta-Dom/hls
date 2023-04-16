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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see hu.metadom.hls.ssamodel.SsaModelPackage
 * @generated
 */
public class SsaModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SsaModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaModelSwitch() {
		if (modelPackage == null) {
			modelPackage = SsaModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case SsaModelPackage.TYPE: {
			Type type = (Type) theEObject;
			T result = caseType(type);
			if (result == null)
				result = caseSsaObject(type);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SsaModelPackage.PRIMITIVE_TYPE: {
			PrimitiveType primitiveType = (PrimitiveType) theEObject;
			T result = casePrimitiveType(primitiveType);
			if (result == null)
				result = caseType(primitiveType);
			if (result == null)
				result = caseSsaObject(primitiveType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SsaModelPackage.ENUM: {
			hu.metadom.hls.ssamodel.Enum enum_ = (hu.metadom.hls.ssamodel.Enum) theEObject;
			T result = caseEnum(enum_);
			if (result == null)
				result = caseType(enum_);
			if (result == null)
				result = caseSsaObject(enum_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SsaModelPackage.STRUCT: {
			Struct struct = (Struct) theEObject;
			T result = caseStruct(struct);
			if (result == null)
				result = caseType(struct);
			if (result == null)
				result = caseSsaObject(struct);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SsaModelPackage.UNION: {
			Union union = (Union) theEObject;
			T result = caseUnion(union);
			if (result == null)
				result = caseStruct(union);
			if (result == null)
				result = caseType(union);
			if (result == null)
				result = caseSsaObject(union);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SsaModelPackage.REFERENCE_TYPE: {
			ReferenceType referenceType = (ReferenceType) theEObject;
			T result = caseReferenceType(referenceType);
			if (result == null)
				result = caseType(referenceType);
			if (result == null)
				result = caseSsaObject(referenceType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SsaModelPackage.CONTAINER: {
			Container container = (Container) theEObject;
			T result = caseContainer(container);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SsaModelPackage.ENUM_MEMBER: {
			EnumMember enumMember = (EnumMember) theEObject;
			T result = caseEnumMember(enumMember);
			if (result == null)
				result = caseMember(enumMember);
			if (result == null)
				result = caseSsaObject(enumMember);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SsaModelPackage.STRUCT_MEMBER: {
			StructMember structMember = (StructMember) theEObject;
			T result = caseStructMember(structMember);
			if (result == null)
				result = caseMember(structMember);
			if (result == null)
				result = caseSsaObject(structMember);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SsaModelPackage.STRUCT_BITFIELD_MEMBER: {
			StructBitfieldMember structBitfieldMember = (StructBitfieldMember) theEObject;
			T result = caseStructBitfieldMember(structBitfieldMember);
			if (result == null)
				result = caseStructMember(structBitfieldMember);
			if (result == null)
				result = caseMember(structBitfieldMember);
			if (result == null)
				result = caseSsaObject(structBitfieldMember);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SsaModelPackage.POINTER_TYPE: {
			PointerType pointerType = (PointerType) theEObject;
			T result = casePointerType(pointerType);
			if (result == null)
				result = caseReferenceType(pointerType);
			if (result == null)
				result = caseType(pointerType);
			if (result == null)
				result = caseSsaObject(pointerType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SsaModelPackage.ARRAY_TYPE: {
			ArrayType arrayType = (ArrayType) theEObject;
			T result = caseArrayType(arrayType);
			if (result == null)
				result = caseReferenceType(arrayType);
			if (result == null)
				result = caseType(arrayType);
			if (result == null)
				result = caseSsaObject(arrayType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SsaModelPackage.SSA_NODE: {
			SsaNode ssaNode = (SsaNode) theEObject;
			T result = caseSsaNode(ssaNode);
			if (result == null)
				result = caseSsaObject(ssaNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SsaModelPackage.SSA_ASSIGN: {
			SsaAssign ssaAssign = (SsaAssign) theEObject;
			T result = caseSsaAssign(ssaAssign);
			if (result == null)
				result = caseSsaNode(ssaAssign);
			if (result == null)
				result = caseSsaObject(ssaAssign);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SsaModelPackage.SSA_CONST: {
			SsaConst ssaConst = (SsaConst) theEObject;
			T result = caseSsaConst(ssaConst);
			if (result == null)
				result = caseSsaNode(ssaConst);
			if (result == null)
				result = caseSsaObject(ssaConst);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SsaModelPackage.SSA_BINARY_OPERATOR: {
			SsaBinaryOperator ssaBinaryOperator = (SsaBinaryOperator) theEObject;
			T result = caseSsaBinaryOperator(ssaBinaryOperator);
			if (result == null)
				result = caseSsaNode(ssaBinaryOperator);
			if (result == null)
				result = caseSsaObject(ssaBinaryOperator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SsaModelPackage.SSA_UNARY_OPERATOR: {
			SsaUnaryOperator ssaUnaryOperator = (SsaUnaryOperator) theEObject;
			T result = caseSsaUnaryOperator(ssaUnaryOperator);
			if (result == null)
				result = caseSsaNode(ssaUnaryOperator);
			if (result == null)
				result = caseSsaObject(ssaUnaryOperator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SsaModelPackage.SSA_CALL: {
			SsaCall ssaCall = (SsaCall) theEObject;
			T result = caseSsaCall(ssaCall);
			if (result == null)
				result = caseSsaNode(ssaCall);
			if (result == null)
				result = caseSsaObject(ssaCall);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SsaModelPackage.SSA_PHI: {
			SsaPhi ssaPhi = (SsaPhi) theEObject;
			T result = caseSsaPhi(ssaPhi);
			if (result == null)
				result = caseSsaNode(ssaPhi);
			if (result == null)
				result = caseSsaObject(ssaPhi);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SsaModelPackage.SSA_PARAM: {
			SsaParam ssaParam = (SsaParam) theEObject;
			T result = caseSsaParam(ssaParam);
			if (result == null)
				result = caseSsaNode(ssaParam);
			if (result == null)
				result = caseSsaObject(ssaParam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SsaModelPackage.SSA_RETURN: {
			SsaReturn ssaReturn = (SsaReturn) theEObject;
			T result = caseSsaReturn(ssaReturn);
			if (result == null)
				result = caseSsaNode(ssaReturn);
			if (result == null)
				result = caseSsaObject(ssaReturn);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SsaModelPackage.SSA_CAST: {
			SsaCast ssaCast = (SsaCast) theEObject;
			T result = caseSsaCast(ssaCast);
			if (result == null)
				result = caseSsaNode(ssaCast);
			if (result == null)
				result = caseSsaObject(ssaCast);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SsaModelPackage.SSA_CONDITIONAL_JUMP: {
			SsaConditionalJump ssaConditionalJump = (SsaConditionalJump) theEObject;
			T result = caseSsaConditionalJump(ssaConditionalJump);
			if (result == null)
				result = caseSsaNode(ssaConditionalJump);
			if (result == null)
				result = caseSsaObject(ssaConditionalJump);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SsaModelPackage.SSA_FUNCTION: {
			SsaFunction ssaFunction = (SsaFunction) theEObject;
			T result = caseSsaFunction(ssaFunction);
			if (result == null)
				result = caseSsaBlock(ssaFunction);
			if (result == null)
				result = caseSsaNode(ssaFunction);
			if (result == null)
				result = caseSsaObject(ssaFunction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SsaModelPackage.SSA_BLOCK: {
			SsaBlock ssaBlock = (SsaBlock) theEObject;
			T result = caseSsaBlock(ssaBlock);
			if (result == null)
				result = caseSsaNode(ssaBlock);
			if (result == null)
				result = caseSsaObject(ssaBlock);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SsaModelPackage.SSA_STRUCT_READ: {
			SsaStructRead ssaStructRead = (SsaStructRead) theEObject;
			T result = caseSsaStructRead(ssaStructRead);
			if (result == null)
				result = caseSsaNode(ssaStructRead);
			if (result == null)
				result = caseSsaObject(ssaStructRead);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SsaModelPackage.SSA_STRUCT_WRITE: {
			SsaStructWrite ssaStructWrite = (SsaStructWrite) theEObject;
			T result = caseSsaStructWrite(ssaStructWrite);
			if (result == null)
				result = caseSsaNode(ssaStructWrite);
			if (result == null)
				result = caseSsaObject(ssaStructWrite);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SsaModelPackage.SSA_ARRAY_READ: {
			SsaArrayRead ssaArrayRead = (SsaArrayRead) theEObject;
			T result = caseSsaArrayRead(ssaArrayRead);
			if (result == null)
				result = caseSsaNode(ssaArrayRead);
			if (result == null)
				result = caseSsaObject(ssaArrayRead);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SsaModelPackage.SSA_ARRAY_WRITE: {
			SsaArrayWrite ssaArrayWrite = (SsaArrayWrite) theEObject;
			T result = caseSsaArrayWrite(ssaArrayWrite);
			if (result == null)
				result = caseSsaNode(ssaArrayWrite);
			if (result == null)
				result = caseSsaObject(ssaArrayWrite);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SsaModelPackage.FILE_POSITION: {
			FilePosition filePosition = (FilePosition) theEObject;
			T result = caseFilePosition(filePosition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SsaModelPackage.SSA_VAR: {
			SsaVar ssaVar = (SsaVar) theEObject;
			T result = caseSsaVar(ssaVar);
			if (result == null)
				result = caseSsaObject(ssaVar);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SsaModelPackage.CNAME_SCOPE: {
			CNameScope cNameScope = (CNameScope) theEObject;
			T result = caseCNameScope(cNameScope);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SsaModelPackage.STRING_TO_CNAME_MAP: {
			@SuppressWarnings("unchecked")
			Map.Entry<String, SsaVar> stringToCNameMap = (Map.Entry<String, SsaVar>) theEObject;
			T result = caseStringToCNameMap(stringToCNameMap);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SsaModelPackage.SSA_EXPLICIT_CAST: {
			SsaExplicitCast ssaExplicitCast = (SsaExplicitCast) theEObject;
			T result = caseSsaExplicitCast(ssaExplicitCast);
			if (result == null)
				result = caseSsaCast(ssaExplicitCast);
			if (result == null)
				result = caseSsaNode(ssaExplicitCast);
			if (result == null)
				result = caseSsaObject(ssaExplicitCast);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SsaModelPackage.MEMBER: {
			Member member = (Member) theEObject;
			T result = caseMember(member);
			if (result == null)
				result = caseSsaObject(member);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SsaModelPackage.SSA_DOWHILE: {
			SsaDowhile ssaDowhile = (SsaDowhile) theEObject;
			T result = caseSsaDowhile(ssaDowhile);
			if (result == null)
				result = caseSsaNode(ssaDowhile);
			if (result == null)
				result = caseSsaObject(ssaDowhile);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SsaModelPackage.SSA_SWITCH: {
			SsaSwitch ssaSwitch = (SsaSwitch) theEObject;
			T result = caseSsaSwitch(ssaSwitch);
			if (result == null)
				result = caseSsaNode(ssaSwitch);
			if (result == null)
				result = caseSsaObject(ssaSwitch);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SsaModelPackage.SSA_CASE: {
			SsaCase ssaCase = (SsaCase) theEObject;
			T result = caseSsaCase(ssaCase);
			if (result == null)
				result = caseSsaObject(ssaCase);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SsaModelPackage.SSA_CONTROL: {
			SsaControl ssaControl = (SsaControl) theEObject;
			T result = caseSsaControl(ssaControl);
			if (result == null)
				result = caseSsaNode(ssaControl);
			if (result == null)
				result = caseSsaObject(ssaControl);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SsaModelPackage.SSA_ABSTRACT_INIT: {
			SsaAbstractInit ssaAbstractInit = (SsaAbstractInit) theEObject;
			T result = caseSsaAbstractInit(ssaAbstractInit);
			if (result == null)
				result = caseSsaNode(ssaAbstractInit);
			if (result == null)
				result = caseSsaObject(ssaAbstractInit);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SsaModelPackage.SSA_INIT_LIST: {
			SsaInitList ssaInitList = (SsaInitList) theEObject;
			T result = caseSsaInitList(ssaInitList);
			if (result == null)
				result = caseSsaAbstractInit(ssaInitList);
			if (result == null)
				result = caseSsaNode(ssaInitList);
			if (result == null)
				result = caseSsaObject(ssaInitList);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SsaModelPackage.SSA_INIT: {
			SsaInit ssaInit = (SsaInit) theEObject;
			T result = caseSsaInit(ssaInit);
			if (result == null)
				result = caseSsaAbstractInit(ssaInit);
			if (result == null)
				result = caseSsaNode(ssaInit);
			if (result == null)
				result = caseSsaObject(ssaInit);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SsaModelPackage.FUNCTION_TYPE: {
			FunctionType functionType = (FunctionType) theEObject;
			T result = caseFunctionType(functionType);
			if (result == null)
				result = caseType(functionType);
			if (result == null)
				result = caseSsaObject(functionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SsaModelPackage.SSA_INDIRECT_WRITE: {
			SsaIndirectWrite ssaIndirectWrite = (SsaIndirectWrite) theEObject;
			T result = caseSsaIndirectWrite(ssaIndirectWrite);
			if (result == null)
				result = caseSsaNode(ssaIndirectWrite);
			if (result == null)
				result = caseSsaObject(ssaIndirectWrite);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SsaModelPackage.SSA_INDIRECT_READ: {
			SsaIndirectRead ssaIndirectRead = (SsaIndirectRead) theEObject;
			T result = caseSsaIndirectRead(ssaIndirectRead);
			if (result == null)
				result = caseSsaNode(ssaIndirectRead);
			if (result == null)
				result = caseSsaObject(ssaIndirectRead);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SsaModelPackage.SSA_NODE_REF: {
			SsaNodeRef ssaNodeRef = (SsaNodeRef) theEObject;
			T result = caseSsaNodeRef(ssaNodeRef);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SsaModelPackage.SSA_GOTO: {
			SsaGoto ssaGoto = (SsaGoto) theEObject;
			T result = caseSsaGoto(ssaGoto);
			if (result == null)
				result = caseSsaNode(ssaGoto);
			if (result == null)
				result = caseSsaObject(ssaGoto);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SsaModelPackage.SSA_LABEL: {
			SsaLabel ssaLabel = (SsaLabel) theEObject;
			T result = caseSsaLabel(ssaLabel);
			if (result == null)
				result = caseSsaNode(ssaLabel);
			if (result == null)
				result = caseSsaObject(ssaLabel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SsaModelPackage.SSA_PASS_BY_REF_ARGUMENT: {
			SsaPassByRefArgument ssaPassByRefArgument = (SsaPassByRefArgument) theEObject;
			T result = caseSsaPassByRefArgument(ssaPassByRefArgument);
			if (result == null)
				result = caseSsaArgument(ssaPassByRefArgument);
			if (result == null)
				result = caseSsaNodeRef(ssaPassByRefArgument);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SsaModelPackage.SSA_ARGUMENT: {
			SsaArgument ssaArgument = (SsaArgument) theEObject;
			T result = caseSsaArgument(ssaArgument);
			if (result == null)
				result = caseSsaNodeRef(ssaArgument);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SsaModelPackage.SSA_PASS_BY_REF_PARAM: {
			SsaPassByRefParam ssaPassByRefParam = (SsaPassByRefParam) theEObject;
			T result = caseSsaPassByRefParam(ssaPassByRefParam);
			if (result == null)
				result = caseSsaParam(ssaPassByRefParam);
			if (result == null)
				result = caseSsaNode(ssaPassByRefParam);
			if (result == null)
				result = caseSsaObject(ssaPassByRefParam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SsaModelPackage.SSA_OUTPUT_ARGUMENT: {
			SsaOutputArgument ssaOutputArgument = (SsaOutputArgument) theEObject;
			T result = caseSsaOutputArgument(ssaOutputArgument);
			if (result == null)
				result = caseSsaNode(ssaOutputArgument);
			if (result == null)
				result = caseSsaObject(ssaOutputArgument);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SsaModelPackage.SSA_OBJECT: {
			SsaObject ssaObject = (SsaObject) theEObject;
			T result = caseSsaObject(ssaObject);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SsaModelPackage.SSA_SIZEOF: {
			SsaSizeof ssaSizeof = (SsaSizeof) theEObject;
			T result = caseSsaSizeof(ssaSizeof);
			if (result == null)
				result = caseSsaNode(ssaSizeof);
			if (result == null)
				result = caseSsaObject(ssaSizeof);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SsaModelPackage.SSA_SIZEOF_TYPE: {
			SsaSizeofType ssaSizeofType = (SsaSizeofType) theEObject;
			T result = caseSsaSizeofType(ssaSizeofType);
			if (result == null)
				result = caseSsaSizeof(ssaSizeofType);
			if (result == null)
				result = caseSsaNode(ssaSizeofType);
			if (result == null)
				result = caseSsaObject(ssaSizeofType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SsaModelPackage.SSA_SIZEOF_VAR: {
			SsaSizeofVar ssaSizeofVar = (SsaSizeofVar) theEObject;
			T result = caseSsaSizeofVar(ssaSizeofVar);
			if (result == null)
				result = caseSsaSizeof(ssaSizeofVar);
			if (result == null)
				result = caseSsaNode(ssaSizeofVar);
			if (result == null)
				result = caseSsaObject(ssaSizeofVar);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SsaModelPackage.COMPILE_TIME_EXPRESSION: {
			CompileTimeExpression compileTimeExpression = (CompileTimeExpression) theEObject;
			T result = caseCompileTimeExpression(compileTimeExpression);
			if (result == null)
				result = caseSsaObject(compileTimeExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveType(PrimitiveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnum(hu.metadom.hls.ssamodel.Enum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Struct</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Struct</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStruct(Struct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Union</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Union</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnion(Union object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceType(ReferenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainer(Container object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumMember(EnumMember object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Struct Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Struct Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructMember(StructMember object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Struct Bitfield Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Struct Bitfield Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructBitfieldMember(StructBitfieldMember object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pointer Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pointer Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointerType(PointerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayType(ArrayType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ssa Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ssa Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSsaNode(SsaNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ssa Assign</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ssa Assign</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSsaAssign(SsaAssign object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ssa Const</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ssa Const</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSsaConst(SsaConst object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ssa Binary Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ssa Binary Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSsaBinaryOperator(SsaBinaryOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ssa Unary Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ssa Unary Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSsaUnaryOperator(SsaUnaryOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ssa Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ssa Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSsaCall(SsaCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ssa Phi</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ssa Phi</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSsaPhi(SsaPhi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ssa Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ssa Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSsaParam(SsaParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ssa Return</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ssa Return</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSsaReturn(SsaReturn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ssa Cast</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ssa Cast</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSsaCast(SsaCast object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ssa Conditional Jump</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ssa Conditional Jump</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSsaConditionalJump(SsaConditionalJump object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ssa Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ssa Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSsaFunction(SsaFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ssa Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ssa Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSsaBlock(SsaBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ssa Struct Read</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ssa Struct Read</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSsaStructRead(SsaStructRead object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ssa Struct Write</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ssa Struct Write</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSsaStructWrite(SsaStructWrite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ssa Array Read</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ssa Array Read</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSsaArrayRead(SsaArrayRead object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ssa Array Write</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ssa Array Write</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSsaArrayWrite(SsaArrayWrite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Position</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Position</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilePosition(FilePosition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ssa Var</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ssa Var</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSsaVar(SsaVar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CName Scope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CName Scope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCNameScope(CNameScope object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To CName Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To CName Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToCNameMap(Map.Entry<String, SsaVar> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ssa Explicit Cast</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ssa Explicit Cast</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSsaExplicitCast(SsaExplicitCast object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMember(Member object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ssa Dowhile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ssa Dowhile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSsaDowhile(SsaDowhile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ssa Switch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ssa Switch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSsaSwitch(SsaSwitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ssa Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ssa Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSsaCase(SsaCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ssa Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ssa Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSsaControl(SsaControl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ssa Abstract Init</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ssa Abstract Init</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSsaAbstractInit(SsaAbstractInit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ssa Init List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ssa Init List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSsaInitList(SsaInitList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ssa Init</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ssa Init</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSsaInit(SsaInit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionType(FunctionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ssa Indirect Write</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ssa Indirect Write</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSsaIndirectWrite(SsaIndirectWrite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ssa Indirect Read</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ssa Indirect Read</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSsaIndirectRead(SsaIndirectRead object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ssa Node Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ssa Node Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSsaNodeRef(SsaNodeRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ssa Goto</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ssa Goto</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSsaGoto(SsaGoto object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ssa Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ssa Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSsaLabel(SsaLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ssa Pass By Ref Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ssa Pass By Ref Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSsaPassByRefArgument(SsaPassByRefArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ssa Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ssa Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSsaArgument(SsaArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ssa Pass By Ref Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ssa Pass By Ref Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSsaPassByRefParam(SsaPassByRefParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ssa Output Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ssa Output Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSsaOutputArgument(SsaOutputArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ssa Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ssa Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSsaObject(SsaObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ssa Sizeof</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ssa Sizeof</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSsaSizeof(SsaSizeof object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ssa Sizeof Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ssa Sizeof Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSsaSizeofType(SsaSizeofType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ssa Sizeof Var</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ssa Sizeof Var</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSsaSizeofVar(SsaSizeofVar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compile Time Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compile Time Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompileTimeExpression(CompileTimeExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SsaModelSwitch
