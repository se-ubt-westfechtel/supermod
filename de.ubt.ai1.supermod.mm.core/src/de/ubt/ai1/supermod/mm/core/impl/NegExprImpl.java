/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.ubt.ai1.supermod.mm.core.NegExpr;
import de.ubt.ai1.supermod.mm.core.Option;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.OptionExpr;
import de.ubt.ai1.supermod.mm.core.SuperModCoreFactory;
import de.ubt.ai1.supermod.mm.core.SuperModCorePackage;
import de.ubt.ai1.supermod.mm.core.Tristate;
import de.ubt.ai1.supermod.mm.core.VersionDimension;
import de.ubt.ai1.supermod.mm.core.util.TristateUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Neg Expr</b></em>'.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-25
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.NegExprImpl#getNeg <em>Neg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NegExprImpl extends OptionExprImpl implements NegExpr {
	/**
	 * The cached value of the '{@link #getNeg() <em>Neg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeg()
	 * @generated
	 * @ordered
	 */
	protected OptionExpr neg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NegExprImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModCorePackage.Literals.NEG_EXPR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionExpr getNeg() {
		return neg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNeg(OptionExpr newNeg, NotificationChain msgs) {
		OptionExpr oldNeg = neg;
		neg = newNeg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SuperModCorePackage.NEG_EXPR__NEG, oldNeg, newNeg);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeg(OptionExpr newNeg) {
		if (newNeg != neg) {
			NotificationChain msgs = null;
			if (neg != null)
				msgs = ((InternalEObject)neg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SuperModCorePackage.NEG_EXPR__NEG, null, msgs);
			if (newNeg != null)
				msgs = ((InternalEObject)newNeg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SuperModCorePackage.NEG_EXPR__NEG, null, msgs);
			msgs = basicSetNeg(newNeg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModCorePackage.NEG_EXPR__NEG, newNeg, newNeg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SuperModCorePackage.NEG_EXPR__NEG:
				return basicSetNeg(null, msgs);
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
			case SuperModCorePackage.NEG_EXPR__NEG:
				return getNeg();
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
			case SuperModCorePackage.NEG_EXPR__NEG:
				setNeg((OptionExpr)newValue);
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
			case SuperModCorePackage.NEG_EXPR__NEG:
				setNeg((OptionExpr)null);
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
			case SuperModCorePackage.NEG_EXPR__NEG:
				return neg != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public Tristate apply(OptionBinding binding) {
		return TristateUtil.not(getNeg().apply(binding));
	}

	@Override
	public EList<Option> getReferencedOptions() {
		if (getNeg() == null) {
			return ECollections.emptyEList();
		}
		return getNeg().getReferencedOptions();
	}

	@Override
	public EList<VersionDimension> getReferencedDimensions() {
		if (getNeg() == null) {
			return ECollections.emptyEList();
		}
		return getNeg().getReferencedDimensions();
	}

	@Override
	public OptionExpr extract() {
		NegExpr extracted = SuperModCoreFactory.eINSTANCE.createNegExpr();
		extracted.setNeg(getNeg().extract());
		return extracted;
	}
	
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.mm.core.impl.OptionExprImpl#toString()
	 */
	@Override
	public String toString() {
		return "not " + getNeg();
	}

} //NegExprImpl
