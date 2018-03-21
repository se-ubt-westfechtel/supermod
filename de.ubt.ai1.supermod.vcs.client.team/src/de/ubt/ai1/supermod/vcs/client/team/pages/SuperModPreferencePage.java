/******************************************************************************
 * Copyright (c) 2018 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.vcs.client.team.pages;

import static de.ubt.ai1.supermod.service.generic.client.impl.DefaultResolutionPreferenceUtil.DEFAULTRES__CYCLIC_CONTAINMENT;
import static de.ubt.ai1.supermod.service.generic.client.impl.DefaultResolutionPreferenceUtil.DEFAULTRES__CYCLIC_FEATURE_TREE;
import static de.ubt.ai1.supermod.service.generic.client.impl.DefaultResolutionPreferenceUtil.DEFAULTRES__DANGLING_DEPENDENCY;
import static de.ubt.ai1.supermod.service.generic.client.impl.DefaultResolutionPreferenceUtil.DEFAULTRES__DANGLING_FEATURE;
import static de.ubt.ai1.supermod.service.generic.client.impl.DefaultResolutionPreferenceUtil.DEFAULTRES__DANGLING_GROUP;
import static de.ubt.ai1.supermod.service.generic.client.impl.DefaultResolutionPreferenceUtil.DEFAULTRES__DEPENDENCY_LINK_TARGET;
import static de.ubt.ai1.supermod.service.generic.client.impl.DefaultResolutionPreferenceUtil.DEFAULTRES__DISPLAY_NAME;
import static de.ubt.ai1.supermod.service.generic.client.impl.DefaultResolutionPreferenceUtil.DEFAULTRES__LEAST_RECENT;
import static de.ubt.ai1.supermod.service.generic.client.impl.DefaultResolutionPreferenceUtil.DEFAULTRES__LEAST_SPECIFIC;
import static de.ubt.ai1.supermod.service.generic.client.impl.DefaultResolutionPreferenceUtil.DEFAULTRES__MINE;
import static de.ubt.ai1.supermod.service.generic.client.impl.DefaultResolutionPreferenceUtil.DEFAULTRES__MOST_RECENT;
import static de.ubt.ai1.supermod.service.generic.client.impl.DefaultResolutionPreferenceUtil.DEFAULTRES__MOST_SPECIFIC;
import static de.ubt.ai1.supermod.service.generic.client.impl.DefaultResolutionPreferenceUtil.DEFAULTRES__MULTIPLE_GROUP_MEMBERSHIP;
import static de.ubt.ai1.supermod.service.generic.client.impl.DefaultResolutionPreferenceUtil.DEFAULTRES__NON_OPTIONAL_GROUPED_FEATURE;
import static de.ubt.ai1.supermod.service.generic.client.impl.DefaultResolutionPreferenceUtil.DEFAULTRES__OBJECT_CONTAINER;
import static de.ubt.ai1.supermod.service.generic.client.impl.DefaultResolutionPreferenceUtil.DEFAULTRES__ORDER;
import static de.ubt.ai1.supermod.service.generic.client.impl.DefaultResolutionPreferenceUtil.DEFAULTRES__PARENT_FEATURE;
import static de.ubt.ai1.supermod.service.generic.client.impl.DefaultResolutionPreferenceUtil.DEFAULTRES__RANDOM;
import static de.ubt.ai1.supermod.service.generic.client.impl.DefaultResolutionPreferenceUtil.DEFAULTRES__REMOTE_GROUP_MEMBERSHIP;
import static de.ubt.ai1.supermod.service.generic.client.impl.DefaultResolutionPreferenceUtil.DEFAULTRES__ROOT_FEATURE;
import static de.ubt.ai1.supermod.service.generic.client.impl.DefaultResolutionPreferenceUtil.DEFAULTRES__SINGLE_VALUED_STRUCTURAL_FEATURE_VALUE;
import static de.ubt.ai1.supermod.service.generic.client.impl.DefaultResolutionPreferenceUtil.DEFAULTRES__THEIR;
import static de.ubt.ai1.supermod.service.generic.client.impl.DefaultResolutionPreferenceUtil.SUPERMOD_PREFSTORE;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.ComboFieldEditor;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.preferences.ScopedPreferenceStore;

/**
 * The preference page for SuperMod currently contains an alternative choice of the default
 * resolution behavior for each product conflict that is default-resolvable. This behavior
 * is valid globally.
 * 
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>,
 * 			Johannes Schroepfer <Johannes.M.Schroepfer(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	2018-01-09
 */
