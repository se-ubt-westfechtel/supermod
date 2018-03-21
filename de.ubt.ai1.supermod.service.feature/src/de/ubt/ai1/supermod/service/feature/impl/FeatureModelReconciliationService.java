/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.feature.impl;

import de.ubt.ai1.supermod.mm.core.AndExpr;
import de.ubt.ai1.supermod.mm.core.BiconditionalExpr;
import de.ubt.ai1.supermod.mm.core.BigNandExpr;
import de.ubt.ai1.supermod.mm.core.BigOrExpr;
import de.ubt.ai1.supermod.mm.core.BinaryExpr;
import de.ubt.ai1.supermod.mm.core.DefaultBinding;
import de.ubt.ai1.supermod.mm.core.ImpliesExpr;
import de.ubt.ai1.supermod.mm.core.Invariant;
import de.ubt.ai1.supermod.mm.core.NandExpr;
import de.ubt.ai1.supermod.mm.core.NegExpr;
import de.ubt.ai1.supermod.mm.core.Option;
import de.ubt.ai1.supermod.mm.core.OptionExpr;
import de.ubt.ai1.supermod.mm.core.OptionRef;
import de.ubt.ai1.supermod.mm.core.Preference;
import de.ubt.ai1.supermod.mm.core.SuperModCoreFactory;
import de.ubt.ai1.supermod.mm.core.Tristate;
import de.ubt.ai1.supermod.mm.core.VersionDimension;
import de.ubt.ai1.supermod.mm.feature.ChildRelationship;
import de.ubt.ai1.supermod.mm.feature.Elimination;
import de.ubt.ai1.supermod.mm.feature.Feature;
import de.ubt.ai1.supermod.mm.feature.FeatureDependency;
import de.ubt.ai1.supermod.mm.feature.FeatureExclusion;
import de.ubt.ai1.supermod.mm.feature.FeatureGroup;
import de.ubt.ai1.supermod.mm.feature.FeatureModel;
import de.ubt.ai1.supermod.mm.feature.FeatureRequirement;
import de.ubt.ai1.supermod.mm.feature.GroupMembership;
import de.ubt.ai1.supermod.mm.feature.OrFeatureGroup;
import de.ubt.ai1.supermod.mm.feature.RootRelationship;
import de.ubt.ai1.supermod.service.IVersionDimensionReconciliationService;

/**
 * An implementation of the version dimension reconciliation service specific
 * to the version dimension of feature models. It ensures that the semantics
 * expressed by a feature model is transferred to propositional logic by
 * creating, modifying or deleting corresponding elements of the low-level rule
 * base, in particular options and invariants.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	28.10.2014
 */
