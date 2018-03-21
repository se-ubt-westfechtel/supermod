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
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Utility methods for the organization of the current transaction number.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	16.10.2015
 */
public class TransactionUtil {

	/**
	 * Obtains the current read transaction ID, i.e., the transaction that was
	 * most recently closed, from the transaction file. It does not necessarily
	 * correspond to the numerically highest transaction id closed.
	 *
	 * @param repoPath
	 * @return the current read transaction number, or -1 if no transaction
	 * 		has been closed yet
	 * @throws IOException 
	 */
	public static int getReadTransactionNr(String repositoryRoot)
			throws IOException {
		BufferedReader br = getTransactionFileReader(repositoryRoot);
		int readTid = -1;
		while (br.ready()) {
			String line = br.readLine();
			if (line.startsWith("c")) {
				readTid = Integer.parseInt(line.substring(1));
			}
		}
		br.close();
		return readTid;
	}
	
	/**
	 * Obtains the current write transaction ID, i.e., the transaction that was
	 * most recently opened, from the transaction file. It necessarily
	 * corresponds to the numerically highest transaction id opened.
	 *
	 * @param repoPath
	 * @return the current write transaction number, or -1 if no transaction
	 * 		has been closed yet
	 * @throws IOException 
	 */
	public static int getWriteTransactionNr(String repositoryRoot)
			throws IOException {
		BufferedReader br = getTransactionFileReader(repositoryRoot);
		int writeTid = -1;
		while (br.ready()) {
			String line = br.readLine();
			if (line.startsWith("o")) {
				writeTid = Integer.parseInt(line.substring(1));
			}
		}
		br.close();
		return writeTid;
	}
	
	/**
	 * Obtains an ordered set of transactions which have been closed since the
	 * closing of a specified transaction.
	 *
	 * @param repoPath
	 * @param tid the transaction in question, or -1 if all transactions are to
	 * 			 be listed.
	 * @return the result set
	 * @throws IOException
	 */
	public static Set<Integer> getClosedTransactionsSince(String repoPath,
			int tid) throws IOException {
		BufferedReader br = getTransactionFileReader(repoPath);
		Set<Integer> tids = new LinkedHashSet<Integer>();
		boolean active = false;
		while (br.ready()) {
			String line = br.readLine();
			if (line.startsWith("c")) {
				int openedTid = Integer.parseInt(line.substring(1));
				if (active) {
					tids.add(openedTid);
				}
				else if (!active) {
					if (openedTid == tid) {
						active = true;
					}
				}
			}
		}
		br.close();
		return tids;
	}	
	
	/**
	 * Opens a new write transaction.
	 *
	 * @param repoPath
	 * @return the transaction ID assigned to the newly created transaction
	 * @throws IOException
	 */
	public static int openTransaction(String repoPath) throws IOException {
		int transactionNr = getWriteTransactionNr(repoPath);
		transactionNr ++;
		BufferedWriter bw = getTransactionFileWriter(repoPath);
		bw.append("o" + transactionNr + "\n");
		bw.close();
		return transactionNr;
	}
	
	/**
	 * Closes an existing write transaction.
	 *
	 * @param repoPath
	 * @param tid the transaction ID of the write transaction to close
	 * @throws IOException
	 */
	public static void closeTransaction(String repoPath, int tid)
			throws IOException {
		BufferedWriter bw = getTransactionFileWriter(repoPath);
		bw.append("c" + tid + "\n");
		bw.close();
	}
	

	/**
	 * @param repoPath
	 * @return a reader for the transaction file belonging to a specific path
	 * @throws IOException 
	 */
	private static BufferedReader getTransactionFileReader(String repoPath)
			throws IOException {
		File transactionFile = new File(FileUtil.getWorkingFolder() + "/" +
				repoPath + "/.supermod/.transaction");
		if (!transactionFile.exists()) {
			transactionFile.createNewFile();
		}
		return new BufferedReader(new FileReader(transactionFile));
	}
	
	/**
	 * @param repoPath
	 * @return a writer for the transaction file belonging to a specific path
	 * @throws IOException
	 */
	private static BufferedWriter getTransactionFileWriter(String repoPath)
			throws IOException {
		File transactionFile = new File(FileUtil.getWorkingFolder() + "/" +
				repoPath + "/.supermod/.transaction");
		if (!transactionFile.exists()) {
			transactionFile.createNewFile();
		}
		return new BufferedWriter(new FileWriter(transactionFile, true));
	}

}
