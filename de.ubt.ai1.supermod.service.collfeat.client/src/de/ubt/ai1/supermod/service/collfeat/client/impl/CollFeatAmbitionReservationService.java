/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.collfeat.client.impl;

import org.eclipse.emf.ecore.resource.Resource;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.feature.FeatureModel;
import de.ubt.ai1.supermod.mm.feature.util.FeatureModelUtil;
import de.ubt.ai1.supermod.service.client.IAmbitionReservationService;
import de.ubt.ai1.supermod.service.client.IAmbitionSpecificationService;
import de.ubt.ai1.supermod.service.feature.Feature;
import de.ubt.ai1.supermod.service.feature.IFeatureVersionDimensionProvider;
import de.ubt.ai1.supermod.service.feature.client.ISingleVersionFeatureModelDescriptorProvider;

/**
 * An implementation of the ambition reservation service, which
 * accesses an ambition specification service for the feature dimension.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	28.10.2015
 */
public class CollFeatAmbitionReservationService
implements IAmbitionReservationService {
	
	@Inject
	@Feature
	private IAmbitionSpecificationService featSpecService;
	
	@Inject
	private IFeatureVersionDimensionProvider featDimProvider;

	@Inject
	private ISingleVersionFeatureModelDescriptorProvider featDescProvider;
	
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IAmbitionReservationService
	 * #reserveAmbition(de.ubt.ai1.supermod.service.client.LocalRepository)
	 */
	@Override
	public OptionBinding reserveAmbition(LocalRepository repo) {
		FeatureModel repoFm = featDimProvider.getFeatureDimension(
				repo.getVersionSpace());
		FeatureModel localFm = featDescProvider.
				getSingleVersionFeatureModelDescriptor(
						repo.getLocalDescriptor()).getFeatureModel();
		OptionBinding localChoice = FeatureModelUtil.mapFeatureConfiguration(
				repo.getLocalChoice(), repoFm, localFm, false);
		OptionBinding localAmbition = FeatureModelUtil.mapFeatureConfiguration(
				repo.getLocalAmbition(), repoFm, localFm, false);
		OptionBinding specAmb = featSpecService.specifyAmbition(
				localFm, localChoice, null, localAmbition);
		OptionBinding repoAmb = FeatureModelUtil.mapFeatureConfiguration(
				specAmb, localFm, repoFm, true);
		if (repoAmb == null) {
			return null;
		}
		Resource lrRes = repo.eResource().getResourceSet().getResource(
				repo.eResource().getURI().trimFileExtension()
				.appendFileExtension("lamb"), true);		
		lrRes.getContents().clear();
		repo.setLocalAmbition(repoAmb);
		lrRes.getContents().add(repoAmb);
		return specAmb;
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IAmbitionReservationService
	 * #cancelAmbitionReservation(
	 * de.ubt.ai1.supermod.service.client.LocalRepository)
	 */
	@Override
	public void cancelAmbitionReservation(LocalRepository repo) {
		if (repo.getLocalAmbition() != null) {
			repo.getLocalAmbition().clear();
		}		repo.setLocalAmbition(null);
	}


}
