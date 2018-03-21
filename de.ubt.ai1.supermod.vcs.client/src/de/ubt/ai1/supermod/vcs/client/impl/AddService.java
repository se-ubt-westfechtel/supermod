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
import de.ubt.ai1.supermod.vcs.client.IAddService;

/**
 * Default implementation for the VCS operation "Add". Adding is realized by
 * means of an adequate {@link IFileVersioningHandler}.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	01.08.2014
 */
public class AddService implements IAddService {
	
	@Inject
	private IFileVersioningHandler resourceHandler;

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.vcs.IAddService#canAdd(
	 * de.ubt.ai1.supermod.mm.client.LocalRepository, java.lang.String)
	 */
	@Override
	public boolean canAdd(LocalRepository repo, String resourceUri) {
		return resourceHandler.isResponsibleFor(resourceUri, repo) &&
				!resourceHandler.isVersioned(resourceUri, repo);
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.vcs.IAddService#add(
	 * de.ubt.ai1.supermod.mm.client.LocalRepository, java.lang.String)
	 */
	@Override
	public void add(LocalRepository repo, String resourceUri) {
		resourceHandler.addToVersionControl(resourceUri, repo);
	}

}
