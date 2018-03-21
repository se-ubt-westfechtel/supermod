/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.module.hetfile.collfeat.client;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.swt.graphics.Image;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.name.Names;
import com.google.inject.util.Modules;

import de.ubt.ai1.supermod.service.change.SuperModChangeModule;
import de.ubt.ai1.supermod.service.change.client.SuperModChangeClientModule;
import de.ubt.ai1.supermod.service.collab.SuperModCollabModule;
import de.ubt.ai1.supermod.service.collab.client.SuperModCollabClientModule;
import de.ubt.ai1.supermod.service.collfeat.SuperModCollFeatModule;
import de.ubt.ai1.supermod.service.collfeat.client.SuperModCollFeatClientModule;
import de.ubt.ai1.supermod.service.emffile.SuperModEMFFileModule;
import de.ubt.ai1.supermod.service.emffile.client.SuperModEMFFileClientModule;
import de.ubt.ai1.supermod.service.featfile.SuperModFeatFileModule;
import de.ubt.ai1.supermod.service.featfile.client.SuperModFeatFileClientModule;
import de.ubt.ai1.supermod.service.feature.SuperModFeatureModule;
import de.ubt.ai1.supermod.service.feature.client.SuperModFeatureClientModule;
import de.ubt.ai1.supermod.service.file.SuperModFileModule;
import de.ubt.ai1.supermod.service.file.client.SuperModFileClientModule;
import de.ubt.ai1.supermod.service.generic.SuperModGenericModule;
import de.ubt.ai1.supermod.service.generic.client.SuperModGenericClientModule;
import de.ubt.ai1.supermod.service.hetfile.SuperModHetFileModule;
import de.ubt.ai1.supermod.service.list.SuperModListModule;
import de.ubt.ai1.supermod.service.list.client.SuperModListClientModule;
import de.ubt.ai1.supermod.service.module.client.ISuperModClientModuleInjectorProvider;
import de.ubt.ai1.supermod.service.textemf.client.SuperModHetFileClientModule;
import de.ubt.ai1.supermod.service.textfile.SuperModTextfileModule;
import de.ubt.ai1.supermod.service.textfile.client.SuperModTextfileClientModule;

/**
 * Defines module bindings for a SuperMod configuration which relies on a
 * heterogeneous versioned file system, consisting of EMF, text and XML files,
 * as its product space, and a feature model and a collaborative
 * revision graph as its version
 * space. The feature model is additionally versioned by the revision graph. 
 * Both version dimensions are mapped by a change space.
 *
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	28.10.2015
 */
public class HetfileCollfeatClientModuleInjectorProvider
implements ISuperModClientModuleInjectorProvider {
	
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.module.
	 * ISuperModModuleInjectorProvider#getModuleId()
	 */
	@Override
	public String getModuleId() {
		return "de.ubt.ai1.supermod.hetfile.collfeat";
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.module.
	 * ISuperModModuleInjectorProvider#getModuleInjector()
	 */
	@Override
	public Injector getModuleInjector() {
		return Guice.createInjector(
				Modules.override(
					new SuperModGenericModule())
				.with(Modules.override(
					new SuperModListModule(),
					new SuperModFileModule(),
					new SuperModEMFFileModule(),
					new SuperModTextfileModule(),
					new SuperModHetFileModule(),
					new SuperModFeatureModule(),
					new SuperModCollabModule(),
					new SuperModChangeModule())
					.with(
						new SuperModFeatFileModule(),		
						new SuperModCollFeatModule()
					)),
				Modules.override(
					new SuperModGenericClientModule())
				.with(Modules.override(
					new SuperModListClientModule(),
					new SuperModFileClientModule(),
					new SuperModEMFFileClientModule(),
					new SuperModTextfileClientModule(),
					new SuperModHetFileClientModule(),
					new SuperModFeatureClientModule(),
					new SuperModCollabClientModule(),
					new SuperModChangeClientModule())
					.with(
						new SuperModFeatFileClientModule(),		
						new SuperModCollFeatClientModule()
					)),
				new AbstractModule() {					
					@Override
					protected void configure() {
						bind(String.class).annotatedWith(Names.named(
								"de.ubt.ai1.supermod.module.injectorProvider.moduleId"))	
								.toInstance(getModuleId());
					}
				});
	}	

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.module.ISuperModModuleInjectorProvider
	 * #getCaption()
	 */
	@Override
	public String getCaption() {
		return "Feature Model + Collaborative Revision Graph";
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.module.ISuperModModuleInjectorProvider
	 * #getDescription()
	 */
	@Override
	public String getDescription() {
		return "A heterogeneous file system (EMF, text, XML) versioned by a feature model and a collaborative revision graph. The feature model is additionally versioned by the revision graph. Both version dimensions are mapped by a change space.";
	}


	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.module.ISuperModModuleInjectorProvider#getImage()
	 */
	@Override
	public Image getImage() {
		try {
			return new Image(null, 
					new URL("platform:/plugin/de.ubt.ai1.supermod.module.hetfile.collfeat.client/icons/hetfile-collfeat.png")
					.openStream());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.module.client.ISuperModClientModuleInjectorProvider#isRemote()
	 */
	@Override
	public boolean isRemote() {
		return true;
	}

}

