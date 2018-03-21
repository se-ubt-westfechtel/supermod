/**
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package de.ubt.ai1.supermod.textfile.client;

import de.ubt.ai1.supermod.mm.textfile.TextLine;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Line Export Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.textfile.client.TextLineExportTrace#getLineNr <em>Line Nr</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.textfile.client.TextLineExportTrace#getLine <em>Line</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.textfile.client.SuperModTextfileClientPackage#getTextLineExportTrace()
 * @model
 * @generated
 */
public interface TextLineExportTrace extends EObject {
	/**
	 * Returns the value of the '<em><b>Line Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Nr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Nr</em>' attribute.
	 * @see #setLineNr(int)
	 * @see de.ubt.ai1.supermod.textfile.client.SuperModTextfileClientPackage#getTextLineExportTrace_LineNr()
	 * @model
	 * @generated
	 */
	int getLineNr();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.textfile.client.TextLineExportTrace#getLineNr <em>Line Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Nr</em>' attribute.
	 * @see #getLineNr()
	 * @generated
	 */
	void setLineNr(int value);

	/**
	 * Returns the value of the '<em><b>Line</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line</em>' reference.
	 * @see #setLine(TextLine)
	 * @see de.ubt.ai1.supermod.textfile.client.SuperModTextfileClientPackage#getTextLineExportTrace_Line()
	 * @model
	 * @generated
	 */
	TextLine getLine();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.textfile.client.TextLineExportTrace#getLine <em>Line</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line</em>' reference.
	 * @see #getLine()
	 * @generated
	 */
	void setLine(TextLine value);

} // TextLineExportTrace
