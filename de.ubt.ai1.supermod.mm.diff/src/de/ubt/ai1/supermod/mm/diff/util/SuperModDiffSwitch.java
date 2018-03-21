/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.diff.util;

import de.ubt.ai1.supermod.mm.diff.*;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * @author Felix Schwaegerl
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-25
 * <!-- end-user-doc -->
 * @see de.ubt.ai1.supermod.mm.diff.SuperModDiffPackage
 * @generated
 */
public class SuperModDiffSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SuperModDiffPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperModDiffSwitch() {
		if (modelPackage == null) {
			modelPackage = SuperModDiffPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SuperModDiffPackage.MATCHING_ROLE: {
				MatchingRole matchingRole = (MatchingRole)theEObject;
				T result = caseMatchingRole(matchingRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModDiffPackage.PRODUCT_SPACE_MATCHING: {
				ProductSpaceMatching productSpaceMatching = (ProductSpaceMatching)theEObject;
				T result = caseProductSpaceMatching(productSpaceMatching);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModDiffPackage.PRODUCT_DIMENSION_MATCHING: {
				ProductDimensionMatching productDimensionMatching = (ProductDimensionMatching)theEObject;
				T result = caseProductDimensionMatching(productDimensionMatching);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModDiffPackage.PRODUCT_SPACE_ELEMENT_MATCHING: {
				ProductSpaceElementMatching productSpaceElementMatching = (ProductSpaceElementMatching)theEObject;
				T result = caseProductSpaceElementMatching(productSpaceElementMatching);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModDiffPackage.MATCHED_PRODUCT_SPACE_ELEMENT: {
				MatchedProductSpaceElement matchedProductSpaceElement = (MatchedProductSpaceElement)theEObject;
				T result = caseMatchedProductSpaceElement(matchedProductSpaceElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModDiffPackage.MATCHED_PRODUCT_DIMENSION: {
				MatchedProductDimension matchedProductDimension = (MatchedProductDimension)theEObject;
				T result = caseMatchedProductDimension(matchedProductDimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModDiffPackage.PRODUCT_SPACE_DELTA: {
				ProductSpaceDelta productSpaceDelta = (ProductSpaceDelta)theEObject;
				T result = caseProductSpaceDelta(productSpaceDelta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModDiffPackage.PRODUCT_DIMENSION_DELTA: {
				ProductDimensionDelta productDimensionDelta = (ProductDimensionDelta)theEObject;
				T result = caseProductDimensionDelta(productDimensionDelta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModDiffPackage.PRODUCT_SPACE_ELEMENT_DELTA: {
				ProductSpaceElementDelta productSpaceElementDelta = (ProductSpaceElementDelta)theEObject;
				T result = caseProductSpaceElementDelta(productSpaceElementDelta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModDiffPackage.WRITE_SET: {
				WriteSet writeSet = (WriteSet)theEObject;
				T result = caseWriteSet(writeSet);
				if (result == null) result = caseProductDimensionDelta(writeSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Space Matching</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Space Matching</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductSpaceMatching(ProductSpaceMatching object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Matching Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Matching Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatchingRole(MatchingRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Dimension Matching</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Dimension Matching</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductDimensionMatching(ProductDimensionMatching object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Space Element Matching</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Space Element Matching</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductSpaceElementMatching(ProductSpaceElementMatching object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Matched Product Space Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Matched Product Space Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatchedProductSpaceElement(MatchedProductSpaceElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Matched Product Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Matched Product Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatchedProductDimension(MatchedProductDimension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Space Delta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Space Delta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductSpaceDelta(ProductSpaceDelta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Dimension Delta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Dimension Delta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductDimensionDelta(ProductDimensionDelta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Space Element Delta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Space Element Delta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductSpaceElementDelta(ProductSpaceElementDelta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Write Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Write Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWriteSet(WriteSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SuperModDiffSwitch
