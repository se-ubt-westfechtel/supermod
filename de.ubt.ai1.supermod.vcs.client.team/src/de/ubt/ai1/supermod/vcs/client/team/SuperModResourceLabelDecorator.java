/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.vcs.client.team;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ILightweightLabelDecorator;
import org.eclipse.team.core.RepositoryProvider;

import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.service.client.IMetadataResourceHandler;
import de.ubt.ai1.supermod.service.module.client.SuperModClientServiceProvider;
import de.ubt.ai1.supermod.vcs.client.IStateService;
import de.ubt.ai1.supermod.vcs.client.IVersionService;

/**
 * SuperMod specific implementation of the label decorator, which is used in
 * package or project explorers in order to display the current versioning
 * state of resources. It uses the state and version VCS operations provided
 * by the SuperMod API in order to set the label and overlay accordingly.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	04.08.2014
 */
public class SuperModResourceLabelDecorator
implements ILightweightLabelDecorator {

	public static final String DECORATOR_ID = 
			"de.ubt.ai1.supermod.vcs.team.decorator";

	private static final String PREFIX_MODIFIED = "> ";
	
	protected List<ILabelProviderListener> listeners = new ArrayList<>();
	
	private ImageDescriptor removedOverlay;
	private ImageDescriptor addedOverlay;
	private ImageDescriptor versionedOverlay;
	private ImageDescriptor unknownOverlay;
	private ImageDescriptor conflictingOverlay;
	
	/**
	 * Creates a new instance.
	 */
	public SuperModResourceLabelDecorator() {
		removedOverlay = ImageDescriptor.createFromFile(getClass(), 
				"/icons/overlay/removed.gif");
		addedOverlay = ImageDescriptor.createFromFile(getClass(), 
				"/icons/overlay/added.gif");
		versionedOverlay = ImageDescriptor.createFromFile(getClass(), 
				"/icons/overlay/versioned.gif");
		unknownOverlay = ImageDescriptor.createFromFile(getClass(),
				"/icons/overlay/unknown.gif");
		conflictingOverlay = ImageDescriptor.createFromFile(getClass(), 
				"/icons/overlay/conflicting.gif");
	}

	@Override
	public void addListener(ILabelProviderListener listener) {
		listeners.add(listener);
	}

	@Override
	public void dispose() {
	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {
		listeners.remove(listener);
	}

	@Override
	public void decorate(Object element, IDecoration decoration) {
		if (element instanceof IResource) {
			IResource resource = (IResource) element;
			String uri = resource.getFullPath().toPortableString();
			if (resource.getProject() != null &&
					RepositoryProvider.getProvider(resource.getProject()) 
					instanceof SuperModRepositoryProvider) {
				IMetadataResourceHandler resourceHandler = 
						SuperModClientServiceProvider.getInstance()
						.getDefaultService(IMetadataResourceHandler.class);
				if (resourceHandler != null) {
					try {
						LocalRepository lr = resourceHandler.getRepository(
								resource.getFullPath().toPortableString(), 
								new ResourceSetImpl());
						if (lr != null && lr.getModuleId() != null) {
							String moduleId = lr.getModuleId();
							IStateService stateService = 
									SuperModClientServiceProvider
									.getInstance().getService(
											moduleId, IStateService.class);
							IVersionService versionService = 
									SuperModClientServiceProvider
									.getInstance().getService(
											moduleId, IVersionService.class);						
							switch (stateService.getState(lr, uri)) {
							case ADDED: 
								decorateAdded(decoration);
								break;
							case UNKNOWN: 
								decorateUnknown(decoration);
								break;
							case UNVERSIONED: 
								decorateUnversioned(decoration);
								break;
							case CHANGED: 
								decorateChanged(decoration); 
								decorateVersion(decoration, 
										versionService.getVersion(lr, uri));
								break;
							case REMOVED: 
								decorateRemoved(decoration); 
								decorateVersion(decoration, 
										versionService.getVersion(lr, uri));
								break;
							case MISSING:
								decorateMissing(decoration);
							case UNCHANGED: 
								decorateUnchanged(decoration); 
								decorateVersion(decoration, 
										versionService.getVersion(lr, uri));
								break;			
							case METADATA:
								decorateMetadata(decoration);
								break;
							case CONFLICTING:
								decorateConflicting(decoration);
								decorateVersion(decoration, 
										versionService.getVersion(lr, uri));
								break;
							default:
								break;						
							}	
						}
					}
					catch (Exception e) {
//						e.printStackTrace();
					}
				}
			}			
		}
		else if (element instanceof IAdaptable) {
			Object adapter = ((IAdaptable) element).getAdapter(IResource.class);
			if (adapter instanceof IResource) {
				decorate(adapter, decoration);
			}
		}
				
	}

	/**
	 * Creates a suitable decoration for the state "unversioned".
	 *
	 * @param decoration
	 */
	private void decorateUnversioned(IDecoration decoration) {
		// no decoration for unversioned items
	}
	
	/**
	 * Creates a suitable decoration for the state "unknown".
	 *
	 * @param decoration
	 */
	private void decorateUnknown(IDecoration decoration) {
		decoration.addOverlay(unknownOverlay);
	}

	/**
	 * Creates a suitable decoration for the state "changed".
	 *
	 * @param decoration
	 */
	private void decorateChanged(IDecoration decoration) {
		decoration.addPrefix(PREFIX_MODIFIED);
		decoration.addOverlay(versionedOverlay);
	}

	/**
	 * Creates a suitable decoration for the state "unchanged".
	 *
	 * @param decoration
	 */
	private void decorateUnchanged(IDecoration decoration) {
		decoration.addOverlay(versionedOverlay);
	}

	/**
	 * Creates a suitable decoration for the state "added".
	 *
	 * @param decoration
	 */
	private void decorateAdded(IDecoration decoration) {
		decoration.addOverlay(addedOverlay);
	}	

	/**
	 * Creates a suitable decoration for the state "removed".
	 *
	 * @param decoration
	 */
	private void decorateRemoved(IDecoration decoration) {
		decoration.addPrefix(PREFIX_MODIFIED);
		decoration.addOverlay(removedOverlay);
	}		
	
	/**
	 * Creates a suitable decoration for the state "missing".
	 *
	 * @param decoration
	 */
	private void decorateMissing(IDecoration decoration) {
		decoration.addOverlay(removedOverlay);
	}	

	/**
	 * Creates a suitable decoration for the state "meta-data".
	 *
	 * @param decoration
	 */
	private void decorateMetadata(IDecoration decoration) {
		// no decoration for meta-data files
	}
	
	/**
	 * Creates a suitable decoration for the state "conflicting".
	 *
	 * @param decoration
	 */
	private void decorateConflicting(IDecoration decoration) {
		decoration.addPrefix(PREFIX_MODIFIED);
		decoration.addOverlay(conflictingOverlay);
	}
	
	/**
	 * Adds a version identifier to the decoration of a versioned element.
	 *
	 * @param decoration
	 * @param versionStr a string representing the version of the decorated
	 * 			element.
	 */
	private void decorateVersion(IDecoration decoration, String versionStr) {
		if (versionStr != null && !versionStr.isEmpty()) {
			decoration.addSuffix(" " + versionStr);		
		}
	}

}
