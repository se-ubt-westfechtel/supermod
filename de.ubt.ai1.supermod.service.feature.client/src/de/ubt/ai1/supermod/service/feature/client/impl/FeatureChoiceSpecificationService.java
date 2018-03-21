/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.feature.client.impl;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;

import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.SuperModCoreFactory;
import de.ubt.ai1.supermod.mm.core.Tristate;
import de.ubt.ai1.supermod.mm.core.VersionDimension;
import de.ubt.ai1.supermod.mm.feature.ChildRelationship;
import de.ubt.ai1.supermod.mm.feature.Feature;
import de.ubt.ai1.supermod.mm.feature.FeatureModel;
import de.ubt.ai1.supermod.mm.feature.RootRelationship;
import de.ubt.ai1.supermod.mm.feature.client.FeatureConfiguration;
import de.ubt.ai1.supermod.mm.feature.client.SuperModFeatureClientFactory;
import de.ubt.ai1.supermod.service.client.IChoiceSpecificationService;
import de.ubt.ai1.supermod.service.feature.client.impl.ui.FeatureConfigurationSpecificationDialog;
import de.ubt.ai1.supermod.service.feature.client.impl.ui.FeatureConfigurationSpecificationDialog.IFeatureConfigurationValidator;

/**
 * Implementation of the choice specification service specific to the
 * feature model version dimension. It presents a dialog to the user, who
 * may bind a selection value to each feature of the feature model. It is 
 * ensured that the specified ambition is both complete and strongly consistent.
 * Partial feature configurations are disallowed.
 * 
 * @see OptionBindingSpecificationDialog
 * 
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	27.10.2014
 */
public class FeatureChoiceSpecificationService 
implements IChoiceSpecificationService {

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IChoiceSpecificationService
	 * #specifyChoice(de.ubt.ai1.supermod.mm.core.VersionDimension, 
	 * de.ubt.ai1.supermod.mm.core.OptionBinding)
	 */
	@Override
	public OptionBinding specifyChoice(final VersionDimension dim,
			OptionBinding proposedChoice, 
			final OptionBinding representedAmbition) {
		final FeatureModel fm = (FeatureModel) dim;
		
		OptionBinding choice = EcoreUtil.copy(proposedChoice);
		if (choice == null) {
			choice = SuperModCoreFactory.eINSTANCE.createOptionBinding();
		}
		choice = fm.applyCompletions(choice);
		
		// remove bindings for deleted features
		for (Feature f : fm.getFeatures()) {
			if (!f.getEliminations().isEmpty()) {
				choice.bind(f.getFeatureOption(), Tristate.UNKNOWN);
			}
		}		
		
		FeatureConfiguration conf = SuperModFeatureClientFactory.eINSTANCE
				.createFeatureConfiguration();
		conf.setOptionBinding(choice);
		conf.setFeatureModel(fm);
		if (!fm.getOptions().isEmpty()) {
			// fix all root features and their mandatory children.
			Set<Feature> fixedFeatures = new HashSet<>();
			for (RootRelationship rr : ((FeatureModel) fm).getRoots()) {
				Feature f = rr.getFeature();
				fixFeatureAndMandatoryChildren(fixedFeatures, f);
			}
			for (Feature f : fixedFeatures) {
				choice.bind(f.getFeatureOption(), Tristate.TRUE);
			}
			
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
					OptionBinding completeBinding = fm.applyCompletions(
							conf.getOptionBinding());
					// check for completeness and strong consistency.
					boolean complete = fm.isComplete(completeBinding);
					if (!complete) {
						return "The selection is not yet complete.";
					}
					boolean stronglyConsistent = fm.validate(completeBinding)
							== Tristate.TRUE;
					if (!stronglyConsistent) {
						return "The selected feature configuration is inconsistent.";
					}
					boolean representative = representedAmbition == null ||
							representedAmbition.getNumberOfBindings() == 0 ||
							representedAmbition.implies(completeBinding)
							!= Tristate.FALSE;
					if (!representative) {
						return "The selected feature configuration is not a "
								+ "representative of the recorded ambition.";
					}
					return null;
					}});
					dia.setTitle("Feature Choice.");
					dia.setMessage("Toggle feature binding by double click:");			
					dia.setInput(fm);
					dia.create();
					result.set(dia.open());
				}
			});
			if (result.get() != Window.OK) {
				return null;
			}
		}
		return choice;
	}

	/**
	 * Recursively fixes a feature and its mandatory children.
	 *
	 * @param fixedFeatures
	 * @param f
	 */
	private void fixFeatureAndMandatoryChildren(Set<Feature> fixedFeatures, 
			Feature f) {
		fixedFeatures.add(f);
		for (ChildRelationship cr : f.getChildren()) {
			Feature c = cr.getChild();
			if (c.getMandatory() != null) {
				fixFeatureAndMandatoryChildren(fixedFeatures, c);
			}
		}
	}

}
