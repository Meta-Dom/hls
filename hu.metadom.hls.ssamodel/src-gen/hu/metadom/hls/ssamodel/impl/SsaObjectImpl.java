/**
 */
package hu.metadom.hls.ssamodel.impl;

import hu.metadom.hls.ssamodel.FilePosition;
import hu.metadom.hls.ssamodel.SsaModelPackage;
import hu.metadom.hls.ssamodel.SsaObject;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ssa Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.metadom.hls.ssamodel.impl.SsaObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.impl.SsaObjectImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.impl.SsaObjectImpl#getFileposition <em>Fileposition</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SsaObjectImpl extends MinimalEObjectImpl.Container implements SsaObject {
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
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

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
	protected SsaObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SsaModelPackage.Literals.SSA_OBJECT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SsaModelPackage.SSA_OBJECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SsaModelPackage.SSA_OBJECT__COMMENT, oldComment,
					comment));
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
					SsaModelPackage.SSA_OBJECT__FILEPOSITION, oldFileposition, newFileposition);
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
						EOPPOSITE_FEATURE_BASE - SsaModelPackage.SSA_OBJECT__FILEPOSITION, null, msgs);
			if (newFileposition != null)
				msgs = ((InternalEObject) newFileposition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SsaModelPackage.SSA_OBJECT__FILEPOSITION, null, msgs);
			msgs = basicSetFileposition(newFileposition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SsaModelPackage.SSA_OBJECT__FILEPOSITION,
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
		case SsaModelPackage.SSA_OBJECT__FILEPOSITION:
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
		case SsaModelPackage.SSA_OBJECT__NAME:
			return getName();
		case SsaModelPackage.SSA_OBJECT__COMMENT:
			return getComment();
		case SsaModelPackage.SSA_OBJECT__FILEPOSITION:
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
		case SsaModelPackage.SSA_OBJECT__NAME:
			setName((String) newValue);
			return;
		case SsaModelPackage.SSA_OBJECT__COMMENT:
			setComment((String) newValue);
			return;
		case SsaModelPackage.SSA_OBJECT__FILEPOSITION:
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
		case SsaModelPackage.SSA_OBJECT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case SsaModelPackage.SSA_OBJECT__COMMENT:
			setComment(COMMENT_EDEFAULT);
			return;
		case SsaModelPackage.SSA_OBJECT__FILEPOSITION:
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
		case SsaModelPackage.SSA_OBJECT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case SsaModelPackage.SSA_OBJECT__COMMENT:
			return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
		case SsaModelPackage.SSA_OBJECT__FILEPOSITION:
			return fileposition != null;
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
		result.append(", comment: ");
		result.append(comment);
		result.append(')');
		return result.toString();
	}

} //SsaObjectImpl
