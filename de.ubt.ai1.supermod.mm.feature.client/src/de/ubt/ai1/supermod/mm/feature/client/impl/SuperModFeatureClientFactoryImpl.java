/******************************************************************************
 * Copyright (c) 2018 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.feature.client.impl;

import de.ubt.ai1.supermod.mm.feature.Feature;
import de.ubt.ai1.supermod.mm.feature.client.*;
import java.util.Map;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>,
 * 			Johannes Schroepfer <Johannes.M.Schroepfer(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	2018-01-09
 * <!-- end-user-doc -->
 * @generated
 */
public class SuperModFeatureClientFactoryImpl extends EFactoryImpl implements SuperModFeatureClientFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SuperModFeatureClientFactory init() {
		try {
			SuperModFeatureClientFactory theSuperModFeatureClientFactory = (SuperModFeatureClientFactory)EPackage.Registry.INSTANCE.getEFactory(SuperModFeatureClientPackage.eNS_URI);
			if (theSuperModFeatureClientFactory != null) {
				return theSuperModFeatureClientFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SuperModFeatureClientFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperModFeatureClientFactoryImpl() {
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
			case SuperModFeatureClientPackage.ROOT_FEATURE_CONFLICT: return createRootFeatureConflict();
			case SuperModFeatureClientPackage.PARENT_FEATURE_CONFLICT: return createParentFeatureConflict();
			case SuperModFeatureClientPackage.CYCLIC_FEATURE_TREE_CONFLICT: return createCyclicFeatureTreeConflict();
			case SuperModFeatureClientPackage.DISPLAY_NAME_CONFLICT: return createDisplayNameConflict();
			case SuperModFeatureClientPackage.MULTIPLE_GROUP_MEMBERSHIP_CONFLICT: return createMultipleGroupMembershipConflict();
			case SuperModFeatureClientPackage.REMOTE_GROUP_MEMBERSHIP_CONFLICT: return createRemoteGroupMembershipConflict();
			case SuperModFeatureClientPackage.NON_OPTIONAL_GROUPED_FEATURE_CONFLICT: return createNonOptionalGroupedFeatureConflict();
			case SuperModFeatureClientPackage.DEPENDENCY_LINK_TARGET_CONFLICT: return createDependencyLinkTargetConflict();
			case SuperModFeatureClientPackage.DANGLING_FEATURE_CONFLICT: return createDanglingFeatureConflict();
			case SuperModFeatureClientPackage.DANGLING_GROUP_CONFLICT: return createDanglingGroupConflict();
			case SuperModFeatureClientPackage.DANGLING_DEPENDENCY_CONFLICT: return createDanglingDependencyConflict();
			case SuperModFeatureClientPackage.SINGLE_VERSION_FEATURE_MODEL_DESCRIPTOR: return createSingleVersionFeatureModelDescriptor();
			case SuperModFeatureClientPackage.FEATURE_CONFIGURATION: return createFeatureConfiguration();
			case SuperModFeatureClientPackage.FEATURE_MODEL_EXPORT_TRACE: return createFeatureModelExportTrace();
			case SuperModFeatureClientPackage.FEATURE_TO_FEATURE_MAP_ENTRY: return (EObject)createFeatureToFeatureMapEntry();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleVersionFeatureModelDescriptor createSingleVersionFeatureModelDescriptor() {
		SingleVersionFeatureModelDescriptorImpl singleVersionFeatureModelDescriptor = new SingleVersionFeatureModelDescriptorImpl();
		return singleVersionFeatureModelDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootFeatureConflict createRootFeatureConflict() {
		RootFeatureConflictImpl rootFeatureConflict = new RootFeatureConflictImpl();
		return rootFeatureConflict;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParentFeatureConflict createParentFeatureConflict() {
		ParentFeatureConflictImpl parentFeatureConflict = new ParentFeatureConflictImpl();
		return parentFeatureConflict;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CyclicFeatureTreeConflict createCyclicFeatureTreeConflict() {
		CyclicFeatureTreeConflictImpl cyclicFeatureTreeConflict = new CyclicFeatureTreeConflictImpl();
		return cyclicFeatureTreeConflict;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonOptionalGroupedFeatureConflict createNonOptionalGroupedFeatureConflict() {
		NonOptionalGroupedFeatureConflictImpl nonOptionalGroupedFeatureConflict = new NonOptionalGroupedFeatureConflictImpl();
		return nonOptionalGroupedFeatureConflict;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependencyLinkTargetConflict createDependencyLinkTargetConflict() {
		DependencyLinkTargetConflictImpl dependencyLinkTargetConflict = new DependencyLinkTargetConflictImpl();
		return dependencyLinkTargetConflict;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DanglingFeatureConflict createDanglingFeatureConflict() {
		DanglingFeatureConflictImpl danglingFeatureConflict = new DanglingFeatureConflictImpl();
		return danglingFeatureConflict;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DanglingGroupConflict createDanglingGroupConflict() {
		DanglingGroupConflictImpl danglingGroupConflict = new DanglingGroupConflictImpl();
		return danglingGroupConflict;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DanglingDependencyConflict createDanglingDependencyConflict() {
		DanglingDependencyConflictImpl danglingDependencyConflict = new DanglingDependencyConflictImpl();
		return danglingDependencyConflict;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayNameConflict createDisplayNameConflict() {
		DisplayNameConflictImpl displayNameConflict = new DisplayNameConflictImpl();
		return displayNameConflict;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleGroupMembershipConflict createMultipleGroupMembershipConflict() {
		MultipleGroupMembershipConflictImpl multipleGroupMembershipConflict = new MultipleGroupMembershipConflictImpl();
		return multipleGroupMembershipConflict;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoteGroupMembershipConflict createRemoteGroupMembershipConflict() {
		RemoteGroupMembershipConflictImpl remoteGroupMembershipConflict = new RemoteGroupMembershipConflictImpl();
		return remoteGroupMembershipConflict;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureConfiguration createFeatureConfiguration() {
		FeatureConfigurationImpl featureConfiguration = new FeatureConfigurationImpl();
		return featureConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureModelExportTrace createFeatureModelExportTrace() {
		FeatureModelExportTraceImpl featureModelExportTrace = new FeatureModelExportTraceImpl();
		return featureModelExportTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<Feature, Feature> createFeatureToFeatureMapEntry() {
		FeatureToFeatureMapEntryImpl featureToFeatureMapEntry = new FeatureToFeatureMapEntryImpl();
		return featureToFeatureMapEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperModFeatureClientPackage getSuperModFeatureClientPackage() {
		return (SuperModFeatureClientPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SuperModFeatureClientPackage getPackage() {
		return SuperModFeatureClientPackage.eINSTANCE;
	}

} //SuperModFeatureClientFactoryImpl
