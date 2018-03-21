/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.client;

import de.ubt.ai1.supermod.mm.core.VersionSpace;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;

/**
 * Service interface for editing an entire version space. In a multi-dimension
 * version space, only one dimension should be editable by the user. Clients
 * should implement this interface by passing the version space editing task
 * to a specific {@link VersionDimensionEditingService}.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	31.07.2014
 */
public interface IVersionSpaceEditingService {

	/**
	 * Checks whether the user may edit a specified version space.
	 *
	 * @param vs
	 * @return whether <code>vs</code> may be edited by the user.
	 */
	boolean isEditable(VersionSpace vs);

	/**
	 * Opens an editor where the user may modify versioning rules relevant to
	 * the entire version space. Typically, only one dimension is editable,
	 * such that an appropriate dimension editing service should be involved.
	 *
	 * @param vs the version space to edit
	 * @throws SuperModClientException in case the editor cannot be opened.
	 */
	void openEditor(VersionSpace vs) throws SuperModClientException;

}
