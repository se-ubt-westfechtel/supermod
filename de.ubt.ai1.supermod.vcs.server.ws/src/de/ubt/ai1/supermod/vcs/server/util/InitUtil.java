/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.vcs.server.util;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;

import de.ubt.ai1.util.emf.AI1ResourceSetEncoder;

/**
 * Utility class for the server-side VCS operation "init".
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	16.10.2015
 */
public class InitUtil {

	/**
	 * takes as input a text encoding the initial contents to be versioned
	 * under a new server-side repository to create at a given repository path.
	 *
	 * @param repoPath
	 * @param moduleId
	 * @param user
	 * @param repoContentXmi 
	 * @throws IOException 
	 */
	public static void initRepo(String repoPath, String moduleId, String user,
			String repoContentXmi) throws IOException {
		ResourceSet rs = SuperModEMFUtil.createResourceSet();
		ByteArrayInputStream is = new ByteArrayInputStream(
				repoContentXmi.getBytes());
		AI1ResourceSetEncoder.decodeResourceSet(URI.createFileURI(
				FileUtil.getWorkingFolder() + "/" + repoPath +
				"/.supermod/main/"), rs, is);		
	}

}
