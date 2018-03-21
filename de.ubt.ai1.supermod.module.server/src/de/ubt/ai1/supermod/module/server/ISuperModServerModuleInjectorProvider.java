/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.module.server;

import com.google.inject.Injector;

/**
 * Implementations of this class provide a specific Guice injector that defines
 * injected dependencies for a specific configuration of a SuperMod server
 * side application. Typically, these instances are registred in a
 * {@link ISuperModServerModuleRegistry}.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	28.10.2015
 */
public interface ISuperModServerModuleInjectorProvider {
	
	/**
	 * @return the module identifier.
	 */
	public String getModuleId();
	
	/**
	 * to be implemented in order to return a Guice injector which includes
	 * SuperMod modules for a specific server-side configuration
	 *
	 * @return a Guice injector which completely defines the bindings for a
	 * 			SuperMod server side module.
	 */
	public Injector getModuleInjector();	

}
