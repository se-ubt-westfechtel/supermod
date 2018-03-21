/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.change.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import de.ubt.ai1.supermod.mm.change.Change;
import de.ubt.ai1.supermod.mm.change.ChangeSet;
import de.ubt.ai1.supermod.mm.change.SuperModChangePackage;
import de.ubt.ai1.supermod.mm.core.Invariant;
import de.ubt.ai1.supermod.mm.core.Option;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.OptionExpr;
import de.ubt.ai1.supermod.mm.core.Preference;
import de.ubt.ai1.supermod.mm.core.ProductDimension;
import de.ubt.ai1.supermod.mm.core.RuleBaseElement;
import de.ubt.ai1.supermod.mm.core.SuperModCorePackage;
import de.ubt.ai1.supermod.mm.core.UUIDElement;
import de.ubt.ai1.supermod.mm.core.VersionSpaceElement;
import de.ubt.ai1.supermod.mm.core.impl.VersionSpaceElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change</b></em>'.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.change.impl.ChangeImpl#getUuid <em>Uuid</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.change.impl.ChangeImpl#getChangeOption <em>Change Option</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.change.impl.ChangeImpl#getChangePreference <em>Change Preference</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.change.impl.ChangeImpl#getChangeInvariant <em>Change Invariant</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.change.impl.ChangeImpl#getUserAmbitionBinding <em>User Ambition Binding</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.change.impl.ChangeImpl#getUserAmbitionExpr <em>User Ambition Expr</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.change.impl.ChangeImpl#getAffectedDimension <em>Affected Dimension</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.change.impl.ChangeImpl#getChangeSet <em>Change Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChangeImpl extends VersionSpaceElementImpl implements Change {
	/**
	 * The default value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected static final String UUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected String uuid = UUID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChangeOption() <em>Change Option</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeOption()
	 * @generated
	 * @ordered
	 */
	protected Option changeOption;

	/**
	 * The cached value of the '{@link #getChangePreference() <em>Change Preference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangePreference()
	 * @generated
	 * @ordered
	 */
	protected Preference changePreference;

	/**
	 * The cached value of the '{@link #getChangeInvariant() <em>Change Invariant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeInvariant()
	 * @generated
	 * @ordered
	 */
	protected Invariant changeInvariant;

	/**
	 * The cached value of the '{@link #getUserAmbitionBinding() <em>User Ambition Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserAmbitionBinding()
	 * @generated
	 * @ordered
	 */
	protected OptionBinding userAmbitionBinding;

	/**
	 * The cached value of the '{@link #getUserAmbitionExpr() <em>User Ambition Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserAmbitionExpr()
	 * @generated
	 * @ordered
	 */
	protected OptionExpr userAmbitionExpr;

	/**
	 * The cached value of the '{@link #getAffectedDimension() <em>Affected Dimension</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffectedDimension()
	 * @generated
	 * @ordered
	 */
	protected ProductDimension affectedDimension;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModChangePackage.Literals.CHANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Option getChangeOption() {
		return changeOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChangeOption(Option newChangeOption, NotificationChain msgs) {
		Option oldChangeOption = changeOption;
		changeOption = newChangeOption;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SuperModChangePackage.CHANGE__CHANGE_OPTION, oldChangeOption, newChangeOption);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeOption(Option newChangeOption) {
		if (newChangeOption != changeOption) {
			NotificationChain msgs = null;
			if (changeOption != null)
				msgs = ((InternalEObject)changeOption).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SuperModChangePackage.CHANGE__CHANGE_OPTION, null, msgs);
			if (newChangeOption != null)
				msgs = ((InternalEObject)newChangeOption).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SuperModChangePackage.CHANGE__CHANGE_OPTION, null, msgs);
			msgs = basicSetChangeOption(newChangeOption, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModChangePackage.CHANGE__CHANGE_OPTION, newChangeOption, newChangeOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Preference getChangePreference() {
		return changePreference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChangePreference(Preference newChangePreference, NotificationChain msgs) {
		Preference oldChangePreference = changePreference;
		changePreference = newChangePreference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SuperModChangePackage.CHANGE__CHANGE_PREFERENCE, oldChangePreference, newChangePreference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangePreference(Preference newChangePreference) {
		if (newChangePreference != changePreference) {
			NotificationChain msgs = null;
			if (changePreference != null)
				msgs = ((InternalEObject)changePreference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SuperModChangePackage.CHANGE__CHANGE_PREFERENCE, null, msgs);
			if (newChangePreference != null)
				msgs = ((InternalEObject)newChangePreference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SuperModChangePackage.CHANGE__CHANGE_PREFERENCE, null, msgs);
			msgs = basicSetChangePreference(newChangePreference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModChangePackage.CHANGE__CHANGE_PREFERENCE, newChangePreference, newChangePreference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Invariant getChangeInvariant() {
		return changeInvariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChangeInvariant(Invariant newChangeInvariant, NotificationChain msgs) {
		Invariant oldChangeInvariant = changeInvariant;
		changeInvariant = newChangeInvariant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SuperModChangePackage.CHANGE__CHANGE_INVARIANT, oldChangeInvariant, newChangeInvariant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeInvariant(Invariant newChangeInvariant) {
		if (newChangeInvariant != changeInvariant) {
			NotificationChain msgs = null;
			if (changeInvariant != null)
				msgs = ((InternalEObject)changeInvariant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SuperModChangePackage.CHANGE__CHANGE_INVARIANT, null, msgs);
			if (newChangeInvariant != null)
				msgs = ((InternalEObject)newChangeInvariant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SuperModChangePackage.CHANGE__CHANGE_INVARIANT, null, msgs);
			msgs = basicSetChangeInvariant(newChangeInvariant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModChangePackage.CHANGE__CHANGE_INVARIANT, newChangeInvariant, newChangeInvariant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionBinding getUserAmbitionBinding() {
		return userAmbitionBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserAmbitionBinding(OptionBinding newUserAmbitionBinding, NotificationChain msgs) {
		OptionBinding oldUserAmbitionBinding = userAmbitionBinding;
		userAmbitionBinding = newUserAmbitionBinding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SuperModChangePackage.CHANGE__USER_AMBITION_BINDING, oldUserAmbitionBinding, newUserAmbitionBinding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserAmbitionBinding(OptionBinding newUserAmbitionBinding) {
		if (newUserAmbitionBinding != userAmbitionBinding) {
			NotificationChain msgs = null;
			if (userAmbitionBinding != null)
				msgs = ((InternalEObject)userAmbitionBinding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SuperModChangePackage.CHANGE__USER_AMBITION_BINDING, null, msgs);
			if (newUserAmbitionBinding != null)
				msgs = ((InternalEObject)newUserAmbitionBinding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SuperModChangePackage.CHANGE__USER_AMBITION_BINDING, null, msgs);
			msgs = basicSetUserAmbitionBinding(newUserAmbitionBinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModChangePackage.CHANGE__USER_AMBITION_BINDING, newUserAmbitionBinding, newUserAmbitionBinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionExpr getUserAmbitionExpr() {
		return userAmbitionExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserAmbitionExpr(OptionExpr newUserAmbitionExpr, NotificationChain msgs) {
		OptionExpr oldUserAmbitionExpr = userAmbitionExpr;
		userAmbitionExpr = newUserAmbitionExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SuperModChangePackage.CHANGE__USER_AMBITION_EXPR, oldUserAmbitionExpr, newUserAmbitionExpr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserAmbitionExpr(OptionExpr newUserAmbitionExpr) {
		if (newUserAmbitionExpr != userAmbitionExpr) {
			NotificationChain msgs = null;
			if (userAmbitionExpr != null)
				msgs = ((InternalEObject)userAmbitionExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SuperModChangePackage.CHANGE__USER_AMBITION_EXPR, null, msgs);
			if (newUserAmbitionExpr != null)
				msgs = ((InternalEObject)newUserAmbitionExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SuperModChangePackage.CHANGE__USER_AMBITION_EXPR, null, msgs);
			msgs = basicSetUserAmbitionExpr(newUserAmbitionExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModChangePackage.CHANGE__USER_AMBITION_EXPR, newUserAmbitionExpr, newUserAmbitionExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OptionExpr basicGetAmbition() {
		return getChangePreference().getOptionExpr();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductDimension getAffectedDimension() {
		if (affectedDimension != null && affectedDimension.eIsProxy()) {
			InternalEObject oldAffectedDimension = (InternalEObject)affectedDimension;
			affectedDimension = (ProductDimension)eResolveProxy(oldAffectedDimension);
			if (affectedDimension != oldAffectedDimension) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SuperModChangePackage.CHANGE__AFFECTED_DIMENSION, oldAffectedDimension, affectedDimension));
			}
		}
		return affectedDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductDimension basicGetAffectedDimension() {
		return affectedDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAffectedDimension(ProductDimension newAffectedDimension) {
		ProductDimension oldAffectedDimension = affectedDimension;
		affectedDimension = newAffectedDimension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModChangePackage.CHANGE__AFFECTED_DIMENSION, oldAffectedDimension, affectedDimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeSet getChangeSet() {
		if (eContainerFeatureID() != SuperModChangePackage.CHANGE__CHANGE_SET) return null;
		return (ChangeSet)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChangeSet(ChangeSet newChangeSet, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newChangeSet, SuperModChangePackage.CHANGE__CHANGE_SET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeSet(ChangeSet newChangeSet) {
		if (newChangeSet != eInternalContainer() || (eContainerFeatureID() != SuperModChangePackage.CHANGE__CHANGE_SET && newChangeSet != null)) {
			if (EcoreUtil.isAncestor(this, newChangeSet))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newChangeSet != null)
				msgs = ((InternalEObject)newChangeSet).eInverseAdd(this, SuperModChangePackage.CHANGE_SET__CHANGES, ChangeSet.class, msgs);
			msgs = basicSetChangeSet(newChangeSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModChangePackage.CHANGE__CHANGE_SET, newChangeSet, newChangeSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUuid() {
		return uuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUuid(String newUuid) {
		String oldUuid = uuid;
		uuid = newUuid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModChangePackage.CHANGE__UUID, oldUuid, uuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SuperModChangePackage.CHANGE__CHANGE_SET:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetChangeSet((ChangeSet)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SuperModChangePackage.CHANGE__CHANGE_OPTION:
				return basicSetChangeOption(null, msgs);
			case SuperModChangePackage.CHANGE__CHANGE_PREFERENCE:
				return basicSetChangePreference(null, msgs);
			case SuperModChangePackage.CHANGE__CHANGE_INVARIANT:
				return basicSetChangeInvariant(null, msgs);
			case SuperModChangePackage.CHANGE__USER_AMBITION_BINDING:
				return basicSetUserAmbitionBinding(null, msgs);
			case SuperModChangePackage.CHANGE__USER_AMBITION_EXPR:
				return basicSetUserAmbitionExpr(null, msgs);
			case SuperModChangePackage.CHANGE__CHANGE_SET:
				return basicSetChangeSet(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SuperModChangePackage.CHANGE__CHANGE_SET:
				return eInternalContainer().eInverseRemove(this, SuperModChangePackage.CHANGE_SET__CHANGES, ChangeSet.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SuperModChangePackage.CHANGE__UUID:
				return getUuid();
			case SuperModChangePackage.CHANGE__CHANGE_OPTION:
				return getChangeOption();
			case SuperModChangePackage.CHANGE__CHANGE_PREFERENCE:
				return getChangePreference();
			case SuperModChangePackage.CHANGE__CHANGE_INVARIANT:
				return getChangeInvariant();
			case SuperModChangePackage.CHANGE__USER_AMBITION_BINDING:
				return getUserAmbitionBinding();
			case SuperModChangePackage.CHANGE__USER_AMBITION_EXPR:
				return getUserAmbitionExpr();
			case SuperModChangePackage.CHANGE__AFFECTED_DIMENSION:
				if (resolve) return getAffectedDimension();
				return basicGetAffectedDimension();
			case SuperModChangePackage.CHANGE__CHANGE_SET:
				return getChangeSet();
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
			case SuperModChangePackage.CHANGE__UUID:
				setUuid((String)newValue);
				return;
			case SuperModChangePackage.CHANGE__CHANGE_OPTION:
				setChangeOption((Option)newValue);
				return;
			case SuperModChangePackage.CHANGE__CHANGE_PREFERENCE:
				setChangePreference((Preference)newValue);
				return;
			case SuperModChangePackage.CHANGE__CHANGE_INVARIANT:
				setChangeInvariant((Invariant)newValue);
				return;
			case SuperModChangePackage.CHANGE__USER_AMBITION_BINDING:
				setUserAmbitionBinding((OptionBinding)newValue);
				return;
			case SuperModChangePackage.CHANGE__USER_AMBITION_EXPR:
				setUserAmbitionExpr((OptionExpr)newValue);
				return;
			case SuperModChangePackage.CHANGE__AFFECTED_DIMENSION:
				setAffectedDimension((ProductDimension)newValue);
				return;
			case SuperModChangePackage.CHANGE__CHANGE_SET:
				setChangeSet((ChangeSet)newValue);
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
			case SuperModChangePackage.CHANGE__UUID:
				setUuid(UUID_EDEFAULT);
				return;
			case SuperModChangePackage.CHANGE__CHANGE_OPTION:
				setChangeOption((Option)null);
				return;
			case SuperModChangePackage.CHANGE__CHANGE_PREFERENCE:
				setChangePreference((Preference)null);
				return;
			case SuperModChangePackage.CHANGE__CHANGE_INVARIANT:
				setChangeInvariant((Invariant)null);
				return;
			case SuperModChangePackage.CHANGE__USER_AMBITION_BINDING:
				setUserAmbitionBinding((OptionBinding)null);
				return;
			case SuperModChangePackage.CHANGE__USER_AMBITION_EXPR:
				setUserAmbitionExpr((OptionExpr)null);
				return;
			case SuperModChangePackage.CHANGE__AFFECTED_DIMENSION:
				setAffectedDimension((ProductDimension)null);
				return;
			case SuperModChangePackage.CHANGE__CHANGE_SET:
				setChangeSet((ChangeSet)null);
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
			case SuperModChangePackage.CHANGE__UUID:
				return UUID_EDEFAULT == null ? uuid != null : !UUID_EDEFAULT.equals(uuid);
			case SuperModChangePackage.CHANGE__CHANGE_OPTION:
				return changeOption != null;
			case SuperModChangePackage.CHANGE__CHANGE_PREFERENCE:
				return changePreference != null;
			case SuperModChangePackage.CHANGE__CHANGE_INVARIANT:
				return changeInvariant != null;
			case SuperModChangePackage.CHANGE__USER_AMBITION_BINDING:
				return userAmbitionBinding != null;
			case SuperModChangePackage.CHANGE__USER_AMBITION_EXPR:
				return userAmbitionExpr != null;
			case SuperModChangePackage.CHANGE__AFFECTED_DIMENSION:
				return affectedDimension != null;
			case SuperModChangePackage.CHANGE__CHANGE_SET:
				return getChangeSet() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == UUIDElement.class) {
			switch (derivedFeatureID) {
				case SuperModChangePackage.CHANGE__UUID: return SuperModCorePackage.UUID_ELEMENT__UUID;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == UUIDElement.class) {
			switch (baseFeatureID) {
				case SuperModCorePackage.UUID_ELEMENT__UUID: return SuperModChangePackage.CHANGE__UUID;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (uuid: ");
		result.append(uuid);
		result.append(')');
		return result.toString();
	}

	@Override
	public VersionSpaceElement basicGetSuperVersionSpaceElement() {
		return getChangeSet();
	}

	@Override
	public EList<VersionSpaceElement> getSubVersionSpaceElements() {
		return ECollections.emptyEList();
	}

	@Override
	public EList<VersionSpaceElement> getCrossReferencedVersionSpaceElements() {
		return ECollections.emptyEList();
	}
	
	@Override
	public EList<VersionSpaceElement> getCrossReferencingVersionSpaceElements() {
		return ECollections.emptyEList();
	}

	@Override
	public EList<RuleBaseElement> getLowLevelConcepts() {
		EList<RuleBaseElement> llc = ECollections.newBasicEList();
		if (getChangeOption() != null) {
			llc.add(getChangeOption());
		}
		if (getChangeInvariant() != null) {
			llc.add(getChangeInvariant());
		}
		if (getChangePreference() != null) {
			llc.add(getChangePreference());
		}
		return ECollections.unmodifiableEList(llc);
	}

} //ChangeImpl
