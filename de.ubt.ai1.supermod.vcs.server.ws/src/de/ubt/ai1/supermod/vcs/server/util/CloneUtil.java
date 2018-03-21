/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.vcs.server.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.ubt.ai1.util.emf.AI1ResourceSetEncoder;

/**
 * Utility class for the server-side VCS operation "clone".
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	16.10.2015
 */
public class CloneUtil {

	/**
	 * returns the text encoding of the server-side repository found under
	 * the specified repository path.
	 *
	 * @param repoPath
	 * @return
	 * @throws IOException 
	 */
	public static String cloneRepo(String repoPath) throws IOException {
		ResourceSet rs = SuperModEMFUtil.createResourceSet();
		RepoUtil.getRepository(repoPath, rs);
		EcoreUtil.resolveAll(rs);
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		AI1ResourceSetEncoder.encodeResourceSet(URI.createFileURI(
				FileUtil.getWorkingFolder() + "/" + repoPath + 
				"/.supermod/main/"), rs, bos);
		return bos.toString();
	}

}
