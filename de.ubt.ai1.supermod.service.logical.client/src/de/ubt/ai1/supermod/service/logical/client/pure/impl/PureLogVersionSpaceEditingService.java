/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.logical.client.pure.impl;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.core.VersionSpace;
import de.ubt.ai1.supermod.service.client.IVersionDimensionEditingService;
import de.ubt.ai1.supermod.service.client.IVersionSpaceEditingService;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;
import de.ubt.ai1.supermod.service.logical.ILogicalDimensionProvider;
import de.ubt.ai1.supermod.service.logical.Logical;

/**
 * An implementation of the version space editing service interface which
 * involves the low-level logical version dimension editing service.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	01.08.2014
 */
public class PureLogVersionSpaceEditingService
implements IVersionSpaceEditingService {
	
	@Inject
	private ILogicalDimensionProvider logDimProvider;
	
	@Inject
	@Logical
	private IVersionDimensionEditingService logicalDimensionEditingService;

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IVersionSpaceEditingService
	 * #isEditable(de.ubt.ai1.supermod.mm.core.VersionSpace)
	 */
	@Override
	public boolean isEditable(VersionSpace vs) {
		return !vs.getDimensions().isEmpty() &&
				logicalDimensionEditingService.isEditable(
						logDimProvider.getLogicalDimension(vs));
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IVersionSpaceEditingService
	 * #openEditor(de.ubt.ai1.supermod.mm.core.VersionSpace)
	 */
	@Override
	public void openEditor(VersionSpace vs) throws SuperModClientException {
		logicalDimensionEditingService.openEditor(
				logDimProvider.getLogicalDimension(vs));
	}

}
