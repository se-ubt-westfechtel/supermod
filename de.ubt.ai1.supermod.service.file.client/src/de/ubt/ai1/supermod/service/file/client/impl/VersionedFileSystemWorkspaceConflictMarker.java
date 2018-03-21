/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.file.client.impl;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.client.ConflictSet;
import de.ubt.ai1.supermod.mm.client.ProductConflict;
import de.ubt.ai1.supermod.mm.client.ProductDimensionExportTrace;
import de.ubt.ai1.supermod.mm.client.ProductSpaceExportTrace;
import de.ubt.ai1.supermod.mm.core.ProductSpaceElement;
import de.ubt.ai1.supermod.mm.file.VersionedFile;
import de.ubt.ai1.supermod.mm.file.client.VersionedFileExportTrace;
import de.ubt.ai1.supermod.mm.file.client.VersionedFileSystemExportTrace;
import de.ubt.ai1.supermod.service.client.IWorkspaceConflictMarker;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientWrappedException;
import de.ubt.ai1.supermod.service.file.client.IVersionedFileContentConflictMarkerGenerator;

/**
 * Implementation of the conflict marker for versioned files. It iterates
 * through the provided conflict lists and delegates to services implementing
 * {@link IVersionedFileContentConflictMarkerGenerator} of suitable file types, which
 * perform the actual marker generation.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	10.06.2016
 */
public class VersionedFileSystemWorkspaceConflictMarker 
implements IWorkspaceConflictMarker {
	
	public static final String MARKER_TYPE = 
			"de.ubt.ai1.supermod.client.marker";
	
	@Inject
	private IVersionedFileContentConflictMarkerGenerator.Registry serviceRegistry;

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IWorkspaceConflictMarker
	 * #markConflicts(de.ubt.ai1.supermod.mm.client.ConflictSet, 
	 * de.ubt.ai1.supermod.mm.client.ProductSpaceExportTrace)
	 */
	@Override
	public void markConflicts(String projectName, ConflictSet conflicts, 
			ProductSpaceExportTrace exportTrace) throws SuperModClientException {
		if (conflicts == null || exportTrace == null) {
			return;
		}
		
		VersionedFileSystemExportTrace vfsTrace = null;
		for (ProductDimensionExportTrace dimTrace : 
				exportTrace.getDimensionTraces()) {
			if (dimTrace instanceof VersionedFileSystemExportTrace) {
				vfsTrace = (VersionedFileSystemExportTrace) dimTrace;
				break;
			}
		}
		if (vfsTrace == null) {
			return;
		}		
		
		for (ProductConflict conflict : conflicts.getConflicts()) {
			String resourcePath = getResourcePath(conflict);
			if (resourcePath != null) {
				VersionedFileExportTrace vfTrace = 
						vfsTrace.getPathToVersionedFileMap().get(resourcePath);
				if (vfTrace != null) {
					for (IVersionedFileContentConflictMarkerGenerator service : 
							serviceRegistry.getServices()) {
						if (service.generateMarkersFor(projectName,
								resourcePath, conflict,	vfTrace)) {
							break;
						}
					}
				}
			}
		}
	}
	

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IWorkspaceConflictMarker
	 * #removeAllConflictMarkers()
	 */
	@Override
	public void removeAllConflictMarkers(String projectName) 
					throws SuperModClientWrappedException {
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(
				projectName);
		try {
			project.deleteMarkers(MARKER_TYPE, true, IResource.DEPTH_INFINITE);
		} catch (CoreException e) {
			throw new SuperModClientWrappedException(e);
		}
	}

	/**
	 * @param conflict
	 * @return the path of the file where the main element affected by this 
	 * conflict is located
	 */
	private String getResourcePath(ProductConflict conflict) {
		for (ProductSpaceElement pse : 
				conflict.getAffectedProductSpaceElements()) {
			VersionedFile file = getContainingFile(pse);
			if (file != null) {
				return file.getPath();
			}
		}
		return null;
	}

	/**
	 * @param pse
	 * @return the file that contains <code>pse</code>
	 */
	private VersionedFile getContainingFile(ProductSpaceElement pse) {
		if (pse instanceof VersionedFile) {
			return (VersionedFile) pse;
		}
		if (pse != null && pse.getSuperProductSpaceElement() != null) {
			return getContainingFile(pse.getSuperProductSpaceElement());
		}
		return null;
	}


}
