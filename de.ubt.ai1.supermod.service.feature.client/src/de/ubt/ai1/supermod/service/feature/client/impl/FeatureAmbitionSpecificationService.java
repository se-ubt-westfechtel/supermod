/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.feature.client.impl;

import java.util.concurrent.atomic.AtomicInteger;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;

import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.SuperModCoreFactory;
import de.ubt.ai1.supermod.mm.core.Tristate;
import de.ubt.ai1.supermod.mm.core.VersionDimension;
import de.ubt.ai1.supermod.mm.feature.Feature;
import de.ubt.ai1.supermod.mm.feature.FeatureModel;
import de.ubt.ai1.supermod.mm.feature.client.FeatureConfiguration;
import de.ubt.ai1.supermod.mm.feature.client.SuperModFeatureClientFactory;
import de.ubt.ai1.supermod.service.client.IAmbitionSpecificationService;
import de.ubt.ai1.supermod.service.feature.client.impl.ui.FeatureConfigurationSpecificationDialog;
import de.ubt.ai1.supermod.service.feature.client.impl.ui.FeatureConfigurationSpecificationDialog.IFeatureConfigurationValidator;

/**
 * Implementation of the ambition specification service specific to the
 * feature model version dimension. It presents a dialog to the user, who
 * may bind a selection value to each feature of the feature model. It is
 * ensured that the specified ambition is weakly consistent, and there exists a
 * version within the ambition which is implied by the choice. The selected
 * feature configuration may be partial.
 * 
 * @see FeatureConfigurationSpecificationDialog
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	27.10.2014
 */
public class FeatureAmbitionSpecificationService 
implements IAmbitionSpecificationService {
	
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IAmbitionSpecificationService
	 * #specifyAmbition(de.ubt.ai1.supermod.service.client.VersionDimension, 
	 * de.ubt.ai1.supermod.service.client.OptionBinding,
	 *  de.ubt.ai1.supermod.service.client.OptionBinding)
	 */
	@Override
	public OptionBinding specifyAmbition(final VersionDimension dim, 
			final OptionBinding choice, OptionBinding recordedAmbition,
			OptionBinding proposedAmbition) {
		final FeatureModel fm = (FeatureModel) dim;
		
		// in case a suitable ambition has been already specified in advance,
		// don't bother the user with specification.
		if (recordedAmbition != null && 
				choice.implies(recordedAmbition) != Tristate.FALSE &&
						fm.validate(recordedAmbition) != Tristate.FALSE &&
								fm.isSatisfiable(recordedAmbition)) {
			return EcoreUtil.copy(recordedAmbition);
		}
		
		// create a feature configuration based on the proposed ambition.
		OptionBinding ambition = EcoreUtil.copy(proposedAmbition);
		if (ambition == null) {
			ambition = SuperModCoreFactory.eINSTANCE.createOptionBinding();
		}
		if (fm.getOptions().isEmpty()) {
			return ambition;
		}
		
		// remove bindings for deleted features
		for (Feature f : fm.getFeatures()) {
			if (!f.getEliminations().isEmpty()) {
				ambition.bind(f.getFeatureOption(), Tristate.UNKNOWN);
			}
		}		
		
		FeatureConfiguration conf = SuperModFeatureClientFactory.eINSTANCE
				.createFeatureConfiguration();
		conf.setOptionBinding(ambition);
		conf.setFeatureModel(fm);
		if (!fm.getOptions().isEmpty()) {			
			AtomicInteger result = new AtomicInteger();
			Display.getDefault().syncExec(new Runnable() {				
				@Override
				public void run() {
					FeatureConfigurationSpecificationDialog dia = new 
							FeatureConfigurationSpecificationDialog(
									Display.getDefault().getActiveShell(),
									conf, false, true, null);
					dia.setFeatureConfigurationValidator(
									new IFeatureConfigurationValidator() {
					@Override
					public String validate(FeatureConfiguration conf) {
						OptionBinding completeAmbition = fm.applyCompletions(
								conf.getOptionBinding());
						// check for weak consistency and implication by the choice.
						boolean weaklyImplies = choice == null ||
								choice.getNumberOfBindings() == 0 ||
								choice.implies(completeAmbition)
								!= Tristate.FALSE;
						if (!weaklyImplies) {
							return "The selected partial configuration does not "
									+ "contain the current choice.";
						}
						boolean weaklyConsistent = 
								fm.validate(completeAmbition) != Tristate.FALSE &&
										fm.isSatisfiable(completeAmbition);
						if (!weaklyConsistent) {
							return "The selected partial configuration is "
									+ "inconsistent.";
						}
						return null;
					}});
					dia.setTitle("Feature Ambition.");
					dia.setMessage("Change feature binding by double click:");
					dia.setInput(fm);					
					dia.create();
					result.set(dia.open());
				}
			});
			
			if (result.get() != Window.OK) {
				return null;
			}
		}
		return ambition;
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IAmbitionSpecificationService
	 * #undoAmbitionSpecification(de.ubt.ai1.supermod.mm.core.VersionDimension,
	 * de.ubt.ai1.supermod.mm.core.OptionBinding)
	 */
	@Override
	public void undoAmbitionSpecification(VersionDimension dim,
			OptionBinding specifiedAmbition) {
		// since the dimension is not modified during ambition specification,
		// there is nothing to undo.
	}

}
