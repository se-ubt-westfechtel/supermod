package de.ubt.ai1.supermod.vcs.client.impl;

import java.util.concurrent.atomic.AtomicReference;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;

/**
 * Common operations used by several SuperMod services.
 * 
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	27.11.2017
 */
public class ServiceUtil {
	
	/**
	 * Asks the user for the name of a new project and creates this project in the workspace.
	 * 
	 * @param oldProjectName
	 * @param monitor
	 * @return
	 * @throws CoreException
	 */
	public static String createProject(String oldProjectName, IProgressMonitor monitor) throws CoreException {
		// obtain a project name from the user
		AtomicReference<String> projectName = new AtomicReference<>();
		Display.getDefault().syncExec(new Runnable() {			
			@Override
			public void run() {
				InputDialog commitMsgInput = new InputDialog(
						Display.getDefault().getActiveShell(), "Project Name", 
						"Please enter a name for the exported project.",
						oldProjectName, 
						new IInputValidator() {							
							@Override
							public String isValid(String newText) {
								try {
									return ResourcesPlugin.getWorkspace()
										.getRoot().getProject(newText).exists()
										? "Project already exists." : null;
								}
								catch (Exception e) {
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
		IProject project = ResourcesPlugin.getWorkspace().getRoot()
					.getProject(projectName.get());
		if (!project.exists()) {
			monitor.subTask("Creating Project");
			project.create(monitor);
			project.open(monitor);
			monitor.worked(1);
		}
		
		return projectName.get();
	}

}
