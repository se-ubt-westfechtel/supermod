/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.collab.client.impl;

import java.util.Date;
import java.util.concurrent.atomic.AtomicReference;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;

import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.mm.collab.CollaborativeRevisionDimension;
import de.ubt.ai1.supermod.mm.collab.PrivateRevision;
import de.ubt.ai1.supermod.mm.collab.PublicRevision;
import de.ubt.ai1.supermod.mm.collab.Revision;
import de.ubt.ai1.supermod.mm.collab.SuperModCollabFactory;
import de.ubt.ai1.supermod.mm.core.DefaultBinding;
import de.ubt.ai1.supermod.mm.core.Option;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.OptionRef;
import de.ubt.ai1.supermod.mm.core.Preference;
import de.ubt.ai1.supermod.mm.core.SuperModCoreFactory;
import de.ubt.ai1.supermod.mm.core.Tristate;
import de.ubt.ai1.supermod.mm.core.VersionDimension;
import de.ubt.ai1.supermod.service.client.IAmbitionSpecificationService;

/**
 * An implementation of the ambition specification service which is specific
 * to the collab version dimension. The specification of an ambition
 * corresponds to the creation of a new private revision in the revision graph,
 * for which the user has to specify additional details such as the commit
 * message. The revision is automatically considered as the successor of the
 * revision represented by the choice.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	28.10.2015
 */
public class CollabAmbitionSpecificationService
implements IAmbitionSpecificationService {

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IAmbitionSpecificationService
	 * #specifyAmbition(de.ubt.ai1.supermod.mm.core.VersionDimension,
	 * de.ubt.ai1.supermod.mm.core.OptionBinding,
	 * de.ubt.ai1.supermod.mm.core.OptionBinding,
	 * de.ubt.ai1.supermod.mm.core.OptionBinding)
	 */
	@Override
	public OptionBinding specifyAmbition(VersionDimension dim, 
			OptionBinding choice, OptionBinding recordedAmbition,
			OptionBinding proposedAmbition) {
		
		int tid = ((LocalRepository) dim.getVersionSpace().getRepository())
				.getWriteTransactionId();
		CollaborativeRevisionDimension collDim =
					(CollaborativeRevisionDimension) dim;
		PublicRevision publicHead = collDim.getPublicHead();

		// Predecessors are those revisions selected in the choice, and the
		// private head, if any, otherwise the public head.
		EList<Revision> predecessors = new UniqueEList<Revision>(
				collDim.getRevisionsForBinding(choice));
		if (publicHead.getPrivateHead() != null) {
			predecessors.add(publicHead.getPrivateHead());
		}
		else {
			predecessors.add(publicHead);
		}		

		// ask the user for a commit message.
		AtomicReference<String> commitMsg = new AtomicReference<>();
		Display.getDefault().syncExec(new Runnable() {			
			@Override
			public void run() {
				InputDialog commitMsgInput = new InputDialog(
						Display.getDefault().getActiveShell(), "Commit Message", 
						"Please enter a message describing your commit.", "", 
						null);
				int result = commitMsgInput.open();
				if (result == Window.OK) {
					commitMsg.set(commitMsgInput.getValue());				
				}
			}
		});
		if (commitMsg.get() == null) {
			return null;
		}		
				
		// introduce a new private revision.
		PrivateRevision newRevision = SuperModCollabFactory.eINSTANCE
				.createPrivateRevision();
		newRevision.setTransactionId(tid);
		newRevision.setDate(new Date());
		newRevision.setCommitMessage(commitMsg.get());
		int revisionNumber = publicHead.getLatestPrivateRevisionNumber() + 1;
		newRevision.setRevisionNumber(revisionNumber);
		publicHead.setLatestPrivateRevisionNumber(revisionNumber);
		
		// add revision as the new head
		publicHead.getPrivateRevisions().add(newRevision);
		publicHead.setPrivateHead(newRevision);

		// add low-level rule base constraints, which realize the semantics
		// of the new revision in the revision graph.
		Option revOpt = SuperModCoreFactory.eINSTANCE.createOption();
		revOpt.setName("r" + newRevision.getDisplayRevisionNumber());
		newRevision.setRevisionOption(revOpt);

		// default binding
		DefaultBinding revDefault = SuperModCoreFactory.eINSTANCE
				.createDefaultBinding();
		revDefault.setName("r" + newRevision.getDisplayRevisionNumber()
				+ ":FALSE");
		revDefault.setOption(revOpt);
		revDefault.setState(Tristate.FALSE);
		newRevision.setRevisionDefaultBinding(revDefault);
		
		// predecessor preferences
		for (Revision privPred : predecessors) {
			Preference predPref = SuperModCoreFactory.eINSTANCE
					.createPreference();
			predPref.setName("r" + 
					newRevision.getDisplayRevisionNumber() +
					"=>r" + privPred.getDisplayRevisionNumber());
			predPref.setOption(privPred.getRevisionOption());
			OptionRef optRef = SuperModCoreFactory.eINSTANCE
					.createOptionRef();
			optRef.setOption(revOpt);
			predPref.setOptionExpr(optRef);
			newRevision.getPredecessorPreferences().add(predPref);
			newRevision.getPredecessors().add(privPred);
		}
		
		// create and return a binding which corresponds to the new revision.
		OptionBinding ambition = SuperModCoreFactory.eINSTANCE
				.createOptionBinding();
		ambition.bind(revOpt, Tristate.TRUE);
		return ambition;
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IAmbitionSpecificationService
	 * #undoAmbitionSpecification(de.ubt.ai1.supermod.mm.core.VersionDimension, 
	 * de.ubt.ai1.supermod.mm.core.OptionBinding)
	 */
	@Override
	public void undoAmbitionSpecification(VersionDimension dim, 
			OptionBinding specifiedAmbition) {
		if (specifiedAmbition == null) {
			return;
		}
		for (Option newO : specifiedAmbition.getBoundOptions().keySet()) {
			PrivateRevision newRev = (PrivateRevision) newO.getHighLevelConcept();
			newRev.setRevisionDefaultBinding(null);
			newRev.setRevisionOption(null);
			newRev.getPredecessorPreferences().clear();
			PrivateRevision oldHead = null;
			for (Revision rev : newRev.getPredecessors()) {
				if (rev instanceof PrivateRevision) {
					oldHead = (PrivateRevision) rev;
				}
			}
			newRev.getPredecessors().clear();
			newRev.getSuccessors().clear();
			PublicRevision publicHead = (PublicRevision) newRev.eContainer();
			if (oldHead != null) {
				publicHead.setPrivateHead(oldHead);
			}
			if (newRev.equals(publicHead.getInitialPrivateRevision())) {
				publicHead.setInitialPrivateRevision(null);
			}
			publicHead.getPrivateRevisions().remove(newRev);
			publicHead.setLatestPrivateRevisionNumber(
					publicHead.getLatestPrivateRevisionNumber() - 1);
		}				
	}

}
