/**
 */
package hu.metadom.hls.ssamodel.impl;

import hu.metadom.hls.ssamodel.SsaModelPackage;
import hu.metadom.hls.ssamodel.SsaSizeofType;
import hu.metadom.hls.ssamodel.Type;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ssa Sizeof Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.metadom.hls.ssamodel.impl.SsaSizeofTypeImpl#getSizeofType <em>Sizeof Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SsaSizeofTypeImpl extends SsaSizeofImpl implements SsaSizeofType {
	/**
	 * The cached value of the '{@link #getSizeofType() <em>Sizeof Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeofType()
	 * @generated
	 * @ordered
	 */
	protected Type sizeofType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SsaSizeofTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SsaModelPackage.Literals.SSA_SIZEOF_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getSizeofType() {
		if (sizeofType != null && sizeofType.eIsProxy()) {
			InternalEObject oldSizeofType = (InternalEObject) sizeofType;
			sizeofType = (Type) eResolveProxy(oldSizeofType);
			if (sizeofType != oldSizeofType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SsaModelPackage.SSA_SIZEOF_TYPE__SIZEOF_TYPE, oldSizeofType, sizeofType));
			}
		}
		return sizeofType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetSizeofType() {
		return sizeofType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSizeofType(Type newSizeofType) {
		Type oldSizeofType = sizeofType;
		sizeofType = newSizeofType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SsaModelPackage.SSA_SIZEOF_TYPE__SIZEOF_TYPE,
					oldSizeofType, sizeofType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SsaModelPackage.SSA_SIZEOF_TYPE__SIZEOF_TYPE:
			if (resolve)
				return getSizeofType();
			return basicGetSizeofType();
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
		case SsaModelPackage.SSA_SIZEOF_TYPE__SIZEOF_TYPE:
			setSizeofType((Type) newValue);
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
		case SsaModelPackage.SSA_SIZEOF_TYPE__SIZEOF_TYPE:
			setSizeofType((Type) null);
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
		case SsaModelPackage.SSA_SIZEOF_TYPE__SIZEOF_TYPE:
			return sizeofType != null;
		}
		return super.eIsSet(featureID);
	}

} //SsaSizeofTypeImpl
