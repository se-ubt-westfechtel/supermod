/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.revision.client.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;

import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.SuperModCoreFactory;
import de.ubt.ai1.supermod.mm.core.Tristate;
import de.ubt.ai1.supermod.mm.core.VersionDimension;
import de.ubt.ai1.supermod.mm.revision.Revision;
import de.ubt.ai1.supermod.mm.revision.RevisionDimension;
import de.ubt.ai1.supermod.service.client.IChoiceSpecificationService;
import de.ubt.ai1.supermod.service.revision.client.impl.ui.RevisionSpecificationDialog;

/**
 * An implementation of the choice specification service specific to the
 * revision dimension. It opens a dialog where the user may select a revision,
 * or a set thereof in case an explicit three-way merge is requested. An option
 * binding which corresponds to the revision selection is derived automatically.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	01.08.2014
 */
public class RevisionChoiceSpecificationService
implements IChoiceSpecificationService {

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IChoiceSpecificationService
	 * #specifyChoice(de.ubt.ai1.supermod.mm.core.VersionDimension, 
	 * de.ubt.ai1.supermod.mm.core.OptionBinding)
	 */
	@Override
	public OptionBinding specifyChoice(VersionDimension dim,
			OptionBinding proposedChoice, OptionBinding representedAmbition) {
		RevisionDimension tempDim = (RevisionDimension) dim;
		AtomicReference<OptionBinding> choiceRef = new AtomicReference<>();
		Display.getDefault().syncExec(new Runnable() {			
			@Override
			public void run() {
				RevisionSpecificationDialog revDia = createDialog();
				revDia.setTitle("Revision Choice.");
				revDia.setMessage("Select a revision below:");
				revDia.setInput(tempDim);
				revDia.setInitialSelection(tempDim.getHead());
				revDia.create();
				revDia.refresh();
				revDia.setBlockOnOpen(true);
				int result = revDia.open();
				if (result != Window.OK) {
					choiceRef.set(null);
					return;
				}
				// select the revision.
				List<Revision> selectedRevisions = new ArrayList<>();
				for (Object res : revDia.getResult()) {
					selectedRevisions.add((Revision) res);
				}
				// derive and return the corresponding option binding
				OptionBinding choice = SuperModCoreFactory.eINSTANCE
						.createOptionBinding();
				for (Revision rev : selectedRevisions) {
					choice.bind(rev.getRevisionOption(), Tristate.TRUE);
				}
				choiceRef.set(choice);
			}
		});
		return choiceRef.get();
	}

	/**
	 * Returns the dialog where the user can perform a revision selection.
	 *
	 * @return
	 */
	protected RevisionSpecificationDialog createDialog() {
		return new RevisionSpecificationDialog(
				Display.getDefault().getActiveShell());
	}

}
