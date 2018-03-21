/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.feature.client.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;

import de.ubt.ai1.supermod.mm.core.Option;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.SuperModCoreFactory;
import de.ubt.ai1.supermod.mm.core.Tristate;
import de.ubt.ai1.supermod.mm.core.VersionDimension;
import de.ubt.ai1.supermod.mm.feature.Feature;
import de.ubt.ai1.supermod.mm.feature.FeatureModel;
import de.ubt.ai1.supermod.mm.feature.client.FeatureConfiguration;
import de.ubt.ai1.supermod.mm.feature.client.SuperModFeatureClientFactory;
import de.ubt.ai1.supermod.service.client.IChoiceMigrationService;
import de.ubt.ai1.supermod.service.feature.client.impl.ui.FeatureConfigurationSpecificationDialog;
import de.ubt.ai1.supermod.service.feature.client.impl.ui.FeatureConfigurationSpecificationDialog.IFeatureConfigurationValidator;
import de.ubt.ai1.supermod.service.logical.client.impl.LogicalChoiceMigrationService;

/**
 * An implementation of the local choice migration service specific to the
 * version dimension of feature models. It creates a copy of the choice, which
 * binds all unbound options to one of the values {@link Tristate#TRUE} or
 * {@link Tristate#FALSE} which must be in line with all specified ambitions.
 * 
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	27.10.2014
 */
public class FeatureChoiceMigrationService 
extends LogicalChoiceMigrationService
implements IChoiceMigrationService {

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IChoiceMigrationService
	 * #migrateChoice(de.ubt.ai1.supermod.mm.core.VersionDimension, 
	 * de.ubt.ai1.supermod.mm.core.OptionBinding, java.util.List)
	 */
	@Override
	public OptionBinding migrateChoice(VersionDimension dim, 
			OptionBinding choice, List<OptionBinding> ambitions) {
		OptionBinding autoChoice = autoMigrateChoice(dim, choice, ambitions);
		final OptionBinding migChoice = dim.applyCompletions(
				autoChoice != null ? autoChoice :
			SuperModCoreFactory.eINSTANCE.createOptionBinding());
		if (!dim.isComplete(dim.applyCompletions(migChoice))) {
			// fix all automatically migrated features.
			Set<Feature> fixedFeatures = new HashSet<>();
			for (Option o : migChoice.getBoundOptions().keySet()) {
				fixedFeatures.add((Feature) o.getHighLevelConcept());
			}
			FeatureConfiguration conf = SuperModFeatureClientFactory.eINSTANCE
					.createFeatureConfiguration();
			conf.setOptionBinding(migChoice);
			conf.setFeatureModel((FeatureModel) dim);
			if (!dim.getOptions().isEmpty()) {				
				AtomicInteger result = new AtomicInteger();
				Display.getDefault().syncExec(new Runnable() {				
					@Override
					public void run() {
						FeatureConfigurationSpecificationDialog dia = 
								new FeatureConfigurationSpecificationDialog(
										Display.getDefault().getActiveShell(),
										conf, true, false, fixedFeatures);
						dia.setFeatureConfigurationValidator(
								new IFeatureConfigurationValidator() {
					@Override
					public String validate(FeatureConfiguration conf) {
						OptionBinding completeBinding = dim.applyCompletions(
								conf.getOptionBinding());
						// check for completeness and strong consistency.
						boolean complete = dim.isComplete(completeBinding);
						if (!complete) {
							return "The selection is not yet complete.";
						}
						boolean stronglyConsistent = dim.validate(completeBinding)
								== Tristate.TRUE;
						if (!stronglyConsistent) {
							return "The selected feature configuration is inconsistent.";
						}
						boolean weaklyImplies = completeBinding.implies(migChoice)
								!= Tristate.FALSE;
						if (!weaklyImplies) {
							return "The selected feature configuration is not implied by the previous choice.";
						}
						return null;
					}});
						dia.setTitle("Feature Choice Migration.");
						dia.setMessage("Toggle feature binding by double click:");			
						dia.setInput(dim);
						dia.create();
						result.set(dia.open());
					}
				});
				if (result.get() != Window.OK) {
					return null;
				}
			}
		}
		return migChoice;
	}

}
