/**
 */
package hu.metadom.hls.ssamodeltrace.impl;

import hu.metadom.hls.ssamodel.SsaFunction;
import hu.metadom.hls.ssamodel.SsaVar;

import hu.metadom.hls.ssamodeltrace.FunctionCall;
import hu.metadom.hls.ssamodeltrace.FunctionToLocalizeVariables;
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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function To Localize Variables</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.metadom.hls.ssamodeltrace.impl.FunctionToLocalizeVariablesImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodeltrace.impl.FunctionToLocalizeVariablesImpl#getVars <em>Vars</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodeltrace.impl.FunctionToLocalizeVariablesImpl#getFuncCalls <em>Func Calls</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionToLocalizeVariablesImpl extends MinimalEObjectImpl.Container implements FunctionToLocalizeVariables {
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
	 * The cached value of the '{@link #getVars() <em>Vars</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVars()
	 * @generated
	 * @ordered
	 */
	protected EList<SsaVar> vars;

	/**
	 * The cached value of the '{@link #getFuncCalls() <em>Func Calls</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuncCalls()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionCall> funcCalls;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionToLocalizeVariablesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SsaModelTracePackage.Literals.FUNCTION_TO_LOCALIZE_VARIABLES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SsaFunction getFunction() {
		if (function != null && function.eIsProxy()) {
			InternalEObject oldFunction = (InternalEObject)function;
			function = (SsaFunction)eResolveProxy(oldFunction);
			if (function != oldFunction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SsaModelTracePackage.FUNCTION_TO_LOCALIZE_VARIABLES__FUNCTION, oldFunction, function));
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
	@Override
	public void setFunction(SsaFunction newFunction) {
		SsaFunction oldFunction = function;
		function = newFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SsaModelTracePackage.FUNCTION_TO_LOCALIZE_VARIABLES__FUNCTION, oldFunction, function));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SsaVar> getVars() {
		if (vars == null) {
			vars = new EObjectResolvingEList<SsaVar>(SsaVar.class, this, SsaModelTracePackage.FUNCTION_TO_LOCALIZE_VARIABLES__VARS);
		}
		return vars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FunctionCall> getFuncCalls() {
		if (funcCalls == null) {
			funcCalls = new EObjectContainmentEList<FunctionCall>(FunctionCall.class, this, SsaModelTracePackage.FUNCTION_TO_LOCALIZE_VARIABLES__FUNC_CALLS);
		}
		return funcCalls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SsaModelTracePackage.FUNCTION_TO_LOCALIZE_VARIABLES__FUNC_CALLS:
				return ((InternalEList<?>)getFuncCalls()).basicRemove(otherEnd, msgs);
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
			case SsaModelTracePackage.FUNCTION_TO_LOCALIZE_VARIABLES__FUNCTION:
				if (resolve) return getFunction();
				return basicGetFunction();
			case SsaModelTracePackage.FUNCTION_TO_LOCALIZE_VARIABLES__VARS:
				return getVars();
			case SsaModelTracePackage.FUNCTION_TO_LOCALIZE_VARIABLES__FUNC_CALLS:
				return getFuncCalls();
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
			case SsaModelTracePackage.FUNCTION_TO_LOCALIZE_VARIABLES__FUNCTION:
				setFunction((SsaFunction)newValue);
				return;
			case SsaModelTracePackage.FUNCTION_TO_LOCALIZE_VARIABLES__VARS:
				getVars().clear();
				getVars().addAll((Collection<? extends SsaVar>)newValue);
				return;
			case SsaModelTracePackage.FUNCTION_TO_LOCALIZE_VARIABLES__FUNC_CALLS:
				getFuncCalls().clear();
				getFuncCalls().addAll((Collection<? extends FunctionCall>)newValue);
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
			case SsaModelTracePackage.FUNCTION_TO_LOCALIZE_VARIABLES__FUNCTION:
				setFunction((SsaFunction)null);
				return;
			case SsaModelTracePackage.FUNCTION_TO_LOCALIZE_VARIABLES__VARS:
				getVars().clear();
				return;
			case SsaModelTracePackage.FUNCTION_TO_LOCALIZE_VARIABLES__FUNC_CALLS:
				getFuncCalls().clear();
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
			case SsaModelTracePackage.FUNCTION_TO_LOCALIZE_VARIABLES__FUNCTION:
				return function != null;
			case SsaModelTracePackage.FUNCTION_TO_LOCALIZE_VARIABLES__VARS:
				return vars != null && !vars.isEmpty();
			case SsaModelTracePackage.FUNCTION_TO_LOCALIZE_VARIABLES__FUNC_CALLS:
				return funcCalls != null && !funcCalls.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FunctionToLocalizeVariablesImpl
