/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.edit.core.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;

/**
 * An multi-column item provider adapter which refers to the single-column
 * item provider in order to display the contents of the first column.
 * 
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 */
public class ColumnOneItemProviderAdapter extends ItemProviderAdapter {

	/**
	 * Creates a new instance.
	 * 
	 * @param adapterFactory The factory that created the adapter.
	 */
	public ColumnOneItemProviderAdapter(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}
	
	@Override
	public Object getColumnImage(Object object, int columnIndex) {
		if (columnIndex == 0) {
			return getImage(object);
		}
		return null;
	}
	
	@Override
	public String getColumnText(Object object, int columnIndex) {
		if (columnIndex == 0) {
			return getText(object);
		}
		return null;
	}

}
