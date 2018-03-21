/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.vcs.client.team.handlers;

import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.resource.ResourceSet;

import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.service.client.IMetadataResourceHandler;
import de.ubt.ai1.supermod.vcs.client.IRemotePropertiesService;

/**
 * UI action for the VCS operation "Edit Remote Repository Properties".
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	09.11.2015
 */
public class RemotePropertiesHandler extends SuperModCommandHandler {
	
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.vcs.client.team.handlers.SuperModCommandHandler
	 * #canRun(java.util.List)
	 */
	@Override
	protected boolean canRun(List<?> selection) {
		for (IProject p : findRelevantProjects(selection)) {
			try {
				ResourceSet rs = createResourceSet();
				String uri = p.getFullPath().toPortableString();
				IMetadataResourceHandler metadataHandler = 
						getServiceForResource(p, rs, 
								IMetadataResourceHandler.class);
				LocalRepository repo = metadataHandler.getRepository(uri, rs);
				IRemotePropertiesService remoteService = 
						getServiceForResource(p, rs, 
								IRemotePropertiesService.class);
				if (remoteService.canShowRemoteProperties(repo)) {
					return true;
				}
			} catch (Exception e) {
				return false;
			}
		}
		return false;
	}	

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.vcs.client.team.handlers.SuperModCommandHandler
	 * #run(java.util.List)
	 */
	@Override
	protected void run(List<?> selection) {
		for (IProject p : findRelevantProjects(selection)) {
			try {
				ResourceSet rs = createResourceSet();
				String uri = p.getFullPath().toPortableString();
				IMetadataResourceHandler metadataHandler = 
						getServiceForResource(p, rs, 
								IMetadataResourceHandler.class);
				LocalRepository repo = metadataHandler.getRepository(uri, rs);
				IRemotePropertiesService remoteService = 
						getServiceForResource(p, rs, 
								IRemotePropertiesService.class);
				if (remoteService.canShowRemoteProperties(repo)) {
					remoteService.showRemoteProperties(repo);
				}
			} catch (Exception e) {
				handle(e);
			}
		}
		refresh();
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.vcs.client.team.handlers.SuperModCommandHandler
	 * #getTaskDescription()
	 */
	@Override
	protected String getTaskDescription() {
		return "Requesting Remote Properties";
	}

}
