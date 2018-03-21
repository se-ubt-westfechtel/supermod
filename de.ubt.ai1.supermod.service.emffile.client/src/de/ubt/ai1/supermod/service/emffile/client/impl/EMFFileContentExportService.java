/******************************************************************************
 * Copyright (c) 2018 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.emffile.client.impl;


import static de.ubt.ai1.supermod.service.generic.client.impl.DefaultResolutionPreferenceUtil.DEFAULTRES__CYCLIC_CONTAINMENT;
import static de.ubt.ai1.supermod.service.generic.client.impl.DefaultResolutionPreferenceUtil.DEFAULTRES__OBJECT_CONTAINER;
import static de.ubt.ai1.supermod.service.generic.client.impl.DefaultResolutionPreferenceUtil.DEFAULTRES__SINGLE_VALUED_STRUCTURAL_FEATURE_VALUE;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.emffile.EMFAttributeValue;
import de.ubt.ai1.supermod.mm.emffile.EMFClassRef;
import de.ubt.ai1.supermod.mm.emffile.EMFContainmentReferenceValue;
import de.ubt.ai1.supermod.mm.emffile.EMFExternalReferenceValue;
import de.ubt.ai1.supermod.mm.emffile.EMFFeatureRef;
import de.ubt.ai1.supermod.mm.emffile.EMFFileContent;
import de.ubt.ai1.supermod.mm.emffile.EMFInternalReferenceValue;
import de.ubt.ai1.supermod.mm.emffile.EMFObject;
import de.ubt.ai1.supermod.mm.emffile.EMFValue;
import de.ubt.ai1.supermod.mm.emffile.client.EMFFileExportTrace;
import de.ubt.ai1.supermod.mm.emffile.client.SuperModEMFFileClientFactory;
import de.ubt.ai1.supermod.mm.emffile.util.EMFUtil;
import de.ubt.ai1.supermod.mm.file.VersionedFileContent;
import de.ubt.ai1.supermod.mm.file.client.SingleVersionFileDescriptor;
import de.ubt.ai1.supermod.mm.file.client.SingleVersionFileSystemDescriptor;
import de.ubt.ai1.supermod.service.client.IDefaultResolver;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientWrappedException;
import de.ubt.ai1.supermod.service.emffile.client.IUUIDConverter;
import de.ubt.ai1.supermod.service.file.client.IVersionedFileContentExportService;
import de.ubt.ai1.supermod.service.list.client.ListExportUtil;

/**
 * An implementation of the file content export service specific to the EMF
 * file content type of the versioned file system product dimension. It
 * transforms each EMF object of a given EMF file content to a single-version
 * {@link EObject}, and sets the details of the object accordingly. References
 * between multiple EMF resources are resolved properly.
 * 
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>,
 * 			Johannes Schroepfer <Johannes.M.Schroepfer(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	2018-01-28
 */
