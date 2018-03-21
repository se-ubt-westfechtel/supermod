/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

/**
 * This package contains implementations of services which can be found in the
 * client service package {@link de.ubt.ai1.supermod.service.client}. They are
 * dedicated to a product space which consists of two dimensions, a feature
 * model and a versioned file system. Rather than instantiating the classes
 * contained within this package, client should retrieve corresponding service
 * implementations using Guice dependency injection with the module {@code
 * de.ubt.ai1.supermod.service.featfile.client.SuperModFeatFileClientModule}.
 * 
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	02.03.2015
 */
package de.ubt.ai1.supermod.service.featfile.client.impl;