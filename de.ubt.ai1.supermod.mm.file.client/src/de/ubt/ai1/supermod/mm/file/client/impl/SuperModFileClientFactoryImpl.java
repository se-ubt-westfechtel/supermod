/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.file.client.impl;

import de.ubt.ai1.supermod.mm.file.client.*;
import java.util.Map;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import de.ubt.ai1.supermod.mm.file.client.SingleVersionFileDescriptor;
import de.ubt.ai1.supermod.mm.file.client.SingleVersionFileSystemDescriptor;
import de.ubt.ai1.supermod.mm.file.client.SingleVersionFolderDescriptor;
import de.ubt.ai1.supermod.mm.file.client.SuperModFileClientFactory;
import de.ubt.ai1.supermod.mm.file.client.SuperModFileClientPackage;

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
public class SuperModFileClientFactoryImpl extends EFactoryImpl implements SuperModFileClientFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SuperModFileClientFactory init() {
		try {
			SuperModFileClientFactory theSuperModFileClientFactory = (SuperModFileClientFactory)EPackage.Registry.INSTANCE.getEFactory(SuperModFileClientPackage.eNS_URI);
			if (theSuperModFileClientFactory != null) {
				return theSuperModFileClientFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SuperModFileClientFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperModFileClientFactoryImpl() {
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
			case SuperModFileClientPackage.SINGLE_VERSION_FILE_SYSTEM_DESCRIPTOR: return createSingleVersionFileSystemDescriptor();
			case SuperModFileClientPackage.SINGLE_VERSION_FILE_DESCRIPTOR: return createSingleVersionFileDescriptor();
			case SuperModFileClientPackage.SINGLE_VERSION_FOLDER_DESCRIPTOR: return createSingleVersionFolderDescriptor();
			case SuperModFileClientPackage.VERSIONED_FILE_SYSTEM_EXPORT_TRACE: return createVersionedFileSystemExportTrace();
			case SuperModFileClientPackage.PATH_TO_VERSIONED_FILE_MAP_ENTRY: return (EObject)createPathToVersionedFileMapEntry();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleVersionFileSystemDescriptor createSingleVersionFileSystemDescriptor() {
		SingleVersionFileSystemDescriptorImpl singleVersionFileSystemDescriptor = new SingleVersionFileSystemDescriptorImpl();
		return singleVersionFileSystemDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleVersionFileDescriptor createSingleVersionFileDescriptor() {
		SingleVersionFileDescriptorImpl singleVersionFileDescriptor = new SingleVersionFileDescriptorImpl();
		return singleVersionFileDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleVersionFolderDescriptor createSingleVersionFolderDescriptor() {
		SingleVersionFolderDescriptorImpl singleVersionFolderDescriptor = new SingleVersionFolderDescriptorImpl();
		return singleVersionFolderDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionedFileSystemExportTrace createVersionedFileSystemExportTrace() {
		VersionedFileSystemExportTraceImpl versionedFileSystemExportTrace = new VersionedFileSystemExportTraceImpl();
		return versionedFileSystemExportTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, VersionedFileExportTrace> createPathToVersionedFileMapEntry() {
		PathToVersionedFileMapEntryImpl pathToVersionedFileMapEntry = new PathToVersionedFileMapEntryImpl();
		return pathToVersionedFileMapEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperModFileClientPackage getSuperModFileClientPackage() {
		return (SuperModFileClientPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SuperModFileClientPackage getPackage() {
		return SuperModFileClientPackage.eINSTANCE;
	}

} //SuperModFileClientFactoryImpl
