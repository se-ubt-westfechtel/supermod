/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.collab.client.pure.impl;

import de.ubt.ai1.supermod.mm.core.VersionSpace;
import de.ubt.ai1.supermod.service.client.IVersionSpaceEditingService;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;

/**
 * Implementation of the version space editing service specific to the collab
 * dimension. Since the revision graph is immutable, it may not be modified by
 * the user. As a consequence, a pure collab version space is not editable.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	28.10.2015
 */
public class PureCollabVersionSpaceEditingService
implements IVersionSpaceEditingService {
	

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IVersionSpaceEditingService
	 * #isEditable(de.ubt.ai1.supermod.mm.core.VersionSpace)
	 */
	@Override
	public boolean isEditable(VersionSpace vs) {
		return false;
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IVersionSpaceEditingService
	 * #openEditor(de.ubt.ai1.supermod.mm.core.VersionSpace)
	 */
	@Override
	public void openEditor(VersionSpace vs) throws SuperModClientException {		
	}

}
