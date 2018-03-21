/******************************************************************************
 * Copyright (c) 2018 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.emffile.client.impl;


import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.ubt.ai1.supermod.mm.client.ProductConflict;
import de.ubt.ai1.supermod.mm.client.provider.ProductConflictItemProvider;
import de.ubt.ai1.supermod.mm.core.ProductSpaceElement;
import de.ubt.ai1.supermod.mm.emffile.EMFAttributeValue;
import de.ubt.ai1.supermod.mm.emffile.EMFFeatureRef;
import de.ubt.ai1.supermod.mm.emffile.EMFObject;
import de.ubt.ai1.supermod.mm.emffile.EMFValue;
import de.ubt.ai1.supermod.mm.emffile.client.EMFFileExportTrace;
import de.ubt.ai1.supermod.mm.emffile.client.SuperModEMFFileClientPackage;
import de.ubt.ai1.supermod.mm.emffile.client.provider.SuperModEMFFileClientItemProviderAdapterFactory;
import de.ubt.ai1.supermod.mm.file.client.VersionedFileExportTrace;
import de.ubt.ai1.supermod.mm.list.client.OrderingConflict;
import de.ubt.ai1.supermod.mm.list.client.SuperModListClientPackage;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientWrappedException;
import de.ubt.ai1.supermod.service.file.client.IVersionedFileContentConflictMarkerGenerator;
import de.ubt.ai1.util.emf.AI1ResourceUtil;

/**
 * The conflict marker for EMF files is applicable to all conflict types defined
 * in the EMF file client metamodel. It uses EMF's built-in marker generation
 * utilities to add a marker to the model instance, whose description is
 * specific to the respective conflict type.
 * 
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>,
 * 			Johannes Schroepfer <Johannes.M.Schroepfer(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	2018-01-09
 */
public class EMFFileContentConflictMarkerGenerator
implements IVersionedFileContentConflictMarkerGenerator {
	
	public static final String MARKER_TYPE =
			"de.ubt.ai1.supermod.client.marker.emf";

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.file.client.
	 * IVersionedFileContentConflictMarker#generateMarkersFor(
	 * java.lang.String, de.ubt.ai1.supermod.mm.client.ProductConflict,
	 * de.ubt.ai1.supermod.mm.file.client.VersionedFileExportTrace)
	 */
	@Override
	public boolean generateMarkersFor(String projectName, String resourcePath, 
			ProductConflict conflict, VersionedFileExportTrace vfTrace)
			throws SuperModClientException {
		if (!conflict.eClass().getEPackage().equals(
				SuperModEMFFileClientPackage.eINSTANCE) &&
				!(conflict.eClass().getEPackage().equals(
						SuperModListClientPackage.eINSTANCE))) {
			return false;
		}
		EObject objectToMark = getAffectedEObject(conflict, vfTrace);
		if (objectToMark == null) {
			return false;
		}
		String message = getDescription(conflict);
		int severity = encodeSeverity(conflict);
		
		IResource iRes = AI1ResourceUtil.eResourceToIResource(
				objectToMark.eResource());
		if (iRes instanceof IFile) {
			try {
				IMarker marker = ((IFile) iRes).createMarker(MARKER_TYPE);
				marker.setAttribute(IMarker.PRIORITY, IMarker.PRIORITY_NORMAL);
				marker.setAttribute(IMarker.SEVERITY, severity);
				marker.setAttribute(IMarker.MESSAGE, message);
				marker.setAttribute(EValidator.URI_ATTRIBUTE, 
						EcoreUtil.getURI(objectToMark).toString());
				return true;		
			} catch (CoreException e) {
				throw new SuperModClientWrappedException(e);
			}
		}
		return false;
	}

	/**
	 * @param conflict
	 * @return encoding of conflict's severity according to IMarker
	 */
	private int encodeSeverity(ProductConflict conflict) {
		switch (conflict.getSeverity()) {
		case ERROR:
			return IMarker.SEVERITY_ERROR;
		case FATAL:
			return IMarker.SEVERITY_ERROR;
		case INFO:
			return IMarker.SEVERITY_INFO;
		case WARNING:
			return IMarker.SEVERITY_WARNING;
		default:
			return IMarker.SEVERITY_INFO;
		}
	}

	/**
	 * @param conflict
	 * @return the conflict description as defined in the conflict's item
	 * 			provider
	 */
	private String getDescription(ProductConflict conflict) {
		if (conflict.eClass().getEPackage().equals(
				SuperModEMFFileClientPackage.eINSTANCE)) {
			return ((ProductConflictItemProvider) 
					new SuperModEMFFileClientItemProviderAdapterFactory().adapt(
					conflict, ProductConflictItemProvider.class))
					.getConflictDescription(conflict);
		}
		else if (conflict instanceof OrderingConflict) {
			OrderingConflict oc = (OrderingConflict) conflict;
			if (oc.getLastVertex() != null) {
				EMFValue value = (EMFValue) oc.getLastVertex().getElement();
				EMFFeatureRef feature = (EMFFeatureRef) value.eContainer();
				if (value instanceof EMFAttributeValue)
					return "The order of the values of the attribute '" 
							+ feature.getFeatureName() + "' of the selected "
							+ "object is inconsistent, beginning with the "
							+ "successor value of the value '"
							+ ((EMFAttributeValue) value).getLiteral() + "'.";
				else
					return "The order of the values of the reference '" 
							+ feature.getFeatureName() + "' of the selected "
									+ "object is inconsistent.";
			} else {
				EMFValue randomValue = (EMFValue) oc.getContextList()
						.getVertices().get(0).getElement();
				EMFFeatureRef feature = (EMFFeatureRef) randomValue.eContainer();
				if (randomValue instanceof EMFAttributeValue)
					return "The order of the values of the attribute '"
							+ feature.getFeatureName() + "' of the selected "
							+ "object is inconsistent, beginning with the "
							+ "first value.";
				else
					return "The order of the values of the reference '" 
							+ feature.getFeatureName() + "' of the selected "
									+ "object is inconsistent.";
			}
		}
		return "";
	}

	/**
	 * @param conflict
	 * @param vfTrace 
	 * @return the workspace object corresponding to the main repository object
	 * 			affected by the conflict
	 */
	private EObject getAffectedEObject(ProductConflict conflict,
			VersionedFileExportTrace vfTrace) {
		for (ProductSpaceElement pse :
				conflict.getAffectedProductSpaceElements()) {
			EMFObject containerObject = getContainerEMFObject(pse);
			if (containerObject != null) {
				EObject eo = ((EMFFileExportTrace) vfTrace)
						.getEmfObjectToEObjectMap().get(containerObject);
				if (eo != null) {
					return eo;
				}
			}
		}
		return null;
	}

	/**
	 * @param pse
	 * @return the containing EMF object of pse, if any
	 */
	private EMFObject getContainerEMFObject(ProductSpaceElement pse) {
		if (pse instanceof EMFObject) {
			return (EMFObject) pse;
		}
		if (pse.getSuperProductSpaceElement() != null) {
			return getContainerEMFObject(pse.getSuperProductSpaceElement());
		}
		return null;
	}
}
