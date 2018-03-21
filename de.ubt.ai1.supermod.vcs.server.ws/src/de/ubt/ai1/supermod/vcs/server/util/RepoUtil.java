/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.vcs.server.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import de.ubt.ai1.supermod.mm.core.Repository;

/**
 * Utility methods for handling server-side repositories.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	29.10.2015
 */
public class RepoUtil {

	/**
	 * retrieves a repository found under a root repository path and stores it
	 * in a specified resource set.
	 *
	 * @param repoPath
	 * @param rs
	 * @return
	 */
	public static Repository getRepository(String repoPath, ResourceSet rs) {
		return getRepository(repoPath, "main", rs);
	}
	
	/**
	 * retrieves a temporary copy of the main repository found under a root 
	 * repository path and stores it in a specified resource set.
	 *
	 * @param repoPath
	 * @param copyPath
	 * @param rs
	 * @return
	 */
	public static Repository getRepository(String repoPath, String copyPath,
			ResourceSet rs) {
		URI repoUri = URI.createFileURI(FileUtil.getWorkingFolder() + "/" +
			repoPath + "/.supermod/" + copyPath + "/main.rep");
		Resource res = rs.getResource(repoUri, true);
		return (Repository) res.getContents().get(0);
	}

}
