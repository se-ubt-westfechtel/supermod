/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.module.client;

import org.eclipse.swt.graphics.Image;

import com.google.inject.Injector;

/**
 * This class is instantiated and registered under the extension point
 * <code>de.ubt.ai1.supermod.module.injectorProvider</code> in order to
 * specify a SuperMod module configuration with the help of Guice dependency
 * injection.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	09.12.2014
 */
public interface ISuperModClientModuleInjectorProvider {
	
	/**
	 * returns a unique identifier for the implemented SuperMod module. It must
	 * be uniquely defined and must equal the id specified in the respective
	 * extension point where this class is referenced.
	 *
	 * @return the module id
	 */
	public String getModuleId();
	
	/**
	 * to be implemented in order to return a human readable caption (between
	 * one and three words) to describe the version module.
	 *
	 * @return a human-understandable caption for the module
	 */
	String getCaption();
	
	/**
	 * to be implemented in order to return a description for the provided
	 * set of module bindings that may help the user in deciding which module
	 * configuration to choose in case several are available.
	 *
	 * @return a human-understandable description for the module
	 */
	public String getDescription();
	
	
	
	/**
	 * to be implemented in order to return a Guice injector which includes
	 * SuperMod modules defined in the respective service plug-ins.
	 *
	 * @return a Guice injector which completely defines the bindings for a
	 * 			SuperMod module.
	 */
	public Injector getModuleInjector();

	/**
	 * to be implemented in order to optionally return an SWT image that
	 * describes the version module graphically. The dimensions should be 
	 * 400x150.
	 *
	 * @return an image that graphically describes the module's version and
	 * 			product spaces.
	 */
	public Image getImage();
	
	/**
	 * If set to true, "push" and "pull" operations will be offered.
	 *
	 * @return whether repositories will be shared with a remote server. 
	 */
	public boolean isRemote();

}
