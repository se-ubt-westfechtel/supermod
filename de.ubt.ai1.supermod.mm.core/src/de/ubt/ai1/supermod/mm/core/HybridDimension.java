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
 * A representation of the model object '<em><b>Hybrid Dimension</b></em>'.
 * A hybrid dimension plays a dual role in a SuperMod repository. It is both a product
 * and a version dimension.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-25
 * @see		{@link ProductDimension}
 * @see		{@link VersionDimension}
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.HybridDimension#getRootHybridElements <em>Root Hybrid Elements</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.HybridDimension#getAllHybridElements <em>All Hybrid Elements</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getHybridDimension()
 * @model abstract="true"
 * @generated
 */
public interface HybridDimension extends VersionDimension, ProductDimension {

	/**
	 * Returns the value of the '<em><b>Root Hybrid Elements</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.core.HybridElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Returns the root elements of this hybrid dimension, all being instance of
	 * {@link HybridElement}. The methods {@link VersionDimension#getRootVersionElements()} 
	 * and {@link ProductDimension#getRootProductElements()} are overridden such that 
	 * they return the collection specified by the implementation of this method.
	 * @see	VersionDimension#getRootVersionElements()
	 * @see ProductDimension#getRootProductElements()
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Hybrid Elements</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getHybridDimension_RootHybridElements()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<HybridElement> getRootHybridElements();

	/**
	 * Returns the value of the '<em><b>All Hybrid Elements</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.core.HybridElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Returns all elements transitively contained by this hybrid dimension, all being instance of
	 * {@link HybridElement}. The methods {@link VersionDimension#getAllVersionElements()} 
	 * and {@link ProductDimension#getAllProductElements()} are overridden such that 
	 * they return the collection specified by the implementation of this method.
	 * @see	VersionDimension#getAllVersionElements()
	 * @see ProductDimension#getAllProductElements()
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Hybrid Elements</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getHybridDimension_AllHybridElements()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<HybridElement> getAllHybridElements();
} // HybridDimension
