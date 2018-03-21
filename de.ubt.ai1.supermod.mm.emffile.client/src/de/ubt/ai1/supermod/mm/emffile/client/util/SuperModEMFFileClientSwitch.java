/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.emffile.client.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import de.ubt.ai1.supermod.mm.client.ProductConflict;
import de.ubt.ai1.supermod.mm.emffile.EMFObject;
import de.ubt.ai1.supermod.mm.emffile.client.*;
import de.ubt.ai1.supermod.mm.file.client.VersionedFileExportTrace;
import java.util.Map;
import de.ubt.ai1.supermod.mm.emffile.client.EMFClassDefinitionConflict;
import de.ubt.ai1.supermod.mm.emffile.client.EMFCyclicContainmentConflict;
import de.ubt.ai1.supermod.mm.emffile.client.EMFFeatureCompatibilityConflict;
import de.ubt.ai1.supermod.mm.emffile.client.EMFLinkCompatibilityConflict;
import de.ubt.ai1.supermod.mm.emffile.client.EMFMultiFeatureValueConflict;
import de.ubt.ai1.supermod.mm.emffile.client.EMFObjectClassConflict;
import de.ubt.ai1.supermod.mm.emffile.client.EMFObjectContainerConflict;
import de.ubt.ai1.supermod.mm.emffile.client.EMFObjectDefinitionConflict;
import de.ubt.ai1.supermod.mm.emffile.client.EMFReferentialIntegrityConflict;
import de.ubt.ai1.supermod.mm.emffile.client.EMFSingleFeatureValueConflict;
import de.ubt.ai1.supermod.mm.emffile.client.SuperModEMFFileClientPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * <!-- end-user-doc -->
 * @see de.ubt.ai1.supermod.mm.emffile.client.SuperModEMFFileClientPackage
 * @generated
 */
