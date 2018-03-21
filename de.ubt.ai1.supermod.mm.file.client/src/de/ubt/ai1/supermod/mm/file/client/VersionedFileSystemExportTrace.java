/**
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package de.ubt.ai1.supermod.mm.file.client;

import de.ubt.ai1.supermod.mm.client.ProductDimensionExportTrace;

import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Versioned File System Export Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.file.client.VersionedFileSystemExportTrace#getPathToVersionedFileMap <em>Path To Versioned File Map</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.file.client.SuperModFileClientPackage#getVersionedFileSystemExportTrace()
 * @model
 * @generated
 */
public interface VersionedFileSystemExportTrace extends ProductDimensionExportTrace {
	/**
	 * Returns the value of the '<em><b>Path To Versioned File Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link de.ubt.ai1.supermod.mm.file.client.VersionedFileExportTrace},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path To Versioned File Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path To Versioned File Map</em>' map.
	 * @see de.ubt.ai1.supermod.mm.file.client.SuperModFileClientPackage#getVersionedFileSystemExportTrace_PathToVersionedFileMap()
	 * @model mapType="de.ubt.ai1.supermod.mm.file.client.PathToVersionedFileMapEntry<org.eclipse.emf.ecore.EString, de.ubt.ai1.supermod.mm.file.client.VersionedFileExportTrace>"
	 * @generated
	 */
	EMap<String, VersionedFileExportTrace> getPathToVersionedFileMap();

} // VersionedFileSystemExportTrace
