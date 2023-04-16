/**
 */
package hu.metadom.hls.ssamodel.impl;

import hu.metadom.hls.ssamodel.SsaBlock;
import hu.metadom.hls.ssamodel.SsaConditionalJump;
import hu.metadom.hls.ssamodel.SsaModelPackage;
import hu.metadom.hls.ssamodel.SsaNode;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ssa Conditional Jump</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.metadom.hls.ssamodel.impl.SsaConditionalJumpImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.impl.SsaConditionalJumpImpl#getThenBlock <em>Then Block</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.impl.SsaConditionalJumpImpl#getElseBlock <em>Else Block</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SsaConditionalJumpImpl extends SsaNodeImpl implements SsaConditionalJump {
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected SsaNode condition;

	/**
	 * The cached value of the '{@link #getThenBlock() <em>Then Block</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThenBlock()
	 * @generated
	 * @ordered
	 */
	protected SsaBlock thenBlock;

	/**
	 * The cached value of the '{@link #getElseBlock() <em>Else Block</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseBlock()
	 * @generated
	 * @ordered
	 */
	protected SsaBlock elseBlock;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SsaConditionalJumpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SsaModelPackage.Literals.SSA_CONDITIONAL_JUMP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaNode getCondition() {
		if (condition != null && condition.eIsProxy()) {
			InternalEObject oldCondition = (InternalEObject) condition;
			condition = (SsaNode) eResolveProxy(oldCondition);
			if (condition != oldCondition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SsaModelPackage.SSA_CONDITIONAL_JUMP__CONDITION, oldCondition, condition));
			}
		}
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaNode basicGetCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(SsaNode newCondition) {
		SsaNode oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SsaModelPackage.SSA_CONDITIONAL_JUMP__CONDITION,
					oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaBlock getThenBlock() {
		if (thenBlock != null && thenBlock.eIsProxy()) {
			InternalEObject oldThenBlock = (InternalEObject) thenBlock;
			thenBlock = (SsaBlock) eResolveProxy(oldThenBlock);
			if (thenBlock != oldThenBlock) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SsaModelPackage.SSA_CONDITIONAL_JUMP__THEN_BLOCK, oldThenBlock, thenBlock));
			}
		}
		return thenBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaBlock basicGetThenBlock() {
		return thenBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThenBlock(SsaBlock newThenBlock) {
		SsaBlock oldThenBlock = thenBlock;
		thenBlock = newThenBlock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SsaModelPackage.SSA_CONDITIONAL_JUMP__THEN_BLOCK,
					oldThenBlock, thenBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaBlock getElseBlock() {
		if (elseBlock != null && elseBlock.eIsProxy()) {
			InternalEObject oldElseBlock = (InternalEObject) elseBlock;
			elseBlock = (SsaBlock) eResolveProxy(oldElseBlock);
			if (elseBlock != oldElseBlock) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SsaModelPackage.SSA_CONDITIONAL_JUMP__ELSE_BLOCK, oldElseBlock, elseBlock));
			}
		}
		return elseBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaBlock basicGetElseBlock() {
		return elseBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElseBlock(SsaBlock newElseBlock) {
		SsaBlock oldElseBlock = elseBlock;
		elseBlock = newElseBlock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SsaModelPackage.SSA_CONDITIONAL_JUMP__ELSE_BLOCK,
					oldElseBlock, elseBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SsaModelPackage.SSA_CONDITIONAL_JUMP__CONDITION:
			if (resolve)
				return getCondition();
			return basicGetCondition();
		case SsaModelPackage.SSA_CONDITIONAL_JUMP__THEN_BLOCK:
			if (resolve)
				return getThenBlock();
			return basicGetThenBlock();
		case SsaModelPackage.SSA_CONDITIONAL_JUMP__ELSE_BLOCK:
			if (resolve)
				return getElseBlock();
			return basicGetElseBlock();
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
		case SsaModelPackage.SSA_CONDITIONAL_JUMP__CONDITION:
			setCondition((SsaNode) newValue);
			return;
		case SsaModelPackage.SSA_CONDITIONAL_JUMP__THEN_BLOCK:
			setThenBlock((SsaBlock) newValue);
			return;
		case SsaModelPackage.SSA_CONDITIONAL_JUMP__ELSE_BLOCK:
			setElseBlock((SsaBlock) newValue);
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
		case SsaModelPackage.SSA_CONDITIONAL_JUMP__CONDITION:
			setCondition((SsaNode) null);
			return;
		case SsaModelPackage.SSA_CONDITIONAL_JUMP__THEN_BLOCK:
			setThenBlock((SsaBlock) null);
			return;
		case SsaModelPackage.SSA_CONDITIONAL_JUMP__ELSE_BLOCK:
			setElseBlock((SsaBlock) null);
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
		case SsaModelPackage.SSA_CONDITIONAL_JUMP__CONDITION:
			return condition != null;
		case SsaModelPackage.SSA_CONDITIONAL_JUMP__THEN_BLOCK:
			return thenBlock != null;
		case SsaModelPackage.SSA_CONDITIONAL_JUMP__ELSE_BLOCK:
			return elseBlock != null;
		}
		return super.eIsSet(featureID);
	}

} //SsaConditionalJumpImpl
