/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository</b></em>'.
 * A SuperMod repository describes a set of versioned products, which are contained in
 * a product space, and the rules for versioning as well as their higher level abstractions
 * the user interacts with, the version space. The connection between the product space
 * and the version space is realized by means of visibilities, which are stored in a global
 * data structure, the visibility forest.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-25
 * @see		{@link ProductSpace}
 * @see		{@link VersionSpace}
 * @see		{@link VisibilityForest}
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.Repository#getProductSpace <em>Product Space</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.Repository#getVersionSpace <em>Version Space</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.Repository#getVisibilityForest <em>Visibility Forest</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.Repository#getModuleId <em>Module Id</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getRepository()
 * @model
 * @generated
 */
public interface Repository extends EObject {
	/**
	 * Returns the value of the '<em><b>Product Space</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.core.ProductSpace#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The product space of this repository. It defines the versioned products by using
	 * multiple product dimensions.
	 * @see {@link ProductDimension}
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Space</em>' containment reference.
	 * @see #setProductSpace(ProductSpace)
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getRepository_ProductSpace()
	 * @see de.ubt.ai1.supermod.mm.core.ProductSpace#getRepository
	 * @model opposite="repository" containment="true"
	 * @generated
	 */
	ProductSpace getProductSpace();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.core.Repository#getProductSpace <em>Product Space</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Space</em>' containment reference.
	 * @see #getProductSpace()
	 * @generated
	 */
	void setProductSpace(ProductSpace value);

	/**
	 * Returns the value of the '<em><b>Version Space</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.core.VersionSpace#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The version space of this repository. It defines versioning rules by using
	 * multiple version dimensions.
	 * @see {@link VersionDimension}
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version Space</em>' containment reference.
	 * @see #setVersionSpace(VersionSpace)
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getRepository_VersionSpace()
	 * @see de.ubt.ai1.supermod.mm.core.VersionSpace#getRepository
	 * @model opposite="repository" containment="true"
	 * @generated
	 */
	VersionSpace getVersionSpace();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.core.Repository#getVersionSpace <em>Version Space</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Space</em>' containment reference.
	 * @see #getVersionSpace()
	 * @generated
	 */
	void setVersionSpace(VersionSpace value);

	/**
	 * Returns the value of the '<em><b>Visibility Forest</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.core.VisibilityForest#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The visibility forest of this repository, a global data structure which stores
	 * all visibilities that are connected to elements of the product space. Visibilities
	 * in turn refer to elements of the version space. A visibility forest contains
	 * a number of option expressions, each representing a visibility.
	 * @see {@link OptionExpr}
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility Forest</em>' reference.
	 * @see #setVisibilityForest(VisibilityForest)
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getRepository_VisibilityForest()
	 * @see de.ubt.ai1.supermod.mm.core.VisibilityForest#getRepository
	 * @model opposite="repository"
	 * @generated
	 */
	VisibilityForest getVisibilityForest();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.core.Repository#getVisibilityForest <em>Visibility Forest</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility Forest</em>' reference.
	 * @see #getVisibilityForest()
	 * @generated
	 */
	void setVisibilityForest(VisibilityForest value);

	/**
	 * Returns the value of the '<em><b>Module Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Id</em>' attribute.
	 * @see #setModuleId(String)
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getRepository_ModuleId()
	 * @model
	 * @generated
	 */
	String getModuleId();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.core.Repository#getModuleId <em>Module Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Id</em>' attribute.
	 * @see #getModuleId()
	 * @generated
	 */
	void setModuleId(String value);

} // Repository
