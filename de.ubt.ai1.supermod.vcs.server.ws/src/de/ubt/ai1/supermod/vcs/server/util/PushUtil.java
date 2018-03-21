/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.vcs.server.util;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import com.google.inject.Injector;

import de.ubt.ai1.supermod.mm.core.Repository;
import de.ubt.ai1.supermod.module.server.ISuperModServerModuleRegistry;
import de.ubt.ai1.supermod.service.IRepositoryMergeService;
import de.ubt.ai1.util.emf.AI1ResourceSetEncoder;

/**
 * Utility class for the server-side VCS operation "push".
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	16.10.2015
 */
public class PushUtil {

	/**
	 * Realizes the server component of a push request. First, the incoming
	 * changes, a projection of the client-side repository containing new
	 * contents, is decoded. Next, the projection is merged with the base
	 * repository. Then, the merged contents are persisted. Last, all temporary
	 * files are deleted.
	 *
	 * @param repoPath
	 * @param user
	 * @param repoChangesXmi
	 * @throws IOException 
	 */
	public static void pushRepoChanges(String repoPath, String user, 
			int clientTransactionNr, String repoChangesXmi) throws IOException {
		ResourceSet rs = SuperModEMFUtil.createResourceSet();
		Repository base = RepoUtil.getRepository(repoPath, rs);
		
		// serialize
		ByteArrayInputStream is = new ByteArrayInputStream(
				repoChangesXmi.getBytes());
		AI1ResourceSetEncoder.decodeResourceSet(URI.createFileURI(
				FileUtil.getWorkingFolder() + "/" + repoPath +
				"/.supermod/push/" + clientTransactionNr + "/"), rs, is);
		Repository other = RepoUtil.getRepository(repoPath, 
				"push/" + clientTransactionNr, rs);
		
		// merge
		String moduleId = ModuleIdUtil.getModuleId(repoPath);
		Injector inj = ISuperModServerModuleRegistry.INSTANCE.getModuleMap()
				.get(moduleId).getModuleInjector();
		IRepositoryMergeService merger = inj.getInstance(
				IRepositoryMergeService.class);
		merger.merge(base, other);
		
		// save
		for (Resource r : rs.getResources()) {
			r.save(null);
		}
		
		// clean up
		File pushFolder = new File(FileUtil.getWorkingFolder() + "/" +
				repoPath +	"/.supermod/push/" + clientTransactionNr);
		FileUtil.deleteDirectoryAndContents(pushFolder);				
	}

}
