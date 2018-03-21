/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.collab.client.impl;

import java.util.Date;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicReference;

import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.mm.collab.CollaborativeRevisionDimension;
import de.ubt.ai1.supermod.mm.collab.PrivateRevision;
import de.ubt.ai1.supermod.mm.collab.PublicRevision;
import de.ubt.ai1.supermod.mm.collab.Revision;
import de.ubt.ai1.supermod.mm.core.DefaultBinding;
import de.ubt.ai1.supermod.mm.core.Option;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.OptionRef;
import de.ubt.ai1.supermod.mm.core.Preference;
import de.ubt.ai1.supermod.mm.core.SuperModCoreFactory;
import de.ubt.ai1.supermod.mm.core.Tristate;
import de.ubt.ai1.supermod.service.client.IPushPreProcessor;
import de.ubt.ai1.supermod.service.collab.ICollabDimensionProvider;

/**
 * An implementation of the push pre processor client service interface
 * specific to the "pure collaborative" version space. The previously
 * introduced public revision is completed with all necessary details.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	12.11.2015
 */
public class CollabPushPreProcessor
implements IPushPreProcessor {
	
	@Inject
	private ICollabDimensionProvider collDimProvider;
	
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IPushPreProcessor
	 * #preProcess(de.ubt.ai1.supermod.mm.client.LocalRepository)
	 */
	@Override
	public boolean preProcess(LocalRepository repo) {
		CollaborativeRevisionDimension collDim = collDimProvider
				.getCollabDimension(repo.getVersionSpace());
		PublicRevision current = collDim.getCurrentPublicRevision();
		
		// ask the user for a push message and set additional details
		AtomicReference<String> pushMsg = new AtomicReference<String>();

		Display.getDefault().syncExec(new Runnable() {			
			@Override
			public void run() {
				InputDialog pushMsgInput = new InputDialog(
						Display.getDefault().getActiveShell(), "Push Message", 
						"Please enter a message describing your changes since "
						+ "the most recent push.", "", null);
				int result = pushMsgInput.open();
				if (result == Window.OK) {
					pushMsg.set(pushMsgInput.getValue());				
				}
			}
		});
		if (pushMsg.get() == null) {
			return false;
		}		
		current.setCommitMessage(pushMsg.get());
		current.setDate(new Date());
		
		// finish revision by introducing its second option.
		Option finOpt = SuperModCoreFactory.eINSTANCE.createOption();
		finOpt.setName("r" + current.getRevisionNumber() + ".final");
		current.setFinishedOption(finOpt);
		
		// create finishing default binding
		DefaultBinding finDefault = SuperModCoreFactory.eINSTANCE
				.createDefaultBinding();
		finDefault.setName("r" + current.getDisplayRevisionNumber()
				+ ":FALSE");
		finDefault.setOption(finOpt);
		finDefault.setState(Tristate.FALSE);
		current.setFinishedDefaultBinding(finDefault);
		
		// connect to private head
		PrivateRevision privateHead = current.getPrivateHead();
		if (privateHead != null) {
			// do not add private head to successors list;
			// this would cause a cycle
			Preference predPref = SuperModCoreFactory.eINSTANCE
					.createPreference();
			predPref.setName("r" + 
					current.getRevisionNumber() +
					".final=>r" + privateHead.getDisplayRevisionNumber());
			predPref.setOption(privateHead.getRevisionOption());
			OptionRef optRef = SuperModCoreFactory.eINSTANCE
					.createOptionRef();
			optRef.setOption(finOpt);
			predPref.setOptionExpr(optRef);
			current.getPredecessorPreferences().add(predPref);
		}		

		// connect to previous public head
		PublicRevision publicHead = collDim.getPublicHead();
		if (publicHead != null && publicHead != current) {
			current.getPredecessors().add(publicHead);
			Preference predPref = SuperModCoreFactory.eINSTANCE
					.createPreference();
			predPref.setName("r" + 
					current.getRevisionNumber() +
					".final=>r" + publicHead.getDisplayRevisionNumber());
			predPref.setOption(publicHead.getRevisionOption());
			OptionRef optRef = SuperModCoreFactory.eINSTANCE
					.createOptionRef();
			optRef.setOption(finOpt);
			predPref.setOptionExpr(optRef);
			current.getPredecessorPreferences().add(predPref);
		}	
		
		// set as public head
		collDim.setPublicHead(current);
		
		// update the local choice
		OptionBinding choice = repo.getLocalChoice();
		for (Option o : new HashSet<Option>(choice.getBoundOptions().keySet())) {
			if (o.getHighLevelConcept() instanceof Revision) {
				choice.getBoundOptions().removeKey(o);
			}
		}
		choice.bind(finOpt, Tristate.TRUE);
		
		return true;
	}
	
}
