/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.collab.client.impl;

import java.util.HashSet;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.mm.collab.CollaborativeRevisionDimension;
import de.ubt.ai1.supermod.mm.collab.PublicRevision;
import de.ubt.ai1.supermod.mm.collab.Revision;
import de.ubt.ai1.supermod.mm.collab.SuperModCollabFactory;
import de.ubt.ai1.supermod.mm.core.DefaultBinding;
import de.ubt.ai1.supermod.mm.core.Invariant;
import de.ubt.ai1.supermod.mm.core.Option;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.OptionRef;
import de.ubt.ai1.supermod.mm.core.Preference;
import de.ubt.ai1.supermod.mm.core.SuperModCoreFactory;
import de.ubt.ai1.supermod.mm.core.Tristate;
import de.ubt.ai1.supermod.service.client.IClonePostProcessor;
import de.ubt.ai1.supermod.service.client.IPushPostProcessor;
import de.ubt.ai1.supermod.service.client.ISharePostProcessor;
import de.ubt.ai1.supermod.service.collab.ICollabDimensionProvider;

/**
 * An implementation of both the clone and the push post processor client 
 * service interfaces
 * specific to the "pure collaborative" version space. A new public revision
 * is introduced to the collaborative dimension of the repository, and all
 * details are set accordingly.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	12.11.2015
 */
public class CollabPushShareClonePostProcessor
implements IClonePostProcessor, IPushPostProcessor, ISharePostProcessor {
	
	@Inject
	private ICollabDimensionProvider collDimProvider;
	
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IClonePostProcessor
	 * #postProcess(de.ubt.ai1.supermod.mm.client.LocalRepository, int)
	 */
	@Override
	public void postProcess(LocalRepository repo, int newTid) {
		CollaborativeRevisionDimension collDim = collDimProvider
				.getCollabDimension(repo.getVersionSpace());
		
		// create new public revision
		PublicRevision rev = SuperModCollabFactory.eINSTANCE
				.createPublicRevision();
		rev.setTransactionId(newTid);
		rev.setRevisionNumber(newTid);
		rev.setCommitter(repo.getRemoteUser());
		collDim.getPublicRevisions().add(rev);
		collDim.setLatestPublicRevisionNumber(newTid);

		// create revision option.
		Option revOpt = SuperModCoreFactory.eINSTANCE.createOption();
		revOpt.setName("r" + rev.getDisplayRevisionNumber());
		rev.setRevisionOption(revOpt);
		
		// default binding
		DefaultBinding revDefault = SuperModCoreFactory.eINSTANCE
				.createDefaultBinding();
		revDefault.setName("r" + rev.getDisplayRevisionNumber()
				+ ":FALSE");
		revDefault.setOption(revOpt);
		revDefault.setState(Tristate.FALSE);
		rev.setRevisionDefaultBinding(revDefault);
		
		// connect to the current head, if any
		PublicRevision head = collDim.getPublicHead();
		if (head != null) {
			rev.getPredecessors().add(head);
			if (head.getPrivateHead() != null) {
				rev.getPredecessors().add(head.getPrivateHead());
			}
			Preference predPref = SuperModCoreFactory.eINSTANCE
					.createPreference();
			predPref.setName("r" + 
					rev.getDisplayRevisionNumber() +
					"=>r" + head.getDisplayRevisionNumber());
			predPref.setOption(head.getFinishedOption());
			OptionRef optRef = SuperModCoreFactory.eINSTANCE
					.createOptionRef();
			optRef.setOption(revOpt);
			predPref.setOptionExpr(optRef);
			rev.getPredecessorPreferences().add(predPref);
		}
		collDim.setPublicHead(rev);
		
		// if not existing, create public initial invariant
		if (collDim.getInitialPublicRevision() == null) {
			Invariant initInv = SuperModCoreFactory.eINSTANCE.createInvariant();
			initInv.setName("r" + 
							rev.getDisplayRevisionNumber() + "_init");
			OptionRef optRef = SuperModCoreFactory.eINSTANCE
					.createOptionRef();
			optRef.setOption(revOpt);
			initInv.setOptionExpr(optRef);
			collDim.setInitialPublicRevisionInvariant(initInv);
			collDim.setInitialPublicRevision(rev);
		}
		
		// set new revision as current
		collDim.setCurrentPublicRevision(rev);
		
		// update the local choice
		OptionBinding choice = repo.getLocalChoice();
		for (Option o : new HashSet<Option>(choice.getBoundOptions().keySet())) {
			if (o.getHighLevelConcept() instanceof Revision) {
				choice.getBoundOptions().removeKey(o);
			}
		}
		choice.bind(revOpt, Tristate.TRUE);
	}


}
