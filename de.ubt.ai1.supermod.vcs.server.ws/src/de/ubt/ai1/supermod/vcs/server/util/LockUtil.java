/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.vcs.server.util;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * Utility class that provides operations dealing with locking and unlocking
 * repositories. A repository is locked and unlocked using a file ".lock" in
 * the root of the repository path. In case the file exists, the repository is
 * locked by a running transaction.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	15.10.2015
 */
public class LockUtil {
	
	/**
	 * @param repositoryRoot
	 * @return the contents of the log file for the repository root
	 * @throws IOException 
	 */
	public static String getLockInfo(String repositoryRoot) throws IOException {
		File lockFile = new File(FileUtil.getWorkingFolder() + "/" +
				repositoryRoot + "/.supermod/.lock");
		if (!lockFile.exists()) {
			return null;
		}
		return FileUtil.getContent(lockFile);
	}
	
	/**
	 * @param repositoryRoot
	 * @return whether the repository root is locked
	 * @throws IOException 
	 */
	public static boolean isLocked(String repositoryRoot) throws IOException {
		return getLockInfo(repositoryRoot) != null;
	}
	
	/**
	 * @param repositoryRoot
	 * @return the user who locks the repository root
	 * @throws IOException 
	 */
	public static String getLockUser(String repositoryRoot) throws IOException {
		String lockInfo = getLockInfo(repositoryRoot);
		if (lockInfo != null) {
			return lockInfo.substring(0, lockInfo.indexOf(";"));
		}
		return null;
	}	

	/**
	 * @param repositoryRoot
	 * @return date when the repository root was locked
	 * @throws IOException 
	 */
	public static String getLockDate(String repositoryRoot) throws IOException {
		String lockInfo = getLockInfo(repositoryRoot);
		if (lockInfo != null) {
			return lockInfo.substring(lockInfo.indexOf(";") + 1,
					lockInfo.length());
		}
		return null;
	}	
	
	
	/**
	 * Tries to lock the repository root by the user.
	 * 
	 * @param repositoryRoot
	 * @param user
	 * @return whether locking was successful
	 * @throws IOException
	 */
	public static boolean lock(String repositoryRoot, String user)
			throws IOException {
		File lockFile = new File(FileUtil.getWorkingFolder() + "/" +
				repositoryRoot + "/.supermod/.lock");
		if (!lockFile.exists()) {
			FileUtil.createFileAndDirectories(lockFile);
			FileUtil.setContent(lockFile, user + ";" + new Date().toString());
			return true;
		}
		return false;
	}
	
	/**
	 * Tries to lock the repository root by the user.
	 *
	 * @param repositoryRoot
	 * @param user
	 * @param force allow unlock even in case user is different from the
	 * 			locking user
	 * @return whether unlocking was successful
	 * @throws IOException 
	 */
	public static boolean unlock(String repositoryRoot, String user, 
			boolean force) throws IOException {
		String lockUser = getLockUser(repositoryRoot);
		if (lockUser != null && (force || lockUser.equals(user))) {
			File lockFile = new File(FileUtil.getWorkingFolder() + "/" +
					repositoryRoot + "/.supermod/.lock");
			lockFile.delete();
			return true;
		}
		return false;
	}

}
