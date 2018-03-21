/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.edit.feature.client.provider;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.IStructuredSelection;

import de.ubt.ai1.supermod.mm.core.Option;
import de.ubt.ai1.supermod.mm.core.Tristate;
import de.ubt.ai1.supermod.mm.feature.Feature;
import de.ubt.ai1.supermod.mm.feature.client.FeatureConfiguration;

/**
 * A double click listener for feature configurations. In case a feature is 
 * double-clicked, its option binding is toggled within the three possible
 * states TRUE, FALSE and UNKNOWN.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	28.10.2014
 */
public class FeatureConfigurationDoubleClickListener
implements IDoubleClickListener {
	
	private EditingDomain editingDomain;
	private FeatureConfiguration featureConfiguration;

	/**
	 * Creates a new instance of the double click listener
	 *
	 * @param editingDomain all modifications to the feature configuration are
	 * 		applied here
	 * @param featureConfiguration configuration where the options described by
	 * 		the feature model are bound to selection states
	 */
	public FeatureConfigurationDoubleClickListener(
			EditingDomain editingDoman,
			FeatureConfiguration featureConfiguration) {
		this.featureConfiguration = featureConfiguration;
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
				toggleSelection((Feature) selection);
			}
		}		
		event.getViewer().refresh();
	}

	/**
	 * Given a non-mandatory feature, this method changes its option's selection
	 * state in the given feature configuration.
	 *
	 * @param feature
	 */
	private void toggleSelection(Feature feature) {
		if (feature.getMandatory() == null) {
			Option o = feature.getFeatureOption();
			final Tristate oldState = featureConfiguration
					.getOptionBinding().getState(o);
			Tristate newState = null;
			if (o != null) {
				switch(featureConfiguration.getOptionBinding()
						.getState(feature.getFeatureOption())) {				
				case TRUE: newState = Tristate.FALSE; break;
				case FALSE: newState = Tristate.UNKNOWN; break;
				case UNKNOWN: newState = Tristate.TRUE; break;
				default: newState = null;
				}
			}
			final Tristate finalNewState = newState;
			if (editingDomain == null) {
				featureConfiguration.getOptionBinding().bind(o, finalNewState);
			}
			else {
				editingDomain.getCommandStack().execute(new AbstractCommand() {
					@Override
					public void execute() {
						featureConfiguration.getOptionBinding().bind(o,
								finalNewState);
					}
					@Override
					public void redo() {
						featureConfiguration.getOptionBinding().bind(o, oldState);
					}				
				});
			}
		}
	}

}
