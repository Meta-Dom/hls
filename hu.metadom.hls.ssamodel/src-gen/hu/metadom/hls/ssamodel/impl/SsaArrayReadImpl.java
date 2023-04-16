/**
 */
package hu.metadom.hls.ssamodel.impl;

import hu.metadom.hls.ssamodel.SsaArrayRead;
import hu.metadom.hls.ssamodel.SsaModelPackage;
import hu.metadom.hls.ssamodel.SsaNode;
import hu.metadom.hls.ssamodel.SsaNodeRef;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ssa Array Read</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.metadom.hls.ssamodel.impl.SsaArrayReadImpl#getArray <em>Array</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.impl.SsaArrayReadImpl#getIndices <em>Indices</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SsaArrayReadImpl extends SsaNodeImpl implements SsaArrayRead {
	/**
	 * The cached value of the '{@link #getArray() <em>Array</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArray()
	 * @generated
	 * @ordered
	 */
	protected SsaNode array;

	/**
	 * The cached value of the '{@link #getIndices() <em>Indices</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndices()
	 * @generated
	 * @ordered
	 */
	protected EList<SsaNodeRef> indices;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SsaArrayReadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SsaModelPackage.Literals.SSA_ARRAY_READ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaNode getArray() {
		if (array != null && array.eIsProxy()) {
			InternalEObject oldArray = (InternalEObject) array;
			array = (SsaNode) eResolveProxy(oldArray);
			if (array != oldArray) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SsaModelPackage.SSA_ARRAY_READ__ARRAY,
							oldArray, array));
			}
		}
		return array;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaNode basicGetArray() {
		return array;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArray(SsaNode newArray) {
		SsaNode oldArray = array;
		array = newArray;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SsaModelPackage.SSA_ARRAY_READ__ARRAY, oldArray,
					array));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SsaNodeRef> getIndices() {
		if (indices == null) {
			indices = new EObjectContainmentEList<SsaNodeRef>(SsaNodeRef.class, this,
					SsaModelPackage.SSA_ARRAY_READ__INDICES);
		}
		return indices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SsaModelPackage.SSA_ARRAY_READ__INDICES:
			return ((InternalEList<?>) getIndices()).basicRemove(otherEnd, msgs);
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
		case SsaModelPackage.SSA_ARRAY_READ__ARRAY:
			if (resolve)
				return getArray();
			return basicGetArray();
		case SsaModelPackage.SSA_ARRAY_READ__INDICES:
			return getIndices();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SsaModelPackage.SSA_ARRAY_READ__ARRAY:
			setArray((SsaNode) newValue);
			return;
		case SsaModelPackage.SSA_ARRAY_READ__INDICES:
			getIndices().clear();
			getIndices().addAll((Collection<? extends SsaNodeRef>) newValue);
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
		case SsaModelPackage.SSA_ARRAY_READ__ARRAY:
			setArray((SsaNode) null);
			return;
		case SsaModelPackage.SSA_ARRAY_READ__INDICES:
			getIndices().clear();
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
		case SsaModelPackage.SSA_ARRAY_READ__ARRAY:
			return array != null;
		case SsaModelPackage.SSA_ARRAY_READ__INDICES:
			return indices != null && !indices.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SsaArrayReadImpl
