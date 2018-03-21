/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

/**
 * This package contains a set of service interfaces and a Guice module which
 * make up the part of the EMF file client module visible to external clients.
 * The client module extends the SuperMod file module {@link
 * de.ubt.ai1.supermod.service.file} by operations which are only used in
 * clients of SuperMod, but not on the server. They mostly deal with the
 * synchronization of SuperMod resources with the local, Eclipse-based
 * workspace file system.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	30.07.2014
 */
package de.ubt.ai1.supermod.service.file.client;