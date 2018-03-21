/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.feature.client.impl;

import java.util.Map.Entry;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.mm.core.Option;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.OptionExpr;
import de.ubt.ai1.supermod.mm.core.Tristate;
import de.ubt.ai1.supermod.mm.core.VersionSpace;
import de.ubt.ai1.supermod.mm.feature.Feature;
import de.ubt.ai1.supermod.mm.feature.FeatureModel;
import de.ubt.ai1.supermod.mm.feature.GroupMembership;
import de.ubt.ai1.supermod.mm.feature.XorFeatureGroup;
import de.ubt.ai1.supermod.mm.feature.util.FeatureModelUtil;
import de.ubt.ai1.supermod.service.client.IVersionLabellingService;
import de.ubt.ai1.supermod.service.feature.IFeatureVersionDimensionProvider;
import de.ubt.ai1.supermod.service.feature.client.ISingleVersionFeatureModelDescriptorProvider;
import de.ubt.ai1.supermod.service.generic.client.impl.GenericVersionLabellingService;

/**
 * Implementation of the version labelling service that interprets a given
 * option binding as a feature configuration. Expressions are shortened in a
 * way that mandatory features are skipped.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	01.12.2014
 */
public class FeatureConfigurationLabellingService
extends GenericVersionLabellingService
implements IVersionLabellingService {
	
	@Inject
	private IFeatureVersionDimensionProvider repoFmProvider;
	
	@Inject
	private ISingleVersionFeatureModelDescriptorProvider wsFmProvider;

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.generic.client.impl.
	 * GenericVersionLabellingService#getLabel(
	 * de.ubt.ai1.supermod.mm.core.OptionBinding,
	 *  de.ubt.ai1.supermod.mm.core.VersionSpace)
	 */
	@Override
	public String getLabel(OptionBinding ob, VersionSpace vs, boolean ambition) {
		FeatureModel repoFm = repoFmProvider.getFeatureDimension(vs);
		FeatureModel wsFm = wsFmProvider.getSingleVersionFeatureModelDescriptor(
				((LocalRepository) vs.getRepository()).getLocalDescriptor())
				.getFeatureModel();
		if (ob == null) return null;
		OptionBinding wsOb = FeatureModelUtil.mapFeatureConfiguration(ob, 
				repoFm, wsFm, true);
		String s = "";
		int nOptional = 0;
		for (Feature repoF : repoFm.getFeatures()) {
			if (repoF.getMandatory() == null) {
				nOptional++;
			}
		}
		if (!ambition && nOptional > 1) {
			s += "..., ";
		}
		BO: for (Entry<Option, Tristate> e : wsOb.getBoundOptions()) {
			if (e.getValue() != Tristate.UNKNOWN) {
				Feature f = (Feature) e.getKey().getHighLevelConcept();
				if (!ambition) {
					// do not list mandatory features if there are several
					// optional features
					if (f.getMandatory() != null && nOptional > 1) {
						continue BO;
					}
					// do not list deleted (eliminated) features
					if (!f.getEliminations().isEmpty()) {
						continue BO;
					}
					// do not list unselected features among XOR groups
					if (e.getValue() == Tristate.FALSE) {
						for (GroupMembership gm : f.getGroupedBy())	{
							if (gm.getGroup() instanceof XorFeatureGroup) {
								continue BO;
							}
						}
					}
				}
				if (e.getValue() == Tristate.FALSE) {
					s += "not ";
				}
				s += f.getNames().isEmpty() ? 
						"<" + f.getUuid() + ">" : 
						f.getNames().get(0).getDisplayName();
				s += ", ";
			}
		}
		if (s.endsWith(", ")) {
			s = s.substring(0, s.length() - 2);
		}
		if (s.isEmpty()) {
			s = getDefaultLabel();
		}
		return s;
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.generic.client.impl.
	 * GenericVersionLabellingService#getLabel(
	 * de.ubt.ai1.supermod.mm.core.OptionExpr, 
	 * de.ubt.ai1.supermod.mm.core.VersionSpace)
	 */
	@Override
	public String getLabel(OptionExpr expr, VersionSpace vs) {
		if (expr == null) return null;
		String label = super.getLabel(expr, vs);
		for (Option o : expr.getReferencedOptions()) {
			Feature f = (Feature) o.getHighLevelConcept();
			if (!f.getNames().isEmpty()) {
				label = label.replace(o.getName(), 
						f.getNames().get(0).getDisplayName());
			}
		}
		return label;
	}

}
