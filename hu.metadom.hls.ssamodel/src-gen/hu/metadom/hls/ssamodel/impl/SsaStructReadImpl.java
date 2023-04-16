/**
 */
package hu.metadom.hls.ssamodel.impl;

import hu.metadom.hls.ssamodel.SsaModelPackage;
import hu.metadom.hls.ssamodel.SsaNode;
import hu.metadom.hls.ssamodel.SsaStructRead;
import hu.metadom.hls.ssamodel.StructMember;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ssa Struct Read</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.metadom.hls.ssamodel.impl.SsaStructReadImpl#getStruct <em>Struct</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.impl.SsaStructReadImpl#getField <em>Field</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SsaStructReadImpl extends SsaNodeImpl implements SsaStructRead {
	/**
	 * The cached value of the '{@link #getStruct() <em>Struct</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStruct()
	 * @generated
	 * @ordered
	 */
	protected SsaNode struct;

	/**
	 * The cached value of the '{@link #getField() <em>Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getField()
	 * @generated
	 * @ordered
	 */
	protected StructMember field;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SsaStructReadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SsaModelPackage.Literals.SSA_STRUCT_READ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaNode getStruct() {
		if (struct != null && struct.eIsProxy()) {
			InternalEObject oldStruct = (InternalEObject) struct;
			struct = (SsaNode) eResolveProxy(oldStruct);
			if (struct != oldStruct) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SsaModelPackage.SSA_STRUCT_READ__STRUCT,
							oldStruct, struct));
			}
		}
		return struct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaNode basicGetStruct() {
		return struct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStruct(SsaNode newStruct) {
		SsaNode oldStruct = struct;
		struct = newStruct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SsaModelPackage.SSA_STRUCT_READ__STRUCT, oldStruct,
					struct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructMember getField() {
		if (field != null && field.eIsProxy()) {
			InternalEObject oldField = (InternalEObject) field;
			field = (StructMember) eResolveProxy(oldField);
			if (field != oldField) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SsaModelPackage.SSA_STRUCT_READ__FIELD,
							oldField, field));
			}
		}
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructMember basicGetField() {
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setField(StructMember newField) {
		StructMember oldField = field;
		field = newField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SsaModelPackage.SSA_STRUCT_READ__FIELD, oldField,
					field));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SsaModelPackage.SSA_STRUCT_READ__STRUCT:
			if (resolve)
				return getStruct();
			return basicGetStruct();
		case SsaModelPackage.SSA_STRUCT_READ__FIELD:
			if (resolve)
				return getField();
			return basicGetField();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SsaModelPackage.SSA_STRUCT_READ__STRUCT:
			setStruct((SsaNode) newValue);
			return;
		case SsaModelPackage.SSA_STRUCT_READ__FIELD:
			setField((StructMember) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case SsaModelPackage.SSA_STRUCT_READ__STRUCT:
			setStruct((SsaNode) null);
			return;
		case SsaModelPackage.SSA_STRUCT_READ__FIELD:
			setField((StructMember) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case SsaModelPackage.SSA_STRUCT_READ__STRUCT:
			return struct != null;
		case SsaModelPackage.SSA_STRUCT_READ__FIELD:
			return field != null;
		}
		return super.eIsSet(featureID);
	}

} //SsaStructReadImpl
