/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.generic.client.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.diff.ProductDimensionDelta;
import de.ubt.ai1.supermod.mm.diff.ProductSpaceDelta;
import de.ubt.ai1.supermod.mm.diff.SuperModDiffFactory;
import de.ubt.ai1.supermod.mm.diff.WriteSet;
import de.ubt.ai1.supermod.service.client.ICompositeAmbitionSpecificationService;
import de.ubt.ai1.supermod.service.client.IWriteSetAnalysisService;
import de.ubt.ai1.supermod.service.client.IWriteSetAssignmentService;
import de.ubt.ai1.supermod.service.client.IWriteSetConflictReporter;

/**
 * Generic implementation of the write set assignment service interfaces which
 * assumes a single write set that describes all changes to the product space.
 * As a consequence, exactly one write set with a user-specified ambition will
 * be defined and returned. For the definition of the ambition, an
 * implementation of {@link ICompositeAmbitionSpecificationService} is
 * injected.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	31.07.2014
 */
public class GenericSingleWriteSetAssignmentService
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
	 * #assignWriteSets(de.ubt.ai1.supermod.mm.diff.ProductSpaceDelta, 
	 * de.ubt.ai1.supermod.mm.core.VersionSpace, 
	 * de.ubt.ai1.supermod.mm.core.OptionBinding)
	 */
	@Override
	public Collection<WriteSet> assignWriteSets(ProductSpaceDelta delta,
			LocalRepository repo, OptionBinding choice) {
		List<WriteSet> writeSets = new ArrayList<>();
		for (ProductDimensionDelta pdDelta : 
				delta.getProductDimensionDeltas()) {
			WriteSet writeSet = SuperModDiffFactory.eINSTANCE.createWriteSet();
			writeSet.setDimensionName(pdDelta.getDimensionName());
			writeSet.getInsertedElements().addAll(EcoreUtil.copyAll(
					pdDelta.getInsertedElements()));
			writeSet.getDeletedElements().addAll(EcoreUtil.copyAll(
					pdDelta.getDeletedElements()));
			
			OptionBinding ambition = 
					compositeAmbitionSpecificationService
					.specifyCompositeAmbition(repo, choice,
							repo.getLocalAmbition(),
							repo.getLocalAmbition());

			OptionBinding missingOb = writeSetAnalysisService
					.isSufficientlyGeneral(writeSet, choice, 
							repo.getVersionSpace());
			if (missingOb.getNumberOfBindings() > 0) {
				compositeAmbitionSpecificationService
						.undoCompositeAmbitionSpecification(repo, ambition);
				boolean correct = writeSetConflictReporter.report(
						writeSet, choice, repo.getVersionSpace());
				if (correct) {
					missingOb.getBoundOptions().putAll(
							repo.getLocalAmbition().getBoundOptions());
					ambition = 
							compositeAmbitionSpecificationService
							.specifyCompositeAmbition(repo, choice,
									repo.getLocalAmbition(),
									missingOb);
					writeSet.setAmbition(ambition);
				}
				else {
					return null;
				}
			}
			else {
				writeSet.setAmbition(ambition);
			}

			writeSets.add(writeSet);
		}
		return writeSets;
	}

}
