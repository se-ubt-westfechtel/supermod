/**
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package de.ubt.ai1.supermod.mm.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.ubt.ai1.supermod.mm.core.MergeExpr;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.OptionExpr;
import de.ubt.ai1.supermod.mm.core.SuperModCoreFactory;
import de.ubt.ai1.supermod.mm.core.SuperModCorePackage;
import de.ubt.ai1.supermod.mm.core.Tristate;
import de.ubt.ai1.supermod.mm.core.util.TristateUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Merge Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.MergeExprImpl#getBaseExpr <em>Base Expr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MergeExprImpl extends BinaryExprImpl implements MergeExpr {
	/**
	 * The cached value of the '{@link #getBaseExpr() <em>Base Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseExpr()
	 * @generated
	 * @ordered
	 */
	protected OptionExpr baseExpr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MergeExprImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModCorePackage.Literals.MERGE_EXPR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionExpr getBaseExpr() {
		return baseExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaseExpr(OptionExpr newBaseExpr, NotificationChain msgs) {
		OptionExpr oldBaseExpr = baseExpr;
		baseExpr = newBaseExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SuperModCorePackage.MERGE_EXPR__BASE_EXPR, oldBaseExpr, newBaseExpr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseExpr(OptionExpr newBaseExpr) {
		if (newBaseExpr != baseExpr) {
			NotificationChain msgs = null;
			if (baseExpr != null)
				msgs = ((InternalEObject)baseExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SuperModCorePackage.MERGE_EXPR__BASE_EXPR, null, msgs);
			if (newBaseExpr != null)
				msgs = ((InternalEObject)newBaseExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SuperModCorePackage.MERGE_EXPR__BASE_EXPR, null, msgs);
			msgs = basicSetBaseExpr(newBaseExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModCorePackage.MERGE_EXPR__BASE_EXPR, newBaseExpr, newBaseExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SuperModCorePackage.MERGE_EXPR__BASE_EXPR:
				return basicSetBaseExpr(null, msgs);
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
			case SuperModCorePackage.MERGE_EXPR__BASE_EXPR:
				return getBaseExpr();
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
			case SuperModCorePackage.MERGE_EXPR__BASE_EXPR:
				setBaseExpr((OptionExpr)newValue);
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
			case SuperModCorePackage.MERGE_EXPR__BASE_EXPR:
				setBaseExpr((OptionExpr)null);
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
			case SuperModCorePackage.MERGE_EXPR__BASE_EXPR:
				return baseExpr != null;
		}
		return super.eIsSet(featureID);
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.mm.core.impl.OptionExprImpl
	 * #apply(de.ubt.ai1.supermod.mm.core.OptionBinding)
	 */
	@Override
	public Tristate apply(OptionBinding binding) {
		Tristate left = getLeft().apply(binding);
		Tristate right = getRight().apply(binding);
		Tristate leftAndRight = TristateUtil.and(left, right);
		if (leftAndRight == Tristate.TRUE) {
			return Tristate.TRUE;
		}
		Tristate base = getBaseExpr() == null ? Tristate.FALSE :
			getBaseExpr().apply(binding);
		Tristate insLeft = TristateUtil.minus(left, base);
		if (insLeft == Tristate.TRUE) {
			return Tristate.TRUE;
		}
		Tristate insRight = TristateUtil.minus(right, base);
		if (insRight == Tristate.TRUE) {
			return Tristate.TRUE;
		}
		return TristateUtil.or(leftAndRight, 
				TristateUtil.or(insLeft, insRight));

	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.mm.core.impl.OptionExprImpl#extract()
	 */
	@Override
	public OptionExpr extract() {
		MergeExpr extracted = SuperModCoreFactory.eINSTANCE.createMergeExpr();
		extracted.setLeft(getLeft().extract());
		extracted.setRight(getRight().extract());
		if (getBaseExpr() != null) {
			extracted.setBaseExpr(getBaseExpr().extract());
		}
		return extracted;
	}

} //MergeExprImpl
