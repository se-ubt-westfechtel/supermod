/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.emffile.client.impl;

import de.ubt.ai1.supermod.mm.emffile.EMFObject;
import de.ubt.ai1.supermod.mm.emffile.client.*;
import java.util.Map;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
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
import de.ubt.ai1.supermod.mm.emffile.client.SuperModEMFFileClientFactory;
import de.ubt.ai1.supermod.mm.emffile.client.SuperModEMFFileClientPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * <!-- end-user-doc -->
 * @generated
 */
public class SuperModEMFFileClientFactoryImpl extends EFactoryImpl implements SuperModEMFFileClientFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SuperModEMFFileClientFactory init() {
		try {
			SuperModEMFFileClientFactory theSuperModEMFFileClientFactory = (SuperModEMFFileClientFactory)EPackage.Registry.INSTANCE.getEFactory(SuperModEMFFileClientPackage.eNS_URI);
			if (theSuperModEMFFileClientFactory != null) {
				return theSuperModEMFFileClientFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SuperModEMFFileClientFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperModEMFFileClientFactoryImpl() {
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
			case SuperModEMFFileClientPackage.EMF_OBJECT_CLASS_CONFLICT: return createEMFObjectClassConflict();
			case SuperModEMFFileClientPackage.EMF_CLASS_DEFINITION_CONFLICT: return createEMFClassDefinitionConflict();
			case SuperModEMFFileClientPackage.EMF_FEATURE_COMPATIBILITY_CONFLICT: return createEMFFeatureCompatibilityConflict();
			case SuperModEMFFileClientPackage.EMF_OBJECT_CONTAINER_CONFLICT: return createEMFObjectContainerConflict();
			case SuperModEMFFileClientPackage.EMF_CYCLIC_CONTAINMENT_CONFLICT: return createEMFCyclicContainmentConflict();
			case SuperModEMFFileClientPackage.EMF_SINGLE_FEATURE_VALUE_CONFLICT: return createEMFSingleFeatureValueConflict();
			case SuperModEMFFileClientPackage.EMF_MULTI_FEATURE_VALUE_CONFLICT: return createEMFMultiFeatureValueConflict();
			case SuperModEMFFileClientPackage.EMF_LINK_COMPATIBILITY_CONFLICT: return createEMFLinkCompatibilityConflict();
			case SuperModEMFFileClientPackage.EMF_OBJECT_DEFINITION_CONFLICT: return createEMFObjectDefinitionConflict();
			case SuperModEMFFileClientPackage.EMF_REFERENTIAL_INTEGRITY_CONFLICT: return createEMFReferentialIntegrityConflict();
			case SuperModEMFFileClientPackage.EMF_FILE_EXPORT_TRACE: return createEMFFileExportTrace();
			case SuperModEMFFileClientPackage.EMF_OBJECT_TO_EOBJECT_MAP_ENTRY: return (EObject)createEMFObjectToEObjectMapEntry();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFObjectClassConflict createEMFObjectClassConflict() {
		EMFObjectClassConflictImpl emfObjectClassConflict = new EMFObjectClassConflictImpl();
		return emfObjectClassConflict;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFClassDefinitionConflict createEMFClassDefinitionConflict() {
		EMFClassDefinitionConflictImpl emfClassDefinitionConflict = new EMFClassDefinitionConflictImpl();
		return emfClassDefinitionConflict;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFFeatureCompatibilityConflict createEMFFeatureCompatibilityConflict() {
		EMFFeatureCompatibilityConflictImpl emfFeatureCompatibilityConflict = new EMFFeatureCompatibilityConflictImpl();
		return emfFeatureCompatibilityConflict;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFObjectContainerConflict createEMFObjectContainerConflict() {
		EMFObjectContainerConflictImpl emfObjectContainerConflict = new EMFObjectContainerConflictImpl();
		return emfObjectContainerConflict;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFCyclicContainmentConflict createEMFCyclicContainmentConflict() {
		EMFCyclicContainmentConflictImpl emfCyclicContainmentConflict = new EMFCyclicContainmentConflictImpl();
		return emfCyclicContainmentConflict;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFSingleFeatureValueConflict createEMFSingleFeatureValueConflict() {
		EMFSingleFeatureValueConflictImpl emfSingleFeatureValueConflict = new EMFSingleFeatureValueConflictImpl();
		return emfSingleFeatureValueConflict;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFMultiFeatureValueConflict createEMFMultiFeatureValueConflict() {
		EMFMultiFeatureValueConflictImpl emfMultiFeatureValueConflict = new EMFMultiFeatureValueConflictImpl();
		return emfMultiFeatureValueConflict;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFLinkCompatibilityConflict createEMFLinkCompatibilityConflict() {
		EMFLinkCompatibilityConflictImpl emfLinkCompatibilityConflict = new EMFLinkCompatibilityConflictImpl();
		return emfLinkCompatibilityConflict;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFObjectDefinitionConflict createEMFObjectDefinitionConflict() {
		EMFObjectDefinitionConflictImpl emfObjectDefinitionConflict = new EMFObjectDefinitionConflictImpl();
		return emfObjectDefinitionConflict;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFReferentialIntegrityConflict createEMFReferentialIntegrityConflict() {
		EMFReferentialIntegrityConflictImpl emfReferentialIntegrityConflict = new EMFReferentialIntegrityConflictImpl();
		return emfReferentialIntegrityConflict;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFFileExportTrace createEMFFileExportTrace() {
		EMFFileExportTraceImpl emfFileExportTrace = new EMFFileExportTraceImpl();
		return emfFileExportTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<EMFObject, EObject> createEMFObjectToEObjectMapEntry() {
		EMFObjectToEObjectMapEntryImpl emfObjectToEObjectMapEntry = new EMFObjectToEObjectMapEntryImpl();
		return emfObjectToEObjectMapEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperModEMFFileClientPackage getSuperModEMFFileClientPackage() {
		return (SuperModEMFFileClientPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SuperModEMFFileClientPackage getPackage() {
		return SuperModEMFFileClientPackage.eINSTANCE;
	}

} //SuperModEMFFileClientFactoryImpl
