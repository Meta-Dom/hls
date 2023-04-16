/**
 */
package hu.metadom.hls.ssamodel.impl;

import hu.metadom.hls.ssamodel.ContainerType;
import hu.metadom.hls.ssamodel.SsaBlock;
import hu.metadom.hls.ssamodel.SsaFunction;
import hu.metadom.hls.ssamodel.SsaModelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.metadom.hls.ssamodel.impl.ContainerImpl#getChildContainers <em>Child Containers</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.impl.ContainerImpl#getName <em>Name</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.impl.ContainerImpl#getFunctions <em>Functions</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.impl.ContainerImpl#getType <em>Type</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.impl.ContainerImpl#getGlobalBlock <em>Global Block</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerImpl extends MinimalEObjectImpl.Container implements hu.metadom.hls.ssamodel.Container {
	/**
	 * The cached value of the '{@link #getChildContainers() <em>Child Containers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildContainers()
	 * @generated
	 * @ordered
	 */
	protected EList<hu.metadom.hls.ssamodel.Container> childContainers;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFunctions() <em>Functions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<SsaFunction> functions;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ContainerType TYPE_EDEFAULT = ContainerType.CUSTOM;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ContainerType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGlobalBlock() <em>Global Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalBlock()
	 * @generated
	 * @ordered
	 */
	protected SsaBlock globalBlock;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SsaModelPackage.Literals.CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<hu.metadom.hls.ssamodel.Container> getChildContainers() {
		if (childContainers == null) {
			childContainers = new EObjectContainmentEList<hu.metadom.hls.ssamodel.Container>(
					hu.metadom.hls.ssamodel.Container.class, this, SsaModelPackage.CONTAINER__CHILD_CONTAINERS);
		}
		return childContainers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SsaModelPackage.CONTAINER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SsaFunction> getFunctions() {
		if (functions == null) {
			functions = new EObjectContainmentEList<SsaFunction>(SsaFunction.class, this,
					SsaModelPackage.CONTAINER__FUNCTIONS);
		}
		return functions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ContainerType newType) {
		ContainerType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SsaModelPackage.CONTAINER__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaBlock getGlobalBlock() {
		return globalBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlobalBlock(SsaBlock newGlobalBlock, NotificationChain msgs) {
		SsaBlock oldGlobalBlock = globalBlock;
		globalBlock = newGlobalBlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SsaModelPackage.CONTAINER__GLOBAL_BLOCK, oldGlobalBlock, newGlobalBlock);
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
	public void setGlobalBlock(SsaBlock newGlobalBlock) {
		if (newGlobalBlock != globalBlock) {
			NotificationChain msgs = null;
			if (globalBlock != null)
				msgs = ((InternalEObject) globalBlock).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SsaModelPackage.CONTAINER__GLOBAL_BLOCK, null, msgs);
			if (newGlobalBlock != null)
				msgs = ((InternalEObject) newGlobalBlock).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SsaModelPackage.CONTAINER__GLOBAL_BLOCK, null, msgs);
			msgs = basicSetGlobalBlock(newGlobalBlock, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SsaModelPackage.CONTAINER__GLOBAL_BLOCK,
					newGlobalBlock, newGlobalBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SsaModelPackage.CONTAINER__CHILD_CONTAINERS:
			return ((InternalEList<?>) getChildContainers()).basicRemove(otherEnd, msgs);
		case SsaModelPackage.CONTAINER__FUNCTIONS:
			return ((InternalEList<?>) getFunctions()).basicRemove(otherEnd, msgs);
		case SsaModelPackage.CONTAINER__GLOBAL_BLOCK:
			return basicSetGlobalBlock(null, msgs);
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
		case SsaModelPackage.CONTAINER__CHILD_CONTAINERS:
			return getChildContainers();
		case SsaModelPackage.CONTAINER__NAME:
			return getName();
		case SsaModelPackage.CONTAINER__FUNCTIONS:
			return getFunctions();
		case SsaModelPackage.CONTAINER__TYPE:
			return getType();
		case SsaModelPackage.CONTAINER__GLOBAL_BLOCK:
			return getGlobalBlock();
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
		case SsaModelPackage.CONTAINER__CHILD_CONTAINERS:
			getChildContainers().clear();
			getChildContainers().addAll((Collection<? extends hu.metadom.hls.ssamodel.Container>) newValue);
			return;
		case SsaModelPackage.CONTAINER__NAME:
			setName((String) newValue);
			return;
		case SsaModelPackage.CONTAINER__FUNCTIONS:
			getFunctions().clear();
			getFunctions().addAll((Collection<? extends SsaFunction>) newValue);
			return;
		case SsaModelPackage.CONTAINER__TYPE:
			setType((ContainerType) newValue);
			return;
		case SsaModelPackage.CONTAINER__GLOBAL_BLOCK:
			setGlobalBlock((SsaBlock) newValue);
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
		case SsaModelPackage.CONTAINER__CHILD_CONTAINERS:
			getChildContainers().clear();
			return;
		case SsaModelPackage.CONTAINER__NAME:
			setName(NAME_EDEFAULT);
			return;
		case SsaModelPackage.CONTAINER__FUNCTIONS:
			getFunctions().clear();
			return;
		case SsaModelPackage.CONTAINER__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case SsaModelPackage.CONTAINER__GLOBAL_BLOCK:
			setGlobalBlock((SsaBlock) null);
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
		case SsaModelPackage.CONTAINER__CHILD_CONTAINERS:
			return childContainers != null && !childContainers.isEmpty();
		case SsaModelPackage.CONTAINER__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case SsaModelPackage.CONTAINER__FUNCTIONS:
			return functions != null && !functions.isEmpty();
		case SsaModelPackage.CONTAINER__TYPE:
			return type != TYPE_EDEFAULT;
		case SsaModelPackage.CONTAINER__GLOBAL_BLOCK:
			return globalBlock != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //ContainerImpl
