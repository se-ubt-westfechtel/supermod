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
 * A representation of the model object '<em><b>Hybrid Element</b></em>'.
 * A hybrid element is both a product space and a version space element. It appears
 * in hybrid dimensions only.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-25
 * @see		{@link ProductSpaceElement}
 * @see		{@link VersionSpaceElement}
 * @see		{@link HybridDimension}
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.HybridElement#getSuperHybridElement <em>Super Hybrid Element</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.HybridElement#getSubHybridElements <em>Sub Hybrid Elements</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.HybridElement#getAllSuperHybridElements <em>All Super Hybrid Elements</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.HybridElement#getAllSubHybridElements <em>All Sub Hybrid Elements</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.HybridElement#getCrossReferencedHybridElements <em>Cross Referenced Hybrid Elements</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.HybridElement#getCrossReferencingHybridElements <em>Cross Referencing Hybrid Elements</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getHybridElement()
 * @model abstract="true"
 * @generated
 */
public interface HybridElement extends ProductSpaceElement, VersionSpaceElement {

	/**
	 * Returns the value of the '<em><b>Super Hybrid Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.core.HybridElement#getSubHybridElements <em>Sub Hybrid Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The hybrid element that directly contains this element.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Hybrid Element</em>' reference.
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getHybridElement_SuperHybridElement()
	 * @see de.ubt.ai1.supermod.mm.core.HybridElement#getSubHybridElements
	 * @model opposite="subHybridElements" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	HybridElement getSuperHybridElement();

	/**
	 * Returns the value of the '<em><b>Sub Hybrid Elements</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.core.HybridElement}.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.core.HybridElement#getSuperHybridElement <em>Super Hybrid Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * All hybrid elements which are directly contained by this element.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Hybrid Elements</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getHybridElement_SubHybridElements()
	 * @see de.ubt.ai1.supermod.mm.core.HybridElement#getSuperHybridElement
	 * @model opposite="superHybridElement" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<HybridElement> getSubHybridElements();

	/**
	 * Returns the value of the '<em><b>All Super Hybrid Elements</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.core.HybridElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The transitive closure over the super hybrid elements.
	 * @see	{@link HybridElement#getSuperHybridElement()}
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Super Hybrid Elements</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getHybridElement_AllSuperHybridElements()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<HybridElement> getAllSuperHybridElements();

	/**
	 * Returns the value of the '<em><b>All Sub Hybrid Elements</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.core.HybridElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The transitive closure over the sub hybrid elements.
	 * @see	{@link HybridElement#getSbHybridElements()}
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Sub Hybrid Elements</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getHybridElement_AllSubHybridElements()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<HybridElement> getAllSubHybridElements();

	/**
	 * Returns the value of the '<em><b>Cross Referenced Hybrid Elements</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.core.HybridElement}.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.core.HybridElement#getCrossReferencingHybridElements <em>Cross Referencing Hybrid Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Hybrid elements which are connected to this element by a non-containment link.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cross Referenced Hybrid Elements</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getHybridElement_CrossReferencedHybridElements()
	 * @see de.ubt.ai1.supermod.mm.core.HybridElement#getCrossReferencingHybridElements
	 * @model opposite="crossReferencingHybridElements" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<HybridElement> getCrossReferencedHybridElements();

	/**
	 * Returns the value of the '<em><b>Cross Referencing Hybrid Elements</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.core.HybridElement}.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.core.HybridElement#getCrossReferencedHybridElements <em>Cross Referenced Hybrid Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cross Referencing Hybrid Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cross Referencing Hybrid Elements</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getHybridElement_CrossReferencingHybridElements()
	 * @see de.ubt.ai1.supermod.mm.core.HybridElement#getCrossReferencedHybridElements
	 * @model opposite="crossReferencedHybridElements" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<HybridElement> getCrossReferencingHybridElements();
} // HybridElement
