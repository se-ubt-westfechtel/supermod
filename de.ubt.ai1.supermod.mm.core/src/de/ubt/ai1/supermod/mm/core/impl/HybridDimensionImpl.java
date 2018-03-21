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

import de.ubt.ai1.supermod.mm.core.Element;
import de.ubt.ai1.supermod.mm.core.HybridDimension;
import de.ubt.ai1.supermod.mm.core.HybridElement;
import de.ubt.ai1.supermod.mm.core.ProductDimension;
import de.ubt.ai1.supermod.mm.core.ProductSpace;
import de.ubt.ai1.supermod.mm.core.ProductSpaceElement;
import de.ubt.ai1.supermod.mm.core.SuperModCorePackage;
import de.ubt.ai1.supermod.mm.core.VersionSpaceElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hybrid Dimension</b></em>'.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-25
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.HybridDimensionImpl#getRootProductSpaceElements <em>Root Product Space Elements</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.HybridDimensionImpl#getAllProductSpaceElements <em>All Product Space Elements</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.HybridDimensionImpl#getProductSpace <em>Product Space</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.HybridDimensionImpl#getRootHybridElements <em>Root Hybrid Elements</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.HybridDimensionImpl#getAllHybridElements <em>All Hybrid Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class HybridDimensionImpl extends VersionDimensionImpl implements HybridDimension {
	/**
	 * The cached value of the '{@link #getProductSpace() <em>Product Space</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductSpace()
	 * @generated
	 * @ordered
	 */
	protected ProductSpace productSpace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HybridDimensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModCorePackage.Literals.HYBRID_DIMENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<ProductSpaceElement> getAllProductSpaceElements() {
		EList<ProductSpaceElement> allPsElements = ECollections.newBasicEList();
		for (ProductSpaceElement psElement : getRootProductSpaceElements()) {
			allPsElements.add(psElement);
			allPsElements.addAll(psElement.getAllSubProductSpaceElements());
		}
		return ECollections.unmodifiableEList(allPsElements);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductSpace getProductSpace() {
		if (productSpace != null && productSpace.eIsProxy()) {
			InternalEObject oldProductSpace = (InternalEObject)productSpace;
			productSpace = (ProductSpace)eResolveProxy(oldProductSpace);
			if (productSpace != oldProductSpace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SuperModCorePackage.HYBRID_DIMENSION__PRODUCT_SPACE, oldProductSpace, productSpace));
			}
		}
		return productSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductSpace basicGetProductSpace() {
		return productSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProductSpace(ProductSpace newProductSpace, NotificationChain msgs) {
		ProductSpace oldProductSpace = productSpace;
		productSpace = newProductSpace;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SuperModCorePackage.HYBRID_DIMENSION__PRODUCT_SPACE, oldProductSpace, newProductSpace);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductSpace(ProductSpace newProductSpace) {
		if (newProductSpace != productSpace) {
			NotificationChain msgs = null;
			if (productSpace != null)
				msgs = ((InternalEObject)productSpace).eInverseRemove(this, SuperModCorePackage.PRODUCT_SPACE__DIMENSIONS, ProductSpace.class, msgs);
			if (newProductSpace != null)
				msgs = ((InternalEObject)newProductSpace).eInverseAdd(this, SuperModCorePackage.PRODUCT_SPACE__DIMENSIONS, ProductSpace.class, msgs);
			msgs = basicSetProductSpace(newProductSpace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModCorePackage.HYBRID_DIMENSION__PRODUCT_SPACE, newProductSpace, newProductSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract EList<HybridElement> getRootHybridElements();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<HybridElement> getAllHybridElements() {
		EList<HybridElement> hybridElements = ECollections.newBasicEList();
		for (HybridElement root : getRootHybridElements()) {
			hybridElements.add(root);
			hybridElements.addAll(root.getAllSubHybridElements());
		}
		return ECollections.unmodifiableEList(hybridElements);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SuperModCorePackage.HYBRID_DIMENSION__PRODUCT_SPACE:
				if (productSpace != null)
					msgs = ((InternalEObject)productSpace).eInverseRemove(this, SuperModCorePackage.PRODUCT_SPACE__DIMENSIONS, ProductSpace.class, msgs);
				return basicSetProductSpace((ProductSpace)otherEnd, msgs);
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
			case SuperModCorePackage.HYBRID_DIMENSION__PRODUCT_SPACE:
				return basicSetProductSpace(null, msgs);
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
			case SuperModCorePackage.HYBRID_DIMENSION__ROOT_PRODUCT_SPACE_ELEMENTS:
				return getRootProductSpaceElements();
			case SuperModCorePackage.HYBRID_DIMENSION__ALL_PRODUCT_SPACE_ELEMENTS:
				return getAllProductSpaceElements();
			case SuperModCorePackage.HYBRID_DIMENSION__PRODUCT_SPACE:
				if (resolve) return getProductSpace();
				return basicGetProductSpace();
			case SuperModCorePackage.HYBRID_DIMENSION__ROOT_HYBRID_ELEMENTS:
				return getRootHybridElements();
			case SuperModCorePackage.HYBRID_DIMENSION__ALL_HYBRID_ELEMENTS:
				return getAllHybridElements();
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
			case SuperModCorePackage.HYBRID_DIMENSION__PRODUCT_SPACE:
				setProductSpace((ProductSpace)newValue);
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
			case SuperModCorePackage.HYBRID_DIMENSION__PRODUCT_SPACE:
				setProductSpace((ProductSpace)null);
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
			case SuperModCorePackage.HYBRID_DIMENSION__ROOT_PRODUCT_SPACE_ELEMENTS:
				return !getRootProductSpaceElements().isEmpty();
			case SuperModCorePackage.HYBRID_DIMENSION__ALL_PRODUCT_SPACE_ELEMENTS:
				return !getAllProductSpaceElements().isEmpty();
			case SuperModCorePackage.HYBRID_DIMENSION__PRODUCT_SPACE:
				return productSpace != null;
			case SuperModCorePackage.HYBRID_DIMENSION__ROOT_HYBRID_ELEMENTS:
				return !getRootHybridElements().isEmpty();
			case SuperModCorePackage.HYBRID_DIMENSION__ALL_HYBRID_ELEMENTS:
				return !getAllHybridElements().isEmpty();
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
		if (baseClass == ProductDimension.class) {
			switch (derivedFeatureID) {
				case SuperModCorePackage.HYBRID_DIMENSION__ROOT_PRODUCT_SPACE_ELEMENTS: return SuperModCorePackage.PRODUCT_DIMENSION__ROOT_PRODUCT_SPACE_ELEMENTS;
				case SuperModCorePackage.HYBRID_DIMENSION__ALL_PRODUCT_SPACE_ELEMENTS: return SuperModCorePackage.PRODUCT_DIMENSION__ALL_PRODUCT_SPACE_ELEMENTS;
				case SuperModCorePackage.HYBRID_DIMENSION__PRODUCT_SPACE: return SuperModCorePackage.PRODUCT_DIMENSION__PRODUCT_SPACE;
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
		if (baseClass == ProductDimension.class) {
			switch (baseFeatureID) {
				case SuperModCorePackage.PRODUCT_DIMENSION__ROOT_PRODUCT_SPACE_ELEMENTS: return SuperModCorePackage.HYBRID_DIMENSION__ROOT_PRODUCT_SPACE_ELEMENTS;
				case SuperModCorePackage.PRODUCT_DIMENSION__ALL_PRODUCT_SPACE_ELEMENTS: return SuperModCorePackage.HYBRID_DIMENSION__ALL_PRODUCT_SPACE_ELEMENTS;
				case SuperModCorePackage.PRODUCT_DIMENSION__PRODUCT_SPACE: return SuperModCorePackage.HYBRID_DIMENSION__PRODUCT_SPACE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}
	
	@Override
	public EList<Element> getRootElements() {
		return ECollections.unmodifiableEList(getRootHybridElements());
	}
	
	@Override
	public EList<VersionSpaceElement> getRootVersionSpaceElements() {
		return ECollections.unmodifiableEList(getRootHybridElements());
	}
	
	@Override
	public EList<ProductSpaceElement> getRootProductSpaceElements() {
		return ECollections.unmodifiableEList(getRootHybridElements());
	}

} //HybridDimensionImpl
