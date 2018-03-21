/******************************************************************************
 * Copyright (c) 2018 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.textfile.client.impl;


import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;

import de.ubt.ai1.supermod.mm.client.ProductConflict;
import de.ubt.ai1.supermod.mm.core.ProductSpaceElement;
import de.ubt.ai1.supermod.mm.file.VersionedFile;
import de.ubt.ai1.supermod.mm.file.client.VersionedFileExportTrace;
import de.ubt.ai1.supermod.mm.list.VersionedListVertex;
import de.ubt.ai1.supermod.mm.list.client.OrderingConflict;
import de.ubt.ai1.supermod.mm.list.client.SuperModListClientPackage;
import de.ubt.ai1.supermod.mm.textfile.TextLine;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientWrappedException;
import de.ubt.ai1.supermod.service.file.client.IVersionedFileContentConflictMarkerGenerator;
import de.ubt.ai1.supermod.textfile.client.SuperModTextfileClientPackage;
import de.ubt.ai1.supermod.textfile.client.TextFileExportTrace;
import de.ubt.ai1.supermod.textfile.client.TextLineExportTrace;

/**
 * The conflict marker for plain text files is applicable to all conflict types
 * defined in the text file client metamodel. It uses standard Eclipse markers
 * to indicate the problem.
 * 
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>,
 * 			Johannes Schroepfer <Johannes.M.Schroepfer(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	2018-01-09
 */
public class TextFileContentConflictMarkerGenerator 
implements IVersionedFileContentConflictMarkerGenerator {
	
	public static final String MARKER_TYPE = 
			"de.ubt.ai1.supermod.client.marker.text";

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.file.client.
	 * IVersionedFileContentConflictMarker#generateMarkersFor(
	 * java.lang.String, de.ubt.ai1.supermod.mm.client.ProductConflict,
	 * de.ubt.ai1.supermod.mm.file.client.VersionedFileExportTrace)
	 */
	@Override
	public boolean generateMarkersFor(String projectName, String resourcePath, 
			ProductConflict conflict, VersionedFileExportTrace vfTrace)
					throws SuperModClientWrappedException {
		if (!conflict.eClass().getEPackage().equals(
				SuperModTextfileClientPackage.eINSTANCE) &&
				!(conflict.eClass().getEPackage().equals(
						SuperModListClientPackage.eINSTANCE))) {
			return false;
		}
		int affectedLine = getAffectedLine(conflict, vfTrace);
		String message = "The mutual order of this line and its successors is "
				+ "undefined due to conflicting insertions.";
		int severity = encodeSeverity(conflict);
		
		IResource iRes = getTextfileResource(projectName,
				vfTrace.getVersionedFile());
		if (iRes instanceof IFile) {
			try {
				IMarker marker = ((IFile) iRes).createMarker(MARKER_TYPE);
				marker.setAttribute(IMarker.PRIORITY, IMarker.PRIORITY_NORMAL);
				marker.setAttribute(IMarker.SEVERITY, severity);
				marker.setAttribute(IMarker.MESSAGE, message);
				marker.setAttribute(IMarker.LINE_NUMBER, 2 + affectedLine);
			} catch (CoreException e) {
				throw new SuperModClientWrappedException(e);
			}
		}
		return true;		
	}

	/**
	 * @param projectName
	 * @param versionedFile
	 * @return an Eclipse resource representing the file where conflict markers
	 * 			will be added
	 */
	private IResource getTextfileResource(String projectName,
			VersionedFile versionedFile) {
		IProject project = ResourcesPlugin.getWorkspace().getRoot()
				.getProject(projectName);	
		return project.findMember(versionedFile.getPath());
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
	 * @param vfTrace
	 * @return the line in the workspace file this conflict refers to
	 */
	private int getAffectedLine(ProductConflict conflict,
			VersionedFileExportTrace vfTrace) {
		
		TextFileExportTrace textTrace = (TextFileExportTrace) vfTrace;
		if (conflict instanceof OrderingConflict) {
			OrderingConflict oc = (OrderingConflict) conflict;
			VersionedListVertex last = oc.getLastVertex();
			if (last != null) {
				ProductSpaceElement pse = last.getElement();
				if (pse instanceof TextLine) {
					TextLine line = (TextLine) pse;
					return findLineNr(line, textTrace);
				}
			}
		}
		return -1;
	}

	/**
	 * @param line
	 * @param textTrace
	 * @return the integer line number corresponding to the line element
	 */
	private int findLineNr(TextLine line, TextFileExportTrace textTrace) {
		for (TextLineExportTrace lineTrace : textTrace.getLines()) {
			if (lineTrace.getLine() != null &&
					lineTrace.getLine().equals(line)) {
				return lineTrace.getLineNr();
			}
		}
		return -1;
	}
}
