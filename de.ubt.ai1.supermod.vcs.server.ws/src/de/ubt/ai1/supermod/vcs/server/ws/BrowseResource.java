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

/**
 * A REST resource for browsing server-side repositories.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	16.10.2015
 */
@Path("/")
public class BrowseResource {
	
	/**
	 * GET operation for browsing the list of available SuperMod repositories
	 * on this server.
	 *
	 * @param user
	 * @return <ul>
	 * 	<li>200 (OK) with line-separated path to available repositories</li>
	 *  <li>403 (Forbidden) in case user authentication fails</li>
	 *  <li>500 (Internal Server Error) in case an exception was thrown.</li>
	 * <ul>
	 */
	@GET
	@Path("browseAll")
	@Produces(MediaType.TEXT_PLAIN)
	public Response getBrowseAll(
			@QueryParam("user") String user
    ) {
		if (!AuthUtil.authenticate(user)) {
			return Response
					.status(Response.Status.FORBIDDEN)
					.build();
		}
		try {
			String result = "";
			for (String repoPath : BrowseUtil.getAllRepoPaths()) {
				result += repoPath + "\n";
			}
			if (!result.isEmpty()) {
				result = result.substring(0, result.length() - 1);
			}
			return Response
					.status(Response.Status.OK)
					.entity(result).build();
		}
		catch (Exception e) {
			e.printStackTrace();
			return Response
					.status(Response.Status.INTERNAL_SERVER_ERROR)
					.entity(e).build();
		}		
	}
	
	/**
	 * GET operation for checking the existence of a repository by a path.
	 *
	 * @param user
	 * @return <ul>
	 * 	<li>200 (OK) if a repository exists for this path</li>
	 * 	<li>204 (No Content) if no such repository exists</li>
	 *  <li>403 (Forbidden) in case user authentication fails</li>
	 *  <li>500 (Internal Server Error) in case an exception was thrown.</li>
	 * <ul>
	 */
	@GET
	@Path("{repoPath:.*}/browse")
	@Produces(MediaType.TEXT_PLAIN)
	public Response getBrowse(
			@PathParam("repoPath") String repoPath,
			@QueryParam("user") String user
    ) {
		if (!AuthUtil.authenticate(user)) {
			return Response
					.status(Response.Status.FORBIDDEN)
					.build();
		}
		try {
			boolean exists = BrowseUtil.existsRepo(repoPath);
			if (exists) {
				return Response
						.status(Response.Status.OK)
						.build();
			}
			else {
				return Response
						.status(Response.Status.NO_CONTENT)
						.build();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			return Response
					.status(Response.Status.INTERNAL_SERVER_ERROR)
					.entity(e).build();
		}		
	}

}
