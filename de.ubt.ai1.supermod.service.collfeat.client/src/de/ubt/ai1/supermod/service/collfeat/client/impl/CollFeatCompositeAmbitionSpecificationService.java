/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.collfeat.client.impl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.change.Change;
import de.ubt.ai1.supermod.mm.change.ChangeDimension;
import de.ubt.ai1.supermod.mm.change.ChangeSet;
import de.ubt.ai1.supermod.mm.change.SuperModChangeFactory;
import de.ubt.ai1.supermod.mm.change.util.ChangeSpaceUtil;
import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.mm.collab.CollaborativeRevisionDimension;
import de.ubt.ai1.supermod.mm.core.Option;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.SuperModCoreFactory;
import de.ubt.ai1.supermod.mm.core.Tristate;
import de.ubt.ai1.supermod.mm.core.VersionSpace;
import de.ubt.ai1.supermod.mm.feature.FeatureModel;
import de.ubt.ai1.supermod.mm.feature.util.FeatureModelUtil;
import de.ubt.ai1.supermod.service.IVersionDimensionReconciliationService;
import de.ubt.ai1.supermod.service.change.IChangeDimensionProvider;
import de.ubt.ai1.supermod.service.client.IAmbitionSpecificationService;
import de.ubt.ai1.supermod.service.client.ICompositeAmbitionSpecificationService;
import de.ubt.ai1.supermod.service.collab.Collab;
import de.ubt.ai1.supermod.service.collab.ICollabDimensionProvider;
import de.ubt.ai1.supermod.service.feature.Feature;
import de.ubt.ai1.supermod.service.feature.IFeatureVersionDimensionProvider;
import de.ubt.ai1.supermod.service.feature.client.ISingleVersionFeatureModelDescriptorProvider;

/**
 * An implementation of the composite ambition specification interface which
 * uses a collab and a feature ambition specification service in order to
 * specify a hybrid, composite ambition. A user-specified ambition 
 * <code>a</code>, which refers to the revision and the feature dimension, is
 * replaced by a change option under which the change is effectively performed. 
 * In particular, the four following components are added to the change
 * dimension:
 * <ol>
 *  <li>a change option <code>o</code>,</li>
 *  <li>a change invariant <code>o => a</code>,</li>
 *  <li>a change preference <code>(o, a)</code>.</li>
 * </ol>
 * The returned ambition is <code>a' = o</code>.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	28.10.2015
 */
