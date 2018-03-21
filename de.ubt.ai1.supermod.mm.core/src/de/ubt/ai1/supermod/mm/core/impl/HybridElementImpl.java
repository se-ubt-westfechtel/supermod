/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.core.impl;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import de.ubt.ai1.supermod.mm.core.Element;
import de.ubt.ai1.supermod.mm.core.HybridElement;
import de.ubt.ai1.supermod.mm.core.ProductSpaceElement;
import de.ubt.ai1.supermod.mm.core.RuleBaseElement;
import de.ubt.ai1.supermod.mm.core.SuperModCorePackage;
import de.ubt.ai1.supermod.mm.core.VersionDimension;
import de.ubt.ai1.supermod.mm.core.VersionSpace;
import de.ubt.ai1.supermod.mm.core.VersionSpaceElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hybrid Element</b></em>'.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-25
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.HybridElementImpl#getVersionDimension <em>Version Dimension</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.HybridElementImpl#getVersionSpace <em>Version Space</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.HybridElementImpl#getSuperVersionSpaceElement <em>Super Version Space Element</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.HybridElementImpl#getSubVersionSpaceElements <em>Sub Version Space Elements</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.HybridElementImpl#getAllSuperVersionSpaceElements <em>All Super Version Space Elements</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.HybridElementImpl#getAllSubVersionSpaceElements <em>All Sub Version Space Elements</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.HybridElementImpl#getCrossReferencedVersionSpaceElements <em>Cross Referenced Version Space Elements</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.HybridElementImpl#getCrossReferencingVersionSpaceElements <em>Cross Referencing Version Space Elements</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.HybridElementImpl#getLowLevelConcepts <em>Low Level Concepts</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.HybridElementImpl#getSuperHybridElement <em>Super Hybrid Element</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.HybridElementImpl#getSubHybridElements <em>Sub Hybrid Elements</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.HybridElementImpl#getAllSuperHybridElements <em>All Super Hybrid Elements</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.HybridElementImpl#getAllSubHybridElements <em>All Sub Hybrid Elements</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.HybridElementImpl#getCrossReferencedHybridElements <em>Cross Referenced Hybrid Elements</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.HybridElementImpl#getCrossReferencingHybridElements <em>Cross Referencing Hybrid Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class HybridElementImpl extends ProductSpaceElementImpl implements HybridElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HybridElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModCorePackage.Literals.HYBRID_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionDimension getVersionDimension() {
		VersionDimension versionDimension = basicGetVersionDimension();
		return versionDimension != null && versionDimension.eIsProxy() ? (VersionDimension)eResolveProxy((InternalEObject)versionDimension) : versionDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public VersionDimension basicGetVersionDimension() {
		if (eContainer() instanceof VersionDimension) {
			return (VersionDimension) eContainer();
		}
		if (getSuperElement() != null) {
			return getSuperVersionSpaceElement().getVersionDimension();
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionSpace getVersionSpace() {
		VersionSpace versionSpace = basicGetVersionSpace();
		return versionSpace != null && versionSpace.eIsProxy() ? (VersionSpace)eResolveProxy((InternalEObject)versionSpace) : versionSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public VersionSpace basicGetVersionSpace() {
		return getVersionDimension().getVersionSpace();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionSpaceElement getSuperVersionSpaceElement() {
		VersionSpaceElement superVersionSpaceElement = basicGetSuperVersionSpaceElement();
		return superVersionSpaceElement != null && superVersionSpaceElement.eIsProxy() ? (VersionSpaceElement)eResolveProxy((InternalEObject)superVersionSpaceElement) : superVersionSpaceElement;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public VersionSpaceElement basicGetSuperVersionSpaceElement() {
		return getSuperHybridElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<VersionSpaceElement> getAllSuperVersionSpaceElements() {
		EList<VersionSpaceElement> allSuperElements = ECollections.newBasicEList();
		if (getSuperVersionSpaceElement() !=  null) {
			allSuperElements.add(getSuperVersionSpaceElement());
			allSuperElements.addAll(getSuperVersionSpaceElement().getAllSuperVersionSpaceElements());
		}
		return ECollections.unmodifiableEList(allSuperElements);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<VersionSpaceElement> getAllSubVersionSpaceElements() {
		EList<VersionSpaceElement> allSubElements = ECollections.newBasicEList();
		for (VersionSpaceElement subElement : getSubVersionSpaceElements()) {
			allSubElements.add(subElement);
			allSubElements.addAll(subElement.getAllSubVersionSpaceElements());
		}
		return ECollections.unmodifiableEList(allSubElements);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract EList<RuleBaseElement> getLowLevelConcepts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HybridElement getSuperHybridElement() {
		HybridElement superHybridElement = basicGetSuperHybridElement();
		return superHybridElement != null && superHybridElement.eIsProxy() ? (HybridElement)eResolveProxy((InternalEObject)superHybridElement) : superHybridElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract HybridElement basicGetSuperHybridElement();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract EList<HybridElement> getSubHybridElements();
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<HybridElement> getAllSuperHybridElements() {
		EList<HybridElement> allSuperHybridElements = ECollections.newBasicEList();
		if (getSuperHybridElement() != null) {
			allSuperHybridElements.add(getSuperHybridElement());
			allSuperHybridElements.addAll(getSuperHybridElement().getAllSuperHybridElements());
		}
		return ECollections.unmodifiableEList(allSuperHybridElements);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<HybridElement> getAllSubHybridElements() {
		EList<HybridElement> allSubHybridElements = ECollections.newBasicEList();
		for (HybridElement subElement : getSubHybridElements()) {
			allSubHybridElements.add(subElement);
			allSubHybridElements.addAll(subElement.getAllSubHybridElements());
		}
		return ECollections.unmodifiableEList(allSubHybridElements);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract EList<HybridElement> getCrossReferencedHybridElements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract EList<HybridElement> getCrossReferencingHybridElements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SuperModCorePackage.HYBRID_ELEMENT__VERSION_DIMENSION:
				if (resolve) return getVersionDimension();
				return basicGetVersionDimension();
			case SuperModCorePackage.HYBRID_ELEMENT__VERSION_SPACE:
				if (resolve) return getVersionSpace();
				return basicGetVersionSpace();
			case SuperModCorePackage.HYBRID_ELEMENT__SUPER_VERSION_SPACE_ELEMENT:
				if (resolve) return getSuperVersionSpaceElement();
				return basicGetSuperVersionSpaceElement();
			case SuperModCorePackage.HYBRID_ELEMENT__SUB_VERSION_SPACE_ELEMENTS:
				return getSubVersionSpaceElements();
			case SuperModCorePackage.HYBRID_ELEMENT__ALL_SUPER_VERSION_SPACE_ELEMENTS:
				return getAllSuperVersionSpaceElements();
			case SuperModCorePackage.HYBRID_ELEMENT__ALL_SUB_VERSION_SPACE_ELEMENTS:
				return getAllSubVersionSpaceElements();
			case SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCED_VERSION_SPACE_ELEMENTS:
				return getCrossReferencedVersionSpaceElements();
			case SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCING_VERSION_SPACE_ELEMENTS:
				return getCrossReferencingVersionSpaceElements();
			case SuperModCorePackage.HYBRID_ELEMENT__LOW_LEVEL_CONCEPTS:
				return getLowLevelConcepts();
			case SuperModCorePackage.HYBRID_ELEMENT__SUPER_HYBRID_ELEMENT:
				if (resolve) return getSuperHybridElement();
				return basicGetSuperHybridElement();
			case SuperModCorePackage.HYBRID_ELEMENT__SUB_HYBRID_ELEMENTS:
				return getSubHybridElements();
			case SuperModCorePackage.HYBRID_ELEMENT__ALL_SUPER_HYBRID_ELEMENTS:
				return getAllSuperHybridElements();
			case SuperModCorePackage.HYBRID_ELEMENT__ALL_SUB_HYBRID_ELEMENTS:
				return getAllSubHybridElements();
			case SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCED_HYBRID_ELEMENTS:
				return getCrossReferencedHybridElements();
			case SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCING_HYBRID_ELEMENTS:
				return getCrossReferencingHybridElements();
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
			case SuperModCorePackage.HYBRID_ELEMENT__VERSION_DIMENSION:
				return basicGetVersionDimension() != null;
			case SuperModCorePackage.HYBRID_ELEMENT__VERSION_SPACE:
				return basicGetVersionSpace() != null;
			case SuperModCorePackage.HYBRID_ELEMENT__SUPER_VERSION_SPACE_ELEMENT:
				return basicGetSuperVersionSpaceElement() != null;
			case SuperModCorePackage.HYBRID_ELEMENT__SUB_VERSION_SPACE_ELEMENTS:
				return !getSubVersionSpaceElements().isEmpty();
			case SuperModCorePackage.HYBRID_ELEMENT__ALL_SUPER_VERSION_SPACE_ELEMENTS:
				return !getAllSuperVersionSpaceElements().isEmpty();
			case SuperModCorePackage.HYBRID_ELEMENT__ALL_SUB_VERSION_SPACE_ELEMENTS:
				return !getAllSubVersionSpaceElements().isEmpty();
			case SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCED_VERSION_SPACE_ELEMENTS:
				return !getCrossReferencedVersionSpaceElements().isEmpty();
			case SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCING_VERSION_SPACE_ELEMENTS:
				return !getCrossReferencingVersionSpaceElements().isEmpty();
			case SuperModCorePackage.HYBRID_ELEMENT__LOW_LEVEL_CONCEPTS:
				return !getLowLevelConcepts().isEmpty();
			case SuperModCorePackage.HYBRID_ELEMENT__SUPER_HYBRID_ELEMENT:
				return basicGetSuperHybridElement() != null;
			case SuperModCorePackage.HYBRID_ELEMENT__SUB_HYBRID_ELEMENTS:
				return !getSubHybridElements().isEmpty();
			case SuperModCorePackage.HYBRID_ELEMENT__ALL_SUPER_HYBRID_ELEMENTS:
				return !getAllSuperHybridElements().isEmpty();
			case SuperModCorePackage.HYBRID_ELEMENT__ALL_SUB_HYBRID_ELEMENTS:
				return !getAllSubHybridElements().isEmpty();
			case SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCED_HYBRID_ELEMENTS:
				return !getCrossReferencedHybridElements().isEmpty();
			case SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCING_HYBRID_ELEMENTS:
				return !getCrossReferencingHybridElements().isEmpty();
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
		if (baseClass == VersionSpaceElement.class) {
			switch (derivedFeatureID) {
				case SuperModCorePackage.HYBRID_ELEMENT__VERSION_DIMENSION: return SuperModCorePackage.VERSION_SPACE_ELEMENT__VERSION_DIMENSION;
				case SuperModCorePackage.HYBRID_ELEMENT__VERSION_SPACE: return SuperModCorePackage.VERSION_SPACE_ELEMENT__VERSION_SPACE;
				case SuperModCorePackage.HYBRID_ELEMENT__SUPER_VERSION_SPACE_ELEMENT: return SuperModCorePackage.VERSION_SPACE_ELEMENT__SUPER_VERSION_SPACE_ELEMENT;
				case SuperModCorePackage.HYBRID_ELEMENT__SUB_VERSION_SPACE_ELEMENTS: return SuperModCorePackage.VERSION_SPACE_ELEMENT__SUB_VERSION_SPACE_ELEMENTS;
				case SuperModCorePackage.HYBRID_ELEMENT__ALL_SUPER_VERSION_SPACE_ELEMENTS: return SuperModCorePackage.VERSION_SPACE_ELEMENT__ALL_SUPER_VERSION_SPACE_ELEMENTS;
				case SuperModCorePackage.HYBRID_ELEMENT__ALL_SUB_VERSION_SPACE_ELEMENTS: return SuperModCorePackage.VERSION_SPACE_ELEMENT__ALL_SUB_VERSION_SPACE_ELEMENTS;
				case SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCED_VERSION_SPACE_ELEMENTS: return SuperModCorePackage.VERSION_SPACE_ELEMENT__CROSS_REFERENCED_VERSION_SPACE_ELEMENTS;
				case SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCING_VERSION_SPACE_ELEMENTS: return SuperModCorePackage.VERSION_SPACE_ELEMENT__CROSS_REFERENCING_VERSION_SPACE_ELEMENTS;
				case SuperModCorePackage.HYBRID_ELEMENT__LOW_LEVEL_CONCEPTS: return SuperModCorePackage.VERSION_SPACE_ELEMENT__LOW_LEVEL_CONCEPTS;
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
		if (baseClass == VersionSpaceElement.class) {
			switch (baseFeatureID) {
				case SuperModCorePackage.VERSION_SPACE_ELEMENT__VERSION_DIMENSION: return SuperModCorePackage.HYBRID_ELEMENT__VERSION_DIMENSION;
				case SuperModCorePackage.VERSION_SPACE_ELEMENT__VERSION_SPACE: return SuperModCorePackage.HYBRID_ELEMENT__VERSION_SPACE;
				case SuperModCorePackage.VERSION_SPACE_ELEMENT__SUPER_VERSION_SPACE_ELEMENT: return SuperModCorePackage.HYBRID_ELEMENT__SUPER_VERSION_SPACE_ELEMENT;
				case SuperModCorePackage.VERSION_SPACE_ELEMENT__SUB_VERSION_SPACE_ELEMENTS: return SuperModCorePackage.HYBRID_ELEMENT__SUB_VERSION_SPACE_ELEMENTS;
				case SuperModCorePackage.VERSION_SPACE_ELEMENT__ALL_SUPER_VERSION_SPACE_ELEMENTS: return SuperModCorePackage.HYBRID_ELEMENT__ALL_SUPER_VERSION_SPACE_ELEMENTS;
				case SuperModCorePackage.VERSION_SPACE_ELEMENT__ALL_SUB_VERSION_SPACE_ELEMENTS: return SuperModCorePackage.HYBRID_ELEMENT__ALL_SUB_VERSION_SPACE_ELEMENTS;
				case SuperModCorePackage.VERSION_SPACE_ELEMENT__CROSS_REFERENCED_VERSION_SPACE_ELEMENTS: return SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCED_VERSION_SPACE_ELEMENTS;
				case SuperModCorePackage.VERSION_SPACE_ELEMENT__CROSS_REFERENCING_VERSION_SPACE_ELEMENTS: return SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCING_VERSION_SPACE_ELEMENTS;
				case SuperModCorePackage.VERSION_SPACE_ELEMENT__LOW_LEVEL_CONCEPTS: return SuperModCorePackage.HYBRID_ELEMENT__LOW_LEVEL_CONCEPTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}
	
	@Override
	public Element basicGetSuperElement() {
		return getSuperHybridElement();
	}
	
	@Override
	public EList<Element> getSubElements() {
		return ECollections.unmodifiableEList(getSubHybridElements());
	}
	
	@Override
	public EList<Element> getCrossReferencedElements() {
		return ECollections.unmodifiableEList(getCrossReferencedHybridElements());
	}
	
	@Override
	public ProductSpaceElement basicGetSuperProductSpaceElement() {
		return getSuperHybridElement();
	}
	
	@Override
	public EList<ProductSpaceElement> getSubProductSpaceElements() {
		return ECollections.unmodifiableEList(getSubHybridElements());
	}
	
	@Override
	public EList<ProductSpaceElement> getCrossReferencedProductSpaceElements() {
		return ECollections.unmodifiableEList(getCrossReferencedHybridElements());
	}

	@Override
	public EList<ProductSpaceElement> getCrossReferencingProductSpaceElements() {
		return ECollections.unmodifiableEList(getCrossReferencingHybridElements());
	}
	
	@Override
	public EList<VersionSpaceElement> getSubVersionSpaceElements() {
		return ECollections.unmodifiableEList(getSubHybridElements());
	}
	
	@Override
	public EList<VersionSpaceElement> getCrossReferencedVersionSpaceElements() {
		return ECollections.unmodifiableEList(getCrossReferencedHybridElements());
	}

	@Override
	public EList<VersionSpaceElement> getCrossReferencingVersionSpaceElements() {
		return ECollections.unmodifiableEList(getCrossReferencingHybridElements());
	}	
	
} //HybridElementImpl
