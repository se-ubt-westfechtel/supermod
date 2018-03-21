/******************************************************************************
 * Copyright (c) 2018 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.generic.client.impl;


import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ProjectScope;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.ui.preferences.ScopedPreferenceStore;

import de.ubt.ai1.supermod.service.client.IDefaultResolver;
import de.ubt.ai1.supermod.service.client.IDefaultResolver.Strategy;

/**
 * Auxiliary class for retrieving the currently selected default resolution strategy from
 * the SuperMod-specific preference store. Either the preference or the property page is
 * used.
 * 
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>,
 * 			Johannes Schroepfer <Johannes.M.Schroepfer(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	2018-01-28
 */
public class DefaultResolutionPreferenceUtil {
	
	/*
	 * Preference stores qualifiers
	 */
	public static final String SUPERMOD_PREFSTORE = "de.ubt.ai1.supermod";
	public static final String SUPERMOD_PROP_PREFSTORE_PREFIX = "de.ubt.ai1.supermod.";
	
	/*
	 * Preference keys for default resolution strategy
	 */
	public static final String DEFAULTRES__PROP_ACTIVATOR =
			"de.ubt.ai1.supermod.DEFAULTRES__PROP_ACIVATOR";
	public static final String DEFAULTRES__ORDER =
			"de.ubt.ai1.supermod.DEFAULT_RES__ORDER";
	public static final String DEFAULTRES__OBJECT_CONTAINER =
			"de.ubt.ai1.supermod.DEFAULTRES__OBJECT_CONTAINER";
	public static final String DEFAULTRES__CYCLIC_CONTAINMENT =
			"de.ubt.ai1.supermod.DEFAULTRES__CYCLIC_CONTAINMENT";
	public static final String DEFAULTRES__SINGLE_VALUED_STRUCTURAL_FEATURE_VALUE =
			"de.ubt.ai1.supermod.DEFAULTRES__SINGLE_VALUED_STRUCTURAL_FEATURE_VALUE";
	public static final String DEFAULTRES__ROOT_FEATURE =
			"de.ubt.ai1.supermod.DEFAULTRES__ROOT_FEATURE";
	public static final String DEFAULTRES__PARENT_FEATURE =
			"de.ubt.ai1.supermod.DEFAULTRES__PARENT_FEATURE";
	public static final String DEFAULTRES__CYCLIC_FEATURE_TREE =
			"de.ubt.ai1.supermod.DEFAULTRES__CYCLIC_FEATURE_TREE";
	public static final String DEFAULTRES__DISPLAY_NAME =
			"de.ubt.ai1.supermod.DEFAULTRES__DISPLAY_NAME";
	public static final String DEFAULTRES__MULTIPLE_GROUP_MEMBERSHIP =
			"de.ubt.ai1.supermod.DEFAULTRES__MULTIPLE_GROUP_MEMBERSHIP";
	public static final String DEFAULTRES__REMOTE_GROUP_MEMBERSHIP =
			"de.ubt.ai1.supermod.DEFAULTRES__REMOTE_GROUP_MEMBERSHIP";
	public static final String DEFAULTRES__NON_OPTIONAL_GROUPED_FEATURE =
			"de.ubt.ai1.supermod.DEFAULTRES__NON_OPTIONAL_GROUPED_FEATURE";
	public static final String DEFAULTRES__DEPENDENCY_LINK_TARGET =
			"de.ubt.ai1.supermod.DEFAULTRES__DEPENDENCY_LINK_TARGET";
	public static final String DEFAULTRES__DANGLING_DEPENDENCY =
			"de.ubt.ai1.supermod.DEFAULTRES__DANGLING_DEPENDENCY";
	public static final String DEFAULTRES__DANGLING_FEATURE =
			"de.ubt.ai1.supermod.DEFAULTRES__DANGLING_FEATURE";
	public static final String DEFAULTRES__DANGLING_GROUP =
			"de.ubt.ai1.supermod.DEFAULTRES__DANGLING_GROUP";
	
	/*
	 * Possible values for default resolution strategy
	 */
	public static final String DEFAULTRES__RANDOM =
			"de.ubt.ai1.supermod.DEFAULTRES__RANDOM";
	public static final String DEFAULTRES__MOST_RECENT =
			"de.ubt.ai1.supermod.DEFAULTRES__MOST_RECENT";
	public static final String DEFAULTRES__LEAST_RECENT =
			"de.ubt.ai1.supermod.DEFAULTRES__LEAST_RECENT";
	public static final String DEFAULTRES__MINE =
			"de.ubt.ai1.supermod.DEFAULTRES__MINE";
	public static final String DEFAULTRES__THEIR =
			"de.ubt.ai1.supermod.DEFAULTRES__THEIR";
	public static final String DEFAULTRES__MOST_SPECIFIC =
			"de.ubt.ai1.supermod.DEFAULTRES__MOST_SPECIFIC";
	public static final String DEFAULTRES__LEAST_SPECIFIC =
			"de.ubt.ai1.supermod.DEFAULTRES__LEAST_SPECIFIC";
	
	/**
	 * Returns the resolution strategy for the given conflict. If the property page for
	 * project-specific behavior is activated, it is used; otherwise, the preference page
	 * with global behavior is used.
	 * 
	 * @param conflict   the conflict literal
	 * @param project    the current project (sparking the conflict)
	 * @return           one of the seven default resolution strategies
	 */
	public static IDefaultResolver.Strategy getPreferredStrategy(
			String conflict, IProject project) {
		
		// Find the currently valid preference store.
		ScopedPreferenceStore store = null;
		ScopedPreferenceStore localStore = new ScopedPreferenceStore(
				new ProjectScope(project),
				SUPERMOD_PROP_PREFSTORE_PREFIX + project.getName());
		if (localStore.getBoolean(DEFAULTRES__PROP_ACTIVATOR))
			store = localStore;
		else
			store = new ScopedPreferenceStore(InstanceScope.INSTANCE, SUPERMOD_PREFSTORE);
		
		// Take the preference value and return the respective resolution strategy.
		switch (store.getString(conflict)) {
			case DEFAULTRES__MOST_RECENT:
				return Strategy.MOST_RECENT;
			case DEFAULTRES__LEAST_RECENT:
				return Strategy.LEAST_RECENT;
			case DEFAULTRES__MINE:
				return Strategy.MINE;
			case DEFAULTRES__THEIR:
				return Strategy.THEIR;
			case DEFAULTRES__MOST_SPECIFIC:
				return Strategy.MOST_SPECIFIC;
			case DEFAULTRES__LEAST_SPECIFIC:
				return Strategy.LEAST_SPECIFIC;
			default:
				return Strategy.RANDOM;
		}
	}

}
