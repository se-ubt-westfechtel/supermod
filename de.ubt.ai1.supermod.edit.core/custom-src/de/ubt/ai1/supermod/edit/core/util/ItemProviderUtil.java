/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.edit.core.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;

/**
 * Utility methods for handling the item provider of SuperMod components.
 * 
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 */
public class ItemProviderUtil {
	
	private static ComposedAdapterFactory caf;
	
	/**
	 * @return An adapter factory which is able to represent all SuperMod
	 * items.
	 */
	public static ComposedAdapterFactory getDefaultAdapterFactory() {
		if (caf == null) {
			caf = new ComposedAdapterFactory(
					ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		}
		return caf;
	}
	
	/**
	 * Retrieves a suitable item label provider for a given <code>EObject</code>
	 * whose class is defined in any SuperMod meta-model.
	 * 
	 * @param eObject the object for which the item label provider to retrieve.
	 * @return A suitable item label provider, or <code>null</code>.
	 */
	public static IItemLabelProvider getDefaultItemLabelProvider(EObject eObject) {
		return (IItemLabelProvider) getDefaultAdapterFactory().adapt(eObject, IItemLabelProvider.class);
	}
		
	/**
	 * Finds a suitable item provider to create a label for a given
	 * <code>EObject</code>.
	 * 
	 * @param eObject the object to create the label for.
	 * @return The label, or <code>null</code>
	 */
	public static String adaptLabel(EObject eObject) {
		return getDefaultItemLabelProvider(eObject).getText(eObject);
	}
	
	/**
	 * Finds a suitable item provider to create an image for a given
	 * <code>EObject</code>.
	 * 
	 * @param eObject the object to create the image for.
	 * @return The image, or <code>null</code>
	 */
	public static Object adaptImage(EObject eObject) {
		return getDefaultItemLabelProvider(eObject).getImage(eObject);
	}

}
