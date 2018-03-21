/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.client.util;

import de.ubt.ai1.supermod.mm.client.*;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import de.ubt.ai1.supermod.mm.client.ConflictSet;
import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.mm.client.ProductConflict;
import de.ubt.ai1.supermod.mm.client.SingleVersionProductDimensionDescriptor;
import de.ubt.ai1.supermod.mm.client.SingleVersionProductSpaceDescriptor;
import de.ubt.ai1.supermod.mm.client.SuperModClientPackage;
import de.ubt.ai1.supermod.mm.core.Repository;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * <!-- end-user-doc -->
 * @see de.ubt.ai1.supermod.mm.client.SuperModClientPackage
 * @generated
 */
public class SuperModClientAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SuperModClientPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperModClientAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SuperModClientPackage.eINSTANCE;
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
	protected SuperModClientSwitch<Adapter> modelSwitch =
		new SuperModClientSwitch<Adapter>() {
			@Override
			public Adapter caseSingleVersionProductSpaceDescriptor(SingleVersionProductSpaceDescriptor object) {
				return createSingleVersionProductSpaceDescriptorAdapter();
			}
			@Override
			public Adapter caseSingleVersionProductDimensionDescriptor(SingleVersionProductDimensionDescriptor object) {
				return createSingleVersionProductDimensionDescriptorAdapter();
			}
			@Override
			public Adapter caseLocalRepository(LocalRepository object) {
				return createLocalRepositoryAdapter();
			}
			@Override
			public Adapter caseProductSpaceExportTrace(ProductSpaceExportTrace object) {
				return createProductSpaceExportTraceAdapter();
			}
			@Override
			public Adapter caseProductDimensionExportTrace(ProductDimensionExportTrace object) {
				return createProductDimensionExportTraceAdapter();
			}
			@Override
			public Adapter caseConflictSet(ConflictSet object) {
				return createConflictSetAdapter();
			}
			@Override
			public Adapter caseProductConflict(ProductConflict object) {
				return createProductConflictAdapter();
			}
			@Override
			public Adapter caseRepository(Repository object) {
				return createRepositoryAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.ubt.ai1.supermod.mm.client.SingleVersionProductSpaceDescriptor <em>Single Version Product Space Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai1.supermod.mm.client.SingleVersionProductSpaceDescriptor
	 * @generated
	 */
	public Adapter createSingleVersionProductSpaceDescriptorAdapter() {
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
	 * Creates a new adapter for an object of class '{@link de.ubt.ai1.supermod.mm.client.LocalRepository <em>Local Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai1.supermod.mm.client.LocalRepository
	 * @generated
	 */
	public Adapter createLocalRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai1.supermod.mm.client.ProductSpaceExportTrace <em>Product Space Export Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai1.supermod.mm.client.ProductSpaceExportTrace
	 * @generated
	 */
	public Adapter createProductSpaceExportTraceAdapter() {
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
	 * Creates a new adapter for an object of class '{@link de.ubt.ai1.supermod.mm.client.ConflictSet <em>Conflict Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai1.supermod.mm.client.ConflictSet
	 * @generated
	 */
	public Adapter createConflictSetAdapter() {
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
	 * Creates a new adapter for an object of class '{@link de.ubt.ai1.supermod.mm.core.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai1.supermod.mm.core.Repository
	 * @generated
	 */
	public Adapter createRepositoryAdapter() {
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

} //SuperModClientAdapterFactory
