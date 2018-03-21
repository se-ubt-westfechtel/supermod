/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.vcs.server.util;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.inject.Injector;

import de.ubt.ai1.supermod.mm.core.Repository;
import de.ubt.ai1.supermod.module.server.ISuperModServerModuleRegistry;
import de.ubt.ai1.supermod.service.IRepositoryCloneService;
import de.ubt.ai1.supermod.service.IRepositoryProjectionService;
import de.ubt.ai1.util.emf.AI1ResourceSetEncoder;

/**
 * Utility class for the server-side VCS operation "pull".
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	16.10.2015
 */
public class PullUtil {

	/**
	 * Realizes the server component of a pull request. First, a copy of the
	 * entire repository, projected by the client transaction id, is created.
	 * Then, the projection is encoded into a string. Last, all temporary files
	 * are deleted.
	 *
	 * @param repoPath
	 * @param clientTransactionNr the client's read transaction number
	 * @return a string representation of the repository projection since the
	 * 		specified client transaction id.
	 * @throws IOException 
	 */
	public static String pullRepoChanges(String repoPath, 
			int clientTransactionNr) throws IOException {
		ResourceSet rs = SuperModEMFUtil.createResourceSet();
		Repository repo = RepoUtil.getRepository(repoPath, rs);
		
		// clone
		String clonePath = "pull/" + clientTransactionNr + "/";		
		String moduleId = ModuleIdUtil.getModuleId(repoPath);
		Injector inj = ISuperModServerModuleRegistry.INSTANCE.getModuleMap()
				.get(moduleId).getModuleInjector();
		IRepositoryCloneService cloner =
				inj.getInstance(IRepositoryCloneService.class);
		ResourceSet cloneRs = SuperModEMFUtil.createResourceSet();
		Repository clone = cloner.cloneRepository(repo, clonePath, cloneRs);
		
		// project
		IRepositoryProjectionService projector =
				inj.getInstance(IRepositoryProjectionService.class);
		projector.projectRepository(clone, TransactionUtil
				.getClosedTransactionsSince(repoPath, clientTransactionNr));		
		EcoreUtil.resolveAll(clone);
		
		// serialize
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		AI1ResourceSetEncoder.encodeResourceSet(URI.createFileURI(
				FileUtil.getWorkingFolder() + "/" + repoPath +  "/.supermod/" 
						+ clonePath), cloneRs, bos);
		String result = bos.toString();
		
		// clean up
		File pullFolder = new File(FileUtil.getWorkingFolder() + "/" +
				repoPath + "/.supermod/" + clonePath);
		FileUtil.deleteDirectoryAndContents(pullFolder);
		
		return result;
	}

}
