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
import de.ubt.ai1.supermod.service.collab.SuperModCollabModule;
import de.ubt.ai1.supermod.service.collab.pure.SuperModPureCollabModule;
import de.ubt.ai1.supermod.service.emffile.SuperModEMFFileModule;
import de.ubt.ai1.supermod.service.file.SuperModFileModule;
import de.ubt.ai1.supermod.service.file.pure.SuperModPurefileModule;
import de.ubt.ai1.supermod.service.generic.SuperModGenericModule;
import de.ubt.ai1.supermod.service.hetfile.SuperModHetFileModule;
import de.ubt.ai1.supermod.service.list.SuperModListModule;
import de.ubt.ai1.supermod.service.textfile.SuperModTextfileModule;

/**
 * Defines server module bindings for a SuperMod configuration which relies on a
 * heterogeneous versioned file system, consisting of EMF, text and XML files,
 * as its product space, and a collaborative revision graph as version space.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	28.10.2015
 */
public class HetfilePurecollServerModuleInjectorProvider
implements ISuperModServerModuleInjectorProvider {

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.module.server.
	 * ISuperModServerModuleInjectorProvider#getModuleId()
	 */
	@Override
	public String getModuleId() {
		return "de.ubt.ai1.supermod.hetfile.purecoll";
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
				.with(
					new SuperModListModule(),
					new SuperModFileModule(),
					new SuperModEMFFileModule(),
					new SuperModTextfileModule(),
					new SuperModPurefileModule(),		
					new SuperModHetFileModule(),
					new SuperModCollabModule(),
					new SuperModPureCollabModule()));
	}

}
