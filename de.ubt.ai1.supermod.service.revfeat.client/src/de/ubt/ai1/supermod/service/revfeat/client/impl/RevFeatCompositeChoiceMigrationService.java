/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.revfeat.client.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.change.util.ChangeSpaceUtil;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.SuperModCoreFactory;
import de.ubt.ai1.supermod.mm.core.VersionDimension;
import de.ubt.ai1.supermod.mm.core.VersionSpace;
import de.ubt.ai1.supermod.mm.feature.FeatureModel;
import de.ubt.ai1.supermod.mm.revision.RevisionDimension;
import de.ubt.ai1.supermod.service.client.IChoiceMigrationService;
import de.ubt.ai1.supermod.service.client.ICompositeChoiceMigrationService;
import de.ubt.ai1.supermod.service.feature.Feature;
import de.ubt.ai1.supermod.service.feature.IFeatureVersionDimensionProvider;
import de.ubt.ai1.supermod.service.revision.IRevisionDimensionProvider;
import de.ubt.ai1.supermod.service.revision.Revision;

/**
 * An implementation of the composite choice migration interface which
 * uses a revision and a feature choice migration service in order to
 * migrate a hybrid, composite choice.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	03.03.2015
 */
public class RevFeatCompositeChoiceMigrationService
implements ICompositeChoiceMigrationService {
	
	@Inject
	private IRevisionDimensionProvider revDimProvider;
	
	@Inject
	private IFeatureVersionDimensionProvider featDimProvider;
	
	@Inject
	@Revision
	private IChoiceMigrationService revisionMigrationService;
	
	@Inject
	@Feature
	private IChoiceMigrationService featureMigrationService;

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.ICompositeChoiceMigrationService
	 * #migrateCompositeChoice(de.ubt.ai1.supermod.mm.core.VersionSpace, 
	 * de.ubt.ai1.supermod.mm.core.OptionBinding, java.util.List)
	 */
	@Override
	public OptionBinding migrateCompositeChoice(VersionSpace vs,
			OptionBinding choice, List<OptionBinding> ambitions) {
		RevisionDimension revDim = revDimProvider.getRevisionDimension(vs);
		FeatureModel featDim = featDimProvider.getFeatureDimension(vs);

		// filter choice for revision and logical dimension.
		OptionBinding revChoice = ChangeSpaceUtil.filterBinding(choice, revDim);
		OptionBinding featChoice = ChangeSpaceUtil.filterBinding(
				choice, featDim);
		
		List<OptionBinding> revAmbitions = new ArrayList<>();
		List<OptionBinding> featAmbitions = new ArrayList<>();
		for (OptionBinding ambition : ambitions) {
			Map<VersionDimension, OptionBinding> ambMap = 
					ChangeSpaceUtil.expandBinding(ambition);
			OptionBinding revAmb = ambMap.get(revDim);
			OptionBinding featAmb = ambMap.get(featDim);
			if (revAmb != null && revAmb.getNumberOfBindings() > 0) {
				revAmbitions.add(revAmb);
			}
			if (featAmb != null && featAmb.getNumberOfBindings() > 0) {
				featAmbitions.add(featAmb);
			}
		}
		
		OptionBinding migRevChoice = revisionMigrationService.migrateChoice(
				revDim, revChoice, revAmbitions);
		if (migRevChoice == null) {
			return null;
		}
		OptionBinding migFeatChoice = featureMigrationService.migrateChoice(
				featDim, featChoice, featAmbitions);
		if (migFeatChoice == null) {
			return null;
		}
		OptionBinding migChoice = SuperModCoreFactory.eINSTANCE
				.createOptionBinding();
		migChoice.getBoundOptions().putAll(migRevChoice.getBoundOptions());
		migChoice.getBoundOptions().putAll(migFeatChoice.getBoundOptions());
		return migChoice;
	}

}
