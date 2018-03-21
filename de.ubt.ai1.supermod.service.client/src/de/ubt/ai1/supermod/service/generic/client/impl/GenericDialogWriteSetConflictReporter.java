/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.generic.client.impl;

import java.util.concurrent.atomic.AtomicBoolean;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;

import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.VersionSpace;
import de.ubt.ai1.supermod.mm.diff.WriteSet;
import de.ubt.ai1.supermod.service.client.IWriteSetConflictReporter;

/**
 * Default implementation of the conflict reporter interface which asks the user
 * whether to apply a write set containing non-representative changes anyway.
 * The dialog's return value decides whether or not the user accepts these
 * conflicts.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	25.06.2015
 */
public class GenericDialogWriteSetConflictReporter
implements IWriteSetConflictReporter {

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IWriteSetConflictReporter
	 * #report(de.ubt.ai1.supermod.mm.diff.WriteSet, 
	 * de.ubt.ai1.supermod.mm.core.OptionBinding, 
	 * de.ubt.ai1.supermod.mm.core.VersionSpace)
	 */
	@Override
	public boolean report(WriteSet writeSet, OptionBinding choice,
			VersionSpace vs) {
		AtomicBoolean result = new AtomicBoolean();
		Display.getDefault().syncExec(new Runnable() {			
			@Override
			public void run() {
				result.set(MessageDialog.openQuestion(
						Display.getDefault().getActiveShell(),
						"Write set is not sufficiently general.", 
						"The changes performed in the local workspace are too specific "
						+ "to be applicable to all versions described by the specified "
						+ "ambition. Do you want to revise your ambition? "
						+ "You can specify a more specific ambition by answering "
						+ "'Yes', using missing bindings to be inferred by the choice "
						+ "as a basis. "
						+ "Answering 'No' will cancel the commit."));				
			}
		});
		return result.get();		
	}

}
