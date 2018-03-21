/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.logical.impl;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import de.ubt.ai1.supermod.mm.core.BigExpr;
import de.ubt.ai1.supermod.mm.core.BinaryExpr;
import de.ubt.ai1.supermod.mm.core.DefaultBinding;
import de.ubt.ai1.supermod.mm.core.Invariant;
import de.ubt.ai1.supermod.mm.core.NegExpr;
import de.ubt.ai1.supermod.mm.core.Option;
import de.ubt.ai1.supermod.mm.core.OptionExpr;
import de.ubt.ai1.supermod.mm.core.OptionRef;
import de.ubt.ai1.supermod.mm.core.Preference;
import de.ubt.ai1.supermod.mm.core.SuperModCoreFactory;
import de.ubt.ai1.supermod.mm.core.VersionDimension;
import de.ubt.ai1.supermod.mm.core.util.SuperModCoreSwitch;
import de.ubt.ai1.supermod.mm.logical.LogicalDimension;
import de.ubt.ai1.supermod.service.IVersionDimensionMergeService;

/**
 * An implementation of the version dimension merge service specific to the
 * low-level logical version dimension.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	22.10.2015
 */
public class LogicalDimensionMergeService
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
		LogicalDimension baseLd = (LogicalDimension) base;
		LogicalDimension otherLd = (LogicalDimension) other;
		
		Map<String, Option> baseOptions = getOptionsMap(baseLd);
		Map<String, Invariant> baseInvs = getInvariantsMap(baseLd);
		Map<String, Preference> basePrefs = getPreferencesMap(baseLd);
		Map<String, DefaultBinding> baseDefs = getDefaultsMap(baseLd); 
		
		Map<String, Option> otherOptions = getOptionsMap(otherLd);
		Map<String, Invariant> otherInvs = getInvariantsMap(otherLd);
		Map<String, Preference> otherPrefs = getPreferencesMap(otherLd);
		Map<String, DefaultBinding> otherDefs = getDefaultsMap(otherLd);
		
		baseLd.getLogicalOptions().addAll(
				createNewOptions(baseOptions, otherOptions));
		baseLd.getLogicalInvariants().addAll(
				createNewInvariants(baseInvs, otherInvs,
						baseOptions, otherOptions));
		baseLd.getLogicalPreferences().addAll(
				createNewPreferences(basePrefs, otherPrefs,
						baseOptions, otherOptions));
		baseLd.getLogicalDefaults().addAll(
				createNewDefaults(baseDefs, otherDefs,
						baseOptions, otherOptions));
		
		return baseOptions;
	}
	
	/**
	 * @param ld
	 * @return a map associating the IDs of options in the specified logical
	 * 			dimension with the option itself.
	 */
	private Map<String, Option> getOptionsMap(LogicalDimension ld) {
		Map<String, Option> optionsMap = new LinkedHashMap<>();
		for (Option o : ld.getLogicalOptions()) {
			optionsMap.put(o.getName(), o);
		}
		return optionsMap;
	}

	/**
	 * @param ld
	 * @return a map associating the IDs of invariants in the specified logical
	 * 			dimension with the invariant itself.
	 */
	private Map<String, Invariant> getInvariantsMap(LogicalDimension ld) {
		Map<String, Invariant> invsMap = new LinkedHashMap<>();
		for (Invariant inv : ld.getLogicalInvariants()) {
			invsMap.put(inv.getName(), inv);
		}
		return invsMap;
	}

	/**
	 * @param ld
	 * @return a map associating the IDs of preferences in the specified logical
	 * 			dimension with the preference itself.
	 */
	private Map<String, Preference> getPreferencesMap(LogicalDimension ld) {
		Map<String, Preference> prefsMap = new LinkedHashMap<>();
		for (Preference p : ld.getLogicalPreferences()) {
			prefsMap.put(p.getName(), p);
		}
		return prefsMap;
	}

	/**
	 * @param ld
	 * @return a map associating the IDs of defaults in the specified logical
	 * 			dimension with the default itself.
	 */
	private Map<String, DefaultBinding> getDefaultsMap(LogicalDimension ld) {
		Map<String, DefaultBinding> defaultsMap = new LinkedHashMap<>();
		for (DefaultBinding db : ld.getLogicalDefaults()) {
			defaultsMap.put(db.getName(), db);
		}
		return defaultsMap;
	}
	
	/**
	 * Creates a copy of all options included in 'other' but not in 'base', and
	 * adds these options to the base options map.
	 *
	 * @param baseOptions
	 * @param otherOptions
	 * @return all newly created options
	 */
	private List<Option> createNewOptions(Map<String, Option> baseOptions, 
			Map<String, Option> otherOptions) {
		List<Option> result = new ArrayList<>();
		Set<String> newOptionsIds = new LinkedHashSet<>();
		newOptionsIds.addAll(otherOptions.keySet());
		newOptionsIds.removeAll(baseOptions.keySet());
		for (String newOptionId : newOptionsIds) {
			Option newOption = SuperModCoreFactory.eINSTANCE.createOption();
			newOption.setName(newOptionId);
			result.add(newOption);
			baseOptions.put(newOptionId, newOption);
		}
		return result;
	}

	/**
	 * Creates a copy of all invariants included in 'other' but not in 'base',
	 * and adds these invariants to the base invariants map. All options
	 * references in invariant option expressions will be resolved using the
	 * specified options maps.
	 *
	 * @param baseInvs
	 * @param otherInvs
	 * @param baseOptions
	 * @param otherOptions
	 * @return
	 */
	private List<Invariant> createNewInvariants(
			Map<String, Invariant> baseInvs, Map<String, Invariant> otherInvs,
			Map<String, Option> baseOptions, Map<String, Option> otherOptions) {
		List<Invariant> result = new ArrayList<>();
		Set<String> newInvariantsIds = new LinkedHashSet<>();
		newInvariantsIds.addAll(baseInvs.keySet());
		newInvariantsIds.removeAll(otherInvs.keySet());
		for (String newInvariantId : newInvariantsIds) {
			Invariant newInvariant = SuperModCoreFactory.eINSTANCE
					.createInvariant();
			newInvariant.setName(newInvariantId);
			newInvariant.setOptionExpr(resolveOptionExpr(
					otherInvs.get(newInvariantId).getOptionExpr(),
					baseOptions, otherOptions));
			result.add(newInvariant);
			baseInvs.put(newInvariantId, newInvariant);
		}
		return result;
	}

	/**
	 * Creates a copy of all preferences included in 'other' but not in 'base',
	 * and adds these preferences to the base preferences map. All options
	 * references in preferences option expressions will be resolved using the
	 * specified options maps.
	 *
	 * @param basePrefs
	 * @param otherPrefs
	 * @param baseOptions
	 * @param otherOptions
	 * @return
	 */
	private List<Preference> createNewPreferences(
			Map<String, Preference> basePrefs, Map<String, Preference> otherPrefs,
			Map<String, Option> baseOptions, Map<String, Option> otherOptions) {
		List<Preference> result = new ArrayList<>();
		Set<String> newPrefsIds = new LinkedHashSet<>();
		newPrefsIds.addAll(basePrefs.keySet());
		newPrefsIds.removeAll(otherPrefs.keySet());
		for (String newPrefId : newPrefsIds) {
			Preference otherPref = otherPrefs.get(newPrefId);
			Preference newPref = SuperModCoreFactory.eINSTANCE
					.createPreference();
			newPref.setName(newPrefId);
			newPref.setOption(resolveOption(otherPref.getOption(),
					baseOptions, otherOptions));
			newPref.setOptionExpr(resolveOptionExpr(otherPref.getOptionExpr(),
					baseOptions, otherOptions));
			result.add(newPref);
			basePrefs.put(newPrefId, newPref);
		}
		return result;
	}

	/**
	 * Creates a copy of all defaults included in 'other' but not in 'base',
	 * and adds these defaults to the base defaults map. All option
	 * references will be resolved using the specified options maps.
	 *
	 * @param baseDefs
	 * @param otherDefs
	 * @param baseOptions
	 * @param otherOptions
	 * @return
	 */
	private List<DefaultBinding> createNewDefaults(
			Map<String, DefaultBinding> baseDefs, Map<String, DefaultBinding> otherDefs,
			Map<String, Option> baseOptions, Map<String, Option> otherOptions) {
		List<DefaultBinding> result = new ArrayList<>();
		Set<String> newDefsIds = new LinkedHashSet<>();
		newDefsIds.addAll(baseDefs.keySet());
		newDefsIds.removeAll(otherDefs.keySet());
		for (String newDefId : newDefsIds) {
			DefaultBinding otherPref = otherDefs.get(newDefId);
			DefaultBinding newDef = SuperModCoreFactory.eINSTANCE
					.createDefaultBinding();
			newDef.setName(newDefId);
			newDef.setOption(resolveOption(otherPref.getOption(),
					baseOptions, otherOptions));
			newDef.setState(otherPref.getState());
			result.add(newDef);
			baseDefs.put(newDefId, newDef);
		}
		return result;
	}	

	/**
	 * @param baseOption an option of the 'other' version
	 * @return a the corresponding option of the 'base' version
	 */
	private Option resolveOption(Option baseOption,
			Map<String, Option> baseOptions, Map<String, Option> otherOptions) {
		String id = baseOption.getName();
		if (baseOptions.containsKey(id)) {
			return baseOptions.get(id);
		}
		return baseOption;
	}
	
	/**
	 * Creates a copy of the specified option expression which refers to the
	 * 'base' version's option set only. Visibility references are not supported.
	 *
	 * @param baseOptionExpr an option expression of the 'other' version
	 * @param baseOptions
	 * @param otherOptions
	 * @return a the corresponding option expression referring to the 'base'
	 * 			version
	 */
	private OptionExpr resolveOptionExpr(OptionExpr baseOptionExpr,
			Map<String, Option> baseOptions, Map<String, Option> otherOptions) {
		return new SuperModCoreSwitch<OptionExpr>() {
			public OptionExpr caseOptionRef(OptionRef value) {
				OptionRef newRef = SuperModCoreFactory.eINSTANCE
						.createOptionRef();
				newRef.setOption(resolveOption(value.getOption(),
						baseOptions, otherOptions));
				return newRef;
			}
			public OptionExpr caseNegExpr(NegExpr value) {
				NegExpr result = SuperModCoreFactory.eINSTANCE.createNegExpr();
				result.setNeg(doSwitch(value.getNeg()));
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
