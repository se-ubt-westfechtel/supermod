/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.client;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import de.ubt.ai1.supermod.mm.core.SuperModCorePackage;

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
 * The SuperMod client meta-model contains meta-classes for the representation of
 * clients of a repository (local repositories).
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-25
 * <!-- end-user-doc -->
 * @see de.ubt.ai1.supermod.mm.client.SuperModClientFactory
 * @model kind="package"
 * @generated
 */
public interface SuperModClientPackage extends EPackage {
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
	String eNS_URI = "http://ai1.uni-bayreuth.de/supermod/client/0.1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.ubt.ai1.supermod.mm.client";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SuperModClientPackage eINSTANCE = de.ubt.ai1.supermod.mm.client.impl.SuperModClientPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.client.impl.SingleVersionProductSpaceDescriptorImpl <em>Single Version Product Space Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.client.impl.SingleVersionProductSpaceDescriptorImpl
	 * @see de.ubt.ai1.supermod.mm.client.impl.SuperModClientPackageImpl#getSingleVersionProductSpaceDescriptor()
	 * @generated
	 */
	int SINGLE_VERSION_PRODUCT_SPACE_DESCRIPTOR = 0;

	/**
	 * The feature id for the '<em><b>Dimension Descriptors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VERSION_PRODUCT_SPACE_DESCRIPTOR__DIMENSION_DESCRIPTORS = 0;

	/**
	 * The number of structural features of the '<em>Single Version Product Space Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VERSION_PRODUCT_SPACE_DESCRIPTOR_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Is Modified</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VERSION_PRODUCT_SPACE_DESCRIPTOR___IS_MODIFIED = 0;

	/**
	 * The operation id for the '<em>Set Modified</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VERSION_PRODUCT_SPACE_DESCRIPTOR___SET_MODIFIED__BOOLEAN = 1;

	/**
	 * The number of operations of the '<em>Single Version Product Space Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VERSION_PRODUCT_SPACE_DESCRIPTOR_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.client.impl.SingleVersionProductDimensionDescriptorImpl <em>Single Version Product Dimension Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.client.impl.SingleVersionProductDimensionDescriptorImpl
	 * @see de.ubt.ai1.supermod.mm.client.impl.SuperModClientPackageImpl#getSingleVersionProductDimensionDescriptor()
	 * @generated
	 */
	int SINGLE_VERSION_PRODUCT_DIMENSION_DESCRIPTOR = 1;

	/**
	 * The feature id for the '<em><b>Dimension Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VERSION_PRODUCT_DIMENSION_DESCRIPTOR__DIMENSION_NAME = 0;

	/**
	 * The number of structural features of the '<em>Single Version Product Dimension Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VERSION_PRODUCT_DIMENSION_DESCRIPTOR_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Is Modified</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VERSION_PRODUCT_DIMENSION_DESCRIPTOR___IS_MODIFIED = 0;

	/**
	 * The operation id for the '<em>Set Modified</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VERSION_PRODUCT_DIMENSION_DESCRIPTOR___SET_MODIFIED__BOOLEAN = 1;

	/**
	 * The number of operations of the '<em>Single Version Product Dimension Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VERSION_PRODUCT_DIMENSION_DESCRIPTOR_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.client.impl.LocalRepositoryImpl <em>Local Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.client.impl.LocalRepositoryImpl
	 * @see de.ubt.ai1.supermod.mm.client.impl.SuperModClientPackageImpl#getLocalRepository()
	 * @generated
	 */
	int LOCAL_REPOSITORY = 2;

