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
import de.ubt.ai1.supermod.service.client.IAmbitionSpecificationService;
import de.ubt.ai1.supermod.service.logical.client.impl.ui.OptionBindingSpecificationDialog;
import de.ubt.ai1.supermod.service.logical.client.impl.ui.OptionBindingSpecificationDialog.IOptionBindingValidator;

/**
 * Implementation of the ambition specification service specific to the
 * low-level logical version dimension. It presents a dialog to the user, who
 * may bind the logical options to a tristate value. It is ensured that the
 * specified ambition is weakly consistent, and there exists a version within
 * the ambition which is implied by the choice.
 * 
 * @see OptionBindingSpecificationDialog
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	01.08.2014
 */
public class LogicalAmbitionSpecificationService implements
		IAmbitionSpecificationService {

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IAmbitionSpecificationService
	 * #specifyAmbition(de.ubt.ai1.supermod.mm.core.VersionDimension, 
	 * de.ubt.ai1.supermod.mm.core.OptionBinding, 
	 * de.ubt.ai1.supermod.mm.core.OptionBinding)
	 */
	@Override
	public OptionBinding specifyAmbition(final VersionDimension dim, 
			final OptionBinding choice,	OptionBinding recordedAmbition,
			OptionBinding proposedAmbition) {
		// in case a suitable ambition has been already specified in advance,
		// don't bother the user with specification.
		if (recordedAmbition != null && 
				recordedAmbition.getNumberOfBindings() > 0 &&
				choice.implies(recordedAmbition) != Tristate.FALSE &&
				dim.validate(recordedAmbition) != Tristate.FALSE &&
				dim.isSatisfiable(recordedAmbition)) {
			return EcoreUtil.copy(recordedAmbition);
		}		
		
		// let the user select the ambition in a dialog.
		OptionBinding ambition = proposedAmbition != null ?
				EcoreUtil.copy(proposedAmbition) :
					SuperModCoreFactory.eINSTANCE.createOptionBinding();
		if (dim.getOptions().isEmpty()) {
			return ambition;
		}
		for (Option o : dim.getOptions()) {
			if (ambition.getBoundOptions().get(o) == null) {
				ambition.getBoundOptions().put(o, Tristate.UNKNOWN);
			}
		}
		
		AtomicInteger result = new AtomicInteger();
		Display.getDefault().syncExec(new Runnable() {			
			@Override
			public void run() {
				OptionBindingSpecificationDialog dia = new 
						OptionBindingSpecificationDialog(
								Display.getDefault().getActiveShell());
				dia.setTitle("Logical Ambition.");
				dia.setMessage("Toggle option binding by double click:");
				dia.setOptionBinding(ambition);
				dia.setOptionBindingValidator(new IOptionBindingValidator() {
					@Override
					public boolean validate(OptionBinding binding) {
						OptionBinding completeAmbition = dim.applyCompletions(
								binding);
						// check for weak consistency and implication by the choice.
						boolean weaklyConsistent = 
								dim.validate(completeAmbition) != Tristate.FALSE &&
								dim.isSatisfiable(completeAmbition);
						boolean weaklyImplies = choice.implies(completeAmbition) 
								!= Tristate.FALSE;
						return weaklyConsistent && weaklyImplies;
					}
				});
				dia.create();
				result.set(dia.open());				
			}
		});

		if (result.get() != Window.OK) {
			return null;
		}
		return ambition;
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IAmbitionSpecificationService
	 * #undoAmbitionSpecification(de.ubt.ai1.supermod.mm.core.VersionDimension,
	 *  de.ubt.ai1.supermod.mm.core.OptionBinding)
	 */
	@Override
	public void undoAmbitionSpecification(VersionDimension dim,
			OptionBinding specifiedAmbition) {
		// since the dimension is not modified during ambition specification,
		// there is nothing to undo.
	}

}
