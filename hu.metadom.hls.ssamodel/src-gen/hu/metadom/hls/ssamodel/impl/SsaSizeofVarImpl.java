/**
 */
package hu.metadom.hls.ssamodel.impl;

import hu.metadom.hls.ssamodel.SsaModelPackage;
import hu.metadom.hls.ssamodel.SsaNode;
import hu.metadom.hls.ssamodel.SsaSizeofVar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ssa Sizeof Var</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.metadom.hls.ssamodel.impl.SsaSizeofVarImpl#getSizeofExpr <em>Sizeof Expr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SsaSizeofVarImpl extends SsaSizeofImpl implements SsaSizeofVar {
	/**
	 * The cached value of the '{@link #getSizeofExpr() <em>Sizeof Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeofExpr()
	 * @generated
	 * @ordered
	 */
	protected SsaNode sizeofExpr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SsaSizeofVarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SsaModelPackage.Literals.SSA_SIZEOF_VAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaNode getSizeofExpr() {
		return sizeofExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSizeofExpr(SsaNode newSizeofExpr, NotificationChain msgs) {
		SsaNode oldSizeofExpr = sizeofExpr;
		sizeofExpr = newSizeofExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SsaModelPackage.SSA_SIZEOF_VAR__SIZEOF_EXPR, oldSizeofExpr, newSizeofExpr);
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
	public void setSizeofExpr(SsaNode newSizeofExpr) {
		if (newSizeofExpr != sizeofExpr) {
			NotificationChain msgs = null;
			if (sizeofExpr != null)
				msgs = ((InternalEObject) sizeofExpr).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SsaModelPackage.SSA_SIZEOF_VAR__SIZEOF_EXPR, null, msgs);
			if (newSizeofExpr != null)
				msgs = ((InternalEObject) newSizeofExpr).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SsaModelPackage.SSA_SIZEOF_VAR__SIZEOF_EXPR, null, msgs);
			msgs = basicSetSizeofExpr(newSizeofExpr, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SsaModelPackage.SSA_SIZEOF_VAR__SIZEOF_EXPR,
					newSizeofExpr, newSizeofExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SsaModelPackage.SSA_SIZEOF_VAR__SIZEOF_EXPR:
			return basicSetSizeofExpr(null, msgs);
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
		case SsaModelPackage.SSA_SIZEOF_VAR__SIZEOF_EXPR:
			return getSizeofExpr();
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
		case SsaModelPackage.SSA_SIZEOF_VAR__SIZEOF_EXPR:
			setSizeofExpr((SsaNode) newValue);
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
		case SsaModelPackage.SSA_SIZEOF_VAR__SIZEOF_EXPR:
			setSizeofExpr((SsaNode) null);
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
		case SsaModelPackage.SSA_SIZEOF_VAR__SIZEOF_EXPR:
			return sizeofExpr != null;
		}
		return super.eIsSet(featureID);
	}

} //SsaSizeofVarImpl
