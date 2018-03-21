/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.vcs.server.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import de.ubt.ai1.supermod.vcs.server.util.AuthUtil;
import de.ubt.ai1.supermod.vcs.server.util.BrowseUtil;
import de.ubt.ai1.supermod.vcs.server.util.PullUtil;
import de.ubt.ai1.supermod.vcs.server.util.TransactionUtil;

/**
 * A resource for pulling pending changes from the server-side repository to a
 * client-side repository.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	16.10.2015
 */
@Path("/")
public class PullResource {
	
	/**
	 * GET operation for a pull request, returning the changes between a 
	 * specified client transaction and the current server transaction.
	 *
	 * @param repoPath path of repository to pull from
	 * @param localTransaction client transaction id
	 * @param user
	 * @return <ul>
	 * 	<li>200 (OK) including the XMI-serialized changes</li>
	 *  <li>304 (Not Modified) in case there are no changes to pull</li>
	 *  <li>400 (Bad Request) in case an illegal local transaction id has been
	 *  specified.</li>
	 *  <li>403 (Forbidden) in case user authentication fails</li>
	 *  <li>404 (Not Found) in case the specified repository does not exist.</li>
	 *  <li>500 (Internal Server Error) in case an exception was thrown.</li>
	 * <ul>
	 */
	@GET
	@Path("{repoPath:.*}/pull")
	@Produces(MediaType.TEXT_PLAIN)
	public Response getPull(
			@PathParam("repoPath") String repoPath,
			@QueryParam("localTransaction") int localTransaction,
			@QueryParam("user") String user
	) {
		if (!AuthUtil.authenticate(user)) {
			return Response
					.status(Response.Status.FORBIDDEN)
					.build();
		}
		if (!BrowseUtil.existsRepo(repoPath)) {
			return Response
					.status(Response.Status.NOT_FOUND)
					.build();
		}
		int readTransaction = -1;
		try {
			readTransaction = TransactionUtil.getReadTransactionNr(repoPath);
			if (localTransaction == readTransaction) {
				return Response
						.status(Response.Status.NOT_MODIFIED)
						.build();
			}
			String repoChangesXmi = PullUtil.pullRepoChanges(repoPath, 
					localTransaction);
			return Response
					.status(Response.Status.OK)
					.entity(repoChangesXmi).build();		
		}
		catch (Exception e) {
			e.printStackTrace();
			return Response
					.status(Response.Status.INTERNAL_SERVER_ERROR)
					.entity(e).build();
		}
	}

}
