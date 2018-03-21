/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.generic.impl;

import java.util.LinkedHashMap;
import java.util.Map;

import de.ubt.ai1.supermod.mm.core.BigExpr;
import de.ubt.ai1.supermod.mm.core.BinaryExpr;
import de.ubt.ai1.supermod.mm.core.MergeExpr;
import de.ubt.ai1.supermod.mm.core.NegExpr;
import de.ubt.ai1.supermod.mm.core.Option;
import de.ubt.ai1.supermod.mm.core.OptionExpr;
import de.ubt.ai1.supermod.mm.core.OptionRef;
import de.ubt.ai1.supermod.mm.core.SuperModCoreFactory;
import de.ubt.ai1.supermod.mm.core.Visibility;
import de.ubt.ai1.supermod.mm.core.VisibilityForest;
import de.ubt.ai1.supermod.mm.core.VisibilityRef;
import de.ubt.ai1.supermod.mm.core.util.SuperModCoreSwitch;
import de.ubt.ai1.supermod.service.IVisibilityForestMergeService;

/**
 * A generic implementation of the visibility forest merge service based on the
 * UUIDs of corresponding visibilities.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	20.10.2015
 */
public class GenericVisibilityForestMergeService
implements IVisibilityForestMergeService {

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.IVisibilityForestMergeService
	 * #merge(de.ubt.ai1.supermod.mm.core.VersionDimension,
	 * de.ubt.ai1.supermod.mm.core.VersionDimension)
	 */
	@Override
	public Map<String, Visibility> merge(VisibilityForest base,
			VisibilityForest other, Map<String, Option> optionMap) {
		Map<String, Visibility> result = new LinkedHashMap<>();
		Map<String, Visibility> baseVisMap = getUuidToVisibilityMap(base);
		Map<String, Visibility> otherVisMap = getUuidToVisibilityMap(other);
		for (String newVisUuid : otherVisMap.keySet()) {
			Visibility newOtherVis = otherVisMap.get(newVisUuid);
			Visibility newBaseVis = baseVisMap.get(newVisUuid);
			if (newBaseVis == null) {
				newBaseVis = adaptVisibility(newOtherVis, baseVisMap,
						optionMap);
				baseVisMap.put(newVisUuid, newBaseVis);
				base.getVisibilities().add(newBaseVis);
			}
			result.put(newOtherVis.getUuid(), newBaseVis);
		}
		return result;
	}

	/**
	 * @param other
	 * @return a map making each visibility of the specified forest accessible
	 * 			under their uuid.
	 */
	private Map<String, Visibility> getUuidToVisibilityMap(VisibilityForest vf) {
		Map<String, Visibility> result = new LinkedHashMap<>();
		for (Visibility vis : vf.getVisibilities()) {
			result.put(vis.getUuid(), vis);
		}
		return result;
	}

	/**
	 * Transforms a visibility referring to the 'other' version of the
	 * visibility forest into a visibility that refers only to the 'base'
	 * version, re-using existing auxiliary structures.
	 *
	 * @param newOtherVis
	 * @param baseVisMap
	 * @param optionMap
	 * @return
	 */
	private Visibility adaptVisibility(Visibility newOtherVis, 
			Map<String, Visibility> baseVisMap,	Map<String, Option> optionMap) {
		OptionExpr newBaseExpr = new SuperModCoreSwitch<OptionExpr>() {
			public OptionExpr caseOptionRef(OptionRef value) {
				OptionRef result = SuperModCoreFactory
						.eINSTANCE.createOptionRef();
				result.setOption(optionMap.get(
						value.getOption().getName()));
				return result;
			}
			public OptionExpr caseVisibilityRef(VisibilityRef value) {
				VisibilityRef result = SuperModCoreFactory
						.eINSTANCE.createVisibilityRef();
				result.setVisibility(baseVisMap.get(
						value.getVisibility().getUuid()));
				return result;
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
		}.doSwitch(newOtherVis.getExpr());
		Visibility newBaseVis = SuperModCoreFactory.eINSTANCE.createVisibility();
		newBaseVis.setUuid(newOtherVis.getUuid());
		newBaseVis.setTransactionId(newOtherVis.getTransactionId());
		newBaseVis.setExpr(newBaseExpr);
		return newBaseVis;
	}

}
