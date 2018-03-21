/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.vcs.client;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.ResourceSet;

import com.google.inject.ImplementedBy;

import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;
import de.ubt.ai1.supermod.vcs.client.impl.ShareService;

/**
 * Interface for the VCS operation "Share", which adds version control to a
 * selected part of the workspace file system, typically an Eclipse project.
 * It creates a local SuperMod repository and all necessary meta-data.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	01.08.2014
 */
@ImplementedBy(ShareService.class)
public interface IShareService {

	/**
	 * Checks whether a part of the workspace may be shared using SuperMod
	 * version control.
	 *
	 * @param rootUri describes the root of the relevant workspace part
	 * @param rs the resource set to use for the workspace scan.
	 * @return whether the selected file system can be shared. Sharing is not
	 * 			possible in case there is already a SuperMod repository which
	 * 			versions the selected part of the workspace.
	 */
	public boolean canShare(String rootUri, ResourceSet rs);
	
	/**
	 * To be implemented in order to add SuperMod version control to the part
	 * of the workspace described by the specified root URI. Should allocate
	 * all resources necessary for versioning, i.e., a repository with a
	 * product and version space, and corresponding meta-data used for the
	 * mapping between repository and workspace.
	 *
	 * @param rootUri
	 * @param rs the resource set to use for all created SuperMod resources.
	 * @param monitor 
	 * @return the SuperMod repository that has been created.
	 * @throws SuperModClientException in case the share operation fails.
	 */
	public LocalRepository share(String rootUri, ResourceSet rs, 
			IProgressMonitor monitor) throws SuperModClientException;
	
}
