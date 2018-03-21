/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.editor.emffile;

import org.eclipse.core.resources.IResource;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.StyledCellLabelProvider;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.team.core.RepositoryProvider;

import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.mm.emffile.EMFFileContent;
import de.ubt.ai1.supermod.mm.emffile.EMFObject;
import de.ubt.ai1.supermod.mm.file.VersionedFile;
import de.ubt.ai1.supermod.mm.file.VersionedFileSystem;
import de.ubt.ai1.supermod.mm.file.VersionedResource;
import de.ubt.ai1.supermod.mm.file.client.SingleVersionFileSystemDescriptor;
import de.ubt.ai1.supermod.service.client.IMetadataResourceHandler;
import de.ubt.ai1.supermod.service.client.IVersionLabellingService;
import de.ubt.ai1.supermod.service.emffile.client.IUUIDConverter;
import de.ubt.ai1.supermod.service.file.IVersionedFileSystemProvider;
import de.ubt.ai1.supermod.service.file.client.FileUtil;
import de.ubt.ai1.supermod.service.file.client.ISingleVersionFileSystemDescriptorProvider;
import de.ubt.ai1.supermod.service.module.client.SuperModClientServiceProvider;
import de.ubt.ai1.supermod.vcs.client.team.SuperModRepositoryProvider;
import de.ubt.ai1.util.emf.AI1ResourceUtil;

/**
 * A specific label provider for multi-variant EMF resources which adds
 * version information to all elements.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	13.05.2015
 */
public class SuperModEMFLabelProvider extends StyledCellLabelProvider {
	
	private ILabelProvider wrappedProvider;
	
	/**
	 * Creates a new instance based on a subordinate label provider.
	 *
	 * @param wrappedProvider
	 */
	public SuperModEMFLabelProvider(ILabelProvider wrappedProvider) {
		this.wrappedProvider = wrappedProvider;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.StyledCellLabelProvider
	 * #update(org.eclipse.jface.viewers.ViewerCell)
	 */
	@Override
	public void update(ViewerCell cell) {
		Object obj = cell.getElement();
		String contentLabel = wrappedProvider.getText(obj);
		String decoration = getDecoration(obj);
		StyledString ss = new StyledString(contentLabel);
		if (decoration != null) {
			ss.append(" ");
			ss.append(decoration, StyledString.DECORATIONS_STYLER);
		}
		cell.setText(ss.toString());
		cell.setStyleRanges(ss.getStyleRanges());
		cell.setImage(wrappedProvider.getImage(obj));
		super.update(cell);
	}	

	/**
	 * Retrieves the version decoration for a specific tree element.
	 *
	 * @param element
	 * @return
	 */
	private String getDecoration(Object element) {
		XMIResource res = null;
		String externalUuid = null;
		if (element instanceof XMIResource) {
			res = (XMIResource) element;
		}
		if (element instanceof EObject) {
			EObject obj = (EObject) element;
			if (obj.eResource() instanceof XMIResource) {
				res = (XMIResource) obj.eResource();
			}
			externalUuid = res.getID(obj);
		}

		if (res != null) {
			IResource iRes = AI1ResourceUtil.eResourceToIResource(res);
			if (iRes != null && iRes.getProject() != null &&
					RepositoryProvider.getProvider(iRes.getProject()) 
					instanceof SuperModRepositoryProvider) {
				IMetadataResourceHandler resourceHandler = 
						SuperModClientServiceProvider.getInstance()
						.getDefaultService(IMetadataResourceHandler.class);
				if (resourceHandler != null) {
					try {
						LocalRepository lr = resourceHandler.getRepository(
								iRes.getFullPath().toPortableString(), 
								new ResourceSetImpl());
						if (lr != null) {
							String moduleId = lr.getModuleId();
							IVersionedFileSystemProvider vfsProvider = 
									SuperModClientServiceProvider.getInstance()
									.getService(moduleId, 
											IVersionedFileSystemProvider.class);
							VersionedFileSystem vfs = vfsProvider
									.getVersionedFileSystem(lr.getProductSpace());
							ISingleVersionFileSystemDescriptorProvider svsProvider =
									SuperModClientServiceProvider.getInstance().getService(moduleId, 
											ISingleVersionFileSystemDescriptorProvider.class);
							SingleVersionFileSystemDescriptor svs = 
									svsProvider.getSingleVersionFileSystemDescriptor(
											lr.getLocalDescriptor());
							String relativeUri = FileUtil.makeRelative(svs.getRootUri(), 
									iRes.getFullPath().toPortableString());
							VersionedResource vRes = vfs.getResource(relativeUri);
							if (vRes != null) {
								IVersionLabellingService labeller = 
										SuperModClientServiceProvider.getInstance()
										.getService(moduleId, IVersionLabellingService.class);
								if (externalUuid == null) {
									return labeller.getLabel(vRes.getVisibility(), 
											lr.getVersionSpace());
								}		
								else {
									if (vRes instanceof VersionedFile && 
											((VersionedFile) vRes).getContent()
											instanceof EMFFileContent) {
										EMFFileContent emfC = (EMFFileContent)
												((VersionedFile) vRes).getContent();
										IUUIDConverter uuidConverter = 
												SuperModClientServiceProvider.getInstance()
												.getService(moduleId, IUUIDConverter.class);
										String internalUuid = uuidConverter
												.convertExternalToInternalUUID(externalUuid);
										if (internalUuid != null) {
											for (EMFObject emfO : emfC.getObjects()) {
												if (emfO.getUuid().equals(internalUuid)) {
													return labeller.getLabel(
															emfO.getVisibility(),
															lr.getVersionSpace());
												}
											}
										}
									}
								}
							}
						}
					}
					catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}	
		return null;
	}
	
}
