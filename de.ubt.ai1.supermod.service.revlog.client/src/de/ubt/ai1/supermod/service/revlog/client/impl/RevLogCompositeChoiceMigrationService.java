/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.revlog.client.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.change.util.ChangeSpaceUtil;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.SuperModCoreFactory;
import de.ubt.ai1.supermod.mm.core.VersionDimension;
import de.ubt.ai1.supermod.mm.core.VersionSpace;
import de.ubt.ai1.supermod.mm.logical.LogicalDimension;
import de.ubt.ai1.supermod.mm.revision.RevisionDimension;
import de.ubt.ai1.supermod.service.client.IChoiceMigrationService;
import de.ubt.ai1.supermod.service.client.ICompositeChoiceMigrationService;
import de.ubt.ai1.supermod.service.logical.ILogicalDimensionProvider;
import de.ubt.ai1.supermod.service.logical.Logical;
import de.ubt.ai1.supermod.service.revision.IRevisionDimensionProvider;
import de.ubt.ai1.supermod.service.revision.Revision;

/**
 * An implementation of the composite choice migration interface which
 * uses a revision and a logical choice migration service in order to
 * migrate a hybrid, composite choice.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	01.08.2014
 */
public class RevLogCompositeChoiceMigrationService 
implements ICompositeChoiceMigrationService {
	
	@Inject
	private IRevisionDimensionProvider revDimProvider;
	
	@Inject
	private ILogicalDimensionProvider logDimProvider;
	
	@Inject
	@Revision
	private IChoiceMigrationService revisionMigrationService;
	
	@Inject
	@Logical
	private IChoiceMigrationService logicalMigrationService;

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.ICompositeChoiceMigrationService
	 * #migrateCompositeChoice(de.ubt.ai1.supermod.mm.core.VersionSpace, 
	 * de.ubt.ai1.supermod.mm.core.OptionBinding, java.util.List)
	 */
	@Override
	public OptionBinding migrateCompositeChoice(VersionSpace vs,
			OptionBinding choice, List<OptionBinding> ambitions) {
		RevisionDimension revDim = revDimProvider.getRevisionDimension(vs);
		LogicalDimension logDim = logDimProvider.getLogicalDimension(vs);

		// filter choice for revision and logical dimension.
		OptionBinding revChoice = ChangeSpaceUtil.filterBinding(
				choice, revDim);
		OptionBinding logChoice = ChangeSpaceUtil.filterBinding(
				choice, logDim);
		
		List<OptionBinding> revAmbitions = new ArrayList<>();
		List<OptionBinding> logAmbitions = new ArrayList<>();
		for (OptionBinding ambition : ambitions) {
			Map<VersionDimension, OptionBinding> ambMap = 
					ChangeSpaceUtil.expandBinding(ambition);
			OptionBinding revAmb = ambMap.get(revDim);
			OptionBinding logAmb = ambMap.get(logDim);
			revAmbitions.add(revAmb);
			logAmbitions.add(logAmb);
		}
		
		OptionBinding migRevChoice = revisionMigrationService.migrateChoice(
				revDim, revChoice, revAmbitions);
		if (migRevChoice == null) {
			return null;
		}
		OptionBinding migLogChoice = logicalMigrationService.migrateChoice(
				logDim, logChoice, logAmbitions);
		if (migLogChoice == null) {
			return null;
		}
		OptionBinding migChoice = SuperModCoreFactory.eINSTANCE
				.createOptionBinding();
		migChoice.getBoundOptions().putAll(migRevChoice.getBoundOptions());
		migChoice.getBoundOptions().putAll(migLogChoice.getBoundOptions());
		return migChoice;
	}

}
