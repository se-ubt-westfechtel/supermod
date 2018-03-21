/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.change.client.impl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import de.ubt.ai1.supermod.mm.change.Change;
import de.ubt.ai1.supermod.mm.change.ChangeDimension;
import de.ubt.ai1.supermod.mm.change.ChangeSet;
import de.ubt.ai1.supermod.mm.change.SuperModChangeFactory;
import de.ubt.ai1.supermod.mm.core.ImpliesExpr;
import de.ubt.ai1.supermod.mm.core.Invariant;
import de.ubt.ai1.supermod.mm.core.Option;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.OptionExpr;
import de.ubt.ai1.supermod.mm.core.OptionRef;
import de.ubt.ai1.supermod.mm.core.Preference;
import de.ubt.ai1.supermod.mm.core.SuperModCoreFactory;
import de.ubt.ai1.supermod.mm.core.Tristate;
import de.ubt.ai1.supermod.mm.core.VersionDimension;
import de.ubt.ai1.supermod.service.client.IAmbitionSpecificationService;

/**
 * An implementation of the ambition specification service specific to the
 * change dimension. It considers the proposed ambition to be the ambition from
 * which a newly introduced change shall abstract.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	24.06.2015
 */
public class ChangeAmbitionSpecificationService 
implements IAmbitionSpecificationService {

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IAmbitionSpecificationService
	 * #specifyAmbition(de.ubt.ai1.supermod.mm.core.VersionDimension,
	 * de.ubt.ai1.supermod.mm.core.OptionBinding,
	 * de.ubt.ai1.supermod.mm.core.OptionBinding)
	 */
	@Override
	public OptionBinding specifyAmbition(VersionDimension dim,
			OptionBinding choice, OptionBinding recordedAmbition,
			OptionBinding proposedAmbition) {
		// create the user ambition visibility.
		OptionExpr ambVis = proposedAmbition.toVisibility();

		// create a change set and a change.
		Change c = SuperModChangeFactory.eINSTANCE.createChange();
		c.setUuid(EcoreUtil.generateUUID());
		c.setUserAmbitionBinding(proposedAmbition);
		c.setUserAmbitionExpr(ambVis);

		// create the change option.
		Option changeOpt = SuperModCoreFactory.eINSTANCE.createOption();
		changeOpt.setName("co_" + c.getUuid());
		c.setChangeOption(changeOpt);

		// create the change invariant.
		Invariant changeInv = SuperModCoreFactory.eINSTANCE.createInvariant();
		changeInv.setName("ci_" + c.getUuid());
		OptionRef invOptRef = SuperModCoreFactory.eINSTANCE.createOptionRef();
		invOptRef.setOption(changeOpt);
		ImpliesExpr invExpr = SuperModCoreFactory.eINSTANCE.createImpliesExpr();
		invExpr.setLeft(invOptRef);
		invExpr.setRight(EcoreUtil.copy(ambVis));
		changeInv.setOptionExpr(invExpr);
		c.setChangeInvariant(changeInv);

		// create the change preference.
		Preference changePref = SuperModCoreFactory.eINSTANCE
				.createPreference();
		changePref.setName("cp_" + c.getUuid());
		changePref.setOption(changeOpt);
		changePref.setOptionExpr(EcoreUtil.copy(ambVis));
		c.setChangePreference(changePref);

		// return a binding that includes only the change option.
		OptionBinding ob = SuperModCoreFactory.eINSTANCE.createOptionBinding();
		ob.bind(c.getChangeOption(), Tristate.TRUE);
		return ob;
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IAmbitionSpecificationService
	 * #undoAmbitionSpecification(de.ubt.ai1.supermod.mm.core.VersionDimension,
	 * de.ubt.ai1.supermod.mm.core.OptionBinding)
	 */
	@Override
	public void undoAmbitionSpecification(VersionDimension dim,
			OptionBinding specifiedAmbition) {
		ChangeDimension cd = (ChangeDimension) dim;
		for (Option newO : specifiedAmbition.getBoundOptions().keySet()) {
			Change c = (Change) newO.getHighLevelConcept();
			ChangeSet cs = c.getChangeSet();
			if (cs != null) {
				cs.getChanges().remove(c);
			}
			if (cs.getChanges().isEmpty()) {
				cd.getChangeSets().remove(cs);
			}
		}
	}

}
