/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.edit.feature.client.provider;

import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.IStructuredSelection;

import de.ubt.ai1.supermod.mm.feature.Feature;
import de.ubt.ai1.supermod.mm.feature.SuperModFeatureFactory;
import de.ubt.ai1.supermod.mm.feature.SuperModFeaturePackage;

/**
 * A double click listener for feature models. In case a feature is 
 * double-clicked, it is toggled between mandatory and optional.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	28.10.2014
 */
public class FeatureModelDoubleClickListener implements IDoubleClickListener {
	
	private EditingDomain editingDomain;

	/**
	 * Creates a new instance of the double click listener
	 *
	 * @param editingDomain all commands to perform the toggle between
	 * 			mandatory and optional will be executed here
	 */
	public FeatureModelDoubleClickListener(EditingDomain editingDomain) {
		this.editingDomain = editingDomain;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.IDoubleClickListener#doubleClick(
	 * org.eclipse.jface.viewers.DoubleClickEvent)
	 */
	@Override
	public void doubleClick(DoubleClickEvent event) {
		if (event.getSelection() instanceof IStructuredSelection) {
			Object selection = ((IStructuredSelection)
					event.getSelection()).getFirstElement();
			if (selection instanceof Feature) {
				toggleMandatory((Feature) selection);
			}
		}		
		event.getViewer().refresh();
	}

	/**
	 * Adds or removes a 'Mandatory' object which is contained in the specified
	 * feature.
	 *
	 * @param feature
	 */
	private void toggleMandatory(Feature feature) {
		if (feature.getMandatory() != null) {
			editingDomain.getCommandStack().execute(new SetCommand(
					editingDomain, feature, 
					SuperModFeaturePackage.Literals.FEATURE__MANDATORY, 
					null));
		}
		else {
			editingDomain.getCommandStack().execute(new SetCommand(
					editingDomain, feature, 
					SuperModFeaturePackage.Literals.FEATURE__MANDATORY, 
					SuperModFeatureFactory.eINSTANCE.createMandatory()));
		}
	}

}