public class EMFFileContentExportService 
implements IVersionedFileContentExportService {
	
	@Inject
	private IUUIDConverter uuidConverter;
	
	@Inject
	private IDefaultResolver defaultResolver;
	
	/**
	 * Maps between EMF file contents and corresponding external EMF resources.
	 */
	protected Map<EMFFileContent, Resource> resourceMap;
	
	/**
	 * Maps between internal and external EMF objects.
	 */
	protected Map<EMFObject, EObject> objectMap;
	
	/**
	 * A resource set to use for the exported resources.
	 */
	protected ResourceSet rs;
	
	/**
	 * Describes the corresponding workspace contents.
	 */
	protected SingleVersionFileSystemDescriptor fsDescriptor;
	
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.file.client.
	 * IVersionedFileContentExportService#start(
	 * de.ubt.ai1.supermod.mm.file.client.SingleVersionFileSystemDescriptor)
	 */
	@Override
	public void start(SingleVersionFileSystemDescriptor fsDescriptor) {
		this.fsDescriptor = fsDescriptor;
		this.rs = new ResourceSetImpl();
		this.resourceMap = new HashMap<EMFFileContent, Resource>();
		this.objectMap = new HashMap<EMFObject, EObject>();
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.file.client.
	 * IVersionedFileContentExportService#lex(
	 * de.ubt.ai1.supermod.file.VersionedFileContent)
	 */
	@Override
	public boolean lex(VersionedFileContent fileContent) {
		// only EMF file contents may be exported.
		return fileContent instanceof EMFFileContent;
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.file.client.
	 * IVersionedFileContentExportService#compile(
	 * de.ubt.ai1.supermod.file.VersionedFileContent)
	 */
	@Override
	public EMFFileExportTrace compile(VersionedFileContent fileContent) {
		
		EMFFileContent content = (EMFFileContent) fileContent;
		EMFFileExportTrace trace = SuperModEMFFileClientFactory
				.eINSTANCE.createEMFFileExportTrace();
		
		// Resolve containment cycles by a pre-processing.
		preProcess(content);
		
		// Convert the resource and map it by the contents.
		Resource eRes = contentToERes(content);
		resourceMap.put(content, eRes);

		eRes.getContents().clear();
		for (EMFObject emfRoot : (content.getRoots())) {
			// Export all objects.
			EObject eRoot = exportObject(emfRoot);
			if (eRoot != null) {
				eRes.getContents().add(eRoot);
			}
		}
		
		trace.getEmfObjectToEObjectMap().putAll(objectMap);		
		return trace;
	}
	
	/**
	 * Processes some actions resolving containment cycles.
	 * 
	 * @param content
	 */
	private void preProcess(EMFFileContent content) {
		
		while (true) {
			Set<EMFObject> set = null;
			for (EMFObject obj : content.getObjects()) {
				set = EMFFileContentUtil.getContainmentCycle(
						obj, new LinkedHashSet<EMFObject>());
				if (set != null) break;   // A cycle has been detected.
			}
			if (set == null) break;   // No cycles available any more.
			
			// Creating the list of candidates:
			EList<EMFContainmentReferenceValue> candidates = ECollections
					.newBasicEList();
			for (EMFObject obj : set) {
				// For each cycle element, its relevant incoming containment
				// reference value is computed.
				EMFContainmentReferenceValue correctRef = null;
				for (EMFContainmentReferenceValue ref :
						obj.getTargetingContainmentRefVals()) {
					// Each incoming containment reference value is tested.
					if (ref.eContainer() != null &&
							ref.eContainer().eContainer() != null) {
						EMFObject parent = (EMFObject) ref.eContainer()
								.eContainer();
						if (EMFFileContentUtil.getContainmentCycle(parent,
								obj, new LinkedHashSet<EMFObject>()) != null) {
							correctRef = ref;
							break;
						}
					}
				}
				candidates.add(correctRef);
			}
			
			// Removing a proper containment reference value:
			EMFContainmentReferenceValue selectedRef = defaultResolver.
					selectCandidate(candidates,
					DEFAULTRES__CYCLIC_CONTAINMENT, getCurrentProject());
					// Inverse selection: The candidate with the lowest
					// score is selected.
			EMFObject newRoot = selectedRef.getReferencedObject();
			EMFFeatureRef featureRef =
					(EMFFeatureRef) selectedRef.eContainer();
			selectedRef.setReferencedObject(null);
			featureRef.getValues().remove(selectedRef);
			
			// If necessary, remove conflicting foreign containment
			// reference values to elements of the cycle.
			for (EMFObject obj : set) {
				if (obj != newRoot && obj.getTargetingContainmentRefVals()
						.size() > 1) {
					for (EMFContainmentReferenceValue ref :
							ECollections.newBasicEList(
							obj.getTargetingContainmentRefVals())) {
						EMFFeatureRef fRef = (EMFFeatureRef)
								ref.eContainer();
						
						if (!set.contains((EMFObject) fRef.eContainer())) {
							ref.setReferencedObject(null);
							fRef.getValues().remove(ref);
						}
					}
				}
			}
		}
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.file.client.
	 * IVersionedFileContentExportService#link(
	 * de.ubt.ai1.supermod.file.VersionedFileContent, 
	 * de.ubt.ai1.supermod.mm.file.client.SingleVersionFileDescriptor)
	 */
	@Override
	public void link(VersionedFileContent fileContent, 
			SingleVersionFileDescriptor descriptor) {
		EMFFileContent content = (EMFFileContent) fileContent;
		Resource eRes = resourceMap.get(content);
		boolean supportsUUIDs = supportsUUIDs(eRes);
		for (EMFObject emfObject : content.getObjects()) {
			// resolve cross references within the linking phase.
			exportCrossReferences(emfObject);
			if (supportsUUIDs) {
				setUUID(eRes, objectMap.get(emfObject), emfObject.getUuid());
			}
		}		
	}

	@Override
	public void finish() throws SuperModClientException {		
		objectMap = null;
		fsDescriptor = null;
		for (Resource eRes : resourceMap.values()) {
			try {
				eRes.save(null);
			} catch (IOException e) {
				throw new SuperModClientWrappedException(e);
			}
		}	
		rs = null;
		resourceMap = null;
	}
	
	/**
	 * Converts an internal SuperMod EMF file content into a corresponding
	 * single-version EMF resource in the local workspace.
	 *
	 * @param content
	 * @return the EMF workspace resource created.
	 */
	private Resource contentToERes(EMFFileContent content) {
		String uri = content.getFile().getPath();	
		String absoluteUri = fsDescriptor.getRootUri() + "/" + uri;
		URI resURI = URI.createPlatformResourceURI(absoluteUri, true);
		return rs.createResource(resURI, content.getFile().getContentType());
	}

	/**
	 * Converts an internal SuperMod EMF object into a corresponding EObject
	 * by instantiating its referenced class reflectively. Attribute values
	 * are converted accordingly, and so are EMF objects connected by
	 * containment recursively. Non-containment cross-references are converted
	 * later on in the linking phase.
	 *
	 * @param emfObject
	 * @return the corresponding single-version EMF object
	 */
	private EObject exportObject(EMFObject emfObject) {
		if (!emfObject.getClassRefs().isEmpty() && 
				!objectMap.containsKey(emfObject)) {
			EMFClassRef classRef = defaultResolver.selectCandidate(
					emfObject.getClassRefs(), null, getCurrentProject());
			EClass eClass = resolveEClass(classRef);
			if (eClass != null) {
				// instantiate the EClass reflectively.
				EObject eObject = eClass.getEPackage().getEFactoryInstance()
						.create(eClass);
				objectMap.put(emfObject, eObject);
				for (EMFFeatureRef emfFeatureRef : emfObject.getFeatureRefs()) {
					EStructuralFeature eFeature = resolveEFeature(eClass, 
							emfFeatureRef);
					if (eFeature != null) {
						if (eFeature instanceof EAttribute) {
							// convert contained attribute values.
							Object value = exportAttribute(emfFeatureRef, 
									eClass);
							if (value != null) {
								try {
									eObject.eSet(eFeature, value);
								}
								catch (Exception e) { }
							}
						}
						else if (eFeature instanceof EReference && 
								((EReference) eFeature).isContainment()) {
							// convert contained objects.
							Object value = exportContainment(emfFeatureRef, 
									eClass);
							if (value != null) {
								try {
									eObject.eSet(eFeature, value);
								}
								catch (Exception e) { }		
							}
						}
					}
				}
				return eObject;
			}
		}
		return null;
	}

	/**
	 * Exports the value of an internal EMF attribute into its external
	 * single-version representation using the specified attribute data type.
	 *
	 * @param emfFeatureRef the internally represented attribute.
	 * @param eClass the class where the attribute is declared.
	 * @return the EMF object representation of the converted value of the
	 * 			attribute (either an EList or an atomic value).
	 */
	private Object exportAttribute(EMFFeatureRef emfFeatureRef, EClass eClass) {
		EStructuralFeature eFeature = resolveEFeature(eClass, emfFeatureRef);
		EList<Object> values = ECollections.newBasicEList();
		EList<EMFValue> emfValues = ListExportUtil.exportList(
				emfFeatureRef.getValueOrdering(), defaultResolver,
				getCurrentProject());
		if (emfValues == null) {
			emfValues = emfFeatureRef.getValues();
		}
		for (EMFValue emfValue : emfValues) {
			if (emfValue instanceof EMFAttributeValue) {
				String literal = ((EMFAttributeValue) emfValue).getLiteral();
				if (eFeature != null) {
					// create the attribute value reflectively.
					Object value = EcoreUtil.createFromString(
							((EAttribute) eFeature).getEAttributeType(), 
							literal);
					if (value != null) {
						values.add(value);				
					}
				}
			}
		}
		// distinguish between single-valued and multi-valued features.
		if (eFeature.isMany()) {
			return values;
		}
		else if (!values.isEmpty()) {
			return values.get(emfValues.indexOf(defaultResolver.selectCandidate(
					emfValues, DEFAULTRES__SINGLE_VALUED_STRUCTURAL_FEATURE_VALUE,
					getCurrentProject())));
		}
		else {
			return null;
		}
	}

	/**
	 * Exports the value of an internally represented containment reference.
	 * All contained objects will be inserted recursively in order to construct
	 * the containment tree in the workspace file.
	 *
	 * @param emfFeatureRef the internally represented containment reference
	 * @param eClass the class where the containment reference is declared.
	 * @return the EMF object representation of the converted value of the
	 * 			containment reference (either an EList or an EObject)
	 */
	private Object exportContainment(EMFFeatureRef emfFeatureRef, 
			EClass eClass) {
		
		EStructuralFeature eFeature = resolveEFeature(eClass, emfFeatureRef);
		EList<EObject> contents = ECollections.newBasicEList();
		EList<EMFValue> emfValues = ListExportUtil.exportList(
				emfFeatureRef.getValueOrdering(), defaultResolver,
				getCurrentProject());
		if (emfValues == null) {
			emfValues = emfFeatureRef.getValues();
		}
		for (EMFValue emfValue : emfValues) {
			if (emfValue instanceof EMFContainmentReferenceValue) {				
				// create the contained objects recursively.
				EMFContainmentReferenceValue contRefVal = 
						(EMFContainmentReferenceValue) emfValue;
				EMFObject emfTarget = contRefVal.getReferencedObject();
				if (emfTarget != null && isLegalContainer(contRefVal, emfTarget)) {
					EObject eTarget = exportObject(emfTarget);
					if (eTarget != null) {
						contents.add(eTarget);
					}
				}
			}
		}
		// distinguish between single-valued and multi-valued features.
		if (eFeature.isMany()) {
			return contents;
		}
		else if (!contents.isEmpty()) {
			return contents.get(emfValues.indexOf(defaultResolver.selectCandidate(
					emfValues, DEFAULTRES__SINGLE_VALUED_STRUCTURAL_FEATURE_VALUE,
					getCurrentProject())));
		}
		else {
			return null;
		}
	}	

	/**
	 * @param contRefVal
	 * @param emfTarget
	 * @return whether contRefVal is the legal container of emfTarget, not
	 * 		neglecting the possibility of an object container conflict
	 */
	private boolean isLegalContainer(EMFContainmentReferenceValue contRefVal,
			EMFObject emfTarget) {
		
		return defaultResolver.selectCandidate(
				emfTarget.getTargetingContainmentRefVals(),
				DEFAULTRES__OBJECT_CONTAINER, getCurrentProject()) == contRefVal;
	}

	/**
	 * Finds an EClass that corresponds to the specified internally represented
	 * EMF class, which may be versioned or unversioned.
	 *
	 * @param classRef 
	 * @return the corresponding EClass.
	 */
	private EClass resolveEClass(EMFClassRef classRef) {
		
		// find the EClass in the registry.
		return EMFUtil.findRegisteredEClass(classRef.getPackageUri(),
				classRef.getClassName());
	}

	/**
	 * Finds an EStructuralFeature that corresponds to the specified internally
	 * represented EMF feature reference, which may be versioned or unversioned.
	 *
	 * @param eClass the resolved EClass where the feature is declared.
	 * @param featureRef
	 * @return the corresponding EStructuralFeature.
	 */
	private EStructuralFeature resolveEFeature(EClass eClass, 
			EMFFeatureRef featureRef) {
		
		return eClass.getEStructuralFeature(featureRef.getFeatureName());
	}
	
	/**
	 * Converts all cross-references of a given internally represented EMF
	 * object in their external representation by applying the corresponding
	 * links.
	 *
	 * @param emfObject the object where to resolve outgoing references.
	 */
	private void exportCrossReferences(EMFObject emfObject) {
		EObject eObject = objectMap.get(emfObject);
		if (eObject != null) {
			EClass eClass = eObject.eClass();
			for (EMFFeatureRef emfFeatureRef : emfObject.getFeatureRefs()) {
				EStructuralFeature eFeature = resolveEFeature(eClass, 
						emfFeatureRef);
				if (eFeature instanceof EReference &&
						!((EReference) eFeature).isContainer() &&
						!((EReference) eFeature).isContainment() &&
						eObject.eClass().getEAllStructuralFeatures()
								.contains(eFeature)) {
					// convert cross-reference
					Object value = exportCrossReference(emfFeatureRef, eClass);
					if (value != null) {
						try {
							eObject.eSet(eFeature, value);
						}
						catch (Exception e) { }					
					}
				}
			}	
		}
	}

	/**
	 * Exports the value of an internally represented cross-reference. All
	 *  referenced objects will resolved by the object map in order to create
	 *  a link to an existing object in a workspace file.
	 *
	 * @param emfFeatureRef the internally represented cross-reference
	 * @param eClass the class where the reference is declared.
	 * @return the EMF object representation of the converted value of the
	 * 			cross-reference (either an EList or an EObject)
	 */
	private Object exportCrossReference(EMFFeatureRef emfFeatureRef, 
			EClass eClass) {
		EStructuralFeature eFeature = resolveEFeature(eClass, emfFeatureRef);
		EList<EObject> crossLinks = ECollections.newBasicEList();
		EList<EMFValue> emfValues = ListExportUtil.exportList(
				emfFeatureRef.getValueOrdering(), defaultResolver,
				getCurrentProject());
		if (emfValues == null) {
			emfValues = emfFeatureRef.getValues();
		}
		for (EMFValue emfValue : emfValues) {
			EObject eTarget = null;
			if (emfValue instanceof EMFInternalReferenceValue) {
				eTarget = objectMap.get(((EMFInternalReferenceValue) 
						emfValue).getReferencedObject());
			}
			else if (emfValue instanceof EMFExternalReferenceValue) {
				try {
					eTarget = EMFUtil.uriStringToEObject(
							((EMFExternalReferenceValue) 
									emfValue).getEObjectUri(), rs);
				}
				catch (Exception e) { }
			}
			if (eTarget != null) {
				crossLinks.add(eTarget);
			}
		}
		// distinguish between single-valued and multi-valued features.
		if (eFeature.isMany()) {
			return crossLinks;
		}
		else if (!crossLinks.isEmpty()) {
			return crossLinks.get(emfValues.indexOf(defaultResolver.selectCandidate(
					emfValues, DEFAULTRES__SINGLE_VALUED_STRUCTURAL_FEATURE_VALUE,
					getCurrentProject())));
		}
		else {
			return null;
		}
	}
	
	/**
	 * Returns the current project within the workspace by the file system
	 * descriptor URI.
	 */
	private IProject getCurrentProject() {
		
		String projectName = fsDescriptor.eResource().getURI().segment(1);
		return ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
	}

	/**
	 * @param eRes
	 * @return whether <code>eRes</code> supports UUIDs.
	 */
	private boolean supportsUUIDs(Resource eRes) {
		return eRes instanceof XMLResource;
	}	

	/**
	 * Sets the UUID of a specified EObject within a specified resource to a
	 * specified internal UUID, which is exported into its external
	 * representation by the UUID converter.
	 *
	 * @param eRes
	 * @param eObject
	 * @param uuid
	 */
	private void setUUID(Resource eRes, EObject eObject, String uuid) {
		((XMLResource) eRes).setID(eObject, uuidConverter.
				convertInternalToExternalUUID(uuid));
	}

}
