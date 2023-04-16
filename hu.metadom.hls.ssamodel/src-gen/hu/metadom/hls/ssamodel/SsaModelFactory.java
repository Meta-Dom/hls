/**
 */
package hu.metadom.hls.ssamodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.metadom.hls.ssamodel.SsaModelPackage
 * @generated
 */
public interface SsaModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SsaModelFactory eINSTANCE = hu.metadom.hls.ssamodel.impl.SsaModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Type</em>'.
	 * @generated
	 */
	PrimitiveType createPrimitiveType();

	/**
	 * Returns a new object of class '<em>Enum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum</em>'.
	 * @generated
	 */
	Enum createEnum();

	/**
	 * Returns a new object of class '<em>Struct</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Struct</em>'.
	 * @generated
	 */
	Struct createStruct();

	/**
	 * Returns a new object of class '<em>Union</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Union</em>'.
	 * @generated
	 */
	Union createUnion();

	/**
	 * Returns a new object of class '<em>Reference Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference Type</em>'.
	 * @generated
	 */
	ReferenceType createReferenceType();

	/**
	 * Returns a new object of class '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container</em>'.
	 * @generated
	 */
	Container createContainer();

	/**
	 * Returns a new object of class '<em>Enum Member</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum Member</em>'.
	 * @generated
	 */
	EnumMember createEnumMember();

	/**
	 * Returns a new object of class '<em>Struct Member</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Struct Member</em>'.
	 * @generated
	 */
	StructMember createStructMember();

	/**
	 * Returns a new object of class '<em>Struct Bitfield Member</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Struct Bitfield Member</em>'.
	 * @generated
	 */
	StructBitfieldMember createStructBitfieldMember();

	/**
	 * Returns a new object of class '<em>Pointer Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pointer Type</em>'.
	 * @generated
	 */
	PointerType createPointerType();

	/**
	 * Returns a new object of class '<em>Array Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Type</em>'.
	 * @generated
	 */
	ArrayType createArrayType();

	/**
	 * Returns a new object of class '<em>Ssa Assign</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ssa Assign</em>'.
	 * @generated
	 */
	SsaAssign createSsaAssign();

	/**
	 * Returns a new object of class '<em>Ssa Const</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ssa Const</em>'.
	 * @generated
	 */
	SsaConst createSsaConst();

	/**
	 * Returns a new object of class '<em>Ssa Binary Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ssa Binary Operator</em>'.
	 * @generated
	 */
	SsaBinaryOperator createSsaBinaryOperator();

	/**
	 * Returns a new object of class '<em>Ssa Unary Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ssa Unary Operator</em>'.
	 * @generated
	 */
	SsaUnaryOperator createSsaUnaryOperator();

	/**
	 * Returns a new object of class '<em>Ssa Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ssa Call</em>'.
	 * @generated
	 */
	SsaCall createSsaCall();

	/**
	 * Returns a new object of class '<em>Ssa Phi</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ssa Phi</em>'.
	 * @generated
	 */
	SsaPhi createSsaPhi();

	/**
	 * Returns a new object of class '<em>Ssa Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ssa Param</em>'.
	 * @generated
	 */
	SsaParam createSsaParam();

	/**
	 * Returns a new object of class '<em>Ssa Return</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ssa Return</em>'.
	 * @generated
	 */
	SsaReturn createSsaReturn();

	/**
	 * Returns a new object of class '<em>Ssa Cast</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ssa Cast</em>'.
	 * @generated
	 */
	SsaCast createSsaCast();

	/**
	 * Returns a new object of class '<em>Ssa Conditional Jump</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ssa Conditional Jump</em>'.
	 * @generated
	 */
	SsaConditionalJump createSsaConditionalJump();

	/**
	 * Returns a new object of class '<em>Ssa Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ssa Function</em>'.
	 * @generated
	 */
	SsaFunction createSsaFunction();

	/**
	 * Returns a new object of class '<em>Ssa Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ssa Block</em>'.
	 * @generated
	 */
	SsaBlock createSsaBlock();

	/**
	 * Returns a new object of class '<em>Ssa Struct Read</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ssa Struct Read</em>'.
	 * @generated
	 */
	SsaStructRead createSsaStructRead();

	/**
	 * Returns a new object of class '<em>Ssa Struct Write</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ssa Struct Write</em>'.
	 * @generated
	 */
	SsaStructWrite createSsaStructWrite();

	/**
	 * Returns a new object of class '<em>Ssa Array Read</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ssa Array Read</em>'.
	 * @generated
	 */
	SsaArrayRead createSsaArrayRead();

	/**
	 * Returns a new object of class '<em>Ssa Array Write</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ssa Array Write</em>'.
	 * @generated
	 */
	SsaArrayWrite createSsaArrayWrite();

	/**
	 * Returns a new object of class '<em>File Position</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Position</em>'.
	 * @generated
	 */
	FilePosition createFilePosition();

	/**
	 * Returns a new object of class '<em>Ssa Var</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ssa Var</em>'.
	 * @generated
	 */
	SsaVar createSsaVar();

	/**
	 * Returns a new object of class '<em>CName Scope</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CName Scope</em>'.
	 * @generated
	 */
	CNameScope createCNameScope();

	/**
	 * Returns a new object of class '<em>Ssa Explicit Cast</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ssa Explicit Cast</em>'.
	 * @generated
	 */
	SsaExplicitCast createSsaExplicitCast();

	/**
	 * Returns a new object of class '<em>Ssa Dowhile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ssa Dowhile</em>'.
	 * @generated
	 */
	SsaDowhile createSsaDowhile();

	/**
	 * Returns a new object of class '<em>Ssa Switch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ssa Switch</em>'.
	 * @generated
	 */
	SsaSwitch createSsaSwitch();

	/**
	 * Returns a new object of class '<em>Ssa Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ssa Case</em>'.
	 * @generated
	 */
	SsaCase createSsaCase();

	/**
	 * Returns a new object of class '<em>Ssa Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ssa Control</em>'.
	 * @generated
	 */
	SsaControl createSsaControl();

	/**
	 * Returns a new object of class '<em>Ssa Init List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ssa Init List</em>'.
	 * @generated
	 */
	SsaInitList createSsaInitList();

	/**
	 * Returns a new object of class '<em>Ssa Init</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ssa Init</em>'.
	 * @generated
	 */
	SsaInit createSsaInit();

	/**
	 * Returns a new object of class '<em>Function Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Type</em>'.
	 * @generated
	 */
	FunctionType createFunctionType();

	/**
	 * Returns a new object of class '<em>Ssa Indirect Write</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ssa Indirect Write</em>'.
	 * @generated
	 */
	SsaIndirectWrite createSsaIndirectWrite();

	/**
	 * Returns a new object of class '<em>Ssa Indirect Read</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ssa Indirect Read</em>'.
	 * @generated
	 */
	SsaIndirectRead createSsaIndirectRead();

	/**
	 * Returns a new object of class '<em>Ssa Node Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ssa Node Ref</em>'.
	 * @generated
	 */
	SsaNodeRef createSsaNodeRef();

	/**
	 * Returns a new object of class '<em>Ssa Goto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ssa Goto</em>'.
	 * @generated
	 */
	SsaGoto createSsaGoto();

	/**
	 * Returns a new object of class '<em>Ssa Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ssa Label</em>'.
	 * @generated
	 */
	SsaLabel createSsaLabel();

	/**
	 * Returns a new object of class '<em>Ssa Pass By Ref Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ssa Pass By Ref Argument</em>'.
	 * @generated
	 */
	SsaPassByRefArgument createSsaPassByRefArgument();

	/**
	 * Returns a new object of class '<em>Ssa Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ssa Argument</em>'.
	 * @generated
	 */
	SsaArgument createSsaArgument();

	/**
	 * Returns a new object of class '<em>Ssa Pass By Ref Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ssa Pass By Ref Param</em>'.
	 * @generated
	 */
	SsaPassByRefParam createSsaPassByRefParam();

	/**
	 * Returns a new object of class '<em>Ssa Output Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ssa Output Argument</em>'.
	 * @generated
	 */
	SsaOutputArgument createSsaOutputArgument();

	/**
	 * Returns a new object of class '<em>Ssa Sizeof</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ssa Sizeof</em>'.
	 * @generated
	 */
	SsaSizeof createSsaSizeof();

	/**
	 * Returns a new object of class '<em>Ssa Sizeof Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ssa Sizeof Type</em>'.
	 * @generated
	 */
	SsaSizeofType createSsaSizeofType();

	/**
	 * Returns a new object of class '<em>Ssa Sizeof Var</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ssa Sizeof Var</em>'.
	 * @generated
	 */
	SsaSizeofVar createSsaSizeofVar();

	/**
	 * Returns a new object of class '<em>Compile Time Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compile Time Expression</em>'.
	 * @generated
	 */
	CompileTimeExpression createCompileTimeExpression();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SsaModelPackage getSsaModelPackage();

} //SsaModelFactory
