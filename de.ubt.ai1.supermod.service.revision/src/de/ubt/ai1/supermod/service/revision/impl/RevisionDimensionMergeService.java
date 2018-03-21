/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.revision.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import de.ubt.ai1.supermod.mm.core.BigExpr;
import de.ubt.ai1.supermod.mm.core.BinaryExpr;
import de.ubt.ai1.supermod.mm.core.DefaultBinding;
import de.ubt.ai1.supermod.mm.core.Invariant;
import de.ubt.ai1.supermod.mm.core.MergeExpr;
import de.ubt.ai1.supermod.mm.core.NegExpr;
import de.ubt.ai1.supermod.mm.core.Option;
import de.ubt.ai1.supermod.mm.core.OptionExpr;
import de.ubt.ai1.supermod.mm.core.OptionRef;
import de.ubt.ai1.supermod.mm.core.Preference;
import de.ubt.ai1.supermod.mm.core.SuperModCoreFactory;
import de.ubt.ai1.supermod.mm.core.VersionDimension;
import de.ubt.ai1.supermod.mm.core.util.SuperModCoreSwitch;
import de.ubt.ai1.supermod.mm.revision.Revision;
import de.ubt.ai1.supermod.mm.revision.RevisionDimension;
import de.ubt.ai1.supermod.mm.revision.SuperModRevisionFactory;
import de.ubt.ai1.supermod.service.IVersionDimensionMergeService;

/**
 * An implementation of the version dimension merge service interface specific
 * to revision graphs.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	22.10.2015
 */
