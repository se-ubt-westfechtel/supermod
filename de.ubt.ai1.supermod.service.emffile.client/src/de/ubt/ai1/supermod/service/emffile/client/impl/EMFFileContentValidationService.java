/******************************************************************************
 * Copyright (c) 2018 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.emffile.client.impl;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import de.ubt.ai1.supermod.mm.client.ProductConflict;
import de.ubt.ai1.supermod.mm.emffile.EMFClassRef;
import de.ubt.ai1.supermod.mm.emffile.EMFExternalReferenceValue;
import de.ubt.ai1.supermod.mm.emffile.EMFFeatureRef;
import de.ubt.ai1.supermod.mm.emffile.EMFFileContent;
import de.ubt.ai1.supermod.mm.emffile.EMFInternalReferenceValue;
import de.ubt.ai1.supermod.mm.emffile.EMFObject;
import de.ubt.ai1.supermod.mm.emffile.EMFValue;
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
import de.ubt.ai1.supermod.mm.emffile.client.SuperModEMFFileClientFactory;
import de.ubt.ai1.supermod.mm.emffile.util.EMFUtil;
import de.ubt.ai1.supermod.mm.file.VersionedFileContent;
import de.ubt.ai1.supermod.mm.list.VersionedList;
import de.ubt.ai1.supermod.service.file.client.IVersionedFileContentValidationService;
import de.ubt.ai1.supermod.service.list.client.ListValidationUtil;

/**
 * Implementation of the file content validation service specific to the EMF
 * file content type. It reports conflict in case an internally represented EMF
 * model may not be converted into an external single-version representation.
 * 
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>,
 * 			Johannes Schroepfer <Johannes.M.Schroepfer(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	2018-01-09
 */
