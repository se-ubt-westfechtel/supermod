/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.change.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import de.ubt.ai1.supermod.mm.change.Change;
import de.ubt.ai1.supermod.mm.change.ChangeDimension;
import de.ubt.ai1.supermod.mm.change.ChangeSet;
import de.ubt.ai1.supermod.mm.change.SuperModChangeFactory;
import de.ubt.ai1.supermod.mm.core.BigExpr;
import de.ubt.ai1.supermod.mm.core.BinaryExpr;
import de.ubt.ai1.supermod.mm.core.Invariant;
import de.ubt.ai1.supermod.mm.core.MergeExpr;
import de.ubt.ai1.supermod.mm.core.NegExpr;
import de.ubt.ai1.supermod.mm.core.Option;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.OptionExpr;
import de.ubt.ai1.supermod.mm.core.OptionRef;
import de.ubt.ai1.supermod.mm.core.Preference;
import de.ubt.ai1.supermod.mm.core.SuperModCoreFactory;
import de.ubt.ai1.supermod.mm.core.Tristate;
import de.ubt.ai1.supermod.mm.core.VersionDimension;
import de.ubt.ai1.supermod.mm.core.util.SuperModCoreSwitch;
import de.ubt.ai1.supermod.service.IVersionDimensionMergeService;

/**
 * An implementation of the version dimension merge service specific to the
 * 'change' version dimension.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	22.10.2015
 */
