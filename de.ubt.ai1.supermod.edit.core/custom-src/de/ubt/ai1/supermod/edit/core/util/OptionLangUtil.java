/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.edit.core.util;

import java.io.StringReader;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.linking.ILinker;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.IParser;
import org.eclipse.xtext.resource.impl.ListBasedDiagnosticConsumer;
import org.eclipse.xtext.serializer.ISerializer;

import com.google.inject.Binder;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Provider;

import de.ubt.ai1.supermod.mm.core.OptionExpr;
import de.ubt.ai1.supermod.mm.core.VersionSpace;
import de.ubt.ai1.supermod.oel.OptionLangRuntimeModule;

/**
 * Utility methods for the representation, parsing and linking of
 * SuperMod option expressions, based on their textual representation
 * which is defined in the OEL plugin:
 * <code>de.ubt.ai1.supermod.text.oel</code>. 
 * 
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 */
public class OptionLangUtil {
	
	/**
	 * Creates a Guice injector which provides the suitable service
	 * implementations for working with option expressions in the
	 * specified version space.
	 * 
	 * @param vs the version space to be used for option expressions.
	 * @return a Guice Injector from which service implementations
	 * 			suitable for the provided version space may be
	 * 			retrieved.
	 */
	public static Injector getInjector(final VersionSpace vs) {
		if (vs != null) {
			OptionLangRuntimeModule module = new OptionLangRuntimeModule() {
				@Override
				public void configure(Binder binder) {
					super.configure(binder);
					binder.bind(VersionSpace.class).toProvider(new Provider<VersionSpace>() {					
						@Override
						public VersionSpace get() {
							return vs;
						}
					});
				}
			};
			return Guice.createInjector(module);
		}
		return null;
	}
	
	/**
	 * Finds the suitable Xtext serializer for option expressions
	 * which refer to a specified version space.
	 * 
	 * @param vs the version space.
	 * @return the obtained serializer service.
	 */
	public static ISerializer getSerializer(VersionSpace vs) {
		if (vs != null) {
			return getInjector(vs).getInstance(ISerializer.class);
		}
		return null;
	}
	
	/**
	 * Finds the suitable Xtext parser for option expressions
	 * which refer to a specified version space.
	 * 
	 * @param vs the version space.
	 * @return the obtained parser service.
	 */
	public static IParser getParser(VersionSpace vs) {
		return getInjector(vs).getInstance(IParser.class);
	}	
	
	/**
	 * Finds the suitable Xtext linker for option expressions
	 * which refer to a specified version space.
	 * 
	 * @param vs the version space.
	 * @return the obtained linker service.
	 */
	public static ILinker getLinker(VersionSpace vs) {
		return getInjector(vs).getInstance(ILinker.class);
	}

	/**
	 * Obtains the suitable serializer for the specified version space and
	 * transforms a specified internally represented option expression
	 * into its textual representation.
	 * 
	 * @param optionExpr the option expression to serialize.
	 * @param vs the version space with respect to which option references
	 * 			shall be resolved.
	 * @return a textual representation, or <code>null</code>.
	 */
	public static String serialize(OptionExpr optionExpr, VersionSpace vs) {
		if (optionExpr != null && vs != null) {
			return getSerializer(vs).serialize(optionExpr);
		}
		return null;
	}
	
	/**
	 * Obtains the suitable parser for the specified version space and
	 * analyzes a specified textual representation of an option expression.
	 * The parse result returned by Xtext is yielded.
	 *
	 * @param string textual representation of the option expression.
	 * @param vs the version space.
	 * @return the parse result created by Xtext.
	 */
	public static IParseResult getParseResult(String string, VersionSpace vs) {
		return getParser(vs).parse(new StringReader(string));
	}
	
	/**
	 * Obtains the suitable parser for the specified version space and
	 * analyzes a specified textual representation of an option expression.
	 * Converts the expression into its internal SuperMod representation.
	 * 
	 * @param string textual representation of the option expression.
	 * @param vs the version space.
	 * @return the internal option expression representation, if parsing
	 * 			was successful, or <code>null</code>.
	 */
	public static OptionExpr parse(String string, VersionSpace vs) {
		IParseResult result = getParseResult(string, vs);
		if (result != null && !result.getSyntaxErrors().iterator().hasNext()) {
			EObject obj = result.getRootASTElement();
			if (obj instanceof OptionExpr) {
				return (OptionExpr) obj;
			}
		}
		return null;
	}
	
	/**
	 * Obtains the suitable linker for the specified version space and
	 * resolves Xtext cross-references within the specified expression
	 * with respect to the specified version space.
	 * 
	 * @param expr the option expression where to resolve cross-references
	 * 			using the Xtext linker.
	 * @param vs the version space to resolve cross-references with.
	 */
	public static void link(OptionExpr expr, VersionSpace vs) {
		getLinker(vs).linkModel(expr, new ListBasedDiagnosticConsumer());
	}

}
