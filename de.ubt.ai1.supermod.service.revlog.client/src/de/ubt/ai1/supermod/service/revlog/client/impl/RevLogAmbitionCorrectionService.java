/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.revlog.client.impl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.change.Change;
import de.ubt.ai1.supermod.mm.change.ChangeDimension;
import de.ubt.ai1.supermod.mm.change.ChangeSet;
import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.mm.core.BinaryExpr;
import de.ubt.ai1.supermod.mm.core.Option;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.OptionExpr;
import de.ubt.ai1.supermod.mm.core.Tristate;
import de.ubt.ai1.supermod.mm.revision.Revision;
import de.ubt.ai1.supermod.service.change.IChangeDimensionProvider;
import de.ubt.ai1.supermod.service.client.IAmbitionCorrectionService;
import de.ubt.ai1.supermod.service.client.IAmbitionSpecificationService;
import de.ubt.ai1.supermod.service.logical.Logical;

/**
 * Implementation of the ambition correction service specific to the rev-log
 * version space. The retrospectively changed ambition lies within the
 * transparent change space. For correction, the logical ambition specification
 * dialog is shown to the user.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	29.09.2015
 */
public class RevLogAmbitionCorrectionService
implements IAmbitionCorrectionService {
	
	@Inject
	private IChangeDimensionProvider changeDimProvider;
	
	@Inject
	@Logical
	private IAmbitionSpecificationService logAmbSpecService;

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IAmbitionCorrectionService
	 * #canCorrect(de.ubt.ai1.supermod.mm.client.LocalRepository)
	 */
	@Override
	public boolean canCorrect(LocalRepository repo) {
		if (repo == null) return false;
		ChangeDimension changeDim = 
				changeDimProvider.getChangeDimension(repo.getVersionSpace());
		if (changeDim == null || getLatestChangeSet(changeDim) == null) {
			return false;
		}
		else return true;
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IAmbitionCorrectionService
	 * #getAmbitionToCorrect(de.ubt.ai1.supermod.mm.client.LocalRepository)
	 */
	@Override
	public OptionBinding getAmbitionToCorrect(LocalRepository repo) {
		ChangeDimension changeDim = 
				changeDimProvider.getChangeDimension(repo.getVersionSpace());
		ChangeSet cs = getLatestChangeSet(changeDim);
		Change c = cs.getChanges().get(1);
		return c.getUserAmbitionBinding();
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IAmbitionCorrectionService
	 * #specifyCorrectingAmbition(de.ubt.ai1.supermod.mm.client.LocalRepository,
	 * de.ubt.ai1.supermod.mm.core.OptionBinding,
	 * de.ubt.ai1.supermod.mm.core.OptionBinding)
	 */
	@Override
	public OptionBinding specifyCorrectingAmbition(LocalRepository repo, 
			OptionBinding choice, OptionBinding ambitionToCorrect) {
		ChangeDimension changeDim = 
				changeDimProvider.getChangeDimension(repo.getVersionSpace());
		return logAmbSpecService.specifyAmbition(changeDim, choice, null,
				ambitionToCorrect);
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IAmbitionCorrectionService
	 * #correct(de.ubt.ai1.supermod.mm.client.LocalRepository,
	 * de.ubt.ai1.supermod.mm.core.OptionBinding)
	 */
	@Override
	public void correct(LocalRepository repo, OptionBinding correctedAmbition) {
		ChangeDimension changeDim = 
				changeDimProvider.getChangeDimension(repo.getVersionSpace());
		ChangeSet cs = getLatestChangeSet(changeDim);
		Change c = cs.getChanges().get(1);
		Option revOption = getRevisionOption(c.getUserAmbitionBinding());
		correctedAmbition.bind(revOption, Tristate.TRUE);
		c.setUserAmbitionBinding(correctedAmbition);
		OptionExpr corrAmbVis = correctedAmbition.toVisibility();
		c.setUserAmbitionExpr(corrAmbVis);
		((BinaryExpr) c.getChangeInvariant().getOptionExpr()).setRight(
				EcoreUtil.copy(corrAmbVis));
		c.getChangePreference().setOptionExpr(EcoreUtil.copy(corrAmbVis));
		cs.setTransactionId(repo.getWriteTransactionId());
		c.setTransactionId(repo.getWriteTransactionId());
	}
	
	/**
	 * Retrieves the unique revision option from a hybrid option binding.
	 *
	 * @param userAmbitionBinding
	 * @return
	 */
	private Option getRevisionOption(OptionBinding userAmbitionBinding) {
		for (Option o : userAmbitionBinding.getBoundOptions().keySet()) {
			if (o.getHighLevelConcept() instanceof Revision) {
				return o;
			}
		}
		return null;
	}

	/**
	 * Retrieves the latest change set of a specific change dimension.
	 *
	 * @param changeDim
	 * @return
	 */
	private ChangeSet getLatestChangeSet(ChangeDimension changeDim) {
		if (changeDim.getChangeSets().isEmpty()) return null;
		return changeDim.getChangeSets().get(
				changeDim.getChangeSets().size() - 1);
	}

}
