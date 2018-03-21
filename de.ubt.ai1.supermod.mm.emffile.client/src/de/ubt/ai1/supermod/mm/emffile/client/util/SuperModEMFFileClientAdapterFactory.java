/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.emffile.client.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import de.ubt.ai1.supermod.mm.client.ProductConflict;
import de.ubt.ai1.supermod.mm.emffile.EMFObject;
import de.ubt.ai1.supermod.mm.emffile.client.*;
import de.ubt.ai1.supermod.mm.file.client.VersionedFileExportTrace;
import java.util.Map;
import de.ubt.ai1.supermod.mm.emffile.client.EMFClassDefinitionConflict;
import de.ubt.ai1.supermod.mm.emffile.client.EMFCyclicContainmentConflict;
import de.ubt.ai1.supermod.mm.emffile.client.EMFFeatureCompatibilityConflict;
import de.ubt.ai1.supermod.mm.emffile.client.EMFLinkCompatibilityConflict;
import de.ubt.ai1.supermod.mm.emffile.client.EMFMultiFeatureValueConflict;
import de.ubt.ai1.supermod.mm.emffile.client.EMFObjectClassConflict;
import de.ubt.ai1.supermod.mm.emffile.client.EMFObjectContainerConflict;
import de.ubt.ai1.supermod.mm.emffile.client.EMFObjectDefinitionConflict;
import de.ubt.ai1.supermod.mm.emffile.client.EMFReferentialIntegrityConflict;
import de.ubt.ai1.supermod.mm.emffile.client.EMFSingleFeatureValueConflict;
import de.ubt.ai1.supermod.mm.emffile.client.SuperModEMFFileClientPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * <!-- end-user-doc -->
 * @see de.ubt.ai1.supermod.mm.emffile.client.SuperModEMFFileClientPackage
 * @generated
 */
public class SuperModEMFFileClientAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SuperModEMFFileClientPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperModEMFFileClientAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SuperModEMFFileClientPackage.eINSTANCE;
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
	protected SuperModEMFFileClientSwitch<Adapter> modelSwitch =
		new SuperModEMFFileClientSwitch<Adapter>() {
			@Override
			public Adapter caseEMFObjectClassConflict(EMFObjectClassConflict object) {
				return createEMFObjectClassConflictAdapter();
			}
			@Override
			public Adapter caseEMFClassDefinitionConflict(EMFClassDefinitionConflict object) {
				return createEMFClassDefinitionConflictAdapter();
			}
			@Override
			public Adapter caseEMFFeatureCompatibilityConflict(EMFFeatureCompatibilityConflict object) {
				return createEMFFeatureCompatibilityConflictAdapter();
			}
			@Override
			public Adapter caseEMFObjectContainerConflict(EMFObjectContainerConflict object) {
				return createEMFObjectContainerConflictAdapter();
			}
			@Override
			public Adapter caseEMFCyclicContainmentConflict(EMFCyclicContainmentConflict object) {
				return createEMFCyclicContainmentConflictAdapter();
			}
			@Override
			public Adapter caseEMFSingleFeatureValueConflict(EMFSingleFeatureValueConflict object) {
				return createEMFSingleFeatureValueConflictAdapter();
			}
			@Override
			public Adapter caseEMFMultiFeatureValueConflict(EMFMultiFeatureValueConflict object) {
				return createEMFMultiFeatureValueConflictAdapter();
			}
			@Override
			public Adapter caseEMFLinkCompatibilityConflict(EMFLinkCompatibilityConflict object) {
				return createEMFLinkCompatibilityConflictAdapter();
			}
			@Override
			public Adapter caseEMFObjectDefinitionConflict(EMFObjectDefinitionConflict object) {
				return createEMFObjectDefinitionConflictAdapter();
			}
			@Override
			public Adapter caseEMFReferentialIntegrityConflict(EMFReferentialIntegrityConflict object) {
				return createEMFReferentialIntegrityConflictAdapter();
			}
			@Override
			public Adapter caseEMFFileExportTrace(EMFFileExportTrace object) {
				return createEMFFileExportTraceAdapter();
			}
			@Override
			public Adapter caseEMFObjectToEObjectMapEntry(Map.Entry<EMFObject, EObject> object) {
				return createEMFObjectToEObjectMapEntryAdapter();
			}
			@Override
			public Adapter caseProductConflict(ProductConflict object) {
				return createProductConflictAdapter();
			}
			@Override
			public Adapter caseVersionedFileExportTrace(VersionedFileExportTrace object) {
				return createVersionedFileExportTraceAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.ubt.ai1.supermod.mm.emffile.client.EMFObjectClassConflict <em>EMF Object Class Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai1.supermod.mm.emffile.client.EMFObjectClassConflict
	 * @generated
	 */
	public Adapter createEMFObjectClassConflictAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai1.supermod.mm.emffile.client.EMFClassDefinitionConflict <em>EMF Class Definition Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai1.supermod.mm.emffile.client.EMFClassDefinitionConflict
	 * @generated
	 */
	public Adapter createEMFClassDefinitionConflictAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai1.supermod.mm.emffile.client.EMFFeatureCompatibilityConflict <em>EMF Feature Compatibility Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai1.supermod.mm.emffile.client.EMFFeatureCompatibilityConflict
	 * @generated
	 */
	public Adapter createEMFFeatureCompatibilityConflictAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai1.supermod.mm.emffile.client.EMFObjectContainerConflict <em>EMF Object Container Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai1.supermod.mm.emffile.client.EMFObjectContainerConflict
	 * @generated
	 */
	public Adapter createEMFObjectContainerConflictAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai1.supermod.mm.emffile.client.EMFCyclicContainmentConflict <em>EMF Cyclic Containment Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai1.supermod.mm.emffile.client.EMFCyclicContainmentConflict
	 * @generated
	 */
	public Adapter createEMFCyclicContainmentConflictAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai1.supermod.mm.emffile.client.EMFSingleFeatureValueConflict <em>EMF Single Feature Value Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai1.supermod.mm.emffile.client.EMFSingleFeatureValueConflict
	 * @generated
	 */
	public Adapter createEMFSingleFeatureValueConflictAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai1.supermod.mm.emffile.client.EMFMultiFeatureValueConflict <em>EMF Multi Feature Value Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai1.supermod.mm.emffile.client.EMFMultiFeatureValueConflict
	 * @generated
	 */
	public Adapter createEMFMultiFeatureValueConflictAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai1.supermod.mm.emffile.client.EMFLinkCompatibilityConflict <em>EMF Link Compatibility Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai1.supermod.mm.emffile.client.EMFLinkCompatibilityConflict
	 * @generated
	 */
	public Adapter createEMFLinkCompatibilityConflictAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai1.supermod.mm.emffile.client.EMFObjectDefinitionConflict <em>EMF Object Definition Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai1.supermod.mm.emffile.client.EMFObjectDefinitionConflict
	 * @generated
	 */
	public Adapter createEMFObjectDefinitionConflictAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai1.supermod.mm.emffile.client.EMFReferentialIntegrityConflict <em>EMF Referential Integrity Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai1.supermod.mm.emffile.client.EMFReferentialIntegrityConflict
	 * @generated
	 */
	public Adapter createEMFReferentialIntegrityConflictAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai1.supermod.mm.emffile.client.EMFFileExportTrace <em>EMF File Export Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai1.supermod.mm.emffile.client.EMFFileExportTrace
	 * @generated
	 */
	public Adapter createEMFFileExportTraceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>EMF Object To EObject Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createEMFObjectToEObjectMapEntryAdapter() {
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

} //SuperModEMFFileClientAdapterFactory
