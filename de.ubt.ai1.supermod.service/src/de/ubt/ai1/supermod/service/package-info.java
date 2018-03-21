/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

/**
 * This package defines a set of service interfaces which described general
 * low-level operations that must be realized in SuperMod in order to provide
 * higher-level VCS abstractions such as <em>commit</em> or <em>update</em>.
 * Some of these operations may be implemented generically, some of them
 * require knowledge about the concrete product or version model of a given
 * SuperMod repository. The service interfaces are bound to corresponding
 * implementations by means of Guice dependency injection.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	29.07.2014
 * @see		de.ubt.ai1.supermod.service.generic.SuperModGenericModule
 */
package de.ubt.ai1.supermod.service;