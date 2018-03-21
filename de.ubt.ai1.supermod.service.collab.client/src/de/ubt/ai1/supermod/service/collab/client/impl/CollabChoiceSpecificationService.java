/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.collab.client.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;

import de.ubt.ai1.supermod.mm.collab.CollaborativeRevisionDimension;
import de.ubt.ai1.supermod.mm.collab.PublicRevision;
import de.ubt.ai1.supermod.mm.collab.Revision;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.SuperModCoreFactory;
import de.ubt.ai1.supermod.mm.core.Tristate;
import de.ubt.ai1.supermod.mm.core.VersionDimension;
import de.ubt.ai1.supermod.service.client.IChoiceSpecificationService;
import de.ubt.ai1.supermod.service.collab.client.impl.ui.CollabRevisionSpecificationDialog;

/**
 * An implementation of the choice specification service specific to the
 * collab dimension. It opens a dialog where the user may select a revision,
 * or a set thereof in case an explicit three-way merge is requested. An option
 * binding which corresponds to the revision selection is derived automatically.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	28.10.2015
 */
public class CollabChoiceSpecificationService 
implements IChoiceSpecificationService {

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IChoiceSpecificationService
	 * #specifyChoice(de.ubt.ai1.supermod.mm.core.VersionDimension, 
	 * de.ubt.ai1.supermod.mm.core.OptionBinding, 
	 * de.ubt.ai1.supermod.mm.core.OptionBinding)
	 */
	@Override
	public OptionBinding specifyChoice(VersionDimension dim, 
			OptionBinding proposedChoice, OptionBinding representedAmbition) {
		AtomicReference<List<Object>> result = new AtomicReference<>();
		Display.getDefault().syncExec(new Runnable() {			
			@Override
			public void run() {
				CollaborativeRevisionDimension collDim =
						(CollaborativeRevisionDimension) dim;
				CollabRevisionSpecificationDialog revDia = createDialog();
				revDia.setTitle("Revision Choice.");
				revDia.setMessage("Select a revision below:");
				revDia.setInput(collDim);
				EList<Revision> proposedRevisions = ECollections.newBasicEList(
						collDim.getRevisionsForBinding(proposedChoice));
				if (proposedRevisions.isEmpty()
						&& collDim.getPublicHead() != null) {
					proposedRevisions.add(collDim.getPublicHead());
				}
				revDia.setInitialSelections(proposedRevisions.toArray());
				revDia.create();
				revDia.refreshAndExpand();
				revDia.setBlockOnOpen(true);
				if (revDia.open() == Window.OK) {
					result.set(Arrays.asList(revDia.getResult()));
				}				
			}
		});
		if (result.get() == null) {
			return null;
		}
		
		// select the revision. Unfinished public revisions are not allowed.
		List<Revision> selectedRevisions = new ArrayList<>();
		for (Object res : result.get()) {
			selectedRevisions.add((Revision) res);
		}
		if (selectedRevisions.isEmpty()) {
			return null;
		}
		
		// derive and return the corresponding option binding
		OptionBinding choice = SuperModCoreFactory.eINSTANCE
				.createOptionBinding();
		for (Revision rev : selectedRevisions) {
			if (rev instanceof PublicRevision && 
					((PublicRevision) rev).isFinished()) {
				choice.bind(((PublicRevision) rev).getFinishedOption(),
						Tristate.TRUE);
			}
			else {
				choice.bind(rev.getRevisionOption(), Tristate.TRUE);
			}
		}
		return choice;
	}

	/**
	 * Returns the dialog where the user can perform a revision selection.
	 *
	 * @return
	 */
	protected CollabRevisionSpecificationDialog createDialog() {
		return new CollabRevisionSpecificationDialog(
				Display.getDefault().getActiveShell());
	}
	
}
