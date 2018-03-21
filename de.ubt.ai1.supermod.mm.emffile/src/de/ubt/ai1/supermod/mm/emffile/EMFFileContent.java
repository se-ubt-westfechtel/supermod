/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.emffile;

import org.eclipse.emf.common.util.EList;

import de.ubt.ai1.supermod.mm.file.VersionedFileContent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMF File Content</b></em>'.
 * Versioned file content specific to EMF models within a versioned file system.
 * A versioned EMF model contains a set of objects, which are directly contained
 * regardless of whether they are specified as containment references in the
 * corresponding meta-model.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * @link	EMFObject
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.emffile.EMFFileContent#getObjects <em>Objects</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.emffile.EMFFileContent#getRoots <em>Roots</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.emffile.SuperModEMFFilePackage#getEMFFileContent()
 * @model
 * @generated
 */
public interface EMFFileContent extends VersionedFileContent {
	/**
	 * Returns the value of the '<em><b>Objects</b></em>' containment reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.emffile.EMFObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Direct containment link to all objects within the versioned EMF resource.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objects</em>' containment reference list.
	 * @see de.ubt.ai1.supermod.mm.emffile.SuperModEMFFilePackage#getEMFFileContent_Objects()
	 * @model containment="true"
	 * @generated
	 */
	EList<EMFObject> getObjects();

	/**
	 * Returns the value of the '<em><b>Roots</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.emffile.EMFObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * All objects that have no incoming containment reference. They are considered
	 * as the root objects of the (flattened) EMF containment tree.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roots</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.emffile.SuperModEMFFilePackage#getEMFFileContent_Roots()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<EMFObject> getRoots();

} // EMFFileContent