public class SuperModPreferencePage
extends PreferencePage
implements IWorkbenchPreferencePage {
	
	private Group sequences, emfFiles, featureModels;
	
	private ComboFieldEditor orderEditor, objctEditor, ccontEditor, svsfvEditor, rootfEditor,
			partfEditor, cycftEditor, dispnEditor, mugrmEditor, regrmEditor, nopgfEditor,
			depltEditor, dangfEditor, danggEditor, dangdEditor;
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	@Override
	public void init(IWorkbench workbench) {
		setDescription("Default Product Conflict Resolution Strategies");
		setPreferenceStore(new ScopedPreferenceStore(InstanceScope.INSTANCE,
				SUPERMOD_PREFSTORE));
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.jface.preference.PreferencePage#createContents(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	protected Control createContents(Composite parent) {
		
		// Groups as containers for the field editors
		// Conflict groups are "Sequences", "EMF Models", and "Feature Model"
		sequences = new Group(parent, SWT.SHADOW_ETCHED_IN);
		sequences.setText("Sequences");
		sequences.setLayout(new GridLayout(2, false));
		emfFiles = new Group(parent, SWT.SHADOW_ETCHED_IN);
		emfFiles.setText("EMF Files");
		emfFiles.setLayout(new GridLayout(2, false));
		featureModels = new Group(parent, SWT.SHADOW_ETCHED_IN);
		featureModels.setText("Feature Models");
		featureModels.setLayout(new GridLayout(2, false));
		
		// The editors by conflict type
		// "Order"
		orderEditor = new ComboFieldEditor(DEFAULTRES__ORDER,
				"Order", new String[][] {
			{"Random", DEFAULTRES__RANDOM},
			{"Most Recent", DEFAULTRES__MOST_RECENT},
			{"Least Recent", DEFAULTRES__LEAST_RECENT},
			{"Mine", DEFAULTRES__MINE},
			{"Their", DEFAULTRES__THEIR},
			{"Most Specific", DEFAULTRES__MOST_SPECIFIC},
			{"Least Specific", DEFAULTRES__LEAST_SPECIFIC},
		}, sequences);
		orderEditor.setPage(this);
		orderEditor.setPreferenceStore(getPreferenceStore());
		orderEditor.load();
		
		// "Object Container"
		objctEditor = new ComboFieldEditor(DEFAULTRES__OBJECT_CONTAINER,
				"Object Container", new String[][] {
			{"Random", DEFAULTRES__RANDOM},
			{"Most Recent", DEFAULTRES__MOST_RECENT},
			{"Least Recent", DEFAULTRES__LEAST_RECENT},
			{"Mine", DEFAULTRES__MINE},
			{"Their", DEFAULTRES__THEIR},
			{"Most Specific", DEFAULTRES__MOST_SPECIFIC},
			{"Least Specific", DEFAULTRES__LEAST_SPECIFIC},
		}, emfFiles);
		objctEditor.setPage(this);
		objctEditor.setPreferenceStore(getPreferenceStore());
		objctEditor.load();
		
		// "Cyclic Containment"
		ccontEditor = new ComboFieldEditor(DEFAULTRES__CYCLIC_CONTAINMENT,
				"Cyclic Containment", new String[][] {
			{"Random", DEFAULTRES__RANDOM},
			{"Most Recent", DEFAULTRES__MOST_RECENT},
			{"Least Recent", DEFAULTRES__LEAST_RECENT},
			{"Mine", DEFAULTRES__MINE},
			{"Their", DEFAULTRES__THEIR},
			{"Most Specific", DEFAULTRES__MOST_SPECIFIC},
			{"Least Specific", DEFAULTRES__LEAST_SPECIFIC},
		}, emfFiles);
		ccontEditor.setPage(this);
		ccontEditor.setPreferenceStore(getPreferenceStore());
		ccontEditor.load();
		
		// "Single-Valued Structural Feature Value"
		svsfvEditor = new ComboFieldEditor(DEFAULTRES__SINGLE_VALUED_STRUCTURAL_FEATURE_VALUE,
				"Single-Valued Structural Feature Value", new String[][] {
			{"Random", DEFAULTRES__RANDOM},
			{"Most Recent", DEFAULTRES__MOST_RECENT},
			{"Least Recent", DEFAULTRES__LEAST_RECENT},
			{"Mine", DEFAULTRES__MINE},
			{"Their", DEFAULTRES__THEIR},
			{"Most Specific", DEFAULTRES__MOST_SPECIFIC},
			{"Least Specific", DEFAULTRES__LEAST_SPECIFIC},
		}, emfFiles);
		svsfvEditor.setPage(this);
		svsfvEditor.setPreferenceStore(getPreferenceStore());
		svsfvEditor.load();
		
		// "Root Feature"
		rootfEditor = new ComboFieldEditor(DEFAULTRES__ROOT_FEATURE,
				"Root Feature", new String[][] {
			{"Random", DEFAULTRES__RANDOM},
			{"Most Recent", DEFAULTRES__MOST_RECENT},
			{"Least Recent", DEFAULTRES__LEAST_RECENT},
			{"Mine", DEFAULTRES__MINE},
			{"Their", DEFAULTRES__THEIR},
		}, featureModels);
		rootfEditor.setPage(this);
		rootfEditor.setPreferenceStore(getPreferenceStore());
		rootfEditor.load();
		
		// "Parent Feature"
		partfEditor = new ComboFieldEditor(DEFAULTRES__PARENT_FEATURE,
				"Parent Feature", new String[][] {
			{"Random", DEFAULTRES__RANDOM},
			{"Most Recent", DEFAULTRES__MOST_RECENT},
			{"Least Recent", DEFAULTRES__LEAST_RECENT},
			{"Mine", DEFAULTRES__MINE},
			{"Their", DEFAULTRES__THEIR},
		}, featureModels);
		partfEditor.setPage(this);
		partfEditor.setPreferenceStore(getPreferenceStore());
		partfEditor.load();
		
		// "Cyclic Feature Tree"
		cycftEditor = new ComboFieldEditor(DEFAULTRES__CYCLIC_FEATURE_TREE,
				"Cyclic Feature Tree", new String[][] {
			{"Random", DEFAULTRES__RANDOM},
			{"Most Recent", DEFAULTRES__MOST_RECENT},
			{"Least Recent", DEFAULTRES__LEAST_RECENT},
			{"Mine", DEFAULTRES__MINE},
			{"Their", DEFAULTRES__THEIR},
		}, featureModels);
		cycftEditor.setPage(this);
		cycftEditor.setPreferenceStore(getPreferenceStore());
		cycftEditor.load();
		
		// "Display Name"
		dispnEditor = new ComboFieldEditor(DEFAULTRES__DISPLAY_NAME,
				"Display Name", new String[][] {
			{"Random", DEFAULTRES__RANDOM},
			{"Most Recent", DEFAULTRES__MOST_RECENT},
			{"Least Recent", DEFAULTRES__LEAST_RECENT},
			{"Mine", DEFAULTRES__MINE},
			{"Their", DEFAULTRES__THEIR},
		}, featureModels);
		dispnEditor.setPage(this);
		dispnEditor.setPreferenceStore(getPreferenceStore());
		dispnEditor.load();
		
		// "Multiple Group Membership"
		mugrmEditor = new ComboFieldEditor(DEFAULTRES__MULTIPLE_GROUP_MEMBERSHIP,
				"Multiple Group Membership", new String[][] {
			{"Random", DEFAULTRES__RANDOM},
			{"Most Recent", DEFAULTRES__MOST_RECENT},
			{"Least Recent", DEFAULTRES__LEAST_RECENT},
			{"Mine", DEFAULTRES__MINE},
			{"Their", DEFAULTRES__THEIR},
		}, featureModels);
		mugrmEditor.setPage(this);
		mugrmEditor.setPreferenceStore(getPreferenceStore());
		mugrmEditor.load();
		
		// "Remote Group Membership"
		regrmEditor = new ComboFieldEditor(DEFAULTRES__REMOTE_GROUP_MEMBERSHIP,
				"Remote Group Membership", new String[][] {
			{"Random", DEFAULTRES__RANDOM},
			{"Most Recent", DEFAULTRES__MOST_RECENT},
			{"Least Recent", DEFAULTRES__LEAST_RECENT},
			{"Mine", DEFAULTRES__MINE},
			{"Their", DEFAULTRES__THEIR},
		}, featureModels);
		regrmEditor.setPage(this);
		regrmEditor.setPreferenceStore(getPreferenceStore());
		regrmEditor.load();
		
		// "Non-Optional Grouped Feature"
		nopgfEditor = new ComboFieldEditor(DEFAULTRES__NON_OPTIONAL_GROUPED_FEATURE,
				"Non-Optional Grouped Feature", new String[][] {
			{"Random", DEFAULTRES__RANDOM},
			{"Most Recent", DEFAULTRES__MOST_RECENT},
			{"Least Recent", DEFAULTRES__LEAST_RECENT},
			{"Mine", DEFAULTRES__MINE},
			{"Their", DEFAULTRES__THEIR},
		}, featureModels);
		nopgfEditor.setPage(this);
		nopgfEditor.setPreferenceStore(getPreferenceStore());
		nopgfEditor.load();
		
		// "Dependency Link Target
		depltEditor = new ComboFieldEditor(DEFAULTRES__DEPENDENCY_LINK_TARGET,
				"Dependency Link Target", new String[][] {
			{"Random", DEFAULTRES__RANDOM},
			{"Most Recent", DEFAULTRES__MOST_RECENT},
			{"Least Recent", DEFAULTRES__LEAST_RECENT},
			{"Mine", DEFAULTRES__MINE},
			{"Their", DEFAULTRES__THEIR},
		}, featureModels);
		depltEditor.setPage(this);
		depltEditor.setPreferenceStore(getPreferenceStore());
		depltEditor.load();
		
		// "Dangling Feature"
		dangfEditor = new ComboFieldEditor(DEFAULTRES__DANGLING_FEATURE,
				"Dangling Feature", new String[][] {
			{"Random", DEFAULTRES__RANDOM},
			{"Most Recent", DEFAULTRES__MOST_RECENT},
			{"Least Recent", DEFAULTRES__LEAST_RECENT},
			{"Mine", DEFAULTRES__MINE},
			{"Their", DEFAULTRES__THEIR},
		}, featureModels);
		dangfEditor.setPage(this);
		dangfEditor.setPreferenceStore(getPreferenceStore());
		dangfEditor.load();
		
		// "Dangling Group"
		danggEditor = new ComboFieldEditor(DEFAULTRES__DANGLING_GROUP,
				"Dangling Group", new String[][] {
			{"Random", DEFAULTRES__RANDOM},
			{"Most Recent", DEFAULTRES__MOST_RECENT},
			{"Least Recent", DEFAULTRES__LEAST_RECENT},
			{"Mine", DEFAULTRES__MINE},
			{"Their", DEFAULTRES__THEIR},
		}, featureModels);
		danggEditor.setPage(this);
		danggEditor.setPreferenceStore(getPreferenceStore());
		danggEditor.load();
		
		// "Dangling Dependency"
		dangdEditor = new ComboFieldEditor(DEFAULTRES__DANGLING_DEPENDENCY,
				"Dangling Dependency", new String[][] {
			{"Random", DEFAULTRES__RANDOM},
			{"Most Recent", DEFAULTRES__MOST_RECENT},
			{"Least Recent", DEFAULTRES__LEAST_RECENT},
			{"Mine", DEFAULTRES__MINE},
			{"Their", DEFAULTRES__THEIR},
		}, featureModels);
		dangdEditor.setPage(this);
		dangdEditor.setPreferenceStore(getPreferenceStore());
		dangdEditor.load();
		
		return null;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.jface.preference.PreferencePage#performDefaults()
	 */
	@Override
	protected void performDefaults() {
		
		orderEditor.loadDefault();
		objctEditor.loadDefault();
		ccontEditor.loadDefault();
		svsfvEditor.loadDefault();
		rootfEditor.loadDefault();
		partfEditor.loadDefault();
		cycftEditor.loadDefault();
		dispnEditor.loadDefault();
		mugrmEditor.loadDefault();
		regrmEditor.loadDefault();
		nopgfEditor.loadDefault();
		depltEditor.loadDefault();
		dangfEditor.loadDefault();
		danggEditor.loadDefault();
		dangdEditor.loadDefault();
		
		super.performDefaults();
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.jface.preference.PreferencePage#performOk()
	 */
	@Override
	public boolean performOk() {
		
		orderEditor.store();
		objctEditor.store();
		ccontEditor.store();
		svsfvEditor.store();
		rootfEditor.store();
		partfEditor.store();
		cycftEditor.store();
		dispnEditor.store();
		mugrmEditor.store();
		regrmEditor.store();
		nopgfEditor.store();
		depltEditor.store();
		dangfEditor.store();
		danggEditor.store();
		dangdEditor.store();
		
		return true;
	}
}