public class ChangeDimensionMergeService 
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
		ChangeDimension baseCd = (ChangeDimension) base;
		ChangeDimension otherCd = (ChangeDimension) other;
		
		Map<String, ChangeSet> baseChangeSetMap = getChangeSetMap(baseCd);
		Map<String, ChangeSet> otherChangeSetMap = getChangeSetMap(otherCd);
		
		Map<String, Option> resultMap = new HashMap<>();
		List<ChangeSet> newChangeSets = createNewChangeSets(baseChangeSetMap,
				otherChangeSetMap, resultMap);
		baseCd.getChangeSets().addAll(newChangeSets);
		
		// updated change sets must be considered as new in order to
		// update their low-level rule base elements
		for (ChangeSet baseCs : baseChangeSetMap.values()) {
			if (otherChangeSetMap.containsKey(baseCs.getUuid())) {
				ChangeSet otherCs = otherChangeSetMap.get(baseCs.getUuid());
				if (baseCs.getTransactionId() != otherCs.getTransactionId()) {
					newChangeSets.add(baseCs);
				}
			}			
		}
		
		resolveRuleBaseElements(newChangeSets, otherChangeSetMap,
				dependingMap, resultMap);
		
		fillResultMap(baseCd, resultMap);		
		return resultMap;
	}

	/**
	 * @param otherCd
	 * @return a map that associates the UUID of the first change of a change
	 * 			set to the change set itself.
	 */
	private Map<String, ChangeSet> getChangeSetMap(ChangeDimension cd) {
		Map<String, ChangeSet> result = new HashMap<>();
		for (ChangeSet cs : cd.getChangeSets()) {
			result.put(cs.getUuid(), cs);
		}
		return result;
	}
	
	/**
	 * Manages the creation of new change sets.
	 *
	 * @param baseChangeSetMap
	 * @param otherChangeSetMap
	 * @param resultMap
	 * @return
	 */
	private List<ChangeSet> createNewChangeSets(
			Map<String, ChangeSet> baseChangeSetMap,
			Map<String, ChangeSet> otherChangeSetMap, 
			Map<String, Option> resultMap) {
		List<ChangeSet> newChangeSets = new ArrayList<>();
		Set<String> allCsUuids = new LinkedHashSet<>();
		allCsUuids.addAll(otherChangeSetMap.keySet());
		allCsUuids.addAll(baseChangeSetMap.keySet());
		for (String csUuid : allCsUuids) {
			if (baseChangeSetMap.containsKey(csUuid)) {
				ChangeSet cs = baseChangeSetMap.get(csUuid);
				for (Change c : cs.getChanges()) {
					resultMap.put(c.getChangeOption().getName(),
							c.getChangeOption());
				}
			}
			else {
				ChangeSet newCs = copyChangeSet(otherChangeSetMap.get(csUuid),
						resultMap);
				newChangeSets.add(newCs);
			}
		}
		return newChangeSets;
	}

	/**
	 * @param changeSet
	 * @param resultMap 
	 * @return
	 */
	private ChangeSet copyChangeSet(ChangeSet changeSet,
			Map<String, Option> resultMap) {
		ChangeSet result = SuperModChangeFactory.eINSTANCE.createChangeSet();
		result.setUuid(changeSet.getUuid());
		result.setTransactionId(changeSet.getTransactionId());
		for (Change change : changeSet.getChanges()) {
			Change newChange = copyChange(change, resultMap);
			result.getChanges().add(newChange);
		}
		return result;
	}

	/**
	 * Creates a copy of the specified change, without its contained rule
	 * base elements.
	 * 
	 * @param change a change of the 'other' version
	 * @param resultMap will be returned as overall result
	 * @return the copy in the 'base' version
	 */
	private Change copyChange(Change change, Map<String, Option> resultMap) {
		Change result = SuperModChangeFactory.eINSTANCE.createChange();
		result.setUuid(change.getUuid());
		result.setTransactionId(change.getTransactionId());
		Option co = SuperModCoreFactory.eINSTANCE.createOption();
		co.setName(change.getChangeOption().getName());
		result.setChangeOption(co);
		resultMap.put(co.getName(), co);
		return result;
	}
	
	
	/**
	 * Resolves the contents of change sets, being the low-level rule base
	 * elements of changes. References to rule base elements are resolved for
	 * both depending dimension elements and change options.
	 *
	 * @param newChangeSets
	 * @param otherChangeSetMap
	 * @param dependingMap
	 * @param resultMap
	 */
	private void resolveRuleBaseElements(List<ChangeSet> newChangeSets,
			Map<String, ChangeSet> otherChangeSetMap,
			Map<String, Option> dependingMap, Map<String, Option> resultMap) {
		for (ChangeSet newCs : newChangeSets) {
			ChangeSet otherCs = otherChangeSetMap.get(newCs.getUuid());
			if (otherCs != null) {
				for (int i = 0; i < newCs.getChanges().size(); i++) {
					Change newChange = newCs.getChanges().get(i);
					Change otherChange = otherCs.getChanges().get(i);
					
					Invariant inv = SuperModCoreFactory.eINSTANCE
							.createInvariant();
					inv.setName(
							otherChange.getChangeInvariant().getName());
					inv.setOptionExpr(resolveOptionExpr(
							otherChange.getChangeInvariant().getOptionExpr(),
							dependingMap, resultMap));
					newChange.setChangeInvariant(inv);
					
					Preference pref = SuperModCoreFactory.eINSTANCE
							.createPreference();
					pref.setName(
							otherChange.getChangePreference().getName());
					pref.setOption(resolveOption(
							otherChange.getChangePreference().getOption(),
							dependingMap, resultMap));
					pref.setOptionExpr(resolveOptionExpr(
							otherChange.getChangePreference().getOptionExpr(),
							dependingMap, resultMap));
					newChange.setChangePreference(pref);
					
					newChange.setUserAmbitionBinding(resolveOptionBinding(
							otherChange.getUserAmbitionBinding(), dependingMap,
							resultMap));
					newChange.setUserAmbitionExpr(resolveOptionExpr(
							otherChange.getUserAmbitionExpr(), dependingMap,
							resultMap));
				}
			}
		}
		
	}

	/**
	 * returns an option from the "base" version that corresponds to the
	 * specified option of the "other" version.
	 * 
	 * @param otherOption an option of the 'other' version
	 * @param dependingMap maps options of depending dimensions
	 * @param resultMap maps options of current change dimension
	 * @return a the corresponding option of the 'base' version
	 */
	private Option resolveOption(Option otherOption,
			Map<String, Option> dependingMap, Map<String, Option> resultMap) {
		if (otherOption == null) {
			return null;
		}
		if (dependingMap.containsKey(otherOption.getName())) {
			return dependingMap.get(otherOption.getName());
		}
		if (resultMap.containsKey(otherOption.getName())) {
			return resultMap.get(otherOption.getName());
		}
		return null;
	}
	
	/**
	 * returns an option binding from the "base" version that corresponds to the
	 * specified option binding of the "other" version.
	 *
	 * @param userAmbitionBinding
	 * @param dependingMap
	 * @param resultMap
	 * @return
	 */
	private OptionBinding resolveOptionBinding(
			OptionBinding otherOb, Map<String, Option> dependingMap,
			Map<String, Option> resultMap) {
		OptionBinding resultOb = SuperModCoreFactory.eINSTANCE
				.createOptionBinding();
		for (Map.Entry<Option, Tristate> e : 
				otherOb.getBoundOptions().entrySet()) {
			Option resOpt = resolveOption(e.getKey(), dependingMap, resultMap);
			if (resOpt != null) {
				resultOb.bind(resOpt, e.getValue());
			}
		}
		return resultOb;
	}
	
	/**
	 * Creates a copy of the specified option expression which refers to the
	 * 'base' version's option set only. Visibility references are not supported.
	 *
	 * @param baseOptionExpr an option expression of the 'other' version
	 * @param dependingMap maps options of depending dimensions
	 * @param resultMap maps options of current change dimension
	 * @return the corresponding option expression referring to the 'base'
	 * 			version
	 */
	private OptionExpr resolveOptionExpr(OptionExpr baseOptionExpr,
			Map<String, Option> dependingMap, Map<String, Option> resultMap) {
		return new SuperModCoreSwitch<OptionExpr>() {
			public OptionExpr caseOptionRef(OptionRef value) {
				OptionRef newRef = SuperModCoreFactory.eINSTANCE
						.createOptionRef();
				newRef.setOption(resolveOption(value.getOption(),
						dependingMap, resultMap));
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

	/**
	 * Adds all existing change options to the result map.
	 *
	 * @param cd
	 * @param resultMap
	 */
	private void fillResultMap(ChangeDimension cd, Map<String, Option> resultMap) {
		for (ChangeSet cs : cd.getChangeSets()) {
			for (Change c : cs.getChanges()) {
				Option co = c.getChangeOption();
				resultMap.put(co.getName(), co);
			}
		}
	}
	
}
