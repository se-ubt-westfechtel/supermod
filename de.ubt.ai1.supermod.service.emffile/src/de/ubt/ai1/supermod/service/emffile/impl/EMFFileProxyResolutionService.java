/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.emffile.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import de.ubt.ai1.supermod.mm.core.ProductDimension;
import de.ubt.ai1.supermod.mm.core.ProductSpaceElement;
import de.ubt.ai1.supermod.mm.emffile.EMFClassRef;
import de.ubt.ai1.supermod.mm.emffile.EMFContainmentReferenceValue;
import de.ubt.ai1.supermod.mm.emffile.EMFFeatureRef;
import de.ubt.ai1.supermod.mm.emffile.EMFFileContent;
import de.ubt.ai1.supermod.mm.emffile.EMFInternalReferenceValue;
import de.ubt.ai1.supermod.mm.emffile.EMFObject;
import de.ubt.ai1.supermod.mm.emffile.EMFValue;
import de.ubt.ai1.supermod.mm.emffile.SuperModEMFFileFactory;
import de.ubt.ai1.supermod.mm.file.VersionedFile;
import de.ubt.ai1.supermod.mm.file.VersionedFileSystem;
import de.ubt.ai1.supermod.mm.file.VersionedResource;
import de.ubt.ai1.supermod.mm.list.VersionedListVertex;
import de.ubt.ai1.supermod.service.IProductDimensionProxyResolutionService;

/**
 * EMF specific implementation of the product dimension proxy resolution
 * service interface. It traverses a multi-resource EMF model two times: First, 
 * it caches all reference proxies. Second, it finds object that share one of 
 * the proxies' UUID and then resolves the proxies by replacing them with a 
 * corresponding internal reference to the identified object.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	30.07.2014
 */
public class EMFFileProxyResolutionService 
implements IProductDimensionProxyResolutionService {
		
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.emffile.IProxyResolutionService
	 * #resolveProxies(de.ubt.ai1.supermod.mm.core.ProductDimension)
	 */
	@Override
	public void resolveProxies(ProductDimension productDimension) {
		if (productDimension instanceof VersionedFileSystem) {
			Map<String, List<ProductSpaceElement>> proxies = findProxiedUuids(
					(VersionedFileSystem) productDimension);
			Map<String, EMFObject> objects = findObjects(
					(VersionedFileSystem) productDimension, proxies.keySet());
			resolveProxies(proxies, objects);
		}
	}

	/**
	 * Identifies proxies within a given EMF model and caches the proxy under
	 * the UUID of the object it implicitly refers to.
	 *
	 * @param vfs
	 * @return a map that contains a list of product space elements, which
	 * 			represent different kinds of proxies, under a given UUID.
	 */
	private Map<String, List<ProductSpaceElement>> findProxiedUuids(
			VersionedFileSystem vfs) {
		Map<String, List<ProductSpaceElement>> proxies = new HashMap<>();
		for (VersionedResource vr : vfs.getAllResources()) {
			if (vr instanceof VersionedFile && 
					((VersionedFile) vr).getContent() 
					instanceof EMFFileContent) {
				EMFFileContent content = (EMFFileContent) 
						((VersionedFile) vr).getContent();			
				for (EMFObject obj : content.getObjects()) {
					for (EMFClassRef classRef : obj.getClassRefs()) {
						if (classRef.isProxy()) {
							String uuid = classRef.getProxyUUID();
							if (!proxies.containsKey(uuid)) {
								List<ProductSpaceElement> proxyList = 
										new ArrayList<>();
								proxies.put(uuid, proxyList);
							}
							proxies.get(uuid).add(classRef);
						}
					}
					for (EMFFeatureRef featRef : obj.getFeatureRefs()) {
						if (featRef.isProxy()) {
							String uuid = featRef.getProxyUUID();
							if (!proxies.containsKey(uuid)) {
								List<ProductSpaceElement> proxyList =
										new ArrayList<>();
								proxies.put(uuid, proxyList);
							}
							proxies.get(uuid).add(featRef);
						}
						for (EMFValue val : featRef.getValues()) {
							if (val.isProxy()) {
								String uuid = val.getProxyUUID();
								if (!proxies.containsKey(uuid)) {
									List<ProductSpaceElement> proxyList = 
											new ArrayList<>();
									proxies.put(uuid, proxyList);
								}
								proxies.get(uuid).add(val);
							}
						}
					}
				} 
			}
		}
		return proxies;
	}	

	/**
	 * Traverses the specified versioned file system and finds all EMF objects
	 * which match any of the specified UUIDs
	 *
	 * @param vfs
	 * @param uuids
	 * @return a mapping between the specified UUIDs and EMF object inside the
	 * 			specified versioned file system that carry the UUID.
	 */
	private Map<String, EMFObject> findObjects(
			VersionedFileSystem vfs, Set<String> uuids) {
		Map<String, EMFObject> objectMap = new HashMap<>();
		for (VersionedResource vr : vfs.getAllResources()) {
			if (vr instanceof VersionedFile && 
					((VersionedFile) vr).getContent() 
					instanceof EMFFileContent) {
				EMFFileContent content = (EMFFileContent) 
						((VersionedFile) vr).getContent();			
				for (EMFObject obj : content.getObjects()) {
					if (uuids.contains(obj.getUuid())) {
						objectMap.put(obj.getUuid(), obj);
					}
				}
			}
		}
		return objectMap;
	}
	

	/**
	 * Resolves identified proxies, which must be specified in the map
	 * <code>proxies</code>, with specific internal references to EMF objects,
	 * which are specified in the map <code>objects/<code>. Depending on the
	 * type of proxy, it is resolved by replacing it with specialized kinds
	 * of internal references.
	 *
	 * @param proxies maps identified proxies under their UUID.
	 * @param objects maps corresponding EMF objects under their UUID.
	 */
	private void resolveProxies(
			Map<String, List<ProductSpaceElement>> proxies,
			Map<String, EMFObject> objects) {
		for (Map.Entry<String, List<ProductSpaceElement>> e : 
				proxies.entrySet()) {
			if (objects.containsKey(e.getKey())) {
				EMFObject obj = objects.get(e.getKey());
				for (ProductSpaceElement proxy : e.getValue()) {
					if (proxy instanceof EMFInternalReferenceValue &&
							proxy.eContainer() instanceof EMFFeatureRef) {
						// internal cross-reference proxies
						EMFFeatureRef featureRef = (EMFFeatureRef) 
								proxy.eContainer();
						int index = featureRef.getValues().indexOf(proxy);
						EMFInternalReferenceValue value = 
								proxy instanceof EMFContainmentReferenceValue ?
								SuperModEMFFileFactory.eINSTANCE
										.createEMFContainmentReferenceValue() :
								SuperModEMFFileFactory.eINSTANCE
										.createEMFInternalReferenceValue();	
						value.setReferencedObject(obj);
						featureRef.getValues().remove(index);
						featureRef.getValues().add(index, value);
						// applied occurrences within the value order.
						if (featureRef.getValueOrdering() != null) {
							for (VersionedListVertex vertex : featureRef
									.getValueOrdering().getVertices()) {
								if (vertex.getElement() == proxy) {
									vertex.setElement(value);
								}
							}
						}
						// the transaction id must be
						// transferred. If available, the internal reference the
						// proxy has been resolved by must carry the same
						// visibility as the proxy did.
						value.setTransactionId(proxy.getTransactionId());
						proxy.setTransactionId(0);
						if (proxy.getVisibility() != null) {							
							value.setVisibility(proxy.getVisibility());	
							proxy.setVisibility(null);
						}
					}
				}
			}
		}
	}

}
