/**
 */
package hu.metadom.hls.ssamodel.impl;

import hu.metadom.hls.ssamodel.SsaBlock;
import hu.metadom.hls.ssamodel.SsaModelPackage;
import hu.metadom.hls.ssamodel.SsaNode;
import hu.metadom.hls.ssamodel.SsaVar;
import hu.metadom.hls.ssamodel.Type;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ssa Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.metadom.hls.ssamodel.impl.SsaNodeImpl#getType <em>Type</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.impl.SsaNodeImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.impl.SsaNodeImpl#getVar <em>Var</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.impl.SsaNodeImpl#getSsaIndex <em>Ssa Index</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.impl.SsaNodeImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.impl.SsaNodeImpl#getGid <em>Gid</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SsaNodeImpl extends SsaObjectImpl implements SsaNode {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type;

	/**
	 * The cached value of the '{@link #getVar() <em>Var</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVar()
	 * @generated
	 * @ordered
	 */
	protected SsaVar var;

	/**
	 * The default value of the '{@link #getSsaIndex() <em>Ssa Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsaIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int SSA_INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSsaIndex() <em>Ssa Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsaIndex()
	 * @generated
	 * @ordered
	 */
	protected int ssaIndex = SSA_INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrigin() <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrigin() <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected String origin = ORIGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getGid() <em>Gid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGid()
	 * @generated
	 * @ordered
	 */
	protected static final int GID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGid() <em>Gid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGid()
	 * @generated
	 * @ordered
	 */
	protected int gid = GID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SsaNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SsaModelPackage.Literals.SSA_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject) type;
			type = (Type) eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SsaModelPackage.SSA_NODE__TYPE, oldType,
							type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		Type oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SsaModelPackage.SSA_NODE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaBlock getParent() {
		if (eContainerFeatureID() != SsaModelPackage.SSA_NODE__PARENT)
			return null;
		return (SsaBlock) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(SsaBlock newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newParent, SsaModelPackage.SSA_NODE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(SsaBlock newParent) {
		if (newParent != eInternalContainer()
				|| (eContainerFeatureID() != SsaModelPackage.SSA_NODE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject) newParent).eInverseAdd(this, SsaModelPackage.SSA_BLOCK__NODES, SsaBlock.class,
						msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SsaModelPackage.SSA_NODE__PARENT, newParent,
					newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaVar getVar() {
		if (var != null && var.eIsProxy()) {
			InternalEObject oldVar = (InternalEObject) var;
			var = (SsaVar) eResolveProxy(oldVar);
			if (var != oldVar) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SsaModelPackage.SSA_NODE__VAR, oldVar,
							var));
			}
		}
		return var;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaVar basicGetVar() {
		return var;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVar(SsaVar newVar) {
		SsaVar oldVar = var;
		var = newVar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SsaModelPackage.SSA_NODE__VAR, oldVar, var));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSsaIndex() {
		return ssaIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSsaIndex(int newSsaIndex) {
		int oldSsaIndex = ssaIndex;
		ssaIndex = newSsaIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SsaModelPackage.SSA_NODE__SSA_INDEX, oldSsaIndex,
					ssaIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrigin() {
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrigin(String newOrigin) {
		String oldOrigin = origin;
		origin = newOrigin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SsaModelPackage.SSA_NODE__ORIGIN, oldOrigin, origin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGid() {
		return gid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGid(int newGid) {
		int oldGid = gid;
		gid = newGid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SsaModelPackage.SSA_NODE__GID, oldGid, gid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SsaModelPackage.SSA_NODE__PARENT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetParent((SsaBlock) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SsaModelPackage.SSA_NODE__PARENT:
			return basicSetParent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case SsaModelPackage.SSA_NODE__PARENT:
			return eInternalContainer().eInverseRemove(this, SsaModelPackage.SSA_BLOCK__NODES, SsaBlock.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SsaModelPackage.SSA_NODE__TYPE:
			if (resolve)
				return getType();
			return basicGetType();
		case SsaModelPackage.SSA_NODE__PARENT:
			return getParent();
		case SsaModelPackage.SSA_NODE__VAR:
			if (resolve)
				return getVar();
			return basicGetVar();
		case SsaModelPackage.SSA_NODE__SSA_INDEX:
			return getSsaIndex();
		case SsaModelPackage.SSA_NODE__ORIGIN:
			return getOrigin();
		case SsaModelPackage.SSA_NODE__GID:
			return getGid();
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
		case SsaModelPackage.SSA_NODE__TYPE:
			setType((Type) newValue);
			return;
		case SsaModelPackage.SSA_NODE__PARENT:
			setParent((SsaBlock) newValue);
			return;
		case SsaModelPackage.SSA_NODE__VAR:
			setVar((SsaVar) newValue);
			return;
		case SsaModelPackage.SSA_NODE__SSA_INDEX:
			setSsaIndex((Integer) newValue);
			return;
		case SsaModelPackage.SSA_NODE__ORIGIN:
			setOrigin((String) newValue);
			return;
		case SsaModelPackage.SSA_NODE__GID:
			setGid((Integer) newValue);
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
		case SsaModelPackage.SSA_NODE__TYPE:
			setType((Type) null);
			return;
		case SsaModelPackage.SSA_NODE__PARENT:
			setParent((SsaBlock) null);
			return;
		case SsaModelPackage.SSA_NODE__VAR:
			setVar((SsaVar) null);
			return;
		case SsaModelPackage.SSA_NODE__SSA_INDEX:
			setSsaIndex(SSA_INDEX_EDEFAULT);
			return;
		case SsaModelPackage.SSA_NODE__ORIGIN:
			setOrigin(ORIGIN_EDEFAULT);
			return;
		case SsaModelPackage.SSA_NODE__GID:
			setGid(GID_EDEFAULT);
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
		case SsaModelPackage.SSA_NODE__TYPE:
			return type != null;
		case SsaModelPackage.SSA_NODE__PARENT:
			return getParent() != null;
		case SsaModelPackage.SSA_NODE__VAR:
			return var != null;
		case SsaModelPackage.SSA_NODE__SSA_INDEX:
			return ssaIndex != SSA_INDEX_EDEFAULT;
		case SsaModelPackage.SSA_NODE__ORIGIN:
			return ORIGIN_EDEFAULT == null ? origin != null : !ORIGIN_EDEFAULT.equals(origin);
		case SsaModelPackage.SSA_NODE__GID:
			return gid != GID_EDEFAULT;
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
		result.append(" (ssaIndex: ");
		result.append(ssaIndex);
		result.append(", origin: ");
		result.append(origin);
		result.append(", gid: ");
		result.append(gid);
		result.append(')');
		return result.toString();
	}

} //SsaNodeImpl
