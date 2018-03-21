/**
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package de.ubt.ai1.supermod.mm.core.impl;

import org.eclipse.emf.ecore.EClass;

import de.ubt.ai1.supermod.mm.core.BigAndExpr;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.OptionExpr;
import de.ubt.ai1.supermod.mm.core.SuperModCoreFactory;
import de.ubt.ai1.supermod.mm.core.SuperModCorePackage;
import de.ubt.ai1.supermod.mm.core.Tristate;
import de.ubt.ai1.supermod.mm.core.util.TristateUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Big And Expr</b></em>'.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2015-09-07
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class BigAndExprImpl extends BigExprImpl implements BigAndExpr {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BigAndExprImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModCorePackage.Literals.BIG_AND_EXPR;
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.mm.core.impl.OptionExprImpl#apply(de.ubt.ai1.supermod.mm.core.OptionBinding)
	 */
	@Override
	public Tristate apply(OptionBinding binding) {
		Tristate t = Tristate.TRUE;
		for (OptionExpr expr : getChildren()) {
			t = TristateUtil.and(t, expr.apply(binding));
		}
		return t;
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.mm.core.impl.OptionExprImpl#extract()
	 */
	@Override
	public OptionExpr extract() {
		BigAndExpr extracted = SuperModCoreFactory.eINSTANCE.createBigAndExpr();
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
		return "AND " + getChildren().toString();
	}

} //BigAndExprImpl
