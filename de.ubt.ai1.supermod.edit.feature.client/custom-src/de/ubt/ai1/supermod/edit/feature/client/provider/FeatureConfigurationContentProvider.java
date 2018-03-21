/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.edit.feature.client.provider;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;

import de.ubt.ai1.supermod.mm.feature.Feature;
import de.ubt.ai1.supermod.mm.feature.FeatureGroup;
import de.ubt.ai1.supermod.mm.feature.FeatureModel;

/**
 * Specialized adapter factory content provider for feature configurations,
 * which skips all details which are not necessary for configuration, such
 * as feature dependencies or low-level concepts.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	28.10.2014
 */
public class FeatureConfigurationContentProvider 
extends AdapterFactoryContentProvider {

	/**
	 * Creates a new instance.
	 *
	 * @param adapterFactory
	 */
	public FeatureConfigurationContentProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider
	 * #getElements(java.lang.Object)
	 */
	@Override
	public Object[] getElements(Object object) {
		return getChildren(object);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider
	 * #getChildren(java.lang.Object)
	 */
	@Override
	public Object[] getChildren(Object object) {
		List<Object> children = new ArrayList<>();
		for (Object o : super.getChildren(object)) {
			if (o instanceof FeatureModel || o instanceof FeatureGroup ||
					o instanceof Feature) {
				children.add(o);
			}
		}
		return children.toArray();
	}

}
