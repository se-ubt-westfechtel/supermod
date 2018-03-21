/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.collfeat.client.impl;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.mm.client.SingleVersionProductSpaceDescriptor;
import de.ubt.ai1.supermod.mm.core.VersionSpace;
import de.ubt.ai1.supermod.mm.feature.FeatureModel;
import de.ubt.ai1.supermod.service.client.IVersionDimensionEditingService;
import de.ubt.ai1.supermod.service.client.IVersionSpaceEditingService;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;
import de.ubt.ai1.supermod.service.feature.Feature;
import de.ubt.ai1.supermod.service.feature.client.ISingleVersionFeatureModelDescriptorProvider;

/**
 * An implementation of the version space editing interface which
 * uses a feature version dimension editing service in order to
 * edit the current revision of the feature model. The collaborative
 * revision dimension is immutable to the user.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	28.10.2015
 */
public class CollFeatVersionSpaceEditingService 
implements IVersionSpaceEditingService {

	@Inject
	private ISingleVersionFeatureModelDescriptorProvider
	featureModelDescProvider;
	
	@Inject
	@Feature
	private IVersionDimensionEditingService featureModelEditingService;

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IVersionSpaceEditingService
	 * #isEditable(de.ubt.ai1.supermod.mm.core.VersionSpace)
	 */
	@Override
	public boolean isEditable(VersionSpace vs) {
		if (vs != null && vs.getRepository() instanceof LocalRepository) {
			SingleVersionProductSpaceDescriptor psDescriptor = 
					((LocalRepository) vs.getRepository()).getLocalDescriptor();
			FeatureModel featureModel = featureModelDescProvider
					.getSingleVersionFeatureModelDescriptor(psDescriptor)
					.getFeatureModel();
			return featureModel != null && 
					featureModelEditingService.isEditable(featureModel);
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IVersionSpaceEditingService
	 * #openEditor(de.ubt.ai1.supermod.mm.core.VersionSpace)
	 */
	@Override
	public void openEditor(VersionSpace vs) throws SuperModClientException {
		SingleVersionProductSpaceDescriptor psDescriptor = 
				((LocalRepository) vs.getRepository()).getLocalDescriptor();
		FeatureModel featureModel = featureModelDescProvider
				.getSingleVersionFeatureModelDescriptor(psDescriptor)
				.getFeatureModel();
		featureModelEditingService.openEditor(featureModel);		
	}

	
}
