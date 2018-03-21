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
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.SuperModCoreFactory;
import de.ubt.ai1.supermod.mm.core.VersionSpace;
import de.ubt.ai1.supermod.mm.feature.FeatureModel;
import de.ubt.ai1.supermod.mm.feature.util.FeatureModelUtil;
import de.ubt.ai1.supermod.mm.revision.RevisionDimension;
import de.ubt.ai1.supermod.service.IProductDimensionFilterService;
import de.ubt.ai1.supermod.service.change.IChangeDimensionProvider;
import de.ubt.ai1.supermod.service.client.IChoiceSpecificationService;
import de.ubt.ai1.supermod.service.client.ICompositeChoiceSpecificationService;
import de.ubt.ai1.supermod.service.exceptions.UnderspecifiedVisibilityException;
import de.ubt.ai1.supermod.service.feature.Feature;
import de.ubt.ai1.supermod.service.feature.IFeatureVersionDimensionProvider;
import de.ubt.ai1.supermod.service.revision.IRevisionDimensionProvider;
import de.ubt.ai1.supermod.service.revision.Revision;

/**
 * An implementation of the composite choice specification interface which
 * uses a revision choice and a feature configuration specification service to
 * specify a hybrid, composite choice.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	03.03.2015
 */
public class RevFeatCompositeChoiceSpecificationService
implements ICompositeChoiceSpecificationService {

	@Inject
	private IRevisionDimensionProvider revDimProvider;
	
	@Inject
	private IFeatureVersionDimensionProvider featDimProvider;
	
	@Inject
	private IChangeDimensionProvider changeDimProvider;
	
	@Inject
	@Revision
	private IChoiceSpecificationService revisionSpecificationService;
	
	@Inject
	@Feature
	private IChoiceSpecificationService featureConfSpecificationService;
	
	@Inject
	private IProductDimensionFilterService dimFilterService;
	
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.
	 * ICompositeChoiceSpecificationService#specifyCompositeChoice(
	 * de.ubt.ai1.supermod.mm.core.VersionSpace, 
	 * de.ubt.ai1.supermod.mm.core.OptionBinding)
	 */
	@Override
	public OptionBinding specifyCompositeChoice(VersionSpace vs,
			OptionBinding proposedCompositeChoice,
			OptionBinding representedCompositeAmbition)
					throws UnderspecifiedVisibilityException {
		RevisionDimension revDim = revDimProvider.getRevisionDimension(vs);
		FeatureModel featureModel = featDimProvider.getFeatureDimension(vs);
		ChangeDimension changeDim = changeDimProvider.getChangeDimension(vs);
		
		// choose a revision.
		OptionBinding revisionChoice = revisionSpecificationService.
				specifyChoice(revDim, 
						ChangeSpaceUtil.filterBinding(
								proposedCompositeChoice, revDim),
						ChangeSpaceUtil.filterBinding(
								representedCompositeAmbition, revDim));
		if (revisionChoice == null) return null;
		OptionBinding completeRevisionChoice =
				changeDim.applyCompletions(
						revDim.applyCompletions(revisionChoice));
		
		// filter the feature model by the revision.
		FeatureModel filteredFeatureModel = (FeatureModel) 
				dimFilterService.filter(featureModel, completeRevisionChoice);
		
		// map feature configuration
		OptionBinding proposedFeatureChoice = ChangeSpaceUtil.filterBinding(
				proposedCompositeChoice, featureModel);
		proposedFeatureChoice = FeatureModelUtil.mapFeatureConfiguration(
				proposedFeatureChoice, featureModel, filteredFeatureModel, 
				false);
		OptionBinding representedFeatureAmb = ChangeSpaceUtil.filterBinding(
				representedCompositeAmbition, featureModel);
		representedFeatureAmb = FeatureModelUtil.mapFeatureConfiguration(
				representedFeatureAmb, featureModel, filteredFeatureModel, 
				true);
		
		// choose a feature configuration in the filtered feature model.
		OptionBinding featureChoice = featureConfSpecificationService
				.specifyChoice(filteredFeatureModel, proposedFeatureChoice,
						representedFeatureAmb);
		if (featureChoice == null) return null;		
		featureChoice = FeatureModelUtil.mapFeatureConfiguration(
				featureChoice, filteredFeatureModel, featureModel, false);
				
		// compose the choice.
		OptionBinding compositeChoice = SuperModCoreFactory.eINSTANCE
				.createOptionBinding();
		compositeChoice.getBoundOptions().putAll(
				revisionChoice.getBoundOptions());
		compositeChoice.getBoundOptions().putAll(
				featureChoice.getBoundOptions());
		return compositeChoice;
	}

}
