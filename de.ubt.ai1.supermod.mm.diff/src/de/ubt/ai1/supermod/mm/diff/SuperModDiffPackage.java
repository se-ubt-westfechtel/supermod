/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.diff;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * 
 * This package contains classes which represent matchings and differences between
 * multiple versions of a SuperMod repository or a part thereof. 
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-25
 * <!-- end-user-doc -->
 * @see de.ubt.ai1.supermod.mm.diff.SuperModDiffFactory
 * @model kind="package"
 * @generated
 */
public interface SuperModDiffPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "diff";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ai1.uni-bayreuth.de/supermod/diff/0.1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.ubt.ai1.supermod.mm.diff";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SuperModDiffPackage eINSTANCE = de.ubt.ai1.supermod.mm.diff.impl.SuperModDiffPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.diff.impl.ProductSpaceMatchingImpl <em>Product Space Matching</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.diff.impl.ProductSpaceMatchingImpl
	 * @see de.ubt.ai1.supermod.mm.diff.impl.SuperModDiffPackageImpl#getProductSpaceMatching()
	 * @generated
	 */
	int PRODUCT_SPACE_MATCHING = 1;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.diff.impl.MatchingRoleImpl <em>Matching Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.diff.impl.MatchingRoleImpl
	 * @see de.ubt.ai1.supermod.mm.diff.impl.SuperModDiffPackageImpl#getMatchingRole()
	 * @generated
	 */
	int MATCHING_ROLE = 0;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_ROLE__ROLE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Matched Product Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_ROLE__MATCHED_PRODUCT_SPACE = 1;

	/**
	 * The number of structural features of the '<em>Matching Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_ROLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Matching Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_ROLE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Matching Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPACE_MATCHING__MATCHING_ROLES = 0;

	/**
	 * The feature id for the '<em><b>Dimension Matchings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPACE_MATCHING__DIMENSION_MATCHINGS = 1;

	/**
	 * The number of structural features of the '<em>Product Space Matching</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPACE_MATCHING_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Get Matching Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPACE_MATCHING___GET_MATCHING_ROLE__PRODUCTSPACE = 0;

	/**
	 * The number of operations of the '<em>Product Space Matching</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPACE_MATCHING_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.diff.impl.ProductDimensionMatchingImpl <em>Product Dimension Matching</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.diff.impl.ProductDimensionMatchingImpl
	 * @see de.ubt.ai1.supermod.mm.diff.impl.SuperModDiffPackageImpl#getProductDimensionMatching()
	 * @generated
	 */
	int PRODUCT_DIMENSION_MATCHING = 2;

	/**
	 * The feature id for the '<em><b>Matched Dimensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_DIMENSION_MATCHING__MATCHED_DIMENSIONS = 0;

	/**
	 * The feature id for the '<em><b>Root Element Matchings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_DIMENSION_MATCHING__ROOT_ELEMENT_MATCHINGS = 1;

	/**
	 * The feature id for the '<em><b>Dimension Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_DIMENSION_MATCHING__DIMENSION_NAME = 2;

	/**
	 * The number of structural features of the '<em>Product Dimension Matching</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_DIMENSION_MATCHING_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Get Matched Dimension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_DIMENSION_MATCHING___GET_MATCHED_DIMENSION__MATCHINGROLE = 0;

	/**
	 * The number of operations of the '<em>Product Dimension Matching</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_DIMENSION_MATCHING_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.diff.impl.ProductSpaceElementMatchingImpl <em>Product Space Element Matching</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.diff.impl.ProductSpaceElementMatchingImpl
	 * @see de.ubt.ai1.supermod.mm.diff.impl.SuperModDiffPackageImpl#getProductSpaceElementMatching()
	 * @generated
	 */
	int PRODUCT_SPACE_ELEMENT_MATCHING = 3;

	/**
	 * The feature id for the '<em><b>Matched Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPACE_ELEMENT_MATCHING__MATCHED_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Sub Matchings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPACE_ELEMENT_MATCHING__SUB_MATCHINGS = 1;

	/**
	 * The number of structural features of the '<em>Product Space Element Matching</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPACE_ELEMENT_MATCHING_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Get Matched Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPACE_ELEMENT_MATCHING___GET_MATCHED_ELEMENT__MATCHINGROLE = 0;

	/**
	 * The number of operations of the '<em>Product Space Element Matching</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPACE_ELEMENT_MATCHING_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.diff.impl.MatchedProductSpaceElementImpl <em>Matched Product Space Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.diff.impl.MatchedProductSpaceElementImpl
	 * @see de.ubt.ai1.supermod.mm.diff.impl.SuperModDiffPackageImpl#getMatchedProductSpaceElement()
	 * @generated
	 */
	int MATCHED_PRODUCT_SPACE_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHED_PRODUCT_SPACE_ELEMENT__ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHED_PRODUCT_SPACE_ELEMENT__ROLE = 1;

	/**
	 * The number of structural features of the '<em>Matched Product Space Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHED_PRODUCT_SPACE_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Matched Product Space Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHED_PRODUCT_SPACE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.diff.impl.MatchedProductDimensionImpl <em>Matched Product Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.diff.impl.MatchedProductDimensionImpl
	 * @see de.ubt.ai1.supermod.mm.diff.impl.SuperModDiffPackageImpl#getMatchedProductDimension()
	 * @generated
	 */
	int MATCHED_PRODUCT_DIMENSION = 5;

	/**
	 * The feature id for the '<em><b>Product Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHED_PRODUCT_DIMENSION__PRODUCT_DIMENSION = 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHED_PRODUCT_DIMENSION__ROLE = 1;

	/**
	 * The number of structural features of the '<em>Matched Product Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHED_PRODUCT_DIMENSION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Matched Product Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHED_PRODUCT_DIMENSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.diff.impl.ProductSpaceDeltaImpl <em>Product Space Delta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.diff.impl.ProductSpaceDeltaImpl
	 * @see de.ubt.ai1.supermod.mm.diff.impl.SuperModDiffPackageImpl#getProductSpaceDelta()
	 * @generated
	 */
	int PRODUCT_SPACE_DELTA = 6;

	/**
	 * The feature id for the '<em><b>Product Dimension Deltas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPACE_DELTA__PRODUCT_DIMENSION_DELTAS = 0;

	/**
	 * The number of structural features of the '<em>Product Space Delta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPACE_DELTA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Product Space Delta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPACE_DELTA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.diff.impl.ProductDimensionDeltaImpl <em>Product Dimension Delta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.diff.impl.ProductDimensionDeltaImpl
	 * @see de.ubt.ai1.supermod.mm.diff.impl.SuperModDiffPackageImpl#getProductDimensionDelta()
	 * @generated
	 */
	int PRODUCT_DIMENSION_DELTA = 7;

	/**
	 * The feature id for the '<em><b>Inserted Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_DIMENSION_DELTA__INSERTED_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Deleted Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_DIMENSION_DELTA__DELETED_ELEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Dimension Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_DIMENSION_DELTA__DIMENSION_NAME = 2;

	/**
	 * The number of structural features of the '<em>Product Dimension Delta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_DIMENSION_DELTA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Product Dimension Delta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_DIMENSION_DELTA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.diff.impl.ProductSpaceElementDeltaImpl <em>Product Space Element Delta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.diff.impl.ProductSpaceElementDeltaImpl
	 * @see de.ubt.ai1.supermod.mm.diff.impl.SuperModDiffPackageImpl#getProductSpaceElementDelta()
	 * @generated
	 */
	int PRODUCT_SPACE_ELEMENT_DELTA = 8;

	/**
	 * The feature id for the '<em><b>Root Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPACE_ELEMENT_DELTA__ROOT_ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Product Space Element Delta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPACE_ELEMENT_DELTA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Product Space Element Delta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPACE_ELEMENT_DELTA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.diff.impl.WriteSetImpl <em>Write Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.diff.impl.WriteSetImpl
	 * @see de.ubt.ai1.supermod.mm.diff.impl.SuperModDiffPackageImpl#getWriteSet()
	 * @generated
	 */
	int WRITE_SET = 9;

	/**
	 * The feature id for the '<em><b>Inserted Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_SET__INSERTED_ELEMENTS = PRODUCT_DIMENSION_DELTA__INSERTED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Deleted Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_SET__DELETED_ELEMENTS = PRODUCT_DIMENSION_DELTA__DELETED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Dimension Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_SET__DIMENSION_NAME = PRODUCT_DIMENSION_DELTA__DIMENSION_NAME;

	/**
	 * The feature id for the '<em><b>Ambition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_SET__AMBITION = PRODUCT_DIMENSION_DELTA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Write Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_SET_FEATURE_COUNT = PRODUCT_DIMENSION_DELTA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Write Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_SET_OPERATION_COUNT = PRODUCT_DIMENSION_DELTA_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.diff.ProductSpaceMatching <em>Product Space Matching</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Space Matching</em>'.
	 * @see de.ubt.ai1.supermod.mm.diff.ProductSpaceMatching
	 * @generated
	 */
	EClass getProductSpaceMatching();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ubt.ai1.supermod.mm.diff.ProductSpaceMatching#getMatchingRoles <em>Matching Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Matching Roles</em>'.
	 * @see de.ubt.ai1.supermod.mm.diff.ProductSpaceMatching#getMatchingRoles()
	 * @see #getProductSpaceMatching()
	 * @generated
	 */
	EReference getProductSpaceMatching_MatchingRoles();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.diff.ProductSpaceMatching#getDimensionMatchings <em>Dimension Matchings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dimension Matchings</em>'.
	 * @see de.ubt.ai1.supermod.mm.diff.ProductSpaceMatching#getDimensionMatchings()
	 * @see #getProductSpaceMatching()
	 * @generated
	 */
	EReference getProductSpaceMatching_DimensionMatchings();

	/**
	 * Returns the meta object for the '{@link de.ubt.ai1.supermod.mm.diff.ProductSpaceMatching#getMatchingRole(de.ubt.ai1.supermod.mm.core.ProductSpace) <em>Get Matching Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Matching Role</em>' operation.
	 * @see de.ubt.ai1.supermod.mm.diff.ProductSpaceMatching#getMatchingRole(de.ubt.ai1.supermod.mm.core.ProductSpace)
	 * @generated
	 */
	EOperation getProductSpaceMatching__GetMatchingRole__ProductSpace();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.diff.MatchingRole <em>Matching Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matching Role</em>'.
	 * @see de.ubt.ai1.supermod.mm.diff.MatchingRole
	 * @generated
	 */
	EClass getMatchingRole();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai1.supermod.mm.diff.MatchingRole#getRoleName <em>Role Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Name</em>'.
	 * @see de.ubt.ai1.supermod.mm.diff.MatchingRole#getRoleName()
	 * @see #getMatchingRole()
	 * @generated
	 */
	EAttribute getMatchingRole_RoleName();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.diff.MatchingRole#getMatchedProductSpace <em>Matched Product Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Matched Product Space</em>'.
	 * @see de.ubt.ai1.supermod.mm.diff.MatchingRole#getMatchedProductSpace()
	 * @see #getMatchingRole()
	 * @generated
	 */
	EReference getMatchingRole_MatchedProductSpace();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.diff.ProductDimensionMatching <em>Product Dimension Matching</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Dimension Matching</em>'.
	 * @see de.ubt.ai1.supermod.mm.diff.ProductDimensionMatching
	 * @generated
	 */
	EClass getProductDimensionMatching();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ubt.ai1.supermod.mm.diff.ProductDimensionMatching#getMatchedDimensions <em>Matched Dimensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Matched Dimensions</em>'.
	 * @see de.ubt.ai1.supermod.mm.diff.ProductDimensionMatching#getMatchedDimensions()
	 * @see #getProductDimensionMatching()
	 * @generated
	 */
	EReference getProductDimensionMatching_MatchedDimensions();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ubt.ai1.supermod.mm.diff.ProductDimensionMatching#getRootElementMatchings <em>Root Element Matchings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Root Element Matchings</em>'.
	 * @see de.ubt.ai1.supermod.mm.diff.ProductDimensionMatching#getRootElementMatchings()
	 * @see #getProductDimensionMatching()
	 * @generated
	 */
	EReference getProductDimensionMatching_RootElementMatchings();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai1.supermod.mm.diff.ProductDimensionMatching#getDimensionName <em>Dimension Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dimension Name</em>'.
	 * @see de.ubt.ai1.supermod.mm.diff.ProductDimensionMatching#getDimensionName()
	 * @see #getProductDimensionMatching()
	 * @generated
	 */
	EAttribute getProductDimensionMatching_DimensionName();

	/**
	 * Returns the meta object for the '{@link de.ubt.ai1.supermod.mm.diff.ProductDimensionMatching#getMatchedDimension(de.ubt.ai1.supermod.mm.diff.MatchingRole) <em>Get Matched Dimension</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Matched Dimension</em>' operation.
	 * @see de.ubt.ai1.supermod.mm.diff.ProductDimensionMatching#getMatchedDimension(de.ubt.ai1.supermod.mm.diff.MatchingRole)
	 * @generated
	 */
	EOperation getProductDimensionMatching__GetMatchedDimension__MatchingRole();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.diff.ProductSpaceElementMatching <em>Product Space Element Matching</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Space Element Matching</em>'.
	 * @see de.ubt.ai1.supermod.mm.diff.ProductSpaceElementMatching
	 * @generated
	 */
	EClass getProductSpaceElementMatching();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ubt.ai1.supermod.mm.diff.ProductSpaceElementMatching#getMatchedElements <em>Matched Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Matched Elements</em>'.
	 * @see de.ubt.ai1.supermod.mm.diff.ProductSpaceElementMatching#getMatchedElements()
	 * @see #getProductSpaceElementMatching()
	 * @generated
	 */
	EReference getProductSpaceElementMatching_MatchedElements();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ubt.ai1.supermod.mm.diff.ProductSpaceElementMatching#getSubMatchings <em>Sub Matchings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Matchings</em>'.
	 * @see de.ubt.ai1.supermod.mm.diff.ProductSpaceElementMatching#getSubMatchings()
	 * @see #getProductSpaceElementMatching()
	 * @generated
	 */
	EReference getProductSpaceElementMatching_SubMatchings();

	/**
	 * Returns the meta object for the '{@link de.ubt.ai1.supermod.mm.diff.ProductSpaceElementMatching#getMatchedElement(de.ubt.ai1.supermod.mm.diff.MatchingRole) <em>Get Matched Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Matched Element</em>' operation.
	 * @see de.ubt.ai1.supermod.mm.diff.ProductSpaceElementMatching#getMatchedElement(de.ubt.ai1.supermod.mm.diff.MatchingRole)
	 * @generated
	 */
	EOperation getProductSpaceElementMatching__GetMatchedElement__MatchingRole();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.diff.MatchedProductSpaceElement <em>Matched Product Space Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matched Product Space Element</em>'.
	 * @see de.ubt.ai1.supermod.mm.diff.MatchedProductSpaceElement
	 * @generated
	 */
	EClass getMatchedProductSpaceElement();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.diff.MatchedProductSpaceElement#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see de.ubt.ai1.supermod.mm.diff.MatchedProductSpaceElement#getElement()
	 * @see #getMatchedProductSpaceElement()
	 * @generated
	 */
	EReference getMatchedProductSpaceElement_Element();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.diff.MatchedProductSpaceElement#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see de.ubt.ai1.supermod.mm.diff.MatchedProductSpaceElement#getRole()
	 * @see #getMatchedProductSpaceElement()
	 * @generated
	 */
	EReference getMatchedProductSpaceElement_Role();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.diff.MatchedProductDimension <em>Matched Product Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matched Product Dimension</em>'.
	 * @see de.ubt.ai1.supermod.mm.diff.MatchedProductDimension
	 * @generated
	 */
	EClass getMatchedProductDimension();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.diff.MatchedProductDimension#getProductDimension <em>Product Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Dimension</em>'.
	 * @see de.ubt.ai1.supermod.mm.diff.MatchedProductDimension#getProductDimension()
	 * @see #getMatchedProductDimension()
	 * @generated
	 */
	EReference getMatchedProductDimension_ProductDimension();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.diff.MatchedProductDimension#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see de.ubt.ai1.supermod.mm.diff.MatchedProductDimension#getRole()
	 * @see #getMatchedProductDimension()
	 * @generated
	 */
	EReference getMatchedProductDimension_Role();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.diff.ProductSpaceDelta <em>Product Space Delta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Space Delta</em>'.
	 * @see de.ubt.ai1.supermod.mm.diff.ProductSpaceDelta
	 * @generated
	 */
	EClass getProductSpaceDelta();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.diff.ProductSpaceDelta#getProductDimensionDeltas <em>Product Dimension Deltas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Product Dimension Deltas</em>'.
	 * @see de.ubt.ai1.supermod.mm.diff.ProductSpaceDelta#getProductDimensionDeltas()
	 * @see #getProductSpaceDelta()
	 * @generated
	 */
	EReference getProductSpaceDelta_ProductDimensionDeltas();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.diff.ProductDimensionDelta <em>Product Dimension Delta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Dimension Delta</em>'.
	 * @see de.ubt.ai1.supermod.mm.diff.ProductDimensionDelta
	 * @generated
	 */
	EClass getProductDimensionDelta();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ubt.ai1.supermod.mm.diff.ProductDimensionDelta#getInsertedElements <em>Inserted Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inserted Elements</em>'.
	 * @see de.ubt.ai1.supermod.mm.diff.ProductDimensionDelta#getInsertedElements()
	 * @see #getProductDimensionDelta()
	 * @generated
	 */
	EReference getProductDimensionDelta_InsertedElements();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ubt.ai1.supermod.mm.diff.ProductDimensionDelta#getDeletedElements <em>Deleted Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deleted Elements</em>'.
	 * @see de.ubt.ai1.supermod.mm.diff.ProductDimensionDelta#getDeletedElements()
	 * @see #getProductDimensionDelta()
	 * @generated
	 */
	EReference getProductDimensionDelta_DeletedElements();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai1.supermod.mm.diff.ProductDimensionDelta#getDimensionName <em>Dimension Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dimension Name</em>'.
	 * @see de.ubt.ai1.supermod.mm.diff.ProductDimensionDelta#getDimensionName()
	 * @see #getProductDimensionDelta()
	 * @generated
	 */
	EAttribute getProductDimensionDelta_DimensionName();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.diff.ProductSpaceElementDelta <em>Product Space Element Delta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Space Element Delta</em>'.
	 * @see de.ubt.ai1.supermod.mm.diff.ProductSpaceElementDelta
	 * @generated
	 */
	EClass getProductSpaceElementDelta();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.diff.ProductSpaceElementDelta#getRootElements <em>Root Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Root Elements</em>'.
	 * @see de.ubt.ai1.supermod.mm.diff.ProductSpaceElementDelta#getRootElements()
	 * @see #getProductSpaceElementDelta()
	 * @generated
	 */
	EReference getProductSpaceElementDelta_RootElements();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.diff.WriteSet <em>Write Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Write Set</em>'.
	 * @see de.ubt.ai1.supermod.mm.diff.WriteSet
	 * @generated
	 */
	EClass getWriteSet();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai1.supermod.mm.diff.WriteSet#getAmbition <em>Ambition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ambition</em>'.
	 * @see de.ubt.ai1.supermod.mm.diff.WriteSet#getAmbition()
	 * @see #getWriteSet()
	 * @generated
	 */
	EReference getWriteSet_Ambition();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SuperModDiffFactory getSuperModDiffFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.diff.impl.ProductSpaceMatchingImpl <em>Product Space Matching</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.diff.impl.ProductSpaceMatchingImpl
		 * @see de.ubt.ai1.supermod.mm.diff.impl.SuperModDiffPackageImpl#getProductSpaceMatching()
		 * @generated
		 */
		EClass PRODUCT_SPACE_MATCHING = eINSTANCE.getProductSpaceMatching();

		/**
		 * The meta object literal for the '<em><b>Matching Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_SPACE_MATCHING__MATCHING_ROLES = eINSTANCE.getProductSpaceMatching_MatchingRoles();

		/**
		 * The meta object literal for the '<em><b>Dimension Matchings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_SPACE_MATCHING__DIMENSION_MATCHINGS = eINSTANCE.getProductSpaceMatching_DimensionMatchings();

		/**
		 * The meta object literal for the '<em><b>Get Matching Role</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRODUCT_SPACE_MATCHING___GET_MATCHING_ROLE__PRODUCTSPACE = eINSTANCE.getProductSpaceMatching__GetMatchingRole__ProductSpace();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.diff.impl.MatchingRoleImpl <em>Matching Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.diff.impl.MatchingRoleImpl
		 * @see de.ubt.ai1.supermod.mm.diff.impl.SuperModDiffPackageImpl#getMatchingRole()
		 * @generated
		 */
		EClass MATCHING_ROLE = eINSTANCE.getMatchingRole();

		/**
		 * The meta object literal for the '<em><b>Role Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCHING_ROLE__ROLE_NAME = eINSTANCE.getMatchingRole_RoleName();

		/**
		 * The meta object literal for the '<em><b>Matched Product Space</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCHING_ROLE__MATCHED_PRODUCT_SPACE = eINSTANCE.getMatchingRole_MatchedProductSpace();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.diff.impl.ProductDimensionMatchingImpl <em>Product Dimension Matching</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.diff.impl.ProductDimensionMatchingImpl
		 * @see de.ubt.ai1.supermod.mm.diff.impl.SuperModDiffPackageImpl#getProductDimensionMatching()
		 * @generated
		 */
		EClass PRODUCT_DIMENSION_MATCHING = eINSTANCE.getProductDimensionMatching();

		/**
		 * The meta object literal for the '<em><b>Matched Dimensions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_DIMENSION_MATCHING__MATCHED_DIMENSIONS = eINSTANCE.getProductDimensionMatching_MatchedDimensions();

		/**
		 * The meta object literal for the '<em><b>Root Element Matchings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_DIMENSION_MATCHING__ROOT_ELEMENT_MATCHINGS = eINSTANCE.getProductDimensionMatching_RootElementMatchings();

		/**
		 * The meta object literal for the '<em><b>Dimension Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_DIMENSION_MATCHING__DIMENSION_NAME = eINSTANCE.getProductDimensionMatching_DimensionName();

		/**
		 * The meta object literal for the '<em><b>Get Matched Dimension</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRODUCT_DIMENSION_MATCHING___GET_MATCHED_DIMENSION__MATCHINGROLE = eINSTANCE.getProductDimensionMatching__GetMatchedDimension__MatchingRole();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.diff.impl.ProductSpaceElementMatchingImpl <em>Product Space Element Matching</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.diff.impl.ProductSpaceElementMatchingImpl
		 * @see de.ubt.ai1.supermod.mm.diff.impl.SuperModDiffPackageImpl#getProductSpaceElementMatching()
		 * @generated
		 */
		EClass PRODUCT_SPACE_ELEMENT_MATCHING = eINSTANCE.getProductSpaceElementMatching();

		/**
		 * The meta object literal for the '<em><b>Matched Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_SPACE_ELEMENT_MATCHING__MATCHED_ELEMENTS = eINSTANCE.getProductSpaceElementMatching_MatchedElements();

		/**
		 * The meta object literal for the '<em><b>Sub Matchings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_SPACE_ELEMENT_MATCHING__SUB_MATCHINGS = eINSTANCE.getProductSpaceElementMatching_SubMatchings();

		/**
		 * The meta object literal for the '<em><b>Get Matched Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRODUCT_SPACE_ELEMENT_MATCHING___GET_MATCHED_ELEMENT__MATCHINGROLE = eINSTANCE.getProductSpaceElementMatching__GetMatchedElement__MatchingRole();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.diff.impl.MatchedProductSpaceElementImpl <em>Matched Product Space Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.diff.impl.MatchedProductSpaceElementImpl
		 * @see de.ubt.ai1.supermod.mm.diff.impl.SuperModDiffPackageImpl#getMatchedProductSpaceElement()
		 * @generated
		 */
		EClass MATCHED_PRODUCT_SPACE_ELEMENT = eINSTANCE.getMatchedProductSpaceElement();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCHED_PRODUCT_SPACE_ELEMENT__ELEMENT = eINSTANCE.getMatchedProductSpaceElement_Element();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCHED_PRODUCT_SPACE_ELEMENT__ROLE = eINSTANCE.getMatchedProductSpaceElement_Role();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.diff.impl.MatchedProductDimensionImpl <em>Matched Product Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.diff.impl.MatchedProductDimensionImpl
		 * @see de.ubt.ai1.supermod.mm.diff.impl.SuperModDiffPackageImpl#getMatchedProductDimension()
		 * @generated
		 */
		EClass MATCHED_PRODUCT_DIMENSION = eINSTANCE.getMatchedProductDimension();

		/**
		 * The meta object literal for the '<em><b>Product Dimension</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCHED_PRODUCT_DIMENSION__PRODUCT_DIMENSION = eINSTANCE.getMatchedProductDimension_ProductDimension();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCHED_PRODUCT_DIMENSION__ROLE = eINSTANCE.getMatchedProductDimension_Role();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.diff.impl.ProductSpaceDeltaImpl <em>Product Space Delta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.diff.impl.ProductSpaceDeltaImpl
		 * @see de.ubt.ai1.supermod.mm.diff.impl.SuperModDiffPackageImpl#getProductSpaceDelta()
		 * @generated
		 */
		EClass PRODUCT_SPACE_DELTA = eINSTANCE.getProductSpaceDelta();

		/**
		 * The meta object literal for the '<em><b>Product Dimension Deltas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_SPACE_DELTA__PRODUCT_DIMENSION_DELTAS = eINSTANCE.getProductSpaceDelta_ProductDimensionDeltas();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.diff.impl.ProductDimensionDeltaImpl <em>Product Dimension Delta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.diff.impl.ProductDimensionDeltaImpl
		 * @see de.ubt.ai1.supermod.mm.diff.impl.SuperModDiffPackageImpl#getProductDimensionDelta()
		 * @generated
		 */
		EClass PRODUCT_DIMENSION_DELTA = eINSTANCE.getProductDimensionDelta();

		/**
		 * The meta object literal for the '<em><b>Inserted Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_DIMENSION_DELTA__INSERTED_ELEMENTS = eINSTANCE.getProductDimensionDelta_InsertedElements();

		/**
		 * The meta object literal for the '<em><b>Deleted Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_DIMENSION_DELTA__DELETED_ELEMENTS = eINSTANCE.getProductDimensionDelta_DeletedElements();

		/**
		 * The meta object literal for the '<em><b>Dimension Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_DIMENSION_DELTA__DIMENSION_NAME = eINSTANCE.getProductDimensionDelta_DimensionName();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.diff.impl.ProductSpaceElementDeltaImpl <em>Product Space Element Delta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.diff.impl.ProductSpaceElementDeltaImpl
		 * @see de.ubt.ai1.supermod.mm.diff.impl.SuperModDiffPackageImpl#getProductSpaceElementDelta()
		 * @generated
		 */
		EClass PRODUCT_SPACE_ELEMENT_DELTA = eINSTANCE.getProductSpaceElementDelta();

		/**
		 * The meta object literal for the '<em><b>Root Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_SPACE_ELEMENT_DELTA__ROOT_ELEMENTS = eINSTANCE.getProductSpaceElementDelta_RootElements();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.diff.impl.WriteSetImpl <em>Write Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.diff.impl.WriteSetImpl
		 * @see de.ubt.ai1.supermod.mm.diff.impl.SuperModDiffPackageImpl#getWriteSet()
		 * @generated
		 */
		EClass WRITE_SET = eINSTANCE.getWriteSet();

		/**
		 * The meta object literal for the '<em><b>Ambition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRITE_SET__AMBITION = eINSTANCE.getWriteSet_Ambition();

	}

} //SuperModDiffPackage
