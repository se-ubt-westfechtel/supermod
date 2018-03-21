/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.edit.feature.client.provider;

import java.util.Set;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

import de.ubt.ai1.supermod.edit.feature.provider.SuperModFeatureEditPlugin;
import de.ubt.ai1.supermod.mm.core.Tristate;
import de.ubt.ai1.supermod.mm.feature.Feature;
import de.ubt.ai1.supermod.mm.feature.client.FeatureConfiguration;

/**
 * Specialized adapter factory label provider which displays the selection
 * state of optional features according to the configuration. Selected features
 * are represented by a hook, unselected features by a cross. In the case of a
 * partial feature configuration, features with unspecified selection are
 * represented by a question mark. Mandatory features' selection cannot be
 * changed; they are represented by a dot.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	28.10.2014
 */
public class FeatureConfigurationLabelProvider
extends AdapterFactoryLabelProvider.FontAndColorProvider {
	
	private FeatureConfiguration featureConfiguration;
	private Set<Feature> fixedFeatures;

	/**
	 * Creates a new instance.
	 *
	 * @param adapterFactory
	 * @param featureConfiguration the configuration to use for displaying the
	 * 			selection of features.
	 * @param fixedFeatures unmodifiable features which will be shaded in gray
	 */
	public FeatureConfigurationLabelProvider(AdapterFactory adapterFactory,
			FeatureConfiguration featureConfiguration, Set<Feature> fixedFeatures) {
		super(adapterFactory, null, null, null);
		this.featureConfiguration = featureConfiguration;
		this.fixedFeatures = fixedFeatures;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider
	 * #getImage(java.lang.Object)
	 */
	@Override
	public Image getImage(Object object) {
		if (object instanceof Feature) {
			Feature feature = (Feature) object;
			String imagePath = null;
			Tristate state = featureConfiguration.getOptionBinding().getState(
					feature.getFeatureOption());
			if (feature.getMandatory() == null) {
				imagePath = "full/obj16/Feature_o_unknown";
				if (state != null) switch(state) {
				case TRUE: imagePath = "full/obj16/Feature_o_selected"; break;
				case FALSE: imagePath = "full/obj16/Feature_o_unselected";break;
				case UNKNOWN: ;
				}			
			}
			else {
				imagePath = "full/obj16/Feature_m_unknown";
				if (state != null) switch(state) {
				case TRUE: imagePath = "full/obj16/Feature_m_selected"; break;
				case FALSE: imagePath = "full/obj16/Feature_m_unselected";break;
				case UNKNOWN: ;
				}			
			}
			if (imagePath != null) {
				return ExtendedImageRegistry.getInstance().getImage(
						SuperModFeatureEditPlugin.getPlugin().getImage(
								imagePath));
			}
		}
		return super.getImage(object);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider#getForeground(java.lang.Object)
	 */
	@Override
	public Color getForeground(Object object) {
		if (object instanceof Feature) {
			Feature feature = (Feature) object;
			if (fixedFeatures != null && fixedFeatures.contains(feature)) {
				return Display.getDefault().getSystemColor(SWT.COLOR_DARK_GRAY);
			}
		}
		return super.getBackground(object);
	}

}
