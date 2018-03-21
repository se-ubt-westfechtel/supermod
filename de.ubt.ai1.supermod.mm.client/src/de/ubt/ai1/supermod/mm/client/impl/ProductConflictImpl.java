/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.client.impl;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import de.ubt.ai1.supermod.mm.client.ProductConflict;
import de.ubt.ai1.supermod.mm.client.Severity;
import de.ubt.ai1.supermod.mm.client.SuperModClientPackage;
import de.ubt.ai1.supermod.mm.core.Element;
import de.ubt.ai1.supermod.mm.core.ProductSpaceElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Conflict</b></em>'.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.client.impl.ProductConflictImpl#getAffectedProductSpaceElements <em>Affected Product Space Elements</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.client.impl.ProductConflictImpl#getSeverity <em>Severity</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ProductConflictImpl extends MinimalEObjectImpl.Container implements ProductConflict {
	/**
	 * The default value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected static final Severity SEVERITY_EDEFAULT = Severity.INFO;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductConflictImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModClientPackage.Literals.PRODUCT_CONFLICT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract EList<ProductSpaceElement> getAffectedProductSpaceElements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract Severity getSeverity();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Element> getAffectedElements() {
		return ECollections.unmodifiableEList(getAffectedProductSpaceElements());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SuperModClientPackage.PRODUCT_CONFLICT__AFFECTED_PRODUCT_SPACE_ELEMENTS:
				return getAffectedProductSpaceElements();
			case SuperModClientPackage.PRODUCT_CONFLICT__SEVERITY:
				return getSeverity();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SuperModClientPackage.PRODUCT_CONFLICT__AFFECTED_PRODUCT_SPACE_ELEMENTS:
				return !getAffectedProductSpaceElements().isEmpty();
			case SuperModClientPackage.PRODUCT_CONFLICT__SEVERITY:
				return getSeverity() != SEVERITY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //ProductConflictImpl
