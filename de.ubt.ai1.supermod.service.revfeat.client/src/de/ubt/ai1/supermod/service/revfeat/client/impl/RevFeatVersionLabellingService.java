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
import de.ubt.ai1.supermod.mm.core.OptionExpr;
import de.ubt.ai1.supermod.mm.core.VersionSpace;
import de.ubt.ai1.supermod.mm.feature.FeatureModel;
import de.ubt.ai1.supermod.mm.revision.RevisionDimension;
import de.ubt.ai1.supermod.service.client.IVersionLabellingService;
import de.ubt.ai1.supermod.service.feature.Feature;
import de.ubt.ai1.supermod.service.feature.IFeatureVersionDimensionProvider;
import de.ubt.ai1.supermod.service.revision.IRevisionDimensionProvider;
import de.ubt.ai1.supermod.service.revision.Revision;

/**
 * Implementation of the version labelling service which is specific to the
 * rev-feat version space in which visibilities are composed by change options
 * only. For each option bindings, the revision and the feature part are
 * separated using <code>|</code>.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	03.03.2015
 */
public class RevFeatVersionLabellingService
implements IVersionLabellingService {

	@Inject
	private IRevisionDimensionProvider revDimProvider;
	
	@Inject
	private IFeatureVersionDimensionProvider featDimProvider;
	
	@Inject
	@Revision
	private IVersionLabellingService revLabellingService;
	
	@Inject
	@Feature
	private IVersionLabellingService featLabellingService;	


	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IVersionLabellingService
	 * #getLabel(de.ubt.ai1.supermod.mm.core.OptionBinding, 
	 * de.ubt.ai1.supermod.mm.core.VersionSpace)
	 */
	@Override
	public String getLabel(OptionBinding ob, VersionSpace vs, boolean ambition) {
		if (ob == null) return null;
		RevisionDimension revDim = revDimProvider.getRevisionDimension(vs);
		
		OptionBinding revOb = ChangeSpaceUtil.filterBinding(ob, revDim);
		OptionBinding featOb = ChangeSpaceUtil.rejectBinding(ob, revDim);
		
		String featLabel = featOb == null ? null :
			featLabellingService.getLabel(featOb, vs, ambition);
		
		String s = "(";
		if (!ambition) {
			String revLabel = revOb == null ? null :
				revLabellingService.getLabel(revOb, vs, ambition);
			if (featOb.getNumberOfBindings() == 0) {
				return revLabel;
			}
			if (revLabel == null) {
				revLabel = revLabellingService.getDefaultLabel();
			}
			s += revLabel + " | ";
		}	
		
		s = s + featLabel + ")";
		return s;
	}


	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IVersionLabellingService
	 * #getLabel(de.ubt.ai1.supermod.mm.core.OptionExpr, 
	 * de.ubt.ai1.supermod.mm.core.VersionSpace)
	 */
	@Override
	public String getLabel(OptionExpr expr, VersionSpace vs) {
		if (expr == null) return null;
		FeatureModel featDim = featDimProvider.getFeatureDimension(vs);
		OptionExpr expandedExpr = ChangeSpaceUtil.expandExpression(
				expr.extract());
		String revLabel = revLabellingService.getLabel(expandedExpr, vs);
		String featLabel = featLabellingService.getLabel(ChangeSpaceUtil
				.filterExpression(expandedExpr, featDim), vs);
		if (revLabel == null) {
			revLabel = revLabellingService.getDefaultLabel();
		}
		if (featLabel == null) {
			return revLabel;
		}
		return "(" + revLabel + " | " + featLabel + ")";
	}


	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IVersionLabellingService
	 * #getDefaultLabel()
	 */
	@Override
	public String getDefaultLabel() {
		return "0";
	}

}
