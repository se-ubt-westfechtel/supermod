package de.ubt.ai1.supermod.adapters.famile.service;

import com.google.inject.ImplementedBy;

import de.ubt.ai1.supermod.adapters.famile.service.impl.VisibilityEvaluationService;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.OptionExpr;

/**
 * Algorithm that filters revision elements in given OptionExpr (=visibilities)
 * 
 * @author Alexander Zimmer
 * @date 2018-02-04
 *
 */
@ImplementedBy(VisibilityEvaluationService.class)
public interface IVisibilityEvaluationService {

	/**
	 * Algorithm to filter Revision elements out of given OptionExpr. Algorithm
	 * iterates over Abstract Syntax Tree of given OptionExpr and eliminates
	 * revision elements by logical evaluation. X and true -> X; X and false ->
	 * false X or true -> true; X and false -> X X xor true -> not X; X or false ->
	 * X
	 * 
	 * @param visibility
	 *            String that gets returned after recursive calls
	 * @param choice
	 *            current specified choice of user in order to evaluate revision
	 *            bindings
	 * @param expr
	 *            OptionExpr that gets evaluated
	 * @return Filtered visibility string without revision elements
	 */
	public String manageVisibilities(String visibility, OptionBinding choice, OptionExpr expr);

	/**
	 * Method to create a legal FeatureExpression String in FAMILE format. Called
	 * recursively.
	 * 
	 * @param String
	 *            gets recursively created
	 * @param current
	 *            OptionExpr which visibility gets transformed to String
	 * @return String representation of given OptionExpr
	 */
	public String customToString(String visibility, OptionExpr expr);

	/**
	 * Method to check if an OptionExpr contains revisions
	 * 
	 * @param expr
	 *            to be checked OptionEpxr
	 * @return 'true' if contains revision, 'false' if no revision available
	 */
	public boolean containsRevisions(OptionExpr expr);
}