public class SuperModEMFFileClientSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SuperModEMFFileClientPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperModEMFFileClientSwitch() {
		if (modelPackage == null) {
			modelPackage = SuperModEMFFileClientPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SuperModEMFFileClientPackage.EMF_OBJECT_CLASS_CONFLICT: {
				EMFObjectClassConflict emfObjectClassConflict = (EMFObjectClassConflict)theEObject;
				T result = caseEMFObjectClassConflict(emfObjectClassConflict);
				if (result == null) result = caseProductConflict(emfObjectClassConflict);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModEMFFileClientPackage.EMF_CLASS_DEFINITION_CONFLICT: {
				EMFClassDefinitionConflict emfClassDefinitionConflict = (EMFClassDefinitionConflict)theEObject;
				T result = caseEMFClassDefinitionConflict(emfClassDefinitionConflict);
				if (result == null) result = caseProductConflict(emfClassDefinitionConflict);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModEMFFileClientPackage.EMF_FEATURE_COMPATIBILITY_CONFLICT: {
				EMFFeatureCompatibilityConflict emfFeatureCompatibilityConflict = (EMFFeatureCompatibilityConflict)theEObject;
				T result = caseEMFFeatureCompatibilityConflict(emfFeatureCompatibilityConflict);
				if (result == null) result = caseProductConflict(emfFeatureCompatibilityConflict);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModEMFFileClientPackage.EMF_OBJECT_CONTAINER_CONFLICT: {
				EMFObjectContainerConflict emfObjectContainerConflict = (EMFObjectContainerConflict)theEObject;
				T result = caseEMFObjectContainerConflict(emfObjectContainerConflict);
				if (result == null) result = caseProductConflict(emfObjectContainerConflict);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModEMFFileClientPackage.EMF_CYCLIC_CONTAINMENT_CONFLICT: {
				EMFCyclicContainmentConflict emfCyclicContainmentConflict = (EMFCyclicContainmentConflict)theEObject;
				T result = caseEMFCyclicContainmentConflict(emfCyclicContainmentConflict);
				if (result == null) result = caseProductConflict(emfCyclicContainmentConflict);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModEMFFileClientPackage.EMF_SINGLE_FEATURE_VALUE_CONFLICT: {
				EMFSingleFeatureValueConflict emfSingleFeatureValueConflict = (EMFSingleFeatureValueConflict)theEObject;
				T result = caseEMFSingleFeatureValueConflict(emfSingleFeatureValueConflict);
				if (result == null) result = caseProductConflict(emfSingleFeatureValueConflict);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModEMFFileClientPackage.EMF_MULTI_FEATURE_VALUE_CONFLICT: {
				EMFMultiFeatureValueConflict emfMultiFeatureValueConflict = (EMFMultiFeatureValueConflict)theEObject;
				T result = caseEMFMultiFeatureValueConflict(emfMultiFeatureValueConflict);
				if (result == null) result = caseProductConflict(emfMultiFeatureValueConflict);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModEMFFileClientPackage.EMF_LINK_COMPATIBILITY_CONFLICT: {
				EMFLinkCompatibilityConflict emfLinkCompatibilityConflict = (EMFLinkCompatibilityConflict)theEObject;
				T result = caseEMFLinkCompatibilityConflict(emfLinkCompatibilityConflict);
				if (result == null) result = caseProductConflict(emfLinkCompatibilityConflict);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModEMFFileClientPackage.EMF_OBJECT_DEFINITION_CONFLICT: {
				EMFObjectDefinitionConflict emfObjectDefinitionConflict = (EMFObjectDefinitionConflict)theEObject;
				T result = caseEMFObjectDefinitionConflict(emfObjectDefinitionConflict);
				if (result == null) result = caseProductConflict(emfObjectDefinitionConflict);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModEMFFileClientPackage.EMF_REFERENTIAL_INTEGRITY_CONFLICT: {
				EMFReferentialIntegrityConflict emfReferentialIntegrityConflict = (EMFReferentialIntegrityConflict)theEObject;
				T result = caseEMFReferentialIntegrityConflict(emfReferentialIntegrityConflict);
				if (result == null) result = caseProductConflict(emfReferentialIntegrityConflict);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModEMFFileClientPackage.EMF_FILE_EXPORT_TRACE: {
				EMFFileExportTrace emfFileExportTrace = (EMFFileExportTrace)theEObject;
				T result = caseEMFFileExportTrace(emfFileExportTrace);
				if (result == null) result = caseVersionedFileExportTrace(emfFileExportTrace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModEMFFileClientPackage.EMF_OBJECT_TO_EOBJECT_MAP_ENTRY: {
				@SuppressWarnings("unchecked") Map.Entry<EMFObject, EObject> emfObjectToEObjectMapEntry = (Map.Entry<EMFObject, EObject>)theEObject;
				T result = caseEMFObjectToEObjectMapEntry(emfObjectToEObjectMapEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMF Object Class Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMF Object Class Conflict</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEMFObjectClassConflict(EMFObjectClassConflict object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMF Class Definition Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMF Class Definition Conflict</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEMFClassDefinitionConflict(EMFClassDefinitionConflict object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMF Feature Compatibility Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMF Feature Compatibility Conflict</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEMFFeatureCompatibilityConflict(EMFFeatureCompatibilityConflict object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMF Object Container Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMF Object Container Conflict</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEMFObjectContainerConflict(EMFObjectContainerConflict object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMF Cyclic Containment Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMF Cyclic Containment Conflict</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEMFCyclicContainmentConflict(EMFCyclicContainmentConflict object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMF Single Feature Value Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMF Single Feature Value Conflict</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEMFSingleFeatureValueConflict(EMFSingleFeatureValueConflict object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMF Multi Feature Value Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMF Multi Feature Value Conflict</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEMFMultiFeatureValueConflict(EMFMultiFeatureValueConflict object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMF Link Compatibility Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMF Link Compatibility Conflict</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEMFLinkCompatibilityConflict(EMFLinkCompatibilityConflict object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMF Object Definition Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMF Object Definition Conflict</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEMFObjectDefinitionConflict(EMFObjectDefinitionConflict object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMF Referential Integrity Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMF Referential Integrity Conflict</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEMFReferentialIntegrityConflict(EMFReferentialIntegrityConflict object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMF File Export Trace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMF File Export Trace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEMFFileExportTrace(EMFFileExportTrace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMF Object To EObject Map Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMF Object To EObject Map Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEMFObjectToEObjectMapEntry(Map.Entry<EMFObject, EObject> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Conflict</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductConflict(ProductConflict object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Versioned File Export Trace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Versioned File Export Trace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVersionedFileExportTrace(VersionedFileExportTrace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SuperModEMFFileClientSwitch
