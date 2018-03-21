package de.ubt.ai1.supermod.adapters.famile.service.impl;

import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicReference;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;

import de.ubt.ai1.supermod.mm.emffile.EMFObject;
import de.ubt.ai1.supermod.mm.emffile.client.EMFFileExportTrace;

/**
 * 
 * @author Alexander Zimmer
 * @date 2017-11-29
 *
 */
public class ServiceUtil {

	/**
	 * Asks the user for the name of a new project and creates this project in the
	 * workspace.
	 * 
	 * @param oldProjectName
	 * @param monitor
	 * @return
	 * @throws CoreException
	 */
	public static IProject createProject(String oldProjectName, IProgressMonitor monitor) throws CoreException {
		// obtain a project name from the user
		AtomicReference<String> projectName = new AtomicReference<>();
		Display.getDefault().syncExec(new Runnable() {
			@Override
			public void run() {
				InputDialog commitMsgInput = new InputDialog(Display.getDefault().getActiveShell(), "Project Name",
						"Please enter a name for the exported project.", oldProjectName, new IInputValidator() {
							@Override
							public String isValid(String newText) {
								try {
									return ResourcesPlugin.getWorkspace().getRoot().getProject(newText).exists()
											? "Project already exists."
											: null;
								} catch (Exception e) {
									return "Invalid project name.";
								}
							}
						});
				int result = commitMsgInput.open();
				if (result == Window.OK) {
					projectName.set(commitMsgInput.getValue());
				}
			}
		});
		if (projectName.get() == null) {
			return null;
		}

		// create the project
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName.get());
		if (!project.exists()) {
			monitor.subTask("Creating Project");
			project.create(monitor);
			project.open(monitor);
			monitor.worked(1);
		}

		return project;
	}

	/**
	 * Returns a Resource Set which specific for the Famile mapping
	 */
	public static ResourceSet getCorrespondingRsSet(EMFFileExportTrace emfFileTrace) {
		if (emfFileTrace.getEmfObjectToEObjectMap() != null) {
			EMap<EMFObject, EObject> emfObjectToEObject = emfFileTrace.getEmfObjectToEObjectMap();
			for (Entry<EMFObject, EObject> entry : emfObjectToEObject.entrySet()) {
				if (entry.getValue().eResource().getResourceSet() != null) {
					return emfObjectToEObject.get(0).getValue().eResource().getResourceSet();
				} else {
					throw new IllegalArgumentException(
							"EObjects of EMFObjectToEObject Map do not contain a ResourceSet ");
				}
			}
		}
		return null;
	}

}
