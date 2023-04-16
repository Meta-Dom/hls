/**
 */
package hu.metadom.hls.ssamodel.impl;

import hu.metadom.hls.ssamodel.CompileTimeExpression;
import hu.metadom.hls.ssamodel.SsaModelPackage;
import hu.metadom.hls.ssamodel.StructBitfieldMember;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Struct Bitfield Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.metadom.hls.ssamodel.impl.StructBitfieldMemberImpl#getBitfieldValue <em>Bitfield Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructBitfieldMemberImpl extends StructMemberImpl implements StructBitfieldMember {
	/**
	 * The cached value of the '{@link #getBitfieldValue() <em>Bitfield Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitfieldValue()
	 * @generated
	 * @ordered
	 */
	protected CompileTimeExpression bitfieldValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructBitfieldMemberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SsaModelPackage.Literals.STRUCT_BITFIELD_MEMBER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompileTimeExpression getBitfieldValue() {
		return bitfieldValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBitfieldValue(CompileTimeExpression newBitfieldValue, NotificationChain msgs) {
		CompileTimeExpression oldBitfieldValue = bitfieldValue;
		bitfieldValue = newBitfieldValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SsaModelPackage.STRUCT_BITFIELD_MEMBER__BITFIELD_VALUE, oldBitfieldValue, newBitfieldValue);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBitfieldValue(CompileTimeExpression newBitfieldValue) {
		if (newBitfieldValue != bitfieldValue) {
			NotificationChain msgs = null;
			if (bitfieldValue != null)
				msgs = ((InternalEObject) bitfieldValue).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SsaModelPackage.STRUCT_BITFIELD_MEMBER__BITFIELD_VALUE, null, msgs);
			if (newBitfieldValue != null)
				msgs = ((InternalEObject) newBitfieldValue).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SsaModelPackage.STRUCT_BITFIELD_MEMBER__BITFIELD_VALUE, null, msgs);
			msgs = basicSetBitfieldValue(newBitfieldValue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SsaModelPackage.STRUCT_BITFIELD_MEMBER__BITFIELD_VALUE, newBitfieldValue, newBitfieldValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SsaModelPackage.STRUCT_BITFIELD_MEMBER__BITFIELD_VALUE:
			return basicSetBitfieldValue(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SsaModelPackage.STRUCT_BITFIELD_MEMBER__BITFIELD_VALUE:
			return getBitfieldValue();
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
		case SsaModelPackage.STRUCT_BITFIELD_MEMBER__BITFIELD_VALUE:
			setBitfieldValue((CompileTimeExpression) newValue);
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
		case SsaModelPackage.STRUCT_BITFIELD_MEMBER__BITFIELD_VALUE:
			setBitfieldValue((CompileTimeExpression) null);
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
		case SsaModelPackage.STRUCT_BITFIELD_MEMBER__BITFIELD_VALUE:
			return bitfieldValue != null;
		}
		return super.eIsSet(featureID);
	}

} //StructBitfieldMemberImpl
