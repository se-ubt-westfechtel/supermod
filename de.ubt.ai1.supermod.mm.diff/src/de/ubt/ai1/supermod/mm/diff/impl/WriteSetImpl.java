/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.diff.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.diff.SuperModDiffPackage;
import de.ubt.ai1.supermod.mm.diff.WriteSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Write Set</b></em>'.
 * @author Felix Schwaegerl
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-25
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.diff.impl.WriteSetImpl#getAmbition <em>Ambition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WriteSetImpl extends ProductDimensionDeltaImpl implements WriteSet {
	/**
	 * The cached value of the '{@link #getAmbition() <em>Ambition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmbition()
	 * @generated
	 * @ordered
	 */
	protected OptionBinding ambition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WriteSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModDiffPackage.Literals.WRITE_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionBinding getAmbition() {
		return ambition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAmbition(OptionBinding newAmbition, NotificationChain msgs) {
		OptionBinding oldAmbition = ambition;
		ambition = newAmbition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SuperModDiffPackage.WRITE_SET__AMBITION, oldAmbition, newAmbition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmbition(OptionBinding newAmbition) {
		if (newAmbition != ambition) {
			NotificationChain msgs = null;
			if (ambition != null)
				msgs = ((InternalEObject)ambition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SuperModDiffPackage.WRITE_SET__AMBITION, null, msgs);
			if (newAmbition != null)
				msgs = ((InternalEObject)newAmbition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SuperModDiffPackage.WRITE_SET__AMBITION, null, msgs);
			msgs = basicSetAmbition(newAmbition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModDiffPackage.WRITE_SET__AMBITION, newAmbition, newAmbition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SuperModDiffPackage.WRITE_SET__AMBITION:
				return basicSetAmbition(null, msgs);
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
			case SuperModDiffPackage.WRITE_SET__AMBITION:
				return getAmbition();
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
			case SuperModDiffPackage.WRITE_SET__AMBITION:
				setAmbition((OptionBinding)newValue);
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
			case SuperModDiffPackage.WRITE_SET__AMBITION:
				setAmbition((OptionBinding)null);
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
			case SuperModDiffPackage.WRITE_SET__AMBITION:
				return ambition != null;
		}
		return super.eIsSet(featureID);
	}

} //WriteSetImpl
