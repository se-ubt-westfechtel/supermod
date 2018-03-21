/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.vcs.client.http;

import com.google.inject.ImplementedBy;

import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;
import de.ubt.ai1.supermod.vcs.client.http.impl.TransactionHttpRequest;

/**
 * Service interface to access the TRANSACTION resource as defined by the
 * SuperMod server side web service.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	10.11.2015
 */
@ImplementedBy(TransactionHttpRequest.class)
public interface ITransactionHttpRequest {

	/**
	 * Retrieves the current read transaction number, i.e., the most recent
	 * completed transaction, of the repository found at the
	 * specified URL.
	 *
	 * @param repoUrl
	 * @param user
	 * @return the transaction number, or <code>-1</code> if no such repo
	 * exists.
	 * @throws SuperModClientException 
	 */
	public int getCurrentReadTransactionNr(String repoUrl, String user)
			throws SuperModClientException;
	
	/**
	 * Retrieves the current write transaction number of the repository found
	 * at the specified URL.
	 *
	 * @param repoUrl
	 * @param user
	 * @return the transaction number, or <code>-1</code> if no such repo
	 * exists.
	 * @throws SuperModClientException 
	 */
	public int getCurrentWriteTransactionNr(String repoUrl, String user)
			throws SuperModClientException;
	
	/**
	 * Creates a new server-side write transaction number and returns it.
	 *
	 * @param repoUrl
	 * @param user
	 * @return the new transaction number, or <code>-1</code> if no such repo
	 * exists.
	 */
	public int openWriteTransaction(String repoUrl, String user)
			throws SuperModClientException;
	
	/**
	 * Finalizes a write transaction started with {@link 
	 * createWriteTransactionNr}.
	 *
	 * @param repoUrl
	 * @param user
	 * @param tid the transaction number which had been assigned
	 * @return whether the transaction was successfully closed
	 * @throws SuperModClientException
	 */
	public boolean closeWriteTransaction(String repoUrl, String user, int tid)
			throws SuperModClientException;
	
}
