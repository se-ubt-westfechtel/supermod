/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

/**
 * This package contains generic implementations for a subset of the service
 * interfaces declared in the package {@link de.ubt.ai1.supermod.service}.
 * These implementations are bound to their interfaces in the corresponding
 * Guice module {@link SuperModGenericModule}. Clients should never access
 * implementations found in this package directly, but only by using Guice
 * dependency injection.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	29.07.2014
 */
package de.ubt.ai1.supermod.service.generic.impl;