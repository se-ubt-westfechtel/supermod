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
import de.ubt.ai1.supermod.mm.core.VersionSpace;
import de.ubt.ai1.supermod.service.client.IMetadataResourceHandler;
import de.ubt.ai1.supermod.service.client.IVersionSpaceEditingService;

/**
 * UI action for editing the local version space of a selected SuperMod project.
 * 
 * @see IVersionSpaceEditingService
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	04.08.2014
 */
public class EditVersionSpaceHandler extends SuperModCommandHandler {
	
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
				VersionSpace vs = repo.getVersionSpace();
				IVersionSpaceEditingService editingService = 
						getServiceForResource(p, rs, 
								IVersionSpaceEditingService.class);
				if (editingService.isEditable(vs)) {
					return true;
				}
			} catch (Exception e) {
				return false;
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
		for (IProject p : findRelevantProjects(selection)) {
			try {
				ResourceSet rs = createResourceSet();
				String uri = p.getFullPath().toPortableString();
				IMetadataResourceHandler metadataHandler = 
						getServiceForResource(p, rs, 
								IMetadataResourceHandler.class);
				LocalRepository repo = metadataHandler.getRepository(uri, rs);
				VersionSpace vs = repo.getVersionSpace();
				IVersionSpaceEditingService editingService = 
						getServiceForResource(p, rs, 
								IVersionSpaceEditingService.class);
				if (editingService.isEditable(vs)) {
					editingService.openEditor(vs);
				}
			} catch (Exception e) {
				handle(e);
			}
		}	
		refresh();
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.vcs.client.team.handlers.SuperModCommandHandler#
	 * getTaskDescription()
	 */
	@Override
	protected String getTaskDescription() {
		return "Editing Version Space";
	}

}