public class RevisionDimensionMergeService 
implements IVersionDimensionMergeService {

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.IVersionDimensionMergeService
	 * #merge(de.ubt.ai1.supermod.mm.core.VersionDimension,
	 * de.ubt.ai1.supermod.mm.core.VersionDimension, java.util.Map)
	 */
	@Override
	public Map<String, Option> merge(
			VersionDimension base, VersionDimension other,
			Map<String, Option> dependingMap) {
		RevisionDimension baseRd = (RevisionDimension) base;
		RevisionDimension otherRd = (RevisionDimension) other;
		
		Map<Integer, Revision> baseRevMap = getRevisionMap(baseRd);
		Map<Integer, Revision> otherRevMap = getRevisionMap(otherRd);
		
		Map<String, Option> resultMap = new HashMap<>();
		List<Revision> newRevs = createNewRevisions(baseRevMap,
				otherRevMap, resultMap);
		baseRd.getRevisions().addAll(newRevs);
		for (Revision newRev : newRevs) {
			resolveCrossReferences(newRev,
					otherRevMap.get(newRev.getRevisionNumber()), resultMap);
			resolveRuleBaseElements(newRev,
					otherRevMap.get(newRev.getRevisionNumber()), resultMap);
		}
		
		if (otherRd.getHead() != null &&
				resultMap.containsKey(otherRd.getHead()
						.getRevisionOption().getName())) {
			baseRd.setHead((Revision) resultMap.get(otherRd.getHead()
					.getRevisionOption().getName()));
		}
		
		if (baseRd.getInitialRevision() == null &&
				otherRd.getInitialRevision() != null &&
				resultMap.containsKey(otherRd.getInitialRevision()
						.getRevisionOption().getName())) {
			baseRd.setInitialRevision((Revision) 
					resultMap.get(otherRd.getInitialRevision()
							.getRevisionOption().getName()));
			Invariant initInv = SuperModCoreFactory.eINSTANCE.createInvariant();
			initInv.setName(otherRd.getInitialRevisionInvariant()
					.getName());
			initInv.setOptionExpr(resolveOptionExpr(
					otherRd.getInitialRevisionInvariant().getOptionExpr(),
					resultMap));
			baseRd.setInitialRevisionInvariant(initInv);
		}
		
		baseRd.setLatestRevisionNumber(
				Math.max(baseRd.getLatestRevisionNumber(),
						otherRd.getLatestRevisionNumber()));		
		return resultMap;
	}

	/**
	 * @param base
	 * @return a map associating all revisions under their revision number.
	 */
	private Map<Integer, Revision> getRevisionMap(RevisionDimension rd) {
		Map<Integer, Revision> result = new HashMap<>();
		for (Revision rev : rd.getRevisions()) {
			result.put(rev.getRevisionNumber(), rev);
		}
		return result;
	}	

	/**
	 * Creates and returns new revision elements for those revision which are
	 * contained in the 'other' but not in the 'base' version. No rule base
	 * elements and cross-references are created.
	 *
	 * @param baseRevMap
	 * @param otherRevMap
	 * @param resultMap
	 * @return all created revisions
	 */
	private List<Revision> createNewRevisions(
			Map<Integer, Revision> baseRevMap,
			Map<Integer, Revision> otherRevMap, 
			Map<String, Option> resultMap) {
		List<Revision> newRevs = new ArrayList<>();
		Set<Integer> revNrs = new LinkedHashSet<>();
		revNrs.addAll(otherRevMap.keySet());
		revNrs.addAll(baseRevMap.keySet());
		for (Integer revNr : revNrs) {
			Revision otherRev = otherRevMap.get(revNr);
			Revision newRev = baseRevMap.get(revNr);
			if (otherRev != null && newRev == null) {
				newRev = SuperModRevisionFactory.eINSTANCE.createRevision();
				Option newRO = SuperModCoreFactory.eINSTANCE.createOption();
				newRO.setName(otherRev.getRevisionOption().getName());
				newRev.setRevisionOption(newRO);
				newRev.setRevisionNumber(revNr);
				newRev.setCommitMessage(otherRev.getCommitMessage());
				newRev.setCommitter(otherRev.getCommitter());
				newRev.setDate(otherRev.getDate());
				newRev.setTransactionId(otherRev.getTransactionId());
				newRevs.add(newRev);
				resultMap.put(newRO.getName(), newRO);
			}
			else if (newRev != null) {
				Option ro = newRev.getRevisionOption();
				resultMap.put(ro.getName(), ro);
			}
		}
		return newRevs;
	}
	
	/**
	 * resolves the cross-references representing the predecessor/successor
	 * relationship.
	 *
	 * @param baseRev
	 * @param otherRev
	 * @param resultMap
	 */
	private void resolveCrossReferences(Revision baseRev, Revision otherRev,
			Map<String, Option> resultMap) {
		for (Revision otherPred : otherRev.getPredecessors()) {
			baseRev.getPredecessors().add((Revision) resultMap.get(otherPred
					.getRevisionOption().getName()));
		}
		for (Revision otherSucc : otherRev.getSuccessors()) {
			baseRev.getSuccessors().add((Revision) resultMap.get(otherSucc
					.getRevisionOption().getName()));
		}		
	}
	
	/**
	 * Resolves the revision preferences and default of a new base revision.
	 *
	 * @param baseRev
	 * @param otherRev
	 * @param resultMap
	 */
	private void resolveRuleBaseElements(Revision baseRev, Revision otherRev,
			Map<String, Option> resultMap) {
		DefaultBinding otherRevDef = otherRev.getRevisionDefaultBinding();
		DefaultBinding baseRevDef = SuperModCoreFactory.eINSTANCE
				.createDefaultBinding();
		baseRevDef.setName(otherRevDef.getName());
		baseRevDef.setOption(resolveOption(otherRevDef.getOption(), resultMap));
		baseRevDef.setState(otherRevDef.getState());
		baseRev.setRevisionDefaultBinding(baseRevDef);
		
		for (Preference otherRevPref : otherRev.getPredecessorPreferences()) {
			Preference baseRevPref = SuperModCoreFactory.eINSTANCE
					.createPreference();
			baseRevPref.setName(otherRevPref.getName());
			baseRevPref.setOption(resolveOption(otherRevPref.getOption(),
					resultMap));
			baseRevPref.setOptionExpr(resolveOptionExpr(
					otherRevPref.getOptionExpr(), resultMap));
			baseRev.getPredecessorPreferences().add(baseRevPref);
		}
	}

	/**
	 * @param otherOption an option of the 'other' version
	 * @param optionMap maps 'other' to corresponding 'base' options
	 * @return a the corresponding option of the 'base' version
	 */
	private Option resolveOption(Option otherOption,
			Map<String, Option> optionMap) {
		if (optionMap.containsKey(otherOption.getName())) {
			return optionMap.get(otherOption.getName());
		}
		return otherOption;
	}
	
	/**
	 * Creates a copy of the specified option expression which refers to the
	 * 'base' version's option set only. Visibility references are not supported.
	 *
	 * @param baseOptionExpr an option expression of the 'other' version
	 * @param optionMap maps 'other' to corresponding 'base' options
	 * @return a the corresponding option expression referring to the 'base'
	 * 			version
	 */
	private OptionExpr resolveOptionExpr(OptionExpr baseOptionExpr,
			Map<String, Option> optionMap) {
		return new SuperModCoreSwitch<OptionExpr>() {
			public OptionExpr caseOptionRef(OptionRef value) {
				OptionRef newRef = SuperModCoreFactory.eINSTANCE
						.createOptionRef();
				newRef.setOption(resolveOption(value.getOption(), optionMap));
				return newRef;
			}
			public OptionExpr caseNegExpr(NegExpr value) {
				NegExpr result = SuperModCoreFactory.eINSTANCE.createNegExpr();
				result.setNeg(doSwitch(value.getNeg()));
				return result;
			}
			public OptionExpr caseMergeExpr(MergeExpr value) {
				MergeExpr result = (MergeExpr) caseBinaryExpr(value);
				if (value.getBaseExpr() != null) {
					result.setBaseExpr(doSwitch(value.getBaseExpr()));
				}
				return result;
			}
			public OptionExpr caseBinaryExpr(BinaryExpr value) {
				BinaryExpr result = (BinaryExpr) SuperModCoreFactory
						.eINSTANCE.create(value.eClass());
				result.setLeft(doSwitch(value.getLeft()));
				result.setRight(doSwitch(value.getRight()));
				return result;
			}
			public OptionExpr caseBigExpr(BigExpr value) {
				BigExpr result = (BigExpr) SuperModCoreFactory
						.eINSTANCE.create(value.eClass());
				for (OptionExpr expr : value.getChildren()) {
					result.getChildren().add(doSwitch(expr));
				}
				return result;
			}
		}.doSwitch(baseOptionExpr);
	}
	
}
