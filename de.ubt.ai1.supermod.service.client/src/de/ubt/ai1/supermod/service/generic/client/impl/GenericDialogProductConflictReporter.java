/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.generic.client.impl;

import java.util.concurrent.atomic.AtomicInteger;

import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;

import de.ubt.ai1.supermod.mm.client.ConflictSet;
import de.ubt.ai1.supermod.mm.client.Severity;
import de.ubt.ai1.supermod.service.client.IProductConflictReporter;
import de.ubt.ai1.supermod.service.generic.client.impl.ui.ConflictsDialog;

/**
 * Default implementation of the conflict reporter interface which displays the
 * conflict set as a simple list in a dialog. the dialog's return value decides
 * whether or not the user accepts these conflicts.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	27.04.2015
 */
public class GenericDialogProductConflictReporter 
implements IProductConflictReporter {

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IProductConflictReporter
	 * #report(de.ubt.ai1.supermod.mm.client.ConflictSet)
	 */
	@Override
	public boolean report(ConflictSet conflicts) {
		if (conflicts.getSeverity() == Severity.WARNING) {
			return true;
		}
		AtomicInteger result = new AtomicInteger();
		Display.getDefault().syncExec(new Runnable() {			
			@Override
			public void run() {
				ConflictsDialog dia = new ConflictsDialog(
						Display.getDefault().getActiveShell());
				dia.setTitle("Product Space Conflicts");
				dia.setMessage("Product space validation detected the following "
						+ "conflicts. You may choose to continue, resolving "
						+ "conflicts later, or to cancel the operation.");
				dia.setInput(conflicts);
				dia.create();
				dia.refreshAndExpand();
				dia.setBlockOnOpen(true);
				result.set(dia.open());
			}
		});
		return result.get() == Window.OK;
	}

}
