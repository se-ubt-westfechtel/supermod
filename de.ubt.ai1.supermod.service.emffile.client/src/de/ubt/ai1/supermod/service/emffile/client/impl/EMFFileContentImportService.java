/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.emffile.client.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.UniqueEList;
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
import de.ubt.ai1.supermod.mm.emffile.SuperModEMFFileFactory;
import de.ubt.ai1.supermod.mm.emffile.util.EMFUtil;
import de.ubt.ai1.supermod.mm.file.VersionedFileContent;
import de.ubt.ai1.supermod.mm.file.VersionedFileSystem;
import de.ubt.ai1.supermod.mm.file.client.SingleVersionFileDescriptor;
import de.ubt.ai1.supermod.mm.file.client.SingleVersionFileSystemDescriptor;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;
import de.ubt.ai1.supermod.service.emffile.client.IUUIDConverter;
import de.ubt.ai1.supermod.service.file.client.IVersionedFileContentImportService;
import de.ubt.ai1.supermod.service.list.client.ListImportUtil;
import de.ubt.ai1.util.emf.AI1EcoreUtil;

/**
 * An implementation of the file content import service specific for the file
 * content type of EMF models within the versioned file system product space.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	31.07.2014
 */
public class EMFFileContentImportService 
implements IVersionedFileContentImportService {
	
	/**
	 * Level in the MOF hierarchy for models.
	 */
	public static final int META_LEVEL_MODEL = 2;
	
	/**
	 * Level in the MOF hierarchy for meta-models.
	 */
	public static final int META_LEVEL_METAMODEL = 3;
	
	@Inject
	private IUUIDConverter uuidConverter;
	
	/**
	 * Maps between the internally represented EMF file contents and
	 * corresponding external EMF resources.
	 */
	protected Map<EMFFileContent, Resource> resourceMap;	
	
	/**
	 * Maps between file descriptors and corresponding external EMF resources.
	 */
	protected Map<SingleVersionFileDescriptor, Resource> descriptorMap;
	
	/**
	 * Maps between externally and internally represented EMF objects.
	 */
	protected Map<EObject, EMFObject> objectMap;
	
	/**
	 * The resource set where to load the external EMF resources.
	 */
	protected ResourceSet rs;
	
	protected SingleVersionFileSystemDescriptor fsDescriptor;
	
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.file.client.
	 * IVersionedFileContentImportService#start(
	 * de.ubt.ai1.supermod.mm.file.client.SingleVersionFileSystemDescriptor)
	 */
	@Override
	public void start(SingleVersionFileSystemDescriptor fsDescriptor) {
		this.rs = new ResourceSetImpl();
		this.fsDescriptor = fsDescriptor;
		this.resourceMap = new HashMap<>();
		this.descriptorMap = new HashMap<>();
		this.objectMap = new HashMap<>();
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.file.client.
	 * IVersionedFileContentImportService#lex(
	 * de.ubt.ai1.supermod.mm.file.client.SingleVersionFileDescriptor)
	 */
	@Override
	public boolean lex(SingleVersionFileDescriptor descriptor) 
			throws SuperModClientException {
		String absoluteUri = fsDescriptor.getRootUri() + "/" +
				descriptor.getPath();
		Resource res = null;
		try {
			// allocate a resource within the external resource set and load
			// the resource.
			res = rs.createResource(URI.createPlatformResourceURI(
					absoluteUri, true));
			res.load(null);
			if (res.getContents().isEmpty()) {
				throw new IllegalArgumentException();
			}
			descriptorMap.put(descriptor, res);
			return true;
		}
		catch (Exception e1) {
			res.unload();
			rs.getResources().remove(res);
			return false;
		}
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.file.client.
	 * IVersionedFileContentImportService#compile(
	 * de.ubt.ai1.supermod.file.VersionedFileSystem, 
	 * de.ubt.ai1.supermod.mm.file.client.SingleVersionFileDescriptor)
	 */
	@Override
	public EMFFileContent compile(VersionedFileSystem fs, 
			SingleVersionFileDescriptor descriptor)
					throws SuperModClientException {
		Resource res = descriptorMap.get(descriptor);					
		EMFFileContent content = SuperModEMFFileFactory.eINSTANCE
				.createEMFFileContent();
		resourceMap.put(content, res);
		// import root objects and recursively their contained objects.
		for (EObject root : res.getContents()) {
			importObject(root, content);
		}
		return content;
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.file.client.
	 * IVersionedFileContentImportService#link(
	 * de.ubt.ai1.supermod.mm.file.client.SingleVersionFileDescriptor, 
	 * de.ubt.ai1.supermod.file.VersionedFileContent)
	 */
	@Override
	public void link(SingleVersionFileDescriptor descriptor, 
			VersionedFileContent fileContent)
				throws SuperModClientException {
		EMFFileContent content = (EMFFileContent) fileContent;
		Resource eRes = resourceMap.get(content);
		boolean supportsUUIDs = supportsUUIDs(eRes);
		TreeIterator<EObject> contents = eRes.getAllContents();
		// resolve cross-references and assign UUIDs.
		while (contents.hasNext()) {
			EObject eObj = contents.next();
			importCrossReferences(eObj);
			if (objectMap.containsKey(eObj)) {
				if (supportsUUIDs) {
					setUUID(eRes, eObj, objectMap.get(eObj));
				}
				else {
					setPseudoUUID(eRes, eObj, objectMap.get(eObj));
				}
			}
		}
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.file.client.
	 * IVersionedFileContentImportService#finish()
	 */
	@Override
	public void finish() throws SuperModClientException {
		descriptorMap.clear();
		descriptorMap = null;
		objectMap.clear();
		objectMap = null;
		fsDescriptor = null;
		for (Resource res : resourceMap.values()) {
			res.unload();
			rs.getResources().remove(res);
		}
		rs.getResources().clear();
		resourceMap = null;
	}

	/**
	 * Converts an externally represented EMF object into its internal
	 * multi-variant SuperMod representation.
	 *
	 * @param eObject
	 * @param content where the object will be added.
	 * @return the internal representation.
	 */
	private EMFObject importObject(EObject eObject, EMFFileContent content) {
		EMFObject emfObject = SuperModEMFFileFactory.eINSTANCE
				.createEMFObject();
		EMFClassRef emfClassRef = createClassRef(eObject.eClass());
		emfObject.getClassRefs().add(emfClassRef);
		objectMap.put(eObject, emfObject);
		content.getObjects().add(emfObject);
		for (EStructuralFeature eFeature : eObject.eClass()
				.getEAllStructuralFeatures()) {			
			if (AI1EcoreUtil.isPersistent(eFeature)) {
				Object value = eObject.eGet(eFeature);
				if (value != null) {
					// import attributes and containment references
					EMFFeatureRef featureRef = createFeatureRef(eFeature);
					emfObject.getFeatureRefs().add(featureRef);
					List<EMFValue> values = new ArrayList<>();
					if (eFeature instanceof EAttribute) {
						List<EMFAttributeValue> attValues = 
								importAttributeValues(value, 
										(EAttribute) eFeature);
						values.addAll(attValues);
					}
					else if (eFeature instanceof EReference && 
							((EReference) eFeature).isContainment()) {
						List<EMFContainmentReferenceValue> contValues = 
								importContainmentValues(value, 
										(EReference) eFeature, content);
						values.addAll(contValues);
					}
					featureRef.getValues().addAll(new UniqueEList<>(values));
					if (eFeature.isMany() && eFeature.isOrdered()) {
						// XXX passiert wirklich nur fuer ordered?
						featureRef.setValueOrdering(ListImportUtil
								.createLinearList(values));
					}
				}
			}
		}
		return emfObject;
	}

	/**
	 * Creates an internal representation of the instance-of relationship of
	 * an EObject to its EClass. This meta-data may be versioned or unversioned.
	 *
	 * @param eClass
	 * @return a class reference that represents the referenced EClass as an
	 * 			unversioned or versioned SuperMod element.
	 */
	private EMFClassRef createClassRef(EClass eClass) {
		EMFClassRef cr = SuperModEMFFileFactory.eINSTANCE
				.createEMFClassRef();
		cr.setPackageUri(eClass.getEPackage().getNsURI());
		cr.setClassName(eClass.getName());
		return cr;
	}

	/**
	 * Creates an internal representation of the reference to the structural
	 * feature for which values are defined for a specific object. This
	 * meta-data may be versioned or unversioned.
	 *
	 * @param eFeature
	 * @return a feature reference that represents the referenced 
	 * 			EStructuralFeature as an unversioned or versioned SuperMod
	 * 			element.
	 */
	private EMFFeatureRef createFeatureRef(EStructuralFeature eFeature) {		
		EMFFeatureRef fr = SuperModEMFFileFactory.eINSTANCE.createEMFFeatureRef();
		fr.setFeatureName(eFeature.getName());
		return fr;
	}

	/**
	 * Converts the values of an externally represented attribute into the
	 * internal SuperMod representation.
	 *
	 * @param value the external EMF representation of the value of a single-
	 * 			or multi-valued attribute (EList or Object).
	 * @param eAttribute describes the meta-data of the specified attribute
	 * 			value(s).
	 * @return an internal SuperMod representation as a list of attribute
	 * 			values.
	 */
	private List<EMFAttributeValue> importAttributeValues(Object value, 
			EAttribute eAttribute) {
		List<EMFAttributeValue> allAttValues = new ArrayList<>();
		List<EMFAttributeValue> uniqueAttValues = new ArrayList<>();
		Map<String, EMFAttributeValue> literalToValueMap = new HashMap<>();
		if (eAttribute.isMany()) {
			EList<?> values = (EList<?>) value;
			for (Object o : values) {
				EMFAttributeValue attValue = createEMFAttributeValue(
						eAttribute, o);
				if (!literalToValueMap.containsKey(attValue.getLiteral())) {
					allAttValues.add(attValue);
					uniqueAttValues.add(attValue);
					literalToValueMap.put(attValue.getLiteral(), attValue);
				}
				else {
					allAttValues.add(literalToValueMap.get(
							attValue.getLiteral()));
				}
			}
		}
		else if (value != null) {
			allAttValues.add(createEMFAttributeValue(eAttribute, value));
		}
		return allAttValues;
	}

	/**
	 * Converts the value of an externally represented primitive data value
	 * into the internal SuperMod representation.
	 *
	 * @param eAttribute describes the meta-data of the specified attribute
	 * 			value. Used in order to convert the primitive data value into
	 * 			its literal representation.
	 * @param o the primitive data value.
	 * @return internal EMF attribute value representation, referencing the
	 * 			value by its literal.
	 */
	private EMFAttributeValue createEMFAttributeValue(EAttribute eAttribute,
			Object o) {
		String literal = EcoreUtil.convertToString(
				eAttribute.getEAttributeType(), o);
		EMFAttributeValue emfAv = SuperModEMFFileFactory.eINSTANCE
				.createEMFAttributeValue();
		emfAv.setLiteral(literal);
		return emfAv;
	}

	/**
	 * Converts the externally represented value of an EMF containment link
	 * into a corresponding internal SuperMod representation.
	 *
	 * @param value the contained object(s), either an EList or EObject.
	 * @param eReference the containment reference defined in the meta-model.
	 * @param fileContent where all recursively contained object will be
	 * 			placed. (flattened representation)
	 * @return an internal SuperMod representation that defines the value
	 * 			of the specified containment link.
	 */
	private List<EMFContainmentReferenceValue> importContainmentValues(
			Object value, EReference eReference, EMFFileContent fileContent) {
		EList<EMFContainmentReferenceValue> emfValues = ECollections.newBasicEList();
		if (eReference.isMany()) {
			@SuppressWarnings("unchecked")
			EList<EObject> contents = (EList<EObject>) value;
			for (EObject content : contents) {
				emfValues.add(createEMFContainmentTarget(content, 
						fileContent));
			}
		}
		else if (value != null) {
			emfValues.add(createEMFContainmentTarget((EObject) value, 
					fileContent));
		}
		return emfValues;
	}

	/**
	 * Creates an internal representation for the containment of a specified
	 * EObject, which will be recursively converted into the internal SuperMod
	 * representation.
	 *
	 * @param eObject contained EObject to convert.
	 * @param fileContent where the contained object will be stored.
	 * @return the internal containment link representation.
	 */
	private EMFContainmentReferenceValue createEMFContainmentTarget(
			EObject eObject, EMFFileContent fileContent) {
		EMFObject target = importObject(eObject, fileContent);
		if (target != null) {
			EMFContainmentReferenceValue emfCrv = SuperModEMFFileFactory
					.eINSTANCE.createEMFContainmentReferenceValue();
			emfCrv.setReferencedObject(target);
			return emfCrv;
		}
		return null;
	}

	/**
	 * Traverses the cross-references objects of a given EObject and converts
	 * all non-containment links into the corresponding internal SuperMod
	 * representation.
	 *
	 * @param eObj the EObject whose cross-links to import.
	 */
	private void importCrossReferences(EObject eObj) {
		EMFObject emfObj = objectMap.get(eObj);
		if (emfObj != null) {
			// import non-containment references.
			for (EMFFeatureRef featureRef : emfObj.getFeatureRefs()) {
				EStructuralFeature eFeature = eObj.eClass()
						.getEStructuralFeature(featureRef.getFeatureName());
				if (eFeature instanceof EReference && 
						!((EReference) eFeature).isContainment()) {
					Object value = eObj.eGet(eFeature);
					List<EMFValue> values = new ArrayList<>();
					values.addAll(importCrossrefValues(value,
							(EReference) eFeature));
					featureRef.getValues().addAll(new UniqueEList<>(values));
					if (eFeature.isMany() && eFeature.isOrdered()) {
						featureRef.setValueOrdering(ListImportUtil
								.createLinearList(values));
					}
				}
			}
		}
	}

	/**
	 * Converts the externally represented value of an EMF non-containment link
	 * into its internal SuperMod representation.
	 *
	 * @param value the value that represents the corresponding single-valued
	 * 			or multi-valued link (EObject or EList).
	 * @param eReference the meta-data for the specified link.
	 * @return an internal SuperMod representation for the specified link
	 * 			value.
	 */
	private Collection<? extends EMFValue> importCrossrefValues(Object value,
			EReference eReference) {
		EList<EMFValue> emfValues = ECollections.newBasicEList();
		// multi-valued cross-reference.
		if (eReference.isMany()) {
			@SuppressWarnings("unchecked")
			EList<EObject> crossrefs = (EList<EObject>) value;
			for (EObject crossref : crossrefs) {
				emfValues.add(createEMFCrossrefTarget(crossref));
			}
		}
		// single-valued cross-reference.
		else if (value != null) {
			emfValues.add(createEMFCrossrefTarget((EObject) value));
		}
		return emfValues;
	}

	/**
	 * Converts a single EObject, which is referenced by a cross-link, into its
	 * corresponding internal SuperMod link representation.
	 *
	 * @param eObject
	 * @return the corresponding internal SuperMod representation, which may be
	 * 			internal (link to a versioned EMF object) or external (link to
	 * 			an unversioned object in the local workspace).
	 */
	private EMFValue createEMFCrossrefTarget(EObject eObject) {
		EMFObject emfObject = objectMap.get(eObject);
		if (emfObject != null) {
			// internal cross-reference.
			EMFInternalReferenceValue emfIrv = SuperModEMFFileFactory.eINSTANCE
					.createEMFInternalReferenceValue();
			emfIrv.setReferencedObject(emfObject);
			return emfIrv;
		}
		else {
			// external cross-reference.
			EMFExternalReferenceValue emfErv = SuperModEMFFileFactory.eINSTANCE
					.createEMFExternalReferenceValue();
			emfErv.setEObjectUri(EMFUtil.eObjectToUriString(eObject));
			return emfErv;
		}
	}

	/**
	 * @param eRes
	 * @return whether <code>eRes</code> assigns a UUID to each EObject.
	 */
	private boolean supportsUUIDs(Resource eRes) {
		return eRes instanceof XMLResource;
	}

	/**
	 * Sets the UUID of a specified internal EObject to a given value, which
	 * is obtained by converting the external UUID of its corresponding EObject
	 * into an external representation using the UUID converter.
	 *
	 * @param eRes the resource where the external UUID is assigned.
	 * @param eObj external object.
	 * @param emfObject internal object.
	 */
	private void setUUID(Resource eRes, EObject eObj, EMFObject emfObject) {
		String uuid = ((XMLResource) eRes).getID(eObj);
		if (uuid != null) {
			emfObject.setUuid(uuidConverter
					.convertExternalToInternalUUID(uuid));
		}
		else {
			setPseudoUUID(eRes, eObj, emfObject);
		}
	}

	/**
	 * Sets the UUID of a specified internal EObject to a "pseudo UUID",
	 * which combines the class name with the fragment of the object within the
	 * workspace resource.
	 *
	 * @param eRes
	 * @param eObj
	 * @param emfObject
	 */
	private void setPseudoUUID(Resource eRes, EObject eObj, EMFObject emfObject) {
		String pseudoUuid = eObj.eClass().getName() + "@" +
				eRes.getURIFragment(eObj);
		emfObject.setUuid(pseudoUuid);		
	}

}
