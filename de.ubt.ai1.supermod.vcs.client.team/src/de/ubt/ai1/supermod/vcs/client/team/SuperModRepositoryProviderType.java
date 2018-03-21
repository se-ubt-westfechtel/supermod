/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.vcs.client.team;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.swt.widgets.Display;
import org.eclipse.team.core.RepositoryProvider;
import org.eclipse.team.core.RepositoryProviderType;

/**
 * Repository provider type for SuperMod, which ensures that imported SuperMod
 * projects get connected to the SuperMod repository provider.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	08.06.2015
 */
public class SuperModRepositoryProviderType extends RepositoryProviderType {
	
	/* (non-Javadoc)
	 * @see org.eclipse.team.core.RepositoryProviderType#metaFilesDetected(
	 * org.eclipse.core.resources.IProject, 
	 * org.eclipse.core.resources.IContainer[])
	 */
	@Override
	public void metaFilesDetected(IProject project, IContainer[] containers) {
		super.metaFilesDetected(project, containers);
		boolean map = false;
		for (IContainer c : containers) {
			if (project.equals(c)) {
				map = true;
				break;
			}
		}
		if (!map) {
			return;
		}
		Display.getDefault().asyncExec(new Runnable() {			
			@Override
			public void run() {
				try {
					RepositoryProvider.map(project, 
							SuperModRepositoryProvider.PROVIDER_ID);
					project.findMember(".supermod").setTeamPrivateMember(true);
				} catch (CoreException e) {
					e.printStackTrace();
				}				
			}
		});		
	}

}
