/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.file.client.impl;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.dialogs.CheckedTreeSelectionDialog;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;

import de.ubt.ai1.supermod.mm.client.SingleVersionProductDimensionDescriptor;
import de.ubt.ai1.supermod.mm.file.client.SingleVersionFileSystemDescriptor;
import de.ubt.ai1.supermod.mm.file.client.SingleVersionResourceDescriptor;
import de.ubt.ai1.supermod.mm.file.client.SuperModFileClientFactory;
import de.ubt.ai1.supermod.service.client.ISingleVersionProductDimensionDescriptorSelectionService;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientWrappedException;
import de.ubt.ai1.supermod.service.file.client.FileUtil;

/**
 * Implementation of the single version product dimension descriptor selection
 * service interface specific to the product dimension type of versioned file
 * systems. It presents to the user a resource tree for the given root
 * directory of the workspace to be versioned. The user may select or deselect
 * resources hierarchically. From the user selection, a dimension descriptor
 * is generated and returned.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	31.07.2014
 */
public class VersionedFileSystemSingleVersionProductDimensionDescriptorSelectionService 
implements ISingleVersionProductDimensionDescriptorSelectionService {

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.
	 * ISingleVersionProductDimensionDescriptorSelectionService
	 * #selectSingleVersionProductDimension(de.ubt.ai1.supermod.mm.client.
	 * SingleVersionProductDimensionDescriptor)
	 */
	@Override
	public SingleVersionProductDimensionDescriptor 
	selectSingleVersionProductDimension(String rootUri) 
					throws SuperModClientException {
		IContainer root = (IContainer) ResourcesPlugin.getWorkspace().getRoot()
				.findMember(rootUri);
		AtomicReference<List<Object>> userSelection = new AtomicReference<>(
				Collections.emptyList());
		Display.getDefault().syncExec(new Runnable() {			
			@Override
			public void run() {
				CheckedTreeSelectionDialog resDia = new CheckedTreeSelectionDialog(
						Display.getDefault().getActiveShell(), 
						new WorkbenchLabelProvider(), 
						new BaseWorkbenchContentProvider() {
					// show only resources relevant to version control.
					@Override
					public Object[] getChildren(Object element) {
						IResource res = (IResource) element;
						List<Object> children = new LinkedList<>();
						if (res instanceof IContainer) {
							try {
								for (IResource member : ((IContainer) res).members()) {
									if (FileUtil.isRelevantToVersionControl(true, false, 
											false, (IResource) member)) {
										children.add(member);
									}
								}
							} catch (CoreException e) {
								e.printStackTrace();
							}
						}
						return children.toArray();
					}
				});
				// open a selection dialog.
				resDia.setTitle("Resource Selection");
				resDia.setMessage("Select resources to be versioned by SuperMod:");
				resDia.setContainerMode(true);
				resDia.setInput(root);
				resDia.open();		
				if (resDia.getResult() != null) {
					userSelection.set(Arrays.asList(resDia.getResult()));
				}
			}
		});
		if (userSelection.get() == null) {
			return null;
		}
		
		SingleVersionFileSystemDescriptor descriptor = 
				SuperModFileClientFactory.eINSTANCE
				.createSingleVersionFileSystemDescriptor();
		descriptor.setRootUri(rootUri);
			
		try {
			// create a resource descriptor from the user selection.
			for (IResource member : FileUtil
					.allMembers(root, true, false, false)) {
				String resUri = FileUtil.makeRelative(descriptor.getRootUri(),
						member.getFullPath().toPortableString());
				SingleVersionResourceDescriptor resDesc = null;
				if (member instanceof IFile) {
					resDesc = descriptor.createFile(resUri);
				}
				else {
					resDesc = descriptor.createFolder(resUri);
				}
				if (resDesc != null) {
					resDesc.setVersioned(userSelection.get().contains(member));
				}
			}
		} catch (CoreException e) {
			throw new SuperModClientWrappedException(e);
		}
		return descriptor;
	}

}
