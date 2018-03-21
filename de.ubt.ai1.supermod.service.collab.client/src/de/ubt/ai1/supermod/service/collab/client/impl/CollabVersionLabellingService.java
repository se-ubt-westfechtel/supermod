/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.collab.client.impl;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.collab.CollaborativeRevisionDimension;
import de.ubt.ai1.supermod.mm.collab.PublicRevision;
import de.ubt.ai1.supermod.mm.collab.Revision;
import de.ubt.ai1.supermod.mm.core.Option;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.OptionExpr;
import de.ubt.ai1.supermod.mm.core.VersionSpace;
import de.ubt.ai1.supermod.service.client.IVersionLabellingService;
import de.ubt.ai1.supermod.service.collab.ICollabDimensionProvider;

/**
 * An implementation of the version labelling service specific to a version
 * space which consists of only a collab dimension. For visibilities, the
 * revision number of the latest change is provided; in case of an option
 * binding, a comma-separated sequence of the latest revisions represented by
 * it is returned.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	23.10.2015
 */
public class CollabVersionLabellingService implements IVersionLabellingService {
	
	@Inject
	private ICollabDimensionProvider collDimProvider;

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IVersionLabellingService
	 * #getLabel(de.ubt.ai1.supermod.mm.core.OptionBinding,
	 * de.ubt.ai1.supermod.mm.core.VersionSpace, boolean)
	 */
	@Override
	public String getLabel(OptionBinding ob, VersionSpace vs, boolean ambition){
		CollaborativeRevisionDimension collDim = collDimProvider
				.getCollabDimension(vs);
		EList<Revision> latestRevs = collDim.getLatestRevisions(
				collDim.getRevisionsForBinding(ob));
		if (latestRevs.size() > 1) {
			List<PublicRevision> pubRevs = new LinkedList<>();
			for (Revision lr : latestRevs) {
				if (lr instanceof PublicRevision) {
					pubRevs.add((PublicRevision) lr);
				}
			}
			if (pubRevs.size() < latestRevs.size()) {
				latestRevs.removeAll(pubRevs);
			}
		}
		String s = "";
		for (Revision latestRev : latestRevs) {
			s += latestRev.getDisplayRevisionNumber() + ",";
		}
		if (s.endsWith(",")) {
			s = s.substring(0, s.length() - 1);
		}
		if (s.isEmpty()) {
			s = getDefaultLabel();
		}
		return s;
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IVersionLabellingService
	 * #getLabel(de.ubt.ai1.supermod.mm.core.OptionExpr,
	 * de.ubt.ai1.supermod.mm.core.VersionSpace)
	 */
	@Override
	public String getLabel(OptionExpr expr, VersionSpace vs) {
		if (expr != null) {
			EList<Option> options = new BasicEList<Option>(
					expr.getReferencedOptions());
			ECollections.reverse(options);
			if (!options.isEmpty()) {
				for (Option o : options) {
					if (o.getHighLevelConcept() instanceof Revision) {
						Revision latestRev = (Revision) o.getHighLevelConcept();
						return latestRev.getDisplayRevisionNumber();
					}
				}				
			}
		}
		return "";
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IVersionLabellingService
	 * #getDefaultLabel()
	 */
	@Override
	public String getDefaultLabel() {
		return "0.0";
	}

}
