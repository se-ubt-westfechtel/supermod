/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.generic.client;

import com.google.inject.AbstractModule;

import de.ubt.ai1.supermod.service.client.IAmbitionCorrectionService;
import de.ubt.ai1.supermod.service.client.IClonePostProcessor;
import de.ubt.ai1.supermod.service.client.ICompositeAmbitionAndChoiceSpecificationService;
import de.ubt.ai1.supermod.service.client.IDefaultResolver;
import de.ubt.ai1.supermod.service.client.ILocalAmbitionInitializationService;
import de.ubt.ai1.supermod.service.client.ILocalChoiceInitializationService;
import de.ubt.ai1.supermod.service.client.ILocalMetadataRemovalService;
import de.ubt.ai1.supermod.service.client.ILocalMetadataAdditionService;
import de.ubt.ai1.supermod.service.client.ILocalRepositoryInitializationService;
import de.ubt.ai1.supermod.service.client.IProductConflictReporter;
import de.ubt.ai1.supermod.service.client.IPullPostProcessor;
import de.ubt.ai1.supermod.service.client.IPullPreProcessor;
import de.ubt.ai1.supermod.service.client.IPushPostProcessor;
import de.ubt.ai1.supermod.service.client.IPushPreProcessor;
import de.ubt.ai1.supermod.service.client.ISharePostProcessor;
import de.ubt.ai1.supermod.service.client.IVersionLabellingService;
import de.ubt.ai1.supermod.service.client.IVisibilityForestInitializationService;
import de.ubt.ai1.supermod.service.client.IWriteSetAffectedElementsCalculator;
import de.ubt.ai1.supermod.service.client.IWriteSetAnalysisService;
import de.ubt.ai1.supermod.service.client.IWriteSetAssignmentService;
import de.ubt.ai1.supermod.service.client.IWriteSetConflictReporter;
import de.ubt.ai1.supermod.service.client.IWriteSetPostProcessor;
import de.ubt.ai1.supermod.service.generic.client.impl.GenericCompositeAmbitionAndChoiceSpecificationService;
import de.ubt.ai1.supermod.service.generic.client.impl.GenericDialogProductConflictReporter;
import de.ubt.ai1.supermod.service.generic.client.impl.GenericDialogWriteSetConflictReporter;
import de.ubt.ai1.supermod.service.generic.client.impl.GenericIdleClonePostProcessor;
import de.ubt.ai1.supermod.service.generic.client.impl.GenericIdlePullPostProcessor;
import de.ubt.ai1.supermod.service.generic.client.impl.GenericIdlePullPreProcessor;
import de.ubt.ai1.supermod.service.generic.client.impl.GenericIdlePushPostProcessor;
import de.ubt.ai1.supermod.service.generic.client.impl.GenericIdlePushPreProcessor;
import de.ubt.ai1.supermod.service.generic.client.impl.GenericIdleSharePostProcessor;
import de.ubt.ai1.supermod.service.generic.client.impl.GenericLocalAmbitionInitializationService;
import de.ubt.ai1.supermod.service.generic.client.impl.GenericLocalChoiceInitializationService;
import de.ubt.ai1.supermod.service.generic.client.impl.GenericLocalMetadataRemovalService;
import de.ubt.ai1.supermod.service.generic.client.impl.GenericLocalMetadataAdditionService;
import de.ubt.ai1.supermod.service.generic.client.impl.GenericLocalRepositoryInitializationService;
import de.ubt.ai1.supermod.service.generic.client.impl.GenericSingleWriteSetAssignmentService;
import de.ubt.ai1.supermod.service.generic.client.impl.GenericSuppressiveAmbitionCorrectionService;
import de.ubt.ai1.supermod.service.generic.client.impl.GenericTransactionalWriteSetPostProcessor;
import de.ubt.ai1.supermod.service.generic.client.impl.GenericVersionLabellingService;
import de.ubt.ai1.supermod.service.generic.client.impl.GenericVisibilityForestInitializationService;
import de.ubt.ai1.supermod.service.generic.client.impl.GenericWriteSetAffectedElementsCalculator;
import de.ubt.ai1.supermod.service.generic.client.impl.GenericWriteSetAnalysisService;
import de.ubt.ai1.supermod.service.generic.client.impl.PseudoRandomDefaultResolver;

/**
 * Guice module which binds a sub-set of the SuperMod client service interfaces 
 * specified in the package {@link de.ubt.ai1.supermod.service.client} to 
 * generic implementations located in {@link 
 * de.ubt.ai1.supermod.service.generic.client.impl}. These services realize
 * client operations which are independent of a specific product or version
 * dimension type.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	31.07.2014
 */
public class SuperModGenericClientModule extends AbstractModule {

	/* (non-Javadoc)
	 * @see com.google.inject.AbstractModule#configure()
	 */
	@Override
	protected void configure() {
		bind(IAmbitionCorrectionService.class)
				.to(GenericSuppressiveAmbitionCorrectionService.class);
		bind(IProductConflictReporter.class)
				.to(GenericDialogProductConflictReporter.class);
		bind(IWriteSetConflictReporter.class)
				.to(GenericDialogWriteSetConflictReporter.class);
		bind(ILocalRepositoryInitializationService.class)
				.to(GenericLocalRepositoryInitializationService.class);
		bind(ILocalChoiceInitializationService.class)
				.to(GenericLocalChoiceInitializationService.class);
		bind(ILocalAmbitionInitializationService.class)
				.to(GenericLocalAmbitionInitializationService.class);
		bind(ILocalMetadataAdditionService.class)
				.to(GenericLocalMetadataAdditionService.class);
		bind(ILocalMetadataRemovalService.class)
				.to(GenericLocalMetadataRemovalService.class);
		bind(IWriteSetAnalysisService.class)
				.to(GenericWriteSetAnalysisService.class);
		bind(IWriteSetAssignmentService.class)
				.to(GenericSingleWriteSetAssignmentService.class);
		bind(IWriteSetPostProcessor.class)
				.to(GenericTransactionalWriteSetPostProcessor.class);
		bind(IVisibilityForestInitializationService.class)
				.to(GenericVisibilityForestInitializationService.class);
		bind(IVersionLabellingService.class)
				.to(GenericVersionLabellingService.class);
		bind(IClonePostProcessor.class)
				.to(GenericIdleClonePostProcessor.class);
		bind(IPullPostProcessor.class)
				.to(GenericIdlePullPostProcessor.class);
		bind(IPullPreProcessor.class)
				.to(GenericIdlePullPreProcessor.class);
		bind(IPushPostProcessor.class)
				.to(GenericIdlePushPostProcessor.class);
		bind(IPushPreProcessor.class)
				.to(GenericIdlePushPreProcessor.class);
		bind(ISharePostProcessor.class)
				.to(GenericIdleSharePostProcessor.class);
		bind(ICompositeAmbitionAndChoiceSpecificationService.class)
				.to(GenericCompositeAmbitionAndChoiceSpecificationService.class);
		bind(IWriteSetAffectedElementsCalculator.class)
				.to(GenericWriteSetAffectedElementsCalculator.class);
		bind(IDefaultResolver.class)
				.to(PseudoRandomDefaultResolver.class);
	}	

}
