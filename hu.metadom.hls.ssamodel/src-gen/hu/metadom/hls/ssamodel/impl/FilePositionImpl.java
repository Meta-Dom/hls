/**
 */
package hu.metadom.hls.ssamodel.impl;

import hu.metadom.hls.ssamodel.FilePosition;
import hu.metadom.hls.ssamodel.SsaModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File Position</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.metadom.hls.ssamodel.impl.FilePositionImpl#getName <em>Name</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.impl.FilePositionImpl#getLine <em>Line</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.impl.FilePositionImpl#getStartPositionInLine <em>Start Position In Line</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.impl.FilePositionImpl#getEndPositionInLine <em>End Position In Line</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.impl.FilePositionImpl#getStartPosition <em>Start Position</em>}</li>
 *   <li>{@link hu.metadom.hls.ssamodel.impl.FilePositionImpl#getEndPosition <em>End Position</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FilePositionImpl extends MinimalEObjectImpl.Container implements FilePosition {
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
	 * The default value of the '{@link #getLine() <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected static final int LINE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLine() <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected int line = LINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartPositionInLine() <em>Start Position In Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartPositionInLine()
	 * @generated
	 * @ordered
	 */
	protected static final int START_POSITION_IN_LINE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStartPositionInLine() <em>Start Position In Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartPositionInLine()
	 * @generated
	 * @ordered
	 */
	protected int startPositionInLine = START_POSITION_IN_LINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndPositionInLine() <em>End Position In Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndPositionInLine()
	 * @generated
	 * @ordered
	 */
	protected static final int END_POSITION_IN_LINE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEndPositionInLine() <em>End Position In Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndPositionInLine()
	 * @generated
	 * @ordered
	 */
	protected int endPositionInLine = END_POSITION_IN_LINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartPosition() <em>Start Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartPosition()
	 * @generated
	 * @ordered
	 */
	protected static final int START_POSITION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStartPosition() <em>Start Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartPosition()
	 * @generated
	 * @ordered
	 */
	protected int startPosition = START_POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndPosition() <em>End Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndPosition()
	 * @generated
	 * @ordered
	 */
	protected static final int END_POSITION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEndPosition() <em>End Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndPosition()
	 * @generated
	 * @ordered
	 */
	protected int endPosition = END_POSITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilePositionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SsaModelPackage.Literals.FILE_POSITION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SsaModelPackage.FILE_POSITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLine() {
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLine(int newLine) {
		int oldLine = line;
		line = newLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SsaModelPackage.FILE_POSITION__LINE, oldLine, line));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStartPositionInLine() {
		return startPositionInLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartPositionInLine(int newStartPositionInLine) {
		int oldStartPositionInLine = startPositionInLine;
		startPositionInLine = newStartPositionInLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SsaModelPackage.FILE_POSITION__START_POSITION_IN_LINE,
					oldStartPositionInLine, startPositionInLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEndPositionInLine() {
		return endPositionInLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndPositionInLine(int newEndPositionInLine) {
		int oldEndPositionInLine = endPositionInLine;
		endPositionInLine = newEndPositionInLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SsaModelPackage.FILE_POSITION__END_POSITION_IN_LINE,
					oldEndPositionInLine, endPositionInLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStartPosition() {
		return startPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartPosition(int newStartPosition) {
		int oldStartPosition = startPosition;
		startPosition = newStartPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SsaModelPackage.FILE_POSITION__START_POSITION,
					oldStartPosition, startPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEndPosition() {
		return endPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndPosition(int newEndPosition) {
		int oldEndPosition = endPosition;
		endPosition = newEndPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SsaModelPackage.FILE_POSITION__END_POSITION,
					oldEndPosition, endPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SsaModelPackage.FILE_POSITION__NAME:
			return getName();
		case SsaModelPackage.FILE_POSITION__LINE:
			return getLine();
		case SsaModelPackage.FILE_POSITION__START_POSITION_IN_LINE:
			return getStartPositionInLine();
		case SsaModelPackage.FILE_POSITION__END_POSITION_IN_LINE:
			return getEndPositionInLine();
		case SsaModelPackage.FILE_POSITION__START_POSITION:
			return getStartPosition();
		case SsaModelPackage.FILE_POSITION__END_POSITION:
			return getEndPosition();
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
		case SsaModelPackage.FILE_POSITION__NAME:
			setName((String) newValue);
			return;
		case SsaModelPackage.FILE_POSITION__LINE:
			setLine((Integer) newValue);
			return;
		case SsaModelPackage.FILE_POSITION__START_POSITION_IN_LINE:
			setStartPositionInLine((Integer) newValue);
			return;
		case SsaModelPackage.FILE_POSITION__END_POSITION_IN_LINE:
			setEndPositionInLine((Integer) newValue);
			return;
		case SsaModelPackage.FILE_POSITION__START_POSITION:
			setStartPosition((Integer) newValue);
			return;
		case SsaModelPackage.FILE_POSITION__END_POSITION:
			setEndPosition((Integer) newValue);
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
		case SsaModelPackage.FILE_POSITION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case SsaModelPackage.FILE_POSITION__LINE:
			setLine(LINE_EDEFAULT);
			return;
		case SsaModelPackage.FILE_POSITION__START_POSITION_IN_LINE:
			setStartPositionInLine(START_POSITION_IN_LINE_EDEFAULT);
			return;
		case SsaModelPackage.FILE_POSITION__END_POSITION_IN_LINE:
			setEndPositionInLine(END_POSITION_IN_LINE_EDEFAULT);
			return;
		case SsaModelPackage.FILE_POSITION__START_POSITION:
			setStartPosition(START_POSITION_EDEFAULT);
			return;
		case SsaModelPackage.FILE_POSITION__END_POSITION:
			setEndPosition(END_POSITION_EDEFAULT);
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
		case SsaModelPackage.FILE_POSITION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case SsaModelPackage.FILE_POSITION__LINE:
			return line != LINE_EDEFAULT;
		case SsaModelPackage.FILE_POSITION__START_POSITION_IN_LINE:
			return startPositionInLine != START_POSITION_IN_LINE_EDEFAULT;
		case SsaModelPackage.FILE_POSITION__END_POSITION_IN_LINE:
			return endPositionInLine != END_POSITION_IN_LINE_EDEFAULT;
		case SsaModelPackage.FILE_POSITION__START_POSITION:
			return startPosition != START_POSITION_EDEFAULT;
		case SsaModelPackage.FILE_POSITION__END_POSITION:
			return endPosition != END_POSITION_EDEFAULT;
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
		result.append(", line: ");
		result.append(line);
		result.append(", startPositionInLine: ");
		result.append(startPositionInLine);
		result.append(", endPositionInLine: ");
		result.append(endPositionInLine);
		result.append(", startPosition: ");
		result.append(startPosition);
		result.append(", endPosition: ");
		result.append(endPosition);
		result.append(')');
		return result.toString();
	}

} //FilePositionImpl
