/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.collab.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import de.ubt.ai1.supermod.mm.collab.CollaborativeRevisionDimension;
import de.ubt.ai1.supermod.mm.collab.PrivateRevision;
import de.ubt.ai1.supermod.mm.collab.PublicRevision;
import de.ubt.ai1.supermod.mm.collab.Revision;
import de.ubt.ai1.supermod.mm.collab.SuperModCollabFactory;
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
import de.ubt.ai1.supermod.service.IVersionDimensionMergeService;

/**
 * An implementation of the version dimension merge service interface specific
 * to collaborative revision graphs.
 * 
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	23.10.2015
 */
public class CollabDimensionMergeService
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
		CollaborativeRevisionDimension baseCrd = 
				(CollaborativeRevisionDimension) base;
		CollaborativeRevisionDimension otherCrd = 
				(CollaborativeRevisionDimension) other;
		
		Map<Integer, PublicRevision> basePubRevMap = 
				getPublicRevisionMap(baseCrd);
		Map<Integer, PublicRevision> otherPubRevMap = 
				getPublicRevisionMap(otherCrd);
		
		Map<String, Option> resultMap = new HashMap<>();
		List<Revision> newRevs = createNewPublicRevisions(
				basePubRevMap, otherPubRevMap, resultMap);
		for (Revision rev : newRevs) {
			if (rev instanceof PublicRevision) {
				baseCrd.getPublicRevisions().add((PublicRevision) rev);
			}
		}
		for (Revision newRev : newRevs) {
			if (newRev instanceof PublicRevision) {
				PublicRevision newPubRev = (PublicRevision) newRev;
				basePubRevMap.put(newPubRev.getRevisionNumber(), newPubRev);
				PublicRevision otherPubRev = otherPubRevMap.get(
						newRev.getRevisionNumber());
				if (otherPubRev != null) {
					resolveCrossReferences(newRev, otherPubRev,	resultMap);
					resolveRuleBaseElements(newRev, otherPubRev, resultMap);
					for (int i = 0; i < newPubRev.getPrivateRevisions().size();
							i++) {
						PrivateRevision newPrivRev = newPubRev
								.getPrivateRevisions().get(i);
						PrivateRevision otherPrivRev = otherPubRev
								.getPrivateRevisions().get(i);
						resolveCrossReferences(newPrivRev, otherPrivRev,
								resultMap);
						resolveRuleBaseElements(newPrivRev, otherPrivRev,
								resultMap);
					}
				}
			}
		}
		
		// merge head reference
		if (basePubRevMap.containsKey(otherCrd.getPublicHead()
				.getRevisionNumber())) {
			baseCrd.setPublicHead(basePubRevMap.get(
					otherCrd.getPublicHead().getRevisionNumber()));
		}
		
		if (baseCrd.getInitialPublicRevision() == null &&
				otherCrd.getInitialPublicRevision() != null) {
			baseCrd.setInitialPublicRevision((PublicRevision) 
					resultMap.get(otherCrd.getInitialPublicRevision()
							.getRevisionOption().getName())
					.getHighLevelConcept());
		}
		if (baseCrd.getInitialPublicRevisionInvariant() == null &&
				otherCrd.getInitialPublicRevisionInvariant() != null) {
			Invariant otherInv = otherCrd.getInitialPublicRevisionInvariant();
			Invariant newInv = SuperModCoreFactory.eINSTANCE.createInvariant();
			newInv.setName(otherInv.getName());
			newInv.setOptionExpr(resolveOptionExpr(otherInv.getOptionExpr(),
					resultMap));
			baseCrd.setInitialPublicRevisionInvariant(newInv);
		}
		
		baseCrd.setLatestPublicRevisionNumber(
				Math.max(baseCrd.getLatestPublicRevisionNumber(),
						otherCrd.getLatestPublicRevisionNumber()));		
		return resultMap;
	}

	/**
	 * @param base
	 * @return a map associating all public revisions under their revision
	 * 			number.
	 */
	private Map<Integer, PublicRevision> getPublicRevisionMap(
			CollaborativeRevisionDimension crd) {
		Map<Integer, PublicRevision> result = new HashMap<>();
		for (PublicRevision rev : crd.getPublicRevisions()) {
			result.put(rev.getRevisionNumber(), rev);
		}
		return result;
	}	
	
	/**
	 * Creates and returns new public revisions for those revision which are
	 * contained in the 'other' but not in the 'base' version. No rule base
	 * elements and cross-references are created. The creation includes all
	 * contained private revisions. Furthermore, all created private revisions
	 * are contained in the result list.
	 *
	 * @param basePubRevMap
	 * @param otherPubRevMap
	 * @param resultMap
	 * @return all created public revisions
	 */
	private List<Revision> createNewPublicRevisions(
			Map<Integer, PublicRevision> basePubRevMap,
			Map<Integer, PublicRevision> otherPubRevMap, 
			Map<String, Option> resultMap) {
		List<Revision> newRevs = new ArrayList<>();
		Set<Integer> revNrs = new LinkedHashSet<>();
		revNrs.addAll(otherPubRevMap.keySet());
		revNrs.addAll(basePubRevMap.keySet());
		for (Integer revNr : revNrs) {
			PublicRevision otherPubRev = otherPubRevMap.get(revNr);
			PublicRevision newPubRev = basePubRevMap.get(revNr);
			if (otherPubRev != null && newPubRev == null) {
				newPubRev = SuperModCollabFactory.eINSTANCE	.createPublicRevision();
				Option newPubRevOpt = SuperModCoreFactory.eINSTANCE.createOption();
				newPubRevOpt.setName(otherPubRev.getRevisionOption()
						.getName());
				newPubRev.setRevisionOption(newPubRevOpt);
				resultMap.put(newPubRevOpt.getName(), newPubRevOpt);		
				if (otherPubRev.getFinishedOption() != null) {
					Option newPubFinOpt = SuperModCoreFactory.eINSTANCE.createOption();
					newPubFinOpt.setName(otherPubRev.getFinishedOption()
							.getName());
					newPubRev.setFinishedOption(newPubFinOpt);
					resultMap.put(newPubFinOpt.getName(), newPubFinOpt);		
				}				
				newPubRev.setRevisionNumber(revNr);
				newPubRev.setCommitter(otherPubRev.getCommitter());
				newPubRev.setDate(otherPubRev.getDate());
				newPubRev.setTransactionId(otherPubRev.getTransactionId());
				newRevs.add(newPubRev);
			
				Map<Integer, PrivateRevision> basePrivRevMap = 
						getPrivateRevisionMap(newPubRev);
				Map<Integer, PrivateRevision> otherPrivRevMap = 
						getPrivateRevisionMap(otherPubRev);
	
				List<PrivateRevision> newPrivRevs = createNewPrivateRevisions(
						basePrivRevMap, otherPrivRevMap, resultMap);
				newPubRev.getPrivateRevisions().addAll(newPrivRevs);
				newRevs.addAll(newPrivRevs);
				for (PrivateRevision newPrivRev : newPrivRevs) {
					basePrivRevMap.put(newPrivRev.getRevisionNumber(),
							newPrivRev);
				}
				
				if (otherPubRev.getInitialPrivateRevision() != null) {
					newPubRev.setInitialPrivateRevision(basePrivRevMap.get(
							otherPubRev.getInitialPrivateRevision()
							.getRevisionNumber()));
				}
				if (otherPubRev.getPrivateHead() != null) {
					newPubRev.setPrivateHead(basePrivRevMap.get(otherPubRev
							.getPrivateHead().getRevisionNumber()));
				}
				
			}
			else if (newPubRev != null) {
				Option baseRevOpt = newPubRev.getRevisionOption();
				resultMap.put(baseRevOpt.getName(), baseRevOpt);
				if (newPubRev.isFinished()) {
					Option baseRevFinOpt = newPubRev.getFinishedOption();
					resultMap.put(baseRevFinOpt.getName(), baseRevFinOpt);
				}
			}
		}
		
		return newRevs;
	}
	
	/**
	 * @param publicRev
	 * @return a map assigning the subordinate private revision number to all
	 * 			contained revisions of the specified public revision.
	 */
	private Map<Integer, PrivateRevision> getPrivateRevisionMap(
			PublicRevision publicRev) {
		Map<Integer, PrivateRevision> result = new HashMap<>();
		for (PrivateRevision privRev : publicRev.getPrivateRevisions()) {
			result.put(privRev.getRevisionNumber(), privRev);
		}
		return result;
	}

	/**
	 * Creates and returns new private revisions for those revisions which are
	 * contained in the 'other' but not in the 'base' version. No rule base
	 * elements and cross-references are created. All created private revisions
	 * are contained in the result list and associated to their 'other' element
	 * in the specified result map.
	 *
	 * @param basePrivRevMap
	 * @param otherPrivRevMap
	 * @param resultMap
	 * @return private revisions created for the specified public revision
	 */
	private List<PrivateRevision> createNewPrivateRevisions(
			Map<Integer, PrivateRevision> basePrivRevMap,
			Map<Integer, PrivateRevision> otherPrivRevMap,
			Map<String, Option> resultMap) {
		List<PrivateRevision> newPrivRevs = new ArrayList<>();
		Set<Integer> revNrs = new LinkedHashSet<>();
		revNrs.addAll(otherPrivRevMap.keySet());
		revNrs.addAll(basePrivRevMap.keySet());
		for (Integer revNr : revNrs) {
			PrivateRevision otherPrivRev = otherPrivRevMap.get(revNr);
			PrivateRevision newPrivRev = basePrivRevMap.get(revNr);
			if (otherPrivRev != null && newPrivRev == null) {
				newPrivRev = SuperModCollabFactory.eINSTANCE
						.createPrivateRevision();
				Option newPrivRevOpt = SuperModCoreFactory.eINSTANCE.createOption();
				newPrivRevOpt.setName(otherPrivRev.getRevisionOption()
						.getName());
				newPrivRev.setRevisionOption(newPrivRevOpt);
				newPrivRev.setRevisionNumber(revNr);
				newPrivRev.setCommitMessage(otherPrivRev.getCommitMessage());
				newPrivRev.setDate(otherPrivRev.getDate());
				newPrivRev.setTransactionId(otherPrivRev.getTransactionId());
				newPrivRevs.add(newPrivRev);
				resultMap.put(newPrivRevOpt.getName(), newPrivRevOpt);	
			}
			else if (newPrivRev != null) {
				Option baseRevOpt = newPrivRev.getRevisionOption();
				resultMap.put(baseRevOpt.getName(), baseRevOpt);
			}
		}		
		return newPrivRevs;
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
			String id = otherPred.getRevisionOption().getName();
			if (resultMap.containsKey(id)) {
				baseRev.getPredecessors().add((Revision) 
						resultMap.get(id).getHighLevelConcept());
			}
		}
		for (Revision otherSucc : otherRev.getSuccessors()) {
			String id = otherSucc.getRevisionOption().getName();
			if (resultMap.containsKey(id)) {
				baseRev.getSuccessors().add((Revision) 
						resultMap.get(id).getHighLevelConcept());
			}
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
		
		if (baseRev instanceof PublicRevision &&
				otherRev instanceof PublicRevision) {
			PublicRevision otherPr = (PublicRevision) otherRev;
			DefaultBinding otherFinDef = otherPr.getFinishedDefaultBinding();
			if (otherFinDef != null) {
				DefaultBinding baseFinDef = SuperModCoreFactory.eINSTANCE
						.createDefaultBinding();
				baseFinDef.setName(otherFinDef.getName());
				baseFinDef.setOption(resolveOption(otherFinDef.getOption(),
						resultMap));
				baseFinDef.setState(otherFinDef.getState());
				((PublicRevision) baseRev).setFinishedDefaultBinding(otherFinDef);
			}
		}
	}

	/**
	 * @param otherOption an option of the 'other' version
	 * @param resultMap maps 'other' to corresponding 'base' options
	 * @return a the corresponding option of the 'base' version
	 */
	private Option resolveOption(Option otherOption,
			Map<String, Option> resultMap) {
		if (otherOption == null) {
			return null;
		}
		return resultMap.get(otherOption.getName());
	}
	
	/**
	 * Creates a copy of the specified option expression which refers to the
	 * 'base' version's option set only. Visibility references are not supported.
	 *
	 * @param otherOptionExpr an option expression of the 'other' version
	 * @param resultMap maps 'other' to corresponding 'base' options
	 * @return a the corresponding option expression referring to the 'base'
	 * 			version
	 */
	private OptionExpr resolveOptionExpr(OptionExpr otherOptionExpr,
			Map<String, Option> resultMap) {
		return new SuperModCoreSwitch<OptionExpr>() {
			public OptionExpr caseOptionRef(OptionRef value) {
				OptionRef newRef = SuperModCoreFactory.eINSTANCE
						.createOptionRef();
				newRef.setOption(resolveOption(value.getOption(), resultMap));
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
		}.doSwitch(otherOptionExpr);
	}
	

}
