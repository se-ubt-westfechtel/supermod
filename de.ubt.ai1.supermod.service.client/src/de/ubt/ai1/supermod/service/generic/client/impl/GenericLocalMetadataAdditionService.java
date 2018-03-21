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

import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.mm.client.SuperModClientFactory;
import de.ubt.ai1.supermod.mm.core.ProductSpace;
import de.ubt.ai1.supermod.mm.core.Repository;
import de.ubt.ai1.supermod.mm.core.VersionSpace;
import de.ubt.ai1.supermod.mm.core.VisibilityForest;
import de.ubt.ai1.supermod.service.client.ILocalMetadataAdditionService;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientWrappedException;

/**
 * A default implementation of the local repository converter service.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	11.11.2015
 */
public class GenericLocalMetadataAdditionService 
implements ILocalMetadataAdditionService {

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.ILocalRepositoryConverter
	 * #convertRepositoryToLocalRepository
	 * (de.ubt.ai1.supermod.mm.core.Repository)
	 */
	@Override
	public LocalRepository convertRepositoryToLocalRepository(Repository repo)
			throws SuperModClientWrappedException {
		Resource repoRes = repo.eResource();

		ProductSpace ps = repo.getProductSpace();
		VersionSpace vs = repo.getVersionSpace();
		VisibilityForest vf = repo.getVisibilityForest();
		String moduleId = repo.getModuleId();
			
		repo.setVersionSpace(null);
		repo.setProductSpace(null);
		repo.setVisibilityForest(null);
		
		LocalRepository newRepo = SuperModClientFactory.eINSTANCE.
				createLocalRepository();
		newRepo.setVersionSpace(vs);
		newRepo.setProductSpace(ps);
		newRepo.setVisibilityForest(vf);
		newRepo.setModuleId(moduleId);
		
		repoRes.getContents().clear();
		repoRes.getContents().add(newRepo);
		try {
			repoRes.save(null);
		} catch (IOException e) {
			throw new SuperModClientWrappedException(e);
		}
		
		return newRepo;
	}

}
