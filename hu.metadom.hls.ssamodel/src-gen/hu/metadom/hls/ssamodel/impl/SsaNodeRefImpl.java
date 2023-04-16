/**
 */
package hu.metadom.hls.ssamodel.impl;

import hu.metadom.hls.ssamodel.FilePosition;
import hu.metadom.hls.ssamodel.SsaModelPackage;
import hu.metadom.hls.ssamodel.SsaNode;
import hu.metadom.hls.ssamodel.SsaNodeRef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ssa Node Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.metadom.hls.ssamodel.impl.SsaNodeRefImpl#getNode <em>Node</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.impl.SsaNodeRefImpl#getFileposition <em>Fileposition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SsaNodeRefImpl extends MinimalEObjectImpl.Container implements SsaNodeRef {
	/**
	 * The cached value of the '{@link #getNode() <em>Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected SsaNode node;

	/**
	 * The cached value of the '{@link #getFileposition() <em>Fileposition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileposition()
	 * @generated
	 * @ordered
	 */
	protected FilePosition fileposition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SsaNodeRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SsaModelPackage.Literals.SSA_NODE_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaNode getNode() {
		if (node != null && node.eIsProxy()) {
			InternalEObject oldNode = (InternalEObject) node;
			node = (SsaNode) eResolveProxy(oldNode);
			if (node != oldNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SsaModelPackage.SSA_NODE_REF__NODE,
							oldNode, node));
			}
		}
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsaNode basicGetNode() {
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNode(SsaNode newNode) {
		SsaNode oldNode = node;
		node = newNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SsaModelPackage.SSA_NODE_REF__NODE, oldNode, node));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilePosition getFileposition() {
		return fileposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFileposition(FilePosition newFileposition, NotificationChain msgs) {
		FilePosition oldFileposition = fileposition;
		fileposition = newFileposition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SsaModelPackage.SSA_NODE_REF__FILEPOSITION, oldFileposition, newFileposition);
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
	public void setFileposition(FilePosition newFileposition) {
		if (newFileposition != fileposition) {
			NotificationChain msgs = null;
			if (fileposition != null)
				msgs = ((InternalEObject) fileposition).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SsaModelPackage.SSA_NODE_REF__FILEPOSITION, null, msgs);
			if (newFileposition != null)
				msgs = ((InternalEObject) newFileposition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SsaModelPackage.SSA_NODE_REF__FILEPOSITION, null, msgs);
			msgs = basicSetFileposition(newFileposition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SsaModelPackage.SSA_NODE_REF__FILEPOSITION,
					newFileposition, newFileposition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SsaModelPackage.SSA_NODE_REF__FILEPOSITION:
			return basicSetFileposition(null, msgs);
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
		case SsaModelPackage.SSA_NODE_REF__NODE:
			if (resolve)
				return getNode();
			return basicGetNode();
		case SsaModelPackage.SSA_NODE_REF__FILEPOSITION:
			return getFileposition();
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
		case SsaModelPackage.SSA_NODE_REF__NODE:
			setNode((SsaNode) newValue);
			return;
		case SsaModelPackage.SSA_NODE_REF__FILEPOSITION:
			setFileposition((FilePosition) newValue);
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
		case SsaModelPackage.SSA_NODE_REF__NODE:
			setNode((SsaNode) null);
			return;
		case SsaModelPackage.SSA_NODE_REF__FILEPOSITION:
			setFileposition((FilePosition) null);
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
		case SsaModelPackage.SSA_NODE_REF__NODE:
			return node != null;
		case SsaModelPackage.SSA_NODE_REF__FILEPOSITION:
			return fileposition != null;
		}
		return super.eIsSet(featureID);
	}

} //SsaNodeRefImpl
