/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.collab.client.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import de.ubt.ai1.supermod.mm.collab.CollaborativeRevisionDimension;
import de.ubt.ai1.supermod.mm.collab.Revision;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.SuperModCoreFactory;
import de.ubt.ai1.supermod.mm.core.Tristate;
import de.ubt.ai1.supermod.mm.core.VersionDimension;
import de.ubt.ai1.supermod.service.client.IChoiceMigrationService;

/**
 * An implementation of the choice migration service specific to the collab
 * revision dimension. It ensures that the new revision, which has been added
 * within the latest commit, is now part of the local choice.
 * 
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	23.10.2015
 */
public class CollabChoiceMigrationService implements IChoiceMigrationService {

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IChoiceMigrationService
	 * #migrateChoice(de.ubt.ai1.supermod.mm.core.VersionDimension,
	 * de.ubt.ai1.supermod.mm.core.OptionBinding, java.util.List)
	 */
	@Override
	public OptionBinding migrateChoice(VersionDimension dim, 
			OptionBinding choice, List<OptionBinding> ambitions) {
		CollaborativeRevisionDimension tempDim = 
				(CollaborativeRevisionDimension) dim;
		Set<Revision> chosenRevisions = new HashSet<>(tempDim
				.getRevisionsForBinding(choice));
		for (OptionBinding ambition : ambitions) {
			List<Revision> ambitionRevisions = tempDim
					.getRevisionsForBinding(ambition);
			for (Revision ambRev : ambitionRevisions) {
				chosenRevisions.removeAll(ambRev.getPredecessors());
			}
			chosenRevisions.addAll(ambitionRevisions);
		}
		OptionBinding ob = SuperModCoreFactory.eINSTANCE.createOptionBinding();
		for (Revision rev : chosenRevisions) {
			ob.bind(rev.getRevisionOption(), Tristate.TRUE);
		}
		return ob;
	}

}
