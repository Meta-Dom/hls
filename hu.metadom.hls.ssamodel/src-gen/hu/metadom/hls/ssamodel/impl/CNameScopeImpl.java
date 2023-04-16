/**
 */
package hu.metadom.hls.ssamodel.impl;

import hu.metadom.hls.ssamodel.CNameScope;
import hu.metadom.hls.ssamodel.SsaConst;
import hu.metadom.hls.ssamodel.SsaModelPackage;
import hu.metadom.hls.ssamodel.SsaVar;
import hu.metadom.hls.ssamodel.Type;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CName Scope</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.metadom.hls.ssamodel.impl.CNameScopeImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.impl.CNameScopeImpl#getNames <em>Names</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.impl.CNameScopeImpl#getVars <em>Vars</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.impl.CNameScopeImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.impl.CNameScopeImpl#getConstants <em>Constants</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CNameScopeImpl extends MinimalEObjectImpl.Container implements CNameScope {
	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected CNameScope parent;

	/**
	 * The cached value of the '{@link #getNames() <em>Names</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNames()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, SsaVar> names;

	/**
	 * The cached value of the '{@link #getVars() <em>Vars</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVars()
	 * @generated
	 * @ordered
	 */
	protected EList<SsaVar> vars;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> types;

	/**
	 * The cached value of the '{@link #getConstants() <em>Constants</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstants()
	 * @generated
	 * @ordered
	 */
	protected EList<SsaConst> constants;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CNameScopeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SsaModelPackage.Literals.CNAME_SCOPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CNameScope getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject) parent;
			parent = (CNameScope) eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SsaModelPackage.CNAME_SCOPE__PARENT,
							oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CNameScope basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(CNameScope newParent) {
		CNameScope oldParent = parent;
		parent = newParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SsaModelPackage.CNAME_SCOPE__PARENT, oldParent,
					parent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, SsaVar> getNames() {
		if (names == null) {
			names = new EcoreEMap<String, SsaVar>(SsaModelPackage.Literals.STRING_TO_CNAME_MAP,
					StringToCNameMapImpl.class, this, SsaModelPackage.CNAME_SCOPE__NAMES);
		}
		return names;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SsaVar> getVars() {
		if (vars == null) {
			vars = new EObjectContainmentEList<SsaVar>(SsaVar.class, this, SsaModelPackage.CNAME_SCOPE__VARS);
		}
		return vars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getTypes() {
		if (types == null) {
			types = new EObjectContainmentEList<Type>(Type.class, this, SsaModelPackage.CNAME_SCOPE__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SsaConst> getConstants() {
		if (constants == null) {
			constants = new EObjectContainmentEList<SsaConst>(SsaConst.class, this,
					SsaModelPackage.CNAME_SCOPE__CONSTANTS);
		}
		return constants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SsaModelPackage.CNAME_SCOPE__NAMES:
			return ((InternalEList<?>) getNames()).basicRemove(otherEnd, msgs);
		case SsaModelPackage.CNAME_SCOPE__VARS:
			return ((InternalEList<?>) getVars()).basicRemove(otherEnd, msgs);
		case SsaModelPackage.CNAME_SCOPE__TYPES:
			return ((InternalEList<?>) getTypes()).basicRemove(otherEnd, msgs);
		case SsaModelPackage.CNAME_SCOPE__CONSTANTS:
			return ((InternalEList<?>) getConstants()).basicRemove(otherEnd, msgs);
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
		case SsaModelPackage.CNAME_SCOPE__PARENT:
			if (resolve)
				return getParent();
			return basicGetParent();
		case SsaModelPackage.CNAME_SCOPE__NAMES:
			if (coreType)
				return getNames();
			else
				return getNames().map();
		case SsaModelPackage.CNAME_SCOPE__VARS:
			return getVars();
		case SsaModelPackage.CNAME_SCOPE__TYPES:
			return getTypes();
		case SsaModelPackage.CNAME_SCOPE__CONSTANTS:
			return getConstants();
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
		case SsaModelPackage.CNAME_SCOPE__PARENT:
			setParent((CNameScope) newValue);
			return;
		case SsaModelPackage.CNAME_SCOPE__NAMES:
			((EStructuralFeature.Setting) getNames()).set(newValue);
			return;
		case SsaModelPackage.CNAME_SCOPE__VARS:
			getVars().clear();
			getVars().addAll((Collection<? extends SsaVar>) newValue);
			return;
		case SsaModelPackage.CNAME_SCOPE__TYPES:
			getTypes().clear();
			getTypes().addAll((Collection<? extends Type>) newValue);
			return;
		case SsaModelPackage.CNAME_SCOPE__CONSTANTS:
			getConstants().clear();
			getConstants().addAll((Collection<? extends SsaConst>) newValue);
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
		case SsaModelPackage.CNAME_SCOPE__PARENT:
			setParent((CNameScope) null);
			return;
		case SsaModelPackage.CNAME_SCOPE__NAMES:
			getNames().clear();
			return;
		case SsaModelPackage.CNAME_SCOPE__VARS:
			getVars().clear();
			return;
		case SsaModelPackage.CNAME_SCOPE__TYPES:
			getTypes().clear();
			return;
		case SsaModelPackage.CNAME_SCOPE__CONSTANTS:
			getConstants().clear();
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
		case SsaModelPackage.CNAME_SCOPE__PARENT:
			return parent != null;
		case SsaModelPackage.CNAME_SCOPE__NAMES:
			return names != null && !names.isEmpty();
		case SsaModelPackage.CNAME_SCOPE__VARS:
			return vars != null && !vars.isEmpty();
		case SsaModelPackage.CNAME_SCOPE__TYPES:
			return types != null && !types.isEmpty();
		case SsaModelPackage.CNAME_SCOPE__CONSTANTS:
			return constants != null && !constants.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CNameScopeImpl
