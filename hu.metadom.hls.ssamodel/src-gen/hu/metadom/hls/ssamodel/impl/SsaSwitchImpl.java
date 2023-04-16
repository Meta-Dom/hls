/**
 */
package hu.metadom.hls.ssamodel.impl;

import hu.metadom.hls.ssamodel.SsaCase;
import hu.metadom.hls.ssamodel.SsaModelPackage;
import hu.metadom.hls.ssamodel.SsaNode;
import hu.metadom.hls.ssamodel.SsaSwitch;
import hu.metadom.hls.ssamodel.SwitchType;

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
 * An implementation of the model object '<em><b>Ssa Switch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.metadom.hls.ssamodel.impl.SsaSwitchImpl#getSelector <em>Selector</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.impl.SsaSwitchImpl#getCases <em>Cases</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.impl.SsaSwitchImpl#getMerge <em>Merge</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.impl.SsaSwitchImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.impl.SsaSwitchImpl#getSwitchType <em>Switch Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SsaSwitchImpl extends SsaNodeImpl implements SsaSwitch {
	/**
	 * The cached value of the '{@link #getSelector() <em>Selector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelector()
	 * @generated
	 * @ordered
	 */
	protected SsaNode selector;

	/**
	 * The cached value of the '{@link #getCases() <em>Cases</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCases()
	 * @generated
	 * @ordered
	 */
	protected EList<SsaCase> cases;

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
	 * The cached value of the '{@link #getDefault() <em>Default</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected SsaNode default_;

	/**
	 * The default value of the '{@link #getSwitchType() <em>Switch Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchType()
	 * @generated
	 * @ordered
	 */
	protected static final SwitchType SWITCH_TYPE_EDEFAULT = SwitchType.SWITCH;

	/**
	 * The cached value of the '{@link #getSwitchType() <em>Switch Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchType()
	 * @generated
	 * @ordered
	 */
	protected SwitchType switchType = SWITCH_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SsaSwitchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SsaModelPackage.Literals.SSA_SWITCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaNode getSelector() {
		if (selector != null && selector.eIsProxy()) {
			InternalEObject oldSelector = (InternalEObject) selector;
			selector = (SsaNode) eResolveProxy(oldSelector);
			if (selector != oldSelector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SsaModelPackage.SSA_SWITCH__SELECTOR,
							oldSelector, selector));
			}
		}
		return selector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaNode basicGetSelector() {
		return selector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelector(SsaNode newSelector) {
		SsaNode oldSelector = selector;
		selector = newSelector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SsaModelPackage.SSA_SWITCH__SELECTOR, oldSelector,
					selector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SsaCase> getCases() {
		if (cases == null) {
			cases = new EObjectContainmentEList<SsaCase>(SsaCase.class, this, SsaModelPackage.SSA_SWITCH__CASES);
		}
		return cases;
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
					SsaModelPackage.SSA_SWITCH__MERGE, oldMerge, newMerge);
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
						EOPPOSITE_FEATURE_BASE - SsaModelPackage.SSA_SWITCH__MERGE, null, msgs);
			if (newMerge != null)
				msgs = ((InternalEObject) newMerge).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SsaModelPackage.SSA_SWITCH__MERGE, null, msgs);
			msgs = basicSetMerge(newMerge, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SsaModelPackage.SSA_SWITCH__MERGE, newMerge,
					newMerge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaNode getDefault() {
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefault(SsaNode newDefault, NotificationChain msgs) {
		SsaNode oldDefault = default_;
		default_ = newDefault;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SsaModelPackage.SSA_SWITCH__DEFAULT, oldDefault, newDefault);
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
	public void setDefault(SsaNode newDefault) {
		if (newDefault != default_) {
			NotificationChain msgs = null;
			if (default_ != null)
				msgs = ((InternalEObject) default_).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SsaModelPackage.SSA_SWITCH__DEFAULT, null, msgs);
			if (newDefault != null)
				msgs = ((InternalEObject) newDefault).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SsaModelPackage.SSA_SWITCH__DEFAULT, null, msgs);
			msgs = basicSetDefault(newDefault, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SsaModelPackage.SSA_SWITCH__DEFAULT, newDefault,
					newDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchType getSwitchType() {
		return switchType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwitchType(SwitchType newSwitchType) {
		SwitchType oldSwitchType = switchType;
		switchType = newSwitchType == null ? SWITCH_TYPE_EDEFAULT : newSwitchType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SsaModelPackage.SSA_SWITCH__SWITCH_TYPE,
					oldSwitchType, switchType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SsaModelPackage.SSA_SWITCH__CASES:
			return ((InternalEList<?>) getCases()).basicRemove(otherEnd, msgs);
		case SsaModelPackage.SSA_SWITCH__MERGE:
			return basicSetMerge(null, msgs);
		case SsaModelPackage.SSA_SWITCH__DEFAULT:
			return basicSetDefault(null, msgs);
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
		case SsaModelPackage.SSA_SWITCH__SELECTOR:
			if (resolve)
				return getSelector();
			return basicGetSelector();
		case SsaModelPackage.SSA_SWITCH__CASES:
			return getCases();
		case SsaModelPackage.SSA_SWITCH__MERGE:
			return getMerge();
		case SsaModelPackage.SSA_SWITCH__DEFAULT:
			return getDefault();
		case SsaModelPackage.SSA_SWITCH__SWITCH_TYPE:
			return getSwitchType();
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
		case SsaModelPackage.SSA_SWITCH__SELECTOR:
			setSelector((SsaNode) newValue);
			return;
		case SsaModelPackage.SSA_SWITCH__CASES:
			getCases().clear();
			getCases().addAll((Collection<? extends SsaCase>) newValue);
			return;
		case SsaModelPackage.SSA_SWITCH__MERGE:
			setMerge((SsaNode) newValue);
			return;
		case SsaModelPackage.SSA_SWITCH__DEFAULT:
			setDefault((SsaNode) newValue);
			return;
		case SsaModelPackage.SSA_SWITCH__SWITCH_TYPE:
			setSwitchType((SwitchType) newValue);
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
		case SsaModelPackage.SSA_SWITCH__SELECTOR:
			setSelector((SsaNode) null);
			return;
		case SsaModelPackage.SSA_SWITCH__CASES:
			getCases().clear();
			return;
		case SsaModelPackage.SSA_SWITCH__MERGE:
			setMerge((SsaNode) null);
			return;
		case SsaModelPackage.SSA_SWITCH__DEFAULT:
			setDefault((SsaNode) null);
			return;
		case SsaModelPackage.SSA_SWITCH__SWITCH_TYPE:
			setSwitchType(SWITCH_TYPE_EDEFAULT);
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
		case SsaModelPackage.SSA_SWITCH__SELECTOR:
			return selector != null;
		case SsaModelPackage.SSA_SWITCH__CASES:
			return cases != null && !cases.isEmpty();
		case SsaModelPackage.SSA_SWITCH__MERGE:
			return merge != null;
		case SsaModelPackage.SSA_SWITCH__DEFAULT:
			return default_ != null;
		case SsaModelPackage.SSA_SWITCH__SWITCH_TYPE:
			return switchType != SWITCH_TYPE_EDEFAULT;
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
		result.append(" (switchType: ");
		result.append(switchType);
		result.append(')');
		return result.toString();
	}

} //SsaSwitchImpl
