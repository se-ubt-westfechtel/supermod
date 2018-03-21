/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.module.server;

import java.util.HashMap;
import java.util.Map;

import de.ubt.ai1.supermod.module.server.defaultregistry.HetfileCollfeatServerModuleInjectorProvider;
import de.ubt.ai1.supermod.module.server.defaultregistry.HetfilePurecollServerModuleInjectorProvider;

/**
 * The default implementation of {@link ISuperModServerModuleRegistry} which
 * contains all server module bindings available in the main SuperMod
 * distribution.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	28.10.2015
 */
public class DefaultSuperModServerModuleRegistry
implements ISuperModServerModuleRegistry {
	
	private static Map<String, ISuperModServerModuleInjectorProvider> moduleMap;

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.module.server.ISuperModServerModuleRegistry
	 * #getModuleMap()
	 */
	@Override
	public Map<String, ISuperModServerModuleInjectorProvider> getModuleMap() {
		if (moduleMap == null) {
			initializeModuleMap();
		}
		return moduleMap;
	}

	/**
	 * Redefine this method in order to register new custom server side
	 * module injectors.
	 */
	private void initializeModuleMap() {
		moduleMap = new HashMap<String, ISuperModServerModuleInjectorProvider>();
		HetfileCollfeatServerModuleInjectorProvider hetfileCollfeat = 
				new HetfileCollfeatServerModuleInjectorProvider();
		moduleMap.put(hetfileCollfeat.getModuleId(), hetfileCollfeat);
		HetfilePurecollServerModuleInjectorProvider hetfilePurecoll = 
				new HetfilePurecollServerModuleInjectorProvider();
		moduleMap.put(hetfilePurecoll.getModuleId(), hetfilePurecoll);
	}

}
