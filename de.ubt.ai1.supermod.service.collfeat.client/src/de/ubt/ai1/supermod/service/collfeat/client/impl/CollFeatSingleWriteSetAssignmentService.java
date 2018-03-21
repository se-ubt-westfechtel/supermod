/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.collfeat.client.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.change.Change;
import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.mm.core.Option;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.SuperModCoreFactory;
import de.ubt.ai1.supermod.mm.core.Tristate;
import de.ubt.ai1.supermod.mm.diff.ProductDimensionDelta;
import de.ubt.ai1.supermod.mm.diff.ProductSpaceDelta;
import de.ubt.ai1.supermod.mm.diff.SuperModDiffFactory;
import de.ubt.ai1.supermod.mm.diff.WriteSet;
import de.ubt.ai1.supermod.service.client.ICompositeAmbitionSpecificationService;
import de.ubt.ai1.supermod.service.client.IWriteSetAnalysisService;
import de.ubt.ai1.supermod.service.client.IWriteSetAssignmentService;
import de.ubt.ai1.supermod.service.client.IWriteSetConflictReporter;

/**
 * Implementation of the write set assignment service interface specific to a
 * product space consisting of a feature model, versioned by a collaborative
 * revision graph,
 * and a versioned file system, versioned by both the feature model and the
 * revision graph. It assumes a single write set that describes all changes to
 * the primary product space. To the feature model, only the temporal part of
 * the ambition is relevant. For the definition of the effective ambition, an
 * implementation of {@link ICompositeAmbitionSpecificationService} is
 * injected.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	28.10.2015
 */
public class CollFeatSingleWriteSetAssignmentService
implements IWriteSetAssignmentService {

	@Inject
	private ICompositeAmbitionSpecificationService 
			compositeAmbitionSpecificationService;
	
	@Inject
	private IWriteSetAnalysisService writeSetAnalysisService;
	
	@Inject
	private IWriteSetConflictReporter writeSetConflictReporter;
	
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IWriteSetAssignmentService
	 * #assignWriteSets(de.ubt.ai1.supermod.service.client.ProductSpaceDelta, 
	 * de.ubt.ai1.supermod.mm.core.VersionSpace, 
	 * de.ubt.ai1.supermod.mm.core.OptionBinding)
	 */
	@Override
	public Collection<WriteSet> assignWriteSets(ProductSpaceDelta delta,
			LocalRepository repo, OptionBinding choice) {
		List<WriteSet> writeSets = new ArrayList<>();			
		
		// if no change has been made to the primary product space, fake an
		// empty logical ambition to be reserved.
		ProductDimensionDelta vfsDelta = delta.getProductDimensionDeltas()
				.get(1);
		if (vfsDelta.getDeletedElements().isEmpty() &&
				vfsDelta.getInsertedElements().isEmpty()) {
			OptionBinding emptyAmb = SuperModCoreFactory.eINSTANCE
					.createOptionBinding();
			Resource ambRes = repo.eResource().getResourceSet().getResource(
					repo.eResource().getURI().trimFileExtension()
					.appendFileExtension("lamb"), true);
			ambRes.getContents().clear();
			repo.setLocalAmbition(emptyAmb);
			ambRes.getContents().add(emptyAmb);
		}		
		
		// let the user specify an effective ambition.
		OptionBinding effectiveAmbition = compositeAmbitionSpecificationService
				.specifyCompositeAmbition(repo, choice, 
						repo.getLocalAmbition(), repo.getLocalAmbition());
		if (effectiveAmbition == null) {
			return null;
		}

		// extract the temporal ambition.
		OptionBinding temporalAmbition = SuperModCoreFactory.eINSTANCE
				.createOptionBinding();
		Option effectiveChangeOption = effectiveAmbition
				.getBoundOptions().get(0).getKey();
		Change effectiveChange = (Change) effectiveChangeOption
				.getHighLevelConcept();
		Change temporalChange = effectiveChange.getChangeSet()
				.getChanges().get(0);
		Option temporalChangeOption = temporalChange.getChangeOption();			
		temporalAmbition.bind(temporalChangeOption, Tristate.TRUE);

		// define a write set for the feature model, referring to the
		// temporal change option.
		ProductDimensionDelta fmDelta = delta.getProductDimensionDeltas()
				.get(0);
		WriteSet fmWs = SuperModDiffFactory.eINSTANCE.createWriteSet();
		fmWs.setDimensionName(fmDelta.getDimensionName());
		fmWs.getInsertedElements().addAll(EcoreUtil.copyAll(
				fmDelta.getInsertedElements()));
		fmWs.getDeletedElements().addAll(EcoreUtil.copyAll(
				fmDelta.getDeletedElements()));
		fmWs.setAmbition(temporalAmbition);
		writeSets.add(fmWs);

		// define a write set for the versioned file system, referring to
		// the effective change option.		
		WriteSet vfsWs = SuperModDiffFactory.eINSTANCE.createWriteSet();
		vfsWs.setDimensionName(vfsDelta.getDimensionName());
		vfsWs.getInsertedElements().addAll(EcoreUtil.copyAll(
				vfsDelta.getInsertedElements()));
		vfsWs.getDeletedElements().addAll(EcoreUtil.copyAll(
				vfsDelta.getDeletedElements()));
		vfsWs.setAmbition(effectiveAmbition);
		writeSets.add(vfsWs);

		// analyze the write set and re-specify ambition if necessary.
		OptionBinding missingOb = writeSetAnalysisService
				.isSufficientlyGeneral(vfsWs, choice, 
						repo.getVersionSpace());
		if (missingOb.getNumberOfBindings() > 0) {
			compositeAmbitionSpecificationService
			.undoCompositeAmbitionSpecification(repo, effectiveAmbition);
			boolean correct = writeSetConflictReporter.report(
					vfsWs, choice, repo.getVersionSpace());
			if (correct) {
				missingOb.getBoundOptions().putAll(
						effectiveAmbition.getBoundOptions());
				effectiveAmbition = 
						compositeAmbitionSpecificationService
						.specifyCompositeAmbition(repo, choice,
								repo.getLocalAmbition(), missingOb);
				if (effectiveAmbition == null) {
					return null;
				}
				vfsWs.setAmbition(effectiveAmbition);
			}
			else {
				return null;
			}
		}

		return writeSets;
	}
	
}
