/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.generic.client.impl;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.mm.client.SingleVersionProductSpaceDescriptor;
import de.ubt.ai1.supermod.mm.client.SuperModClientFactory;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.ProductSpace;
import de.ubt.ai1.supermod.mm.core.VersionSpace;
import de.ubt.ai1.supermod.mm.core.VisibilityForest;
import de.ubt.ai1.supermod.service.client.ILocalRepositoryInitializationService;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientWrappedException;

/**
 * Generic implementation of the local repository initialization service, which
 * allocates a new EMF resource for the repository and connects its to the
 * specified components.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	31.07.2014
 */
public class GenericLocalRepositoryInitializationService 
implements ILocalRepositoryInitializationService {

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.
	 * ILocalRepositoryInitializationService#initializeLocalRepository(
	 * de.ubt.ai1.supermod.mm.core.VersionSpace, 
	 * de.ubt.ai1.supermod.mm.core.ProductSpace, 
	 * de.ubt.ai1.supermod.mm.client.SingleVersionProductSpaceDescriptor, 
	 * de.ubt.ai1.supermod.mm.core.OptionBinding, 
	 * org.eclipse.emf.ecore.resource.ResourceSet, java.lang.String)
	 */
	@Override
	public LocalRepository initializeLocalRepository(VersionSpace vs,
			ProductSpace ps, VisibilityForest vf,
			SingleVersionProductSpaceDescriptor psDescriptor,
			OptionBinding localChoice, OptionBinding localAmbition,
			ResourceSet rs, String repoUriStr) 
					throws SuperModClientException {
		URI repoUri = URI.createPlatformResourceURI(repoUriStr, true);
		Resource repoRes = rs.createResource(repoUri);		
		LocalRepository repo = SuperModClientFactory.eINSTANCE
				.createLocalRepository();
		repo.setVersionSpace(vs);
		repo.setProductSpace(ps);
		repo.setVisibilityForest(vf);
		repo.setLocalDescriptor(psDescriptor);
		repo.setLocalChoice(localChoice);	
		repo.setLocalAmbition(localAmbition);
		repo.setRemoteUser(System.getProperty("user.name"));
		repoRes.getContents().add(repo);	
		try {
			repoRes.save(null);
		} catch (IOException e) {
			throw new SuperModClientWrappedException(e);
		}
		return repo;
	}

}