	/**
	 * The feature id for the '<em><b>Product Space</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_REPOSITORY__PRODUCT_SPACE = SuperModCorePackage.REPOSITORY__PRODUCT_SPACE;

	/**
	 * The feature id for the '<em><b>Version Space</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_REPOSITORY__VERSION_SPACE = SuperModCorePackage.REPOSITORY__VERSION_SPACE;

	/**
	 * The feature id for the '<em><b>Visibility Forest</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_REPOSITORY__VISIBILITY_FOREST = SuperModCorePackage.REPOSITORY__VISIBILITY_FOREST;

	/**
	 * The feature id for the '<em><b>Module Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_REPOSITORY__MODULE_ID = SuperModCorePackage.REPOSITORY__MODULE_ID;

	/**
	 * The feature id for the '<em><b>Local Descriptor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_REPOSITORY__LOCAL_DESCRIPTOR = SuperModCorePackage.REPOSITORY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Local Choice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_REPOSITORY__LOCAL_CHOICE = SuperModCorePackage.REPOSITORY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Local Ambition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_REPOSITORY__LOCAL_AMBITION = SuperModCorePackage.REPOSITORY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Remote Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_REPOSITORY__REMOTE_URI = SuperModCorePackage.REPOSITORY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Remote User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_REPOSITORY__REMOTE_USER = SuperModCorePackage.REPOSITORY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Locally Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_REPOSITORY__LOCALLY_MODIFIED = SuperModCorePackage.REPOSITORY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Read Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_REPOSITORY__READ_TRANSACTION_ID = SuperModCorePackage.REPOSITORY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Write Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_REPOSITORY__WRITE_TRANSACTION_ID = SuperModCorePackage.REPOSITORY_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Local Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_REPOSITORY_FEATURE_COUNT = SuperModCorePackage.REPOSITORY_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Local Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_REPOSITORY_OPERATION_COUNT = SuperModCorePackage.REPOSITORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.client.impl.ProductSpaceExportTraceImpl <em>Product Space Export Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.client.impl.ProductSpaceExportTraceImpl
	 * @see de.ubt.ai1.supermod.mm.client.impl.SuperModClientPackageImpl#getProductSpaceExportTrace()
	 * @generated
	 */
	int PRODUCT_SPACE_EXPORT_TRACE = 3;

	/**
	 * The feature id for the '<em><b>Product Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPACE_EXPORT_TRACE__PRODUCT_SPACE = 0;

	/**
	 * The feature id for the '<em><b>Dimension Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPACE_EXPORT_TRACE__DIMENSION_TRACES = 1;

	/**
	 * The number of structural features of the '<em>Product Space Export Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPACE_EXPORT_TRACE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Get Trace For Dimension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPACE_EXPORT_TRACE___GET_TRACE_FOR_DIMENSION__PRODUCTDIMENSION = 0;

	/**
	 * The number of operations of the '<em>Product Space Export Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPACE_EXPORT_TRACE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.client.impl.ProductDimensionExportTraceImpl <em>Product Dimension Export Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.client.impl.ProductDimensionExportTraceImpl
	 * @see de.ubt.ai1.supermod.mm.client.impl.SuperModClientPackageImpl#getProductDimensionExportTrace()
	 * @generated
	 */
	int PRODUCT_DIMENSION_EXPORT_TRACE = 4;

	/**
	 * The feature id for the '<em><b>Product Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_DIMENSION_EXPORT_TRACE__PRODUCT_DIMENSION = 0;

	/**
	 * The number of structural features of the '<em>Product Dimension Export Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_DIMENSION_EXPORT_TRACE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Product Dimension Export Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_DIMENSION_EXPORT_TRACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.client.impl.ConflictSetImpl <em>Conflict Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.client.impl.ConflictSetImpl
	 * @see de.ubt.ai1.supermod.mm.client.impl.SuperModClientPackageImpl#getConflictSet()
	 * @generated
	 */
	int CONFLICT_SET = 5;

	/**
	 * The feature id for the '<em><b>Conflicts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_SET__CONFLICTS = 0;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_SET__SEVERITY = 1;

	/**
	 * The number of structural features of the '<em>Conflict Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_SET_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Conflict Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.client.impl.ProductConflictImpl <em>Product Conflict</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.client.impl.ProductConflictImpl
	 * @see de.ubt.ai1.supermod.mm.client.impl.SuperModClientPackageImpl#getProductConflict()
	 * @generated
	 */
	int PRODUCT_CONFLICT = 6;

	/**
	 * The feature id for the '<em><b>Affected Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFLICT__AFFECTED_PRODUCT_SPACE_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFLICT__SEVERITY = 1;

	/**
	 * The number of structural features of the '<em>Product Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFLICT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Product Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFLICT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.client.Severity <em>Severity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.client.Severity
	 * @see de.ubt.ai1.supermod.mm.client.impl.SuperModClientPackageImpl#getSeverity()
	 * @generated
	 */
	int SEVERITY = 7;


	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.client.SingleVersionProductSpaceDescriptor <em>Single Version Product Space Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Version Product Space Descriptor</em>'.
	 * @see de.ubt.ai1.supermod.mm.client.SingleVersionProductSpaceDescriptor
	 * @generated
	 */
	EClass getSingleVersionProductSpaceDescriptor();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.client.SingleVersionProductSpaceDescriptor#getDimensionDescriptors <em>Dimension Descriptors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dimension Descriptors</em>'.
	 * @see de.ubt.ai1.supermod.mm.client.SingleVersionProductSpaceDescriptor#getDimensionDescriptors()
	 * @see #getSingleVersionProductSpaceDescriptor()
	 * @generated
	 */
	EReference getSingleVersionProductSpaceDescriptor_DimensionDescriptors();

