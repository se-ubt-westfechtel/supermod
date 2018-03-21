/**
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package de.ubt.ai1.supermod.mm.emffile.client;

import de.ubt.ai1.supermod.mm.emffile.EMFObject;

import de.ubt.ai1.supermod.mm.file.client.VersionedFileExportTrace;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMF File Export Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.emffile.client.EMFFileExportTrace#getEmfObjectToEObjectMap <em>Emf Object To EObject Map</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.emffile.client.SuperModEMFFileClientPackage#getEMFFileExportTrace()
 * @model
 * @generated
 */
public interface EMFFileExportTrace extends VersionedFileExportTrace {
	/**
	 * Returns the value of the '<em><b>Emf Object To EObject Map</b></em>' map.
	 * The key is of type {@link de.ubt.ai1.supermod.mm.emffile.EMFObject},
	 * and the value is of type {@link org.eclipse.emf.ecore.EObject},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emf Object To EObject Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emf Object To EObject Map</em>' map.
	 * @see de.ubt.ai1.supermod.mm.emffile.client.SuperModEMFFileClientPackage#getEMFFileExportTrace_EmfObjectToEObjectMap()
	 * @model mapType="de.ubt.ai1.supermod.mm.emffile.client.EMFObjectToEObjectMapEntry<de.ubt.ai1.supermod.mm.emffile.EMFObject, org.eclipse.emf.ecore.EObject>"
	 * @generated
	 */
	EMap<EMFObject, EObject> getEmfObjectToEObjectMap();

} // EMFFileExportTrace
