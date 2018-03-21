/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.logical.client.impl.ui;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;

import de.ubt.ai1.supermod.mm.core.Option;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.Tristate;
import de.ubt.ai1.supermod.mm.core.provider.SuperModCoreItemProviderAdapterFactory;

/**
 * A dialog that presents an option binding to the user, who may modify the
 * assigned tristate value by double-clicking on the option.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	01.08.2014
 */
public class OptionBindingSpecificationDialog 
extends ElementTreeSelectionDialog {
	
	/**
	 * Strategy to use for the validation of a specified option binding within
	 * the dialog. The user may only select the current binding in case 
	 * validation is successful.
	 */
	public static interface IOptionBindingValidator {
		
		/**
		 * @param binding
		 * @return whether the binding is valid for the current selection.
		 */
		public boolean validate(OptionBinding binding);
	}

	protected IOptionBindingValidator validator;
	protected OptionBinding optionBinding;

	/**
	 * Creates a new dialog within the specified parent shell. Its label and
	 * content providers will be automatically set to display option bindings
	 * in a suitable way.
	 *
	 * @param parent
	 */
	public OptionBindingSpecificationDialog(Shell parent) {
		super(parent, new AdapterFactoryLabelProvider(new 
				SuperModCoreItemProviderAdapterFactory()),
				new AdapterFactoryContentProvider(new 
						SuperModCoreItemProviderAdapterFactory()) {
			@Override
			public Object[] getElements(Object object) {
				return getChildren(object);
			}
		});
	}
	
	/**
	 * Sets the currently displayed option binding.
	 *
	 * @param optionBinding
	 */
	public void setOptionBinding(OptionBinding optionBinding) {
		this.optionBinding = optionBinding;
		setInput(optionBinding);
	}

	/**
	 * Sets the validator to use for the binding.
	 *
	 * @param validator
	 */
	public void setOptionBindingValidator(IOptionBindingValidator validator) {
		this.validator = validator;		
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.dialogs.ElementTreeSelectionDialog#create()
	 */
	@Override
	public void create() {
		setDoubleClickSelects(false);
		super.create();
		setBlockOnOpen(true);
		setAllowMultiple(false);
		getTreeViewer().addDoubleClickListener(new IDoubleClickListener() {			
			@Override
			public void doubleClick(DoubleClickEvent event) {
				if (event.getSelection() instanceof IStructuredSelection) {
					Iterator<?> it = ((IStructuredSelection) 
							event.getSelection()).iterator();
					while (it.hasNext()) {
						// switch the assigned tristate value by double 
						// clicking.
						@SuppressWarnings("unchecked")
						Map.Entry<Option, Tristate> entry = 
								(Entry<Option, Tristate>) it.next();						
						switch(entry.getValue()) {
						case FALSE:
							entry.setValue(Tristate.UNKNOWN);
							break;
						case TRUE:
							entry.setValue(Tristate.FALSE);
							break;
						default:
							entry.setValue(Tristate.TRUE);
							break;
						}
					}
				}
				updateOKStatus();
			}
		});
		updateOKStatus();
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.dialogs.ElementTreeSelectionDialog#updateOKStatus()
	 */
	@Override
	protected void updateOKStatus() {
		// ensure that the OK button can only be pressed in case the selected
		// option binding is valid.
		if (validator != null && optionBinding != null) {
			boolean ok = validator.validate(optionBinding);
			getOkButton().setEnabled(ok);
		}
	}
	
}
