/**
 */
package hu.metadom.hls.ssamodeltrace.impl;

import hu.metadom.hls.ssamodeltrace.FunctionToDepointerParams;
import hu.metadom.hls.ssamodeltrace.FunctionToLocalizeVariables;
import hu.metadom.hls.ssamodeltrace.SsaModelTracePackage;
import hu.metadom.hls.ssamodeltrace.Trace;

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
 * An implementation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.metadom.hls.ssamodeltrace.impl.TraceImpl#getFunctions <em>Functions</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodeltrace.impl.TraceImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodeltrace.impl.TraceImpl#getPointers <em>Pointers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TraceImpl extends MinimalEObjectImpl.Container implements Trace {
	/**
	 * The cached value of the '{@link #getFunctions() <em>Functions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionToLocalizeVariables> functions;

	/**
	 * The cached value of the '{@link #getContainer() <em>Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer()
	 * @generated
	 * @ordered
	 */
	protected hu.metadom.hls.ssamodel.Container container;

	/**
	 * The cached value of the '{@link #getPointers() <em>Pointers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointers()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionToDepointerParams> pointers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SsaModelTracePackage.Literals.TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionToLocalizeVariables> getFunctions() {
		if (functions == null) {
			functions = new EObjectContainmentEList<FunctionToLocalizeVariables>(FunctionToLocalizeVariables.class, this, SsaModelTracePackage.TRACE__FUNCTIONS);
		}
		return functions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public hu.metadom.hls.ssamodel.Container getContainer() {
		if (container != null && container.eIsProxy()) {
			InternalEObject oldContainer = (InternalEObject)container;
			container = (hu.metadom.hls.ssamodel.Container)eResolveProxy(oldContainer);
			if (container != oldContainer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SsaModelTracePackage.TRACE__CONTAINER, oldContainer, container));
			}
		}
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public hu.metadom.hls.ssamodel.Container basicGetContainer() {
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(hu.metadom.hls.ssamodel.Container newContainer) {
		hu.metadom.hls.ssamodel.Container oldContainer = container;
		container = newContainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SsaModelTracePackage.TRACE__CONTAINER, oldContainer, container));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionToDepointerParams> getPointers() {
		if (pointers == null) {
			pointers = new EObjectContainmentEList<FunctionToDepointerParams>(FunctionToDepointerParams.class, this, SsaModelTracePackage.TRACE__POINTERS);
		}
		return pointers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SsaModelTracePackage.TRACE__FUNCTIONS:
				return ((InternalEList<?>)getFunctions()).basicRemove(otherEnd, msgs);
			case SsaModelTracePackage.TRACE__POINTERS:
				return ((InternalEList<?>)getPointers()).basicRemove(otherEnd, msgs);
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
			case SsaModelTracePackage.TRACE__FUNCTIONS:
				return getFunctions();
			case SsaModelTracePackage.TRACE__CONTAINER:
				if (resolve) return getContainer();
				return basicGetContainer();
			case SsaModelTracePackage.TRACE__POINTERS:
				return getPointers();
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
			case SsaModelTracePackage.TRACE__FUNCTIONS:
				getFunctions().clear();
				getFunctions().addAll((Collection<? extends FunctionToLocalizeVariables>)newValue);
				return;
			case SsaModelTracePackage.TRACE__CONTAINER:
				setContainer((hu.metadom.hls.ssamodel.Container)newValue);
				return;
			case SsaModelTracePackage.TRACE__POINTERS:
				getPointers().clear();
				getPointers().addAll((Collection<? extends FunctionToDepointerParams>)newValue);
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
			case SsaModelTracePackage.TRACE__FUNCTIONS:
				getFunctions().clear();
				return;
			case SsaModelTracePackage.TRACE__CONTAINER:
				setContainer((hu.metadom.hls.ssamodel.Container)null);
				return;
			case SsaModelTracePackage.TRACE__POINTERS:
				getPointers().clear();
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
			case SsaModelTracePackage.TRACE__FUNCTIONS:
				return functions != null && !functions.isEmpty();
			case SsaModelTracePackage.TRACE__CONTAINER:
				return container != null;
			case SsaModelTracePackage.TRACE__POINTERS:
				return pointers != null && !pointers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TraceImpl
