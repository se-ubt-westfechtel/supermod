/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.collab.client.impl;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;

import de.ubt.ai1.supermod.mm.collab.CollaborativeRevisionDimension;
import de.ubt.ai1.supermod.mm.collab.PrivateRevision;
import de.ubt.ai1.supermod.mm.collab.Revision;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.SuperModCoreFactory;
import de.ubt.ai1.supermod.mm.core.Tristate;
import de.ubt.ai1.supermod.mm.core.VersionDimension;
import de.ubt.ai1.supermod.service.client.IChoiceUpdatingService;

/**
 * An implementation of the choice updating service specific to the collab
 * revision dimension. It replaces the currently selected temporal part of the
 * choice, which corresponds to a revision selection, with the latest available
 * direct or indirect successor of the selected revision.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	28.10.2015
 */
public class CollabChoiceUpdatingService implements IChoiceUpdatingService {

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IChoiceUpdatingService
	 * #updateChoice(de.ubt.ai1.supermod.mm.core.VersionDimension,
	 * de.ubt.ai1.supermod.mm.core.OptionBinding)
	 */
	@Override
	public OptionBinding updateChoice(VersionDimension dim, 
			OptionBinding choice) {
		CollaborativeRevisionDimension collDim =
				(CollaborativeRevisionDimension) dim;
		EList<Revision> chosenRevisions = ECollections.newBasicEList(
				collDim.getRevisionsForBinding(choice));
		if (chosenRevisions.isEmpty()) {
			if (collDim.getInitialPublicRevision() != null) {
				chosenRevisions.add(collDim.getInitialPublicRevision());
			}
		}
		EList<Revision> latestRevisions = new UniqueEList<>();
		// find the latest available successor.
		for (Revision rev : chosenRevisions) {
			latestRevisions.addAll(rev.getLatestSuccessors());
		}
		OptionBinding ob = SuperModCoreFactory.eINSTANCE.createOptionBinding();
		for (Revision rev : latestRevisions) {
			if (rev instanceof PrivateRevision &&
					((PrivateRevision) rev).getPublicRevision().isFinished()) {
				ob.bind(((PrivateRevision) rev).getPublicRevision()
						.getFinishedOption(), Tristate.TRUE);
			}			
			else {
				ob.bind(rev.getRevisionOption(), Tristate.TRUE);
			}
		}
		return ob;
	}

}
