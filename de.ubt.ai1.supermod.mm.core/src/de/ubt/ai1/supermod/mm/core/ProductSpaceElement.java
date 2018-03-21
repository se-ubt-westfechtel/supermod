/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Space Element</b></em>'.
 * A product space element is a SuperMod element part of a product dimension. It is
 * connected to the version space by means of a <em>visibility</em> represented by
 * an option expression.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-25
 * @see		{@link ProductDimension}
 * @see		{@link ProductSpace}
 * @see		{@link OptionExpr}
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.ProductSpaceElement#getProductDimension <em>Product Dimension</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.ProductSpaceElement#getProductSpace <em>Product Space</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.ProductSpaceElement#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.ProductSpaceElement#getSuperProductSpaceElement <em>Super Product Space Element</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.ProductSpaceElement#getSubProductSpaceElements <em>Sub Product Space Elements</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.ProductSpaceElement#getAllSuperProductSpaceElements <em>All Super Product Space Elements</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.ProductSpaceElement#getAllSubProductSpaceElements <em>All Sub Product Space Elements</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.ProductSpaceElement#getCrossReferencedProductSpaceElements <em>Cross Referenced Product Space Elements</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.ProductSpaceElement#getCrossReferencingProductSpaceElements <em>Cross Referencing Product Space Elements</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.ProductSpaceElement#getHierarchicalVisibility <em>Hierarchical Visibility</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.ProductSpaceElement#getSuperordinateVisibility <em>Superordinate Visibility</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getProductSpaceElement()
 * @model abstract="true"
 * @generated
 */
public interface ProductSpaceElement extends Element {
	/**
	 * Returns the value of the '<em><b>Product Dimension</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.core.ProductDimension#getAllProductSpaceElements <em>All Product Space Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The product dimension this element belongs to.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Dimension</em>' reference.
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getProductSpaceElement_ProductDimension()
	 * @see de.ubt.ai1.supermod.mm.core.ProductDimension#getAllProductSpaceElements
	 * @model opposite="allProductSpaceElements" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	ProductDimension getProductDimension();

	/**
	 * Returns the value of the '<em><b>Product Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The product space this element belongs to.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Space</em>' reference.
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getProductSpaceElement_ProductSpace()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	ProductSpace getProductSpace();

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The visibility that is attached to this product space element. If no visibility
	 * is defined here, a visibility of <code>true</code> is implicitly assumed.
	 * The visibility of a product space element is shadowed by the visibility of its
	 * parent element, i.e. visibility is propagated hierarchically top-down by an
	 * implicit and-conjunction.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' reference.
	 * @see #setVisibility(OptionExpr)
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getProductSpaceElement_Visibility()
	 * @model
	 * @generated
	 */
	OptionExpr getVisibility();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.core.ProductSpaceElement#getVisibility <em>Visibility</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' reference.
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(OptionExpr value);

