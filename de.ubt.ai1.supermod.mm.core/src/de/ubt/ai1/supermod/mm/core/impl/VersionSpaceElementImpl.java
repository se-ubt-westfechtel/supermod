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
import de.ubt.ai1.supermod.mm.core.RuleBaseElement;
import de.ubt.ai1.supermod.mm.core.SuperModCorePackage;
import de.ubt.ai1.supermod.mm.core.VersionDimension;
import de.ubt.ai1.supermod.mm.core.VersionSpace;
import de.ubt.ai1.supermod.mm.core.VersionSpaceElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Version Space Element</b></em>'.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-25
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.VersionSpaceElementImpl#getVersionDimension <em>Version Dimension</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.VersionSpaceElementImpl#getVersionSpace <em>Version Space</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.VersionSpaceElementImpl#getSuperVersionSpaceElement <em>Super Version Space Element</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.VersionSpaceElementImpl#getSubVersionSpaceElements <em>Sub Version Space Elements</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.VersionSpaceElementImpl#getAllSuperVersionSpaceElements <em>All Super Version Space Elements</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.VersionSpaceElementImpl#getAllSubVersionSpaceElements <em>All Sub Version Space Elements</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.VersionSpaceElementImpl#getCrossReferencedVersionSpaceElements <em>Cross Referenced Version Space Elements</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.VersionSpaceElementImpl#getCrossReferencingVersionSpaceElements <em>Cross Referencing Version Space Elements</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.VersionSpaceElementImpl#getLowLevelConcepts <em>Low Level Concepts</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class VersionSpaceElementImpl extends ElementImpl implements VersionSpaceElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VersionSpaceElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModCorePackage.Literals.VERSION_SPACE_ELEMENT;
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
	public abstract VersionSpaceElement basicGetSuperVersionSpaceElement();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract EList<VersionSpaceElement> getSubVersionSpaceElements();
	
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
	public abstract EList<VersionSpaceElement> getCrossReferencedVersionSpaceElements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract EList<VersionSpaceElement> getCrossReferencingVersionSpaceElements();

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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SuperModCorePackage.VERSION_SPACE_ELEMENT__VERSION_DIMENSION:
				if (resolve) return getVersionDimension();
				return basicGetVersionDimension();
			case SuperModCorePackage.VERSION_SPACE_ELEMENT__VERSION_SPACE:
				if (resolve) return getVersionSpace();
				return basicGetVersionSpace();
			case SuperModCorePackage.VERSION_SPACE_ELEMENT__SUPER_VERSION_SPACE_ELEMENT:
				if (resolve) return getSuperVersionSpaceElement();
				return basicGetSuperVersionSpaceElement();
			case SuperModCorePackage.VERSION_SPACE_ELEMENT__SUB_VERSION_SPACE_ELEMENTS:
				return getSubVersionSpaceElements();
			case SuperModCorePackage.VERSION_SPACE_ELEMENT__ALL_SUPER_VERSION_SPACE_ELEMENTS:
				return getAllSuperVersionSpaceElements();
			case SuperModCorePackage.VERSION_SPACE_ELEMENT__ALL_SUB_VERSION_SPACE_ELEMENTS:
				return getAllSubVersionSpaceElements();
			case SuperModCorePackage.VERSION_SPACE_ELEMENT__CROSS_REFERENCED_VERSION_SPACE_ELEMENTS:
				return getCrossReferencedVersionSpaceElements();
			case SuperModCorePackage.VERSION_SPACE_ELEMENT__CROSS_REFERENCING_VERSION_SPACE_ELEMENTS:
				return getCrossReferencingVersionSpaceElements();
			case SuperModCorePackage.VERSION_SPACE_ELEMENT__LOW_LEVEL_CONCEPTS:
				return getLowLevelConcepts();
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
			case SuperModCorePackage.VERSION_SPACE_ELEMENT__VERSION_DIMENSION:
				return basicGetVersionDimension() != null;
			case SuperModCorePackage.VERSION_SPACE_ELEMENT__VERSION_SPACE:
				return basicGetVersionSpace() != null;
			case SuperModCorePackage.VERSION_SPACE_ELEMENT__SUPER_VERSION_SPACE_ELEMENT:
				return basicGetSuperVersionSpaceElement() != null;
			case SuperModCorePackage.VERSION_SPACE_ELEMENT__SUB_VERSION_SPACE_ELEMENTS:
				return !getSubVersionSpaceElements().isEmpty();
			case SuperModCorePackage.VERSION_SPACE_ELEMENT__ALL_SUPER_VERSION_SPACE_ELEMENTS:
				return !getAllSuperVersionSpaceElements().isEmpty();
			case SuperModCorePackage.VERSION_SPACE_ELEMENT__ALL_SUB_VERSION_SPACE_ELEMENTS:
				return !getAllSubVersionSpaceElements().isEmpty();
			case SuperModCorePackage.VERSION_SPACE_ELEMENT__CROSS_REFERENCED_VERSION_SPACE_ELEMENTS:
				return !getCrossReferencedVersionSpaceElements().isEmpty();
			case SuperModCorePackage.VERSION_SPACE_ELEMENT__CROSS_REFERENCING_VERSION_SPACE_ELEMENTS:
				return !getCrossReferencingVersionSpaceElements().isEmpty();
			case SuperModCorePackage.VERSION_SPACE_ELEMENT__LOW_LEVEL_CONCEPTS:
				return !getLowLevelConcepts().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public Element basicGetSuperElement() {
		return getSuperVersionSpaceElement();
	}
	
	@Override
	public EList<Element> getSubElements() {
		return ECollections.unmodifiableEList(getSubVersionSpaceElements());
	}
	
	@Override
	public EList<Element> getCrossReferencedElements() {
		return ECollections.unmodifiableEList(getCrossReferencedVersionSpaceElements());
	}

	@Override
	public EList<Element> getCrossReferencingElements() {
		return ECollections.unmodifiableEList(getCrossReferencingVersionSpaceElements());
	}
	
} //VersionSpaceElementImpl
