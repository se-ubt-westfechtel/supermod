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
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.ubt.ai1.supermod.mm.core.Element;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.OptionExpr;
import de.ubt.ai1.supermod.mm.core.ProductDimension;
import de.ubt.ai1.supermod.mm.core.ProductSpace;
import de.ubt.ai1.supermod.mm.core.ProductSpaceElement;
import de.ubt.ai1.supermod.mm.core.SuperModCorePackage;
import de.ubt.ai1.supermod.mm.core.Tristate;
import de.ubt.ai1.supermod.mm.core.VisibilityEvaluationCache;
import de.ubt.ai1.supermod.mm.core.util.TristateUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Space Element</b></em>'.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-25
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.ProductSpaceElementImpl#getProductDimension <em>Product Dimension</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.ProductSpaceElementImpl#getProductSpace <em>Product Space</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.ProductSpaceElementImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.ProductSpaceElementImpl#getSuperProductSpaceElement <em>Super Product Space Element</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.ProductSpaceElementImpl#getSubProductSpaceElements <em>Sub Product Space Elements</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.ProductSpaceElementImpl#getAllSuperProductSpaceElements <em>All Super Product Space Elements</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.ProductSpaceElementImpl#getAllSubProductSpaceElements <em>All Sub Product Space Elements</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.ProductSpaceElementImpl#getCrossReferencedProductSpaceElements <em>Cross Referenced Product Space Elements</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.ProductSpaceElementImpl#getCrossReferencingProductSpaceElements <em>Cross Referencing Product Space Elements</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.ProductSpaceElementImpl#getHierarchicalVisibility <em>Hierarchical Visibility</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.ProductSpaceElementImpl#getSuperordinateVisibility <em>Superordinate Visibility</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ProductSpaceElementImpl extends ElementImpl implements ProductSpaceElement {
	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected OptionExpr visibility;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductSpaceElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModCorePackage.Literals.PRODUCT_SPACE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductDimension getProductDimension() {
		ProductDimension productDimension = basicGetProductDimension();
		return productDimension != null && productDimension.eIsProxy() ? (ProductDimension)eResolveProxy((InternalEObject)productDimension) : productDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ProductDimension basicGetProductDimension() {
		if (eContainer() instanceof ProductDimension) {
			return (ProductDimension) eContainer();
		}
		if (getSuperElement() != null) {
			return getSuperProductSpaceElement().getProductDimension();
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductSpace getProductSpace() {
		ProductSpace productSpace = basicGetProductSpace();
		return productSpace != null && productSpace.eIsProxy() ? (ProductSpace)eResolveProxy((InternalEObject)productSpace) : productSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ProductSpace basicGetProductSpace() {
		if (getProductDimension() == null) return null;
		return getProductDimension().getProductSpace();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionExpr getVisibility() {
		if (visibility != null && visibility.eIsProxy()) {
			InternalEObject oldVisibility = (InternalEObject)visibility;
			visibility = (OptionExpr)eResolveProxy(oldVisibility);
			if (visibility != oldVisibility) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SuperModCorePackage.PRODUCT_SPACE_ELEMENT__VISIBILITY, oldVisibility, visibility));
			}
		}
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionExpr basicGetVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(OptionExpr newVisibility) {
		OptionExpr oldVisibility = visibility;
		visibility = newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModCorePackage.PRODUCT_SPACE_ELEMENT__VISIBILITY, oldVisibility, visibility));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductSpaceElement getSuperProductSpaceElement() {
		ProductSpaceElement superProductSpaceElement = basicGetSuperProductSpaceElement();
		return superProductSpaceElement != null && superProductSpaceElement.eIsProxy() ? (ProductSpaceElement)eResolveProxy((InternalEObject)superProductSpaceElement) : superProductSpaceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract ProductSpaceElement basicGetSuperProductSpaceElement();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract EList<ProductSpaceElement> getSubProductSpaceElements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<ProductSpaceElement> getAllSuperProductSpaceElements() {
		EList<ProductSpaceElement> allSuperElements = ECollections.newBasicEList();
		if (getSuperProductSpaceElement() !=  null) {
			allSuperElements.add(getSuperProductSpaceElement());
			allSuperElements.addAll(getSuperProductSpaceElement().getAllSuperProductSpaceElements());
		}
		return ECollections.unmodifiableEList(allSuperElements);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<ProductSpaceElement> getAllSubProductSpaceElements() {
		EList<ProductSpaceElement> allSubElements = ECollections.newBasicEList();
		for (ProductSpaceElement subElement : getSubProductSpaceElements()) {
			allSubElements.add(subElement);
			allSubElements.addAll(subElement.getAllSubProductSpaceElements());
		}
		return ECollections.unmodifiableEList(allSubElements);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract EList<ProductSpaceElement> getCrossReferencedProductSpaceElements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract EList<ProductSpaceElement> getCrossReferencingProductSpaceElements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionExpr getHierarchicalVisibility() {
		OptionExpr hierarchicalVisibility = basicGetHierarchicalVisibility();
		return hierarchicalVisibility != null && hierarchicalVisibility.eIsProxy() ? (OptionExpr)eResolveProxy((InternalEObject)hierarchicalVisibility) : hierarchicalVisibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OptionExpr basicGetHierarchicalVisibility() {
		if (getVisibility() == null) {
			if (getSuperProductSpaceElement() == null) {
				return null;
			}
			else {
				return getSuperProductSpaceElement()
						.getHierarchicalVisibility();
			}
		}
		else {
			if (getSuperProductSpaceElement() == null || 
					getSuperProductSpaceElement()
						.getHierarchicalVisibility() == null) {
				return getVisibility().extract();
			}
			else {
				return getSuperProductSpaceElement()
						.getHierarchicalVisibility()
						.and(getVisibility().extract());
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionExpr getSuperordinateVisibility() {
		OptionExpr superordinateVisibility = basicGetSuperordinateVisibility();
		return superordinateVisibility != null && superordinateVisibility.eIsProxy() ? (OptionExpr)eResolveProxy((InternalEObject)superordinateVisibility) : superordinateVisibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OptionExpr basicGetSuperordinateVisibility() {
		ProductSpaceElement current = this;
		while (current != null) {
			if (current.getVisibility() != null) {
				return current.getVisibility();
			}
			current = current.getSuperProductSpaceElement();
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Tristate isVisible(OptionBinding binding, VisibilityEvaluationCache cache) {
		if (getVisibility() == null) return Tristate.TRUE;
		return getVisibility().apply(binding, cache);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Tristate isVisibleHierarchically(OptionBinding binding, VisibilityEvaluationCache cache) {
		Tristate state = Tristate.TRUE;
		for (ProductSpaceElement current = this; current != null; current = current.getSuperProductSpaceElement()) {
			state = TristateUtil.and(state, current.isVisible(binding, cache));
			if (state == Tristate.FALSE) break;
		}
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SuperModCorePackage.PRODUCT_SPACE_ELEMENT__PRODUCT_DIMENSION:
				if (resolve) return getProductDimension();
				return basicGetProductDimension();
			case SuperModCorePackage.PRODUCT_SPACE_ELEMENT__PRODUCT_SPACE:
				if (resolve) return getProductSpace();
				return basicGetProductSpace();
			case SuperModCorePackage.PRODUCT_SPACE_ELEMENT__VISIBILITY:
				if (resolve) return getVisibility();
				return basicGetVisibility();
			case SuperModCorePackage.PRODUCT_SPACE_ELEMENT__SUPER_PRODUCT_SPACE_ELEMENT:
				if (resolve) return getSuperProductSpaceElement();
				return basicGetSuperProductSpaceElement();
			case SuperModCorePackage.PRODUCT_SPACE_ELEMENT__SUB_PRODUCT_SPACE_ELEMENTS:
				return getSubProductSpaceElements();
			case SuperModCorePackage.PRODUCT_SPACE_ELEMENT__ALL_SUPER_PRODUCT_SPACE_ELEMENTS:
				return getAllSuperProductSpaceElements();
			case SuperModCorePackage.PRODUCT_SPACE_ELEMENT__ALL_SUB_PRODUCT_SPACE_ELEMENTS:
				return getAllSubProductSpaceElements();
			case SuperModCorePackage.PRODUCT_SPACE_ELEMENT__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS:
				return getCrossReferencedProductSpaceElements();
			case SuperModCorePackage.PRODUCT_SPACE_ELEMENT__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS:
				return getCrossReferencingProductSpaceElements();
			case SuperModCorePackage.PRODUCT_SPACE_ELEMENT__HIERARCHICAL_VISIBILITY:
				if (resolve) return getHierarchicalVisibility();
				return basicGetHierarchicalVisibility();
			case SuperModCorePackage.PRODUCT_SPACE_ELEMENT__SUPERORDINATE_VISIBILITY:
				if (resolve) return getSuperordinateVisibility();
				return basicGetSuperordinateVisibility();
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
			case SuperModCorePackage.PRODUCT_SPACE_ELEMENT__VISIBILITY:
				setVisibility((OptionExpr)newValue);
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
			case SuperModCorePackage.PRODUCT_SPACE_ELEMENT__VISIBILITY:
				setVisibility((OptionExpr)null);
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
			case SuperModCorePackage.PRODUCT_SPACE_ELEMENT__PRODUCT_DIMENSION:
				return basicGetProductDimension() != null;
			case SuperModCorePackage.PRODUCT_SPACE_ELEMENT__PRODUCT_SPACE:
				return basicGetProductSpace() != null;
			case SuperModCorePackage.PRODUCT_SPACE_ELEMENT__VISIBILITY:
				return visibility != null;
			case SuperModCorePackage.PRODUCT_SPACE_ELEMENT__SUPER_PRODUCT_SPACE_ELEMENT:
				return basicGetSuperProductSpaceElement() != null;
			case SuperModCorePackage.PRODUCT_SPACE_ELEMENT__SUB_PRODUCT_SPACE_ELEMENTS:
				return !getSubProductSpaceElements().isEmpty();
			case SuperModCorePackage.PRODUCT_SPACE_ELEMENT__ALL_SUPER_PRODUCT_SPACE_ELEMENTS:
				return !getAllSuperProductSpaceElements().isEmpty();
			case SuperModCorePackage.PRODUCT_SPACE_ELEMENT__ALL_SUB_PRODUCT_SPACE_ELEMENTS:
				return !getAllSubProductSpaceElements().isEmpty();
			case SuperModCorePackage.PRODUCT_SPACE_ELEMENT__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS:
				return !getCrossReferencedProductSpaceElements().isEmpty();
			case SuperModCorePackage.PRODUCT_SPACE_ELEMENT__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS:
				return !getCrossReferencingProductSpaceElements().isEmpty();
			case SuperModCorePackage.PRODUCT_SPACE_ELEMENT__HIERARCHICAL_VISIBILITY:
				return basicGetHierarchicalVisibility() != null;
			case SuperModCorePackage.PRODUCT_SPACE_ELEMENT__SUPERORDINATE_VISIBILITY:
				return basicGetSuperordinateVisibility() != null;
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
			case SuperModCorePackage.PRODUCT_SPACE_ELEMENT___IS_VISIBLE__OPTIONBINDING_VISIBILITYEVALUATIONCACHE:
				return isVisible((OptionBinding)arguments.get(0), (VisibilityEvaluationCache)arguments.get(1));
			case SuperModCorePackage.PRODUCT_SPACE_ELEMENT___IS_VISIBLE_HIERARCHICALLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE:
				return isVisibleHierarchically((OptionBinding)arguments.get(0), (VisibilityEvaluationCache)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}
	
	@Override
	public EList<Element> getSubElements() {
		return ECollections.unmodifiableEList(getSubProductSpaceElements());
	}
	
	@Override
	public Element basicGetSuperElement() {
		return getSuperProductSpaceElement();
	}
	
	@Override
	public EList<Element> getCrossReferencedElements() {
		return ECollections.unmodifiableEList(getCrossReferencedProductSpaceElements());
	}

	@Override
	public EList<Element> getCrossReferencingElements() {
		return ECollections.unmodifiableEList(getCrossReferencingProductSpaceElements());
	}
	
} //VersionedElementImpl
