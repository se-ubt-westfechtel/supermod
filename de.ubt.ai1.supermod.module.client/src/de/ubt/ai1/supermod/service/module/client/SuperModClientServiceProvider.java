/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.module.client;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Within this class, a singleton instance of a SuperMod service provider is
 * managed, which defines the set of SuperMod modules to be used in platform
 * applications.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	01.08.2014
 */
public class SuperModClientServiceProvider {		
	
	public static final String EXTENSION_POINT_ID = 
			"de.ubt.ai1.supermod.module.client.injectorProvider";
	public static final String MODULE_ID_ATT = "moduleId";
	public static final String EXECUTABLE_CLASS_ATT = "moduleProviderClass";
	
	private static SuperModClientServiceProvider instance = null;
	
	/**
	 * a map that associates module identifiers with configured Guice injectors.
	 */
	protected Map<String, Injector> injectors;
	
	protected SuperModClientServiceProvider() { 
		injectors = new HashMap<>();
	}
	
	/**
	 * @return the singleton instance of the provider.
	 */
	public static SuperModClientServiceProvider getInstance() {
		if (instance == null) {
			instance = new SuperModClientServiceProvider();
		}
		return instance;
	}
	
	/**
	 * Creates or retrieves a Guice injector for the specified module id.
	 *
	 * @param moduleId
	 * @return the injector
	 */
	public Injector getInjector(String moduleId) {
		if (!injectors.containsKey(moduleId)) {
			Injector injector = createInjectorForModule(moduleId);
			injectors.put(moduleId, injector);
		}
		return injectors.get(moduleId);
	}

	/**
	 * Retrieves a service with a specified interface, whose implementation is
	 * bound by the specified module.
	 *
	 * @param serviceClass the interface to find an implementation for.
	 * @param moduleId the module id to inject dependencies for
	 * @return the retrieved implementation.
	 */
	public <S> S getService(String moduleId, Class<S> serviceClass) {
		if (moduleId == null) return getDefaultService(serviceClass);
		if (!injectors.containsKey(moduleId)) {
			Injector injector = createInjectorForModule(moduleId);
			if (injector != null) {
				injectors.put(moduleId, injector);
			}
			else {
				return getDefaultService(serviceClass);
			}
		}
		return injectors.get(moduleId).getInstance(serviceClass);
	}	
	
	/**
	 * Retrieves a service with a specified interface by analyzing only the
	 * default bindings defined by the <code>ImplementedBy</code> annotation.
	 *
	 * @param serviceClass the interface to find an implementation for.
	 * @return the retrieved implementation.
	 */
	public <S> S getDefaultService(Class<S> serviceClass) {
		return Guice.createInjector().getInstance(serviceClass);
	}	

	/**
	 * Retrieves a Guice injector by inspecting the instantiations of the
	 * extension point <code>de.ubt.ai1.supermod.module.injectorProvider</code>
	 * for the specified module id. Once there is a corresponding injector
	 * provider found, it is used to instantiate an injector once, which is
	 * returned and cached in the internal injectors map.
	 *
	 * @param moduleId
	 * @return the corresponding Guice injector
	 */
	private Injector createInjectorForModule(String moduleId) {
		IExtensionRegistry reg = Platform.getExtensionRegistry();
		for (IConfigurationElement ce : reg.getConfigurationElementsFor(
				EXTENSION_POINT_ID)) {
			String id = ce.getAttribute(MODULE_ID_ATT);
			if (moduleId != null && moduleId.equals(id)) {
				Object obj;
				try {
					obj = ce.createExecutableExtension(EXECUTABLE_CLASS_ATT);
					if (obj instanceof ISuperModClientModuleInjectorProvider) {
						return ((ISuperModClientModuleInjectorProvider) obj)
								.getModuleInjector();
					}
				} catch (CoreException e) {
					e.printStackTrace();
				}				
			}
		}
		return null;		
	}
	
	/**
	 * Analyzes usages of the injector provider extension point and returns
	 * the identifiers of the corresponding extensions.
	 *
	 * @return a list of plug-in id's of extension point implementors.
	 */
	public Collection<ISuperModClientModuleInjectorProvider> getAvailableModules() {
		List<ISuperModClientModuleInjectorProvider> modules = new ArrayList<>();
		IExtensionRegistry reg = Platform.getExtensionRegistry();
		for (IConfigurationElement ce : reg.getConfigurationElementsFor(
				EXTENSION_POINT_ID)) {
			Object obj;
			try {
				obj = ce.createExecutableExtension(EXECUTABLE_CLASS_ATT);
				if (obj instanceof ISuperModClientModuleInjectorProvider) {
					modules.add((ISuperModClientModuleInjectorProvider) obj);
				}
			} catch (CoreException e) {
				e.printStackTrace();
			}				
		}
		return modules;
	}

	/**
	 * @param moduleId
	 * @return the module injector provider having specified module id, or
	 * 			<code>null</code> if no such module.
	 */
	public ISuperModClientModuleInjectorProvider getModule(String moduleId) {
		for (ISuperModClientModuleInjectorProvider module :
				getAvailableModules()) {
			if (module.getModuleId().equals(moduleId)) {
				return module;
			}
		}
		return null;
	}

}
