/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.client;

import de.ubt.ai1.supermod.mm.client.ConflictSet;
import de.ubt.ai1.supermod.mm.client.ProductSpaceExportTrace;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;

/**
 * This client service interface defines a way to notify the user about product
 * conflicts in a post-mortem way by adding markers to the exported product
 * in the workspace. The concrete behavior of marker generation must be
 * implemented by clients.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	10.06.2016
 */
public interface IWorkspaceConflictMarker {

	/**
	 * To be implemented in order to generate the markers. The conflicts
	 * contained in the passed conflict set refer to repository elements; the
	 * specified export trace allows to retrieve the corresponding workspace
	 * elements.
	 *
	 * @param projectName
	 * @param conflicts
	 * @param exportTrace
	 * @throws SuperModClientException 
	 */
	public void markConflicts(String projectName, ConflictSet conflicts,
			ProductSpaceExportTrace exportTrace) throws SuperModClientException;

	/**
	 * To be implemented in order to remove all conflict markers indicating
	 * problems that have been reported using specific markers during check-out.
	 * 
	 * @param projectName
	 * @throws SuperModClientException
	 */
	public void removeAllConflictMarkers(String projectName)
			throws SuperModClientException;
}
