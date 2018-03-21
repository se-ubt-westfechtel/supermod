/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.collab.client.impl;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.mm.collab.CollaborativeRevisionDimension;
import de.ubt.ai1.supermod.mm.collab.PublicRevision;
import de.ubt.ai1.supermod.mm.core.OptionRef;
import de.ubt.ai1.supermod.mm.core.Preference;
import de.ubt.ai1.supermod.mm.core.SuperModCoreFactory;
import de.ubt.ai1.supermod.service.client.IPullPostProcessor;
import de.ubt.ai1.supermod.service.collab.ICollabDimensionProvider;

/**
 * This implementation of the pull post processor service interface ensures
 * that incoming public revisions are connected as predecessors to the
 * current local public revision. This is realized by connecting the new
 * head of the merged revision graph to the current public revision.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	02.03.2016
 */
public class CollabPullPostProcessor implements IPullPostProcessor {
	
	@Inject
	private ICollabDimensionProvider collDimProvider;

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IPullPostProcessor
	 * #postProcess(de.ubt.ai1.supermod.mm.client.LocalRepository)
	 */
	@Override
	public void postProcess(LocalRepository repo) {
		CollaborativeRevisionDimension collDim = collDimProvider
				.getCollabDimension(repo.getVersionSpace());
		PublicRevision current = collDim.getCurrentPublicRevision();
		PublicRevision incomingHead = collDim.getPublicHead();
		if (current != null && incomingHead != null && current != incomingHead &&
				!current.getAllPredecessors().contains(incomingHead) &&
				!current.getAllSuccessors().contains(incomingHead)) {
			// connect current revision to public head (representing merged
			// incoming public revisions)
			current.getPredecessors().add(incomingHead);
			if (incomingHead.getPrivateHead() != null) {
				current.getPredecessors().add(incomingHead.getPrivateHead());
			}
			Preference predPref = SuperModCoreFactory.eINSTANCE
					.createPreference();
			predPref.setName("r" + 
					current.getRevisionNumber() +
					".0=>r" + incomingHead.getDisplayRevisionNumber());
			predPref.setOption(incomingHead.getFinishedOption());
			OptionRef optRef = SuperModCoreFactory.eINSTANCE
					.createOptionRef();
			optRef.setOption(current.getRevisionOption());
			predPref.setOptionExpr(optRef);
			current.getPredecessorPreferences().add(predPref);
			collDim.setPublicHead(current);
			incomingHead.setTransactionId(repo.getWriteTransactionId());
		}
	}

}
