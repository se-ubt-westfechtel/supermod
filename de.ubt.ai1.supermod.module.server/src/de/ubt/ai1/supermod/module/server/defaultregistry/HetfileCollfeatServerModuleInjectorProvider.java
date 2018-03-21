/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.module.server.defaultregistry;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.util.Modules;

import de.ubt.ai1.supermod.module.server.ISuperModServerModuleInjectorProvider;
import de.ubt.ai1.supermod.service.change.SuperModChangeModule;
import de.ubt.ai1.supermod.service.collab.SuperModCollabModule;
import de.ubt.ai1.supermod.service.collfeat.SuperModCollFeatModule;
import de.ubt.ai1.supermod.service.emffile.SuperModEMFFileModule;
import de.ubt.ai1.supermod.service.featfile.SuperModFeatFileModule;
import de.ubt.ai1.supermod.service.feature.SuperModFeatureModule;
import de.ubt.ai1.supermod.service.file.SuperModFileModule;
import de.ubt.ai1.supermod.service.generic.SuperModGenericModule;
import de.ubt.ai1.supermod.service.hetfile.SuperModHetFileModule;
import de.ubt.ai1.supermod.service.list.SuperModListModule;
import de.ubt.ai1.supermod.service.textfile.SuperModTextfileModule;

/**
 * Defines server module bindings for a SuperMod configuration which relies on a
 * heterogeneous versioned file system, consisting of EMF, text and XML files,
 * as its product space, and a feature model and a collaborative
 * revision graph as its version space. The feature model is additionally 
 * versioned by the revision graph. Both version dimensions are mapped by a
 * change space.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	28.10.2015
 */
public class HetfileCollfeatServerModuleInjectorProvider
implements ISuperModServerModuleInjectorProvider {

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.module.server.
	 * ISuperModServerModuleInjectorProvider#getModuleId()
	 */
	@Override
	public String getModuleId() {
		return "de.ubt.ai1.supermod.hetfile.collfeat";
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.module.server.
	 * ISuperModServerModuleInjectorProvider#getModuleInjector()
	 */
	@Override
	public Injector getModuleInjector() {
		return Guice.createInjector(
				Modules.override(
					new SuperModGenericModule())
				.with(Modules.override(
					new SuperModListModule(),
					new SuperModFileModule(),
					new SuperModEMFFileModule(),
					new SuperModTextfileModule(),
					new SuperModHetFileModule(),
					new SuperModFeatureModule(),
					new SuperModCollabModule(),
					new SuperModChangeModule())
					.with(
						new SuperModFeatFileModule(),		
						new SuperModCollFeatModule()
					)));
	}

}
