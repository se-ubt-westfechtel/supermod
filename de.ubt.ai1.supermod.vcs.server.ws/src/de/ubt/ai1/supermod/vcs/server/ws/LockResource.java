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
import de.ubt.ai1.supermod.vcs.server.util.LockUtil;

/**
 * A REST resource to obtain the locking state, to lock or to unlock a
 * specific repository.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	13.10.2015
 */
@Path("/")
public class LockResource {
	
	/**
	 * GET operation for lock information.
	 *
	 * @param repoPath
	 * @param user
	 * @return <ul>
	 * <li>200 (OK) including lock information, consisting of 
	 * semicolon-separated locking user and date</li>
 	 * <li>403 (Forbidden) in case user authentication fails</li>
	 * <li>500 (Internal Server Error) in the case of a caught exception.</li>
	 * </ul>
	 */
	@GET
	@Path("{repoPath:.*}/lock")
	@Produces(MediaType.TEXT_PLAIN)
	public Response getLockInfo(
			@PathParam("repoPath") String repoPath,
			@QueryParam("user") String user
	) {
		if (!AuthUtil.authenticate(user)) {
			return Response
					.status(Response.Status.FORBIDDEN)
					.build();
		}
		try {
			if (LockUtil.isLocked(repoPath)) {
				String lockInfo = LockUtil.getLockInfo(repoPath);			
				return Response
						.status(Response.Status.OK)
						.entity(lockInfo).build();
			}
			else {
				return Response.noContent().build();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			return Response
					.status(Response.Status.INTERNAL_SERVER_ERROR)
					.entity(e).build();
		}
	}
	
	/**
	 * GET operation for locking user.
	 *
	 * @param repoPath
	 * @param user
	 * @return <ul>
	 * <li>200 (OK) including locking user</li>
 	 * <li>403 (Forbidden) in case user authentication fails</li>
	 * <li>500 (Internal Server Error) in the case of a caught exception.</li>
	 * </ul>
	 */
	@GET
	@Path("{repoPath:.*}/lock/user")
	@Produces(MediaType.TEXT_PLAIN)
	public Response getLockUser(
			@PathParam("repoPath") String repoPath,
			@QueryParam("user") String user
	) {
		if (!AuthUtil.authenticate(user)) {
			return Response
					.status(Response.Status.FORBIDDEN)
					.build();
		}
		try {
			if (LockUtil.isLocked(repoPath)) {
				String lockInfo = LockUtil.getLockInfo(repoPath);			
				return Response
						.status(Response.Status.OK)
						.entity(lockInfo).build();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			return Response
					.status(Response.Status.INTERNAL_SERVER_ERROR)
					.entity(e).build();
		}
		return Response.noContent().build();
	}
	
	/**
	 * GET operation for locking user.
	 *
	 * @param repoPath
	 * @param user
	 * @return <ul>
	 * <li>200 (OK) including locking date</li>
 	 * <li>403 (Forbidden) in case user authentication fails</li>
	 * <li>500 (Internal Server Error) in the case of a caught exception.</li>
	 * </ul>
	 */
	@GET
	@Path("{repoPath:.*}/lock/date")
	@Produces(MediaType.TEXT_PLAIN)
	public Response getLockDate(
			@PathParam("repoPath") String repoPath,
			@QueryParam("user") String user
	) {
		if (!AuthUtil.authenticate(user)) {
			return Response
					.status(Response.Status.FORBIDDEN)
					.build();
		}
		try {
			if (LockUtil.isLocked(repoPath)) {
				String lockInfo = LockUtil.getLockDate(repoPath);			
				return Response
						.status(Response.Status.OK)
						.entity(lockInfo).build();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			return Response
					.status(Response.Status.INTERNAL_SERVER_ERROR)
					.entity(e).build();
		}
		return Response.noContent().build();
	}	
	
	/**
	 * PUT operation for setting or emergency-releasing the lock
	 *
	 * @param repoPath
	 * @param release if defined, the lock will be released if allowed
	 * @param user user trying to release the lock
	 * @param force if defined, the lock will be released even if the specified
	 * 			user is unequal to the lock user
	 * @return <ul>
	 * <li>200 (OK) in case locking or emergency-releasing was successful</li>
	 * <li>400 (Bad Request) if a non-existing lock is attempted to release</li>
 	 * <li>403 (Forbidden) in case user authentication fails</li>
 	 * <li>423 (Locked) if user must not release and force is inactive
	 * <li>500 (Internal Server Error) in the case of a caught exception.</li>
	 * </ul>
	 */
	@PUT
	@Path("{repoPath:.*}/putlock")
	public Response putLock(
			@PathParam("repoPath") String repoPath,
			@QueryParam("user") String user,
			@QueryParam("release") String release,
			@QueryParam("force") String force,
			String content
	) {
		try {
			if (!AuthUtil.authenticate(user)) {
				return Response
						.status(Response.Status.FORBIDDEN)
						.build();
			}
			if (LockUtil.isLocked(repoPath)) {
				if (release != null) {
					if (LockUtil.unlock(repoPath, user, force != null)) {
						return Response
								.status(Response.Status.OK)
								.build();
					}
					else {
						return Response
								.status(423)
								.build();
					}
				}
				else {
					return Response
							.status(423)
							.build();
				}
			}
			else {
				if (release != null) {
					return Response
							.status(Response.Status.BAD_REQUEST)
							.build();
				}
				LockUtil.lock(repoPath, user);
				return Response
						.status(Response.Status.OK)
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
