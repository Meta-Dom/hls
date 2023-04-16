/**
 */
package hu.metadom.hls.ssamodel.impl;

import hu.metadom.hls.ssamodel.SsaModelPackage;
import hu.metadom.hls.ssamodel.SsaNode;
import hu.metadom.hls.ssamodel.SsaUnaryOperator;
import hu.metadom.hls.ssamodel.SsaUnaryOperatorKind;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ssa Unary Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.metadom.hls.ssamodel.impl.SsaUnaryOperatorImpl#getOperatorKind <em>Operator Kind</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.impl.SsaUnaryOperatorImpl#getOperand <em>Operand</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SsaUnaryOperatorImpl extends SsaNodeImpl implements SsaUnaryOperator {
	/**
	 * The default value of the '{@link #getOperatorKind() <em>Operator Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatorKind()
	 * @generated
	 * @ordered
	 */
	protected static final SsaUnaryOperatorKind OPERATOR_KIND_EDEFAULT = SsaUnaryOperatorKind.ADDRESS;

	/**
	 * The cached value of the '{@link #getOperatorKind() <em>Operator Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatorKind()
	 * @generated
	 * @ordered
	 */
	protected SsaUnaryOperatorKind operatorKind = OPERATOR_KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOperand() <em>Operand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperand()
	 * @generated
	 * @ordered
	 */
	protected SsaNode operand;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SsaUnaryOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SsaModelPackage.Literals.SSA_UNARY_OPERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaUnaryOperatorKind getOperatorKind() {
		return operatorKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperatorKind(SsaUnaryOperatorKind newOperatorKind) {
		SsaUnaryOperatorKind oldOperatorKind = operatorKind;
		operatorKind = newOperatorKind == null ? OPERATOR_KIND_EDEFAULT : newOperatorKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SsaModelPackage.SSA_UNARY_OPERATOR__OPERATOR_KIND,
					oldOperatorKind, operatorKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaNode getOperand() {
		if (operand != null && operand.eIsProxy()) {
			InternalEObject oldOperand = (InternalEObject) operand;
			operand = (SsaNode) eResolveProxy(oldOperand);
			if (operand != oldOperand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SsaModelPackage.SSA_UNARY_OPERATOR__OPERAND, oldOperand, operand));
			}
		}
		return operand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaNode basicGetOperand() {
		return operand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperand(SsaNode newOperand) {
		SsaNode oldOperand = operand;
		operand = newOperand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SsaModelPackage.SSA_UNARY_OPERATOR__OPERAND,
					oldOperand, operand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SsaModelPackage.SSA_UNARY_OPERATOR__OPERATOR_KIND:
			return getOperatorKind();
		case SsaModelPackage.SSA_UNARY_OPERATOR__OPERAND:
			if (resolve)
				return getOperand();
			return basicGetOperand();
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
		case SsaModelPackage.SSA_UNARY_OPERATOR__OPERATOR_KIND:
			setOperatorKind((SsaUnaryOperatorKind) newValue);
			return;
		case SsaModelPackage.SSA_UNARY_OPERATOR__OPERAND:
			setOperand((SsaNode) newValue);
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
		case SsaModelPackage.SSA_UNARY_OPERATOR__OPERATOR_KIND:
			setOperatorKind(OPERATOR_KIND_EDEFAULT);
			return;
		case SsaModelPackage.SSA_UNARY_OPERATOR__OPERAND:
			setOperand((SsaNode) null);
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
		case SsaModelPackage.SSA_UNARY_OPERATOR__OPERATOR_KIND:
			return operatorKind != OPERATOR_KIND_EDEFAULT;
		case SsaModelPackage.SSA_UNARY_OPERATOR__OPERAND:
			return operand != null;
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

} //SsaUnaryOperatorImpl
