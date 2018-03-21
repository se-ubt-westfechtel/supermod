/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.vcs.client.team;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.SelectionDialog;

import de.ubt.ai1.supermod.service.module.client.ISuperModClientModuleInjectorProvider;

/**
 * This class describes the user interface of a dialog where a SuperMod module
 * can be chosen among a set of candidates. Each module has a name, a tool-tip
 * description and an image that graphically describes its underlying version
 * and product dimensions.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	19.03.2015
 */
public class SuperModModuleSelectionDialog extends SelectionDialog {
	
	private Collection<ISuperModClientModuleInjectorProvider> modules;
	private ISuperModClientModuleInjectorProvider selectedModule;
	private List<Button> buttons;
	
	/**
	 * Creates a new dialog.
	 *
	 * @param parentShell
	 * @param modules the candidate modules.
	 */
	protected SuperModModuleSelectionDialog(Shell parentShell,
			Collection<ISuperModClientModuleInjectorProvider> modules) {
		super(parentShell);
		this.modules = modules;
		this.buttons = new LinkedList<>();
	}	

	/**
	 * Returns the chosen module.
	 *
	 * @return the chosen module.
	 */
	public ISuperModClientModuleInjectorProvider getSelectedModule() {
		return selectedModule;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.dialogs.SelectionDialog#getResult()
	 */
	@Override
	public Object[] getResult() {
		return new Object[]{getSelectedModule()};
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.Dialog
	 * #createDialogArea(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite labelComp = new Composite(parent, SWT.NONE);
		labelComp.setLayout(new RowLayout());
		Label description = new Label(labelComp, SWT.NONE);
		description.setText("Please select one of the following SuperMod configurations in order to set up the desired combination of version and product dimensions.");
		
		Composite modulesComp = new Composite(parent, SWT.NONE);
		modulesComp.setLayout(new GridLayout(2, true));
		for (ISuperModClientModuleInjectorProvider module : modules) {
			createModuleComp(module, modulesComp);
		}
		return parent;
	}

	/**
	 * Auxiliary method to generate UI for a single SuperMod module candidate.
	 * 
	 * @param module
	 * @param modulesComp
	 * @return
	 */
	private Composite createModuleComp(ISuperModClientModuleInjectorProvider module, 
			Composite modulesComp) {
		Composite moduleComp = new Composite(modulesComp, SWT.NONE);
		moduleComp.setLayout(new GridLayout());
		{
			GridData data = new GridData();
			data.verticalAlignment = GridData.FILL;
			data.horizontalAlignment = GridData.FILL;
			data.grabExcessHorizontalSpace = true;
			data.grabExcessVerticalSpace = true;
			moduleComp.setLayoutData(data);
		}
		Button moduleButton = new Button(moduleComp, SWT.RADIO);
		moduleButton.setText(module.getCaption());
		moduleButton.setToolTipText(module.getDescription());
		{
			GridData data = new GridData();
			data.widthHint = 300;
			moduleButton.setLayoutData(data);
		}
		moduleButton.addSelectionListener(new SelectionListener() {			
			@Override
			public void widgetSelected(SelectionEvent e) {
				selectedModule = module;
				applyButtonSelections(moduleButton);
			}			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				selectedModule = module;	
				applyButtonSelections(moduleButton);
			}
		});
		buttons.add(moduleButton);
		Image moduleImage = module.getImage();
		if (moduleImage != null) {
			Composite moduleImageComp = new Composite(moduleComp, SWT.BORDER);
			{
				GridData data = new GridData();
				data.widthHint = moduleImage.getImageData().width;
				data.heightHint = moduleImage.getImageData().height;
				moduleImageComp.setLayoutData(data);
			}
			moduleImageComp.setBackgroundImage(moduleImage);
		}
		return moduleComp;
	}

	/**
	 * Auxiliary method to activate only the specified module button in the
	 * radio selection.
	 *
	 * @param moduleButton
	 */
	protected void applyButtonSelections(Button moduleButton) {
		for (Button button : buttons) {
			button.setSelection(button == moduleButton);
		}
	}
	

}
