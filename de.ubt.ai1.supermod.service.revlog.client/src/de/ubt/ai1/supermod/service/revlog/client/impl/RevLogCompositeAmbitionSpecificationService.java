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
import de.ubt.ai1.supermod.mm.change.SuperModChangeFactory;
import de.ubt.ai1.supermod.mm.change.util.ChangeSpaceUtil;
import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.mm.core.Option;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.SuperModCoreFactory;
import de.ubt.ai1.supermod.mm.core.Tristate;
import de.ubt.ai1.supermod.mm.core.VersionSpace;
import de.ubt.ai1.supermod.mm.logical.LogicalDimension;
import de.ubt.ai1.supermod.mm.revision.RevisionDimension;
import de.ubt.ai1.supermod.service.change.IChangeDimensionProvider;
import de.ubt.ai1.supermod.service.client.IAmbitionSpecificationService;
import de.ubt.ai1.supermod.service.client.ICompositeAmbitionSpecificationService;
import de.ubt.ai1.supermod.service.logical.ILogicalDimensionProvider;
import de.ubt.ai1.supermod.service.logical.Logical;
import de.ubt.ai1.supermod.service.revision.IRevisionDimensionProvider;

/**
 * An implementation of the composite ambition specification interface which
 * uses a revision and a logical ambition specification service in order to
 * specify a hybrid, composite ambition. A user-specified ambition 
 * <code>a</code>, which refers to the temporal and the logical dimension, is
 * replaced by a change option under which the change is effectively performed. 
 * In particular, the four following components are added to the change
 * dimension:
 * <ol>
 *  <li>a change option <code>o</code>,</li>
 *  <li>a change invariant <code>o => a</code>,</li>
 *  <li>a change preference <code>(o, a)</code>,</li>
 *  <li>a change default binding <code>(o, FALSE)</code>.</li>
 * </ol>
 * The returned ambition is <code>a' = o</code>.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	04.08.2014
 */
public class RevLogCompositeAmbitionSpecificationService 
implements ICompositeAmbitionSpecificationService {
	
	@Inject
	private IRevisionDimensionProvider revisionDimensionProvider;
	
	@Inject
	private ILogicalDimensionProvider logicalDimensionProvider;
	
	@Inject
	private IChangeDimensionProvider changeDimensionProvider;
	
	@Inject
	@de.ubt.ai1.supermod.service.revision.Revision
	private IAmbitionSpecificationService revisionSpecificationService;
	
	@Inject
	@Logical
	private IAmbitionSpecificationService logicalSpecificationService;
	
		@Inject
	@de.ubt.ai1.supermod.service.change.Change
	private IAmbitionSpecificationService changeSpecificationService;

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.
	 * ICompositeAmbitionSpecificationService
	 * #specifyCompositeAmbition(de.ubt.ai1.supermod.mm.core.VersionSpace, 
	 * de.ubt.ai1.supermod.mm.core.OptionBinding, 
	 * de.ubt.ai1.supermod.mm.core.OptionBinding)
	 */
	@Override
	public OptionBinding specifyCompositeAmbition(LocalRepository repo,
			OptionBinding compositeChoice, OptionBinding recordedAmbition,
			OptionBinding proposedCompositeAmbition) {
		VersionSpace vs = repo.getVersionSpace();
		
		RevisionDimension revDim = revisionDimensionProvider
				.getRevisionDimension(vs);
		LogicalDimension logDim = logicalDimensionProvider
				.getLogicalDimension(vs);
		ChangeDimension changeDim = changeDimensionProvider
				.getChangeDimension(vs);
		
		// filter choice for revision and logical dimension.
		OptionBinding revChoice = ChangeSpaceUtil.filterBinding(
				compositeChoice, revDim);
		OptionBinding logChoice = ChangeSpaceUtil.filterBinding(
				compositeChoice, logDim);
		
		// filter proposed ambitions.
		OptionBinding revPropAmb = ChangeSpaceUtil.filterBinding(
				proposedCompositeAmbition, revDim);
		OptionBinding logPropAmb = ChangeSpaceUtil.filterBinding(
				proposedCompositeAmbition, logDim);
		
		// let the user specify ambitions on expanded choice / 
		// ambition proposal.
		OptionBinding revisionAmbition = revisionSpecificationService
				.specifyAmbition(revDim, revChoice, null, revPropAmb);
		if (revisionAmbition == null) {
			revisionSpecificationService.undoAmbitionSpecification(revDim, 
					revisionAmbition);
			return null;
		}
		
		OptionBinding logicalAmbition = logicalSpecificationService
				.specifyAmbition(logDim, logChoice, recordedAmbition, 
						logPropAmb);
		if (logicalAmbition == null) {
			logicalSpecificationService.undoAmbitionSpecification(logDim,
					logicalAmbition);
			revisionSpecificationService.undoAmbitionSpecification(revDim, 
					revisionAmbition);
			return null;
		}
		
		OptionBinding userAmbition = SuperModCoreFactory
				.eINSTANCE.createOptionBinding();
		userAmbition.getBoundOptions().putAll(
				revisionAmbition.getBoundOptions());
		userAmbition.getBoundOptions().putAll(
				logicalAmbition.getBoundOptions());
		
		// create a change set.
		ChangeSet cs = SuperModChangeFactory.eINSTANCE.createChangeSet();
		cs.setUuid(EcoreUtil.generateUUID());
		
		// add the user ambition.
		OptionBinding userChangeOb = changeSpecificationService
				.specifyAmbition(changeDim, null, null, userAmbition);
		Change effectiveChange = (Change) userChangeOb.getBoundOptions()
				.get(0).getKey().getHighLevelConcept();
		Option effectiveChangeOption = effectiveChange.getChangeOption();
		
		// add the option to the change set and the change set to the change
		// dimension.
		cs.getChanges().add(effectiveChange);
		changeDim.getChangeSets().add(cs);
		
		// the returned option binding binds only the change option to the
		// value TRUE.
		OptionBinding ob = SuperModCoreFactory.eINSTANCE.createOptionBinding();
		ob.bind(effectiveChangeOption, Tristate.TRUE);
		return ob;
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.
	 * ICompositeAmbitionSpecificationService#undoCompositeAmbitionSpecification
	 * (de.ubt.ai1.supermod.mm.core.VersionSpace,
	 * de.ubt.ai1.supermod.mm.core.OptionBinding)
	 */
	@Override
	public void undoCompositeAmbitionSpecification(LocalRepository repo,
			OptionBinding specifiedAmbition) {
		RevisionDimension revDim = revisionDimensionProvider
				.getRevisionDimension(repo.getVersionSpace());
		ChangeDimension changeDim = changeDimensionProvider
				.getChangeDimension(repo.getVersionSpace());
				
		// re-construct revision ambition.
		OptionBinding revAmb = SuperModCoreFactory.eINSTANCE
				.createOptionBinding();
		Change change = (Change) specifiedAmbition.getBoundOptions()
				.get(0).getKey().getHighLevelConcept();
		for (Option o : change.getChangePreference().getOptionExpr()
				.getReferencedOptions()) {
			if (o.getDimension().equals(revDim)) {
				revAmb.bind(o, Tristate.TRUE);
			}
		}
		
		// undo the respective changes.
		revisionSpecificationService.undoAmbitionSpecification(revDim, revAmb);
		changeSpecificationService.undoAmbitionSpecification(changeDim, 
				specifiedAmbition);
	}

}
