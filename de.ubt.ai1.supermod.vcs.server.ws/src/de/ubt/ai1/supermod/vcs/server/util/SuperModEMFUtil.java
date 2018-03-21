/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.vcs.server.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import de.ubt.ai1.supermod.mm.change.SuperModChangePackage;
import de.ubt.ai1.supermod.mm.collab.SuperModCollabPackage;
import de.ubt.ai1.supermod.mm.core.SuperModCorePackage;
import de.ubt.ai1.supermod.mm.diff.SuperModDiffPackage;
import de.ubt.ai1.supermod.mm.emffile.SuperModEMFFilePackage;
import de.ubt.ai1.supermod.mm.feature.SuperModFeaturePackage;
import de.ubt.ai1.supermod.mm.file.SuperModFilePackage;
import de.ubt.ai1.supermod.mm.list.SuperModListPackage;
import de.ubt.ai1.supermod.mm.textfile.SuperModTextfilePackage;

/**
 * Auxiliary methods to simulate SuperMod's EMF extension points in a
 * "standalone" context.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	16.11.2015
 */
public class SuperModEMFUtil {
	
	/**
	 * Creates and returns a new resource set with all necessary SuperMod
	 * packages registered.
	 *
	 * @return the prepared resource set
	 */
	public static ResourceSet createResourceSet() {
		ResourceSet rs = new ResourceSetImpl();
		loadSuperModPackages();
		registerSuperModPackages(rs);
		registerResourceFactories(rs);
		return rs;
	}
	
	/**
	 * Forces all SuperMod packages to load.
	 */
	public static void loadSuperModPackages() {
		SuperModCorePackage.eINSTANCE.eClass();
		SuperModDiffPackage.eINSTANCE.eClass();
		SuperModChangePackage.eINSTANCE.eClass();
		SuperModCollabPackage.eINSTANCE.eClass();
		SuperModFeaturePackage.eINSTANCE.eClass();
		SuperModListPackage.eINSTANCE.eClass();
		SuperModFilePackage.eINSTANCE.eClass();
		SuperModTextfilePackage.eINSTANCE.eClass();
		SuperModEMFFilePackage.eINSTANCE.eClass();
	}
	
	/**
	 * Adds registration entries to the package registry of the specified
	 * resource set.
	 *
	 * @param rs
	 */
	public static void registerSuperModPackages(ResourceSet rs) {
		EPackage.Registry r = rs.getPackageRegistry();
		r.put(SuperModCorePackage.eNS_URI, SuperModCorePackage.eINSTANCE);
		r.put(SuperModDiffPackage.eNS_URI, SuperModDiffPackage.eINSTANCE);
		r.put(SuperModChangePackage.eNS_URI, SuperModChangePackage.eINSTANCE);
		r.put(SuperModCollabPackage.eNS_URI, SuperModCollabPackage.eINSTANCE);
		r.put(SuperModFeaturePackage.eNS_URI, SuperModFeaturePackage.eINSTANCE);
		r.put(SuperModListPackage.eNS_URI, SuperModListPackage.eINSTANCE);
		r.put(SuperModFilePackage.eNS_URI, SuperModFilePackage.eINSTANCE);
		r.put(SuperModTextfilePackage.eNS_URI, SuperModTextfilePackage.eINSTANCE);
		r.put(SuperModEMFFilePackage.eNS_URI, SuperModEMFFilePackage.eINSTANCE);
	}
	
	/**
	 * Adds registration entries delegating from file extensions to
	 * corresponding resource factories.
	 *
	 * @param rs
	 */
	public static void registerResourceFactories(ResourceSet rs) {
		Map<String, Object> m = rs.getResourceFactoryRegistry().getExtensionToFactoryMap();
		m.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
	}

}
