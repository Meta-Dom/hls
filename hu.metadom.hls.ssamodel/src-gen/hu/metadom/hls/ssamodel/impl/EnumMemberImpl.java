/**
 */
package hu.metadom.hls.ssamodel.impl;

import hu.metadom.hls.ssamodel.EnumMember;
import hu.metadom.hls.ssamodel.SsaConst;
import hu.metadom.hls.ssamodel.SsaModelPackage;
import hu.metadom.hls.ssamodel.SsaNode;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.metadom.hls.ssamodel.impl.EnumMemberImpl#getConst <em>Const</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.impl.EnumMemberImpl#getValueNode <em>Value Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumMemberImpl extends MemberImpl implements EnumMember {
	/**
	 * The cached value of the '{@link #getConst() <em>Const</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConst()
	 * @generated
	 * @ordered
	 */
	protected SsaConst const_;

	/**
	 * The cached value of the '{@link #getValueNode() <em>Value Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueNode()
	 * @generated
	 * @ordered
	 */
	protected SsaNode valueNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumMemberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SsaModelPackage.Literals.ENUM_MEMBER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaConst getConst() {
		return const_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConst(SsaConst newConst, NotificationChain msgs) {
		SsaConst oldConst = const_;
		const_ = newConst;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SsaModelPackage.ENUM_MEMBER__CONST, oldConst, newConst);
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
	public void setConst(SsaConst newConst) {
		if (newConst != const_) {
			NotificationChain msgs = null;
			if (const_ != null)
				msgs = ((InternalEObject) const_).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SsaModelPackage.ENUM_MEMBER__CONST, null, msgs);
			if (newConst != null)
				msgs = ((InternalEObject) newConst).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SsaModelPackage.ENUM_MEMBER__CONST, null, msgs);
			msgs = basicSetConst(newConst, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SsaModelPackage.ENUM_MEMBER__CONST, newConst,
					newConst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaNode getValueNode() {
		return valueNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueNode(SsaNode newValueNode, NotificationChain msgs) {
		SsaNode oldValueNode = valueNode;
		valueNode = newValueNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SsaModelPackage.ENUM_MEMBER__VALUE_NODE, oldValueNode, newValueNode);
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
	public void setValueNode(SsaNode newValueNode) {
		if (newValueNode != valueNode) {
			NotificationChain msgs = null;
			if (valueNode != null)
				msgs = ((InternalEObject) valueNode).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SsaModelPackage.ENUM_MEMBER__VALUE_NODE, null, msgs);
			if (newValueNode != null)
				msgs = ((InternalEObject) newValueNode).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SsaModelPackage.ENUM_MEMBER__VALUE_NODE, null, msgs);
			msgs = basicSetValueNode(newValueNode, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SsaModelPackage.ENUM_MEMBER__VALUE_NODE, newValueNode,
					newValueNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SsaModelPackage.ENUM_MEMBER__CONST:
			return basicSetConst(null, msgs);
		case SsaModelPackage.ENUM_MEMBER__VALUE_NODE:
			return basicSetValueNode(null, msgs);
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
		case SsaModelPackage.ENUM_MEMBER__CONST:
			return getConst();
		case SsaModelPackage.ENUM_MEMBER__VALUE_NODE:
			return getValueNode();
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
		case SsaModelPackage.ENUM_MEMBER__CONST:
			setConst((SsaConst) newValue);
			return;
		case SsaModelPackage.ENUM_MEMBER__VALUE_NODE:
			setValueNode((SsaNode) newValue);
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
		case SsaModelPackage.ENUM_MEMBER__CONST:
			setConst((SsaConst) null);
			return;
		case SsaModelPackage.ENUM_MEMBER__VALUE_NODE:
			setValueNode((SsaNode) null);
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
		case SsaModelPackage.ENUM_MEMBER__CONST:
			return const_ != null;
		case SsaModelPackage.ENUM_MEMBER__VALUE_NODE:
			return valueNode != null;
		}
		return super.eIsSet(featureID);
	}

} //EnumMemberImpl