public class FeatureModelReconciliationService 
implements IVersionDimensionReconciliationService{

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.
	 * IVersionDimensionReconciliationService#reconcileVersionDimension(
	 * de.ubt.ai1.supermod.mm.core.VersionDimension)
	 */
	@Override
	public void reconcileVersionDimension(VersionDimension vd) {
		FeatureModel fm = (FeatureModel) vd;
		for (Feature f : fm.getFeatures()) {
			reconcileFeature(f);
		}
		for (RootRelationship rr : fm.getRoots()) {
			reconcileRootRelationship(rr);
		}
		for (Feature f : fm.getFeatures()) {
			for (ChildRelationship cr : f.getChildren()) {
				reconcileChildRelationship(cr);
			}
			for (FeatureGroup fg : f.getGroups()) {
				reconcileFeatureGroup(fg);
			}
			for (FeatureDependency fd : f.getOutgoingDependencies()) {
				reconcileFeatureDependency(fd);
			}
			for (Elimination elim : f.getEliminations()) {
				reconcileElimination(elim);
			}
		}
		
	}

	/**
	 * Ensures that the semantics of a specific feature is expressed by
	 * low-level elements as follows:
	 * <ul>
	 * 	<li> each feature <code>f</code> is mapped to a feature option
	 * </ul>
	 *
	 * @param f
	 */
	private void reconcileFeature(Feature f) {
		Option fo = f.getFeatureOption();
		if (fo == null) {
			fo = SuperModCoreFactory.eINSTANCE.createOption();
			f.setFeatureOption(fo);
		}
		String id = "feature_o_" + f.getUuid();
		if (!id.equals(fo.getName())) {
			fo.setName(id);
		}

	}

	/**
	 * Ensures that the semantics of a specific root relationship is expressed
	 * by low-level elements as follows:
	 * <ul>
	 *  <li> each root feature <code>r</code> defines an invariant of the form
	 *  <code>r</code> which requires selection in each configuration.</li>
	 *  <li> each root feature <code>r</code> defines a default binding of the
	 *  form <code>(r, TRUE)</code> which enforces selection in each 
	 *  configuration.</li>
	 * </ul>
	 *
	 * @param rr
	 */
	private void reconcileRootRelationship(RootRelationship rr) {
		Option ro = rr.getFeature().getFeatureOption();
		
		Invariant ri = rr.getRootInvariant();
		if (ri == null) {
			ri = SuperModCoreFactory.eINSTANCE.createInvariant();
			rr.setRootInvariant(ri);
		}
		OptionRef roRef = SuperModCoreFactory.eINSTANCE.createOptionRef();
		roRef.setOption(ro);
		if (!roRef.equals(ri.getOptionExpr())) {
			ri.setOptionExpr(roRef);
		}
		String iid = "root_i_" + rr.getFeature().getUuid();
		if (!iid.equals(ri.getName())) {
			ri.setName(iid);
		}
		
		DefaultBinding rd = rr.getRootDefault();
		if (rd == null) {
			rd = SuperModCoreFactory.eINSTANCE.createDefaultBinding();
			rr.setRootDefault(rd);
		}
		if (!ro.equals(rd.getOption())) {
			rd.setOption(ro);
		}
		if (!Tristate.TRUE.equals(rd.getState())) {
			rd.setState(Tristate.TRUE);
		}
		String did = "root_d_" + rr.getFeature().getUuid();
		if (!did.equals(rd.getName())) {
			rd.setName(did);
		}		
	}

	/**
	 * Ensures that the semantics of a specific parent-child relationship is
	 * expressed by low-level elements as follows:
	 * <ul>
	 *  <li> each <emph>optional</emph> child feature <code>c</code> defines an
	 *  invariant of the form <code>c => p</code> which requires its parent
	 *  feature <code>p</code> to be selected.</li>
	 *  <li> each <emph>mandatory</emph> child feature <code>c</code> defines an
	 *  invariant of the form <code>c <=> p</code> additionally makes the parent
	 *  feature <code>p</code> require <code>p</code>.</li>
	 *  <li> each <emph>mandatory</emph> child feature <code>c</code> defines a
	 *  preference of the form <code>(c, p)</code> to enforce the invariant
	 *  from above.</li>
	 * </ul>
	 * 
	 * @param cr
	 */
	private void reconcileChildRelationship(ChildRelationship cr) {
		Option po = cr.getParent().getFeatureOption();
		Option co = cr.getChild().getFeatureOption();
		
		Invariant pi = cr.getParentInvariant();
		if (pi == null) {
			pi = SuperModCoreFactory.eINSTANCE.createInvariant();
			cr.setParentInvariant(pi);
		}
		BinaryExpr piImp = null;
		if (cr.getChild().getMandatory() == null) {
			piImp = SuperModCoreFactory.eINSTANCE.createImpliesExpr();
		}
		else {
			piImp = SuperModCoreFactory.eINSTANCE.createBiconditionalExpr();
		}
		OptionRef coRefI = SuperModCoreFactory.eINSTANCE.createOptionRef();
		coRefI.setOption(co);
		piImp.setLeft(coRefI);
		OptionRef poRefI = SuperModCoreFactory.eINSTANCE.createOptionRef();
		poRefI.setOption(po);
		piImp.setRight(poRefI);
		if (!piImp.equals(pi.getOptionExpr())) {			
			pi.setOptionExpr(piImp);
		}
		String iid = "child_i_" + cr.getParent().getUuid() +
				"_" + cr.getChild().getUuid();
		if (!iid.equals(pi.getName())) {
			pi.setName(iid);
		}
		
		if (cr.getChild().getMandatory() == null) {
			cr.setParentPreference(null);
		}
		else {
			Preference pp = cr.getParentPreference();
			if (pp == null) {
				pp = SuperModCoreFactory.eINSTANCE.createPreference();
				cr.setParentPreference(pp);
			}
			if (!co.equals(pp.getOption())) {
				pp.setOption(co);
			}
			OptionRef poRefP = SuperModCoreFactory.eINSTANCE.createOptionRef();
			poRefP.setOption(po);
			if (!poRefP.equals(pp.getOptionExpr())) {
				pp.setOptionExpr(poRefP);
			}
			String pid = "child_p_" + cr.getParent().getUuid() +
					"_" + cr.getChild().getUuid();
			if (!pid.equals(pp.getName())) {
				pp.setName(pid);
			}
		}
	}

	/**
	 * Ensures that the semantics of a specific feature group (or, xor) 
	 * is expressed by low-level elements as follows:
	 * <ul>
	 *  <li> in case of an or-group, at least one of the children
	 *  <code>c1 ... cn</code> must be selected in case the parent 
	 *  <code>p</code> is selected: <code>p <=> c1 | ... | cn</code>.</li>
	 *  <li> in case of a xor-group, at least one of the children
	 *  <code>c1 ... cn</code> must be selected in case the parent 
	 *  <code>p</code> is selected. Furthermore, at most one child may be
	 *  selected: <code>(p <=> c1 | ... | cn) & (c1 (x) ... (x) cn)</code>.</li>
	 * </ul>
	 * 
	 * @param fg
	 */
	private void reconcileFeatureGroup(FeatureGroup fg) {
		Option po = fg.getParentFeature().getFeatureOption();
		
		Invariant gi = fg.getGroupInvariant();
		if (gi == null) {
			gi = SuperModCoreFactory.eINSTANCE.createInvariant();
			fg.setGroupInvariant(gi);			
		}
		OptionRef poRef = SuperModCoreFactory.eINSTANCE.createOptionRef();
		poRef.setOption(po);

		BigOrExpr bigOrExpr = SuperModCoreFactory.eINSTANCE.createBigOrExpr();		
		for (GroupMembership gm : fg.getGroupedFeatures()) {
			Feature f = gm.getGroupedFeature();
			OptionRef foRef = SuperModCoreFactory.eINSTANCE.createOptionRef();
			foRef.setOption(f.getFeatureOption());
			bigOrExpr.getChildren().add(foRef);
		}
		
		BiconditionalExpr fgExpr = SuperModCoreFactory.eINSTANCE.
				createBiconditionalExpr();
		fgExpr.setLeft(poRef);
		fgExpr.setRight(bigOrExpr);
		
		OptionExpr invExpr = null;
		if (fg instanceof OrFeatureGroup) {
			invExpr = fgExpr;
		}
		else {
			AndExpr and = SuperModCoreFactory.eINSTANCE.createAndExpr();
			and.setLeft(fgExpr);
			BigNandExpr bigNandExpr = SuperModCoreFactory.eINSTANCE
					.createBigNandExpr();		
			for (GroupMembership gm : fg.getGroupedFeatures()) {
				Feature f = gm.getGroupedFeature();
				OptionRef foRef = SuperModCoreFactory.eINSTANCE
						.createOptionRef();
				foRef.setOption(f.getFeatureOption());
				bigNandExpr.getChildren().add(foRef);
			}
			and.setRight(bigNandExpr);
			invExpr = and;
		}
		
		if (!invExpr.equals(gi.getOptionExpr())) {			
			gi.setOptionExpr(invExpr);
		}
		String gid = fg instanceof OrFeatureGroup ? "OR" : "XOR";
		gid += "_group_i_" + fg.getUuid();
		if (!gid.equals(gi.getName())) {
			gi.setName(gid);
		}		
	}

	/**
	 * Ensures that the semantics of a specific feature dependency (requires or 
	 * excludes) is expressed by low-level elements as follows:
	 * <ul>
	 *  <li> in case a feature <code>f1</code> requires <code>f2</code>, an
	 *  invariant of the form <code>f1 => f2</code> is defined.</li>
	 *  <li> in case a feature <code>f2</code> excludes <code>f2</code>, an
	 *  invariant of the form </code>!(f1 & f2)</code> is defined.</li>
	 * </ul>
	 * 
	 * @param fd
	 */
	private void reconcileFeatureDependency(FeatureDependency fd) {
		Option so = fd.getSourceFeature().getFeatureOption();
		Option to = fd.getTargetFeature().getFeatureOption();
		
		Invariant di = fd.getDependencyInvariant();
		if (di == null) {
			di = SuperModCoreFactory.eINSTANCE.createInvariant();
			fd.setDependencyInvariant(di);
		}
		OptionExpr diExpr = null;
		OptionRef soRef = SuperModCoreFactory.eINSTANCE.createOptionRef();
		soRef.setOption(so);
		OptionRef toRef = SuperModCoreFactory.eINSTANCE.createOptionRef();
		toRef.setOption(to);
		if (fd instanceof FeatureRequirement) {
			ImpliesExpr reqImp = SuperModCoreFactory.eINSTANCE
					.createImpliesExpr();
			reqImp.setLeft(soRef);
			reqImp.setRight(toRef);
			diExpr = reqImp;
		}
		else if (fd instanceof FeatureExclusion) {
			NandExpr reqNand = SuperModCoreFactory.eINSTANCE.createNandExpr();
			reqNand.setLeft(soRef);
			reqNand.setRight(toRef);
			diExpr = reqNand;
		}
		if (!diExpr.equals(di.getOptionExpr())) {			
			di.setOptionExpr(diExpr);
		}
		String did = fd instanceof FeatureRequirement ? "req" : "exc";
		did += "_exc_i_" + fd.getUuid();
		if (!did.equals(di.getName())) {
			di.setName(did);
		}
	}

	/**
	 * Ensures that the semantics of an elimination hint attached to a feature
	 * <code>f</code> is expressed by low-level elements as follows:
	 * <ul>
	 *  <li> in the case of a positive elimination, an invariant of the form
	 *  <code>f</code> and a default binding of the form <code>(f, TRUE)</code> 
	 *  are defined.</li>
	 *  <li> in the case of a negative elimination, an invariant of the form
	 *  <code>!f</code> and a default binding of the form 
	 *  <code>(f, FALSE)</code> are defined.</li>
	 * </ul>
	 *
	 * @param elim
	 */
	private void reconcileElimination(Elimination elim) {
		Option fo = elim.getFeature().getFeatureOption();
		
		Invariant ei = elim.getEliminationInvariant();
		if (ei == null) {
			ei = SuperModCoreFactory.eINSTANCE.createInvariant();
			elim.setEliminationInvariant(ei);
		}		
		OptionExpr eiExpr = null;
		OptionRef foRef = SuperModCoreFactory.eINSTANCE.createOptionRef();
		foRef.setOption(fo);
		String eId = "elim_";
		switch (elim.getDefaultSelection()) {
		case TRUE: {
			eiExpr = foRef;
			eId += "true";
		} break;
		case FALSE: {
			NegExpr negFoRef = SuperModCoreFactory.eINSTANCE.createNegExpr();
			negFoRef.setNeg(foRef);
			eiExpr = negFoRef;
			eId += "false";
		} break;
		default:
		}		
		if (!eiExpr.equals(ei.getOptionExpr())) {
			ei.setOptionExpr(eiExpr);
		}
		String eiId = eId + "_i_" + elim.getFeature().getUuid();
		if (!eiId.equals(ei.getName())) {
			ei.setName(eiId);
		}
		
		DefaultBinding ed = elim.getEliminationDefault();
		if (ed == null) {
			ed = SuperModCoreFactory.eINSTANCE.createDefaultBinding();
			elim.setEliminationDefault(ed);
		}		
		if (!fo.equals(ed.getOption())) {
			ed.setOption(fo);
		}
		if (!elim.getDefaultSelection().equals(ed.getState())) {
			ed.setState(elim.getDefaultSelection());
		}
		String edId = eId + "_d_" + elim.getFeature().getUuid();
		if (!edId.equals(ed.getName())) {
			ed.setName(edId);
		}

	}
	
}
