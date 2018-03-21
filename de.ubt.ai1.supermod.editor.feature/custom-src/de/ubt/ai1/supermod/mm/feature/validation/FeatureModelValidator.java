/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.feature.validation;

import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.validation.model.EvaluationMode;
import org.eclipse.emf.validation.model.IConstraintStatus;
import org.eclipse.emf.validation.service.IBatchValidator;
import org.eclipse.emf.validation.service.ModelValidationService;

/**
 * A specialization of the EObjectValidator specific to the feature model
 * validation.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	09.09.2015
 */
public class FeatureModelValidator extends EObjectValidator {
	
	private final IBatchValidator batchValidator;
	
	public FeatureModelValidator() {
		super();
        batchValidator = (IBatchValidator) ModelValidationService
        		.getInstance().newValidator(EvaluationMode.BATCH);
        batchValidator.setIncludeLiveConstraints(true);
        batchValidator.setReportSuccesses(false);
    }
	
	public boolean validate(EObject eObject, DiagnosticChain diagnostics,
            Map<Object, Object> context) {
        return validate(eObject.eClass(), eObject, diagnostics, context);
    }
	
	public boolean validate(EClass eClass, EObject eObject,
            DiagnosticChain diagnostics, Map<Object, Object> context) {
        super.validate(eClass, eObject, diagnostics, context);
        
        IStatus status = Status.OK_STATUS;
        
        if (diagnostics != null) {
            if (!hasProcessed(eObject, context)) {
                status = batchValidator.validate(
                    eObject,
                    new NullProgressMonitor());
                
                processed(eObject, context, status);
                
                appendDiagnostics(status, diagnostics);
            }
        }
        
        return status.isOK();
    }
	
	private void processed(EObject eObject, Map<Object, Object> context, IStatus status) {
        if (context != null) {
            context.put(eObject, status);
        }
    }
    
    private boolean hasProcessed(EObject eObject, Map<Object, Object> context) {
        boolean result = false;
        
        if (context != null) {
            while (eObject != null) {
                if (context.containsKey(eObject)) {
                    result = true;
                    eObject = null;
                } else {
                    eObject = eObject.eContainer();
                }
            }
        }
        
        return result;
    }
    
    private void appendDiagnostics(IStatus status, DiagnosticChain diagnostics) {
        if (status.isMultiStatus()) {
            IStatus[] children = status.getChildren();
            
            for (int i = 0; i < children.length; i++) {
                appendDiagnostics(children[i], diagnostics);
            }
        } else if (status instanceof IConstraintStatus) {
            diagnostics.add(new BasicDiagnostic(
                status.getSeverity(),
                status.getPlugin(),
                status.getCode(),
                status.getMessage(),
                ((IConstraintStatus) status).getResultLocus().toArray()));
        }
    }

}