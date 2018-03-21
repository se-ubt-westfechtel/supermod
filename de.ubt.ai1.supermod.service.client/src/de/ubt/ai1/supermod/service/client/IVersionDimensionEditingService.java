/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.client;

import de.ubt.ai1.supermod.mm.core.VersionDimension;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;

/**
 * Service interface for editing a version dimension by showing an appropriate
 * editor to the user. The way versioning rules are displayed and modified is
 * specific to the respective version dimension type.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	31.07.2014
 */
public interface IVersionDimensionEditingService {
	
	/**
	 * Checks if the specified product dimension is currently editable by the
	 * user.
	 *
	 * @param dim
	 * @return whether <code>dim</code> may be edited by the user.
	 */
	public boolean isEditable(VersionDimension dim);
	
	/**
	 * Opens an editor where the user can modify version rules of the specified
	 * version dimension in a dimension-specific way.
	 *
	 * @param dim the dimension to edit.
	 * @throws SuperModClientException in case the editor cannot be opened.
	 */
	public void openEditor(VersionDimension dim) throws SuperModClientException;

}