	/**
	 * Returns the meta object for the '{@link de.ubt.ai1.supermod.mm.client.SingleVersionProductSpaceDescriptor#isModified() <em>Is Modified</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Modified</em>' operation.
	 * @see de.ubt.ai1.supermod.mm.client.SingleVersionProductSpaceDescriptor#isModified()
	 * @generated
	 */
	EOperation getSingleVersionProductSpaceDescriptor__IsModified();

	/**
	 * Returns the meta object for the '{@link de.ubt.ai1.supermod.mm.client.SingleVersionProductSpaceDescriptor#setModified(boolean) <em>Set Modified</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Modified</em>' operation.
	 * @see de.ubt.ai1.supermod.mm.client.SingleVersionProductSpaceDescriptor#setModified(boolean)
	 * @generated
	 */
	EOperation getSingleVersionProductSpaceDescriptor__SetModified__boolean();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.client.SingleVersionProductDimensionDescriptor <em>Single Version Product Dimension Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Version Product Dimension Descriptor</em>'.
	 * @see de.ubt.ai1.supermod.mm.client.SingleVersionProductDimensionDescriptor
	 * @generated
	 */
	EClass getSingleVersionProductDimensionDescriptor();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai1.supermod.mm.client.SingleVersionProductDimensionDescriptor#getDimensionName <em>Dimension Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dimension Name</em>'.
	 * @see de.ubt.ai1.supermod.mm.client.SingleVersionProductDimensionDescriptor#getDimensionName()
	 * @see #getSingleVersionProductDimensionDescriptor()
	 * @generated
	 */
	EAttribute getSingleVersionProductDimensionDescriptor_DimensionName();

	/**
	 * Returns the meta object for the '{@link de.ubt.ai1.supermod.mm.client.SingleVersionProductDimensionDescriptor#isModified() <em>Is Modified</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Modified</em>' operation.
	 * @see de.ubt.ai1.supermod.mm.client.SingleVersionProductDimensionDescriptor#isModified()
	 * @generated
	 */
	EOperation getSingleVersionProductDimensionDescriptor__IsModified();

