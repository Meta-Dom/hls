/**
 */
package hu.metadom.hls.ssamodeltrace.impl;

import hu.metadom.hls.ssamodel.SsaIndirectRead;
import hu.metadom.hls.ssamodel.SsaIndirectWrite;
import hu.metadom.hls.ssamodel.SsaParam;

import hu.metadom.hls.ssamodeltrace.PointerParameter;
import hu.metadom.hls.ssamodeltrace.SsaModelTracePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pointer Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.metadom.hls.ssamodeltrace.impl.PointerParameterImpl#getPointerParam <em>Pointer Param</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodeltrace.impl.PointerParameterImpl#getIndirectReadList <em>Indirect Read List</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodeltrace.impl.PointerParameterImpl#getIndirectWriteList <em>Indirect Write List</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodeltrace.impl.PointerParameterImpl#isIsInput <em>Is Input</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodeltrace.impl.PointerParameterImpl#isIsOutput <em>Is Output</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PointerParameterImpl extends MinimalEObjectImpl.Container implements PointerParameter {
	/**
	 * The cached value of the '{@link #getPointerParam() <em>Pointer Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointerParam()
	 * @generated
	 * @ordered
	 */
	protected SsaParam pointerParam;

	/**
	 * The cached value of the '{@link #getIndirectReadList() <em>Indirect Read List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndirectReadList()
	 * @generated
	 * @ordered
	 */
	protected EList<SsaIndirectRead> indirectReadList;

	/**
	 * The cached value of the '{@link #getIndirectWriteList() <em>Indirect Write List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndirectWriteList()
	 * @generated
	 * @ordered
	 */
	protected EList<SsaIndirectWrite> indirectWriteList;

	/**
	 * The default value of the '{@link #isIsInput() <em>Is Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInput()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_INPUT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsInput() <em>Is Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInput()
	 * @generated
	 * @ordered
	 */
	protected boolean isInput = IS_INPUT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsOutput() <em>Is Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOutput()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_OUTPUT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsOutput() <em>Is Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOutput()
	 * @generated
	 * @ordered
	 */
	protected boolean isOutput = IS_OUTPUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PointerParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SsaModelTracePackage.Literals.POINTER_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaParam getPointerParam() {
		if (pointerParam != null && pointerParam.eIsProxy()) {
			InternalEObject oldPointerParam = (InternalEObject)pointerParam;
			pointerParam = (SsaParam)eResolveProxy(oldPointerParam);
			if (pointerParam != oldPointerParam) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SsaModelTracePackage.POINTER_PARAMETER__POINTER_PARAM, oldPointerParam, pointerParam));
			}
		}
		return pointerParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaParam basicGetPointerParam() {
		return pointerParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointerParam(SsaParam newPointerParam) {
		SsaParam oldPointerParam = pointerParam;
		pointerParam = newPointerParam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SsaModelTracePackage.POINTER_PARAMETER__POINTER_PARAM, oldPointerParam, pointerParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SsaIndirectRead> getIndirectReadList() {
		if (indirectReadList == null) {
			indirectReadList = new EObjectResolvingEList<SsaIndirectRead>(SsaIndirectRead.class, this, SsaModelTracePackage.POINTER_PARAMETER__INDIRECT_READ_LIST);
		}
		return indirectReadList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SsaIndirectWrite> getIndirectWriteList() {
		if (indirectWriteList == null) {
			indirectWriteList = new EObjectResolvingEList<SsaIndirectWrite>(SsaIndirectWrite.class, this, SsaModelTracePackage.POINTER_PARAMETER__INDIRECT_WRITE_LIST);
		}
		return indirectWriteList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsInput() {
		return isInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsInput(boolean newIsInput) {
		boolean oldIsInput = isInput;
		isInput = newIsInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SsaModelTracePackage.POINTER_PARAMETER__IS_INPUT, oldIsInput, isInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsOutput() {
		return isOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOutput(boolean newIsOutput) {
		boolean oldIsOutput = isOutput;
		isOutput = newIsOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SsaModelTracePackage.POINTER_PARAMETER__IS_OUTPUT, oldIsOutput, isOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SsaModelTracePackage.POINTER_PARAMETER__POINTER_PARAM:
				if (resolve) return getPointerParam();
				return basicGetPointerParam();
			case SsaModelTracePackage.POINTER_PARAMETER__INDIRECT_READ_LIST:
				return getIndirectReadList();
			case SsaModelTracePackage.POINTER_PARAMETER__INDIRECT_WRITE_LIST:
				return getIndirectWriteList();
			case SsaModelTracePackage.POINTER_PARAMETER__IS_INPUT:
				return isIsInput();
			case SsaModelTracePackage.POINTER_PARAMETER__IS_OUTPUT:
				return isIsOutput();
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
			case SsaModelTracePackage.POINTER_PARAMETER__POINTER_PARAM:
				setPointerParam((SsaParam)newValue);
				return;
			case SsaModelTracePackage.POINTER_PARAMETER__INDIRECT_READ_LIST:
				getIndirectReadList().clear();
				getIndirectReadList().addAll((Collection<? extends SsaIndirectRead>)newValue);
				return;
			case SsaModelTracePackage.POINTER_PARAMETER__INDIRECT_WRITE_LIST:
				getIndirectWriteList().clear();
				getIndirectWriteList().addAll((Collection<? extends SsaIndirectWrite>)newValue);
				return;
			case SsaModelTracePackage.POINTER_PARAMETER__IS_INPUT:
				setIsInput((Boolean)newValue);
				return;
			case SsaModelTracePackage.POINTER_PARAMETER__IS_OUTPUT:
				setIsOutput((Boolean)newValue);
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
			case SsaModelTracePackage.POINTER_PARAMETER__POINTER_PARAM:
				setPointerParam((SsaParam)null);
				return;
			case SsaModelTracePackage.POINTER_PARAMETER__INDIRECT_READ_LIST:
				getIndirectReadList().clear();
				return;
			case SsaModelTracePackage.POINTER_PARAMETER__INDIRECT_WRITE_LIST:
				getIndirectWriteList().clear();
				return;
			case SsaModelTracePackage.POINTER_PARAMETER__IS_INPUT:
				setIsInput(IS_INPUT_EDEFAULT);
				return;
			case SsaModelTracePackage.POINTER_PARAMETER__IS_OUTPUT:
				setIsOutput(IS_OUTPUT_EDEFAULT);
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
			case SsaModelTracePackage.POINTER_PARAMETER__POINTER_PARAM:
				return pointerParam != null;
			case SsaModelTracePackage.POINTER_PARAMETER__INDIRECT_READ_LIST:
				return indirectReadList != null && !indirectReadList.isEmpty();
			case SsaModelTracePackage.POINTER_PARAMETER__INDIRECT_WRITE_LIST:
				return indirectWriteList != null && !indirectWriteList.isEmpty();
			case SsaModelTracePackage.POINTER_PARAMETER__IS_INPUT:
				return isInput != IS_INPUT_EDEFAULT;
			case SsaModelTracePackage.POINTER_PARAMETER__IS_OUTPUT:
				return isOutput != IS_OUTPUT_EDEFAULT;
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
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (isInput: ");
		result.append(isInput);
		result.append(", isOutput: ");
		result.append(isOutput);
		result.append(')');
		return result.toString();
	}

} //PointerParameterImpl
