/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.diff.impl;

import de.ubt.ai1.supermod.mm.diff.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * @author Felix Schwaegerl
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-25
 * <!-- end-user-doc -->
 * @generated
 */
public class SuperModDiffFactoryImpl extends EFactoryImpl implements SuperModDiffFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SuperModDiffFactory init() {
		try {
			SuperModDiffFactory theSuperModDiffFactory = (SuperModDiffFactory)EPackage.Registry.INSTANCE.getEFactory(SuperModDiffPackage.eNS_URI);
			if (theSuperModDiffFactory != null) {
				return theSuperModDiffFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SuperModDiffFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperModDiffFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SuperModDiffPackage.MATCHING_ROLE: return createMatchingRole();
			case SuperModDiffPackage.PRODUCT_SPACE_MATCHING: return createProductSpaceMatching();
			case SuperModDiffPackage.PRODUCT_DIMENSION_MATCHING: return createProductDimensionMatching();
			case SuperModDiffPackage.PRODUCT_SPACE_ELEMENT_MATCHING: return createProductSpaceElementMatching();
			case SuperModDiffPackage.MATCHED_PRODUCT_SPACE_ELEMENT: return createMatchedProductSpaceElement();
			case SuperModDiffPackage.MATCHED_PRODUCT_DIMENSION: return createMatchedProductDimension();
			case SuperModDiffPackage.PRODUCT_SPACE_DELTA: return createProductSpaceDelta();
			case SuperModDiffPackage.PRODUCT_DIMENSION_DELTA: return createProductDimensionDelta();
			case SuperModDiffPackage.PRODUCT_SPACE_ELEMENT_DELTA: return createProductSpaceElementDelta();
			case SuperModDiffPackage.WRITE_SET: return createWriteSet();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductSpaceMatching createProductSpaceMatching() {
		ProductSpaceMatchingImpl productSpaceMatching = new ProductSpaceMatchingImpl();
		return productSpaceMatching;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchingRole createMatchingRole() {
		MatchingRoleImpl matchingRole = new MatchingRoleImpl();
		return matchingRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductDimensionMatching createProductDimensionMatching() {
		ProductDimensionMatchingImpl productDimensionMatching = new ProductDimensionMatchingImpl();
		return productDimensionMatching;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductSpaceElementMatching createProductSpaceElementMatching() {
		ProductSpaceElementMatchingImpl productSpaceElementMatching = new ProductSpaceElementMatchingImpl();
		return productSpaceElementMatching;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchedProductSpaceElement createMatchedProductSpaceElement() {
		MatchedProductSpaceElementImpl matchedProductSpaceElement = new MatchedProductSpaceElementImpl();
		return matchedProductSpaceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchedProductDimension createMatchedProductDimension() {
		MatchedProductDimensionImpl matchedProductDimension = new MatchedProductDimensionImpl();
		return matchedProductDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductSpaceDelta createProductSpaceDelta() {
		ProductSpaceDeltaImpl productSpaceDelta = new ProductSpaceDeltaImpl();
		return productSpaceDelta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductDimensionDelta createProductDimensionDelta() {
		ProductDimensionDeltaImpl productDimensionDelta = new ProductDimensionDeltaImpl();
		return productDimensionDelta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductSpaceElementDelta createProductSpaceElementDelta() {
		ProductSpaceElementDeltaImpl productSpaceElementDelta = new ProductSpaceElementDeltaImpl();
		return productSpaceElementDelta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriteSet createWriteSet() {
		WriteSetImpl writeSet = new WriteSetImpl();
		return writeSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperModDiffPackage getSuperModDiffPackage() {
		return (SuperModDiffPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SuperModDiffPackage getPackage() {
		return SuperModDiffPackage.eINSTANCE;
	}

} //SuperModDiffFactoryImpl
