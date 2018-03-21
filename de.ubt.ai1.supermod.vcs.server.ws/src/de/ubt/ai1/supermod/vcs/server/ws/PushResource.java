/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.vcs.server.ws;

import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import de.ubt.ai1.supermod.vcs.server.util.AuthUtil;
import de.ubt.ai1.supermod.vcs.server.util.BrowseUtil;
import de.ubt.ai1.supermod.vcs.server.util.PushUtil;

/**
 * A REST resource for pushing client-side modifications to server-side
 * repositories.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	16.10.2015
 */
@Path("/")
public class PushResource {
	
	/**
	 * PUT operation to realize the push request, which transfers client-side
	 * changes to the server-side repository.
	 *
	 * @param repoPath path of the repository to push to
	 * @param localTransaction the current transaction Id of the client.
	 * @param user
	 * @param repoChangesXmi XMI-serialized repository changes
	 * @return <ul>
	 * 	<li>200 (OK) if push was carried out successfully</li>
	 *  <li>400 (Bad Request) in case no changes have been specified as
	 *  XML entity.</li>
	 *  <li>403 (Forbidden) in case user authentication fails</li>
	 *  <li>404 (Not Found) in case the specified repository does not exist.</li>
	 *  <li>500 (Internal Server Error) in case an exception was thrown.</li>
	 * <ul>
	 */
	@PUT
	@Path("{repoPath:.*}/push")
	@Consumes(MediaType.TEXT_PLAIN)
	public Response putPush(
			@PathParam("repoPath") String repoPath,
			@QueryParam("localTransaction") int localTransaction,
			@QueryParam("user") String user,
			String repoChangesXmi
	) {
		if (!AuthUtil.authenticate(user)) {
			return Response
					.status(Response.Status.FORBIDDEN)
					.build();
		}
		if (repoChangesXmi == null) {
			return Response
					.status(Response.Status.BAD_REQUEST)
					.build();
		}
		if (!BrowseUtil.existsRepo(repoPath)) {
			return Response
					.status(Response.Status.NOT_FOUND)
					.build();
		}
		try {
			PushUtil.pushRepoChanges(repoPath, user, localTransaction,
					repoChangesXmi);
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