	/**
	 * Returns the meta object for the '{@link de.ubt.ai1.supermod.mm.client.SingleVersionProductDimensionDescriptor#setModified(boolean) <em>Set Modified</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Modified</em>' operation.
	 * @see de.ubt.ai1.supermod.mm.client.SingleVersionProductDimensionDescriptor#setModified(boolean)
	 * @generated
	 */
	EOperation getSingleVersionProductDimensionDescriptor__SetModified__boolean();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.client.LocalRepository <em>Local Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Repository</em>'.
	 * @see de.ubt.ai1.supermod.mm.client.LocalRepository
	 * @generated
	 */
	EClass getLocalRepository();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai1.supermod.mm.client.LocalRepository#getLocalDescriptor <em>Local Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local Descriptor</em>'.
	 * @see de.ubt.ai1.supermod.mm.client.LocalRepository#getLocalDescriptor()
	 * @see #getLocalRepository()
	 * @generated
	 */
	EReference getLocalRepository_LocalDescriptor();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.client.LocalRepository#getLocalChoice <em>Local Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Local Choice</em>'.
	 * @see de.ubt.ai1.supermod.mm.client.LocalRepository#getLocalChoice()
	 * @see #getLocalRepository()
	 * @generated
	 */
	EReference getLocalRepository_LocalChoice();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.client.LocalRepository#getLocalAmbition <em>Local Ambition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Local Ambition</em>'.
	 * @see de.ubt.ai1.supermod.mm.client.LocalRepository#getLocalAmbition()
	 * @see #getLocalRepository()
	 * @generated
	 */
	EReference getLocalRepository_LocalAmbition();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai1.supermod.mm.client.LocalRepository#getRemoteUri <em>Remote Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remote Uri</em>'.
	 * @see de.ubt.ai1.supermod.mm.client.LocalRepository#getRemoteUri()
	 * @see #getLocalRepository()
	 * @generated
	 */
	EAttribute getLocalRepository_RemoteUri();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai1.supermod.mm.client.LocalRepository#getRemoteUser <em>Remote User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remote User</em>'.
	 * @see de.ubt.ai1.supermod.mm.client.LocalRepository#getRemoteUser()
	 * @see #getLocalRepository()
	 * @generated
	 */
	EAttribute getLocalRepository_RemoteUser();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai1.supermod.mm.client.LocalRepository#isLocallyModified <em>Locally Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Locally Modified</em>'.
	 * @see de.ubt.ai1.supermod.mm.client.LocalRepository#isLocallyModified()
	 * @see #getLocalRepository()
	 * @generated
	 */
	EAttribute getLocalRepository_LocallyModified();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai1.supermod.mm.client.LocalRepository#getReadTransactionId <em>Read Transaction Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Transaction Id</em>'.
	 * @see de.ubt.ai1.supermod.mm.client.LocalRepository#getReadTransactionId()
	 * @see #getLocalRepository()
	 * @generated
	 */
	EAttribute getLocalRepository_ReadTransactionId();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai1.supermod.mm.client.LocalRepository#getWriteTransactionId <em>Write Transaction Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Write Transaction Id</em>'.
	 * @see de.ubt.ai1.supermod.mm.client.LocalRepository#getWriteTransactionId()
	 * @see #getLocalRepository()
	 * @generated
	 */
	EAttribute getLocalRepository_WriteTransactionId();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.client.ProductSpaceExportTrace <em>Product Space Export Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Space Export Trace</em>'.
	 * @see de.ubt.ai1.supermod.mm.client.ProductSpaceExportTrace
	 * @generated
	 */
	EClass getProductSpaceExportTrace();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.client.ProductSpaceExportTrace#getProductSpace <em>Product Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Space</em>'.
	 * @see de.ubt.ai1.supermod.mm.client.ProductSpaceExportTrace#getProductSpace()
	 * @see #getProductSpaceExportTrace()
	 * @generated
	 */
	EReference getProductSpaceExportTrace_ProductSpace();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ubt.ai1.supermod.mm.client.ProductSpaceExportTrace#getDimensionTraces <em>Dimension Traces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dimension Traces</em>'.
	 * @see de.ubt.ai1.supermod.mm.client.ProductSpaceExportTrace#getDimensionTraces()
	 * @see #getProductSpaceExportTrace()
	 * @generated
	 */
	EReference getProductSpaceExportTrace_DimensionTraces();

	/**
	 * Returns the meta object for the '{@link de.ubt.ai1.supermod.mm.client.ProductSpaceExportTrace#getTraceForDimension(de.ubt.ai1.supermod.mm.core.ProductDimension) <em>Get Trace For Dimension</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Trace For Dimension</em>' operation.
	 * @see de.ubt.ai1.supermod.mm.client.ProductSpaceExportTrace#getTraceForDimension(de.ubt.ai1.supermod.mm.core.ProductDimension)
	 * @generated
	 */
	EOperation getProductSpaceExportTrace__GetTraceForDimension__ProductDimension();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.client.ProductDimensionExportTrace <em>Product Dimension Export Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Dimension Export Trace</em>'.
	 * @see de.ubt.ai1.supermod.mm.client.ProductDimensionExportTrace
	 * @generated
	 */
	EClass getProductDimensionExportTrace();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.client.ProductDimensionExportTrace#getProductDimension <em>Product Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Dimension</em>'.
	 * @see de.ubt.ai1.supermod.mm.client.ProductDimensionExportTrace#getProductDimension()
	 * @see #getProductDimensionExportTrace()
	 * @generated
	 */
	EReference getProductDimensionExportTrace_ProductDimension();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.client.ConflictSet <em>Conflict Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conflict Set</em>'.
	 * @see de.ubt.ai1.supermod.mm.client.ConflictSet
	 * @generated
	 */
	EClass getConflictSet();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ubt.ai1.supermod.mm.client.ConflictSet#getConflicts <em>Conflicts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conflicts</em>'.
	 * @see de.ubt.ai1.supermod.mm.client.ConflictSet#getConflicts()
	 * @see #getConflictSet()
	 * @generated
	 */
	EReference getConflictSet_Conflicts();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai1.supermod.mm.client.ConflictSet#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see de.ubt.ai1.supermod.mm.client.ConflictSet#getSeverity()
	 * @see #getConflictSet()
	 * @generated
	 */
	EAttribute getConflictSet_Severity();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.client.ProductConflict <em>Product Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Conflict</em>'.
	 * @see de.ubt.ai1.supermod.mm.client.ProductConflict
	 * @generated
	 */
	EClass getProductConflict();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.client.ProductConflict#getAffectedProductSpaceElements <em>Affected Product Space Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Affected Product Space Elements</em>'.
	 * @see de.ubt.ai1.supermod.mm.client.ProductConflict#getAffectedProductSpaceElements()
	 * @see #getProductConflict()
	 * @generated
	 */
	EReference getProductConflict_AffectedProductSpaceElements();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai1.supermod.mm.client.ProductConflict#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see de.ubt.ai1.supermod.mm.client.ProductConflict#getSeverity()
	 * @see #getProductConflict()
	 * @generated
	 */
	EAttribute getProductConflict_Severity();

