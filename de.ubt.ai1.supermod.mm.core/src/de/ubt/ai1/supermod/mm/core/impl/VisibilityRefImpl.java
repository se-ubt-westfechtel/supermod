/**
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package de.ubt.ai1.supermod.mm.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.ubt.ai1.supermod.mm.core.Option;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.OptionExpr;
import de.ubt.ai1.supermod.mm.core.SuperModCorePackage;
import de.ubt.ai1.supermod.mm.core.Tristate;
import de.ubt.ai1.supermod.mm.core.VersionDimension;
import de.ubt.ai1.supermod.mm.core.Visibility;
import de.ubt.ai1.supermod.mm.core.VisibilityRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Visibility Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.VisibilityRefImpl#getVisibility <em>Visibility</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VisibilityRefImpl extends OptionExprImpl implements VisibilityRef {
	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected Visibility visibility;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisibilityRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModCorePackage.Literals.VISIBILITY_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visibility getVisibility() {
		if (visibility != null && visibility.eIsProxy()) {
			InternalEObject oldVisibility = (InternalEObject)visibility;
			visibility = (Visibility)eResolveProxy(oldVisibility);
			if (visibility != oldVisibility) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SuperModCorePackage.VISIBILITY_REF__VISIBILITY, oldVisibility, visibility));
			}
		}
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visibility basicGetVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(Visibility newVisibility) {
		Visibility oldVisibility = visibility;
		visibility = newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModCorePackage.VISIBILITY_REF__VISIBILITY, oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SuperModCorePackage.VISIBILITY_REF__VISIBILITY:
				if (resolve) return getVisibility();
				return basicGetVisibility();
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
			case SuperModCorePackage.VISIBILITY_REF__VISIBILITY:
				setVisibility((Visibility)newValue);
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
			case SuperModCorePackage.VISIBILITY_REF__VISIBILITY:
				setVisibility((Visibility)null);
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
			case SuperModCorePackage.VISIBILITY_REF__VISIBILITY:
				return visibility != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public Tristate apply(OptionBinding binding) {
		return getVisibility().getExpr().apply(binding);
	}
	
	@Override
	public OptionExpr extract() {
		return getVisibility().getExpr().extract();
	}

	@Override
	public EList<Option> getReferencedOptions() {
		if (getVisibility() == null || getVisibility().getExpr() == null) {
			return ECollections.emptyEList();
		}
		return getVisibility().getExpr().getReferencedOptions();
	}

	@Override
	public EList<VersionDimension> getReferencedDimensions() {
		if (getVisibility() == null || getVisibility().getExpr() == null) {
			return ECollections.emptyEList();
		}
		return getVisibility().getExpr().getReferencedDimensions();
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.mm.core.impl.OptionExprImpl#toString()
	 */
	@Override
	public String toString() {
		return "<" + getVisibility().getExpr() + ">";
	}

} //VisibilityRefImpl
