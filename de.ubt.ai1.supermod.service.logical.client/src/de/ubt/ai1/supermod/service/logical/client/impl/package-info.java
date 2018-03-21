/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

/**
 * This package contains implementations of a subset of the client services 
 * specified in {@link de.ubt.ai1.supermod.service.client} to implementations 
 * specific to the low-level logical version dimensions, which are hidden within
 * the package {@link de.ubt.ai1.supermod.service.logical.client.impl}. Rather
 * than instantiating contained classes directly, Guice dependency injection
 * should be used with the module {@link de.ubt.ai1.supermod.service.logical
 * .client.SuperModLogicalClientModule}.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	01.08.2014
 */
package de.ubt.ai1.supermod.service.logical.client.impl;