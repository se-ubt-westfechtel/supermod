/**
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package de.ubt.ai1.supermod.textfile.client;

import de.ubt.ai1.supermod.mm.file.client.VersionedFileExportTrace;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text File Export Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.textfile.client.TextFileExportTrace#getLines <em>Lines</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.textfile.client.SuperModTextfileClientPackage#getTextFileExportTrace()
 * @model
 * @generated
 */
public interface TextFileExportTrace extends VersionedFileExportTrace {
	/**
	 * Returns the value of the '<em><b>Lines</b></em>' containment reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.textfile.client.TextLineExportTrace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lines</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lines</em>' containment reference list.
	 * @see de.ubt.ai1.supermod.textfile.client.SuperModTextfileClientPackage#getTextFileExportTrace_Lines()
	 * @model containment="true"
	 * @generated
	 */
	EList<TextLineExportTrace> getLines();

} // TextFileExportTrace