public class CollFeatCompositeAmbitionSpecificationService
implements ICompositeAmbitionSpecificationService {

	@Inject
	private ICollabDimensionProvider collabDimensionProvider;
	
	@Inject
	private IFeatureVersionDimensionProvider featureModelProvider;
	
	@Inject
	private IChangeDimensionProvider changeDimensionProvider;
	
	@Inject
	@Collab
	private IAmbitionSpecificationService revisionSpecificationService;
	
	@Inject
	@Feature
	private IAmbitionSpecificationService featureSpecificationService;
	
	@Inject
	@de.ubt.ai1.supermod.service.change.Change
	private IAmbitionSpecificationService changeSpecificationService;
	
	@Inject
	@Feature
	private IVersionDimensionReconciliationService featureModelReconService;
	
	@Inject
	private ISingleVersionFeatureModelDescriptorProvider
	featureModelDescProvider;

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.
	 * ICompositeAmbitionSpecificationService
	 * #specifyCompositeAmbition(de.ubt.ai1.supermod.mm.core.VersionSpace, 
	 * de.ubt.ai1.supermod.mm.core.OptionBinding, 
	 * de.ubt.ai1.supermod.mm.core.OptionBinding)
	 */
	@Override
	public OptionBinding specifyCompositeAmbition(LocalRepository repo,
			OptionBinding compositeChoice, OptionBinding recordedAmbition,
			OptionBinding proposedCompositeAmbition) {
		VersionSpace vs = repo.getVersionSpace();
		int tid = repo.getWriteTransactionId();
		
		CollaborativeRevisionDimension revDim = collabDimensionProvider
				.getCollabDimension(vs);
		FeatureModel featureModel = featureModelProvider
				.getFeatureDimension(vs);
		ChangeDimension changeDim = changeDimensionProvider
				.getChangeDimension(vs);
		
		// filter choice for revision and logical dimension.
		OptionBinding revChoice = ChangeSpaceUtil.filterBinding(
				compositeChoice, revDim);
		OptionBinding featChoice = ChangeSpaceUtil.filterBinding(
				compositeChoice, featureModel);
		
		// filter proposed ambitions.
		OptionBinding revPropAmb = ChangeSpaceUtil.filterBinding(
				proposedCompositeAmbition, revDim);
		OptionBinding logPropAmb = ChangeSpaceUtil.filterBinding(
				proposedCompositeAmbition, featureModel);
		
		// retrieve the current revision of the feature model.
		LocalRepository lr = (LocalRepository) 
				featureModel.getVersionSpace().getRepository();
		FeatureModel localFeatureModel =
				featureModelDescProvider.getSingleVersionFeatureModelDescriptor(
				lr.getLocalDescriptor()).getFeatureModel();
		featureModelReconService.reconcileVersionDimension(localFeatureModel);
		OptionBinding localFeatChoice = FeatureModelUtil
				.mapFeatureConfiguration(featChoice, featureModel,
						localFeatureModel, false);
		OptionBinding localPropAmb = FeatureModelUtil.mapFeatureConfiguration(
				logPropAmb, featureModel, localFeatureModel, false);
		OptionBinding localRecAmb = FeatureModelUtil.mapFeatureConfiguration(
				recordedAmbition, featureModel, localFeatureModel, false);
		
		// let the user specify ambitions on expanded choice / 
		// ambition proposal.
		OptionBinding revisionAmbition = revisionSpecificationService
				.specifyAmbition(revDim, revChoice, null, revPropAmb);
		if (revisionAmbition == null) {
			revisionSpecificationService.undoAmbitionSpecification(revDim, 
					revisionAmbition);
			return null;
		}
		
		OptionBinding localFeatAmb = featureSpecificationService
				.specifyAmbition(localFeatureModel, localFeatChoice, 
						localRecAmb, localPropAmb);
		if (localFeatAmb == null) {
			featureSpecificationService.undoAmbitionSpecification(featureModel, 
					localFeatAmb);
			revisionSpecificationService.undoAmbitionSpecification(revDim, 
					revisionAmbition);
			return null;
		}
		
		OptionBinding featureAmbition = FeatureModelUtil
				.mapFeatureConfiguration(localFeatAmb, 
						localFeatureModel, featureModel, false);
		OptionBinding effectiveAmbition = SuperModCoreFactory
				.eINSTANCE.createOptionBinding();
		effectiveAmbition.getBoundOptions().putAll(
				revisionAmbition.getBoundOptions());
		effectiveAmbition.getBoundOptions().putAll(
				featureAmbition.getBoundOptions());		

		// create a change set.
		ChangeSet cs = SuperModChangeFactory.eINSTANCE.createChangeSet();
		cs.setUuid(EcoreUtil.generateUUID());
		cs.setTransactionId(tid);
		
		// add the temporal change.
		OptionBinding temporalChangeOb = changeSpecificationService
				.specifyAmbition(changeDim, null, null, revisionAmbition);
		Change temporalChange = (Change) temporalChangeOb.getBoundOptions()
				.get(0).getKey().getHighLevelConcept();
		temporalChange.setTransactionId(tid);
		cs.getChanges().add(temporalChange);
		
		// add the effective (temporal + logical) change.
		OptionBinding effectiveChangeOb = changeSpecificationService
				.specifyAmbition(changeDim, null, null, effectiveAmbition);
		Change effectiveChange = (Change) effectiveChangeOb.getBoundOptions()
				.get(0).getKey().getHighLevelConcept();
		effectiveChange.setTransactionId(tid);
		cs.getChanges().add(effectiveChange);
		
		// add the change set to the dimension.
		changeDim.getChangeSets().add(cs);
		
		// the returned option binding binds the effective change option to the
		// value TRUE.
		return effectiveChangeOb;
	}	

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.
	 * ICompositeAmbitionSpecificationService#undoAmbitionSpecification(
	 * de.ubt.ai1.supermod.mm.core.VersionSpace, 
	 * de.ubt.ai1.supermod.mm.core.OptionBinding)
	 */
	@Override
	public void undoCompositeAmbitionSpecification(LocalRepository repo,
			OptionBinding effectiveChangeOb) {
		VersionSpace vs = repo.getVersionSpace();
		CollaborativeRevisionDimension revDim = collabDimensionProvider
				.getCollabDimension(vs);
		ChangeDimension changeDim = changeDimensionProvider
				.getChangeDimension(vs);
		
		// re-construct temporal change binding.
		OptionBinding temporalChangeOb = SuperModCoreFactory.eINSTANCE
				.createOptionBinding();
		Change userChange = (Change) effectiveChangeOb.getBoundOptions().get(0)
				.getKey().getHighLevelConcept();
		Change temporalChange = null;
		for (Change c : userChange.getChangeSet().getChanges()) {
			if (c != userChange) {
				temporalChange = c;
				Option temporalChangeOption = c.getChangeOption();
				temporalChangeOb.bind(temporalChangeOption, Tristate.TRUE);
				break;
			}
		}		
		
		// re-construct revision ambition.
		OptionBinding revAmb = SuperModCoreFactory.eINSTANCE
				.createOptionBinding();
		for (Option o : temporalChange.getChangePreference().getOptionExpr()
				.getReferencedOptions()) {
			if (o.getDimension().equals(revDim)) {
				revAmb.bind(o, Tristate.TRUE);
			}
		}
		
		// undo the respective changes.
		revisionSpecificationService.undoAmbitionSpecification(revDim, revAmb);
		changeSpecificationService.undoAmbitionSpecification(changeDim, 
				effectiveChangeOb);
		changeSpecificationService.undoAmbitionSpecification(changeDim, 
				temporalChangeOb);
	}

}
