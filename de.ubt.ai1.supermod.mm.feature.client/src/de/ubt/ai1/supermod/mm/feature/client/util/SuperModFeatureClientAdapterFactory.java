/******************************************************************************
 * Copyright (c) 2018 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.feature.client.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import de.ubt.ai1.supermod.mm.client.ProductConflict;
import de.ubt.ai1.supermod.mm.client.ProductDimensionExportTrace;
import de.ubt.ai1.supermod.mm.client.SingleVersionProductDimensionDescriptor;
import de.ubt.ai1.supermod.mm.feature.Feature;
import de.ubt.ai1.supermod.mm.feature.client.*;
import java.util.Map;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>,
 * 			Johannes Schroepfer <Johannes.M.Schroepfer(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	2018-01-09
 * <!-- end-user-doc -->
 * @see de.ubt.ai1.supermod.mm.feature.client.SuperModFeatureClientPackage
 * @generated
 */
public class SuperModFeatureClientAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SuperModFeatureClientPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperModFeatureClientAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SuperModFeatureClientPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SuperModFeatureClientSwitch<Adapter> modelSwitch =
		new SuperModFeatureClientSwitch<Adapter>() {
			@Override
			public Adapter caseRootFeatureConflict(RootFeatureConflict object) {
				return createRootFeatureConflictAdapter();
			}
			@Override
			public Adapter caseParentFeatureConflict(ParentFeatureConflict object) {
				return createParentFeatureConflictAdapter();
			}
			@Override
			public Adapter caseCyclicFeatureTreeConflict(CyclicFeatureTreeConflict object) {
				return createCyclicFeatureTreeConflictAdapter();
			}
			@Override
			public Adapter caseDisplayNameConflict(DisplayNameConflict object) {
				return createDisplayNameConflictAdapter();
			}
			@Override
			public Adapter caseMultipleGroupMembershipConflict(MultipleGroupMembershipConflict object) {
				return createMultipleGroupMembershipConflictAdapter();
			}
			@Override
			public Adapter caseRemoteGroupMembershipConflict(RemoteGroupMembershipConflict object) {
				return createRemoteGroupMembershipConflictAdapter();
			}
			@Override
			public Adapter caseNonOptionalGroupedFeatureConflict(NonOptionalGroupedFeatureConflict object) {
				return createNonOptionalGroupedFeatureConflictAdapter();
			}
			@Override
			public Adapter caseDependencyLinkTargetConflict(DependencyLinkTargetConflict object) {
				return createDependencyLinkTargetConflictAdapter();
			}
			@Override
			public Adapter caseDanglingFeatureConflict(DanglingFeatureConflict object) {
				return createDanglingFeatureConflictAdapter();
			}
			@Override
			public Adapter caseDanglingGroupConflict(DanglingGroupConflict object) {
				return createDanglingGroupConflictAdapter();
			}
			@Override
			public Adapter caseDanglingDependencyConflict(DanglingDependencyConflict object) {
				return createDanglingDependencyConflictAdapter();
			}
			@Override
			public Adapter caseSingleVersionFeatureModelDescriptor(SingleVersionFeatureModelDescriptor object) {
				return createSingleVersionFeatureModelDescriptorAdapter();
			}
			@Override
			public Adapter caseFeatureConfiguration(FeatureConfiguration object) {
				return createFeatureConfigurationAdapter();
			}
			@Override
			public Adapter caseFeatureModelExportTrace(FeatureModelExportTrace object) {
				return createFeatureModelExportTraceAdapter();
			}
			@Override
			public Adapter caseFeatureToFeatureMapEntry(Map.Entry<Feature, Feature> object) {
				return createFeatureToFeatureMapEntryAdapter();
			}
			@Override
			public Adapter caseProductConflict(ProductConflict object) {
				return createProductConflictAdapter();
			}
			@Override
			public Adapter caseSingleVersionProductDimensionDescriptor(SingleVersionProductDimensionDescriptor object) {
				return createSingleVersionProductDimensionDescriptorAdapter();
			}
			@Override
			public Adapter caseProductDimensionExportTrace(ProductDimensionExportTrace object) {
				return createProductDimensionExportTraceAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai1.supermod.mm.feature.client.SingleVersionFeatureModelDescriptor <em>Single Version Feature Model Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai1.supermod.mm.feature.client.SingleVersionFeatureModelDescriptor
	 * @generated
	 */
	public Adapter createSingleVersionFeatureModelDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai1.supermod.mm.feature.client.RootFeatureConflict <em>Root Feature Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai1.supermod.mm.feature.client.RootFeatureConflict
	 * @generated
	 */
	public Adapter createRootFeatureConflictAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai1.supermod.mm.feature.client.ParentFeatureConflict <em>Parent Feature Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai1.supermod.mm.feature.client.ParentFeatureConflict
	 * @generated
	 */
	public Adapter createParentFeatureConflictAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai1.supermod.mm.feature.client.CyclicFeatureTreeConflict <em>Cyclic Feature Tree Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai1.supermod.mm.feature.client.CyclicFeatureTreeConflict
	 * @generated
	 */
	public Adapter createCyclicFeatureTreeConflictAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai1.supermod.mm.feature.client.NonOptionalGroupedFeatureConflict <em>Non Optional Grouped Feature Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai1.supermod.mm.feature.client.NonOptionalGroupedFeatureConflict
	 * @generated
	 */
	public Adapter createNonOptionalGroupedFeatureConflictAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai1.supermod.mm.feature.client.DependencyLinkTargetConflict <em>Dependency Link Target Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai1.supermod.mm.feature.client.DependencyLinkTargetConflict
	 * @generated
	 */
	public Adapter createDependencyLinkTargetConflictAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai1.supermod.mm.feature.client.DanglingFeatureConflict <em>Dangling Feature Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai1.supermod.mm.feature.client.DanglingFeatureConflict
	 * @generated
	 */
	public Adapter createDanglingFeatureConflictAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai1.supermod.mm.feature.client.DanglingGroupConflict <em>Dangling Group Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai1.supermod.mm.feature.client.DanglingGroupConflict
	 * @generated
	 */
	public Adapter createDanglingGroupConflictAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai1.supermod.mm.feature.client.DanglingDependencyConflict <em>Dangling Dependency Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai1.supermod.mm.feature.client.DanglingDependencyConflict
	 * @generated
	 */
	public Adapter createDanglingDependencyConflictAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai1.supermod.mm.feature.client.DisplayNameConflict <em>Display Name Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai1.supermod.mm.feature.client.DisplayNameConflict
	 * @generated
	 */
	public Adapter createDisplayNameConflictAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai1.supermod.mm.feature.client.MultipleGroupMembershipConflict <em>Multiple Group Membership Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai1.supermod.mm.feature.client.MultipleGroupMembershipConflict
	 * @generated
	 */
	public Adapter createMultipleGroupMembershipConflictAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai1.supermod.mm.feature.client.RemoteGroupMembershipConflict <em>Remote Group Membership Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai1.supermod.mm.feature.client.RemoteGroupMembershipConflict
	 * @generated
	 */
	public Adapter createRemoteGroupMembershipConflictAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai1.supermod.mm.feature.client.FeatureConfiguration <em>Feature Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai1.supermod.mm.feature.client.FeatureConfiguration
	 * @generated
	 */
	public Adapter createFeatureConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai1.supermod.mm.feature.client.FeatureModelExportTrace <em>Feature Model Export Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai1.supermod.mm.feature.client.FeatureModelExportTrace
	 * @generated
	 */
	public Adapter createFeatureModelExportTraceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Feature To Feature Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createFeatureToFeatureMapEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai1.supermod.mm.client.SingleVersionProductDimensionDescriptor <em>Single Version Product Dimension Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai1.supermod.mm.client.SingleVersionProductDimensionDescriptor
	 * @generated
	 */
	public Adapter createSingleVersionProductDimensionDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai1.supermod.mm.client.ProductConflict <em>Product Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai1.supermod.mm.client.ProductConflict
	 * @generated
	 */
	public Adapter createProductConflictAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai1.supermod.mm.client.ProductDimensionExportTrace <em>Product Dimension Export Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai1.supermod.mm.client.ProductDimensionExportTrace
	 * @generated
	 */
	public Adapter createProductDimensionExportTraceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SuperModFeatureClientAdapterFactory