	/**
	 * Returns the value of the '<em><b>Super Product Space Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.core.ProductSpaceElement#getSubProductSpaceElements <em>Sub Product Space Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The product space element that directly contains this element.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Product Space Element</em>' reference.
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getProductSpaceElement_SuperProductSpaceElement()
	 * @see de.ubt.ai1.supermod.mm.core.ProductSpaceElement#getSubProductSpaceElements
	 * @model opposite="subProductSpaceElements" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	ProductSpaceElement getSuperProductSpaceElement();

	/**
	 * Returns the value of the '<em><b>Sub Product Space Elements</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.core.ProductSpaceElement}.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.core.ProductSpaceElement#getSuperProductSpaceElement <em>Super Product Space Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * All product space elements which are directly contained by this element.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Product Space Elements</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getProductSpaceElement_SubProductSpaceElements()
	 * @see de.ubt.ai1.supermod.mm.core.ProductSpaceElement#getSuperProductSpaceElement
	 * @model opposite="superProductSpaceElement" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<ProductSpaceElement> getSubProductSpaceElements();

	/**
	 * Returns the value of the '<em><b>All Super Product Space Elements</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.core.ProductSpaceElement}.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.core.ProductSpaceElement#getAllSubProductSpaceElements <em>All Sub Product Space Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The transitive closure over {@link ProductSpaceElement#getSuperElement()}.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Super Product Space Elements</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getProductSpaceElement_AllSuperProductSpaceElements()
	 * @see de.ubt.ai1.supermod.mm.core.ProductSpaceElement#getAllSubProductSpaceElements
	 * @model opposite="allSubProductSpaceElements" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<ProductSpaceElement> getAllSuperProductSpaceElements();

	/**
	 * Returns the value of the '<em><b>All Sub Product Space Elements</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.core.ProductSpaceElement}.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.core.ProductSpaceElement#getAllSuperProductSpaceElements <em>All Super Product Space Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The transitive closure over {@link ProductSpaceElement#getSuvElements()}.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Sub Product Space Elements</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getProductSpaceElement_AllSubProductSpaceElements()
	 * @see de.ubt.ai1.supermod.mm.core.ProductSpaceElement#getAllSuperProductSpaceElements
	 * @model opposite="allSuperProductSpaceElements" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<ProductSpaceElement> getAllSubProductSpaceElements();

	/**
	 * Returns the value of the '<em><b>Cross Referenced Product Space Elements</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.core.ProductSpaceElement}.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.core.ProductSpaceElement#getCrossReferencingProductSpaceElements <em>Cross Referencing Product Space Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Product space elements which are connected to this element by a non-containment link.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cross Referenced Product Space Elements</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getProductSpaceElement_CrossReferencedProductSpaceElements()
	 * @see de.ubt.ai1.supermod.mm.core.ProductSpaceElement#getCrossReferencingProductSpaceElements
	 * @model opposite="crossReferencingProductSpaceElements" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<ProductSpaceElement> getCrossReferencedProductSpaceElements();

	/**
	 * Returns the value of the '<em><b>Cross Referencing Product Space Elements</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.core.ProductSpaceElement}.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.core.ProductSpaceElement#getCrossReferencedProductSpaceElements <em>Cross Referenced Product Space Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cross Referencing Product Space Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cross Referencing Product Space Elements</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getProductSpaceElement_CrossReferencingProductSpaceElements()
	 * @see de.ubt.ai1.supermod.mm.core.ProductSpaceElement#getCrossReferencedProductSpaceElements
	 * @model opposite="crossReferencedProductSpaceElements" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<ProductSpaceElement> getCrossReferencingProductSpaceElements();

	/**
	 * Returns the value of the '<em><b>Hierarchical Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hierarchical Visibility</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hierarchical Visibility</em>' reference.
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getProductSpaceElement_HierarchicalVisibility()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	OptionExpr getHierarchicalVisibility();

	/**
	 * Returns the value of the '<em><b>Superordinate Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Superordinate Visibility</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Superordinate Visibility</em>' reference.
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getProductSpaceElement_SuperordinateVisibility()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	OptionExpr getSuperordinateVisibility();

	/**
	 * <!-- begin-user-doc -->
	 * Evaluates the referenced visibility with respect to the specified binding, using
	 * the specified visibility evaluation cache.
	 * @param binding	the option binding that determines this element's visibility
	 * @param cache		used for optimization of runtime and memory consumption
	 * @return 	a tristate indicating whether this element is visible in the version
	 * 			represented by the specified option binding.
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Tristate isVisible(OptionBinding binding, VisibilityEvaluationCache cache);

	/**
	 * <!-- begin-user-doc -->
	 * Evaluates the implicit conjunction of the referenced visibility and all parent's
	 * visibilities (transitively) with respect to the specified binding, using
	 * the specified visibility evaluation cache.
	 * @param binding	the option binding that determines this element's visibility
	 * @param cache		used for optimization of runtime and memory consumption
	 * @return 	a tristate indicating whether this element and all of its parent elements 
	 * 			are visible in the version represented by the specified option binding.
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Tristate isVisibleHierarchically(OptionBinding binding, VisibilityEvaluationCache cache);

} // VersionedElement
