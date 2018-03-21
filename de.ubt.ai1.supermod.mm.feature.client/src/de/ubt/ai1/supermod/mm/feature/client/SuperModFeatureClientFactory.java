/******************************************************************************
 * Copyright (c) 2018 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.feature.client;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>,
 * 			Johannes Schroepfer <Johannes.M.Schroepfer(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	2018-01-09
 * <!-- end-user-doc -->
 * @see de.ubt.ai1.supermod.mm.feature.client.SuperModFeatureClientPackage
 * @generated
 */
public interface SuperModFeatureClientFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SuperModFeatureClientFactory eINSTANCE = de.ubt.ai1.supermod.mm.feature.client.impl.SuperModFeatureClientFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Single Version Feature Model Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Version Feature Model Descriptor</em>'.
	 * @generated
	 */
	SingleVersionFeatureModelDescriptor createSingleVersionFeatureModelDescriptor();

	/**
	 * Returns a new object of class '<em>Root Feature Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root Feature Conflict</em>'.
	 * @generated
	 */
	RootFeatureConflict createRootFeatureConflict();

	/**
	 * Returns a new object of class '<em>Parent Feature Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parent Feature Conflict</em>'.
	 * @generated
	 */
	ParentFeatureConflict createParentFeatureConflict();

	/**
	 * Returns a new object of class '<em>Cyclic Feature Tree Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cyclic Feature Tree Conflict</em>'.
	 * @generated
	 */
	CyclicFeatureTreeConflict createCyclicFeatureTreeConflict();

	/**
	 * Returns a new object of class '<em>Non Optional Grouped Feature Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Non Optional Grouped Feature Conflict</em>'.
	 * @generated
	 */
	NonOptionalGroupedFeatureConflict createNonOptionalGroupedFeatureConflict();

	/**
	 * Returns a new object of class '<em>Dependency Link Target Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dependency Link Target Conflict</em>'.
	 * @generated
	 */
	DependencyLinkTargetConflict createDependencyLinkTargetConflict();

	/**
	 * Returns a new object of class '<em>Dangling Feature Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dangling Feature Conflict</em>'.
	 * @generated
	 */
	DanglingFeatureConflict createDanglingFeatureConflict();

	/**
	 * Returns a new object of class '<em>Dangling Group Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dangling Group Conflict</em>'.
	 * @generated
	 */
	DanglingGroupConflict createDanglingGroupConflict();

	/**
	 * Returns a new object of class '<em>Dangling Dependency Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dangling Dependency Conflict</em>'.
	 * @generated
	 */
	DanglingDependencyConflict createDanglingDependencyConflict();

	/**
	 * Returns a new object of class '<em>Display Name Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Display Name Conflict</em>'.
	 * @generated
	 */
	DisplayNameConflict createDisplayNameConflict();

	/**
	 * Returns a new object of class '<em>Multiple Group Membership Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiple Group Membership Conflict</em>'.
	 * @generated
	 */
	MultipleGroupMembershipConflict createMultipleGroupMembershipConflict();

	/**
	 * Returns a new object of class '<em>Remote Group Membership Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remote Group Membership Conflict</em>'.
	 * @generated
	 */
	RemoteGroupMembershipConflict createRemoteGroupMembershipConflict();

	/**
	 * Returns a new object of class '<em>Feature Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Configuration</em>'.
	 * @generated
	 */
	FeatureConfiguration createFeatureConfiguration();

	/**
	 * Returns a new object of class '<em>Feature Model Export Trace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Model Export Trace</em>'.
	 * @generated
	 */
	FeatureModelExportTrace createFeatureModelExportTrace();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SuperModFeatureClientPackage getSuperModFeatureClientPackage();

} //SuperModFeatureClientFactory
