/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.vcs.server.util;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Utility operations for browsing for repositories in the server's working
 * directory for SuperMod.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	16.10.2015
 */
public class BrowseUtil {

	/**
	 * @param repoPath
	 * @return whether a repository exists in the specified path.
	 */
	public static boolean existsRepo(String repoPath) {
		File supermodFolder = new File(FileUtil.getWorkingFolder() + "/" 
				+ repoPath + "/.supermod/main");
		if (supermodFolder.exists() && supermodFolder.isDirectory()) {
			return true;
		}
		return false;
	}

	/**
	 * @return all available repository paths on this server.
	 */
	public static List<String> getAllRepoPaths() {
		File root = new File(FileUtil.getWorkingFolder());
		return getRepoPathsRec(root, "");
	}

	/**
	 * Recursive auxiliary operation to find all repository paths within the
	 * specified folder.
	 *
	 * @param root
	 * @return the found paths as list of strings
	 */
	private static List<String> getRepoPathsRec(File folder, String root) {
		List<String> repoPaths = new ArrayList<String>();
		File supermodFolder = new File(folder + "/.supermod/main");
		if (supermodFolder.exists() && supermodFolder.isDirectory()) {
			repoPaths.add(root + "/" + folder.getName());
		}
		else {
			for (File file : folder.listFiles()) {
				if (file.isDirectory()) {
					repoPaths.addAll(getRepoPathsRec(file, 
							root + "/" + file.getName()));
				}
			}
		}
		return repoPaths;
	}

}
