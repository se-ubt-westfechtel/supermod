/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.vcs.server.ws;

import java.io.IOException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * A REST resource to test whether the SuperMod server is started and responds
 * correctly. A "ping" query should be answered with "PONG".
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	13.10.2015
 */
@Path("/")
public class PingResource {
		
	/**
	 * Performs a ping request.
	 *
	 * @return a response with status 200 (OK) and entity message "PONG".
	 * @throws IOException
	 */
	@GET
	@Path("ping")
	@Produces(MediaType.TEXT_PLAIN)
	public Response getPing() throws IOException {
		return Response
				.status(Response.Status.OK)
				.entity("PONG").build();
	}
	
}
