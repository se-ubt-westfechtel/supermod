/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.collab.client.impl.ui;

import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.TreeColumnViewerLabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;

/**
 * A dialog which presents a tree of public and private revisions to the user,
 * starting with the latest available revision.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	28.10.2015
 */
public class CollabRevisionSpecificationDialog
extends ElementTreeSelectionDialog {

	/**
	 * Creates a new dialog within the specified parent shell. Its label and
	 * content providers will be automatically set to display collaborative
	 * revision graphs in a suitable way.
	 *
	 * @param parent the shell.
	 */
	public CollabRevisionSpecificationDialog(Shell parent) {
		super(parent, new AdapterFactoryLabelProvider.FontAndColorProvider(
				new ComposedAdapterFactory(
				ComposedAdapterFactory.Descriptor.Registry.INSTANCE),
				null, null, null), 
		new AdapterFactoryContentProvider(
				new ComposedAdapterFactory(
				ComposedAdapterFactory.Descriptor.Registry.INSTANCE)));
		setSize(100, 20);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.dialogs.ElementTreeSelectionDialog#
	 * createDialogArea(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Control control = super.createDialogArea(parent);
		
		TreeViewer tv = getTreeViewer();
		tv.getTree().setHeaderVisible(true);
		tv.getTree().setLinesVisible(true);
		
		createColumns(tv);
		return control;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.dialogs.ElementTreeSelectionDialog
	 * #doCreateTreeViewer(org.eclipse.swt.widgets.Composite, int)
	 */
	@Override
	protected TreeViewer doCreateTreeViewer(Composite parent, int style) {
		return super.doCreateTreeViewer(parent, style | SWT.MULTI |
				SWT.FULL_SELECTION);
	}

	/**
	 * Creates the columns and adds them to the tree viewer.
	 *
	 * @param tv
	 */
	protected void createColumns(TreeViewer tv) {
		TreeViewerColumn revisionColumn = new TreeViewerColumn(tv, SWT.RIGHT);
		revisionColumn.getColumn().setText("Revision");
		revisionColumn.getColumn().setWidth(140);
		revisionColumn.setLabelProvider(new TreeColumnViewerLabelProvider(
				getTreeViewer().getLabelProvider()));

		TreeViewerColumn dateColumn = new TreeViewerColumn(tv, SWT.RIGHT);
		dateColumn.getColumn().setText("Date");
		dateColumn.getColumn().setWidth(90);
		dateColumn.setLabelProvider(new TreeColumnViewerLabelProvider(
				getTreeViewer().getLabelProvider()));
		
		TreeViewerColumn userColumn = new TreeViewerColumn(tv, SWT.RIGHT);
		userColumn.getColumn().setText("User");
		userColumn.getColumn().setWidth(90);
		userColumn.setLabelProvider(new TreeColumnViewerLabelProvider(
				getTreeViewer().getLabelProvider()));
		
		TreeViewerColumn msgColumn = new TreeViewerColumn(tv, SWT.LEFT);
		msgColumn.getColumn().setText("Message");
		msgColumn.getColumn().setWidth(180);
		msgColumn.setLabelProvider(new TreeColumnViewerLabelProvider(
				getTreeViewer().getLabelProvider()));
	}

	/**
	 * Refreshes and expands the tree viewer.
	 */
	public void refreshAndExpand() {
		getTreeViewer().refresh();
		getTreeViewer().expandAll();
	}
}
