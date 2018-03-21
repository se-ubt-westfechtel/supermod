/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.vcs.client.impl;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.service.file.client.IFileVersioningHandler;
import de.ubt.ai1.supermod.vcs.client.IRemoveService;

/**
 * Default implementation for the VCS operation "Remove". Removing is realized
 * by means of an adequate {@link IFileVersioningHandler}.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	01.08.2014
 */
public class RemoveService implements IRemoveService {
	
	@Inject
	private IFileVersioningHandler resourceHandler;

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.vcs.IRemoveService#canRemove(
	 * de.ubt.ai1.supermod.mm.client.LocalRepository, java.lang.String)
	 */
	@Override
	public boolean canRemove(LocalRepository repo, String fileUri) {
		return resourceHandler.isResponsibleFor(fileUri, repo);
		// return resourceHandler.isVersioned(fileUri, repo);
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.vcs.IRemoveService#remove(
	 * de.ubt.ai1.supermod.mm.client.LocalRepository, java.lang.String)
	 */
	@Override
	public void remove(LocalRepository repo, String fileUri) {
		resourceHandler.removeFromVersionControl(fileUri, repo);
	}

}
