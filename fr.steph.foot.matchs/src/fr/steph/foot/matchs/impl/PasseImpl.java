/**
 */
package fr.steph.foot.matchs.impl;

import fr.steph.foot.matchs.MatchsPackage;
import fr.steph.foot.matchs.Passe;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Passe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.steph.foot.matchs.impl.PasseImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link fr.steph.foot.matchs.impl.PasseImpl#isR�ussi <em>R�ussi</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PasseImpl extends ActionImpl implements Passe {
	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected EOperation operation;

	/**
	 * The default value of the '{@link #isR�ussi() <em>R�ussi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isR�ussi()
	 * @generated
	 * @ordered
	 */
	protected static final boolean R�USSI_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isR�ussi() <em>R�ussi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isR�ussi()
	 * @generated
	 * @ordered
	 */
	protected boolean r�ussi = R�USSI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PasseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MatchsPackage.Literals.PASSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOperation() {
		if (operation != null && operation.eIsProxy()) {
			InternalEObject oldOperation = (InternalEObject)operation;
			operation = (EOperation)eResolveProxy(oldOperation);
			if (operation != oldOperation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MatchsPackage.PASSE__OPERATION, oldOperation, operation));
			}
		}
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation basicGetOperation() {
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperation(EOperation newOperation) {
		EOperation oldOperation = operation;
		operation = newOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatchsPackage.PASSE__OPERATION, oldOperation, operation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isR�ussi() {
		return r�ussi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setR�ussi(boolean newR�ussi) {
		boolean oldR�ussi = r�ussi;
		r�ussi = newR�ussi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatchsPackage.PASSE__R�USSI, oldR�ussi, r�ussi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MatchsPackage.PASSE__OPERATION:
				if (resolve) return getOperation();
				return basicGetOperation();
			case MatchsPackage.PASSE__R�USSI:
				return isR�ussi();
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
			case MatchsPackage.PASSE__OPERATION:
				setOperation((EOperation)newValue);
				return;
			case MatchsPackage.PASSE__R�USSI:
				setR�ussi((Boolean)newValue);
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
			case MatchsPackage.PASSE__OPERATION:
				setOperation((EOperation)null);
				return;
			case MatchsPackage.PASSE__R�USSI:
				setR�ussi(R�USSI_EDEFAULT);
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
			case MatchsPackage.PASSE__OPERATION:
				return operation != null;
			case MatchsPackage.PASSE__R�USSI:
				return r�ussi != R�USSI_EDEFAULT;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (r�ussi: ");
		result.append(r�ussi);
		result.append(')');
		return result.toString();
	}

} //PasseImpl
