/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.feature.validation;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;

import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.SuperModCoreFactory;
import de.ubt.ai1.supermod.mm.core.Tristate;
import de.ubt.ai1.supermod.mm.feature.FeatureModel;

/**
 * A validation constraint that checks for satisfiability of the feature
 * model, providing all standard bindings.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	08.09.2015
 */
public class FeatureModelConsistencyConstraint 
extends AbstractModelConstraint {

	/* (non-Javadoc)
	 * @see org.eclipse.emf.validation.AbstractModelConstraint
	 * #validate(org.eclipse.emf.validation.IValidationContext)
	 */
	@Override
	public IStatus validate(IValidationContext ctx) {
		EObject eo = ctx.getTarget();
		if (eo instanceof FeatureModel) {
			FeatureModel fm = (FeatureModel) eo;
			OptionBinding ob = SuperModCoreFactory.eINSTANCE
					.createOptionBinding();
			ob = fm.applyCompletions(ob);
			boolean sat = fm.validate(ob) != Tristate.FALSE 
					&& fm.isSatisfiable(ob);
			if (!sat) {
				return ctx.createFailureStatus(fm);
			}
		}
		return ctx.createSuccessStatus();
	}
	
}