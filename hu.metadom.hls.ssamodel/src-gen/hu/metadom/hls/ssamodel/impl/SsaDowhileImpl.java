/**
 */
package hu.metadom.hls.ssamodel.impl;

import hu.metadom.hls.ssamodel.DowhileType;
import hu.metadom.hls.ssamodel.LoopType;
import hu.metadom.hls.ssamodel.SsaDowhile;
import hu.metadom.hls.ssamodel.SsaModelPackage;
import hu.metadom.hls.ssamodel.SsaNode;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ssa Dowhile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.metadom.hls.ssamodel.impl.SsaDowhileImpl#getBody <em>Body</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.impl.SsaDowhileImpl#getCond <em>Cond</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.impl.SsaDowhileImpl#getMerge <em>Merge</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.impl.SsaDowhileImpl#getLoopType <em>Loop Type</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.impl.SsaDowhileImpl#getCondNode <em>Cond Node</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.impl.SsaDowhileImpl#getDowhileType <em>Dowhile Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SsaDowhileImpl extends SsaNodeImpl implements SsaDowhile {
	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected SsaNode body;

	/**
	 * The cached value of the '{@link #getCond() <em>Cond</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCond()
	 * @generated
	 * @ordered
	 */
	protected SsaNode cond;

	/**
	 * The cached value of the '{@link #getMerge() <em>Merge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMerge()
	 * @generated
	 * @ordered
	 */
	protected SsaNode merge;

	/**
	 * The default value of the '{@link #getLoopType() <em>Loop Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopType()
	 * @generated
	 * @ordered
	 */
	protected static final LoopType LOOP_TYPE_EDEFAULT = LoopType.TOPTEST;

	/**
	 * The cached value of the '{@link #getLoopType() <em>Loop Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopType()
	 * @generated
	 * @ordered
	 */
	protected LoopType loopType = LOOP_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCondNode() <em>Cond Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondNode()
	 * @generated
	 * @ordered
	 */
	protected SsaNode condNode;

	/**
	 * The default value of the '{@link #getDowhileType() <em>Dowhile Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDowhileType()
	 * @generated
	 * @ordered
	 */
	protected static final DowhileType DOWHILE_TYPE_EDEFAULT = DowhileType.WHILE;

	/**
	 * The cached value of the '{@link #getDowhileType() <em>Dowhile Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDowhileType()
	 * @generated
	 * @ordered
	 */
	protected DowhileType dowhileType = DOWHILE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SsaDowhileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SsaModelPackage.Literals.SSA_DOWHILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaNode getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(SsaNode newBody, NotificationChain msgs) {
		SsaNode oldBody = body;
		body = newBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SsaModelPackage.SSA_DOWHILE__BODY, oldBody, newBody);
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
	public void setBody(SsaNode newBody) {
		if (newBody != body) {
			NotificationChain msgs = null;
			if (body != null)
				msgs = ((InternalEObject) body).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SsaModelPackage.SSA_DOWHILE__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject) newBody).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SsaModelPackage.SSA_DOWHILE__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SsaModelPackage.SSA_DOWHILE__BODY, newBody, newBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaNode getCond() {
		return cond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCond(SsaNode newCond, NotificationChain msgs) {
		SsaNode oldCond = cond;
		cond = newCond;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SsaModelPackage.SSA_DOWHILE__COND, oldCond, newCond);
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
	public void setCond(SsaNode newCond) {
		if (newCond != cond) {
			NotificationChain msgs = null;
			if (cond != null)
				msgs = ((InternalEObject) cond).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SsaModelPackage.SSA_DOWHILE__COND, null, msgs);
			if (newCond != null)
				msgs = ((InternalEObject) newCond).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SsaModelPackage.SSA_DOWHILE__COND, null, msgs);
			msgs = basicSetCond(newCond, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SsaModelPackage.SSA_DOWHILE__COND, newCond, newCond));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaNode getMerge() {
		return merge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMerge(SsaNode newMerge, NotificationChain msgs) {
		SsaNode oldMerge = merge;
		merge = newMerge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SsaModelPackage.SSA_DOWHILE__MERGE, oldMerge, newMerge);
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
	public void setMerge(SsaNode newMerge) {
		if (newMerge != merge) {
			NotificationChain msgs = null;
			if (merge != null)
				msgs = ((InternalEObject) merge).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SsaModelPackage.SSA_DOWHILE__MERGE, null, msgs);
			if (newMerge != null)
				msgs = ((InternalEObject) newMerge).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SsaModelPackage.SSA_DOWHILE__MERGE, null, msgs);
			msgs = basicSetMerge(newMerge, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SsaModelPackage.SSA_DOWHILE__MERGE, newMerge,
					newMerge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopType getLoopType() {
		return loopType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoopType(LoopType newLoopType) {
		LoopType oldLoopType = loopType;
		loopType = newLoopType == null ? LOOP_TYPE_EDEFAULT : newLoopType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SsaModelPackage.SSA_DOWHILE__LOOP_TYPE, oldLoopType,
					loopType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaNode getCondNode() {
		if (condNode != null && condNode.eIsProxy()) {
			InternalEObject oldCondNode = (InternalEObject) condNode;
			condNode = (SsaNode) eResolveProxy(oldCondNode);
			if (condNode != oldCondNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SsaModelPackage.SSA_DOWHILE__COND_NODE,
							oldCondNode, condNode));
			}
		}
		return condNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaNode basicGetCondNode() {
		return condNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondNode(SsaNode newCondNode) {
		SsaNode oldCondNode = condNode;
		condNode = newCondNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SsaModelPackage.SSA_DOWHILE__COND_NODE, oldCondNode,
					condNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DowhileType getDowhileType() {
		return dowhileType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDowhileType(DowhileType newDowhileType) {
		DowhileType oldDowhileType = dowhileType;
		dowhileType = newDowhileType == null ? DOWHILE_TYPE_EDEFAULT : newDowhileType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SsaModelPackage.SSA_DOWHILE__DOWHILE_TYPE,
					oldDowhileType, dowhileType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SsaModelPackage.SSA_DOWHILE__BODY:
			return basicSetBody(null, msgs);
		case SsaModelPackage.SSA_DOWHILE__COND:
			return basicSetCond(null, msgs);
		case SsaModelPackage.SSA_DOWHILE__MERGE:
			return basicSetMerge(null, msgs);
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
		case SsaModelPackage.SSA_DOWHILE__BODY:
			return getBody();
		case SsaModelPackage.SSA_DOWHILE__COND:
			return getCond();
		case SsaModelPackage.SSA_DOWHILE__MERGE:
			return getMerge();
		case SsaModelPackage.SSA_DOWHILE__LOOP_TYPE:
			return getLoopType();
		case SsaModelPackage.SSA_DOWHILE__COND_NODE:
			if (resolve)
				return getCondNode();
			return basicGetCondNode();
		case SsaModelPackage.SSA_DOWHILE__DOWHILE_TYPE:
			return getDowhileType();
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
		case SsaModelPackage.SSA_DOWHILE__BODY:
			setBody((SsaNode) newValue);
			return;
		case SsaModelPackage.SSA_DOWHILE__COND:
			setCond((SsaNode) newValue);
			return;
		case SsaModelPackage.SSA_DOWHILE__MERGE:
			setMerge((SsaNode) newValue);
			return;
		case SsaModelPackage.SSA_DOWHILE__LOOP_TYPE:
			setLoopType((LoopType) newValue);
			return;
		case SsaModelPackage.SSA_DOWHILE__COND_NODE:
			setCondNode((SsaNode) newValue);
			return;
		case SsaModelPackage.SSA_DOWHILE__DOWHILE_TYPE:
			setDowhileType((DowhileType) newValue);
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
		case SsaModelPackage.SSA_DOWHILE__BODY:
			setBody((SsaNode) null);
			return;
		case SsaModelPackage.SSA_DOWHILE__COND:
			setCond((SsaNode) null);
			return;
		case SsaModelPackage.SSA_DOWHILE__MERGE:
			setMerge((SsaNode) null);
			return;
		case SsaModelPackage.SSA_DOWHILE__LOOP_TYPE:
			setLoopType(LOOP_TYPE_EDEFAULT);
			return;
		case SsaModelPackage.SSA_DOWHILE__COND_NODE:
			setCondNode((SsaNode) null);
			return;
		case SsaModelPackage.SSA_DOWHILE__DOWHILE_TYPE:
			setDowhileType(DOWHILE_TYPE_EDEFAULT);
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
		case SsaModelPackage.SSA_DOWHILE__BODY:
			return body != null;
		case SsaModelPackage.SSA_DOWHILE__COND:
			return cond != null;
		case SsaModelPackage.SSA_DOWHILE__MERGE:
			return merge != null;
		case SsaModelPackage.SSA_DOWHILE__LOOP_TYPE:
			return loopType != LOOP_TYPE_EDEFAULT;
		case SsaModelPackage.SSA_DOWHILE__COND_NODE:
			return condNode != null;
		case SsaModelPackage.SSA_DOWHILE__DOWHILE_TYPE:
			return dowhileType != DOWHILE_TYPE_EDEFAULT;
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
		result.append(" (loopType: ");
		result.append(loopType);
		result.append(", dowhileType: ");
		result.append(dowhileType);
		result.append(')');
		return result.toString();
	}

} //SsaDowhileImpl
