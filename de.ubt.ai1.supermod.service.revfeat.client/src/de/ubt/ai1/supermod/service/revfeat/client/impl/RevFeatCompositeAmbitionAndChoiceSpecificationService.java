/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.revfeat.client.impl;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.change.ChangeDimension;
import de.ubt.ai1.supermod.mm.change.util.ChangeSpaceUtil;
import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.SuperModCoreFactory;
import de.ubt.ai1.supermod.mm.core.VersionSpace;
import de.ubt.ai1.supermod.mm.feature.FeatureModel;
import de.ubt.ai1.supermod.mm.feature.util.FeatureModelUtil;
import de.ubt.ai1.supermod.mm.revision.RevisionDimension;
import de.ubt.ai1.supermod.service.IProductDimensionFilterService;
import de.ubt.ai1.supermod.service.change.IChangeDimensionProvider;
import de.ubt.ai1.supermod.service.client.IAmbitionSpecificationService;
import de.ubt.ai1.supermod.service.client.IChoiceSpecificationService;
import de.ubt.ai1.supermod.service.client.ICompositeAmbitionAndChoiceSpecificationService;
import de.ubt.ai1.supermod.service.exceptions.SuperModException;
import de.ubt.ai1.supermod.service.feature.Feature;
import de.ubt.ai1.supermod.service.feature.IFeatureVersionDimensionProvider;
import de.ubt.ai1.supermod.service.revision.IRevisionDimensionProvider;
import de.ubt.ai1.supermod.service.revision.Revision;

/**
 * A specialized implementation of the composite ambition and choice
 * specification service. It first prompts for a partial choice in the
 * revision graph. Then, in the filtered feature model, an ambition and a 
 * choice are specified. The logical ambition and the overall choice are
 * returned as result.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	15.01.2016
 */
public class RevFeatCompositeAmbitionAndChoiceSpecificationService
implements ICompositeAmbitionAndChoiceSpecificationService {
	
	@Inject
	private IRevisionDimensionProvider revDimProvider;
	
	@Inject
	private IFeatureVersionDimensionProvider featDimProvider;
	
	@Inject
	private IChangeDimensionProvider changeDimProvider;
	
	@Inject
	@Revision
	private IChoiceSpecificationService revChoiceSpecService;
	
	@Inject
	@Feature
	private IProductDimensionFilterService featDimFilterService;
	
	@Inject
	@Feature
	private IAmbitionSpecificationService featAmbSpecService;
	
	@Inject
	@Feature
	private IChoiceSpecificationService featChoiceSpecService;

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.
	 * ICompositeAmbitionAndChoiceSpecificationService
	 * #specifyCompositeChoiceAndAmbition(
	 * de.ubt.ai1.supermod.mm.client.LocalRepository,
	 * de.ubt.ai1.supermod.mm.core.OptionBinding,
	 * de.ubt.ai1.supermod.mm.core.OptionBinding)
	 */
	@Override
	public OptionBinding[] specifyCompositeChoiceAndAmbition(
			LocalRepository repo, OptionBinding proposedCompositeAmbition, 
			OptionBinding proposedCompositeChoice) throws SuperModException {
		VersionSpace vs = repo.getVersionSpace();
		RevisionDimension revDim = revDimProvider.getRevisionDimension(vs);
		FeatureModel featureModel = featDimProvider.getFeatureDimension(vs);
		ChangeDimension changeDim = changeDimProvider.getChangeDimension(vs);
		
		// choose a revision.
		OptionBinding revisionChoice = revChoiceSpecService.
				specifyChoice(revDim, 
						ChangeSpaceUtil.filterBinding(
								proposedCompositeChoice, revDim),
						null);
		if (revisionChoice == null) return null;
		OptionBinding completeRevisionChoice =
				changeDim.applyCompletions(
						revDim.applyCompletions(revisionChoice));
		
		// filter the feature model by the revision.
		FeatureModel filteredFeatureModel = (FeatureModel) 
				featDimFilterService.filter(featureModel, completeRevisionChoice);
		
		// filter and map feature configurations for ambition and choice
		OptionBinding proposedFeatureAmb = ChangeSpaceUtil.filterBinding(
				proposedCompositeAmbition, featureModel);
		proposedCompositeAmbition = FeatureModelUtil.mapFeatureConfiguration(
				proposedCompositeAmbition, featureModel, filteredFeatureModel, 
				false);
		OptionBinding proposedFeatureChoice = ChangeSpaceUtil.filterBinding(
				proposedCompositeChoice, featureModel);
		proposedFeatureChoice = FeatureModelUtil.mapFeatureConfiguration(
				proposedFeatureChoice, featureModel, filteredFeatureModel, 
				false);
		
		// choose a (partial) ambition feature configuration in the filtered
		// feature model.
		OptionBinding featureAmb = featAmbSpecService.specifyAmbition(
				filteredFeatureModel, null, null, proposedFeatureAmb);
		if (featureAmb == null) return null;		
		
		// choose a choice feature configuration in the filtered feature model.
		OptionBinding featureChoice = featChoiceSpecService.specifyChoice(
				filteredFeatureModel, proposedFeatureChoice, featureAmb);
		if (featureChoice == null) return null;		
		
		// re-map feature configurations
		featureAmb = FeatureModelUtil.mapFeatureConfiguration(
				featureAmb, filteredFeatureModel, featureModel, false);
		featureChoice = FeatureModelUtil.mapFeatureConfiguration(
				featureChoice, filteredFeatureModel, featureModel, false);
				
		// compose the overall choice.
		OptionBinding compositeChoice = SuperModCoreFactory.eINSTANCE
				.createOptionBinding();
		compositeChoice.getBoundOptions().putAll(
				revisionChoice.getBoundOptions());
		compositeChoice.getBoundOptions().putAll(
				featureChoice.getBoundOptions());

		// return logical ambition and the overall choice.
		return new OptionBinding[]{featureAmb, compositeChoice};		
	}

}
