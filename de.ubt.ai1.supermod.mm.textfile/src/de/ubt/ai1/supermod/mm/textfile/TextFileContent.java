/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.textfile;

import org.eclipse.emf.common.util.EList;

import de.ubt.ai1.supermod.mm.file.VersionedFileContent;
import de.ubt.ai1.supermod.mm.list.VersionedList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text File Content</b></em>'.
 * The content of versioned text files consists of a sequence of text lines,
 * whose order is versioned additionally.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.textfile.TextFileContent#getLines <em>Lines</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.textfile.TextFileContent#getLineOrdering <em>Line Ordering</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.textfile.SuperModTextfilePackage#getTextFileContent()
 * @model
 * @generated
 */
public interface TextFileContent extends VersionedFileContent {
	/**
	 * Returns the value of the '<em><b>Lines</b></em>' containment reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.textfile.TextLine}.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.textfile.TextLine#getTextFileContent <em>Text File Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The lines contained within this text file.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lines</em>' containment reference list.
	 * @see de.ubt.ai1.supermod.mm.textfile.SuperModTextfilePackage#getTextFileContent_Lines()
	 * @see de.ubt.ai1.supermod.mm.textfile.TextLine#getTextFileContent
	 * @model opposite="textFileContent" containment="true"
	 * @generated
	 */
	EList<TextLine> getLines();

	/**
	 * Returns the value of the '<em><b>Line Ordering</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The versioned line ordering, which is realized as a versioned list.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Ordering</em>' containment reference.
	 * @see #setLineOrdering(VersionedList)
	 * @see de.ubt.ai1.supermod.mm.textfile.SuperModTextfilePackage#getTextFileContent_LineOrdering()
	 * @model containment="true"
	 * @generated
	 */
	VersionedList getLineOrdering();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.textfile.TextFileContent#getLineOrdering <em>Line Ordering</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Ordering</em>' containment reference.
	 * @see #getLineOrdering()
	 * @generated
	 */
	void setLineOrdering(VersionedList value);

} // TextFileContent
