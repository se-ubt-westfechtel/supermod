/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.revfeat.client.impl;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.change.util.ChangeSpaceUtil;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.SuperModCoreFactory;
import de.ubt.ai1.supermod.mm.core.VersionSpace;
import de.ubt.ai1.supermod.mm.feature.FeatureModel;
import de.ubt.ai1.supermod.mm.feature.util.FeatureModelUtil;
import de.ubt.ai1.supermod.mm.revision.RevisionDimension;
import de.ubt.ai1.supermod.service.IProductDimensionFilterService;
import de.ubt.ai1.supermod.service.client.IChoiceSpecificationService;
import de.ubt.ai1.supermod.service.client.IChoiceUpdatingService;
import de.ubt.ai1.supermod.service.client.ICompositeChoiceUpdatingService;
import de.ubt.ai1.supermod.service.exceptions.UnderspecifiedVisibilityException;
import de.ubt.ai1.supermod.service.feature.Feature;
import de.ubt.ai1.supermod.service.feature.IFeatureVersionDimensionProvider;
import de.ubt.ai1.supermod.service.revision.IRevisionDimensionProvider;
import de.ubt.ai1.supermod.service.revision.Revision;

/**
 * An implementation of the composite choice updating interface which
 * uses a revision and a feature choice updating service in order to
 * update a hybrid, composite choice.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	03.03.2015
 */
public class RevFeatCompositeChoiceUpdatingService
implements ICompositeChoiceUpdatingService {

	@Inject
	private IRevisionDimensionProvider revDimProvider;
	
	@Inject
	private IFeatureVersionDimensionProvider featDimProvider;
	
	@Inject
	@Revision
	private IChoiceUpdatingService revisionUpdatingService;	
	
	@Inject
	@Feature
	private IChoiceSpecificationService featureConfSpecificationService;
	
	@Inject
	private IProductDimensionFilterService filterService;

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.ICompositeChoiceUpdatingService
	 * #updateCompositeChoice(de.ubt.ai1.supermod.mm.core.VersionSpace, 
	 * de.ubt.ai1.supermod.mm.core.OptionBinding)
	 */
	@Override
	public OptionBinding updateCompositeChoice(VersionSpace vs,
			OptionBinding choice) throws UnderspecifiedVisibilityException {
		RevisionDimension revDim = revDimProvider.getRevisionDimension(vs);
		FeatureModel featureModel = featDimProvider.getFeatureDimension(vs);
		
		// update the revision choice.
		OptionBinding updatedRevisionChoice = 
				revisionUpdatingService.updateChoice(
				revDim,	ChangeSpaceUtil.filterBinding(choice, revDim));
		
		// filter the feature model by the revision choice.
		OptionBinding completeRevisionChoice = 
				vs.applyAllCompletions(updatedRevisionChoice);
		FeatureModel filteredFeatureModel = (FeatureModel) 
				filterService.filter(featureModel, completeRevisionChoice);
		
		// filter the choice feature configuration by options which occur in
		// the filtered feature model.
		OptionBinding updatedFeatureChoice = ChangeSpaceUtil.filterBinding(
				choice, featureModel);
		updatedFeatureChoice = FeatureModelUtil.mapFeatureConfiguration(
				updatedFeatureChoice, featureModel, filteredFeatureModel,
				false);		
		updatedFeatureChoice = ChangeSpaceUtil.filterBinding(
				updatedFeatureChoice, filteredFeatureModel);
		
		// in case the choice is not complete with respect to the filtered
		// feature model, a user selection is required.
		if (!filteredFeatureModel.isComplete(
				filteredFeatureModel.applyCompletions(updatedFeatureChoice))) {
			updatedFeatureChoice = featureConfSpecificationService
					.specifyChoice(filteredFeatureModel, updatedFeatureChoice,
							null);
			if (updatedFeatureChoice == null) return null;
		}
		
		updatedFeatureChoice = FeatureModelUtil.mapFeatureConfiguration(
				updatedFeatureChoice, filteredFeatureModel, featureModel,
				false);		

		// compose the choice.
		OptionBinding compositeUpdatedChoice = SuperModCoreFactory.eINSTANCE
				.createOptionBinding();
		compositeUpdatedChoice.getBoundOptions().putAll(
				updatedRevisionChoice.getBoundOptions());
		compositeUpdatedChoice.getBoundOptions().putAll(
				updatedFeatureChoice.getBoundOptions());
		return compositeUpdatedChoice;
	}

}
