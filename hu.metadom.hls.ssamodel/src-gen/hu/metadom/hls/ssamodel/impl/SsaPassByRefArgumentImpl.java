/**
 */
package hu.metadom.hls.ssamodel.impl;

import hu.metadom.hls.ssamodel.SsaModelPackage;
import hu.metadom.hls.ssamodel.SsaOutputArgument;
import hu.metadom.hls.ssamodel.SsaPassByRefArgument;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ssa Pass By Ref Argument</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.metadom.hls.ssamodel.impl.SsaPassByRefArgumentImpl#getOutNode <em>Out Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SsaPassByRefArgumentImpl extends SsaArgumentImpl implements SsaPassByRefArgument {
	/**
	 * The cached value of the '{@link #getOutNode() <em>Out Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutNode()
	 * @generated
	 * @ordered
	 */
	protected SsaOutputArgument outNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SsaPassByRefArgumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SsaModelPackage.Literals.SSA_PASS_BY_REF_ARGUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaOutputArgument getOutNode() {
		return outNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutNode(SsaOutputArgument newOutNode, NotificationChain msgs) {
		SsaOutputArgument oldOutNode = outNode;
		outNode = newOutNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SsaModelPackage.SSA_PASS_BY_REF_ARGUMENT__OUT_NODE, oldOutNode, newOutNode);
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
	public void setOutNode(SsaOutputArgument newOutNode) {
		if (newOutNode != outNode) {
			NotificationChain msgs = null;
			if (outNode != null)
				msgs = ((InternalEObject) outNode).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SsaModelPackage.SSA_PASS_BY_REF_ARGUMENT__OUT_NODE, null, msgs);
			if (newOutNode != null)
				msgs = ((InternalEObject) newOutNode).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SsaModelPackage.SSA_PASS_BY_REF_ARGUMENT__OUT_NODE, null, msgs);
			msgs = basicSetOutNode(newOutNode, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SsaModelPackage.SSA_PASS_BY_REF_ARGUMENT__OUT_NODE,
					newOutNode, newOutNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SsaModelPackage.SSA_PASS_BY_REF_ARGUMENT__OUT_NODE:
			return basicSetOutNode(null, msgs);
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
		case SsaModelPackage.SSA_PASS_BY_REF_ARGUMENT__OUT_NODE:
			return getOutNode();
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
		case SsaModelPackage.SSA_PASS_BY_REF_ARGUMENT__OUT_NODE:
			setOutNode((SsaOutputArgument) newValue);
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
		case SsaModelPackage.SSA_PASS_BY_REF_ARGUMENT__OUT_NODE:
			setOutNode((SsaOutputArgument) null);
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
		case SsaModelPackage.SSA_PASS_BY_REF_ARGUMENT__OUT_NODE:
			return outNode != null;
		}
		return super.eIsSet(featureID);
	}

} //SsaPassByRefArgumentImpl
