/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.module.server;

import java.util.Map;

/**
 * A SuperMod server module registry defines a set of available module
 * injector providers for SupeMod's server side application.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	28.10.2015
 */
public interface ISuperModServerModuleRegistry {
	
	public static final ISuperModServerModuleRegistry INSTANCE =
			new DefaultSuperModServerModuleRegistry();
	
	/**
	 * To be implemented by specific registries to list the available
	 * module injector providers for SuperMods server component.
	 *
	 * @return a map that assigns module IDs to instances of the corresponding
	 * SuperMod module injector provider
	 */
	public Map<String, ISuperModServerModuleInjectorProvider> getModuleMap();

}
