/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.generic.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.ubt.ai1.supermod.mm.core.Repository;
import de.ubt.ai1.supermod.service.IRepositoryCloneService;

/**
 * A generic implementation of the repository clone service interface.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	20.10.2015
 */
public class GenericRepositoryCloneService implements IRepositoryCloneService {

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.IRepositoryCloneService
	 * #cloneRepository(de.ubt.ai1.supermod.mm.core.Repository,
	 * java.lang.String, org.eclipse.emf.ecore.resource.ResourceSet)
	 */
	@Override
	public Repository cloneRepository(Repository original, 
				String relativeClonePath, ResourceSet rs) throws IOException {
		EcoreUtil.resolveAll(original.eResource().getResourceSet());
		URI origUri = original.eResource().getURI().trimSegments(1);
		URI cloneUri = origUri.trimSegments(1);
		for (String seg : relativeClonePath.split("/")) {
			cloneUri = cloneUri.appendSegment(seg);
		}
		copyResourceSet(original.eResource().getResourceSet(), rs,
				origUri.appendSegment(""), cloneUri.appendSegment(""));
		Resource cloneRes = rs.getResource(
				cloneUri.appendSegment("main.rep"), true);
		return (Repository) cloneRes.getContents().get(0);
	}

	/**
	 * Auxiliary method to copy an entire resource set.
	 *
	 * @param cloneRs
	 * @param origUri
	 * @param cloneUri
	 * @throws IOException 
	 */
	private void copyResourceSet(ResourceSet origRs, ResourceSet cloneRs, 
			URI origUri, URI cloneUri) throws IOException {
		EcoreUtil.Copier copier = new EcoreUtil.Copier();
		List<Resource> clonedResources = new ArrayList<>();
		for (Resource origRes : new BasicEList<>(origRs.getResources())) {
			URI relativeUri = origRes.getURI().deresolve(origUri);
			URI cloneResUri = relativeUri.resolve(cloneUri);
			Resource cloneRes = cloneRs.createResource(cloneResUri);
			for (EObject content : origRes.getContents()) {
				cloneRes.getContents().add(copier.copy(content));
			}
			cloneRes.save(null);
			clonedResources.add(cloneRes);
		}
		copier.copyReferences();		
		if (origRs != cloneRs) {
			cloneRs.getResources().removeAll(origRs.getResources());
		}
		for (Resource res : clonedResources) {
			res.save(null);
		}
	}

}
