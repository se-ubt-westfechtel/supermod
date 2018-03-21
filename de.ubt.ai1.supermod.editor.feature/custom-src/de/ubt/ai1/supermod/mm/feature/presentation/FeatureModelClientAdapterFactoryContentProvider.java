/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.feature.presentation;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;

import de.ubt.ai1.supermod.mm.feature.client.SingleVersionFeatureModelDescriptor;

/**
 * Specialization of the adapter factory content provider which presents the
 * root feature as the root input element.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	04.05.2015
 */
public class FeatureModelClientAdapterFactoryContentProvider extends
		AdapterFactoryContentProvider {

	/**
	 * Creates a new instance.
	 *
	 * @param adapterFactory
	 */
	public FeatureModelClientAdapterFactoryContentProvider(
			AdapterFactory adapterFactory) {
		super(adapterFactory);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider#getChildren(java.lang.Object)
	 */
	@Override
	public Object[] getChildren(Object object) {
		if (object instanceof Resource) {
			Resource res = (Resource) object;
			if (!res.getContents().isEmpty() && res.getContents().get(0) instanceof SingleVersionFeatureModelDescriptor) {
				return new Object[]{((SingleVersionFeatureModelDescriptor) res.getContents().get(0)).getFeatureModel()};
			}
		}
		return super.getChildren(object);
	}

}
