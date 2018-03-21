/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.revision.client.impl;

import java.util.Date;
import java.util.concurrent.atomic.AtomicReference;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;

import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.mm.core.DefaultBinding;
import de.ubt.ai1.supermod.mm.core.Invariant;
import de.ubt.ai1.supermod.mm.core.Option;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.OptionRef;
import de.ubt.ai1.supermod.mm.core.Preference;
import de.ubt.ai1.supermod.mm.core.SuperModCoreFactory;
import de.ubt.ai1.supermod.mm.core.Tristate;
import de.ubt.ai1.supermod.mm.core.VersionDimension;
import de.ubt.ai1.supermod.mm.revision.Revision;
import de.ubt.ai1.supermod.mm.revision.RevisionDimension;
import de.ubt.ai1.supermod.mm.revision.SuperModRevisionFactory;
import de.ubt.ai1.supermod.service.client.IAmbitionSpecificationService;

/**
 * An implementation of the ambition specification service which is specific
 * to the revision version dimension. The specification of an ambition
 * corresponds to the creation of a new revision in the revision graph, for
 * which the user has to specify additional details such as the commit message.
 * The revision is automatically considered as the successor of the revision
 * represented by the choice.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	01.08.2014
 */
public class RevisionAmbitionSpecificationService 
implements IAmbitionSpecificationService {

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IAmbitionSpecificationService
	 * #specifyAmbition(de.ubt.ai1.supermod.mm.core.VersionDimension, 
	 * de.ubt.ai1.supermod.mm.core.OptionBinding, 
	 * de.ubt.ai1.supermod.mm.core.OptionBinding)
	 */
	@Override
	public OptionBinding specifyAmbition(VersionDimension dim, 
			OptionBinding choice, OptionBinding recordedAmbition, 
			OptionBinding proposedAmbition) {
		
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
		
		// analyze the current revision graph.
		// Predecessors are those revisions selected in the choice, and the
		// last revision committed.
		RevisionDimension revDim = (RevisionDimension) dim;
		EList<Revision> predecessors = new UniqueEList<Revision>(
				revDim.getRevisionsForBinding(choice));
		int nRev = revDim.getRevisions().size();
		if (nRev > 0) {
			predecessors.add(revDim.getRevisions().get(nRev - 1));
		}
		
		boolean isHead = revDim.getHead() == null ||
				predecessors.contains(revDim.getHead());
		boolean isInitial = revDim.getInitialRevision() != null;
		
		// introduce a new revision.
		Revision newRevision = SuperModRevisionFactory.eINSTANCE
				.createRevision();
		newRevision.setCommitMessage(commitMsg.get());
		if (dim.getVersionSpace() != null &&
				dim.getVersionSpace().getRepository() instanceof LocalRepository) {
			newRevision.setCommitter(((LocalRepository)
					dim.getVersionSpace().getRepository()).getRemoteUser());
		}
		else {
			newRevision.setCommitter(System.getProperty("user.name"));
		}
		newRevision.setDate(new Date());
		int revisionNumber = revDim.getLatestRevisionNumber() + 1;
		newRevision.setRevisionNumber(revisionNumber);
		revDim.setLatestRevisionNumber(revisionNumber);
		
		// add low-level rule base constraints, which realize the semantics
		// of the new revision in the revision graph.
		Option revOpt = SuperModCoreFactory.eINSTANCE.createOption();
		revOpt.setName("r" + revisionNumber);
		newRevision.setRevisionOption(revOpt);
		
		// initial revision invariant
		if (isInitial) {
			Invariant initInv = SuperModCoreFactory.eINSTANCE.createInvariant();
			OptionRef optRef = SuperModCoreFactory.eINSTANCE
					.createOptionRef();
			optRef.setOption(revOpt);
			initInv.setName("init:r" + revisionNumber);
			initInv.setOptionExpr(optRef);
			revDim.setInitialRevision(newRevision);
			revDim.setInitialRevisionInvariant(initInv);
		}
		
		// default binding
		DefaultBinding revDefault = SuperModCoreFactory.eINSTANCE
				.createDefaultBinding();
		revDefault.setName("r" + revisionNumber + ":FALSE");
		revDefault.setOption(revOpt);
		revDefault.setState(Tristate.FALSE);
		newRevision.setRevisionDefaultBinding(revDefault);
		
		newRevision.getPredecessors().addAll(predecessors);
		for (Revision predecessor : predecessors) {
			// predecessor preference
			Preference predPref = SuperModCoreFactory.eINSTANCE
					.createPreference();
			predPref.setName("r" + revisionNumber + "=>r" + predecessor
					.getRevisionNumber());
			predPref.setOption(predecessor.getRevisionOption());
			OptionRef optRef = SuperModCoreFactory.eINSTANCE
					.createOptionRef();
			optRef.setOption(revOpt);
			predPref.setOptionExpr(optRef);
			newRevision.getPredecessorPreferences().add(predPref);
		}		
		
		// switch the head in case this revision is a successor of the previous
		// head.
		revDim.getRevisions().add(newRevision);
		if (isHead) {
			revDim.setHead(newRevision);
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
			OptionBinding revAmb) {
		if (revAmb == null) {
			return;
		}
		for (Option newO : revAmb.getBoundOptions().keySet()) {
			Revision newRev = (Revision) newO.getHighLevelConcept();
			newRev.setRevisionDefaultBinding(null);
			newRev.setRevisionOption(null);
			newRev.getPredecessorPreferences().clear();
			Revision oldHead = newRev.getPredecessors().isEmpty() ? null :
				newRev.getPredecessors().get(0);
			newRev.getPredecessors().clear();
			newRev.getSuccessors().clear();
			RevisionDimension rg = (RevisionDimension) newRev.eContainer();
			if (newRev.equals(rg.getHead())) {
				rg.setHead(oldHead);
			}
			if (newRev.equals(rg.getInitialRevision())) {
				rg.setInitialRevision(null);
				rg.setInitialRevisionInvariant(null);
			}
			rg.getRevisions().remove(newRev);
			rg.setLatestRevisionNumber(rg.getLatestRevisionNumber() - 1);
		}		
	}
	
}
