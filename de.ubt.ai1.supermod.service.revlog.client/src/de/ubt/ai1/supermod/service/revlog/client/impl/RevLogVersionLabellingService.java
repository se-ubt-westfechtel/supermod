/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.revlog.client.impl;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.change.util.ChangeSpaceUtil;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.OptionExpr;
import de.ubt.ai1.supermod.mm.core.VersionSpace;
import de.ubt.ai1.supermod.mm.logical.LogicalDimension;
import de.ubt.ai1.supermod.mm.revision.RevisionDimension;
import de.ubt.ai1.supermod.service.client.IVersionLabellingService;
import de.ubt.ai1.supermod.service.logical.ILogicalDimensionProvider;
import de.ubt.ai1.supermod.service.logical.Logical;
import de.ubt.ai1.supermod.service.revision.IRevisionDimensionProvider;
import de.ubt.ai1.supermod.service.revision.Revision;

/**
 * Implementation of the version labelling service which is specific to the
 * rev-log version space in which visibilities are composed by change options
 * only. For each option bindings, the temporal and the logical part are
 * represented using the <code>|</code> as the separator.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	31.10.2014
 */
public class RevLogVersionLabellingService
implements IVersionLabellingService {
	
	@Inject
	private IRevisionDimensionProvider revDimProvider;
	
	@Inject
	private ILogicalDimensionProvider logDimProvider;
	
	@Inject
	@Revision
	private IVersionLabellingService revLabellingService;
	
	@Inject
	@Logical
	private IVersionLabellingService logLabellingService;	


	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IVersionLabellingService
	 * #getLabel(de.ubt.ai1.supermod.mm.core.OptionBinding, 
	 * de.ubt.ai1.supermod.mm.core.VersionSpace)
	 */
	@Override
	public String getLabel(OptionBinding ob, VersionSpace vs, boolean ambition) {
		RevisionDimension revDim = revDimProvider.getRevisionDimension(vs);
		LogicalDimension logDim = logDimProvider.getLogicalDimension(vs);
		
		OptionBinding revOb = ChangeSpaceUtil.filterBinding(ob, revDim);
		OptionBinding logOb = ChangeSpaceUtil.filterBinding(ob, logDim);
		
		String s = "(";
		if (!ambition) {
			String revLabel = revOb == null ? null :
				revLabellingService.getLabel(revOb, vs, ambition);
			if (revLabel == null) {
				revLabel = revLabellingService.getDefaultLabel();
			}
			s += revLabel + " | ";
		}
		String logLabel = logOb == null ? null :
			logLabellingService.getLabel(logOb, vs, ambition);		
		if (logLabel == null) {
			logLabel = logLabellingService.getDefaultLabel();
		}
		s += logLabel + ")";
		return s;
	}


	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IVersionLabellingService
	 * #getLabel(de.ubt.ai1.supermod.mm.core.OptionExpr, 
	 * de.ubt.ai1.supermod.mm.core.VersionSpace)
	 */
	@Override
	public String getLabel(OptionExpr expr, VersionSpace vs) {
		LogicalDimension logDim = logDimProvider.getLogicalDimension(vs);
		OptionExpr expandedExpr = ChangeSpaceUtil.expandExpression(
				expr.extract());
		String revLabel = revLabellingService.getLabel(expandedExpr, vs);
		String logLabel = logLabellingService.getLabel(ChangeSpaceUtil
				.filterExpression(expandedExpr, logDim), vs);
		if (revLabel == null) {
			revLabel = revLabellingService.getDefaultLabel();
		}
		if (logLabel == null) {
			logLabel = logLabellingService.getDefaultLabel();
		}
		return "(" + revLabel + " | " + logLabel + ")";
	}


	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IVersionLabellingService#getDefaultLabel()
	 */
	@Override
	public String getDefaultLabel() {
		return "0";
	}

}
