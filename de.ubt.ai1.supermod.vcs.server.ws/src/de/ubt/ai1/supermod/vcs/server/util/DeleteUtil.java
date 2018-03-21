/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.vcs.server.util;

import java.io.File;

/**
 * Auxiliary operations for deletion of repositories or contents thereof.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	16.10.2015
 */
public class DeleteUtil {

	/**
	 * Deletes a specific repository qualified by a relative path.
	 *
	 * @param repoPath the relative path to the repository
	 */
	public static void deleteRepo(String repoPath) {
		File repoFolder = new File(FileUtil.getWorkingFolder() +
				"/" + repoPath + "/.supermod");
		repoFolder.delete();
	}

}
