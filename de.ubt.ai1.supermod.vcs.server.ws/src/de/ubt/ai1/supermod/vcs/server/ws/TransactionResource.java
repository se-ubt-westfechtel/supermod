/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.vcs.server.ws;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import de.ubt.ai1.supermod.vcs.server.util.AuthUtil;
import de.ubt.ai1.supermod.vcs.server.util.TransactionUtil;

/**
 * A REST resource to obtain the current transaction number and to increment it
 * by one.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	16.10.2015
 */
@Path("/")
public class TransactionResource {
	
	/**
	 * GET operation for transaction number of most recently closed read
	 * transaction.
	 *
	 * @param repoPath path to repository
	 * @path user
	 * @return <ul>
	 * <li>200 (OK) including transaction id</li>
 	 * <li>403 (Forbidden) in case user authentication fails</li>
	 * <li>500 (Internal Server Error) in the case of a caught exception.</li>
	 * </ul>
	 */
	@GET
	@Path("{repoPath:.*}/transaction/read")
	@Produces(MediaType.TEXT_PLAIN)
	public Response getReadTransaction(
			@PathParam("repoPath") String repoPath,
			@QueryParam("user") String user
	) {
		if (!AuthUtil.authenticate(user)) {
			return Response
					.status(Response.Status.FORBIDDEN)
					.build();
		}
		try {
			int transactionNr = TransactionUtil.getReadTransactionNr(repoPath);
			return Response
					.status(Response.Status.OK)
					.entity(" \n "+transactionNr+" \n ").build();
		}
		catch (Exception e) {
			e.printStackTrace();
			return Response
					.status(Response.Status.INTERNAL_SERVER_ERROR)
					.entity(e).build();
		}
	}
	
	/**
	 * GET operation for transaction number of most recently started write
	 * transaction.
	 * 
	 * @param repoPath path to repository
	 * @path user
	 * @return <ul>
	 * <li>200 (OK) including transaction id</li>
 	 * <li>403 (Forbidden) in case user authentication fails</li>
	 * <li>500 (Internal Server Error) in the case of a caught exception.</li>
	 * </ul>
	 */
	@GET
	@Path("{repoPath:.*}/transaction/write")
	@Produces(MediaType.TEXT_PLAIN)
	public Response getWriteTransaction(
			@PathParam("repoPath") String repoPath,
			@QueryParam("user") String user
	) {
		if (!AuthUtil.authenticate(user)) {
			return Response
					.status(Response.Status.FORBIDDEN)
					.build();
		}
		try {
			int transactionNr = TransactionUtil.getWriteTransactionNr(repoPath);
			return Response
					.status(Response.Status.OK)
					.entity(" \n "+transactionNr+" \n ").build();
		}
		catch (Exception e) {
			e.printStackTrace();
			return Response
					.status(Response.Status.INTERNAL_SERVER_ERROR)
					.entity(e).build();
		}
	}
	
	/**
	 * PUT operation for incrementing the write transaction number. 
	 *
	 * @param repoPath path to repository to which the transaction refers
	 * @param user the user requesting a new transaction number
	 * @return <ul>
	 * <li>200 (OK) including transaction id</li>
 	 * <li>403 (Forbidden) in case user authentication fails</li>
	 * <li>500 (Internal Server Error) in the case of a caught exception.</li>
	 * </ul>
	 */
	@PUT
	@Path("{repoPath:.*}/transaction/open")
	@Produces(MediaType.TEXT_PLAIN)
	public Response putOpenTransaction(
			@PathParam("repoPath") String repoPath,
			@QueryParam("user") String user
	) {
		if (!AuthUtil.authenticate(user)) {
			return Response
					.status(Response.Status.FORBIDDEN)
					.build();
		}
		try {
			int transactionNr = TransactionUtil.openTransaction(repoPath);
			return Response
					.status(Response.Status.OK)
					.entity(" \n "+transactionNr+" \n ").build();
		}
		catch (Exception e) {
			e.printStackTrace();
			return Response
					.status(Response.Status.INTERNAL_SERVER_ERROR)
					.entity(e).build();
		}
	}
	
	/**
	 * PUT operation for closing a current write transaction number. 
	 *
	 * @param repoPath path to repository to which the transaction refers
	 * @param user the user requesting a new transaction number
	 * @param tid the ID of the write transaction to close
	 * @return <ul>
	 * <li>200 (OK) including transaction id</li>
 	 * <li>403 (Forbidden) in case user authentication fails</li>
	 * <li>500 (Internal Server Error) in the case of a caught exception.</li>
	 * </ul>
	 */
	@PUT
	@Path("{repoPath:.*}/transaction/close")
	@Produces(MediaType.TEXT_PLAIN)
	public Response putCloseTransaction(
			@PathParam("repoPath") String repoPath,
			@QueryParam("user") String user,
			@QueryParam("tid") int tid
	) {
		if (!AuthUtil.authenticate(user)) {
			return Response
					.status(Response.Status.FORBIDDEN)
					.build();
		}
		try {
			TransactionUtil.closeTransaction(repoPath, tid);
			return Response
					.status(Response.Status.OK)
					.build();
		}
		catch (Exception e) {
			e.printStackTrace();
			return Response
					.status(Response.Status.INTERNAL_SERVER_ERROR)
					.entity(e).build();
		}
	}

}
