/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.feature.client.impl.ui;

import java.util.Iterator;
import java.util.Set;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;

import de.ubt.ai1.supermod.edit.feature.client.provider.FeatureConfigurationContentProvider;
import de.ubt.ai1.supermod.edit.feature.client.provider.FeatureConfigurationLabelProvider;
import de.ubt.ai1.supermod.mm.core.Option;
import de.ubt.ai1.supermod.mm.core.Tristate;
import de.ubt.ai1.supermod.mm.feature.ChildRelationship;
import de.ubt.ai1.supermod.mm.feature.Feature;
import de.ubt.ai1.supermod.mm.feature.client.FeatureConfiguration;
import de.ubt.ai1.supermod.mm.feature.provider.SuperModFeatureItemProviderAdapterFactory;

/**
 * A dialog that presents a (partial) feature configuration to the user, who
 * may modify the corresponding selection states by double-clicking on the 
 * features.
 * 
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	27.10.2014
 */
public class FeatureConfigurationSpecificationDialog
extends ElementTreeSelectionDialog {	
	
	/**
	 * Strategy to use for the validation of a specified feature configuration
	 * within the dialog. The user may only select the current feature 
	 * configuration in case validation is successful.
	 */
	public static interface IFeatureConfigurationValidator {
		
		/**
		 * @param conf the feature configuration
		 * @return an error message, or null in case validation is successful.
		 */
		public String validate(FeatureConfiguration conf);
	}

	protected FeatureConfiguration conf;	protected IFeatureConfigurationValidator validator;

	protected boolean propagateRecursively;
	protected boolean allowUnbound;
	protected Set<Feature> fixedFeatures;
	
	/**
	 * Creates a new dialog within the specified parent shell. Its label and
	 * content providers will be automatically set to display feature
	 * configurations in a suitable way.

	 * @param parent
	 * @param conf the feature configuration to be modified
	 * @param propagateRecursively if true, child feature selection will be
	 * 			made consistent with a newly supplied selection.
	 * @param allowUnbound if true, unbound option bindings will be allowed by
	 * 			repeated double-clicking.
	 * @param fixedFeatures a set of features whose selection state is 
	 * 			unmodifiable.
	 */
	public FeatureConfigurationSpecificationDialog(Shell parent, 
			FeatureConfiguration conf, 
			boolean propagateRecursively,
			boolean allowUnbound,
			Set<Feature> fixedFeatures) {
		super(parent, new FeatureConfigurationLabelProvider(new 
				SuperModFeatureItemProviderAdapterFactory(), conf, fixedFeatures),
				new FeatureConfigurationContentProvider(new 
						SuperModFeatureItemProviderAdapterFactory()));
		this.conf = conf;
		this.propagateRecursively = propagateRecursively;
		this.allowUnbound = allowUnbound;
		this.fixedFeatures = fixedFeatures;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.dialogs.ElementTreeSelectionDialog#create()
	 */
	@Override
	public void create() {
		setDoubleClickSelects(false);
		super.create();
		setBlockOnOpen(true);
		setAllowMultiple(false);
		getTreeViewer().expandAll();
		getTreeViewer().addDoubleClickListener(new IDoubleClickListener() {			
			@Override
			public void doubleClick(DoubleClickEvent event) {
				if (event.getSelection() instanceof IStructuredSelection) {
					Iterator<?> it = ((IStructuredSelection) 
							event.getSelection()).iterator();
					while (it.hasNext()) {
						// switch the tristate value assigned to the option
						// by double clicking.
						Object o = it.next();
						if (o instanceof Feature) {
							Feature feature = (Feature) o;
							if (fixedFeatures != null &&
									fixedFeatures.contains(feature)) continue;
							Option option = feature.getFeatureOption();
							Tristate state = conf.getOptionBinding().getState(option);
							if (state == null) state = Tristate.UNKNOWN;
							switch(state) {
							case FALSE:
								if (allowUnbound) {
									propagateSelection(feature, Tristate.UNKNOWN);
								}
								else {
									propagateSelection(feature, Tristate.TRUE);
								}
								break;
							case TRUE:
								propagateSelection(feature, Tristate.FALSE);
								break;
							default:
								propagateSelection(feature, Tristate.TRUE);
								break;
							}
						}
					}
				}
				getTreeViewer().expandAll();
				getTreeViewer().refresh();
				updateOKStatus();
			}
		});
		updateOKStatus();
	}
	
	/**
	 * Sets the selection state of the option belonging to a given feature and
	 * propagates this selection down the parent-child hierarchy.
	 *
	 * @param feature
	 * @param state
	 */
	protected void propagateSelection(Feature feature, Tristate state) {
		conf.getOptionBinding().bind(feature.getFeatureOption(), state);
		if (propagateRecursively) {
			for (ChildRelationship cr : feature.getChildren()) {
				Feature child = cr.getChild();
				if (state != Tristate.TRUE || child.getMandatory() != null) {
					propagateSelection(child, state);
				}
			}
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.dialogs.ElementTreeSelectionDialog#updateOKStatus()
	 */
	@Override
	protected void updateOKStatus() {
		// ensure that the OK button can only be pressed in case the selected
		// option binding is valid.
		if (validator != null && conf != null) {
			String statusStr = validator.validate(conf);
			IStatus status = null;
			if (statusStr == null) {
				status = new Status(IStatus.OK, 
						"de.ubt.ai1.supermod.service.feature.client", null);
			}
			else {
				status = new Status(IStatus.ERROR, 
						"de.ubt.ai1.supermod.service.feature.client", statusStr);
			}
			updateStatus(status);
			getOkButton().setEnabled(status.getSeverity() == IStatus.OK);
		}
	}

	/**
	 * Sets the validator for the feature configuration.
	 *
	 * @param validator
	 */
	public void setFeatureConfigurationValidator(
			IFeatureConfigurationValidator validator) {
		this.validator = validator;
		
	}

}
