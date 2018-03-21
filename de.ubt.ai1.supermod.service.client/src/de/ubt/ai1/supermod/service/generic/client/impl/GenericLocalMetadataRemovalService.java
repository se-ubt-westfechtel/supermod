/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.generic.client.impl;

import java.io.IOException;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.mm.client.SingleVersionProductDimensionDescriptor;
import de.ubt.ai1.supermod.mm.core.ProductSpace;
import de.ubt.ai1.supermod.mm.core.Repository;
import de.ubt.ai1.supermod.mm.core.SuperModCoreFactory;
import de.ubt.ai1.supermod.mm.core.VersionSpace;
import de.ubt.ai1.supermod.mm.core.VisibilityForest;
import de.ubt.ai1.supermod.service.client.ILocalMetadataRemovalService;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientWrappedException;

/**
 * A generic implementation of the meta-data removal service interface. It
 * removes local choices, ambitions, and descriptors including their eResources.
 * All available details of the repository are copied to the returned instance.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	20.10.2015
 */
public class GenericLocalMetadataRemovalService 
implements ILocalMetadataRemovalService {

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.ILocalMetadataRemovalService
	 * #removeMetadata(de.ubt.ai1.supermod.mm.client.LocalRepository)
	 */
	@Override
	public Repository removeMetadata(LocalRepository localRepo)
			throws SuperModClientWrappedException {
		Resource repoRes = localRepo.eResource();
		ResourceSet rs = repoRes.getResourceSet();

		ProductSpace ps = localRepo.getProductSpace();
		VersionSpace vs = localRepo.getVersionSpace();
		VisibilityForest vf = localRepo.getVisibilityForest();
		String moduleId = localRepo.getModuleId();
		
		if (localRepo.getLocalAmbition() != null) {
			Resource ambRes = localRepo.getLocalAmbition().eResource();
			if (ambRes != null) {
				try {
					ambRes.delete(null);
				} catch (IOException e) {
					throw new SuperModClientWrappedException(e);
				}
			}
			localRepo.setLocalAmbition(null);
		}
		
		if (localRepo.getLocalChoice() != null) {
			Resource choiceRes = localRepo.getLocalChoice().eResource();
			if (choiceRes != null) {
				try {
					choiceRes.delete(null);
				} catch (IOException e) {
					throw new SuperModClientWrappedException(e);
				}
			}
			localRepo.setLocalChoice(null);
		}
		
		if (localRepo.getLocalDescriptor() != null) {
			for (SingleVersionProductDimensionDescriptor desc : 
					localRepo.getLocalDescriptor().getDimensionDescriptors()) {
				Resource descRes = desc.eResource();
				if (descRes != null) {
					try {
						descRes.delete(null);
					} catch (IOException e) {
						throw new SuperModClientWrappedException(e);
					}
				}
			}
			localRepo.getLocalDescriptor().getDimensionDescriptors().clear();
			localRepo.setLocalDescriptor(null);
		}
		
		localRepo.setVersionSpace(null);
		localRepo.setProductSpace(null);
		localRepo.setVisibilityForest(null);
		
		Repository newRepo = SuperModCoreFactory.eINSTANCE.createRepository();
		newRepo.setVersionSpace(vs);
		newRepo.setProductSpace(ps);
		newRepo.setVisibilityForest(vf);
		newRepo.setModuleId(moduleId);
		
		repoRes.getContents().clear();
		repoRes.getContents().add(newRepo);
		
		try {
			for (Resource res : rs.getResources()) {
				res.save(null);
			}
		} catch (IOException e) {
			throw new SuperModClientWrappedException(e);
		}
		
		return newRepo;
	}

}
