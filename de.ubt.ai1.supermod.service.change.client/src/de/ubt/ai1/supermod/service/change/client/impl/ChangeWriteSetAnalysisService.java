/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.change.client.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.change.ChangeDimension;
import de.ubt.ai1.supermod.mm.change.util.ChangeSpaceUtil;
import de.ubt.ai1.supermod.mm.core.Option;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.OptionExpr;
import de.ubt.ai1.supermod.mm.core.ProductSpaceElement;
import de.ubt.ai1.supermod.mm.core.SuperModCoreFactory;
import de.ubt.ai1.supermod.mm.core.VersionDimension;
import de.ubt.ai1.supermod.mm.core.VersionSpace;
import de.ubt.ai1.supermod.mm.diff.WriteSet;
import de.ubt.ai1.supermod.service.client.IWriteSetAffectedElementsCalculator;
import de.ubt.ai1.supermod.service.generic.client.impl.GenericWriteSetAnalysisService;

/**
 * An implementation of the write set analysis specific to version spaces that
 * use the change dimension. It behaves exactly like the generic write set
 * analysis service, except for extracting the original user-specified ambition
 * in advance.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	24.06.2015
 */
public class ChangeWriteSetAnalysisService
extends GenericWriteSetAnalysisService {
	
	@Inject
	private IWriteSetAffectedElementsCalculator affectedElementsCalculator;
	
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.generic.client.impl.
	 * GenericWriteSetAnalysisService#isSufficientlyGeneral(
	 * de.ubt.ai1.supermod.mm.diff.WriteSet,
	 *  de.ubt.ai1.supermod.mm.core.OptionBinding,
	 *   de.ubt.ai1.supermod.mm.core.VersionSpace)
	 */
	public OptionBinding isSufficientlyGeneral(WriteSet writeSet, 
			OptionBinding choice, VersionSpace vs) {
		choice = vs.applyAllCompletions(choice);
		Map<VersionDimension, OptionBinding> map = 
				ChangeSpaceUtil.expandBinding(writeSet.getAmbition());
		OptionBinding ambition = SuperModCoreFactory.eINSTANCE
				.createOptionBinding();
		for (OptionBinding ob : map.values()) {
			ambition.getBoundOptions().putAll(ob.getBoundOptions());
		}
		ambition = vs.applyAllCompletions(ambition);
		List<ProductSpaceElement> affectedElements = 
				affectedElementsCalculator.getAffectedElements(writeSet);
		List<ProductSpaceElement> nonRepChanges = 
				findNonRepresentativeChanges(choice, ambition, affectedElements);
		
		OptionBinding missingBindings = SuperModCoreFactory.eINSTANCE
				.createOptionBinding();
		for (ProductSpaceElement pse : nonRepChanges) {
			Set<Option> unboundOptions = getUnboundOptions(
					pse.getHierarchicalVisibility(), ambition);
			if (!unboundOptions.isEmpty()) {
				addMissingBindings(missingBindings, unboundOptions, choice);
			}
		}
		return missingBindings;
	}
	
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.generic.client.impl.
	 * GenericWriteSetAnalysisService#getUnboundOptions(
	 * de.ubt.ai1.supermod.mm.core.OptionExpr,
	 * de.ubt.ai1.supermod.mm.core.OptionBinding)
	 */
	@Override
	protected Set<Option> getUnboundOptions(OptionExpr expr, OptionBinding ob) {
		Set<Option> result = new HashSet<Option>();
		for (Option o : super.getUnboundOptions(
				ChangeSpaceUtil.expandExpression(expr), ob)) {
			if (!(o.getDimension() instanceof ChangeDimension)) {
				result.add(o);
			}
		}
		return result;
	}

}
