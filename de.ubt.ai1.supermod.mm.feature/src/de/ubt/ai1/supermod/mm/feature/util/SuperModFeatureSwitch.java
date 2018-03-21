/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.feature.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import de.ubt.ai1.supermod.mm.core.Dimension;
import de.ubt.ai1.supermod.mm.core.Element;
import de.ubt.ai1.supermod.mm.core.HybridDimension;
import de.ubt.ai1.supermod.mm.core.HybridElement;
import de.ubt.ai1.supermod.mm.core.ProductDimension;
import de.ubt.ai1.supermod.mm.core.ProductSpaceElement;
import de.ubt.ai1.supermod.mm.core.UUIDElement;
import de.ubt.ai1.supermod.mm.core.VersionDimension;
import de.ubt.ai1.supermod.mm.core.VersionSpaceElement;
import de.ubt.ai1.supermod.mm.feature.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * <!-- end-user-doc -->
 * @see de.ubt.ai1.supermod.mm.feature.SuperModFeaturePackage
 * @generated
 */
public class SuperModFeatureSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SuperModFeaturePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperModFeatureSwitch() {
		if (modelPackage == null) {
			modelPackage = SuperModFeaturePackage.eINSTANCE;
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
			case SuperModFeaturePackage.FEATURE_MODEL: {
				FeatureModel featureModel = (FeatureModel)theEObject;
				T result = caseFeatureModel(featureModel);
				if (result == null) result = caseHybridDimension(featureModel);
				if (result == null) result = caseVersionDimension(featureModel);
				if (result == null) result = caseProductDimension(featureModel);
				if (result == null) result = caseDimension(featureModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModFeaturePackage.FEATURE: {
				Feature feature = (Feature)theEObject;
				T result = caseFeature(feature);
				if (result == null) result = caseHybridElement(feature);
				if (result == null) result = caseUUIDElement(feature);
				if (result == null) result = caseProductSpaceElement(feature);
				if (result == null) result = caseVersionSpaceElement(feature);
				if (result == null) result = caseElement(feature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModFeaturePackage.DISPLAY_NAME: {
				DisplayName displayName = (DisplayName)theEObject;
				T result = caseDisplayName(displayName);
				if (result == null) result = caseHybridElement(displayName);
				if (result == null) result = caseProductSpaceElement(displayName);
				if (result == null) result = caseVersionSpaceElement(displayName);
				if (result == null) result = caseElement(displayName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModFeaturePackage.FEATURE_GROUP: {
				FeatureGroup featureGroup = (FeatureGroup)theEObject;
				T result = caseFeatureGroup(featureGroup);
				if (result == null) result = caseHybridElement(featureGroup);
				if (result == null) result = caseUUIDElement(featureGroup);
				if (result == null) result = caseProductSpaceElement(featureGroup);
				if (result == null) result = caseVersionSpaceElement(featureGroup);
				if (result == null) result = caseElement(featureGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModFeaturePackage.GROUP_MEMBERSHIP: {
				GroupMembership groupMembership = (GroupMembership)theEObject;
				T result = caseGroupMembership(groupMembership);
				if (result == null) result = caseHybridElement(groupMembership);
				if (result == null) result = caseProductSpaceElement(groupMembership);
				if (result == null) result = caseVersionSpaceElement(groupMembership);
				if (result == null) result = caseElement(groupMembership);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModFeaturePackage.OR_FEATURE_GROUP: {
				OrFeatureGroup orFeatureGroup = (OrFeatureGroup)theEObject;
				T result = caseOrFeatureGroup(orFeatureGroup);
				if (result == null) result = caseFeatureGroup(orFeatureGroup);
				if (result == null) result = caseHybridElement(orFeatureGroup);
				if (result == null) result = caseUUIDElement(orFeatureGroup);
				if (result == null) result = caseProductSpaceElement(orFeatureGroup);
				if (result == null) result = caseVersionSpaceElement(orFeatureGroup);
				if (result == null) result = caseElement(orFeatureGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModFeaturePackage.XOR_FEATURE_GROUP: {
				XorFeatureGroup xorFeatureGroup = (XorFeatureGroup)theEObject;
				T result = caseXorFeatureGroup(xorFeatureGroup);
				if (result == null) result = caseFeatureGroup(xorFeatureGroup);
				if (result == null) result = caseHybridElement(xorFeatureGroup);
				if (result == null) result = caseUUIDElement(xorFeatureGroup);
				if (result == null) result = caseProductSpaceElement(xorFeatureGroup);
				if (result == null) result = caseVersionSpaceElement(xorFeatureGroup);
				if (result == null) result = caseElement(xorFeatureGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModFeaturePackage.FEATURE_DEPENDENCY: {
				FeatureDependency featureDependency = (FeatureDependency)theEObject;
				T result = caseFeatureDependency(featureDependency);
				if (result == null) result = caseHybridElement(featureDependency);
				if (result == null) result = caseUUIDElement(featureDependency);
				if (result == null) result = caseProductSpaceElement(featureDependency);
				if (result == null) result = caseVersionSpaceElement(featureDependency);
				if (result == null) result = caseElement(featureDependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModFeaturePackage.FEATURE_REQUIREMENT: {
				FeatureRequirement featureRequirement = (FeatureRequirement)theEObject;
				T result = caseFeatureRequirement(featureRequirement);
				if (result == null) result = caseFeatureDependency(featureRequirement);
				if (result == null) result = caseHybridElement(featureRequirement);
				if (result == null) result = caseUUIDElement(featureRequirement);
				if (result == null) result = caseProductSpaceElement(featureRequirement);
				if (result == null) result = caseVersionSpaceElement(featureRequirement);
				if (result == null) result = caseElement(featureRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModFeaturePackage.FEATURE_EXCLUSION: {
				FeatureExclusion featureExclusion = (FeatureExclusion)theEObject;
				T result = caseFeatureExclusion(featureExclusion);
				if (result == null) result = caseFeatureDependency(featureExclusion);
				if (result == null) result = caseHybridElement(featureExclusion);
				if (result == null) result = caseUUIDElement(featureExclusion);
				if (result == null) result = caseProductSpaceElement(featureExclusion);
				if (result == null) result = caseVersionSpaceElement(featureExclusion);
				if (result == null) result = caseElement(featureExclusion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModFeaturePackage.ROOT_RELATIONSHIP: {
				RootRelationship rootRelationship = (RootRelationship)theEObject;
				T result = caseRootRelationship(rootRelationship);
				if (result == null) result = caseHybridElement(rootRelationship);
				if (result == null) result = caseProductSpaceElement(rootRelationship);
				if (result == null) result = caseVersionSpaceElement(rootRelationship);
				if (result == null) result = caseElement(rootRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModFeaturePackage.CHILD_RELATIONSHIP: {
				ChildRelationship childRelationship = (ChildRelationship)theEObject;
				T result = caseChildRelationship(childRelationship);
				if (result == null) result = caseHybridElement(childRelationship);
				if (result == null) result = caseProductSpaceElement(childRelationship);
				if (result == null) result = caseVersionSpaceElement(childRelationship);
				if (result == null) result = caseElement(childRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModFeaturePackage.MANDATORY: {
				Mandatory mandatory = (Mandatory)theEObject;
				T result = caseMandatory(mandatory);
				if (result == null) result = caseHybridElement(mandatory);
				if (result == null) result = caseProductSpaceElement(mandatory);
				if (result == null) result = caseVersionSpaceElement(mandatory);
				if (result == null) result = caseElement(mandatory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModFeaturePackage.ELIMINATION: {
				Elimination elimination = (Elimination)theEObject;
				T result = caseElimination(elimination);
				if (result == null) result = caseHybridElement(elimination);
				if (result == null) result = caseProductSpaceElement(elimination);
				if (result == null) result = caseVersionSpaceElement(elimination);
				if (result == null) result = caseElement(elimination);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureModel(FeatureModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeature(Feature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Display Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Display Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisplayName(DisplayName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureGroup(FeatureGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Membership</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Membership</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupMembership(GroupMembership object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or Feature Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or Feature Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrFeatureGroup(OrFeatureGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xor Feature Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xor Feature Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXorFeatureGroup(XorFeatureGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureDependency(FeatureDependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureRequirement(FeatureRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Exclusion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Exclusion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureExclusion(FeatureExclusion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRootRelationship(RootRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Child Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Child Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChildRelationship(ChildRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mandatory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mandatory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMandatory(Mandatory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elimination</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elimination</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElimination(Elimination object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDimension(Dimension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Version Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Version Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVersionDimension(VersionDimension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Version Space Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Version Space Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVersionSpaceElement(VersionSpaceElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hybrid Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hybrid Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHybridElement(HybridElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UUID Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UUID Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUUIDElement(UUIDElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductDimension(ProductDimension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hybrid Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hybrid Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHybridDimension(HybridDimension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Space Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Space Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductSpaceElement(ProductSpaceElement object) {
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

} //SuperModSPLESwitch