public class EMFFileContentValidationService 
implements IVersionedFileContentValidationService {
	
	/**
	 * A resource set to use for external validation.
	 */
	protected ResourceSet rs;

	/**
	 * Caches all objects that have ever been detected as a part of a 
	 * containment cycle in order to prevent multiple conflict reports.
	 */
	protected Set<EMFObject> cyclicObjects;

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.file.client.
	 * IVersionedFileContentValidationService#start()
	 */
	@Override
	public void start() { 		
		cyclicObjects = new HashSet<>();
		this.rs = new ResourceSetImpl();
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.file.client.
	 * IVersionedFileContentValidationService#lex(
	 * de.ubt.ai1.supermod.file.VersionedFileContent)
	 */
	@Override
	public boolean lex(VersionedFileContent fileContent) {
		// only validates EMF file contents.
		return fileContent instanceof EMFFileContent;
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.file.client.
	 * IVersionedFileContentValidationService
	 * #compile(de.ubt.ai1.supermod.file.VersionedFileContent)
	 */
	@Override
	public Collection<ProductConflict> compile(
			VersionedFileContent fileContent) {
		Collection<ProductConflict> conflicts = new ArrayList<>();
		conflicts.addAll(validateContent((EMFFileContent) fileContent));
		for (EMFObject obj : ((EMFFileContent) fileContent).getObjects()) {
			conflicts.addAll(validateObject(obj));
			for (EMFClassRef cref : obj.getClassRefs()) {
				conflicts.addAll(validateClassRef(cref));
			}
			for (EMFFeatureRef fref : obj.getFeatureRefs()) {
				conflicts.addAll(validateFeatureRef(fref));
				for (EMFValue value : fref.getValues()) {
					conflicts.addAll(validateValue(value));
				}
				if (fref.getValueOrdering() != null) {
					conflicts.addAll(validateValueOrdering(
							fref.getValueOrdering()));
				}
			}
		}
		return conflicts;
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.file.client.
	 * IVersionedFileContentValidationService#link(
	 * de.ubt.ai1.supermod.file.VersionedFileContent, java.util.Collection)
	 */
	@Override
	public void link(VersionedFileContent fileContent, 
			Collection<ProductConflict> conflicts) {		
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.file.client.
	 * IVersionedFileContentValidationService#finish()
	 */
	@Override
	public void finish() {
		cyclicObjects.clear();
		cyclicObjects = null;
		rs.getResources().clear();
		rs = null;
	}
	
	/**
	 * Validates a specified file content.
	 *
	 * @param fileContent
	 * @return conflicts detected during validation.
	 */
	private Collection<? extends ProductConflict> validateContent(
			VersionedFileContent fileContent) {
		return Collections.emptyList();
	}

	/**
	 * Validates a specified object.
	 *
	 * @param obj
	 * @return conflicts detected during validation.
	 */
	private Collection<? extends ProductConflict> validateObject(
			EMFObject obj) {
		Collection<ProductConflict> conflicts = new ArrayList<>();
		
		// "Object Classification"
		if (obj.getClassRefs().size() != 1) {
			EMFObjectClassConflict classConflict = SuperModEMFFileClientFactory
					.eINSTANCE.createEMFObjectClassConflict();
			classConflict.setAffectedObject(obj);
			conflicts.add(classConflict);
		}
		
		// "Object Container"
		if (obj.getTargetingContainmentRefVals().size() > 1) {
			EMFObjectContainerConflict containerConflict = 
					SuperModEMFFileClientFactory.eINSTANCE
					.createEMFObjectContainerConflict();
			containerConflict.setAffectedObject(obj);
			conflicts.add(containerConflict);
		}
		
		// "Cyclic Containment"
		Set<EMFObject> containmentCycle = EMFFileContentUtil.getContainmentCycle(
				obj, new LinkedHashSet<EMFObject>());
		if (containmentCycle != null && !cyclicObjects.containsAll(
				containmentCycle)) {
			EMFCyclicContainmentConflict cyclicConflict = 
					SuperModEMFFileClientFactory.eINSTANCE
					.createEMFCyclicContainmentConflict();
			cyclicConflict.getAffectedObjects().addAll(containmentCycle);
			cyclicObjects.addAll(containmentCycle);
			conflicts.add(cyclicConflict);
		}
		
		return conflicts;
	}

	/**
	 * Validates a specified class reference.
	 *
	 * @param cref
	 * @return conflicts detected during validation.
	 */
	private Collection<? extends ProductConflict> validateClassRef(
			EMFClassRef cref) {
		Collection<ProductConflict> conflicts = new ArrayList<>();
		
		// "Class Target"
		if (EMFUtil.findRegisteredEClass(cref.getPackageUri(), 
				cref.getClassName()) == null) {
			EMFClassDefinitionConflict classDefConflict = 
					SuperModEMFFileClientFactory.eINSTANCE
					.createEMFClassDefinitionConflict();
			classDefConflict.setAffectedClassRef(cref);
			conflicts.add(classDefConflict);
		}
		
		return conflicts;
	}

	/**
	 * Validates a specified feature reference.
	 *
	 * @param fref
	 * @return conflicts detected during validation.
	 */
	private Collection<? extends ProductConflict> validateFeatureRef(
			EMFFeatureRef fref) {
		Collection<ProductConflict> conflicts = new ArrayList<>();
		int nValues = fref.getValues().size();
		if (fref.getValueOrdering() != null) {
			nValues = fref.getValueOrdering().getVertices().size();
		}
		String featureName = fref.getFeatureName();
		for (EMFClassRef cref : ((EMFObject) fref.eContainer()).getClassRefs()) {
				boolean compatible = false;
				EClass eClass = EMFUtil.findRegisteredEClass(cref
						.getPackageUri(), cref.getClassName());
				if (eClass != null) {
					for (EStructuralFeature eFeature : eClass
							.getEAllStructuralFeatures()) {
						if (eFeature.getName().equals(featureName)) {
							compatible = true;
							// "Single-Valued Structural Feature Value"
							if (!eFeature.isMany() && nValues > 1) {
								EMFSingleFeatureValueConflict 
								singleValConflict = 
										SuperModEMFFileClientFactory.eINSTANCE
										.createEMFSingleFeatureValueConflict();
								singleValConflict.setAffectedFeatureRef(fref);
								conflicts.add(singleValConflict);
							}
							// "Multi-Valued Structural Feature Values"
							else if (eFeature.isMany() &&
									(eFeature.getLowerBound() > nValues || 
									(eFeature.getUpperBound() > -1 && 
											eFeature.getUpperBound() < nValues))) {
								EMFMultiFeatureValueConflict multiValConflict = 
										SuperModEMFFileClientFactory.eINSTANCE
										.createEMFMultiFeatureValueConflict();
								multiValConflict.setAffectedFeatureRef(fref);
								conflicts.add(multiValConflict);
							}
						}							
					}
				}
				// "Structural Feature Compatibility"
				if (!compatible) {
					EMFFeatureCompatibilityConflict compConflict = 
							SuperModEMFFileClientFactory.eINSTANCE
							.createEMFFeatureCompatibilityConflict();
					compConflict.setAffectedFeatureRef(fref);
					conflicts.add(compConflict);
				}
		}		
		return conflicts;
	}
	
	/**
	 * Validates a specified value.
	 *
	 * @param value
	 * @return conflicts detected during validation.
	 */
	private Collection<? extends ProductConflict> validateValue(
			EMFValue value) {
		Collection<ProductConflict> conflicts = new ArrayList<>();
		if (value instanceof EMFInternalReferenceValue) {
			EMFInternalReferenceValue irv = (EMFInternalReferenceValue) value;
			EMFObject target = irv.getReferencedObject();
		
			// "Internal Link Target"
			if (target == null) {
				EMFReferentialIntegrityConflict refIntConflict = 
						SuperModEMFFileClientFactory.eINSTANCE
						.createEMFReferentialIntegrityConflict();
				refIntConflict.setAffectedObjectRef(irv);
				conflicts.add(refIntConflict);
			}
			
			// "Link Compatibility"
			else if (!isCompatibleReferenceValue(irv)) {
				EMFLinkCompatibilityConflict linkCompConflict =
						SuperModEMFFileClientFactory.eINSTANCE
						.createEMFLinkCompatibilityConflict();
				linkCompConflict.setIncompatibleLink(irv);
				conflicts.add(linkCompConflict);
			}
		}
		else if (value instanceof EMFExternalReferenceValue) {
			EMFExternalReferenceValue erv = (EMFExternalReferenceValue) value;
			String targetUri = erv.getEObjectUri();
			EObject targetEObject = null;
			try {
				targetEObject = EMFUtil.uriStringToEObject(targetUri, rs);
			}
			catch (Exception e) { }
			
			// "External Link Target"
			if (targetEObject == null) {
				EMFObjectDefinitionConflict objectDefConflict = 
						SuperModEMFFileClientFactory.eINSTANCE
						.createEMFObjectDefinitionConflict();
				objectDefConflict.setAffectedObjectRef(erv);
				conflicts.add(objectDefConflict);
			}
		}		
		return conflicts;
	}

	/**
	 * Checks whether a specified internal reference value is compatible with
	 * respect to its structural feature specified in the metadata.
	 *
	 * @param irv
	 * @return
	 */
	private boolean isCompatibleReferenceValue(EMFInternalReferenceValue irv) {
		EMFFeatureRef fr = (EMFFeatureRef) irv.eContainer();
		EMFObject target = irv.getReferencedObject();
		for (EMFClassRef targetClass : target.getClassRefs()) {
			EClass targetEClass = EMFUtil.findRegisteredEClass(
					targetClass.getPackageUri(), targetClass.getClassName());
			for (EMFClassRef cr : ((EMFObject) fr.eContainer()).getClassRefs()) {
				EClass sourceEClass = EMFUtil.findRegisteredEClass(
						cr.getPackageUri(), cr.getClassName());
				if (sourceEClass == null) {
					return false;
				}
				EStructuralFeature esf = sourceEClass
						.getEStructuralFeature(fr.getFeatureName());
				if (esf != null && esf.getEType() instanceof EClass) {
					EClass featureTypeEClass = (EClass) esf.getEType();
					if (featureTypeEClass.equals(
							EcorePackage.eINSTANCE.getEObject()) ||
							targetEClass.equals(featureTypeEClass) ||
							targetEClass.getEAllSuperTypes()
							.contains(featureTypeEClass)) {
						return true;
					}
				}
			}
		}
		return false;
	}

	/**
	 * Validates a specified value ordering
	 * 
	 * @see ListValidationUtil#validateOrdering(VersionedList)
	 *
	 * @param valueOrdering
	 * @return conflicts detected during validation.
	 */
	private Collection<? extends ProductConflict> validateValueOrdering(
			VersionedList valueOrdering) {
		return ListValidationUtil.validateOrdering(valueOrdering);
	}

}
