/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

/**
 * This package organizes the different client application modules for
 * SuperMod. instances of 
 * {@link de.ubt.ai1.supermod.module.server.ISuperModServerModuleInjectorProvider}
 * define a specific set of module bindings for a SuperMod application.
 * Different instances are managed using
 * {@link de.ubt.ai1.supermod.module.server.ISuperModServerModuleRegistry}s.
 * A default registry is provided in
 * {@link de.ubt.ai1.supermod.module.server.DefaultSuperModServerModuleRegistry}.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	28.10.2015
 */
package de.ubt.ai1.supermod.module.server;