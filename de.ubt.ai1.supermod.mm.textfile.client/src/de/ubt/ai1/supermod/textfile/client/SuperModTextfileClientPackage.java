/**
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package de.ubt.ai1.supermod.textfile.client;

import de.ubt.ai1.supermod.mm.file.client.SuperModFileClientPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.ubt.ai1.supermod.textfile.client.SuperModTextfileClientFactory
 * @model kind="package"
 * @generated
 */
public interface SuperModTextfileClientPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "client";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ai1.uni-bayreuth.de/supermod/textfile/client/0.1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.ubt.ai1.supermod.mm.textfile.client";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SuperModTextfileClientPackage eINSTANCE = de.ubt.ai1.supermod.textfile.client.impl.SuperModTextfileClientPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.textfile.client.impl.TextFileExportTraceImpl <em>Text File Export Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.textfile.client.impl.TextFileExportTraceImpl
	 * @see de.ubt.ai1.supermod.textfile.client.impl.SuperModTextfileClientPackageImpl#getTextFileExportTrace()
	 * @generated
	 */
	int TEXT_FILE_EXPORT_TRACE = 0;

	/**
	 * The feature id for the '<em><b>Versioned File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE_EXPORT_TRACE__VERSIONED_FILE = SuperModFileClientPackage.VERSIONED_FILE_EXPORT_TRACE__VERSIONED_FILE;

	/**
	 * The feature id for the '<em><b>Lines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE_EXPORT_TRACE__LINES = SuperModFileClientPackage.VERSIONED_FILE_EXPORT_TRACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text File Export Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE_EXPORT_TRACE_FEATURE_COUNT = SuperModFileClientPackage.VERSIONED_FILE_EXPORT_TRACE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Text File Export Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE_EXPORT_TRACE_OPERATION_COUNT = SuperModFileClientPackage.VERSIONED_FILE_EXPORT_TRACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.textfile.client.impl.TextLineExportTraceImpl <em>Text Line Export Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.textfile.client.impl.TextLineExportTraceImpl
	 * @see de.ubt.ai1.supermod.textfile.client.impl.SuperModTextfileClientPackageImpl#getTextLineExportTrace()
	 * @generated
	 */
	int TEXT_LINE_EXPORT_TRACE = 1;

	/**
	 * The feature id for the '<em><b>Line Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LINE_EXPORT_TRACE__LINE_NR = 0;

	/**
	 * The feature id for the '<em><b>Line</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LINE_EXPORT_TRACE__LINE = 1;

	/**
	 * The number of structural features of the '<em>Text Line Export Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LINE_EXPORT_TRACE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Text Line Export Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LINE_EXPORT_TRACE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.textfile.client.TextFileExportTrace <em>Text File Export Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text File Export Trace</em>'.
	 * @see de.ubt.ai1.supermod.textfile.client.TextFileExportTrace
	 * @generated
	 */
	EClass getTextFileExportTrace();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ubt.ai1.supermod.textfile.client.TextFileExportTrace#getLines <em>Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lines</em>'.
	 * @see de.ubt.ai1.supermod.textfile.client.TextFileExportTrace#getLines()
	 * @see #getTextFileExportTrace()
	 * @generated
	 */
	EReference getTextFileExportTrace_Lines();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.textfile.client.TextLineExportTrace <em>Text Line Export Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Line Export Trace</em>'.
	 * @see de.ubt.ai1.supermod.textfile.client.TextLineExportTrace
	 * @generated
	 */
	EClass getTextLineExportTrace();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai1.supermod.textfile.client.TextLineExportTrace#getLineNr <em>Line Nr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Nr</em>'.
	 * @see de.ubt.ai1.supermod.textfile.client.TextLineExportTrace#getLineNr()
	 * @see #getTextLineExportTrace()
	 * @generated
	 */
	EAttribute getTextLineExportTrace_LineNr();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.textfile.client.TextLineExportTrace#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Line</em>'.
	 * @see de.ubt.ai1.supermod.textfile.client.TextLineExportTrace#getLine()
	 * @see #getTextLineExportTrace()
	 * @generated
	 */
	EReference getTextLineExportTrace_Line();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SuperModTextfileClientFactory getSuperModTextfileClientFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.textfile.client.impl.TextFileExportTraceImpl <em>Text File Export Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.textfile.client.impl.TextFileExportTraceImpl
		 * @see de.ubt.ai1.supermod.textfile.client.impl.SuperModTextfileClientPackageImpl#getTextFileExportTrace()
		 * @generated
		 */
		EClass TEXT_FILE_EXPORT_TRACE = eINSTANCE.getTextFileExportTrace();

		/**
		 * The meta object literal for the '<em><b>Lines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_FILE_EXPORT_TRACE__LINES = eINSTANCE.getTextFileExportTrace_Lines();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.textfile.client.impl.TextLineExportTraceImpl <em>Text Line Export Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.textfile.client.impl.TextLineExportTraceImpl
		 * @see de.ubt.ai1.supermod.textfile.client.impl.SuperModTextfileClientPackageImpl#getTextLineExportTrace()
		 * @generated
		 */
		EClass TEXT_LINE_EXPORT_TRACE = eINSTANCE.getTextLineExportTrace();

		/**
		 * The meta object literal for the '<em><b>Line Nr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_LINE_EXPORT_TRACE__LINE_NR = eINSTANCE.getTextLineExportTrace_LineNr();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_LINE_EXPORT_TRACE__LINE = eINSTANCE.getTextLineExportTrace_Line();

	}

} //SuperModTextfileClientPackage
