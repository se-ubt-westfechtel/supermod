/**
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package de.ubt.ai1.supermod.mm.core.impl;

import org.eclipse.emf.ecore.EClass;

import de.ubt.ai1.supermod.mm.core.BigXorExpr;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.OptionExpr;
import de.ubt.ai1.supermod.mm.core.SuperModCoreFactory;
import de.ubt.ai1.supermod.mm.core.SuperModCorePackage;
import de.ubt.ai1.supermod.mm.core.Tristate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Big Xor Expr</b></em>'.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2015-09-07
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class BigXorExprImpl extends BigExprImpl implements BigXorExpr {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BigXorExprImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModCorePackage.Literals.BIG_XOR_EXPR;
	}
	
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.mm.core.impl.OptionExprImpl#apply(de.ubt.ai1.supermod.mm.core.OptionBinding)
	 */
	@Override
	public Tristate apply(OptionBinding binding) {
		int nTrue = 0;
		int nUnknown = 0;
		int nFalse = 0;
		for (OptionExpr expr : getChildren()) {
			switch (expr.apply(binding)) {
			case TRUE: nTrue++; break;
			case UNKNOWN: nUnknown++; break;
			case FALSE: nFalse++; break;
			}
		}
		int n = nTrue + nUnknown + nFalse;
		if (nTrue > 1 || nFalse == n) return Tristate.FALSE;
		if (nTrue == 1 && nUnknown == 0) return Tristate.TRUE;
		return Tristate.UNKNOWN;
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.mm.core.impl.OptionExprImpl#extract()
	 */
	@Override
	public OptionExpr extract() {
		BigXorExpr extracted = SuperModCoreFactory.eINSTANCE.createBigXorExpr();
		for (OptionExpr expr : getChildren()) {
			extracted.getChildren().add(expr.extract());
		}
		return extracted;
	}
	
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.mm.core.impl.OptionExprImpl#toString()
	 */
	@Override
	public String toString() {
		return "XOR " + getChildren().toString();
	}

} //BigXorExprImpl
