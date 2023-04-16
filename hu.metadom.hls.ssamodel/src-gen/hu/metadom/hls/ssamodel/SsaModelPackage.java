/**
 */
package hu.metadom.hls.ssamodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see hu.metadom.hls.ssamodel.SsaModelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore Import='http://www.eclipse.org/OCL/Import'"
 * @generated
 */
public interface SsaModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ssamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://hls.metadom.hu/ssaModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ssamodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SsaModelPackage eINSTANCE = hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.metadom.hls.ssamodel.impl.SsaObjectImpl <em>Ssa Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.metadom.hls.ssamodel.impl.SsaObjectImpl
	 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaObject()
	 * @generated
	 */
	int SSA_OBJECT = 52;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_OBJECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_OBJECT__COMMENT = 1;

	/**
	 * The feature id for the '<em><b>Fileposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_OBJECT__FILEPOSITION = 2;

	/**
	 * The number of structural features of the '<em>Ssa Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_OBJECT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Ssa Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.metadom.hls.ssamodel.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.metadom.hls.ssamodel.impl.TypeImpl
	 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = SSA_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__COMMENT = SSA_OBJECT__COMMENT;

	/**
	 * The feature id for the '<em><b>Fileposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__FILEPOSITION = SSA_OBJECT__FILEPOSITION;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__SIZE = SSA_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = SSA_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = SSA_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.metadom.hls.ssamodel.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.metadom.hls.ssamodel.impl.PrimitiveTypeImpl
	 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__COMMENT = TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Fileposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__FILEPOSITION = TYPE__FILEPOSITION;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__SIZE = TYPE__SIZE;

	/**
	 * The number of structural features of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.metadom.hls.ssamodel.impl.EnumImpl <em>Enum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.metadom.hls.ssamodel.impl.EnumImpl
	 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getEnum()
	 * @generated
	 */
	int ENUM = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__COMMENT = TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Fileposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__FILEPOSITION = TYPE__FILEPOSITION;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__SIZE = TYPE__SIZE;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__MEMBERS = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.metadom.hls.ssamodel.impl.StructImpl <em>Struct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.metadom.hls.ssamodel.impl.StructImpl
	 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getStruct()
	 * @generated
	 */
	int STRUCT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT__COMMENT = TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Fileposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT__FILEPOSITION = TYPE__FILEPOSITION;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT__SIZE = TYPE__SIZE;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT__MEMBERS = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Struct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Struct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.metadom.hls.ssamodel.impl.UnionImpl <em>Union</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.metadom.hls.ssamodel.impl.UnionImpl
	 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getUnion()
	 * @generated
	 */
	int UNION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION__NAME = STRUCT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION__COMMENT = STRUCT__COMMENT;

	/**
	 * The feature id for the '<em><b>Fileposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION__FILEPOSITION = STRUCT__FILEPOSITION;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION__SIZE = STRUCT__SIZE;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION__MEMBERS = STRUCT__MEMBERS;

	/**
	 * The number of structural features of the '<em>Union</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_FEATURE_COUNT = STRUCT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Union</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_OPERATION_COUNT = STRUCT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.metadom.hls.ssamodel.impl.ReferenceTypeImpl <em>Reference Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.metadom.hls.ssamodel.impl.ReferenceTypeImpl
	 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getReferenceType()
	 * @generated
	 */
	int REFERENCE_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE__COMMENT = TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Fileposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE__FILEPOSITION = TYPE__FILEPOSITION;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE__SIZE = TYPE__SIZE;

	/**
	 * The feature id for the '<em><b>Referenced Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE__REFERENCED_TYPE = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Reference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.metadom.hls.ssamodel.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.metadom.hls.ssamodel.impl.ContainerImpl
	 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 6;

	/**
	 * The feature id for the '<em><b>Child Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CHILD_CONTAINERS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__FUNCTIONS = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Global Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__GLOBAL_BLOCK = 4;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.metadom.hls.ssamodel.impl.MemberImpl <em>Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.metadom.hls.ssamodel.impl.MemberImpl
	 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getMember()
	 * @generated
	 */
	int MEMBER = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__NAME = SSA_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__COMMENT = SSA_OBJECT__COMMENT;

	/**
	 * The feature id for the '<em><b>Fileposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__FILEPOSITION = SSA_OBJECT__FILEPOSITION;

	/**
	 * The number of structural features of the '<em>Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_FEATURE_COUNT = SSA_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_OPERATION_COUNT = SSA_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.metadom.hls.ssamodel.impl.EnumMemberImpl <em>Enum Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.metadom.hls.ssamodel.impl.EnumMemberImpl
	 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getEnumMember()
	 * @generated
	 */
	int ENUM_MEMBER = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_MEMBER__NAME = MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_MEMBER__COMMENT = MEMBER__COMMENT;

	/**
	 * The feature id for the '<em><b>Fileposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_MEMBER__FILEPOSITION = MEMBER__FILEPOSITION;

	/**
	 * The feature id for the '<em><b>Const</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_MEMBER__CONST = MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_MEMBER__VALUE_NODE = MEMBER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enum Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_MEMBER_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Enum Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_MEMBER_OPERATION_COUNT = MEMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.metadom.hls.ssamodel.impl.StructMemberImpl <em>Struct Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.metadom.hls.ssamodel.impl.StructMemberImpl
	 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getStructMember()
	 * @generated
	 */
	int STRUCT_MEMBER = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_MEMBER__NAME = MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_MEMBER__COMMENT = MEMBER__COMMENT;

	/**
	 * The feature id for the '<em><b>Fileposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_MEMBER__FILEPOSITION = MEMBER__FILEPOSITION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_MEMBER__TYPE = MEMBER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Struct Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_MEMBER_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Struct Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_MEMBER_OPERATION_COUNT = MEMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.metadom.hls.ssamodel.impl.StructBitfieldMemberImpl <em>Struct Bitfield Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.metadom.hls.ssamodel.impl.StructBitfieldMemberImpl
	 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getStructBitfieldMember()
	 * @generated
	 */
	int STRUCT_BITFIELD_MEMBER = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_BITFIELD_MEMBER__NAME = STRUCT_MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_BITFIELD_MEMBER__COMMENT = STRUCT_MEMBER__COMMENT;

	/**
	 * The feature id for the '<em><b>Fileposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_BITFIELD_MEMBER__FILEPOSITION = STRUCT_MEMBER__FILEPOSITION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_BITFIELD_MEMBER__TYPE = STRUCT_MEMBER__TYPE;

	/**
	 * The feature id for the '<em><b>Bitfield Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_BITFIELD_MEMBER__BITFIELD_VALUE = STRUCT_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Struct Bitfield Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_BITFIELD_MEMBER_FEATURE_COUNT = STRUCT_MEMBER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Struct Bitfield Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_BITFIELD_MEMBER_OPERATION_COUNT = STRUCT_MEMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.metadom.hls.ssamodel.impl.PointerTypeImpl <em>Pointer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.metadom.hls.ssamodel.impl.PointerTypeImpl
	 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getPointerType()
	 * @generated
	 */
	int POINTER_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_TYPE__NAME = REFERENCE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_TYPE__COMMENT = REFERENCE_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Fileposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_TYPE__FILEPOSITION = REFERENCE_TYPE__FILEPOSITION;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_TYPE__SIZE = REFERENCE_TYPE__SIZE;

	/**
	 * The feature id for the '<em><b>Referenced Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_TYPE__REFERENCED_TYPE = REFERENCE_TYPE__REFERENCED_TYPE;

	/**
	 * The number of structural features of the '<em>Pointer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_TYPE_FEATURE_COUNT = REFERENCE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pointer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_TYPE_OPERATION_COUNT = REFERENCE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.metadom.hls.ssamodel.impl.ArrayTypeImpl <em>Array Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.metadom.hls.ssamodel.impl.ArrayTypeImpl
	 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getArrayType()
	 * @generated
	 */
	int ARRAY_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__NAME = REFERENCE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__COMMENT = REFERENCE_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Fileposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__FILEPOSITION = REFERENCE_TYPE__FILEPOSITION;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__SIZE = REFERENCE_TYPE__SIZE;

	/**
	 * The feature id for the '<em><b>Referenced Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__REFERENCED_TYPE = REFERENCE_TYPE__REFERENCED_TYPE;

	/**
	 * The feature id for the '<em><b>Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__LENGTH = REFERENCE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Array Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_FEATURE_COUNT = REFERENCE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Array Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_OPERATION_COUNT = REFERENCE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.metadom.hls.ssamodel.impl.SsaNodeImpl <em>Ssa Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.metadom.hls.ssamodel.impl.SsaNodeImpl
	 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaNode()
	 * @generated
	 */
	int SSA_NODE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_NODE__NAME = SSA_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_NODE__COMMENT = SSA_OBJECT__COMMENT;

	/**
	 * The feature id for the '<em><b>Fileposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_NODE__FILEPOSITION = SSA_OBJECT__FILEPOSITION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_NODE__TYPE = SSA_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_NODE__PARENT = SSA_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_NODE__VAR = SSA_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ssa Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_NODE__SSA_INDEX = SSA_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_NODE__ORIGIN = SSA_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_NODE__GID = SSA_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Ssa Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_NODE_FEATURE_COUNT = SSA_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Ssa Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_NODE_OPERATION_COUNT = SSA_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.metadom.hls.ssamodel.impl.SsaAssignImpl <em>Ssa Assign</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.metadom.hls.ssamodel.impl.SsaAssignImpl
	 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaAssign()
	 * @generated
	 */
	int SSA_ASSIGN = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_ASSIGN__NAME = SSA_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_ASSIGN__COMMENT = SSA_NODE__COMMENT;

	/**
	 * The feature id for the '<em><b>Fileposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_ASSIGN__FILEPOSITION = SSA_NODE__FILEPOSITION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_ASSIGN__TYPE = SSA_NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_ASSIGN__PARENT = SSA_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_ASSIGN__VAR = SSA_NODE__VAR;

	/**
	 * The feature id for the '<em><b>Ssa Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_ASSIGN__SSA_INDEX = SSA_NODE__SSA_INDEX;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_ASSIGN__ORIGIN = SSA_NODE__ORIGIN;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_ASSIGN__GID = SSA_NODE__GID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_ASSIGN__VALUE = SSA_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ssa Assign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_ASSIGN_FEATURE_COUNT = SSA_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ssa Assign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_ASSIGN_OPERATION_COUNT = SSA_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.metadom.hls.ssamodel.impl.SsaConstImpl <em>Ssa Const</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.metadom.hls.ssamodel.impl.SsaConstImpl
	 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaConst()
	 * @generated
	 */
	int SSA_CONST = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_CONST__NAME = SSA_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_CONST__COMMENT = SSA_NODE__COMMENT;

	/**
	 * The feature id for the '<em><b>Fileposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_CONST__FILEPOSITION = SSA_NODE__FILEPOSITION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_CONST__TYPE = SSA_NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_CONST__PARENT = SSA_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_CONST__VAR = SSA_NODE__VAR;

	/**
	 * The feature id for the '<em><b>Ssa Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_CONST__SSA_INDEX = SSA_NODE__SSA_INDEX;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_CONST__ORIGIN = SSA_NODE__ORIGIN;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_CONST__GID = SSA_NODE__GID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_CONST__VALUE = SSA_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ssa Const</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_CONST_FEATURE_COUNT = SSA_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ssa Const</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_CONST_OPERATION_COUNT = SSA_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.metadom.hls.ssamodel.impl.SsaBinaryOperatorImpl <em>Ssa Binary Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.metadom.hls.ssamodel.impl.SsaBinaryOperatorImpl
	 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaBinaryOperator()
	 * @generated
	 */
	int SSA_BINARY_OPERATOR = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_BINARY_OPERATOR__NAME = SSA_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_BINARY_OPERATOR__COMMENT = SSA_NODE__COMMENT;

	/**
	 * The feature id for the '<em><b>Fileposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_BINARY_OPERATOR__FILEPOSITION = SSA_NODE__FILEPOSITION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_BINARY_OPERATOR__TYPE = SSA_NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_BINARY_OPERATOR__PARENT = SSA_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_BINARY_OPERATOR__VAR = SSA_NODE__VAR;

	/**
	 * The feature id for the '<em><b>Ssa Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_BINARY_OPERATOR__SSA_INDEX = SSA_NODE__SSA_INDEX;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_BINARY_OPERATOR__ORIGIN = SSA_NODE__ORIGIN;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_BINARY_OPERATOR__GID = SSA_NODE__GID;

	/**
	 * The feature id for the '<em><b>Operator Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_BINARY_OPERATOR__OPERATOR_KIND = SSA_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_BINARY_OPERATOR__LEFT = SSA_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_BINARY_OPERATOR__RIGHT = SSA_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ssa Binary Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_BINARY_OPERATOR_FEATURE_COUNT = SSA_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Ssa Binary Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_BINARY_OPERATOR_OPERATION_COUNT = SSA_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.metadom.hls.ssamodel.impl.SsaUnaryOperatorImpl <em>Ssa Unary Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.metadom.hls.ssamodel.impl.SsaUnaryOperatorImpl
	 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaUnaryOperator()
	 * @generated
	 */
	int SSA_UNARY_OPERATOR = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_UNARY_OPERATOR__NAME = SSA_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_UNARY_OPERATOR__COMMENT = SSA_NODE__COMMENT;

	/**
	 * The feature id for the '<em><b>Fileposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_UNARY_OPERATOR__FILEPOSITION = SSA_NODE__FILEPOSITION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_UNARY_OPERATOR__TYPE = SSA_NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_UNARY_OPERATOR__PARENT = SSA_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_UNARY_OPERATOR__VAR = SSA_NODE__VAR;

	/**
	 * The feature id for the '<em><b>Ssa Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_UNARY_OPERATOR__SSA_INDEX = SSA_NODE__SSA_INDEX;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_UNARY_OPERATOR__ORIGIN = SSA_NODE__ORIGIN;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_UNARY_OPERATOR__GID = SSA_NODE__GID;

	/**
	 * The feature id for the '<em><b>Operator Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_UNARY_OPERATOR__OPERATOR_KIND = SSA_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_UNARY_OPERATOR__OPERAND = SSA_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ssa Unary Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_UNARY_OPERATOR_FEATURE_COUNT = SSA_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ssa Unary Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_UNARY_OPERATOR_OPERATION_COUNT = SSA_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.metadom.hls.ssamodel.impl.SsaCallImpl <em>Ssa Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.metadom.hls.ssamodel.impl.SsaCallImpl
	 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaCall()
	 * @generated
	 */
	int SSA_CALL = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_CALL__NAME = SSA_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_CALL__COMMENT = SSA_NODE__COMMENT;

	/**
	 * The feature id for the '<em><b>Fileposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_CALL__FILEPOSITION = SSA_NODE__FILEPOSITION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_CALL__TYPE = SSA_NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_CALL__PARENT = SSA_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_CALL__VAR = SSA_NODE__VAR;

	/**
	 * The feature id for the '<em><b>Ssa Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_CALL__SSA_INDEX = SSA_NODE__SSA_INDEX;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_CALL__ORIGIN = SSA_NODE__ORIGIN;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_CALL__GID = SSA_NODE__GID;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_CALL__ARGUMENTS = SSA_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_CALL__FUNCTION = SSA_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ssa Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_CALL_FEATURE_COUNT = SSA_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ssa Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_CALL_OPERATION_COUNT = SSA_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.metadom.hls.ssamodel.impl.SsaPhiImpl <em>Ssa Phi</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.metadom.hls.ssamodel.impl.SsaPhiImpl
	 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaPhi()
	 * @generated
	 */
	int SSA_PHI = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_PHI__NAME = SSA_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_PHI__COMMENT = SSA_NODE__COMMENT;

	/**
	 * The feature id for the '<em><b>Fileposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_PHI__FILEPOSITION = SSA_NODE__FILEPOSITION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_PHI__TYPE = SSA_NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_PHI__PARENT = SSA_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_PHI__VAR = SSA_NODE__VAR;

	/**
	 * The feature id for the '<em><b>Ssa Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_PHI__SSA_INDEX = SSA_NODE__SSA_INDEX;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_PHI__ORIGIN = SSA_NODE__ORIGIN;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_PHI__GID = SSA_NODE__GID;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_PHI__PREVIOUS = SSA_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ssa Phi</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_PHI_FEATURE_COUNT = SSA_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ssa Phi</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_PHI_OPERATION_COUNT = SSA_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.metadom.hls.ssamodel.impl.SsaParamImpl <em>Ssa Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.metadom.hls.ssamodel.impl.SsaParamImpl
	 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaParam()
	 * @generated
	 */
	int SSA_PARAM = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_PARAM__NAME = SSA_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_PARAM__COMMENT = SSA_NODE__COMMENT;

	/**
	 * The feature id for the '<em><b>Fileposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_PARAM__FILEPOSITION = SSA_NODE__FILEPOSITION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_PARAM__TYPE = SSA_NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_PARAM__PARENT = SSA_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_PARAM__VAR = SSA_NODE__VAR;

	/**
	 * The feature id for the '<em><b>Ssa Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_PARAM__SSA_INDEX = SSA_NODE__SSA_INDEX;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_PARAM__ORIGIN = SSA_NODE__ORIGIN;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_PARAM__GID = SSA_NODE__GID;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_PARAM__DIRECTION = SSA_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ssa Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_PARAM_FEATURE_COUNT = SSA_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ssa Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_PARAM_OPERATION_COUNT = SSA_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.metadom.hls.ssamodel.impl.SsaReturnImpl <em>Ssa Return</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.metadom.hls.ssamodel.impl.SsaReturnImpl
	 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaReturn()
	 * @generated
	 */
	int SSA_RETURN = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_RETURN__NAME = SSA_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_RETURN__COMMENT = SSA_NODE__COMMENT;

	/**
	 * The feature id for the '<em><b>Fileposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_RETURN__FILEPOSITION = SSA_NODE__FILEPOSITION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_RETURN__TYPE = SSA_NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_RETURN__PARENT = SSA_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_RETURN__VAR = SSA_NODE__VAR;

	/**
	 * The feature id for the '<em><b>Ssa Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_RETURN__SSA_INDEX = SSA_NODE__SSA_INDEX;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_RETURN__ORIGIN = SSA_NODE__ORIGIN;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_RETURN__GID = SSA_NODE__GID;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_RETURN__EXPRESSION = SSA_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ssa Return</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_RETURN_FEATURE_COUNT = SSA_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ssa Return</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_RETURN_OPERATION_COUNT = SSA_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.metadom.hls.ssamodel.impl.SsaCastImpl <em>Ssa Cast</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.metadom.hls.ssamodel.impl.SsaCastImpl
	 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaCast()
	 * @generated
	 */
	int SSA_CAST = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_CAST__NAME = SSA_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_CAST__COMMENT = SSA_NODE__COMMENT;

	/**
	 * The feature id for the '<em><b>Fileposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_CAST__FILEPOSITION = SSA_NODE__FILEPOSITION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_CAST__TYPE = SSA_NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_CAST__PARENT = SSA_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_CAST__VAR = SSA_NODE__VAR;

	/**
	 * The feature id for the '<em><b>Ssa Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_CAST__SSA_INDEX = SSA_NODE__SSA_INDEX;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_CAST__ORIGIN = SSA_NODE__ORIGIN;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_CAST__GID = SSA_NODE__GID;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_CAST__FROM = SSA_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ssa Cast</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_CAST_FEATURE_COUNT = SSA_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ssa Cast</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_CAST_OPERATION_COUNT = SSA_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.metadom.hls.ssamodel.impl.SsaConditionalJumpImpl <em>Ssa Conditional Jump</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.metadom.hls.ssamodel.impl.SsaConditionalJumpImpl
	 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaConditionalJump()
	 * @generated
	 */
	int SSA_CONDITIONAL_JUMP = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_CONDITIONAL_JUMP__NAME = SSA_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_CONDITIONAL_JUMP__COMMENT = SSA_NODE__COMMENT;

	/**
	 * The feature id for the '<em><b>Fileposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_CONDITIONAL_JUMP__FILEPOSITION = SSA_NODE__FILEPOSITION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_CONDITIONAL_JUMP__TYPE = SSA_NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_CONDITIONAL_JUMP__PARENT = SSA_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_CONDITIONAL_JUMP__VAR = SSA_NODE__VAR;

	/**
	 * The feature id for the '<em><b>Ssa Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_CONDITIONAL_JUMP__SSA_INDEX = SSA_NODE__SSA_INDEX;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_CONDITIONAL_JUMP__ORIGIN = SSA_NODE__ORIGIN;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_CONDITIONAL_JUMP__GID = SSA_NODE__GID;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_CONDITIONAL_JUMP__CONDITION = SSA_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Then Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_CONDITIONAL_JUMP__THEN_BLOCK = SSA_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_CONDITIONAL_JUMP__ELSE_BLOCK = SSA_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ssa Conditional Jump</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_CONDITIONAL_JUMP_FEATURE_COUNT = SSA_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Ssa Conditional Jump</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_CONDITIONAL_JUMP_OPERATION_COUNT = SSA_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.metadom.hls.ssamodel.impl.SsaBlockImpl <em>Ssa Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.metadom.hls.ssamodel.impl.SsaBlockImpl
	 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaBlock()
	 * @generated
	 */
	int SSA_BLOCK = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_BLOCK__NAME = SSA_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_BLOCK__COMMENT = SSA_NODE__COMMENT;

	/**
	 * The feature id for the '<em><b>Fileposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_BLOCK__FILEPOSITION = SSA_NODE__FILEPOSITION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_BLOCK__TYPE = SSA_NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_BLOCK__PARENT = SSA_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_BLOCK__VAR = SSA_NODE__VAR;

	/**
	 * The feature id for the '<em><b>Ssa Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_BLOCK__SSA_INDEX = SSA_NODE__SSA_INDEX;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_BLOCK__ORIGIN = SSA_NODE__ORIGIN;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_BLOCK__GID = SSA_NODE__GID;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_BLOCK__NODES = SSA_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_BLOCK__NAME_SCOPE = SSA_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ssa Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_BLOCK_FEATURE_COUNT = SSA_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ssa Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_BLOCK_OPERATION_COUNT = SSA_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.metadom.hls.ssamodel.impl.SsaFunctionImpl <em>Ssa Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.metadom.hls.ssamodel.impl.SsaFunctionImpl
	 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaFunction()
	 * @generated
	 */
	int SSA_FUNCTION = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_FUNCTION__NAME = SSA_BLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_FUNCTION__COMMENT = SSA_BLOCK__COMMENT;

	/**
	 * The feature id for the '<em><b>Fileposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_FUNCTION__FILEPOSITION = SSA_BLOCK__FILEPOSITION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_FUNCTION__TYPE = SSA_BLOCK__TYPE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_FUNCTION__PARENT = SSA_BLOCK__PARENT;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_FUNCTION__VAR = SSA_BLOCK__VAR;

	/**
	 * The feature id for the '<em><b>Ssa Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_FUNCTION__SSA_INDEX = SSA_BLOCK__SSA_INDEX;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_FUNCTION__ORIGIN = SSA_BLOCK__ORIGIN;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_FUNCTION__GID = SSA_BLOCK__GID;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_FUNCTION__NODES = SSA_BLOCK__NODES;

	/**
	 * The feature id for the '<em><b>Name Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_FUNCTION__NAME_SCOPE = SSA_BLOCK__NAME_SCOPE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_FUNCTION__PARAMETERS = SSA_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_FUNCTION__RETURN_TYPE = SSA_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Var Arg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_FUNCTION__VAR_ARG = SSA_BLOCK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ssa Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_FUNCTION_FEATURE_COUNT = SSA_BLOCK_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Ssa Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_FUNCTION_OPERATION_COUNT = SSA_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.metadom.hls.ssamodel.impl.SsaStructReadImpl <em>Ssa Struct Read</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.metadom.hls.ssamodel.impl.SsaStructReadImpl
	 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaStructRead()
	 * @generated
	 */
	int SSA_STRUCT_READ = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_STRUCT_READ__NAME = SSA_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_STRUCT_READ__COMMENT = SSA_NODE__COMMENT;

	/**
	 * The feature id for the '<em><b>Fileposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_STRUCT_READ__FILEPOSITION = SSA_NODE__FILEPOSITION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_STRUCT_READ__TYPE = SSA_NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_STRUCT_READ__PARENT = SSA_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_STRUCT_READ__VAR = SSA_NODE__VAR;

	/**
	 * The feature id for the '<em><b>Ssa Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_STRUCT_READ__SSA_INDEX = SSA_NODE__SSA_INDEX;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_STRUCT_READ__ORIGIN = SSA_NODE__ORIGIN;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_STRUCT_READ__GID = SSA_NODE__GID;

	/**
	 * The feature id for the '<em><b>Struct</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_STRUCT_READ__STRUCT = SSA_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_STRUCT_READ__FIELD = SSA_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ssa Struct Read</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_STRUCT_READ_FEATURE_COUNT = SSA_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ssa Struct Read</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_STRUCT_READ_OPERATION_COUNT = SSA_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.metadom.hls.ssamodel.impl.SsaStructWriteImpl <em>Ssa Struct Write</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.metadom.hls.ssamodel.impl.SsaStructWriteImpl
	 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaStructWrite()
	 * @generated
	 */
	int SSA_STRUCT_WRITE = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_STRUCT_WRITE__NAME = SSA_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_STRUCT_WRITE__COMMENT = SSA_NODE__COMMENT;

	/**
	 * The feature id for the '<em><b>Fileposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_STRUCT_WRITE__FILEPOSITION = SSA_NODE__FILEPOSITION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_STRUCT_WRITE__TYPE = SSA_NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_STRUCT_WRITE__PARENT = SSA_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_STRUCT_WRITE__VAR = SSA_NODE__VAR;

	/**
	 * The feature id for the '<em><b>Ssa Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_STRUCT_WRITE__SSA_INDEX = SSA_NODE__SSA_INDEX;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_STRUCT_WRITE__ORIGIN = SSA_NODE__ORIGIN;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_STRUCT_WRITE__GID = SSA_NODE__GID;

	/**
	 * The feature id for the '<em><b>Struct</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_STRUCT_WRITE__STRUCT = SSA_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_STRUCT_WRITE__VALUE = SSA_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_STRUCT_WRITE__FIELD = SSA_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ssa Struct Write</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_STRUCT_WRITE_FEATURE_COUNT = SSA_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Ssa Struct Write</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_STRUCT_WRITE_OPERATION_COUNT = SSA_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.metadom.hls.ssamodel.impl.SsaArrayReadImpl <em>Ssa Array Read</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.metadom.hls.ssamodel.impl.SsaArrayReadImpl
	 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaArrayRead()
	 * @generated
	 */
	int SSA_ARRAY_READ = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_ARRAY_READ__NAME = SSA_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_ARRAY_READ__COMMENT = SSA_NODE__COMMENT;

	/**
	 * The feature id for the '<em><b>Fileposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_ARRAY_READ__FILEPOSITION = SSA_NODE__FILEPOSITION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_ARRAY_READ__TYPE = SSA_NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_ARRAY_READ__PARENT = SSA_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_ARRAY_READ__VAR = SSA_NODE__VAR;

	/**
	 * The feature id for the '<em><b>Ssa Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_ARRAY_READ__SSA_INDEX = SSA_NODE__SSA_INDEX;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_ARRAY_READ__ORIGIN = SSA_NODE__ORIGIN;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_ARRAY_READ__GID = SSA_NODE__GID;

	/**
	 * The feature id for the '<em><b>Array</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_ARRAY_READ__ARRAY = SSA_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Indices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_ARRAY_READ__INDICES = SSA_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ssa Array Read</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_ARRAY_READ_FEATURE_COUNT = SSA_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ssa Array Read</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_ARRAY_READ_OPERATION_COUNT = SSA_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.metadom.hls.ssamodel.impl.SsaArrayWriteImpl <em>Ssa Array Write</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.metadom.hls.ssamodel.impl.SsaArrayWriteImpl
	 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaArrayWrite()
	 * @generated
	 */
	int SSA_ARRAY_WRITE = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_ARRAY_WRITE__NAME = SSA_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_ARRAY_WRITE__COMMENT = SSA_NODE__COMMENT;

	/**
	 * The feature id for the '<em><b>Fileposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_ARRAY_WRITE__FILEPOSITION = SSA_NODE__FILEPOSITION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_ARRAY_WRITE__TYPE = SSA_NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_ARRAY_WRITE__PARENT = SSA_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_ARRAY_WRITE__VAR = SSA_NODE__VAR;

	/**
	 * The feature id for the '<em><b>Ssa Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_ARRAY_WRITE__SSA_INDEX = SSA_NODE__SSA_INDEX;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_ARRAY_WRITE__ORIGIN = SSA_NODE__ORIGIN;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_ARRAY_WRITE__GID = SSA_NODE__GID;

	/**
	 * The feature id for the '<em><b>Array</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_ARRAY_WRITE__ARRAY = SSA_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Indices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_ARRAY_WRITE__INDICES = SSA_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_ARRAY_WRITE__VALUE = SSA_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ssa Array Write</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_ARRAY_WRITE_FEATURE_COUNT = SSA_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Ssa Array Write</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_ARRAY_WRITE_OPERATION_COUNT = SSA_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.metadom.hls.ssamodel.impl.FilePositionImpl <em>File Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.metadom.hls.ssamodel.impl.FilePositionImpl
	 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getFilePosition()
	 * @generated
	 */
	int FILE_POSITION = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_POSITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_POSITION__LINE = 1;

	/**
	 * The feature id for the '<em><b>Start Position In Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_POSITION__START_POSITION_IN_LINE = 2;

	/**
	 * The feature id for the '<em><b>End Position In Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_POSITION__END_POSITION_IN_LINE = 3;

	/**
	 * The feature id for the '<em><b>Start Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_POSITION__START_POSITION = 4;

	/**
	 * The feature id for the '<em><b>End Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_POSITION__END_POSITION = 5;

	/**
	 * The number of structural features of the '<em>File Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_POSITION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>File Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_POSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.metadom.hls.ssamodel.impl.SsaVarImpl <em>Ssa Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.metadom.hls.ssamodel.impl.SsaVarImpl
	 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaVar()
	 * @generated
	 */
	int SSA_VAR = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_VAR__NAME = SSA_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_VAR__COMMENT = SSA_OBJECT__COMMENT;

	/**
	 * The feature id for the '<em><b>Fileposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_VAR__FILEPOSITION = SSA_OBJECT__FILEPOSITION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_VAR__TYPE = SSA_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Init Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_VAR__INIT_NODE = SSA_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_VAR__ORIGIN = SSA_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ssa Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_VAR_FEATURE_COUNT = SSA_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Ssa Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_VAR_OPERATION_COUNT = SSA_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.metadom.hls.ssamodel.impl.CNameScopeImpl <em>CName Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.metadom.hls.ssamodel.impl.CNameScopeImpl
	 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getCNameScope()
	 * @generated
	 */
	int CNAME_SCOPE = 31;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CNAME_SCOPE__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Names</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CNAME_SCOPE__NAMES = 1;

	/**
	 * The feature id for the '<em><b>Vars</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CNAME_SCOPE__VARS = 2;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CNAME_SCOPE__TYPES = 3;

	/**
	 * The feature id for the '<em><b>Constants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CNAME_SCOPE__CONSTANTS = 4;

	/**
	 * The number of structural features of the '<em>CName Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CNAME_SCOPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>CName Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CNAME_SCOPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.metadom.hls.ssamodel.impl.StringToCNameMapImpl <em>String To CName Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.metadom.hls.ssamodel.impl.StringToCNameMapImpl
	 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getStringToCNameMap()
	 * @generated
	 */
	int STRING_TO_CNAME_MAP = 32;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_CNAME_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_CNAME_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To CName Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_CNAME_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To CName Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_CNAME_MAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.metadom.hls.ssamodel.impl.SsaExplicitCastImpl <em>Ssa Explicit Cast</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.metadom.hls.ssamodel.impl.SsaExplicitCastImpl
	 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaExplicitCast()
	 * @generated
	 */
	int SSA_EXPLICIT_CAST = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_EXPLICIT_CAST__NAME = SSA_CAST__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_EXPLICIT_CAST__COMMENT = SSA_CAST__COMMENT;

	/**
	 * The feature id for the '<em><b>Fileposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_EXPLICIT_CAST__FILEPOSITION = SSA_CAST__FILEPOSITION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_EXPLICIT_CAST__TYPE = SSA_CAST__TYPE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_EXPLICIT_CAST__PARENT = SSA_CAST__PARENT;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_EXPLICIT_CAST__VAR = SSA_CAST__VAR;

	/**
	 * The feature id for the '<em><b>Ssa Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_EXPLICIT_CAST__SSA_INDEX = SSA_CAST__SSA_INDEX;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_EXPLICIT_CAST__ORIGIN = SSA_CAST__ORIGIN;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_EXPLICIT_CAST__GID = SSA_CAST__GID;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_EXPLICIT_CAST__FROM = SSA_CAST__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_EXPLICIT_CAST__TO = SSA_CAST_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ssa Explicit Cast</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_EXPLICIT_CAST_FEATURE_COUNT = SSA_CAST_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ssa Explicit Cast</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_EXPLICIT_CAST_OPERATION_COUNT = SSA_CAST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.metadom.hls.ssamodel.impl.SsaDowhileImpl <em>Ssa Dowhile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.metadom.hls.ssamodel.impl.SsaDowhileImpl
	 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaDowhile()
	 * @generated
	 */
	int SSA_DOWHILE = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_DOWHILE__NAME = SSA_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_DOWHILE__COMMENT = SSA_NODE__COMMENT;

	/**
	 * The feature id for the '<em><b>Fileposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_DOWHILE__FILEPOSITION = SSA_NODE__FILEPOSITION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_DOWHILE__TYPE = SSA_NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_DOWHILE__PARENT = SSA_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_DOWHILE__VAR = SSA_NODE__VAR;

	/**
	 * The feature id for the '<em><b>Ssa Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_DOWHILE__SSA_INDEX = SSA_NODE__SSA_INDEX;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_DOWHILE__ORIGIN = SSA_NODE__ORIGIN;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_DOWHILE__GID = SSA_NODE__GID;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_DOWHILE__BODY = SSA_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cond</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_DOWHILE__COND = SSA_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Merge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_DOWHILE__MERGE = SSA_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Loop Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_DOWHILE__LOOP_TYPE = SSA_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Cond Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_DOWHILE__COND_NODE = SSA_NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Dowhile Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_DOWHILE__DOWHILE_TYPE = SSA_NODE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Ssa Dowhile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_DOWHILE_FEATURE_COUNT = SSA_NODE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Ssa Dowhile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_DOWHILE_OPERATION_COUNT = SSA_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.metadom.hls.ssamodel.impl.SsaSwitchImpl <em>Ssa Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.metadom.hls.ssamodel.impl.SsaSwitchImpl
	 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaSwitch()
	 * @generated
	 */
	int SSA_SWITCH = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_SWITCH__NAME = SSA_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_SWITCH__COMMENT = SSA_NODE__COMMENT;

	/**
	 * The feature id for the '<em><b>Fileposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_SWITCH__FILEPOSITION = SSA_NODE__FILEPOSITION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_SWITCH__TYPE = SSA_NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_SWITCH__PARENT = SSA_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_SWITCH__VAR = SSA_NODE__VAR;

	/**
	 * The feature id for the '<em><b>Ssa Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_SWITCH__SSA_INDEX = SSA_NODE__SSA_INDEX;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_SWITCH__ORIGIN = SSA_NODE__ORIGIN;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_SWITCH__GID = SSA_NODE__GID;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_SWITCH__SELECTOR = SSA_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_SWITCH__CASES = SSA_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Merge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_SWITCH__MERGE = SSA_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_SWITCH__DEFAULT = SSA_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Switch Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_SWITCH__SWITCH_TYPE = SSA_NODE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Ssa Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_SWITCH_FEATURE_COUNT = SSA_NODE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Ssa Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_SWITCH_OPERATION_COUNT = SSA_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.metadom.hls.ssamodel.impl.SsaCaseImpl <em>Ssa Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.metadom.hls.ssamodel.impl.SsaCaseImpl
	 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaCase()
	 * @generated
	 */
	int SSA_CASE = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_CASE__NAME = SSA_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_CASE__COMMENT = SSA_OBJECT__COMMENT;

	/**
	 * The feature id for the '<em><b>Fileposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_CASE__FILEPOSITION = SSA_OBJECT__FILEPOSITION;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_CASE__NODE = SSA_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_CASE__VALUES = SSA_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ssa Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_CASE_FEATURE_COUNT = SSA_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ssa Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_CASE_OPERATION_COUNT = SSA_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.metadom.hls.ssamodel.impl.SsaControlImpl <em>Ssa Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.metadom.hls.ssamodel.impl.SsaControlImpl
	 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaControl()
	 * @generated
	 */
	int SSA_CONTROL = 38;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_CONTROL__NAME = SSA_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_CONTROL__COMMENT = SSA_NODE__COMMENT;

	/**
	 * The feature id for the '<em><b>Fileposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_CONTROL__FILEPOSITION = SSA_NODE__FILEPOSITION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_CONTROL__TYPE = SSA_NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_CONTROL__PARENT = SSA_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_CONTROL__VAR = SSA_NODE__VAR;

	/**
	 * The feature id for the '<em><b>Ssa Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_CONTROL__SSA_INDEX = SSA_NODE__SSA_INDEX;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_CONTROL__ORIGIN = SSA_NODE__ORIGIN;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_CONTROL__GID = SSA_NODE__GID;

	/**
	 * The feature id for the '<em><b>Control Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_CONTROL__CONTROL_TYPE = SSA_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ssa Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_CONTROL_FEATURE_COUNT = SSA_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ssa Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_CONTROL_OPERATION_COUNT = SSA_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.metadom.hls.ssamodel.impl.SsaAbstractInitImpl <em>Ssa Abstract Init</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.metadom.hls.ssamodel.impl.SsaAbstractInitImpl
	 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaAbstractInit()
	 * @generated
	 */
	int SSA_ABSTRACT_INIT = 39;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_ABSTRACT_INIT__NAME = SSA_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_ABSTRACT_INIT__COMMENT = SSA_NODE__COMMENT;

	/**
	 * The feature id for the '<em><b>Fileposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_ABSTRACT_INIT__FILEPOSITION = SSA_NODE__FILEPOSITION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_ABSTRACT_INIT__TYPE = SSA_NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_ABSTRACT_INIT__PARENT = SSA_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_ABSTRACT_INIT__VAR = SSA_NODE__VAR;

	/**
	 * The feature id for the '<em><b>Ssa Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_ABSTRACT_INIT__SSA_INDEX = SSA_NODE__SSA_INDEX;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_ABSTRACT_INIT__ORIGIN = SSA_NODE__ORIGIN;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_ABSTRACT_INIT__GID = SSA_NODE__GID;

	/**
	 * The number of structural features of the '<em>Ssa Abstract Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_ABSTRACT_INIT_FEATURE_COUNT = SSA_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ssa Abstract Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_ABSTRACT_INIT_OPERATION_COUNT = SSA_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.metadom.hls.ssamodel.impl.SsaInitListImpl <em>Ssa Init List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.metadom.hls.ssamodel.impl.SsaInitListImpl
	 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaInitList()
	 * @generated
	 */
	int SSA_INIT_LIST = 40;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_INIT_LIST__NAME = SSA_ABSTRACT_INIT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_INIT_LIST__COMMENT = SSA_ABSTRACT_INIT__COMMENT;

	/**
	 * The feature id for the '<em><b>Fileposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_INIT_LIST__FILEPOSITION = SSA_ABSTRACT_INIT__FILEPOSITION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_INIT_LIST__TYPE = SSA_ABSTRACT_INIT__TYPE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_INIT_LIST__PARENT = SSA_ABSTRACT_INIT__PARENT;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_INIT_LIST__VAR = SSA_ABSTRACT_INIT__VAR;

	/**
	 * The feature id for the '<em><b>Ssa Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_INIT_LIST__SSA_INDEX = SSA_ABSTRACT_INIT__SSA_INDEX;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_INIT_LIST__ORIGIN = SSA_ABSTRACT_INIT__ORIGIN;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_INIT_LIST__GID = SSA_ABSTRACT_INIT__GID;

	/**
	 * The feature id for the '<em><b>Inits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_INIT_LIST__INITS = SSA_ABSTRACT_INIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ssa Init List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_INIT_LIST_FEATURE_COUNT = SSA_ABSTRACT_INIT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ssa Init List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_INIT_LIST_OPERATION_COUNT = SSA_ABSTRACT_INIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.metadom.hls.ssamodel.impl.SsaInitImpl <em>Ssa Init</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.metadom.hls.ssamodel.impl.SsaInitImpl
	 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaInit()
	 * @generated
	 */
	int SSA_INIT = 41;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_INIT__NAME = SSA_ABSTRACT_INIT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_INIT__COMMENT = SSA_ABSTRACT_INIT__COMMENT;

	/**
	 * The feature id for the '<em><b>Fileposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_INIT__FILEPOSITION = SSA_ABSTRACT_INIT__FILEPOSITION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_INIT__TYPE = SSA_ABSTRACT_INIT__TYPE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_INIT__PARENT = SSA_ABSTRACT_INIT__PARENT;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_INIT__VAR = SSA_ABSTRACT_INIT__VAR;

	/**
	 * The feature id for the '<em><b>Ssa Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_INIT__SSA_INDEX = SSA_ABSTRACT_INIT__SSA_INDEX;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_INIT__ORIGIN = SSA_ABSTRACT_INIT__ORIGIN;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_INIT__GID = SSA_ABSTRACT_INIT__GID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_INIT__VALUE = SSA_ABSTRACT_INIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ssa Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_INIT_FEATURE_COUNT = SSA_ABSTRACT_INIT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ssa Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_INIT_OPERATION_COUNT = SSA_ABSTRACT_INIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.metadom.hls.ssamodel.impl.FunctionTypeImpl <em>Function Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.metadom.hls.ssamodel.impl.FunctionTypeImpl
	 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getFunctionType()
	 * @generated
	 */
	int FUNCTION_TYPE = 42;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__COMMENT = TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Fileposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__FILEPOSITION = TYPE__FILEPOSITION;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__SIZE = TYPE__SIZE;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__RETURN_TYPE = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Param Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__PARAM_TYPES = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Function Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Function Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.metadom.hls.ssamodel.impl.SsaIndirectWriteImpl <em>Ssa Indirect Write</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.metadom.hls.ssamodel.impl.SsaIndirectWriteImpl
	 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaIndirectWrite()
	 * @generated
	 */
	int SSA_INDIRECT_WRITE = 43;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_INDIRECT_WRITE__NAME = SSA_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_INDIRECT_WRITE__COMMENT = SSA_NODE__COMMENT;

	/**
	 * The feature id for the '<em><b>Fileposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_INDIRECT_WRITE__FILEPOSITION = SSA_NODE__FILEPOSITION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_INDIRECT_WRITE__TYPE = SSA_NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_INDIRECT_WRITE__PARENT = SSA_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_INDIRECT_WRITE__VAR = SSA_NODE__VAR;

	/**
	 * The feature id for the '<em><b>Ssa Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_INDIRECT_WRITE__SSA_INDEX = SSA_NODE__SSA_INDEX;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_INDIRECT_WRITE__ORIGIN = SSA_NODE__ORIGIN;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_INDIRECT_WRITE__GID = SSA_NODE__GID;

	/**
	 * The feature id for the '<em><b>Pointer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_INDIRECT_WRITE__POINTER = SSA_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_INDIRECT_WRITE__VALUE = SSA_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ssa Indirect Write</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_INDIRECT_WRITE_FEATURE_COUNT = SSA_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ssa Indirect Write</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_INDIRECT_WRITE_OPERATION_COUNT = SSA_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.metadom.hls.ssamodel.impl.SsaIndirectReadImpl <em>Ssa Indirect Read</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.metadom.hls.ssamodel.impl.SsaIndirectReadImpl
	 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaIndirectRead()
	 * @generated
	 */
	int SSA_INDIRECT_READ = 44;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_INDIRECT_READ__NAME = SSA_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_INDIRECT_READ__COMMENT = SSA_NODE__COMMENT;

	/**
	 * The feature id for the '<em><b>Fileposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_INDIRECT_READ__FILEPOSITION = SSA_NODE__FILEPOSITION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_INDIRECT_READ__TYPE = SSA_NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_INDIRECT_READ__PARENT = SSA_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_INDIRECT_READ__VAR = SSA_NODE__VAR;

	/**
	 * The feature id for the '<em><b>Ssa Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_INDIRECT_READ__SSA_INDEX = SSA_NODE__SSA_INDEX;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_INDIRECT_READ__ORIGIN = SSA_NODE__ORIGIN;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_INDIRECT_READ__GID = SSA_NODE__GID;

	/**
	 * The feature id for the '<em><b>Pointer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_INDIRECT_READ__POINTER = SSA_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ssa Indirect Read</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_INDIRECT_READ_FEATURE_COUNT = SSA_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ssa Indirect Read</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_INDIRECT_READ_OPERATION_COUNT = SSA_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.metadom.hls.ssamodel.impl.SsaNodeRefImpl <em>Ssa Node Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.metadom.hls.ssamodel.impl.SsaNodeRefImpl
	 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaNodeRef()
	 * @generated
	 */
	int SSA_NODE_REF = 45;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_NODE_REF__NODE = 0;

	/**
	 * The feature id for the '<em><b>Fileposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_NODE_REF__FILEPOSITION = 1;

	/**
	 * The number of structural features of the '<em>Ssa Node Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_NODE_REF_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Ssa Node Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_NODE_REF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.metadom.hls.ssamodel.impl.SsaGotoImpl <em>Ssa Goto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.metadom.hls.ssamodel.impl.SsaGotoImpl
	 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaGoto()
	 * @generated
	 */
	int SSA_GOTO = 46;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_GOTO__NAME = SSA_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_GOTO__COMMENT = SSA_NODE__COMMENT;

	/**
	 * The feature id for the '<em><b>Fileposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_GOTO__FILEPOSITION = SSA_NODE__FILEPOSITION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_GOTO__TYPE = SSA_NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_GOTO__PARENT = SSA_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_GOTO__VAR = SSA_NODE__VAR;

	/**
	 * The feature id for the '<em><b>Ssa Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_GOTO__SSA_INDEX = SSA_NODE__SSA_INDEX;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_GOTO__ORIGIN = SSA_NODE__ORIGIN;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_GOTO__GID = SSA_NODE__GID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_GOTO__LABEL = SSA_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ssa Goto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_GOTO_FEATURE_COUNT = SSA_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ssa Goto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_GOTO_OPERATION_COUNT = SSA_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.metadom.hls.ssamodel.impl.SsaLabelImpl <em>Ssa Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.metadom.hls.ssamodel.impl.SsaLabelImpl
	 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaLabel()
	 * @generated
	 */
	int SSA_LABEL = 47;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_LABEL__NAME = SSA_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_LABEL__COMMENT = SSA_NODE__COMMENT;

	/**
	 * The feature id for the '<em><b>Fileposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_LABEL__FILEPOSITION = SSA_NODE__FILEPOSITION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_LABEL__TYPE = SSA_NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_LABEL__PARENT = SSA_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_LABEL__VAR = SSA_NODE__VAR;

	/**
	 * The feature id for the '<em><b>Ssa Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_LABEL__SSA_INDEX = SSA_NODE__SSA_INDEX;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_LABEL__ORIGIN = SSA_NODE__ORIGIN;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_LABEL__GID = SSA_NODE__GID;

	/**
	 * The number of structural features of the '<em>Ssa Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_LABEL_FEATURE_COUNT = SSA_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ssa Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_LABEL_OPERATION_COUNT = SSA_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.metadom.hls.ssamodel.impl.SsaArgumentImpl <em>Ssa Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.metadom.hls.ssamodel.impl.SsaArgumentImpl
	 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaArgument()
	 * @generated
	 */
	int SSA_ARGUMENT = 49;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_ARGUMENT__NODE = SSA_NODE_REF__NODE;

	/**
	 * The feature id for the '<em><b>Fileposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_ARGUMENT__FILEPOSITION = SSA_NODE_REF__FILEPOSITION;

	/**
	 * The feature id for the '<em><b>Param</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_ARGUMENT__PARAM = SSA_NODE_REF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ssa Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_ARGUMENT_FEATURE_COUNT = SSA_NODE_REF_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ssa Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_ARGUMENT_OPERATION_COUNT = SSA_NODE_REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.metadom.hls.ssamodel.impl.SsaPassByRefArgumentImpl <em>Ssa Pass By Ref Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.metadom.hls.ssamodel.impl.SsaPassByRefArgumentImpl
	 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaPassByRefArgument()
	 * @generated
	 */
	int SSA_PASS_BY_REF_ARGUMENT = 48;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_PASS_BY_REF_ARGUMENT__NODE = SSA_ARGUMENT__NODE;

	/**
	 * The feature id for the '<em><b>Fileposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_PASS_BY_REF_ARGUMENT__FILEPOSITION = SSA_ARGUMENT__FILEPOSITION;

	/**
	 * The feature id for the '<em><b>Param</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_PASS_BY_REF_ARGUMENT__PARAM = SSA_ARGUMENT__PARAM;

	/**
	 * The feature id for the '<em><b>Out Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_PASS_BY_REF_ARGUMENT__OUT_NODE = SSA_ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ssa Pass By Ref Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_PASS_BY_REF_ARGUMENT_FEATURE_COUNT = SSA_ARGUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ssa Pass By Ref Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_PASS_BY_REF_ARGUMENT_OPERATION_COUNT = SSA_ARGUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.metadom.hls.ssamodel.impl.SsaPassByRefParamImpl <em>Ssa Pass By Ref Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.metadom.hls.ssamodel.impl.SsaPassByRefParamImpl
	 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaPassByRefParam()
	 * @generated
	 */
	int SSA_PASS_BY_REF_PARAM = 50;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_PASS_BY_REF_PARAM__NAME = SSA_PARAM__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_PASS_BY_REF_PARAM__COMMENT = SSA_PARAM__COMMENT;

	/**
	 * The feature id for the '<em><b>Fileposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_PASS_BY_REF_PARAM__FILEPOSITION = SSA_PARAM__FILEPOSITION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_PASS_BY_REF_PARAM__TYPE = SSA_PARAM__TYPE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_PASS_BY_REF_PARAM__PARENT = SSA_PARAM__PARENT;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_PASS_BY_REF_PARAM__VAR = SSA_PARAM__VAR;

	/**
	 * The feature id for the '<em><b>Ssa Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_PASS_BY_REF_PARAM__SSA_INDEX = SSA_PARAM__SSA_INDEX;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_PASS_BY_REF_PARAM__ORIGIN = SSA_PARAM__ORIGIN;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_PASS_BY_REF_PARAM__GID = SSA_PARAM__GID;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_PASS_BY_REF_PARAM__DIRECTION = SSA_PARAM__DIRECTION;

	/**
	 * The feature id for the '<em><b>Out Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_PASS_BY_REF_PARAM__OUT_NODE = SSA_PARAM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ssa Pass By Ref Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_PASS_BY_REF_PARAM_FEATURE_COUNT = SSA_PARAM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ssa Pass By Ref Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_PASS_BY_REF_PARAM_OPERATION_COUNT = SSA_PARAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.metadom.hls.ssamodel.impl.SsaOutputArgumentImpl <em>Ssa Output Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.metadom.hls.ssamodel.impl.SsaOutputArgumentImpl
	 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaOutputArgument()
	 * @generated
	 */
	int SSA_OUTPUT_ARGUMENT = 51;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_OUTPUT_ARGUMENT__NAME = SSA_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_OUTPUT_ARGUMENT__COMMENT = SSA_NODE__COMMENT;

	/**
	 * The feature id for the '<em><b>Fileposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_OUTPUT_ARGUMENT__FILEPOSITION = SSA_NODE__FILEPOSITION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_OUTPUT_ARGUMENT__TYPE = SSA_NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_OUTPUT_ARGUMENT__PARENT = SSA_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_OUTPUT_ARGUMENT__VAR = SSA_NODE__VAR;

	/**
	 * The feature id for the '<em><b>Ssa Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_OUTPUT_ARGUMENT__SSA_INDEX = SSA_NODE__SSA_INDEX;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_OUTPUT_ARGUMENT__ORIGIN = SSA_NODE__ORIGIN;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_OUTPUT_ARGUMENT__GID = SSA_NODE__GID;

	/**
	 * The number of structural features of the '<em>Ssa Output Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_OUTPUT_ARGUMENT_FEATURE_COUNT = SSA_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ssa Output Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_OUTPUT_ARGUMENT_OPERATION_COUNT = SSA_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.metadom.hls.ssamodel.impl.SsaSizeofImpl <em>Ssa Sizeof</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.metadom.hls.ssamodel.impl.SsaSizeofImpl
	 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaSizeof()
	 * @generated
	 */
	int SSA_SIZEOF = 53;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_SIZEOF__NAME = SSA_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_SIZEOF__COMMENT = SSA_NODE__COMMENT;

	/**
	 * The feature id for the '<em><b>Fileposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_SIZEOF__FILEPOSITION = SSA_NODE__FILEPOSITION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_SIZEOF__TYPE = SSA_NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_SIZEOF__PARENT = SSA_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_SIZEOF__VAR = SSA_NODE__VAR;

	/**
	 * The feature id for the '<em><b>Ssa Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_SIZEOF__SSA_INDEX = SSA_NODE__SSA_INDEX;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_SIZEOF__ORIGIN = SSA_NODE__ORIGIN;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_SIZEOF__GID = SSA_NODE__GID;

	/**
	 * The number of structural features of the '<em>Ssa Sizeof</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_SIZEOF_FEATURE_COUNT = SSA_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ssa Sizeof</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_SIZEOF_OPERATION_COUNT = SSA_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.metadom.hls.ssamodel.impl.SsaSizeofTypeImpl <em>Ssa Sizeof Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.metadom.hls.ssamodel.impl.SsaSizeofTypeImpl
	 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaSizeofType()
	 * @generated
	 */
	int SSA_SIZEOF_TYPE = 54;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_SIZEOF_TYPE__NAME = SSA_SIZEOF__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_SIZEOF_TYPE__COMMENT = SSA_SIZEOF__COMMENT;

	/**
	 * The feature id for the '<em><b>Fileposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_SIZEOF_TYPE__FILEPOSITION = SSA_SIZEOF__FILEPOSITION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_SIZEOF_TYPE__TYPE = SSA_SIZEOF__TYPE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_SIZEOF_TYPE__PARENT = SSA_SIZEOF__PARENT;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_SIZEOF_TYPE__VAR = SSA_SIZEOF__VAR;

	/**
	 * The feature id for the '<em><b>Ssa Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_SIZEOF_TYPE__SSA_INDEX = SSA_SIZEOF__SSA_INDEX;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_SIZEOF_TYPE__ORIGIN = SSA_SIZEOF__ORIGIN;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_SIZEOF_TYPE__GID = SSA_SIZEOF__GID;

	/**
	 * The feature id for the '<em><b>Sizeof Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_SIZEOF_TYPE__SIZEOF_TYPE = SSA_SIZEOF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ssa Sizeof Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_SIZEOF_TYPE_FEATURE_COUNT = SSA_SIZEOF_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ssa Sizeof Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_SIZEOF_TYPE_OPERATION_COUNT = SSA_SIZEOF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.metadom.hls.ssamodel.impl.SsaSizeofVarImpl <em>Ssa Sizeof Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.metadom.hls.ssamodel.impl.SsaSizeofVarImpl
	 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaSizeofVar()
	 * @generated
	 */
	int SSA_SIZEOF_VAR = 55;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_SIZEOF_VAR__NAME = SSA_SIZEOF__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_SIZEOF_VAR__COMMENT = SSA_SIZEOF__COMMENT;

	/**
	 * The feature id for the '<em><b>Fileposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_SIZEOF_VAR__FILEPOSITION = SSA_SIZEOF__FILEPOSITION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_SIZEOF_VAR__TYPE = SSA_SIZEOF__TYPE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_SIZEOF_VAR__PARENT = SSA_SIZEOF__PARENT;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_SIZEOF_VAR__VAR = SSA_SIZEOF__VAR;

	/**
	 * The feature id for the '<em><b>Ssa Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_SIZEOF_VAR__SSA_INDEX = SSA_SIZEOF__SSA_INDEX;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_SIZEOF_VAR__ORIGIN = SSA_SIZEOF__ORIGIN;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_SIZEOF_VAR__GID = SSA_SIZEOF__GID;

	/**
	 * The feature id for the '<em><b>Sizeof Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_SIZEOF_VAR__SIZEOF_EXPR = SSA_SIZEOF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ssa Sizeof Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_SIZEOF_VAR_FEATURE_COUNT = SSA_SIZEOF_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ssa Sizeof Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSA_SIZEOF_VAR_OPERATION_COUNT = SSA_SIZEOF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.metadom.hls.ssamodel.impl.CompileTimeExpressionImpl <em>Compile Time Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.metadom.hls.ssamodel.impl.CompileTimeExpressionImpl
	 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getCompileTimeExpression()
	 * @generated
	 */
	int COMPILE_TIME_EXPRESSION = 56;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILE_TIME_EXPRESSION__NAME = SSA_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILE_TIME_EXPRESSION__COMMENT = SSA_OBJECT__COMMENT;

	/**
	 * The feature id for the '<em><b>Fileposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILE_TIME_EXPRESSION__FILEPOSITION = SSA_OBJECT__FILEPOSITION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILE_TIME_EXPRESSION__VALUE = SSA_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILE_TIME_EXPRESSION__NODE = SSA_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Compile Time Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILE_TIME_EXPRESSION_FEATURE_COUNT = SSA_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Compile Time Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILE_TIME_EXPRESSION_OPERATION_COUNT = SSA_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.metadom.hls.ssamodel.SsaBinaryOperatorKind <em>Ssa Binary Operator Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.metadom.hls.ssamodel.SsaBinaryOperatorKind
	 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaBinaryOperatorKind()
	 * @generated
	 */
	int SSA_BINARY_OPERATOR_KIND = 57;

	/**
	 * The meta object id for the '{@link hu.metadom.hls.ssamodel.SsaUnaryOperatorKind <em>Ssa Unary Operator Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.metadom.hls.ssamodel.SsaUnaryOperatorKind
	 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaUnaryOperatorKind()
	 * @generated
	 */
	int SSA_UNARY_OPERATOR_KIND = 58;

	/**
	 * The meta object id for the '{@link hu.metadom.hls.ssamodel.ContainerType <em>Container Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.metadom.hls.ssamodel.ContainerType
	 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getContainerType()
	 * @generated
	 */
	int CONTAINER_TYPE = 59;

	/**
	 * The meta object id for the '{@link hu.metadom.hls.ssamodel.LoopType <em>Loop Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.metadom.hls.ssamodel.LoopType
	 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getLoopType()
	 * @generated
	 */
	int LOOP_TYPE = 60;

	/**
	 * The meta object id for the '{@link hu.metadom.hls.ssamodel.ControlType <em>Control Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.metadom.hls.ssamodel.ControlType
	 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getControlType()
	 * @generated
	 */
	int CONTROL_TYPE = 61;

	/**
	 * The meta object id for the '{@link hu.metadom.hls.ssamodel.ParamDirection <em>Param Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.metadom.hls.ssamodel.ParamDirection
	 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getParamDirection()
	 * @generated
	 */
	int PARAM_DIRECTION = 62;

	/**
	 * The meta object id for the '{@link hu.metadom.hls.ssamodel.SwitchType <em>Switch Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.metadom.hls.ssamodel.SwitchType
	 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSwitchType()
	 * @generated
	 */
	int SWITCH_TYPE = 63;

	/**
	 * The meta object id for the '{@link hu.metadom.hls.ssamodel.DowhileType <em>Dowhile Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.metadom.hls.ssamodel.DowhileType
	 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getDowhileType()
	 * @generated
	 */
	int DOWHILE_TYPE = 64;

	/**
	 * Returns the meta object for class '{@link hu.metadom.hls.ssamodel.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see hu.metadom.hls.ssamodel.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the attribute '{@link hu.metadom.hls.ssamodel.Type#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see hu.metadom.hls.ssamodel.Type#getSize()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_Size();

	/**
	 * Returns the meta object for class '{@link hu.metadom.hls.ssamodel.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type</em>'.
	 * @see hu.metadom.hls.ssamodel.PrimitiveType
	 * @generated
	 */
	EClass getPrimitiveType();

	/**
	 * Returns the meta object for class '{@link hu.metadom.hls.ssamodel.Enum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum</em>'.
	 * @see hu.metadom.hls.ssamodel.Enum
	 * @generated
	 */
	EClass getEnum();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.metadom.hls.ssamodel.Enum#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see hu.metadom.hls.ssamodel.Enum#getMembers()
	 * @see #getEnum()
	 * @generated
	 */
	EReference getEnum_Members();

	/**
	 * Returns the meta object for class '{@link hu.metadom.hls.ssamodel.Struct <em>Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Struct</em>'.
	 * @see hu.metadom.hls.ssamodel.Struct
	 * @generated
	 */
	EClass getStruct();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.metadom.hls.ssamodel.Struct#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see hu.metadom.hls.ssamodel.Struct#getMembers()
	 * @see #getStruct()
	 * @generated
	 */
	EReference getStruct_Members();

	/**
	 * Returns the meta object for class '{@link hu.metadom.hls.ssamodel.Union <em>Union</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Union</em>'.
	 * @see hu.metadom.hls.ssamodel.Union
	 * @generated
	 */
	EClass getUnion();

	/**
	 * Returns the meta object for class '{@link hu.metadom.hls.ssamodel.ReferenceType <em>Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Type</em>'.
	 * @see hu.metadom.hls.ssamodel.ReferenceType
	 * @generated
	 */
	EClass getReferenceType();

	/**
	 * Returns the meta object for the reference '{@link hu.metadom.hls.ssamodel.ReferenceType#getReferencedType <em>Referenced Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Type</em>'.
	 * @see hu.metadom.hls.ssamodel.ReferenceType#getReferencedType()
	 * @see #getReferenceType()
	 * @generated
	 */
	EReference getReferenceType_ReferencedType();

	/**
	 * Returns the meta object for class '{@link hu.metadom.hls.ssamodel.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see hu.metadom.hls.ssamodel.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.metadom.hls.ssamodel.Container#getChildContainers <em>Child Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child Containers</em>'.
	 * @see hu.metadom.hls.ssamodel.Container#getChildContainers()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_ChildContainers();

	/**
	 * Returns the meta object for the attribute '{@link hu.metadom.hls.ssamodel.Container#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.metadom.hls.ssamodel.Container#getName()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.metadom.hls.ssamodel.Container#getFunctions <em>Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Functions</em>'.
	 * @see hu.metadom.hls.ssamodel.Container#getFunctions()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Functions();

	/**
	 * Returns the meta object for the attribute '{@link hu.metadom.hls.ssamodel.Container#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see hu.metadom.hls.ssamodel.Container#getType()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Type();

	/**
	 * Returns the meta object for the containment reference '{@link hu.metadom.hls.ssamodel.Container#getGlobalBlock <em>Global Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Global Block</em>'.
	 * @see hu.metadom.hls.ssamodel.Container#getGlobalBlock()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_GlobalBlock();

	/**
	 * Returns the meta object for class '{@link hu.metadom.hls.ssamodel.EnumMember <em>Enum Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Member</em>'.
	 * @see hu.metadom.hls.ssamodel.EnumMember
	 * @generated
	 */
	EClass getEnumMember();

	/**
	 * Returns the meta object for the containment reference '{@link hu.metadom.hls.ssamodel.EnumMember#getConst <em>Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Const</em>'.
	 * @see hu.metadom.hls.ssamodel.EnumMember#getConst()
	 * @see #getEnumMember()
	 * @generated
	 */
	EReference getEnumMember_Const();

	/**
	 * Returns the meta object for the containment reference '{@link hu.metadom.hls.ssamodel.EnumMember#getValueNode <em>Value Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Node</em>'.
	 * @see hu.metadom.hls.ssamodel.EnumMember#getValueNode()
	 * @see #getEnumMember()
	 * @generated
	 */
	EReference getEnumMember_ValueNode();

	/**
	 * Returns the meta object for class '{@link hu.metadom.hls.ssamodel.StructMember <em>Struct Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Struct Member</em>'.
	 * @see hu.metadom.hls.ssamodel.StructMember
	 * @generated
	 */
	EClass getStructMember();

	/**
	 * Returns the meta object for the reference '{@link hu.metadom.hls.ssamodel.StructMember#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see hu.metadom.hls.ssamodel.StructMember#getType()
	 * @see #getStructMember()
	 * @generated
	 */
	EReference getStructMember_Type();

	/**
	 * Returns the meta object for class '{@link hu.metadom.hls.ssamodel.StructBitfieldMember <em>Struct Bitfield Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Struct Bitfield Member</em>'.
	 * @see hu.metadom.hls.ssamodel.StructBitfieldMember
	 * @generated
	 */
	EClass getStructBitfieldMember();

	/**
	 * Returns the meta object for the containment reference '{@link hu.metadom.hls.ssamodel.StructBitfieldMember#getBitfieldValue <em>Bitfield Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bitfield Value</em>'.
	 * @see hu.metadom.hls.ssamodel.StructBitfieldMember#getBitfieldValue()
	 * @see #getStructBitfieldMember()
	 * @generated
	 */
	EReference getStructBitfieldMember_BitfieldValue();

	/**
	 * Returns the meta object for class '{@link hu.metadom.hls.ssamodel.PointerType <em>Pointer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pointer Type</em>'.
	 * @see hu.metadom.hls.ssamodel.PointerType
	 * @generated
	 */
	EClass getPointerType();

	/**
	 * Returns the meta object for class '{@link hu.metadom.hls.ssamodel.ArrayType <em>Array Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Type</em>'.
	 * @see hu.metadom.hls.ssamodel.ArrayType
	 * @generated
	 */
	EClass getArrayType();

	/**
	 * Returns the meta object for the containment reference '{@link hu.metadom.hls.ssamodel.ArrayType#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Length</em>'.
	 * @see hu.metadom.hls.ssamodel.ArrayType#getLength()
	 * @see #getArrayType()
	 * @generated
	 */
	EReference getArrayType_Length();

	/**
	 * Returns the meta object for class '{@link hu.metadom.hls.ssamodel.SsaNode <em>Ssa Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ssa Node</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaNode
	 * @generated
	 */
	EClass getSsaNode();

	/**
	 * Returns the meta object for the reference '{@link hu.metadom.hls.ssamodel.SsaNode#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaNode#getType()
	 * @see #getSsaNode()
	 * @generated
	 */
	EReference getSsaNode_Type();

	/**
	 * Returns the meta object for the container reference '{@link hu.metadom.hls.ssamodel.SsaNode#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaNode#getParent()
	 * @see #getSsaNode()
	 * @generated
	 */
	EReference getSsaNode_Parent();

	/**
	 * Returns the meta object for the reference '{@link hu.metadom.hls.ssamodel.SsaNode#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Var</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaNode#getVar()
	 * @see #getSsaNode()
	 * @generated
	 */
	EReference getSsaNode_Var();

	/**
	 * Returns the meta object for the attribute '{@link hu.metadom.hls.ssamodel.SsaNode#getSsaIndex <em>Ssa Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ssa Index</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaNode#getSsaIndex()
	 * @see #getSsaNode()
	 * @generated
	 */
	EAttribute getSsaNode_SsaIndex();

	/**
	 * Returns the meta object for the attribute '{@link hu.metadom.hls.ssamodel.SsaNode#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origin</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaNode#getOrigin()
	 * @see #getSsaNode()
	 * @generated
	 */
	EAttribute getSsaNode_Origin();

	/**
	 * Returns the meta object for the attribute '{@link hu.metadom.hls.ssamodel.SsaNode#getGid <em>Gid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gid</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaNode#getGid()
	 * @see #getSsaNode()
	 * @generated
	 */
	EAttribute getSsaNode_Gid();

	/**
	 * Returns the meta object for class '{@link hu.metadom.hls.ssamodel.SsaAssign <em>Ssa Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ssa Assign</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaAssign
	 * @generated
	 */
	EClass getSsaAssign();

	/**
	 * Returns the meta object for the reference '{@link hu.metadom.hls.ssamodel.SsaAssign#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaAssign#getValue()
	 * @see #getSsaAssign()
	 * @generated
	 */
	EReference getSsaAssign_Value();

	/**
	 * Returns the meta object for class '{@link hu.metadom.hls.ssamodel.SsaConst <em>Ssa Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ssa Const</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaConst
	 * @generated
	 */
	EClass getSsaConst();

	/**
	 * Returns the meta object for the attribute '{@link hu.metadom.hls.ssamodel.SsaConst#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaConst#getValue()
	 * @see #getSsaConst()
	 * @generated
	 */
	EAttribute getSsaConst_Value();

	/**
	 * Returns the meta object for class '{@link hu.metadom.hls.ssamodel.SsaBinaryOperator <em>Ssa Binary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ssa Binary Operator</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaBinaryOperator
	 * @generated
	 */
	EClass getSsaBinaryOperator();

	/**
	 * Returns the meta object for the attribute '{@link hu.metadom.hls.ssamodel.SsaBinaryOperator#getOperatorKind <em>Operator Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator Kind</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaBinaryOperator#getOperatorKind()
	 * @see #getSsaBinaryOperator()
	 * @generated
	 */
	EAttribute getSsaBinaryOperator_OperatorKind();

	/**
	 * Returns the meta object for the reference '{@link hu.metadom.hls.ssamodel.SsaBinaryOperator#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaBinaryOperator#getLeft()
	 * @see #getSsaBinaryOperator()
	 * @generated
	 */
	EReference getSsaBinaryOperator_Left();

	/**
	 * Returns the meta object for the reference '{@link hu.metadom.hls.ssamodel.SsaBinaryOperator#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaBinaryOperator#getRight()
	 * @see #getSsaBinaryOperator()
	 * @generated
	 */
	EReference getSsaBinaryOperator_Right();

	/**
	 * Returns the meta object for class '{@link hu.metadom.hls.ssamodel.SsaUnaryOperator <em>Ssa Unary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ssa Unary Operator</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaUnaryOperator
	 * @generated
	 */
	EClass getSsaUnaryOperator();

	/**
	 * Returns the meta object for the attribute '{@link hu.metadom.hls.ssamodel.SsaUnaryOperator#getOperatorKind <em>Operator Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator Kind</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaUnaryOperator#getOperatorKind()
	 * @see #getSsaUnaryOperator()
	 * @generated
	 */
	EAttribute getSsaUnaryOperator_OperatorKind();

	/**
	 * Returns the meta object for the reference '{@link hu.metadom.hls.ssamodel.SsaUnaryOperator#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operand</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaUnaryOperator#getOperand()
	 * @see #getSsaUnaryOperator()
	 * @generated
	 */
	EReference getSsaUnaryOperator_Operand();

	/**
	 * Returns the meta object for class '{@link hu.metadom.hls.ssamodel.SsaCall <em>Ssa Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ssa Call</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaCall
	 * @generated
	 */
	EClass getSsaCall();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.metadom.hls.ssamodel.SsaCall#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaCall#getArguments()
	 * @see #getSsaCall()
	 * @generated
	 */
	EReference getSsaCall_Arguments();

	/**
	 * Returns the meta object for the reference '{@link hu.metadom.hls.ssamodel.SsaCall#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Function</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaCall#getFunction()
	 * @see #getSsaCall()
	 * @generated
	 */
	EReference getSsaCall_Function();

	/**
	 * Returns the meta object for class '{@link hu.metadom.hls.ssamodel.SsaPhi <em>Ssa Phi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ssa Phi</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaPhi
	 * @generated
	 */
	EClass getSsaPhi();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.metadom.hls.ssamodel.SsaPhi#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Previous</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaPhi#getPrevious()
	 * @see #getSsaPhi()
	 * @generated
	 */
	EReference getSsaPhi_Previous();

	/**
	 * Returns the meta object for class '{@link hu.metadom.hls.ssamodel.SsaParam <em>Ssa Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ssa Param</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaParam
	 * @generated
	 */
	EClass getSsaParam();

	/**
	 * Returns the meta object for the attribute '{@link hu.metadom.hls.ssamodel.SsaParam#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaParam#getDirection()
	 * @see #getSsaParam()
	 * @generated
	 */
	EAttribute getSsaParam_Direction();

	/**
	 * Returns the meta object for class '{@link hu.metadom.hls.ssamodel.SsaReturn <em>Ssa Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ssa Return</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaReturn
	 * @generated
	 */
	EClass getSsaReturn();

	/**
	 * Returns the meta object for the reference '{@link hu.metadom.hls.ssamodel.SsaReturn#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expression</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaReturn#getExpression()
	 * @see #getSsaReturn()
	 * @generated
	 */
	EReference getSsaReturn_Expression();

	/**
	 * Returns the meta object for class '{@link hu.metadom.hls.ssamodel.SsaCast <em>Ssa Cast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ssa Cast</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaCast
	 * @generated
	 */
	EClass getSsaCast();

	/**
	 * Returns the meta object for the reference '{@link hu.metadom.hls.ssamodel.SsaCast#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaCast#getFrom()
	 * @see #getSsaCast()
	 * @generated
	 */
	EReference getSsaCast_From();

	/**
	 * Returns the meta object for class '{@link hu.metadom.hls.ssamodel.SsaConditionalJump <em>Ssa Conditional Jump</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ssa Conditional Jump</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaConditionalJump
	 * @generated
	 */
	EClass getSsaConditionalJump();

	/**
	 * Returns the meta object for the reference '{@link hu.metadom.hls.ssamodel.SsaConditionalJump#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Condition</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaConditionalJump#getCondition()
	 * @see #getSsaConditionalJump()
	 * @generated
	 */
	EReference getSsaConditionalJump_Condition();

	/**
	 * Returns the meta object for the reference '{@link hu.metadom.hls.ssamodel.SsaConditionalJump#getThenBlock <em>Then Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Then Block</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaConditionalJump#getThenBlock()
	 * @see #getSsaConditionalJump()
	 * @generated
	 */
	EReference getSsaConditionalJump_ThenBlock();

	/**
	 * Returns the meta object for the reference '{@link hu.metadom.hls.ssamodel.SsaConditionalJump#getElseBlock <em>Else Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Else Block</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaConditionalJump#getElseBlock()
	 * @see #getSsaConditionalJump()
	 * @generated
	 */
	EReference getSsaConditionalJump_ElseBlock();

	/**
	 * Returns the meta object for class '{@link hu.metadom.hls.ssamodel.SsaFunction <em>Ssa Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ssa Function</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaFunction
	 * @generated
	 */
	EClass getSsaFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.metadom.hls.ssamodel.SsaFunction#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaFunction#getParameters()
	 * @see #getSsaFunction()
	 * @generated
	 */
	EReference getSsaFunction_Parameters();

	/**
	 * Returns the meta object for the reference '{@link hu.metadom.hls.ssamodel.SsaFunction#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Type</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaFunction#getReturnType()
	 * @see #getSsaFunction()
	 * @generated
	 */
	EReference getSsaFunction_ReturnType();

	/**
	 * Returns the meta object for the attribute '{@link hu.metadom.hls.ssamodel.SsaFunction#isVarArg <em>Var Arg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Arg</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaFunction#isVarArg()
	 * @see #getSsaFunction()
	 * @generated
	 */
	EAttribute getSsaFunction_VarArg();

	/**
	 * Returns the meta object for class '{@link hu.metadom.hls.ssamodel.SsaBlock <em>Ssa Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ssa Block</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaBlock
	 * @generated
	 */
	EClass getSsaBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.metadom.hls.ssamodel.SsaBlock#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaBlock#getNodes()
	 * @see #getSsaBlock()
	 * @generated
	 */
	EReference getSsaBlock_Nodes();

	/**
	 * Returns the meta object for the containment reference '{@link hu.metadom.hls.ssamodel.SsaBlock#getNameScope <em>Name Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name Scope</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaBlock#getNameScope()
	 * @see #getSsaBlock()
	 * @generated
	 */
	EReference getSsaBlock_NameScope();

	/**
	 * Returns the meta object for class '{@link hu.metadom.hls.ssamodel.SsaStructRead <em>Ssa Struct Read</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ssa Struct Read</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaStructRead
	 * @generated
	 */
	EClass getSsaStructRead();

	/**
	 * Returns the meta object for the reference '{@link hu.metadom.hls.ssamodel.SsaStructRead#getStruct <em>Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Struct</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaStructRead#getStruct()
	 * @see #getSsaStructRead()
	 * @generated
	 */
	EReference getSsaStructRead_Struct();

	/**
	 * Returns the meta object for the reference '{@link hu.metadom.hls.ssamodel.SsaStructRead#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaStructRead#getField()
	 * @see #getSsaStructRead()
	 * @generated
	 */
	EReference getSsaStructRead_Field();

	/**
	 * Returns the meta object for class '{@link hu.metadom.hls.ssamodel.SsaStructWrite <em>Ssa Struct Write</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ssa Struct Write</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaStructWrite
	 * @generated
	 */
	EClass getSsaStructWrite();

	/**
	 * Returns the meta object for the reference '{@link hu.metadom.hls.ssamodel.SsaStructWrite#getStruct <em>Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Struct</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaStructWrite#getStruct()
	 * @see #getSsaStructWrite()
	 * @generated
	 */
	EReference getSsaStructWrite_Struct();

	/**
	 * Returns the meta object for the reference '{@link hu.metadom.hls.ssamodel.SsaStructWrite#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaStructWrite#getValue()
	 * @see #getSsaStructWrite()
	 * @generated
	 */
	EReference getSsaStructWrite_Value();

	/**
	 * Returns the meta object for the reference '{@link hu.metadom.hls.ssamodel.SsaStructWrite#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaStructWrite#getField()
	 * @see #getSsaStructWrite()
	 * @generated
	 */
	EReference getSsaStructWrite_Field();

	/**
	 * Returns the meta object for class '{@link hu.metadom.hls.ssamodel.SsaArrayRead <em>Ssa Array Read</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ssa Array Read</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaArrayRead
	 * @generated
	 */
	EClass getSsaArrayRead();

	/**
	 * Returns the meta object for the reference '{@link hu.metadom.hls.ssamodel.SsaArrayRead#getArray <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Array</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaArrayRead#getArray()
	 * @see #getSsaArrayRead()
	 * @generated
	 */
	EReference getSsaArrayRead_Array();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.metadom.hls.ssamodel.SsaArrayRead#getIndices <em>Indices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Indices</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaArrayRead#getIndices()
	 * @see #getSsaArrayRead()
	 * @generated
	 */
	EReference getSsaArrayRead_Indices();

	/**
	 * Returns the meta object for class '{@link hu.metadom.hls.ssamodel.SsaArrayWrite <em>Ssa Array Write</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ssa Array Write</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaArrayWrite
	 * @generated
	 */
	EClass getSsaArrayWrite();

	/**
	 * Returns the meta object for the reference '{@link hu.metadom.hls.ssamodel.SsaArrayWrite#getArray <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Array</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaArrayWrite#getArray()
	 * @see #getSsaArrayWrite()
	 * @generated
	 */
	EReference getSsaArrayWrite_Array();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.metadom.hls.ssamodel.SsaArrayWrite#getIndices <em>Indices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Indices</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaArrayWrite#getIndices()
	 * @see #getSsaArrayWrite()
	 * @generated
	 */
	EReference getSsaArrayWrite_Indices();

	/**
	 * Returns the meta object for the reference '{@link hu.metadom.hls.ssamodel.SsaArrayWrite#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaArrayWrite#getValue()
	 * @see #getSsaArrayWrite()
	 * @generated
	 */
	EReference getSsaArrayWrite_Value();

	/**
	 * Returns the meta object for class '{@link hu.metadom.hls.ssamodel.FilePosition <em>File Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Position</em>'.
	 * @see hu.metadom.hls.ssamodel.FilePosition
	 * @generated
	 */
	EClass getFilePosition();

	/**
	 * Returns the meta object for the attribute '{@link hu.metadom.hls.ssamodel.FilePosition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.metadom.hls.ssamodel.FilePosition#getName()
	 * @see #getFilePosition()
	 * @generated
	 */
	EAttribute getFilePosition_Name();

	/**
	 * Returns the meta object for the attribute '{@link hu.metadom.hls.ssamodel.FilePosition#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line</em>'.
	 * @see hu.metadom.hls.ssamodel.FilePosition#getLine()
	 * @see #getFilePosition()
	 * @generated
	 */
	EAttribute getFilePosition_Line();

	/**
	 * Returns the meta object for the attribute '{@link hu.metadom.hls.ssamodel.FilePosition#getStartPositionInLine <em>Start Position In Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Position In Line</em>'.
	 * @see hu.metadom.hls.ssamodel.FilePosition#getStartPositionInLine()
	 * @see #getFilePosition()
	 * @generated
	 */
	EAttribute getFilePosition_StartPositionInLine();

	/**
	 * Returns the meta object for the attribute '{@link hu.metadom.hls.ssamodel.FilePosition#getEndPositionInLine <em>End Position In Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Position In Line</em>'.
	 * @see hu.metadom.hls.ssamodel.FilePosition#getEndPositionInLine()
	 * @see #getFilePosition()
	 * @generated
	 */
	EAttribute getFilePosition_EndPositionInLine();

	/**
	 * Returns the meta object for the attribute '{@link hu.metadom.hls.ssamodel.FilePosition#getStartPosition <em>Start Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Position</em>'.
	 * @see hu.metadom.hls.ssamodel.FilePosition#getStartPosition()
	 * @see #getFilePosition()
	 * @generated
	 */
	EAttribute getFilePosition_StartPosition();

	/**
	 * Returns the meta object for the attribute '{@link hu.metadom.hls.ssamodel.FilePosition#getEndPosition <em>End Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Position</em>'.
	 * @see hu.metadom.hls.ssamodel.FilePosition#getEndPosition()
	 * @see #getFilePosition()
	 * @generated
	 */
	EAttribute getFilePosition_EndPosition();

	/**
	 * Returns the meta object for class '{@link hu.metadom.hls.ssamodel.SsaVar <em>Ssa Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ssa Var</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaVar
	 * @generated
	 */
	EClass getSsaVar();

	/**
	 * Returns the meta object for the reference '{@link hu.metadom.hls.ssamodel.SsaVar#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaVar#getType()
	 * @see #getSsaVar()
	 * @generated
	 */
	EReference getSsaVar_Type();

	/**
	 * Returns the meta object for the reference '{@link hu.metadom.hls.ssamodel.SsaVar#getInitNode <em>Init Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Init Node</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaVar#getInitNode()
	 * @see #getSsaVar()
	 * @generated
	 */
	EReference getSsaVar_InitNode();

	/**
	 * Returns the meta object for the attribute '{@link hu.metadom.hls.ssamodel.SsaVar#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origin</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaVar#getOrigin()
	 * @see #getSsaVar()
	 * @generated
	 */
	EAttribute getSsaVar_Origin();

	/**
	 * Returns the meta object for class '{@link hu.metadom.hls.ssamodel.CNameScope <em>CName Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CName Scope</em>'.
	 * @see hu.metadom.hls.ssamodel.CNameScope
	 * @generated
	 */
	EClass getCNameScope();

	/**
	 * Returns the meta object for the reference '{@link hu.metadom.hls.ssamodel.CNameScope#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see hu.metadom.hls.ssamodel.CNameScope#getParent()
	 * @see #getCNameScope()
	 * @generated
	 */
	EReference getCNameScope_Parent();

	/**
	 * Returns the meta object for the map '{@link hu.metadom.hls.ssamodel.CNameScope#getNames <em>Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Names</em>'.
	 * @see hu.metadom.hls.ssamodel.CNameScope#getNames()
	 * @see #getCNameScope()
	 * @generated
	 */
	EReference getCNameScope_Names();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.metadom.hls.ssamodel.CNameScope#getVars <em>Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vars</em>'.
	 * @see hu.metadom.hls.ssamodel.CNameScope#getVars()
	 * @see #getCNameScope()
	 * @generated
	 */
	EReference getCNameScope_Vars();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.metadom.hls.ssamodel.CNameScope#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see hu.metadom.hls.ssamodel.CNameScope#getTypes()
	 * @see #getCNameScope()
	 * @generated
	 */
	EReference getCNameScope_Types();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.metadom.hls.ssamodel.CNameScope#getConstants <em>Constants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constants</em>'.
	 * @see hu.metadom.hls.ssamodel.CNameScope#getConstants()
	 * @see #getCNameScope()
	 * @generated
	 */
	EReference getCNameScope_Constants();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To CName Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To CName Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyUnique="false" keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="hu.metadom.hls.ssamodel.SsaVar" valueContainment="true"
	 * @generated
	 */
	EClass getStringToCNameMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToCNameMap()
	 * @generated
	 */
	EAttribute getStringToCNameMap_Key();

	/**
	 * Returns the meta object for the containment reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToCNameMap()
	 * @generated
	 */
	EReference getStringToCNameMap_Value();

	/**
	 * Returns the meta object for class '{@link hu.metadom.hls.ssamodel.SsaExplicitCast <em>Ssa Explicit Cast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ssa Explicit Cast</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaExplicitCast
	 * @generated
	 */
	EClass getSsaExplicitCast();

	/**
	 * Returns the meta object for the reference '{@link hu.metadom.hls.ssamodel.SsaExplicitCast#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaExplicitCast#getTo()
	 * @see #getSsaExplicitCast()
	 * @generated
	 */
	EReference getSsaExplicitCast_To();

	/**
	 * Returns the meta object for class '{@link hu.metadom.hls.ssamodel.Member <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Member</em>'.
	 * @see hu.metadom.hls.ssamodel.Member
	 * @generated
	 */
	EClass getMember();

	/**
	 * Returns the meta object for class '{@link hu.metadom.hls.ssamodel.SsaDowhile <em>Ssa Dowhile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ssa Dowhile</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaDowhile
	 * @generated
	 */
	EClass getSsaDowhile();

	/**
	 * Returns the meta object for the containment reference '{@link hu.metadom.hls.ssamodel.SsaDowhile#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaDowhile#getBody()
	 * @see #getSsaDowhile()
	 * @generated
	 */
	EReference getSsaDowhile_Body();

	/**
	 * Returns the meta object for the containment reference '{@link hu.metadom.hls.ssamodel.SsaDowhile#getCond <em>Cond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cond</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaDowhile#getCond()
	 * @see #getSsaDowhile()
	 * @generated
	 */
	EReference getSsaDowhile_Cond();

	/**
	 * Returns the meta object for the containment reference '{@link hu.metadom.hls.ssamodel.SsaDowhile#getMerge <em>Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Merge</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaDowhile#getMerge()
	 * @see #getSsaDowhile()
	 * @generated
	 */
	EReference getSsaDowhile_Merge();

	/**
	 * Returns the meta object for the attribute '{@link hu.metadom.hls.ssamodel.SsaDowhile#getLoopType <em>Loop Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loop Type</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaDowhile#getLoopType()
	 * @see #getSsaDowhile()
	 * @generated
	 */
	EAttribute getSsaDowhile_LoopType();

	/**
	 * Returns the meta object for the reference '{@link hu.metadom.hls.ssamodel.SsaDowhile#getCondNode <em>Cond Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cond Node</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaDowhile#getCondNode()
	 * @see #getSsaDowhile()
	 * @generated
	 */
	EReference getSsaDowhile_CondNode();

	/**
	 * Returns the meta object for the attribute '{@link hu.metadom.hls.ssamodel.SsaDowhile#getDowhileType <em>Dowhile Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dowhile Type</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaDowhile#getDowhileType()
	 * @see #getSsaDowhile()
	 * @generated
	 */
	EAttribute getSsaDowhile_DowhileType();

	/**
	 * Returns the meta object for class '{@link hu.metadom.hls.ssamodel.SsaSwitch <em>Ssa Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ssa Switch</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaSwitch
	 * @generated
	 */
	EClass getSsaSwitch();

	/**
	 * Returns the meta object for the reference '{@link hu.metadom.hls.ssamodel.SsaSwitch#getSelector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selector</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaSwitch#getSelector()
	 * @see #getSsaSwitch()
	 * @generated
	 */
	EReference getSsaSwitch_Selector();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.metadom.hls.ssamodel.SsaSwitch#getCases <em>Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cases</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaSwitch#getCases()
	 * @see #getSsaSwitch()
	 * @generated
	 */
	EReference getSsaSwitch_Cases();

	/**
	 * Returns the meta object for the containment reference '{@link hu.metadom.hls.ssamodel.SsaSwitch#getMerge <em>Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Merge</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaSwitch#getMerge()
	 * @see #getSsaSwitch()
	 * @generated
	 */
	EReference getSsaSwitch_Merge();

	/**
	 * Returns the meta object for the containment reference '{@link hu.metadom.hls.ssamodel.SsaSwitch#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaSwitch#getDefault()
	 * @see #getSsaSwitch()
	 * @generated
	 */
	EReference getSsaSwitch_Default();

	/**
	 * Returns the meta object for the attribute '{@link hu.metadom.hls.ssamodel.SsaSwitch#getSwitchType <em>Switch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Switch Type</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaSwitch#getSwitchType()
	 * @see #getSsaSwitch()
	 * @generated
	 */
	EAttribute getSsaSwitch_SwitchType();

	/**
	 * Returns the meta object for class '{@link hu.metadom.hls.ssamodel.SsaCase <em>Ssa Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ssa Case</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaCase
	 * @generated
	 */
	EClass getSsaCase();

	/**
	 * Returns the meta object for the containment reference '{@link hu.metadom.hls.ssamodel.SsaCase#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Node</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaCase#getNode()
	 * @see #getSsaCase()
	 * @generated
	 */
	EReference getSsaCase_Node();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.metadom.hls.ssamodel.SsaCase#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaCase#getValues()
	 * @see #getSsaCase()
	 * @generated
	 */
	EReference getSsaCase_Values();

	/**
	 * Returns the meta object for class '{@link hu.metadom.hls.ssamodel.SsaControl <em>Ssa Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ssa Control</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaControl
	 * @generated
	 */
	EClass getSsaControl();

	/**
	 * Returns the meta object for the attribute '{@link hu.metadom.hls.ssamodel.SsaControl#getControlType <em>Control Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Type</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaControl#getControlType()
	 * @see #getSsaControl()
	 * @generated
	 */
	EAttribute getSsaControl_ControlType();

	/**
	 * Returns the meta object for class '{@link hu.metadom.hls.ssamodel.SsaAbstractInit <em>Ssa Abstract Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ssa Abstract Init</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaAbstractInit
	 * @generated
	 */
	EClass getSsaAbstractInit();

	/**
	 * Returns the meta object for class '{@link hu.metadom.hls.ssamodel.SsaInitList <em>Ssa Init List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ssa Init List</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaInitList
	 * @generated
	 */
	EClass getSsaInitList();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.metadom.hls.ssamodel.SsaInitList#getInits <em>Inits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inits</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaInitList#getInits()
	 * @see #getSsaInitList()
	 * @generated
	 */
	EReference getSsaInitList_Inits();

	/**
	 * Returns the meta object for class '{@link hu.metadom.hls.ssamodel.SsaInit <em>Ssa Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ssa Init</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaInit
	 * @generated
	 */
	EClass getSsaInit();

	/**
	 * Returns the meta object for the reference '{@link hu.metadom.hls.ssamodel.SsaInit#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaInit#getValue()
	 * @see #getSsaInit()
	 * @generated
	 */
	EReference getSsaInit_Value();

	/**
	 * Returns the meta object for class '{@link hu.metadom.hls.ssamodel.FunctionType <em>Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Type</em>'.
	 * @see hu.metadom.hls.ssamodel.FunctionType
	 * @generated
	 */
	EClass getFunctionType();

	/**
	 * Returns the meta object for the reference '{@link hu.metadom.hls.ssamodel.FunctionType#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Type</em>'.
	 * @see hu.metadom.hls.ssamodel.FunctionType#getReturnType()
	 * @see #getFunctionType()
	 * @generated
	 */
	EReference getFunctionType_ReturnType();

	/**
	 * Returns the meta object for the reference list '{@link hu.metadom.hls.ssamodel.FunctionType#getParamTypes <em>Param Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Param Types</em>'.
	 * @see hu.metadom.hls.ssamodel.FunctionType#getParamTypes()
	 * @see #getFunctionType()
	 * @generated
	 */
	EReference getFunctionType_ParamTypes();

	/**
	 * Returns the meta object for class '{@link hu.metadom.hls.ssamodel.SsaIndirectWrite <em>Ssa Indirect Write</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ssa Indirect Write</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaIndirectWrite
	 * @generated
	 */
	EClass getSsaIndirectWrite();

	/**
	 * Returns the meta object for the reference '{@link hu.metadom.hls.ssamodel.SsaIndirectWrite#getPointer <em>Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pointer</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaIndirectWrite#getPointer()
	 * @see #getSsaIndirectWrite()
	 * @generated
	 */
	EReference getSsaIndirectWrite_Pointer();

	/**
	 * Returns the meta object for the reference '{@link hu.metadom.hls.ssamodel.SsaIndirectWrite#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaIndirectWrite#getValue()
	 * @see #getSsaIndirectWrite()
	 * @generated
	 */
	EReference getSsaIndirectWrite_Value();

	/**
	 * Returns the meta object for class '{@link hu.metadom.hls.ssamodel.SsaIndirectRead <em>Ssa Indirect Read</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ssa Indirect Read</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaIndirectRead
	 * @generated
	 */
	EClass getSsaIndirectRead();

	/**
	 * Returns the meta object for the reference '{@link hu.metadom.hls.ssamodel.SsaIndirectRead#getPointer <em>Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pointer</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaIndirectRead#getPointer()
	 * @see #getSsaIndirectRead()
	 * @generated
	 */
	EReference getSsaIndirectRead_Pointer();

	/**
	 * Returns the meta object for class '{@link hu.metadom.hls.ssamodel.SsaNodeRef <em>Ssa Node Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ssa Node Ref</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaNodeRef
	 * @generated
	 */
	EClass getSsaNodeRef();

	/**
	 * Returns the meta object for the reference '{@link hu.metadom.hls.ssamodel.SsaNodeRef#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaNodeRef#getNode()
	 * @see #getSsaNodeRef()
	 * @generated
	 */
	EReference getSsaNodeRef_Node();

	/**
	 * Returns the meta object for the containment reference '{@link hu.metadom.hls.ssamodel.SsaNodeRef#getFileposition <em>Fileposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fileposition</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaNodeRef#getFileposition()
	 * @see #getSsaNodeRef()
	 * @generated
	 */
	EReference getSsaNodeRef_Fileposition();

	/**
	 * Returns the meta object for class '{@link hu.metadom.hls.ssamodel.SsaGoto <em>Ssa Goto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ssa Goto</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaGoto
	 * @generated
	 */
	EClass getSsaGoto();

	/**
	 * Returns the meta object for the reference '{@link hu.metadom.hls.ssamodel.SsaGoto#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Label</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaGoto#getLabel()
	 * @see #getSsaGoto()
	 * @generated
	 */
	EReference getSsaGoto_Label();

	/**
	 * Returns the meta object for class '{@link hu.metadom.hls.ssamodel.SsaLabel <em>Ssa Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ssa Label</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaLabel
	 * @generated
	 */
	EClass getSsaLabel();

	/**
	 * Returns the meta object for class '{@link hu.metadom.hls.ssamodel.SsaPassByRefArgument <em>Ssa Pass By Ref Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ssa Pass By Ref Argument</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaPassByRefArgument
	 * @generated
	 */
	EClass getSsaPassByRefArgument();

	/**
	 * Returns the meta object for the containment reference '{@link hu.metadom.hls.ssamodel.SsaPassByRefArgument#getOutNode <em>Out Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Out Node</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaPassByRefArgument#getOutNode()
	 * @see #getSsaPassByRefArgument()
	 * @generated
	 */
	EReference getSsaPassByRefArgument_OutNode();

	/**
	 * Returns the meta object for class '{@link hu.metadom.hls.ssamodel.SsaArgument <em>Ssa Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ssa Argument</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaArgument
	 * @generated
	 */
	EClass getSsaArgument();

	/**
	 * Returns the meta object for the reference '{@link hu.metadom.hls.ssamodel.SsaArgument#getParam <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Param</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaArgument#getParam()
	 * @see #getSsaArgument()
	 * @generated
	 */
	EReference getSsaArgument_Param();

	/**
	 * Returns the meta object for class '{@link hu.metadom.hls.ssamodel.SsaPassByRefParam <em>Ssa Pass By Ref Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ssa Pass By Ref Param</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaPassByRefParam
	 * @generated
	 */
	EClass getSsaPassByRefParam();

	/**
	 * Returns the meta object for the reference '{@link hu.metadom.hls.ssamodel.SsaPassByRefParam#getOutNode <em>Out Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Out Node</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaPassByRefParam#getOutNode()
	 * @see #getSsaPassByRefParam()
	 * @generated
	 */
	EReference getSsaPassByRefParam_OutNode();

	/**
	 * Returns the meta object for class '{@link hu.metadom.hls.ssamodel.SsaOutputArgument <em>Ssa Output Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ssa Output Argument</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaOutputArgument
	 * @generated
	 */
	EClass getSsaOutputArgument();

	/**
	 * Returns the meta object for class '{@link hu.metadom.hls.ssamodel.SsaObject <em>Ssa Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ssa Object</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaObject
	 * @generated
	 */
	EClass getSsaObject();

	/**
	 * Returns the meta object for the attribute '{@link hu.metadom.hls.ssamodel.SsaObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaObject#getName()
	 * @see #getSsaObject()
	 * @generated
	 */
	EAttribute getSsaObject_Name();

	/**
	 * Returns the meta object for the attribute '{@link hu.metadom.hls.ssamodel.SsaObject#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaObject#getComment()
	 * @see #getSsaObject()
	 * @generated
	 */
	EAttribute getSsaObject_Comment();

	/**
	 * Returns the meta object for the containment reference '{@link hu.metadom.hls.ssamodel.SsaObject#getFileposition <em>Fileposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fileposition</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaObject#getFileposition()
	 * @see #getSsaObject()
	 * @generated
	 */
	EReference getSsaObject_Fileposition();

	/**
	 * Returns the meta object for class '{@link hu.metadom.hls.ssamodel.SsaSizeof <em>Ssa Sizeof</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ssa Sizeof</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaSizeof
	 * @generated
	 */
	EClass getSsaSizeof();

	/**
	 * Returns the meta object for class '{@link hu.metadom.hls.ssamodel.SsaSizeofType <em>Ssa Sizeof Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ssa Sizeof Type</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaSizeofType
	 * @generated
	 */
	EClass getSsaSizeofType();

	/**
	 * Returns the meta object for the reference '{@link hu.metadom.hls.ssamodel.SsaSizeofType#getSizeofType <em>Sizeof Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sizeof Type</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaSizeofType#getSizeofType()
	 * @see #getSsaSizeofType()
	 * @generated
	 */
	EReference getSsaSizeofType_SizeofType();

	/**
	 * Returns the meta object for class '{@link hu.metadom.hls.ssamodel.SsaSizeofVar <em>Ssa Sizeof Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ssa Sizeof Var</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaSizeofVar
	 * @generated
	 */
	EClass getSsaSizeofVar();

	/**
	 * Returns the meta object for the containment reference '{@link hu.metadom.hls.ssamodel.SsaSizeofVar#getSizeofExpr <em>Sizeof Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sizeof Expr</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaSizeofVar#getSizeofExpr()
	 * @see #getSsaSizeofVar()
	 * @generated
	 */
	EReference getSsaSizeofVar_SizeofExpr();

	/**
	 * Returns the meta object for class '{@link hu.metadom.hls.ssamodel.CompileTimeExpression <em>Compile Time Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compile Time Expression</em>'.
	 * @see hu.metadom.hls.ssamodel.CompileTimeExpression
	 * @generated
	 */
	EClass getCompileTimeExpression();

	/**
	 * Returns the meta object for the attribute '{@link hu.metadom.hls.ssamodel.CompileTimeExpression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see hu.metadom.hls.ssamodel.CompileTimeExpression#getValue()
	 * @see #getCompileTimeExpression()
	 * @generated
	 */
	EAttribute getCompileTimeExpression_Value();

	/**
	 * Returns the meta object for the containment reference '{@link hu.metadom.hls.ssamodel.CompileTimeExpression#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Node</em>'.
	 * @see hu.metadom.hls.ssamodel.CompileTimeExpression#getNode()
	 * @see #getCompileTimeExpression()
	 * @generated
	 */
	EReference getCompileTimeExpression_Node();

	/**
	 * Returns the meta object for enum '{@link hu.metadom.hls.ssamodel.SsaBinaryOperatorKind <em>Ssa Binary Operator Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ssa Binary Operator Kind</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaBinaryOperatorKind
	 * @generated
	 */
	EEnum getSsaBinaryOperatorKind();

	/**
	 * Returns the meta object for enum '{@link hu.metadom.hls.ssamodel.SsaUnaryOperatorKind <em>Ssa Unary Operator Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ssa Unary Operator Kind</em>'.
	 * @see hu.metadom.hls.ssamodel.SsaUnaryOperatorKind
	 * @generated
	 */
	EEnum getSsaUnaryOperatorKind();

	/**
	 * Returns the meta object for enum '{@link hu.metadom.hls.ssamodel.ContainerType <em>Container Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Container Type</em>'.
	 * @see hu.metadom.hls.ssamodel.ContainerType
	 * @generated
	 */
	EEnum getContainerType();

	/**
	 * Returns the meta object for enum '{@link hu.metadom.hls.ssamodel.LoopType <em>Loop Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Loop Type</em>'.
	 * @see hu.metadom.hls.ssamodel.LoopType
	 * @generated
	 */
	EEnum getLoopType();

	/**
	 * Returns the meta object for enum '{@link hu.metadom.hls.ssamodel.ControlType <em>Control Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Control Type</em>'.
	 * @see hu.metadom.hls.ssamodel.ControlType
	 * @generated
	 */
	EEnum getControlType();

	/**
	 * Returns the meta object for enum '{@link hu.metadom.hls.ssamodel.ParamDirection <em>Param Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Param Direction</em>'.
	 * @see hu.metadom.hls.ssamodel.ParamDirection
	 * @generated
	 */
	EEnum getParamDirection();

	/**
	 * Returns the meta object for enum '{@link hu.metadom.hls.ssamodel.SwitchType <em>Switch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Switch Type</em>'.
	 * @see hu.metadom.hls.ssamodel.SwitchType
	 * @generated
	 */
	EEnum getSwitchType();

	/**
	 * Returns the meta object for enum '{@link hu.metadom.hls.ssamodel.DowhileType <em>Dowhile Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dowhile Type</em>'.
	 * @see hu.metadom.hls.ssamodel.DowhileType
	 * @generated
	 */
	EEnum getDowhileType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SsaModelFactory getSsaModelFactory();

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
		 * The meta object literal for the '{@link hu.metadom.hls.ssamodel.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.metadom.hls.ssamodel.impl.TypeImpl
		 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__SIZE = eINSTANCE.getType_Size();

		/**
		 * The meta object literal for the '{@link hu.metadom.hls.ssamodel.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.metadom.hls.ssamodel.impl.PrimitiveTypeImpl
		 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getPrimitiveType()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

		/**
		 * The meta object literal for the '{@link hu.metadom.hls.ssamodel.impl.EnumImpl <em>Enum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.metadom.hls.ssamodel.impl.EnumImpl
		 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getEnum()
		 * @generated
		 */
		EClass ENUM = eINSTANCE.getEnum();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM__MEMBERS = eINSTANCE.getEnum_Members();

		/**
		 * The meta object literal for the '{@link hu.metadom.hls.ssamodel.impl.StructImpl <em>Struct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.metadom.hls.ssamodel.impl.StructImpl
		 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getStruct()
		 * @generated
		 */
		EClass STRUCT = eINSTANCE.getStruct();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCT__MEMBERS = eINSTANCE.getStruct_Members();

		/**
		 * The meta object literal for the '{@link hu.metadom.hls.ssamodel.impl.UnionImpl <em>Union</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.metadom.hls.ssamodel.impl.UnionImpl
		 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getUnion()
		 * @generated
		 */
		EClass UNION = eINSTANCE.getUnion();

		/**
		 * The meta object literal for the '{@link hu.metadom.hls.ssamodel.impl.ReferenceTypeImpl <em>Reference Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.metadom.hls.ssamodel.impl.ReferenceTypeImpl
		 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getReferenceType()
		 * @generated
		 */
		EClass REFERENCE_TYPE = eINSTANCE.getReferenceType();

		/**
		 * The meta object literal for the '<em><b>Referenced Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_TYPE__REFERENCED_TYPE = eINSTANCE.getReferenceType_ReferencedType();

		/**
		 * The meta object literal for the '{@link hu.metadom.hls.ssamodel.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.metadom.hls.ssamodel.impl.ContainerImpl
		 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Child Containers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__CHILD_CONTAINERS = eINSTANCE.getContainer_ChildContainers();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__NAME = eINSTANCE.getContainer_Name();

		/**
		 * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__FUNCTIONS = eINSTANCE.getContainer_Functions();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__TYPE = eINSTANCE.getContainer_Type();

		/**
		 * The meta object literal for the '<em><b>Global Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__GLOBAL_BLOCK = eINSTANCE.getContainer_GlobalBlock();

		/**
		 * The meta object literal for the '{@link hu.metadom.hls.ssamodel.impl.EnumMemberImpl <em>Enum Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.metadom.hls.ssamodel.impl.EnumMemberImpl
		 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getEnumMember()
		 * @generated
		 */
		EClass ENUM_MEMBER = eINSTANCE.getEnumMember();

		/**
		 * The meta object literal for the '<em><b>Const</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM_MEMBER__CONST = eINSTANCE.getEnumMember_Const();

		/**
		 * The meta object literal for the '<em><b>Value Node</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM_MEMBER__VALUE_NODE = eINSTANCE.getEnumMember_ValueNode();

		/**
		 * The meta object literal for the '{@link hu.metadom.hls.ssamodel.impl.StructMemberImpl <em>Struct Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.metadom.hls.ssamodel.impl.StructMemberImpl
		 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getStructMember()
		 * @generated
		 */
		EClass STRUCT_MEMBER = eINSTANCE.getStructMember();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCT_MEMBER__TYPE = eINSTANCE.getStructMember_Type();

		/**
		 * The meta object literal for the '{@link hu.metadom.hls.ssamodel.impl.StructBitfieldMemberImpl <em>Struct Bitfield Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.metadom.hls.ssamodel.impl.StructBitfieldMemberImpl
		 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getStructBitfieldMember()
		 * @generated
		 */
		EClass STRUCT_BITFIELD_MEMBER = eINSTANCE.getStructBitfieldMember();

		/**
		 * The meta object literal for the '<em><b>Bitfield Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCT_BITFIELD_MEMBER__BITFIELD_VALUE = eINSTANCE.getStructBitfieldMember_BitfieldValue();

		/**
		 * The meta object literal for the '{@link hu.metadom.hls.ssamodel.impl.PointerTypeImpl <em>Pointer Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.metadom.hls.ssamodel.impl.PointerTypeImpl
		 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getPointerType()
		 * @generated
		 */
		EClass POINTER_TYPE = eINSTANCE.getPointerType();

		/**
		 * The meta object literal for the '{@link hu.metadom.hls.ssamodel.impl.ArrayTypeImpl <em>Array Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.metadom.hls.ssamodel.impl.ArrayTypeImpl
		 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getArrayType()
		 * @generated
		 */
		EClass ARRAY_TYPE = eINSTANCE.getArrayType();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_TYPE__LENGTH = eINSTANCE.getArrayType_Length();

		/**
		 * The meta object literal for the '{@link hu.metadom.hls.ssamodel.impl.SsaNodeImpl <em>Ssa Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.metadom.hls.ssamodel.impl.SsaNodeImpl
		 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaNode()
		 * @generated
		 */
		EClass SSA_NODE = eINSTANCE.getSsaNode();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSA_NODE__TYPE = eINSTANCE.getSsaNode_Type();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSA_NODE__PARENT = eINSTANCE.getSsaNode_Parent();

		/**
		 * The meta object literal for the '<em><b>Var</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSA_NODE__VAR = eINSTANCE.getSsaNode_Var();

		/**
		 * The meta object literal for the '<em><b>Ssa Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SSA_NODE__SSA_INDEX = eINSTANCE.getSsaNode_SsaIndex();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SSA_NODE__ORIGIN = eINSTANCE.getSsaNode_Origin();

		/**
		 * The meta object literal for the '<em><b>Gid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SSA_NODE__GID = eINSTANCE.getSsaNode_Gid();

		/**
		 * The meta object literal for the '{@link hu.metadom.hls.ssamodel.impl.SsaAssignImpl <em>Ssa Assign</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.metadom.hls.ssamodel.impl.SsaAssignImpl
		 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaAssign()
		 * @generated
		 */
		EClass SSA_ASSIGN = eINSTANCE.getSsaAssign();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSA_ASSIGN__VALUE = eINSTANCE.getSsaAssign_Value();

		/**
		 * The meta object literal for the '{@link hu.metadom.hls.ssamodel.impl.SsaConstImpl <em>Ssa Const</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.metadom.hls.ssamodel.impl.SsaConstImpl
		 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaConst()
		 * @generated
		 */
		EClass SSA_CONST = eINSTANCE.getSsaConst();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SSA_CONST__VALUE = eINSTANCE.getSsaConst_Value();

		/**
		 * The meta object literal for the '{@link hu.metadom.hls.ssamodel.impl.SsaBinaryOperatorImpl <em>Ssa Binary Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.metadom.hls.ssamodel.impl.SsaBinaryOperatorImpl
		 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaBinaryOperator()
		 * @generated
		 */
		EClass SSA_BINARY_OPERATOR = eINSTANCE.getSsaBinaryOperator();

		/**
		 * The meta object literal for the '<em><b>Operator Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SSA_BINARY_OPERATOR__OPERATOR_KIND = eINSTANCE.getSsaBinaryOperator_OperatorKind();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSA_BINARY_OPERATOR__LEFT = eINSTANCE.getSsaBinaryOperator_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSA_BINARY_OPERATOR__RIGHT = eINSTANCE.getSsaBinaryOperator_Right();

		/**
		 * The meta object literal for the '{@link hu.metadom.hls.ssamodel.impl.SsaUnaryOperatorImpl <em>Ssa Unary Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.metadom.hls.ssamodel.impl.SsaUnaryOperatorImpl
		 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaUnaryOperator()
		 * @generated
		 */
		EClass SSA_UNARY_OPERATOR = eINSTANCE.getSsaUnaryOperator();

		/**
		 * The meta object literal for the '<em><b>Operator Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SSA_UNARY_OPERATOR__OPERATOR_KIND = eINSTANCE.getSsaUnaryOperator_OperatorKind();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSA_UNARY_OPERATOR__OPERAND = eINSTANCE.getSsaUnaryOperator_Operand();

		/**
		 * The meta object literal for the '{@link hu.metadom.hls.ssamodel.impl.SsaCallImpl <em>Ssa Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.metadom.hls.ssamodel.impl.SsaCallImpl
		 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaCall()
		 * @generated
		 */
		EClass SSA_CALL = eINSTANCE.getSsaCall();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSA_CALL__ARGUMENTS = eINSTANCE.getSsaCall_Arguments();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSA_CALL__FUNCTION = eINSTANCE.getSsaCall_Function();

		/**
		 * The meta object literal for the '{@link hu.metadom.hls.ssamodel.impl.SsaPhiImpl <em>Ssa Phi</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.metadom.hls.ssamodel.impl.SsaPhiImpl
		 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaPhi()
		 * @generated
		 */
		EClass SSA_PHI = eINSTANCE.getSsaPhi();

		/**
		 * The meta object literal for the '<em><b>Previous</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSA_PHI__PREVIOUS = eINSTANCE.getSsaPhi_Previous();

		/**
		 * The meta object literal for the '{@link hu.metadom.hls.ssamodel.impl.SsaParamImpl <em>Ssa Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.metadom.hls.ssamodel.impl.SsaParamImpl
		 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaParam()
		 * @generated
		 */
		EClass SSA_PARAM = eINSTANCE.getSsaParam();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SSA_PARAM__DIRECTION = eINSTANCE.getSsaParam_Direction();

		/**
		 * The meta object literal for the '{@link hu.metadom.hls.ssamodel.impl.SsaReturnImpl <em>Ssa Return</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.metadom.hls.ssamodel.impl.SsaReturnImpl
		 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaReturn()
		 * @generated
		 */
		EClass SSA_RETURN = eINSTANCE.getSsaReturn();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSA_RETURN__EXPRESSION = eINSTANCE.getSsaReturn_Expression();

		/**
		 * The meta object literal for the '{@link hu.metadom.hls.ssamodel.impl.SsaCastImpl <em>Ssa Cast</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.metadom.hls.ssamodel.impl.SsaCastImpl
		 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaCast()
		 * @generated
		 */
		EClass SSA_CAST = eINSTANCE.getSsaCast();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSA_CAST__FROM = eINSTANCE.getSsaCast_From();

		/**
		 * The meta object literal for the '{@link hu.metadom.hls.ssamodel.impl.SsaConditionalJumpImpl <em>Ssa Conditional Jump</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.metadom.hls.ssamodel.impl.SsaConditionalJumpImpl
		 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaConditionalJump()
		 * @generated
		 */
		EClass SSA_CONDITIONAL_JUMP = eINSTANCE.getSsaConditionalJump();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSA_CONDITIONAL_JUMP__CONDITION = eINSTANCE.getSsaConditionalJump_Condition();

		/**
		 * The meta object literal for the '<em><b>Then Block</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSA_CONDITIONAL_JUMP__THEN_BLOCK = eINSTANCE.getSsaConditionalJump_ThenBlock();

		/**
		 * The meta object literal for the '<em><b>Else Block</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSA_CONDITIONAL_JUMP__ELSE_BLOCK = eINSTANCE.getSsaConditionalJump_ElseBlock();

		/**
		 * The meta object literal for the '{@link hu.metadom.hls.ssamodel.impl.SsaFunctionImpl <em>Ssa Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.metadom.hls.ssamodel.impl.SsaFunctionImpl
		 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaFunction()
		 * @generated
		 */
		EClass SSA_FUNCTION = eINSTANCE.getSsaFunction();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSA_FUNCTION__PARAMETERS = eINSTANCE.getSsaFunction_Parameters();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSA_FUNCTION__RETURN_TYPE = eINSTANCE.getSsaFunction_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Var Arg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SSA_FUNCTION__VAR_ARG = eINSTANCE.getSsaFunction_VarArg();

		/**
		 * The meta object literal for the '{@link hu.metadom.hls.ssamodel.impl.SsaBlockImpl <em>Ssa Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.metadom.hls.ssamodel.impl.SsaBlockImpl
		 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaBlock()
		 * @generated
		 */
		EClass SSA_BLOCK = eINSTANCE.getSsaBlock();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSA_BLOCK__NODES = eINSTANCE.getSsaBlock_Nodes();

		/**
		 * The meta object literal for the '<em><b>Name Scope</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSA_BLOCK__NAME_SCOPE = eINSTANCE.getSsaBlock_NameScope();

		/**
		 * The meta object literal for the '{@link hu.metadom.hls.ssamodel.impl.SsaStructReadImpl <em>Ssa Struct Read</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.metadom.hls.ssamodel.impl.SsaStructReadImpl
		 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaStructRead()
		 * @generated
		 */
		EClass SSA_STRUCT_READ = eINSTANCE.getSsaStructRead();

		/**
		 * The meta object literal for the '<em><b>Struct</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSA_STRUCT_READ__STRUCT = eINSTANCE.getSsaStructRead_Struct();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSA_STRUCT_READ__FIELD = eINSTANCE.getSsaStructRead_Field();

		/**
		 * The meta object literal for the '{@link hu.metadom.hls.ssamodel.impl.SsaStructWriteImpl <em>Ssa Struct Write</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.metadom.hls.ssamodel.impl.SsaStructWriteImpl
		 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaStructWrite()
		 * @generated
		 */
		EClass SSA_STRUCT_WRITE = eINSTANCE.getSsaStructWrite();

		/**
		 * The meta object literal for the '<em><b>Struct</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSA_STRUCT_WRITE__STRUCT = eINSTANCE.getSsaStructWrite_Struct();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSA_STRUCT_WRITE__VALUE = eINSTANCE.getSsaStructWrite_Value();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSA_STRUCT_WRITE__FIELD = eINSTANCE.getSsaStructWrite_Field();

		/**
		 * The meta object literal for the '{@link hu.metadom.hls.ssamodel.impl.SsaArrayReadImpl <em>Ssa Array Read</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.metadom.hls.ssamodel.impl.SsaArrayReadImpl
		 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaArrayRead()
		 * @generated
		 */
		EClass SSA_ARRAY_READ = eINSTANCE.getSsaArrayRead();

		/**
		 * The meta object literal for the '<em><b>Array</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSA_ARRAY_READ__ARRAY = eINSTANCE.getSsaArrayRead_Array();

		/**
		 * The meta object literal for the '<em><b>Indices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSA_ARRAY_READ__INDICES = eINSTANCE.getSsaArrayRead_Indices();

		/**
		 * The meta object literal for the '{@link hu.metadom.hls.ssamodel.impl.SsaArrayWriteImpl <em>Ssa Array Write</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.metadom.hls.ssamodel.impl.SsaArrayWriteImpl
		 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaArrayWrite()
		 * @generated
		 */
		EClass SSA_ARRAY_WRITE = eINSTANCE.getSsaArrayWrite();

		/**
		 * The meta object literal for the '<em><b>Array</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSA_ARRAY_WRITE__ARRAY = eINSTANCE.getSsaArrayWrite_Array();

		/**
		 * The meta object literal for the '<em><b>Indices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSA_ARRAY_WRITE__INDICES = eINSTANCE.getSsaArrayWrite_Indices();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSA_ARRAY_WRITE__VALUE = eINSTANCE.getSsaArrayWrite_Value();

		/**
		 * The meta object literal for the '{@link hu.metadom.hls.ssamodel.impl.FilePositionImpl <em>File Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.metadom.hls.ssamodel.impl.FilePositionImpl
		 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getFilePosition()
		 * @generated
		 */
		EClass FILE_POSITION = eINSTANCE.getFilePosition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_POSITION__NAME = eINSTANCE.getFilePosition_Name();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_POSITION__LINE = eINSTANCE.getFilePosition_Line();

		/**
		 * The meta object literal for the '<em><b>Start Position In Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_POSITION__START_POSITION_IN_LINE = eINSTANCE.getFilePosition_StartPositionInLine();

		/**
		 * The meta object literal for the '<em><b>End Position In Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_POSITION__END_POSITION_IN_LINE = eINSTANCE.getFilePosition_EndPositionInLine();

		/**
		 * The meta object literal for the '<em><b>Start Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_POSITION__START_POSITION = eINSTANCE.getFilePosition_StartPosition();

		/**
		 * The meta object literal for the '<em><b>End Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_POSITION__END_POSITION = eINSTANCE.getFilePosition_EndPosition();

		/**
		 * The meta object literal for the '{@link hu.metadom.hls.ssamodel.impl.SsaVarImpl <em>Ssa Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.metadom.hls.ssamodel.impl.SsaVarImpl
		 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaVar()
		 * @generated
		 */
		EClass SSA_VAR = eINSTANCE.getSsaVar();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSA_VAR__TYPE = eINSTANCE.getSsaVar_Type();

		/**
		 * The meta object literal for the '<em><b>Init Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSA_VAR__INIT_NODE = eINSTANCE.getSsaVar_InitNode();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SSA_VAR__ORIGIN = eINSTANCE.getSsaVar_Origin();

		/**
		 * The meta object literal for the '{@link hu.metadom.hls.ssamodel.impl.CNameScopeImpl <em>CName Scope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.metadom.hls.ssamodel.impl.CNameScopeImpl
		 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getCNameScope()
		 * @generated
		 */
		EClass CNAME_SCOPE = eINSTANCE.getCNameScope();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CNAME_SCOPE__PARENT = eINSTANCE.getCNameScope_Parent();

		/**
		 * The meta object literal for the '<em><b>Names</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CNAME_SCOPE__NAMES = eINSTANCE.getCNameScope_Names();

		/**
		 * The meta object literal for the '<em><b>Vars</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CNAME_SCOPE__VARS = eINSTANCE.getCNameScope_Vars();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CNAME_SCOPE__TYPES = eINSTANCE.getCNameScope_Types();

		/**
		 * The meta object literal for the '<em><b>Constants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CNAME_SCOPE__CONSTANTS = eINSTANCE.getCNameScope_Constants();

		/**
		 * The meta object literal for the '{@link hu.metadom.hls.ssamodel.impl.StringToCNameMapImpl <em>String To CName Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.metadom.hls.ssamodel.impl.StringToCNameMapImpl
		 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getStringToCNameMap()
		 * @generated
		 */
		EClass STRING_TO_CNAME_MAP = eINSTANCE.getStringToCNameMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_CNAME_MAP__KEY = eINSTANCE.getStringToCNameMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_TO_CNAME_MAP__VALUE = eINSTANCE.getStringToCNameMap_Value();

		/**
		 * The meta object literal for the '{@link hu.metadom.hls.ssamodel.impl.SsaExplicitCastImpl <em>Ssa Explicit Cast</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.metadom.hls.ssamodel.impl.SsaExplicitCastImpl
		 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaExplicitCast()
		 * @generated
		 */
		EClass SSA_EXPLICIT_CAST = eINSTANCE.getSsaExplicitCast();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSA_EXPLICIT_CAST__TO = eINSTANCE.getSsaExplicitCast_To();

		/**
		 * The meta object literal for the '{@link hu.metadom.hls.ssamodel.impl.MemberImpl <em>Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.metadom.hls.ssamodel.impl.MemberImpl
		 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getMember()
		 * @generated
		 */
		EClass MEMBER = eINSTANCE.getMember();

		/**
		 * The meta object literal for the '{@link hu.metadom.hls.ssamodel.impl.SsaDowhileImpl <em>Ssa Dowhile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.metadom.hls.ssamodel.impl.SsaDowhileImpl
		 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaDowhile()
		 * @generated
		 */
		EClass SSA_DOWHILE = eINSTANCE.getSsaDowhile();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSA_DOWHILE__BODY = eINSTANCE.getSsaDowhile_Body();

		/**
		 * The meta object literal for the '<em><b>Cond</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSA_DOWHILE__COND = eINSTANCE.getSsaDowhile_Cond();

		/**
		 * The meta object literal for the '<em><b>Merge</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSA_DOWHILE__MERGE = eINSTANCE.getSsaDowhile_Merge();

		/**
		 * The meta object literal for the '<em><b>Loop Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SSA_DOWHILE__LOOP_TYPE = eINSTANCE.getSsaDowhile_LoopType();

		/**
		 * The meta object literal for the '<em><b>Cond Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSA_DOWHILE__COND_NODE = eINSTANCE.getSsaDowhile_CondNode();

		/**
		 * The meta object literal for the '<em><b>Dowhile Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SSA_DOWHILE__DOWHILE_TYPE = eINSTANCE.getSsaDowhile_DowhileType();

		/**
		 * The meta object literal for the '{@link hu.metadom.hls.ssamodel.impl.SsaSwitchImpl <em>Ssa Switch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.metadom.hls.ssamodel.impl.SsaSwitchImpl
		 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaSwitch()
		 * @generated
		 */
		EClass SSA_SWITCH = eINSTANCE.getSsaSwitch();

		/**
		 * The meta object literal for the '<em><b>Selector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSA_SWITCH__SELECTOR = eINSTANCE.getSsaSwitch_Selector();

		/**
		 * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSA_SWITCH__CASES = eINSTANCE.getSsaSwitch_Cases();

		/**
		 * The meta object literal for the '<em><b>Merge</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSA_SWITCH__MERGE = eINSTANCE.getSsaSwitch_Merge();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSA_SWITCH__DEFAULT = eINSTANCE.getSsaSwitch_Default();

		/**
		 * The meta object literal for the '<em><b>Switch Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SSA_SWITCH__SWITCH_TYPE = eINSTANCE.getSsaSwitch_SwitchType();

		/**
		 * The meta object literal for the '{@link hu.metadom.hls.ssamodel.impl.SsaCaseImpl <em>Ssa Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.metadom.hls.ssamodel.impl.SsaCaseImpl
		 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaCase()
		 * @generated
		 */
		EClass SSA_CASE = eINSTANCE.getSsaCase();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSA_CASE__NODE = eINSTANCE.getSsaCase_Node();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSA_CASE__VALUES = eINSTANCE.getSsaCase_Values();

		/**
		 * The meta object literal for the '{@link hu.metadom.hls.ssamodel.impl.SsaControlImpl <em>Ssa Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.metadom.hls.ssamodel.impl.SsaControlImpl
		 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaControl()
		 * @generated
		 */
		EClass SSA_CONTROL = eINSTANCE.getSsaControl();

		/**
		 * The meta object literal for the '<em><b>Control Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SSA_CONTROL__CONTROL_TYPE = eINSTANCE.getSsaControl_ControlType();

		/**
		 * The meta object literal for the '{@link hu.metadom.hls.ssamodel.impl.SsaAbstractInitImpl <em>Ssa Abstract Init</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.metadom.hls.ssamodel.impl.SsaAbstractInitImpl
		 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaAbstractInit()
		 * @generated
		 */
		EClass SSA_ABSTRACT_INIT = eINSTANCE.getSsaAbstractInit();

		/**
		 * The meta object literal for the '{@link hu.metadom.hls.ssamodel.impl.SsaInitListImpl <em>Ssa Init List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.metadom.hls.ssamodel.impl.SsaInitListImpl
		 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaInitList()
		 * @generated
		 */
		EClass SSA_INIT_LIST = eINSTANCE.getSsaInitList();

		/**
		 * The meta object literal for the '<em><b>Inits</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSA_INIT_LIST__INITS = eINSTANCE.getSsaInitList_Inits();

		/**
		 * The meta object literal for the '{@link hu.metadom.hls.ssamodel.impl.SsaInitImpl <em>Ssa Init</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.metadom.hls.ssamodel.impl.SsaInitImpl
		 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaInit()
		 * @generated
		 */
		EClass SSA_INIT = eINSTANCE.getSsaInit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSA_INIT__VALUE = eINSTANCE.getSsaInit_Value();

		/**
		 * The meta object literal for the '{@link hu.metadom.hls.ssamodel.impl.FunctionTypeImpl <em>Function Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.metadom.hls.ssamodel.impl.FunctionTypeImpl
		 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getFunctionType()
		 * @generated
		 */
		EClass FUNCTION_TYPE = eINSTANCE.getFunctionType();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_TYPE__RETURN_TYPE = eINSTANCE.getFunctionType_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Param Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_TYPE__PARAM_TYPES = eINSTANCE.getFunctionType_ParamTypes();

		/**
		 * The meta object literal for the '{@link hu.metadom.hls.ssamodel.impl.SsaIndirectWriteImpl <em>Ssa Indirect Write</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.metadom.hls.ssamodel.impl.SsaIndirectWriteImpl
		 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaIndirectWrite()
		 * @generated
		 */
		EClass SSA_INDIRECT_WRITE = eINSTANCE.getSsaIndirectWrite();

		/**
		 * The meta object literal for the '<em><b>Pointer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSA_INDIRECT_WRITE__POINTER = eINSTANCE.getSsaIndirectWrite_Pointer();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSA_INDIRECT_WRITE__VALUE = eINSTANCE.getSsaIndirectWrite_Value();

		/**
		 * The meta object literal for the '{@link hu.metadom.hls.ssamodel.impl.SsaIndirectReadImpl <em>Ssa Indirect Read</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.metadom.hls.ssamodel.impl.SsaIndirectReadImpl
		 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaIndirectRead()
		 * @generated
		 */
		EClass SSA_INDIRECT_READ = eINSTANCE.getSsaIndirectRead();

		/**
		 * The meta object literal for the '<em><b>Pointer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSA_INDIRECT_READ__POINTER = eINSTANCE.getSsaIndirectRead_Pointer();

		/**
		 * The meta object literal for the '{@link hu.metadom.hls.ssamodel.impl.SsaNodeRefImpl <em>Ssa Node Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.metadom.hls.ssamodel.impl.SsaNodeRefImpl
		 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaNodeRef()
		 * @generated
		 */
		EClass SSA_NODE_REF = eINSTANCE.getSsaNodeRef();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSA_NODE_REF__NODE = eINSTANCE.getSsaNodeRef_Node();

		/**
		 * The meta object literal for the '<em><b>Fileposition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSA_NODE_REF__FILEPOSITION = eINSTANCE.getSsaNodeRef_Fileposition();

		/**
		 * The meta object literal for the '{@link hu.metadom.hls.ssamodel.impl.SsaGotoImpl <em>Ssa Goto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.metadom.hls.ssamodel.impl.SsaGotoImpl
		 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaGoto()
		 * @generated
		 */
		EClass SSA_GOTO = eINSTANCE.getSsaGoto();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSA_GOTO__LABEL = eINSTANCE.getSsaGoto_Label();

		/**
		 * The meta object literal for the '{@link hu.metadom.hls.ssamodel.impl.SsaLabelImpl <em>Ssa Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.metadom.hls.ssamodel.impl.SsaLabelImpl
		 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaLabel()
		 * @generated
		 */
		EClass SSA_LABEL = eINSTANCE.getSsaLabel();

		/**
		 * The meta object literal for the '{@link hu.metadom.hls.ssamodel.impl.SsaPassByRefArgumentImpl <em>Ssa Pass By Ref Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.metadom.hls.ssamodel.impl.SsaPassByRefArgumentImpl
		 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaPassByRefArgument()
		 * @generated
		 */
		EClass SSA_PASS_BY_REF_ARGUMENT = eINSTANCE.getSsaPassByRefArgument();

		/**
		 * The meta object literal for the '<em><b>Out Node</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSA_PASS_BY_REF_ARGUMENT__OUT_NODE = eINSTANCE.getSsaPassByRefArgument_OutNode();

		/**
		 * The meta object literal for the '{@link hu.metadom.hls.ssamodel.impl.SsaArgumentImpl <em>Ssa Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.metadom.hls.ssamodel.impl.SsaArgumentImpl
		 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaArgument()
		 * @generated
		 */
		EClass SSA_ARGUMENT = eINSTANCE.getSsaArgument();

		/**
		 * The meta object literal for the '<em><b>Param</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSA_ARGUMENT__PARAM = eINSTANCE.getSsaArgument_Param();

		/**
		 * The meta object literal for the '{@link hu.metadom.hls.ssamodel.impl.SsaPassByRefParamImpl <em>Ssa Pass By Ref Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.metadom.hls.ssamodel.impl.SsaPassByRefParamImpl
		 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaPassByRefParam()
		 * @generated
		 */
		EClass SSA_PASS_BY_REF_PARAM = eINSTANCE.getSsaPassByRefParam();

		/**
		 * The meta object literal for the '<em><b>Out Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSA_PASS_BY_REF_PARAM__OUT_NODE = eINSTANCE.getSsaPassByRefParam_OutNode();

		/**
		 * The meta object literal for the '{@link hu.metadom.hls.ssamodel.impl.SsaOutputArgumentImpl <em>Ssa Output Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.metadom.hls.ssamodel.impl.SsaOutputArgumentImpl
		 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaOutputArgument()
		 * @generated
		 */
		EClass SSA_OUTPUT_ARGUMENT = eINSTANCE.getSsaOutputArgument();

		/**
		 * The meta object literal for the '{@link hu.metadom.hls.ssamodel.impl.SsaObjectImpl <em>Ssa Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.metadom.hls.ssamodel.impl.SsaObjectImpl
		 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaObject()
		 * @generated
		 */
		EClass SSA_OBJECT = eINSTANCE.getSsaObject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SSA_OBJECT__NAME = eINSTANCE.getSsaObject_Name();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SSA_OBJECT__COMMENT = eINSTANCE.getSsaObject_Comment();

		/**
		 * The meta object literal for the '<em><b>Fileposition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSA_OBJECT__FILEPOSITION = eINSTANCE.getSsaObject_Fileposition();

		/**
		 * The meta object literal for the '{@link hu.metadom.hls.ssamodel.impl.SsaSizeofImpl <em>Ssa Sizeof</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.metadom.hls.ssamodel.impl.SsaSizeofImpl
		 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaSizeof()
		 * @generated
		 */
		EClass SSA_SIZEOF = eINSTANCE.getSsaSizeof();

		/**
		 * The meta object literal for the '{@link hu.metadom.hls.ssamodel.impl.SsaSizeofTypeImpl <em>Ssa Sizeof Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.metadom.hls.ssamodel.impl.SsaSizeofTypeImpl
		 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaSizeofType()
		 * @generated
		 */
		EClass SSA_SIZEOF_TYPE = eINSTANCE.getSsaSizeofType();

		/**
		 * The meta object literal for the '<em><b>Sizeof Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSA_SIZEOF_TYPE__SIZEOF_TYPE = eINSTANCE.getSsaSizeofType_SizeofType();

		/**
		 * The meta object literal for the '{@link hu.metadom.hls.ssamodel.impl.SsaSizeofVarImpl <em>Ssa Sizeof Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.metadom.hls.ssamodel.impl.SsaSizeofVarImpl
		 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaSizeofVar()
		 * @generated
		 */
		EClass SSA_SIZEOF_VAR = eINSTANCE.getSsaSizeofVar();

		/**
		 * The meta object literal for the '<em><b>Sizeof Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSA_SIZEOF_VAR__SIZEOF_EXPR = eINSTANCE.getSsaSizeofVar_SizeofExpr();

		/**
		 * The meta object literal for the '{@link hu.metadom.hls.ssamodel.impl.CompileTimeExpressionImpl <em>Compile Time Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.metadom.hls.ssamodel.impl.CompileTimeExpressionImpl
		 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getCompileTimeExpression()
		 * @generated
		 */
		EClass COMPILE_TIME_EXPRESSION = eINSTANCE.getCompileTimeExpression();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPILE_TIME_EXPRESSION__VALUE = eINSTANCE.getCompileTimeExpression_Value();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPILE_TIME_EXPRESSION__NODE = eINSTANCE.getCompileTimeExpression_Node();

		/**
		 * The meta object literal for the '{@link hu.metadom.hls.ssamodel.SsaBinaryOperatorKind <em>Ssa Binary Operator Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.metadom.hls.ssamodel.SsaBinaryOperatorKind
		 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaBinaryOperatorKind()
		 * @generated
		 */
		EEnum SSA_BINARY_OPERATOR_KIND = eINSTANCE.getSsaBinaryOperatorKind();

		/**
		 * The meta object literal for the '{@link hu.metadom.hls.ssamodel.SsaUnaryOperatorKind <em>Ssa Unary Operator Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.metadom.hls.ssamodel.SsaUnaryOperatorKind
		 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSsaUnaryOperatorKind()
		 * @generated
		 */
		EEnum SSA_UNARY_OPERATOR_KIND = eINSTANCE.getSsaUnaryOperatorKind();

		/**
		 * The meta object literal for the '{@link hu.metadom.hls.ssamodel.ContainerType <em>Container Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.metadom.hls.ssamodel.ContainerType
		 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getContainerType()
		 * @generated
		 */
		EEnum CONTAINER_TYPE = eINSTANCE.getContainerType();

		/**
		 * The meta object literal for the '{@link hu.metadom.hls.ssamodel.LoopType <em>Loop Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.metadom.hls.ssamodel.LoopType
		 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getLoopType()
		 * @generated
		 */
		EEnum LOOP_TYPE = eINSTANCE.getLoopType();

		/**
		 * The meta object literal for the '{@link hu.metadom.hls.ssamodel.ControlType <em>Control Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.metadom.hls.ssamodel.ControlType
		 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getControlType()
		 * @generated
		 */
		EEnum CONTROL_TYPE = eINSTANCE.getControlType();

		/**
		 * The meta object literal for the '{@link hu.metadom.hls.ssamodel.ParamDirection <em>Param Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.metadom.hls.ssamodel.ParamDirection
		 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getParamDirection()
		 * @generated
		 */
		EEnum PARAM_DIRECTION = eINSTANCE.getParamDirection();

		/**
		 * The meta object literal for the '{@link hu.metadom.hls.ssamodel.SwitchType <em>Switch Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.metadom.hls.ssamodel.SwitchType
		 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getSwitchType()
		 * @generated
		 */
		EEnum SWITCH_TYPE = eINSTANCE.getSwitchType();

		/**
		 * The meta object literal for the '{@link hu.metadom.hls.ssamodel.DowhileType <em>Dowhile Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.metadom.hls.ssamodel.DowhileType
		 * @see hu.metadom.hls.ssamodel.impl.SsaModelPackageImpl#getDowhileType()
		 * @generated
		 */
		EEnum DOWHILE_TYPE = eINSTANCE.getDowhileType();

	}

} //SsaModelPackage
