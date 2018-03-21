/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.core.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.ubt.ai1.supermod.mm.core.ImpliesExpr;
import de.ubt.ai1.supermod.mm.core.Invariant;
import de.ubt.ai1.supermod.mm.core.Option;
import de.ubt.ai1.supermod.mm.core.OptionExpr;
import de.ubt.ai1.supermod.mm.core.OptionRef;
import de.ubt.ai1.supermod.mm.core.Preference;
import de.ubt.ai1.supermod.mm.core.SuperModCoreFactory;
import de.ubt.ai1.supermod.mm.core.SuperModCorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Preference</b></em>'.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-25
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.PreferenceImpl#getOption <em>Option</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.PreferenceImpl#getOptionExpr <em>Option Expr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PreferenceImpl extends RuleBaseElementImpl implements Preference {
	/**
	 * The cached value of the '{@link #getOption() <em>Option</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOption()
	 * @generated
	 * @ordered
	 */
	protected Option option;

	/**
	 * The cached value of the '{@link #getOptionExpr() <em>Option Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionExpr()
	 * @generated
	 * @ordered
	 */
	protected OptionExpr optionExpr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PreferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModCorePackage.Literals.PREFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Option getOption() {
		if (option != null && option.eIsProxy()) {
			InternalEObject oldOption = (InternalEObject)option;
			option = (Option)eResolveProxy(oldOption);
			if (option != oldOption) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SuperModCorePackage.PREFERENCE__OPTION, oldOption, option));
			}
		}
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Option basicGetOption() {
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOption(Option newOption) {
		Option oldOption = option;
		option = newOption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModCorePackage.PREFERENCE__OPTION, oldOption, option));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionExpr getOptionExpr() {
		return optionExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOptionExpr(OptionExpr newOptionExpr, NotificationChain msgs) {
		OptionExpr oldOptionExpr = optionExpr;
		optionExpr = newOptionExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SuperModCorePackage.PREFERENCE__OPTION_EXPR, oldOptionExpr, newOptionExpr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptionExpr(OptionExpr newOptionExpr) {
		if (newOptionExpr != optionExpr) {
			NotificationChain msgs = null;
			if (optionExpr != null)
				msgs = ((InternalEObject)optionExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SuperModCorePackage.PREFERENCE__OPTION_EXPR, null, msgs);
			if (newOptionExpr != null)
				msgs = ((InternalEObject)newOptionExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SuperModCorePackage.PREFERENCE__OPTION_EXPR, null, msgs);
			msgs = basicSetOptionExpr(newOptionExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModCorePackage.PREFERENCE__OPTION_EXPR, newOptionExpr, newOptionExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Invariant toImplicationInvariant() {
		OptionRef ref = SuperModCoreFactory.eINSTANCE.createOptionRef();
		ref.setOption(getOption());
		ImpliesExpr implication = SuperModCoreFactory.eINSTANCE.createImpliesExpr();
		implication.setLeft(ref);
		implication.setRight(EcoreUtil.copy(getOptionExpr()));
		Invariant inv = SuperModCoreFactory.eINSTANCE.createInvariant();
		inv.setName(getName() + "::inv");
		inv.setOptionExpr(implication);
		return inv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SuperModCorePackage.PREFERENCE__OPTION_EXPR:
				return basicSetOptionExpr(null, msgs);
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
			case SuperModCorePackage.PREFERENCE__OPTION:
				if (resolve) return getOption();
				return basicGetOption();
			case SuperModCorePackage.PREFERENCE__OPTION_EXPR:
				return getOptionExpr();
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
			case SuperModCorePackage.PREFERENCE__OPTION:
				setOption((Option)newValue);
				return;
			case SuperModCorePackage.PREFERENCE__OPTION_EXPR:
				setOptionExpr((OptionExpr)newValue);
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
			case SuperModCorePackage.PREFERENCE__OPTION:
				setOption((Option)null);
				return;
			case SuperModCorePackage.PREFERENCE__OPTION_EXPR:
				setOptionExpr((OptionExpr)null);
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
			case SuperModCorePackage.PREFERENCE__OPTION:
				return option != null;
			case SuperModCorePackage.PREFERENCE__OPTION_EXPR:
				return optionExpr != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SuperModCorePackage.PREFERENCE___TO_IMPLICATION_INVARIANT:
				return toImplicationInvariant();
		}
		return super.eInvoke(operationID, arguments);
	}
	
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.mm.core.impl.OptionExprImpl#toString()
	 */
	@Override
	public String toString() {
		return "(" + getOption() + " : " + getOptionExpr() + ")";
	}
	
} //PreferenceImpl
