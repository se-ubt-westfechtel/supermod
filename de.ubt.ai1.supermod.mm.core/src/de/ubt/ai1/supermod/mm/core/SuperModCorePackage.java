/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.core;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * 
 * The SuperMod core package contains all SuperMod concepts which are not specific
 * to a concrete product or version dimension. These concept are intended to be
 * re-used and extended by inheriting models.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-25
 * <!-- end-user-doc -->
 * @see de.ubt.ai1.supermod.mm.core.SuperModCoreFactory
 * @model kind="package"
 * @generated
 */
public interface SuperModCorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ai1.uni-bayreuth.de/supermod/core/0.1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.ubt.ai1.supermod.mm.core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SuperModCorePackage eINSTANCE = de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.core.impl.RepositoryImpl <em>Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.core.impl.RepositoryImpl
	 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getRepository()
	 * @generated
	 */
	int REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Product Space</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__PRODUCT_SPACE = 0;

	/**
	 * The feature id for the '<em><b>Version Space</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__VERSION_SPACE = 1;

	/**
	 * The feature id for the '<em><b>Visibility Forest</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__VISIBILITY_FOREST = 2;

	/**
	 * The feature id for the '<em><b>Module Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__MODULE_ID = 3;

	/**
	 * The number of structural features of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.core.impl.DimensionImpl <em>Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.core.impl.DimensionImpl
	 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getDimension()
	 * @generated
	 */
	int DIMENSION = 1;

	/**
	 * The feature id for the '<em><b>Dimension Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__DIMENSION_NAME = 0;

	/**
	 * The feature id for the '<em><b>Root Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__ROOT_ELEMENTS = 1;

	/**
	 * The feature id for the '<em><b>All Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__ALL_ELEMENTS = 2;

	/**
	 * The number of structural features of the '<em>Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.core.impl.VisibilityForestImpl <em>Visibility Forest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.core.impl.VisibilityForestImpl
	 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getVisibilityForest()
	 * @generated
	 */
	int VISIBILITY_FOREST = 21;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.core.impl.ProductSpaceImpl <em>Product Space</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.core.impl.ProductSpaceImpl
	 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getProductSpace()
	 * @generated
	 */
	int PRODUCT_SPACE = 4;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.core.impl.ProductDimensionImpl <em>Product Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.core.impl.ProductDimensionImpl
	 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getProductDimension()
	 * @generated
	 */
	int PRODUCT_DIMENSION = 5;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.core.impl.ProductSpaceElementImpl <em>Product Space Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.core.impl.ProductSpaceElementImpl
	 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getProductSpaceElement()
	 * @generated
	 */
	int PRODUCT_SPACE_ELEMENT = 6;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.core.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.core.impl.ElementImpl
	 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Super Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__SUPER_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__SUB_ELEMENTS = 1;

	/**
	 * The feature id for the '<em><b>All Super Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ALL_SUPER_ELEMENTS = 2;

	/**
	 * The feature id for the '<em><b>All Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ALL_SUB_ELEMENTS = 3;

	/**
	 * The feature id for the '<em><b>Cross Referenced Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__CROSS_REFERENCED_ELEMENTS = 4;

	/**
	 * The feature id for the '<em><b>Cross Referencing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__CROSS_REFERENCING_ELEMENTS = 5;

	/**
	 * The feature id for the '<em><b>Proxy UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__PROXY_UUID = 6;

	/**
	 * The feature id for the '<em><b>Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__TRANSACTION_ID = 7;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 8;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___IS_PROXY = 0;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.core.impl.UUIDElementImpl <em>UUID Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.core.impl.UUIDElementImpl
	 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getUUIDElement()
	 * @generated
	 */
	int UUID_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Super Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UUID_ELEMENT__SUPER_ELEMENT = ELEMENT__SUPER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UUID_ELEMENT__SUB_ELEMENTS = ELEMENT__SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UUID_ELEMENT__ALL_SUPER_ELEMENTS = ELEMENT__ALL_SUPER_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UUID_ELEMENT__ALL_SUB_ELEMENTS = ELEMENT__ALL_SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UUID_ELEMENT__CROSS_REFERENCED_ELEMENTS = ELEMENT__CROSS_REFERENCED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UUID_ELEMENT__CROSS_REFERENCING_ELEMENTS = ELEMENT__CROSS_REFERENCING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Proxy UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UUID_ELEMENT__PROXY_UUID = ELEMENT__PROXY_UUID;

	/**
	 * The feature id for the '<em><b>Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UUID_ELEMENT__TRANSACTION_ID = ELEMENT__TRANSACTION_ID;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UUID_ELEMENT__UUID = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>UUID Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UUID_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UUID_ELEMENT___IS_PROXY = ELEMENT___IS_PROXY;

	/**
	 * The number of operations of the '<em>UUID Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UUID_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPACE__DIMENSIONS = 0;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPACE__REPOSITORY = 1;

	/**
	 * The number of structural features of the '<em>Product Space</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPACE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Product Space</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPACE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Dimension Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_DIMENSION__DIMENSION_NAME = DIMENSION__DIMENSION_NAME;

	/**
	 * The feature id for the '<em><b>Root Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_DIMENSION__ROOT_ELEMENTS = DIMENSION__ROOT_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_DIMENSION__ALL_ELEMENTS = DIMENSION__ALL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Root Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_DIMENSION__ROOT_PRODUCT_SPACE_ELEMENTS = DIMENSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>All Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_DIMENSION__ALL_PRODUCT_SPACE_ELEMENTS = DIMENSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Product Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_DIMENSION__PRODUCT_SPACE = DIMENSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Product Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_DIMENSION_FEATURE_COUNT = DIMENSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Product Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_DIMENSION_OPERATION_COUNT = DIMENSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Super Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPACE_ELEMENT__SUPER_ELEMENT = ELEMENT__SUPER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPACE_ELEMENT__SUB_ELEMENTS = ELEMENT__SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPACE_ELEMENT__ALL_SUPER_ELEMENTS = ELEMENT__ALL_SUPER_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPACE_ELEMENT__ALL_SUB_ELEMENTS = ELEMENT__ALL_SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPACE_ELEMENT__CROSS_REFERENCED_ELEMENTS = ELEMENT__CROSS_REFERENCED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPACE_ELEMENT__CROSS_REFERENCING_ELEMENTS = ELEMENT__CROSS_REFERENCING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Proxy UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPACE_ELEMENT__PROXY_UUID = ELEMENT__PROXY_UUID;

	/**
	 * The feature id for the '<em><b>Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPACE_ELEMENT__TRANSACTION_ID = ELEMENT__TRANSACTION_ID;

	/**
	 * The feature id for the '<em><b>Product Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPACE_ELEMENT__PRODUCT_DIMENSION = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Product Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPACE_ELEMENT__PRODUCT_SPACE = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPACE_ELEMENT__VISIBILITY = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Super Product Space Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPACE_ELEMENT__SUPER_PRODUCT_SPACE_ELEMENT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sub Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPACE_ELEMENT__SUB_PRODUCT_SPACE_ELEMENTS = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>All Super Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPACE_ELEMENT__ALL_SUPER_PRODUCT_SPACE_ELEMENTS = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>All Sub Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPACE_ELEMENT__ALL_SUB_PRODUCT_SPACE_ELEMENTS = ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Cross Referenced Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPACE_ELEMENT__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS = ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Cross Referencing Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPACE_ELEMENT__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS = ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Hierarchical Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPACE_ELEMENT__HIERARCHICAL_VISIBILITY = ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Superordinate Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPACE_ELEMENT__SUPERORDINATE_VISIBILITY = ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Product Space Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPACE_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPACE_ELEMENT___IS_PROXY = ELEMENT___IS_PROXY;

	/**
	 * The operation id for the '<em>Is Visible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPACE_ELEMENT___IS_VISIBLE__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Visible Hierarchically</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPACE_ELEMENT___IS_VISIBLE_HIERARCHICALLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Product Space Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPACE_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.core.impl.VersionSpaceImpl <em>Version Space</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.core.impl.VersionSpaceImpl
	 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getVersionSpace()
	 * @generated
	 */
	int VERSION_SPACE = 7;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_SPACE__DIMENSIONS = 0;

	/**
	 * The feature id for the '<em><b>All Options</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_SPACE__ALL_OPTIONS = 1;

	/**
	 * The feature id for the '<em><b>All Invariants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_SPACE__ALL_INVARIANTS = 2;

	/**
	 * The feature id for the '<em><b>All Preferences</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_SPACE__ALL_PREFERENCES = 3;

	/**
	 * The feature id for the '<em><b>All Default Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_SPACE__ALL_DEFAULT_BINDINGS = 4;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_SPACE__REPOSITORY = 5;

	/**
	 * The number of structural features of the '<em>Version Space</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_SPACE_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_SPACE___VALIDATE__OPTIONBINDING = 0;

	/**
	 * The operation id for the '<em>Is Complete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_SPACE___IS_COMPLETE__OPTIONBINDING = 1;

	/**
	 * The operation id for the '<em>Is Satisfiable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_SPACE___IS_SATISFIABLE__OPTIONBINDING = 2;

	/**
	 * The operation id for the '<em>Apply All Preferences</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_SPACE___APPLY_ALL_PREFERENCES__OPTIONBINDING = 3;

	/**
	 * The operation id for the '<em>Apply All Defaults</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_SPACE___APPLY_ALL_DEFAULTS__OPTIONBINDING = 4;

	/**
	 * The operation id for the '<em>Apply All Completions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_SPACE___APPLY_ALL_COMPLETIONS__OPTIONBINDING = 5;

	/**
	 * The operation id for the '<em>Get Option</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_SPACE___GET_OPTION__STRING = 6;

	/**
	 * The number of operations of the '<em>Version Space</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_SPACE_OPERATION_COUNT = 7;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.core.impl.VersionDimensionImpl <em>Version Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.core.impl.VersionDimensionImpl
	 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getVersionDimension()
	 * @generated
	 */
	int VERSION_DIMENSION = 8;

	/**
	 * The feature id for the '<em><b>Dimension Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_DIMENSION__DIMENSION_NAME = DIMENSION__DIMENSION_NAME;

	/**
	 * The feature id for the '<em><b>Root Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_DIMENSION__ROOT_ELEMENTS = DIMENSION__ROOT_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_DIMENSION__ALL_ELEMENTS = DIMENSION__ALL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Options</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_DIMENSION__OPTIONS = DIMENSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invariants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_DIMENSION__INVARIANTS = DIMENSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Preferences</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_DIMENSION__PREFERENCES = DIMENSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Default Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_DIMENSION__DEFAULT_BINDINGS = DIMENSION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Root Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_DIMENSION__ROOT_VERSION_SPACE_ELEMENTS = DIMENSION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>All Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_DIMENSION__ALL_VERSION_SPACE_ELEMENTS = DIMENSION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_DIMENSION__VERSION_SPACE = DIMENSION_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Version Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_DIMENSION_FEATURE_COUNT = DIMENSION_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_DIMENSION___VALIDATE__OPTIONBINDING = DIMENSION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Complete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_DIMENSION___IS_COMPLETE__OPTIONBINDING = DIMENSION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Satisfiable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_DIMENSION___IS_SATISFIABLE__OPTIONBINDING = DIMENSION_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Apply Preferences</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_DIMENSION___APPLY_PREFERENCES__OPTIONBINDING = DIMENSION_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Apply Defaults</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_DIMENSION___APPLY_DEFAULTS__OPTIONBINDING = DIMENSION_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Apply Completions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_DIMENSION___APPLY_COMPLETIONS__OPTIONBINDING = DIMENSION_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Option</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_DIMENSION___GET_OPTION__STRING = DIMENSION_OPERATION_COUNT + 6;

	/**
	 * The number of operations of the '<em>Version Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_DIMENSION_OPERATION_COUNT = DIMENSION_OPERATION_COUNT + 7;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.core.impl.HybridDimensionImpl <em>Hybrid Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.core.impl.HybridDimensionImpl
	 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getHybridDimension()
	 * @generated
	 */
	int HYBRID_DIMENSION = 19;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.core.impl.HybridElementImpl <em>Hybrid Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.core.impl.HybridElementImpl
	 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getHybridElement()
	 * @generated
	 */
	int HYBRID_ELEMENT = 20;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.core.impl.RuleBaseElementImpl <em>Rule Base Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.core.impl.RuleBaseElementImpl
	 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getRuleBaseElement()
	 * @generated
	 */
	int RULE_BASE_ELEMENT = 10;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.core.impl.InvariantImpl <em>Invariant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.core.impl.InvariantImpl
	 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getInvariant()
	 * @generated
	 */
	int INVARIANT = 11;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.core.impl.PreferenceImpl <em>Preference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.core.impl.PreferenceImpl
	 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getPreference()
	 * @generated
	 */
	int PREFERENCE = 12;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.core.impl.DefaultBindingImpl <em>Default Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.core.impl.DefaultBindingImpl
	 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getDefaultBinding()
	 * @generated
	 */
	int DEFAULT_BINDING = 13;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.core.impl.OptionImpl <em>Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.core.impl.OptionImpl
	 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getOption()
	 * @generated
	 */
	int OPTION = 14;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.core.impl.OptionBindingImpl <em>Option Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.core.impl.OptionBindingImpl
	 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getOptionBinding()
	 * @generated
	 */
	int OPTION_BINDING = 15;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.core.impl.OptionToTristateMapEntryImpl <em>Option To Tristate Map Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.core.impl.OptionToTristateMapEntryImpl
	 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getOptionToTristateMapEntry()
	 * @generated
	 */
	int OPTION_TO_TRISTATE_MAP_ENTRY = 16;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.core.impl.VisibilityEvaluationCacheImpl <em>Visibility Evaluation Cache</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.core.impl.VisibilityEvaluationCacheImpl
	 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getVisibilityEvaluationCache()
	 * @generated
	 */
	int VISIBILITY_EVALUATION_CACHE = 17;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.core.impl.OptionExprToTristateMapEntryImpl <em>Option Expr To Tristate Map Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.core.impl.OptionExprToTristateMapEntryImpl
	 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getOptionExprToTristateMapEntry()
	 * @generated
	 */
	int OPTION_EXPR_TO_TRISTATE_MAP_ENTRY = 18;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.core.impl.VersionSpaceElementImpl <em>Version Space Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.core.impl.VersionSpaceElementImpl
	 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getVersionSpaceElement()
	 * @generated
	 */
	int VERSION_SPACE_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Super Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_SPACE_ELEMENT__SUPER_ELEMENT = ELEMENT__SUPER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_SPACE_ELEMENT__SUB_ELEMENTS = ELEMENT__SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_SPACE_ELEMENT__ALL_SUPER_ELEMENTS = ELEMENT__ALL_SUPER_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_SPACE_ELEMENT__ALL_SUB_ELEMENTS = ELEMENT__ALL_SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_SPACE_ELEMENT__CROSS_REFERENCED_ELEMENTS = ELEMENT__CROSS_REFERENCED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_SPACE_ELEMENT__CROSS_REFERENCING_ELEMENTS = ELEMENT__CROSS_REFERENCING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Proxy UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_SPACE_ELEMENT__PROXY_UUID = ELEMENT__PROXY_UUID;

	/**
	 * The feature id for the '<em><b>Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_SPACE_ELEMENT__TRANSACTION_ID = ELEMENT__TRANSACTION_ID;

	/**
	 * The feature id for the '<em><b>Version Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_SPACE_ELEMENT__VERSION_DIMENSION = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Version Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_SPACE_ELEMENT__VERSION_SPACE = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Super Version Space Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_SPACE_ELEMENT__SUPER_VERSION_SPACE_ELEMENT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sub Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_SPACE_ELEMENT__SUB_VERSION_SPACE_ELEMENTS = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>All Super Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_SPACE_ELEMENT__ALL_SUPER_VERSION_SPACE_ELEMENTS = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>All Sub Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_SPACE_ELEMENT__ALL_SUB_VERSION_SPACE_ELEMENTS = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Cross Referenced Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_SPACE_ELEMENT__CROSS_REFERENCED_VERSION_SPACE_ELEMENTS = ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Cross Referencing Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_SPACE_ELEMENT__CROSS_REFERENCING_VERSION_SPACE_ELEMENTS = ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Low Level Concepts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_SPACE_ELEMENT__LOW_LEVEL_CONCEPTS = ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Version Space Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_SPACE_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_SPACE_ELEMENT___IS_PROXY = ELEMENT___IS_PROXY;

	/**
	 * The number of operations of the '<em>Version Space Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_SPACE_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BASE_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BASE_ELEMENT__DIMENSION = 1;

	/**
	 * The feature id for the '<em><b>High Level Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BASE_ELEMENT__HIGH_LEVEL_CONCEPT = 2;

	/**
	 * The number of structural features of the '<em>Rule Base Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BASE_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Rule Base Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BASE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVARIANT__NAME = RULE_BASE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVARIANT__DIMENSION = RULE_BASE_ELEMENT__DIMENSION;

	/**
	 * The feature id for the '<em><b>High Level Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVARIANT__HIGH_LEVEL_CONCEPT = RULE_BASE_ELEMENT__HIGH_LEVEL_CONCEPT;

	/**
	 * The feature id for the '<em><b>Option Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVARIANT__OPTION_EXPR = RULE_BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Invariant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVARIANT_FEATURE_COUNT = RULE_BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Invariant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVARIANT_OPERATION_COUNT = RULE_BASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE__NAME = RULE_BASE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE__DIMENSION = RULE_BASE_ELEMENT__DIMENSION;

	/**
	 * The feature id for the '<em><b>High Level Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE__HIGH_LEVEL_CONCEPT = RULE_BASE_ELEMENT__HIGH_LEVEL_CONCEPT;

	/**
	 * The feature id for the '<em><b>Option</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE__OPTION = RULE_BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Option Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE__OPTION_EXPR = RULE_BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Preference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE_FEATURE_COUNT = RULE_BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>To Implication Invariant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE___TO_IMPLICATION_INVARIANT = RULE_BASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Preference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE_OPERATION_COUNT = RULE_BASE_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_BINDING__NAME = RULE_BASE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_BINDING__DIMENSION = RULE_BASE_ELEMENT__DIMENSION;

	/**
	 * The feature id for the '<em><b>High Level Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_BINDING__HIGH_LEVEL_CONCEPT = RULE_BASE_ELEMENT__HIGH_LEVEL_CONCEPT;

	/**
	 * The feature id for the '<em><b>Option</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_BINDING__OPTION = RULE_BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_BINDING__STATE = RULE_BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Default Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_BINDING_FEATURE_COUNT = RULE_BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Default Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_BINDING_OPERATION_COUNT = RULE_BASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__NAME = RULE_BASE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__DIMENSION = RULE_BASE_ELEMENT__DIMENSION;

	/**
	 * The feature id for the '<em><b>High Level Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__HIGH_LEVEL_CONCEPT = RULE_BASE_ELEMENT__HIGH_LEVEL_CONCEPT;

	/**
	 * The number of structural features of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_FEATURE_COUNT = RULE_BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_OPERATION_COUNT = RULE_BASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bound Options</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_BINDING__BOUND_OPTIONS = 0;

	/**
	 * The feature id for the '<em><b>Number Of Bindings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_BINDING__NUMBER_OF_BINDINGS = 1;

	/**
	 * The number of structural features of the '<em>Option Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_BINDING_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Get State</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_BINDING___GET_STATE__OPTION = 0;

	/**
	 * The operation id for the '<em>Implies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_BINDING___IMPLIES__OPTIONBINDING = 1;

	/**
	 * The operation id for the '<em>To Visibility</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_BINDING___TO_VISIBILITY = 2;

	/**
	 * The operation id for the '<em>Bind</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_BINDING___BIND__OPTION_TRISTATE = 3;

	/**
	 * The operation id for the '<em>Combine</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_BINDING___COMBINE__OPTIONBINDING = 4;

	/**
	 * The operation id for the '<em>Clear</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_BINDING___CLEAR = 5;

	/**
	 * The number of operations of the '<em>Option Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_BINDING_OPERATION_COUNT = 6;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_TO_TRISTATE_MAP_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_TO_TRISTATE_MAP_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Option To Tristate Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_TO_TRISTATE_MAP_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Option To Tristate Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_TO_TRISTATE_MAP_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_EVALUATION_CACHE__ENTRIES = 0;

	/**
	 * The number of structural features of the '<em>Visibility Evaluation Cache</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_EVALUATION_CACHE_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Invalidate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_EVALUATION_CACHE___INVALIDATE = 0;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_EVALUATION_CACHE___SAVE__OPTIONEXPR_TRISTATE = 1;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_EVALUATION_CACHE___GET__OPTIONEXPR = 2;

	/**
	 * The number of operations of the '<em>Visibility Evaluation Cache</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_EVALUATION_CACHE_OPERATION_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_EXPR_TO_TRISTATE_MAP_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_EXPR_TO_TRISTATE_MAP_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Option Expr To Tristate Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_EXPR_TO_TRISTATE_MAP_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Option Expr To Tristate Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_EXPR_TO_TRISTATE_MAP_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Dimension Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_DIMENSION__DIMENSION_NAME = VERSION_DIMENSION__DIMENSION_NAME;

	/**
	 * The feature id for the '<em><b>Root Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_DIMENSION__ROOT_ELEMENTS = VERSION_DIMENSION__ROOT_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_DIMENSION__ALL_ELEMENTS = VERSION_DIMENSION__ALL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Options</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_DIMENSION__OPTIONS = VERSION_DIMENSION__OPTIONS;

	/**
	 * The feature id for the '<em><b>Invariants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_DIMENSION__INVARIANTS = VERSION_DIMENSION__INVARIANTS;

	/**
	 * The feature id for the '<em><b>Preferences</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_DIMENSION__PREFERENCES = VERSION_DIMENSION__PREFERENCES;

	/**
	 * The feature id for the '<em><b>Default Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_DIMENSION__DEFAULT_BINDINGS = VERSION_DIMENSION__DEFAULT_BINDINGS;

	/**
	 * The feature id for the '<em><b>Root Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_DIMENSION__ROOT_VERSION_SPACE_ELEMENTS = VERSION_DIMENSION__ROOT_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_DIMENSION__ALL_VERSION_SPACE_ELEMENTS = VERSION_DIMENSION__ALL_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Version Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_DIMENSION__VERSION_SPACE = VERSION_DIMENSION__VERSION_SPACE;

	/**
	 * The feature id for the '<em><b>Root Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_DIMENSION__ROOT_PRODUCT_SPACE_ELEMENTS = VERSION_DIMENSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>All Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_DIMENSION__ALL_PRODUCT_SPACE_ELEMENTS = VERSION_DIMENSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Product Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_DIMENSION__PRODUCT_SPACE = VERSION_DIMENSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Root Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_DIMENSION__ROOT_HYBRID_ELEMENTS = VERSION_DIMENSION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>All Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_DIMENSION__ALL_HYBRID_ELEMENTS = VERSION_DIMENSION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Hybrid Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_DIMENSION_FEATURE_COUNT = VERSION_DIMENSION_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_DIMENSION___VALIDATE__OPTIONBINDING = VERSION_DIMENSION___VALIDATE__OPTIONBINDING;

	/**
	 * The operation id for the '<em>Is Complete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_DIMENSION___IS_COMPLETE__OPTIONBINDING = VERSION_DIMENSION___IS_COMPLETE__OPTIONBINDING;

	/**
	 * The operation id for the '<em>Is Satisfiable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_DIMENSION___IS_SATISFIABLE__OPTIONBINDING = VERSION_DIMENSION___IS_SATISFIABLE__OPTIONBINDING;

	/**
	 * The operation id for the '<em>Apply Preferences</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_DIMENSION___APPLY_PREFERENCES__OPTIONBINDING = VERSION_DIMENSION___APPLY_PREFERENCES__OPTIONBINDING;

	/**
	 * The operation id for the '<em>Apply Defaults</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_DIMENSION___APPLY_DEFAULTS__OPTIONBINDING = VERSION_DIMENSION___APPLY_DEFAULTS__OPTIONBINDING;

	/**
	 * The operation id for the '<em>Apply Completions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_DIMENSION___APPLY_COMPLETIONS__OPTIONBINDING = VERSION_DIMENSION___APPLY_COMPLETIONS__OPTIONBINDING;

	/**
	 * The operation id for the '<em>Get Option</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_DIMENSION___GET_OPTION__STRING = VERSION_DIMENSION___GET_OPTION__STRING;

	/**
	 * The number of operations of the '<em>Hybrid Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_DIMENSION_OPERATION_COUNT = VERSION_DIMENSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Super Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_ELEMENT__SUPER_ELEMENT = PRODUCT_SPACE_ELEMENT__SUPER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_ELEMENT__SUB_ELEMENTS = PRODUCT_SPACE_ELEMENT__SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_ELEMENT__ALL_SUPER_ELEMENTS = PRODUCT_SPACE_ELEMENT__ALL_SUPER_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_ELEMENT__ALL_SUB_ELEMENTS = PRODUCT_SPACE_ELEMENT__ALL_SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_ELEMENT__CROSS_REFERENCED_ELEMENTS = PRODUCT_SPACE_ELEMENT__CROSS_REFERENCED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_ELEMENT__CROSS_REFERENCING_ELEMENTS = PRODUCT_SPACE_ELEMENT__CROSS_REFERENCING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Proxy UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_ELEMENT__PROXY_UUID = PRODUCT_SPACE_ELEMENT__PROXY_UUID;

	/**
	 * The feature id for the '<em><b>Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_ELEMENT__TRANSACTION_ID = PRODUCT_SPACE_ELEMENT__TRANSACTION_ID;

	/**
	 * The feature id for the '<em><b>Product Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_ELEMENT__PRODUCT_DIMENSION = PRODUCT_SPACE_ELEMENT__PRODUCT_DIMENSION;

	/**
	 * The feature id for the '<em><b>Product Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_ELEMENT__PRODUCT_SPACE = PRODUCT_SPACE_ELEMENT__PRODUCT_SPACE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_ELEMENT__VISIBILITY = PRODUCT_SPACE_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Super Product Space Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_ELEMENT__SUPER_PRODUCT_SPACE_ELEMENT = PRODUCT_SPACE_ELEMENT__SUPER_PRODUCT_SPACE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_ELEMENT__SUB_PRODUCT_SPACE_ELEMENTS = PRODUCT_SPACE_ELEMENT__SUB_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_ELEMENT__ALL_SUPER_PRODUCT_SPACE_ELEMENTS = PRODUCT_SPACE_ELEMENT__ALL_SUPER_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_ELEMENT__ALL_SUB_PRODUCT_SPACE_ELEMENTS = PRODUCT_SPACE_ELEMENT__ALL_SUB_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_ELEMENT__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS = PRODUCT_SPACE_ELEMENT__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_ELEMENT__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS = PRODUCT_SPACE_ELEMENT__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Hierarchical Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_ELEMENT__HIERARCHICAL_VISIBILITY = PRODUCT_SPACE_ELEMENT__HIERARCHICAL_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Superordinate Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_ELEMENT__SUPERORDINATE_VISIBILITY = PRODUCT_SPACE_ELEMENT__SUPERORDINATE_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Version Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_ELEMENT__VERSION_DIMENSION = PRODUCT_SPACE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Version Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_ELEMENT__VERSION_SPACE = PRODUCT_SPACE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Super Version Space Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_ELEMENT__SUPER_VERSION_SPACE_ELEMENT = PRODUCT_SPACE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sub Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_ELEMENT__SUB_VERSION_SPACE_ELEMENTS = PRODUCT_SPACE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>All Super Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_ELEMENT__ALL_SUPER_VERSION_SPACE_ELEMENTS = PRODUCT_SPACE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>All Sub Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_ELEMENT__ALL_SUB_VERSION_SPACE_ELEMENTS = PRODUCT_SPACE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Cross Referenced Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_ELEMENT__CROSS_REFERENCED_VERSION_SPACE_ELEMENTS = PRODUCT_SPACE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Cross Referencing Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_ELEMENT__CROSS_REFERENCING_VERSION_SPACE_ELEMENTS = PRODUCT_SPACE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Low Level Concepts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_ELEMENT__LOW_LEVEL_CONCEPTS = PRODUCT_SPACE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Super Hybrid Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_ELEMENT__SUPER_HYBRID_ELEMENT = PRODUCT_SPACE_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Sub Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_ELEMENT__SUB_HYBRID_ELEMENTS = PRODUCT_SPACE_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>All Super Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_ELEMENT__ALL_SUPER_HYBRID_ELEMENTS = PRODUCT_SPACE_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>All Sub Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_ELEMENT__ALL_SUB_HYBRID_ELEMENTS = PRODUCT_SPACE_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Cross Referenced Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_ELEMENT__CROSS_REFERENCED_HYBRID_ELEMENTS = PRODUCT_SPACE_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Cross Referencing Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_ELEMENT__CROSS_REFERENCING_HYBRID_ELEMENTS = PRODUCT_SPACE_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Hybrid Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_ELEMENT_FEATURE_COUNT = PRODUCT_SPACE_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_ELEMENT___IS_PROXY = PRODUCT_SPACE_ELEMENT___IS_PROXY;

	/**
	 * The operation id for the '<em>Is Visible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_ELEMENT___IS_VISIBLE__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = PRODUCT_SPACE_ELEMENT___IS_VISIBLE__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The operation id for the '<em>Is Visible Hierarchically</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_ELEMENT___IS_VISIBLE_HIERARCHICALLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = PRODUCT_SPACE_ELEMENT___IS_VISIBLE_HIERARCHICALLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The number of operations of the '<em>Hybrid Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_ELEMENT_OPERATION_COUNT = PRODUCT_SPACE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dimension Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_FOREST__DIMENSION_NAME = DIMENSION__DIMENSION_NAME;

	/**
	 * The feature id for the '<em><b>Root Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_FOREST__ROOT_ELEMENTS = DIMENSION__ROOT_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_FOREST__ALL_ELEMENTS = DIMENSION__ALL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Visibilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_FOREST__VISIBILITIES = DIMENSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_FOREST__REPOSITORY = DIMENSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Visibility Forest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_FOREST_FEATURE_COUNT = DIMENSION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Add</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_FOREST___ADD__OPTIONEXPR = DIMENSION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Visibility Forest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_FOREST_OPERATION_COUNT = DIMENSION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.core.impl.VisibilityImpl <em>Visibility</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.core.impl.VisibilityImpl
	 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getVisibility()
	 * @generated
	 */
	int VISIBILITY = 22;

	/**
	 * The feature id for the '<em><b>Super Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY__SUPER_ELEMENT = UUID_ELEMENT__SUPER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY__SUB_ELEMENTS = UUID_ELEMENT__SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY__ALL_SUPER_ELEMENTS = UUID_ELEMENT__ALL_SUPER_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY__ALL_SUB_ELEMENTS = UUID_ELEMENT__ALL_SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY__CROSS_REFERENCED_ELEMENTS = UUID_ELEMENT__CROSS_REFERENCED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY__CROSS_REFERENCING_ELEMENTS = UUID_ELEMENT__CROSS_REFERENCING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Proxy UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY__PROXY_UUID = UUID_ELEMENT__PROXY_UUID;

	/**
	 * The feature id for the '<em><b>Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY__TRANSACTION_ID = UUID_ELEMENT__TRANSACTION_ID;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY__UUID = UUID_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY__EXPR = UUID_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Visibility</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_FEATURE_COUNT = UUID_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY___IS_PROXY = UUID_ELEMENT___IS_PROXY;

	/**
	 * The number of operations of the '<em>Visibility</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_OPERATION_COUNT = UUID_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.core.impl.OptionExprImpl <em>Option Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.core.impl.OptionExprImpl
	 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getOptionExpr()
	 * @generated
	 */
	int OPTION_EXPR = 23;

	/**
	 * The feature id for the '<em><b>Referenced Options</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_EXPR__REFERENCED_OPTIONS = 0;

	/**
	 * The feature id for the '<em><b>Referenced Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_EXPR__REFERENCED_DIMENSIONS = 1;

	/**
	 * The number of structural features of the '<em>Option Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_EXPR_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_EXPR___APPLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_EXPR___APPLY__OPTIONBINDING = 1;

	/**
	 * The operation id for the '<em>Not</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_EXPR___NOT = 2;

	/**
	 * The operation id for the '<em>And</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_EXPR___AND__OPTIONEXPR = 3;

	/**
	 * The operation id for the '<em>Or</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_EXPR___OR__OPTIONEXPR = 4;

	/**
	 * The operation id for the '<em>Xor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_EXPR___XOR__OPTIONEXPR = 5;

	/**
	 * The operation id for the '<em>Implies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_EXPR___IMPLIES__OPTIONEXPR = 6;

	/**
	 * The operation id for the '<em>Iff</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_EXPR___IFF__OPTIONEXPR = 7;

	/**
	 * The operation id for the '<em>Nand</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_EXPR___NAND__OPTIONEXPR = 8;

	/**
	 * The operation id for the '<em>Minus</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_EXPR___MINUS__OPTIONEXPR = 9;

	/**
	 * The operation id for the '<em>Extract</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_EXPR___EXTRACT = 10;

	/**
	 * The number of operations of the '<em>Option Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_EXPR_OPERATION_COUNT = 11;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.core.impl.VisibilityRefImpl <em>Visibility Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.core.impl.VisibilityRefImpl
	 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getVisibilityRef()
	 * @generated
	 */
	int VISIBILITY_REF = 24;

	/**
	 * The feature id for the '<em><b>Referenced Options</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_REF__REFERENCED_OPTIONS = OPTION_EXPR__REFERENCED_OPTIONS;

	/**
	 * The feature id for the '<em><b>Referenced Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_REF__REFERENCED_DIMENSIONS = OPTION_EXPR__REFERENCED_DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_REF__VISIBILITY = OPTION_EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Visibility Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_REF_FEATURE_COUNT = OPTION_EXPR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_REF___APPLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = OPTION_EXPR___APPLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_REF___APPLY__OPTIONBINDING = OPTION_EXPR___APPLY__OPTIONBINDING;

	/**
	 * The operation id for the '<em>Not</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_REF___NOT = OPTION_EXPR___NOT;

	/**
	 * The operation id for the '<em>And</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_REF___AND__OPTIONEXPR = OPTION_EXPR___AND__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Or</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_REF___OR__OPTIONEXPR = OPTION_EXPR___OR__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Xor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_REF___XOR__OPTIONEXPR = OPTION_EXPR___XOR__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Implies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_REF___IMPLIES__OPTIONEXPR = OPTION_EXPR___IMPLIES__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Iff</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_REF___IFF__OPTIONEXPR = OPTION_EXPR___IFF__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Nand</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_REF___NAND__OPTIONEXPR = OPTION_EXPR___NAND__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Minus</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_REF___MINUS__OPTIONEXPR = OPTION_EXPR___MINUS__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Extract</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_REF___EXTRACT = OPTION_EXPR___EXTRACT;

	/**
	 * The number of operations of the '<em>Visibility Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_REF_OPERATION_COUNT = OPTION_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.core.impl.OptionRefImpl <em>Option Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.core.impl.OptionRefImpl
	 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getOptionRef()
	 * @generated
	 */
	int OPTION_REF = 25;

	/**
	 * The feature id for the '<em><b>Referenced Options</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_REF__REFERENCED_OPTIONS = OPTION_EXPR__REFERENCED_OPTIONS;

	/**
	 * The feature id for the '<em><b>Referenced Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_REF__REFERENCED_DIMENSIONS = OPTION_EXPR__REFERENCED_DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Option</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_REF__OPTION = OPTION_EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Option Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_REF_FEATURE_COUNT = OPTION_EXPR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_REF___APPLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = OPTION_EXPR___APPLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_REF___APPLY__OPTIONBINDING = OPTION_EXPR___APPLY__OPTIONBINDING;

	/**
	 * The operation id for the '<em>Not</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_REF___NOT = OPTION_EXPR___NOT;

	/**
	 * The operation id for the '<em>And</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_REF___AND__OPTIONEXPR = OPTION_EXPR___AND__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Or</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_REF___OR__OPTIONEXPR = OPTION_EXPR___OR__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Xor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_REF___XOR__OPTIONEXPR = OPTION_EXPR___XOR__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Implies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_REF___IMPLIES__OPTIONEXPR = OPTION_EXPR___IMPLIES__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Iff</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_REF___IFF__OPTIONEXPR = OPTION_EXPR___IFF__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Nand</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_REF___NAND__OPTIONEXPR = OPTION_EXPR___NAND__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Minus</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_REF___MINUS__OPTIONEXPR = OPTION_EXPR___MINUS__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Extract</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_REF___EXTRACT = OPTION_EXPR___EXTRACT;

	/**
	 * The number of operations of the '<em>Option Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_REF_OPERATION_COUNT = OPTION_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.core.impl.NegExprImpl <em>Neg Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.core.impl.NegExprImpl
	 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getNegExpr()
	 * @generated
	 */
	int NEG_EXPR = 26;

	/**
	 * The feature id for the '<em><b>Referenced Options</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEG_EXPR__REFERENCED_OPTIONS = OPTION_EXPR__REFERENCED_OPTIONS;

	/**
	 * The feature id for the '<em><b>Referenced Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEG_EXPR__REFERENCED_DIMENSIONS = OPTION_EXPR__REFERENCED_DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Neg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEG_EXPR__NEG = OPTION_EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Neg Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEG_EXPR_FEATURE_COUNT = OPTION_EXPR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEG_EXPR___APPLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = OPTION_EXPR___APPLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEG_EXPR___APPLY__OPTIONBINDING = OPTION_EXPR___APPLY__OPTIONBINDING;

	/**
	 * The operation id for the '<em>Not</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEG_EXPR___NOT = OPTION_EXPR___NOT;

	/**
	 * The operation id for the '<em>And</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEG_EXPR___AND__OPTIONEXPR = OPTION_EXPR___AND__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Or</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEG_EXPR___OR__OPTIONEXPR = OPTION_EXPR___OR__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Xor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEG_EXPR___XOR__OPTIONEXPR = OPTION_EXPR___XOR__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Implies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEG_EXPR___IMPLIES__OPTIONEXPR = OPTION_EXPR___IMPLIES__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Iff</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEG_EXPR___IFF__OPTIONEXPR = OPTION_EXPR___IFF__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Nand</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEG_EXPR___NAND__OPTIONEXPR = OPTION_EXPR___NAND__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Minus</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEG_EXPR___MINUS__OPTIONEXPR = OPTION_EXPR___MINUS__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Extract</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEG_EXPR___EXTRACT = OPTION_EXPR___EXTRACT;

	/**
	 * The number of operations of the '<em>Neg Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEG_EXPR_OPERATION_COUNT = OPTION_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.core.impl.BinaryExprImpl <em>Binary Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.core.impl.BinaryExprImpl
	 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getBinaryExpr()
	 * @generated
	 */
	int BINARY_EXPR = 27;

	/**
	 * The feature id for the '<em><b>Referenced Options</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPR__REFERENCED_OPTIONS = OPTION_EXPR__REFERENCED_OPTIONS;

	/**
	 * The feature id for the '<em><b>Referenced Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPR__REFERENCED_DIMENSIONS = OPTION_EXPR__REFERENCED_DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPR__LEFT = OPTION_EXPR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPR__RIGHT = OPTION_EXPR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binary Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPR_FEATURE_COUNT = OPTION_EXPR_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPR___APPLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = OPTION_EXPR___APPLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPR___APPLY__OPTIONBINDING = OPTION_EXPR___APPLY__OPTIONBINDING;

	/**
	 * The operation id for the '<em>Not</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPR___NOT = OPTION_EXPR___NOT;

	/**
	 * The operation id for the '<em>And</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPR___AND__OPTIONEXPR = OPTION_EXPR___AND__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Or</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPR___OR__OPTIONEXPR = OPTION_EXPR___OR__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Xor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPR___XOR__OPTIONEXPR = OPTION_EXPR___XOR__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Implies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPR___IMPLIES__OPTIONEXPR = OPTION_EXPR___IMPLIES__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Iff</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPR___IFF__OPTIONEXPR = OPTION_EXPR___IFF__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Nand</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPR___NAND__OPTIONEXPR = OPTION_EXPR___NAND__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Minus</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPR___MINUS__OPTIONEXPR = OPTION_EXPR___MINUS__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Extract</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPR___EXTRACT = OPTION_EXPR___EXTRACT;

	/**
	 * The number of operations of the '<em>Binary Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPR_OPERATION_COUNT = OPTION_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.core.impl.AndExprImpl <em>And Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.core.impl.AndExprImpl
	 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getAndExpr()
	 * @generated
	 */
	int AND_EXPR = 28;

	/**
	 * The feature id for the '<em><b>Referenced Options</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPR__REFERENCED_OPTIONS = BINARY_EXPR__REFERENCED_OPTIONS;

	/**
	 * The feature id for the '<em><b>Referenced Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPR__REFERENCED_DIMENSIONS = BINARY_EXPR__REFERENCED_DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPR__LEFT = BINARY_EXPR__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPR__RIGHT = BINARY_EXPR__RIGHT;

	/**
	 * The number of structural features of the '<em>And Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPR_FEATURE_COUNT = BINARY_EXPR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPR___APPLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = BINARY_EXPR___APPLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPR___APPLY__OPTIONBINDING = BINARY_EXPR___APPLY__OPTIONBINDING;

	/**
	 * The operation id for the '<em>Not</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPR___NOT = BINARY_EXPR___NOT;

	/**
	 * The operation id for the '<em>And</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPR___AND__OPTIONEXPR = BINARY_EXPR___AND__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Or</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPR___OR__OPTIONEXPR = BINARY_EXPR___OR__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Xor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPR___XOR__OPTIONEXPR = BINARY_EXPR___XOR__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Implies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPR___IMPLIES__OPTIONEXPR = BINARY_EXPR___IMPLIES__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Iff</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPR___IFF__OPTIONEXPR = BINARY_EXPR___IFF__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Nand</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPR___NAND__OPTIONEXPR = BINARY_EXPR___NAND__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Minus</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPR___MINUS__OPTIONEXPR = BINARY_EXPR___MINUS__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Extract</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPR___EXTRACT = BINARY_EXPR___EXTRACT;

	/**
	 * The number of operations of the '<em>And Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPR_OPERATION_COUNT = BINARY_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.core.impl.OrExprImpl <em>Or Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.core.impl.OrExprImpl
	 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getOrExpr()
	 * @generated
	 */
	int OR_EXPR = 29;

	/**
	 * The feature id for the '<em><b>Referenced Options</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPR__REFERENCED_OPTIONS = BINARY_EXPR__REFERENCED_OPTIONS;

	/**
	 * The feature id for the '<em><b>Referenced Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPR__REFERENCED_DIMENSIONS = BINARY_EXPR__REFERENCED_DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPR__LEFT = BINARY_EXPR__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPR__RIGHT = BINARY_EXPR__RIGHT;

	/**
	 * The number of structural features of the '<em>Or Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPR_FEATURE_COUNT = BINARY_EXPR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPR___APPLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = BINARY_EXPR___APPLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPR___APPLY__OPTIONBINDING = BINARY_EXPR___APPLY__OPTIONBINDING;

	/**
	 * The operation id for the '<em>Not</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPR___NOT = BINARY_EXPR___NOT;

	/**
	 * The operation id for the '<em>And</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPR___AND__OPTIONEXPR = BINARY_EXPR___AND__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Or</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPR___OR__OPTIONEXPR = BINARY_EXPR___OR__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Xor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPR___XOR__OPTIONEXPR = BINARY_EXPR___XOR__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Implies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPR___IMPLIES__OPTIONEXPR = BINARY_EXPR___IMPLIES__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Iff</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPR___IFF__OPTIONEXPR = BINARY_EXPR___IFF__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Nand</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPR___NAND__OPTIONEXPR = BINARY_EXPR___NAND__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Minus</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPR___MINUS__OPTIONEXPR = BINARY_EXPR___MINUS__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Extract</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPR___EXTRACT = BINARY_EXPR___EXTRACT;

	/**
	 * The number of operations of the '<em>Or Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPR_OPERATION_COUNT = BINARY_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.core.impl.XorExprImpl <em>Xor Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.core.impl.XorExprImpl
	 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getXorExpr()
	 * @generated
	 */
	int XOR_EXPR = 30;

	/**
	 * The feature id for the '<em><b>Referenced Options</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_EXPR__REFERENCED_OPTIONS = BINARY_EXPR__REFERENCED_OPTIONS;

	/**
	 * The feature id for the '<em><b>Referenced Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_EXPR__REFERENCED_DIMENSIONS = BINARY_EXPR__REFERENCED_DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_EXPR__LEFT = BINARY_EXPR__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_EXPR__RIGHT = BINARY_EXPR__RIGHT;

	/**
	 * The number of structural features of the '<em>Xor Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_EXPR_FEATURE_COUNT = BINARY_EXPR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_EXPR___APPLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = BINARY_EXPR___APPLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_EXPR___APPLY__OPTIONBINDING = BINARY_EXPR___APPLY__OPTIONBINDING;

	/**
	 * The operation id for the '<em>Not</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_EXPR___NOT = BINARY_EXPR___NOT;

	/**
	 * The operation id for the '<em>And</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_EXPR___AND__OPTIONEXPR = BINARY_EXPR___AND__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Or</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_EXPR___OR__OPTIONEXPR = BINARY_EXPR___OR__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Xor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_EXPR___XOR__OPTIONEXPR = BINARY_EXPR___XOR__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Implies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_EXPR___IMPLIES__OPTIONEXPR = BINARY_EXPR___IMPLIES__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Iff</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_EXPR___IFF__OPTIONEXPR = BINARY_EXPR___IFF__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Nand</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_EXPR___NAND__OPTIONEXPR = BINARY_EXPR___NAND__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Minus</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_EXPR___MINUS__OPTIONEXPR = BINARY_EXPR___MINUS__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Extract</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_EXPR___EXTRACT = BINARY_EXPR___EXTRACT;

	/**
	 * The number of operations of the '<em>Xor Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_EXPR_OPERATION_COUNT = BINARY_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.core.impl.ImpliesExprImpl <em>Implies Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.core.impl.ImpliesExprImpl
	 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getImpliesExpr()
	 * @generated
	 */
	int IMPLIES_EXPR = 31;

	/**
	 * The feature id for the '<em><b>Referenced Options</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_EXPR__REFERENCED_OPTIONS = BINARY_EXPR__REFERENCED_OPTIONS;

	/**
	 * The feature id for the '<em><b>Referenced Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_EXPR__REFERENCED_DIMENSIONS = BINARY_EXPR__REFERENCED_DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_EXPR__LEFT = BINARY_EXPR__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_EXPR__RIGHT = BINARY_EXPR__RIGHT;

	/**
	 * The number of structural features of the '<em>Implies Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_EXPR_FEATURE_COUNT = BINARY_EXPR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_EXPR___APPLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = BINARY_EXPR___APPLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_EXPR___APPLY__OPTIONBINDING = BINARY_EXPR___APPLY__OPTIONBINDING;

	/**
	 * The operation id for the '<em>Not</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_EXPR___NOT = BINARY_EXPR___NOT;

	/**
	 * The operation id for the '<em>And</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_EXPR___AND__OPTIONEXPR = BINARY_EXPR___AND__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Or</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_EXPR___OR__OPTIONEXPR = BINARY_EXPR___OR__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Xor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_EXPR___XOR__OPTIONEXPR = BINARY_EXPR___XOR__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Implies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_EXPR___IMPLIES__OPTIONEXPR = BINARY_EXPR___IMPLIES__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Iff</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_EXPR___IFF__OPTIONEXPR = BINARY_EXPR___IFF__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Nand</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_EXPR___NAND__OPTIONEXPR = BINARY_EXPR___NAND__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Minus</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_EXPR___MINUS__OPTIONEXPR = BINARY_EXPR___MINUS__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Extract</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_EXPR___EXTRACT = BINARY_EXPR___EXTRACT;

	/**
	 * The number of operations of the '<em>Implies Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_EXPR_OPERATION_COUNT = BINARY_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.core.impl.BiconditionalExprImpl <em>Biconditional Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.core.impl.BiconditionalExprImpl
	 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getBiconditionalExpr()
	 * @generated
	 */
	int BICONDITIONAL_EXPR = 32;

	/**
	 * The feature id for the '<em><b>Referenced Options</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BICONDITIONAL_EXPR__REFERENCED_OPTIONS = BINARY_EXPR__REFERENCED_OPTIONS;

	/**
	 * The feature id for the '<em><b>Referenced Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BICONDITIONAL_EXPR__REFERENCED_DIMENSIONS = BINARY_EXPR__REFERENCED_DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BICONDITIONAL_EXPR__LEFT = BINARY_EXPR__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BICONDITIONAL_EXPR__RIGHT = BINARY_EXPR__RIGHT;

	/**
	 * The number of structural features of the '<em>Biconditional Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BICONDITIONAL_EXPR_FEATURE_COUNT = BINARY_EXPR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BICONDITIONAL_EXPR___APPLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = BINARY_EXPR___APPLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BICONDITIONAL_EXPR___APPLY__OPTIONBINDING = BINARY_EXPR___APPLY__OPTIONBINDING;

	/**
	 * The operation id for the '<em>Not</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BICONDITIONAL_EXPR___NOT = BINARY_EXPR___NOT;

	/**
	 * The operation id for the '<em>And</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BICONDITIONAL_EXPR___AND__OPTIONEXPR = BINARY_EXPR___AND__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Or</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BICONDITIONAL_EXPR___OR__OPTIONEXPR = BINARY_EXPR___OR__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Xor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BICONDITIONAL_EXPR___XOR__OPTIONEXPR = BINARY_EXPR___XOR__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Implies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BICONDITIONAL_EXPR___IMPLIES__OPTIONEXPR = BINARY_EXPR___IMPLIES__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Iff</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BICONDITIONAL_EXPR___IFF__OPTIONEXPR = BINARY_EXPR___IFF__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Nand</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BICONDITIONAL_EXPR___NAND__OPTIONEXPR = BINARY_EXPR___NAND__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Minus</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BICONDITIONAL_EXPR___MINUS__OPTIONEXPR = BINARY_EXPR___MINUS__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Extract</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BICONDITIONAL_EXPR___EXTRACT = BINARY_EXPR___EXTRACT;

	/**
	 * The number of operations of the '<em>Biconditional Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BICONDITIONAL_EXPR_OPERATION_COUNT = BINARY_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.core.impl.NandExprImpl <em>Nand Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.core.impl.NandExprImpl
	 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getNandExpr()
	 * @generated
	 */
	int NAND_EXPR = 33;

	/**
	 * The feature id for the '<em><b>Referenced Options</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAND_EXPR__REFERENCED_OPTIONS = BINARY_EXPR__REFERENCED_OPTIONS;

	/**
	 * The feature id for the '<em><b>Referenced Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAND_EXPR__REFERENCED_DIMENSIONS = BINARY_EXPR__REFERENCED_DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAND_EXPR__LEFT = BINARY_EXPR__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAND_EXPR__RIGHT = BINARY_EXPR__RIGHT;

	/**
	 * The number of structural features of the '<em>Nand Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAND_EXPR_FEATURE_COUNT = BINARY_EXPR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAND_EXPR___APPLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = BINARY_EXPR___APPLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAND_EXPR___APPLY__OPTIONBINDING = BINARY_EXPR___APPLY__OPTIONBINDING;

	/**
	 * The operation id for the '<em>Not</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAND_EXPR___NOT = BINARY_EXPR___NOT;

	/**
	 * The operation id for the '<em>And</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAND_EXPR___AND__OPTIONEXPR = BINARY_EXPR___AND__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Or</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAND_EXPR___OR__OPTIONEXPR = BINARY_EXPR___OR__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Xor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAND_EXPR___XOR__OPTIONEXPR = BINARY_EXPR___XOR__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Implies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAND_EXPR___IMPLIES__OPTIONEXPR = BINARY_EXPR___IMPLIES__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Iff</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAND_EXPR___IFF__OPTIONEXPR = BINARY_EXPR___IFF__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Nand</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAND_EXPR___NAND__OPTIONEXPR = BINARY_EXPR___NAND__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Minus</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAND_EXPR___MINUS__OPTIONEXPR = BINARY_EXPR___MINUS__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Extract</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAND_EXPR___EXTRACT = BINARY_EXPR___EXTRACT;

	/**
	 * The number of operations of the '<em>Nand Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAND_EXPR_OPERATION_COUNT = BINARY_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.core.impl.MinusExprImpl <em>Minus Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.core.impl.MinusExprImpl
	 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getMinusExpr()
	 * @generated
	 */
	int MINUS_EXPR = 34;

	/**
	 * The feature id for the '<em><b>Referenced Options</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_EXPR__REFERENCED_OPTIONS = BINARY_EXPR__REFERENCED_OPTIONS;

	/**
	 * The feature id for the '<em><b>Referenced Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_EXPR__REFERENCED_DIMENSIONS = BINARY_EXPR__REFERENCED_DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_EXPR__LEFT = BINARY_EXPR__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_EXPR__RIGHT = BINARY_EXPR__RIGHT;

	/**
	 * The number of structural features of the '<em>Minus Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_EXPR_FEATURE_COUNT = BINARY_EXPR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_EXPR___APPLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = BINARY_EXPR___APPLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_EXPR___APPLY__OPTIONBINDING = BINARY_EXPR___APPLY__OPTIONBINDING;

	/**
	 * The operation id for the '<em>Not</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_EXPR___NOT = BINARY_EXPR___NOT;

	/**
	 * The operation id for the '<em>And</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_EXPR___AND__OPTIONEXPR = BINARY_EXPR___AND__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Or</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_EXPR___OR__OPTIONEXPR = BINARY_EXPR___OR__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Xor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_EXPR___XOR__OPTIONEXPR = BINARY_EXPR___XOR__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Implies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_EXPR___IMPLIES__OPTIONEXPR = BINARY_EXPR___IMPLIES__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Iff</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_EXPR___IFF__OPTIONEXPR = BINARY_EXPR___IFF__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Nand</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_EXPR___NAND__OPTIONEXPR = BINARY_EXPR___NAND__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Minus</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_EXPR___MINUS__OPTIONEXPR = BINARY_EXPR___MINUS__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Extract</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_EXPR___EXTRACT = BINARY_EXPR___EXTRACT;

	/**
	 * The number of operations of the '<em>Minus Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_EXPR_OPERATION_COUNT = BINARY_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.core.impl.MergeExprImpl <em>Merge Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.core.impl.MergeExprImpl
	 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getMergeExpr()
	 * @generated
	 */
	int MERGE_EXPR = 35;

	/**
	 * The feature id for the '<em><b>Referenced Options</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_EXPR__REFERENCED_OPTIONS = BINARY_EXPR__REFERENCED_OPTIONS;

	/**
	 * The feature id for the '<em><b>Referenced Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_EXPR__REFERENCED_DIMENSIONS = BINARY_EXPR__REFERENCED_DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_EXPR__LEFT = BINARY_EXPR__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_EXPR__RIGHT = BINARY_EXPR__RIGHT;

	/**
	 * The feature id for the '<em><b>Base Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_EXPR__BASE_EXPR = BINARY_EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Merge Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_EXPR_FEATURE_COUNT = BINARY_EXPR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_EXPR___APPLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = BINARY_EXPR___APPLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_EXPR___APPLY__OPTIONBINDING = BINARY_EXPR___APPLY__OPTIONBINDING;

	/**
	 * The operation id for the '<em>Not</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_EXPR___NOT = BINARY_EXPR___NOT;

	/**
	 * The operation id for the '<em>And</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_EXPR___AND__OPTIONEXPR = BINARY_EXPR___AND__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Or</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_EXPR___OR__OPTIONEXPR = BINARY_EXPR___OR__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Xor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_EXPR___XOR__OPTIONEXPR = BINARY_EXPR___XOR__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Implies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_EXPR___IMPLIES__OPTIONEXPR = BINARY_EXPR___IMPLIES__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Iff</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_EXPR___IFF__OPTIONEXPR = BINARY_EXPR___IFF__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Nand</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_EXPR___NAND__OPTIONEXPR = BINARY_EXPR___NAND__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Minus</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_EXPR___MINUS__OPTIONEXPR = BINARY_EXPR___MINUS__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Extract</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_EXPR___EXTRACT = BINARY_EXPR___EXTRACT;

	/**
	 * The number of operations of the '<em>Merge Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_EXPR_OPERATION_COUNT = BINARY_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.core.impl.BigExprImpl <em>Big Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.core.impl.BigExprImpl
	 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getBigExpr()
	 * @generated
	 */
	int BIG_EXPR = 36;

	/**
	 * The feature id for the '<em><b>Referenced Options</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_EXPR__REFERENCED_OPTIONS = OPTION_EXPR__REFERENCED_OPTIONS;

	/**
	 * The feature id for the '<em><b>Referenced Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_EXPR__REFERENCED_DIMENSIONS = OPTION_EXPR__REFERENCED_DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_EXPR__CHILDREN = OPTION_EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Big Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_EXPR_FEATURE_COUNT = OPTION_EXPR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_EXPR___APPLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = OPTION_EXPR___APPLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_EXPR___APPLY__OPTIONBINDING = OPTION_EXPR___APPLY__OPTIONBINDING;

	/**
	 * The operation id for the '<em>Not</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_EXPR___NOT = OPTION_EXPR___NOT;

	/**
	 * The operation id for the '<em>And</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_EXPR___AND__OPTIONEXPR = OPTION_EXPR___AND__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Or</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_EXPR___OR__OPTIONEXPR = OPTION_EXPR___OR__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Xor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_EXPR___XOR__OPTIONEXPR = OPTION_EXPR___XOR__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Implies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_EXPR___IMPLIES__OPTIONEXPR = OPTION_EXPR___IMPLIES__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Iff</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_EXPR___IFF__OPTIONEXPR = OPTION_EXPR___IFF__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Nand</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_EXPR___NAND__OPTIONEXPR = OPTION_EXPR___NAND__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Minus</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_EXPR___MINUS__OPTIONEXPR = OPTION_EXPR___MINUS__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Extract</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_EXPR___EXTRACT = OPTION_EXPR___EXTRACT;

	/**
	 * The number of operations of the '<em>Big Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_EXPR_OPERATION_COUNT = OPTION_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.core.impl.BigAndExprImpl <em>Big And Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.core.impl.BigAndExprImpl
	 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getBigAndExpr()
	 * @generated
	 */
	int BIG_AND_EXPR = 37;

	/**
	 * The feature id for the '<em><b>Referenced Options</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_AND_EXPR__REFERENCED_OPTIONS = BIG_EXPR__REFERENCED_OPTIONS;

	/**
	 * The feature id for the '<em><b>Referenced Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_AND_EXPR__REFERENCED_DIMENSIONS = BIG_EXPR__REFERENCED_DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_AND_EXPR__CHILDREN = BIG_EXPR__CHILDREN;

	/**
	 * The number of structural features of the '<em>Big And Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_AND_EXPR_FEATURE_COUNT = BIG_EXPR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_AND_EXPR___APPLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = BIG_EXPR___APPLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_AND_EXPR___APPLY__OPTIONBINDING = BIG_EXPR___APPLY__OPTIONBINDING;

	/**
	 * The operation id for the '<em>Not</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_AND_EXPR___NOT = BIG_EXPR___NOT;

	/**
	 * The operation id for the '<em>And</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_AND_EXPR___AND__OPTIONEXPR = BIG_EXPR___AND__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Or</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_AND_EXPR___OR__OPTIONEXPR = BIG_EXPR___OR__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Xor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_AND_EXPR___XOR__OPTIONEXPR = BIG_EXPR___XOR__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Implies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_AND_EXPR___IMPLIES__OPTIONEXPR = BIG_EXPR___IMPLIES__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Iff</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_AND_EXPR___IFF__OPTIONEXPR = BIG_EXPR___IFF__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Nand</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_AND_EXPR___NAND__OPTIONEXPR = BIG_EXPR___NAND__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Minus</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_AND_EXPR___MINUS__OPTIONEXPR = BIG_EXPR___MINUS__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Extract</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_AND_EXPR___EXTRACT = BIG_EXPR___EXTRACT;

	/**
	 * The number of operations of the '<em>Big And Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_AND_EXPR_OPERATION_COUNT = BIG_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.core.impl.BigOrExprImpl <em>Big Or Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.core.impl.BigOrExprImpl
	 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getBigOrExpr()
	 * @generated
	 */
	int BIG_OR_EXPR = 38;

	/**
	 * The feature id for the '<em><b>Referenced Options</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_OR_EXPR__REFERENCED_OPTIONS = BIG_EXPR__REFERENCED_OPTIONS;

	/**
	 * The feature id for the '<em><b>Referenced Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_OR_EXPR__REFERENCED_DIMENSIONS = BIG_EXPR__REFERENCED_DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_OR_EXPR__CHILDREN = BIG_EXPR__CHILDREN;

	/**
	 * The number of structural features of the '<em>Big Or Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_OR_EXPR_FEATURE_COUNT = BIG_EXPR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_OR_EXPR___APPLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = BIG_EXPR___APPLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_OR_EXPR___APPLY__OPTIONBINDING = BIG_EXPR___APPLY__OPTIONBINDING;

	/**
	 * The operation id for the '<em>Not</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_OR_EXPR___NOT = BIG_EXPR___NOT;

	/**
	 * The operation id for the '<em>And</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_OR_EXPR___AND__OPTIONEXPR = BIG_EXPR___AND__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Or</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_OR_EXPR___OR__OPTIONEXPR = BIG_EXPR___OR__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Xor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_OR_EXPR___XOR__OPTIONEXPR = BIG_EXPR___XOR__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Implies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_OR_EXPR___IMPLIES__OPTIONEXPR = BIG_EXPR___IMPLIES__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Iff</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_OR_EXPR___IFF__OPTIONEXPR = BIG_EXPR___IFF__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Nand</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_OR_EXPR___NAND__OPTIONEXPR = BIG_EXPR___NAND__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Minus</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_OR_EXPR___MINUS__OPTIONEXPR = BIG_EXPR___MINUS__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Extract</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_OR_EXPR___EXTRACT = BIG_EXPR___EXTRACT;

	/**
	 * The number of operations of the '<em>Big Or Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_OR_EXPR_OPERATION_COUNT = BIG_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.core.impl.BigXorExprImpl <em>Big Xor Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.core.impl.BigXorExprImpl
	 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getBigXorExpr()
	 * @generated
	 */
	int BIG_XOR_EXPR = 39;

	/**
	 * The feature id for the '<em><b>Referenced Options</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_XOR_EXPR__REFERENCED_OPTIONS = BIG_EXPR__REFERENCED_OPTIONS;

	/**
	 * The feature id for the '<em><b>Referenced Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_XOR_EXPR__REFERENCED_DIMENSIONS = BIG_EXPR__REFERENCED_DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_XOR_EXPR__CHILDREN = BIG_EXPR__CHILDREN;

	/**
	 * The number of structural features of the '<em>Big Xor Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_XOR_EXPR_FEATURE_COUNT = BIG_EXPR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_XOR_EXPR___APPLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = BIG_EXPR___APPLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_XOR_EXPR___APPLY__OPTIONBINDING = BIG_EXPR___APPLY__OPTIONBINDING;

	/**
	 * The operation id for the '<em>Not</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_XOR_EXPR___NOT = BIG_EXPR___NOT;

	/**
	 * The operation id for the '<em>And</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_XOR_EXPR___AND__OPTIONEXPR = BIG_EXPR___AND__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Or</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_XOR_EXPR___OR__OPTIONEXPR = BIG_EXPR___OR__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Xor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_XOR_EXPR___XOR__OPTIONEXPR = BIG_EXPR___XOR__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Implies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_XOR_EXPR___IMPLIES__OPTIONEXPR = BIG_EXPR___IMPLIES__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Iff</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_XOR_EXPR___IFF__OPTIONEXPR = BIG_EXPR___IFF__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Nand</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_XOR_EXPR___NAND__OPTIONEXPR = BIG_EXPR___NAND__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Minus</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_XOR_EXPR___MINUS__OPTIONEXPR = BIG_EXPR___MINUS__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Extract</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_XOR_EXPR___EXTRACT = BIG_EXPR___EXTRACT;

	/**
	 * The number of operations of the '<em>Big Xor Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_XOR_EXPR_OPERATION_COUNT = BIG_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.core.impl.BigNandExprImpl <em>Big Nand Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.core.impl.BigNandExprImpl
	 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getBigNandExpr()
	 * @generated
	 */
	int BIG_NAND_EXPR = 40;

	/**
	 * The feature id for the '<em><b>Referenced Options</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_NAND_EXPR__REFERENCED_OPTIONS = BIG_EXPR__REFERENCED_OPTIONS;

	/**
	 * The feature id for the '<em><b>Referenced Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_NAND_EXPR__REFERENCED_DIMENSIONS = BIG_EXPR__REFERENCED_DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_NAND_EXPR__CHILDREN = BIG_EXPR__CHILDREN;

	/**
	 * The number of structural features of the '<em>Big Nand Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_NAND_EXPR_FEATURE_COUNT = BIG_EXPR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_NAND_EXPR___APPLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = BIG_EXPR___APPLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_NAND_EXPR___APPLY__OPTIONBINDING = BIG_EXPR___APPLY__OPTIONBINDING;

	/**
	 * The operation id for the '<em>Not</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_NAND_EXPR___NOT = BIG_EXPR___NOT;

	/**
	 * The operation id for the '<em>And</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_NAND_EXPR___AND__OPTIONEXPR = BIG_EXPR___AND__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Or</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_NAND_EXPR___OR__OPTIONEXPR = BIG_EXPR___OR__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Xor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_NAND_EXPR___XOR__OPTIONEXPR = BIG_EXPR___XOR__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Implies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_NAND_EXPR___IMPLIES__OPTIONEXPR = BIG_EXPR___IMPLIES__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Iff</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_NAND_EXPR___IFF__OPTIONEXPR = BIG_EXPR___IFF__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Nand</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_NAND_EXPR___NAND__OPTIONEXPR = BIG_EXPR___NAND__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Minus</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_NAND_EXPR___MINUS__OPTIONEXPR = BIG_EXPR___MINUS__OPTIONEXPR;

	/**
	 * The operation id for the '<em>Extract</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_NAND_EXPR___EXTRACT = BIG_EXPR___EXTRACT;

	/**
	 * The number of operations of the '<em>Big Nand Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_NAND_EXPR_OPERATION_COUNT = BIG_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.core.Tristate <em>Tristate</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.core.Tristate
	 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getTristate()
	 * @generated
	 */
	int TRISTATE = 41;


	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.core.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.Repository
	 * @generated
	 */
	EClass getRepository();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai1.supermod.mm.core.Repository#getProductSpace <em>Product Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Product Space</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.Repository#getProductSpace()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_ProductSpace();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai1.supermod.mm.core.Repository#getVersionSpace <em>Version Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Version Space</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.Repository#getVersionSpace()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_VersionSpace();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.core.Repository#getVisibilityForest <em>Visibility Forest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Visibility Forest</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.Repository#getVisibilityForest()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_VisibilityForest();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai1.supermod.mm.core.Repository#getModuleId <em>Module Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module Id</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.Repository#getModuleId()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_ModuleId();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.core.Dimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimension</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.Dimension
	 * @generated
	 */
	EClass getDimension();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai1.supermod.mm.core.Dimension#getDimensionName <em>Dimension Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dimension Name</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.Dimension#getDimensionName()
	 * @see #getDimension()
	 * @generated
	 */
	EAttribute getDimension_DimensionName();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.core.Dimension#getRootElements <em>Root Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Root Elements</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.Dimension#getRootElements()
	 * @see #getDimension()
	 * @generated
	 */
	EReference getDimension_RootElements();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.core.Dimension#getAllElements <em>All Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Elements</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.Dimension#getAllElements()
	 * @see #getDimension()
	 * @generated
	 */
	EReference getDimension_AllElements();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.core.VisibilityForest <em>Visibility Forest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visibility Forest</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.VisibilityForest
	 * @generated
	 */
	EClass getVisibilityForest();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ubt.ai1.supermod.mm.core.VisibilityForest#getVisibilities <em>Visibilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Visibilities</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.VisibilityForest#getVisibilities()
	 * @see #getVisibilityForest()
	 * @generated
	 */
	EReference getVisibilityForest_Visibilities();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.core.VisibilityForest#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repository</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.VisibilityForest#getRepository()
	 * @see #getVisibilityForest()
	 * @generated
	 */
	EReference getVisibilityForest_Repository();

	/**
	 * Returns the meta object for the '{@link de.ubt.ai1.supermod.mm.core.VisibilityForest#add(de.ubt.ai1.supermod.mm.core.OptionExpr) <em>Add</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add</em>' operation.
	 * @see de.ubt.ai1.supermod.mm.core.VisibilityForest#add(de.ubt.ai1.supermod.mm.core.OptionExpr)
	 * @generated
	 */
	EOperation getVisibilityForest__Add__OptionExpr();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.core.Visibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visibility</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.Visibility
	 * @generated
	 */
	EClass getVisibility();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai1.supermod.mm.core.Visibility#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.Visibility#getExpr()
	 * @see #getVisibility()
	 * @generated
	 */
	EReference getVisibility_Expr();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.core.ProductSpace <em>Product Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Space</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.ProductSpace
	 * @generated
	 */
	EClass getProductSpace();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.core.ProductSpace#getDimensions <em>Dimensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dimensions</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.ProductSpace#getDimensions()
	 * @see #getProductSpace()
	 * @generated
	 */
	EReference getProductSpace_Dimensions();

	/**
	 * Returns the meta object for the container reference '{@link de.ubt.ai1.supermod.mm.core.ProductSpace#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Repository</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.ProductSpace#getRepository()
	 * @see #getProductSpace()
	 * @generated
	 */
	EReference getProductSpace_Repository();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.core.ProductDimension <em>Product Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Dimension</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.ProductDimension
	 * @generated
	 */
	EClass getProductDimension();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.core.ProductDimension#getRootProductSpaceElements <em>Root Product Space Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Root Product Space Elements</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.ProductDimension#getRootProductSpaceElements()
	 * @see #getProductDimension()
	 * @generated
	 */
	EReference getProductDimension_RootProductSpaceElements();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.core.ProductDimension#getAllProductSpaceElements <em>All Product Space Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Product Space Elements</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.ProductDimension#getAllProductSpaceElements()
	 * @see #getProductDimension()
	 * @generated
	 */
	EReference getProductDimension_AllProductSpaceElements();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.core.ProductDimension#getProductSpace <em>Product Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Space</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.ProductDimension#getProductSpace()
	 * @see #getProductDimension()
	 * @generated
	 */
	EReference getProductDimension_ProductSpace();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.core.ProductSpaceElement <em>Product Space Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Space Element</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.ProductSpaceElement
	 * @generated
	 */
	EClass getProductSpaceElement();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.core.ProductSpaceElement#getProductDimension <em>Product Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Dimension</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.ProductSpaceElement#getProductDimension()
	 * @see #getProductSpaceElement()
	 * @generated
	 */
	EReference getProductSpaceElement_ProductDimension();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.core.ProductSpaceElement#getProductSpace <em>Product Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Space</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.ProductSpaceElement#getProductSpace()
	 * @see #getProductSpaceElement()
	 * @generated
	 */
	EReference getProductSpaceElement_ProductSpace();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.core.ProductSpaceElement#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Visibility</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.ProductSpaceElement#getVisibility()
	 * @see #getProductSpaceElement()
	 * @generated
	 */
	EReference getProductSpaceElement_Visibility();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.core.ProductSpaceElement#getSuperProductSpaceElement <em>Super Product Space Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Product Space Element</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.ProductSpaceElement#getSuperProductSpaceElement()
	 * @see #getProductSpaceElement()
	 * @generated
	 */
	EReference getProductSpaceElement_SuperProductSpaceElement();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.core.ProductSpaceElement#getSubProductSpaceElements <em>Sub Product Space Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Product Space Elements</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.ProductSpaceElement#getSubProductSpaceElements()
	 * @see #getProductSpaceElement()
	 * @generated
	 */
	EReference getProductSpaceElement_SubProductSpaceElements();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.core.ProductSpaceElement#getAllSuperProductSpaceElements <em>All Super Product Space Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Super Product Space Elements</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.ProductSpaceElement#getAllSuperProductSpaceElements()
	 * @see #getProductSpaceElement()
	 * @generated
	 */
	EReference getProductSpaceElement_AllSuperProductSpaceElements();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.core.ProductSpaceElement#getAllSubProductSpaceElements <em>All Sub Product Space Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Sub Product Space Elements</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.ProductSpaceElement#getAllSubProductSpaceElements()
	 * @see #getProductSpaceElement()
	 * @generated
	 */
	EReference getProductSpaceElement_AllSubProductSpaceElements();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.core.ProductSpaceElement#getCrossReferencedProductSpaceElements <em>Cross Referenced Product Space Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cross Referenced Product Space Elements</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.ProductSpaceElement#getCrossReferencedProductSpaceElements()
	 * @see #getProductSpaceElement()
	 * @generated
	 */
	EReference getProductSpaceElement_CrossReferencedProductSpaceElements();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.core.ProductSpaceElement#getCrossReferencingProductSpaceElements <em>Cross Referencing Product Space Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cross Referencing Product Space Elements</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.ProductSpaceElement#getCrossReferencingProductSpaceElements()
	 * @see #getProductSpaceElement()
	 * @generated
	 */
	EReference getProductSpaceElement_CrossReferencingProductSpaceElements();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.core.ProductSpaceElement#getHierarchicalVisibility <em>Hierarchical Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hierarchical Visibility</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.ProductSpaceElement#getHierarchicalVisibility()
	 * @see #getProductSpaceElement()
	 * @generated
	 */
	EReference getProductSpaceElement_HierarchicalVisibility();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.core.ProductSpaceElement#getSuperordinateVisibility <em>Superordinate Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Superordinate Visibility</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.ProductSpaceElement#getSuperordinateVisibility()
	 * @see #getProductSpaceElement()
	 * @generated
	 */
	EReference getProductSpaceElement_SuperordinateVisibility();

	/**
	 * Returns the meta object for the '{@link de.ubt.ai1.supermod.mm.core.ProductSpaceElement#isVisible(de.ubt.ai1.supermod.mm.core.OptionBinding, de.ubt.ai1.supermod.mm.core.VisibilityEvaluationCache) <em>Is Visible</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Visible</em>' operation.
	 * @see de.ubt.ai1.supermod.mm.core.ProductSpaceElement#isVisible(de.ubt.ai1.supermod.mm.core.OptionBinding, de.ubt.ai1.supermod.mm.core.VisibilityEvaluationCache)
	 * @generated
	 */
	EOperation getProductSpaceElement__IsVisible__OptionBinding_VisibilityEvaluationCache();

	/**
	 * Returns the meta object for the '{@link de.ubt.ai1.supermod.mm.core.ProductSpaceElement#isVisibleHierarchically(de.ubt.ai1.supermod.mm.core.OptionBinding, de.ubt.ai1.supermod.mm.core.VisibilityEvaluationCache) <em>Is Visible Hierarchically</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Visible Hierarchically</em>' operation.
	 * @see de.ubt.ai1.supermod.mm.core.ProductSpaceElement#isVisibleHierarchically(de.ubt.ai1.supermod.mm.core.OptionBinding, de.ubt.ai1.supermod.mm.core.VisibilityEvaluationCache)
	 * @generated
	 */
	EOperation getProductSpaceElement__IsVisibleHierarchically__OptionBinding_VisibilityEvaluationCache();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.core.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.core.Element#getSuperElement <em>Super Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Element</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.Element#getSuperElement()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_SuperElement();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.core.Element#getSubElements <em>Sub Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Elements</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.Element#getSubElements()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_SubElements();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.core.Element#getAllSuperElements <em>All Super Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Super Elements</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.Element#getAllSuperElements()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_AllSuperElements();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.core.Element#getAllSubElements <em>All Sub Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Sub Elements</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.Element#getAllSubElements()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_AllSubElements();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.core.Element#getCrossReferencedElements <em>Cross Referenced Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cross Referenced Elements</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.Element#getCrossReferencedElements()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_CrossReferencedElements();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.core.Element#getCrossReferencingElements <em>Cross Referencing Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cross Referencing Elements</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.Element#getCrossReferencingElements()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_CrossReferencingElements();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai1.supermod.mm.core.Element#getProxyUUID <em>Proxy UUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proxy UUID</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.Element#getProxyUUID()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_ProxyUUID();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai1.supermod.mm.core.Element#getTransactionId <em>Transaction Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction Id</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.Element#getTransactionId()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_TransactionId();

	/**
	 * Returns the meta object for the '{@link de.ubt.ai1.supermod.mm.core.Element#isProxy() <em>Is Proxy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Proxy</em>' operation.
	 * @see de.ubt.ai1.supermod.mm.core.Element#isProxy()
	 * @generated
	 */
	EOperation getElement__IsProxy();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.core.UUIDElement <em>UUID Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UUID Element</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.UUIDElement
	 * @generated
	 */
	EClass getUUIDElement();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai1.supermod.mm.core.UUIDElement#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.UUIDElement#getUuid()
	 * @see #getUUIDElement()
	 * @generated
	 */
	EAttribute getUUIDElement_Uuid();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.core.VersionSpace <em>Version Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version Space</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.VersionSpace
	 * @generated
	 */
	EClass getVersionSpace();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.core.VersionSpace#getDimensions <em>Dimensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dimensions</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.VersionSpace#getDimensions()
	 * @see #getVersionSpace()
	 * @generated
	 */
	EReference getVersionSpace_Dimensions();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.core.VersionSpace#getAllOptions <em>All Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Options</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.VersionSpace#getAllOptions()
	 * @see #getVersionSpace()
	 * @generated
	 */
	EReference getVersionSpace_AllOptions();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.core.VersionSpace#getAllInvariants <em>All Invariants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Invariants</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.VersionSpace#getAllInvariants()
	 * @see #getVersionSpace()
	 * @generated
	 */
	EReference getVersionSpace_AllInvariants();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.core.VersionSpace#getAllPreferences <em>All Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Preferences</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.VersionSpace#getAllPreferences()
	 * @see #getVersionSpace()
	 * @generated
	 */
	EReference getVersionSpace_AllPreferences();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.core.VersionSpace#getAllDefaultBindings <em>All Default Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Default Bindings</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.VersionSpace#getAllDefaultBindings()
	 * @see #getVersionSpace()
	 * @generated
	 */
	EReference getVersionSpace_AllDefaultBindings();

	/**
	 * Returns the meta object for the container reference '{@link de.ubt.ai1.supermod.mm.core.VersionSpace#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Repository</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.VersionSpace#getRepository()
	 * @see #getVersionSpace()
	 * @generated
	 */
	EReference getVersionSpace_Repository();

	/**
	 * Returns the meta object for the '{@link de.ubt.ai1.supermod.mm.core.VersionSpace#validate(de.ubt.ai1.supermod.mm.core.OptionBinding) <em>Validate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate</em>' operation.
	 * @see de.ubt.ai1.supermod.mm.core.VersionSpace#validate(de.ubt.ai1.supermod.mm.core.OptionBinding)
	 * @generated
	 */
	EOperation getVersionSpace__Validate__OptionBinding();

	/**
	 * Returns the meta object for the '{@link de.ubt.ai1.supermod.mm.core.VersionSpace#isComplete(de.ubt.ai1.supermod.mm.core.OptionBinding) <em>Is Complete</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Complete</em>' operation.
	 * @see de.ubt.ai1.supermod.mm.core.VersionSpace#isComplete(de.ubt.ai1.supermod.mm.core.OptionBinding)
	 * @generated
	 */
	EOperation getVersionSpace__IsComplete__OptionBinding();

	/**
	 * Returns the meta object for the '{@link de.ubt.ai1.supermod.mm.core.VersionSpace#isSatisfiable(de.ubt.ai1.supermod.mm.core.OptionBinding) <em>Is Satisfiable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Satisfiable</em>' operation.
	 * @see de.ubt.ai1.supermod.mm.core.VersionSpace#isSatisfiable(de.ubt.ai1.supermod.mm.core.OptionBinding)
	 * @generated
	 */
	EOperation getVersionSpace__IsSatisfiable__OptionBinding();

	/**
	 * Returns the meta object for the '{@link de.ubt.ai1.supermod.mm.core.VersionSpace#applyAllPreferences(de.ubt.ai1.supermod.mm.core.OptionBinding) <em>Apply All Preferences</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply All Preferences</em>' operation.
	 * @see de.ubt.ai1.supermod.mm.core.VersionSpace#applyAllPreferences(de.ubt.ai1.supermod.mm.core.OptionBinding)
	 * @generated
	 */
	EOperation getVersionSpace__ApplyAllPreferences__OptionBinding();

	/**
	 * Returns the meta object for the '{@link de.ubt.ai1.supermod.mm.core.VersionSpace#applyAllDefaults(de.ubt.ai1.supermod.mm.core.OptionBinding) <em>Apply All Defaults</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply All Defaults</em>' operation.
	 * @see de.ubt.ai1.supermod.mm.core.VersionSpace#applyAllDefaults(de.ubt.ai1.supermod.mm.core.OptionBinding)
	 * @generated
	 */
	EOperation getVersionSpace__ApplyAllDefaults__OptionBinding();

	/**
	 * Returns the meta object for the '{@link de.ubt.ai1.supermod.mm.core.VersionSpace#applyAllCompletions(de.ubt.ai1.supermod.mm.core.OptionBinding) <em>Apply All Completions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply All Completions</em>' operation.
	 * @see de.ubt.ai1.supermod.mm.core.VersionSpace#applyAllCompletions(de.ubt.ai1.supermod.mm.core.OptionBinding)
	 * @generated
	 */
	EOperation getVersionSpace__ApplyAllCompletions__OptionBinding();

	/**
	 * Returns the meta object for the '{@link de.ubt.ai1.supermod.mm.core.VersionSpace#getOption(java.lang.String) <em>Get Option</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Option</em>' operation.
	 * @see de.ubt.ai1.supermod.mm.core.VersionSpace#getOption(java.lang.String)
	 * @generated
	 */
	EOperation getVersionSpace__GetOption__String();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.core.VersionDimension <em>Version Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version Dimension</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.VersionDimension
	 * @generated
	 */
	EClass getVersionDimension();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.core.VersionDimension#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Options</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.VersionDimension#getOptions()
	 * @see #getVersionDimension()
	 * @generated
	 */
	EReference getVersionDimension_Options();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.core.VersionDimension#getInvariants <em>Invariants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Invariants</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.VersionDimension#getInvariants()
	 * @see #getVersionDimension()
	 * @generated
	 */
	EReference getVersionDimension_Invariants();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.core.VersionDimension#getPreferences <em>Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Preferences</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.VersionDimension#getPreferences()
	 * @see #getVersionDimension()
	 * @generated
	 */
	EReference getVersionDimension_Preferences();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.core.VersionDimension#getDefaultBindings <em>Default Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Default Bindings</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.VersionDimension#getDefaultBindings()
	 * @see #getVersionDimension()
	 * @generated
	 */
	EReference getVersionDimension_DefaultBindings();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.core.VersionDimension#getRootVersionSpaceElements <em>Root Version Space Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Root Version Space Elements</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.VersionDimension#getRootVersionSpaceElements()
	 * @see #getVersionDimension()
	 * @generated
	 */
	EReference getVersionDimension_RootVersionSpaceElements();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.core.VersionDimension#getAllVersionSpaceElements <em>All Version Space Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Version Space Elements</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.VersionDimension#getAllVersionSpaceElements()
	 * @see #getVersionDimension()
	 * @generated
	 */
	EReference getVersionDimension_AllVersionSpaceElements();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.core.VersionDimension#getVersionSpace <em>Version Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Version Space</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.VersionDimension#getVersionSpace()
	 * @see #getVersionDimension()
	 * @generated
	 */
	EReference getVersionDimension_VersionSpace();

	/**
	 * Returns the meta object for the '{@link de.ubt.ai1.supermod.mm.core.VersionDimension#validate(de.ubt.ai1.supermod.mm.core.OptionBinding) <em>Validate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate</em>' operation.
	 * @see de.ubt.ai1.supermod.mm.core.VersionDimension#validate(de.ubt.ai1.supermod.mm.core.OptionBinding)
	 * @generated
	 */
	EOperation getVersionDimension__Validate__OptionBinding();

	/**
	 * Returns the meta object for the '{@link de.ubt.ai1.supermod.mm.core.VersionDimension#isComplete(de.ubt.ai1.supermod.mm.core.OptionBinding) <em>Is Complete</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Complete</em>' operation.
	 * @see de.ubt.ai1.supermod.mm.core.VersionDimension#isComplete(de.ubt.ai1.supermod.mm.core.OptionBinding)
	 * @generated
	 */
	EOperation getVersionDimension__IsComplete__OptionBinding();

	/**
	 * Returns the meta object for the '{@link de.ubt.ai1.supermod.mm.core.VersionDimension#isSatisfiable(de.ubt.ai1.supermod.mm.core.OptionBinding) <em>Is Satisfiable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Satisfiable</em>' operation.
	 * @see de.ubt.ai1.supermod.mm.core.VersionDimension#isSatisfiable(de.ubt.ai1.supermod.mm.core.OptionBinding)
	 * @generated
	 */
	EOperation getVersionDimension__IsSatisfiable__OptionBinding();

	/**
	 * Returns the meta object for the '{@link de.ubt.ai1.supermod.mm.core.VersionDimension#applyPreferences(de.ubt.ai1.supermod.mm.core.OptionBinding) <em>Apply Preferences</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply Preferences</em>' operation.
	 * @see de.ubt.ai1.supermod.mm.core.VersionDimension#applyPreferences(de.ubt.ai1.supermod.mm.core.OptionBinding)
	 * @generated
	 */
	EOperation getVersionDimension__ApplyPreferences__OptionBinding();

	/**
	 * Returns the meta object for the '{@link de.ubt.ai1.supermod.mm.core.VersionDimension#applyDefaults(de.ubt.ai1.supermod.mm.core.OptionBinding) <em>Apply Defaults</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply Defaults</em>' operation.
	 * @see de.ubt.ai1.supermod.mm.core.VersionDimension#applyDefaults(de.ubt.ai1.supermod.mm.core.OptionBinding)
	 * @generated
	 */
	EOperation getVersionDimension__ApplyDefaults__OptionBinding();

	/**
	 * Returns the meta object for the '{@link de.ubt.ai1.supermod.mm.core.VersionDimension#applyCompletions(de.ubt.ai1.supermod.mm.core.OptionBinding) <em>Apply Completions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply Completions</em>' operation.
	 * @see de.ubt.ai1.supermod.mm.core.VersionDimension#applyCompletions(de.ubt.ai1.supermod.mm.core.OptionBinding)
	 * @generated
	 */
	EOperation getVersionDimension__ApplyCompletions__OptionBinding();

	/**
	 * Returns the meta object for the '{@link de.ubt.ai1.supermod.mm.core.VersionDimension#getOption(java.lang.String) <em>Get Option</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Option</em>' operation.
	 * @see de.ubt.ai1.supermod.mm.core.VersionDimension#getOption(java.lang.String)
	 * @generated
	 */
	EOperation getVersionDimension__GetOption__String();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.core.HybridDimension <em>Hybrid Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hybrid Dimension</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.HybridDimension
	 * @generated
	 */
	EClass getHybridDimension();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.core.HybridDimension#getRootHybridElements <em>Root Hybrid Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Root Hybrid Elements</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.HybridDimension#getRootHybridElements()
	 * @see #getHybridDimension()
	 * @generated
	 */
	EReference getHybridDimension_RootHybridElements();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.core.HybridDimension#getAllHybridElements <em>All Hybrid Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Hybrid Elements</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.HybridDimension#getAllHybridElements()
	 * @see #getHybridDimension()
	 * @generated
	 */
	EReference getHybridDimension_AllHybridElements();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.core.HybridElement <em>Hybrid Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hybrid Element</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.HybridElement
	 * @generated
	 */
	EClass getHybridElement();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.core.HybridElement#getSuperHybridElement <em>Super Hybrid Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Hybrid Element</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.HybridElement#getSuperHybridElement()
	 * @see #getHybridElement()
	 * @generated
	 */
	EReference getHybridElement_SuperHybridElement();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.core.HybridElement#getSubHybridElements <em>Sub Hybrid Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Hybrid Elements</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.HybridElement#getSubHybridElements()
	 * @see #getHybridElement()
	 * @generated
	 */
	EReference getHybridElement_SubHybridElements();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.core.HybridElement#getAllSuperHybridElements <em>All Super Hybrid Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Super Hybrid Elements</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.HybridElement#getAllSuperHybridElements()
	 * @see #getHybridElement()
	 * @generated
	 */
	EReference getHybridElement_AllSuperHybridElements();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.core.HybridElement#getAllSubHybridElements <em>All Sub Hybrid Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Sub Hybrid Elements</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.HybridElement#getAllSubHybridElements()
	 * @see #getHybridElement()
	 * @generated
	 */
	EReference getHybridElement_AllSubHybridElements();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.core.HybridElement#getCrossReferencedHybridElements <em>Cross Referenced Hybrid Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cross Referenced Hybrid Elements</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.HybridElement#getCrossReferencedHybridElements()
	 * @see #getHybridElement()
	 * @generated
	 */
	EReference getHybridElement_CrossReferencedHybridElements();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.core.HybridElement#getCrossReferencingHybridElements <em>Cross Referencing Hybrid Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cross Referencing Hybrid Elements</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.HybridElement#getCrossReferencingHybridElements()
	 * @see #getHybridElement()
	 * @generated
	 */
	EReference getHybridElement_CrossReferencingHybridElements();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.core.RuleBaseElement <em>Rule Base Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Base Element</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.RuleBaseElement
	 * @generated
	 */
	EClass getRuleBaseElement();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai1.supermod.mm.core.RuleBaseElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.RuleBaseElement#getName()
	 * @see #getRuleBaseElement()
	 * @generated
	 */
	EAttribute getRuleBaseElement_Name();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.core.RuleBaseElement#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dimension</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.RuleBaseElement#getDimension()
	 * @see #getRuleBaseElement()
	 * @generated
	 */
	EReference getRuleBaseElement_Dimension();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.core.RuleBaseElement#getHighLevelConcept <em>High Level Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>High Level Concept</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.RuleBaseElement#getHighLevelConcept()
	 * @see #getRuleBaseElement()
	 * @generated
	 */
	EReference getRuleBaseElement_HighLevelConcept();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.core.Invariant <em>Invariant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invariant</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.Invariant
	 * @generated
	 */
	EClass getInvariant();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai1.supermod.mm.core.Invariant#getOptionExpr <em>Option Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Option Expr</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.Invariant#getOptionExpr()
	 * @see #getInvariant()
	 * @generated
	 */
	EReference getInvariant_OptionExpr();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.core.Preference <em>Preference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Preference</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.Preference
	 * @generated
	 */
	EClass getPreference();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.core.Preference#getOption <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Option</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.Preference#getOption()
	 * @see #getPreference()
	 * @generated
	 */
	EReference getPreference_Option();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai1.supermod.mm.core.Preference#getOptionExpr <em>Option Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Option Expr</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.Preference#getOptionExpr()
	 * @see #getPreference()
	 * @generated
	 */
	EReference getPreference_OptionExpr();

	/**
	 * Returns the meta object for the '{@link de.ubt.ai1.supermod.mm.core.Preference#toImplicationInvariant() <em>To Implication Invariant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To Implication Invariant</em>' operation.
	 * @see de.ubt.ai1.supermod.mm.core.Preference#toImplicationInvariant()
	 * @generated
	 */
	EOperation getPreference__ToImplicationInvariant();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.core.DefaultBinding <em>Default Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Binding</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.DefaultBinding
	 * @generated
	 */
	EClass getDefaultBinding();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.core.DefaultBinding#getOption <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Option</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.DefaultBinding#getOption()
	 * @see #getDefaultBinding()
	 * @generated
	 */
	EReference getDefaultBinding_Option();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai1.supermod.mm.core.DefaultBinding#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.DefaultBinding#getState()
	 * @see #getDefaultBinding()
	 * @generated
	 */
	EAttribute getDefaultBinding_State();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.core.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.Option
	 * @generated
	 */
	EClass getOption();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.core.OptionBinding <em>Option Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option Binding</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.OptionBinding
	 * @generated
	 */
	EClass getOptionBinding();

	/**
	 * Returns the meta object for the map '{@link de.ubt.ai1.supermod.mm.core.OptionBinding#getBoundOptions <em>Bound Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Bound Options</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.OptionBinding#getBoundOptions()
	 * @see #getOptionBinding()
	 * @generated
	 */
	EReference getOptionBinding_BoundOptions();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai1.supermod.mm.core.OptionBinding#getNumberOfBindings <em>Number Of Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Bindings</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.OptionBinding#getNumberOfBindings()
	 * @see #getOptionBinding()
	 * @generated
	 */
	EAttribute getOptionBinding_NumberOfBindings();

	/**
	 * Returns the meta object for the '{@link de.ubt.ai1.supermod.mm.core.OptionBinding#getState(de.ubt.ai1.supermod.mm.core.Option) <em>Get State</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get State</em>' operation.
	 * @see de.ubt.ai1.supermod.mm.core.OptionBinding#getState(de.ubt.ai1.supermod.mm.core.Option)
	 * @generated
	 */
	EOperation getOptionBinding__GetState__Option();

	/**
	 * Returns the meta object for the '{@link de.ubt.ai1.supermod.mm.core.OptionBinding#implies(de.ubt.ai1.supermod.mm.core.OptionBinding) <em>Implies</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Implies</em>' operation.
	 * @see de.ubt.ai1.supermod.mm.core.OptionBinding#implies(de.ubt.ai1.supermod.mm.core.OptionBinding)
	 * @generated
	 */
	EOperation getOptionBinding__Implies__OptionBinding();

	/**
	 * Returns the meta object for the '{@link de.ubt.ai1.supermod.mm.core.OptionBinding#toVisibility() <em>To Visibility</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To Visibility</em>' operation.
	 * @see de.ubt.ai1.supermod.mm.core.OptionBinding#toVisibility()
	 * @generated
	 */
	EOperation getOptionBinding__ToVisibility();

	/**
	 * Returns the meta object for the '{@link de.ubt.ai1.supermod.mm.core.OptionBinding#bind(de.ubt.ai1.supermod.mm.core.Option, de.ubt.ai1.supermod.mm.core.Tristate) <em>Bind</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Bind</em>' operation.
	 * @see de.ubt.ai1.supermod.mm.core.OptionBinding#bind(de.ubt.ai1.supermod.mm.core.Option, de.ubt.ai1.supermod.mm.core.Tristate)
	 * @generated
	 */
	EOperation getOptionBinding__Bind__Option_Tristate();

	/**
	 * Returns the meta object for the '{@link de.ubt.ai1.supermod.mm.core.OptionBinding#combine(de.ubt.ai1.supermod.mm.core.OptionBinding) <em>Combine</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Combine</em>' operation.
	 * @see de.ubt.ai1.supermod.mm.core.OptionBinding#combine(de.ubt.ai1.supermod.mm.core.OptionBinding)
	 * @generated
	 */
	EOperation getOptionBinding__Combine__OptionBinding();

	/**
	 * Returns the meta object for the '{@link de.ubt.ai1.supermod.mm.core.OptionBinding#clear() <em>Clear</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clear</em>' operation.
	 * @see de.ubt.ai1.supermod.mm.core.OptionBinding#clear()
	 * @generated
	 */
	EOperation getOptionBinding__Clear();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Option To Tristate Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option To Tristate Map Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyType="de.ubt.ai1.supermod.mm.core.Option"
	 *        valueDataType="de.ubt.ai1.supermod.mm.core.Tristate"
	 * @generated
	 */
	EClass getOptionToTristateMapEntry();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getOptionToTristateMapEntry()
	 * @generated
	 */
	EReference getOptionToTristateMapEntry_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getOptionToTristateMapEntry()
	 * @generated
	 */
	EAttribute getOptionToTristateMapEntry_Value();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.core.VisibilityEvaluationCache <em>Visibility Evaluation Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visibility Evaluation Cache</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.VisibilityEvaluationCache
	 * @generated
	 */
	EClass getVisibilityEvaluationCache();

	/**
	 * Returns the meta object for the map '{@link de.ubt.ai1.supermod.mm.core.VisibilityEvaluationCache#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Entries</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.VisibilityEvaluationCache#getEntries()
	 * @see #getVisibilityEvaluationCache()
	 * @generated
	 */
	EReference getVisibilityEvaluationCache_Entries();

	/**
	 * Returns the meta object for the '{@link de.ubt.ai1.supermod.mm.core.VisibilityEvaluationCache#invalidate() <em>Invalidate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Invalidate</em>' operation.
	 * @see de.ubt.ai1.supermod.mm.core.VisibilityEvaluationCache#invalidate()
	 * @generated
	 */
	EOperation getVisibilityEvaluationCache__Invalidate();

	/**
	 * Returns the meta object for the '{@link de.ubt.ai1.supermod.mm.core.VisibilityEvaluationCache#save(de.ubt.ai1.supermod.mm.core.OptionExpr, de.ubt.ai1.supermod.mm.core.Tristate) <em>Save</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Save</em>' operation.
	 * @see de.ubt.ai1.supermod.mm.core.VisibilityEvaluationCache#save(de.ubt.ai1.supermod.mm.core.OptionExpr, de.ubt.ai1.supermod.mm.core.Tristate)
	 * @generated
	 */
	EOperation getVisibilityEvaluationCache__Save__OptionExpr_Tristate();

	/**
	 * Returns the meta object for the '{@link de.ubt.ai1.supermod.mm.core.VisibilityEvaluationCache#get(de.ubt.ai1.supermod.mm.core.OptionExpr) <em>Get</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get</em>' operation.
	 * @see de.ubt.ai1.supermod.mm.core.VisibilityEvaluationCache#get(de.ubt.ai1.supermod.mm.core.OptionExpr)
	 * @generated
	 */
	EOperation getVisibilityEvaluationCache__Get__OptionExpr();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Option Expr To Tristate Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option Expr To Tristate Map Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyType="de.ubt.ai1.supermod.mm.core.OptionExpr"
	 *        valueDataType="de.ubt.ai1.supermod.mm.core.Tristate"
	 * @generated
	 */
	EClass getOptionExprToTristateMapEntry();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getOptionExprToTristateMapEntry()
	 * @generated
	 */
	EReference getOptionExprToTristateMapEntry_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getOptionExprToTristateMapEntry()
	 * @generated
	 */
	EAttribute getOptionExprToTristateMapEntry_Value();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.core.VersionSpaceElement <em>Version Space Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version Space Element</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.VersionSpaceElement
	 * @generated
	 */
	EClass getVersionSpaceElement();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.core.VersionSpaceElement#getVersionDimension <em>Version Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Version Dimension</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.VersionSpaceElement#getVersionDimension()
	 * @see #getVersionSpaceElement()
	 * @generated
	 */
	EReference getVersionSpaceElement_VersionDimension();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.core.VersionSpaceElement#getVersionSpace <em>Version Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Version Space</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.VersionSpaceElement#getVersionSpace()
	 * @see #getVersionSpaceElement()
	 * @generated
	 */
	EReference getVersionSpaceElement_VersionSpace();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.core.VersionSpaceElement#getSuperVersionSpaceElement <em>Super Version Space Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Version Space Element</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.VersionSpaceElement#getSuperVersionSpaceElement()
	 * @see #getVersionSpaceElement()
	 * @generated
	 */
	EReference getVersionSpaceElement_SuperVersionSpaceElement();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.core.VersionSpaceElement#getSubVersionSpaceElements <em>Sub Version Space Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Version Space Elements</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.VersionSpaceElement#getSubVersionSpaceElements()
	 * @see #getVersionSpaceElement()
	 * @generated
	 */
	EReference getVersionSpaceElement_SubVersionSpaceElements();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.core.VersionSpaceElement#getAllSuperVersionSpaceElements <em>All Super Version Space Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Super Version Space Elements</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.VersionSpaceElement#getAllSuperVersionSpaceElements()
	 * @see #getVersionSpaceElement()
	 * @generated
	 */
	EReference getVersionSpaceElement_AllSuperVersionSpaceElements();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.core.VersionSpaceElement#getAllSubVersionSpaceElements <em>All Sub Version Space Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Sub Version Space Elements</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.VersionSpaceElement#getAllSubVersionSpaceElements()
	 * @see #getVersionSpaceElement()
	 * @generated
	 */
	EReference getVersionSpaceElement_AllSubVersionSpaceElements();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.core.VersionSpaceElement#getCrossReferencedVersionSpaceElements <em>Cross Referenced Version Space Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cross Referenced Version Space Elements</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.VersionSpaceElement#getCrossReferencedVersionSpaceElements()
	 * @see #getVersionSpaceElement()
	 * @generated
	 */
	EReference getVersionSpaceElement_CrossReferencedVersionSpaceElements();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.core.VersionSpaceElement#getCrossReferencingVersionSpaceElements <em>Cross Referencing Version Space Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cross Referencing Version Space Elements</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.VersionSpaceElement#getCrossReferencingVersionSpaceElements()
	 * @see #getVersionSpaceElement()
	 * @generated
	 */
	EReference getVersionSpaceElement_CrossReferencingVersionSpaceElements();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.core.VersionSpaceElement#getLowLevelConcepts <em>Low Level Concepts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Low Level Concepts</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.VersionSpaceElement#getLowLevelConcepts()
	 * @see #getVersionSpaceElement()
	 * @generated
	 */
	EReference getVersionSpaceElement_LowLevelConcepts();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.core.OptionExpr <em>Option Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option Expr</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.OptionExpr
	 * @generated
	 */
	EClass getOptionExpr();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.core.OptionExpr#getReferencedOptions <em>Referenced Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referenced Options</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.OptionExpr#getReferencedOptions()
	 * @see #getOptionExpr()
	 * @generated
	 */
	EReference getOptionExpr_ReferencedOptions();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.core.OptionExpr#getReferencedDimensions <em>Referenced Dimensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referenced Dimensions</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.OptionExpr#getReferencedDimensions()
	 * @see #getOptionExpr()
	 * @generated
	 */
	EReference getOptionExpr_ReferencedDimensions();

	/**
	 * Returns the meta object for the '{@link de.ubt.ai1.supermod.mm.core.OptionExpr#apply(de.ubt.ai1.supermod.mm.core.OptionBinding, de.ubt.ai1.supermod.mm.core.VisibilityEvaluationCache) <em>Apply</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply</em>' operation.
	 * @see de.ubt.ai1.supermod.mm.core.OptionExpr#apply(de.ubt.ai1.supermod.mm.core.OptionBinding, de.ubt.ai1.supermod.mm.core.VisibilityEvaluationCache)
	 * @generated
	 */
	EOperation getOptionExpr__Apply__OptionBinding_VisibilityEvaluationCache();

	/**
	 * Returns the meta object for the '{@link de.ubt.ai1.supermod.mm.core.OptionExpr#apply(de.ubt.ai1.supermod.mm.core.OptionBinding) <em>Apply</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply</em>' operation.
	 * @see de.ubt.ai1.supermod.mm.core.OptionExpr#apply(de.ubt.ai1.supermod.mm.core.OptionBinding)
	 * @generated
	 */
	EOperation getOptionExpr__Apply__OptionBinding();

	/**
	 * Returns the meta object for the '{@link de.ubt.ai1.supermod.mm.core.OptionExpr#not() <em>Not</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Not</em>' operation.
	 * @see de.ubt.ai1.supermod.mm.core.OptionExpr#not()
	 * @generated
	 */
	EOperation getOptionExpr__Not();

	/**
	 * Returns the meta object for the '{@link de.ubt.ai1.supermod.mm.core.OptionExpr#and(de.ubt.ai1.supermod.mm.core.OptionExpr) <em>And</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>And</em>' operation.
	 * @see de.ubt.ai1.supermod.mm.core.OptionExpr#and(de.ubt.ai1.supermod.mm.core.OptionExpr)
	 * @generated
	 */
	EOperation getOptionExpr__And__OptionExpr();

	/**
	 * Returns the meta object for the '{@link de.ubt.ai1.supermod.mm.core.OptionExpr#or(de.ubt.ai1.supermod.mm.core.OptionExpr) <em>Or</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Or</em>' operation.
	 * @see de.ubt.ai1.supermod.mm.core.OptionExpr#or(de.ubt.ai1.supermod.mm.core.OptionExpr)
	 * @generated
	 */
	EOperation getOptionExpr__Or__OptionExpr();

	/**
	 * Returns the meta object for the '{@link de.ubt.ai1.supermod.mm.core.OptionExpr#xor(de.ubt.ai1.supermod.mm.core.OptionExpr) <em>Xor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Xor</em>' operation.
	 * @see de.ubt.ai1.supermod.mm.core.OptionExpr#xor(de.ubt.ai1.supermod.mm.core.OptionExpr)
	 * @generated
	 */
	EOperation getOptionExpr__Xor__OptionExpr();

	/**
	 * Returns the meta object for the '{@link de.ubt.ai1.supermod.mm.core.OptionExpr#implies(de.ubt.ai1.supermod.mm.core.OptionExpr) <em>Implies</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Implies</em>' operation.
	 * @see de.ubt.ai1.supermod.mm.core.OptionExpr#implies(de.ubt.ai1.supermod.mm.core.OptionExpr)
	 * @generated
	 */
	EOperation getOptionExpr__Implies__OptionExpr();

	/**
	 * Returns the meta object for the '{@link de.ubt.ai1.supermod.mm.core.OptionExpr#iff(de.ubt.ai1.supermod.mm.core.OptionExpr) <em>Iff</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Iff</em>' operation.
	 * @see de.ubt.ai1.supermod.mm.core.OptionExpr#iff(de.ubt.ai1.supermod.mm.core.OptionExpr)
	 * @generated
	 */
	EOperation getOptionExpr__Iff__OptionExpr();

	/**
	 * Returns the meta object for the '{@link de.ubt.ai1.supermod.mm.core.OptionExpr#nand(de.ubt.ai1.supermod.mm.core.OptionExpr) <em>Nand</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Nand</em>' operation.
	 * @see de.ubt.ai1.supermod.mm.core.OptionExpr#nand(de.ubt.ai1.supermod.mm.core.OptionExpr)
	 * @generated
	 */
	EOperation getOptionExpr__Nand__OptionExpr();

	/**
	 * Returns the meta object for the '{@link de.ubt.ai1.supermod.mm.core.OptionExpr#minus(de.ubt.ai1.supermod.mm.core.OptionExpr) <em>Minus</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Minus</em>' operation.
	 * @see de.ubt.ai1.supermod.mm.core.OptionExpr#minus(de.ubt.ai1.supermod.mm.core.OptionExpr)
	 * @generated
	 */
	EOperation getOptionExpr__Minus__OptionExpr();

	/**
	 * Returns the meta object for the '{@link de.ubt.ai1.supermod.mm.core.OptionExpr#extract() <em>Extract</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Extract</em>' operation.
	 * @see de.ubt.ai1.supermod.mm.core.OptionExpr#extract()
	 * @generated
	 */
	EOperation getOptionExpr__Extract();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.core.VisibilityRef <em>Visibility Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visibility Ref</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.VisibilityRef
	 * @generated
	 */
	EClass getVisibilityRef();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.core.VisibilityRef#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Visibility</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.VisibilityRef#getVisibility()
	 * @see #getVisibilityRef()
	 * @generated
	 */
	EReference getVisibilityRef_Visibility();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.core.OptionRef <em>Option Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option Ref</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.OptionRef
	 * @generated
	 */
	EClass getOptionRef();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.core.OptionRef#getOption <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Option</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.OptionRef#getOption()
	 * @see #getOptionRef()
	 * @generated
	 */
	EReference getOptionRef_Option();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.core.NegExpr <em>Neg Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Neg Expr</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.NegExpr
	 * @generated
	 */
	EClass getNegExpr();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai1.supermod.mm.core.NegExpr#getNeg <em>Neg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Neg</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.NegExpr#getNeg()
	 * @see #getNegExpr()
	 * @generated
	 */
	EReference getNegExpr_Neg();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.core.BinaryExpr <em>Binary Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Expr</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.BinaryExpr
	 * @generated
	 */
	EClass getBinaryExpr();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai1.supermod.mm.core.BinaryExpr#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.BinaryExpr#getLeft()
	 * @see #getBinaryExpr()
	 * @generated
	 */
	EReference getBinaryExpr_Left();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai1.supermod.mm.core.BinaryExpr#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.BinaryExpr#getRight()
	 * @see #getBinaryExpr()
	 * @generated
	 */
	EReference getBinaryExpr_Right();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.core.AndExpr <em>And Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Expr</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.AndExpr
	 * @generated
	 */
	EClass getAndExpr();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.core.OrExpr <em>Or Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Expr</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.OrExpr
	 * @generated
	 */
	EClass getOrExpr();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.core.XorExpr <em>Xor Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xor Expr</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.XorExpr
	 * @generated
	 */
	EClass getXorExpr();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.core.ImpliesExpr <em>Implies Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implies Expr</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.ImpliesExpr
	 * @generated
	 */
	EClass getImpliesExpr();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.core.BiconditionalExpr <em>Biconditional Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Biconditional Expr</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.BiconditionalExpr
	 * @generated
	 */
	EClass getBiconditionalExpr();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.core.NandExpr <em>Nand Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nand Expr</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.NandExpr
	 * @generated
	 */
	EClass getNandExpr();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.core.MinusExpr <em>Minus Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minus Expr</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.MinusExpr
	 * @generated
	 */
	EClass getMinusExpr();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.core.MergeExpr <em>Merge Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merge Expr</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.MergeExpr
	 * @generated
	 */
	EClass getMergeExpr();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai1.supermod.mm.core.MergeExpr#getBaseExpr <em>Base Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Base Expr</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.MergeExpr#getBaseExpr()
	 * @see #getMergeExpr()
	 * @generated
	 */
	EReference getMergeExpr_BaseExpr();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.core.BigExpr <em>Big Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Big Expr</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.BigExpr
	 * @generated
	 */
	EClass getBigExpr();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ubt.ai1.supermod.mm.core.BigExpr#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.BigExpr#getChildren()
	 * @see #getBigExpr()
	 * @generated
	 */
	EReference getBigExpr_Children();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.core.BigAndExpr <em>Big And Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Big And Expr</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.BigAndExpr
	 * @generated
	 */
	EClass getBigAndExpr();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.core.BigOrExpr <em>Big Or Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Big Or Expr</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.BigOrExpr
	 * @generated
	 */
	EClass getBigOrExpr();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.core.BigXorExpr <em>Big Xor Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Big Xor Expr</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.BigXorExpr
	 * @generated
	 */
	EClass getBigXorExpr();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.core.BigNandExpr <em>Big Nand Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Big Nand Expr</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.BigNandExpr
	 * @generated
	 */
	EClass getBigNandExpr();

	/**
	 * Returns the meta object for enum '{@link de.ubt.ai1.supermod.mm.core.Tristate <em>Tristate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tristate</em>'.
	 * @see de.ubt.ai1.supermod.mm.core.Tristate
	 * @generated
	 */
	EEnum getTristate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SuperModCoreFactory getSuperModCoreFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.core.impl.RepositoryImpl <em>Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.core.impl.RepositoryImpl
		 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getRepository()
		 * @generated
		 */
		EClass REPOSITORY = eINSTANCE.getRepository();

		/**
		 * The meta object literal for the '<em><b>Product Space</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__PRODUCT_SPACE = eINSTANCE.getRepository_ProductSpace();

		/**
		 * The meta object literal for the '<em><b>Version Space</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__VERSION_SPACE = eINSTANCE.getRepository_VersionSpace();

		/**
		 * The meta object literal for the '<em><b>Visibility Forest</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__VISIBILITY_FOREST = eINSTANCE.getRepository_VisibilityForest();

		/**
		 * The meta object literal for the '<em><b>Module Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__MODULE_ID = eINSTANCE.getRepository_ModuleId();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.core.impl.DimensionImpl <em>Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.core.impl.DimensionImpl
		 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getDimension()
		 * @generated
		 */
		EClass DIMENSION = eINSTANCE.getDimension();

		/**
		 * The meta object literal for the '<em><b>Dimension Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION__DIMENSION_NAME = eINSTANCE.getDimension_DimensionName();

		/**
		 * The meta object literal for the '<em><b>Root Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIMENSION__ROOT_ELEMENTS = eINSTANCE.getDimension_RootElements();

		/**
		 * The meta object literal for the '<em><b>All Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIMENSION__ALL_ELEMENTS = eINSTANCE.getDimension_AllElements();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.core.impl.VisibilityForestImpl <em>Visibility Forest</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.core.impl.VisibilityForestImpl
		 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getVisibilityForest()
		 * @generated
		 */
		EClass VISIBILITY_FOREST = eINSTANCE.getVisibilityForest();

		/**
		 * The meta object literal for the '<em><b>Visibilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISIBILITY_FOREST__VISIBILITIES = eINSTANCE.getVisibilityForest_Visibilities();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISIBILITY_FOREST__REPOSITORY = eINSTANCE.getVisibilityForest_Repository();

		/**
		 * The meta object literal for the '<em><b>Add</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VISIBILITY_FOREST___ADD__OPTIONEXPR = eINSTANCE.getVisibilityForest__Add__OptionExpr();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.core.impl.VisibilityImpl <em>Visibility</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.core.impl.VisibilityImpl
		 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getVisibility()
		 * @generated
		 */
		EClass VISIBILITY = eINSTANCE.getVisibility();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISIBILITY__EXPR = eINSTANCE.getVisibility_Expr();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.core.impl.ProductSpaceImpl <em>Product Space</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.core.impl.ProductSpaceImpl
		 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getProductSpace()
		 * @generated
		 */
		EClass PRODUCT_SPACE = eINSTANCE.getProductSpace();

		/**
		 * The meta object literal for the '<em><b>Dimensions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_SPACE__DIMENSIONS = eINSTANCE.getProductSpace_Dimensions();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_SPACE__REPOSITORY = eINSTANCE.getProductSpace_Repository();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.core.impl.ProductDimensionImpl <em>Product Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.core.impl.ProductDimensionImpl
		 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getProductDimension()
		 * @generated
		 */
		EClass PRODUCT_DIMENSION = eINSTANCE.getProductDimension();

		/**
		 * The meta object literal for the '<em><b>Root Product Space Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_DIMENSION__ROOT_PRODUCT_SPACE_ELEMENTS = eINSTANCE.getProductDimension_RootProductSpaceElements();

		/**
		 * The meta object literal for the '<em><b>All Product Space Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_DIMENSION__ALL_PRODUCT_SPACE_ELEMENTS = eINSTANCE.getProductDimension_AllProductSpaceElements();

		/**
		 * The meta object literal for the '<em><b>Product Space</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_DIMENSION__PRODUCT_SPACE = eINSTANCE.getProductDimension_ProductSpace();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.core.impl.ProductSpaceElementImpl <em>Product Space Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.core.impl.ProductSpaceElementImpl
		 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getProductSpaceElement()
		 * @generated
		 */
		EClass PRODUCT_SPACE_ELEMENT = eINSTANCE.getProductSpaceElement();

		/**
		 * The meta object literal for the '<em><b>Product Dimension</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_SPACE_ELEMENT__PRODUCT_DIMENSION = eINSTANCE.getProductSpaceElement_ProductDimension();

		/**
		 * The meta object literal for the '<em><b>Product Space</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_SPACE_ELEMENT__PRODUCT_SPACE = eINSTANCE.getProductSpaceElement_ProductSpace();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_SPACE_ELEMENT__VISIBILITY = eINSTANCE.getProductSpaceElement_Visibility();

		/**
		 * The meta object literal for the '<em><b>Super Product Space Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_SPACE_ELEMENT__SUPER_PRODUCT_SPACE_ELEMENT = eINSTANCE.getProductSpaceElement_SuperProductSpaceElement();

		/**
		 * The meta object literal for the '<em><b>Sub Product Space Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_SPACE_ELEMENT__SUB_PRODUCT_SPACE_ELEMENTS = eINSTANCE.getProductSpaceElement_SubProductSpaceElements();

		/**
		 * The meta object literal for the '<em><b>All Super Product Space Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_SPACE_ELEMENT__ALL_SUPER_PRODUCT_SPACE_ELEMENTS = eINSTANCE.getProductSpaceElement_AllSuperProductSpaceElements();

		/**
		 * The meta object literal for the '<em><b>All Sub Product Space Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_SPACE_ELEMENT__ALL_SUB_PRODUCT_SPACE_ELEMENTS = eINSTANCE.getProductSpaceElement_AllSubProductSpaceElements();

		/**
		 * The meta object literal for the '<em><b>Cross Referenced Product Space Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_SPACE_ELEMENT__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS = eINSTANCE.getProductSpaceElement_CrossReferencedProductSpaceElements();

		/**
		 * The meta object literal for the '<em><b>Cross Referencing Product Space Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_SPACE_ELEMENT__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS = eINSTANCE.getProductSpaceElement_CrossReferencingProductSpaceElements();

		/**
		 * The meta object literal for the '<em><b>Hierarchical Visibility</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_SPACE_ELEMENT__HIERARCHICAL_VISIBILITY = eINSTANCE.getProductSpaceElement_HierarchicalVisibility();

		/**
		 * The meta object literal for the '<em><b>Superordinate Visibility</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_SPACE_ELEMENT__SUPERORDINATE_VISIBILITY = eINSTANCE.getProductSpaceElement_SuperordinateVisibility();

		/**
		 * The meta object literal for the '<em><b>Is Visible</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRODUCT_SPACE_ELEMENT___IS_VISIBLE__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = eINSTANCE.getProductSpaceElement__IsVisible__OptionBinding_VisibilityEvaluationCache();

		/**
		 * The meta object literal for the '<em><b>Is Visible Hierarchically</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRODUCT_SPACE_ELEMENT___IS_VISIBLE_HIERARCHICALLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = eINSTANCE.getProductSpaceElement__IsVisibleHierarchically__OptionBinding_VisibilityEvaluationCache();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.core.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.core.impl.ElementImpl
		 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Super Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__SUPER_ELEMENT = eINSTANCE.getElement_SuperElement();

		/**
		 * The meta object literal for the '<em><b>Sub Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__SUB_ELEMENTS = eINSTANCE.getElement_SubElements();

		/**
		 * The meta object literal for the '<em><b>All Super Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__ALL_SUPER_ELEMENTS = eINSTANCE.getElement_AllSuperElements();

		/**
		 * The meta object literal for the '<em><b>All Sub Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__ALL_SUB_ELEMENTS = eINSTANCE.getElement_AllSubElements();

		/**
		 * The meta object literal for the '<em><b>Cross Referenced Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__CROSS_REFERENCED_ELEMENTS = eINSTANCE.getElement_CrossReferencedElements();

		/**
		 * The meta object literal for the '<em><b>Cross Referencing Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__CROSS_REFERENCING_ELEMENTS = eINSTANCE.getElement_CrossReferencingElements();

		/**
		 * The meta object literal for the '<em><b>Proxy UUID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__PROXY_UUID = eINSTANCE.getElement_ProxyUUID();

		/**
		 * The meta object literal for the '<em><b>Transaction Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__TRANSACTION_ID = eINSTANCE.getElement_TransactionId();

		/**
		 * The meta object literal for the '<em><b>Is Proxy</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___IS_PROXY = eINSTANCE.getElement__IsProxy();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.core.impl.UUIDElementImpl <em>UUID Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.core.impl.UUIDElementImpl
		 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getUUIDElement()
		 * @generated
		 */
		EClass UUID_ELEMENT = eINSTANCE.getUUIDElement();

		/**
		 * The meta object literal for the '<em><b>Uuid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UUID_ELEMENT__UUID = eINSTANCE.getUUIDElement_Uuid();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.core.impl.VersionSpaceImpl <em>Version Space</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.core.impl.VersionSpaceImpl
		 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getVersionSpace()
		 * @generated
		 */
		EClass VERSION_SPACE = eINSTANCE.getVersionSpace();

		/**
		 * The meta object literal for the '<em><b>Dimensions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSION_SPACE__DIMENSIONS = eINSTANCE.getVersionSpace_Dimensions();

		/**
		 * The meta object literal for the '<em><b>All Options</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSION_SPACE__ALL_OPTIONS = eINSTANCE.getVersionSpace_AllOptions();

		/**
		 * The meta object literal for the '<em><b>All Invariants</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSION_SPACE__ALL_INVARIANTS = eINSTANCE.getVersionSpace_AllInvariants();

		/**
		 * The meta object literal for the '<em><b>All Preferences</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSION_SPACE__ALL_PREFERENCES = eINSTANCE.getVersionSpace_AllPreferences();

		/**
		 * The meta object literal for the '<em><b>All Default Bindings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSION_SPACE__ALL_DEFAULT_BINDINGS = eINSTANCE.getVersionSpace_AllDefaultBindings();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSION_SPACE__REPOSITORY = eINSTANCE.getVersionSpace_Repository();

		/**
		 * The meta object literal for the '<em><b>Validate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VERSION_SPACE___VALIDATE__OPTIONBINDING = eINSTANCE.getVersionSpace__Validate__OptionBinding();

		/**
		 * The meta object literal for the '<em><b>Is Complete</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VERSION_SPACE___IS_COMPLETE__OPTIONBINDING = eINSTANCE.getVersionSpace__IsComplete__OptionBinding();

		/**
		 * The meta object literal for the '<em><b>Is Satisfiable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VERSION_SPACE___IS_SATISFIABLE__OPTIONBINDING = eINSTANCE.getVersionSpace__IsSatisfiable__OptionBinding();

		/**
		 * The meta object literal for the '<em><b>Apply All Preferences</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VERSION_SPACE___APPLY_ALL_PREFERENCES__OPTIONBINDING = eINSTANCE.getVersionSpace__ApplyAllPreferences__OptionBinding();

		/**
		 * The meta object literal for the '<em><b>Apply All Defaults</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VERSION_SPACE___APPLY_ALL_DEFAULTS__OPTIONBINDING = eINSTANCE.getVersionSpace__ApplyAllDefaults__OptionBinding();

		/**
		 * The meta object literal for the '<em><b>Apply All Completions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VERSION_SPACE___APPLY_ALL_COMPLETIONS__OPTIONBINDING = eINSTANCE.getVersionSpace__ApplyAllCompletions__OptionBinding();

		/**
		 * The meta object literal for the '<em><b>Get Option</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VERSION_SPACE___GET_OPTION__STRING = eINSTANCE.getVersionSpace__GetOption__String();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.core.impl.VersionDimensionImpl <em>Version Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.core.impl.VersionDimensionImpl
		 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getVersionDimension()
		 * @generated
		 */
		EClass VERSION_DIMENSION = eINSTANCE.getVersionDimension();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSION_DIMENSION__OPTIONS = eINSTANCE.getVersionDimension_Options();

		/**
		 * The meta object literal for the '<em><b>Invariants</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSION_DIMENSION__INVARIANTS = eINSTANCE.getVersionDimension_Invariants();

		/**
		 * The meta object literal for the '<em><b>Preferences</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSION_DIMENSION__PREFERENCES = eINSTANCE.getVersionDimension_Preferences();

		/**
		 * The meta object literal for the '<em><b>Default Bindings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSION_DIMENSION__DEFAULT_BINDINGS = eINSTANCE.getVersionDimension_DefaultBindings();

		/**
		 * The meta object literal for the '<em><b>Root Version Space Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSION_DIMENSION__ROOT_VERSION_SPACE_ELEMENTS = eINSTANCE.getVersionDimension_RootVersionSpaceElements();

		/**
		 * The meta object literal for the '<em><b>All Version Space Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSION_DIMENSION__ALL_VERSION_SPACE_ELEMENTS = eINSTANCE.getVersionDimension_AllVersionSpaceElements();

		/**
		 * The meta object literal for the '<em><b>Version Space</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSION_DIMENSION__VERSION_SPACE = eINSTANCE.getVersionDimension_VersionSpace();

		/**
		 * The meta object literal for the '<em><b>Validate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VERSION_DIMENSION___VALIDATE__OPTIONBINDING = eINSTANCE.getVersionDimension__Validate__OptionBinding();

		/**
		 * The meta object literal for the '<em><b>Is Complete</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VERSION_DIMENSION___IS_COMPLETE__OPTIONBINDING = eINSTANCE.getVersionDimension__IsComplete__OptionBinding();

		/**
		 * The meta object literal for the '<em><b>Is Satisfiable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VERSION_DIMENSION___IS_SATISFIABLE__OPTIONBINDING = eINSTANCE.getVersionDimension__IsSatisfiable__OptionBinding();

		/**
		 * The meta object literal for the '<em><b>Apply Preferences</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VERSION_DIMENSION___APPLY_PREFERENCES__OPTIONBINDING = eINSTANCE.getVersionDimension__ApplyPreferences__OptionBinding();

		/**
		 * The meta object literal for the '<em><b>Apply Defaults</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VERSION_DIMENSION___APPLY_DEFAULTS__OPTIONBINDING = eINSTANCE.getVersionDimension__ApplyDefaults__OptionBinding();

		/**
		 * The meta object literal for the '<em><b>Apply Completions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VERSION_DIMENSION___APPLY_COMPLETIONS__OPTIONBINDING = eINSTANCE.getVersionDimension__ApplyCompletions__OptionBinding();

		/**
		 * The meta object literal for the '<em><b>Get Option</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VERSION_DIMENSION___GET_OPTION__STRING = eINSTANCE.getVersionDimension__GetOption__String();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.core.impl.HybridDimensionImpl <em>Hybrid Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.core.impl.HybridDimensionImpl
		 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getHybridDimension()
		 * @generated
		 */
		EClass HYBRID_DIMENSION = eINSTANCE.getHybridDimension();

		/**
		 * The meta object literal for the '<em><b>Root Hybrid Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYBRID_DIMENSION__ROOT_HYBRID_ELEMENTS = eINSTANCE.getHybridDimension_RootHybridElements();

		/**
		 * The meta object literal for the '<em><b>All Hybrid Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYBRID_DIMENSION__ALL_HYBRID_ELEMENTS = eINSTANCE.getHybridDimension_AllHybridElements();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.core.impl.HybridElementImpl <em>Hybrid Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.core.impl.HybridElementImpl
		 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getHybridElement()
		 * @generated
		 */
		EClass HYBRID_ELEMENT = eINSTANCE.getHybridElement();

		/**
		 * The meta object literal for the '<em><b>Super Hybrid Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYBRID_ELEMENT__SUPER_HYBRID_ELEMENT = eINSTANCE.getHybridElement_SuperHybridElement();

		/**
		 * The meta object literal for the '<em><b>Sub Hybrid Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYBRID_ELEMENT__SUB_HYBRID_ELEMENTS = eINSTANCE.getHybridElement_SubHybridElements();

		/**
		 * The meta object literal for the '<em><b>All Super Hybrid Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYBRID_ELEMENT__ALL_SUPER_HYBRID_ELEMENTS = eINSTANCE.getHybridElement_AllSuperHybridElements();

		/**
		 * The meta object literal for the '<em><b>All Sub Hybrid Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYBRID_ELEMENT__ALL_SUB_HYBRID_ELEMENTS = eINSTANCE.getHybridElement_AllSubHybridElements();

		/**
		 * The meta object literal for the '<em><b>Cross Referenced Hybrid Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYBRID_ELEMENT__CROSS_REFERENCED_HYBRID_ELEMENTS = eINSTANCE.getHybridElement_CrossReferencedHybridElements();

		/**
		 * The meta object literal for the '<em><b>Cross Referencing Hybrid Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYBRID_ELEMENT__CROSS_REFERENCING_HYBRID_ELEMENTS = eINSTANCE.getHybridElement_CrossReferencingHybridElements();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.core.impl.RuleBaseElementImpl <em>Rule Base Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.core.impl.RuleBaseElementImpl
		 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getRuleBaseElement()
		 * @generated
		 */
		EClass RULE_BASE_ELEMENT = eINSTANCE.getRuleBaseElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_BASE_ELEMENT__NAME = eINSTANCE.getRuleBaseElement_Name();

		/**
		 * The meta object literal for the '<em><b>Dimension</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_BASE_ELEMENT__DIMENSION = eINSTANCE.getRuleBaseElement_Dimension();

		/**
		 * The meta object literal for the '<em><b>High Level Concept</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_BASE_ELEMENT__HIGH_LEVEL_CONCEPT = eINSTANCE.getRuleBaseElement_HighLevelConcept();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.core.impl.InvariantImpl <em>Invariant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.core.impl.InvariantImpl
		 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getInvariant()
		 * @generated
		 */
		EClass INVARIANT = eINSTANCE.getInvariant();

		/**
		 * The meta object literal for the '<em><b>Option Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVARIANT__OPTION_EXPR = eINSTANCE.getInvariant_OptionExpr();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.core.impl.PreferenceImpl <em>Preference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.core.impl.PreferenceImpl
		 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getPreference()
		 * @generated
		 */
		EClass PREFERENCE = eINSTANCE.getPreference();

		/**
		 * The meta object literal for the '<em><b>Option</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREFERENCE__OPTION = eINSTANCE.getPreference_Option();

		/**
		 * The meta object literal for the '<em><b>Option Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREFERENCE__OPTION_EXPR = eINSTANCE.getPreference_OptionExpr();

		/**
		 * The meta object literal for the '<em><b>To Implication Invariant</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PREFERENCE___TO_IMPLICATION_INVARIANT = eINSTANCE.getPreference__ToImplicationInvariant();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.core.impl.DefaultBindingImpl <em>Default Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.core.impl.DefaultBindingImpl
		 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getDefaultBinding()
		 * @generated
		 */
		EClass DEFAULT_BINDING = eINSTANCE.getDefaultBinding();

		/**
		 * The meta object literal for the '<em><b>Option</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULT_BINDING__OPTION = eINSTANCE.getDefaultBinding_Option();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_BINDING__STATE = eINSTANCE.getDefaultBinding_State();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.core.impl.OptionImpl <em>Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.core.impl.OptionImpl
		 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getOption()
		 * @generated
		 */
		EClass OPTION = eINSTANCE.getOption();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.core.impl.OptionBindingImpl <em>Option Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.core.impl.OptionBindingImpl
		 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getOptionBinding()
		 * @generated
		 */
		EClass OPTION_BINDING = eINSTANCE.getOptionBinding();

		/**
		 * The meta object literal for the '<em><b>Bound Options</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTION_BINDING__BOUND_OPTIONS = eINSTANCE.getOptionBinding_BoundOptions();

		/**
		 * The meta object literal for the '<em><b>Number Of Bindings</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION_BINDING__NUMBER_OF_BINDINGS = eINSTANCE.getOptionBinding_NumberOfBindings();

		/**
		 * The meta object literal for the '<em><b>Get State</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPTION_BINDING___GET_STATE__OPTION = eINSTANCE.getOptionBinding__GetState__Option();

		/**
		 * The meta object literal for the '<em><b>Implies</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPTION_BINDING___IMPLIES__OPTIONBINDING = eINSTANCE.getOptionBinding__Implies__OptionBinding();

		/**
		 * The meta object literal for the '<em><b>To Visibility</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPTION_BINDING___TO_VISIBILITY = eINSTANCE.getOptionBinding__ToVisibility();

		/**
		 * The meta object literal for the '<em><b>Bind</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPTION_BINDING___BIND__OPTION_TRISTATE = eINSTANCE.getOptionBinding__Bind__Option_Tristate();

		/**
		 * The meta object literal for the '<em><b>Combine</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPTION_BINDING___COMBINE__OPTIONBINDING = eINSTANCE.getOptionBinding__Combine__OptionBinding();

		/**
		 * The meta object literal for the '<em><b>Clear</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPTION_BINDING___CLEAR = eINSTANCE.getOptionBinding__Clear();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.core.impl.OptionToTristateMapEntryImpl <em>Option To Tristate Map Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.core.impl.OptionToTristateMapEntryImpl
		 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getOptionToTristateMapEntry()
		 * @generated
		 */
		EClass OPTION_TO_TRISTATE_MAP_ENTRY = eINSTANCE.getOptionToTristateMapEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTION_TO_TRISTATE_MAP_ENTRY__KEY = eINSTANCE.getOptionToTristateMapEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION_TO_TRISTATE_MAP_ENTRY__VALUE = eINSTANCE.getOptionToTristateMapEntry_Value();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.core.impl.VisibilityEvaluationCacheImpl <em>Visibility Evaluation Cache</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.core.impl.VisibilityEvaluationCacheImpl
		 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getVisibilityEvaluationCache()
		 * @generated
		 */
		EClass VISIBILITY_EVALUATION_CACHE = eINSTANCE.getVisibilityEvaluationCache();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISIBILITY_EVALUATION_CACHE__ENTRIES = eINSTANCE.getVisibilityEvaluationCache_Entries();

		/**
		 * The meta object literal for the '<em><b>Invalidate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VISIBILITY_EVALUATION_CACHE___INVALIDATE = eINSTANCE.getVisibilityEvaluationCache__Invalidate();

		/**
		 * The meta object literal for the '<em><b>Save</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VISIBILITY_EVALUATION_CACHE___SAVE__OPTIONEXPR_TRISTATE = eINSTANCE.getVisibilityEvaluationCache__Save__OptionExpr_Tristate();

		/**
		 * The meta object literal for the '<em><b>Get</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VISIBILITY_EVALUATION_CACHE___GET__OPTIONEXPR = eINSTANCE.getVisibilityEvaluationCache__Get__OptionExpr();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.core.impl.OptionExprToTristateMapEntryImpl <em>Option Expr To Tristate Map Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.core.impl.OptionExprToTristateMapEntryImpl
		 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getOptionExprToTristateMapEntry()
		 * @generated
		 */
		EClass OPTION_EXPR_TO_TRISTATE_MAP_ENTRY = eINSTANCE.getOptionExprToTristateMapEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTION_EXPR_TO_TRISTATE_MAP_ENTRY__KEY = eINSTANCE.getOptionExprToTristateMapEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION_EXPR_TO_TRISTATE_MAP_ENTRY__VALUE = eINSTANCE.getOptionExprToTristateMapEntry_Value();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.core.impl.VersionSpaceElementImpl <em>Version Space Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.core.impl.VersionSpaceElementImpl
		 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getVersionSpaceElement()
		 * @generated
		 */
		EClass VERSION_SPACE_ELEMENT = eINSTANCE.getVersionSpaceElement();

		/**
		 * The meta object literal for the '<em><b>Version Dimension</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSION_SPACE_ELEMENT__VERSION_DIMENSION = eINSTANCE.getVersionSpaceElement_VersionDimension();

		/**
		 * The meta object literal for the '<em><b>Version Space</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSION_SPACE_ELEMENT__VERSION_SPACE = eINSTANCE.getVersionSpaceElement_VersionSpace();

		/**
		 * The meta object literal for the '<em><b>Super Version Space Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSION_SPACE_ELEMENT__SUPER_VERSION_SPACE_ELEMENT = eINSTANCE.getVersionSpaceElement_SuperVersionSpaceElement();

		/**
		 * The meta object literal for the '<em><b>Sub Version Space Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSION_SPACE_ELEMENT__SUB_VERSION_SPACE_ELEMENTS = eINSTANCE.getVersionSpaceElement_SubVersionSpaceElements();

		/**
		 * The meta object literal for the '<em><b>All Super Version Space Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSION_SPACE_ELEMENT__ALL_SUPER_VERSION_SPACE_ELEMENTS = eINSTANCE.getVersionSpaceElement_AllSuperVersionSpaceElements();

		/**
		 * The meta object literal for the '<em><b>All Sub Version Space Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSION_SPACE_ELEMENT__ALL_SUB_VERSION_SPACE_ELEMENTS = eINSTANCE.getVersionSpaceElement_AllSubVersionSpaceElements();

		/**
		 * The meta object literal for the '<em><b>Cross Referenced Version Space Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSION_SPACE_ELEMENT__CROSS_REFERENCED_VERSION_SPACE_ELEMENTS = eINSTANCE.getVersionSpaceElement_CrossReferencedVersionSpaceElements();

		/**
		 * The meta object literal for the '<em><b>Cross Referencing Version Space Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSION_SPACE_ELEMENT__CROSS_REFERENCING_VERSION_SPACE_ELEMENTS = eINSTANCE.getVersionSpaceElement_CrossReferencingVersionSpaceElements();

		/**
		 * The meta object literal for the '<em><b>Low Level Concepts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSION_SPACE_ELEMENT__LOW_LEVEL_CONCEPTS = eINSTANCE.getVersionSpaceElement_LowLevelConcepts();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.core.impl.OptionExprImpl <em>Option Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.core.impl.OptionExprImpl
		 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getOptionExpr()
		 * @generated
		 */
		EClass OPTION_EXPR = eINSTANCE.getOptionExpr();

		/**
		 * The meta object literal for the '<em><b>Referenced Options</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTION_EXPR__REFERENCED_OPTIONS = eINSTANCE.getOptionExpr_ReferencedOptions();

		/**
		 * The meta object literal for the '<em><b>Referenced Dimensions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTION_EXPR__REFERENCED_DIMENSIONS = eINSTANCE.getOptionExpr_ReferencedDimensions();

		/**
		 * The meta object literal for the '<em><b>Apply</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPTION_EXPR___APPLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = eINSTANCE.getOptionExpr__Apply__OptionBinding_VisibilityEvaluationCache();

		/**
		 * The meta object literal for the '<em><b>Apply</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPTION_EXPR___APPLY__OPTIONBINDING = eINSTANCE.getOptionExpr__Apply__OptionBinding();

		/**
		 * The meta object literal for the '<em><b>Not</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPTION_EXPR___NOT = eINSTANCE.getOptionExpr__Not();

		/**
		 * The meta object literal for the '<em><b>And</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPTION_EXPR___AND__OPTIONEXPR = eINSTANCE.getOptionExpr__And__OptionExpr();

		/**
		 * The meta object literal for the '<em><b>Or</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPTION_EXPR___OR__OPTIONEXPR = eINSTANCE.getOptionExpr__Or__OptionExpr();

		/**
		 * The meta object literal for the '<em><b>Xor</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPTION_EXPR___XOR__OPTIONEXPR = eINSTANCE.getOptionExpr__Xor__OptionExpr();

		/**
		 * The meta object literal for the '<em><b>Implies</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPTION_EXPR___IMPLIES__OPTIONEXPR = eINSTANCE.getOptionExpr__Implies__OptionExpr();

		/**
		 * The meta object literal for the '<em><b>Iff</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPTION_EXPR___IFF__OPTIONEXPR = eINSTANCE.getOptionExpr__Iff__OptionExpr();

		/**
		 * The meta object literal for the '<em><b>Nand</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPTION_EXPR___NAND__OPTIONEXPR = eINSTANCE.getOptionExpr__Nand__OptionExpr();

		/**
		 * The meta object literal for the '<em><b>Minus</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPTION_EXPR___MINUS__OPTIONEXPR = eINSTANCE.getOptionExpr__Minus__OptionExpr();

		/**
		 * The meta object literal for the '<em><b>Extract</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPTION_EXPR___EXTRACT = eINSTANCE.getOptionExpr__Extract();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.core.impl.VisibilityRefImpl <em>Visibility Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.core.impl.VisibilityRefImpl
		 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getVisibilityRef()
		 * @generated
		 */
		EClass VISIBILITY_REF = eINSTANCE.getVisibilityRef();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISIBILITY_REF__VISIBILITY = eINSTANCE.getVisibilityRef_Visibility();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.core.impl.OptionRefImpl <em>Option Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.core.impl.OptionRefImpl
		 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getOptionRef()
		 * @generated
		 */
		EClass OPTION_REF = eINSTANCE.getOptionRef();

		/**
		 * The meta object literal for the '<em><b>Option</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTION_REF__OPTION = eINSTANCE.getOptionRef_Option();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.core.impl.NegExprImpl <em>Neg Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.core.impl.NegExprImpl
		 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getNegExpr()
		 * @generated
		 */
		EClass NEG_EXPR = eINSTANCE.getNegExpr();

		/**
		 * The meta object literal for the '<em><b>Neg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEG_EXPR__NEG = eINSTANCE.getNegExpr_Neg();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.core.impl.BinaryExprImpl <em>Binary Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.core.impl.BinaryExprImpl
		 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getBinaryExpr()
		 * @generated
		 */
		EClass BINARY_EXPR = eINSTANCE.getBinaryExpr();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPR__LEFT = eINSTANCE.getBinaryExpr_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPR__RIGHT = eINSTANCE.getBinaryExpr_Right();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.core.impl.AndExprImpl <em>And Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.core.impl.AndExprImpl
		 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getAndExpr()
		 * @generated
		 */
		EClass AND_EXPR = eINSTANCE.getAndExpr();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.core.impl.OrExprImpl <em>Or Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.core.impl.OrExprImpl
		 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getOrExpr()
		 * @generated
		 */
		EClass OR_EXPR = eINSTANCE.getOrExpr();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.core.impl.XorExprImpl <em>Xor Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.core.impl.XorExprImpl
		 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getXorExpr()
		 * @generated
		 */
		EClass XOR_EXPR = eINSTANCE.getXorExpr();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.core.impl.ImpliesExprImpl <em>Implies Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.core.impl.ImpliesExprImpl
		 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getImpliesExpr()
		 * @generated
		 */
		EClass IMPLIES_EXPR = eINSTANCE.getImpliesExpr();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.core.impl.BiconditionalExprImpl <em>Biconditional Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.core.impl.BiconditionalExprImpl
		 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getBiconditionalExpr()
		 * @generated
		 */
		EClass BICONDITIONAL_EXPR = eINSTANCE.getBiconditionalExpr();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.core.impl.NandExprImpl <em>Nand Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.core.impl.NandExprImpl
		 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getNandExpr()
		 * @generated
		 */
		EClass NAND_EXPR = eINSTANCE.getNandExpr();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.core.impl.MinusExprImpl <em>Minus Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.core.impl.MinusExprImpl
		 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getMinusExpr()
		 * @generated
		 */
		EClass MINUS_EXPR = eINSTANCE.getMinusExpr();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.core.impl.MergeExprImpl <em>Merge Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.core.impl.MergeExprImpl
		 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getMergeExpr()
		 * @generated
		 */
		EClass MERGE_EXPR = eINSTANCE.getMergeExpr();

		/**
		 * The meta object literal for the '<em><b>Base Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGE_EXPR__BASE_EXPR = eINSTANCE.getMergeExpr_BaseExpr();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.core.impl.BigExprImpl <em>Big Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.core.impl.BigExprImpl
		 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getBigExpr()
		 * @generated
		 */
		EClass BIG_EXPR = eINSTANCE.getBigExpr();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIG_EXPR__CHILDREN = eINSTANCE.getBigExpr_Children();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.core.impl.BigAndExprImpl <em>Big And Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.core.impl.BigAndExprImpl
		 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getBigAndExpr()
		 * @generated
		 */
		EClass BIG_AND_EXPR = eINSTANCE.getBigAndExpr();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.core.impl.BigOrExprImpl <em>Big Or Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.core.impl.BigOrExprImpl
		 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getBigOrExpr()
		 * @generated
		 */
		EClass BIG_OR_EXPR = eINSTANCE.getBigOrExpr();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.core.impl.BigXorExprImpl <em>Big Xor Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.core.impl.BigXorExprImpl
		 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getBigXorExpr()
		 * @generated
		 */
		EClass BIG_XOR_EXPR = eINSTANCE.getBigXorExpr();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.core.impl.BigNandExprImpl <em>Big Nand Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.core.impl.BigNandExprImpl
		 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getBigNandExpr()
		 * @generated
		 */
		EClass BIG_NAND_EXPR = eINSTANCE.getBigNandExpr();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.core.Tristate <em>Tristate</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.core.Tristate
		 * @see de.ubt.ai1.supermod.mm.core.impl.SuperModCorePackageImpl#getTristate()
		 * @generated
		 */
		EEnum TRISTATE = eINSTANCE.getTristate();

	}

} //SuperModCorePackage
