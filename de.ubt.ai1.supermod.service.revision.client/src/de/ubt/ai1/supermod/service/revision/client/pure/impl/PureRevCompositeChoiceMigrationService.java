/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.revision.client.pure.impl;

import java.util.List;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.VersionSpace;
import de.ubt.ai1.supermod.service.client.IChoiceMigrationService;
import de.ubt.ai1.supermod.service.client.ICompositeChoiceMigrationService;
import de.ubt.ai1.supermod.service.revision.IRevisionDimensionProvider;
import de.ubt.ai1.supermod.service.revision.Revision;

/**
 * An implementation of the composite choice migration service, which
 * accesses an ambition specification service for the revision dimension.
 * 
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	01.08.2014
 */
public class PureRevCompositeChoiceMigrationService 
implements ICompositeChoiceMigrationService {
	
	@Inject
	private IRevisionDimensionProvider revDimProvider;

	@Inject
	@Revision
	private IChoiceMigrationService revisionChoiceMigrationService;
	
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.ICompositeChoiceMigrationService
	 * #migrateCompositeChoice(de.ubt.ai1.supermod.mm.core.VersionSpace,
	 * de.ubt.ai1.supermod.mm.core.OptionBinding, java.util.List)
	 */
	@Override
	public OptionBinding migrateCompositeChoice(VersionSpace vs,
			OptionBinding choice, List<OptionBinding> ambitions) {
		return revisionChoiceMigrationService.migrateChoice(
				revDimProvider.getRevisionDimension(vs), choice, ambitions);
	}

}
