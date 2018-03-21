/******************************************************************************
 * Copyright (c) 2018 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.feature.client.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import de.ubt.ai1.supermod.mm.client.ProductConflict;
import de.ubt.ai1.supermod.mm.client.ProductDimensionExportTrace;
import de.ubt.ai1.supermod.mm.client.SingleVersionProductDimensionDescriptor;
import de.ubt.ai1.supermod.mm.feature.Feature;
import de.ubt.ai1.supermod.mm.feature.client.*;
import java.util.Map;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>,
 * 			Johannes Schroepfer <Johannes.M.Schroepfer(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	2018-01-09
 * <!-- end-user-doc -->
 * @see de.ubt.ai1.supermod.mm.feature.client.SuperModFeatureClientPackage
 * @generated
 */
public class SuperModFeatureClientSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SuperModFeatureClientPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperModFeatureClientSwitch() {
		if (modelPackage == null) {
			modelPackage = SuperModFeatureClientPackage.eINSTANCE;
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
			case SuperModFeatureClientPackage.ROOT_FEATURE_CONFLICT: {
				RootFeatureConflict rootFeatureConflict = (RootFeatureConflict)theEObject;
				T result = caseRootFeatureConflict(rootFeatureConflict);
				if (result == null) result = caseProductConflict(rootFeatureConflict);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModFeatureClientPackage.PARENT_FEATURE_CONFLICT: {
				ParentFeatureConflict parentFeatureConflict = (ParentFeatureConflict)theEObject;
				T result = caseParentFeatureConflict(parentFeatureConflict);
				if (result == null) result = caseProductConflict(parentFeatureConflict);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModFeatureClientPackage.CYCLIC_FEATURE_TREE_CONFLICT: {
				CyclicFeatureTreeConflict cyclicFeatureTreeConflict = (CyclicFeatureTreeConflict)theEObject;
				T result = caseCyclicFeatureTreeConflict(cyclicFeatureTreeConflict);
				if (result == null) result = caseProductConflict(cyclicFeatureTreeConflict);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModFeatureClientPackage.DISPLAY_NAME_CONFLICT: {
				DisplayNameConflict displayNameConflict = (DisplayNameConflict)theEObject;
				T result = caseDisplayNameConflict(displayNameConflict);
				if (result == null) result = caseProductConflict(displayNameConflict);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModFeatureClientPackage.MULTIPLE_GROUP_MEMBERSHIP_CONFLICT: {
				MultipleGroupMembershipConflict multipleGroupMembershipConflict = (MultipleGroupMembershipConflict)theEObject;
				T result = caseMultipleGroupMembershipConflict(multipleGroupMembershipConflict);
				if (result == null) result = caseProductConflict(multipleGroupMembershipConflict);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModFeatureClientPackage.REMOTE_GROUP_MEMBERSHIP_CONFLICT: {
				RemoteGroupMembershipConflict remoteGroupMembershipConflict = (RemoteGroupMembershipConflict)theEObject;
				T result = caseRemoteGroupMembershipConflict(remoteGroupMembershipConflict);
				if (result == null) result = caseProductConflict(remoteGroupMembershipConflict);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModFeatureClientPackage.NON_OPTIONAL_GROUPED_FEATURE_CONFLICT: {
				NonOptionalGroupedFeatureConflict nonOptionalGroupedFeatureConflict = (NonOptionalGroupedFeatureConflict)theEObject;
				T result = caseNonOptionalGroupedFeatureConflict(nonOptionalGroupedFeatureConflict);
				if (result == null) result = caseProductConflict(nonOptionalGroupedFeatureConflict);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModFeatureClientPackage.DEPENDENCY_LINK_TARGET_CONFLICT: {
				DependencyLinkTargetConflict dependencyLinkTargetConflict = (DependencyLinkTargetConflict)theEObject;
				T result = caseDependencyLinkTargetConflict(dependencyLinkTargetConflict);
				if (result == null) result = caseProductConflict(dependencyLinkTargetConflict);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModFeatureClientPackage.DANGLING_FEATURE_CONFLICT: {
				DanglingFeatureConflict danglingFeatureConflict = (DanglingFeatureConflict)theEObject;
				T result = caseDanglingFeatureConflict(danglingFeatureConflict);
				if (result == null) result = caseProductConflict(danglingFeatureConflict);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModFeatureClientPackage.DANGLING_GROUP_CONFLICT: {
				DanglingGroupConflict danglingGroupConflict = (DanglingGroupConflict)theEObject;
				T result = caseDanglingGroupConflict(danglingGroupConflict);
				if (result == null) result = caseProductConflict(danglingGroupConflict);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModFeatureClientPackage.DANGLING_DEPENDENCY_CONFLICT: {
				DanglingDependencyConflict danglingDependencyConflict = (DanglingDependencyConflict)theEObject;
				T result = caseDanglingDependencyConflict(danglingDependencyConflict);
				if (result == null) result = caseProductConflict(danglingDependencyConflict);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModFeatureClientPackage.SINGLE_VERSION_FEATURE_MODEL_DESCRIPTOR: {
				SingleVersionFeatureModelDescriptor singleVersionFeatureModelDescriptor = (SingleVersionFeatureModelDescriptor)theEObject;
				T result = caseSingleVersionFeatureModelDescriptor(singleVersionFeatureModelDescriptor);
				if (result == null) result = caseSingleVersionProductDimensionDescriptor(singleVersionFeatureModelDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModFeatureClientPackage.FEATURE_CONFIGURATION: {
				FeatureConfiguration featureConfiguration = (FeatureConfiguration)theEObject;
				T result = caseFeatureConfiguration(featureConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModFeatureClientPackage.FEATURE_MODEL_EXPORT_TRACE: {
				FeatureModelExportTrace featureModelExportTrace = (FeatureModelExportTrace)theEObject;
				T result = caseFeatureModelExportTrace(featureModelExportTrace);
				if (result == null) result = caseProductDimensionExportTrace(featureModelExportTrace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModFeatureClientPackage.FEATURE_TO_FEATURE_MAP_ENTRY: {
				@SuppressWarnings("unchecked") Map.Entry<Feature, Feature> featureToFeatureMapEntry = (Map.Entry<Feature, Feature>)theEObject;
				T result = caseFeatureToFeatureMapEntry(featureToFeatureMapEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Version Feature Model Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Version Feature Model Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleVersionFeatureModelDescriptor(SingleVersionFeatureModelDescriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Feature Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Feature Conflict</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRootFeatureConflict(RootFeatureConflict object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parent Feature Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parent Feature Conflict</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParentFeatureConflict(ParentFeatureConflict object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cyclic Feature Tree Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cyclic Feature Tree Conflict</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCyclicFeatureTreeConflict(CyclicFeatureTreeConflict object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Non Optional Grouped Feature Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Optional Grouped Feature Conflict</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonOptionalGroupedFeatureConflict(NonOptionalGroupedFeatureConflict object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependency Link Target Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependency Link Target Conflict</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependencyLinkTargetConflict(DependencyLinkTargetConflict object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dangling Feature Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dangling Feature Conflict</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDanglingFeatureConflict(DanglingFeatureConflict object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dangling Group Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dangling Group Conflict</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDanglingGroupConflict(DanglingGroupConflict object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dangling Dependency Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dangling Dependency Conflict</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDanglingDependencyConflict(DanglingDependencyConflict object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Display Name Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Display Name Conflict</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisplayNameConflict(DisplayNameConflict object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiple Group Membership Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiple Group Membership Conflict</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultipleGroupMembershipConflict(MultipleGroupMembershipConflict object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remote Group Membership Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remote Group Membership Conflict</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoteGroupMembershipConflict(RemoteGroupMembershipConflict object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureConfiguration(FeatureConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Model Export Trace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Model Export Trace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureModelExportTrace(FeatureModelExportTrace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature To Feature Map Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature To Feature Map Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureToFeatureMapEntry(Map.Entry<Feature, Feature> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Version Product Dimension Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Version Product Dimension Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleVersionProductDimensionDescriptor(SingleVersionProductDimensionDescriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Conflict</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductConflict(ProductConflict object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Dimension Export Trace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Dimension Export Trace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductDimensionExportTrace(ProductDimensionExportTrace object) {
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

} //SuperModFeatureClientSwitch
