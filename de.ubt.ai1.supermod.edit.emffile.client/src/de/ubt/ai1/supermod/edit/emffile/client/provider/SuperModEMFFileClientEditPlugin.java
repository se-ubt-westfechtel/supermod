/**
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package de.ubt.ai1.supermod.edit.emffile.client.provider;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;

import de.ubt.ai1.supermod.edit.client.provider.SuperModClientEditPlugin;
import de.ubt.ai1.supermod.edit.core.provider.SuperModCoreEditPlugin;
import de.ubt.ai1.supermod.edit.emffile.provider.SuperModEMFFileEditPlugin;
import de.ubt.ai1.supermod.edit.file.client.provider.SuperModFileClientEditPlugin;
import de.ubt.ai1.supermod.edit.file.provider.SuperModFileEditPlugin;
import de.ubt.ai1.supermod.edit.list.provider.SuperModListEditPlugin;

/**
 * This is the central singleton for the SuperModEMFFileClient edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class SuperModEMFFileClientEditPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SuperModEMFFileClientEditPlugin INSTANCE = new SuperModEMFFileClientEditPlugin();

	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Implementation plugin;

	/**
	 * Create the instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperModEMFFileClientEditPlugin() {
		super
		  (new ResourceLocator [] {
		     SuperModClientEditPlugin.INSTANCE,
		     SuperModCoreEditPlugin.INSTANCE,
		     SuperModEMFFileEditPlugin.INSTANCE,
		     SuperModFileEditPlugin.INSTANCE,
		     SuperModFileClientEditPlugin.INSTANCE,
		     SuperModListEditPlugin.INSTANCE,
		   });
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	@Override
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	public static Implementation getPlugin() {
		return plugin;
	}

	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class Implementation extends EclipsePlugin {
		/**
		 * Creates an instance.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Implementation() {
			super();

			// Remember the static instance.
			//
			plugin = this;
		}
	}

}