	/**
	 * Returns the meta object for enum '{@link de.ubt.ai1.supermod.mm.client.Severity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Severity</em>'.
	 * @see de.ubt.ai1.supermod.mm.client.Severity
	 * @generated
	 */
	EEnum getSeverity();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SuperModClientFactory getSuperModClientFactory();

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
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.client.impl.SingleVersionProductSpaceDescriptorImpl <em>Single Version Product Space Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.client.impl.SingleVersionProductSpaceDescriptorImpl
		 * @see de.ubt.ai1.supermod.mm.client.impl.SuperModClientPackageImpl#getSingleVersionProductSpaceDescriptor()
		 * @generated
		 */
		EClass SINGLE_VERSION_PRODUCT_SPACE_DESCRIPTOR = eINSTANCE.getSingleVersionProductSpaceDescriptor();

		/**
		 * The meta object literal for the '<em><b>Dimension Descriptors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_VERSION_PRODUCT_SPACE_DESCRIPTOR__DIMENSION_DESCRIPTORS = eINSTANCE.getSingleVersionProductSpaceDescriptor_DimensionDescriptors();

		/**
		 * The meta object literal for the '<em><b>Is Modified</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SINGLE_VERSION_PRODUCT_SPACE_DESCRIPTOR___IS_MODIFIED = eINSTANCE.getSingleVersionProductSpaceDescriptor__IsModified();

		/**
		 * The meta object literal for the '<em><b>Set Modified</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SINGLE_VERSION_PRODUCT_SPACE_DESCRIPTOR___SET_MODIFIED__BOOLEAN = eINSTANCE.getSingleVersionProductSpaceDescriptor__SetModified__boolean();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.client.impl.SingleVersionProductDimensionDescriptorImpl <em>Single Version Product Dimension Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.client.impl.SingleVersionProductDimensionDescriptorImpl
		 * @see de.ubt.ai1.supermod.mm.client.impl.SuperModClientPackageImpl#getSingleVersionProductDimensionDescriptor()
		 * @generated
		 */
		EClass SINGLE_VERSION_PRODUCT_DIMENSION_DESCRIPTOR = eINSTANCE.getSingleVersionProductDimensionDescriptor();

		/**
		 * The meta object literal for the '<em><b>Dimension Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_VERSION_PRODUCT_DIMENSION_DESCRIPTOR__DIMENSION_NAME = eINSTANCE.getSingleVersionProductDimensionDescriptor_DimensionName();

		/**
		 * The meta object literal for the '<em><b>Is Modified</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SINGLE_VERSION_PRODUCT_DIMENSION_DESCRIPTOR___IS_MODIFIED = eINSTANCE.getSingleVersionProductDimensionDescriptor__IsModified();

		/**
		 * The meta object literal for the '<em><b>Set Modified</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SINGLE_VERSION_PRODUCT_DIMENSION_DESCRIPTOR___SET_MODIFIED__BOOLEAN = eINSTANCE.getSingleVersionProductDimensionDescriptor__SetModified__boolean();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.client.impl.LocalRepositoryImpl <em>Local Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.client.impl.LocalRepositoryImpl
		 * @see de.ubt.ai1.supermod.mm.client.impl.SuperModClientPackageImpl#getLocalRepository()
		 * @generated
		 */
		EClass LOCAL_REPOSITORY = eINSTANCE.getLocalRepository();

