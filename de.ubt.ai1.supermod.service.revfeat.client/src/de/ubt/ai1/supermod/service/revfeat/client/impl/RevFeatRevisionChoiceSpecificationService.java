/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.revfeat.client.impl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.change.Change;
import de.ubt.ai1.supermod.mm.change.ChangeDimension;
import de.ubt.ai1.supermod.mm.change.ChangeSet;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.VersionSpace;
import de.ubt.ai1.supermod.mm.revision.Revision;
import de.ubt.ai1.supermod.service.change.IChangeDimensionProvider;
import de.ubt.ai1.supermod.service.client.IVersionLabellingService;
import de.ubt.ai1.supermod.service.feature.Feature;
import de.ubt.ai1.supermod.service.revision.client.impl.RevisionChoiceSpecificationService;
import de.ubt.ai1.supermod.service.revision.client.impl.ui.RevisionSpecificationDialog;

/**
 * A specialization of the revision choice specification service specific to
 * the three-dimensional version space 'revfeat'. It displays in addition the
 * scope of the performed change, i.e. the logical ambition specified during
 * the respective commit.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	04.08.2015
 */
public class RevFeatRevisionChoiceSpecificationService
extends RevisionChoiceSpecificationService {
	
	@Inject
	private IChangeDimensionProvider changeDimProvider;
	
	@Inject
	@Feature
	private IVersionLabellingService featLabellingService;


	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.revision.client.impl.
	 * RevisionChoiceSpecificationService#createDialog()
	 */
	@Override
	protected RevisionSpecificationDialog createDialog() {
		return new RevFeatRevisionSpecificationDialog(
				Display.getDefault().getActiveShell());
	}

	/**
	 * A specialization of the revision specification dialog that in addition
	 * presents a column for the scope, i.e., the selected ambition used for the
	 * specific commit.
	 */
	public class RevFeatRevisionSpecificationDialog
	extends RevisionSpecificationDialog {

		/**
		 * Creates a new instance.
		 *
		 * @param activeShell
		 */
		public RevFeatRevisionSpecificationDialog(Shell activeShell) {
			super(activeShell);
			setSize(100, 15);
		}

		/* (non-Javadoc)
		 * @see de.ubt.ai1.supermod.service.revision.client.impl.ui.
		 * RevisionSpecificationDialog#createColumns(
		 * org.eclipse.jface.viewers.TreeViewer)
		 */
		@Override
		protected void createColumns(TreeViewer tv) {
			super.createColumns(tv);

			TreeViewerColumn scopeColumn = new TreeViewerColumn(tv, SWT.LEFT);
			scopeColumn.getColumn().setText("Scope");
			scopeColumn.getColumn().setWidth(180);
			scopeColumn.setLabelProvider(new CellLabelProvider() {			
				@Override
				public void update(ViewerCell cell) {
					if (cell.getElement() instanceof Revision) {
						Revision rev = (Revision) cell.getElement();
						VersionSpace vs = rev.getVersionDimension()
								.getVersionSpace();
						ChangeDimension cd = changeDimProvider
								.getChangeDimension(vs);
						OptionBinding ob = getUserBinding(cd, rev);
						cell.setText(featLabellingService.getLabel(
								ob, vs, true));
					}
				}

				private OptionBinding getUserBinding(ChangeDimension cd,
						Revision rev) {
					for (ChangeSet cs : cd.getChangeSets()) {
						Change c0 = cs.getChanges().get(0);
						if (c0.getUserAmbitionBinding().getNumberOfBindings() == 1 &&
								c0.getUserAmbitionBinding().getBoundOptions()
								.get(0).getKey().equals(rev.getRevisionOption())) {
							Change c1 = cs.getChanges().get(1);
							OptionBinding ob = EcoreUtil.copy(
									c1.getUserAmbitionBinding());
							ob.getBoundOptions().removeKey(rev.getRevisionOption());
							return ob;
						}
					}
					return null;
				}
			});
		}

	}
}
