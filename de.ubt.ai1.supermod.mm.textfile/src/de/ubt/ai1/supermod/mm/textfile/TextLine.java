/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.textfile;

import de.ubt.ai1.supermod.mm.core.ProductSpaceElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Line</b></em>'.
 * A text line inside a versioned text file consists of a string containing the
 * line's text.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * @see		TextFileContent
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.textfile.TextLine#getText <em>Text</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.textfile.TextLine#getTextFileContent <em>Text File Content</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.textfile.SuperModTextfilePackage#getTextLine()
 * @model
 * @generated
 */
public interface TextLine extends ProductSpaceElement {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The text of the text line. Only one line with the same text may appear
	 * inside a versioned text file. Multiple appearances are represented by
	 * multiple vertices within the text line ordering of the text file.
	 * @see TextFileContent#getLineOrdering()
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see de.ubt.ai1.supermod.mm.textfile.SuperModTextfilePackage#getTextLine_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.textfile.TextLine#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Text File Content</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.textfile.TextFileContent#getLines <em>Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text File Content</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text File Content</em>' container reference.
	 * @see #setTextFileContent(TextFileContent)
	 * @see de.ubt.ai1.supermod.mm.textfile.SuperModTextfilePackage#getTextLine_TextFileContent()
	 * @see de.ubt.ai1.supermod.mm.textfile.TextFileContent#getLines
	 * @model opposite="lines" transient="false"
	 * @generated
	 */
	TextFileContent getTextFileContent();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.textfile.TextLine#getTextFileContent <em>Text File Content</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text File Content</em>' container reference.
	 * @see #getTextFileContent()
	 * @generated
	 */
	void setTextFileContent(TextFileContent value);

} // TextLine
