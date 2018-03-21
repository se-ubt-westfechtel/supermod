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

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.resource.ResourceSet;

import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.service.client.IMetadataResourceHandler;
import de.ubt.ai1.supermod.vcs.client.ICommitService;
import de.ubt.ai1.supermod.vcs.client.IScopeAndSwitchService;

/**
 * UI action for the local VCS operation "Scope and Switch".
 * 
 * @see ICommitService
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	04.08.2014
 */
public class ScopeAndSwitchHandler extends SuperModCommandHandler {

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
				IScopeAndSwitchService scopeAndSwitchService = 
						getServiceForResource(p, rs, IScopeAndSwitchService.class);
				if (scopeAndSwitchService.canScopeAndSwitch(repo)) {
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
		List<String> notProcessed = new ArrayList<>();
		for (IProject p : findRelevantProjects(selection)) {
			try {
				ResourceSet rs = createResourceSet();
				String uri = p.getFullPath().toPortableString();
				IMetadataResourceHandler metadataHandler = 
						getServiceForResource(p, rs, 
								IMetadataResourceHandler.class);
				LocalRepository repo = metadataHandler.getRepository(uri, rs);
				IScopeAndSwitchService scopeAndSwitchService = 
						getServiceForResource(p, rs, IScopeAndSwitchService.class);
				if (scopeAndSwitchService.canScopeAndSwitch(repo)) {
					if (scopeAndSwitchService.scopeAndSwitch(repo, rs)) {
						saveAllResources(rs);
					}
					else {
						notProcessed.add(uri);
					}
				}
				else {
					notProcessed.add(uri);
				}				
			} catch (Exception e) {
				handle(e);
			}
		}
		if (!notProcessed.isEmpty()) {
			warn("Some resources have not been scoped/checked-out.",
					"The following resources could not be scoped/checked-out:\n"
					+ linewise(notProcessed));
		}
		refresh();
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.vcs.client.team.handlers.SuperModCommandHandler
	 * #getTaskDescription()
	 */
	@Override
	protected String getTaskDescription() {
		return "Scoping and Switching";
	}


}
