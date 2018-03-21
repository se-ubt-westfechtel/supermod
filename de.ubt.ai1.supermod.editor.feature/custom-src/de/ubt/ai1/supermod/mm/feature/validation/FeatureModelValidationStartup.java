/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.feature.validation;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.ui.IStartup;

import de.ubt.ai1.supermod.mm.feature.SuperModFeaturePackage;
import de.ubt.ai1.supermod.mm.feature.client.SuperModFeatureClientPackage;

/**
 * Startup class to register the feature model and client packages to the
 * EMF validator registry.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	09.09.2015
 */
public class FeatureModelValidationStartup implements IStartup {

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IStartup#earlyStartup()
	 */
	@Override
	public void earlyStartup() {
		EObjectValidator v = new FeatureModelValidator();
		EValidator.Registry.INSTANCE.put(
				SuperModFeaturePackage.eINSTANCE, v);
		EValidator.Registry.INSTANCE.put(
				SuperModFeatureClientPackage.eINSTANCE, v);		
	}

}
