/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.logical.client.impl;

import java.util.concurrent.atomic.AtomicInteger;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;

import de.ubt.ai1.supermod.mm.core.Option;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.SuperModCoreFactory;
import de.ubt.ai1.supermod.mm.core.Tristate;
import de.ubt.ai1.supermod.mm.core.VersionDimension;
import de.ubt.ai1.supermod.service.client.IChoiceSpecificationService;
import de.ubt.ai1.supermod.service.logical.client.impl.ui.OptionBindingSpecificationDialog;
import de.ubt.ai1.supermod.service.logical.client.impl.ui.OptionBindingSpecificationDialog.IOptionBindingValidator;

/**
 * Implementation of the choice specification service specific to the
 * low-level logical version dimension. It presents a dialog to the user, who
 * may bind the logical options to a tristate value. It is ensured that the
 * specified ambition is both complete and strongly consistent.
 * 
 * @see OptionBindingSpecificationDialog
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	01.08.2014
 */
public class LogicalChoiceSpecificationService implements
		IChoiceSpecificationService {

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IChoiceSpecificationService
	 * #specifyChoice(de.ubt.ai1.supermod.mm.core.VersionDimension, 
	 * de.ubt.ai1.supermod.mm.core.OptionBinding)
	 */
	@Override
	public OptionBinding specifyChoice(final VersionDimension dim,
			OptionBinding proposedChoice, 
			final OptionBinding representedAmbition) {
		OptionBinding choice = EcoreUtil.copy(proposedChoice);
		if (choice == null) {
			choice = SuperModCoreFactory.eINSTANCE.createOptionBinding();
		}
		if (!dim.getOptions().isEmpty()) {
			for (Option o : dim.getOptions()) {
				if (choice.getBoundOptions().get(o) == null) {
					choice.getBoundOptions().put(o, Tristate.UNKNOWN);
				}
			}
			
			final OptionBinding finalChoice = choice;
			AtomicInteger result = new AtomicInteger();
			Display.getDefault().syncExec(new Runnable() {			
				@Override
				public void run() {
					OptionBindingSpecificationDialog dia = 
							new OptionBindingSpecificationDialog(
									Display.getDefault().getActiveShell());
					dia.setTitle("Logical Choice.");
					dia.setMessage("Toggle option binding by double click:");
					dia.setOptionBinding(finalChoice);
					dia.setOptionBindingValidator(new IOptionBindingValidator() {
						@Override
						public boolean validate(OptionBinding binding) {
							OptionBinding completeBinding = dim.applyCompletions(
									binding);
							// check for completeness and strong consistency.
							boolean complete = dim.isComplete(completeBinding);
							boolean stronglyConsistent = dim.validate(completeBinding)
									== Tristate.TRUE;
							boolean representative = representedAmbition == null ||
									representedAmbition.implies(completeBinding)
									== Tristate.TRUE;
							return complete && stronglyConsistent && representative;
						}
					});
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

}
