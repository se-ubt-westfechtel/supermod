/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.file.client.util;

import de.ubt.ai1.supermod.mm.client.ProductDimensionExportTrace;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
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
 * @see de.ubt.ai1.supermod.mm.file.client.SuperModFileClientPackage
 * @generated
 */
public class SuperModFileClientSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SuperModFileClientPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperModFileClientSwitch() {
		if (modelPackage == null) {
			modelPackage = SuperModFileClientPackage.eINSTANCE;
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
			case SuperModFileClientPackage.SINGLE_VERSION_FILE_SYSTEM_DESCRIPTOR: {
				SingleVersionFileSystemDescriptor singleVersionFileSystemDescriptor = (SingleVersionFileSystemDescriptor)theEObject;
				T result = caseSingleVersionFileSystemDescriptor(singleVersionFileSystemDescriptor);
				if (result == null) result = caseSingleVersionProductDimensionDescriptor(singleVersionFileSystemDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModFileClientPackage.SINGLE_VERSION_RESOURCE_DESCRIPTOR: {
				SingleVersionResourceDescriptor singleVersionResourceDescriptor = (SingleVersionResourceDescriptor)theEObject;
				T result = caseSingleVersionResourceDescriptor(singleVersionResourceDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModFileClientPackage.SINGLE_VERSION_FILE_DESCRIPTOR: {
				SingleVersionFileDescriptor singleVersionFileDescriptor = (SingleVersionFileDescriptor)theEObject;
				T result = caseSingleVersionFileDescriptor(singleVersionFileDescriptor);
				if (result == null) result = caseSingleVersionResourceDescriptor(singleVersionFileDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModFileClientPackage.SINGLE_VERSION_FOLDER_DESCRIPTOR: {
				SingleVersionFolderDescriptor singleVersionFolderDescriptor = (SingleVersionFolderDescriptor)theEObject;
				T result = caseSingleVersionFolderDescriptor(singleVersionFolderDescriptor);
				if (result == null) result = caseSingleVersionResourceDescriptor(singleVersionFolderDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModFileClientPackage.VERSIONED_FILE_SYSTEM_EXPORT_TRACE: {
				VersionedFileSystemExportTrace versionedFileSystemExportTrace = (VersionedFileSystemExportTrace)theEObject;
				T result = caseVersionedFileSystemExportTrace(versionedFileSystemExportTrace);
				if (result == null) result = caseProductDimensionExportTrace(versionedFileSystemExportTrace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModFileClientPackage.PATH_TO_VERSIONED_FILE_MAP_ENTRY: {
				@SuppressWarnings("unchecked") Map.Entry<String, VersionedFileExportTrace> pathToVersionedFileMapEntry = (Map.Entry<String, VersionedFileExportTrace>)theEObject;
				T result = casePathToVersionedFileMapEntry(pathToVersionedFileMapEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModFileClientPackage.VERSIONED_FILE_EXPORT_TRACE: {
				VersionedFileExportTrace versionedFileExportTrace = (VersionedFileExportTrace)theEObject;
				T result = caseVersionedFileExportTrace(versionedFileExportTrace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Version File System Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Version File System Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleVersionFileSystemDescriptor(SingleVersionFileSystemDescriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Version Resource Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Version Resource Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleVersionResourceDescriptor(SingleVersionResourceDescriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Version File Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Version File Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleVersionFileDescriptor(SingleVersionFileDescriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Version Folder Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Version Folder Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleVersionFolderDescriptor(SingleVersionFolderDescriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Versioned File System Export Trace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Versioned File System Export Trace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVersionedFileSystemExportTrace(VersionedFileSystemExportTrace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path To Versioned File Map Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path To Versioned File Map Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathToVersionedFileMapEntry(Map.Entry<String, VersionedFileExportTrace> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Versioned File Export Trace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Versioned File Export Trace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVersionedFileExportTrace(VersionedFileExportTrace object) {
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

} //SuperModFileClientSwitch