		/**
		 * The meta object literal for the '<em><b>Local Descriptor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_REPOSITORY__LOCAL_DESCRIPTOR = eINSTANCE.getLocalRepository_LocalDescriptor();

		/**
		 * The meta object literal for the '<em><b>Local Choice</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_REPOSITORY__LOCAL_CHOICE = eINSTANCE.getLocalRepository_LocalChoice();

		/**
		 * The meta object literal for the '<em><b>Local Ambition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_REPOSITORY__LOCAL_AMBITION = eINSTANCE.getLocalRepository_LocalAmbition();

		/**
		 * The meta object literal for the '<em><b>Remote Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_REPOSITORY__REMOTE_URI = eINSTANCE.getLocalRepository_RemoteUri();

		/**
		 * The meta object literal for the '<em><b>Remote User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_REPOSITORY__REMOTE_USER = eINSTANCE.getLocalRepository_RemoteUser();

		/**
		 * The meta object literal for the '<em><b>Locally Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_REPOSITORY__LOCALLY_MODIFIED = eINSTANCE.getLocalRepository_LocallyModified();

		/**
		 * The meta object literal for the '<em><b>Read Transaction Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_REPOSITORY__READ_TRANSACTION_ID = eINSTANCE.getLocalRepository_ReadTransactionId();

		/**
		 * The meta object literal for the '<em><b>Write Transaction Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_REPOSITORY__WRITE_TRANSACTION_ID = eINSTANCE.getLocalRepository_WriteTransactionId();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.client.impl.ProductSpaceExportTraceImpl <em>Product Space Export Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.client.impl.ProductSpaceExportTraceImpl
		 * @see de.ubt.ai1.supermod.mm.client.impl.SuperModClientPackageImpl#getProductSpaceExportTrace()
		 * @generated
		 */
		EClass PRODUCT_SPACE_EXPORT_TRACE = eINSTANCE.getProductSpaceExportTrace();

		/**
		 * The meta object literal for the '<em><b>Product Space</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_SPACE_EXPORT_TRACE__PRODUCT_SPACE = eINSTANCE.getProductSpaceExportTrace_ProductSpace();

		/**
		 * The meta object literal for the '<em><b>Dimension Traces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_SPACE_EXPORT_TRACE__DIMENSION_TRACES = eINSTANCE.getProductSpaceExportTrace_DimensionTraces();

		/**
		 * The meta object literal for the '<em><b>Get Trace For Dimension</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRODUCT_SPACE_EXPORT_TRACE___GET_TRACE_FOR_DIMENSION__PRODUCTDIMENSION = eINSTANCE.getProductSpaceExportTrace__GetTraceForDimension__ProductDimension();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.client.impl.ProductDimensionExportTraceImpl <em>Product Dimension Export Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.client.impl.ProductDimensionExportTraceImpl
		 * @see de.ubt.ai1.supermod.mm.client.impl.SuperModClientPackageImpl#getProductDimensionExportTrace()
		 * @generated
		 */
		EClass PRODUCT_DIMENSION_EXPORT_TRACE = eINSTANCE.getProductDimensionExportTrace();

		/**
		 * The meta object literal for the '<em><b>Product Dimension</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_DIMENSION_EXPORT_TRACE__PRODUCT_DIMENSION = eINSTANCE.getProductDimensionExportTrace_ProductDimension();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.client.impl.ConflictSetImpl <em>Conflict Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.client.impl.ConflictSetImpl
		 * @see de.ubt.ai1.supermod.mm.client.impl.SuperModClientPackageImpl#getConflictSet()
		 * @generated
		 */
		EClass CONFLICT_SET = eINSTANCE.getConflictSet();

		/**
		 * The meta object literal for the '<em><b>Conflicts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFLICT_SET__CONFLICTS = eINSTANCE.getConflictSet_Conflicts();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFLICT_SET__SEVERITY = eINSTANCE.getConflictSet_Severity();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.client.impl.ProductConflictImpl <em>Product Conflict</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.client.impl.ProductConflictImpl
		 * @see de.ubt.ai1.supermod.mm.client.impl.SuperModClientPackageImpl#getProductConflict()
		 * @generated
		 */
		EClass PRODUCT_CONFLICT = eINSTANCE.getProductConflict();

		/**
		 * The meta object literal for the '<em><b>Affected Product Space Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_CONFLICT__AFFECTED_PRODUCT_SPACE_ELEMENTS = eINSTANCE.getProductConflict_AffectedProductSpaceElements();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CONFLICT__SEVERITY = eINSTANCE.getProductConflict_Severity();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.client.Severity <em>Severity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.client.Severity
		 * @see de.ubt.ai1.supermod.mm.client.impl.SuperModClientPackageImpl#getSeverity()
		 * @generated
		 */
		EEnum SEVERITY = eINSTANCE.getSeverity();

	}

} //SuperModClientPackage
