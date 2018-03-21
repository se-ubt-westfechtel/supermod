/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.vcs.server.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Utility class to work with server-side repository files.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	15.10.2015
 */
public class FileUtil {

	/**
	 * @return the root folder for SuperMod's working files
	 */
	public static String getWorkingFolder() {
		if (System.getProperty("supermod.home") != null) {
			return System.getProperty("supermod.home");
		}
		else if (System.getProperty("catalina.base") != null) {
			return System.getProperty("catalina.base") + "/work/supermod";
		}
		else if (System.getProperty("catalina.home") != null) {
			return System.getProperty("catalina.home") + "/work/supermod";
		}
		return "";
	}

	/**
	 * Creates a specified file and all parent directories.
	 *
	 * @param file
	 * @throws IOException 
	 */
	public static void createFileAndDirectories(File file) throws IOException {
		if (!file.exists()) {
			if (!file.getParentFile().exists()) {
				file.getParentFile().mkdirs();
			}
			file.createNewFile();
		}
	}
	
	/**
	 * Deletes a specified directory including all of its contents
	 *
	 * @param dir
	 */
	public static boolean deleteDirectoryAndContents(File dir) {
		if (dir.isDirectory()) {
			for (File content : dir.listFiles()) {
				deleteDirectoryAndContents(content);
			}
		}
		return dir.delete();
	}

	/**
	 * Sets the content of a file to a specified string value.
	 *
	 * @param file
	 * @param string
	 * @throws IOException 
	 */
	public static boolean setContent(File file, String string) 
			throws IOException {
		if (file == null || string == null || !file.exists()) {
			return false;
		}
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter(file));
			bw.append(string);
			return true;
		}
		finally {
			if (bw != null) {
				bw.close();
			}
		}
	}

	/**
	 * returns the content of a file as a single string value.
	 *
	 * @param file
	 * @return file content as string.
	 * @throws IOException 
	 */
	public static String getContent(File file) throws IOException {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
			StringBuilder sb = new StringBuilder();
			while (br.ready()) {
				sb.append(br.readLine());
				if (br.ready()) {
					sb.append("\n");
				}
			}
			return sb.toString();
		}
		finally {
			if (br != null) {
				br.close();
			}
		}
	}

}
