/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.vcs.client.team.handlers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.service.client.IMetadataResourceHandler;
import de.ubt.ai1.supermod.vcs.client.IRemoveService;

/**
 * UI action for the local VCS operation "Remove".
 * 
 * @see IRemoveService
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	04.08.2014
 */
public class RemoveHandler extends SuperModCommandHandler {
	
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.vcs.client.team.handlers.SuperModCommandHandler
	 * #canRun(java.util.List)
	 */
	@Override
	protected boolean canRun(List<?> selection) {
		for (Object o : selection) {
			IResource res = adaptResource(o);
			if (res != null) {	
				try {
					ResourceSet rs = createResourceSet();
					String uri = res.getFullPath().toPortableString();
					IMetadataResourceHandler metadataHandler = 
							getServiceForResource(res, rs, 
									IMetadataResourceHandler.class);
					LocalRepository repo = metadataHandler.getRepository(uri, 
							rs);
					IRemoveService removeService = getServiceForResource(res, 
							rs, IRemoveService.class);
					if (removeService.canRemove(repo, uri)) {
						return true;
					}
				} catch (Exception e) {
					return false;
				}
			}
		}
		return false;
	}
	
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.vcs.team.actions.SuperModAction#run(
	 * java.util.List)
	 */
	@Override
	protected void run(List<?> selection) {
		List<String> notRemoved = new ArrayList<>();
		for (Object o : selection) {
			IResource res = adaptResource(o);
			if (res != null) {	
				try {
					ResourceSet rs = createResourceSet();
					String uri = res.getFullPath().toPortableString();
					IMetadataResourceHandler metadataHandler = 
							getServiceForResource(res, rs, 
									IMetadataResourceHandler.class);
					LocalRepository repo = metadataHandler.getRepository(uri, 
							rs);
					IRemoveService removeService = getServiceForResource(res, 
							rs, IRemoveService.class);
					if (removeService.canRemove(repo, uri)) {
						removeService.remove(repo, uri);
						saveAllResources(rs);
					}
					else {
						notRemoved.add(uri);
					}
				} catch (Exception e) {
					handle(e);
				}
			}
		}
		if (!notRemoved.isEmpty()) {
			warn("Some resources have not been removed.",
					"The following resources could not be removed from "
					+ "version control:\n"
					+ linewise(notRemoved));
		}
		refresh();
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.vcs.client.team.handlers.SuperModCommandHandler
	 * #getTaskDescription()
	 */
	@Override
	protected String getTaskDescription() {
		return "Removing resources from version control";
	}
	
}
