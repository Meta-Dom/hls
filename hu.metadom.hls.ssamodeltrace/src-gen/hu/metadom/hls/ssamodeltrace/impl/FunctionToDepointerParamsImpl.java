/**
 */
package hu.metadom.hls.ssamodeltrace.impl;

import hu.metadom.hls.ssamodel.SsaFunction;

import hu.metadom.hls.ssamodeltrace.FunctionToDepointerParams;
import hu.metadom.hls.ssamodeltrace.PointerParameter;
import hu.metadom.hls.ssamodeltrace.SsaModelTracePackage;

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
 * An implementation of the model object '<em><b>Function To Depointer Params</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.metadom.hls.ssamodeltrace.impl.FunctionToDepointerParamsImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodeltrace.impl.FunctionToDepointerParamsImpl#getPointerParameter <em>Pointer Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionToDepointerParamsImpl extends MinimalEObjectImpl.Container implements FunctionToDepointerParams {
	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected SsaFunction function;

	/**
	 * The cached value of the '{@link #getPointerParameter() <em>Pointer Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointerParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<PointerParameter> pointerParameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionToDepointerParamsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SsaModelTracePackage.Literals.FUNCTION_TO_DEPOINTER_PARAMS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaFunction getFunction() {
		if (function != null && function.eIsProxy()) {
			InternalEObject oldFunction = (InternalEObject)function;
			function = (SsaFunction)eResolveProxy(oldFunction);
			if (function != oldFunction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SsaModelTracePackage.FUNCTION_TO_DEPOINTER_PARAMS__FUNCTION, oldFunction, function));
			}
		}
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaFunction basicGetFunction() {
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunction(SsaFunction newFunction) {
		SsaFunction oldFunction = function;
		function = newFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SsaModelTracePackage.FUNCTION_TO_DEPOINTER_PARAMS__FUNCTION, oldFunction, function));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PointerParameter> getPointerParameter() {
		if (pointerParameter == null) {
			pointerParameter = new EObjectContainmentEList<PointerParameter>(PointerParameter.class, this, SsaModelTracePackage.FUNCTION_TO_DEPOINTER_PARAMS__POINTER_PARAMETER);
		}
		return pointerParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SsaModelTracePackage.FUNCTION_TO_DEPOINTER_PARAMS__POINTER_PARAMETER:
				return ((InternalEList<?>)getPointerParameter()).basicRemove(otherEnd, msgs);
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
			case SsaModelTracePackage.FUNCTION_TO_DEPOINTER_PARAMS__FUNCTION:
				if (resolve) return getFunction();
				return basicGetFunction();
			case SsaModelTracePackage.FUNCTION_TO_DEPOINTER_PARAMS__POINTER_PARAMETER:
				return getPointerParameter();
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
			case SsaModelTracePackage.FUNCTION_TO_DEPOINTER_PARAMS__FUNCTION:
				setFunction((SsaFunction)newValue);
				return;
			case SsaModelTracePackage.FUNCTION_TO_DEPOINTER_PARAMS__POINTER_PARAMETER:
				getPointerParameter().clear();
				getPointerParameter().addAll((Collection<? extends PointerParameter>)newValue);
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
			case SsaModelTracePackage.FUNCTION_TO_DEPOINTER_PARAMS__FUNCTION:
				setFunction((SsaFunction)null);
				return;
			case SsaModelTracePackage.FUNCTION_TO_DEPOINTER_PARAMS__POINTER_PARAMETER:
				getPointerParameter().clear();
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
			case SsaModelTracePackage.FUNCTION_TO_DEPOINTER_PARAMS__FUNCTION:
				return function != null;
			case SsaModelTracePackage.FUNCTION_TO_DEPOINTER_PARAMS__POINTER_PARAMETER:
				return pointerParameter != null && !pointerParameter.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FunctionToDepointerParamsImpl
