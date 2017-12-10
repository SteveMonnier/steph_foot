/**
 */
package fr.steph.foot.matchs.impl;

import fr.steph.foot.matchs.MatchsPackage;
import fr.steph.foot.matchs.Participant;
import fr.steph.foot.matchs.Possession;
import fr.steph.foot.matchs.PossessionEnd;

import fr.steph.foot.matchs.PossessionType;
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
 * An implementation of the model object '<em><b>Possession</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.steph.foot.matchs.impl.PossessionImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.steph.foot.matchs.impl.PossessionImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link fr.steph.foot.matchs.impl.PossessionImpl#getStart <em>Start</em>}</li>
 *   <li>{@link fr.steph.foot.matchs.impl.PossessionImpl#getEnd <em>End</em>}</li>
 *   <li>{@link fr.steph.foot.matchs.impl.PossessionImpl#getPossessionType <em>Possession Type</em>}</li>
 *   <li>{@link fr.steph.foot.matchs.impl.PossessionImpl#getPossessions <em>Possessions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PossessionImpl extends MinimalEObjectImpl.Container implements Possession {
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
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected Participant owner;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected PossessionEnd start;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected PossessionEnd end;

	/**
	 * The default value of the '{@link #getPossessionType() <em>Possession Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPossessionType()
	 * @generated
	 * @ordered
	 */
	protected static final PossessionType POSSESSION_TYPE_EDEFAULT = PossessionType.DRIBBLE;

	/**
	 * The cached value of the '{@link #getPossessionType() <em>Possession Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPossessionType()
	 * @generated
	 * @ordered
	 */
	protected PossessionType possessionType = POSSESSION_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPossessions() <em>Possessions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPossessions()
	 * @generated
	 * @ordered
	 */
	protected EList<Possession> possessions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PossessionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MatchsPackage.Literals.POSSESSION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MatchsPackage.POSSESSION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant getOwner() {
		if (owner != null && owner.eIsProxy()) {
			InternalEObject oldOwner = (InternalEObject)owner;
			owner = (Participant)eResolveProxy(oldOwner);
			if (owner != oldOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MatchsPackage.POSSESSION__OWNER, oldOwner, owner));
			}
		}
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant basicGetOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(Participant newOwner) {
		Participant oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatchsPackage.POSSESSION__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PossessionEnd getStart() {
		if (start != null && start.eIsProxy()) {
			InternalEObject oldStart = (InternalEObject)start;
			start = (PossessionEnd)eResolveProxy(oldStart);
			if (start != oldStart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MatchsPackage.POSSESSION__START, oldStart, start));
			}
		}
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PossessionEnd basicGetStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(PossessionEnd newStart) {
		PossessionEnd oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatchsPackage.POSSESSION__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PossessionEnd getEnd() {
		if (end != null && end.eIsProxy()) {
			InternalEObject oldEnd = (InternalEObject)end;
			end = (PossessionEnd)eResolveProxy(oldEnd);
			if (end != oldEnd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MatchsPackage.POSSESSION__END, oldEnd, end));
			}
		}
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PossessionEnd basicGetEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(PossessionEnd newEnd) {
		PossessionEnd oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatchsPackage.POSSESSION__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PossessionType getPossessionType() {
		return possessionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPossessionType(PossessionType newPossessionType) {
		PossessionType oldPossessionType = possessionType;
		possessionType = newPossessionType == null ? POSSESSION_TYPE_EDEFAULT : newPossessionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatchsPackage.POSSESSION__POSSESSION_TYPE, oldPossessionType, possessionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Possession> getPossessions() {
		if (possessions == null) {
			possessions = new EObjectContainmentEList<Possession>(Possession.class, this, MatchsPackage.POSSESSION__POSSESSIONS);
		}
		return possessions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MatchsPackage.POSSESSION__POSSESSIONS:
				return ((InternalEList<?>)getPossessions()).basicRemove(otherEnd, msgs);
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
			case MatchsPackage.POSSESSION__NAME:
				return getName();
			case MatchsPackage.POSSESSION__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case MatchsPackage.POSSESSION__START:
				if (resolve) return getStart();
				return basicGetStart();
			case MatchsPackage.POSSESSION__END:
				if (resolve) return getEnd();
				return basicGetEnd();
			case MatchsPackage.POSSESSION__POSSESSION_TYPE:
				return getPossessionType();
			case MatchsPackage.POSSESSION__POSSESSIONS:
				return getPossessions();
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
			case MatchsPackage.POSSESSION__NAME:
				setName((String)newValue);
				return;
			case MatchsPackage.POSSESSION__OWNER:
				setOwner((Participant)newValue);
				return;
			case MatchsPackage.POSSESSION__START:
				setStart((PossessionEnd)newValue);
				return;
			case MatchsPackage.POSSESSION__END:
				setEnd((PossessionEnd)newValue);
				return;
			case MatchsPackage.POSSESSION__POSSESSION_TYPE:
				setPossessionType((PossessionType)newValue);
				return;
			case MatchsPackage.POSSESSION__POSSESSIONS:
				getPossessions().clear();
				getPossessions().addAll((Collection<? extends Possession>)newValue);
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
			case MatchsPackage.POSSESSION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MatchsPackage.POSSESSION__OWNER:
				setOwner((Participant)null);
				return;
			case MatchsPackage.POSSESSION__START:
				setStart((PossessionEnd)null);
				return;
			case MatchsPackage.POSSESSION__END:
				setEnd((PossessionEnd)null);
				return;
			case MatchsPackage.POSSESSION__POSSESSION_TYPE:
				setPossessionType(POSSESSION_TYPE_EDEFAULT);
				return;
			case MatchsPackage.POSSESSION__POSSESSIONS:
				getPossessions().clear();
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
			case MatchsPackage.POSSESSION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MatchsPackage.POSSESSION__OWNER:
				return owner != null;
			case MatchsPackage.POSSESSION__START:
				return start != null;
			case MatchsPackage.POSSESSION__END:
				return end != null;
			case MatchsPackage.POSSESSION__POSSESSION_TYPE:
				return possessionType != POSSESSION_TYPE_EDEFAULT;
			case MatchsPackage.POSSESSION__POSSESSIONS:
				return possessions != null && !possessions.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", possessionType: ");
		result.append(possessionType);
		result.append(')');
		return result.toString();
	}

} //PossessionImpl
