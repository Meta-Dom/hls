/**
 */
package hu.metadom.hls.ssamodel.impl;

import hu.metadom.hls.ssamodel.SsaBinaryOperator;
import hu.metadom.hls.ssamodel.SsaBinaryOperatorKind;
import hu.metadom.hls.ssamodel.SsaModelPackage;
import hu.metadom.hls.ssamodel.SsaNode;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ssa Binary Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.metadom.hls.ssamodel.impl.SsaBinaryOperatorImpl#getOperatorKind <em>Operator Kind</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.impl.SsaBinaryOperatorImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.impl.SsaBinaryOperatorImpl#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SsaBinaryOperatorImpl extends SsaNodeImpl implements SsaBinaryOperator {
	/**
	 * The default value of the '{@link #getOperatorKind() <em>Operator Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatorKind()
	 * @generated
	 * @ordered
	 */
	protected static final SsaBinaryOperatorKind OPERATOR_KIND_EDEFAULT = SsaBinaryOperatorKind.MULTIPLY;

	/**
	 * The cached value of the '{@link #getOperatorKind() <em>Operator Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatorKind()
	 * @generated
	 * @ordered
	 */
	protected SsaBinaryOperatorKind operatorKind = OPERATOR_KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLeft() <em>Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected SsaNode left;

	/**
	 * The cached value of the '{@link #getRight() <em>Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected SsaNode right;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SsaBinaryOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SsaModelPackage.Literals.SSA_BINARY_OPERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaBinaryOperatorKind getOperatorKind() {
		return operatorKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperatorKind(SsaBinaryOperatorKind newOperatorKind) {
		SsaBinaryOperatorKind oldOperatorKind = operatorKind;
		operatorKind = newOperatorKind == null ? OPERATOR_KIND_EDEFAULT : newOperatorKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SsaModelPackage.SSA_BINARY_OPERATOR__OPERATOR_KIND,
					oldOperatorKind, operatorKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaNode getLeft() {
		if (left != null && left.eIsProxy()) {
			InternalEObject oldLeft = (InternalEObject) left;
			left = (SsaNode) eResolveProxy(oldLeft);
			if (left != oldLeft) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SsaModelPackage.SSA_BINARY_OPERATOR__LEFT,
							oldLeft, left));
			}
		}
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaNode basicGetLeft() {
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeft(SsaNode newLeft) {
		SsaNode oldLeft = left;
		left = newLeft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SsaModelPackage.SSA_BINARY_OPERATOR__LEFT, oldLeft,
					left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaNode getRight() {
		if (right != null && right.eIsProxy()) {
			InternalEObject oldRight = (InternalEObject) right;
			right = (SsaNode) eResolveProxy(oldRight);
			if (right != oldRight) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SsaModelPackage.SSA_BINARY_OPERATOR__RIGHT, oldRight, right));
			}
		}
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaNode basicGetRight() {
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRight(SsaNode newRight) {
		SsaNode oldRight = right;
		right = newRight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SsaModelPackage.SSA_BINARY_OPERATOR__RIGHT, oldRight,
					right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SsaModelPackage.SSA_BINARY_OPERATOR__OPERATOR_KIND:
			return getOperatorKind();
		case SsaModelPackage.SSA_BINARY_OPERATOR__LEFT:
			if (resolve)
				return getLeft();
			return basicGetLeft();
		case SsaModelPackage.SSA_BINARY_OPERATOR__RIGHT:
			if (resolve)
				return getRight();
			return basicGetRight();
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
		case SsaModelPackage.SSA_BINARY_OPERATOR__OPERATOR_KIND:
			setOperatorKind((SsaBinaryOperatorKind) newValue);
			return;
		case SsaModelPackage.SSA_BINARY_OPERATOR__LEFT:
			setLeft((SsaNode) newValue);
			return;
		case SsaModelPackage.SSA_BINARY_OPERATOR__RIGHT:
			setRight((SsaNode) newValue);
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
		case SsaModelPackage.SSA_BINARY_OPERATOR__OPERATOR_KIND:
			setOperatorKind(OPERATOR_KIND_EDEFAULT);
			return;
		case SsaModelPackage.SSA_BINARY_OPERATOR__LEFT:
			setLeft((SsaNode) null);
			return;
		case SsaModelPackage.SSA_BINARY_OPERATOR__RIGHT:
			setRight((SsaNode) null);
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
		case SsaModelPackage.SSA_BINARY_OPERATOR__OPERATOR_KIND:
			return operatorKind != OPERATOR_KIND_EDEFAULT;
		case SsaModelPackage.SSA_BINARY_OPERATOR__LEFT:
			return left != null;
		case SsaModelPackage.SSA_BINARY_OPERATOR__RIGHT:
			return right != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (operatorKind: ");
		result.append(operatorKind);
		result.append(')');
		return result.toString();
	}

} //SsaBinaryOperatorImpl
