/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.vcs.client.team;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.team.core.RepositoryProvider;

/**
 * Implementation of the repository provider extension point, which connects
 * the SuperMod high-level operations to the Eclipse team component.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	04.08.2014
 */
public class SuperModRepositoryProvider extends RepositoryProvider {
	
	public static final String PROVIDER_ID = 
			"de.ubt.ai1.supermod.vcs.team.provider";

	@Override
	public void deconfigure() throws CoreException {

	}

	@Override
	public void configureProject() throws CoreException {
		
	}

	@Override
	public String getID() {
		return PROVIDER_ID;
	}
	
}
