/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.vcs.server.ws;

import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import de.ubt.ai1.supermod.vcs.server.util.AuthUtil;
import de.ubt.ai1.supermod.vcs.server.util.BrowseUtil;
import de.ubt.ai1.supermod.vcs.server.util.InitUtil;
import de.ubt.ai1.supermod.vcs.server.util.ModuleIdUtil;

/**
 * A REST resource for the initialization of server-side repositories.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	16.10.2015
 */
@Path("/")
public class InitResource {
	
	/**
	 * PUT operation for the initialization a repository using the
	 * specified module id.
	 *
	 * @param repoPath path of the repository to create
	 * @param moduleId module id of the SuperMod module to use
	 * @param user
	 * @param repoContentXmi the XMI-serialized repository content.
	 * @return <ul>
	 * 	<li>201 (Created) if creation was successful</li>
	 *  <li>400 (Bad Request) in case the module is not available.</li>
	 *  <li>403 (Forbidden) in case user authentication fails</li>
	 *  <li>409 (Conflict) in case the repository path is already in use.</li>
	 *  <li>500 (Internal Server Error) in case an exception was thrown.</li>
	 * <ul>
	 */
	@PUT
	@Path("{repoPath:.*}/init")
	public Response putInit(
			@PathParam("repoPath") String repoPath,
			@QueryParam("moduleId") String moduleId,
			@QueryParam("user") String user,
			String repoContentXmi
	) {
		if (!AuthUtil.authenticate(user)) {
			return Response
					.status(Response.Status.FORBIDDEN)
					.build();
		}
		if (moduleId == null || 
				!ModuleIdUtil.isModuleDefined(moduleId)) {
			return Response
					.status(Response.Status.BAD_REQUEST)
					.build();
		}
		try {
			if (BrowseUtil.existsRepo(repoPath)) {
				return Response
						.status(Response.Status.CONFLICT)
						.build();
			}
			InitUtil.initRepo(repoPath, moduleId, user, repoContentXmi);
			return Response
					.status(Response.Status.CREATED)
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
