/******************************************************************************
 * Copyright (c) 2018 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.collab.client.impl;


import org.eclipse.emf.ecore.util.EcoreUtil;

import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.mm.collab.PrivateRevision;
import de.ubt.ai1.supermod.mm.core.Option;
import de.ubt.ai1.supermod.mm.core.VersionDimension;
import de.ubt.ai1.supermod.service.generic.client.impl.AbstractScoreBasedDefaultResolver;

/**
 * Custom default resolution provider for the collab dimension.
 * <p>
 * Supported strategies: '<em>Random</em>', '<em>Most Recent</em>', '<em>Least
 * Recent</em>', '<em>Mine</em>', '<em>Their</em>'
 * 
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>,
 * 			Johannes Schroepfer <Johannes.M.Schroepfer(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	2018-01-09
 */
public class CollabDefaultResolver extends AbstractScoreBasedDefaultResolver {
	
	public static final int MAX_PRIVATE = 1000;
	
	/*
	 * (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.impl.AbstractScoreBasedDefaultResolver#getScore(
	 * de.ubt.ai1.supermod.mm.core.Option,
	 * de.ubt.ai1.supermod.service.client.IDefaultResolver.Strategy)
	 */
	@Override
	protected int getScore(Option option, Strategy strategy) {
		
		if (option.getHighLevelConcept() instanceof PrivateRevision) {
			PrivateRevision pr = (PrivateRevision) option.getHighLevelConcept();
			String author = pr.getPublicRevision().getCommitter();
			VersionDimension vd = (VersionDimension) EcoreUtil.getRootContainer(option);
			LocalRepository repo = (LocalRepository) vd.getVersionSpace().getRepository();
			switch (strategy) {
				case MOST_RECENT:				
					return pr.getPublicRevision().getRevisionNumber() * MAX_PRIVATE
							+ pr.getRevisionNumber();
				case LEAST_RECENT:
					return Integer.MAX_VALUE - (pr.getPublicRevision().getRevisionNumber() 
							* MAX_PRIVATE + pr.getRevisionNumber());
				case MINE:
					if (author != null && author.equals(repo.getRemoteUser()))
						return 1;
					break;
				case THEIR:
					if (author != null && !author.equals(repo.getRemoteUser()))
						return 1;
					break;
				default:
					return -1;
			}
		}
		return -1;
	}
}
