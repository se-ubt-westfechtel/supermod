/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.vcs.client.impl;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.ResourceSet;

import com.google.inject.Inject;
import com.google.inject.name.Named;

import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.mm.client.SingleVersionProductSpaceDescriptor;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.ProductSpace;
import de.ubt.ai1.supermod.mm.core.VersionSpace;
import de.ubt.ai1.supermod.mm.core.VisibilityForest;
import de.ubt.ai1.supermod.service.client.ILocalAmbitionInitializationService;
import de.ubt.ai1.supermod.service.client.ILocalChoiceInitializationService;
import de.ubt.ai1.supermod.service.client.ILocalRepositoryInitializationService;
import de.ubt.ai1.supermod.service.client.IMetadataResourceHandler;
import de.ubt.ai1.supermod.service.client.IProductSpaceInitializationService;
import de.ubt.ai1.supermod.service.client.ISingleVersionProductSpaceDescriptorInitializationService;
import de.ubt.ai1.supermod.service.client.IVersionSpaceInitializationService;
import de.ubt.ai1.supermod.service.client.IVisibilityForestInitializationService;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;
import de.ubt.ai1.supermod.vcs.client.IShareService;

/**
 * Default implementation of the VCS operation "Share". It initializes a local
 * repository and a meta-data area correspondingly, letting the user perform
 * an initial product space selection.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	04.08.2014
 */
public class ShareService implements IShareService {	
	
	@Inject
	private IMetadataResourceHandler metadataResourceHandler;
	
	@Inject
	private IVersionSpaceInitializationService vsInitializationService;
	
	@Inject
	private IProductSpaceInitializationService psInitializationService;

	@Inject
	private IVisibilityForestInitializationService vfInitializationService;
	
	@Inject
	private ISingleVersionProductSpaceDescriptorInitializationService 
	localProductDescriptorInitializationService;
	
	@Inject
	private ILocalChoiceInitializationService localChoiceInitializationService;
	
	@Inject
	private ILocalAmbitionInitializationService
	localAmbitionInitializationService;
	
	@Inject
	private ILocalRepositoryInitializationService
	localRepositoryInitializationService;
	
	@Inject
	@Named("de.ubt.ai1.supermod.module.injectorProvider.moduleId")
	private String moduleId;

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.vcs.IShareService#canShare(
	 * de.ubt.ai1.supermod.mm.client.SingleVersionProductSpaceDescriptor,
	 *  org.eclipse.emf.ecore.resource.ResourceSet)
	 */
	@Override
	public boolean canShare(String rootUri, ResourceSet rs) {
		try {
			return metadataResourceHandler.getRepository(
					rootUri, rs) == null;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.vcs.IShareService#share(
	 * de.ubt.ai1.supermod.mm.client.SingleVersionProductSpaceDescriptor,
	 *  org.eclipse.emf.ecore.resource.ResourceSet)
	 */
	@Override
	public LocalRepository share(String rootUri, ResourceSet rs,
			IProgressMonitor monitor) throws SuperModClientException {
		String repoUriStr = metadataResourceHandler.createRepositoryUri(
				rootUri);				
		VersionSpace vs = vsInitializationService
				.initializeVersionSpace(rs, repoUriStr);		
		VisibilityForest vf = vfInitializationService
				.initializeVisibilityForest(rs, repoUriStr);
		ProductSpace ps = psInitializationService
				.initializeProductSpace(rs, repoUriStr);
		SingleVersionProductSpaceDescriptor sv = 
				localProductDescriptorInitializationService
				.initializeSingleVersionProductSpaceDescriptor(
						rootUri, rs, true);
		OptionBinding lc = localChoiceInitializationService
				.initializeLocalChoice(vs, rs, repoUriStr);
		OptionBinding la = localAmbitionInitializationService
				.initializeLocalAmbition(vs, rs, repoUriStr);	
		LocalRepository repo = localRepositoryInitializationService
				.initializeLocalRepository(
						vs, ps, vf, sv, lc, la, rs, repoUriStr);
		repo.setModuleId(moduleId);
		return repo;
	}

}
