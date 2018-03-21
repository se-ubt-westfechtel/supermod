/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.textfile;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import de.ubt.ai1.supermod.mm.core.SuperModCorePackage;
import de.ubt.ai1.supermod.mm.file.SuperModFilePackage;
import de.ubt.ai1.supermod.mm.file.VersionedFileContent;

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
 * 
 * The SuperMod text file meta-model contains classes describing the product
 * space fragments representing plain text file content types.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * @see		VersionedFileContent
 * <!-- end-user-doc -->
 * @see de.ubt.ai1.supermod.mm.textfile.SuperModTextfileFactory
 * @model kind="package"
 * @generated
 */
public interface SuperModTextfilePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "textfile";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ai1.uni-bayreuth.de/supermod/textfile/0.1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.ubt.ai1.supermod.mm.textfile";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SuperModTextfilePackage eINSTANCE = de.ubt.ai1.supermod.mm.textfile.impl.SuperModTextfilePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.textfile.impl.TextFileContentImpl <em>Text File Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.textfile.impl.TextFileContentImpl
	 * @see de.ubt.ai1.supermod.mm.textfile.impl.SuperModTextfilePackageImpl#getTextFileContent()
	 * @generated
	 */
	int TEXT_FILE_CONTENT = 0;

	/**
	 * The feature id for the '<em><b>Super Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE_CONTENT__SUPER_ELEMENT = SuperModFilePackage.VERSIONED_FILE_CONTENT__SUPER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE_CONTENT__SUB_ELEMENTS = SuperModFilePackage.VERSIONED_FILE_CONTENT__SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE_CONTENT__ALL_SUPER_ELEMENTS = SuperModFilePackage.VERSIONED_FILE_CONTENT__ALL_SUPER_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE_CONTENT__ALL_SUB_ELEMENTS = SuperModFilePackage.VERSIONED_FILE_CONTENT__ALL_SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE_CONTENT__CROSS_REFERENCED_ELEMENTS = SuperModFilePackage.VERSIONED_FILE_CONTENT__CROSS_REFERENCED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE_CONTENT__CROSS_REFERENCING_ELEMENTS = SuperModFilePackage.VERSIONED_FILE_CONTENT__CROSS_REFERENCING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Proxy UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE_CONTENT__PROXY_UUID = SuperModFilePackage.VERSIONED_FILE_CONTENT__PROXY_UUID;

	/**
	 * The feature id for the '<em><b>Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE_CONTENT__TRANSACTION_ID = SuperModFilePackage.VERSIONED_FILE_CONTENT__TRANSACTION_ID;

	/**
	 * The feature id for the '<em><b>Product Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE_CONTENT__PRODUCT_DIMENSION = SuperModFilePackage.VERSIONED_FILE_CONTENT__PRODUCT_DIMENSION;

	/**
	 * The feature id for the '<em><b>Product Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE_CONTENT__PRODUCT_SPACE = SuperModFilePackage.VERSIONED_FILE_CONTENT__PRODUCT_SPACE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE_CONTENT__VISIBILITY = SuperModFilePackage.VERSIONED_FILE_CONTENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Super Product Space Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE_CONTENT__SUPER_PRODUCT_SPACE_ELEMENT = SuperModFilePackage.VERSIONED_FILE_CONTENT__SUPER_PRODUCT_SPACE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE_CONTENT__SUB_PRODUCT_SPACE_ELEMENTS = SuperModFilePackage.VERSIONED_FILE_CONTENT__SUB_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE_CONTENT__ALL_SUPER_PRODUCT_SPACE_ELEMENTS = SuperModFilePackage.VERSIONED_FILE_CONTENT__ALL_SUPER_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE_CONTENT__ALL_SUB_PRODUCT_SPACE_ELEMENTS = SuperModFilePackage.VERSIONED_FILE_CONTENT__ALL_SUB_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE_CONTENT__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS = SuperModFilePackage.VERSIONED_FILE_CONTENT__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE_CONTENT__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS = SuperModFilePackage.VERSIONED_FILE_CONTENT__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Hierarchical Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE_CONTENT__HIERARCHICAL_VISIBILITY = SuperModFilePackage.VERSIONED_FILE_CONTENT__HIERARCHICAL_VISIBILITY;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE_CONTENT__FILE = SuperModFilePackage.VERSIONED_FILE_CONTENT__FILE;

	/**
	 * The feature id for the '<em><b>Super Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE_CONTENT__SUPER_EXTENSION = SuperModFilePackage.VERSIONED_FILE_CONTENT__SUPER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Lines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE_CONTENT__LINES = SuperModFilePackage.VERSIONED_FILE_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Line Ordering</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE_CONTENT__LINE_ORDERING = SuperModFilePackage.VERSIONED_FILE_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Text File Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE_CONTENT_FEATURE_COUNT = SuperModFilePackage.VERSIONED_FILE_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE_CONTENT___IS_PROXY = SuperModFilePackage.VERSIONED_FILE_CONTENT___IS_PROXY;

	/**
	 * The operation id for the '<em>Is Visible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE_CONTENT___IS_VISIBLE__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = SuperModFilePackage.VERSIONED_FILE_CONTENT___IS_VISIBLE__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The operation id for the '<em>Is Visible Hierarchically</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE_CONTENT___IS_VISIBLE_HIERARCHICALLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = SuperModFilePackage.VERSIONED_FILE_CONTENT___IS_VISIBLE_HIERARCHICALLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The number of operations of the '<em>Text File Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE_CONTENT_OPERATION_COUNT = SuperModFilePackage.VERSIONED_FILE_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.textfile.impl.TextLineImpl <em>Text Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.textfile.impl.TextLineImpl
	 * @see de.ubt.ai1.supermod.mm.textfile.impl.SuperModTextfilePackageImpl#getTextLine()
	 * @generated
	 */
	int TEXT_LINE = 1;

	/**
	 * The feature id for the '<em><b>Super Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LINE__SUPER_ELEMENT = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__SUPER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LINE__SUB_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LINE__ALL_SUPER_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__ALL_SUPER_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LINE__ALL_SUB_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__ALL_SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LINE__CROSS_REFERENCED_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__CROSS_REFERENCED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LINE__CROSS_REFERENCING_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__CROSS_REFERENCING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Proxy UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LINE__PROXY_UUID = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__PROXY_UUID;

	/**
	 * The feature id for the '<em><b>Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LINE__TRANSACTION_ID = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__TRANSACTION_ID;

	/**
	 * The feature id for the '<em><b>Product Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LINE__PRODUCT_DIMENSION = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__PRODUCT_DIMENSION;

	/**
	 * The feature id for the '<em><b>Product Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LINE__PRODUCT_SPACE = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__PRODUCT_SPACE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LINE__VISIBILITY = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Super Product Space Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LINE__SUPER_PRODUCT_SPACE_ELEMENT = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__SUPER_PRODUCT_SPACE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LINE__SUB_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__SUB_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LINE__ALL_SUPER_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__ALL_SUPER_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LINE__ALL_SUB_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__ALL_SUB_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LINE__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LINE__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Hierarchical Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LINE__HIERARCHICAL_VISIBILITY = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__HIERARCHICAL_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LINE__TEXT = SuperModCorePackage.PRODUCT_SPACE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text File Content</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LINE__TEXT_FILE_CONTENT = SuperModCorePackage.PRODUCT_SPACE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Text Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LINE_FEATURE_COUNT = SuperModCorePackage.PRODUCT_SPACE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LINE___IS_PROXY = SuperModCorePackage.PRODUCT_SPACE_ELEMENT___IS_PROXY;

	/**
	 * The operation id for the '<em>Is Visible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LINE___IS_VISIBLE__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = SuperModCorePackage.PRODUCT_SPACE_ELEMENT___IS_VISIBLE__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The operation id for the '<em>Is Visible Hierarchically</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LINE___IS_VISIBLE_HIERARCHICALLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = SuperModCorePackage.PRODUCT_SPACE_ELEMENT___IS_VISIBLE_HIERARCHICALLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The number of operations of the '<em>Text Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LINE_OPERATION_COUNT = SuperModCorePackage.PRODUCT_SPACE_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.textfile.TextFileContent <em>Text File Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text File Content</em>'.
	 * @see de.ubt.ai1.supermod.mm.textfile.TextFileContent
	 * @generated
	 */
	EClass getTextFileContent();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ubt.ai1.supermod.mm.textfile.TextFileContent#getLines <em>Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lines</em>'.
	 * @see de.ubt.ai1.supermod.mm.textfile.TextFileContent#getLines()
	 * @see #getTextFileContent()
	 * @generated
	 */
	EReference getTextFileContent_Lines();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai1.supermod.mm.textfile.TextFileContent#getLineOrdering <em>Line Ordering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Line Ordering</em>'.
	 * @see de.ubt.ai1.supermod.mm.textfile.TextFileContent#getLineOrdering()
	 * @see #getTextFileContent()
	 * @generated
	 */
	EReference getTextFileContent_LineOrdering();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.textfile.TextLine <em>Text Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Line</em>'.
	 * @see de.ubt.ai1.supermod.mm.textfile.TextLine
	 * @generated
	 */
	EClass getTextLine();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai1.supermod.mm.textfile.TextLine#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see de.ubt.ai1.supermod.mm.textfile.TextLine#getText()
	 * @see #getTextLine()
	 * @generated
	 */
	EAttribute getTextLine_Text();

	/**
	 * Returns the meta object for the container reference '{@link de.ubt.ai1.supermod.mm.textfile.TextLine#getTextFileContent <em>Text File Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Text File Content</em>'.
	 * @see de.ubt.ai1.supermod.mm.textfile.TextLine#getTextFileContent()
	 * @see #getTextLine()
	 * @generated
	 */
	EReference getTextLine_TextFileContent();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SuperModTextfileFactory getSuperModTextfileFactory();

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
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.textfile.impl.TextFileContentImpl <em>Text File Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.textfile.impl.TextFileContentImpl
		 * @see de.ubt.ai1.supermod.mm.textfile.impl.SuperModTextfilePackageImpl#getTextFileContent()
		 * @generated
		 */
		EClass TEXT_FILE_CONTENT = eINSTANCE.getTextFileContent();

		/**
		 * The meta object literal for the '<em><b>Lines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_FILE_CONTENT__LINES = eINSTANCE.getTextFileContent_Lines();

		/**
		 * The meta object literal for the '<em><b>Line Ordering</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_FILE_CONTENT__LINE_ORDERING = eINSTANCE.getTextFileContent_LineOrdering();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.textfile.impl.TextLineImpl <em>Text Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.textfile.impl.TextLineImpl
		 * @see de.ubt.ai1.supermod.mm.textfile.impl.SuperModTextfilePackageImpl#getTextLine()
		 * @generated
		 */
		EClass TEXT_LINE = eINSTANCE.getTextLine();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_LINE__TEXT = eINSTANCE.getTextLine_Text();

		/**
		 * The meta object literal for the '<em><b>Text File Content</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_LINE__TEXT_FILE_CONTENT = eINSTANCE.getTextLine_TextFileContent();

	}

} //SuperModTextfilePackage
