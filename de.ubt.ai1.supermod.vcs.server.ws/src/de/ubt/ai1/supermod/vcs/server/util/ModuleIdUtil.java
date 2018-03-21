/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.vcs.server.util;

import org.eclipse.emf.ecore.resource.ResourceSet;

import de.ubt.ai1.supermod.mm.core.Repository;
import de.ubt.ai1.supermod.module.server.ISuperModServerModuleRegistry;

/**
 * Utility class that provides operations dealing with module id's of
 * repositories, which decide which concrete implementations to use for specific
 * high-level operations. The module id for a repository is stored in the
 * meta-data section in "main.repo".
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	16.10.2015
 */
public class ModuleIdUtil {

	/**
	 * @param moduleId
	 * @return if the current server configuration is compatible with the
	 * 			specified module
	 */
	public static boolean isModuleDefined(String moduleId) {
		return moduleId != null &&
				ISuperModServerModuleRegistry.INSTANCE.getModuleMap()
						.containsKey(moduleId);
	}

	/**
	 * Returns the module id belonging to a specific repository available under
	 * a given repository path
	 *
	 * @param repoPath
	 * @return the module id used by the repository, or <code>null</code> if
	 * 			no such repository
	 */
	public static String getModuleId(String repoPath) {
		ResourceSet rs = SuperModEMFUtil.createResourceSet();
		Repository repo = RepoUtil.getRepository(repoPath, rs);
		return repo.getModuleId();
	}

}
