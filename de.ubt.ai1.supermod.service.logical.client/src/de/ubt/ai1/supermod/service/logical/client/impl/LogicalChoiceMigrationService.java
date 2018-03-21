/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.logical.client.impl;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;

import de.ubt.ai1.supermod.mm.core.Option;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.SuperModCoreFactory;
import de.ubt.ai1.supermod.mm.core.Tristate;
import de.ubt.ai1.supermod.mm.core.VersionDimension;
import de.ubt.ai1.supermod.service.client.IChoiceMigrationService;
import de.ubt.ai1.supermod.service.logical.client.impl.ui.OptionBindingSpecificationDialog;
import de.ubt.ai1.supermod.service.logical.client.impl.ui.OptionBindingSpecificationDialog.IOptionBindingValidator;

/**
 * An implementation of the local choice migration service specific to the
 * low-level logical version dimension. It guesses missing options using the
 * ambitions specified for the preceding commit. In case there are still some
 * options unbound, the user is involved.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	01.08.2014
 */
public class LogicalChoiceMigrationService implements IChoiceMigrationService {

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IChoiceMigrationService
	 * #migrateChoice(de.ubt.ai1.supermod.mm.core.VersionDimension, 
	 * de.ubt.ai1.supermod.mm.core.OptionBinding, java.util.List)
	 */
	@Override
	public OptionBinding migrateChoice(VersionDimension dim, 
			OptionBinding choice, List<OptionBinding> ambitions) {
		OptionBinding migChoice = autoMigrateChoice(dim, choice, ambitions);
		if (migChoice == null) {
			migChoice = SuperModCoreFactory.eINSTANCE.createOptionBinding();
		}
		if (!dim.isComplete(migChoice)) {
			if (!dim.getOptions().isEmpty()) {
				for (Option o : dim.getOptions()) {
					if (migChoice.getBoundOptions().get(o) == null) {
						migChoice.getBoundOptions().put(o, Tristate.UNKNOWN);
					}
				}
				
				final OptionBinding finalMigChoice = migChoice;				
				AtomicInteger result = new AtomicInteger();
				Display.getDefault().syncExec(new Runnable() {			
					@Override
					public void run() {
						OptionBindingSpecificationDialog dia = 
								new OptionBindingSpecificationDialog(
										Display.getDefault().getActiveShell());
						dia.setOptionBinding(finalMigChoice);
						dia.setOptionBindingValidator(new IOptionBindingValidator() {
								@Override
								public boolean validate(OptionBinding ob) {
									OptionBinding completeBinding = 
											dim.applyCompletions(ob);
									// check for completeness and strong consistency.
									boolean complete = dim.isComplete(completeBinding);
									boolean stronglyConsistent = dim.validate(
											completeBinding) == Tristate.TRUE;
									boolean weaklyImplies = completeBinding.implies(
											choice) != Tristate.FALSE;
									return complete && stronglyConsistent 
											&& weaklyImplies;
								}});
						dia.setTitle("Logical Choice Migration.");
						dia.setMessage("Toggle option binding by double click:");			
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

	/**
	 * Creates a copy of the choice, which binds all unbound options to one of
	 * the values {@link Tristate#TRUE} or {@link Tristate#FALSE} which must be 
	 * in line with all specified ambitions. The returned choice, however,
	 * is not necessarily complete.
	 *
	 * @param dim
	 * @param choice
	 * @param ambitions
	 * @return automatically migrated choice.
	 */
	protected OptionBinding autoMigrateChoice(VersionDimension dim,
			OptionBinding choice, List<OptionBinding> ambitions) {
		if (choice == null) {
			choice = SuperModCoreFactory.eINSTANCE.createOptionBinding();
		}
		OptionBinding migChoice = EcoreUtil.copy(choice);
		for (Option logOpt : dim.getOptions()) {
			Tristate choiceState = choice.getBoundOptions().get(logOpt);
			Tristate migState = Tristate.UNKNOWN;
			// for unbound options, find a suitable binding value within the
			// specified ambitions.
			for (OptionBinding amb : ambitions) {
				Tristate ambState = amb.getState(logOpt);
				if (ambState == Tristate.TRUE) {
					if (migState == Tristate.UNKNOWN) {
						migState = Tristate.TRUE;
					}
					else if (migState == Tristate.FALSE) {
						migState = null;
						break;
					}
				}
				if (ambState == Tristate.FALSE) {
					if (migState == Tristate.UNKNOWN) {
						migState = Tristate.FALSE;
					}
					else if (migState == Tristate.TRUE) {
						migState = null;
						break;
					}
				}
			}
			if (migState != null && migState != Tristate.UNKNOWN) {
				migChoice.bind(logOpt, migState);
			}
			else if (choiceState != null && choiceState != Tristate.UNKNOWN) {
				migChoice.bind(logOpt, choiceState);
			}
			else {
				migChoice.bind(logOpt, Tristate.UNKNOWN);
			}
		}
		return migChoice;
	}

}
