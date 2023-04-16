/**
 */
package hu.metadom.hls.ssamodeltrace.impl;

import hu.metadom.hls.ssamodel.SsaCall;

import hu.metadom.hls.ssamodeltrace.FunctionCall;
import hu.metadom.hls.ssamodeltrace.FunctionToLocalizeVariables;
import hu.metadom.hls.ssamodeltrace.SsaModelTracePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.metadom.hls.ssamodeltrace.impl.FunctionCallImpl#getSsaCall <em>Ssa Call</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodeltrace.impl.FunctionCallImpl#getFunctionTrace <em>Function Trace</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionCallImpl extends MinimalEObjectImpl.Container implements FunctionCall {
	/**
	 * The cached value of the '{@link #getSsaCall() <em>Ssa Call</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsaCall()
	 * @generated
	 * @ordered
	 */
	protected SsaCall ssaCall;

	/**
	 * The cached value of the '{@link #getFunctionTrace() <em>Function Trace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionTrace()
	 * @generated
	 * @ordered
	 */
	protected FunctionToLocalizeVariables functionTrace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SsaModelTracePackage.Literals.FUNCTION_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaCall getSsaCall() {
		if (ssaCall != null && ssaCall.eIsProxy()) {
			InternalEObject oldSsaCall = (InternalEObject)ssaCall;
			ssaCall = (SsaCall)eResolveProxy(oldSsaCall);
			if (ssaCall != oldSsaCall) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SsaModelTracePackage.FUNCTION_CALL__SSA_CALL, oldSsaCall, ssaCall));
			}
		}
		return ssaCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaCall basicGetSsaCall() {
		return ssaCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSsaCall(SsaCall newSsaCall) {
		SsaCall oldSsaCall = ssaCall;
		ssaCall = newSsaCall;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SsaModelTracePackage.FUNCTION_CALL__SSA_CALL, oldSsaCall, ssaCall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionToLocalizeVariables getFunctionTrace() {
		if (functionTrace != null && functionTrace.eIsProxy()) {
			InternalEObject oldFunctionTrace = (InternalEObject)functionTrace;
			functionTrace = (FunctionToLocalizeVariables)eResolveProxy(oldFunctionTrace);
			if (functionTrace != oldFunctionTrace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SsaModelTracePackage.FUNCTION_CALL__FUNCTION_TRACE, oldFunctionTrace, functionTrace));
			}
		}
		return functionTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionToLocalizeVariables basicGetFunctionTrace() {
		return functionTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctionTrace(FunctionToLocalizeVariables newFunctionTrace) {
		FunctionToLocalizeVariables oldFunctionTrace = functionTrace;
		functionTrace = newFunctionTrace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SsaModelTracePackage.FUNCTION_CALL__FUNCTION_TRACE, oldFunctionTrace, functionTrace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SsaModelTracePackage.FUNCTION_CALL__SSA_CALL:
				if (resolve) return getSsaCall();
				return basicGetSsaCall();
			case SsaModelTracePackage.FUNCTION_CALL__FUNCTION_TRACE:
				if (resolve) return getFunctionTrace();
				return basicGetFunctionTrace();
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
			case SsaModelTracePackage.FUNCTION_CALL__SSA_CALL:
				setSsaCall((SsaCall)newValue);
				return;
			case SsaModelTracePackage.FUNCTION_CALL__FUNCTION_TRACE:
				setFunctionTrace((FunctionToLocalizeVariables)newValue);
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
			case SsaModelTracePackage.FUNCTION_CALL__SSA_CALL:
				setSsaCall((SsaCall)null);
				return;
			case SsaModelTracePackage.FUNCTION_CALL__FUNCTION_TRACE:
				setFunctionTrace((FunctionToLocalizeVariables)null);
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
			case SsaModelTracePackage.FUNCTION_CALL__SSA_CALL:
				return ssaCall != null;
			case SsaModelTracePackage.FUNCTION_CALL__FUNCTION_TRACE:
				return functionTrace != null;
		}
		return super.eIsSet(featureID);
	}

} //FunctionCallImpl
