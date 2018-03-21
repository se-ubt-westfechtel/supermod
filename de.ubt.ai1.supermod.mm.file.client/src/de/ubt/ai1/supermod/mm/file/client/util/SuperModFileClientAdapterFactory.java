/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.file.client.util;

import de.ubt.ai1.supermod.mm.client.ProductDimensionExportTrace;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import de.ubt.ai1.supermod.mm.client.SingleVersionProductDimensionDescriptor;
import de.ubt.ai1.supermod.mm.file.client.*;
import java.util.Map;
import de.ubt.ai1.supermod.mm.file.client.SingleVersionFileDescriptor;
import de.ubt.ai1.supermod.mm.file.client.SingleVersionFileSystemDescriptor;
import de.ubt.ai1.supermod.mm.file.client.SingleVersionFolderDescriptor;
import de.ubt.ai1.supermod.mm.file.client.SingleVersionResourceDescriptor;
import de.ubt.ai1.supermod.mm.file.client.SuperModFileClientPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * <!-- end-user-doc -->
 * @see de.ubt.ai1.supermod.mm.file.client.SuperModFileClientPackage
 * @generated
 */
public class SuperModFileClientAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SuperModFileClientPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperModFileClientAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SuperModFileClientPackage.eINSTANCE;
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
	protected SuperModFileClientSwitch<Adapter> modelSwitch =
		new SuperModFileClientSwitch<Adapter>() {
			@Override
			public Adapter caseSingleVersionFileSystemDescriptor(SingleVersionFileSystemDescriptor object) {
				return createSingleVersionFileSystemDescriptorAdapter();
			}
			@Override
			public Adapter caseSingleVersionResourceDescriptor(SingleVersionResourceDescriptor object) {
				return createSingleVersionResourceDescriptorAdapter();
			}
			@Override
			public Adapter caseSingleVersionFileDescriptor(SingleVersionFileDescriptor object) {
				return createSingleVersionFileDescriptorAdapter();
			}
			@Override
			public Adapter caseSingleVersionFolderDescriptor(SingleVersionFolderDescriptor object) {
				return createSingleVersionFolderDescriptorAdapter();
			}
			@Override
			public Adapter caseVersionedFileSystemExportTrace(VersionedFileSystemExportTrace object) {
				return createVersionedFileSystemExportTraceAdapter();
			}
			@Override
			public Adapter casePathToVersionedFileMapEntry(Map.Entry<String, VersionedFileExportTrace> object) {
				return createPathToVersionedFileMapEntryAdapter();
			}
			@Override
			public Adapter caseVersionedFileExportTrace(VersionedFileExportTrace object) {
				return createVersionedFileExportTraceAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.ubt.ai1.supermod.mm.file.client.SingleVersionFileSystemDescriptor <em>Single Version File System Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai1.supermod.mm.file.client.SingleVersionFileSystemDescriptor
	 * @generated
	 */
	public Adapter createSingleVersionFileSystemDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai1.supermod.mm.file.client.SingleVersionResourceDescriptor <em>Single Version Resource Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai1.supermod.mm.file.client.SingleVersionResourceDescriptor
	 * @generated
	 */
	public Adapter createSingleVersionResourceDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai1.supermod.mm.file.client.SingleVersionFileDescriptor <em>Single Version File Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai1.supermod.mm.file.client.SingleVersionFileDescriptor
	 * @generated
	 */
	public Adapter createSingleVersionFileDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai1.supermod.mm.file.client.SingleVersionFolderDescriptor <em>Single Version Folder Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai1.supermod.mm.file.client.SingleVersionFolderDescriptor
	 * @generated
	 */
	public Adapter createSingleVersionFolderDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai1.supermod.mm.file.client.VersionedFileSystemExportTrace <em>Versioned File System Export Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai1.supermod.mm.file.client.VersionedFileSystemExportTrace
	 * @generated
	 */
	public Adapter createVersionedFileSystemExportTraceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Path To Versioned File Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createPathToVersionedFileMapEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai1.supermod.mm.file.client.VersionedFileExportTrace <em>Versioned File Export Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai1.supermod.mm.file.client.VersionedFileExportTrace
	 * @generated
	 */
	public Adapter createVersionedFileExportTraceAdapter() {
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

} //SuperModFileClientAdapterFactory
